package com.yhx.pattern.aoptest;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Optional;
import java.util.logging.Logger;

/**
 * @author: shipeng.yu
 * @time: 2017年01月10日 下午7:25
 * @version: 1.0
 * @since: 1.0
 * @description:
 */
public class UserHandler extends MyHandler<IUserLogic> {

    private static final Logger LOGGER = Logger.getLogger("userHandler");

    private IUserLogic userLogic;

    UserHandler(IUserLogic userLogic) {
        super(userLogic);
        this.userLogic = userLogic;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (userLogic != null) {
            Class<?> aClass = Class.forName(userLogic.getClass().getName());
            Annotation[] annotations = aClass.getAnnotations();
            Optional<Annotation> any =
                    Arrays.stream(annotations).filter(a -> (a instanceof AOP)).findAny();

            // 如果有该注解,则进行进一步判断
            if (any.isPresent()) {

                AOP aop = (AOP) any.get();

                boolean log = aop.log();

                if (log) {
                    LOGGER.info("开始访问" + method.getName());
                }

                boolean checkAuth = aop.checkAuth();

                String methodName = method.getName();

                // 检测用户名密码是否匹配
                boolean x = getMethodResult(args, checkAuth, methodName);

                if (!x)
                    return false;
            }
        }

        return method.invoke(userLogic, args);
    }

    private boolean getMethodResult(Object[] args, boolean checkAuth, String methodName) {

        if (checkAuth) {
            // 判断是否是修改名称的方法
            if (("rename").equals(methodName)) {
                // 获取用户名、密码
                String username = (String) args[0];
                String password = (String) args[1];

                if ("yhx".equals(username) && "123456".equals(password)) {
                    LOGGER.info("登录成功");
                    return true;
                } else {
                    LOGGER.info("验证失败");
                    return false;
                }
            }
        }
        return false;
    }
}

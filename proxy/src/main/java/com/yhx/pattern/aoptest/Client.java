package com.yhx.pattern.aoptest;

/**
 * @author: shipeng.yu
 * @time: 2017年01月10日 下午7:19
 * @version: 1.0
 * @since: 1.0
 * @description:
 */
public class Client {

    public static void main(String[] args) {

        IUserLogic userLogic = new UserLogic();

        IUserLogic userProxy = UserProxy.getInstance(userLogic);

        String username = "yhax";
        String password = "123456";

        boolean rename = userProxy.rename(username, password);

        if (rename)
            System.out.println("成功修改用户名称");
        else
            System.out.println("修改失败");
    }

}

package com.yhx.pattern.aoptest;

/**
 * @author: shipeng.yu
 * @time: 2017年01月10日 下午7:28
 * @version: 1.0
 * @since: 1.0
 * @description:
 */
@AOP(checkAuth = true, log = true, effectedMethod = "rename")
public class UserLogic implements IUserLogic {

    public boolean rename(String username, String password) {

        System.out.println("用户名密码验证成功,接着就做一些不可描述的事情");

        return true;
    }
}

package com.yhx.pattern.force;

/**
 * @author: shipeng.yu
 * @time: 2017年01月08日 下午2:11
 * @version: 1.0
 * @since: 1.0
 * @description:
 */
public class GamePlayer implements IGamePlayer {

    private String name = "";

    private IGamePlayer proxy;

    public GamePlayer(String name) {
        this.name = name;
    }

    public void login(String name) {
        if (this.isProxy())
            System.out.println(name + " 登录游戏");
        else
            System.out.println("请指定你使用的代理");
    }

    public void killEnemy() {
        if (this.isProxy())
            System.out.println("kill enemy");
        else
            System.out.println("请使用指定的代理");
    }

    public void upgrade() {
        if (this.isProxy())
            System.out.println("upgrade");
        else
            System.out.println("请使用指定的代理");
    }

    public IGamePlayer getGamePlayerProxy() {
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }

    public boolean isProxy() {
        if (this.proxy == null)
            return false;
        else
            return true;
    }

}

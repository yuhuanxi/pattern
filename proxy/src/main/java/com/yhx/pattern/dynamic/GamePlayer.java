package com.yhx.pattern.dynamic;

/**
 * @author: shipeng.yu
 * @time: 2017年01月08日 下午3:40
 * @version: 1.0
 * @since: 1.0
 * @description:
 */
public class GamePlayer implements IGamePlayer {

    private String name;

    public GamePlayer(String name) {
        this.name = name;
    }

    public void login(String name, String pass) {
        System.out.println(name + "登录游戏");
    }

    public void killEnemy() {
        System.out.println(this.name + "击杀敌人");
    }

    public void upgrade() {
        System.out.println(this.name + "升级!");
    }
}

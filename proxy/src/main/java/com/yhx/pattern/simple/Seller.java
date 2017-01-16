package com.yhx.pattern.simple;

/**
 * @author: shipeng.yu
 * @time: 2017年01月07日 下午11:58
 * @version: 1.0
 * @since: 1.0
 * @description: 做微商的小伙伴
 */
public class Seller implements IMicroBusiness {

    private String name;

    public Seller(String name) {
        this.name = name;
    }

    public void purchases() {
        System.out.println(this.name + "开始进货");
    }

    public void sellGoods() {
        System.out.println(this.name + "开始售货");
    }

    public void castAccounts() {
        System.out.println(this.name + "开始统计账目");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

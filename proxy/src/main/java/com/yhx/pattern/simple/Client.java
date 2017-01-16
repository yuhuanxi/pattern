package com.yhx.pattern.simple;

/**
 * @author: shipeng.yu
 * @time: 2017年01月08日 上午12:04
 * @version: 1.0
 * @since: 1.0
 * @description: 客户端调用
 */
public class Client {

    public static void main(String[] args) {

        withOutProxy();

        withProxy();
    }

    public static void withOutProxy() {
        IMicroBusiness seller = new Seller("小明");
        seller.purchases();
        seller.sellGoods();
        seller.castAccounts();
    }

    public static void withProxy() {

        // 定义卖家小明
        IMicroBusiness seller = new Seller("小明");

        // 定义一个卖家代理
        IMicroBusiness proxySeller = new SellerProxy(seller);

        proxySeller.purchases();
        proxySeller.sellGoods();
        proxySeller.castAccounts();
    }
}

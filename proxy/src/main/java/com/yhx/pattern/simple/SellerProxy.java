package com.yhx.pattern.simple;

/**
 * @author: shipeng.yu
 * @time: 2017年01月08日 上午12:10
 * @version: 1.0
 * @since: 1.0
 * @description: 做微商的小伙伴找的代理
 */
public class SellerProxy implements IMicroBusiness, ISellerProxy {

    private IMicroBusiness business;

    public SellerProxy(IMicroBusiness business) {
        this.business = business;
    }

    public void purchases() {
        this.before();
        this.business.purchases();
    }

    public void sellGoods() {
        this.business.sellGoods();
    }

    public void castAccounts() {
        this.business.castAccounts();
        this.payment();
        this.end();
    }

    private void before() {
        System.out.println("开始代理");
    }

    public void payment() {
        System.out.println("作为代理,为你服务是要费用的,先收 10 块");
    }

    private void end() {
        System.out.println("代理结束");
    }
}

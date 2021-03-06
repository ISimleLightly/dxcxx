package com.vincent.lock.wr;

public class UseSynImpl implements GoodsService {

    private Goods goods;

    public UseSynImpl(Goods goods) {
        this.goods = goods;
    }

    @Override
    public synchronized Integer getGoodsNum() throws InterruptedException {
        Thread.sleep(5);
        return goods.getStoreNum();
    }

    @Override
    public synchronized void setGoodsNum(int num) throws InterruptedException {
        Thread.sleep(5);
        goods.setStoreNum(num);
    }
}

package org.example.transfer;

public abstract class PublicTMoney implements TMoney {

    protected int defaultMoney;
    protected int per;

    public PublicTMoney(int defaultMoney, int per) {
        this.defaultMoney = defaultMoney;
        this.per = per;
    }
}

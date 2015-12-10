package com.eugentaranets;

/**
 * Created by yevhenii on 10.12.15.
 */
public class Bank {

    BaseCalc baseCalc;

    public Bank(BaseCalc baseCalc) {
        this.baseCalc = baseCalc;
    }

    public float calculateDeposit(float a, float b, int koef) {
        return baseCalc.calculate(a, b) * koef;
    }

    public BaseCalc getBaseCalc() {
        return baseCalc;
    }

    public void setBaseCalc(BaseCalc baseCalc) {
        this.baseCalc = baseCalc;
    }
}

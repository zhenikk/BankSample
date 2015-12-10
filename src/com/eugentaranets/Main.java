package com.eugentaranets;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Bank bank = new Bank(new SimpleCaclulator());
        float simpleResult = bank.calculateDeposit(4, 5, 2);
        System.out.println("Simple calculator deposit =" + simpleResult);
        bank.setBaseCalc(new SuperCalculate());
        float superResult = bank.calculateDeposit(4, 5, 2);
        System.out.println("Super calculator deposit =" + superResult);


    }
}

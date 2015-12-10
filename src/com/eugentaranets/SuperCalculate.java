package com.eugentaranets;

/**
 * Created by yevhenii on 10.12.15.
 */
public class SuperCalculate extends BaseCalc{
    LibraryCalc libraryCalc;

    @Override
    float calculate(float a, float b) {
        libraryCalc = new LibraryCalc();
        return libraryCalc.superCalculate(a,b);
    }
}

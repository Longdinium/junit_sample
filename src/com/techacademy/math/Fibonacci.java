package com.techacademy.math;

public class Fibonacci {

    // フィボナッチ数列の第n項の数値を求める
    public Integer getNumber(Integer n) {
        Integer ret = 0;

        if(n == 1 || n == 2) {
            ret = 1;
        } else {
            ret = this.getNumber(n-1) + this.getNumber(n-2);
        }
        return ret;
    }

}

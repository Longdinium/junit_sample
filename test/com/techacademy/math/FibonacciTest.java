package com.techacademy.math;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FibonacciTest {

    @Test
    public void testGetNumber01() throws Exception{
        // (1) 事前準備
        Fibonacci sut = new Fibonacci();
        Integer expected = 1; // 期待値をexpectedという変数名で定義
        // (2) 実行
        Integer actual = sut.getNumber(1);
            // 戻り値（実測値）検証する場合は、actual という変数名で変数を定義し、
            // その変数にテストメソッドの戻り値を代入している
        // (3) 検証
        assertEquals(expected, actual);
    }

    @Test
    public void testGetNumber02() throws Exception{
        Fibonacci sut = new Fibonacci();
        Integer expected = 1;

        Integer actual = sut.getNumber(2);

        assertEquals(expected, actual);
    }

    @Test
    public void testGetNumber03() throws Exception{
        Fibonacci sut = new Fibonacci();
        Integer expected = 2;

        Integer actual = sut.getNumber(3);

        assertEquals(expected, actual);
    }

}

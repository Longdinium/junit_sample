package com.techacademy.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LeapYearTest {

    @Test
    @DisplayName("n=4のとき「うるう年」ですと表示される")
    public void testGetYear01() throws Exception{
        // (1) 事前準備
        LeapYear sut = new LeapYear();
        boolean expected = true; // 期待値はtrue
        // (2) 実行
        boolean actual = sut.getYear(4);
        // (3) 検証
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("n=100のとき「平年」ですと表示される")
    public void testGetYear02() throws Exception{

        LeapYear sut = new LeapYear();
        boolean expected = false;

        boolean actual = sut.getYear(100);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("n=400のとき「うるう年」ですと表示される")
    public void testGetYear03() throws Exception{
        LeapYear sut = new LeapYear();
        boolean expected = true;

        boolean actual = sut.getYear(400);

        assertEquals(expected, actual);
    }

}

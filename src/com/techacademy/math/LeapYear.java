package com.techacademy.math;

public class LeapYear {

    // 西暦n年がうるう年かどうかを判定する
    public boolean getYear(Integer n) {
        if(n % 4 == 0) {
            if(n % 100 == 0) {
                if(n % 400 == 0) {
                    System.out.println(n + "年は「うるう年」です");
                    return true;
                }
                System.out.println(n + "年は「平年」です");
                return false;
            }
            System.out.println(n + "年は「うるう年」です");
            return true;
        } else {
            System.out.println(n + "年は「平年」です");
            return false;
        }
    }




}

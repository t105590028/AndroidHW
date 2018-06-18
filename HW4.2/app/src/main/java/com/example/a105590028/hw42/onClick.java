package com.example.a105590028.hw42;

public class onClick {
    String onClick(int iComPlay){
        if(iComPlay == 1){
            return "剪刀";
        }
        else if(iComPlay == 2){
            return "石頭";
        }
        else if(iComPlay == 3){
            return "布";
        }
        return "error";
    }
}

package com.Skib;

import com.birdbrain.Finch;

public class test {
    public static void main(String[] args) {
        Finch myFinch = new Finch();

        myFinch.setTurn("L", 720, 100);

        myFinch.stopAll();
        myFinch.disconnect();
    }
}
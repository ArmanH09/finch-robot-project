package com.Skib;

import com.birdbrain.Finch;

public class test {
    public static void main(String[] args) {
        Finch myFinch = new Finch();
            
        /* int[] arr = {1, 0, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1};
         myFinch.setDisplay(arr); */

         String message = "JOSH";

         String[] array = message.split("");
        for (int i = 0; i < array.length; i++) {
            myFinch.print(array[i]);
            myFinch.pause(0.5);
        }
        myFinch.pause(2.0);
        myFinch.stopAll();
        myFinch.disconnect();
    }
}
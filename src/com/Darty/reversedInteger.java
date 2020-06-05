//package com.Darty;
//
//public class reversedInteger {
//    public int reverse(int input) {
//        long reversed = 0;
//        while (input != 0) {
//            reversed = reversed * 10 + input % 10;
//            input /= 10;
//            if (reversed > Integer.MAX_VALUE
//                    || reversed < Integer.MIN_VALUE) {
//                return 0;
//            }
//        }
//        return input; // i'm not sure about this return
//    }
//}
////Reverse integer without a library
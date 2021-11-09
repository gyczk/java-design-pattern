package com.simplefanc.design.structural.adapter.ACToDC;

public class Main {

    public static void main(String[] args) {
        int dc5 = new PowerAdapter().outputDC5();
        System.out.println("输出：" + dc5 + "V的直流电");
    }
}

package com.simplefanc.design.behavioral.interpreter;


public class Main {
    public static void main(String[] args) {
        String inputStr = "6 100 11 + *";//666
        MyExpressionParser expressionParser = new MyExpressionParser();
        int result = expressionParser.parse(inputStr);
        System.out.println("解释器计算结果：" + result);
    }
}

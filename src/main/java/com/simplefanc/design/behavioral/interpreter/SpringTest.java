package com.simplefanc.design.behavioral.interpreter;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpringTest {
    public static void main(String[] args) {
        // Sping expression language
        ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("100*2+400*1+66");
        System.out.println(expression.getValue());
    }
}

package com.design.patterns.designpatterns.interpreter;

/**
 * SQL解释器
 */
public abstract class SQLExpression {

    abstract String interpret(Context context);

}

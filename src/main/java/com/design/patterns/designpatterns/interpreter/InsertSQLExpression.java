package com.design.patterns.designpatterns.interpreter;

import java.util.Map;

/**
 * insert SQL解释器
 */
public class InsertSQLExpression extends SQLExpression{
    @Override
    public String interpret(Context context) {
        StringBuffer insert = new StringBuffer();
        insert.append("insert into ").append(context.getTableName());

        StringBuffer keys = new StringBuffer();
        StringBuffer values = new StringBuffer();

        keys.append("(");
        values.append("(");
        Map<String, Object> params = context.getParams();
        for (String key : params.keySet()) {
            keys.append(key).append(",");
            values.append(params.get(key)).append(",");
        }
        keys = keys.replace(keys.length() - 1, keys.length(), ")");
        values = values.replace(values.length() - 1, values.length(), ")");

        //拼接sql
        insert.append(keys).append(" values ").append(values);

        System.out.println("Insert SQL : " + insert.toString());
        return insert.toString();
    }
}

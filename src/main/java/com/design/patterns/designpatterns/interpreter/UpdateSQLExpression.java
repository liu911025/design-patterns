package com.design.patterns.designpatterns.interpreter;

import java.util.Map;

/**
 * update解释器
 */
public class UpdateSQLExpression extends SQLExpression {
    @Override
    String interpret(Context context) {
        StringBuffer update = new StringBuffer();
        update.append("update ").append(context.getTableName()).append(" set ");

        Map<String, Object> params = context.getParams();
        StringBuffer values = new StringBuffer();
        for (String key : params.keySet()) {
            values.append(key).append("=").append(params.get(key)).append(",");
        }
        //values.substring(0, values.length()-1);

        Map<String, Object> wheres = context.getWheres();
        StringBuffer condition = new StringBuffer();
        condition.append(" where 1=1 ");
        for (String key : wheres.keySet()) {
            condition.append("and ").append(key).append("=").append(wheres.get(key));
        }
        update.append(values.substring(0, values.length()-1)).append(condition);

        System.out.println("Update SQL : " + update.toString());
        return update.toString();
    }
}

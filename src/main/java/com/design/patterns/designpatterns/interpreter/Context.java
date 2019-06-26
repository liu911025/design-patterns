package com.design.patterns.designpatterns.interpreter;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Context {

    private String tableName;       // 数据库名

    private Map<String, Object> params = new HashMap<>();   //修改时更新后的数据

    private Map<String, Object> wheres = new HashMap<>();   //where语句后面的条件
}

package com.design.patterns.designpatterns.memento;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * 备份 （充当备忘录角色）
 */
@Data
@ToString
@AllArgsConstructor
public class AppBackup {

    private App app;

}

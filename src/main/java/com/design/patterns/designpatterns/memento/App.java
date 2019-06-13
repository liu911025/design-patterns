package com.design.patterns.designpatterns.memento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
class App {
    private String content;
    private String version;
}
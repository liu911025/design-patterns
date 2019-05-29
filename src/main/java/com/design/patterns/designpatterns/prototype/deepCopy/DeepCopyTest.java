package com.design.patterns.designpatterns.prototype.deepCopy;

public class DeepCopyTest {

    public static void main(String[] args) {
        Age age = new Age(22);
        Student student = new Student("小南", age);

        // 深拷贝
        Student stu1 = student.clone();
        System.out.println(student == stu1);

        age.setAge(23);
        System.out.println(student.toString());
        System.out.println(stu1.toString());
    }

}

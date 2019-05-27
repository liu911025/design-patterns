package com.design.patterns.designpatterns.factory.abstractFactory;

import javax.swing.*;
import java.awt.*;

public class Vegetables implements Plant {

    JScrollPane sp;
    JFrame jf=new JFrame("抽象工厂模式测试");

    public Vegetables() {
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(1, 1));
        jPanel.setBorder(BorderFactory.createTitledBorder("牛 🐮"));
        sp = new JScrollPane(jPanel);

        Container contentPane = jf.getContentPane();
        contentPane.add(sp, BorderLayout.CENTER);

        String path = System.getProperty("user.dir");
        JLabel l1=new JLabel(new ImageIcon(path + "\\src\\main\\resources\\static\\images\\P_Vegetables.jpg"));
        jPanel.add(l1);
        jf.pack();
        jf.setVisible(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//用户点击窗口关闭
    }

    @Override
    public void show() {

    }
}

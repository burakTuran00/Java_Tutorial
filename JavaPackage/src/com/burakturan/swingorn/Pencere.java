package com.burakturan.swingorn;

import javax.swing.*;

public class Pencere
{
    private JFrame jFrame;

    public Pencere()
    {
        jFrame = new JFrame();
        JButton button = new JButton("Click");
        button.setBounds(130,100,100,40);
        jFrame.add(button);

        jFrame.setSize(400,500);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }
}

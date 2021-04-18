package com.HR;

import com.HR.ui.MainUI;

import javax.swing.*;
import java.awt.*;


public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                makeGUI();
            }
        });
    }

    private static void makeGUI(){
        int WIDTH=800;
        int HEIGHT=WIDTH/12*9;
        MainUI ui=new MainUI();
        JPanel root=ui.getRootPanel();
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(WIDTH,HEIGHT));
        frame.setMaximumSize(new Dimension(WIDTH,HEIGHT));
        frame.setMinimumSize(new Dimension(WIDTH,HEIGHT));
        frame.setResizable(false);
        frame.setContentPane(root);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

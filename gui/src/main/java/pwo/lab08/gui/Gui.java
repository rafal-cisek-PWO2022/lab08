package pwo.lab08.gui;

import javax.swing.*;

import pwo.lab08.engine.Engine;

class Gui {
    public static void main(String args[]) {
        JFrame frame = new JFrame(Engine.getVersion());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}

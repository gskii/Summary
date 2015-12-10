package ru.ncedu.gorbatovskiy.gui.hometask1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class JAboutPanel extends JPanel {
    private JTextArea aboutTextArea;
    private Model model;

    public JAboutPanel(LayoutManager layout, Model model) {
        super(layout);
        this.model = model;
        aboutTextArea = new JTextArea();
        add(new JLabel("О себе"), BorderLayout.NORTH);
        add(new JScrollPane(aboutTextArea), BorderLayout.CENTER);
        aboutTextArea.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                model.setAbout(aboutTextArea.getText());
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
    }
}

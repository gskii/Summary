package ru.ncedu.gorbatovskiy.gui.hometask1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JAboutPanel extends JPanel implements ActionListener {
    private JTextArea aboutTextArea;
    private Model model;

    public JAboutPanel(LayoutManager layout, Model model) {
        super(layout);
        this.model = model;
        aboutTextArea = new JTextArea();
        add(new JLabel("О себе"), BorderLayout.NORTH);
        add(new JScrollPane(aboutTextArea), BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

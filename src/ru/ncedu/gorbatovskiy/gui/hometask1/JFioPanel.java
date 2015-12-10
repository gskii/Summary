package ru.ncedu.gorbatovskiy.gui.hometask1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by gorbatovskiy on 09.12.15.
 */
public class JFioPanel extends JPanel {
    private JTextField middleName;
    private JTextField firstName;
    private JTextField lastName;
    private Model model;

    public JFioPanel(LayoutManager layout, Model model) {
        super(layout);
        lastName = new JTextField(model.getLastName());
        firstName = new JTextField(model.getFirstName());
        middleName = new JTextField(model.getMiddleName());
        JPanel fioLabelsPane = new JPanel(new GridLayout(0, 1, 0, 5));
        JPanel fioFieldsPane = new JPanel(new GridLayout(0, 1, 0, 5));
        fioLabelsPane.add(new JLabel("Фамилия "));
        fioLabelsPane.add(new JLabel("Имя "));
        fioLabelsPane.add(new JLabel("Отчество "));
        fioFieldsPane.add(lastName);
        fioFieldsPane.add(firstName);
        fioFieldsPane.add(middleName);
        add(fioLabelsPane, BorderLayout.WEST);
        add(fioFieldsPane, BorderLayout.CENTER);

        lastName.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                model.setLastName(lastName.getText());
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });

        firstName.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                model.setFirstName(firstName.getText());
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });

        middleName.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                model.setMiddleName(middleName.getText());
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

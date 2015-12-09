package ru.ncedu.gorbatovskiy.gui.hometask1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by gorbatovskiy on 09.12.15.
 */
public class JFioPanel extends JPanel implements ActionListener {
    private JTextField middleName;
    private JTextField firstName;
    private JTextField lastName;
    private Model model;

    public JFioPanel(LayoutManager layout, Model model) {
        super(layout);
        lastName = new JTextField();
        firstName = new JTextField();
        middleName = new JTextField();
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
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

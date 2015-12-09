package ru.ncedu.gorbatovskiy.gui.hometask1;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by gorbatovskiy on 09.12.15.
 */
public class JDatePanel extends JPanel implements ActionListener {
    private JSpinner daySpinner;
    private JSpinner yearSpinner;
    private JComboBox<String> monthComboBox;
    private String[] months = {
            "Января",
            "Февраля",
            "Марта",
            "Апреля",
            "Мая",
            "Июня",
            "Июля",
            "Августа",
            "Сентября",
            "Октября",
            "Ноября",
            "Декабря"
    };


    public JDatePanel(LayoutManager layout, Model model) {
        super(layout);

        daySpinner = new JSpinner(new SpinnerNumberModel(1, 1, 31, 1));
        yearSpinner = new JSpinner(new SpinnerNumberModel(2015, 1900, 2015, 1));
        monthComboBox = new JComboBox<>(months);
        monthComboBox.setBorder(new EmptyBorder(0, 5, 0, 5));

        JPanel dateFieldsPane = new JPanel(new BorderLayout());
        dateFieldsPane.add(daySpinner, BorderLayout.WEST);
        dateFieldsPane.add(yearSpinner, BorderLayout.EAST);
        dateFieldsPane.add(monthComboBox, BorderLayout.CENTER);

        add(new JLabel("Дата рождения "), BorderLayout.WEST);
        add(dateFieldsPane, BorderLayout.CENTER);
        setBorder(new EmptyBorder(10, 0, 10, 0));
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

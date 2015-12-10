package ru.ncedu.gorbatovskiy.gui.hometask1;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Calendar;

/**
 * Created by gorbatovskiy on 09.12.15.
 */
public class JDatePanel extends JPanel {
    private JComboBox monthComboBox;
    private JSpinner daySpinner;
    private JSpinner yearSpinner;
    private Calendar date;
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

        date = model.getBirthDate();
        if (date == null) date = Calendar.getInstance();

        daySpinner = new JSpinner(new SpinnerNumberModel(1, 1, 31, 1));
        yearSpinner = new JSpinner(new SpinnerNumberModel(1900, 1900, date.get(Calendar.YEAR), 1));
        monthComboBox = new JComboBox<>(months);
        monthComboBox.setBorder(new EmptyBorder(0, 5, 0, 5));

        daySpinner.setValue(date.get(Calendar.DAY_OF_MONTH));
        yearSpinner.setValue(date.get(Calendar.YEAR));
        monthComboBox.setSelectedIndex(date.get(Calendar.MONTH));

        JPanel dateFieldsPane = new JPanel(new BorderLayout());
        dateFieldsPane.add(daySpinner, BorderLayout.WEST);
        dateFieldsPane.add(yearSpinner, BorderLayout.EAST);
        dateFieldsPane.add(monthComboBox, BorderLayout.CENTER);

        add(new JLabel("Дата рождения "), BorderLayout.WEST);
        add(dateFieldsPane, BorderLayout.CENTER);
        setBorder(new EmptyBorder(10, 0, 10, 0));

        daySpinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                date.set(Calendar.DAY_OF_MONTH, (int) daySpinner.getValue());
                model.setBirthDate(date);
            }
        });

        yearSpinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                date.set(Calendar.YEAR, (int) yearSpinner.getValue());
                model.setBirthDate(date);
            }
        });

        monthComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                date.set(Calendar.MONTH, monthComboBox.getSelectedIndex());
                model.setBirthDate(date);
            }
        });

    }

}

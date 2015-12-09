package ru.ncedu.gorbatovskiy.gui.hometask1;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by gorbatovskiy on 09.12.15.
 */
public class JKnowledgeTable extends JPanel implements ActionListener {
    private Object[][] data = {
            {"Идеальное", false, false, false, false},
            {"Хорошее", false, false, false, false},
            {"Среднее", false, false, false, false},
            {"Знаком", false, false, false, false},
            {"Не знаком", false, false, false, false}};
    private Object[] columnNames =
            {"Знание", "Java", "Swing", "SQL", "Проектрирование"};

    private JTable table;
    private Model model;

    public JKnowledgeTable(LayoutManager layout, Model model) {
        super(layout);
        this.model = model;
        table = new JTable(new DefaultTableModel(data, columnNames)) {

            @Override
            public Class getColumnClass(int column) {
                return getValueAt(0, column).getClass();
            }
        };
        table.setPreferredScrollableViewportSize(table.getPreferredSize());
        add(new JScrollPane(table));
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

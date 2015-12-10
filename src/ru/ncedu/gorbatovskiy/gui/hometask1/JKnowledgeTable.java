package ru.ncedu.gorbatovskiy.gui.hometask1;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by gorbatovskiy on 09.12.15.
 */
public class JKnowledgeTable extends JPanel {
    private Object[][] data;
    private Object[] columnNames;
    private JTable table;

    public JKnowledgeTable(LayoutManager layout, Model model) {
        super(layout);
        fill(model);
        table = new JTable(new DefaultTableModel(data, columnNames)) {
            @Override
            public Class getColumnClass(int column) {
                return getValueAt(0, column).getClass();
            }
        };
        table.setPreferredScrollableViewportSize(table.getPreferredSize());
        add(new JScrollPane(table));


        table.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int namePosition = table.getSelectedColumn();
                int valuePosition = table.getSelectedRow();
                for (int i = 0; i < 5; i++) {
                    if (i == valuePosition) continue;
                    table.setValueAt(false, i, namePosition);
                }
                // вычитаем единицу по причине присутствия наименования оценок в таблице
                model.getKnowledges().getValues()[namePosition - 1] = KnowledgeLevel.values()[valuePosition];
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
    }

    /**
     * Построено по принципу независимости от KnowledgeStore и KnowledgeLevel
     * Динамически заполняет таблицу данными
     * @param model - JavaBeen, имеющий ссылку knowledges на класс KnowledgeStore
     */
    private void fill(Model model) {
        KnowledgeStore knowledges = model.getKnowledges();
        String[] names = knowledges.getNames();                 // Массив наименований дисциплин
        Object[] values = knowledges.getValues();               // Массив оценок дисциплин
        KnowledgeLevel[] levels = KnowledgeLevel.values();      // Массив названий оценок

        columnNames = new Object[names.length + 1];             // Знание, Наименование1, ...
        columnNames[0] = "Знание";
        System.arraycopy(names, 0, columnNames, 1, names.length);

        data = new Object[levels.length][values.length + 1];    // Формируем оценочную колонку
        for (int i = 0; i < data.length; i++) {                 // и заполняем оставшееся пространство false
            data[i][0] = levels[i].toString();
            for (int j = 1; j < data[i].length; j++) {
                data[i][j] = false;
            }
        }

        for (int i = 0; i < values.length; i++) {               // Выставляем известные флажки оценок
            for (int j = 0; j < levels.length; j++) {
                if (levels[j].equals(values[i])) {
                    data[j][i + 1] = true;
                }
            }
        }
    }


}

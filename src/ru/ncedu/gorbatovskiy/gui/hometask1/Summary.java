package ru.ncedu.gorbatovskiy.gui.hometask1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by gorbatovskiy on 09.12.15.
 */
public class Summary extends JFrame {
    private Model model;

    public Summary() throws HeadlessException {
        super("Summary");
        model = new Model();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocation(100, 100);
        setSize(520, 400);
        JTabbedPane tabs = new JTabbedPane();
        tabs.setTabPlacement(SwingConstants.LEFT);
        add(tabs, BorderLayout.CENTER);

        JButton saveButton = new JButton("Сохранить");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                XMLParser.WriteToFile(model, "./weeee.xml");
            }
        });
        add(saveButton, BorderLayout.SOUTH);

        JPanel generalPane = new JGeneralPanel(new BorderLayout(), model);
        tabs.addTab("Основное", generalPane);
        tabs.addTab("Уровень знаний", new JKnowledgeTable(new BorderLayout(), model));
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Summary();
            }
        });
    }
}

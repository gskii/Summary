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

    public Summary(String path) {
        super("Summary");
        model = new Model();
        model = XMLParser.ReadFromFile(model, "./" + path);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocation(100, 100);
        setSize(520, 400);

        JTabbedPane tabs = new JTabbedPane();
        tabs.setTabPlacement(SwingConstants.LEFT);
        add(tabs, BorderLayout.CENTER);

        JPanel savePanel = new JPanel(new BorderLayout());
        JButton saveButton = new JButton("Сохранить");
        JTextField savePath = new JTextField("filename.xml");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                XMLParser.WriteToFile(model, "./" + savePath.getText());
            }
        });
        savePanel.add(saveButton, BorderLayout.EAST);
        savePanel.add(savePath, BorderLayout.CENTER);
        add(savePanel, BorderLayout.SOUTH);

        JPanel generalPane = new JGeneralPanel(new BorderLayout(), model);
        tabs.addTab("Основное", generalPane);
        tabs.addTab("Уровень знаний", new JKnowledgeTable(new BorderLayout(), model));
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Summary(args[0]);
            }
        });
    }
}

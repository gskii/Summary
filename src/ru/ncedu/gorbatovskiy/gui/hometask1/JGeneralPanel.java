package ru.ncedu.gorbatovskiy.gui.hometask1;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * Created by gorbatovskiy on 09.12.15.
 */
public class JGeneralPanel extends JPanel {
    private Model model;
    private JFioPanel fioPanel;
    private JDatePanel datePanel;
    private JAboutPanel aboutPanel;

    public JGeneralPanel(LayoutManager layout, Model model) {
        super(layout);
        this.model = model;
        setBorder(new EmptyBorder(10, 10, 10, 10));

        JPanel fioDatePane = new JPanel(new BorderLayout());
        fioDatePane.add(new JFioPanel(new BorderLayout(), model), BorderLayout.NORTH);
        fioDatePane.add(new JDatePanel(new BorderLayout(), model), BorderLayout.SOUTH);

        add(new JAboutPanel(new BorderLayout(), model), BorderLayout.CENTER);
        add(fioDatePane, BorderLayout.NORTH);
    }
}

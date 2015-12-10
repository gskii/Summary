package ru.ncedu.gorbatovskiy.gui.hometask1;

/**
 * Created by gorbatovskiy on 10.12.15.
 */
public class KnowledgeStore {
    private String[] names;
    private KnowledgeLevel[] values;

    public KnowledgeStore() {
        names = new String[]{"Java", "Swing", "SQL", "Проектрирование"};
        values = new KnowledgeLevel[names.length];
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public KnowledgeLevel[] getValues() {
        return values;
    }

    public void setValues(KnowledgeLevel[] values) {
        this.values = values;
    }
}

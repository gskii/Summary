package ru.ncedu.gorbatovskiy.gui.hometask1;

import java.util.Calendar;

/**
 * Created by gorbatovskiy on 09.12.15.
 */
public class Model {
    private String lastName;
    private String firstName;
    private String middleName;
    private String about;
    private Calendar birthDate;
    private KnowledgeLevel java;
    private KnowledgeLevel sql;
    private KnowledgeLevel swing;
    private KnowledgeLevel design;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Calendar getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Calendar birthDate) {
        this.birthDate = birthDate;
    }

    public KnowledgeLevel getJava() {
        return java;
    }

    public void setJava(KnowledgeLevel java) {
        this.java = java;
    }

    public KnowledgeLevel getSql() {
        return sql;
    }

    public void setSql(KnowledgeLevel sql) {
        this.sql = sql;
    }

    public KnowledgeLevel getSwing() {
        return swing;
    }

    public void setSwing(KnowledgeLevel swing) {
        this.swing = swing;
    }

    public KnowledgeLevel getDesign() {
        return design;
    }

    public void setDesign(KnowledgeLevel design) {
        this.design = design;
    }
}

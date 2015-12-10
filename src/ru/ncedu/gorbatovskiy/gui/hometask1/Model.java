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
    private KnowledgeStore knowledges;

    public Model() {
        lastName = "";
        firstName = "";
        middleName = "";
        about = "";
        birthDate = Calendar.getInstance();
        knowledges = new KnowledgeStore();
    }

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

    public KnowledgeStore getKnowledges() {
        return knowledges;
    }

    public void setKnowledges(KnowledgeStore knowledges) {
        this.knowledges = knowledges;
    }
}

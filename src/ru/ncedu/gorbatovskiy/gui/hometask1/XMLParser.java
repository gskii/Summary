package ru.ncedu.gorbatovskiy.gui.hometask1;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.StaxDriver;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by gorbatovskiy on 10.12.15.
 */
public class XMLParser {
    public static void WriteToFile(Model model, String path) {
        XStream xs = new XStream(new DomDriver());
        try {
            FileOutputStream fs = new FileOutputStream(path);
            xs.toXML(model, fs);
            fs.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Model ReadFromFile(Model model, String path) {
        XStream xs = new XStream(new DomDriver());
        try {
            FileInputStream fis = new FileInputStream(path);
            xs.fromXML(fis, model);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            return model;
        }

    }
}

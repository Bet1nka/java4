package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class FileController {
    public  void SAVER(User user) {

        String path = "C:\\Users\\Asus ROG Strix Scar\\IdeaProjects\\java4\\src\\main\\java\\org\\example\\humans"
                + user.getFIO()[0] + ".txt";
        try (FileWriter fileWriter = new FileWriter(path, true)){
            System.out.println("контакт успешно запсиан");
            fileWriter.write(user.toString());
            fileWriter.append("\n");
        }
        catch (IOException exception) {
            System.out.println("Ошибка работы с файлом");
        }
    }
}

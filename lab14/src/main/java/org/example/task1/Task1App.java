package org.example.task1;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task1App {

    public static final String FILE_NAME = "pet_info.txt";

    public static void main(String[] args) {
        File file = new File(FILE_NAME);

        Pet pet = new Pet(
                "Барсик",
                "Кот",
                "Британская короткошёрстная",
                3,
                "Серый полосатый",
                "Лосось в желе",
                "Ласковый, игривый, любит спать рядом с ноутбуком"
        );

        System.out.println("1. Создание файла с информацией о питомце...");
        createPetFile(file, pet.toFormattedString());

        System.out.println("2. Данные (свойства) созданного файла:");
        printFileInfo(file);

        System.out.println("3. Чтение и вывод информации из файла:");
        printFileContent(file);
    }

    public static void createPetFile(File file, String content) {
        try (BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8))) {
            writer.write(content);
            System.out.println("Файл успешно записан: " + file.getName());
        } catch (IOException e) {
            System.err.println("Ошибка при создании/записи файла: " + e.getMessage());
        }
    }

    public static void printFileInfo(File file) {
        if (!file.exists()) {
            System.out.println("Файл не найден!");
            return;
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        System.out.println("Имя файла:               " + file.getName());
        System.out.println("Относительный путь:      " + file.getPath());
        System.out.println("Абсолютный путь:         " + file.getAbsolutePath());
        System.out.println("Родительский каталог:    " + (file.getParent() != null ? file.getParent() : "Текущая папка"));
        System.out.println("Существует ли файл:      " + (file.exists() ? "Да" : "Нет"));
        System.out.println("Это обычный файл:        " + (file.isFile() ? "Да" : "Нет"));
        System.out.println("Это директория:          " + (file.isDirectory() ? "Да" : "Нет"));
        System.out.println("Скрытый файл:            " + (file.isHidden() ? "Да" : "Нет"));
        System.out.println("Доступен для чтения:     " + (file.canRead() ? "Да" : "Нет"));
        System.out.println("Доступен для записи:     " + (file.canWrite() ? "Да" : "Нет"));
        System.out.println("Доступен для выполнения: " + (file.canExecute() ? "Да" : "Нет"));
        System.out.println("Размер файла:            " + file.length() + " байт");
        System.out.println("Дата последней правки:   " + dateFormat.format(new Date(file.lastModified())));
    }

    public static String readFileContent(File file) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
        return sb.toString();
    }

    public static void printFileContent(File file) {
        String content = readFileContent(file);
        System.out.print(content);
    }
}

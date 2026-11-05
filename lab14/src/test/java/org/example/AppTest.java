package org.example;

import org.example.task1.Pet;
import org.example.task1.Task1App;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    private final String testFileName = "test_pet_info.txt";

    @AfterEach
    public void cleanup() {
        File file = new File(testFileName);
        if (file.exists()) {
            file.delete();
        }
    }

    @Test
    public void testPetData() {
        Pet pet = new Pet("Барсик", "Кот", "Британская", 3, "Серый", "Рыба", "Игривый");
        assertEquals("Барсик", pet.getName());
        assertEquals("Кот", pet.getSpecies());
        assertEquals("Британская", pet.getBreed());
        assertEquals(3, pet.getAge());
        assertEquals("Серый", pet.getColor());
        assertEquals("Рыба", pet.getFavoriteFood());
        assertEquals("Игривый", pet.getCharacter());
        assertTrue(pet.toFormattedString().contains("Барсик"));
    }

    @Test
    public void testFileCreationAndReading() {
        File file = new File(testFileName);
        Pet pet = new Pet("Шарик", "Собака", "Овчарка", 5, "Черный", "Мясо", "Преданный");

        Task1App.createPetFile(file, pet.toFormattedString());

        assertTrue(file.exists(), "Файл должен существовать");
        assertTrue(file.isFile(), "Должен являться файлом");
        assertTrue(file.length() > 0, "Размер файла должен быть больше 0");

        String content = Task1App.readFileContent(file);
        assertTrue(content.contains("Шарик"));
        assertTrue(content.contains("Собака"));
        assertTrue(content.contains("Овчарка"));
    }

    @Test
    public void testMainExecution() {
        assertDoesNotThrow(() -> Task1App.main(new String[]{}));
        File defaultFile = new File(Task1App.FILE_NAME);
        assertTrue(defaultFile.exists());
        if (defaultFile.exists()) {
            defaultFile.delete();
        }
    }
}

package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testFurnitureDefaultsAndOverrides() {
        Furniture furniture = new Furniture("Полка", "Сосна", 1500.0);
        assertEquals("Полка", furniture.getName());
        assertEquals("Сосна", furniture.getMaterial());
        assertEquals(1500.0, furniture.getPrice());
        assertEquals("Неизвестно", furniture.getPurpose());
    }

    @Test
    public void testTablePurposeOverride() {
        Table table = new Table("Компьютерный стол", "МДФ", 7500.0);
        assertEquals("Для работы", table.getPurpose());
    }

    @Test
    public void testChairPurposeOverride() {
        Chair chair = new Chair("Табурет", "Береза", 900.0);
        assertEquals("Для сидения", chair.getPurpose());
    }

    @Test
    public void testOverloadedUseMethods() {
        Furniture furniture = new Furniture("Диван", "Ткань", 20000.0);

        // 1) use() -> "Использую мебель"
        assertEquals("Использую мебель", furniture.use());

        // 2) use(String purpose) -> "Использую для " + purpose
        assertEquals("Использую для сна", furniture.use("сна"));

        // 3) use(int hours) -> "Использую " + hours + " часов"
        assertEquals("Использую 8 часов", furniture.use(8));
    }

    @Test
    public void testInheritedOverloadedMethodsInDerivedClasses() {
        Table table = new Table();
        assertEquals("Использую мебель", table.use());
        assertEquals("Использую для учебы", table.use("учебы"));
        assertEquals("Использую 4 часов", table.use(4));

        Chair chair = new Chair();
        assertEquals("Использую мебель", chair.use());
        assertEquals("Использую для отдыха", chair.use("отдыха"));
        assertEquals("Использую 2 часов", chair.use(2));
    }
}

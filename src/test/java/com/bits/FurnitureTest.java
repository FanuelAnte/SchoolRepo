/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.bits;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author user
 */
public class FurnitureTest {
//    
//    String code,
//        String name,
//        float unitPrice,
//        float quantity,
//        float length,
//        float width,
//        float height,
//        FurnitureType type
    
    @Test
    public void testDefaultAssignment() {
        Furniture furniture = new Furniture(
            "IkC", 
            "IKEA Cabinet", 
            400, 
            1, 
            20, 
            60, 
            20, 
            Furniture.FurnitureType.CABINET);
    
        var unit = furniture.getUnit();
        var productGroup = furniture.getProductGroup();
        
        assertEquals("ea", unit.getCode());
        assertEquals("Each", unit.getName());
        assertEquals("FUR", productGroup.getCode());
        assertEquals("Furniture", productGroup.getName());
    }
}

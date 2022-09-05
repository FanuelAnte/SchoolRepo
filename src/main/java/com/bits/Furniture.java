/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bits;

/**
 *
 * @author user
 */
public class Furniture extends Product {
    public enum FurnitureType {
        CHAIR,
        COUCH,
        DESK,
        CABINET,
    }
    private float length;
    private float width;
    private float height;
    private FurnitureType type;
    
    public Furniture () {    
    }
    
    
    public Furniture (
        String code,
        String name,
        float unitPrice,
        float quantity,
        float length,
        float width,
        float height,
        FurnitureType type
    ) {
        super(
            code, 
            name, 
            unitPrice, 
            quantity, 
            Unit.getByCode("ea"),
            ProductGroup.getByCode("FUR")
        );
        this.length = length;
        this.width = width;
        this.height = height;
    }

    /**
     * @return the length
     */
    public float getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(float length) {
        this.length = length;
    }

    /**
     * @return the width
     */
    public float getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(float width) {
        this.width = width;
    }

    /**
     * @return the height
     */
    public float getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * @return the type
     */
    public FurnitureType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(FurnitureType type) {
        this.type = type;
    }
}

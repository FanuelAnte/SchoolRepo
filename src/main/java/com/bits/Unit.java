/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bits;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author henock
 */
public class Unit {
    private String code;
    private String name;
    
    public Unit() {
    }
    
    public Unit(String code, String name) {
        if (Util.validateLength(code, 3)) {
            this.code = code;
            this.name = name;
        } else {
            String error = String.format("The code %s is invalid.", code);
            throw new IllegalArgumentException(error);
        }
    }
    
    public static ArrayList<Unit> getUnits() {
        Unit[] units = {
            new Unit("kg", "Kilogram"),
            new Unit("l", "Liter"),
            new Unit("g", "Gram"),
            new Unit("m", "Meter"),
            new Unit("ea", "Each")
        };
        return new ArrayList<>(Arrays.asList(units));
    }
    
    public static Unit getByCode(String code) {
        return getUnits().stream().filter(
            (Unit unit) -> code.equals(unit.getCode())
        ).findFirst().orElse(null);
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        if (Util.validateLength(code, 3)) {
            this.code = code;
        } else {
            String error = String.format("The code %s is invalid.", code);
            throw new IllegalArgumentException(error);
        }
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bits;

/**
 *
 * @author henock
 */
public class Util {
    public static boolean validateLength(String term, int length) {
        return term.length() <= length;
    }
    
    public static boolean validatePositive(float value) {
        return value > 0;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.awt.Color;

/**
 *
 * @author sahan
 */
public class ModelPieChart {
    private String name;
    private int value;
    private Color color;

    public ModelPieChart(String name, int value, Color color) {
        this.name = name;
        this.value = value;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }
}


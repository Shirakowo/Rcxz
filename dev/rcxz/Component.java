// Copyright (c) 2024 - 2025 Shirako x Shirahime

package dev.rcxz;

import java.awt.Color;
import java.awt.Graphics;

public class Component extends Object {
    public Transform transform;
    
    public void draw(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(0, 0, 1, 1);
    }

    @Override
    public String toString() {
        return this.name;
    }
}

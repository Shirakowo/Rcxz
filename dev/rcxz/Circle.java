// Copyright (c) 2024 - 2025 Shirako x Shirahime

package dev.rcxz;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Component {
    public Circle(String name, Vector2 position, Vector2 scale) {
        this.transform = new Transform();

        this.name = name;
        this.transform.position = position;
        this.transform.scale = scale;
        this.enabled = true;
    }

    public Circle(Vector2 position, Vector2 scale) {
        this("Circle", position, scale);
    }

    @Override
    public void draw(Graphics g) {
        int dx = Math.round(Window.centerX + this.transform.position.x - this.transform.scale.x / 2);
        int dy = Math.round(Window.centerY - this.transform.position.y - this.transform.scale.y / 2);

        g.setColor(Color.black);
        g.fillOval(dx, dy, this.transform.scale.x, this.transform.scale.y);
    }
}

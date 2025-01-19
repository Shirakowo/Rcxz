// Copyright (c) 2024 - 2025 Shirako x Shirahime

package dev.rcxz;

public class Vector2 {
    public int x;
    public int y;

    public Vector2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Vector2 add(Vector2 other) {
        return new Vector2(this.x + other.x, this.y + other.y);
    }

    public Vector2 add(int x, int y) {
        return new Vector2(this.x + x, this.y + y);
    }

    public Vector2 subtract(Vector2 other) {
        return new Vector2(this.x - other.x, this.y - other.y);
    }

    public Vector2 subtract(int x, int y) {
        return new Vector2(this.x - x, this.y - y);
    }

    public Vector2 multiply(int scalar) {
        return new Vector2(this.x * scalar, this.y * scalar);
    }

    public Vector2 divide(int scalar) {
        if (scalar == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        
        return new Vector2(this.x / scalar, this.y / scalar);
    }
}

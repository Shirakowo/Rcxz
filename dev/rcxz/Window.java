// Copyright (c) 2024 - 2025 Shirako x Shirahime

package dev.rcxz;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Window extends Frame {
    public final int width;
    public final int height;

    public Window(String title) {
        super(title);
        setExtendedState(6);
        setUndecorated(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        this.width = getWidth();
        this.height = getHeight();
    }
}

// Copyright (c) 2024 - 2025 Shirako x Shirahime

package dev.rcxz;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Window {
    public static final Frame window = new Frame();

    public static void setup() {
        window.setExtendedState(6);
        window.setUndecorated(true);
        window.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        window.setVisible(true);
    }
}

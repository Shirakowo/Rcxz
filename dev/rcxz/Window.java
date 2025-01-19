// Copyright (c) 2024 - 2025 Shirako x Shirahime

package dev.rcxz;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Window extends Frame {
    public Window(String title) {
        super(title);
        if (Application.fullscreen) {
            setExtendedState(6);
            setUndecorated(true);
            setResizable(false);
        } else {
            setExtendedState(0);
            setUndecorated(false);
            setResizable(true);
            setSize(1280, 720);
            setLocationRelativeTo(null);
        }
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public Window() {
        this(Application.applicationName);
    }
}

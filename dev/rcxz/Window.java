// Copyright (c) 2024 - 2025 Shirako x Shirahime

package dev.rcxz;

import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class Window extends Frame implements Runnable {
    private static Thread thread;
    private static final GraphicsEnvironment v1 = GraphicsEnvironment.getLocalGraphicsEnvironment();
    private static final GraphicsDevice v2 = v1.getDefaultScreenDevice();
    private static final DisplayMode v3 = v2.getDisplayMode();
    public static int width;
    public static int height;
    public static int centerX;
    public static int centerY;

    public static List<Component> c = new ArrayList<Component>();

    public Window(String title) {
        super(title);
        if (Application.fullscreen) {
            setExtendedState(6);
            setUndecorated(true);
            setResizable(false);
            width = v3.getWidth();
            height = v3.getHeight();
            centerX = v3.getWidth() / 2;
            centerY = v3.getHeight() / 2;
        } else {
            setExtendedState(0);
            setUndecorated(false);
            setResizable(true);
            setSize(1280, 720);
            setLocationRelativeTo(null);
            width = getWidth();
            height = getHeight();
            centerX = width / 2;
            centerY = height / 2;
        }
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        thread = new Thread(this);
        thread.start();
    }

    public Window() {
        this(Application.applicationName);
    }

    @Override
    public void run() {
        while (true) {
            repaint();
        }
    }

    @Override
    public void update(Graphics g) {
        paint(g);
    }

    @Override
    public void paint(Graphics g) {
        g.clearRect(0, 0, width, height);
        if (c != null) {
            for (Component c : c) {
                if (c.enabled) {
                    c.draw(g);
                }
            }
        }
    }
}

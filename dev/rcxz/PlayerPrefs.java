// Copyright (c) 2024 - 2025 Shirako x Shirahime

package dev.rcxz;

import java.util.prefs.Preferences;
public class PlayerPrefs {
    private static final Preferences prefs = Preferences.userNodeForPackage(PlayerPrefs.class);

    public static void setString(String key, String value) {
        prefs.put(key, value);
    }

    public static void setInt(String key, int value) {
        prefs.putInt(key, value);
    }

    public static void setFloat(String key, float value) {
        prefs.putFloat(key, value);
    }

    public static void setDouble(String key, double value) {
        prefs.putDouble(key, value);
    }

    public static void setBoolean(String key, boolean value) {
        prefs.putBoolean(key, value);
    }

    public static String getString(String key, String def) {
        return prefs.get(key, def);
    }

    public static int getInt(String key, int def) {
        return prefs.getInt(key, def);
    }

    public static float getFloat(String key, float def) {
        return prefs.getFloat(key, def);
    }

    public static double getDouble(String key, double def) {
        return prefs.getDouble(key, def);
    }

    public static boolean getBoolean(String key, boolean def) {
        return prefs.getBoolean(key, def);
    }

    public static void remove(String key) {
        prefs.remove(key);
    }

    public static void clear() {
        try {
            prefs.clear();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}


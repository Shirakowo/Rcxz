// Copyright (c) 2024 - 2025 Shirako x Shirahime

package dev.rcxz;

public class Application {
    /** The name of the application */
    public static String applicationName = "";
    /** The name of the developer */
    public static String developerName = "";
    /** The version of the application */
    public static String version = "";
    /** Does the frame in fullscreen mode? */
    public static boolean fullscreen = true;
    /** The maximum frame rate that the game tries to render */
    public static int frameRate = -1;

    /** The username of current user */
    public static final String username = System.getProperty("user.name");
    /** The path of the temporary data or cache directory */
    public static final String temporaryCachePath = "C:\\Users\\" + username + "\\AppData\\Local\\Temp\\" + developerName + "\\" + applicationName;
    /** The path of the persistent data directory */
    public static final String persistentDataPath = "C:\\Users\\" + username + "\\AppData\\LocalLow\\" + developerName + "\\" + applicationName;
    /** The time between each time to render */
    public static final float frameTime = 1000 / frameRate;
}

package com.gcc.feature.build_src.utils;

class Logger {
    private static boolean sIsLogEnabled = false
    private static String TAG = "GCC:: "

    static void log(String message, Object... args) {
        if (!isLogEnabled()) {
            return
        }

        println(String.format(TAG + message, args))
    }

    static void enable(boolean logEnabled) {
        sIsLogEnabled = logEnabled
    }

    private static boolean isLogEnabled() {
        return sIsLogEnabled
    }

}

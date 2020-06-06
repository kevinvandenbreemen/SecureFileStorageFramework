package com.vandenbreemen.securefilestorageframework.logging;


import android.util.Log;

import com.vandenbreemen.securefilestorageframework.logging.slf4j.MessageFormatter;

/**
 * <h2>Intro</h2>
 * <p>
 * <h2>Other Details</h2>
 *
 * @author kevin
 */
public class AndroidSystemLog implements CurrentSystemLog {

    private static final String TAG = CurrentSystemLog.class.getSimpleName();

    /**
     * Format the message with placeholders
     *
     * @param message
     * @param args
     * @return
     */
    private String format(String message, Object... args) {
        return MessageFormatter.arrayFormat(message, args).getMessage();
    }

    @Override
    public void info(String message, Object... args) {
        Log.i(TAG, format(message, args));
    }

    @Override
    public void error(String message, Throwable throwable, Object... args) {
        Log.e(TAG, format(message, args), throwable);
    }

    @Override
    public void error(String message, Object... args) {
        Log.e(TAG, format(message, args));
    }

    @Override
    public void debug(String message, Object... args) {
        Log.d(TAG, format(message, args));
    }

    @Override
    public void warn(String message, Object... args) {
        Log.w(TAG, format(message, args));
    }
}

package com.google.firebase.crashlytics.internal;

import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public class Logger {
    private int logLevel = 4;
    private final String tag;
    public static final String TAG = "FirebaseCrashlytics";
    static final Logger DEFAULT_LOGGER = new Logger(TAG);

    public Logger(String str) {
        this.tag = str;
    }

    public static Logger getLogger() {
        return DEFAULT_LOGGER;
    }

    private boolean canLog(int i) {
        return this.logLevel <= i || Log.isLoggable(this.tag, i);
    }

    public void d(String str, Throwable th) {
        canLog(3);
    }

    public void v(String str, Throwable th) {
        canLog(2);
    }

    public void i(String str, Throwable th) {
        canLog(4);
    }

    public void w(String str, Throwable th) {
        canLog(5);
    }

    public void e(String str, Throwable th) {
        canLog(6);
    }

    public void d(String str) {
        d(str, null);
    }

    public void v(String str) {
        v(str, null);
    }

    public void i(String str) {
        i(str, null);
    }

    public void w(String str) {
        w(str, null);
    }

    public void e(String str) {
        e(str, null);
    }

    public void log(int i, String str) {
        log(i, str, false);
    }

    public void log(int i, String str, boolean z) {
        if (z || canLog(i)) {
            Log.println(i, this.tag, str);
        }
    }
}

package com.karumi.dexter;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
final class WorkerThread implements Thread {
    private final Handler handler;
    private boolean wasLooperNull;

    WorkerThread() {
        this.wasLooperNull = false;
        if (Looper.myLooper() == null) {
            this.wasLooperNull = true;
            Looper.prepare();
        }
        this.handler = new Handler();
    }

    @Override // com.karumi.dexter.Thread
    public final void execute(Runnable runnable) {
        this.handler.post(runnable);
    }

    @Override // com.karumi.dexter.Thread
    public final void loop() {
        if (this.wasLooperNull) {
            Looper.loop();
        }
    }
}

package com.google.android.gms.fido.u2f;

import android.app.Activity;
import android.content.IntentSender;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface U2fPendingIntent {
    boolean hasPendingIntent();

    void launchPendingIntent(Activity activity, int i) throws IntentSender.SendIntentException;
}

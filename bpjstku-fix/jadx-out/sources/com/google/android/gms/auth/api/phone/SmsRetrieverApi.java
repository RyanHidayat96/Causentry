package com.google.android.gms.auth.api.phone;

import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes6.dex */
public interface SmsRetrieverApi {
    Task<Void> startSmsRetriever();

    Task<Void> startSmsUserConsent(String str);
}

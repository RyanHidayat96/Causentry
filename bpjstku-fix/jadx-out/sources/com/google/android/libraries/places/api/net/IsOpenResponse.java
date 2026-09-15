package com.google.android.libraries.places.api.net;

/* JADX INFO: loaded from: classes3.dex */
public abstract class IsOpenResponse {
    public abstract Boolean isOpen();

    public static IsOpenResponse newInstance(Boolean bool) {
        return new zzr(bool);
    }
}

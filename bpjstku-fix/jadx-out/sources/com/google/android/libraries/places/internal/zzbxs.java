package com.google.android.libraries.places.internal;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzbxs extends LinkedHashMap {
    /* synthetic */ zzbxs(byte[] bArr) {
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        return size() > 100;
    }

    private zzbxs() {
        throw null;
    }
}

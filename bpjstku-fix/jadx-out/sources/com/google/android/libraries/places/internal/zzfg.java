package com.google.android.libraries.places.internal;

import android.net.wifi.ScanResult;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class zzfg implements Comparator {
    static final /* synthetic */ zzfg zza = new zzfg();

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((ScanResult) obj2).level - ((ScanResult) obj).level;
    }

    private /* synthetic */ zzfg() {
    }
}

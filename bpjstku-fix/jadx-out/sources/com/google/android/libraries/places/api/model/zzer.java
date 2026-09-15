package com.google.android.libraries.places.api.model;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class zzer implements Comparator {
    static final /* synthetic */ zzer zza = new zzer();

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((Period) obj).getOpen().getDate().compareTo(((Period) obj2).getOpen().getDate());
    }

    private /* synthetic */ zzer() {
    }
}

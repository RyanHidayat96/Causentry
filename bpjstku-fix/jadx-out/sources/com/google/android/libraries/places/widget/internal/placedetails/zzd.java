package com.google.android.libraries.places.widget.internal.placedetails;

import androidx.recyclerview.widget.GridLayoutManager;

/* JADX INFO: loaded from: classes3.dex */
public final class zzd extends GridLayoutManager.SpanSizeLookup {
    final /* synthetic */ zzm zza;

    zzd(zzm zzmVar) {
        this.zza = zzmVar;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    public final int getSpanSize(int i) {
        return this.zza.getItemViewType(i) != 1 ? 2 : 1;
    }
}

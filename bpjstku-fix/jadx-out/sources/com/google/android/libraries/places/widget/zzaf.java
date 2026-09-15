package com.google.android.libraries.places.widget;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaf extends ViewPager2.OnPageChangeCallback {
    final /* synthetic */ PlaceDetailsFragment zza;

    zzaf(PlaceDetailsFragment placeDetailsFragment) {
        this.zza = placeDetailsFragment;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        super.onPageSelected(i);
        this.zza.zzv();
    }
}

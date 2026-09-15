package com.google.android.libraries.places.widget.internal.photoviewer;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes3.dex */
public final class zzb extends ViewPager2.OnPageChangeCallback {
    final /* synthetic */ PageSelectionIndicator zza;

    zzb(PageSelectionIndicator pageSelectionIndicator) {
        this.zza = pageSelectionIndicator;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        this.zza.zza(i);
    }
}

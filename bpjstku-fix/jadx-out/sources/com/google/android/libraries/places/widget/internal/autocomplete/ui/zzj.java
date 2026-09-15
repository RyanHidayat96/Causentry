package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.internal.zzdy;
import com.google.android.libraries.places.internal.zzng;
import com.google.android.libraries.places.internal.zzoy;
import com.google.android.libraries.places.internal.zzoz;

/* JADX INFO: loaded from: classes3.dex */
public final class zzj extends FragmentFactory {
    private final int zza;
    private final PlacesClient zzb;
    private final zzng zzc;
    private final zzoz zzd;
    private final zzdy zze;

    public zzj(int i, zzoy zzoyVar, zzng zzngVar) {
        this.zza = i;
        this.zzb = zzoyVar.zzc();
        this.zzc = zzngVar;
        this.zzd = zzoyVar.zzd();
        this.zze = zzoyVar.zzb();
    }

    @Override // androidx.fragment.app.FragmentFactory
    public final Fragment instantiate(ClassLoader classLoader, String str) {
        return loadFragmentClass(classLoader, str) == AutocompleteImplFragment.class ? new AutocompleteImplFragment(this.zza, this.zzb, this.zzc, this.zzd, this.zze, null) : super.instantiate(classLoader, str);
    }
}

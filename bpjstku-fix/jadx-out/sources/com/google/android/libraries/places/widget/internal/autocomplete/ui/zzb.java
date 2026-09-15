package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.internal.zzmr;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzb extends RecyclerView.OnScrollListener {
    final /* synthetic */ AutocompleteImplFragment zza;

    zzb(AutocompleteImplFragment autocompleteImplFragment) {
        Objects.requireNonNull(autocompleteImplFragment);
        this.zza = autocompleteImplFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 1) {
            try {
                AutocompleteImplFragment autocompleteImplFragment = this.zza;
                autocompleteImplFragment.zzg().zze();
                autocompleteImplFragment.zzh().clearFocus();
            } catch (Error | RuntimeException e2) {
                zzmr.zzb(e2);
                throw e2;
            }
        }
    }
}

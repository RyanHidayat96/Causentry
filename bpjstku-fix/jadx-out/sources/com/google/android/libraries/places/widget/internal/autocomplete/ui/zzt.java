package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.internal.zzmr;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
final class zzt extends RecyclerView.OnScrollListener {
    final /* synthetic */ BaseAutocompleteImplFragment zza;

    zzt(BaseAutocompleteImplFragment baseAutocompleteImplFragment) {
        Objects.requireNonNull(baseAutocompleteImplFragment);
        this.zza = baseAutocompleteImplFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 1) {
            try {
                BaseAutocompleteImplFragment baseAutocompleteImplFragment = this.zza;
                baseAutocompleteImplFragment.zzj().zze();
                baseAutocompleteImplFragment.zzk().clearFocus();
            } catch (Error | RuntimeException e2) {
                zzmr.zzb(e2);
                throw e2;
            }
        }
    }
}

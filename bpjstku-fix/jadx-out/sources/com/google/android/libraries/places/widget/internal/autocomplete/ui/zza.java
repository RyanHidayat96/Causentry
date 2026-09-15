package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import androidx.view.OnBackPressedCallback;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zza extends OnBackPressedCallback {
    final /* synthetic */ AutocompleteImplFragment zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zza(AutocompleteImplFragment autocompleteImplFragment, boolean z) {
        super(true);
        Objects.requireNonNull(autocompleteImplFragment);
        this.zza = autocompleteImplFragment;
    }

    @Override // androidx.view.OnBackPressedCallback
    public final void handleOnBackPressed() {
        this.zza.zzg().zzj();
    }
}

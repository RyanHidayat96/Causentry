package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import androidx.view.OnBackPressedCallback;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
final class zzr extends OnBackPressedCallback {
    final /* synthetic */ BaseAutocompleteImplFragment zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzr(BaseAutocompleteImplFragment baseAutocompleteImplFragment, boolean z) {
        super(true);
        Objects.requireNonNull(baseAutocompleteImplFragment);
        this.zza = baseAutocompleteImplFragment;
    }

    @Override // androidx.view.OnBackPressedCallback
    public final void handleOnBackPressed() {
        this.zza.zzj().zzj();
    }
}

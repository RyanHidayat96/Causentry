package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.libraries.places.internal.zzmr;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzk implements TextWatcher {
    final /* synthetic */ AutocompleteImplFragment zza;

    /* synthetic */ zzk(AutocompleteImplFragment autocompleteImplFragment, byte[] bArr) {
        Objects.requireNonNull(autocompleteImplFragment);
        this.zza = autocompleteImplFragment;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        try {
            AutocompleteImplFragment autocompleteImplFragment = this.zza;
            autocompleteImplFragment.zzg().zzc(editable.toString(), autocompleteImplFragment.zzh().getSelectionEnd());
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}

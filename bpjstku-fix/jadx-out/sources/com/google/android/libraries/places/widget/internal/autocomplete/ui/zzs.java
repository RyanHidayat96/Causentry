package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import android.view.View;
import defpackage.ViewPortBuilder;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
final class zzs implements View.OnClickListener {
    final /* synthetic */ BaseAutocompleteImplFragment zza;

    zzs(BaseAutocompleteImplFragment baseAutocompleteImplFragment) {
        Objects.requireNonNull(baseAutocompleteImplFragment);
        this.zza = baseAutocompleteImplFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            this.zza.zzi();
        } finally {
            ViewPortBuilder.b();
        }
    }
}

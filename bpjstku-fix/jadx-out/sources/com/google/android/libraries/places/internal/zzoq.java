package com.google.android.libraries.places.internal;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import com.google.android.libraries.places.R;
import defpackage.ViewPortBuilder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzoq extends Dialog {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzoq(Context context, int i) {
        super(context, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // android.app.Dialog
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.no_gmm_or_browser_dialog);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setFlags(2, 2);
            window.setDimAmount(0.6f);
        }
        ((Button) findViewById(R.id.no_browser_error_ok)).setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.internal.zzop
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    this.zza.dismiss();
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
    }
}

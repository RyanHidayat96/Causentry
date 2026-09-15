package com.google.android.gms.dynamic;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import defpackage.ViewPortBuilder;

/* JADX INFO: loaded from: classes3.dex */
final class zae implements View.OnClickListener {
    final /* synthetic */ Context zaa;
    final /* synthetic */ Intent zab;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            this.zaa.startActivity(this.zab);
        } catch (ActivityNotFoundException e2) {
            Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e2);
        } finally {
            ViewPortBuilder.b();
        }
    }

    zae(Context context, Intent intent) {
        this.zaa = context;
        this.zab = intent;
    }
}

package com.google.android.libraries.places.internal;

import android.content.Context;
import com.google.common.collect.ImmutableMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzmx {
    private final Context zza;

    public zzmx(Context context) {
        if (context == null) {
            throw new NullPointerException("Context must not be null.");
        }
        this.zza = context;
    }

    public final ImmutableMap zza() {
        Context context = this.zza;
        String packageName = context.getPackageName();
        String strZza = zzmh.zza(context.getPackageManager(), packageName);
        ImmutableMap.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault1 = ImmutableMap.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        if (packageName != null) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1("X-Android-Package", packageName);
        }
        if (strZza != null) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1("X-Android-Cert", strZza);
        }
        return tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }
}

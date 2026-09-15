package com.google.android.libraries.places.widget;

import android.content.Context;
import com.google.android.libraries.places.widget.internal.placedetails.zzbp;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzw implements Function1 {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int b;
    private final /* synthetic */ PlaceDetailsFragment zza;

    /* synthetic */ zzw(PlaceDetailsFragment placeDetailsFragment) {
        this.zza = placeDetailsFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Object invoke(Object obj) {
        return PlaceDetailsFragment.zzj(this.zza, (zzbp) obj);
    }

    public static int b() {
        int i = TuitionPaymentFragmentbindingInflater1;
        int i2 = i % 6639886;
        TuitionPaymentFragmentbindingInflater1 = i + 1;
        if (i2 != 0) {
            return b;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboardHidden;
        b = i3;
        return i3;
    }
}

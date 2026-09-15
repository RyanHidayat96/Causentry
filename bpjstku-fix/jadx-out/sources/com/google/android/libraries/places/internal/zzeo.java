package com.google.android.libraries.places.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.DeferrableSurfaceExternalSyntheticLambda1;
import defpackage.getCameraRegistration;
import defpackage.getCloseFuture;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeo {
    private final Context zza;
    private final DeferrableSurfaceExternalSyntheticLambda1 zzb;
    private final ListenableFuture zzc;

    public zzeo(Context context, DeferrableSurfaceExternalSyntheticLambda1 deferrableSurfaceExternalSyntheticLambda1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(deferrableSurfaceExternalSyntheticLambda1, "");
        this.zza = context;
        this.zzb = deferrableSurfaceExternalSyntheticLambda1;
        ListenableFuture listenableFutureSubmit = deferrableSurfaceExternalSyntheticLambda1.submit(new Callable() { // from class: com.google.android.libraries.places.internal.zzen
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zza.getSharedPreferences("com.google.geo_sdk.PREFERENCES_FILE", 0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(listenableFutureSubmit, "");
        this.zzc = listenableFutureSubmit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String zzf(SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "");
        String string = sharedPreferences.getString("zb", "");
        return string == null ? "" : string;
    }

    public final ListenableFuture zza() {
        final zzej zzejVar = zzej.zza;
        ListenableFuture listenableFutureTuitionPaymentFragmentbindingInflater1 = getCloseFuture.TuitionPaymentFragmentbindingInflater1(this.zzc, new getCameraRegistration() { // from class: com.google.android.libraries.places.internal.zzek
            @Override // defpackage.getCameraRegistration
            public final /* synthetic */ Object apply(Object obj) {
                Function1 function1 = zzejVar;
                return zzeo.zzf((SharedPreferences) obj);
            }
        }, this.zzb);
        Intrinsics.checkNotNullExpressionValue(listenableFutureTuitionPaymentFragmentbindingInflater1, "");
        return listenableFutureTuitionPaymentFragmentbindingInflater1;
    }

    public final void zzb(final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        final Function1 function1 = new Function1() { // from class: com.google.android.libraries.places.internal.zzel
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Object invoke(Object obj) {
                SharedPreferences.Editor editorPutString;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                Intrinsics.checkNotNullParameter(sharedPreferences, "");
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                if (editorEdit == null || (editorPutString = editorEdit.putString("zb", str)) == null) {
                    return null;
                }
                editorPutString.apply();
                return Unit.INSTANCE;
            }
        };
        Intrinsics.checkNotNullExpressionValue(getCloseFuture.TuitionPaymentFragmentbindingInflater1(this.zzc, new getCameraRegistration() { // from class: com.google.android.libraries.places.internal.zzem
            @Override // defpackage.getCameraRegistration
            public final /* synthetic */ Object apply(Object obj) {
                return (Unit) function1.invoke(obj);
            }
        }, this.zzb), "");
    }
}

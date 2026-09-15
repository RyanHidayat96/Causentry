package com.google.android.libraries.places.api.net.kotlin;

import android.os.Process;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.PlacesClient;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class zzo extends ContinuationImpl {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int b;
    /* synthetic */ Object zza;
    int zzb;

    zzo(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzb |= Integer.MIN_VALUE;
        return PlacesClientKt.awaitIsOpen((PlacesClient) null, (Place) null, (Long) null, this);
    }

    public static int TuitionPaymentFragmentbindingInflater1() {
        int i = b;
        int i2 = i % 8673529;
        b = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentbindingInflater1;
        }
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        TuitionPaymentFragmentbindingInflater1 = startElapsedRealtime;
        return startElapsedRealtime;
    }
}

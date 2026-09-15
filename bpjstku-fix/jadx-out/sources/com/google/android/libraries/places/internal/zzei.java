package com.google.android.libraries.places.internal;

import defpackage.DeferrableSurfaceExternalSyntheticLambda0;
import defpackage.DeferrableSurfaceExternalSyntheticLambda1;
import defpackage.DeferrableSurfaceExternalSyntheticLambda2;
import defpackage.setContainerClass;
import defpackage.updateAndVerifyState;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzei implements zzbep {
    public static DeferrableSurfaceExternalSyntheticLambda1 zzc() {
        setContainerClass setcontainerclass = new setContainerClass();
        new Object[]{0};
        setcontainerclass.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "Maps Platform Background-%d";
        updateAndVerifyState.TuitionPaymentFragmentspecialinlinedviewModeldefault1(true, "Thread priority (%s) must be >= %s", 10, 1);
        updateAndVerifyState.TuitionPaymentFragmentspecialinlinedviewModeldefault1(true, "Thread priority (%s) must be <= %s", 10, 10);
        setcontainerclass.TuitionPaymentFragmentbindingInflater1 = 10;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(4, setContainerClass.TuitionPaymentFragmentspecialinlinedviewModeldefault2(setcontainerclass));
        DeferrableSurfaceExternalSyntheticLambda2 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = scheduledExecutorServiceNewScheduledThreadPool instanceof DeferrableSurfaceExternalSyntheticLambda2 ? (DeferrableSurfaceExternalSyntheticLambda2) scheduledExecutorServiceNewScheduledThreadPool : new DeferrableSurfaceExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(scheduledExecutorServiceNewScheduledThreadPool);
        zzber.zza(tuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return tuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // com.google.android.libraries.places.internal.zzcbd
    public final /* synthetic */ Object zzb() {
        return zzc();
    }

    public static zzei zza() {
        return zzeh.zza;
    }
}

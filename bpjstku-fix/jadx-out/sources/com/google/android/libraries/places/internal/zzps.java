package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.PlacesClient;
import defpackage.VideoMimeInfo;
import defpackage.isX230;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes4.dex */
final class zzps extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ List zzb;
    final /* synthetic */ zzpw zzc;
    private /* synthetic */ Object zzd;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzps) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        ResultKt.throwOnFailure(obj);
        if (i == 0) {
            CoroutineScope coroutineScope = (CoroutineScope) this.zzd;
            List list = this.zzb;
            zzpw zzpwVar = this.zzc;
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(b.async$default(coroutineScope, null, null, new zzpr(zzpwVar, (Place) it.next(), null), 3, null));
            }
            ArrayList arrayList2 = arrayList;
            zzps zzpsVar = this;
            this.zza = 1;
            if (arrayList2.isEmpty()) {
                obj = CollectionsKt.emptyList();
            } else {
                isX230 isx230 = new isX230((Deferred[]) arrayList2.toArray(new Deferred[0]));
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(zzpsVar), 1);
                cancellableContinuationImpl.initCancellability();
                CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
                int length = isx230.TuitionPaymentFragmentbindingInflater1.length;
                isX230.TuitionPaymentFragmentspecialinlinedviewModeldefault2[] tuitionPaymentFragmentspecialinlinedviewModeldefault2Arr = new isX230.TuitionPaymentFragmentspecialinlinedviewModeldefault2[length];
                for (int i2 = 0; i2 < length; i2++) {
                    Deferred deferred = isx230.TuitionPaymentFragmentbindingInflater1[i2];
                    deferred.INotificationSideChannel();
                    isX230.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new isX230.TuitionPaymentFragmentspecialinlinedviewModeldefault2(cancellableContinuationImpl2);
                    tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = VideoMimeInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(deferred, true, tuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    Unit unit = Unit.INSTANCE;
                    tuitionPaymentFragmentspecialinlinedviewModeldefault2Arr[i2] = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
                }
                isX230.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new isX230.TuitionPaymentFragmentspecialinlinedviewModeldefault3(tuitionPaymentFragmentspecialinlinedviewModeldefault2Arr);
                for (int i3 = 0; i3 < length; i3++) {
                    isX230.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b.set(tuitionPaymentFragmentspecialinlinedviewModeldefault2Arr[i3], tuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
                if (cancellableContinuationImpl2.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                } else {
                    cancellableContinuationImpl2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
                Object result = cancellableContinuationImpl.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(zzpsVar);
                }
                obj = result;
            }
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        zzpw zzpwVar2 = this.zzc;
        zzpwVar2.zzf.postValue((List) obj);
        PlacesClient placesClientZzd = zzpwVar2.zzd();
        if (placesClientZzd != null) {
            placesClientZzd.zzm();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzps(List list, zzpw zzpwVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = list;
        this.zzc = zzpwVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzps zzpsVar = new zzps(this.zzb, this.zzc, continuation);
        zzpsVar.zzd = obj;
        return zzpsVar;
    }
}

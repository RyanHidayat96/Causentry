package com.google.android.libraries.places.internal;

import defpackage.addSignalEosTimeoutIfNeeded;
import defpackage.clampVideoBitrateIfNotSupported;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class zzrp implements clampVideoBitrateIfNotSupported {
    final /* synthetic */ clampVideoBitrateIfNotSupported zza;
    final /* synthetic */ Function2 zzb;

    @Override // defpackage.clampVideoBitrateIfNotSupported
    public final Object collect(addSignalEosTimeoutIfNeeded addsignaleostimeoutifneeded, Continuation continuation) {
        Object objCollect = this.zza.collect(new zzro(addsignaleostimeoutifneeded, this.zzb), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    public zzrp(clampVideoBitrateIfNotSupported clampvideobitrateifnotsupported, Function2 function2) {
        this.zza = clampvideobitrateifnotsupported;
        this.zzb = function2;
    }
}

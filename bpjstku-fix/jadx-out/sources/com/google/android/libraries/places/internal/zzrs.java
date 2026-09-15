package com.google.android.libraries.places.internal;

import defpackage.addSignalEosTimeoutIfNeeded;
import defpackage.clampVideoBitrateIfNotSupported;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class zzrs implements clampVideoBitrateIfNotSupported {
    final /* synthetic */ clampVideoBitrateIfNotSupported zza;

    @Override // defpackage.clampVideoBitrateIfNotSupported
    public final Object collect(addSignalEosTimeoutIfNeeded addsignaleostimeoutifneeded, Continuation continuation) {
        Object objCollect = this.zza.collect(new zzrr(addsignaleostimeoutifneeded), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    public zzrs(clampVideoBitrateIfNotSupported clampvideobitrateifnotsupported) {
        this.zza = clampvideobitrateifnotsupported;
    }
}

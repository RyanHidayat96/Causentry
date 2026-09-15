package com.google.android.libraries.places.internal;

import defpackage.addSignalEosTimeoutIfNeeded;

/* JADX INFO: loaded from: classes6.dex */
public final class zzrr implements addSignalEosTimeoutIfNeeded {
    final /* synthetic */ addSignalEosTimeoutIfNeeded zza;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (r7.emit(r8, r0) != r1) goto L21;
     */
    @Override // defpackage.addSignalEosTimeoutIfNeeded
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.libraries.places.internal.zzrq
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.libraries.places.internal.zzrq r0 = (com.google.android.libraries.places.internal.zzrq) r0
            int r1 = r0.zzb
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 + r2
            r0.zzb = r1
            goto L18
        L13:
            com.google.android.libraries.places.internal.zzrq r0 = new com.google.android.libraries.places.internal.zzrq
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.zza
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.zzb
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.throwOnFailure(r8)
            goto L5e
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r7 = r0.zzc
            addSignalEosTimeoutIfNeeded r7 = (defpackage.addSignalEosTimeoutIfNeeded) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L53
        L3c:
            kotlin.ResultKt.throwOnFailure(r8)
            addSignalEosTimeoutIfNeeded r8 = r6.zza
            r2 = r0
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            kotlinx.coroutines.Deferred r7 = (kotlinx.coroutines.Deferred) r7
            r0.zzc = r8
            r0.zzb = r4
            java.lang.Object r7 = r7.await(r0)
            if (r7 == r1) goto L61
            r5 = r8
            r8 = r7
            r7 = r5
        L53:
            r2 = 0
            r0.zzc = r2
            r0.zzb = r3
            java.lang.Object r7 = r7.emit(r8, r0)
            if (r7 == r1) goto L61
        L5e:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzrr.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public zzrr(addSignalEosTimeoutIfNeeded addsignaleostimeoutifneeded) {
        this.zza = addsignaleostimeoutifneeded;
    }
}

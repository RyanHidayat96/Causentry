package com.google.android.libraries.places.internal;

import defpackage.ConfigProvider;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
final class zzbpm implements zzbwk {
    @Override // com.google.android.libraries.places.internal.zzbwk
    public final long zza() {
        Instant instantNow = Instant.now();
        return ConfigProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault2(TimeUnit.SECONDS.toNanos(instantNow.getEpochSecond()), instantNow.getNano());
    }

    zzbpm() {
    }
}

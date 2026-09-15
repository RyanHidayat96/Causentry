package com.google.android.libraries.places.internal;

import defpackage.clampVideoBitrateIfNotSupported;
import defpackage.hasEndOfStreamFlag;
import defpackage.hasStopCodecAfterSurfaceRemovalCrashMediaServerQuirk;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: classes6.dex */
public final class zzrw {
    public static final clampVideoBitrateIfNotSupported zza(clampVideoBitrateIfNotSupported clampvideobitrateifnotsupported, int i, Function2 function2) {
        Intrinsics.checkNotNullParameter(clampvideobitrateifnotsupported, "");
        Intrinsics.checkNotNullParameter(function2, "");
        if (i > 0) {
            return i == 1 ? new zzrp(clampvideobitrateifnotsupported, function2) : new zzrs(hasEndOfStreamFlag.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new hasStopCodecAfterSurfaceRemovalCrashMediaServerQuirk(new zzrv(clampvideobitrateifnotsupported, function2, null), null, 0, null, 14, null), i - 2, BufferOverflow.SUSPEND));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 39);
        sb.append("concurrency must be at least 1 but was ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}

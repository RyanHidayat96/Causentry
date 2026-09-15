package com.datadog.android.rum.internal.anr;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/datadog/android/rum/internal/anr/ANRException;", "Ljava/lang/Exception;", "Lkotlin/TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "Ljava/lang/Thread;", "p0", "<init>", "(Ljava/lang/Thread;)V"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class ANRException extends Exception {
    public ANRException(Thread thread) {
        Intrinsics.checkNotNullParameter(thread, "");
        setStackTrace(thread.getStackTrace());
    }
}

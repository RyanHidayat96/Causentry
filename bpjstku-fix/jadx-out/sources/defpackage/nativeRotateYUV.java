package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class nativeRotateYUV implements ThreadFactory {
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final AtomicInteger TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public nativeRotateYUV(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getAndIncrement();
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        StringBuilder sb = new StringBuilder("datadog-");
        sb.append(str);
        sb.append("-thread-");
        sb.append(andIncrement);
        Thread thread = new Thread(runnable, sb.toString());
        thread.setPriority(5);
        thread.setDaemon(false);
        return thread;
    }
}

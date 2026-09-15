package defpackage;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class setContainerClass {
    public String TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
    public Boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
    public Integer TuitionPaymentFragmentbindingInflater1 = null;
    private Thread.UncaughtExceptionHandler TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
    private ThreadFactory b = null;

    public static ThreadFactory TuitionPaymentFragmentspecialinlinedviewModeldefault2(setContainerClass setcontainerclass) {
        String str = setcontainerclass.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Boolean bool = setcontainerclass.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Integer num = setcontainerclass.TuitionPaymentFragmentbindingInflater1;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = setcontainerclass.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        ThreadFactory threadFactory = setcontainerclass.b;
        return new ThreadFactory(Executors.defaultThreadFactory(), str, str != null ? new AtomicLong(0L) : null, bool, num, null) { // from class: setContainerClass.1
            private /* synthetic */ ThreadFactory TuitionPaymentFragmentbindingInflater1;
            private /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            private /* synthetic */ Boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            private /* synthetic */ AtomicLong TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            private /* synthetic */ Thread.UncaughtExceptionHandler asInterface = null;
            private /* synthetic */ Integer b;

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread threadNewThread = this.TuitionPaymentFragmentbindingInflater1.newThread(runnable);
                Objects.requireNonNull(threadNewThread);
                String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (str2 != null) {
                    threadNewThread.setName(String.format(Locale.ROOT, str2, Long.valueOf(((AtomicLong) Objects.requireNonNull(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3)).getAndIncrement())));
                }
                Boolean bool2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (bool2 != null) {
                    threadNewThread.setDaemon(bool2.booleanValue());
                }
                Integer num2 = this.b;
                if (num2 != null) {
                    threadNewThread.setPriority(num2.intValue());
                }
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.asInterface;
                if (uncaughtExceptionHandler2 != null) {
                    threadNewThread.setUncaughtExceptionHandler(uncaughtExceptionHandler2);
                }
                return threadNewThread;
            }
        };
    }
}

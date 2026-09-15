package androidx.work;

/* JADX INFO: loaded from: classes6.dex */
public interface RunnableScheduler {
    void cancel(Runnable runnable);

    void scheduleWithDelay(long j, Runnable runnable);
}

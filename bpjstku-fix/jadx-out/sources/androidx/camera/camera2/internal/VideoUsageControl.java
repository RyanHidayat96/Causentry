package androidx.camera.camera2.internal;

import androidx.camera.core.Logger;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\bJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\bJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\bR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/camera/camera2/internal/VideoUsageControl;", "", "Ljava/util/concurrent/Executor;", "p0", "<init>", "(Ljava/util/concurrent/Executor;)V", "", "decrementUsage", "()V", "", "getUsage", "()I", "incrementUsage", "reset", "resetDirectly", "executor", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/atomic/AtomicInteger;", "mVideoUsage", "Ljava/util/concurrent/atomic/AtomicInteger;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VideoUsageControl {
    private final Executor executor;
    private final AtomicInteger mVideoUsage;

    public VideoUsageControl(Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "");
        this.executor = executor;
        this.mVideoUsage = new AtomicInteger(0);
    }

    public final void incrementUsage() {
        this.executor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.VideoUsageControl$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                VideoUsageControl.incrementUsage$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void incrementUsage$lambda$0(VideoUsageControl videoUsageControl) {
        Intrinsics.checkNotNullParameter(videoUsageControl, "");
        Logger.d("VideoUsageControl", "incrementUsage: mVideoUsage = ".concat(String.valueOf(videoUsageControl.mVideoUsage.incrementAndGet())));
    }

    public final void decrementUsage() {
        this.executor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.VideoUsageControl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                VideoUsageControl.decrementUsage$lambda$1(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void decrementUsage$lambda$1(VideoUsageControl videoUsageControl) {
        Intrinsics.checkNotNullParameter(videoUsageControl, "");
        int iDecrementAndGet = videoUsageControl.mVideoUsage.decrementAndGet();
        if (iDecrementAndGet >= 0) {
            Logger.d("VideoUsageControl", "decrementUsage: mVideoUsage = ".concat(String.valueOf(iDecrementAndGet)));
            return;
        }
        StringBuilder sb = new StringBuilder("decrementUsage: mVideoUsage = ");
        sb.append(iDecrementAndGet);
        sb.append(", which is less than 0!");
        Logger.w("VideoUsageControl", sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reset$lambda$2(VideoUsageControl videoUsageControl) {
        Intrinsics.checkNotNullParameter(videoUsageControl, "");
        videoUsageControl.resetDirectly();
    }

    public final void reset() {
        this.executor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.VideoUsageControl$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                VideoUsageControl.reset$lambda$2(this.f$0);
            }
        });
    }

    public final void resetDirectly() {
        this.mVideoUsage.set(0);
        Logger.d("VideoUsageControl", "resetDirectly: mVideoUsage reset!");
    }

    public final int getUsage() {
        return this.mVideoUsage.get();
    }
}

package androidx.camera.core.imagecapture;

import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H'¢\u0006\u0004\b\u0006\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/core/imagecapture/CameraCapturePipeline;", "", "Lcom/google/common/util/concurrent/ListenableFuture;", "Ljava/lang/Void;", "invokePostCapture", "()Lcom/google/common/util/concurrent/ListenableFuture;", "invokePreCapture"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface CameraCapturePipeline {
    ListenableFuture<Void> invokePostCapture();

    ListenableFuture<Void> invokePreCapture();
}

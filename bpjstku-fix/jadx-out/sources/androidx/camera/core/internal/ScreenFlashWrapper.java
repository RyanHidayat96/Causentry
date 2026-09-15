package androidx.camera.core.internal;

import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0013\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/camera/core/internal/ScreenFlashWrapper;", "Landroidx/camera/core/ImageCapture$ScreenFlash;", "p0", "<init>", "(Landroidx/camera/core/ImageCapture$ScreenFlash;)V", "", "Landroidx/camera/core/ImageCapture$ScreenFlashListener;", "p1", "", "apply", "(JLandroidx/camera/core/ImageCapture$ScreenFlashListener;)V", "clear", "()V", "completePendingScreenFlashClear", "completePendingScreenFlashListener", "completePendingTasks", "getBaseScreenFlash", "()Landroidx/camera/core/ImageCapture$ScreenFlash;", "", "isClearScreenFlashPending", "Z", "", "lock", "Ljava/lang/Object;", "pendingListener", "Landroidx/camera/core/ImageCapture$ScreenFlashListener;", "screenFlash", "Landroidx/camera/core/ImageCapture$ScreenFlash;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ScreenFlashWrapper implements ImageCapture.ScreenFlash {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "ScreenFlashWrapper";
    private boolean isClearScreenFlashPending;
    private final Object lock;
    private ImageCapture.ScreenFlashListener pendingListener;
    private final ImageCapture.ScreenFlash screenFlash;

    private ScreenFlashWrapper(ImageCapture.ScreenFlash screenFlash) {
        this.screenFlash = screenFlash;
        this.lock = new Object();
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/camera/core/internal/ScreenFlashWrapper$Companion;", "", "<init>", "()V", "Landroidx/camera/core/ImageCapture$ScreenFlash;", "p0", "Landroidx/camera/core/internal/ScreenFlashWrapper;", "from", "(Landroidx/camera/core/ImageCapture$ScreenFlash;)Landroidx/camera/core/internal/ScreenFlashWrapper;", "", "TAG", "Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public final ScreenFlashWrapper from(ImageCapture.ScreenFlash p0) {
            return new ScreenFlashWrapper(p0, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.camera.core.ImageCapture.ScreenFlash
    public final void apply(long p0, ImageCapture.ScreenFlashListener p1) {
        Unit unit;
        Intrinsics.checkNotNullParameter(p1, "");
        synchronized (this.lock) {
            this.isClearScreenFlashPending = true;
            this.pendingListener = p1;
            Unit unit2 = Unit.INSTANCE;
        }
        ImageCapture.ScreenFlash screenFlash = this.screenFlash;
        if (screenFlash != null) {
            screenFlash.apply(p0, new ImageCapture.ScreenFlashListener() { // from class: androidx.camera.core.internal.ScreenFlashWrapper$$ExternalSyntheticLambda0
                @Override // androidx.camera.core.ImageCapture.ScreenFlashListener
                public final void onCompleted() {
                    ScreenFlashWrapper.apply$lambda$2(this.f$0);
                }
            });
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            Logger.e(TAG, "apply: screenFlash is null!");
            completePendingScreenFlashListener();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void apply$lambda$2(ScreenFlashWrapper screenFlashWrapper) {
        Intrinsics.checkNotNullParameter(screenFlashWrapper, "");
        synchronized (screenFlashWrapper.lock) {
            if (screenFlashWrapper.pendingListener == null) {
                Logger.w(TAG, "apply: pendingListener is null!");
            }
            screenFlashWrapper.completePendingScreenFlashListener();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.camera.core.ImageCapture.ScreenFlash
    public final void clear() {
        completePendingScreenFlashClear();
    }

    /* JADX INFO: renamed from: getBaseScreenFlash, reason: from getter */
    public final ImageCapture.ScreenFlash getScreenFlash() {
        return this.screenFlash;
    }

    private final void completePendingScreenFlashListener() {
        synchronized (this.lock) {
            ImageCapture.ScreenFlashListener screenFlashListener = this.pendingListener;
            if (screenFlashListener != null) {
                screenFlashListener.onCompleted();
            }
            this.pendingListener = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void completePendingScreenFlashClear() {
        Unit unit;
        synchronized (this.lock) {
            if (this.isClearScreenFlashPending) {
                ImageCapture.ScreenFlash screenFlash = this.screenFlash;
                if (screenFlash != null) {
                    screenFlash.clear();
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    ScreenFlashWrapper screenFlashWrapper = this;
                    Logger.e(TAG, "completePendingScreenFlashClear: screenFlash is null!");
                }
            } else {
                Logger.w(TAG, "completePendingScreenFlashClear: none pending!");
            }
            this.isClearScreenFlashPending = false;
            Unit unit2 = Unit.INSTANCE;
        }
    }

    public final void completePendingTasks() {
        completePendingScreenFlashListener();
        completePendingScreenFlashClear();
    }

    public /* synthetic */ ScreenFlashWrapper(ImageCapture.ScreenFlash screenFlash, DefaultConstructorMarker defaultConstructorMarker) {
        this(screenFlash);
    }

    @JvmStatic
    public static final ScreenFlashWrapper from(ImageCapture.ScreenFlash screenFlash) {
        return INSTANCE.from(screenFlash);
    }
}

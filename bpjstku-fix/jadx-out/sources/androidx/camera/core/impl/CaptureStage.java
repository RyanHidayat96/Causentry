package androidx.camera.core.impl;

/* JADX INFO: loaded from: classes5.dex */
public interface CaptureStage {
    CaptureConfig getCaptureConfig();

    int getId();

    public static final class DefaultCaptureStage implements CaptureStage {
        private final CaptureConfig mCaptureConfig = new CaptureConfig.Builder().build();

        @Override // androidx.camera.core.impl.CaptureStage
        public final int getId() {
            return 0;
        }

        @Override // androidx.camera.core.impl.CaptureStage
        public final CaptureConfig getCaptureConfig() {
            return this.mCaptureConfig;
        }
    }
}

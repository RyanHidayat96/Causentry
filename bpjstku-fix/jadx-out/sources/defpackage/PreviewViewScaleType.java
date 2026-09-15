package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class PreviewViewScaleType {
    public static final <T> T TuitionPaymentFragmentbindingInflater1(PreviewStreamStateObserver2 previewStreamStateObserver2, String str, getDisplayManager getdisplaymanager, isBitDepthMatched<? extends T> isbitdepthmatched) {
        Intrinsics.checkNotNullParameter(previewStreamStateObserver2, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(getdisplaymanager, "");
        Intrinsics.checkNotNullParameter(isbitdepthmatched, "");
        return (T) new onSurfaceNotInUse(previewStreamStateObserver2, getdisplaymanager, str, isbitdepthmatched.getDescriptor()).decodeSerializableValue(isbitdepthmatched);
    }
}

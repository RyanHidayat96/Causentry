package defpackage;

import android.content.Context;
import android.view.Window;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.SdkCore;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class getCameraEdge implements PreviewExternalSyntheticLambda1 {
    private final updateTransformMatrix[] TuitionPaymentFragmentbindingInflater1;
    private final InternalLogger TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final getUseCaseAspectRatio b;

    public getCameraEdge(updateTransformMatrix[] updatetransformmatrixArr, getUseCaseAspectRatio getusecaseaspectratio, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(updatetransformmatrixArr, "");
        Intrinsics.checkNotNullParameter(getusecaseaspectratio, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        this.TuitionPaymentFragmentbindingInflater1 = updatetransformmatrixArr;
        this.b = getusecaseaspectratio;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = internalLogger;
    }

    @Override // defpackage.PreviewExternalSyntheticLambda1
    public final void b(Window window, Context context, SdkCore sdkCore) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(sdkCore, "");
        if (window == null) {
            return;
        }
        PreviewExternalSyntheticLambda4 callback = window.getCallback();
        if (callback == null) {
            callback = new PreviewExternalSyntheticLambda4();
        }
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(window, "");
        Intrinsics.checkNotNullParameter(sdkCore, "");
        window.setCallback(new setPreviewStabilizationEnabled(window, sdkCore, callback, new setSurfaceProvider(context, new lambdaaddCameraSurfaceAndErrorListener1androidxcameracorePreview(sdkCore, new WeakReference(window), this.TuitionPaymentFragmentbindingInflater1, this.b, new WeakReference(context), this.TuitionPaymentFragmentspecialinlinedviewModeldefault2)), this.b, null, this.TuitionPaymentFragmentbindingInflater1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, 32, null));
    }

    @Override // defpackage.PreviewExternalSyntheticLambda1
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Window window, Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (window != null) {
            Window.Callback callback = window.getCallback();
            if (callback instanceof setPreviewStabilizationEnabled) {
                setPreviewStabilizationEnabled setpreviewstabilizationenabled = (setPreviewStabilizationEnabled) callback;
                if (!(setpreviewstabilizationenabled.asBinder instanceof PreviewExternalSyntheticLambda4)) {
                    window.setCallback(setpreviewstabilizationenabled.asBinder);
                } else {
                    window.setCallback(null);
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "");
        getCameraEdge getcameraedge = (getCameraEdge) obj;
        return Arrays.equals(this.TuitionPaymentFragmentbindingInflater1, getcameraedge.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.b.getClass(), getcameraedge.b.getClass());
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.TuitionPaymentFragmentbindingInflater1) + 544;
        return iHashCode + (iHashCode * 31) + this.b.getClass().hashCode();
    }

    public final String toString() {
        String strJoinToString$default = ArraysKt.joinToString$default(this.TuitionPaymentFragmentbindingInflater1, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null);
        StringBuilder sb = new StringBuilder("DatadogGesturesTracker(");
        sb.append(strJoinToString$default);
        sb.append(")");
        return sb.toString();
    }
}

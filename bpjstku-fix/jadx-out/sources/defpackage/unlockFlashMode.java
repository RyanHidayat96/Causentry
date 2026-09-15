package defpackage;

import android.content.Context;
import androidx.work.WorkManager;
import com.datadog.android.api.InternalLogger;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class unlockFlashMode implements ImageCaptureExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
    private final InternalLogger TuitionPaymentFragmentbindingInflater1;
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final Reference<Context> b;

    @Override // ImageCaptureExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
    }

    @Override // ImageCaptureExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
    }

    public unlockFlashMode(Context context, String str, InternalLogger internalLogger) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        this.TuitionPaymentFragmentbindingInflater1 = internalLogger;
        this.b = new WeakReference(context);
    }

    @Override // ImageCaptureExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        Context context = this.b.get();
        if (context == null || !WorkManager.isInitialized()) {
            return;
        }
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        InternalLogger internalLogger = this.TuitionPaymentFragmentbindingInflater1;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        try {
            WorkManager workManager = WorkManager.getInstance(context);
            Intrinsics.checkNotNullExpressionValue(workManager, "");
            StringBuilder sb = new StringBuilder("DatadogBackgroundUpload/");
            sb.append(str);
            workManager.cancelAllWorkByTag(sb.toString());
        } catch (IllegalStateException e2) {
            internalLogger.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.core.internal.utils.WorkManagerUtilsKt$cancelUploadWorker$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Error cancelling the UploadWorker";
                }
            }, e2, false, null);
        }
    }

    @Override // ImageCaptureExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2
    public final void TuitionPaymentFragmentbindingInflater1() {
        Context context = this.b.get();
        if (context == null || !WorkManager.isInitialized()) {
            return;
        }
        ImageProxyDownsamplerDownsamplingMethod.TuitionPaymentFragmentbindingInflater1(context, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentbindingInflater1);
    }
}

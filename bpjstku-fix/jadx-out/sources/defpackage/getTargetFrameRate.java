package defpackage;

import android.app.Activity;
import defpackage.ImageAnalysisBlockingAnalyzer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00038\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"LgetTargetFrameRate;", "LSafeCloseImageReaderProxyExternalSyntheticLambda0;", "LRetryPolicy1;", "LPreviewExternalSyntheticLambda1;", "p0", "<init>", "(LPreviewExternalSyntheticLambda1;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()LPreviewExternalSyntheticLambda1;", "", "hashCode", "()I", "Landroid/app/Activity;", "", "onActivityPaused", "(Landroid/app/Activity;)V", "onActivityResumed", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LPreviewExternalSyntheticLambda1;", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class getTargetFrameRate extends SafeCloseImageReaderProxyExternalSyntheticLambda0 implements RetryPolicy1 {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final PreviewExternalSyntheticLambda1 b;

    public getTargetFrameRate(PreviewExternalSyntheticLambda1 previewExternalSyntheticLambda1) {
        Intrinsics.checkNotNullParameter(previewExternalSyntheticLambda1, "");
        this.b = previewExternalSyntheticLambda1;
    }

    @Override // defpackage.RetryPolicy1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from getter */
    public final PreviewExternalSyntheticLambda1 getB() {
        return this.b;
    }

    @Override // defpackage.SafeCloseImageReaderProxyExternalSyntheticLambda0, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(final Activity p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        super.onActivityResumed(p0);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1<ImageAnalysisBlockingAnalyzer, Unit>() { // from class: com.datadog.android.rum.internal.instrumentation.UserActionTrackingStrategyLegacy$onActivityResumed$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(imageAnalysisBlockingAnalyzer);
                return Unit.INSTANCE;
            }

            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer) {
                Intrinsics.checkNotNullParameter(imageAnalysisBlockingAnalyzer, "");
                this.this$0.b.b(p0.getWindow(), p0, imageAnalysisBlockingAnalyzer);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
    }

    @Override // defpackage.SafeCloseImageReaderProxyExternalSyntheticLambda0, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        super.onActivityPaused(p0);
        this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0.getWindow(), p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), p0 != null ? p0.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(p0, "");
        return Intrinsics.areEqual(this.b, ((getTargetFrameRate) p0).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        PreviewExternalSyntheticLambda1 previewExternalSyntheticLambda1 = this.b;
        StringBuilder sb = new StringBuilder("UserActionTrackingStrategyLegacy(");
        sb.append(previewExternalSyntheticLambda1);
        sb.append(")");
        return sb.toString();
    }
}

package defpackage;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.thread.BackPressuredBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0001\u0013B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u00020\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"LnativeConvertAndroid420ToABGR;", "Ljava/util/concurrent/ThreadPoolExecutor;", "LImageReaderProxys;", "Lcom/datadog/android/api/InternalLogger;", "p0", "", "p1", "Llambdanew1androidxcameracoreImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy;", "p2", "<init>", "(Lcom/datadog/android/api/InternalLogger;Ljava/lang/String;Llambdanew1androidxcameracoreImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy;)V", "Ljava/lang/Runnable;", "", "", "afterExecute", "(Ljava/lang/Runnable;Ljava/lang/Throwable;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/datadog/android/api/InternalLogger;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class nativeConvertAndroid420ToABGR extends ThreadPoolExecutor implements ImageReaderProxys {
    private static final long b = TimeUnit.SECONDS.toMillis(5);

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final InternalLogger TuitionPaymentFragmentbindingInflater1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nativeConvertAndroid420ToABGR(InternalLogger internalLogger, String str, lambdanew1androidxcameracoreImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy) {
        super(1, 1, b, TimeUnit.MILLISECONDS, new BackPressuredBlockingQueue(internalLogger, str, lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy), new nativeRotateYUV(str));
        Intrinsics.checkNotNullParameter(internalLogger, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy, "");
        this.TuitionPaymentFragmentbindingInflater1 = internalLogger;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected final void afterExecute(Runnable p0, Throwable p1) {
        super.afterExecute(p0, p1);
        nativeShiftPixel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0, p1, this.TuitionPaymentFragmentbindingInflater1);
    }
}

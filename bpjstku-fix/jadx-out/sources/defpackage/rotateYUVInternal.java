package defpackage;

import com.datadog.android.api.InternalLogger;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rotateYUVInternal extends ScheduledThreadPoolExecutor {
    private final lambdanew1androidxcameracoreImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy TuitionPaymentFragmentbindingInflater1;
    private final InternalLogger TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rotateYUVInternal(final String str, final InternalLogger internalLogger, final lambdanew1androidxcameracoreImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy) {
        super(1, new nativeRotateYUV(str), new RejectedExecutionHandler() { // from class: rotateYUV
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(final Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                InternalLogger internalLogger2 = internalLogger;
                String str2 = str;
                lambdanew1androidxcameracoreImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy2 = lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy;
                Intrinsics.checkNotNullParameter(internalLogger2, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy2, "");
                if (runnable != null) {
                    internalLogger2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.core.internal.thread.LoggingScheduledThreadPoolExecutor$1$1
                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final String invoke() {
                            return "Dropped scheduled item in LoggingScheduledThreadPoolExecutor queue: ".concat(String.valueOf(runnable));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    }, null, false, MapsKt.mapOf(TuplesKt.to("executor.context", str2)));
                    lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy2.TuitionPaymentFragmentbindingInflater1.invoke(runnable);
                }
            }
        });
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        Intrinsics.checkNotNullParameter(lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = internalLogger;
        this.TuitionPaymentFragmentbindingInflater1 = lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        nativeShiftPixel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(runnable, th, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }
}

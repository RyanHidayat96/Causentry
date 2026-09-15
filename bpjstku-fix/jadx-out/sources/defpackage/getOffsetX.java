package defpackage;

import android.content.Context;
import androidx.work.WorkManager;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.utils.ThreadExtKt$loggableStackTrace$1;
import com.google.android.gms.measurement.AppMeasurement;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0017\u001a\f\u0012\b\u0012\u0006*\u00020\u00040\u00040\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"LgetOffsetX;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "LImageAnalysisBlockingAnalyzer;", "p0", "Landroid/content/Context;", "p1", "<init>", "(LImageAnalysisBlockingAnalyzer;Landroid/content/Context;)V", "", "", "b", "(Ljava/lang/Throwable;)Ljava/lang/String;", "", "Ljava/lang/Thread;", "", "Ljava/lang/StackTraceElement;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()Ljava/util/Map;", "", "uncaughtException", "(Ljava/lang/Thread;Ljava/lang/Throwable;)V", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/Thread$UncaughtExceptionHandler;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LImageAnalysisBlockingAnalyzer;"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class getOffsetX implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    Thread.UncaughtExceptionHandler TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final ImageAnalysisBlockingAnalyzer b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final WeakReference<Context> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public getOffsetX(ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer, Context context) {
        Intrinsics.checkNotNullParameter(imageAnalysisBlockingAnalyzer, "");
        Intrinsics.checkNotNullParameter(context, "");
        this.b = imageAnalysisBlockingAnalyzer;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new WeakReference<>(context);
    }

    private static String b(Throwable p0) {
        String message = p0.getMessage();
        String str = message;
        if (str != null && !StringsKt.isBlank(str)) {
            return message;
        }
        String canonicalName = p0.getClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = p0.getClass().getSimpleName();
        }
        return "Application crash detected: ".concat(String.valueOf(canonicalName));
    }

    private final Map<Thread, StackTraceElement[]> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        try {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            Intrinsics.checkNotNullExpressionValue(allStackTraces, "");
            return allStackTraces;
        } catch (SecurityException e2) {
            this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.error.internal.DatadogExceptionHandler$safeGetAllStacktraces$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Failed to get all threads dump";
                }
            }, e2, false, null);
            return MapsKt.emptyMap();
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread p0, Throwable p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        String name = p0.getName();
        Thread.State state = p0.getState();
        Intrinsics.checkNotNullExpressionValue(state, "");
        String strTuitionPaymentFragmentbindingInflater1 = ImageProxyDownsampler1.TuitionPaymentFragmentbindingInflater1(state);
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = downsample.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p1);
        Intrinsics.checkNotNullExpressionValue(name, "");
        List listMutableListOf = CollectionsKt.mutableListOf(new isImageFormatSupported(name, strTuitionPaymentFragmentbindingInflater1, strTuitionPaymentFragmentspecialinlinedviewModeldefault2, true));
        Map<Thread, StackTraceElement[]> mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Thread, StackTraceElement[]> entry : mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.entrySet()) {
            if (!Intrinsics.areEqual(entry.getKey(), p0)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (((StackTraceElement[]) entry2.getValue()).length != 0) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        LinkedHashMap linkedHashMap3 = linkedHashMap2;
        ArrayList arrayList = new ArrayList(linkedHashMap3.size());
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            Thread thread = (Thread) entry3.getKey();
            String name2 = thread.getName();
            Intrinsics.checkNotNullExpressionValue(name2, "");
            Thread.State state2 = thread.getState();
            Intrinsics.checkNotNullExpressionValue(state2, "");
            String strTuitionPaymentFragmentbindingInflater2 = ImageProxyDownsampler1.TuitionPaymentFragmentbindingInflater1(state2);
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) entry3.getValue();
            Intrinsics.checkNotNullParameter(stackTraceElementArr, "");
            arrayList.add(new isImageFormatSupported(name2, strTuitionPaymentFragmentbindingInflater2, ArraysKt.joinToString$default(stackTraceElementArr, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, ThreadExtKt$loggableStackTrace$1.TuitionPaymentFragmentbindingInflater1, 30, (Object) null), false));
        }
        List listPlus = CollectionsKt.plus((Collection) listMutableListOf, (Iterable) arrayList);
        ImageAnalysisAbstractAnalyzerExternalSyntheticLambda1 imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B = this.b.b("logs");
        if (imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B != null) {
            String name3 = p0.getName();
            Intrinsics.checkNotNullExpressionValue(name3, "");
            imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new getSessionProcessor.TuitionPaymentFragmentbindingInflater1(name3, p1, System.currentTimeMillis(), b(p1), AppMeasurement.CRASH_ORIGIN, listPlus));
        } else {
            this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.INFO, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.error.internal.DatadogExceptionHandler$uncaughtException$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Logs feature is not registered, won't report crash as log.";
                }
            }, null, false, null);
        }
        ImageAnalysisAbstractAnalyzerExternalSyntheticLambda1 imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B2 = this.b.b("rum");
        if (imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B2 != null) {
            imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new getSessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p1, b(p1), listPlus));
        } else {
            this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.INFO, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.error.internal.DatadogExceptionHandler$uncaughtException$2
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "RUM feature is not registered, won't report crash as RUM event.";
                }
            }, null, false, null);
        }
        ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer = this.b;
        if (imageAnalysisBlockingAnalyzer instanceof ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0) {
            ExecutorService executorServiceOnTransact = ((ImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxyExternalSyntheticLambda0) imageAnalysisBlockingAnalyzer).onTransact();
            ThreadPoolExecutor threadPoolExecutor = executorServiceOnTransact instanceof ThreadPoolExecutor ? (ThreadPoolExecutor) executorServiceOnTransact : null;
            if (threadPoolExecutor != null) {
                InternalLogger internalLoggerTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                Intrinsics.checkNotNullParameter(threadPoolExecutor, "");
                Intrinsics.checkNotNullParameter(internalLoggerTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                long jNanoTime = System.nanoTime();
                long nanos = TimeUnit.MILLISECONDS.toNanos(100L);
                long jCoerceIn = RangesKt.coerceIn(100L, 0L, 10L);
                while (true) {
                    Intrinsics.checkNotNullParameter(threadPoolExecutor, "");
                    if (threadPoolExecutor.getTaskCount() - threadPoolExecutor.getCompletedTaskCount() <= 0) {
                        break;
                    }
                    boolean zB = nativeShiftPixel.b(jCoerceIn, internalLoggerTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    if (System.nanoTime() - jNanoTime >= nanos || zB) {
                        Intrinsics.checkNotNullParameter(threadPoolExecutor, "");
                        if (threadPoolExecutor.getTaskCount() - threadPoolExecutor.getCompletedTaskCount() <= 0) {
                            break;
                        }
                        this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.error.internal.DatadogExceptionHandler$uncaughtException$3
                            @Override // kotlin.jvm.functions.Function0
                            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                            public final String invoke() {
                                return "Datadog SDK is in an unexpected state due to an ongoing crash. Some events could be lost.";
                            }
                        }, null, false, null);
                        break;
                    }
                }
            }
        }
        Context context = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get();
        if (context != null && WorkManager.isInitialized()) {
            ImageProxyDownsamplerDownsamplingMethod.TuitionPaymentFragmentbindingInflater1(context, this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(p0, p1);
        }
    }
}

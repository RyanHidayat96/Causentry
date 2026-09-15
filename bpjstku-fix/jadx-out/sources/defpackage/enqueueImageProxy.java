package defpackage;

import android.os.Handler;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.utils.ThreadExtKt$loggableStackTrace$1;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum.RumErrorSource;
import com.datadog.android.rum.internal.anr.ANRException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0002\u0012\u0017B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0012\u001a\u00020\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001d"}, d2 = {"LenqueueImageProxy;", "Ljava/lang/Runnable;", "LImageAnalysisBlockingAnalyzer;", "p0", "Landroid/os/Handler;", "p1", "", "p2", "p3", "<init>", "(LImageAnalysisBlockingAnalyzer;Landroid/os/Handler;JJ)V", "", "run", "()V", "", "Ljava/lang/Thread;", "", "Ljava/lang/StackTraceElement;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()Ljava/util/Map;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "J", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "Landroid/os/Handler;", "asBinder", "LImageAnalysisBlockingAnalyzer;", "", "Z"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class enqueueImageProxy implements Runnable {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final long TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final long TuitionPaymentFragmentbindingInflater1;
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final ImageAnalysisBlockingAnalyzer b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Handler TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    private enqueueImageProxy(ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer, Handler handler, long j, long j2) {
        Intrinsics.checkNotNullParameter(imageAnalysisBlockingAnalyzer, "");
        Intrinsics.checkNotNullParameter(handler, "");
        this.b = imageAnalysisBlockingAnalyzer;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = handler;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = j;
        this.TuitionPaymentFragmentbindingInflater1 = j2;
    }

    public /* synthetic */ enqueueImageProxy(ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer, Handler handler, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageAnalysisBlockingAnalyzer, handler, (i & 4) != 0 ? 5000L : j, (i & 8) != 0 ? 500L : j2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (!Thread.interrupted() && !this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                synchronized (tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                    try {
                        if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.post(tuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                            return;
                        }
                        tuitionPaymentFragmentspecialinlinedviewModeldefault3.wait(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        if (!tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                            Thread thread = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getLooper().getThread();
                            Intrinsics.checkNotNullExpressionValue(thread, "");
                            ANRException aNRException = new ANRException(thread);
                            String name = thread.getName();
                            Intrinsics.checkNotNullExpressionValue(name, "");
                            Thread.State state = thread.getState();
                            Intrinsics.checkNotNullExpressionValue(state, "");
                            List listMutableListOf = CollectionsKt.mutableListOf(new isImageFormatSupported(name, ImageProxyDownsampler1.TuitionPaymentFragmentbindingInflater1(state), downsample.TuitionPaymentFragmentspecialinlinedviewModeldefault2(aNRException), false));
                            Map<Thread, StackTraceElement[]> mapTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Map.Entry<Thread, StackTraceElement[]> entry : mapTuitionPaymentFragmentspecialinlinedviewModeldefault3.entrySet()) {
                                if (!Intrinsics.areEqual(entry.getKey(), thread)) {
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
                            Iterator it = linkedHashMap3.entrySet().iterator();
                            while (it.hasNext()) {
                                Thread thread2 = (Thread) ((Map.Entry) it.next()).getKey();
                                String name2 = thread2.getName();
                                Intrinsics.checkNotNullExpressionValue(name2, "");
                                Thread.State state2 = thread2.getState();
                                Intrinsics.checkNotNullExpressionValue(state2, "");
                                String strTuitionPaymentFragmentbindingInflater1 = ImageProxyDownsampler1.TuitionPaymentFragmentbindingInflater1(state2);
                                StackTraceElement[] stackTrace = thread2.getStackTrace();
                                Intrinsics.checkNotNullExpressionValue(stackTrace, "");
                                Intrinsics.checkNotNullParameter(stackTrace, "");
                                arrayList.add(new isImageFormatSupported(name2, strTuitionPaymentFragmentbindingInflater1, ArraysKt.joinToString$default(stackTrace, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, ThreadExtKt$loggableStackTrace$1.TuitionPaymentFragmentbindingInflater1, 30, (Object) null), false));
                            }
                            GlobalRumMonitor.b(this.b).TuitionPaymentFragmentspecialinlinedviewModeldefault2("Application Not Responding", RumErrorSource.SOURCE, aNRException, MapsKt.mapOf(TuplesKt.to("_dd.error.threads", CollectionsKt.plus((Collection) listMutableListOf, (Iterable) arrayList))));
                            tuitionPaymentFragmentspecialinlinedviewModeldefault3.wait();
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                long j = this.TuitionPaymentFragmentbindingInflater1;
                if (j > 0) {
                    Thread.sleep(j);
                }
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    private final Map<Thread, StackTraceElement[]> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        try {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            Intrinsics.checkNotNullExpressionValue(allStackTraces, "");
            return allStackTraces;
        } catch (SecurityException e2) {
            this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.rum.internal.anr.ANRDetectorRunnable$safeGetAllStacktraces$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Failed to get all stack traces.";
                }
            }, e2, false, null);
            return MapsKt.emptyMap();
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Runnable {
        boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
                notifyAll();
            }
        }
    }
}

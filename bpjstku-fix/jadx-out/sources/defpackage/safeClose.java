package defpackage;

import android.app.Activity;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.rum.RumMonitor;
import com.datadog.android.rum.internal.utils.ComponentPredicateExtKt$runIfValid$1;
import com.datadog.android.rum.tracking.ActivityViewTrackingStrategy$getRumMonitor$1;
import com.datadog.android.rum.tracking.ViewTrackingStrategy;
import defpackage.ImageAnalysisBlockingAnalyzer;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0015\u0010\u001a\u001a\u00020\u00178CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"LsafeClose;", "LSafeCloseImageReaderProxyExternalSyntheticLambda0;", "Lcom/datadog/android/rum/tracking/ViewTrackingStrategy;", "", "p0", "LSingleCloseImageProxy;", "Landroid/app/Activity;", "p1", "<init>", "(ZLSingleCloseImageProxy;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "onActivityResumed", "(Landroid/app/Activity;)V", "onActivityStopped", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LSingleCloseImageProxy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/util/concurrent/ScheduledExecutorService;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lkotlin/Lazy;", "b", "asInterface", "Z", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class safeClose extends SafeCloseImageReaderProxyExternalSyntheticLambda0 implements ViewTrackingStrategy {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final SingleCloseImageProxy<Activity> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final boolean TuitionPaymentFragmentbindingInflater1;

    public /* synthetic */ safeClose(boolean z, isClosed isclosed, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? new isClosed() : isclosed);
    }

    public safeClose(boolean z, SingleCloseImageProxy<Activity> singleCloseImageProxy) {
        Intrinsics.checkNotNullParameter(singleCloseImageProxy, "");
        this.TuitionPaymentFragmentbindingInflater1 = z;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = singleCloseImageProxy;
        this.b = LazyKt.lazy(new Function0<ScheduledExecutorService>() { // from class: com.datadog.android.rum.tracking.ActivityViewTrackingStrategy$executor$2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
            public final ScheduledExecutorService invoke() {
                ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer = this.this$0.b;
                if (imageAnalysisBlockingAnalyzer == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    imageAnalysisBlockingAnalyzer = null;
                }
                return imageAnalysisBlockingAnalyzer.TuitionPaymentFragmentbindingInflater1("rum-activity-tracking");
            }

            {
                super(0);
            }
        });
    }

    @Override // defpackage.SafeCloseImageReaderProxyExternalSyntheticLambda0, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity p0) {
        Map<String, ? extends Object> mapEmptyMap;
        Intrinsics.checkNotNullParameter(p0, "");
        super.onActivityResumed(p0);
        SingleCloseImageProxy<Activity> singleCloseImageProxy = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        InternalLogger internalLoggerB = b();
        if (singleCloseImageProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0)) {
            try {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
                String strB = getDefaultRetryDelayInMillis.b(p0);
                if (this.TuitionPaymentFragmentbindingInflater1) {
                    mapEmptyMap = b(p0.getIntent());
                } else {
                    mapEmptyMap = MapsKt.emptyMap();
                }
                RumMonitor rumMonitor = (RumMonitor) TuitionPaymentFragmentspecialinlinedviewModeldefault2(ActivityViewTrackingStrategy$getRumMonitor$1.TuitionPaymentFragmentbindingInflater1);
                if (rumMonitor != null) {
                    rumMonitor.b(p0, strB, mapEmptyMap);
                }
            } catch (Exception e2) {
                internalLoggerB.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), ComponentPredicateExtKt$runIfValid$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3, e2, false, null);
            }
        }
    }

    @Override // defpackage.SafeCloseImageReaderProxyExternalSyntheticLambda0, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(final Activity p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        super.onActivityStopped(p0);
        ImageProxyDownsampler.TuitionPaymentFragmentbindingInflater1((ScheduledExecutorService) this.b.getValue(), "Delayed view stop", 200L, TimeUnit.MILLISECONDS, b(), new Runnable() { // from class: SettableImageProxy
            @Override // java.lang.Runnable
            public final void run() {
                safeClose.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, p0);
            }
        });
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), p0 != null ? p0.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(p0, "");
        safeClose safeclose = (safeClose) p0;
        return this.TuitionPaymentFragmentbindingInflater1 == safeclose.TuitionPaymentFragmentbindingInflater1 && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, safeclose.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    public final int hashCode() {
        return (Boolean.hashCode(this.TuitionPaymentFragmentbindingInflater1) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(safeClose safeclose, Activity activity) {
        Intrinsics.checkNotNullParameter(safeclose, "");
        Intrinsics.checkNotNullParameter(activity, "");
        SingleCloseImageProxy<Activity> singleCloseImageProxy = safeclose.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        InternalLogger internalLoggerB = safeclose.b();
        if (singleCloseImageProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(activity)) {
            try {
                RumMonitor rumMonitor = (RumMonitor) safeclose.TuitionPaymentFragmentspecialinlinedviewModeldefault2(ActivityViewTrackingStrategy$getRumMonitor$1.TuitionPaymentFragmentbindingInflater1);
                if (rumMonitor != null) {
                    rumMonitor.TuitionPaymentFragmentspecialinlinedviewModeldefault3(activity, MapsKt.emptyMap());
                }
            } catch (Exception e2) {
                internalLoggerB.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), ComponentPredicateExtKt$runIfValid$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3, e2, false, null);
            }
        }
    }
}

package defpackage;

import android.app.Activity;
import android.app.Application;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import androidx.metrics.performance.FrameData;
import androidx.metrics.performance.JankStats;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.rum.internal.vitals.JankStatsActivityLifecycleListener$onActivityStopped$2;
import com.google.firebase.messaging.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0002$\"B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0010H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0017\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0018\u0010\u0013J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0019\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u001a\u0010\u0015J\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR,\u0010$\u001a\u001a\u0012\u0004\u0012\u00020\u001f\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0!0 0\u001e8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020%0\u001e8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b&\u0010#R\u0016\u0010)\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020-8\u0000@\u0001X\u0081\f¢\u0006\u0006\n\u0004\b)\u0010.R\u001c\u00103\u001a\b\u0018\u000100R\u00020\u00008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010'\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00101\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b3\u00106R\u0016\u0010&\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00104\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b9\u0010:"}, d2 = {"LRetryPolicyExecutionStateStatus;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroidx/metrics/performance/JankStats$OnFrameListener;", "LgetImageReaderProxy;", "p0", "Lcom/datadog/android/api/InternalLogger;", "p1", "LRetryPolicyRetryConfigBuilder;", "p2", "", "p3", "LisSupportedRotationDegrees;", "p4", "<init>", "(LgetImageReaderProxy;Lcom/datadog/android/api/InternalLogger;LRetryPolicyRetryConfigBuilder;DLisSupportedRotationDegrees;)V", "Landroid/app/Activity;", "Landroid/os/Bundle;", "", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityDestroyed", "(Landroid/app/Activity;)V", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "onActivityStarted", "onActivityStopped", "Landroidx/metrics/performance/FrameData;", "onFrame", "(Landroidx/metrics/performance/FrameData;)V", "Ljava/util/WeakHashMap;", "Landroid/view/Window;", "", "Ljava/lang/ref/WeakReference;", "TuitionPaymentFragmentbindingInflater1", "Ljava/util/WeakHashMap;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Landroidx/metrics/performance/JankStats;", "asBinder", "asInterface", "LisSupportedRotationDegrees;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Landroid/view/Display;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Landroid/view/Display;", "", "J", "b", "LRetryPolicyExecutionStateStatus$TuitionPaymentFragmentbindingInflater1;", "a", "LRetryPolicyExecutionStateStatus$TuitionPaymentFragmentbindingInflater1;", "d", "g", "Lcom/datadog/android/api/InternalLogger;", "LRetryPolicyRetryConfigBuilder;", "cancel", "D", "notify", "LgetImageReaderProxy;"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class RetryPolicyExecutionStateStatus implements Application.ActivityLifecycleCallbacks, JankStats.OnFrameListener {
    private static final double b = TimeUnit.SECONDS.toNanos(1);

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final WeakHashMap<Window, List<WeakReference<Activity>>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public Display TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    long b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private TuitionPaymentFragmentbindingInflater1 d;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final WeakHashMap<Window, JankStats> TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private isSupportedRotationDegrees TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private double asBinder;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final RetryPolicyRetryConfigBuilder a;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InternalLogger asInterface;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final getImageReaderProxy g;

    private RetryPolicyExecutionStateStatus(getImageReaderProxy getimagereaderproxy, InternalLogger internalLogger, RetryPolicyRetryConfigBuilder retryPolicyRetryConfigBuilder, double d, isSupportedRotationDegrees issupportedrotationdegrees) {
        Intrinsics.checkNotNullParameter(getimagereaderproxy, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        Intrinsics.checkNotNullParameter(retryPolicyRetryConfigBuilder, "");
        Intrinsics.checkNotNullParameter(issupportedrotationdegrees, "");
        this.g = getimagereaderproxy;
        this.asInterface = internalLogger;
        this.a = retryPolicyRetryConfigBuilder;
        this.asBinder = d;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = issupportedrotationdegrees;
        this.TuitionPaymentFragmentbindingInflater1 = new WeakHashMap<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new WeakHashMap<>();
        this.b = 16666666L;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RetryPolicyExecutionStateStatus(getImageReaderProxy getimagereaderproxy, InternalLogger internalLogger, RetryPolicyRetryConfigBuilder retryPolicyRetryConfigBuilder, double d, isSupportedRotationDegrees issupportedrotationdegrees, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            RetryPolicyRetryConfigBuilder.Companion companion = RetryPolicyRetryConfigBuilder.INSTANCE;
            retryPolicyRetryConfigBuilder = RetryPolicyRetryConfigBuilder.Companion.TuitionPaymentFragmentbindingInflater1();
        }
        RetryPolicyRetryConfigBuilder retryPolicyRetryConfigBuilder2 = retryPolicyRetryConfigBuilder;
        double d2 = (i & 8) != 0 ? 60.0d : d;
        if ((i & 16) != 0) {
            isSupportedRotationDegrees.Companion companion2 = isSupportedRotationDegrees.INSTANCE;
            issupportedrotationdegrees = isSupportedRotationDegrees.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
        this(getimagereaderproxy, internalLogger, retryPolicyRetryConfigBuilder2, d2, issupportedrotationdegrees);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        final Window window = p0.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "");
        ArrayList arrayList = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(window);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        arrayList.add(new WeakReference<>(p0));
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.put(window, arrayList);
        boolean zContainsKey = this.TuitionPaymentFragmentbindingInflater1.containsKey(window);
        JankStats jankStats = this.TuitionPaymentFragmentbindingInflater1.get(window);
        if (jankStats != null) {
            this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.DEBUG, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.rum.internal.vitals.JankStatsActivityLifecycleListener$trackWindowJankStats$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Resuming jankStats for window ".concat(String.valueOf(window));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, null, false, null);
            jankStats.setTrackingEnabled(true);
        } else {
            this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.DEBUG, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.rum.internal.vitals.JankStatsActivityLifecycleListener$trackWindowJankStats$2
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Starting jankStats for window ".concat(String.valueOf(window));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, null, false, null);
            JankStats jankStatsTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.a.TuitionPaymentFragmentspecialinlinedviewModeldefault3(window, this, this.asInterface);
            if (jankStatsTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                this.TuitionPaymentFragmentbindingInflater1.put(window, jankStatsTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            } else {
                this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.rum.internal.vitals.JankStatsActivityLifecycleListener$trackWindowJankStats$3
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "Unable to create JankStats";
                    }
                }, null, false, null);
            }
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b() < 31 || zContainsKey) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b() == 30) {
                Object systemService = p0.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
                Intrinsics.checkNotNull(systemService, "");
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = ((DisplayManager) systemService).getDisplay(0);
                return;
            }
            return;
        }
        if (this.d == null) {
            this.d = new TuitionPaymentFragmentbindingInflater1();
        }
        Handler handler = new Handler(Looper.getMainLooper());
        View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView != null && viewPeekDecorView.isHardwareAccelerated()) {
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.d;
            if (tuitionPaymentFragmentbindingInflater1 != null) {
                try {
                    window.addOnFrameMetricsAvailableListener(tuitionPaymentFragmentbindingInflater1, handler);
                    return;
                } catch (IllegalStateException e2) {
                    this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.rum.internal.vitals.JankStatsActivityLifecycleListener$registerMetricListener$1$1
                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
                        public final String invoke() {
                            return "Unable to attach JankStatsListener to window";
                        }
                    }, e2, false, null);
                    return;
                }
            }
            return;
        }
        this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.rum.internal.vitals.JankStatsActivityLifecycleListener$registerMetricListener$2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Unable to attach JankStatsListener to window, decorView is null or not hardware accelerated";
            }
        }, null, false, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        final Window window = p0.getWindow();
        if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.containsKey(window)) {
            this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.rum.internal.vitals.JankStatsActivityLifecycleListener$onActivityStopped$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Activity stopped but window was not tracked";
                }
            }, null, false, null);
        }
        ArrayList arrayList = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(window);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        CollectionsKt.removeAll((List) arrayList, (Function1) new JankStatsActivityLifecycleListener$onActivityStopped$2(p0));
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.put(window, arrayList);
        if (arrayList.isEmpty()) {
            this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.DEBUG, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.rum.internal.vitals.JankStatsActivityLifecycleListener$onActivityStopped$3
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Disabling jankStats for window ".concat(String.valueOf(window));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, null, false, null);
            try {
                JankStats jankStats = this.TuitionPaymentFragmentbindingInflater1.get(window);
                if (jankStats != null) {
                    if (jankStats.getIsTrackingEnabled()) {
                        jankStats.setTrackingEnabled(false);
                    } else {
                        this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.TELEMETRY, new Function0<String>() { // from class: com.datadog.android.rum.internal.vitals.JankStatsActivityLifecycleListener$onActivityStopped$4$1
                            @Override // kotlin.jvm.functions.Function0
                            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
                            public final String invoke() {
                                return "Trying to disable JankStats instance which was already disabled before, this shouldn't happen.";
                            }
                        }, null, false, null);
                    }
                }
            } catch (IllegalArgumentException e2) {
                this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.TELEMETRY, new Function0<String>() { // from class: com.datadog.android.rum.internal.vitals.JankStatsActivityLifecycleListener$onActivityStopped$5
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "Failed to disable JankStats tracking";
                    }
                }, e2, false, null);
            } catch (NullPointerException e3) {
                this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.TELEMETRY, new Function0<String>() { // from class: com.datadog.android.rum.internal.vitals.JankStatsActivityLifecycleListener$onActivityStopped$6
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "Failed to disable JankStats tracking";
                    }
                }, e3, false, null);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        List<WeakReference<Activity>> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(p0.getWindow());
        if (list == null || list.isEmpty()) {
            this.TuitionPaymentFragmentbindingInflater1.remove(p0.getWindow());
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.remove(p0.getWindow());
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b() >= 31) {
                Window window = p0.getWindow();
                Intrinsics.checkNotNullExpressionValue(window, "");
                try {
                    window.removeOnFrameMetricsAvailableListener(this.d);
                } catch (IllegalArgumentException e2) {
                    this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.rum.internal.vitals.JankStatsActivityLifecycleListener$unregisterMetricListener$1
                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final String invoke() {
                            return "Unable to detach JankStatsListener to window, most probably because it wasn't attached";
                        }
                    }, e2, false, null);
                }
            }
        }
    }

    @Override // androidx.metrics.performance.JankStats.OnFrameListener
    public final void onFrame(FrameData p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        double frameDurationUiNanos = p0.getFrameDurationUiNanos();
        if (frameDurationUiNanos > 0.0d) {
            double d = b;
            double d2 = d / frameDurationUiNanos;
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b() >= 31) {
                this.asBinder = d / this.b;
            } else if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b() == 30) {
                Display display = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                this.asBinder = display != null ? display.getRefreshRate() : 60.0d;
            }
            double dCoerceAtMost = RangesKt.coerceAtMost(d2 * (60.0d / this.asBinder), 60.0d);
            if (dCoerceAtMost > 1.0d) {
                this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(dCoerceAtMost);
            }
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public final class TuitionPaymentFragmentbindingInflater1 implements Window.OnFrameMetricsAvailableListener {
        public TuitionPaymentFragmentbindingInflater1() {
        }

        @Override // android.view.Window.OnFrameMetricsAvailableListener
        public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
            Intrinsics.checkNotNullParameter(window, "");
            Intrinsics.checkNotNullParameter(frameMetrics, "");
            RetryPolicyExecutionStateStatus.this.b = frameMetrics.getMetric(13);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity p0, Bundle p1) {
        Intrinsics.checkNotNullParameter(p0, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity p0) {
        Intrinsics.checkNotNullParameter(p0, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity p0) {
        Intrinsics.checkNotNullParameter(p0, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity p0, Bundle p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
    }
}

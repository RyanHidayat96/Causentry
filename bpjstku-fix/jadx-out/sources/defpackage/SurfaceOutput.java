package defpackage;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p005navigation.NavController;
import androidx.p005navigation.NavDestination;
import androidx.p005navigation.Navigation;
import androidx.p005navigation.fragment.NavHostFragment;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum.RumMonitor;
import com.datadog.android.rum.internal.utils.ComponentPredicateExtKt$runIfValid$1;
import com.datadog.android.rum.tracking.ViewTrackingStrategy;
import defpackage.ImageAnalysisAbstractAnalyzerExternalSyntheticLambda1;
import defpackage.ImageAnalysisBlockingAnalyzer;
import defpackage.SurfaceOutput;
import defpackage.removeStaleData;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001bB'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\rH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0012\u0010\u0010J)\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u0013*\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020!0\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001aR\u0018\u0010%\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'"}, d2 = {"LSurfaceOutput;", "LSafeCloseImageReaderProxyExternalSyntheticLambda0;", "Lcom/datadog/android/rum/tracking/ViewTrackingStrategy;", "Landroidx/navigation/NavController$OnDestinationChangedListener;", "", "p0", "", "p1", "LSingleCloseImageProxy;", "Landroidx/navigation/NavDestination;", "p2", "<init>", "(IZLSingleCloseImageProxy;)V", "Landroid/app/Activity;", "", "onActivityPaused", "(Landroid/app/Activity;)V", "onActivityStarted", "onActivityStopped", "Landroidx/navigation/NavController;", "Landroid/os/Bundle;", "onDestinationChanged", "(Landroidx/navigation/NavController;Landroidx/navigation/NavDestination;Landroid/os/Bundle;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/app/Activity;I)Landroidx/navigation/NavController;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LSingleCloseImageProxy;", "TuitionPaymentFragmentbindingInflater1", "Ljava/util/WeakHashMap;", "LSurfaceOutput$TuitionPaymentFragmentbindingInflater1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/util/WeakHashMap;", "I", "Landroidx/fragment/app/Fragment;", "g", "a", "Landroid/app/Activity;", "b", "d", "Z", "asBinder"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class SurfaceOutput extends SafeCloseImageReaderProxyExternalSyntheticLambda0 implements ViewTrackingStrategy, NavController.OnDestinationChangedListener {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final SingleCloseImageProxy<NavDestination> TuitionPaymentFragmentbindingInflater1;
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private WeakHashMap<Activity, TuitionPaymentFragmentbindingInflater1> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Activity b;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean asBinder;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final SingleCloseImageProxy<Fragment> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public /* synthetic */ SurfaceOutput(int i, boolean z, setOnImageCloseListener setonimagecloselistener, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z, (i2 & 4) != 0 ? new setOnImageCloseListener() : setonimagecloselistener);
    }

    private SurfaceOutput(int i, boolean z, SingleCloseImageProxy<NavDestination> singleCloseImageProxy) {
        Intrinsics.checkNotNullParameter(singleCloseImageProxy, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i;
        this.asBinder = z;
        this.TuitionPaymentFragmentbindingInflater1 = singleCloseImageProxy;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new WeakHashMap<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new b();
    }

    public static final class b implements SingleCloseImageProxy<Fragment> {
        b() {
        }

        @Override // defpackage.SingleCloseImageProxy
        public final /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(Fragment fragment) {
            Fragment fragment2 = fragment;
            Intrinsics.checkNotNullParameter(fragment2, "");
            return !NavHostFragment.class.isAssignableFrom(fragment2.getClass());
        }

        @Override // defpackage.SingleCloseImageProxy
        public final /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault3(Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "");
            return null;
        }
    }

    @Override // defpackage.SafeCloseImageReaderProxyExternalSyntheticLambda0, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(final Activity p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        super.onActivityStarted(p0);
        this.b = p0;
        if (p0 != null) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1<ImageAnalysisBlockingAnalyzer, Unit>() { // from class: com.datadog.android.rum.tracking.NavigationViewTrackingStrategy$startTracking$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ Unit invoke(ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3(imageAnalysisBlockingAnalyzer);
                    return Unit.INSTANCE;
                }

                public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer) {
                    Intrinsics.checkNotNullParameter(imageAnalysisBlockingAnalyzer, "");
                    ImageAnalysisAbstractAnalyzerExternalSyntheticLambda1 imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B = imageAnalysisBlockingAnalyzer.b("rum");
                    removeStaleData removestaledata = imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B != null ? (removeStaleData) imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B.b() : null;
                    Activity activity = p0;
                    FragmentActivity fragmentActivity = activity instanceof FragmentActivity ? (FragmentActivity) activity : null;
                    NavController navControllerTuitionPaymentFragmentspecialinlinedviewModeldefault2 = SurfaceOutput.TuitionPaymentFragmentspecialinlinedviewModeldefault2(activity, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    if (fragmentActivity == null || navControllerTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null || removestaledata == null) {
                        return;
                    }
                    SurfaceOutput.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new SurfaceOutput.TuitionPaymentFragmentbindingInflater1(navControllerTuitionPaymentFragmentspecialinlinedviewModeldefault2, new Function1<Fragment, Map<String, ? extends Object>>() { // from class: com.datadog.android.rum.tracking.NavigationViewTrackingStrategy$startTracking$1$navControllerFragmentCallbacks$1
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final Map<String, Object> invoke(Fragment fragment) {
                            Intrinsics.checkNotNullParameter(fragment, "");
                            return MapsKt.emptyMap();
                        }
                    }, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, removestaledata);
                    Activity activity2 = this.b;
                    Intrinsics.checkNotNull(activity2, "");
                    tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2((FragmentActivity) activity2, imageAnalysisBlockingAnalyzer);
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.put(this.b, tuitionPaymentFragmentbindingInflater1);
                    navControllerTuitionPaymentFragmentspecialinlinedviewModeldefault2.addOnDestinationChangedListener(this);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            });
        }
    }

    @Override // defpackage.SafeCloseImageReaderProxyExternalSyntheticLambda0, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity p0) {
        NavController navControllerTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1Remove;
        Intrinsics.checkNotNullParameter(p0, "");
        super.onActivityStopped(p0);
        Activity activity = this.b;
        if (activity != null && (navControllerTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(activity, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) != null) {
            navControllerTuitionPaymentFragmentspecialinlinedviewModeldefault2.removeOnDestinationChangedListener(this);
            if (FragmentActivity.class.isAssignableFrom(activity.getClass()) && (tuitionPaymentFragmentbindingInflater1Remove = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.remove(activity)) != null) {
                FragmentActivity fragmentActivity = (FragmentActivity) activity;
                Intrinsics.checkNotNullParameter(fragmentActivity, "");
                fragmentActivity.getSupportFragmentManager().unregisterFragmentLifecycleCallbacks(tuitionPaymentFragmentbindingInflater1Remove);
            }
        }
        this.b = null;
    }

    @Override // defpackage.SafeCloseImageReaderProxyExternalSyntheticLambda0, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity p0) {
        NavDestination currentDestination;
        Intrinsics.checkNotNullParameter(p0, "");
        super.onActivityPaused(p0);
        RumMonitor rumMonitor = (RumMonitor) TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1<ImageAnalysisBlockingAnalyzer, RumMonitor>() { // from class: com.datadog.android.rum.tracking.NavigationViewTrackingStrategy$onActivityPaused$rumMonitor$1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
            public final RumMonitor invoke(ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer) {
                Intrinsics.checkNotNullParameter(imageAnalysisBlockingAnalyzer, "");
                return GlobalRumMonitor.b(imageAnalysisBlockingAnalyzer);
            }
        });
        NavController navControllerTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        if (navControllerTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null || (currentDestination = navControllerTuitionPaymentFragmentspecialinlinedviewModeldefault2.getCurrentDestination()) == null || rumMonitor == null) {
            return;
        }
        rumMonitor.TuitionPaymentFragmentspecialinlinedviewModeldefault3(currentDestination, MapsKt.emptyMap());
    }

    @Override // androidx.navigation.NavController.OnDestinationChangedListener
    public final void onDestinationChanged(NavController p0, NavDestination p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        RumMonitor rumMonitor = (RumMonitor) TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1<ImageAnalysisBlockingAnalyzer, RumMonitor>() { // from class: com.datadog.android.rum.tracking.NavigationViewTrackingStrategy$onDestinationChanged$rumMonitor$1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
            public final RumMonitor invoke(ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer) {
                Intrinsics.checkNotNullParameter(imageAnalysisBlockingAnalyzer, "");
                return GlobalRumMonitor.b(imageAnalysisBlockingAnalyzer);
            }
        });
        SingleCloseImageProxy<NavDestination> singleCloseImageProxy = this.TuitionPaymentFragmentbindingInflater1;
        InternalLogger internalLoggerB = b();
        if (singleCloseImageProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p1)) {
            try {
                Map<String, ? extends Object> mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asBinder ? TuitionPaymentFragmentspecialinlinedviewModeldefault2(p2) : MapsKt.emptyMap();
                this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p1);
                String strB = getDefaultRetryDelayInMillis.b(p1);
                if (rumMonitor != null) {
                    rumMonitor.b(p1, strB, mapTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                }
            } catch (Exception e2) {
                internalLoggerB.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), ComponentPredicateExtKt$runIfValid$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3, e2, false, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    public static NavController TuitionPaymentFragmentspecialinlinedviewModeldefault2(Activity activity, int i) {
        NavController navController;
        if (activity instanceof FragmentActivity) {
            try {
                Fragment fragmentFindFragmentById = ((FragmentActivity) activity).getSupportFragmentManager().findFragmentById(i);
                NavHostFragment navHostFragment = fragmentFindFragmentById instanceof NavHostFragment ? (NavHostFragment) fragmentFindFragmentById : null;
                if (navHostFragment != null) {
                    navController = navHostFragment.getNavController();
                } else {
                    navController = null;
                }
            } catch (IllegalArgumentException | IllegalStateException unused) {
                return null;
            }
        } else {
            navController = null;
        }
        if (navController != null) {
            return navController;
        }
        NavController navControllerFindNavController = Navigation.findNavController(activity, i);
        Intrinsics.checkNotNullExpressionValue(navControllerFindNavController, "");
        return navControllerFindNavController;
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012 \u0010\t\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00060\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012"}, d2 = {"LSurfaceOutput$TuitionPaymentFragmentbindingInflater1;", "LResolutionInfoResolutionInfoInternal;", "Landroidx/navigation/NavController;", "p0", "Lkotlin/Function1;", "Landroidx/fragment/app/Fragment;", "", "", "", "p1", "LSingleCloseImageProxy;", "p2", "LremoveStaleData;", "p3", "<init>", "(Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;LSingleCloseImageProxy;LremoveStaleData;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroidx/fragment/app/Fragment;)Ljava/lang/Object;", "Landroidx/navigation/NavController;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class TuitionPaymentFragmentbindingInflater1 extends ResolutionInfoResolutionInfoInternal {
        private static final Object b = new Object();

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
        private final NavController TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TuitionPaymentFragmentbindingInflater1(NavController navController, Function1<? super Fragment, ? extends Map<String, ? extends Object>> function1, SingleCloseImageProxy<Fragment> singleCloseImageProxy, removeStaleData removestaledata) {
            super(function1, singleCloseImageProxy, removestaledata, new isVerboseEnabled());
            Intrinsics.checkNotNullParameter(navController, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(singleCloseImageProxy, "");
            Intrinsics.checkNotNullParameter(removestaledata, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = navController;
        }

        @Override // defpackage.ResolutionInfoResolutionInfoInternal
        public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Fragment p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            NavDestination currentDestination = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getCurrentDestination();
            return currentDestination == null ? b : currentDestination;
        }
    }
}

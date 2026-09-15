package defpackage;

import android.app.Activity;
import android.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum.RumMonitor;
import com.datadog.android.rum.tracking.ViewTrackingStrategy;
import defpackage.ImageAnalysisAbstractAnalyzerExternalSyntheticLambda1;
import defpackage.ImageAnalysisBlockingAnalyzer;
import defpackage.ProcessingException;
import defpackage.ResolutionInfoResolutionInfoInternal;
import defpackage.RetryPolicyExternalSyntheticLambda0;
import defpackage.SingleCloseImageProxy;
import defpackage.SurfaceOrientedMeteringPointFactory;
import defpackage.isSupportedRotationDegrees;
import defpackage.onRetryDecisionRequested;
import defpackage.removeStaleData;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\n\u0010\u000bB5\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0019\u0010\u0018R\u001b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\f8\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001b\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00150\u001a8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b%\u0010\u001dR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010#R\u0014\u0010(\u001a\u00020\u00038\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b&\u0010'"}, d2 = {"LSurfaceOrientedMeteringPointFactory;", "LSafeCloseImageReaderProxyExternalSyntheticLambda0;", "Lcom/datadog/android/rum/tracking/ViewTrackingStrategy;", "", "p0", "LSingleCloseImageProxy;", "Landroidx/fragment/app/Fragment;", "p1", "Landroid/app/Fragment;", "p2", "<init>", "(ZLSingleCloseImageProxy;LSingleCloseImageProxy;)V", "LisSupportedRotationDegrees;", "p3", "(ZLSingleCloseImageProxy;LSingleCloseImageProxy;LisSupportedRotationDegrees;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/app/Activity;", "", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityStopped", "LProcessingException;", "Landroidx/fragment/app/FragmentActivity;", "asBinder", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LisSupportedRotationDegrees;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LSingleCloseImageProxy;", "TuitionPaymentFragmentbindingInflater1", "a", "d", "Z", "asInterface"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class SurfaceOrientedMeteringPointFactory extends SafeCloseImageReaderProxyExternalSyntheticLambda0 implements ViewTrackingStrategy {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final SingleCloseImageProxy<Fragment> TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final isSupportedRotationDegrees b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final SingleCloseImageProxy<androidx.fragment.app.Fragment> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean asInterface;

    private SurfaceOrientedMeteringPointFactory(boolean z, SingleCloseImageProxy<androidx.fragment.app.Fragment> singleCloseImageProxy, SingleCloseImageProxy<Fragment> singleCloseImageProxy2, isSupportedRotationDegrees issupportedrotationdegrees) {
        Intrinsics.checkNotNullParameter(singleCloseImageProxy, "");
        Intrinsics.checkNotNullParameter(singleCloseImageProxy2, "");
        Intrinsics.checkNotNullParameter(issupportedrotationdegrees, "");
        this.asInterface = z;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = singleCloseImageProxy;
        this.TuitionPaymentFragmentbindingInflater1 = singleCloseImageProxy2;
        this.b = issupportedrotationdegrees;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<ProcessingException<FragmentActivity>>() { // from class: com.datadog.android.rum.tracking.FragmentViewTrackingStrategy$androidXLifecycleCallbacks$2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ProcessingException<FragmentActivity> invoke() {
                removeStaleData removestaledata = (removeStaleData) this.this$0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1<ImageAnalysisBlockingAnalyzer, removeStaleData>() { // from class: com.datadog.android.rum.tracking.FragmentViewTrackingStrategy$androidXLifecycleCallbacks$2$rumFeature$1
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
                    public final removeStaleData invoke(ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer) {
                        Intrinsics.checkNotNullParameter(imageAnalysisBlockingAnalyzer, "");
                        ImageAnalysisAbstractAnalyzerExternalSyntheticLambda1 imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B = imageAnalysisBlockingAnalyzer.b("rum");
                        if (imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B != null) {
                            return (removeStaleData) imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B.b();
                        }
                        return null;
                    }
                });
                RumMonitor rumMonitor = (RumMonitor) this.this$0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1<ImageAnalysisBlockingAnalyzer, RumMonitor>() { // from class: com.datadog.android.rum.tracking.FragmentViewTrackingStrategy$androidXLifecycleCallbacks$2$rumMonitor$1
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final RumMonitor invoke(ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer) {
                        Intrinsics.checkNotNullParameter(imageAnalysisBlockingAnalyzer, "");
                        return GlobalRumMonitor.b(imageAnalysisBlockingAnalyzer);
                    }
                });
                if (removestaledata == null || rumMonitor == null) {
                    return new onRetryDecisionRequested();
                }
                SingleCloseImageProxy<androidx.fragment.app.Fragment> singleCloseImageProxy3 = this.this$0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                final SurfaceOrientedMeteringPointFactory surfaceOrientedMeteringPointFactory = this.this$0;
                return new ResolutionInfoResolutionInfoInternal(new Function1<androidx.fragment.app.Fragment, Map<String, ? extends Object>>() { // from class: com.datadog.android.rum.tracking.FragmentViewTrackingStrategy$androidXLifecycleCallbacks$2.1
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
                    public final Map<String, Object> invoke(androidx.fragment.app.Fragment fragment) {
                        Intrinsics.checkNotNullParameter(fragment, "");
                        return surfaceOrientedMeteringPointFactory.asInterface ? SurfaceOrientedMeteringPointFactory.TuitionPaymentFragmentspecialinlinedviewModeldefault2(fragment.getArguments()) : MapsKt.emptyMap();
                    }

                    {
                        super(1);
                    }
                }, singleCloseImageProxy3, removestaledata, rumMonitor);
            }

            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<ProcessingException<Activity>>() { // from class: com.datadog.android.rum.tracking.FragmentViewTrackingStrategy$oreoLifecycleCallbacks$2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
            public final ProcessingException<Activity> invoke() {
                removeStaleData removestaledata = (removeStaleData) this.this$0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1<ImageAnalysisBlockingAnalyzer, removeStaleData>() { // from class: com.datadog.android.rum.tracking.FragmentViewTrackingStrategy$oreoLifecycleCallbacks$2$rumFeature$1
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                    public final removeStaleData invoke(ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer) {
                        Intrinsics.checkNotNullParameter(imageAnalysisBlockingAnalyzer, "");
                        ImageAnalysisAbstractAnalyzerExternalSyntheticLambda1 imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B = imageAnalysisBlockingAnalyzer.b("rum");
                        if (imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B != null) {
                            return (removeStaleData) imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B.b();
                        }
                        return null;
                    }
                });
                RumMonitor rumMonitor = (RumMonitor) this.this$0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1<ImageAnalysisBlockingAnalyzer, RumMonitor>() { // from class: com.datadog.android.rum.tracking.FragmentViewTrackingStrategy$oreoLifecycleCallbacks$2$rumMonitor$1
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final RumMonitor invoke(ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer) {
                        Intrinsics.checkNotNullParameter(imageAnalysisBlockingAnalyzer, "");
                        return GlobalRumMonitor.b(imageAnalysisBlockingAnalyzer);
                    }
                });
                if (this.this$0.b.b() < 26 || removestaledata == null || rumMonitor == null) {
                    return new onRetryDecisionRequested();
                }
                SingleCloseImageProxy<Fragment> singleCloseImageProxy3 = this.this$0.TuitionPaymentFragmentbindingInflater1;
                isSupportedRotationDegrees issupportedrotationdegrees2 = this.this$0.b;
                final SurfaceOrientedMeteringPointFactory surfaceOrientedMeteringPointFactory = this.this$0;
                return new RetryPolicyExternalSyntheticLambda0(new Function1<Fragment, Map<String, ? extends Object>>() { // from class: com.datadog.android.rum.tracking.FragmentViewTrackingStrategy$oreoLifecycleCallbacks$2.1
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
                    public final Map<String, Object> invoke(Fragment fragment) {
                        Intrinsics.checkNotNullParameter(fragment, "");
                        return surfaceOrientedMeteringPointFactory.asInterface ? SurfaceOrientedMeteringPointFactory.TuitionPaymentFragmentspecialinlinedviewModeldefault2(fragment.getArguments()) : MapsKt.emptyMap();
                    }

                    {
                        super(1);
                    }
                }, singleCloseImageProxy3, removestaledata, rumMonitor, issupportedrotationdegrees2);
            }

            {
                super(0);
            }
        });
    }

    public /* synthetic */ SurfaceOrientedMeteringPointFactory(boolean z, lambdanew0androidxcameracoreSafeCloseImageReaderProxy lambdanew0androidxcameracoresafecloseimagereaderproxy, lambdasetOnImageAvailableListener1androidxcameracoreSafeCloseImageReaderProxy lambdasetonimageavailablelistener1androidxcameracoresafecloseimagereaderproxy, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? new lambdanew0androidxcameracoreSafeCloseImageReaderProxy() : lambdanew0androidxcameracoresafecloseimagereaderproxy, (i & 4) != 0 ? new lambdasetOnImageAvailableListener1androidxcameracoreSafeCloseImageReaderProxy() : lambdasetonimageavailablelistener1androidxcameracoresafecloseimagereaderproxy);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SurfaceOrientedMeteringPointFactory(boolean z, SingleCloseImageProxy<androidx.fragment.app.Fragment> singleCloseImageProxy, SingleCloseImageProxy<Fragment> singleCloseImageProxy2) {
        this(z, singleCloseImageProxy, singleCloseImageProxy2, isSupportedRotationDegrees.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        Intrinsics.checkNotNullParameter(singleCloseImageProxy, "");
        Intrinsics.checkNotNullParameter(singleCloseImageProxy2, "");
        isSupportedRotationDegrees.Companion companion = isSupportedRotationDegrees.INSTANCE;
    }

    @Override // defpackage.SafeCloseImageReaderProxyExternalSyntheticLambda0, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(final Activity p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        super.onActivityStarted(p0);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1<ImageAnalysisBlockingAnalyzer, Unit>() { // from class: com.datadog.android.rum.tracking.FragmentViewTrackingStrategy$onActivityStarted$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(imageAnalysisBlockingAnalyzer);
                return Unit.INSTANCE;
            }

            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer) {
                Intrinsics.checkNotNullParameter(imageAnalysisBlockingAnalyzer, "");
                if (FragmentActivity.class.isAssignableFrom(p0.getClass())) {
                    ProcessingException processingExceptionTuitionPaymentFragmentbindingInflater1 = SurfaceOrientedMeteringPointFactory.TuitionPaymentFragmentbindingInflater1(this);
                    Activity activity = p0;
                    Intrinsics.checkNotNull(activity, "");
                    processingExceptionTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2((FragmentActivity) activity, imageAnalysisBlockingAnalyzer);
                    return;
                }
                SurfaceOrientedMeteringPointFactory.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this).TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0, imageAnalysisBlockingAnalyzer);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
    }

    @Override // defpackage.SafeCloseImageReaderProxyExternalSyntheticLambda0, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        super.onActivityStopped(p0);
        if (FragmentActivity.class.isAssignableFrom(p0.getClass())) {
            ((ProcessingException) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3((FragmentActivity) p0);
        } else {
            ((ProcessingException) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        }
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), p0 != null ? p0.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(p0, "");
        SurfaceOrientedMeteringPointFactory surfaceOrientedMeteringPointFactory = (SurfaceOrientedMeteringPointFactory) p0;
        return this.asInterface == surfaceOrientedMeteringPointFactory.asInterface && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, surfaceOrientedMeteringPointFactory.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, surfaceOrientedMeteringPointFactory.TuitionPaymentFragmentbindingInflater1);
    }

    public final int hashCode() {
        return (((Boolean.hashCode(this.asInterface) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode()) * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode();
    }

    public static final /* synthetic */ ProcessingException TuitionPaymentFragmentbindingInflater1(SurfaceOrientedMeteringPointFactory surfaceOrientedMeteringPointFactory) {
        return (ProcessingException) surfaceOrientedMeteringPointFactory.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
    }

    public static final /* synthetic */ ProcessingException TuitionPaymentFragmentspecialinlinedviewModeldefault1(SurfaceOrientedMeteringPointFactory surfaceOrientedMeteringPointFactory) {
        return (ProcessingException) surfaceOrientedMeteringPointFactory.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
    }
}

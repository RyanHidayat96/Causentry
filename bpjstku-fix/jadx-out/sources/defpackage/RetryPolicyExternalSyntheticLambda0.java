package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.SdkCore;
import com.datadog.android.rum.RumMonitor;
import com.datadog.android.rum.internal.utils.ComponentPredicateExtKt$runIfValid$1;
import defpackage.ImageAnalysisBlockingAnalyzer;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001$BQ\u0012 \u0010\t\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00060\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0015H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u001b\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 R.\u0010!\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00060\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010#R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0015\u0010\u001f\u001a\u00020'8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010(R\u0014\u0010\u001d\u001a\u00020)8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010*R\u0014\u0010-\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u0010+\u001a\u0002008\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b1\u00102"}, d2 = {"LRetryPolicyExternalSyntheticLambda0;", "LProcessingException;", "Landroid/app/Activity;", "Landroid/app/FragmentManager$FragmentLifecycleCallbacks;", "Lkotlin/Function1;", "Landroid/app/Fragment;", "", "", "", "p0", "LSingleCloseImageProxy;", "p1", "LremoveStaleData;", "p2", "Lcom/datadog/android/rum/RumMonitor;", "p3", "LisSupportedRotationDegrees;", "p4", "<init>", "(Lkotlin/jvm/functions/Function1;LSingleCloseImageProxy;LremoveStaleData;Lcom/datadog/android/rum/RumMonitor;LisSupportedRotationDegrees;)V", "Landroid/app/FragmentManager;", "Landroid/os/Bundle;", "", "onFragmentActivityCreated", "(Landroid/app/FragmentManager;Landroid/app/Fragment;Landroid/os/Bundle;)V", "onFragmentResumed", "(Landroid/app/FragmentManager;Landroid/app/Fragment;)V", "onFragmentStopped", "Lcom/datadog/android/api/SdkCore;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/app/Activity;Lcom/datadog/android/api/SdkCore;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Landroid/app/Activity;)V", "b", "Lkotlin/jvm/functions/Function1;", "LisSupportedRotationDegrees;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentbindingInflater1", "LSingleCloseImageProxy;", "Ljava/util/concurrent/ScheduledExecutorService;", "Lkotlin/Lazy;", "Lcom/datadog/android/api/InternalLogger;", "()Lcom/datadog/android/api/InternalLogger;", "asBinder", "LremoveStaleData;", "d", "g", "Lcom/datadog/android/rum/RumMonitor;", "LImageAnalysisBlockingAnalyzer;", "asInterface", "LImageAnalysisBlockingAnalyzer;"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class RetryPolicyExternalSyntheticLambda0 extends FragmentManager.FragmentLifecycleCallbacks implements ProcessingException<Activity> {
    private static final TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1(null);
    private final SingleCloseImageProxy<Fragment> TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final isSupportedRotationDegrees TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final removeStaleData d;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private ImageAnalysisBlockingAnalyzer asBinder;
    private final Function1<Fragment, Map<String, Object>> b;
    private final RumMonitor g;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RetryPolicyExternalSyntheticLambda0(Function1 function1, SingleCloseImageProxy singleCloseImageProxy, removeStaleData removestaledata, RumMonitor rumMonitor, isSupportedRotationDegrees issupportedrotationdegrees, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 16) != 0) {
            isSupportedRotationDegrees.Companion companion = isSupportedRotationDegrees.INSTANCE;
            issupportedrotationdegrees = isSupportedRotationDegrees.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
        this(function1, singleCloseImageProxy, removestaledata, rumMonitor, issupportedrotationdegrees);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RetryPolicyExternalSyntheticLambda0(Function1<? super Fragment, ? extends Map<String, ? extends Object>> function1, SingleCloseImageProxy<Fragment> singleCloseImageProxy, removeStaleData removestaledata, RumMonitor rumMonitor, isSupportedRotationDegrees issupportedrotationdegrees) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(singleCloseImageProxy, "");
        Intrinsics.checkNotNullParameter(removestaledata, "");
        Intrinsics.checkNotNullParameter(rumMonitor, "");
        Intrinsics.checkNotNullParameter(issupportedrotationdegrees, "");
        this.b = function1;
        this.TuitionPaymentFragmentbindingInflater1 = singleCloseImageProxy;
        this.d = removestaledata;
        this.g = rumMonitor;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = issupportedrotationdegrees;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<ScheduledExecutorService>() { // from class: com.datadog.android.rum.internal.tracking.OreoFragmentLifecycleCallbacks$executor$2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ScheduledExecutorService invoke() {
                ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer = this.this$0.asBinder;
                if (imageAnalysisBlockingAnalyzer == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    imageAnalysisBlockingAnalyzer = null;
                }
                return imageAnalysisBlockingAnalyzer.TuitionPaymentFragmentbindingInflater1("rum-fragment-lifecycle");
            }

            {
                super(0);
            }
        });
    }

    private final InternalLogger b() {
        ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer = this.asBinder;
        if (imageAnalysisBlockingAnalyzer == null) {
            InternalLogger.Companion companion = InternalLogger.INSTANCE;
            return InternalLogger.Companion.b();
        }
        if (imageAnalysisBlockingAnalyzer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            imageAnalysisBlockingAnalyzer = null;
        }
        return imageAnalysisBlockingAnalyzer.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    @Override // defpackage.ProcessingException
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Activity p0, SdkCore p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        this.asBinder = (ImageAnalysisBlockingAnalyzer) p1;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b() >= 26) {
            p0.getFragmentManager().registerFragmentLifecycleCallbacks(this, true);
        }
    }

    @Override // defpackage.ProcessingException
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Activity p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b() >= 26) {
            p0.getFragmentManager().unregisterFragmentLifecycleCallbacks(this);
        }
    }

    @Override // android.app.FragmentManager.FragmentLifecycleCallbacks
    @Deprecated(message = "Deprecated in Java")
    public final void onFragmentActivityCreated(FragmentManager p0, Fragment p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        super.onFragmentActivityCreated(p0, p1, p2);
        if (Intrinsics.areEqual(p1.getClass().getName(), "androidx.lifecycle.ReportFragment")) {
            return;
        }
        Context context = p1.getContext();
        if (!(p1 instanceof DialogFragment) || context == null || this.asBinder == null) {
            return;
        }
        Dialog dialog = ((DialogFragment) p1).getDialog();
        ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer = null;
        Window window = dialog != null ? dialog.getWindow() : null;
        PreviewExternalSyntheticLambda1 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.d.TuitionPaymentFragmentbindingInflater1.getTuitionPaymentFragmentspecialinlinedviewModeldefault2();
        ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer2 = this.asBinder;
        if (imageAnalysisBlockingAnalyzer2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            imageAnalysisBlockingAnalyzer = imageAnalysisBlockingAnalyzer2;
        }
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.b(window, context, imageAnalysisBlockingAnalyzer);
    }

    @Override // android.app.FragmentManager.FragmentLifecycleCallbacks
    @Deprecated(message = "Deprecated in Java")
    public final void onFragmentResumed(FragmentManager p0, Fragment p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        super.onFragmentResumed(p0, p1);
        if (Intrinsics.areEqual(p1.getClass().getName(), "androidx.lifecycle.ReportFragment")) {
            return;
        }
        SingleCloseImageProxy<Fragment> singleCloseImageProxy = this.TuitionPaymentFragmentbindingInflater1;
        InternalLogger internalLoggerB = b();
        if (singleCloseImageProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p1)) {
            try {
                this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p1);
                this.g.b(p1, getDefaultRetryDelayInMillis.b(p1), (Map) this.b.invoke(p1));
            } catch (Exception e2) {
                internalLoggerB.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), ComponentPredicateExtKt$runIfValid$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3, e2, false, null);
            }
        }
    }

    @Override // android.app.FragmentManager.FragmentLifecycleCallbacks
    @Deprecated(message = "Deprecated in Java")
    public final void onFragmentStopped(FragmentManager p0, final Fragment p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        super.onFragmentStopped(p0, p1);
        if (Intrinsics.areEqual(p1.getClass().getName(), "androidx.lifecycle.ReportFragment")) {
            return;
        }
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer = this.asBinder;
        if (imageAnalysisBlockingAnalyzer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            imageAnalysisBlockingAnalyzer = null;
        }
        ImageProxyDownsampler.TuitionPaymentFragmentbindingInflater1(scheduledExecutorService, "Delayed view stop", 200L, timeUnit, imageAnalysisBlockingAnalyzer.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), new Runnable() { // from class: RetryPolicyExecutionState
            @Override // java.lang.Runnable
            public final void run() {
                RetryPolicyExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, p1);
            }
        });
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LRetryPolicyExternalSyntheticLambda0$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V"}, k = 1, mv = {1, 7, 0}, xi = 48)
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        private TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        public /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(RetryPolicyExternalSyntheticLambda0 retryPolicyExternalSyntheticLambda0, Fragment fragment) {
        Intrinsics.checkNotNullParameter(retryPolicyExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        SingleCloseImageProxy<Fragment> singleCloseImageProxy = retryPolicyExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1;
        InternalLogger internalLoggerB = retryPolicyExternalSyntheticLambda0.b();
        if (singleCloseImageProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(fragment)) {
            try {
                retryPolicyExternalSyntheticLambda0.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3(fragment, MapsKt.emptyMap());
            } catch (Exception e2) {
                internalLoggerB.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), ComponentPredicateExtKt$runIfValid$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3, e2, false, null);
            }
        }
    }
}

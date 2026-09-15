package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.SdkCore;
import com.datadog.android.rum.RumMonitor;
import com.datadog.android.rum.internal.utils.ComponentPredicateExtKt$runIfValid$1;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0011\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001#BG\u0012 \u0010\t\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00060\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0019\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u001b\u0010\u001dR.\u0010 \u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00060\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0015\u0010\u001b\u001a\u00020$8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001b\u0010%R\u0014\u0010!\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u001e\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010(\u001a\u00020*8\u0005@\u0005X\u0085,¢\u0006\u0006\n\u0004\b \u0010+"}, d2 = {"LResolutionInfoResolutionInfoInternal;", "LProcessingException;", "Landroidx/fragment/app/FragmentActivity;", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "Lkotlin/Function1;", "Landroidx/fragment/app/Fragment;", "", "", "", "p0", "LSingleCloseImageProxy;", "p1", "LremoveStaleData;", "p2", "Lcom/datadog/android/rum/RumMonitor;", "p3", "<init>", "(Lkotlin/jvm/functions/Function1;LSingleCloseImageProxy;LremoveStaleData;Lcom/datadog/android/rum/RumMonitor;)V", "Landroidx/fragment/app/FragmentManager;", "Landroid/os/Bundle;", "", "onFragmentActivityCreated", "(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;Landroid/os/Bundle;)V", "onFragmentResumed", "(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;)V", "onFragmentStopped", "Lcom/datadog/android/api/SdkCore;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroidx/fragment/app/FragmentActivity;Lcom/datadog/android/api/SdkCore;)V", "(Landroidx/fragment/app/Fragment;)Ljava/lang/Object;", "b", "Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LSingleCloseImageProxy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/util/concurrent/ScheduledExecutorService;", "Lkotlin/Lazy;", "d", "LremoveStaleData;", "a", "Lcom/datadog/android/rum/RumMonitor;", "LImageAnalysisBlockingAnalyzer;", "LImageAnalysisBlockingAnalyzer;"}, k = 1, mv = {1, 7, 0}, xi = 48)
public class ResolutionInfoResolutionInfoInternal extends FragmentManager.FragmentLifecycleCallbacks implements ProcessingException<FragmentActivity> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public ImageAnalysisBlockingAnalyzer a;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final SingleCloseImageProxy<Fragment> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final RumMonitor b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function1<Fragment, Map<String, Object>> TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final removeStaleData TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    @Override // defpackage.ProcessingException
    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Activity activity) {
        FragmentActivity fragmentActivity = (FragmentActivity) activity;
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        fragmentActivity.getSupportFragmentManager().unregisterFragmentLifecycleCallbacks(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ResolutionInfoResolutionInfoInternal(Function1<? super Fragment, ? extends Map<String, ? extends Object>> function1, SingleCloseImageProxy<Fragment> singleCloseImageProxy, removeStaleData removestaledata, RumMonitor rumMonitor) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(singleCloseImageProxy, "");
        Intrinsics.checkNotNullParameter(removestaledata, "");
        Intrinsics.checkNotNullParameter(rumMonitor, "");
        this.TuitionPaymentFragmentbindingInflater1 = function1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = singleCloseImageProxy;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = removestaledata;
        this.b = rumMonitor;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<ScheduledExecutorService>() { // from class: com.datadog.android.rum.internal.tracking.AndroidXFragmentLifecycleCallbacks$executor$2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
            public final ScheduledExecutorService invoke() {
                ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer = this.this$0.a;
                if (imageAnalysisBlockingAnalyzer == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    imageAnalysisBlockingAnalyzer = null;
                }
                return imageAnalysisBlockingAnalyzer.TuitionPaymentFragmentbindingInflater1("rum-fragmentx-lifecycle");
            }

            {
                super(0);
            }
        });
    }

    @Override // defpackage.ProcessingException
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(FragmentActivity p0, SdkCore p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer = (ImageAnalysisBlockingAnalyzer) p1;
        Intrinsics.checkNotNullParameter(imageAnalysisBlockingAnalyzer, "");
        this.a = imageAnalysisBlockingAnalyzer;
        p0.getSupportFragmentManager().registerFragmentLifecycleCallbacks(this, true);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentActivityCreated(FragmentManager p0, Fragment p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        super.onFragmentActivityCreated(p0, p1, p2);
        Context context = p1.getContext();
        if (!(p1 instanceof DialogFragment) || context == null || this.a == null) {
            return;
        }
        Dialog dialog = ((DialogFragment) p1).getDialog();
        ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer = null;
        Window window = dialog != null ? dialog.getWindow() : null;
        PreviewExternalSyntheticLambda1 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1.getTuitionPaymentFragmentspecialinlinedviewModeldefault2();
        ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer2 = this.a;
        if (imageAnalysisBlockingAnalyzer2 != null) {
            imageAnalysisBlockingAnalyzer = imageAnalysisBlockingAnalyzer2;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.b(window, context, imageAnalysisBlockingAnalyzer);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentResumed(FragmentManager p0, Fragment p1) {
        InternalLogger internalLoggerB;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        super.onFragmentResumed(p0, p1);
        SingleCloseImageProxy<Fragment> singleCloseImageProxy = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer = this.a;
        if (imageAnalysisBlockingAnalyzer != null) {
            if (imageAnalysisBlockingAnalyzer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                imageAnalysisBlockingAnalyzer = null;
            }
            internalLoggerB = imageAnalysisBlockingAnalyzer.getAsBinder();
        } else {
            InternalLogger.Companion companion = InternalLogger.INSTANCE;
            internalLoggerB = InternalLogger.Companion.b();
        }
        InternalLogger internalLogger = internalLoggerB;
        if (singleCloseImageProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p1)) {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(p1);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p1);
                this.b.b(objTuitionPaymentFragmentspecialinlinedviewModeldefault1, getDefaultRetryDelayInMillis.b(p1), (Map) this.TuitionPaymentFragmentbindingInflater1.invoke(p1));
            } catch (Exception e2) {
                internalLogger.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), ComponentPredicateExtKt$runIfValid$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3, e2, false, null);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentStopped(FragmentManager p0, final Fragment p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        super.onFragmentStopped(p0, p1);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer = this.a;
        if (imageAnalysisBlockingAnalyzer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            imageAnalysisBlockingAnalyzer = null;
        }
        ImageProxyDownsampler.TuitionPaymentFragmentbindingInflater1(scheduledExecutorService, "Delayed view stop", 200L, timeUnit, imageAnalysisBlockingAnalyzer.getAsBinder(), new Runnable() { // from class: isStabilizationSupported
            @Override // java.lang.Runnable
            public final void run() {
                ResolutionInfoResolutionInfoInternal.TuitionPaymentFragmentbindingInflater1(this.b, p1);
            }
        });
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(ResolutionInfoResolutionInfoInternal resolutionInfoResolutionInfoInternal, Fragment fragment) {
        InternalLogger internalLoggerB;
        Intrinsics.checkNotNullParameter(resolutionInfoResolutionInfoInternal, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        SingleCloseImageProxy<Fragment> singleCloseImageProxy = resolutionInfoResolutionInfoInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer = resolutionInfoResolutionInfoInternal.a;
        if (imageAnalysisBlockingAnalyzer != null) {
            if (imageAnalysisBlockingAnalyzer == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                imageAnalysisBlockingAnalyzer = null;
            }
            internalLoggerB = imageAnalysisBlockingAnalyzer.getAsBinder();
        } else {
            InternalLogger.Companion companion = InternalLogger.INSTANCE;
            internalLoggerB = InternalLogger.Companion.b();
        }
        InternalLogger internalLogger = internalLoggerB;
        if (singleCloseImageProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(fragment)) {
            try {
                resolutionInfoResolutionInfoInternal.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(resolutionInfoResolutionInfoInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault1(fragment), MapsKt.emptyMap());
            } catch (Exception e2) {
                internalLogger.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), ComponentPredicateExtKt$runIfValid$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3, e2, false, null);
            }
        }
    }

    public Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Fragment p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return p0;
    }
}

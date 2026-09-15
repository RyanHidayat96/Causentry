package defpackage;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentTutorialVerificationBiometricBinding;
import com.bpjstku.domain.jp.model.JpDataTk;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.acquireBuffer;
import defpackage.getEventTime;
import defpackage.mapPoint;
import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!BU\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u001e\b\u0002\u0010\b\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u000fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0017\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0018\u0010\u0014R\u001c\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR*\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR\u0015\u0010!\u001a\u00020\u001f8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010 R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0016\u0010#R\u0014\u0010\u0017\u001a\u00020%8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b!\u0010&R\u0015\u0010\u001c\u001a\u00020'8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010 "}, d2 = {"LlambdasetZoomRatio0androidxcameracamera2internalZoomControl;", "LunregisterMediaButtonEventReceiver;", "Lkotlin/Function0;", "", "p0", "p1", "Lkotlin/Function2;", "Ljava/io/File;", "p2", "Lcom/bpjstku/domain/jp/model/JpDataTk;", "p3", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lcom/bpjstku/domain/jp/model/JpDataTk;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "Landroid/os/Bundle;", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()V", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/jvm/functions/Function0;", "asInterface", "a", "Lkotlin/jvm/functions/Function2;", "Lcom/bpjstku/domain/jp/model/JpDataTk;", "LacquireBuffer;", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/bpjstku/databinding/FragmentTutorialVerificationBiometricBinding;", "Lcom/bpjstku/databinding/FragmentTutorialVerificationBiometricBinding;", "asBinder", "", "()I", "LoutputFormatToAudioProfile;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class lambdasetZoomRatio0androidxcameracamera2internalZoomControl extends unregisterMediaButtonEventReceiver {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Function0<Unit> b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private FragmentTutorialVerificationBiometricBinding asBinder;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function2<unregisterMediaButtonEventReceiver, File, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Function0<Unit> TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final JpDataTk TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy a;

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return R.layout.fragment_tutorial_verification_biometric;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
    }

    public /* synthetic */ lambdasetZoomRatio0androidxcameracamera2internalZoomControl(Function0 function0, Function0 function1, Function2 function2, JpDataTk jpDataTk, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function0, (i & 2) != 0 ? null : function1, (i & 4) != 0 ? null : function2, jpDataTk);
    }

    /* JADX INFO: renamed from: lambdasetZoomRatio0androidxcameracamera2internalZoomControl$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LlambdasetZoomRatio0androidxcameracamera2internalZoomControl$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ lambdasetZoomRatio0androidxcameracamera2internalZoomControl TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function0 function0, Function2 function2, JpDataTk jpDataTk) {
            return new lambdasetZoomRatio0androidxcameracamera2internalZoomControl(function0, null, function2, jpDataTk);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public lambdasetZoomRatio0androidxcameracamera2internalZoomControl(Function0<Unit> function0, Function0<Unit> function1, Function2<? super unregisterMediaButtonEventReceiver, ? super File, Unit> function2, JpDataTk jpDataTk) {
        this.b = function0;
        this.TuitionPaymentFragmentbindingInflater1 = function1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = jpDataTk;
        final lambdasetZoomRatio0androidxcameracamera2internalZoomControl lambdasetzoomratio0androidxcameracamera2internalzoomcontrol = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<acquireBuffer>() { // from class: com.bpjstku.presentation.scholarship.confirm.fragment.ScholarshipTutorialTakePhotoFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [acquireBuffer, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final acquireBuffer invoke() {
                ComponentCallbacks componentCallbacks = lambdasetzoomratio0androidxcameracamera2internalzoomcontrol;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(acquireBuffer.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.a = LazyKt.lazy(new Function0() { // from class: ZoomControlExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return lambdasetZoomRatio0androidxcameracamera2internalZoomControl.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
        });
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentTutorialVerificationBiometricBinding fragmentTutorialVerificationBiometricBindingInflate = FragmentTutorialVerificationBiometricBinding.inflate(p0, p1, false);
        this.asBinder = fragmentTutorialVerificationBiometricBindingInflate;
        if (fragmentTutorialVerificationBiometricBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentTutorialVerificationBiometricBindingInflate = null;
        }
        FrameLayout root = fragmentTutorialVerificationBiometricBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        FragmentTutorialVerificationBiometricBinding fragmentTutorialVerificationBiometricBinding = this.asBinder;
        if (fragmentTutorialVerificationBiometricBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentTutorialVerificationBiometricBinding = null;
        }
        Button button = fragmentTutorialVerificationBiometricBinding.btnOpenCamera;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: lambdasetLinearZoom3androidxcameracamera2internalZoomControl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return lambdasetZoomRatio0androidxcameracamera2internalZoomControl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj);
            }
        }));
        Button button2 = fragmentTutorialVerificationBiometricBinding.btnBack;
        Intrinsics.checkNotNullExpressionValue(button2, "");
        button2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: lambdasetZoomRatio1androidxcameracamera2internalZoomControl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return lambdasetZoomRatio0androidxcameracamera2internalZoomControl.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (View) obj);
            }
        }));
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(final lambdasetZoomRatio0androidxcameracamera2internalZoomControl lambdasetzoomratio0androidxcameracamera2internalzoomcontrol, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Camera2CameraControlImplExternalSyntheticLambda5.Companion bVar = Camera2CameraControlImplExternalSyntheticLambda5.INSTANCE;
        String string = lambdasetzoomratio0androidxcameracamera2internalzoomcontrol.getString(R.string.title_term_and_condition);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = lambdasetzoomratio0androidxcameracamera2internalzoomcontrol.getString(R.string.term_and_condition_biometric_dukcapil);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String string3 = lambdasetzoomratio0androidxcameracamera2internalzoomcontrol.getString(R.string.action_next);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        String string4 = lambdasetzoomratio0androidxcameracamera2internalzoomcontrol.getString(R.string.action_cancel_id);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        Camera2CameraControlImplExternalSyntheticLambda5 camera2CameraControlImplExternalSyntheticLambda5TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Camera2CameraControlImplExternalSyntheticLambda5.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(R.drawable.ic_info_blue, string, string2, string3, new Function0() { // from class: lambdasetLinearZoom2androidxcameracamera2internalZoomControl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return lambdasetZoomRatio0androidxcameracamera2internalZoomControl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b);
            }
        }, string4, new Function0() { // from class: addZoomOption
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        });
        camera2CameraControlImplExternalSyntheticLambda5TuitionPaymentFragmentspecialinlinedviewModeldefault3.setCancelable(false);
        int i = lambdasetzoomratio0androidxcameracamera2internalzoomcontrol.requireContext().getResources().getDisplayMetrics().heightPixels;
        FragmentManager childFragmentManager = lambdasetzoomratio0androidxcameracamera2internalzoomcontrol.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Intrinsics.checkNotNullParameter(childFragmentManager, "");
        if (childFragmentManager.findFragmentByTag(camera2CameraControlImplExternalSyntheticLambda5TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            camera2CameraControlImplExternalSyntheticLambda5TuitionPaymentFragmentspecialinlinedviewModeldefault3.show(childFragmentManager, camera2CameraControlImplExternalSyntheticLambda5TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        camera2CameraControlImplExternalSyntheticLambda5TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(Integer.valueOf(i));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdasetZoomRatio0androidxcameracamera2internalZoomControl lambdasetzoomratio0androidxcameracamera2internalzoomcontrol) {
        Function0<Unit> function0 = lambdasetzoomratio0androidxcameracamera2internalzoomcontrol.b;
        if (function0 != null) {
            function0.invoke();
        }
        lambdasetzoomratio0androidxcameracamera2internalzoomcontrol.dismiss();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ outputFormatToAudioProfile TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdasetZoomRatio0androidxcameracamera2internalZoomControl lambdasetzoomratio0androidxcameracamera2internalzoomcontrol) {
        return new outputFormatToAudioProfile(lambdasetzoomratio0androidxcameracamera2internalzoomcontrol.requireActivity());
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(lambdasetZoomRatio0androidxcameracamera2internalZoomControl lambdasetzoomratio0androidxcameracamera2internalzoomcontrol, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function0<Unit> function0 = lambdasetzoomratio0androidxcameracamera2internalzoomcontrol.TuitionPaymentFragmentbindingInflater1;
        if (function0 != null) {
            function0.invoke();
        }
        lambdasetzoomratio0androidxcameracamera2internalzoomcontrol.dismiss();
        return Unit.INSTANCE;
    }
}

package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.data.jht.model.request.JhtClaimContributionRequest;
import com.bpjstku.data.jht.model.response.JhtContributionDetailItem;
import com.bpjstku.databinding.FragmentOldDaySecurityTuitionBottomSheetBinding;
import com.bpjstku.domain.user.model.User;
import com.google.android.material.button.MaterialButton;
import com.kennyc.view.MultiStateView;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.Camera2CameraControlImplExternalSyntheticLambda4;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.setQuickZoomEnabled;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0003R\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u00138CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0012\u001a\u00020\u00168CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015R\u0015\u0010\u0018\u001a\u00020\u00178CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010\u0011\u001a\u00020\u001f8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010 R\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0018\u0010\""}, d2 = {"LsetTimeout3A;", "LunregisterMediaButtonEventReceiver;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "Lcom/bpjstku/domain/user/model/User;", "asInterface", "Lkotlin/Lazy;", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "LCamera2CameraControlImplExternalSyntheticLambda4;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "", "Lcom/bpjstku/data/jht/model/response/JhtContributionDetailItem;", "Ljava/util/List;", "LCamera2CapturePipelinePipeline;", "asBinder", "TuitionPaymentFragmentbindingInflater1", "", "()I", "Lcom/bpjstku/databinding/FragmentOldDaySecurityTuitionBottomSheetBinding;", "Lcom/bpjstku/databinding/FragmentOldDaySecurityTuitionBottomSheetBinding;", "a"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class setTimeout3A extends unregisterMediaButtonEventReceiver {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private FragmentOldDaySecurityTuitionBottomSheetBinding a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: applyAeModeQuirk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private List<JhtContributionDetailItem> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ArrayList();

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private List<Camera2CapturePipelinePipeline> TuitionPaymentFragmentbindingInflater1 = new ArrayList();

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return R.layout.fragment_old_day_security_tuition_bottom_sheet;
    }

    public setTimeout3A() {
        final setTimeout3A settimeout3a = this;
        this.b = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.OldDaySecurityTuitionBottomSheetFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = settimeout3a;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        final setTimeout3A settimeout3a2 = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<Camera2CameraControlImplExternalSyntheticLambda4>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.OldDaySecurityTuitionBottomSheetFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [Camera2CameraControlImplExternalSyntheticLambda4, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Camera2CameraControlImplExternalSyntheticLambda4 invoke() {
                LifecycleOwner lifecycleOwner = settimeout3a2;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Camera2CameraControlImplExternalSyntheticLambda4.class);
                if (lifecycleOwner != null) {
                    ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
                    return isQuickZoomEnabled.b(componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b, new setQuickZoomEnabled(orCreateKotlinClass, lifecycleOwner, mappoint, null, function0, 8, null));
                }
                throw new TypeCastException("null cannot be cast to non-null type android.content.ComponentCallbacks");
            }

            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: setTimeout3A$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LsetTimeout3A$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "LsetTimeout3A;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()LsetTimeout3A;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static setTimeout3A TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return new setTimeout3A();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentOldDaySecurityTuitionBottomSheetBinding fragmentOldDaySecurityTuitionBottomSheetBindingInflate = FragmentOldDaySecurityTuitionBottomSheetBinding.inflate(p0, p1, false);
        this.a = fragmentOldDaySecurityTuitionBottomSheetBindingInflate;
        if (fragmentOldDaySecurityTuitionBottomSheetBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentOldDaySecurityTuitionBottomSheetBindingInflate = null;
        }
        LinearLayout root = fragmentOldDaySecurityTuitionBottomSheetBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
        int i = Calendar.getInstance().get(1);
        FragmentOldDaySecurityTuitionBottomSheetBinding fragmentOldDaySecurityTuitionBottomSheetBinding = this.a;
        if (fragmentOldDaySecurityTuitionBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentOldDaySecurityTuitionBottomSheetBinding = null;
        }
        AppCompatTextView appCompatTextView = fragmentOldDaySecurityTuitionBottomSheetBinding.tvTitleBottomSheet;
        StringBuilder sb = new StringBuilder("Rincian Saldo JHT Tahun ");
        sb.append(String.valueOf(i));
        appCompatTextView.setText(sb.toString());
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        FragmentOldDaySecurityTuitionBottomSheetBinding fragmentOldDaySecurityTuitionBottomSheetBinding = this.a;
        if (fragmentOldDaySecurityTuitionBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentOldDaySecurityTuitionBottomSheetBinding = null;
        }
        MaterialButton materialButton = fragmentOldDaySecurityTuitionBottomSheetBinding.btnBack;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new isBound(new Function1() { // from class: lambdaexecutePreCapture2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setTimeout3A.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, (View) obj);
            }
        }));
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(setTimeout3A settimeout3a, VirtualCameraAdapter1 virtualCameraAdapter1) {
        FragmentOldDaySecurityTuitionBottomSheetBinding fragmentOldDaySecurityTuitionBottomSheetBinding = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            FragmentOldDaySecurityTuitionBottomSheetBinding fragmentOldDaySecurityTuitionBottomSheetBinding2 = settimeout3a.a;
            if (fragmentOldDaySecurityTuitionBottomSheetBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentOldDaySecurityTuitionBottomSheetBinding = fragmentOldDaySecurityTuitionBottomSheetBinding2;
            }
            MultiStateView multiStateView = fragmentOldDaySecurityTuitionBottomSheetBinding.msvGeneralList;
            Intrinsics.checkNotNullExpressionValue(multiStateView, "");
            multiStateView.setViewState(MultiStateView.ViewState.LOADING);
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            FragmentOldDaySecurityTuitionBottomSheetBinding fragmentOldDaySecurityTuitionBottomSheetBinding3 = settimeout3a.a;
            if (fragmentOldDaySecurityTuitionBottomSheetBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                fragmentOldDaySecurityTuitionBottomSheetBinding3 = null;
            }
            MultiStateView multiStateView2 = fragmentOldDaySecurityTuitionBottomSheetBinding3.msvGeneralList;
            Intrinsics.checkNotNullExpressionValue(multiStateView2, "");
            multiStateView2.setViewState(MultiStateView.ViewState.CONTENT);
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            List list = (List) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Intrinsics.checkNotNullParameter(list, "");
            int size = list.size();
            double d = 0.0d;
            for (int i = 0; i < size; i++) {
                int size2 = ((startActivityForResult) list.get(i)).TuitionPaymentFragmentbindingInflater1.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    d += Double.parseDouble(((startActivityForResult) list.get(i)).TuitionPaymentFragmentbindingInflater1.get(i2).TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }
            FragmentOldDaySecurityTuitionBottomSheetBinding fragmentOldDaySecurityTuitionBottomSheetBinding4 = settimeout3a.a;
            if (fragmentOldDaySecurityTuitionBottomSheetBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                fragmentOldDaySecurityTuitionBottomSheetBinding4 = null;
            }
            fragmentOldDaySecurityTuitionBottomSheetBinding4.tvSumTuition.setText(getCameraOperatingMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(String.valueOf(d)));
            Context contextRequireContext = settimeout3a.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            lambdaupdateSessionConfigAsync6androidxcameracamera2internalCamera2CameraControlImpl lambdaupdatesessionconfigasync6androidxcameracamera2internalcamera2cameracontrolimpl = new lambdaupdateSessionConfigAsync6androidxcameracamera2internalCamera2CameraControlImpl(contextRequireContext, (List) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            FragmentOldDaySecurityTuitionBottomSheetBinding fragmentOldDaySecurityTuitionBottomSheetBinding5 = settimeout3a.a;
            if (fragmentOldDaySecurityTuitionBottomSheetBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentOldDaySecurityTuitionBottomSheetBinding = fragmentOldDaySecurityTuitionBottomSheetBinding5;
            }
            RecyclerView recyclerView = fragmentOldDaySecurityTuitionBottomSheetBinding.rvListTuition;
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.addItemDecoration(new DividerItemDecoration(new ContextThemeWrapper(recyclerView.getContext(), R.style.AppTheme), 1));
            recyclerView.setAdapter(lambdaupdatesessionconfigasync6androidxcameracamera2internalcamera2cameracontrolimpl);
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            FragmentOldDaySecurityTuitionBottomSheetBinding fragmentOldDaySecurityTuitionBottomSheetBinding6 = settimeout3a.a;
            if (fragmentOldDaySecurityTuitionBottomSheetBinding6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentOldDaySecurityTuitionBottomSheetBinding = fragmentOldDaySecurityTuitionBottomSheetBinding6;
            }
            MultiStateView multiStateView3 = fragmentOldDaySecurityTuitionBottomSheetBinding.msvGeneralList;
            Intrinsics.checkNotNullExpressionValue(multiStateView3, "");
            Camera2CameraControlExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(multiStateView3, ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1, null, null, null, null);
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(setTimeout3A settimeout3a, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        settimeout3a.dismiss();
        return Unit.INSTANCE;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
        ((Camera2CameraControlImplExternalSyntheticLambda4) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).RemoteActionCompatParcelizer.observe(this, new applyStillCaptureTemplate(this));
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
        final Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4 = (Camera2CameraControlImplExternalSyntheticLambda4) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        User user = (User) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        JhtClaimContributionRequest jhtClaimContributionRequest = new JhtClaimContributionRequest(String.valueOf(user != null ? user.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null));
        Intrinsics.checkNotNullParameter(jhtClaimContributionRequest, "");
        MutableLiveData<VirtualCameraAdapter1<List<startActivityForResult>>> mutableLiveData = camera2CameraControlImplExternalSyntheticLambda4.RemoteActionCompatParcelizer;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(camera2CameraControlImplExternalSyntheticLambda4.INotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault1(jhtClaimContributionRequest)));
        final Function1 function1 = new Function1() { // from class: lambdaonCaptureFailed1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Camera2CameraControlImplExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(camera2CameraControlImplExternalSyntheticLambda4, (List) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: removeCaptureCallback
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: Camera2CameraControlImplCameraCaptureCallbackSetExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Camera2CameraControlImplExternalSyntheticLambda4.onTransact(camera2CameraControlImplExternalSyntheticLambda4, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: Camera2CameraControlImplCameraCaptureCallbackSetExternalSyntheticLambda1
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        camera2CameraControlImplExternalSyntheticLambda4.INotificationSideChannelStubProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }
}

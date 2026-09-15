package defpackage;

import android.content.ComponentCallbacks;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.p002lifecycle.ViewModelStoreOwner;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentClaimOldDaySecurityBalanceBinding;
import com.bpjstku.domain.jht.model.BenefitDetail;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityBalanceFragment$bindingInflater$1;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityBalanceFragment$special$$inlined$sharedViewModel$default$2;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.model.IndividualDataClaim;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.Camera2CameraControlImplExternalSyntheticLambda4;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.setQuickZoomEnabled;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u0004R\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u000e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0015\u0010\u000f\u001a\u00020\u00128CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u00168BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010R\u0015\u0010\u001a\u001a\u00020\u00198CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010R\u0015\u0010\u0007\u001a\u00020\u001b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001c\u0010\u0010R\u0014\u0010\u001f\u001a\u00020\u001d8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001eR.\u0010$\u001a\u001c\u0012\u0004\u0012\u00020!\u0012\u0006\u0012\u0004\u0018\u00010\"\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00020 8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%"}, d2 = {"LCamera2CameraImplExternalSyntheticLambda16;", "LAutoValue_ImmutableImageInfo;", "Lcom/bpjstku/databinding/FragmentClaimOldDaySecurityBalanceBinding;", "<init>", "()V", "", "INotificationSideChannelDefault", "g", "cancelAll", "cancel", "onTransact", "INotificationSideChannel", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "Lcom/bpjstku/presentation/program/jht/olddaysecurity/eclaim/model/IndividualDataClaim;", "b", "Lkotlin/Lazy;", "TuitionPaymentFragmentbindingInflater1", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "LgetStringOrNull;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LgetStringOrNull;", "Lcom/bpjstku/domain/user/model/User;", "a", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LCamera2CameraControlImplExternalSyntheticLambda4;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LgetExtendedConfig;", "asBinder", "", "()I", "asInterface", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "d", "()Lkotlin/jvm/functions/Function3;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Camera2CameraImplExternalSyntheticLambda16 extends AutoValue_ImmutableImageInfo<FragmentClaimOldDaySecurityBalanceBinding> {
    private static final byte[] $$a = {88, ByteCompanionObject.MAX_VALUE, -112, -47, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = DerHeader.TAG_CLASS_PRIVATE;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy b;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private getStringOrNull TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy g;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: Camera2CameraImplExternalSyntheticLambda17
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ((getExtendedConfig) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.g.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: Camera2CameraImplExternalSyntheticLambda20
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        }
    });

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 84
            int r7 = r7 * 4
            int r0 = r7 + 53
            int r5 = r5 * 3
            int r5 = 4 - r5
            byte[] r1 = defpackage.Camera2CameraImplExternalSyntheticLambda16.$$a
            byte[] r0 = new byte[r0]
            int r7 = r7 + 52
            r2 = 0
            if (r1 != 0) goto L18
            r4 = r7
            r3 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L26:
            int r3 = r3 + 1
            r4 = r1[r5]
        L2a:
            int r5 = r5 + 1
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Camera2CameraImplExternalSyntheticLambda16.c(short, byte, short, java.lang.Object[]):void");
    }

    @Override // defpackage.sendExtras
    public final void INotificationSideChannelDefault() {
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return R.layout.fragment_claim_old_day_security_balance;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
    }

    public Camera2CameraImplExternalSyntheticLambda16() {
        final Camera2CameraImplExternalSyntheticLambda16 camera2CameraImplExternalSyntheticLambda16 = this;
        this.b = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityBalanceFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = camera2CameraImplExternalSyntheticLambda16;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        final Camera2CameraImplExternalSyntheticLambda16 camera2CameraImplExternalSyntheticLambda17 = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<Camera2CameraControlImplExternalSyntheticLambda4>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityBalanceFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [Camera2CameraControlImplExternalSyntheticLambda4, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Camera2CameraControlImplExternalSyntheticLambda4 invoke() {
                LifecycleOwner lifecycleOwner = camera2CameraImplExternalSyntheticLambda17;
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
        final Camera2CameraImplExternalSyntheticLambda16 camera2CameraImplExternalSyntheticLambda18 = this;
        this.g = LazyKt.lazy(new ClaimOldDaySecurityBalanceFragment$special$$inlined$sharedViewModel$default$2(camera2CameraImplExternalSyntheticLambda18, new Function0<ViewModelStoreOwner>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOldDaySecurityBalanceFragment$special$$inlined$sharedViewModel$default$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner invoke() {
                FragmentActivity activity = camera2CameraImplExternalSyntheticLambda18.getActivity();
                if (activity != null) {
                    return activity;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.ViewModelStoreOwner");
            }

            {
                super(0);
            }
        }));
    }

    /* JADX INFO: renamed from: Camera2CameraImplExternalSyntheticLambda16$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LCamera2CameraImplExternalSyntheticLambda16$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "LCamera2CameraImplExternalSyntheticLambda16;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()LCamera2CameraImplExternalSyntheticLambda16;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static Camera2CameraImplExternalSyntheticLambda16 TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return new Camera2CameraImplExternalSyntheticLambda16();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.AutoValue_ImmutableImageInfo
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentClaimOldDaySecurityBalanceBinding> d() {
        return ClaimOldDaySecurityBalanceFragment$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        final FragmentClaimOldDaySecurityBalanceBinding fragmentClaimOldDaySecurityBalanceBindingINotificationSideChannelStub = INotificationSideChannelStub();
        Button button = fragmentClaimOldDaySecurityBalanceBindingINotificationSideChannelStub.btnNext;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: Camera2CameraImplExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Camera2CameraImplExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, fragmentClaimOldDaySecurityBalanceBindingINotificationSideChannelStub, (View) obj);
            }
        }));
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        Button button = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(button, "");
        Button button2 = button;
        Intrinsics.checkNotNullParameter(button2, "");
        button2.setEnabled(true);
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        Button button = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(button, "");
        Button button2 = button;
        Intrinsics.checkNotNullParameter(button2, "");
        button2.setEnabled(true);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(Camera2CameraImplExternalSyntheticLambda16 camera2CameraImplExternalSyntheticLambda16, FragmentClaimOldDaySecurityBalanceBinding fragmentClaimOldDaySecurityBalanceBinding, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_claim_jht_step_fourth", "submit_claim_jht_step_fourth_benefit_detail"));
        Intrinsics.checkNotNullParameter("submit_claim_jht_step_fourth_benefit_detail", "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("submit_claim_jht_step_fourth_benefit_detail", mapMutableMapOf);
        IndividualDataClaim individualDataClaim = (IndividualDataClaim) camera2CameraImplExternalSyntheticLambda16.TuitionPaymentFragmentbindingInflater1.getValue();
        IndividualDataClaim individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1 = individualDataClaim != null ? IndividualDataClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault1(individualDataClaim, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, fragmentClaimOldDaySecurityBalanceBinding.tvFinalBalaceValue.getText().toString(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, -1, -2, 127, null) : null;
        lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion companion = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.INSTANCE;
        lambdaaddCaptureRequestOptions3androidxcameracamera2interopCamera2CameraControl lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol = new lambdaaddCaptureRequestOptions3androidxcameracamera2interopCamera2CameraControl(individualDataClaimTuitionPaymentFragmentspecialinlinedviewModeldefault1, false, 2, null);
        Intrinsics.checkNotNullParameter(lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol, "");
        lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion.b().onNext(lambdaaddcapturerequestoptions3androidxcameracamera2interopcamera2cameracontrol);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Camera2CameraImplExternalSyntheticLambda16 camera2CameraImplExternalSyntheticLambda16, VirtualCameraAdapter1 virtualCameraAdapter1) throws ParseException {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_benefit_detail_fourth_step", "loading_benefit_detail_fourth_step"));
            Intrinsics.checkNotNullParameter("loading_benefit_detail_fourth_step", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("loading_benefit_detail_fourth_step", mapMutableMapOf);
            camera2CameraImplExternalSyntheticLambda16.IconCompatParcelizer();
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            TargetAspectRatio targetAspectRatio2 = TargetAspectRatio.INSTANCE;
            Map<String, Object> mapMutableMapOf2 = MapsKt.mutableMapOf(new Pair("params_benefit_detail_fourth_step", "success_benefit_detail_fourth_step"));
            Intrinsics.checkNotNullParameter("success_benefit_detail_fourth_step", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf2, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("success_benefit_detail_fourth_step", mapMutableMapOf2);
            camera2CameraImplExternalSyntheticLambda16.write();
            BenefitDetail benefitDetail = (BenefitDetail) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Intrinsics.checkNotNullParameter(benefitDetail, "");
            FragmentClaimOldDaySecurityBalanceBinding fragmentClaimOldDaySecurityBalanceBindingINotificationSideChannelStub = camera2CameraImplExternalSyntheticLambda16.INotificationSideChannelStub();
            String str = benefitDetail.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Double dValueOf = str != null ? Double.valueOf(Double.parseDouble(str)) : null;
            String str2 = benefitDetail.g;
            Double dValueOf2 = str2 != null ? Double.valueOf(Double.parseDouble(str2)) : null;
            Intrinsics.checkNotNull(dValueOf);
            double dDoubleValue = dValueOf.doubleValue();
            Intrinsics.checkNotNull(dValueOf2);
            double dDoubleValue2 = dValueOf2.doubleValue();
            String str3 = benefitDetail.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Double dValueOf3 = str3 != null ? Double.valueOf(Double.parseDouble(str3)) : null;
            String str4 = benefitDetail.d;
            Double dValueOf4 = str4 != null ? Double.valueOf(Double.parseDouble(str4)) : null;
            Intrinsics.checkNotNull(dValueOf3);
            double dDoubleValue3 = dValueOf3.doubleValue();
            Intrinsics.checkNotNull(dValueOf4);
            double dDoubleValue4 = dValueOf4.doubleValue();
            TextView textView = fragmentClaimOldDaySecurityBalanceBindingINotificationSideChannelStub.tvBeginingBalanceValue;
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getCameraOperatingMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(String.valueOf(dDoubleValue + dDoubleValue2));
            if (strTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = "";
            }
            textView.setText(strTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            TextView textView2 = fragmentClaimOldDaySecurityBalanceBindingINotificationSideChannelStub.tvBalaceDevelopmentValue;
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getCameraOperatingMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(String.valueOf(dDoubleValue3 + dDoubleValue4));
            if (strTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = "";
            }
            textView2.setText(strTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            TextView textView3 = fragmentClaimOldDaySecurityBalanceBindingINotificationSideChannelStub.tvBalaceDevelopmentTotalValue;
            String str5 = benefitDetail.INotificationSideChannel;
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = str5 != null ? getCameraOperatingMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str5) : null;
            if (strTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = "";
            }
            textView3.setText(strTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            TextView textView4 = fragmentClaimOldDaySecurityBalanceBindingINotificationSideChannelStub.tvTaxValue;
            String str6 = benefitDetail.cancel;
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault4 = str6 != null ? getCameraOperatingMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str6) : null;
            if (strTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                strTuitionPaymentFragmentspecialinlinedviewModeldefault4 = "";
            }
            textView4.setText(strTuitionPaymentFragmentspecialinlinedviewModeldefault4);
            TextView textView5 = fragmentClaimOldDaySecurityBalanceBindingINotificationSideChannelStub.tvRoundingOffValue;
            String str7 = benefitDetail.RemoteActionCompatParcelizer;
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault5 = str7 != null ? getCameraOperatingMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str7) : null;
            if (strTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                strTuitionPaymentFragmentspecialinlinedviewModeldefault5 = "";
            }
            textView5.setText(strTuitionPaymentFragmentspecialinlinedviewModeldefault5);
            TextView textView6 = fragmentClaimOldDaySecurityBalanceBindingINotificationSideChannelStub.tvFinalBalaceValue;
            String str8 = benefitDetail.INotificationSideChannelStub;
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault6 = str8 != null ? getCameraOperatingMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str8) : null;
            textView6.setText(strTuitionPaymentFragmentspecialinlinedviewModeldefault6 != null ? strTuitionPaymentFragmentspecialinlinedviewModeldefault6 : "");
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            TargetAspectRatio targetAspectRatio3 = TargetAspectRatio.INSTANCE;
            Map<String, Object> mapMutableMapOf3 = MapsKt.mutableMapOf(new Pair("params_benefit_detail_fourth_step", "failure_benefit_detail_fourth_step"));
            Intrinsics.checkNotNullParameter("failure_benefit_detail_fourth_step", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf3, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("failure_benefit_detail_fourth_step", mapMutableMapOf3);
            camera2CameraImplExternalSyntheticLambda16.write();
            getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
            String string = camera2CameraImplExternalSyntheticLambda16.getString(R.string.action_information);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String string2 = camera2CameraImplExternalSyntheticLambda16.getString(R.string.action_ok);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string, "Terjadi kesalahan", string2, null, 112);
            camera2CameraImplExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getstringornullB;
            if (getstringornullB != null) {
                FragmentManager childFragmentManager = camera2CameraImplExternalSyntheticLambda16.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                Intrinsics.checkNotNullParameter(childFragmentManager, "");
                if (childFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                    getstringornullB.show(childFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        ((Camera2CameraControlImplExternalSyntheticLambda4) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).b.observe(this, new Observer() { // from class: Camera2CameraImplExternalSyntheticLambda21
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) throws ParseException {
                Camera2CameraImplExternalSyntheticLambda16.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:100:0x036f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0372  */
    /* JADX WARN: Code duplicated, block: B:108:0x038d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0390  */
    /* JADX WARN: Code duplicated, block: B:111:0x0392  */
    /* JADX WARN: Code duplicated, block: B:123:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:129:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:130:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:64:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:70:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:72:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:78:0x0317  */
    /* JADX WARN: Code duplicated, block: B:80:0x031a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0335  */
    /* JADX WARN: Code duplicated, block: B:88:0x0338  */
    /* JADX WARN: Code duplicated, block: B:91:0x0348  */
    /* JADX WARN: Code duplicated, block: B:92:0x034b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0354  */
    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() throws Throwable {
        CharSequence charSequence;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        IndividualDataClaim individualDataClaim;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        IndividualDataClaim individualDataClaim2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        IndividualDataClaim individualDataClaim3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        IndividualDataClaim individualDataClaim4;
        Object obj;
        IndividualDataClaim individualDataClaim5;
        Object obj2;
        String str;
        IndividualDataClaim individualDataClaim6;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        IndividualDataClaim individualDataClaim7;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        Object obj3;
        IndividualDataClaim individualDataClaim8;
        String str2;
        double d;
        IndividualDataClaim individualDataClaim9;
        String str3;
        String str4;
        String str5;
        String str6;
        String strTuitionPaymentFragmentbindingInflater1;
        String str7;
        long j;
        String str8;
        FragmentClaimOldDaySecurityBalanceBinding fragmentClaimOldDaySecurityBalanceBindingINotificationSideChannelStub = INotificationSideChannelStub();
        String strValueOf = String.valueOf(Calendar.getInstance().get(1));
        fragmentClaimOldDaySecurityBalanceBindingINotificationSideChannelStub.tvBeginingBalance.setText("Saldo Tahun ".concat(String.valueOf(strValueOf)));
        fragmentClaimOldDaySecurityBalanceBindingINotificationSideChannelStub.tvBalaceDevelopment.setText("Pengembangan Tahun ".concat(String.valueOf(strValueOf)));
        TextView textView = fragmentClaimOldDaySecurityBalanceBindingINotificationSideChannelStub.tvBeginingBalanceValue;
        IndividualDataClaim individualDataClaim10 = (IndividualDataClaim) this.TuitionPaymentFragmentbindingInflater1.getValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = null;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = (individualDataClaim10 == null || (str8 = individualDataClaim10.com.google.firebase.analytics.FirebaseAnalytics.Event.SEARCH java.lang.String) == null) ? null : getCameraOperatingMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str8);
        if (strTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = "";
        }
        textView.setText(strTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        TextView textView2 = fragmentClaimOldDaySecurityBalanceBindingINotificationSideChannelStub.tvBalaceDevelopmentValue;
        IndividualDataClaim individualDataClaim11 = (IndividualDataClaim) this.TuitionPaymentFragmentbindingInflater1.getValue();
        if (individualDataClaim11 != null) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (46400 - ExpandableListView.getPackedPositionType(0L)), 40 - View.MeasureSpec.makeMeasureSpec(0, 0), 19 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
            }
            int i = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).getInt(null);
            long jLongValue = ((Long) Class.forName("android.os.SystemClock").getDeclaredMethod("elapsedRealtime", new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
            long j2 = 220;
            long j3 = -1;
            long jIdentityHashCode = System.identityHashCode(this);
            long j4 = jIdentityHashCode ^ j3;
            long j5 = (((long) 221) * 2342724796618896826L) + (((long) (-219)) * (-245467621876937839L)) + (((((j3 ^ 2342724796618896826L) | (j3 ^ (-245467621876937839L))) ^ j3) | ((j4 | (-245463772431384645L)) ^ j3)) * j2) + (((long) (-440)) * (((j4 | (-245467621876937839L)) ^ j3) | 2342724796618896826L)) + (j2 * ((-245463772431384645L) | jIdentityHashCode));
            long j6 = jLongValue;
            int i2 = 0;
            while (true) {
                if (i2 != 10) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) (37836 - View.MeasureSpec.makeMeasureSpec(0, 0)), 59 - Color.blue(0), 18 - (ViewConfiguration.getTapTimeout() >> 16), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                    }
                    int i3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getInt(null);
                    long j7 = j6;
                    int i4 = 0;
                    while (true) {
                        int i5 = 0;
                        while (i5 != 8) {
                            i3 = (((((int) (j7 >> i5)) & 255) + (i3 << 6)) + (i3 << 16)) - i3;
                            i5++;
                            j5 = j5;
                        }
                        j = j5;
                        if (i4 != 0) {
                            break;
                        }
                        i4++;
                        j7 = j;
                        j5 = j7;
                    }
                    if (i3 == i) {
                        charSequence = "";
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = null;
                        break;
                    } else {
                        j6 -= 1024;
                        i2++;
                        j5 = j;
                    }
                } else {
                    int iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, individualDataClaim11)).intValue();
                    try {
                        Object[] objArr = {-2119103575};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                            charSequence = "";
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b((char) (46039 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getTouchSlop() >> 8) + 1134, 17 - TextUtils.lastIndexOf(charSequence, '0'), 807763283, false, null, new Class[]{Integer.TYPE});
                        } else {
                            charSequence = "";
                        }
                        Object[] objArr2 = {Integer.valueOf(iIntValue), 0, -1965895445, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).newInstance(objArr), false};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                            char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                            int iLastIndexOf = 1030 - TextUtils.lastIndexOf(charSequence, '0');
                            int iArgb = 15 - Color.argb(0, 0, 0, 0);
                            byte b = $$a[7];
                            byte b2 = b;
                            Object[] objArr3 = new Object[1];
                            c(b, b2, b2, objArr3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(packedPositionChild, iLastIndexOf, iArgb, 1298546779, false, (String) objArr3[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 45993), 1117 - (ViewConfiguration.getScrollBarSize() >> 8), Color.rgb(0, 0, 0) + 16777233), Boolean.TYPE});
                        }
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = null;
                        Object[] objArr4 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr2);
                        int i6 = ((int[]) objArr4[1])[0];
                        int i7 = ((int[]) objArr4[3])[0];
                        if (i7 == i6) {
                            break;
                        }
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr4[0];
                        if (strArr != null) {
                            for (String str9 : strArr) {
                                arrayList.add(str9);
                            }
                        }
                        throw new RuntimeException(String.valueOf(i7));
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
            }
            String str10 = individualDataClaim11.unsubscribe;
            if (str10 != null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getCameraOperatingMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str10);
            }
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault1 = charSequence;
            }
            textView2.setText((CharSequence) objTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            TextView textView3 = fragmentClaimOldDaySecurityBalanceBindingINotificationSideChannelStub.tvBalaceDevelopmentTotalValue;
            individualDataClaim = (IndividualDataClaim) this.TuitionPaymentFragmentbindingInflater1.getValue();
            if (individualDataClaim != null || (str7 = individualDataClaim.MediaBrowserCompatCallbackHandler) == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
            } else {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getCameraOperatingMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str7);
            }
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = charSequence;
            }
            textView3.setText((CharSequence) objTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            TextView textView4 = fragmentClaimOldDaySecurityBalanceBindingINotificationSideChannelStub.tvTaxValue;
            individualDataClaim2 = (IndividualDataClaim) this.TuitionPaymentFragmentbindingInflater1.getValue();
            if (individualDataClaim2 != null || (strTuitionPaymentFragmentbindingInflater1 = individualDataClaim2.TuitionPaymentFragmentbindingInflater1()) == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
            } else {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getCameraOperatingMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(strTuitionPaymentFragmentbindingInflater1);
            }
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = charSequence;
            }
            textView4.setText((CharSequence) objTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            TextView textView5 = fragmentClaimOldDaySecurityBalanceBindingINotificationSideChannelStub.tvRoundingOffValue;
            individualDataClaim3 = (IndividualDataClaim) this.TuitionPaymentFragmentbindingInflater1.getValue();
            if (individualDataClaim3 != null || (str6 = individualDataClaim3.subscribe) == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
            } else {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = getCameraOperatingMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str6);
            }
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = charSequence;
            }
            textView5.setText((CharSequence) objTuitionPaymentFragmentspecialinlinedviewModeldefault4);
            individualDataClaim4 = (IndividualDataClaim) this.TuitionPaymentFragmentbindingInflater1.getValue();
            if (individualDataClaim4 != null) {
                obj = individualDataClaim4.run;
            } else {
                obj = objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
            }
            if (Intrinsics.areEqual(obj, "Y")) {
                fragmentClaimOldDaySecurityBalanceBindingINotificationSideChannelStub.gbReactivation.setVisibility(0);
                TextView textView6 = fragmentClaimOldDaySecurityBalanceBindingINotificationSideChannelStub.tvFinalTotalValue;
                individualDataClaim6 = (IndividualDataClaim) this.TuitionPaymentFragmentbindingInflater1.getValue();
                if (individualDataClaim6 != null || (str5 = individualDataClaim6.handleMessage) == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                } else {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = getCameraOperatingMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str5);
                }
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = charSequence;
                }
                textView6.setText((CharSequence) objTuitionPaymentFragmentspecialinlinedviewModeldefault5);
                TextView textView7 = fragmentClaimOldDaySecurityBalanceBindingINotificationSideChannelStub.tvBpuFeeBalaceValue;
                individualDataClaim7 = (IndividualDataClaim) this.TuitionPaymentFragmentbindingInflater1.getValue();
                if (individualDataClaim7 != null || (str4 = individualDataClaim7.MediaBrowserCompatItemReceiver) == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                } else {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = getCameraOperatingMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str4);
                }
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 != null) {
                    obj3 = objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                } else {
                    obj3 = charSequence;
                }
                textView7.setText((CharSequence) obj3);
                individualDataClaim8 = (IndividualDataClaim) this.TuitionPaymentFragmentbindingInflater1.getValue();
                if (individualDataClaim8 != null && (str2 = individualDataClaim8.MediaBrowserCompatItemReceiver) != null) {
                    d = Double.parseDouble(str2);
                    individualDataClaim9 = (IndividualDataClaim) this.TuitionPaymentFragmentbindingInflater1.getValue();
                    if (individualDataClaim9 != null && (str3 = individualDataClaim9.handleMessage) != null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = Double.valueOf(Double.parseDouble(str3) - d);
                    }
                }
                fragmentClaimOldDaySecurityBalanceBindingINotificationSideChannelStub.tvFinalBalaceValue.setText(getCameraOperatingMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(String.valueOf(objTuitionPaymentFragmentspecialinlinedviewModeldefault7)));
                return;
            }
            fragmentClaimOldDaySecurityBalanceBindingINotificationSideChannelStub.gbReactivation.setVisibility(8);
            TextView textView8 = fragmentClaimOldDaySecurityBalanceBindingINotificationSideChannelStub.tvFinalBalaceValue;
            individualDataClaim5 = (IndividualDataClaim) this.TuitionPaymentFragmentbindingInflater1.getValue();
            if (individualDataClaim5 != null && (str = individualDataClaim5.handleMessage) != null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = getCameraOperatingMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str);
            }
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 != null) {
                obj2 = objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
            } else {
                obj2 = charSequence;
            }
            textView8.setText((CharSequence) obj2);
        }
        charSequence = "";
        objTuitionPaymentFragmentspecialinlinedviewModeldefault1 = objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault1 = charSequence;
        }
        textView2.setText((CharSequence) objTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        TextView textView9 = fragmentClaimOldDaySecurityBalanceBindingINotificationSideChannelStub.tvBalaceDevelopmentTotalValue;
        individualDataClaim = (IndividualDataClaim) this.TuitionPaymentFragmentbindingInflater1.getValue();
        if (individualDataClaim != null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        } else {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        }
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = charSequence;
        }
        textView9.setText((CharSequence) objTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        TextView textView10 = fragmentClaimOldDaySecurityBalanceBindingINotificationSideChannelStub.tvTaxValue;
        individualDataClaim2 = (IndividualDataClaim) this.TuitionPaymentFragmentbindingInflater1.getValue();
        if (individualDataClaim2 != null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        } else {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        }
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = charSequence;
        }
        textView10.setText((CharSequence) objTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        TextView textView11 = fragmentClaimOldDaySecurityBalanceBindingINotificationSideChannelStub.tvRoundingOffValue;
        individualDataClaim3 = (IndividualDataClaim) this.TuitionPaymentFragmentbindingInflater1.getValue();
        if (individualDataClaim3 != null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        } else {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        }
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = charSequence;
        }
        textView11.setText((CharSequence) objTuitionPaymentFragmentspecialinlinedviewModeldefault4);
        individualDataClaim4 = (IndividualDataClaim) this.TuitionPaymentFragmentbindingInflater1.getValue();
        if (individualDataClaim4 != null) {
            obj = individualDataClaim4.run;
        } else {
            obj = objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        }
        if (Intrinsics.areEqual(obj, "Y")) {
            fragmentClaimOldDaySecurityBalanceBindingINotificationSideChannelStub.gbReactivation.setVisibility(0);
            TextView textView12 = fragmentClaimOldDaySecurityBalanceBindingINotificationSideChannelStub.tvFinalTotalValue;
            individualDataClaim6 = (IndividualDataClaim) this.TuitionPaymentFragmentbindingInflater1.getValue();
            if (individualDataClaim6 != null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
            } else {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
            }
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = charSequence;
            }
            textView12.setText((CharSequence) objTuitionPaymentFragmentspecialinlinedviewModeldefault5);
            TextView textView13 = fragmentClaimOldDaySecurityBalanceBindingINotificationSideChannelStub.tvBpuFeeBalaceValue;
            individualDataClaim7 = (IndividualDataClaim) this.TuitionPaymentFragmentbindingInflater1.getValue();
            if (individualDataClaim7 != null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
            } else {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
            }
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 != null) {
                obj3 = objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
            } else {
                obj3 = charSequence;
            }
            textView13.setText((CharSequence) obj3);
            individualDataClaim8 = (IndividualDataClaim) this.TuitionPaymentFragmentbindingInflater1.getValue();
            if (individualDataClaim8 != null) {
                d = Double.parseDouble(str2);
                individualDataClaim9 = (IndividualDataClaim) this.TuitionPaymentFragmentbindingInflater1.getValue();
                if (individualDataClaim9 != null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = Double.valueOf(Double.parseDouble(str3) - d);
                }
            }
            fragmentClaimOldDaySecurityBalanceBindingINotificationSideChannelStub.tvFinalBalaceValue.setText(getCameraOperatingMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(String.valueOf(objTuitionPaymentFragmentspecialinlinedviewModeldefault7)));
            return;
        }
        fragmentClaimOldDaySecurityBalanceBindingINotificationSideChannelStub.gbReactivation.setVisibility(8);
        TextView textView14 = fragmentClaimOldDaySecurityBalanceBindingINotificationSideChannelStub.tvFinalBalaceValue;
        individualDataClaim5 = (IndividualDataClaim) this.TuitionPaymentFragmentbindingInflater1.getValue();
        if (individualDataClaim5 != null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = getCameraOperatingMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str);
        }
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 != null) {
            obj2 = objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        } else {
            obj2 = charSequence;
        }
        textView14.setText((CharSequence) obj2);
    }
}

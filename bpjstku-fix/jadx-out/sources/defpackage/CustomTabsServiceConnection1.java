package defpackage;

import android.app.AlertDialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.p002lifecycle.ViewModelStoreOwner;
import com.bpjstku.R;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.databinding.FragmentSalariedWorkerTermAndConditionBinding;
import com.bpjstku.presentation.membership.registration.RegistrationSuccessActivity;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.presentation.membership.registration.salariedworker.SalariedWorkerTermAndConditionFragment$bindingInflater$1;
import com.bpjstku.presentation.membership.registration.salariedworker.SalariedWorkerTermAndConditionFragment$special$$inlined$sharedViewModel$default$2;
import com.bpjstku.util.utils.LocationAddressInfo;
import com.bpjstku.util.utils.UserLocationComplete;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.messaging.FirebaseMessaging;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.setQuickZoomEnabled;
import defpackage.setSplitTrack;
import java.io.IOException;
import java.util.Map;
import kotlin.Function;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u000e8\u0015X\u0095D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R.\u0010\u0019\u001a\u001c\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00020\u00138UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u001c\u001a\u00020\u001a8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0015\u0010\u001e\u001a\u00020\u001d8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\n\u0010\u001bR\u0015\u0010 \u001a\u00020\u001f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u0014\u0010\u0017\u001a\u00020!8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\"R\u0018\u0010\u0007\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\"R\u0018\u0010\u000f\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010\"R\u0018\u0010\n\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010\"R\u0017\u0010\t\u001a\u0004\u0018\u00010&8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b%\u0010\u001b"}, d2 = {"LCustomTabsServiceConnection1;", "LAutoValue_ImmutableImageInfo;", "Lcom/bpjstku/databinding/FragmentSalariedWorkerTermAndConditionBinding;", "<init>", "()V", "", "cancelAll", "g", "INotificationSideChannel", "cancel", "onTransact", "INotificationSideChannelDefault", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "", "asBinder", "I", "()I", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "d", "()Lkotlin/jvm/functions/Function3;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LsetSplitTrack;", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LgetUntrustedCreatorPackageName;", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/data/lib/PreferenceManager;", "b", "", "Ljava/lang/String;", "asInterface", "a", "notify", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CustomTabsServiceConnection1 extends AutoValue_ImmutableImageInfo<FragmentSalariedWorkerTermAndConditionBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private String onTransact;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private String asInterface;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private String a;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String asBinder;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = R.layout.fragment_salaried_worker_term_and_condition;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private String g;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String notify;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final Lazy b;
    private final String d;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final Lazy cancel;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    static final /* synthetic */ class b implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        b(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.invoke(obj);
        }
    }

    @Override // defpackage.sendExtras
    public final void INotificationSideChannelDefault() {
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
    }

    /* JADX INFO: renamed from: CustomTabsServiceConnection1$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LCustomTabsServiceConnection1$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "LCustomTabsServiceConnection1;", "TuitionPaymentFragmentbindingInflater1", "()LCustomTabsServiceConnection1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static CustomTabsServiceConnection1 TuitionPaymentFragmentbindingInflater1() {
            return new CustomTabsServiceConnection1();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CustomTabsServiceConnection1() {
        final CustomTabsServiceConnection1 customTabsServiceConnection1 = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<setSplitTrack>() { // from class: com.bpjstku.presentation.membership.registration.salariedworker.SalariedWorkerTermAndConditionFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, setSplitTrack] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ setSplitTrack invoke() {
                LifecycleOwner lifecycleOwner = customTabsServiceConnection1;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(setSplitTrack.class);
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
        final CustomTabsServiceConnection1 customTabsServiceConnection2 = this;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new SalariedWorkerTermAndConditionFragment$special$$inlined$sharedViewModel$default$2(customTabsServiceConnection2, new Function0<ViewModelStoreOwner>() { // from class: com.bpjstku.presentation.membership.registration.salariedworker.SalariedWorkerTermAndConditionFragment$special$$inlined$sharedViewModel$default$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner invoke() {
                FragmentActivity activity = customTabsServiceConnection2.getActivity();
                if (activity != null) {
                    return activity;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.ViewModelStoreOwner");
            }

            {
                super(0);
            }
        }));
        final CustomTabsServiceConnection1 customTabsServiceConnection3 = this;
        Lazy lazy = LazyKt.lazy(new Function0<PreferenceManager>() { // from class: com.bpjstku.presentation.membership.registration.salariedworker.SalariedWorkerTermAndConditionFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [com.bpjstku.data.lib.PreferenceManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final PreferenceManager invoke() {
                ComponentCallbacks componentCallbacks = customTabsServiceConnection3;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(PreferenceManager.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.b = lazy;
        this.d = ((PreferenceManager) lazy.getValue()).getString("OCR_TRANSACTION_ID", "");
        this.cancel = LazyKt.lazy(new Function0() { // from class: setToolbarItem
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((getUntrustedCreatorPackageName) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1.getValue()).b.getValue();
            }
        });
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder, reason: from getter */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.AutoValue_ImmutableImageInfo
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentSalariedWorkerTermAndConditionBinding> d() {
        return SalariedWorkerTermAndConditionFragment$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        FragmentSalariedWorkerTermAndConditionBinding fragmentSalariedWorkerTermAndConditionBindingINotificationSideChannelStub = INotificationSideChannelStub();
        MaterialButton materialButton = fragmentSalariedWorkerTermAndConditionBindingINotificationSideChannelStub.btnAgree;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: CustomTabsSession
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CustomTabsServiceConnection1.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (View) obj);
            }
        }));
        MaterialButton materialButton2 = fragmentSalariedWorkerTermAndConditionBindingINotificationSideChannelStub.btnDisagree;
        Intrinsics.checkNotNullExpressionValue(materialButton2, "");
        materialButton2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: createBundleWithId
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CustomTabsServiceConnection1.b(this.TuitionPaymentFragmentbindingInflater1, (View) obj);
            }
        }));
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(CustomTabsServiceConnection1 customTabsServiceConnection1) throws IOException {
        ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
        Camera2CameraControlExternalSyntheticLambda4 camera2CameraControlExternalSyntheticLambda4B = ExperimentalCamera2Interop.b((PreferenceManager) customTabsServiceConnection1.b.getValue());
        if (camera2CameraControlExternalSyntheticLambda4B != null && camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
            customTabsServiceConnection1.asInterface = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentbindingInflater1;
            customTabsServiceConnection1.g = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            customTabsServiceConnection1.a = camera2CameraControlExternalSyntheticLambda4B.b;
            customTabsServiceConnection1.asBinder = camera2CameraControlExternalSyntheticLambda4B.g;
            customTabsServiceConnection1.onTransact = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            customTabsServiceConnection1.notify = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str = customTabsServiceConnection1.asInterface;
            String str2 = customTabsServiceConnection1.g;
            StringBuilder sb = new StringBuilder("Location from cache: ");
            sb.append(str);
            sb.append(", ");
            sb.append(str2);
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb.toString(), new Object[0]);
        } else {
            customTabsServiceConnection1.asInterface = "0.0";
            customTabsServiceConnection1.g = "0.0";
            ExperimentalCamera2Interop experimentalCamera2Interop2 = ExperimentalCamera2Interop.INSTANCE;
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1("IP Address: ".concat(String.valueOf(ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault2())), new Object[0]);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(CustomTabsServiceConnection1 customTabsServiceConnection1, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            customTabsServiceConnection1.IconCompatParcelizer();
            str = "loading_registration_account_step_fifth_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            customTabsServiceConnection1.write();
            RegistrationSuccessActivity.Companion companion = RegistrationSuccessActivity.INSTANCE;
            Context contextRequireContext = customTabsServiceConnection1.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            RegistrationSuccessActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, (RegisteredMemberRegistration) customTabsServiceConnection1.cancel.getValue());
            BaseActivity baseActivity = customTabsServiceConnection1.TuitionPaymentFragmentbindingInflater1;
            if (baseActivity != null) {
                baseActivity.d_();
            }
            str = "success_registration_account_step_fifth_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            customTabsServiceConnection1.write();
            CustomTabsServiceConnection1 customTabsServiceConnection2 = customTabsServiceConnection1;
            String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            Intrinsics.checkNotNullParameter(customTabsServiceConnection2, "");
            Intrinsics.checkNotNullParameter(strValueOf, "");
            BaseActivity baseActivity2 = (BaseActivity) customTabsServiceConnection2.getContext();
            if (baseActivity2 != null) {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity2, strValueOf, null);
            }
            str = "failure_registration_account_step_fifth_result";
        } else {
            str = "";
        }
        FragmentActivity activity = customTabsServiceConnection1.getActivity();
        Intrinsics.checkNotNull(activity, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_event_register_account", str));
        Intrinsics.checkNotNullParameter((BaseActivity) activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(CustomTabsServiceConnection1 customTabsServiceConnection1) {
        BaseActivity baseActivity = customTabsServiceConnection1.TuitionPaymentFragmentbindingInflater1;
        if (baseActivity != null) {
            baseActivity.d_();
        }
    }

    public static /* synthetic */ Unit b(final CustomTabsServiceConnection1 customTabsServiceConnection1, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        AlertDialog.Builder builder = new AlertDialog.Builder(customTabsServiceConnection1.requireContext());
        builder.setMessage("Apakah Anda yakin tidak melanjutkan proses pendaftaran akun pada aplikasi JMO?").setCancelable(false).setPositiveButton("Ya", new DialogInterface.OnClickListener() { // from class: createEngagementSignalsCallbackWrapper
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                CustomTabsServiceConnection1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b);
            }
        }).setNegativeButton("Tidak", new DialogInterface.OnClickListener() { // from class: createMockSessionForTesting
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        builder.create().show();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(CustomTabsServiceConnection1 customTabsServiceConnection1, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            customTabsServiceConnection1.IconCompatParcelizer();
            str = "loading_registration_account_step_fifth_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            customTabsServiceConnection1.write();
            RegistrationSuccessActivity.Companion companion = RegistrationSuccessActivity.INSTANCE;
            Context contextRequireContext = customTabsServiceConnection1.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            RegistrationSuccessActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, (RegisteredMemberRegistration) customTabsServiceConnection1.cancel.getValue());
            BaseActivity baseActivity = customTabsServiceConnection1.TuitionPaymentFragmentbindingInflater1;
            if (baseActivity != null) {
                baseActivity.d_();
            }
            str = "success_registration_account_step_fifth_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            customTabsServiceConnection1.write();
            CustomTabsServiceConnection1 customTabsServiceConnection2 = customTabsServiceConnection1;
            String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            Intrinsics.checkNotNullParameter(customTabsServiceConnection2, "");
            Intrinsics.checkNotNullParameter(strValueOf, "");
            BaseActivity baseActivity2 = (BaseActivity) customTabsServiceConnection2.getContext();
            if (baseActivity2 != null) {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity2, strValueOf, null);
            }
            str = "failure_registration_account_step_fifth_result";
        } else {
            str = "";
        }
        FragmentActivity activity = customTabsServiceConnection1.getActivity();
        Intrinsics.checkNotNull(activity, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_event_register_account", str));
        Intrinsics.checkNotNullParameter((BaseActivity) activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(final CustomTabsServiceConnection1 customTabsServiceConnection1, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener() { // from class: getComponentName
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                CustomTabsServiceConnection1.b(this.TuitionPaymentFragmentbindingInflater1, task);
            }
        });
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void b(CustomTabsServiceConnection1 customTabsServiceConnection1, Task task) {
        CharSequence charSequence;
        Intrinsics.checkNotNullParameter(task, "");
        if (!task.isSuccessful() || (charSequence = (CharSequence) task.getResult()) == null || charSequence.length() == 0) {
            return;
        }
        ((getUntrustedCreatorPackageName) customTabsServiceConnection1.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(CustomTabsServiceConnection1 customTabsServiceConnection1, UserLocationComplete userLocationComplete) throws IOException {
        String str;
        String str2;
        String str3;
        String str4 = "";
        Intrinsics.checkNotNullParameter(userLocationComplete, "");
        customTabsServiceConnection1.asInterface = String.valueOf(userLocationComplete.b);
        customTabsServiceConnection1.g = String.valueOf(userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        LocationAddressInfo locationAddressInfo = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo == null || (str = locationAddressInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == null) {
            str = "";
        }
        customTabsServiceConnection1.a = str;
        customTabsServiceConnection1.asBinder = userLocationComplete.TuitionPaymentFragmentbindingInflater1();
        LocationAddressInfo locationAddressInfo2 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo2 == null || (str2 = locationAddressInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            str2 = "";
        }
        customTabsServiceConnection1.onTransact = str2;
        LocationAddressInfo locationAddressInfo3 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo3 != null && (str3 = locationAddressInfo3.d) != null) {
            str4 = str3;
        }
        customTabsServiceConnection1.notify = str4;
        String str5 = customTabsServiceConnection1.asInterface;
        String str6 = customTabsServiceConnection1.g;
        String str7 = customTabsServiceConnection1.a;
        String str8 = customTabsServiceConnection1.asBinder;
        String str9 = customTabsServiceConnection1.onTransact;
        StringBuilder sb = new StringBuilder("Location from GPS: ");
        sb.append(str5);
        sb.append(", ");
        sb.append(str6);
        sb.append(", City: ");
        sb.append(str7);
        sb.append(", Province: ");
        sb.append(str8);
        sb.append(", Country: ");
        sb.append(str9);
        getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb.toString(), new Object[0]);
        return Unit.INSTANCE;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        ((setSplitTrack) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).write.observe(getViewLifecycleOwner(), new b(new Function1() { // from class: addIdToBundle
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CustomTabsServiceConnection1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        }));
        ((setSplitTrack) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).cancelAll.observe(getViewLifecycleOwner(), new b(new Function1() { // from class: setApplicationContext
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CustomTabsServiceConnection1.b(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        }));
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        experimentalCamera2Interop.b(contextRequireContext, new Function1() { // from class: createPostMessageExtraBundle
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CustomTabsServiceConnection1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (UserLocationComplete) obj);
            }
        }, new Function0() { // from class: getBinder
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CustomTabsServiceConnection1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1);
            }
        });
    }
}

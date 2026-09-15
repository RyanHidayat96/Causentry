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
import com.bpjstku.databinding.FragmentSalariedWorkerTermAndConditionActivationBinding;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.presentation.membership.accountactivation.ActivationSuccessActivity;
import com.bpjstku.presentation.membership.accountactivation.salariedworker.SalariedWorkerTermAndConditionActivationFragment$bindingInflater$1;
import com.bpjstku.presentation.membership.login.LoginActivity;
import com.bpjstku.presentation.membership.registration.RegistrationSuccessActivity;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.util.utils.LocationAddressInfo;
import com.bpjstku.util.utils.UserLocationComplete;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.messaging.FirebaseMessaging;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.getFocusY;
import defpackage.getUntrustedCreatorPackageName;
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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u0004R\u0015\u0010\u0011\u001a\u00020\u000e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0013\u001a\u00020\u00128CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\b\u0010\u0010R\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00148CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0015\u0010\u0017\u001a\u00020\u00168CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0014\u0010\u001b\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR.\u0010\u000f\u001a\u001c\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00020\u001f8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010#R\u001a\u0010\n\u001a\u00020$8\u0015X\u0095D¢\u0006\f\n\u0004\b\u001d\u0010%\u001a\u0004\b\u001e\u0010&"}, d2 = {"LAppCompatEditTextInspectionCompanion;", "LAutoValue_ImmutableImageInfo;", "Lcom/bpjstku/databinding/FragmentSalariedWorkerTermAndConditionActivationBinding;", "<init>", "()V", "", "g", "cancelAll", "INotificationSideChannel", "cancel", "onTransact", "INotificationSideChannelDefault", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "LgetUntrustedCreatorPackageName;", "notify", "Lkotlin/Lazy;", "TuitionPaymentFragmentbindingInflater1", "LsetSplitTrack;", "b", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/bpjstku/data/lib/PreferenceManager;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "asInterface", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "a", "d", "asBinder", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "()Lkotlin/jvm/functions/Function3;", "", "I", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AppCompatEditTextInspectionCompanion extends AutoValue_ImmutableImageInfo<FragmentSalariedWorkerTermAndConditionActivationBinding> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private String cancelAll;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private String a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private String asInterface;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private String g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String d;
    private String asBinder;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int onTransact;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.invoke(obj);
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

    /* JADX INFO: renamed from: AppCompatEditTextInspectionCompanion$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LAppCompatEditTextInspectionCompanion$b;", "", "<init>", "()V", "LAppCompatEditTextInspectionCompanion;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()LAppCompatEditTextInspectionCompanion;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static AppCompatEditTextInspectionCompanion TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return new AppCompatEditTextInspectionCompanion();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AppCompatEditTextInspectionCompanion() {
        final AppCompatEditTextInspectionCompanion appCompatEditTextInspectionCompanion = this;
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.bpjstku.presentation.membership.accountactivation.salariedworker.SalariedWorkerTermAndConditionActivationFragment$special$$inlined$sharedViewModel$default$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner invoke() {
                FragmentActivity activity = appCompatEditTextInspectionCompanion.getActivity();
                if (activity != null) {
                    return activity;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.ViewModelStoreOwner");
            }

            {
                super(0);
            }
        };
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<getUntrustedCreatorPackageName>() { // from class: com.bpjstku.presentation.membership.accountactivation.salariedworker.SalariedWorkerTermAndConditionActivationFragment$special$$inlined$sharedViewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, getUntrustedCreatorPackageName] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getUntrustedCreatorPackageName invoke() {
                return getFocusY.b(appCompatEditTextInspectionCompanion, Reflection.getOrCreateKotlinClass(getUntrustedCreatorPackageName.class), this.$qualifier, function0, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        final AppCompatEditTextInspectionCompanion appCompatEditTextInspectionCompanion2 = this;
        this.b = LazyKt.lazy(new Function0<setSplitTrack>() { // from class: com.bpjstku.presentation.membership.accountactivation.salariedworker.SalariedWorkerTermAndConditionActivationFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, setSplitTrack] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ setSplitTrack invoke() {
                LifecycleOwner lifecycleOwner = appCompatEditTextInspectionCompanion2;
                mapPoint mappoint = this.$qualifier;
                Function0 function1 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(setSplitTrack.class);
                if (lifecycleOwner != null) {
                    ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
                    return isQuickZoomEnabled.b(componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b, new setQuickZoomEnabled(orCreateKotlinClass, lifecycleOwner, mappoint, null, function1, 8, null));
                }
                throw new TypeCastException("null cannot be cast to non-null type android.content.ComponentCallbacks");
            }

            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: isEmojiCapableKeyListener
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((getUntrustedCreatorPackageName) this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1.getValue()).b.getValue();
            }
        });
        final AppCompatEditTextInspectionCompanion appCompatEditTextInspectionCompanion3 = this;
        Lazy lazy = LazyKt.lazy(new Function0<PreferenceManager>() { // from class: com.bpjstku.presentation.membership.accountactivation.salariedworker.SalariedWorkerTermAndConditionActivationFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [com.bpjstku.data.lib.PreferenceManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final PreferenceManager invoke() {
                ComponentCallbacks componentCallbacks = appCompatEditTextInspectionCompanion3;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(PreferenceManager.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = lazy;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = ((PreferenceManager) lazy.getValue()).getString("OCR_TRANSACTION_ID", "");
        this.onTransact = R.layout.fragment_salaried_worker_term_and_condition_activation;
    }

    @Override // defpackage.AutoValue_ImmutableImageInfo
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentSalariedWorkerTermAndConditionActivationBinding> d() {
        return SalariedWorkerTermAndConditionActivationFragment$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder, reason: from getter */
    public final int getTuitionPaymentFragmentbindingInflater1() {
        return this.onTransact;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        MaterialButton materialButton = INotificationSideChannelStub().btnAgree;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: AppCompatHintHelper
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AppCompatEditTextInspectionCompanion.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj);
            }
        }));
        MaterialButton materialButton2 = INotificationSideChannelStub().btnDisagree;
        Intrinsics.checkNotNullExpressionValue(materialButton2, "");
        materialButton2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: wrapTransformationMethod
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AppCompatEditTextInspectionCompanion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (View) obj);
            }
        }));
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(AppCompatEditTextInspectionCompanion appCompatEditTextInspectionCompanion, Task task) {
        CharSequence charSequence;
        Intrinsics.checkNotNullParameter(task, "");
        if (!task.isSuccessful() || (charSequence = (CharSequence) task.getResult()) == null || charSequence.length() == 0) {
            return;
        }
        ((getUntrustedCreatorPackageName) appCompatEditTextInspectionCompanion.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(AppCompatEditTextInspectionCompanion appCompatEditTextInspectionCompanion, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            appCompatEditTextInspectionCompanion.IconCompatParcelizer();
            str = "loading_registration_account_step_fifth_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            appCompatEditTextInspectionCompanion.write();
            RegistrationSuccessActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegistrationSuccessActivity.INSTANCE;
            Context contextRequireContext = appCompatEditTextInspectionCompanion.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            RegistrationSuccessActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, (RegisteredMemberRegistration) appCompatEditTextInspectionCompanion.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
            BaseActivity baseActivity = appCompatEditTextInspectionCompanion.TuitionPaymentFragmentbindingInflater1;
            if (baseActivity != null) {
                baseActivity.d_();
            }
            str = "success_registration_account_step_fifth_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            appCompatEditTextInspectionCompanion.write();
            AppCompatEditTextInspectionCompanion appCompatEditTextInspectionCompanion2 = appCompatEditTextInspectionCompanion;
            String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            Intrinsics.checkNotNullParameter(appCompatEditTextInspectionCompanion2, "");
            Intrinsics.checkNotNullParameter(strValueOf, "");
            BaseActivity baseActivity2 = (BaseActivity) appCompatEditTextInspectionCompanion2.getContext();
            if (baseActivity2 != null) {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity2, strValueOf, null);
            }
            str = "failure_registration_account_step_fifth_result";
        } else {
            str = "";
        }
        FragmentActivity activity = appCompatEditTextInspectionCompanion.getActivity();
        Intrinsics.checkNotNull(activity, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_event_register_account", str));
        Intrinsics.checkNotNullParameter((BaseActivity) activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
    }

    public static /* synthetic */ Unit b(AppCompatEditTextInspectionCompanion appCompatEditTextInspectionCompanion, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            appCompatEditTextInspectionCompanion.IconCompatParcelizer();
            str = "loading_activation_account_step_fifth_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            appCompatEditTextInspectionCompanion.write();
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            if (((BaseModel) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getB()) {
                ActivationSuccessActivity.Companion bVar = ActivationSuccessActivity.INSTANCE;
                Context contextRequireContext = appCompatEditTextInspectionCompanion.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ActivationSuccessActivity.Companion.b(contextRequireContext, (RegisteredMemberRegistration) appCompatEditTextInspectionCompanion.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
                BaseActivity baseActivity = appCompatEditTextInspectionCompanion.TuitionPaymentFragmentbindingInflater1;
                if (baseActivity != null) {
                    baseActivity.d_();
                }
                str = "success_activation_account_step_fifth_result";
            } else {
                appCompatEditTextInspectionCompanion.write();
                AppCompatEditTextInspectionCompanion appCompatEditTextInspectionCompanion2 = appCompatEditTextInspectionCompanion;
                String b = ((BaseModel) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getTuitionPaymentFragmentspecialinlinedviewModeldefault1();
                Intrinsics.checkNotNullParameter(appCompatEditTextInspectionCompanion2, "");
                Intrinsics.checkNotNullParameter(b, "");
                BaseActivity baseActivity2 = (BaseActivity) appCompatEditTextInspectionCompanion2.getContext();
                if (baseActivity2 != null) {
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity2, b, null);
                }
                str = "failure_activation_account_step_fifth_result";
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            appCompatEditTextInspectionCompanion.write();
            AppCompatEditTextInspectionCompanion appCompatEditTextInspectionCompanion3 = appCompatEditTextInspectionCompanion;
            String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            Intrinsics.checkNotNullParameter(appCompatEditTextInspectionCompanion3, "");
            Intrinsics.checkNotNullParameter(strValueOf, "");
            BaseActivity baseActivity3 = (BaseActivity) appCompatEditTextInspectionCompanion3.getContext();
            if (baseActivity3 != null) {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity3, strValueOf, null);
            }
            str = "failure_activation_account_step_fifth_result";
        } else {
            str = "";
        }
        FragmentActivity activity = appCompatEditTextInspectionCompanion.getActivity();
        Intrinsics.checkNotNull(activity, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_event_activation_account", str));
        Intrinsics.checkNotNullParameter((BaseActivity) activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(AppCompatEditTextInspectionCompanion appCompatEditTextInspectionCompanion) {
        BaseActivity baseActivity = appCompatEditTextInspectionCompanion.TuitionPaymentFragmentbindingInflater1;
        if (baseActivity != null) {
            baseActivity.d_();
        }
        new LoginActivity();
    }

    public static /* synthetic */ Unit b(final AppCompatEditTextInspectionCompanion appCompatEditTextInspectionCompanion, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener() { // from class: setImageLevel
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                AppCompatEditTextInspectionCompanion.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, task);
            }
        });
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(final AppCompatEditTextInspectionCompanion appCompatEditTextInspectionCompanion, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        AlertDialog.Builder builder = new AlertDialog.Builder(appCompatEditTextInspectionCompanion.requireContext());
        builder.setMessage("Apakah Anda yakin tidak melanjutkan proses aktivasi akun pada aplikasi JMO?").setCancelable(false).setPositiveButton("Ya", new DialogInterface.OnClickListener() { // from class: setImageBitmap
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                AppCompatEditTextInspectionCompanion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }).setNegativeButton("Tidak", new DialogInterface.OnClickListener() { // from class: getSupportImageTintMode
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        builder.create().show();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(AppCompatEditTextInspectionCompanion appCompatEditTextInspectionCompanion, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            appCompatEditTextInspectionCompanion.IconCompatParcelizer();
            str = "loading_activation_account_step_fifth_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            appCompatEditTextInspectionCompanion.write();
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            if (((BaseModel) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getB()) {
                ActivationSuccessActivity.Companion bVar = ActivationSuccessActivity.INSTANCE;
                Context contextRequireContext = appCompatEditTextInspectionCompanion.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ActivationSuccessActivity.Companion.b(contextRequireContext, (RegisteredMemberRegistration) appCompatEditTextInspectionCompanion.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
                BaseActivity baseActivity = appCompatEditTextInspectionCompanion.TuitionPaymentFragmentbindingInflater1;
                if (baseActivity != null) {
                    baseActivity.d_();
                }
                str = "success_activation_account_step_fifth_result";
            } else {
                appCompatEditTextInspectionCompanion.write();
                AppCompatEditTextInspectionCompanion appCompatEditTextInspectionCompanion2 = appCompatEditTextInspectionCompanion;
                String b = ((BaseModel) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getTuitionPaymentFragmentspecialinlinedviewModeldefault1();
                Intrinsics.checkNotNullParameter(appCompatEditTextInspectionCompanion2, "");
                Intrinsics.checkNotNullParameter(b, "");
                BaseActivity baseActivity2 = (BaseActivity) appCompatEditTextInspectionCompanion2.getContext();
                if (baseActivity2 != null) {
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity2, b, null);
                }
                str = "failure_activation_account_step_fifth_result";
            }
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            appCompatEditTextInspectionCompanion.write();
            AppCompatEditTextInspectionCompanion appCompatEditTextInspectionCompanion3 = appCompatEditTextInspectionCompanion;
            String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            Intrinsics.checkNotNullParameter(appCompatEditTextInspectionCompanion3, "");
            Intrinsics.checkNotNullParameter(strValueOf, "");
            BaseActivity baseActivity3 = (BaseActivity) appCompatEditTextInspectionCompanion3.getContext();
            if (baseActivity3 != null) {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity3, strValueOf, null);
            }
            str = "failure_activation_account_step_fifth_result";
        } else {
            str = "";
        }
        FragmentActivity activity = appCompatEditTextInspectionCompanion.getActivity();
        Intrinsics.checkNotNull(activity, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_event_activation_account", str));
        Intrinsics.checkNotNullParameter((BaseActivity) activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(AppCompatEditTextInspectionCompanion appCompatEditTextInspectionCompanion) throws IOException {
        ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
        Camera2CameraControlExternalSyntheticLambda4 camera2CameraControlExternalSyntheticLambda4B = ExperimentalCamera2Interop.b((PreferenceManager) appCompatEditTextInspectionCompanion.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue());
        if (camera2CameraControlExternalSyntheticLambda4B != null && camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
            appCompatEditTextInspectionCompanion.g = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentbindingInflater1;
            appCompatEditTextInspectionCompanion.d = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            appCompatEditTextInspectionCompanion.a = camera2CameraControlExternalSyntheticLambda4B.b;
            appCompatEditTextInspectionCompanion.asBinder = camera2CameraControlExternalSyntheticLambda4B.g;
            appCompatEditTextInspectionCompanion.asInterface = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            appCompatEditTextInspectionCompanion.cancelAll = camera2CameraControlExternalSyntheticLambda4B.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            String str = appCompatEditTextInspectionCompanion.g;
            String str2 = appCompatEditTextInspectionCompanion.d;
            StringBuilder sb = new StringBuilder("Location from cache: ");
            sb.append(str);
            sb.append(", ");
            sb.append(str2);
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb.toString(), new Object[0]);
        } else {
            appCompatEditTextInspectionCompanion.g = "0.0";
            appCompatEditTextInspectionCompanion.d = "0.0";
            ExperimentalCamera2Interop experimentalCamera2Interop2 = ExperimentalCamera2Interop.INSTANCE;
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1("IP Address: ".concat(String.valueOf(ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault2())), new Object[0]);
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        ((setSplitTrack) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(getViewLifecycleOwner(), new Observer() { // from class: AppCompatImageButton
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                AppCompatEditTextInspectionCompanion.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        });
        ((setSplitTrack) this.b.getValue()).write.observe(getViewLifecycleOwner(), new Observer() { // from class: setImageDrawable
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                AppCompatEditTextInspectionCompanion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        });
        ((setSplitTrack) this.b.getValue()).cancelAll.observe(getViewLifecycleOwner(), new TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: getSupportImageTintList
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AppCompatEditTextInspectionCompanion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
        ((setSplitTrack) this.b.getValue()).notify.observe(getViewLifecycleOwner(), new TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: hasOverlappingRendering
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AppCompatEditTextInspectionCompanion.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        }));
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(AppCompatEditTextInspectionCompanion appCompatEditTextInspectionCompanion, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            appCompatEditTextInspectionCompanion.IconCompatParcelizer();
            str = "loading_registration_account_step_fifth_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            appCompatEditTextInspectionCompanion.write();
            RegistrationSuccessActivity.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegistrationSuccessActivity.INSTANCE;
            Context contextRequireContext = appCompatEditTextInspectionCompanion.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            RegistrationSuccessActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, (RegisteredMemberRegistration) appCompatEditTextInspectionCompanion.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
            BaseActivity baseActivity = appCompatEditTextInspectionCompanion.TuitionPaymentFragmentbindingInflater1;
            if (baseActivity != null) {
                baseActivity.d_();
            }
            str = "success_registration_account_step_fifth_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            appCompatEditTextInspectionCompanion.write();
            AppCompatEditTextInspectionCompanion appCompatEditTextInspectionCompanion2 = appCompatEditTextInspectionCompanion;
            String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            Intrinsics.checkNotNullParameter(appCompatEditTextInspectionCompanion2, "");
            Intrinsics.checkNotNullParameter(strValueOf, "");
            BaseActivity baseActivity2 = (BaseActivity) appCompatEditTextInspectionCompanion2.getContext();
            if (baseActivity2 != null) {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity2, strValueOf, null);
            }
            str = "failure_registration_account_step_fifth_result";
        } else {
            str = "";
        }
        FragmentActivity activity = appCompatEditTextInspectionCompanion.getActivity();
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

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        ExperimentalCamera2Interop experimentalCamera2Interop = ExperimentalCamera2Interop.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        experimentalCamera2Interop.b(contextRequireContext, new Function1() { // from class: getFilters
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AppCompatEditTextInspectionCompanion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (UserLocationComplete) obj);
            }
        }, new Function0() { // from class: AppCompatEmojiTextHelper
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppCompatEditTextInspectionCompanion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        });
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(AppCompatEditTextInspectionCompanion appCompatEditTextInspectionCompanion, UserLocationComplete userLocationComplete) throws IOException {
        String str;
        String str2;
        String str3;
        String str4 = "";
        Intrinsics.checkNotNullParameter(userLocationComplete, "");
        appCompatEditTextInspectionCompanion.g = String.valueOf(userLocationComplete.b);
        appCompatEditTextInspectionCompanion.d = String.valueOf(userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        LocationAddressInfo locationAddressInfo = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo == null || (str = locationAddressInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == null) {
            str = "";
        }
        appCompatEditTextInspectionCompanion.a = str;
        appCompatEditTextInspectionCompanion.asBinder = userLocationComplete.TuitionPaymentFragmentbindingInflater1();
        LocationAddressInfo locationAddressInfo2 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo2 == null || (str2 = locationAddressInfo2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            str2 = "";
        }
        appCompatEditTextInspectionCompanion.asInterface = str2;
        LocationAddressInfo locationAddressInfo3 = userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (locationAddressInfo3 != null && (str3 = locationAddressInfo3.d) != null) {
            str4 = str3;
        }
        appCompatEditTextInspectionCompanion.cancelAll = str4;
        String str5 = appCompatEditTextInspectionCompanion.g;
        String str6 = appCompatEditTextInspectionCompanion.d;
        String str7 = appCompatEditTextInspectionCompanion.a;
        String str8 = appCompatEditTextInspectionCompanion.asBinder;
        String str9 = appCompatEditTextInspectionCompanion.asInterface;
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
}

package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.data.registration.bpu.model.request.RegisterBpuRequest;
import com.bpjstku.databinding.FragmentNonSalariedWorkerConfirmationRegistrationBinding;
import com.bpjstku.domain.registration.general.model.Registration;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.membership.login.LoginActivity;
import com.bpjstku.presentation.membership.payment.PaymentActivity;
import com.bpjstku.presentation.membership.registration.model.ProgramChoosen;
import com.bpjstku.presentation.membership.registration.model.RegistrationForUnregistered;
import com.bpjstku.presentation.membership.registration.nonsalariedworker.NonSalariedWorkerConfirmationRegistrationFragment$bindingInflater$1;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.getImeOptions;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.setQuickZoomEnabled;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004R\u0017\u0010\u000f\u001a\u0004\u0018\u00010\f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0015\u0010\u0012\u001a\u00020\u00108CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0015\u0010\u0011\u001a\u00020\u00138CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0015\u0010\u0018\u001a\u00020\u00178CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0018\u0010\u000eR\u0014\u0010\u001c\u001a\u00020\u00198UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR.\u0010\u001a\u001a\u001c\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00020\u001d8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010!"}, d2 = {"LonPostExecute;", "LAutoValue_CameraState_StateError;", "Lcom/bpjstku/databinding/FragmentNonSalariedWorkerConfirmationRegistrationBinding;", "<init>", "()V", "", "g", "cancelAll", "b_", "cancel", "INotificationSideChannel", "onTransact", "Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;", "asInterface", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LgetImeOptions;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "LsetNavigationOnClickListener;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "asBinder", "()I", "d", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "()Lkotlin/jvm/functions/Function3;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class onPostExecute extends AutoValue_CameraState_StateError<FragmentNonSalariedWorkerConfirmationRegistrationBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: withDefaults
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return onPostExecute.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private String TuitionPaymentFragmentbindingInflater1 = "";
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: CustomTabColorSchemeParams
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return onPostExecute.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder */
    public final int getAsInterface() {
        return R.layout.fragment_non_salaried_worker_confirmation_registration;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void b_() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
    }

    public onPostExecute() {
        final onPostExecute onpostexecute = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<getImeOptions>() { // from class: com.bpjstku.presentation.membership.registration.nonsalariedworker.NonSalariedWorkerConfirmationRegistrationFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, getImeOptions] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getImeOptions invoke() {
                LifecycleOwner lifecycleOwner = onpostexecute;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(getImeOptions.class);
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
        this.b = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.membership.registration.nonsalariedworker.NonSalariedWorkerConfirmationRegistrationFragment$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                LifecycleOwner lifecycleOwner = onpostexecute;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class);
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

    /* JADX INFO: renamed from: onPostExecute$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LonPostExecute$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;", "p0", "LonPostExecute;", "b", "(Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;)LonPostExecute;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static onPostExecute b(RegistrationForUnregistered p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            onPostExecute onpostexecute = new onPostExecute();
            Bundle bundle = new Bundle();
            bundle.putParcelable("unregistered_data", p0);
            onpostexecute.setArguments(bundle);
            return onpostexecute;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.AutoValue_CameraState_StateError
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentNonSalariedWorkerConfirmationRegistrationBinding> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return NonSalariedWorkerConfirmationRegistrationFragment$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        final FragmentNonSalariedWorkerConfirmationRegistrationBinding fragmentNonSalariedWorkerConfirmationRegistrationBindingAsInterface = asInterface();
        fragmentNonSalariedWorkerConfirmationRegistrationBindingAsInterface.btnConfirmation.setOnClickListener(new View.OnClickListener() { // from class: saveFileBlocking
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                onPostExecute.TuitionPaymentFragmentbindingInflater1(fragmentNonSalariedWorkerConfirmationRegistrationBindingAsInterface, this, view);
            }
        });
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        RecyclerView recyclerView = asInterface().rvProgramChoosen;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter((setNavigationOnClickListener) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue());
        ViewCompat.setNestedScrollingEnabled(asInterface().rvProgramChoosen, false);
    }

    public static /* synthetic */ setNavigationOnClickListener TuitionPaymentFragmentspecialinlinedviewModeldefault2(onPostExecute onpostexecute) {
        Context contextRequireContext = onpostexecute.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new setNavigationOnClickListener(contextRequireContext, new ArrayList());
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(FragmentNonSalariedWorkerConfirmationRegistrationBinding fragmentNonSalariedWorkerConfirmationRegistrationBinding, onPostExecute onpostexecute, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (!fragmentNonSalariedWorkerConfirmationRegistrationBinding.cbAgreeTermCondition.isChecked()) {
                String string = onpostexecute.getString(R.string.message_check_tnc);
                Intrinsics.checkNotNullExpressionValue(string, "");
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string, 0).show();
            } else {
                if (getContentPaddingRight.TuitionPaymentFragmentbindingInflater1() > 0) {
                    getContentPaddingRight.b(String.valueOf((RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()), new Object[0]);
                }
                RegistrationForUnregistered registrationForUnregistered = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                if (Intrinsics.areEqual(registrationForUnregistered != null ? registrationForUnregistered.IconCompatParcelizer : null, "cross_selling")) {
                    final getImeOptions getimeoptions = (getImeOptions) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                    RegistrationForUnregistered registrationForUnregistered2 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                    String str = registrationForUnregistered2 != null ? registrationForUnregistered2.b : null;
                    String str2 = str == null ? "" : str;
                    RegistrationForUnregistered registrationForUnregistered3 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                    String str3 = registrationForUnregistered3 != null ? registrationForUnregistered3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null;
                    String str4 = str3 == null ? "" : str3;
                    RegistrationForUnregistered registrationForUnregistered4 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                    String str5 = registrationForUnregistered4 != null ? registrationForUnregistered4.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null;
                    String str6 = str5 == null ? "" : str5;
                    RegistrationForUnregistered registrationForUnregistered5 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                    String str7 = registrationForUnregistered5 != null ? registrationForUnregistered5.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
                    String str8 = str7 == null ? "" : str7;
                    RegistrationForUnregistered registrationForUnregistered6 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                    String str9 = registrationForUnregistered6 != null ? registrationForUnregistered6.TuitionPaymentFragmentbindingInflater1 : null;
                    String str10 = str9 == null ? "" : str9;
                    RegistrationForUnregistered registrationForUnregistered7 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                    String str11 = registrationForUnregistered7 != null ? registrationForUnregistered7.d : null;
                    String str12 = str11 == null ? "" : str11;
                    RegistrationForUnregistered registrationForUnregistered8 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                    String str13 = registrationForUnregistered8 != null ? registrationForUnregistered8.INotificationSideChannel : null;
                    String str14 = str13 == null ? "" : str13;
                    RegistrationForUnregistered registrationForUnregistered9 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                    String str15 = registrationForUnregistered9 != null ? registrationForUnregistered9.cancel : null;
                    String str16 = str15 == null ? "" : str15;
                    RegistrationForUnregistered registrationForUnregistered10 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                    String str17 = registrationForUnregistered10 != null ? registrationForUnregistered10.INotificationSideChannelDefault : null;
                    String str18 = str17 == null ? "" : str17;
                    RegistrationForUnregistered registrationForUnregistered11 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                    String str19 = registrationForUnregistered11 != null ? registrationForUnregistered11.g : null;
                    String str20 = str19 == null ? "" : str19;
                    RegistrationForUnregistered registrationForUnregistered12 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                    String str21 = registrationForUnregistered12 != null ? registrationForUnregistered12.onTransact : null;
                    String str22 = str21 == null ? "" : str21;
                    String str23 = onpostexecute.TuitionPaymentFragmentbindingInflater1;
                    RegistrationForUnregistered registrationForUnregistered13 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                    String str24 = registrationForUnregistered13 != null ? registrationForUnregistered13.INotificationSideChannelStub : null;
                    String str25 = str24 == null ? "" : str24;
                    RegistrationForUnregistered registrationForUnregistered14 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                    String str26 = registrationForUnregistered14 != null ? registrationForUnregistered14.getInterfaceDescriptor : null;
                    String str27 = str26 == null ? "" : str26;
                    RegistrationForUnregistered registrationForUnregistered15 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                    String str28 = registrationForUnregistered15 != null ? registrationForUnregistered15.notify : null;
                    RegisterBpuRequest registerBpuRequest = new RegisterBpuRequest(str12, str6, str14, str16, str18, str20, str22, str23, str25, str27, str2, str4, str10, str28 == null ? "" : str28, str8);
                    Intrinsics.checkNotNullParameter(registerBpuRequest, "");
                    MutableLiveData<VirtualCameraAdapter1<Registration>> mutableLiveData = getimeoptions.b;
                    VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
                    mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                    deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(getimeoptions.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(registerBpuRequest)));
                    final Function1 function1 = new Function1() { // from class: setInputType
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return getImeOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getimeoptions, (Registration) obj);
                        }
                    };
                    logToString logtostring = new logToString() { // from class: setImeOptions
                        @Override // defpackage.logToString
                        public final void accept(Object obj) {
                            function1.invoke(obj);
                        }
                    };
                    final Function1 function2 = new Function1() { // from class: setOnCloseListener
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return getImeOptions.asInterface(getimeoptions, (Throwable) obj);
                        }
                    };
                    BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: setIconifiedByDefault
                        @Override // defpackage.logToString
                        public final void accept(Object obj) {
                            function2.invoke(obj);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                    getimeoptions.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                } else {
                    final getImeOptions getimeoptions2 = (getImeOptions) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                    RegistrationForUnregistered registrationForUnregistered16 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                    String str29 = registrationForUnregistered16 != null ? registrationForUnregistered16.b : null;
                    String str30 = str29 == null ? "" : str29;
                    RegistrationForUnregistered registrationForUnregistered17 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                    String str31 = registrationForUnregistered17 != null ? registrationForUnregistered17.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null;
                    String str32 = str31 == null ? "" : str31;
                    RegistrationForUnregistered registrationForUnregistered18 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                    String str33 = registrationForUnregistered18 != null ? registrationForUnregistered18.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null;
                    String str34 = str33 == null ? "" : str33;
                    RegistrationForUnregistered registrationForUnregistered19 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                    String str35 = registrationForUnregistered19 != null ? registrationForUnregistered19.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
                    String str36 = str35 == null ? "" : str35;
                    RegistrationForUnregistered registrationForUnregistered20 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                    String str37 = registrationForUnregistered20 != null ? registrationForUnregistered20.TuitionPaymentFragmentbindingInflater1 : null;
                    String str38 = str37 == null ? "" : str37;
                    RegistrationForUnregistered registrationForUnregistered21 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                    String str39 = registrationForUnregistered21 != null ? registrationForUnregistered21.d : null;
                    String str40 = str39 == null ? "" : str39;
                    RegistrationForUnregistered registrationForUnregistered22 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                    String str41 = registrationForUnregistered22 != null ? registrationForUnregistered22.INotificationSideChannel : null;
                    String str42 = str41 == null ? "" : str41;
                    RegistrationForUnregistered registrationForUnregistered23 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                    String str43 = registrationForUnregistered23 != null ? registrationForUnregistered23.cancel : null;
                    String str44 = str43 == null ? "" : str43;
                    RegistrationForUnregistered registrationForUnregistered24 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                    String str45 = registrationForUnregistered24 != null ? registrationForUnregistered24.INotificationSideChannelDefault : null;
                    String str46 = str45 == null ? "" : str45;
                    RegistrationForUnregistered registrationForUnregistered25 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                    String str47 = registrationForUnregistered25 != null ? registrationForUnregistered25.g : null;
                    String str48 = str47 == null ? "" : str47;
                    RegistrationForUnregistered registrationForUnregistered26 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                    String str49 = registrationForUnregistered26 != null ? registrationForUnregistered26.onTransact : null;
                    String str50 = str49 == null ? "" : str49;
                    String str51 = onpostexecute.TuitionPaymentFragmentbindingInflater1;
                    RegistrationForUnregistered registrationForUnregistered27 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                    String str52 = registrationForUnregistered27 != null ? registrationForUnregistered27.INotificationSideChannelStub : null;
                    String str53 = str52 == null ? "" : str52;
                    RegistrationForUnregistered registrationForUnregistered28 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                    String str54 = registrationForUnregistered28 != null ? registrationForUnregistered28.getInterfaceDescriptor : null;
                    String str55 = str54 == null ? "" : str54;
                    RegistrationForUnregistered registrationForUnregistered29 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                    String str56 = registrationForUnregistered29 != null ? registrationForUnregistered29.notify : null;
                    RegisterBpuRequest registerBpuRequest2 = new RegisterBpuRequest(str40, str34, str42, str44, str46, str48, str50, str51, str53, str55, str30, str32, str38, str56 == null ? "" : str56, str36);
                    Intrinsics.checkNotNullParameter(registerBpuRequest2, "");
                    MutableLiveData<VirtualCameraAdapter1<Registration>> mutableLiveData2 = getimeoptions2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
                    mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                    deriveCodec derivecodecB2 = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(getimeoptions2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(registerBpuRequest2)));
                    final Function1 function3 = new Function1() { // from class: onSuggestionsKey
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return getImeOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getimeoptions2, (Registration) obj);
                        }
                    };
                    logToString logtostring2 = new logToString() { // from class: setIconified
                        @Override // defpackage.logToString
                        public final void accept(Object obj) {
                            function3.invoke(obj);
                        }
                    };
                    final Function1 function4 = new Function1() { // from class: setOnSearchClickListener
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return getImeOptions.asBinder(getimeoptions2, (Throwable) obj);
                        }
                    };
                    BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4 = derivecodecB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring2, new logToString() { // from class: setSubmitButtonEnabled
                        @Override // defpackage.logToString
                        public final void accept(Object obj) {
                            function4.invoke(obj);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4, "");
                    getimeoptions2.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                }
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ RegistrationForUnregistered TuitionPaymentFragmentspecialinlinedviewModeldefault3(onPostExecute onpostexecute) {
        Bundle arguments = onpostexecute.getArguments();
        if (arguments != null) {
            return (RegistrationForUnregistered) arguments.getParcelable("unregistered_data");
        }
        return null;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        ((getImeOptions) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2.observe(getViewLifecycleOwner(), new Observer() { // from class: BrowserServiceFileProviderFileSaveTask
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                onPostExecute.b(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        });
        ((getImeOptions) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).b.observe(getViewLifecycleOwner(), new Observer() { // from class: getParcelable
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                onPostExecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        });
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
        String str;
        List listSplit$default;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str2;
        User userAsBinder = ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        String str3 = userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
        if (str3 == null || str3.length() == 0) {
            RegistrationForUnregistered registrationForUnregistered = (RegistrationForUnregistered) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            if (Intrinsics.areEqual(registrationForUnregistered != null ? registrationForUnregistered.IconCompatParcelizer : null, "cross_selling")) {
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Login session habis", 0).show();
                LoginActivity.Companion companion = LoginActivity.INSTANCE;
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, null, false, 6);
                BaseActivity baseActivity = this.TuitionPaymentFragmentbindingInflater1;
                if (baseActivity != null) {
                    baseActivity.d_();
                }
            }
        }
        FragmentNonSalariedWorkerConfirmationRegistrationBinding fragmentNonSalariedWorkerConfirmationRegistrationBindingAsInterface = asInterface();
        RegistrationForUnregistered registrationForUnregistered2 = (RegistrationForUnregistered) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        List listSplit$default2 = (registrationForUnregistered2 == null || (str2 = registrationForUnregistered2.a) == null) ? null : StringsKt.split$default((CharSequence) str2, new String[]{","}, false, 0, 6, (Object) null);
        if (!Intrinsics.areEqual(listSplit$default2 != null ? (String) listSplit$default2.get(1) : null, "null")) {
            RegistrationForUnregistered registrationForUnregistered3 = (RegistrationForUnregistered) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            String str4 = registrationForUnregistered3 != null ? registrationForUnregistered3.asInterface : null;
            Intrinsics.checkNotNull(str4);
            this.TuitionPaymentFragmentbindingInflater1 = str4.toString();
            fragmentNonSalariedWorkerConfirmationRegistrationBindingAsInterface.tvTitleJobInfo.setText("Pekerjaan I");
            fragmentNonSalariedWorkerConfirmationRegistrationBindingAsInterface.tvJobTitle.setText(String.valueOf(listSplit$default2 != null ? (String) listSplit$default2.get(0) : null));
            fragmentNonSalariedWorkerConfirmationRegistrationBindingAsInterface.tvTitleJobInfoSecond.setVisibility(0);
            fragmentNonSalariedWorkerConfirmationRegistrationBindingAsInterface.tvJobTitleSecond.setVisibility(0);
            fragmentNonSalariedWorkerConfirmationRegistrationBindingAsInterface.viewDividerJobInfo.setVisibility(0);
            fragmentNonSalariedWorkerConfirmationRegistrationBindingAsInterface.tvTitleJobInfoSecond.setText("Pekerjaan II");
            fragmentNonSalariedWorkerConfirmationRegistrationBindingAsInterface.tvJobTitleSecond.setText(String.valueOf(listSplit$default2 != null ? (String) listSplit$default2.get(1) : null));
        } else {
            RegistrationForUnregistered registrationForUnregistered4 = (RegistrationForUnregistered) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            this.TuitionPaymentFragmentbindingInflater1 = String.valueOf((registrationForUnregistered4 == null || (str = registrationForUnregistered4.asInterface) == null || (listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null)) == null) ? null : (String) listSplit$default.get(0));
            fragmentNonSalariedWorkerConfirmationRegistrationBindingAsInterface.tvTitleJobInfo.setText("Pekerjaan");
            fragmentNonSalariedWorkerConfirmationRegistrationBindingAsInterface.tvJobTitle.setText(((String) listSplit$default2.get(0)).toString());
            fragmentNonSalariedWorkerConfirmationRegistrationBindingAsInterface.tvTitleJobInfoSecond.setVisibility(8);
            fragmentNonSalariedWorkerConfirmationRegistrationBindingAsInterface.tvJobTitleSecond.setVisibility(8);
            fragmentNonSalariedWorkerConfirmationRegistrationBindingAsInterface.viewDividerJobInfo.setVisibility(8);
        }
        RegistrationForUnregistered registrationForUnregistered5 = (RegistrationForUnregistered) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        String str5 = registrationForUnregistered5 != null ? registrationForUnregistered5.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null;
        if (str5 == null || str5.length() == 0) {
            fragmentNonSalariedWorkerConfirmationRegistrationBindingAsInterface.tvTitleEmail.setVisibility(8);
            fragmentNonSalariedWorkerConfirmationRegistrationBindingAsInterface.tvEmail.setVisibility(8);
            fragmentNonSalariedWorkerConfirmationRegistrationBindingAsInterface.viewDividerEmail.setVisibility(8);
            TextView textView = fragmentNonSalariedWorkerConfirmationRegistrationBindingAsInterface.tvAddress;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            TextView textView2 = textView;
            ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
            if (layoutParams != null) {
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                layoutParams2.topToBottom = R.id.viewDividerPhoneNumber;
                textView2.setLayoutParams(layoutParams2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        } else {
            fragmentNonSalariedWorkerConfirmationRegistrationBindingAsInterface.tvTitleEmail.setVisibility(0);
            fragmentNonSalariedWorkerConfirmationRegistrationBindingAsInterface.tvEmail.setVisibility(0);
            fragmentNonSalariedWorkerConfirmationRegistrationBindingAsInterface.viewDividerEmail.setVisibility(0);
            TextView textView3 = fragmentNonSalariedWorkerConfirmationRegistrationBindingAsInterface.tvEmail;
            RegistrationForUnregistered registrationForUnregistered6 = (RegistrationForUnregistered) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            textView3.setText(registrationForUnregistered6 != null ? registrationForUnregistered6.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null);
            TextView textView4 = fragmentNonSalariedWorkerConfirmationRegistrationBindingAsInterface.tvAddress;
            Intrinsics.checkNotNullExpressionValue(textView4, "");
            TextView textView5 = textView4;
            ViewGroup.LayoutParams layoutParams3 = textView5.getLayoutParams();
            if (layoutParams3 != null) {
                ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                layoutParams4.topToBottom = R.id.viewDividerEmail;
                textView5.setLayoutParams(layoutParams4);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        }
        RegistrationForUnregistered registrationForUnregistered7 = (RegistrationForUnregistered) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        if (registrationForUnregistered7 != null) {
            fragmentNonSalariedWorkerConfirmationRegistrationBindingAsInterface.tvIdCard.setText(registrationForUnregistered7.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            fragmentNonSalariedWorkerConfirmationRegistrationBindingAsInterface.tvName.setText(registrationForUnregistered7.b);
            fragmentNonSalariedWorkerConfirmationRegistrationBindingAsInterface.tvBirthDate.setText(registrationForUnregistered7.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            TextView textView6 = fragmentNonSalariedWorkerConfirmationRegistrationBindingAsInterface.tvPhoneNumber;
            try {
                strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.valueOf(registrationForUnregistered7.TuitionPaymentFragmentbindingInflater1));
            } catch (Exception unused) {
            }
            textView6.setText(strTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            fragmentNonSalariedWorkerConfirmationRegistrationBindingAsInterface.tvAddressValue.setText(registrationForUnregistered7.d);
            fragmentNonSalariedWorkerConfirmationRegistrationBindingAsInterface.tvZipCode.setText(registrationForUnregistered7.INotificationSideChannelStub);
            fragmentNonSalariedWorkerConfirmationRegistrationBindingAsInterface.tvRegisterBranchOffice.setText(registrationForUnregistered7.asBinder);
            fragmentNonSalariedWorkerConfirmationRegistrationBindingAsInterface.tvWorkLocationCity.setText(registrationForUnregistered7.cancelAll);
            fragmentNonSalariedWorkerConfirmationRegistrationBindingAsInterface.tvStartWorking.setText(registrationForUnregistered7.cancel);
            fragmentNonSalariedWorkerConfirmationRegistrationBindingAsInterface.tvEndWorking.setText(registrationForUnregistered7.INotificationSideChannel);
            TextView textView7 = fragmentNonSalariedWorkerConfirmationRegistrationBindingAsInterface.tvSalary;
            String str6 = registrationForUnregistered7.notify;
            textView7.setText(str6 != null ? getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(str6) : null);
            TextView textView8 = fragmentNonSalariedWorkerConfirmationRegistrationBindingAsInterface.tvChoosePaymentMonth;
            String str7 = registrationForUnregistered7.INotificationSideChannelDefault;
            StringBuilder sb = new StringBuilder();
            sb.append(str7);
            sb.append(" Bulan");
            textView8.setText(sb.toString());
            ArrayList arrayList = new ArrayList();
            Iterator it = StringsKt.split$default((CharSequence) registrationForUnregistered7.RemoteActionCompatParcelizer, new String[]{","}, false, 0, 6, (Object) null).iterator();
            while (it.hasNext()) {
                String string = StringsKt.trim((CharSequence) it.next()).toString();
                int iHashCode = string.hashCode();
                if (iHashCode != 73430) {
                    if (iHashCode != 73514) {
                        if (iHashCode == 73516 && string.equals("JKM")) {
                            arrayList.add(new ProgramChoosen(2, getString(R.string.label_death_security), R.drawable.ic_people_jkm));
                        }
                    } else if (string.equals("JKK")) {
                        arrayList.add(new ProgramChoosen(1, getString(R.string.label_work_accident_security), R.drawable.ic_people_jkk));
                    }
                } else if (string.equals("JHT")) {
                    arrayList.add(new ProgramChoosen(3, getString(R.string.label_old_day_security), R.drawable.ic_old_day_security));
                }
            }
            ((setNavigationOnClickListener) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(arrayList);
        }
    }

    public static /* synthetic */ void b(onPostExecute onpostexecute, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            onpostexecute.IconCompatParcelizer();
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            onpostexecute.write();
            RegistrationForUnregistered registrationForUnregistered = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            String str = Intrinsics.areEqual(registrationForUnregistered != null ? registrationForUnregistered.IconCompatParcelizer : null, "cross_selling") ? "cross_selling" : "unregistered_member";
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            Registration registration = (Registration) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            RegistrationForUnregistered registrationForUnregistered2 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            String strValueOf = String.valueOf(registrationForUnregistered2 != null ? registrationForUnregistered2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null);
            RegistrationForUnregistered registrationForUnregistered3 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            String strValueOf2 = String.valueOf(registrationForUnregistered3 != null ? registrationForUnregistered3.b : null);
            RegistrationForUnregistered registrationForUnregistered4 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            String strValueOf3 = String.valueOf(registrationForUnregistered4 != null ? registrationForUnregistered4.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null);
            RegistrationForUnregistered registrationForUnregistered5 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            String strValueOf4 = String.valueOf(registrationForUnregistered5 != null ? registrationForUnregistered5.TuitionPaymentFragmentbindingInflater1 : null);
            RegistrationForUnregistered registrationForUnregistered6 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            String strValueOf5 = String.valueOf(registrationForUnregistered6 != null ? registrationForUnregistered6.d : null);
            RegistrationForUnregistered registrationForUnregistered7 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            String strValueOf6 = String.valueOf(registrationForUnregistered7 != null ? registrationForUnregistered7.INotificationSideChannelStub : null);
            String str2 = ((Registration) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).cancel;
            Intrinsics.checkNotNull(str2);
            String str3 = (String) StringsKt.split$default((CharSequence) str2, new String[]{"#"}, false, 0, 6, (Object) null).get(0);
            Double d = ((Registration) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).INotificationSideChannelStubProxy;
            Double d2 = ((Registration) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).INotificationSideChannelStub;
            String str4 = ((Registration) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).a;
            String str5 = ((Registration) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).IconCompatParcelizer;
            String str6 = ((Registration) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).MediaBrowserCompat;
            RegistrationForUnregistered registrationForUnregistered8 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            String strValueOf7 = String.valueOf(registrationForUnregistered8 != null ? registrationForUnregistered8.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null);
            String str7 = ((Registration) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).connect;
            RegistrationForUnregistered registrationForUnregistered9 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            boolean z = registrationForUnregistered9 != null ? registrationForUnregistered9.write : false;
            RegistrationForUnregistered registrationForUnregistered10 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            Registration registrationTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Registration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registration, false, null, null, null, null, null, str4, strValueOf2, strValueOf7, strValueOf3, strValueOf4, strValueOf5, strValueOf6, str3, null, null, str, strValueOf, d2, d, null, null, str6, str7, str5, null, null, null, null, z, registrationForUnregistered10 != null ? registrationForUnregistered10.MediaBrowserCompat : false, 506511423);
            PaymentActivity.Companion companion = PaymentActivity.INSTANCE;
            Context contextRequireContext = onpostexecute.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            PaymentActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, registrationTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            onpostexecute.write();
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(onPostExecute onpostexecute, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            onpostexecute.IconCompatParcelizer();
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            onpostexecute.write();
            RegistrationForUnregistered registrationForUnregistered = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            String str = Intrinsics.areEqual(registrationForUnregistered != null ? registrationForUnregistered.IconCompatParcelizer : null, "cross_selling") ? "cross_selling" : "unregistered_member";
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            Registration registration = (Registration) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            RegistrationForUnregistered registrationForUnregistered2 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            String strValueOf = String.valueOf(registrationForUnregistered2 != null ? registrationForUnregistered2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null);
            RegistrationForUnregistered registrationForUnregistered3 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            String strValueOf2 = String.valueOf(registrationForUnregistered3 != null ? registrationForUnregistered3.b : null);
            RegistrationForUnregistered registrationForUnregistered4 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            String strValueOf3 = String.valueOf(registrationForUnregistered4 != null ? registrationForUnregistered4.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null);
            RegistrationForUnregistered registrationForUnregistered5 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            String strValueOf4 = String.valueOf(registrationForUnregistered5 != null ? registrationForUnregistered5.TuitionPaymentFragmentbindingInflater1 : null);
            RegistrationForUnregistered registrationForUnregistered6 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            String strValueOf5 = String.valueOf(registrationForUnregistered6 != null ? registrationForUnregistered6.d : null);
            RegistrationForUnregistered registrationForUnregistered7 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            String strValueOf6 = String.valueOf(registrationForUnregistered7 != null ? registrationForUnregistered7.INotificationSideChannelStub : null);
            String str2 = ((Registration) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).cancel;
            Intrinsics.checkNotNull(str2);
            String str3 = (String) StringsKt.split$default((CharSequence) str2, new String[]{"#"}, false, 0, 6, (Object) null).get(0);
            Double d = ((Registration) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).INotificationSideChannelStubProxy;
            Double d2 = ((Registration) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).INotificationSideChannelStub;
            String str4 = ((Registration) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).a;
            String str5 = ((Registration) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).IconCompatParcelizer;
            String str6 = ((Registration) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).MediaBrowserCompat;
            RegistrationForUnregistered registrationForUnregistered8 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            String strValueOf7 = String.valueOf(registrationForUnregistered8 != null ? registrationForUnregistered8.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null);
            String str7 = ((Registration) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).connect;
            RegistrationForUnregistered registrationForUnregistered9 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            boolean z = registrationForUnregistered9 != null ? registrationForUnregistered9.write : false;
            RegistrationForUnregistered registrationForUnregistered10 = (RegistrationForUnregistered) onpostexecute.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            Registration registrationTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Registration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(registration, false, null, null, null, null, null, str4, strValueOf2, strValueOf7, strValueOf3, strValueOf4, strValueOf5, strValueOf6, str3, null, null, str, strValueOf, d2, d, null, null, str6, str7, str5, null, null, null, null, z, registrationForUnregistered10 != null ? registrationForUnregistered10.MediaBrowserCompat : false, 506511423);
            PaymentActivity.Companion companion = PaymentActivity.INSTANCE;
            Context contextRequireContext = onpostexecute.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            PaymentActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, registrationTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            onpostexecute.write();
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
        }
    }
}

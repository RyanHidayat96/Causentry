package defpackage;

import android.content.ComponentCallbacks;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import com.bpjstku.R;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.registration.general.model.request.PhoneActivationVerificationRequest;
import com.bpjstku.data.registration.general.model.request.PhoneVerificationRequest;
import com.bpjstku.databinding.FragmentSalariedWorkerPhoneNumberActivationVerificationBinding;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.domain.registration.general.model.Verification;
import com.bpjstku.presentation.membership.accountactivation.newactivation.ResetAccountActivity;
import com.bpjstku.presentation.membership.accountactivation.salariedworker.SalariedWorkerPhoneNumberActivationVerificationFragment$bindingInflater$1;
import com.bpjstku.presentation.membership.accountactivation.salariedworker.SalariedWorkerPhoneNumberActivationVerificationFragment$special$$inlined$sharedViewModel$default$1;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.presentation.membership.registration.newregistration.VerificationRequestType;
import com.bpjstku.util.constant.MembershipType;
import com.google.android.material.button.MaterialButton;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.getFocusY;
import defpackage.getUntrustedCreatorPackageName;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.setQuickZoomEnabled;
import defpackage.setSplitTrack;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0014\u001a\u00020\u00118CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0017\u001a\u00020\u00158CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0015\u0010\u0019\u001a\u00020\u00188CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0015\u0010\u001a\u001a\u00020\u000e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u001b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR.\u0010\u0012\u001a\u001c\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010!\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00020\u001f8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010#R\u001a\u0010\u001d\u001a\u00020$8\u0015X\u0095D¢\u0006\f\n\u0004\b\u0019\u0010%\u001a\u0004\b&\u0010'"}, d2 = {"LgetSuperCaller;", "LAutoValue_ImmutableImageInfo;", "Lcom/bpjstku/databinding/FragmentSalariedWorkerPhoneNumberActivationVerificationBinding;", "<init>", "()V", "", "cancelAll", "onTransact", "g", "cancel", "INotificationSideChannel", "INotificationSideChannelDefault", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "", "TuitionPaymentFragmentbindingInflater1", "()Ljava/lang/String;", "LgetUntrustedCreatorPackageName;", "a", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LsetSplitTrack;", "d", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/bpjstku/data/lib/PreferenceManager;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "asInterface", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "()Lkotlin/jvm/functions/Function3;", "", "I", "asBinder", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class getSuperCaller extends AutoValue_ImmutableImageInfo<FragmentSalariedWorkerPhoneNumberActivationVerificationBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private CodeNamePair d;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int asInterface;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentbindingInflater1;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentbindingInflater1 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentbindingInflater1;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentbindingInflater1.invoke(obj);
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
    }

    /* JADX INFO: renamed from: getSuperCaller$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LgetSuperCaller$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "LgetSuperCaller;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()LgetSuperCaller;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static getSuperCaller TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return new getSuperCaller();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public getSuperCaller() {
        final getSuperCaller getsupercaller = this;
        final SalariedWorkerPhoneNumberActivationVerificationFragment$special$$inlined$sharedViewModel$default$1 salariedWorkerPhoneNumberActivationVerificationFragment$special$$inlined$sharedViewModel$default$1 = new SalariedWorkerPhoneNumberActivationVerificationFragment$special$$inlined$sharedViewModel$default$1(getsupercaller);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<getUntrustedCreatorPackageName>() { // from class: com.bpjstku.presentation.membership.accountactivation.salariedworker.SalariedWorkerPhoneNumberActivationVerificationFragment$special$$inlined$sharedViewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, getUntrustedCreatorPackageName] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getUntrustedCreatorPackageName invoke() {
                return getFocusY.b(getsupercaller, Reflection.getOrCreateKotlinClass(getUntrustedCreatorPackageName.class), this.$qualifier, salariedWorkerPhoneNumberActivationVerificationFragment$special$$inlined$sharedViewModel$default$1, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        final getSuperCaller getsupercaller2 = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<setSplitTrack>() { // from class: com.bpjstku.presentation.membership.accountactivation.salariedworker.SalariedWorkerPhoneNumberActivationVerificationFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, setSplitTrack] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ setSplitTrack invoke() {
                LifecycleOwner lifecycleOwner = getsupercaller2;
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
        final getSuperCaller getsupercaller3 = this;
        this.b = LazyKt.lazy(new Function0<PreferenceManager>() { // from class: com.bpjstku.presentation.membership.accountactivation.salariedworker.SalariedWorkerPhoneNumberActivationVerificationFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [com.bpjstku.data.lib.PreferenceManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final PreferenceManager invoke() {
                ComponentCallbacks componentCallbacks = getsupercaller3;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(PreferenceManager.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: getTextClassifier
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((PreferenceManager) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b.getValue()).getString("OCR_TRANSACTION_ID", "");
            }
        });
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: onTextContextMenuItem
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((getUntrustedCreatorPackageName) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).b.getValue();
            }
        });
        this.asInterface = R.layout.fragment_salaried_worker_phone_number_activation_verification;
    }

    @Override // defpackage.AutoValue_ImmutableImageInfo
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentSalariedWorkerPhoneNumberActivationVerificationBinding> d() {
        return SalariedWorkerPhoneNumberActivationVerificationFragment$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder, reason: from getter */
    public final int getAsBinder() {
        return this.asInterface;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        final FragmentSalariedWorkerPhoneNumberActivationVerificationBinding fragmentSalariedWorkerPhoneNumberActivationVerificationBindingINotificationSideChannelStub = INotificationSideChannelStub();
        MaterialButton materialButton = fragmentSalariedWorkerPhoneNumberActivationVerificationBindingINotificationSideChannelStub.btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: onDragEvent
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getSuperCaller.b(this.b, fragmentSalariedWorkerPhoneNumberActivationVerificationBindingINotificationSideChannelStub, (View) obj);
            }
        }));
        fragmentSalariedWorkerPhoneNumberActivationVerificationBindingINotificationSideChannelStub.tvPrefix.setOnClickListener(new View.OnClickListener() { // from class: setTextClassifier
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                getSuperCaller.TuitionPaymentFragmentbindingInflater1(this.b, fragmentSalariedWorkerPhoneNumberActivationVerificationBindingINotificationSideChannelStub, view);
            }
        });
    }

    @Override // defpackage.sendExtras
    public final void INotificationSideChannelDefault() {
        EditText editText = INotificationSideChannelStub().edtPhoneNumber;
        Intrinsics.checkNotNullExpressionValue(editText, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(editText, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string))));
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        MaterialButton materialButton = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(false);
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        MaterialButton materialButton = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        MaterialButton materialButton2 = materialButton;
        Intrinsics.checkNotNullParameter(materialButton2, "");
        materialButton2.setEnabled(true);
    }

    private final String TuitionPaymentFragmentbindingInflater1() {
        String strReplace$default = StringsKt.replace$default(StringsKt.trim((CharSequence) INotificationSideChannelStub().tvPrefix.getText().toString()).toString(), "+", "", false, 4, (Object) null);
        String string = StringsKt.trim((CharSequence) INotificationSideChannelStub().edtPhoneNumber.getText().toString()).toString();
        StringBuilder sb = new StringBuilder();
        sb.append(strReplace$default);
        sb.append(string);
        return sb.toString();
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(getSuperCaller getsupercaller, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            getsupercaller.IconCompatParcelizer();
            str = "loading_registration_account_step_third_result";
        } else {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                getsupercaller.write();
                RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) getsupercaller.TuitionPaymentFragmentbindingInflater1.getValue();
                ((getUntrustedCreatorPackageName) getsupercaller.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).b.setValue(registeredMemberRegistration != null ? RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration, null, null, null, null, null, null, null, null, getsupercaller.TuitionPaymentFragmentbindingInflater1(), null, null, null, null, ((Verification) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1, null, null, null, null, null, null, null, null, null, 8380159) : null);
                ResetAccountActivity resetAccountActivity = (ResetAccountActivity) getsupercaller.getActivity();
                if (resetAccountActivity != null) {
                    resetAccountActivity.b(VerificationRequestType.PHONE);
                }
                str = "success_registration_account_step_third_result";
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                getsupercaller.write();
                VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
                String string = StringsKt.trim((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2)).toString();
                String string2 = getsupercaller.getString(R.string.error_phone_number_not_match);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                if (StringsKt.contains$default((CharSequence) string, (CharSequence) string2, false, 2, (Object) null)) {
                    getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                    String string3 = getsupercaller.getString(R.string.title_phone_number_not_match);
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    String string4 = getsupercaller.getString(R.string.message_phone_number_not_match);
                    Intrinsics.checkNotNullExpressionValue(string4, "");
                    String string5 = getsupercaller.getString(R.string.action_ok);
                    Intrinsics.checkNotNullExpressionValue(string5, "");
                    getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string3, string4, string5, new Function0() { // from class: AppCompatEmojiEditTextHelper
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    }, 96);
                    FragmentManager childFragmentManager = getsupercaller.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    Intrinsics.checkNotNullParameter(childFragmentManager, "");
                    if (childFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        getstringornullB.show(childFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                } else {
                    getSuperCaller getsupercaller2 = getsupercaller;
                    String strValueOf = String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    Intrinsics.checkNotNullParameter(getsupercaller2, "");
                    Intrinsics.checkNotNullParameter(strValueOf, "");
                    BaseActivity baseActivity = (BaseActivity) getsupercaller2.getContext();
                    if (baseActivity != null) {
                        retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, strValueOf, null);
                    }
                }
                str = "failure_registration_account_step_third_result";
            } else {
                str = "";
            }
        }
        FragmentActivity activity = getsupercaller.getActivity();
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

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(final getSuperCaller getsupercaller, final FragmentSalariedWorkerPhoneNumberActivationVerificationBinding fragmentSalariedWorkerPhoneNumberActivationVerificationBinding, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            getItemView.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault2 = getItemView.INSTANCE;
            getItemView getitemviewTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getItemView.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getsupercaller.d, new Function1() { // from class: getKeyListener
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return getSuperCaller.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, fragmentSalariedWorkerPhoneNumberActivationVerificationBinding, (CodeNamePair) obj);
                }
            });
            FragmentManager childFragmentManager = getsupercaller.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(getitemviewTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getitemviewTuitionPaymentFragmentspecialinlinedviewModeldefault1.show(childFragmentManager, getitemviewTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ Unit b(getSuperCaller getsupercaller, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            getsupercaller.IconCompatParcelizer();
            str = "loading_registration_account_step_third_result";
        } else {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                getsupercaller.write();
                RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) getsupercaller.TuitionPaymentFragmentbindingInflater1.getValue();
                ((getUntrustedCreatorPackageName) getsupercaller.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).b.setValue(registeredMemberRegistration != null ? RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration, null, null, null, null, null, null, null, null, getsupercaller.TuitionPaymentFragmentbindingInflater1(), null, null, null, null, ((Verification) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1, null, null, null, null, null, null, null, null, null, 8380159) : null);
                ResetAccountActivity resetAccountActivity = (ResetAccountActivity) getsupercaller.getActivity();
                if (resetAccountActivity != null) {
                    resetAccountActivity.b(VerificationRequestType.PHONE);
                }
                str = "success_registration_account_step_third_result";
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                getsupercaller.write();
                VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
                if (StringsKt.contains$default((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), (CharSequence) "|", false, 2, (Object) null)) {
                    List listSplit$default = StringsKt.split$default((CharSequence) StringsKt.trim((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2)).toString(), new String[]{"|"}, false, 0, 6, (Object) null);
                    String str2 = (String) listSplit$default.get(0);
                    String str3 = (String) listSplit$default.get(1);
                    getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                    String string = getsupercaller.getString(R.string.action_ok);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, str2, str3, string, new Function0() { // from class: AppCompatEditTextSuperCaller
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    }, 96);
                    FragmentManager childFragmentManager = getsupercaller.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    Intrinsics.checkNotNullParameter(childFragmentManager, "");
                    if (childFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        getstringornullB.show(childFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                } else {
                    getSuperCaller getsupercaller2 = getsupercaller;
                    String strValueOf = String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    Intrinsics.checkNotNullParameter(getsupercaller2, "");
                    Intrinsics.checkNotNullParameter(strValueOf, "");
                    BaseActivity baseActivity = (BaseActivity) getsupercaller2.getContext();
                    if (baseActivity != null) {
                        retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, strValueOf, null);
                    }
                }
                str = "failure_registration_account_step_third_result";
            } else {
                str = "";
            }
        }
        FragmentActivity activity = getsupercaller.getActivity();
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

    /* JADX WARN: Code duplicated, block: B:10:0x0078  */
    /* JADX WARN: Code duplicated, block: B:29:0x0161  */
    public static /* synthetic */ Unit b(getSuperCaller getsupercaller, FragmentSalariedWorkerPhoneNumberActivationVerificationBinding fragmentSalariedWorkerPhoneNumberActivationVerificationBinding, View view) {
        int length;
        Intrinsics.checkNotNullParameter(view, "");
        VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(view, getsupercaller.requireContext());
        fragmentSalariedWorkerPhoneNumberActivationVerificationBinding.salariedWorkerPhoneNumberContainer.requestFocus();
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) getsupercaller.TuitionPaymentFragmentbindingInflater1.getValue();
        List listSplit$default = StringsKt.split$default((CharSequence) String.valueOf(registeredMemberRegistration != null ? registeredMemberRegistration.asInterface : null), new String[]{"#"}, false, 0, 6, (Object) null);
        if (Intrinsics.areEqual(StringsKt.trim((CharSequence) fragmentSalariedWorkerPhoneNumberActivationVerificationBinding.tvPrefix.getText().toString()).toString(), "+62")) {
            String string = StringsKt.trim((CharSequence) fragmentSalariedWorkerPhoneNumberActivationVerificationBinding.edtPhoneNumber.getText().toString()).toString();
            Intrinsics.checkNotNullParameter(string, "");
            if (new Regex("^(?![01234579]|61|6[23456789]|60|0[1-7]|09)\\d{9,14}$").matches(string)) {
                length = StringsKt.trim((CharSequence) fragmentSalariedWorkerPhoneNumberActivationVerificationBinding.edtPhoneNumber.getText().toString()).toString().length();
                if (4 <= length || length >= 16) {
                    String string2 = getsupercaller.getString(R.string.error_format_phone_number);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string2, 0).show();
                } else if (Intrinsics.areEqual(listSplit$default.get(1), ExifInterface.GPS_DIRECTION_TRUE)) {
                    final setSplitTrack setsplittrack = (setSplitTrack) getsupercaller.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                    String str = (String) getsupercaller.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                    RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) getsupercaller.TuitionPaymentFragmentbindingInflater1.getValue();
                    String strValueOf = String.valueOf(registeredMemberRegistration2 != null ? registeredMemberRegistration2.TuitionPaymentFragmentbindingInflater1 : null);
                    String strTuitionPaymentFragmentbindingInflater1 = getsupercaller.TuitionPaymentFragmentbindingInflater1();
                    String strTuitionPaymentFragmentbindingInflater2 = getsupercaller.TuitionPaymentFragmentbindingInflater1();
                    RegisteredMemberRegistration registeredMemberRegistration3 = (RegisteredMemberRegistration) getsupercaller.TuitionPaymentFragmentbindingInflater1.getValue();
                    PhoneActivationVerificationRequest phoneActivationVerificationRequest = new PhoneActivationVerificationRequest(strValueOf, strTuitionPaymentFragmentbindingInflater1, strTuitionPaymentFragmentbindingInflater2, String.valueOf(registeredMemberRegistration3 != null ? registeredMemberRegistration3.INotificationSideChannel : null), (String) listSplit$default.get(0));
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(phoneActivationVerificationRequest, "");
                    MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData = setsplittrack.RemoteActionCompatParcelizer;
                    VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
                    mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
                    deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(setsplittrack.MediaBrowserCompat.TuitionPaymentFragmentbindingInflater1(str, phoneActivationVerificationRequest)));
                    final Function1 function1 = new Function1() { // from class: getLogoDescription
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return setSplitTrack.TuitionPaymentFragmentspecialinlinedviewModeldefault3(setsplittrack, (Verification) obj);
                        }
                    };
                    logToString logtostring = new logToString() { // from class: getWrapper
                        @Override // defpackage.logToString
                        public final void accept(Object obj) {
                            function1.invoke(obj);
                        }
                    };
                    final Function1 function2 = new Function1() { // from class: setEnforceSwitchWidth
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return setSplitTrack.INotificationSideChannelDefault(setsplittrack, (Throwable) obj);
                        }
                    };
                    BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: onFailed
                        @Override // defpackage.logToString
                        public final void accept(Object obj) {
                            function2.invoke(obj);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                    setsplittrack.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                } else {
                    setSplitTrack setsplittrack2 = (setSplitTrack) getsupercaller.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                    String strTuitionPaymentFragmentbindingInflater3 = getsupercaller.TuitionPaymentFragmentbindingInflater1();
                    RegisteredMemberRegistration registeredMemberRegistration4 = (RegisteredMemberRegistration) getsupercaller.TuitionPaymentFragmentbindingInflater1.getValue();
                    setsplittrack2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new PhoneVerificationRequest(strTuitionPaymentFragmentbindingInflater3, String.valueOf(registeredMemberRegistration4 != null ? registeredMemberRegistration4.TuitionPaymentFragmentbindingInflater1 : null)));
                }
            } else {
                String string3 = getsupercaller.getString(R.string.error_format_phone_number);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string3, 0).show();
            }
        } else {
            length = StringsKt.trim((CharSequence) fragmentSalariedWorkerPhoneNumberActivationVerificationBinding.edtPhoneNumber.getText().toString()).toString().length();
            if (4 <= length) {
                String string4 = getsupercaller.getString(R.string.error_format_phone_number);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string4, 0).show();
            } else {
                String string5 = getsupercaller.getString(R.string.error_format_phone_number);
                Intrinsics.checkNotNullExpressionValue(string5, "");
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string5, 0).show();
            }
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
        ((setSplitTrack) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).RemoteActionCompatParcelizer.observe(getViewLifecycleOwner(), new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: AppCompatEditText
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getSuperCaller.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        }));
        ((setSplitTrack) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).IconCompatParcelizer.observe(getViewLifecycleOwner(), new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function1() { // from class: onReceiveContent
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getSuperCaller.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        }));
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        MembershipType membershipType;
        String str;
        String strSubstring;
        String strSubstring2;
        String str2;
        String str3;
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) this.TuitionPaymentFragmentbindingInflater1.getValue();
        String strName = null;
        if (registeredMemberRegistration != null && (str = registeredMemberRegistration.g) != null && str.length() > 0) {
            RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) this.TuitionPaymentFragmentbindingInflater1.getValue();
            if (registeredMemberRegistration2 == null || (str3 = registeredMemberRegistration2.g) == null) {
                strSubstring = null;
            } else {
                strSubstring = str3.substring(0, 2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            }
            RegisteredMemberRegistration registeredMemberRegistration3 = (RegisteredMemberRegistration) this.TuitionPaymentFragmentbindingInflater1.getValue();
            if (registeredMemberRegistration3 == null || (str2 = registeredMemberRegistration3.g) == null) {
                strSubstring2 = null;
            } else {
                strSubstring2 = str2.substring(2);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
            }
            INotificationSideChannelStub().tvPrefix.setText("+".concat(String.valueOf(strSubstring)));
            INotificationSideChannelStub().edtPhoneNumber.setText(strSubstring2);
        }
        RegisteredMemberRegistration registeredMemberRegistration4 = (RegisteredMemberRegistration) this.TuitionPaymentFragmentbindingInflater1.getValue();
        if (registeredMemberRegistration4 != null && (membershipType = registeredMemberRegistration4.TuitionPaymentFragmentspecialinlinedviewModeldefault2) != null) {
            strName = membershipType.name();
        }
        if (!Intrinsics.areEqual(strName, "PMI")) {
            TextView textView = INotificationSideChannelStub().tvPrefix;
            textView.setClickable(false);
            textView.setFocusable(false);
            textView.setEnabled(false);
            INotificationSideChannelStub().tvNotes.setVisibility(8);
            INotificationSideChannelStub().tvPrefix.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
            return;
        }
        TextView textView2 = INotificationSideChannelStub().tvPrefix;
        textView2.setClickable(true);
        textView2.setFocusable(true);
        textView2.setEnabled(true);
        INotificationSideChannelStub().tvNotes.setVisibility(0);
        INotificationSideChannelStub().tvPrefix.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.ic_arrow_down, 0);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(getSuperCaller getsupercaller, FragmentSalariedWorkerPhoneNumberActivationVerificationBinding fragmentSalariedWorkerPhoneNumberActivationVerificationBinding, CodeNamePair codeNamePair) {
        Intrinsics.checkNotNullParameter(codeNamePair, "");
        getsupercaller.d = codeNamePair;
        fragmentSalariedWorkerPhoneNumberActivationVerificationBinding.tvPhoneExample.setVisibility(Intrinsics.areEqual(codeNamePair.b, "+62") ? 0 : 8);
        if (codeNamePair.b.length() > 0) {
            fragmentSalariedWorkerPhoneNumberActivationVerificationBinding.tvPrefix.setText(codeNamePair.b);
        } else {
            String string = getsupercaller.getString(R.string.label_dialcode_empty);
            Intrinsics.checkNotNullExpressionValue(string, "");
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), string, 0).show();
        }
        return Unit.INSTANCE;
    }
}

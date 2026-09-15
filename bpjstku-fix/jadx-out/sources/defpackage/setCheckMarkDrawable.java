package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.p002lifecycle.ViewModelStoreOwner;
import com.bpjstku.R;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.registration.general.model.request.EmailActivationVerificationRequest;
import com.bpjstku.data.registration.general.model.request.EmailVerificationRequest;
import com.bpjstku.databinding.FragmentSalariedWorkerEmailActivationVerificationBinding;
import com.bpjstku.domain.registration.general.model.Verification;
import com.bpjstku.presentation.membership.accountactivation.newactivation.ResetAccountActivity;
import com.bpjstku.presentation.membership.accountactivation.salariedworker.SalariedWorkerEmailActivationVerificationFragment$bindingInflater$1;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.presentation.membership.registration.newregistration.VerificationRequestType;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.midtrans.sdk.corekit.core.Constants;
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
import java.util.Locale;
import java.util.Map;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u0004R\u0015\u0010\u0011\u001a\u00020\u000e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00128CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0015\u0010\u0016\u001a\u00020\u00148CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010R\u0015\u0010\u0018\u001a\u00020\u00178CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010R\u0015\u0010\u001a\u001a\u00020\u00198CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R.\u0010\u0015\u001a\u001c\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00020\u001b8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u000f\u001a\u00020!8\u0015X\u0095D¢\u0006\f\n\u0004\b\u0016\u0010\"\u001a\u0004\b\u000f\u0010#"}, d2 = {"LsetCheckMarkDrawable;", "LAutoValue_ImmutableImageInfo;", "Lcom/bpjstku/databinding/FragmentSalariedWorkerEmailActivationVerificationBinding;", "<init>", "()V", "", "cancelAll", "onTransact", "g", "INotificationSideChannel", "cancel", "INotificationSideChannelDefault", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "LgetUntrustedCreatorPackageName;", "asBinder", "Lkotlin/Lazy;", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LsetSplitTrack;", "asInterface", "b", "Lcom/bpjstku/data/lib/PreferenceManager;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "d", "()Lkotlin/jvm/functions/Function3;", "", "I", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class setCheckMarkDrawable extends AutoValue_ImmutableImageInfo<FragmentSalariedWorkerEmailActivationVerificationBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int asBinder;

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
    }

    /* JADX INFO: renamed from: setCheckMarkDrawable$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LsetCheckMarkDrawable$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "LsetCheckMarkDrawable;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()LsetCheckMarkDrawable;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static setCheckMarkDrawable TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return new setCheckMarkDrawable();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public setCheckMarkDrawable() {
        final setCheckMarkDrawable setcheckmarkdrawable = this;
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.bpjstku.presentation.membership.accountactivation.salariedworker.SalariedWorkerEmailActivationVerificationFragment$special$$inlined$sharedViewModel$default$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner invoke() {
                FragmentActivity activity = setcheckmarkdrawable.getActivity();
                if (activity != null) {
                    return activity;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.ViewModelStoreOwner");
            }

            {
                super(0);
            }
        };
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<getUntrustedCreatorPackageName>() { // from class: com.bpjstku.presentation.membership.accountactivation.salariedworker.SalariedWorkerEmailActivationVerificationFragment$special$$inlined$sharedViewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, getUntrustedCreatorPackageName] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getUntrustedCreatorPackageName invoke() {
                return getFocusY.b(setcheckmarkdrawable, Reflection.getOrCreateKotlinClass(getUntrustedCreatorPackageName.class), this.$qualifier, function0, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: onSetButtonDrawable
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((getUntrustedCreatorPackageName) this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1.getValue()).b.getValue();
            }
        });
        final setCheckMarkDrawable setcheckmarkdrawable2 = this;
        this.b = LazyKt.lazy(new Function0<setSplitTrack>() { // from class: com.bpjstku.presentation.membership.accountactivation.salariedworker.SalariedWorkerEmailActivationVerificationFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, setSplitTrack] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ setSplitTrack invoke() {
                LifecycleOwner lifecycleOwner = setcheckmarkdrawable2;
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
        final setCheckMarkDrawable setcheckmarkdrawable3 = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<PreferenceManager>() { // from class: com.bpjstku.presentation.membership.accountactivation.salariedworker.SalariedWorkerEmailActivationVerificationFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [com.bpjstku.data.lib.PreferenceManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final PreferenceManager invoke() {
                ComponentCallbacks componentCallbacks = setcheckmarkdrawable3;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(PreferenceManager.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: AppCompatCompoundButtonHelper
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((PreferenceManager) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).getString("OCR_TRANSACTION_ID", "");
            }
        });
        this.asBinder = R.layout.fragment_salaried_worker_email_activation_verification;
    }

    @Override // defpackage.AutoValue_ImmutableImageInfo
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentSalariedWorkerEmailActivationVerificationBinding> d() {
        return SalariedWorkerEmailActivationVerificationFragment$bindingInflater$1.b;
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder, reason: from getter */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.asBinder;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        final FragmentSalariedWorkerEmailActivationVerificationBinding fragmentSalariedWorkerEmailActivationVerificationBindingINotificationSideChannelStub = INotificationSideChannelStub();
        MaterialButton materialButton = fragmentSalariedWorkerEmailActivationVerificationBindingINotificationSideChannelStub.btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: AppCompatCheckedTextViewHelper
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setCheckMarkDrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, fragmentSalariedWorkerEmailActivationVerificationBindingINotificationSideChannelStub, (View) obj);
            }
        }));
    }

    @Override // defpackage.sendExtras
    public final void INotificationSideChannelDefault() {
        TextInputLayout textInputLayout = INotificationSideChannelStub().tilEmail;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        accessconfigureInstanceInternal accessconfigureinstanceinternal = new accessconfigureInstanceInternal("^.{1,}$", string);
        String string2 = getString(R.string.error_email_invalid);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf((Object[]) new accessconfigureInstanceInternal[]{accessconfigureinstanceinternal, new accessconfigureInstanceInternal(Constants.EMAIL_PATTERN, string2)})));
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

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(setCheckMarkDrawable setcheckmarkdrawable, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            setcheckmarkdrawable.IconCompatParcelizer();
            str = "loading_registration_account_step_second_result";
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                setcheckmarkdrawable.write();
                RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) setcheckmarkdrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                if (registeredMemberRegistration != null) {
                    EditText editText = setcheckmarkdrawable.INotificationSideChannelStub().tilEmail.getEditText();
                    String strValueOf = String.valueOf(editText != null ? editText.getText() : null);
                    Locale locale = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "");
                    String lowerCase = strValueOf.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration, null, StringsKt.trim((CharSequence) lowerCase).toString(), null, null, null, null, null, null, null, null, null, null, null, ((Verification) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1.toString(), null, null, null, null, null, null, null, null, null, 8380413);
                }
                ((getUntrustedCreatorPackageName) setcheckmarkdrawable.TuitionPaymentFragmentbindingInflater1.getValue()).b.setValue((RegisteredMemberRegistration) objTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                ResetAccountActivity resetAccountActivity = (ResetAccountActivity) setcheckmarkdrawable.getActivity();
                if (resetAccountActivity != null) {
                    resetAccountActivity.b(VerificationRequestType.EMAIL);
                }
                str = "success_registration_account_step_second_result";
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                setcheckmarkdrawable.write();
                VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
                String string = StringsKt.trim((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2)).toString();
                String string2 = setcheckmarkdrawable.getString(R.string.error_email_not_match);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                if (StringsKt.contains$default((CharSequence) string, (CharSequence) string2, false, 2, (Object) null)) {
                    getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                    String string3 = setcheckmarkdrawable.getString(R.string.title_email_not_match);
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    String string4 = setcheckmarkdrawable.getString(R.string.message_email_not_match);
                    Intrinsics.checkNotNullExpressionValue(string4, "");
                    String string5 = setcheckmarkdrawable.getString(R.string.action_ok);
                    Intrinsics.checkNotNullExpressionValue(string5, "");
                    getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string3, string4, string5, new Function0() { // from class: AppCompatCheckedTextViewInspectionCompanion
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    }, 96);
                    FragmentManager childFragmentManager = setcheckmarkdrawable.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    Intrinsics.checkNotNullParameter(childFragmentManager, "");
                    if (childFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        getstringornullB.show(childFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                } else {
                    setCheckMarkDrawable setcheckmarkdrawable2 = setcheckmarkdrawable;
                    String strValueOf2 = String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    Intrinsics.checkNotNullParameter(setcheckmarkdrawable2, "");
                    Intrinsics.checkNotNullParameter(strValueOf2, "");
                    BaseActivity baseActivity = (BaseActivity) setcheckmarkdrawable2.getContext();
                    if (baseActivity != null) {
                        retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, strValueOf2, null);
                    }
                }
                str = "failure_registration_account_step_second_result";
            } else {
                str = "";
            }
        }
        FragmentActivity activity = setcheckmarkdrawable.getActivity();
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

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(setCheckMarkDrawable setcheckmarkdrawable, FragmentSalariedWorkerEmailActivationVerificationBinding fragmentSalariedWorkerEmailActivationVerificationBinding, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(view, setcheckmarkdrawable.requireContext());
        fragmentSalariedWorkerEmailActivationVerificationBinding.salariedWorkerEmailContainer.requestFocus();
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) setcheckmarkdrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        List listSplit$default = StringsKt.split$default((CharSequence) String.valueOf(registeredMemberRegistration != null ? registeredMemberRegistration.asInterface : null), new String[]{"#"}, false, 0, 6, (Object) null);
        if (Intrinsics.areEqual(listSplit$default.get(1), ExifInterface.GPS_DIRECTION_TRUE)) {
            final setSplitTrack setsplittrack = (setSplitTrack) setcheckmarkdrawable.b.getValue();
            String str = (String) setcheckmarkdrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            Context contextRequireContext = setcheckmarkdrawable.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            String string = Settings.Secure.getString(contextRequireContext.getContentResolver(), "android_id");
            Intrinsics.checkExpressionValueIsNotNull(string, "");
            EditText editText = fragmentSalariedWorkerEmailActivationVerificationBinding.tilEmail.getEditText();
            String lowerCase = String.valueOf(editText != null ? editText.getText() : null).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            String string2 = StringsKt.trim((CharSequence) lowerCase).toString();
            RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) setcheckmarkdrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
            EmailActivationVerificationRequest emailActivationVerificationRequest = new EmailActivationVerificationRequest(string, string2, String.valueOf(registeredMemberRegistration2 != null ? registeredMemberRegistration2.INotificationSideChannel : null), (String) listSplit$default.get(0));
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(emailActivationVerificationRequest, "");
            MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData = setsplittrack.g;
            VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
            deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(setsplittrack.MediaBrowserCompat.b(str, emailActivationVerificationRequest)));
            final Function1 function1 = new Function1() { // from class: getDrawableIfKnown
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return setSplitTrack.TuitionPaymentFragmentbindingInflater1(setsplittrack, (Verification) obj);
                }
            };
            logToString logtostring = new logToString() { // from class: getLayoutDimension
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function1.invoke(obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: getIndexCount
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return setSplitTrack.INotificationSideChannel(setsplittrack, (Throwable) obj);
                }
            };
            BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: getInt
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function2.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
            setsplittrack.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        } else {
            setSplitTrack setsplittrack2 = (setSplitTrack) setcheckmarkdrawable.b.getValue();
            String str2 = (String) setcheckmarkdrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            Context contextRequireContext2 = setcheckmarkdrawable.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            String string3 = Settings.Secure.getString(contextRequireContext2.getContentResolver(), "android_id");
            Intrinsics.checkExpressionValueIsNotNull(string3, "");
            EditText editText2 = fragmentSalariedWorkerEmailActivationVerificationBinding.tilEmail.getEditText();
            String strValueOf = String.valueOf(editText2 != null ? editText2.getText() : null);
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            String lowerCase2 = strValueOf.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            String string4 = StringsKt.trim((CharSequence) lowerCase2).toString();
            RegisteredMemberRegistration registeredMemberRegistration3 = (RegisteredMemberRegistration) setcheckmarkdrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
            setsplittrack2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str2, new EmailVerificationRequest(string3, string4, String.valueOf(registeredMemberRegistration3 != null ? registeredMemberRegistration3.INotificationSideChannel : null)));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(setCheckMarkDrawable setcheckmarkdrawable, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            setcheckmarkdrawable.IconCompatParcelizer();
            str = "loading_registration_account_step_second_result";
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                setcheckmarkdrawable.write();
                RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) setcheckmarkdrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
                if (registeredMemberRegistration != null) {
                    EditText editText = setcheckmarkdrawable.INotificationSideChannelStub().tilEmail.getEditText();
                    String lowerCase = String.valueOf(editText != null ? editText.getText() : null).toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration, null, StringsKt.trim((CharSequence) lowerCase).toString(), null, null, null, null, null, null, null, null, null, null, null, ((Verification) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1.toString(), null, null, null, null, null, null, null, null, null, 8380413);
                }
                ((getUntrustedCreatorPackageName) setcheckmarkdrawable.TuitionPaymentFragmentbindingInflater1.getValue()).b.setValue((RegisteredMemberRegistration) objTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                ResetAccountActivity resetAccountActivity = (ResetAccountActivity) setcheckmarkdrawable.getActivity();
                if (resetAccountActivity != null) {
                    resetAccountActivity.b(VerificationRequestType.EMAIL);
                }
                str = "success_registration_account_step_second_result";
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                setcheckmarkdrawable.write();
                VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
                if (StringsKt.contains$default((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), (CharSequence) "|", false, 2, (Object) null)) {
                    List listSplit$default = StringsKt.split$default((CharSequence) StringsKt.trim((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2)).toString(), new String[]{"|"}, false, 0, 6, (Object) null);
                    String str2 = (String) listSplit$default.get(0);
                    String str3 = (String) listSplit$default.get(1);
                    getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                    String string = setcheckmarkdrawable.getString(R.string.action_ok);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, str2, str3, string, new Function0() { // from class: setSupportCheckMarkTintList
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    }, 96);
                    FragmentManager childFragmentManager = setcheckmarkdrawable.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    Intrinsics.checkNotNullParameter(childFragmentManager, "");
                    if (childFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        getstringornullB.show(childFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                } else {
                    setCheckMarkDrawable setcheckmarkdrawable2 = setcheckmarkdrawable;
                    String strValueOf = String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    Intrinsics.checkNotNullParameter(setcheckmarkdrawable2, "");
                    Intrinsics.checkNotNullParameter(strValueOf, "");
                    BaseActivity baseActivity = (BaseActivity) setcheckmarkdrawable2.getContext();
                    if (baseActivity != null) {
                        retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, strValueOf, null);
                    }
                }
                str = "failure_registration_account_step_second_result";
            } else {
                str = "";
            }
        }
        FragmentActivity activity = setcheckmarkdrawable.getActivity();
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

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
        ((setSplitTrack) this.b.getValue()).g.observe(this, new applyCheckMarkTint(this));
        ((setSplitTrack) this.b.getValue()).onTransact.observe(getViewLifecycleOwner(), new Observer() { // from class: setSupportCheckMarkTintMode
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                setCheckMarkDrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        });
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        String str;
        EditText editText;
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        if (registeredMemberRegistration == null || (str = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1) == null || str.length() <= 0 || (editText = INotificationSideChannelStub().tilEmail.getEditText()) == null) {
            return;
        }
        RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        editText.setText(registeredMemberRegistration2 != null ? registeredMemberRegistration2.TuitionPaymentFragmentbindingInflater1 : null);
    }
}

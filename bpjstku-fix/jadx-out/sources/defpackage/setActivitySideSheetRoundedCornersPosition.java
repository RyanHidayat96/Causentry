package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.p002lifecycle.ViewModelStoreOwner;
import com.bpjstku.R;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.registration.general.model.request.EmailVerificationRequest;
import com.bpjstku.databinding.FragmentSalariedWorkerEmailVerificationBinding;
import com.bpjstku.domain.registration.general.model.Verification;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.presentation.membership.registration.newregistration.NewRegistrationActivity;
import com.bpjstku.presentation.membership.registration.newregistration.VerificationRequestType;
import com.bpjstku.presentation.membership.registration.registeredmember.SalariedWorkerRegistrationActivity;
import com.bpjstku.presentation.membership.registration.salariedworker.SalariedWorkerEmailVerificationFragment$bindingInflater$1;
import com.bpjstku.util.constant.Citizenship;
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
import java.util.Locale;
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
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u0004R\u0015\u0010\u0011\u001a\u00020\u000e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00128CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0015\u0010\u0017\u001a\u00020\u00158CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010R\u0015\u0010\u0013\u001a\u00020\u00188CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0014\u0010\u001b\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u001c8\u0015X\u0095D¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u000f\u0010\u001eR.\u0010\b\u001a\u001c\u0012\u0004\u0012\u00020!\u0012\u0006\u0012\u0004\u0018\u00010\"\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00020 8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010$"}, d2 = {"LsetActivitySideSheetRoundedCornersPosition;", "LAutoValue_ImmutableImageInfo;", "Lcom/bpjstku/databinding/FragmentSalariedWorkerEmailVerificationBinding;", "<init>", "()V", "", "cancelAll", "onTransact", "g", "cancel", "INotificationSideChannel", "INotificationSideChannelDefault", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "LgetUntrustedCreatorPackageName;", "asBinder", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LsetSplitTrack;", "a", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/data/lib/PreferenceManager;", "", "Ljava/lang/String;", "b", "", "I", "()I", "d", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "()Lkotlin/jvm/functions/Function3;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class setActivitySideSheetRoundedCornersPosition extends AutoValue_ImmutableImageInfo<FragmentSalariedWorkerEmailVerificationBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final String b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int d;

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentbindingInflater1;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1) {
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

    /* JADX INFO: renamed from: setActivitySideSheetRoundedCornersPosition$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LsetActivitySideSheetRoundedCornersPosition$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "LsetActivitySideSheetRoundedCornersPosition;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()LsetActivitySideSheetRoundedCornersPosition;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static setActivitySideSheetRoundedCornersPosition TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return new setActivitySideSheetRoundedCornersPosition();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public setActivitySideSheetRoundedCornersPosition() {
        final setActivitySideSheetRoundedCornersPosition setactivitysidesheetroundedcornersposition = this;
        final Function0<ViewModelStoreOwner> function0 = new Function0<ViewModelStoreOwner>() { // from class: com.bpjstku.presentation.membership.registration.salariedworker.SalariedWorkerEmailVerificationFragment$special$$inlined$sharedViewModel$default$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
            public final ViewModelStoreOwner invoke() {
                FragmentActivity activity = setactivitysidesheetroundedcornersposition.getActivity();
                if (activity != null) {
                    return activity;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.ViewModelStoreOwner");
            }

            {
                super(0);
            }
        };
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<getUntrustedCreatorPackageName>() { // from class: com.bpjstku.presentation.membership.registration.salariedworker.SalariedWorkerEmailVerificationFragment$special$$inlined$sharedViewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, getUntrustedCreatorPackageName] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getUntrustedCreatorPackageName invoke() {
                return getFocusY.b(setactivitysidesheetroundedcornersposition, Reflection.getOrCreateKotlinClass(getUntrustedCreatorPackageName.class), this.$qualifier, function0, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: setBookmarksButtonEnabled
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((getUntrustedCreatorPackageName) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).b.getValue();
            }
        });
        final setActivitySideSheetRoundedCornersPosition setactivitysidesheetroundedcornersposition2 = this;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<setSplitTrack>() { // from class: com.bpjstku.presentation.membership.registration.salariedworker.SalariedWorkerEmailVerificationFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, setSplitTrack] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ setSplitTrack invoke() {
                LifecycleOwner lifecycleOwner = setactivitysidesheetroundedcornersposition2;
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
        final setActivitySideSheetRoundedCornersPosition setactivitysidesheetroundedcornersposition3 = this;
        Lazy lazy = LazyKt.lazy(new Function0<PreferenceManager>() { // from class: com.bpjstku.presentation.membership.registration.salariedworker.SalariedWorkerEmailVerificationFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [com.bpjstku.data.lib.PreferenceManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final PreferenceManager invoke() {
                ComponentCallbacks componentCallbacks = setactivitysidesheetroundedcornersposition3;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(PreferenceManager.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = lazy;
        this.b = ((PreferenceManager) lazy.getValue()).getString("OCR_TRANSACTION_ID", "");
        this.d = R.layout.fragment_salaried_worker_email_verification;
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder, reason: from getter */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.d;
    }

    @Override // defpackage.AutoValue_ImmutableImageInfo
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentSalariedWorkerEmailVerificationBinding> d() {
        return SalariedWorkerEmailVerificationFragment$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        final FragmentSalariedWorkerEmailVerificationBinding fragmentSalariedWorkerEmailVerificationBindingINotificationSideChannelStub = INotificationSideChannelStub();
        MaterialButton materialButton = fragmentSalariedWorkerEmailVerificationBindingINotificationSideChannelStub.btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: setBackgroundInteractionEnabled
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setActivitySideSheetRoundedCornersPosition.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, fragmentSalariedWorkerEmailVerificationBindingINotificationSideChannelStub, (View) obj);
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

    public static /* synthetic */ Unit b(setActivitySideSheetRoundedCornersPosition setactivitysidesheetroundedcornersposition, FragmentSalariedWorkerEmailVerificationBinding fragmentSalariedWorkerEmailVerificationBinding, View view) {
        Citizenship citizenship;
        Intrinsics.checkNotNullParameter(view, "");
        VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(view, setactivitysidesheetroundedcornersposition.requireContext());
        fragmentSalariedWorkerEmailVerificationBinding.salariedWorkerEmailContainer.requestFocus();
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) setactivitysidesheetroundedcornersposition.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        if (Intrinsics.areEqual((registeredMemberRegistration == null || (citizenship = registeredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == null) ? null : citizenship.name(), "WNI")) {
            setSplitTrack setsplittrack = (setSplitTrack) setactivitysidesheetroundedcornersposition.TuitionPaymentFragmentbindingInflater1.getValue();
            String str = setactivitysidesheetroundedcornersposition.b;
            Context contextRequireContext = setactivitysidesheetroundedcornersposition.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            String string = Settings.Secure.getString(contextRequireContext.getContentResolver(), "android_id");
            Intrinsics.checkExpressionValueIsNotNull(string, "");
            EditText editText = fragmentSalariedWorkerEmailVerificationBinding.tilEmail.getEditText();
            String strValueOf = String.valueOf(editText != null ? editText.getText() : null);
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            String lowerCase = strValueOf.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            String string2 = StringsKt.trim((CharSequence) lowerCase).toString();
            RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) setactivitysidesheetroundedcornersposition.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            setsplittrack.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, new EmailVerificationRequest(string, string2, String.valueOf(registeredMemberRegistration2 != null ? registeredMemberRegistration2.INotificationSideChannel : null)));
        } else {
            setSplitTrack setsplittrack2 = (setSplitTrack) setactivitysidesheetroundedcornersposition.TuitionPaymentFragmentbindingInflater1.getValue();
            Context contextRequireContext2 = setactivitysidesheetroundedcornersposition.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            String string3 = Settings.Secure.getString(contextRequireContext2.getContentResolver(), "android_id");
            Intrinsics.checkExpressionValueIsNotNull(string3, "");
            EditText editText2 = fragmentSalariedWorkerEmailVerificationBinding.tilEmail.getEditText();
            String strValueOf2 = String.valueOf(editText2 != null ? editText2.getText() : null);
            Locale locale2 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "");
            String lowerCase2 = strValueOf2.toLowerCase(locale2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            String string4 = StringsKt.trim((CharSequence) lowerCase2).toString();
            RegisteredMemberRegistration registeredMemberRegistration3 = (RegisteredMemberRegistration) setactivitysidesheetroundedcornersposition.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            setsplittrack2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new EmailVerificationRequest(string3, string4, String.valueOf(registeredMemberRegistration3 != null ? registeredMemberRegistration3.INotificationSideChannel : null)));
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(setActivitySideSheetRoundedCornersPosition setactivitysidesheetroundedcornersposition, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        RegisteredMemberRegistration registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Citizenship citizenship;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            setactivitysidesheetroundedcornersposition.IconCompatParcelizer();
            str = "loading_registration_account_step_second_result";
        } else {
            String strName = null;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                setactivitysidesheetroundedcornersposition.write();
                RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) setactivitysidesheetroundedcornersposition.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                if (registeredMemberRegistration != null) {
                    EditText editText = setactivitysidesheetroundedcornersposition.INotificationSideChannelStub().tilEmail.getEditText();
                    String strValueOf = String.valueOf(editText != null ? editText.getText() : null);
                    Locale locale = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "");
                    String lowerCase = strValueOf.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration, null, StringsKt.trim((CharSequence) lowerCase).toString(), null, null, null, null, null, null, null, null, null, null, null, ((Verification) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1.toString(), null, null, null, null, null, null, null, null, null, 8380413);
                } else {
                    registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                }
                ((getUntrustedCreatorPackageName) setactivitysidesheetroundedcornersposition.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).b.setValue(registeredMemberRegistrationTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) setactivitysidesheetroundedcornersposition.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                if (registeredMemberRegistration2 != null && (citizenship = registeredMemberRegistration2.TuitionPaymentFragmentspecialinlinedviewModeldefault1) != null) {
                    strName = citizenship.name();
                }
                if (Intrinsics.areEqual(strName, "WNI")) {
                    NewRegistrationActivity newRegistrationActivity = (NewRegistrationActivity) setactivitysidesheetroundedcornersposition.getActivity();
                    if (newRegistrationActivity != null) {
                        newRegistrationActivity.b(VerificationRequestType.EMAIL);
                    }
                } else {
                    SalariedWorkerRegistrationActivity salariedWorkerRegistrationActivity = (SalariedWorkerRegistrationActivity) setactivitysidesheetroundedcornersposition.getActivity();
                    if (salariedWorkerRegistrationActivity != null) {
                        salariedWorkerRegistrationActivity.b(VerificationRequestType.EMAIL);
                    }
                }
                str = "success_registration_account_step_second_result";
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                setactivitysidesheetroundedcornersposition.write();
                VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
                String string = StringsKt.trim((CharSequence) String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2)).toString();
                String string2 = setactivitysidesheetroundedcornersposition.getString(R.string.error_email_not_match);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                if (StringsKt.contains$default((CharSequence) string, (CharSequence) string2, false, 2, (Object) null)) {
                    getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
                    String string3 = setactivitysidesheetroundedcornersposition.getString(R.string.title_email_not_match);
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    String string4 = setactivitysidesheetroundedcornersposition.getString(R.string.message_email_not_match);
                    Intrinsics.checkNotNullExpressionValue(string4, "");
                    String string5 = setactivitysidesheetroundedcornersposition.getString(R.string.action_ok);
                    Intrinsics.checkNotNullExpressionValue(string5, "");
                    getStringOrNull getstringornullB = getStringOrNull.Companion.b(R.drawable.ic_info_blue, string3, string4, string5, new Function0() { // from class: setColorSchemeParams
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    }, 96);
                    FragmentManager childFragmentManager = setactivitysidesheetroundedcornersposition.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    Intrinsics.checkNotNullParameter(childFragmentManager, "");
                    if (childFragmentManager.findFragmentByTag(getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                        getstringornullB.show(childFragmentManager, getstringornullB.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    }
                } else {
                    setActivitySideSheetRoundedCornersPosition setactivitysidesheetroundedcornersposition2 = setactivitysidesheetroundedcornersposition;
                    String strValueOf2 = String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    Intrinsics.checkNotNullParameter(setactivitysidesheetroundedcornersposition2, "");
                    Intrinsics.checkNotNullParameter(strValueOf2, "");
                    BaseActivity baseActivity = (BaseActivity) setactivitysidesheetroundedcornersposition2.getContext();
                    if (baseActivity != null) {
                        retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, strValueOf2, null);
                    }
                }
                str = "failure_registration_account_step_second_result";
            } else {
                str = "";
            }
        }
        FragmentActivity activity = setactivitysidesheetroundedcornersposition.getActivity();
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
    public final void cancel() {
        ((setSplitTrack) this.TuitionPaymentFragmentbindingInflater1.getValue()).onTransact.observe(getViewLifecycleOwner(), new TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: setActivitySideSheetPosition
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setActivitySideSheetRoundedCornersPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        }));
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        String str;
        EditText editText;
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        if (registeredMemberRegistration == null || (str = registeredMemberRegistration.TuitionPaymentFragmentbindingInflater1) == null || str.length() <= 0 || (editText = INotificationSideChannelStub().tilEmail.getEditText()) == null) {
            return;
        }
        RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        editText.setText(registeredMemberRegistration2 != null ? registeredMemberRegistration2.TuitionPaymentFragmentbindingInflater1 : null);
    }
}

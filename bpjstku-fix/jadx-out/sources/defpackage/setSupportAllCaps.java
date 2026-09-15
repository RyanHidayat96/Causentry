package defpackage;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.p002lifecycle.Observer;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentSalariedActivationWorkerPasswordBinding;
import com.bpjstku.domain.registration.general.model.ValidationType;
import com.bpjstku.presentation.membership.accountactivation.salariedworker.SalariedActivationWorkerPasswordFragment$bindingInflater$1;
import com.bpjstku.presentation.membership.accountactivation.salariedworker.SalariedActivationWorkerPasswordFragment$special$$inlined$sharedViewModel$default$1;
import com.bpjstku.presentation.membership.accountactivation.salariedworker.SalariedActivationWorkerPasswordFragment$special$$inlined$viewModel$default$1;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import defpackage.getFocusY;
import defpackage.getUntrustedCreatorPackageName;
import defpackage.mapPoint;
import java.util.Map;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
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
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0012\u001a\u00020\u00108CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00138CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R.\u0010\u001a\u001a\u001c\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020\u00168UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0019R\u001a\u0010\u0014\u001a\u00020\u001b8\u0015X\u0095D¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\u000e\u001a\u00020\u001f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011"}, d2 = {"LsetSupportAllCaps;", "LimageAnalysisFormat;", "Lcom/bpjstku/databinding/FragmentSalariedActivationWorkerPasswordBinding;", "<init>", "()V", "", "g", "cancelAll", "INotificationSideChannel", "cancel", "onTransact", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "", "TuitionPaymentFragmentbindingInflater1", "()Z", "LgetUntrustedCreatorPackageName;", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/bpjstku/presentation/membership/registration/model/RegisteredMemberRegistration;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "()Lkotlin/jvm/functions/Function3;", "b", "", "I", "asBinder", "()I", "LsetSplitTrack;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class setSupportAllCaps extends imageAnalysisFormat<FragmentSalariedActivationWorkerPasswordBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ValidationType.values().length];
            try {
                iArr[ValidationType.LENGTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ValidationType.UPPER_LOWER_CASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ValidationType.DIGIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ValidationType.SPECIAL_CHAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static final /* synthetic */ class b implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        b(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.invoke(obj);
        }
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
    }

    public static final /* synthetic */ FragmentSalariedActivationWorkerPasswordBinding TuitionPaymentFragmentspecialinlinedviewModeldefault3(setSupportAllCaps setsupportallcaps) {
        return setsupportallcaps.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    /* JADX INFO: renamed from: setSupportAllCaps$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LsetSupportAllCaps$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "LsetSupportAllCaps;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()LsetSupportAllCaps;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static setSupportAllCaps TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return new setSupportAllCaps();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public setSupportAllCaps() {
        final setSupportAllCaps setsupportallcaps = this;
        final SalariedActivationWorkerPasswordFragment$special$$inlined$sharedViewModel$default$1 salariedActivationWorkerPasswordFragment$special$$inlined$sharedViewModel$default$1 = new SalariedActivationWorkerPasswordFragment$special$$inlined$sharedViewModel$default$1(setsupportallcaps);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<getUntrustedCreatorPackageName>() { // from class: com.bpjstku.presentation.membership.accountactivation.salariedworker.SalariedActivationWorkerPasswordFragment$special$$inlined$sharedViewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, getUntrustedCreatorPackageName] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ getUntrustedCreatorPackageName invoke() {
                return getFocusY.b(setsupportallcaps, Reflection.getOrCreateKotlinClass(getUntrustedCreatorPackageName.class), this.$qualifier, salariedActivationWorkerPasswordFragment$special$$inlined$sharedViewModel$default$1, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: setSupportButtonTintList
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((getUntrustedCreatorPackageName) this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).b.getValue();
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = R.layout.fragment_salaried_activation_worker_password;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new SalariedActivationWorkerPasswordFragment$special$$inlined$viewModel$default$1(this));
    }

    @Override // defpackage.imageAnalysisFormat
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentSalariedActivationWorkerPasswordBinding> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return SalariedActivationWorkerPasswordFragment$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder, reason: from getter */
    public final int getTuitionPaymentFragmentbindingInflater1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        final FragmentSalariedActivationWorkerPasswordBinding fragmentSalariedActivationWorkerPasswordBindingTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        MaterialButton materialButton = fragmentSalariedActivationWorkerPasswordBindingTuitionPaymentFragmentspecialinlinedviewModeldefault1.btnConfirmation;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: getSupportCheckMarkTintList
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSupportAllCaps.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, fragmentSalariedActivationWorkerPasswordBindingTuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj);
            }
        }));
        EditText editText = fragmentSalariedActivationWorkerPasswordBindingTuitionPaymentFragmentspecialinlinedviewModeldefault1.tilPassword.getEditText();
        if (editText != null) {
            editText.addTextChangedListener(new TuitionPaymentFragmentbindingInflater1());
        }
        EditText editText2 = fragmentSalariedActivationWorkerPasswordBindingTuitionPaymentFragmentspecialinlinedviewModeldefault1.tilConfirmedPassword.getEditText();
        if (editText2 != null) {
            editText2.addTextChangedListener(new TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        }
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        TuitionPaymentFragmentbindingInflater1() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String strValueOf = String.valueOf(charSequence);
            setSplitTrack setsplittrackTuitionPaymentFragmentspecialinlinedviewModeldefault2 = setSupportAllCaps.TuitionPaymentFragmentspecialinlinedviewModeldefault2(setSupportAllCaps.this);
            Intrinsics.checkNotNullParameter(strValueOf, "");
            setsplittrackTuitionPaymentFragmentspecialinlinedviewModeldefault2.b.setValue(strValueOf);
            setsplittrackTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setValue(setSplitTrack.TuitionPaymentFragmentspecialinlinedviewModeldefault1(strValueOf));
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            String string = StringsKt.trim((CharSequence) String.valueOf(editable)).toString();
            EditText editText = setSupportAllCaps.TuitionPaymentFragmentspecialinlinedviewModeldefault3(setSupportAllCaps.this).tilPassword.getEditText();
            setSupportAllCaps.TuitionPaymentFragmentspecialinlinedviewModeldefault2(setSupportAllCaps.this).TuitionPaymentFragmentspecialinlinedviewModeldefault2(StringsKt.trim((CharSequence) String.valueOf(editText != null ? editText.getText() : null)).toString(), string);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean TuitionPaymentFragmentbindingInflater1() {
        EditText editText = TuitionPaymentFragmentspecialinlinedviewModeldefault1().tilPassword.getEditText();
        String strValueOf = String.valueOf(editText != null ? editText.getText() : null);
        EditText editText2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1().tilConfirmedPassword.getEditText();
        return Intrinsics.areEqual(String.valueOf(editText2 != null ? editText2.getText() : null), strValueOf);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(setSupportAllCaps setsupportallcaps, FragmentSalariedActivationWorkerPasswordBinding fragmentSalariedActivationWorkerPasswordBinding, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(view, setsupportallcaps.requireContext());
        fragmentSalariedActivationWorkerPasswordBinding.salariedWorkerPasswordContainer.requestFocus();
        if (setsupportallcaps.TuitionPaymentFragmentbindingInflater1()) {
            RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) setsupportallcaps.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
            if (registeredMemberRegistration != null) {
                EditText editText = setsupportallcaps.TuitionPaymentFragmentspecialinlinedviewModeldefault1().tilPassword.getEditText();
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration, null, null, null, null, null, null, null, null, null, null, StringsKt.trim((CharSequence) String.valueOf(editText != null ? editText.getText() : null)).toString(), null, null, null, null, null, null, null, null, null, null, null, null, 8387583);
            }
            ((getUntrustedCreatorPackageName) setsupportallcaps.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).b.setValue((RegisteredMemberRegistration) objTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            ((getUntrustedCreatorPackageName) setsupportallcaps.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        } else {
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Pastikan Kata Sandi Anda Sesuai", 0).show();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(setSupportAllCaps setsupportallcaps, Map map) {
        Intrinsics.checkNotNull(map);
        FragmentSalariedActivationWorkerPasswordBinding fragmentSalariedActivationWorkerPasswordBindingTuitionPaymentFragmentspecialinlinedviewModeldefault1 = setsupportallcaps.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        for (Map.Entry entry : map.entrySet()) {
            ValidationType validationType = (ValidationType) entry.getKey();
            Drawable drawable = ContextCompat.getDrawable(setsupportallcaps.requireContext(), ((Boolean) entry.getValue()).booleanValue() ? R.drawable.ic_check_active : R.drawable.ic_check_inactive);
            int i = WhenMappings.$EnumSwitchMapping$0[validationType.ordinal()];
            if (i == 1) {
                fragmentSalariedActivationWorkerPasswordBindingTuitionPaymentFragmentspecialinlinedviewModeldefault1.tvLengthValid.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            } else if (i == 2) {
                fragmentSalariedActivationWorkerPasswordBindingTuitionPaymentFragmentspecialinlinedviewModeldefault1.tvUpperLowerValid.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            } else if (i == 3) {
                fragmentSalariedActivationWorkerPasswordBindingTuitionPaymentFragmentspecialinlinedviewModeldefault1.tvDigitValid.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                fragmentSalariedActivationWorkerPasswordBindingTuitionPaymentFragmentspecialinlinedviewModeldefault1.tvSpecialCharValid.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(setSupportAllCaps setsupportallcaps, Boolean bool) {
        Intrinsics.checkNotNull(bool);
        if (!bool.booleanValue()) {
            setsupportallcaps.TuitionPaymentFragmentspecialinlinedviewModeldefault1().tilConfirmedPassword.setError(setsupportallcaps.getString(R.string.error_unmatch_password));
            setsupportallcaps.TuitionPaymentFragmentspecialinlinedviewModeldefault1().tilConfirmedPassword.setErrorIconDrawable((Drawable) null);
        } else {
            setsupportallcaps.TuitionPaymentFragmentspecialinlinedviewModeldefault1().tilConfirmedPassword.setError(null);
            setsupportallcaps.TuitionPaymentFragmentspecialinlinedviewModeldefault1().tilConfirmedPassword.setErrorIconDrawable((Drawable) null);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(setSupportAllCaps setsupportallcaps, Boolean bool) {
        setsupportallcaps.TuitionPaymentFragmentspecialinlinedviewModeldefault1().btnConfirmation.setEnabled(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setSupportAllCaps setsupportallcaps, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            setsupportallcaps.IconCompatParcelizer();
            str = "loading_activation_account_step_fourth_result";
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                setsupportallcaps.write();
                RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) setsupportallcaps.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
                if (registeredMemberRegistration != null) {
                    EditText editText = setsupportallcaps.TuitionPaymentFragmentspecialinlinedviewModeldefault1().tilPassword.getEditText();
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegisteredMemberRegistration.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registeredMemberRegistration, null, null, null, null, null, null, null, null, null, null, StringsKt.trim((CharSequence) String.valueOf(editText != null ? editText.getText() : null)).toString(), null, null, null, null, null, null, null, null, null, null, null, null, 8387583);
                }
                ((getUntrustedCreatorPackageName) setsupportallcaps.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).b.setValue((RegisteredMemberRegistration) objTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                ((getUntrustedCreatorPackageName) setsupportallcaps.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                str = "success_activation_account_step_fourth_result";
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                setsupportallcaps.write();
                setSupportAllCaps setsupportallcaps2 = setsupportallcaps;
                String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                Intrinsics.checkNotNullParameter(setsupportallcaps2, "");
                Intrinsics.checkNotNullParameter(strValueOf, "");
                BaseActivity baseActivity = (BaseActivity) setsupportallcaps2.getContext();
                if (baseActivity != null) {
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, strValueOf, null);
                }
                str = "failure_activation_account_step_fourth_result";
            } else {
                str = "";
            }
        }
        FragmentActivity activity = setsupportallcaps.getActivity();
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

    public static final /* synthetic */ setSplitTrack TuitionPaymentFragmentspecialinlinedviewModeldefault2(setSupportAllCaps setsupportallcaps) {
        return (setSplitTrack) setsupportallcaps.TuitionPaymentFragmentbindingInflater1.getValue();
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        ((setSplitTrack) this.TuitionPaymentFragmentbindingInflater1.getValue()).write.observe(getViewLifecycleOwner(), new Observer() { // from class: getSupportButtonTintMode
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                setSupportAllCaps.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        });
        ((setSplitTrack) this.TuitionPaymentFragmentbindingInflater1.getValue()).INotificationSideChannelStub.observe(getViewLifecycleOwner(), new b(new Function1() { // from class: setButtonDrawable
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSupportAllCaps.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (Map) obj);
            }
        }));
        ((setSplitTrack) this.TuitionPaymentFragmentbindingInflater1.getValue()).asBinder.observe(getViewLifecycleOwner(), new b(new Function1() { // from class: getSupportButtonTintList
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSupportAllCaps.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Boolean) obj);
            }
        }));
        ((setSplitTrack) this.TuitionPaymentFragmentbindingInflater1.getValue()).cancel.observe(getViewLifecycleOwner(), new b(new Function1() { // from class: setSupportButtonTintMode
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setSupportAllCaps.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (Boolean) obj);
            }
        }));
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
        TextInputLayout textInputLayout = TuitionPaymentFragmentspecialinlinedviewModeldefault1().tilConfirmedPassword;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = getString(R.string.error_unmatch_password);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Minimal harus 8 karakter", 8, null), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Maksimal harus 20 karakter", null, 20), new r8lambda_rcqWHl69wN3lvwkykRzEOONbC0(new Function0() { // from class: getSupportCheckMarkTintMode
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1());
            }
        }, string2)})));
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        String str;
        RegisteredMemberRegistration registeredMemberRegistration = (RegisteredMemberRegistration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        if (registeredMemberRegistration == null || (str = registeredMemberRegistration.cancelAll) == null || str.length() <= 0) {
            return;
        }
        EditText editText = TuitionPaymentFragmentspecialinlinedviewModeldefault1().tilPassword.getEditText();
        if (editText != null) {
            RegisteredMemberRegistration registeredMemberRegistration2 = (RegisteredMemberRegistration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            editText.setText(registeredMemberRegistration2 != null ? registeredMemberRegistration2.cancelAll : null);
        }
        EditText editText2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1().tilConfirmedPassword.getEditText();
        if (editText2 != null) {
            RegisteredMemberRegistration registeredMemberRegistration3 = (RegisteredMemberRegistration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
            editText2.setText(registeredMemberRegistration3 != null ? registeredMemberRegistration3.cancelAll : null);
        }
    }
}

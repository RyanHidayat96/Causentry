package defpackage;

import android.app.DatePickerDialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import com.bpjstku.R;
import com.bpjstku.data.registration.bpu.model.request.CheckResidenceInfoRequest;
import com.bpjstku.data.registration.bpu.model.request.CheckResidenceInfoRequestAuth;
import com.bpjstku.databinding.FragmentNonSalariedWorkerPersonalDataRegistrationBinding;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.presentation.membership.registration.model.RegistrationForUnregistered;
import com.bpjstku.presentation.membership.registration.nonsalariedworker.NonSalariedWorkerPersonalDataRegistrationFragment$bindingInflater$1;
import com.bpjstku.util.enums.AppsFlyerEventEnum;
import com.bpjstku.util.managers.AppsFlyerManager;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.getImeOptions;
import defpackage.mapPoint;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
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
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\u0004J!\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0015\u0010\u001a\u001a\u00020\u00178CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR\u0014\u0010\u0015\u001a\u00020\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u001a\u0010\u0012\u001a\u00020\u001e8\u0015X\u0095D¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R.\u0010\u001f\u001a\u001c\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020#8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'"}, d2 = {"LonActivityResized;", "LAutoValue_ImmutableImageInfo;", "Lcom/bpjstku/databinding/FragmentNonSalariedWorkerPersonalDataRegistrationBinding;", "<init>", "()V", "", "INotificationSideChannelDefault", "cancelAll", "onTransact", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "g", "cancel", "INotificationSideChannel", "", "p0", "Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;", "p1", "TuitionPaymentFragmentbindingInflater1", "(ZLcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;)V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/String;)V", "LgetImeOptions;", "b", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;", "Ljava/util/Calendar;", "Ljava/util/Calendar;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "I", "asBinder", "()I", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "d", "()Lkotlin/jvm/functions/Function3;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class onActivityResized extends AutoValue_ImmutableImageInfo<FragmentNonSalariedWorkerPersonalDataRegistrationBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private RegistrationForUnregistered b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Calendar TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
    }

    public onActivityResized() {
        final onActivityResized onactivityresized = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<getImeOptions>() { // from class: com.bpjstku.presentation.membership.registration.nonsalariedworker.NonSalariedWorkerPersonalDataRegistrationFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [getImeOptions, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final getImeOptions invoke() {
                ComponentCallbacks componentCallbacks = onactivityresized;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(getImeOptions.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = calendar;
        this.TuitionPaymentFragmentbindingInflater1 = R.layout.fragment_non_salaried_worker_personal_data_registration;
    }

    /* JADX INFO: renamed from: onActivityResized$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LonActivityResized$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;", "p0", "LonActivityResized;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;)LonActivityResized;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static onActivityResized TuitionPaymentFragmentspecialinlinedviewModeldefault1(RegistrationForUnregistered p0) {
            onActivityResized onactivityresized = new onActivityResized();
            Bundle bundle = new Bundle();
            bundle.putParcelable("unregistered_data", p0);
            onactivityresized.setArguments(bundle);
            return onactivityresized;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder, reason: from getter */
    public final int getTuitionPaymentFragmentbindingInflater1() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.AutoValue_ImmutableImageInfo
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentNonSalariedWorkerPersonalDataRegistrationBinding> d() {
        return NonSalariedWorkerPersonalDataRegistrationFragment$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.sendExtras
    public final void INotificationSideChannelDefault() {
        FragmentNonSalariedWorkerPersonalDataRegistrationBinding fragmentNonSalariedWorkerPersonalDataRegistrationBindingINotificationSideChannelStub = INotificationSideChannelStub();
        TextInputLayout textInputLayout = fragmentNonSalariedWorkerPersonalDataRegistrationBindingINotificationSideChannelStub.tilIdNumber;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = getString(R.string.error_field_nik);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string2, 16, 16)})));
        TextInputLayout textInputLayout2 = fragmentNonSalariedWorkerPersonalDataRegistrationBindingINotificationSideChannelStub.tilFullName;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        String string3 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout2, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string3))));
        TextInputLayout textInputLayout3 = fragmentNonSalariedWorkerPersonalDataRegistrationBindingINotificationSideChannelStub.tilAddress;
        Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
        String string4 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout3, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string4))));
        TextInputLayout textInputLayout4 = fragmentNonSalariedWorkerPersonalDataRegistrationBindingINotificationSideChannelStub.tilBirthDate;
        Intrinsics.checkNotNullExpressionValue(textInputLayout4, "");
        String string5 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout4, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string5))));
        TextInputLayout textInputLayout5 = fragmentNonSalariedWorkerPersonalDataRegistrationBindingINotificationSideChannelStub.tilPostalCode;
        Intrinsics.checkNotNullExpressionValue(textInputLayout5, "");
        String string6 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string6, "");
        String string7 = getString(R.string.error_field_postalcode_invalid);
        Intrinsics.checkNotNullExpressionValue(string7, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout5, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string6), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string7, 5, 5)})));
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
        Bundle arguments = getArguments();
        this.b = arguments != null ? (RegistrationForUnregistered) arguments.getParcelable("unregistered_data") : null;
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

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        final FragmentNonSalariedWorkerPersonalDataRegistrationBinding fragmentNonSalariedWorkerPersonalDataRegistrationBindingINotificationSideChannelStub = INotificationSideChannelStub();
        MaterialButton materialButton = fragmentNonSalariedWorkerPersonalDataRegistrationBindingINotificationSideChannelStub.btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new isBound(new Function1() { // from class: onNavigationEvent
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onActivityResized.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, fragmentNonSalariedWorkerPersonalDataRegistrationBindingINotificationSideChannelStub, (View) obj);
            }
        }));
        EditText editText = fragmentNonSalariedWorkerPersonalDataRegistrationBindingINotificationSideChannelStub.tilBirthDate.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new View.OnClickListener() { // from class: onUnminimized
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    onActivityResized.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, view);
                }
            });
        }
    }

    private final void TuitionPaymentFragmentbindingInflater1(boolean p0, RegistrationForUnregistered p1) {
        if (p1 == null) {
            p1 = this.b;
        }
        if (p1 != null) {
            if (p1.write) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0 ? "success_eligible_sertakan_deeplink" : "failure_ineligible_sertakan_deeplink");
            }
            if (p1.MediaBrowserCompat && p0) {
                String type = AppsFlyerEventEnum.REGISTRASI_BPU.getType();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                AppsFlyerManager appsFlyerManagerB = AppsFlyerManager.INSTANCE.b();
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                appsFlyerManagerB.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, type, linkedHashMap);
            }
        }
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0) {
        RegistrationForUnregistered registrationForUnregistered = this.b;
        String strValueOf = String.valueOf(registrationForUnregistered != null ? registrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null);
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("user_id", strValueOf));
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0, mapMutableMapOf);
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(onActivityResized onactivityresized, int i, int i2, int i3) {
        onactivityresized.TuitionPaymentFragmentspecialinlinedviewModeldefault2.set(1, i);
        onactivityresized.TuitionPaymentFragmentspecialinlinedviewModeldefault2.set(2, i2);
        onactivityresized.TuitionPaymentFragmentspecialinlinedviewModeldefault2.set(5, i3);
        onactivityresized.INotificationSideChannelStub().edtBirthDate.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(onactivityresized.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getTime()));
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(onActivityResized onactivityresized, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            onactivityresized.IconCompatParcelizer();
            return;
        }
        RegistrationForUnregistered registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            onactivityresized.write();
            RegistrationForUnregistered registrationForUnregistered = onactivityresized.b;
            if (registrationForUnregistered != null) {
                EditText editText = onactivityresized.INotificationSideChannelStub().tilFullName.getEditText();
                String strValueOf = String.valueOf(editText != null ? editText.getText() : null);
                EditText editText2 = onactivityresized.INotificationSideChannelStub().tilBirthDate.getEditText();
                String strValueOf2 = String.valueOf(editText2 != null ? editText2.getText() : null);
                EditText editText3 = onactivityresized.INotificationSideChannelStub().tilAddress.getEditText();
                String strValueOf3 = String.valueOf(editText3 != null ? editText3.getText() : null);
                EditText editText4 = onactivityresized.INotificationSideChannelStub().tilIdNumber.getEditText();
                String strValueOf4 = String.valueOf(editText4 != null ? editText4.getText() : null);
                EditText editText5 = onactivityresized.INotificationSideChannelStub().tilPostalCode.getEditText();
                registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegistrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registrationForUnregistered, strValueOf4, null, null, strValueOf, strValueOf2, strValueOf3, null, null, null, null, null, null, null, null, null, null, null, null, String.valueOf(editText5 != null ? editText5.getText() : null), null, null, null, false, false, 16515014);
            }
            onactivityresized.TuitionPaymentFragmentbindingInflater1(true, registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion companion = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.INSTANCE;
            lambdasetActive6androidxcameracamera2interopCamera2CameraControl lambdasetactive6androidxcameracamera2interopcamera2cameracontrol = new lambdasetActive6androidxcameracamera2interopCamera2CameraControl(registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            Intrinsics.checkNotNullParameter(lambdasetactive6androidxcameracamera2interopcamera2cameracontrol, "");
            lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion.b().onNext(lambdasetactive6androidxcameracamera2interopcamera2cameracontrol);
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            onactivityresized.write();
            onactivityresized.TuitionPaymentFragmentbindingInflater1(false, null);
            onActivityResized onactivityresized2 = onactivityresized;
            String strValueOf5 = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            Intrinsics.checkNotNullParameter(onactivityresized2, "");
            Intrinsics.checkNotNullParameter(strValueOf5, "");
            BaseActivity baseActivity = (BaseActivity) onactivityresized2.getContext();
            if (baseActivity != null) {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, strValueOf5, null);
            }
        }
    }

    public static /* synthetic */ Unit b(onActivityResized onactivityresized, FragmentNonSalariedWorkerPersonalDataRegistrationBinding fragmentNonSalariedWorkerPersonalDataRegistrationBinding, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(view, onactivityresized.requireContext());
        fragmentNonSalariedWorkerPersonalDataRegistrationBinding.nonSalariedWorkerPersonalDataContainer.requestFocus();
        RegistrationForUnregistered registrationForUnregistered = onactivityresized.b;
        if (Intrinsics.areEqual(registrationForUnregistered != null ? registrationForUnregistered.IconCompatParcelizer : null, "cross_selling")) {
            final getImeOptions getimeoptions = (getImeOptions) onactivityresized.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            EditText editText = fragmentNonSalariedWorkerPersonalDataRegistrationBinding.tilFullName.getEditText();
            String string = StringsKt.trim((CharSequence) String.valueOf(editText != null ? editText.getText() : null)).toString();
            EditText editText2 = fragmentNonSalariedWorkerPersonalDataRegistrationBinding.tilIdNumber.getEditText();
            String string2 = StringsKt.trim((CharSequence) String.valueOf(editText2 != null ? editText2.getText() : null)).toString();
            EditText editText3 = fragmentNonSalariedWorkerPersonalDataRegistrationBinding.tilBirthDate.getEditText();
            String string3 = StringsKt.trim((CharSequence) String.valueOf(editText3 != null ? editText3.getText() : null)).toString();
            RegistrationForUnregistered registrationForUnregistered2 = onactivityresized.b;
            Intrinsics.checkNotNull(registrationForUnregistered2);
            CheckResidenceInfoRequestAuth checkResidenceInfoRequestAuth = new CheckResidenceInfoRequestAuth(string, string2, string3, String.valueOf(registrationForUnregistered2.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
            Intrinsics.checkNotNullParameter(checkResidenceInfoRequestAuth, "");
            MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = getimeoptions.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
            deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(getimeoptions.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(checkResidenceInfoRequestAuth)));
            final Function1 function1 = new Function1() { // from class: updateFocusedState
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return getImeOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getimeoptions, (BaseModel) obj);
                }
            };
            logToString logtostring = new logToString() { // from class: setQueryRefinementEnabled
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function1.invoke(obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: clearFocus
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return getImeOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getimeoptions, (Throwable) obj);
                }
            };
            BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: forceSuggestionQuery
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function2.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
            getimeoptions.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        } else {
            final getImeOptions getimeoptions2 = (getImeOptions) onactivityresized.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            EditText editText4 = fragmentNonSalariedWorkerPersonalDataRegistrationBinding.tilFullName.getEditText();
            String string4 = StringsKt.trim((CharSequence) String.valueOf(editText4 != null ? editText4.getText() : null)).toString();
            EditText editText5 = fragmentNonSalariedWorkerPersonalDataRegistrationBinding.tilIdNumber.getEditText();
            String string5 = StringsKt.trim((CharSequence) String.valueOf(editText5 != null ? editText5.getText() : null)).toString();
            EditText editText6 = fragmentNonSalariedWorkerPersonalDataRegistrationBinding.tilBirthDate.getEditText();
            CheckResidenceInfoRequest checkResidenceInfoRequest = new CheckResidenceInfoRequest(string4, string5, StringsKt.trim((CharSequence) String.valueOf(editText6 != null ? editText6.getText() : null)).toString());
            Intrinsics.checkNotNullParameter(checkResidenceInfoRequest, "");
            MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData2 = getimeoptions2.TuitionPaymentFragmentbindingInflater1;
            VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
            deriveCodec derivecodecB2 = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(getimeoptions2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(checkResidenceInfoRequest)));
            final Function1 function3 = new Function1() { // from class: getSuggestionsAdapter
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return getImeOptions.TuitionPaymentFragmentbindingInflater1(getimeoptions2, (BaseModel) obj);
                }
            };
            logToString logtostring2 = new logToString() { // from class: onCloseClicked
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function3.invoke(obj);
                }
            };
            final Function1 function4 = new Function1() { // from class: setAppSearchData
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return getImeOptions.a(getimeoptions2, (Throwable) obj);
                }
            };
            BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4 = derivecodecB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring2, new logToString() { // from class: setMaxWidth
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function4.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4, "");
            getimeoptions2.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void b(onActivityResized onactivityresized, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            onactivityresized.IconCompatParcelizer();
            return;
        }
        RegistrationForUnregistered registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            onactivityresized.write();
            RegistrationForUnregistered registrationForUnregistered = onactivityresized.b;
            if (registrationForUnregistered != null) {
                EditText editText = onactivityresized.INotificationSideChannelStub().tilFullName.getEditText();
                String strValueOf = String.valueOf(editText != null ? editText.getText() : null);
                EditText editText2 = onactivityresized.INotificationSideChannelStub().tilBirthDate.getEditText();
                String strValueOf2 = String.valueOf(editText2 != null ? editText2.getText() : null);
                EditText editText3 = onactivityresized.INotificationSideChannelStub().tilAddress.getEditText();
                String strValueOf3 = String.valueOf(editText3 != null ? editText3.getText() : null);
                EditText editText4 = onactivityresized.INotificationSideChannelStub().tilIdNumber.getEditText();
                String strValueOf4 = String.valueOf(editText4 != null ? editText4.getText() : null);
                EditText editText5 = onactivityresized.INotificationSideChannelStub().tilPostalCode.getEditText();
                registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegistrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registrationForUnregistered, strValueOf4, null, null, strValueOf, strValueOf2, strValueOf3, null, null, null, null, null, null, null, null, null, null, null, null, String.valueOf(editText5 != null ? editText5.getText() : null), null, null, null, false, false, 16515014);
            }
            onactivityresized.TuitionPaymentFragmentbindingInflater1(true, registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion companion = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.INSTANCE;
            lambdasetActive6androidxcameracamera2interopCamera2CameraControl lambdasetactive6androidxcameracamera2interopcamera2cameracontrol = new lambdasetActive6androidxcameracamera2interopCamera2CameraControl(registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            Intrinsics.checkNotNullParameter(lambdasetactive6androidxcameracamera2interopcamera2cameracontrol, "");
            lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion.b().onNext(lambdasetactive6androidxcameracamera2interopcamera2cameracontrol);
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            onactivityresized.write();
            onactivityresized.TuitionPaymentFragmentbindingInflater1(false, null);
            onActivityResized onactivityresized2 = onactivityresized;
            String strValueOf5 = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            Intrinsics.checkNotNullParameter(onactivityresized2, "");
            Intrinsics.checkNotNullParameter(strValueOf5, "");
            BaseActivity baseActivity = (BaseActivity) onactivityresized2.getContext();
            if (baseActivity != null) {
                retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, strValueOf5, null);
            }
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(final onActivityResized onactivityresized, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: onRelationshipValidationResult
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                    onActivityResized.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, i, i2, i3);
                }
            }, onactivityresized.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(1), onactivityresized.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(2), onactivityresized.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(5)).show();
        } finally {
            ViewPortBuilder.b();
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        ((getImeOptions) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentbindingInflater1.observe(getViewLifecycleOwner(), new Observer() { // from class: onPostMessage
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                onActivityResized.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        });
        ((getImeOptions) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(getViewLifecycleOwner(), new Observer() { // from class: onMinimized
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                onActivityResized.b(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        });
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        EditText editText = INotificationSideChannelStub().tilFullName.getEditText();
        if (editText != null) {
            Intrinsics.checkNotNullParameter(editText, "");
            editText.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        EditText editText2 = INotificationSideChannelStub().tilAddress.getEditText();
        if (editText2 != null) {
            Intrinsics.checkNotNullParameter(editText2, "");
            editText2.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
    }
}

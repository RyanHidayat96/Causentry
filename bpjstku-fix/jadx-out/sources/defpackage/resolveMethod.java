package defpackage;

import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentAsikActiveParticipantContactDataBinding;
import com.bpjstku.presentation.asik.resign.salariedworker.AsikResignSalariedWorkerContactDataFragment$bindingInflater$1;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.midtrans.sdk.corekit.core.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\u0004R.\u0010\u0014\u001a\u001c\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00020\u000e8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00158\u0015X\u0095D¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"LresolveMethod;", "LAutoValue_ImmutableImageInfo;", "Lcom/bpjstku/databinding/FragmentAsikActiveParticipantContactDataBinding;", "<init>", "()V", "", "cancelAll", "onTransact", "INotificationSideChannelDefault", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "g", "cancel", "INotificationSideChannel", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "d", "()Lkotlin/jvm/functions/Function3;", "b", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "I", "asBinder", "()I", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class resolveMethod extends AutoValue_ImmutableImageInfo<FragmentAsikActiveParticipantContactDataBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = R.layout.fragment_asik_active_participant_contact_data;

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
    }

    /* JADX INFO: renamed from: resolveMethod$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LresolveMethod$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "LresolveMethod;", "TuitionPaymentFragmentbindingInflater1", "()LresolveMethod;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static resolveMethod TuitionPaymentFragmentbindingInflater1() {
            resolveMethod resolvemethod = new resolveMethod();
            resolvemethod.setArguments(new Bundle());
            return resolvemethod;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.AutoValue_ImmutableImageInfo
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentAsikActiveParticipantContactDataBinding> d() {
        return AsikResignSalariedWorkerContactDataFragment$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder, reason: from getter */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        EditText editText = INotificationSideChannelStub().tilMotherName.getEditText();
        if (editText != null) {
            Intrinsics.checkNotNullParameter(editText, "");
            editText.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
    }

    @Override // defpackage.sendExtras
    public final void INotificationSideChannelDefault() {
        FragmentAsikActiveParticipantContactDataBinding fragmentAsikActiveParticipantContactDataBindingINotificationSideChannelStub = INotificationSideChannelStub();
        TextInputLayout textInputLayout = fragmentAsikActiveParticipantContactDataBindingINotificationSideChannelStub.tilEmail;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        accessconfigureInstanceInternal accessconfigureinstanceinternal = new accessconfigureInstanceInternal("^.{1,}$", string);
        String string2 = getString(R.string.error_email_invalid);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf((Object[]) new accessconfigureInstanceInternal[]{accessconfigureinstanceinternal, new accessconfigureInstanceInternal(Constants.EMAIL_PATTERN, string2)})));
        TextInputEditText textInputEditText = fragmentAsikActiveParticipantContactDataBindingINotificationSideChannelStub.edtPhoneNumber;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "");
        String string3 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        String string4 = getString(R.string.error_phone_number_length);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputEditText, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string3), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string4, 9, 12)})));
        TextInputLayout textInputLayout2 = fragmentAsikActiveParticipantContactDataBindingINotificationSideChannelStub.tilMotherName;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        String string5 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout2, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string5))));
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
        MaterialButton materialButton = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new isBound(new Function1() { // from class: getDisabledComponentFlag
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return resolveMethod.TuitionPaymentFragmentspecialinlinedviewModeldefault3((View) obj);
            }
        }));
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(View view) {
        Intrinsics.checkNotNullParameter(view, "");
        lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion companion = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.INSTANCE;
        lambdasetActive6androidxcameracamera2interopCamera2CameraControl lambdasetactive6androidxcameracamera2interopcamera2cameracontrol = new lambdasetActive6androidxcameracamera2interopCamera2CameraControl(null);
        Intrinsics.checkNotNullParameter(lambdasetactive6androidxcameracamera2interopcamera2cameracontrol, "");
        lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion.b().onNext(lambdasetactive6androidxcameracamera2interopcamera2cameracontrol);
        return Unit.INSTANCE;
    }
}

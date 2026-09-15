package defpackage;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentManager;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentAsikResignNonSalariedPersonalDataRegistrationBinding;
import com.bpjstku.presentation.asik.resign.nonsalariedworker.AsikResignNonSalariedPersonaldataFragment$bindingInflater$1;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u0004R\u0015\u0010\u0011\u001a\u00020\u000e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R.\u0010\u001b\u001a\u001c\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00020\u00158UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000f\u001a\u00020\u001c8\u0015X\u0095D¢\u0006\f\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"LcreateViewFromTag;", "LAutoValue_ImmutableImageInfo;", "Lcom/bpjstku/databinding/FragmentAsikResignNonSalariedPersonalDataRegistrationBinding;", "<init>", "()V", "", "cancelAll", "onTransact", "g", "cancel", "INotificationSideChannel", "INotificationSideChannelDefault", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "LsetOnItemSelectedAction;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/util/Calendar;", "Ljava/util/Calendar;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "d", "()Lkotlin/jvm/functions/Function3;", "b", "", "I", "asBinder", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class createViewFromTag extends AutoValue_ImmutableImageInfo<FragmentAsikResignNonSalariedPersonalDataRegistrationBinding> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Calendar TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: createCheckBox
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return createViewFromTag.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }
    });

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
    }

    public createViewFromTag() {
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "");
        this.TuitionPaymentFragmentbindingInflater1 = calendar;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = R.layout.fragment_asik_resign_non_salaried_personal_data_registration;
    }

    /* JADX INFO: renamed from: createViewFromTag$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LcreateViewFromTag$b;", "", "<init>", "()V", "LcreateViewFromTag;", "b", "()LcreateViewFromTag;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static createViewFromTag b() {
            createViewFromTag createviewfromtag = new createViewFromTag();
            createviewfromtag.setArguments(new Bundle());
            return createviewfromtag;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.AutoValue_ImmutableImageInfo
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentAsikResignNonSalariedPersonalDataRegistrationBinding> d() {
        return AsikResignNonSalariedPersonaldataFragment$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder, reason: from getter */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
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

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        FragmentAsikResignNonSalariedPersonalDataRegistrationBinding fragmentAsikResignNonSalariedPersonalDataRegistrationBindingINotificationSideChannelStub = INotificationSideChannelStub();
        MaterialButton materialButton = fragmentAsikResignNonSalariedPersonalDataRegistrationBindingINotificationSideChannelStub.btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: createImageButton
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return createViewFromTag.TuitionPaymentFragmentspecialinlinedviewModeldefault3((View) obj);
            }
        }));
        EditText editText = fragmentAsikResignNonSalariedPersonalDataRegistrationBindingINotificationSideChannelStub.tilBirthDate.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new View.OnClickListener() { // from class: createCheckedTextView
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    createViewFromTag.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, view);
                }
            });
        }
        CardView cardView = fragmentAsikResignNonSalariedPersonalDataRegistrationBindingINotificationSideChannelStub.cvIdCardUpload;
        Intrinsics.checkNotNullExpressionValue(cardView, "");
        CardView cardView2 = cardView;
        createEditText createedittext = new createEditText(this);
        Intrinsics.checkNotNullParameter(cardView2, "");
        Intrinsics.checkNotNullParameter(createedittext, "");
        cardView2.setOnClickListener(new UseFlashModeTorchFor3aUpdate(createedittext));
    }

    @Override // defpackage.sendExtras
    public final void INotificationSideChannelDefault() {
        FragmentAsikResignNonSalariedPersonalDataRegistrationBinding fragmentAsikResignNonSalariedPersonalDataRegistrationBindingINotificationSideChannelStub = INotificationSideChannelStub();
        TextInputLayout textInputLayout = fragmentAsikResignNonSalariedPersonalDataRegistrationBindingINotificationSideChannelStub.tilIdNumber;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = getString(R.string.error_field_nik);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string2, 16, 16)})));
        TextInputLayout textInputLayout2 = fragmentAsikResignNonSalariedPersonalDataRegistrationBindingINotificationSideChannelStub.tilFullName;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        String string3 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout2, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string3))));
        TextInputLayout textInputLayout3 = fragmentAsikResignNonSalariedPersonalDataRegistrationBindingINotificationSideChannelStub.tilBirthDate;
        Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
        String string4 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout3, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string4))));
        TextInputLayout textInputLayout4 = fragmentAsikResignNonSalariedPersonalDataRegistrationBindingINotificationSideChannelStub.tilAddress;
        Intrinsics.checkNotNullExpressionValue(textInputLayout4, "");
        String string5 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout4, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string5))));
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

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(createViewFromTag createviewfromtag, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new createButton(createviewfromtag), createviewfromtag.TuitionPaymentFragmentbindingInflater1.get(1), createviewfromtag.TuitionPaymentFragmentbindingInflater1.get(2), createviewfromtag.TuitionPaymentFragmentbindingInflater1.get(5)).show();
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ setOnItemSelectedAction TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return new setOnItemSelectedAction();
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(View view) {
        Intrinsics.checkNotNullParameter(view, "");
        lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion bVar = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.INSTANCE;
        lambdasetActive6androidxcameracamera2interopCamera2CameraControl lambdasetactive6androidxcameracamera2interopcamera2cameracontrol = new lambdasetActive6androidxcameracamera2interopCamera2CameraControl(null);
        Intrinsics.checkNotNullParameter(lambdasetactive6androidxcameracamera2interopcamera2cameracontrol, "");
        lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion.b().onNext(lambdasetactive6androidxcameracamera2interopcamera2cameracontrol);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(createViewFromTag createviewfromtag, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        setOnItemSelectedAction setonitemselectedaction = (setOnItemSelectedAction) createviewfromtag.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        FragmentManager childFragmentManager = createviewfromtag.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Intrinsics.checkNotNullParameter(childFragmentManager, "");
        if (childFragmentManager.findFragmentByTag(setonitemselectedaction.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            setonitemselectedaction.show(childFragmentManager, setonitemselectedaction.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void b(createViewFromTag createviewfromtag, int i, int i2, int i3) {
        createviewfromtag.TuitionPaymentFragmentbindingInflater1.set(1, i);
        createviewfromtag.TuitionPaymentFragmentbindingInflater1.set(2, i2);
        createviewfromtag.TuitionPaymentFragmentbindingInflater1.set(5, i3);
        createviewfromtag.INotificationSideChannelStub().edtBirthDate.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(createviewfromtag.TuitionPaymentFragmentbindingInflater1.getTime()));
    }
}

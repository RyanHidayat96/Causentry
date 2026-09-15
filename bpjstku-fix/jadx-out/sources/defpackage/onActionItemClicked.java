package defpackage;

import android.app.DatePickerDialog;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentManager;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentAsikActiveParticipantPersonalDataBinding;
import com.bpjstku.presentation.asik.active.AsikActiveParticipantPersonalDataFragment$bindingInflater$1;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\u0004R\u0015\u0010\u0011\u001a\u00020\u000e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000f\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R.\u0010\u001b\u001a\u001c\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00020\u00158UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0013\u001a\u00020\u001c8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"LonActionItemClicked;", "LAutoValue_ImmutableImageInfo;", "Lcom/bpjstku/databinding/FragmentAsikActiveParticipantPersonalDataBinding;", "<init>", "()V", "", "cancelAll", "onTransact", "g", "cancel", "INotificationSideChannel", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "INotificationSideChannelDefault", "LsetOnItemSelectedAction;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/util/Calendar;", "b", "Ljava/util/Calendar;", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "d", "()Lkotlin/jvm/functions/Function3;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "asBinder", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class onActionItemClicked extends AutoValue_ImmutableImageInfo<FragmentAsikActiveParticipantPersonalDataBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: onOpenSubMenu
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return onActionItemClicked.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Calendar TuitionPaymentFragmentbindingInflater1;

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder */
    public final int getWrite() {
        return R.layout.fragment_asik_active_participant_personal_data;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
    }

    public onActionItemClicked() {
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "");
        this.TuitionPaymentFragmentbindingInflater1 = calendar;
    }

    @Override // defpackage.AutoValue_ImmutableImageInfo
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentAsikActiveParticipantPersonalDataBinding> d() {
        return AsikActiveParticipantPersonalDataFragment$bindingInflater$1.b;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        EditText editText = INotificationSideChannelStub().tilFullName.getEditText();
        if (editText != null) {
            Intrinsics.checkNotNullParameter(editText, "");
            editText.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        FragmentAsikActiveParticipantPersonalDataBinding fragmentAsikActiveParticipantPersonalDataBindingINotificationSideChannelStub = INotificationSideChannelStub();
        MaterialButton materialButton = fragmentAsikActiveParticipantPersonalDataBindingINotificationSideChannelStub.btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: onCloseMenu
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onActionItemClicked.TuitionPaymentFragmentspecialinlinedviewModeldefault3((View) obj);
            }
        }));
        EditText editText = fragmentAsikActiveParticipantPersonalDataBindingINotificationSideChannelStub.tilBirthDate.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new View.OnClickListener() { // from class: AppCompatDelegateImplApi21Impl
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    onActionItemClicked.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, view);
                }
            });
        }
        CardView cardView = fragmentAsikActiveParticipantPersonalDataBindingINotificationSideChannelStub.cvIdCardUpload;
        Intrinsics.checkNotNullExpressionValue(cardView, "");
        CardView cardView2 = cardView;
        Function1 function1 = new Function1() { // from class: AppCompatDelegateImplActionModeCallbackWrapperV91
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onActionItemClicked.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj);
            }
        };
        Intrinsics.checkNotNullParameter(cardView2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        cardView2.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function1));
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

    @Override // defpackage.sendExtras
    public final void INotificationSideChannelDefault() {
        FragmentAsikActiveParticipantPersonalDataBinding fragmentAsikActiveParticipantPersonalDataBindingINotificationSideChannelStub = INotificationSideChannelStub();
        TextInputLayout textInputLayout = fragmentAsikActiveParticipantPersonalDataBindingINotificationSideChannelStub.tilIdNumber;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = getString(R.string.error_field_nik);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string2, 16, 16)})));
        TextInputLayout textInputLayout2 = fragmentAsikActiveParticipantPersonalDataBindingINotificationSideChannelStub.tilFullName;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        String string3 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout2, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string3))));
        TextInputLayout textInputLayout3 = fragmentAsikActiveParticipantPersonalDataBindingINotificationSideChannelStub.tilBirthDate;
        Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
        String string4 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout3, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string4))));
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(onActionItemClicked onactionitemclicked, int i, int i2, int i3) {
        onactionitemclicked.TuitionPaymentFragmentbindingInflater1.set(1, i);
        onactionitemclicked.TuitionPaymentFragmentbindingInflater1.set(2, i2);
        onactionitemclicked.TuitionPaymentFragmentbindingInflater1.set(5, i3);
        onactionitemclicked.INotificationSideChannelStub().edtBirthDate.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(onactionitemclicked.TuitionPaymentFragmentbindingInflater1.getTime()));
    }

    public static /* synthetic */ setOnItemSelectedAction TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return new setOnItemSelectedAction();
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(onActionItemClicked onactionitemclicked, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        setOnItemSelectedAction setonitemselectedaction = (setOnItemSelectedAction) onactionitemclicked.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        FragmentManager childFragmentManager = onactionitemclicked.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Intrinsics.checkNotNullParameter(childFragmentManager, "");
        if (childFragmentManager.findFragmentByTag(setonitemselectedaction.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            setonitemselectedaction.show(childFragmentManager, setonitemselectedaction.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(View view) {
        Intrinsics.checkNotNullParameter(view, "");
        lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion companion = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.INSTANCE;
        lambdasetActive6androidxcameracamera2interopCamera2CameraControl lambdasetactive6androidxcameracamera2interopcamera2cameracontrol = new lambdasetActive6androidxcameracamera2interopCamera2CameraControl(null);
        Intrinsics.checkNotNullParameter(lambdasetactive6androidxcameracamera2interopcamera2cameracontrol, "");
        lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion.b().onNext(lambdasetactive6androidxcameracamera2interopcamera2cameracontrol);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(final onActionItemClicked onactionitemclicked, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: AppCompatDelegateImplActionMenuPresenterCallback
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                    onActionItemClicked.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, i, i2, i3);
                }
            }, onactionitemclicked.TuitionPaymentFragmentbindingInflater1.get(1), onactionitemclicked.TuitionPaymentFragmentbindingInflater1.get(2), onactionitemclicked.TuitionPaymentFragmentbindingInflater1.get(5)).show();
        } finally {
            ViewPortBuilder.b();
        }
    }
}

package defpackage;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.Editable;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwnerKt;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentAsikActiveParticipantCitizenshipDocumentBinding;
import com.bpjstku.domain.asik.model.EmployeeFamily;
import com.bpjstku.presentation.asik.active.AsikActiveParticipantCitizenshipDocumentFragment$bindingInflater$1;
import com.bpjstku.presentation.asik.active.AsikActiveParticipantCitizenshipDocumentFragment$proceedCroppedKK$1$1;
import com.bpjstku.presentation.asik.active.AsikActiveParticipantCitizenshipDocumentFragment$proceedCroppedKtp$1$1;
import com.bpjstku.presentation.asik.active.model.AsikActiveParticipant;
import com.bpjstku.util.constant.FamilyStatus;
import com.bpjstku.util.constant.MaritalStatus;
import com.esafirm.imagepicker.features.ImagePickerActivity;
import com.esafirm.imagepicker.model.Image;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.yalantis.ucrop.UCrop;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
import kotlin.text.StringsKt;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J)\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0017\u0010\u0004J\u0019\u0010\u0019\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u0013\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u0013\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0019\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0019\u0010\u0004R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0083D¢\u0006\u0006\n\u0004\b\u001b\u0010!R\u0014\u0010$\u001a\u00020 8\u0002X\u0083D¢\u0006\u0006\n\u0004\b#\u0010!R\u0014\u0010\u0013\u001a\u00020%8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010&R\u0018\u0010\u001d\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010(R\u0015\u0010#\u001a\u00020)8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0019\u0010*R.\u0010/\u001a\u001c\u0012\u0004\u0012\u00020,\u0012\u0006\u0012\u0004\u0018\u00010-\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00020+8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u0010\u001f\u001a\u00020\u000b8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u00101"}, d2 = {"LonCreateSupportNavigateUpTaskStack;", "LAutoValue_ImmutableImageInfo;", "Lcom/bpjstku/databinding/FragmentAsikActiveParticipantCitizenshipDocumentBinding;", "<init>", "()V", "", "cancelAll", "onTransact", "cancel", "INotificationSideChannel", "g", "", "p0", "p1", "Landroid/content/Intent;", "p2", "onActivityResult", "(IILandroid/content/Intent;)V", "Lcom/esafirm/imagepicker/model/Image;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/esafirm/imagepicker/model/Image;I)V", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "INotificationSideChannelDefault", "Landroid/net/Uri;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/net/Uri;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/io/File;", "asInterface", "Ljava/io/File;", "asBinder", "", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "a", "b", "Ljava/util/Calendar;", "Ljava/util/Calendar;", "Lcom/bpjstku/presentation/asik/active/model/AsikActiveParticipant;", "Lcom/bpjstku/presentation/asik/active/model/AsikActiveParticipant;", "LAppCompatDelegateImplApi33ImplExternalSyntheticLambda0;", "Lkotlin/Lazy;", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "d", "()Lkotlin/jvm/functions/Function3;", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class onCreateSupportNavigateUpTaskStack extends AutoValue_ImmutableImageInfo<FragmentAsikActiveParticipantCitizenshipDocumentBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy a;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private AsikActiveParticipant asInterface;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private File TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private File TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Calendar TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3 = "0";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String b = ExifInterface.GPS_MEASUREMENT_2D;

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return R.layout.fragment_asik_active_participant_citizenship_document;
    }

    public onCreateSupportNavigateUpTaskStack() {
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "");
        this.TuitionPaymentFragmentbindingInflater1 = calendar;
        this.a = LazyKt.lazy(new Function0() { // from class: onPostResume
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return onCreateSupportNavigateUpTaskStack.b(this.TuitionPaymentFragmentbindingInflater1);
            }
        });
    }

    @Override // defpackage.AutoValue_ImmutableImageInfo
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentAsikActiveParticipantCitizenshipDocumentBinding> d() {
        return AsikActiveParticipantCitizenshipDocumentFragment$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
        Bundle arguments = getArguments();
        this.asInterface = arguments != null ? (AsikActiveParticipant) arguments.getParcelable("asik_active_participant") : null;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        FragmentAsikActiveParticipantCitizenshipDocumentBinding fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub = INotificationSideChannelStub();
        EditText editText = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilMotherName.getEditText();
        if (editText != null) {
            Intrinsics.checkNotNullParameter(editText, "");
            editText.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        EditText editText2 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilFirstChild.getEditText();
        if (editText2 != null) {
            Intrinsics.checkNotNullParameter(editText2, "");
            editText2.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        EditText editText3 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilSecondChild.getEditText();
        if (editText3 != null) {
            Intrinsics.checkNotNullParameter(editText3, "");
            editText3.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        EditText editText4 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilSpouseName.getEditText();
        if (editText4 != null) {
            Intrinsics.checkNotNullParameter(editText4, "");
            editText4.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
        EditText editText5 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilFatherName.getEditText();
        if (editText5 != null) {
            Intrinsics.checkNotNullParameter(editText5, "");
            editText5.setFilters(new InputFilter.AllCaps[]{new InputFilter.AllCaps()});
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
        INotificationSideChannelStub().edtChildren.setText(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        final FragmentAsikActiveParticipantCitizenshipDocumentBinding fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub = INotificationSideChannelStub();
        MaterialButton materialButton = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: onLocalesChanged
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onCreateSupportNavigateUpTaskStack.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj);
            }
        }));
        fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.edtMaritalStatus.setOnClickListener(new View.OnClickListener() { // from class: onSupportActionModeStarted
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                onCreateSupportNavigateUpTaskStack.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, view);
            }
        });
        TextInputEditText textInputEditText = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.edtMaritalStatus;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "");
        textInputEditText.addTextChangedListener(new suspendUseCases.b(new Function1() { // from class: onSupportNavigateUp
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onCreateSupportNavigateUpTaskStack.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (String) obj);
            }
        }));
        CardView cardView = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.cvScanKtp;
        Intrinsics.checkNotNullExpressionValue(cardView, "");
        cardView.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: getSupportParentActivityIntent
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onCreateSupportNavigateUpTaskStack.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (View) obj);
            }
        }));
        CardView cardView2 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.cvScanKK;
        Intrinsics.checkNotNullExpressionValue(cardView2, "");
        cardView2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: onSupportActionModeFinished
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onCreateSupportNavigateUpTaskStack.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj);
            }
        }));
        MaterialButton materialButton2 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.btnPlus;
        Intrinsics.checkNotNullExpressionValue(materialButton2, "");
        materialButton2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: setSupportActionBar
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onCreateSupportNavigateUpTaskStack.TuitionPaymentFragmentbindingInflater1(fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub, this, (View) obj);
            }
        }));
        MaterialButton materialButton3 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.btnMin;
        Intrinsics.checkNotNullExpressionValue(materialButton3, "");
        materialButton3.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: onWindowStartingSupportActionMode
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onCreateSupportNavigateUpTaskStack.b(fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub, this, (View) obj);
            }
        }));
        fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.rgChooseGender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: onTitleChanged
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                onCreateSupportNavigateUpTaskStack.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, radioGroup);
            }
        });
        fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.edtBirthDateMother.setOnClickListener(new View.OnClickListener() { // from class: setSupportProgress
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                onCreateSupportNavigateUpTaskStack.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub, view);
            }
        });
        fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.edtBirthDateSpouse.setOnClickListener(new View.OnClickListener() { // from class: setSupportProgressBarIndeterminate
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                onCreateSupportNavigateUpTaskStack.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub, view);
            }
        });
        fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.edtBirthDateFather.setOnClickListener(new View.OnClickListener() { // from class: onMenuOpened
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                onCreateSupportNavigateUpTaskStack.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub, view);
            }
        });
        fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.edtBirthDateFirstChildren.setOnClickListener(new View.OnClickListener() { // from class: onPrepareSupportNavigateUpTaskStack
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                onCreateSupportNavigateUpTaskStack.b(this.b, fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub, view);
            }
        });
        fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.edtBirthDateSecondChildren.setOnClickListener(new View.OnClickListener() { // from class: onSupportContentChanged
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                onCreateSupportNavigateUpTaskStack.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub, view);
            }
        });
    }

    private final void TuitionPaymentFragmentbindingInflater1(Image p0, int p1) {
        String string;
        if (p0 != null) {
            if (p1 == 101) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                StringBuilder sb = new StringBuilder("croppedKTPImage");
                sb.append(jCurrentTimeMillis);
                sb.append(".jpg");
                string = sb.toString();
            } else if (p1 != 102) {
                string = "";
            } else {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                StringBuilder sb2 = new StringBuilder("croppedKKImage");
                sb2.append(jCurrentTimeMillis2);
                sb2.append(".jpg");
                string = sb2.toString();
            }
            FragmentActivity activity = getActivity();
            File file = new File(activity != null ? activity.getCacheDir() : null, string);
            if (file.exists()) {
                file.delete();
            }
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            String str = p0.TuitionPaymentFragmentbindingInflater1;
            Intrinsics.checkNotNullExpressionValue(str, "");
            Uri uriFromFile = Uri.fromFile(file);
            Intrinsics.checkNotNullExpressionValue(uriFromFile, "");
            Camera2CameraControlExternalSyntheticLambda5.b(contextRequireContext, str, uriFromFile, this, 16.0f, 9.0f, p1);
        }
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        MaterialButton materialButton = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setEnabled(false);
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        MaterialButton materialButton = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setEnabled(true);
    }

    @Override // defpackage.sendExtras
    public final void INotificationSideChannelDefault() {
        FragmentAsikActiveParticipantCitizenshipDocumentBinding fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub = INotificationSideChannelStub();
        TextInputLayout textInputLayout = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilMotherName;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string))));
        TextInputLayout textInputLayout2 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilBirthDateMother;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        String string2 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout2, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string2))));
        TextInputLayout textInputLayout3 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilMaritalStatus;
        Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
        String string3 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout3, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string3))));
        TextInputLayout textInputLayout4 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilSpouseName;
        Intrinsics.checkNotNullExpressionValue(textInputLayout4, "");
        if (textInputLayout4.getVisibility() == 0 && fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilSpouseName != null) {
            TextInputLayout textInputLayout5 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilSpouseName;
            Intrinsics.checkNotNullExpressionValue(textInputLayout5, "");
            String string4 = getString(R.string.error_field_required);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout5, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string4))));
        }
        TextInputLayout textInputLayout6 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilBirthDateSpouse;
        Intrinsics.checkNotNullExpressionValue(textInputLayout6, "");
        if (textInputLayout6.getVisibility() == 0 && fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilBirthDateSpouse != null) {
            TextInputLayout textInputLayout7 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilBirthDateSpouse;
            Intrinsics.checkNotNullExpressionValue(textInputLayout7, "");
            String string5 = getString(R.string.error_field_required);
            Intrinsics.checkNotNullExpressionValue(string5, "");
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout7, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string5))));
        }
        TextInputLayout textInputLayout8 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilFatherName;
        Intrinsics.checkNotNullExpressionValue(textInputLayout8, "");
        if (textInputLayout8.getVisibility() == 0 && fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilFatherName != null) {
            TextInputLayout textInputLayout9 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilFatherName;
            Intrinsics.checkNotNullExpressionValue(textInputLayout9, "");
            String string6 = getString(R.string.error_field_required);
            Intrinsics.checkNotNullExpressionValue(string6, "");
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout9, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string6))));
        }
        TextInputLayout textInputLayout10 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilBirthDateFather;
        Intrinsics.checkNotNullExpressionValue(textInputLayout10, "");
        if (textInputLayout10.getVisibility() == 0 && fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilBirthDateFather != null) {
            TextInputLayout textInputLayout11 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilBirthDateFather;
            Intrinsics.checkNotNullExpressionValue(textInputLayout11, "");
            String string7 = getString(R.string.error_field_required);
            Intrinsics.checkNotNullExpressionValue(string7, "");
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout11, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string7))));
        }
        TextInputLayout textInputLayout12 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilChildren;
        Intrinsics.checkNotNullExpressionValue(textInputLayout12, "");
        if (textInputLayout12.getVisibility() != 0 || fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilChildren == null) {
            return;
        }
        TextInputLayout textInputLayout13 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilChildren;
        Intrinsics.checkNotNullExpressionValue(textInputLayout13, "");
        String string8 = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string8, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout13, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string8))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Uri p0) {
        if (p0 != null) {
            String path = p0.getPath();
            Intrinsics.checkNotNull(path);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new File(path);
            FragmentAsikActiveParticipantCitizenshipDocumentBinding fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub = INotificationSideChannelStub();
            ImageView imageView = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.imgKtpPhoto;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.imgKtpPhoto.setImageURI(Uri.fromFile(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
            ImageView imageView2 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.imgKtpUpload;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(8);
            TextView textView = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tvScanKTPLabel;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void TuitionPaymentFragmentbindingInflater1(Uri p0) {
        if (p0 != null) {
            String path = p0.getPath();
            Intrinsics.checkNotNull(path);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new File(path);
            FragmentAsikActiveParticipantCitizenshipDocumentBinding fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub = INotificationSideChannelStub();
            ImageView imageView = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.imgKKPhoto;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.imgKKPhoto.setImageURI(Uri.fromFile(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
            ImageView imageView2 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.imgKKUpload;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(8);
            TextView textView = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tvScanKKLabel;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
        }
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        FragmentAsikActiveParticipantCitizenshipDocumentBinding fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub = INotificationSideChannelStub();
        Editable text = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.edtChildren.getText();
        if (text != null) {
            if (text.toString().equals(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                MaterialButton materialButton = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.btnMin;
                Intrinsics.checkNotNullExpressionValue(materialButton, "");
                materialButton.setEnabled(false);
                MaterialButton materialButton2 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.btnPlus;
                Intrinsics.checkNotNullExpressionValue(materialButton2, "");
                materialButton2.setEnabled(true);
                TextInputLayout textInputLayout = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilFirstChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
                textInputLayout.setVisibility(8);
                TextInputLayout textInputLayout2 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilBirthDateFirstChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
                textInputLayout2.setVisibility(8);
                TextInputLayout textInputLayout3 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilSecondChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
                textInputLayout3.setVisibility(8);
                TextInputLayout textInputLayout4 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilBirthDateSecondChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout4, "");
                textInputLayout4.setVisibility(8);
                return;
            }
            if (text.toString().equals(this.b)) {
                MaterialButton materialButton3 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.btnMin;
                Intrinsics.checkNotNullExpressionValue(materialButton3, "");
                materialButton3.setEnabled(true);
                MaterialButton materialButton4 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.btnPlus;
                Intrinsics.checkNotNullExpressionValue(materialButton4, "");
                materialButton4.setEnabled(false);
                TextInputLayout textInputLayout5 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilFirstChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout5, "");
                textInputLayout5.setVisibility(0);
                TextInputLayout textInputLayout6 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilBirthDateFirstChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout6, "");
                textInputLayout6.setVisibility(0);
                TextInputLayout textInputLayout7 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilSecondChild;
                Intrinsics.checkNotNullExpressionValue(textInputLayout7, "");
                textInputLayout7.setVisibility(0);
                TextInputLayout textInputLayout8 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilBirthDateSecondChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout8, "");
                textInputLayout8.setVisibility(0);
                return;
            }
            MaterialButton materialButton5 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.btnMin;
            Intrinsics.checkNotNullExpressionValue(materialButton5, "");
            materialButton5.setEnabled(true);
            MaterialButton materialButton6 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.btnPlus;
            Intrinsics.checkNotNullExpressionValue(materialButton6, "");
            materialButton6.setEnabled(true);
            TextInputLayout textInputLayout9 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilFirstChild;
            Intrinsics.checkNotNullExpressionValue(textInputLayout9, "");
            textInputLayout9.setVisibility(0);
            TextInputLayout textInputLayout10 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilBirthDateFirstChildren;
            Intrinsics.checkNotNullExpressionValue(textInputLayout10, "");
            textInputLayout10.setVisibility(0);
            TextInputLayout textInputLayout11 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilSecondChild;
            Intrinsics.checkNotNullExpressionValue(textInputLayout11, "");
            textInputLayout11.setVisibility(8);
            TextInputLayout textInputLayout12 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilBirthDateSecondChildren;
            Intrinsics.checkNotNullExpressionValue(textInputLayout12, "");
            textInputLayout12.setVisibility(8);
        }
    }

    private final void TuitionPaymentFragmentbindingInflater1() {
        FragmentAsikActiveParticipantCitizenshipDocumentBinding fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub = INotificationSideChannelStub();
        if (fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.rgChooseGender.getCheckedRadioButtonId() == R.id.rbFemale) {
            fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilSpouseName.setHint(getString(R.string.hint_husband_name));
            fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilBirthDateSpouse.setHint(getString(R.string.hint_birth_date_husband));
        } else {
            fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilSpouseName.setHint(getString(R.string.hint_wife_name));
            fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilBirthDateSpouse.setHint(getString(R.string.hint_birth_date_wife));
        }
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        FragmentAsikActiveParticipantCitizenshipDocumentBinding fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub = INotificationSideChannelStub();
        EditText editText = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilMaritalStatus.getEditText();
        if (StringsKt.trim((CharSequence) String.valueOf(editText != null ? editText.getText() : null)).toString().length() == 0) {
            TextInputLayout textInputLayout = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilSpouseName;
            Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
            textInputLayout.setVisibility(8);
            TextInputLayout textInputLayout2 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilBirthDateSpouse;
            Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
            textInputLayout2.setVisibility(8);
            ConstraintLayout constraintLayout = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.childrenContainer;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(8);
            TextInputLayout textInputLayout3 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilFatherName;
            Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
            textInputLayout3.setVisibility(8);
            TextInputLayout textInputLayout4 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilBirthDateFather;
            Intrinsics.checkNotNullExpressionValue(textInputLayout4, "");
            textInputLayout4.setVisibility(8);
            return;
        }
        EditText editText2 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilMaritalStatus.getEditText();
        if (!StringsKt.trim((CharSequence) String.valueOf(editText2 != null ? editText2.getText() : null)).toString().equals(MaritalStatus.MARRIED.getType())) {
            ConstraintLayout constraintLayout2 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.childrenContainer;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            constraintLayout2.setVisibility(8);
            TextInputLayout textInputLayout5 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilSpouseName;
            Intrinsics.checkNotNullExpressionValue(textInputLayout5, "");
            textInputLayout5.setVisibility(8);
            TextInputLayout textInputLayout6 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilBirthDateSpouse;
            Intrinsics.checkNotNullExpressionValue(textInputLayout6, "");
            textInputLayout6.setVisibility(8);
            TextInputLayout textInputLayout7 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilFatherName;
            Intrinsics.checkNotNullExpressionValue(textInputLayout7, "");
            textInputLayout7.setVisibility(0);
            TextInputLayout textInputLayout8 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilBirthDateFather;
            Intrinsics.checkNotNullExpressionValue(textInputLayout8, "");
            textInputLayout8.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.btnNext.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.topToBottom = R.id.tilBirthDateFather;
            fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.btnNext.setLayoutParams(layoutParams2);
            return;
        }
        ConstraintLayout constraintLayout3 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.childrenContainer;
        Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
        constraintLayout3.setVisibility(0);
        TextInputLayout textInputLayout9 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilSpouseName;
        Intrinsics.checkNotNullExpressionValue(textInputLayout9, "");
        textInputLayout9.setVisibility(0);
        TextInputLayout textInputLayout10 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilBirthDateSpouse;
        Intrinsics.checkNotNullExpressionValue(textInputLayout10, "");
        textInputLayout10.setVisibility(0);
        TextInputLayout textInputLayout11 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilFatherName;
        Intrinsics.checkNotNullExpressionValue(textInputLayout11, "");
        textInputLayout11.setVisibility(8);
        TextInputLayout textInputLayout12 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilBirthDateFather;
        Intrinsics.checkNotNullExpressionValue(textInputLayout12, "");
        textInputLayout12.setVisibility(8);
        ViewGroup.LayoutParams layoutParams3 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.btnNext.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams3, "");
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        layoutParams4.topToBottom = R.id.cvScanKtp;
        fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.btnNext.setLayoutParams(layoutParams4);
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(onCreateSupportNavigateUpTaskStack oncreatesupportnavigateuptaskstack, FragmentAsikActiveParticipantCitizenshipDocumentBinding fragmentAsikActiveParticipantCitizenshipDocumentBinding, int i, int i2, int i3) {
        oncreatesupportnavigateuptaskstack.TuitionPaymentFragmentbindingInflater1.set(1, i);
        oncreatesupportnavigateuptaskstack.TuitionPaymentFragmentbindingInflater1.set(2, i2);
        oncreatesupportnavigateuptaskstack.TuitionPaymentFragmentbindingInflater1.set(5, i3);
        fragmentAsikActiveParticipantCitizenshipDocumentBinding.edtBirthDateMother.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(oncreatesupportnavigateuptaskstack.TuitionPaymentFragmentbindingInflater1.getTime()));
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(final onCreateSupportNavigateUpTaskStack oncreatesupportnavigateuptaskstack, final FragmentAsikActiveParticipantCitizenshipDocumentBinding fragmentAsikActiveParticipantCitizenshipDocumentBinding, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: onPostCreate
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                    onCreateSupportNavigateUpTaskStack.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, fragmentAsikActiveParticipantCitizenshipDocumentBinding, i, i2, i3);
                }
            }, oncreatesupportnavigateuptaskstack.TuitionPaymentFragmentbindingInflater1.get(1), oncreatesupportnavigateuptaskstack.TuitionPaymentFragmentbindingInflater1.get(2), oncreatesupportnavigateuptaskstack.TuitionPaymentFragmentbindingInflater1.get(5)).show();
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ void b(final onCreateSupportNavigateUpTaskStack oncreatesupportnavigateuptaskstack, final FragmentAsikActiveParticipantCitizenshipDocumentBinding fragmentAsikActiveParticipantCitizenshipDocumentBinding, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: getSupportActionBar
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                    onCreateSupportNavigateUpTaskStack.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, fragmentAsikActiveParticipantCitizenshipDocumentBinding, i, i2, i3);
                }
            }, oncreatesupportnavigateuptaskstack.TuitionPaymentFragmentbindingInflater1.get(1), oncreatesupportnavigateuptaskstack.TuitionPaymentFragmentbindingInflater1.get(2), oncreatesupportnavigateuptaskstack.TuitionPaymentFragmentbindingInflater1.get(5)).show();
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ Unit b(onCreateSupportNavigateUpTaskStack oncreatesupportnavigateuptaskstack, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        updateFileExif updatefileexif = new updateFileExif();
        onCreateSupportNavigateUpTaskStack oncreatesupportnavigateuptaskstack2 = oncreatesupportnavigateuptaskstack;
        Intent intent = new Intent(oncreatesupportnavigateuptaskstack2.getActivity(), (Class<?>) ImagePickerActivity.class);
        intent.putExtra("CameraOnlyConfig", updatefileexif.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        oncreatesupportnavigateuptaskstack2.startActivityForResult(intent, 100);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(FragmentAsikActiveParticipantCitizenshipDocumentBinding fragmentAsikActiveParticipantCitizenshipDocumentBinding, onCreateSupportNavigateUpTaskStack oncreatesupportnavigateuptaskstack, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        fragmentAsikActiveParticipantCitizenshipDocumentBinding.edtChildren.setText(String.valueOf(Integer.parseInt(StringsKt.trim((CharSequence) String.valueOf(fragmentAsikActiveParticipantCitizenshipDocumentBinding.edtChildren.getText())).toString()) - 1));
        oncreatesupportnavigateuptaskstack.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0095  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:36:0x0117  */
    /* JADX WARN: Code duplicated, block: B:38:0x011f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0124  */
    /* JADX WARN: Code duplicated, block: B:42:0x0141  */
    /* JADX WARN: Code duplicated, block: B:43:0x0146  */
    /* JADX WARN: Code duplicated, block: B:46:0x016c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0171  */
    /* JADX WARN: Code duplicated, block: B:50:0x018e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0193  */
    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(onCreateSupportNavigateUpTaskStack oncreatesupportnavigateuptaskstack, View view) {
        EditText editText;
        Editable text;
        EditText editText2;
        Editable text2;
        EditText editText3;
        Editable text3;
        EditText editText4;
        Editable text4;
        EditText editText5;
        Editable text5;
        EditText editText6;
        Editable text6;
        EditText editText7;
        Editable text7;
        AsikActiveParticipant asikActiveParticipantB;
        Intrinsics.checkNotNullParameter(view, "");
        FragmentAsikActiveParticipantCitizenshipDocumentBinding fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub = oncreatesupportnavigateuptaskstack.INotificationSideChannelStub();
        ArrayList arrayList = new ArrayList();
        if (fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.rgChooseGender.getCheckedRadioButtonId() == R.id.rbFemale) {
            EditText editText8 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilMaritalStatus.getEditText();
            if (Intrinsics.areEqual(StringsKt.trim((CharSequence) String.valueOf(editText8 != null ? editText8.getText() : null)).toString(), MaritalStatus.MARRIED.getType())) {
                EditText editText9 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilSpouseName.getEditText();
                String string = StringsKt.trim((CharSequence) String.valueOf(editText9 != null ? editText9.getText() : null)).toString();
                String type = FamilyStatus.HUSBAND.getType();
                EditText editText10 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilBirthDateSpouse.getEditText();
                arrayList.add(new EmployeeFamily("", string, type, StringsKt.trim((CharSequence) String.valueOf(editText10 != null ? editText10.getText() : null)).toString(), "L", ""));
            } else if (fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.rgChooseGender.getCheckedRadioButtonId() != R.id.rbMale) {
                editText = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilFatherName.getEditText();
                if (editText != null) {
                    text = editText.getText();
                } else {
                    text = null;
                }
                String string2 = StringsKt.trim((CharSequence) String.valueOf(text)).toString();
                String type2 = FamilyStatus.PARENTS.getType();
                editText2 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilBirthDateFather.getEditText();
                if (editText2 != null) {
                    text2 = editText2.getText();
                } else {
                    text2 = null;
                }
                arrayList.add(new EmployeeFamily("", string2, type2, StringsKt.trim((CharSequence) String.valueOf(text2)).toString(), "L", ""));
                editText3 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilMotherName.getEditText();
                if (editText3 != null) {
                    text3 = editText3.getText();
                } else {
                    text3 = null;
                }
                String string3 = StringsKt.trim((CharSequence) String.valueOf(text3)).toString();
                String type3 = FamilyStatus.PARENTS.getType();
                editText4 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilBirthDateMother.getEditText();
                if (editText4 != null) {
                    text4 = editText4.getText();
                } else {
                    text4 = null;
                }
                arrayList.add(new EmployeeFamily("", string3, type3, StringsKt.trim((CharSequence) String.valueOf(text4)).toString(), "P", ""));
            } else {
                editText5 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilMaritalStatus.getEditText();
                if (editText5 != null) {
                    text5 = editText5.getText();
                } else {
                    text5 = null;
                }
                if (Intrinsics.areEqual(StringsKt.trim((CharSequence) String.valueOf(text5)).toString(), MaritalStatus.MARRIED.getType())) {
                    editText6 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilSpouseName.getEditText();
                    if (editText6 != null) {
                        text6 = editText6.getText();
                    } else {
                        text6 = null;
                    }
                    String string4 = StringsKt.trim((CharSequence) String.valueOf(text6)).toString();
                    String type4 = FamilyStatus.WIFE.getType();
                    editText7 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilBirthDateSpouse.getEditText();
                    if (editText7 != null) {
                        text7 = editText7.getText();
                    } else {
                        text7 = null;
                    }
                    arrayList.add(new EmployeeFamily("", string4, type4, StringsKt.trim((CharSequence) String.valueOf(text7)).toString(), "P", ""));
                } else {
                    editText = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilFatherName.getEditText();
                    if (editText != null) {
                        text = editText.getText();
                    } else {
                        text = null;
                    }
                    String string5 = StringsKt.trim((CharSequence) String.valueOf(text)).toString();
                    String type5 = FamilyStatus.PARENTS.getType();
                    editText2 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilBirthDateFather.getEditText();
                    if (editText2 != null) {
                        text2 = editText2.getText();
                    } else {
                        text2 = null;
                    }
                    arrayList.add(new EmployeeFamily("", string5, type5, StringsKt.trim((CharSequence) String.valueOf(text2)).toString(), "L", ""));
                    editText3 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilMotherName.getEditText();
                    if (editText3 != null) {
                        text3 = editText3.getText();
                    } else {
                        text3 = null;
                    }
                    String string6 = StringsKt.trim((CharSequence) String.valueOf(text3)).toString();
                    String type6 = FamilyStatus.PARENTS.getType();
                    editText4 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilBirthDateMother.getEditText();
                    if (editText4 != null) {
                        text4 = editText4.getText();
                    } else {
                        text4 = null;
                    }
                    arrayList.add(new EmployeeFamily("", string6, type6, StringsKt.trim((CharSequence) String.valueOf(text4)).toString(), "P", ""));
                }
            }
        } else if (fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.rgChooseGender.getCheckedRadioButtonId() != R.id.rbMale) {
            editText = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilFatherName.getEditText();
            if (editText != null) {
                text = editText.getText();
            } else {
                text = null;
            }
            String string7 = StringsKt.trim((CharSequence) String.valueOf(text)).toString();
            String type7 = FamilyStatus.PARENTS.getType();
            editText2 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilBirthDateFather.getEditText();
            if (editText2 != null) {
                text2 = editText2.getText();
            } else {
                text2 = null;
            }
            arrayList.add(new EmployeeFamily("", string7, type7, StringsKt.trim((CharSequence) String.valueOf(text2)).toString(), "L", ""));
            editText3 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilMotherName.getEditText();
            if (editText3 != null) {
                text3 = editText3.getText();
            } else {
                text3 = null;
            }
            String string8 = StringsKt.trim((CharSequence) String.valueOf(text3)).toString();
            String type8 = FamilyStatus.PARENTS.getType();
            editText4 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilBirthDateMother.getEditText();
            if (editText4 != null) {
                text4 = editText4.getText();
            } else {
                text4 = null;
            }
            arrayList.add(new EmployeeFamily("", string8, type8, StringsKt.trim((CharSequence) String.valueOf(text4)).toString(), "P", ""));
        } else {
            editText5 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilMaritalStatus.getEditText();
            if (editText5 != null) {
                text5 = editText5.getText();
            } else {
                text5 = null;
            }
            if (Intrinsics.areEqual(StringsKt.trim((CharSequence) String.valueOf(text5)).toString(), MaritalStatus.MARRIED.getType())) {
                editText6 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilSpouseName.getEditText();
                if (editText6 != null) {
                    text6 = editText6.getText();
                } else {
                    text6 = null;
                }
                String string9 = StringsKt.trim((CharSequence) String.valueOf(text6)).toString();
                String type9 = FamilyStatus.WIFE.getType();
                editText7 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilBirthDateSpouse.getEditText();
                if (editText7 != null) {
                    text7 = editText7.getText();
                } else {
                    text7 = null;
                }
                arrayList.add(new EmployeeFamily("", string9, type9, StringsKt.trim((CharSequence) String.valueOf(text7)).toString(), "P", ""));
            } else {
                editText = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilFatherName.getEditText();
                if (editText != null) {
                    text = editText.getText();
                } else {
                    text = null;
                }
                String string10 = StringsKt.trim((CharSequence) String.valueOf(text)).toString();
                String type10 = FamilyStatus.PARENTS.getType();
                editText2 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilBirthDateFather.getEditText();
                if (editText2 != null) {
                    text2 = editText2.getText();
                } else {
                    text2 = null;
                }
                arrayList.add(new EmployeeFamily("", string10, type10, StringsKt.trim((CharSequence) String.valueOf(text2)).toString(), "L", ""));
                editText3 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilMotherName.getEditText();
                if (editText3 != null) {
                    text3 = editText3.getText();
                } else {
                    text3 = null;
                }
                String string11 = StringsKt.trim((CharSequence) String.valueOf(text3)).toString();
                String type11 = FamilyStatus.PARENTS.getType();
                editText4 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilBirthDateMother.getEditText();
                if (editText4 != null) {
                    text4 = editText4.getText();
                } else {
                    text4 = null;
                }
                arrayList.add(new EmployeeFamily("", string11, type11, StringsKt.trim((CharSequence) String.valueOf(text4)).toString(), "P", ""));
            }
        }
        TextInputLayout textInputLayout = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilChildren;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        if (textInputLayout.getVisibility() == 0) {
            TextInputLayout textInputLayout2 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilFirstChild;
            Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
            if (textInputLayout2.getVisibility() == 0) {
                TextInputLayout textInputLayout3 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilBirthDateSecondChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout3, "");
                if (textInputLayout3.getVisibility() == 0) {
                    EditText editText11 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilFirstChild.getEditText();
                    String string12 = StringsKt.trim((CharSequence) String.valueOf(editText11 != null ? editText11.getText() : null)).toString();
                    String type12 = FamilyStatus.FIRSTCHILD.getType();
                    EditText editText12 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilBirthDateFirstChildren.getEditText();
                    arrayList.add(new EmployeeFamily("", string12, type12, StringsKt.trim((CharSequence) String.valueOf(editText12 != null ? editText12.getText() : null)).toString(), "", ""));
                }
            }
            TextInputLayout textInputLayout4 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilSecondChild;
            Intrinsics.checkNotNullExpressionValue(textInputLayout4, "");
            if (textInputLayout4.getVisibility() == 0) {
                TextInputLayout textInputLayout5 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilBirthDateSecondChildren;
                Intrinsics.checkNotNullExpressionValue(textInputLayout5, "");
                if (textInputLayout5.getVisibility() == 0) {
                    EditText editText13 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilSecondChild.getEditText();
                    String string13 = StringsKt.trim((CharSequence) String.valueOf(editText13 != null ? editText13.getText() : null)).toString();
                    String type13 = FamilyStatus.SECONDCHILD.getType();
                    EditText editText14 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilBirthDateSecondChildren.getEditText();
                    arrayList.add(new EmployeeFamily("", string13, type13, StringsKt.trim((CharSequence) String.valueOf(editText14 != null ? editText14.getText() : null)).toString(), "", ""));
                }
            }
        }
        AsikActiveParticipant asikActiveParticipant = oncreatesupportnavigateuptaskstack.asInterface;
        if (asikActiveParticipant != null) {
            EditText editText15 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilMotherName.getEditText();
            String string14 = StringsKt.trim((CharSequence) String.valueOf(editText15 != null ? editText15.getText() : null)).toString();
            String str = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.rgChooseGender.getCheckedRadioButtonId() == R.id.rbFemale ? "P" : "L";
            EditText editText16 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilMaritalStatus.getEditText();
            String string15 = StringsKt.trim((CharSequence) String.valueOf(editText16 != null ? editText16.getText() : null)).toString();
            EditText editText17 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilSpouseName.getEditText();
            String string16 = StringsKt.trim((CharSequence) String.valueOf(editText17 != null ? editText17.getText() : null)).toString();
            EditText editText18 = fragmentAsikActiveParticipantCitizenshipDocumentBindingINotificationSideChannelStub.tilChildren.getEditText();
            asikActiveParticipantB = AsikActiveParticipant.b(asikActiveParticipant, null, null, null, null, null, null, null, null, string14, str, string15, string16, StringsKt.trim((CharSequence) String.valueOf(editText18 != null ? editText18.getText() : null)).toString(), arrayList, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16129, 31);
        } else {
            asikActiveParticipantB = null;
        }
        lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion companion = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.INSTANCE;
        lambdaclearCaptureRequestOptions4androidxcameracamera2interopCamera2CameraControl lambdaclearcapturerequestoptions4androidxcameracamera2interopcamera2cameracontrol = new lambdaclearCaptureRequestOptions4androidxcameracamera2interopCamera2CameraControl(asikActiveParticipantB, null, 2, null);
        Intrinsics.checkNotNullParameter(lambdaclearcapturerequestoptions4androidxcameracamera2interopcamera2cameracontrol, "");
        lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion.b().onNext(lambdaclearcapturerequestoptions4androidxcameracamera2interopcamera2cameracontrol);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(onCreateSupportNavigateUpTaskStack oncreatesupportnavigateuptaskstack, FragmentAsikActiveParticipantCitizenshipDocumentBinding fragmentAsikActiveParticipantCitizenshipDocumentBinding, int i, int i2, int i3) {
        oncreatesupportnavigateuptaskstack.TuitionPaymentFragmentbindingInflater1.set(1, i);
        oncreatesupportnavigateuptaskstack.TuitionPaymentFragmentbindingInflater1.set(2, i2);
        oncreatesupportnavigateuptaskstack.TuitionPaymentFragmentbindingInflater1.set(5, i3);
        fragmentAsikActiveParticipantCitizenshipDocumentBinding.edtBirthDateSecondChildren.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(oncreatesupportnavigateuptaskstack.TuitionPaymentFragmentbindingInflater1.getTime()));
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(onCreateSupportNavigateUpTaskStack oncreatesupportnavigateuptaskstack, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            AppCompatDelegateImplApi33ImplExternalSyntheticLambda0 appCompatDelegateImplApi33ImplExternalSyntheticLambda0 = (AppCompatDelegateImplApi33ImplExternalSyntheticLambda0) oncreatesupportnavigateuptaskstack.a.getValue();
            FragmentManager childFragmentManager = oncreatesupportnavigateuptaskstack.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(appCompatDelegateImplApi33ImplExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                appCompatDelegateImplApi33ImplExternalSyntheticLambda0.show(childFragmentManager, appCompatDelegateImplApi33ImplExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(onCreateSupportNavigateUpTaskStack oncreatesupportnavigateuptaskstack, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        updateFileExif updatefileexif = new updateFileExif();
        onCreateSupportNavigateUpTaskStack oncreatesupportnavigateuptaskstack2 = oncreatesupportnavigateuptaskstack;
        Intent intent = new Intent(oncreatesupportnavigateuptaskstack2.getActivity(), (Class<?>) ImagePickerActivity.class);
        intent.putExtra("CameraOnlyConfig", updatefileexif.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        oncreatesupportnavigateuptaskstack2.startActivityForResult(intent, 200);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(onCreateSupportNavigateUpTaskStack oncreatesupportnavigateuptaskstack, FragmentAsikActiveParticipantCitizenshipDocumentBinding fragmentAsikActiveParticipantCitizenshipDocumentBinding, int i, int i2, int i3) {
        oncreatesupportnavigateuptaskstack.TuitionPaymentFragmentbindingInflater1.set(1, i);
        oncreatesupportnavigateuptaskstack.TuitionPaymentFragmentbindingInflater1.set(2, i2);
        oncreatesupportnavigateuptaskstack.TuitionPaymentFragmentbindingInflater1.set(5, i3);
        fragmentAsikActiveParticipantCitizenshipDocumentBinding.edtBirthDateFirstChildren.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(oncreatesupportnavigateuptaskstack.TuitionPaymentFragmentbindingInflater1.getTime()));
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final onCreateSupportNavigateUpTaskStack oncreatesupportnavigateuptaskstack, final FragmentAsikActiveParticipantCitizenshipDocumentBinding fragmentAsikActiveParticipantCitizenshipDocumentBinding, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: setTheme
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                    onCreateSupportNavigateUpTaskStack.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, fragmentAsikActiveParticipantCitizenshipDocumentBinding, i, i2, i3);
                }
            }, oncreatesupportnavigateuptaskstack.TuitionPaymentFragmentbindingInflater1.get(1), oncreatesupportnavigateuptaskstack.TuitionPaymentFragmentbindingInflater1.get(2), oncreatesupportnavigateuptaskstack.TuitionPaymentFragmentbindingInflater1.get(5)).show();
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(final onCreateSupportNavigateUpTaskStack oncreatesupportnavigateuptaskstack, final FragmentAsikActiveParticipantCitizenshipDocumentBinding fragmentAsikActiveParticipantCitizenshipDocumentBinding, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: setSupportProgressBarVisibility
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                    onCreateSupportNavigateUpTaskStack.TuitionPaymentFragmentbindingInflater1(this.b, fragmentAsikActiveParticipantCitizenshipDocumentBinding, i, i2, i3);
                }
            }, oncreatesupportnavigateuptaskstack.TuitionPaymentFragmentbindingInflater1.get(1), oncreatesupportnavigateuptaskstack.TuitionPaymentFragmentbindingInflater1.get(2), oncreatesupportnavigateuptaskstack.TuitionPaymentFragmentbindingInflater1.get(5)).show();
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(FragmentAsikActiveParticipantCitizenshipDocumentBinding fragmentAsikActiveParticipantCitizenshipDocumentBinding, onCreateSupportNavigateUpTaskStack oncreatesupportnavigateuptaskstack, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        fragmentAsikActiveParticipantCitizenshipDocumentBinding.edtChildren.setText(String.valueOf(Integer.parseInt(StringsKt.trim((CharSequence) String.valueOf(fragmentAsikActiveParticipantCitizenshipDocumentBinding.edtChildren.getText())).toString()) + 1));
        oncreatesupportnavigateuptaskstack.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ AppCompatDelegateImplApi33ImplExternalSyntheticLambda0 b(final onCreateSupportNavigateUpTaskStack oncreatesupportnavigateuptaskstack) {
        AppCompatDelegateImplApi33ImplExternalSyntheticLambda0.Companion companion = AppCompatDelegateImplApi33ImplExternalSyntheticLambda0.INSTANCE;
        return AppCompatDelegateImplApi33ImplExternalSyntheticLambda0.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: onContentChanged
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return onCreateSupportNavigateUpTaskStack.b(this.TuitionPaymentFragmentbindingInflater1, (com.bpjstku.domain.asik.model.MaritalStatus) obj);
            }
        });
    }

    public static /* synthetic */ void b(onCreateSupportNavigateUpTaskStack oncreatesupportnavigateuptaskstack, FragmentAsikActiveParticipantCitizenshipDocumentBinding fragmentAsikActiveParticipantCitizenshipDocumentBinding, int i, int i2, int i3) {
        oncreatesupportnavigateuptaskstack.TuitionPaymentFragmentbindingInflater1.set(1, i);
        oncreatesupportnavigateuptaskstack.TuitionPaymentFragmentbindingInflater1.set(2, i2);
        oncreatesupportnavigateuptaskstack.TuitionPaymentFragmentbindingInflater1.set(5, i3);
        fragmentAsikActiveParticipantCitizenshipDocumentBinding.edtBirthDateSpouse.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(oncreatesupportnavigateuptaskstack.TuitionPaymentFragmentbindingInflater1.getTime()));
    }

    public static /* synthetic */ Unit b(onCreateSupportNavigateUpTaskStack oncreatesupportnavigateuptaskstack, com.bpjstku.domain.asik.model.MaritalStatus maritalStatus) {
        String str = maritalStatus != null ? maritalStatus.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
        Intrinsics.checkNotNull(str);
        EditText editText = oncreatesupportnavigateuptaskstack.INotificationSideChannelStub().tilMaritalStatus.getEditText();
        if (editText != null) {
            editText.setText(str);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(onCreateSupportNavigateUpTaskStack oncreatesupportnavigateuptaskstack, FragmentAsikActiveParticipantCitizenshipDocumentBinding fragmentAsikActiveParticipantCitizenshipDocumentBinding, int i, int i2, int i3) {
        oncreatesupportnavigateuptaskstack.TuitionPaymentFragmentbindingInflater1.set(1, i);
        oncreatesupportnavigateuptaskstack.TuitionPaymentFragmentbindingInflater1.set(2, i2);
        oncreatesupportnavigateuptaskstack.TuitionPaymentFragmentbindingInflater1.set(5, i3);
        fragmentAsikActiveParticipantCitizenshipDocumentBinding.edtBirthDateFather.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(oncreatesupportnavigateuptaskstack.TuitionPaymentFragmentbindingInflater1.getTime()));
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(onCreateSupportNavigateUpTaskStack oncreatesupportnavigateuptaskstack, RadioGroup radioGroup) {
        Intrinsics.checkNotNullParameter(radioGroup, "");
        oncreatesupportnavigateuptaskstack.TuitionPaymentFragmentbindingInflater1();
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(final onCreateSupportNavigateUpTaskStack oncreatesupportnavigateuptaskstack, final FragmentAsikActiveParticipantCitizenshipDocumentBinding fragmentAsikActiveParticipantCitizenshipDocumentBinding, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            new DatePickerDialog(view.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: onNightModeChanged
                @Override // android.app.DatePickerDialog.OnDateSetListener
                public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                    onCreateSupportNavigateUpTaskStack.b(this.TuitionPaymentFragmentbindingInflater1, fragmentAsikActiveParticipantCitizenshipDocumentBinding, i, i2, i3);
                }
            }, oncreatesupportnavigateuptaskstack.TuitionPaymentFragmentbindingInflater1.get(1), oncreatesupportnavigateuptaskstack.TuitionPaymentFragmentbindingInflater1.get(2), oncreatesupportnavigateuptaskstack.TuitionPaymentFragmentbindingInflater1.get(5)).show();
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(onCreateSupportNavigateUpTaskStack oncreatesupportnavigateuptaskstack, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        oncreatesupportnavigateuptaskstack.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int p0, int p1, Intent p2) {
        if (p1 != -1 || p2 == null) {
            if (p2 != null) {
                UCrop.getError(p2);
            }
        } else if (p0 != 69 && p0 != 101 && p0 != 102) {
            Image imageB = getCaptureNode.b(p2);
            if (p0 == 100) {
                TuitionPaymentFragmentbindingInflater1(imageB, 101);
            } else {
                TuitionPaymentFragmentbindingInflater1(imageB, 102);
            }
        } else if (p2 != null) {
            Uri output = UCrop.getOutput(p2);
            if (p0 == 101) {
                if (output != null) {
                    File file = new File(String.valueOf(output.getPath()));
                    Intrinsics.checkNotNullParameter(file, "");
                    if (new File(file.getPath()).length() / 1024 >= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) {
                        b.TuitionPaymentFragmentbindingInflater1(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AsikActiveParticipantCitizenshipDocumentFragment$proceedCroppedKtp$1$1(this, output, null), 3, null);
                    } else {
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1(output);
                    }
                }
                TextView textView = INotificationSideChannelStub().tvKtpError;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(8);
            } else {
                if (output != null) {
                    File file2 = new File(String.valueOf(output.getPath()));
                    Intrinsics.checkNotNullParameter(file2, "");
                    if (new File(file2.getPath()).length() / 1024 >= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) {
                        b.TuitionPaymentFragmentbindingInflater1(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AsikActiveParticipantCitizenshipDocumentFragment$proceedCroppedKK$1$1(this, output, null), 3, null);
                    } else {
                        TuitionPaymentFragmentbindingInflater1(output);
                    }
                }
                TextView textView2 = INotificationSideChannelStub().tvKKError;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                textView2.setVisibility(8);
            }
        }
        super.onActivityResult(p0, p1, p2);
    }
}

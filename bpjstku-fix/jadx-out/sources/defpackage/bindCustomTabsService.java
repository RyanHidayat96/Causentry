package defpackage;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import com.bpjstku.R;
import com.bpjstku.data.office.model.request.BranchOfficeDefaultSelectedRequest;
import com.bpjstku.data.office.model.response.BranchOfficeDefaultSelectedResponse;
import com.bpjstku.databinding.FragmentNonSalariedWorkerProgramRegistrationBinding;
import com.bpjstku.domain.branchoffice.model.Office;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.membership.registration.model.RegistrationForUnregistered;
import com.bpjstku.presentation.membership.registration.model.TuitionRate;
import com.bpjstku.presentation.membership.registration.nonsalariedworker.NonSalariedWorkerProgramRegistrationFragment$bindingInflater$1;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.drawSelectorCompat;
import defpackage.getEventTime;
import defpackage.mapPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\u0004R\u0015\u0010\u0011\u001a\u00020\u000e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00128CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0015\u0010\u0017\u001a\u00020\u00158CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010R\u0016\u0010\u001b\u001a\u00020\u00188\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0019\u001a\u00020\u001c8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0011\u0010\u001dR\u0016\u0010 \u001a\u00020\u001e8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u001b\u0010\u001fR\u0018\u0010\u0016\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\"R\u0016\u0010\u000f\u001a\u00020\u00188\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0014\u0010\u001aR\u0018\u0010%\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010$R\u0018\u0010\u000b\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010'R\u0015\u0010\u0013\u001a\u00020(8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b \u0010\u0010R\u001a\u0010\r\u001a\u00020\u001c8\u0015X\u0095D¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b \u0010)R.\u0010\f\u001a\u001c\u0012\u0004\u0012\u00020+\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00020*8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b%\u0010-"}, d2 = {"LbindCustomTabsService;", "LAutoValue_ImmutableImageInfo;", "Lcom/bpjstku/databinding/FragmentNonSalariedWorkerProgramRegistrationBinding;", "<init>", "()V", "", "INotificationSideChannelDefault", "cancelAll", "onTransact", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "g", "cancel", "INotificationSideChannel", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "a", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/bpjstku/domain/user/model/User;", "notify", "TuitionPaymentFragmentbindingInflater1", "LdrawSelectorCompat;", "asInterface", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "", "b", "Z", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "", "I", "", "Ljava/lang/String;", "asBinder", "Lcom/bpjstku/presentation/membership/registration/model/TuitionRate;", "Lcom/bpjstku/presentation/membership/registration/model/TuitionRate;", "Lcom/bpjstku/domain/branchoffice/model/Office;", "Lcom/bpjstku/domain/branchoffice/model/Office;", "d", "Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;", "Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;", "LgetBundleFromItem;", "()I", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "()Lkotlin/jvm/functions/Function3;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class bindCustomTabsService extends AutoValue_ImmutableImageInfo<FragmentNonSalariedWorkerProgramRegistrationBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private Office d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private RegistrationForUnregistered g;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    private TuitionRate asInterface;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: bindCustomTabsServicePreservePriority
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public int b = 3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public String asBinder = "L";

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public boolean a = true;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy notify = LazyKt.lazy(new Function0() { // from class: createCallbackWrapper
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return bindCustomTabsService.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int INotificationSideChannel = R.layout.fragment_non_salaried_worker_program_registration;

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
    }

    public bindCustomTabsService() {
        final bindCustomTabsService bindcustomtabsservice = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.membership.registration.nonsalariedworker.NonSalariedWorkerProgramRegistrationFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = bindcustomtabsservice;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<drawSelectorCompat>() { // from class: com.bpjstku.presentation.membership.registration.nonsalariedworker.NonSalariedWorkerProgramRegistrationFragment$special$$inlined$inject$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [drawSelectorCompat, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final drawSelectorCompat invoke() {
                ComponentCallbacks componentCallbacks = bindcustomtabsservice;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(drawSelectorCompat.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: bindCustomTabsService$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LbindCustomTabsService$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;", "p0", "LbindCustomTabsService;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;)LbindCustomTabsService;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static bindCustomTabsService TuitionPaymentFragmentspecialinlinedviewModeldefault1(RegistrationForUnregistered p0) {
            bindCustomTabsService bindcustomtabsservice = new bindCustomTabsService();
            Bundle bundle = new Bundle();
            bundle.putParcelable("unregistered_data", p0);
            bindcustomtabsservice.setArguments(bundle);
            return bindcustomtabsservice;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder, reason: from getter */
    public final int getINotificationSideChannel() {
        return this.INotificationSideChannel;
    }

    @Override // defpackage.AutoValue_ImmutableImageInfo
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentNonSalariedWorkerProgramRegistrationBinding> d() {
        return NonSalariedWorkerProgramRegistrationFragment$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.sendExtras
    public final void INotificationSideChannelDefault() {
        TextInputLayout textInputLayout = INotificationSideChannelStub().tilChoseTuitionRate;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string))));
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
        Bundle arguments = getArguments();
        this.g = arguments != null ? (RegistrationForUnregistered) arguments.getParcelable("unregistered_data") : null;
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        Button button = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(button, "");
        Button button2 = button;
        Intrinsics.checkNotNullParameter(button2, "");
        button2.setEnabled(false);
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        Button button = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(button, "");
        Button button2 = button;
        Intrinsics.checkNotNullParameter(button2, "");
        button2.setEnabled(true);
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        final FragmentNonSalariedWorkerProgramRegistrationBinding fragmentNonSalariedWorkerProgramRegistrationBindingINotificationSideChannelStub = INotificationSideChannelStub();
        EditText editText = fragmentNonSalariedWorkerProgramRegistrationBindingINotificationSideChannelStub.tilChoseTuitionRate.getEditText();
        if (editText != null) {
            editText.setOnClickListener(new View.OnClickListener() { // from class: connectAndInitialize
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    bindCustomTabsService.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, fragmentNonSalariedWorkerProgramRegistrationBindingINotificationSideChannelStub, view);
                }
            });
        }
        EditText editText2 = fragmentNonSalariedWorkerProgramRegistrationBindingINotificationSideChannelStub.tilBranchOffice.getEditText();
        if (editText2 != null) {
            editText2.setOnClickListener(new View.OnClickListener() { // from class: newPendingSession
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    bindCustomTabsService.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, view);
                }
            });
        }
        AppCompatRadioButton appCompatRadioButton = fragmentNonSalariedWorkerProgramRegistrationBindingINotificationSideChannelStub.rbProgramJkkJkmJht;
        Intrinsics.checkNotNullExpressionValue(appCompatRadioButton, "");
        appCompatRadioButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: newSessionInternal
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return bindCustomTabsService.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, fragmentNonSalariedWorkerProgramRegistrationBindingINotificationSideChannelStub, (View) obj);
            }
        }));
        AppCompatRadioButton appCompatRadioButton2 = fragmentNonSalariedWorkerProgramRegistrationBindingINotificationSideChannelStub.rbProgramJkkJkm;
        Intrinsics.checkNotNullExpressionValue(appCompatRadioButton2, "");
        appCompatRadioButton2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: attachSession
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return bindCustomTabsService.b(this.TuitionPaymentFragmentbindingInflater1, fragmentNonSalariedWorkerProgramRegistrationBindingINotificationSideChannelStub, (View) obj);
            }
        }));
        fragmentNonSalariedWorkerProgramRegistrationBindingINotificationSideChannelStub.tvTitleBenefitProgram.setOnClickListener(new View.OnClickListener() { // from class: extraCommand
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bindCustomTabsService.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, fragmentNonSalariedWorkerProgramRegistrationBindingINotificationSideChannelStub, view);
            }
        });
        Button button = INotificationSideChannelStub().btnNext;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: CustomTabsCallbackActivityLayoutState
            public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -292398540;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return bindCustomTabsService.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj);
            }
        }));
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(bindCustomTabsService bindcustomtabsservice, View view) {
        String str;
        Intrinsics.checkNotNullParameter(view, "");
        FragmentNonSalariedWorkerProgramRegistrationBinding fragmentNonSalariedWorkerProgramRegistrationBindingINotificationSideChannelStub = bindcustomtabsservice.INotificationSideChannelStub();
        EditText editText = fragmentNonSalariedWorkerProgramRegistrationBindingINotificationSideChannelStub.tilChoseTuitionRate.getEditText();
        RegistrationForUnregistered registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        String strValueOf = String.valueOf(editText != null ? editText.getText() : null);
        if (strValueOf == null || strValueOf.length() == 0) {
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Silakan pilih nominal iuran terlebih dahulu", 0).show();
        } else if (bindcustomtabsservice.RemoteActionCompatParcelizer() && fragmentNonSalariedWorkerProgramRegistrationBindingINotificationSideChannelStub.rgPaymentPeriod.getCheckedRadioButtonId() != -1 && fragmentNonSalariedWorkerProgramRegistrationBindingINotificationSideChannelStub.rgProgram.getCheckedRadioButtonId() != -1) {
            RegistrationForUnregistered registrationForUnregistered = bindcustomtabsservice.g;
            if (registrationForUnregistered != null) {
                switch (fragmentNonSalariedWorkerProgramRegistrationBindingINotificationSideChannelStub.rgPaymentPeriod.getCheckedRadioButtonId()) {
                    case R.id.rbOneMonthPeriod /* 2131429143 */:
                        str = "1";
                        break;
                    case R.id.rbSixMonthPeriod /* 2131429153 */:
                        str = "6";
                        break;
                    case R.id.rbThreeMonthPeriod /* 2131429155 */:
                        str = ExifInterface.GPS_MEASUREMENT_3D;
                        break;
                    case R.id.rbTwoMonthPeriod /* 2131429157 */:
                        str = ExifInterface.GPS_MEASUREMENT_2D;
                        break;
                    default:
                        str = "12";
                        break;
                }
                String str2 = str;
                String str3 = fragmentNonSalariedWorkerProgramRegistrationBindingINotificationSideChannelStub.rgProgram.getCheckedRadioButtonId() == R.id.rbProgramJkkJkm ? ExifInterface.GPS_DIRECTION_TRUE : "L";
                String string = fragmentNonSalariedWorkerProgramRegistrationBindingINotificationSideChannelStub.rgProgram.getCheckedRadioButtonId() == R.id.rbProgramJkkJkm ? bindcustomtabsservice.INotificationSideChannelStub().rbProgramJkkJkm.getText().toString() : bindcustomtabsservice.INotificationSideChannelStub().rbProgramJkkJkmJht.getText().toString();
                Office office = bindcustomtabsservice.d;
                String str4 = office != null ? office.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null;
                Office office2 = bindcustomtabsservice.d;
                String str5 = office2 != null ? office2.TuitionPaymentFragmentbindingInflater1 : null;
                TuitionRate tuitionRate = bindcustomtabsservice.asInterface;
                registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3 = RegistrationForUnregistered.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registrationForUnregistered, null, null, null, null, null, null, str4, str5, null, null, null, null, null, null, tuitionRate != null ? tuitionRate.TuitionPaymentFragmentbindingInflater1 : null, str3, string, str2, null, null, null, null, false, false, 16531263);
            }
            lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion companion = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.INSTANCE;
            lambdasetActive6androidxcameracamera2interopCamera2CameraControl lambdasetactive6androidxcameracamera2interopcamera2cameracontrol = new lambdasetActive6androidxcameracamera2interopCamera2CameraControl(registrationForUnregisteredTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            Intrinsics.checkNotNullParameter(lambdasetactive6androidxcameracamera2interopcamera2cameracontrol, "");
            lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion.b().onNext(lambdasetactive6androidxcameracamera2interopcamera2cameracontrol);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final bindCustomTabsService bindcustomtabsservice, final FragmentNonSalariedWorkerProgramRegistrationBinding fragmentNonSalariedWorkerProgramRegistrationBinding, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            CustomTabsIntent.Companion companion = CustomTabsIntent.INSTANCE;
            CustomTabsIntent customTabsIntentTuitionPaymentFragmentbindingInflater1 = CustomTabsIntent.Companion.TuitionPaymentFragmentbindingInflater1(bindcustomtabsservice.asBinder, bindcustomtabsservice.asInterface, new Function1() { // from class: CustomTabsClient
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return bindCustomTabsService.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, fragmentNonSalariedWorkerProgramRegistrationBinding, (TuitionRate) obj);
                }
            });
            FragmentManager childFragmentManager = bindcustomtabsservice.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(customTabsIntentTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                customTabsIntentTuitionPaymentFragmentbindingInflater1.show(childFragmentManager, customTabsIntentTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ Unit b(bindCustomTabsService bindcustomtabsservice, FragmentNonSalariedWorkerProgramRegistrationBinding fragmentNonSalariedWorkerProgramRegistrationBinding, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        String str = bindcustomtabsservice.asBinder;
        int checkedRadioButtonId = fragmentNonSalariedWorkerProgramRegistrationBinding.rgProgram.getCheckedRadioButtonId();
        String str2 = ExifInterface.GPS_DIRECTION_TRUE;
        if (!Intrinsics.areEqual(str, checkedRadioButtonId == R.id.rbProgramJkkJkm ? ExifInterface.GPS_DIRECTION_TRUE : "L")) {
            fragmentNonSalariedWorkerProgramRegistrationBinding.edtChoseTuitionRate.setText("");
        }
        bindcustomtabsservice.b = 2;
        fragmentNonSalariedWorkerProgramRegistrationBinding.tvInfoJht.setVisibility(8);
        fragmentNonSalariedWorkerProgramRegistrationBinding.viewLineJht.setVisibility(8);
        if (fragmentNonSalariedWorkerProgramRegistrationBinding.rgProgram.getCheckedRadioButtonId() != R.id.rbProgramJkkJkm) {
            str2 = "L";
        }
        bindcustomtabsservice.asBinder = str2;
        bindcustomtabsservice.asInterface = null;
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void b(bindCustomTabsService bindcustomtabsservice, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            getBundleFromItem getbundlefromitem = (getBundleFromItem) bindcustomtabsservice.notify.getValue();
            FragmentManager childFragmentManager = bindcustomtabsservice.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            Intrinsics.checkNotNullParameter(childFragmentManager, "");
            if (childFragmentManager.findFragmentByTag(getbundlefromitem.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
                getbundlefromitem.show(childFragmentManager, getbundlefromitem.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ getBundleFromItem TuitionPaymentFragmentbindingInflater1(final bindCustomTabsService bindcustomtabsservice) {
        getBundleFromItem.Companion companion = getBundleFromItem.INSTANCE;
        return getBundleFromItem.Companion.b(new Function1() { // from class: createSessionId
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return bindCustomTabsService.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (CodeNamePair) obj);
            }
        });
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(bindCustomTabsService bindcustomtabsservice, FragmentNonSalariedWorkerProgramRegistrationBinding fragmentNonSalariedWorkerProgramRegistrationBinding, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            boolean z = !bindcustomtabsservice.a;
            bindcustomtabsservice.a = z;
            if (z) {
                fragmentNonSalariedWorkerProgramRegistrationBinding.tvTitleBenefitProgram.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_arrow_up_green, 0);
                fragmentNonSalariedWorkerProgramRegistrationBinding.containerBenefitDescription.setVisibility(0);
                if (bindcustomtabsservice.b == 3) {
                    fragmentNonSalariedWorkerProgramRegistrationBinding.tvInfoJht.setVisibility(0);
                    fragmentNonSalariedWorkerProgramRegistrationBinding.viewLineJht.setVisibility(0);
                } else {
                    fragmentNonSalariedWorkerProgramRegistrationBinding.tvInfoJht.setVisibility(8);
                    fragmentNonSalariedWorkerProgramRegistrationBinding.viewLineJht.setVisibility(8);
                }
            } else {
                fragmentNonSalariedWorkerProgramRegistrationBinding.tvTitleBenefitProgram.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_arrow_down, 0);
                fragmentNonSalariedWorkerProgramRegistrationBinding.containerBenefitDescription.setVisibility(8);
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(bindCustomTabsService bindcustomtabsservice, CodeNamePair codeNamePair) {
        Intrinsics.checkNotNullParameter(codeNamePair, "");
        bindcustomtabsservice.d = new Office("", codeNamePair.b, 0.0d, 0.0d, codeNamePair.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        EditText editText = bindcustomtabsservice.INotificationSideChannelStub().tilBranchOffice.getEditText();
        if (editText != null) {
            Office office = bindcustomtabsservice.d;
            editText.setText(office != null ? office.TuitionPaymentFragmentbindingInflater1 : null);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(bindCustomTabsService bindcustomtabsservice, FragmentNonSalariedWorkerProgramRegistrationBinding fragmentNonSalariedWorkerProgramRegistrationBinding, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        String str = bindcustomtabsservice.asBinder;
        int checkedRadioButtonId = fragmentNonSalariedWorkerProgramRegistrationBinding.rgProgram.getCheckedRadioButtonId();
        String str2 = ExifInterface.GPS_DIRECTION_TRUE;
        if (!Intrinsics.areEqual(str, checkedRadioButtonId == R.id.rbProgramJkkJkm ? ExifInterface.GPS_DIRECTION_TRUE : "L")) {
            fragmentNonSalariedWorkerProgramRegistrationBinding.edtChoseTuitionRate.setText("");
        }
        bindcustomtabsservice.b = 3;
        fragmentNonSalariedWorkerProgramRegistrationBinding.tvInfoJht.setVisibility(0);
        fragmentNonSalariedWorkerProgramRegistrationBinding.viewLineJht.setVisibility(0);
        if (fragmentNonSalariedWorkerProgramRegistrationBinding.rgProgram.getCheckedRadioButtonId() != R.id.rbProgramJkkJkm) {
            str2 = "L";
        }
        bindcustomtabsservice.asBinder = str2;
        bindcustomtabsservice.asInterface = null;
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(bindCustomTabsService bindcustomtabsservice, FragmentNonSalariedWorkerProgramRegistrationBinding fragmentNonSalariedWorkerProgramRegistrationBinding, TuitionRate tuitionRate) {
        bindcustomtabsservice.asInterface = tuitionRate;
        EditText editText = fragmentNonSalariedWorkerProgramRegistrationBinding.tilChoseTuitionRate.getEditText();
        if (editText != null) {
            editText.setText(getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(String.valueOf(tuitionRate != null ? tuitionRate.b : null)));
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void b(bindCustomTabsService bindcustomtabsservice, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            bindcustomtabsservice.IconCompatParcelizer();
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            bindcustomtabsservice.write();
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            if (Intrinsics.areEqual(((BranchOfficeDefaultSelectedResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getStatusDefault(), "Y")) {
                bindcustomtabsservice.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
                bindcustomtabsservice.INotificationSideChannelStub().containerChooseBranchOffice.setVisibility(8);
                bindcustomtabsservice.d = new Office("", String.valueOf(((BranchOfficeDefaultSelectedResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getData().get(0).getCode()), 0.0d, 0.0d, String.valueOf(((BranchOfficeDefaultSelectedResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getData().get(0).getOfficeName()));
                return;
            } else {
                bindcustomtabsservice.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = false;
                bindcustomtabsservice.INotificationSideChannelStub().containerChooseBranchOffice.setVisibility(0);
                return;
            }
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            bindcustomtabsservice.write();
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        ((drawSelectorCompat) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).b.observe(getViewLifecycleOwner(), new Observer() { // from class: onWarmupCompleted
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                bindCustomTabsService.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        });
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
        final drawSelectorCompat drawselectorcompat = (drawSelectorCompat) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        User user = (User) this.TuitionPaymentFragmentbindingInflater1.getValue();
        String strValueOf = String.valueOf(user != null ? user.b : null);
        Intrinsics.checkNotNullParameter(strValueOf, "");
        MutableLiveData<VirtualCameraAdapter1<BranchOfficeDefaultSelectedResponse>> mutableLiveData = drawselectorcompat.b;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(drawselectorcompat.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new BranchOfficeDefaultSelectedRequest(strValueOf))));
        final Function1 function1 = new Function1() { // from class: setListSelectionHidden
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return drawSelectorCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault2(drawselectorcompat, (BranchOfficeDefaultSelectedResponse) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: onForwardedEvent
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: DropDownListViewApi33Impl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return drawSelectorCompat.g(drawselectorcompat, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: clearPressedItem
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        drawselectorcompat.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }
}

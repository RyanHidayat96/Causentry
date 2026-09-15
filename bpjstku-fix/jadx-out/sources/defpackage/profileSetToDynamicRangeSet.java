package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import com.bpjstku.R;
import com.bpjstku.data.tuition.model.request.TuitionPaymentRequest;
import com.bpjstku.databinding.FragmentTuitionPaymentIdentityParticipantBinding;
import com.bpjstku.domain.registration.general.model.Registration;
import com.bpjstku.domain.tuition.model.BpuCheckPaymentItem;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.membership.payment.PaymentActivity;
import com.bpjstku.presentation.tuition.TuitionPaymentActivity;
import com.bpjstku.presentation.tuition.TuitionPaymentIdentityNumberParticipantFragment$bindingInflater$1;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.InputConfigurationCompat;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.setQuickZoomEnabled;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\u0004R\u0015\u0010\u000f\u001a\u00020\u000e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00118CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0015\u0010\u0012\u001a\u00020\u00148CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0018\u001a\u00020\u00158UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R.\u0010\u001f\u001a\u001c\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00020\u00198UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"LprofileSetToDynamicRangeSet;", "LAutoValue_ImmutableImageInfo;", "Lcom/bpjstku/databinding/FragmentTuitionPaymentIdentityParticipantBinding;", "<init>", "()V", "", "g", "cancelAll", "INotificationSideChannel", "cancel", "onTransact", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "INotificationSideChannelDefault", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "b", "Lkotlin/Lazy;", "Lcom/bpjstku/domain/user/model/User;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LInputConfigurationCompat;", "", "asBinder", "()I", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "d", "()Lkotlin/jvm/functions/Function3;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class profileSetToDynamicRangeSet extends AutoValue_ImmutableImageInfo<FragmentTuitionPaymentIdentityParticipantBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: getFormat
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.b.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        }
    });
    private final Lazy b;

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder */
    public final int getINotificationSideChannel() {
        return R.layout.fragment_tuition_payment_identity_participant;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
    }

    public profileSetToDynamicRangeSet() {
        final profileSetToDynamicRangeSet profilesettodynamicrangeset = this;
        this.b = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.tuition.TuitionPaymentIdentityNumberParticipantFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                LifecycleOwner lifecycleOwner = profilesettodynamicrangeset;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class);
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
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<InputConfigurationCompat>() { // from class: com.bpjstku.presentation.tuition.TuitionPaymentIdentityNumberParticipantFragment$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [InputConfigurationCompat, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ InputConfigurationCompat invoke() {
                LifecycleOwner lifecycleOwner = profilesettodynamicrangeset;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InputConfigurationCompat.class);
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
    }

    @Override // defpackage.AutoValue_ImmutableImageInfo
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentTuitionPaymentIdentityParticipantBinding> d() {
        return TuitionPaymentIdentityNumberParticipantFragment$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        final FragmentTuitionPaymentIdentityParticipantBinding fragmentTuitionPaymentIdentityParticipantBindingINotificationSideChannelStub = INotificationSideChannelStub();
        MaterialButton materialButton = fragmentTuitionPaymentIdentityParticipantBindingINotificationSideChannelStub.btnCheckBpuIdNumber;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: DynamicRangesCompatBaseImpl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return profileSetToDynamicRangeSet.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, fragmentTuitionPaymentIdentityParticipantBindingINotificationSideChannelStub, (View) obj);
            }
        }));
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
        MaterialButton materialButton = INotificationSideChannelStub().btnCheckBpuIdNumber;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setEnabled(false);
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
        MaterialButton materialButton = INotificationSideChannelStub().btnCheckBpuIdNumber;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setEnabled(true);
    }

    @Override // defpackage.sendExtras
    public final void INotificationSideChannelDefault() {
        TextInputLayout textInputLayout = INotificationSideChannelStub().tilIdNumber;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = getString(R.string.error_field_nik);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf((Object[]) new setInactive[]{new accessconfigureInstanceInternal("^.{1,}$", string), accessgetMCameraInfoMapp.TuitionPaymentFragmentspecialinlinedviewModeldefault2(string2, 16, 16)})));
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(profileSetToDynamicRangeSet profilesettodynamicrangeset, FragmentTuitionPaymentIdentityParticipantBinding fragmentTuitionPaymentIdentityParticipantBinding, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        InputConfigurationCompat inputConfigurationCompat = (InputConfigurationCompat) profilesettodynamicrangeset.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        User user = (User) profilesettodynamicrangeset.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        String strValueOf = String.valueOf(user != null ? user.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null);
        EditText editText = fragmentTuitionPaymentIdentityParticipantBinding.tilIdNumber.getEditText();
        inputConfigurationCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new TuitionPaymentRequest(strValueOf, "", "", String.valueOf(editText != null ? editText.getText() : null)));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(profileSetToDynamicRangeSet profilesettodynamicrangeset, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        String str2 = "";
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            profilesettodynamicrangeset.IconCompatParcelizer();
            str = "loading_check_unpaid_tuition";
        } else {
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                profilesettodynamicrangeset.write();
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2), 0).show();
                str = "failure_check_unpaid_tuition";
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                profilesettodynamicrangeset.write();
                VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
                if (((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).d == 100) {
                    TuitionPaymentActivity.Companion companion = TuitionPaymentActivity.INSTANCE;
                    Context contextRequireContext = profilesettodynamicrangeset.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    EditText editText = profilesettodynamicrangeset.INotificationSideChannelStub().tilIdNumber.getEditText();
                    TuitionPaymentActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, String.valueOf(editText != null ? editText.getText() : null));
                } else {
                    Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "Oops masih ada iuran yang harus dibayarkan", 0).show();
                    BaseActivity baseActivity = profilesettodynamicrangeset.TuitionPaymentFragmentbindingInflater1;
                    if (baseActivity != null) {
                        baseActivity.d_();
                    }
                    PaymentActivity.Companion companion2 = PaymentActivity.INSTANCE;
                    Context contextRequireContext2 = profilesettodynamicrangeset.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                    double d = ((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentbindingInflater1;
                    double d2 = ((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    double d3 = ((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    User user = (User) profilesettodynamicrangeset.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                    String strValueOf = String.valueOf(user != null ? user.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null);
                    User user2 = (User) profilesettodynamicrangeset.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                    String strValueOf2 = String.valueOf(user2 != null ? user2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null);
                    User user3 = (User) profilesettodynamicrangeset.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                    String strValueOf3 = String.valueOf(user3 != null ? user3.g : null);
                    String string = ((String) StringsKt.split$default((CharSequence) ((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).asInterface, new String[]{"#"}, false, 0, 6, (Object) null).get(0)).toString();
                    String string2 = ((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).b.toString();
                    double d4 = ((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    User user4 = (User) profilesettodynamicrangeset.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                    String strValueOf4 = String.valueOf(user4 != null ? user4.asBinder : null);
                    User user5 = (User) profilesettodynamicrangeset.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                    String strValueOf5 = String.valueOf(user5 != null ? user5.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null);
                    User user6 = (User) profilesettodynamicrangeset.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                    String strValueOf6 = String.valueOf(user6 != null ? user6.b : null);
                    double d5 = ((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).asBinder;
                    double d6 = ((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).g;
                    String str3 = ((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).INotificationSideChannel;
                    String str4 = ((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).INotificationSideChannelStub;
                    String str5 = ((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).INotificationSideChannelDefault;
                    String str6 = ((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).notify;
                    String str7 = ((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).onTransact;
                    User user7 = (User) profilesettodynamicrangeset.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
                    PaymentActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext2, new Registration(true, "", String.valueOf(d), String.valueOf(d2), String.valueOf(d3), string2, String.valueOf(d4), strValueOf5, user7 != null ? user7.asInterface : null, strValueOf, strValueOf2, strValueOf4, strValueOf3, string, str5, str4, "unregistered_member", strValueOf6, Double.valueOf(d6), Double.valueOf(d5), ((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).a, str3, str6, String.valueOf(((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).cancelAll), str7, "", String.valueOf(((BpuCheckPaymentItem) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).RemoteActionCompatParcelizer), "", "", false, false, 1610612736, null));
                }
                str = "success_check_unpaid_tuition";
            } else {
                str2 = "";
                str = str2;
            }
            FragmentActivity activity = profilesettodynamicrangeset.getActivity();
            String str8 = str2;
            Intrinsics.checkNotNull(activity, str8);
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_check_bpu_tuition_payment", str));
            Intrinsics.checkNotNullParameter((BaseActivity) activity, str8);
            Intrinsics.checkNotNullParameter(str, str8);
            Intrinsics.checkNotNullParameter(mapMutableMapOf, str8);
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Intrinsics.checkNotNullParameter(str, str8);
            Intrinsics.checkNotNullParameter(mapMutableMapOf, str8);
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
        }
        str2 = "";
        FragmentActivity activity2 = profilesettodynamicrangeset.getActivity();
        String str9 = str2;
        Intrinsics.checkNotNull(activity2, str9);
        Map<String, Object> mapMutableMapOf2 = MapsKt.mutableMapOf(new Pair("params_check_bpu_tuition_payment", str));
        Intrinsics.checkNotNullParameter((BaseActivity) activity2, str9);
        Intrinsics.checkNotNullParameter(str, str9);
        Intrinsics.checkNotNullParameter(mapMutableMapOf2, str9);
        TargetAspectRatio targetAspectRatio2 = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, str9);
        Intrinsics.checkNotNullParameter(mapMutableMapOf2, str9);
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf2);
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        ((InputConfigurationCompat) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).b.observe(getViewLifecycleOwner(), new Observer() { // from class: isMultiResolution
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                profileSetToDynamicRangeSet.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        });
    }
}

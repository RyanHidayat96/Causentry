package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import com.bpjstku.R;
import com.bpjstku.data.asik.model.request.OtpByPhoneRequest;
import com.bpjstku.databinding.FragmentAsikActiveParticipantDataPhoneBinding;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.asik.active.AsikActiveParticipantDataHpFragment$bindingInflater$1;
import com.bpjstku.presentation.asik.active.model.AsikActiveParticipant;
import com.bpjstku.util.enums.VerificationActionType;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.select;
import defpackage.setQuickZoomEnabled;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u0004R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0013\u001a\u00020\u00128CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0015\u0010\u000f\u001a\u00020\u00158CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u00178CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R.\u0010\u0018\u001a\u001c\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00020\u00198UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001d\u001a\u00020\u001f8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b \u0010!"}, d2 = {"LisCompatVectorFromResourcesEnabled;", "LAutoValue_ImmutableImageInfo;", "Lcom/bpjstku/databinding/FragmentAsikActiveParticipantDataPhoneBinding;", "<init>", "()V", "", "g", "cancelAll", "INotificationSideChannel", "cancel", "onTransact", "INotificationSideChannelDefault", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "Lcom/bpjstku/presentation/asik/active/model/AsikActiveParticipant;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/bpjstku/presentation/asik/active/model/AsikActiveParticipant;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lselect;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lkotlin/Lazy;", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/domain/user/model/User;", "b", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "d", "()Lkotlin/jvm/functions/Function3;", "", "asBinder", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class isCompatVectorFromResourcesEnabled extends AutoValue_ImmutableImageInfo<FragmentAsikActiveParticipantDataPhoneBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private AsikActiveParticipant TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: removeActivityDelegate
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
        }
    });

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentbindingInflater1;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1) {
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
    /* JADX INFO: renamed from: asBinder */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return R.layout.fragment_asik_active_participant_data_phone;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
    }

    public isCompatVectorFromResourcesEnabled() {
        final isCompatVectorFromResourcesEnabled iscompatvectorfromresourcesenabled = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<select>() { // from class: com.bpjstku.presentation.asik.active.AsikActiveParticipantDataHpFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, select] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ select invoke() {
                LifecycleOwner lifecycleOwner = iscompatvectorfromresourcesenabled;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(select.class);
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
        final isCompatVectorFromResourcesEnabled iscompatvectorfromresourcesenabled2 = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.asik.active.AsikActiveParticipantDataHpFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                ComponentCallbacks componentCallbacks = iscompatvectorfromresourcesenabled2;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    @Override // defpackage.AutoValue_ImmutableImageInfo
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentAsikActiveParticipantDataPhoneBinding> d() {
        return AsikActiveParticipantDataHpFragment$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        final FragmentAsikActiveParticipantDataPhoneBinding fragmentAsikActiveParticipantDataPhoneBindingINotificationSideChannelStub = INotificationSideChannelStub();
        MaterialButton materialButton = fragmentAsikActiveParticipantDataPhoneBindingINotificationSideChannelStub.btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: setCompatVectorFromResourcesEnabled
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return isCompatVectorFromResourcesEnabled.TuitionPaymentFragmentbindingInflater1(fragmentAsikActiveParticipantDataPhoneBindingINotificationSideChannelStub, this, (View) obj);
            }
        }));
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
        Bundle arguments = getArguments();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = arguments != null ? (AsikActiveParticipant) arguments.getParcelable("asik_active_participant") : null;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        TextInputLayout textInputLayout = INotificationSideChannelStub().tilPhoneNumber;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        User user = (User) this.TuitionPaymentFragmentbindingInflater1.getValue();
        retrieveConcurrentCameraIds.b(textInputLayout, String.valueOf(user != null ? user.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null));
    }

    @Override // defpackage.sendExtras
    public final void INotificationSideChannelDefault() {
        TextInputLayout textInputLayout = INotificationSideChannelStub().tilPhoneNumber;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        String string = getString(R.string.error_field_required);
        Intrinsics.checkNotNullExpressionValue(string, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(new unregisterLifecycle(textInputLayout, CollectionsKt.listOf(new accessconfigureInstanceInternal("^.{1,}$", string))));
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

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(isCompatVectorFromResourcesEnabled iscompatvectorfromresourcesenabled, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            iscompatvectorfromresourcesenabled.IconCompatParcelizer();
        } else {
            AsikActiveParticipant asikActiveParticipantB = null;
            if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
                iscompatvectorfromresourcesenabled.write();
                AsikActiveParticipant asikActiveParticipant = iscompatvectorfromresourcesenabled.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (asikActiveParticipant != null) {
                    EditText editText = iscompatvectorfromresourcesenabled.INotificationSideChannelStub().tilPhoneNumber.getEditText();
                    asikActiveParticipantB = AsikActiveParticipant.b(asikActiveParticipant, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, String.valueOf(editText != null ? editText.getText() : null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32769, 31);
                }
                lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion companion = lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.INSTANCE;
                lambdaclearCaptureRequestOptions4androidxcameracamera2interopCamera2CameraControl lambdaclearcapturerequestoptions4androidxcameracamera2interopcamera2cameracontrol = new lambdaclearCaptureRequestOptions4androidxcameracamera2interopCamera2CameraControl(asikActiveParticipantB, VerificationActionType.PHONE_VERIFICATION);
                Intrinsics.checkNotNullParameter(lambdaclearcapturerequestoptions4androidxcameracamera2interopcamera2cameracontrol, "");
                lambdasetCaptureRequestOptions1androidxcameracamera2interopCamera2CameraControl.Companion.b().onNext(lambdaclearcapturerequestoptions4androidxcameracamera2interopcamera2cameracontrol);
            } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                iscompatvectorfromresourcesenabled.write();
                isCompatVectorFromResourcesEnabled iscompatvectorfromresourcesenabled2 = iscompatvectorfromresourcesenabled;
                String strValueOf = String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                Intrinsics.checkNotNullParameter(iscompatvectorfromresourcesenabled2, "");
                Intrinsics.checkNotNullParameter(strValueOf, "");
                BaseActivity baseActivity = (BaseActivity) iscompatvectorfromresourcesenabled2.getContext();
                if (baseActivity != null) {
                    retrieveConcurrentCameraIds.TuitionPaymentFragmentspecialinlinedviewModeldefault2(baseActivity, strValueOf, null);
                }
            } else {
                iscompatvectorfromresourcesenabled.write();
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(FragmentAsikActiveParticipantDataPhoneBinding fragmentAsikActiveParticipantDataPhoneBinding, isCompatVectorFromResourcesEnabled iscompatvectorfromresourcesenabled, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        TextInputLayout textInputLayout = fragmentAsikActiveParticipantDataPhoneBinding.tilPhoneNumber;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        VirtualCameraControlExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(textInputLayout, iscompatvectorfromresourcesenabled.requireContext());
        select selectVar = (select) iscompatvectorfromresourcesenabled.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        EditText editText = fragmentAsikActiveParticipantDataPhoneBinding.tilPhoneNumber.getEditText();
        String strValueOf = String.valueOf(editText != null ? editText.getText() : null);
        Context contextRequireContext = iscompatvectorfromresourcesenabled.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        String string = Settings.Secure.getString(contextRequireContext.getContentResolver(), "android_id");
        Intrinsics.checkExpressionValueIsNotNull(string, "");
        selectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new OtpByPhoneRequest(strValueOf, string));
        return Unit.INSTANCE;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        ((select) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).getInterfaceDescriptor.observe(getViewLifecycleOwner(), new TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Function1() { // from class: isAutoStorageOptedIn
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return isCompatVectorFromResourcesEnabled.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        }));
    }
}

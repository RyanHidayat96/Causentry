package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentManager;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentNonSalariedWorkerVerificationRegistrationBinding;
import com.bpjstku.presentation.membership.registration.model.RegistrationForUnregistered;
import com.bpjstku.presentation.membership.registration.nonsalariedworker.NonSalariedWorkerVerificationRegistrationFragment$bindingInflater$1;
import com.google.android.material.button.MaterialButton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\u0004R\u0015\u0010\u0011\u001a\u00020\u000e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u000f\u001a\u00020\u00128\u0015X\u0095D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R.\u0010\u0013\u001a\u001c\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00020\u00178UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"LCustomTabsClient210;", "LAutoValue_ImmutableImageInfo;", "Lcom/bpjstku/databinding/FragmentNonSalariedWorkerVerificationRegistrationBinding;", "<init>", "()V", "", "INotificationSideChannelDefault", "cancelAll", "onTransact", "INotificationSideChannelStubProxy", "getInterfaceDescriptor", "g", "cancel", "INotificationSideChannel", "LsetOnItemSelectedAction;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lkotlin/Lazy;", "b", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "I", "asBinder", "()I", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "d", "()Lkotlin/jvm/functions/Function3;", "Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/presentation/membership/registration/model/RegistrationForUnregistered;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CustomTabsClient210 extends AutoValue_ImmutableImageInfo<FragmentNonSalariedWorkerVerificationRegistrationBinding> {
    private RegistrationForUnregistered TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy b = LazyKt.lazy(new Function0() { // from class: CustomTabsClient2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CustomTabsClient210.TuitionPaymentFragmentbindingInflater1();
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = R.layout.fragment_non_salaried_worker_verification_registration;

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
    }

    @Override // defpackage.sendExtras
    public final void INotificationSideChannelDefault() {
    }

    @Override // defpackage.ProcessCameraProvider
    public final void INotificationSideChannelStubProxy() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
    }

    @Override // defpackage.ProcessCameraProvider
    public final void getInterfaceDescriptor() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder, reason: from getter */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.AutoValue_ImmutableImageInfo
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentNonSalariedWorkerVerificationRegistrationBinding> d() {
        return NonSalariedWorkerVerificationRegistrationFragment$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
        Bundle arguments = getArguments();
        this.TuitionPaymentFragmentbindingInflater1 = arguments != null ? (RegistrationForUnregistered) arguments.getParcelable("unregistered_data") : null;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        FragmentNonSalariedWorkerVerificationRegistrationBinding fragmentNonSalariedWorkerVerificationRegistrationBindingINotificationSideChannelStub = INotificationSideChannelStub();
        CardView cardView = fragmentNonSalariedWorkerVerificationRegistrationBindingINotificationSideChannelStub.cvIdentityCardUpload;
        Intrinsics.checkNotNullExpressionValue(cardView, "");
        cardView.setOnClickListener(new isBound(new Function1() { // from class: onCustomTabsServiceConnected
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CustomTabsClient210.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (View) obj);
            }
        }));
        CardView cardView2 = fragmentNonSalariedWorkerVerificationRegistrationBindingINotificationSideChannelStub.cvSelfieWithIdCard;
        Intrinsics.checkNotNullExpressionValue(cardView2, "");
        cardView2.setOnClickListener(new isBound(new Function1() { // from class: CustomTabsClient21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CustomTabsClient210.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj);
            }
        }));
        MaterialButton materialButton = fragmentNonSalariedWorkerVerificationRegistrationBindingINotificationSideChannelStub.btnConfirmation;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new isBound(new Function1() { // from class: CustomTabsClient27
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CustomTabsClient210.b(this.TuitionPaymentFragmentbindingInflater1, (View) obj);
            }
        }));
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(CustomTabsClient210 customTabsClient210, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        setOnItemSelectedAction setonitemselectedaction = (setOnItemSelectedAction) customTabsClient210.b.getValue();
        FragmentManager childFragmentManager = customTabsClient210.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Intrinsics.checkNotNullParameter(childFragmentManager, "");
        if (childFragmentManager.findFragmentByTag(setonitemselectedaction.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            setonitemselectedaction.show(childFragmentManager, setonitemselectedaction.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(CustomTabsClient210 customTabsClient210, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        setOnItemSelectedAction setonitemselectedaction = (setOnItemSelectedAction) customTabsClient210.b.getValue();
        FragmentManager childFragmentManager = customTabsClient210.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Intrinsics.checkNotNullParameter(childFragmentManager, "");
        if (childFragmentManager.findFragmentByTag(setonitemselectedaction.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            setonitemselectedaction.show(childFragmentManager, setonitemselectedaction.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(CustomTabsClient210 customTabsClient210, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        customTabsClient210.RemoteActionCompatParcelizer();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ setOnItemSelectedAction TuitionPaymentFragmentbindingInflater1() {
        return new setOnItemSelectedAction();
    }
}

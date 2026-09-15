package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentManager;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentAsikResignSalariedWorkerVerificationBinding;
import com.bpjstku.presentation.asik.resign.salariedworker.AsikResignSalariedWorkerVerificationFragment$bindingInflater$1;
import com.google.android.material.button.MaterialButton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004R.\u0010\u0010\u001a\u001c\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00020\f8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00128\u0015X\u0095D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0013\u001a\u00020\u00188CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0015\u0010\u0019\u001a\u00020\u001b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0017\u0010\u001a"}, d2 = {"LNavItemSelectedListener;", "LAutoValue_CameraState_StateError;", "Lcom/bpjstku/databinding/FragmentAsikResignSalariedWorkerVerificationBinding;", "<init>", "()V", "", "b_", "cancelAll", "onTransact", "g", "cancel", "INotificationSideChannel", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()Lkotlin/jvm/functions/Function3;", "", "b", "I", "asBinder", "()I", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LgetStringOrNull;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Lazy;", "LsetOnItemSelectedAction;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NavItemSelectedListener extends AutoValue_CameraState_StateError<FragmentAsikResignSalariedWorkerVerificationBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = R.layout.fragment_asik_resign_salaried_worker_verification;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy b = LazyKt.lazy(new Function0() { // from class: onItemSelected
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NavItemSelectedListener.b(this.TuitionPaymentFragmentbindingInflater1);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: ResourcesFlusher
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NavItemSelectedListener.TuitionPaymentFragmentbindingInflater1();
        }
    });

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void b_() {
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

    /* JADX INFO: renamed from: NavItemSelectedListener$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LNavItemSelectedListener$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "LNavItemSelectedListener;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()LNavItemSelectedListener;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static NavItemSelectedListener TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            NavItemSelectedListener navItemSelectedListener = new NavItemSelectedListener();
            navItemSelectedListener.setArguments(new Bundle());
            return navItemSelectedListener;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.AutoValue_CameraState_StateError
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentAsikResignSalariedWorkerVerificationBinding> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return AsikResignSalariedWorkerVerificationFragment$bindingInflater$1.b;
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder, reason: from getter */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        FragmentAsikResignSalariedWorkerVerificationBinding fragmentAsikResignSalariedWorkerVerificationBindingAsInterface = asInterface();
        MaterialButton materialButton = fragmentAsikResignSalariedWorkerVerificationBindingAsInterface.btnConfirmation;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new isBound(new Function1() { // from class: combineLocales
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NavItemSelectedListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (View) obj);
            }
        }));
        CardView cardView = fragmentAsikResignSalariedWorkerVerificationBindingAsInterface.cvFacialVerification;
        Intrinsics.checkNotNullExpressionValue(cardView, "");
        CardView cardView2 = cardView;
        Function1 function1 = new Function1() { // from class: onNothingSelected
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NavItemSelectedListener.TuitionPaymentFragmentbindingInflater1(this.b, (View) obj);
            }
        };
        Intrinsics.checkNotNullParameter(cardView2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        cardView2.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function1));
        CardView cardView3 = fragmentAsikResignSalariedWorkerVerificationBindingAsInterface.cvSelfieWithIdCard;
        Intrinsics.checkNotNullExpressionValue(cardView3, "");
        CardView cardView4 = cardView3;
        Function1 function2 = new Function1() { // from class: combineLocalesIfOverlayExists
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NavItemSelectedListener.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj);
            }
        };
        Intrinsics.checkNotNullParameter(cardView4, "");
        Intrinsics.checkNotNullParameter(function2, "");
        cardView4.setOnClickListener(new UseFlashModeTorchFor3aUpdate(function2));
    }

    public static /* synthetic */ getStringOrNull b(NavItemSelectedListener navItemSelectedListener) {
        getStringOrNull.Companion companion = getStringOrNull.INSTANCE;
        String string = navItemSelectedListener.getString(R.string.label_success);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = navItemSelectedListener.getString(R.string.label_membership_data_verified);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String string3 = navItemSelectedListener.getString(R.string.action_ok_thanks);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        return getStringOrNull.Companion.b(R.drawable.ic_success, string, string2, string3, null, 112);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(NavItemSelectedListener navItemSelectedListener, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        setOnItemSelectedAction setonitemselectedaction = (setOnItemSelectedAction) navItemSelectedListener.TuitionPaymentFragmentbindingInflater1.getValue();
        FragmentManager childFragmentManager = navItemSelectedListener.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Intrinsics.checkNotNullParameter(childFragmentManager, "");
        if (childFragmentManager.findFragmentByTag(setonitemselectedaction.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            setonitemselectedaction.show(childFragmentManager, setonitemselectedaction.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ setOnItemSelectedAction TuitionPaymentFragmentbindingInflater1() {
        return new setOnItemSelectedAction();
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(NavItemSelectedListener navItemSelectedListener, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        getStringOrNull getstringornull = (getStringOrNull) navItemSelectedListener.b.getValue();
        FragmentManager childFragmentManager = navItemSelectedListener.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Intrinsics.checkNotNullParameter(childFragmentManager, "");
        if (childFragmentManager.findFragmentByTag(getstringornull.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            getstringornull.show(childFragmentManager, getstringornull.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(NavItemSelectedListener navItemSelectedListener, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        setOnItemSelectedAction setonitemselectedaction = (setOnItemSelectedAction) navItemSelectedListener.TuitionPaymentFragmentbindingInflater1.getValue();
        FragmentManager childFragmentManager = navItemSelectedListener.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Intrinsics.checkNotNullParameter(childFragmentManager, "");
        if (childFragmentManager.findFragmentByTag(setonitemselectedaction.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            setonitemselectedaction.show(childFragmentManager, setonitemselectedaction.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        return Unit.INSTANCE;
    }
}

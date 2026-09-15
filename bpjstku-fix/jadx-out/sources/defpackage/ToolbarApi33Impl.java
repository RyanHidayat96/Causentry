package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentIndonesiaMigrantWorkerConfirmationRegistrationBinding;
import com.bpjstku.presentation.membership.registration.EmailVerificationActivity;
import com.bpjstku.presentation.membership.registration.model.MigrantWorkerRegistration;
import com.google.android.material.button.MaterialButton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0011\u0010\u0003R\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u00128CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u001a\u0010\u0011\u001a\u00020\u00178\u0015X\u0095D¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0016\u0010\u0019R\u001a\u0010\u000f\u001a\u00020\u001a8\u0015X\u0095D¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"LToolbarApi33Impl;", "LMediaSessionCompatMediaSessionImplApi181;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/bpjstku/presentation/membership/registration/model/MigrantWorkerRegistration;", "Lkotlin/Lazy;", "Lcom/bpjstku/databinding/FragmentIndonesiaMigrantWorkerConfirmationRegistrationBinding;", "Lcom/bpjstku/databinding/FragmentIndonesiaMigrantWorkerConfirmationRegistrationBinding;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "", "I", "()I", "", "Z", "d", "()Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ToolbarApi33Impl extends MediaSessionCompatMediaSessionImplApi181 {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private FragmentIndonesiaMigrantWorkerConfirmationRegistrationBinding TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy b = LazyKt.lazy(new Function0() { // from class: findOnBackInvokedDispatcher
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ToolbarApi33Impl.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = R.layout.fragment_indonesia_migrant_worker_confirmation_registration;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentbindingInflater1() {
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from getter */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentIndonesiaMigrantWorkerConfirmationRegistrationBinding fragmentIndonesiaMigrantWorkerConfirmationRegistrationBindingInflate = FragmentIndonesiaMigrantWorkerConfirmationRegistrationBinding.inflate(p0, p1, false);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = fragmentIndonesiaMigrantWorkerConfirmationRegistrationBindingInflate;
        if (fragmentIndonesiaMigrantWorkerConfirmationRegistrationBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentIndonesiaMigrantWorkerConfirmationRegistrationBindingInflate = null;
        }
        FrameLayout root = fragmentIndonesiaMigrantWorkerConfirmationRegistrationBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getTuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        FragmentIndonesiaMigrantWorkerConfirmationRegistrationBinding fragmentIndonesiaMigrantWorkerConfirmationRegistrationBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (fragmentIndonesiaMigrantWorkerConfirmationRegistrationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentIndonesiaMigrantWorkerConfirmationRegistrationBinding = null;
        }
        fragmentIndonesiaMigrantWorkerConfirmationRegistrationBinding.cvProgramSelected.setBackgroundResource(R.drawable.border_darkmint);
    }

    @Override // defpackage.MediaSessionCompatMediaSessionImplApi181
    public final void b() {
        FragmentIndonesiaMigrantWorkerConfirmationRegistrationBinding fragmentIndonesiaMigrantWorkerConfirmationRegistrationBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        FragmentIndonesiaMigrantWorkerConfirmationRegistrationBinding fragmentIndonesiaMigrantWorkerConfirmationRegistrationBinding2 = null;
        if (fragmentIndonesiaMigrantWorkerConfirmationRegistrationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentIndonesiaMigrantWorkerConfirmationRegistrationBinding = null;
        }
        MaterialButton materialButton = fragmentIndonesiaMigrantWorkerConfirmationRegistrationBinding.btnCancel;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: Toolbar4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ToolbarApi33Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (View) obj);
            }
        }));
        FragmentIndonesiaMigrantWorkerConfirmationRegistrationBinding fragmentIndonesiaMigrantWorkerConfirmationRegistrationBinding3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (fragmentIndonesiaMigrantWorkerConfirmationRegistrationBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            fragmentIndonesiaMigrantWorkerConfirmationRegistrationBinding2 = fragmentIndonesiaMigrantWorkerConfirmationRegistrationBinding3;
        }
        MaterialButton materialButton2 = fragmentIndonesiaMigrantWorkerConfirmationRegistrationBinding2.btnNext;
        Intrinsics.checkNotNullExpressionValue(materialButton2, "");
        materialButton2.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: Toolbar3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ToolbarApi33Impl.b(this.b, (View) obj);
            }
        }));
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(ToolbarApi33Impl toolbarApi33Impl, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        toolbarApi33Impl.dismiss();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ MigrantWorkerRegistration TuitionPaymentFragmentbindingInflater1(ToolbarApi33Impl toolbarApi33Impl) {
        Bundle arguments = toolbarApi33Impl.getArguments();
        if (arguments != null) {
            return (MigrantWorkerRegistration) arguments.getParcelable("migration_worker_data");
        }
        return null;
    }

    public static /* synthetic */ Unit b(ToolbarApi33Impl toolbarApi33Impl, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Context context = toolbarApi33Impl.getContext();
        if (context != null) {
            EmailVerificationActivity.Companion companion = EmailVerificationActivity.INSTANCE;
            EmailVerificationActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(context, (MigrantWorkerRegistration) toolbarApi33Impl.b.getValue());
        }
        return Unit.INSTANCE;
    }
}

package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentIndonesianMigrantWorkerPaymentFormBinding;
import com.bpjstku.presentation.membership.registration.EmailVerificationActivity;
import com.bpjstku.presentation.membership.registration.indonesianmigranworker.IndonesianMigrantWorkerPaymentFormFragment$bindingInflater$1;
import com.bpjstku.presentation.membership.registration.model.MigrantWorkerRegistration;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
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
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004R\u0017\u0010\u000f\u001a\u0004\u0018\u00010\f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u000eR.\u0010\r\u001a\u001c\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00020\u00108UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0014\u001a\u00020\u00168\u0015X\u0095D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"LgetInflatedId;", "LAutoValue_CameraState_StateError;", "Lcom/bpjstku/databinding/FragmentIndonesianMigrantWorkerPaymentFormBinding;", "<init>", "()V", "", "g", "cancelAll", "b_", "cancel", "onTransact", "INotificationSideChannel", "Lcom/bpjstku/presentation/membership/registration/model/MigrantWorkerRegistration;", "b", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()Lkotlin/jvm/functions/Function3;", "", "TuitionPaymentFragmentbindingInflater1", "I", "asBinder", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class getInflatedId extends AutoValue_CameraState_StateError<FragmentIndonesianMigrantWorkerPaymentFormBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: getLayoutResource
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return getInflatedId.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = R.layout.fragment_indonesian_migrant_worker_payment_form;

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

    /* JADX INFO: renamed from: getInflatedId$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LgetInflatedId$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Lcom/bpjstku/presentation/membership/registration/model/MigrantWorkerRegistration;", "p0", "LgetInflatedId;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/bpjstku/presentation/membership/registration/model/MigrantWorkerRegistration;)LgetInflatedId;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static getInflatedId TuitionPaymentFragmentbindingInflater1(MigrantWorkerRegistration p0) {
            getInflatedId getinflatedid = new getInflatedId();
            Bundle bundle = new Bundle();
            bundle.putParcelable("migration_worker_data", p0);
            getinflatedid.setArguments(bundle);
            return getinflatedid;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.AutoValue_CameraState_StateError
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentIndonesianMigrantWorkerPaymentFormBinding> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return IndonesianMigrantWorkerPaymentFormFragment$bindingInflater$1.b;
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder, reason: from getter */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        MaterialButton materialButton = asInterface().btnConfirmation;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new isBound(new Function1() { // from class: getLayoutInflater
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getInflatedId.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (View) obj);
            }
        }));
    }

    public static /* synthetic */ Unit b(getInflatedId getinflatedid, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        EmailVerificationActivity.Companion companion = EmailVerificationActivity.INSTANCE;
        Context contextRequireContext = getinflatedid.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        EmailVerificationActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(contextRequireContext, (MigrantWorkerRegistration) getinflatedid.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        return Unit.INSTANCE;
    }

    public static /* synthetic */ MigrantWorkerRegistration b(getInflatedId getinflatedid) {
        Bundle arguments = getinflatedid.getArguments();
        if (arguments != null) {
            return (MigrantWorkerRegistration) arguments.getParcelable("migration_worker_data");
        }
        return null;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        FragmentIndonesianMigrantWorkerPaymentFormBinding fragmentIndonesianMigrantWorkerPaymentFormBindingAsInterface = asInterface();
        TextInputEditText textInputEditText = fragmentIndonesianMigrantWorkerPaymentFormBindingAsInterface.edtIdentityNumber;
        MigrantWorkerRegistration migrantWorkerRegistration = (MigrantWorkerRegistration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        textInputEditText.setText(migrantWorkerRegistration != null ? migrantWorkerRegistration.TuitionPaymentFragmentbindingInflater1 : null);
        TextInputEditText textInputEditText2 = fragmentIndonesianMigrantWorkerPaymentFormBindingAsInterface.edtFullname;
        MigrantWorkerRegistration migrantWorkerRegistration2 = (MigrantWorkerRegistration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        textInputEditText2.setText(migrantWorkerRegistration2 != null ? migrantWorkerRegistration2.asBinder : null);
        TextInputEditText textInputEditText3 = fragmentIndonesianMigrantWorkerPaymentFormBindingAsInterface.edtBirthDate;
        MigrantWorkerRegistration migrantWorkerRegistration3 = (MigrantWorkerRegistration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        textInputEditText3.setText(migrantWorkerRegistration3 != null ? migrantWorkerRegistration3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null);
        TextInputEditText textInputEditText4 = fragmentIndonesianMigrantWorkerPaymentFormBindingAsInterface.edtGender;
        MigrantWorkerRegistration migrantWorkerRegistration4 = (MigrantWorkerRegistration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        textInputEditText4.setText(StringsKt.equals(migrantWorkerRegistration4 != null ? migrantWorkerRegistration4.onTransact : null, "L", false) ? "Laki-laki" : "Perempuan");
        TextInputEditText textInputEditText5 = fragmentIndonesianMigrantWorkerPaymentFormBindingAsInterface.edtMothersName;
        MigrantWorkerRegistration migrantWorkerRegistration5 = (MigrantWorkerRegistration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        textInputEditText5.setText(migrantWorkerRegistration5 != null ? migrantWorkerRegistration5.INotificationSideChannel : null);
        TextInputEditText textInputEditText6 = fragmentIndonesianMigrantWorkerPaymentFormBindingAsInterface.edtFathersName;
        MigrantWorkerRegistration migrantWorkerRegistration6 = (MigrantWorkerRegistration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        textInputEditText6.setText(migrantWorkerRegistration6 != null ? migrantWorkerRegistration6.cancelAll : null);
        TextInputEditText textInputEditText7 = fragmentIndonesianMigrantWorkerPaymentFormBindingAsInterface.edtChoosedProvince;
        MigrantWorkerRegistration migrantWorkerRegistration7 = (MigrantWorkerRegistration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        textInputEditText7.setText(migrantWorkerRegistration7 != null ? migrantWorkerRegistration7.d : null);
        TextInputEditText textInputEditText8 = fragmentIndonesianMigrantWorkerPaymentFormBindingAsInterface.edtChoosedCity;
        MigrantWorkerRegistration migrantWorkerRegistration8 = (MigrantWorkerRegistration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        textInputEditText8.setText(migrantWorkerRegistration8 != null ? migrantWorkerRegistration8.asInterface : null);
        TextInputEditText textInputEditText9 = fragmentIndonesianMigrantWorkerPaymentFormBindingAsInterface.edtBranchOffice;
        MigrantWorkerRegistration migrantWorkerRegistration9 = (MigrantWorkerRegistration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        textInputEditText9.setText(migrantWorkerRegistration9 != null ? migrantWorkerRegistration9.com.google.firebase.analytics.FirebaseAnalytics.Event.SEARCH java.lang.String : null);
        AppCompatTextView appCompatTextView = fragmentIndonesianMigrantWorkerPaymentFormBindingAsInterface.tvProgramChoosed;
        MigrantWorkerRegistration migrantWorkerRegistration10 = (MigrantWorkerRegistration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        appCompatTextView.setText(migrantWorkerRegistration10 != null ? migrantWorkerRegistration10.MediaBrowserCompatCallbackHandler : null);
        MigrantWorkerRegistration migrantWorkerRegistration11 = (MigrantWorkerRegistration) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        if (StringsKt.equals$default(migrantWorkerRegistration11 != null ? migrantWorkerRegistration11.MediaBrowserCompatCallbackHandler : null, getString(R.string.label_jkk_jkm), false, 2, null)) {
            fragmentIndonesianMigrantWorkerPaymentFormBindingAsInterface.imgProgramChoosed.setImageResource(R.drawable.ic_people_jkk);
        } else {
            fragmentIndonesianMigrantWorkerPaymentFormBindingAsInterface.imgProgramChoosed.setImageResource(R.drawable.ic_people_jht);
        }
    }
}

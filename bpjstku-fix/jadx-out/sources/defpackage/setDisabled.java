package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bpjstku.R;
import com.bpjstku.data.payment.model.response.RecurringProfile;
import com.bpjstku.databinding.FragmentRecurringProfileBinding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\u0003J+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u00168\u0015X\u0094D¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0015\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\u001a8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0005\u0010\u001b"}, d2 = {"LsetDisabled;", "LunregisterMediaButtonEventReceiver;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lcom/bpjstku/data/payment/model/response/RecurringProfile;", "Lcom/bpjstku/data/payment/model/response/RecurringProfile;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "", "I", "()I", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/databinding/FragmentRecurringProfileBinding;", "Lcom/bpjstku/databinding/FragmentRecurringProfileBinding;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class setDisabled extends unregisterMediaButtonEventReceiver {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private FragmentRecurringProfileBinding TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentbindingInflater1 = R.layout.fragment_recurring_profile;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private RecurringProfile TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
    }

    /* JADX INFO: renamed from: setDisabled$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LsetDisabled$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/bpjstku/data/payment/model/response/RecurringProfile;", "p0", "LsetDisabled;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/bpjstku/data/payment/model/response/RecurringProfile;)LsetDisabled;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static setDisabled TuitionPaymentFragmentspecialinlinedviewModeldefault2(RecurringProfile p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            setDisabled setdisabled = new setDisabled();
            Bundle bundle = new Bundle();
            bundle.putParcelable("recurring_participant_profile", p0);
            setdisabled.setArguments(bundle);
            return setdisabled;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        Bundle arguments = getArguments();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = arguments != null ? (RecurringProfile) arguments.getParcelable("recurring_participant_profile") : null;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
        String nominal;
        FragmentRecurringProfileBinding fragmentRecurringProfileBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (fragmentRecurringProfileBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentRecurringProfileBinding = null;
        }
        RecurringProfile recurringProfile = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (Intrinsics.areEqual(recurringProfile != null ? recurringProfile.getKodePaket() : null, "L")) {
            fragmentRecurringProfileBinding.tvTitleProgramValue.setText("JKK-JKM-JHT");
        } else {
            fragmentRecurringProfileBinding.tvTitleProgramValue.setText("JKK-JKM");
        }
        TextView textView = fragmentRecurringProfileBinding.tvTitleNameValue;
        RecurringProfile recurringProfile2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        textView.setText(String.valueOf(recurringProfile2 != null ? recurringProfile2.getNamaLengkap() : null));
        TextView textView2 = fragmentRecurringProfileBinding.tvTitleNikValue;
        RecurringProfile recurringProfile3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        textView2.setText(String.valueOf(recurringProfile3 != null ? recurringProfile3.getNik() : null));
        TextView textView3 = fragmentRecurringProfileBinding.tvTuitionTitleValue;
        RecurringProfile recurringProfile4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        textView3.setText(String.valueOf((recurringProfile4 == null || (nominal = recurringProfile4.getNominal()) == null) ? null : getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(nominal)));
        TextView textView4 = fragmentRecurringProfileBinding.tvRecurringChannelTitleValue;
        RecurringProfile recurringProfile5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        textView4.setText(String.valueOf(recurringProfile5 != null ? recurringProfile5.getTipeRekening() : null));
        TuitionPaymentFragmentbindingInflater1();
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        FragmentRecurringProfileBinding fragmentRecurringProfileBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (fragmentRecurringProfileBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentRecurringProfileBinding = null;
        }
        Button button = fragmentRecurringProfileBinding.btnBack;
        Intrinsics.checkNotNullExpressionValue(button, "");
        button.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: CameraManagerCompatCameraManagerCompatImpl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setDisabled.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (View) obj);
            }
        }));
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from getter */
    public final int getTuitionPaymentFragmentbindingInflater1() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentRecurringProfileBinding fragmentRecurringProfileBindingInflate = FragmentRecurringProfileBinding.inflate(p0, p1, false);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = fragmentRecurringProfileBindingInflate;
        if (fragmentRecurringProfileBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentRecurringProfileBindingInflate = null;
        }
        LinearLayout root = fragmentRecurringProfileBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(setDisabled setdisabled, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        setdisabled.dismiss();
        return Unit.INSTANCE;
    }
}

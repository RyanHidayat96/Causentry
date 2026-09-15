package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bpjstku.R;
import com.bpjstku.databinding.ComplaintFuBottomSheetBinding;
import com.bpjstku.domain.complaint.model.TindakLanjut;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0003R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0016\u0010\u0012\u001a\u00020\u00158\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"LunscheduleDrawable;", "LunregisterMediaButtonEventReceiver;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "Lcom/bpjstku/domain/complaint/model/TindakLanjut;", "Lcom/bpjstku/domain/complaint/model/TindakLanjut;", "Lcom/bpjstku/databinding/ComplaintFuBottomSheetBinding;", "Lcom/bpjstku/databinding/ComplaintFuBottomSheetBinding;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()I", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class unscheduleDrawable extends unregisterMediaButtonEventReceiver {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private TindakLanjut TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TindakLanjut(null, null, null, 7, null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private ComplaintFuBottomSheetBinding b;

    @Override // defpackage.unregisterMediaButtonEventReceiver
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final int getD() {
        return R.layout.complaint_fu_bottom_sheet;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
    }

    /* JADX INFO: renamed from: unscheduleDrawable$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LunscheduleDrawable$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/bpjstku/domain/complaint/model/TindakLanjut;", "p0", "LunscheduleDrawable;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/bpjstku/domain/complaint/model/TindakLanjut;)LunscheduleDrawable;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static unscheduleDrawable TuitionPaymentFragmentbindingInflater1(TindakLanjut p0) {
            unscheduleDrawable unscheduledrawable = new unscheduleDrawable();
            Bundle bundle = new Bundle();
            bundle.putParcelable("tindakLanjut", p0);
            unscheduledrawable.setArguments(bundle);
            return unscheduledrawable;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        ComplaintFuBottomSheetBinding complaintFuBottomSheetBindingInflate = ComplaintFuBottomSheetBinding.inflate(p0, p1, false);
        this.b = complaintFuBottomSheetBindingInflate;
        if (complaintFuBottomSheetBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            complaintFuBottomSheetBindingInflate = null;
        }
        ConstraintLayout root = complaintFuBottomSheetBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        Bundle arguments = getArguments();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = arguments != null ? (TindakLanjut) arguments.getParcelable("tindakLanjut") : null;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        ComplaintFuBottomSheetBinding complaintFuBottomSheetBinding = this.b;
        if (complaintFuBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            complaintFuBottomSheetBinding = null;
        }
        complaintFuBottomSheetBinding.btnBack.setOnClickListener(new View.OnClickListener() { // from class: setHotspotBounds
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                unscheduleDrawable.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, view);
            }
        });
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
        TuitionPaymentFragmentbindingInflater1();
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(unscheduleDrawable unscheduledrawable, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            unscheduledrawable.dismiss();
        } finally {
            ViewPortBuilder.b();
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
        ComplaintFuBottomSheetBinding complaintFuBottomSheetBinding = this.b;
        if (complaintFuBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            complaintFuBottomSheetBinding = null;
        }
        TindakLanjut tindakLanjut = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (tindakLanjut != null) {
            complaintFuBottomSheetBinding.tvAktifitas.setText(tindakLanjut.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            complaintFuBottomSheetBinding.tvStatus.setText(tindakLanjut.TuitionPaymentFragmentbindingInflater1);
            complaintFuBottomSheetBinding.tvContentDesc.setText(tindakLanjut.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    }
}

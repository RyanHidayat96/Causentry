package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bpjstku.R;
import com.bpjstku.databinding.DetailComplaintBottomSheetBinding;
import com.bpjstku.domain.complaint.model.DetailDataTidakSesuai;
import com.bpjstku.domain.complaint.model.DetailPerusahaanBelumTerdaftar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0003R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u0014\u0010\u000e\u001a\u00020\u001d8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001e"}, d2 = {"LsetTintList;", "LunregisterMediaButtonEventReceiver;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "d", "g", "Lcom/bpjstku/domain/complaint/model/DetailDataTidakSesuai;", "Lcom/bpjstku/domain/complaint/model/DetailDataTidakSesuai;", "TuitionPaymentFragmentbindingInflater1", "", "Ljava/lang/String;", "Lcom/bpjstku/domain/complaint/model/DetailPerusahaanBelumTerdaftar;", "Lcom/bpjstku/domain/complaint/model/DetailPerusahaanBelumTerdaftar;", "Lcom/bpjstku/databinding/DetailComplaintBottomSheetBinding;", "Lcom/bpjstku/databinding/DetailComplaintBottomSheetBinding;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class setTintList extends unregisterMediaButtonEventReceiver {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private DetailPerusahaanBelumTerdaftar TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private DetailDataTidakSesuai TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private String b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private DetailComplaintBottomSheetBinding TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    @Override // defpackage.unregisterMediaButtonEventReceiver
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final int getD() {
        return R.layout.detail_complaint_bottom_sheet;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
    }

    /* JADX INFO: renamed from: setTintList$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LsetTintList$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ setTintList TuitionPaymentFragmentbindingInflater1(DetailDataTidakSesuai detailDataTidakSesuai, String str, DetailPerusahaanBelumTerdaftar detailPerusahaanBelumTerdaftar, int i) {
            if ((i & 1) != 0) {
                detailDataTidakSesuai = null;
            }
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                detailPerusahaanBelumTerdaftar = null;
            }
            setTintList settintlist = new setTintList();
            Bundle bundle = new Bundle();
            bundle.putParcelable("detailDataTidakSesuai", detailDataTidakSesuai);
            bundle.putString("detailDataTidakSesuaiString", str);
            bundle.putParcelable("detailPerusahaanBelumTerdaftar", detailPerusahaanBelumTerdaftar);
            settintlist.setArguments(bundle);
            return settintlist;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        DetailComplaintBottomSheetBinding detailComplaintBottomSheetBindingInflate = DetailComplaintBottomSheetBinding.inflate(p0, p1, false);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = detailComplaintBottomSheetBindingInflate;
        if (detailComplaintBottomSheetBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            detailComplaintBottomSheetBindingInflate = null;
        }
        ConstraintLayout root = detailComplaintBottomSheetBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        DetailComplaintBottomSheetBinding detailComplaintBottomSheetBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (detailComplaintBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            detailComplaintBottomSheetBinding = null;
        }
        detailComplaintBottomSheetBinding.btnBack.setOnClickListener(new View.OnClickListener() { // from class: setTint
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                setTintList.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, view);
            }
        });
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        String string;
        DetailDataTidakSesuai detailDataTidakSesuai;
        DetailPerusahaanBelumTerdaftar detailPerusahaanBelumTerdaftar;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("detailDataTidakSesuaiString")) == null) {
            string = this.b;
        }
        this.b = string;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (detailDataTidakSesuai = (DetailDataTidakSesuai) arguments2.getParcelable("detailDataTidakSesuai")) == null) {
            detailDataTidakSesuai = this.TuitionPaymentFragmentbindingInflater1;
        }
        this.TuitionPaymentFragmentbindingInflater1 = detailDataTidakSesuai;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (detailPerusahaanBelumTerdaftar = (DetailPerusahaanBelumTerdaftar) arguments3.getParcelable("detailPerusahaanBelumTerdaftar")) == null) {
            detailPerusahaanBelumTerdaftar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = detailPerusahaanBelumTerdaftar;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
        TuitionPaymentFragmentbindingInflater1();
        DetailComplaintBottomSheetBinding detailComplaintBottomSheetBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (detailComplaintBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            detailComplaintBottomSheetBinding = null;
        }
        String str = this.b;
        if (str != null) {
            if (str != null) {
                LinearLayout linearLayout = detailComplaintBottomSheetBinding.llStatusAct;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                linearLayout.setVisibility(8);
                LinearLayout linearLayout2 = detailComplaintBottomSheetBinding.llStatusKpj;
                Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
                linearLayout2.setVisibility(8);
                LinearLayout linearLayout3 = detailComplaintBottomSheetBinding.llNotes;
                Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
                linearLayout3.setVisibility(8);
                LinearLayout linearLayout4 = detailComplaintBottomSheetBinding.llNominalAct;
                Intrinsics.checkNotNullExpressionValue(linearLayout4, "");
                linearLayout4.setVisibility(8);
                LinearLayout linearLayout5 = detailComplaintBottomSheetBinding.llEmployee;
                Intrinsics.checkNotNullExpressionValue(linearLayout5, "");
                linearLayout5.setVisibility(8);
                LinearLayout linearLayout6 = detailComplaintBottomSheetBinding.llEmployeeAct;
                Intrinsics.checkNotNullExpressionValue(linearLayout6, "");
                linearLayout6.setVisibility(8);
                TextView textView = detailComplaintBottomSheetBinding.tvDetail;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(0);
                detailComplaintBottomSheetBinding.tvDetail.setText(str);
                return;
            }
            return;
        }
        DetailDataTidakSesuai detailDataTidakSesuai = this.TuitionPaymentFragmentbindingInflater1;
        if (detailDataTidakSesuai != null) {
            if (detailDataTidakSesuai != null) {
                detailComplaintBottomSheetBinding.tvKpjNotes.setText(detailDataTidakSesuai.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                detailComplaintBottomSheetBinding.tvKpjAct.setText(detailDataTidakSesuai.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                detailComplaintBottomSheetBinding.tvNotes.setText(detailDataTidakSesuai.asInterface);
                detailComplaintBottomSheetBinding.tvAmountAct.setText(detailDataTidakSesuai.b);
                detailComplaintBottomSheetBinding.tvTkNotes.setText(detailDataTidakSesuai.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                detailComplaintBottomSheetBinding.tvTkAct.setText(detailDataTidakSesuai.TuitionPaymentFragmentbindingInflater1);
                return;
            }
            return;
        }
        DetailPerusahaanBelumTerdaftar detailPerusahaanBelumTerdaftar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (detailPerusahaanBelumTerdaftar == null || detailPerusahaanBelumTerdaftar == null) {
            return;
        }
        detailComplaintBottomSheetBinding.tvLabelKpjNotes.setText(getString(R.string.hint_company_name));
        detailComplaintBottomSheetBinding.tvKpjNotes.setText(detailPerusahaanBelumTerdaftar.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        detailComplaintBottomSheetBinding.tvLabelKpjAct.setText(getString(R.string.label_company_address));
        detailComplaintBottomSheetBinding.tvKpjAct.setText(detailPerusahaanBelumTerdaftar.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        detailComplaintBottomSheetBinding.tvLabelAmountNotes.setText(getString(R.string.label_lokasi_perusahaan));
        detailComplaintBottomSheetBinding.tvNotes.setText(detailPerusahaanBelumTerdaftar.TuitionPaymentFragmentbindingInflater1);
        detailComplaintBottomSheetBinding.tvlabelAmountAct.setVisibility(8);
        detailComplaintBottomSheetBinding.tvAmountAct.setVisibility(8);
        detailComplaintBottomSheetBinding.tvLabelTkNotes.setVisibility(8);
        detailComplaintBottomSheetBinding.tvTkNotes.setVisibility(8);
        detailComplaintBottomSheetBinding.tvLabelTkAct.setVisibility(8);
        detailComplaintBottomSheetBinding.tvTkAct.setVisibility(8);
        detailComplaintBottomSheetBinding.tvSemicolon1.setVisibility(8);
        detailComplaintBottomSheetBinding.tvSemicolon2.setVisibility(8);
        detailComplaintBottomSheetBinding.tvSemicolon3.setVisibility(8);
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(setTintList settintlist, View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            settintlist.dismiss();
        } finally {
            ViewPortBuilder.b();
        }
    }
}

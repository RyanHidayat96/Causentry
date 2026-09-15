package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.databinding.ItemScholarEdubenefitBinding;
import com.bpjstku.domain.scholarship.model.ScholarBenefit;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class refreshPreviewSize extends ListAdapter<ScholarBenefit, TuitionPaymentFragmentbindingInflater1> {
    private final Context TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends DiffUtil.ItemCallback<ScholarBenefit> {
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public final /* synthetic */ boolean areContentsTheSame(ScholarBenefit scholarBenefit, ScholarBenefit scholarBenefit2) {
            ScholarBenefit scholarBenefit3 = scholarBenefit;
            ScholarBenefit scholarBenefit4 = scholarBenefit2;
            Intrinsics.checkNotNullParameter(scholarBenefit3, "");
            Intrinsics.checkNotNullParameter(scholarBenefit4, "");
            return Intrinsics.areEqual(scholarBenefit3.b, scholarBenefit4.b);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public final /* synthetic */ boolean areItemsTheSame(ScholarBenefit scholarBenefit, ScholarBenefit scholarBenefit2) {
            ScholarBenefit scholarBenefit3 = scholarBenefit;
            ScholarBenefit scholarBenefit4 = scholarBenefit2;
            Intrinsics.checkNotNullParameter(scholarBenefit3, "");
            Intrinsics.checkNotNullParameter(scholarBenefit4, "");
            return Intrinsics.areEqual(scholarBenefit3.b, scholarBenefit4.b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public refreshPreviewSize(Context context) {
        super(new TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        Intrinsics.checkNotNullParameter(context, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = context;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0063  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String upperCase;
        String string;
        String strSubstring;
        String strSubstring2;
        String strSubstring3;
        String strSubstring4;
        String strSubstring5;
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = (TuitionPaymentFragmentbindingInflater1) viewHolder;
        Intrinsics.checkNotNullParameter(tuitionPaymentFragmentbindingInflater1, "");
        ScholarBenefit scholarBenefit = getCurrentList().get(i);
        Intrinsics.checkNotNullExpressionValue(scholarBenefit, "");
        ScholarBenefit scholarBenefit2 = scholarBenefit;
        Intrinsics.checkNotNullParameter(scholarBenefit2, "");
        ItemScholarEdubenefitBinding itemScholarEdubenefitBinding = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        TextView textView = itemScholarEdubenefitBinding.itemScholarEdubenYear;
        String str = scholarBenefit2.b;
        String str2 = scholarBenefit2.asBinder;
        String strSubstring6 = null;
        if (str2 != null) {
            upperCase = str2.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
        } else {
            upperCase = null;
        }
        if (Intrinsics.areEqual(upperCase, "RAPEL")) {
            String str3 = scholarBenefit2.b;
            String str4 = scholarBenefit2.g;
            if (str4 != null) {
                strSubstring5 = str4.substring(6, 10);
                Intrinsics.checkNotNullExpressionValue(strSubstring5, "");
            } else {
                strSubstring5 = null;
            }
            if (Intrinsics.areEqual(str3, strSubstring5)) {
                string = "";
            } else {
                String str5 = scholarBenefit2.asBinder;
                StringBuilder sb = new StringBuilder(" (");
                sb.append(str5);
                sb.append(")");
                string = sb.toString();
            }
        } else {
            string = "";
        }
        StringBuilder sb2 = new StringBuilder("Tahun : ");
        sb2.append(str);
        sb2.append(string);
        textView.setText(sb2.toString());
        TextView textView2 = itemScholarEdubenefitBinding.itemScholarEdubenTarget;
        String str6 = scholarBenefit2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String upperCase2 = scholarBenefit2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str6);
        sb3.append(" UNTUK ");
        sb3.append(upperCase2);
        textView2.setText(sb3.toString());
        itemScholarEdubenefitBinding.itemScholarEdubenAmount.setText(getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(scholarBenefit2.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
        String str7 = scholarBenefit2.g;
        if (str7 != null) {
            strSubstring = str7.substring(0, 2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        } else {
            strSubstring = null;
        }
        String str8 = scholarBenefit2.g;
        if (str8 != null) {
            strSubstring2 = str8.substring(3, 5);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
        } else {
            strSubstring2 = null;
        }
        String str9 = scholarBenefit2.g;
        if (str9 != null) {
            strSubstring3 = str9.substring(6, 10);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
        } else {
            strSubstring3 = null;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(strSubstring);
        sb4.append("-");
        sb4.append(strSubstring2);
        sb4.append("-");
        sb4.append(strSubstring3);
        String strTuitionPaymentFragmentbindingInflater1 = Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1(sb4.toString());
        TextView textView3 = itemScholarEdubenefitBinding.itemScholarEdubenTanggal;
        String str10 = scholarBenefit2.g;
        if (str10 != null) {
            strSubstring4 = str10.substring(0, 2);
            Intrinsics.checkNotNullExpressionValue(strSubstring4, "");
        } else {
            strSubstring4 = null;
        }
        String str11 = scholarBenefit2.g;
        if (str11 != null) {
            strSubstring6 = str11.substring(6, 10);
            Intrinsics.checkNotNullExpressionValue(strSubstring6, "");
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(strSubstring4);
        sb5.append(" ");
        sb5.append(strTuitionPaymentFragmentbindingInflater1);
        sb5.append(" ");
        sb5.append(strSubstring6);
        textView3.setText(sb5.toString());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemScholarEdubenefitBinding itemScholarEdubenefitBindingInflate = ItemScholarEdubenefitBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemScholarEdubenefitBindingInflate, "");
        return new TuitionPaymentFragmentbindingInflater1(this, itemScholarEdubenefitBindingInflate);
    }

    public final class TuitionPaymentFragmentbindingInflater1 extends RecyclerView.ViewHolder {
        final ItemScholarEdubenefitBinding TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private /* synthetic */ refreshPreviewSize TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TuitionPaymentFragmentbindingInflater1(refreshPreviewSize refreshpreviewsize, ItemScholarEdubenefitBinding itemScholarEdubenefitBinding) {
            super(itemScholarEdubenefitBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemScholarEdubenefitBinding, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = refreshpreviewsize;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = itemScholarEdubenefitBinding;
        }
    }
}

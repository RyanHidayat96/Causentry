package defpackage;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.midtrans.sdk.corekit.core.Logger;
import com.midtrans.sdk.corekit.models.snap.EnabledPayment;
import com.midtrans.sdk.uikit.widgets.DefaultTextView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class selectOtherAspectRatioParentResolutionsWithFovPriority extends RecyclerView.Adapter<TuitionPaymentFragmentspecialinlinedviewModeldefault2> {
    private static final String TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "BankTransferListAdapter";
    private TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentbindingInflater1;
    public List<getChildrenRequiredResolutions> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ArrayList();

    public class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends RecyclerView.ViewHolder {
        public ImageView TuitionPaymentFragmentbindingInflater1;
        public LinearLayout TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        public TextView TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public DefaultTextView TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        public TextView b;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(View view, final TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            super(view);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (TextView) view.findViewById(R.id.text_payment_method_name);
            this.TuitionPaymentFragmentbindingInflater1 = (ImageView) view.findViewById(R.id.img_payment_method_icon);
            this.b = (TextView) view.findViewById(R.id.text_payment_method_description);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (DefaultTextView) view.findViewById(R.id.text_option_unavailable);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (LinearLayout) view.findViewById(R.id.layout_payment_unavailable);
            view.setOnClickListener(new View.OnClickListener() { // from class: selectOtherAspectRatioParentResolutionsWithFovPriority.TuitionPaymentFragmentspecialinlinedviewModeldefault2.4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view2);
                    try {
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        if (tuitionPaymentFragmentspecialinlinedviewModeldefault4 != null) {
                            tuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentspecialinlinedviewModeldefault2.this.getAdapterPosition());
                        }
                    } finally {
                        ViewPortBuilder.b();
                    }
                }
            });
        }
    }

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i);
    }

    public selectOtherAspectRatioParentResolutionsWithFovPriority(TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
        this.TuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (TuitionPaymentFragmentspecialinlinedviewModeldefault2) viewHolder;
        getChildrenRequiredResolutions getchildrenrequiredresolutions = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(i);
        if (getchildrenrequiredresolutions != null) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setText(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(i).TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1.setImageResource(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(i).TuitionPaymentFragmentbindingInflater1);
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.b.setText(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(i).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            String str = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("Bank Item: ");
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(i).TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            Logger.d(str, sb.toString());
            if (TextUtils.isEmpty(getchildrenrequiredresolutions.asInterface) || !getchildrenrequiredresolutions.asInterface.equals(EnabledPayment.STATUS_DOWN)) {
                return;
            }
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.setVisibility(0);
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.itemView.setClickable(false);
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.setVisibility(0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_row_payment_methods, viewGroup, false), this.TuitionPaymentFragmentbindingInflater1);
    }
}

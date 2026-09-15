package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.midtrans.sdk.corekit.models.PaymentMethodsModel;
import com.midtrans.sdk.corekit.models.snap.EnabledPayment;
import com.midtrans.sdk.uikit.widgets.DefaultTextView;
import com.midtrans.sdk.uikit.widgets.FancyButton;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class setCallbacksMessenger extends RecyclerView.Adapter<TuitionPaymentFragmentspecialinlinedviewModeldefault3> {
    private TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentbindingInflater1;
    public ArrayList<PaymentMethodsModel> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        void TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i);
    }

    public class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends RecyclerView.ViewHolder {
        public DefaultTextView TuitionPaymentFragmentbindingInflater1;
        public TextView TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        public LinearLayout TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public TextView TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        public FancyButton asBinder;
        public ImageView b;

        public class TuitionPaymentFragmentbindingInflater1 implements View.OnClickListener {
            private /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;

            public TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (tuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                        tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault3.this.getAdapterPosition());
                    }
                } finally {
                    ViewPortBuilder.b();
                }
            }
        }

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(View view, TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            super(view);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (TextView) view.findViewById(R.id.text_payment_method_name);
            this.b = (ImageView) view.findViewById(R.id.img_payment_method_icon);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (TextView) view.findViewById(R.id.text_payment_method_description);
            this.TuitionPaymentFragmentbindingInflater1 = (DefaultTextView) view.findViewById(R.id.text_option_unavailable);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (LinearLayout) view.findViewById(R.id.layout_payment_unavailable);
            this.asBinder = (FancyButton) view.findViewById(R.id.badge_promo);
            view.setOnClickListener(new TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentspecialinlinedviewModeldefault1));
        }
    }

    public setCallbacksMessenger(TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
        this.TuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ArrayList<>();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = (TuitionPaymentFragmentspecialinlinedviewModeldefault3) viewHolder;
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.b.setImageResource(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(i).getImageId());
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1.setText(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(i).getName());
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3.setText(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(i).getDescription());
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(i).getStatus().equals(EnabledPayment.STATUS_DOWN)) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setVisibility(0);
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.itemView.setClickable(false);
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.setVisibility(0);
        } else {
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setVisibility(8);
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.itemView.setClickable(true);
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.setVisibility(8);
        }
        PaymentMethodsModel paymentMethodsModel = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(i);
        if (paymentMethodsModel == null || !paymentMethodsModel.isHavePromo()) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.asBinder.setVisibility(8);
        } else {
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.asBinder.setVisibility(0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault3(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_row_payment_methods, viewGroup, false), this.TuitionPaymentFragmentbindingInflater1);
    }
}

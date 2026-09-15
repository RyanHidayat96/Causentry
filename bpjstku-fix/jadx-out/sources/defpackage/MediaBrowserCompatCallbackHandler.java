package defpackage;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.midtrans.sdk.corekit.models.snap.ItemDetails;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class MediaBrowserCompatCallbackHandler extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public List<ItemDetails> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends RecyclerView.ViewHolder {
        public TextView TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        public TextView TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public TextView b;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(View view) {
            super(view);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (TextView) view.findViewById(R.id.item_name);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (TextView) view.findViewById(R.id.item_quantity);
            this.b = (TextView) view.findViewById(R.id.item_price);
        }
    }

    public class b extends RecyclerView.ViewHolder {
        public b(View view) {
            super(view);
        }
    }

    public MediaBrowserCompatCallbackHandler(List<ItemDetails> list) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(list);
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault3(List<ItemDetails> list) {
        ArrayList arrayList = new ArrayList();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = arrayList;
        if (list != null) {
            arrayList.addAll(list);
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(0) != null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(0, null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return (i == 0 || this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(i) == null) ? 1002 : 1003;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (getItemViewType(i) != 1003) {
            return;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (TuitionPaymentFragmentspecialinlinedviewModeldefault2) viewHolder;
        ItemDetails itemDetails = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(i);
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setText(itemDetails.getName());
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.setText(itemDetails.getQuantity() == 0 ? "" : String.valueOf(itemDetails.getQuantity()));
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.b.setText(onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault1(viewHolder.itemView.getContext(), itemDetails.getPrice(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
        if (i % 2 != 0) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.itemView.setBackgroundResource(R.color.light_gray);
        }
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.b.setTextColor((TextUtils.isEmpty(itemDetails.getId()) || !(itemDetails.getId().equals("promo_id") || itemDetails.getId().equals("bni_point") || itemDetails.getId().equals("mandiri_point"))) ? ContextCompat.getColor(tuitionPaymentFragmentspecialinlinedviewModeldefault2.itemView.getContext(), R.color.dark_gray) : ContextCompat.getColor(tuitionPaymentFragmentspecialinlinedviewModeldefault2.itemView.getContext(), R.color.promoAmount));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1002) {
            return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.transaction_item_header, viewGroup, false));
        }
        if (i != 1003) {
            return null;
        }
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.transaction_item_body, viewGroup, false));
    }

    public MediaBrowserCompatCallbackHandler(List<ItemDetails> list, String str) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(list);
    }

    public final double b() {
        double price = 0.0d;
        for (ItemDetails itemDetails : this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            if (itemDetails != null) {
                price += itemDetails.getPrice();
            }
        }
        return price;
    }

    public final ItemDetails TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
        for (ItemDetails itemDetails : this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            if (itemDetails != null && itemDetails.getId().equals(str)) {
                return itemDetails;
            }
        }
        return null;
    }
}

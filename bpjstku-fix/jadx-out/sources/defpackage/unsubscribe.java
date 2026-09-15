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
import com.midtrans.sdk.corekit.models.BankType;
import com.midtrans.sdk.corekit.models.SaveCardRequest;
import com.midtrans.sdk.corekit.models.snap.PromoResponse;
import com.midtrans.sdk.corekit.utilities.Utils;
import com.midtrans.sdk.uikit.views.creditcard.saved.SavedCreditCardActivity;
import com.midtrans.sdk.uikit.widgets.AspectRatioImageView;
import java.util.ArrayList;
import ru.rambler.libs.swipe_layout.SwipeLayout;

/* JADX INFO: loaded from: classes.dex */
public final class unsubscribe extends RecyclerView.Adapter<TuitionPaymentFragmentspecialinlinedviewModeldefault3> {
    public TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentbindingInflater1;
    public ArrayList<SaveCardRequest> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private ArrayList<getParentSizesThatAreTooLarge> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private TuitionPaymentFragmentspecialinlinedviewModeldefault2 b;

    public interface TuitionPaymentFragmentbindingInflater1 {
        void TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i);
    }

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        void TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i);
    }

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
    }

    public class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends RecyclerView.ViewHolder {
        public ImageView TuitionPaymentFragmentbindingInflater1;
        public TextView TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        public TextView TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public SwipeLayout TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private TextView f1421a;
        public AspectRatioImageView asInterface;
        public AspectRatioImageView b;
        private LinearLayout g;

        public class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements View.OnClickListener {
            public TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    if (unsubscribe.this.b != null && TuitionPaymentFragmentspecialinlinedviewModeldefault3.this.getAdapterPosition() != -1) {
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 unused = unsubscribe.this.b;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3.this.getAdapterPosition();
                    }
                } finally {
                    ViewPortBuilder.b();
                }
            }
        }

        public class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements View.OnClickListener {
            public TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    if (unsubscribe.this.TuitionPaymentFragmentbindingInflater1 != null && TuitionPaymentFragmentspecialinlinedviewModeldefault3.this.getAdapterPosition() != -1) {
                        unsubscribe.this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(TuitionPaymentFragmentspecialinlinedviewModeldefault3.this.getAdapterPosition());
                    }
                } finally {
                    ViewPortBuilder.b();
                }
            }
        }

        /* JADX INFO: renamed from: unsubscribe$TuitionPaymentFragmentspecialinlinedviewModeldefault3$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: collision with other inner class name */
        public class ViewOnClickListenerC0168TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements View.OnClickListener {
            public ViewOnClickListenerC0168TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    if (unsubscribe.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null && TuitionPaymentFragmentspecialinlinedviewModeldefault3.this.getAdapterPosition() != -1) {
                        unsubscribe.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(TuitionPaymentFragmentspecialinlinedviewModeldefault3.this.getAdapterPosition());
                    }
                } finally {
                    ViewPortBuilder.b();
                }
            }
        }

        public class b implements SwipeLayout.TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        }

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(View view) {
            super(view);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (SwipeLayout) view.findViewById(R.id.lyt_container);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (TextView) view.findViewById(R.id.text_saved_card_name);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (TextView) view.findViewById(R.id.text_saved_card_number);
            this.f1421a = (TextView) view.findViewById(R.id.txt_delete);
            this.TuitionPaymentFragmentbindingInflater1 = (ImageView) view.findViewById(R.id.image_card_type);
            this.b = (AspectRatioImageView) view.findViewById(R.id.image_card_offer);
            this.g = (LinearLayout) view.findViewById(R.id.save_card_main);
            this.asInterface = (AspectRatioImageView) view.findViewById(R.id.bank_logo);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.setOnSwipeListener(new b());
            this.g.setOnClickListener(new ViewOnClickListenerC0168TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            this.f1421a.setOnClickListener(new TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            this.b.setOnClickListener(new TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        }
    }

    public unsubscribe() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ArrayList<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ArrayList<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ArrayList<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ArrayList<>();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        byte b;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = (TuitionPaymentFragmentspecialinlinedviewModeldefault3) viewHolder;
        SaveCardRequest saveCardRequest = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(i);
        String maskedCard = saveCardRequest.getMaskedCard();
        String cardType = Utils.getCardType(maskedCard);
        byte b2 = 0;
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3.setOffset(0);
        cardType.hashCode();
        cardType.hashCode();
        switch (cardType.hashCode()) {
            case -1553624974:
                b = !cardType.equals(Utils.CARD_TYPE_MASTERCARD) ? (byte) -1 : (byte) 0;
                break;
            case 73257:
                b = !cardType.equals(Utils.CARD_TYPE_JCB) ? (byte) -1 : (byte) 1;
                break;
            case 2012639:
                b = !cardType.equals(Utils.CARD_TYPE_AMEX) ? (byte) -1 : (byte) 2;
                break;
            case 2634817:
                b = !cardType.equals(Utils.CARD_TYPE_VISA) ? (byte) -1 : (byte) 3;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.setImageResource(2131231293);
        } else if (b == 1) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.setImageResource(2131231244);
        } else if (b == 2) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.setImageResource(2131231079);
        } else if (b == 3) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.setImageResource(2131231492);
        }
        String strSubstring = maskedCard.substring(0, 4);
        TextView textView = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        StringBuilder sb = new StringBuilder();
        sb.append(cardType);
        sb.append("-");
        sb.append(strSubstring);
        textView.setText(sb.toString());
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1.setText(onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault3(maskedCard));
        ArrayList<getParentSizesThatAreTooLarge> arrayList = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (arrayList != null && !arrayList.isEmpty()) {
            getParentSizesThatAreTooLarge getparentsizesthataretoolarge = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(i);
            if (getparentsizesthataretoolarge != null) {
                PromoResponse promoResponse = getparentsizesthataretoolarge.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            }
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.b.setVisibility(8);
        }
        SavedCreditCardActivity savedCreditCardActivity = (SavedCreditCardActivity) tuitionPaymentFragmentspecialinlinedviewModeldefault3.itemView.getContext();
        if (savedCreditCardActivity != null) {
            String strB = ((filterResolutionsByAspectRatio) savedCreditCardActivity.d).TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(saveCardRequest.getMaskedCard().substring(0, 6));
            if (strB == null || TextUtils.isEmpty(strB)) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface.setImageDrawable(null);
                return;
            }
            strB.hashCode();
            strB.hashCode();
            switch (strB.hashCode()) {
                case -1482248088:
                    if (!strB.equals(BankType.BNI_DEBIT_ONLINE)) {
                        b2 = -1;
                    }
                    break;
                case 97344:
                    b2 = !strB.equals("bca") ? (byte) -1 : (byte) 1;
                    break;
                case 97693:
                    b2 = !strB.equals(BankType.BNI) ? (byte) -1 : (byte) 2;
                    break;
                case 97817:
                    b2 = !strB.equals(BankType.BRI) ? (byte) -1 : (byte) 3;
                    break;
                case 3053691:
                    b2 = !strB.equals(BankType.CIMB) ? (byte) -1 : (byte) 4;
                    break;
                case 3347570:
                    b2 = !strB.equals(BankType.MEGA) ? (byte) -1 : (byte) 5;
                    break;
                case 835352022:
                    b2 = !strB.equals(BankType.MANDIRI) ? (byte) -1 : (byte) 6;
                    break;
                case 845443361:
                    b2 = !strB.equals(BankType.MAYBANK) ? (byte) -1 : (byte) 7;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            switch (b2) {
                case 0:
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface.setImageResource(2131230982);
                    break;
                case 1:
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface.setImageResource(2131230903);
                    break;
                case 2:
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface.setImageResource(2131230982);
                    break;
                case 3:
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface.setImageResource(2131230997);
                    break;
                case 4:
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface.setImageResource(2131231011);
                    break;
                case 5:
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface.setImageResource(R.drawable.ic_mega);
                    break;
                case 6:
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface.setImageResource(2131231594);
                    break;
                case 7:
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface.setImageResource(2131231607);
                    break;
                default:
                    tuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface.setImageDrawable(null);
                    break;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault3(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_row_saved_cards, viewGroup, false));
    }
}

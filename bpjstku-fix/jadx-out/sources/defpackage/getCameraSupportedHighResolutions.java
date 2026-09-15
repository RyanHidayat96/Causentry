package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.bpjstku.R;
import com.midtrans.sdk.corekit.core.Logger;
import com.midtrans.sdk.corekit.core.MidtransSDK;
import com.midtrans.sdk.corekit.core.PaymentType;
import com.midtrans.sdk.uikit.abstracts.BaseActivity;
import com.midtrans.sdk.uikit.widgets.DefaultTextView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getCameraSupportedHighResolutions extends Fragment implements View.OnClickListener {
    private AppCompatButton TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private LinearLayout TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TuitionPaymentFragmentspecialinlinedviewModeldefault2 f919a;
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault1 = PaymentType.BNI_VA;
    private int asInterface = 0;
    private boolean TuitionPaymentFragmentbindingInflater1 = false;
    private int b = 0;

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        if (this.b != 0) {
            Drawable drawable = this.TuitionPaymentFragmentbindingInflater1 ? ContextCompat.getDrawable(getContext(), 2131231194) : ContextCompat.getDrawable(getContext(), 2131231195);
            try {
                drawable.setColorFilter(this.b, PorterDuff.Mode.SRC_IN);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            } catch (RuntimeException unused) {
            }
        }
    }

    public abstract int TuitionPaymentFragmentspecialinlinedviewModeldefault3();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.f919a = (TuitionPaymentFragmentspecialinlinedviewModeldefault2) context;
        } catch (ClassCastException unused) {
            Logger.e("The activity needs to implement interface first.");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
        try {
            if (view.getId() == R.id.instruction_toggle) {
                this.TuitionPaymentFragmentbindingInflater1 = !this.TuitionPaymentFragmentbindingInflater1;
                if (this.f919a != null && getArguments() != null) {
                    getArguments().getInt("instruction.position");
                }
                if (this.TuitionPaymentFragmentbindingInflater1) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setSelected(true);
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.setVisibility(0);
                } else {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setSelected(false);
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.setVisibility(8);
                }
                TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
        } finally {
            ViewPortBuilder.b();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean zEqualsIgnoreCase = true;
        try {
            zEqualsIgnoreCase = true ^ MidtransSDK.getInstance().getMerchantData().getPreference().getOtherVaProcessor().equalsIgnoreCase(PaymentType.BNI_VA);
        } catch (RuntimeException e2) {
            Logger.e(e2.getMessage());
        }
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        this.asInterface = iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 == R.layout.fragment_instruction_alto && !zEqualsIgnoreCase && !(this instanceof reverseRect)) {
            this.asInterface = R.layout.fragment_instruction_alto_bni;
            zEqualsIgnoreCase = !zEqualsIgnoreCase;
        }
        View viewInflate = layoutInflater.inflate(this.asInterface, viewGroup, false);
        if (!zEqualsIgnoreCase) {
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.instruction_bank_code_image);
            DefaultTextView defaultTextView = (DefaultTextView) viewInflate.findViewById(R.id.instruction_bank_code_text);
            int i = this.asInterface;
            if (i == R.layout.fragment_instruction_atm_bersama) {
                imageView.setImageResource(R.drawable.instruction_atm_bersama_4_bni);
                defaultTextView.setText(R.string.instruction_atm_bersama4_bni);
            } else if (i == R.layout.fragment_instruction_prima) {
                imageView.setImageResource(R.drawable.instruction_prima_4_bni);
                defaultTextView.setText(R.string.instruction_prima4_bni);
            }
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (LinearLayout) viewInflate.findViewById(R.id.instruction_layout);
        AppCompatButton appCompatButton = (AppCompatButton) viewInflate.findViewById(R.id.instruction_toggle);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = appCompatButton;
        appCompatButton.setOnClickListener(this);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setText(getString(R.string.payment_instruction, getArguments() != null ? getArguments().getString("instruction.title", "") : ""));
        this.b = ((BaseActivity) getActivity()).b;
        int i2 = ((BaseActivity) getActivity()).TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i2 != 0) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setTextColor(i2);
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f919a = null;
        super.onDestroyView();
    }
}

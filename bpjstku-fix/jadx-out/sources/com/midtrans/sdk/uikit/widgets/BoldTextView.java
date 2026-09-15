package com.midtrans.sdk.uikit.widgets;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.midtrans.sdk.corekit.core.MidtransSDK;

/* JADX INFO: loaded from: classes4.dex */
public class BoldTextView extends AppCompatTextView {
    public BoldTextView(Context context) {
        super(context);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        Typeface typefaceCreateFromAsset;
        MidtransSDK midtransSDK = MidtransSDK.getInstance();
        if (midtransSDK == null || midtransSDK.getBoldText() == null || midtransSDK.getBoldText().isEmpty()) {
            return;
        }
        try {
            typefaceCreateFromAsset = Typeface.createFromAsset(getContext().getAssets(), midtransSDK.getBoldText());
        } catch (RuntimeException e2) {
            e2.printStackTrace();
            typefaceCreateFromAsset = null;
        }
        if (typefaceCreateFromAsset != null) {
            setTypeface(typefaceCreateFromAsset);
        }
    }

    public BoldTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    public BoldTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }
}

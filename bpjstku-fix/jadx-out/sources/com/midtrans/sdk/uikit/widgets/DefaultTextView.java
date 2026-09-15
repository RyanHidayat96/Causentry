package com.midtrans.sdk.uikit.widgets;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.midtrans.sdk.corekit.core.MidtransSDK;

/* JADX INFO: loaded from: classes4.dex */
public class DefaultTextView extends TextViewWithImages {
    public DefaultTextView(Context context) {
        super(context);
        TuitionPaymentFragmentbindingInflater1();
    }

    private void TuitionPaymentFragmentbindingInflater1() {
        Typeface typefaceCreateFromAsset;
        MidtransSDK midtransSDK = MidtransSDK.getInstance();
        if (midtransSDK == null || midtransSDK.getDefaultText() == null || midtransSDK.getDefaultText().isEmpty()) {
            return;
        }
        try {
            typefaceCreateFromAsset = Typeface.createFromAsset(getContext().getAssets(), midtransSDK.getDefaultText());
        } catch (RuntimeException e2) {
            e2.printStackTrace();
            typefaceCreateFromAsset = null;
        }
        if (typefaceCreateFromAsset != null) {
            setTypeface(typefaceCreateFromAsset);
        }
    }

    public DefaultTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TuitionPaymentFragmentbindingInflater1();
    }

    public DefaultTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TuitionPaymentFragmentbindingInflater1();
    }
}

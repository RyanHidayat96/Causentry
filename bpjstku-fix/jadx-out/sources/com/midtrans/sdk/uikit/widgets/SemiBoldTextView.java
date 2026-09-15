package com.midtrans.sdk.uikit.widgets;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.midtrans.sdk.corekit.core.MidtransSDK;

/* JADX INFO: loaded from: classes4.dex */
public class SemiBoldTextView extends AppCompatTextView {
    public SemiBoldTextView(Context context) {
        super(context);
        b();
    }

    private void b() {
        Typeface typefaceCreateFromAsset;
        MidtransSDK midtransSDK = MidtransSDK.getInstance();
        if (midtransSDK == null || midtransSDK.getSemiBoldText() == null || midtransSDK.getSemiBoldText().isEmpty()) {
            return;
        }
        try {
            typefaceCreateFromAsset = Typeface.createFromAsset(getContext().getAssets(), midtransSDK.getSemiBoldText());
        } catch (RuntimeException e2) {
            e2.printStackTrace();
            typefaceCreateFromAsset = null;
        }
        if (typefaceCreateFromAsset != null) {
            setTypeface(typefaceCreateFromAsset);
        }
    }

    public SemiBoldTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public SemiBoldTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }
}

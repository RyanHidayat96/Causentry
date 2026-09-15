package com.midtrans.sdk.uikit.widgets;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes6.dex */
public class CreditCardTextView extends AppCompatTextView {
    public CreditCardTextView(Context context) {
        super(context);
        setTypeface(Typeface.createFromAsset(getContext().getAssets(), "credit_card_font.ttf"));
    }

    public CreditCardTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setTypeface(Typeface.createFromAsset(getContext().getAssets(), "credit_card_font.ttf"));
    }

    public CreditCardTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setTypeface(Typeface.createFromAsset(getContext().getAssets(), "credit_card_font.ttf"));
    }
}

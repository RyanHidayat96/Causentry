package com.midtrans.sdk.uikit.widgets;

import android.content.Context;
import android.text.Spannable;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.midtrans.sdk.corekit.core.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class TextViewWithImages extends AppCompatTextView {
    private static Spannable.Factory TuitionPaymentFragmentspecialinlinedviewModeldefault2 = Spannable.Factory.getInstance();
    private String b;

    public TextViewWithImages(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = "TextViewWithImages";
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        try {
            Context context = getContext();
            Spannable spannableNewSpannable = TuitionPaymentFragmentspecialinlinedviewModeldefault2.newSpannable(charSequence);
            Matcher matcher = Pattern.compile("\\Q[img src=\\E([a-zA-Z0-9_]+?)\\Q/]\\E").matcher(spannableNewSpannable);
            while (matcher.find()) {
                ImageSpan[] imageSpanArr = (ImageSpan[]) spannableNewSpannable.getSpans(matcher.start(), matcher.end(), ImageSpan.class);
                int length = imageSpanArr.length;
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = true;
                        break;
                    }
                    ImageSpan imageSpan = imageSpanArr[i];
                    if (spannableNewSpannable.getSpanStart(imageSpan) < matcher.start() || spannableNewSpannable.getSpanEnd(imageSpan) > matcher.end()) {
                        break;
                    }
                    spannableNewSpannable.removeSpan(imageSpan);
                    i++;
                }
                int identifier = context.getResources().getIdentifier(spannableNewSpannable.subSequence(matcher.start(1), matcher.end(1)).toString().trim(), "drawable", context.getPackageName());
                if (z) {
                    spannableNewSpannable.setSpan(new ImageSpan(context, identifier), matcher.start(), matcher.end(), 33);
                }
            }
            super.setText(spannableNewSpannable, TextView.BufferType.SPANNABLE);
        } catch (RuntimeException e2) {
            String str = this.b;
            StringBuilder sb = new StringBuilder("setText:");
            sb.append(e2.getMessage());
            Logger.e(str, sb.toString());
        }
    }

    public TextViewWithImages(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = "TextViewWithImages";
    }

    public TextViewWithImages(Context context) {
        super(context);
        this.b = "TextViewWithImages";
    }
}

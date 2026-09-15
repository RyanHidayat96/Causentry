package org.sufficientlysecure.htmltextview;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import android.util.AttributeSet;
import defpackage.CardView;
import defpackage.getCardBackgroundColor;
import defpackage.getCardElevation;
import defpackage.getContentPaddingBottom;
import defpackage.getViewPortSize;
import defpackage.setUsingRotationDegrees;
import java.util.Scanner;

/* JADX INFO: loaded from: classes4.dex */
public class HtmlTextView extends JellyBeanSpanFixTextView {
    private setUsingRotationDegrees TuitionPaymentFragmentbindingInflater1;
    private float TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private getCardElevation TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private getViewPortSize TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private boolean b;

    public HtmlTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 24.0f;
        this.b = true;
    }

    public HtmlTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 24.0f;
        this.b = true;
    }

    public HtmlTextView(Context context) {
        super(context);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 24.0f;
        this.b = true;
    }

    public void setHtml(int i) {
        setHtml(i, (Html.ImageGetter) null);
    }

    public void setHtml(String str) {
        setHtml(str, (Html.ImageGetter) null);
    }

    public void setHtml(int i, Html.ImageGetter imageGetter) {
        Scanner scannerUseDelimiter = new Scanner(getContext().getResources().openRawResource(i)).useDelimiter("\\A");
        setHtml(scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : "", imageGetter);
    }

    public void setHtml(String str, Html.ImageGetter imageGetter) {
        Spanned spannedFromHtml;
        getViewPortSize getviewportsize = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        setUsingRotationDegrees setusingrotationdegrees = this.TuitionPaymentFragmentbindingInflater1;
        getCardElevation getcardelevation = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        float f = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        boolean z = this.b;
        CardView cardView = new CardView();
        cardView.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getviewportsize;
        cardView.TuitionPaymentFragmentbindingInflater1 = setusingrotationdegrees;
        cardView.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getcardelevation;
        CardView.TuitionPaymentFragmentbindingInflater1(f);
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = CardView.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str);
        if (z) {
            spannedFromHtml = Html.fromHtml(strTuitionPaymentFragmentspecialinlinedviewModeldefault1, imageGetter, new getContentPaddingBottom(cardView));
            if (spannedFromHtml == null) {
                spannedFromHtml = null;
            } else {
                while (spannedFromHtml.length() > 0 && spannedFromHtml.charAt(spannedFromHtml.length() - 1) == '\n') {
                    spannedFromHtml = (Spanned) spannedFromHtml.subSequence(0, spannedFromHtml.length() - 1);
                }
            }
        } else {
            spannedFromHtml = Html.fromHtml(strTuitionPaymentFragmentspecialinlinedviewModeldefault1, imageGetter, new getContentPaddingBottom(cardView));
        }
        setText(spannedFromHtml);
        if (getCardBackgroundColor.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            getCardBackgroundColor.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new getCardBackgroundColor();
        }
        setMovementMethod(getCardBackgroundColor.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    public void setRemoveTrailingWhiteSpace(boolean z) {
        this.b = z;
    }

    @Deprecated
    public void setRemoveFromHtmlSpace(boolean z) {
        this.b = z;
    }

    public void setClickableTableSpan(getViewPortSize getviewportsize) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getviewportsize;
    }

    public void setDrawTableLinkSpan(setUsingRotationDegrees setusingrotationdegrees) {
        this.TuitionPaymentFragmentbindingInflater1 = setusingrotationdegrees;
    }

    public void setOnClickATagListener(getCardElevation getcardelevation) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getcardelevation;
    }

    public void setListIndentPx(float f) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = f;
    }
}

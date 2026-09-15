package org.sufficientlysecure.htmltextview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcel;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.BulletSpan;

/* JADX INFO: loaded from: classes5.dex */
public class NumberSpan extends BulletSpan {
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public NumberSpan(int i, int i2) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Integer.toString(i2).concat(".");
    }

    @Override // android.text.style.BulletSpan, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        parcel.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // android.text.style.BulletSpan, android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 20;
    }

    @Override // android.text.style.BulletSpan, android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        if (((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint.Style style = paint.getStyle();
            paint.setStyle(Paint.Style.FILL);
            if (canvas.isHardwareAccelerated()) {
                canvas.save();
                canvas.drawText(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, i + i2, i4, paint);
                canvas.restore();
            } else {
                canvas.drawText(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, i + i2, (i3 + i5) / 2.0f, paint);
            }
            paint.setStyle(style);
        }
    }
}

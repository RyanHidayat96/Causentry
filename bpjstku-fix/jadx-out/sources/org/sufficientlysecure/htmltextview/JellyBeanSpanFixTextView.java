package org.sufficientlysecure.htmltextview;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.util.AttributeSet;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class JellyBeanSpanFixTextView extends TextView {

    /* JADX INFO: loaded from: classes5.dex */
    static class TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        public final boolean TuitionPaymentFragmentbindingInflater1;
        public final List<Object> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public final List<Object> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean z, List<Object> list, List<Object> list2) {
            this.TuitionPaymentFragmentbindingInflater1 = z;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = list;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = list2;
        }
    }

    public JellyBeanSpanFixTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public JellyBeanSpanFixTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public JellyBeanSpanFixTextView(Context context) {
        super(context);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        boolean z;
        try {
            super.onMeasure(i, i2);
        } catch (IndexOutOfBoundsException unused) {
            CharSequence text = getText();
            if (text instanceof Spanned) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(spannableStringBuilder, i, i2);
                if (tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1) {
                    Iterator<Object> it = tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.iterator();
                    while (it.hasNext()) {
                        int spanEnd = spannableStringBuilder.getSpanEnd(it.next());
                        spannableStringBuilder.delete(spanEnd, spanEnd + 1);
                        try {
                            setText(spannableStringBuilder);
                            super.onMeasure(i, i2);
                        } catch (IndexOutOfBoundsException unused2) {
                            spannableStringBuilder.insert(spanEnd, " ");
                        }
                    }
                    Iterator<Object> it2 = tuitionPaymentFragmentspecialinlinedviewModeldefault1TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.iterator();
                    loop1: while (true) {
                        z = true;
                        while (it2.hasNext()) {
                            int spanStart = spannableStringBuilder.getSpanStart(it2.next());
                            int i3 = spanStart - 1;
                            spannableStringBuilder.delete(i3, spanStart);
                            try {
                                setText(spannableStringBuilder);
                                super.onMeasure(i, i2);
                                z = false;
                            } catch (IndexOutOfBoundsException unused3) {
                                spannableStringBuilder.insert(i3, " ");
                            }
                        }
                        break loop1;
                    }
                    if (z) {
                        setText(spannableStringBuilder);
                        super.onMeasure(i, i2);
                        return;
                    }
                    return;
                }
                setText(getText().toString());
                super.onMeasure(i, i2);
                return;
            }
            setText(getText().toString());
            super.onMeasure(i, i2);
        }
    }

    private TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentbindingInflater1(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Object.class);
        ArrayList arrayList = new ArrayList(spans.length);
        ArrayList arrayList2 = new ArrayList(spans.length);
        for (Object obj : spans) {
            int spanStart = spannableStringBuilder.getSpanStart(obj);
            int i3 = spanStart - 1;
            if (i3 < 0 || i3 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(i3) != ' ') {
                spannableStringBuilder.insert(spanStart, " ");
                arrayList.add(obj);
            }
            int spanEnd = spannableStringBuilder.getSpanEnd(obj);
            if (spanEnd < 0 || spanEnd >= spannableStringBuilder.length() || spannableStringBuilder.charAt(spanEnd) != ' ') {
                spannableStringBuilder.insert(spanEnd, " ");
                arrayList2.add(obj);
            }
            try {
                continue;
                setText(spannableStringBuilder);
                super.onMeasure(i, i2);
                return new TuitionPaymentFragmentspecialinlinedviewModeldefault1(true, arrayList, arrayList2);
            } catch (IndexOutOfBoundsException unused) {
            }
        }
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault1(false, null, null);
    }
}

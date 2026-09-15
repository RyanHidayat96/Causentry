package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ItemFaqSyariahBinding implements ViewBinding {
    public final TextView answerFaqSyariah;
    public final RelativeLayout expandableLayout;
    public final LinearLayout llFaq;
    public final TextView questionFaqSyariah;
    private final CardView rootView;

    private ItemFaqSyariahBinding(CardView cardView, TextView textView, RelativeLayout relativeLayout, LinearLayout linearLayout, TextView textView2) {
        this.rootView = cardView;
        this.answerFaqSyariah = textView;
        this.expandableLayout = relativeLayout;
        this.llFaq = linearLayout;
        this.questionFaqSyariah = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final CardView getRoot() {
        return this.rootView;
    }

    public static ItemFaqSyariahBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemFaqSyariahBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_faq_syariah, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemFaqSyariahBinding bind(View view) {
        int i = R.id.answerFaqSyariah;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.answerFaqSyariah);
        if (textView != null) {
            i = R.id.expandableLayout;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.expandableLayout);
            if (relativeLayout != null) {
                i = R.id.llFaq;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llFaq);
                if (linearLayout != null) {
                    i = R.id.questionFaqSyariah;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.questionFaqSyariah);
                    if (textView2 != null) {
                        return new ItemFaqSyariahBinding((CardView) view, textView, relativeLayout, linearLayout, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}

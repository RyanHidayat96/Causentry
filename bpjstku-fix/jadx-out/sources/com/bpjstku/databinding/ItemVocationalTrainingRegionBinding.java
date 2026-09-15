package com.bpjstku.databinding;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ItemVocationalTrainingRegionBinding implements ViewBinding {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final ImageView imgTrainingRegionSelected;
    private final ConstraintLayout rootView;
    public final TextView tvTrainingRegion;

    private ItemVocationalTrainingRegionBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        this.rootView = constraintLayout;
        this.imgTrainingRegionSelected = imageView;
        this.tvTrainingRegion = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemVocationalTrainingRegionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemVocationalTrainingRegionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_vocational_training_region, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemVocationalTrainingRegionBinding bind(View view) {
        int i = R.id.imgTrainingRegionSelected;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgTrainingRegionSelected);
        if (imageView != null) {
            i = R.id.tvTrainingRegion;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvTrainingRegion);
            if (textView != null) {
                return new ItemVocationalTrainingRegionBinding((ConstraintLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = TuitionPaymentFragmentbindingInflater1;
        int i2 = i % 5171420;
        TuitionPaymentFragmentbindingInflater1 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboardHidden;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        return i3;
    }
}

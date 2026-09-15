package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.kennyc.view.MultiStateView;

/* JADX INFO: loaded from: classes6.dex */
public final class FragmentLpkProfileBottomSheetBinding implements ViewBinding {
    public final ImageView imgEmail;
    public final ImageView imgLpkAddress;
    public final ImageView imgPhoneNumber;
    public final MultiStateView msvContent;
    private final ConstraintLayout rootView;
    public final TextView tvEmail;
    public final TextView tvLpkAddress;
    public final TextView tvLpkName;
    public final TextView tvPhoneNumber;
    public final TextView tvTitleBottomSheet;

    private FragmentLpkProfileBottomSheetBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, MultiStateView multiStateView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = constraintLayout;
        this.imgEmail = imageView;
        this.imgLpkAddress = imageView2;
        this.imgPhoneNumber = imageView3;
        this.msvContent = multiStateView;
        this.tvEmail = textView;
        this.tvLpkAddress = textView2;
        this.tvLpkName = textView3;
        this.tvPhoneNumber = textView4;
        this.tvTitleBottomSheet = textView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentLpkProfileBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentLpkProfileBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_lpk_profile_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentLpkProfileBottomSheetBinding bind(View view) {
        int i = R.id.imgEmail;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgEmail);
        if (imageView != null) {
            i = R.id.imgLpkAddress;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgLpkAddress);
            if (imageView2 != null) {
                i = R.id.imgPhoneNumber;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgPhoneNumber);
                if (imageView3 != null) {
                    i = R.id.msvContent;
                    MultiStateView multiStateView = (MultiStateView) ViewBindings.findChildViewById(view, R.id.msvContent);
                    if (multiStateView != null) {
                        i = R.id.tvEmail;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvEmail);
                        if (textView != null) {
                            i = R.id.tvLpkAddress;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvLpkAddress);
                            if (textView2 != null) {
                                i = R.id.tvLpkName;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvLpkName);
                                if (textView3 != null) {
                                    i = R.id.tvPhoneNumber;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPhoneNumber);
                                    if (textView4 != null) {
                                        i = R.id.tvTitleBottomSheet;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleBottomSheet);
                                        if (textView5 != null) {
                                            return new FragmentLpkProfileBottomSheetBinding((ConstraintLayout) view, imageView, imageView2, imageView3, multiStateView, textView, textView2, textView3, textView4, textView5);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}

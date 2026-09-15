package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentQueueingBottomSheetBinding implements ViewBinding {
    public final MaterialCardView cardInformasiPengaduan;
    public final MaterialCardView cardPengajuanKlaim;
    public final ImageView ivIconInformasi;
    public final ImageView ivIconKlaim;
    private final LinearLayout rootView;
    public final TextView tvDescInformasi;
    public final TextView tvDescKlaim;
    public final TextView tvQueueingTitle;
    public final TextView tvTitleInformasi;
    public final TextView tvTitleKlaim;

    private FragmentQueueingBottomSheetBinding(LinearLayout linearLayout, MaterialCardView materialCardView, MaterialCardView materialCardView2, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = linearLayout;
        this.cardInformasiPengaduan = materialCardView;
        this.cardPengajuanKlaim = materialCardView2;
        this.ivIconInformasi = imageView;
        this.ivIconKlaim = imageView2;
        this.tvDescInformasi = textView;
        this.tvDescKlaim = textView2;
        this.tvQueueingTitle = textView3;
        this.tvTitleInformasi = textView4;
        this.tvTitleKlaim = textView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentQueueingBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentQueueingBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_queueing_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentQueueingBottomSheetBinding bind(View view) {
        int i = R.id.cardInformasiPengaduan;
        MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cardInformasiPengaduan);
        if (materialCardView != null) {
            i = R.id.cardPengajuanKlaim;
            MaterialCardView materialCardView2 = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cardPengajuanKlaim);
            if (materialCardView2 != null) {
                i = R.id.ivIconInformasi;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ivIconInformasi);
                if (imageView != null) {
                    i = R.id.ivIconKlaim;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ivIconKlaim);
                    if (imageView2 != null) {
                        i = R.id.tvDescInformasi;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvDescInformasi);
                        if (textView != null) {
                            i = R.id.tvDescKlaim;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvDescKlaim);
                            if (textView2 != null) {
                                i = R.id.tvQueueingTitle;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvQueueingTitle);
                                if (textView3 != null) {
                                    i = R.id.tvTitleInformasi;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleInformasi);
                                    if (textView4 != null) {
                                        i = R.id.tvTitleKlaim;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleKlaim);
                                        if (textView5 != null) {
                                            return new FragmentQueueingBottomSheetBinding((LinearLayout) view, materialCardView, materialCardView2, imageView, imageView2, textView, textView2, textView3, textView4, textView5);
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

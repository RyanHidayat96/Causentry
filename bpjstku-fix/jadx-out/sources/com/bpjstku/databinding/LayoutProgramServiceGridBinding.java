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
public final class LayoutProgramServiceGridBinding implements ViewBinding {
    public final MaterialCardView cardJht;
    public final MaterialCardView cardJkk;
    public final MaterialCardView cardJkm;
    public final MaterialCardView cardJkp;
    public final MaterialCardView cardJp;
    public final ImageView imgJht;
    public final ImageView imgJhtStatus;
    public final ImageView imgJkk;
    public final ImageView imgJkkStatus;
    public final ImageView imgJkm;
    public final ImageView imgJkmStatus;
    public final ImageView imgJkp;
    public final ImageView imgJkpStatus;
    public final ImageView imgJp;
    public final ImageView imgJpStatus;
    public final LinearLayout layoutProgramServiceGrid;
    private final LinearLayout rootView;
    public final TextView tvJhtTitle;
    public final TextView tvJkkTitle;
    public final TextView tvJkmTitle;
    public final TextView tvJkpTitle;
    public final TextView tvJpTitle;

    private LayoutProgramServiceGridBinding(LinearLayout linearLayout, MaterialCardView materialCardView, MaterialCardView materialCardView2, MaterialCardView materialCardView3, MaterialCardView materialCardView4, MaterialCardView materialCardView5, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, ImageView imageView9, ImageView imageView10, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = linearLayout;
        this.cardJht = materialCardView;
        this.cardJkk = materialCardView2;
        this.cardJkm = materialCardView3;
        this.cardJkp = materialCardView4;
        this.cardJp = materialCardView5;
        this.imgJht = imageView;
        this.imgJhtStatus = imageView2;
        this.imgJkk = imageView3;
        this.imgJkkStatus = imageView4;
        this.imgJkm = imageView5;
        this.imgJkmStatus = imageView6;
        this.imgJkp = imageView7;
        this.imgJkpStatus = imageView8;
        this.imgJp = imageView9;
        this.imgJpStatus = imageView10;
        this.layoutProgramServiceGrid = linearLayout2;
        this.tvJhtTitle = textView;
        this.tvJkkTitle = textView2;
        this.tvJkmTitle = textView3;
        this.tvJkpTitle = textView4;
        this.tvJpTitle = textView5;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final LinearLayout getRoot() {
        return this.rootView;
    }

    public static LayoutProgramServiceGridBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutProgramServiceGridBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_program_service_grid, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static LayoutProgramServiceGridBinding bind(View view) {
        int i = R.id.cardJht;
        MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cardJht);
        if (materialCardView != null) {
            i = R.id.cardJkk;
            MaterialCardView materialCardView2 = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cardJkk);
            if (materialCardView2 != null) {
                i = R.id.cardJkm;
                MaterialCardView materialCardView3 = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cardJkm);
                if (materialCardView3 != null) {
                    i = R.id.cardJkp;
                    MaterialCardView materialCardView4 = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cardJkp);
                    if (materialCardView4 != null) {
                        i = R.id.cardJp;
                        MaterialCardView materialCardView5 = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cardJp);
                        if (materialCardView5 != null) {
                            i = R.id.imgJht;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgJht);
                            if (imageView != null) {
                                i = R.id.imgJhtStatus;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgJhtStatus);
                                if (imageView2 != null) {
                                    i = R.id.imgJkk;
                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgJkk);
                                    if (imageView3 != null) {
                                        i = R.id.imgJkkStatus;
                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgJkkStatus);
                                        if (imageView4 != null) {
                                            i = R.id.imgJkm;
                                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgJkm);
                                            if (imageView5 != null) {
                                                i = R.id.imgJkmStatus;
                                                ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgJkmStatus);
                                                if (imageView6 != null) {
                                                    i = R.id.imgJkp;
                                                    ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgJkp);
                                                    if (imageView7 != null) {
                                                        i = R.id.imgJkpStatus;
                                                        ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgJkpStatus);
                                                        if (imageView8 != null) {
                                                            i = R.id.imgJp;
                                                            ImageView imageView9 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgJp);
                                                            if (imageView9 != null) {
                                                                i = R.id.imgJpStatus;
                                                                ImageView imageView10 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgJpStatus);
                                                                if (imageView10 != null) {
                                                                    LinearLayout linearLayout = (LinearLayout) view;
                                                                    i = R.id.tvJhtTitle;
                                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvJhtTitle);
                                                                    if (textView != null) {
                                                                        i = R.id.tvJkkTitle;
                                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvJkkTitle);
                                                                        if (textView2 != null) {
                                                                            i = R.id.tvJkmTitle;
                                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvJkmTitle);
                                                                            if (textView3 != null) {
                                                                                i = R.id.tvJkpTitle;
                                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvJkpTitle);
                                                                                if (textView4 != null) {
                                                                                    i = R.id.tvJpTitle;
                                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvJpTitle);
                                                                                    if (textView5 != null) {
                                                                                        return new LayoutProgramServiceGridBinding(linearLayout, materialCardView, materialCardView2, materialCardView3, materialCardView4, materialCardView5, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10, linearLayout, textView, textView2, textView3, textView4, textView5);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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

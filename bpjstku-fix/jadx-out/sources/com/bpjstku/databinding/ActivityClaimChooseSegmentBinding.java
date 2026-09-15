package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityClaimChooseSegmentBinding implements ViewBinding {
    public final Group groupIndonesianMigrantWorker;
    public final Group groupNonSalariedWorker;
    public final Group groupSalariedWorker;
    public final ImageView imgArrowIndonesianMigrantWorker;
    public final ImageView imgArrowNonSalariedWorker;
    public final ImageView imgArrowSalariedWorker;
    public final ImageView imgIndonesianMigrantWorker;
    public final ImageView imgMemberBpu;
    public final ImageView imgMemberPmi;
    public final ImageView imgMemberPu;
    public final ImageView imgNonSalariedWorker;
    public final ImageView imgSalariedWorker;
    public final LayoutToolbarBinding layoutToolbar;
    private final LinearLayout rootView;
    public final TextView tvChooseParticipant;
    public final TextView tvIndonesianMigrantWorker;
    public final TextView tvNonSalariedWorker;
    public final TextView tvSalariedWorker;

    private ActivityClaimChooseSegmentBinding(LinearLayout linearLayout, Group group, Group group2, Group group3, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, ImageView imageView9, LayoutToolbarBinding layoutToolbarBinding, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = linearLayout;
        this.groupIndonesianMigrantWorker = group;
        this.groupNonSalariedWorker = group2;
        this.groupSalariedWorker = group3;
        this.imgArrowIndonesianMigrantWorker = imageView;
        this.imgArrowNonSalariedWorker = imageView2;
        this.imgArrowSalariedWorker = imageView3;
        this.imgIndonesianMigrantWorker = imageView4;
        this.imgMemberBpu = imageView5;
        this.imgMemberPmi = imageView6;
        this.imgMemberPu = imageView7;
        this.imgNonSalariedWorker = imageView8;
        this.imgSalariedWorker = imageView9;
        this.layoutToolbar = layoutToolbarBinding;
        this.tvChooseParticipant = textView;
        this.tvIndonesianMigrantWorker = textView2;
        this.tvNonSalariedWorker = textView3;
        this.tvSalariedWorker = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final LinearLayout getRoot() {
        return this.rootView;
    }

    public static ActivityClaimChooseSegmentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityClaimChooseSegmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_claim_choose_segment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityClaimChooseSegmentBinding bind(View view) {
        int i = R.id.groupIndonesianMigrantWorker;
        Group group = (Group) ViewBindings.findChildViewById(view, R.id.groupIndonesianMigrantWorker);
        if (group != null) {
            i = R.id.groupNonSalariedWorker;
            Group group2 = (Group) ViewBindings.findChildViewById(view, R.id.groupNonSalariedWorker);
            if (group2 != null) {
                i = R.id.groupSalariedWorker;
                Group group3 = (Group) ViewBindings.findChildViewById(view, R.id.groupSalariedWorker);
                if (group3 != null) {
                    i = R.id.imgArrowIndonesianMigrantWorker;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgArrowIndonesianMigrantWorker);
                    if (imageView != null) {
                        i = R.id.imgArrowNonSalariedWorker;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgArrowNonSalariedWorker);
                        if (imageView2 != null) {
                            i = R.id.imgArrowSalariedWorker;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgArrowSalariedWorker);
                            if (imageView3 != null) {
                                i = R.id.imgIndonesianMigrantWorker;
                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgIndonesianMigrantWorker);
                                if (imageView4 != null) {
                                    i = R.id.imgMemberBpu;
                                    ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgMemberBpu);
                                    if (imageView5 != null) {
                                        i = R.id.imgMemberPmi;
                                        ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgMemberPmi);
                                        if (imageView6 != null) {
                                            i = R.id.imgMemberPu;
                                            ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgMemberPu);
                                            if (imageView7 != null) {
                                                i = R.id.imgNonSalariedWorker;
                                                ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgNonSalariedWorker);
                                                if (imageView8 != null) {
                                                    i = R.id.imgSalariedWorker;
                                                    ImageView imageView9 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgSalariedWorker);
                                                    if (imageView9 != null) {
                                                        i = R.id.layout_toolbar;
                                                        View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                                                        if (viewFindChildViewById != null) {
                                                            LayoutToolbarBinding layoutToolbarBindingBind = LayoutToolbarBinding.bind(viewFindChildViewById);
                                                            i = R.id.tvChooseParticipant;
                                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvChooseParticipant);
                                                            if (textView != null) {
                                                                i = R.id.tvIndonesianMigrantWorker;
                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvIndonesianMigrantWorker);
                                                                if (textView2 != null) {
                                                                    i = R.id.tvNonSalariedWorker;
                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNonSalariedWorker);
                                                                    if (textView3 != null) {
                                                                        i = R.id.tvSalariedWorker;
                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvSalariedWorker);
                                                                        if (textView4 != null) {
                                                                            return new ActivityClaimChooseSegmentBinding((LinearLayout) view, group, group2, group3, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, layoutToolbarBindingBind, textView, textView2, textView3, textView4);
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

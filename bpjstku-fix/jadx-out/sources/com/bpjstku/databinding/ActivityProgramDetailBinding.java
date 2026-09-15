package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.bpjstku.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.tabs.TabLayout;
import com.kennyc.view.MultiStateView;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityProgramDetailBinding implements ViewBinding {
    public final AppBarLayout appbarProgramDetail;
    public final CollapsingToolbarLayout collapsingToolbarProgramDetail;
    public final MaterialCardView cvProgramDescription;
    public final ImageView imgProgram;
    public final ImageView imgProgramDetailBackground;
    public final ImageView imgStatusCheck;
    public final LayoutToolbarCenterBinding layoutToolbar;
    public final MultiStateView msvContent;
    private final ConstraintLayout rootView;
    public final TabLayout tabProgramDetail;
    public final TextView tvProgramDescription;
    public final TextView tvProgramTitle;
    public final TextView tvProgramUserStatus;
    public final View viewDivider;
    public final ViewPager vpProgramDetail;

    private ActivityProgramDetailBinding(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, CollapsingToolbarLayout collapsingToolbarLayout, MaterialCardView materialCardView, ImageView imageView, ImageView imageView2, ImageView imageView3, LayoutToolbarCenterBinding layoutToolbarCenterBinding, MultiStateView multiStateView, TabLayout tabLayout, TextView textView, TextView textView2, TextView textView3, View view, ViewPager viewPager) {
        this.rootView = constraintLayout;
        this.appbarProgramDetail = appBarLayout;
        this.collapsingToolbarProgramDetail = collapsingToolbarLayout;
        this.cvProgramDescription = materialCardView;
        this.imgProgram = imageView;
        this.imgProgramDetailBackground = imageView2;
        this.imgStatusCheck = imageView3;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.msvContent = multiStateView;
        this.tabProgramDetail = tabLayout;
        this.tvProgramDescription = textView;
        this.tvProgramTitle = textView2;
        this.tvProgramUserStatus = textView3;
        this.viewDivider = view;
        this.vpProgramDetail = viewPager;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityProgramDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityProgramDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_program_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityProgramDetailBinding bind(View view) {
        int i = R.id.appbarProgramDetail;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, R.id.appbarProgramDetail);
        if (appBarLayout != null) {
            i = R.id.collapsingToolbarProgramDetail;
            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) ViewBindings.findChildViewById(view, R.id.collapsingToolbarProgramDetail);
            if (collapsingToolbarLayout != null) {
                i = R.id.cvProgramDescription;
                MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvProgramDescription);
                if (materialCardView != null) {
                    i = R.id.imgProgram;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgProgram);
                    if (imageView != null) {
                        i = R.id.imgProgramDetailBackground;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgProgramDetailBackground);
                        if (imageView2 != null) {
                            i = R.id.imgStatusCheck;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgStatusCheck);
                            if (imageView3 != null) {
                                i = R.id.layout_toolbar;
                                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                                if (viewFindChildViewById != null) {
                                    LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                                    i = R.id.msvContent;
                                    MultiStateView multiStateView = (MultiStateView) ViewBindings.findChildViewById(view, R.id.msvContent);
                                    if (multiStateView != null) {
                                        i = R.id.tabProgramDetail;
                                        TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, R.id.tabProgramDetail);
                                        if (tabLayout != null) {
                                            i = R.id.tvProgramDescription;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvProgramDescription);
                                            if (textView != null) {
                                                i = R.id.tvProgramTitle;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvProgramTitle);
                                                if (textView2 != null) {
                                                    i = R.id.tvProgramUserStatus;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvProgramUserStatus);
                                                    if (textView3 != null) {
                                                        i = R.id.viewDivider;
                                                        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.viewDivider);
                                                        if (viewFindChildViewById2 != null) {
                                                            i = R.id.vpProgramDetail;
                                                            ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.vpProgramDetail);
                                                            if (viewPager != null) {
                                                                return new ActivityProgramDetailBinding((ConstraintLayout) view, appBarLayout, collapsingToolbarLayout, materialCardView, imageView, imageView2, imageView3, layoutToolbarCenterBindingBind, multiStateView, tabLayout, textView, textView2, textView3, viewFindChildViewById2, viewPager);
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

package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.asksira.loopingviewpager.LoopingViewPager;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.kennyc.view.MultiStateView;
import com.rd.PageIndicatorView;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentHomeBinding implements ViewBinding {
    public final MaterialButton btnOtherProgram;
    public final MaterialButton btnSeeAllPromo;
    public final RelativeLayout containerBanner;
    public final PageIndicatorView dotsIndicatorBanner;
    public final LayoutProgramServiceGridBinding layoutProgramServiceGrid;
    public final LayoutQueueingFeatureButtonBinding layoutQueueingFeature;
    public final LayoutTreatmentNotificationBannerBinding layoutTreatmentNotification;
    public final MultiStateView msvBanner;
    private final NestedScrollView rootView;
    public final RecyclerView rvPrograms;
    public final RecyclerView rvServices;
    public final TextView tvOtherService;
    public final TextView tvPromo;
    public final TextView tvServiceProgram;
    public final LoopingViewPager vpPromoBanner;

    private FragmentHomeBinding(NestedScrollView nestedScrollView, MaterialButton materialButton, MaterialButton materialButton2, RelativeLayout relativeLayout, PageIndicatorView pageIndicatorView, LayoutProgramServiceGridBinding layoutProgramServiceGridBinding, LayoutQueueingFeatureButtonBinding layoutQueueingFeatureButtonBinding, LayoutTreatmentNotificationBannerBinding layoutTreatmentNotificationBannerBinding, MultiStateView multiStateView, RecyclerView recyclerView, RecyclerView recyclerView2, TextView textView, TextView textView2, TextView textView3, LoopingViewPager loopingViewPager) {
        this.rootView = nestedScrollView;
        this.btnOtherProgram = materialButton;
        this.btnSeeAllPromo = materialButton2;
        this.containerBanner = relativeLayout;
        this.dotsIndicatorBanner = pageIndicatorView;
        this.layoutProgramServiceGrid = layoutProgramServiceGridBinding;
        this.layoutQueueingFeature = layoutQueueingFeatureButtonBinding;
        this.layoutTreatmentNotification = layoutTreatmentNotificationBannerBinding;
        this.msvBanner = multiStateView;
        this.rvPrograms = recyclerView;
        this.rvServices = recyclerView2;
        this.tvOtherService = textView;
        this.tvPromo = textView2;
        this.tvServiceProgram = textView3;
        this.vpPromoBanner = loopingViewPager;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final NestedScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentHomeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentHomeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_home, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentHomeBinding bind(View view) {
        int i = R.id.btnOtherProgram;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnOtherProgram);
        if (materialButton != null) {
            i = R.id.btnSeeAllPromo;
            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnSeeAllPromo);
            if (materialButton2 != null) {
                i = R.id.containerBanner;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.containerBanner);
                if (relativeLayout != null) {
                    i = R.id.dotsIndicatorBanner;
                    PageIndicatorView pageIndicatorView = (PageIndicatorView) ViewBindings.findChildViewById(view, R.id.dotsIndicatorBanner);
                    if (pageIndicatorView != null) {
                        i = R.id.layoutProgramServiceGrid;
                        View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layoutProgramServiceGrid);
                        if (viewFindChildViewById != null) {
                            LayoutProgramServiceGridBinding layoutProgramServiceGridBindingBind = LayoutProgramServiceGridBinding.bind(viewFindChildViewById);
                            i = R.id.layoutQueueingFeature;
                            View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.layoutQueueingFeature);
                            if (viewFindChildViewById2 != null) {
                                LayoutQueueingFeatureButtonBinding layoutQueueingFeatureButtonBindingBind = LayoutQueueingFeatureButtonBinding.bind(viewFindChildViewById2);
                                i = R.id.layoutTreatmentNotification;
                                View viewFindChildViewById3 = ViewBindings.findChildViewById(view, R.id.layoutTreatmentNotification);
                                if (viewFindChildViewById3 != null) {
                                    LayoutTreatmentNotificationBannerBinding layoutTreatmentNotificationBannerBindingBind = LayoutTreatmentNotificationBannerBinding.bind(viewFindChildViewById3);
                                    i = R.id.msvBanner;
                                    MultiStateView multiStateView = (MultiStateView) ViewBindings.findChildViewById(view, R.id.msvBanner);
                                    if (multiStateView != null) {
                                        i = R.id.rvPrograms;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvPrograms);
                                        if (recyclerView != null) {
                                            i = R.id.rvServices;
                                            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvServices);
                                            if (recyclerView2 != null) {
                                                i = R.id.tvOtherService;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvOtherService);
                                                if (textView != null) {
                                                    i = R.id.tvPromo;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPromo);
                                                    if (textView2 != null) {
                                                        i = R.id.tvServiceProgram;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvServiceProgram);
                                                        if (textView3 != null) {
                                                            i = R.id.vpPromoBanner;
                                                            LoopingViewPager loopingViewPager = (LoopingViewPager) ViewBindings.findChildViewById(view, R.id.vpPromoBanner);
                                                            if (loopingViewPager != null) {
                                                                return new FragmentHomeBinding((NestedScrollView) view, materialButton, materialButton2, relativeLayout, pageIndicatorView, layoutProgramServiceGridBindingBind, layoutQueueingFeatureButtonBindingBind, layoutTreatmentNotificationBannerBindingBind, multiStateView, recyclerView, recyclerView2, textView, textView2, textView3, loopingViewPager);
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

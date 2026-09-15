package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.bpjstku.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityDetailComplaintHistoryBinding implements ViewBinding {
    public final AppBarLayout appbarNews;
    public final MaterialButton btnBack;
    public final MaterialButton btnDetailComplaint;
    public final CoordinatorLayout container;
    public final ConstraintLayout containerDeskripsiPengaduan;
    public final LayoutToolbarCenterPinnedBinding layoutToolbar;
    public final View line1;
    public final View line2;
    public final View line3;
    public final LinearLayout llTrackingComplaint;
    private final ConstraintLayout rootView;
    public final RecyclerView rvTrackingComplaint;
    public final RecyclerView rvTrackingPre;
    public final TabLayout tabComplaintHistory;
    public final TextView tvDeskripsiPengaduan;
    public final TextView tvIdComplaint;
    public final TextView tvLabelDeskripsiPengaduan;
    public final TextView tvLabelIdComplaint;
    public final TextView tvLabelMemberNumber;
    public final TextView tvLabelNameCompany;
    public final TextView tvMemberNumber;
    public final TextView tvNameCompany;
    public final ViewPager viewPagerComplaint;

    private ActivityDetailComplaintHistoryBinding(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, MaterialButton materialButton, MaterialButton materialButton2, CoordinatorLayout coordinatorLayout, ConstraintLayout constraintLayout2, LayoutToolbarCenterPinnedBinding layoutToolbarCenterPinnedBinding, View view, View view2, View view3, LinearLayout linearLayout, RecyclerView recyclerView, RecyclerView recyclerView2, TabLayout tabLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, ViewPager viewPager) {
        this.rootView = constraintLayout;
        this.appbarNews = appBarLayout;
        this.btnBack = materialButton;
        this.btnDetailComplaint = materialButton2;
        this.container = coordinatorLayout;
        this.containerDeskripsiPengaduan = constraintLayout2;
        this.layoutToolbar = layoutToolbarCenterPinnedBinding;
        this.line1 = view;
        this.line2 = view2;
        this.line3 = view3;
        this.llTrackingComplaint = linearLayout;
        this.rvTrackingComplaint = recyclerView;
        this.rvTrackingPre = recyclerView2;
        this.tabComplaintHistory = tabLayout;
        this.tvDeskripsiPengaduan = textView;
        this.tvIdComplaint = textView2;
        this.tvLabelDeskripsiPengaduan = textView3;
        this.tvLabelIdComplaint = textView4;
        this.tvLabelMemberNumber = textView5;
        this.tvLabelNameCompany = textView6;
        this.tvMemberNumber = textView7;
        this.tvNameCompany = textView8;
        this.viewPagerComplaint = viewPager;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityDetailComplaintHistoryBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityDetailComplaintHistoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_detail_complaint_history, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityDetailComplaintHistoryBinding bind(View view) {
        int i = R.id.appbarNews;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, R.id.appbarNews);
        if (appBarLayout != null) {
            i = R.id.btnBack;
            MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnBack);
            if (materialButton != null) {
                i = R.id.btnDetailComplaint;
                MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnDetailComplaint);
                if (materialButton2 != null) {
                    i = R.id.container;
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, R.id.container);
                    if (coordinatorLayout != null) {
                        i = R.id.containerDeskripsiPengaduan;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.containerDeskripsiPengaduan);
                        if (constraintLayout != null) {
                            i = R.id.layout_toolbar;
                            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                            if (viewFindChildViewById != null) {
                                LayoutToolbarCenterPinnedBinding layoutToolbarCenterPinnedBindingBind = LayoutToolbarCenterPinnedBinding.bind(viewFindChildViewById);
                                i = R.id.line1;
                                View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.line1);
                                if (viewFindChildViewById2 != null) {
                                    i = R.id.line2;
                                    View viewFindChildViewById3 = ViewBindings.findChildViewById(view, R.id.line2);
                                    if (viewFindChildViewById3 != null) {
                                        i = R.id.line3;
                                        View viewFindChildViewById4 = ViewBindings.findChildViewById(view, R.id.line3);
                                        if (viewFindChildViewById4 != null) {
                                            i = R.id.llTrackingComplaint;
                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llTrackingComplaint);
                                            if (linearLayout != null) {
                                                i = R.id.rvTrackingComplaint;
                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvTrackingComplaint);
                                                if (recyclerView != null) {
                                                    i = R.id.rvTrackingPre;
                                                    RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvTrackingPre);
                                                    if (recyclerView2 != null) {
                                                        i = R.id.tabComplaintHistory;
                                                        TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, R.id.tabComplaintHistory);
                                                        if (tabLayout != null) {
                                                            i = R.id.tvDeskripsiPengaduan;
                                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvDeskripsiPengaduan);
                                                            if (textView != null) {
                                                                i = R.id.tvIdComplaint;
                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvIdComplaint);
                                                                if (textView2 != null) {
                                                                    i = R.id.tvLabelDeskripsiPengaduan;
                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvLabelDeskripsiPengaduan);
                                                                    if (textView3 != null) {
                                                                        i = R.id.tvLabelIdComplaint;
                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvLabelIdComplaint);
                                                                        if (textView4 != null) {
                                                                            i = R.id.tvLabelMemberNumber;
                                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvLabelMemberNumber);
                                                                            if (textView5 != null) {
                                                                                i = R.id.tvLabelNameCompany;
                                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvLabelNameCompany);
                                                                                if (textView6 != null) {
                                                                                    i = R.id.tvMemberNumber;
                                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tvMemberNumber);
                                                                                    if (textView7 != null) {
                                                                                        i = R.id.tvNameCompany;
                                                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNameCompany);
                                                                                        if (textView8 != null) {
                                                                                            i = R.id.viewPagerComplaint;
                                                                                            ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.viewPagerComplaint);
                                                                                            if (viewPager != null) {
                                                                                                return new ActivityDetailComplaintHistoryBinding((ConstraintLayout) view, appBarLayout, materialButton, materialButton2, coordinatorLayout, constraintLayout, layoutToolbarCenterPinnedBindingBind, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, linearLayout, recyclerView, recyclerView2, tabLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, viewPager);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}

package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityMainBinding implements ViewBinding {
    public static int TuitionPaymentFragmentbindingInflater1 = 968626386;
    public final BottomNavigationView bnvMain;
    public final ImageView imgBackground;
    public final LayoutMainToolbarBinding layoutMainToolbar;
    public final FrameLayout mainContainer;
    public final ConstraintLayout rootConstraint;
    private final ConstraintLayout rootView;

    private ActivityMainBinding(ConstraintLayout constraintLayout, BottomNavigationView bottomNavigationView, ImageView imageView, LayoutMainToolbarBinding layoutMainToolbarBinding, FrameLayout frameLayout, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.bnvMain = bottomNavigationView;
        this.imgBackground = imageView;
        this.layoutMainToolbar = layoutMainToolbarBinding;
        this.mainContainer = frameLayout;
        this.rootConstraint = constraintLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityMainBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityMainBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_main, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityMainBinding bind(View view) {
        int i = R.id.bnvMain;
        BottomNavigationView bottomNavigationView = (BottomNavigationView) ViewBindings.findChildViewById(view, R.id.bnvMain);
        if (bottomNavigationView != null) {
            i = R.id.imgBackground;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgBackground);
            if (imageView != null) {
                i = R.id.layoutMainToolbar;
                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layoutMainToolbar);
                if (viewFindChildViewById != null) {
                    LayoutMainToolbarBinding layoutMainToolbarBindingBind = LayoutMainToolbarBinding.bind(viewFindChildViewById);
                    i = R.id.mainContainer;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.mainContainer);
                    if (frameLayout != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        return new ActivityMainBinding(constraintLayout, bottomNavigationView, imageView, layoutMainToolbarBindingBind, frameLayout, constraintLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}

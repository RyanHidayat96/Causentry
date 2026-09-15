package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.appbar.MaterialToolbar;

/* JADX INFO: loaded from: classes3.dex */
public final class LayoutMainToolbarBinding implements ViewBinding {
    public final ImageView btnEWallet;
    public final ImageView btnNotificationMenu;
    public final ImageView imgLogo;
    public final ImageView imgUnreadIndicator;
    private final MaterialToolbar rootView;
    public final MaterialToolbar toolbar;

    private LayoutMainToolbarBinding(MaterialToolbar materialToolbar, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, MaterialToolbar materialToolbar2) {
        this.rootView = materialToolbar;
        this.btnEWallet = imageView;
        this.btnNotificationMenu = imageView2;
        this.imgLogo = imageView3;
        this.imgUnreadIndicator = imageView4;
        this.toolbar = materialToolbar2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final MaterialToolbar getRoot() {
        return this.rootView;
    }

    public static LayoutMainToolbarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutMainToolbarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_main_toolbar, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static LayoutMainToolbarBinding bind(View view) {
        int i = R.id.btnEWallet;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.btnEWallet);
        if (imageView != null) {
            i = R.id.btnNotificationMenu;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.btnNotificationMenu);
            if (imageView2 != null) {
                i = R.id.imgLogo;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgLogo);
                if (imageView3 != null) {
                    i = R.id.imgUnreadIndicator;
                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgUnreadIndicator);
                    if (imageView4 != null) {
                        MaterialToolbar materialToolbar = (MaterialToolbar) view;
                        return new LayoutMainToolbarBinding(materialToolbar, imageView, imageView2, imageView3, imageView4, materialToolbar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}

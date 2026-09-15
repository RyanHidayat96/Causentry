package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ItemNotificationBinding implements ViewBinding {
    public final AppCompatImageView imgNotification;
    public final ImageView imgUnreadIndicator;
    private final ConstraintLayout rootView;
    public final AppCompatTextView tvNotificationTime;
    public final AppCompatTextView tvTitleNotification;
    public final View viewUnreadIndicator;

    private ItemNotificationBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, ImageView imageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, View view) {
        this.rootView = constraintLayout;
        this.imgNotification = appCompatImageView;
        this.imgUnreadIndicator = imageView;
        this.tvNotificationTime = appCompatTextView;
        this.tvTitleNotification = appCompatTextView2;
        this.viewUnreadIndicator = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemNotificationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemNotificationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_notification, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ItemNotificationBinding bind(View view) {
        int i = R.id.imgNotification;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgNotification);
        if (appCompatImageView != null) {
            i = R.id.imgUnreadIndicator;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgUnreadIndicator);
            if (imageView != null) {
                i = R.id.tvNotificationTime;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvNotificationTime);
                if (appCompatTextView != null) {
                    i = R.id.tvTitleNotification;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvTitleNotification);
                    if (appCompatTextView2 != null) {
                        i = R.id.viewUnreadIndicator;
                        View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.viewUnreadIndicator);
                        if (viewFindChildViewById != null) {
                            return new ItemNotificationBinding((ConstraintLayout) view, appCompatImageView, imageView, appCompatTextView, appCompatTextView2, viewFindChildViewById);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}

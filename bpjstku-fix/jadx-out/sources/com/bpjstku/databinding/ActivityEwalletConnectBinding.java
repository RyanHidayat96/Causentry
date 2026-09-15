package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityEwalletConnectBinding implements ViewBinding {
    public final MaterialButton actEwconnectConnect;
    public final ImageView actEwconnectLogo;
    public final TextView actEwconnectPhone;
    public final MaterialButton actEwconnectPhoneChange;
    public final TextView actEwconnectTc;
    public final TextView actEwconnectTitle;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final ScrollView rootView;

    private ActivityEwalletConnectBinding(ScrollView scrollView, MaterialButton materialButton, ImageView imageView, TextView textView, MaterialButton materialButton2, TextView textView2, TextView textView3, LayoutToolbarCenterBinding layoutToolbarCenterBinding) {
        this.rootView = scrollView;
        this.actEwconnectConnect = materialButton;
        this.actEwconnectLogo = imageView;
        this.actEwconnectPhone = textView;
        this.actEwconnectPhoneChange = materialButton2;
        this.actEwconnectTc = textView2;
        this.actEwconnectTitle = textView3;
        this.layoutToolbar = layoutToolbarCenterBinding;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityEwalletConnectBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityEwalletConnectBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_ewallet_connect, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityEwalletConnectBinding bind(View view) {
        int i = R.id.act_ewconnect_connect;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.act_ewconnect_connect);
        if (materialButton != null) {
            i = R.id.act_ewconnect_logo;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.act_ewconnect_logo);
            if (imageView != null) {
                i = R.id.act_ewconnect_phone;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.act_ewconnect_phone);
                if (textView != null) {
                    i = R.id.act_ewconnect_phone_change;
                    MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.act_ewconnect_phone_change);
                    if (materialButton2 != null) {
                        i = R.id.act_ewconnect_tc;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.act_ewconnect_tc);
                        if (textView2 != null) {
                            i = R.id.act_ewconnect_title;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.act_ewconnect_title);
                            if (textView3 != null) {
                                i = R.id.layout_toolbar;
                                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                                if (viewFindChildViewById != null) {
                                    return new ActivityEwalletConnectBinding((ScrollView) view, materialButton, imageView, textView, materialButton2, textView2, textView3, LayoutToolbarCenterBinding.bind(viewFindChildViewById));
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

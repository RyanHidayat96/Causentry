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
public final class FragmentContactBinding implements ViewBinding {
    public final MaterialButton btnCallCareContactCenter;
    public final ImageView imgCallCenter;
    private final ScrollView rootView;
    public final TextView tvOurServiceInfo;
    public final TextView tvWelcomeCareContactCenter;

    private FragmentContactBinding(ScrollView scrollView, MaterialButton materialButton, ImageView imageView, TextView textView, TextView textView2) {
        this.rootView = scrollView;
        this.btnCallCareContactCenter = materialButton;
        this.imgCallCenter = imageView;
        this.tvOurServiceInfo = textView;
        this.tvWelcomeCareContactCenter = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentContactBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentContactBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_contact, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentContactBinding bind(View view) {
        int i = R.id.btnCallCareContactCenter;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnCallCareContactCenter);
        if (materialButton != null) {
            i = R.id.imgCallCenter;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgCallCenter);
            if (imageView != null) {
                i = R.id.tvOurServiceInfo;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvOurServiceInfo);
                if (textView != null) {
                    i = R.id.tvWelcomeCareContactCenter;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvWelcomeCareContactCenter);
                    if (textView2 != null) {
                        return new FragmentContactBinding((ScrollView) view, materialButton, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}

package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes6.dex */
public final class FragmentNotificationDialogBinding implements ViewBinding {
    public final Button btnDeleteNotification;
    public final Button btnOk;
    public final Guideline guideline;
    private final ScrollView rootView;
    public final TextView tvNotificationContent;
    public final TextView tvNotificationTitle;

    private FragmentNotificationDialogBinding(ScrollView scrollView, Button button, Button button2, Guideline guideline, TextView textView, TextView textView2) {
        this.rootView = scrollView;
        this.btnDeleteNotification = button;
        this.btnOk = button2;
        this.guideline = guideline;
        this.tvNotificationContent = textView;
        this.tvNotificationTitle = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentNotificationDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentNotificationDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_notification_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentNotificationDialogBinding bind(View view) {
        int i = R.id.btnDeleteNotification;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnDeleteNotification);
        if (button != null) {
            i = R.id.btnOk;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.btnOk);
            if (button2 != null) {
                i = R.id.guideline;
                Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, R.id.guideline);
                if (guideline != null) {
                    i = R.id.tvNotificationContent;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvNotificationContent);
                    if (textView != null) {
                        i = R.id.tvNotificationTitle;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNotificationTitle);
                        if (textView2 != null) {
                            return new FragmentNotificationDialogBinding((ScrollView) view, button, button2, guideline, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}

package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityChangeTuitionBpuMembershipBinding implements ViewBinding {
    public final Button btnChangeTuitionBpu;
    public final ConstraintLayout containerBenefitDescription;
    public final MaterialCardView cvBenefitProgram;
    public final MaterialCardView cvInfoBpuUpdate;
    public final TextInputEditText edtChoseTuitionRate;
    public final ImageView imgWarning1;
    public final LayoutToolbarCenterBinding layoutToolbar;
    public final AppCompatRadioButton rbProgramJkkJkm;
    public final AppCompatRadioButton rbProgramJkkJkmJht;
    public final RadioGroup rgProgram;
    private final ScrollView rootView;
    public final TextInputLayout tilChoseTuitionRate;
    public final TextView tvChooseProgram;
    public final TextView tvInfoChangeBpuProfile;
    public final TextView tvInfoJht;
    public final TextView tvInfoJkk;
    public final TextView tvInfoJkm;
    public final TextView tvTitleBenefitProgram;
    public final View viewLineJht;
    public final View viewLineJkm;

    private ActivityChangeTuitionBpuMembershipBinding(ScrollView scrollView, Button button, ConstraintLayout constraintLayout, MaterialCardView materialCardView, MaterialCardView materialCardView2, TextInputEditText textInputEditText, ImageView imageView, LayoutToolbarCenterBinding layoutToolbarCenterBinding, AppCompatRadioButton appCompatRadioButton, AppCompatRadioButton appCompatRadioButton2, RadioGroup radioGroup, TextInputLayout textInputLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, View view, View view2) {
        this.rootView = scrollView;
        this.btnChangeTuitionBpu = button;
        this.containerBenefitDescription = constraintLayout;
        this.cvBenefitProgram = materialCardView;
        this.cvInfoBpuUpdate = materialCardView2;
        this.edtChoseTuitionRate = textInputEditText;
        this.imgWarning1 = imageView;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.rbProgramJkkJkm = appCompatRadioButton;
        this.rbProgramJkkJkmJht = appCompatRadioButton2;
        this.rgProgram = radioGroup;
        this.tilChoseTuitionRate = textInputLayout;
        this.tvChooseProgram = textView;
        this.tvInfoChangeBpuProfile = textView2;
        this.tvInfoJht = textView3;
        this.tvInfoJkk = textView4;
        this.tvInfoJkm = textView5;
        this.tvTitleBenefitProgram = textView6;
        this.viewLineJht = view;
        this.viewLineJkm = view2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityChangeTuitionBpuMembershipBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityChangeTuitionBpuMembershipBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_change_tuition_bpu_membership, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityChangeTuitionBpuMembershipBinding bind(View view) {
        int i = R.id.btnChangeTuitionBpu;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnChangeTuitionBpu);
        if (button != null) {
            i = R.id.containerBenefitDescription;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.containerBenefitDescription);
            if (constraintLayout != null) {
                i = R.id.cvBenefitProgram;
                MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvBenefitProgram);
                if (materialCardView != null) {
                    i = R.id.cvInfoBpuUpdate;
                    MaterialCardView materialCardView2 = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvInfoBpuUpdate);
                    if (materialCardView2 != null) {
                        i = R.id.edtChoseTuitionRate;
                        TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtChoseTuitionRate);
                        if (textInputEditText != null) {
                            i = R.id.imgWarning1;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgWarning1);
                            if (imageView != null) {
                                i = R.id.layout_toolbar;
                                View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                                if (viewFindChildViewById != null) {
                                    LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                                    i = R.id.rbProgramJkkJkm;
                                    AppCompatRadioButton appCompatRadioButton = (AppCompatRadioButton) ViewBindings.findChildViewById(view, R.id.rbProgramJkkJkm);
                                    if (appCompatRadioButton != null) {
                                        i = R.id.rbProgramJkkJkmJht;
                                        AppCompatRadioButton appCompatRadioButton2 = (AppCompatRadioButton) ViewBindings.findChildViewById(view, R.id.rbProgramJkkJkmJht);
                                        if (appCompatRadioButton2 != null) {
                                            i = R.id.rgProgram;
                                            RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, R.id.rgProgram);
                                            if (radioGroup != null) {
                                                i = R.id.tilChoseTuitionRate;
                                                TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilChoseTuitionRate);
                                                if (textInputLayout != null) {
                                                    i = R.id.tvChooseProgram;
                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvChooseProgram);
                                                    if (textView != null) {
                                                        i = R.id.tvInfoChangeBpuProfile;
                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvInfoChangeBpuProfile);
                                                        if (textView2 != null) {
                                                            i = R.id.tvInfoJht;
                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvInfoJht);
                                                            if (textView3 != null) {
                                                                i = R.id.tvInfoJkk;
                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvInfoJkk);
                                                                if (textView4 != null) {
                                                                    i = R.id.tvInfoJkm;
                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvInfoJkm);
                                                                    if (textView5 != null) {
                                                                        i = R.id.tvTitleBenefitProgram;
                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleBenefitProgram);
                                                                        if (textView6 != null) {
                                                                            i = R.id.viewLineJht;
                                                                            View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.viewLineJht);
                                                                            if (viewFindChildViewById2 != null) {
                                                                                i = R.id.viewLineJkm;
                                                                                View viewFindChildViewById3 = ViewBindings.findChildViewById(view, R.id.viewLineJkm);
                                                                                if (viewFindChildViewById3 != null) {
                                                                                    return new ActivityChangeTuitionBpuMembershipBinding((ScrollView) view, button, constraintLayout, materialCardView, materialCardView2, textInputEditText, imageView, layoutToolbarCenterBindingBind, appCompatRadioButton, appCompatRadioButton2, radioGroup, textInputLayout, textView, textView2, textView3, textView4, textView5, textView6, viewFindChildViewById2, viewFindChildViewById3);
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

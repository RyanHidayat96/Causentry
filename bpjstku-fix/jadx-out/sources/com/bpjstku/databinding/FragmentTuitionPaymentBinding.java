package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import com.kennyc.view.MultiStateView;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentTuitionPaymentBinding implements ViewBinding {
    public final ConstraintLayout ContainerPeriodsPayment;
    public final MaterialButton btnPaymentProcess;
    public final ConstraintLayout containerPaymentMethod;
    public final MultiStateView msvContent;
    public final RadioButton rbOneMonthPeriod;
    public final RadioButton rbSixMonthPeriod;
    public final RadioButton rbThreeMonthPeriod;
    public final RadioButton rbTwelveMonthPeriod;
    public final RadioButton rbTwoMonthPeriod;
    public final RadioGroup rgPaymentPeriod;
    private final MultiStateView rootView;
    public final RecyclerView rvListMethodPayment;
    public final NestedScrollView scroll;
    public final TextInputLayout tilIdNumber;
    public final TextView tvInfoAutoDebit;
    public final TextView tvPaymentForLabel;
    public final TextView tvTitleChooseMethodPayment;

    private FragmentTuitionPaymentBinding(MultiStateView multiStateView, ConstraintLayout constraintLayout, MaterialButton materialButton, ConstraintLayout constraintLayout2, MultiStateView multiStateView2, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, RadioButton radioButton4, RadioButton radioButton5, RadioGroup radioGroup, RecyclerView recyclerView, NestedScrollView nestedScrollView, TextInputLayout textInputLayout, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = multiStateView;
        this.ContainerPeriodsPayment = constraintLayout;
        this.btnPaymentProcess = materialButton;
        this.containerPaymentMethod = constraintLayout2;
        this.msvContent = multiStateView2;
        this.rbOneMonthPeriod = radioButton;
        this.rbSixMonthPeriod = radioButton2;
        this.rbThreeMonthPeriod = radioButton3;
        this.rbTwelveMonthPeriod = radioButton4;
        this.rbTwoMonthPeriod = radioButton5;
        this.rgPaymentPeriod = radioGroup;
        this.rvListMethodPayment = recyclerView;
        this.scroll = nestedScrollView;
        this.tilIdNumber = textInputLayout;
        this.tvInfoAutoDebit = textView;
        this.tvPaymentForLabel = textView2;
        this.tvTitleChooseMethodPayment = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final MultiStateView getRoot() {
        return this.rootView;
    }

    public static FragmentTuitionPaymentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentTuitionPaymentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_tuition_payment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentTuitionPaymentBinding bind(View view) {
        int i = R.id.ContainerPeriodsPayment;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.ContainerPeriodsPayment);
        if (constraintLayout != null) {
            i = R.id.btnPaymentProcess;
            MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnPaymentProcess);
            if (materialButton != null) {
                i = R.id.containerPaymentMethod;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.containerPaymentMethod);
                if (constraintLayout2 != null) {
                    MultiStateView multiStateView = (MultiStateView) view;
                    i = R.id.rbOneMonthPeriod;
                    RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, R.id.rbOneMonthPeriod);
                    if (radioButton != null) {
                        i = R.id.rbSixMonthPeriod;
                        RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rbSixMonthPeriod);
                        if (radioButton2 != null) {
                            i = R.id.rbThreeMonthPeriod;
                            RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rbThreeMonthPeriod);
                            if (radioButton3 != null) {
                                i = R.id.rbTwelveMonthPeriod;
                                RadioButton radioButton4 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rbTwelveMonthPeriod);
                                if (radioButton4 != null) {
                                    i = R.id.rbTwoMonthPeriod;
                                    RadioButton radioButton5 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rbTwoMonthPeriod);
                                    if (radioButton5 != null) {
                                        i = R.id.rgPaymentPeriod;
                                        RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, R.id.rgPaymentPeriod);
                                        if (radioGroup != null) {
                                            i = R.id.rvListMethodPayment;
                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvListMethodPayment);
                                            if (recyclerView != null) {
                                                i = R.id.scroll;
                                                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, R.id.scroll);
                                                if (nestedScrollView != null) {
                                                    i = R.id.tilIdNumber;
                                                    TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilIdNumber);
                                                    if (textInputLayout != null) {
                                                        i = R.id.tvInfoAutoDebit;
                                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvInfoAutoDebit);
                                                        if (textView != null) {
                                                            i = R.id.tvPaymentForLabel;
                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPaymentForLabel);
                                                            if (textView2 != null) {
                                                                i = R.id.tvTitleChooseMethodPayment;
                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleChooseMethodPayment);
                                                                if (textView3 != null) {
                                                                    return new FragmentTuitionPaymentBinding(multiStateView, constraintLayout, materialButton, constraintLayout2, multiStateView, radioButton, radioButton2, radioButton3, radioButton4, radioButton5, radioGroup, recyclerView, nestedScrollView, textInputLayout, textView, textView2, textView3);
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

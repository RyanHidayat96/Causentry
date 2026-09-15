package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputLayout;
import com.msa.dateedittext.DateEditText;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityCustomerInformationDirectDebitBinding implements ViewBinding {
    public final Button btnProcess;
    public final DateEditText edtExpiredValue;
    public final EditText edtPhoneNumber;
    public final ImageView imgCategoryPayment;
    public final LinearLayout llTitleAuth;
    private final ScrollView rootView;
    public final TextInputLayout tilEmailAddress;
    public final MaterialCardView tilPhoneNumber;
    public final TextInputLayout tilValueLastFourDigitDebitCard;
    public final TextView tvCustomerInformation;
    public final TextView tvPaymentMethod;
    public final TextView tvPrefix;
    public final TextView tvTitleDebitCardInfo;

    private ActivityCustomerInformationDirectDebitBinding(ScrollView scrollView, Button button, DateEditText dateEditText, EditText editText, ImageView imageView, LinearLayout linearLayout, TextInputLayout textInputLayout, MaterialCardView materialCardView, TextInputLayout textInputLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = scrollView;
        this.btnProcess = button;
        this.edtExpiredValue = dateEditText;
        this.edtPhoneNumber = editText;
        this.imgCategoryPayment = imageView;
        this.llTitleAuth = linearLayout;
        this.tilEmailAddress = textInputLayout;
        this.tilPhoneNumber = materialCardView;
        this.tilValueLastFourDigitDebitCard = textInputLayout2;
        this.tvCustomerInformation = textView;
        this.tvPaymentMethod = textView2;
        this.tvPrefix = textView3;
        this.tvTitleDebitCardInfo = textView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityCustomerInformationDirectDebitBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityCustomerInformationDirectDebitBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_customer_information_direct_debit, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityCustomerInformationDirectDebitBinding bind(View view) {
        int i = R.id.btnProcess;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnProcess);
        if (button != null) {
            i = R.id.edtExpiredValue;
            DateEditText dateEditText = (DateEditText) ViewBindings.findChildViewById(view, R.id.edtExpiredValue);
            if (dateEditText != null) {
                i = R.id.edtPhoneNumber;
                EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.edtPhoneNumber);
                if (editText != null) {
                    i = R.id.imgCategoryPayment;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgCategoryPayment);
                    if (imageView != null) {
                        i = R.id.llTitleAuth;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llTitleAuth);
                        if (linearLayout != null) {
                            i = R.id.tilEmailAddress;
                            TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilEmailAddress);
                            if (textInputLayout != null) {
                                i = R.id.tilPhoneNumber;
                                MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.tilPhoneNumber);
                                if (materialCardView != null) {
                                    i = R.id.tilValueLastFourDigitDebitCard;
                                    TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilValueLastFourDigitDebitCard);
                                    if (textInputLayout2 != null) {
                                        i = R.id.tvCustomerInformation;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvCustomerInformation);
                                        if (textView != null) {
                                            i = R.id.tvPaymentMethod;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPaymentMethod);
                                            if (textView2 != null) {
                                                i = R.id.tvPrefix;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPrefix);
                                                if (textView3 != null) {
                                                    i = R.id.tvTitleDebitCardInfo;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleDebitCardInfo);
                                                    if (textView4 != null) {
                                                        return new ActivityCustomerInformationDirectDebitBinding((ScrollView) view, button, dateEditText, editText, imageView, linearLayout, textInputLayout, materialCardView, textInputLayout2, textView, textView2, textView3, textView4);
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

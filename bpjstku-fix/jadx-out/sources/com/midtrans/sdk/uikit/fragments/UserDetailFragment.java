package com.midtrans.sdk.uikit.fragments;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.bpjstku.R;
import com.google.android.material.textfield.TextInputLayout;
import com.midtrans.sdk.corekit.core.Logger;
import com.midtrans.sdk.corekit.core.MidtransSDK;
import com.midtrans.sdk.corekit.models.CustomerDetails;
import com.midtrans.sdk.uikit.activities.UserDetailsActivity;
import com.midtrans.sdk.uikit.widgets.FancyButton;
import defpackage.ViewPortBuilder;
import defpackage.onConnectionFailed;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public class UserDetailFragment extends Fragment {
    private AppCompatEditText emailEt;
    private TextInputLayout emailTil;
    private TextInputLayout fullNameTil;
    private AppCompatEditText fullnameEt;
    private FancyButton nextBtn;
    private AppCompatEditText phoneEt;
    private TextInputLayout phoneTil;

    public static UserDetailFragment newInstance() {
        return new UserDetailFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void validateSaveData() throws IOException {
        CustomerDetails customerDetails;
        onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getActivity());
        String strTrim = this.fullnameEt.getText().toString().trim();
        String strTrim2 = this.emailEt.getText().toString().trim();
        String strTrim3 = this.phoneEt.getText().toString().trim();
        if (!TextUtils.isEmpty(strTrim2) && !onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(strTrim2)) {
            onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getActivity(), getString(R.string.validation_email_invalid));
            this.emailEt.requestFocus();
            return;
        }
        if (!TextUtils.isEmpty(strTrim3) && (TextUtils.isEmpty(strTrim3) || (strTrim3.length() < 9 && strTrim3.length() > 15))) {
            onConnectionFailed.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getActivity(), getString(R.string.validation_phone_no_invalid));
            this.phoneEt.requestFocus();
            return;
        }
        try {
            customerDetails = MidtransSDK.getInstance().getTransactionRequest().getCustomerDetails();
        } catch (Exception e2) {
            e2.printStackTrace();
            customerDetails = null;
        }
        if (customerDetails == null) {
            customerDetails = new CustomerDetails();
        }
        customerDetails.setFirstName(strTrim);
        customerDetails.setEmail(strTrim2);
        customerDetails.setPhone(strTrim3);
        if (customerDetails.getCustomerIdentifier() == null) {
            customerDetails.setCustomerIdentifier(UUID.randomUUID().toString());
        }
        Logger.i("writting in file");
        UserAddressFragment userAddressFragmentNewInstance = UserAddressFragment.newInstance();
        UserDetailsActivity userDetailsActivity = (UserDetailsActivity) getActivity();
        if (userAddressFragmentNewInstance != null) {
            FragmentTransaction fragmentTransactionBeginTransaction = userDetailsActivity.getSupportFragmentManager().beginTransaction();
            if (MidtransSDK.getInstance().getUIKitCustomSetting() != null && MidtransSDK.getInstance().getUIKitCustomSetting().isEnabledAnimation()) {
                fragmentTransactionBeginTransaction.setCustomAnimations(R.anim.slide_in, R.anim.slide_out, R.anim.slide_in_back, R.anim.slide_out_back);
            }
            fragmentTransactionBeginTransaction.replace(R.id.user_detail_container, userAddressFragmentNewInstance);
            fragmentTransactionBeginTransaction.commit();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_user_detail, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        MidtransSDK midtransSDK = MidtransSDK.getInstance();
        UserDetailsActivity userDetailsActivity = (UserDetailsActivity) getActivity();
        if (userDetailsActivity != null && userDetailsActivity.getSupportActionBar() != null) {
            userDetailsActivity.getSupportActionBar().setTitle(getString(R.string.title_user_details));
        }
        this.fullnameEt = (AppCompatEditText) view.findViewById(R.id.et_full_name);
        this.phoneEt = (AppCompatEditText) view.findViewById(R.id.et_phone);
        this.emailEt = (AppCompatEditText) view.findViewById(R.id.et_email);
        this.fullNameTil = (TextInputLayout) view.findViewById(R.id.full_name_til);
        this.phoneTil = (TextInputLayout) view.findViewById(R.id.phone_til);
        this.emailTil = (TextInputLayout) view.findViewById(R.id.email_til);
        this.nextBtn = (FancyButton) view.findViewById(R.id.btn_next);
        if (midtransSDK != null) {
            if (midtransSDK.getSemiBoldText() != null) {
                this.nextBtn.setCustomTextFont(midtransSDK.getSemiBoldText());
            }
            if (midtransSDK.getColorTheme() != null) {
                if (midtransSDK.getColorTheme().getSecondaryColor() != 0) {
                    try {
                        Field declaredField = TextInputLayout.class.getDeclaredField("mDefaultTextColor");
                        declaredField.setAccessible(true);
                        declaredField.set(this.fullNameTil, new ColorStateList(new int[][]{new int[]{0}}, new int[]{midtransSDK.getColorTheme().getSecondaryColor()}));
                        Field declaredField2 = TextInputLayout.class.getDeclaredField("mFocusedTextColor");
                        declaredField2.setAccessible(true);
                        declaredField2.set(this.fullNameTil, new ColorStateList(new int[][]{new int[]{0}}, new int[]{midtransSDK.getColorTheme().getSecondaryColor()}));
                        this.fullnameEt.setSupportBackgroundTintList(new ColorStateList(new int[][]{new int[]{0}}, new int[]{midtransSDK.getColorTheme().getSecondaryColor()}));
                        Field declaredField3 = TextInputLayout.class.getDeclaredField("mDefaultTextColor");
                        declaredField3.setAccessible(true);
                        declaredField3.set(this.phoneTil, new ColorStateList(new int[][]{new int[]{0}}, new int[]{midtransSDK.getColorTheme().getSecondaryColor()}));
                        Field declaredField4 = TextInputLayout.class.getDeclaredField("mFocusedTextColor");
                        declaredField4.setAccessible(true);
                        declaredField4.set(this.phoneTil, new ColorStateList(new int[][]{new int[]{0}}, new int[]{midtransSDK.getColorTheme().getSecondaryColor()}));
                        this.phoneEt.setSupportBackgroundTintList(new ColorStateList(new int[][]{new int[]{0}}, new int[]{midtransSDK.getColorTheme().getSecondaryColor()}));
                        Field declaredField5 = TextInputLayout.class.getDeclaredField("mDefaultTextColor");
                        declaredField5.setAccessible(true);
                        declaredField5.set(this.emailTil, new ColorStateList(new int[][]{new int[]{0}}, new int[]{midtransSDK.getColorTheme().getSecondaryColor()}));
                        Field declaredField6 = TextInputLayout.class.getDeclaredField("mFocusedTextColor");
                        declaredField6.setAccessible(true);
                        declaredField6.set(this.emailTil, new ColorStateList(new int[][]{new int[]{0}}, new int[]{midtransSDK.getColorTheme().getSecondaryColor()}));
                        this.emailEt.setSupportBackgroundTintList(new ColorStateList(new int[][]{new int[]{0}}, new int[]{midtransSDK.getColorTheme().getSecondaryColor()}));
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                if (midtransSDK.getColorTheme().getPrimaryColor() != 0) {
                    this.nextBtn.setBackgroundColor(midtransSDK.getColorTheme().getPrimaryColor());
                }
            }
        }
        this.nextBtn.setOnClickListener(new View.OnClickListener() { // from class: com.midtrans.sdk.uikit.fragments.UserDetailFragment.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view2);
                try {
                    try {
                        UserDetailFragment.this.validateSaveData();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        super.onViewCreated(view, bundle);
    }
}

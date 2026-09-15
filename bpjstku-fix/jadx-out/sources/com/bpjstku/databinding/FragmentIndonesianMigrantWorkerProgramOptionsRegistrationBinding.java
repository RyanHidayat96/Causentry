package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputLayout;
import com.kennyc.view.MultiStateView;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentIndonesianMigrantWorkerProgramOptionsRegistrationBinding implements ViewBinding {
    public final MaterialButton btnNext;
    public final AppCompatCheckBox cbAgreeTermCondition;
    public final MaterialCardView cvJkkJKM;
    public final MaterialCardView cvJkkJKMJHT;
    public final AppCompatImageView imgChecklistJKKJKM;
    public final AppCompatImageView imgChecklistJKKJKMJHT;
    public final AppCompatImageView imgJKKJKM;
    public final AppCompatImageView imgJKKJKMJHT;
    public final MultiStateView msvPaymentMonth;
    private final ScrollView rootView;
    public final RecyclerView rvPaymentMonth;
    public final TextInputLayout tilChooseBranchOffice;
    public final AppCompatTextView tvBranchOfficeInformation;
    public final AppCompatTextView tvChoosePaymentMonth;
    public final AppCompatTextView tvChoosePaymentPeriod;
    public final AppCompatTextView tvChooseProgram;
    public final AppCompatTextView tvJKKJKM;
    public final AppCompatTextView tvJKKJKMJHT;
    public final AppCompatTextView tvValuePaymentPeriod;

    private FragmentIndonesianMigrantWorkerProgramOptionsRegistrationBinding(ScrollView scrollView, MaterialButton materialButton, AppCompatCheckBox appCompatCheckBox, MaterialCardView materialCardView, MaterialCardView materialCardView2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, MultiStateView multiStateView, RecyclerView recyclerView, TextInputLayout textInputLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, AppCompatTextView appCompatTextView7) {
        this.rootView = scrollView;
        this.btnNext = materialButton;
        this.cbAgreeTermCondition = appCompatCheckBox;
        this.cvJkkJKM = materialCardView;
        this.cvJkkJKMJHT = materialCardView2;
        this.imgChecklistJKKJKM = appCompatImageView;
        this.imgChecklistJKKJKMJHT = appCompatImageView2;
        this.imgJKKJKM = appCompatImageView3;
        this.imgJKKJKMJHT = appCompatImageView4;
        this.msvPaymentMonth = multiStateView;
        this.rvPaymentMonth = recyclerView;
        this.tilChooseBranchOffice = textInputLayout;
        this.tvBranchOfficeInformation = appCompatTextView;
        this.tvChoosePaymentMonth = appCompatTextView2;
        this.tvChoosePaymentPeriod = appCompatTextView3;
        this.tvChooseProgram = appCompatTextView4;
        this.tvJKKJKM = appCompatTextView5;
        this.tvJKKJKMJHT = appCompatTextView6;
        this.tvValuePaymentPeriod = appCompatTextView7;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentIndonesianMigrantWorkerProgramOptionsRegistrationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentIndonesianMigrantWorkerProgramOptionsRegistrationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_indonesian_migrant_worker_program_options_registration, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentIndonesianMigrantWorkerProgramOptionsRegistrationBinding bind(View view) {
        int i = R.id.btnNext;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnNext);
        if (materialButton != null) {
            i = R.id.cbAgreeTermCondition;
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(view, R.id.cbAgreeTermCondition);
            if (appCompatCheckBox != null) {
                i = R.id.cvJkkJKM;
                MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvJkkJKM);
                if (materialCardView != null) {
                    i = R.id.cvJkkJKMJHT;
                    MaterialCardView materialCardView2 = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvJkkJKMJHT);
                    if (materialCardView2 != null) {
                        i = R.id.imgChecklistJKKJKM;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgChecklistJKKJKM);
                        if (appCompatImageView != null) {
                            i = R.id.imgChecklistJKKJKMJHT;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgChecklistJKKJKMJHT);
                            if (appCompatImageView2 != null) {
                                i = R.id.imgJKKJKM;
                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgJKKJKM);
                                if (appCompatImageView3 != null) {
                                    i = R.id.imgJKKJKMJHT;
                                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgJKKJKMJHT);
                                    if (appCompatImageView4 != null) {
                                        i = R.id.msvPaymentMonth;
                                        MultiStateView multiStateView = (MultiStateView) ViewBindings.findChildViewById(view, R.id.msvPaymentMonth);
                                        if (multiStateView != null) {
                                            i = R.id.rvPaymentMonth;
                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvPaymentMonth);
                                            if (recyclerView != null) {
                                                i = R.id.tilChooseBranchOffice;
                                                TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilChooseBranchOffice);
                                                if (textInputLayout != null) {
                                                    i = R.id.tvBranchOfficeInformation;
                                                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvBranchOfficeInformation);
                                                    if (appCompatTextView != null) {
                                                        i = R.id.tvChoosePaymentMonth;
                                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvChoosePaymentMonth);
                                                        if (appCompatTextView2 != null) {
                                                            i = R.id.tvChoosePaymentPeriod;
                                                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvChoosePaymentPeriod);
                                                            if (appCompatTextView3 != null) {
                                                                i = R.id.tvChooseProgram;
                                                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvChooseProgram);
                                                                if (appCompatTextView4 != null) {
                                                                    i = R.id.tvJKKJKM;
                                                                    AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvJKKJKM);
                                                                    if (appCompatTextView5 != null) {
                                                                        i = R.id.tvJKKJKMJHT;
                                                                        AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvJKKJKMJHT);
                                                                        if (appCompatTextView6 != null) {
                                                                            i = R.id.tvValuePaymentPeriod;
                                                                            AppCompatTextView appCompatTextView7 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvValuePaymentPeriod);
                                                                            if (appCompatTextView7 != null) {
                                                                                return new FragmentIndonesianMigrantWorkerProgramOptionsRegistrationBinding((ScrollView) view, materialButton, appCompatCheckBox, materialCardView, materialCardView2, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, multiStateView, recyclerView, textInputLayout, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, appCompatTextView7);
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

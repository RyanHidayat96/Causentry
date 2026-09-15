package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class ActivityNonactiveAutodebetBinding implements ViewBinding {
    public final MaterialButton btnNonactiveAutodebit;
    public final ConstraintLayout containerInfoAutodebet;
    public final ConstraintLayout containerReasonNonactiveAutodebit;
    public final TextInputEditText edtChoseListAutodebet;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final ScrollView rootView;
    public final RecyclerView rvKodeNonaktif;
    public final TextInputLayout tilChoseNonactiveAutodebetParticipant;
    public final TextInputLayout tilReasonNonactiveAutodebet;
    public final TextView tvChannelAutodebet;
    public final TextView tvChannelAutodebetValue;
    public final TextView tvChooseProgram;
    public final TextView tvNoHandphone;
    public final TextView tvNoHandphoneValue;
    public final TextView tvNotesNonactiveAutodebet;
    public final TextView tvTitleInfoAutodebet;
    public final TextView tvTitleInfoNama;
    public final TextView tvTitleInfoNamaValue;
    public final TextView tvTitleInfoNik;
    public final TextView tvTitleInfoNikValue;
    public final TextView tvTitleInfoTuition;
    public final TextView tvTitleInfoTuitionValue;

    private ActivityNonactiveAutodebetBinding(ScrollView scrollView, MaterialButton materialButton, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextInputEditText textInputEditText, LayoutToolbarCenterBinding layoutToolbarCenterBinding, RecyclerView recyclerView, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13) {
        this.rootView = scrollView;
        this.btnNonactiveAutodebit = materialButton;
        this.containerInfoAutodebet = constraintLayout;
        this.containerReasonNonactiveAutodebit = constraintLayout2;
        this.edtChoseListAutodebet = textInputEditText;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.rvKodeNonaktif = recyclerView;
        this.tilChoseNonactiveAutodebetParticipant = textInputLayout;
        this.tilReasonNonactiveAutodebet = textInputLayout2;
        this.tvChannelAutodebet = textView;
        this.tvChannelAutodebetValue = textView2;
        this.tvChooseProgram = textView3;
        this.tvNoHandphone = textView4;
        this.tvNoHandphoneValue = textView5;
        this.tvNotesNonactiveAutodebet = textView6;
        this.tvTitleInfoAutodebet = textView7;
        this.tvTitleInfoNama = textView8;
        this.tvTitleInfoNamaValue = textView9;
        this.tvTitleInfoNik = textView10;
        this.tvTitleInfoNikValue = textView11;
        this.tvTitleInfoTuition = textView12;
        this.tvTitleInfoTuitionValue = textView13;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityNonactiveAutodebetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityNonactiveAutodebetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_nonactive_autodebet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityNonactiveAutodebetBinding bind(View view) {
        int i = R.id.btnNonactiveAutodebit;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnNonactiveAutodebit);
        if (materialButton != null) {
            i = R.id.containerInfoAutodebet;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.containerInfoAutodebet);
            if (constraintLayout != null) {
                i = R.id.containerReasonNonactiveAutodebit;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.containerReasonNonactiveAutodebit);
                if (constraintLayout2 != null) {
                    i = R.id.edtChoseListAutodebet;
                    TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtChoseListAutodebet);
                    if (textInputEditText != null) {
                        i = R.id.layout_toolbar;
                        View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                        if (viewFindChildViewById != null) {
                            LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                            i = R.id.rvKodeNonaktif;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvKodeNonaktif);
                            if (recyclerView != null) {
                                i = R.id.tilChoseNonactiveAutodebetParticipant;
                                TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilChoseNonactiveAutodebetParticipant);
                                if (textInputLayout != null) {
                                    i = R.id.tilReasonNonactiveAutodebet;
                                    TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilReasonNonactiveAutodebet);
                                    if (textInputLayout2 != null) {
                                        i = R.id.tvChannelAutodebet;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvChannelAutodebet);
                                        if (textView != null) {
                                            i = R.id.tvChannelAutodebetValue;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvChannelAutodebetValue);
                                            if (textView2 != null) {
                                                i = R.id.tvChooseProgram;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvChooseProgram);
                                                if (textView3 != null) {
                                                    i = R.id.tvNoHandphone;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNoHandphone);
                                                    if (textView4 != null) {
                                                        i = R.id.tvNoHandphoneValue;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNoHandphoneValue);
                                                        if (textView5 != null) {
                                                            i = R.id.tvNotesNonactiveAutodebet;
                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNotesNonactiveAutodebet);
                                                            if (textView6 != null) {
                                                                i = R.id.tvTitleInfoAutodebet;
                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleInfoAutodebet);
                                                                if (textView7 != null) {
                                                                    i = R.id.tvTitleInfoNama;
                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleInfoNama);
                                                                    if (textView8 != null) {
                                                                        i = R.id.tvTitleInfoNamaValue;
                                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleInfoNamaValue);
                                                                        if (textView9 != null) {
                                                                            i = R.id.tvTitleInfoNik;
                                                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleInfoNik);
                                                                            if (textView10 != null) {
                                                                                i = R.id.tvTitleInfoNikValue;
                                                                                TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleInfoNikValue);
                                                                                if (textView11 != null) {
                                                                                    i = R.id.tvTitleInfoTuition;
                                                                                    TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleInfoTuition);
                                                                                    if (textView12 != null) {
                                                                                        i = R.id.tvTitleInfoTuitionValue;
                                                                                        TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleInfoTuitionValue);
                                                                                        if (textView13 != null) {
                                                                                            return new ActivityNonactiveAutodebetBinding((ScrollView) view, materialButton, constraintLayout, constraintLayout2, textInputEditText, layoutToolbarCenterBindingBind, recyclerView, textInputLayout, textInputLayout2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}

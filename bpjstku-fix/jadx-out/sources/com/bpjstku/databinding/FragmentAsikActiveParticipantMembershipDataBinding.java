package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.kennyc.view.MultiStateView;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentAsikActiveParticipantMembershipDataBinding implements ViewBinding {
    public final MaterialButton btnAddKpj;
    public final MaterialButton btnNo;
    public final MaterialButton btnYes;
    public final MaterialCardView cvInformationKpj2;
    public final MaterialCardView cvReminderMultipleKpj;
    public final TextInputEditText edtBirthDate;
    public final ImageView imgWarning;
    public final ImageView imgWarning2;
    public final LinearLayout kpjContainer;
    public final ConstraintLayout mainContainer;
    public final MultiStateView msvMultipleKpj;
    private final LinearLayout rootView;
    public final RecyclerView rvMultipleKpj;
    public final ScrollView scrollView;
    public final TextInputLayout tilBirthDate;
    public final TextInputLayout tilBirthPlace;
    public final TextInputLayout tilFullName;
    public final TextInputLayout tilIdNumber;
    public final TextInputLayout tilKpj;
    public final TextView tvCorrectDataConfirmation;
    public final TextView tvReminderAddKpj;
    public final TextView tvReminderMultipleKpj;
    public final TextView tvReminderVerifyDataPersonal;
    public final TextView tvTitleInformationKpj;
    public final TextView tvTitleInformationKpj1;
    public final TextView tvTitleInformationKpj1Continue;
    public final TextView tvTitleInformationKpj2;
    public final TextView tvTitleInformationKpj3;
    public final TextView tvTitleInformationKpj7;
    public final TextView tvTitleKpj1;
    public final TextView tvTitleKpj2;
    public final TextView tvTitleKpj3;

    private FragmentAsikActiveParticipantMembershipDataBinding(LinearLayout linearLayout, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, MaterialCardView materialCardView, MaterialCardView materialCardView2, TextInputEditText textInputEditText, ImageView imageView, ImageView imageView2, LinearLayout linearLayout2, ConstraintLayout constraintLayout, MultiStateView multiStateView, RecyclerView recyclerView, ScrollView scrollView, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, TextInputLayout textInputLayout5, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13) {
        this.rootView = linearLayout;
        this.btnAddKpj = materialButton;
        this.btnNo = materialButton2;
        this.btnYes = materialButton3;
        this.cvInformationKpj2 = materialCardView;
        this.cvReminderMultipleKpj = materialCardView2;
        this.edtBirthDate = textInputEditText;
        this.imgWarning = imageView;
        this.imgWarning2 = imageView2;
        this.kpjContainer = linearLayout2;
        this.mainContainer = constraintLayout;
        this.msvMultipleKpj = multiStateView;
        this.rvMultipleKpj = recyclerView;
        this.scrollView = scrollView;
        this.tilBirthDate = textInputLayout;
        this.tilBirthPlace = textInputLayout2;
        this.tilFullName = textInputLayout3;
        this.tilIdNumber = textInputLayout4;
        this.tilKpj = textInputLayout5;
        this.tvCorrectDataConfirmation = textView;
        this.tvReminderAddKpj = textView2;
        this.tvReminderMultipleKpj = textView3;
        this.tvReminderVerifyDataPersonal = textView4;
        this.tvTitleInformationKpj = textView5;
        this.tvTitleInformationKpj1 = textView6;
        this.tvTitleInformationKpj1Continue = textView7;
        this.tvTitleInformationKpj2 = textView8;
        this.tvTitleInformationKpj3 = textView9;
        this.tvTitleInformationKpj7 = textView10;
        this.tvTitleKpj1 = textView11;
        this.tvTitleKpj2 = textView12;
        this.tvTitleKpj3 = textView13;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAsikActiveParticipantMembershipDataBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAsikActiveParticipantMembershipDataBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_asik_active_participant_membership_data, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAsikActiveParticipantMembershipDataBinding bind(View view) {
        int i = R.id.btnAddKpj;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnAddKpj);
        if (materialButton != null) {
            i = R.id.btnNo;
            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnNo);
            if (materialButton2 != null) {
                i = R.id.btnYes;
                MaterialButton materialButton3 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnYes);
                if (materialButton3 != null) {
                    i = R.id.cvInformationKpj2;
                    MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvInformationKpj2);
                    if (materialCardView != null) {
                        i = R.id.cvReminderMultipleKpj;
                        MaterialCardView materialCardView2 = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvReminderMultipleKpj);
                        if (materialCardView2 != null) {
                            i = R.id.edtBirthDate;
                            TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.edtBirthDate);
                            if (textInputEditText != null) {
                                i = R.id.imgWarning;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgWarning);
                                if (imageView != null) {
                                    i = R.id.imgWarning2;
                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgWarning2);
                                    if (imageView2 != null) {
                                        i = R.id.kpjContainer;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.kpjContainer);
                                        if (linearLayout != null) {
                                            i = R.id.mainContainer;
                                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.mainContainer);
                                            if (constraintLayout != null) {
                                                i = R.id.msvMultipleKpj;
                                                MultiStateView multiStateView = (MultiStateView) ViewBindings.findChildViewById(view, R.id.msvMultipleKpj);
                                                if (multiStateView != null) {
                                                    i = R.id.rvMultipleKpj;
                                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvMultipleKpj);
                                                    if (recyclerView != null) {
                                                        i = R.id.scroll_view;
                                                        ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, R.id.scroll_view);
                                                        if (scrollView != null) {
                                                            i = R.id.tilBirthDate;
                                                            TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBirthDate);
                                                            if (textInputLayout != null) {
                                                                i = R.id.tilBirthPlace;
                                                                TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilBirthPlace);
                                                                if (textInputLayout2 != null) {
                                                                    i = R.id.tilFullName;
                                                                    TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilFullName);
                                                                    if (textInputLayout3 != null) {
                                                                        i = R.id.tilIdNumber;
                                                                        TextInputLayout textInputLayout4 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilIdNumber);
                                                                        if (textInputLayout4 != null) {
                                                                            i = R.id.tilKpj;
                                                                            TextInputLayout textInputLayout5 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.tilKpj);
                                                                            if (textInputLayout5 != null) {
                                                                                i = R.id.tvCorrectDataConfirmation;
                                                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvCorrectDataConfirmation);
                                                                                if (textView != null) {
                                                                                    i = R.id.tvReminderAddKpj;
                                                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvReminderAddKpj);
                                                                                    if (textView2 != null) {
                                                                                        i = R.id.tvReminderMultipleKpj;
                                                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvReminderMultipleKpj);
                                                                                        if (textView3 != null) {
                                                                                            i = R.id.tvReminderVerifyDataPersonal;
                                                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvReminderVerifyDataPersonal);
                                                                                            if (textView4 != null) {
                                                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleInformationKpj);
                                                                                                if (textView5 != null) {
                                                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleInformationKpj1);
                                                                                                    if (textView6 != null) {
                                                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleInformationKpj1Continue);
                                                                                                        if (textView7 != null) {
                                                                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleInformationKpj2);
                                                                                                            if (textView8 != null) {
                                                                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleInformationKpj3);
                                                                                                                if (textView9 != null) {
                                                                                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleInformationKpj7);
                                                                                                                    if (textView10 != null) {
                                                                                                                        TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleKpj1);
                                                                                                                        if (textView11 != null) {
                                                                                                                            TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleKpj2);
                                                                                                                            if (textView12 != null) {
                                                                                                                                TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleKpj3);
                                                                                                                                if (textView13 != null) {
                                                                                                                                    return new FragmentAsikActiveParticipantMembershipDataBinding((LinearLayout) view, materialButton, materialButton2, materialButton3, materialCardView, materialCardView2, textInputEditText, imageView, imageView2, linearLayout, constraintLayout, multiStateView, recyclerView, scrollView, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, textInputLayout5, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13);
                                                                                                                                }
                                                                                                                                i = R.id.tvTitleKpj3;
                                                                                                                            } else {
                                                                                                                                i = R.id.tvTitleKpj2;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            i = R.id.tvTitleKpj1;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        i = R.id.tvTitleInformationKpj7;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i = R.id.tvTitleInformationKpj3;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i = R.id.tvTitleInformationKpj2;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = R.id.tvTitleInformationKpj1Continue;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.tvTitleInformationKpj1;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.tvTitleInformationKpj;
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}

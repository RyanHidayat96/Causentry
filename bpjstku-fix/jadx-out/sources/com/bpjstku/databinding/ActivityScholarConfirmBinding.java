package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.bpjstku.util.custom.CircleImageView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityScholarConfirmBinding implements ViewBinding {
    public final MaterialButton btnConfirmation;
    public final MaterialButton btnHistory;
    public final CircleImageView civProfile;
    public final MaterialCardView confirmNextInfo;
    public final TextView confirmNextInfoContent;
    public final TextView confirmNextInfoTitle;
    public final TextView contentBenefitAmount;
    public final TextView contentBenefitEdu;
    public final TextView contentBenefitKpj;
    public final TextView contentBenefitLembaga;
    public final TextView contentBenefitNama;
    public final TextView contentBenefitNik;
    public final TextView contentBenefitYear;
    public final TextView contentConfirmDate;
    public final MaterialCardView contentConfirmStatus1;
    public final MaterialCardView contentConfirmStatus2;
    public final TextView contentConfirmStatusText1;
    public final TextView contentConfirmStatusText2;
    public final RecyclerView contentDocuments;
    public final CardView cvInfoJp;
    public final Group groupScholarConfirm;
    public final Group groupScholarNotConfirm;
    public final ImageView imgBackground;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final ConstraintLayout rootView;
    public final TextView titleBenefitAmount;
    public final TextView titleBenefitEdu;
    public final TextView titleBenefitKpj;
    public final TextView titleBenefitLembaga;
    public final TextView titleBenefitNama;
    public final TextView titleBenefitNik;
    public final TextView titleBenefitYear;
    public final TextView titleConfirmDate;
    public final TextView titleDocuments;
    public final TextView tvNamesLegacy;
    public final TextView tvNotConfirmationJP;

    private ActivityScholarConfirmBinding(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, CircleImageView circleImageView, MaterialCardView materialCardView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, MaterialCardView materialCardView2, MaterialCardView materialCardView3, TextView textView11, TextView textView12, RecyclerView recyclerView, CardView cardView, Group group, Group group2, ImageView imageView, LayoutToolbarCenterBinding layoutToolbarCenterBinding, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, TextView textView19, TextView textView20, TextView textView21, TextView textView22, TextView textView23) {
        this.rootView = constraintLayout;
        this.btnConfirmation = materialButton;
        this.btnHistory = materialButton2;
        this.civProfile = circleImageView;
        this.confirmNextInfo = materialCardView;
        this.confirmNextInfoContent = textView;
        this.confirmNextInfoTitle = textView2;
        this.contentBenefitAmount = textView3;
        this.contentBenefitEdu = textView4;
        this.contentBenefitKpj = textView5;
        this.contentBenefitLembaga = textView6;
        this.contentBenefitNama = textView7;
        this.contentBenefitNik = textView8;
        this.contentBenefitYear = textView9;
        this.contentConfirmDate = textView10;
        this.contentConfirmStatus1 = materialCardView2;
        this.contentConfirmStatus2 = materialCardView3;
        this.contentConfirmStatusText1 = textView11;
        this.contentConfirmStatusText2 = textView12;
        this.contentDocuments = recyclerView;
        this.cvInfoJp = cardView;
        this.groupScholarConfirm = group;
        this.groupScholarNotConfirm = group2;
        this.imgBackground = imageView;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.titleBenefitAmount = textView13;
        this.titleBenefitEdu = textView14;
        this.titleBenefitKpj = textView15;
        this.titleBenefitLembaga = textView16;
        this.titleBenefitNama = textView17;
        this.titleBenefitNik = textView18;
        this.titleBenefitYear = textView19;
        this.titleConfirmDate = textView20;
        this.titleDocuments = textView21;
        this.tvNamesLegacy = textView22;
        this.tvNotConfirmationJP = textView23;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityScholarConfirmBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityScholarConfirmBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_scholar_confirm, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityScholarConfirmBinding bind(View view) {
        int i = R.id.btnConfirmation;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnConfirmation);
        if (materialButton != null) {
            i = R.id.btnHistory;
            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnHistory);
            if (materialButton2 != null) {
                i = R.id.civProfile;
                CircleImageView circleImageView = (CircleImageView) ViewBindings.findChildViewById(view, R.id.civProfile);
                if (circleImageView != null) {
                    i = R.id.confirmNextInfo;
                    MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.confirmNextInfo);
                    if (materialCardView != null) {
                        i = R.id.confirmNextInfoContent;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.confirmNextInfoContent);
                        if (textView != null) {
                            i = R.id.confirmNextInfoTitle;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.confirmNextInfoTitle);
                            if (textView2 != null) {
                                i = R.id.contentBenefitAmount;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.contentBenefitAmount);
                                if (textView3 != null) {
                                    i = R.id.contentBenefitEdu;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.contentBenefitEdu);
                                    if (textView4 != null) {
                                        i = R.id.contentBenefitKpj;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.contentBenefitKpj);
                                        if (textView5 != null) {
                                            i = R.id.contentBenefitLembaga;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.contentBenefitLembaga);
                                            if (textView6 != null) {
                                                i = R.id.contentBenefitNama;
                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.contentBenefitNama);
                                                if (textView7 != null) {
                                                    i = R.id.contentBenefitNik;
                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.contentBenefitNik);
                                                    if (textView8 != null) {
                                                        i = R.id.contentBenefitYear;
                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.contentBenefitYear);
                                                        if (textView9 != null) {
                                                            i = R.id.contentConfirmDate;
                                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.contentConfirmDate);
                                                            if (textView10 != null) {
                                                                i = R.id.contentConfirmStatus1;
                                                                MaterialCardView materialCardView2 = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.contentConfirmStatus1);
                                                                if (materialCardView2 != null) {
                                                                    i = R.id.contentConfirmStatus2;
                                                                    MaterialCardView materialCardView3 = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.contentConfirmStatus2);
                                                                    if (materialCardView3 != null) {
                                                                        i = R.id.contentConfirmStatusText1;
                                                                        TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.contentConfirmStatusText1);
                                                                        if (textView11 != null) {
                                                                            i = R.id.contentConfirmStatusText2;
                                                                            TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.contentConfirmStatusText2);
                                                                            if (textView12 != null) {
                                                                                i = R.id.contentDocuments;
                                                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.contentDocuments);
                                                                                if (recyclerView != null) {
                                                                                    i = R.id.cvInfoJp;
                                                                                    CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.cvInfoJp);
                                                                                    if (cardView != null) {
                                                                                        i = R.id.groupScholarConfirm;
                                                                                        Group group = (Group) ViewBindings.findChildViewById(view, R.id.groupScholarConfirm);
                                                                                        if (group != null) {
                                                                                            i = R.id.groupScholarNotConfirm;
                                                                                            Group group2 = (Group) ViewBindings.findChildViewById(view, R.id.groupScholarNotConfirm);
                                                                                            if (group2 != null) {
                                                                                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgBackground);
                                                                                                if (imageView != null) {
                                                                                                    View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                                                                                                    if (viewFindChildViewById != null) {
                                                                                                        LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                                                                                                        TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.titleBenefitAmount);
                                                                                                        if (textView13 != null) {
                                                                                                            TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.titleBenefitEdu);
                                                                                                            if (textView14 != null) {
                                                                                                                TextView textView15 = (TextView) ViewBindings.findChildViewById(view, R.id.titleBenefitKpj);
                                                                                                                if (textView15 != null) {
                                                                                                                    TextView textView16 = (TextView) ViewBindings.findChildViewById(view, R.id.titleBenefitLembaga);
                                                                                                                    if (textView16 != null) {
                                                                                                                        TextView textView17 = (TextView) ViewBindings.findChildViewById(view, R.id.titleBenefitNama);
                                                                                                                        if (textView17 != null) {
                                                                                                                            TextView textView18 = (TextView) ViewBindings.findChildViewById(view, R.id.titleBenefitNik);
                                                                                                                            if (textView18 != null) {
                                                                                                                                TextView textView19 = (TextView) ViewBindings.findChildViewById(view, R.id.titleBenefitYear);
                                                                                                                                if (textView19 != null) {
                                                                                                                                    TextView textView20 = (TextView) ViewBindings.findChildViewById(view, R.id.titleConfirmDate);
                                                                                                                                    if (textView20 != null) {
                                                                                                                                        TextView textView21 = (TextView) ViewBindings.findChildViewById(view, R.id.titleDocuments);
                                                                                                                                        if (textView21 != null) {
                                                                                                                                            TextView textView22 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNamesLegacy);
                                                                                                                                            if (textView22 != null) {
                                                                                                                                                TextView textView23 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNotConfirmationJP);
                                                                                                                                                if (textView23 != null) {
                                                                                                                                                    return new ActivityScholarConfirmBinding((ConstraintLayout) view, materialButton, materialButton2, circleImageView, materialCardView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, materialCardView2, materialCardView3, textView11, textView12, recyclerView, cardView, group, group2, imageView, layoutToolbarCenterBindingBind, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22, textView23);
                                                                                                                                                }
                                                                                                                                                i = R.id.tvNotConfirmationJP;
                                                                                                                                            } else {
                                                                                                                                                i = R.id.tvNamesLegacy;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            i = R.id.titleDocuments;
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        i = R.id.titleConfirmDate;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    i = R.id.titleBenefitYear;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                i = R.id.titleBenefitNik;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            i = R.id.titleBenefitNama;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        i = R.id.titleBenefitLembaga;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i = R.id.titleBenefitKpj;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i = R.id.titleBenefitEdu;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = R.id.titleBenefitAmount;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.layout_toolbar;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.imgBackground;
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

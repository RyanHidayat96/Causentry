package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityPaymentBinding implements ViewBinding {
    public final MaterialButton btnInfoPaymentBankingMitra;
    public final MaterialButton btnPayment;
    public final ConstraintLayout constraintLayoutPayment;
    public final RelativeLayout constraintLayoutPaymentActivity;
    public final MaterialCardView cvInstruction;
    public final MaterialCardView cvPayment;
    public final RelativeLayout footer;
    public final RelativeLayout header;
    public final LayoutToolbarCenterBinding layoutToolbarCenter;
    public final LinearLayout llItemCategoryPayment;
    private final RelativeLayout rootView;
    public final RecyclerView rvListCategoryPayment;
    public final RecyclerView rvListItemAutoDebit;
    public final RecyclerView rvListItemInstantPayment;
    public final ScrollView scrollView;
    public final AppCompatTextView tvCopyPaymentCode;
    public final AppCompatTextView tvJHTTuition;
    public final TextView tvNotesPaymentNonSalariedWorker;
    public final TextView tvPaymentAmount;
    public final AppCompatTextView tvPaymentCode;
    public final AppCompatTextView tvTitleChooseMethodPayment;
    public final TextView tvTitleInformationJhtLast;
    public final AppCompatTextView tvTitleJkkAmount;
    public final TextView tvTitlePayment;
    public final AppCompatTextView tvValueJHTTuituion;
    public final AppCompatTextView tvValueJKKTuituion;
    public final AppCompatTextView tvValueJKMTuituion;
    public final AppCompatTextView tvValueTotalTuition;
    public final View viewLineFooter;
    public final View viewLineJHT;
    public final View viewLineJKK;
    public final View viewLineJKM;
    public final View viewLineTotal;
    public final View viewLineTotalTuition;

    private ActivityPaymentBinding(RelativeLayout relativeLayout, MaterialButton materialButton, MaterialButton materialButton2, ConstraintLayout constraintLayout, RelativeLayout relativeLayout2, MaterialCardView materialCardView, MaterialCardView materialCardView2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, LayoutToolbarCenterBinding layoutToolbarCenterBinding, LinearLayout linearLayout, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, ScrollView scrollView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, TextView textView, TextView textView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, TextView textView3, AppCompatTextView appCompatTextView5, TextView textView4, AppCompatTextView appCompatTextView6, AppCompatTextView appCompatTextView7, AppCompatTextView appCompatTextView8, AppCompatTextView appCompatTextView9, View view, View view2, View view3, View view4, View view5, View view6) {
        this.rootView = relativeLayout;
        this.btnInfoPaymentBankingMitra = materialButton;
        this.btnPayment = materialButton2;
        this.constraintLayoutPayment = constraintLayout;
        this.constraintLayoutPaymentActivity = relativeLayout2;
        this.cvInstruction = materialCardView;
        this.cvPayment = materialCardView2;
        this.footer = relativeLayout3;
        this.header = relativeLayout4;
        this.layoutToolbarCenter = layoutToolbarCenterBinding;
        this.llItemCategoryPayment = linearLayout;
        this.rvListCategoryPayment = recyclerView;
        this.rvListItemAutoDebit = recyclerView2;
        this.rvListItemInstantPayment = recyclerView3;
        this.scrollView = scrollView;
        this.tvCopyPaymentCode = appCompatTextView;
        this.tvJHTTuition = appCompatTextView2;
        this.tvNotesPaymentNonSalariedWorker = textView;
        this.tvPaymentAmount = textView2;
        this.tvPaymentCode = appCompatTextView3;
        this.tvTitleChooseMethodPayment = appCompatTextView4;
        this.tvTitleInformationJhtLast = textView3;
        this.tvTitleJkkAmount = appCompatTextView5;
        this.tvTitlePayment = textView4;
        this.tvValueJHTTuituion = appCompatTextView6;
        this.tvValueJKKTuituion = appCompatTextView7;
        this.tvValueJKMTuituion = appCompatTextView8;
        this.tvValueTotalTuition = appCompatTextView9;
        this.viewLineFooter = view;
        this.viewLineJHT = view2;
        this.viewLineJKK = view3;
        this.viewLineJKM = view4;
        this.viewLineTotal = view5;
        this.viewLineTotalTuition = view6;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityPaymentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityPaymentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_payment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityPaymentBinding bind(View view) {
        int i = R.id.btnInfoPaymentBankingMitra;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnInfoPaymentBankingMitra);
        if (materialButton != null) {
            i = R.id.btnPayment;
            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btnPayment);
            if (materialButton2 != null) {
                i = R.id.constraintLayoutPayment;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.constraintLayoutPayment);
                if (constraintLayout != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    i = R.id.cvInstruction;
                    MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvInstruction);
                    if (materialCardView != null) {
                        i = R.id.cvPayment;
                        MaterialCardView materialCardView2 = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvPayment);
                        if (materialCardView2 != null) {
                            i = R.id.footer;
                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.footer);
                            if (relativeLayout2 != null) {
                                i = R.id.header;
                                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.header);
                                if (relativeLayout3 != null) {
                                    i = R.id.layout_toolbar_center;
                                    View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar_center);
                                    if (viewFindChildViewById != null) {
                                        LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                                        i = R.id.llItemCategoryPayment;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llItemCategoryPayment);
                                        if (linearLayout != null) {
                                            i = R.id.rvListCategoryPayment;
                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvListCategoryPayment);
                                            if (recyclerView != null) {
                                                i = R.id.rvListItemAutoDebit;
                                                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvListItemAutoDebit);
                                                if (recyclerView2 != null) {
                                                    i = R.id.rvListItemInstantPayment;
                                                    RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvListItemInstantPayment);
                                                    if (recyclerView3 != null) {
                                                        i = R.id.scroll_view;
                                                        ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, R.id.scroll_view);
                                                        if (scrollView != null) {
                                                            i = R.id.tvCopyPaymentCode;
                                                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvCopyPaymentCode);
                                                            if (appCompatTextView != null) {
                                                                i = R.id.tvJHTTuition;
                                                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvJHTTuition);
                                                                if (appCompatTextView2 != null) {
                                                                    i = R.id.tvNotesPaymentNonSalariedWorker;
                                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvNotesPaymentNonSalariedWorker);
                                                                    if (textView != null) {
                                                                        i = R.id.tvPaymentAmount;
                                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPaymentAmount);
                                                                        if (textView2 != null) {
                                                                            i = R.id.tvPaymentCode;
                                                                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvPaymentCode);
                                                                            if (appCompatTextView3 != null) {
                                                                                i = R.id.tvTitleChooseMethodPayment;
                                                                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvTitleChooseMethodPayment);
                                                                                if (appCompatTextView4 != null) {
                                                                                    i = R.id.tvTitleInformationJhtLast;
                                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleInformationJhtLast);
                                                                                    if (textView3 != null) {
                                                                                        i = R.id.tvTitleJkkAmount;
                                                                                        AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvTitleJkkAmount);
                                                                                        if (appCompatTextView5 != null) {
                                                                                            i = R.id.tvTitlePayment;
                                                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitlePayment);
                                                                                            if (textView4 != null) {
                                                                                                AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvValueJHTTuituion);
                                                                                                if (appCompatTextView6 != null) {
                                                                                                    AppCompatTextView appCompatTextView7 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvValueJKKTuituion);
                                                                                                    if (appCompatTextView7 != null) {
                                                                                                        AppCompatTextView appCompatTextView8 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvValueJKMTuituion);
                                                                                                        if (appCompatTextView8 != null) {
                                                                                                            AppCompatTextView appCompatTextView9 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvValueTotalTuition);
                                                                                                            if (appCompatTextView9 != null) {
                                                                                                                View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.viewLineFooter);
                                                                                                                if (viewFindChildViewById2 != null) {
                                                                                                                    View viewFindChildViewById3 = ViewBindings.findChildViewById(view, R.id.viewLineJHT);
                                                                                                                    if (viewFindChildViewById3 != null) {
                                                                                                                        View viewFindChildViewById4 = ViewBindings.findChildViewById(view, R.id.viewLineJKK);
                                                                                                                        if (viewFindChildViewById4 != null) {
                                                                                                                            View viewFindChildViewById5 = ViewBindings.findChildViewById(view, R.id.viewLineJKM);
                                                                                                                            if (viewFindChildViewById5 != null) {
                                                                                                                                View viewFindChildViewById6 = ViewBindings.findChildViewById(view, R.id.viewLineTotal);
                                                                                                                                if (viewFindChildViewById6 != null) {
                                                                                                                                    View viewFindChildViewById7 = ViewBindings.findChildViewById(view, R.id.viewLineTotalTuition);
                                                                                                                                    if (viewFindChildViewById7 != null) {
                                                                                                                                        return new ActivityPaymentBinding(relativeLayout, materialButton, materialButton2, constraintLayout, relativeLayout, materialCardView, materialCardView2, relativeLayout2, relativeLayout3, layoutToolbarCenterBindingBind, linearLayout, recyclerView, recyclerView2, recyclerView3, scrollView, appCompatTextView, appCompatTextView2, textView, textView2, appCompatTextView3, appCompatTextView4, textView3, appCompatTextView5, textView4, appCompatTextView6, appCompatTextView7, appCompatTextView8, appCompatTextView9, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, viewFindChildViewById5, viewFindChildViewById6, viewFindChildViewById7);
                                                                                                                                    }
                                                                                                                                    i = R.id.viewLineTotalTuition;
                                                                                                                                } else {
                                                                                                                                    i = R.id.viewLineTotal;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                i = R.id.viewLineJKM;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            i = R.id.viewLineJKK;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        i = R.id.viewLineJHT;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i = R.id.viewLineFooter;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i = R.id.tvValueTotalTuition;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = R.id.tvValueJKMTuituion;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.tvValueJKKTuituion;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.tvValueJHTTuituion;
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

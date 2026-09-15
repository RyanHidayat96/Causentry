package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Group;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.bpjstku.util.custom.CircleImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityJpnPeriodicInformationVerifiedBinding implements ViewBinding {
    public final Button btnBackToHome;
    public final CircleImageView civProfile;
    public final CardView cvInfoJp;
    public final Group groupContent;
    public final Group groupDataProcess;
    public final ImageView imgBackground;
    public final AppCompatImageView imgCompensation;
    public final AppCompatImageView imgJpnBenefit;
    public final AppCompatImageView imgRapel;
    public final LayoutToolbarCenterBinding layoutToolbar;
    public final LinearLayout llInfoDate;
    public final LinearLayout llMonth;
    public final LinearLayout llNotes;
    public final RelativeLayout root;
    private final RelativeLayout rootView;
    public final SwipeRefreshLayout swipeRefreshLayout;
    public final AppCompatTextView tvCompensation;
    public final AppCompatTextView tvConfirmationMonth;
    public final AppCompatTextView tvCurrentMonth;
    public final AppCompatTextView tvCurrentMonth2;
    public final AppCompatTextView tvDataProcess;
    public final AppCompatTextView tvDataProcessContent;
    public final TextView tvDateNextConfirm;
    public final AppCompatTextView tvJpnBenefit1;
    public final AppCompatTextView tvJpnBenefit2;
    public final TextView tvNamesWorker;
    public final AppCompatTextView tvOldDaySecurityMenu;
    public final AppCompatTextView tvOldDaySecurityMenuDescription;
    public final TextView tvProcessPayment;
    public final TextView tvProgramsCovered;
    public final AppCompatTextView tvRapel1;
    public final AppCompatTextView tvRapel2;
    public final TextView tvSuccessPayment;
    public final AppCompatTextView tvTitle1;
    public final TextView tvTotalBenefit;
    public final TextView tvTotalBenefitJpn;
    public final TextView tvTotalCompensation;
    public final TextView tvTotalJpnBenefit;
    public final TextView tvTotalRapel;
    public final View view1;

    private ActivityJpnPeriodicInformationVerifiedBinding(RelativeLayout relativeLayout, Button button, CircleImageView circleImageView, CardView cardView, Group group, Group group2, ImageView imageView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, LayoutToolbarCenterBinding layoutToolbarCenterBinding, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, RelativeLayout relativeLayout2, SwipeRefreshLayout swipeRefreshLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, TextView textView, AppCompatTextView appCompatTextView7, AppCompatTextView appCompatTextView8, TextView textView2, AppCompatTextView appCompatTextView9, AppCompatTextView appCompatTextView10, TextView textView3, TextView textView4, AppCompatTextView appCompatTextView11, AppCompatTextView appCompatTextView12, TextView textView5, AppCompatTextView appCompatTextView13, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, View view) {
        this.rootView = relativeLayout;
        this.btnBackToHome = button;
        this.civProfile = circleImageView;
        this.cvInfoJp = cardView;
        this.groupContent = group;
        this.groupDataProcess = group2;
        this.imgBackground = imageView;
        this.imgCompensation = appCompatImageView;
        this.imgJpnBenefit = appCompatImageView2;
        this.imgRapel = appCompatImageView3;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.llInfoDate = linearLayout;
        this.llMonth = linearLayout2;
        this.llNotes = linearLayout3;
        this.root = relativeLayout2;
        this.swipeRefreshLayout = swipeRefreshLayout;
        this.tvCompensation = appCompatTextView;
        this.tvConfirmationMonth = appCompatTextView2;
        this.tvCurrentMonth = appCompatTextView3;
        this.tvCurrentMonth2 = appCompatTextView4;
        this.tvDataProcess = appCompatTextView5;
        this.tvDataProcessContent = appCompatTextView6;
        this.tvDateNextConfirm = textView;
        this.tvJpnBenefit1 = appCompatTextView7;
        this.tvJpnBenefit2 = appCompatTextView8;
        this.tvNamesWorker = textView2;
        this.tvOldDaySecurityMenu = appCompatTextView9;
        this.tvOldDaySecurityMenuDescription = appCompatTextView10;
        this.tvProcessPayment = textView3;
        this.tvProgramsCovered = textView4;
        this.tvRapel1 = appCompatTextView11;
        this.tvRapel2 = appCompatTextView12;
        this.tvSuccessPayment = textView5;
        this.tvTitle1 = appCompatTextView13;
        this.tvTotalBenefit = textView6;
        this.tvTotalBenefitJpn = textView7;
        this.tvTotalCompensation = textView8;
        this.tvTotalJpnBenefit = textView9;
        this.tvTotalRapel = textView10;
        this.view1 = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ActivityJpnPeriodicInformationVerifiedBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityJpnPeriodicInformationVerifiedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_jpn_periodic_information_verified, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityJpnPeriodicInformationVerifiedBinding bind(View view) {
        int i = R.id.btnBackToHome;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnBackToHome);
        if (button != null) {
            i = R.id.civProfile;
            CircleImageView circleImageView = (CircleImageView) ViewBindings.findChildViewById(view, R.id.civProfile);
            if (circleImageView != null) {
                i = R.id.cvInfoJp;
                CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.cvInfoJp);
                if (cardView != null) {
                    i = R.id.groupContent;
                    Group group = (Group) ViewBindings.findChildViewById(view, R.id.groupContent);
                    if (group != null) {
                        i = R.id.groupDataProcess;
                        Group group2 = (Group) ViewBindings.findChildViewById(view, R.id.groupDataProcess);
                        if (group2 != null) {
                            i = R.id.imgBackground;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgBackground);
                            if (imageView != null) {
                                i = R.id.imgCompensation;
                                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgCompensation);
                                if (appCompatImageView != null) {
                                    i = R.id.imgJpnBenefit;
                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgJpnBenefit);
                                    if (appCompatImageView2 != null) {
                                        i = R.id.imgRapel;
                                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, R.id.imgRapel);
                                        if (appCompatImageView3 != null) {
                                            i = R.id.layout_toolbar;
                                            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                                            if (viewFindChildViewById != null) {
                                                LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                                                i = R.id.llInfoDate;
                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llInfoDate);
                                                if (linearLayout != null) {
                                                    i = R.id.llMonth;
                                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llMonth);
                                                    if (linearLayout2 != null) {
                                                        i = R.id.llNotes;
                                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llNotes);
                                                        if (linearLayout3 != null) {
                                                            RelativeLayout relativeLayout = (RelativeLayout) view;
                                                            i = R.id.swipeRefreshLayout;
                                                            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ViewBindings.findChildViewById(view, R.id.swipeRefreshLayout);
                                                            if (swipeRefreshLayout != null) {
                                                                i = R.id.tvCompensation;
                                                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvCompensation);
                                                                if (appCompatTextView != null) {
                                                                    i = R.id.tvConfirmationMonth;
                                                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvConfirmationMonth);
                                                                    if (appCompatTextView2 != null) {
                                                                        i = R.id.tvCurrentMonth;
                                                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvCurrentMonth);
                                                                        if (appCompatTextView3 != null) {
                                                                            i = R.id.tvCurrentMonth2;
                                                                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvCurrentMonth2);
                                                                            if (appCompatTextView4 != null) {
                                                                                i = R.id.tvDataProcess;
                                                                                AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvDataProcess);
                                                                                if (appCompatTextView5 != null) {
                                                                                    i = R.id.tvDataProcessContent;
                                                                                    AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvDataProcessContent);
                                                                                    if (appCompatTextView6 != null) {
                                                                                        i = R.id.tvDateNextConfirm;
                                                                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvDateNextConfirm);
                                                                                        if (textView != null) {
                                                                                            i = R.id.tvJpnBenefit1;
                                                                                            AppCompatTextView appCompatTextView7 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvJpnBenefit1);
                                                                                            if (appCompatTextView7 != null) {
                                                                                                AppCompatTextView appCompatTextView8 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvJpnBenefit2);
                                                                                                if (appCompatTextView8 != null) {
                                                                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNamesWorker);
                                                                                                    if (textView2 != null) {
                                                                                                        AppCompatTextView appCompatTextView9 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvOldDaySecurityMenu);
                                                                                                        if (appCompatTextView9 != null) {
                                                                                                            AppCompatTextView appCompatTextView10 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvOldDaySecurityMenuDescription);
                                                                                                            if (appCompatTextView10 != null) {
                                                                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvProcessPayment);
                                                                                                                if (textView3 != null) {
                                                                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvProgramsCovered);
                                                                                                                    if (textView4 != null) {
                                                                                                                        AppCompatTextView appCompatTextView11 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvRapel1);
                                                                                                                        if (appCompatTextView11 != null) {
                                                                                                                            AppCompatTextView appCompatTextView12 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvRapel2);
                                                                                                                            if (appCompatTextView12 != null) {
                                                                                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvSuccessPayment);
                                                                                                                                if (textView5 != null) {
                                                                                                                                    AppCompatTextView appCompatTextView13 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvTitle1);
                                                                                                                                    if (appCompatTextView13 != null) {
                                                                                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTotalBenefit);
                                                                                                                                        if (textView6 != null) {
                                                                                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTotalBenefitJpn);
                                                                                                                                            if (textView7 != null) {
                                                                                                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTotalCompensation);
                                                                                                                                                if (textView8 != null) {
                                                                                                                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTotalJpnBenefit);
                                                                                                                                                    if (textView9 != null) {
                                                                                                                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTotalRapel);
                                                                                                                                                        if (textView10 != null) {
                                                                                                                                                            View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.view1);
                                                                                                                                                            if (viewFindChildViewById2 != null) {
                                                                                                                                                                return new ActivityJpnPeriodicInformationVerifiedBinding(relativeLayout, button, circleImageView, cardView, group, group2, imageView, appCompatImageView, appCompatImageView2, appCompatImageView3, layoutToolbarCenterBindingBind, linearLayout, linearLayout2, linearLayout3, relativeLayout, swipeRefreshLayout, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, textView, appCompatTextView7, appCompatTextView8, textView2, appCompatTextView9, appCompatTextView10, textView3, textView4, appCompatTextView11, appCompatTextView12, textView5, appCompatTextView13, textView6, textView7, textView8, textView9, textView10, viewFindChildViewById2);
                                                                                                                                                            }
                                                                                                                                                            i = R.id.view1;
                                                                                                                                                        } else {
                                                                                                                                                            i = R.id.tvTotalRapel;
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        i = R.id.tvTotalJpnBenefit;
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    i = R.id.tvTotalCompensation;
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                i = R.id.tvTotalBenefitJpn;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            i = R.id.tvTotalBenefit;
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        i = R.id.tvTitle1;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    i = R.id.tvSuccessPayment;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                i = R.id.tvRapel2;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            i = R.id.tvRapel1;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        i = R.id.tvProgramsCovered;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i = R.id.tvProcessPayment;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i = R.id.tvOldDaySecurityMenuDescription;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = R.id.tvOldDaySecurityMenu;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.tvNamesWorker;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.tvJpnBenefit2;
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

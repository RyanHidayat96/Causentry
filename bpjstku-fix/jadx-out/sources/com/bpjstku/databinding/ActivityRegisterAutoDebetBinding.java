package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityRegisterAutoDebetBinding implements ViewBinding {
    public final ImageView imgBankBni;
    public final ImageView imgBankMandiri;
    public final ImageView imgCategoryPayment;
    public final ImageView imgDana;
    public final ImageView imgLinkaja;
    public final ImageView imgOvo;
    public final ImageView imgShopee;
    public final LayoutToolbarCenterBinding layoutToolbar;
    public final LinearLayout llBankBni;
    public final LinearLayout llBankBriDD;
    public final LinearLayout llBankMandiri;
    public final LinearLayout llDana;
    public final LinearLayout llLinkaja;
    public final LinearLayout llOvo;
    public final LinearLayout llShopee;
    private final ConstraintLayout rootView;
    public final SwipeRefreshLayout srlPaymentMethodAutoDebit;
    public final TextView tvAutoDebetBni;
    public final TextView tvAutoDebetMandiri;
    public final TextView tvDana;
    public final TextView tvLinkaja;
    public final TextView tvOvo;
    public final TextView tvPaymentMethod;
    public final TextView tvShopee;
    public final TextView tvStatusBni;
    public final TextView tvStatusBri;
    public final TextView tvStatusDana;
    public final TextView tvStatusLinkaja;
    public final TextView tvStatusMandiri;
    public final TextView tvStatusOvo;
    public final TextView tvStatusShopee;
    public final View viewBRISeparator;
    public final View viewBankBniSeparator;
    public final View viewDanaSeparator;
    public final View viewLinkajaSeparator;
    public final View viewMandiriSeparator;
    public final View viewOvoSeparator;
    public final View viewShopeeSeparator;

    private ActivityRegisterAutoDebetBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, LayoutToolbarCenterBinding layoutToolbarCenterBinding, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, SwipeRefreshLayout swipeRefreshLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, View view, View view2, View view3, View view4, View view5, View view6, View view7) {
        this.rootView = constraintLayout;
        this.imgBankBni = imageView;
        this.imgBankMandiri = imageView2;
        this.imgCategoryPayment = imageView3;
        this.imgDana = imageView4;
        this.imgLinkaja = imageView5;
        this.imgOvo = imageView6;
        this.imgShopee = imageView7;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.llBankBni = linearLayout;
        this.llBankBriDD = linearLayout2;
        this.llBankMandiri = linearLayout3;
        this.llDana = linearLayout4;
        this.llLinkaja = linearLayout5;
        this.llOvo = linearLayout6;
        this.llShopee = linearLayout7;
        this.srlPaymentMethodAutoDebit = swipeRefreshLayout;
        this.tvAutoDebetBni = textView;
        this.tvAutoDebetMandiri = textView2;
        this.tvDana = textView3;
        this.tvLinkaja = textView4;
        this.tvOvo = textView5;
        this.tvPaymentMethod = textView6;
        this.tvShopee = textView7;
        this.tvStatusBni = textView8;
        this.tvStatusBri = textView9;
        this.tvStatusDana = textView10;
        this.tvStatusLinkaja = textView11;
        this.tvStatusMandiri = textView12;
        this.tvStatusOvo = textView13;
        this.tvStatusShopee = textView14;
        this.viewBRISeparator = view;
        this.viewBankBniSeparator = view2;
        this.viewDanaSeparator = view3;
        this.viewLinkajaSeparator = view4;
        this.viewMandiriSeparator = view5;
        this.viewOvoSeparator = view6;
        this.viewShopeeSeparator = view7;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityRegisterAutoDebetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityRegisterAutoDebetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_register_auto_debet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityRegisterAutoDebetBinding bind(View view) {
        int i = R.id.imgBankBni;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgBankBni);
        if (imageView != null) {
            i = R.id.imgBankMandiri;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgBankMandiri);
            if (imageView2 != null) {
                i = R.id.imgCategoryPayment;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgCategoryPayment);
                if (imageView3 != null) {
                    i = R.id.imgDana;
                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgDana);
                    if (imageView4 != null) {
                        i = R.id.imgLinkaja;
                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgLinkaja);
                        if (imageView5 != null) {
                            i = R.id.imgOvo;
                            ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgOvo);
                            if (imageView6 != null) {
                                i = R.id.imgShopee;
                                ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgShopee);
                                if (imageView7 != null) {
                                    i = R.id.layoutToolbar;
                                    View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layoutToolbar);
                                    if (viewFindChildViewById != null) {
                                        LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                                        i = R.id.llBankBni;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llBankBni);
                                        if (linearLayout != null) {
                                            i = R.id.llBankBriDD;
                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llBankBriDD);
                                            if (linearLayout2 != null) {
                                                i = R.id.llBankMandiri;
                                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llBankMandiri);
                                                if (linearLayout3 != null) {
                                                    i = R.id.llDana;
                                                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llDana);
                                                    if (linearLayout4 != null) {
                                                        i = R.id.llLinkaja;
                                                        LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llLinkaja);
                                                        if (linearLayout5 != null) {
                                                            i = R.id.llOvo;
                                                            LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llOvo);
                                                            if (linearLayout6 != null) {
                                                                i = R.id.llShopee;
                                                                LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llShopee);
                                                                if (linearLayout7 != null) {
                                                                    i = R.id.srlPaymentMethodAutoDebit;
                                                                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ViewBindings.findChildViewById(view, R.id.srlPaymentMethodAutoDebit);
                                                                    if (swipeRefreshLayout != null) {
                                                                        i = R.id.tvAutoDebetBni;
                                                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvAutoDebetBni);
                                                                        if (textView != null) {
                                                                            i = R.id.tvAutoDebetMandiri;
                                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvAutoDebetMandiri);
                                                                            if (textView2 != null) {
                                                                                i = R.id.tvDana;
                                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvDana);
                                                                                if (textView3 != null) {
                                                                                    i = R.id.tvLinkaja;
                                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvLinkaja);
                                                                                    if (textView4 != null) {
                                                                                        i = R.id.tvOvo;
                                                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvOvo);
                                                                                        if (textView5 != null) {
                                                                                            i = R.id.tvPaymentMethod;
                                                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPaymentMethod);
                                                                                            if (textView6 != null) {
                                                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tvShopee);
                                                                                                if (textView7 != null) {
                                                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvStatusBni);
                                                                                                    if (textView8 != null) {
                                                                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tvStatusBri);
                                                                                                        if (textView9 != null) {
                                                                                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tvStatusDana);
                                                                                                            if (textView10 != null) {
                                                                                                                TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tvStatusLinkaja);
                                                                                                                if (textView11 != null) {
                                                                                                                    TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.tvStatusMandiri);
                                                                                                                    if (textView12 != null) {
                                                                                                                        TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.tvStatusOvo);
                                                                                                                        if (textView13 != null) {
                                                                                                                            TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.tvStatusShopee);
                                                                                                                            if (textView14 != null) {
                                                                                                                                View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.viewBRISeparator);
                                                                                                                                if (viewFindChildViewById2 != null) {
                                                                                                                                    View viewFindChildViewById3 = ViewBindings.findChildViewById(view, R.id.viewBankBniSeparator);
                                                                                                                                    if (viewFindChildViewById3 != null) {
                                                                                                                                        View viewFindChildViewById4 = ViewBindings.findChildViewById(view, R.id.viewDanaSeparator);
                                                                                                                                        if (viewFindChildViewById4 != null) {
                                                                                                                                            View viewFindChildViewById5 = ViewBindings.findChildViewById(view, R.id.viewLinkajaSeparator);
                                                                                                                                            if (viewFindChildViewById5 != null) {
                                                                                                                                                View viewFindChildViewById6 = ViewBindings.findChildViewById(view, R.id.viewMandiriSeparator);
                                                                                                                                                if (viewFindChildViewById6 != null) {
                                                                                                                                                    View viewFindChildViewById7 = ViewBindings.findChildViewById(view, R.id.viewOvoSeparator);
                                                                                                                                                    if (viewFindChildViewById7 != null) {
                                                                                                                                                        View viewFindChildViewById8 = ViewBindings.findChildViewById(view, R.id.viewShopeeSeparator);
                                                                                                                                                        if (viewFindChildViewById8 != null) {
                                                                                                                                                            return new ActivityRegisterAutoDebetBinding((ConstraintLayout) view, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, layoutToolbarCenterBindingBind, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, swipeRefreshLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, viewFindChildViewById5, viewFindChildViewById6, viewFindChildViewById7, viewFindChildViewById8);
                                                                                                                                                        }
                                                                                                                                                        i = R.id.viewShopeeSeparator;
                                                                                                                                                    } else {
                                                                                                                                                        i = R.id.viewOvoSeparator;
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    i = R.id.viewMandiriSeparator;
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                i = R.id.viewLinkajaSeparator;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            i = R.id.viewDanaSeparator;
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        i = R.id.viewBankBniSeparator;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    i = R.id.viewBRISeparator;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                i = R.id.tvStatusShopee;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            i = R.id.tvStatusOvo;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        i = R.id.tvStatusMandiri;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i = R.id.tvStatusLinkaja;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i = R.id.tvStatusDana;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = R.id.tvStatusBri;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.tvStatusBni;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.tvShopee;
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

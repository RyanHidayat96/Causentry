package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import defpackage.setWhiteBalanceMode;

/* JADX INFO: loaded from: classes5.dex */
public final class ActivityTuitionPaymentCodeBinding implements ViewBinding {
    public final Button btnPaymentMethod;
    public final LayoutToolbarCenterBinding layoutToolbar;
    private final ScrollView rootView;
    public final AppCompatTextView tvJHTTuituionLabel;
    public final AppCompatTextView tvJKKTuituionLabel;
    public final AppCompatTextView tvJKMTuituionLabel;
    public final AppCompatTextView tvPaymentCode;
    public final AppCompatTextView tvPaymentMethodLabel;
    public final AppCompatTextView tvPaymentSummaryLabel;
    public final AppCompatTextView tvValueJHTTuituion;
    public final AppCompatTextView tvValueJKKTuituion;
    public final AppCompatTextView tvValueJKMTuituion;
    public final AppCompatTextView tvValuePaymentSummary;
    public final View viewLineJHT;
    public final View viewLineJKK;
    public final View viewLineJKM;
    public final View viewLinePaymentSummary;

    private ActivityTuitionPaymentCodeBinding(ScrollView scrollView, Button button, LayoutToolbarCenterBinding layoutToolbarCenterBinding, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, AppCompatTextView appCompatTextView7, AppCompatTextView appCompatTextView8, AppCompatTextView appCompatTextView9, AppCompatTextView appCompatTextView10, View view, View view2, View view3, View view4) {
        this.rootView = scrollView;
        this.btnPaymentMethod = button;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.tvJHTTuituionLabel = appCompatTextView;
        this.tvJKKTuituionLabel = appCompatTextView2;
        this.tvJKMTuituionLabel = appCompatTextView3;
        this.tvPaymentCode = appCompatTextView4;
        this.tvPaymentMethodLabel = appCompatTextView5;
        this.tvPaymentSummaryLabel = appCompatTextView6;
        this.tvValueJHTTuituion = appCompatTextView7;
        this.tvValueJKKTuituion = appCompatTextView8;
        this.tvValueJKMTuituion = appCompatTextView9;
        this.tvValuePaymentSummary = appCompatTextView10;
        this.viewLineJHT = view;
        this.viewLineJKK = view2;
        this.viewLineJKM = view3;
        this.viewLinePaymentSummary = view4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityTuitionPaymentCodeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityTuitionPaymentCodeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_tuition_payment_code, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityTuitionPaymentCodeBinding bind(View view) {
        int i = R.id.btnPaymentMethod;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnPaymentMethod);
        if (button != null) {
            i = R.id.layout_toolbar;
            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
            if (viewFindChildViewById != null) {
                LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                i = R.id.tvJHTTuituionLabel;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvJHTTuituionLabel);
                if (appCompatTextView != null) {
                    i = R.id.tvJKKTuituionLabel;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvJKKTuituionLabel);
                    if (appCompatTextView2 != null) {
                        i = R.id.tvJKMTuituionLabel;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvJKMTuituionLabel);
                        if (appCompatTextView3 != null) {
                            i = R.id.tvPaymentCode;
                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvPaymentCode);
                            if (appCompatTextView4 != null) {
                                i = R.id.tvPaymentMethodLabel;
                                AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvPaymentMethodLabel);
                                if (appCompatTextView5 != null) {
                                    i = R.id.tvPaymentSummaryLabel;
                                    AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvPaymentSummaryLabel);
                                    if (appCompatTextView6 != null) {
                                        i = R.id.tvValueJHTTuituion;
                                        AppCompatTextView appCompatTextView7 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvValueJHTTuituion);
                                        if (appCompatTextView7 != null) {
                                            i = R.id.tvValueJKKTuituion;
                                            AppCompatTextView appCompatTextView8 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvValueJKKTuituion);
                                            if (appCompatTextView8 != null) {
                                                i = R.id.tvValueJKMTuituion;
                                                AppCompatTextView appCompatTextView9 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvValueJKMTuituion);
                                                if (appCompatTextView9 != null) {
                                                    i = R.id.tvValuePaymentSummary;
                                                    AppCompatTextView appCompatTextView10 = (AppCompatTextView) ViewBindings.findChildViewById(view, R.id.tvValuePaymentSummary);
                                                    if (appCompatTextView10 != null) {
                                                        i = R.id.viewLineJHT;
                                                        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.viewLineJHT);
                                                        if (viewFindChildViewById2 != null) {
                                                            i = R.id.viewLineJKK;
                                                            View viewFindChildViewById3 = ViewBindings.findChildViewById(view, R.id.viewLineJKK);
                                                            if (viewFindChildViewById3 != null) {
                                                                i = R.id.viewLineJKM;
                                                                View viewFindChildViewById4 = ViewBindings.findChildViewById(view, R.id.viewLineJKM);
                                                                if (viewFindChildViewById4 != null) {
                                                                    i = R.id.viewLinePaymentSummary;
                                                                    View viewFindChildViewById5 = ViewBindings.findChildViewById(view, R.id.viewLinePaymentSummary);
                                                                    if (viewFindChildViewById5 != null) {
                                                                        return new ActivityTuitionPaymentCodeBinding((ScrollView) view, button, layoutToolbarCenterBindingBind, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, appCompatTextView7, appCompatTextView8, appCompatTextView9, appCompatTextView10, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, viewFindChildViewById5);
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

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        setWhiteBalanceMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0] = Class.forName("getTargetResolution$TuitionPaymentFragmentspecialinlinedviewModeldefault3").getDeclaredField("TuitionPaymentFragmentspecialinlinedviewModeldefault3");
    }
}

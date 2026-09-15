package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.bpjstku.util.custom.CircleImageView;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes6.dex */
public final class FragmentAccountBinding implements ViewBinding {
    public final CircleImageView civProfile;
    public final MaterialCardView cvProfile;
    public final ImageView imgBackground;
    public final ImageView imgIdCard;
    public final ImageView imgPhone;
    private final ScrollView rootView;
    public final LayoutToolbarCenterBinding toolbarCenter;
    public final TextView tvAboutApp;
    public final TextView tvDigitalCard;
    public final TextView tvEditProfile;
    public final TextView tvIdCard;
    public final TextView tvLogout;
    public final TextView tvMyPoint;
    public final TextView tvNonactiveAutodebet;
    public final TextView tvPhoneNumber;
    public final TextView tvPrivacyPolicy;
    public final TextView tvTermsConditions;
    public final TextView tvUserCategory;
    public final TextView tvUserIdCard;
    public final TextView tvUserName;
    public final TextView tvUserPhoneNumber;
    public final TextView tvUserStatus;
    public final TextView tvVersion;
    public final View viewAboutAppSeparator;
    public final View viewDigitalCardSeparator;
    public final View viewEditProfileSeparator;
    public final View viewNonactiveAutodebetSeparator;
    public final View viewPointSeparator;
    public final View viewPrivacyPolicySeparator;
    public final View viewSeparator;
    public final View viewTermsConditionsSeparator;

    private FragmentAccountBinding(ScrollView scrollView, CircleImageView circleImageView, MaterialCardView materialCardView, ImageView imageView, ImageView imageView2, ImageView imageView3, LayoutToolbarCenterBinding layoutToolbarCenterBinding, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, View view, View view2, View view3, View view4, View view5, View view6, View view7, View view8) {
        this.rootView = scrollView;
        this.civProfile = circleImageView;
        this.cvProfile = materialCardView;
        this.imgBackground = imageView;
        this.imgIdCard = imageView2;
        this.imgPhone = imageView3;
        this.toolbarCenter = layoutToolbarCenterBinding;
        this.tvAboutApp = textView;
        this.tvDigitalCard = textView2;
        this.tvEditProfile = textView3;
        this.tvIdCard = textView4;
        this.tvLogout = textView5;
        this.tvMyPoint = textView6;
        this.tvNonactiveAutodebet = textView7;
        this.tvPhoneNumber = textView8;
        this.tvPrivacyPolicy = textView9;
        this.tvTermsConditions = textView10;
        this.tvUserCategory = textView11;
        this.tvUserIdCard = textView12;
        this.tvUserName = textView13;
        this.tvUserPhoneNumber = textView14;
        this.tvUserStatus = textView15;
        this.tvVersion = textView16;
        this.viewAboutAppSeparator = view;
        this.viewDigitalCardSeparator = view2;
        this.viewEditProfileSeparator = view3;
        this.viewNonactiveAutodebetSeparator = view4;
        this.viewPointSeparator = view5;
        this.viewPrivacyPolicySeparator = view6;
        this.viewSeparator = view7;
        this.viewTermsConditionsSeparator = view8;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentAccountBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAccountBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_account, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAccountBinding bind(View view) {
        int i = R.id.civProfile;
        CircleImageView circleImageView = (CircleImageView) ViewBindings.findChildViewById(view, R.id.civProfile);
        if (circleImageView != null) {
            i = R.id.cvProfile;
            MaterialCardView materialCardView = (MaterialCardView) ViewBindings.findChildViewById(view, R.id.cvProfile);
            if (materialCardView != null) {
                i = R.id.imgBackground;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgBackground);
                if (imageView != null) {
                    i = R.id.imgIdCard;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgIdCard);
                    if (imageView2 != null) {
                        i = R.id.imgPhone;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgPhone);
                        if (imageView3 != null) {
                            i = R.id.toolbarCenter;
                            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.toolbarCenter);
                            if (viewFindChildViewById != null) {
                                LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById);
                                i = R.id.tvAboutApp;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvAboutApp);
                                if (textView != null) {
                                    i = R.id.tvDigitalCard;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvDigitalCard);
                                    if (textView2 != null) {
                                        i = R.id.tvEditProfile;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvEditProfile);
                                        if (textView3 != null) {
                                            i = R.id.tvIdCard;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvIdCard);
                                            if (textView4 != null) {
                                                i = R.id.tvLogout;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvLogout);
                                                if (textView5 != null) {
                                                    i = R.id.tvMyPoint;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvMyPoint);
                                                    if (textView6 != null) {
                                                        i = R.id.tvNonactiveAutodebet;
                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNonactiveAutodebet);
                                                        if (textView7 != null) {
                                                            i = R.id.tvPhoneNumber;
                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPhoneNumber);
                                                            if (textView8 != null) {
                                                                i = R.id.tvPrivacyPolicy;
                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPrivacyPolicy);
                                                                if (textView9 != null) {
                                                                    i = R.id.tvTermsConditions;
                                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTermsConditions);
                                                                    if (textView10 != null) {
                                                                        i = R.id.tvUserCategory;
                                                                        TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tvUserCategory);
                                                                        if (textView11 != null) {
                                                                            i = R.id.tvUserIdCard;
                                                                            TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.tvUserIdCard);
                                                                            if (textView12 != null) {
                                                                                i = R.id.tvUserName;
                                                                                TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.tvUserName);
                                                                                if (textView13 != null) {
                                                                                    i = R.id.tvUserPhoneNumber;
                                                                                    TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.tvUserPhoneNumber);
                                                                                    if (textView14 != null) {
                                                                                        i = R.id.tvUserStatus;
                                                                                        TextView textView15 = (TextView) ViewBindings.findChildViewById(view, R.id.tvUserStatus);
                                                                                        if (textView15 != null) {
                                                                                            i = R.id.tvVersion;
                                                                                            TextView textView16 = (TextView) ViewBindings.findChildViewById(view, R.id.tvVersion);
                                                                                            if (textView16 != null) {
                                                                                                View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.viewAboutAppSeparator);
                                                                                                if (viewFindChildViewById2 != null) {
                                                                                                    View viewFindChildViewById3 = ViewBindings.findChildViewById(view, R.id.viewDigitalCardSeparator);
                                                                                                    if (viewFindChildViewById3 != null) {
                                                                                                        View viewFindChildViewById4 = ViewBindings.findChildViewById(view, R.id.viewEditProfileSeparator);
                                                                                                        if (viewFindChildViewById4 != null) {
                                                                                                            View viewFindChildViewById5 = ViewBindings.findChildViewById(view, R.id.viewNonactiveAutodebetSeparator);
                                                                                                            if (viewFindChildViewById5 != null) {
                                                                                                                View viewFindChildViewById6 = ViewBindings.findChildViewById(view, R.id.viewPointSeparator);
                                                                                                                if (viewFindChildViewById6 != null) {
                                                                                                                    View viewFindChildViewById7 = ViewBindings.findChildViewById(view, R.id.viewPrivacyPolicySeparator);
                                                                                                                    if (viewFindChildViewById7 != null) {
                                                                                                                        View viewFindChildViewById8 = ViewBindings.findChildViewById(view, R.id.viewSeparator);
                                                                                                                        if (viewFindChildViewById8 != null) {
                                                                                                                            View viewFindChildViewById9 = ViewBindings.findChildViewById(view, R.id.viewTermsConditionsSeparator);
                                                                                                                            if (viewFindChildViewById9 != null) {
                                                                                                                                return new FragmentAccountBinding((ScrollView) view, circleImageView, materialCardView, imageView, imageView2, imageView3, layoutToolbarCenterBindingBind, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, viewFindChildViewById5, viewFindChildViewById6, viewFindChildViewById7, viewFindChildViewById8, viewFindChildViewById9);
                                                                                                                            }
                                                                                                                            i = R.id.viewTermsConditionsSeparator;
                                                                                                                        } else {
                                                                                                                            i = R.id.viewSeparator;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        i = R.id.viewPrivacyPolicySeparator;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i = R.id.viewPointSeparator;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i = R.id.viewNonactiveAutodebetSeparator;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = R.id.viewEditProfileSeparator;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.viewDigitalCardSeparator;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.viewAboutAppSeparator;
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

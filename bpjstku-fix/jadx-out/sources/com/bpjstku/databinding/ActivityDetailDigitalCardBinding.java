package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.kennyc.view.MultiStateView;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityDetailDigitalCardBinding implements ViewBinding {
    public final Button btnChangeTuitionBpu;
    public final TextView btnImageZoom;
    public final LinearLayout containerFollowedProgram;
    public final View divtvBeginingLossJobMemberValue;
    public final View divtvInfoLastPaymentValue;
    public final View followedProgramDivider;
    public final ImageView imgBackground;
    public final ImageView imgDigitalCard;
    public final View infoCompanyNameDivider;
    public final View infoLastWagesDivider;
    public final View infoLossJobDivider;
    public final View infoPensionDivider;
    public final View infoSegmentDivider;
    public final View jhtStatusClaimDivider;
    public final LayoutToolbarCenterBinding layoutToolbar;
    public final View membershipStatusDivider;
    public final MultiStateView msvDetailDigitalCard;
    public final View periodPaymentPensionDivider;
    private final NestedScrollView rootView;
    public final TextView tvBeginingLossJobMember;
    public final TextView tvBeginingLossJobMemberLabel;
    public final TextView tvInfoCompanyName;
    public final TextView tvInfoCompanyNameLabel;
    public final TextView tvInfoLastPayment;
    public final TextView tvInfoLastPaymentLabel;
    public final TextView tvInfoLastWages;
    public final TextView tvInfoLastWagesLabel;
    public final TextView tvInfoPension;
    public final TextView tvInfoPensionLabel;
    public final TextView tvInfoSegmentLabel;
    public final TextView tvInfoSegmentName;
    public final TextView tvJhtStatusClaim;
    public final TextView tvJhtStatusClaimLabel;
    public final TextView tvMembershipInfo;
    public final TextView tvMembershipStatus;
    public final TextView tvMembershipStatusLabel;
    public final TextView tvPeriodPaymentLossJobLabel;
    public final TextView tvPeriodPaymentPension;
    public final TextView tvPeriodPaymentPensionLabel;
    public final TextView tvPeriodPaymentlossJob;
    public final TextView tvProgramJoined;

    private ActivityDetailDigitalCardBinding(NestedScrollView nestedScrollView, Button button, TextView textView, LinearLayout linearLayout, View view, View view2, View view3, ImageView imageView, ImageView imageView2, View view4, View view5, View view6, View view7, View view8, View view9, LayoutToolbarCenterBinding layoutToolbarCenterBinding, View view10, MultiStateView multiStateView, View view11, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, TextView textView19, TextView textView20, TextView textView21, TextView textView22, TextView textView23) {
        this.rootView = nestedScrollView;
        this.btnChangeTuitionBpu = button;
        this.btnImageZoom = textView;
        this.containerFollowedProgram = linearLayout;
        this.divtvBeginingLossJobMemberValue = view;
        this.divtvInfoLastPaymentValue = view2;
        this.followedProgramDivider = view3;
        this.imgBackground = imageView;
        this.imgDigitalCard = imageView2;
        this.infoCompanyNameDivider = view4;
        this.infoLastWagesDivider = view5;
        this.infoLossJobDivider = view6;
        this.infoPensionDivider = view7;
        this.infoSegmentDivider = view8;
        this.jhtStatusClaimDivider = view9;
        this.layoutToolbar = layoutToolbarCenterBinding;
        this.membershipStatusDivider = view10;
        this.msvDetailDigitalCard = multiStateView;
        this.periodPaymentPensionDivider = view11;
        this.tvBeginingLossJobMember = textView2;
        this.tvBeginingLossJobMemberLabel = textView3;
        this.tvInfoCompanyName = textView4;
        this.tvInfoCompanyNameLabel = textView5;
        this.tvInfoLastPayment = textView6;
        this.tvInfoLastPaymentLabel = textView7;
        this.tvInfoLastWages = textView8;
        this.tvInfoLastWagesLabel = textView9;
        this.tvInfoPension = textView10;
        this.tvInfoPensionLabel = textView11;
        this.tvInfoSegmentLabel = textView12;
        this.tvInfoSegmentName = textView13;
        this.tvJhtStatusClaim = textView14;
        this.tvJhtStatusClaimLabel = textView15;
        this.tvMembershipInfo = textView16;
        this.tvMembershipStatus = textView17;
        this.tvMembershipStatusLabel = textView18;
        this.tvPeriodPaymentLossJobLabel = textView19;
        this.tvPeriodPaymentPension = textView20;
        this.tvPeriodPaymentPensionLabel = textView21;
        this.tvPeriodPaymentlossJob = textView22;
        this.tvProgramJoined = textView23;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final NestedScrollView getRoot() {
        return this.rootView;
    }

    public static ActivityDetailDigitalCardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityDetailDigitalCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_detail_digital_card, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityDetailDigitalCardBinding bind(View view) {
        int i = R.id.btnChangeTuitionBpu;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnChangeTuitionBpu);
        if (button != null) {
            i = R.id.btnImageZoom;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.btnImageZoom);
            if (textView != null) {
                i = R.id.containerFollowedProgram;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.containerFollowedProgram);
                if (linearLayout != null) {
                    i = R.id.divtvBeginingLossJobMemberValue;
                    View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.divtvBeginingLossJobMemberValue);
                    if (viewFindChildViewById != null) {
                        i = R.id.divtvInfoLastPaymentValue;
                        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.divtvInfoLastPaymentValue);
                        if (viewFindChildViewById2 != null) {
                            i = R.id.followedProgramDivider;
                            View viewFindChildViewById3 = ViewBindings.findChildViewById(view, R.id.followedProgramDivider);
                            if (viewFindChildViewById3 != null) {
                                i = R.id.imgBackground;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgBackground);
                                if (imageView != null) {
                                    i = R.id.imgDigitalCard;
                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imgDigitalCard);
                                    if (imageView2 != null) {
                                        i = R.id.infoCompanyNameDivider;
                                        View viewFindChildViewById4 = ViewBindings.findChildViewById(view, R.id.infoCompanyNameDivider);
                                        if (viewFindChildViewById4 != null) {
                                            i = R.id.infoLastWagesDivider;
                                            View viewFindChildViewById5 = ViewBindings.findChildViewById(view, R.id.infoLastWagesDivider);
                                            if (viewFindChildViewById5 != null) {
                                                i = R.id.infoLossJobDivider;
                                                View viewFindChildViewById6 = ViewBindings.findChildViewById(view, R.id.infoLossJobDivider);
                                                if (viewFindChildViewById6 != null) {
                                                    i = R.id.infoPensionDivider;
                                                    View viewFindChildViewById7 = ViewBindings.findChildViewById(view, R.id.infoPensionDivider);
                                                    if (viewFindChildViewById7 != null) {
                                                        i = R.id.infoSegmentDivider;
                                                        View viewFindChildViewById8 = ViewBindings.findChildViewById(view, R.id.infoSegmentDivider);
                                                        if (viewFindChildViewById8 != null) {
                                                            i = R.id.jhtStatusClaimDivider;
                                                            View viewFindChildViewById9 = ViewBindings.findChildViewById(view, R.id.jhtStatusClaimDivider);
                                                            if (viewFindChildViewById9 != null) {
                                                                i = R.id.layout_toolbar;
                                                                View viewFindChildViewById10 = ViewBindings.findChildViewById(view, R.id.layout_toolbar);
                                                                if (viewFindChildViewById10 != null) {
                                                                    LayoutToolbarCenterBinding layoutToolbarCenterBindingBind = LayoutToolbarCenterBinding.bind(viewFindChildViewById10);
                                                                    i = R.id.membershipStatusDivider;
                                                                    View viewFindChildViewById11 = ViewBindings.findChildViewById(view, R.id.membershipStatusDivider);
                                                                    if (viewFindChildViewById11 != null) {
                                                                        i = R.id.msvDetailDigitalCard;
                                                                        MultiStateView multiStateView = (MultiStateView) ViewBindings.findChildViewById(view, R.id.msvDetailDigitalCard);
                                                                        if (multiStateView != null) {
                                                                            i = R.id.periodPaymentPensionDivider;
                                                                            View viewFindChildViewById12 = ViewBindings.findChildViewById(view, R.id.periodPaymentPensionDivider);
                                                                            if (viewFindChildViewById12 != null) {
                                                                                i = R.id.tvBeginingLossJobMember;
                                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvBeginingLossJobMember);
                                                                                if (textView2 != null) {
                                                                                    i = R.id.tvBeginingLossJobMemberLabel;
                                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvBeginingLossJobMemberLabel);
                                                                                    if (textView3 != null) {
                                                                                        i = R.id.tvInfoCompanyName;
                                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvInfoCompanyName);
                                                                                        if (textView4 != null) {
                                                                                            i = R.id.tvInfoCompanyNameLabel;
                                                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvInfoCompanyNameLabel);
                                                                                            if (textView5 != null) {
                                                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvInfoLastPayment);
                                                                                                if (textView6 != null) {
                                                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tvInfoLastPaymentLabel);
                                                                                                    if (textView7 != null) {
                                                                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvInfoLastWages);
                                                                                                        if (textView8 != null) {
                                                                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tvInfoLastWagesLabel);
                                                                                                            if (textView9 != null) {
                                                                                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tvInfoPension);
                                                                                                                if (textView10 != null) {
                                                                                                                    TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tvInfoPensionLabel);
                                                                                                                    if (textView11 != null) {
                                                                                                                        TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.tvInfoSegmentLabel);
                                                                                                                        if (textView12 != null) {
                                                                                                                            TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.tvInfoSegmentName);
                                                                                                                            if (textView13 != null) {
                                                                                                                                TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.tvJhtStatusClaim);
                                                                                                                                if (textView14 != null) {
                                                                                                                                    TextView textView15 = (TextView) ViewBindings.findChildViewById(view, R.id.tvJhtStatusClaimLabel);
                                                                                                                                    if (textView15 != null) {
                                                                                                                                        TextView textView16 = (TextView) ViewBindings.findChildViewById(view, R.id.tvMembershipInfo);
                                                                                                                                        if (textView16 != null) {
                                                                                                                                            TextView textView17 = (TextView) ViewBindings.findChildViewById(view, R.id.tvMembershipStatus);
                                                                                                                                            if (textView17 != null) {
                                                                                                                                                TextView textView18 = (TextView) ViewBindings.findChildViewById(view, R.id.tvMembershipStatusLabel);
                                                                                                                                                if (textView18 != null) {
                                                                                                                                                    TextView textView19 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPeriodPaymentLossJobLabel);
                                                                                                                                                    if (textView19 != null) {
                                                                                                                                                        TextView textView20 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPeriodPaymentPension);
                                                                                                                                                        if (textView20 != null) {
                                                                                                                                                            TextView textView21 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPeriodPaymentPensionLabel);
                                                                                                                                                            if (textView21 != null) {
                                                                                                                                                                TextView textView22 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPeriodPaymentlossJob);
                                                                                                                                                                if (textView22 != null) {
                                                                                                                                                                    TextView textView23 = (TextView) ViewBindings.findChildViewById(view, R.id.tvProgramJoined);
                                                                                                                                                                    if (textView23 != null) {
                                                                                                                                                                        return new ActivityDetailDigitalCardBinding((NestedScrollView) view, button, textView, linearLayout, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, imageView, imageView2, viewFindChildViewById4, viewFindChildViewById5, viewFindChildViewById6, viewFindChildViewById7, viewFindChildViewById8, viewFindChildViewById9, layoutToolbarCenterBindingBind, viewFindChildViewById11, multiStateView, viewFindChildViewById12, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22, textView23);
                                                                                                                                                                    }
                                                                                                                                                                    i = R.id.tvProgramJoined;
                                                                                                                                                                } else {
                                                                                                                                                                    i = R.id.tvPeriodPaymentlossJob;
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                i = R.id.tvPeriodPaymentPensionLabel;
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            i = R.id.tvPeriodPaymentPension;
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        i = R.id.tvPeriodPaymentLossJobLabel;
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    i = R.id.tvMembershipStatusLabel;
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                i = R.id.tvMembershipStatus;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            i = R.id.tvMembershipInfo;
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        i = R.id.tvJhtStatusClaimLabel;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    i = R.id.tvJhtStatusClaim;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                i = R.id.tvInfoSegmentName;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            i = R.id.tvInfoSegmentLabel;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        i = R.id.tvInfoPensionLabel;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i = R.id.tvInfoPension;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i = R.id.tvInfoLastWagesLabel;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = R.id.tvInfoLastWages;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.tvInfoLastPaymentLabel;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.tvInfoLastPayment;
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

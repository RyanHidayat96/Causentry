package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentScholarBenefitStep1Binding implements ViewBinding {
    public final TextView fragScholarAddress;
    public final View fragScholarAddressDivider;
    public final TextView fragScholarAddressTitle;
    public final TextView fragScholarDob;
    public final TextView fragScholarEmail;
    public final View fragScholarEmailDivider;
    public final TextView fragScholarEmailTitle;
    public final TextView fragScholarGender;
    public final View fragScholarGenderDivider;
    public final TextView fragScholarGenderTitle;
    public final TextView fragScholarKpjpeserta;
    public final View fragScholarKpjpesertaDivider;
    public final TextView fragScholarKpjpesertaTitle;
    public final TextView fragScholarNamapeserta;
    public final View fragScholarNamapesertaDivider;
    public final TextView fragScholarNamapesertaTitle;
    public final TextView fragScholarName;
    public final View fragScholarNameDivider;
    public final TextView fragScholarNameTitle;
    public final TextView fragScholarNik;
    public final View fragScholarNikDivider;
    public final TextView fragScholarNikTitle;
    public final TextView fragScholarNikpeserta;
    public final View fragScholarNikpesertaDivider;
    public final TextView fragScholarNikpesertaTitle;
    public final Barrier fragScholarPdobBarrier;
    public final View fragScholarPdobDivider;
    public final TextView fragScholarPdobTitle;
    public final TextView fragScholarPhone;
    public final View fragScholarPhoneDivider;
    public final TextView fragScholarPhoneTitle;
    public final TextView fragScholarPob;
    public final TextView fragScholarStatuspenerima;
    public final View fragScholarStatuspenerimaDivider;
    public final TextView fragScholarStatuspenerimaTitle;
    public final MaterialButton fragScholarStep1Next;
    private final ScrollView rootView;

    private FragmentScholarBenefitStep1Binding(ScrollView scrollView, TextView textView, View view, TextView textView2, TextView textView3, TextView textView4, View view2, TextView textView5, TextView textView6, View view3, TextView textView7, TextView textView8, View view4, TextView textView9, TextView textView10, View view5, TextView textView11, TextView textView12, View view6, TextView textView13, TextView textView14, View view7, TextView textView15, TextView textView16, View view8, TextView textView17, Barrier barrier, View view9, TextView textView18, TextView textView19, View view10, TextView textView20, TextView textView21, TextView textView22, View view11, TextView textView23, MaterialButton materialButton) {
        this.rootView = scrollView;
        this.fragScholarAddress = textView;
        this.fragScholarAddressDivider = view;
        this.fragScholarAddressTitle = textView2;
        this.fragScholarDob = textView3;
        this.fragScholarEmail = textView4;
        this.fragScholarEmailDivider = view2;
        this.fragScholarEmailTitle = textView5;
        this.fragScholarGender = textView6;
        this.fragScholarGenderDivider = view3;
        this.fragScholarGenderTitle = textView7;
        this.fragScholarKpjpeserta = textView8;
        this.fragScholarKpjpesertaDivider = view4;
        this.fragScholarKpjpesertaTitle = textView9;
        this.fragScholarNamapeserta = textView10;
        this.fragScholarNamapesertaDivider = view5;
        this.fragScholarNamapesertaTitle = textView11;
        this.fragScholarName = textView12;
        this.fragScholarNameDivider = view6;
        this.fragScholarNameTitle = textView13;
        this.fragScholarNik = textView14;
        this.fragScholarNikDivider = view7;
        this.fragScholarNikTitle = textView15;
        this.fragScholarNikpeserta = textView16;
        this.fragScholarNikpesertaDivider = view8;
        this.fragScholarNikpesertaTitle = textView17;
        this.fragScholarPdobBarrier = barrier;
        this.fragScholarPdobDivider = view9;
        this.fragScholarPdobTitle = textView18;
        this.fragScholarPhone = textView19;
        this.fragScholarPhoneDivider = view10;
        this.fragScholarPhoneTitle = textView20;
        this.fragScholarPob = textView21;
        this.fragScholarStatuspenerima = textView22;
        this.fragScholarStatuspenerimaDivider = view11;
        this.fragScholarStatuspenerimaTitle = textView23;
        this.fragScholarStep1Next = materialButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentScholarBenefitStep1Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentScholarBenefitStep1Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_scholar_benefit_step1, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentScholarBenefitStep1Binding bind(View view) {
        int i = R.id.frag_scholar_address;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.frag_scholar_address);
        if (textView != null) {
            i = R.id.frag_scholar_address_divider;
            View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.frag_scholar_address_divider);
            if (viewFindChildViewById != null) {
                i = R.id.frag_scholar_address_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.frag_scholar_address_title);
                if (textView2 != null) {
                    i = R.id.frag_scholar_dob;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.frag_scholar_dob);
                    if (textView3 != null) {
                        i = R.id.frag_scholar_email;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.frag_scholar_email);
                        if (textView4 != null) {
                            i = R.id.frag_scholar_email_divider;
                            View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.frag_scholar_email_divider);
                            if (viewFindChildViewById2 != null) {
                                i = R.id.frag_scholar_email_title;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.frag_scholar_email_title);
                                if (textView5 != null) {
                                    i = R.id.frag_scholar_gender;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.frag_scholar_gender);
                                    if (textView6 != null) {
                                        i = R.id.frag_scholar_gender_divider;
                                        View viewFindChildViewById3 = ViewBindings.findChildViewById(view, R.id.frag_scholar_gender_divider);
                                        if (viewFindChildViewById3 != null) {
                                            i = R.id.frag_scholar_gender_title;
                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.frag_scholar_gender_title);
                                            if (textView7 != null) {
                                                i = R.id.frag_scholar_kpjpeserta;
                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.frag_scholar_kpjpeserta);
                                                if (textView8 != null) {
                                                    i = R.id.frag_scholar_kpjpeserta_divider;
                                                    View viewFindChildViewById4 = ViewBindings.findChildViewById(view, R.id.frag_scholar_kpjpeserta_divider);
                                                    if (viewFindChildViewById4 != null) {
                                                        i = R.id.frag_scholar_kpjpeserta_title;
                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.frag_scholar_kpjpeserta_title);
                                                        if (textView9 != null) {
                                                            i = R.id.frag_scholar_namapeserta;
                                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.frag_scholar_namapeserta);
                                                            if (textView10 != null) {
                                                                i = R.id.frag_scholar_namapeserta_divider;
                                                                View viewFindChildViewById5 = ViewBindings.findChildViewById(view, R.id.frag_scholar_namapeserta_divider);
                                                                if (viewFindChildViewById5 != null) {
                                                                    i = R.id.frag_scholar_namapeserta_title;
                                                                    TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.frag_scholar_namapeserta_title);
                                                                    if (textView11 != null) {
                                                                        i = R.id.frag_scholar_name;
                                                                        TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.frag_scholar_name);
                                                                        if (textView12 != null) {
                                                                            i = R.id.frag_scholar_name_divider;
                                                                            View viewFindChildViewById6 = ViewBindings.findChildViewById(view, R.id.frag_scholar_name_divider);
                                                                            if (viewFindChildViewById6 != null) {
                                                                                i = R.id.frag_scholar_name_title;
                                                                                TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.frag_scholar_name_title);
                                                                                if (textView13 != null) {
                                                                                    i = R.id.frag_scholar_nik;
                                                                                    TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.frag_scholar_nik);
                                                                                    if (textView14 != null) {
                                                                                        i = R.id.frag_scholar_nik_divider;
                                                                                        View viewFindChildViewById7 = ViewBindings.findChildViewById(view, R.id.frag_scholar_nik_divider);
                                                                                        if (viewFindChildViewById7 != null) {
                                                                                            i = R.id.frag_scholar_nik_title;
                                                                                            TextView textView15 = (TextView) ViewBindings.findChildViewById(view, R.id.frag_scholar_nik_title);
                                                                                            if (textView15 != null) {
                                                                                                TextView textView16 = (TextView) ViewBindings.findChildViewById(view, R.id.frag_scholar_nikpeserta);
                                                                                                if (textView16 != null) {
                                                                                                    View viewFindChildViewById8 = ViewBindings.findChildViewById(view, R.id.frag_scholar_nikpeserta_divider);
                                                                                                    if (viewFindChildViewById8 != null) {
                                                                                                        TextView textView17 = (TextView) ViewBindings.findChildViewById(view, R.id.frag_scholar_nikpeserta_title);
                                                                                                        if (textView17 != null) {
                                                                                                            Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, R.id.frag_scholar_pdob_barrier);
                                                                                                            if (barrier != null) {
                                                                                                                View viewFindChildViewById9 = ViewBindings.findChildViewById(view, R.id.frag_scholar_pdob_divider);
                                                                                                                if (viewFindChildViewById9 != null) {
                                                                                                                    TextView textView18 = (TextView) ViewBindings.findChildViewById(view, R.id.frag_scholar_pdob_title);
                                                                                                                    if (textView18 != null) {
                                                                                                                        TextView textView19 = (TextView) ViewBindings.findChildViewById(view, R.id.frag_scholar_phone);
                                                                                                                        if (textView19 != null) {
                                                                                                                            View viewFindChildViewById10 = ViewBindings.findChildViewById(view, R.id.frag_scholar_phone_divider);
                                                                                                                            if (viewFindChildViewById10 != null) {
                                                                                                                                TextView textView20 = (TextView) ViewBindings.findChildViewById(view, R.id.frag_scholar_phone_title);
                                                                                                                                if (textView20 != null) {
                                                                                                                                    TextView textView21 = (TextView) ViewBindings.findChildViewById(view, R.id.frag_scholar_pob);
                                                                                                                                    if (textView21 != null) {
                                                                                                                                        TextView textView22 = (TextView) ViewBindings.findChildViewById(view, R.id.frag_scholar_statuspenerima);
                                                                                                                                        if (textView22 != null) {
                                                                                                                                            View viewFindChildViewById11 = ViewBindings.findChildViewById(view, R.id.frag_scholar_statuspenerima_divider);
                                                                                                                                            if (viewFindChildViewById11 != null) {
                                                                                                                                                TextView textView23 = (TextView) ViewBindings.findChildViewById(view, R.id.frag_scholar_statuspenerima_title);
                                                                                                                                                if (textView23 != null) {
                                                                                                                                                    MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.frag_scholar_step1_next);
                                                                                                                                                    if (materialButton != null) {
                                                                                                                                                        return new FragmentScholarBenefitStep1Binding((ScrollView) view, textView, viewFindChildViewById, textView2, textView3, textView4, viewFindChildViewById2, textView5, textView6, viewFindChildViewById3, textView7, textView8, viewFindChildViewById4, textView9, textView10, viewFindChildViewById5, textView11, textView12, viewFindChildViewById6, textView13, textView14, viewFindChildViewById7, textView15, textView16, viewFindChildViewById8, textView17, barrier, viewFindChildViewById9, textView18, textView19, viewFindChildViewById10, textView20, textView21, textView22, viewFindChildViewById11, textView23, materialButton);
                                                                                                                                                    }
                                                                                                                                                    i = R.id.frag_scholar_step1_next;
                                                                                                                                                } else {
                                                                                                                                                    i = R.id.frag_scholar_statuspenerima_title;
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                i = R.id.frag_scholar_statuspenerima_divider;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            i = R.id.frag_scholar_statuspenerima;
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        i = R.id.frag_scholar_pob;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    i = R.id.frag_scholar_phone_title;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                i = R.id.frag_scholar_phone_divider;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            i = R.id.frag_scholar_phone;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        i = R.id.frag_scholar_pdob_title;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i = R.id.frag_scholar_pdob_divider;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i = R.id.frag_scholar_pdob_barrier;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = R.id.frag_scholar_nikpeserta_title;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.frag_scholar_nikpeserta_divider;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.frag_scholar_nikpeserta;
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

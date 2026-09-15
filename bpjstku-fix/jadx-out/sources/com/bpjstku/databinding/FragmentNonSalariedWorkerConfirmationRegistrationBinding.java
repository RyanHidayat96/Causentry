package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentNonSalariedWorkerConfirmationRegistrationBinding implements ViewBinding {
    public final Button btnConfirmation;
    public final AppCompatCheckBox cbAgreeTermCondition;
    private final NestedScrollView rootView;
    public final RecyclerView rvProgramChoosen;
    public final TextView tvAddress;
    public final TextView tvAddressValue;
    public final TextView tvBirthDate;
    public final TextView tvChoosePaymentMonth;
    public final TextView tvEmail;
    public final TextView tvEndWorking;
    public final TextView tvIdCard;
    public final TextView tvJobTitle;
    public final TextView tvJobTitleSecond;
    public final TextView tvName;
    public final TextView tvPhoneNumber;
    public final TextView tvRegisterBranchOffice;
    public final TextView tvSalary;
    public final TextView tvStartWorking;
    public final TextView tvTitleBirthDate;
    public final TextView tvTitleBranchOfficeRegiestered;
    public final TextView tvTitleChoosePaymentMonth;
    public final TextView tvTitleEmail;
    public final TextView tvTitleEndWorking;
    public final TextView tvTitleIdCard;
    public final TextView tvTitleJobInfo;
    public final TextView tvTitleJobInfoSecond;
    public final TextView tvTitleName;
    public final TextView tvTitlePhoneNumber;
    public final TextView tvTitleProgramChoosen;
    public final TextView tvTitleSalary;
    public final TextView tvTitleStartWorking;
    public final TextView tvTitleWorkLocationCity;
    public final TextView tvTitleWorkingHour;
    public final TextView tvTitleZipCode;
    public final TextView tvWorkLocationCity;
    public final TextView tvZipCode;
    public final View viewDividerAddress;
    public final View viewDividerBirthDate;
    public final View viewDividerBranchOfficeRegiestered;
    public final View viewDividerEmail;
    public final View viewDividerIdCard;
    public final View viewDividerJobInfo;
    public final View viewDividerName;
    public final View viewDividerPaymentMonth;
    public final View viewDividerPhoneNumber;
    public final View viewDividerSalary;
    public final View viewDividerWork;
    public final View viewDividerZipCode;
    public final View viewDividertvWorkLocationCity;

    private FragmentNonSalariedWorkerConfirmationRegistrationBinding(NestedScrollView nestedScrollView, Button button, AppCompatCheckBox appCompatCheckBox, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, TextView textView19, TextView textView20, TextView textView21, TextView textView22, TextView textView23, TextView textView24, TextView textView25, TextView textView26, TextView textView27, TextView textView28, TextView textView29, TextView textView30, TextView textView31, TextView textView32, View view, View view2, View view3, View view4, View view5, View view6, View view7, View view8, View view9, View view10, View view11, View view12, View view13) {
        this.rootView = nestedScrollView;
        this.btnConfirmation = button;
        this.cbAgreeTermCondition = appCompatCheckBox;
        this.rvProgramChoosen = recyclerView;
        this.tvAddress = textView;
        this.tvAddressValue = textView2;
        this.tvBirthDate = textView3;
        this.tvChoosePaymentMonth = textView4;
        this.tvEmail = textView5;
        this.tvEndWorking = textView6;
        this.tvIdCard = textView7;
        this.tvJobTitle = textView8;
        this.tvJobTitleSecond = textView9;
        this.tvName = textView10;
        this.tvPhoneNumber = textView11;
        this.tvRegisterBranchOffice = textView12;
        this.tvSalary = textView13;
        this.tvStartWorking = textView14;
        this.tvTitleBirthDate = textView15;
        this.tvTitleBranchOfficeRegiestered = textView16;
        this.tvTitleChoosePaymentMonth = textView17;
        this.tvTitleEmail = textView18;
        this.tvTitleEndWorking = textView19;
        this.tvTitleIdCard = textView20;
        this.tvTitleJobInfo = textView21;
        this.tvTitleJobInfoSecond = textView22;
        this.tvTitleName = textView23;
        this.tvTitlePhoneNumber = textView24;
        this.tvTitleProgramChoosen = textView25;
        this.tvTitleSalary = textView26;
        this.tvTitleStartWorking = textView27;
        this.tvTitleWorkLocationCity = textView28;
        this.tvTitleWorkingHour = textView29;
        this.tvTitleZipCode = textView30;
        this.tvWorkLocationCity = textView31;
        this.tvZipCode = textView32;
        this.viewDividerAddress = view;
        this.viewDividerBirthDate = view2;
        this.viewDividerBranchOfficeRegiestered = view3;
        this.viewDividerEmail = view4;
        this.viewDividerIdCard = view5;
        this.viewDividerJobInfo = view6;
        this.viewDividerName = view7;
        this.viewDividerPaymentMonth = view8;
        this.viewDividerPhoneNumber = view9;
        this.viewDividerSalary = view10;
        this.viewDividerWork = view11;
        this.viewDividerZipCode = view12;
        this.viewDividertvWorkLocationCity = view13;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final NestedScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentNonSalariedWorkerConfirmationRegistrationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentNonSalariedWorkerConfirmationRegistrationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_non_salaried_worker_confirmation_registration, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentNonSalariedWorkerConfirmationRegistrationBinding bind(View view) {
        int i = R.id.btnConfirmation;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnConfirmation);
        if (button != null) {
            i = R.id.cbAgreeTermCondition;
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(view, R.id.cbAgreeTermCondition);
            if (appCompatCheckBox != null) {
                i = R.id.rvProgramChoosen;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvProgramChoosen);
                if (recyclerView != null) {
                    i = R.id.tvAddress;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvAddress);
                    if (textView != null) {
                        i = R.id.tvAddressValue;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvAddressValue);
                        if (textView2 != null) {
                            i = R.id.tvBirthDate;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvBirthDate);
                            if (textView3 != null) {
                                i = R.id.tvChoosePaymentMonth;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvChoosePaymentMonth);
                                if (textView4 != null) {
                                    i = R.id.tvEmail;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvEmail);
                                    if (textView5 != null) {
                                        i = R.id.tvEndWorking;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvEndWorking);
                                        if (textView6 != null) {
                                            i = R.id.tvIdCard;
                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tvIdCard);
                                            if (textView7 != null) {
                                                i = R.id.tvJobTitle;
                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvJobTitle);
                                                if (textView8 != null) {
                                                    i = R.id.tvJobTitleSecond;
                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tvJobTitleSecond);
                                                    if (textView9 != null) {
                                                        i = R.id.tvName;
                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(view, R.id.tvName);
                                                        if (textView10 != null) {
                                                            i = R.id.tvPhoneNumber;
                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(view, R.id.tvPhoneNumber);
                                                            if (textView11 != null) {
                                                                i = R.id.tvRegisterBranchOffice;
                                                                TextView textView12 = (TextView) ViewBindings.findChildViewById(view, R.id.tvRegisterBranchOffice);
                                                                if (textView12 != null) {
                                                                    i = R.id.tvSalary;
                                                                    TextView textView13 = (TextView) ViewBindings.findChildViewById(view, R.id.tvSalary);
                                                                    if (textView13 != null) {
                                                                        i = R.id.tvStartWorking;
                                                                        TextView textView14 = (TextView) ViewBindings.findChildViewById(view, R.id.tvStartWorking);
                                                                        if (textView14 != null) {
                                                                            i = R.id.tvTitleBirthDate;
                                                                            TextView textView15 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleBirthDate);
                                                                            if (textView15 != null) {
                                                                                i = R.id.tvTitleBranchOfficeRegiestered;
                                                                                TextView textView16 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleBranchOfficeRegiestered);
                                                                                if (textView16 != null) {
                                                                                    i = R.id.tvTitleChoosePaymentMonth;
                                                                                    TextView textView17 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleChoosePaymentMonth);
                                                                                    if (textView17 != null) {
                                                                                        i = R.id.tvTitleEmail;
                                                                                        TextView textView18 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleEmail);
                                                                                        if (textView18 != null) {
                                                                                            i = R.id.tvTitleEndWorking;
                                                                                            TextView textView19 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleEndWorking);
                                                                                            if (textView19 != null) {
                                                                                                TextView textView20 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleIdCard);
                                                                                                if (textView20 != null) {
                                                                                                    TextView textView21 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleJobInfo);
                                                                                                    if (textView21 != null) {
                                                                                                        TextView textView22 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleJobInfoSecond);
                                                                                                        if (textView22 != null) {
                                                                                                            TextView textView23 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleName);
                                                                                                            if (textView23 != null) {
                                                                                                                TextView textView24 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitlePhoneNumber);
                                                                                                                if (textView24 != null) {
                                                                                                                    TextView textView25 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleProgramChoosen);
                                                                                                                    if (textView25 != null) {
                                                                                                                        TextView textView26 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleSalary);
                                                                                                                        if (textView26 != null) {
                                                                                                                            TextView textView27 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleStartWorking);
                                                                                                                            if (textView27 != null) {
                                                                                                                                TextView textView28 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleWorkLocationCity);
                                                                                                                                if (textView28 != null) {
                                                                                                                                    TextView textView29 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleWorkingHour);
                                                                                                                                    if (textView29 != null) {
                                                                                                                                        TextView textView30 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleZipCode);
                                                                                                                                        if (textView30 != null) {
                                                                                                                                            TextView textView31 = (TextView) ViewBindings.findChildViewById(view, R.id.tvWorkLocationCity);
                                                                                                                                            if (textView31 != null) {
                                                                                                                                                TextView textView32 = (TextView) ViewBindings.findChildViewById(view, R.id.tvZipCode);
                                                                                                                                                if (textView32 != null) {
                                                                                                                                                    View viewFindChildViewById = ViewBindings.findChildViewById(view, R.id.viewDividerAddress);
                                                                                                                                                    if (viewFindChildViewById != null) {
                                                                                                                                                        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, R.id.viewDividerBirthDate);
                                                                                                                                                        if (viewFindChildViewById2 != null) {
                                                                                                                                                            View viewFindChildViewById3 = ViewBindings.findChildViewById(view, R.id.viewDividerBranchOfficeRegiestered);
                                                                                                                                                            if (viewFindChildViewById3 != null) {
                                                                                                                                                                View viewFindChildViewById4 = ViewBindings.findChildViewById(view, R.id.viewDividerEmail);
                                                                                                                                                                if (viewFindChildViewById4 != null) {
                                                                                                                                                                    View viewFindChildViewById5 = ViewBindings.findChildViewById(view, R.id.viewDividerIdCard);
                                                                                                                                                                    if (viewFindChildViewById5 != null) {
                                                                                                                                                                        View viewFindChildViewById6 = ViewBindings.findChildViewById(view, R.id.viewDividerJobInfo);
                                                                                                                                                                        if (viewFindChildViewById6 != null) {
                                                                                                                                                                            View viewFindChildViewById7 = ViewBindings.findChildViewById(view, R.id.viewDividerName);
                                                                                                                                                                            if (viewFindChildViewById7 != null) {
                                                                                                                                                                                View viewFindChildViewById8 = ViewBindings.findChildViewById(view, R.id.viewDividerPaymentMonth);
                                                                                                                                                                                if (viewFindChildViewById8 != null) {
                                                                                                                                                                                    View viewFindChildViewById9 = ViewBindings.findChildViewById(view, R.id.viewDividerPhoneNumber);
                                                                                                                                                                                    if (viewFindChildViewById9 != null) {
                                                                                                                                                                                        View viewFindChildViewById10 = ViewBindings.findChildViewById(view, R.id.viewDividerSalary);
                                                                                                                                                                                        if (viewFindChildViewById10 != null) {
                                                                                                                                                                                            View viewFindChildViewById11 = ViewBindings.findChildViewById(view, R.id.viewDividerWork);
                                                                                                                                                                                            if (viewFindChildViewById11 != null) {
                                                                                                                                                                                                View viewFindChildViewById12 = ViewBindings.findChildViewById(view, R.id.viewDividerZipCode);
                                                                                                                                                                                                if (viewFindChildViewById12 != null) {
                                                                                                                                                                                                    View viewFindChildViewById13 = ViewBindings.findChildViewById(view, R.id.viewDividertvWorkLocationCity);
                                                                                                                                                                                                    if (viewFindChildViewById13 != null) {
                                                                                                                                                                                                        return new FragmentNonSalariedWorkerConfirmationRegistrationBinding((NestedScrollView) view, button, appCompatCheckBox, recyclerView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22, textView23, textView24, textView25, textView26, textView27, textView28, textView29, textView30, textView31, textView32, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, viewFindChildViewById5, viewFindChildViewById6, viewFindChildViewById7, viewFindChildViewById8, viewFindChildViewById9, viewFindChildViewById10, viewFindChildViewById11, viewFindChildViewById12, viewFindChildViewById13);
                                                                                                                                                                                                    }
                                                                                                                                                                                                    i = R.id.viewDividertvWorkLocationCity;
                                                                                                                                                                                                } else {
                                                                                                                                                                                                    i = R.id.viewDividerZipCode;
                                                                                                                                                                                                }
                                                                                                                                                                                            } else {
                                                                                                                                                                                                i = R.id.viewDividerWork;
                                                                                                                                                                                            }
                                                                                                                                                                                        } else {
                                                                                                                                                                                            i = R.id.viewDividerSalary;
                                                                                                                                                                                        }
                                                                                                                                                                                    } else {
                                                                                                                                                                                        i = R.id.viewDividerPhoneNumber;
                                                                                                                                                                                    }
                                                                                                                                                                                } else {
                                                                                                                                                                                    i = R.id.viewDividerPaymentMonth;
                                                                                                                                                                                }
                                                                                                                                                                            } else {
                                                                                                                                                                                i = R.id.viewDividerName;
                                                                                                                                                                            }
                                                                                                                                                                        } else {
                                                                                                                                                                            i = R.id.viewDividerJobInfo;
                                                                                                                                                                        }
                                                                                                                                                                    } else {
                                                                                                                                                                        i = R.id.viewDividerIdCard;
                                                                                                                                                                    }
                                                                                                                                                                } else {
                                                                                                                                                                    i = R.id.viewDividerEmail;
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                i = R.id.viewDividerBranchOfficeRegiestered;
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            i = R.id.viewDividerBirthDate;
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        i = R.id.viewDividerAddress;
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    i = R.id.tvZipCode;
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                i = R.id.tvWorkLocationCity;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            i = R.id.tvTitleZipCode;
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        i = R.id.tvTitleWorkingHour;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    i = R.id.tvTitleWorkLocationCity;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                i = R.id.tvTitleStartWorking;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            i = R.id.tvTitleSalary;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        i = R.id.tvTitleProgramChoosen;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i = R.id.tvTitlePhoneNumber;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i = R.id.tvTitleName;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = R.id.tvTitleJobInfoSecond;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.tvTitleJobInfo;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.tvTitleIdCard;
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

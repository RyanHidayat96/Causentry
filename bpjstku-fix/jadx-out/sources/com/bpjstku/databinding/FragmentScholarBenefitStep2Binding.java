package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentScholarBenefitStep2Binding implements ViewBinding {
    public final RecyclerView fragScholarEdubenefitRecycler;
    public final TextInputEditText fragScholarEdustate;
    public final TextInputLayout fragScholarEdustateLay;
    public final AppCompatEditText fragScholarNote;
    public final TextView fragScholarNoteTitle;
    public final MaterialButton fragScholarStep2Next;
    private final ScrollView rootView;

    private FragmentScholarBenefitStep2Binding(ScrollView scrollView, RecyclerView recyclerView, TextInputEditText textInputEditText, TextInputLayout textInputLayout, AppCompatEditText appCompatEditText, TextView textView, MaterialButton materialButton) {
        this.rootView = scrollView;
        this.fragScholarEdubenefitRecycler = recyclerView;
        this.fragScholarEdustate = textInputEditText;
        this.fragScholarEdustateLay = textInputLayout;
        this.fragScholarNote = appCompatEditText;
        this.fragScholarNoteTitle = textView;
        this.fragScholarStep2Next = materialButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentScholarBenefitStep2Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentScholarBenefitStep2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_scholar_benefit_step2, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentScholarBenefitStep2Binding bind(View view) {
        int i = R.id.frag_scholar_edubenefit_recycler;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.frag_scholar_edubenefit_recycler);
        if (recyclerView != null) {
            i = R.id.frag_scholar_edustate;
            TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.frag_scholar_edustate);
            if (textInputEditText != null) {
                i = R.id.frag_scholar_edustate_lay;
                TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.frag_scholar_edustate_lay);
                if (textInputLayout != null) {
                    i = R.id.frag_scholar_note;
                    AppCompatEditText appCompatEditText = (AppCompatEditText) ViewBindings.findChildViewById(view, R.id.frag_scholar_note);
                    if (appCompatEditText != null) {
                        i = R.id.frag_scholar_note_title;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.frag_scholar_note_title);
                        if (textView != null) {
                            i = R.id.frag_scholar_step2_next;
                            MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.frag_scholar_step2_next);
                            if (materialButton != null) {
                                return new FragmentScholarBenefitStep2Binding((ScrollView) view, recyclerView, textInputEditText, textInputLayout, appCompatEditText, textView, materialButton);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}

package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import defpackage.nonCancellationPropagating;
import defpackage.successfulAsList;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentVocationalChooseTrainingBinding implements ViewBinding {
    public final ImageView imgArrowRight;
    private final ScrollView rootView;
    public final RecyclerView rvVocationalTraining;
    public final SearchView svTraining;
    public final TextView tvTrainingField;
    public final TextView tvTrainingFieldAndRegionTitle;
    public final TextView tvTrainingRegion;

    private FragmentVocationalChooseTrainingBinding(ScrollView scrollView, ImageView imageView, RecyclerView recyclerView, SearchView searchView, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = scrollView;
        this.imgArrowRight = imageView;
        this.rvVocationalTraining = recyclerView;
        this.svTraining = searchView;
        this.tvTrainingField = textView;
        this.tvTrainingFieldAndRegionTitle = textView2;
        this.tvTrainingRegion = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentVocationalChooseTrainingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentVocationalChooseTrainingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_vocational_choose_training, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentVocationalChooseTrainingBinding bind(View view) {
        int i = R.id.imgArrowRight;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imgArrowRight);
        if (imageView != null) {
            i = R.id.rvVocationalTraining;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvVocationalTraining);
            if (recyclerView != null) {
                i = R.id.svTraining;
                SearchView searchView = (SearchView) ViewBindings.findChildViewById(view, R.id.svTraining);
                if (searchView != null) {
                    i = R.id.tvTrainingField;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvTrainingField);
                    if (textView != null) {
                        i = R.id.tvTrainingFieldAndRegionTitle;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTrainingFieldAndRegionTitle);
                        if (textView2 != null) {
                            i = R.id.tvTrainingRegion;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTrainingRegion);
                            if (textView3 != null) {
                                return new FragmentVocationalChooseTrainingBinding((ScrollView) view, imageView, recyclerView, searchView, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        nonCancellationPropagating.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0] = successfulAsList.b[0];
    }
}

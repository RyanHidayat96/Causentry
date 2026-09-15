package com.bpjstku.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bpjstku.R;
import com.bpjstku.util.custom.CircleImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentPelaporHomeBinding implements ViewBinding {
    public final CircleImageView civProfile;
    public final CardView cvInfoJp;
    private final NestedScrollView rootView;
    public final RecyclerView rvServices;
    public final TextView tvGreeting;
    public final TextView tvNamesWorker;

    private FragmentPelaporHomeBinding(NestedScrollView nestedScrollView, CircleImageView circleImageView, CardView cardView, RecyclerView recyclerView, TextView textView, TextView textView2) {
        this.rootView = nestedScrollView;
        this.civProfile = circleImageView;
        this.cvInfoJp = cardView;
        this.rvServices = recyclerView;
        this.tvGreeting = textView;
        this.tvNamesWorker = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final NestedScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentPelaporHomeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPelaporHomeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_pelapor_home, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentPelaporHomeBinding bind(View view) {
        int i = R.id.civProfile;
        CircleImageView circleImageView = (CircleImageView) ViewBindings.findChildViewById(view, R.id.civProfile);
        if (circleImageView != null) {
            i = R.id.cvInfoJp;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.cvInfoJp);
            if (cardView != null) {
                i = R.id.rvServices;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvServices);
                if (recyclerView != null) {
                    i = R.id.tvGreeting;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvGreeting);
                    if (textView != null) {
                        i = R.id.tvNamesWorker;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNamesWorker);
                        if (textView2 != null) {
                            return new FragmentPelaporHomeBinding((NestedScrollView) view, circleImageView, cardView, recyclerView, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}

package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.ListAdapter;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.internal.zzmr;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzah extends ListAdapter {
    private final zzai zza;
    private int zzb;
    private boolean zzc;

    public zzah(zzai zzaiVar) {
        super(new zzag(null));
        this.zzc = true;
        this.zza = zzaiVar;
    }

    @Override // androidx.recyclerview.widget.ListAdapter
    public final void submitList(List list) {
        try {
            this.zzc = (this.zzb != 0 || list == null || list.isEmpty()) ? false : true;
            this.zzb = list != null ? list.size() : 0;
            super.submitList(list);
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzak onCreateViewHolder(ViewGroup viewGroup, int i) {
        try {
            return new zzak(this.zza, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.places_autocomplete_prediction, viewGroup, false));
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(zzak zzakVar, int i) {
        try {
            zzakVar.zza((AutocompletePrediction) getItem(i), this.zzc);
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }
}

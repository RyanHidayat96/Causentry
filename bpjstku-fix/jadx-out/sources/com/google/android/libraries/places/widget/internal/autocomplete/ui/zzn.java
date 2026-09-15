package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.ListAdapter;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.internal.zzmr;
import com.google.android.libraries.places.internal.zzng;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class zzn extends ListAdapter {
    private final zzp zza;
    private int zzb;
    private boolean zzc;
    private final zzng zzd;

    public zzn(zzp zzpVar, zzng zzngVar) {
        super(new zzm(null));
        this.zzc = true;
        this.zza = zzpVar;
        this.zzd = zzngVar;
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
    public final zzq onCreateViewHolder(ViewGroup viewGroup, int i) {
        try {
            return new zzq(this.zza, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.autocomplete_prediction_item, viewGroup, false), this.zzd);
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(zzq zzqVar, int i) {
        try {
            zzqVar.zza((AutocompletePrediction) getItem(i), this.zzc);
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }
}

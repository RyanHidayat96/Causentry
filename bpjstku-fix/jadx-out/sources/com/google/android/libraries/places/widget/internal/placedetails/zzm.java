package com.google.android.libraries.places.widget.internal.placedetails;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzm extends RecyclerView.Adapter {
    private final List zza;

    public zzm(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.zza = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.zza.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        zzi zziVar = (zzi) this.zza.get(i);
        if (zziVar instanceof zzh) {
            return 0;
        }
        if (zziVar instanceof zzf) {
            return 1;
        }
        if (zziVar instanceof zzg) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        int itemViewType = viewHolder.getItemViewType();
        if (itemViewType == 0) {
            TextView textViewZza = ((zzl) viewHolder).zza();
            Object obj = this.zza.get(i);
            Intrinsics.checkNotNull(obj, "");
            textViewZza.setText(((zzh) obj).zza());
            return;
        }
        if (itemViewType != 1) {
            return;
        }
        TextView textViewZza2 = ((zzj) viewHolder).zza();
        Object obj2 = this.zza.get(i);
        Intrinsics.checkNotNull(obj2, "");
        textViewZza2.setText(((zzf) obj2).zza());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.about_tab_section_title, viewGroup, false);
            Intrinsics.checkNotNull(viewInflate);
            return new zzl(viewInflate);
        }
        if (i == 1) {
            View viewInflate2 = layoutInflaterFrom.inflate(R.layout.about_tab_feature, viewGroup, false);
            Intrinsics.checkNotNull(viewInflate2);
            return new zzj(viewInflate2);
        }
        if (i != 2) {
            throw new IllegalArgumentException("Invalid view type");
        }
        View viewInflate3 = layoutInflaterFrom.inflate(R.layout.about_tab_horizontal_divider, viewGroup, false);
        Intrinsics.checkNotNull(viewInflate3);
        return new zzk(viewInflate3);
    }
}

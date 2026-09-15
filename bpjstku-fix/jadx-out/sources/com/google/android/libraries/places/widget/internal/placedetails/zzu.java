package com.google.android.libraries.places.widget.internal.placedetails;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzu extends RecyclerView.Adapter {
    private final List zza;

    public zzu(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.zza = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.zza.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        zzt zztVar = (zzt) viewHolder;
        Intrinsics.checkNotNullParameter(zztVar, "");
        zztVar.zza().setText((CharSequence) this.zza.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.expanded_open_hours_item, viewGroup, false);
        Intrinsics.checkNotNull(viewInflate);
        return new zzt(viewInflate);
    }
}

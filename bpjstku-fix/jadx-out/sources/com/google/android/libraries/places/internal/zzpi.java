package com.google.android.libraries.places.internal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.widget.model.Orientation;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class zzpi extends RecyclerView.Adapter {
    private final CoroutineScope zza;
    private final Orientation zzb;
    private final int zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final List zzg;
    private final zzoy zzh;
    private final Function1 zzi;
    private List zzj;
    private int zzk;

    public zzpi(CoroutineScope coroutineScope, Orientation orientation, int i, int i2, boolean z, boolean z2, List list, zzoy zzoyVar, Function1 function1) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(orientation, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.zza = coroutineScope;
        this.zzb = orientation;
        this.zzc = i;
        this.zzd = i2;
        this.zze = z;
        this.zzf = z2;
        this.zzg = list;
        this.zzh = zzoyVar;
        this.zzi = function1;
        this.zzj = CollectionsKt.emptyList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.zzg.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        View viewInflate = this.zzb == Orientation.HORIZONTAL ? LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.place_details_compact_horizontal_fragment, viewGroup, false) : LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.place_details_compact_vertical_fragment, viewGroup, false);
        viewInflate.post(new zzpe(this, viewInflate));
        Intrinsics.checkNotNull(viewInflate);
        return new zzph(this, viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(zzph zzphVar, int i) {
        Intrinsics.checkNotNullParameter(zzphVar, "");
        onBindViewHolder(zzphVar, i, CollectionsKt.emptyList());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(zzph zzphVar, final int i, List list) {
        Intrinsics.checkNotNullParameter(zzphVar, "");
        Intrinsics.checkNotNullParameter(list, "");
        View view = zzphVar.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        Context context = zzphVar.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        zzoy zzoyVar = this.zzh;
        CoroutineScope coroutineScope = this.zza;
        int i2 = this.zzc;
        Orientation orientation = this.zzb;
        final com.google.android.libraries.places.widget.internal.placedetails.zzar zzarVar = new com.google.android.libraries.places.widget.internal.placedetails.zzar(view, context, zzoyVar, coroutineScope, i2, orientation);
        View view2 = zzphVar.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        Context context2 = zzphVar.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        com.google.android.libraries.places.widget.internal.placedetails.zzaa zzaaVar = new com.google.android.libraries.places.widget.internal.placedetails.zzaa(view2, context2, i2, zzoyVar != null ? zzoyVar.zzb() : null);
        Object objFirstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) list);
        String str = objFirstOrNull instanceof String ? (String) objFirstOrNull : null;
        if (str != null) {
            if (Intrinsics.areEqual(str, "place-image")) {
                zzphVar.itemView.post(new Runnable() { // from class: com.google.android.libraries.places.internal.zzpd
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.libraries.places.widget.internal.placedetails.zzar zzarVar2 = zzarVar;
                        zzpi zzpiVar = this;
                        zzarVar2.zzc((com.google.android.libraries.places.widget.internal.placedetails.zzbp) zzpiVar.zzj.get(i), zzpiVar.zzb == Orientation.VERTICAL || zzpiVar.zzk > 350, zzpiVar.zzj.size() > 0);
                    }
                });
                return;
            }
            return;
        }
        if (orientation == Orientation.HORIZONTAL) {
            zzphVar.zza();
        } else {
            zzphVar.zzb();
        }
        zzphVar.itemView.findViewById(R.id.loading_indicator).setVisibility(8);
        zzphVar.itemView.findViewById(R.id.loading_failed_message).setVisibility(8);
        zzarVar.zza();
        List list2 = this.zzg;
        zzarVar.zzb((Place) list2.get(i), this.zzf);
        zzaaVar.zza((Place) list2.get(i), true, true, true, true, true, null);
        zzaaVar.zzb((Place) list2.get(i), null);
        if (this.zzj.size() > i) {
            zzphVar.itemView.post(new Runnable() { // from class: com.google.android.libraries.places.internal.zzpc
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.libraries.places.widget.internal.placedetails.zzar zzarVar2 = zzarVar;
                    zzpi zzpiVar = this;
                    zzarVar2.zzc((com.google.android.libraries.places.widget.internal.placedetails.zzbp) zzpiVar.zzj.get(i), zzpiVar.zzb == Orientation.VERTICAL || zzpiVar.zzk > 350, zzpiVar.zzj.size() > 0);
                }
            });
        }
    }

    public final void zzc(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.zzj = list;
        int itemCount = getItemCount();
        for (int i = 0; i < itemCount; i++) {
            notifyItemChanged(i, "place-image");
        }
    }
}

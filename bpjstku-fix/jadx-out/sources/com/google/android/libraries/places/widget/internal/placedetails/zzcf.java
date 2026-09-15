package com.google.android.libraries.places.widget.internal.placedetails;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.Review;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcf extends FragmentStateAdapter {
    private final boolean zza;
    private final Place zzb;
    private final int zzc;
    private final List zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcf(FragmentManager fragmentManager, Lifecycle lifecycle, Context context, boolean z, boolean z2, Place place, int i) {
        super(fragmentManager, lifecycle);
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(lifecycle, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(place, "");
        this.zza = z2;
        this.zzb = place;
        this.zzc = i;
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        if (zzce.zzk(place, context, z2)) {
            listCreateListBuilder.add(1);
        }
        Intrinsics.checkNotNullParameter(place, "");
        List<Review> reviews = place.getReviews();
        if (reviews != null && !reviews.isEmpty()) {
            listCreateListBuilder.add(2);
        }
        Intrinsics.checkNotNullParameter(place, "");
        if (z && (zzce.zza(place) || zzce.zzb(place) || zzce.zzc(place) || zzce.zzd(place) || zzce.zze(place) || zzce.zzf(place) || zzce.zzg(place) || zzce.zzh(place) || zzce.zzi(place) || zzce.zzj(place))) {
            listCreateListBuilder.add(3);
        }
        this.zzd = CollectionsKt.build(listCreateListBuilder);
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final Fragment createFragment(int i) {
        int itemViewType = getItemViewType(i);
        if (itemViewType == 1) {
            int i2 = this.zzc;
            boolean z = this.zza;
            zzal zzalVar = new zzal();
            Bundle bundle = new Bundle();
            bundle.putInt("arg-theme-res-id", i2);
            bundle.putBoolean("arg-opening-hours-requested", z);
            zzalVar.setArguments(bundle);
            return zzalVar;
        }
        if (itemViewType == 2) {
            int i3 = this.zzc;
            zzbw zzbwVar = new zzbw();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("arg-theme-res-id", i3);
            zzbwVar.setArguments(bundle2);
            return zzbwVar;
        }
        if (itemViewType != 3) {
            throw new IllegalStateException("Invalid tab type.");
        }
        int i4 = this.zzc;
        zze zzeVar = new zze();
        Bundle bundle3 = new Bundle();
        bundle3.putInt("arg-theme-res-id", i4);
        zzeVar.setArguments(bundle3);
        return zzeVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.zzd.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((Number) this.zzd.get(i)).intValue();
    }
}

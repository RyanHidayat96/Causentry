package com.google.android.libraries.places.widget.internal.photoviewer;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzk extends FragmentStateAdapter {
    private List zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzk(FragmentManager fragmentManager, Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(lifecycle, "");
        this.zza = CollectionsKt.emptyList();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final Fragment createFragment(int i) {
        com.google.android.libraries.places.widget.model.zzi zziVar = (com.google.android.libraries.places.widget.model.zzi) this.zza.get(i);
        Intrinsics.checkNotNullParameter(zziVar, "");
        zzj zzjVar = new zzj();
        Bundle bundle = new Bundle();
        bundle.putParcelable("page_data", zziVar);
        zzjVar.setArguments(bundle);
        return zzjVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.zza.size();
    }

    public final void zza(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.zza = list;
    }
}

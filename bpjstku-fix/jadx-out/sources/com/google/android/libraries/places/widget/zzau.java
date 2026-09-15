package com.google.android.libraries.places.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.widget.model.AttributionPosition;
import com.google.android.libraries.places.widget.model.Orientation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzau extends RecyclerView.OnScrollListener {
    final /* synthetic */ PlaceSearchFragment zza;

    zzau(PlaceSearchFragment placeSearchFragment) {
        this.zza = placeSearchFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        View viewFindViewById;
        Intrinsics.checkNotNullParameter(recyclerView, "");
        super.onScrolled(recyclerView, i, i2);
        if (!recyclerView.canScrollVertically(1)) {
            View viewFindViewById2 = this.zza.requireView().findViewById(R.id.place_search_border_bottom);
            if (viewFindViewById2 != null) {
                viewFindViewById2.setVisibility(8);
                return;
            }
            return;
        }
        PlaceSearchFragment placeSearchFragment = this.zza;
        Orientation orientationZzc = PlaceSearchFragment.zzc(placeSearchFragment);
        if (orientationZzc == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            orientationZzc = null;
        }
        if (orientationZzc == Orientation.VERTICAL && placeSearchFragment.zza() == AttributionPosition.BOTTOM && (viewFindViewById = placeSearchFragment.requireView().findViewById(R.id.place_search_border_bottom)) != null) {
            viewFindViewById.setVisibility(0);
        }
    }
}

package com.google.android.libraries.places.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzat extends RecyclerView.ItemDecoration {
    final /* synthetic */ PlaceSearchFragment zza;

    zzat(PlaceSearchFragment placeSearchFragment) {
        this.zza = placeSearchFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        int layoutDirection = recyclerView.getLayoutDirection();
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int itemCount = state.getItemCount();
        boolean z = true;
        boolean z2 = layoutDirection == 1;
        if (childAdapterPosition == itemCount - 1) {
            if (z2) {
            }
            rect.set(0, 0, 0, 0);
        }
        z = z2;
        if (childAdapterPosition != 0 || !z) {
            PlaceSearchFragment placeSearchFragment = this.zza;
            Context contextRequireContext = placeSearchFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            int iZzb = PlaceSearchFragment.zzb(placeSearchFragment);
            int[] iArr = R.styleable.PlacesMaterialThemeAttrs;
            Intrinsics.checkNotNullExpressionValue(iArr, "");
            TypedArray typedArrayObtainStyledAttributes = contextRequireContext.obtainStyledAttributes(iZzb, iArr);
            rect.set(0, 0, (int) typedArrayObtainStyledAttributes.getDimension(R.styleable.PlacesMaterialThemeAttrs_placesSpacingMedium, placeSearchFragment.requireContext().getResources().getDimensionPixelSize(R.dimen.gmp_sys_measurement_spacing_medium)), 0);
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        rect.set(0, 0, 0, 0);
    }
}

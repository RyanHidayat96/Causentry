package com.google.android.libraries.places.widget.internal.placedetails;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzv extends RecyclerView.ViewHolder {
    private final TextView zza;
    private final TextView zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzv(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        View viewFindViewById = view.findViewById(R.id.fuel_type);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.zza = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.fuel_price);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.zzb = (TextView) viewFindViewById2;
    }

    public final TextView zza() {
        return this.zza;
    }

    public final TextView zzb() {
        return this.zzb;
    }
}

package com.google.android.libraries.places.widget.internal.placedetails;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzq extends RecyclerView.ViewHolder {
    private final TextView zza;
    private final TextView zzb;
    private final CardView zzc;
    private final TextView zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzq(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        View viewFindViewById = view.findViewById(R.id.connector_name);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.zza = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.max_charge_rate);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.zzb = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.chargers_available_card);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        this.zzc = (CardView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.chargers_available);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
        this.zzd = (TextView) viewFindViewById4;
    }

    public final TextView zza() {
        return this.zza;
    }

    public final TextView zzb() {
        return this.zzb;
    }

    public final CardView zzc() {
        return this.zzc;
    }

    public final TextView zzd() {
        return this.zzd;
    }
}

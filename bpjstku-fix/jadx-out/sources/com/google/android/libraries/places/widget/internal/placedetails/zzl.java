package com.google.android.libraries.places.widget.internal.placedetails;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final class zzl extends RecyclerView.ViewHolder {
    private final TextView zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzl(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        View viewFindViewById = view.findViewById(R.id.section_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.zza = (TextView) viewFindViewById;
    }

    public final TextView zza() {
        return this.zza;
    }
}

package com.google.android.libraries.places.widget.internal.placedetails;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzca extends RecyclerView.ViewHolder {
    private final ConstraintLayout zza;
    private final ImageView zzb;
    private final TextView zzc;
    private final TextView zzd;
    private final RatingStarsView zze;
    private final TextView zzf;
    private final ImageView zzg;
    private final View zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzca(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        View viewFindViewById = view.findViewById(R.id.author_attribution);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.zza = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.author_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.zzb = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.author_name);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        this.zzc = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.publish_time);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
        this.zzd = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.rating_stars);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "");
        this.zze = (RatingStarsView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.review_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "");
        this.zzf = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.review_options);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "");
        this.zzg = (ImageView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.report_review);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "");
        this.zzh = viewFindViewById8;
    }

    public final ConstraintLayout zza() {
        return this.zza;
    }

    public final ImageView zzb() {
        return this.zzb;
    }

    public final TextView zzc() {
        return this.zzc;
    }

    public final TextView zzd() {
        return this.zzd;
    }

    public final RatingStarsView zze() {
        return this.zze;
    }

    public final TextView zzf() {
        return this.zzf;
    }

    public final ImageView zzg() {
        return this.zzg;
    }

    public final View zzh() {
        return this.zzh;
    }
}

package com.google.android.libraries.places.widget.internal.placedetails;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.Review;
import com.google.android.libraries.places.internal.zzoq;
import com.google.android.libraries.places.internal.zzor;
import defpackage.ViewPortBuilder;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcd extends RecyclerView.Adapter {
    public static final /* synthetic */ int zza = 0;
    private final List zzb;
    private final CoroutineScope zzc;
    private final int zzd;
    private final zzor zze;

    public zzcd(List list, zzor zzorVar, CoroutineScope coroutineScope, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.zzb = list;
        this.zze = zzorVar;
        this.zzc = coroutineScope;
        this.zzd = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzd(Context context, zzcd zzcdVar, zzca zzcaVar, Review review, View view) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(review.getFlagContentUri());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Intrinsics.checkNotNull(context);
            new zzoq(context, zzcdVar.zzd).show();
        }
        zzcaVar.zzh().setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zze(Context context, zzcd zzcdVar, Review review, View view) {
        Intent intent = new Intent("android.intent.action.VIEW");
        String uri = review.getAuthorAttribution().getUri();
        intent.setData(uri != null ? Uri.parse(uri) : null);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Intrinsics.checkNotNull(context);
            new zzoq(context, zzcdVar.zzd).show();
        }
    }

    private static final void zzf(View view, CharSequence charSequence) {
        if (charSequence == null || StringsKt.isBlank(charSequence)) {
            view.setVisibility(8);
            return;
        }
        if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
        view.setVisibility(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.zzb.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        final zzca zzcaVar = (zzca) viewHolder;
        Intrinsics.checkNotNullParameter(zzcaVar, "");
        final Review review = (Review) this.zzb.get(i);
        final Context context = zzcaVar.itemView.getContext();
        String photoUri = review.getAuthorAttribution().getPhotoUri();
        Drawable drawable = context.getDrawable(R.drawable.review_author_image_placeholder);
        zzcaVar.zzb().setImageDrawable(drawable);
        if (photoUri != null) {
            b.TuitionPaymentFragmentbindingInflater1(this.zzc, null, null, new zzcc(this, photoUri, zzcaVar, drawable, null), 3, null);
        }
        zzf(zzcaVar.zzc(), review.getAuthorAttribution().getName());
        zzf(zzcaVar.zzd(), review.getRelativePublishTimeDescription());
        RatingStarsView ratingStarsViewZze = zzcaVar.zze();
        Double rating = review.getRating();
        Intrinsics.checkNotNullExpressionValue(rating, "");
        ratingStarsViewZze.zza(rating.doubleValue());
        TextView textViewZzf = zzcaVar.zzf();
        String text = review.getText();
        zzf(textViewZzf, text != null ? text : "");
        zzcaVar.zzg().setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzbz
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    View viewZzh = zzcaVar.zzh();
                    if (viewZzh.getVisibility() == 0) {
                        viewZzh.setVisibility(8);
                    } else {
                        viewZzh.setVisibility(0);
                    }
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        zzcaVar.zzh().setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzbx
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    zzcd.zzd(context, this, zzcaVar, review, view);
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        zzcaVar.zza().setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzby
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view);
                try {
                    zzcd.zze(context, this, review, view);
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
        zzcaVar.zza().setContentDescription(context.getString(R.string.place_details_view_review_author_content_description, review.getAuthorAttribution().getName()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.place_details_reviews_item, viewGroup, false);
        Intrinsics.checkNotNull(viewInflate);
        return new zzca(viewInflate);
    }
}

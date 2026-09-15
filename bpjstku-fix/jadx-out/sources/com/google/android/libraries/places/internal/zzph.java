package com.google.android.libraries.places.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.R;
import defpackage.ViewPortBuilder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzph extends RecyclerView.ViewHolder {
    final /* synthetic */ zzpi zza;
    private final View zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzph(final zzpi zzpiVar, View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        this.zza = zzpiVar;
        this.zzb = view;
        if (zzpiVar.zze) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.internal.zzpg
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(View view2) {
                    ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view2);
                    try {
                        Integer numValueOf = Integer.valueOf(this.zza.getBindingAdapterPosition());
                        if (numValueOf.intValue() == -1) {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            zzpiVar.zzi.invoke(Integer.valueOf(numValueOf.intValue()));
                        }
                    } finally {
                        ViewPortBuilder.b();
                    }
                }
            });
            this.itemView.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.libraries.places.internal.zzpf
                @Override // android.view.View.OnTouchListener
                public final /* synthetic */ boolean onTouch(View view2, MotionEvent motionEvent) {
                    zzph.zzc(this.zza, view2, motionEvent);
                    return false;
                }
            });
        }
    }

    static /* synthetic */ boolean zzc(zzph zzphVar, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            zzphVar.zzb.findViewById(R.id.place_highlight_scrim).setVisibility(0);
        } else if (action == 1 || action == 3) {
            zzphVar.zzb.findViewById(R.id.place_highlight_scrim).setVisibility(8);
        }
        return false;
    }

    private final void zzd() {
        View view = this.zzb;
        ((TextView) view.findViewById(R.id.place_details_attribution)).setVisibility(8);
        ((ImageView) view.findViewById(R.id.legal_disclosures_icon)).setVisibility(8);
    }

    public final void zza() {
        View view = this.zzb;
        CardView cardView = (CardView) view.findViewById(R.id.place_details_compact_horizontal_card);
        cardView.setRadius(0.0f);
        cardView.getLayoutParams().width = -1;
        cardView.getLayoutParams().height = -2;
        ((ConstraintLayout) view.findViewById(R.id.place_details_horizontal_layout)).setForeground(null);
        ImageView imageView = (ImageView) view.findViewById(R.id.place_image);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        zzpi zzpiVar = this.zza;
        layoutParams.height = zzpiVar.zzd;
        imageView.getLayoutParams().width = zzpiVar.zzd;
        TextView textView = (TextView) view.findViewById(R.id.image_loading_failure_text);
        textView.getLayoutParams().height = zzpiVar.zzd;
        textView.getLayoutParams().width = zzpiVar.zzd;
        if (zzpiVar.zzd == view.getContext().getResources().getDimensionPixelSize(R.dimen.place_search_image_size_small)) {
            textView.setTextSize(2, 10.0f);
        }
        zzd();
    }

    public final void zzb() {
        View view = this.zzb;
        Context context = view.getContext();
        Intrinsics.checkNotNull(context);
        int i = this.zza.zzc;
        int[] iArr = R.styleable.PlacesMaterialThemeAttrs;
        Intrinsics.checkNotNullExpressionValue(iArr, "");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, iArr);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R.styleable.PlacesMaterialThemeAttrs_placesCornerRadiusCard, context.getResources().getDimensionPixelSize(R.dimen.gmp_sys_shape_corner_medium_corner_size));
        CardView cardView = (CardView) view.findViewById(R.id.place_details_compact_vertical_card);
        cardView.getLayoutParams().width = context.getResources().getDimensionPixelSize(R.dimen.place_search_horizontal_card_width);
        cardView.setRadius(dimension);
        typedArrayObtainStyledAttributes.recycle();
        View viewFindViewById = view.findViewById(R.id.place_details_vertical_layout);
        viewFindViewById.getLayoutParams().height = -1;
        viewFindViewById.setFocusable(true);
        ViewGroup.LayoutParams layoutParams = ((Button) view.findViewById(R.id.open_in_maps)).getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.bottomToBottom = 0;
        layoutParams2.verticalBias = 1.0f;
        zzd();
    }
}

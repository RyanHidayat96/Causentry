package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.internal.zzmr;
import defpackage.ViewPortBuilder;

/* JADX INFO: loaded from: classes3.dex */
public final class zzak extends RecyclerView.ViewHolder {
    private final TextView zza;
    private final TextView zzb;
    private AutocompletePrediction zzc;
    private boolean zzd;

    public zzak(final zzai zzaiVar, View view) {
        super(view);
        this.zza = (TextView) view.findViewById(R.id.places_autocomplete_prediction_primary_text);
        this.zzb = (TextView) view.findViewById(R.id.places_autocomplete_prediction_secondary_text);
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzaj
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view2) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view2);
                try {
                    this.zza.zzc(zzaiVar, view2);
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzc(zzai zzaiVar, View view) {
        AutocompletePrediction autocompletePrediction = this.zzc;
        if (autocompletePrediction == null) {
            return;
        }
        try {
            zzaiVar.zza(autocompletePrediction, getAdapterPosition());
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    public final void zza(AutocompletePrediction autocompletePrediction, boolean z) {
        this.zzc = autocompletePrediction;
        this.zzd = z;
        SpannableString primaryText = autocompletePrediction.getPrimaryText(new ForegroundColorSpan(ContextCompat.getColor(this.itemView.getContext(), R.color.places_autocomplete_prediction_primary_text_highlight)));
        TextView textView = this.zza;
        textView.setText(primaryText);
        TextView textView2 = this.zzb;
        SpannableString secondaryText = autocompletePrediction.getSecondaryText(null);
        textView2.setText(secondaryText);
        if (secondaryText.length() == 0) {
            textView2.setVisibility(8);
            textView.setGravity(16);
        } else {
            textView2.setVisibility(0);
            textView.setGravity(80);
        }
    }

    public final boolean zzb() {
        return this.zzd;
    }
}

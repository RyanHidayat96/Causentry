package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.internal.zzmr;
import com.google.android.libraries.places.internal.zzng;
import com.google.android.libraries.places.widget.model.AutocompleteListDensity;
import com.google.android.libraries.places.widget.model.AutocompleteUiCustomization;
import com.google.android.libraries.places.widget.model.AutocompleteUiIcon;
import com.google.android.material.color.MaterialColors;
import defpackage.ViewPortBuilder;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes4.dex */
public final class zzq extends RecyclerView.ViewHolder {
    private final TextView zza;
    private final TextView zzb;
    private final ImageView zzc;
    private final FrameLayout zzd;
    private final zzng zze;
    private AutocompletePrediction zzf;
    private boolean zzg;
    private final ForegroundColorSpan zzh;
    private final ForegroundColorSpan zzi;

    public zzq(final zzp zzpVar, View view, zzng zzngVar) {
        super(view);
        this.zzh = new ForegroundColorSpan(MaterialColors.getColor(view, R.attr.placesColorOnSurfaceVariant));
        this.zzi = new ForegroundColorSpan(MaterialColors.getColor(view, R.attr.placesColorOnSurface));
        this.zza = (TextView) view.findViewById(R.id.autocomplete_prediction_primary_text);
        this.zzb = (TextView) view.findViewById(R.id.autocomplete_prediction_secondary_text);
        this.zzc = (ImageView) view.findViewById(R.id.list_item_icon);
        this.zzd = (FrameLayout) view.findViewById(R.id.list_item_icon_container);
        this.zze = zzngVar;
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.zzo
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view2) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view2);
                try {
                    this.zza.zzc(zzpVar, view2);
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzc(zzp zzpVar, View view) {
        AutocompletePrediction autocompletePrediction = this.zzf;
        if (autocompletePrediction == null) {
            return;
        }
        try {
            zzpVar.zza(autocompletePrediction, getAdapterPosition());
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    public final void zza(AutocompletePrediction autocompletePrediction, boolean z) {
        String strConcat;
        this.zzf = autocompletePrediction;
        this.zzg = z;
        AutocompleteUiCustomization autocompleteUiCustomizationZzp = this.zze.zzp();
        if (autocompleteUiCustomizationZzp != null) {
            AutocompleteUiIcon zzc = autocompleteUiCustomizationZzp.getZzc();
            if (zzc != null) {
                int zza = zzc.getZza();
                if (zza != 0) {
                    this.zzd.setVisibility(0);
                    this.zzc.setImageResource(zza);
                } else {
                    this.zzd.setVisibility(8);
                }
            }
            AutocompleteListDensity zza2 = autocompleteUiCustomizationZzp.getZza();
            if (zza2 != null && zza2.ordinal() == 1) {
                this.zza.setSingleLine(false);
                this.zzb.setSingleLine(false);
            }
        }
        this.zza.setText(autocompletePrediction.getPrimaryText(this.zzh));
        SpannableString secondaryText = autocompletePrediction.getSecondaryText(null);
        Integer distanceMeters = this.zzf.getDistanceMeters();
        if (distanceMeters == null) {
            strConcat = "";
        } else {
            double dIntValue = ((double) distanceMeters.intValue()) * 6.21371E-4d;
            if (dIntValue % 1.0d == 0.0d) {
                int i = (int) dIntValue;
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 3);
                sb.append(i);
                sb.append(" mi");
                strConcat = sb.toString();
            } else {
                strConcat = String.valueOf(new DecimalFormat("#.#").format(dIntValue)).concat(" mi");
            }
        }
        TextView textView = this.zzb;
        textView.setVisibility(0);
        if (secondaryText.length() == 0 || strConcat.length() == 0) {
            if (strConcat.length() != 0) {
                textView.setText(strConcat);
                return;
            } else if (secondaryText.length() != 0) {
                textView.setText(secondaryText);
                return;
            } else {
                textView.setVisibility(8);
                return;
            }
        }
        String strValueOf = String.valueOf(secondaryText);
        StringBuilder sb2 = new StringBuilder(strConcat.length() + 5 + String.valueOf(strValueOf).length());
        sb2.append(strConcat);
        sb2.append("  ·  ");
        sb2.append(strValueOf);
        SpannableString spannableString = new SpannableString(sb2.toString());
        int length = strConcat.length();
        spannableString.setSpan(this.zzi, length + 2, length + 3, 33);
        textView.setText(spannableString);
    }

    public final boolean zzb() {
        return this.zzg;
    }
}

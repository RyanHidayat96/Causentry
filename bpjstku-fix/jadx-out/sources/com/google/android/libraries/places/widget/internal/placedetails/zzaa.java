package com.google.android.libraries.places.widget.internal.placedetails;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.AccessibilityOptions;
import com.google.android.libraries.places.api.model.Money;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.zzey;
import com.google.android.libraries.places.internal.zzdy;
import com.google.android.libraries.places.internal.zzoq;
import defpackage.ViewPortBuilder;
import java.util.Currency;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaa {
    private final View zza;
    private final Context zzb;
    private final int zzc;
    private final zzdy zzd;
    private final TextView zze;
    private final View zzf;
    private final LinearLayout zzg;
    private final TextView zzh;
    private final TextView zzi;
    private final TextView zzj;
    private final ImageView zzk;
    private final TextView zzl;
    private final TextView zzm;
    private final TextView zzn;
    private final TextView zzo;
    private final TextView zzp;
    private final TextView zzq;
    private final View zzr;

    public zzaa(View view, Context context, int i, zzdy zzdyVar) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(context, "");
        this.zza = view;
        this.zzb = context;
        this.zzc = i;
        this.zzd = zzdyVar;
        View viewFindViewById = view.findViewById(R.id.place_rating);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.zze = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.rating_stars);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.zzf = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.place_rating_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        this.zzg = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.place_rating_count);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
        this.zzh = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.place_type);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "");
        this.zzi = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.place_price);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "");
        this.zzj = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.wheelchair_accessibility_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "");
        this.zzk = (ImageView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.place_wheelchair_icon_label);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "");
        this.zzl = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.place_type_price_spacer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "");
        this.zzm = (TextView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.place_price_a11y_spacer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "");
        this.zzn = (TextView) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.place_open_status);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "");
        this.zzo = (TextView) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.place_open_status_and_time_spacer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "");
        this.zzp = (TextView) viewFindViewById12;
        View viewFindViewById13 = view.findViewById(R.id.place_next_open_or_close_time);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "");
        this.zzq = (TextView) viewFindViewById13;
        View viewFindViewById14 = view.findViewById(R.id.open_in_maps);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "");
        this.zzr = viewFindViewById14;
    }

    static /* synthetic */ void zzf(zzaa zzaaVar, Place place, zzp zzpVar, View view) throws Throwable {
        zzaaVar.zzg(zzh(place));
        if (zzpVar != null) {
            zzpVar.zze();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg(Intent intent) {
        try {
            this.zzb.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            new zzoq(this.zzb, this.zzc).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent zzh(Place place) {
        Uri googleMapsUri = place.getGoogleMapsUri();
        if (googleMapsUri == null) {
            String formattedAddress = place.getFormattedAddress();
            String id2 = place.getId();
            StringBuilder sb = new StringBuilder(String.valueOf(formattedAddress).length() + 64 + String.valueOf(id2).length());
            sb.append("https://www.google.com/maps/search/?api=1&query=");
            sb.append(formattedAddress);
            sb.append("&query_place_id=");
            sb.append(id2);
            googleMapsUri = Uri.parse(sb.toString());
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(googleMapsUri);
        return intent;
    }

    private static final void zzi(View view, CharSequence charSequence, boolean z) {
        if (!z || charSequence == null || StringsKt.isBlank(charSequence)) {
            view.setVisibility(8);
            return;
        }
        if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
        view.setVisibility(0);
    }

    public final void zza(Place place, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, zzp zzpVar) {
        String currencyCode;
        String string;
        Integer userRatingCount;
        String string2;
        Intrinsics.checkNotNullParameter(place, "");
        Double rating = place.getRating();
        if (rating == null || place.getUserRatingCount() == null || ((userRatingCount = place.getUserRatingCount()) != null && userRatingCount.intValue() == 0)) {
            zzi(this.zze, this.zzb.getString(R.string.place_details_no_reviews), z);
            this.zzf.setVisibility(8);
            this.zzh.setVisibility(8);
        } else {
            TextView textView = this.zze;
            zzi(textView, rating.toString(), z);
            View view = this.zzf;
            if (view instanceof RatingStarsView) {
                RatingStarsView ratingStarsView = (RatingStarsView) view;
                ratingStarsView.getLayoutParams().height = textView.getLineHeight();
                ratingStarsView.zza(rating.doubleValue());
            } else {
                view.getLayoutParams().height = textView.getLineHeight();
                view.getLayoutParams().width = textView.getLineHeight();
            }
            zzi(view, rating.toString(), z);
            int iDoubleValue = Intrinsics.areEqual(rating, 1.0d) ? (int) rating.doubleValue() : 5;
            LinearLayout linearLayout = this.zzg;
            Context context = this.zzb;
            linearLayout.setContentDescription(context.getResources().getQuantityString(R.plurals.place_details_ratings_content_description, iDoubleValue, rating.toString()));
            Integer userRatingCount2 = place.getUserRatingCount();
            if (userRatingCount2 != null) {
                string2 = context.getString(R.string.place_details_review_count, Integer.valueOf(userRatingCount2.intValue()));
                Intrinsics.checkNotNullExpressionValue(string2, "");
            } else {
                string2 = null;
            }
            SpannableString spannableString = new SpannableString(string2);
            spannableString.setSpan(new zzz(this, place, zzpVar), 1, spannableString.length() - 1, 33);
            TextView textView2 = this.zzh;
            zzi(textView2, spannableString, z);
            textView2.setMovementMethod(new LinkMovementMethod());
            Resources resources = context.getResources();
            int i = R.plurals.place_details_review_count_a11y_label;
            Integer userRatingCount3 = place.getUserRatingCount();
            textView2.setContentDescription(resources.getQuantityString(i, userRatingCount3 != null ? userRatingCount3.intValue() : 0, place.getUserRatingCount()));
        }
        TextView textView3 = this.zzi;
        zzi(textView3, place.getPrimaryTypeDisplayName(), z2);
        TextView textView4 = this.zzj;
        Context context2 = this.zzb;
        TextView textView5 = textView4;
        Intrinsics.checkNotNullParameter(place, "");
        Intrinsics.checkNotNullParameter(context2, "");
        zzey zzeyVarZza = place.zza();
        Money moneyZza = zzeyVarZza != null ? zzeyVarZza.zza() : null;
        zzey zzeyVarZza2 = place.zza();
        Money moneyZzb = zzeyVarZza2 != null ? zzeyVarZza2.zzb() : null;
        if (moneyZza == null || (currencyCode = moneyZza.getCurrencyCode()) == null) {
            currencyCode = moneyZzb != null ? moneyZzb.getCurrencyCode() : null;
        }
        if (place.zza() == null || currencyCode == null || moneyZza == null) {
            string = null;
        } else {
            Currency currency = Currency.getInstance(currencyCode);
            Intrinsics.checkNotNullExpressionValue(currency, "");
            String symbol = currency.getSymbol(Locale.getDefault());
            Intrinsics.checkNotNullExpressionValue(symbol, "");
            string = moneyZzb != null ? context2.getString(R.string.place_details_price_range, symbol, moneyZza.getUnits(), moneyZzb.getUnits()) : context2.getString(R.string.place_details_price_range_no_upper_bound, symbol, moneyZza.getUnits());
        }
        if (string == null) {
            Integer priceLevel = place.getPriceLevel();
            if (priceLevel != null && priceLevel.intValue() == 1) {
                string = context2.getString(R.string.place_details_price_level_1);
            } else if (priceLevel != null && priceLevel.intValue() == 2) {
                string = context2.getString(R.string.place_details_price_level_2);
            } else if (priceLevel == null || priceLevel.intValue() != 3) {
                string = (priceLevel != null && priceLevel.intValue() == 4) ? context2.getString(R.string.place_details_price_level_4) : null;
            } else {
                string = context2.getString(R.string.place_details_price_level_3);
            }
        }
        zzi(textView5, string, z3);
        AccessibilityOptions accessibilityOptions = place.getAccessibilityOptions();
        if ((accessibilityOptions != null ? accessibilityOptions.getWheelchairAccessibleEntrance() : null) == Place.BooleanPlaceAttributeValue.TRUE && z4) {
            ImageView imageView = this.zzk;
            imageView.setVisibility(0);
            TextView textView6 = this.zzl;
            imageView.getLayoutParams().height = textView6.getLineHeight();
            imageView.getLayoutParams().width = textView6.getLineHeight();
            if (textView3.getVisibility() == 8 && textView5.getVisibility() == 8) {
                textView6.setVisibility(0);
            } else {
                textView6.setVisibility(8);
            }
        } else {
            this.zzk.setVisibility(8);
            this.zzl.setVisibility(8);
        }
        TextView textView7 = this.zzo;
        TextView textView8 = textView7;
        zzi(textView8, zzad.zzc(place, context2), z5);
        textView7.setTextColor(zzad.zza(place, context2, this.zzc));
        TextView textView9 = this.zzq;
        zzdy zzdyVar = this.zzd;
        TextView textView10 = textView9;
        zzi(textView10, zzad.zzb(place, zzdyVar != null ? zzdyVar.zza() : null, context2), z5);
        if (textView3.getVisibility() == 0 && (textView5.getVisibility() == 0 || this.zzk.getVisibility() == 0)) {
            this.zzm.setVisibility(0);
        } else {
            this.zzm.setVisibility(8);
        }
        if (textView5.getVisibility() == 0 && this.zzk.getVisibility() == 0) {
            this.zzn.setVisibility(0);
        } else {
            this.zzn.setVisibility(8);
        }
        if (textView8.getVisibility() == 0 && textView10.getVisibility() == 0) {
            this.zzp.setVisibility(0);
        } else {
            this.zzp.setVisibility(8);
        }
    }

    public final void zzb(final Place place, final zzp zzpVar) {
        Intrinsics.checkNotNullParameter(place, "");
        View view = this.zzr;
        view.setVisibility(0);
        view.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzy
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view2) {
                ViewPortBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(view2);
                try {
                    zzaa.zzf(this.zza, place, zzpVar, view2);
                } finally {
                    ViewPortBuilder.b();
                }
            }
        });
    }

    public final void zzc() {
        this.zze.setVisibility(8);
        this.zzf.setVisibility(8);
        this.zzh.setVisibility(8);
        this.zzi.setVisibility(8);
        this.zzj.setVisibility(8);
        this.zzk.setVisibility(8);
        this.zzl.setVisibility(8);
        this.zzm.setVisibility(8);
        this.zzn.setVisibility(8);
        this.zzo.setVisibility(8);
        this.zzp.setVisibility(8);
        this.zzq.setVisibility(8);
        this.zzr.setVisibility(8);
    }
}

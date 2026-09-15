package com.google.android.libraries.places.widget;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.TypedValue;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.internal.zzmr;
import com.google.android.libraries.places.internal.zznf;
import com.google.android.libraries.places.internal.zzng;
import com.google.android.libraries.places.internal.zznj;
import com.google.android.libraries.places.internal.zzoc;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Autocomplete {
    public static Place getPlaceFromIntent(Intent intent) {
        return zznj.zza(intent);
    }

    public static Status getStatusFromIntent(Intent intent) {
        return zznj.zzb(intent);
    }

    private Autocomplete() {
    }

    public static class IntentBuilder {
        private final zznf zza;

        public IntentBuilder(AutocompleteActivityMode autocompleteActivityMode, List<Place.Field> list) {
            this.zza = zzng.zzt(autocompleteActivityMode, list, zzoc.INTENT);
        }

        public Intent build(Context context) {
            try {
                Intent intent = new Intent(context, (Class<?>) AutocompleteActivity.class);
                zznf zznfVar = this.zza;
                Resources.Theme theme = context.getTheme();
                TypedValue typedValue = new TypedValue();
                if (theme.resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
                    zznfVar.zzm(typedValue.data);
                }
                TypedValue typedValue2 = new TypedValue();
                if (theme.resolveAttribute(R.attr.colorPrimaryDark, typedValue2, true)) {
                    zznfVar.zzn(typedValue2.data);
                }
                intent.putExtra("places/AutocompleteOptions", zznfVar.zzs());
                return intent;
            } catch (Error | RuntimeException e2) {
                zzmr.zzb(e2);
                throw e2;
            }
        }

        public IntentBuilder setCountries(List<String> list) {
            this.zza.zzj(list);
            return this;
        }

        @Deprecated
        public IntentBuilder setCountry(String str) {
            this.zza.zzt(str);
            return this;
        }

        public IntentBuilder setHint(String str) {
            this.zza.zzg(str);
            return this;
        }

        public IntentBuilder setInitialQuery(String str) {
            this.zza.zzf(str);
            return this;
        }

        public IntentBuilder setLocationBias(LocationBias locationBias) {
            this.zza.zzh(locationBias);
            return this;
        }

        public IntentBuilder setLocationRestriction(LocationRestriction locationRestriction) {
            this.zza.zzi(locationRestriction);
            return this;
        }

        public IntentBuilder setRegionCode(String str) {
            this.zza.zzo(str);
            return this;
        }

        @Deprecated
        public IntentBuilder setTypeFilter(TypeFilter typeFilter) {
            this.zza.zzk(typeFilter);
            return this;
        }

        public IntentBuilder setTypesFilter(List<String> list) {
            this.zza.zzl(list);
            return this;
        }

        public final IntentBuilder zza(zzoc zzocVar) {
            this.zza.zzd(zzocVar);
            return this;
        }

        public IntentBuilder(zzng zzngVar) {
            this.zza = zzngVar.zzs();
        }
    }
}

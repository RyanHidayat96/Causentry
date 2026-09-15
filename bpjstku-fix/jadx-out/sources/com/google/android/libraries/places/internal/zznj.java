package com.google.android.libraries.places.internal;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import androidx.core.os.ConfigurationCompat;
import androidx.core.os.LocaleListCompat;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.Place;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class zznj {
    public static Place zza(Intent intent) {
        try {
            if (intent == null) {
                throw new NullPointerException("Intent must not be null.");
            }
            Place place = (Place) intent.getParcelableExtra("places/selected_place");
            if (place != null) {
                return place;
            }
            throw new NullPointerException("Intent expected to contain a Place, but doesn't.");
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    public static Status zzb(Intent intent) {
        try {
            if (intent == null) {
                throw new NullPointerException("Intent must not be null.");
            }
            Status status = (Status) intent.getParcelableExtra("places/status");
            if (status != null) {
                return status;
            }
            throw new NullPointerException("Intent expected to contain a Status, but doesn't.");
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    public static Status zzc(Intent intent) {
        return (Status) intent.getParcelableExtra("places/status");
    }

    public static zzng zzd(Intent intent) {
        return (zzng) intent.getParcelableExtra("places/AutocompleteOptions");
    }

    public static String zze(Context context, int i) {
        Object obj = ConfigurationCompat.getLocales(context.getResources().getConfiguration()).get(0);
        if (obj == null) {
            obj = Locale.getDefault();
        }
        Locale localeZzg = Places.isInitialized() ? Places.zzc().zzg() : obj;
        if (localeZzg.equals(obj)) {
            return context.getString(i);
        }
        LocaleListCompat localeListCompatForLanguageTags = LocaleListCompat.forLanguageTags(localeZzg.toLanguageTag());
        Configuration configuration = context.getResources().getConfiguration();
        ConfigurationCompat.setLocales(configuration, localeListCompatForLanguageTags);
        return context.createConfigurationContext(configuration).getString(i);
    }
}

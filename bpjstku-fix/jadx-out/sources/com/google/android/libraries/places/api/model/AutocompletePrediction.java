package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import android.text.SpannableString;
import android.text.style.CharacterStyle;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AutocompletePrediction implements Parcelable {

    public static abstract class Builder {
        public AutocompletePrediction build() {
            AutocompletePrediction autocompletePredictionZze = zze();
            setPlaceTypes(ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(autocompletePredictionZze.getPlaceTypes()));
            setTypes(ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(autocompletePredictionZze.getTypes()));
            zzb(ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(autocompletePredictionZze.zzd()));
            zzc(ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(autocompletePredictionZze.zze()));
            zzd(ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(autocompletePredictionZze.zzf()));
            return zze();
        }

        public abstract Integer getDistanceMeters();

        public abstract String getFullText();

        public abstract List<Place.Type> getPlaceTypes();

        public abstract String getPrimaryText();

        public abstract String getSecondaryText();

        public abstract List<String> getTypes();

        public abstract Builder setDistanceMeters(Integer num);

        public abstract Builder setFullText(String str);

        public abstract Builder setPlaceTypes(List<Place.Type> list);

        public abstract Builder setPrimaryText(String str);

        public abstract Builder setSecondaryText(String str);

        public abstract Builder setTypes(List<String> list);

        abstract Builder zza(String str);

        public abstract Builder zzb(List list);

        public abstract Builder zzc(List list);

        public abstract Builder zzd(List list);

        abstract AutocompletePrediction zze();
    }

    public static Builder builder(String str) {
        zzi zziVar = new zzi();
        zziVar.zzb(new ArrayList());
        zziVar.zza(str);
        zziVar.setPlaceTypes(new ArrayList());
        zziVar.zzc(new ArrayList());
        zziVar.zzd(new ArrayList());
        zziVar.setTypes(new ArrayList());
        zziVar.setFullText("");
        zziVar.setPrimaryText("");
        zziVar.setSecondaryText("");
        return zziVar;
    }

    private static final SpannableString zzg(String str, List list, CharacterStyle characterStyle) {
        SpannableString spannableString = new SpannableString(str);
        if (str.length() != 0 && characterStyle != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzek zzekVar = (zzek) it.next();
                spannableString.setSpan(CharacterStyle.wrap(characterStyle), zzekVar.zza(), zzekVar.zza() + zzekVar.zzb(), 0);
            }
        }
        return spannableString;
    }

    public abstract Integer getDistanceMeters();

    public SpannableString getFullText(CharacterStyle characterStyle) {
        return zzg(zza(), zzd(), characterStyle);
    }

    public abstract String getPlaceId();

    @Deprecated
    public abstract List<Place.Type> getPlaceTypes();

    public SpannableString getPrimaryText(CharacterStyle characterStyle) {
        return zzg(zzb(), zze(), characterStyle);
    }

    public SpannableString getSecondaryText(CharacterStyle characterStyle) {
        return zzg(zzc(), zzf(), characterStyle);
    }

    public abstract List<String> getTypes();

    abstract String zza();

    abstract String zzb();

    abstract String zzc();

    abstract List zzd();

    abstract List zze();

    abstract List zzf();
}

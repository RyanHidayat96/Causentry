package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.Place;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzjx {
    private final zziz zza;

    static final List zzb(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzatk zzatkVar = (zzatk) it.next();
            int iZza = zzatkVar.zza();
            int iZzc = zzatkVar.zzc();
            int iZza2 = zzatkVar.zza();
            com.google.android.libraries.places.api.model.zzej zzejVarZzc = com.google.android.libraries.places.api.model.zzek.zzc();
            zzejVarZzc.zza(iZza);
            zzejVarZzc.zzb(iZzc - iZza2);
            arrayList.add(zzejVarZzc.zzc());
        }
        return arrayList;
    }

    public final AutocompletePrediction zza(zzatn zzatnVar) {
        zzatg zzatgVarZzc = zzatnVar.zzc();
        if (!zzatnVar.zza()) {
            throw new IllegalArgumentException("Suggestion does not contain a PlacePrediction.");
        }
        List<Place.Type> listZza = this.zza.zza(zzatgVarZzc.zze());
        if (listZza == null) {
            listZza = ImmutableList.asInterface();
        }
        AutocompletePrediction.Builder builder = AutocompletePrediction.builder(zzatgVarZzc.zza());
        builder.setDistanceMeters(zzatgVarZzc.zzf() == 0 ? null : Integer.valueOf(zzatgVarZzc.zzf()));
        builder.setPlaceTypes(listZza);
        builder.setTypes(ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(zzatgVarZzc.zze()));
        builder.setFullText(zzatgVarZzc.zzc().zza());
        builder.zzb(zzb(zzatgVarZzc.zzc().zzc()));
        builder.setPrimaryText(zzatgVarZzc.zzd().zza().zza());
        builder.zzc(zzb(zzatgVarZzc.zzd().zza().zzc()));
        builder.setSecondaryText(zzatgVarZzc.zzd().zzc().zza());
        builder.zzd(zzb(zzatgVarZzc.zzd().zzc().zzc()));
        return builder.build();
    }

    zzjx(zziz zzizVar) {
        this.zza = zzizVar;
    }
}

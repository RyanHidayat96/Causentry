package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zznd extends zznh {
    private String zza;
    private ImmutableList zzb;
    private Place zzc;
    private AutocompletePrediction zzd;
    private AutocompleteSessionToken zze;
    private Status zzf;
    private int zzg;

    @Override // com.google.android.libraries.places.internal.zznh
    public final zznh zzb(List list) {
        this.zzb = list == null ? null : ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(list);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznh
    public final zzni zzg() {
        int i = this.zzg;
        if (i != 0) {
            return new zzne(i, this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, null);
        }
        throw new IllegalStateException("Missing required properties: type");
    }

    zznd() {
    }

    @Override // com.google.android.libraries.places.internal.zznh
    public final zznh zza(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznh
    public final zznh zzc(Place place) {
        this.zzc = place;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznh
    public final zznh zzd(AutocompletePrediction autocompletePrediction) {
        this.zzd = autocompletePrediction;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznh
    public final zznh zze(AutocompleteSessionToken autocompleteSessionToken) {
        this.zze = autocompleteSessionToken;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zznh
    public final zznh zzf(Status status) {
        this.zzf = status;
        return this;
    }

    public final zznh zzh(int i) {
        this.zzg = i;
        return this;
    }
}

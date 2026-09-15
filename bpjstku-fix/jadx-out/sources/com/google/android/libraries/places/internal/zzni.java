package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzni {
    public static zzni zzh() {
        return zzt(1).zzg();
    }

    public static zzni zzi() {
        return zzt(2).zzg();
    }

    public static zzni zzj() {
        return zzt(3).zzg();
    }

    public static zzni zzk() {
        return zzt(4).zzg();
    }

    public static zzni zzr() {
        zznh zznhVarZzt = zzt(10);
        zznhVarZzt.zzf(new Status(16));
        return zznhVarZzt.zzg();
    }

    private static zznh zzt(int i) {
        zznd zzndVar = new zznd();
        zzndVar.zzh(i);
        return zzndVar;
    }

    public abstract String zza();

    public abstract ImmutableList zzb();

    public abstract Place zzc();

    public abstract AutocompletePrediction zzd();

    public abstract AutocompleteSessionToken zze();

    public abstract Status zzf();

    public abstract int zzg();

    public static zzni zzl(List list) {
        zznh zznhVarZzt = zzt(5);
        zznhVarZzt.zzb(list);
        return zznhVarZzt.zzg();
    }

    public static zzni zzm(String str) {
        zznh zznhVarZzt = zzt(6);
        zznhVarZzt.zza(str);
        return zznhVarZzt.zzg();
    }

    public static zzni zzo(Place place) {
        zznh zznhVarZzt = zzt(8);
        zznhVarZzt.zzc(place);
        return zznhVarZzt.zzg();
    }

    public static zzni zzs(Status status) {
        zznh zznhVarZzt = zzt(10);
        zznhVarZzt.zzf(status);
        return zznhVarZzt.zzg();
    }

    public static zzni zzn(String str, Status status) {
        zznh zznhVarZzt = zzt(7);
        zznhVarZzt.zza(str);
        zznhVarZzt.zzf(status);
        return zznhVarZzt.zzg();
    }

    public static zzni zzp(AutocompletePrediction autocompletePrediction, AutocompleteSessionToken autocompleteSessionToken) {
        zznh zznhVarZzt = zzt(8);
        zznhVarZzt.zzd(autocompletePrediction);
        zznhVarZzt.zze(autocompleteSessionToken);
        return zznhVarZzt.zzg();
    }

    public static zzni zzq(AutocompletePrediction autocompletePrediction, Status status) {
        zznh zznhVarZzt = zzt(9);
        zznhVarZzt.zzd(autocompletePrediction);
        zznhVarZzt.zzf(status);
        return zznhVarZzt.zzg();
    }
}

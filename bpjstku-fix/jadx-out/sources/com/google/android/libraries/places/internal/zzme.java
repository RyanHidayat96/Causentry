package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import com.google.android.libraries.places.api.net.SearchByTextRequest;
import com.google.android.libraries.places.api.net.SearchNearbyRequest;

/* JADX INFO: loaded from: classes3.dex */
public interface zzme {
    void zza(FindCurrentPlaceRequest findCurrentPlaceRequest, Task task, long j, long j2, zzmo zzmoVar);

    void zzb(Task task, long j, long j2, zzmo zzmoVar);

    void zzc(FetchPhotoRequest fetchPhotoRequest, zzmo zzmoVar);

    void zzd(Task task, long j, long j2, zzmo zzmoVar);

    void zze(SearchByTextRequest searchByTextRequest, zzmo zzmoVar);

    void zzf(SearchByTextRequest searchByTextRequest, Task task, long j, long j2, zzmo zzmoVar, com.google.android.libraries.places.api.auth.zzb zzbVar);

    void zzg(FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequest, zzmo zzmoVar);

    void zzh(Task task, long j, long j2, zzmo zzmoVar, com.google.android.libraries.places.api.auth.zzb zzbVar);

    void zzi(SearchNearbyRequest searchNearbyRequest, zzmo zzmoVar);

    void zzj(SearchNearbyRequest searchNearbyRequest, Task task, long j, long j2, zzmo zzmoVar, com.google.android.libraries.places.api.auth.zzb zzbVar);

    void zzk(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, int i, zzmo zzmoVar);

    void zzl(Task task, long j, long j2, int i, zzmo zzmoVar, com.google.android.libraries.places.api.auth.zzb zzbVar);

    void zzm(FetchPlaceRequest fetchPlaceRequest, int i, zzmo zzmoVar);

    void zzn(Task task, long j, long j2, int i, zzmo zzmoVar, com.google.android.libraries.places.api.auth.zzb zzbVar);

    void zzo(FetchPlaceRequest fetchPlaceRequest, int i, zzmo zzmoVar);
}

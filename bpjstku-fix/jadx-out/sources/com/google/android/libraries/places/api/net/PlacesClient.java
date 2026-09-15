package com.google.android.libraries.places.api.net;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.internal.zzmo;

/* JADX INFO: loaded from: classes3.dex */
public interface PlacesClient {
    Task<FetchPhotoResponse> fetchPhoto(FetchPhotoRequest fetchPhotoRequest);

    Task<FetchPlaceResponse> fetchPlace(FetchPlaceRequest fetchPlaceRequest);

    Task<FetchResolvedPhotoUriResponse> fetchResolvedPhotoUri(FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequest);

    Task<FindAutocompletePredictionsResponse> findAutocompletePredictions(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest);

    Task<FindCurrentPlaceResponse> findCurrentPlace(FindCurrentPlaceRequest findCurrentPlaceRequest);

    Task<IsOpenResponse> isOpen(IsOpenRequest isOpenRequest);

    Task<SearchByTextResponse> searchByText(SearchByTextRequest searchByTextRequest);

    Task<SearchNearbyResponse> searchNearby(SearchNearbyRequest searchNearbyRequest);

    Task zza(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, zzmo zzmoVar);

    Task zzb(FetchPhotoRequest fetchPhotoRequest, zzmo zzmoVar);

    Task zzc(FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequest, zzmo zzmoVar);

    Task zzd(FetchPlaceRequest fetchPlaceRequest, zzmo zzmoVar);

    Task zze(LatLng latLng);

    Task zzf(FindCurrentPlaceRequest findCurrentPlaceRequest, zzmo zzmoVar);

    Task zzh(IsOpenRequest isOpenRequest, zzmo zzmoVar);

    Task zzi(SearchByTextRequest searchByTextRequest, zzmo zzmoVar);

    Task zzj(SearchNearbyRequest searchNearbyRequest, zzmo zzmoVar);

    void zzk();

    void zzl();

    void zzm();
}

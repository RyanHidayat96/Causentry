package com.google.android.libraries.places.internal;

import android.location.Location;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes3.dex */
public interface zzfm {
    Task zza(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, zzmo zzmoVar);

    Task zzb(FetchPhotoRequest fetchPhotoRequest, zzmo zzmoVar);

    Task zzc(FetchPlaceRequest fetchPlaceRequest, zzmo zzmoVar);

    Task zzd(FindCurrentPlaceRequest findCurrentPlaceRequest, Location location, ImmutableList immutableList, zzmo zzmoVar);
}

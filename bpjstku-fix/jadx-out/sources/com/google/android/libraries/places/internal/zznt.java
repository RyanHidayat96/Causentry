package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes3.dex */
public final class zznt implements zznn {
    public static final /* synthetic */ int zza = 0;
    private static final ImmutableList zzb = ImmutableList.TuitionPaymentFragmentbindingInflater1(Place.Field.ID, Place.Field.TYPES);
    private final PlacesClient zzc;
    private final zzng zzd;
    private final AutocompleteSessionToken zze;
    private final zzmo zzf;
    private zznq zzg;
    private zznr zzh;

    @Override // com.google.android.libraries.places.internal.zznn
    public final Task zza(String str, int i) {
        if (!(!TextUtils.isEmpty(str))) {
            throw new IllegalArgumentException();
        }
        zznq zznqVar = this.zzg;
        if (zznqVar != null) {
            if (zznqVar.zzb().equals(str)) {
                return zznqVar.zzc();
            }
            zznqVar.zza().cancel();
        }
        final zznl zznlVar = new zznl(new CancellationTokenSource(), str);
        this.zzg = zznlVar;
        PlacesClient placesClient = this.zzc;
        FindAutocompletePredictionsRequest.Builder builder = FindAutocompletePredictionsRequest.builder();
        builder.setQuery(str);
        zzng zzngVar = this.zzd;
        builder.setLocationBias(zzngVar.zzh());
        builder.setLocationRestriction(zzngVar.zzi());
        builder.setCountries(zzngVar.zzj());
        builder.setRegionCode(zzngVar.zzo());
        builder.setInputOffset(Integer.valueOf(i));
        builder.setTypeFilter(zzngVar.zzk());
        builder.setTypesFilter(zzngVar.zzl());
        builder.setSessionToken(this.zze);
        builder.setCancellationToken(zznlVar.zza().getToken());
        builder.setOrigin(zzngVar.zze());
        builder.setPureServiceAreaBusinessesIncluded(zzngVar.zzq());
        Task taskContinueWithTask = placesClient.zza(builder.build(), this.zzf).continueWithTask(new Continuation() { // from class: com.google.android.libraries.places.internal.zznp
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ Object then(Task task) {
                return zznlVar.zza().getToken().isCancellationRequested() ? Tasks.forCanceled() : task;
            }
        });
        zznlVar.zzd(taskContinueWithTask);
        return taskContinueWithTask;
    }

    @Override // com.google.android.libraries.places.internal.zznn
    public final Task zzb(AutocompletePrediction autocompletePrediction) {
        ImmutableList immutableList = zzb;
        zzng zzngVar = this.zzd;
        if (immutableList.containsAll(zzngVar.zzc())) {
            Place.Builder builder = Place.builder();
            builder.setId(autocompletePrediction.getPlaceId());
            builder.setTypes(autocompletePrediction.getPlaceTypes().isEmpty() ? null : autocompletePrediction.getPlaceTypes());
            return Tasks.forResult(FetchPlaceResponse.newInstance(builder.build()));
        }
        zznr zznrVar = this.zzh;
        if (zznrVar != null) {
            if (zznrVar.zzb().equals(autocompletePrediction.getPlaceId())) {
                return zznrVar.zzc();
            }
            zznrVar.zza().cancel();
        }
        final zznm zznmVar = new zznm(new CancellationTokenSource(), autocompletePrediction.getPlaceId());
        this.zzh = zznmVar;
        PlacesClient placesClient = this.zzc;
        FetchPlaceRequest.Builder builder2 = FetchPlaceRequest.builder(autocompletePrediction.getPlaceId(), zzngVar.zzc());
        builder2.setSessionToken(this.zze);
        builder2.setCancellationToken(zznmVar.zza().getToken());
        Task taskContinueWithTask = placesClient.zzd(builder2.build(), zzmo.AUTOCOMPLETE_WIDGET).continueWithTask(new Continuation() { // from class: com.google.android.libraries.places.internal.zzno
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ Object then(Task task) {
                return zznmVar.zza().getToken().isCancellationRequested() ? Tasks.forCanceled() : task;
            }
        });
        zznmVar.zzd(taskContinueWithTask);
        return taskContinueWithTask;
    }

    @Override // com.google.android.libraries.places.internal.zznn
    public final void zzc() {
        zznq zznqVar = this.zzg;
        if (zznqVar != null) {
            zznqVar.zza().cancel();
        }
        zznr zznrVar = this.zzh;
        if (zznrVar != null) {
            zznrVar.zza().cancel();
        }
        this.zzg = null;
        this.zzh = null;
    }

    @Override // com.google.android.libraries.places.internal.zznn
    public final void zzd() {
        this.zzc.zzk();
    }

    @Override // com.google.android.libraries.places.internal.zznn
    public final void zze() {
        this.zzc.zzl();
    }

    public zznt(PlacesClient placesClient, zzng zzngVar, AutocompleteSessionToken autocompleteSessionToken, zzmo zzmoVar) {
        this.zzc = placesClient;
        this.zzd = zzngVar;
        this.zze = autocompleteSessionToken;
        this.zzf = zzmoVar;
    }

    @Override // com.google.android.libraries.places.internal.zznn
    public final zzmo zzf() {
        return this.zzf;
    }
}

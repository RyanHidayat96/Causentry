package com.google.android.libraries.places.internal;

import android.location.Location;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.libraries.places.api.model.OpeningHours;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import com.google.android.libraries.places.api.net.FetchPhotoResponse;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest;
import com.google.android.libraries.places.api.net.FetchResolvedPhotoUriResponse;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import com.google.android.libraries.places.api.net.FindCurrentPlaceResponse;
import com.google.android.libraries.places.api.net.IsOpenRequest;
import com.google.android.libraries.places.api.net.IsOpenResponse;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.api.net.SearchByTextRequest;
import com.google.android.libraries.places.api.net.SearchByTextResponse;
import com.google.android.libraries.places.api.net.SearchNearbyRequest;
import com.google.android.libraries.places.api.net.SearchNearbyResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhb implements PlacesClient {
    private final zzfm zza;
    private final zzfc zzb;
    private final zzfh zzc;
    private final zzme zzd;
    private final zzdy zze;
    private final zzip zzf;
    private final zzer zzg;
    private final zzmf zzh;

    zzhb(zzmf zzmfVar, zzfm zzfmVar, zzfc zzfcVar, zzfh zzfhVar, zzme zzmeVar, zzdy zzdyVar, zzip zzipVar, zzer zzerVar) {
        this.zzh = zzmfVar;
        this.zza = zzfmVar;
        this.zzb = zzfcVar;
        this.zzc = zzfhVar;
        this.zzd = zzmeVar;
        this.zze = zzdyVar;
        this.zzf = zzipVar;
        this.zzg = zzerVar;
        zzerVar.zza();
    }

    private static void zzK(zzez zzezVar, zzfa zzfaVar) {
        zzez.zzb(zzezVar, zzez.zza("Duration"));
        zzed.zza();
        zzed.zza();
        zzez.zzb(zzezVar, zzez.zza("Battery"));
        zzed.zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Task zzL(Task task) {
        ApiException apiExceptionZzb;
        Exception exception = task.getException();
        if (exception == null) {
            return task;
        }
        if (exception instanceof ApiException) {
            apiExceptionZzb = (ApiException) exception;
        } else if (exception instanceof zzbjy) {
            apiExceptionZzb = zzfl.zzb((zzbjy) exception);
        } else {
            apiExceptionZzb = ((exception instanceof ExecutionException) && (exception.getCause() instanceof zzbjy)) ? zzfl.zzb((zzbjy) exception.getCause()) : new ApiException(new Status(13, exception.toString()));
        }
        return Tasks.forException(apiExceptionZzb);
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final Task<FetchPhotoResponse> fetchPhoto(FetchPhotoRequest fetchPhotoRequest) {
        return zzb(fetchPhotoRequest, zzmo.PROGRAMMATIC_API);
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final Task<FetchPlaceResponse> fetchPlace(FetchPlaceRequest fetchPlaceRequest) {
        return zzd(fetchPlaceRequest, zzmo.PROGRAMMATIC_API);
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final Task<FetchResolvedPhotoUriResponse> fetchResolvedPhotoUri(FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequest) {
        return zzc(fetchResolvedPhotoUriRequest, zzmo.PROGRAMMATIC_API);
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final Task<FindAutocompletePredictionsResponse> findAutocompletePredictions(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest) {
        return zza(findAutocompletePredictionsRequest, zzmo.PROGRAMMATIC_API);
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final Task<FindCurrentPlaceResponse> findCurrentPlace(FindCurrentPlaceRequest findCurrentPlaceRequest) {
        return zzg(findCurrentPlaceRequest, null, zzmo.PROGRAMMATIC_API);
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final Task<IsOpenResponse> isOpen(IsOpenRequest isOpenRequest) {
        return zzh(isOpenRequest, zzmo.PROGRAMMATIC_API);
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final Task<SearchByTextResponse> searchByText(SearchByTextRequest searchByTextRequest) {
        return zzi(searchByTextRequest, zzmo.PROGRAMMATIC_API);
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final Task<SearchNearbyResponse> searchNearby(SearchNearbyRequest searchNearbyRequest) {
        return zzj(searchNearbyRequest, zzmo.PROGRAMMATIC_API);
    }

    final /* synthetic */ FindCurrentPlaceResponse zzA(FindCurrentPlaceRequest findCurrentPlaceRequest, long j, zzmo zzmoVar, zzfa zzfaVar, Task task) {
        this.zzd.zza(findCurrentPlaceRequest, task, j, this.zze.zzb(), zzmoVar);
        zzK(zzez.zza("FindCurrentPlace"), zzfaVar);
        return (FindCurrentPlaceResponse) task.getResult();
    }

    final /* synthetic */ FetchPlaceResponse zzC(FetchPlaceRequest fetchPlaceRequest, zzmo zzmoVar, zzfa zzfaVar, Task task) {
        this.zzd.zzo(fetchPlaceRequest, 2, zzmoVar);
        zzK(zzez.zza("IsOpenFetchPlace"), zzfaVar);
        return (FetchPlaceResponse) task.getResult();
    }

    final /* synthetic */ FetchPlaceResponse zzE(FetchPlaceRequest fetchPlaceRequest, zzmo zzmoVar, zzfa zzfaVar, Task task) {
        this.zzd.zzo(fetchPlaceRequest, 3, zzmoVar);
        zzK(zzez.zza("IsOpenGetPlace"), zzfaVar);
        return (FetchPlaceResponse) task.getResult();
    }

    final /* synthetic */ SearchByTextResponse zzG(SearchByTextRequest searchByTextRequest, zzmo zzmoVar, zzfa zzfaVar, Task task) {
        this.zzd.zze(searchByTextRequest, zzmoVar);
        zzK(zzez.zza("SearchByText"), zzfaVar);
        return (SearchByTextResponse) task.getResult();
    }

    final /* synthetic */ SearchNearbyResponse zzI(SearchNearbyRequest searchNearbyRequest, zzmo zzmoVar, zzfa zzfaVar, Task task) {
        this.zzd.zzi(searchNearbyRequest, zzmoVar);
        zzK(zzez.zza("SearchNearby"), zzfaVar);
        return (SearchNearbyResponse) task.getResult();
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final Task zza(final FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, final zzmo zzmoVar) {
        try {
            if (findAutocompletePredictionsRequest == null) {
                throw new NullPointerException("Request must not be null.");
            }
            zzed.zza();
            final zzfa zzfaVarZza = zzfa.zza();
            if (!zzmoVar.equals(zzmo.PLACES_UI_KIT) && !zzmoVar.equals(zzmo.ONE_PLATFORM_AUTOCOMPLETE_WIDGET) && (!this.zzh.zzh() || zzmoVar.equals(zzmo.AUTOCOMPLETE_WIDGET))) {
                return this.zza.zza(findAutocompletePredictionsRequest, zzmoVar).continueWith(new Continuation() { // from class: com.google.android.libraries.places.internal.zzha
                    @Override // com.google.android.gms.tasks.Continuation
                    public final /* synthetic */ Object then(Task task) {
                        return this.zza.zzn(findAutocompletePredictionsRequest, zzmoVar, zzfaVarZza, task);
                    }
                }).continueWithTask(zzgc.zza);
            }
            return this.zzf.zzb(findAutocompletePredictionsRequest, zzmoVar).continueWith(new Continuation() { // from class: com.google.android.libraries.places.internal.zzgn
                @Override // com.google.android.gms.tasks.Continuation
                public final /* synthetic */ Object then(Task task) {
                    return this.zza.zzp(findAutocompletePredictionsRequest, zzmoVar, zzfaVarZza, task);
                }
            }).continueWithTask(zzgs.zza);
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final Task zzb(final FetchPhotoRequest fetchPhotoRequest, final zzmo zzmoVar) {
        try {
            if (fetchPhotoRequest == null) {
                throw new NullPointerException("Request must not be null.");
            }
            zzed.zza();
            final zzfa zzfaVarZza = zzfa.zza();
            return this.zza.zzb(fetchPhotoRequest, zzmoVar).continueWith(new Continuation() { // from class: com.google.android.libraries.places.internal.zzgt
                @Override // com.google.android.gms.tasks.Continuation
                public final /* synthetic */ Object then(Task task) {
                    return this.zza.zzr(fetchPhotoRequest, zzmoVar, zzfaVarZza, task);
                }
            }).continueWithTask(zzgu.zza);
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final Task zzc(final FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequest, final zzmo zzmoVar) {
        try {
            if (fetchResolvedPhotoUriRequest == null) {
                throw new NullPointerException("Request must not be null.");
            }
            zzed.zza();
            final zzfa zzfaVarZza = zzfa.zza();
            return this.zzf.zzd(fetchResolvedPhotoUriRequest, zzmoVar).continueWith(new Continuation() { // from class: com.google.android.libraries.places.internal.zzgv
                public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -883097113;
                public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -2126179819;

                @Override // com.google.android.gms.tasks.Continuation
                public final /* synthetic */ Object then(Task task) {
                    return this.zza.zzt(fetchResolvedPhotoUriRequest, zzmoVar, zzfaVarZza, task);
                }
            }).continueWithTask(zzgw.zza);
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final Task zzd(final FetchPlaceRequest fetchPlaceRequest, final zzmo zzmoVar) {
        try {
            if (fetchPlaceRequest == null) {
                throw new NullPointerException("Request must not be null.");
            }
            zzed.zza();
            final zzfa zzfaVarZza = zzfa.zza();
            return (!this.zzh.zzh() || zzmoVar.equals(zzmo.AUTOCOMPLETE_WIDGET)) ? this.zza.zzc(fetchPlaceRequest, zzmoVar).continueWith(new Continuation() { // from class: com.google.android.libraries.places.internal.zzgx
                @Override // com.google.android.gms.tasks.Continuation
                public final /* synthetic */ Object then(Task task) {
                    return this.zza.zzv(fetchPlaceRequest, zzmoVar, zzfaVarZza, task);
                }
            }).continueWithTask(zzgy.zza) : this.zzf.zzc(fetchPlaceRequest, zzmoVar).continueWith(new Continuation() { // from class: com.google.android.libraries.places.internal.zzgz
                @Override // com.google.android.gms.tasks.Continuation
                public final /* synthetic */ Object then(Task task) {
                    return this.zza.zzx(fetchPlaceRequest, zzmoVar, zzfaVarZza, task);
                }
            }).continueWithTask(zzgd.zza);
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final Task zze(LatLng latLng) {
        return this.zzf.zze(latLng);
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final Task zzf(FindCurrentPlaceRequest findCurrentPlaceRequest, zzmo zzmoVar) {
        return zzg(findCurrentPlaceRequest, null, zzmoVar);
    }

    public final Task zzg(final FindCurrentPlaceRequest findCurrentPlaceRequest, String str, final zzmo zzmoVar) {
        try {
            if (findCurrentPlaceRequest == null) {
                throw new NullPointerException("Request must not be null.");
            }
            final long jZzb = this.zze.zzb();
            zzed.zza();
            final zzfa zzfaVarZza = zzfa.zza();
            final String str2 = null;
            return this.zzb.zza(findCurrentPlaceRequest.getCancellationToken()).onSuccessTask(new SuccessContinuation(findCurrentPlaceRequest, str2, zzmoVar) { // from class: com.google.android.libraries.places.internal.zzge
                private final /* synthetic */ FindCurrentPlaceRequest zzb;
                private final /* synthetic */ zzmo zzc;

                {
                    this.zzc = zzmoVar;
                }

                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final /* synthetic */ Task then(Object obj) {
                    return this.zza.zzz(this.zzb, null, this.zzc, (Location) obj);
                }
            }).continueWith(new Continuation() { // from class: com.google.android.libraries.places.internal.zzgf
                @Override // com.google.android.gms.tasks.Continuation
                public final /* synthetic */ Object then(Task task) {
                    return this.zza.zzA(findCurrentPlaceRequest, jZzb, zzmoVar, zzfaVarZza, task);
                }
            }).continueWithTask(zzgg.zza);
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final Task zzh(IsOpenRequest isOpenRequest, final zzmo zzmoVar) {
        List arrayList;
        try {
            if (isOpenRequest == null) {
                throw new NullPointerException("Request must not be null.");
            }
            final Place place = isOpenRequest.getPlace();
            String placeId = isOpenRequest.getPlaceId();
            final long utcTimeMillis = isOpenRequest.getUtcTimeMillis();
            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            if (place == null) {
                arrayList = Arrays.asList(Place.Field.BUSINESS_STATUS, Place.Field.CURRENT_OPENING_HOURS, Place.Field.OPENING_HOURS, Place.Field.UTC_OFFSET);
            } else {
                arrayList = new ArrayList();
                Place.BusinessStatus businessStatus = place.getBusinessStatus();
                if (businessStatus == null || businessStatus == Place.BusinessStatus.OPERATIONAL) {
                    if (businessStatus == null) {
                        arrayList.add(Place.Field.BUSINESS_STATUS);
                    }
                    if (place.getCurrentOpeningHours() == null) {
                        arrayList.add(Place.Field.CURRENT_OPENING_HOURS);
                    }
                    if (place.getOpeningHours() == null) {
                        arrayList.add(Place.Field.OPENING_HOURS);
                    }
                    if (place.getUtcOffsetMinutes() == null) {
                        arrayList.add(Place.Field.UTC_OFFSET);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                taskCompletionSource.setResult(IsOpenResponse.newInstance(com.google.android.libraries.places.api.model.zzes.zza(place, utcTimeMillis)));
                return taskCompletionSource.getTask();
            }
            if (place != null) {
                placeId = place.getId();
            }
            String str = placeId;
            FetchPlaceRequest.Builder builder = FetchPlaceRequest.builder(placeId, arrayList);
            builder.setCancellationToken(isOpenRequest.getCancellationToken());
            final FetchPlaceRequest fetchPlaceRequestBuild = builder.build();
            zzed.zza();
            final zzfa zzfaVarZza = zzfa.zza();
            return this.zzh.zzh() ? this.zzf.zzc(fetchPlaceRequestBuild, zzmoVar).continueWith(new Continuation() { // from class: com.google.android.libraries.places.internal.zzgk
                @Override // com.google.android.gms.tasks.Continuation
                public final /* synthetic */ Object then(Task task) {
                    return this.zza.zzE(fetchPlaceRequestBuild, zzmoVar, zzfaVarZza, task);
                }
            }).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.libraries.places.internal.zzgl
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final /* synthetic */ Task then(Object obj) {
                    Place place2 = ((FetchPlaceResponse) obj).getPlace();
                    Place.BusinessStatus businessStatus2 = place2.getBusinessStatus();
                    OpeningHours currentOpeningHours = place2.getCurrentOpeningHours();
                    OpeningHours openingHours = place2.getOpeningHours();
                    Integer utcOffsetMinutes = place2.getUtcOffsetMinutes();
                    Place place3 = place;
                    if (place3 != null) {
                        if (utcOffsetMinutes == null) {
                            utcOffsetMinutes = place3.getUtcOffsetMinutes();
                        }
                        if (businessStatus2 == null) {
                            businessStatus2 = place3.getBusinessStatus();
                        }
                        if (currentOpeningHours == null) {
                            currentOpeningHours = place3.getCurrentOpeningHours();
                        }
                        if (openingHours == null) {
                            openingHours = place3.getOpeningHours();
                        }
                    }
                    TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                    long j = utcTimeMillis;
                    Place.Builder builder2 = Place.builder();
                    builder2.setBusinessStatus(businessStatus2);
                    builder2.setCurrentOpeningHours(currentOpeningHours);
                    builder2.setOpeningHours(openingHours);
                    builder2.setUtcOffsetMinutes(utcOffsetMinutes);
                    taskCompletionSource2.setResult(IsOpenResponse.newInstance(com.google.android.libraries.places.api.model.zzes.zza(builder2.build(), j)));
                    return taskCompletionSource2.getTask();
                }
            }).continueWithTask(zzgm.zza) : this.zza.zzc(fetchPlaceRequestBuild, zzmoVar).continueWith(new Continuation() { // from class: com.google.android.libraries.places.internal.zzgh
                @Override // com.google.android.gms.tasks.Continuation
                public final /* synthetic */ Object then(Task task) {
                    return this.zza.zzC(fetchPlaceRequestBuild, zzmoVar, zzfaVarZza, task);
                }
            }).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.libraries.places.internal.zzgi
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final /* synthetic */ Task then(Object obj) {
                    Place place2 = ((FetchPlaceResponse) obj).getPlace();
                    Place.BusinessStatus businessStatus2 = place2.getBusinessStatus();
                    OpeningHours currentOpeningHours = place2.getCurrentOpeningHours();
                    OpeningHours openingHours = place2.getOpeningHours();
                    Integer utcOffsetMinutes = place2.getUtcOffsetMinutes();
                    Place place3 = place;
                    if (place3 != null) {
                        if (utcOffsetMinutes == null) {
                            utcOffsetMinutes = place3.getUtcOffsetMinutes();
                        }
                        if (businessStatus2 == null) {
                            businessStatus2 = place3.getBusinessStatus();
                        }
                        if (currentOpeningHours == null) {
                            currentOpeningHours = place3.getCurrentOpeningHours();
                        }
                        if (openingHours == null) {
                            openingHours = place3.getOpeningHours();
                        }
                    }
                    TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                    long j = utcTimeMillis;
                    Place.Builder builder2 = Place.builder();
                    builder2.setBusinessStatus(businessStatus2);
                    builder2.setCurrentOpeningHours(currentOpeningHours);
                    builder2.setOpeningHours(openingHours);
                    builder2.setUtcOffsetMinutes(utcOffsetMinutes);
                    taskCompletionSource2.setResult(IsOpenResponse.newInstance(com.google.android.libraries.places.api.model.zzes.zza(builder2.build(), j)));
                    return taskCompletionSource2.getTask();
                }
            }).continueWithTask(zzgj.zza);
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final Task zzi(final SearchByTextRequest searchByTextRequest, final zzmo zzmoVar) {
        try {
            if (searchByTextRequest == null) {
                throw new NullPointerException("Request must not be null.");
            }
            zzed.zza();
            final zzfa zzfaVarZza = zzfa.zza();
            return this.zzf.zza(searchByTextRequest, zzmoVar).continueWith(new Continuation() { // from class: com.google.android.libraries.places.internal.zzgo
                @Override // com.google.android.gms.tasks.Continuation
                public final /* synthetic */ Object then(Task task) {
                    return this.zza.zzG(searchByTextRequest, zzmoVar, zzfaVarZza, task);
                }
            }).continueWithTask(zzgp.zza);
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final Task zzj(final SearchNearbyRequest searchNearbyRequest, final zzmo zzmoVar) {
        try {
            if (searchNearbyRequest == null) {
                throw new NullPointerException("Request must not be null.");
            }
            zzed.zza();
            final zzfa zzfaVarZza = zzfa.zza();
            return this.zzf.zzf(searchNearbyRequest, zzmoVar).continueWith(new Continuation() { // from class: com.google.android.libraries.places.internal.zzgq
                @Override // com.google.android.gms.tasks.Continuation
                public final /* synthetic */ Object then(Task task) {
                    return this.zza.zzI(searchNearbyRequest, zzmoVar, zzfaVarZza, task);
                }
            }).continueWithTask(zzgr.zza);
        } catch (Error | RuntimeException e2) {
            zzmr.zzb(e2);
            throw e2;
        }
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final void zzk() {
        this.zzf.zzg();
        this.zzg.zzb();
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final void zzl() {
        this.zzf.zzh();
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final void zzm() {
        this.zzf.zzi();
    }

    final /* synthetic */ FindAutocompletePredictionsResponse zzn(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, zzmo zzmoVar, zzfa zzfaVar, Task task) {
        this.zzd.zzk(findAutocompletePredictionsRequest, 2, zzmoVar);
        zzK(zzez.zza("FindAutocompletePredictions"), zzfaVar);
        return (FindAutocompletePredictionsResponse) task.getResult();
    }

    final /* synthetic */ FindAutocompletePredictionsResponse zzp(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, zzmo zzmoVar, zzfa zzfaVar, Task task) {
        this.zzd.zzk(findAutocompletePredictionsRequest, 3, zzmoVar);
        zzK(zzez.zza("FindAutocompletePredictionsOnePlatform"), zzfaVar);
        return (FindAutocompletePredictionsResponse) task.getResult();
    }

    final /* synthetic */ FetchPhotoResponse zzr(FetchPhotoRequest fetchPhotoRequest, zzmo zzmoVar, zzfa zzfaVar, Task task) {
        this.zzd.zzc(fetchPhotoRequest, zzmoVar);
        zzK(zzez.zza("FetchPhoto"), zzfaVar);
        return (FetchPhotoResponse) task.getResult();
    }

    final /* synthetic */ FetchResolvedPhotoUriResponse zzt(FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequest, zzmo zzmoVar, zzfa zzfaVar, Task task) {
        this.zzd.zzg(fetchResolvedPhotoUriRequest, zzmoVar);
        zzK(zzez.zza("GetPhotoMedia"), zzfaVar);
        return (FetchResolvedPhotoUriResponse) task.getResult();
    }

    final /* synthetic */ FetchPlaceResponse zzv(FetchPlaceRequest fetchPlaceRequest, zzmo zzmoVar, zzfa zzfaVar, Task task) {
        this.zzd.zzm(fetchPlaceRequest, 2, zzmoVar);
        zzK(zzez.zza("FetchPlace"), zzfaVar);
        return (FetchPlaceResponse) task.getResult();
    }

    final /* synthetic */ FetchPlaceResponse zzx(FetchPlaceRequest fetchPlaceRequest, zzmo zzmoVar, zzfa zzfaVar, Task task) {
        this.zzd.zzm(fetchPlaceRequest, 3, zzmoVar);
        zzK(zzez.zza("GetPlace"), zzfaVar);
        return (FetchPlaceResponse) task.getResult();
    }

    final /* synthetic */ Task zzz(FindCurrentPlaceRequest findCurrentPlaceRequest, String str, zzmo zzmoVar, Location location) {
        if (location == null) {
            throw new NullPointerException("Location must not be null.");
        }
        return this.zza.zzd(findCurrentPlaceRequest, location, this.zzc.zza(null), zzmoVar);
    }
}

package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.EVConnectorType;
import com.google.android.libraries.places.api.model.EVSearchOptions;
import com.google.android.libraries.places.api.model.RouteModifiers;
import com.google.android.libraries.places.api.model.RoutingParameters;
import com.google.android.libraries.places.api.model.RoutingSummary;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import com.google.android.libraries.places.api.net.FindCurrentPlaceResponse;
import com.google.android.libraries.places.api.net.SearchByTextRequest;
import com.google.android.libraries.places.api.net.SearchByTextResponse;
import com.google.android.libraries.places.api.net.SearchNearbyRequest;
import com.google.android.libraries.places.api.net.SearchNearbyResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfj implements zzme {
    private final zzmv zza;
    private final zzmp zzb;
    private final zzmf zzc;

    static final int zzp(Task task) {
        if (task.isSuccessful()) {
            return 2;
        }
        Exception exception = task.getException();
        int statusCode = (exception instanceof ApiException ? (ApiException) exception : new ApiException(new Status(13, exception.getMessage()))).getStatusCode();
        if (statusCode != 7) {
            return statusCode != 15 ? 1 : 3;
        }
        return 4;
    }

    private final zzamh zzq() {
        Locale localeZzg = this.zzc.zzg();
        Locale locale = Locale.getDefault();
        zzamh zzamhVarZza = zzamj.zza();
        zzamhVarZza.zza(localeZzg.toLanguageTag());
        if (!localeZzg.equals(locale)) {
            zzamhVarZza.zzb(locale.toLanguageTag());
        }
        return zzamhVarZza;
    }

    private final void zzr(zzaip zzaipVar, zzmo zzmoVar) throws Throwable {
        zzt(zzaipVar, 2, zzmoVar, com.google.android.libraries.places.api.auth.zzb.zza);
    }

    private static final zzani zzs(RoutingParameters routingParameters) {
        int i;
        zzanh zzanhVarZza = zzani.zza();
        RoutingParameters.TravelMode travelMode = routingParameters.getTravelMode();
        int i2 = 4;
        if (travelMode != null) {
            int iOrdinal = travelMode.ordinal();
            if (iOrdinal == 1) {
                i = 2;
            } else if (iOrdinal == 2) {
                i = 3;
            } else if (iOrdinal != 3) {
                i = iOrdinal != 4 ? 1 : 5;
            } else {
                i = 4;
            }
            zzanhVarZza.zzb(i);
        }
        RouteModifiers routeModifiers = routingParameters.getRouteModifiers();
        if (routeModifiers != null) {
            zzanf zzanfVarZza = zzang.zza();
            zzanfVarZza.zza(routeModifiers.isTollAvoided());
            zzanfVarZza.zzb(routeModifiers.isHighwayAvoided());
            zzanfVarZza.zzc(routeModifiers.isFerryAvoided());
            zzanfVarZza.zzd(routeModifiers.isIndoorAvoided());
            zzanhVarZza.zza((zzang) zzanfVarZza.zzG());
        }
        RoutingParameters.RoutingPreference routingPreference = routingParameters.getRoutingPreference();
        if (routingPreference != null) {
            int iOrdinal2 = routingPreference.ordinal();
            if (iOrdinal2 == 1) {
                i2 = 2;
            } else if (iOrdinal2 == 2) {
                i2 = 3;
            } else if (iOrdinal2 != 3) {
                i2 = 1;
            }
            zzanhVarZza.zzc(i2);
        }
        return (zzani) zzanhVarZza.zzG();
    }

    private final void zzt(zzaip zzaipVar, int i, zzmo zzmoVar, com.google.android.libraries.places.api.auth.zzb zzbVar) throws Throwable {
        zzaks zzaksVarZzb = zzmw.zzb(this.zzb, i, zzmoVar, zzbVar);
        zzaksVarZzb.zzp(16);
        zzaksVarZzb.zzf(zzaipVar);
        zzaksVarZzb.zzj(this.zzc.zzf());
        this.zza.zzb(zzaksVarZzb);
    }

    @Override // com.google.android.libraries.places.internal.zzme
    public final void zza(FindCurrentPlaceRequest findCurrentPlaceRequest, Task task, long j, long j2, zzmo zzmoVar) throws Throwable {
        int i = true == task.isSuccessful() ? 2 : 1;
        zzalk zzalkVarZza = zzalm.zza();
        zzamc zzamcVarZza = zzamd.zza();
        zzamcVarZza.zza(zzll.zza(findCurrentPlaceRequest.getPlaceFields()));
        zzalkVarZza.zzb((zzamd) zzamcVarZza.zzG());
        zzalkVarZza.zza((int) (j2 - j));
        zzalkVarZza.zzc(i);
        zzalm zzalmVar = (zzalm) zzalkVarZza.zzG();
        zzaks zzaksVarZzb = zzmw.zzb(this.zzb, 2, zzmoVar, com.google.android.libraries.places.api.auth.zzb.zza);
        zzaksVarZzb.zzp(6);
        zzaksVarZzb.zzd(zzalmVar);
        zzaksVarZzb.zzj(this.zzc.zzf());
        this.zza.zzb(zzaksVarZzb);
    }

    @Override // com.google.android.libraries.places.internal.zzme
    public final void zzb(Task task, long j, long j2, zzmo zzmoVar) throws Throwable {
        int size = task.isSuccessful() ? ((FindCurrentPlaceResponse) task.getResult()).getPlaceLikelihoods().size() : 0;
        zzahr zzahrVarZza = zzahs.zza();
        zzahrVarZza.zza(size);
        zzahs zzahsVar = (zzahs) zzahrVarZza.zzG();
        zzaik zzaikVarZza = zzaip.zza();
        zzaikVarZza.zzf(4);
        zzaikVarZza.zzc(zzahsVar);
        zzaikVarZza.zzg(zzp(task));
        zzaikVarZza.zza((int) (j2 - j));
        zzr((zzaip) zzaikVarZza.zzG(), zzmoVar);
    }

    @Override // com.google.android.libraries.places.internal.zzme
    public final void zzc(FetchPhotoRequest fetchPhotoRequest, zzmo zzmoVar) throws Throwable {
        zzalz zzalzVarZza = zzamb.zza();
        zzalzVarZza.zza(2);
        zzamb zzambVar = (zzamb) zzalzVarZza.zzG();
        zzaks zzaksVarZzb = zzmw.zzb(this.zzb, 2, zzmoVar, com.google.android.libraries.places.api.auth.zzb.zza);
        zzaksVarZzb.zzp(5);
        zzaksVarZzb.zzc(zzambVar);
        zzaksVarZzb.zzj(this.zzc.zzf());
        this.zza.zzb(zzaksVarZzb);
    }

    @Override // com.google.android.libraries.places.internal.zzme
    public final void zzd(Task task, long j, long j2, zzmo zzmoVar) throws Throwable {
        zzaik zzaikVarZza = zzaip.zza();
        zzaikVarZza.zzf(15);
        zzaikVarZza.zzg(zzp(task));
        zzaikVarZza.zza((int) (j2 - j));
        zzr((zzaip) zzaikVarZza.zzG(), zzmoVar);
    }

    @Override // com.google.android.libraries.places.internal.zzme
    public final void zze(SearchByTextRequest searchByTextRequest, zzmo zzmoVar) throws Throwable {
        zzahq zzahqVar;
        zzamq zzamqVarZza = zzamu.zza();
        zzamqVarZza.zzb(searchByTextRequest.isOpenNow());
        zzamc zzamcVarZza = zzamd.zza();
        zzamcVarZza.zza(zziy.zza(searchByTextRequest.getPlaceFields()));
        zzamqVarZza.zzg((zzamd) zzamcVarZza.zzG());
        SearchByTextRequest.RankPreference rankPreference = searchByTextRequest.getRankPreference();
        zzamqVarZza.zzk(rankPreference == null ? 1 : true != rankPreference.equals(SearchByTextRequest.RankPreference.DISTANCE) ? 3 : 2);
        zzamqVarZza.zzf(searchByTextRequest.isStrictTypeFiltering());
        zzamqVarZza.zzj(searchByTextRequest.isRoutingSummariesIncluded());
        String includedType = searchByTextRequest.getIncludedType();
        if (includedType != null) {
            zzamqVarZza.zza(includedType);
        }
        Double minRating = searchByTextRequest.getMinRating();
        if (minRating != null) {
            zzamqVarZza.zzc(minRating.doubleValue());
        }
        Integer maxResultCount = searchByTextRequest.getMaxResultCount();
        if (maxResultCount != null) {
            zzamqVarZza.zzd(maxResultCount.intValue());
        }
        EVSearchOptions evSearchOptions = searchByTextRequest.getEvSearchOptions();
        if (evSearchOptions != null) {
            zzamr zzamrVarZza = zzams.zza();
            Double minimumChargingRateKw = evSearchOptions.getMinimumChargingRateKw();
            if (minimumChargingRateKw != null) {
                zzamrVarZza.zza(minimumChargingRateKw.doubleValue());
            }
            List<EVConnectorType> connectorTypes = evSearchOptions.getConnectorTypes();
            if (connectorTypes != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<EVConnectorType> it = connectorTypes.iterator();
                while (it.hasNext()) {
                    int iOrdinal = it.next().ordinal();
                    if (iOrdinal != 0) {
                        switch (iOrdinal) {
                            case 2:
                                zzahqVar = zzahq.EV_CONNECTOR_TYPE_J1772;
                                break;
                            case 3:
                                zzahqVar = zzahq.EV_CONNECTOR_TYPE_TYPE_2;
                                break;
                            case 4:
                                zzahqVar = zzahq.EV_CONNECTOR_TYPE_CHADEMO;
                                break;
                            case 5:
                                zzahqVar = zzahq.EV_CONNECTOR_TYPE_CCS_COMBO_1;
                                break;
                            case 6:
                                zzahqVar = zzahq.EV_CONNECTOR_TYPE_CCS_COMBO_2;
                                break;
                            case 7:
                                zzahqVar = zzahq.EV_CONNECTOR_TYPE_TESLA;
                                break;
                            case 8:
                                zzahqVar = zzahq.EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T;
                                break;
                            case 9:
                                zzahqVar = zzahq.EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET;
                                break;
                            default:
                                zzahqVar = zzahq.EV_CONNECTOR_TYPE_OTHER;
                                break;
                        }
                    } else {
                        zzahqVar = zzahq.EV_CONNECTOR_TYPE_UNSPECIFIED;
                    }
                    arrayList.add(zzahqVar);
                }
                zzamrVarZza.zzb(arrayList);
            }
            zzamqVarZza.zzh((zzams) zzamrVarZza.zzG());
        }
        RoutingParameters routingParameters = searchByTextRequest.getRoutingParameters();
        if (routingParameters != null) {
            zzamqVarZza.zzi(zzs(routingParameters));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Integer num : searchByTextRequest.getPriceLevels()) {
            if (num != null) {
                arrayList2.add(num);
            }
        }
        zzamqVarZza.zze(arrayList2);
        zzamh zzamhVarZzq = zzq();
        zzamhVarZzq.zzh(2);
        zzamhVarZzq.zze((zzamu) zzamqVarZza.zzG());
        zzamj zzamjVar = (zzamj) zzamhVarZzq.zzG();
        zzaks zzaksVarZzb = zzmw.zzb(this.zzb, 3, zzmoVar, com.google.android.libraries.places.api.auth.zzb.zza);
        zzaksVarZzb.zzp(1);
        zzaksVarZzb.zzb(zzamjVar);
        zzaksVarZzb.zzj(this.zzc.zzf());
        this.zza.zzb(zzaksVarZzb);
    }

    @Override // com.google.android.libraries.places.internal.zzme
    public final void zzf(SearchByTextRequest searchByTextRequest, Task task, long j, long j2, zzmo zzmoVar, com.google.android.libraries.places.api.auth.zzb zzbVar) throws Throwable {
        List<RoutingSummary> routingSummaries;
        int size = task.isSuccessful() ? ((SearchByTextResponse) task.getResult()).getPlaces().size() : 0;
        int size2 = (searchByTextRequest.isRoutingSummariesIncluded() && task.isSuccessful() && (routingSummaries = ((SearchByTextResponse) task.getResult()).getRoutingSummaries()) != null) ? routingSummaries.size() : 0;
        Integer maxResultCount = searchByTextRequest.getMaxResultCount();
        zzanu zzanuVarZza = zzanv.zza();
        zzanuVarZza.zza(maxResultCount != null ? maxResultCount.intValue() : 0);
        zzanuVarZza.zzb(size);
        zzanuVarZza.zzc(size2);
        zzanv zzanvVar = (zzanv) zzanuVarZza.zzG();
        zzaik zzaikVarZza = zzaip.zza();
        zzaikVarZza.zzf(10);
        zzaikVarZza.zze(zzanvVar);
        zzaikVarZza.zzg(zzp(task));
        zzaikVarZza.zza((int) (j2 - j));
        zzt((zzaip) zzaikVarZza.zzG(), 3, zzmoVar, zzbVar);
    }

    @Override // com.google.android.libraries.places.internal.zzme
    public final void zzg(FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequest, zzmo zzmoVar) throws Throwable {
        zzalz zzalzVarZza = zzamb.zza();
        zzalzVarZza.zza(2);
        zzamb zzambVar = (zzamb) zzalzVarZza.zzG();
        zzaks zzaksVarZzb = zzmw.zzb(this.zzb, 3, zzmoVar, com.google.android.libraries.places.api.auth.zzb.zza);
        zzaksVarZzb.zzp(5);
        zzaksVarZzb.zzc(zzambVar);
        zzaksVarZzb.zzj(this.zzc.zzf());
        this.zza.zzb(zzaksVarZzb);
    }

    @Override // com.google.android.libraries.places.internal.zzme
    public final void zzh(Task task, long j, long j2, zzmo zzmoVar, com.google.android.libraries.places.api.auth.zzb zzbVar) throws Throwable {
        zzaik zzaikVarZza = zzaip.zza();
        zzaikVarZza.zzf(15);
        zzaikVarZza.zzg(zzp(task));
        zzaikVarZza.zza((int) (j2 - j));
        zzt((zzaip) zzaikVarZza.zzG(), 3, zzmoVar, zzbVar);
    }

    @Override // com.google.android.libraries.places.internal.zzme
    public final void zzi(SearchNearbyRequest searchNearbyRequest, zzmo zzmoVar) throws Throwable {
        int i;
        zzamv zzamvVarZza = zzamx.zza();
        zzamc zzamcVarZza = zzamd.zza();
        zzamcVarZza.zza(zziy.zza(searchNearbyRequest.getPlaceFields()));
        zzamvVarZza.zzf((zzamd) zzamcVarZza.zzG());
        SearchNearbyRequest.RankPreference rankPreference = searchNearbyRequest.getRankPreference();
        if (rankPreference == null) {
            i = 1;
        } else {
            i = true != rankPreference.equals(SearchNearbyRequest.RankPreference.DISTANCE) ? 3 : 2;
        }
        zzamvVarZza.zzi(i);
        zzamvVarZza.zzh(searchNearbyRequest.isRoutingSummariesIncluded());
        List<String> includedTypes = searchNearbyRequest.getIncludedTypes();
        if (includedTypes != null) {
            zzamvVarZza.zza(includedTypes);
        }
        List<String> excludedTypes = searchNearbyRequest.getExcludedTypes();
        if (excludedTypes != null) {
            zzamvVarZza.zzb(excludedTypes);
        }
        List<String> includedPrimaryTypes = searchNearbyRequest.getIncludedPrimaryTypes();
        if (includedPrimaryTypes != null) {
            zzamvVarZza.zzc(includedPrimaryTypes);
        }
        List<String> excludedPrimaryTypes = searchNearbyRequest.getExcludedPrimaryTypes();
        if (excludedPrimaryTypes != null) {
            zzamvVarZza.zzd(excludedPrimaryTypes);
        }
        Integer maxResultCount = searchNearbyRequest.getMaxResultCount();
        if (maxResultCount != null) {
            zzamvVarZza.zze(maxResultCount.intValue());
        }
        RoutingParameters routingParameters = searchNearbyRequest.getRoutingParameters();
        if (routingParameters != null) {
            zzamvVarZza.zzg(zzs(routingParameters));
        }
        zzamh zzamhVarZzq = zzq();
        zzamhVarZzq.zzh(2);
        zzamhVarZzq.zzf((zzamx) zzamvVarZza.zzG());
        zzamj zzamjVar = (zzamj) zzamhVarZzq.zzG();
        zzaks zzaksVarZzb = zzmw.zzb(this.zzb, 3, zzmoVar, com.google.android.libraries.places.api.auth.zzb.zza);
        zzaksVarZzb.zzp(1);
        zzaksVarZzb.zzb(zzamjVar);
        zzaksVarZzb.zzj(this.zzc.zzf());
        this.zza.zzb(zzaksVarZzb);
    }

    @Override // com.google.android.libraries.places.internal.zzme
    public final void zzj(SearchNearbyRequest searchNearbyRequest, Task task, long j, long j2, zzmo zzmoVar, com.google.android.libraries.places.api.auth.zzb zzbVar) throws Throwable {
        List<RoutingSummary> routingSummaries;
        int size = task.isSuccessful() ? ((SearchNearbyResponse) task.getResult()).getPlaces().size() : 0;
        int size2 = (searchNearbyRequest.isRoutingSummariesIncluded() && task.isSuccessful() && (routingSummaries = ((SearchNearbyResponse) task.getResult()).getRoutingSummaries()) != null) ? routingSummaries.size() : 0;
        Integer maxResultCount = searchNearbyRequest.getMaxResultCount();
        zzanu zzanuVarZza = zzanv.zza();
        zzanuVarZza.zza(maxResultCount != null ? maxResultCount.intValue() : 0);
        zzanuVarZza.zzb(size);
        zzanuVarZza.zzc(size2);
        zzanv zzanvVar = (zzanv) zzanuVarZza.zzG();
        zzaik zzaikVarZza = zzaip.zza();
        zzaikVarZza.zzf(10);
        zzaikVarZza.zze(zzanvVar);
        zzaikVarZza.zzg(zzp(task));
        zzaikVarZza.zza((int) (j2 - j));
        zzt((zzaip) zzaikVarZza.zzG(), 3, zzmoVar, zzbVar);
    }

    @Override // com.google.android.libraries.places.internal.zzme
    public final void zzk(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, int i, zzmo zzmoVar) throws Throwable {
        zzajd zzajdVarZza = zzaje.zza();
        List<String> typesFilter = findAutocompletePredictionsRequest.getTypesFilter();
        TypeFilter typeFilter = findAutocompletePredictionsRequest.getTypeFilter();
        Integer inputOffset = findAutocompletePredictionsRequest.getInputOffset();
        if (!typesFilter.isEmpty()) {
            Iterator<String> it = typesFilter.iterator();
            while (it.hasNext()) {
                zzajdVarZza.zza(it.next());
            }
        } else if (typeFilter != null) {
            zzajdVarZza.zza(zzlm.zza(typeFilter));
        }
        if (inputOffset != null) {
            zzajdVarZza.zzb(inputOffset.intValue());
        }
        zzaje zzajeVar = (zzaje) zzajdVarZza.zzG();
        zzakc zzakcVarZza = zzakd.zza();
        if (zzajeVar != null) {
            zzakcVarZza.zza(zzajeVar);
        }
        zzakd zzakdVar = (zzakd) zzakcVarZza.zzG();
        zzamh zzamhVarZzq = zzq();
        zzamhVarZzq.zzh(6);
        zzamhVarZzq.zzd(zzakdVar);
        zzamj zzamjVar = (zzamj) zzamhVarZzq.zzG();
        zzaks zzaksVarZzb = zzmw.zzb(this.zzb, i, zzmoVar, com.google.android.libraries.places.api.auth.zzb.zza);
        zzaksVarZzb.zzp(1);
        zzaksVarZzb.zzb(zzamjVar);
        zzaksVarZzb.zzj(this.zzc.zzf());
        AutocompleteSessionToken sessionToken = findAutocompletePredictionsRequest.getSessionToken();
        if (sessionToken != null) {
            zzaksVarZzb.zzh(sessionToken.toString());
        }
        this.zza.zzb(zzaksVarZzb);
    }

    @Override // com.google.android.libraries.places.internal.zzme
    public final void zzl(Task task, long j, long j2, int i, zzmo zzmoVar, com.google.android.libraries.places.api.auth.zzb zzbVar) throws Throwable {
        int size = task.isSuccessful() ? ((FindAutocompletePredictionsResponse) task.getResult()).getAutocompletePredictions().size() : 0;
        zzahx zzahxVarZza = zzahy.zza();
        zzahxVarZza.zza(size);
        zzahy zzahyVar = (zzahy) zzahxVarZza.zzG();
        zzaik zzaikVarZza = zzaip.zza();
        zzaikVarZza.zzf(6);
        zzaikVarZza.zzd(zzahyVar);
        zzaikVarZza.zzg(zzp(task));
        zzaikVarZza.zza((int) (j2 - j));
        zzt((zzaip) zzaikVarZza.zzG(), i, zzmoVar, zzbVar);
    }

    @Override // com.google.android.libraries.places.internal.zzme
    public final void zzm(FetchPlaceRequest fetchPlaceRequest, int i, zzmo zzmoVar) throws Throwable {
        zzale zzaleVarZza = zzalf.zza();
        zzaleVarZza.zza(1);
        zzamc zzamcVarZza = zzamd.zza();
        zzamcVarZza.zza(zzll.zza(fetchPlaceRequest.getPlaceFields()));
        zzaleVarZza.zzb((zzamd) zzamcVarZza.zzG());
        zzalf zzalfVar = (zzalf) zzaleVarZza.zzG();
        zzamh zzamhVarZzq = zzq();
        zzamhVarZzq.zzh(5);
        zzamhVarZzq.zzc(zzalfVar);
        zzamj zzamjVar = (zzamj) zzamhVarZzq.zzG();
        zzaks zzaksVarZzb = zzmw.zzb(this.zzb, i, zzmoVar, com.google.android.libraries.places.api.auth.zzb.zza);
        zzaksVarZzb.zzp(1);
        zzaksVarZzb.zzb(zzamjVar);
        zzaksVarZzb.zzj(this.zzc.zzf());
        AutocompleteSessionToken sessionToken = fetchPlaceRequest.getSessionToken();
        if (sessionToken != null) {
            zzaksVarZzb.zzh(sessionToken.toString());
        }
        this.zza.zzb(zzaksVarZzb);
    }

    @Override // com.google.android.libraries.places.internal.zzme
    public final void zzn(Task task, long j, long j2, int i, zzmo zzmoVar, com.google.android.libraries.places.api.auth.zzb zzbVar) throws Throwable {
        boolean zIsSuccessful = task.isSuccessful();
        zzaic zzaicVarZza = zzaid.zza();
        zzaicVarZza.zza(1);
        zzaicVarZza.zzb(zIsSuccessful ? 1 : 0);
        zzaid zzaidVar = (zzaid) zzaicVarZza.zzG();
        zzaik zzaikVarZza = zzaip.zza();
        zzaikVarZza.zzf(8);
        zzaikVarZza.zzb(zzaidVar);
        zzaikVarZza.zzg(zzp(task));
        zzaikVarZza.zza((int) (j2 - j));
        zzt((zzaip) zzaikVarZza.zzG(), i, zzmoVar, zzbVar);
    }

    @Override // com.google.android.libraries.places.internal.zzme
    public final void zzo(FetchPlaceRequest fetchPlaceRequest, int i, zzmo zzmoVar) throws Throwable {
        zzale zzaleVarZza = zzalf.zza();
        zzaleVarZza.zza(1);
        zzamc zzamcVarZza = zzamd.zza();
        zzamcVarZza.zza(zzll.zza(fetchPlaceRequest.getPlaceFields()));
        zzaleVarZza.zzb((zzamd) zzamcVarZza.zzG());
        zzalf zzalfVar = (zzalf) zzaleVarZza.zzG();
        zzamh zzamhVarZzq = zzq();
        zzamhVarZzq.zzh(5);
        zzamhVarZzq.zzg(zzalfVar);
        zzamj zzamjVar = (zzamj) zzamhVarZzq.zzG();
        zzaks zzaksVarZzb = zzmw.zzb(this.zzb, i, zzmoVar, com.google.android.libraries.places.api.auth.zzb.zza);
        zzaksVarZzb.zzp(1);
        zzaksVarZzb.zzb(zzamjVar);
        zzaksVarZzb.zzj(this.zzc.zzf());
        this.zza.zzb(zzaksVarZzb);
    }

    zzfj(zzmv zzmvVar, zzmp zzmpVar, zzmf zzmfVar) {
        this.zza = zzmvVar;
        this.zzb = zzmpVar;
        this.zzc = zzmfVar;
    }
}

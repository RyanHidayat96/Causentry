package com.google.android.libraries.places.internal;

import android.app.Application;
import androidx.p002lifecycle.AndroidViewModel;
import androidx.p002lifecycle.LiveData;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModelKt;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.api.net.SearchByTextRequest;
import com.google.android.libraries.places.api.net.SearchByTextResponse;
import com.google.android.libraries.places.api.net.SearchNearbyRequest;
import com.google.android.libraries.places.api.net.SearchNearbyResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes3.dex */
public final class zzpw extends AndroidViewModel {
    public static final /* synthetic */ int zza = 0;
    private final MutableLiveData zzb;
    private final LiveData zzc;
    private final MutableLiveData zzd;
    private final LiveData zze;
    private final MutableLiveData zzf;
    private final LiveData zzg;
    private PlacesClient zzh;
    private zzoy zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzpw(Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "");
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.zzb = mutableLiveData;
        this.zzc = mutableLiveData;
        MutableLiveData mutableLiveData2 = new MutableLiveData();
        this.zzd = mutableLiveData2;
        this.zze = mutableLiveData2;
        MutableLiveData mutableLiveData3 = new MutableLiveData();
        this.zzf = mutableLiveData3;
        this.zzg = mutableLiveData3;
    }

    static /* synthetic */ Unit zzk(zzpw zzpwVar, SearchByTextResponse searchByTextResponse) {
        zzpwVar.zzb.postValue(searchByTextResponse.getPlaces());
        List<Place> places = searchByTextResponse.getPlaces();
        Intrinsics.checkNotNullExpressionValue(places, "");
        zzpwVar.zzh(places);
        return Unit.INSTANCE;
    }

    static /* synthetic */ void zzl(zzpw zzpwVar, Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        zzpwVar.zzd.postValue(exc);
    }

    static /* synthetic */ Unit zzm(zzpw zzpwVar, SearchNearbyResponse searchNearbyResponse) {
        zzpwVar.zzb.postValue(searchNearbyResponse.getPlaces());
        List<Place> places = searchNearbyResponse.getPlaces();
        Intrinsics.checkNotNullExpressionValue(places, "");
        zzpwVar.zzh(places);
        return Unit.INSTANCE;
    }

    static /* synthetic */ void zzn(zzpw zzpwVar, Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        zzpwVar.zzd.postValue(exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzo(List list, Continuation continuation) {
        PhotoMetadata photoMetadata = list != null ? (PhotoMetadata) CollectionsKt.firstOrNull(list) : null;
        if (photoMetadata == null) {
            return com.google.android.libraries.places.widget.internal.placedetails.zzbo.zza;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequestNewInstance = FetchResolvedPhotoUriRequest.newInstance(photoMetadata);
        PlacesClient placesClientZzd = zzd();
        Task taskZzc = placesClientZzd != null ? placesClientZzd.zzc(fetchResolvedPhotoUriRequestNewInstance, zzmo.PLACES_UI_KIT) : null;
        if (taskZzc != null) {
            final zzpt zzptVar = new zzpt(cancellableContinuationImpl2);
            taskZzc.addOnSuccessListener(new OnSuccessListener(zzptVar) { // from class: com.google.android.libraries.places.internal.zzpv
                private final /* synthetic */ Function1 zza;

                {
                    Intrinsics.checkNotNullParameter(zzptVar, "");
                    this.zza = zzptVar;
                }

                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final /* synthetic */ void onSuccess(Object obj) {
                    this.zza.invoke(obj);
                }
            });
        }
        if (taskZzc != null) {
            taskZzc.addOnFailureListener(new zzpu(cancellableContinuationImpl2));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // androidx.p002lifecycle.ViewModel
    public final void onCleared() {
        System.out.println("onCleared");
        super.onCleared();
        PlacesClient placesClientZzd = zzd();
        if (placesClientZzd != null) {
            placesClientZzd.zzk();
        }
    }

    public final PlacesClient zzd() {
        if (this.zzh == null) {
            zzoy zzoyVarZze = zze();
            this.zzh = zzoyVarZze != null ? zzoyVarZze.zzc() : null;
        }
        return this.zzh;
    }

    public final zzoy zze() {
        if (this.zzi == null) {
            zzox zzoxVarZza = zzow.zza();
            zzoxVarZza.zzc(getApplication().getApplicationContext());
            zzoxVarZza.zzb(zzmo.PLACES_UI_KIT);
            this.zzi = zzoxVarZza.zza();
        }
        return this.zzi;
    }

    public final void zzf(SearchByTextRequest searchByTextRequest, List list) {
        Intrinsics.checkNotNullParameter(searchByTextRequest, "");
        Intrinsics.checkNotNullParameter(list, "");
        SearchByTextRequest.Builder builderZza = searchByTextRequest.zza();
        Intrinsics.checkNotNullExpressionValue(builderZza, "");
        builderZza.setPlaceFields(list);
        builderZza.setRoutingSummariesIncluded(false);
        PlacesClient placesClientZzd = zzd();
        Task taskZzi = placesClientZzd != null ? placesClientZzd.zzi(builderZza.build(), zzmo.PLACES_UI_KIT) : null;
        if (taskZzi != null) {
            final Function1 function1 = new Function1() { // from class: com.google.android.libraries.places.internal.zzpq
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ Object invoke(Object obj) {
                    return zzpw.zzk(this.zza, (SearchByTextResponse) obj);
                }
            };
            taskZzi.addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.libraries.places.internal.zzpl
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final /* synthetic */ void onSuccess(Object obj) {
                    function1.invoke(obj);
                }
            });
        }
        if (taskZzi != null) {
            taskZzi.addOnFailureListener(new OnFailureListener() { // from class: com.google.android.libraries.places.internal.zzpm
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final /* synthetic */ void onFailure(Exception exc) {
                    zzpw.zzl(this.zza, exc);
                }
            });
        }
    }

    public final void zzg(SearchNearbyRequest searchNearbyRequest, List list) {
        Intrinsics.checkNotNullParameter(searchNearbyRequest, "");
        Intrinsics.checkNotNullParameter(list, "");
        SearchNearbyRequest.Builder builderZza = searchNearbyRequest.zza();
        Intrinsics.checkNotNullExpressionValue(builderZza, "");
        builderZza.setPlaceFields(list);
        builderZza.setRoutingSummariesIncluded(false);
        PlacesClient placesClientZzd = zzd();
        Task taskZzj = placesClientZzd != null ? placesClientZzd.zzj(builderZza.build(), zzmo.PLACES_UI_KIT) : null;
        if (taskZzj != null) {
            final Function1 function1 = new Function1() { // from class: com.google.android.libraries.places.internal.zzpn
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ Object invoke(Object obj) {
                    return zzpw.zzm(this.zza, (SearchNearbyResponse) obj);
                }
            };
            taskZzj.addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.libraries.places.internal.zzpo
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final /* synthetic */ void onSuccess(Object obj) {
                    function1.invoke(obj);
                }
            });
        }
        if (taskZzj != null) {
            taskZzj.addOnFailureListener(new OnFailureListener() { // from class: com.google.android.libraries.places.internal.zzpp
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final /* synthetic */ void onFailure(Exception exc) {
                    zzpw.zzn(this.zza, exc);
                }
            });
        }
    }

    public final void zzh(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        b.TuitionPaymentFragmentbindingInflater1(ViewModelKt.getViewModelScope(this), null, null, new zzps(list, this, null), 3, null);
    }

    public final LiveData zza() {
        return this.zzc;
    }

    public final LiveData zzb() {
        return this.zze;
    }

    public final LiveData zzc() {
        return this.zzg;
    }
}

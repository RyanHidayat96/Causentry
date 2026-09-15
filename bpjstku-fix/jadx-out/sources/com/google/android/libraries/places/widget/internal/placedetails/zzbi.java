package com.google.android.libraries.places.widget.internal.placedetails;

import android.app.Application;
import android.net.Uri;
import androidx.p002lifecycle.AndroidViewModel;
import androidx.p002lifecycle.LiveData;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModelKt;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.model.AuthorAttribution;
import com.google.android.libraries.places.api.model.AuthorAttributions;
import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.internal.zzmo;
import com.google.android.libraries.places.internal.zzow;
import com.google.android.libraries.places.internal.zzox;
import com.google.android.libraries.places.internal.zzoy;
import com.google.android.libraries.places.internal.zzoz;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbi extends AndroidViewModel {
    public static final /* synthetic */ int zza = 0;
    private final MutableLiveData zzb;
    private final LiveData zzc;
    private final MutableLiveData zzd;
    private final LiveData zze;
    private final List zzf;
    private final List zzg;
    private final List zzh;
    private final MutableLiveData zzi;
    private final MutableLiveData zzj;
    private zzoy zzk;
    private PlacesClient zzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbi(Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "");
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.zzb = mutableLiveData;
        this.zzc = mutableLiveData;
        MutableLiveData mutableLiveData2 = new MutableLiveData();
        this.zzd = mutableLiveData2;
        this.zze = mutableLiveData2;
        List listMutableListOf = CollectionsKt.mutableListOf(new MutableLiveData(), new MutableLiveData(), new MutableLiveData());
        this.zzf = listMutableListOf;
        this.zzg = new ArrayList();
        this.zzh = listMutableListOf;
        MutableLiveData mutableLiveData3 = new MutableLiveData();
        this.zzi = mutableLiveData3;
        this.zzj = mutableLiveData3;
    }

    static /* synthetic */ Unit zzl(zzbi zzbiVar, zzbc zzbcVar, FetchPlaceResponse fetchPlaceResponse) {
        List list;
        MutableLiveData mutableLiveData = zzbiVar.zzb;
        Place place = fetchPlaceResponse.getPlace();
        mutableLiveData.postValue(place);
        if (zzbcVar.zza()) {
            List<PhotoMetadata> photoMetadatas = place.getPhotoMetadatas();
            int i = 0;
            if (photoMetadatas == null) {
                List list2 = zzbiVar.zzf;
                ((MutableLiveData) list2.get(0)).postValue(zzbo.zza);
                MutableLiveData mutableLiveData2 = (MutableLiveData) list2.get(1);
                zzbn zzbnVar = zzbn.zza;
                mutableLiveData2.postValue(zzbnVar);
                ((MutableLiveData) list2.get(2)).postValue(zzbnVar);
            } else if (photoMetadatas.isEmpty()) {
                ((MutableLiveData) zzbiVar.zzf.get(0)).postValue(zzbo.zza);
            } else {
                while (true) {
                    list = zzbiVar.zzf;
                    if (list.size() >= photoMetadatas.size()) {
                        break;
                    }
                    list.add(new MutableLiveData());
                }
                List list3 = zzbiVar.zzg;
                int size = photoMetadatas.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(new MutableLiveData());
                }
                list3.addAll(arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (PhotoMetadata photoMetadata : photoMetadatas) {
                    arrayList2.add(new zzau(photoMetadata, zzbcVar.zzc(), (MutableLiveData) list.get(i)));
                    arrayList2.add(new zzau(photoMetadata, zzbcVar.zzd(), (MutableLiveData) list3.get(i)));
                    i++;
                }
                for (int size2 = photoMetadatas.size(); size2 < 3; size2++) {
                    ((MutableLiveData) list.get(size2)).postValue(zzbn.zza);
                }
                b.TuitionPaymentFragmentbindingInflater1(ViewModelKt.getViewModelScope(zzbiVar), null, null, new zzbe(arrayList2, zzbiVar, null), 3, null);
            }
        }
        return Unit.INSTANCE;
    }

    static /* synthetic */ void zzm(zzbi zzbiVar, String str, Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        zzbiVar.zzd.postValue(exc);
    }

    static /* synthetic */ void zzn(zzbi zzbiVar, LatLng latLng, Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        zzbiVar.zzd.postValue(exc);
        new StringBuilder(String.valueOf(latLng).length() + 27);
        Objects.toString(latLng);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzo(PhotoMetadata photoMetadata, int i, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        FetchResolvedPhotoUriRequest.Builder builder = FetchResolvedPhotoUriRequest.builder(photoMetadata);
        builder.setMaxWidth(Boxing.boxInt(i));
        builder.setMaxHeight(Boxing.boxInt(i));
        FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequestBuild = builder.build();
        PlacesClient placesClient = this.zzl;
        Task taskZzc = placesClient != null ? placesClient.zzc(fetchResolvedPhotoUriRequestBuild, zzmo.PLACES_UI_KIT) : null;
        if (taskZzc != null) {
            final zzbf zzbfVar = new zzbf(cancellableContinuationImpl2);
            taskZzc.addOnSuccessListener(new OnSuccessListener(zzbfVar) { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzbh
                private final /* synthetic */ Function1 zza;

                {
                    Intrinsics.checkNotNullParameter(zzbfVar, "");
                    this.zza = zzbfVar;
                }

                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final /* synthetic */ void onSuccess(Object obj) {
                    this.zza.invoke(obj);
                }
            });
        }
        if (taskZzc != null) {
            taskZzc.addOnFailureListener(new zzbg(cancellableContinuationImpl2));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public final zzoy zze() {
        if (this.zzk == null) {
            zzox zzoxVarZza = zzow.zza();
            zzoxVarZza.zzc(getApplication().getApplicationContext());
            zzoxVarZza.zzb(zzmo.PLACES_UI_KIT);
            this.zzk = zzoxVarZza.zza();
        }
        return this.zzk;
    }

    public final void zzf(final String str, final zzbc zzbcVar) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(zzbcVar, "");
        for (int i = 0; i < 3; i++) {
            ((MutableLiveData) this.zzf.get(i)).postValue(zzbm.zza);
        }
        zzoy zzoyVarZze = zze();
        this.zzl = zzoyVarZze != null ? zzoyVarZze.zzc() : null;
        FetchPlaceRequest fetchPlaceRequestNewInstance = FetchPlaceRequest.newInstance(str, zzbcVar.zzb());
        PlacesClient placesClient = this.zzl;
        Task taskZzd = placesClient != null ? placesClient.zzd(fetchPlaceRequestNewInstance, zzmo.PLACES_UI_KIT) : null;
        if (taskZzd != null) {
            final Function1 function1 = new Function1() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzba
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ Object invoke(Object obj) {
                    return zzbi.zzl(this.zza, zzbcVar, (FetchPlaceResponse) obj);
                }
            };
            taskZzd.addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzav
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final /* synthetic */ void onSuccess(Object obj) {
                    function1.invoke(obj);
                }
            });
        }
        if (taskZzd != null) {
            taskZzd.addOnFailureListener(new OnFailureListener() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzaw
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final /* synthetic */ void onFailure(Exception exc) {
                    zzbi.zzm(this.zza, str, exc);
                }
            });
        }
    }

    public final void zzg(final LatLng latLng, final zzbc zzbcVar) {
        Intrinsics.checkNotNullParameter(latLng, "");
        Intrinsics.checkNotNullParameter(zzbcVar, "");
        for (int i = 0; i < 3; i++) {
            ((MutableLiveData) this.zzf.get(i)).postValue(zzbm.zza);
        }
        zzoy zzoyVarZze = zze();
        PlacesClient placesClientZzc = zzoyVarZze != null ? zzoyVarZze.zzc() : null;
        this.zzl = placesClientZzc;
        Task taskZze = placesClientZzc != null ? placesClientZzc.zze(latLng) : null;
        if (taskZze != null) {
            final Function1 function1 = new Function1() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzax
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ Object invoke(Object obj) {
                    String str = (String) obj;
                    Intrinsics.checkNotNull(str);
                    this.zza.zzf(str, zzbcVar);
                    return Unit.INSTANCE;
                }
            };
            taskZze.addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzay
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final /* synthetic */ void onSuccess(Object obj) {
                    function1.invoke(obj);
                }
            });
        }
        if (taskZze != null) {
            taskZze.addOnFailureListener(new OnFailureListener() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzaz
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final /* synthetic */ void onFailure(Exception exc) {
                    zzbi.zzn(this.zza, latLng, exc);
                }
            });
        }
    }

    public final void zzh() {
        this.zzi.postValue(Unit.INSTANCE);
    }

    public final zzoz zzi() {
        zzoy zzoyVarZze = zze();
        if (zzoyVarZze != null) {
            return zzoyVarZze.zzd();
        }
        return null;
    }

    public final ArrayList zzj() {
        List<PhotoMetadata> photoMetadatas;
        ArrayList arrayList = new ArrayList();
        Place place = (Place) this.zzb.getValue();
        if (place != null && (photoMetadatas = place.getPhotoMetadatas()) != null) {
            int size = photoMetadatas.size();
            for (int i = 0; i < size; i++) {
                PhotoMetadata photoMetadata = photoMetadatas.get(i);
                Uri uriZzc = photoMetadata.zzc();
                String uri = null;
                String string = uriZzc != null ? uriZzc.toString() : null;
                AuthorAttributions authorAttributions = photoMetadata.getAuthorAttributions();
                AuthorAttribution authorAttribution = authorAttributions != null ? authorAttributions.asList().get(0) : null;
                MutableLiveData mutableLiveData = (MutableLiveData) CollectionsKt.getOrNull(this.zzg, i);
                zzbp zzbpVar = mutableLiveData != null ? (zzbp) mutableLiveData.getValue() : null;
                Intrinsics.checkNotNull(zzbpVar, "");
                String string2 = ((zzbl) zzbpVar).zza().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "");
                MutableLiveData mutableLiveData2 = (MutableLiveData) CollectionsKt.getOrNull(this.zzf, i);
                zzbp zzbpVar2 = mutableLiveData2 != null ? (zzbp) mutableLiveData2.getValue() : null;
                zzbl zzblVar = zzbpVar2 instanceof zzbl ? (zzbl) zzbpVar2 : null;
                String string3 = zzblVar != null ? zzblVar.zza().toString() : null;
                String name = authorAttribution != null ? authorAttribution.getName() : null;
                String photoUri = authorAttribution != null ? authorAttribution.getPhotoUri() : null;
                if (authorAttribution != null) {
                    uri = authorAttribution.getUri();
                }
                arrayList.add(new com.google.android.libraries.places.widget.model.zzi(string2, string3, string, name, photoUri, uri));
            }
        }
        return arrayList;
    }

    public final LiveData zza() {
        return this.zzc;
    }

    public final LiveData zzb() {
        return this.zze;
    }

    public final List zzc() {
        return this.zzh;
    }

    public final MutableLiveData zzd() {
        return this.zzj;
    }
}

package defpackage;

import android.graphics.Bitmap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.PlaceLikelihood;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import com.google.android.libraries.places.api.net.FetchPhotoResponse;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import com.google.android.libraries.places.api.net.FindCurrentPlaceResponse;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.rtchagas.pingplacepicker.model.SearchResult;
import com.rtchagas.pingplacepicker.model.SimplePlace;
import com.rtchagas.pingplacepicker.repository.googlemaps.GoogleMapsAPI;
import com.rtchagas.pingplacepicker.repository.googlemaps.PlaceFromCoordinates;
import io.reactivex.internal.operators.single.SingleFlatMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class setFile implements AutoValue_FileOutputOptions_FileOutputOptionsInternal1 {
    private final PlacesClient TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final GoogleMapsAPI TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public setFile(PlacesClient placesClient, GoogleMapsAPI googleMapsAPI) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = placesClient;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = googleMapsAPI;
    }

    @Override // defpackage.AutoValue_FileOutputOptions_FileOutputOptionsInternal1
    public final deriveCodec<List<Place>> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        final FindCurrentPlaceRequest findCurrentPlaceRequestBuild = FindCurrentPlaceRequest.builder(TuitionPaymentFragmentspecialinlinedviewModeldefault3()).build();
        Intrinsics.checkExpressionValueIsNotNull(findCurrentPlaceRequestBuild, "");
        deriveCodec<List<Place>> derivecodecB = deriveCodec.b(new scaleBitrate<T>() { // from class: setFile.4
            @Override // defpackage.scaleBitrate
            public final void subscribe(final BackupHdrProfileEncoderProfilesProvider<List<Place>> backupHdrProfileEncoderProfilesProvider) {
                setFile.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.findCurrentPlace(findCurrentPlaceRequestBuild).addOnCompleteListener(new OnCompleteListener<FindCurrentPlaceResponse>() { // from class: setFile.4.5
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task<FindCurrentPlaceResponse> task) {
                        if (task.isSuccessful()) {
                            FindCurrentPlaceResponse result = task.getResult();
                            if (result != null) {
                                setFile setfile = setFile.this;
                                Intrinsics.checkExpressionValueIsNotNull(result, "");
                                List<PlaceLikelihood> placeLikelihoods = result.getPlaceLikelihoods();
                                Intrinsics.checkExpressionValueIsNotNull(placeLikelihoods, "");
                                List listTuitionPaymentFragmentspecialinlinedviewModeldefault1 = setFile.TuitionPaymentFragmentspecialinlinedviewModeldefault1(placeLikelihoods);
                                BackupHdrProfileEncoderProfilesProvider backupHdrProfileEncoderProfilesProvider2 = backupHdrProfileEncoderProfilesProvider;
                                List list = listTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((PlaceLikelihood) it.next()).getPlace());
                                }
                                backupHdrProfileEncoderProfilesProvider2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(arrayList);
                            }
                            backupHdrProfileEncoderProfilesProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault2(CollectionsKt.emptyList());
                            return;
                        }
                        BackupHdrProfileEncoderProfilesProvider backupHdrProfileEncoderProfilesProvider3 = backupHdrProfileEncoderProfilesProvider;
                        Exception exception = task.getException();
                        if (exception == null) {
                            exception = new Exception("No places for you...");
                        }
                        backupHdrProfileEncoderProfilesProvider3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(exception);
                    }
                });
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(derivecodecB, "");
        return derivecodecB;
    }

    @Override // defpackage.AutoValue_FileOutputOptions_FileOutputOptionsInternal1
    public final deriveCodec<List<Place>> TuitionPaymentFragmentspecialinlinedviewModeldefault2(LatLng latLng) {
        StringBuilder sb = new StringBuilder();
        sb.append(latLng.latitude);
        sb.append(',');
        sb.append(latLng.longitude);
        String string = sb.toString();
        GoogleMapsAPI googleMapsAPI = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder.Companion companion = AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder.INSTANCE;
        deriveCodec<SearchResult> derivecodecSearchNearby = googleMapsAPI.searchNearby(string, AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        readableMs readablems = new readableMs<T, generateBackupProfile<? extends R>>() { // from class: setFile.1
            @Override // defpackage.readableMs
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
            public final deriveCodec<List<Place>> apply(SearchResult searchResult) {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = searchResult.results.iterator();
                while (it.hasNext()) {
                    arrayList.add(setFile.TuitionPaymentFragmentbindingInflater1(setFile.this, ((SimplePlace) it.next()).placeId));
                }
                return deriveCodec.TuitionPaymentFragmentspecialinlinedviewModeldefault1(arrayList, new readableMs<Object[], R>() { // from class: setFile.1.5
                    @Override // defpackage.readableMs
                    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
                    public final List<Place> apply(Object[] objArr) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : objArr) {
                            if (obj == null) {
                                throw new TypeCastException("null cannot be cast to non-null type com.google.android.libraries.places.api.model.Place");
                            }
                            arrayList2.add((Place) obj);
                        }
                        return arrayList2;
                    }
                });
            }
        };
        share.b(readablems, "mapper is null");
        SingleFlatMap singleFlatMap = new SingleFlatMap(derivecodecSearchNearby, readablems);
        Intrinsics.checkExpressionValueIsNotNull(singleFlatMap, "");
        return singleFlatMap;
    }

    @Override // defpackage.AutoValue_FileOutputOptions_FileOutputOptionsInternal1
    public final deriveCodec<Bitmap> TuitionPaymentFragmentbindingInflater1(PhotoMetadata photoMetadata) {
        final FetchPhotoRequest fetchPhotoRequestBuild = FetchPhotoRequest.builder(photoMetadata).setMaxWidth(640).setMaxHeight(320).build();
        Intrinsics.checkExpressionValueIsNotNull(fetchPhotoRequestBuild, "");
        deriveCodec<Bitmap> derivecodecB = deriveCodec.b(new scaleBitrate<T>() { // from class: setFile.3
            @Override // defpackage.scaleBitrate
            public final void subscribe(final BackupHdrProfileEncoderProfilesProvider<Bitmap> backupHdrProfileEncoderProfilesProvider) {
                setFile.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.fetchPhoto(fetchPhotoRequestBuild).addOnSuccessListener(new OnSuccessListener<FetchPhotoResponse>() { // from class: setFile.3.5
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
                    public final void onSuccess(FetchPhotoResponse fetchPhotoResponse) {
                        Intrinsics.checkExpressionValueIsNotNull(fetchPhotoResponse, "");
                        Bitmap bitmap = fetchPhotoResponse.getBitmap();
                        Intrinsics.checkExpressionValueIsNotNull(bitmap, "");
                        backupHdrProfileEncoderProfilesProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bitmap);
                    }
                }).addOnFailureListener(new OnFailureListener() { // from class: setFile.3.2
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        backupHdrProfileEncoderProfilesProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault1(exc);
                    }
                });
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(derivecodecB, "");
        return derivecodecB;
    }

    @Override // defpackage.AutoValue_FileOutputOptions_FileOutputOptionsInternal1
    public final deriveCodec<Place> TuitionPaymentFragmentbindingInflater1(final LatLng latLng) {
        StringBuilder sb = new StringBuilder();
        sb.append(latLng.latitude);
        sb.append(',');
        sb.append(latLng.longitude);
        String string = sb.toString();
        GoogleMapsAPI googleMapsAPI = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder.Companion companion = AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder.INSTANCE;
        deriveCodec<SearchResult> derivecodecFindByLocation = googleMapsAPI.findByLocation(string, AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        readableMs readablems = new readableMs<T, generateBackupProfile<? extends R>>() { // from class: setFile.2
            @Override // defpackage.readableMs
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
            public final deriveCodec<? extends Place> apply(SearchResult searchResult) {
                if (Intrinsics.areEqual("OK", searchResult.status) && !searchResult.results.isEmpty()) {
                    return setFile.TuitionPaymentFragmentbindingInflater1(setFile.this, searchResult.results.get(0).placeId);
                }
                return deriveCodec.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new PlaceFromCoordinates(latLng.latitude, latLng.longitude));
            }
        };
        share.b(readablems, "mapper is null");
        SingleFlatMap singleFlatMap = new SingleFlatMap(derivecodecFindByLocation, readablems);
        Intrinsics.checkExpressionValueIsNotNull(singleFlatMap, "");
        return singleFlatMap;
    }

    private static List<Place.Field> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return CollectionsKt.listOf((Object[]) new Place.Field[]{Place.Field.ID, Place.Field.NAME, Place.Field.ADDRESS, Place.Field.LAT_LNG, Place.Field.TYPES, Place.Field.PHOTO_METADATAS});
    }

    public static final /* synthetic */ deriveCodec TuitionPaymentFragmentbindingInflater1(setFile setfile, String str) {
        final FetchPlaceRequest fetchPlaceRequestBuild = FetchPlaceRequest.builder(str, TuitionPaymentFragmentspecialinlinedviewModeldefault3()).build();
        Intrinsics.checkExpressionValueIsNotNull(fetchPlaceRequestBuild, "");
        deriveCodec derivecodecB = deriveCodec.b(new scaleBitrate<T>() { // from class: setFile.5
            @Override // defpackage.scaleBitrate
            public final void subscribe(final BackupHdrProfileEncoderProfilesProvider<Place> backupHdrProfileEncoderProfilesProvider) {
                setFile.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.fetchPlace(fetchPlaceRequestBuild).addOnSuccessListener(new OnSuccessListener<FetchPlaceResponse>() { // from class: setFile.5.5
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final void onSuccess(FetchPlaceResponse fetchPlaceResponse) {
                        BackupHdrProfileEncoderProfilesProvider backupHdrProfileEncoderProfilesProvider2 = backupHdrProfileEncoderProfilesProvider;
                        Intrinsics.checkExpressionValueIsNotNull(fetchPlaceResponse, "");
                        backupHdrProfileEncoderProfilesProvider2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(fetchPlaceResponse.getPlace());
                    }
                }).addOnFailureListener(new OnFailureListener() { // from class: setFile.5.2
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        backupHdrProfileEncoderProfilesProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault1(exc);
                    }
                });
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(derivecodecB, "");
        return derivecodecB;
    }

    public static final /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault1(List list) {
        List mutableList = CollectionsKt.toMutableList((Collection) list);
        if (mutableList.size() > 1) {
            CollectionsKt.sortWith(mutableList, new Comparator<T>() { // from class: setFile.9
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Double.valueOf(((PlaceLikelihood) t2).getLikelihood()), Double.valueOf(((PlaceLikelihood) t).getLikelihood()));
                }
            });
        }
        return mutableList;
    }
}

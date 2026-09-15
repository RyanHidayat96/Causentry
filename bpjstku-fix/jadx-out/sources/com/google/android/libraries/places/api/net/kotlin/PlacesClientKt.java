package com.google.android.libraries.places.api.net.kotlin;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.PhotoMetadata;
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
import com.google.android.libraries.places.internal.zzmo;
import defpackage.isHdrEncodingMatched;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0087@¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\r\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\t2\u0019\b\u0002\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0087@¢\u0006\u0004\b\r\u0010\u000e\u001a7\u0010\u0011\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\t2\u0019\b\u0002\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0087@¢\u0006\u0004\b\u0011\u0010\u000e\u001aE\u0010\u0018\u001a\u00020\u0017*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0019\b\u0002\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0087@¢\u0006\u0004\b\u0018\u0010\u0019\u001a\"\u0010\u001b\u001a\u00020\u001a*\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0087@¢\u0006\u0004\b\u001b\u0010\u001c\u001a(\u0010\u001f\u001a\u00020\u001e*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00122\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u001dH\u0087@¢\u0006\u0004\b\u001f\u0010 \u001a(\u0010\u001f\u001a\u00020\u001e*\u00020\u00002\u0006\u0010\u0005\u001a\u00020!2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u001dH\u0087@¢\u0006\u0004\b\u001f\u0010\"\u001aE\u0010%\u001a\u00020$*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0019\b\u0002\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0087@¢\u0006\u0004\b%\u0010\u0019\u001aE\u0010)\u001a\u00020(*\u00020\u00002\u0006\u0010\u0005\u001a\u00020&2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0019\b\u0002\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0087@¢\u0006\u0004\b)\u0010*"}, d2 = {"Lcom/google/android/libraries/places/api/net/PlacesClient;", "Lkotlin/Function1;", "Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsRequest$Builder;", "", "Lkotlin/ExtensionFunctionType;", "p0", "Lcom/google/android/libraries/places/api/net/FindAutocompletePredictionsResponse;", "awaitFindAutocompletePredictions", "(Lcom/google/android/libraries/places/api/net/PlacesClient;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/google/android/libraries/places/api/model/PhotoMetadata;", "Lcom/google/android/libraries/places/api/net/FetchPhotoRequest$Builder;", "p1", "Lcom/google/android/libraries/places/api/net/FetchPhotoResponse;", "awaitFetchPhoto", "(Lcom/google/android/libraries/places/api/net/PlacesClient;Lcom/google/android/libraries/places/api/model/PhotoMetadata;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/google/android/libraries/places/api/net/FetchResolvedPhotoUriRequest$Builder;", "Lcom/google/android/libraries/places/api/net/FetchResolvedPhotoUriResponse;", "awaitFetchResolvedPhotoUri", "", "", "Lcom/google/android/libraries/places/api/model/Place$Field;", "Lcom/google/android/libraries/places/api/net/FetchPlaceRequest$Builder;", "p2", "Lcom/google/android/libraries/places/api/net/FetchPlaceResponse;", "awaitFetchPlace", "(Lcom/google/android/libraries/places/api/net/PlacesClient;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/google/android/libraries/places/api/net/FindCurrentPlaceResponse;", "awaitFindCurrentPlace", "(Lcom/google/android/libraries/places/api/net/PlacesClient;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/google/android/libraries/places/api/net/IsOpenResponse;", "awaitIsOpen", "(Lcom/google/android/libraries/places/api/net/PlacesClient;Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/google/android/libraries/places/api/model/Place;", "(Lcom/google/android/libraries/places/api/net/PlacesClient;Lcom/google/android/libraries/places/api/model/Place;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/google/android/libraries/places/api/net/SearchByTextRequest$Builder;", "Lcom/google/android/libraries/places/api/net/SearchByTextResponse;", "awaitSearchByText", "Lcom/google/android/libraries/places/api/model/LocationRestriction;", "Lcom/google/android/libraries/places/api/net/SearchNearbyRequest$Builder;", "Lcom/google/android/libraries/places/api/net/SearchNearbyResponse;", "awaitSearchNearby", "(Lcom/google/android/libraries/places/api/net/PlacesClient;Lcom/google/android/libraries/places/api/model/LocationRestriction;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class PlacesClientKt {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object awaitFetchPhoto(PlacesClient placesClient, PhotoMetadata photoMetadata, Function1<? super FetchPhotoRequest.Builder, Unit> function1, Continuation<? super FetchPhotoResponse> continuation) throws ApiException {
        zzi zziVar;
        if (continuation instanceof zzi) {
            zziVar = (zzi) continuation;
            int i = zziVar.zzb;
            if ((i & Integer.MIN_VALUE) != 0) {
                zziVar.zzb = i - Integer.MIN_VALUE;
            } else {
                zziVar = new zzi(continuation);
            }
        } else {
            zziVar = new zzi(continuation);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zziVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zziVar.zzb;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
            FetchPhotoRequest.Builder builder = FetchPhotoRequest.builder(photoMetadata);
            builder.setCancellationToken(cancellationTokenSource.getToken());
            function1.invoke(builder);
            Task taskZzb = placesClient.zzb(builder.build(), zzmo.PROGRAMMATIC_KOTLIN_API);
            Intrinsics.checkNotNullExpressionValue(taskZzb, "");
            zziVar.zzb = 1;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = isHdrEncodingMatched.TuitionPaymentFragmentspecialinlinedviewModeldefault3(taskZzb, cancellationTokenSource, zziVar);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        Intrinsics.checkNotNullExpressionValue(objTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        return objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public static /* synthetic */ Object awaitFetchPhoto$default(PlacesClient placesClient, PhotoMetadata photoMetadata, Function1 function1, Continuation continuation, int i, Object obj) throws ApiException {
        if ((i & 2) != 0) {
            function1 = zzh.zza;
        }
        return awaitFetchPhoto(placesClient, photoMetadata, function1, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object awaitFetchPlace(PlacesClient placesClient, String str, List<? extends Place.Field> list, Function1<? super FetchPlaceRequest.Builder, Unit> function1, Continuation<? super FetchPlaceResponse> continuation) throws ApiException {
        zzj zzjVar;
        if (continuation instanceof zzj) {
            zzjVar = (zzj) continuation;
            int i = zzjVar.zzb;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzjVar.zzb = i - Integer.MIN_VALUE;
            } else {
                zzjVar = new zzj(continuation);
            }
        } else {
            zzjVar = new zzj(continuation);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzjVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzjVar.zzb;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
            FetchPlaceRequest.Builder builder = FetchPlaceRequest.builder(str, list);
            builder.setCancellationToken(cancellationTokenSource.getToken());
            function1.invoke(builder);
            Task taskZzd = placesClient.zzd(builder.build(), zzmo.PROGRAMMATIC_KOTLIN_API);
            Intrinsics.checkNotNullExpressionValue(taskZzd, "");
            zzjVar.zzb = 1;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = isHdrEncodingMatched.TuitionPaymentFragmentspecialinlinedviewModeldefault3(taskZzd, cancellationTokenSource, zzjVar);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        Intrinsics.checkNotNullExpressionValue(objTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        return objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public static /* synthetic */ Object awaitFetchPlace$default(PlacesClient placesClient, String str, List list, Function1 function1, Continuation continuation, int i, Object obj) throws ApiException {
        if ((i & 4) != 0) {
            function1 = zzb.zza;
        }
        return awaitFetchPlace(placesClient, str, list, function1, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object awaitFetchResolvedPhotoUri(PlacesClient placesClient, PhotoMetadata photoMetadata, Function1<? super FetchResolvedPhotoUriRequest.Builder, Unit> function1, Continuation<? super FetchResolvedPhotoUriResponse> continuation) throws ApiException {
        zzk zzkVar;
        if (continuation instanceof zzk) {
            zzkVar = (zzk) continuation;
            int i = zzkVar.zzb;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzkVar.zzb = i - Integer.MIN_VALUE;
            } else {
                zzkVar = new zzk(continuation);
            }
        } else {
            zzkVar = new zzk(continuation);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzkVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzkVar.zzb;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
            FetchResolvedPhotoUriRequest.Builder builder = FetchResolvedPhotoUriRequest.builder(photoMetadata);
            builder.setCancellationToken(cancellationTokenSource.getToken());
            function1.invoke(builder);
            Task taskZzc = placesClient.zzc(builder.build(), zzmo.PROGRAMMATIC_KOTLIN_API);
            Intrinsics.checkNotNullExpressionValue(taskZzc, "");
            zzkVar.zzb = 1;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = isHdrEncodingMatched.TuitionPaymentFragmentspecialinlinedviewModeldefault3(taskZzc, cancellationTokenSource, zzkVar);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        Intrinsics.checkNotNullExpressionValue(objTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        return objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public static /* synthetic */ Object awaitFetchResolvedPhotoUri$default(PlacesClient placesClient, PhotoMetadata photoMetadata, Function1 function1, Continuation continuation, int i, Object obj) throws ApiException {
        if ((i & 2) != 0) {
            function1 = zza.zza;
        }
        return awaitFetchResolvedPhotoUri(placesClient, photoMetadata, function1, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object awaitFindAutocompletePredictions(PlacesClient placesClient, Function1<? super FindAutocompletePredictionsRequest.Builder, Unit> function1, Continuation<? super FindAutocompletePredictionsResponse> continuation) throws ApiException {
        zzl zzlVar;
        if (continuation instanceof zzl) {
            zzlVar = (zzl) continuation;
            int i = zzlVar.zzb;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzlVar.zzb = i - Integer.MIN_VALUE;
            } else {
                zzlVar = new zzl(continuation);
            }
        } else {
            zzlVar = new zzl(continuation);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzlVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzlVar.zzb;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
            FindAutocompletePredictionsRequest.Builder builder = FindAutocompletePredictionsRequest.builder();
            builder.setCancellationToken(cancellationTokenSource.getToken());
            function1.invoke(builder);
            Task taskZza = placesClient.zza(builder.build(), zzmo.PROGRAMMATIC_KOTLIN_API);
            Intrinsics.checkNotNullExpressionValue(taskZza, "");
            zzlVar.zzb = 1;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = isHdrEncodingMatched.TuitionPaymentFragmentspecialinlinedviewModeldefault3(taskZza, cancellationTokenSource, zzlVar);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        Intrinsics.checkNotNullExpressionValue(objTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        return objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object awaitFindCurrentPlace(PlacesClient placesClient, List<? extends Place.Field> list, Continuation<? super FindCurrentPlaceResponse> continuation) throws ApiException {
        zzm zzmVar;
        if (continuation instanceof zzm) {
            zzmVar = (zzm) continuation;
            int i = zzmVar.zzb;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzmVar.zzb = i - Integer.MIN_VALUE;
            } else {
                zzmVar = new zzm(continuation);
            }
        } else {
            zzmVar = new zzm(continuation);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzmVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzmVar.zzb;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
            Task taskZzf = placesClient.zzf(FindCurrentPlaceRequestKt.findCurrentPlaceRequest(list, new Function1() { // from class: com.google.android.libraries.places.api.net.kotlin.zzc
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ Object invoke(Object obj) {
                    FindCurrentPlaceRequest.Builder builder = (FindCurrentPlaceRequest.Builder) obj;
                    Intrinsics.checkNotNullParameter(builder, "");
                    builder.setCancellationToken(cancellationTokenSource.getToken());
                    return Unit.INSTANCE;
                }
            }), zzmo.PROGRAMMATIC_KOTLIN_API);
            Intrinsics.checkNotNullExpressionValue(taskZzf, "");
            zzmVar.zzb = 1;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = isHdrEncodingMatched.TuitionPaymentFragmentspecialinlinedviewModeldefault3(taskZzf, cancellationTokenSource, zzmVar);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        Intrinsics.checkNotNullExpressionValue(objTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        return objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object awaitIsOpen(PlacesClient placesClient, Place place, Long l, Continuation<? super IsOpenResponse> continuation) throws ApiException {
        zzo zzoVar;
        if (continuation instanceof zzo) {
            zzoVar = (zzo) continuation;
            int i = zzoVar.zzb;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzoVar.zzb = i - Integer.MIN_VALUE;
            } else {
                zzoVar = new zzo(continuation);
            }
        } else {
            zzoVar = new zzo(continuation);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzoVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzoVar.zzb;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
            Task taskZzh = placesClient.zzh(IsOpenRequestKt.isOpenRequest(place, l, (Function1<? super IsOpenRequest.Builder, Unit>) new Function1() { // from class: com.google.android.libraries.places.api.net.kotlin.zze
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ Object invoke(Object obj) {
                    IsOpenRequest.Builder builder = (IsOpenRequest.Builder) obj;
                    Intrinsics.checkNotNullParameter(builder, "");
                    builder.setCancellationToken(cancellationTokenSource.getToken());
                    return Unit.INSTANCE;
                }
            }), zzmo.PROGRAMMATIC_KOTLIN_API);
            Intrinsics.checkNotNullExpressionValue(taskZzh, "");
            zzoVar.zzb = 1;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = isHdrEncodingMatched.TuitionPaymentFragmentspecialinlinedviewModeldefault3(taskZzh, cancellationTokenSource, zzoVar);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        Intrinsics.checkNotNullExpressionValue(objTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        return objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public static /* synthetic */ Object awaitIsOpen$default(PlacesClient placesClient, Place place, Long l, Continuation continuation, int i, Object obj) throws ApiException {
        if ((i & 2) != 0) {
            l = null;
        }
        return awaitIsOpen(placesClient, place, l, (Continuation<? super IsOpenResponse>) continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object awaitSearchByText(PlacesClient placesClient, String str, List<? extends Place.Field> list, Function1<? super SearchByTextRequest.Builder, Unit> function1, Continuation<? super SearchByTextResponse> continuation) throws ApiException {
        zzp zzpVar;
        if (continuation instanceof zzp) {
            zzpVar = (zzp) continuation;
            int i = zzpVar.zzb;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzpVar.zzb = i - Integer.MIN_VALUE;
            } else {
                zzpVar = new zzp(continuation);
            }
        } else {
            zzpVar = new zzp(continuation);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzpVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzpVar.zzb;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
            SearchByTextRequest.Builder builder = SearchByTextRequest.builder(str, list);
            builder.setCancellationToken(cancellationTokenSource.getToken());
            function1.invoke(builder);
            Task taskZzi = placesClient.zzi(builder.build(), zzmo.PROGRAMMATIC_KOTLIN_API);
            Intrinsics.checkNotNullExpressionValue(taskZzi, "");
            zzpVar.zzb = 1;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = isHdrEncodingMatched.TuitionPaymentFragmentspecialinlinedviewModeldefault3(taskZzi, cancellationTokenSource, zzpVar);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        Intrinsics.checkNotNullExpressionValue(objTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        return objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public static /* synthetic */ Object awaitSearchByText$default(PlacesClient placesClient, String str, List list, Function1 function1, Continuation continuation, int i, Object obj) throws ApiException {
        if ((i & 4) != 0) {
            function1 = zzf.zza;
        }
        return awaitSearchByText(placesClient, str, list, function1, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object awaitSearchNearby(PlacesClient placesClient, LocationRestriction locationRestriction, List<? extends Place.Field> list, Function1<? super SearchNearbyRequest.Builder, Unit> function1, Continuation<? super SearchNearbyResponse> continuation) throws ApiException {
        zzq zzqVar;
        if (continuation instanceof zzq) {
            zzqVar = (zzq) continuation;
            int i = zzqVar.zzb;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzqVar.zzb = i - Integer.MIN_VALUE;
            } else {
                zzqVar = new zzq(continuation);
            }
        } else {
            zzqVar = new zzq(continuation);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zzqVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zzqVar.zzb;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
            SearchNearbyRequest.Builder builder = SearchNearbyRequest.builder(locationRestriction, list);
            builder.setCancellationToken(cancellationTokenSource.getToken());
            function1.invoke(builder);
            Task taskZzj = placesClient.zzj(builder.build(), zzmo.PROGRAMMATIC_KOTLIN_API);
            Intrinsics.checkNotNullExpressionValue(taskZzj, "");
            zzqVar.zzb = 1;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = isHdrEncodingMatched.TuitionPaymentFragmentspecialinlinedviewModeldefault3(taskZzj, cancellationTokenSource, zzqVar);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        Intrinsics.checkNotNullExpressionValue(objTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        return objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public static /* synthetic */ Object awaitSearchNearby$default(PlacesClient placesClient, LocationRestriction locationRestriction, List list, Function1 function1, Continuation continuation, int i, Object obj) throws ApiException {
        if ((i & 4) != 0) {
            function1 = zzg.zza;
        }
        return awaitSearchNearby(placesClient, locationRestriction, list, function1, continuation);
    }

    public static /* synthetic */ Object awaitIsOpen$default(PlacesClient placesClient, String str, Long l, Continuation continuation, int i, Object obj) throws ApiException {
        if ((i & 2) != 0) {
            l = null;
        }
        return awaitIsOpen(placesClient, str, l, (Continuation<? super IsOpenResponse>) continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object awaitIsOpen(PlacesClient placesClient, String str, Long l, Continuation<? super IsOpenResponse> continuation) throws ApiException {
        zzn zznVar;
        if (continuation instanceof zzn) {
            zznVar = (zzn) continuation;
            int i = zznVar.zzb;
            if ((i & Integer.MIN_VALUE) != 0) {
                zznVar.zzb = i - Integer.MIN_VALUE;
            } else {
                zznVar = new zzn(continuation);
            }
        } else {
            zznVar = new zzn(continuation);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = zznVar.zza;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = zznVar.zzb;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
            Task taskZzh = placesClient.zzh(IsOpenRequestKt.isOpenRequest(str, l, (Function1<? super IsOpenRequest.Builder, Unit>) new Function1() { // from class: com.google.android.libraries.places.api.net.kotlin.zzd
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ Object invoke(Object obj) {
                    IsOpenRequest.Builder builder = (IsOpenRequest.Builder) obj;
                    Intrinsics.checkNotNullParameter(builder, "");
                    builder.setCancellationToken(cancellationTokenSource.getToken());
                    return Unit.INSTANCE;
                }
            }), zzmo.PROGRAMMATIC_KOTLIN_API);
            Intrinsics.checkNotNullExpressionValue(taskZzh, "");
            zznVar.zzb = 1;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = isHdrEncodingMatched.TuitionPaymentFragmentspecialinlinedviewModeldefault3(taskZzh, cancellationTokenSource, zznVar);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        Intrinsics.checkNotNullExpressionValue(objTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        return objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }
}

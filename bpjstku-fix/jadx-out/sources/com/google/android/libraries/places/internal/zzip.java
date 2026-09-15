package com.google.android.libraries.places.internal;

import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnTokenCanceledListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.libraries.places.api.auth.PlacesAppCheckTokenProvider;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.CircularBounds;
import com.google.android.libraries.places.api.model.EVConnectorType;
import com.google.android.libraries.places.api.model.EVSearchOptions;
import com.google.android.libraries.places.api.model.EncodedPolyline;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.RectangularBounds;
import com.google.android.libraries.places.api.model.RoutingParameters;
import com.google.android.libraries.places.api.model.SearchAlongRouteParameters;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;
import com.google.android.libraries.places.api.net.SearchByTextRequest;
import com.google.android.libraries.places.api.net.SearchByTextResponse;
import com.google.android.libraries.places.api.net.SearchNearbyRequest;
import com.google.android.libraries.places.api.net.SearchNearbyResponse;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.DirectExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ConstantObservableExternalSyntheticLambda0;
import defpackage.getCloseFuture;
import defpackage.initSession;
import defpackage.lambdanew2androidxcameracoreimplDeferrableSurface;
import defpackage.onCaptureSessionEnd;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzip {
    private final zzawy zza;
    private final zzbif zzb;
    private final zzir zzc;
    private final zzme zzd;
    private final zzdy zze;
    private final zzjt zzf;
    private final zzjv zzg;
    private final zzjx zzh;
    private final zziw zzi;
    private final zzjf zzj;
    private final zzjm zzk;
    private final zzbfj zzl;
    private final zzhl zzm;
    private final zzmf zzn;

    zzip(zzmf zzmfVar, zzbif zzbifVar, zzme zzmeVar, zzdy zzdyVar, zzjv zzjvVar, zzjt zzjtVar, zzhq zzhqVar, zzhn zzhnVar, zzhd zzhdVar, zziw zziwVar, zzjq zzjqVar, zzjx zzjxVar, zzir zzirVar, zzjf zzjfVar, zzjm zzjmVar, zzbfj zzbfjVar, zzhl zzhlVar) {
        this.zzn = zzmfVar;
        this.zzb = zzbifVar;
        this.zza = zzawz.zzf(zzbifVar);
        this.zzc = zzirVar;
        this.zzd = zzmeVar;
        this.zze = zzdyVar;
        this.zzg = zzjvVar;
        this.zzf = zzjtVar;
        this.zzi = zziwVar;
        this.zzh = zzjxVar;
        this.zzj = zzjfVar;
        this.zzk = zzjmVar;
        this.zzl = zzbfjVar;
        this.zzm = zzhlVar;
    }

    private final String zzA(zzbdd zzbddVar) throws ExecutionException, InterruptedException {
        return zzbddVar == zzbdd.PLACE_AUTOCOMPLETE ? (String) this.zzk.zzb(zzbddVar).get() : (String) this.zzk.zza(zzbddVar).get();
    }

    private final ListenableFuture zzy() throws Throwable {
        PlacesAppCheckTokenProvider placesAppCheckTokenProviderZzi = this.zzn.zzi();
        if (placesAppCheckTokenProviderZzi == null) {
            return getCloseFuture.TuitionPaymentFragmentspecialinlinedviewModeldefault3(com.google.android.libraries.places.api.auth.zzb.zza);
        }
        lambdanew2androidxcameracoreimplDeferrableSurface lambdanew2androidxcameracoreimpldeferrablesurfaceTuitionPaymentFragmentspecialinlinedviewModeldefault3 = lambdanew2androidxcameracoreimplDeferrableSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        getCloseFuture.TuitionPaymentFragmentspecialinlinedviewModeldefault3(placesAppCheckTokenProviderZzi.fetchAppCheckToken(), new zzht(this, lambdanew2androidxcameracoreimpldeferrablesurfaceTuitionPaymentFragmentspecialinlinedviewModeldefault3), DirectExecutor.INSTANCE);
        return lambdanew2androidxcameracoreimpldeferrablesurfaceTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    private final zzawy zzz(zzmo zzmoVar, String str, com.google.android.libraries.places.api.auth.zzb zzbVar, zzbdd zzbddVar) throws ExecutionException, InterruptedException {
        zzbfj[] zzbfjVarArr = new zzbfj[3];
        zzbip zzbipVarZzb = zzmoVar == zzmo.PLACES_UI_KIT ? this.zzc.zzb(zzA(zzbddVar), str) : this.zzc.zza(this.zzn.zzf(), str);
        zzawy zzawyVar = this.zza;
        zzbfjVarArr[0] = zzcam.zza(zzbipVarZzb);
        zzbfjVarArr[1] = zzep.zza(zzbVar.zzb());
        zzbfjVarArr[2] = this.zzl;
        return (zzawy) zzawyVar.zze(zzbfjVarArr);
    }

    public final Task zza(final SearchByTextRequest searchByTextRequest, final zzmo zzmoVar) throws Throwable {
        List<Place.Field> placeFields = searchByTextRequest.getPlaceFields();
        if (placeFields.isEmpty()) {
            return Tasks.forException(new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "Place fields must not be empty.")));
        }
        if (searchByTextRequest.getTextQuery().isEmpty()) {
            return Tasks.forException(new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "Text query must not be an empty string.")));
        }
        String includedType = searchByTextRequest.getIncludedType();
        if (includedType != null && includedType.isEmpty()) {
            return Tasks.forException(new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "Included type must not be an empty string.")));
        }
        String regionCode = searchByTextRequest.getRegionCode();
        if (regionCode != null && regionCode.isEmpty()) {
            return Tasks.forException(new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "Region code must not be an empty string.")));
        }
        final long jZzb = this.zze.zzb();
        ArrayList arrayList = new ArrayList();
        if (searchByTextRequest.isRoutingSummariesIncluded()) {
            arrayList.add(zzhi.ROUTING_SUMMARIES);
        }
        final String strZza = zzhj.zza(zziy.zza(placeFields), arrayList);
        final ListenableFuture listenableFutureZzy = zzy();
        final ListenableFuture listenableFutureB = getCloseFuture.b(listenableFutureZzy, new ConstantObservableExternalSyntheticLambda0() { // from class: com.google.android.libraries.places.internal.zzio
            @Override // defpackage.ConstantObservableExternalSyntheticLambda0
            public final /* synthetic */ ListenableFuture apply(Object obj) {
                return this.zza.zzj(zzmoVar, strZza, searchByTextRequest, (com.google.android.libraries.places.api.auth.zzb) obj);
            }
        }, DirectExecutor.INSTANCE);
        CancellationToken cancellationToken = searchByTextRequest.getCancellationToken();
        if (cancellationToken != null) {
            cancellationToken.onCanceledRequested(new OnTokenCanceledListener() { // from class: com.google.android.libraries.places.internal.zzig
                @Override // com.google.android.gms.tasks.OnTokenCanceledListener
                public final /* synthetic */ void onCanceled() {
                    listenableFutureB.cancel(true);
                }
            });
        }
        return zzeg.zza(listenableFutureB).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.libraries.places.internal.zzhu
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final /* synthetic */ Task then(Object obj) {
                return this.zza.zzk(searchByTextRequest, (zzayk) obj);
            }
        }).continueWithTask(new Continuation() { // from class: com.google.android.libraries.places.internal.zzif
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ Object then(Task task) {
                this.zza.zzl(searchByTextRequest, jZzb, zzmoVar, listenableFutureZzy, task);
                return task;
            }
        });
    }

    public final Task zzb(final FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, final zzmo zzmoVar) throws Throwable {
        String regionCode = findAutocompletePredictionsRequest.getRegionCode();
        if (regionCode != null && regionCode.isEmpty()) {
            return Tasks.forException(new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "Region code must not be an empty string.")));
        }
        String query = findAutocompletePredictionsRequest.getQuery();
        if (query == null) {
            return Tasks.forException(new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "Query must not be null.")));
        }
        if (TextUtils.isEmpty(query.trim())) {
            return Tasks.forResult(FindAutocompletePredictionsResponse.newInstance(ImmutableList.asInterface()));
        }
        final long jZzb = this.zze.zzb();
        final ListenableFuture listenableFutureZzy = zzy();
        final ListenableFuture listenableFutureB = getCloseFuture.b(listenableFutureZzy, new ConstantObservableExternalSyntheticLambda0() { // from class: com.google.android.libraries.places.internal.zzih
            @Override // defpackage.ConstantObservableExternalSyntheticLambda0
            public final /* synthetic */ ListenableFuture apply(Object obj) {
                return this.zza.zzm(zzmoVar, findAutocompletePredictionsRequest, (com.google.android.libraries.places.api.auth.zzb) obj);
            }
        }, DirectExecutor.INSTANCE);
        CancellationToken cancellationToken = findAutocompletePredictionsRequest.getCancellationToken();
        if (cancellationToken != null) {
            cancellationToken.onCanceledRequested(new OnTokenCanceledListener() { // from class: com.google.android.libraries.places.internal.zzik
                @Override // com.google.android.gms.tasks.OnTokenCanceledListener
                public final /* synthetic */ void onCanceled() {
                    listenableFutureB.cancel(true);
                }
            });
        }
        return zzeg.zza(listenableFutureB).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.libraries.places.internal.zzii
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final /* synthetic */ Task then(Object obj) {
                return this.zza.zzn((zzato) obj);
            }
        }).continueWithTask(new Continuation() { // from class: com.google.android.libraries.places.internal.zzij
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ Object then(Task task) {
                this.zza.zzo(jZzb, zzmoVar, listenableFutureZzy, task);
                return task;
            }
        });
    }

    public final Task zzc(final FetchPlaceRequest fetchPlaceRequest, final zzmo zzmoVar) throws Throwable {
        if (fetchPlaceRequest.getPlaceId().isEmpty()) {
            return Tasks.forException(new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "Place id must not be an empty string.")));
        }
        List<Place.Field> placeFields = fetchPlaceRequest.getPlaceFields();
        if (placeFields.isEmpty()) {
            return Tasks.forException(new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "Place fields must not be empty.")));
        }
        String regionCode = fetchPlaceRequest.getRegionCode();
        if (regionCode != null && regionCode.isEmpty()) {
            return Tasks.forException(new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "Region code must not be an empty string.")));
        }
        final long jZzb = this.zze.zzb();
        final String strZzb = zzhj.zzb(zziy.zza(placeFields));
        final ListenableFuture listenableFutureZzy = zzy();
        final ListenableFuture listenableFutureB = getCloseFuture.b(listenableFutureZzy, new ConstantObservableExternalSyntheticLambda0() { // from class: com.google.android.libraries.places.internal.zzil
            @Override // defpackage.ConstantObservableExternalSyntheticLambda0
            public final /* synthetic */ ListenableFuture apply(Object obj) {
                return this.zza.zzp(zzmoVar, strZzb, fetchPlaceRequest, (com.google.android.libraries.places.api.auth.zzb) obj);
            }
        }, DirectExecutor.INSTANCE);
        CancellationToken cancellationToken = fetchPlaceRequest.getCancellationToken();
        if (cancellationToken != null) {
            cancellationToken.onCanceledRequested(new OnTokenCanceledListener() { // from class: com.google.android.libraries.places.internal.zzhv
                @Override // com.google.android.gms.tasks.OnTokenCanceledListener
                public final /* synthetic */ void onCanceled() {
                    listenableFutureB.cancel(true);
                }
            });
        }
        return zzeg.zza(listenableFutureB).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.libraries.places.internal.zzim
            private static final byte[] $$c = {83, -44, 103, 46};
            private static final int $$d = 122;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {5, 11, -122, -94};
            private static final int $$b = 12;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            private static int asInterface = 1;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 61798;
            private static char b = 49772;
            private static char TuitionPaymentFragmentbindingInflater1 = 49656;
            private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 10272;

            /* JADX WARN: Code duplicated, block: B:10:0x0028  */
            /* JADX WARN: Code duplicated, block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(short r5, int r6, short r7, java.lang.Object[] r8) {
                /*
                    byte[] r0 = com.google.android.libraries.places.internal.zzim.$$a
                    int r5 = r5 * 4
                    int r5 = r5 + 1
                    int r6 = r6 * 4
                    int r6 = r6 + 98
                    int r7 = r7 * 2
                    int r7 = 3 - r7
                    byte[] r1 = new byte[r5]
                    r2 = 0
                    if (r0 != 0) goto L16
                    r4 = r5
                    r3 = r2
                    goto L2a
                L16:
                    r3 = r2
                L17:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    int r3 = r3 + 1
                    int r7 = r7 + 1
                    if (r3 != r5) goto L28
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    r8[r2] = r5
                    return
                L28:
                    r4 = r0[r7]
                L2a:
                    int r4 = -r4
                    int r6 = r6 + r4
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzim.c(short, int, short, java.lang.Object[]):void");
            }

            private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
                char[] cArr2 = new char[cArr.length - 2];
                oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
                char[] cArr3 = new char[2];
                int i3 = $11 + 65;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                while (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < cArr.length) {
                    int i5 = $10 + 85;
                    $11 = i5 % 128;
                    int i6 = 58224;
                    if (i5 % 2 == 0) {
                        cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        int i7 = oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        cArr3[1] = cArr[0];
                    } else {
                        cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    }
                    for (int i8 = 0; i8 < 16; i8++) {
                        char c = cArr3[1];
                        char c2 = cArr3[0];
                        try {
                            Object[] objArr2 = {Integer.valueOf(c), Integer.valueOf((c2 + i6) ^ ((c2 << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)))), Integer.valueOf(c2 >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (47773 - View.combineMeasuredStates(0, 0)), 468 - (ViewConfiguration.getFadingEdgeLength() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            }
                            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            cArr3[1] = cCharValue;
                            Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(b)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - (ViewConfiguration.getScrollBarSize() >> 8)), 468 - (ViewConfiguration.getScrollBarSize() >> 8), 12 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            }
                            cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                            i6 -= 40503;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr3[0] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2]);
                    cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
                    Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ExpandableListView.getPackedPositionType(0L), TextUtils.getOffsetAfter("", 0) + 2323, 43 - ExpandableListView.getPackedPositionChild(0L), -1312321721, false, $$e(b2, b3, b3), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr2, 0, i);
                int i9 = $11 + 61;
                $10 = i9 % 128;
                int i10 = i9 % 2;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final /* synthetic */ Task then(Object obj) {
                int i = 2 % 2;
                int i2 = asInterface + 57;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                int i3 = i2 % 2;
                Task taskZzq = this.zza.zzq((zzaww) obj);
                int i4 = asInterface + 79;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                int i5 = i4 % 2;
                return taskZzq;
            }

            /* JADX WARN: Code duplicated, block: B:105:0x05c9 A[PHI: r19
  0x05c9: PHI (r19v2 int) = (r19v3 int), (r19v15 int) binds: [B:101:0x05bc, B:93:0x057e] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:109:0x06a9  */
            /* JADX WARN: Code duplicated, block: B:111:0x06cc  */
            /* JADX WARN: Code duplicated, block: B:114:0x0703  */
            /* JADX WARN: Code duplicated, block: B:116:0x0731  */
            /* JADX WARN: Code duplicated, block: B:130:0x03b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:142:0x0521 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:55:0x0373  */
            /* JADX WARN: Code duplicated, block: B:56:0x037e A[Catch: Exception -> 0x05bc, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x05bc, blocks: (B:51:0x02fb, B:53:0x036d, B:56:0x037e, B:58:0x03ac), top: B:134:0x02fb }] */
            /* JADX WARN: Code duplicated, block: B:63:0x03e9 A[Catch: Exception -> 0x03fd, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x03fd, blocks: (B:60:0x03b4, B:63:0x03e9, B:65:0x03f0, B:74:0x03ff, B:71:0x03f7), top: B:130:0x03b4 }] */
            /* JADX WARN: Code duplicated, block: B:71:0x03f7 A[Catch: Exception -> 0x03fd, TRY_ENTER, TryCatch #2 {Exception -> 0x03fd, blocks: (B:60:0x03b4, B:63:0x03e9, B:65:0x03f0, B:74:0x03ff, B:71:0x03f7), top: B:130:0x03b4 }] */
            /* JADX WARN: Code duplicated, block: B:73:0x03fd  */
            /* JADX WARN: Code duplicated, block: B:74:0x03ff A[Catch: Exception -> 0x03fd, TRY_LEAVE, TryCatch #2 {Exception -> 0x03fd, blocks: (B:60:0x03b4, B:63:0x03e9, B:65:0x03f0, B:74:0x03ff, B:71:0x03f7), top: B:130:0x03b4 }] */
            /* JADX WARN: Code duplicated, block: B:78:0x0424 A[Catch: all -> 0x05b2, TRY_ENTER, TryCatch #1 {all -> 0x05b2, blocks: (B:75:0x0409, B:78:0x0424, B:79:0x0433), top: B:129:0x0409 }] */
            /* JADX WARN: Code duplicated, block: B:79:0x0433 A[Catch: all -> 0x05b2, TRY_LEAVE, TryCatch #1 {all -> 0x05b2, blocks: (B:75:0x0409, B:78:0x0424, B:79:0x0433), top: B:129:0x0409 }] */
            /* JADX WARN: Code duplicated, block: B:87:0x052d  */
            /* JADX WARN: Code duplicated, block: B:94:0x0580 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:95:0x0582  */
            /* JADX WARN: Code duplicated, block: B:96:0x05b0  */
            public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2) throws Throwable {
                int i3;
                int i4;
                int i5;
                String line;
                int i6;
                char c;
                Object[] objArr;
                Object[] objArr2;
                int i7;
                int iB;
                int i8;
                int i9;
                int i10;
                int i11;
                int i12;
                int i13;
                int i14;
                int i15;
                int i16;
                File file;
                FileReader fileReader;
                BufferedReader bufferedReader;
                boolean zEquals;
                File file2;
                int i17;
                FileReader fileReader2;
                BufferedReader bufferedReader2;
                int minimumFlingVelocity;
                int i18;
                int iB2;
                int i19;
                int i20;
                int i21;
                int i22;
                int i23;
                int i24;
                boolean zEquals2;
                int i25 = 2 % 2;
                try {
                    int i26 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int i27 = i26 * (-244);
                    int i28 = ((i27 | 4674) << 1) - (i27 ^ 4674);
                    int i29 = ((~((~i) | (-20))) | (~((-20) | i26))) * (-245);
                    int i30 = (i28 & i29) + (i29 | i28);
                    int i31 = ((-20) ^ i) | ((-20) & i);
                    int i32 = (~i31) * (-245);
                    int i33 = (i30 ^ i32) + ((i32 & i30) << 1);
                    int i34 = (i26 | (~i31)) * 245;
                    int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
                    Object[] objArr3 = new Object[1];
                    a(new char[]{21545, 34019, 44434, 45054, 13053, 22249, 65009, 20677, 24841, 818, 35384, 42944, 8328, 65487, 41745, 27707, 62928, 3389, 65108, 23046, 19945, 45011}, i35, objArr3);
                    Object[] objArr4 = new Object[1];
                    a(new char[]{38469, 58314, 64280, 27053, 48234, 44127, 30586, 3056, 5549, 223, 37655, 31409, 33485, 19452, 55458, 26999, 28949, 48891, 26633, 42730}, 18 - (~(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))), objArr4);
                    String[] strArr = {(String) objArr3[0], (String) objArr4[0]};
                    int i36 = asInterface;
                    int i37 = (i36 ^ 43) + ((i36 & 43) << 1);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i37 % 128;
                    int i38 = i37 % 2;
                    int i39 = 0;
                    while (true) {
                        if (i39 >= 2) {
                            i3 = i;
                            break;
                        }
                        int i40 = asInterface + 51;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i40 % 128;
                        int i41 = i40 % 2;
                        String str = strArr[i39];
                        int i42 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int i43 = ((i42 | 16) << 1) - (i42 ^ 16);
                        Object[] objArr5 = new Object[1];
                        a(new char[]{1576, 24527, 1443, 54093, 47591, 22320, 60405, 56812, 10517, 26649, 33852, 24081, 50701, 41968, 64043, 568, 40165, 39412}, i43, objArr5);
                        Class<?> cls = Class.forName((String) objArr5[0]);
                        int i44 = asInterface + 13;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i44 % 128;
                        int i45 = i44 % 2;
                        Boolean bool = (Boolean) cls.getMethod(str, new Class[0]).invoke(cls, null);
                        int i46 = asInterface + 99;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i46 % 128;
                        int i47 = i46 % 2;
                        if (bool.booleanValue()) {
                            i3 = i ^ 1;
                            int i48 = asInterface + 77;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i48 % 128;
                            int i49 = i48 % 2;
                            break;
                        }
                        int i50 = i39 - 95;
                        i39 = (i50 | 96) + (i50 & 96);
                        int i51 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 75;
                        asInterface = i51 % 128;
                        int i52 = i51 % 2;
                    }
                } catch (Exception unused) {
                    i3 = (i & (-3)) | ((~i) & 2);
                }
                try {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(109138771);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 2420);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 2845;
                        int iResolveSizeAndState = 5 - View.resolveSizeAndState(0, 0, 0);
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        Object[] objArr6 = new Object[1];
                        c(b2, b3, b3, objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, iMakeMeasureSpec, iResolveSizeAndState, -501222268, false, (String) objArr6[0], new Class[0]);
                    }
                    long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
                    long j = -535491100;
                    long j2 = -1;
                    long j3 = jLongValue ^ j2;
                    long j4 = i;
                    long j5 = j4 ^ j2;
                    long j6 = (((long) (-830)) * j) + (((long) 832) * jLongValue) + (((long) (-831)) * (((j3 | j5) ^ j2) | (((j | jLongValue) | j4) ^ j2))) + (((long) (-1662)) * (((j3 | j) | j4) ^ j2)) + (((long) 831) * ((j2 ^ (jLongValue | j4)) | (((j ^ j2) | j5) ^ j2) | ((j | j4) ^ j2))) + ((long) (-623695586));
                    int i53 = ~i;
                    int i54 = ((int) (j6 >> 32)) & ((-638173686) + (((~((-209043905) | i53)) | 2097472) * 184) + (((-1853216748) | i) * (-184)) + ((~((-1646270316) | i53)) * 184));
                    int startUptimeMillis = (int) Process.getStartUptimeMillis();
                    int i55 = ~startUptimeMillis;
                    int i56 = ((int) j6) & (1546810921 + (((~(startUptimeMillis | (-1403748136))) | (~(1409286055 | i55)) | 27940354) * (-68)) + ((~((-1375807782) | i55)) * (-68)) + (((~(1403748135 | i55)) | 33478274) * 68));
                    int i57 = (i54 & i56) | (i54 ^ i56);
                    int i58 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
                    asInterface = i58 % 128;
                    if (i58 % 2 == 0) {
                        i4 = (~(i & 44)) & (i | 44);
                        i5 = (i57 | (-i57)) << 66;
                    } else {
                        i4 = (~(i & 10)) & (i | 10);
                        int i59 = (i57 & (-2)) | ((~i57) & 1);
                        int i60 = -i59;
                        i5 = ((i59 & i60) | (i59 ^ i60)) >> 31;
                    }
                    int i61 = (i5 & i) | (i4 & (~i5));
                    int i62 = (~(i & i3)) & (i | i3);
                    int i63 = -i62;
                    int i64 = ((i62 & i63) | (i62 ^ i63)) >> 31;
                    int i65 = i61 & (~i64);
                    int i66 = i3 & i64;
                    int i67 = (i65 ^ i66) | (i66 & i65);
                    try {
                        try {
                            int i68 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            int i69 = (i68 * (-563)) + 22600;
                            int i70 = ~i68;
                            int i71 = ~(((-41) & i53) | ((-41) ^ i53));
                            int i72 = ((i70 & i71) | (i70 ^ i71) | (~((i ^ 40) | (i & 40)))) * (-564);
                            int i73 = (i69 & i72) + (i69 | i72);
                            int i74 = ~i68;
                            int i75 = i74 | 40;
                            int i76 = ((i73 + ((~((i75 & i) | (i75 ^ i))) * 1128)) - (~(((~((i68 & 40) | (i68 ^ 40))) | (~(i74 | i53))) * 564))) - 1;
                            Object[] objArr7 = new Object[1];
                            a(new char[]{24392, 38293, 6031, 48726, 58204, 24393, 23545, 10873, 17475, 30028, 53713, 21158, 10320, 15231, 4731, 25939, 61597, 24698, 5692, 13862, 57772, 1609, 55262, 27499, 14684, 63545, 49787, 59177, 36804, 55535, 52295, 53781, 61709, 62903, 25220, 49891, 41296, 62237, 35282, 37496, 56852, 23795}, i76, objArr7);
                            File file3 = new File((String) objArr7[0]);
                            int i77 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i78 = (i77 & 121) + (i77 | 121);
                            asInterface = i78 % 128;
                            if (i78 % 2 == 0) {
                                file3.canRead();
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            if (file3.canRead()) {
                                FileReader fileReader3 = new FileReader(file3);
                                BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
                                int i79 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
                                asInterface = i79 % 128;
                                int i80 = i79 % 2;
                                try {
                                    line = bufferedReader3.readLine();
                                    int i81 = -(-TextUtils.lastIndexOf("", '0'));
                                    int i82 = (i81 ^ 4) + ((i81 & 4) << 1);
                                    Object[] objArr8 = new Object[1];
                                    a(new char[]{3438, 8337, 57510, 62170, 24504, 11332}, i82, objArr8);
                                    if (line.equals((String) objArr8[0])) {
                                        fileReader3.close();
                                        bufferedReader3.close();
                                    } else {
                                        fileReader3.close();
                                        bufferedReader3.close();
                                    }
                                    int i83 = -(KeyEvent.getMaxKeyCode() >> 16);
                                    int i84 = (i83 * 465) - 14353;
                                    int i85 = ~(((-32) ^ i53) | ((-32) & i53));
                                    int i86 = ~((-32) | i83);
                                    int i87 = (i86 & i85) | (i85 ^ i86);
                                    int i88 = ~((i53 ^ i83) | (i53 & i83));
                                    int i89 = -(-(((i87 & i88) | (i87 ^ i88)) * 464));
                                    int i90 = (i84 & i89) + (i84 | i89);
                                    int i91 = (~i83) | i;
                                    int i92 = ((i91 & (-32)) | (i91 ^ (-32))) * (-464);
                                    int i93 = ((i90 | i92) << 1) - (i92 ^ i90);
                                    int i94 = ~(((-32) ^ i83) | ((-32) & i83));
                                    int i95 = ~(i83 | i);
                                    int i96 = (i93 - (~(((i95 & i94) | (i94 ^ i95)) * 464))) - 1;
                                    Object[] objArr9 = new Object[1];
                                    a(new char[]{44491, 5653, 23103, 27972, 44434, 6546, 4913, 16678, 51804, 7517, 47183, 10139, 45007, 48995, 32728, 44321, 10704, 24784, 51128, 18017, 46237, 47968, 65330, 28386, 45059, 42256, 39794, 60048, 59352, 25891, 10044, 2508, 21613, 35990}, i96, objArr9);
                                    file = new File((String) objArr9[0]);
                                    int i97 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    int i98 = (i97 ^ 19) + ((i97 & 19) << 1);
                                    asInterface = i98 % 128;
                                    int i99 = i98 % 2;
                                    if (!file.canRead()) {
                                        fileReader = new FileReader(file);
                                        bufferedReader = new BufferedReader(fileReader);
                                        try {
                                            try {
                                                String line2 = bufferedReader.readLine();
                                                int i100 = -(-(ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                                int i101 = (i100 & 1) + (i100 | 1);
                                                Object[] objArr10 = new Object[1];
                                                a(new char[]{19838, 62962, 16913, 33050}, i101, objArr10);
                                                zEquals = line2.equals((String) objArr10[0]);
                                                fileReader.close();
                                                bufferedReader.close();
                                                if (zEquals) {
                                                    try {
                                                        Object[] objArr11 = new Object[1];
                                                        a(new char[]{64987, 53743, 53735, 25132, 45531, 9094, 45068, 62092, 28755, 29550, 42670, 49691, 22724, 41441, 29763, 44841, 48452, 29694, 19467, 33829, 50411, 27981, 36876, 16428, 59865, 12626, 30027, 39807, 35341, 28407, 22708, 4362, 26798, 61285, 56678, 28123, 44283, 712}, 34 - (~(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))), objArr11);
                                                        file2 = new File((String) objArr11[0]);
                                                        int i102 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                        i17 = ((i102 | 103) << 1) - (i102 ^ 103);
                                                        asInterface = i17 % 128;
                                                        if (i17 % 2 == 0) {
                                                            int i103 = 89 / 0;
                                                            if (!file2.canRead()) {
                                                                fileReader2 = new FileReader(file2);
                                                                bufferedReader2 = new BufferedReader(fileReader2);
                                                                try {
                                                                    String line3 = bufferedReader2.readLine();
                                                                    char[] cArr = {19838, 62962, 16913, 33050};
                                                                    minimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity() >> 16;
                                                                    i18 = asInterface + 125;
                                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i18 % 128;
                                                                    if (i18 % 2 != 0) {
                                                                        iB2 = com.google.android.gms.internal.mlkit_vision_face.zznv.b();
                                                                        int i104 = -minimumFlingVelocity;
                                                                        i19 = ((i104 & 866) + (i104 | 866)) << (-864);
                                                                    } else {
                                                                        iB2 = com.google.android.gms.internal.mlkit_vision_face.zznv.b();
                                                                        i19 = (minimumFlingVelocity * 866) - 864;
                                                                    }
                                                                    int i105 = ~minimumFlingVelocity;
                                                                    int i106 = ~iB2;
                                                                    int i107 = ~((i105 ^ i106) | (i105 & i106));
                                                                    i20 = (((-2) ^ i107) | (i107 & (-2))) * (-865);
                                                                    int i108 = ~i;
                                                                    int i109 = (~((110338186 ^ i108) | (110338186 & i108))) | 939546404;
                                                                    int i110 = ~((i108 ^ (-1015084975)) | (i108 & (-1015084975)));
                                                                    int i111 = (i109 ^ i110) | (i110 & i109);
                                                                    int i112 = ~(((-34799617) ^ i) | ((-34799617) & i));
                                                                    int i113 = ((i111 ^ i112) | (i111 & i112)) * 590;
                                                                    int i114 = (99237054 & i113) + (i113 | 99237054);
                                                                    int i115 = ~(110338186 | i53);
                                                                    int i116 = (i114 - (~(-(-((((i115 ^ 939546404) | (i115 & 939546404)) | (~((i53 ^ (-1015084975)) | (i53 & (-1015084975))))) * (-1180)))))) - 1;
                                                                    int i117 = ~((1015084974 ^ i53) | (1015084974 & i53));
                                                                    int i118 = ~((i53 ^ (-110338187)) | (i53 & (-110338187)));
                                                                    i21 = (i116 - (~(((i117 ^ i118) | (i118 & i117)) * 590))) - 1;
                                                                    int iB3 = com.google.android.gms.internal.mlkit_vision_face.zznv.b();
                                                                    int i119 = ~((1199069577 ^ iB3) | (1199069577 & iB3));
                                                                    int i120 = ((-1341980666) ^ i119) | ((-1341980666) & i119);
                                                                    i6 = i67;
                                                                    int i121 = ~iB3;
                                                                    int i122 = (i121 ^ (-1341964146)) | (i121 & (-1341964146));
                                                                    int i123 = ~((i122 ^ (-1199069578)) | (i122 & (-1199069578)));
                                                                    int i124 = -(-(((i120 ^ i123) | (i120 & i123)) * (-470)));
                                                                    i22 = ((-1911754232) & i124) + (i124 | (-1911754232));
                                                                    int i125 = ~((-142911089) | iB3);
                                                                    int i126 = ~iB3;
                                                                    int i127 = (i126 & (-1341964146)) | (i126 ^ (-1341964146));
                                                                    i23 = -(-((i125 | (~((i127 & (-1199069578)) | (i127 ^ (-1199069578))))) * 470));
                                                                    if (i21 > (i22 ^ i23) + ((i22 & i23) << 1)) {
                                                                        try {
                                                                            i24 = (i19 % i20) << (865 >> (~(minimumFlingVelocity | iB2)));
                                                                        } catch (Throwable th) {
                                                                            th = th;
                                                                            fileReader2.close();
                                                                            bufferedReader2.close();
                                                                            throw th;
                                                                        }
                                                                    } else {
                                                                        int i128 = -(-i20);
                                                                        int i129 = (i19 & i128) + (i128 | i19);
                                                                        int i130 = -(-((~(minimumFlingVelocity | iB2)) * 865));
                                                                        i24 = ((i129 | i130) << 1) - (i130 ^ i129);
                                                                    }
                                                                    int i131 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
                                                                    asInterface = i131 % 128;
                                                                    int i132 = i131 % 2;
                                                                    int i133 = ~iB2;
                                                                    int i134 = ~((i133 & (-2)) | ((-2) ^ i133));
                                                                    int i135 = ~((i106 & minimumFlingVelocity) | (i106 ^ minimumFlingVelocity));
                                                                    int i136 = 865 * ((i135 & i134) | (i134 ^ i135));
                                                                    int i137 = (i136 | i24) + (i24 & i136);
                                                                    Object[] objArr12 = new Object[1];
                                                                    a(cArr, i137, objArr12);
                                                                    zEquals2 = line3.equals((String) objArr12[0]);
                                                                    fileReader2.close();
                                                                    int i138 = asInterface + 89;
                                                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i138 % 128;
                                                                    int i139 = i138 % 2;
                                                                    bufferedReader2.close();
                                                                    if (zEquals2) {
                                                                        i16 = 2;
                                                                    } else if (line != null) {
                                                                        int i140 = asInterface + 75;
                                                                        int i141 = i140 % 128;
                                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i141;
                                                                        int i142 = i140 % 2;
                                                                        objArr = new Object[]{new int[]{(i & (-21)) | (i53 & 20)}, new String[]{line}};
                                                                        int i143 = (i141 ^ 49) + ((i141 & 49) << 1);
                                                                        asInterface = i143 % 128;
                                                                        int i144 = i143 % 2;
                                                                        c = 0;
                                                                    } else {
                                                                        i16 = 2;
                                                                    }
                                                                    Object[] objArr13 = new Object[i16];
                                                                    c = 0;
                                                                    objArr13[0] = new int[]{i};
                                                                    objArr13[1] = new String[0];
                                                                    objArr = objArr13;
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                }
                                                            }
                                                        } else if (!file2.canRead()) {
                                                            fileReader2 = new FileReader(file2);
                                                            bufferedReader2 = new BufferedReader(fileReader2);
                                                            String line4 = bufferedReader2.readLine();
                                                            char[] cArr2 = {19838, 62962, 16913, 33050};
                                                            minimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity() >> 16;
                                                            i18 = asInterface + 125;
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i18 % 128;
                                                            if (i18 % 2 != 0) {
                                                                iB2 = com.google.android.gms.internal.mlkit_vision_face.zznv.b();
                                                                int i1010 = -minimumFlingVelocity;
                                                                i19 = ((i1010 & 866) + (i1010 | 866)) << (-864);
                                                            } else {
                                                                iB2 = com.google.android.gms.internal.mlkit_vision_face.zznv.b();
                                                                i19 = (minimumFlingVelocity * 866) - 864;
                                                            }
                                                            int i1011 = ~minimumFlingVelocity;
                                                            int i1012 = ~iB2;
                                                            int i1013 = ~((i1011 ^ i1012) | (i1011 & i1012));
                                                            i20 = (((-2) ^ i1013) | (i1013 & (-2))) * (-865);
                                                            int i1014 = ~i;
                                                            int i1015 = (~((110338186 ^ i1014) | (110338186 & i1014))) | 939546404;
                                                            int i1110 = ~((i1014 ^ (-1015084975)) | (i1014 & (-1015084975)));
                                                            int i1111 = (i1015 ^ i1110) | (i1110 & i1015);
                                                            int i1112 = ~(((-34799617) ^ i) | ((-34799617) & i));
                                                            int i1113 = ((i1111 ^ i1112) | (i1111 & i1112)) * 590;
                                                            int i1114 = (99237054 & i1113) + (i1113 | 99237054);
                                                            int i1115 = ~(110338186 | i53);
                                                            int i1116 = (i1114 - (~(-(-((((i1115 ^ 939546404) | (i1115 & 939546404)) | (~((i53 ^ (-1015084975)) | (i53 & (-1015084975))))) * (-1180)))))) - 1;
                                                            int i1117 = ~((1015084974 ^ i53) | (1015084974 & i53));
                                                            int i1118 = ~((i53 ^ (-110338187)) | (i53 & (-110338187)));
                                                            i21 = (i1116 - (~(((i1117 ^ i1118) | (i1118 & i1117)) * 590))) - 1;
                                                            int iB4 = com.google.android.gms.internal.mlkit_vision_face.zznv.b();
                                                            int i1119 = ~((1199069577 ^ iB4) | (1199069577 & iB4));
                                                            int i1210 = ((-1341980666) ^ i1119) | ((-1341980666) & i1119);
                                                            i6 = i67;
                                                            int i1211 = ~iB4;
                                                            int i1212 = (i1211 ^ (-1341964146)) | (i1211 & (-1341964146));
                                                            int i1213 = ~((i1212 ^ (-1199069578)) | (i1212 & (-1199069578)));
                                                            int i1214 = -(-(((i1210 ^ i1213) | (i1210 & i1213)) * (-470)));
                                                            i22 = ((-1911754232) & i1214) + (i1214 | (-1911754232));
                                                            int i1215 = ~((-142911089) | iB4);
                                                            int i1216 = ~iB4;
                                                            int i1217 = (i1216 & (-1341964146)) | (i1216 ^ (-1341964146));
                                                            i23 = -(-((i1215 | (~((i1217 & (-1199069578)) | (i1217 ^ (-1199069578))))) * 470));
                                                            if (i21 > (i22 ^ i23) + ((i22 & i23) << 1)) {
                                                                i24 = (i19 % i20) << (865 >> (~(minimumFlingVelocity | iB2)));
                                                            } else {
                                                                int i1218 = -(-i20);
                                                                int i1219 = (i19 & i1218) + (i1218 | i19);
                                                                int i1310 = -(-((~(minimumFlingVelocity | iB2)) * 865));
                                                                i24 = ((i1219 | i1310) << 1) - (i1310 ^ i1219);
                                                            }
                                                            int i1311 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
                                                            asInterface = i1311 % 128;
                                                            int i1312 = i1311 % 2;
                                                            int i1313 = ~iB2;
                                                            int i1314 = ~((i1313 & (-2)) | ((-2) ^ i1313));
                                                            int i1315 = ~((i1012 & minimumFlingVelocity) | (i1012 ^ minimumFlingVelocity));
                                                            int i1316 = 865 * ((i1315 & i1314) | (i1314 ^ i1315));
                                                            int i1317 = (i1316 | i24) + (i24 & i1316);
                                                            Object[] objArr14 = new Object[1];
                                                            a(cArr2, i1317, objArr14);
                                                            zEquals2 = line4.equals((String) objArr14[0]);
                                                            fileReader2.close();
                                                            int i1318 = asInterface + 89;
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1318 % 128;
                                                            int i1319 = i1318 % 2;
                                                            bufferedReader2.close();
                                                            if (zEquals2) {
                                                                i16 = 2;
                                                            } else if (line != null) {
                                                                int i145 = asInterface + 75;
                                                                int i146 = i145 % 128;
                                                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i146;
                                                                int i147 = i145 % 2;
                                                                objArr = new Object[]{new int[]{(i & (-21)) | (i53 & 20)}, new String[]{line}};
                                                                int i148 = (i146 ^ 49) + ((i146 & 49) << 1);
                                                                asInterface = i148 % 128;
                                                                int i149 = i148 % 2;
                                                                c = 0;
                                                            } else {
                                                                i16 = 2;
                                                            }
                                                            Object[] objArr15 = new Object[i16];
                                                            c = 0;
                                                            objArr15[0] = new int[]{i};
                                                            objArr15[1] = new String[0];
                                                            objArr = objArr15;
                                                        }
                                                    } catch (Exception unused2) {
                                                    }
                                                }
                                            } catch (Exception unused3) {
                                            }
                                            int i150 = ((int[]) objArr[c])[c];
                                            int i151 = (~(i & i6)) & (i | i6);
                                            int i152 = -i151;
                                            int i153 = ((i151 & i152) | (i151 ^ i152)) >> 31;
                                            int i154 = (~i153) & i150;
                                            int i155 = i6 & i153;
                                            int i156 = (i155 & i154) | (i154 ^ i155);
                                            String[] strArr2 = (String[]) objArr[1];
                                            Object[] objArr16 = new Object[2];
                                            int i157 = (i150 & i53) | ((~i150) & i);
                                            int i158 = -i157;
                                            int i159 = (((i157 & i158) | (i157 ^ i158)) >> 31) & 1;
                                            int i160 = -i159;
                                            int i161 = (~(((i160 & i159) | (i159 ^ i160)) >> 31)) & 1;
                                            objArr16[i159] = null;
                                            objArr16[i161] = strArr2;
                                            String[] strArr3 = (String[]) objArr16[0];
                                            int i162 = asInterface;
                                            int i163 = i162 + 13;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i163 % 128;
                                            int i164 = i163 % 2;
                                            int i165 = ((~i156) & i) | (i156 & i53);
                                            int i166 = -i165;
                                            int i167 = (((i165 & i166) | (i165 ^ i166)) >> 31) & 16;
                                            int i168 = (i162 & 51) + (i162 | 51);
                                            int i169 = i168 % 128;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i169;
                                            int i170 = i168 % 2;
                                            int[] iArr = {i156};
                                            int i171 = (i169 & 27) + (i169 | 27);
                                            asInterface = i171 % 128;
                                            int i172 = i171 % 2;
                                            objArr2 = new Object[]{new int[]{i}, new int[1], iArr, strArr3};
                                            i7 = 2070192700 + (((~(251613966 | i53)) | (~((-291924196) | i))) * (-370)) + (((~(251613966 | i)) | (~((-291924196) | i53)) | 244912908) * (-370)) + 423462744 + i167;
                                            iB = com.google.android.gms.internal.mlkit_vision_face.zznv.b();
                                            i8 = (i7 * 55) + (i2 * (-107));
                                            i9 = ~i7;
                                            int i173 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                            i10 = (i173 & 71) + (i173 | 71);
                                            int i174 = i10 % 128;
                                            asInterface = i174;
                                            if (i10 % 2 == 0) {
                                                int i175 = ~((i9 & i2) | (i9 ^ i2));
                                                int i176 = ~iB;
                                                int i177 = ~((i176 & i2) | (i176 ^ i2));
                                                i11 = i8 << (((i175 & i177) | (i175 ^ i177)) * (-108));
                                                int i178 = ~i7;
                                                int i179 = ~((i178 & iB) | (i178 ^ iB));
                                                int i180 = ~((~i2) | i7);
                                                i12 = (i179 & i180) | (i179 ^ i180);
                                                i13 = (~iB) | i7;
                                            } else {
                                                int i181 = ~((i9 ^ i2) | (i9 & i2));
                                                int i182 = ~iB;
                                                int i183 = ~((i182 ^ i2) | (i182 & i2));
                                                int i184 = ((i181 & i183) | (i181 ^ i183)) * (-108);
                                                i11 = (i8 | i184) + (i8 & i184);
                                                int i185 = ~((i9 & iB) | (i9 ^ iB));
                                                int i186 = ~i2;
                                                int i187 = ~((i186 & i7) | (i186 ^ i7));
                                                i12 = (i185 & i187) | (i185 ^ i187);
                                                i13 = (i182 ^ i7) | (i182 & i7);
                                            }
                                            i14 = ~i13;
                                            i15 = i174 + 21;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i15 % 128;
                                            if (i15 % 2 != 0) {
                                                int i188 = ~i2;
                                                int i189 = ~((i188 & i7) | (i188 ^ i7));
                                                int i190 = (i11 / (54 - ((i12 & i14) | (i12 ^ i14)))) >> (54 % ((iB & i189) | (iB ^ i189)));
                                                int i191 = i190 + 23;
                                                int i192 = (i190 | i191) & (~(i190 & i191));
                                                int i193 = i192 ^ (i192 / 31);
                                                int i194 = i193 << 2;
                                                ((int[]) objArr2[0])[1] = ((~i193) & i194) | ((~i194) & i193);
                                                return objArr2;
                                            }
                                            int i195 = ((i12 & i14) | (i12 ^ i14)) * 54;
                                            int i196 = (i11 & i195) + (i11 | i195);
                                            int i197 = (iB | (~((~i2) | i7))) * 54;
                                            int i198 = ((i196 | i197) << 1) - (i197 ^ i196);
                                            int i199 = (i198 << 13) ^ i198;
                                            int i200 = i199 >>> 17;
                                            int i201 = ((~i199) & i200) | ((~i200) & i199);
                                            int i202 = i201 << 5;
                                            ((int[]) objArr2[1])[0] = (i201 | i202) & (~(i201 & i202));
                                            return objArr2;
                                        } catch (Throwable th3) {
                                            fileReader.close();
                                            bufferedReader.close();
                                            throw th3;
                                        }
                                    }
                                    int i203 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                                    asInterface = i203 % 128;
                                    int i204 = i203 % 2;
                                    i6 = i67;
                                    i16 = 2;
                                    Object[] objArr17 = new Object[i16];
                                    c = 0;
                                    objArr17[0] = new int[]{i};
                                    objArr17[1] = new String[0];
                                    objArr = objArr17;
                                    int i1510 = ((int[]) objArr[c])[c];
                                    int i1511 = (~(i & i6)) & (i | i6);
                                    int i1512 = -i1511;
                                    int i1513 = ((i1511 & i1512) | (i1511 ^ i1512)) >> 31;
                                    int i1514 = (~i1513) & i1510;
                                    int i1515 = i6 & i1513;
                                    int i1516 = (i1515 & i1514) | (i1514 ^ i1515);
                                    String[] strArr4 = (String[]) objArr[1];
                                    Object[] objArr18 = new Object[2];
                                    int i1517 = (i1510 & i53) | ((~i1510) & i);
                                    int i1518 = -i1517;
                                    int i1519 = (((i1517 & i1518) | (i1517 ^ i1518)) >> 31) & 1;
                                    int i1610 = -i1519;
                                    int i1611 = (~(((i1610 & i1519) | (i1519 ^ i1610)) >> 31)) & 1;
                                    objArr18[i1519] = null;
                                    objArr18[i1611] = strArr4;
                                    String[] strArr5 = (String[]) objArr18[0];
                                    int i1612 = asInterface;
                                    int i1613 = i1612 + 13;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1613 % 128;
                                    int i1614 = i1613 % 2;
                                    int i1615 = ((~i1516) & i) | (i1516 & i53);
                                    int i1616 = -i1615;
                                    int i1617 = (((i1615 & i1616) | (i1615 ^ i1616)) >> 31) & 16;
                                    int i1618 = (i1612 & 51) + (i1612 | 51);
                                    int i1619 = i1618 % 128;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1619;
                                    int i1710 = i1618 % 2;
                                    int[] iArr2 = {i1516};
                                    int i1711 = (i1619 & 27) + (i1619 | 27);
                                    asInterface = i1711 % 128;
                                    int i1712 = i1711 % 2;
                                    objArr2 = new Object[]{new int[]{i}, new int[1], iArr2, strArr5};
                                    i7 = 2070192700 + (((~(251613966 | i53)) | (~((-291924196) | i))) * (-370)) + (((~(251613966 | i)) | (~((-291924196) | i53)) | 244912908) * (-370)) + 423462744 + i1617;
                                    iB = com.google.android.gms.internal.mlkit_vision_face.zznv.b();
                                    i8 = (i7 * 55) + (i2 * (-107));
                                    i9 = ~i7;
                                    int i1713 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    i10 = (i1713 & 71) + (i1713 | 71);
                                    int i1714 = i10 % 128;
                                    asInterface = i1714;
                                    if (i10 % 2 == 0) {
                                        int i1715 = ~((i9 & i2) | (i9 ^ i2));
                                        int i1716 = ~iB;
                                        int i1717 = ~((i1716 & i2) | (i1716 ^ i2));
                                        i11 = i8 << (((i1715 & i1717) | (i1715 ^ i1717)) * (-108));
                                        int i1718 = ~i7;
                                        int i1719 = ~((i1718 & iB) | (i1718 ^ iB));
                                        int i1810 = ~((~i2) | i7);
                                        i12 = (i1719 & i1810) | (i1719 ^ i1810);
                                        i13 = (~iB) | i7;
                                    } else {
                                        int i1811 = ~((i9 ^ i2) | (i9 & i2));
                                        int i1812 = ~iB;
                                        int i1813 = ~((i1812 ^ i2) | (i1812 & i2));
                                        int i1814 = ((i1811 & i1813) | (i1811 ^ i1813)) * (-108);
                                        i11 = (i8 | i1814) + (i8 & i1814);
                                        int i1815 = ~((i9 & iB) | (i9 ^ iB));
                                        int i1816 = ~i2;
                                        int i1817 = ~((i1816 & i7) | (i1816 ^ i7));
                                        i12 = (i1815 & i1817) | (i1815 ^ i1817);
                                        i13 = (i1812 ^ i7) | (i1812 & i7);
                                    }
                                    i14 = ~i13;
                                    i15 = i1714 + 21;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i15 % 128;
                                    if (i15 % 2 != 0) {
                                        int i1818 = ~i2;
                                        int i1819 = ~((i1818 & i7) | (i1818 ^ i7));
                                        int i1910 = (i11 / (54 - ((i12 & i14) | (i12 ^ i14)))) >> (54 % ((iB & i1819) | (iB ^ i1819)));
                                        int i1911 = i1910 + 23;
                                        int i1912 = (i1910 | i1911) & (~(i1910 & i1911));
                                        int i1913 = i1912 ^ (i1912 / 31);
                                        int i1914 = i1913 << 2;
                                        ((int[]) objArr2[0])[1] = ((~i1913) & i1914) | ((~i1914) & i1913);
                                        return objArr2;
                                    }
                                    int i1915 = ((i12 & i14) | (i12 ^ i14)) * 54;
                                    int i1916 = (i11 & i1915) + (i11 | i1915);
                                    int i1917 = (iB | (~((~i2) | i7))) * 54;
                                    int i1918 = ((i1916 | i1917) << 1) - (i1917 ^ i1916);
                                    int i1919 = (i1918 << 13) ^ i1918;
                                    int i205 = i1919 >>> 17;
                                    int i206 = ((~i1919) & i205) | ((~i205) & i1919);
                                    int i207 = i206 << 5;
                                    ((int[]) objArr2[1])[0] = (i206 | i207) & (~(i206 & i207));
                                    return objArr2;
                                } catch (Throwable th4) {
                                    fileReader3.close();
                                    bufferedReader3.close();
                                    throw th4;
                                }
                            }
                            int i208 = asInterface;
                            int i209 = (i208 & 13) + (i208 | 13);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i209 % 128;
                            int i210 = i209 % 2;
                        } catch (Exception unused4) {
                        }
                        int i810 = -(KeyEvent.getMaxKeyCode() >> 16);
                        int i811 = (i810 * 465) - 14353;
                        int i812 = ~(((-32) ^ i53) | ((-32) & i53));
                        int i813 = ~((-32) | i810);
                        int i814 = (i813 & i812) | (i812 ^ i813);
                        int i815 = ~((i53 ^ i810) | (i53 & i810));
                        int i816 = -(-(((i814 & i815) | (i814 ^ i815)) * 464));
                        int i910 = (i811 & i816) + (i811 | i816);
                        int i911 = (~i810) | i;
                        int i912 = ((i911 & (-32)) | (i911 ^ (-32))) * (-464);
                        int i913 = ((i910 | i912) << 1) - (i912 ^ i910);
                        int i914 = ~(((-32) ^ i810) | ((-32) & i810));
                        int i915 = ~(i810 | i);
                        int i916 = (i913 - (~(((i915 & i914) | (i914 ^ i915)) * 464))) - 1;
                        Object[] objArr19 = new Object[1];
                        a(new char[]{44491, 5653, 23103, 27972, 44434, 6546, 4913, 16678, 51804, 7517, 47183, 10139, 45007, 48995, 32728, 44321, 10704, 24784, 51128, 18017, 46237, 47968, 65330, 28386, 45059, 42256, 39794, 60048, 59352, 25891, 10044, 2508, 21613, 35990}, i916, objArr19);
                        file = new File((String) objArr19[0]);
                        int i917 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i918 = (i917 ^ 19) + ((i917 & 19) << 1);
                        asInterface = i918 % 128;
                        int i919 = i918 % 2;
                        if (!file.canRead()) {
                            fileReader = new FileReader(file);
                            bufferedReader = new BufferedReader(fileReader);
                            String line5 = bufferedReader.readLine();
                            int i1016 = -(-(ViewConfiguration.getScrollBarFadeDuration() >> 16));
                            int i1017 = (i1016 & 1) + (i1016 | 1);
                            Object[] objArr110 = new Object[1];
                            a(new char[]{19838, 62962, 16913, 33050}, i1017, objArr110);
                            zEquals = line5.equals((String) objArr110[0]);
                            fileReader.close();
                            bufferedReader.close();
                            if (zEquals) {
                                Object[] objArr111 = new Object[1];
                                a(new char[]{64987, 53743, 53735, 25132, 45531, 9094, 45068, 62092, 28755, 29550, 42670, 49691, 22724, 41441, 29763, 44841, 48452, 29694, 19467, 33829, 50411, 27981, 36876, 16428, 59865, 12626, 30027, 39807, 35341, 28407, 22708, 4362, 26798, 61285, 56678, 28123, 44283, 712}, 34 - (~(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))), objArr111);
                                file2 = new File((String) objArr111[0]);
                                int i1018 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                i17 = ((i1018 | 103) << 1) - (i1018 ^ 103);
                                asInterface = i17 % 128;
                                if (i17 % 2 == 0) {
                                    int i1019 = 89 / 0;
                                    if (!file2.canRead()) {
                                        fileReader2 = new FileReader(file2);
                                        bufferedReader2 = new BufferedReader(fileReader2);
                                        String line6 = bufferedReader2.readLine();
                                        char[] cArr3 = {19838, 62962, 16913, 33050};
                                        minimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity() >> 16;
                                        i18 = asInterface + 125;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i18 % 128;
                                        if (i18 % 2 != 0) {
                                            iB2 = com.google.android.gms.internal.mlkit_vision_face.zznv.b();
                                            int i10110 = -minimumFlingVelocity;
                                            i19 = ((i10110 & 866) + (i10110 | 866)) << (-864);
                                        } else {
                                            iB2 = com.google.android.gms.internal.mlkit_vision_face.zznv.b();
                                            i19 = (minimumFlingVelocity * 866) - 864;
                                        }
                                        int i10111 = ~minimumFlingVelocity;
                                        int i10112 = ~iB2;
                                        int i10113 = ~((i10111 ^ i10112) | (i10111 & i10112));
                                        i20 = (((-2) ^ i10113) | (i10113 & (-2))) * (-865);
                                        int i10114 = ~i;
                                        int i10115 = (~((110338186 ^ i10114) | (110338186 & i10114))) | 939546404;
                                        int i11110 = ~((i10114 ^ (-1015084975)) | (i10114 & (-1015084975)));
                                        int i11111 = (i10115 ^ i11110) | (i11110 & i10115);
                                        int i11112 = ~(((-34799617) ^ i) | ((-34799617) & i));
                                        int i11113 = ((i11111 ^ i11112) | (i11111 & i11112)) * 590;
                                        int i11114 = (99237054 & i11113) + (i11113 | 99237054);
                                        int i11115 = ~(110338186 | i53);
                                        int i11116 = (i11114 - (~(-(-((((i11115 ^ 939546404) | (i11115 & 939546404)) | (~((i53 ^ (-1015084975)) | (i53 & (-1015084975))))) * (-1180)))))) - 1;
                                        int i11117 = ~((1015084974 ^ i53) | (1015084974 & i53));
                                        int i11118 = ~((i53 ^ (-110338187)) | (i53 & (-110338187)));
                                        i21 = (i11116 - (~(((i11117 ^ i11118) | (i11118 & i11117)) * 590))) - 1;
                                        int iB5 = com.google.android.gms.internal.mlkit_vision_face.zznv.b();
                                        int i11119 = ~((1199069577 ^ iB5) | (1199069577 & iB5));
                                        int i12110 = ((-1341980666) ^ i11119) | ((-1341980666) & i11119);
                                        i6 = i67;
                                        int i12111 = ~iB5;
                                        int i12112 = (i12111 ^ (-1341964146)) | (i12111 & (-1341964146));
                                        int i12113 = ~((i12112 ^ (-1199069578)) | (i12112 & (-1199069578)));
                                        int i12114 = -(-(((i12110 ^ i12113) | (i12110 & i12113)) * (-470)));
                                        i22 = ((-1911754232) & i12114) + (i12114 | (-1911754232));
                                        int i12115 = ~((-142911089) | iB5);
                                        int i12116 = ~iB5;
                                        int i12117 = (i12116 & (-1341964146)) | (i12116 ^ (-1341964146));
                                        i23 = -(-((i12115 | (~((i12117 & (-1199069578)) | (i12117 ^ (-1199069578))))) * 470));
                                        if (i21 > (i22 ^ i23) + ((i22 & i23) << 1)) {
                                            i24 = (i19 % i20) << (865 >> (~(minimumFlingVelocity | iB2)));
                                        } else {
                                            int i12118 = -(-i20);
                                            int i12119 = (i19 & i12118) + (i12118 | i19);
                                            int i13110 = -(-((~(minimumFlingVelocity | iB2)) * 865));
                                            i24 = ((i12119 | i13110) << 1) - (i13110 ^ i12119);
                                        }
                                        int i13111 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
                                        asInterface = i13111 % 128;
                                        int i13112 = i13111 % 2;
                                        int i13113 = ~iB2;
                                        int i13114 = ~((i13113 & (-2)) | ((-2) ^ i13113));
                                        int i13115 = ~((i10112 & minimumFlingVelocity) | (i10112 ^ minimumFlingVelocity));
                                        int i13116 = 865 * ((i13115 & i13114) | (i13114 ^ i13115));
                                        int i13117 = (i13116 | i24) + (i24 & i13116);
                                        Object[] objArr112 = new Object[1];
                                        a(cArr3, i13117, objArr112);
                                        zEquals2 = line6.equals((String) objArr112[0]);
                                        fileReader2.close();
                                        int i13118 = asInterface + 89;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13118 % 128;
                                        int i13119 = i13118 % 2;
                                        bufferedReader2.close();
                                        if (zEquals2) {
                                            i16 = 2;
                                        } else if (line != null) {
                                            int i1410 = asInterface + 75;
                                            int i1411 = i1410 % 128;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1411;
                                            int i1412 = i1410 % 2;
                                            objArr = new Object[]{new int[]{(i & (-21)) | (i53 & 20)}, new String[]{line}};
                                            int i1413 = (i1411 ^ 49) + ((i1411 & 49) << 1);
                                            asInterface = i1413 % 128;
                                            int i1414 = i1413 % 2;
                                            c = 0;
                                        } else {
                                            i16 = 2;
                                        }
                                        Object[] objArr113 = new Object[i16];
                                        c = 0;
                                        objArr113[0] = new int[]{i};
                                        objArr113[1] = new String[0];
                                        objArr = objArr113;
                                    }
                                } else if (!file2.canRead()) {
                                    fileReader2 = new FileReader(file2);
                                    bufferedReader2 = new BufferedReader(fileReader2);
                                    String line7 = bufferedReader2.readLine();
                                    char[] cArr4 = {19838, 62962, 16913, 33050};
                                    minimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity() >> 16;
                                    i18 = asInterface + 125;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i18 % 128;
                                    if (i18 % 2 != 0) {
                                        iB2 = com.google.android.gms.internal.mlkit_vision_face.zznv.b();
                                        int i10116 = -minimumFlingVelocity;
                                        i19 = ((i10116 & 866) + (i10116 | 866)) << (-864);
                                    } else {
                                        iB2 = com.google.android.gms.internal.mlkit_vision_face.zznv.b();
                                        i19 = (minimumFlingVelocity * 866) - 864;
                                    }
                                    int i10117 = ~minimumFlingVelocity;
                                    int i10118 = ~iB2;
                                    int i10119 = ~((i10117 ^ i10118) | (i10117 & i10118));
                                    i20 = (((-2) ^ i10119) | (i10119 & (-2))) * (-865);
                                    int i101110 = ~i;
                                    int i101111 = (~((110338186 ^ i101110) | (110338186 & i101110))) | 939546404;
                                    int i111110 = ~((i101110 ^ (-1015084975)) | (i101110 & (-1015084975)));
                                    int i111111 = (i101111 ^ i111110) | (i111110 & i101111);
                                    int i111112 = ~(((-34799617) ^ i) | ((-34799617) & i));
                                    int i111113 = ((i111111 ^ i111112) | (i111111 & i111112)) * 590;
                                    int i111114 = (99237054 & i111113) + (i111113 | 99237054);
                                    int i111115 = ~(110338186 | i53);
                                    int i111116 = (i111114 - (~(-(-((((i111115 ^ 939546404) | (i111115 & 939546404)) | (~((i53 ^ (-1015084975)) | (i53 & (-1015084975))))) * (-1180)))))) - 1;
                                    int i111117 = ~((1015084974 ^ i53) | (1015084974 & i53));
                                    int i111118 = ~((i53 ^ (-110338187)) | (i53 & (-110338187)));
                                    i21 = (i111116 - (~(((i111117 ^ i111118) | (i111118 & i111117)) * 590))) - 1;
                                    int iB6 = com.google.android.gms.internal.mlkit_vision_face.zznv.b();
                                    int i111119 = ~((1199069577 ^ iB6) | (1199069577 & iB6));
                                    int i121110 = ((-1341980666) ^ i111119) | ((-1341980666) & i111119);
                                    i6 = i67;
                                    int i121111 = ~iB6;
                                    int i121112 = (i121111 ^ (-1341964146)) | (i121111 & (-1341964146));
                                    int i121113 = ~((i121112 ^ (-1199069578)) | (i121112 & (-1199069578)));
                                    int i121114 = -(-(((i121110 ^ i121113) | (i121110 & i121113)) * (-470)));
                                    i22 = ((-1911754232) & i121114) + (i121114 | (-1911754232));
                                    int i121115 = ~((-142911089) | iB6);
                                    int i121116 = ~iB6;
                                    int i121117 = (i121116 & (-1341964146)) | (i121116 ^ (-1341964146));
                                    i23 = -(-((i121115 | (~((i121117 & (-1199069578)) | (i121117 ^ (-1199069578))))) * 470));
                                    if (i21 > (i22 ^ i23) + ((i22 & i23) << 1)) {
                                        i24 = (i19 % i20) << (865 >> (~(minimumFlingVelocity | iB2)));
                                    } else {
                                        int i121118 = -(-i20);
                                        int i121119 = (i19 & i121118) + (i121118 | i19);
                                        int i131110 = -(-((~(minimumFlingVelocity | iB2)) * 865));
                                        i24 = ((i121119 | i131110) << 1) - (i131110 ^ i121119);
                                    }
                                    int i131111 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
                                    asInterface = i131111 % 128;
                                    int i131112 = i131111 % 2;
                                    int i131113 = ~iB2;
                                    int i131114 = ~((i131113 & (-2)) | ((-2) ^ i131113));
                                    int i131115 = ~((i10118 & minimumFlingVelocity) | (i10118 ^ minimumFlingVelocity));
                                    int i131116 = 865 * ((i131115 & i131114) | (i131114 ^ i131115));
                                    int i131117 = (i131116 | i24) + (i24 & i131116);
                                    Object[] objArr114 = new Object[1];
                                    a(cArr4, i131117, objArr114);
                                    zEquals2 = line7.equals((String) objArr114[0]);
                                    fileReader2.close();
                                    int i131118 = asInterface + 89;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i131118 % 128;
                                    int i131119 = i131118 % 2;
                                    bufferedReader2.close();
                                    if (zEquals2) {
                                        i16 = 2;
                                    } else if (line != null) {
                                        int i1415 = asInterface + 75;
                                        int i1416 = i1415 % 128;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i1416;
                                        int i1417 = i1415 % 2;
                                        objArr = new Object[]{new int[]{(i & (-21)) | (i53 & 20)}, new String[]{line}};
                                        int i1418 = (i1416 ^ 49) + ((i1416 & 49) << 1);
                                        asInterface = i1418 % 128;
                                        int i1419 = i1418 % 2;
                                        c = 0;
                                    } else {
                                        i16 = 2;
                                    }
                                    Object[] objArr115 = new Object[i16];
                                    c = 0;
                                    objArr115[0] = new int[]{i};
                                    objArr115[1] = new String[0];
                                    objArr = objArr115;
                                }
                            }
                            int i15110 = ((int[]) objArr[c])[c];
                            int i15111 = (~(i & i6)) & (i | i6);
                            int i15112 = -i15111;
                            int i15113 = ((i15111 & i15112) | (i15111 ^ i15112)) >> 31;
                            int i15114 = (~i15113) & i15110;
                            int i15115 = i6 & i15113;
                            int i15116 = (i15115 & i15114) | (i15114 ^ i15115);
                            String[] strArr6 = (String[]) objArr[1];
                            Object[] objArr116 = new Object[2];
                            int i15117 = (i15110 & i53) | ((~i15110) & i);
                            int i15118 = -i15117;
                            int i15119 = (((i15117 & i15118) | (i15117 ^ i15118)) >> 31) & 1;
                            int i16110 = -i15119;
                            int i16111 = (~(((i16110 & i15119) | (i15119 ^ i16110)) >> 31)) & 1;
                            objArr116[i15119] = null;
                            objArr116[i16111] = strArr6;
                            String[] strArr7 = (String[]) objArr116[0];
                            int i16112 = asInterface;
                            int i16113 = i16112 + 13;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i16113 % 128;
                            int i16114 = i16113 % 2;
                            int i16115 = ((~i15116) & i) | (i15116 & i53);
                            int i16116 = -i16115;
                            int i16117 = (((i16115 & i16116) | (i16115 ^ i16116)) >> 31) & 16;
                            int i16118 = (i16112 & 51) + (i16112 | 51);
                            int i16119 = i16118 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i16119;
                            int i17110 = i16118 % 2;
                            int[] iArr3 = {i15116};
                            int i17111 = (i16119 & 27) + (i16119 | 27);
                            asInterface = i17111 % 128;
                            int i17112 = i17111 % 2;
                            objArr2 = new Object[]{new int[]{i}, new int[1], iArr3, strArr7};
                            i7 = 2070192700 + (((~(251613966 | i53)) | (~((-291924196) | i))) * (-370)) + (((~(251613966 | i)) | (~((-291924196) | i53)) | 244912908) * (-370)) + 423462744 + i16117;
                            iB = com.google.android.gms.internal.mlkit_vision_face.zznv.b();
                            i8 = (i7 * 55) + (i2 * (-107));
                            i9 = ~i7;
                            int i17113 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            i10 = (i17113 & 71) + (i17113 | 71);
                            int i17114 = i10 % 128;
                            asInterface = i17114;
                            if (i10 % 2 == 0) {
                                int i17115 = ~((i9 & i2) | (i9 ^ i2));
                                int i17116 = ~iB;
                                int i17117 = ~((i17116 & i2) | (i17116 ^ i2));
                                i11 = i8 << (((i17115 & i17117) | (i17115 ^ i17117)) * (-108));
                                int i17118 = ~i7;
                                int i17119 = ~((i17118 & iB) | (i17118 ^ iB));
                                int i18110 = ~((~i2) | i7);
                                i12 = (i17119 & i18110) | (i17119 ^ i18110);
                                i13 = (~iB) | i7;
                            } else {
                                int i18111 = ~((i9 ^ i2) | (i9 & i2));
                                int i18112 = ~iB;
                                int i18113 = ~((i18112 ^ i2) | (i18112 & i2));
                                int i18114 = ((i18111 & i18113) | (i18111 ^ i18113)) * (-108);
                                i11 = (i8 | i18114) + (i8 & i18114);
                                int i18115 = ~((i9 & iB) | (i9 ^ iB));
                                int i18116 = ~i2;
                                int i18117 = ~((i18116 & i7) | (i18116 ^ i7));
                                i12 = (i18115 & i18117) | (i18115 ^ i18117);
                                i13 = (i18112 ^ i7) | (i18112 & i7);
                            }
                            i14 = ~i13;
                            i15 = i17114 + 21;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i15 % 128;
                            if (i15 % 2 != 0) {
                                int i18118 = ~i2;
                                int i18119 = ~((i18118 & i7) | (i18118 ^ i7));
                                int i19110 = (i11 / (54 - ((i12 & i14) | (i12 ^ i14)))) >> (54 % ((iB & i18119) | (iB ^ i18119)));
                                int i19111 = i19110 + 23;
                                int i19112 = (i19110 | i19111) & (~(i19110 & i19111));
                                int i19113 = i19112 ^ (i19112 / 31);
                                int i19114 = i19113 << 2;
                                ((int[]) objArr2[0])[1] = ((~i19113) & i19114) | ((~i19114) & i19113);
                                return objArr2;
                            }
                            int i19115 = ((i12 & i14) | (i12 ^ i14)) * 54;
                            int i19116 = (i11 & i19115) + (i11 | i19115);
                            int i19117 = (iB | (~((~i2) | i7))) * 54;
                            int i19118 = ((i19116 | i19117) << 1) - (i19117 ^ i19116);
                            int i19119 = (i19118 << 13) ^ i19118;
                            int i2010 = i19119 >>> 17;
                            int i2011 = ((~i19119) & i2010) | ((~i2010) & i19119);
                            int i2012 = i2011 << 5;
                            ((int[]) objArr2[1])[0] = (i2011 | i2012) & (~(i2011 & i2012));
                            return objArr2;
                        }
                        int i2013 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
                        asInterface = i2013 % 128;
                        int i2014 = i2013 % 2;
                    } catch (Exception unused5) {
                    }
                    line = null;
                    i6 = i67;
                    i16 = 2;
                    Object[] objArr117 = new Object[i16];
                    c = 0;
                    objArr117[0] = new int[]{i};
                    objArr117[1] = new String[0];
                    objArr = objArr117;
                    int i151110 = ((int[]) objArr[c])[c];
                    int i151111 = (~(i & i6)) & (i | i6);
                    int i151112 = -i151111;
                    int i151113 = ((i151111 & i151112) | (i151111 ^ i151112)) >> 31;
                    int i151114 = (~i151113) & i151110;
                    int i151115 = i6 & i151113;
                    int i151116 = (i151115 & i151114) | (i151114 ^ i151115);
                    String[] strArr8 = (String[]) objArr[1];
                    Object[] objArr118 = new Object[2];
                    int i151117 = (i151110 & i53) | ((~i151110) & i);
                    int i151118 = -i151117;
                    int i151119 = (((i151117 & i151118) | (i151117 ^ i151118)) >> 31) & 1;
                    int i161110 = -i151119;
                    int i161111 = (~(((i161110 & i151119) | (i151119 ^ i161110)) >> 31)) & 1;
                    objArr118[i151119] = null;
                    objArr118[i161111] = strArr8;
                    String[] strArr9 = (String[]) objArr118[0];
                    int i161112 = asInterface;
                    int i161113 = i161112 + 13;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i161113 % 128;
                    int i161114 = i161113 % 2;
                    int i161115 = ((~i151116) & i) | (i151116 & i53);
                    int i161116 = -i161115;
                    int i161117 = (((i161115 & i161116) | (i161115 ^ i161116)) >> 31) & 16;
                    int i161118 = (i161112 & 51) + (i161112 | 51);
                    int i161119 = i161118 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i161119;
                    int i171110 = i161118 % 2;
                    int[] iArr4 = {i151116};
                    int i171111 = (i161119 & 27) + (i161119 | 27);
                    asInterface = i171111 % 128;
                    int i171112 = i171111 % 2;
                    objArr2 = new Object[]{new int[]{i}, new int[1], iArr4, strArr9};
                    i7 = 2070192700 + (((~(251613966 | i53)) | (~((-291924196) | i))) * (-370)) + (((~(251613966 | i)) | (~((-291924196) | i53)) | 244912908) * (-370)) + 423462744 + i161117;
                    iB = com.google.android.gms.internal.mlkit_vision_face.zznv.b();
                    i8 = (i7 * 55) + (i2 * (-107));
                    i9 = ~i7;
                    int i171113 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    i10 = (i171113 & 71) + (i171113 | 71);
                    int i171114 = i10 % 128;
                    asInterface = i171114;
                    if (i10 % 2 == 0) {
                        int i171115 = ~((i9 & i2) | (i9 ^ i2));
                        int i171116 = ~iB;
                        int i171117 = ~((i171116 & i2) | (i171116 ^ i2));
                        i11 = i8 << (((i171115 & i171117) | (i171115 ^ i171117)) * (-108));
                        int i171118 = ~i7;
                        int i171119 = ~((i171118 & iB) | (i171118 ^ iB));
                        int i181110 = ~((~i2) | i7);
                        i12 = (i171119 & i181110) | (i171119 ^ i181110);
                        i13 = (~iB) | i7;
                    } else {
                        int i181111 = ~((i9 ^ i2) | (i9 & i2));
                        int i181112 = ~iB;
                        int i181113 = ~((i181112 ^ i2) | (i181112 & i2));
                        int i181114 = ((i181111 & i181113) | (i181111 ^ i181113)) * (-108);
                        i11 = (i8 | i181114) + (i8 & i181114);
                        int i181115 = ~((i9 & iB) | (i9 ^ iB));
                        int i181116 = ~i2;
                        int i181117 = ~((i181116 & i7) | (i181116 ^ i7));
                        i12 = (i181115 & i181117) | (i181115 ^ i181117);
                        i13 = (i181112 ^ i7) | (i181112 & i7);
                    }
                    i14 = ~i13;
                    i15 = i171114 + 21;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i15 % 128;
                    if (i15 % 2 != 0) {
                        int i181118 = ~i2;
                        int i181119 = ~((i181118 & i7) | (i181118 ^ i7));
                        int i191110 = (i11 / (54 - ((i12 & i14) | (i12 ^ i14)))) >> (54 % ((iB & i181119) | (iB ^ i181119)));
                        int i191111 = i191110 + 23;
                        int i191112 = (i191110 | i191111) & (~(i191110 & i191111));
                        int i191113 = i191112 ^ (i191112 / 31);
                        int i191114 = i191113 << 2;
                        ((int[]) objArr2[0])[1] = ((~i191113) & i191114) | ((~i191114) & i191113);
                        return objArr2;
                    }
                    int i191115 = ((i12 & i14) | (i12 ^ i14)) * 54;
                    int i191116 = (i11 & i191115) + (i11 | i191115);
                    int i191117 = (iB | (~((~i2) | i7))) * 54;
                    int i191118 = ((i191116 | i191117) << 1) - (i191117 ^ i191116);
                    int i191119 = (i191118 << 13) ^ i191118;
                    int i2015 = i191119 >>> 17;
                    int i2016 = ((~i191119) & i2015) | ((~i2015) & i191119);
                    int i2017 = i2016 << 5;
                    ((int[]) objArr2[1])[0] = (i2016 | i2017) & (~(i2016 & i2017));
                    return objArr2;
                } catch (Throwable th5) {
                    Throwable cause = th5.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th5;
                }
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$e(byte r5, byte r6, short r7) {
                /*
                    int r7 = r7 * 3
                    int r7 = 4 - r7
                    int r5 = r5 * 3
                    int r5 = 108 - r5
                    int r6 = r6 * 3
                    int r6 = 1 - r6
                    byte[] r0 = com.google.android.libraries.places.internal.zzim.$$c
                    byte[] r1 = new byte[r6]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r4 = r5
                    r5 = r6
                    r3 = r2
                    goto L27
                L17:
                    r3 = r2
                L18:
                    byte r4 = (byte) r5
                    r1[r3] = r4
                    int r3 = r3 + 1
                    if (r3 != r6) goto L25
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    return r5
                L25:
                    r4 = r0[r7]
                L27:
                    int r5 = r5 + r4
                    int r7 = r7 + 1
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzim.$$e(byte, byte, short):java.lang.String");
            }
        }).continueWithTask(new Continuation() { // from class: com.google.android.libraries.places.internal.zzin
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ Object then(Task task) {
                this.zza.zzr(jZzb, zzmoVar, listenableFutureZzy, task);
                return task;
            }
        });
    }

    public final Task zzd(final FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequest, final zzmo zzmoVar) throws Throwable {
        if (zzmoVar == zzmo.PLACES_UI_KIT && this.zzk.zzc == null) {
            return Tasks.forException(new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "Get Photo Media for Places UI Kit but widget type is null")));
        }
        final long jZzb = this.zze.zzb();
        final ListenableFuture listenableFutureZzy = zzy();
        final ListenableFuture listenableFutureB = getCloseFuture.b(listenableFutureZzy, new ConstantObservableExternalSyntheticLambda0() { // from class: com.google.android.libraries.places.internal.zzhw
            @Override // defpackage.ConstantObservableExternalSyntheticLambda0
            public final /* synthetic */ ListenableFuture apply(Object obj) {
                return this.zza.zzs(zzmoVar, fetchResolvedPhotoUriRequest, (com.google.android.libraries.places.api.auth.zzb) obj);
            }
        }, DirectExecutor.INSTANCE);
        CancellationToken cancellationToken = fetchResolvedPhotoUriRequest.getCancellationToken();
        if (cancellationToken != null) {
            cancellationToken.onCanceledRequested(new OnTokenCanceledListener() { // from class: com.google.android.libraries.places.internal.zzhz
                @Override // com.google.android.gms.tasks.OnTokenCanceledListener
                public final /* synthetic */ void onCanceled() {
                    listenableFutureB.cancel(true);
                }
            });
        }
        return zzeg.zza(listenableFutureB).onSuccessTask(zzhx.zza).continueWithTask(new Continuation() { // from class: com.google.android.libraries.places.internal.zzhy
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ Object then(Task task) {
                this.zza.zzt(jZzb, zzmoVar, listenableFutureZzy, task);
                return task;
            }
        });
    }

    public final Task zze(final LatLng latLng) {
        return zzeg.zza(getCloseFuture.b(zzy(), new ConstantObservableExternalSyntheticLambda0() { // from class: com.google.android.libraries.places.internal.zzia
            @Override // defpackage.ConstantObservableExternalSyntheticLambda0
            public final /* synthetic */ ListenableFuture apply(Object obj) {
                return this.zza.zzu(latLng, (com.google.android.libraries.places.api.auth.zzb) obj);
            }
        }, DirectExecutor.INSTANCE));
    }

    public final Task zzf(final SearchNearbyRequest searchNearbyRequest, final zzmo zzmoVar) throws Throwable {
        List<Place.Field> placeFields = searchNearbyRequest.getPlaceFields();
        if (placeFields.isEmpty()) {
            return Tasks.forException(new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "Place fields must not be empty.")));
        }
        String regionCode = searchNearbyRequest.getRegionCode();
        if (regionCode != null && regionCode.isEmpty()) {
            return Tasks.forException(new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "Region code must not be an empty string.")));
        }
        final long jZzb = this.zze.zzb();
        ArrayList arrayList = new ArrayList();
        if (searchNearbyRequest.isRoutingSummariesIncluded()) {
            arrayList.add(zzhi.ROUTING_SUMMARIES);
        }
        final String strZza = zzhj.zza(zziy.zza(placeFields), arrayList);
        final ListenableFuture listenableFutureZzy = zzy();
        final ListenableFuture listenableFutureB = getCloseFuture.b(listenableFutureZzy, new ConstantObservableExternalSyntheticLambda0() { // from class: com.google.android.libraries.places.internal.zzib
            @Override // defpackage.ConstantObservableExternalSyntheticLambda0
            public final /* synthetic */ ListenableFuture apply(Object obj) {
                return this.zza.zzv(zzmoVar, strZza, searchNearbyRequest, (com.google.android.libraries.places.api.auth.zzb) obj);
            }
        }, DirectExecutor.INSTANCE);
        CancellationToken cancellationToken = searchNearbyRequest.getCancellationToken();
        if (cancellationToken != null) {
            cancellationToken.onCanceledRequested(new OnTokenCanceledListener() { // from class: com.google.android.libraries.places.internal.zzie
                @Override // com.google.android.gms.tasks.OnTokenCanceledListener
                public final /* synthetic */ void onCanceled() {
                    listenableFutureB.cancel(true);
                }
            });
        }
        return zzeg.zza(listenableFutureB).onSuccessTask(new SuccessContinuation() { // from class: com.google.android.libraries.places.internal.zzic
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final /* synthetic */ Task then(Object obj) {
                return this.zza.zzw(searchNearbyRequest, (zzaxy) obj);
            }
        }).continueWithTask(new Continuation() { // from class: com.google.android.libraries.places.internal.zzid
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ Object then(Task task) {
                this.zza.zzx(searchNearbyRequest, jZzb, zzmoVar, listenableFutureZzy, task);
                return task;
            }
        });
    }

    public final void zzg() {
        this.zzb.zzd();
        zzjf zzjfVar = this.zzj;
        zzjfVar.zzb.shutdownNow();
        zzjfVar.zza.zzd();
        this.zzk.zzc();
    }

    public final void zzh() {
        this.zzj.zzb();
    }

    public final void zzi() {
        this.zzk.zzc();
    }

    final /* synthetic */ ListenableFuture zzj(zzmo zzmoVar, String str, SearchByTextRequest searchByTextRequest, com.google.android.libraries.places.api.auth.zzb zzbVar) throws ExecutionException, InterruptedException {
        int i;
        zzaun zzaunVar;
        zzawy zzawyVarZzz = zzz(zzmoVar, str, zzbVar, zzbdd.PLACE_LIST);
        Locale localeZzg = this.zzn.zzg();
        zzaxz zzaxzVarZza = zzayi.zza();
        String includedType = searchByTextRequest.getIncludedType();
        if (includedType != null) {
            zzaxzVarZza.zzd(includedType);
        }
        LocationBias locationBias = searchByTextRequest.getLocationBias();
        if (locationBias != null) {
            boolean z = locationBias instanceof RectangularBounds;
            if (!(z || (locationBias instanceof CircularBounds))) {
                throw new IllegalArgumentException("LocationBias must be of type RectangularBounds or CircularBounds.");
            }
            zzayc zzaycVarZza = zzayd.zza();
            if (z) {
                zzaycVarZza.zza(zzhf.zzc((RectangularBounds) locationBias));
            } else {
                zzaycVarZza.zzb(zzhf.zzb((CircularBounds) locationBias));
            }
            zzaxzVarZza.zzj((zzayd) zzaycVarZza.zzG());
        }
        LocationRestriction locationRestriction = searchByTextRequest.getLocationRestriction();
        if (locationRestriction != null) {
            if (!(locationRestriction instanceof RectangularBounds)) {
                throw new IllegalArgumentException("LocationRestriction must be of type RectangularBounds.");
            }
            zzaye zzayeVarZza = zzayf.zza();
            zzayeVarZza.zza(zzhf.zzc((RectangularBounds) locationRestriction));
            zzaxzVarZza.zzk((zzayf) zzayeVarZza.zzG());
        }
        Integer maxResultCount = searchByTextRequest.getMaxResultCount();
        if (maxResultCount != null) {
            zzaxzVarZza.zzg(maxResultCount.intValue());
        }
        Double minRating = searchByTextRequest.getMinRating();
        if (minRating != null) {
            zzaxzVarZza.zzf(minRating.doubleValue());
        }
        zzaxzVarZza.zze(searchByTextRequest.isOpenNow());
        List<Integer> priceLevels = searchByTextRequest.getPriceLevels();
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = priceLevels.iterator();
        while (true) {
            i = 3;
            if (!it.hasNext()) {
                break;
            }
            int iIntValue = it.next().intValue();
            if (iIntValue == 0) {
                arrayList.add(zzaxc.PRICE_LEVEL_FREE);
            } else if (iIntValue == 1) {
                arrayList.add(zzaxc.PRICE_LEVEL_INEXPENSIVE);
            } else if (iIntValue == 2) {
                arrayList.add(zzaxc.PRICE_LEVEL_MODERATE);
            } else if (iIntValue == 3) {
                arrayList.add(zzaxc.PRICE_LEVEL_EXPENSIVE);
            } else if (iIntValue == 4) {
                arrayList.add(zzaxc.PRICE_LEVEL_VERY_EXPENSIVE);
            }
        }
        zzaxzVarZza.zzh(arrayList);
        SearchByTextRequest.RankPreference rankPreference = searchByTextRequest.getRankPreference();
        if (rankPreference == null) {
            i = 2;
        } else if (rankPreference.ordinal() != 0) {
            i = 4;
        }
        zzaxzVarZza.zzp(i);
        String regionCode = searchByTextRequest.getRegionCode();
        if (regionCode != null) {
            zzaxzVarZza.zzc(regionCode);
        }
        zzaxzVarZza.zzi(searchByTextRequest.isStrictTypeFiltering());
        zzaxzVarZza.zza(searchByTextRequest.getTextQuery());
        zzaxzVarZza.zzb(localeZzg.toLanguageTag());
        EVSearchOptions evSearchOptions = searchByTextRequest.getEvSearchOptions();
        if (evSearchOptions != null) {
            zzaya zzayaVarZza = zzayb.zza();
            Double minimumChargingRateKw = evSearchOptions.getMinimumChargingRateKw();
            if (minimumChargingRateKw != null) {
                zzayaVarZza.zza(minimumChargingRateKw.doubleValue());
            }
            List<EVConnectorType> connectorTypes = evSearchOptions.getConnectorTypes();
            if (connectorTypes != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator<EVConnectorType> it2 = connectorTypes.iterator();
                while (it2.hasNext()) {
                    switch (it2.next().ordinal()) {
                        case 1:
                            zzaunVar = zzaun.EV_CONNECTOR_TYPE_OTHER;
                            break;
                        case 2:
                            zzaunVar = zzaun.EV_CONNECTOR_TYPE_J1772;
                            break;
                        case 3:
                            zzaunVar = zzaun.EV_CONNECTOR_TYPE_TYPE_2;
                            break;
                        case 4:
                            zzaunVar = zzaun.EV_CONNECTOR_TYPE_CHADEMO;
                            break;
                        case 5:
                            zzaunVar = zzaun.EV_CONNECTOR_TYPE_CCS_COMBO_1;
                            break;
                        case 6:
                            zzaunVar = zzaun.EV_CONNECTOR_TYPE_CCS_COMBO_2;
                            break;
                        case 7:
                            zzaunVar = zzaun.EV_CONNECTOR_TYPE_TESLA;
                            break;
                        case 8:
                            zzaunVar = zzaun.EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T;
                            break;
                        case 9:
                            zzaunVar = zzaun.EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET;
                            break;
                        default:
                            zzaunVar = zzaun.EV_CONNECTOR_TYPE_UNSPECIFIED;
                            break;
                    }
                    arrayList2.add(zzaunVar);
                }
                zzayaVarZza.zzb(arrayList2);
            }
            zzaxzVarZza.zzl((zzayb) zzayaVarZza.zzG());
        }
        SearchAlongRouteParameters searchAlongRouteParameters = searchByTextRequest.getSearchAlongRouteParameters();
        if (searchAlongRouteParameters != null) {
            zzayg zzaygVarZza = zzayh.zza();
            EncodedPolyline encodedPolyline = (EncodedPolyline) searchAlongRouteParameters.getPolyline();
            zzaxa zzaxaVarZza = zzaxb.zza();
            zzaxaVarZza.zza(encodedPolyline.getEncodedPolyline());
            zzaygVarZza.zza((zzaxb) zzaxaVarZza.zzG());
            zzaxzVarZza.zzn((zzayh) zzaygVarZza.zzG());
        }
        RoutingParameters routingParameters = searchByTextRequest.getRoutingParameters();
        if (routingParameters != null) {
            zzaxzVarZza.zzm(zzjo.zza(routingParameters));
        }
        if (searchByTextRequest.isPureServiceAreaBusinessesIncluded()) {
            zzaxzVarZza.zzo(true);
        }
        return zzcaj.zzb(zzawyVarZzz.zzc().zza(zzawz.zzb(), zzawyVarZzz.zzd()), (zzayi) zzaxzVarZza.zzG());
    }

    final /* synthetic */ Task zzk(SearchByTextRequest searchByTextRequest, zzayk zzaykVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        List listZza = zzaykVar.zza();
        List listZzc = zzaykVar.zzc();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listZza.iterator();
        while (it.hasNext()) {
            arrayList.add(this.zzi.zza((zzaww) it.next()));
        }
        Iterator it2 = listZzc.iterator();
        while (it2.hasNext()) {
            arrayList2.add(zzjq.zza((zzaxq) it2.next()));
        }
        SearchByTextResponse.Builder builder = SearchByTextResponse.builder(arrayList);
        if (true != searchByTextRequest.isRoutingSummariesIncluded()) {
            arrayList2 = null;
        }
        builder.setRoutingSummaries(arrayList2);
        taskCompletionSource.setResult(builder.build());
        return taskCompletionSource.getTask();
    }

    final /* synthetic */ Task zzl(SearchByTextRequest searchByTextRequest, long j, zzmo zzmoVar, ListenableFuture listenableFuture, Task task) {
        if (!task.isCanceled()) {
            this.zzd.zzf(searchByTextRequest, task, j, this.zze.zzb(), zzmoVar, (com.google.android.libraries.places.api.auth.zzb) listenableFuture.get());
        }
        return task;
    }

    final /* synthetic */ ListenableFuture zzm(zzmo zzmoVar, FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, com.google.android.libraries.places.api.auth.zzb zzbVar) throws ExecutionException, InterruptedException {
        zzawy zzawyVarZzz = zzz(zzmoVar, "", zzbVar, zzbdd.PLACE_AUTOCOMPLETE);
        Locale localeZzg = this.zzn.zzg();
        zzasv zzasvVarZza = zzata.zza();
        zzasvVarZza.zza(findAutocompletePredictionsRequest.getQuery());
        zzasvVarZza.zzf(localeZzg.toLanguageTag());
        Integer inputOffset = findAutocompletePredictionsRequest.getInputOffset();
        if (inputOffset != null) {
            zzasvVarZza.zzi(inputOffset.intValue());
        }
        String regionCode = findAutocompletePredictionsRequest.getRegionCode();
        if (regionCode != null) {
            zzasvVarZza.zzg(regionCode);
        }
        LocationBias locationBias = findAutocompletePredictionsRequest.getLocationBias();
        if (locationBias != null) {
            boolean z = locationBias instanceof CircularBounds;
            if (!z && !(locationBias instanceof RectangularBounds)) {
                throw new IllegalArgumentException();
            }
            zzasw zzaswVarZza = zzasx.zza();
            if (z) {
                zzaswVarZza.zzb(zzhf.zzb((CircularBounds) locationBias));
            }
            if (locationBias instanceof RectangularBounds) {
                zzaswVarZza.zza(zzhf.zzc((RectangularBounds) locationBias));
            }
            zzasvVarZza.zzb((zzasx) zzaswVarZza.zzG());
        }
        LocationRestriction locationRestriction = findAutocompletePredictionsRequest.getLocationRestriction();
        if (locationRestriction != null) {
            boolean z2 = locationRestriction instanceof CircularBounds;
            if (!z2 && !(locationRestriction instanceof RectangularBounds)) {
                throw new IllegalArgumentException();
            }
            zzasy zzasyVarZza = zzasz.zza();
            if (z2) {
                zzasyVarZza.zzb(zzhf.zzb((CircularBounds) locationRestriction));
            }
            if (locationRestriction instanceof RectangularBounds) {
                zzasyVarZza.zza(zzhf.zzc((RectangularBounds) locationRestriction));
            }
            zzasvVarZza.zzc((zzasz) zzasyVarZza.zzG());
        }
        LatLng origin = findAutocompletePredictionsRequest.getOrigin();
        if (origin != null) {
            zzasvVarZza.zzh(zzhf.zza(origin));
        }
        Iterator<String> it = findAutocompletePredictionsRequest.getCountries().iterator();
        while (it.hasNext()) {
            zzasvVarZza.zze(it.next());
        }
        AutocompleteSessionToken sessionToken = findAutocompletePredictionsRequest.getSessionToken();
        if (sessionToken != null) {
            zzasvVarZza.zzj(sessionToken.toString());
        }
        Iterator<String> it2 = findAutocompletePredictionsRequest.getTypesFilter().iterator();
        while (it2.hasNext()) {
            zzasvVarZza.zzd(it2.next());
        }
        if (findAutocompletePredictionsRequest.isPureServiceAreaBusinessesIncluded()) {
            zzasvVarZza.zzk(true);
        }
        return zzcaj.zzb(zzawyVarZzz.zzc().zza(zzawz.zze(), zzawyVarZzz.zzd()), (zzata) zzasvVarZza.zzG());
    }

    final /* synthetic */ Task zzn(zzato zzatoVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ArrayList arrayList = new ArrayList();
        Iterator it = zzatoVar.zza().iterator();
        while (it.hasNext()) {
            arrayList.add(this.zzh.zza((zzatn) it.next()));
        }
        taskCompletionSource.setResult(FindAutocompletePredictionsResponse.newInstance(arrayList));
        return taskCompletionSource.getTask();
    }

    final /* synthetic */ Task zzo(long j, zzmo zzmoVar, ListenableFuture listenableFuture, Task task) {
        if (!task.isCanceled()) {
            this.zzd.zzl(task, j, this.zze.zzb(), 3, zzmoVar, (com.google.android.libraries.places.api.auth.zzb) listenableFuture.get());
        }
        return task;
    }

    final /* synthetic */ ListenableFuture zzp(zzmo zzmoVar, String str, FetchPlaceRequest fetchPlaceRequest, com.google.android.libraries.places.api.auth.zzb zzbVar) throws ExecutionException, InterruptedException {
        zzawy zzawyVarZzz = zzz(zzmoVar, str, zzbVar, zzbdd.PLACE_DETAILS);
        Locale localeZzg = this.zzn.zzg();
        zzauv zzauvVarZza = zzauw.zza();
        zzauvVarZza.zza("places/".concat(String.valueOf(fetchPlaceRequest.getPlaceId())));
        String regionCode = fetchPlaceRequest.getRegionCode();
        if (regionCode != null) {
            zzauvVarZza.zzc(regionCode);
        }
        AutocompleteSessionToken sessionToken = fetchPlaceRequest.getSessionToken();
        if (sessionToken != null) {
            zzauvVarZza.zzd(sessionToken.toString());
        }
        zzauvVarZza.zzb(localeZzg.toLanguageTag());
        return zzcaj.zzb(zzawyVarZzz.zzc().zza(zzawz.zzd(), zzawyVarZzz.zzd()), (zzauw) zzauvVarZza.zzG());
    }

    final /* synthetic */ Task zzq(zzaww zzawwVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setResult(FetchPlaceResponse.newInstance(this.zzi.zza(zzawwVar)));
        return taskCompletionSource.getTask();
    }

    final /* synthetic */ Task zzr(long j, zzmo zzmoVar, ListenableFuture listenableFuture, Task task) {
        if (!task.isCanceled()) {
            this.zzd.zzn(task, j, this.zze.zzb(), 3, zzmoVar, (com.google.android.libraries.places.api.auth.zzb) listenableFuture.get());
        }
        return task;
    }

    final /* synthetic */ ListenableFuture zzs(zzmo zzmoVar, FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequest, com.google.android.libraries.places.api.auth.zzb zzbVar) throws ExecutionException, InterruptedException {
        zzawy zzawyVarZzz = zzz(zzmoVar, "", zzbVar, this.zzk.zzc);
        zzaut zzautVarZza = zzauu.zza();
        zzautVarZza.zza(String.valueOf(fetchResolvedPhotoUriRequest.getPhotoMetadata().zzb()).concat("/media"));
        Integer maxHeight = fetchResolvedPhotoUriRequest.getMaxHeight();
        if (maxHeight != null) {
            zzautVarZza.zzc(maxHeight.intValue());
        }
        Integer maxWidth = fetchResolvedPhotoUriRequest.getMaxWidth();
        if (maxWidth != null) {
            zzautVarZza.zzb(maxWidth.intValue());
        }
        zzautVarZza.zzd(true);
        return zzcaj.zzb(zzawyVarZzz.zzc().zza(zzawz.zzc(), zzawyVarZzz.zzd()), (zzauu) zzautVarZza.zzG());
    }

    final /* synthetic */ Task zzt(long j, zzmo zzmoVar, ListenableFuture listenableFuture, Task task) {
        if (!task.isCanceled()) {
            this.zzd.zzh(task, j, this.zze.zzb(), zzmoVar, (com.google.android.libraries.places.api.auth.zzb) listenableFuture.get());
        }
        return task;
    }

    final /* synthetic */ ListenableFuture zzu(LatLng latLng, com.google.android.libraries.places.api.auth.zzb zzbVar) throws ExecutionException, InterruptedException {
        return this.zzm.zza(latLng, zzbVar, zzA(zzbdd.PLACE_DETAILS));
    }

    final /* synthetic */ ListenableFuture zzv(zzmo zzmoVar, String str, SearchNearbyRequest searchNearbyRequest, com.google.android.libraries.places.api.auth.zzb zzbVar) throws Throwable {
        int i;
        zzawy zzawyVarZzz = zzz(zzmoVar, str, zzbVar, zzbdd.PLACE_LIST);
        Locale localeZzg = this.zzn.zzg();
        zzaxr zzaxrVarZza = zzaxw.zza();
        zzaxrVarZza.zza(localeZzg.toLanguageTag());
        String regionCode = searchNearbyRequest.getRegionCode();
        if (regionCode != null) {
            zzaxrVarZza.zzb(regionCode);
        }
        List<String> includedTypes = searchNearbyRequest.getIncludedTypes();
        if (includedTypes != null) {
            zzaxrVarZza.zzc(includedTypes);
        }
        List<String> excludedTypes = searchNearbyRequest.getExcludedTypes();
        if (excludedTypes != null) {
            zzaxrVarZza.zzd(excludedTypes);
        }
        List<String> includedPrimaryTypes = searchNearbyRequest.getIncludedPrimaryTypes();
        if (includedPrimaryTypes != null) {
            zzaxrVarZza.zze(includedPrimaryTypes);
        }
        List<String> excludedPrimaryTypes = searchNearbyRequest.getExcludedPrimaryTypes();
        if (excludedPrimaryTypes != null) {
            zzaxrVarZza.zzf(excludedPrimaryTypes);
        }
        Integer maxResultCount = searchNearbyRequest.getMaxResultCount();
        if (maxResultCount != null) {
            zzaxrVarZza.zzg(maxResultCount.intValue());
        }
        RoutingParameters routingParameters = searchNearbyRequest.getRoutingParameters();
        if (routingParameters != null) {
            zzaxrVarZza.zzi(zzjo.zza(routingParameters));
        }
        zzaxu zzaxuVarZza = zzaxv.zza();
        zzaxuVarZza.zza(zzhf.zzb((CircularBounds) searchNearbyRequest.getLocationRestriction()));
        zzaxrVarZza.zzh((zzaxv) zzaxuVarZza.zzG());
        SearchNearbyRequest.RankPreference rankPreference = searchNearbyRequest.getRankPreference();
        if (rankPreference == null) {
            i = 2;
        } else {
            i = rankPreference.ordinal() != 0 ? 4 : 3;
        }
        zzaxrVarZza.zzj(i);
        return zzcaj.zzb(zzawyVarZzz.zzc().zza(zzawz.zza(), zzawyVarZzz.zzd()), (zzaxw) zzaxrVarZza.zzG());
    }

    final /* synthetic */ Task zzw(SearchNearbyRequest searchNearbyRequest, zzaxy zzaxyVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        List listZza = zzaxyVar.zza();
        List listZzc = zzaxyVar.zzc();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listZza.iterator();
        while (it.hasNext()) {
            arrayList.add(this.zzi.zza((zzaww) it.next()));
        }
        Iterator it2 = listZzc.iterator();
        while (it2.hasNext()) {
            arrayList2.add(zzjq.zza((zzaxq) it2.next()));
        }
        SearchNearbyResponse.Builder builder = SearchNearbyResponse.builder(arrayList);
        if (true != searchNearbyRequest.isRoutingSummariesIncluded()) {
            arrayList2 = null;
        }
        builder.setRoutingSummaries(arrayList2);
        taskCompletionSource.setResult(builder.build());
        return taskCompletionSource.getTask();
    }

    final /* synthetic */ Task zzx(SearchNearbyRequest searchNearbyRequest, long j, zzmo zzmoVar, ListenableFuture listenableFuture, Task task) {
        if (!task.isCanceled()) {
            this.zzd.zzj(searchNearbyRequest, task, j, this.zze.zzb(), zzmoVar, (com.google.android.libraries.places.api.auth.zzb) listenableFuture.get());
        }
        return task;
    }
}

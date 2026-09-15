package com.google.android.libraries.places.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.location.Location;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.libraries.places.api.model.PlaceLikelihood;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import com.google.android.libraries.places.api.net.FetchPhotoResponse;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import com.google.android.libraries.places.api.net.FindCurrentPlaceResponse;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;
import com.google.common.collect.ImmutableList;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import defpackage.setVideoStabilizationMode;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zzlc implements zzfm {
    private static int $10 = 0;
    private static int $11 = 1;
    private final zzmx zza;
    private final zzfr zzb;
    private final zzfx zzc;
    private final zzme zzd;
    private final zzdy zze;
    private final zzkh zzf;
    private final zzkp zzg;
    private final zzmf zzh;
    private static final byte[] $$a = {51, -5, 77, 89, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$b = 25;
    private static int b = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1995539926981180843L;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 52
            int r7 = r7 + 1
            int r9 = r9 * 14
            int r9 = 98 - r9
            int r8 = r8 + 4
            byte[] r0 = com.google.android.libraries.places.internal.zzlc.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r9 = r8
            r5 = r2
            goto L2d
        L15:
            r3 = r2
        L16:
            int r8 = r8 + 1
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2d:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-11)
            r3 = r5
            r6 = r9
            r9 = r8
            r8 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzlc.c(int, short, int, java.lang.Object[]):void");
    }

    final /* synthetic */ FindAutocompletePredictionsResponse zze(long j, zzmo zzmoVar, Task task) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
        b = i2 % 128;
        int i3 = i2 % 2;
        this.zzd.zzl(task, j, this.zze.zzb(), 2, zzmoVar, com.google.android.libraries.places.api.auth.zzb.zza);
        FindAutocompletePredictionsResponse findAutocompletePredictionsResponse = (FindAutocompletePredictionsResponse) task.getResult();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
        b = i4 % 128;
        int i5 = i4 % 2;
        return findAutocompletePredictionsResponse;
    }

    final /* synthetic */ FetchPhotoResponse zzf(long j, zzmo zzmoVar, Task task) {
        int i = 2 % 2;
        int i2 = b + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        this.zzd.zzd(task, j, this.zze.zzb(), zzmoVar);
        FetchPhotoResponse fetchPhotoResponse = (FetchPhotoResponse) task.getResult();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            return fetchPhotoResponse;
        }
        throw null;
    }

    final /* synthetic */ FetchPlaceResponse zzg(long j, zzmo zzmoVar, Task task) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            this.zzd.zzn(task, j, this.zze.zzb(), 2, zzmoVar, com.google.android.libraries.places.api.auth.zzb.zza);
        } else {
            this.zzd.zzn(task, j, this.zze.zzb(), 2, zzmoVar, com.google.android.libraries.places.api.auth.zzb.zza);
        }
        return (FetchPlaceResponse) task.getResult();
    }

    final /* synthetic */ FindCurrentPlaceResponse zzh(long j, zzmo zzmoVar, Task task) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            this.zzd.zzb(task, j, this.zze.zzb(), zzmoVar);
            throw null;
        }
        this.zzd.zzb(task, j, this.zze.zzb(), zzmoVar);
        FindCurrentPlaceResponse findCurrentPlaceResponse = (FindCurrentPlaceResponse) task.getResult();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
        b = i3 % 128;
        int i4 = i3 % 2;
        return findCurrentPlaceResponse;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.trim()) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        r0 = r4.zzh;
        r3 = new com.google.android.libraries.places.internal.zzkj(r5, r0.zzg(), r0.zzf(), r4.zza);
        r5 = r4.zze;
        r0 = r4.zzb;
        r1 = r5.zzb();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0067, code lost:
    
        return r0.zza(r3, com.google.android.libraries.places.internal.zzkk.class).continueWith(new com.google.android.libraries.places.internal.zzlb(r4)).continueWith(new com.google.android.libraries.places.internal.zzku(r4, r1, r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0029, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.trim()) == false) goto L11;
     */
    @Override // com.google.android.libraries.places.internal.zzfm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.tasks.Task zza(com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest r5, final com.google.android.libraries.places.internal.zzmo r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.libraries.places.internal.zzlc.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r1 = r1 + 5
            int r2 = r1 % 128
            com.google.android.libraries.places.internal.zzlc.b = r2
            int r1 = r1 % r0
            java.lang.String r1 = r5.getQuery()
            if (r1 == 0) goto L68
            int r2 = com.google.android.libraries.places.internal.zzlc.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r2 = r2 + 93
            int r3 = r2 % 128
            com.google.android.libraries.places.internal.zzlc.b = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L2c
            java.lang.String r1 = r1.trim()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = 30
            int r2 = r2 / 0
            if (r1 != 0) goto L68
            goto L36
        L2c:
            java.lang.String r1 = r1.trim()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L68
        L36:
            com.google.android.libraries.places.internal.zzmf r0 = r4.zzh
            com.google.android.libraries.places.internal.zzmx r1 = r4.zza
            java.util.Locale r2 = r0.zzg()
            com.google.android.libraries.places.internal.zzkj r3 = new com.google.android.libraries.places.internal.zzkj
            java.lang.String r0 = r0.zzf()
            r3.<init>(r5, r2, r0, r1)
            com.google.android.libraries.places.internal.zzdy r5 = r4.zze
            com.google.android.libraries.places.internal.zzfr r0 = r4.zzb
            long r1 = r5.zzb()
            java.lang.Class<com.google.android.libraries.places.internal.zzkk> r5 = com.google.android.libraries.places.internal.zzkk.class
            com.google.android.gms.tasks.Task r5 = r0.zza(r3, r5)
            com.google.android.libraries.places.internal.zzlb r0 = new com.google.android.libraries.places.internal.zzlb
            r0.<init>(r4)
            com.google.android.gms.tasks.Task r5 = r5.continueWith(r0)
            com.google.android.libraries.places.internal.zzku r0 = new com.google.android.libraries.places.internal.zzku
            r0.<init>()
            com.google.android.gms.tasks.Task r5 = r5.continueWith(r0)
            return r5
        L68:
            com.google.common.collect.ImmutableList r5 = com.google.common.collect.ImmutableList.asInterface()
            com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse r5 = com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse.newInstance(r5)
            com.google.android.gms.tasks.Task r5 = com.google.android.gms.tasks.Tasks.forResult(r5)
            int r6 = com.google.android.libraries.places.internal.zzlc.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r6 = r6 + 29
            int r1 = r6 % 128
            com.google.android.libraries.places.internal.zzlc.b = r1
            int r6 = r6 % r0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzlc.zza(com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest, com.google.android.libraries.places.internal.zzmo):com.google.android.gms.tasks.Task");
    }

    static final /* synthetic */ FetchPlaceResponse zzi(Task task) throws ApiException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
        b = i2 % 128;
        ImmutableList immutableList = null;
        if (i2 % 2 != 0) {
            PlacesStatusCodes.isError(zzlj.zza(((zzkg) task.getResult()).status));
            immutableList.hashCode();
            throw null;
        }
        zzkg zzkgVar = (zzkg) task.getResult();
        int iZza = zzlj.zza(zzkgVar.status);
        if (PlacesStatusCodes.isError(iZza)) {
            throw new ApiException(new Status(iZza, zzlj.zzb(zzkgVar.status, zzkgVar.errorMessage)));
        }
        int i3 = b + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 != 0) {
            zzli zzliVar = zzkgVar.result;
            String[] strArr = zzkgVar.htmlAttributions;
            return FetchPlaceResponse.newInstance(zzlf.zzg(zzliVar, strArr != null ? ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault3((Object[]) strArr) : null));
        }
        zzli zzliVar2 = zzkgVar.result;
        String[] strArr2 = zzkgVar.htmlAttributions;
        immutableList.hashCode();
        throw null;
    }

    static final /* synthetic */ FindCurrentPlaceResponse zzj(Task task) throws ApiException {
        ImmutableList immutableListTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i = 2 % 2;
        int i2 = b + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        zzko zzkoVar = (zzko) task.getResult();
        int iZza = zzlj.zza(zzkoVar.status);
        if (PlacesStatusCodes.isError(iZza)) {
            throw new ApiException(new Status(iZza, zzlj.zzb(zzkoVar.status, zzkoVar.errorMessage)));
        }
        ArrayList arrayList = new ArrayList();
        zzlh[] zzlhVarArr = zzkoVar.predictions;
        if (zzlhVarArr != null) {
            for (zzlh zzlhVar : zzlhVarArr) {
                if (zzlhVar.zzb() == null) {
                    throw new ApiException(new Status(8, "Unexpected server error: PlaceLikelihood returned without a Place value"));
                }
                Double dZza = zzlhVar.zza();
                if (dZza == null) {
                    throw new ApiException(new Status(8, "Unexpected server error: PlaceLikelihood returned without a likelihood value"));
                }
                zzli zzliVarZzb = zzlhVar.zzb();
                String[] strArr = zzkoVar.htmlAttributions;
                if (strArr != null) {
                    immutableListTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault3((Object[]) strArr);
                } else {
                    int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
                    b = i4 % 128;
                    int i5 = i4 % 2;
                    immutableListTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                }
                arrayList.add(PlaceLikelihood.newInstance(zzlf.zzg(zzliVarZzb, immutableListTuitionPaymentFragmentspecialinlinedviewModeldefault3), dZza.doubleValue()));
            }
        }
        return FindCurrentPlaceResponse.newInstance(arrayList);
    }

    @Override // com.google.android.libraries.places.internal.zzfm
    public final Task zzd(FindCurrentPlaceRequest findCurrentPlaceRequest, Location location, ImmutableList immutableList, final zzmo zzmoVar) {
        int i = 2 % 2;
        int i2 = b + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            findCurrentPlaceRequest.getPlaceFields().isEmpty();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (findCurrentPlaceRequest.getPlaceFields().isEmpty()) {
            Task taskForException = Tasks.forException(new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "Place Fields must not be empty.")));
            int i3 = b + 105;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 53 / 0;
            }
            return taskForException;
        }
        zzmf zzmfVar = this.zzh;
        zzkn zzknVar = new zzkn(findCurrentPlaceRequest, location, immutableList, zzmfVar.zzg(), zzmfVar.zzf(), this.zza);
        zzdy zzdyVar = this.zze;
        zzfr zzfrVar = this.zzb;
        final long jZzb = zzdyVar.zzb();
        return zzfrVar.zza(zzknVar, zzko.class).continueWith(new Continuation() { // from class: com.google.android.libraries.places.internal.zzkz
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ Object then(Task task) {
                return zzlc.zzj(task);
            }
        }).continueWith(new Continuation() { // from class: com.google.android.libraries.places.internal.zzla
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ Object then(Task task) {
                return this.zza.zzh(jZzb, zzmoVar, task);
            }
        });
    }

    @Override // com.google.android.libraries.places.internal.zzfm
    public final Task zzb(FetchPhotoRequest fetchPhotoRequest, final zzmo zzmoVar) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
        b = i2 % 128;
        if (i2 % 2 != 0) {
            fetchPhotoRequest.getMaxWidth();
            fetchPhotoRequest.getMaxHeight();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer maxWidth = fetchPhotoRequest.getMaxWidth();
        Integer maxHeight = fetchPhotoRequest.getMaxHeight();
        if (maxWidth == null && maxHeight == null) {
            Task taskForException = Tasks.forException(new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "Must include max width or max height in request.")));
            int i3 = b + 33;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            return taskForException;
        }
        if (maxWidth != null) {
            int i5 = b + 5;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            if (maxWidth.intValue() <= 0) {
                return Tasks.forException(new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, String.format("Max Width must not be < 1, but was: %d.", maxWidth))));
            }
        }
        if (maxHeight != null && maxHeight.intValue() <= 0) {
            return Tasks.forException(new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, String.format("Max Height must not be < 1, but was: %d.", maxHeight))));
        }
        zzmf zzmfVar = this.zzh;
        zzka zzkaVar = new zzka(fetchPhotoRequest, zzmfVar.zzf(), this.zza);
        zzdy zzdyVar = this.zze;
        zzfx zzfxVar = this.zzc;
        final long jZzb = zzdyVar.zzb();
        return zzfxVar.zzb(zzkaVar, new zzkb()).continueWith(new Continuation(this) { // from class: com.google.android.libraries.places.internal.zzkv
            private static final byte[] $$a = {22, 102, 43, -6};
            private static final int $$b = 20;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int b = 0;
            private static int TuitionPaymentFragmentbindingInflater1 = 1;
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 8899372360591967771L;
            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {59750, 59860, 59883, 59856, 59866, 59856, 59886, 59860, 59860, 59881, 59883, 59867, 59865, 59860, 59708, 59771, 59744, 59746, 59756, 59747, 59745, 59745, 59728, 59740, 59757, 59759, 59757, 59756, 59753, 59731, 59700, 59718, 59749, 59716, 59738, 59770, 59746, 59751, 59770, 59749, 59746, 59715, 59714, 59757, 59756, 59842, 59848, 59854, 59849, 59854, 59844, 59845, 59853, 59852, 59687, 59720, 59706, 59705, 59711, 59710, 59758, 59744, 59744, 59724, 59739, 59751, 59759, 59751, 59768, 59750, 59749, 59773, 59736, 59715, 59759, 59744, 59768, 59738, 59699, 59743, 59744, 59768, 59749, 59756, 59756, 59757, 59753, 59745, 59751, 59742, 59736, 59753, 59744, 59770, 59771, 59774, 59704, 59757, 59746, 59746, 59744, 59746, 59745, 59751, 59743, 59743, 59744, 59768, 59749, 59756, 59756, 59757, 59753, 59745, 59751, 59704, 59756, 59757, 59753, 59745, 59751, 59756, 59758, 59744, 59744, 59724, 59739, 59751, 59759, 59751, 59768, 59750, 59749, 59773, 59736, 59715, 59759, 59744, 59768, 59738, 59720, 59725, 59705, 59711, 59701, 59743, 59744, 59768, 59749};

            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ Object then(Task task) {
                int i7 = 2 % 2;
                int i8 = TuitionPaymentFragmentbindingInflater1 + 55;
                b = i8 % 128;
                int i9 = i8 % 2;
                FetchPhotoResponse fetchPhotoResponseNewInstance = FetchPhotoResponse.newInstance(((zzkc) task.getResult()).zza);
                int i10 = b + 81;
                TuitionPaymentFragmentbindingInflater1 = i10 % 128;
                int i11 = i10 % 2;
                return fetchPhotoResponseNewInstance;
            }

            private static void a(char[] cArr, int i7, Object[] objArr) throws Throwable {
                int i8 = 2 % 2;
                getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
                getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7;
                int length = cArr.length;
                long[] jArr = new long[length];
                getrealtimecapturelatency.b = 0;
                while (getrealtimecapturelatency.b < cArr.length) {
                    int i9 = $11 + 27;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    int i11 = getrealtimecapturelatency.b;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 19473), 2624 - (ViewConfiguration.getFadingEdgeLength() >> 16), 13 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i11] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ 9053247990562531611L);
                        Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 39422), 482 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                        int i12 = $11 + 81;
                        $10 = i12 % 128;
                        int i13 = i12 % 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr2 = new char[length];
                getrealtimecapturelatency.b = 0;
                int i14 = $10 + 93;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                while (getrealtimecapturelatency.b < cArr.length) {
                    int i16 = $10 + 123;
                    $11 = i16 % 128;
                    int i17 = i16 % 2;
                    cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                    try {
                        Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39422 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 481 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.indexOf("", "", 0, 0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                objArr[0] = new String(cArr2);
            }

            private static void c(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
                int i7;
                char[] cArr;
                int i8 = 2 % 2;
                setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
                int i9 = 0;
                int i10 = iArr[0];
                int i11 = 1;
                int i12 = iArr[1];
                int i13 = iArr[2];
                int i14 = iArr[3];
                char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i15 = 0;
                    while (i15 < length) {
                        try {
                            Object[] objArr2 = new Object[i11];
                            objArr2[i9] = Integer.valueOf(cArr2[i15]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b2 = (byte) i11;
                                byte b3 = (byte) (b2 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.indexOf("", "", i9), 1270 - (ViewConfiguration.getFadingEdgeLength() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 18, 407021364, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            cArr3[i15] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                            i15++;
                            i9 = 0;
                            i11 = 1;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    int i16 = $10 + 85;
                    $11 = i16 % 128;
                    int i17 = i16 % 2;
                    cArr2 = cArr3;
                }
                char[] cArr4 = new char[i12];
                System.arraycopy(cArr2, i10, cArr4, 0, i12);
                if (bArr != null) {
                    int i18 = $11 + 33;
                    $10 = i18 % 128;
                    int i19 = i18 % 2;
                    char[] cArr5 = new char[i12];
                    setvideostabilizationmode.b = 0;
                    char c = 0;
                    while (setvideostabilizationmode.b < i12) {
                        if (bArr[setvideostabilizationmode.b] == 1) {
                            int i20 = setvideostabilizationmode.b;
                            Object[] objArr3 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3225, ((Process.getThreadPriority(0) + 20) >> 6) + 13, 2133916302, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[i20] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        } else {
                            int i21 = setvideostabilizationmode.b;
                            Object[] objArr4 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b6 = (byte) 2;
                                byte b7 = (byte) (b6 - 2);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (29944 - Gravity.getAbsoluteGravity(0, 0)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1755, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 22, 387247676, false, $$c(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[i21] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                        }
                        c = cArr5[setvideostabilizationmode.b];
                        Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b8 = (byte) 0;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 41241), View.combineMeasuredStates(0, 0) + 1705, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 21, -1434471773, false, $$c((byte) (-$$a[3]), b8, b8), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    }
                    cArr4 = cArr5;
                }
                if (i14 > 0) {
                    char[] cArr6 = new char[i12];
                    System.arraycopy(cArr4, 0, cArr6, 0, i12);
                    int i22 = i12 - i14;
                    System.arraycopy(cArr6, 0, cArr4, i22, i14);
                    System.arraycopy(cArr6, i14, cArr4, 0, i22);
                }
                if (z) {
                    int i23 = $10 + 5;
                    $11 = i23 % 128;
                    if (i23 % 2 == 0) {
                        cArr = new char[i12];
                        i7 = 1;
                        setvideostabilizationmode.b = 1;
                    } else {
                        i7 = 1;
                        cArr = new char[i12];
                        setvideostabilizationmode.b = 0;
                    }
                    while (setvideostabilizationmode.b < i12) {
                        cArr[setvideostabilizationmode.b] = cArr4[(i12 - setvideostabilizationmode.b) - i7];
                        setvideostabilizationmode.b += i7;
                        i7 = 1;
                    }
                    int i24 = $10 + 67;
                    $11 = i24 % 128;
                    int i25 = i24 % 2;
                    cArr4 = cArr;
                }
                if (i13 > 0) {
                    int i26 = 0;
                    while (true) {
                        setvideostabilizationmode.b = i26;
                        if (setvideostabilizationmode.b >= i12) {
                            break;
                        }
                        cArr4[setvideostabilizationmode.b] = (char) (cArr4[setvideostabilizationmode.b] - iArr[2]);
                        i26 = setvideostabilizationmode.b + 1;
                    }
                }
                objArr[0] = new String(cArr4);
                int i27 = $11 + 117;
                $10 = i27 % 128;
                int i28 = i27 % 2;
            }

            /* JADX WARN: Type inference failed for: r6v0 */
            /* JADX WARN: Type inference failed for: r6v61 */
            public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context, int i7, int i8) {
                int i9;
                int i10;
                int i11;
                int i12;
                Object[] objArr;
                char[] cArr;
                int tapTimeout;
                int i13;
                Class<?> cls;
                Class<?>[] clsArr;
                Object obj2;
                char[] cArr2;
                int scrollDefaultDelay;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i14;
                int i15;
                Object[] objArr2;
                Method method;
                int iMyTid;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i16;
                int i17;
                Object[] objArr3;
                Method method2;
                int i18 = 2;
                int i19 = 2 % 2;
                int i20 = 0;
                int i21 = 1;
                if (context != null) {
                    try {
                        char[] cArr3 = {12099, 27845, 43051, 58848, 8514, 32467, 47664, 63394, 13105, 28807, 35918, 51645, 1505, 16749, 40687, 55874, 6044, 21364, 37115, 11280, 27058, 42243, 57984, 15890, 31329, 47095, 62258, 12522, 19465, 35306, 50457};
                        int iMyTid2 = Process.myTid() >> 22;
                        int i22 = iMyTid2 * 714;
                        int i23 = TuitionPaymentFragmentbindingInflater1;
                        int i24 = i23 + 59;
                        b = i24 % 128;
                        if (i24 % 2 != 0) {
                            i9 = i22 << 16579;
                            i10 = (~iMyTid2) | (~i7);
                        } else {
                            i9 = i22 - 12311192;
                            int i25 = ~iMyTid2;
                            int i26 = ~i7;
                            i10 = (i25 & i26) | (i25 ^ i26);
                        }
                        int i27 = ~i10;
                        int i28 = ~iMyTid2;
                        int i29 = ~((i28 & 17291) | (i28 ^ 17291));
                        int i30 = (i27 & i29) | (i27 ^ i29);
                        int i31 = (i23 & 41) + (i23 | 41);
                        int i32 = i31 % 128;
                        b = i32;
                        if (i31 % 2 != 0) {
                            int i33 = ((-17292) ^ iMyTid2) | ((-17292) & iMyTid2);
                            int i34 = ~((i33 ^ i7) | (i33 & i7));
                            i11 = i9 >>> ((-713) * ((i30 ^ i34) | (i30 & i34)));
                        } else {
                            int i35 = ((-17292) ^ iMyTid2) | ((-17292) & iMyTid2);
                            int i36 = ~((i35 ^ i7) | (i35 & i7));
                            int i37 = (-713) * ((i30 ^ i36) | (i30 & i36));
                            i11 = (i9 | i37) + (i9 & i37);
                        }
                        int i38 = i32 + 35;
                        TuitionPaymentFragmentbindingInflater1 = i38 % 128;
                        if (i38 % 2 == 0) {
                            int i39 = -(-(1426 * (~((iMyTid2 & (-17292)) | ((-17292) ^ iMyTid2) | i7))));
                            i12 = ((i11 | i39) << 1) - (i39 ^ i11);
                        } else {
                            int i40 = (iMyTid2 & (-17292)) | ((-17292) ^ iMyTid2);
                            i12 = (i11 - (~(-(-(1426 * (~((i40 & i7) | (i40 ^ i7)))))))) - 1;
                        }
                        int i41 = i32 + 59;
                        TuitionPaymentFragmentbindingInflater1 = i41 % 128;
                        int i42 = i41 % 2;
                        int i43 = ~i7;
                        int i44 = -(-(713 * (~((i43 & (-17292)) | ((-17292) ^ i43)))));
                        int i45 = (i12 ^ i44) + ((i44 & i12) << 1);
                        Object[] objArr4 = new Object[1];
                        a(cArr3, i45, objArr4);
                        String str = (String) objArr4[0];
                        int i46 = TuitionPaymentFragmentbindingInflater1;
                        int i47 = ((i46 | 65) << 1) - (i46 ^ 65);
                        int i48 = i47 % 128;
                        b = i48;
                        int i49 = i47 % 2;
                        int i50 = i48 + 105;
                        TuitionPaymentFragmentbindingInflater1 = i50 % 128;
                        try {
                            if (i50 % 2 == 0) {
                                objArr = new Object[0];
                                objArr[1] = str;
                                cArr = new char[]{12138, 61222, 45048, 28596, 11876, 61005, 44761, 28308, 11611, 60682, 44468, 27748, 11296, 60642, 44236, 27464, 11013, 60355, 43926, 27243, 10996, 60134, 43306, 26961, 10630, 59831, 43011, 26701, 10484, 59227, 42784, 26608, 10126, 58948, 42503, 26309, 9885, 58671};
                                tapTimeout = ViewConfiguration.getTapTimeout();
                                i13 = 124;
                            } else {
                                objArr = new Object[]{str};
                                cArr = new char[]{12138, 61222, 45048, 28596, 11876, 61005, 44761, 28308, 11611, 60682, 44468, 27748, 11296, 60642, 44236, 27464, 11013, 60355, 43926, 27243, 10996, 60134, 43306, 26961, 10630, 59831, 43011, 26701, 10484, 59227, 42784, 26608, 10126, 58948, 42503, 26309, 9885, 58671};
                                tapTimeout = ViewConfiguration.getTapTimeout();
                                i13 = 16;
                            }
                            int i51 = tapTimeout >> i13;
                            int i52 = -(-(i51 * (-963)));
                            int i53 = ((i52 ^ (-964)) + ((i52 & (-964)) << 1)) - (-47500195);
                            int i54 = ~i51;
                            int i55 = ~(((-49224) ^ i7) | ((-49224) & i7));
                            int i56 = ((i54 ^ i55) | (i55 & i54)) * (-964);
                            int i57 = (i53 ^ i56) + ((i56 & i53) << 1);
                            int i58 = ~i7;
                            int i59 = ~(((-49224) ^ i58) | ((-49224) & i58));
                            int i60 = TuitionPaymentFragmentbindingInflater1;
                            int i61 = (i60 & 119) + (i60 | 119);
                            b = i61 % 128;
                            int i62 = i61 % 2;
                            int i63 = ~(((-49224) ^ i51) | (i51 & (-49224)));
                            int i64 = ((i63 & i59) | (i59 ^ i63)) * (-964);
                            int i65 = ((i57 | i64) << 1) - (i64 ^ i57);
                            if (i62 != 0) {
                                Object[] objArr5 = new Object[1];
                                a(cArr, i65, objArr5);
                                cls = Class.forName((String) objArr5[0]);
                                clsArr = new Class[0];
                            } else {
                                Object[] objArr6 = new Object[1];
                                a(cArr, i65, objArr6);
                                cls = Class.forName((String) objArr6[0]);
                                clsArr = new Class[1];
                            }
                            clsArr[0] = String.class;
                            Object objNewInstance = cls.getDeclaredConstructor(clsArr).newInstance(objArr);
                            char[] cArr4 = {12099, 50496, 64431, 36900, 34520, 47934, 20947, 17962, 31878, 4353, 1936, 15408, 53941, 51005, 65018, 37392, 34974, 48496, 21387, 18473, 32416, 4915, 2513, 15954, 54492, 51477, 65526, 37962, 35534, 48988, 21953};
                            int iMyPid = Process.myPid();
                            int i66 = TuitionPaymentFragmentbindingInflater1 + 19;
                            b = i66 % 128;
                            if (i66 % 2 != 0) {
                                int i67 = 60029 % (iMyPid << 22);
                                Object[] objArr7 = new Object[1];
                                a(cArr4, i67, objArr7);
                                obj2 = objArr7[0];
                            } else {
                                int i68 = iMyPid >> 22;
                                int i69 = (i68 & 60029) + (i68 | 60029);
                                Object[] objArr8 = new Object[1];
                                a(cArr4, i69, objArr8);
                                obj2 = objArr8[0];
                            }
                            try {
                                int i70 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                int i71 = ((i70 | 49224) << 1) - (i70 ^ 49224);
                                Object[] objArr9 = new Object[1];
                                a(new char[]{12138, 61222, 45048, 28596, 11876, 61005, 44761, 28308, 11611, 60682, 44468, 27748, 11296, 60642, 44236, 27464, 11013, 60355, 43926, 27243, 10996, 60134, 43306, 26961, 10630, 59831, 43011, 26701, 10484, 59227, 42784, 26608, 10126, 58948, 42503, 26309, 9885, 58671}, i71, objArr9);
                                Object objNewInstance2 = Class.forName((String) objArr9[0]).getDeclaredConstructor(String.class).newInstance((String) obj2);
                                int i72 = TuitionPaymentFragmentbindingInflater1;
                                int i73 = ((i72 | 21) << 1) - (i72 ^ 21);
                                b = i73 % 128;
                                try {
                                    if (i73 % 2 != 0) {
                                        cArr2 = new char[]{12129, 47425, 826, 60927, 30675, 49538, 43646, 13415, 40475, 26824, 62136, 23409, 9553, 36621, 6630, 58351, 19891, 54896, 40992, 2569, 38089, 32419, 51070};
                                        scrollDefaultDelay = ViewConfiguration.getScrollDefaultDelay() / 122;
                                        iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = zzpr.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                        i14 = 319 >> scrollDefaultDelay;
                                    } else {
                                        cArr2 = new char[]{12129, 47425, 826, 60927, 30675, 49538, 43646, 13415, 40475, 26824, 62136, 23409, 9553, 36621, 6630, 58351, 19891, 54896, 40992, 2569, 38089, 32419, 51070};
                                        scrollDefaultDelay = ViewConfiguration.getScrollDefaultDelay() >> 16;
                                        iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = zzpr.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                        i14 = scrollDefaultDelay * 319;
                                    }
                                    int i74 = i14 - 12187699;
                                    int i75 = ~scrollDefaultDelay;
                                    int i76 = ~((i75 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i75 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                                    int i77 = -(-((((-38448) ^ i76) | ((-38448) & i76)) * (-318)));
                                    int i78 = (i74 ^ i77) + ((i77 & i74) << 1);
                                    int i79 = ~(((-38448) & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | ((-38448) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                                    int i80 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    int i81 = (i80 ^ scrollDefaultDelay) | (i80 & scrollDefaultDelay);
                                    int i82 = ~((i81 ^ 38447) | (i81 & 38447));
                                    int i83 = ((i79 ^ i82) | (i82 & i79)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                                    int i84 = ((i78 | i83) << 1) - (i78 ^ i83);
                                    int i85 = ((-38448) ^ i80) | ((-38448) & i80);
                                    int i86 = b;
                                    int i87 = ((i86 | 51) << 1) - (i86 ^ 51);
                                    TuitionPaymentFragmentbindingInflater1 = i87 % 128;
                                    int i88 = i87 % 2;
                                    int i89 = ~((i85 ^ scrollDefaultDelay) | (i85 & scrollDefaultDelay));
                                    int i90 = (scrollDefaultDelay ^ 38447) | (scrollDefaultDelay & 38447);
                                    int i91 = ~((i90 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i90 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                                    int i92 = -(-(TypedValues.AttributesType.TYPE_PIVOT_TARGET * ((i89 & i91) | (i89 ^ i91))));
                                    int i93 = (i84 ^ i92) + ((i92 & i84) << 1);
                                    Object[] objArr10 = new Object[1];
                                    a(cArr2, i93, objArr10);
                                    Class<?> cls2 = Class.forName((String) objArr10[0]);
                                    char[] cArr5 = {12135, 14160, 7966, 26575, 20405, 22122, 48725, 34322, 61135, 63160, 56671, 9510, 3346, 5584, 32129, 17534, 44066};
                                    int i94 = TuitionPaymentFragmentbindingInflater1 + 125;
                                    b = i94 % 128;
                                    int i95 = i94 % 2;
                                    int iAlpha = Color.alpha(0);
                                    int i96 = iAlpha * (-433);
                                    int i97 = (i96 ^ (-1338552)) + ((i96 & (-1338552)) << 1);
                                    int i98 = ~iAlpha;
                                    int i99 = ~((i98 & i58) | (i98 ^ i58));
                                    int i100 = ~(((-6198) & i7) | ((-6198) ^ i7));
                                    int i101 = ((i99 & i100) | (i99 ^ i100)) * 217;
                                    int i102 = (i97 ^ i101) + ((i101 & i97) << 1);
                                    int i103 = ~iAlpha;
                                    int i104 = ~((i103 ^ (-6198)) | (i103 & (-6198)));
                                    int i105 = ~(i103 | i7);
                                    int i106 = i102 + (((i105 & i104) | (i104 ^ i105)) * 217);
                                    int i107 = ~((-6198) | i58);
                                    int i108 = (i106 - (~(-(-(((iAlpha & i107) | (iAlpha ^ i107)) * 217))))) - 1;
                                    Object[] objArr11 = new Object[1];
                                    a(cArr5, i108, objArr11);
                                    Object objInvoke = cls2.getMethod((String) objArr11[0], null).invoke(context, null);
                                    try {
                                        int i109 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                        int i110 = i109 * (-391);
                                        int i111 = ((i110 | (-7497360)) << 1) - (i110 ^ (-7497360));
                                        int i112 = -(-(((~(((-38449) & i109) | ((-38449) ^ i109))) | (~(i7 | 38448))) * (-196)));
                                        int i113 = (((i111 ^ i112) + ((i112 & i111) << 1)) - (~(-(-(((i109 ^ 38448) | (i109 & 38448)) * 392))))) - 1;
                                        int i114 = ~i109;
                                        int i115 = -(-(((~((i114 & (-38449)) | (i114 ^ (-38449)))) | (~((i7 ^ 38448) | (38448 & i7)))) * 196));
                                        int i116 = ((i113 | i115) << 1) - (i115 ^ i113);
                                        Object[] objArr12 = new Object[1];
                                        a(new char[]{12129, 47425, 826, 60927, 30675, 49538, 43646, 13415, 40475, 26824, 62136, 23409, 9553, 36621, 6630, 58351, 19891, 54896, 40992, 2569, 38089, 32419, 51070}, i116, objArr12);
                                        Class<?> cls3 = Class.forName((String) objArr12[0]);
                                        Object[] objArr13 = new Object[1];
                                        c(new byte[]{0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0}, new int[]{0, 14, 121, 8}, true, objArr13);
                                        Object objInvoke2 = cls3.getMethod((String) objArr13[0], null).invoke(context, null);
                                        int i117 = TuitionPaymentFragmentbindingInflater1;
                                        int i118 = (i117 ^ 45) + ((i117 & 45) << 1);
                                        b = i118 % 128;
                                        int i119 = i118 % 2;
                                        try {
                                            Object[] objArr14 = new Object[2];
                                            objArr14[1] = 64;
                                            int i120 = TuitionPaymentFragmentbindingInflater1 + 51;
                                            b = i120 % 128;
                                            int i121 = i120 % 2;
                                            objArr14[0] = objInvoke2;
                                            int i122 = -(-Color.red(0));
                                            int i123 = (i122 & 30367) + (i122 | 30367);
                                            Object[] objArr15 = new Object[1];
                                            a(new char[]{12129, 23025, 49754, 19631, 62739, 32370, 59614, 4471, 39835, 1272, 36184, 14241, 40977, 10621, 21446, 56447, 18048, 53218, 30720, 58013, 27405, 37992, 7873, 34600, 12687, 47842, 9067, 44452, 54794, 24418, 51653, 29220, 64658}, i123, objArr15);
                                            Class<?> cls4 = Class.forName((String) objArr15[0]);
                                            int i124 = -(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                            int i125 = (i124 & 61909) + (i124 | 61909);
                                            Object[] objArr16 = new Object[1];
                                            a(new char[]{12135, 57008, 52446, 64047, 59445, 38474, 34197, 46002, 41423, 44824, 23835, 19273, 31386, 26814}, i125, objArr16);
                                            String str2 = (String) objArr16[0];
                                            int i126 = b + 29;
                                            TuitionPaymentFragmentbindingInflater1 = i126 % 128;
                                            Object objInvoke3 = (i126 % 2 == 0 ? cls4.getMethod(str2, String.class, Integer.TYPE) : cls4.getMethod(str2, String.class, Integer.TYPE)).invoke(objInvoke, objArr14);
                                            int i127 = 5;
                                            Object[] objArr17 = new Object[1];
                                            c(new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1}, new int[]{14, 30, 0, 5}, true, objArr17);
                                            Class<?> cls5 = Class.forName((String) objArr17[0]);
                                            Object[] objArr18 = new Object[1];
                                            c(new byte[]{0, 0, 0, 1, 1, 1, 1, 1, 1, 0}, new int[]{44, 10, 91, 0}, false, objArr18);
                                            Object[] objArr19 = (Object[]) cls5.getField((String) objArr18[0]).get(objInvoke3);
                                            int i128 = b;
                                            int i129 = (i128 ^ 25) + ((i128 & 25) << 1);
                                            TuitionPaymentFragmentbindingInflater1 = i129 % 128;
                                            int i130 = i129 % 2;
                                            int length = objArr19.length;
                                            int i131 = 0;
                                            while (i131 < length) {
                                                Object obj3 = objArr19[i131];
                                                byte[] bArr = new byte[i127];
                                                // fill-array-data instruction
                                                bArr[0] = 0;
                                                bArr[1] = 0;
                                                bArr[2] = 1;
                                                bArr[3] = 1;
                                                bArr[4] = 1;
                                                Object[] objArr20 = new Object[i21];
                                                c(bArr, new int[]{54, i127, i20, i20}, i20, objArr20);
                                                String str3 = (String) objArr20[i20];
                                                int i132 = TuitionPaymentFragmentbindingInflater1;
                                                int i133 = ((i132 | 125) << i21) - (i132 ^ 125);
                                                b = i133 % 128;
                                                int i134 = i133 % i18;
                                                try {
                                                    Object[] objArr21 = new Object[i21];
                                                    c(new byte[]{0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1}, new int[]{59, 37, i20, i20}, i20, objArr21);
                                                    Class<?> cls6 = Class.forName((String) objArr21[i20]);
                                                    Object[] objArr22 = new Object[i21];
                                                    a(new char[]{12135, 18534, 57714, 6720, 45922, 11388, 17766, 65140, 6006, 45176, 10619}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 26371, objArr22);
                                                    String str4 = (String) objArr22[i20];
                                                    Class<?>[] clsArr2 = new Class[i21];
                                                    clsArr2[i20] = String.class;
                                                    Object objInvoke4 = cls6.getMethod(str4, clsArr2).invoke(null, str3);
                                                    try {
                                                        Object[] objArr23 = new Object[i21];
                                                        a(new char[]{12129, 9713, 14938, 12463, 1299, 6770, 4318, 25975, 31643, 28920, 17752, 23457, 20497, 42365, 48070, 45183, 34432, 39906, 36864, 59038, 64261, 61548, 50884, 56104, 53660, 9970, 15188, 12704}, 2720 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr23);
                                                        Class<?> cls7 = Class.forName((String) objArr23[i20]);
                                                        int i135 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                        int i136 = (i135 ^ 9404) + ((i135 & 9404) << i21);
                                                        Object[] objArr24 = new Object[i21];
                                                        a(new char[]{12148, 3028, 26164, 16712, 48536, 39106, 62243, 11887, 2730, 26098, 16439}, i136, objArr24);
                                                        try {
                                                            Object[] objArr25 = {new ByteArrayInputStream((byte[]) cls7.getMethod((String) objArr24[0], null).invoke(obj3, null))};
                                                            Object[] objArr26 = new Object[i21];
                                                            c(new byte[]{0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1}, new int[]{59, 37, 0, 0}, false, objArr26);
                                                            Class<?> cls8 = Class.forName((String) objArr26[0]);
                                                            Object[] objArr27 = new Object[i21];
                                                            c(new byte[]{1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1}, new int[]{96, 19, 0, 0}, false, objArr27);
                                                            String str5 = (String) objArr27[0];
                                                            Class<?>[] clsArr3 = new Class[i21];
                                                            clsArr3[0] = InputStream.class;
                                                            Method method3 = cls8.getMethod(str5, clsArr3);
                                                            int i137 = TuitionPaymentFragmentbindingInflater1 + 87;
                                                            b = i137 % 128;
                                                            int i138 = i137 % 2;
                                                            Object objInvoke5 = method3.invoke(objInvoke4, objArr25);
                                                            try {
                                                                Object[] objArr28 = new Object[i21];
                                                                c(new byte[]{0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1}, new int[]{115, 34, 0, 6}, false, objArr28);
                                                                Class<?> cls9 = Class.forName((String) objArr28[0]);
                                                                char[] cArr6 = {12135, 25318, 46194, 51162, 6521, 44269, 65144, 12784, 17275, 38639, 10310, 31636, 36116, 49303, 4730, 42463, 63321, 2781, 23637, 61392, 8524, 29918, 34350};
                                                                int iKeyCodeFromString = KeyEvent.keyCodeFromString("");
                                                                int i139 = b + 19;
                                                                int i140 = i139 % 128;
                                                                TuitionPaymentFragmentbindingInflater1 = i140;
                                                                if (i139 % 2 == 0) {
                                                                    i15 = (881 >>> iKeyCodeFromString) + 7048;
                                                                } else {
                                                                    int i141 = iKeyCodeFromString * 881;
                                                                    i15 = (i141 ^ 17481683) + ((i141 & 17481683) << i21);
                                                                }
                                                                int i142 = ~iKeyCodeFromString;
                                                                int i143 = (~((i142 & (-19844)) | (i142 ^ (-19844)))) | (~((~iKeyCodeFromString) | i7));
                                                                int i144 = ~(((-19844) ^ i7) | ((-19844) & i7));
                                                                int i145 = i15 + ((-880) * ((i143 ^ i144) | (i143 & i144)));
                                                                int i146 = ~iKeyCodeFromString;
                                                                int i147 = ~((i146 & i58) | (i146 ^ i58));
                                                                int i148 = (i147 & 19843) | (i147 ^ 19843);
                                                                int i149 = ~((iKeyCodeFromString ^ i7) | (iKeyCodeFromString & i7));
                                                                int i150 = (i145 - (~(((i148 ^ i149) | (i148 & i149)) * (-880)))) - 1;
                                                                int i151 = ((i140 | 3) << 1) - (i140 ^ 3);
                                                                b = i151 % 128;
                                                                if (i151 % 2 != 0) {
                                                                    int i152 = i150 << (880 >> (~(iKeyCodeFromString | i7)));
                                                                    Object[] objArr29 = new Object[1];
                                                                    a(cArr6, i152, objArr29);
                                                                    method = cls9.getMethod((String) objArr29[0], null);
                                                                    objArr2 = null;
                                                                } else {
                                                                    int i153 = i150 + (i149 * 880);
                                                                    Object[] objArr30 = new Object[1];
                                                                    a(cArr6, i153, objArr30);
                                                                    objArr2 = null;
                                                                    method = cls9.getMethod((String) objArr30[0], null);
                                                                }
                                                                if (!objNewInstance.equals(method.invoke(objInvoke5, objArr2))) {
                                                                    int i154 = TuitionPaymentFragmentbindingInflater1;
                                                                    int i155 = (i154 ^ 33) + ((i154 & 33) << 1);
                                                                    b = i155 % 128;
                                                                    int i156 = i155 % 2;
                                                                    try {
                                                                        Object[] objArr31 = new Object[1];
                                                                        c(new byte[]{0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1}, new int[]{115, 34, 0, 6}, false, objArr31);
                                                                        Class<?> cls10 = Class.forName((String) objArr31[0]);
                                                                        char[] cArr7 = {12135, 25318, 46194, 51162, 6521, 44269, 65144, 12784, 17275, 38639, 10310, 31636, 36116, 49303, 4730, 42463, 63321, 2781, 23637, 61392, 8524, 29918, 34350};
                                                                        int i157 = TuitionPaymentFragmentbindingInflater1 + 49;
                                                                        b = i157 % 128;
                                                                        if (i157 % 2 != 0) {
                                                                            iMyTid = Process.myTid() << 76;
                                                                            iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzpr.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                        } else {
                                                                            iMyTid = Process.myTid() >> 22;
                                                                            iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = zzpr.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                                        }
                                                                        int i158 = TuitionPaymentFragmentbindingInflater1;
                                                                        int i159 = (i158 ^ 83) + ((i158 & 83) << 1);
                                                                        b = i159 % 128;
                                                                        int i160 = i159 % 2;
                                                                        int i161 = (iMyTid * (-391)) - 3869385;
                                                                        int i162 = i158 + 79;
                                                                        int i163 = i162 % 128;
                                                                        b = i163;
                                                                        if (i162 % 2 != 0) {
                                                                            i16 = ~((-19844) | iMyTid);
                                                                            i17 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ 19843) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 & 19843);
                                                                            int i164 = 6 / 0;
                                                                        } else {
                                                                            i16 = ~(((-19844) & iMyTid) | ((-19844) ^ iMyTid));
                                                                            i17 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ 19843) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 & 19843);
                                                                        }
                                                                        int i165 = ~i17;
                                                                        int i166 = -(-((-196) * ((i165 & i16) | (i16 ^ i165))));
                                                                        int i167 = ((i161 | i166) << 1) - (i166 ^ i161);
                                                                        int i168 = (iMyTid | 19843) * 392;
                                                                        int i169 = ((i167 | i168) << 1) - (i168 ^ i167);
                                                                        int i170 = (i163 & 37) + (i163 | 37);
                                                                        TuitionPaymentFragmentbindingInflater1 = i170 % 128;
                                                                        if (i170 % 2 == 0) {
                                                                            Object obj4 = null;
                                                                            obj4.hashCode();
                                                                            throw null;
                                                                        }
                                                                        int i171 = ~iMyTid;
                                                                        int i172 = ~((i171 & (-19844)) | (i171 ^ (-19844)));
                                                                        int i173 = (i163 ^ 115) + ((i163 & 115) << 1);
                                                                        TuitionPaymentFragmentbindingInflater1 = i173 % 128;
                                                                        if (i173 % 2 == 0) {
                                                                            int i174 = i169 >>> ((i172 | (~((iTuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ 19843) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 & 19843)))) + 196);
                                                                            Object[] objArr32 = new Object[1];
                                                                            a(cArr7, i174, objArr32);
                                                                            method2 = cls10.getMethod((String) objArr32[0], null);
                                                                            objArr3 = null;
                                                                        } else {
                                                                            int i175 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ 19843) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 & 19843));
                                                                            int i176 = -(-(((i172 & i175) | (i172 ^ i175)) * 196));
                                                                            int i177 = (i169 ^ i176) + ((i176 & i169) << 1);
                                                                            Object[] objArr33 = new Object[1];
                                                                            a(cArr7, i177, objArr33);
                                                                            objArr3 = null;
                                                                            method2 = cls10.getMethod((String) objArr33[0], null);
                                                                        }
                                                                        if (!objNewInstance2.equals(method2.invoke(objInvoke5, objArr3))) {
                                                                            i131 = (((i131 | (-22)) << 1) - (i131 ^ (-22))) + 23;
                                                                            objArr19 = objArr19;
                                                                            length = length;
                                                                            i18 = 2;
                                                                            i20 = 0;
                                                                            i21 = 1;
                                                                            i127 = 5;
                                                                        }
                                                                    } catch (Throwable th) {
                                                                        Throwable cause = th.getCause();
                                                                        if (cause != null) {
                                                                            throw cause;
                                                                        }
                                                                        throw th;
                                                                    }
                                                                }
                                                                Object[] objArr34 = {new int[]{i7}, new int[1], new int[]{(~(i7 & 1)) & (i7 | 1)}, null};
                                                                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                                                                int i178 = ~iUptimeMillis;
                                                                int i179 = 2085210571 + (((~((-900305118) | i178)) | (~(859994888 | iUptimeMillis))) * 217) + (((~(iUptimeMillis | (-900305118))) | 78217429) * 217) + (((~(859994888 | i178)) | 900305117) * 217);
                                                                int i180 = (i179 ^ 16) + ((16 & i179) << 1);
                                                                int i181 = (i180 * (-496)) + (i8 * (-496));
                                                                int i182 = ~i180;
                                                                int i183 = (~((~i8) | i182)) * 497;
                                                                int i184 = (i181 ^ i183) + ((i181 & i183) << 1);
                                                                int i185 = ~i8;
                                                                int i186 = ~((i182 ^ i185) | (i182 & i185) | i7);
                                                                int i187 = (i185 ^ i58) | (i185 & i58);
                                                                int i188 = ~((i187 & i180) | (i187 ^ i180));
                                                                int i189 = -(-(((i186 & i188) | (i186 ^ i188)) * 497));
                                                                int i190 = (i184 ^ i189) + ((i189 & i184) << 1);
                                                                int i191 = ~i180;
                                                                int i192 = ~((i58 & i191) | (i191 ^ i58));
                                                                int i193 = ~((i182 & i8) | (i182 ^ i8));
                                                                int i194 = ((~((i180 & i185) | (i185 ^ i180) | i7)) | (i192 & i193) | (i192 ^ i193)) * 497;
                                                                int i195 = (i190 ^ i194) + ((i194 & i190) << 1);
                                                                int i196 = i195 << 13;
                                                                int i197 = (i196 & (~i195)) | ((~i196) & i195);
                                                                int i198 = i197 >>> 17;
                                                                int i199 = (i197 | i198) & (~(i197 & i198));
                                                                int i200 = i199 << 5;
                                                                ((int[]) objArr34[1])[0] = (i199 | i200) & (~(i199 & i200));
                                                                return objArr34;
                                                            } catch (Throwable th2) {
                                                                Throwable cause2 = th2.getCause();
                                                                if (cause2 != null) {
                                                                    throw cause2;
                                                                }
                                                                throw th2;
                                                            }
                                                        } catch (Throwable th3) {
                                                            Throwable cause3 = th3.getCause();
                                                            if (cause3 != null) {
                                                                throw cause3;
                                                            }
                                                            throw th3;
                                                        }
                                                    } catch (Throwable th4) {
                                                        Throwable cause4 = th4.getCause();
                                                        if (cause4 != null) {
                                                            throw cause4;
                                                        }
                                                        throw th4;
                                                    }
                                                } catch (Throwable th5) {
                                                    Throwable cause5 = th5.getCause();
                                                    if (cause5 != null) {
                                                        throw cause5;
                                                    }
                                                    throw th5;
                                                }
                                            }
                                        } catch (Throwable th6) {
                                            Throwable cause6 = th6.getCause();
                                            if (cause6 != null) {
                                                throw cause6;
                                            }
                                            throw th6;
                                        }
                                    } catch (Throwable th7) {
                                        Throwable cause7 = th7.getCause();
                                        if (cause7 != null) {
                                            throw cause7;
                                        }
                                        throw th7;
                                    }
                                } catch (Throwable th8) {
                                    Throwable cause8 = th8.getCause();
                                    if (cause8 != null) {
                                        throw cause8;
                                    }
                                    throw th8;
                                }
                            } catch (Throwable th9) {
                                Throwable cause9 = th9.getCause();
                                if (cause9 != null) {
                                    throw cause9;
                                }
                                throw th9;
                            }
                        } catch (Throwable th10) {
                            Throwable cause10 = th10.getCause();
                            if (cause10 != null) {
                                throw cause10;
                            }
                            throw th10;
                        }
                    } catch (Throwable unused) {
                    }
                }
                int[] iArr = new int[1];
                Object[] objArr35 = {new int[]{i7}, iArr, new int[]{i7}, null};
                int i201 = ((~((-811597833) | i7)) * 521) + 1524544108 + (((~((~i7) | (-811597833))) | (-872152544)) * 521);
                int i202 = (i201 << 1) - i201;
                int i203 = ((i202 * (-520)) - (~(-(-(i8 * 522))))) - 1;
                int i204 = ~i202;
                int i205 = i204 | i8;
                int i206 = (~((i205 & i7) | (i205 ^ i7))) * 521;
                int i207 = (i203 & i206) + (i203 | i206);
                int i208 = ~i8;
                int i209 = (~((i208 & i202) | (i208 ^ i202))) * (-1042);
                int i210 = (i207 & i209) + (i209 | i207);
                int i211 = ~i8;
                int i212 = ~((i211 & i202) | (i211 ^ i202));
                int i213 = ~i7;
                int i214 = ~((i213 & i204) | (i204 ^ i213) | i8);
                int i215 = -(-(((i214 & i212) | (i212 ^ i214)) * 521));
                int i216 = ((i210 | i215) << 1) - (i215 ^ i210);
                int i217 = i216 << 13;
                int i218 = (i217 | i216) & (~(i216 & i217));
                int i219 = i218 >>> 17;
                int i220 = ((~i218) & i219) | ((~i219) & i218);
                int i221 = i220 << 5;
                iArr[0] = (i220 | i221) & (~(i220 & i221));
                return objArr35;
            }

            private static String $$c(short s, byte b2, byte b3) {
                int i7 = 4 - (b3 * 2);
                int i8 = b2 * 2;
                byte[] bArr = $$a;
                int i9 = s + 99;
                byte[] bArr2 = new byte[i8 + 1];
                int i10 = -1;
                if (bArr == null) {
                    i9 += i8;
                    i7++;
                }
                while (true) {
                    i10++;
                    bArr2[i10] = (byte) i9;
                    if (i10 == i8) {
                        return new String(bArr2, 0);
                    }
                    i9 += bArr[i7];
                    i7++;
                }
            }
        }).continueWith(new Continuation() { // from class: com.google.android.libraries.places.internal.zzkw
            public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -397573077;

            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ Object then(Task task) {
                return this.zza.zzf(jZzb, zzmoVar, task);
            }
        });
    }

    @Override // com.google.android.libraries.places.internal.zzfm
    public final Task zzc(FetchPlaceRequest fetchPlaceRequest, final zzmo zzmoVar) {
        int i = 2 % 2;
        if (TextUtils.isEmpty(fetchPlaceRequest.getPlaceId())) {
            return Tasks.forException(new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "Place ID must not be empty.")));
        }
        if (fetchPlaceRequest.getPlaceFields().isEmpty()) {
            Task taskForException = Tasks.forException(new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "Place Fields must not be empty.")));
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
            b = i2 % 128;
            int i3 = i2 % 2;
            return taskForException;
        }
        zzmf zzmfVar = this.zzh;
        zzkf zzkfVar = new zzkf(fetchPlaceRequest, zzmfVar.zzg(), zzmfVar.zzf(), this.zza);
        zzdy zzdyVar = this.zze;
        zzfr zzfrVar = this.zzb;
        final long jZzb = zzdyVar.zzb();
        Task taskContinueWith = zzfrVar.zza(zzkfVar, zzkg.class).continueWith(new Continuation() { // from class: com.google.android.libraries.places.internal.zzkx
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ Object then(Task task) {
                return zzlc.zzi(task);
            }
        }).continueWith(new Continuation() { // from class: com.google.android.libraries.places.internal.zzky
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ Object then(Task task) {
                return this.zza.zzg(jZzb, zzmoVar, task);
            }
        });
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
        b = i4 % 128;
        int i5 = i4 % 2;
        return taskContinueWith;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $10 + 81;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getTapTimeout() >> 16) + 19472), 2624 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 13 - TextUtils.getCapsMode("", 0, 0), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ 9053247990562531611L);
                try {
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 39422), 481 - TextUtils.getOffsetBefore("", 0), 38 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (39421 - Process.getGidForName("")), 480 - ((byte) KeyEvent.getModifierMetaStateMask()), 37 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            int i6 = $11 + 93;
            $10 = i6 % 128;
            int i7 = i6 % 2;
        }
        objArr[0] = new String(cArr2);
    }

    zzlc(zzmf zzmfVar, zzmx zzmxVar, zzfr zzfrVar, zzfx zzfxVar, zzme zzmeVar, zzdy zzdyVar, zzkd zzkdVar, zzkh zzkhVar, zzkl zzklVar, zzkp zzkpVar) {
        this.zzh = zzmfVar;
        this.zza = zzmxVar;
        this.zzb = zzfrVar;
        this.zzc = zzfxVar;
        this.zzd = zzmeVar;
        this.zze = zzdyVar;
        this.zzf = zzkhVar;
        this.zzg = zzkpVar;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 27581. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(java.lang.Class r34, int r35, int r36, int r37) {
        /*
            Method dump skipped, instruction units count: 2758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzlc.TuitionPaymentFragmentspecialinlinedviewModeldefault1(java.lang.Class, int, int, int):java.lang.Object[]");
    }
}

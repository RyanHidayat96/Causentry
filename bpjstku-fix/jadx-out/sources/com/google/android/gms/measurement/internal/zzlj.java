package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.collection.ArrayMap;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzqp;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.getCloseFuture;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import defpackage.mergeOptionValue;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzlj extends zzg {
    private static int $10 = 0;
    private static int $11 = 1;
    protected zzky zza;
    final zzx zzb;
    protected boolean zzc;
    private zzjp zzd;
    private final Set zze;
    private boolean zzf;
    private final AtomicReference zzg;
    private final Object zzh;
    private boolean zzi;
    private int zzj;
    private zzay zzk;
    private zzay zzl;
    private PriorityQueue zzm;
    private boolean zzn;
    private zzjl zzo;
    private final AtomicLong zzp;
    private long zzq;
    private zzay zzr;
    private SharedPreferences.OnSharedPreferenceChangeListener zzs;
    private zzay zzt;
    private final zzpo zzv;
    private static final byte[] $$d = {ByteCompanionObject.MAX_VALUE, 43, -39, -37, -8, -25, 39, -51, -13, -14, 4, 21, -57, -9, -11, -7, 3, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 57};
    private static final int $$e = 241;
    private static final byte[] $$a = {84, 10, 24, -102, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 29;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -8304924834189357388L;

    protected zzlj(zzic zzicVar) {
        super(zzicVar);
        this.zze = new CopyOnWriteArraySet();
        this.zzh = new Object();
        this.zzi = false;
        this.zzj = 1;
        this.zzc = true;
        this.zzv = new zzkn(this);
        this.zzg = new AtomicReference();
        this.zzo = zzjl.zza;
        this.zzq = -1L;
        this.zzp = new AtomicLong(0L);
        this.zzb = new zzx(zzicVar);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 2
            int r5 = 84 - r5
            int r6 = r6 * 52
            int r6 = 108 - r6
            int r7 = r7 * 15
            int r0 = 53 - r7
            byte[] r1 = com.google.android.gms.measurement.internal.zzlj.$$a
            byte[] r0 = new byte[r0]
            int r7 = 52 - r7
            r2 = 0
            if (r1 != 0) goto L18
            r4 = r7
            r3 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L26:
            int r3 = r3 + 1
            r4 = r1[r6]
        L2a:
            int r4 = -r4
            int r5 = r5 + r4
            int r6 = r6 + 1
            int r5 = r5 + (-11)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlj.a(int, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 19
            int r9 = 103 - r9
            int r7 = r7 * 13
            int r7 = 17 - r7
            int r8 = r8 * 39
            int r8 = r8 + 14
            byte[] r0 = com.google.android.gms.measurement.internal.zzlj.$$d
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r5 = r2
            goto L2b
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r7]
            r6 = r3
            r3 = r9
            r9 = r6
        L2b:
            int r9 = -r9
            int r3 = r3 + r9
            int r9 = r3 + (-10)
            int r7 = r7 + 1
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlj.c(byte, short, byte, java.lang.Object[]):void");
    }

    private final zzlr zzar(final zzom zzomVar) {
        try {
            URL url = new URI(zzomVar.zzc).toURL();
            final AtomicReference atomicReference = new AtomicReference();
            String strZzl = this.zzu.zzv().zzl();
            zzic zzicVar = this.zzu;
            zzgs zzgsVarZzk = zzicVar.zzaV().zzk();
            Long lValueOf = Long.valueOf(zzomVar.zza);
            zzgsVarZzk.zzd("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, zzomVar.zzc, Integer.valueOf(zzomVar.zzb.length));
            if (!TextUtils.isEmpty(zzomVar.zzg)) {
                zzicVar.zzaV().zzk().zzc("[sgtm] Uploading data from app. row_id", lValueOf, zzomVar.zzg);
            }
            HashMap map = new HashMap();
            Bundle bundle = zzomVar.zzd;
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (!TextUtils.isEmpty(string)) {
                    map.put(str, string);
                }
            }
            zzlo zzloVarZzn = zzicVar.zzn();
            byte[] bArr = zzomVar.zzb;
            zzll zzllVar = new zzll() { // from class: com.google.android.gms.measurement.internal.zzkz
                /* JADX WARN: Code duplicated, block: B:10:0x0016  */
                /* JADX WARN: Code duplicated, block: B:11:0x002e A[PHI: r11
  0x002e: PHI (r11v7 int) = (r11v1 int), (r11v0 int) binds: [B:9:0x0014, B:7:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:13:0x0064  */
                /* JADX WARN: Code duplicated, block: B:14:0x0067  */
                @Override // com.google.android.gms.measurement.internal.zzll
                public final /* synthetic */ void zza(String str2, int i, Throwable th, byte[] bArr2, Map map2) {
                    zzlr zzlrVar;
                    zzlj zzljVar = this.zza;
                    zzljVar.zzg();
                    zzom zzomVar2 = zzomVar;
                    if (i == 200 || i == 204) {
                        if (th == null) {
                            zzljVar.zzu.zzaV().zzk().zzb("[sgtm] Upload succeeded for row_id", Long.valueOf(zzomVar2.zza));
                            zzlrVar = zzlr.SUCCESS;
                        } else {
                            zzljVar.zzu.zzaV().zze().zzd("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar2.zza), Integer.valueOf(i), th);
                            if (Arrays.asList(((String) zzfy.zzt.zzb(null)).split(",")).contains(String.valueOf(i))) {
                                zzlrVar = zzlr.BACKOFF;
                            } else {
                                zzlrVar = zzlr.FAILURE;
                            }
                        }
                    } else if (i == 304) {
                        i = 304;
                        if (th == null) {
                            zzljVar.zzu.zzaV().zzk().zzb("[sgtm] Upload succeeded for row_id", Long.valueOf(zzomVar2.zza));
                            zzlrVar = zzlr.SUCCESS;
                        } else {
                            zzljVar.zzu.zzaV().zze().zzd("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar2.zza), Integer.valueOf(i), th);
                            if (Arrays.asList(((String) zzfy.zzt.zzb(null)).split(",")).contains(String.valueOf(i))) {
                                zzlrVar = zzlr.BACKOFF;
                            } else {
                                zzlrVar = zzlr.FAILURE;
                            }
                        }
                    } else {
                        zzljVar.zzu.zzaV().zze().zzd("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(zzomVar2.zza), Integer.valueOf(i), th);
                        if (Arrays.asList(((String) zzfy.zzt.zzb(null)).split(",")).contains(String.valueOf(i))) {
                            zzlrVar = zzlr.BACKOFF;
                        } else {
                            zzlrVar = zzlr.FAILURE;
                        }
                    }
                    AtomicReference atomicReference2 = atomicReference;
                    zznl zznlVarZzt = zzljVar.zzu.zzt();
                    long j = zzomVar2.zza;
                    zznlVarZzt.zzy(new zzaf(j, zzlrVar.zza(), zzomVar2.zzf));
                    zzljVar.zzu.zzaV().zzk().zzc("[sgtm] Updated status for row_id", Long.valueOf(j), zzlrVar);
                    synchronized (atomicReference2) {
                        atomicReference2.set(zzlrVar);
                        atomicReference2.notifyAll();
                    }
                }
            };
            zzloVarZzn.zzw();
            Preconditions.checkNotNull(url);
            Preconditions.checkNotNull(bArr);
            Preconditions.checkNotNull(zzllVar);
            zzloVarZzn.zzu.zzaW().zzm(new zzln(zzloVarZzn, strZzl, url, bArr, map, zzllVar));
            try {
                zzic zzicVar2 = zzicVar.zzk().zzu;
                long jCurrentTimeMillis = zzicVar2.zzaZ().currentTimeMillis();
                synchronized (atomicReference) {
                    for (long jCurrentTimeMillis2 = 60000; atomicReference.get() == null && jCurrentTimeMillis2 > 0; jCurrentTimeMillis2 = (jCurrentTimeMillis + 60000) - zzicVar2.zzaZ().currentTimeMillis()) {
                        atomicReference.wait(jCurrentTimeMillis2);
                    }
                }
            } catch (InterruptedException unused) {
                this.zzu.zzaV().zze().zza("[sgtm] Interrupted waiting for uploading batch");
            }
            return atomicReference.get() == null ? zzlr.UNKNOWN : (zzlr) atomicReference.get();
        } catch (MalformedURLException | URISyntaxException e2) {
            this.zzu.zzaV().zzb().zzd("[sgtm] Bad upload url for row_id", zzomVar.zzc, Long.valueOf(zzomVar.zza), e2);
            return zzlr.FAILURE;
        }
    }

    public final void zzB(String str, String str2, Bundle bundle) {
        Clock clockZzaZ;
        boolean z;
        boolean z2;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            clockZzaZ = this.zzu.zzaZ();
            z = false;
            z2 = false;
        } else {
            clockZzaZ = this.zzu.zzaZ();
            z = true;
            z2 = true;
        }
        zzC(str, str2, bundle, z, z2, clockZzaZ.currentTimeMillis());
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    public final void zzC(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        boolean z3;
        int i = 2 % 2;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (Objects.equals(str2, FirebaseAnalytics.Event.SCREEN_VIEW)) {
            this.zzu.zzs().zzj(bundle2, j);
            return;
        }
        if (z2) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            if (this.zzd == null || zzpp.zzZ(str2)) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            z3 = true;
        }
        zzJ(str == null ? "app" : str, str2, j, bundle2, z2, z3, z, null);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0059 A[PHI: r6
  0x0059: PHI (r6v9 android.content.SharedPreferences$Editor) = (r6v8 android.content.SharedPreferences$Editor), (r6v14 android.content.SharedPreferences$Editor) binds: [B:10:0x0057, B:7:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x006a A[PHI: r6
  0x006a: PHI (r6v11 android.content.SharedPreferences$Editor) = (r6v8 android.content.SharedPreferences$Editor), (r6v14 android.content.SharedPreferences$Editor) binds: [B:10:0x0057, B:7:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    private final void zzas(Boolean bool, boolean z) {
        SharedPreferences.Editor editorEdit;
        int i = 2 % 2;
        zzg();
        zzb();
        zzic zzicVar = this.zzu;
        zzicVar.zzaV().zzj().zzb("Setting app measurement enabled (FE)", bool);
        zzicVar.zzd().zzh(bool);
        if (z) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 69;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 != 0) {
                zzhh zzhhVarZzd = zzicVar.zzd();
                zzic zzicVar2 = zzhhVarZzd.zzu;
                zzhhVarZzd.zzg();
                editorEdit = zzhhVarZzd.zzd().edit();
                int i3 = 16 / 0;
                if (bool != null) {
                    int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                    int i5 = i4 % 2;
                    editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
                } else {
                    editorEdit.remove("measurement_enabled_from_api");
                }
            } else {
                zzhh zzhhVarZzd2 = zzicVar.zzd();
                zzic zzicVar3 = zzhhVarZzd2.zzu;
                zzhhVarZzd2.zzg();
                editorEdit = zzhhVarZzd2.zzd().edit();
                if (bool != null) {
                    int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
                    int i7 = i6 % 2;
                    editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
                } else {
                    editorEdit.remove("measurement_enabled_from_api");
                }
            }
            editorEdit.apply();
        }
        if (this.zzu.zzE() || !(bool == null || bool.booleanValue())) {
            zzat();
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0087  */
    final void zzA(zzjl zzjlVar) {
        Boolean boolValueOf;
        int i = 2 % 2;
        zzg();
        boolean z = (zzjlVar.zzo(zzjk.ANALYTICS_STORAGE) && zzjlVar.zzo(zzjk.AD_STORAGE)) || this.zzu.zzt().zzO();
        zzic zzicVar = this.zzu;
        if (z != zzicVar.zzE()) {
            zzicVar.zzD(z);
            zzhh zzhhVarZzd = this.zzu.zzd();
            zzic zzicVar2 = zzhhVarZzd.zzu;
            zzhhVarZzd.zzg();
            if (zzhhVarZzd.zzd().contains("measurement_enabled_from_api")) {
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                boolValueOf = i2 % 2 != 0 ? Boolean.valueOf(zzhhVarZzd.zzd().getBoolean("measurement_enabled_from_api", true)) : Boolean.valueOf(zzhhVarZzd.zzd().getBoolean("measurement_enabled_from_api", true));
            } else {
                boolValueOf = null;
            }
            if (!(!z)) {
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
                int i4 = i3 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4;
                if (i3 % 2 == 0) {
                    int i5 = 65 / 0;
                    if (boolValueOf != null) {
                        int i6 = i4 + 99;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
                        int i7 = i6 % 2;
                        if (!(!boolValueOf.booleanValue())) {
                        }
                    }
                } else if (boolValueOf != null) {
                    int i8 = i4 + 99;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
                    int i9 = i8 % 2;
                    if (!(!boolValueOf.booleanValue())) {
                    }
                }
                zzas(Boolean.valueOf(z), false);
            } else {
                zzas(Boolean.valueOf(z), false);
            }
        }
        int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    private final void zzat() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            zzg();
            this.zzu.zzd().zzh.zza();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        zzg();
        zzic zzicVar = this.zzu;
        String strZza = zzicVar.zzd().zzh.zza();
        if (strZza != null) {
            if ("unset".equals(strZza)) {
                zzN("app", "_npa", null, zzicVar.zzaZ().currentTimeMillis());
            } else {
                zzN("app", "_npa", Long.valueOf(true != "true".equals(strZza) ? 0L : 1L), zzicVar.zzaZ().currentTimeMillis());
            }
        }
        if (this.zzu.zzB()) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            if (this.zzc) {
                zzicVar.zzaV().zzj().zza("Recording app launch after enabling measurement for the first time (FE)");
                zzU();
                this.zzu.zzh().zza.zza();
                zzicVar.zzaW().zzj(new zzjz(this));
                return;
            }
        }
        zzicVar.zzaV().zzj().zza("Updating Scion state (FE)");
        this.zzu.zzt().zzi();
    }

    /* JADX WARN: Code duplicated, block: B:104:0x02f6 A[PHI: r9
  0x02f6: PHI (r9v13 android.os.Bundle) = (r9v12 android.os.Bundle), (r9v14 android.os.Bundle) binds: [B:103:0x02f4, B:100:0x02e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:106:0x0302  */
    /* JADX WARN: Code duplicated, block: B:107:0x0310  */
    /* JADX WARN: Code duplicated, block: B:44:0x0167  */
    public final void zzD() {
        zzod zzodVar;
        zzod zzodVar2;
        Bundle bundleZzb;
        int i;
        boolean z;
        com.google.android.gms.internal.measurement.zzkq zzkqVar;
        int i2 = 2 % 2;
        zzg();
        zzic zzicVar = this.zzu;
        zzicVar.zzaV().zzj().zza("Handle tcf update.");
        SharedPreferences sharedPreferencesZze = zzicVar.zzd().zze();
        HashMap map = new HashMap();
        zzfx zzfxVar = zzfy.zzaZ;
        if (((Boolean) zzfxVar.zzb(null)).booleanValue()) {
            int i3 = zzof.zzb;
            com.google.android.gms.internal.measurement.zzkp zzkpVar = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
            zzoe zzoeVar = zzoe.CONSENT;
            Map.Entry entryM8095m = UByte$$ExternalSyntheticBackport0.m8095m((Object) zzkpVar, (Object) zzoeVar);
            com.google.android.gms.internal.measurement.zzkp zzkpVar2 = com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
            zzoe zzoeVar2 = zzoe.FLEXIBLE_LEGITIMATE_INTEREST;
            ImmutableMap immutableMapTuitionPaymentFragmentbindingInflater1 = ImmutableMap.TuitionPaymentFragmentbindingInflater1(entryM8095m, UByte$$ExternalSyntheticBackport0.m8095m((Object) zzkpVar2, (Object) zzoeVar2), UByte$$ExternalSyntheticBackport0.m8095m((Object) com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE, (Object) zzoeVar), UByte$$ExternalSyntheticBackport0.m8095m((Object) com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS, (Object) zzoeVar), UByte$$ExternalSyntheticBackport0.m8095m((Object) com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE, (Object) zzoeVar2), UByte$$ExternalSyntheticBackport0.m8095m((Object) com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, (Object) zzoeVar2), UByte$$ExternalSyntheticBackport0.m8095m((Object) com.google.android.gms.internal.measurement.zzkp.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, (Object) zzoeVar2));
            ImmutableSet immutableSetTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ImmutableSet.TuitionPaymentFragmentspecialinlinedviewModeldefault1("CH");
            char[] cArr = new char[5];
            boolean zContains = sharedPreferencesZze.contains("IABTCF_TCString");
            int iZzb = zzof.zzb(sharedPreferencesZze, "IABTCF_CmpSdkID");
            int iZzb2 = zzof.zzb(sharedPreferencesZze, "IABTCF_PolicyVersion");
            int iZzb3 = zzof.zzb(sharedPreferencesZze, "IABTCF_gdprApplies");
            int iZzb4 = zzof.zzb(sharedPreferencesZze, "IABTCF_PurposeOneTreatment");
            int iZzb5 = zzof.zzb(sharedPreferencesZze, "IABTCF_EnableAdvertiserConsentMode");
            String strZza = zzof.zza(sharedPreferencesZze, "IABTCF_PublisherCC");
            ImmutableMap.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault1 = ImmutableMap.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            mergeOptionValue it = immutableMapTuitionPaymentFragmentbindingInflater1.asInterface().iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.measurement.zzkp zzkpVar3 = (com.google.android.gms.internal.measurement.zzkp) it.next();
                int iZza = zzkpVar3.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 28);
                sb.append("IABTCF_PublisherRestrictions");
                sb.append(iZza);
                String strZza2 = zzof.zza(sharedPreferencesZze, sb.toString());
                if (TextUtils.isEmpty(strZza2) || strZza2.length() < 755) {
                    zzkqVar = com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_UNDEFINED;
                } else {
                    int iDigit = Character.digit(strZza2.charAt(754), 10);
                    if (iDigit < 0 || iDigit > com.google.android.gms.internal.measurement.zzkq.values().length || iDigit == 0) {
                        zzkqVar = com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_NOT_ALLOWED;
                    } else if (iDigit != 1) {
                        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                        zzkqVar = (i4 % 2 == 0 ? iDigit == 2 : iDigit == 5) ? com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST : com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_UNDEFINED;
                    } else {
                        zzkqVar = com.google.android.gms.internal.measurement.zzkq.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    }
                }
                tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(zzkpVar3, zzkqVar);
            }
            ImmutableMap immutableMapB = tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault1.b();
            String strZza3 = zzof.zza(sharedPreferencesZze, "IABTCF_PurposeConsents");
            String strZza4 = zzof.zza(sharedPreferencesZze, "IABTCF_VendorConsents");
            if (TextUtils.isEmpty(strZza4)) {
                z = false;
            } else {
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                if (i5 % 2 == 0 ? strZza4.length() < 755 : strZza4.length() < 14078) {
                    z = false;
                } else if (strZza4.charAt(754) == '1') {
                    z = true;
                } else {
                    z = false;
                }
            }
            String strZza5 = zzof.zza(sharedPreferencesZze, "IABTCF_PurposeLegitimateInterests");
            String strZza6 = zzof.zza(sharedPreferencesZze, "IABTCF_VendorLegitimateInterests");
            boolean z2 = !TextUtils.isEmpty(strZza6) && strZza6.length() >= 755 && strZza6.charAt(754) == '1';
            cArr[0] = '2';
            zzodVar = new zzod(zzof.zzd(immutableMapTuitionPaymentFragmentbindingInflater1, immutableMapB, immutableSetTuitionPaymentFragmentspecialinlinedviewModeldefault1, cArr, iZzb, iZzb5, iZzb3, iZzb2, iZzb4, strZza, strZza3, strZza5, z, z2, zContains));
        } else {
            String strZza7 = zzof.zza(sharedPreferencesZze, "IABTCF_VendorConsents");
            if (!"".equals(strZza7)) {
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
                if (i6 % 2 == 0 ? strZza7.length() > 754 : strZza7.length() > 8713) {
                    map.put("GoogleConsent", String.valueOf(strZza7.charAt(754)));
                }
            }
            int iZzb6 = zzof.zzb(sharedPreferencesZze, "IABTCF_gdprApplies");
            if (iZzb6 != -1) {
                int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
                int i8 = i7 % 2;
                map.put("gdprApplies", String.valueOf(iZzb6));
            }
            int iZzb7 = zzof.zzb(sharedPreferencesZze, "IABTCF_EnableAdvertiserConsentMode");
            if (iZzb7 != -1) {
                map.put("EnableAdvertiserConsentMode", String.valueOf(iZzb7));
            }
            int iZzb8 = zzof.zzb(sharedPreferencesZze, "IABTCF_PolicyVersion");
            if (iZzb8 != -1) {
                map.put("PolicyVersion", String.valueOf(iZzb8));
            }
            String strZza8 = zzof.zza(sharedPreferencesZze, "IABTCF_PurposeConsents");
            if (!"".equals(strZza8)) {
                map.put("PurposeConsents", strZza8);
                int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
                int i10 = i9 % 2;
            }
            int iZzb9 = zzof.zzb(sharedPreferencesZze, "IABTCF_CmpSdkID");
            if (iZzb9 != -1) {
                int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
                int i12 = i11 % 2;
                map.put("CmpSdkID", String.valueOf(iZzb9));
            }
            zzodVar = new zzod(map);
        }
        zzicVar.zzaV().zzk().zzb("Tcf preferences read", zzodVar);
        if (zzicVar.zzc().zzp(null, zzfxVar)) {
            zzhh zzhhVarZzd = zzicVar.zzd();
            zzhhVarZzd.zzg();
            String string = zzhhVarZzd.zzd().getString("stored_tcf_param", "");
            HashMap map2 = new HashMap();
            if (TextUtils.isEmpty(string)) {
                zzodVar2 = new zzod(map2);
            } else {
                for (String str : string.split(";")) {
                    String[] strArrSplit = str.split("=");
                    if (strArrSplit.length >= 2 && zzof.zza.contains(strArrSplit[0])) {
                        map2.put(strArrSplit[0], strArrSplit[1]);
                    }
                }
                zzodVar2 = new zzod(map2);
            }
            if (zzicVar.zzd().zzm(zzodVar)) {
                int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i13 % 128;
                if (i13 % 2 == 0) {
                    bundleZzb = zzodVar.zzb();
                    zzicVar.zzaV().zzk().zzb("Consent generated from Tcf", bundleZzb);
                    int i14 = 39 / 0;
                    if (bundleZzb != Bundle.EMPTY) {
                        i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
                        if (i % 2 == 0) {
                            zzp(bundleZzb, 20, zzicVar.zzaZ().currentTimeMillis());
                        } else {
                            zzp(bundleZzb, -30, zzicVar.zzaZ().currentTimeMillis());
                        }
                    }
                } else {
                    bundleZzb = zzodVar.zzb();
                    zzicVar.zzaV().zzk().zzb("Consent generated from Tcf", bundleZzb);
                    if (bundleZzb != Bundle.EMPTY) {
                        i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i % 128;
                        if (i % 2 == 0) {
                            zzp(bundleZzb, 20, zzicVar.zzaZ().currentTimeMillis());
                        } else {
                            zzp(bundleZzb, -30, zzicVar.zzaZ().currentTimeMillis());
                        }
                    }
                }
                Bundle bundle = new Bundle();
                bundle.putString("_tcfm", zzodVar.zzd(zzodVar2));
                bundle.putString("_tcfd2", zzodVar.zzc());
                bundle.putString("_tcfd", zzodVar.zze());
                zzF("auto", "_tcf", bundle);
                return;
            }
        } else if (zzicVar.zzd().zzm(zzodVar)) {
            int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i15 % 128;
            int i16 = i15 % 2;
            Bundle bundleZzb2 = zzodVar.zzb();
            zzicVar.zzaV().zzk().zzb("Consent generated from Tcf", bundleZzb2);
            if (bundleZzb2 != Bundle.EMPTY) {
                zzp(bundleZzb2, -30, zzicVar.zzaZ().currentTimeMillis());
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_tcfd", zzodVar.zze());
            zzF("auto", "_tcf", bundle2);
        }
        int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17 % 128;
        int i18 = i17 % 2;
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $10 + 59;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Color.argb(0, 0, 0, 0) + 19472), KeyEvent.keyCodeFromString("") + 2624, '=' - AndroidCharacter.getMirror('0'), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() & (TuitionPaymentFragmentspecialinlinedviewModeldefault1 / 9053247990562531611L);
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - TextUtils.indexOf("", "", 0, 0)), (ViewConfiguration.getEdgeSlop() >> 16) + 481, 36 - ImageFormat.getBitsPerPixel(0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = getrealtimecapturelatency.b;
                Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 19472), ImageFormat.getBitsPerPixel(0) + 2625, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 12, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ 9053247990562531611L);
                Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.MeasureSpec.getMode(0) + 39422), 482 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 37 - KeyEvent.keyCodeFromString(""), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        int i6 = $10 + 119;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (getrealtimecapturelatency.b < cArr.length) {
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (Color.blue(0) + 39422), 481 - View.MeasureSpec.getSize(0), AndroidCharacter.getMirror('0') - 11, 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            int i8 = $10 + 123;
            $11 = i8 % 128;
            int i9 = i8 % 2;
        }
        objArr[0] = new String(cArr2);
    }

    public final String zzQ() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.zzg.get();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 62 / 0;
        }
        return str;
    }

    final void zzR(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        this.zzg.set(str);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String zzad() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        zzlu zzluVarZzl = this.zzu.zzs().zzl();
        if (zzluVarZzl != null) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            return zzluVarZzl.zza;
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final String zzae() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.zzu.zzs().zzl();
            obj.hashCode();
            throw null;
        }
        zzlu zzluVarZzl = this.zzu.zzs().zzl();
        if (zzluVarZzl == null) {
            return null;
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return zzluVarZzl.zzb;
    }

    public final void zzs(zzjl zzjlVar, boolean z) {
        boolean z2;
        zzjl zzjlVar2;
        boolean zZzr;
        boolean z3;
        zzb();
        int iZzb = zzjlVar.zzb();
        if (iZzb != -10) {
            zzji zzjiVarZzp = zzjlVar.zzp();
            zzji zzjiVar = zzji.UNINITIALIZED;
            if (zzjiVarZzp == zzjiVar && zzjlVar.zzq() == zzjiVar) {
                this.zzu.zzaV().zzh().zza("Ignoring empty consent settings");
                return;
            }
        }
        synchronized (this.zzh) {
            try {
                z2 = false;
                if (zzjl.zzu(iZzb, this.zzo.zzb())) {
                    zZzr = zzjlVar.zzr(this.zzo);
                    zzjk zzjkVar = zzjk.ANALYTICS_STORAGE;
                    if (zzjlVar.zzo(zzjkVar) && !this.zzo.zzo(zzjkVar)) {
                        z2 = true;
                    }
                    zzjl zzjlVarZzt = zzjlVar.zzt(this.zzo);
                    this.zzo = zzjlVarZzt;
                    zzjlVar2 = zzjlVarZzt;
                    z3 = z2;
                    z2 = true;
                } else {
                    zzjlVar2 = zzjlVar;
                    zZzr = false;
                    z3 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2) {
            this.zzu.zzaV().zzi().zzb("Ignoring lower-priority consent settings, proposed settings", zzjlVar2);
            return;
        }
        long andIncrement = this.zzp.getAndIncrement();
        if (zZzr) {
            this.zzg.set(null);
            zzku zzkuVar = new zzku(this, zzjlVar2, andIncrement, z3);
            if (!z) {
                this.zzu.zzaW().zzl(zzkuVar);
                return;
            } else {
                zzg();
                zzkuVar.run();
                return;
            }
        }
        zzkv zzkvVar = new zzkv(this, zzjlVar2, andIncrement, z3);
        if (z) {
            zzg();
            zzkvVar.run();
        } else if (iZzb == 30 || iZzb == -10) {
            this.zzu.zzaW().zzl(zzkvVar);
        } else {
            this.zzu.zzaW().zzj(zzkvVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    final PriorityQueue zzy() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 15 / 0;
            if (this.zzm == null) {
                this.zzm = new PriorityQueue(Comparator.comparing(zzlc.zza, zzld.zza));
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                int i5 = i4 % 2;
            }
        } else if (this.zzm == null) {
            this.zzm = new PriorityQueue(Comparator.comparing(zzlc.zza, zzld.zza));
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
            int i7 = i6 % 2;
        }
        return this.zzm;
    }

    public final void zzK(String str, String str2, Object obj, boolean z) {
        Clock clockZzaZ;
        String str3;
        String str4;
        boolean z2;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            clockZzaZ = this.zzu.zzaZ();
            str3 = "auto";
            str4 = "_ldl";
            z2 = true;
        } else {
            clockZzaZ = this.zzu.zzaZ();
            str3 = "auto";
            str4 = "_ldl";
            z2 = true;
        }
        zzL(str3, str4, obj, z2, clockZzaZ.currentTimeMillis());
    }

    public final int zzY(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Preconditions.checkNotEmpty(str);
        this.zzu.zzc();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return 25;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void zzZ(Bundle bundle) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            zzaa(bundle, this.zzu.zzaZ().currentTimeMillis());
            throw null;
        }
        zzaa(bundle, this.zzu.zzaZ().currentTimeMillis());
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
    }

    final /* synthetic */ void zzai(int i) {
        int i2 = 2 % 2;
        if (this.zzk == null) {
            this.zzk = new zzjx(this, this.zzu);
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
        }
        this.zzk.zzb(((long) i) * 1000);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
    }

    final void zzv() {
        int i = 2 % 2;
        zzg();
        zzay zzayVar = this.zzl;
        if (zzayVar != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 125;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            zzayVar.zzd();
            if (i3 != 0) {
                int i4 = 46 / 0;
            }
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
        int i8 = i7 % 2;
    }

    final void zzF(String str, String str2, Bundle bundle) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            zzg();
            zzG(str, str2, this.zzu.zzaZ().currentTimeMillis(), bundle);
            int i3 = 26 / 0;
        } else {
            zzg();
            zzG(str, str2, this.zzu.zzaZ().currentTimeMillis(), bundle);
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    final void zzG(String str, String str2, long j, Bundle bundle) throws Throwable {
        boolean z;
        boolean z2;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            zzg();
            if (this.zzd != null) {
                z = false;
            } else {
                z2 = false;
            }
            zzH(str, str2, j, bundle, true, z2, true, null);
        }
        zzg();
        z = true;
        if (this.zzd != null) {
        }
        z2 = z;
        zzH(str, str2, j, bundle, true, z2, true, null);
        if (zzpp.zzZ(str2)) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            z2 = z;
        } else {
            z2 = false;
        }
        zzH(str, str2, j, bundle, true, z2, true, null);
    }

    final void zzM(String str, String str2, long j, Object obj) {
        int i = 2 % 2;
        this.zzu.zzaW().zzj(new zzkd(this, str, str2, obj, j));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public final void zzV(zzjp zzjpVar) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        zzg();
        zzb();
        if (zzjpVar != null) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i5 = i4 + 111;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
            int i6 = i5 % 2;
            zzjp zzjpVar2 = this.zzd;
            if (zzjpVar != zzjpVar2) {
                int i7 = i4 + 97;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
                int i8 = i7 % 2;
                Preconditions.checkState(zzjpVar2 == null, "EventInterceptor already set.");
            }
        }
        this.zzd = zzjpVar;
    }

    final void zzq(zzaz zzazVar, boolean z) {
        int i = 2 % 2;
        zzkt zzktVar = new zzkt(this, zzazVar);
        if (!(!z)) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            zzg();
            zzktVar.run();
            return;
        }
        this.zzu.zzaW().zzj(zzktVar);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    final void zzu(long j) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            zzg();
            int i3 = 97 / 0;
            if (this.zzl == null) {
                this.zzl = new zzju(this, this.zzu);
            }
        } else {
            zzg();
            if (this.zzl == null) {
                this.zzl = new zzju(this, this.zzu);
            }
        }
        this.zzl.zzb(j);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void zzI(String str, String str2, Bundle bundle, String str3) {
        long jCurrentTimeMillis;
        String str4;
        boolean z;
        boolean z2;
        boolean z3;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            zzic.zzL();
            jCurrentTimeMillis = this.zzu.zzaZ().currentTimeMillis();
            str4 = "auto";
            z = false;
            z2 = false;
            z3 = false;
        } else {
            zzic.zzL();
            jCurrentTimeMillis = this.zzu.zzaZ().currentTimeMillis();
            str4 = "auto";
            z = false;
            z2 = true;
            z3 = true;
        }
        zzJ(str4, str2, jCurrentTimeMillis, bundle, z, z2, z3, str3);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void zzT(long j) {
        int i = 2 % 2;
        this.zzg.set(null);
        this.zzu.zzaW().zzj(new zzkh(this, j));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
    }

    public final String zzaf() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        try {
            String strZza = zzlt.zza(this.zzu.zzaY(), "google_app_id", this.zzu.zzq());
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            return strZza;
        } catch (IllegalStateException e2) {
            this.zzu.zzaV().zzb().zzb("getGoogleAppId failed with exception", e2);
            return null;
        }
    }

    public final Boolean zzi() {
        int i = 2 % 2;
        AtomicReference atomicReference = new AtomicReference();
        Boolean bool = (Boolean) this.zzu.zzaW().zzk(atomicReference, 15000L, "boolean test flag value", new zzke(this, atomicReference));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return bool;
    }

    public final String zzj() {
        int i = 2 % 2;
        AtomicReference atomicReference = new AtomicReference();
        String str = (String) this.zzu.zzaW().zzk(atomicReference, 15000L, "String test flag value", new zzko(this, atomicReference));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final Long zzk() {
        int i = 2 % 2;
        AtomicReference atomicReference = new AtomicReference();
        Long l = (Long) this.zzu.zzaW().zzk(atomicReference, 15000L, "long test flag value", new zzkp(this, atomicReference));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return l;
    }

    public final Integer zzl() {
        int i = 2 % 2;
        AtomicReference atomicReference = new AtomicReference();
        Integer num = (Integer) this.zzu.zzaW().zzk(atomicReference, 15000L, "int test flag value", new zzkq(this, atomicReference));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 72 / 0;
        }
        return num;
    }

    public final Double zzm() {
        int i = 2 % 2;
        AtomicReference atomicReference = new AtomicReference();
        Double d = (Double) this.zzu.zzaW().zzk(atomicReference, 15000L, "double test flag value", new zzkr(this, atomicReference));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 59;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return d;
    }

    public final void zzn(Boolean bool) {
        int i = 2 % 2;
        zzb();
        this.zzu.zzaW().zzj(new zzks(this, bool));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void zzW(zzjq zzjqVar) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        zzb();
        Preconditions.checkNotNull(zzjqVar);
        if (!this.zze.add(zzjqVar)) {
            this.zzu.zzaV().zze().zza("OnEventListener already registered");
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void zzX(zzjq zzjqVar) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        zzb();
        Preconditions.checkNotNull(zzjqVar);
        if (this.zze.remove(zzjqVar)) {
            return;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 != 0) {
            this.zzu.zzaV().zze().zza("OnEventListener had not been registered");
            return;
        }
        this.zzu.zzaV().zze().zza("OnEventListener had not been registered");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    final /* synthetic */ int zzaq(Throwable th) {
        int i = 2 % 2;
        String message = th.getMessage();
        this.zzn = false;
        if (message == null) {
            return 2;
        }
        if (!(th instanceof IllegalStateException) && (!message.contains("garbage collected"))) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 == 0) {
                th.getClass().getSimpleName().equals("ServiceUnavailableException");
                throw null;
            }
            if (!th.getClass().getSimpleName().equals("ServiceUnavailableException")) {
                if (!(th instanceof SecurityException)) {
                    return 2;
                }
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
                int i4 = i3 % 2;
                if (message.endsWith("READ_DEVICE_CONFIG")) {
                    return 2;
                }
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                int i6 = i5 % 2;
                return 3;
            }
        }
        if (!message.contains("Background")) {
            return 1;
        }
        this.zzn = true;
        return 1;
    }

    public final void zzh() {
        int i = 2 % 2;
        zzic zzicVar = this.zzu;
        if (zzicVar.zzaY().getApplicationContext() instanceof Application) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            if (this.zza != null) {
                ((Application) zzicVar.zzaY().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zza);
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 73 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0227  */
    public final void zzE() {
        Object[] objArr;
        char c;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        zzg();
        zzic zzicVar = this.zzu;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "");
            int i4 = 2267 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 33;
            byte[] bArr = $$a;
            byte b = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b, bArr[40], b, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, i4, tapTimeout, -887667012, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        b(new char[]{26574, 44404, 62113, 1986, 19732, 37455, 42997, 60786, 12904, 18305, 35987, 53819, 59306, 11501, 29245, 34641, 52370, 4585, 10105, 27823, 45544, 50973}, 51892 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b(new char[]{26570, 40462, 37972, 35512, 33000, 34507, 48389, 45926, 43426, 45051, 42433, 56340, 53850, 51371, 52988}, 63949 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 2267;
            int i5 = 34 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            byte[] bArr2 = $$a;
            byte b2 = bArr2[7];
            Object[] objArr5 = new Object[1];
            a(b2, bArr2[5], b2, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf, touchSlop, i5, -874156483, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            int i7 = i6 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                int minimumFlingVelocity = 2267 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int i8 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 33;
                byte[] bArr3 = $$a;
                byte b3 = bArr3[7];
                Object[] objArr6 = new Object[1];
                a(b3, b3, bArr3[5], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(offsetAfter, minimumFlingVelocity, i8, -654680577, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i9 = ((int[]) objArr7[0])[0];
            int i10 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[1];
            int iIdentityHashCode = System.identityHashCode(this);
            int i11 = (((975493880 + (((~((-239756124) | iIdentityHashCode)) | 4718856) * 345)) + (((~((-239756124) | (~iIdentityHashCode))) | 564238336) * 345)) + ((~(iIdentityHashCode | (-4718857))) * 345)) - 1701678364;
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr[2])[0] = i13 ^ (i13 << 5);
            c = 3;
        } else {
            Object[] objArr8 = new Object[1];
            b(new char[]{26574, 7934, 38325, 3168, 33596, 14845, 45233, 14136, 44598, 9448, 56233, 21044, 51482, 20479, 50857, 32119, 62505, 27369, 57781, 39035, 7959, 38380, 3255, 33635, 14886, 45292}, 31039 - ExpandableListView.getPackedPositionGroup(0L), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            b(new char[]{26572, 20615, 2407, 49610, 47806, 29456, 11253, 58469, 56631, 38298, 20065, 1849, 65424, 43127, 24781, 22965, 4624, 51948}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 14173, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14 % 128;
                    if (i14 % 2 == 0) {
                        ((ContextWrapper) applicationContext).getBaseContext();
                        throw null;
                    }
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            b(new char[]{26565, 18399, 10235, 2045, 59333, 51094, 42920, 34742, 26432, 18200, 10070, 1901, 59152, 50950, 42788, 34621}, TextUtils.indexOf("", "") + 8209, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            b(new char[]{26566, 36812, 47044, 57300, 51143, 61413, 6129, 16359, 10207, 20465, 30618, 40842, 34744, 44955, 55209, 65443}, 59399 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i15 % 128;
            int i16 = i15 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -1701678364};
                byte[] bArr4 = $$d;
                byte b4 = bArr4[20];
                byte b5 = (byte) (b4 - 1);
                Object[] objArr13 = new Object[1];
                c(b4, b5, b5, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = bArr4[20];
                byte b7 = (byte) (b6 - 1);
                byte b8 = b6;
                Object[] objArr14 = new Object[1];
                c(b7, b8, b8, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cAlpha = (char) Color.alpha(0);
                        int iMyPid = 2267 - (Process.myPid() >> 22);
                        int i17 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 33;
                        byte[] bArr5 = $$a;
                        byte b9 = bArr5[7];
                        Object[] objArr16 = new Object[1];
                        a(b9, b9, bArr5[5], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cAlpha, iMyPid, i17, -654680577, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        b(new char[]{26574, 44404, 62113, 1986, 19732, 37455, 42997, 60786, 12904, 18305, 35987, 53819, 59306, 11501, 29245, 34641, 52370, 4585, 10105, 27823, 45544, 50973}, AndroidCharacter.getMirror('0') + 51845, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        b(new char[]{26570, 40462, 37972, 35512, 33000, 34507, 48389, 45926, 43426, 45051, 42433, 56340, 53850, 51371, 52988}, ((Process.getThreadPriority(0) + 20) >> 6) + 63949, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
                            int iResolveSize = 2267 - View.resolveSize(0, 0);
                            int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 33;
                            byte[] bArr6 = $$a;
                            byte b10 = bArr6[7];
                            Object[] objArr19 = new Object[1];
                            a(b10, bArr6[5], b10, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(mirror, iResolveSize, offsetAfter2, -874156483, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1);
                            int i18 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2266;
                            int iIndexOf = 32 - TextUtils.indexOf((CharSequence) "", '0', 0);
                            byte[] bArr7 = $$a;
                            byte b11 = bArr7[7];
                            Object[] objArr20 = new Object[1];
                            a(b11, bArr7[40], b11, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf2, i18, iIndexOf, -887667012, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i20 = i19 + 11;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i20 % 128;
                        if (i20 % 2 == 0) {
                            int i21 = 2 / 5;
                        }
                        int i22 = i19 + 23;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i22 % 128;
                        int i23 = i22 % 2;
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
                c = 3;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i24 = ((int[]) objArr[c])[0];
        int i25 = ((int[]) objArr[0])[0];
        if (i25 != i24) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[1];
            if (strArr2 != null) {
                for (String str : strArr2) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i25));
        }
        int i26 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i26 % 128;
        int i27 = i26 % 2;
        Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
        int i28 = ((int[]) objArr[2])[0];
        int i29 = ((int[]) objArr[0])[0];
        int i30 = ((int[]) objArr[3])[0];
        String[] strArr3 = (String[]) objArr[1];
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i31 = ~iIdentityHashCode2;
        int i32 = i28 + 1883488172 + (((~((-106393847) | i31)) | (~((-702319470) | i31))) * (-867)) + (((~((-106393847) | iIdentityHashCode2)) | 5505124 | (~((-702319470) | iIdentityHashCode2))) * (-1734)) + (((~(iIdentityHashCode2 | (-696814346))) | (~(i31 | (-5505125))) | (~((-100888723) | iIdentityHashCode2))) * 867);
        int i33 = (i32 << 13) ^ i32;
        int i34 = i33 ^ (i33 >>> 17);
        ((int[]) objArr21[2])[0] = i34 ^ (i34 << 5);
        int i35 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i35 % 128;
        int i36 = i35 % 2;
        zzgs zzgsVarZzj = zzicVar.zzaV().zzj();
        String strConcat = "28;11;".concat("Register tcfPrefChangeListener.");
        int i37 = ((int[]) objArr21[2])[0];
        int i38 = ((i37 * i37) - (~(-(453966438 * i37)))) - 1;
        int i39 = -(i37 * (-1662421236));
        int i40 = (i38 & i39) + (i39 | i38);
        int i41 = (i40 & 1053390257) + (1053390257 | i40);
        int i42 = i41 >> 28;
        int i43 = ((i42 ^ (-31)) + ((i42 & (-31)) << 1)) / 16;
        int i44 = (i43 ^ 1) + ((i43 & 1) << 1);
        int i45 = ((i41 | i44) << 1) - (i44 ^ i41);
        int i46 = i41 >> 29;
        int i47 = ((i46 & (-15)) + (i46 | (-15))) / 8;
        int i48 = -((((i47 | 1) << 1) - (i47 ^ 1)) ^ i45);
        int i49 = (i48 ^ 5) + ((i48 & 5) << 1);
        int i50 = ((i49 >> 21) - 4095) / 2048;
        zzgsVarZzj.zza(strConcat.substring(42450 / (((-(((i50 ^ 1) + ((i50 & 1) << 1)) + 1)) & i49) * 1415)));
        if (this.zzs == null) {
            this.zzt = new zzkb(this, this.zzu);
            this.zzs = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.zzle
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                    this.zza.zzag(sharedPreferences, str2);
                }
            };
        }
        zzicVar.zzd().zze().registerOnSharedPreferenceChangeListener(this.zzs);
    }

    public final void zzab(String str, String str2, Bundle bundle) {
        int i = 2 % 2;
        zzic zzicVar = this.zzu;
        long jCurrentTimeMillis = zzicVar.zzaZ().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, jCurrentTimeMillis);
        if (str2 != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            int i3 = i2 % 2;
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str2);
            bundle2.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        zzicVar.zzaW().zzj(new zzkj(this, bundle2));
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    final void zzz() {
        int i = 2 % 2;
        zzg();
        this.zzn = false;
        if (zzy().isEmpty()) {
            return;
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 67 / 0;
            if (this.zzi) {
                return;
            }
        } else if (this.zzi) {
            return;
        }
        zzoh zzohVar = (zzoh) zzy().poll();
        if (zzohVar != null) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            zzic zzicVar = this.zzu;
            MeasurementManagerFutures measurementManagerFuturesZzT = zzicVar.zzk().zzT();
            if (measurementManagerFuturesZzT != null) {
                this.zzi = true;
                zzgs zzgsVarZzk = zzicVar.zzaV().zzk();
                String str = zzohVar.zza;
                zzgsVarZzk.zzb("Registering trigger URI", str);
                ListenableFuture<Unit> listenableFutureRegisterTriggerAsync = measurementManagerFuturesZzT.registerTriggerAsync(Uri.parse(str));
                if (listenableFutureRegisterTriggerAsync == null) {
                    this.zzi = false;
                    zzy().add(zzohVar);
                } else {
                    getCloseFuture.TuitionPaymentFragmentspecialinlinedviewModeldefault3(listenableFutureRegisterTriggerAsync, new zzjw(this, zzohVar), new zzjv(this));
                }
            }
        }
    }

    final /* synthetic */ void zzag(SharedPreferences sharedPreferences, String str) {
        int i = 2 % 2;
        zzic zzicVar = this.zzu;
        if (zzicVar.zzc().zzp(null, zzfy.zzaZ)) {
            if (!Objects.equals(str, "IABTCF_TCString") && !Objects.equals(str, "IABTCF_gdprApplies")) {
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                if (i2 % 2 != 0) {
                    boolean zEquals = Objects.equals(str, "IABTCF_EnableAdvertiserConsentMode");
                    int i3 = 72 / 0;
                    if (!zEquals) {
                        return;
                    }
                } else if (!Objects.equals(str, "IABTCF_EnableAdvertiserConsentMode")) {
                    return;
                }
            }
            zzicVar.zzaV().zzk().zza("IABTCF_TCString change picked up in listener.");
            ((zzay) Preconditions.checkNotNull(this.zzt)).zzb(500L);
            return;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
            if (!Objects.equals(str, "IABTCF_TCString")) {
                return;
            }
        } else if (!Objects.equals(str, "IABTCF_TCString")) {
            return;
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        int i7 = i6 % 2;
        zzicVar.zzaV().zzk().zza("IABTCF_TCString change picked up in listener.");
        ((zzay) Preconditions.checkNotNull(this.zzt)).zzb(500L);
    }

    public final ArrayList zzac(String str, String str2) {
        int i = 2 % 2;
        zzic zzicVar = this.zzu;
        if (!zzicVar.zzaW().zze()) {
            zzicVar.zzaU();
            if (zzae.zza()) {
                zzicVar.zzaV().zzb().zza("Cannot get conditional user properties from main thread");
                return new ArrayList(0);
            }
            AtomicReference atomicReference = new AtomicReference();
            this.zzu.zzaW().zzk(atomicReference, 5000L, "get conditional user properties", new zzkk(this, atomicReference, null, str, str2));
            List list = (List) atomicReference.get();
            Object obj = null;
            if (list == null) {
                zzicVar.zzaV().zzb().zzb("Timed out waiting for get conditional user properties", null);
                ArrayList arrayList = new ArrayList();
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
                int i3 = i2 % 2;
                return arrayList;
            }
            ArrayList arrayListZzas = zzpp.zzas(list);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            if (i4 % 2 != 0) {
                return arrayListZzas;
            }
            obj.hashCode();
            throw null;
        }
        zzicVar.zzaV().zzb().zza("Cannot get conditional user properties from analytics worker thread");
        return new ArrayList(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
    
        if ((r3 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
    
        r8 = r1.zzd().zzp.zza();
        r1.zzd().zzp.zzb(0 / r8);
        r1.zzc();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005e, code lost:
    
        if (r8 < 5) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        r8 = r1.zzd().zzp.zza();
        r1.zzd().zzp.zzb(1 + r8);
        r1.zzc();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007c, code lost:
    
        if (r8 < 5) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        r3 = com.google.android.gms.measurement.internal.zzlj.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
        com.google.android.gms.measurement.internal.zzlj.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0089, code lost:
    
        if ((r3 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008b, code lost:
    
        r1.zzaV().zze().zza("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
        r1.zzd().zzo.zzb(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a0, code lost:
    
        r1.zzaV().zze().zza("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
        r1.zzd().zzo.zzb(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b8, code lost:
    
        if (r12.zzr != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ba, code lost:
    
        r12.zzr = new com.google.android.gms.measurement.internal.zzkg(r12, r12.zzu);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c3, code lost:
    
        r12.zzr.zzb(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c9, code lost:
    
        r1.zzaV().zzj().zza("Deferred Deep Link already retrieved. Not fetching again.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0021, code lost:
    
        if (r1.zzd().zzo.zza() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r1.zzd().zzo.zza() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        r3 = com.google.android.gms.measurement.internal.zzlj.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
        com.google.android.gms.measurement.internal.zzlj.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r3 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzS() {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlj.zzS():void");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0083  */
    final void zzN(String str, String str2, Object obj, long j) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzb();
        if (FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS.equals(str2)) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
                    long j2 = (i6 % 2 != 0 ? true == "false".equals(str3.toLowerCase(Locale.ENGLISH)) : !"false".equals(str3.toLowerCase(Locale.ENGLISH))) ? 1L : 0L;
                    zzic zzicVar = this.zzu;
                    Long lValueOf = Long.valueOf(j2);
                    zzicVar.zzd().zzh.zzb(lValueOf.longValue() == 1 ? "true" : "false");
                    obj = lValueOf;
                } else if (obj == null) {
                    this.zzu.zzd().zzh.zzb("unset");
                }
                str2 = "_npa";
            } else if (obj == null) {
                this.zzu.zzd().zzh.zzb("unset");
                str2 = "_npa";
            }
            this.zzu.zzaV().zzk().zzc("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
        }
        String str4 = str2;
        Object obj2 = obj;
        zzic zzicVar2 = this.zzu;
        if (zzicVar2.zzB()) {
            if (zzicVar2.zzH()) {
                this.zzu.zzt().zzA(new zzpl(str4, j, obj2, str));
                return;
            }
            return;
        }
        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
        if (i7 % 2 == 0) {
            this.zzu.zzaV().zzk().zza("User property not set since app measurement is disabled");
        } else {
            this.zzu.zzaV().zzk().zza("User property not set since app measurement is disabled");
            throw null;
        }
    }

    public final Map zzP(String str, String str2, boolean z) {
        int i = 2 % 2;
        zzic zzicVar = this.zzu;
        Object obj = null;
        if (zzicVar.zzaW().zze()) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 != 0) {
                zzicVar.zzaV().zzb().zza("Cannot get user properties from analytics worker thread");
                return Collections.emptyMap();
            }
            zzicVar.zzaV().zzb().zza("Cannot get user properties from analytics worker thread");
            Collections.emptyMap();
            obj.hashCode();
            throw null;
        }
        zzicVar.zzaU();
        if (!(!zzae.zza())) {
            zzicVar.zzaV().zzb().zza("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzu.zzaW().zzk(atomicReference, 5000L, "get user properties", new zzkl(this, atomicReference, null, str, str2, z));
        List list = (List) atomicReference.get();
        if (list == null) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            if (i3 % 2 == 0) {
                zzicVar.zzaV().zzb().zzb("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
                return Collections.emptyMap();
            }
            zzicVar.zzaV().zzb().zzb("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            Collections.emptyMap();
            throw null;
        }
        ArrayMap arrayMap = new ArrayMap(list.size());
        Iterator it = list.iterator();
        while (!(!it.hasNext())) {
            zzpl zzplVar = (zzpl) it.next();
            Object objZza = zzplVar.zza();
            if (objZza != null) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                if (i4 % 2 == 0) {
                    arrayMap.put(zzplVar.zzb, objZza);
                    obj.hashCode();
                    throw null;
                }
                arrayMap.put(zzplVar.zzb, objZza);
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        return arrayMap;
    }

    protected final void zzJ(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        int i = 2 % 2;
        int i2 = zzpp.zza;
        Bundle bundle2 = new Bundle(bundle);
        Iterator<String> it = bundle2.keySet().iterator();
        while (it.hasNext()) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            if (i3 % 2 != 0) {
                boolean z4 = bundle2.get(it.next()) instanceof Bundle;
                throw null;
            }
            String next = it.next();
            Object obj = bundle2.get(next);
            if (obj instanceof Bundle) {
                bundle2.putBundle(next, new Bundle((Bundle) obj));
            } else {
                int i4 = 0;
                if (obj instanceof Parcelable[]) {
                    int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                    if (i5 % 2 != 0) {
                        throw null;
                    }
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i4 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i4];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i4] = new Bundle((Bundle) parcelable);
                        }
                        i4++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i4 < list.size()) {
                        Object obj2 = list.get(i4);
                        if (obj2 instanceof Bundle) {
                            list.set(i4, new Bundle((Bundle) obj2));
                        }
                        i4++;
                    }
                }
            }
        }
        this.zzu.zzaW().zzj(new zzkc(this, str, str2, j, bundle2, z, z2, z3, str3));
    }

    public final List zzO(boolean z) {
        int i = 2 % 2;
        zzb();
        zzic zzicVar = this.zzu;
        zzicVar.zzaV().zzk().zza("Getting user properties (FE)");
        if (!(!zzicVar.zzaW().zze())) {
            zzicVar.zzaV().zzb().zza("Cannot get all user properties from analytics worker thread");
            return Collections.emptyList();
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            zzicVar.zzaU();
            zzae.zza();
            obj.hashCode();
            throw null;
        }
        zzicVar.zzaU();
        if (zzae.zza()) {
            zzicVar.zzaV().zzb().zza("Cannot get all user properties from main thread");
            List listEmptyList = Collections.emptyList();
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            return listEmptyList;
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzu.zzaW().zzk(atomicReference, 5000L, "get user properties", new zzkf(this, atomicReference, z));
        List list = (List) atomicReference.get();
        if (list != null) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            if (i5 % 2 == 0) {
                return list;
            }
            throw null;
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        if (i6 % 2 == 0) {
            zzicVar.zzaV().zzb().zzb("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyList();
        }
        zzicVar.zzaV().zzb().zzb("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z));
        Collections.emptyList();
        throw null;
    }

    final void zzw() {
        int i = 2 % 2;
        zzqp.zza();
        zzic zzicVar = this.zzu;
        if (zzicVar.zzc().zzp(null, zzfy.zzaQ)) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            if (i2 % 2 != 0) {
                zzicVar.zzaW().zze();
                throw null;
            }
            if (zzicVar.zzaW().zze()) {
                zzicVar.zzaV().zzb().zza("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            zzicVar.zzaU();
            if (zzae.zza()) {
                zzicVar.zzaV().zzb().zza("Cannot get trigger URIs from main thread");
                return;
            }
            zzb();
            zzicVar.zzaV().zzk().zza("Getting trigger URIs (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            zzicVar.zzaW().zzk(atomicReference, 10000L, "get trigger URIs", new Runnable() { // from class: com.google.android.gms.measurement.internal.zzla
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzlj zzljVar = this.zza;
                    zzljVar.zzu.zzt().zzw(atomicReference, zzljVar.zzu.zzd().zzi.zza());
                }
            });
            final List list = (List) atomicReference.get();
            if (list != null) {
                zzicVar.zzaW().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzlb
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzlj zzljVar = this.zza;
                        zzljVar.zzg();
                        if (Build.VERSION.SDK_INT < 30) {
                            return;
                        }
                        List<zzoh> list2 = list;
                        SparseArray sparseArrayZzf = zzljVar.zzu.zzd().zzf();
                        for (zzoh zzohVar : list2) {
                            int i3 = zzohVar.zzc;
                            if (!sparseArrayZzf.contains(i3) || ((Long) sparseArrayZzf.get(i3)).longValue() < zzohVar.zzb) {
                                zzljVar.zzy().add(zzohVar);
                            }
                        }
                        zzljVar.zzz();
                    }
                });
                return;
            }
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            if (i3 % 2 != 0) {
                zzicVar.zzaV().zzd().zza("Timed out waiting for get trigger URIs");
            } else {
                zzicVar.zzaV().zzd().zza("Timed out waiting for get trigger URIs");
                int i4 = 21 / 0;
            }
        }
    }

    final /* synthetic */ void zzak(zzjl zzjlVar, long j, boolean z, boolean z2) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            zzg();
            zzb();
            this.zzu.zzd().zzl();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        zzg();
        zzb();
        zzic zzicVar = this.zzu;
        zzjl zzjlVarZzl = zzicVar.zzd().zzl();
        if (j > this.zzq || !zzjl.zzu(zzjlVarZzl.zzb(), zzjlVar.zzb())) {
            zzhh zzhhVarZzd = zzicVar.zzd();
            zzic zzicVar2 = zzhhVarZzd.zzu;
            zzhhVarZzd.zzg();
            int iZzb = zzjlVar.zzb();
            if (zzhhVarZzd.zzk(iZzb)) {
                zzic zzicVar3 = this.zzu;
                SharedPreferences.Editor editorEdit = zzhhVarZzd.zzd().edit();
                editorEdit.putString("consent_settings", zzjlVar.zzl());
                editorEdit.putInt("consent_source", iZzb);
                editorEdit.apply();
                zzicVar.zzaV().zzk().zzb("Setting storage consent(FE)", zzjlVar);
                this.zzq = j;
                if (!zzicVar3.zzt().zzP()) {
                    zzicVar3.zzt().zzj(z);
                } else {
                    zzicVar3.zzt().zzk(z);
                }
                if (z2) {
                    zzicVar3.zzt().zzC(new AtomicReference());
                    return;
                }
                return;
            }
            zzicVar.zzaV().zzi().zzb("Lower precedence consent source ignored, proposed source", Integer.valueOf(zzjlVar.zzb()));
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        zzicVar.zzaV().zzi().zzb("Dropped out-of-date consent setting, proposed settings", zzjlVar);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0041  */
    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:19:0x0055  */
    /* JADX WARN: Code duplicated, block: B:21:0x0060  */
    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    /* JADX WARN: Code duplicated, block: B:26:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x007e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0081  */
    /* JADX WARN: Code duplicated, block: B:30:0x0085  */
    /* JADX WARN: Code duplicated, block: B:32:0x0091  */
    /* JADX WARN: Code duplicated, block: B:34:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    public final void zzL(String str, String str2, Object obj, boolean z, long j) {
        int iZzp;
        int i;
        String str3;
        zzic zzicVar;
        int iZzK;
        Object objZzL;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int length = 0;
        Object obj2 = null;
        if (!z) {
            zzpp zzppVarZzk = this.zzu.zzk();
            if (!zzppVarZzk.zzj("user property", str2)) {
                iZzp = 6;
            } else if (zzppVarZzk.zzl("user property", zzjo.zza, null, str2)) {
                zzppVarZzk.zzu.zzc();
                if (zzppVarZzk.zzm("user property", 24, str2)) {
                    i = 0;
                } else {
                    iZzp = 6;
                }
            } else {
                iZzp = 15;
            }
            if (i != 0) {
                zzic zzicVar2 = this.zzu;
                zzpp zzppVarZzk2 = zzicVar2.zzk();
                zzicVar2.zzc();
                String strZzC = zzppVarZzk2.zzC(str2, 24, true);
                if (str2 != null) {
                    i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
                    if (i3 % 2 != 0) {
                        str2.length();
                        obj2.hashCode();
                        throw null;
                    }
                    length = str2.length();
                }
                this.zzu.zzk().zzN(this.zzv, null, i, "_ev", strZzC, length);
                return;
            }
            if (str == null) {
                str3 = "app";
            } else {
                str3 = str;
            }
            if (obj != null) {
                zzM(str3, str2, j, null);
                return;
            }
            zzicVar = this.zzu;
            iZzK = zzicVar.zzk().zzK(str2, obj);
            if (iZzK != 0) {
                objZzL = zzicVar.zzk().zzL(str2, obj);
                if (objZzL != null) {
                    zzM(str3, str2, j, objZzL);
                    int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
                    int i6 = i5 % 2;
                    return;
                }
                return;
            }
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
            int i8 = i7 % 2;
            zzpp zzppVarZzk3 = zzicVar.zzk();
            zzicVar.zzc();
            String strZzC2 = zzppVarZzk3.zzC(str2, 24, true);
            if (!(obj instanceof String)) {
                i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
                if (i2 % 2 != 0) {
                    boolean z2 = obj instanceof CharSequence;
                    obj2.hashCode();
                    throw null;
                }
                length = obj instanceof CharSequence ? obj.toString().length() : 0;
            }
            this.zzu.zzk().zzN(this.zzv, null, iZzK, "_ev", strZzC2, length);
        }
        iZzp = this.zzu.zzk().zzp(str2);
        i = iZzp;
        if (i != 0) {
            zzic zzicVar3 = this.zzu;
            zzpp zzppVarZzk4 = zzicVar3.zzk();
            zzicVar3.zzc();
            String strZzC3 = zzppVarZzk4.zzC(str2, 24, true);
            if (str2 != null) {
                i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
                if (i3 % 2 != 0) {
                    str2.length();
                    obj2.hashCode();
                    throw null;
                }
                length = str2.length();
            }
            this.zzu.zzk().zzN(this.zzv, null, i, "_ev", strZzC3, length);
            return;
        }
        if (str == null) {
            str3 = "app";
        } else {
            str3 = str;
        }
        if (obj != null) {
            zzM(str3, str2, j, null);
            return;
        }
        zzicVar = this.zzu;
        iZzK = zzicVar.zzk().zzK(str2, obj);
        if (iZzK != 0) {
            objZzL = zzicVar.zzk().zzL(str2, obj);
            if (objZzL != null) {
                zzM(str3, str2, j, objZzL);
                int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
                int i10 = i9 % 2;
                return;
            }
            return;
        }
        int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
        int i12 = i11 % 2;
        zzpp zzppVarZzk5 = zzicVar.zzk();
        zzicVar.zzc();
        String strZzC4 = zzppVarZzk5.zzC(str2, 24, true);
        if (!(obj instanceof String)) {
            i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 != 0) {
                boolean z3 = obj instanceof CharSequence;
                obj2.hashCode();
                throw null;
            }
            if (obj instanceof CharSequence) {
            }
        }
        this.zzu.zzk().zzN(this.zzv, null, iZzK, "_ev", strZzC4, length);
    }

    final void zzp(Bundle bundle, int i, long j) {
        Object obj;
        String string;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        zzb();
        zzjl zzjlVar = zzjl.zza;
        zzjk[] zzjkVarArrZzb = zzjj.STORAGE.zzb();
        int length = zzjkVarArrZzb.length;
        int i5 = 0;
        while (true) {
            obj = null;
            if (i5 >= length) {
                break;
            }
            String str = zzjkVarArrZzb[i5].zze;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
                if (i6 % 2 != 0) {
                    string.equals("granted");
                    throw null;
                }
                if (string.equals("granted")) {
                    obj = true;
                } else if (string.equals("denied")) {
                    int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 51;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
                    obj = i7 % 2 == 0;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i5++;
        }
        if (obj != null) {
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
            if (i8 % 2 != 0) {
                zzic zzicVar = this.zzu;
                zzicVar.zzaV().zzh().zzb("Ignoring invalid consent setting", obj);
                zzicVar.zzaV().zzh().zza("Valid consent values are 'granted', 'denied'");
                int i9 = 95 / 0;
            } else {
                zzic zzicVar2 = this.zzu;
                zzicVar2.zzaV().zzh().zzb("Ignoring invalid consent setting", obj);
                zzicVar2.zzaV().zzh().zza("Valid consent values are 'granted', 'denied'");
            }
        }
        boolean zZze = this.zzu.zzaW().zze();
        zzjl zzjlVarZze = zzjl.zze(bundle, i);
        if (zzjlVarZze.zzc()) {
            zzs(zzjlVarZze, zZze);
        }
        zzaz zzazVarZzh = zzaz.zzh(bundle, i);
        if (zzazVarZzh.zzd()) {
            int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
            if (i10 % 2 != 0) {
                zzq(zzazVarZzh, zZze);
                int i11 = 52 / 0;
            } else {
                zzq(zzazVarZzh, zZze);
            }
        }
        Boolean boolZzi = zzaz.zzi(bundle);
        if (boolZzi != null) {
            String str2 = i == -30 ? "tcf" : "app";
            if (zZze) {
                zzN(str2, FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS, boolZzi.toString(), j);
            } else {
                zzL(str2, FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS, boolZzi.toString(), false, j);
            }
        }
    }

    public final void zzU() {
        int i = 2 % 2;
        zzg();
        zzb();
        if (this.zzu.zzH()) {
            zzic zzicVar = this.zzu;
            zzal zzalVarZzc = zzicVar.zzc();
            zzalVarZzc.zzu.zzaU();
            Boolean boolZzr = zzalVarZzc.zzr("google_analytics_deferred_deep_link_enabled");
            if (boolZzr != null) {
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                int i3 = i2 % 2;
                if (boolZzr.booleanValue()) {
                    zzicVar.zzaV().zzj().zza("Deferred Deep Link feature enabled.");
                    zzicVar.zzaW().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzlh
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzS();
                        }
                    });
                }
            }
            this.zzu.zzt().zzE();
            this.zzc = false;
            zzhh zzhhVarZzd = zzicVar.zzd();
            zzhhVarZzd.zzg();
            Object obj = null;
            String string = zzhhVarZzd.zzd().getString("previous_os_version", null);
            zzhhVarZzd.zzu.zzu().zzw();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str)) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                if (i4 % 2 != 0) {
                    str.equals(string);
                    obj.hashCode();
                    throw null;
                }
                if (!str.equals(string)) {
                    SharedPreferences.Editor editorEdit = zzhhVarZzd.zzd().edit();
                    editorEdit.putString("previous_os_version", str);
                    editorEdit.apply();
                    int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
                    int i6 = i5 % 2;
                }
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            zzicVar.zzu().zzw();
            if (string.equals(Build.VERSION.RELEASE)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            zzF("auto", "_ou", bundle);
        }
    }

    final void zzt(Runnable runnable) {
        int i = 2 % 2;
        zzb();
        zzic zzicVar = this.zzu;
        if (zzicVar.zzaW().zze()) {
            zzicVar.zzaV().zzb().zza("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        if (zzicVar.zzaW().zzf()) {
            zzicVar.zzaV().zzb().zza("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        zzicVar.zzaU();
        if (zzae.zza()) {
            zzicVar.zzaV().zzb().zza("Cannot retrieve and upload batches from main thread");
            return;
        }
        zzicVar.zzaV().zzk().zza("[sgtm] Started client-side batch upload work.");
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 3 % 3;
        }
        boolean z = false;
        int size = 0;
        int i4 = 0;
        while (!z) {
            zzicVar.zzaV().zzk().zza("[sgtm] Getting upload batches from service (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            zzicVar.zzaW().zzk(atomicReference, 10000L, "[sgtm] Getting upload batches", new Runnable() { // from class: com.google.android.gms.measurement.internal.zzli
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzu.zzt().zzx(atomicReference, zzoo.zza(zzls.SGTM_CLIENT));
                }
            });
            zzoq zzoqVar = (zzoq) atomicReference.get();
            if (zzoqVar == null) {
                break;
            }
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            List list = zzoqVar.zza;
            if (!list.isEmpty()) {
                zzicVar.zzaV().zzk().zzb("[sgtm] Retrieved upload batches. count", Integer.valueOf(list.size()));
                size += list.size();
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                        int i8 = i7 % 2;
                        zzlr zzlrVarZzar = zzar((zzom) it.next());
                        if (zzlrVarZzar == zzlr.SUCCESS) {
                            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
                            int i10 = i9 % 2;
                            i4++;
                        } else if (zzlrVarZzar == zzlr.BACKOFF) {
                            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
                            if (i11 % 2 != 0) {
                                z = true;
                                break;
                            }
                        }
                    }
                    z = false;
                    break;
                }
            }
            break;
        }
        zzicVar.zzaV().zzk().zzc("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(size), Integer.valueOf(i4));
        runnable.run();
    }

    final /* synthetic */ void zzah(Bundle bundle) {
        Bundle bundle2;
        int i;
        int i2 = 2 % 2;
        if (!bundle.isEmpty()) {
            zzic zzicVar = this.zzu;
            bundle2 = new Bundle(zzicVar.zzd().zzt.zza());
            Iterator<String> it = bundle.keySet().iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                Object obj = bundle.get(next);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
                    int i4 = i3 % 2;
                    if (zzicVar.zzk().zzt(obj)) {
                        zzicVar.zzk().zzN(this.zzv, null, 27, null, null, 0);
                    }
                    zzicVar.zzaV().zzh().zzc("Invalid default event parameter type. Name, value", next, obj);
                    int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 41;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                    int i6 = i5 % 2;
                } else if (zzpp.zzZ(next)) {
                    zzicVar.zzaV().zzh().zzb("Invalid default event parameter name. Name", next);
                } else if (obj == null) {
                    bundle2.remove(next);
                } else if (zzicVar.zzk().zzu("param", next, zzicVar.zzc().zze(null, false), obj)) {
                    zzicVar.zzk().zzM(bundle2, next, obj);
                }
            }
            zzicVar.zzk();
            int iZzc = zzicVar.zzc().zzc();
            if (bundle2.size() > iZzc) {
                for (String str : new TreeSet(bundle2.keySet())) {
                    i++;
                    if (i > iZzc) {
                        bundle2.remove(str);
                    }
                }
                zzicVar.zzk().zzN(this.zzv, null, 26, null, null, 0);
                zzicVar.zzaV().zzh().zza("Too many default event parameters set. Discarding beyond event parameter limit");
            }
        } else {
            int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 109;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
            int i8 = i7 % 2;
            bundle2 = bundle;
        }
        zzic zzicVar2 = this.zzu;
        zzicVar2.zzd().zzt.zzb(bundle2);
        if (!bundle.isEmpty() || zzicVar2.zzc().zzp(null, zzfy.zzaW)) {
            this.zzu.zzt().zzH(bundle2);
        }
    }

    public final void zzaa(Bundle bundle, long j) {
        int i = 2 % 2;
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.zzu.zzaV().zze().zza("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Preconditions.checkNotNull(bundle2);
        zzjh.zzb(bundle2, "app_id", String.class, null);
        zzjh.zzb(bundle2, "origin", String.class, null);
        zzjh.zzb(bundle2, "name", String.class, null);
        zzjh.zzb(bundle2, "value", Object.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        zzjh.zzb(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString("name"));
        Preconditions.checkNotEmpty(bundle2.getString("origin"));
        Preconditions.checkNotNull(bundle2.get("value"));
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        zzic zzicVar = this.zzu;
        if (zzicVar.zzk().zzp(string) != 0) {
            zzicVar.zzaV().zzb().zzb("Invalid conditional user property name", zzicVar.zzl().zzc(string));
            return;
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        if (zzicVar.zzk().zzK(string, obj) != 0) {
            zzicVar.zzaV().zzb().zzc("Invalid conditional user property value", zzicVar.zzl().zzc(string), obj);
            return;
        }
        Object objZzL = zzicVar.zzk().zzL(string, obj);
        if (objZzL == null) {
            zzicVar.zzaV().zzb().zzc("Unable to normalize conditional user property value", zzicVar.zzl().zzc(string), obj);
            return;
        }
        zzjh.zza(bundle2, objZzL);
        long j2 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
        if (!TextUtils.isEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME))) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            zzicVar.zzc();
            if (j2 > 15552000000L || j2 < 1) {
                zzicVar.zzaV().zzb().zzc("Invalid conditional user property timeout", zzicVar.zzl().zzc(string), Long.valueOf(j2));
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
                int i7 = i6 % 2;
                return;
            }
        }
        long j3 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
        zzicVar.zzc();
        if (j3 <= 15552000000L) {
            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 9;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
            if (i8 % 2 == 0 ? j3 >= 1 : j3 >= 0) {
                zzicVar.zzaW().zzj(new zzki(this, bundle2));
                return;
            }
        }
        zzicVar.zzaV().zzb().zzc("Invalid conditional user property time to live", zzicVar.zzl().zzc(string), Long.valueOf(j3));
    }

    /* JADX WARN: Failed to calculate best type for var: r0v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v8 ??, new type: com.google.android.gms.measurement.internal.zzic
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v8 ??, new type: com.google.android.gms.measurement.internal.zzic
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r29v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r29v0 ??, new type: android.os.Bundle
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v30 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v30 ??, new type: com.google.android.gms.measurement.internal.zzpp
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v21 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v21 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v2 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v2 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v29 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v29 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v3 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v4 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r29v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r29v0 ??, new type: android.os.Bundle
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v2 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    protected final void zzH(java.lang.String r25, java.lang.String r26, long r27, android.os.Bundle r29, boolean r30, boolean r31, boolean r32, java.lang.String r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlj.zzH(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    final /* synthetic */ void zzaj(Boolean bool, boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        zzas(bool, true);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    final /* synthetic */ void zzal() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        zzat();
        if (i3 != 0) {
            throw null;
        }
    }

    final /* synthetic */ void zzam(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        this.zzi = false;
        int i5 = i2 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
    }

    final /* synthetic */ int zzan() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        int i4 = i2 % 2;
        int i5 = this.zzj;
        int i6 = i3 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    final /* synthetic */ void zzao(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        this.zzj = i;
        if (i4 == 0) {
            throw null;
        }
    }

    final /* synthetic */ zzay zzap() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        zzay zzayVar = this.zzr;
        int i5 = i2 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        return zzayVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zze() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i3 = i2 + 75;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        boolean z = !(i3 % 2 == 0);
        int i4 = i2 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    final boolean zzx() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.zzn;
        }
        throw null;
    }
}

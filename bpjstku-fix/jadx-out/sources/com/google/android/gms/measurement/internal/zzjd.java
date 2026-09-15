package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Bundle;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.animation.core.AnimationKt;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import com.google.firebase.dynamiclinks.DynamicLink;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import defpackage.onScroll;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzjd extends zzga {
    private static short[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final zzpg zza;
    private Boolean zzb;
    private String zzc;
    private static final byte[] $$c = {106, -22, 107, 95};
    private static final int $$d = 218;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {113, 29, -123, -97, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 191;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -1772968197;
    private static int TuitionPaymentFragmentbindingInflater1 = -1934795539;
    private static int b = -1477294191;
    private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {16, 4, 23, -15, 34, 16, 57, 9, 14, -14, -11, 79, 20, -55, 94, 15, 14, 13, 26, 2, 29, 123, 79, 124, 75, 86, 71, 94, 117, 66, 113, 78, 82, 124, 74, -113, -76, -124, -67, 97, 96, -50, -68, -120, -80, 121, -56, -86, -112, -66, -107, -127, 120, -85, -127, 98, 109, -89, -111, -101, -127, -98, -99, -107, -117, -26, -26, -26, -26};

    public zzjd(zzpg zzpgVar, String str) {
        Preconditions.checkNotNull(zzpgVar);
        this.zza = zzpgVar;
        this.zzc = null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = 92 - r8
            int r7 = r7 * 15
            int r7 = r7 + 38
            byte[] r0 = com.google.android.gms.measurement.internal.zzjd.$$a
            int r6 = r6 * 4
            int r6 = 84 - r6
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r7
            r6 = r8
            r3 = r2
            goto L2c
        L15:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L19:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r6 = r6 + 1
            int r3 = r3 + 1
            if (r3 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            r4 = r0[r6]
        L2c:
            int r4 = -r4
            int r8 = r8 + r4
            int r8 = r8 + (-11)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjd.a(short, int, short, java.lang.Object[]):void");
    }

    private final void zzM(zzbg zzbgVar, zzr zzrVar) {
        int i = 2 % 2;
        int i2 = asBinder + 55;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        zzpg zzpgVar = this.zza;
        zzpgVar.zzZ();
        zzpgVar.zzF(zzbgVar, zzrVar);
        int i4 = asInterface + 91;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 42 / 0;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzA(zzr zzrVar) {
        int i = 2 % 2;
        zzN(zzrVar, false);
        zzd(new zzif(this, zzrVar));
        int i2 = asBinder + 15;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzC(final zzr zzrVar, final zzaf zzafVar) {
        int i = 2 % 2;
        zzN(zzrVar, false);
        zzd(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzja
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzJ(zzrVar, zzafVar);
            }
        });
        int i2 = asInterface + 17;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 89 / 0;
        }
    }

    private final void zzN(zzr zzrVar, boolean z) {
        zzpp zzppVarZzt;
        int i = 2 % 2;
        int i2 = asBinder + 67;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Preconditions.checkNotNull(zzrVar);
            String str = zzrVar.zza;
            Preconditions.checkNotEmpty(str);
            zzO(str, false);
            zzppVarZzt = this.zza.zzt();
        } else {
            Preconditions.checkNotNull(zzrVar);
            String str2 = zzrVar.zza;
            Preconditions.checkNotEmpty(str2);
            zzO(str2, false);
            zzppVarZzt = this.zza.zzt();
        }
        zzppVarZzt.zzA(zzrVar.zzb);
        int i3 = asBinder + 67;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzB(zzr zzrVar, final zzoo zzooVar, final zzgh zzghVar) {
        int i = 2 % 2;
        zzN(zzrVar, false);
        final String str = (String) Preconditions.checkNotNull(zzrVar.zza);
        this.zza.zzaW().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zziz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws Throwable {
                this.zza.zzI(str, zzooVar, zzghVar);
            }
        });
        int i2 = asBinder + 65;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzD(final zzr zzrVar, final Bundle bundle, final zzge zzgeVar) {
        int i = 2 % 2;
        zzN(zzrVar, false);
        final String str = (String) Preconditions.checkNotNull(zzrVar.zza);
        this.zza.zzaW().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zziy
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzH(zzrVar, bundle, zzgeVar, str);
            }
        });
        int i2 = asInterface + 55;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 22 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0026 A[Catch: SecurityException -> 0x00bc, TRY_LEAVE, TryCatch #2 {SecurityException -> 0x00bc, blocks: (B:8:0x0018, B:10:0x001c, B:26:0x0062, B:17:0x0026, B:20:0x0039, B:22:0x0049, B:25:0x005c, B:15:0x0022, B:29:0x006c, B:33:0x007b, B:35:0x008c, B:36:0x008f, B:38:0x009d, B:39:0x00a0, B:42:0x00a3, B:45:0x00ac, B:46:0x00bb), top: B:56:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0030  */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    private final void zzO(String str, boolean z) {
        boolean z2;
        int i = 2 % 2;
        if (TextUtils.isEmpty(str)) {
            this.zza.zzaV().zzb().zza("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        try {
            if (z) {
                int i2 = asInterface + 21;
                asBinder = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 38 / 0;
                    if (this.zzb == null) {
                        if (!"com.google.android.gms".equals(this.zzc)) {
                            int i4 = asInterface + 87;
                            asBinder = i4 % 128;
                            int i5 = i4 % 2;
                            zzpg zzpgVar = this.zza;
                            z2 = !UidVerifier.isGooglePlayServicesUid(zzpgVar.zzaY(), Binder.getCallingUid()) || GoogleSignatureVerifier.getInstance(zzpgVar.zzaY()).isUidGoogleSigned(Binder.getCallingUid());
                        }
                        this.zzb = Boolean.valueOf(z2);
                    }
                } else if (this.zzb == null) {
                    if (!"com.google.android.gms".equals(this.zzc)) {
                        int i6 = asInterface + 87;
                        asBinder = i6 % 128;
                        int i7 = i6 % 2;
                        zzpg zzpgVar2 = this.zza;
                        if (UidVerifier.isGooglePlayServicesUid(zzpgVar2.zzaY(), Binder.getCallingUid())) {
                        }
                    }
                    this.zzb = Boolean.valueOf(z2);
                }
                if (!(!this.zzb.booleanValue())) {
                    return;
                }
            }
            if (this.zzc == null) {
                int i8 = asInterface + 9;
                asBinder = i8 % 128;
                if (i8 % 2 != 0) {
                    GooglePlayServicesUtilLight.uidHasPackageName(this.zza.zzaY(), Binder.getCallingUid(), str);
                    Object obj = null;
                    try {
                        obj.hashCode();
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (!(!GooglePlayServicesUtilLight.uidHasPackageName(this.zza.zzaY(), Binder.getCallingUid(), str))) {
                    this.zzc = str;
                }
            }
            if (!str.equals(this.zzc)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
            }
        } catch (SecurityException e2) {
            this.zza.zzaV().zzb().zzb("Measurement Service called with invalid calling package. appId", zzgu.zzl(str));
            throw e2;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzl(long j, String str, String str2, String str3) {
        int i = 2 % 2;
        zzd(new zzig(this, str2, str3, str, j));
        int i2 = asBinder + 81;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    final /* synthetic */ void zzF(zzr zzrVar) {
        int i = 2 % 2;
        int i2 = asBinder + 69;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            zzpg zzpgVar = this.zza;
            zzpgVar.zzZ();
            zzpgVar.zzv(zzrVar);
        } else {
            zzpg zzpgVar2 = this.zza;
            zzpgVar2.zzZ();
            zzpgVar2.zzv(zzrVar);
            throw null;
        }
    }

    final /* synthetic */ void zzG(zzr zzrVar) {
        int i = 2 % 2;
        int i2 = asInterface + 37;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        zzpg zzpgVar = this.zza;
        zzpgVar.zzZ();
        zzpgVar.zzw(zzrVar);
        int i4 = asInterface + 5;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    final /* synthetic */ void zzJ(zzr zzrVar, zzaf zzafVar) {
        int i = 2 % 2;
        int i2 = asInterface + 57;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            zzpg zzpgVar = this.zza;
            zzpgVar.zzZ();
            zzpgVar.zzar((String) Preconditions.checkNotNull(zzrVar.zza), zzafVar);
            throw null;
        }
        zzpg zzpgVar2 = this.zza;
        zzpgVar2.zzZ();
        zzpgVar2.zzar((String) Preconditions.checkNotNull(zzrVar.zza), zzafVar);
        int i3 = asBinder + 7;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzg(zzr zzrVar) {
        int i = 2 % 2;
        zzN(zzrVar, false);
        zzd(new zzie(this, zzrVar));
        int i2 = asBinder + 41;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzi(zzr zzrVar) {
        int i = 2 % 2;
        zzN(zzrVar, false);
        zzd(new zzin(this, zzrVar));
        int i2 = asBinder + 111;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final String zzm(zzr zzrVar) {
        int i = 2 % 2;
        int i2 = asInterface + 11;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        zzN(zzrVar, false);
        String strZzap = this.zza.zzap(zzrVar);
        int i4 = asBinder + 89;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return strZzap;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zze(zzbg zzbgVar, zzr zzrVar) {
        int i = 2 % 2;
        Preconditions.checkNotNull(zzbgVar);
        zzN(zzrVar, false);
        zzd(new zzir(this, zzbgVar, zzrVar));
        int i2 = asBinder + 81;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzf(zzpl zzplVar, zzr zzrVar) {
        int i = 2 % 2;
        Preconditions.checkNotNull(zzplVar);
        zzN(zzrVar, false);
        zzd(new zziu(this, zzplVar, zzrVar));
        int i2 = asBinder + 21;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzt(zzr zzrVar) {
        int i = 2 % 2;
        String str = zzrVar.zza;
        Preconditions.checkNotEmpty(str);
        zzO(str, false);
        zzd(new zzio(this, zzrVar));
        int i2 = asBinder + 1;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzv(zzr zzrVar) throws Throwable {
        int i = 2 % 2;
        Preconditions.checkNotEmpty(zzrVar.zza);
        Preconditions.checkNotNull(zzrVar.zzs);
        zzE(new zzip(this, zzrVar));
        int i2 = asInterface + 75;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzy(final zzr zzrVar) throws Throwable {
        int i = 2 % 2;
        Preconditions.checkNotEmpty(zzrVar.zza);
        Preconditions.checkNotNull(zzrVar.zzs);
        zzE(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzF(zzrVar);
            }
        });
        int i2 = asBinder + 103;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzz(final zzr zzrVar) throws Throwable {
        int i = 2 % 2;
        Preconditions.checkNotEmpty(zzrVar.zza);
        Preconditions.checkNotNull(zzrVar.zzs);
        zzE(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzix
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzG(zzrVar);
            }
        });
        int i2 = asInterface + 21;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    final void zzE(Runnable runnable) throws Throwable {
        Object[] objArrB$7879113;
        int i = 2 % 2;
        int i2 = asBinder + 95;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        int i4 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (29944 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
            int i5 = 1755 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int iIndexOf = 22 - TextUtils.indexOf((CharSequence) "", '0');
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr = new Object[1];
            a(b2, b3, (byte) (b3 | 89), objArr);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i5, iIndexOf, 986134021, false, (String) objArr[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr2 = new Object[1];
        c(ImageFormat.getBitsPerPixel(0) - 727653141, (ViewConfiguration.getWindowTouchSlop() >> 8) + 11, (short) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 18), (byte) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) - 452983325, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        c(TextUtils.indexOf((CharSequence) "", '0', 0) - 727653137, (Process.myTid() >> 22) + 4, (short) (91 - Drawable.resolveOpacity(0, 0)), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (KeyEvent.getMaxKeyCode() >> 16) - 452983304, objArr3);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char keyRepeatDelay = (char) (29944 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
            int i6 = 1754 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            int maximumDrawingCacheSize = 23 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            byte[] bArr = $$a;
            Object[] objArr4 = new Object[1];
            a(bArr[7], bArr[5], (byte) ($$b & 116), objArr4);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(keyRepeatDelay, i6, maximumDrawingCacheSize, 1596667560, false, (String) objArr4[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) (29944 - TextUtils.indexOf("", "", 0));
                int i7 = 1756 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                int iRed = 23 - Color.red(0);
                byte[] bArr2 = $$a;
                byte b4 = bArr2[7];
                Object[] objArr5 = new Object[1];
                a(b4, bArr2[5], b4, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, i7, iRed, 1599039318, false, (String) objArr5[0], null);
            }
            Object[] objArr6 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i8 = ((int[]) objArr6[0])[0];
            objArrB$7879113 = new Object[]{new int[]{i8}, new int[]{((int[]) objArr6[1])[0]}, (Object[]) objArr6[2], new int[1], (String[]) objArr6[4]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i9 = ~iUptimeMillis;
            int i10 = 2105103201 + (((~((-418033217) | i9)) | 8563776) * (-108)) + (((~(i9 | 630635642)) | (~((-630635643) | iUptimeMillis)) | (-1040105083)) * 54) + ((iUptimeMillis | (-1040105083)) * 54) + 1560953962;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArrB$7879113[3])[0] = i12 ^ (i12 << 5);
        } else {
            Object[] objArr7 = new Object[1];
            c((-727653133) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf("", "") + 5, (short) (TextUtils.lastIndexOf("", '0') - 96), (byte) (KeyEvent.getMaxKeyCode() >> 16), (-452983290) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr7);
            Class<?> cls2 = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            c((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 727653134, 5 - Color.red(0), (short) ((-113) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (byte) (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.getOffsetAfter("", 0) - 452983275, objArr8);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr9 = {-1027529082};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ExpandableListView.getPackedPositionGroup(0L) + 42049), 1726 - KeyEvent.getDeadChar(0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 30, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrB$7879113 = onScroll.b$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr9), 1560953962, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c2 = (char) (29944 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    int i13 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1755;
                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 23;
                    byte[] bArr3 = $$a;
                    byte b5 = bArr3[7];
                    Object[] objArr10 = new Object[1];
                    a(b5, bArr3[5], b5, objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, i13, fadingEdgeLength, 1599039318, false, (String) objArr10[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrB$7879113);
                try {
                    Object[] objArr11 = new Object[1];
                    c((-727653143) - Process.getGidForName(""), 11 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (short) (18 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (byte) Drawable.resolveOpacity(0, 0), (-452983326) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    c((-727653138) - (Process.myTid() >> 22), 4 - Drawable.resolveOpacity(0, 0), (short) (91 - View.MeasureSpec.getSize(0)), (byte) TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) - 452983304, objArr12);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c3 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 29943);
                        int iRed2 = 1755 - Color.red(0);
                        int iAxisFromString = 22 - MotionEvent.axisFromString("");
                        byte[] bArr4 = $$a;
                        Object[] objArr13 = new Object[1];
                        a(bArr4[7], bArr4[5], (byte) ($$b & 116), objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, iRed2, iAxisFromString, 1596667560, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29944);
                        int i14 = 1756 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        int size = View.MeasureSpec.getSize(0) + 23;
                        byte b6 = $$a[7];
                        byte b7 = b6;
                        Object[] objArr14 = new Object[1];
                        a(b6, b7, (byte) (b7 | 89), objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(scrollBarFadeDuration, i14, size, 986134021, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i15 = ((int[]) objArrB$7879113[1])[0];
        int i16 = ((int[]) objArrB$7879113[0])[0];
        if (i16 != i15) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArrB$7879113[4];
            if (strArr != null) {
                int i17 = asBinder + 75;
                while (true) {
                    asInterface = i17 % 128;
                    int i18 = i17 % 2;
                    if (i4 >= strArr.length) {
                        break;
                    }
                    arrayList.add(strArr[i4]);
                    i4++;
                    i17 = asBinder + 49;
                }
            }
            throw new RuntimeException(String.valueOf(i16));
        }
        int i19 = ((int[]) objArrB$7879113[3])[0];
        int i20 = ((int[]) objArrB$7879113[0])[0];
        Object[] objArr15 = {new int[]{i20}, new int[]{((int[]) objArrB$7879113[1])[0]}, (Object[]) objArrB$7879113[2], new int[1], (String[]) objArrB$7879113[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i21 = ~iIdentityHashCode;
        int i22 = i19 + 273229417 + ((~(18046860 | i21)) * (-560)) + ((~(iIdentityHashCode | (-176726050))) * (-560)) + (((~(194555565 | i21)) | 217344) * 560);
        int i23 = (i22 << 13) ^ i22;
        int i24 = i23 ^ (i23 >>> 17);
        ((int[]) objArr15[3])[0] = i24 ^ (i24 << 5);
        Preconditions.checkNotNull(runnable);
        zzpg zzpgVar = this.zza;
        if (zzpgVar.zzaW().zze()) {
            runnable.run();
        } else {
            zzpgVar.zzaW().zzl(runnable);
        }
    }

    final void zzd(Runnable runnable) {
        int i = 2 % 2;
        Preconditions.checkNotNull(runnable);
        zzpg zzpgVar = this.zza;
        if (zzpgVar.zzaW().zze()) {
            int i2 = asBinder + 1;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                runnable.run();
                return;
            } else {
                runnable.run();
                int i3 = 55 / 0;
                return;
            }
        }
        zzpgVar.zzaW().zzj(runnable);
        int i4 = asInterface + 23;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzh(zzbg zzbgVar, String str, String str2) {
        int i = 2 % 2;
        Preconditions.checkNotNull(zzbgVar);
        Preconditions.checkNotEmpty(str);
        zzO(str, true);
        zzd(new zzis(this, zzbgVar, str));
        int i2 = asBinder + 7;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzu(final Bundle bundle, final zzr zzrVar) {
        int i = 2 % 2;
        zzN(zzrVar, false);
        final String str = zzrVar.zza;
        Preconditions.checkNotNull(str);
        zzd(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws Throwable {
                this.zza.zzK(bundle, str, zzrVar);
            }
        });
        int i2 = asInterface + 3;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    final /* synthetic */ void zzH(zzr zzrVar, Bundle bundle, zzge zzgeVar, String str) {
        int i = 2 % 2;
        int i2 = asBinder + 7;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        zzpg zzpgVar = this.zza;
        zzpgVar.zzZ();
        try {
            zzgeVar.zze(zzpgVar.zzaq(zzrVar, bundle));
            int i4 = asBinder + 77;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 11 / 0;
            }
        } catch (RemoteException e2) {
            this.zza.zzaV().zzb().zzc("Failed to return trigger URIs for app", str, e2);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzn(zzah zzahVar, zzr zzrVar) {
        int i = 2 % 2;
        Preconditions.checkNotNull(zzahVar);
        Preconditions.checkNotNull(zzahVar.zzc);
        zzN(zzrVar, false);
        zzah zzahVar2 = new zzah(zzahVar);
        zzahVar2.zza = zzrVar.zza;
        zzd(new zzih(this, zzahVar2, zzrVar));
        int i2 = asInterface + 81;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final void zzo(zzah zzahVar) {
        int i = 2 % 2;
        Preconditions.checkNotNull(zzahVar);
        Preconditions.checkNotNull(zzahVar.zzc);
        Preconditions.checkNotEmpty(zzahVar.zza);
        zzO(zzahVar.zza, true);
        zzd(new zzii(this, new zzah(zzahVar)));
        int i2 = asInterface + 27;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if ("referrer API".equals(r0) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final com.google.android.gms.measurement.internal.zzbg zzc(com.google.android.gms.measurement.internal.zzbg r8, com.google.android.gms.measurement.internal.zzr r9) {
        /*
            r7 = this;
            r9 = 2
            int r0 = r9 % r9
            int r0 = com.google.android.gms.measurement.internal.zzjd.asBinder
            int r0 = r0 + 21
            int r1 = r0 % 128
            com.google.android.gms.measurement.internal.zzjd.asInterface = r1
            int r0 = r0 % r9
            java.lang.String r1 = "_cmp"
            if (r0 == 0) goto L6c
            java.lang.String r0 = r8.zza
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6b
            com.google.android.gms.measurement.internal.zzbe r3 = r8.zzb
            if (r3 == 0) goto L6b
            int r0 = r3.zze()
            if (r0 != 0) goto L23
            goto L6b
        L23:
            java.lang.String r0 = "_cis"
            java.lang.String r0 = r3.zzd(r0)
            java.lang.String r1 = "referrer broadcast"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L42
            int r1 = com.google.android.gms.measurement.internal.zzjd.asBinder
            int r1 = r1 + 31
            int r2 = r1 % 128
            com.google.android.gms.measurement.internal.zzjd.asInterface = r2
            int r1 = r1 % r9
            java.lang.String r1 = "referrer API"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6b
        L42:
            com.google.android.gms.measurement.internal.zzpg r0 = r7.zza
            com.google.android.gms.measurement.internal.zzgu r0 = r0.zzaV()
            com.google.android.gms.measurement.internal.zzgs r0 = r0.zzi()
            java.lang.String r1 = "Event has been filtered "
            java.lang.String r2 = r8.toString()
            r0.zzb(r1, r2)
            com.google.android.gms.measurement.internal.zzbg r0 = new com.google.android.gms.measurement.internal.zzbg
            java.lang.String r2 = "_cmpx"
            java.lang.String r4 = r8.zzc
            long r5 = r8.zzd
            r1 = r0
            r1.<init>(r2, r3, r4, r5)
            int r8 = com.google.android.gms.measurement.internal.zzjd.asBinder
            int r8 = r8 + 7
            int r1 = r8 % 128
            com.google.android.gms.measurement.internal.zzjd.asInterface = r1
            int r8 = r8 % r9
            return r0
        L6b:
            return r8
        L6c:
            java.lang.String r8 = r8.zza
            r1.equals(r8)
            r8 = 0
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjd.zzc(com.google.android.gms.measurement.internal.zzbg, com.google.android.gms.measurement.internal.zzr):com.google.android.gms.measurement.internal.zzbg");
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List zzr(String str, String str2, zzr zzrVar) {
        int i = 2 % 2;
        zzN(zzrVar, false);
        String str3 = zzrVar.zza;
        Preconditions.checkNotNull(str3);
        try {
            List list = (List) this.zza.zzaW().zzh(new zzil(this, str3, str, str2)).get();
            int i2 = asInterface + 103;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return list;
        } catch (InterruptedException | ExecutionException e2) {
            this.zza.zzaV().zzb().zzb("Failed to get conditional user properties", e2);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List zzs(String str, String str2, String str3) {
        int i = 2 % 2;
        zzO(str, true);
        try {
            List list = (List) this.zza.zzaW().zzh(new zzim(this, str, str2, str3)).get();
            int i2 = asInterface + 17;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                return list;
            }
            throw null;
        } catch (InterruptedException | ExecutionException e2) {
            this.zza.zzaV().zzb().zzb("Failed to get conditional user properties as", e2);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final zzao zzw(zzr zzrVar) {
        int i = 2 % 2;
        zzN(zzrVar, false);
        Preconditions.checkNotEmpty(zzrVar.zza);
        try {
            zzao zzaoVar = (zzao) this.zza.zzaW().zzi(new zziq(this, zzrVar)).get(10000L, TimeUnit.MILLISECONDS);
            int i2 = asInterface + 27;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return zzaoVar;
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            this.zza.zzaV().zzb().zzc("Failed to get consent. appId", zzgu.zzl(zzrVar.zza), e2);
            zzao zzaoVar2 = new zzao(null);
            int i4 = asInterface + 17;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 54 / 0;
            }
            return zzaoVar2;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List zzq(String str, String str2, String str3, boolean z) {
        int i = 2 % 2;
        zzO(str, true);
        try {
            List list = (List) this.zza.zzaW().zzh(new zzik(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (true) {
                Object obj = null;
                if (!it.hasNext()) {
                    int i2 = asBinder + 31;
                    asInterface = i2 % 128;
                    if (i2 % 2 != 0) {
                        return arrayList;
                    }
                    obj.hashCode();
                    throw null;
                }
                int i3 = asBinder + 25;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                zzpn zzpnVar = (zzpn) it.next();
                if (!z) {
                    int i5 = asBinder + 49;
                    asInterface = i5 % 128;
                    if (i5 % 2 == 0) {
                        zzpp.zzZ(zzpnVar.zzc);
                        throw null;
                    }
                    if (!zzpp.zzZ(zzpnVar.zzc)) {
                    }
                }
                arrayList.add(new zzpl(zzpnVar));
            }
        } catch (InterruptedException | ExecutionException e2) {
            this.zza.zzaV().zzb().zzc("Failed to get user properties as. appId", zzgu.zzl(str), e2);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List zzj(zzr zzrVar, boolean z) {
        int i = 2 % 2;
        zzN(zzrVar, false);
        String str = zzrVar.zza;
        Preconditions.checkNotNull(str);
        Object obj = null;
        try {
            List<zzpn> list = (List) this.zza.zzaW().zzh(new zzid(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzpn zzpnVar : list) {
                int i2 = asInterface + 105;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                if (!z) {
                    int i4 = asBinder + 7;
                    asInterface = i4 % 128;
                    if (i4 % 2 == 0) {
                        zzpp.zzZ(zzpnVar.zzc);
                        throw null;
                    }
                    if (!zzpp.zzZ(zzpnVar.zzc)) {
                    }
                }
                arrayList.add(new zzpl(zzpnVar));
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e2) {
            this.zza.zzaV().zzb().zzc("Failed to get user properties. appId", zzgu.zzl(zzrVar.zza), e2);
            int i5 = asBinder + 111;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List zzp(String str, String str2, boolean z, zzr zzrVar) {
        int i = 2 % 2;
        zzN(zzrVar, false);
        String str3 = zzrVar.zza;
        Preconditions.checkNotNull(str3);
        try {
            List list = (List) this.zza.zzaW().zzh(new zzij(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int i2 = asInterface + 77;
                asBinder = i2 % 128;
                if (i2 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                zzpn zzpnVar = (zzpn) it.next();
                if (z || !zzpp.zzZ(zzpnVar.zzc)) {
                    arrayList.add(new zzpl(zzpnVar));
                }
            }
            int i3 = asBinder + 105;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            return arrayList;
        } catch (InterruptedException | ExecutionException e2) {
            this.zza.zzaV().zzb().zzc("Failed to query user properties. appId", zzgu.zzl(zzrVar.zza), e2);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final List zzx(zzr zzrVar, Bundle bundle) {
        int i = 2 % 2;
        int i2 = asInterface + 35;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        zzN(zzrVar, false);
        Preconditions.checkNotNull(zzrVar.zza);
        zzpg zzpgVar = this.zza;
        if (zzpgVar.zzd().zzp(null, zzfy.zzaY)) {
            try {
                return (List) zzpgVar.zzaW().zzi(new zziv(this, zzrVar, bundle)).get(10000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                this.zza.zzaV().zzb().zzc("Failed to get trigger URIs. appId", zzgu.zzl(zzrVar.zza), e2);
                return Collections.emptyList();
            }
        }
        try {
            List list = (List) this.zza.zzaW().zzh(new zziw(this, zzrVar, bundle)).get();
            int i4 = asInterface + 109;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return list;
        } catch (InterruptedException | ExecutionException e3) {
            this.zza.zzaV().zzb().zzc("Failed to get trigger URIs. appId", zzgu.zzl(zzrVar.zza), e3);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public final byte[] zzk(zzbg zzbgVar, String str) {
        int i = 2 % 2;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzbgVar);
        zzO(str, true);
        zzpg zzpgVar = this.zza;
        zzgs zzgsVarZzj = zzpgVar.zzaV().zzj();
        zzgn zzgnVarZzs = zzpgVar.zzs();
        String str2 = zzbgVar.zza;
        zzgsVarZzj.zzb("Log and bundle. event", zzgnVarZzs.zza(str2));
        long jNanoTime = zzpgVar.zzaZ().nanoTime() / AnimationKt.MillisToNanos;
        try {
            byte[] bArr = (byte[]) zzpgVar.zzaW().zzi(new zzit(this, zzbgVar, str)).get();
            if (bArr == null) {
                int i2 = asBinder + 49;
                asInterface = i2 % 128;
                if (i2 % 2 == 0) {
                    zzpgVar.zzaV().zzb().zzb("Log and bundle returned null. appId", zzgu.zzl(str));
                    bArr = new byte[1];
                } else {
                    zzpgVar.zzaV().zzb().zzb("Log and bundle returned null. appId", zzgu.zzl(str));
                    bArr = new byte[0];
                }
            }
            zzpgVar.zzaV().zzj().zzd("Log and bundle processed. event, size, time_ms", zzpgVar.zzs().zza(str2), Integer.valueOf(bArr.length), Long.valueOf((zzpgVar.zzaZ().nanoTime() / AnimationKt.MillisToNanos) - jNanoTime));
            int i3 = asBinder + 49;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            return bArr;
        } catch (InterruptedException | ExecutionException e2) {
            zzpg zzpgVar2 = this.zza;
            zzpgVar2.zzaV().zzb().zzd("Failed to log and bundle. appId, event, error", zzgu.zzl(str), zzpgVar2.zzs().zza(zzbgVar.zza), e2);
            int i5 = asInterface + 47;
            asBinder = i5 % 128;
            Object obj = null;
            if (i5 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v23, types: [int] */
    /* JADX WARN: Type inference failed for: r2v24, types: [com.google.android.gms.measurement.internal.zzje] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    final /* synthetic */ void zzK(Bundle bundle, String str, zzr zzrVar) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 11;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        zzpg zzpgVar = this.zza;
        boolean zZzp = zzpgVar.zzd().zzp(null, zzfy.zzaV);
        if (bundle.isEmpty()) {
            int i4 = asInterface;
            int i5 = i4 + 79;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            if (zZzp) {
                int i7 = i4 + 57;
                ?? r2 = i7 % 128;
                asBinder = r2;
                try {
                    if (i7 % 2 != 0) {
                        zzav zzavVarZzj = this.zza.zzj();
                        zzavVarZzj.zzg();
                        zzavVarZzj.zzaw();
                        SQLiteDatabase sQLiteDatabaseZze = zzavVarZzj.zze();
                        String[] strArr = new String[0];
                        strArr[1] = str;
                        sQLiteDatabaseZze.execSQL("delete from default_event_params where app_id=?", strArr);
                        r2 = zzavVarZzj;
                    } else {
                        zzav zzavVarZzj2 = this.zza.zzj();
                        zzavVarZzj2.zzg();
                        zzavVarZzj2.zzaw();
                        zzavVarZzj2.zze().execSQL("delete from default_event_params where app_id=?", new String[]{str});
                        r2 = zzavVarZzj2;
                    }
                    return;
                } catch (SQLiteException e2) {
                    r2.zzu.zzaV().zzb().zzb("Error clearing default event params", e2);
                    return;
                }
            }
        }
        zzav zzavVarZzj3 = zzpgVar.zzj();
        zzavVarZzj3.zzg();
        zzavVarZzj3.zzaw();
        byte[] bArrZzcc = zzavVarZzj3.zzg.zzp().zzh(new zzbb(zzavVarZzj3.zzu, "", str, "dep", 0L, 0L, bundle)).zzcc();
        zzic zzicVar = zzavVarZzj3.zzu;
        zzicVar.zzaV().zzk().zzc("Saving default event parameters, appId, data size", str, Integer.valueOf(bArrZzcc.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put(DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, bArrZzcc);
        try {
            if (zzavVarZzj3.zze().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                zzicVar.zzaV().zzb().zzb("Failed to insert default event parameters (got -1). appId", zzgu.zzl(str));
                int i8 = asBinder + 23;
                asInterface = i8 % 128;
                int i9 = i8 % 2;
            }
        } catch (SQLiteException e3) {
            zzavVarZzj3.zzu.zzaV().zzb().zzc("Error storing default event parameters. appId", zzgu.zzl(str), e3);
        }
        zzpg zzpgVar2 = this.zza;
        zzav zzavVarZzj4 = zzpgVar2.zzj();
        long j = zzrVar.zzD;
        if (zzavVarZzj4.zzV(str, j)) {
            zzpgVar2.zzj().zzW(str, Long.valueOf(j), null, bundle);
        }
    }

    final void zzb(zzbg zzbgVar, zzr zzrVar) {
        com.google.android.gms.internal.measurement.zzc zzcVar;
        int i = 2 % 2;
        zzpg zzpgVar = this.zza;
        zzht zzhtVarZzh = zzpgVar.zzh();
        String str = zzrVar.zza;
        if (TextUtils.isEmpty(str)) {
            int i2 = asBinder + 37;
            asInterface = i2 % 128;
            zzcVar = null;
            if (i2 % 2 == 0) {
                zzcVar.hashCode();
                throw null;
            }
        } else {
            zzcVar = (com.google.android.gms.internal.measurement.zzc) zzhtVarZzh.zzd.get(str);
        }
        if (zzcVar == null) {
            this.zza.zzaV().zzk().zzb("EES not loaded for", zzrVar.zza);
            zzM(zzbgVar, zzrVar);
            return;
        }
        try {
            Map mapZzz = zzpgVar.zzp().zzz(zzbgVar.zzb.zzf(), true);
            String str2 = zzbgVar.zza;
            String strZza = zzjm.zza(str2);
            if (strZza != null) {
                int i3 = asBinder + 33;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                str2 = strZza;
            }
            if (zzcVar.zzb(new com.google.android.gms.internal.measurement.zzaa(str2, zzbgVar.zzd, mapZzz))) {
                if (zzcVar.zzc()) {
                    zzpg zzpgVar2 = this.zza;
                    zzpgVar2.zzaV().zzk().zzb("EES edited event", zzbgVar.zza);
                    zzM(zzpgVar2.zzp().zzA(zzcVar.zze().zzc()), zzrVar);
                } else {
                    zzM(zzbgVar, zzrVar);
                }
                if (zzcVar.zzd()) {
                    for (com.google.android.gms.internal.measurement.zzaa zzaaVar : zzcVar.zze().zzf()) {
                        int i5 = asBinder + 51;
                        asInterface = i5 % 128;
                        int i6 = i5 % 2;
                        zzpg zzpgVar3 = this.zza;
                        zzpgVar3.zzaV().zzk().zzb("EES logging created event", zzaaVar.zzb());
                        zzM(zzpgVar3.zzp().zzA(zzaaVar), zzrVar);
                    }
                    return;
                }
                return;
            }
        } catch (com.google.android.gms.internal.measurement.zzd unused) {
            this.zza.zzaV().zzb().zzc("EES error. appId, eventName", zzrVar.zzb, zzbgVar.zza);
        }
        this.zza.zzaV().zzk().zzb("EES was not applied to event", zzbgVar.zza);
        zzM(zzbgVar, zzrVar);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0079  */
    /* JADX WARN: Code duplicated, block: B:51:0x024a  */
    private static void c(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        int i4;
        boolean z;
        int i5 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            long j = 0;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ExpandableListView.getPackedPositionType(0L), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2266, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 32, 1387473586, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            int i6 = -1;
            if (iIntValue == -1) {
                int i7 = $11 + 1;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    i4 = 0;
                } else {
                    i4 = 1;
                }
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                byte[] bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (bArr != null) {
                    int i8 = $11 + 63;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i10 = 0;
                    while (i10 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i10])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char c = (char) ((Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + i6);
                            int iNormalizeMetaState = 3358 - KeyEvent.normalizeMetaState(0);
                            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 18;
                            byte length2 = (byte) $$c.length;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iNormalizeMetaState, scrollBarSize, -1054011043, false, $$e((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE});
                        }
                        bArr2[i10] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        i10++;
                        i6 = -1;
                        j = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Process.myPid() >> 22), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2267, 33 - KeyEvent.normalizeMetaState(0), 1387473586, false, $$e(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                } else {
                    iIntValue = (short) (((short) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                int i11 = $11 + 121;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L)) + i4;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(b), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = (byte) (b7 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (((Process.getThreadPriority(0) + 20) >> 6) + 55904), 2855 - TextUtils.getOffsetBefore("", 0), 13 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -1529949196, false, $$e(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (bArr4 != null) {
                    int length3 = bArr4.length;
                    byte[] bArr5 = new byte[length3];
                    for (int i13 = 0; i13 < length3; i13++) {
                        int i14 = $10 + 81;
                        $11 = i14 % 128;
                        int i15 = i14 % 2;
                        bArr5[i13] = (byte) (((long) bArr4[i13]) ^ 3046761265686732006L);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i16 = $10 + 53;
                    $11 = i16 % 128;
                    if (i16 % 2 == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    int i17 = $10 + 51;
                    $11 = i17 % 128;
                    int i18 = i17 % 2;
                    if (!z) {
                        short[] sArr = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i19 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i19 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i19]) ^ 3046761265686732006L)) + s)) ^ b2));
                    } else {
                        byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i20 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i20 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i20]) ^ 3046761265686732006L)) + s)) ^ b2));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    final /* synthetic */ void zzI(String str, zzoo zzooVar, zzgh zzghVar) throws Throwable {
        int i = 2 % 2;
        zzpg zzpgVar = this.zza;
        zzpgVar.zzZ();
        zzpgVar.zzaW().zzg();
        zzpgVar.zzu();
        List listZzC = zzpgVar.zzj().zzC(str, zzooVar, ((Integer) zzfy.zzA.zzb(null)).intValue());
        ArrayList arrayList = new ArrayList();
        Iterator it = listZzC.iterator();
        while (it.hasNext()) {
            int i2 = asInterface + 85;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                zzpgVar.zzO(str, ((zzpj) it.next()).zze());
                throw null;
            }
            zzpj zzpjVar = (zzpj) it.next();
            if (zzpgVar.zzO(str, zzpjVar.zze())) {
                int iZzi = zzpjVar.zzi();
                if (iZzi > 0) {
                    if (iZzi <= ((Integer) zzfy.zzy.zzb(null)).intValue()) {
                        if (zzpgVar.zzaZ().currentTimeMillis() >= zzpjVar.zzh() + Math.min(((Long) zzfy.zzw.zzb(null)).longValue() * (1 << (iZzi - 1)), ((Long) zzfy.zzx.zzb(null)).longValue())) {
                        }
                    }
                    zzpgVar.zzaV().zzk().zzd("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str, Long.valueOf(zzpjVar.zzc()), Long.valueOf(zzpjVar.zzh()));
                }
                zzom zzomVarZzb = zzpjVar.zzb();
                try {
                    com.google.android.gms.internal.measurement.zzhz zzhzVar = (com.google.android.gms.internal.measurement.zzhz) zzpk.zzw(com.google.android.gms.internal.measurement.zzib.zzh(), zzomVarZzb.zzb);
                    for (int i3 = 0; i3 < zzhzVar.zzb(); i3++) {
                        com.google.android.gms.internal.measurement.zzic zzicVar = (com.google.android.gms.internal.measurement.zzic) zzhzVar.zzc(i3).zzcl();
                        zzicVar.zzs(zzpgVar.zzaZ().currentTimeMillis());
                        zzhzVar.zzd(i3, zzicVar);
                    }
                    zzomVarZzb.zzb = ((com.google.android.gms.internal.measurement.zzib) zzhzVar.zzbc()).zzcc();
                    if (Log.isLoggable(zzpgVar.zzaV().zzn(), 2)) {
                        zzomVarZzb.zzg = zzpgVar.zzp().zzi((com.google.android.gms.internal.measurement.zzib) zzhzVar.zzbc());
                    }
                    arrayList.add(zzomVarZzb);
                } catch (com.google.android.gms.internal.measurement.zzmr unused) {
                    zzpgVar.zzaV().zze().zzb("Failed to parse queued batch. appId", str);
                }
            } else {
                zzpgVar.zzaV().zzk().zzd("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str, Long.valueOf(zzpjVar.zzc()), zzpjVar.zze());
                int i4 = asBinder + 97;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        zzoq zzoqVar = new zzoq(arrayList);
        try {
            zzghVar.zze(zzoqVar);
            this.zza.zzaV().zzk().zzc("[sgtm] Sending queued upload batches to client. appId, count", str, Integer.valueOf(zzoqVar.zza.size()));
        } catch (RemoteException e2) {
            this.zza.zzaV().zzb().zzc("[sgtm] Failed to return upload batches for app", str, e2);
        }
    }

    final /* synthetic */ zzpg zzL() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 85;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        zzpg zzpgVar = this.zza;
        int i5 = i2 + 61;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 58 / 0;
        }
        return zzpgVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(byte r7, byte r8, int r9) {
        /*
            int r8 = r8 + 117
            int r9 = r9 * 2
            int r9 = r9 + 1
            byte[] r0 = com.google.android.gms.measurement.internal.zzjd.$$c
            int r7 = r7 * 3
            int r7 = r7 + 4
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L28
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r6
        L28:
            int r3 = -r3
            int r7 = r7 + r3
            int r8 = r8 + 1
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjd.$$e(byte, byte, int):java.lang.String");
    }
}

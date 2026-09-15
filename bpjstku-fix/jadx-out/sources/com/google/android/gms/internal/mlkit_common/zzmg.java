package com.google.android.gms.internal.mlkit_common;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.mlkit.common.sdkinternal.ModelType;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes6.dex */
public final class zzmg extends zzms {
    private final zziy zza;
    private final String zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final ModelType zze;
    private final zzje zzf;
    private final int zzg;
    private static final byte[] $$c = {83, -4, -55, -17};
    private static final int $$d = ModuleDescriptor.MODULE_VERSION;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {86, -48, ByteCompanionObject.MIN_VALUE, 88};
    private static final int $$b = 187;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int b = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -6377398940819159759L;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -981105359;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 18214;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 4
            int r5 = r5 + 98
            int r7 = r7 * 2
            int r0 = r7 + 1
            byte[] r1 = com.google.android.gms.internal.mlkit_common.zzmg.$$a
            int r6 = r6 * 2
            int r6 = 4 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L24:
            int r3 = r3 + 1
            r4 = r1[r6]
        L28:
            int r4 = -r4
            int r5 = r5 + r4
            int r6 = r6 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_common.zzmg.c(int, short, short, java.lang.Object[]):void");
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "RemoteModelLoggingOptions{errorCode=" + this.zza.toString() + ", tfliteSchemaVersion=" + this.zzb + ", shouldLogRoughDownloadTime=" + this.zzc + ", shouldLogExactDownloadTime=" + this.zzd + ", modelType=" + this.zze.toString() + ", downloadStatus=" + this.zzf.toString() + ", failureStatusCode=" + this.zzg + "}";
        int i2 = TuitionPaymentFragmentbindingInflater1 + 11;
        b = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = this.zza.hashCode();
        int iHashCode2 = this.zzb.hashCode();
        if (true != this.zzc) {
            int i3 = b + 59;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            int i4 = i3 % 2;
            i = 1237;
        } else {
            i = 1231;
        }
        int iHashCode3 = ((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ i) * 1000003) ^ (true != this.zzd ? 1237 : 1231)) * 1000003) ^ this.zze.hashCode()) * 1000003) ^ this.zzf.hashCode()) * 1000003) ^ this.zzg;
        int i5 = b + 123;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode3;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 5;
        b = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzms)) {
            return false;
        }
        zzms zzmsVar = (zzms) obj;
        if (!this.zza.equals(zzmsVar.zzc())) {
            return false;
        }
        int i3 = b + 5;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 != 0) {
            this.zzb.equals(zzmsVar.zze());
            obj2.hashCode();
            throw null;
        }
        if (!this.zzb.equals(zzmsVar.zze())) {
            return false;
        }
        int i4 = TuitionPaymentFragmentbindingInflater1 + 3;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            zzmsVar.zzg();
            obj2.hashCode();
            throw null;
        }
        if (this.zzc != zzmsVar.zzg() || this.zzd != zzmsVar.zzf() || !this.zze.equals(zzmsVar.zzb()) || !this.zzf.equals(zzmsVar.zzd())) {
            return false;
        }
        int i5 = TuitionPaymentFragmentbindingInflater1 + 87;
        b = i5 % 128;
        if (i5 % 2 != 0) {
            return this.zzg == zzmsVar.zza();
        }
        zzmsVar.zza();
        throw null;
    }

    private static void a(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        char c2;
        int i2 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i3 = $11 + 57;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.indexOf("", "") + 8328), (ViewConfiguration.getEdgeSlop() >> 16) + 1235, 35 - Color.argb(0, 0, 0, 0), -653973969, false, $$e(b2, b3, (byte) (b3 + 3)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.getCapsMode("", 0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2763, (Process.myPid() >> 22) + 14, 1504416861, false, $$e(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 43325), 252 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), View.getDefaultSize(0, 0) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c3 = (char) (65201 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2891;
                    int i5 = 17 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 - 1);
                    String str$$e = $$e(b6, b7, (byte) (-b7));
                    c2 = 2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c3, maximumDrawingCacheSize, i5, 2012627446, false, str$$e, new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    c2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                int i6 = $11 + 25;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* synthetic */ zzmg(zziy zziyVar, String str, boolean z, boolean z2, ModelType modelType, zzje zzjeVar, int i, zzmf zzmfVar) {
        this.zza = zziyVar;
        this.zzb = str;
        this.zzc = z;
        this.zzd = z2;
        this.zze = modelType;
        this.zzf = zzjeVar;
        this.zzg = i;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzms
    public final int zza() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 13;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        int i5 = this.zzg;
        int i6 = i3 + 89;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzms
    public final ModelType zzb() {
        int i = 2 % 2;
        int i2 = b + 11;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.zze;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzms
    public final zziy zzc() {
        int i = 2 % 2;
        int i2 = b + 67;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        zziy zziyVar = this.zza;
        int i4 = i3 + 111;
        b = i4 % 128;
        int i5 = i4 % 2;
        return zziyVar;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzms
    public final zzje zzd() {
        int i = 2 % 2;
        int i2 = b + 99;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        zzje zzjeVar = this.zzf;
        if (i3 != 0) {
            int i4 = 52 / 0;
        }
        return zzjeVar;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzms
    public final String zze() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 55;
        b = i3 % 128;
        int i4 = i3 % 2;
        String str = this.zzb;
        int i5 = i2 + 113;
        b = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzms
    public final boolean zzf() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 55;
        b = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.zzd;
        int i5 = i2 + 63;
        b = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzms
    public final boolean zzg() {
        boolean z;
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 121;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 != 0) {
            z = this.zzc;
            int i4 = 6 / 0;
        } else {
            z = this.zzc;
        }
        int i5 = i2 + 17;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 22 / 0;
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:98:0x0877 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:99:0x0878  */
    public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2) throws Throwable {
        int i3;
        int i4;
        int i5;
        String str;
        char c;
        Object[] objArr;
        Object[] objArr2;
        int i6;
        boolean zEquals;
        Object obj;
        int i7 = 2 % 2;
        long j = 0;
        try {
            String[] strArr = new String[2];
            int i8 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
            int i9 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            Object[] objArr3 = new Object[1];
            a(new char[]{0, 0, 0, 0}, new char[]{46884, 7026, 56880, 36688}, (char) (((i8 | 20702) << 1) - (i8 ^ 20702)), (i9 & 807105207) + (i9 | 807105207), new char[]{21965, 15007, 48910, 64008, 2113, 19530, 21211, 59153, 23848, 10659, 20219, 47691, 47563, 23013, 30131, 39245, 59225, 63422, 59498}, objArr3);
            strArr[0] = (String) objArr3[0];
            char[] cArr = {0, 0, 0, 0};
            char[] cArr2 = {64131, 32828, 6168, 56055};
            int i10 = b + 115;
            TuitionPaymentFragmentbindingInflater1 = i10 % 128;
            int i11 = i10 % 2;
            Object[] objArr4 = new Object[1];
            a(cArr, cArr2, (char) (63255 - (~(-(-TextUtils.getOffsetAfter("", 0))))), Color.alpha(0), new char[]{7396, 25576, 40028, 64311, 2468, 63755, 63639, 1633, 23664, 16490, 60524, 19663, 31111, 8143, 58679, 32214, 10321, 34807}, objArr4);
            strArr[1] = (String) objArr4[0];
            int i12 = 0;
            while (true) {
                if (i12 >= 2) {
                    i5 = i;
                    break;
                }
                String str2 = strArr[i12];
                char[] cArr3 = {0, 0, 0, 0};
                char[] cArr4 = {32963, 3926, 14566, 65237};
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(j);
                int i13 = b + 105;
                TuitionPaymentFragmentbindingInflater1 = i13 % 128;
                if (i13 % 2 != 0) {
                    Object[] objArr5 = new Object[1];
                    a(cArr3, cArr4, (char) (packedPositionGroup * 54584), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{7568, 19052, 59418, 32486, 36422, 32271, 37380, 38169, 44135, 54426, 18282, 40779, 31535, 11558, 51494, 10399}, objArr5);
                    obj = objArr5[0];
                } else {
                    int i14 = -packedPositionGroup;
                    Object[] objArr6 = new Object[1];
                    a(cArr3, cArr4, (char) (((i14 | 54584) << 1) - (i14 ^ 54584)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{7568, 19052, 59418, 32486, 36422, 32271, 37380, 38169, 44135, 54426, 18282, 40779, 31535, 11558, 51494, 10399}, objArr6);
                    obj = objArr6[0];
                }
                Class<?> cls = Class.forName((String) obj);
                if (((Boolean) cls.getMethod(str2, new Class[0]).invoke(cls, null)).booleanValue()) {
                    i3 = i & (-2);
                    i4 = (~i) & 1;
                    i5 = i3 | i4;
                    break;
                }
                i12 = ((i12 | 1) << 1) - (i12 ^ 1);
                j = 0;
            }
        } catch (Exception unused) {
            i3 = i & (-3);
            i4 = (~i) & 2;
        }
        try {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(109138771);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char c2 = (char) (2419 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                int iIndexOf = TextUtils.indexOf("", "") + 2845;
                int iMakeMeasureSpec = 5 - View.MeasureSpec.makeMeasureSpec(0, 0);
                byte b2 = (byte) 0;
                byte b3 = b2;
                Object[] objArr7 = new Object[1];
                c(b2, b3, b3, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, iIndexOf, iMakeMeasureSpec, -501222268, false, (String) objArr7[0], new Class[0]);
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
            long j2 = 309979741;
            long j3 = 868;
            long j4 = -1;
            long j5 = j2 ^ j4;
            long jMyTid = Process.myTid();
            long j6 = jMyTid ^ j4;
            long j7 = jLongValue ^ j4;
            long j8 = j5 | j7;
            long j9 = (j3 * j2) + (j3 * jLongValue) + (((long) (-867)) * (((j5 | j6) ^ j4) | ((j7 | j6) ^ j4))) + (((long) (-1734)) * ((j8 ^ j4) | ((j5 | jMyTid) ^ j4) | ((j7 | jMyTid) ^ j4))) + (((long) 867) * (((j8 | j6) ^ j4) | (((j5 | jLongValue) | jMyTid) ^ j4) | (((j7 | j2) | jMyTid) ^ j4))) + ((long) (-1469166427));
            int i15 = (((~((-131331) | i)) | (-2011167728)) * TypedValues.PositionType.TYPE_TRANSITION_EASING) - 350852752;
            int i16 = ~i;
            int i17 = ((int) (j9 >> 32)) & (i15 + ((~((-131331) | i16)) * TypedValues.PositionType.TYPE_TRANSITION_EASING));
            int i18 = ((int) j9) & ((-1009536215) + (((~((-799348704) | i)) | (-2058392183)) * (-948)) + ((~((-715133527) | i16)) * (-948)) + 1768389880);
            int i19 = (i18 & i17) | (i17 ^ i18);
            int i20 = (i19 | 1) & (~(i19 & 1));
            int i21 = TuitionPaymentFragmentbindingInflater1 + 71;
            b = i21 % 128;
            int i22 = i21 % 2;
            int i23 = (i20 | (-i20)) >> 31;
            int i24 = ((i & (-11)) | (i16 & 10)) & (~i23);
            int i25 = i23 & i;
            int i26 = (i25 & i24) | (i24 ^ i25);
            int i27 = ((~i5) & i) | (i5 & i16);
            int i28 = (i27 | (-i27)) >> 31;
            int i29 = i26 & (~i28);
            int i30 = i5 & i28;
            int i31 = (i29 ^ i30) | (i30 & i29);
            try {
                int defaultSize = View.getDefaultSize(0, 0);
                int i32 = (defaultSize * (-432)) + 7884478;
                int i33 = (~defaultSize) | i16;
                int i34 = -(-((~((i33 & 18167) | (i33 ^ 18167))) * 433));
                int i35 = (i32 & i34) + (i32 | i34);
                int i36 = ~defaultSize;
                int i37 = ~((-18168) | i);
                int i38 = -(-(((i36 ^ i37) | (i37 & i36)) * (-433)));
                char c3 = (char) ((i35 & i38) + (i38 | i35) + (((~((defaultSize & 18167) | (defaultSize ^ 18167))) | (~((i36 & i) | (i36 ^ i)))) * 433));
                int i39 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                int i40 = i39 * (-716);
                int i41 = ((i40 | 1435) << 1) - (i40 ^ 1435);
                int i42 = ~i39;
                int i43 = -(-(((i42 ^ 1) | (i42 & 1)) * (-1434)));
                int i44 = (i41 & i43) + (i43 | i41);
                int i45 = ~((i16 ^ 1) | (i16 & 1));
                int i46 = ~(i39 | 1);
                int i47 = (i45 ^ i46) | (i45 & i46);
                int i48 = ~((~i39) | (-2) | i);
                int i49 = ((i47 ^ i48) | (i47 & i48)) * 717;
                int i50 = (i44 ^ i49) + ((i44 & i49) << 1);
                int i51 = ~((i42 ^ (-2)) | (i42 & (-2)) | i16);
                int i52 = ~((i39 & 1) | (i39 ^ 1));
                int i53 = (i51 & i52) | (i51 ^ i52);
                int i54 = ~(i | 1);
                int i55 = -(-(((i53 & i54) | (i53 ^ i54)) * 717));
                Object[] objArr8 = new Object[1];
                a(new char[]{0, 0, 0, 0}, new char[]{48754, 7465, 63406, 4166}, c3, (i50 & i55) + (i55 | i50), new char[]{45088, 9935, 21971, 15536, 1618, 41905, 59784, 37753, 54394, 9053, 17314, 38499, 57295, 44316, 25270, 17041, 23602, 47932, 2792, 29701, 6260, 50575, 15048, 65256, 37491, 38734, 3986, 16868, 21950, 38324, 32341, 19372, 1229, 43113, 51054, 12614, 64812, 11103, 29690, 244}, objArr8);
                File file = new File((String) objArr8[0]);
                int i56 = TuitionPaymentFragmentbindingInflater1;
                int i57 = ((i56 | 93) << 1) - (i56 ^ 93);
                b = i57 % 128;
                int i58 = i57 % 2;
                if (file.canRead()) {
                    FileReader fileReader = new FileReader(file);
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    try {
                        String line = bufferedReader.readLine();
                        int iIndexOf2 = TextUtils.indexOf("", "", 0);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = com.google.android.gms.internal.identity.zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i59 = iIndexOf2 * 367;
                        int i60 = (i59 ^ 15263897) + ((i59 & 15263897) << 1) + ((iIndexOf2 | 41591) * (-366));
                        int i61 = ((~((-41592) | iTuitionPaymentFragmentspecialinlinedviewModeldefault1)) | iIndexOf2) * (-366);
                        int i62 = (i60 ^ i61) + ((i60 & i61) << 1);
                        int i63 = ~iIndexOf2;
                        int i64 = ~((i63 ^ 41591) | (i63 & 41591));
                        int i65 = ((-41592) ^ iIndexOf2) | ((-41592) & iIndexOf2);
                        int i66 = ~((i65 & iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (i65 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                        char c4 = (char) (i62 + (((i64 & i66) | (i64 ^ i66)) * 366));
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0);
                        int i67 = absoluteGravity * 46;
                        int i68 = ~(((-60279295) ^ i16) | ((-60279295) & i16));
                        int i69 = (i67 ^ (-1522119772)) + ((i67 & (-1522119772)) << 1) + (((absoluteGravity ^ i68) | (i68 & absoluteGravity)) * (-90));
                        int i70 = ~((-60279295) | i);
                        int i71 = ~((absoluteGravity ^ 60279294) | (60279294 & absoluteGravity));
                        int i72 = -(-(((i70 ^ i71) | (i70 & i71)) * (-45)));
                        int i73 = (i69 ^ i72) + ((i69 & i72) << 1);
                        int i74 = ~absoluteGravity;
                        int i75 = ~((i74 ^ i) | (i74 & i));
                        int i76 = ((-60279295) ^ i75) | ((-60279295) & i75);
                        int i77 = ~i;
                        int i78 = ~((i77 ^ absoluteGravity) | (i77 & absoluteGravity));
                        int i79 = i76 ^ i78;
                        Object[] objArr9 = new Object[1];
                        a(new char[]{0, 0, 0, 0}, new char[]{65218, 38857, 30467, 54434}, c4, i73 + (((i78 & i76) | i79) * 45), new char[]{40596, 21205, 27003}, objArr9);
                        if (line.equals((String) objArr9[0])) {
                            fileReader.close();
                            bufferedReader.close();
                            com.google.android.gms.internal.identity.zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            str = null;
                        } else {
                            int i80 = TuitionPaymentFragmentbindingInflater1;
                            int i81 = (i80 ^ 45) + ((i80 & 45) << 1);
                            b = i81 % 128;
                            int i82 = i81 % 2;
                            fileReader.close();
                            bufferedReader.close();
                            int i83 = TuitionPaymentFragmentbindingInflater1 + 17;
                            b = i83 % 128;
                            int i84 = i83 % 2;
                            str = line;
                        }
                    } catch (Throwable th) {
                        fileReader.close();
                        bufferedReader.close();
                        throw th;
                    }
                } else {
                    int i85 = b + 95;
                    TuitionPaymentFragmentbindingInflater1 = i85 % 128;
                    int i86 = i85 % 2;
                    str = null;
                }
            } catch (Exception unused2) {
            }
            try {
                int i87 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int i88 = i87 * 980;
                int i89 = (i88 ^ (-48076524)) + ((i88 & (-48076524)) << 1);
                int i90 = (~((~i) | (-49159))) * 979;
                int i91 = (i89 ^ i90) + ((i90 & i89) << 1) + (((i87 ^ i) | (i87 & i)) * (-979));
                int i92 = ~(((-49159) ^ i) | ((-49159) & i));
                int i93 = ~((i87 & i16) | (i16 ^ i87));
                char c5 = (char) (i91 + (((i93 & i92) | (i92 ^ i93)) * 979));
                int i94 = -(ViewConfiguration.getTapTimeout() >> 16);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = com.google.android.gms.internal.identity.zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i95 = (i94 * 46) - (-375792948);
                int i96 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i97 = ~(((-755120247) ^ i96) | ((-755120247) & i96));
                int i98 = ((i94 ^ i97) | (i97 & i94)) * (-90);
                int i99 = ((i95 | i98) << 1) - (i98 ^ i95);
                int i100 = ~(((-755120247) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | ((-755120247) & iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                int i101 = ~((i94 ^ 755120246) | (755120246 & i94));
                int i102 = ((i100 ^ i101) | (i100 & i101)) * (-45);
                int i103 = (i99 & i102) + (i99 | i102);
                int i104 = ~i94;
                int i105 = ~((i104 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i104 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                int i106 = (((-755120247) & i105) | ((-755120247) ^ i105) | (~((i94 & i96) | (i96 ^ i94)))) * 45;
                Object[] objArr10 = new Object[1];
                a(new char[]{0, 0, 0, 0}, new char[]{30302, 568, 1581, 58816}, c5, (i103 ^ i106) + ((i106 & i103) << 1), new char[]{13430, 50872, 27441, 41646, 21377, 32544, 35487, 23011, 25195, 28287, 2297, 29467, 49065, 25968, 19040, 53354, 19980, 11593, 38772, 58787, 1524, 37775, 1263, 21753, 31664, 48737, 18401, 47732, 36356, 50563, 19416}, objArr10);
                File file2 = new File((String) objArr10[0]);
                int i107 = b + 25;
                TuitionPaymentFragmentbindingInflater1 = i107 % 128;
                if (i107 % 2 != 0) {
                    file2.canRead();
                    throw null;
                }
                if (file2.canRead()) {
                    FileReader fileReader2 = new FileReader(file2);
                    BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
                    try {
                        String line2 = bufferedReader2.readLine();
                        char[] cArr5 = {0, 0, 0, 0};
                        char[] cArr6 = {61026, 62287, 54236, 30238};
                        int i108 = b + 33;
                        TuitionPaymentFragmentbindingInflater1 = i108 % 128;
                        int i109 = i108 % 2;
                        int i110 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        int i111 = -TextUtils.indexOf((CharSequence) "", '0', 0);
                        Object[] objArr11 = new Object[1];
                        a(cArr5, cArr6, (char) ((i110 ^ 7890) + ((i110 & 7890) << 1)), (i111 ^ (-588034067)) + ((i111 & (-588034067)) << 1), new char[]{34720}, objArr11);
                        boolean zEquals2 = line2.equals((String) objArr11[0]);
                        int i112 = b;
                        int i113 = (i112 ^ 61) + ((i112 & 61) << 1);
                        TuitionPaymentFragmentbindingInflater1 = i113 % 128;
                        if (i113 % 2 != 0) {
                            fileReader2.close();
                            bufferedReader2.close();
                            throw null;
                        }
                        fileReader2.close();
                        bufferedReader2.close();
                        if (zEquals2) {
                            try {
                                Object[] objArr12 = new Object[1];
                                a(new char[]{0, 0, 0, 0}, new char[]{17506, 's', 24945, 2592}, (char) View.getDefaultSize(0, 0), Color.alpha(0), new char[]{1223, 44213, 2264, 51104, 33054, 62333, 56222, 43819, 52063, 56365, 31158, 35374, 5982, 63035, 56495, 26375, 17829, 45432, 23697, 35320, 52202, 17810, 55521, 45527, 7388, 40240, 10239, 15545, 7127, 52001, 9672, 8108, 62268, 23680, 23990, 10507}, objArr12);
                                File file3 = new File((String) objArr12[0]);
                                int i114 = TuitionPaymentFragmentbindingInflater1;
                                int i115 = (i114 ^ 75) + ((i114 & 75) << 1);
                                b = i115 % 128;
                                int i116 = i115 % 2;
                                if (!(!file3.canRead())) {
                                    FileReader fileReader3 = new FileReader(file3);
                                    BufferedReader bufferedReader3 = new BufferedReader(fileReader3);
                                    int i117 = b;
                                    int i118 = ((i117 | 105) << 1) - (i117 ^ 105);
                                    TuitionPaymentFragmentbindingInflater1 = i118 % 128;
                                    int i119 = i118 % 2;
                                    try {
                                        String line3 = bufferedReader3.readLine();
                                        int i120 = -Color.rgb(0, 0, 0);
                                        int i121 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                        Object[] objArr13 = new Object[1];
                                        a(new char[]{0, 0, 0, 0}, new char[]{61026, 62287, 54236, 30238}, (char) ((i120 ^ (-16769325)) + ((i120 & (-16769325)) << 1)), (i121 & (-588034067)) + (i121 | (-588034067)), new char[]{34720}, objArr13);
                                        zEquals = line3.equals((String) objArr13[0]);
                                        int i122 = TuitionPaymentFragmentbindingInflater1;
                                        int i123 = (i122 & 83) + (i122 | 83);
                                        b = i123 % 128;
                                        if (i123 % 2 == 0) {
                                            fileReader3.close();
                                            bufferedReader3.close();
                                            Object obj2 = null;
                                            obj2.hashCode();
                                            throw null;
                                        }
                                        fileReader3.close();
                                        bufferedReader3.close();
                                        int i124 = TuitionPaymentFragmentbindingInflater1 + 27;
                                        b = i124 % 128;
                                        int i125 = i124 % 2;
                                    } catch (Throwable th2) {
                                        fileReader3.close();
                                        bufferedReader3.close();
                                        throw th2;
                                    }
                                } else {
                                    zEquals = false;
                                }
                            } catch (Exception unused3) {
                            }
                            if (zEquals && str != null) {
                                int i126 = TuitionPaymentFragmentbindingInflater1 + 7;
                                int i127 = i126 % 128;
                                b = i127;
                                int i128 = i126 % 2;
                                objArr = new Object[2];
                                int[] iArr = new int[1];
                                objArr[0] = iArr;
                                int i129 = (i127 & 67) + (i127 | 67);
                                TuitionPaymentFragmentbindingInflater1 = i129 % 128;
                                int i130 = i129 % 2;
                                int i131 = (i & (-21)) | (i16 & 20);
                                String[] strArr2 = {str};
                                int i132 = i127 + 3;
                                TuitionPaymentFragmentbindingInflater1 = i132 % 128;
                                if (i132 % 2 != 0) {
                                    iArr[0] = i131;
                                    objArr[0] = strArr2;
                                } else {
                                    iArr[0] = i131;
                                    objArr[1] = strArr2;
                                }
                                c = 0;
                            }
                        }
                        int i133 = ((int[]) objArr[c])[c];
                        int i134 = ((~i31) & i) | (i31 & i16);
                        int i135 = -i134;
                        int i136 = ((i134 & i135) | (i134 ^ i135)) >> 31;
                        int i137 = (~i136) & i133;
                        int i138 = i136 & i31;
                        int i139 = (i138 & i137) | (i137 ^ i138);
                        Object obj3 = objArr[1];
                        int i140 = TuitionPaymentFragmentbindingInflater1 + 47;
                        int i141 = i140 % 128;
                        b = i141;
                        int i142 = i140 % 2;
                        Object[] objArr14 = new Object[2];
                        int i143 = (i133 | i) & (~(i & i133));
                        int i144 = ((i143 | (-i143)) >> 31) & 1;
                        int i145 = -i144;
                        int i146 = (~(((i145 & i144) | (i144 ^ i145)) >> 31)) & 1;
                        int i147 = (i141 ^ 83) + ((i141 & 83) << 1);
                        TuitionPaymentFragmentbindingInflater1 = i147 % 128;
                        int i148 = i147 % 2;
                        objArr14[i144] = null;
                        objArr14[i146] = (String[]) obj3;
                        String[] strArr3 = (String[]) objArr14[0];
                        int i149 = ((~i139) & i) | (i16 & i139);
                        int i150 = (i141 ^ 101) + ((i141 & 101) << 1);
                        TuitionPaymentFragmentbindingInflater1 = i150 % 128;
                        int i151 = i150 % 2;
                        int i152 = ((i149 | (-i149)) >> 31) & 16;
                        int i153 = ((i141 | 73) << 1) - (i141 ^ 73);
                        TuitionPaymentFragmentbindingInflater1 = i153 % 128;
                        int i154 = i153 % 2;
                        objArr2 = new Object[]{new int[]{i}, new int[1], new int[]{i139}, strArr3};
                        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                        int i155 = (((-208210156) + (((~((-148235266) | iFreeMemory)) | 143728641) * 1504)) + ((~(iFreeMemory | (-4506625))) * (-1504))) - 1170990880;
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = com.google.android.gms.internal.identity.zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i156 = i152 * 881;
                        int i157 = i155 * 881;
                        int i158 = (i156 ^ i157) + ((i156 & i157) << 1);
                        int i159 = ~i152;
                        int i160 = ~i155;
                        int i161 = ~((i159 ^ i160) | (i159 & i160));
                        int i162 = b + 31;
                        int i163 = i162 % 128;
                        TuitionPaymentFragmentbindingInflater1 = i163;
                        int i164 = i162 % 2;
                        int i165 = ~((i159 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i159 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                        int i166 = (i161 & i165) | (i161 ^ i165);
                        int i167 = ~((i160 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i160 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                        int i168 = (-880) * ((i167 & i166) | (i166 ^ i167));
                        int i169 = (i158 & i168) + (i158 | i168);
                        int i170 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i171 = (~((i159 & i170) | (i159 ^ i170))) | i155;
                        int i172 = ~(i152 | iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        int i173 = -(-(((i171 & i172) | (i171 ^ i172)) * (-880)));
                        int i174 = (i169 ^ i173) + ((i173 & i169) << 1) + ((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & i152) | (i152 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3))) * 880);
                        int i175 = (i163 & 113) + (i163 | 113);
                        b = i175 % 128;
                        int i176 = i175 % 2;
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = com.google.android.gms.internal.identity.zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i177 = i174 * (-661);
                        int i178 = i2 * (-661);
                        int i179 = ((i177 | i178) << 1) - (i177 ^ i178);
                        int i180 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                        int i181 = ~i174;
                        int i182 = ~i2;
                        int i183 = ~((i181 ^ i182) | (i181 & i182));
                        int i184 = ((i180 & i183) | (i180 ^ i183)) * 1324;
                        int i185 = (i179 & i184) + (i184 | i179) + (((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault4 & i2) | (i2 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4))) | (~((i174 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i174 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4)))) * (-1324));
                        int i186 = ~((i181 ^ i2) | (i181 & i2));
                        int i187 = ~((i182 ^ i174) | (i182 & i174));
                        int i188 = ((i186 & i187) | (i186 ^ i187)) * 662;
                        int i189 = ((i185 | i188) << 1) - (i188 ^ i185);
                        int i190 = i189 << 13;
                        int i191 = (i190 & (~i189)) | ((~i190) & i189);
                        int i192 = i191 >>> 17;
                        int i193 = ((~i191) & i192) | ((~i192) & i191);
                        int i194 = i193 << 5;
                        ((int[]) objArr2[1])[0] = ((~i193) & i194) | ((~i194) & i193);
                        i6 = b + 27;
                        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
                        if (i6 % 2 == 0) {
                            return objArr2;
                        }
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    } catch (Throwable th3) {
                        fileReader2.close();
                        bufferedReader2.close();
                        throw th3;
                    }
                }
            } catch (Exception unused4) {
            }
            c = 0;
            objArr = new Object[]{new int[]{i}, new String[0]};
            int i1310 = ((int[]) objArr[c])[c];
            int i1311 = ((~i31) & i) | (i31 & i16);
            int i1312 = -i1311;
            int i1313 = ((i1311 & i1312) | (i1311 ^ i1312)) >> 31;
            int i1314 = (~i1313) & i1310;
            int i1315 = i1313 & i31;
            int i1316 = (i1315 & i1314) | (i1314 ^ i1315);
            Object obj5 = objArr[1];
            int i1410 = TuitionPaymentFragmentbindingInflater1 + 47;
            int i1411 = i1410 % 128;
            b = i1411;
            int i1412 = i1410 % 2;
            Object[] objArr15 = new Object[2];
            int i1413 = (i1310 | i) & (~(i & i1310));
            int i1414 = ((i1413 | (-i1413)) >> 31) & 1;
            int i1415 = -i1414;
            int i1416 = (~(((i1415 & i1414) | (i1414 ^ i1415)) >> 31)) & 1;
            int i1417 = (i1411 ^ 83) + ((i1411 & 83) << 1);
            TuitionPaymentFragmentbindingInflater1 = i1417 % 128;
            int i1418 = i1417 % 2;
            objArr15[i1414] = null;
            objArr15[i1416] = (String[]) obj5;
            String[] strArr4 = (String[]) objArr15[0];
            int i1419 = ((~i1316) & i) | (i16 & i1316);
            int i1510 = (i1411 ^ 101) + ((i1411 & 101) << 1);
            TuitionPaymentFragmentbindingInflater1 = i1510 % 128;
            int i1511 = i1510 % 2;
            int i1512 = ((i1419 | (-i1419)) >> 31) & 16;
            int i1513 = ((i1411 | 73) << 1) - (i1411 ^ 73);
            TuitionPaymentFragmentbindingInflater1 = i1513 % 128;
            int i1514 = i1513 % 2;
            objArr2 = new Object[]{new int[]{i}, new int[1], new int[]{i1316}, strArr4};
            int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
            int i1515 = (((-208210156) + (((~((-148235266) | iFreeMemory2)) | 143728641) * 1504)) + ((~(iFreeMemory2 | (-4506625))) * (-1504))) - 1170990880;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = com.google.android.gms.internal.identity.zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i1516 = i1512 * 881;
            int i1517 = i1515 * 881;
            int i1518 = (i1516 ^ i1517) + ((i1516 & i1517) << 1);
            int i1519 = ~i1512;
            int i1610 = ~i1515;
            int i1611 = ~((i1519 ^ i1610) | (i1519 & i1610));
            int i1612 = b + 31;
            int i1613 = i1612 % 128;
            TuitionPaymentFragmentbindingInflater1 = i1613;
            int i1614 = i1612 % 2;
            int i1615 = ~((i1519 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i1519 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
            int i1616 = (i1611 & i1615) | (i1611 ^ i1615);
            int i1617 = ~((i1610 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i1610 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
            int i1618 = (-880) * ((i1617 & i1616) | (i1616 ^ i1617));
            int i1619 = (i1518 & i1618) + (i1518 | i1618);
            int i1710 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
            int i1711 = (~((i1519 & i1710) | (i1519 ^ i1710))) | i1515;
            int i1712 = ~(i1512 | iTuitionPaymentFragmentspecialinlinedviewModeldefault5);
            int i1713 = -(-(((i1711 & i1712) | (i1711 ^ i1712)) * (-880)));
            int i1714 = (i1619 ^ i1713) + ((i1713 & i1619) << 1) + ((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault5 & i1512) | (i1512 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5))) * 880);
            int i1715 = (i1613 & 113) + (i1613 | 113);
            b = i1715 % 128;
            int i1716 = i1715 % 2;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = com.google.android.gms.internal.identity.zzp.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i1717 = i1714 * (-661);
            int i1718 = i2 * (-661);
            int i1719 = ((i1717 | i1718) << 1) - (i1717 ^ i1718);
            int i1810 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
            int i1811 = ~i1714;
            int i1812 = ~i2;
            int i1813 = ~((i1811 ^ i1812) | (i1811 & i1812));
            int i1814 = ((i1810 & i1813) | (i1810 ^ i1813)) * 1324;
            int i1815 = (i1719 & i1814) + (i1814 | i1719) + (((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault6 & i2) | (i2 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6))) | (~((i1714 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (i1714 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6)))) * (-1324));
            int i1816 = ~((i1811 ^ i2) | (i1811 & i2));
            int i1817 = ~((i1812 ^ i1714) | (i1812 & i1714));
            int i1818 = ((i1816 & i1817) | (i1816 ^ i1817)) * 662;
            int i1819 = ((i1815 | i1818) << 1) - (i1818 ^ i1815);
            int i195 = i1819 << 13;
            int i196 = (i195 & (~i1819)) | ((~i195) & i1819);
            int i197 = i196 >>> 17;
            int i198 = ((~i196) & i197) | ((~i197) & i196);
            int i199 = i198 << 5;
            ((int[]) objArr2[1])[0] = ((~i198) & i199) | ((~i199) & i198);
            i6 = b + 27;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            if (i6 % 2 == 0) {
                return objArr2;
            }
            Object obj6 = null;
            obj6.hashCode();
            throw null;
        } catch (Throwable th4) {
            Throwable cause = th4.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(byte r6, byte r7, byte r8) {
        /*
            int r6 = r6 * 2
            int r0 = 1 - r6
            int r8 = 104 - r8
            byte[] r1 = com.google.android.gms.internal.mlkit_common.zzmg.$$c
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L15
            r4 = r8
            r3 = r2
            r8 = r7
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            int r7 = r7 + 1
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2a:
            int r4 = -r4
            int r7 = r7 + r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_common.zzmg.$$e(byte, byte, byte):java.lang.String");
    }
}

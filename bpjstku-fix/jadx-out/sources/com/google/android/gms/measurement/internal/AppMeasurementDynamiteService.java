package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes6.dex */
public class AppMeasurementDynamiteService extends com.google.android.gms.internal.measurement.zzcq {
    private static int $10 = 0;
    private static int $11 = 1;
    zzic zza = null;
    private final Map zzb = new ArrayMap();
    private static final byte[] $$d = {ByteCompanionObject.MAX_VALUE, 43, -39, -37, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -54, -3, -3, 72, -66, 13, 5, -4, 8, -2, 67, -56, -2, -3, 18, -10, 7, 16, -8, 65, -73, 28, -2, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 4, 6, 14, 5, -3, 11, -8, 6, -2, 5, 6, -2, 12, 4, -15, 16, 7, -15, 45, -31, 14, 2, -4, 11, 2, 2, 8, -17, 12, -5, 69, 4, 30, -15, 7, -14, 18, -2, 40, -38, 6, 9, -5, 9, 4};
    private static final int $$e = 83;
    private static final byte[] $$a = {114, -115, 48, 84, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 181;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static long b = 1969456260795575583L;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.$$a
            int r7 = r7 + 84
            int r1 = 53 - r8
            int r6 = r6 * 52
            int r6 = 107 - r6
            byte[] r1 = new byte[r1]
            int r8 = 52 - r8
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r7
            r3 = r2
            r7 = r6
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2c:
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.a(short, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = 111 - r6
            byte[] r0 = com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.$$d
            int r8 = 110 - r8
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L11
            r4 = r7
            r6 = r8
            r3 = r2
            goto L28
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r7) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L28:
            int r4 = -r4
            int r8 = r8 + r4
            int r8 = r8 + 3
            r5 = r8
            r8 = r6
            r6 = r5
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.d(short, short, int, java.lang.Object[]):void");
    }

    private final void zzb() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 125;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        if (this.zza == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
        int i5 = i2 + 43;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void zzc(com.google.android.gms.internal.measurement.zzcu zzcuVar, String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        zzb();
        this.zza.zzk().zzal(zzcuVar, str);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void beginAdUnitExposure(String str, long j) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 57;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            zzb();
            this.zza.zzw().zza(str, j);
        } else {
            zzb();
            this.zza.zzw().zza(str, j);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void clearMeasurementEnabled(long j) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            zzb();
            this.zza.zzj().zzn(null);
        } else {
            zzb();
            this.zza.zzj().zzn(null);
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void endAdUnitExposure(String str, long j) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        zzb();
        this.zza.zzw().zzb(str, j);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getCachedAppInstanceId(com.google.android.gms.internal.measurement.zzcu zzcuVar) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 93;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            zzb();
            zzc(zzcuVar, this.zza.zzj().zzQ());
        } else {
            zzb();
            zzc(zzcuVar, this.zza.zzj().zzQ());
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getCurrentScreenClass(com.google.android.gms.internal.measurement.zzcu zzcuVar) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            zzb();
            zzc(zzcuVar, this.zza.zzj().zzae());
        } else {
            zzb();
            zzc(zzcuVar, this.zza.zzj().zzae());
            int i3 = 94 / 0;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getCurrentScreenName(com.google.android.gms.internal.measurement.zzcu zzcuVar) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        zzb();
        zzc(zzcuVar, this.zza.zzj().zzad());
        int i4 = TuitionPaymentFragmentbindingInflater1 + 9;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getGmpAppId(com.google.android.gms.internal.measurement.zzcu zzcuVar) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            zzb();
            zzc(zzcuVar, this.zza.zzj().zzaf());
        } else {
            zzb();
            zzc(zzcuVar, this.zza.zzj().zzaf());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            zzb();
            this.zza.zzj().zzab(str, str2, bundle);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        zzb();
        this.zza.zzj().zzab(str, str2, bundle);
        int i3 = TuitionPaymentFragmentbindingInflater1 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 51 / 0;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getAppInstanceId(com.google.android.gms.internal.measurement.zzcu zzcuVar) throws RemoteException {
        int i = 2 % 2;
        zzb();
        this.zza.zzaW().zzj(new zzi(this, zzcuVar));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 65 / 0;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getConditionalUserProperties(String str, String str2, com.google.android.gms.internal.measurement.zzcu zzcuVar) throws RemoteException {
        int i = 2 % 2;
        zzb();
        this.zza.zzaW().zzj(new zzm(this, zzcuVar, str, str2));
        int i2 = TuitionPaymentFragmentbindingInflater1 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void generateEventId(com.google.android.gms.internal.measurement.zzcu zzcuVar) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            zzb();
            long jZzd = this.zza.zzk().zzd();
            zzb();
            this.zza.zzk().zzam(zzcuVar, jZzd);
            return;
        }
        zzb();
        long jZzd2 = this.zza.zzk().zzd();
        zzb();
        this.zza.zzk().zzam(zzcuVar, jZzd2);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getMaxUserProperties(String str, com.google.android.gms.internal.measurement.zzcu zzcuVar) throws RemoteException {
        zzpp zzppVarZzk;
        int i;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 != 0) {
            zzb();
            this.zza.zzj().zzY(str);
            zzb();
            zzppVarZzk = this.zza.zzk();
            i = 116;
        } else {
            zzb();
            this.zza.zzj().zzY(str);
            zzb();
            zzppVarZzk = this.zza.zzk();
            i = 25;
        }
        zzppVarZzk.zzan(zzcuVar, i);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $10 + 69;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (MotionEvent.axisFromString("") + 19473), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2624, View.combineMeasuredStates(0, 0) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (b ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - KeyEvent.normalizeMetaState(0)), TextUtils.lastIndexOf("", '0', 0, 0) + 482, (-16777179) - Color.rgb(0, 0, 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
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
        while (getrealtimecapturelatency.b < cArr.length) {
            int i6 = $11 + 15;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 39422), 481 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 36 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                throw null;
            }
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 39422), 481 - ExpandableListView.getPackedPositionType(0L), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 36, 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void initForTests(Map map) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        zzb();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        zzb();
        this.zza.zzj().zzC(str, str2, bundle, z, z2, j);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getUserProperties(String str, String str2, boolean z, com.google.android.gms.internal.measurement.zzcu zzcuVar) throws RemoteException {
        int i = 2 % 2;
        zzb();
        this.zza.zzaW().zzj(new zzk(this, zzcuVar, str, str2, z));
        int i2 = TuitionPaymentFragmentbindingInflater1 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 7 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        r1.zzaV().zze().zza("Attempting to initialize multiple times");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        r4.zza = com.google.android.gms.measurement.internal.zzic.zzy((android.content.Context) com.google.android.gms.common.internal.Preconditions.checkNotNull((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(r5)), r6, java.lang.Long.valueOf(r7));
        r5 = com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.TuitionPaymentFragmentbindingInflater1 + 9;
        com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r5 % 128;
        r5 = r5 % 2;
     */
    @Override // com.google.android.gms.internal.measurement.zzcr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initialize(com.google.android.gms.dynamic.IObjectWrapper r5, com.google.android.gms.internal.measurement.zzdd r6, long r7) throws android.os.RemoteException {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            r2 = 61
            int r1 = r1 + r2
            int r3 = r1 % 128
            com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.TuitionPaymentFragmentbindingInflater1 = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L16
            com.google.android.gms.measurement.internal.zzic r1 = r4.zza
            int r2 = r2 / 0
            if (r1 != 0) goto L3a
            goto L1a
        L16:
            com.google.android.gms.measurement.internal.zzic r1 = r4.zza
            if (r1 != 0) goto L3a
        L1a:
            java.lang.Object r5 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r5)
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r5 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            com.google.android.gms.measurement.internal.zzic r5 = com.google.android.gms.measurement.internal.zzic.zzy(r5, r6, r7)
            r4.zza = r5
            int r5 = com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.TuitionPaymentFragmentbindingInflater1
            int r5 = r5 + 9
            int r6 = r5 % 128
            com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r6
            int r5 = r5 % r0
            return
        L3a:
            com.google.android.gms.measurement.internal.zzgu r5 = r1.zzaV()
            com.google.android.gms.measurement.internal.zzgs r5 = r5.zze()
            java.lang.String r6 = "Attempting to initialize multiple times"
            r5.zza(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.initialize(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.internal.measurement.zzdd, long):void");
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void isDataCollectionEnabled(com.google.android.gms.internal.measurement.zzcu zzcuVar) throws RemoteException {
        int i = 2 % 2;
        zzb();
        this.zza.zzaW().zzj(new zzn(this, zzcuVar));
        int i2 = TuitionPaymentFragmentbindingInflater1 + 61;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getSessionId(com.google.android.gms.internal.measurement.zzcu zzcuVar) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        zzb();
        zzlj zzljVarZzj = this.zza.zzj();
        zzic zzicVar = zzljVarZzj.zzu;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 876;
            int keyRepeatTimeout = 10 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            byte b2 = $$a[37];
            Object[] objArr2 = new Object[1];
            a(b2, (byte) (b2 | 12), (byte) ($$b & 126), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(tapTimeout, iNormalizeMetaState, keyRepeatTimeout, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{1125, 22449, 41942, 65511, 19207, 42794, 62274, 20183, 39603, 63172, 17060, 40510, 59961, 18024, 37258, 60852, 14809, 38348, 57614, 15658, 35195, 58520}, 21468 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{1121, 41471, 20299, 62641, 37419, 16274, 58858, 33655, 10457, 54826, 29582, 6413, 51065, 27842, 2595}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 42390, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 876;
            int i2 = 11 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            byte[] bArr = $$a;
            byte b3 = bArr[37];
            byte b4 = bArr[7];
            Object[] objArr5 = new Object[1];
            a(b3, b4, b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(edgeSlop, touchSlop, i2, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                int defaultSize = 876 - View.getDefaultSize(0, 0);
                int fadingEdgeLength2 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 10;
                byte[] bArr2 = $$a;
                Object[] objArr6 = new Object[1];
                a(bArr2[132], bArr2[54], (byte) ($$b & 126), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(fadingEdgeLength, defaultSize, fadingEdgeLength2, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int i3 = ~Process.myTid();
            int i4 = (-1404220368) + (((~((-465910273) | i3)) | 425600043) * (-933)) + (((~(i3 | 425600043)) | (-467615276)) * 933) + 751031847;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
            int i7 = TuitionPaymentFragmentbindingInflater1 + 27;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
            int i8 = i7 % 2;
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{1125, 51543, 40474, 25537, 12447, 1628, 51982, 39041, 28045, 13137, 22, 54709, 39577, 26750, 15654, 766, 55202, 42336, 27194, 16378, 3220, 53869, 42824, 29722, 14813, 3733}, ExpandableListView.getPackedPositionType(0L) + 52541, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{1127, 64254, 63848, 65499, 65117, 64673, 62250, 61868, 61452, 63347, 62974, 62536, 60115, 59686, 61346, 60940, 60571, 58133}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 65167, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{1134, 22462, 41924, 65524, 19270, 42799, 62279, 20119, 39611, 63129, 17113, 40468, 59955, 18031, 37275, 60860}, 21467 - KeyEvent.normalizeMetaState(0), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{1133, 44629, 20491, 64245, 44196, 22372, 63822, 41742, 21988, 65464, 41573, 21547, 65083, 41178, 19078, 64890}, 43573 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), -839735952};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[78];
                byte b6 = (byte) (-bArr3[59]);
                Object[] objArr13 = new Object[1];
                d(b5, b6, (byte) (b6 | 66), objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                d((byte) (bArr3[43] - 1), (byte) 52, bArr3[6], objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                        int i9 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 877;
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 11;
                        byte[] bArr4 = $$a;
                        Object[] objArr16 = new Object[1];
                        a(bArr4[132], bArr4[54], (byte) ($$b & 126), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, i9, packedPositionChild, 256017550, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        c(new char[]{1125, 22449, 41942, 65511, 19207, 42794, 62274, 20183, 39603, 63172, 17060, 40510, 59961, 18024, 37258, 60852, 14809, 38348, 57614, 15658, 35195, 58520}, ((byte) KeyEvent.getModifierMetaStateMask()) + 21468, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        c(new char[]{1121, 41471, 20299, 62641, 37419, 16274, 58858, 33655, 10457, 54826, 29582, 6413, 51065, 27842, 2595}, (Process.myTid() >> 22) + 42391, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cAlpha = (char) Color.alpha(0);
                            int maximumDrawingCacheSize = 876 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 11;
                            byte[] bArr5 = $$a;
                            byte b7 = bArr5[37];
                            byte b8 = bArr5[7];
                            Object[] objArr19 = new Object[1];
                            a(b7, b8, b8, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cAlpha, maximumDrawingCacheSize, iIndexOf, 2009631821, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char modifierMetaStateMask = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                            int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 876;
                            int i10 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9;
                            byte b9 = $$a[37];
                            Object[] objArr20 = new Object[1];
                            a(b9, (byte) (b9 | 12), (byte) ($$b & 126), objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(modifierMetaStateMask, maximumDrawingCacheSize2, i10, 252381699, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i11 = ((int[]) objArr[2])[0];
        int i12 = ((int[]) objArr[0])[0];
        if (i12 == i11) {
            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 41;
            TuitionPaymentFragmentbindingInflater1 = i13 % 128;
            int i14 = i13 % 2;
            int i15 = ((int[]) objArr[1])[0];
            Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iMyTid = Process.myTid();
            int i16 = (~((-951009431) | iMyTid)) | 145178646;
            int i17 = i15 + 1521273620 + (i16 * 992) + ((i16 | (~((~iMyTid) | (-104868418)))) * (-496)) + ((iMyTid | (-910699202)) * 496);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr21[1])[0] = i19 ^ (i19 << 5);
            int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
            TuitionPaymentFragmentbindingInflater1 = i20 % 128;
            int i21 = i20 % 2;
        } else {
            int[] iArr = new int[i12];
            int i22 = i12 - 1;
            iArr[i22] = 1;
            Toast.makeText((Context) null, iArr[((i12 * i22) % 2) - 1], 1).show();
            int i23 = ((int[]) objArr[1])[0];
            Object[] objArr22 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i24 = ~((-515906020) | (~elapsedCpuTime));
            int i25 = i23 + (((-517545456) | i24 | (~(515906019 | elapsedCpuTime))) * (-338)) + 1203605236 + (((~(elapsedCpuTime | (-1639437))) | i24) * 338);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr22[1])[0] = i27 ^ (i27 << 5);
        }
        zzicVar.zzaW().zzj(new zzkm(zzljVarZzj, zzcuVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void logEventAndBundle(String str, String str2, Bundle bundle, com.google.android.gms.internal.measurement.zzcu zzcuVar, long j) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        zzb();
        Preconditions.checkNotEmpty(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.zza.zzaW().zzj(new zzj(this, zzcuVar, new zzbg(str2, new zzbe(bundle), "app", j), str));
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void getTestFlag(com.google.android.gms.internal.measurement.zzcu zzcuVar, int i) throws RemoteException {
        int i2 = 2 % 2;
        zzb();
        if (i == 0) {
            this.zza.zzk().zzal(zzcuVar, this.zza.zzj().zzj());
            int i3 = TuitionPaymentFragmentbindingInflater1 + 63;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        int i5 = TuitionPaymentFragmentbindingInflater1 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
        if (i == 1) {
            this.zza.zzk().zzam(zzcuVar, this.zza.zzj().zzk().longValue());
            return;
        }
        if (i != 2) {
            if (i == 3) {
                this.zza.zzk().zzan(zzcuVar, this.zza.zzj().zzl().intValue());
                return;
            } else {
                if (i != 4) {
                    return;
                }
                this.zza.zzk().zzap(zzcuVar, this.zza.zzj().zzi().booleanValue());
                return;
            }
        }
        zzpp zzppVarZzk = this.zza.zzk();
        double dDoubleValue = this.zza.zzj().zzm().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", dDoubleValue);
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e2) {
            zzppVarZzk.zzu.zzaV().zze().zzb("Error returning double value to wrapper", e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v54, types: [boolean, int] */
    @Override // com.google.android.gms.internal.measurement.zzcr
    public void logHealthData(int i, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        zzb();
        Object objUnwrap = iObjectWrapper == null ? null : ObjectWrapper.unwrap(iObjectWrapper);
        Object objUnwrap2 = iObjectWrapper2 == null ? null : ObjectWrapper.unwrap(iObjectWrapper2);
        Object objUnwrap3 = iObjectWrapper3 == null ? null : ObjectWrapper.unwrap(iObjectWrapper3);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char packedPositionGroup = (char) (31533 - ExpandableListView.getPackedPositionGroup(0L));
            int jumpTapTimeout = 921 - (ViewConfiguration.getJumpTapTimeout() >> 16);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 28;
            byte b2 = $$a[37];
            Object[] objArr3 = new Object[1];
            a(b2, (byte) (b2 | 12), (byte) ($$b & 126), objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionGroup, jumpTapTimeout, iMakeMeasureSpec, -1048449946, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(new char[]{1125, 22449, 41942, 65511, 19207, 42794, 62274, 20183, 39603, 63172, 17060, 40510, 59961, 18024, 37258, 60852, 14809, 38348, 57614, 15658, 35195, 58520}, ExpandableListView.getPackedPositionChild(0L) + 21468, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(new char[]{1121, 41471, 20299, 62641, 37419, 16274, 58858, 33655, 10457, 54826, 29582, 6413, 51065, 27842, 2595}, 42391 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cRgb = (char) (Color.rgb(0, 0, 0) + 16808749);
            int doubleTapTimeout = 921 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int i5 = 28 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            byte[] bArr = $$a;
            byte b3 = bArr[132];
            byte b4 = bArr[7];
            Object[] objArr6 = new Object[1];
            a(b3, b4, b4, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRgb, doubleTapTimeout, i5, -778300370, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i6 = TuitionPaymentFragmentbindingInflater1 + 93;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            int i7 = i6 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 31533);
                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 922;
                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 28;
                byte b5 = $$a[7];
                byte b6 = b5;
                Object[] objArr7 = new Object[1];
                a(b5, b6, (byte) (b6 | 15), objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(threadPriority, packedPositionChild, maximumDrawingCacheSize, -1142834547, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i ^ (i << 5)}, new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
            int i8 = ~i;
            int i9 = (((-369411366) + (((~((-200869) | i)) | ((~(i8 | 1745565158)) | (-1773878776))) * 717)) + ((((~(i8 | (-200869))) | (-1773878776)) | (~(i | 1745565158))) * 717)) - 46509690;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
        } else {
            Object[] objArr9 = new Object[1];
            c(new char[]{1125, 51543, 40474, 25537, 12447, 1628, 51982, 39041, 28045, 13137, 22, 54709, 39577, 26750, 15654, 766, 55202, 42336, 27194, 16378, 3220, 53869, 42824, 29722, 14813, 3733}, Color.green(0) + 52541, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(new char[]{1127, 64254, 63848, 65499, 65117, 64673, 62250, 61868, 61452, 63347, 62974, 62536, 60115, 59686, 61346, 60940, 60571, 58133}, 65167 - Gravity.getAbsoluteGravity(0, 0), objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
                TuitionPaymentFragmentbindingInflater1 = i12 % 128;
                if (i12 % 2 != 0) {
                    boolean z = applicationContext instanceof ContextWrapper;
                    throw null;
                }
                if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                    int i13 = TuitionPaymentFragmentbindingInflater1 + 51;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
                    if (i13 % 2 == 0) {
                        int i14 = 3 / 5;
                    }
                    applicationContext = null;
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i16 = i15 + 65;
            TuitionPaymentFragmentbindingInflater1 = i16 % 128;
            int i17 = i16 % 2;
            int i18 = i15 + 9;
            TuitionPaymentFragmentbindingInflater1 = i18 % 128;
            int i19 = i18 % 2;
            try {
                Object[] objArr11 = {applicationContext, Integer.valueOf(i), 0, -46509690};
                byte b7 = (byte) 0;
                byte[] bArr2 = $$d;
                byte b8 = bArr2[48];
                Object[] objArr12 = new Object[1];
                d(b7, b8, b8, objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                Object[] objArr13 = new Object[1];
                d(bArr2[16], b7, b7, objArr13);
                Object[] objArr14 = (Object[]) cls3.getMethod((String) objArr13[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 31533);
                    int iMyPid = (Process.myPid() >> 22) + 921;
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 28;
                    byte b9 = $$a[7];
                    byte b10 = b9;
                    Object[] objArr15 = new Object[1];
                    a(b9, b10, (byte) (b10 | 15), objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(trimmedLength, iMyPid, iResolveOpacity, -1142834547, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr14);
                try {
                    Object[] objArr16 = new Object[1];
                    c(new char[]{1125, 22449, 41942, 65511, 19207, 42794, 62274, 20183, 39603, 63172, 17060, 40510, 59961, 18024, 37258, 60852, 14809, 38348, 57614, 15658, 35195, 58520}, 21466 - MotionEvent.axisFromString(""), objArr16);
                    Class<?> cls4 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    c(new char[]{1121, 41471, 20299, 62641, 37419, 16274, 58858, 33655, 10457, 54826, 29582, 6413, 51065, 27842, 2595}, TextUtils.indexOf("", "") + 42391, objArr17);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char bitsPerPixel = (char) (31532 - ImageFormat.getBitsPerPixel(0));
                        int iIndexOf = 921 - TextUtils.indexOf("", "", 0);
                        int trimmedLength2 = 28 - TextUtils.getTrimmedLength("");
                        byte[] bArr3 = $$a;
                        byte b11 = bArr3[132];
                        byte b12 = bArr3[7];
                        Object[] objArr18 = new Object[1];
                        a(b11, b12, b12, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(bitsPerPixel, iIndexOf, trimmedLength2, -778300370, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 31533);
                        int offsetAfter = 921 - TextUtils.getOffsetAfter("", 0);
                        int packedPositionChild2 = 27 - ExpandableListView.getPackedPositionChild(0L);
                        byte b13 = $$a[37];
                        Object[] objArr19 = new Object[1];
                        a(b13, (byte) (b13 | 12), (byte) ($$b & 126), objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(keyRepeatTimeout, offsetAfter, packedPositionChild2, -1048449946, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr14;
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
        int i20 = ((int[]) objArr[1])[0];
        int i21 = ((int[]) objArr[3])[0];
        if (i21 == i20) {
            int i22 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[]{i ^ (i << 5)}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int i23 = ~i;
            int i24 = i22 + (-1536592827) + ((297610331 | i) * 614) + (((~((-1024245050) | i23)) | 286010393 | (~(749834594 | i23))) * (-1228)) + (((~(i23 | 1035844987)) | (~((-738234657) | i23))) * 614);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i27 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 113;
                TuitionPaymentFragmentbindingInflater1 = i27 % 128;
                int i28 = 2;
                int i29 = i27 % 2;
                int i30 = 0;
                while (i30 < strArr.length) {
                    int i31 = TuitionPaymentFragmentbindingInflater1 + 43;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i31 % 128;
                    int i32 = i31 % i28;
                    arrayList.add(strArr[i30]);
                    i30++;
                    i28 = 2;
                }
            }
            Toast.makeText((Context) null, i21 / (((i21 - 1) * i21) % 2), 0).show();
            int i33 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i34 = ~iIdentityHashCode;
            int i35 = i33 + 134002307 + (((~((-1018876078) | i34)) | 738349228 | (~((-755203567) | i34))) * (-1136)) + (((~((-1018876078) | iIdentityHashCode)) | (~((-755203567) | iIdentityHashCode)) | (~(1035730415 | i34))) * (-568)) + (((~(iIdentityHashCode | (-738349229))) | (~(i34 | 755203566)) | (~(1018876077 | i34))) * 568);
            int i36 = (i35 << 13) ^ i35;
            int i37 = i36 ^ (i36 >>> 17);
            ((int[]) objArr2[0])[0] = i37 ^ (i37 << 5);
            int i38 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
            TuitionPaymentFragmentbindingInflater1 = i38 % 128;
            int i39 = i38 % 2;
        }
        zzgu zzguVarZzaV = this.zza.zzaV();
        int i40 = ((int[]) objArr2[0])[0];
        int i41 = i40 * i40;
        int i42 = -(900898263 * i40);
        int i43 = (i41 & i42) + (i41 | i42);
        int i44 = -(i40 * 1627799967);
        int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
        int i46 = ((i45 | 288076441) << 1) - (288076441 ^ i45);
        int i47 = i46 >> 20;
        int i48 = ((i47 & (-8191)) + (i47 | (-8191))) / 4096;
        int i49 = ((i48 | 1) << 1) - (i48 ^ 1);
        int i50 = (i46 ^ i49) + ((i49 & i46) << 1);
        int i51 = i46 >> 19;
        int i52 = (((i51 | (-16383)) << 1) - (i51 ^ (-16383))) / 8192;
        int i53 = (-(((i52 & 1) + (i52 | 1)) ^ i50)) + 5;
        int i54 = i53 >> 24;
        int i55 = ((i54 & (-511)) + (i54 | (-511))) / 256;
        zzguVarZzaV.zzm(i, true, 0 / ((i53 & (-(((i55 & 1) + (i55 | 1)) + 1))) * 495), str, objUnwrap, objUnwrap2, objUnwrap3);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void registerOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzda zzdaVar) throws RemoteException {
        zzjq zzqVar;
        zzb();
        Map map = this.zzb;
        synchronized (map) {
            zzqVar = (zzjq) map.get(Integer.valueOf(zzdaVar.zzf()));
            if (zzqVar == null) {
                zzqVar = new zzq(this, zzdaVar);
                map.put(Integer.valueOf(zzdaVar.zzf()), zzqVar);
            }
        }
        this.zza.zzj().zzW(zzqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setInstanceIdProvider(com.google.android.gms.internal.measurement.zzdc zzdcVar) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        zzb();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = TuitionPaymentFragmentbindingInflater1 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setMinimumSessionDuration(long j) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        zzb();
        int i4 = TuitionPaymentFragmentbindingInflater1 + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void unregisterOnMeasurementEventListener(com.google.android.gms.internal.measurement.zzda zzdaVar) throws RemoteException {
        zzjq zzqVar;
        zzb();
        Map map = this.zzb;
        synchronized (map) {
            zzqVar = (zzjq) map.remove(Integer.valueOf(zzdaVar.zzf()));
        }
        if (zzqVar == null) {
            zzqVar = new zzq(this, zzdaVar);
        }
        this.zza.zzj().zzX(zzqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void performAction(Bundle bundle, com.google.android.gms.internal.measurement.zzcu zzcuVar, long j) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        zzb();
        Object obj = null;
        zzcuVar.zzb(null);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void resetAnalyticsData(long j) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            zzb();
            this.zza.zzj().zzT(j);
            int i3 = 85 / 0;
        } else {
            zzb();
            this.zza.zzj().zzT(j);
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, String str, String str2, long j) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            zzb();
            this.zza.zzs().zzk(zzdfVar, str, str2);
        } else {
            zzb();
            this.zza.zzs().zzk(zzdfVar, str, str2);
            int i3 = 39 / 0;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 25;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        zzb();
        this.zza.zzj().zzn(Boolean.valueOf(z));
        int i4 = TuitionPaymentFragmentbindingInflater1 + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        zzb();
        onActivityDestroyedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.zza((Activity) Preconditions.checkNotNull((Activity) ObjectWrapper.unwrap(iObjectWrapper))), j);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityPaused(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        zzb();
        onActivityPausedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.zza((Activity) Preconditions.checkNotNull((Activity) ObjectWrapper.unwrap(iObjectWrapper))), j);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 69 / 0;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityResumed(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            zzb();
            onActivityResumedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.zza((Activity) Preconditions.checkNotNull((Activity) ObjectWrapper.unwrap(iObjectWrapper))), j);
            int i3 = 27 / 0;
        } else {
            zzb();
            onActivityResumedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.zza((Activity) Preconditions.checkNotNull((Activity) ObjectWrapper.unwrap(iObjectWrapper))), j);
        }
        int i4 = TuitionPaymentFragmentbindingInflater1 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityStarted(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        zzb();
        onActivityStartedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.zza((Activity) Preconditions.checkNotNull((Activity) ObjectWrapper.unwrap(iObjectWrapper))), j);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityStartedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, long j) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        zzb();
        if (this.zza.zzj().zza != null) {
            this.zza.zzj().zzh();
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityStopped(IObjectWrapper iObjectWrapper, long j) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        zzb();
        onActivityStoppedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.zza((Activity) Preconditions.checkNotNull((Activity) ObjectWrapper.unwrap(iObjectWrapper))), j);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityStoppedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, long j) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 89;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        zzb();
        if (this.zza.zzj().zza != null) {
            this.zza.zzj().zzh();
        }
        int i4 = TuitionPaymentFragmentbindingInflater1 + 43;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void retrieveAndUploadBatches(final com.google.android.gms.internal.measurement.zzcx zzcxVar) {
        int i = 2 % 2;
        zzb();
        this.zza.zzj().zzt(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                try {
                    zzcxVar.zze();
                } catch (RemoteException e2) {
                    ((zzic) Preconditions.checkNotNull(this.zza.zza)).zzaV().zze().zzb("Failed to call IDynamiteUploadBatchesCallback", e2);
                }
            }
        });
        int i2 = TuitionPaymentFragmentbindingInflater1 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        r3.zza.zzj().zzaa(r4, r5);
        r4 = com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
        com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.TuitionPaymentFragmentbindingInflater1 = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r4 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r4 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        r3.zza.zzaV().zzb().zza("Conditional user property must not be null");
     */
    @Override // com.google.android.gms.internal.measurement.zzcr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setConditionalUserProperty(android.os.Bundle r4, long r5) throws android.os.RemoteException {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r1 = r1 + 41
            int r2 = r1 % 128
            com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.TuitionPaymentFragmentbindingInflater1 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L18
            r3.zzb()
            r1 = 35
            int r1 = r1 / 0
            if (r4 != 0) goto L2d
            goto L1d
        L18:
            r3.zzb()
            if (r4 != 0) goto L2d
        L1d:
            com.google.android.gms.measurement.internal.zzic r4 = r3.zza
            com.google.android.gms.measurement.internal.zzgu r4 = r4.zzaV()
            com.google.android.gms.measurement.internal.zzgs r4 = r4.zzb()
            java.lang.String r5 = "Conditional user property must not be null"
            r4.zza(r5)
            return
        L2d:
            com.google.android.gms.measurement.internal.zzic r1 = r3.zza
            com.google.android.gms.measurement.internal.zzlj r1 = r1.zzj()
            r1.zzaa(r4, r5)
            int r4 = com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            int r4 = r4 + 9
            int r5 = r4 % 128
            com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.TuitionPaymentFragmentbindingInflater1 = r5
            int r4 = r4 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.setConditionalUserProperty(android.os.Bundle, long):void");
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setConsentThirdParty(Bundle bundle, long j) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 111;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        zzb();
        this.zza.zzj().zzp(bundle, -20, j);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 96 / 0;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z, long j) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            zzb();
            this.zza.zzj().zzL(str, str2, ObjectWrapper.unwrap(iObjectWrapper), z, j);
        } else {
            zzb();
            this.zza.zzj().zzL(str, str2, ObjectWrapper.unwrap(iObjectWrapper), z, j);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            zzb();
            onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.zza((Activity) Preconditions.checkNotNull((Activity) ObjectWrapper.unwrap(iObjectWrapper))), bundle, j);
        } else {
            zzb();
            onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.zza((Activity) Preconditions.checkNotNull((Activity) ObjectWrapper.unwrap(iObjectWrapper))), bundle, j);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, Bundle bundle, long j) {
        int i = 2 % 2;
        zzb();
        zzky zzkyVar = this.zza.zzj().zza;
        Object obj = null;
        if (zzkyVar != null) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            if (i2 % 2 != 0) {
                this.zza.zzj().zzh();
                zzkyVar.zza(zzdfVar, bundle);
                obj.hashCode();
                throw null;
            }
            this.zza.zzj().zzh();
            zzkyVar.zza(zzdfVar, bundle);
        }
        int i3 = TuitionPaymentFragmentbindingInflater1 + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityDestroyedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, long j) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        zzb();
        zzky zzkyVar = this.zza.zzj().zza;
        if (zzkyVar != null) {
            this.zza.zzj().zzh();
            zzkyVar.zzb(zzdfVar);
        }
        int i4 = TuitionPaymentFragmentbindingInflater1 + 121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityPausedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, long j) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            zzb();
            zzky zzkyVar = this.zza.zzj().zza;
            throw null;
        }
        zzb();
        zzky zzkyVar2 = this.zza.zzj().zza;
        if (zzkyVar2 != null) {
            this.zza.zzj().zzh();
            zzkyVar2.zzc(zzdfVar);
        }
        int i3 = TuitionPaymentFragmentbindingInflater1 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002d A[PHI: r5
  0x002d: PHI (r5v7 com.google.android.gms.measurement.internal.zzky) = (r5v6 com.google.android.gms.measurement.internal.zzky), (r5v11 com.google.android.gms.measurement.internal.zzky) binds: [B:8:0x002b, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivityResumedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, long j) throws RemoteException {
        zzky zzkyVar;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            zzb();
            zzkyVar = this.zza.zzj().zza;
            int i3 = 40 / 0;
            if (zzkyVar != null) {
                int i4 = TuitionPaymentFragmentbindingInflater1 + 101;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                int i5 = i4 % 2;
                this.zza.zzj().zzh();
                zzkyVar.zzd(zzdfVar);
            }
        } else {
            zzb();
            zzkyVar = this.zza.zzj().zza;
            if (zzkyVar != null) {
                int i6 = TuitionPaymentFragmentbindingInflater1 + 101;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
                int i7 = i6 % 2;
                this.zza.zzj().zzh();
                zzkyVar.zzd(zzdfVar);
            }
        }
        int i8 = TuitionPaymentFragmentbindingInflater1 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.measurement.zzcu zzcuVar, long j) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            zzb();
            onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.zza((Activity) Preconditions.checkNotNull((Activity) ObjectWrapper.unwrap(iObjectWrapper))), zzcuVar, j);
            int i3 = 47 / 0;
        } else {
            zzb();
            onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.zza((Activity) Preconditions.checkNotNull((Activity) ObjectWrapper.unwrap(iObjectWrapper))), zzcuVar, j);
        }
        int i4 = TuitionPaymentFragmentbindingInflater1 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        zzb();
        setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.zza((Activity) Preconditions.checkNotNull((Activity) ObjectWrapper.unwrap(iObjectWrapper))), str, str2, j);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setDefaultEventParameters(Bundle bundle) {
        final Bundle bundle2;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        zzb();
        final zzlj zzljVarZzj = this.zza.zzj();
        if (bundle == null) {
            bundle2 = new Bundle();
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 7;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 / 3;
            }
        } else {
            Bundle bundle3 = new Bundle(bundle);
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            int i7 = i6 % 2;
            bundle2 = bundle3;
        }
        zzljVarZzj.zzu.zzaW().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzlf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzljVarZzj.zzah(bundle2);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setSessionTimeoutDuration(long j) throws RemoteException {
        int i = 2 % 2;
        zzb();
        zzlj zzljVarZzj = this.zza.zzj();
        zzic zzicVar = zzljVarZzj.zzu;
        zzljVarZzj.zzu.zzaW().zzj(new zzka(zzljVarZzj, j));
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        int i = 2 % 2;
        zzb();
        zzlj zzljVarZzj = this.zza.zzj();
        zzljVarZzj.zzb();
        zzic zzicVar = zzljVarZzj.zzu;
        zzljVarZzj.zzu.zzaW().zzj(new zzjy(zzljVarZzj, z));
        int i2 = TuitionPaymentFragmentbindingInflater1 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 36 / 0;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setEventInterceptor(com.google.android.gms.internal.measurement.zzda zzdaVar) throws RemoteException {
        int i = 2 % 2;
        zzb();
        zzp zzpVar = new zzp(this, zzdaVar);
        if (!this.zza.zzaW().zze()) {
            this.zza.zzaW().zzj(new zzl(this, zzpVar));
            int i2 = TuitionPaymentFragmentbindingInflater1 + 61;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            this.zza.zzj().zzV(zzpVar);
        } else {
            this.zza.zzj().zzV(zzpVar);
            int i5 = 53 / 0;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setUserId(final String str, long j) throws RemoteException {
        int i = 2 % 2;
        zzb();
        final zzlj zzljVarZzj = this.zza.zzj();
        if (str != null) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 117;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            if (TextUtils.isEmpty(str)) {
                int i4 = TuitionPaymentFragmentbindingInflater1 + 123;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                int i5 = i4 % 2;
                zzljVarZzj.zzu.zzaV().zze().zza("User ID must be non-empty or null");
                return;
            }
        }
        zzljVarZzj.zzu.zzaW().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzlg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzic zzicVar = zzljVarZzj.zzu;
                if (zzicVar.zzv().zzq(str)) {
                    zzicVar.zzv().zzi();
                }
            }
        });
        zzljVarZzj.zzL(null, "_id", str, true, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, com.google.android.gms.internal.measurement.zzcu zzcuVar, long j) throws RemoteException {
        int i = 2 % 2;
        zzb();
        zzky zzkyVar = this.zza.zzj().zza;
        Bundle bundle = new Bundle();
        if (zzkyVar != null) {
            int i2 = TuitionPaymentFragmentbindingInflater1 + 9;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            this.zza.zzj().zzh();
            zzkyVar.zze(zzdfVar, bundle);
            int i4 = TuitionPaymentFragmentbindingInflater1 + 41;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
        }
        try {
            zzcuVar.zzb(bundle);
        } catch (RemoteException e2) {
            this.zza.zzaV().zze().zzb("Error returning bundle value to wrapper", e2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setSgtmDebugInfo(Intent intent) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            zzb();
            this.zza.zzj();
            intent.getData();
            obj.hashCode();
            throw null;
        }
        zzb();
        zzlj zzljVarZzj = this.zza.zzj();
        Uri data = intent.getData();
        if (data == null) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            if (i3 % 2 == 0) {
                zzljVarZzj.zzu.zzaV().zzi().zza("Activity intent has no data. Preview Mode was not enabled.");
                return;
            } else {
                zzljVarZzj.zzu.zzaV().zzi().zza("Activity intent has no data. Preview Mode was not enabled.");
                obj.hashCode();
                throw null;
            }
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            zzic zzicVar = zzljVarZzj.zzu;
            zzicVar.zzaV().zzi().zza("[sgtm] Preview Mode was not enabled.");
            zzicVar.zzc().zzy(null);
        } else {
            String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (!TextUtils.isEmpty(queryParameter2)) {
                zzic zzicVar2 = zzljVarZzj.zzu;
                zzicVar2.zzaV().zzi().zzb("[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
                zzicVar2.zzc().zzy(queryParameter2);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public void setConsent(Bundle bundle, long j) throws RemoteException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 99;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}

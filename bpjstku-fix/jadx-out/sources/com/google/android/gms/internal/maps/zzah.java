package com.google.android.gms.internal.maps;

import android.graphics.Color;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.LatLng;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes5.dex */
public final class zzah extends zza implements zzaj {
    private static short[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {106, -22, 107, 95};
    private static final int $$f = 168;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {27, 65, -33, 120, 11, -1, 19, -18, 25, 32, -27, 29, 24, 6, 16, 7, -5, 12, -21, 40, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$e = 207;
    private static final byte[] $$a = {101, 89, 94, -73, 23, -37, 42, 11, -10, 18, -7, 0, 7, 7, 23, -44, 44, 10, -5, 6, 18};
    private static final int $$b = 44;
    private static int g = 0;
    private static int d = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = -2014317636;
    private static int b = -1934795583;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -2022738041;
    private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {70, -78, 65, 103, -108, 70, -65, 79, -88, 100, 99, -23, 66, 15, -72, -87, -88, -85, 124, -76, 123, 53, -111, 32, 101, 98, 41, -118, 7, 54, 43, -102, 102, 32, -98, -60, ByteCompanionObject.MAX_VALUE, -49, 118, -86, -85, -115, 119, -61, 123, -78, -125, -103, -37, 125, -23, -27, -54, 63, -27, -60, -15, 43, -11, -17, -27, -16, -31, -23, 31, -26, -26, -26, -26};

    zzah(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r0 = 11 - r8
            int r6 = r6 * 3
            int r6 = 100 - r6
            int r7 = r7 * 10
            int r7 = r7 + 4
            byte[] r1 = com.google.android.gms.internal.maps.zzah.$$a
            byte[] r0 = new byte[r0]
            int r8 = 10 - r8
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2d:
            int r6 = r6 + r7
            int r6 = r6 + (-5)
            int r7 = r3 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.maps.zzah.a(byte, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(int r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.google.android.gms.internal.maps.zzah.$$d
            int r8 = r8 * 16
            int r8 = 19 - r8
            int r9 = r9 * 21
            int r9 = r9 + 17
            int r7 = r7 * 27
            int r7 = r7 + 84
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r7 = r9
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r9) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L29:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2e:
            int r7 = r7 + r8
            int r7 = r7 + (-10)
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.maps.zzah.e(int, int, byte, java.lang.Object[]):void");
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzD() throws RemoteException {
        int i = 2 % 2;
        int i2 = d + 61;
        g = i2 % 128;
        int i3 = i2 % 2;
        zzc(11, zza());
        int i4 = d + 43;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzA(String str) throws RemoteException {
        Parcel parcelZza;
        int i = 2 % 2;
        int i2 = g + 123;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            parcelZza = zza();
            parcelZza.writeString(str);
        } else {
            parcelZza = zza();
            parcelZza.writeString(str);
        }
        zzc(5, parcelZza);
        int i3 = d + 115;
        g = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzC(float f) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = d + 87;
        g = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            parcelZza.writeFloat(f);
            i = 16;
        } else {
            parcelZza = zza();
            parcelZza.writeFloat(f);
            i = 27;
        }
        zzc(i, parcelZza);
        int i4 = g + 69;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 62 / 0;
        }
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzB(boolean z) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = g + 69;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            parcelZza = zza();
            int i4 = zzc.zza;
            parcelZza.writeInt(z ? 1 : 0);
            i = 101;
        } else {
            parcelZza = zza();
            int i5 = zzc.zza;
            parcelZza.writeInt(z ? 1 : 0);
            i = 14;
        }
        zzc(i, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final boolean zzF() throws RemoteException {
        int i = 2 % 2;
        int i2 = g + 1;
        d = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZzJ = zzJ(10, zza());
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        int i4 = d + 77;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 7 / 0;
        }
        return zZzh;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final boolean zzG() throws RemoteException {
        int i = 2 % 2;
        int i2 = g + 49;
        d = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZzJ = zzJ(21, zza());
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        int i4 = g + 37;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 11 / 0;
        }
        return zZzh;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final boolean zzH() throws RemoteException {
        Parcel parcelZzJ;
        boolean zZzh;
        int i = 2 % 2;
        int i2 = d + 11;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            parcelZzJ = zzJ(104, zza());
            zZzh = zzc.zzh(parcelZzJ);
        } else {
            parcelZzJ = zzJ(13, zza());
            zZzh = zzc.zzh(parcelZzJ);
        }
        parcelZzJ.recycle();
        int i3 = d + 55;
        g = i3 % 128;
        int i4 = i3 % 2;
        return zZzh;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final boolean zzI() throws RemoteException {
        Parcel parcelZzJ;
        boolean zZzh;
        int i = 2 % 2;
        int i2 = d + 65;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            parcelZzJ = zzJ(13, zza());
            zZzh = zzc.zzh(parcelZzJ);
        } else {
            parcelZzJ = zzJ(15, zza());
            zZzh = zzc.zzh(parcelZzJ);
        }
        parcelZzJ.recycle();
        int i3 = g + 95;
        d = i3 % 128;
        if (i3 % 2 != 0) {
            return zZzh;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final float zzd() throws RemoteException {
        Parcel parcelZzJ;
        float f;
        int i = 2 % 2;
        int i2 = d + 77;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            parcelZzJ = zzJ(26, zza());
            f = parcelZzJ.readFloat();
        } else {
            parcelZzJ = zzJ(26, zza());
            f = parcelZzJ.readFloat();
        }
        parcelZzJ.recycle();
        int i3 = g + 103;
        d = i3 % 128;
        if (i3 % 2 != 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final float zze() throws RemoteException {
        Parcel parcelZzJ;
        float f;
        int i = 2 % 2;
        int i2 = d + 105;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            parcelZzJ = zzJ(119, zza());
            f = parcelZzJ.readFloat();
        } else {
            parcelZzJ = zzJ(23, zza());
            f = parcelZzJ.readFloat();
        }
        parcelZzJ.recycle();
        int i3 = g + 35;
        d = i3 % 128;
        int i4 = i3 % 2;
        return f;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final boolean zzE(zzaj zzajVar) throws RemoteException {
        int i = 2 % 2;
        int i2 = d + 43;
        g = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        zzc.zzg(parcelZza, zzajVar);
        Parcel parcelZzJ = zzJ(16, parcelZza);
        boolean zZzh = zzc.zzh(parcelZzJ);
        parcelZzJ.recycle();
        int i4 = g + 101;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 70 / 0;
        }
        return zZzh;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzn() throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = d + 115;
        g = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            i = 120;
        } else {
            parcelZza = zza();
            i = 12;
        }
        zzc(i, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzo() throws RemoteException {
        int i = 2 % 2;
        int i2 = d + 19;
        g = i2 % 128;
        int i3 = i2 % 2;
        zzc(1, zza());
        int i4 = d + 69;
        g = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzp(float f) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = d + 79;
        g = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            parcelZza.writeFloat(f);
            i = 116;
        } else {
            parcelZza = zza();
            parcelZza.writeFloat(f);
            i = 25;
        }
        zzc(i, parcelZza);
        int i4 = d + 97;
        g = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = g + 39;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            parcelZza = zza();
            zzc.zzg(parcelZza, iObjectWrapper);
            i = 75;
        } else {
            parcelZza = zza();
            zzc.zzg(parcelZza, iObjectWrapper);
            i = 18;
        }
        zzc(i, parcelZza);
        int i4 = d + 11;
        g = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzu(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = g + 21;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            parcelZza = zza();
            zzc.zzg(parcelZza, iObjectWrapper);
            i = 64;
        } else {
            parcelZza = zza();
            zzc.zzg(parcelZza, iObjectWrapper);
            i = 33;
        }
        zzc(i, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzw(LatLng latLng) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = d + 7;
        g = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            zzc.zze(parcelZza, latLng);
            i = 4;
        } else {
            parcelZza = zza();
            zzc.zze(parcelZza, latLng);
            i = 3;
        }
        zzc(i, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzx(float f) throws RemoteException {
        int i = 2 % 2;
        int i2 = d + 115;
        g = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f);
        zzc(22, parcelZza);
        int i4 = g + 67;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzy(String str) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = g + 37;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            parcelZza = zza();
            parcelZza.writeString(str);
            i = 78;
        } else {
            parcelZza = zza();
            parcelZza.writeString(str);
            i = 7;
        }
        zzc(i, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzz(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = d + 77;
        g = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            zzc.zzg(parcelZza, iObjectWrapper);
            i = 90;
        } else {
            parcelZza = zza();
            zzc.zzg(parcelZza, iObjectWrapper);
            i = 29;
        }
        zzc(i, parcelZza);
        int i4 = d + 5;
        g = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final float zzf() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = g + 81;
        d = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZzJ = zzJ(28, zza());
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
            int iIndexOf = TextUtils.indexOf("", "") + 876;
            int i4 = 10 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            byte b2 = $$a[11];
            byte b3 = (byte) (b2 + 1);
            byte b4 = b2;
            Object[] objArr2 = new Object[1];
            a(b3, b4, b4, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iIndexOf, i4, -1199417970, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c((ViewConfiguration.getLongPressTimeout() >> 16) - 197274368, (ViewConfiguration.getLongPressTimeout() >> 16) - 17, (short) ((-122) - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (byte) (46 - ExpandableListView.getPackedPositionGroup(0L)), (-188919642) - (ViewConfiguration.getLongPressTimeout() >> 16), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c((-197274365) - ExpandableListView.getPackedPositionChild(0L), TextUtils.getOffsetBefore("", 0) - 24, (short) (TextUtils.indexOf("", "") + 90), (byte) (View.resolveSize(0, 0) - 43), (-188919621) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
            int iRed = Color.red(0) + 876;
            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 10;
            byte[] bArr = $$a;
            byte b5 = bArr[11];
            Object[] objArr5 = new Object[1];
            a(b5, (byte) (b5 + 1), bArr[17], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollDefaultDelay, iRed, iNormalizeMetaState, 254769921, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                int i5 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 875;
                int iArgb = 10 - Color.argb(0, 0, 0, 0);
                byte b6 = (byte) ($$a[11] + 1);
                byte b7 = b6;
                Object[] objArr6 = new Object[1];
                a(b6, b7, (byte) (b7 + 2), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(capsMode, i5, iArgb, 1324201839, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iMyPid = Process.myPid();
            int i6 = ~((-564146261) | (~iMyPid));
            int i7 = ((((((-1069103744) | i6) | (~(564146260 | iMyPid))) * (-338)) - 539502380) + (((~(iMyPid | (-504957484))) | i6) * 338)) - 2117136421;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c((-197274358) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (-24) - ExpandableListView.getPackedPositionChild(0L), (short) ((ViewConfiguration.getPressedStateDuration() >> 16) - 95), (byte) (View.MeasureSpec.makeMeasureSpec(0, 0) - 53), (-188919607) - (ViewConfiguration.getEdgeSlop() >> 16), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c((ViewConfiguration.getKeyRepeatDelay() >> 16) - 197274360, 25 - AndroidCharacter.getMirror('0'), (short) (122 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (byte) ((ViewConfiguration.getLongPressTimeout() >> 16) - 119), (-188919591) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            int i10 = g + 71;
            d = i10 % 128;
            int i11 = i10 % 2;
            try {
                Object[] objArr10 = {Integer.valueOf(iIntValue), -2117136421};
                byte[] bArr2 = $$d;
                byte b8 = (byte) (-bArr2[5]);
                Object[] objArr11 = new Object[1];
                e(b8, b8, bArr2[44], objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b9 = bArr2[44];
                Object[] objArr12 = new Object[1];
                e(b9, b9, (byte) (-bArr2[5]), objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c2 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int iKeyCodeFromString = 876 - KeyEvent.keyCodeFromString("");
                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 10;
                    byte b10 = (byte) ($$a[11] + 1);
                    byte b11 = b10;
                    Object[] objArr13 = new Object[1];
                    a(b10, b11, (byte) (b11 + 2), objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, iKeyCodeFromString, windowTouchSlop, 1324201839, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    c((-197274368) - (ViewConfiguration.getFadingEdgeLength() >> 16), View.MeasureSpec.getSize(0) - 17, (short) ((-121) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (byte) (46 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (-188919642) - View.MeasureSpec.getSize(0), objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    c((-197274364) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), Color.red(0) - 24, (short) (View.MeasureSpec.getSize(0) + 90), (byte) ((-44) - TextUtils.lastIndexOf("", '0', 0, 0)), (-188919621) - ((Process.getThreadPriority(0) + 20) >> 6), objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cRed = (char) Color.red(0);
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 876;
                        int i12 = 11 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        byte[] bArr3 = $$a;
                        byte b12 = bArr3[11];
                        Object[] objArr16 = new Object[1];
                        a(b12, (byte) (b12 + 1), bArr3[17], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRed, keyRepeatTimeout, i12, 254769921, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int iIndexOf2 = TextUtils.indexOf("", "", 0) + 876;
                        int modifierMetaStateMask = 9 - ((byte) KeyEvent.getModifierMetaStateMask());
                        byte b13 = $$a[11];
                        byte b14 = (byte) (b13 + 1);
                        byte b15 = b13;
                        Object[] objArr17 = new Object[1];
                        a(b14, b15, b15, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(fadingEdgeLength, iIndexOf2, modifierMetaStateMask, -1199417970, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i13 = ((int[]) objArr[2])[0];
        int i14 = ((int[]) objArr[0])[0];
        if (i14 != i13) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i14));
        }
        int i15 = d + 99;
        g = i15 % 128;
        int i16 = i15 % 2;
        int i17 = ((int[]) objArr[1])[0];
        Object[] objArr18 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i18 = i17 + (((565690198 + (((~((-84429334) | iElapsedRealtime)) | (~((-44119105) | iElapsedRealtime))) * 69)) + (((~(iElapsedRealtime | (-855094627))) | ((~((-895404856) | iElapsedRealtime)) | 810975522)) * (-69))) - 402643800);
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        ((int[]) objArr18[1])[0] = i20 ^ (i20 << 5);
        float f = parcelZzJ.readFloat();
        parcelZzJ.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final int zzg() throws RemoteException {
        Parcel parcelZzJ;
        int i;
        int i2 = 2 % 2;
        int i3 = g + 109;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            parcelZzJ = zzJ(73, zza());
            i = parcelZzJ.readInt();
        } else {
            parcelZzJ = zzJ(17, zza());
            i = parcelZzJ.readInt();
        }
        parcelZzJ.recycle();
        int i4 = d + 13;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 71 / 0;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final IObjectWrapper zzh() throws RemoteException {
        Parcel parcelZzJ;
        IObjectWrapper iObjectWrapperAsInterface;
        int i = 2 % 2;
        int i2 = d + 95;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            parcelZzJ = zzJ(48, zza());
            iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzJ.readStrongBinder());
        } else {
            parcelZzJ = zzJ(34, zza());
            iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzJ.readStrongBinder());
        }
        parcelZzJ.recycle();
        int i3 = d + 27;
        g = i3 % 128;
        int i4 = i3 % 2;
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final IObjectWrapper zzi() throws RemoteException {
        int i = 2 % 2;
        int i2 = g + 43;
        d = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZzJ = zzJ(30, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzJ.readStrongBinder());
        parcelZzJ.recycle();
        int i4 = d + 103;
        g = i4 % 128;
        int i5 = i4 % 2;
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final LatLng zzj() throws RemoteException {
        Parcel parcelZzJ;
        LatLng latLng;
        int i = 2 % 2;
        int i2 = d + 27;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            parcelZzJ = zzJ(4, zza());
            latLng = (LatLng) zzc.zza(parcelZzJ, LatLng.CREATOR);
        } else {
            parcelZzJ = zzJ(4, zza());
            latLng = (LatLng) zzc.zza(parcelZzJ, LatLng.CREATOR);
        }
        parcelZzJ.recycle();
        int i3 = g + 83;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 48 / 0;
        }
        return latLng;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final String zzk() throws RemoteException {
        Parcel parcelZzJ;
        String string;
        int i = 2 % 2;
        int i2 = g + 91;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            parcelZzJ = zzJ(2, zza());
            string = parcelZzJ.readString();
        } else {
            parcelZzJ = zzJ(2, zza());
            string = parcelZzJ.readString();
        }
        parcelZzJ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final String zzl() throws RemoteException {
        int i = 2 % 2;
        int i2 = d + 61;
        g = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZzJ = zzJ(8, zza());
        String string = parcelZzJ.readString();
        parcelZzJ.recycle();
        int i4 = d + 53;
        g = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final String zzm() throws RemoteException {
        Parcel parcelZzJ;
        String string;
        int i = 2 % 2;
        int i2 = d + 63;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            parcelZzJ = zzJ(70, zza());
            string = parcelZzJ.readString();
        } else {
            parcelZzJ = zzJ(6, zza());
            string = parcelZzJ.readString();
        }
        parcelZzJ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzq(float f, float f2) throws RemoteException {
        int i = 2 % 2;
        int i2 = g + 115;
        d = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f);
        parcelZza.writeFloat(f2);
        zzc(19, parcelZza);
        int i4 = g + 3;
        d = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzr(boolean z) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = d + 75;
        g = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            int i4 = zzc.zza;
            parcelZza.writeInt(z ? 1 : 0);
            i = 62;
        } else {
            parcelZza = zza();
            int i5 = zzc.zza;
            parcelZza.writeInt(z ? 1 : 0);
            i = 9;
        }
        zzc(i, parcelZza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzs(boolean z) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = d + 53;
        g = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            int i4 = zzc.zza;
            parcelZza.writeInt(z ? 1 : 0);
            i = 100;
        } else {
            parcelZza = zza();
            int i5 = zzc.zza;
            parcelZza.writeInt(z ? 1 : 0);
            i = 20;
        }
        zzc(i, parcelZza);
        int i6 = g + 43;
        d = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzv(float f, float f2) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = g + 95;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            parcelZza = zza();
            parcelZza.writeFloat(f);
            parcelZza.writeFloat(f2);
            i = 11;
        } else {
            parcelZza = zza();
            parcelZza.writeFloat(f);
            parcelZza.writeFloat(f2);
            i = 24;
        }
        zzc(i, parcelZza);
        int i4 = g + 97;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x01fd A[PHI: r0
  0x01fd: PHI (r0v9 int) = (r0v8 int), (r0v36 int) binds: [B:50:0x01fb, B:47:0x01e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01ff A[PHI: r0
  0x01ff: PHI (r0v33 int) = (r0v8 int), (r0v36 int) binds: [B:50:0x01fb, B:47:0x01e9] A[DONT_GENERATE, DONT_INLINE]] */
    private static void c(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        int i6 = 2;
        int i7 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(b)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.getOffsetAfter("", 0) + 2267, 33 - View.MeasureSpec.getMode(0), 1387473586, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            if (z) {
                byte[] bArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i8 = 0;
                    while (i8 < length) {
                        int i9 = $10 + 107;
                        $11 = i9 % 128;
                        if (i9 % i6 == 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                int gidForName = 3357 - Process.getGidForName("");
                                int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 18;
                                byte length2 = (byte) $$c.length;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(keyRepeatDelay, gidForName, windowTouchSlop, -1054011043, false, $$g((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i8] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr[i8])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char c = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                int iLastIndexOf = 3357 - TextUtils.lastIndexOf("", '0', 0, 0);
                                int size = 18 - View.MeasureSpec.getSize(0);
                                byte length3 = (byte) $$c.length;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, iLastIndexOf, size, -1054011043, false, $$g((byte) 0, length3, (byte) (length3 - 4)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i8] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).byteValue();
                            i8++;
                        }
                        i6 = 2;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    Object[] objArr5 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) View.MeasureSpec.getSize(0), 2267 - TextUtils.getTrimmedLength(""), AndroidCharacter.getMirror('0') - 15, 1387473586, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                } else {
                    iIntValue = (short) (((short) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2[i3 + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                int i10 = $10 + 23;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    i4 = ((i3 + iIntValue) - 4) - ((int) (((long) TuitionPaymentFragmentbindingInflater1) - 3046761265686732006L));
                    if (z) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                } else {
                    i4 = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L));
                    if (z) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i4 + i5;
                try {
                    Object[] objArr6 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), sb};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = (byte) (b7 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (55903 - TextUtils.lastIndexOf("", '0', 0, 0)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2856, 13 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -1529949196, false, $$g(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    if (bArr4 != null) {
                        int length4 = bArr4.length;
                        byte[] bArr5 = new byte[length4];
                        int i11 = 0;
                        while (i11 < length4) {
                            bArr5[i11] = (byte) (((long) bArr4[i11]) ^ 3046761265686732006L);
                            i11++;
                            int i12 = $10 + 45;
                            $11 = i12 % 128;
                            int i13 = i12 % 2;
                        }
                        bArr4 = bArr5;
                    }
                    boolean z2 = !(bArr4 == null);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                    while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                        int i14 = $10 + 5;
                        $11 = i14 % 128;
                        int i15 = i14 % 2;
                        if (z2) {
                            byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i16 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i16 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i16]) ^ 3046761265686732006L)) + s)) ^ b2));
                        } else {
                            short[] sArr = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i17 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i17 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i17]) ^ 3046761265686732006L)) + s)) ^ b2));
                        }
                        sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r5, byte r6, int r7) {
        /*
            int r6 = r6 + 117
            byte[] r0 = com.google.android.gms.internal.maps.zzah.$$c
            int r7 = r7 * 2
            int r1 = r7 + 1
            int r5 = r5 * 4
            int r5 = r5 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r5
            r6 = r7
            r3 = r2
            goto L25
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L21:
            int r3 = r3 + 1
            r4 = r0[r5]
        L25:
            int r5 = r5 + 1
            int r6 = r6 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.maps.zzah.$$g(short, byte, int):java.lang.String");
    }
}

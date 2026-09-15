package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.ConnectionResult;
import defpackage.deInitSession;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes6.dex */
final class zaz implements zabz {
    final /* synthetic */ zaaa zaa;
    private static final byte[] $$c = {22, 102, 43, -6};
    private static final int $$f = 212;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {5, -91, 77, 46, -9, -12, -18, 30, -40, -23, 1, -12, -17, -10, -3, -9, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55};
    private static final int $$e = 90;
    private static final byte[] $$a = {57, -50, -56, -93, -23, 37, -42, -11, 10, -18, 7, 0, -7, -7, -23, 44, -44, -10, 5, -6, -18};
    private static final int $$b = 72;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {57184, 57188, 60047, 60040, 57189, 57187, 60072, 60034, 60053, 60055, 60054, 60056, 60043, 60062, 60073, 60117, 60048, 60088, 60058, 60052, 60050, 60041, 57191, 57186, 60063};
    private static char b = 57188;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r0 = 11 - r7
            int r8 = r8 * 3
            int r8 = r8 + 97
            int r6 = r6 * 10
            int r6 = r6 + 4
            byte[] r1 = com.google.android.gms.common.api.internal.zaz.$$a
            byte[] r0 = new byte[r0]
            int r7 = 10 - r7
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = -r6
            int r8 = r8 + 1
            int r3 = r3 + r6
            int r6 = r3 + (-5)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zaz.a(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 12
            int r8 = 15 - r8
            int r9 = r9 * 40
            int r9 = 53 - r9
            int r7 = r7 * 14
            int r7 = 98 - r7
            byte[] r0 = com.google.android.gms.common.api.internal.zaz.$$d
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L31
        L16:
            r3 = r2
        L17:
            r6 = r8
            r8 = r7
            r7 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            int r7 = r7 + 1
            if (r4 != r9) goto L2b
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2b:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L31:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-10)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zaz.d(short, byte, byte, java.lang.Object[]):void");
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zaa(ConnectionResult connectionResult) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        zaaa.zaj(this.zaa).lock();
        try {
            zaaa.zal(this.zaa, connectionResult);
            zaaa.zap(this.zaa);
            zaaa.zaj(this.zaa).unlock();
            int i4 = TuitionPaymentFragmentbindingInflater1 + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            zaaa.zaj(this.zaa).unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zab(Bundle bundle) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 35;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        zaaa.zaj(this.zaa).lock();
        try {
            zaaa.zal(this.zaa, ConnectionResult.RESULT_SUCCESS);
            zaaa.zap(this.zaa);
            zaaa.zaj(this.zaa).unlock();
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            zaaa.zaj(this.zaa).unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zac(int i, boolean z) throws Throwable {
        Object[] objArr;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        zaaa.zaj(this.zaa).lock();
        try {
            zaaa zaaaVar = this.zaa;
            if (zaaa.zav(zaaaVar)) {
                int i5 = TuitionPaymentFragmentbindingInflater1 + 61;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
                int i6 = i5 % 2;
                zaaa.zam(zaaaVar, false);
                zaaa.zan(this.zaa, i, z);
            } else {
                zaaa.zam(zaaaVar, true);
                zaaa.zah(this.zaa).onConnectionSuspended(i);
            }
            Lock lockZaj = zaaa.zaj(this.zaa);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                int iArgb = Color.argb(0, 0, 0, 0) + 876;
                int i7 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 9;
                byte b2 = $$a[11];
                byte b3 = b2;
                Object[] objArr2 = new Object[1];
                a(b2, b3, b3, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(deadChar, iArgb, i7, -1199417970, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(new char[]{23, '\r', 20, 22, 15, 24, 20, 19, 18, 4, 16, 5, '\b', 2, 3, '\f', '\f', 15, 14, 24, 16, 21}, (byte) (126 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new char[]{14, '\b', 17, '\r', '\b', 18, 4, 19, 18, 23, 7, 4, 0, 15, 13896}, (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 73), 15 - TextUtils.indexOf("", "", 0, 0), objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cResolveSize = (char) View.resolveSize(0, 0);
                int touchSlop = 876 - (ViewConfiguration.getTouchSlop() >> 8);
                int i8 = 10 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte[] bArr = $$a;
                byte b4 = bArr[11];
                Object[] objArr5 = new Object[1];
                a((byte) (b4 + 1), bArr[8], (byte) (b4 + 1), objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSize, touchSlop, i8, 254769921, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                    int i9 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 875;
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10;
                    byte b5 = $$a[11];
                    byte b6 = (byte) (b5 + 1);
                    Object[] objArr6 = new Object[1];
                    a(b6, (byte) (b6 + 2), b5, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(modifierMetaStateMask, i9, scrollBarFadeDuration, 1324201839, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[]{i ^ (i << 5)}, new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                int i10 = (((1043920852 + (((~((-8853723) | (~i))) | (~(31456506 | i))) * (-272))) + (((~((-14104827) | i)) | 5251104) * (-272))) + (((~(i | 14104826)) | 26205402) * 272)) - 1840897571;
                int i11 = (i10 << 13) ^ i10;
                int i12 = i11 ^ (i11 >>> 17);
            } else {
                int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
                TuitionPaymentFragmentbindingInflater1 = i13 % 128;
                if (i13 % 2 != 0) {
                    int i14 = 3 % 2;
                }
                try {
                    Object[] objArr8 = {Integer.valueOf(i), -1840897571};
                    byte[] bArr2 = $$d;
                    byte b7 = bArr2[10];
                    byte b8 = (byte) (b7 - 1);
                    byte b9 = b7;
                    Object[] objArr9 = new Object[1];
                    d(b8, b9, b9, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    byte b10 = bArr2[10];
                    byte b11 = (byte) (b10 - 1);
                    Object[] objArr10 = new Object[1];
                    d(b10, b11, b11, objArr10);
                    Object[] objArr11 = (Object[]) cls2.getMethod((String) objArr10[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr8);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cArgb = (char) Color.argb(0, 0, 0, 0);
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 876;
                        int defaultSize = View.getDefaultSize(0, 0) + 10;
                        byte b12 = $$a[11];
                        byte b13 = (byte) (b12 + 1);
                        Object[] objArr12 = new Object[1];
                        a(b13, (byte) (b13 + 2), b12, objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cArgb, packedPositionType, defaultSize, 1324201839, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr11);
                    try {
                        Object[] objArr13 = new Object[1];
                        c(new char[]{23, '\r', 20, 22, 15, 24, 20, 19, 18, 4, 16, 5, '\b', 2, 3, '\f', '\f', 15, 14, 24, 16, 21}, (byte) (126 - TextUtils.getOffsetBefore("", 0)), 22 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr13);
                        Class<?> cls3 = Class.forName((String) objArr13[0]);
                        Object[] objArr14 = new Object[1];
                        c(new char[]{14, '\b', 17, '\r', '\b', 18, 4, 19, 18, 23, 7, 4, 0, 15, 13896}, (byte) (Process.getGidForName("") + 74), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14, objArr14);
                        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr14[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            int iIndexOf = TextUtils.indexOf("", "") + 876;
                            int i15 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 9;
                            byte[] bArr3 = $$a;
                            byte b14 = bArr3[11];
                            Object[] objArr15 = new Object[1];
                            a((byte) (b14 + 1), bArr3[8], (byte) (b14 + 1), objArr15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(minimumFlingVelocity, iIndexOf, i15, 254769921, false, (String) objArr15[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                            int i16 = 876 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            int iIndexOf2 = TextUtils.indexOf("", "") + 10;
                            byte b15 = $$a[11];
                            byte b16 = b15;
                            Object[] objArr16 = new Object[1];
                            a(b15, b16, b16, objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maximumDrawingCacheSize, i16, iIndexOf2, -1199417970, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        objArr = objArr11;
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
            int i17 = ((int[]) objArr[2])[0];
            int i18 = ((int[]) objArr[0])[0];
            if (i18 == i17) {
                int i19 = ((int[]) objArr[1])[0];
                Object[] objArr17 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int i20 = ~((~Process.myPid()) | (-314760994));
                int i21 = i19 + ((((-401342456) | i20) * (-970)) - 799487672) + ((i20 | 86581462) * 970);
                int i22 = (i21 << 13) ^ i21;
                int i23 = i22 ^ (i22 >>> 17);
                ((int[]) objArr17[1])[0] = i23 ^ (i23 << 5);
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[3];
                if (strArr != null) {
                    int i24 = TuitionPaymentFragmentbindingInflater1 + 9;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i24 % 128;
                    int i25 = i24 % 2;
                    for (String str : strArr) {
                        arrayList.add(str);
                    }
                }
                int[] iArr = new int[i18];
                int i26 = i18 - 1;
                iArr[i26] = 1;
                Toast.makeText((Context) null, iArr[((i18 * i26) % 2) - 1], 1).show();
                int i27 = ((int[]) objArr[1])[0];
                Object[] objArr18 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i28 = ~iElapsedRealtime;
                int i29 = (~((-942484695) | i28)) | 136915158;
                int i30 = ~(iElapsedRealtime | (-96604930));
                int i31 = i27 + 52242808 + ((i29 | i30) * (-502)) + ((i30 | (~(i28 | (-805569537)))) * TypedValues.PositionType.TYPE_DRAWPATH);
                int i32 = (i31 << 13) ^ i31;
                int i33 = i32 ^ (i32 >>> 17);
                ((int[]) objArr18[1])[0] = i33 ^ (i33 << 5);
            }
            lockZaj.unlock();
        } catch (Throwable th2) {
            zaaa.zaj(this.zaa).unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0126  */
    /* JADX WARN: Code duplicated, block: B:34:0x0148  */
    /* JADX WARN: Code duplicated, block: B:37:0x0194 A[Catch: all -> 0x0367, TryCatch #0 {all -> 0x0367, blocks: (B:7:0x0029, B:9:0x0037, B:10:0x0069, B:14:0x0083, B:16:0x0094, B:17:0x00c4, B:35:0x014a, B:37:0x0194, B:38:0x0209, B:42:0x0228, B:44:0x0264, B:46:0x02cb), top: B:63:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x021c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0264 A[Catch: all -> 0x0367, TryCatch #0 {all -> 0x0367, blocks: (B:7:0x0029, B:9:0x0037, B:10:0x0069, B:14:0x0083, B:16:0x0094, B:17:0x00c4, B:35:0x014a, B:37:0x0194, B:38:0x0209, B:42:0x0228, B:44:0x0264, B:46:0x02cb), top: B:63:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:48:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:50:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:51:0x031d  */
    private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        Object[] objArr2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int i3 = 2;
        int i4 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i5 = 1770390596;
        Object obj2 = null;
        int i6 = 8;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 121;
                $10 = i8 % 128;
                int i9 = i8 % i3;
                try {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 + 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) TextUtils.getOffsetAfter("", 0), 2267 - (ViewConfiguration.getScrollBarSize() >> i6), TextUtils.lastIndexOf("", '0') + 34, -1927765101, false, $$g(b3, b4, (byte) (b4 - 3)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr3)).charValue();
                    i7++;
                    i3 = 2;
                    i5 = 1770390596;
                    i6 = 8;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(b)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            byte b5 = (byte) 0;
            byte b6 = (byte) (b5 + 3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getTapTimeout() >> 16), 2267 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 32 - ImageFormat.getBitsPerPixel(0), -1927765101, false, $$g(b5, b6, (byte) (b6 - 3)), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i10 = $11 + 19;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i12 = $11 + 83;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 / 0];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        int i13 = $11 + 77;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                        obj = obj2;
                    } else {
                        objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = (byte) (b7 + 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((KeyEvent.getMaxKeyCode() >> 16) + 49267), 3261 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 30 - KeyEvent.getDeadChar(0, 0), -127612708, false, $$g(b7, b8, (byte) (b8 - 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                            int i15 = $10 + 91;
                            $11 = i15 % 128;
                            int i16 = i15 % 2;
                            Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b9 = (byte) 0;
                                byte b10 = b9;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (KeyEvent.getDeadChar(0, 0) + 22878), View.MeasureSpec.getSize(0) + 594, 18 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1570859318, false, $$g(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr5)).intValue();
                            int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i17];
                        } else {
                            obj = null;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i18 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i19 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i18];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i19];
                            } else {
                                int i20 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i21 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i20];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i21];
                            }
                        }
                    }
                } else {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        int i110 = $11 + 77;
                        $10 = i110 % 128;
                        int i111 = i110 % 2;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                        obj = obj2;
                    } else {
                        objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b11 = (byte) 0;
                            byte b12 = (byte) (b11 + 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((KeyEvent.getMaxKeyCode() >> 16) + 49267), 3261 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 30 - KeyEvent.getDeadChar(0, 0), -127612708, false, $$g(b11, b12, (byte) (b12 - 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                            int i112 = $10 + 91;
                            $11 = i112 % 128;
                            int i113 = i112 % 2;
                            Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b13 = (byte) 0;
                                byte b14 = b13;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (KeyEvent.getDeadChar(0, 0) + 22878), View.MeasureSpec.getSize(0) + 594, 18 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1570859318, false, $$g(b13, b14, b14), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr6)).intValue();
                            int i114 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue2];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i114];
                        } else {
                            obj = null;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i115 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i116 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i115];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i116];
                            } else {
                                int i22 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i23 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i22];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i23];
                            }
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                int i24 = $10 + 51;
                $11 = i24 % 128;
                int i25 = i24 % 2;
                obj2 = obj;
            }
        }
        for (int i26 = 0; i26 < i; i26++) {
            int i27 = $11 + 31;
            $10 = i27 % 128;
            int i28 = i27 % 2;
            cArr4[i26] = (char) (cArr4[i26] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* synthetic */ zaz(zaaa zaaaVar, zay zayVar) {
        this.zaa = zaaaVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, int r7, byte r8) {
        /*
            int r8 = r8 * 4
            int r0 = r8 + 1
            byte[] r1 = com.google.android.gms.common.api.internal.zaz.$$c
            int r7 = 116 - r7
            int r6 = r6 * 4
            int r6 = 4 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L21:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zaz.$$g(short, int, byte):java.lang.String");
    }
}

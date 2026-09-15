package com.google.android.libraries.places.internal;

import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bpjstku.data.registration.pmi.PMIRegistrationDataStore$$ExternalSyntheticLambda7;
import defpackage.deInitSession;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class zzxq extends zzbae implements zzbbm {
    private static char[] TuitionPaymentFragmentbindingInflater1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final zzxq zze;
    private static volatile zzbbt zzf;
    private zzbao zzb = zzbu();
    private static final byte[] $$c = {58, -51, 54, -115};
    private static final int $$d = 88;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {65, -122, -65, 2, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$b = 251;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f794a = 1;
    private static int b = 0;

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        zzxq zzxqVar = new zzxq();
        zze = zzxqVar;
        zzbae.zzbn(zzxq.class, zzxqVar);
        int i = b + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i % 128;
        int i2 = i % 2;
    }

    private zzxq() {
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
    private static void c(int r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 15
            int r0 = r7 + 38
            int r5 = r5 * 3
            int r5 = 84 - r5
            int r6 = 92 - r6
            byte[] r1 = com.google.android.libraries.places.internal.zzxq.$$a
            byte[] r0 = new byte[r0]
            int r7 = r7 + 37
            r2 = 0
            if (r1 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            int r6 = r6 + 1
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
            int r5 = r5 + r4
            int r5 = r5 + (-11)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzxq.c(int, int, byte, java.lang.Object[]):void");
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i, Object obj, Object obj2) throws Throwable {
        Object[] objArrB$5f1425da;
        zzbbt zzazzVar;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 29945);
            int edgeSlop = 1755 - (ViewConfiguration.getEdgeSlop() >> 16);
            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 23;
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr = new Object[1];
            c(b3, (byte) (b3 | 89), b2, objArr);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, edgeSlop, packedPositionType, 986134021, false, (String) objArr[0], null);
        }
        byte[] bArr = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr2 = new Object[1];
        d(new char[]{7, 6, '\t', 22, 15, '\r', 5, 2, 16, '\r', 2, 20, 6, '\r', '\f', 3, 16, 20, '\r', 17, 24, 3}, (byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 85), 22 - View.resolveSizeAndState(0, 0, 0), objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        d(new char[]{7, 17, '\t', 16, '\f', 1, '\b', 5, 1, 7, '\r', 14, 15, 20, 13907}, (byte) (ImageFormat.getBitsPerPixel(0) + 85), 15 - View.MeasureSpec.getSize(0), objArr3);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 29944);
            int i2 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1754;
            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 23;
            byte[] bArr2 = $$a;
            byte b4 = bArr2[7];
            Object[] objArr4 = new Object[1];
            c(b4, (byte) (b4 | 52), bArr2[28], objArr4);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cKeyCodeFromString, i2, offsetBefore, 1596667560, false, (String) objArr4[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 29944);
                int absoluteGravity = 1755 - Gravity.getAbsoluteGravity(0, 0);
                int capsMode = 23 - TextUtils.getCapsMode("", 0, 0);
                byte[] bArr3 = $$a;
                byte b5 = bArr3[7];
                Object[] objArr5 = new Object[1];
                c(b5, b5, bArr3[28], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cNormalizeMetaState, absoluteGravity, capsMode, 1599039318, false, (String) objArr5[0], null);
            }
            Object[] objArr6 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArrB$5f1425da = new Object[]{new int[]{((int[]) objArr6[0])[0]}, new int[]{((int[]) objArr6[1])[0]}, (Object[]) objArr6[2], new int[]{i ^ (i << 5)}, (String[]) objArr6[4]};
            int i3 = ~i;
            int i4 = (((1650860851 + (((~((-869355838) | i3)) | (~(656753411 | i))) * 217)) + (((~((-869355838) | i)) | 282071100) * 217)) + (((~(i3 | 656753411)) | 869355837) * 217)) - 610256855;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
        } else {
            try {
                Object[] objArr7 = {271110835};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42049 - (Process.myPid() >> 22)), 1726 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 29 - TextUtils.indexOf("", "", 0, 0), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                objArrB$5f1425da = PMIRegistrationDataStore$$ExternalSyntheticLambda7.b$5f1425da(i, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr7), -610256855);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 29943);
                    int scrollBarFadeDuration = 1755 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int capsMode2 = 23 - TextUtils.getCapsMode("", 0, 0);
                    byte[] bArr4 = $$a;
                    byte b6 = bArr4[7];
                    Object[] objArr8 = new Object[1];
                    c(b6, b6, bArr4[28], objArr8);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, scrollBarFadeDuration, capsMode2, 1599039318, false, (String) objArr8[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrB$5f1425da);
                try {
                    Object[] objArr9 = new Object[1];
                    d(new char[]{7, 6, '\t', 22, 15, '\r', 5, 2, 16, '\r', 2, 20, 6, '\r', '\f', 3, 16, 20, '\r', 17, 24, 3}, (byte) (84 - TextUtils.indexOf((CharSequence) "", '0')), 22 - View.combineMeasuredStates(0, 0), objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    d(new char[]{7, 17, '\t', 16, '\f', 1, '\b', 5, 1, 7, '\r', 14, 15, 20, 13907}, (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 83), TextUtils.getOffsetAfter("", 0) + 15, objArr10);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c2 = (char) (29944 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 1755;
                        int iLastIndexOf = 22 - TextUtils.lastIndexOf("", '0', 0, 0);
                        byte[] bArr5 = $$a;
                        byte b7 = bArr5[7];
                        Object[] objArr11 = new Object[1];
                        c(b7, (byte) (b7 | 52), bArr5[28], objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, absoluteGravity2, iLastIndexOf, 1596667560, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char edgeSlop2 = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 29944);
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1755;
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 24;
                        byte b8 = $$a[7];
                        byte b9 = b8;
                        Object[] objArr12 = new Object[1];
                        c(b9, (byte) (b9 | 89), b8, objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(edgeSlop2, minimumFlingVelocity, modifierMetaStateMask, 986134021, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
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
        int i7 = ((int[]) objArrB$5f1425da[1])[0];
        int i8 = ((int[]) objArrB$5f1425da[0])[0];
        if (i8 == i7) {
            int i9 = ((int[]) objArrB$5f1425da[3])[0];
            Object[] objArr13 = {new int[]{((int[]) objArrB$5f1425da[0])[0]}, new int[]{((int[]) objArrB$5f1425da[1])[0]}, (Object[]) objArrB$5f1425da[2], new int[1], (String[]) objArrB$5f1425da[4]};
            int i10 = (int) Runtime.getRuntime().totalMemory();
            int i11 = ~i10;
            int i12 = i9 + 1566088347 + (((~(375866423 | i11)) | (~((-588468850) | i10))) * (-370)) + (((~(i10 | 375866423)) | (~(i11 | (-588468850))) | 342098950) * (-370)) + 2022559916;
            int i13 = (i12 << 13) ^ i12;
            int i14 = i13 ^ (i13 >>> 17);
            Object obj3 = objArr13[3];
            ((int[]) obj3)[0] = i14 ^ (i14 << 5);
            int i15 = i - 1;
            if (i15 != 0) {
                int i16 = ((int[]) obj3)[0];
                int i17 = ((i16 * i16) - (~(-(1429859319 * i16)))) - 1;
                int i18 = -(i16 * 488731359);
                int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                int i20 = (i19 & (-909019463)) + ((-909019463) | i19);
                int i21 = i20 >> 18;
                int i22 = ((i21 & (-32767)) + (i21 | (-32767))) / 16384;
                int i23 = (i20 - (~(((i22 | 1) << 1) - (i22 ^ 1)))) - 1;
                int i24 = i20 >> 24;
                int i25 = -(i23 ^ ((((i24 & (-511)) + (i24 | (-511))) / 256) + 1));
                int i26 = (i25 ^ 7) + ((i25 & 7) << 1);
                int i27 = (((i26 >> 19) - 16383) / 8192) + 1;
                if (i15 == 13230 / (((-((i27 ^ 1) + ((i27 & 1) << 1))) & i26) * 945)) {
                    return zzbo(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", zzxs.class});
                }
                if (i15 == 3) {
                    return new zzxq();
                }
                if (i15 == 4) {
                    return new zzxp(bArr);
                }
                if (i15 == 5) {
                    return zze;
                }
                if (i15 == 6) {
                    zzbbt zzbbtVar = zzf;
                    if (zzbbtVar != null) {
                        return zzbbtVar;
                    }
                    synchronized (zzxq.class) {
                        zzazzVar = zzf;
                        if (zzazzVar == null) {
                            zzazzVar = new zzazz(zze);
                            zzf = zzazzVar;
                        }
                    }
                    return zzazzVar;
                }
                throw null;
            }
            return (byte) 1;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArrB$5f1425da[4];
        if (strArr != null) {
            for (String str : strArr) {
                arrayList.add(str);
            }
        }
        throw new RuntimeException(String.valueOf(i8));
    }

    private static void d(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2;
        int i4 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = TuitionPaymentFragmentbindingInflater1;
        long j = 0;
        Object obj2 = null;
        if (cArr2 != null) {
            int i5 = $11 + 93;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 29;
                $11 = i8 % 128;
                if (i8 % i3 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cResolveSize = (char) View.resolveSize(0, 0);
                            int absoluteGravity = 2267 - Gravity.getAbsoluteGravity(0, 0);
                            int i9 = (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) + 32;
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSize, absoluteGravity, i9, -1927765101, false, $$e(b3, b4, (byte) (b4 + 3)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i7 %= 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((Process.getThreadPriority(0) + 20) >> 6), View.resolveSizeAndState(0, 0, 0) + 2267, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 32, -1927765101, false, $$e(b5, b6, (byte) (b6 + 3)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i7++;
                }
                i3 = 2;
                j = 0;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            byte b7 = (byte) 0;
            byte b8 = b7;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getEdgeSlop() >> 16), Process.getGidForName("") + 2268, 33 - View.resolveSize(0, 0), -1927765101, false, $$e(b7, b8, (byte) (b8 + 3)), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i10 = $10 + 39;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    int i12 = $10 + 15;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    obj = obj2;
                } else {
                    Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b9 = (byte) 0;
                        byte b10 = b9;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (49267 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 3261 - (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.indexOf("", "", 0) + 30, -127612708, false, $$e(b9, b10, (byte) (b10 + 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue() == deinitsession.asBinder) {
                        Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            byte b11 = (byte) 0;
                            byte b12 = b11;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 22879), 595 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 17 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1570859318, false, $$e(b11, b12, b12), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue();
                        int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i14];
                    } else {
                        obj = null;
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i15 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i15];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i16];
                        } else {
                            int i17 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i18 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i17];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i18];
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                int i19 = $10 + 75;
                $11 = i19 % 128;
                int i20 = i19 % 2;
                obj2 = obj;
            }
        }
        int i21 = $11 + 59;
        $10 = i21 % 128;
        int i22 = i21 % 2;
        for (int i23 = 0; i23 < i; i23++) {
            int i24 = $10 + 71;
            $11 = i24 % 128;
            int i25 = i24 % 2;
            cArr4[i23] = (char) (cArr4[i23] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static /* synthetic */ zzxq zza() {
        int i = 2 % 2;
        int i2 = f794a;
        int i3 = i2 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        zzxq zzxqVar = zze;
        int i5 = i2 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return zzxqVar;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentbindingInflater1 = new char[]{60117, 60120, 60062, 60119, 60048, 60053, 60058, 60063, 60034, 60073, 60050, 60040, 60055, 60047, 60123, 60054, 60118, 60116, 60052, 60043, 60121, 60088, 60072, 60056, 60041};
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (char) 57188;
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
    private static java.lang.String $$e(byte r6, byte r7, int r8) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 1
            byte[] r0 = com.google.android.libraries.places.internal.zzxq.$$c
            int r8 = 116 - r8
            int r6 = r6 * 4
            int r6 = 4 - r6
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r6 = r6 + r3
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzxq.$$e(byte, byte, int):java.lang.String");
    }
}

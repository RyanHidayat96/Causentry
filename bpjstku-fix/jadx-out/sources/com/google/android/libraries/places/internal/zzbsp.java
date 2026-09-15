package com.google.android.libraries.places.internal;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes3.dex */
final class zzbsp extends OutputStream {
    final /* synthetic */ zzbsr zza;
    private static final byte[] $$c = {102, -96, -78, -55};
    private static final int $$f = 88;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {93, -77, 2, Base64.padSymbol, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -54, -3, -3, 72, -56, -2, -3, 18, -10, 7, 16, -8, 65, -60, 4, 4, 5, -8, 24, -20, 16, -7, 13, -3, 4, 18, -1, -9, 5, 3, 1, 4, 67, -73, 3, 18, 1, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 21, -4, -2, 13, -2, -2, 10, 33, -34, 11, -3, 14, -16, 18, -10, 68};
    private static final int $$e = 34;
    private static final byte[] $$a = {89, 107, -36, -112, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 172;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int b = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -6377398940819159759L;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -1870255308;
    private static char TuitionPaymentFragmentbindingInflater1 = 34097;

    /* synthetic */ zzbsp(zzbsr zzbsrVar, byte[] bArr) {
        Objects.requireNonNull(zzbsrVar);
        this.zza = zzbsrVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.google.android.libraries.places.internal.zzbsp.$$a
            int r1 = 53 - r5
            int r7 = r7 * 52
            int r7 = 56 - r7
            int r6 = r6 * 14
            int r6 = 98 - r6
            byte[] r1 = new byte[r1]
            int r5 = 52 - r5
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r6
            r4 = r2
            r6 = r5
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L27:
            r3 = r0[r7]
        L29:
            int r7 = r7 + 1
            int r6 = r6 + r3
            int r6 = r6 + (-10)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbsp.a(byte, short, short, java.lang.Object[]):void");
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
    private static void d(int r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 18
            int r7 = 56 - r7
            int r9 = r9 + 4
            int r8 = r8 * 15
            int r8 = 99 - r8
            byte[] r0 = com.google.android.libraries.places.internal.zzbsp.$$d
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r9
            r4 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            int r9 = r9 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2b:
            int r9 = -r9
            int r8 = r8 + r9
            int r8 = r8 + 3
            r9 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbsp.d(int, short, int, java.lang.Object[]):void");
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        int i2 = 2 % 2;
        byte b2 = (byte) i;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char mirror = (char) (31581 - AndroidCharacter.getMirror('0'));
            int size = View.MeasureSpec.getSize(0) + 921;
            int iLastIndexOf = 27 - TextUtils.lastIndexOf("", '0');
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a((byte) 52, bArr[80], bArr[37], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mirror, size, iLastIndexOf, -1048449946, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(new char[]{0, 0, 0, 0}, new char[]{48637, 797, 55936, 39675}, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), Drawable.resolveOpacity(0, 0), new char[]{27915, 40232, 45201, 6406, 44541, 51272, 36731, 29589, 13793, 13643, 64701, 54097, 17462, 64480, 3836, 30174, 8113, 18386, 827, 49893, 60687, 31523}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(new char[]{0, 0, 0, 0}, new char[]{39088, 36463, 43067, 9485}, (char) (ImageFormat.getBitsPerPixel(0) + 3497), ((Process.getThreadPriority(0) + 20) >> 6) + 999190424, new char[]{13623, 43396, 60546, 5086, 58846, 61543, 31070, 11788, 7715, 43145, 29526, 30766, 50988, 48718, 41357}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cMakeMeasureSpec = (char) (31533 - View.MeasureSpec.makeMeasureSpec(0, 0));
            int packedPositionChild = 920 - ExpandableListView.getPackedPositionChild(0L);
            int i3 = 28 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            byte[] bArr2 = $$a;
            byte b3 = bArr2[80];
            byte b4 = bArr2[37];
            Object[] objArr6 = new Object[1];
            a(b3, b4, b4, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMakeMeasureSpec, packedPositionChild, i3, -778300370, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 31533);
                int mode = 921 - View.MeasureSpec.getMode(0);
                int capsMode = TextUtils.getCapsMode("", 0, 0) + 28;
                byte[] bArr3 = $$a;
                Object[] objArr7 = new Object[1];
                a(bArr3[33], bArr3[37], bArr3[80], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(jumpTapTimeout, mode, capsMode, -1142834547, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
            int i4 = (int) Runtime.getRuntime().totalMemory();
            int i5 = (-403930261) + (((~((-75919833) | i4)) | 67522752 | (~((-1698159812) | i4))) * (-880));
            int i6 = (~((-75919833) | (~i4))) | 1698159811;
            int i7 = ~(i4 | 75919832);
            int i8 = ((i5 + ((i6 | i7) * (-880))) + (i7 * 880)) - 985092068;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{33515, 10185, 10757, 4763}, (char) (39722 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{11085, 31112, 49850, 31267, 30721, 6240, 62208, 61013, 39144, 29389, 19468, 3242, 56375, 32463, 11345, 25042, 54840, 41398, 37558, 53283, 63836, 21994, 46596, 26402, 45608, 24402}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(new char[]{0, 0, 0, 0}, new char[]{968, 16846, 30287, 36144}, (char) ((Process.myPid() >> 22) + 12406), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, new char[]{20702, 9066, 5888, 20067, 23565, 36079, 23577, 21008, 27943, 14280, 59557, 6888, 60854, 8039, 52073, 43263, 12674, 15304}, objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
                b = i11 % 128;
                int i12 = i11 % 2;
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            try {
                Object[] objArr11 = {applicationContext, Integer.valueOf(i), 0, -985092068};
                byte[] bArr4 = $$d;
                byte b5 = (byte) (bArr4[52] - 1);
                Object[] objArr12 = new Object[1];
                d(b5, b5, bArr4[48], objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                byte b6 = bArr4[52];
                Object[] objArr13 = new Object[1];
                d(b6, b6, (byte) (-bArr4[7]), objArr13);
                Object[] objArr14 = (Object[]) cls3.getMethod((String) objArr13[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 31533);
                    int i13 = 922 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 28;
                    byte[] bArr5 = $$a;
                    Object[] objArr15 = new Object[1];
                    a(bArr5[33], bArr5[37], bArr5[80], objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maxKeyCode, i13, iResolveOpacity, -1142834547, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr14);
                try {
                    Object[] objArr16 = new Object[1];
                    c(new char[]{0, 0, 0, 0}, new char[]{48637, 797, 55936, 39675}, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), Color.blue(0), new char[]{27915, 40232, 45201, 6406, 44541, 51272, 36731, 29589, 13793, 13643, 64701, 54097, 17462, 64480, 3836, 30174, 8113, 18386, 827, 49893, 60687, 31523}, objArr16);
                    Class<?> cls4 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    c(new char[]{0, 0, 0, 0}, new char[]{39088, 36463, 43067, 9485}, (char) (3495 - TextUtils.lastIndexOf("", '0')), 999190424 - (ViewConfiguration.getTouchSlop() >> 8), new char[]{13623, 43396, 60546, 5086, 58846, 61543, 31070, 11788, 7715, 43145, 29526, 30766, 50988, 48718, 41357}, objArr17);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 31532);
                        int i14 = 922 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 28;
                        byte[] bArr6 = $$a;
                        byte b7 = bArr6[80];
                        byte b8 = bArr6[37];
                        Object[] objArr18 = new Object[1];
                        a(b7, b8, b8, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, i14, minimumFlingVelocity, -778300370, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char edgeSlop = (char) (31533 - (ViewConfiguration.getEdgeSlop() >> 16));
                        int i15 = 921 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int gidForName = Process.getGidForName("") + 29;
                        byte[] bArr7 = $$a;
                        Object[] objArr19 = new Object[1];
                        a((byte) 52, bArr7[80], bArr7[37], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(edgeSlop, i15, gidForName, -1048449946, false, (String) objArr19[0], null);
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
        int i16 = ((int[]) objArr[1])[0];
        int i17 = ((int[]) objArr[3])[0];
        if (i17 == i16) {
            int i18 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[]{i ^ (i << 5)}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int i19 = ~i;
            int i20 = i18 + (((((~((-1471138287) | i19)) | (~((-302941358) | i))) | (~(i19 | 302941357))) * 959) - 982888954) + (((~(i | 302941357)) | (~(i19 | (-302941358))) | (~((-1471138287) | i))) * 959);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i23 = b + 115;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i23 % 128;
                int i24 = i23 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i17 / (((i17 - 1) * i17) % 2), 0).show();
            int i25 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[]{i ^ (i << 5)}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int i26 = ~i;
            int i27 = i25 + (((1760939827 + (((~(i26 | (-540700))) | (~((-162794561) | i26))) * (-184))) + (((805372192 | (~((-968166753) | i26))) | (~((-805912892) | i26))) * 184)) - 2146455448);
            int i28 = (i27 << 13) ^ i27;
            int i29 = i28 ^ (i28 >>> 17);
            int i30 = b + 121;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i30 % 128;
            int i31 = i30 % 2;
        }
        int i32 = ((int[]) objArr2[0])[0];
        int i33 = ((((i32 * i32) - (~(-(824402881 * i32)))) - 1) - (~(-(i32 * (-491682541))))) - 1;
        int i34 = (i33 & 2058894308) + (2058894308 | i33);
        int i35 = i34 >> 15;
        int i36 = (((-262143) ^ i35) + ((i35 & (-262143)) << 1)) / 131072;
        int i37 = (i34 - (~((i36 & 1) + (i36 | 1)))) - 1;
        int i38 = i34 >> 18;
        int i39 = ((i38 ^ (-32767)) + ((i38 & (-32767)) << 1)) / 16384;
        int i40 = -(i37 ^ ((i39 & 1) + (i39 | 1)));
        int i41 = (i40 & 8) + (i40 | 8);
        int i42 = i41 >> 23;
        int i43 = ((i42 & (-1023)) + (i42 | (-1023))) / 512;
        byte[] bArr8 = new byte[10792 / (((-(((i43 & 1) + (i43 | 1)) + 1)) & i41) * 1349)];
        bArr8[0] = b2;
        this.zza.zzg(bArr8, 0, 1);
    }

    private static void c(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
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
        int i5 = $10 + 121;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i7 = $10 + 7;
            $11 = i7 % 128;
            int i8 = i7 % i3;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) i3;
                    byte b3 = (byte) (b2 - 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 8328), 1234 - ExpandableListView.getPackedPositionChild(0L), 35 - (KeyEvent.getMaxKeyCode() >> 16), -653973969, false, $$g(b2, b3, b3), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.getDefaultSize(0, 0), 2763 - TextUtils.lastIndexOf("", '0'), 13 - Process.getGidForName(""), 1504416861, false, $$g(b4, b5, b5), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 43325), (ViewConfiguration.getJumpTapTimeout() >> 16) + 253, 22 - (Process.myPid() >> 22), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cIndexOf = (char) (65199 - TextUtils.indexOf((CharSequence) "", '0'));
                    int offsetAfter = TextUtils.getOffsetAfter("", 0) + 2891;
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 17;
                    byte b6 = (byte) 1;
                    byte b7 = (byte) (b6 - 1);
                    String str$$g = $$g(b6, b7, b7);
                    i2 = 2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, offsetAfter, keyRepeatTimeout, 2012627446, false, str$$g, new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                i3 = i2;
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

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 115;
        b = i4 % 128;
        int i5 = i4 % 2;
        this.zza.zzg(bArr, i, i2);
        int i6 = b + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r5, int r6, int r7) {
        /*
            int r5 = 104 - r5
            int r7 = r7 * 3
            int r0 = r7 + 1
            byte[] r1 = com.google.android.libraries.places.internal.zzbsp.$$c
            int r6 = r6 * 3
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r4 = r7
            r3 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r7) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L20:
            int r3 = r3 + 1
            r4 = r1[r6]
        L24:
            int r4 = -r4
            int r6 = r6 + 1
            int r5 = r5 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbsp.$$g(byte, int, int):java.lang.String");
    }
}

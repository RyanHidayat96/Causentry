package com.google.android.libraries.places.widget.internal.photoviewer;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzm implements Parcelable {
    public static final Parcelable.Creator<zzm> CREATOR;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final List zza;
    private static final byte[] $$c = {104, 27, -72, 120};
    private static final int $$f = 149;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {65, -122, -65, 2, 23, 10, 3, 14, 9, 25, 8, -2, -6, 24, 12, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$e = 95;
    private static final byte[] $$a = {68, -119, -76, 97, 23, -37, 42, 11, -10, 18, -7, 0, 7, 7, 23, -44, 44, 10, -5, 6, 18};
    private static final int $$b = 175;
    private static int b = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = 11 - r9
            int r7 = r7 * 3
            int r7 = 100 - r7
            byte[] r0 = com.google.android.libraries.places.widget.internal.photoviewer.zzm.$$a
            int r8 = r8 * 10
            int r8 = r8 + 4
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r8
            r3 = r9
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r6
        L2a:
            int r8 = r8 + r3
            int r8 = r8 + (-5)
            int r7 = r7 + 1
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.internal.photoviewer.zzm.a(byte, short, byte, java.lang.Object[]):void");
    }

    private static void d(short s, short s2, short s3, Object[] objArr) {
        int i = s3 + 4;
        int i2 = (s * 15) + 84;
        int i3 = s2 * 41;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[53 - i3];
        int i4 = 52 - i3;
        int i5 = -1;
        if (bArr == null) {
            i2 = (i + i2) - 11;
            i5 = -1;
        }
        while (true) {
            int i6 = i;
            int i7 = i2;
            int i8 = i5 + 1;
            bArr2[i8] = (byte) i7;
            if (i8 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i9 = i6 + 1;
            i = i9;
            i2 = (i7 + bArr[i9]) - 11;
            i5 = i8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0165  */
    /* JADX WARN: Code duplicated, block: B:37:0x0166  */
    private static void c(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4;
        char[] cArr2;
        Throwable cause;
        int i5 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr3 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (true) {
            i4 = 29209604;
            if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i2) {
                break;
            }
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i6 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i6]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Process.myPid() >> 22), 3291 - View.combineMeasuredStates(0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 31, 1199271174, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 651 - (ViewConfiguration.getWindowTouchSlop() >> 8), ExpandableListView.getPackedPositionType(0L) + 44, -450685997, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i3 > 0) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr4 = new char[i2];
            System.arraycopy(cArr3, 0, cArr4, 0, i2);
            System.arraycopy(cArr4, 0, cArr3, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr4, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr3, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            int i7 = $10 + 15;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            } else {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Process.myPid() >> 22), (KeyEvent.getMaxKeyCode() >> 16) + 651, 45 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -450685997, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                i4 = 29209604;
            }
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
        int i8 = $10 + 121;
        $11 = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) throws Throwable {
        Object[] objArr;
        int i2 = 2 % 2;
        int i3 = b + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(parcel, "");
            List list = this.zza;
            parcel.writeInt(list.size());
            list.iterator();
            throw null;
        }
        Intrinsics.checkNotNullParameter(parcel, "");
        List list2 = this.zza;
        parcel.writeInt(list2.size());
        Iterator it = list2.iterator();
        while (true) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char c = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int iAxisFromString = 875 - MotionEvent.axisFromString("");
                int iIndexOf = TextUtils.indexOf("", "", 0) + 10;
                byte b2 = (byte) ($$b & 1);
                byte b3 = $$a[11];
                Object[] objArr2 = new Object[1];
                a(b2, b3, b3, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iAxisFromString, iIndexOf, -1199417970, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(obj);
            Object[] objArr3 = new Object[1];
            c(false, (ViewConfiguration.getFadingEdgeLength() >> 16) + 288, 22 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 16 - Color.argb(0, 0, 0, 0), new char[]{1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6}, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(false, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 292, (ViewConfiguration.getTapTimeout() >> 16) + 15, 8 - (ViewConfiguration.getTapTimeout() >> 16), new char[]{65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533}, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 876;
                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 10;
                byte[] bArr = $$a;
                byte b4 = bArr[11];
                Object[] objArr5 = new Object[1];
                a(b4, (byte) (b4 + 1), bArr[17], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maximumDrawingCacheSize, iResolveOpacity, tapTimeout, 254769921, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char defaultSize = (char) View.getDefaultSize(0, 0);
                    int iKeyCodeFromString = 876 - KeyEvent.keyCodeFromString("");
                    int i4 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9;
                    byte b5 = (byte) ($$b & 1);
                    byte b6 = b5;
                    Object[] objArr6 = new Object[1];
                    a(b5, b6, (byte) (b6 + 2), objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(defaultSize, iKeyCodeFromString, i4, 1324201839, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i5 = ~iIdentityHashCode;
                int i6 = 2094875452 + ((iIdentityHashCode | (-103942318)) * 140) + (((~((-103942318) | i5)) | 1050752) * (-280)) + (((~(iIdentityHashCode | (-1050753))) | (~(144252546 | i5)) | (-247144112)) * 140) + 255326553;
                int i7 = (i6 << 13) ^ i6;
                int i8 = i7 ^ (i7 >>> 17);
                ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
            } else {
                try {
                    Object[] objArr8 = {Integer.valueOf(i), 255326553};
                    byte[] bArr2 = $$d;
                    byte b7 = bArr2[16];
                    byte b8 = (byte) (-b7);
                    Object[] objArr9 = new Object[1];
                    d(b8, b8, b7, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    byte b9 = bArr2[18];
                    Object[] objArr10 = new Object[1];
                    d(b9, b9, bArr2[5], objArr10);
                    objArr = (Object[]) cls2.getMethod((String) objArr10[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr8);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                        int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 877;
                        int i9 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 11;
                        byte b10 = (byte) ($$b & 1);
                        byte b11 = b10;
                        Object[] objArr11 = new Object[1];
                        a(b10, b11, (byte) (b11 + 2), objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, iIndexOf2, i9, 1324201839, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr12 = new Object[1];
                        c(false, 288 - Color.alpha(0), 22 - (KeyEvent.getMaxKeyCode() >> 16), Color.alpha(0) + 16, new char[]{1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6}, objArr12);
                        Class<?> cls3 = Class.forName((String) objArr12[0]);
                        Object[] objArr13 = new Object[1];
                        c(false, 292 - (ViewConfiguration.getTouchSlop() >> 8), 15 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), AndroidCharacter.getMirror('0') - '(', new char[]{65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533}, objArr13);
                        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 876;
                            int i10 = 10 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                            byte[] bArr3 = $$a;
                            byte b12 = bArr3[11];
                            Object[] objArr14 = new Object[1];
                            a(b12, (byte) (b12 + 1), bArr3[17], objArr14);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cCombineMeasuredStates, threadPriority, i10, 254769921, false, (String) objArr14[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                            int i11 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 876;
                            int i12 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 11;
                            byte b13 = (byte) ($$b & 1);
                            byte b14 = $$a[11];
                            Object[] objArr15 = new Object[1];
                            a(b13, b14, b14, objArr15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(longPressTimeout, i11, i12, -1199417970, false, (String) objArr15[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
            int i13 = ((int[]) objArr[2])[0];
            int i14 = ((int[]) objArr[0])[0];
            if (i14 == i13) {
                int i15 = ((int[]) objArr[1])[0];
                Object[] objArr16 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int i16 = ~((int) Process.getStartElapsedRealtime());
                int i17 = i15 + (-275281809) + (((~(599865037 | i16)) | (-640175267)) * (-983)) + (((~(i16 | (-640175267))) | 570426496) * 983);
                int i18 = (i17 << 13) ^ i17;
                int i19 = i18 ^ (i18 >>> 17);
                ((int[]) objArr16[1])[0] = i19 ^ (i19 << 5);
                int i20 = b + 113;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i20 % 128;
                int i21 = i20 % 2;
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[3];
                if (strArr != null) {
                    int i22 = b + 83;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i22 % 128;
                    int i23 = i22 % 2;
                    for (String str : strArr) {
                        arrayList.add(str);
                    }
                }
                Toast.makeText((Context) null, i14 / (((i14 - 1) * i14) % 2), 0).show();
                int i24 = ((int[]) objArr[1])[0];
                Object[] objArr17 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i25 = ~iUptimeMillis;
                int i26 = i24 + (-696445652) + (((~((-37818625) | i25)) | 78128853) * 220) + (((~(i25 | (-710267139))) | 750577367) * (-440)) + ((iUptimeMillis | (-37818625)) * 220);
                int i27 = (i26 << 13) ^ i26;
                int i28 = i27 ^ (i27 >>> 17);
                ((int[]) objArr17[1])[0] = i28 ^ (i28 << 5);
            }
            if (!it.hasNext()) {
                int i29 = b + 119;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i29 % 128;
                int i30 = i29 % 2;
                return;
            }
            parcel.writeParcelable((Parcelable) it.next(), i);
            obj = null;
        }
    }

    static {
        TuitionPaymentFragmentbindingInflater1 = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        CREATOR = new zzl();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 119;
        TuitionPaymentFragmentbindingInflater1 = i % 128;
        int i2 = i % 2;
    }

    public zzm(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.zza = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = b + 13;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 115;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof zzm))) {
            if (!(!Intrinsics.areEqual(this.zza, ((zzm) obj).zza))) {
                int i2 = b + 65;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 36 / 0;
                }
                return true;
            }
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 75;
            b = i4 % 128;
            int i5 = i4 % 2;
        }
        return false;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = b + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            this.zza.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.zza.hashCode();
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 29;
        b = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 93 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        List list = this.zza;
        StringBuilder sb = new StringBuilder(list.toString().length() + 43);
        sb.append("ParcelablePhotoPageDataList(photoPageData=");
        sb.append(list);
        sb.append(")");
        String string = sb.toString();
        int i2 = b + 93;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public final List zza() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
        int i3 = i2 % 128;
        b = i3;
        int i4 = i2 % 2;
        List list = this.zza;
        int i5 = i3 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -83722273;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r7, byte r8, int r9) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 1
            byte[] r0 = com.google.android.libraries.places.widget.internal.photoviewer.zzm.$$c
            int r8 = r8 * 4
            int r8 = r8 + 4
            int r9 = 120 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r9 = r8
            r4 = r2
            goto L28
        L15:
            r3 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L19:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L26:
            r3 = r0[r9]
        L28:
            int r8 = r8 + r3
            int r9 = r9 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.internal.photoviewer.zzm.$$g(int, byte, int):java.lang.String");
    }
}

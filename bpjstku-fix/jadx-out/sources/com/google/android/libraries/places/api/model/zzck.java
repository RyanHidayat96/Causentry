package com.google.android.libraries.places.api.model;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
final class zzck extends zzt {
    public static final Parcelable.Creator<zzck> CREATOR;
    private static long TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int b;
    private static final byte[] $$c = {25, 31, 20, 1};
    private static final int $$d = 73;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {110, -73, -111, 99, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 12;
    private static int d = 0;
    private static int asInterface = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;

    zzck(Double d2, List list) {
        super(d2, list);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 52
            int r7 = 56 - r7
            int r5 = r5 * 14
            int r5 = r5 + 84
            byte[] r0 = com.google.android.libraries.places.api.model.zzck.$$a
            int r1 = 53 - r6
            byte[] r1 = new byte[r1]
            int r6 = 52 - r6
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r6
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            int r3 = r3 + 1
            r4 = r0[r7]
        L28:
            int r5 = r5 + r4
            int r5 = r5 + (-11)
            int r7 = r7 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.model.zzck.a(byte, byte, int, java.lang.Object[]):void");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = d + 81;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        if (getMinimumChargingRateKw() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeDouble(getMinimumChargingRateKw().doubleValue());
        }
        parcel.writeList(getConnectorTypes());
        int i5 = asInterface + 53;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void c(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        int i4 = 0;
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i5 = $10 + 13;
            $11 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cMyTid = (char) ((Process.myTid() >> 22) + 8328);
                    int packedPositionChild = 1234 - ExpandableListView.getPackedPositionChild(0L);
                    int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 36;
                    byte b2 = (byte) ($$c[3] - 1);
                    byte b3 = b2;
                    String str$$e = $$e(b2, b3, b3);
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyTid, packedPositionChild, modifierMetaStateMask, -653973969, false, str$$e, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                    int iArgb = 2764 - Color.argb(i4, i4, i4, i4);
                    int iIndexOf = TextUtils.indexOf("", "") + 14;
                    byte b4 = (byte) ($$c[3] + 1);
                    byte b5 = (byte) (b4 - 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(longPressTimeout, iArgb, iIndexOf, 1504416861, false, $$e(b4, b5, b5), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 254 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char threadPriority = (char) (65200 - ((Process.getThreadPriority(0) + 20) >> 6));
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2891;
                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 17;
                    byte b6 = $$c[3];
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(threadPriority, scrollBarFadeDuration, maxKeyCode, 2012627446, false, $$e(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentbindingInflater1 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) b) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                i2 = 2;
                i4 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
        int i7 = $10 + 65;
        $11 = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() throws Throwable {
        int i;
        Object[] objArr;
        Object[] objArr2;
        int i2 = 2 % 2;
        int i3 = d + 61;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1);
            int iAlpha = Color.alpha(0) + 651;
            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 44;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr3 = new Object[1];
            a(b2, b2, bArr[80], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iAlpha, scrollBarSize, -459846511, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(new char[]{0, 0, 0, 0}, new char[]{29018, 65117, 40372, 61257}, (char) (ImageFormat.getBitsPerPixel(0) + 1), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, new char[]{15087, 59306, 38339, 49435, 15258, 9438, 7504, 18458, 25705, 38038, 22755, 53820, 55539, 14654, 27090, 55446, 14204, 17976, 8110, 20282, 53639, 6943}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(new char[]{0, 0, 0, 0}, new char[]{64735, 11023, 54694, 32099}, (char) (25556 - TextUtils.lastIndexOf("", '0')), (-1507127300) - Color.argb(0, 0, 0, 0), new char[]{24710, 17611, 53327, 38487, 40459, 5786, 24852, 47425, 28403, 48433, 53986, 16211, 19134, 39899, 16280}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cGreen = (char) Color.green(0);
            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 651;
            int gidForName = Process.getGidForName("") + 45;
            byte[] bArr2 = $$a;
            Object[] objArr6 = new Object[1];
            a(bArr2[80], (byte) 52, bArr2[7], objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cGreen, maxKeyCode, gidForName, -873460649, false, (String) objArr6[0], null);
        }
        if (j != ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1610, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 27, 2145681644, false, null, new Class[0]);
                }
                Object[] objArr7 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(null), -1827556080, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 652;
                    int iMyPid = 44 - (Process.myPid() >> 22);
                    byte[] bArr3 = $$a;
                    Object[] objArr8 = new Object[1];
                    a(bArr3[80], (byte) 52, bArr3[7], objArr8);
                    i = 22;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, iLastIndexOf, iMyPid, 2075921419, false, (String) objArr8[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) View.getDefaultSize(0, 0), KeyEvent.getDeadChar(0, 0) + 695, View.MeasureSpec.getSize(0) + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (((Process.getThreadPriority(0) + 20) >> 6) + 63406), 793 - Color.red(0), 83 - (ViewConfiguration.getScrollBarSize() >> 8)), Integer.TYPE, Integer.TYPE});
                } else {
                    i = 22;
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr7);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cRed = (char) Color.red(0);
                    int deadChar = KeyEvent.getDeadChar(0, 0) + 651;
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 44;
                    byte b3 = $$a[7];
                    byte b4 = b3;
                    Object[] objArr9 = new Object[1];
                    a(b4, (byte) (b4 | 15), b3, objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRed, deadChar, keyRepeatTimeout, -1595579076, false, (String) objArr9[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArr);
                try {
                    char[] cArr = new char[i];
                    // fill-array-data instruction
                    cArr[0] = 15087;
                    cArr[1] = 59306;
                    cArr[2] = 38339;
                    cArr[3] = 49435;
                    cArr[4] = 15258;
                    cArr[5] = 9438;
                    cArr[6] = 7504;
                    cArr[7] = 18458;
                    cArr[8] = 25705;
                    cArr[9] = 38038;
                    cArr[10] = 22755;
                    cArr[11] = 53820;
                    cArr[12] = 55539;
                    cArr[13] = 14654;
                    cArr[14] = 27090;
                    cArr[15] = 55446;
                    cArr[16] = 14204;
                    cArr[17] = 17976;
                    cArr[18] = 8110;
                    cArr[19] = 20282;
                    cArr[20] = 53639;
                    cArr[21] = 6943;
                    Object[] objArr10 = new Object[1];
                    c(new char[]{0, 0, 0, 0}, new char[]{29018, 65117, 40372, 61257}, (char) (ViewConfiguration.getTouchSlop() >> 8), (-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), cArr, objArr10);
                    Class<?> cls2 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c(new char[]{0, 0, 0, 0}, new char[]{64735, 11023, 54694, 32099}, (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 25557), ImageFormat.getBitsPerPixel(0) - 1507127299, new char[]{24710, 17611, 53327, 38487, 40459, 5786, 24852, 47425, 28403, 48433, 53986, 16211, 19134, 39899, 16280}, objArr11);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
                        int maximumFlingVelocity = 651 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int iIndexOf = 43 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        byte[] bArr4 = $$a;
                        Object[] objArr12 = new Object[1];
                        a(bArr4[80], (byte) 52, bArr4[7], objArr12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cAxisFromString, maximumFlingVelocity, iIndexOf, -873460649, false, (String) objArr12[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                        int jumpTapTimeout = 651 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int iAlpha2 = 44 - Color.alpha(0);
                        byte[] bArr5 = $$a;
                        byte b5 = bArr5[7];
                        Object[] objArr13 = new Object[1];
                        a(b5, b5, bArr5[80], objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(touchSlop, jumpTapTimeout, iAlpha2, -459846511, false, (String) objArr13[0], null);
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
        } else {
            int i5 = asInterface + 75;
            d = i5 % 128;
            int i6 = i5 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                int doubleTapTimeout = 651 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int i7 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44;
                byte b6 = $$a[7];
                byte b7 = b6;
                Object[] objArr14 = new Object[1];
                a(b7, (byte) (b7 | 15), b6, objArr14);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(capsMode, doubleTapTimeout, i7, -1595579076, false, (String) objArr14[0], null);
            }
            Object[] objArr15 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i8 = ((int[]) objArr15[2])[0];
            int i9 = ((int[]) objArr15[0])[0];
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i10 = (((-2119151161) + (((-17310747) | (~startUptimeMillis)) * (-490))) + (((~(startUptimeMillis | 653511648)) | (-670822395)) * 490)) - 1606813790;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[3])[0] = i12 ^ (i12 << 5);
        }
        int i13 = ((int[]) objArr[0])[0];
        int i14 = ((int[]) objArr[2])[0];
        if (i14 == i13) {
            objArr2 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i15 = ((int[]) objArr[3])[0];
            int i16 = ((int[]) objArr[2])[0];
            int i17 = ((int[]) objArr[0])[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i18 = i15 + (-206147765) + (((-8395427) | (~iIdentityHashCode)) * (-490)) + (((~(iIdentityHashCode | 475776285)) | (-484171712)) * 490) + 1411724240;
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr2[3])[0] = i20 ^ (i20 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[1];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i14 / (((i14 - 1) * i14) % 2), 0).show();
            objArr2 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i21 = ((int[]) objArr[3])[0];
            int i22 = ((int[]) objArr[2])[0];
            int i23 = ((int[]) objArr[0])[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i24 = ~iIdentityHashCode2;
            int i25 = i21 + (-2092247050) + (((~((-4483587) | i24)) | (~((-646088069) | iIdentityHashCode2)) | (~(651624430 | iIdentityHashCode2))) * 765) + (((~((-650571655) | i24)) | 4483586) * 1530) + (((~(iIdentityHashCode2 | (-650571655))) | (~(i24 | 651624430))) * 765);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr2[3])[0] = i27 ^ (i27 << 5);
        }
        int i28 = ((int[]) objArr2[3])[0];
        int i29 = ((i28 * i28) - (~(-(1224344796 * i28)))) - 1;
        int i30 = -(i28 * (-1378301160));
        int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
        int i32 = (i31 ^ (-1320214492)) + (((-1320214492) & i31) << 1);
        int i33 = ((i32 >> 21) - 4095) / 2048;
        int i34 = (i32 - (~(((i33 | 1) << 1) - (i33 ^ 1)))) - 1;
        int i35 = i32 >> 28;
        int i36 = (((i35 | (-31)) << 1) - (i35 ^ (-31))) / 16;
        int i37 = (-(i34 ^ ((i36 ^ 1) + ((i36 & 1) << 1)))) + 2;
        int i38 = i37 >> 26;
        int i39 = ((i38 ^ ComposerKt.defaultsKey) + ((i38 & ComposerKt.defaultsKey) << 1)) / 64;
        int i40 = (i39 ^ 1) + ((i39 & 1) << 1);
        return 0 / ((i37 & (-(((i40 | 1) << 1) - (i40 ^ 1)))) * 495);
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        b();
        CREATOR = new zzcj();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void b() {
        TuitionPaymentFragmentbindingInflater1 = -6377398940819159759L;
        b = 115976892;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (char) 34097;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(byte r5, byte r6, int r7) {
        /*
            int r5 = r5 + 102
            int r7 = r7 * 3
            int r7 = r7 + 1
            int r6 = r6 * 4
            int r6 = 4 - r6
            byte[] r0 = com.google.android.libraries.places.api.model.zzck.$$c
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r7
            r3 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L22:
            r4 = r0[r6]
        L24:
            int r4 = -r4
            int r5 = r5 + r4
            int r6 = r6 + 1
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.model.zzck.$$e(byte, byte, int):java.lang.String");
    }
}

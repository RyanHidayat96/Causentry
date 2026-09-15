package com.google.android.libraries.places.api.model;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.libraries.places.internal.zzbla;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes3.dex */
final class zzdp implements Parcelable.Creator {
    private static short[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {99, -43, -44, -62};
    private static final int $$d = 165;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {12, -88, 33, 118, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$b = 42;
    private static int asBinder = 0;
    private static int d = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = -1634613897;
    private static int b = -1934795574;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1021002142;
    private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {12, -18, 18, -27, -49, 48, -18, 23, -25, 28, -64, -61, 93, -30, -89, 44, 29, 28, 27, -24, 16, -21, 5, 30, -30, 19, -18, -19, 26, -11, 8, 25, 20, -27, -23, 19, -31, 2, -18, 23, -25, 28, -64, -61, 33, 31, -21, 19, -40, 43, 13, -13, 17, 2, -25, 19, -54, Base64.padSymbol, 19, -12, -1, 41, -29, -19, 19, -32, -17, -25, 29};

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.libraries.places.api.model.zzdp.$$a
            int r6 = r6 * 2
            int r6 = 84 - r6
            int r7 = r7 * 15
            int r7 = r7 + 38
            int r8 = 93 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r6
            r6 = r7
            r5 = r2
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r8]
        L27:
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            int r8 = r8 + 1
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.model.zzdp.a(byte, byte, short, java.lang.Object[]):void");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 101;
        d = i3 % 128;
        zzdq[] zzdqVarArr = new zzdq[i];
        if (i3 % 2 == 0) {
            int i4 = 70 / 0;
        }
        return zzdqVarArr;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Money money = (Money) parcel.readParcelable(zzey.class.getClassLoader());
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 29944);
            int iResolveOpacity = 1755 - Drawable.resolveOpacity(0, 0);
            int deadChar = 23 - KeyEvent.getDeadChar(0, 0);
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (b3 | 89), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(edgeSlop, iResolveOpacity, deadChar, 986134021, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(1334436585 - Drawable.resolveOpacity(0, 0), (-46) - MotionEvent.axisFromString(""), (short) (TextUtils.indexOf((CharSequence) "", '0') + 1), (byte) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getTapTimeout() >> 16) - 305961361, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(1334436589 - Color.alpha(0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 46, (short) TextUtils.indexOf("", "", 0, 0), (byte) (ImageFormat.getBitsPerPixel(0) + 1), View.MeasureSpec.makeMeasureSpec(0, 0) - 305961339, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 29944);
            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 1755;
            int defaultSize = View.getDefaultSize(0, 0) + 23;
            byte[] bArr = $$a;
            Object[] objArr5 = new Object[1];
            a(bArr[7], bArr[28], (byte) 52, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maxKeyCode, offsetBefore, defaultSize, 1596667560, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = d + 103;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char scrollBarFadeDuration = (char) (29944 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                int iRed = Color.red(0) + 1755;
                int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 23;
                byte[] bArr2 = $$a;
                byte b4 = bArr2[7];
                Object[] objArr6 = new Object[1];
                a(b4, bArr2[28], b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollBarFadeDuration, iRed, fadingEdgeLength, 1599039318, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[1], (String[]) objArr7[4]};
            int iMyTid = Process.myTid();
            int i4 = (-646038039) + (((~((-11544131) | (~iMyTid))) | (~(201058295 | iMyTid))) * (-272)) + (((~((-49456707) | iMyTid)) | 37912576) * (-272)) + (((~(iMyTid | 49456706)) | 163145719) * 272) + 1909351536;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[3])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(1334436594 - TextUtils.indexOf("", ""), KeyEvent.getDeadChar(0, 0) - 45, (short) ((-1) - TextUtils.lastIndexOf("", '0', 0)), (byte) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (-305961324) - View.resolveSize(0, 0), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c((ViewConfiguration.getDoubleTapTimeout() >> 16) + 1334436593, Gravity.getAbsoluteGravity(0, 0) - 45, (short) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), (byte) TextUtils.getCapsMode("", 0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) - 305961308, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {1240517050};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Color.alpha(0) + 42049), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1726, ExpandableListView.getPackedPositionType(0L) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113 = zzbla.TuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113(iIntValue, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), 1909351536, false, true);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char offsetAfter = (char) (TextUtils.getOffsetAfter("", 0) + 29944);
                    int iResolveOpacity2 = 1755 - Drawable.resolveOpacity(0, 0);
                    int maxKeyCode2 = (KeyEvent.getMaxKeyCode() >> 16) + 23;
                    byte[] bArr3 = $$a;
                    byte b5 = bArr3[7];
                    Object[] objArr11 = new Object[1];
                    a(b5, bArr3[28], b5, objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetAfter, iResolveOpacity2, maxKeyCode2, 1599039318, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113);
                try {
                    Object[] objArr12 = new Object[1];
                    c(KeyEvent.keyCodeFromString("") + 1334436585, (-46) - TextUtils.lastIndexOf("", '0'), (short) (ViewConfiguration.getLongPressTimeout() >> 16), (byte) View.MeasureSpec.getSize(0), AndroidCharacter.getMirror('0') - 39361, objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    c((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1334436588, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 46, (short) (ViewConfiguration.getLongPressTimeout() >> 16), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), ((byte) KeyEvent.getModifierMetaStateMask()) - 305961338, objArr13);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char windowTouchSlop = (char) (29944 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                        int iGreen = 1755 - Color.green(0);
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23;
                        byte[] bArr4 = $$a;
                        Object[] objArr14 = new Object[1];
                        a(bArr4[7], bArr4[28], (byte) 52, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(windowTouchSlop, iGreen, maximumDrawingCacheSize, 1596667560, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cNormalizeMetaState = (char) (29944 - KeyEvent.normalizeMetaState(0));
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 1756;
                        int iResolveSizeAndState = 23 - View.resolveSizeAndState(0, 0, 0);
                        byte b6 = $$a[7];
                        byte b7 = b6;
                        Object[] objArr15 = new Object[1];
                        a(b6, b7, (byte) (b7 | 89), objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cNormalizeMetaState, iLastIndexOf, iResolveSizeAndState, 986134021, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                    int i7 = d + 63;
                    asBinder = i7 % 128;
                    int i8 = i7 % 2;
                    objArr = objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$7879113;
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
        int i9 = ((int[]) objArr[1])[0];
        int i10 = ((int[]) objArr[0])[0];
        if (i10 != i9) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i11 = d + 123;
                asBinder = i11 % 128;
                for (int i12 = i11 % 2 == 0 ? 0 : 1; i12 < strArr.length; i12++) {
                    arrayList.add(strArr[i12]);
                }
            }
            throw new RuntimeException(String.valueOf(i10));
        }
        int i13 = ((int[]) objArr[3])[0];
        Object[] objArr16 = {new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
        int iMyUid = Process.myUid();
        int i14 = ~iMyUid;
        int i15 = i13 + 1353485922 + (((-27265033) | i14) * (-369)) + (((~((-240990024) | i14)) | (-28387598)) * (-369)) + (((~(iMyUid | 240990023)) | (-268255056) | (~(i14 | (-1122566)))) * 369);
        int i16 = (i15 << 13) ^ i15;
        int i17 = i16 ^ (i16 >>> 17);
        ((int[]) objArr16[3])[0] = i17 ^ (i17 << 5);
        return new zzdq(money, (Money) parcel.readParcelable(zzey.class.getClassLoader()));
    }

    private static void c(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        int i4;
        long j;
        int length;
        byte[] bArr;
        int i5 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(b)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
                int edgeSlop = 2267 - (ViewConfiguration.getEdgeSlop() >> 16);
                int size = 33 - View.MeasureSpec.getSize(0);
                byte length2 = (byte) $$c.length;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAxisFromString, edgeSlop, size, 1387473586, false, $$e((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i6 = $11 + 7;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                int i8 = $11 + 73;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                byte[] bArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (bArr2 != null) {
                    int length3 = bArr2.length;
                    byte[] bArr3 = new byte[length3];
                    int i10 = 0;
                    while (i10 < length3) {
                        int i11 = $11 + 123;
                        $10 = i11 % 128;
                        if (i11 % 2 != 0) {
                            try {
                                Object[] objArr3 = {Integer.valueOf(bArr2[i10])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b3 = (byte) 0;
                                    byte b4 = b3;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Color.rgb(0, 0, 0) + 16777216), 3406 - AndroidCharacter.getMirror('0'), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 18, -1054011043, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE});
                                }
                                bArr3[i10] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                                i10 >>= 1;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr2[i10])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 3359 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 18, -1054011043, false, $$e(b5, b6, b6), new Class[]{Integer.TYPE});
                            }
                            bArr3[i10] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).byteValue();
                            i10++;
                        }
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    Object[] objArr5 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                        int trimmedLength = TextUtils.getTrimmedLength("") + 2267;
                        int minimumFlingVelocity = 33 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        byte length4 = (byte) $$c.length;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(capsMode, trimmedLength, minimumFlingVelocity, 1387473586, false, $$e((byte) 0, length4, (byte) (length4 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr4[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                    j = 3046761265686732006L;
                } else {
                    j = 3046761265686732006L;
                    iIntValue = (short) (((short) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3[i3 + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                }
            } else {
                j = 3046761265686732006L;
            }
            if (iIntValue > 0) {
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ j)) + i4;
                Object[] objArr6 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = (byte) (b7 + 3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (55904 - Gravity.getAbsoluteGravity(0, 0)), 2855 - ((Process.getThreadPriority(0) + 20) >> 6), 13 - TextUtils.indexOf("", "", 0, 0), -1529949196, false, $$e(b7, b8, (byte) (b8 - 3)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (bArr5 != null) {
                    int i12 = $10 + 95;
                    $11 = i12 % 128;
                    if (i12 % 2 == 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                    }
                    int i13 = 0;
                    while (i13 < length) {
                        int i14 = $10 + 93;
                        $11 = i14 % 128;
                        if (i14 % 2 == 0) {
                            bArr[i13] = (byte) (((long) bArr5[i13]) * 3046761265686732006L);
                        } else {
                            bArr[i13] = (byte) (((long) bArr5[i13]) ^ 3046761265686732006L);
                            i13++;
                        }
                    }
                    bArr5 = bArr;
                }
                boolean z = bArr5 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    int i15 = $11 + 51;
                    $10 = i15 % 128;
                    if (i15 % 2 != 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (z) {
                        byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i16 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i16 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i16]) ^ 3046761265686732006L)) + s)) ^ b2));
                    } else {
                        short[] sArr = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i17 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i17 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i17]) ^ 3046761265686732006L)) + s)) ^ b2));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
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

    zzdp() {
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(int r6, short r7, int r8) {
        /*
            int r6 = r6 * 3
            int r6 = 3 - r6
            int r8 = r8 * 3
            int r8 = r8 + 1
            byte[] r0 = com.google.android.libraries.places.api.model.zzdp.$$c
            int r7 = 121 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r6
            r4 = r8
            r3 = r2
            goto L2a
        L15:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L19:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            int r7 = r7 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L28:
            r4 = r0[r7]
        L2a:
            int r6 = r6 + r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.model.zzdp.$$e(int, short, int):java.lang.String");
    }
}

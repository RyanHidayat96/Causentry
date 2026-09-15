package com.google.android.libraries.places.widget.model;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.abortCapture;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzd implements Parcelable.Creator {
    private static final byte[] $$c = {58, 66, -14, -31};
    private static final int $$f = 106;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {107, 48, 57, 107, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$e = 59;
    private static final byte[] $$a = {58, 66, -1, 15, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 27;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -4247823327586526298L;

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 15
            int r0 = r6 + 38
            int r8 = r8 * 3
            int r8 = 84 - r8
            byte[] r1 = com.google.android.libraries.places.widget.model.zzd.$$a
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            int r6 = r6 + 37
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2e
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2e:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.model.zzd.a(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 52
            int r7 = r7 + 1
            int r8 = r8 * 4
            int r8 = 84 - r8
            int r6 = r6 + 4
            byte[] r0 = com.google.android.libraries.places.widget.model.zzd.$$d
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            int r6 = r6 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r6]
        L28:
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + (-11)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.widget.model.zzd.c(short, int, int, java.lang.Object[]):void");
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        AutocompleteListDensity autocompleteListDensityCreateFromParcel;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 5;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i3 == 0) {
            parcel.readInt();
            throw null;
        }
        if (parcel.readInt() == 0) {
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            autocompleteListDensityCreateFromParcel = null;
        } else {
            autocompleteListDensityCreateFromParcel = AutocompleteListDensity.CREATOR.createFromParcel(parcel);
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 79;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            int i7 = i6 % 2;
        }
        return new AutocompleteUiCustomization(autocompleteListDensityCreateFromParcel, parcel.readString(), parcel.readInt() != 0 ? AutocompleteUiIcon.CREATOR.createFromParcel(parcel) : null, parcel.readString(), null);
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-2687588926731523482L), cArr, i);
        int i3 = 4;
        abortcapture.b = 4;
        while (abortcapture.b < cArrB.length) {
            int i4 = $11 + 57;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - i3;
            int i6 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % i3]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 64839), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1355, 38 - (ViewConfiguration.getPressedStateDuration() >> 16), 894276454, false, $$g(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47772 - Process.getGidForName("")), 468 - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12, 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i7 = $10 + 3;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                i3 = 4;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x01e8  */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) throws Throwable {
        Object[] objArr;
        char c;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        int i5 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char size = (char) View.MeasureSpec.getSize(0);
            int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 2267;
            int defaultSize = 33 - View.getDefaultSize(0, 0);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[5], bArr[2], bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(size, iIndexOf, defaultSize, -887667012, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        b(new char[]{',', 61965, 19303, 34601, 'M', 17315, 10371, 37403, 51011, 35492, 24963, 23367, 36419, 52670, 47817, 9274, 21845, 62654, 62355, 60684, 7233, 16270, 13451, 46598, 58191, 26278}, KeyEvent.getMaxKeyCode() >> 16, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b(new char[]{20638, 29899, 14899, 62047, 20731, 50535, 22994, 59247, 38893, 3182, 4311, 11853, 57083, 19306, 52191, 20843, 1527, 29286, 33494}, ViewConfiguration.getLongPressTimeout() >> 16, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 2267;
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 34;
            byte[] bArr2 = $$a;
            byte b = bArr2[5];
            Object[] objArr5 = new Object[1];
            a(b, (byte) (b | 50), bArr2[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, jumpTapTimeout, iLastIndexOf, -874156483, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cAlpha = (char) Color.alpha(0);
                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2267;
                int iAlpha = 33 - Color.alpha(0);
                byte b2 = $$a[7];
                byte b3 = b2;
                Object[] objArr6 = new Object[1];
                a(b3, (byte) (b3 | 103), b2, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cAlpha, keyRepeatDelay, iAlpha, -654680577, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i6 = ((int[]) objArr7[0])[0];
            int i7 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[1];
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i8 = ~((-50893391) | (~iMaxMemory));
            int i9 = (((((740517905 | i8) | (~(50893390 | iMaxMemory))) * (-338)) + 1995662037) + (((~(iMaxMemory | 791411295)) | i8) * 338)) - 358917492;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[2])[0] = i11 ^ (i11 << 5);
            c = 3;
        } else {
            Object[] objArr8 = new Object[1];
            b(new char[]{28830, 42158, 41136, 17936, 28927, 5376, 50004, 21282, 47089, 56327, 35412, 39550, 65279, 39710, 20800, 58750, 9695, 41485, 6212, 11321, 27880, 26887, 57156, 30505, 37834, 12294, 58946, 48693, 56063, 65290}, ExpandableListView.getPackedPositionGroup(0L), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            b(new char[]{54892, 5807, 7278, 23388, 54799, 42778, 32668, 20078, 4361, 28161, 13978, 34653, 22556, 10527, 60802, 63605, 33551, 4110, 42138, 12661, 51715, 56065}, View.getDefaultSize(0, 0), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i12 % 128;
                    int i13 = i12 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            try {
                Object[] objArr10 = {applicationContext, Integer.valueOf(i), 0, -358917492};
                byte[] bArr3 = $$d;
                byte b4 = bArr3[5];
                Object[] objArr11 = new Object[1];
                c((byte) (-b4), bArr3[7], b4, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b5 = bArr3[5];
                Object[] objArr12 = new Object[1];
                c((byte) (-b5), b5, bArr3[7], objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                if (applicationContext != null) {
                    int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 7;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i14 % 128;
                    int i15 = i14 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c3 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                        int pressedStateDuration = 2267 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        int iIndexOf2 = 33 - TextUtils.indexOf("", "");
                        byte b6 = $$a[7];
                        byte b7 = b6;
                        Object[] objArr14 = new Object[1];
                        a(b7, (byte) (b7 | 103), b6, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c3, pressedStateDuration, iIndexOf2, -654680577, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                    try {
                        Object[] objArr15 = new Object[1];
                        b(new char[]{',', 61965, 19303, 34601, 'M', 17315, 10371, 37403, 51011, 35492, 24963, 23367, 36419, 52670, 47817, 9274, 21845, 62654, 62355, 60684, 7233, 16270, 13451, 46598, 58191, 26278}, ViewConfiguration.getTapTimeout() >> 16, objArr15);
                        Class<?> cls4 = Class.forName((String) objArr15[0]);
                        Object[] objArr16 = new Object[1];
                        b(new char[]{20638, 29899, 14899, 62047, 20731, 50535, 22994, 59247, 38893, 3182, 4311, 11853, 57083, 19306, 52191, 20843, 1527, 29286, 33494}, ViewConfiguration.getTapTimeout() >> 16, objArr16);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cBlue = (char) Color.blue(0);
                            int capsMode = 2267 - TextUtils.getCapsMode("", 0, 0);
                            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 33;
                            byte[] bArr4 = $$a;
                            byte b8 = bArr4[5];
                            Object[] objArr17 = new Object[1];
                            a(b8, (byte) (b8 | 50), bArr4[7], objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cBlue, capsMode, maxKeyCode, -874156483, false, (String) objArr17[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                            int i16 = 2268 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                            int i17 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 32;
                            byte[] bArr5 = $$a;
                            Object[] objArr18 = new Object[1];
                            a(bArr5[5], bArr5[2], bArr5[7], objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(longPressTimeout, i16, i17, -887667012, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr13;
                c = 3;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (((int[]) objArr[0])[0] != ((int[]) objArr[c])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[1];
            if (strArr2 == null) {
                throw null;
            }
            while (i5 < strArr2.length) {
                int i18 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i18 % 128;
                if (i18 % 2 != 0) {
                    arrayList.add(strArr2[i5]);
                    i5 += 100;
                } else {
                    arrayList.add(strArr2[i5]);
                    i5++;
                }
            }
            throw null;
        }
        int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i19 % 128;
        int i20 = i19 % 2;
        Object[] objArr19 = {new int[]{i}, strArr, new int[1], new int[]{i}};
        int i21 = ((int[]) objArr[2])[0];
        int i22 = ((int[]) objArr[0])[0];
        int i23 = ((int[]) objArr[3])[0];
        String[] strArr3 = (String[]) objArr[1];
        int iIdentityHashCode = System.identityHashCode(this);
        int i24 = i21 + 164731911 + (((~(805305315 | iIdentityHashCode)) | 3408000) * (-756)) + (((~iIdentityHashCode) | 805305315) * 756);
        int i25 = i24 ^ (i24 << 13);
        int i26 = i25 ^ (i25 >>> 17);
        ((int[]) objArr19[2])[0] = i26 ^ (i26 << 5);
        int i27 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i27 % 128;
        int i28 = i27 % 2;
        return new AutocompleteUiCustomization[i];
    }

    private static String $$g(short s, short s2, short s3) {
        int i = s + 4;
        int i2 = s2 * 4;
        int i3 = (s3 * 2) + 107;
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[1 - i2];
        int i4 = 0 - i2;
        int i5 = -1;
        if (bArr == null) {
            i3 += i4;
        }
        while (true) {
            i5++;
            i++;
            bArr2[i5] = (byte) i3;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            i3 += bArr[i];
        }
    }
}

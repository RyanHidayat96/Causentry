package com.squareup.okhttp;

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
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.squareup.okhttp.internal.http.HttpDate;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes5.dex */
public final class Headers {
    private final String[] namesAndValues;
    private static final byte[] $$c = {117, -15, -81, 1};
    private static final int $$f = 143;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {99, -43, -44, -62, -12, 2, 63, -57, -8, 0, 8, -5, 7, 55, -51, -13, 10, -14, 3, 6, 5, 54, -62, 3, 7, -16, 17, -17, 9, 4, -14, 69, -66, 4, 11, -2, -2, -14, 69, -36, 46, -69, 5, -33, 12, -11, 11, -6, 1, 30, -17, -24, 12, 8, -9, -6, 46, -44, 17, -6, -6, 8, -9, -6, 1, 3, 11, 2, -6, 8, -11, 3, -5, 2, 3, -5, 9, 1, -18, 13, 4, -18, 42, -34, 11, -1, -7, 8, -1, -1, 5, -20, 9, -8, 67};
    private static final int $$e = 14;
    private static final byte[] $$a = {6, 51, 46, 31, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$b = 153;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static char[] b = {45565, 36849, 52734, 3047, 18943, 34810, 50666, 935, 16875, 40948, 56748, 7150, 22977, 38856, 54722, 5076, 20929, 45036, 60870, 11210, 27075, 42952, 14653, 1847, 17727, 33569, 49447, 3890, 19758, 35615, 51493, 5922, 21802, 37645, 53525, 7954, 23831, 45565, 36849, 52734, 3047, 18943, 34810, 50666, 935, 16869, 40951, 56818, 7059, 23033, 38872, 54722, 5080, 20954, 44998, 60894, 11228, 27124, 42955, 58796, 9148, 25013, 49075, 45567, 36842, 52712, 3047, 18933, 34813, 50682, 968, 16884, 40951, 56814, 7124, 23003, 38874, 54722, 5080, 20931, 44993, 26518, 22942, 7052, 56724, 40926, 20895, 5007, 54663, 38787, 18889, 2993, 52644, 36779, 16815, 947, 50620, 55817, 58375, 42499, 24583, 8728, 60422, 44550, 26636, 10800, 62490, 46605, 28713, 12807, 64552, 48686, 30760, 386, 16342, 32208, 48088, 63965, 14301, 30148, 45971, 61841, 12237, 28104, 43940, 59889, 10226, 26107, 41896, 57783, 8114, 23984, 39916, 55737, 6072, 21957, 37783, 53661, 4044, 19868, 35792, 51671, 1923, 17886, 33748, 49641, 65458, 15844, 31712, 47597, 63470, 13818, 29604, 45486, 61438, 11770, 27401, 43346, 59218, 9481, 25352, 41281, 57107, 7454, 23368, 39192, 55063, 5408, 21367, 37153, 53027, 3370, 19299, 35174, 51041, 1336, 17263, 32067, 17218, 322, 50975, 34076, 19226, 2384, 52994, 36189, 21341, 4366, 55139, 38241, 23349, 6508, 57145, 40226, 25376, 8480, 59178, 42281, 27432, 10500, 61267, 44298, 29535, 12556, 63304, 46407, 31566, 14659, 65349, 48505, 33569, 16755, 1912, 50552, 35626, 18739, 3943, 52586, 37694, 20792, 6039, 54675, 39827, 22937, 8094, 56713, 41936, 24975, 10112, 58846, 43915, 27057, 12215, 60907, 46061, 29116, 14245, 62965, 48039, 31148, 16379};
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -68126007254741089L;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 14
            int r6 = r6 + 84
            int r5 = r5 + 4
            int r7 = r7 * 52
            int r0 = 53 - r7
            byte[] r1 = com.squareup.okhttp.Headers.$$a
            byte[] r0 = new byte[r0]
            int r7 = 52 - r7
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r6
            r6 = r7
            r3 = r2
            goto L2b
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L25:
            int r5 = r5 + 1
            int r3 = r3 + 1
            r4 = r1[r5]
        L2b:
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.Headers.a(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 39
            int r6 = 42 - r6
            int r7 = r7 * 13
            int r0 = 53 - r7
            byte[] r1 = com.squareup.okhttp.Headers.$$d
            int r8 = r8 * 15
            int r8 = r8 + 84
            byte[] r0 = new byte[r0]
            int r7 = 52 - r7
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L2f
        L18:
            r3 = r2
        L19:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2a:
            r3 = r1[r6]
            r5 = r3
            r3 = r8
            r8 = r5
        L2f:
            int r8 = -r8
            int r8 = r8 + r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.Headers.d(short, short, int, java.lang.Object[]):void");
    }

    private Headers(Builder builder) {
        this.namesAndValues = (String[]) builder.namesAndValues.toArray(new String[builder.namesAndValues.size()]);
    }

    private Headers(String[] strArr) {
        this.namesAndValues = strArr;
    }

    public final String get(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 41;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            get(this.namesAndValues, str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str2 = get(this.namesAndValues, str);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 43;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 60 / 0;
        }
        return str2;
    }

    public final Date getDate(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        String str2 = get(str);
        if (str2 == null) {
            return null;
        }
        Date date = HttpDate.parse(str2);
        int i4 = TuitionPaymentFragmentbindingInflater1 + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 77 / 0;
        }
        return date;
    }

    public final int size() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 119;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        return i2 % 2 == 0 ? this.namesAndValues.length * 2 : this.namesAndValues.length / 2;
    }

    public final String name(int i) {
        int i2 = 2 % 2;
        int i3 = i * 2;
        Object obj = null;
        if (i3 >= 0) {
            String[] strArr = this.namesAndValues;
            if (i3 < strArr.length) {
                int i4 = TuitionPaymentFragmentbindingInflater1 + 27;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                if (i4 % 2 == 0) {
                    return strArr[i3];
                }
                String str = strArr[i3];
                obj.hashCode();
                throw null;
            }
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final String value(int i) {
        int i2 = 2 % 2;
        int i3 = (i * 2) + 1;
        Object obj = null;
        if (i3 >= 0) {
            String[] strArr = this.namesAndValues;
            if (i3 < strArr.length) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 13;
                TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                if (i4 % 2 != 0) {
                    return strArr[i3];
                }
                String str = strArr[i3];
                obj.hashCode();
                throw null;
            }
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 99 / 0;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x035c  */
    /* JADX WARN: Code duplicated, block: B:63:0x035d  */
    private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
        Object obj;
        Throwable cause;
        int i3 = 2;
        int i4 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i5 = $11 + 85;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (true) {
            obj = null;
            if (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= i2) {
                break;
            }
            int i7 = $11 + 121;
            $10 = i7 % 128;
            if (i7 % i3 != 0) {
                int i8 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(b[i - i8])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char mirror = (char) ('0' - AndroidCharacter.getMirror('0'));
                        int trimmedLength = 2187 - TextUtils.getTrimmedLength("");
                        int edgeSlop = 40 - (ViewConfiguration.getEdgeSlop() >> 16);
                        byte b2 = (byte) ($$c[3] - 1);
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mirror, trimmedLength, edgeSlop, 841711447, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char c2 = (char) (33018 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        int deadChar = KeyEvent.getDeadChar(0, 0) + 3011;
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 26;
                        byte b4 = (byte) ($$f & 2);
                        byte b5 = (byte) (b4 - 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, deadChar, offsetBefore, 321985076, false, $$g(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i8] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cLastIndexOf = (char) (36504 - TextUtils.lastIndexOf("", '0', 0));
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 3376;
                        int iResolveSize = 17 - View.resolveSize(0, 0);
                        byte b6 = $$c[3];
                        byte b7 = (byte) (b6 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf, maxKeyCode, iResolveSize, -968507904, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i9 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                Object[] objArr5 = {Integer.valueOf(b[i + i9])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                    int mirror2 = 2235 - AndroidCharacter.getMirror('0');
                    int iIndexOf = 40 - TextUtils.indexOf("", "", 0, 0);
                    byte b8 = (byte) ($$c[3] - 1);
                    byte b9 = b8;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, mirror2, iIndexOf, 841711447, false, $$g(b8, b9, b9), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i9), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cMakeMeasureSpec = (char) (33017 - View.MeasureSpec.makeMeasureSpec(0, 0));
                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 3011;
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 26;
                    byte b10 = (byte) ($$f & 2);
                    byte b11 = (byte) (b10 - 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMakeMeasureSpec, absoluteGravity, iResolveOpacity, 321985076, false, $$g(b10, b11, b11), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i9] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 36505);
                    int iNormalizeMetaState = 3376 - KeyEvent.normalizeMetaState(0);
                    int scrollBarFadeDuration = 17 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    byte b12 = $$c[3];
                    byte b13 = (byte) (b12 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maximumDrawingCacheSize, iNormalizeMetaState, scrollBarFadeDuration, -968507904, false, $$g(b12, b13, b13), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
            }
            i3 = 2;
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i10 = $11 + 67;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                    char c3 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 36505);
                    int maximumFlingVelocity = 3376 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int i11 = 18 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    byte b14 = $$c[3];
                    byte b15 = (byte) (b14 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c3, maximumFlingVelocity, i11, -968507904, false, $$g(b14, b15, b15), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
                obj.hashCode();
                throw null;
            }
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr9 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char cLastIndexOf2 = (char) (36504 - TextUtils.lastIndexOf("", '0'));
                int bitsPerPixel = 3375 - ImageFormat.getBitsPerPixel(0);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 17;
                byte b16 = $$c[3];
                byte b17 = (byte) (b16 - 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cLastIndexOf2, bitsPerPixel, iMakeMeasureSpec, -968507904, false, $$g(b16, b17, b17), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr9);
        }
        objArr[0] = new String(cArr);
    }

    public static final class Builder {
        private final List<String> namesAndValues = new ArrayList(20);

        final Builder addLenient(String str) {
            int iIndexOf = str.indexOf(":", 1);
            if (iIndexOf != -1) {
                return addLenient(str.substring(0, iIndexOf), str.substring(iIndexOf + 1));
            }
            if (str.startsWith(":")) {
                return addLenient("", str.substring(1));
            }
            return addLenient("", str);
        }

        public final Builder add(String str) {
            int iIndexOf = str.indexOf(":");
            if (iIndexOf == -1) {
                throw new IllegalArgumentException("Unexpected header: ".concat(String.valueOf(str)));
            }
            return add(str.substring(0, iIndexOf).trim(), str.substring(iIndexOf + 1));
        }

        public final Builder add(String str, String str2) {
            checkNameAndValue(str, str2);
            return addLenient(str, str2);
        }

        final Builder addLenient(String str, String str2) {
            this.namesAndValues.add(str);
            this.namesAndValues.add(str2.trim());
            return this;
        }

        public final Builder removeAll(String str) {
            int i = 0;
            while (i < this.namesAndValues.size()) {
                if (str.equalsIgnoreCase(this.namesAndValues.get(i))) {
                    this.namesAndValues.remove(i);
                    this.namesAndValues.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public final Builder set(String str, String str2) {
            checkNameAndValue(str, str2);
            removeAll(str);
            addLenient(str, str2);
            return this;
        }

        private void checkNameAndValue(String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("name == null");
            }
            if (str.isEmpty()) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt <= 31 || cCharAt >= 127) {
                    throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str));
                }
            }
            if (str2 == null) {
                throw new IllegalArgumentException("value == null");
            }
            int length2 = str2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                char cCharAt2 = str2.charAt(i2);
                if (cCharAt2 <= 31 || cCharAt2 >= 127) {
                    throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header value: %s", Integer.valueOf(cCharAt2), Integer.valueOf(i2), str2));
                }
            }
        }

        public final String get(String str) {
            for (int size = this.namesAndValues.size() - 2; size >= 0; size -= 2) {
                if (str.equalsIgnoreCase(this.namesAndValues.get(size))) {
                    return this.namesAndValues.get(size + 1);
                }
            }
            return null;
        }

        public final Headers build() {
            return new Headers(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x020a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0214  */
    public final Set<String> names() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cResolveSizeAndState = (char) (37567 - View.resolveSizeAndState(0, 0, 0));
            int jumpTapTimeout = 625 - (ViewConfiguration.getJumpTapTimeout() >> 16);
            int edgeSlop = 14 - (ViewConfiguration.getEdgeSlop() >> 16);
            byte b2 = $$a[5];
            byte b3 = (byte) (-b2);
            Object[] objArr2 = new Object[1];
            a(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSizeAndState, jumpTapTimeout, edgeSlop, -477065106, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 21 - TextUtils.lastIndexOf("", '0', 0, 0), (char) Color.alpha(0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(22 - Color.argb(0, 0, 0, 0), Color.argb(0, 0, 0, 0) + 15, (char) (35012 - View.resolveSize(0, 0)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char capsMode = (char) (37567 - TextUtils.getCapsMode("", 0, 0));
            int i3 = 625 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int i4 = 14 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            byte[] bArr = $$a;
            byte b4 = bArr[5];
            byte b5 = bArr[7];
            Object[] objArr5 = new Object[1];
            a(b4, b5, b5, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(capsMode, i3, i4, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cAxisFromString = (char) (37566 - MotionEvent.axisFromString(""));
                int iResolveSize = 625 - View.resolveSize(0, 0);
                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 14;
                byte[] bArr2 = $$a;
                byte b6 = bArr2[1];
                byte b7 = bArr2[7];
                Object[] objArr6 = new Object[1];
                a(b6, b7, b7, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cAxisFromString, iResolveSize, iResolveOpacity, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i5 = ((int[]) objArr7[2])[0];
            int i6 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i5};
            int iMyPid = Process.myPid();
            int i7 = (((~((-1266355333) | iMyPid)) | 1782837248) * 398) + 475157456 + (((~((~iMyPid) | (-1266355333))) | 1782837248) * 398) + 1659104239;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
            objArr = new Object[]{new int[]{i6}, new int[1], iArr, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            c(37 - (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 26, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c((ViewConfiguration.getTouchSlop() >> 8) + 63, 18 - View.resolveSizeAndState(0, 0, 0), (char) Color.green(0), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 77;
                TuitionPaymentFragmentbindingInflater1 = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 52 / 0;
                    if (applicationContext instanceof ContextWrapper) {
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = null;
                        }
                    }
                } else if (applicationContext instanceof ContextWrapper) {
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = null;
                    }
                }
                applicationContext = applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(82 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 17 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (View.resolveSize(0, 0) + 54880), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 96, 15 - MotionEvent.axisFromString(""), (char) (27643 - TextUtils.lastIndexOf("", '0', 0, 0)), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            c(ExpandableListView.getPackedPositionGroup(0L) + 113, 64 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (TextUtils.indexOf("", "") + 45100), objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            c(176 - TextUtils.lastIndexOf("", '0', 0, 0), 64 - Color.red(0), (char) (TextUtils.getOffsetBefore("", 0) + 52412), objArr13);
            try {
                Object[] objArr14 = {applicationContext, new String[]{str, (String) objArr13[0]}, Integer.valueOf(iIntValue), 17, 1659104239};
                byte[] bArr3 = $$d;
                byte b8 = bArr3[48];
                byte b9 = b8;
                Object[] objArr15 = new Object[1];
                d(b8, b9, b9, objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                byte b10 = bArr3[9];
                byte b11 = b10;
                Object[] objArr16 = new Object[1];
                d(b10, b11, b11, objArr16);
                objArr = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                int i12 = ((int[]) objArr[0])[0];
                int i13 = ((int[]) objArr[2])[0];
                if (applicationContext != null) {
                    int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 61;
                    TuitionPaymentFragmentbindingInflater1 = i14 % 128;
                    int i15 = i14 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cLastIndexOf = (char) (37566 - TextUtils.lastIndexOf("", '0', 0));
                        int i16 = 625 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 15;
                        byte[] bArr4 = $$a;
                        byte b12 = bArr4[1];
                        byte b13 = bArr4[7];
                        Object[] objArr17 = new Object[1];
                        a(b12, b13, b13, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf, i16, iIndexOf, -973632554, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr18 = new Object[1];
                        c(View.MeasureSpec.getSize(0), 21 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) Color.argb(0, 0, 0, 0), objArr18);
                        Class<?> cls5 = Class.forName((String) objArr18[0]);
                        Object[] objArr19 = new Object[1];
                        c(ExpandableListView.getPackedPositionChild(0L) + 23, 15 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (35012 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), objArr19);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cResolveSize = (char) (View.resolveSize(0, 0) + 37567);
                            int iResolveSizeAndState = 625 - View.resolveSizeAndState(0, 0, 0);
                            int trimmedLength = 14 - TextUtils.getTrimmedLength("");
                            byte[] bArr5 = $$a;
                            byte b14 = bArr5[5];
                            byte b15 = bArr5[7];
                            Object[] objArr20 = new Object[1];
                            a(b14, b15, b15, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveSize, iResolveSizeAndState, trimmedLength, -976899241, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char defaultSize = (char) (37567 - View.getDefaultSize(0, 0));
                            int i17 = 626 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 14;
                            byte b16 = $$a[5];
                            byte b17 = (byte) (-b16);
                            Object[] objArr21 = new Object[1];
                            a(b16, b17, b17, objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(defaultSize, i17, jumpTapTimeout2, -477065106, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (((int[]) objArr[2])[0] != ((int[]) objArr[0])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 == null) {
                throw null;
            }
            while (i2 < strArr2.length) {
                int i18 = TuitionPaymentFragmentbindingInflater1 + 67;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i18 % 128;
                if (i18 % 2 != 0) {
                    arrayList.add(strArr2[i2]);
                    i2 += 59;
                } else {
                    arrayList.add(strArr2[i2]);
                    i2++;
                }
            }
            throw null;
        }
        int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
        TuitionPaymentFragmentbindingInflater1 = i19 % 128;
        int i20 = i19 % 2;
        int i21 = ((int[]) objArr[1])[0];
        int i22 = ((int[]) objArr[2])[0];
        int i23 = ((int[]) objArr[0])[0];
        String[] strArr3 = (String[]) objArr[3];
        int[] iArr2 = {i22};
        int iIdentityHashCode = System.identityHashCode(this);
        int i24 = ~iIdentityHashCode;
        int i25 = i21 + 782769024 + (((~((-1603928528) | i24)) | (-219809594) | (~(1603928527 | iIdentityHashCode))) * (-564)) + ((~(iIdentityHashCode | (-1585))) * 1128) + (((~((-219809594) | i24)) | (-1603930112)) * 564);
        int i26 = (i25 << 13) ^ i25;
        int i27 = i26 ^ (i26 >>> 17);
        ((int[]) objArr[1])[0] = i27 ^ (i27 << 5);
        Object[] objArr22 = {new int[]{i23}, new int[1], iArr2, strArr3};
        int i28 = TuitionPaymentFragmentbindingInflater1 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i28 % 128;
        int i29 = i28 % 2;
        int size = size();
        int i30 = ((int[]) objArr22[1])[0];
        int i31 = i30 * i30;
        int i32 = -(1062760676 * i30);
        int i33 = ((i31 | i32) << 1) - (i31 ^ i32);
        int i34 = -(i30 * 1967118756);
        int i35 = ((i33 ^ i34) + ((i34 & i33) << 1)) - 171132400;
        int i36 = ((i35 >> 22) - 2047) / 1024;
        int i37 = ((i36 | 1) << 1) - (i36 ^ 1);
        int i38 = (i35 ^ i37) + ((i37 & i35) << 1);
        int i39 = i35 >> 20;
        int i40 = ((i39 ^ (-8191)) + ((i39 & (-8191)) << 1)) / 4096;
        int i41 = -(i38 ^ ((i40 & 1) + (i40 | 1)));
        int i42 = (i41 & 4) + (i41 | 4);
        int i43 = i42 >> 21;
        int i44 = ((i43 & (-4095)) + (i43 | (-4095))) / 2048;
        for (int i45 = 0 / (((-(((i44 ^ 1) + ((i44 & 1) << 1)) + 1)) & i42) * 1628); i45 < size; i45++) {
            treeSet.add(name(i45));
        }
        return Collections.unmodifiableSet(treeSet);
    }

    public final List<String> values(String str) {
        int i = 2 % 2;
        int size = size();
        int i2 = TuitionPaymentFragmentbindingInflater1 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 5 % 5;
        }
        Object obj = null;
        ArrayList arrayList = null;
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 75;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            if (i5 % 2 == 0) {
                str.equalsIgnoreCase(name(i4));
                obj.hashCode();
                throw null;
            }
            if (!(!str.equalsIgnoreCase(name(i4)))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i4));
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        List<String> listEmptyList = Collections.emptyList();
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 82 / 0;
        }
        return listEmptyList;
    }

    public final Builder newBuilder() {
        int i = 2 % 2;
        Builder builder = new Builder();
        Collections.addAll(builder.namesAndValues, this.namesAndValues);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 65;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        return builder;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        int size = size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            int i4 = i3 % 2;
            sb.append(name(i2));
            sb.append(": ");
            sb.append(value(i2));
            sb.append("\n");
            i2++;
            int i5 = TuitionPaymentFragmentbindingInflater1 + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            int i6 = i5 % 2;
        }
        return sb.toString();
    }

    public final Map<String, List<String>> toMultimap() {
        int i = 2 % 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = size();
        int i2 = 0;
        while (true) {
            Object obj = null;
            if (i2 >= size) {
                int i3 = TuitionPaymentFragmentbindingInflater1 + 37;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                if (i3 % 2 == 0) {
                    return linkedHashMap;
                }
                obj.hashCode();
                throw null;
            }
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            String strName = name(i2);
            List arrayList = (List) linkedHashMap.get(strName);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                linkedHashMap.put(strName, arrayList);
                int i5 = TuitionPaymentFragmentbindingInflater1 + 33;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
                int i6 = i5 % 2;
            }
            arrayList.add(value(i2));
            i2++;
        }
    }

    private static String get(String[] strArr, String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            int i4 = TuitionPaymentFragmentbindingInflater1 + 51;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            if (str.equalsIgnoreCase(strArr[length])) {
                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
                TuitionPaymentFragmentbindingInflater1 = i6 % 128;
                int i7 = length + 1;
                return i6 % 2 == 0 ? strArr[i7] : strArr[i7];
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Code duplicated, block: B:28:0x006c A[LOOP:1: B:15:0x003c->B:28:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x006f A[SYNTHETIC] */
    public static Headers of(String... strArr) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        if (strArr == null || strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        for (int i4 = 0; i4 < strArr2.length; i4++) {
            String str = strArr2[i4];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i4] = str.trim();
        }
        int i5 = TuitionPaymentFragmentbindingInflater1 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        for (int i7 = 0; i7 < strArr2.length; i7 += 2) {
            String str2 = strArr2[i7];
            String str3 = strArr2[i7 + 1];
            if (str2.length() != 0) {
                int i8 = TuitionPaymentFragmentbindingInflater1 + 3;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
                if (i8 % 2 != 0) {
                    if (str2.indexOf(1) == -1) {
                        if (str3.indexOf(0) == -1) {
                        }
                    }
                } else if (str2.indexOf(0) == -1) {
                    if (str3.indexOf(0) == -1) {
                    }
                }
            }
            StringBuilder sb = new StringBuilder("Unexpected header: ");
            sb.append(str2);
            sb.append(": ");
            sb.append(str3);
            throw new IllegalArgumentException(sb.toString());
        }
        return new Headers(strArr2);
    }

    public static Headers of(Map<String, String> map) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        if (map == null) {
            throw new IllegalArgumentException("Expected map with header names and values");
        }
        String[] strArr = new String[map.size() * 2];
        int i4 = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
            if (entry.getKey() != null) {
                int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 119;
                TuitionPaymentFragmentbindingInflater1 = i7 % 128;
                int i8 = i7 % 2;
                if (entry.getValue() != null) {
                    String strTrim = entry.getKey().trim();
                    String strTrim2 = entry.getValue().trim();
                    if (strTrim.length() == 0 || strTrim.indexOf(0) != -1 || strTrim2.indexOf(0) != -1) {
                        StringBuilder sb = new StringBuilder("Unexpected header: ");
                        sb.append(strTrim);
                        sb.append(": ");
                        sb.append(strTrim2);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 47;
                    TuitionPaymentFragmentbindingInflater1 = i9 % 128;
                    int i10 = i9 % 2;
                    strArr[i4] = strTrim;
                    strArr[i4 + 1] = strTrim2;
                    i4 += 2;
                }
            }
            throw new IllegalArgumentException("Headers cannot be null");
        }
        return new Headers(strArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r7, byte r8, int r9) {
        /*
            int r8 = r8 * 2
            int r8 = 4 - r8
            int r7 = r7 * 3
            int r7 = r7 + 109
            int r9 = r9 * 2
            int r9 = r9 + 1
            byte[] r0 = com.squareup.okhttp.Headers.$$c
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r8 = r9
            r4 = r2
            goto L2b
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = -r7
            int r7 = r7 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.Headers.$$g(int, byte, int):java.lang.String");
    }
}

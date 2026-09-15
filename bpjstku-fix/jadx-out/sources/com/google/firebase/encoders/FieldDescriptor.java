package com.google.firebase.encoders;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.ItemTouchHelper;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class FieldDescriptor {
    private final String name;
    private final Map<Class<?>, Object> properties;
    private static final byte[] $$c = {51, -5, 77, 89};
    private static final int $$f = 119;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {70, -114, 113, 8, 11, -1, 19, -18, 25, 32, -27, 29, 24, 6, 16, 7, -5, 12, -21, 40, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$e = 221;
    private static final byte[] $$a = {49, 89, 41, 48, 23, -37, 42, 11, -10, 18, -7, 0, 7, 7, 23, -44, 44, 10, -5, 6, 18};
    private static final int $$b = ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int asInterface = 1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 45353;
    private static char TuitionPaymentFragmentbindingInflater1 = 50505;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 43522;
    private static char b = 47033;

    private static void a(short s, short s2, short s3, Object[] objArr) {
        int i = 100 - (s * 3);
        int i2 = 13 - (s3 * 10);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[11 - s2];
        int i3 = 10 - s2;
        int i4 = -1;
        if (bArr == null) {
            i = (i + i3) - 5;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i;
            i2++;
            if (i4 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i = (i + bArr[i2]) - 5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.google.firebase.encoders.FieldDescriptor.$$d
            int r7 = r7 * 27
            int r7 = 111 - r7
            int r9 = r9 * 16
            int r9 = r9 + 4
            int r8 = r8 * 21
            int r8 = 38 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r9
            r4 = r2
            goto L2c
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2c:
            int r9 = r9 + r7
            int r7 = r9 + (-10)
            int r9 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.encoders.FieldDescriptor.d(short, int, int, java.lang.Object[]):void");
    }

    private FieldDescriptor(String str, Map<Class<?>, Object> map) {
        this.name = str;
        this.properties = map;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 49;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        String str = this.name;
        int i5 = i3 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final <T extends Annotation> T getProperty(Class<T> cls) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 9;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        T t = (T) this.properties.get(cls);
        if (i3 == 0) {
            int i4 = 42 / 0;
        }
        return t;
    }

    public static FieldDescriptor of(String str) {
        int i = 2 % 2;
        FieldDescriptor fieldDescriptor = new FieldDescriptor(str, Collections.emptyMap());
        int i2 = asInterface + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 == 0) {
            return fieldDescriptor;
        }
        throw null;
    }

    public static Builder builder(String str) {
        int i = 2 % 2;
        Builder builder = new Builder(str);
        int i2 = asInterface + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        return builder;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 61;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof FieldDescriptor) {
            FieldDescriptor fieldDescriptor = (FieldDescriptor) obj;
            if (this.name.equals(fieldDescriptor.name)) {
                int i4 = asInterface + 61;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
                int i5 = i4 % 2;
                if (this.properties.equals(fieldDescriptor.properties)) {
                    return true;
                }
            }
            return false;
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 75;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public static final class Builder {
        private final String name;
        private Map<Class<?>, Object> properties = null;

        Builder(String str) {
            this.name = str;
        }

        public final <T extends Annotation> Builder withProperty(T t) {
            if (this.properties == null) {
                this.properties = new HashMap();
            }
            this.properties.put(t.annotationType(), t);
            return this;
        }

        public final FieldDescriptor build() {
            Map mapUnmodifiableMap;
            String str = this.name;
            if (this.properties == null) {
                mapUnmodifiableMap = Collections.emptyMap();
            } else {
                mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(this.properties));
            }
            return new FieldDescriptor(str, mapUnmodifiableMap);
        }
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i3 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i4 = 58224;
            int i5 = 0;
            while (i5 < 16) {
                int i6 = $10 + 7;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i4) ^ ((c2 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 8611973335120459638L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(b);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cNormalizeMetaState = (char) (47773 - KeyEvent.normalizeMetaState(i3));
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 468;
                        int i10 = 14 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cNormalizeMetaState, keyRepeatDelay, i10, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    int i11 = i5;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.getDefaultSize(0, 0) + 47773), ExpandableListView.getPackedPositionType(0L) + 468, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5 = i11 + 1;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                byte b2 = (byte) 0;
                byte b3 = (byte) (b2 - 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ExpandableListView.getPackedPositionType(0L), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2323, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 43, -1312321721, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            int i12 = $11 + 109;
            $10 = i12 % 128;
            int i13 = i12 % 2;
        }
    }

    public final int hashCode() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int iHashCode = this.name.hashCode();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
            int iBlue = Color.blue(0) + 876;
            int minimumFlingVelocity = 10 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            byte b2 = $$a[11];
            byte b3 = (byte) (b2 + 1);
            byte b4 = b2;
            Object[] objArr2 = new Object[1];
            a(b3, b4, (byte) (b4 + 1), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, iBlue, minimumFlingVelocity, -1199417970, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{48336, 50734, 46095, 16036, 49649, 53631, 54201, 54143, 62970, 5122, 21626, 22822, 15212, 59442, 16021, 28953, 9037, 35581, 538, 53335, 38983, 51779, 16581, 52987}, 23 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{2660, 37408, 54268, 61115, 23321, 41432, 17753, 48468, 23355, 1390, 34477, 4029, 48457, 6168, 59737, 16813, 23975, 28048}, 14 - TextUtils.lastIndexOf("", '0', 0, 0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int iResolveSize = 876 - View.resolveSize(0, 0);
            int maximumFlingVelocity = 10 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            byte[] bArr = $$a;
            byte b5 = bArr[11];
            Object[] objArr5 = new Object[1];
            a(b5, bArr[17], b5, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iResolveSize, maximumFlingVelocity, 254769921, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char trimmedLength = (char) TextUtils.getTrimmedLength("");
                int i2 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 876;
                int iRgb = Color.rgb(0, 0, 0) + 16777226;
                byte b6 = $$a[11];
                byte b7 = (byte) (b6 + 1);
                Object[] objArr6 = new Object[1];
                a(b7, (byte) (b7 + 2), b6, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(trimmedLength, i2, iRgb, 1324201839, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iMyTid = Process.myTid();
            int i3 = ~iMyTid;
            int i4 = (((657266356 + (((~((-104925778) | i3)) | 145236006) * 220)) + (((~(i3 | (-928092122))) | 968402350) * (-440))) + ((iMyTid | (-104925778)) * 220)) - 1974894388;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{31955, 63647, 49578, 51801, 22466, 52132, 20897, 6499, 48370, 22723, 5079, 657, 65482, 45361, 56474, 49710, 21385, 2189}, 16 - Color.alpha(0), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{64004, 33366, 27508, 17947, 43403, 36146, 53326, 12010, 54118, 62812, 30026, 49675, 54576, 32454, 29376, 44860, 46743, 53946}, MotionEvent.axisFromString("") + 17, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            int i7 = asInterface + 117;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
            int i8 = i7 % 2;
            try {
                Object[] objArr10 = {Integer.valueOf(iIntValue), -1974894388};
                byte[] bArr2 = $$d;
                byte b8 = bArr2[44];
                Object[] objArr11 = new Object[1];
                d(b8, (byte) (-bArr2[5]), b8, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b9 = bArr2[5];
                Object[] objArr12 = new Object[1];
                d((byte) (-b9), bArr2[44], (byte) (-b9), objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int iBlue2 = 876 - Color.blue(0);
                    int i9 = 10 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte b10 = $$a[11];
                    byte b11 = (byte) (b10 + 1);
                    Object[] objArr13 = new Object[1];
                    a(b11, (byte) (b11 + 2), b10, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollBarFadeDuration, iBlue2, i9, 1324201839, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    c(new char[]{48336, 50734, 46095, 16036, 49649, 53631, 54201, 54143, 62970, 5122, 21626, 22822, 15212, 59442, 16021, 28953, 9037, 35581, 538, 53335, 38983, 51779, 16581, 52987}, 22 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    c(new char[]{2660, 37408, 54268, 61115, 23321, 41432, 17753, 48468, 23355, 1390, 34477, 4029, 48457, 6168, 59737, 16813, 23975, 28048}, 15 - (ViewConfiguration.getTapTimeout() >> 16), objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cMyPid = (char) (Process.myPid() >> 22);
                        int i10 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 875;
                        int iMyPid = 10 - (Process.myPid() >> 22);
                        byte[] bArr3 = $$a;
                        byte b12 = bArr3[11];
                        Object[] objArr16 = new Object[1];
                        a(b12, bArr3[17], b12, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMyPid, i10, iMyPid, 254769921, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cLastIndexOf2 = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 876;
                        int gidForName = Process.getGidForName("") + 11;
                        byte b13 = $$a[11];
                        byte b14 = (byte) (b13 + 1);
                        byte b15 = b13;
                        Object[] objArr17 = new Object[1];
                        a(b14, b15, (byte) (b15 + 1), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cLastIndexOf2, packedPositionGroup, gidForName, -1199417970, false, (String) objArr17[0], null);
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
        int i11 = ((int[]) objArr[2])[0];
        int i12 = ((int[]) objArr[0])[0];
        if (i12 != i11) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i12));
        }
        int i13 = asInterface + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i13 % 128;
        int i14 = i13 % 2;
        int i15 = ((int[]) objArr[1])[0];
        Object[] objArr18 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int i16 = ~System.identityHashCode(this);
        int i17 = i15 + 1465735324 + ((~((-33630865) | i16)) * 52) + (((~(502022253 | i16)) | (~(461712024 | i16)) | (-535653118)) * (-52)) + (((~(i16 | (-502022254))) | 428081160) * 52);
        int i18 = (i17 << 13) ^ i17;
        int i19 = i18 ^ (i18 >>> 17);
        Object obj = objArr18[1];
        ((int[]) obj)[0] = i19 ^ (i19 << 5);
        int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 37;
        asInterface = i20 % 128;
        int i21 = i20 % 2;
        int i22 = ((int[]) obj)[0];
        int i23 = i22 * i22;
        int i24 = -(109446491 * i22);
        int i25 = (((i23 ^ i24) + ((i23 & i24) << 1)) - (~(-(i22 * 935063683)))) - 1;
        int i26 = (i25 ^ (-1816679647)) + (((-1816679647) & i25) << 1);
        int i27 = i26 >> 19;
        int i28 = ((i27 & (-16383)) + (i27 | (-16383))) / 8192;
        int i29 = ((i28 | 1) << 1) - (i28 ^ 1);
        int i30 = (i26 ^ i29) + ((i29 & i26) << 1);
        int i31 = i26 >> 27;
        int i32 = -(i30 ^ (((((i31 | (-63)) << 1) - (i31 ^ (-63))) / 32) + 1));
        int i33 = (i32 ^ 9) + ((i32 & 9) << 1);
        int i34 = (((i33 >> 19) - 16383) / 8192) + 1;
        return (iHashCode * (547677 / (((-((i34 ^ 1) + ((i34 & 1) << 1))) & i33) * 1963))) + this.properties.hashCode();
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("FieldDescriptor{name=");
        sb.append(this.name);
        sb.append(", properties=");
        sb.append(this.properties.values());
        sb.append("}");
        String string = sb.toString();
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 9;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, byte r7, int r8) {
        /*
            int r7 = r7 + 4
            byte[] r0 = com.google.firebase.encoders.FieldDescriptor.$$c
            int r8 = r8 * 4
            int r1 = r8 + 1
            int r6 = r6 * 4
            int r6 = r6 + 108
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2a:
            int r7 = -r7
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.encoders.FieldDescriptor.$$g(short, byte, int):java.lang.String");
    }
}

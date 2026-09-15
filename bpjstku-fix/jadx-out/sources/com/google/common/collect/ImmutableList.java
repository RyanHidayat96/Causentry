package com.google.common.collect;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.CameraStateRegistryOnOpenAvailableListener;
import defpackage.CameraThreadConfig;
import defpackage.addAllCameraCaptureCallbacks;
import defpackage.hasConflict;
import defpackage.initSession;
import defpackage.mergeOptionValue;
import defpackage.onCaptureSessionEnd;
import defpackage.tryOpenCamera;
import defpackage.updateAndVerifyState;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ImmutableList<E> extends ImmutableCollection<E> implements List<E>, RandomAccess {
    private static final hasConflict<Object> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1(RegularImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault2, 0);
    private static final long serialVersionUID = -889275714;

    @Override // com.google.common.collect.ImmutableCollection
    @Deprecated
    public final ImmutableList<E> TuitionPaymentFragmentbindingInflater1() {
        return this;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public static <E> Collector<E, ?, ImmutableList<E>> asBinder() {
        return CameraStateRegistryOnOpenAvailableListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    public static <E> ImmutableList<E> asInterface() {
        return (ImmutableList<E>) RegularImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public static <E> ImmutableList<E> TuitionPaymentFragmentspecialinlinedviewModeldefault3(E e2) {
        return b(e2);
    }

    public static <E> ImmutableList<E> TuitionPaymentFragmentbindingInflater1(E e2, E e3) {
        return b(e2, e3);
    }

    public static <E> ImmutableList<E> TuitionPaymentFragmentspecialinlinedviewModeldefault1(E e2, E e3, E e4) {
        return b(e2, e3, e4);
    }

    class SubList extends ImmutableList<E> {
        private transient int TuitionPaymentFragmentbindingInflater1;
        private transient int b;
        private static final byte[] $$c = {109, 7, 114, -90};
        private static final int $$f = 44;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {8, -36, 87, -65, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 54, 3, 3, -72, 48, 17, -4, -15, -61, 48, 12, -10, -62, 66, -13, -5, 4, -8, 2, -67, 56, 2, 3, -18, 10, -7, -16, 8, -65, 73, -27, 17};
        private static final int $$e = 239;
        private static final byte[] $$a = {80, -8, 43, 65, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
        private static final int $$b = 83;
        private static int asInterface = 0;
        private static int d = 1;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 722;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 44141;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 62401;
        private static char g = 29426;

        /* JADX WARN: Code duplicated, block: B:10:0x0028  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(int r5, int r6, byte r7, java.lang.Object[] r8) {
            /*
                int r5 = r5 * 52
                int r5 = 107 - r5
                int r6 = r6 * 2
                int r6 = 84 - r6
                int r7 = r7 * 15
                int r0 = r7 + 38
                byte[] r1 = com.google.common.collect.ImmutableList.SubList.$$a
                byte[] r0 = new byte[r0]
                int r7 = r7 + 37
                r2 = 0
                if (r1 != 0) goto L18
                r3 = r7
                r4 = r2
                goto L2c
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r6
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r7) goto L28
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L28:
                int r5 = r5 + 1
                r3 = r1[r5]
            L2c:
                int r6 = r6 + r3
                int r6 = r6 + (-11)
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableList.SubList.c(int, int, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0031). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void f(int r6, short r7, int r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 50
                int r0 = 51 - r8
                byte[] r1 = com.google.common.collect.ImmutableList.SubList.$$d
                int r6 = r6 * 50
                int r6 = 53 - r6
                int r7 = r7 + 98
                byte[] r0 = new byte[r0]
                int r8 = 50 - r8
                r2 = 0
                if (r1 != 0) goto L16
                r3 = r6
                r4 = r2
                goto L31
            L16:
                r3 = r2
                r5 = r7
                r7 = r6
                r6 = r5
            L1a:
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r8) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L27:
                int r7 = r7 + 1
                int r3 = r3 + 1
                r4 = r1[r7]
                r5 = r3
                r3 = r7
                r7 = r4
                r4 = r5
            L31:
                int r6 = r6 + r7
                int r6 = r6 + 3
                r7 = r3
                r3 = r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableList.SubList.f(int, short, int, java.lang.Object[]):void");
        }

        private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
            char[] cArr2 = new char[cArr.length - 2];
            oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
            char[] cArr3 = new char[2];
            while (true) {
                char c = 0;
                if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                    break;
                }
                int i3 = $11 + 3;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                char c2 = 1;
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                int i5 = 58224;
                int i6 = 0;
                while (i6 < 16) {
                    int i7 = $11 + 55;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    char c3 = cArr3[c2];
                    char c4 = cArr3[c];
                    int i9 = (c4 + i5) ^ ((c4 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)));
                    int i10 = c4 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(g);
                        objArr2[2] = Integer.valueOf(i10);
                        objArr2[c2] = Integer.valueOf(i9);
                        objArr2[0] = Integer.valueOf(c3);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char bitsPerPixel = (char) (47772 - ImageFormat.getBitsPerPixel(0));
                            int trimmedLength = 468 - TextUtils.getTrimmedLength("");
                            int packedPositionGroup = 13 - ExpandableListView.getPackedPositionGroup(0L);
                            Class[] clsArr = new Class[4];
                            clsArr[0] = Integer.TYPE;
                            clsArr[c2] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(bitsPerPixel, trimmedLength, packedPositionGroup, -2007001706, false, "o", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        cArr3[c2] = cCharValue;
                        int i11 = i6;
                        Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), ExpandableListView.getPackedPositionChild(0L) + 469, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 13, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        i5 -= 40503;
                        i6 = i11 + 1;
                        int i12 = $10 + 53;
                        $11 = i12 % 128;
                        int i13 = i12 % 2;
                        c = 0;
                        c2 = 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
                cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] ^ cArr3[1]);
                Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 2323 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 43, -1312321721, false, $$g(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                int i14 = $10 + 105;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    int i15 = 5 / 5;
                }
            }
            objArr[0] = new String(cArr2, 0, i);
            int i16 = $11 + 121;
            $10 = i16 % 128;
            if (i16 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public /* synthetic */ Iterator iterator() {
            int i = 2 % 2;
            int i2 = asInterface + 103;
            d = i2 % 128;
            int i3 = i2 % 2;
            mergeOptionValue<E> mergeoptionvalueD = super.iterator();
            int i4 = asInterface + 37;
            d = i4 % 128;
            int i5 = i4 % 2;
            return mergeoptionvalueD;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* synthetic */ ListIterator listIterator() {
            int i = 2 % 2;
            int i2 = d + 15;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            hasConflict<E> hasconflictListIterator = super.listIterator();
            if (i3 != 0) {
                int i4 = 96 / 0;
            }
            return hasconflictListIterator;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* synthetic */ ListIterator listIterator(int i) {
            int i2 = 2 % 2;
            int i3 = d + 125;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            hasConflict<E> hasconflictTuitionPaymentFragmentspecialinlinedviewModeldefault3 = super.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i);
            int i5 = asInterface + 79;
            d = i5 % 128;
            int i6 = i5 % 2;
            return hasconflictTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* synthetic */ List subList(int i, int i2) throws Throwable {
            Object[] objArr;
            int i3 = 2 % 2;
            int i4 = asInterface + 55;
            d = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char c = (char) (43043 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                int i6 = 3111 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int i7 = 22 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                byte[] bArr = $$a;
                Object[] objArr2 = new Object[1];
                c(bArr[37], bArr[7], bArr[132], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i6, i7, -1272852037, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            e(new char[]{14256, 50248, 52841, 26813, 58061, 10039, 5942, 63780, 62196, 62868, 12080, 45178, 22906, 43347, 39507, 1860, 37243, 23434, 4910, 31757, 18165, 61830, 19158, 15787}, MotionEvent.axisFromString("") + 23, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            e(new char[]{33522, 31212, 40868, 62102, 43204, 24889, 24390, 30447, 33889, 834, 35863, 30201, 54867, 47196, 57412, 30445, 34797, 44459}, (Process.myTid() >> 22) + 15, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c2 = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 43042);
                int iMyTid = (Process.myTid() >> 22) + 3111;
                int iRgb = (-16777194) - Color.rgb(0, 0, 0);
                byte[] bArr2 = $$a;
                byte b = bArr2[132];
                Object[] objArr5 = new Object[1];
                c(b, bArr2[7], b, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, iMyTid, iRgb, -1269618118, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char size = (char) (View.MeasureSpec.getSize(0) + 43042);
                    int capsMode = TextUtils.getCapsMode("", 0, 0) + 3111;
                    int maxKeyCode = 22 - (KeyEvent.getMaxKeyCode() >> 16);
                    byte b2 = $$a[7];
                    byte b3 = b2;
                    Object[] objArr6 = new Object[1];
                    c(b2, b3, b3, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(size, capsMode, maxKeyCode, 154975793, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                int i8 = ((int[]) objArr7[2])[0];
                int i9 = ((int[]) objArr7[1])[0];
                String[] strArr = (String[]) objArr7[3];
                int iIdentityHashCode = System.identityHashCode(this);
                int i10 = ~iIdentityHashCode;
                int i11 = (-796366990) + (((~((-686571588) | i10)) | (-1018459872) | (~(686571587 | iIdentityHashCode))) * (-564)) + ((~(iIdentityHashCode | (-336606877))) * 1128) + (((~((-1018459872) | i10)) | (-1023178464)) * 564) + 147311838;
                int i12 = (i11 << 13) ^ i11;
                int i13 = i12 ^ (i12 >>> 17);
                ((int[]) objArr[0])[0] = i13 ^ (i13 << 5);
                objArr = new Object[]{new int[1], new int[]{i9}, new int[]{i8}, strArr};
            } else {
                int i14 = d + 79;
                asInterface = i14 % 128;
                int i15 = i14 % 2;
                try {
                    Object[] objArr8 = {null, Integer.valueOf(i), 0, 147311838};
                    byte b4 = (byte) ($$e & 1);
                    byte b5 = b4;
                    Object[] objArr9 = new Object[1];
                    f(b4, b5, (byte) (b5 - 1), objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    Object[] objArr10 = new Object[1];
                    f(b6, b7, (byte) (b7 + 1), objArr10);
                    objArr = (Object[]) cls2.getMethod((String) objArr10[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr8);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cLastIndexOf = (char) (43041 - TextUtils.lastIndexOf("", '0'));
                        int mirror = AndroidCharacter.getMirror('0') + 3063;
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 22;
                        byte b8 = $$a[7];
                        byte b9 = b8;
                        Object[] objArr11 = new Object[1];
                        c(b8, b9, b9, objArr11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf, mirror, jumpTapTimeout, 154975793, false, (String) objArr11[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr12 = new Object[1];
                        e(new char[]{14256, 50248, 52841, 26813, 58061, 10039, 5942, 63780, 62196, 62868, 12080, 45178, 22906, 43347, 39507, 1860, 37243, 23434, 4910, 31757, 18165, 61830, 19158, 15787}, 22 - (ViewConfiguration.getEdgeSlop() >> 16), objArr12);
                        Class<?> cls3 = Class.forName((String) objArr12[0]);
                        Object[] objArr13 = new Object[1];
                        e(new char[]{33522, 31212, 40868, 62102, 43204, 24889, 24390, 30447, 33889, 834, 35863, 30201, 54867, 47196, 57412, 30445, 34797, 44459}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14, objArr13);
                        long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c3 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 43041);
                            int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 3111;
                            int iIndexOf2 = 22 - TextUtils.indexOf("", "", 0, 0);
                            byte[] bArr3 = $$a;
                            byte b10 = bArr3[132];
                            Object[] objArr14 = new Object[1];
                            c(b10, bArr3[7], b10, objArr14);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c3, iIndexOf, iIndexOf2, -1269618118, false, (String) objArr14[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char mirror2 = (char) (43090 - AndroidCharacter.getMirror('0'));
                            int iMyTid2 = 3111 - (Process.myTid() >> 22);
                            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 22;
                            byte[] bArr4 = $$a;
                            Object[] objArr15 = new Object[1];
                            c(bArr4[37], bArr4[7], bArr4[132], objArr15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mirror2, iMyTid2, iCombineMeasuredStates, -1272852037, false, (String) objArr15[0], null);
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
            int i16 = ((int[]) objArr[1])[0];
            int i17 = ((int[]) objArr[2])[0];
            if (i17 == i16) {
                int i18 = ((int[]) objArr[0])[0];
                int i19 = ((int[]) objArr[2])[0];
                int i20 = ((int[]) objArr[1])[0];
                String[] strArr2 = (String[]) objArr[3];
                int i21 = ~System.identityHashCode(this);
                int i22 = i18 + 1486918055 + ((~((-77463555) | i21)) * (-783)) + (((~(i21 | 822181368)) | (-882850091)) * 783);
                int i23 = (i22 << 13) ^ i22;
                int i24 = i23 ^ (i23 >>> 17);
                ((int[]) objArr[0])[0] = i24 ^ (i24 << 5);
                Object[] objArr16 = {new int[1], new int[]{i20}, new int[]{i19}, strArr2};
                int i25 = d + 109;
                asInterface = i25 % 128;
                int i26 = i25 % 2;
                return subList(i, i2);
            }
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            throw new RuntimeException(String.valueOf(i17));
        }

        SubList(int i, int i2) {
            this.b = i;
            this.TuitionPaymentFragmentbindingInflater1 = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            int i = 2 % 2;
            int i2 = asInterface + 39;
            d = i2 % 128;
            int i3 = i2 % 2;
            int i4 = this.TuitionPaymentFragmentbindingInflater1;
            if (i3 == 0) {
                int i5 = 39 / 0;
            }
            return i4;
        }

        @Override // com.google.common.collect.ImmutableCollection
        final Object[] b() {
            int i = 2 % 2;
            int i2 = d + 7;
            asInterface = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                ImmutableList.this.b();
                obj.hashCode();
                throw null;
            }
            Object[] objArrB = ImmutableList.this.b();
            int i3 = d + 117;
            asInterface = i3 % 128;
            if (i3 % 2 == 0) {
                return objArrB;
            }
            obj.hashCode();
            throw null;
        }

        @Override // com.google.common.collect.ImmutableCollection
        final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            int i = 2 % 2;
            int i2 = asInterface + 57;
            d = i2 % 128;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 2 == 0 ? ImmutableList.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3() << this.b : ImmutableList.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3() + this.b;
            int i3 = d + 43;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            return iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        @Override // com.google.common.collect.ImmutableCollection
        final int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            int i = 2 % 2;
            int i2 = asInterface + 125;
            d = i2 % 128;
            int i3 = i2 % 2;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ImmutableList.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3() + this.b + this.TuitionPaymentFragmentbindingInflater1;
            int i4 = d + 47;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            return iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        @Override // java.util.List
        public E get(int i) {
            int i2 = 2 % 2;
            int i3 = d;
            int i4 = i3 + 73;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            int i6 = this.TuitionPaymentFragmentbindingInflater1;
            if (i >= 0) {
                int i7 = i3 + 15;
                asInterface = i7 % 128;
                int i8 = i7 % 2;
                if (i < i6) {
                    E e2 = ImmutableList.this.get(i + this.b);
                    int i9 = asInterface + 1;
                    d = i9 % 128;
                    int i10 = i9 % 2;
                    return e2;
                }
            }
            throw new IndexOutOfBoundsException(updateAndVerifyState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i, i6, FirebaseAnalytics.Param.INDEX));
        }

        @Override // com.google.common.collect.ImmutableList
        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
        public final ImmutableList<E> subList(int i, int i2) {
            int i3 = 2 % 2;
            int i4 = this.TuitionPaymentFragmentbindingInflater1;
            if (i >= 0) {
                int i5 = asInterface;
                int i6 = i5 + 13;
                d = i6 % 128;
                if (i6 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (i2 >= i) {
                    int i7 = i5 + 35;
                    d = i7 % 128;
                    int i8 = i7 % 2;
                    if (i2 <= i4) {
                        ImmutableList immutableList = ImmutableList.this;
                        int i9 = this.b;
                        return immutableList.subList(i + i9, i2 + i9);
                    }
                }
            }
            throw new IndexOutOfBoundsException(updateAndVerifyState.TuitionPaymentFragmentbindingInflater1(i, i2, i4));
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        Object writeReplace() {
            int i = 2 % 2;
            int i2 = asInterface + 21;
            d = i2 % 128;
            int i3 = i2 % 2;
            Object objWriteReplace = super.writeReplace();
            if (i3 == 0) {
                int i4 = 36 / 0;
            }
            return objWriteReplace;
        }

        @Override // com.google.common.collect.ImmutableCollection
        final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            int i = 2 % 2;
            int i2 = d;
            int i3 = i2 + 31;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 27;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }

        private static String $$g(short s, short s2, byte b) {
            int i = (s2 * 3) + 108;
            byte[] bArr = $$c;
            int i2 = s * 2;
            int i3 = 4 - (b * 4);
            byte[] bArr2 = new byte[i2 + 1];
            int i4 = -1;
            if (bArr == null) {
                i3++;
                i = (-i) + i3;
                i4 = -1;
            }
            while (true) {
                int i5 = i4 + 1;
                bArr2[i5] = (byte) i;
                if (i5 == i2) {
                    return new String(bArr2, 0);
                }
                i3++;
                i = (-bArr[i3]) + i;
                i4 = i5;
            }
        }
    }

    public static <E> ImmutableList<E> TuitionPaymentFragmentspecialinlinedviewModeldefault1(E e2, E e3, E e4, E e5, E e6, E e7, E e8) {
        return b(e2, e3, e4, e5, e6, e7, e8);
    }

    @SafeVarargs
    public static <E> ImmutableList<E> TuitionPaymentFragmentspecialinlinedviewModeldefault3(E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11, E e12, E e13, E... eArr) {
        int length = eArr.length;
        int length2 = eArr.length;
        Object[] objArr = new Object[24];
        objArr[0] = e2;
        objArr[1] = e3;
        objArr[2] = e4;
        objArr[3] = e5;
        objArr[4] = e6;
        objArr[5] = e7;
        objArr[6] = e8;
        objArr[7] = e9;
        objArr[8] = e10;
        objArr[9] = e11;
        objArr[10] = e12;
        objArr[11] = e13;
        System.arraycopy(eArr, 0, objArr, 12, eArr.length);
        return b(objArr);
    }

    public static <E> ImmutableList<E> TuitionPaymentFragmentspecialinlinedviewModeldefault1(Collection<? extends E> collection) {
        if (collection instanceof ImmutableCollection) {
            ImmutableList<E> immutableListTuitionPaymentFragmentbindingInflater1 = ((ImmutableCollection) collection).TuitionPaymentFragmentbindingInflater1();
            if (!immutableListTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                return immutableListTuitionPaymentFragmentbindingInflater1;
            }
            Object[] array = immutableListTuitionPaymentFragmentbindingInflater1.toArray();
            int length = array.length;
            if (length != 0) {
                return new RegularImmutableList(array, length);
            }
            return (ImmutableList<E>) RegularImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        return b(collection.toArray());
    }

    public static <E> ImmutableList<E> TuitionPaymentFragmentspecialinlinedviewModeldefault3(E[] eArr) {
        if (eArr.length != 0) {
            return b((Object[]) eArr.clone());
        }
        return (ImmutableList<E>) RegularImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    static <E> ImmutableList<E> TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            return new RegularImmutableList(objArr, length);
        }
        return (ImmutableList<E>) RegularImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    ImmutableList() {
    }

    public final hasConflict<E> TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        int size = size();
        if (i >= 0 && i <= size) {
            if (isEmpty()) {
                return (hasConflict<E>) TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            }
            return new TuitionPaymentFragmentspecialinlinedviewModeldefault1(this, i);
        }
        throw new IndexOutOfBoundsException(updateAndVerifyState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, size, FirebaseAnalytics.Param.INDEX));
    }

    static class TuitionPaymentFragmentspecialinlinedviewModeldefault1<E> extends CameraThreadConfig<E> {
        private final ImmutableList<E> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(ImmutableList<E> immutableList, int i) {
            super(immutableList.size(), i);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = immutableList;
        }

        @Override // defpackage.CameraThreadConfig
        public final E b(int i) {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(i);
        }
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
    public ImmutableList<E> subList(int i, int i2) {
        int size = size();
        if (i >= 0 && i2 >= i && i2 <= size) {
            int i3 = i2 - i;
            if (i3 == size()) {
                return this;
            }
            if (i3 == 0) {
                return (ImmutableList<E>) RegularImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }
            return new SubList(i, i3);
        }
        throw new IndexOutOfBoundsException(updateAndVerifyState.TuitionPaymentFragmentbindingInflater1(i, i2, size));
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i, E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    int TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public ImmutableList<E> cancel() {
        return size() <= 1 ? this : new ReverseImmutableList(this);
    }

    static class ReverseImmutableList<E> extends ImmutableList<E> {
        private final transient ImmutableList<E> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* synthetic */ ListIterator listIterator(int i) {
            return super.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* synthetic */ List subList(int i, int i2) {
            return subList(i, i2);
        }

        ReverseImmutableList(ImmutableList<E> immutableList) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = immutableList;
        }

        @Override // com.google.common.collect.ImmutableList
        public final ImmutableList<E> cancel() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.contains(obj);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int indexOf(Object obj) {
            int iLastIndexOf = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.lastIndexOf(obj);
            if (iLastIndexOf >= 0) {
                return (size() - 1) - iLastIndexOf;
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int lastIndexOf(Object obj) {
            int iIndexOf = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.indexOf(obj);
            if (iIndexOf >= 0) {
                return (size() - 1) - iIndexOf;
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList
        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
        public final ImmutableList<E> subList(int i, int i2) {
            int size = size();
            if (i >= 0 && i2 >= i && i2 <= size) {
                return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.subList(size() - i2, size() - i).cancel();
            }
            throw new IndexOutOfBoundsException(updateAndVerifyState.TuitionPaymentFragmentbindingInflater1(i, i2, size));
        }

        @Override // java.util.List
        public E get(int i) {
            int size = size();
            if (i >= 0 && i < size) {
                return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get((size() - 1) - i);
            }
            throw new IndexOutOfBoundsException(updateAndVerifyState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i, size, FirebaseAnalytics.Param.INDEX));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.size();
        }

        @Override // com.google.common.collect.ImmutableCollection
        final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }

        Object readResolve() {
            return ImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.elements);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ImmutableCollection
    Object writeReplace() {
        return new SerializedForm(toArray());
    }

    public static <E> TuitionPaymentFragmentbindingInflater1<E> g() {
        return new TuitionPaymentFragmentbindingInflater1<>();
    }

    public static <E> TuitionPaymentFragmentbindingInflater1<E> b(int i) {
        addAllCameraCaptureCallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, "expectedSize");
        return new TuitionPaymentFragmentbindingInflater1<>(i);
    }

    public static final class TuitionPaymentFragmentbindingInflater1<E> extends ImmutableCollection.TuitionPaymentFragmentspecialinlinedviewModeldefault1<E> {
        public TuitionPaymentFragmentbindingInflater1() {
            this(4);
        }

        public TuitionPaymentFragmentbindingInflater1(int i) {
            super(i);
        }

        public final TuitionPaymentFragmentbindingInflater1<E> TuitionPaymentFragmentspecialinlinedviewModeldefault3(E e2) {
            super.TuitionPaymentFragmentbindingInflater1(e2);
            return this;
        }

        public final TuitionPaymentFragmentbindingInflater1<E> TuitionPaymentFragmentspecialinlinedviewModeldefault3(E... eArr) {
            super.TuitionPaymentFragmentspecialinlinedviewModeldefault1((Object[]) eArr);
            return this;
        }

        public final TuitionPaymentFragmentbindingInflater1<E> TuitionPaymentFragmentspecialinlinedviewModeldefault2(Iterable<? extends E> iterable) {
            super.TuitionPaymentFragmentspecialinlinedviewModeldefault3((Iterable) iterable);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableCollection.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
        public final /* bridge */ /* synthetic */ ImmutableCollection.TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentbindingInflater1(Object obj) {
            super.TuitionPaymentFragmentbindingInflater1(obj);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableCollection.TuitionPaymentFragmentspecialinlinedviewModeldefault1, com.google.common.collect.ImmutableCollection.TuitionPaymentFragmentbindingInflater1
        public final /* synthetic */ ImmutableCollection.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentbindingInflater1(Object obj) {
            super.TuitionPaymentFragmentbindingInflater1(obj);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableCollection.TuitionPaymentFragmentspecialinlinedviewModeldefault1, com.google.common.collect.ImmutableCollection.TuitionPaymentFragmentbindingInflater1
        public final /* bridge */ /* synthetic */ ImmutableCollection.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
            super.TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.TuitionPaymentFragmentspecialinlinedviewModeldefault1, com.google.common.collect.ImmutableCollection.TuitionPaymentFragmentbindingInflater1
        public final /* bridge */ /* synthetic */ ImmutableCollection.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault3(Iterable iterable) {
            super.TuitionPaymentFragmentspecialinlinedviewModeldefault3(iterable);
            return this;
        }
    }

    public static <E> ImmutableList<E> TuitionPaymentFragmentbindingInflater1(Object[] objArr, int i) {
        if (i != 0) {
            return new RegularImmutableList(objArr, i);
        }
        return (ImmutableList<E>) RegularImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    private static <E> ImmutableList<E> b(Object... objArr) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (objArr[i] == null) {
                throw new NullPointerException("at index ".concat(String.valueOf(i)));
            }
        }
        int length2 = objArr.length;
        if (length2 != 0) {
            return new RegularImmutableList(objArr, length2);
        }
        return (ImmutableList<E>) RegularImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public static <E> ImmutableList<E> TuitionPaymentFragmentspecialinlinedviewModeldefault3(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        Collection collection;
        if (iterable instanceof Collection) {
            collection = (Collection) iterable;
        } else {
            Iterator<? extends E> it = iterable.iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            collection = arrayList;
        }
        Object[] array = collection.toArray();
        int length = array.length;
        for (int i = 0; i < length; i++) {
            if (array[i] == null) {
                throw new NullPointerException("at index ".concat(String.valueOf(i)));
            }
        }
        Arrays.sort(array, comparator);
        int length2 = array.length;
        if (length2 != 0) {
            return new RegularImmutableList(array, length2);
        }
        return (ImmutableList<E>) RegularImmutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (list instanceof RandomAccess) {
            for (int i = 0; i < size; i++) {
                if (!tryOpenCamera.b(get(i), list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator<E> it = iterator();
        Iterator<E> it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !tryOpenCamera.b(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        int i = 0;
        if (obj == null) {
            while (i < size) {
                if (get(i) == null) {
                    return i;
                }
                i++;
            }
        } else {
            while (i < size) {
                if (obj.equals(get(i))) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: d */
    public final mergeOptionValue<E> iterator() {
        int size = size();
        if (size >= 0) {
            if (isEmpty()) {
                return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            }
            return new TuitionPaymentFragmentspecialinlinedviewModeldefault1(this, 0);
        }
        throw new IndexOutOfBoundsException(updateAndVerifyState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0, size, FirebaseAnalytics.Param.INDEX));
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        if (obj == null) {
            for (int size = size() - 1; size >= 0; size--) {
                if (get(size) == null) {
                    return size;
                }
            }
        } else {
            for (int size2 = size() - 1; size2 >= 0; size2--) {
                if (obj.equals(get(size2))) {
                    return size2;
                }
            }
        }
        return -1;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final hasConflict<E> listIterator() {
        int size = size();
        if (size >= 0) {
            if (isEmpty()) {
                return (hasConflict<E>) TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            }
            return new TuitionPaymentFragmentspecialinlinedviewModeldefault1(this, 0);
        }
        throw new IndexOutOfBoundsException(updateAndVerifyState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0, size, FirebaseAnalytics.Param.INDEX));
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator(int i) {
        int size = size();
        if (i >= 0 && i <= size) {
            if (isEmpty()) {
                return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            }
            return new TuitionPaymentFragmentspecialinlinedviewModeldefault1(this, i);
        }
        throw new IndexOutOfBoundsException(updateAndVerifyState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, size, FirebaseAnalytics.Param.INDEX));
    }
}

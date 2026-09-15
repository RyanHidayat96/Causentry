package com.google.common.collect;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
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
import android.widget.Toast;
import com.yalantis.ucrop.view.CropImageView;
import defpackage.Config;
import defpackage.deInitSession;
import defpackage.initSession;
import defpackage.mergeOptionValue;
import defpackage.setTemplateType;
import defpackage.setVideoStabilization;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes5.dex */
final class RegularImmutableSortedSet<E> extends ImmutableSortedSet<E> {
    static final RegularImmutableSortedSet<Comparable> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char b;
    private static int g;
    private transient ImmutableList<E> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$l = {8, -36, 87, -65};
    private static final int $$m = 184;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {104, 27, -72, 120, 37, 19, -1, 20, -10, -40, 24, 37, 19, -1, 20, -10, -23, 51, 6, 13, 5, 4, 4, -32, 58, 3, -8, 20, 3, -6, 18, -18, 45, -4, 13, -5, 4, 22, -4, 1, -16, 28, 19, -4, 9, 4, -39, 19, 8, 16, -44, 42, 10, 0, -10, 34, -25, 45, 6, 3, 12, 6, -26, 40, 5, -6, 3, 19, 40, -5, 18, -4, 13, 6, -23, 24, 31, -5, -1, 16, 13, -39, 51, -10, 13, 13, -1, 16, 13, 6, 4, -4, 5, 13, -1, 18, 4, 12, 5, 4, 12, -2, 6, 25, -6, 3, 25, -35, 41, -4, 8, 14, -1, 8, 8, 2, 27, -2, 15, -58};
    private static final int $$k = 211;
    private static final byte[] $$d = {117, 50, 102, 124, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$e = 6;
    private static int asBinder = 0;
    private static int d = 1;
    private static int asInterface = 0;

    public static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i2;
        int i8 = i7 | i3;
        int i9 = ~(i8 | i);
        int i10 = (~i) | (~((~i3) | i2));
        int i11 = (~(i | i3)) | (~(i7 | i)) | (~i8);
        int i12 = i2 + i3 + i4 + ((-953487067) * i6) + ((-1992133889) * i5);
        int i13 = i12 * i12;
        int i14 = (1737059190 * i2) + 1765277696 + (1051104396 * i3) + (i9 * (-342977397)) + (342977397 * i10) + ((-342977397) * i11) + (1394081792 * i4) + ((-1703411712) * i6) + (1961361408 * i5) + (907935744 * i13);
        int i15 = ((i2 * 272661978) - 2115615402) + (i3 * 272662804) + (i9 * 413) + (i10 * (-413)) + (i11 * 413) + (i4 * 272662391) + (i6 * 2077717299) + (i5 * 1957688713) + (i13 * 166854656);
        int i16 = i14 + (i15 * i15 * (-213778432));
        if (i16 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        if (i16 == 2) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        if (i16 == 3) {
            return b(objArr);
        }
        if (i16 != 4) {
            RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) objArr[0];
            int i17 = 2 % 2;
            int i18 = asBinder + 41;
            d = i18 % 128;
            int i19 = i18 % 2;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = regularImmutableSortedSet.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i20 = asBinder + 27;
            d = i20 % 128;
            int i21 = i20 % 2;
            return Integer.valueOf(iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        RegularImmutableSortedSet regularImmutableSortedSet2 = (RegularImmutableSortedSet) objArr[0];
        int i22 = 2 % 2;
        int i23 = d + 37;
        asBinder = i23 % 128;
        int i24 = i23 % 2;
        if (regularImmutableSortedSet2.isEmpty()) {
            throw new NoSuchElementException();
        }
        int i25 = d + 123;
        asBinder = i25 % 128;
        return i25 % 2 != 0 ? regularImmutableSortedSet2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(regularImmutableSortedSet2.size() >>> 1) : regularImmutableSortedSet2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(regularImmutableSortedSet2.size() - 1);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void h(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 84
            int r0 = 53 - r7
            byte[] r1 = com.google.common.collect.RegularImmutableSortedSet.$$d
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            int r7 = 52 - r7
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L29
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r8
            int r6 = r6 + 1
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            r3 = r1[r6]
            r5 = r3
            r3 = r8
            r8 = r5
        L29:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-11)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.RegularImmutableSortedSet.h(int, byte, byte, java.lang.Object[]):void");
    }

    private static void j(int i, int i2, short s, Object[] objArr) {
        int i3 = 99 - s;
        byte[] bArr = $$j;
        int i4 = 68 - i;
        byte[] bArr2 = new byte[53 - i2];
        int i5 = 52 - i2;
        int i6 = -1;
        if (bArr == null) {
            i4++;
            i3 = (i4 + i3) - 7;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                byte b2 = bArr[i4];
                i4++;
                i3 = (i3 + b2) - 7;
            }
        }
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final /* synthetic */ Iterator descendingIterator() {
        int i = 2 % 2;
        int i2 = d + 71;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        mergeOptionValue<E> it = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.cancel().iterator();
        int i4 = asBinder + 111;
        d = i4 % 128;
        int i5 = i4 % 2;
        return it;
    }

    private static void i(int i, char[] cArr, byte b2, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3;
        int i4 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        long j = 0;
        Object obj2 = null;
        int i5 = 3;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cArgb = (char) Color.argb(0, 0, 0, 0);
                        int iMakeMeasureSpec = 2267 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        int packedPositionGroup = 33 - ExpandableListView.getPackedPositionGroup(j);
                        byte b3 = (byte) i5;
                        byte b4 = (byte) (b3 - 4);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cArgb, iMakeMeasureSpec, packedPositionGroup, -1927765101, false, $$n(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i6++;
                    j = 0;
                    i5 = 3;
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
        Object[] objArr3 = {Integer.valueOf(b)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            byte b5 = (byte) 3;
            byte b6 = (byte) (b5 - 4);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.lastIndexOf("", '0') + 2268, ((Process.getThreadPriority(0) + 20) >> 6) + 33, -1927765101, false, $$n(b5, b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
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
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    int i7 = $10 + 15;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b << b2);
                        int i8 = deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        cArr4[0] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % b2);
                    } else {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    }
                    obj = obj2;
                    i3 = 2;
                } else {
                    Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b7 = (byte) 2;
                        byte b8 = (byte) (b7 - 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 49268), Color.green(0) + 3261, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 30, -127612708, false, $$n(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        int i9 = $10 + 83;
                        $11 = i9 % 128;
                        int i10 = i9 % 2;
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = (byte) (b9 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (22877 - TextUtils.indexOf((CharSequence) "", '0', 0)), 595 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 17 - (ViewConfiguration.getTouchSlop() >> 8), 1570859318, false, $$n(b9, b10, (byte) (b10 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        int i11 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i11];
                        int i12 = $10 + 97;
                        $11 = i12 % 128;
                        int i13 = i12 % 2;
                    } else {
                        obj = null;
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i14 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i14];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                        } else {
                            int i16 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i16];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i17];
                            int i18 = $10 + 103;
                            $11 = i18 % 128;
                            i3 = 2;
                            int i19 = i18 % 2;
                        }
                    }
                    i3 = 2;
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += i3;
                obj2 = obj;
            }
        }
        for (int i20 = 0; i20 < i; i20++) {
            cArr4[i20] = (char) (cArr4[i20] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) throws Throwable {
        Object[] objArr2;
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) objArr[0];
        int i = 2 % 2;
        int i2 = d + 27;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char packedPositionType = (char) (31533 - ExpandableListView.getPackedPositionType(0L));
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 922;
            int iRgb = Color.rgb(0, 0, 0) + 16777244;
            byte b2 = $$d[132];
            Object[] objArr3 = new Object[1];
            h(b2, (byte) (b2 & 52), (byte) ($$e | 8), objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionType, iIndexOf, iRgb, -1048449946, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        i((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 21, new char[]{3, 15, 24, 16, 31, 17, Typography.quote, 4, ' ', 17, ' ', 22, '\b', 17, 6, 1, 29, '\r', 5, 31, 14, ' '}, (byte) (Process.getGidForName("") + 48), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        i(AndroidCharacter.getMirror('0') - '!', new char[]{1, 2, 3, 27, '\f', 2, 27, 4, 3, 30, 7, '\r', 19, 31, 13854}, (byte) ('O' - AndroidCharacter.getMirror('0')), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char scrollBarSize = (char) (31533 - (ViewConfiguration.getScrollBarSize() >> 8));
            int iArgb = 921 - Color.argb(0, 0, 0, 0);
            int iIndexOf2 = TextUtils.indexOf("", "") + 28;
            byte[] bArr = $$d;
            byte b3 = (byte) (bArr[1] + 1);
            byte b4 = bArr[7];
            Object[] objArr6 = new Object[1];
            h(b3, b4, b4, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollBarSize, iArgb, iIndexOf2, -778300370, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = asBinder + 117;
            d = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char scrollBarSize2 = (char) (31533 - (ViewConfiguration.getScrollBarSize() >> 8));
                int i6 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 921;
                int maximumDrawingCacheSize = 28 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int i7 = $$e;
                Object[] objArr7 = new Object[1];
                h((byte) (i7 | 97), (byte) (i7 | 9), $$d[7], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollBarSize2, i6, maximumDrawingCacheSize, -1142834547, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
            int iMyUid = Process.myUid();
            int i8 = ~iMyUid;
            int i9 = (((~((-1180461649) | i8)) | (~(iMyUid | 593617995))) * 959) + 1631733151 + (((~(iMyUid | (-1180461649))) | (~(i8 | 593617995))) * 959) + 1053905703;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr2[0])[0] = i11 ^ (i11 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            i((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 27, new char[]{3, 15, 24, 16, 31, 17, Typography.quote, 4, 3, 27, 22, '!', 2, 11, '\r', 19, 25, 17, '\b', 6, 24, 30, 18, 6, Typography.quote, 27}, (byte) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 112), objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            i(Color.green(0) + 18, new char[]{7, ' ', 13824, 13824, 3, 6, 11, 1, 13826, 13826, 7, 19, '\t', ' ', '\r', 19, '!', 11}, (byte) (Process.getGidForName("") + 25), objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr11 = new Object[1];
            i(16 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), new char[]{21, '#', 27, '#', 31, 4, 3, 15, 16, 4, 23, '\b', '\r', '\b', 1, 24}, (byte) (View.resolveSizeAndState(0, 0, 0) + 62), objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            i(16 - (ViewConfiguration.getPressedStateDuration() >> 16), new char[]{16, 25, 3, 6, '\r', 19, '\b', 6, 15, Typography.quote, '\f', 26, 23, 5, 24, 4}, (byte) (79 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr12);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, regularImmutableSortedSet)).intValue();
            int i12 = asBinder + 13;
            d = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object[] objArr13 = {applicationContext, Integer.valueOf(iIntValue), 0, 1053905703};
                byte[] bArr2 = $$j;
                Object[] objArr14 = new Object[1];
                j((byte) (bArr2[37] - 1), bArr2[76], bArr2[53], objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                byte b5 = bArr2[53];
                Object[] objArr15 = new Object[1];
                j(b5, b5, bArr2[118], objArr15);
                objArr2 = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char size = (char) (View.MeasureSpec.getSize(0) + 31533);
                    int trimmedLength = 921 - TextUtils.getTrimmedLength("");
                    int iRgb2 = (-16777188) - Color.rgb(0, 0, 0);
                    int i14 = $$e;
                    Object[] objArr16 = new Object[1];
                    h((byte) (i14 | 97), (byte) (i14 | 9), $$d[7], objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(size, trimmedLength, iRgb2, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr2);
                try {
                    Object[] objArr17 = new Object[1];
                    i((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 22, new char[]{3, 15, 24, 16, 31, 17, Typography.quote, 4, ' ', 17, ' ', 22, '\b', 17, 6, 1, 29, '\r', 5, 31, 14, ' '}, (byte) (47 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    i(View.combineMeasuredStates(0, 0) + 15, new char[]{1, 2, 3, 27, '\f', 2, 27, 4, 3, 30, 7, '\r', 19, 31, 13854}, (byte) (View.MeasureSpec.getMode(0) + 31), objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 31533);
                        int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 921;
                        int i15 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28;
                        byte[] bArr3 = $$d;
                        byte b6 = (byte) (bArr3[1] + 1);
                        byte b7 = bArr3[7];
                        Object[] objArr19 = new Object[1];
                        h(b6, b7, b7, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetBefore, threadPriority, i15, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 31533);
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 921;
                        int iIndexOf3 = 28 - TextUtils.indexOf("", "", 0, 0);
                        byte b8 = $$d[132];
                        Object[] objArr20 = new Object[1];
                        h(b8, (byte) (b8 & 52), (byte) ($$e | 8), objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maximumFlingVelocity, windowTouchSlop, iIndexOf3, -1048449946, false, (String) objArr20[0], null);
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
        if (((int[]) objArr2[3])[0] != ((int[]) objArr2[1])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr2[4];
            if (strArr == null) {
                throw null;
            }
            for (String str : strArr) {
                int i16 = d + 117;
                asBinder = i16 % 128;
                int i17 = i16 % 2;
                arrayList.add(str);
            }
            throw null;
        }
        int i18 = ((int[]) objArr2[0])[0];
        Object[] objArr21 = {new int[1], new int[]{((int[]) objArr2[1])[0]}, (Object[]) objArr2[2], new int[]{((int[]) objArr2[3])[0]}, (String[]) objArr2[4]};
        int iMyUid2 = Process.myUid();
        int i19 = ~iMyUid2;
        int i20 = i18 + 1273691479 + (((-1085800451) | iMyUid2) * (-676)) + (((~(419687321 | i19)) | 1085800450) * 676) + (((~(iMyUid2 | 1505487771)) | (~(i19 | (-1354392323))) | 268591872) * 676);
        int i21 = (i20 << 13) ^ i20;
        int i22 = i21 ^ (i21 >>> 17);
        ((int[]) objArr21[0])[0] = i22 ^ (i22 << 5);
        return regularImmutableSortedSet.TuitionPaymentFragmentspecialinlinedviewModeldefault3.iterator();
    }

    static {
        g = 1;
        INotificationSideChannel();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new RegularImmutableSortedSet<>(ImmutableList.asInterface(), setVideoStabilization.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        int i = asInterface + 105;
        g = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    RegularImmutableSortedSet(ImmutableList<E> immutableList, Comparator<? super E> comparator) {
        super(comparator);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = immutableList;
    }

    @Override // com.google.common.collect.ImmutableCollection
    final Object[] b() {
        Object[] objArrB;
        int i = 2 % 2;
        int i2 = asBinder + 113;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            objArrB = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b();
            int i3 = 25 / 0;
        } else {
            objArrB = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b();
        }
        int i4 = d + 57;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return objArrB;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.common.collect.ImmutableCollection
    final int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = d + 53;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i4 = asBinder + 55;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 10 / 0;
        }
        return iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: d */
    public final mergeOptionValue<E> iterator() {
        mergeOptionValue<E> it;
        int i = 2 % 2;
        int i2 = d + 81;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            it = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.iterator();
            int i3 = 61 / 0;
        } else {
            it = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.iterator();
        }
        int i4 = d + 59;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return it;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final mergeOptionValue<E> cancelAll() {
        int i = 2 % 2;
        int i2 = d + 3;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        mergeOptionValue<E> it = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.cancel().iterator();
        int i4 = asBinder + 17;
        d = i4 % 128;
        int i5 = i4 % 2;
        return it;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) objArr[0];
        int i = 2 % 2;
        int i2 = d + 117;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ImmutableList<E> immutableList = regularImmutableSortedSet.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i3 != 0) {
            immutableList.size();
            throw null;
        }
        int size = immutableList.size();
        int i4 = d + 69;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return Integer.valueOf(size);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        int i = 2 % 2;
        if (obj == null) {
            return false;
        }
        int i2 = asBinder + 65;
        d = i2 % 128;
        int i3 = i2 % 2;
        try {
            if (Collections.binarySearch(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, obj, onTransact()) < 0) {
                return false;
            }
            int i4 = asBinder + 91;
            d = i4 % 128;
            int i5 = i4 % 2;
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        int i = 2 % 2;
        if (collection instanceof setTemplateType) {
            collection = ((setTemplateType) collection).b();
        }
        if (Config.b(comparator(), collection)) {
            int i2 = d + 121;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            if (collection.size() > 1) {
                mergeOptionValue<E> it = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.iterator();
                Iterator<?> it2 = collection.iterator();
                if (!it.hasNext()) {
                    return false;
                }
                Object next = it2.next();
                E next2 = it.next();
                while (true) {
                    try {
                        int iCompare = ((ImmutableSortedSet) this).TuitionPaymentFragmentbindingInflater1.compare(next2, next);
                        if (iCompare < 0) {
                            if (!it.hasNext()) {
                                int i4 = asBinder + 125;
                                d = i4 % 128;
                                int i5 = i4 % 2;
                                return false;
                            }
                            next2 = it.next();
                        } else if (iCompare == 0) {
                            if (!it2.hasNext()) {
                                return true;
                            }
                            next = it2.next();
                        } else if (iCompare > 0) {
                            return false;
                        }
                    } catch (ClassCastException | NullPointerException unused) {
                    }
                }
            }
        }
        return super.containsAll(collection);
    }

    @Override // com.google.common.collect.ImmutableCollection
    final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = asBinder + 101;
        d = i2 % 128;
        int i3 = i2 % 2;
        ImmutableList<E> immutableList = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i3 != 0) {
            return immutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
        immutableList.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) objArr[0];
        Object[] objArr2 = (Object[]) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = d + 61;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = regularImmutableSortedSet.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr2, iIntValue);
            int i3 = 35 / 0;
        } else {
            iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = regularImmutableSortedSet.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr2, iIntValue);
        }
        return Integer.valueOf(iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            int i2 = d + 3;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 53 / 0;
            }
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            int i4 = asBinder + 117;
            d = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (!Config.b(((ImmutableSortedSet) this).TuitionPaymentFragmentbindingInflater1, set)) {
            return containsAll(set);
        }
        int i6 = d + 125;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        Iterator<E> it = set.iterator();
        try {
            mergeOptionValue<E> it2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.iterator();
            while (it2.hasNext()) {
                E next = it2.next();
                E next2 = it.next();
                if (next2 != null) {
                    int i8 = asBinder + 117;
                    d = i8 % 128;
                    int i9 = i8 % 2;
                    if (((ImmutableSortedSet) this).TuitionPaymentFragmentbindingInflater1.compare(next, next2) != 0) {
                    }
                }
                return false;
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public final E first() {
        int i = 2 % 2;
        int i2 = d + 13;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (!isEmpty()) {
            int i4 = asBinder + 111;
            d = i4 % 128;
            return i4 % 2 == 0 ? this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(0) : this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(0);
        }
        throw new NoSuchElementException();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final E lower(E e2) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i = 2 % 2;
        int i2 = asBinder + 43;
        d = i2 % 128;
        if (i2 % 2 != 0 ? (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1((Object) e2, false) - 1) != -1 : (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1((Object) e2, false)) != -1) {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        int i3 = asBinder + 71;
        d = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final E floor(E e2) {
        int i = 2 % 2;
        int i2 = asBinder + 81;
        d = i2 % 128;
        int i3 = i2 % 2;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1((Object) e2, true) - 1;
        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 != -1) {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        int i4 = d + 95;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final E ceiling(E e2) {
        int i = 2 % 2;
        int iBinarySearch = Collections.binarySearch(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, e2, comparator());
        if (iBinarySearch >= 0) {
            int i2 = d + 11;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
        } else {
            iBinarySearch = ~iBinarySearch;
        }
        if (iBinarySearch == size()) {
            return null;
        }
        E e3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(iBinarySearch);
        int i4 = asBinder + 81;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 50 / 0;
        }
        return e3;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final E higher(E e2) {
        int iBinarySearch;
        int i = 2 % 2;
        int i2 = asBinder + 109;
        d = i2 % 128;
        int i3 = (i2 % 2 != 0 ? (iBinarySearch = Collections.binarySearch(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, e2, comparator())) < 0 : (iBinarySearch = Collections.binarySearch(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, e2, comparator())) < 0) ? ~iBinarySearch : iBinarySearch + 1;
        if (i3 != size()) {
            E e3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(i3);
            int i4 = asBinder + 25;
            d = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 43 / 0;
            }
            return e3;
        }
        int i6 = asBinder;
        int i7 = i6 + 67;
        d = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 15 / 0;
        }
        int i9 = i6 + 67;
        d = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 90 / 0;
        }
        return null;
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    final ImmutableSortedSet<E> TuitionPaymentFragmentbindingInflater1(E e2, boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 57;
        d = i2 % 128;
        int i3 = i2 % 2;
        RegularImmutableSortedSet<E> regularImmutableSortedSetTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(0, TuitionPaymentFragmentspecialinlinedviewModeldefault1(e2, z));
        int i4 = asBinder + 15;
        d = i4 % 128;
        int i5 = i4 % 2;
        return regularImmutableSortedSetTuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    private int TuitionPaymentFragmentspecialinlinedviewModeldefault1(E e2, boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 21;
        d = i2 % 128;
        int i3 = i2 % 2;
        int iBinarySearch = Collections.binarySearch(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, e2, comparator());
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        int i4 = d + 119;
        int i5 = i4 % 128;
        asBinder = i5;
        int i6 = i4 % 2;
        if (!z) {
            return iBinarySearch;
        }
        int i7 = iBinarySearch + 1;
        int i8 = i5 + 125;
        d = i8 % 128;
        int i9 = i8 % 2;
        return i7;
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    final ImmutableSortedSet<E> TuitionPaymentFragmentbindingInflater1(E e2, boolean z, E e3, boolean z2) {
        int i = 2 % 2;
        int iBinarySearch = Collections.binarySearch(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, e2, comparator());
        if (iBinarySearch >= 0) {
            int i2 = asBinder + 65;
            d = i2 % 128;
            int i3 = i2 % 2;
            if (!z) {
                iBinarySearch++;
            }
        } else {
            iBinarySearch = ~iBinarySearch;
            int i4 = d + 83;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(iBinarySearch, size()).TuitionPaymentFragmentbindingInflater1(e3, z2);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    final ImmutableSortedSet<E> TuitionPaymentFragmentspecialinlinedviewModeldefault3(E e2, boolean z) {
        int i = 2 % 2;
        int iBinarySearch = Collections.binarySearch(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, e2, comparator());
        if (iBinarySearch >= 0) {
            int i2 = d + 9;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            if (!z) {
                iBinarySearch++;
            }
        } else {
            iBinarySearch = ~iBinarySearch;
            int i4 = d + 67;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(iBinarySearch, size());
    }

    private Comparator<Object> onTransact() throws Throwable {
        Object[] objArr;
        char c = 2;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 877;
            int i2 = 11 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            byte b2 = $$d[132];
            Object[] objArr2 = new Object[1];
            h(b2, (byte) (b2 & 52), (byte) ($$e | 8), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(jumpTapTimeout, iIndexOf, i2, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        i((ViewConfiguration.getScrollDefaultDelay() >> 16) + 22, new char[]{3, 15, 24, 16, 31, 17, Typography.quote, 4, ' ', 17, ' ', 22, '\b', 17, 6, 1, 29, '\r', 5, 31, 14, ' '}, (byte) (TextUtils.lastIndexOf("", '0') + 48), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        i(View.MeasureSpec.getSize(0) + 15, new char[]{1, 2, 3, 27, '\f', 2, 27, 4, 3, 30, 7, '\r', 19, 31, 13854}, (byte) (31 - ExpandableListView.getPackedPositionGroup(0L)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
            int doubleTapTimeout = 876 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 11;
            byte[] bArr = $$d;
            byte b3 = bArr[132];
            byte b4 = bArr[7];
            Object[] objArr5 = new Object[1];
            h(b3, b4, b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(threadPriority, doubleTapTimeout, iLastIndexOf, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cBlue = (char) Color.blue(0);
                int iResolveOpacity = 876 - Drawable.resolveOpacity(0, 0);
                int iIndexOf2 = 10 - TextUtils.indexOf("", "", 0);
                byte[] bArr2 = $$d;
                byte b5 = (byte) (bArr2[1] + 1);
                Object[] objArr6 = new Object[1];
                h(b5, (byte) (b5 + 1), bArr2[10], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cBlue, iResolveOpacity, iIndexOf2, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i3 = ~iUptimeMillis;
            int i4 = (-58366972) + (((~((-225206273) | i3)) | 222322688) * 184) + ((iUptimeMillis | (-268400086)) * (-184)) + ((~((-265516502) | i3)) * 184) + 496317911;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            i(26 - View.MeasureSpec.getMode(0), new char[]{3, 15, 24, 16, 31, 17, Typography.quote, 4, 3, 27, 22, '!', 2, 11, '\r', 19, 25, 17, '\b', 6, 24, 30, 18, 6, Typography.quote, 27}, (byte) (Color.blue(0) + 112), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            i(18 - TextUtils.indexOf("", "", 0), new char[]{7, ' ', 13824, 13824, 3, 6, 11, 1, 13826, 13826, 7, 19, '\t', ' ', '\r', 19, '!', 11}, (byte) (MotionEvent.axisFromString("") + 25), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i7 = d + 121;
                asBinder = i7 % 128;
                int i8 = i7 % 2;
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            i(TextUtils.getOffsetAfter("", 0) + 16, new char[]{21, '#', 27, '#', 31, 4, 3, 15, 16, 4, 23, '\b', '\r', '\b', 1, 24}, (byte) (62 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            i(View.getDefaultSize(0, 0) + 16, new char[]{16, 25, 3, 6, '\r', 19, '\b', 6, 15, Typography.quote, '\f', 26, 23, 5, 24, 4}, (byte) (77 - TextUtils.lastIndexOf("", '0', 0)), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i9 = d + 61;
            asBinder = i9 % 128;
            int i10 = i9 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 496317911};
                int i11 = $$k;
                byte[] bArr3 = $$j;
                Object[] objArr13 = new Object[1];
                j((byte) (i11 & 352), bArr3[44], (byte) (-bArr3[23]), objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                j((byte) (bArr3[37] - 1), (byte) (i11 >>> 2), bArr3[39], objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    int i12 = asBinder + 55;
                    d = i12 % 128;
                    int i13 = i12 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1);
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 876;
                        int edgeSlop = 10 - (ViewConfiguration.getEdgeSlop() >> 16);
                        byte[] bArr4 = $$d;
                        byte b6 = (byte) (bArr4[1] + 1);
                        Object[] objArr16 = new Object[1];
                        h(b6, (byte) (b6 + 1), bArr4[10], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, scrollBarSize, edgeSlop, 256017550, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        i(View.combineMeasuredStates(0, 0) + 22, new char[]{3, 15, 24, 16, 31, 17, Typography.quote, 4, ' ', 17, ' ', 22, '\b', 17, 6, 1, 29, '\r', 5, 31, 14, ' '}, (byte) (TextUtils.indexOf((CharSequence) "", '0') + 48), objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        i(15 - View.resolveSizeAndState(0, 0, 0), new char[]{1, 2, 3, 27, '\f', 2, 27, 4, 3, 30, 7, '\r', 19, 31, 13854}, (byte) (31 - View.resolveSizeAndState(0, 0, 0)), objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                            int iResolveSizeAndState = 876 - View.resolveSizeAndState(0, 0, 0);
                            int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 11;
                            byte[] bArr5 = $$d;
                            byte b7 = bArr5[132];
                            byte b8 = bArr5[7];
                            Object[] objArr19 = new Object[1];
                            h(b7, b8, b8, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(keyRepeatDelay, iResolveSizeAndState, bitsPerPixel, 2009631821, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                            int i14 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 876;
                            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 10;
                            byte b9 = $$d[132];
                            Object[] objArr20 = new Object[1];
                            h(b9, (byte) (b9 & 52), (byte) ($$e | 8), objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(deadChar, i14, iKeyCodeFromString, 252381699, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
                c = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i15 = ((int[]) objArr[c])[0];
        int i16 = ((int[]) objArr[0])[0];
        if (i16 == i15) {
            int i17 = asBinder + 31;
            d = i17 % 128;
            int i18 = i17 % 2;
            int i19 = ((int[]) objArr[1])[0];
            Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i20 = i19 + (-340708924) + ((~((~elapsedCpuTime) | (-26882692))) * (-116)) + ((604327032 | elapsedCpuTime) * 116) + (((~(elapsedCpuTime | 564016803)) | 67192920) * 116);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr21[1])[0] = i22 ^ (i22 << 5);
        } else {
            int[] iArr = new int[i16];
            int i23 = i16 - 1;
            iArr[i23] = 1;
            Toast.makeText((Context) null, iArr[((i16 * i23) % 2) - 1], 1).show();
            int i24 = ((int[]) objArr[1])[0];
            Object[] objArr22 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i25 = ~iIdentityHashCode;
            int i26 = i24 + 536468375 + (((~((-36573234) | i25)) | (~((-3736996) | iIdentityHashCode))) * 217) + (((~(iIdentityHashCode | (-36573234))) | 2621473) * 217) + (((~((-3736996) | i25)) | 36573233) * 217);
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr22[1])[0] = i28 ^ (i28 << 5);
        }
        return ((ImmutableSortedSet) this).TuitionPaymentFragmentbindingInflater1;
    }

    private RegularImmutableSortedSet<E> TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2) {
        int i3 = 2 % 2;
        if (i == 0 && i2 == size()) {
            int i4 = d + 13;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }
        if (i < i2) {
            RegularImmutableSortedSet<E> regularImmutableSortedSet = new RegularImmutableSortedSet<>(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.subList(i, i2), ((ImmutableSortedSet) this).TuitionPaymentFragmentbindingInflater1);
            int i6 = asBinder + 13;
            d = i6 % 128;
            if (i6 % 2 != 0) {
                return regularImmutableSortedSet;
            }
            throw null;
        }
        Comparator<? super E> comparator = ((ImmutableSortedSet) this).TuitionPaymentFragmentbindingInflater1;
        if (setVideoStabilization.TuitionPaymentFragmentspecialinlinedviewModeldefault2().equals(comparator)) {
            return (RegularImmutableSortedSet<E>) TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        return new RegularImmutableSortedSet<>(ImmutableList.asInterface(), comparator);
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public final ImmutableList<E> TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = d + 113;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        ImmutableList<E> immutableList = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i5 = i3 + 39;
        d = i5 % 128;
        int i6 = i5 % 2;
        return immutableList;
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    final ImmutableSortedSet<E> cancel() {
        int i = 2 % 2;
        Comparator comparatorReverseOrder = Collections.reverseOrder(((ImmutableSortedSet) this).TuitionPaymentFragmentbindingInflater1);
        if (!isEmpty()) {
            return new RegularImmutableSortedSet(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.cancel(), comparatorReverseOrder);
        }
        int i2 = d + 109;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (!setVideoStabilization.TuitionPaymentFragmentspecialinlinedviewModeldefault2().equals(comparatorReverseOrder)) {
            RegularImmutableSortedSet regularImmutableSortedSet = new RegularImmutableSortedSet(ImmutableList.asInterface(), comparatorReverseOrder);
            int i4 = asBinder + 109;
            d = i4 % 128;
            int i5 = i4 % 2;
            return regularImmutableSortedSet;
        }
        int i6 = asBinder + 23;
        d = i6 % 128;
        if (i6 % 2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    final Object writeReplace() {
        int i = 2 % 2;
        int i2 = d + 93;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            super.writeReplace();
            throw null;
        }
        Object objWriteReplace = super.writeReplace();
        int i3 = d + 107;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return objWriteReplace;
    }

    @Override // com.google.common.collect.ImmutableCollection
    final int TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr, int i) {
        Object[] objArr2 = {this, objArr, Integer.valueOf(i)};
        return ((Integer) TuitionPaymentFragmentbindingInflater1(CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 141713410, -141713407, CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), objArr2, CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1())).intValue();
    }

    @Override // com.google.common.collect.ImmutableCollection
    final int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return ((Integer) TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, 1006744167, -1006744167, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault3)).intValue();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (Iterator) TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -1530921116, 1530921117, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public final E last() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (E) TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, 1510252634, -1510252630, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return ((Integer) TuitionPaymentFragmentbindingInflater1(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, 1768259574, -1768259572, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, CropImageView.ZoomImageToPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault3)).intValue();
    }

    static void INotificationSideChannel() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new char[]{60062, 60055, 59747, 60073, 59748, 60090, 59744, 60047, 60056, 60053, 60060, 60034, 60041, 60050, 60040, 59749, 60083, 60088, 60079, 59753, 60072, 60043, 59751, 60049, 60051, 60054, 60048, 59746, 60063, 60045, 59745, 60046, 59750, 60058, 60117, 60052};
        b = (char) 57191;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$n(int r6, int r7, short r8) {
        /*
            int r6 = 116 - r6
            byte[] r0 = com.google.common.collect.RegularImmutableSortedSet.$$l
            int r8 = r8 * 4
            int r1 = 1 - r8
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L15
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r7 = r7 + 1
            int r4 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L2a:
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.RegularImmutableSortedSet.$$n(int, int, short):java.lang.String");
    }
}

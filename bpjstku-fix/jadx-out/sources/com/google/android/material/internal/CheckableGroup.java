package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.android.material.internal.MaterialCheckable;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class CheckableGroup<T extends MaterialCheckable<T>> {
    private final Map<Integer, T> checkables = new HashMap();
    private final Set<Integer> checkedIds = new HashSet();
    private OnCheckedStateChangeListener onCheckedStateChangeListener;
    private boolean selectionRequired;
    private boolean singleSelection;
    private static final byte[] $$c = {104, 27, -72, 120};
    private static final int $$f = 47;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {15, -9, 64, -81, -23, -10, -3, -14, -9, -25, -8, 2, 6, -24, -12, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$e = 85;
    private static final byte[] $$a = {89, 92, -72, 43, -23, 37, -42, -11, 10, -18, 7, 0, -7, -7, -23, 44, -44, -10, 5, -6, -18};
    private static final int $$b = 153;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int asInterface = 1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 5619;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 30777;
    private static char TuitionPaymentFragmentbindingInflater1 = 38548;
    private static char b = 31686;

    public interface OnCheckedStateChangeListener {
        void onCheckedStateChanged(Set<Integer> set);
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
    private static void a(byte r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 97
            int r8 = 11 - r8
            int r9 = r9 + 4
            byte[] r0 = com.google.android.material.internal.CheckableGroup.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r9
            r4 = r2
            goto L29
        L12:
            r3 = r2
        L13:
            int r9 = r9 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L24:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L29:
            int r9 = -r9
            int r7 = r7 + r9
            int r7 = r7 + (-5)
            r9 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.CheckableGroup.a(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.google.android.material.internal.CheckableGroup.$$d
            int r8 = r8 * 11
            int r8 = 14 - r8
            int r7 = r7 * 41
            int r7 = 53 - r7
            int r9 = r9 * 15
            int r9 = 99 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r9 = r8
            r4 = r2
            goto L2e
        L17:
            r3 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L1b:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            int r9 = r9 + 1
            if (r4 != r7) goto L2c
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2c:
            r3 = r0[r9]
        L2e:
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + (-11)
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.CheckableGroup.d(short, byte, byte, java.lang.Object[]):void");
    }

    static /* synthetic */ boolean access$000(CheckableGroup checkableGroup, MaterialCheckable materialCheckable) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean zCheckInternal = checkableGroup.checkInternal(materialCheckable);
        if (i3 == 0) {
            int i4 = 77 / 0;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return zCheckInternal;
        }
        throw null;
    }

    static /* synthetic */ boolean access$100(CheckableGroup checkableGroup) {
        int i = 2 % 2;
        int i2 = asInterface + 117;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        boolean z = checkableGroup.selectionRequired;
        int i5 = i3 + 95;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    static /* synthetic */ boolean access$200(CheckableGroup checkableGroup, MaterialCheckable materialCheckable, boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            checkableGroup.uncheckInternal(materialCheckable, z);
            throw null;
        }
        boolean zUncheckInternal = checkableGroup.uncheckInternal(materialCheckable, z);
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return zUncheckInternal;
    }

    static /* synthetic */ void access$300(CheckableGroup checkableGroup) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        checkableGroup.onCheckedStateChanged();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setSingleSelection(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 39;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 14 / 0;
            if (this.singleSelection == z) {
                return;
            }
        } else if (this.singleSelection == z) {
            return;
        }
        int i5 = i2 + 59;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            this.singleSelection = z;
            clearCheck();
        } else {
            this.singleSelection = z;
            clearCheck();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public boolean isSingleSelection() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = i2 + 21;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.singleSelection;
        int i5 = i2 + 89;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public void setSelectionRequired(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        this.selectionRequired = z;
        int i5 = i3 + 83;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        int i3 = $10 + 29;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (true) {
            char c = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            char c2 = 1;
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i5 = 58224;
            int i6 = 0;
            while (i6 < 16) {
                int i7 = $10 + 13;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                char c3 = cArr3[c2];
                char c4 = cArr3[c];
                int i9 = i6;
                int i10 = (c4 + i5) ^ ((c4 << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)));
                int i11 = c4 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(b);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[c2] = Integer.valueOf(i10);
                    objArr2[0] = Integer.valueOf(c3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 47774);
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 468;
                        int edgeSlop = 13 - (ViewConfiguration.getEdgeSlop() >> 16);
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c2] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, windowTouchSlop, edgeSlop, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[c2] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf("", "", 0, 0) + 47773), View.combineMeasuredStates(0, 0) + 468, 14 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6 = i9 + 1;
                    c2 = 1;
                    c = 0;
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
                byte b2 = (byte) 0;
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getTapTimeout() >> 16), Process.getGidForName("") + 2324, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 44, -1312321721, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
    }

    public boolean isSelectionRequired() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
            int packedPositionChild = 875 - ExpandableListView.getPackedPositionChild(0L);
            int mirror = AndroidCharacter.getMirror('0') - '&';
            byte b2 = $$a[11];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (b3 - 1), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, packedPositionChild, mirror, -1199417970, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{56778, 34951, 38004, 33379, 44290, 57775, 10847, 51251, 61739, 19209, 22838, 16307, 21774, 41543, 43076, 13209, 34438, 16161, 35796, 44430, 22778, 28223, 40017, 60364}, 21 - MotionEvent.axisFromString(""), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{38619, 20974, 60765, 61545, 63927, 22218, 19010, 7164, 33776, 39570, 5909, 4747, 49790, 28722, 31833, 7797, 14082, 4035}, Color.red(0) + 15, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 876;
            int mode = View.MeasureSpec.getMode(0) + 10;
            byte b4 = (byte) ($$b & 7);
            byte b5 = $$a[8];
            Object[] objArr5 = new Object[1];
            a(b4, b5, (byte) (b5 - 1), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, touchSlop, mode, 254769921, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
                int iArgb = 876 - Color.argb(0, 0, 0, 0);
                int iIndexOf = 10 - TextUtils.indexOf("", "");
                byte b6 = $$a[11];
                Object[] objArr6 = new Object[1];
                a(b6, (byte) (b6 + 3), (byte) ($$b & 47), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, iArgb, iIndexOf, 1324201839, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int i2 = ~(System.identityHashCode(this) | 1418617);
            int i3 = (((296224 | i2) * (-196)) - 121618896) + ((i2 | 1122393) * 196) + 872580050;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{47161, 47195, 64526, 12673, 55570, 57749, 61278, 34755, 9025, 40392, 39711, 52931, 27726, 52436, 12997, 5836, 5751, 7273}, 16 - Color.blue(0), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{51480, 12169, 34695, 27315, 61472, 25894, 49758, 54721, 33107, 59226, 17919, 5752, 49831, 17701, 40391, 1846, 5959, 33911}, 16 - (ViewConfiguration.getEdgeSlop() >> 16), objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            int i6 = asInterface + 71;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object[] objArr10 = {Integer.valueOf(iIntValue), 872580050};
                byte[] bArr = $$d;
                byte b7 = bArr[16];
                Object[] objArr11 = new Object[1];
                d(b7, b7, bArr[18], objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b8 = bArr[18];
                Object[] objArr12 = new Object[1];
                d(b8, b8, bArr[16], objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char gidForName = (char) (Process.getGidForName("") + 1);
                    int i8 = 876 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int i9 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 10;
                    byte b9 = $$a[11];
                    Object[] objArr14 = new Object[1];
                    a(b9, (byte) (b9 + 3), (byte) ($$b & 47), objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(gidForName, i8, i9, 1324201839, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    c(new char[]{56778, 34951, 38004, 33379, 44290, 57775, 10847, 51251, 61739, 19209, 22838, 16307, 21774, 41543, 43076, 13209, 34438, 16161, 35796, 44430, 22778, 28223, 40017, 60364}, 22 - (ViewConfiguration.getTapTimeout() >> 16), objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    c(new char[]{38619, 20974, 60765, 61545, 63927, 22218, 19010, 7164, 33776, 39570, 5909, 4747, 49790, 28722, 31833, 7797, 14082, 4035}, (ViewConfiguration.getEdgeSlop() >> 16) + 15, objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                        int edgeSlop = 876 - (ViewConfiguration.getEdgeSlop() >> 16);
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10;
                        byte b10 = (byte) ($$b & 7);
                        byte b11 = $$a[8];
                        Object[] objArr17 = new Object[1];
                        a(b10, b11, (byte) (b11 - 1), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(tapTimeout, edgeSlop, minimumFlingVelocity, 254769921, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 876;
                        int iMyTid = 10 - (Process.myTid() >> 22);
                        byte b12 = $$a[11];
                        byte b13 = b12;
                        Object[] objArr18 = new Object[1];
                        a(b12, b13, (byte) (b13 - 1), objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf2, packedPositionType, iMyTid, -1199417970, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr13;
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
        int i10 = ((int[]) objArr[2])[0];
        int i11 = ((int[]) objArr[0])[0];
        if (i11 == i10) {
            int i12 = ((int[]) objArr[1])[0];
            Object[] objArr19 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iMyUid = Process.myUid();
            int i13 = ~iMyUid;
            int i14 = i12 + (-1967728524) + (((~(i13 | 652054339)) | (~(611744110 | i13)) | (-654311280)) * 464) + (((-42567170) | iMyUid) * (-464)) + (((~(iMyUid | 652054339)) | (-654311280)) * 464);
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
            ((int[]) objArr19[1])[0] = i16 ^ (i16 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr != null) {
                int i17 = asInterface + 11;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17 % 128;
                int i18 = i17 % 2;
                int i19 = 0;
                while (i19 < strArr.length) {
                    arrayList.add(strArr[i19]);
                    i19++;
                    int i20 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
                    asInterface = i20 % 128;
                    int i21 = i20 % 2;
                }
            }
            Toast.makeText((Context) null, i11 / (((i11 - 1) * i11) % 2), 0).show();
            int i22 = ((int[]) objArr[1])[0];
            Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i23 = ~startUptimeMillis;
            int i24 = i22 + (-2093621993) + (((~((-558586746) | i23)) | (-518276517)) * (-602)) + (((~(startUptimeMillis | (-558586746))) | 554375769 | (~((-514065541) | i23))) * (-301)) + ((~(i23 | (-518276517))) * 301);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr20[1])[0] = i26 ^ (i26 << 5);
        }
        return this.selectionRequired;
    }

    public void setOnCheckedStateChangeListener(OnCheckedStateChangeListener onCheckedStateChangeListener) {
        int i = 2 % 2;
        int i2 = asInterface + 45;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.onCheckedStateChangeListener = onCheckedStateChangeListener;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 85;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addCheckable(T t) {
        int i = 2 % 2;
        int i2 = asInterface + 65;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            this.checkables.put(Integer.valueOf(t.getId()), t);
            t.isChecked();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.checkables.put(Integer.valueOf(t.getId()), t);
        if (t.isChecked()) {
            checkInternal(t);
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
        }
        t.setInternalOnCheckedChangeListener(new MaterialCheckable.OnCheckedChangeListener<T>() { // from class: com.google.android.material.internal.CheckableGroup.1
            @Override // com.google.android.material.internal.MaterialCheckable.OnCheckedChangeListener
            public void onCheckedChanged(T t2, boolean z) {
                if (!z) {
                    CheckableGroup checkableGroup = CheckableGroup.this;
                    if (!CheckableGroup.access$200(checkableGroup, t2, CheckableGroup.access$100(checkableGroup))) {
                        return;
                    }
                } else if (!CheckableGroup.access$000(CheckableGroup.this, t2)) {
                    return;
                }
                CheckableGroup.access$300(CheckableGroup.this);
            }
        });
    }

    public void removeCheckable(T t) {
        int i = 2 % 2;
        int i2 = asInterface + 13;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            t.setInternalOnCheckedChangeListener(null);
            this.checkables.remove(Integer.valueOf(t.getId()));
            this.checkedIds.remove(Integer.valueOf(t.getId()));
            obj.hashCode();
            throw null;
        }
        t.setInternalOnCheckedChangeListener(null);
        this.checkables.remove(Integer.valueOf(t.getId()));
        this.checkedIds.remove(Integer.valueOf(t.getId()));
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
    }

    public void check(int i) {
        int i2 = 2 % 2;
        T t = this.checkables.get(Integer.valueOf(i));
        if (t != null) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 37;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            if (checkInternal(t)) {
                int i5 = asInterface + 13;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                int i6 = i5 % 2;
                onCheckedStateChanged();
            }
        }
    }

    public void uncheck(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        T t = this.checkables.get(Integer.valueOf(i));
        if (t != null) {
            int i5 = asInterface + 73;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
            if (!(!uncheckInternal(t, this.selectionRequired))) {
                onCheckedStateChanged();
            }
        }
        int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
        asInterface = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    public void clearCheck() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 13;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            boolean zIsEmpty = this.checkedIds.isEmpty();
            Iterator<T> it = this.checkables.values().iterator();
            while (it.hasNext()) {
                uncheckInternal(it.next(), false);
            }
            if (zIsEmpty) {
                return;
            }
            onCheckedStateChanged();
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.checkedIds.isEmpty();
        this.checkables.values().iterator();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getSingleCheckedId() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (!this.singleSelection || this.checkedIds.isEmpty()) {
            return -1;
        }
        int i3 = asInterface + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        return this.checkedIds.iterator().next().intValue();
    }

    public Set<Integer> getCheckedIds() {
        int i = 2 % 2;
        HashSet hashSet = new HashSet(this.checkedIds);
        int i2 = asInterface + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return hashSet;
    }

    public List<Integer> getCheckedIdsSortedByChildOrder(ViewGroup viewGroup) {
        int i = 2 % 2;
        Set<Integer> checkedIds = getCheckedIds();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 43;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof MaterialCheckable) && checkedIds.contains(Integer.valueOf(childAt.getId()))) {
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                arrayList.add(Integer.valueOf(childAt.getId()));
                int i7 = asInterface + 51;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
                int i8 = i7 % 2;
            }
        }
        return arrayList;
    }

    private boolean checkInternal(MaterialCheckable<T> materialCheckable) {
        int i = 2 % 2;
        int id2 = materialCheckable.getId();
        if (!(!this.checkedIds.contains(Integer.valueOf(id2)))) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i3 = i2 + 15;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 85;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                return false;
            }
            throw null;
        }
        T t = this.checkables.get(Integer.valueOf(getSingleCheckedId()));
        if (t != null) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 5;
            asInterface = i6 % 128;
            if (i6 % 2 == 0) {
                uncheckInternal(t, false);
            } else {
                uncheckInternal(t, false);
            }
        }
        boolean zAdd = this.checkedIds.add(Integer.valueOf(id2));
        if (!materialCheckable.isChecked()) {
            materialCheckable.setChecked(true);
        }
        return zAdd;
    }

    private boolean uncheckInternal(MaterialCheckable<T> materialCheckable, boolean z) {
        int i = 2 % 2;
        int id2 = materialCheckable.getId();
        if (this.checkedIds.contains(Integer.valueOf(id2))) {
            if (z && this.checkedIds.size() == 1 && this.checkedIds.contains(Integer.valueOf(id2))) {
                materialCheckable.setChecked(true);
                return false;
            }
            boolean zRemove = this.checkedIds.remove(Integer.valueOf(id2));
            if (materialCheckable.isChecked()) {
                int i2 = asInterface + 119;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                int i3 = i2 % 2;
                materialCheckable.setChecked(false);
            }
            return zRemove;
        }
        int i4 = asInterface + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    private void onCheckedStateChanged() {
        OnCheckedStateChangeListener onCheckedStateChangeListener;
        int i = 2 % 2;
        int i2 = asInterface + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            onCheckedStateChangeListener = this.onCheckedStateChangeListener;
            int i3 = 78 / 0;
            if (onCheckedStateChangeListener == null) {
                return;
            }
        } else {
            onCheckedStateChangeListener = this.onCheckedStateChangeListener;
            if (onCheckedStateChangeListener == null) {
                return;
            }
        }
        onCheckedStateChangeListener.onCheckedStateChanged(getCheckedIds());
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 % 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r7, int r8, int r9) {
        /*
            int r9 = r9 + 4
            int r8 = r8 * 4
            int r8 = 108 - r8
            int r7 = r7 * 4
            int r7 = r7 + 1
            byte[] r0 = com.google.android.material.internal.CheckableGroup.$$c
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r9
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            int r9 = r9 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L24:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2a:
            int r8 = r8 + r9
            r9 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.CheckableGroup.$$g(byte, int, int):java.lang.String");
    }
}

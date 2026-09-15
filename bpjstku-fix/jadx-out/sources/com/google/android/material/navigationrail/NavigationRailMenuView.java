package com.google.android.material.navigationrail;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.mlkit.common.MlKitException;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class NavigationRailMenuView extends NavigationBarMenuView {
    private int itemMinimumHeight;
    private final FrameLayout.LayoutParams layoutParams;
    private static final byte[] $$j = {27, -8, 5, 78};
    private static final int $$k = 61;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {115, 98, 19, 9, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
    private static final int $$e = MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -83722375;

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 3
            int r6 = 84 - r6
            int r8 = r8 * 4
            int r8 = r8 + 4
            int r7 = r7 * 4
            int r7 = 53 - r7
            byte[] r0 = com.google.android.material.navigationrail.NavigationRailMenuView.$$d
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r8]
        L28:
            int r3 = -r3
            int r8 = r8 + 1
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigationrail.NavigationRailMenuView.f(int, byte, byte, java.lang.Object[]):void");
    }

    public NavigationRailMenuView(Context context) {
        super(context);
        this.itemMinimumHeight = -1;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.layoutParams = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
        setItemActiveIndicatorResizeable(true);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003f  */
    /* JADX WARN: Code duplicated, block: B:13:0x004a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    /* JADX WARN: Code duplicated, block: B:9:0x0035 A[PHI: r1 r4
  0x0035: PHI (r1v5 int) = (r1v4 int), (r1v9 int) binds: [B:8:0x0033, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x0035: PHI (r4v3 int) = (r4v2 int), (r4v7 int) binds: [B:8:0x0033, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    protected void onMeasure(int i, int i2) throws Throwable {
        int size;
        int size2;
        int i3;
        int iMeasureShiftingChildHeights;
        int i4 = 2 % 2;
        int i5 = TuitionPaymentFragmentbindingInflater1 + 33;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            size = View.MeasureSpec.getSize(i2);
            size2 = getMenu().getVisibleItems().size();
            if (size2 > 1) {
                if (isShifting(getLabelVisibilityMode(), size2)) {
                    i3 = TuitionPaymentFragmentbindingInflater1 + 33;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
                    if (i3 % 2 == 0) {
                        iMeasureShiftingChildHeights = measureShiftingChildHeights(i, size, size2);
                        int i6 = 88 / 0;
                    } else {
                        iMeasureShiftingChildHeights = measureShiftingChildHeights(i, size, size2);
                    }
                }
            }
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.resolveSizeAndState(iMeasureShiftingChildHeights, i2, 0));
        }
        size = View.MeasureSpec.getSize(i2);
        size2 = getMenu().getVisibleItems().size();
        if (size2 > 1) {
            if (isShifting(getLabelVisibilityMode(), size2)) {
                i3 = TuitionPaymentFragmentbindingInflater1 + 33;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
                if (i3 % 2 == 0) {
                    iMeasureShiftingChildHeights = measureShiftingChildHeights(i, size, size2);
                    int i7 = 88 / 0;
                } else {
                    iMeasureShiftingChildHeights = measureShiftingChildHeights(i, size, size2);
                }
            }
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.resolveSizeAndState(iMeasureShiftingChildHeights, i2, 0));
        iMeasureShiftingChildHeights = measureSharedChildHeights(i, size, size2, null);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.resolveSizeAndState(iMeasureShiftingChildHeights, i2, 0));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042 A[PHI: r2
  0x0042: PHI (r2v4 android.view.View) = (r2v3 android.view.View), (r2v5 android.view.View) binds: [B:13:0x0040, B:10:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount;
        int i5;
        int i6;
        View childAt;
        int i7 = 2 % 2;
        int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
        TuitionPaymentFragmentbindingInflater1 = i8 % 128;
        if (i8 % 2 != 0) {
            childCount = getChildCount();
            i5 = 1;
            i6 = 0;
        } else {
            childCount = getChildCount();
            i5 = 0;
            i6 = 0;
        }
        while (i5 < childCount) {
            int i9 = TuitionPaymentFragmentbindingInflater1 + 65;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i9 % 128;
            if (i9 % 2 == 0) {
                childAt = getChildAt(i5);
                if (childAt.getVisibility() != 83) {
                    int measuredHeight = childAt.getMeasuredHeight() + i6;
                    childAt.layout(0, i6, i3 - i, measuredHeight);
                    i6 = measuredHeight;
                }
            } else {
                childAt = getChildAt(i5);
                if (childAt.getVisibility() != 8) {
                    int measuredHeight2 = childAt.getMeasuredHeight() + i6;
                    childAt.layout(0, i6, i3 - i, measuredHeight2);
                    i6 = measuredHeight2;
                }
            }
            i5++;
        }
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    public NavigationBarItemView createNavigationBarItemView(Context context) {
        int i = 2 % 2;
        NavigationRailItemView navigationRailItemView = new NavigationRailItemView(context);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        return navigationRailItemView;
    }

    private int makeSharedHeightSpec(int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        int iMax = i2 / Math.max(1, i3);
        int size = this.itemMinimumHeight;
        if (size == -1) {
            size = View.MeasureSpec.getSize(i);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(size, iMax), 0);
        int i7 = TuitionPaymentFragmentbindingInflater1 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i7 % 128;
        int i8 = i7 % 2;
        return iMakeMeasureSpec;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x018b  */
    /* JADX WARN: Code duplicated, block: B:39:0x018c  */
    private static void e(char[] cArr, boolean z, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        char[] cArr2;
        Throwable cause;
        int i5 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr3 = new char[i];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (true) {
            i4 = 29209604;
            if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i) {
                break;
            }
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i2 + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i6 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i6]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char c = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 3291;
                    int edgeSlop = 31 - (ViewConfiguration.getEdgeSlop() >> 16);
                    byte b = (byte) ($$k & 3);
                    byte b2 = (byte) (b - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, jumpTapTimeout, edgeSlop, 1199271174, false, $$l(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 652 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 44 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -450685997, false, $$l(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i7 = $10 + 95;
                $11 = i7 % 128;
                int i8 = i7 % 2;
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
            int i9 = $10 + 65;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr4 = new char[i];
            System.arraycopy(cArr3, 0, cArr4, 0, i);
            System.arraycopy(cArr4, 0, cArr3, i - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr4, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr3, 0, i - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            int i11 = $10 + 123;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                cArr2 = new char[i];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            } else {
                cArr2 = new char[i];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i) {
                cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[(i - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 650 - TextUtils.indexOf((CharSequence) "", '0'), View.resolveSizeAndState(0, 0, 0) + 44, -450685997, false, $$l(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                int i12 = $10 + 17;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 3 / 2;
                }
                i4 = 29209604;
            }
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
        int i14 = $11 + 99;
        $10 = i14 % 128;
        if (i14 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private int measureShiftingChildHeights(int i, int i2, int i3) throws Throwable {
        int i4;
        int i5;
        int iMeasureChildHeight;
        int i6;
        int i7;
        int i8 = 2 % 2;
        int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
        TuitionPaymentFragmentbindingInflater1 = i9 % 128;
        int i10 = i9 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (46400 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), Color.blue(0) + 40, KeyEvent.getDeadChar(0, 0) + 19, -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
        }
        int i11 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
        Object[] objArr = new Object[1];
        e(new char[]{17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16}, false, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 22, 125 - TextUtils.lastIndexOf("", '0', 0, 0), 8 - Color.red(0), objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        long j = 0;
        Object[] objArr2 = new Object[1];
        e(new char[]{'\r', 5, 65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2}, true, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 14, 130 - Color.red(0), (ViewConfiguration.getPressedStateDuration() >> 16) + 12, objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        int i12 = i11;
        long j2 = 262;
        long j3 = -1;
        long j4 = ((j3 ^ 2934771528967325995L) | (-837514354225367008L)) ^ j3;
        long j5 = j3 ^ (-837514354225367008L);
        long j6 = (j5 | 2934771528967325995L) ^ j3;
        long jMyTid = Process.myTid();
        long j7 = (((long) (-523)) * 2934771528967325995L) + (((long) 263) * (-837514354225367008L)) + ((j4 | j6 | ((j5 | jMyTid) ^ j3)) * j2) + (((long) (-786)) * j6) + (j2 * (((j5 | (jMyTid ^ j3)) ^ j3) | j4 | j6));
        int i13 = 0;
        while (true) {
            if (i13 == 10) {
                try {
                    Object[] objArr3 = {366216583};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ExpandableListView.getPackedPositionType(0L) + 46038), ((Process.getThreadPriority(0) + 20) >> 6) + 1134, (ViewConfiguration.getFadingEdgeLength() >> 16) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr4 = {Integer.valueOf(i), 0, 345374564, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr3), false};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                        int absoluteGravity = 1031 - Gravity.getAbsoluteGravity(0, 0);
                        int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 15;
                        byte b = $$d[7];
                        byte b2 = b;
                        Object[] objArr5 = new Object[1];
                        f(b, b2, b2, objArr5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cCombineMeasuredStates, absoluteGravity, longPressTimeout, 1298546779, false, (String) objArr5[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 45993), (ViewConfiguration.getPressedStateDuration() >> 16) + 1117, 17 - (ViewConfiguration.getEdgeSlop() >> 16)), Boolean.TYPE});
                    }
                    Object[] objArr6 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    int i14 = ((int[]) objArr6[1])[0];
                    int i15 = ((int[]) objArr6[3])[0];
                    if (i15 == i14) {
                        i4 = 0;
                        break;
                    }
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr6[0];
                    if (strArr != null) {
                        int i16 = 0;
                        while (i16 < strArr.length) {
                            arrayList.add(strArr[i16]);
                            i16++;
                            int i17 = TuitionPaymentFragmentbindingInflater1 + 99;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17 % 128;
                            int i18 = i17 % 2;
                        }
                    }
                    i4 = 0;
                    Toast.makeText((Context) null, i15 / (((i15 - 1) * i15) % 2), 0).show();
                    break;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (37837 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1))), (ViewConfiguration.getEdgeSlop() >> 16) + 59, 18 - TextUtils.getOffsetAfter("", 0), 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
            }
            int i19 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).getInt(null);
            long j8 = jLongValue;
            int i20 = 0;
            while (true) {
                int i21 = 0;
                for (int i22 = 8; i21 != i22; i22 = 8) {
                    int i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
                    TuitionPaymentFragmentbindingInflater1 = i23 % 128;
                    if (i23 % 2 != 0) {
                        i7 = (((((int) (j8 >>> i21)) & 4162) + (i19 * 58)) % (i19 >> 28)) / i19;
                        i21 += 110;
                    } else {
                        i7 = (((((int) (j8 >> i21)) & 255) + (i19 << 6)) + (i19 << 16)) - i19;
                        i21++;
                    }
                    i19 = i7;
                }
                if (i20 != 0) {
                    break;
                }
                i20++;
                j8 = j7;
            }
            int i24 = i12;
            if (i19 == i24) {
                i4 = 0;
                break;
            }
            jLongValue -= 1024;
            i13++;
            i12 = i24;
            j = 0;
        }
        View childAt = getChildAt(getSelectedItemPosition());
        if (childAt != null) {
            iMeasureChildHeight = measureChildHeight(childAt, i, makeSharedHeightSpec(i, i2, i3));
            i6 = i2 - iMeasureChildHeight;
            i5 = i3 - 1;
        } else {
            i5 = i3;
            iMeasureChildHeight = i4;
            i6 = i2;
        }
        return iMeasureChildHeight + measureSharedChildHeights(i, i6, i5, childAt);
    }

    private int measureSharedChildHeights(int i, int i2, int i3, View view) {
        int iMakeMeasureSpec;
        int i4 = 2 % 2;
        if (view == null) {
            iMakeMeasureSpec = makeSharedHeightSpec(i, i2, i3);
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        }
        int childCount = getChildCount();
        int iMeasureChildHeight = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
            TuitionPaymentFragmentbindingInflater1 = i6 % 128;
            int i7 = i6 % 2;
            View childAt = getChildAt(i5);
            if (childAt != view) {
                iMeasureChildHeight += measureChildHeight(childAt, i, iMakeMeasureSpec);
            }
        }
        int i8 = TuitionPaymentFragmentbindingInflater1 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i8 % 128;
        if (i8 % 2 != 0) {
            return iMeasureChildHeight;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private int measureChildHeight(View view, int i, int i2) {
        int i3 = 2 % 2;
        if (view.getVisibility() == 8) {
            return 0;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
        view.measure(i, i2);
        int measuredHeight = view.getMeasuredHeight();
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
        TuitionPaymentFragmentbindingInflater1 = i6 % 128;
        if (i6 % 2 == 0) {
            return measuredHeight;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    void setMenuGravity(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        if (this.layoutParams.gravity != i) {
            this.layoutParams.gravity = i;
            setLayoutParams(this.layoutParams);
            int i5 = TuitionPaymentFragmentbindingInflater1 + 39;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    int getMenuGravity() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 17;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = this.layoutParams.gravity;
            throw null;
        }
        int i4 = this.layoutParams.gravity;
        int i5 = TuitionPaymentFragmentbindingInflater1 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    public void setItemMinimumHeight(int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentbindingInflater1 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (this.itemMinimumHeight != i) {
            this.itemMinimumHeight = i;
            requestLayout();
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 69;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public int getItemMinimumHeight() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        int i4 = i2 % 2;
        int i5 = this.itemMinimumHeight;
        int i6 = i3 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 70 / 0;
        }
        return i5;
    }

    boolean isTopGravity() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 91;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        if ((this.layoutParams.gravity & 112) == 48) {
            return true;
        }
        int i4 = TuitionPaymentFragmentbindingInflater1 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$l(int r5, byte r6, int r7) {
        /*
            int r5 = r5 + 119
            byte[] r0 = com.google.android.material.navigationrail.NavigationRailMenuView.$$j
            int r6 = r6 * 4
            int r6 = r6 + 4
            int r7 = r7 * 4
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r5 = r6
            r4 = r7
            r3 = r2
            goto L25
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L21:
            int r3 = r3 + 1
            r4 = r0[r6]
        L25:
            int r6 = r6 + 1
            int r5 = r5 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigationrail.NavigationRailMenuView.$$l(int, byte, int):java.lang.String");
    }
}

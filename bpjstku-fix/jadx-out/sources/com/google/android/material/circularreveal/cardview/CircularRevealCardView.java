package com.google.android.material.circularreveal.cardview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.circularreveal.CircularRevealHelper;
import com.google.android.material.circularreveal.CircularRevealWidget;
import defpackage.initSession;
import defpackage.setVideoStabilizationMode;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class CircularRevealCardView extends MaterialCardView implements CircularRevealWidget {
    private final CircularRevealHelper helper;
    private static final byte[] $$c = {91, -17, 90, 37};
    private static final int $$d = 82;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {46, 126, -84, 108, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 239;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int b = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {59731, 59814, 59812, 59832, 59798, 59797, 59812, 59833, 59826, 59831, 59815, 59789, 59805, 59836, 59807, 59780, 59815, 59833, 59837, 59834, 59812, 59814, 59705, 59746, 59744, 59749, 59771, 59757, 59752, 59728, 59728, 59759, 59751, 59770, 59747, 59757, 59747};

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 + 4
            byte[] r0 = com.google.android.material.circularreveal.cardview.CircularRevealCardView.$$a
            int r6 = r6 * 14
            int r6 = 98 - r6
            int r1 = r5 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L12
            r4 = r5
            r3 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r5) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L20:
            int r7 = r7 + 1
            int r3 = r3 + 1
            r4 = r0[r7]
        L26:
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.circularreveal.cardview.CircularRevealCardView.a(int, byte, short, java.lang.Object[]):void");
    }

    public CircularRevealCardView(Context context) {
        this(context, null);
    }

    public CircularRevealCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.helper = new CircularRevealHelper(this);
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public void buildCircularRevealCache() {
        int i = 2 % 2;
        int i2 = b + 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            this.helper.buildCircularRevealCache();
            throw null;
        }
        this.helper.buildCircularRevealCache();
        int i3 = b + 119;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public void destroyCircularRevealCache() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
        b = i2 % 128;
        int i3 = i2 % 2;
        this.helper.destroyCircularRevealCache();
        if (i3 == 0) {
            int i4 = 83 / 0;
        }
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public void setRevealInfo(CircularRevealWidget.RevealInfo revealInfo) {
        int i = 2 % 2;
        int i2 = b + 49;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            this.helper.setRevealInfo(revealInfo);
            int i3 = 38 / 0;
        } else {
            this.helper.setRevealInfo(revealInfo);
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 27;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static void c(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        char[] cArr;
        int i2 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        long j = 0;
        if (cArr2 != null) {
            int i8 = $10;
            int i9 = i8 + 29;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i11 = i8 + 49;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 0;
            while (i13 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr2[i13]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 5;
                        byte b3 = (byte) (b2 - 5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - (ExpandableListView.getPackedPositionForChild(i3, i3) > j ? 1 : (ExpandableListView.getPackedPositionForChild(i3, i3) == j ? 0 : -1))), 1270 - View.MeasureSpec.getMode(i3), View.resolveSizeAndState(i3, i3, i3) + 18, 407021364, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i13] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i13++;
                    i3 = 0;
                    j = 0;
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
        char[] cArr4 = new char[i5];
        char c = 0;
        System.arraycopy(cArr2, i4, cArr4, 0, i5);
        if (bArr != null) {
            int i14 = $11 + 45;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                cArr = new char[i5];
                setvideostabilizationmode.b = 0;
            } else {
                cArr = new char[i5];
                setvideostabilizationmode.b = 0;
                c = 0;
            }
            while (setvideostabilizationmode.b < i5) {
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i15 = setvideostabilizationmode.b;
                    Object[] objArr3 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3225, (-16777203) - Color.rgb(0, 0, 0), 2133916302, false, $$e((byte) 6, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i15] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                } else {
                    int i16 = setvideostabilizationmode.b;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char c2 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 29943);
                            int iArgb = Color.argb(0, 0, 0, 0) + 1755;
                            int iRgb = (-16777193) - Color.rgb(0, 0, 0);
                            byte length2 = (byte) $$c.length;
                            byte b5 = (byte) (length2 - 4);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, iArgb, iRgb, 387247676, false, $$e(length2, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i16] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c = cArr[setvideostabilizationmode.b];
                Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (41241 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1705, 21 - ExpandableListView.getPackedPositionType(0L), -1434471773, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            cArr4 = cArr;
        }
        if (i7 > 0) {
            int i17 = $11 + 109;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            char[] cArr5 = new char[i5];
            i = 0;
            System.arraycopy(cArr4, 0, cArr5, 0, i5);
            int i19 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr4, i19, i7);
            System.arraycopy(cArr5, i7, cArr4, 0, i19);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr6 = new char[i5];
            while (true) {
                setvideostabilizationmode.b = i;
                if (setvideostabilizationmode.b >= i5) {
                    break;
                }
                cArr6[setvideostabilizationmode.b] = cArr4[(i5 - setvideostabilizationmode.b) - 1];
                i = setvideostabilizationmode.b + 1;
            }
            cArr4 = cArr6;
        }
        if (i6 > 0) {
            int i20 = 0;
            while (true) {
                setvideostabilizationmode.b = i20;
                if (setvideostabilizationmode.b >= i5) {
                    break;
                }
                cArr4[setvideostabilizationmode.b] = (char) (cArr4[setvideostabilizationmode.b] - iArr[2]);
                i20 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public CircularRevealWidget.RevealInfo getRevealInfo() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
            int i3 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 651;
            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 45;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a((byte) 52, bArr[80], bArr[5], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(threadPriority, i3, modifierMetaStateMask, -459846511, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new int[]{0, 22, 70, 0}, true, new byte[]{1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new int[]{22, 15, 0, 0}, true, new byte[]{1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int keyRepeatDelay = 651 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            int iAlpha = Color.alpha(0) + 44;
            byte b2 = $$a[7];
            byte b3 = b2;
            Object[] objArr5 = new Object[1];
            a(b2, b3, (byte) (b3 | 51), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maximumFlingVelocity, keyRepeatDelay, iAlpha, -873460649, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = b + 49;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cRgb = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
                int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 651;
                int mirror = '\\' - AndroidCharacter.getMirror('0');
                byte b4 = (byte) ($$b & 53);
                byte b5 = $$a[80];
                Object[] objArr6 = new Object[1];
                a(b4, b5, (byte) (b5 | 50), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cRgb, iIndexOf, mirror, -1595579076, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i6 = ((int[]) objArr7[2])[0];
            int i7 = ((int[]) objArr7[0])[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i8 = ~iIdentityHashCode;
            int i9 = 177532779 + (((~(985442180 | i8)) | (~((-988872991) | iIdentityHashCode))) * 210) + (((~(iIdentityHashCode | 989702046)) | (~(i8 | (-984613125)))) * 210) + 691037067;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[3])[0] = i11 ^ (i11 << 5);
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) View.resolveSize(0, 0), 1610 - (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 26, 2145681644, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), 691037067, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                    int maximumDrawingCacheSize = 651 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int i12 = 44 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    byte b6 = $$a[7];
                    byte b7 = b6;
                    Object[] objArr9 = new Object[1];
                    a(b6, b7, (byte) (b7 | 51), objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, maximumDrawingCacheSize, i12, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Process.myPid() >> 22), 694 - TextUtils.indexOf((CharSequence) "", '0'), 97 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Gravity.getAbsoluteGravity(0, 0) + 63406), 793 - Color.red(0), 83 - KeyEvent.getDeadChar(0, 0)), Integer.TYPE, Integer.TYPE});
                }
                Object[] objArr10 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int iIndexOf2 = 651 - TextUtils.indexOf("", "", 0, 0);
                    int i13 = 44 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte b8 = (byte) ($$b & 53);
                    byte b9 = $$a[80];
                    Object[] objArr11 = new Object[1];
                    a(b8, b9, (byte) (b9 | 50), objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(fadingEdgeLength, iIndexOf2, i13, -1595579076, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr10);
                try {
                    Object[] objArr12 = new Object[1];
                    c(new int[]{0, 22, 70, 0}, true, new byte[]{1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, objArr12);
                    Class<?> cls2 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    c(new int[]{22, 15, 0, 0}, true, new byte[]{1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr13);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                        int jumpTapTimeout = 651 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int i14 = 45 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        byte b10 = $$a[7];
                        byte b11 = b10;
                        Object[] objArr14 = new Object[1];
                        a(b10, b11, (byte) (b11 | 51), objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf, jumpTapTimeout, i14, -873460649, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 651;
                        int trimmedLength = 44 - TextUtils.getTrimmedLength("");
                        byte[] bArr2 = $$a;
                        Object[] objArr15 = new Object[1];
                        a((byte) 52, bArr2[80], bArr2[5], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(packedPositionType, keyRepeatTimeout, trimmedLength, -459846511, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    objArr = objArr10;
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
        int i15 = ((int[]) objArr[0])[0];
        int i16 = ((int[]) objArr[2])[0];
        if (i16 == i15) {
            Object[] objArr16 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i17 = ((int[]) objArr[3])[0];
            int i18 = ((int[]) objArr[2])[0];
            int i19 = ((int[]) objArr[0])[0];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i20 = i17 + ((((~(804479017 | iIdentityHashCode2)) | (-534043115)) * 262) - 1020458479) + (((~((~iIdentityHashCode2) | 804479017)) | (-534043115)) * 262);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr16[3])[0] = i22 ^ (i22 << 5);
            return this.helper.getRevealInfo();
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArr[1];
        if (strArr != null) {
            int i23 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
            b = i23 % 128;
            int i24 = i23 % 2;
            while (i2 < strArr.length) {
                int i25 = b + 29;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i25 % 128;
                if (i25 % 2 != 0) {
                    arrayList.add(strArr[i2]);
                } else {
                    arrayList.add(strArr[i2]);
                    i2++;
                }
            }
        }
        throw new RuntimeException(String.valueOf(i16));
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public void setCircularRevealScrimColor(int i) {
        int i2 = 2 % 2;
        int i3 = b + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        this.helper.setCircularRevealScrimColor(i);
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 105;
        b = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public int getCircularRevealScrimColor() {
        int i = 2 % 2;
        int i2 = b + 7;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        int circularRevealScrimColor = this.helper.getCircularRevealScrimColor();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 57;
        b = i4 % 128;
        int i5 = i4 % 2;
        return circularRevealScrimColor;
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public Drawable getCircularRevealOverlayDrawable() {
        int i = 2 % 2;
        int i2 = b + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        Drawable circularRevealOverlayDrawable = this.helper.getCircularRevealOverlayDrawable();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
        b = i4 % 128;
        int i5 = i4 % 2;
        return circularRevealOverlayDrawable;
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public void setCircularRevealOverlayDrawable(Drawable drawable) throws Throwable {
        int i = 2 % 2;
        int i2 = b + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        this.helper.setCircularRevealOverlayDrawable(drawable);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 87;
        b = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 15 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        super.draw(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1.draw(r4);
        r4 = com.google.android.material.circularreveal.cardview.CircularRevealCardView.b + 91;
        com.google.android.material.circularreveal.cardview.CircularRevealCardView.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r4 % 128;
        r4 = r4 % 2;
     */
    @Override // android.view.View, com.google.android.material.circularreveal.CircularRevealWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.material.circularreveal.cardview.CircularRevealCardView.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            int r1 = r1 + 49
            int r2 = r1 % 128
            com.google.android.material.circularreveal.cardview.CircularRevealCardView.b = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L17
            com.google.android.material.circularreveal.CircularRevealHelper r1 = r3.helper
            r2 = 34
            int r2 = r2 / 0
            if (r1 == 0) goto L28
            goto L1b
        L17:
            com.google.android.material.circularreveal.CircularRevealHelper r1 = r3.helper
            if (r1 == 0) goto L28
        L1b:
            r1.draw(r4)
            int r4 = com.google.android.material.circularreveal.cardview.CircularRevealCardView.b
            int r4 = r4 + 91
            int r1 = r4 % 128
            com.google.android.material.circularreveal.cardview.CircularRevealCardView.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r1
            int r4 = r4 % r0
            return
        L28:
            super.draw(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.circularreveal.cardview.CircularRevealCardView.draw(android.graphics.Canvas):void");
    }

    @Override // com.google.android.material.circularreveal.CircularRevealHelper.Delegate
    public void actualDraw(Canvas canvas) {
        int i = 2 % 2;
        int i2 = b + 47;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        super.draw(canvas);
        int i4 = b + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.view.View, com.google.android.material.circularreveal.CircularRevealWidget
    public boolean isOpaque() {
        int i = 2 % 2;
        int i2 = b;
        int i3 = i2 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        CircularRevealHelper circularRevealHelper = this.helper;
        if (circularRevealHelper == null) {
            return super.isOpaque();
        }
        int i5 = i2 + 45;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        int i6 = i5 % 2;
        boolean zIsOpaque = circularRevealHelper.isOpaque();
        int i7 = b + 97;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 90 / 0;
        }
        return zIsOpaque;
    }

    @Override // com.google.android.material.circularreveal.CircularRevealHelper.Delegate
    public boolean actualIsOpaque() {
        int i = 2 % 2;
        int i2 = b + 71;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsOpaque = super.isOpaque();
        int i4 = b + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return zIsOpaque;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(short r5, short r6, byte r7) {
        /*
            byte[] r0 = com.google.android.material.circularreveal.cardview.CircularRevealCardView.$$c
            int r6 = r6 * 2
            int r6 = 1 - r6
            int r7 = r7 * 4
            int r7 = r7 + 4
            int r5 = 105 - r5
            byte[] r1 = new byte[r6]
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
            int r3 = r3 + 1
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L23:
            r4 = r0[r7]
        L25:
            int r7 = r7 + 1
            int r4 = -r4
            int r5 = r5 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.circularreveal.cardview.CircularRevealCardView.$$e(short, short, byte):java.lang.String");
    }
}

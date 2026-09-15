package com.midtrans.sdk.corekit.core.themes;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import com.bpjstku.R;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Random;

/* JADX INFO: loaded from: classes5.dex */
public class ColorTheme implements BaseColorTheme {
    public static final String AQUAMARINE = "aquamarine";
    public static final String AZURE = "azure";
    public static final String CORAL = "coral";
    public static final String CRIMSON = "crimson";
    public static final String GOLDEN = "golden";
    public static final String GRAY = "gray";
    public static final String GREEN_FOREST = "greenforest";
    public static final String HOT_PINK = "hotpink";
    public static final String INDIGO = "indigo";
    public static final String KHAKI = "khaki";
    public static final String LAVENDER = "lavender";
    public static final String LIME = "lime";
    public static final String MAROON = "maroon";
    public static final String MINTY = "minty";
    public static final String NAVY_BLUE = "navyblue";
    public static final String OLIVE = "olive";
    public static final String SALMON = "salmon";
    public static final String TEAL = "teal";
    private final String colorTheme;
    private final Context context;
    private static final byte[] $$c = {57, -50, -56, -93};
    private static final int $$f = 126;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {90, 46, 113, 8, 9, -62, 71, -10, -1, 5, 20, -8, 16, -14, 22, -71, 62, 8, 9, -12, 16, -1, -10, 14, -59, 68, 4, -8, 16, -14, 22, -2, 6, 4, -66, 68, -10, 20, -11, 16, 7, -18, 4, 13, -4, -52, 36, 22, 20, -11, 16, 7, -18, 4, 13, -4, -18, 40, -16, 13, 0, 13, -8};
    private static final int $$e = 58;
    private static final byte[] $$a = {31, 115, -100, -11, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 98;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int b = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = -83722286;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 84
            byte[] r0 = com.midtrans.sdk.corekit.core.themes.ColorTheme.$$a
            int r8 = r8 * 15
            int r8 = 53 - r8
            int r6 = r6 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r6
            r4 = r8
            r3 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r6 = r6 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2c:
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.corekit.core.themes.ColorTheme.a(short, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 59
            int r0 = 60 - r8
            int r7 = r7 * 7
            int r7 = r7 + 98
            int r6 = r6 + 4
            byte[] r1 = com.midtrans.sdk.corekit.core.themes.ColorTheme.$$d
            byte[] r0 = new byte[r0]
            int r8 = 59 - r8
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r7
            r3 = r2
            r7 = r6
            goto L2e
        L17:
            r3 = r2
        L18:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2e:
            int r6 = r6 + r4
            int r6 = r6 + (-3)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.corekit.core.themes.ColorTheme.d(short, byte, short, java.lang.Object[]):void");
    }

    @Override // com.midtrans.sdk.corekit.core.themes.BaseColorTheme
    public int getPrimaryColor() throws Throwable {
        int i;
        int i2;
        Object[] objArr;
        char c;
        Object[] objArr2;
        int i3;
        int i4;
        Context context;
        int i5;
        int i6 = 2 % 2;
        String str = this.colorTheme;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
            int iRgb = (-16776340) - Color.rgb(0, 0, 0);
            int mirror = AndroidCharacter.getMirror('0') - '&';
            byte[] bArr = $$a;
            Object[] objArr3 = new Object[1];
            a(bArr[5], bArr[7], bArr[28], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, iRgb, mirror, -1650998592, false, (String) objArr3[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(true, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 275, 22 - KeyEvent.keyCodeFromString(""), 10 - (ViewConfiguration.getLongPressTimeout() >> 16), new char[]{16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(false, ExpandableListView.getPackedPositionType(0L) + 279, TextUtils.indexOf("", "", 0, 0) + 15, 1 - TextUtils.lastIndexOf("", '0'), new char[]{6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
            int mirror2 = AndroidCharacter.getMirror('0') + 828;
            int absoluteGravity = 10 - Gravity.getAbsoluteGravity(0, 0);
            byte[] bArr2 = $$a;
            byte b2 = (byte) (bArr2[12] + 1);
            byte b3 = bArr2[7];
            Object[] objArr6 = new Object[1];
            a(b2, b3, b3, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(threadPriority, mirror2, absoluteGravity, 2012020043, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 876;
                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 10;
                byte b4 = $$a[7];
                Object[] objArr7 = new Object[1];
                a((byte) 88, b4, b4, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, iResolveOpacity, iNormalizeMetaState, 2012931276, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int iNextInt = new Random().nextInt(1849905144);
            int i7 = ~iNextInt;
            int i8 = (-1071019692) + ((~(979845430 | i7)) * (-560)) + ((~(iNextInt | 979856247)) * (-560)) + (((~((-939535202) | i7)) | 939524384) * 560) + 997672209;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[1])[0] = i10 ^ (i10 << 5);
            c = 2;
            i = 5;
            i2 = 7;
        } else {
            Object[] objArr9 = new Object[1];
            c(false, 276 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 25 - ((byte) KeyEvent.getModifierMetaStateMask()), 11 - View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{6, 19, 6, 17, 22, 65521, 5, 15, 2, 65534, 1, 65534, 11, 1, 15, '\f', 6, 1, 65483, 65534, '\r', '\r', 65483, 65502, 0, 17}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(false, 282 - TextUtils.getCapsMode("", 0, 0), 18 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 6 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{65529, 65527, '\n', 65535, 5, 4, 65529, 11, '\b', '\b', 65531, 4, '\n', 65495, 6, 6, 2, 65535}, objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i11 = b + 29;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
                if (i11 % 2 != 0) {
                    boolean z = applicationContext instanceof ContextWrapper;
                    obj.hashCode();
                    throw null;
                }
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr11 = new Object[1];
            c(false, 273 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) + 16, ExpandableListView.getPackedPositionChild(0L) + 15, new char[]{20, 65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17, 18, 3, 11, '\b', 65535}, objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            c(false, 278 - (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 16, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 8, new char[]{19, 65506, 65531, '\r', 2, 65501, '\t', 65534, 65535, 3, 65534, 65535, '\b', 14, 3, 14}, objArr12);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue();
            int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 121;
            b = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object[] objArr13 = {applicationContext, Integer.valueOf(iIntValue), 0, 997672209};
                byte[] bArr3 = $$d;
                byte b5 = bArr3[8];
                Object[] objArr14 = new Object[1];
                d(b5, (byte) (-b5), bArr3[60], objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                Object[] objArr15 = new Object[1];
                d((byte) $$e, bArr3[60], (byte) (-bArr3[8]), objArr15);
                Object[] objArr16 = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                        int scrollBarFadeDuration = 876 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 11;
                        byte b6 = $$a[7];
                        Object[] objArr17 = new Object[1];
                        a((byte) 88, b6, b6, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveOpacity, scrollBarFadeDuration, iIndexOf, 2012931276, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr16);
                    try {
                        Object[] objArr18 = new Object[1];
                        c(true, Color.green(0) + 275, Process.getGidForName("") + 23, (ViewConfiguration.getWindowTouchSlop() >> 8) + 10, new char[]{16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483}, objArr18);
                        Class<?> cls5 = Class.forName((String) objArr18[0]);
                        Object[] objArr19 = new Object[1];
                        c(false, (ViewConfiguration.getFadingEdgeLength() >> 16) + 279, 15 - Color.alpha(0), (KeyEvent.getMaxKeyCode() >> 16) + 2, new char[]{6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2}, objArr19);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                            int trimmedLength = 876 - TextUtils.getTrimmedLength("");
                            int packedPositionChild = 9 - ExpandableListView.getPackedPositionChild(0L);
                            byte[] bArr4 = $$a;
                            byte b7 = (byte) (bArr4[12] + 1);
                            byte b8 = bArr4[7];
                            Object[] objArr20 = new Object[1];
                            a(b7, b8, b8, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(deadChar, trimmedLength, packedPositionChild, 2012020043, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c3 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                            int i14 = 877 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                            int i15 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9;
                            byte[] bArr5 = $$a;
                            i = 5;
                            i2 = 7;
                            Object[] objArr21 = new Object[1];
                            a(bArr5[5], bArr5[7], bArr5[28], objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, i14, i15, -1650998592, false, (String) objArr21[0], null);
                        } else {
                            i = 5;
                            i2 = 7;
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } else {
                    i = 5;
                    i2 = 7;
                }
                objArr = objArr16;
                c = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i16 = ((int[]) objArr[c])[0];
        int i17 = ((int[]) objArr[0])[0];
        if (i17 == i16) {
            int i18 = ((int[]) objArr[1])[0];
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iMyUid = Process.myUid();
            int i19 = (-370653560) + (((~((-613781150) | iMyUid)) | 573470920) * (-318));
            int i20 = ~(573470920 | iMyUid);
            int i21 = ~iMyUid;
            int i22 = i18 + i19 + ((i20 | (~((-36335681) | i21))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iMyUid | (-36335681))) | (~(650116829 | i21))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr2[1])[0] = i24 ^ (i24 << 5);
            i3 = 3;
        } else {
            Toast.makeText((Context) null, i17 / (((i17 - 1) * i17) % 2), 0).show();
            int i25 = ((int[]) objArr[1])[0];
            i3 = 3;
            objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i26 = i25 + (-1703544620) + (((~(1015515001 | iIdentityHashCode)) | 40376326) * 576) + (((~((~iIdentityHashCode) | 1055891327)) | 1015448904) * 576) + 1781927296;
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr2[1])[0] = i28 ^ (i28 << 5);
        }
        str.hashCode();
        str.hashCode();
        int iHashCode = str.hashCode();
        int i29 = ((int[]) objArr2[1])[0];
        int i30 = i29 * i29;
        int i31 = -(1847183797 * i29);
        int i32 = ((i30 | i31) << 1) - (i30 ^ i31);
        int i33 = -(i29 * (-882676319));
        int i34 = ((i32 & i33) + (i33 | i32)) - 662928327;
        int i35 = i34 >> 21;
        int i36 = (((i35 | (-4095)) << 1) - (i35 ^ (-4095))) / 2048;
        int i37 = ((i36 | 1) << 1) - (i36 ^ 1);
        int i38 = ((i34 | i37) << 1) - (i37 ^ i34);
        int i39 = i34 >> 18;
        int i40 = ((i39 ^ (-32767)) + ((i39 & (-32767)) << 1)) / 16384;
        int i41 = (-((((i40 | 1) << 1) - (i40 ^ 1)) ^ i38)) + 4;
        int i42 = i41 >> 17;
        int i43 = ((((-65535) | i42) << 1) - (i42 ^ (-65535))) / 32768;
        int i44 = ((i43 | 1) << 1) - (i43 ^ 1);
        int i45 = (-3740) / ((i41 & (-(((i44 | 1) << 1) - (i44 ^ 1)))) * 935);
        switch (iHashCode) {
            case -1696850720:
                i4 = !str.equals(GREEN_FOREST) ? i45 : 0;
                break;
            case -1386609209:
                i4 = !str.equals(LAVENDER) ? i45 : 1;
                break;
            case -1240337143:
                i4 = !str.equals(GOLDEN) ? i45 : 2;
                break;
            case -1184235822:
                if (!str.equals(INDIGO)) {
                    i4 = i45;
                } else {
                    int i46 = b + 11;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i46 % 128;
                    int i47 = i46 % 2;
                }
                break;
            case -1081301904:
                i4 = !str.equals(MAROON) ? i45 : 4;
                break;
            case -909707666:
                if (!str.equals(SALMON)) {
                    i4 = i45;
                } else {
                    int i48 = b + 121;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i48 % 128;
                    i4 = i48 % 2 == 0 ? i : i3;
                }
                break;
            case 3181155:
                i4 = !str.equals(GRAY) ? i45 : 6;
                break;
            case 3321813:
                i4 = !str.equals(LIME) ? i45 : i2;
                break;
            case 3555932:
                if (!str.equals(TEAL)) {
                    i4 = i45;
                } else {
                    int i49 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
                    b = i49 % 128;
                    i4 = i49 % 2 != 0 ? 8 : 44;
                }
                break;
            case 93332111:
                i4 = !str.equals(AZURE) ? i45 : 9;
                break;
            case 94848049:
                i4 = !str.equals(CORAL) ? i45 : 10;
                break;
            case 102011650:
                if (!str.equals(KHAKI)) {
                    i4 = i45;
                } else {
                    int i50 = b + 65;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i50 % 128;
                    i4 = i50 % 2 == 0 ? 11 : 46;
                }
                break;
            case 103901271:
                if (!str.equals(MINTY)) {
                    i4 = i45;
                } else {
                    int i51 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
                    b = i51 % 128;
                    int i52 = i51 % 2;
                    i4 = 12;
                }
                break;
            case 105832923:
                i4 = !str.equals(OLIVE) ? i45 : 13;
                break;
            case 1032605407:
                if (!str.equals(CRIMSON)) {
                    i4 = i45;
                } else {
                    int i53 = b + 29;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i53 % 128;
                    int i54 = i53 % 2;
                    i4 = 14;
                }
                break;
            case 1099507523:
                if (!str.equals(HOT_PINK)) {
                    i4 = i45;
                } else {
                    int i55 = b + 123;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i55 % 128;
                    i4 = i55 % 2 == 0 ? 15 : 53;
                }
                break;
            case 1186684798:
                i4 = !str.equals(AQUAMARINE) ? i45 : 16;
                break;
            case 2117132560:
                i4 = !str.equals(NAVY_BLUE) ? i45 : 17;
                break;
            default:
                i4 = i45;
                break;
        }
        switch (i4) {
            case 0:
                context = this.context;
                i5 = R.color.green_forest_primary;
                break;
            case 1:
                context = this.context;
                i5 = R.color.lavender_primary;
                break;
            case 2:
                context = this.context;
                int i56 = b + 15;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i56 % 128;
                int i57 = i56 % 2;
                i5 = R.color.golden_primary;
                break;
            case 3:
                context = this.context;
                i5 = R.color.indigo_primary;
                break;
            case 4:
                context = this.context;
                i5 = R.color.maroon_primary;
                break;
            case 5:
                context = this.context;
                i5 = R.color.salmon_primary;
                break;
            case 6:
                context = this.context;
                i5 = R.color.gray_primary;
                break;
            case 7:
                context = this.context;
                i5 = R.color.lime_primary;
                break;
            case 8:
                context = this.context;
                i5 = R.color.teal_primary;
                break;
            case 9:
                context = this.context;
                i5 = R.color.azure_primary;
                break;
            case 10:
                context = this.context;
                i5 = R.color.coral_primary;
                break;
            case 11:
                context = this.context;
                i5 = R.color.khaki_primary;
                break;
            case 12:
                context = this.context;
                i5 = R.color.minty_primary;
                break;
            case 13:
                context = this.context;
                i5 = R.color.olive_primary;
                break;
            case 14:
                context = this.context;
                i5 = R.color.crimson_primary;
                break;
            case 15:
                context = this.context;
                i5 = R.color.hot_pink_primary;
                break;
            case 16:
                context = this.context;
                i5 = R.color.aquamarine_primary;
                break;
            case 17:
                context = this.context;
                i5 = R.color.navy_blue_primary;
                break;
            default:
                return 0;
        }
        return ContextCompat.getColor(context, i5);
    }

    private static void c(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
            int i5 = $10 + 109;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i7 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 1;
                    byte b3 = (byte) (b2 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) View.resolveSize(0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3291, TextUtils.indexOf((CharSequence) "", '0', 0) + 32, 1199271174, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 650, 44 - (ViewConfiguration.getTapTimeout() >> 16), -450685997, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i8 = $11 + 39;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 5 % 3;
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i3 > 0) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            int i10 = $11 + 101;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Process.myTid() >> 22), 651 - ((Process.getThreadPriority(0) + 20) >> 6), Color.green(0) + 44, -450685997, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
        int i12 = $10 + 91;
        $11 = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 80 / 0;
        }
    }

    public ColorTheme(Context context, String str) {
        this.context = context;
        this.colorTheme = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:65:0x0131  */
    @Override // com.midtrans.sdk.corekit.core.themes.BaseColorTheme
    public int getPrimaryDarkColor() {
        Context context;
        int i;
        int i2 = 2 % 2;
        String str = this.colorTheme;
        str.hashCode();
        str.hashCode();
        byte b2 = 1;
        switch (str.hashCode()) {
            case -1696850720:
                if (!str.equals(GREEN_FOREST)) {
                    b2 = -1;
                } else {
                    b2 = 0;
                }
                break;
            case -1386609209:
                if (!str.equals(LAVENDER)) {
                    b2 = -1;
                } else {
                    int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
                    b = i3 % 128;
                    int i4 = i3 % 2;
                }
                break;
            case -1240337143:
                if (!str.equals(GOLDEN)) {
                    b2 = -1;
                } else {
                    int i5 = b + 55;
                    int i6 = i5 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6;
                    int i7 = i5 % 2;
                    int i8 = i6 + 45;
                    b = i8 % 128;
                    int i9 = i8 % 2;
                    b2 = 2;
                }
                break;
            case -1184235822:
                if (!str.equals(INDIGO)) {
                    b2 = -1;
                } else {
                    b2 = 3;
                }
                break;
            case -1081301904:
                if (!str.equals(MAROON)) {
                    b2 = -1;
                } else {
                    int i10 = b + 19;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
                    int i11 = i10 % 2;
                    b2 = 4;
                }
                break;
            case -909707666:
                if (!str.equals(SALMON)) {
                    b2 = -1;
                } else {
                    b2 = 5;
                }
                break;
            case 3181155:
                if (!str.equals(GRAY)) {
                    b2 = -1;
                } else {
                    int i12 = b + 99;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i12 % 128;
                    b2 = i12 % 2 == 0 ? (byte) 6 : (byte) 71;
                }
                break;
            case 3321813:
                if (!str.equals(LIME)) {
                    b2 = -1;
                } else {
                    b2 = 7;
                }
                break;
            case 3555932:
                if (!str.equals(TEAL)) {
                    b2 = -1;
                } else {
                    int i13 = b + 85;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i13 % 128;
                    b2 = i13 % 2 == 0 ? (byte) 8 : (byte) 22;
                }
                break;
            case 93332111:
                if (!str.equals(AZURE)) {
                    b2 = -1;
                } else {
                    b2 = 9;
                }
                break;
            case 94848049:
                if (!str.equals(CORAL)) {
                    b2 = -1;
                } else {
                    int i14 = b + 81;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i14 % 128;
                    int i15 = i14 % 2;
                    b2 = 10;
                }
                break;
            case 102011650:
                if (!str.equals(KHAKI)) {
                    b2 = -1;
                } else {
                    b2 = 11;
                }
                break;
            case 103901271:
                if (!str.equals(MINTY)) {
                    b2 = -1;
                } else {
                    b2 = 12;
                }
                break;
            case 105832923:
                if (!str.equals(OLIVE)) {
                    b2 = -1;
                } else {
                    int i16 = b + 49;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16 % 128;
                    int i17 = i16 % 2;
                    b2 = 13;
                }
                break;
            case 1032605407:
                if (!str.equals(CRIMSON)) {
                    b2 = -1;
                } else {
                    b2 = 14;
                }
                break;
            case 1099507523:
                if (!str.equals(HOT_PINK)) {
                    b2 = -1;
                } else {
                    b2 = 15;
                }
                break;
            case 1186684798:
                if (!str.equals(AQUAMARINE)) {
                    b2 = -1;
                } else {
                    b2 = 16;
                }
                break;
            case 2117132560:
                if (!str.equals(NAVY_BLUE)) {
                    b2 = -1;
                } else {
                    b2 = 17;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                context = this.context;
                i = R.color.green_forest_primary_dark;
                break;
            case 1:
                context = this.context;
                i = R.color.lavender_primary_dark;
                break;
            case 2:
                context = this.context;
                i = R.color.golden_primary_dark;
                break;
            case 3:
                context = this.context;
                i = R.color.indigo_primary_dark;
                break;
            case 4:
                context = this.context;
                i = R.color.maroon_primary_dark;
                break;
            case 5:
                context = this.context;
                i = R.color.salmon_primary_dark;
                break;
            case 6:
                context = this.context;
                i = R.color.gray_primary_dark;
                break;
            case 7:
                context = this.context;
                i = R.color.lime_primary_dark;
                break;
            case 8:
                context = this.context;
                i = R.color.teal_primary_dark;
                break;
            case 9:
                context = this.context;
                i = R.color.azure_primary_dark;
                break;
            case 10:
                context = this.context;
                i = R.color.coral_primary_dark;
                break;
            case 11:
                context = this.context;
                i = R.color.khaki_primary_dark;
                break;
            case 12:
                context = this.context;
                i = R.color.minty_primary_dark;
                break;
            case 13:
                context = this.context;
                i = R.color.olive_primary_dark;
                break;
            case 14:
                context = this.context;
                i = R.color.crimson_primary_dark;
                break;
            case 15:
                context = this.context;
                i = R.color.hot_pink_primary_dark;
                break;
            case 16:
                context = this.context;
                i = R.color.aquamarine_primary_dark;
                break;
            case 17:
                context = this.context;
                int i18 = b + 63;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 % 128;
                int i19 = i18 % 2;
                i = R.color.navy_blue_primary_dark;
                break;
            default:
                return 0;
        }
        return ContextCompat.getColor(context, i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:59:0x0110  */
    /* JADX WARN: Code duplicated, block: B:67:0x0129  */
    @Override // com.midtrans.sdk.corekit.core.themes.BaseColorTheme
    public int getSecondaryColor() {
        Context context;
        int i;
        byte b2 = 2;
        int i2 = 2 % 2;
        String str = this.colorTheme;
        str.hashCode();
        str.hashCode();
        switch (str.hashCode()) {
            case -1696850720:
                if (str.equals(GREEN_FOREST)) {
                    int i3 = b + 63;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
                    if (i3 % 2 == 0) {
                        b2 = 0;
                    } else {
                        b2 = 1;
                    }
                } else {
                    b2 = -1;
                }
                break;
            case -1386609209:
                if (!str.equals(LAVENDER)) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
                break;
            case -1240337143:
                if (!str.equals(GOLDEN)) {
                    b2 = -1;
                } else {
                    int i4 = b + 83;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                    int i5 = i4 % 2;
                }
                break;
            case -1184235822:
                if (!str.equals(INDIGO)) {
                    b2 = -1;
                } else {
                    b2 = 3;
                }
                break;
            case -1081301904:
                if (!str.equals(MAROON)) {
                    b2 = -1;
                } else {
                    b2 = 4;
                }
                break;
            case -909707666:
                if (!str.equals(SALMON)) {
                    b2 = -1;
                } else {
                    b2 = 5;
                }
                break;
            case 3181155:
                if (!str.equals(GRAY)) {
                    b2 = -1;
                } else {
                    b2 = 6;
                }
                break;
            case 3321813:
                if (!str.equals(LIME)) {
                    b2 = -1;
                } else {
                    b2 = 7;
                }
                break;
            case 3555932:
                if (!str.equals(TEAL)) {
                    b2 = -1;
                } else {
                    int i6 = b + 71;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
                    int i7 = i6 % 2;
                    b2 = 8;
                }
                break;
            case 93332111:
                if (!str.equals(AZURE)) {
                    b2 = -1;
                } else {
                    int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
                    b = i8 % 128;
                    int i9 = i8 % 2;
                    b2 = 9;
                }
                break;
            case 94848049:
                if (!str.equals(CORAL)) {
                    b2 = -1;
                } else {
                    int i10 = b + 5;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
                    b2 = i10 % 2 == 0 ? (byte) 10 : (byte) 66;
                }
                break;
            case 102011650:
                if (!str.equals(KHAKI)) {
                    b2 = -1;
                } else {
                    b2 = 11;
                }
                break;
            case 103901271:
                if (!str.equals(MINTY)) {
                    b2 = -1;
                } else {
                    b2 = 12;
                }
                break;
            case 105832923:
                if (!str.equals(OLIVE)) {
                    b2 = -1;
                } else {
                    b2 = 13;
                }
                break;
            case 1032605407:
                if (!(!str.equals(CRIMSON))) {
                    int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
                    b = i11 % 128;
                    int i12 = i11 % 2;
                    b2 = 14;
                } else {
                    b2 = -1;
                }
                break;
            case 1099507523:
                if (!str.equals(HOT_PINK)) {
                    b2 = -1;
                } else {
                    b2 = 15;
                }
                break;
            case 1186684798:
                if (!str.equals(AQUAMARINE)) {
                    b2 = -1;
                } else {
                    b2 = 16;
                }
                break;
            case 2117132560:
                if (!str.equals(NAVY_BLUE)) {
                    b2 = -1;
                } else {
                    int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 43;
                    b = i13 % 128;
                    int i14 = i13 % 2;
                    b2 = 17;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                context = this.context;
                i = R.color.green_forest_secondary;
                break;
            case 1:
                context = this.context;
                i = R.color.lavender_secondary;
                break;
            case 2:
                context = this.context;
                i = R.color.golden_secondary;
                break;
            case 3:
                context = this.context;
                i = R.color.indigo_secondary;
                break;
            case 4:
                context = this.context;
                i = R.color.maroon_secondary;
                break;
            case 5:
                context = this.context;
                i = R.color.salmon_secondary;
                break;
            case 6:
                context = this.context;
                i = R.color.gray_secondary;
                break;
            case 7:
                context = this.context;
                i = R.color.lime_secondary;
                break;
            case 8:
                context = this.context;
                i = R.color.teal_secondary;
                break;
            case 9:
                context = this.context;
                i = R.color.azure_secondary;
                break;
            case 10:
                context = this.context;
                i = R.color.coral_secondary;
                break;
            case 11:
                context = this.context;
                i = R.color.khaki_secondary;
                break;
            case 12:
                context = this.context;
                i = R.color.minty_secondary;
                break;
            case 13:
                context = this.context;
                i = R.color.olive_secondary;
                break;
            case 14:
                context = this.context;
                i = R.color.crimson_secondary;
                break;
            case 15:
                context = this.context;
                i = R.color.hot_pink_secondary;
                break;
            case 16:
                context = this.context;
                i = R.color.aquamarine_secondary;
                break;
            case 17:
                context = this.context;
                i = R.color.navy_blue_secondary;
                break;
            default:
                return 0;
        }
        return ContextCompat.getColor(context, i);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r5, int r6, byte r7) {
        /*
            byte[] r0 = com.midtrans.sdk.corekit.core.themes.ColorTheme.$$c
            int r6 = r6 * 4
            int r6 = 4 - r6
            int r5 = r5 + 119
            int r7 = r7 * 4
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = -1
            if (r0 != 0) goto L14
            r5 = r6
            r3 = r7
            goto L27
        L14:
            r4 = r6
            r6 = r5
            r5 = r4
        L17:
            int r2 = r2 + 1
            byte r3 = (byte) r6
            r1[r2] = r3
            if (r2 != r7) goto L25
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            return r5
        L25:
            r3 = r0[r5]
        L27:
            int r6 = r6 + r3
            int r5 = r5 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.sdk.corekit.core.themes.ColorTheme.$$g(int, int, byte):java.lang.String");
    }
}

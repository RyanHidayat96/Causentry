package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bpjstku.data.menu.model.response.AvailabilityMenuItem;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class setCurrentRunnable {
    private static short[] asInterface;
    public final List<AvailabilityMenuItem> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {12, -88, 33, 118};
    private static final int $$f = 102;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {65, -122, -65, 2, -6, -55, 71, -14, -6, -4, -52, Base64.padSymbol, -4, 12, -18, 8, -10, 13, -1, -70, 35, -47, 71, -12, 23, -11, 5, -2, 32, -13, 10, -12, 5, -2, -31, 16, 23, -13, -9, 8, 5, -47, 43, -18, 5, 5, -9, 8, 5, -19, 6, 4, -11, 4, 4, -8, -31, 36, -9, 5, -12, 18, -16, 12, -66};
    private static final int $$e = 34;
    private static final byte[] $$a = {5, 11, -122, -94, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55};
    private static final int $$b = 77;
    private static int g = 0;
    private static int asBinder = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -253037358;
    private static int b = -1934795522;
    private static int TuitionPaymentFragmentbindingInflater1 = -1798369326;
    private static byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {24, 2, 54, 57, -29, 84, 2, 43, 59, 48, -28, -25, 113, 6, -5, 64, 49, 48, 63, 12, 52, 15, 17, 15, 19, 0, 31, 26, 11, -30, 57, 22, 5, 18, -26, 0, 30, -28, 60, 53, 44, 7, 13, 84, 58, 4, 44, 2, 42, 14, 31, 12, 115, 49, 0, -20, 71, 52, 55, 50, 3, 43, 2, 28, -108, -97, -114, 96, -105, -117, -106, -119, -107, 68, -90, -97, -102, ByteCompanionObject.MIN_VALUE, -107, -106, 99, 30, 38, 79, 95, 84, 56, 59, -103, 87, 35, 75, 16, 99, 69, 43, 73, 30, 47, 91, 18, 69, 91, 60, 7, 113, 43, 53, 91, 40, 55, 47, 37};

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 3
            int r5 = r5 + 84
            int r6 = 92 - r6
            byte[] r0 = defpackage.setCurrentRunnable.$$a
            int r7 = r7 * 15
            int r1 = 53 - r7
            byte[] r1 = new byte[r1]
            int r7 = 52 - r7
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            int r6 = r6 + 1
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r6]
        L2a:
            int r5 = r5 + r4
            int r5 = r5 + (-11)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.setCurrentRunnable.a(short, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 13
            int r0 = r8 + 25
            int r6 = r6 * 21
            int r6 = 105 - r6
            int r7 = r7 * 24
            int r7 = 28 - r7
            byte[] r1 = defpackage.setCurrentRunnable.$$d
            byte[] r0 = new byte[r0]
            int r8 = r8 + 24
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L2f
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2f:
            int r7 = r7 + r6
            int r6 = r7 + 1
            int r7 = r3 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.setCurrentRunnable.d(int, byte, short, java.lang.Object[]):void");
    }

    public setCurrentRunnable(List<AvailabilityMenuItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = list;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0299  */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    public final boolean equals(Object obj) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 876;
            int i2 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 9;
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr2 = new Object[1];
            a(b2, (byte) (b2 | 89), bArr[28], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, pressedStateDuration, i2, -1650998592, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(Gravity.getAbsoluteGravity(0, 0) - 409096915, (-25) - (Process.myTid() >> 22), (short) ((ViewConfiguration.getEdgeSlop() >> 16) + 36), (byte) TextUtils.getOffsetAfter("", 0), View.MeasureSpec.getSize(0) - 2085070900, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c((ViewConfiguration.getScrollBarFadeDuration() >> 16) - 409096911, (-26) - MotionEvent.axisFromString(""), (short) (Color.rgb(0, 0, 0) + 16777231), (byte) KeyEvent.keyCodeFromString(""), (-2085070879) - TextUtils.lastIndexOf("", '0'), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
            int i3 = 877 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 10;
            byte b3 = $$a[7];
            byte b4 = b3;
            Object[] objArr5 = new Object[1];
            a(b4, (byte) (b4 | 52), b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMakeMeasureSpec, i3, pressedStateDuration2, 2012020043, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                int i4 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 875;
                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10;
                byte b5 = $$a[7];
                byte b6 = b5;
                Object[] objArr6 = new Object[1];
                a(b5, b6, b6, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, i4, scrollBarFadeDuration, 2012931276, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = ~iIdentityHashCode;
            int i6 = (~(788851312 | i5)) | (-1064102518) | (~(829161541 | i5));
            int i7 = (-1104533920) + (((~(iIdentityHashCode | (-553910337))) | i6) * 590) + (i6 * (-1180)) + (((~((-829161542) | i5)) | (~(i5 | (-788851313)))) * 590) + 821534707;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c((-409096915) - KeyEvent.keyCodeFromString(""), (-26) - TextUtils.lastIndexOf("", '0', 0, 0), (short) (41 - View.combineMeasuredStates(0, 0)), (byte) (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.lastIndexOf("", '0') - 2085070862, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c((-409096914) - TextUtils.lastIndexOf("", '0'), (-25) - (Process.myTid() >> 22), (short) ((-116) - TextUtils.indexOf((CharSequence) "", '0', 0)), (byte) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), Color.alpha(0) - 2085070837, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i10 = g + 73;
                    asBinder = i10 % 128;
                    int i11 = i10 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        int i12 = g + 9;
                        asBinder = i12 % 128;
                        int i13 = i12 % 2;
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            c((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 409096906, (-25) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (short) (73 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (byte) ((-1) - MotionEvent.axisFromString("")), (ViewConfiguration.getWindowTouchSlop() >> 8) - 2085070819, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c((ViewConfiguration.getScrollBarFadeDuration() >> 16) - 409096907, (-25) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (short) ((ViewConfiguration.getTouchSlop() >> 8) + 56), (byte) (KeyEvent.getMaxKeyCode() >> 16), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 2085070804, objArr11);
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 821534707};
                byte[] bArr2 = $$d;
                byte b7 = bArr2[18];
                byte b8 = (byte) (b7 + 1);
                byte b9 = (byte) (-b7);
                Object[] objArr13 = new Object[1];
                d(b8, b9, (byte) (b9 - 1), objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b10 = bArr2[18];
                byte b11 = (byte) (-b10);
                Object[] objArr14 = new Object[1];
                d(b11, (byte) (b11 - 1), (byte) (-b10), objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                        int i14 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 876;
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 10;
                        byte b12 = $$a[7];
                        byte b13 = b12;
                        Object[] objArr16 = new Object[1];
                        a(b12, b13, b13, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(bitsPerPixel, i14, touchSlop, 2012931276, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        c(ExpandableListView.getPackedPositionChild(0L) - 409096914, (ViewConfiguration.getTapTimeout() >> 16) - 25, (short) (36 - (ViewConfiguration.getTouchSlop() >> 8)), (byte) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getWindowTouchSlop() >> 8) - 2085070900, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        c((-409096910) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (ViewConfiguration.getDoubleTapTimeout() >> 16) - 25, (short) (ExpandableListView.getPackedPositionGroup(0L) + 15), (byte) View.MeasureSpec.getMode(0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 2085070878, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                            int i15 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 875;
                            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 11;
                            byte b14 = $$a[7];
                            byte b15 = b14;
                            Object[] objArr19 = new Object[1];
                            a(b15, (byte) (b15 | 52), b14, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(keyRepeatDelay, i15, iIndexOf, 2012020043, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char defaultSize = (char) View.getDefaultSize(0, 0);
                            int gidForName = Process.getGidForName("") + 877;
                            int i16 = 11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                            byte[] bArr3 = $$a;
                            byte b16 = bArr3[7];
                            Object[] objArr20 = new Object[1];
                            a(b16, (byte) (b16 | 89), bArr3[28], objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(defaultSize, gidForName, i16, -1650998592, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i17 = ((int[]) objArr[2])[0];
        int i18 = ((int[]) objArr[0])[0];
        if (i18 != i17) {
            throw new RuntimeException(String.valueOf(i18));
        }
        int i19 = g + 15;
        asBinder = i19 % 128;
        int i20 = i19 % 2;
        int i21 = ((int[]) objArr[1])[0];
        Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int i22 = ~(Process.myTid() | 174344210);
        int i23 = i21 + (((-228162096) | i22) * (-658)) + 661602036 + ((i22 | (-268270144)) * 658);
        int i24 = (i23 << 13) ^ i23;
        int i25 = i24 ^ (i24 >>> 17);
        ((int[]) objArr21[1])[0] = i25 ^ (i25 << 5);
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setCurrentRunnable)) {
            return false;
        }
        if (Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, ((setCurrentRunnable) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
            return true;
        }
        int i26 = asBinder;
        int i27 = i26 + 109;
        g = i27 % 128;
        int i28 = i27 % 2;
        int i29 = ((int[]) objArr21[1])[0];
        int i30 = i29 * i29;
        int i31 = -(1397939251 * i29);
        int i32 = (i30 & i31) + (i30 | i31);
        int i33 = -(i29 * 1232414517);
        int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
        int i35 = ((i34 | 77784720) << 1) - (77784720 ^ i34);
        int i36 = i35 >> 23;
        int i37 = ((i36 & (-1023)) + (i36 | (-1023))) / 512;
        int i38 = ((i37 | 1) << 1) - (i37 ^ 1);
        int i39 = ((i35 | i38) << 1) - (i38 ^ i35);
        int i40 = i35 >> 28;
        int i41 = (((i40 | (-31)) << 1) - (i40 ^ (-31))) / 16;
        int i42 = (-((((i41 | 1) << 1) - (i41 ^ 1)) ^ i39)) + 8;
        int i43 = i42 >> 28;
        int i44 = ((i43 & (-31)) + (i43 | (-31))) / 16;
        int i45 = ((i44 | 1) << 1) - (i44 ^ 1);
        ?? r11 = 0 / ((i42 & (-((i45 ^ 1) + ((i45 & 1) << 1)))) * 1730);
        int i46 = i26 + 99;
        g = i46 % 128;
        int i47 = i46 % 2;
        return r11;
    }

    private static void c(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4;
        boolean z2;
        int length;
        byte[] bArr;
        int i5;
        int i6 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(b)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                int scrollDefaultDelay = 2267 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int touchSlop = 33 - (ViewConfiguration.getTouchSlop() >> 8);
                byte length2 = (byte) $$c.length;
                byte b3 = (byte) (length2 - 4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, scrollDefaultDelay, touchSlop, 1387473586, false, $$g(length2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                z = true;
            } else {
                int i7 = $10 + 7;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                z = false;
            }
            if (z) {
                byte[] bArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (bArr2 != null) {
                    int length3 = bArr2.length;
                    byte[] bArr3 = new byte[length3];
                    for (int i9 = 0; i9 < length3; i9++) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i9])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.combineMeasuredStates(0, 0), (ViewConfiguration.getEdgeSlop() >> 16) + 3358, 18 - (KeyEvent.getMaxKeyCode() >> 16), -1054011043, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                        }
                        bArr3[i9] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    byte[] bArr4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                        int iBlue = Color.blue(0) + 2267;
                        int i10 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 32;
                        byte length4 = (byte) $$c.length;
                        byte b6 = (byte) (length4 - 4);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(offsetBefore, iBlue, i10, 1387473586, false, $$g(length4, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr4[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                } else {
                    iIntValue = (short) (((short) (((long) asInterface[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) b) ^ 3046761265686732006L)));
                }
            }
            if (iIntValue > 0) {
                int i11 = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 3046761265686732006L));
                if (z) {
                    int i12 = $11 + 19;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i11 + i4;
                try {
                    Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentbindingInflater1), sb};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b7 = (byte) 3;
                        byte b8 = (byte) (b7 - 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (55904 - ExpandableListView.getPackedPositionGroup(0L)), 2855 - (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.indexOf("", "", 0, 0) + 13, -1529949196, false, $$g(b7, b8, b8), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    byte[] bArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    if (bArr5 != null) {
                        int i14 = $10 + 119;
                        $11 = i14 % 128;
                        if (i14 % 2 == 0) {
                            length = bArr5.length;
                            bArr = new byte[length];
                            i5 = 1;
                        } else {
                            length = bArr5.length;
                            bArr = new byte[length];
                            i5 = 0;
                        }
                        while (i5 < length) {
                            int i15 = $10 + 9;
                            $11 = i15 % 128;
                            if (i15 % 2 == 0) {
                                bArr[i5] = (byte) (((long) bArr5[i5]) - 3046761265686732006L);
                                i5--;
                            } else {
                                bArr[i5] = (byte) (((long) bArr5[i5]) ^ 3046761265686732006L);
                                i5++;
                            }
                        }
                        bArr5 = bArr;
                    }
                    if (bArr5 != null) {
                        int i16 = $11 + 85;
                        $10 = i16 % 128;
                        int i17 = i16 % 2;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                    while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                        if (z2) {
                            byte[] bArr6 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i18 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i18 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i18]) ^ 3046761265686732006L)) + s)) ^ b2));
                        } else {
                            short[] sArr = asInterface;
                            int i19 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i19 - 1;
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i19]) ^ 3046761265686732006L)) + s)) ^ b2));
                        }
                        sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
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

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = g + 81;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        List<AvailabilityMenuItem> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (i3 != 0) {
            return list.hashCode();
        }
        list.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        List<AvailabilityMenuItem> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        StringBuilder sb = new StringBuilder("MenuAvailability(data=");
        sb.append(list);
        sb.append(")");
        String string = sb.toString();
        int i2 = g + 19;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return string;
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
    private static java.lang.String $$g(short r7, byte r8, short r9) {
        /*
            byte[] r0 = defpackage.setCurrentRunnable.$$c
            int r8 = r8 * 2
            int r8 = 4 - r8
            int r9 = r9 * 3
            int r9 = 1 - r9
            int r7 = 121 - r7
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            r6 = r8
            r8 = r7
            r7 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r8 = r8 + 1
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.setCurrentRunnable.$$g(short, byte, short):java.lang.String");
    }
}

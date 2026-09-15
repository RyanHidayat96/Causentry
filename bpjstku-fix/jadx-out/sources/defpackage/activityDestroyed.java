package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bpjstku.domain.jp.model.JpBenefitInformation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class activityDestroyed {
    public final JpBenefitInformation b;
    private static final byte[] $$c = {87, 51, -85, 78};
    private static final int $$f = 140;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {21, 65, -9, -121, -12, 2, 63, -52, -14, 6, -9, -1, 9, -10, 71, -54, 3, -19, 19, 51, -71, 2, 14, -13, 68, -63, -2, 11, -1, -7, 62, -68, 13, -12, -4, 16, -14, -1, 70, -39, -27, 12, 3, -19, 15, 33, -33, -17, 13, 6, -2, 17, -27, 4, 6, -9};
    private static final int $$e = 220;
    private static final byte[] $$a = {110, -73, -111, 99, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 66;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -83722298;

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 14
            int r6 = 98 - r6
            int r7 = r7 + 4
            int r5 = r5 * 52
            int r0 = 53 - r5
            byte[] r1 = defpackage.activityDestroyed.$$a
            byte[] r0 = new byte[r0]
            int r5 = 52 - r5
            r2 = 0
            if (r1 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L26:
            int r3 = r3 + 1
            r4 = r1[r7]
        L2a:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.activityDestroyed.a(byte, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.activityDestroyed.$$d
            int r7 = r7 * 52
            int r7 = 55 - r7
            int r6 = r6 * 52
            int r1 = 53 - r6
            int r8 = r8 + 98
            byte[] r1 = new byte[r1]
            int r6 = 52 - r6
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2e
        L17:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L1b:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r6) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            int r3 = r3 + 1
            r4 = r0[r8]
        L2e:
            int r4 = -r4
            int r7 = r7 + r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.activityDestroyed.d(byte, int, byte, java.lang.Object[]):void");
    }

    public activityDestroyed(JpBenefitInformation jpBenefitInformation) {
        Intrinsics.checkNotNullParameter(jpBenefitInformation, "");
        this.b = jpBenefitInformation;
    }

    public final int hashCode() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int iHashCode = this.b.hashCode();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (37566 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
            int i2 = 625 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int i3 = 15 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            byte[] bArr = $$a;
            byte b = bArr[5];
            Object[] objArr2 = new Object[1];
            a(b, bArr[7], (byte) (-b), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, i2, i3, -477065106, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(true, Color.rgb(0, 0, 0) + 16777479, 22 - (ViewConfiguration.getJumpTapTimeout() >> 16), KeyEvent.getDeadChar(0, 0) + 7, new char[]{1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(true, View.resolveSizeAndState(0, 0, 0) + 267, Color.blue(0) + 15, TextUtils.indexOf("", "") + 2, new char[]{5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c2 = (char) (37567 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
            int iResolveSize = View.resolveSize(0, 0) + 625;
            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 14;
            byte[] bArr2 = $$a;
            byte b2 = bArr2[7];
            byte b3 = bArr2[5];
            Object[] objArr5 = new Object[1];
            a(b2, b3, (byte) (-b3), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, iResolveSize, scrollBarFadeDuration, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = TuitionPaymentFragmentbindingInflater1 + 35;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char scrollBarFadeDuration2 = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 37567);
                int i6 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 624;
                int offsetAfter = 14 - TextUtils.getOffsetAfter("", 0);
                byte[] bArr3 = $$a;
                byte b4 = bArr3[7];
                byte b5 = bArr3[5];
                Object[] objArr6 = new Object[1];
                a(b4, b5, (byte) (b5 | 50), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollBarFadeDuration2, i6, offsetAfter, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i7 = ((int[]) objArr7[2])[0];
            int i8 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i7};
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i9 = ((((-1153470982) + ((~((-1646298341) | startElapsedRealtime)) * 623)) + (((~startElapsedRealtime) | 745490) * (-623))) + (((~(startElapsedRealtime | 89092635)) | ((~((-1734645486) | startElapsedRealtime)) | 1646298340)) * 623)) - 877853755;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[1])[0] = i11 ^ (i11 << 5);
            objArr = new Object[]{new int[]{i8}, new int[1], iArr, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            c(true, TextUtils.indexOf((CharSequence) "", '0', 0) + 264, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 25, 18 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), new char[]{17, 6, 19, 6, 17, 0, 65502, 65483, '\r', '\r', 65534, 65483, 1, 6, '\f', 15, 1, 11, 65534, 1, 65534, 2, 15, 5, 65521, 22}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(true, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 270, (ViewConfiguration.getLongPressTimeout() >> 16) + 18, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 7, new char[]{4, 65531, '\b', '\b', 11, 65529, 4, 5, 65535, '\n', 65527, 65529, 65535, 2, 6, 6, 65495, '\n'}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i12 = TuitionPaymentFragmentbindingInflater1 + 3;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i12 % 128;
                int i13 = i12 % 2;
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            c(false, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 262, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 17, 13 - View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17, 18, 3, 11, '\b', 65535, 20}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(true, 266 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 16 - ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getScrollBarSize() >> 8) + 14, new char[]{'\t', 65501, 2, '\r', 65531, 65506, 19, 14, 3, 14, '\b', 65535, 65534, 3, 65535, 65534}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            c(false, 237 - (ViewConfiguration.getPressedStateDuration() >> 16), 64 - KeyEvent.getDeadChar(0, 0), 25 - MotionEvent.axisFromString(""), new char[]{65519, 24, 29, 65516, 65515, 65519, 29, 28, 65514, 65516, 24, 65511, 65519, 24, 65515, 65519, 65513, 25, 65520, 65519, 65515, 25, 25, 29, 65513, 25, 65513, 28, 29, 24, 24, 25, 29, 65517, 65520, 29, 29, 65516, 28, 28, 24, 65516, 65518, 65512, 65517, 28, 65516, 65518, 65518, 25, 28, 65518, 25, 65512, 65514, 27, 65515, 65520, 65520, 24, 65513, 65520, 65512, 65512}, objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            c(false, 233 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 64 - Drawable.resolveOpacity(0, 0), ExpandableListView.getPackedPositionType(0L) + 4, new char[]{28, 65515, 65521, '!', 30, 28, 31, 65521, 65515, 65520, 29, 65522, ' ', '!', 65515, 29, ' ', 65517, '!', 65519, 65517, 65518, 65521, 65518, 65520, 65522, '!', 65521, 29, 65519, 29, 65524, 65518, 65524, 65524, 65523, 65524, 29, 65520, 65516, 65519, ' ', 28, 65517, 65517, ' ', '!', 65521, 65522, 65519, 65518, 65518, 65524, 30, 65524, 65524, 29, 65519, 65518, 65517, 30, '!', 65517, 65519}, objArr13);
            String[] strArr2 = {str, (String) objArr13[0]};
            int i14 = TuitionPaymentFragmentbindingInflater1 + 33;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i14 % 128;
            int i15 = i14 % 2;
            try {
                Object[] objArr14 = {applicationContext, strArr2, Integer.valueOf(iIntValue), 17, -877853755};
                byte[] bArr4 = $$d;
                byte b6 = bArr4[11];
                byte b7 = (byte) (b6 + 1);
                byte b8 = (byte) (-b6);
                Object[] objArr15 = new Object[1];
                d(b7, b8, b8, objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                byte b9 = (byte) (-bArr4[11]);
                byte b10 = (byte) (b9 - 1);
                Object[] objArr16 = new Object[1];
                d(b9, b10, b10, objArr16);
                Object[] objArr17 = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                int i16 = ((int[]) objArr17[0])[0];
                int i17 = ((int[]) objArr17[2])[0];
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cLastIndexOf = (char) (37566 - TextUtils.lastIndexOf("", '0', 0, 0));
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 625;
                        int capsMode = 14 - TextUtils.getCapsMode("", 0, 0);
                        byte[] bArr5 = $$a;
                        byte b11 = bArr5[7];
                        byte b12 = bArr5[5];
                        Object[] objArr18 = new Object[1];
                        a(b11, b12, (byte) (b12 | 50), objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf, tapTimeout, capsMode, -973632554, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr17);
                    try {
                        Object[] objArr19 = new Object[1];
                        c(true, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 262, (Process.myPid() >> 22) + 22, TextUtils.getOffsetAfter("", 0) + 7, new char[]{1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483}, objArr19);
                        Class<?> cls5 = Class.forName((String) objArr19[0]);
                        Object[] objArr20 = new Object[1];
                        c(true, (ViewConfiguration.getFadingEdgeLength() >> 16) + 267, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 15, 2 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530}, objArr20);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 37567);
                            int i18 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 624;
                            int maximumDrawingCacheSize = 14 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                            byte[] bArr6 = $$a;
                            byte b13 = bArr6[7];
                            byte b14 = bArr6[5];
                            Object[] objArr21 = new Object[1];
                            a(b13, b14, (byte) (-b14), objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetBefore, i18, maximumDrawingCacheSize, -976899241, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char packedPositionGroup = (char) (37567 - ExpandableListView.getPackedPositionGroup(0L));
                            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 625;
                            int i19 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 13;
                            byte[] bArr7 = $$a;
                            byte b15 = bArr7[5];
                            Object[] objArr22 = new Object[1];
                            a(b15, bArr7[7], (byte) (-b15), objArr22);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(packedPositionGroup, fadingEdgeLength, i19, -477065106, false, (String) objArr22[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr17;
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
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 == null) {
                throw null;
            }
            for (String str2 : strArr3) {
                arrayList.add(str2);
            }
            throw null;
        }
        int i20 = ((int[]) objArr[1])[0];
        int i21 = ((int[]) objArr[2])[0];
        int i22 = ((int[]) objArr[0])[0];
        String[] strArr4 = (String[]) objArr[3];
        int[] iArr2 = {i21};
        int iMyTid = Process.myTid();
        int i23 = ~iMyTid;
        int i24 = i20 + (((~((-1795412161) | i23)) | (~(1810889974 | iMyTid))) * 988) + 126883796 + (((~(iMyTid | (-1808260307))) | 12848146 | (~(i23 | 1810889974))) * 988);
        int i25 = (i24 << 13) ^ i24;
        int i26 = i25 ^ (i25 >>> 17);
        ((int[]) objArr[1])[0] = i26 ^ (i26 << 5);
        Object[] objArr23 = {new int[]{i22}, new int[1], iArr2, strArr4};
        return iHashCode;
    }

    private static void c(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
            int i5 = $11 + 13;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i7 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Drawable.resolveOpacity(0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3291, 31 - Color.argb(0, 0, 0, 0), 1199271174, false, $$g(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b3 = (byte) (-1);
                    byte b4 = (byte) (b3 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ExpandableListView.getPackedPositionType(0L), View.resolveSize(0, 0) + 651, 43 - TextUtils.indexOf((CharSequence) "", '0'), -450685997, false, $$g(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
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
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                int i8 = $10 + 13;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 << setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                    Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b5 = (byte) (-1);
                        byte b6 = (byte) (b5 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 651 - (ViewConfiguration.getTapTimeout() >> 16), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 44, -450685997, false, $$g(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                } else {
                    cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                    Object[] objArr5 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b7 = (byte) (-1);
                        byte b8 = (byte) (b7 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) Color.red(0), 651 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 44 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -450685997, false, $$g(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
                int i9 = $11 + 15;
                $10 = i9 % 128;
                int i10 = i9 % 2;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 31;
        int i3 = i2 % 128;
        TuitionPaymentFragmentbindingInflater1 = i3;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof activityDestroyed)) {
            int i4 = i3 + 13;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
            if (i6 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (Intrinsics.areEqual(this.b, ((activityDestroyed) obj).b)) {
            int i7 = TuitionPaymentFragmentbindingInflater1 + 21;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }
        int i9 = TuitionPaymentFragmentbindingInflater1 + 67;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        JpBenefitInformation jpBenefitInformation = this.b;
        StringBuilder sb = new StringBuilder("GetJpBenefitInformation(data=");
        sb.append(jpBenefitInformation);
        sb.append(")");
        String string = sb.toString();
        int i2 = TuitionPaymentFragmentbindingInflater1 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r7, short r8, short r9) {
        /*
            int r8 = r8 * 4
            int r8 = 1 - r8
            byte[] r0 = defpackage.activityDestroyed.$$c
            int r9 = 120 - r9
            int r7 = r7 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r9 = r7
            r3 = r8
            r5 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            int r7 = r7 + 1
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r6
        L28:
            int r7 = r7 + r3
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.activityDestroyed.$$g(int, short, short):java.lang.String");
    }
}

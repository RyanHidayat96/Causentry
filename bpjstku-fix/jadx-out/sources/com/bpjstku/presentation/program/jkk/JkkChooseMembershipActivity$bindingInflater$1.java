package com.bpjstku.presentation.program.jkk;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.bpjstku.databinding.ActivityJkkChooseMembershipBinding;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class JkkChooseMembershipActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityJkkChooseMembershipBinding> {
    private static long TuitionPaymentFragmentbindingInflater1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f600a;
    public static final JkkChooseMembershipActivity$bindingInflater$1 b;
    private static final byte[] $$c = {12, -88, 33, 118};
    private static final int $$f = 159;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {114, -59, 10, 31, -11, 1, -19, 18, -25, -32, 27, -29, -24, -6, -16, -7, 5, -12, 21, -40, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$e = 5;
    private static final byte[] $$a = {41, 2, 45, -60, 23, -37, 42, 11, -10, 18, -7, 0, 7, 7, 23, -44, 44, 10, -5, 6, 18};
    private static final int $$b = 165;
    private static int asBinder = 0;
    private static int d = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 10
            int r9 = r9 + 4
            int r8 = r8 * 3
            int r8 = 100 - r8
            int r7 = r7 + 1
            byte[] r0 = com.bpjstku.presentation.program.jkk.JkkChooseMembershipActivity$bindingInflater$1.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r8 = r9
            r4 = r2
            goto L2a
        L15:
            r3 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L19:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r8]
        L2a:
            int r9 = r9 + r3
            int r9 = r9 + (-5)
            int r8 = r8 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jkk.JkkChooseMembershipActivity$bindingInflater$1.c(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 27
            int r7 = r7 + 84
            byte[] r0 = com.bpjstku.presentation.program.jkk.JkkChooseMembershipActivity$bindingInflater$1.$$d
            int r6 = r6 * 16
            int r6 = 19 - r6
            int r5 = r5 * 21
            int r5 = 38 - r5
            byte[] r1 = new byte[r5]
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r5) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            int r6 = r6 + 1
            r4 = r0[r6]
        L2a:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-10)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jkk.JkkChooseMembershipActivity$bindingInflater$1.f(short, int, int, java.lang.Object[]):void");
    }

    private static void e(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        SessionProcessor sessionProcessor = new SessionProcessor();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        int i3 = $10 + 19;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8327 - ExpandableListView.getPackedPositionChild(0L)), TextUtils.indexOf((CharSequence) "", '0', 0) + 1236, 'S' - AndroidCharacter.getMirror('0'), -653973969, false, $$g(b2, b3, b3), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getTouchSlop() >> 8), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2764, 14 - KeyEvent.keyCodeFromString(""), 1504416861, false, $$g(b4, b5, (byte) (b5 - 2)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.indexOf("", "", 0) + 43325), 253 - (ViewConfiguration.getWindowTouchSlop() >> 8), 22 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65201 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 2891 - ExpandableListView.getPackedPositionGroup(0L), TextUtils.lastIndexOf("", '0', 0, 0) + 18, 2012627446, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentbindingInflater1 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                int i5 = $10 + 15;
                $11 = i5 % 128;
                int i6 = i5 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    public final ActivityJkkChooseMembershipBinding TuitionPaymentFragmentspecialinlinedviewModeldefault2(LayoutInflater layoutInflater) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 877;
            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 10;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c(bArr[17], (byte) ($$b & 3), bArr[11], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cCombineMeasuredStates, iIndexOf, iResolveOpacity, -1199417970, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{21804, 21650, 61095, 482}, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), ViewConfiguration.getMaximumDrawingCacheSize() >> 24, new char[]{55994, 64508, 55390, 15502, 25366, 54447, 14274, 60161, 55702, 55659, 54268, 23158, 38565, 64601, 16013, 33852, 33061, 50246, 38932, 53781, 4166, 6660}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{0, 0, 0, 0}, new char[]{10482, 35883, 62670, 992}, (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 57588), (-829674712) - View.getDefaultSize(0, 0), new char[]{8331, 15065, 20623, 44507, 43787, 52446, 28785, 15296, 36371, 7677, 12986, 24770, 61197, 39626, 26287}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 876;
            int defaultSize = View.getDefaultSize(0, 0) + 10;
            byte b2 = $$a[11];
            byte b3 = b2;
            Object[] objArr5 = new Object[1];
            c(b2, b3, (byte) (b3 + 1), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(packedPositionType, jumpTapTimeout, defaultSize, 254769921, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 877;
                int longPressTimeout2 = 10 - (ViewConfiguration.getLongPressTimeout() >> 16);
                byte b4 = $$a[12];
                byte b5 = (byte) (b4 >>> 2);
                Object[] objArr6 = new Object[1];
                c(b4, b5, b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(longPressTimeout, iLastIndexOf, longPressTimeout2, 1324201839, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int i2 = ~Process.myTid();
            int i3 = 1060688220 + ((~((-570475043) | i2)) * (-783)) + (((~(i2 | (-597284387))) | (-637594616)) * 783) + 1480543092;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
            int i6 = d + 43;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{47069, 2125, 51268, 59184}, (char) (View.MeasureSpec.getMode(0) + 12488), Process.getGidForName("") + 1, new char[]{15370, 1489, 55139, 27814, 6937, 42978, 22872, 26351, 50043, 34579, 11352, 12678, 10689, 46294, 48827, 60855}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{0, 0, 0, 0}, new char[]{26818, 64760, 16445, 52037}, (char) (17728 - View.combineMeasuredStates(0, 0)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, new char[]{28171, 9732, 30643, 52443, 7067, 37400, 51168, 48940, 59708, 25017, 31854, 12051, 62848, 11646, 55587, 47197}, objArr9);
            try {
                Object[] objArr10 = {Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 1480543092};
                byte[] bArr2 = $$d;
                byte b6 = bArr2[5];
                byte b7 = b6;
                Object[] objArr11 = new Object[1];
                f(b6, b7, b7, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b8 = bArr2[44];
                byte b9 = b8;
                Object[] objArr12 = new Object[1];
                f(b8, b9, b9, objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 876;
                    int iRgb = (-16777206) - Color.rgb(0, 0, 0);
                    byte b10 = $$a[12];
                    byte b11 = (byte) (b10 >>> 2);
                    Object[] objArr13 = new Object[1];
                    c(b10, b11, b11, objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cRgb, edgeSlop, iRgb, 1324201839, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{21804, 21650, 61095, 482}, (char) Color.red(0), ViewConfiguration.getMaximumDrawingCacheSize() >> 24, new char[]{55994, 64508, 55390, 15502, 25366, 54447, 14274, 60161, 55702, 55659, 54268, 23158, 38565, 64601, 16013, 33852, 33061, 50246, 38932, 53781, 4166, 6660}, objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, new char[]{10482, 35883, 62670, 992}, (char) (TextUtils.indexOf("", "", 0) + 57588), (ViewConfiguration.getKeyRepeatDelay() >> 16) - 829674712, new char[]{8331, 15065, 20623, 44507, 43787, 52446, 28785, 15296, 36371, 7677, 12986, 24770, 61197, 39626, 26287}, objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                        int maximumDrawingCacheSize = 876 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int scrollBarFadeDuration = 10 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        byte b12 = $$a[11];
                        byte b13 = b12;
                        Object[] objArr16 = new Object[1];
                        c(b12, b13, (byte) (b13 + 1), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, maximumDrawingCacheSize, scrollBarFadeDuration, 254769921, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int i8 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 876;
                        int packedPositionChild = 9 - ExpandableListView.getPackedPositionChild(0L);
                        byte[] bArr3 = $$a;
                        Object[] objArr17 = new Object[1];
                        c(bArr3[17], (byte) ($$b & 3), bArr3[11], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(keyRepeatDelay, i8, packedPositionChild, -1199417970, false, (String) objArr17[0], null);
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
        int i9 = ((int[]) objArr[2])[0];
        int i10 = ((int[]) objArr[0])[0];
        if (i10 == i9) {
            int i11 = asBinder + 67;
            d = i11 % 128;
            int i12 = i11 % 2;
            int i13 = ((int[]) objArr[1])[0];
            Object[] objArr18 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int i14 = ~(System.identityHashCode(this) | (-839304589));
            int i15 = i13 + ((((-913301486) | i14) * (-196)) - 196644520) + ((i14 | 73996897) * 196);
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr18[1])[0] = i17 ^ (i17 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr != null) {
                for (String str : strArr) {
                    int i18 = d + 1;
                    asBinder = i18 % 128;
                    int i19 = i18 % 2;
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i10];
            int i20 = i10 - 1;
            iArr[i20] = 1;
            Toast.makeText((Context) null, iArr[((i10 * i20) % 2) - 1], 1).show();
            int i21 = ((int[]) objArr[1])[0];
            Object[] objArr19 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int i22 = (~((int) Runtime.getRuntime().freeMemory())) | 99447625;
            int i23 = i21 + 2065582172 + (i22 * 495) + (((~i22) | 73998857) * 495);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr19[1])[0] = i25 ^ (i25 << 5);
            int i26 = asBinder + 51;
            d = i26 % 128;
            int i27 = i26 % 2;
        }
        return ActivityJkkChooseMembershipBinding.inflate(layoutInflater);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ ActivityJkkChooseMembershipBinding invoke(LayoutInflater layoutInflater) throws Throwable {
        int i = 2 % 2;
        int i2 = d + 115;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ActivityJkkChooseMembershipBinding activityJkkChooseMembershipBindingTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(layoutInflater);
        int i4 = asBinder + 113;
        d = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 55 / 0;
        }
        return activityJkkChooseMembershipBindingTuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    static {
        f600a = 1;
        TuitionPaymentFragmentbindingInflater1();
        b = new JkkChooseMembershipActivity$bindingInflater$1();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
        f600a = i % 128;
        if (i % 2 == 0) {
            int i2 = 45 / 0;
        }
    }

    JkkChooseMembershipActivity$bindingInflater$1() {
        super(1, ActivityJkkChooseMembershipBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityJkkChooseMembershipBinding;", 0);
    }

    static void TuitionPaymentFragmentbindingInflater1() {
        TuitionPaymentFragmentbindingInflater1 = -6377398940819159759L;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -981105359;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (char) 55303;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, int r7, short r8) {
        /*
            byte[] r0 = com.bpjstku.presentation.program.jkk.JkkChooseMembershipActivity$bindingInflater$1.$$c
            int r6 = r6 * 3
            int r6 = r6 + 1
            int r7 = r7 + 102
            int r8 = r8 * 2
            int r8 = 4 - r8
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L29
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L29:
            int r7 = -r7
            int r7 = r7 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jkk.JkkChooseMembershipActivity$bindingInflater$1.$$g(short, int, short):java.lang.String");
    }
}

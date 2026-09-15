package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class RightSheetDelegate extends SheetDelegate {
    private static int $10 = 0;
    private static int $11 = 1;
    final SideSheetBehavior<? extends View> sheetBehavior;
    private static final byte[] $$d = {115, 98, 19, 9, -11, 3, 64, -68, 3, -3, 21, -16, 14, -15, 6, 67, -64, 5, 4, -11, 1, 5, 67, -58, -4, -5, 16, -12, 5, 14, -10, 63, -57, -11, 1, 5, 67, -25, -43, 1, 5, 44, -40, 8, -1, -4, 10, 66, -13, -32, 13, -10, 12, -5, 2, 31, -16, -23, 13, 9, -8, -5, 47, -43, 18, -5, -5, 9, -8, -5, 2, 4, 12, 3, -5, 9, -10, 4, -4, 3, 4, -4, 10, 2, -17, 14, 5, -17, 43, -33, 12, 0, -6, 9, 0, 0, 6, -19, 10, -7, 68};
    private static final int $$e = 81;
    private static final byte[] $$a = {41, 2, 45, -60, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 151;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static long TuitionPaymentFragmentbindingInflater1 = 5138822581434368999L;

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 52
            int r7 = r7 + 4
            int r6 = r6 * 4
            int r6 = r6 + 84
            byte[] r0 = com.google.android.material.sidesheet.RightSheetDelegate.$$a
            int r8 = r8 * 15
            int r1 = r8 + 38
            byte[] r1 = new byte[r1]
            int r8 = r8 + 37
            r2 = 0
            if (r0 != 0) goto L19
            r6 = r7
            r3 = r8
            r4 = r2
            goto L31
        L19:
            r3 = r2
        L1a:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L2c
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2c:
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L31:
            int r7 = r7 + 1
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.RightSheetDelegate.a(short, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 15
            int r9 = 99 - r9
            byte[] r0 = com.google.android.material.sidesheet.RightSheetDelegate.$$d
            int r7 = r7 * 45
            int r7 = 48 - r7
            int r8 = r8 * 7
            int r8 = 53 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r9 = r7
            r3 = r8
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r7 = r7 + 1
            if (r4 != r8) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L29:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r6
        L2e:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + 1
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.RightSheetDelegate.c(short, int, int, java.lang.Object[]):void");
    }

    RightSheetDelegate(SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.sheetBehavior = sideSheetBehavior;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    final int getHiddenOffset() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        int parentWidth = this.sheetBehavior.getParentWidth();
        if (i3 == 0) {
            int i4 = 18 / 0;
        }
        return parentWidth;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x021d  */
    /* JADX WARN: Code duplicated, block: B:27:0x021f  */
    @Override // com.google.android.material.sidesheet.SheetDelegate
    final int getExpandedOffset() throws Throwable {
        Object[] objArr;
        char c;
        Object[] objArr2;
        char c2;
        int i = 2 % 2;
        int hiddenOffset = getHiddenOffset();
        int childWidth = this.sheetBehavior.getChildWidth();
        int innerMargin = this.sheetBehavior.getInnerMargin();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int iIndexOf = 2267 - TextUtils.indexOf("", "");
            int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 34;
            byte[] bArr = $$a;
            byte b = bArr[7];
            Object[] objArr3 = new Object[1];
            a(b, b, bArr[132], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumFlingVelocity, iIndexOf, iIndexOf2, -887667012, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        b(new char[]{27293, 17045, 14998, 4763, 51855, 41654, 39602, 29411, 10923, 688, 64148, 53986, 35537, 25300, 23274, 13040, 60129, 49864, 47854, 37398, 18963, 8708}, 10247 - View.getDefaultSize(0, 0), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        b(new char[]{27289, 43821, 59879, 12219, 27771, 41512, 57590, 9861, 26481, 42296, 64498, 14743, 32329, 48136, 62159}, ImageFormat.getBitsPerPixel(0) + 49598, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
            int iCombineMeasuredStates = 2267 - View.combineMeasuredStates(0, 0);
            int iLastIndexOf = 32 - TextUtils.lastIndexOf("", '0', 0);
            byte[] bArr2 = $$a;
            byte b2 = bArr2[7];
            byte b3 = bArr2[132];
            Object[] objArr6 = new Object[1];
            a(b2, b3, b3, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cKeyCodeFromString, iCombineMeasuredStates, iLastIndexOf, -874156483, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c3 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                int tapTimeout = 2267 - (ViewConfiguration.getTapTimeout() >> 16);
                int i4 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 32;
                byte[] bArr3 = $$a;
                byte b4 = bArr3[7];
                Object[] objArr7 = new Object[1];
                a(b4, bArr3[1], b4, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c3, tapTimeout, i4, -654680577, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i5 = ((int[]) objArr8[0])[0];
            int i6 = ((int[]) objArr8[3])[0];
            String[] strArr = (String[]) objArr8[1];
            int iMyTid = Process.myTid();
            int i7 = (((-878671592) + (((~((~iMyTid) | 937377070)) | 2113728) * 529)) + (((~(iMyTid | 937377070)) | 128663754) * 529)) - 1147674914;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[2])[0] = i9 ^ (i9 << 5);
            c = 3;
        } else {
            Object[] objArr9 = new Object[1];
            b(new char[]{27293, 14799, 52258, 37017, 10215, 51780, 40630, 11609, 61557, 33993, 11054, 65069, 33505, 20774, 58782, 35046, 24410, 58296, 46594, 17762, 59884, 48181, 17264, 6082, 47653, 20109}, 21341 - Color.alpha(0), objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            b(new char[]{27295, 17590, 14064, 57395, 53861, 36265, 32754, 10500, 7028, 51899, 42214, 38432, 16491, 13230, 60922, 57124, 35171, 30909}, 11839 - KeyEvent.keyCodeFromString(""), objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 59;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i11 = 53 / 0;
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                        } else {
                            applicationContext = null;
                        }
                    } else if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr11 = new Object[1];
            b(new char[]{27286, 1124, 46968, 9846, 53558, 16461, 62283, 25181, 7507, 35859, 16149, 44598, 22819, 51245, 31495, 59910}, Drawable.resolveOpacity(0, 0) + 28409, objArr11);
            Class<?> cls3 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            b(new char[]{27285, 62573, 22387, 46669, 4444, 28764, 54070, 12854, 40220, 64512, 24349, 48659, 6595, 30946, 56318, 15042}, 40693 - KeyEvent.getDeadChar(0, 0), objArr12);
            try {
                Object[] objArr13 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue()), 0, -1147674914};
                byte[] bArr4 = $$d;
                byte b5 = bArr4[20];
                Object[] objArr14 = new Object[1];
                c(b5, b5, bArr4[91], objArr14);
                Class<?> cls4 = Class.forName((String) objArr14[0]);
                byte b6 = bArr4[91];
                Object[] objArr15 = new Object[1];
                c(b6, b6, bArr4[20], objArr15);
                objArr = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c4 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                        int offsetBefore = 2267 - TextUtils.getOffsetBefore("", 0);
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 33;
                        byte[] bArr5 = $$a;
                        byte b7 = bArr5[7];
                        Object[] objArr16 = new Object[1];
                        a(b7, bArr5[1], b7, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c4, offsetBefore, iResolveSizeAndState, -654680577, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr17 = new Object[1];
                        b(new char[]{27293, 17045, 14998, 4763, 51855, 41654, 39602, 29411, 10923, 688, 64148, 53986, 35537, 25300, 23274, 13040, 60129, 49864, 47854, 37398, 18963, 8708}, 10248 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        b(new char[]{27289, 43821, 59879, 12219, 27771, 41512, 57590, 9861, 26481, 42296, 64498, 14743, 32329, 48136, 62159}, TextUtils.indexOf((CharSequence) "", '0', 0) + 49598, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 2267;
                            int gidForName = Process.getGidForName("") + 34;
                            byte[] bArr6 = $$a;
                            byte b8 = bArr6[7];
                            byte b9 = bArr6[132];
                            Object[] objArr19 = new Object[1];
                            a(b8, b9, b9, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cNormalizeMetaState, packedPositionType, gidForName, -874156483, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
                            int threadPriority = 2267 - ((Process.getThreadPriority(0) + 20) >> 6);
                            int iAlpha = Color.alpha(0) + 33;
                            byte[] bArr7 = $$a;
                            byte b10 = bArr7[7];
                            Object[] objArr20 = new Object[1];
                            a(b10, b10, bArr7[132], objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cAxisFromString, threadPriority, iAlpha, -887667012, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                c = 3;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i12 = ((int[]) objArr[c])[0];
        int i13 = ((int[]) objArr[0])[0];
        if (i13 == i12) {
            objArr2 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i14 = ((int[]) objArr[2])[0];
            int i15 = ((int[]) objArr[0])[0];
            int i16 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[1];
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i17 = ~startUptimeMillis;
            int i18 = i14 + 1145905158 + (((~(i17 | (-160660340))) | 969373655) * (-1042)) + (((-160660340) | startUptimeMillis) * 521) + (((~(startUptimeMillis | (-969373656))) | 809763972 | (~(i17 | (-1050657)))) * 521);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr2[2])[0] = i20 ^ (i20 << 5);
            c2 = 2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[1];
            if (strArr3 != null) {
                int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 53;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i21 % 128;
                int i22 = 2;
                int i23 = i21 % 2;
                int i24 = 0;
                while (i24 < strArr3.length) {
                    int i25 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 41;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i25 % 128;
                    if (i25 % i22 != 0) {
                        arrayList.add(strArr3[i24]);
                        i24 += 36;
                    } else {
                        arrayList.add(strArr3[i24]);
                        i24++;
                    }
                    i22 = 2;
                }
            }
            int[] iArr = new int[i13];
            int i26 = i13 - 1;
            iArr[i26] = 1;
            Toast.makeText((Context) null, iArr[((i13 * i26) % 2) - 1], 1).show();
            objArr2 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i27 = ((int[]) objArr[2])[0];
            int i28 = ((int[]) objArr[0])[0];
            int i29 = ((int[]) objArr[3])[0];
            String[] strArr4 = (String[]) objArr[1];
            int iIdentityHashCode = System.identityHashCode(this);
            int i30 = i27 + 1487249287 + ((~((~iIdentityHashCode) | 799012699)) * (-116)) + ((245306714 | iIdentityHashCode) * 116) + (((~(iIdentityHashCode | (-563406602))) | 9700616) * 116);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            c2 = 2;
            ((int[]) objArr2[2])[0] = i32 ^ (i32 << 5);
        }
        int i33 = ((int[]) objArr2[c2])[0];
        int i34 = i33 * i33;
        int i35 = -(759451940 * i33);
        int i36 = (i34 & i35) + (i34 | i35);
        int i37 = -(i33 * 57724188);
        int i38 = (((i36 | i37) << 1) - (i37 ^ i36)) - 226180096;
        int i39 = (((i38 >> 22) - 2047) / 1024) + 1;
        int i40 = (i38 & i39) + (i39 | i38);
        int i41 = ((i38 >> 16) - 131071) / 65536;
        int i42 = -(i40 ^ ((i41 ^ 1) + ((i41 & 1) << 1)));
        int i43 = (i42 ^ 4) + ((i42 & 4) << 1);
        int i44 = i43 >> 20;
        int i45 = ((i44 & (-8191)) + (i44 | (-8191))) / 4096;
        return Math.max(0 / (((-(((i45 & 1) + (i45 | 1)) + 1)) & i43) * 1231), (hiddenOffset - childWidth) - innerMargin);
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - ((Process.getThreadPriority(0) + 20) >> 6)), 2624 - (ViewConfiguration.getTouchSlop() >> 8), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentbindingInflater1 ^ 9053247990562531611L);
                try {
                    Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39423 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), ImageFormat.getBitsPerPixel(0) + 482, 37 - KeyEvent.normalizeMetaState(0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i4 = $10 + 87;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (View.getDefaultSize(0, 0) + 39422), ((byte) KeyEvent.getModifierMetaStateMask()) + 482, 38 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                int i5 = 75 / 0;
            } else {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.resolveSize(0, 0) + 39422), 481 - View.resolveSize(0, 0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 36, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
        }
        objArr[0] = new String(cArr2);
        int i6 = $10 + 81;
        $11 = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    final boolean isReleasedCloseToInnerEdge(View view) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        int left = view.getLeft();
        if (i3 != 0) {
            if (left > (getHiddenOffset() / getExpandedOffset()) - 5) {
                return true;
            }
        } else if (left > (getHiddenOffset() + getExpandedOffset()) / 2) {
            return true;
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    final boolean isSwipeSignificant(float f, float f2) {
        int i = 2 % 2;
        if (SheetUtils.isSwipeMostlyHorizontal(f, f2)) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 15;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            float fAbs = Math.abs(f);
            if (i3 != 0) {
                int i4 = 3 / 0;
                if (fAbs > this.sheetBehavior.getSignificantVelocityThreshold()) {
                    return true;
                }
            } else if (fAbs > this.sheetBehavior.getSignificantVelocityThreshold()) {
                return true;
            }
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    final boolean shouldHide(View view, float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            if (Math.abs(view.getRight() * (f - this.sheetBehavior.getHideFriction())) <= this.sheetBehavior.getHideThreshold()) {
                return false;
            }
        } else if (Math.abs(view.getRight() + (f * this.sheetBehavior.getHideFriction())) <= this.sheetBehavior.getHideThreshold()) {
            return false;
        }
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    final <V extends View> int getOuterEdge(V v) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        int left = v.getLeft();
        int innerMargin = i3 == 0 ? left % this.sheetBehavior.getInnerMargin() : left - this.sheetBehavior.getInnerMargin();
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return innerMargin;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    final float calculateSlideOffset(int i) {
        float f;
        float expandedOffset;
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        if (i3 % 2 == 0) {
            float hiddenOffset = getHiddenOffset();
            f = i * hiddenOffset;
            expandedOffset = hiddenOffset / getExpandedOffset();
        } else {
            float hiddenOffset2 = getHiddenOffset();
            f = hiddenOffset2 - i;
            expandedOffset = hiddenOffset2 - getExpandedOffset();
        }
        float f2 = f / expandedOffset;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return f2;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    final void updateCoplanarSiblingLayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        int parentWidth;
        int i3 = 2 % 2;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 103;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        if (i4 % 2 != 0) {
            parentWidth = this.sheetBehavior.getParentWidth();
            int i5 = 47 / 0;
            if (i > parentWidth) {
                return;
            }
        } else {
            parentWidth = this.sheetBehavior.getParentWidth();
            if (i > parentWidth) {
                return;
            }
        }
        marginLayoutParams.rightMargin = parentWidth - i;
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 35;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    final void updateCoplanarSiblingAdjacentMargin(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        int i2 = 2 % 2;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        marginLayoutParams.rightMargin = i;
        if (i4 == 0) {
            throw null;
        }
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    final int getCoplanarSiblingAdjacentMargin(ViewGroup.MarginLayoutParams marginLayoutParams) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 79;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = marginLayoutParams.rightMargin;
        if (i3 == 0) {
            int i5 = 50 / 0;
        }
        int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
        int i7 = i6 % 2;
        return i4;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public final int getParentInnerEdge(CoordinatorLayout coordinatorLayout) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        int right = coordinatorLayout.getRight();
        if (i3 != 0) {
            int i4 = 3 / 0;
        }
        return right;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    final int calculateInnerMargin(ViewGroup.MarginLayoutParams marginLayoutParams) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 101;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = marginLayoutParams.rightMargin;
        int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    final int getMinViewPositionHorizontal() throws Throwable {
        int expandedOffset;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 23;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            expandedOffset = getExpandedOffset();
            int i3 = 53 / 0;
        } else {
            expandedOffset = getExpandedOffset();
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
        int i5 = i4 % 2;
        return expandedOffset;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    final int getMaxViewPositionHorizontal() {
        int parentWidth;
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        if (i2 % 2 != 0) {
            parentWidth = this.sheetBehavior.getParentWidth();
            int i3 = 18 / 0;
        } else {
            parentWidth = this.sheetBehavior.getParentWidth();
        }
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return parentWidth;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    final int getSheetEdge() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 101;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 115;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    final boolean isExpandingOutwards(float f) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 27;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3 % 128;
        int i4 = i3 % 2;
        if (f >= 0.0f) {
            return false;
        }
        int i5 = i2 + 95;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        throw null;
    }
}

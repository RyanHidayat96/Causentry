package com.google.android.material.transition.platform;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.deInitSession;
import defpackage.initSession;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes6.dex */
class FitModeEvaluators {
    private static final FitModeEvaluator WIDTH = new FitModeEvaluator() { // from class: com.google.android.material.transition.platform.FitModeEvaluators.1
        private static final byte[] $$c = {58, -103, 118, 14};
        private static final int $$f = 182;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {19, 78, 114, 113, 13, -1, -62, 53, 15, -5, 10, 2, -8, 11, -70, 67, 3, -12, 15, -13, 10, 7, -18, 20, -10, 7, 0, -63, 70, -15, 6, 8, -2, -10, 18, 2, -10, 2, 8, -65, 54, 13, 0, -7, 4, 10, -4, -62, 38, 17, 6, 8, -2, -10, 18, -46, 45, 0, -7, 4, 10, -4, -43, 35, 18, -10, 14, -12, 12, 6, -84, 80, -2, -10, -1, 7, -7, 12, -71, 1, 70, 6, -1, -2, 6, -8, 0, -63, 83, -12, -3, 19, -41, 35, -10, 2, 8, -71, 65, 2, 2, -4, 21, -8, 9, -79, 14, 34, -11, 12, -10, 7, 0, -29, 18, 25, -11, -7, 10, 7, -45, 45, -16, 7, 7, -7, 10, 7, 0, -2, -10, -1, 7, -7, 12, -2, 6, -1, -2, 6, -8, 0, 19, -12, -3, 19, -41, 35, -10, 2, 8, -7, 2, 2, -4, 21, -8, 9, -64};
        private static final int $$e = 179;
        private static final byte[] $$a = {22, 102, 43, -6, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
        private static final int $$b = 105;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        private static char[] b = {60054, 60034, 59746, 60051, 59749, 60061, 60062, 59744, 60058, 60040, 60063, 60059, 59748, 60050, 59747, 60041, 60055, 60043, 60060, 60057, 60056, 60053, 60073, 59745, 60072, 60079, 60088, 60045, 60083, 60047, 60052, 60090, 60049, 60117, 60046, 60048};
        private static char TuitionPaymentFragmentbindingInflater1 = 57191;

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(short r6, int r7, int r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 * 15
                int r0 = 53 - r7
                byte[] r1 = com.google.android.material.transition.platform.FitModeEvaluators.AnonymousClass1.$$a
                int r6 = 92 - r6
                int r8 = r8 * 3
                int r8 = r8 + 84
                byte[] r0 = new byte[r0]
                int r7 = 52 - r7
                r2 = 0
                if (r1 != 0) goto L17
                r4 = r8
                r3 = r2
                r8 = r6
                goto L2e
            L17:
                r3 = r2
            L18:
                int r6 = r6 + 1
                byte r4 = (byte) r8
                r0[r3] = r4
                if (r3 != r7) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L27:
                int r3 = r3 + 1
                r4 = r1[r6]
                r5 = r8
                r8 = r6
                r6 = r5
            L2e:
                int r4 = -r4
                int r6 = r6 + r4
                int r6 = r6 + (-11)
                r5 = r8
                r8 = r6
                r6 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transition.platform.FitModeEvaluators.AnonymousClass1.a(short, int, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(int r6, int r7, byte r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 * 51
                int r0 = 104 - r7
                int r6 = r6 * 15
                int r6 = r6 + 84
                byte[] r1 = com.google.android.material.transition.platform.FitModeEvaluators.AnonymousClass1.$$d
                int r8 = r8 + 4
                byte[] r0 = new byte[r0]
                int r7 = 103 - r7
                r2 = 0
                if (r1 != 0) goto L16
                r3 = r8
                r4 = r2
                goto L2e
            L16:
                r3 = r2
            L17:
                int r8 = r8 + 1
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r7) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L26:
                r4 = r1[r8]
                int r3 = r3 + 1
                r5 = r3
                r3 = r8
                r8 = r4
                r4 = r5
            L2e:
                int r6 = r6 + r8
                int r6 = r6 + (-1)
                r8 = r3
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transition.platform.FitModeEvaluators.AnonymousClass1.d(int, int, byte, java.lang.Object[]):void");
        }

        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public FitModeResult evaluate(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            int i = 2 % 2;
            float fLerp = TransitionUtils.lerp(f4, f6, f2, f3, f, true);
            float f8 = fLerp / f4;
            float f9 = fLerp / f6;
            FitModeResult fitModeResult = new FitModeResult(f8, f9, fLerp, f5 * f8, fLerp, f7 * f9);
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
            if (i2 % 2 == 0) {
                return fitModeResult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x022c  */
        /* JADX WARN: Type inference failed for: r1v26, types: [boolean, int] */
        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public boolean shouldMaskStartBounds(FitModeResult fitModeResult) throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int iGreen = 876 - Color.green(0);
                int mode = 10 - View.MeasureSpec.getMode(0);
                byte[] bArr = $$a;
                Object[] objArr2 = new Object[1];
                a((byte) 89, bArr[5], bArr[7], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(minimumFlingVelocity, iGreen, mode, -1650998592, false, (String) objArr2[0], null);
            }
            Object obj = null;
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(new char[]{'\t', 20, '\t', 16, 31, '\f', '\t', Typography.quote, '!', 6, 30, 27, 3, 7, 24, 11, 2, 24, '\f', Typography.quote, 23, ' '}, (byte) (46 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new char[]{'\n', '\f', 11, 14, '\n', 7, 16, 28, 7, '\t', 17, 28, '\f', 1, 13922}, (byte) ((-16777117) - Color.rgb(0, 0, 0)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int deadChar = 876 - KeyEvent.getDeadChar(0, 0);
                int iAxisFromString = MotionEvent.axisFromString("") + 11;
                byte b2 = (byte) ($$b >>> 1);
                byte b3 = $$a[7];
                Object[] objArr5 = new Object[1];
                a(b2, b3, b3, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(keyRepeatTimeout, deadChar, iAxisFromString, 2012020043, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char minimumFlingVelocity2 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int defaultSize = 876 - View.getDefaultSize(0, 0);
                    int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 10;
                    byte b4 = $$a[7];
                    byte b5 = b4;
                    Object[] objArr6 = new Object[1];
                    a(b4, b5, b5, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(minimumFlingVelocity2, defaultSize, iIndexOf, 2012931276, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                int i2 = (int) Runtime.getRuntime().totalMemory();
                int i3 = ~i2;
                int i4 = ((((-1342803500) + ((394264319 | i2) * (-676))) + (((~(393988714 | i3)) | (-394264320)) * 676)) + (((~(i2 | (-275606))) | ((~(i3 | 353678485)) | 40585834)) * 676)) - 1905777118;
                int i5 = (i4 << 13) ^ i4;
                int i6 = i5 ^ (i5 >>> 17);
                ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
                int i7 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7 % 128;
                int i8 = i7 % 2;
            } else {
                Object[] objArr8 = new Object[1];
                c(new char[]{'\t', 20, '\t', 16, 31, '\f', '\t', Typography.quote, 11, 14, 15, '#', ' ', 19, 25, 17, 25, 15, 25, 5, 27, 1, '\f', '\t', '\t', 11}, (byte) (98 - TextUtils.indexOf((CharSequence) "", '0', 0)), TextUtils.indexOf("", "", 0, 0) + 26, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(new char[]{22, ' ', 13884, 13884, '\t', 18, 25, '#', 13886, 13886, 17, 14, 26, 14, 25, 17, '!', 18}, (byte) (84 - View.MeasureSpec.makeMeasureSpec(0, 0)), 18 - Gravity.getAbsoluteGravity(0, 0), objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    if (applicationContext instanceof ContextWrapper) {
                        int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i9 % 128;
                        if (i9 % 2 != 0) {
                            ((ContextWrapper) applicationContext).getBaseContext();
                            obj.hashCode();
                            throw null;
                        }
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                        } else {
                            applicationContext = null;
                        }
                    } else {
                        applicationContext = applicationContext.getApplicationContext();
                    }
                }
                Object[] objArr10 = new Object[1];
                c(new char[]{2, 14, 26, '\t', Typography.quote, 15, '\t', 20, 21, 30, 25, 0, 11, 27, '\f', 6}, (byte) (71 - (ViewConfiguration.getTapTimeout() >> 16)), ((Process.getThreadPriority(0) + 20) >> 6) + 16, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                c(new char[]{16, 7, '\t', 18, 25, 17, 25, 5, 26, '\n', 15, '\t', 24, ' ', 11, 7}, (byte) (TextUtils.indexOf((CharSequence) "", '0') + 61), TextUtils.lastIndexOf("", '0', 0) + 17, objArr11);
                int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 47;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10 % 128;
                int i11 = i10 % 2;
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -1905777118};
                    byte[] bArr2 = $$d;
                    Object[] objArr13 = new Object[1];
                    d(bArr2[79], bArr2[26], bArr2[5], objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    Object[] objArr14 = new Object[1];
                    d(bArr2[26], bArr2[79], (byte) 102, objArr14);
                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    if (applicationContext != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                            int bitsPerPixel = 875 - ImageFormat.getBitsPerPixel(0);
                            int minimumFlingVelocity3 = 10 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            byte b6 = $$a[7];
                            byte b7 = b6;
                            Object[] objArr16 = new Object[1];
                            a(b6, b7, b7, objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMakeMeasureSpec, bitsPerPixel, minimumFlingVelocity3, 2012931276, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                        try {
                            Object[] objArr17 = new Object[1];
                            c(new char[]{'\t', 20, '\t', 16, 31, '\f', '\t', Typography.quote, '!', 6, 30, 27, 3, 7, 24, 11, 2, 24, '\f', Typography.quote, 23, ' '}, (byte) (46 - Drawable.resolveOpacity(0, 0)), 23 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr17);
                            Class<?> cls5 = Class.forName((String) objArr17[0]);
                            Object[] objArr18 = new Object[1];
                            c(new char[]{'\n', '\f', 11, 14, '\n', 7, 16, 28, 7, '\t', 17, 28, '\f', 1, 13922}, (byte) ((-16777117) - Color.rgb(0, 0, 0)), View.MeasureSpec.getMode(0) + 15, objArr18);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                                int trimmedLength = 876 - TextUtils.getTrimmedLength("");
                                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 10;
                                byte b8 = (byte) ($$b >>> 1);
                                byte b9 = $$a[7];
                                Object[] objArr19 = new Object[1];
                                a(b8, b9, b9, objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, trimmedLength, longPressTimeout, 2012020043, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                                int i12 = 876 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                int bitsPerPixel2 = 9 - ImageFormat.getBitsPerPixel(0);
                                byte[] bArr3 = $$a;
                                Object[] objArr20 = new Object[1];
                                a((byte) 89, bArr3[5], bArr3[7], objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(offsetAfter, i12, bitsPerPixel2, -1650998592, false, (String) objArr20[0], null);
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
            int i13 = ((int[]) objArr[2])[0];
            int i14 = ((int[]) objArr[0])[0];
            if (i14 != i13) {
                throw new RuntimeException(String.valueOf(i14));
            }
            int i15 = ((int[]) objArr[1])[0];
            Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i16 = ~((-520671401) | iIdentityHashCode);
            int i17 = ~iIdentityHashCode;
            int i18 = i15 + (-1264344140) + ((i16 | (~((-480361172) | i17))) * (-1808)) + (((~((-50872361) | iIdentityHashCode)) | (~(i17 | (-10562132)))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(iIdentityHashCode | 480361171)) | 469799040 | (~(520671400 | i17))) * TypedValues.Custom.TYPE_BOOLEAN);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr21[1])[0] = i20 ^ (i20 << 5);
            if (fitModeResult.currentStartHeight <= fitModeResult.currentEndHeight) {
                return false;
            }
            int i21 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i21 % 128;
            int i22 = i21 % 2;
            int i23 = ((int[]) objArr21[1])[0];
            int i24 = i23 * i23;
            int i25 = -(941251020 * i23);
            int i26 = (((i24 ^ i25) + ((i24 & i25) << 1)) - (~(-(i23 * (-620104512))))) - 1;
            int i27 = ((i26 | (-1109498076)) << 1) - ((-1109498076) ^ i26);
            int i28 = (((i27 >> 29) - 15) / 8) + 1;
            int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
            int i30 = ((i27 >> 26) + ComposerKt.defaultsKey) / 64;
            int i31 = -(i29 ^ (((i30 | 1) << 1) - (i30 ^ 1)));
            int i32 = (i31 & 7) + (i31 | 7);
            int i33 = ((i32 >> 26) + ComposerKt.defaultsKey) / 64;
            int i34 = (i33 ^ 1) + ((i33 & 1) << 1);
            return 11739 / (((-((i34 & 1) + (i34 | 1))) & i32) * 1677);
        }

        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public void applyMask(RectF rectF, float f, FitModeResult fitModeResult) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            rectF.bottom -= Math.abs(fitModeResult.currentEndHeight - fitModeResult.currentStartHeight) * f;
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int i3 = 2 % 2;
            deInitSession deinitsession = new deInitSession();
            char[] cArr2 = b;
            int i4 = 1770390596;
            Object obj2 = null;
            int i5 = 3;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i6 = 0;
                while (i6 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b3 = (byte) i5;
                            byte b4 = (byte) (b3 - 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.indexOf("", "", 0, 0), 2267 - View.MeasureSpec.getSize(0), ((byte) KeyEvent.getModifierMetaStateMask()) + 34, -1927765101, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i6++;
                        int i7 = $10 + 41;
                        $11 = i7 % 128;
                        int i8 = i7 % 2;
                        i4 = 1770390596;
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
            Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                byte b5 = (byte) 3;
                byte b6 = (byte) (b5 - 3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.indexOf("", ""), ExpandableListView.getPackedPositionType(0L) + 2267, 34 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -1927765101, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
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
                int i9 = $10 + 125;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                } else {
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                }
                while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                    if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        int i10 = $10 + 53;
                        $11 = i10 % 128;
                        int i11 = i10 % 2;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char offsetBefore = (char) (49267 - TextUtils.getOffsetBefore("", 0));
                            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3261;
                            int iRed = 30 - Color.red(0);
                            byte b7 = (byte) ($$f & 11);
                            byte b8 = (byte) (b7 - 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(offsetBefore, maximumFlingVelocity, iRed, -127612708, false, $$g(b7, b8, b8), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                            Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b9 = (byte) 0;
                                byte b10 = b9;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (22878 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 594 - View.getDefaultSize(0, 0), Drawable.resolveOpacity(0, 0) + 17, 1570859318, false, $$g(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                            int i12 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i12];
                        } else {
                            obj = null;
                            if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                int i13 = $10 + 95;
                                $11 = i13 % 128;
                                int i14 = i13 % 2;
                                deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                int i15 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i15];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i16];
                            } else {
                                int i17 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                int i18 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i17];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i18];
                            }
                        }
                    }
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                    obj2 = obj;
                }
            }
            for (int i19 = 0; i19 < i; i19++) {
                cArr4[i19] = (char) (cArr4[i19] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(short r5, byte r6, short r7) {
            /*
                int r6 = r6 * 4
                int r0 = 1 - r6
                int r7 = r7 * 2
                int r7 = r7 + 4
                int r5 = 116 - r5
                byte[] r1 = com.google.android.material.transition.platform.FitModeEvaluators.AnonymousClass1.$$c
                byte[] r0 = new byte[r0]
                r2 = 0
                int r6 = 0 - r6
                if (r1 != 0) goto L16
                r4 = r6
                r3 = r2
                goto L26
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r5
                r0[r3] = r4
                if (r3 != r6) goto L22
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                return r5
            L22:
                int r3 = r3 + 1
                r4 = r1[r7]
            L26:
                int r4 = -r4
                int r5 = r5 + r4
                int r7 = r7 + 1
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transition.platform.FitModeEvaluators.AnonymousClass1.$$g(short, byte, short):java.lang.String");
        }
    };
    private static final FitModeEvaluator HEIGHT = new FitModeEvaluator() { // from class: com.google.android.material.transition.platform.FitModeEvaluators.2
        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public FitModeResult evaluate(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float fLerp = TransitionUtils.lerp(f5, f7, f2, f3, f, true);
            float f8 = fLerp / f5;
            float f9 = fLerp / f7;
            return new FitModeResult(f8, f9, f4 * f8, fLerp, f6 * f9, fLerp);
        }

        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public boolean shouldMaskStartBounds(FitModeResult fitModeResult) {
            return fitModeResult.currentStartWidth > fitModeResult.currentEndWidth;
        }

        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        public void applyMask(RectF rectF, float f, FitModeResult fitModeResult) {
            float fAbs = (Math.abs(fitModeResult.currentEndWidth - fitModeResult.currentStartWidth) / 2.0f) * f;
            rectF.left += fAbs;
            rectF.right -= fAbs;
        }
    };

    static FitModeEvaluator get(int i, boolean z, RectF rectF, RectF rectF2) {
        if (i == 0) {
            return shouldAutoFitToWidth(z, rectF, rectF2) ? WIDTH : HEIGHT;
        }
        if (i == 1) {
            return WIDTH;
        }
        if (i == 2) {
            return HEIGHT;
        }
        throw new IllegalArgumentException("Invalid fit mode: ".concat(String.valueOf(i)));
    }

    private static boolean shouldAutoFitToWidth(boolean z, RectF rectF, RectF rectF2) {
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        float fWidth2 = rectF2.width();
        float fHeight2 = rectF2.height();
        float f = (fHeight2 * fWidth) / fWidth2;
        float f2 = (fWidth2 * fHeight) / fWidth;
        if (z) {
            return f >= fHeight;
        }
        return f2 >= fHeight2;
    }

    private FitModeEvaluators() {
    }
}

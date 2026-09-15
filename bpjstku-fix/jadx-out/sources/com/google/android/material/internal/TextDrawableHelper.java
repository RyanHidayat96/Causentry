package com.google.android.material.internal;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TextAppearanceFontCallback;
import com.google.mlkit.common.MlKitException;
import defpackage.AudioSourceExternalSyntheticLambda9;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.SessionProcessor;
import defpackage.initSession;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Random;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class TextDrawableHelper {
    private TextAppearance textAppearance;
    private float textHeight;
    private float textWidth;
    private static final byte[] $$c = {49, 89, 41, 48};
    private static final int $$f = 139;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {29, 88, -118, 32, -18, -4, 57, -60, -3, -25, 13, -9, -17, 2, 51, -57, -19, 4, -20, -3, 0, -1, 48, -74, -9, 2, 57, -69, -8, 5, -7, -13, 56, -25, -40, -23, 5, -12, -5, 35, -55, 11, -15, -12, 74, -43, -11, -39, -11, 5, -3, -9, 0, -4, -25, 5, -12, -5, 21, -28, -1, -7, 28, -43, 1, -19, -6, 3, -13, 34, -39, -7, -1, -26, 3, -14, 74, -54, -39, 6, -17, 5, -12, -5, 24, -23, -30, 6, 2, -15, -12, 40, -50, 11, -12, -12, 2, -15, -12, 12, -13, -11, 4, -11, -11, 1, 24, -43, 2, -12, 5, -25, 9, -19, 59, -39, 6, -17, 5, -12, -5, 24, -23, -30, 6, 2, -15, -12, 40, -50, 11, -12, -12, 2, -15, -12, -5, -3, 5, -4, -12, 2, -17, -3, -11, -4, -3, -11, 3, -5, -24, 7, -2, -24, 36, -40, 5, -7, -13, 2, -7, -7, -1, -26, 3, -14, 59};
    private static final int $$e = 39;
    private static final byte[] $$a = {92, 126, -38, -95, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 5051409459527514542L;
    private static int b = -981105359;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 34097;
    private final TextPaint textPaint = new TextPaint(1);
    private final TextAppearanceFontCallback fontCallback = new TextAppearanceFontCallback() { // from class: com.google.android.material.internal.TextDrawableHelper.1
        private static final byte[] $$c = {117, 57, 101, -72};
        private static final int $$d = 200;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {115, 25, -47, -94, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
        private static final int $$b = 225;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
        private static int[] TuitionPaymentFragmentbindingInflater1 = {1579104535, -2020096529, -811335511, 2014799789, 537771363, -1051464371, -263326217, -769527164, -35811558, 1856148555, 2037765946, 2034396127, -12198828, 813832041, -1701171636, -239941733, -1746645023, -1080724463};

        /* JADX WARN: Code duplicated, block: B:10:0x0028  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(short r7, byte r8, short r9, java.lang.Object[] r10) {
            /*
                byte[] r0 = com.google.android.material.internal.TextDrawableHelper.AnonymousClass1.$$a
                int r8 = 53 - r8
                int r7 = r7 + 4
                int r9 = r9 * 14
                int r9 = r9 + 84
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L13
                r9 = r7
                r3 = r8
                r4 = r2
                goto L2a
            L13:
                r3 = r2
                r6 = r9
                r9 = r7
                r7 = r6
            L17:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                int r9 = r9 + 1
                if (r4 != r8) goto L28
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L28:
                r3 = r0[r9]
            L2a:
                int r3 = -r3
                int r7 = r7 + r3
                int r7 = r7 + (-11)
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.TextDrawableHelper.AnonymousClass1.c(short, byte, short, java.lang.Object[]):void");
        }

        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public void onFontRetrieved(Typeface typeface, boolean z) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            if (z) {
                return;
            }
            TextDrawableHelper.access$002(TextDrawableHelper.this, true);
            TextDrawableDelegate textDrawableDelegate = (TextDrawableDelegate) TextDrawableHelper.access$100(TextDrawableHelper.this).get();
            if (textDrawableDelegate != null) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 31;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                int i5 = i4 % 2;
                textDrawableDelegate.onTextSizeChange();
                if (i5 == 0) {
                    int i6 = 88 / 0;
                }
            }
        }

        @Override // com.google.android.material.resources.TextAppearanceFontCallback
        public void onFontRetrievalFailed(int i) {
            int i2 = 2 % 2;
            TextDrawableHelper.access$002(TextDrawableHelper.this, true);
            TextDrawableDelegate textDrawableDelegate = (TextDrawableDelegate) TextDrawableHelper.access$100(TextDrawableHelper.this).get();
            if (textDrawableDelegate != null) {
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
                int i4 = i3 % 2;
                textDrawableDelegate.onTextSizeChange();
                int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 4 / 2;
                }
            }
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = TuitionPaymentFragmentbindingInflater1;
            char c = '0';
            int i4 = -1870535734;
            int i5 = 1;
            int i6 = 0;
            if (iArr2 != null) {
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i7 = 0;
                while (i7 < length) {
                    int i8 = $10 + 41;
                    $11 = i8 % 128;
                    if (i8 % i2 == 0) {
                        try {
                            Object[] objArr2 = new Object[1];
                            objArr2[i6] = Integer.valueOf(iArr2[i7]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(i6));
                                int iResolveOpacity = 3291 - Drawable.resolveOpacity(i6, i6);
                                int iLastIndexOf = TextUtils.lastIndexOf("", c) + 32;
                                byte b2 = (byte) i6;
                                byte b3 = b2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(bitsPerPixel, iResolveOpacity, iLastIndexOf, 1948206109, false, $$e(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                            }
                            iArr3[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                            i7 %= 1;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        try {
                            Object[] objArr3 = {Integer.valueOf(iArr2[i7])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 3291 - Color.red(0), 31 - ((Process.getThreadPriority(0) + 20) >> 6), 1948206109, false, $$e(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                            }
                            iArr3[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                            i7++;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    i2 = 2;
                    c = '0';
                    i4 = -1870535734;
                    i6 = 0;
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = TuitionPaymentFragmentbindingInflater1;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i9 = 0;
                while (i9 < length3) {
                    Object[] objArr4 = new Object[i5];
                    objArr4[0] = Integer.valueOf(iArr5[i9]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) Gravity.getAbsoluteGravity(0, 0), AndroidCharacter.getMirror('0') + 3243, TextUtils.getOffsetBefore("", 0) + 31, 1948206109, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr6[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                    i9++;
                    iArr5 = iArr5;
                    i5 = 1;
                }
                iArr5 = iArr6;
            }
            char c2 = 0;
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            sessionConfigValidatingBuilder.b = 2;
            while (sessionConfigValidatingBuilder.b < iArr.length) {
                cArr[c2] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                int i10 = $10 + 115;
                $11 = i10 % 128;
                int i11 = 2;
                int i12 = i10 % 2;
                int i13 = 17;
                while (i13 > 1) {
                    int i14 = $11 + 123;
                    $10 = i14 % 128;
                    int i15 = i14 % i11;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i13];
                    try {
                        Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getFadingEdgeLength() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 2559, 'M' - AndroidCharacter.getMirror('0'), 683220507, false, $$e(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                        i13--;
                        int i16 = $10 + 95;
                        $11 = i16 % 128;
                        int i17 = i16 % 2;
                        i11 = 2;
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                int i19 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object[] objArr6 = {sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (Color.alpha(0) + 28879), 349 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 25 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -30507727, false, "G", new Class[]{Object.class});
                }
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
                cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
                cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
                cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
                sessionConfigValidatingBuilder.b += 2;
                c2 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        /* JADX WARN: Code duplicated, block: B:32:0x0282  */
        /* JADX WARN: Code duplicated, block: B:34:0x0288  */
        /* JADX WARN: Code duplicated, block: B:35:0x0299  */
        /* JADX WARN: Code duplicated, block: B:38:0x02a1 A[Catch: Exception -> 0x0481, TRY_LEAVE, TryCatch #5 {Exception -> 0x0481, blocks: (B:36:0x029b, B:38:0x02a1), top: B:94:0x029b }] */
        /* JADX WARN: Code duplicated, block: B:41:0x02c7 A[Catch: all -> 0x03a8, TryCatch #3 {all -> 0x03a8, blocks: (B:39:0x02ba, B:41:0x02c7, B:42:0x0308), top: B:91:0x02ba, outer: #4 }] */
        /* JADX WARN: Code duplicated, block: B:50:0x03b3 A[Catch: Exception -> 0x0483, TRY_LEAVE, TryCatch #4 {Exception -> 0x0483, blocks: (B:44:0x0362, B:46:0x03a9, B:48:0x03b1, B:49:0x03b2, B:50:0x03b3, B:52:0x03e6, B:57:0x0452, B:64:0x0479, B:66:0x047f, B:67:0x0480, B:53:0x03f9, B:55:0x0406, B:56:0x044b, B:39:0x02ba, B:41:0x02c7, B:42:0x0308), top: B:93:0x029f, inners: #2, #3 }] */
        /* JADX WARN: Code duplicated, block: B:55:0x0406 A[Catch: all -> 0x0478, TryCatch #2 {all -> 0x0478, blocks: (B:53:0x03f9, B:55:0x0406, B:56:0x044b), top: B:89:0x03f9, outer: #4 }] */
        /* JADX WARN: Code duplicated, block: B:59:0x0458  */
        /* JADX WARN: Code duplicated, block: B:60:0x0468  */
        /* JADX WARN: Code duplicated, block: B:62:0x0474  */
        /* JADX WARN: Code duplicated, block: B:72:0x04a6  */
        /* JADX WARN: Code duplicated, block: B:73:0x04ab  */
        public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, int i, int i2, int i3) throws Throwable {
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            String str;
            Object[] objArr;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i11;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            int i12 = 2 % 2;
            int i13 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i14 = (i13 & 55) + (i13 | 55);
            int i15 = i14 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i15;
            int i16 = i14 % 2;
            if (context != null) {
                int i17 = ((i15 | 97) << 1) - (i15 ^ 97);
                int i18 = i17 % 128;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i18;
                int i19 = i17 % 2;
                int i20 = ((i18 | 111) << 1) - (i18 ^ 111);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i20 % 128;
                int i21 = i20 % 2;
                try {
                    int keyRepeatDelay = ViewConfiguration.getKeyRepeatDelay() >> 16;
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    int i22 = keyRepeatDelay * (-1939);
                    int i23 = ~(((-24) ^ keyRepeatDelay) | ((-24) & keyRepeatDelay));
                    int i24 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i25 = (i22 ^ 22333) + ((i22 & 22333) << 1) + ((i23 | (~((i24 ^ 23) | (i24 & 23)))) * (-970));
                    int i26 = ~keyRepeatDelay;
                    int i27 = (~((i26 & 23) | (i26 ^ 23))) * 1940;
                    int i28 = ((i25 | i27) << 1) - (i27 ^ i25);
                    int i29 = ~((~keyRepeatDelay) | (-24));
                    int i30 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i31 = ~((i30 & 23) | (i30 ^ 23));
                    int i32 = i28 + (((i29 & i31) | (i29 ^ i31)) * 970);
                    Object[] objArr2 = new Object[1];
                    a(new int[]{-1995793166, -531053309, -540999204, 1845746473, -1578369622, 1180653737, -1700219920, -1747273552, 1518546255, -2111087900, -1664245769, -714549559, -331025331, 576113033}, i32, objArr2);
                    Class<?> cls = Class.forName((String) objArr2[0]);
                    int[] iArr = {143974741, 1055426491, 239596422, 1235272356, 1479978384, 771126497, 44699168, -432232957, 1449062064, 993652575, -1603529041, 2074061195};
                    int minimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity() >> 16;
                    int i33 = (minimumFlingVelocity * (-958)) - 17244;
                    int i34 = ~i;
                    int i35 = ~((i34 & (-19)) | ((-19) ^ i34));
                    int i36 = ~minimumFlingVelocity;
                    int i37 = (~((i36 ^ i) | (i36 & i))) | i35;
                    int i38 = ~i;
                    int i39 = ~((i38 ^ minimumFlingVelocity) | (i38 & minimumFlingVelocity));
                    int i40 = ((i37 ^ i39) | (i39 & i37)) * 959;
                    int i41 = (i33 ^ i40) + ((i40 & i33) << 1) + ((~((minimumFlingVelocity ^ 18) | (minimumFlingVelocity & 18))) * (-959));
                    int i42 = (~((i36 ^ i38) | (i36 & i38))) | (~(((-19) ^ i) | ((-19) & i)));
                    int i43 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i44 = (i43 & 95) + (i43 | 95);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i44 % 128;
                    int i45 = i44 % 2;
                    int i46 = ~((minimumFlingVelocity & i) | (minimumFlingVelocity ^ i));
                    int i47 = 959 * ((i42 & i46) | (i42 ^ i46));
                    int i48 = (i41 ^ i47) + ((i47 & i41) << 1);
                    Object[] objArr3 = new Object[1];
                    a(iArr, i48, objArr3);
                    Object objInvoke = cls.getMethod((String) objArr3[0], null).invoke(context, null);
                    Object[] objArr4 = new Object[1];
                    a(new int[]{-1958900487, -1225577525, 1970638611, 1870237636, 743916475, 349114019, 1579641418, -221916400, 2058999796, 594326328, -1847099753, 1605192947, -1029564237, -626693828, -1802567628, 532884934, -1928963019, -1359692943, -1729157037, -710395950}, 33 - (~(Process.myTid() >> 22)), objArr4);
                    Class<?> cls2 = Class.forName((String) objArr4[0]);
                    int i49 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i50 = ((i49 | 125) << 1) - (i49 ^ 125);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i50 % 128;
                    int i51 = i50 % 2;
                    int i52 = -(Process.myPid() >> 22);
                    int i53 = ((5 | i52) << 1) - (i52 ^ 5);
                    Object[] objArr5 = new Object[1];
                    a(new int[]{-1968115114, 164252055, -9903238, -1938647320, 644599819, 1105068306}, i53, objArr5);
                    int i54 = cls2.getField((String) objArr5[0]).getInt(objInvoke) & 2;
                    int i55 = -i54;
                    int i56 = ((i54 & i55) | (i54 ^ i55)) >> 31;
                    int i57 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 121;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i57 % 128;
                    int i58 = i57 % 2;
                    int i59 = (~i56) & i;
                    int i60 = i56 & (i ^ 1);
                    i4 = (i60 & i59) | (i59 ^ i60);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                i4 = i;
            }
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1122237249);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 16949);
                    int deadChar = KeyEvent.getDeadChar(0, 0) + 2739;
                    int offsetAfter = TextUtils.getOffsetAfter("", 0) + 13;
                    byte[] bArr = $$a;
                    short s = bArr[132];
                    byte b2 = bArr[7];
                    Object[] objArr6 = new Object[1];
                    c(s, b2, b2, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cNormalizeMetaState, deadChar, offsetAfter, 1501733736, false, (String) objArr6[0], new Class[0]);
                }
                Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, null);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 16948);
                    int i61 = 2740 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 14;
                    byte b3 = $$a[7];
                    Object[] objArr7 = new Object[1];
                    c((short) 51, b3, b3, objArr7);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, i61, packedPositionChild, 47863026, false, (String) objArr7[0], null);
                }
                Object obj = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null);
                int i62 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i63 = ((i62 | 13) << 1) - (i62 ^ 13);
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i63 % 128;
                if (i63 % 2 != 0) {
                    set.contains(obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (!set.contains(obj)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 16949);
                        int i64 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2738;
                        int iMyPid = 13 - (Process.myPid() >> 22);
                        Object[] objArr8 = new Object[1];
                        c((short) 103, (byte) 15, $$a[7], objArr8);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(touchSlop, i64, iMyPid, 631063962, false, (String) objArr8[0], null);
                    }
                    if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null))) {
                        if (Build.VERSION.SDK_INT > 33) {
                            int packedPositionType = ExpandableListView.getPackedPositionType(0L);
                            int i65 = (packedPositionType & 28) + (packedPositionType | 28);
                            Object[] objArr9 = new Object[1];
                            a(new int[]{-301901130, -335682850, 1071407016, 1625431571, 2046343602, 1442655650, 900145217, 1923858837, -1385710420, 346141858, -2012301006, -832217786, -78035431, 2038827003, 604419980, -462917498}, i65, objArr9);
                            Object[] objArr10 = {(String) objArr9[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                                int iGreen = Color.green(0) + 993;
                                int maxKeyCode = 8 - (KeyEvent.getMaxKeyCode() >> 16);
                                Object[] objArr11 = new Object[1];
                                c((short) 140, (byte) 52, $$a[5], objArr11);
                                i7 = jumpTapTimeout;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(i7 == true ? (char) 1 : (char) 0, iGreen, maxKeyCode, 410748506, false, (String) objArr11[0], new Class[]{String.class});
                            }
                            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr10)).longValue();
                            long j = -170831463;
                            long j2 = -496;
                            long j3 = (j2 * j) + (j2 * jLongValue);
                            long j4 = 497;
                            i7 = i4;
                            long j5 = -1;
                            long j6 = j ^ j5;
                            long j7 = jLongValue ^ j5;
                            long j8 = j6 | j7;
                            long j9 = i;
                            long j10 = j9 ^ j5;
                            long j11 = j3 + ((j8 ^ j5) * j4) + ((((j8 | j9) ^ j5) | (((j7 | j10) | j) ^ j5)) * j4) + (j4 * ((j5 ^ (j9 | (j7 | j))) | ((j6 | j10) ^ j5) | ((j6 | jLongValue) ^ j5))) + ((long) (-30086774));
                            int i66 = (int) (j11 >> 32);
                            int iMyPid2 = Process.myPid();
                            int i67 = i66 & ((-118556206) + ((~((~iMyPid2) | (-571080833))) * 433) + (((~((-434122538) | iMyPid2)) | (-1003103874)) * (-433)) + (((~(iMyPid2 | (-1003103874))) | (-1005203370)) * 433));
                            int i68 = ~i;
                            i8 = i67 | (((int) j11) & ((((-1754753727) + (((~(1775593299 | i68)) | 1082147586) * (-828))) + ((i68 | 1775593299) * (-828))) - 1312437168));
                        } else {
                            i7 = i4;
                            int iArgb = Color.argb(0, 0, 0, 0);
                            int i69 = (iArgb ^ 1) + ((iArgb & 1) << 1);
                            Object[] objArr12 = new Object[1];
                            a(new int[]{720357024, -889682782, 722627920, 899118724}, i69, objArr12);
                            str = (String) objArr12[0];
                            int[] iArr2 = {2119326291, -1908123050, 364535680, 105626484, -1540441913, -300805897, 881062569, -809570598, -1900595794, 521177487};
                            int i70 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i70 % 128;
                            int i71 = i70 % 2;
                            int i72 = -Color.red(0);
                            int i73 = (i72 & 13) + (i72 | 13);
                            Object[] objArr13 = new Object[1];
                            a(iArr2, i73, objArr13);
                            objArr = new Object[]{(String) objArr13[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 33602);
                                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3085;
                                int absoluteGravity = 26 - Gravity.getAbsoluteGravity(0, 0);
                                Object[] objArr14 = new Object[1];
                                c((short) 140, (byte) 52, $$a[5], objArr14);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(tapTimeout, scrollBarFadeDuration, absoluteGravity, 1411172903, false, (String) objArr14[0], new Class[]{String.class});
                            }
                            if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                int i74 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i75 = ((i74 | 119) << 1) - (i74 ^ 119);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i75 % 128;
                                int i76 = i75 % 2;
                                i8 = 1;
                            } else {
                                i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 41;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
                                if (i11 % 2 != 0) {
                                    int i77 = 5 / 3;
                                }
                                i8 = 0;
                            }
                        }
                        int i78 = (i & (-11)) | ((~i) & 10);
                        int i79 = -i8;
                        int i80 = ((i8 & i79) | (i8 ^ i79)) >> 31;
                        int i81 = (~i80) & i;
                        int i82 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        i9 = (i82 & 25) + (i82 | 25);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
                        int i83 = i80 & i78;
                        int i84 = (i83 & i81) | (i81 ^ i83);
                        if (i9 % 2 == 0) {
                            i10 = i2 & 15;
                        } else {
                            i10 = i2 & 32;
                        }
                        int i85 = (i82 & 23) + (i82 | 23);
                        int i86 = i85 % 128;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i86;
                        int i87 = i85 % 2;
                        int i88 = (i10 | (-i10)) >> 31;
                        int i89 = i86 + 77;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i89 % 128;
                        int i90 = i89 % 2;
                        int i91 = i84 & (~i88);
                        int i92 = i88 & i;
                        i5 = (i91 & i92) | (i91 ^ i92);
                        i6 = i7;
                    } else if (Build.VERSION.SDK_INT == 30) {
                        int i93 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int i94 = ((i93 | 29) << 1) - (i93 ^ 29);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i94 % 128;
                        int i95 = i94 % 2;
                        i5 = i;
                        i6 = i4;
                    } else {
                        if (Build.VERSION.SDK_INT > 33) {
                            int packedPositionType2 = ExpandableListView.getPackedPositionType(0L);
                            int i610 = (packedPositionType2 & 28) + (packedPositionType2 | 28);
                            Object[] objArr15 = new Object[1];
                            a(new int[]{-301901130, -335682850, 1071407016, 1625431571, 2046343602, 1442655650, 900145217, 1923858837, -1385710420, 346141858, -2012301006, -832217786, -78035431, 2038827003, 604419980, -462917498}, i610, objArr15);
                            Object[] objArr16 = {(String) objArr15[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char jumpTapTimeout2 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                                int iGreen2 = Color.green(0) + 993;
                                int maxKeyCode2 = 8 - (KeyEvent.getMaxKeyCode() >> 16);
                                Object[] objArr17 = new Object[1];
                                c((short) 140, (byte) 52, $$a[5], objArr17);
                                i7 = jumpTapTimeout2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(i7 == true ? (char) 1 : (char) 0, iGreen2, maxKeyCode2, 410748506, false, (String) objArr17[0], new Class[]{String.class});
                            }
                            long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr16)).longValue();
                            long j12 = -170831463;
                            long j13 = -496;
                            long j14 = (j13 * j12) + (j13 * jLongValue2);
                            long j15 = 497;
                            i7 = i4;
                            long j16 = -1;
                            long j17 = j12 ^ j16;
                            long j18 = jLongValue2 ^ j16;
                            long j19 = j17 | j18;
                            long j20 = i;
                            long j110 = j20 ^ j16;
                            long j111 = j14 + ((j19 ^ j16) * j15) + ((((j19 | j20) ^ j16) | (((j18 | j110) | j12) ^ j16)) * j15) + (j15 * ((j16 ^ (j20 | (j18 | j12))) | ((j17 | j110) ^ j16) | ((j17 | jLongValue2) ^ j16))) + ((long) (-30086774));
                            int i611 = (int) (j111 >> 32);
                            int iMyPid3 = Process.myPid();
                            int i612 = i611 & ((-118556206) + ((~((~iMyPid3) | (-571080833))) * 433) + (((~((-434122538) | iMyPid3)) | (-1003103874)) * (-433)) + (((~(iMyPid3 | (-1003103874))) | (-1005203370)) * 433));
                            int i613 = ~i;
                            i8 = i612 | (((int) j111) & ((((-1754753727) + (((~(1775593299 | i613)) | 1082147586) * (-828))) + ((i613 | 1775593299) * (-828))) - 1312437168));
                        } else {
                            i7 = i4;
                            int iArgb2 = Color.argb(0, 0, 0, 0);
                            int i614 = (iArgb2 ^ 1) + ((iArgb2 & 1) << 1);
                            Object[] objArr18 = new Object[1];
                            a(new int[]{720357024, -889682782, 722627920, 899118724}, i614, objArr18);
                            str = (String) objArr18[0];
                            int[] iArr3 = {2119326291, -1908123050, 364535680, 105626484, -1540441913, -300805897, 881062569, -809570598, -1900595794, 521177487};
                            int i710 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i710 % 128;
                            int i711 = i710 % 2;
                            int i712 = -Color.red(0);
                            int i713 = (i712 & 13) + (i712 | 13);
                            Object[] objArr19 = new Object[1];
                            a(iArr3, i713, objArr19);
                            objArr = new Object[]{(String) objArr19[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char tapTimeout2 = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 33602);
                                int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3085;
                                int absoluteGravity2 = 26 - Gravity.getAbsoluteGravity(0, 0);
                                Object[] objArr110 = new Object[1];
                                c((short) 140, (byte) 52, $$a[5], objArr110);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(tapTimeout2, scrollBarFadeDuration2, absoluteGravity2, 1411172903, false, (String) objArr110[0], new Class[]{String.class});
                            }
                            if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                int i714 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i715 = ((i714 | 119) << 1) - (i714 ^ 119);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i715 % 128;
                                int i716 = i715 % 2;
                                i8 = 1;
                            } else {
                                i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 41;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
                                if (i11 % 2 != 0) {
                                    int i717 = 5 / 3;
                                }
                                i8 = 0;
                            }
                        }
                        int i718 = (i & (-11)) | ((~i) & 10);
                        int i719 = -i8;
                        int i810 = ((i8 & i719) | (i8 ^ i719)) >> 31;
                        int i811 = (~i810) & i;
                        int i812 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        i9 = (i812 & 25) + (i812 | 25);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
                        int i813 = i810 & i718;
                        int i814 = (i813 & i811) | (i811 ^ i813);
                        if (i9 % 2 == 0) {
                            i10 = i2 & 15;
                        } else {
                            i10 = i2 & 32;
                        }
                        int i815 = (i812 & 23) + (i812 | 23);
                        int i816 = i815 % 128;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i816;
                        int i817 = i815 % 2;
                        int i818 = (i10 | (-i10)) >> 31;
                        int i819 = i816 + 77;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i819 % 128;
                        int i96 = i819 % 2;
                        int i97 = i814 & (~i818);
                        int i98 = i818 & i;
                        i5 = (i97 & i98) | (i97 ^ i98);
                        i6 = i7;
                    }
                } else if (Build.VERSION.SDK_INT == 30) {
                    int i99 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i910 = ((i99 | 29) << 1) - (i99 ^ 29);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i910 % 128;
                    int i911 = i910 % 2;
                    i5 = i;
                    i6 = i4;
                } else {
                    try {
                        try {
                            if (Build.VERSION.SDK_INT > 33) {
                                int packedPositionType3 = ExpandableListView.getPackedPositionType(0L);
                                int i615 = (packedPositionType3 & 28) + (packedPositionType3 | 28);
                                Object[] objArr111 = new Object[1];
                                a(new int[]{-301901130, -335682850, 1071407016, 1625431571, 2046343602, 1442655650, 900145217, 1923858837, -1385710420, 346141858, -2012301006, -832217786, -78035431, 2038827003, 604419980, -462917498}, i615, objArr111);
                                try {
                                    Object[] objArr112 = {(String) objArr111[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char jumpTapTimeout3 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                                        int iGreen3 = Color.green(0) + 993;
                                        int maxKeyCode3 = 8 - (KeyEvent.getMaxKeyCode() >> 16);
                                        Object[] objArr113 = new Object[1];
                                        c((short) 140, (byte) 52, $$a[5], objArr113);
                                        i7 = jumpTapTimeout3;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(i7 == true ? (char) 1 : (char) 0, iGreen3, maxKeyCode3, 410748506, false, (String) objArr113[0], new Class[]{String.class});
                                    }
                                    long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr112)).longValue();
                                    long j112 = -170831463;
                                    long j113 = -496;
                                    long j114 = (j113 * j112) + (j113 * jLongValue3);
                                    long j115 = 497;
                                    i7 = i4;
                                    long j116 = -1;
                                    long j117 = j112 ^ j116;
                                    long j118 = jLongValue3 ^ j116;
                                    long j119 = j117 | j118;
                                    long j21 = i;
                                    long j1110 = j21 ^ j116;
                                    long j1111 = j114 + ((j119 ^ j116) * j115) + ((((j119 | j21) ^ j116) | (((j118 | j1110) | j112) ^ j116)) * j115) + (j115 * ((j116 ^ (j21 | (j118 | j112))) | ((j117 | j1110) ^ j116) | ((j117 | jLongValue3) ^ j116))) + ((long) (-30086774));
                                    int i616 = (int) (j1111 >> 32);
                                    int iMyPid4 = Process.myPid();
                                    int i617 = i616 & ((-118556206) + ((~((~iMyPid4) | (-571080833))) * 433) + (((~((-434122538) | iMyPid4)) | (-1003103874)) * (-433)) + (((~(iMyPid4 | (-1003103874))) | (-1005203370)) * 433));
                                    int i618 = ~i;
                                    i8 = i617 | (((int) j1111) & ((((-1754753727) + (((~(1775593299 | i618)) | 1082147586) * (-828))) + ((i618 | 1775593299) * (-828))) - 1312437168));
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 != null) {
                                        throw cause2;
                                    }
                                    throw th2;
                                }
                            } else {
                                i7 = i4;
                                int iArgb3 = Color.argb(0, 0, 0, 0);
                                int i619 = (iArgb3 ^ 1) + ((iArgb3 & 1) << 1);
                                Object[] objArr114 = new Object[1];
                                a(new int[]{720357024, -889682782, 722627920, 899118724}, i619, objArr114);
                                str = (String) objArr114[0];
                                int[] iArr4 = {2119326291, -1908123050, 364535680, 105626484, -1540441913, -300805897, 881062569, -809570598, -1900595794, 521177487};
                                int i7110 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 81;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7110 % 128;
                                int i7111 = i7110 % 2;
                                int i7112 = -Color.red(0);
                                int i7113 = (i7112 & 13) + (i7112 | 13);
                                Object[] objArr115 = new Object[1];
                                a(iArr4, i7113, objArr115);
                                try {
                                    objArr = new Object[]{(String) objArr115[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        char tapTimeout3 = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 33602);
                                        int scrollBarFadeDuration3 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3085;
                                        int absoluteGravity3 = 26 - Gravity.getAbsoluteGravity(0, 0);
                                        Object[] objArr116 = new Object[1];
                                        c((short) 140, (byte) 52, $$a[5], objArr116);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(tapTimeout3, scrollBarFadeDuration3, absoluteGravity3, 1411172903, false, (String) objArr116[0], new Class[]{String.class});
                                    }
                                    if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                        int i7114 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        int i7115 = ((i7114 | 119) << 1) - (i7114 ^ 119);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i7115 % 128;
                                        int i7116 = i7115 % 2;
                                        i8 = 1;
                                    } else {
                                        i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 41;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i11 % 128;
                                        if (i11 % 2 != 0) {
                                            int i7117 = 5 / 3;
                                        }
                                        i8 = 0;
                                    }
                                } catch (Throwable th3) {
                                    Throwable cause3 = th3.getCause();
                                    if (cause3 != null) {
                                        throw cause3;
                                    }
                                    throw th3;
                                }
                            }
                        } catch (Exception unused) {
                        }
                    } catch (Exception unused2) {
                        i7 = i4;
                    }
                    int i7118 = (i & (-11)) | ((~i) & 10);
                    int i7119 = -i8;
                    int i8110 = ((i8 & i7119) | (i8 ^ i7119)) >> 31;
                    int i8111 = (~i8110) & i;
                    int i8112 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    i9 = (i8112 & 25) + (i8112 | 25);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
                    int i8113 = i8110 & i7118;
                    int i8114 = (i8113 & i8111) | (i8111 ^ i8113);
                    if (i9 % 2 == 0) {
                        i10 = i2 & 15;
                    } else {
                        i10 = i2 & 32;
                    }
                    int i8115 = (i8112 & 23) + (i8112 | 23);
                    int i8116 = i8115 % 128;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8116;
                    int i8117 = i8115 % 2;
                    int i8118 = (i10 | (-i10)) >> 31;
                    int i8119 = i8116 + 77;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i8119 % 128;
                    int i912 = i8119 % 2;
                    int i913 = i8114 & (~i8118);
                    int i914 = i8118 & i;
                    i5 = (i913 & i914) | (i913 ^ i914);
                    i6 = i7;
                }
                int i100 = ((~i6) & i) | ((~i) & i6);
                int i101 = -i100;
                int i102 = ((i100 & i101) | (i100 ^ i101)) >> 31;
                int i103 = i5 & (~i102);
                int i104 = i6 & i102;
                int i105 = (i103 & i104) | (i103 ^ i104);
                int i106 = (~(i & i105)) & (i | i105);
                int i107 = ((i106 | (-i106)) >> 31) & 16;
                Object[] objArr20 = {new int[]{i}, new int[1], new int[]{i105}, null};
                int iMyUid = Process.myUid();
                int i108 = 143013812 + (((~(969442960 | iMyUid)) | 69671013) * 104) + ((~((~iMyUid) | (-29360785))) * (-104)) + ((iMyUid | 1009753189) * 104);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i109 = (i107 * 55) + (i108 * (-107));
                int i110 = ~i107;
                int i111 = ~(i110 | i108);
                int i112 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i113 = -(-((i111 | (~((i112 ^ i108) | (i112 & i108)))) * (-108)));
                int i114 = ((i109 | i113) << 1) - (i109 ^ i113);
                int i115 = ~((i110 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | (i110 & iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                int i116 = ~i108;
                int i117 = ~((i116 & i107) | (i116 ^ i107));
                int i118 = ((i115 & i117) | (i115 ^ i117) | (~((i112 ^ i107) | (i112 & i107)))) * 54;
                int i119 = ((i114 | i118) << 1) - (i118 ^ i114);
                int i120 = ~i108;
                int i121 = ~((i120 & i107) | (i120 ^ i107));
                int i122 = i119 + (((iTuitionPaymentFragmentspecialinlinedviewModeldefault2 & i121) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ i121)) * 54);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AudioSourceExternalSyntheticLambda9.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i123 = ~i122;
                int i124 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i125 = i123 | i124;
                int i126 = ~((i125 & i3) | (i125 ^ i3));
                int i127 = ~i3;
                int i128 = (i127 & i124) | (i127 ^ i124);
                int i129 = ~((i128 & i122) | (i128 ^ i122));
                int i130 = (i122 * (-183)) + (i3 * (-183)) + (((i126 & i129) | (i126 ^ i129)) * (-184));
                int i131 = ~i3;
                int i132 = ~((i123 & i131) | (i123 ^ i131));
                int i133 = ~i122;
                int i134 = ~((i124 & i133) | (i133 ^ i124));
                int i135 = (i132 & i134) | (i132 ^ i134);
                int i136 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | i131);
                int i137 = -(-(((i136 & i135) | (i135 ^ i136)) * 184));
                int i138 = ((((i130 | i137) << 1) - (i137 ^ i130)) - (~(-(-((i122 | i3) * 184))))) - 1;
                int i139 = i138 << 13;
                int i140 = (i139 & (~i138)) | ((~i139) & i138);
                int i141 = i140 >>> 17;
                int i142 = (i140 | i141) & (~(i140 & i141));
                int i143 = i142 << 5;
                ((int[]) objArr20[1])[0] = (i142 | i143) & (~(i142 & i143));
                int i144 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i145 = (i144 ^ 93) + ((i144 & 93) << 1);
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i145 % 128;
                int i146 = i145 % 2;
                return objArr20;
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 != null) {
                    throw cause4;
                }
                throw th4;
            }
        }

        private static String $$e(short s, short s2, byte b2) {
            int i = (s * 4) + 4;
            byte[] bArr = $$c;
            int i2 = 122 - (b2 * 56);
            int i3 = s2 * 3;
            byte[] bArr2 = new byte[i3 + 1];
            int i4 = -1;
            if (bArr == null) {
                i++;
                i2 = i + (-i2);
            }
            while (true) {
                int i5 = i2;
                int i6 = i;
                i4++;
                bArr2[i4] = (byte) i5;
                if (i4 == i3) {
                    return new String(bArr2, 0);
                }
                i = i6 + 1;
                i2 = i5 + (-bArr[i6]);
            }
        }
    };
    private boolean textSizeDirty = true;
    private WeakReference<TextDrawableDelegate> delegate = new WeakReference<>(null);

    public interface TextDrawableDelegate {
        int[] getState();

        boolean onStateChange(int[] iArr);

        void onTextSizeChange();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 52
            int r0 = 53 - r6
            int r7 = 103 - r7
            byte[] r1 = com.google.android.material.internal.TextDrawableHelper.$$a
            int r8 = r8 * 52
            int r8 = 56 - r8
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r6
            r7 = r8
            r3 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L2c:
            int r8 = r8 + r4
            int r7 = r7 + 1
            int r8 = r8 + (-11)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.TextDrawableHelper.a(short, short, byte, java.lang.Object[]):void");
    }

    private static void d(short s, byte b2, byte b3, Object[] objArr) {
        int i = s + 4;
        byte[] bArr = $$d;
        int i2 = (b3 * 15) + 84;
        int i3 = b2 * 59;
        byte[] bArr2 = new byte[112 - i3];
        int i4 = 111 - i3;
        int i5 = -1;
        if (bArr == null) {
            i5 = -1;
            i2 = (i4 + (-i)) - 6;
            i = i;
        }
        while (true) {
            int i6 = i + 1;
            int i7 = i5 + 1;
            bArr2[i7] = (byte) i2;
            if (i7 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i5 = i7;
            i2 = (i2 + (-bArr[i6])) - 6;
            i = i6;
        }
    }

    static /* synthetic */ boolean access$002(TextDrawableHelper textDrawableHelper, boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 1;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        textDrawableHelper.textSizeDirty = z;
        int i5 = i2 + 35;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    static /* synthetic */ WeakReference access$100(TextDrawableHelper textDrawableHelper) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 55;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        WeakReference<TextDrawableDelegate> weakReference = textDrawableHelper.delegate;
        int i5 = i2 + 21;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 == 0) {
            return weakReference;
        }
        throw null;
    }

    public TextDrawableHelper(TextDrawableDelegate textDrawableDelegate) {
        setDelegate(textDrawableDelegate);
    }

    public void setDelegate(TextDrawableDelegate textDrawableDelegate) {
        int i = 2 % 2;
        this.delegate = new WeakReference<>(textDrawableDelegate);
        int i2 = TuitionPaymentFragmentbindingInflater1 + 11;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public TextPaint getTextPaint() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 73;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        TextPaint textPaint = this.textPaint;
        int i5 = i2 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 26 / 0;
        }
        return textPaint;
    }

    public void setTextWidthDirty(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 1;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        int i4 = i2 % 2;
        this.textSizeDirty = z;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 55;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public boolean isTextWidthDirty() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i3 = i2 + 93;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.textSizeDirty;
        int i5 = i2 + 115;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public void setTextSizeDirty(boolean z) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = i2 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
        int i4 = i3 % 2;
        this.textSizeDirty = z;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 113;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
        int i6 = i5 % 2;
    }

    private void refreshTextDimens(String str) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        this.textWidth = calculateTextWidth(str);
        this.textHeight = calculateTextHeight(str);
        this.textSizeDirty = false;
        int i4 = TuitionPaymentFragmentbindingInflater1 + 125;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public float getTextWidth(String str) {
        int i = 2 % 2;
        Object obj = null;
        if (!this.textSizeDirty) {
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.textWidth;
            }
            obj.hashCode();
            throw null;
        }
        refreshTextDimens(str);
        float f = this.textWidth;
        int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        if (i3 % 2 != 0) {
            return f;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        r5 = r4.textPaint.measureText(r5, 0, r5.length());
        r1 = com.google.android.material.internal.TextDrawableHelper.TuitionPaymentFragmentbindingInflater1 + 59;
        com.google.android.material.internal.TextDrawableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        if ((r1 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        r0 = 60 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r5 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r5 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r1 = r1 + 11;
        r5 = r1 % 128;
        com.google.android.material.internal.TextDrawableHelper.TuitionPaymentFragmentbindingInflater1 = r5;
        r1 = r1 % 2;
        r5 = r5 + 31;
        com.google.android.material.internal.TextDrawableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        return 0.0f;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private float calculateTextWidth(java.lang.CharSequence r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.material.internal.TextDrawableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            int r2 = r1 + 109
            int r3 = r2 % 128
            com.google.android.material.internal.TextDrawableHelper.TuitionPaymentFragmentbindingInflater1 = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 != 0) goto L15
            r2 = 96
            int r2 = r2 / r3
            if (r5 != 0) goto L27
            goto L17
        L15:
            if (r5 != 0) goto L27
        L17:
            int r1 = r1 + 11
            int r5 = r1 % 128
            com.google.android.material.internal.TextDrawableHelper.TuitionPaymentFragmentbindingInflater1 = r5
            int r1 = r1 % r0
            int r5 = r5 + 31
            int r1 = r5 % 128
            com.google.android.material.internal.TextDrawableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r1
            int r5 = r5 % r0
            r5 = 0
            return r5
        L27:
            android.text.TextPaint r1 = r4.textPaint
            int r2 = r5.length()
            float r5 = r1.measureText(r5, r3, r2)
            int r1 = com.google.android.material.internal.TextDrawableHelper.TuitionPaymentFragmentbindingInflater1
            int r1 = r1 + 59
            int r2 = r1 % 128
            com.google.android.material.internal.TextDrawableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L3f
            r0 = 60
            int r0 = r0 / r3
        L3f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.TextDrawableHelper.calculateTextWidth(java.lang.CharSequence):float");
    }

    private static void c(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
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
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            int i4 = $11 + 47;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (8328 - (ViewConfiguration.getScrollBarSize() >> 8)), TextUtils.getOffsetAfter("", 0) + 1235, 35 - (ViewConfiguration.getLongPressTimeout() >> 16), -653973969, false, $$g(b2, b3, (byte) (b3 + 3)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 2764, TextUtils.getOffsetAfter("", 0) + 14, 1504416861, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - View.getDefaultSize(0, 0)), 253 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 22, -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (65199 - ImageFormat.getBitsPerPixel(0)), 2891 - View.resolveSize(0, 0), 17 - KeyEvent.getDeadChar(0, 0), 2012627446, false, $$g(b6, b7, (byte) (-b7)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = sessionProcessor.b;
                cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] ^ cArr4[iIntValue2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) b) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ (-6377398940819159759L)))));
                sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                int i6 = $10 + 19;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                i2 = 2;
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

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        return r3.textHeight;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        refreshTextDimens(r4);
        r4 = r3.textHeight;
        r1 = com.google.android.material.internal.TextDrawableHelper.TuitionPaymentFragmentbindingInflater1 + 3;
        com.google.android.material.internal.TextDrawableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if ((r1 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        r4 = null;
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if ((!r3.textSizeDirty) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r3.textSizeDirty == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float getTextHeight(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.material.internal.TextDrawableHelper.TuitionPaymentFragmentbindingInflater1
            int r1 = r1 + 17
            int r2 = r1 % 128
            com.google.android.material.internal.TextDrawableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L19
            boolean r1 = r3.textSizeDirty
            r2 = 90
            int r2 = r2 / 0
            r1 = r1 ^ 1
            if (r1 == 0) goto L20
            goto L1d
        L19:
            boolean r1 = r3.textSizeDirty
            if (r1 != 0) goto L20
        L1d:
            float r4 = r3.textHeight
            return r4
        L20:
            r3.refreshTextDimens(r4)
            float r4 = r3.textHeight
            int r1 = com.google.android.material.internal.TextDrawableHelper.TuitionPaymentFragmentbindingInflater1
            int r1 = r1 + 3
            int r2 = r1 % 128
            com.google.android.material.internal.TextDrawableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L31
            return r4
        L31:
            r4 = 0
            r4.hashCode()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.TextDrawableHelper.getTextHeight(java.lang.String):float");
    }

    private float calculateTextHeight(String str) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
            int i2 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 875;
            int threadPriority = 10 - ((Process.getThreadPriority(0) + 20) >> 6);
            byte b2 = $$a[5];
            byte b3 = (byte) (-b2);
            Object[] objArr2 = new Object[1];
            a(b3, (byte) (b3 + 4), (byte) (-b2), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMakeMeasureSpec, i2, threadPriority, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{64671, 6058, 56144, 57700}, new char[]{33690, 24817, 28710, 64014}, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), KeyEvent.keyCodeFromString(""), new char[]{37902, 49882, 28350, 6404, 20048, 38681, 54964, 16962, 61197, 22066, 13681, 19299, 43424, 64472, 44088, 7013, 3030, 62826, 18143, 41539, 28179, 34632}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{64671, 6058, 56144, 57700}, new char[]{26165, 59228, 48162, 63914}, (char) (View.resolveSize(0, 0) + 43708), 585587815 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new char[]{55275, 15582, 63896, 25408, 18936, 63164, 896, 1021, 45015, 36627, 20948, 5795, 26635, 53928, 4156}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
            int defaultSize = 876 - View.getDefaultSize(0, 0);
            int i3 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 10;
            byte[] bArr = $$a;
            Object[] objArr5 = new Object[1];
            a(bArr[7], bArr[54], (byte) (-bArr[5]), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cKeyCodeFromString, defaultSize, i3, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = TuitionPaymentFragmentbindingInflater1 + 11;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 876;
                int i6 = 10 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                byte[] bArr2 = $$a;
                byte b4 = (byte) (-bArr2[5]);
                byte b5 = bArr2[7];
                Object[] objArr6 = new Object[1];
                a(b4, b5, b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(tapTimeout, scrollDefaultDelay, i6, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iNextInt = new Random().nextInt(1764059091);
            int i7 = ((((-981816544) + (((~((-1012529009) | iNextInt)) | 67704416) * 345)) + (((~((-1012529009) | (~iNextInt))) | (-1039923196)) * 345)) + ((~(iNextInt | (-67704417))) * 345)) - 413313333;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{64671, 6058, 56144, 57700}, new char[]{33888, 46111, 14371, 35732}, (char) (37944 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), ViewConfiguration.getWindowTouchSlop() >> 8, new char[]{20151, 3452, 20898, 40001, 7139, 43229, 15288, 54403, 38172, 38701, 39101, 5762, 49447, 12817, 36905, 19093, 3353, 60334, 24557, 37587, 11086, 4087, 49343, 55800, 50856, 15689}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{64671, 6058, 56144, 57700}, new char[]{37098, 51454, 22375, 42357}, (char) (30039 - ExpandableListView.getPackedPositionGroup(0L)), TextUtils.indexOf("", "", 0, 0), new char[]{5092, 35261, 61658, 54763, 1986, 26185, 46863, 36426, 54566, 11305, 55673, 28043, 9789, 11867, 15001, 47796, 61794, 62196}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 9;
                TuitionPaymentFragmentbindingInflater1 = i10 % 128;
                int i11 = i10 % 2;
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            try {
                Object[] objArr10 = {applicationContext, Integer.valueOf(str != null ? str.length() : 0), -413313333};
                byte[] bArr3 = $$d;
                Object[] objArr11 = new Object[1];
                d(bArr3[21], bArr3[20], bArr3[64], objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                Object[] objArr12 = new Object[1];
                d((byte) 110, bArr3[64], bArr3[20], objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cKeyCodeFromString2 = (char) KeyEvent.keyCodeFromString("");
                        int iIndexOf = 876 - TextUtils.indexOf("", "");
                        int mode = 10 - View.MeasureSpec.getMode(0);
                        byte[] bArr4 = $$a;
                        byte b6 = (byte) (-bArr4[5]);
                        byte b7 = bArr4[7];
                        Object[] objArr13 = new Object[1];
                        a(b6, b7, b7, objArr13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cKeyCodeFromString2, iIndexOf, mode, 256017550, false, (String) objArr13[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr14 = new Object[1];
                        c(new char[]{64671, 6058, 56144, 57700}, new char[]{33690, 24817, 28710, 64014}, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), TextUtils.indexOf("", "", 0, 0), new char[]{37902, 49882, 28350, 6404, 20048, 38681, 54964, 16962, 61197, 22066, 13681, 19299, 43424, 64472, 44088, 7013, 3030, 62826, 18143, 41539, 28179, 34632}, objArr14);
                        Class<?> cls4 = Class.forName((String) objArr14[0]);
                        Object[] objArr15 = new Object[1];
                        c(new char[]{64671, 6058, 56144, 57700}, new char[]{26165, 59228, 48162, 63914}, (char) (KeyEvent.normalizeMetaState(0) + 43708), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 585587814, new char[]{55275, 15582, 63896, 25408, 18936, 63164, 896, 1021, 45015, 36627, 20948, 5795, 26635, 53928, 4156}, objArr15);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 877;
                            int trimmedLength = 10 - TextUtils.getTrimmedLength("");
                            byte[] bArr5 = $$a;
                            Object[] objArr16 = new Object[1];
                            a(bArr5[7], bArr5[54], (byte) (-bArr5[5]), objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, packedPositionChild, trimmedLength, 2009631821, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                            int absoluteGravity = 876 - Gravity.getAbsoluteGravity(0, 0);
                            int i12 = 11 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            byte b8 = $$a[5];
                            byte b9 = (byte) (-b8);
                            Object[] objArr17 = new Object[1];
                            a(b9, (byte) (b9 + 4), (byte) (-b8), objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, absoluteGravity, i12, 252381699, false, (String) objArr17[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (((int[]) objArr[0])[0] != ((int[]) objArr[2])[0]) {
            throw null;
        }
        int i13 = ((int[]) objArr[1])[0];
        Object[] objArr18 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i14 = i13 + (-1684364378) + ((~((-68161) | iIdentityHashCode)) * (-301)) + (((~(25516776 | iIdentityHashCode)) | (~((~iIdentityHashCode) | 65827005))) * (-301)) + (((~(iIdentityHashCode | (-65827006))) | 25516776) * 301);
        int i15 = (i14 << 13) ^ i14;
        int i16 = i15 ^ (i15 >>> 17);
        Object obj = objArr18[1];
        ((int[]) obj)[0] = i16 ^ (i16 << 5);
        if (str != null) {
            return Math.abs(this.textPaint.getFontMetrics().ascent);
        }
        int i17 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 61;
        TuitionPaymentFragmentbindingInflater1 = i17 % 128;
        int i18 = i17 % 2;
        int i19 = ((int[]) obj)[0];
        int i20 = i19 * i19;
        int i21 = -(1744159 * i19);
        int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
        int i23 = -(i19 * (-1946805513));
        int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
        int i25 = (i24 & (-439883655)) + ((-439883655) | i24);
        int i26 = i25 >> 27;
        int i27 = ((i26 ^ (-63)) + ((i26 & (-63)) << 1)) / 32;
        int i28 = (i27 ^ 1) + ((i27 & 1) << 1);
        int i29 = ((i25 | i28) << 1) - (i28 ^ i25);
        int i30 = i25 >> 23;
        int i31 = -(i29 ^ (((((i30 | (-1023)) << 1) - (i30 ^ (-1023))) / 512) + 1));
        int i32 = ((i31 | 6) << 1) - (i31 ^ 6);
        int i33 = i32 >> 19;
        int i34 = ((i33 ^ (-16383)) + ((i33 & (-16383)) << 1)) / 8192;
        return (2024708304 / (((-(((i34 & 1) + (i34 | 1)) + 1)) & i32) * 2)) - 168725692;
    }

    public TextAppearance getTextAppearance() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 105;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.textAppearance;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setTextAppearance(TextAppearance textAppearance, Context context) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 119;
        int i3 = i2 % 128;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this.textAppearance != textAppearance) {
            this.textAppearance = textAppearance;
            if (textAppearance != null) {
                int i4 = i3 + 5;
                TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                if (i4 % 2 == 0) {
                    textAppearance.updateMeasureState(context, this.textPaint, this.fontCallback);
                    this.delegate.get();
                    throw null;
                }
                textAppearance.updateMeasureState(context, this.textPaint, this.fontCallback);
                TextDrawableDelegate textDrawableDelegate = this.delegate.get();
                if (textDrawableDelegate != null) {
                    int i5 = TuitionPaymentFragmentbindingInflater1 + 75;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
                    if (i5 % 2 != 0) {
                        this.textPaint.drawableState = textDrawableDelegate.getState();
                        obj.hashCode();
                        throw null;
                    }
                    this.textPaint.drawableState = textDrawableDelegate.getState();
                }
                textAppearance.updateDrawState(context, this.textPaint, this.fontCallback);
                this.textSizeDirty = true;
            }
            TextDrawableDelegate textDrawableDelegate2 = this.delegate.get();
            if (textDrawableDelegate2 != null) {
                int i6 = TuitionPaymentFragmentbindingInflater1 + 15;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
                if (i6 % 2 == 0) {
                    textDrawableDelegate2.onTextSizeChange();
                    textDrawableDelegate2.onStateChange(textDrawableDelegate2.getState());
                } else {
                    textDrawableDelegate2.onTextSizeChange();
                    textDrawableDelegate2.onStateChange(textDrawableDelegate2.getState());
                    throw null;
                }
            }
        }
    }

    public void updateTextPaintDrawState(Context context) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 85;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 == 0) {
            this.textAppearance.updateDrawState(context, this.textPaint, this.fontCallback);
            int i3 = 82 / 0;
        } else {
            this.textAppearance.updateDrawState(context, this.textPaint, this.fontCallback);
        }
        int i4 = TuitionPaymentFragmentbindingInflater1 + 19;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, int r7, int r8) {
        /*
            int r6 = r6 * 4
            int r0 = 1 - r6
            int r7 = r7 + 4
            int r8 = 104 - r8
            byte[] r1 = com.google.android.material.internal.TextDrawableHelper.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L29
        L14:
            r3 = r2
        L15:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            r3 = r1[r7]
            r5 = r3
            r3 = r8
            r8 = r5
        L29:
            int r8 = -r8
            int r8 = r8 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.TextDrawableHelper.$$g(int, int, int):java.lang.String");
    }
}

package com.bpjstku.presentation.multibiller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.SessionProcessor;
import defpackage.initSession;
import defpackage.lambdastart1androidxcameravideointernalaudioAudioSource;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/multibiller/MultiBillerWebviewActivity$onDownloadComplete$onComplete$1;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "p0", "Landroid/content/Intent;", "p1", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MultiBillerWebviewActivity$onDownloadComplete$onComplete$1 extends BroadcastReceiver {
    private static final byte[] $$c = {43, 23, 22, -14};
    private static final int $$f = 120;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {46, 126, -84, 108, -12, 2, 63, -54, 3, -19, 19, -3, -11, 8, 57, -51, -13, 10, -14, 3, 6, 5, 54, -68, -3, 8, 63, -63, -2, 11, -1, -7, 62, -30, -35, 1, 7, 19, -13, -18, 8, 38, -49, 17, -9, -6, 80, -75, 1, 26, -30, 17, -13, -5, 18, -2, -17, 80, -62, -12, 2, 63, -57, -8, 0, 8, -5, 7, 55, -56, -3, -9, 13, 3, 1, -18, 14, 55, -68, 13, -8, -2, -5, 15, 2, -12, 1, 8, -3, 2, 57, -59, -5, -6, 15, -13, 4, 13, -11, 62, -21, -44, 1, 8, -3, 2, 36, -30, -2, -5, 3, 34, -41, 3, 4, -9, -6, 80, 0, -33, -51, 4, 15, -13, 4, 13, -11, 25, -38, 11, -6, 12, 3, -15, 11, 6, 23, -21, -12, 11, -2, 3, 48, -33, 12, -11, 11, -6, 1, 30, -17, -24, 12, 8, -9, -6, 46, -44, 17, -6, -6, 8, -9, -6, 1, 3, 11, 2, -6, 8, -11, 3, -5, 2, 3, -5, 9, 1, -18, 13, 4, -18, 42, -34, 11, -1, -7, 8, -1, -1, 5, -20, 9, -8, 65, -12, 2, 63, -51, -15, 0, -3, 13, -6, -13, 20, -13, 68, -59, -5, -6, 15, -13, 4, 13, -11, 62, -19, -5, -34, 55, -59, 25, 15, -7, -33, 12, -11, 11, -6, 1, 30, -17, -24, 12, 8, -9, -6, 46, -44, 17, -6, -6, 8, -9, -6, 1, 3, 11, 2, -6, 8, -11, 3, -5, 2, 3, -5, 9, 1, -18, 13, 4, -18, 42, -34, 11, -1, -7, 8, -1, -1, 5, -20, 9, -8, 67, 11, -13, 12, -9, -3, 5, 36, -27, -1, -9, -6, 11, 3, -3, 4, -13, 49, -34, -17, 11, -6, 1, -12, 2, 63, -57, -8, 0, 8, -5, 7, 55, -51, -13, 10, -14, 3, 6, 5, 54, -57, -6, -6, 69, -59, -5, -6, 15, -13, 4, 13, -11, 62, -63, 1, 1, 2, -11, 21, -23, 13, -10, 10, -6, 1, 15, -7, 5, -2, -2, 55, -76, 0, 14, 0, -12, 2, 63, -54, 3, -19, 19, -3, -11, 8, 57, -51, -13, 10, -14, 3, 6, 5, 54, -68, -3, 8, 63, -59, -5, -6, 15, -13, 4, 13, -11, 62, -54, -11, 2, 12, -8, -5, 64, -69, 16, -12, -1, 11, 55, -36, -35, 8, 44, -34, -17, 11, -6, 1, 27, -16, -12, -1, 11, 65, -79, 14, -9, 10, 35, -34, -17, 11, -6, 1, 74, -14, 14, -14, -33, 12, -11, 11, -6, 1, 30, -17, -24, 12, 8, -9, -6, 46, -44, 17, -6, -6, 8, -9, -6, 18, -7, -5, 10, -5, -5, 7, 30, -37, 8, -6, 11, -19, 15, -13, 65};
    private static final int $$e = 93;
    private static final byte[] $$a = {Base64.padSymbol, -108, 49, -100, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -29, 31, -48, -17, 4, -24, 1, -6, -13, -13, -29, 38, -50, -16, -1, -12, -24};
    private static final int $$b = 123;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -6377398940819159759L;
    private static int b = -981105359;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 38373;

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.bpjstku.presentation.multibiller.MultiBillerWebviewActivity$onDownloadComplete$onComplete$1.$$a
            int r7 = r7 + 84
            int r9 = r9 + 1
            int r8 = 213 - r8
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r8
            r8 = r9
            r4 = r2
            goto L29
        L11:
            r3 = r2
        L12:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r9) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L29:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r8 + (-11)
            r8 = r3
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.multibiller.MultiBillerWebviewActivity$onDownloadComplete$onComplete$1.c(int, short, short, java.lang.Object[]):void");
    }

    private static void d(short s, byte b2, byte b3, Object[] objArr) {
        byte[] bArr = $$d;
        int i = 425 - s;
        int i2 = 112 - b2;
        byte[] bArr2 = new byte[85 - b3];
        int i3 = 84 - b3;
        int i4 = -1;
        if (bArr == null) {
            i4 = -1;
            i2 = (-i) + i2;
            i = i;
        }
        while (true) {
            int i5 = i4 + 1;
            int i6 = i + 1;
            bArr2[i5] = (byte) i2;
            if (i5 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i4 = i5;
            i2 = (-bArr[i6]) + i2;
            i = i6;
        }
    }

    private static void a(char[] cArr, char[] cArr2, char c, int i, char[] cArr3, Object[] objArr) throws Throwable {
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
        while (sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < length3) {
            try {
                Object[] objArr2 = {sessionProcessor};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1033601528);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 8328), (ViewConfiguration.getTouchSlop() >> 8) + 1235, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 35, -653973969, false, $$g(b2, b3, (byte) (b3 + 2)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {sessionProcessor};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1120586870);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), ExpandableListView.getPackedPositionGroup(0L) + 2764, 13 - TextUtils.lastIndexOf("", '0', 0, 0), 1504416861, false, $$g(b4, b5, b5), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {sessionProcessor, Integer.valueOf(cArr4[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(811618268);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (43325 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), View.combineMeasuredStates(0, 0) + 253, 22 - ExpandableListView.getPackedPositionGroup(0L), -721491957, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821841887);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.getDefaultSize(0, 0) + 65200), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2891, 16 - TextUtils.indexOf((CharSequence) "", '0', 0), 2012627446, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = sessionProcessor.b;
                            cArr6[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2])) ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-6377398940819159759L))) ^ ((long) ((int) (((long) b) ^ (-6377398940819159759L))))) ^ ((long) ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ (-6377398940819159759L)))));
                            sessionProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                            int i3 = $10 + 31;
                            $11 = i3 % 128;
                            int i4 = i3 % 2;
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
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
        int i5 = $11 + 51;
        $10 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    MultiBillerWebviewActivity$onDownloadComplete$onComplete$1() {
    }

    /* JADX WARN: Code duplicated, block: B:295:0x1d79  */
    /* JADX WARN: Code duplicated, block: B:297:0x1df2  */
    /* JADX WARN: Code duplicated, block: B:300:0x1e55  */
    /* JADX WARN: Code duplicated, block: B:301:0x1e98  */
    /* JADX WARN: Code duplicated, block: B:304:0x1ead  */
    /* JADX WARN: Code duplicated, block: B:306:0x1eb6  */
    /* JADX WARN: Code duplicated, block: B:308:0x1f6c  */
    /* JADX WARN: Code duplicated, block: B:311:0x1f76 A[Catch: all -> 0x32bb, TryCatch #8 {all -> 0x32bb, blocks: (B:309:0x1f70, B:311:0x1f76, B:312:0x1f9d, B:314:0x1fc8, B:315:0x2062, B:140:0x0ed2, B:142:0x0ee7, B:143:0x0f18, B:100:0x0a69, B:102:0x0a7e, B:103:0x0ab4, B:105:0x0af0, B:106:0x0b6e, B:15:0x026b, B:17:0x0280, B:18:0x02b5, B:20:0x02e6, B:21:0x035a), top: B:548:0x026b }] */
    /* JADX WARN: Code duplicated, block: B:314:0x1fc8 A[Catch: all -> 0x32bb, TryCatch #8 {all -> 0x32bb, blocks: (B:309:0x1f70, B:311:0x1f76, B:312:0x1f9d, B:314:0x1fc8, B:315:0x2062, B:140:0x0ed2, B:142:0x0ee7, B:143:0x0f18, B:100:0x0a69, B:102:0x0a7e, B:103:0x0ab4, B:105:0x0af0, B:106:0x0b6e, B:15:0x026b, B:17:0x0280, B:18:0x02b5, B:20:0x02e6, B:21:0x035a), top: B:548:0x026b }] */
    /* JADX WARN: Code duplicated, block: B:318:0x2075  */
    /* JADX WARN: Code duplicated, block: B:323:0x20e5  */
    /* JADX WARN: Code duplicated, block: B:326:0x213a  */
    /* JADX WARN: Code duplicated, block: B:330:0x2192  */
    /* JADX WARN: Code duplicated, block: B:332:0x2201  */
    /* JADX WARN: Code duplicated, block: B:335:0x2267  */
    /* JADX WARN: Code duplicated, block: B:336:0x22ac  */
    /* JADX WARN: Code duplicated, block: B:339:0x22c1  */
    /* JADX WARN: Code duplicated, block: B:341:0x22d4  */
    /* JADX WARN: Code duplicated, block: B:344:0x23a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:345:0x23a6  */
    /* JADX WARN: Code duplicated, block: B:347:0x23b2  */
    /* JADX WARN: Code duplicated, block: B:350:0x23bb  */
    /* JADX WARN: Code duplicated, block: B:352:0x23bf  */
    /* JADX WARN: Code duplicated, block: B:355:0x23c9  */
    /* JADX WARN: Code duplicated, block: B:357:0x23d0  */
    /* JADX WARN: Code duplicated, block: B:362:0x24f2  */
    /* JADX WARN: Code duplicated, block: B:364:0x24fb  */
    /* JADX WARN: Code duplicated, block: B:369:0x256c  */
    /* JADX WARN: Code duplicated, block: B:370:0x25b4  */
    /* JADX WARN: Code duplicated, block: B:373:0x25cc  */
    /* JADX WARN: Code duplicated, block: B:377:0x261e  */
    /* JADX WARN: Code duplicated, block: B:381:0x2633  */
    /* JADX WARN: Code duplicated, block: B:383:0x26a8  */
    /* JADX WARN: Code duplicated, block: B:386:0x26f2  */
    /* JADX WARN: Code duplicated, block: B:388:0x26fb  */
    /* JADX WARN: Code duplicated, block: B:391:0x27a9  */
    /* JADX WARN: Code duplicated, block: B:392:0x27ab  */
    /* JADX WARN: Code duplicated, block: B:398:0x27bb  */
    /* JADX WARN: Code duplicated, block: B:402:0x2850  */
    /* JADX WARN: Code duplicated, block: B:404:0x2859  */
    /* JADX WARN: Code duplicated, block: B:409:0x28c6  */
    /* JADX WARN: Code duplicated, block: B:410:0x2904  */
    /* JADX WARN: Code duplicated, block: B:413:0x291c  */
    /* JADX WARN: Code duplicated, block: B:417:0x296e  */
    /* JADX WARN: Code duplicated, block: B:421:0x2983  */
    /* JADX WARN: Code duplicated, block: B:423:0x29f3  */
    /* JADX WARN: Code duplicated, block: B:426:0x2a44  */
    /* JADX WARN: Code duplicated, block: B:428:0x2a57  */
    /* JADX WARN: Code duplicated, block: B:431:0x2b18  */
    /* JADX WARN: Code duplicated, block: B:435:0x2bb8  */
    /* JADX WARN: Code duplicated, block: B:440:0x2c26  */
    /* JADX WARN: Code duplicated, block: B:443:0x2c76  */
    /* JADX WARN: Code duplicated, block: B:447:0x2ccd  */
    /* JADX WARN: Code duplicated, block: B:449:0x31a8  */
    /* JADX WARN: Code duplicated, block: B:451:0x31b4  */
    /* JADX WARN: Code duplicated, block: B:454:0x31b8 A[LOOP:0: B:452:0x31b5->B:454:0x31b8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:459:0x31d0  */
    /* JADX WARN: Code duplicated, block: B:461:0x31dc  */
    /* JADX WARN: Code duplicated, block: B:464:0x31e0 A[LOOP:1: B:462:0x31dd->B:464:0x31e0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:467:0x31ea  */
    /* JADX WARN: Code duplicated, block: B:469:0x31f6  */
    /* JADX WARN: Code duplicated, block: B:472:0x31fa A[LOOP:2: B:470:0x31f7->B:472:0x31fa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:475:0x3204  */
    /* JADX WARN: Code duplicated, block: B:477:0x3210  */
    /* JADX WARN: Code duplicated, block: B:479:0x321c  */
    /* JADX WARN: Code duplicated, block: B:480:0x321e  */
    /* JADX WARN: Code duplicated, block: B:483:0x3222 A[LOOP:3: B:481:0x321f->B:483:0x3222, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:488:0x323a  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context p0, Intent p1) throws Throwable {
        Object[] objArr;
        Context context;
        Object[] objArr2;
        Object[] objArr3;
        int i;
        Context applicationContext;
        Object[] objArr4;
        Object[] objArr5;
        Object[] objArr6;
        String str;
        Object[] objArr7;
        Object[] objArr8;
        int i2;
        int i3;
        Object[] objArr9;
        Context applicationContext2;
        Object[] objArr10;
        int i4;
        int i5;
        Object[] objArr11;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        long j;
        long jLongValue;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        Object[] objArr12;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9;
        int i6;
        int i7;
        int i8;
        ArrayList arrayList;
        String[] strArr;
        int i9;
        int i10;
        Object[] objArr13;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10;
        long j2;
        long jLongValue2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11;
        Context applicationContext3;
        String str2;
        Object[] objArr14;
        Object[] objArr15;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14;
        int i11;
        ArrayList arrayList2;
        String[] strArr2;
        int i12;
        Object[] objArr16;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15;
        Object[] objArr17;
        Object[] objArr18;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18;
        ArrayList arrayList3;
        String[] strArr3;
        int i13;
        Object[] objArr19;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19;
        Object[] objArr20;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22;
        int i14;
        int i15;
        ArrayList arrayList4;
        String[] strArr4;
        int i16;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26;
        int i17 = 2 % 2;
        Object[] objArr21 = new Object[1];
        a(new char[]{0, 0, 0, 0}, new char[]{57152, 42726, 25773, 51222}, (char) (Process.getGidForName("") + 1), ExpandableListView.getPackedPositionGroup(0L), new char[]{50241, 3825, 26462, 13658, 50695, 10504, 42606, 42657, 31440, 8067, 19177, 22273, 32060, 23236, 9144, 28136, 20795, 17682, 30957, 32361, 9723, 25743}, objArr21);
        String str3 = (String) objArr21[0];
        Object[] objArr22 = new Object[1];
        a(new char[]{0, 0, 0, 0}, new char[]{24128, 15917, 54530, 50348}, (char) (44245 - View.combineMeasuredStates(0, 0)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 37629277, new char[]{54766, 52424, 22970, 26017, 55843, 53925, 24015, 60237, 41945, 63560, 8267, 25937, 57382, 29234, 13968}, objArr22);
        String str4 = (String) objArr22[0];
        Object[] objArr23 = new Object[1];
        a(new char[]{0, 0, 0, 0}, new char[]{32007, 10781, 62808, 57259}, (char) (44020 - ImageFormat.getBitsPerPixel(0)), Color.green(0), new char[]{24757, 56243, 59961, 64122, 10326, 21119, 28306, 38762, 6912, 10066, 52740, 27505, 36961, 28663, 14358, 38925}, objArr23);
        String str5 = (String) objArr23[0];
        Object[] objArr24 = new Object[1];
        a(new char[]{0, 0, 0, 0}, new char[]{39481, 38351, 24538, 40612}, (char) (42079 - (ViewConfiguration.getPressedStateDuration() >> 16)), ViewConfiguration.getJumpTapTimeout() >> 16, new char[]{65415, 51007, 34524, 6239, 4394, 61824, 9205, 60996, 58981, 33663, 46740, 51447, 64256, 51435, 59309, 21928}, objArr24);
        String str6 = (String) objArr24[0];
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
            char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
            int i18 = 1031 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i19 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14;
            byte b2 = $$a[7];
            short s = (short) (b2 | 210);
            Object[] objArr25 = new Object[1];
            c(b2, s, (byte) (s >>> 2), objArr25);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(cIndexOf, i18, i19, 1357589585, false, (String) objArr25[0], null);
        }
        long j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).getLong(null);
        long jLongValue3 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
            char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int deadChar = KeyEvent.getDeadChar(0, 0) + 1031;
            int mirror = AndroidCharacter.getMirror('0') - '!';
            byte b3 = $$a[7];
            Object[] objArr26 = new Object[1];
            c(b3, (short) (b3 | 158), (byte) 52, objArr26);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(minimumFlingVelocity, deadChar, mirror, 1344079056, false, (String) objArr26[0], null);
        }
        if (j3 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                int mode = 1031 - View.MeasureSpec.getMode(0);
                int packedPositionGroup = 15 - ExpandableListView.getPackedPositionGroup(0L);
                Object[] objArr27 = new Object[1];
                c((byte) 14, (short) ($$b & 494), $$a[7], objArr27);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(fadingEdgeLength, mode, packedPositionGroup, 632103528, false, (String) objArr27[0], null);
            }
            Object[] objArr28 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).get(null);
            objArr = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i20 = ((int[]) objArr28[3])[0];
            int i21 = ((int[]) objArr28[1])[0];
            String[] strArr5 = (String[]) objArr28[0];
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i22 = 1606224309 + (((~(startElapsedRealtime | 1001021794)) | 756741624) * (-668)) + ((1001021794 | (~(756741624 | startElapsedRealtime))) * 1336) + ((startElapsedRealtime | 1069217274) * 668) + 306957957;
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr[2])[0] = i24 ^ (i24 << 5);
            int i25 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 27;
            TuitionPaymentFragmentbindingInflater1 = i25 % 128;
            int i26 = i25 % 2;
        } else {
            int iIntValue = ((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr29 = {1938217275};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b((char) (46037 - TextUtils.lastIndexOf("", '0', 0, 0)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1134, 18 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr30 = {Integer.valueOf(iIntValue), 0, 306957957, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).newInstance(objArr29), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                    char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                    int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 1031;
                    int i27 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 15;
                    byte b4 = $$a[7];
                    short s2 = (short) (b4 | 210);
                    Object[] objArr31 = new Object[1];
                    c(b4, s2, (byte) (s2 >>> 2), objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(offsetBefore, iResolveSizeAndState, i27, 1298546779, false, (String) objArr31[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (Process.myTid() >> 22)), 1117 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 17), Boolean.TYPE});
                }
                objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).invoke(null, objArr30);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                    char cAlpha = (char) Color.alpha(0);
                    int iRgb = (-16776185) - Color.rgb(0, 0, 0);
                    int iLastIndexOf = 14 - TextUtils.lastIndexOf("", '0');
                    Object[] objArr32 = new Object[1];
                    c((byte) 14, (short) ($$b & 494), $$a[7], objArr32);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(cAlpha, iRgb, iLastIndexOf, 632103528, false, (String) objArr32[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).set(null, objArr);
                try {
                    long jLongValue4 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue4);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                        char deadChar2 = (char) KeyEvent.getDeadChar(0, 0);
                        int maximumDrawingCacheSize = 1031 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int i28 = 14 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        byte b5 = $$a[7];
                        Object[] objArr33 = new Object[1];
                        c(b5, (short) (b5 | 158), (byte) 52, objArr33);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(deadChar2, maximumDrawingCacheSize, i28, 1344079056, false, (String) objArr33[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue4 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
                        char cGreen = (char) Color.green(0);
                        int i29 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1030;
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 15;
                        byte b6 = $$a[7];
                        short s3 = (short) (b6 | 210);
                        Object[] objArr34 = new Object[1];
                        c(b6, s3, (byte) (s3 >>> 2), objArr34);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(cGreen, i29, scrollBarSize, 1357589585, false, (String) objArr34[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
            ArrayList arrayList5 = new ArrayList();
            String[] strArr6 = (String[]) objArr[0];
            if (strArr6 != null) {
                for (String str7 : strArr6) {
                    arrayList5.add(str7);
                }
            }
            throw null;
        }
        int i30 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
        TuitionPaymentFragmentbindingInflater1 = i30 % 128;
        int i31 = i30 % 2;
        Object[] objArr35 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i32 = ((int[]) objArr[2])[0];
        int i33 = ((int[]) objArr[3])[0];
        int i34 = ((int[]) objArr[1])[0];
        String[] strArr7 = (String[]) objArr[0];
        int iIdentityHashCode = System.identityHashCode(this);
        int i35 = ~((-924243982) | iIdentityHashCode);
        int i36 = ~iIdentityHashCode;
        int i37 = i32 + (-1250821007) + ((i35 | (~((-679963812) | i36))) * (-1808)) + (((~((-386961421) | iIdentityHashCode)) | (~(i36 | (-142681251)))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~(iIdentityHashCode | 679963811)) | 537282561 | (~(924243981 | i36))) * TypedValues.Custom.TYPE_BOOLEAN);
        int i38 = (i37 << 13) ^ i37;
        int i39 = i38 ^ (i38 >>> 17);
        ((int[]) objArr35[2])[0] = i39 ^ (i39 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
            char cMyTid = (char) (31533 - (Process.myTid() >> 22));
            int gidForName = Process.getGidForName("") + 922;
            int packedPositionChild = 27 - ExpandableListView.getPackedPositionChild(0L);
            Object[] objArr36 = new Object[1];
            c((byte) 14, (short) ($$b & 494), $$a[7], objArr36);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(cMyTid, gidForName, packedPositionChild, -1048449946, false, (String) objArr36[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                char edgeSlop = (char) (31533 - (ViewConfiguration.getEdgeSlop() >> 16));
                int iMyTid = (Process.myTid() >> 22) + 921;
                int mirror2 = 'L' - AndroidCharacter.getMirror('0');
                byte[] bArr = $$a;
                byte b7 = bArr[7];
                Object[] objArr37 = new Object[1];
                c(b7, (short) (b7 | 106), (byte) (bArr[208] - 1), objArr37);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(edgeSlop, iMyTid, mirror2, -1142834547, false, (String) objArr37[0], null);
            }
            Object[] objArr38 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).get(null);
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr38[1])[0]}, (Object[]) objArr38[2], new int[]{((int[]) objArr38[3])[0]}, (String[]) objArr38[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i40 = ~iIdentityHashCode2;
            int i41 = (-809671535) + (((~(i40 | 712277361)) | (-1065221500) | (~((-708858145) | iIdentityHashCode2))) * 717) + (((~(iIdentityHashCode2 | 712277361)) | (~(i40 | (-708858145))) | (-1065221500)) * 717) + 1933875745;
            int i42 = (i41 << 13) ^ i41;
            int i43 = i42 ^ (i42 >>> 17);
            ((int[]) objArr2[0])[0] = i43 ^ (i43 << 5);
            context = p0;
            objArr35 = objArr35;
        } else {
            context = p0;
            try {
                Object[] objArr39 = {context != null ? ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : p0.getApplicationContext() : context, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), 0, 1933875745};
                short s4 = (short) TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE;
                byte[] bArr2 = $$d;
                byte b8 = bArr2[72];
                Object[] objArr40 = new Object[1];
                d(s4, b8, (byte) (b8 | 16), objArr40);
                Class<?> cls = Class.forName((String) objArr40[0]);
                Object[] objArr41 = new Object[1];
                d((short) 367, bArr2[76], (byte) (-bArr2[2]), objArr41);
                Object[] objArr42 = (Object[]) cls.getMethod((String) objArr41[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr39);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                    char c = (char) (31533 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                    int i44 = 920 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    int iArgb = 28 - Color.argb(0, 0, 0, 0);
                    byte[] bArr3 = $$a;
                    byte b9 = bArr3[7];
                    Object[] objArr43 = new Object[1];
                    c(b9, (short) (b9 | 106), (byte) (bArr3[208] - 1), objArr43);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(c, i44, iArgb, -1142834547, false, (String) objArr43[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).set(null, objArr42);
                try {
                    long jLongValue5 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf3 = Long.valueOf(jLongValue5);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                        char mode2 = (char) (31533 - View.MeasureSpec.getMode(0));
                        int scrollBarSize2 = (ViewConfiguration.getScrollBarSize() >> 8) + 921;
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 28;
                        byte b10 = $$a[7];
                        Object[] objArr44 = new Object[1];
                        c(b10, (short) (b10 | 158), (byte) 52, objArr44);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(mode2, scrollBarSize2, iKeyCodeFromString, -778300370, false, (String) objArr44[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).set(null, lValueOf3);
                    Long lValueOf4 = Long.valueOf(jLongValue5 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                        char mode3 = (char) (View.MeasureSpec.getMode(0) + 31533);
                        int i45 = 921 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 28;
                        Object[] objArr45 = new Object[1];
                        c((byte) 14, (short) ($$b & 494), $$a[7], objArr45);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(mode3, i45, windowTouchSlop, -1048449946, false, (String) objArr45[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).set(null, lValueOf4);
                    objArr2 = objArr42;
                } catch (Exception unused2) {
                    throw new RuntimeException();
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i46 = ((int[]) objArr2[1])[0];
        int i47 = ((int[]) objArr2[3])[0];
        if (i47 == i46) {
            int i48 = ((int[]) objArr2[0])[0];
            objArr3 = new Object[]{new int[1], new int[]{((int[]) objArr2[1])[0]}, (Object[]) objArr2[2], new int[]{((int[]) objArr2[3])[0]}, (String[]) objArr2[4]};
            int startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
            int i49 = ~startElapsedRealtime2;
            int i50 = i48 + (((1053551265 + (((~((-1631537670) | i49)) | (~((-142541975) | startElapsedRealtime2))) * (-370))) + ((((~(startElapsedRealtime2 | (-1631537670))) | (~(i49 | (-142541975)))) | (-1769950872)) * (-370))) - 2046793648);
            int i51 = (i50 << 13) ^ i50;
            int i52 = i51 ^ (i51 >>> 17);
            i = 0;
            ((int[]) objArr3[0])[0] = i52 ^ (i52 << 5);
        } else {
            ArrayList arrayList6 = new ArrayList();
            String[] strArr8 = (String[]) objArr2[4];
            if (strArr8 != null) {
                for (String str8 : strArr8) {
                    arrayList6.add(str8);
                }
            }
            int[] iArr = new int[i47];
            int i53 = i47 - 1;
            iArr[i53] = 1;
            Toast.makeText((Context) null, iArr[((i47 * i53) % 2) - 1], 1).show();
            int i54 = ((int[]) objArr2[0])[0];
            objArr3 = new Object[]{new int[1], new int[]{((int[]) objArr2[1])[0]}, (Object[]) objArr2[2], new int[]{((int[]) objArr2[3])[0]}, (String[]) objArr2[4]};
            int i55 = ~new Random().nextInt(1392787393);
            int i56 = i54 + (((~((-1008138786) | i55)) | 738611232) * (-241)) + 1394254849 + (((~(i55 | (-269527554))) | 27329626) * 241);
            int i57 = (i56 << 13) ^ i56;
            int i58 = i57 ^ (i57 >>> 17);
            i = 0;
            ((int[]) objArr3[0])[0] = i58 ^ (i58 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
            char packedPositionGroup2 = (char) (ExpandableListView.getPackedPositionGroup(0L) + 53893);
            int i59 = 1320 - (CdmaCellLocation.convertQuartSecToDecDegrees(i) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i) == 0.0d ? 0 : -1));
            int i60 = 37 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            Object[] objArr46 = new Object[1];
            c((byte) 14, (short) ($$b & 494), $$a[7], objArr46);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(packedPositionGroup2, i59, i60, -1433084963, false, (String) objArr46[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 53893);
                int iKeyCodeFromString2 = 1320 - KeyEvent.keyCodeFromString("");
                int scrollBarSize3 = (ViewConfiguration.getScrollBarSize() >> 8) + 36;
                byte b11 = $$a[7];
                Object[] objArr47 = new Object[1];
                c(b11, (short) (b11 | 158), (byte) 52, objArr47);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(cMakeMeasureSpec, iKeyCodeFromString2, scrollBarSize3, -1920778747, false, (String) objArr47[0], null);
            }
            Object[] objArr48 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).get(null);
            objArr4 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i61 = ((int[]) objArr48[0])[0];
            int i62 = ((int[]) objArr48[3])[0];
            String[] strArr9 = (String[]) objArr48[2];
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i63 = ~iIdentityHashCode3;
            int i64 = (-532873018) + ((~((-1307060208) | i63)) * 979) + ((iIdentityHashCode3 | 63567617) * (-979)) + (((~(iIdentityHashCode3 | (-1307060208))) | (~(i63 | 63567617))) * 979) + 1212167984;
            int i65 = (i64 << 13) ^ i64;
            int i66 = i65 ^ (i65 >>> 17);
            ((int[]) objArr4[1])[0] = i66 ^ (i66 << 5);
            objArr3 = objArr3;
        } else {
            if (context != null) {
                int i67 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
                TuitionPaymentFragmentbindingInflater1 = i67 % 128;
                int i68 = i67 % 2;
                applicationContext = ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : p0.getApplicationContext();
            } else {
                applicationContext = context;
            }
            int iIntValue2 = ((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue();
            Object[] objArr49 = {1938217275};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b((char) (47977 - (Process.myPid() >> 22)), TextUtils.indexOf("", "", 0) + 1300, 21 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -420973425, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr50 = {applicationContext, "com.bpjstku", 1212167984, Integer.valueOf(iIntValue2), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).newInstance(objArr49), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                char cIndexOf2 = (char) (TextUtils.indexOf("", "", 0) + 53893);
                int absoluteGravity = 1320 - Gravity.getAbsoluteGravity(0, 0);
                int iKeyCodeFromString3 = 36 - KeyEvent.keyCodeFromString("");
                byte b12 = $$a[7];
                Object[] objArr51 = new Object[1];
                c(b12, (short) (b12 | 158), (byte) 52, objArr51);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(cIndexOf2, absoluteGravity, iKeyCodeFromString3, 819724799, false, (String) objArr51[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (57878 - TextUtils.getTrimmedLength("")), TextUtils.getOffsetAfter("", 0) + 1394, 75 - (ViewConfiguration.getJumpTapTimeout() >> 16)), Boolean.TYPE});
            }
            Object[] objArr52 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).invoke(null, objArr50);
            if (applicationContext != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                    char c2 = (char) (53894 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    int maximumFlingVelocity = 1320 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int fadingEdgeLength2 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 36;
                    byte b13 = $$a[7];
                    Object[] objArr53 = new Object[1];
                    c(b13, (short) (b13 | 158), (byte) 52, objArr53);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(c2, maximumFlingVelocity, fadingEdgeLength2, -1920778747, false, (String) objArr53[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).set(null, objArr52);
                try {
                    long jLongValue6 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf5 = Long.valueOf(jLongValue6);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                        char edgeSlop2 = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 53893);
                        int i69 = 1321 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L) + 37;
                        byte[] bArr4 = $$a;
                        byte b14 = bArr4[7];
                        Object[] objArr54 = new Object[1];
                        c(b14, (short) (b14 | 106), (byte) (bArr4[208] - 1), objArr54);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(edgeSlop2, i69, packedPositionChild2, -1273706634, false, (String) objArr54[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).set(null, lValueOf5);
                    Long lValueOf6 = Long.valueOf(jLongValue6 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
                        char tapTimeout = (char) (53893 - (ViewConfiguration.getTapTimeout() >> 16));
                        int i70 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1319;
                        int capsMode = TextUtils.getCapsMode("", 0, 0) + 36;
                        Object[] objArr55 = new Object[1];
                        c((byte) 14, (short) ($$b & 494), $$a[7], objArr55);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(tapTimeout, i70, capsMode, -1433084963, false, (String) objArr55[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).set(null, lValueOf6);
                } catch (Exception unused3) {
                    throw new RuntimeException();
                }
            } else {
                objArr52 = objArr52;
                objArr3 = objArr3;
            }
            objArr4 = objArr52;
        }
        int i71 = ((int[]) objArr4[3])[0];
        int i72 = ((int[]) objArr4[0])[0];
        if (i72 == i71) {
            objArr5 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i73 = ((int[]) objArr4[1])[0];
            int i74 = ((int[]) objArr4[0])[0];
            int i75 = ((int[]) objArr4[3])[0];
            String[] strArr10 = (String[]) objArr4[2];
            int i76 = ~((int) SystemClock.elapsedRealtime());
            int i77 = i73 + 1910425808 + (((~(i76 | 511897038)) | (-1068498415)) * (-160)) + (((~(i76 | (-858730787))) | 511897038) * 160);
            int i78 = (i77 << 13) ^ i77;
            int i79 = i78 ^ (i78 >>> 17);
            ((int[]) objArr5[1])[0] = i79 ^ (i79 << 5);
        } else {
            int[] iArr2 = new int[i72];
            int i80 = i72 - 1;
            iArr2[i80] = 1;
            Toast.makeText((Context) null, iArr2[((i72 * i80) % 2) - 1], 1).show();
            objArr5 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i81 = ((int[]) objArr4[1])[0];
            int i82 = ((int[]) objArr4[0])[0];
            int i83 = ((int[]) objArr4[3])[0];
            String[] strArr11 = (String[]) objArr4[2];
            int iIdentityHashCode4 = System.identityHashCode(this);
            int i84 = i81 + 2141347905 + (((~(iIdentityHashCode4 | 1305716847)) | 64910977) * 191) + (((~((~iIdentityHashCode4) | 1305716847)) | 34363008) * 191);
            int i85 = (i84 << 13) ^ i84;
            int i86 = i85 ^ (i85 >>> 17);
            ((int[]) objArr5[1])[0] = i86 ^ (i86 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
            char doubleTapTimeout = (char) (29944 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
            int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1755;
            int iIndexOf = 23 - TextUtils.indexOf("", "", 0);
            byte[] bArr5 = $$a;
            byte b15 = bArr5[7];
            Object[] objArr56 = new Object[1];
            c(b15, (short) (b15 | 106), (byte) (bArr5[208] - 1), objArr56);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(doubleTapTimeout, doubleTapTimeout2, iIndexOf, 986134021, false, (String) objArr56[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                char doubleTapTimeout3 = (char) (29944 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                int i87 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1755;
                int iGreen = 23 - Color.green(0);
                byte b16 = $$a[7];
                Object[] objArr57 = new Object[1];
                c(b16, (short) (b16 | 158), (byte) 52, objArr57);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(doubleTapTimeout3, i87, iGreen, 1599039318, false, (String) objArr57[0], null);
            }
            Object[] objArr58 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).get(null);
            objArr6 = new Object[]{new int[]{((int[]) objArr58[0])[0]}, new int[]{((int[]) objArr58[1])[0]}, (Object[]) objArr58[2], new int[1], (String[]) objArr58[4]};
            int iIdentityHashCode5 = System.identityHashCode(this);
            int i88 = (((~((-242177168) | iIdentityHashCode5)) | 4408325) * (-283)) + 1460158400 + ((~(iIdentityHashCode5 | (-237768843))) * 283) + 584486991;
            int i89 = (i88 << 13) ^ i88;
            int i90 = i89 ^ (i89 >>> 17);
            ((int[]) objArr6[3])[0] = i90 ^ (i90 << 5);
            objArr5 = objArr5;
        } else {
            int iIntValue3 = ((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue();
            Object[] objArr59 = {1938217275};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 42049), 1726 - View.MeasureSpec.makeMeasureSpec(0, 0), 29 - View.resolveSize(0, 0), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArrTuitionPaymentFragmentbindingInflater1$7879113 = lambdastart1androidxcameravideointernalaudioAudioSource.TuitionPaymentFragmentbindingInflater1$7879113(iIntValue3, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).newInstance(objArr59), 584486991, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                char scrollBarSize4 = (char) (29944 - (ViewConfiguration.getScrollBarSize() >> 8));
                int iIndexOf2 = 1755 - TextUtils.indexOf("", "");
                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 23;
                byte b17 = $$a[7];
                Object[] objArr60 = new Object[1];
                c(b17, (short) (b17 | 158), (byte) 52, objArr60);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(scrollBarSize4, iIndexOf2, iResolveOpacity, 1599039318, false, (String) objArr60[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).set(null, objArrTuitionPaymentFragmentbindingInflater1$7879113);
            try {
                long jLongValue7 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf7 = Long.valueOf(jLongValue7);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
                    char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 29945);
                    int iIndexOf3 = 1755 - TextUtils.indexOf("", "", 0);
                    int iIndexOf4 = 22 - TextUtils.indexOf((CharSequence) "", '0');
                    byte b18 = $$a[7];
                    Object[] objArr61 = new Object[1];
                    c(b18, (short) (b18 | 69), (byte) 52, objArr61);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(bitsPerPixel, iIndexOf3, iIndexOf4, 1596667560, false, (String) objArr61[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).set(null, lValueOf7);
                Long lValueOf8 = Long.valueOf(jLongValue7 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
                    char bitsPerPixel2 = (char) (29943 - ImageFormat.getBitsPerPixel(0));
                    int iIndexOf5 = 1755 - TextUtils.indexOf("", "");
                    int mirror3 = 'G' - AndroidCharacter.getMirror('0');
                    byte[] bArr6 = $$a;
                    byte b19 = bArr6[7];
                    Object[] objArr62 = new Object[1];
                    c(b19, (short) (b19 | 106), (byte) (bArr6[208] - 1), objArr62);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(bitsPerPixel2, iIndexOf5, mirror3, 986134021, false, (String) objArr62[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).set(null, lValueOf8);
                objArr6 = objArrTuitionPaymentFragmentbindingInflater1$7879113;
            } catch (Exception unused4) {
                throw new RuntimeException();
            }
        }
        int i91 = ((int[]) objArr6[1])[0];
        int i92 = ((int[]) objArr6[0])[0];
        if (i92 != i91) {
            ArrayList arrayList7 = new ArrayList();
            String[] strArr12 = (String[]) objArr6[4];
            if (strArr12 != null) {
                for (String str9 : strArr12) {
                    arrayList7.add(str9);
                }
            }
            throw new RuntimeException(String.valueOf(i92));
        }
        int i93 = ((int[]) objArr6[3])[0];
        Object[] objArr63 = {new int[]{((int[]) objArr6[0])[0]}, new int[]{((int[]) objArr6[1])[0]}, (Object[]) objArr6[2], new int[1], (String[]) objArr6[4]};
        int iMyUid = Process.myUid();
        int i94 = i93 + ((((~((-802288929) | iMyUid)) | 587326496) * (-283)) - 1077723751) + ((~(iMyUid | (-214962433))) * 283);
        int i95 = (i94 << 13) ^ i94;
        int i96 = i95 ^ (i95 >>> 17);
        ((int[]) objArr63[3])[0] = i96 ^ (i96 << 5);
        int i97 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 33;
        TuitionPaymentFragmentbindingInflater1 = i97 % 128;
        int i98 = i97 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
            char cGreen2 = (char) Color.green(0);
            int iRgb2 = (-16776340) - Color.rgb(0, 0, 0);
            int modifierMetaStateMask = 9 - ((byte) KeyEvent.getModifierMetaStateMask());
            byte[] bArr7 = $$a;
            byte b20 = bArr7[7];
            Object[] objArr64 = new Object[1];
            c(b20, (short) (b20 | 106), (byte) (bArr7[208] - 1), objArr64);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(cGreen2, iRgb2, modifierMetaStateMask, -1650998592, false, (String) objArr64[0], null);
        }
        long j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).getLong(null);
        long jLongValue8 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
            char mode4 = (char) View.MeasureSpec.getMode(0);
            int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 877;
            int scrollBarFadeDuration = 10 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            byte b21 = $$a[7];
            Object[] objArr65 = new Object[1];
            c(b21, (short) (b21 | 158), (byte) 52, objArr65);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(mode4, iLastIndexOf2, scrollBarFadeDuration, 2012020043, false, (String) objArr65[0], null);
        }
        if (j4 == ((jLongValue8 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                char cIndexOf3 = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0, 0) + 877;
                int touchSlop = 10 - (ViewConfiguration.getTouchSlop() >> 8);
                byte b22 = $$a[7];
                short s5 = (short) (b22 | 210);
                Object[] objArr66 = new Object[1];
                c(b22, s5, (byte) (s5 >>> 2), objArr66);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(cIndexOf3, iLastIndexOf3, touchSlop, 2012931276, false, (String) objArr66[0], null);
            }
            Object[] objArr67 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).get(null);
            objArr7 = new Object[]{new int[]{((int[]) objArr67[0])[0]}, new int[1], new int[]{((int[]) objArr67[2])[0]}, (String[]) objArr67[3]};
            int iMyUid2 = Process.myUid();
            int i99 = ~iMyUid2;
            int i100 = (((1854270488 + (((~(5850942 | i99)) | 46161171) * (-90))) + (((~(5850942 | iMyUid2)) | 1638956) * (-45))) + ((((~(iMyUid2 | (-46161172))) | 5850942) | (~(i99 | 46161171))) * 45)) - 1645271261;
            int i101 = (i100 << 13) ^ i100;
            int i102 = i101 ^ (i101 >>> 17);
            ((int[]) objArr7[1])[0] = i102 ^ (i102 << 5);
            str = str4;
        } else {
            Context applicationContext4 = context != null ? ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : p0.getApplicationContext() : context;
            Object[] objArr68 = {applicationContext4, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), 0, -1645271261};
            byte[] bArr8 = $$d;
            Object[] objArr69 = new Object[1];
            d((short) 367, bArr8[72], bArr8[64], objArr69);
            Class<?> cls2 = Class.forName((String) objArr69[0]);
            byte b23 = (byte) ($$e & 62);
            Object[] objArr70 = new Object[1];
            d((short) 283, b23, (byte) (b23 + 4), objArr70);
            Object[] objArr71 = (Object[]) cls2.getMethod((String) objArr70[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr68);
            if (applicationContext4 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                    char minimumFlingVelocity2 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int iIndexOf6 = TextUtils.indexOf("", "") + 876;
                    int i103 = 10 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    byte b24 = $$a[7];
                    short s6 = (short) (b24 | 210);
                    Object[] objArr72 = new Object[1];
                    c(b24, s6, (byte) (s6 >>> 2), objArr72);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(minimumFlingVelocity2, iIndexOf6, i103, 2012931276, false, (String) objArr72[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).set(null, objArr71);
                try {
                    str = str4;
                    long jLongValue9 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf9 = Long.valueOf(jLongValue9);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                        char capsMode2 = (char) TextUtils.getCapsMode("", 0, 0);
                        int i104 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 876;
                        int maxKeyCode = 10 - (KeyEvent.getMaxKeyCode() >> 16);
                        byte b25 = $$a[7];
                        Object[] objArr73 = new Object[1];
                        c(b25, (short) (b25 | 158), (byte) 52, objArr73);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(capsMode2, i104, maxKeyCode, 2012020043, false, (String) objArr73[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).set(null, lValueOf9);
                    Long lValueOf10 = Long.valueOf(jLongValue9 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
                        char c3 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int i105 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 875;
                        int i106 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 9;
                        byte[] bArr9 = $$a;
                        byte b26 = bArr9[7];
                        Object[] objArr74 = new Object[1];
                        c(b26, (short) (b26 | 106), (byte) (bArr9[208] - 1), objArr74);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(c3, i105, i106, -1650998592, false, (String) objArr74[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).set(null, lValueOf10);
                } catch (Exception unused5) {
                    throw new RuntimeException();
                }
            } else {
                str = str4;
                objArr71 = objArr71;
            }
            objArr7 = objArr71;
        }
        int i107 = ((int[]) objArr7[2])[0];
        int i108 = ((int[]) objArr7[0])[0];
        if (i108 == i107) {
            int i109 = ((int[]) objArr7[1])[0];
            objArr8 = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode6 = System.identityHashCode(this);
            int i110 = ~((-67639513) | iIdentityHashCode6);
            int i111 = ~iIdentityHashCode6;
            int i112 = i109 + 1609606132 + ((i110 | (~(1068350459 | i111))) * 920) + (((~((-1041021177) | i111)) | 67639512) * 920) + (((~(iIdentityHashCode6 | 1068350459)) | (~((-67639513) | i111)) | (~((-973381665) | iIdentityHashCode6))) * 920);
            int i113 = (i112 << 13) ^ i112;
            int i114 = i113 ^ (i113 >>> 17);
            i2 = 1;
            i3 = 0;
            ((int[]) objArr8[1])[0] = i114 ^ (i114 << 5);
        } else {
            int[] iArr3 = new int[i108];
            int i115 = i108 - 1;
            iArr3[i115] = 1;
            Toast.makeText((Context) null, iArr3[((i108 * i115) % 2) - 1], 1).show();
            int i116 = ((int[]) objArr7[1])[0];
            objArr8 = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int startElapsedRealtime3 = (int) Process.getStartElapsedRealtime();
            int i117 = i116 + ((((~((-981118326) | startElapsedRealtime3)) | 940737824) * (-566)) - 78026092) + ((~(startElapsedRealtime3 | (-40380502))) * 566);
            int i118 = (i117 << 13) ^ i117;
            int i119 = i118 ^ (i118 >>> 17);
            i2 = 1;
            i3 = 0;
            ((int[]) objArr8[1])[0] = i119 ^ (i119 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
            char cAxisFromString = (char) (MotionEvent.axisFromString("") + i2);
            int iIndexOf7 = 875 - TextUtils.indexOf((CharSequence) "", '0', i3, i3);
            int iAlpha = 10 - Color.alpha(i3);
            byte[] bArr10 = $$a;
            Object[] objArr75 = new Object[1];
            c((byte) (-bArr10[205]), (short) (-bArr10[8]), (byte) (-bArr10[9]), objArr75);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(cAxisFromString, iIndexOf7, iAlpha, -1199417970, false, (String) objArr75[0], null);
        }
        long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).getLong(null);
        long jLongValue10 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
            char mirror4 = (char) ('0' - AndroidCharacter.getMirror('0'));
            int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 876;
            int minimumFlingVelocity3 = 10 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            byte[] bArr11 = $$a;
            Object[] objArr76 = new Object[1];
            c((byte) (-bArr11[33]), bArr11[129], bArr11[7], objArr76);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(mirror4, jumpTapTimeout, minimumFlingVelocity3, 254769921, false, (String) objArr76[0], null);
        }
        if (j5 == ((jLongValue10 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).getLong(null) << 52) >>> 52)) >> 12)) {
            int i120 = TuitionPaymentFragmentbindingInflater1 + 17;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i120 % 128;
            int i121 = i120 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                char defaultSize = (char) View.getDefaultSize(0, 0);
                int defaultSize2 = View.getDefaultSize(0, 0) + 876;
                int iResolveOpacity2 = 10 - Drawable.resolveOpacity(0, 0);
                byte[] bArr12 = $$a;
                byte b27 = (byte) (-bArr12[205]);
                short s7 = bArr12[129];
                Object[] objArr77 = new Object[1];
                c(b27, s7, (byte) s7, objArr77);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(defaultSize, defaultSize2, iResolveOpacity2, 1324201839, false, (String) objArr77[0], null);
            }
            Object[] objArr78 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).get(null);
            objArr9 = new Object[]{new int[]{((int[]) objArr78[0])[0]}, new int[1], new int[]{((int[]) objArr78[2])[0]}, (String[]) objArr78[3]};
            int iIdentityHashCode7 = System.identityHashCode(this);
            int i122 = (-496659836) + (((~((-876953663) | iIdentityHashCode7)) | 836643433) * (-318));
            int i123 = ~(836643433 | iIdentityHashCode7);
            int i124 = ~iIdentityHashCode7;
            int i125 = i122 + ((i123 | (~((-26880578) | i124))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iIdentityHashCode7 | (-26880578))) | (~(903834239 | i124))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + 551416382;
            int i126 = (i125 << 13) ^ i125;
            int i127 = i126 ^ (i126 >>> 17);
            ((int[]) objArr9[1])[0] = i127 ^ (i127 << 5);
        } else {
            Object[] objArr79 = {Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), 551416382};
            byte[] bArr13 = $$d;
            Object[] objArr80 = new Object[1];
            d((short) 231, bArr13[72], bArr13[22], objArr80);
            Class<?> cls3 = Class.forName((String) objArr80[0]);
            byte b28 = (byte) ($$e & 62);
            Object[] objArr81 = new Object[1];
            d((short) 201, b28, (byte) (b28 + 4), objArr81);
            objArr9 = (Object[]) cls3.getMethod((String) objArr81[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr79);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                int i128 = 877 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                int iNormalizeMetaState = 10 - KeyEvent.normalizeMetaState(0);
                byte[] bArr14 = $$a;
                byte b29 = (byte) (-bArr14[205]);
                short s8 = bArr14[129];
                Object[] objArr82 = new Object[1];
                c(b29, s8, (byte) s8, objArr82);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(pressedStateDuration, i128, iNormalizeMetaState, 1324201839, false, (String) objArr82[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).set(null, objArr9);
            try {
                long jLongValue11 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf11 = Long.valueOf(jLongValue11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                    char modifierMetaStateMask2 = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                    int touchSlop2 = 876 - (ViewConfiguration.getTouchSlop() >> 8);
                    int mirror5 = ':' - AndroidCharacter.getMirror('0');
                    byte[] bArr15 = $$a;
                    Object[] objArr83 = new Object[1];
                    c((byte) (-bArr15[33]), bArr15[129], bArr15[7], objArr83);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(modifierMetaStateMask2, touchSlop2, mirror5, 254769921, false, (String) objArr83[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).set(null, lValueOf11);
                Long lValueOf12 = Long.valueOf(jLongValue11 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                    char cIndexOf4 = (char) TextUtils.indexOf("", "");
                    int iNormalizeMetaState2 = 876 - KeyEvent.normalizeMetaState(0);
                    int offsetBefore2 = TextUtils.getOffsetBefore("", 0) + 10;
                    byte[] bArr16 = $$a;
                    Object[] objArr84 = new Object[1];
                    c((byte) (-bArr16[205]), (short) (-bArr16[8]), (byte) (-bArr16[9]), objArr84);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(cIndexOf4, iNormalizeMetaState2, offsetBefore2, -1199417970, false, (String) objArr84[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).set(null, lValueOf12);
            } catch (Exception unused6) {
                throw new RuntimeException();
            }
        }
        if (((int[]) objArr9[0])[0] != ((int[]) objArr9[2])[0]) {
            ArrayList arrayList8 = new ArrayList();
            String[] strArr13 = (String[]) objArr9[3];
            if (strArr13 != null) {
                for (String str10 : strArr13) {
                    arrayList8.add(str10);
                }
            }
            throw null;
        }
        int i129 = ((int[]) objArr9[1])[0];
        Object[] objArr85 = {new int[]{((int[]) objArr9[0])[0]}, new int[1], new int[]{((int[]) objArr9[2])[0]}, (String[]) objArr9[3]};
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i130 = ~iMaxMemory;
        int i131 = i129 + (-485348750) + (((~(i130 | (-445109421))) | 485419649) * (-1042)) + (((-445109421) | iMaxMemory) * 521) + (((~(iMaxMemory | (-485419650))) | 73935361 | (~(i130 | (-33625133)))) * 521);
        int i132 = (i131 << 13) ^ i131;
        int i133 = i132 ^ (i132 >>> 17);
        ((int[]) objArr85[1])[0] = i133 ^ (i133 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
            char cAlpha2 = (char) Color.alpha(0);
            int jumpTapTimeout2 = 876 - (ViewConfiguration.getJumpTapTimeout() >> 16);
            int iRed = Color.red(0) + 10;
            Object[] objArr86 = new Object[1];
            c((byte) 14, (short) ($$b & 494), $$a[7], objArr86);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(cAlpha2, jumpTapTimeout2, iRed, 252381699, false, (String) objArr86[0], null);
        }
        long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).getLong(null);
        long jLongValue12 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
            char tapTimeout2 = (char) (ViewConfiguration.getTapTimeout() >> 16);
            int tapTimeout3 = (ViewConfiguration.getTapTimeout() >> 16) + 876;
            int packedPositionChild3 = ExpandableListView.getPackedPositionChild(0L) + 11;
            byte b30 = $$a[7];
            Object[] objArr87 = new Object[1];
            c(b30, (short) (b30 | 69), (byte) 52, objArr87);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(tapTimeout2, tapTimeout3, packedPositionChild3, 2009631821, false, (String) objArr87[0], null);
        }
        if (j6 != ((jLongValue12 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).getLong(null) << 52) >>> 52)) >> 12)) {
            applicationContext2 = p0;
            Context applicationContext5 = applicationContext2 != null ? ((applicationContext2 instanceof ContextWrapper) && ((ContextWrapper) applicationContext2).getBaseContext() == null) ? null : p0.getApplicationContext() : applicationContext2;
            Object[] objArr88 = {applicationContext5, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), 1770697289};
            byte[] bArr17 = $$d;
            Object[] objArr89 = new Object[1];
            d((short) 149, bArr17[111], (byte) (-bArr17[2]), objArr89);
            Class<?> cls4 = Class.forName((String) objArr89[0]);
            Object[] objArr90 = new Object[1];
            d((short) 367, bArr17[76], (byte) (-bArr17[2]), objArr90);
            objArr10 = (Object[]) cls4.getMethod((String) objArr90[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr88);
            if (applicationContext5 != null) {
                int i134 = TuitionPaymentFragmentbindingInflater1 + 11;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i134 % 128;
                try {
                    if (i134 % 2 == 0) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                            char packedPositionGroup3 = (char) ExpandableListView.getPackedPositionGroup(0L);
                            int iArgb2 = Color.argb(0, 0, 0, 0) + 876;
                            int i135 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10;
                            byte[] bArr18 = $$a;
                            byte b31 = bArr18[10];
                            short s9 = bArr18[7];
                            Object[] objArr91 = new Object[1];
                            c(b31, s9, (byte) s9, objArr91);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(packedPositionGroup3, iArgb2, i135, 256017550, false, (String) objArr91[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).set(null, objArr10);
                        long jLongValue13 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[1])).longValue();
                        Long lValueOf13 = Long.valueOf(jLongValue13);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                            char minimumFlingVelocity4 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                            int doubleTapTimeout4 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 876;
                            int iMakeMeasureSpec = 10 - View.MeasureSpec.makeMeasureSpec(0, 0);
                            byte b32 = $$a[7];
                            Object[] objArr92 = new Object[1];
                            c(b32, (short) (b32 | 69), (byte) 52, objArr92);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(minimumFlingVelocity4, doubleTapTimeout4, iMakeMeasureSpec, 2009631821, false, (String) objArr92[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).set(null, lValueOf13);
                        Long lValueOf14 = Long.valueOf(jLongValue13 >> 66);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                            int iMyTid2 = 876 - (Process.myTid() >> 22);
                            int iMyPid = 10 - (Process.myPid() >> 22);
                            Object[] objArr93 = new Object[1];
                            c((byte) 14, (short) ($$b & 494), $$a[7], objArr93);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(cNormalizeMetaState, iMyTid2, iMyPid, 252381699, false, (String) objArr93[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).set(null, lValueOf14);
                    } else {
                        str6 = str6;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                            char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                            int i136 = 877 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            int iLastIndexOf4 = 9 - TextUtils.lastIndexOf("", '0', 0, 0);
                            byte[] bArr19 = $$a;
                            byte b33 = bArr19[10];
                            short s10 = bArr19[7];
                            Object[] objArr94 = new Object[1];
                            c(b33, s10, (byte) s10, objArr94);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(cCombineMeasuredStates, i136, iLastIndexOf4, 256017550, false, (String) objArr94[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).set(null, objArr10);
                        long jLongValue14 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf15 = Long.valueOf(jLongValue14);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault71 == null) {
                            char cMakeMeasureSpec2 = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                            int i137 = 876 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int tapTimeout4 = 10 - (ViewConfiguration.getTapTimeout() >> 16);
                            byte b34 = $$a[7];
                            Object[] objArr95 = new Object[1];
                            c(b34, (short) (b34 | 69), (byte) 52, objArr95);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.b(cMakeMeasureSpec2, i137, tapTimeout4, 2009631821, false, (String) objArr95[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault71).set(null, lValueOf15);
                        Long lValueOf16 = Long.valueOf(jLongValue14 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault72 == null) {
                            char edgeSlop3 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                            int fadingEdgeLength3 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 876;
                            int threadPriority = 10 - ((Process.getThreadPriority(0) + 20) >> 6);
                            Object[] objArr96 = new Object[1];
                            c((byte) 14, (short) ($$b & 494), $$a[7], objArr96);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.b(edgeSlop3, fadingEdgeLength3, threadPriority, 252381699, false, (String) objArr96[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault72).set(null, lValueOf16);
                    }
                } catch (Exception unused7) {
                    throw new RuntimeException();
                }
            }
            i4 = ((int[]) objArr10[2])[0];
            i5 = ((int[]) objArr10[0])[0];
            if (i5 == i4) {
                throw new RuntimeException(String.valueOf(i5));
            }
            int i138 = ((int[]) objArr10[1])[0];
            objArr11 = new Object[]{new int[]{((int[]) objArr10[0])[0]}, new int[1], new int[]{((int[]) objArr10[2])[0]}, (String[]) objArr10[3]};
            int iMyTid3 = Process.myTid();
            int i139 = ~iMyTid3;
            int i140 = i138 + (-219778240) + (((~(388480846 | i139)) | 428791075) * 226) + (((~(i139 | 531627887)) | (~((-428791076) | iMyTid3)) | 285644034) * (-113)) + ((~(iMyTid3 | 388480846)) * 113);
            int i141 = (i140 << 13) ^ i140;
            int i142 = i141 ^ (i141 >>> 17);
            ((int[]) objArr11[1])[0] = i142 ^ (i142 << 5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char edgeSlop4 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                int iAlpha2 = Color.alpha(0) + 651;
                int iIndexOf8 = 44 - TextUtils.indexOf("", "", 0, 0);
                byte b35 = $$a[7];
                Object[] objArr97 = new Object[1];
                c(b35, (short) (b35 | 69), (byte) 52, objArr97);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(edgeSlop4, iAlpha2, iIndexOf8, -459846511, false, (String) objArr97[0], null);
            }
            j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            jLongValue = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char maxKeyCode2 = (char) (KeyEvent.getMaxKeyCode() >> 16);
                int offsetBefore3 = 651 - TextUtils.getOffsetBefore("", 0);
                int iLastIndexOf5 = 43 - TextUtils.lastIndexOf("", '0');
                Object[] objArr98 = new Object[1];
                c((byte) 14, (short) ($$b & 494), $$a[7], objArr98);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maxKeyCode2, offsetBefore3, iLastIndexOf5, -873460649, false, (String) objArr98[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                    char c4 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int bitsPerPixel3 = 650 - ImageFormat.getBitsPerPixel(0);
                    int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 44;
                    byte[] bArr20 = $$a;
                    byte b36 = bArr20[7];
                    Object[] objArr99 = new Object[1];
                    c(b36, (short) (b36 | 106), (byte) (bArr20[208] - 1), objArr99);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(c4, bitsPerPixel3, scrollBarFadeDuration2, -1595579076, false, (String) objArr99[0], null);
                }
                Object[] objArr100 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).get(null);
                objArr12 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i143 = ((int[]) objArr100[2])[0];
                int i144 = ((int[]) objArr100[0])[0];
                int iIdentityHashCode8 = System.identityHashCode(this);
                int i145 = ~iIdentityHashCode8;
                int i146 = (~((-147925210) | i145)) | 143656985;
                int i147 = ~(iIdentityHashCode8 | 148762623);
                int i148 = (-1954785478) + ((i146 | i147) * (-713)) + (i147 * 1426) + ((~(144494399 | i145)) * 713) + 409017455;
                int i149 = (i148 << 13) ^ i148;
                int i150 = i149 ^ (i149 >>> 17);
                ((int[]) objArr12[3])[0] = i150 ^ (i150 << 5);
                i6 = 0;
            } else {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.getCapsMode("", 0, 0) + 1610, Drawable.resolveOpacity(0, 0) + 26, 2145681644, false, null, new Class[0]);
                }
                Object[] objArr101 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(null), 409017455, 0};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char scrollBarFadeDuration3 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int maxKeyCode3 = (KeyEvent.getMaxKeyCode() >> 16) + 651;
                    int modifierMetaStateMask3 = 43 - ((byte) KeyEvent.getModifierMetaStateMask());
                    Object[] objArr102 = new Object[1];
                    c((byte) 14, (short) ($$b & 494), $$a[7], objArr102);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollBarFadeDuration3, maxKeyCode3, modifierMetaStateMask3, 2075921419, false, (String) objArr102[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getTapTimeout() >> 16) + 695, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 97), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 63406), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 792, 84 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), Integer.TYPE, Integer.TYPE});
                }
                objArr12 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr101);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c5 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int i151 = 650 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 44;
                    byte[] bArr21 = $$a;
                    byte b37 = bArr21[7];
                    Object[] objArr103 = new Object[1];
                    c(b37, (short) (b37 | 106), (byte) (bArr21[208] - 1), objArr103);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c5, i151, pressedStateDuration2, -1595579076, false, (String) objArr103[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArr12);
                try {
                    long jLongValue15 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf17 = Long.valueOf(jLongValue15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char deadChar3 = (char) KeyEvent.getDeadChar(0, 0);
                        int i152 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 651;
                        int offsetBefore4 = TextUtils.getOffsetBefore("", 0) + 44;
                        Object[] objArr104 = new Object[1];
                        c((byte) 14, (short) ($$b & 494), $$a[7], objArr104);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(deadChar3, i152, offsetBefore4, -873460649, false, (String) objArr104[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf17);
                    Long lValueOf18 = Long.valueOf(jLongValue15 >> 12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char touchSlop3 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                        int fadingEdgeLength4 = 651 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int i153 = 44 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        byte b38 = $$a[7];
                        Object[] objArr105 = new Object[1];
                        c(b38, (short) (b38 | 69), (byte) 52, objArr105);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(touchSlop3, fadingEdgeLength4, i153, -459846511, false, (String) objArr105[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf18);
                    i6 = 0;
                } catch (Exception unused8) {
                    throw new RuntimeException();
                }
            }
            i7 = ((int[]) objArr12[i6])[i6];
            i8 = ((int[]) objArr12[2])[i6];
            if (i8 == i7) {
                arrayList = new ArrayList();
                strArr = (String[]) objArr12[1];
                if (strArr != null) {
                    i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
                    TuitionPaymentFragmentbindingInflater1 = i9 % 128;
                    if (i9 % 2 != 0) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    while (i10 < strArr.length) {
                        arrayList.add(strArr[i10]);
                        i10++;
                    }
                }
                throw new RuntimeException(String.valueOf(i8));
            }
            objArr13 = new Object[4];
            int[] iArr4 = new int[1];
            objArr13[i6] = iArr4;
            int[] iArr5 = new int[1];
            objArr13[2] = iArr5;
            objArr13[3] = new int[1];
            int i154 = ((int[]) objArr12[3])[i6];
            int i155 = ((int[]) objArr12[2])[i6];
            int i156 = ((int[]) objArr12[i6])[i6];
            iArr5[i6] = i155;
            iArr4[i6] = i156;
            objArr13[1] = new String[i6];
            int iIdentityHashCode9 = System.identityHashCode(this);
            int i157 = (~((-89856298) | iIdentityHashCode9)) | 5832736;
            int i158 = i154 + (-1698250455) + (i157 * 992) + ((i157 | (~((~iIdentityHashCode9) | (-2401927)))) * (-496)) + ((iIdentityHashCode9 | (-86425488)) * 496);
            int i159 = (i158 << 13) ^ i158;
            int i160 = i159 ^ (i159 >>> 17);
            ((int[]) objArr13[3])[0] = i160 ^ (i160 << 5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char defaultSize3 = (char) (View.getDefaultSize(0, 0) + 37567);
                int iRed2 = 625 - Color.red(0);
                int iAxisFromString = MotionEvent.axisFromString("") + 15;
                Object[] objArr106 = new Object[1];
                c((byte) 14, (short) ($$b & 494), $$a[7], objArr106);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(defaultSize3, iRed2, iAxisFromString, -477065106, false, (String) objArr106[0], null);
            }
            j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null);
            jLongValue2 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char touchSlop4 = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 37567);
                int gidForName2 = Process.getGidForName("") + 626;
                int iLastIndexOf6 = 13 - TextUtils.lastIndexOf("", '0');
                byte b39 = $$a[7];
                short s11 = (short) (b39 | 210);
                Object[] objArr107 = new Object[1];
                c(b39, s11, (byte) (s11 >>> 2), objArr107);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(touchSlop4, gidForName2, iLastIndexOf6, -976899241, false, (String) objArr107[0], null);
            }
            if (j2 == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) << 52) >>> 52)) >> 12)) {
                int i161 = TuitionPaymentFragmentbindingInflater1 + 31;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i161 % 128;
                int i162 = i161 % 2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                    char keyRepeatDelay = (char) (37567 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                    int i163 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 624;
                    int iIndexOf9 = 14 - TextUtils.indexOf("", "");
                    byte b40 = $$a[7];
                    Object[] objArr108 = new Object[1];
                    c(b40, (short) (b40 | 158), (byte) 52, objArr108);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(keyRepeatDelay, i163, iIndexOf9, -973632554, false, (String) objArr108[0], null);
                }
                Object[] objArr109 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).get(null);
                int i164 = ((int[]) objArr109[2])[0];
                int i165 = ((int[]) objArr109[0])[0];
                String[] strArr14 = (String[]) objArr109[3];
                int[] iArr6 = {i164};
                int[] iArr7 = {i165};
                int iMaxMemory2 = (int) Runtime.getRuntime().maxMemory();
                int i166 = ~((-752093761) | iMaxMemory2);
                int i167 = ~iMaxMemory2;
                int i168 = (-978086840) + ((i166 | (~((-757889) | i167))) * 920) + (((~((-1070886473) | i167)) | 752093760) * 920) + (((~(iMaxMemory2 | (-757889))) | (~((-752093761) | i167)) | (~((-318792713) | iMaxMemory2))) * 920) + 1413032730;
                int i169 = (i168 << 13) ^ i168;
                int i170 = i169 ^ (i169 >>> 17);
                ((int[]) objArr15[1])[0] = i170 ^ (i170 << 5);
                objArr15 = new Object[]{iArr7, new int[1], iArr6, strArr14};
                str2 = str6;
            } else {
                if (applicationContext2 != null) {
                    i11 = TuitionPaymentFragmentbindingInflater1 + 47;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i171 = 56 / 0;
                        if (applicationContext2 instanceof ContextWrapper) {
                            if (((ContextWrapper) applicationContext2).getBaseContext() != null) {
                                applicationContext3 = null;
                            }
                        }
                    } else if (applicationContext2 instanceof ContextWrapper) {
                        if (((ContextWrapper) applicationContext2).getBaseContext() != null) {
                            applicationContext3 = null;
                        }
                    }
                    applicationContext3 = p0.getApplicationContext();
                } else {
                    applicationContext3 = applicationContext2;
                }
                str2 = str6;
                int iIntValue4 = ((Integer) Class.forName(str5).getMethod(str2, Object.class).invoke(null, this)).intValue();
                Object[] objArr110 = new Object[1];
                a(new char[]{0, 0, 0, 0}, new char[]{58640, 52267, 53581, 52126}, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), ViewConfiguration.getMinimumFlingVelocity() >> 16, new char[]{42461, 31646, 26978, 51799, 15974, 56348, 61975, 48664, 51922, 54526, 32774, 44335, 29234, 25274, 48691, 43831, 49512, 25286, 62987, 16937, 56077, 21120, 20580, 5193, 50107, 31556, 47459, 16762, 41337, 572, 64912, 60532, 33351, 32739, 41373, 2658, 58880, 26411, 33797, 2961, 62055, 8441, 60596, 64791, 53357, 46718, 33579, 41556, 42269, 56543, 21961, 14623, 19272, 27408, 18281, 31169, 2966, 44902, 18863, 19422, 15333, 22610, 41492, 23735}, objArr110);
                String str11 = (String) objArr110[0];
                Object[] objArr111 = new Object[1];
                a(new char[]{0, 0, 0, 0}, new char[]{529, 2661, 34356, 41748}, (char) TextUtils.getCapsMode("", 0, 0), AndroidCharacter.getMirror('0') - '0', new char[]{2305, 56917, 7504, 7320, 21100, 20194, 60696, 14711, 18466, 851, 13357, 52894, 44045, 40885, 1463, 33598, 10407, 56666, 41190, 47366, 4478, 974, 7462, 38723, 3886, 28750, 24416, 64049, 33049, 36664, 54881, 64973, 7583, 62492, 58714, 55668, 12216, 4719, 59586, 11256, 50770, 34012, 33703, 59633, 64176, 27236, 49882, 27347, 56278, 24255, 36073, 35851, 14033, 10866, 49338, 28695, 60346, 22970, 52854, 19506, 505, 25783, 8491, 1626}, objArr111);
                Object[] objArr112 = {applicationContext3, new String[]{str11, (String) objArr111[0]}, Integer.valueOf(iIntValue4), 17, 1413032730};
                byte[] bArr22 = $$d;
                Object[] objArr113 = new Object[1];
                d((short) 149, bArr22[64], bArr22[32], objArr113);
                Class<?> cls5 = Class.forName((String) objArr113[0]);
                Object[] objArr114 = new Object[1];
                d((short) 367, bArr22[76], (byte) (-bArr22[2]), objArr114);
                objArr14 = (Object[]) cls5.getMethod((String) objArr114[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr112);
                int i172 = ((int[]) objArr14[0])[0];
                int i173 = ((int[]) objArr14[2])[0];
                if (applicationContext3 != null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                        char c6 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 37568);
                        int iResolveOpacity3 = Drawable.resolveOpacity(0, 0) + 625;
                        int i174 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 14;
                        byte b41 = $$a[7];
                        Object[] objArr115 = new Object[1];
                        c(b41, (short) (b41 | 158), (byte) 52, objArr115);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c6, iResolveOpacity3, i174, -973632554, false, (String) objArr115[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, objArr14);
                    try {
                        long jLongValue16 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf19 = Long.valueOf(jLongValue16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                            char minimumFlingVelocity5 = (char) (37567 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                            int iLastIndexOf7 = 624 - TextUtils.lastIndexOf("", '0');
                            int fadingEdgeLength5 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 14;
                            byte b42 = $$a[7];
                            short s12 = (short) (b42 | 210);
                            Object[] objArr116 = new Object[1];
                            c(b42, s12, (byte) (s12 >>> 2), objArr116);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(minimumFlingVelocity5, iLastIndexOf7, fadingEdgeLength5, -976899241, false, (String) objArr116[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, lValueOf19);
                        Long lValueOf20 = Long.valueOf(jLongValue16 >> 12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                            char jumpTapTimeout3 = (char) (37567 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 625;
                            int mirror6 = AndroidCharacter.getMirror('0') - '\"';
                            Object[] objArr117 = new Object[1];
                            c((byte) 14, (short) ($$b & 494), $$a[7], objArr117);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(jumpTapTimeout3, scrollDefaultDelay, mirror6, -477065106, false, (String) objArr117[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, lValueOf20);
                    } catch (Exception unused9) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr14 = objArr14;
                }
                objArr15 = objArr14;
            }
            if (((int[]) objArr15[2])[0] == ((int[]) objArr15[0])[0]) {
                arrayList2 = new ArrayList();
                strArr2 = (String[]) objArr15[3];
                if (strArr2 != null) {
                    for (String str12 : strArr2) {
                        arrayList2.add(str12);
                    }
                }
                throw null;
            }
            int i175 = ((int[]) objArr15[1])[0];
            int i176 = ((int[]) objArr15[2])[0];
            int i177 = ((int[]) objArr15[0])[0];
            String[] strArr15 = (String[]) objArr15[3];
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i178 = i175 + 1133534664 + (((~((-1478625876) | iFreeMemory)) | 268438033) * 104) + ((~((~iFreeMemory) | 1555300087)) * (-104)) + ((iFreeMemory | 345112245) * 104);
            int i179 = (i178 << 13) ^ i178;
            int i180 = i179 ^ (i179 >>> 17);
            ((int[]) objArr16[1])[0] = i180 ^ (i180 << 5);
            objArr16 = new Object[]{new int[]{i177}, new int[1], new int[]{i176}, strArr15};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                char c7 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int iKeyCodeFromString4 = KeyEvent.keyCodeFromString("") + 2267;
                int iNormalizeMetaState3 = 33 - KeyEvent.normalizeMetaState(0);
                byte b43 = $$a[7];
                Object[] objArr118 = new Object[1];
                c(b43, (short) (b43 | 158), (byte) 52, objArr118);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c7, iKeyCodeFromString4, iNormalizeMetaState3, -887667012, false, (String) objArr118[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).getLong(null) != -1) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                    char cAlpha3 = (char) Color.alpha(0);
                    int iLastIndexOf8 = TextUtils.lastIndexOf("", '0', 0) + 2268;
                    int i181 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 34;
                    byte[] bArr23 = $$a;
                    byte b44 = bArr23[7];
                    Object[] objArr119 = new Object[1];
                    c(b44, (short) (b44 | 106), (byte) (bArr23[208] - 1), objArr119);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(cAlpha3, iLastIndexOf8, i181, -654680577, false, (String) objArr119[0], null);
                }
                Object[] objArr120 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).get(null);
                objArr18 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                int i182 = ((int[]) objArr120[0])[0];
                int i183 = ((int[]) objArr120[3])[0];
                String[] strArr16 = (String[]) objArr120[1];
                int iIdentityHashCode10 = System.identityHashCode(this);
                int i184 = (-878671592) + (((~((~iIdentityHashCode10) | 201019164)) | (-805039968)) * 529) + (((~(iIdentityHashCode10 | 201019164)) | (-607694152)) * 529) + 994373085;
                int i185 = (i184 << 13) ^ i184;
                int i186 = i185 ^ (i185 >>> 17);
                ((int[]) objArr18[2])[0] = i186 ^ (i186 << 5);
            } else {
                if (applicationContext2 != null) {
                    if ((applicationContext2 instanceof ContextWrapper) || ((ContextWrapper) applicationContext2).getBaseContext() != null) {
                        applicationContext2 = p0.getApplicationContext();
                    } else {
                        applicationContext2 = null;
                    }
                }
                Object[] objArr121 = {applicationContext2, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str2, Object.class).invoke(null, this)).intValue()), 0, 994373085};
                int i187 = $$e;
                byte b45 = $$d[72];
                Object[] objArr122 = new Object[1];
                d((short) (i187 | 34), b45, (byte) (b45 | 18), objArr122);
                Class<?> cls6 = Class.forName((String) objArr122[0]);
                byte b46 = (byte) (i187 & 62);
                Object[] objArr123 = new Object[1];
                d((short) 201, b46, (byte) (b46 + 4), objArr123);
                objArr17 = (Object[]) cls6.getMethod((String) objArr123[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr121);
                if (applicationContext2 != null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                        char jumpTapTimeout4 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int offsetBefore5 = 2267 - TextUtils.getOffsetBefore("", 0);
                        int i188 = 33 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        byte[] bArr24 = $$a;
                        byte b47 = bArr24[7];
                        Object[] objArr124 = new Object[1];
                        c(b47, (short) (b47 | 106), (byte) (bArr24[208] - 1), objArr124);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(jumpTapTimeout4, offsetBefore5, i188, -654680577, false, (String) objArr124[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, objArr17);
                    try {
                        long jLongValue17 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf21 = Long.valueOf(jLongValue17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                            char cMakeMeasureSpec3 = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                            int modifierMetaStateMask4 = ((byte) KeyEvent.getModifierMetaStateMask()) + 2268;
                            int iIndexOf10 = TextUtils.indexOf("", "", 0, 0) + 33;
                            byte b48 = $$a[7];
                            short s13 = (short) (b48 | 210);
                            Object[] objArr125 = new Object[1];
                            c(b48, s13, (byte) (s13 >>> 2), objArr125);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(cMakeMeasureSpec3, modifierMetaStateMask4, iIndexOf10, -874156483, false, (String) objArr125[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf21);
                        Long lValueOf22 = Long.valueOf(jLongValue17 >> 12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                            int i189 = 2268 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                            int iMyPid2 = 33 - (Process.myPid() >> 22);
                            byte b49 = $$a[7];
                            Object[] objArr126 = new Object[1];
                            c(b49, (short) (b49 | 158), (byte) 52, objArr126);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(cLastIndexOf, i189, iMyPid2, -887667012, false, (String) objArr126[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).set(null, lValueOf22);
                    } catch (Exception unused10) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr17 = objArr17;
                }
                objArr18 = objArr17;
            }
            if (((int[]) objArr18[0])[0] == ((int[]) objArr18[3])[0]) {
                arrayList3 = new ArrayList();
                strArr3 = (String[]) objArr18[1];
                if (strArr3 != null) {
                    for (String str13 : strArr3) {
                        arrayList3.add(str13);
                    }
                }
                throw null;
            }
            objArr19 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i190 = ((int[]) objArr18[2])[0];
            int i191 = ((int[]) objArr18[0])[0];
            int i192 = ((int[]) objArr18[3])[0];
            String[] strArr17 = (String[]) objArr18[1];
            int iIdentityHashCode11 = System.identityHashCode(this);
            int i193 = i190 + 1487249287 + ((~((~iIdentityHashCode11) | 803207139)) * (-116)) + ((601744800 | iIdentityHashCode11) * 116) + (((~(iIdentityHashCode11 | (-206968516))) | 5506176) * 116);
            int i194 = (i193 << 13) ^ i193;
            int i195 = i194 ^ (i194 >>> 17);
            ((int[]) objArr19[2])[0] = i195 ^ (i195 << 5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                char keyRepeatDelay2 = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 43042);
                int maxKeyCode4 = (KeyEvent.getMaxKeyCode() >> 16) + 3111;
                int capsMode3 = TextUtils.getCapsMode("", 0, 0) + 22;
                byte b50 = $$a[7];
                short s14 = (short) (b50 | 210);
                Object[] objArr127 = new Object[1];
                c(b50, s14, (byte) (s14 >>> 2), objArr127);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(keyRepeatDelay2, maxKeyCode4, capsMode3, -1272852037, false, (String) objArr127[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).getLong(null) != -1) {
                int i196 = TuitionPaymentFragmentbindingInflater1 + 121;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i196 % 128;
                int i197 = i196 % 2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                    char scrollDefaultDelay2 = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 43042);
                    int mirror7 = AndroidCharacter.getMirror('0') + 3063;
                    int iLastIndexOf9 = TextUtils.lastIndexOf("", '0', 0) + 23;
                    byte[] bArr25 = $$a;
                    byte b51 = bArr25[7];
                    Object[] objArr128 = new Object[1];
                    c(b51, (short) (b51 | 106), (byte) (bArr25[208] - 1), objArr128);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(scrollDefaultDelay2, mirror7, iLastIndexOf9, 154975793, false, (String) objArr128[0], null);
                }
                Object[] objArr129 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).get(null);
                int i198 = ((int[]) objArr129[2])[0];
                int i199 = ((int[]) objArr129[1])[0];
                String[] strArr18 = (String[]) objArr129[3];
                int[] iArr8 = {i199};
                int iMyTid4 = Process.myTid();
                int i200 = ~iMyTid4;
                int i201 = (-498553052) + ((1065334527 | i200) * (-369)) + (((~((-643933244) | i200)) | 1061098215) * (-369)) + (((~(iMyTid4 | 643933243)) | 421401284 | (~(i200 | (-4236313)))) * 369) + 911649344;
                int i202 = (i201 << 13) ^ i201;
                int i203 = i202 ^ (i202 >>> 17);
                ((int[]) objArr20[0])[0] = i203 ^ (i203 << 5);
                objArr20 = new Object[]{new int[1], iArr8, new int[]{i198}, strArr18};
            } else {
                Object[] objArr130 = {null, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str2, Object.class).invoke(null, this)).intValue()), 0, 911649344};
                byte[] bArr26 = $$d;
                Object[] objArr131 = new Object[1];
                d(bArr26[422], bArr26[72], bArr26[17], objArr131);
                Class<?> cls7 = Class.forName((String) objArr131[0]);
                short s15 = bArr26[64];
                Object[] objArr132 = new Object[1];
                d(s15, (byte) (s15 | 28), (byte) (bArr26[142] - 1), objArr132);
                objArr20 = (Object[]) cls7.getMethod((String) objArr132[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr130);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                    char trimmedLength = (char) (43042 - TextUtils.getTrimmedLength(""));
                    int iMyPid3 = (Process.myPid() >> 22) + 3111;
                    int iNormalizeMetaState4 = 22 - KeyEvent.normalizeMetaState(0);
                    byte[] bArr27 = $$a;
                    byte b52 = bArr27[7];
                    Object[] objArr133 = new Object[1];
                    c(b52, (short) (b52 | 106), (byte) (bArr27[208] - 1), objArr133);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(trimmedLength, iMyPid3, iNormalizeMetaState4, 154975793, false, (String) objArr133[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).set(null, objArr20);
                try {
                    long jLongValue18 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf23 = Long.valueOf(jLongValue18);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                        char offsetBefore6 = (char) (43042 - TextUtils.getOffsetBefore("", 0));
                        int absoluteGravity2 = 3111 - Gravity.getAbsoluteGravity(0, 0);
                        int iMyTid5 = 22 - (Process.myTid() >> 22);
                        byte b53 = $$a[7];
                        Object[] objArr134 = new Object[1];
                        c(b53, (short) (b53 | 158), (byte) 52, objArr134);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(offsetBefore6, absoluteGravity2, iMyTid5, -1269618118, false, (String) objArr134[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).set(null, lValueOf23);
                    Long lValueOf24 = Long.valueOf(jLongValue18 >> 12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                        char c8 = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 43042);
                        int edgeSlop5 = 3111 - (ViewConfiguration.getEdgeSlop() >> 16);
                        int iResolveOpacity4 = Drawable.resolveOpacity(0, 0) + 22;
                        byte b54 = $$a[7];
                        short s16 = (short) (b54 | 210);
                        Object[] objArr135 = new Object[1];
                        c(b54, s16, (byte) (s16 >>> 2), objArr135);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(c8, edgeSlop5, iResolveOpacity4, -1272852037, false, (String) objArr135[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).set(null, lValueOf24);
                } catch (Exception unused11) {
                    throw new RuntimeException();
                }
            }
            i14 = ((int[]) objArr20[1])[0];
            i15 = ((int[]) objArr20[2])[0];
            if (i15 == i14) {
                arrayList4 = new ArrayList();
                strArr4 = (String[]) objArr20[3];
                if (strArr4 != null) {
                    for (String str14 : strArr4) {
                        arrayList4.add(str14);
                    }
                }
                throw new RuntimeException(String.valueOf(i15));
            }
            int i204 = ((int[]) objArr20[0])[0];
            int i205 = ((int[]) objArr20[2])[0];
            int i206 = ((int[]) objArr20[1])[0];
            String[] strArr19 = (String[]) objArr20[3];
            int[] iArr9 = {i206};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i207 = ~elapsedCpuTime;
            int i208 = i204 + (-664361213) + (((~((-1081159036) | i207)) | 1078994008) * 98) + (((~(i207 | (-623872424))) | (-1081159036) | (~(623872423 | elapsedCpuTime))) * (-49)) + (((~(elapsedCpuTime | (-1081159036))) | (-1702866432)) * 49);
            int i209 = (i208 << 13) ^ i208;
            int i210 = i209 ^ (i209 >>> 17);
            Object obj = new Object[]{new int[1], iArr9, new int[]{i205}, strArr19}[0];
            ((int[]) obj)[0] = i210 ^ (i210 << 5);
            int i211 = ((int[]) objArr35[2])[0];
            int i212 = i211 * i211;
            int i213 = -(1928156341 * i211);
            int i214 = ((((i212 | i213) << 1) - (i212 ^ i213)) - (~(-(i211 * 365048559)))) - (-1048942659);
            int i215 = i214 >> 20;
            int i216 = (((i215 | (-8191)) << 1) - (i215 ^ (-8191))) / 4096;
            int i217 = ((i216 | 1) << 1) - (i216 ^ 1);
            int i218 = ((i214 | i217) << 1) - (i217 ^ i214);
            int i219 = i214 >> 26;
            int i220 = ((i219 & ComposerKt.defaultsKey) + (i219 | ComposerKt.defaultsKey)) / 64;
            int i221 = (-(((i220 ^ 1) + ((i220 & 1) << 1)) ^ i218)) + 9;
            int i222 = i221 >> 17;
            int i223 = ((((-65535) | i222) << 1) - (i222 ^ (-65535))) / 32768;
            int i224 = (i223 ^ 1) + ((i223 & 1) << 1);
            int i225 = 1926927 / ((i221 & (-((i224 & 1) + (i224 | 1)))) * 251);
            int i226 = ((int[]) objArr3[0])[0];
            int i227 = i226 * i226;
            int i228 = -(911206431 * i226);
            int i229 = (i227 & i228) + (i227 | i228);
            int i230 = -(i226 * (-765087217));
            int i231 = (i229 & i230) + (i230 | i229);
            int i232 = (i231 ^ (-1871063023)) + (((-1871063023) & i231) << 1);
            int i233 = ((i232 >> 28) - 31) / 16;
            int i234 = (i232 - (~((i233 & 1) + (i233 | 1)))) - 1;
            int i235 = ((i232 >> 29) - 15) / 8;
            int i236 = (-(i234 ^ (((i235 | 1) << 1) - (i235 ^ 1)))) + 9;
            int i237 = i236 >> 19;
            int i238 = (((i237 | (-16383)) << 1) - (i237 ^ (-16383))) / 8192;
            int i239 = ((i238 | 1) << 1) - (i238 ^ 1);
            int i240 = i225 + (9260973 / ((i236 & (-((i239 ^ 1) + ((i239 & 1) << 1)))) * 1657));
            int i241 = ((int[]) objArr5[1])[0];
            int i242 = i241 * i241;
            int i243 = -(966460819 * i241);
            int i244 = ((i242 | i243) << 1) - (i242 ^ i243);
            int i245 = -(i241 * (-427759687));
            int i246 = ((i244 ^ i245) + ((i245 & i244) << 1)) - 1166052444;
            int i247 = i246 >> 19;
            int i248 = ((i247 & (-16383)) + (i247 | (-16383))) / 8192;
            int i249 = ((i248 | 1) << 1) - (i248 ^ 1);
            int i250 = (i246 & i249) + (i249 | i246);
            int i251 = i246 >> 22;
            int i252 = -(i250 ^ (((((i251 | (-2047)) << 1) - (i251 ^ (-2047))) / 1024) + 1));
            int i253 = (i252 & 1) + (i252 | 1);
            int i254 = i253 >> 22;
            int i255 = ((i254 ^ (-2047)) + ((i254 & (-2047)) << 1)) / 1024;
            int i256 = (i255 & 1) + (i255 | 1);
            int i257 = i240 + (769738 / (((-(((i256 | 1) << 1) - (i256 ^ 1))) & i253) * 941));
            int i258 = ((int[]) objArr63[3])[0];
            int i259 = i258 * i258;
            int i260 = -(87831947 * i258);
            int i261 = ((i259 | i260) << 1) - (i259 ^ i260);
            int i262 = -(i258 * 1323977829);
            int i263 = ((i261 | i262) << 1) - (i262 ^ i261);
            int i264 = (i263 ^ 357363776) + ((357363776 & i263) << 1);
            int i265 = i264 >> 18;
            int i266 = ((i265 & (-32767)) + (i265 | (-32767))) / 16384;
            int i267 = ((i266 | 1) << 1) - (i266 ^ 1);
            int i268 = (i264 ^ i267) + ((i267 & i264) << 1);
            int i269 = i264 >> 26;
            int i270 = (-(i268 ^ ((((i269 & ComposerKt.defaultsKey) + (i269 | ComposerKt.defaultsKey)) / 64) + 1))) + 2;
            int i271 = ((i270 >> 23) - 1023) / 512;
            int i272 = ((i271 | 1) << 1) - (i271 ^ 1);
            int i273 = i257 + (130652 / ((i270 & (-((i272 ^ 1) + ((i272 & 1) << 1)))) * 367));
            int i274 = ((int[]) objArr8[1])[0];
            int i275 = ((i274 * i274) - (~(-(919886127 * i274)))) - 1;
            int i276 = -(i274 * (-389447829));
            int i277 = (i275 & i276) + (i276 | i275);
            int i278 = (i277 & 738856745) + (738856745 | i277);
            int i279 = i278 >> 18;
            int i280 = ((i279 & (-32767)) + (i279 | (-32767))) / 16384;
            int i281 = (i280 & 1) + (i280 | 1);
            int i282 = (i278 ^ i281) + ((i281 & i278) << 1);
            int i283 = i278 >> 29;
            int i284 = (((i283 | (-15)) << 1) - (i283 ^ (-15))) / 8;
            int i285 = (-(((i284 ^ 1) + ((i284 & 1) << 1)) ^ i282)) + 7;
            int i286 = ((i285 >> 21) - 4095) / 2048;
            int i287 = (i286 & 1) + (i286 | 1);
            int i288 = i273 + (8496201 / ((i285 & (-((i287 & 1) + (i287 | 1)))) * 1263));
            int i289 = ((int[]) objArr85[1])[0];
            int i290 = i289 * i289;
            int i291 = -(711177583 * i289);
            int i292 = (i290 ^ i291) + ((i290 & i291) << 1);
            int i293 = -(i289 * (-2064485973));
            int i294 = (i292 ^ i293) + ((i293 & i292) << 1);
            int i295 = (i294 ^ (-170116183)) + (((-170116183) & i294) << 1);
            int i296 = ((i295 >> 29) - 15) / 8;
            int i297 = i295 >> 23;
            int i298 = -(((i295 - (~(((i296 | 1) << 1) - (i296 ^ 1)))) - 1) ^ ((((i297 & (-1023)) + (i297 | (-1023))) / 512) + 1));
            int i299 = (i298 ^ 1) + ((i298 & 1) << 1);
            int i300 = ((i299 >> 22) - 2047) / 1024;
            int i301 = (i300 ^ 1) + ((i300 & 1) << 1);
            int i302 = i288 + (347448 / (((-((i301 ^ 1) + ((i301 & 1) << 1))) & i299) * 934));
            int i303 = ((int[]) objArr11[1])[0];
            int i304 = i303 * i303;
            int i305 = -(1233581814 * i303);
            int i306 = ((i304 | i305) << 1) - (i304 ^ i305);
            int i307 = -(i303 * 1635993072);
            int i308 = ((i306 ^ i307) + ((i307 & i306) << 1)) - (-85796777);
            int i309 = i308 >> 29;
            int i310 = (((i309 | (-15)) << 1) - (i309 ^ (-15))) / 8;
            int i311 = (i310 & 1) + (i310 | 1);
            int i312 = (i308 ^ i311) + ((i311 & i308) << 1);
            int i313 = i308 >> 26;
            int i314 = ((i313 & ComposerKt.defaultsKey) + (i313 | ComposerKt.defaultsKey)) / 64;
            int i315 = -((((i314 | 1) << 1) - (i314 ^ 1)) ^ i312);
            int i316 = (i315 & 5) + (i315 | 5);
            int i317 = i316 >> 22;
            int i318 = (((i317 | (-2047)) << 1) - (i317 ^ (-2047))) / 1024;
            int i319 = i302 + (2237900 / (((-(((i318 ^ 1) + ((i318 & 1) << 1)) + 1)) & i316) * 805));
            int i320 = ((int[]) objArr13[3])[0];
            int i321 = i320 * i320;
            int i322 = -(1687173211 * i320);
            int i323 = ((((i321 | i322) << 1) - (i321 ^ i322)) - (~(-(i320 * 1870469329)))) - 1;
            int i324 = ((i323 | (-1911736348)) << 1) - ((-1911736348) ^ i323);
            int i325 = i324 >> 29;
            int i326 = (i325 - 15) / 8;
            int i327 = (i326 & 1) + (i326 | 1);
            int i328 = (i324 & i327) + (i324 | i327);
            int i329 = ((i325 & (-15)) + (i325 | (-15))) / 8;
            int i330 = -(((i329 & 1) + (i329 | 1)) ^ i328);
            int i331 = ((i330 | 4) << 1) - (i330 ^ 4);
            int i332 = i331 >> 17;
            int i333 = (((-65535) & i332) + (i332 | (-65535))) / 32768;
            int i334 = i319 + (957816 / (((-(((i333 & 1) + (i333 | 1)) + 1)) & i331) * 477));
            int i335 = ((int[]) objArr16[1])[0];
            int i336 = i335 * i335;
            int i337 = -(2127605181 * i335);
            int i338 = ((i336 | i337) << 1) - (i336 ^ i337);
            int i339 = -(i335 * 1359142933);
            int i340 = ((i338 | i339) << 1) - (i339 ^ i338);
            int i341 = (i340 ^ 749682705) + ((749682705 & i340) << 1);
            int i342 = i341 >> 27;
            int i343 = ((i342 ^ (-63)) + ((i342 & (-63)) << 1)) / 32;
            int i344 = (i341 - (~((i343 & 1) + (i343 | 1)))) - 1;
            int i345 = ((i341 >> 19) - 16383) / 8192;
            int i346 = -(i344 ^ ((i345 ^ 1) + ((i345 & 1) << 1)));
            int i347 = ((i346 | 3) << 1) - (i346 ^ 3);
            int i348 = i347 >> 29;
            int i349 = ((i348 ^ (-15)) + ((i348 & (-15)) << 1)) / 8;
            int i350 = (i349 & 1) + (i349 | 1);
            int i351 = i334 + (297000 / (((-((i350 ^ 1) + ((i350 & 1) << 1))) & i347) * 1980));
            int i352 = ((int[]) objArr19[2])[0];
            int i353 = i352 * i352;
            int i354 = -(772612053 * i352);
            int i355 = (i353 ^ i354) + ((i353 & i354) << 1);
            int i356 = -(i352 * (-1318826903));
            int i357 = (i355 ^ i356) + ((i356 & i355) << 1);
            int i358 = (i357 & 807409601) + (807409601 | i357);
            int i359 = i358 >> 24;
            int i360 = ((i359 ^ (-511)) + ((i359 & (-511)) << 1)) / 256;
            int i361 = (i360 ^ 1) + ((i360 & 1) << 1);
            int i362 = -(((((i358 >> 15) - 262143) / 131072) + 1) ^ (((i358 | i361) << 1) - (i361 ^ i358)));
            int i363 = (i362 ^ 8) + ((i362 & 8) << 1);
            int i364 = i351 + (11279040 / (((-((((i363 >> 20) - 8191) / 4096) + 2)) & i363) * 1895));
            int i365 = ((int[]) obj)[0];
            int i366 = i365 * i365;
            int i367 = -(2061282962 * i365);
            int i368 = ((i366 | i367) << 1) - (i366 ^ i367);
            int i369 = -(i365 * (-1410874474));
            int i370 = (i368 ^ i369) + ((i369 & i368) << 1);
            int i371 = ((i370 | (-1207309936)) << 1) - ((-1207309936) ^ i370);
            int i372 = ((i371 >> 17) - 65535) / 32768;
            int i373 = (i371 - (~((i372 & 1) + (i372 | 1)))) - 1;
            int i374 = i371 >> 24;
            int i375 = ((i374 ^ (-511)) + ((i374 & (-511)) << 1)) / 256;
            int i376 = -(i373 ^ ((i375 & 1) + (i375 | 1)));
            int i377 = (i376 ^ 4) + ((i376 & 4) << 1);
            int i378 = i377 >> 16;
            int i379 = ((((-131071) | i378) << 1) - (i378 ^ (-131071))) / 65536;
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "2/18/31/8/File Downloaded".substring(i364 + ((-33170020) / (((-(((i379 ^ 1) + ((i379 & 1) << 1)) + 1)) & i377) * 1469))), 0).show();
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault73 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault73 == null) {
            char c9 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int iAlpha3 = 876 - Color.alpha(0);
            int i380 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9;
            byte[] bArr28 = $$a;
            byte b55 = bArr28[10];
            short s17 = bArr28[7];
            Object[] objArr136 = new Object[1];
            c(b55, s17, (byte) s17, objArr136);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault73 = initSession.b(c9, iAlpha3, i380, 256017550, false, (String) objArr136[0], null);
        }
        Object[] objArr137 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault73).get(null);
        objArr10 = new Object[]{new int[]{((int[]) objArr137[0])[0]}, new int[1], new int[]{((int[]) objArr137[2])[0]}, (String[]) objArr137[3]};
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i381 = (-1982289284) + ((iElapsedRealtime | 944821924) * (-50));
        int i382 = ~((-135271969) | iElapsedRealtime);
        int i383 = ~iElapsedRealtime;
        int i384 = i381 + ((i382 | (~(1039783663 | i383))) * 50) + (((~(i383 | 944821924)) | (~(904511695 | i383)) | (-1039783664)) * 50) + 1770697289;
        int i385 = (i384 << 13) ^ i384;
        int i386 = i385 ^ (i385 >>> 17);
        ((int[]) objArr10[1])[0] = i386 ^ (i386 << 5);
        applicationContext2 = p0;
        str6 = str6;
        i4 = ((int[]) objArr10[2])[0];
        i5 = ((int[]) objArr10[0])[0];
        if (i5 == i4) {
            throw new RuntimeException(String.valueOf(i5));
        }
        int i1310 = ((int[]) objArr10[1])[0];
        objArr11 = new Object[]{new int[]{((int[]) objArr10[0])[0]}, new int[1], new int[]{((int[]) objArr10[2])[0]}, (String[]) objArr10[3]};
        int iMyTid6 = Process.myTid();
        int i1311 = ~iMyTid6;
        int i1410 = i1310 + (-219778240) + (((~(388480846 | i1311)) | 428791075) * 226) + (((~(i1311 | 531627887)) | (~((-428791076) | iMyTid6)) | 285644034) * (-113)) + ((~(iMyTid6 | 388480846)) * 113);
        int i1411 = (i1410 << 13) ^ i1410;
        int i1412 = i1411 ^ (i1411 >>> 17);
        ((int[]) objArr11[1])[0] = i1412 ^ (i1412 << 5);
        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char edgeSlop6 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
            int iAlpha4 = Color.alpha(0) + 651;
            int iIndexOf11 = 44 - TextUtils.indexOf("", "", 0, 0);
            byte b310 = $$a[7];
            Object[] objArr910 = new Object[1];
            c(b310, (short) (b310 | 69), (byte) 52, objArr910);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(edgeSlop6, iAlpha4, iIndexOf11, -459846511, false, (String) objArr910[0], null);
        }
        j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        jLongValue = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char maxKeyCode5 = (char) (KeyEvent.getMaxKeyCode() >> 16);
            int offsetBefore7 = 651 - TextUtils.getOffsetBefore("", 0);
            int iLastIndexOf10 = 43 - TextUtils.lastIndexOf("", '0');
            Object[] objArr911 = new Object[1];
            c((byte) 14, (short) ($$b & 494), $$a[7], objArr911);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maxKeyCode5, offsetBefore7, iLastIndexOf10, -873460649, false, (String) objArr911[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                char c10 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int bitsPerPixel4 = 650 - ImageFormat.getBitsPerPixel(0);
                int scrollBarFadeDuration4 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 44;
                byte[] bArr29 = $$a;
                byte b311 = bArr29[7];
                Object[] objArr912 = new Object[1];
                c(b311, (short) (b311 | 106), (byte) (bArr29[208] - 1), objArr912);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(c10, bitsPerPixel4, scrollBarFadeDuration4, -1595579076, false, (String) objArr912[0], null);
            }
            Object[] objArr1010 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).get(null);
            objArr12 = new Object[]{new int[]{i144}, new String[0], new int[]{i143}, new int[1]};
            int i1413 = ((int[]) objArr1010[2])[0];
            int i1414 = ((int[]) objArr1010[0])[0];
            int iIdentityHashCode12 = System.identityHashCode(this);
            int i1415 = ~iIdentityHashCode12;
            int i1416 = (~((-147925210) | i1415)) | 143656985;
            int i1417 = ~(iIdentityHashCode12 | 148762623);
            int i1418 = (-1954785478) + ((i1416 | i1417) * (-713)) + (i1417 * 1426) + ((~(144494399 | i1415)) * 713) + 409017455;
            int i1419 = (i1418 << 13) ^ i1418;
            int i1510 = i1419 ^ (i1419 >>> 17);
            ((int[]) objArr12[3])[0] = i1510 ^ (i1510 << 5);
            i6 = 0;
        } else {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.getCapsMode("", 0, 0) + 1610, Drawable.resolveOpacity(0, 0) + 26, 2145681644, false, null, new Class[0]);
            }
            Object[] objArr1011 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(null), 409017455, 0};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char scrollBarFadeDuration5 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int maxKeyCode6 = (KeyEvent.getMaxKeyCode() >> 16) + 651;
                int modifierMetaStateMask5 = 43 - ((byte) KeyEvent.getModifierMetaStateMask());
                Object[] objArr1012 = new Object[1];
                c((byte) 14, (short) ($$b & 494), $$a[7], objArr1012);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollBarFadeDuration5, maxKeyCode6, modifierMetaStateMask5, 2075921419, false, (String) objArr1012[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getTapTimeout() >> 16) + 695, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 97), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 63406), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 792, 84 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), Integer.TYPE, Integer.TYPE});
            }
            objArr12 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr1011);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                char c11 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int i1511 = 650 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                int pressedStateDuration3 = (ViewConfiguration.getPressedStateDuration() >> 16) + 44;
                byte[] bArr210 = $$a;
                byte b312 = bArr210[7];
                Object[] objArr1013 = new Object[1];
                c(b312, (short) (b312 | 106), (byte) (bArr210[208] - 1), objArr1013);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c11, i1511, pressedStateDuration3, -1595579076, false, (String) objArr1013[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArr12);
            long jLongValue19 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
            Long lValueOf110 = Long.valueOf(jLongValue19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char deadChar4 = (char) KeyEvent.getDeadChar(0, 0);
                int i1512 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 651;
                int offsetBefore8 = TextUtils.getOffsetBefore("", 0) + 44;
                Object[] objArr1014 = new Object[1];
                c((byte) 14, (short) ($$b & 494), $$a[7], objArr1014);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(deadChar4, i1512, offsetBefore8, -873460649, false, (String) objArr1014[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf110);
            Long lValueOf111 = Long.valueOf(jLongValue19 >> 12);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char touchSlop5 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                int fadingEdgeLength6 = 651 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                int i1513 = 44 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte b313 = $$a[7];
                Object[] objArr1015 = new Object[1];
                c(b313, (short) (b313 | 69), (byte) 52, objArr1015);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(touchSlop5, fadingEdgeLength6, i1513, -459846511, false, (String) objArr1015[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf111);
            i6 = 0;
        }
        i7 = ((int[]) objArr12[i6])[i6];
        i8 = ((int[]) objArr12[2])[i6];
        if (i8 == i7) {
            arrayList = new ArrayList();
            strArr = (String[]) objArr12[1];
            if (strArr != null) {
                i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 11;
                TuitionPaymentFragmentbindingInflater1 = i9 % 128;
                if (i9 % 2 != 0) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                while (i10 < strArr.length) {
                    arrayList.add(strArr[i10]);
                    i10++;
                }
            }
            throw new RuntimeException(String.valueOf(i8));
        }
        objArr13 = new Object[4];
        int[] iArr10 = new int[1];
        objArr13[i6] = iArr10;
        int[] iArr11 = new int[1];
        objArr13[2] = iArr11;
        objArr13[3] = new int[1];
        int i1514 = ((int[]) objArr12[3])[i6];
        int i1515 = ((int[]) objArr12[2])[i6];
        int i1516 = ((int[]) objArr12[i6])[i6];
        iArr11[i6] = i1515;
        iArr10[i6] = i1516;
        objArr13[1] = new String[i6];
        int iIdentityHashCode13 = System.identityHashCode(this);
        int i1517 = (~((-89856298) | iIdentityHashCode13)) | 5832736;
        int i1518 = i1514 + (-1698250455) + (i1517 * 992) + ((i1517 | (~((~iIdentityHashCode13) | (-2401927)))) * (-496)) + ((iIdentityHashCode13 | (-86425488)) * 496);
        int i1519 = (i1518 << 13) ^ i1518;
        int i1610 = i1519 ^ (i1519 >>> 17);
        ((int[]) objArr13[3])[0] = i1610 ^ (i1610 << 5);
        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char defaultSize4 = (char) (View.getDefaultSize(0, 0) + 37567);
            int iRed3 = 625 - Color.red(0);
            int iAxisFromString2 = MotionEvent.axisFromString("") + 15;
            Object[] objArr1016 = new Object[1];
            c((byte) 14, (short) ($$b & 494), $$a[7], objArr1016);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(defaultSize4, iRed3, iAxisFromString2, -477065106, false, (String) objArr1016[0], null);
        }
        j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null);
        jLongValue2 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
        objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char touchSlop6 = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 37567);
            int gidForName3 = Process.getGidForName("") + 626;
            int iLastIndexOf11 = 13 - TextUtils.lastIndexOf("", '0');
            byte b314 = $$a[7];
            short s18 = (short) (b314 | 210);
            Object[] objArr1017 = new Object[1];
            c(b314, s18, (byte) (s18 >>> 2), objArr1017);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(touchSlop6, gidForName3, iLastIndexOf11, -976899241, false, (String) objArr1017[0], null);
        }
        if (j2 == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).getLong(null) << 52) >>> 52)) >> 12)) {
            int i1611 = TuitionPaymentFragmentbindingInflater1 + 31;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1611 % 128;
            int i1612 = i1611 % 2;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                char keyRepeatDelay3 = (char) (37567 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                int i1613 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 624;
                int iIndexOf12 = 14 - TextUtils.indexOf("", "");
                byte b410 = $$a[7];
                Object[] objArr1018 = new Object[1];
                c(b410, (short) (b410 | 158), (byte) 52, objArr1018);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(keyRepeatDelay3, i1613, iIndexOf12, -973632554, false, (String) objArr1018[0], null);
            }
            Object[] objArr1019 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).get(null);
            int i1614 = ((int[]) objArr1019[2])[0];
            int i1615 = ((int[]) objArr1019[0])[0];
            String[] strArr110 = (String[]) objArr1019[3];
            int[] iArr12 = {i1614};
            int[] iArr13 = {i1615};
            int iMaxMemory3 = (int) Runtime.getRuntime().maxMemory();
            int i1616 = ~((-752093761) | iMaxMemory3);
            int i1617 = ~iMaxMemory3;
            int i1618 = (-978086840) + ((i1616 | (~((-757889) | i1617))) * 920) + (((~((-1070886473) | i1617)) | 752093760) * 920) + (((~(iMaxMemory3 | (-757889))) | (~((-752093761) | i1617)) | (~((-318792713) | iMaxMemory3))) * 920) + 1413032730;
            int i1619 = (i1618 << 13) ^ i1618;
            int i1710 = i1619 ^ (i1619 >>> 17);
            ((int[]) objArr15[1])[0] = i1710 ^ (i1710 << 5);
            objArr15 = new Object[]{iArr13, new int[1], iArr12, strArr110};
            str2 = str6;
        } else {
            if (applicationContext2 != null) {
                i11 = TuitionPaymentFragmentbindingInflater1 + 47;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i11 % 128;
                if (i11 % 2 == 0) {
                    int i1711 = 56 / 0;
                    if (applicationContext2 instanceof ContextWrapper) {
                        if (((ContextWrapper) applicationContext2).getBaseContext() != null) {
                            applicationContext3 = null;
                        }
                    }
                } else if (applicationContext2 instanceof ContextWrapper) {
                    if (((ContextWrapper) applicationContext2).getBaseContext() != null) {
                        applicationContext3 = null;
                    }
                }
                applicationContext3 = p0.getApplicationContext();
            } else {
                applicationContext3 = applicationContext2;
            }
            str2 = str6;
            int iIntValue5 = ((Integer) Class.forName(str5).getMethod(str2, Object.class).invoke(null, this)).intValue();
            Object[] objArr1110 = new Object[1];
            a(new char[]{0, 0, 0, 0}, new char[]{58640, 52267, 53581, 52126}, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), ViewConfiguration.getMinimumFlingVelocity() >> 16, new char[]{42461, 31646, 26978, 51799, 15974, 56348, 61975, 48664, 51922, 54526, 32774, 44335, 29234, 25274, 48691, 43831, 49512, 25286, 62987, 16937, 56077, 21120, 20580, 5193, 50107, 31556, 47459, 16762, 41337, 572, 64912, 60532, 33351, 32739, 41373, 2658, 58880, 26411, 33797, 2961, 62055, 8441, 60596, 64791, 53357, 46718, 33579, 41556, 42269, 56543, 21961, 14623, 19272, 27408, 18281, 31169, 2966, 44902, 18863, 19422, 15333, 22610, 41492, 23735}, objArr1110);
            String str15 = (String) objArr1110[0];
            Object[] objArr1111 = new Object[1];
            a(new char[]{0, 0, 0, 0}, new char[]{529, 2661, 34356, 41748}, (char) TextUtils.getCapsMode("", 0, 0), AndroidCharacter.getMirror('0') - '0', new char[]{2305, 56917, 7504, 7320, 21100, 20194, 60696, 14711, 18466, 851, 13357, 52894, 44045, 40885, 1463, 33598, 10407, 56666, 41190, 47366, 4478, 974, 7462, 38723, 3886, 28750, 24416, 64049, 33049, 36664, 54881, 64973, 7583, 62492, 58714, 55668, 12216, 4719, 59586, 11256, 50770, 34012, 33703, 59633, 64176, 27236, 49882, 27347, 56278, 24255, 36073, 35851, 14033, 10866, 49338, 28695, 60346, 22970, 52854, 19506, 505, 25783, 8491, 1626}, objArr1111);
            Object[] objArr1112 = {applicationContext3, new String[]{str15, (String) objArr1111[0]}, Integer.valueOf(iIntValue5), 17, 1413032730};
            byte[] bArr211 = $$d;
            Object[] objArr1113 = new Object[1];
            d((short) 149, bArr211[64], bArr211[32], objArr1113);
            Class<?> cls8 = Class.forName((String) objArr1113[0]);
            Object[] objArr1114 = new Object[1];
            d((short) 367, bArr211[76], (byte) (-bArr211[2]), objArr1114);
            objArr14 = (Object[]) cls8.getMethod((String) objArr1114[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr1112);
            int i1712 = ((int[]) objArr14[0])[0];
            int i1713 = ((int[]) objArr14[2])[0];
            if (applicationContext3 != null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                    char c12 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 37568);
                    int iResolveOpacity5 = Drawable.resolveOpacity(0, 0) + 625;
                    int i1714 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 14;
                    byte b411 = $$a[7];
                    Object[] objArr1115 = new Object[1];
                    c(b411, (short) (b411 | 158), (byte) 52, objArr1115);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c12, iResolveOpacity5, i1714, -973632554, false, (String) objArr1115[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, objArr14);
                long jLongValue110 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf112 = Long.valueOf(jLongValue110);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                    char minimumFlingVelocity6 = (char) (37567 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                    int iLastIndexOf12 = 624 - TextUtils.lastIndexOf("", '0');
                    int fadingEdgeLength7 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 14;
                    byte b412 = $$a[7];
                    short s19 = (short) (b412 | 210);
                    Object[] objArr1116 = new Object[1];
                    c(b412, s19, (byte) (s19 >>> 2), objArr1116);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(minimumFlingVelocity6, iLastIndexOf12, fadingEdgeLength7, -976899241, false, (String) objArr1116[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, lValueOf112);
                Long lValueOf25 = Long.valueOf(jLongValue110 >> 12);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                    char jumpTapTimeout5 = (char) (37567 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                    int scrollDefaultDelay3 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 625;
                    int mirror8 = AndroidCharacter.getMirror('0') - '\"';
                    Object[] objArr1117 = new Object[1];
                    c((byte) 14, (short) ($$b & 494), $$a[7], objArr1117);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(jumpTapTimeout5, scrollDefaultDelay3, mirror8, -477065106, false, (String) objArr1117[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, lValueOf25);
            } else {
                objArr14 = objArr14;
            }
            objArr15 = objArr14;
        }
        if (((int[]) objArr15[2])[0] == ((int[]) objArr15[0])[0]) {
            arrayList2 = new ArrayList();
            strArr2 = (String[]) objArr15[3];
            if (strArr2 != null) {
                while (i12 < strArr2.length) {
                    arrayList2.add(str12);
                }
            }
            throw null;
        }
        int i1715 = ((int[]) objArr15[1])[0];
        int i1716 = ((int[]) objArr15[2])[0];
        int i1717 = ((int[]) objArr15[0])[0];
        String[] strArr111 = (String[]) objArr15[3];
        int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
        int i1718 = i1715 + 1133534664 + (((~((-1478625876) | iFreeMemory2)) | 268438033) * 104) + ((~((~iFreeMemory2) | 1555300087)) * (-104)) + ((iFreeMemory2 | 345112245) * 104);
        int i1719 = (i1718 << 13) ^ i1718;
        int i1810 = i1719 ^ (i1719 >>> 17);
        ((int[]) objArr16[1])[0] = i1810 ^ (i1810 << 5);
        objArr16 = new Object[]{new int[]{i1717}, new int[1], new int[]{i1716}, strArr111};
        objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
            char c13 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int iKeyCodeFromString5 = KeyEvent.keyCodeFromString("") + 2267;
            int iNormalizeMetaState5 = 33 - KeyEvent.normalizeMetaState(0);
            byte b413 = $$a[7];
            Object[] objArr1118 = new Object[1];
            c(b413, (short) (b413 | 158), (byte) 52, objArr1118);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(c13, iKeyCodeFromString5, iNormalizeMetaState5, -887667012, false, (String) objArr1118[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).getLong(null) != -1) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                char cAlpha4 = (char) Color.alpha(0);
                int iLastIndexOf13 = TextUtils.lastIndexOf("", '0', 0) + 2268;
                int i1811 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 34;
                byte[] bArr212 = $$a;
                byte b414 = bArr212[7];
                Object[] objArr1119 = new Object[1];
                c(b414, (short) (b414 | 106), (byte) (bArr212[208] - 1), objArr1119);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(cAlpha4, iLastIndexOf13, i1811, -654680577, false, (String) objArr1119[0], null);
            }
            Object[] objArr1210 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).get(null);
            objArr18 = new Object[]{new int[]{i182}, strArr16, new int[1], new int[]{i183}};
            int i1812 = ((int[]) objArr1210[0])[0];
            int i1813 = ((int[]) objArr1210[3])[0];
            String[] strArr112 = (String[]) objArr1210[1];
            int iIdentityHashCode14 = System.identityHashCode(this);
            int i1814 = (-878671592) + (((~((~iIdentityHashCode14) | 201019164)) | (-805039968)) * 529) + (((~(iIdentityHashCode14 | 201019164)) | (-607694152)) * 529) + 994373085;
            int i1815 = (i1814 << 13) ^ i1814;
            int i1816 = i1815 ^ (i1815 >>> 17);
            ((int[]) objArr18[2])[0] = i1816 ^ (i1816 << 5);
        } else {
            if (applicationContext2 != null) {
                if (applicationContext2 instanceof ContextWrapper) {
                    applicationContext2 = p0.getApplicationContext();
                } else {
                    applicationContext2 = p0.getApplicationContext();
                }
            }
            Object[] objArr1211 = {applicationContext2, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str2, Object.class).invoke(null, this)).intValue()), 0, 994373085};
            int i1817 = $$e;
            byte b415 = $$d[72];
            Object[] objArr1212 = new Object[1];
            d((short) (i1817 | 34), b415, (byte) (b415 | 18), objArr1212);
            Class<?> cls9 = Class.forName((String) objArr1212[0]);
            byte b416 = (byte) (i1817 & 62);
            Object[] objArr1213 = new Object[1];
            d((short) 201, b416, (byte) (b416 + 4), objArr1213);
            objArr17 = (Object[]) cls9.getMethod((String) objArr1213[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr1211);
            if (applicationContext2 != null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char jumpTapTimeout6 = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int offsetBefore9 = 2267 - TextUtils.getOffsetBefore("", 0);
                    int i1818 = 33 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    byte[] bArr213 = $$a;
                    byte b417 = bArr213[7];
                    Object[] objArr1214 = new Object[1];
                    c(b417, (short) (b417 | 106), (byte) (bArr213[208] - 1), objArr1214);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(jumpTapTimeout6, offsetBefore9, i1818, -654680577, false, (String) objArr1214[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, objArr17);
                long jLongValue111 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf26 = Long.valueOf(jLongValue111);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char cMakeMeasureSpec4 = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                    int modifierMetaStateMask6 = ((byte) KeyEvent.getModifierMetaStateMask()) + 2268;
                    int iIndexOf13 = TextUtils.indexOf("", "", 0, 0) + 33;
                    byte b418 = $$a[7];
                    short s110 = (short) (b418 | 210);
                    Object[] objArr1215 = new Object[1];
                    c(b418, s110, (byte) (s110 >>> 2), objArr1215);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(cMakeMeasureSpec4, modifierMetaStateMask6, iIndexOf13, -874156483, false, (String) objArr1215[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf26);
                Long lValueOf27 = Long.valueOf(jLongValue111 >> 12);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                    char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                    int i1819 = 2268 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int iMyPid4 = 33 - (Process.myPid() >> 22);
                    byte b419 = $$a[7];
                    Object[] objArr1216 = new Object[1];
                    c(b419, (short) (b419 | 158), (byte) 52, objArr1216);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(cLastIndexOf2, i1819, iMyPid4, -887667012, false, (String) objArr1216[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).set(null, lValueOf27);
            } else {
                objArr17 = objArr17;
            }
            objArr18 = objArr17;
        }
        if (((int[]) objArr18[0])[0] == ((int[]) objArr18[3])[0]) {
            arrayList3 = new ArrayList();
            strArr3 = (String[]) objArr18[1];
            if (strArr3 != null) {
                while (i13 < strArr3.length) {
                    arrayList3.add(str13);
                }
            }
            throw null;
        }
        objArr19 = new Object[]{new int[]{i191}, strArr17, new int[1], new int[]{i192}};
        int i1910 = ((int[]) objArr18[2])[0];
        int i1911 = ((int[]) objArr18[0])[0];
        int i1912 = ((int[]) objArr18[3])[0];
        String[] strArr113 = (String[]) objArr18[1];
        int iIdentityHashCode15 = System.identityHashCode(this);
        int i1913 = i1910 + 1487249287 + ((~((~iIdentityHashCode15) | 803207139)) * (-116)) + ((601744800 | iIdentityHashCode15) * 116) + (((~(iIdentityHashCode15 | (-206968516))) | 5506176) * 116);
        int i1914 = (i1913 << 13) ^ i1913;
        int i1915 = i1914 ^ (i1914 >>> 17);
        ((int[]) objArr19[2])[0] = i1915 ^ (i1915 << 5);
        objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
            char keyRepeatDelay4 = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 43042);
            int maxKeyCode7 = (KeyEvent.getMaxKeyCode() >> 16) + 3111;
            int capsMode4 = TextUtils.getCapsMode("", 0, 0) + 22;
            byte b56 = $$a[7];
            short s111 = (short) (b56 | 210);
            Object[] objArr1217 = new Object[1];
            c(b56, s111, (byte) (s111 >>> 2), objArr1217);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(keyRepeatDelay4, maxKeyCode7, capsMode4, -1272852037, false, (String) objArr1217[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).getLong(null) != -1) {
            int i1916 = TuitionPaymentFragmentbindingInflater1 + 121;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1916 % 128;
            int i1917 = i1916 % 2;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                char scrollDefaultDelay4 = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 43042);
                int mirror9 = AndroidCharacter.getMirror('0') + 3063;
                int iLastIndexOf14 = TextUtils.lastIndexOf("", '0', 0) + 23;
                byte[] bArr214 = $$a;
                byte b57 = bArr214[7];
                Object[] objArr1218 = new Object[1];
                c(b57, (short) (b57 | 106), (byte) (bArr214[208] - 1), objArr1218);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(scrollDefaultDelay4, mirror9, iLastIndexOf14, 154975793, false, (String) objArr1218[0], null);
            }
            Object[] objArr1219 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).get(null);
            int i1918 = ((int[]) objArr1219[2])[0];
            int i1919 = ((int[]) objArr1219[1])[0];
            String[] strArr114 = (String[]) objArr1219[3];
            int[] iArr14 = {i1919};
            int iMyTid7 = Process.myTid();
            int i2010 = ~iMyTid7;
            int i2011 = (-498553052) + ((1065334527 | i2010) * (-369)) + (((~((-643933244) | i2010)) | 1061098215) * (-369)) + (((~(iMyTid7 | 643933243)) | 421401284 | (~(i2010 | (-4236313)))) * 369) + 911649344;
            int i2012 = (i2011 << 13) ^ i2011;
            int i2013 = i2012 ^ (i2012 >>> 17);
            ((int[]) objArr20[0])[0] = i2013 ^ (i2013 << 5);
            objArr20 = new Object[]{new int[1], iArr14, new int[]{i1918}, strArr114};
        } else {
            Object[] objArr138 = {null, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str2, Object.class).invoke(null, this)).intValue()), 0, 911649344};
            byte[] bArr215 = $$d;
            Object[] objArr139 = new Object[1];
            d(bArr215[422], bArr215[72], bArr215[17], objArr139);
            Class<?> cls10 = Class.forName((String) objArr139[0]);
            short s112 = bArr215[64];
            Object[] objArr1310 = new Object[1];
            d(s112, (byte) (s112 | 28), (byte) (bArr215[142] - 1), objArr1310);
            objArr20 = (Object[]) cls10.getMethod((String) objArr1310[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr138);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                char trimmedLength2 = (char) (43042 - TextUtils.getTrimmedLength(""));
                int iMyPid5 = (Process.myPid() >> 22) + 3111;
                int iNormalizeMetaState6 = 22 - KeyEvent.normalizeMetaState(0);
                byte[] bArr216 = $$a;
                byte b58 = bArr216[7];
                Object[] objArr1311 = new Object[1];
                c(b58, (short) (b58 | 106), (byte) (bArr216[208] - 1), objArr1311);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(trimmedLength2, iMyPid5, iNormalizeMetaState6, 154975793, false, (String) objArr1311[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).set(null, objArr20);
            long jLongValue112 = ((Long) Class.forName(str3).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
            Long lValueOf28 = Long.valueOf(jLongValue112);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                char offsetBefore10 = (char) (43042 - TextUtils.getOffsetBefore("", 0));
                int absoluteGravity3 = 3111 - Gravity.getAbsoluteGravity(0, 0);
                int iMyTid8 = 22 - (Process.myTid() >> 22);
                byte b59 = $$a[7];
                Object[] objArr1312 = new Object[1];
                c(b59, (short) (b59 | 158), (byte) 52, objArr1312);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(offsetBefore10, absoluteGravity3, iMyTid8, -1269618118, false, (String) objArr1312[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).set(null, lValueOf28);
            Long lValueOf29 = Long.valueOf(jLongValue112 >> 12);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                char c14 = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 43042);
                int edgeSlop7 = 3111 - (ViewConfiguration.getEdgeSlop() >> 16);
                int iResolveOpacity6 = Drawable.resolveOpacity(0, 0) + 22;
                byte b510 = $$a[7];
                short s113 = (short) (b510 | 210);
                Object[] objArr1313 = new Object[1];
                c(b510, s113, (byte) (s113 >>> 2), objArr1313);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(c14, edgeSlop7, iResolveOpacity6, -1272852037, false, (String) objArr1313[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).set(null, lValueOf29);
        }
        i14 = ((int[]) objArr20[1])[0];
        i15 = ((int[]) objArr20[2])[0];
        if (i15 == i14) {
            arrayList4 = new ArrayList();
            strArr4 = (String[]) objArr20[3];
            if (strArr4 != null) {
                while (i16 < strArr4.length) {
                    arrayList4.add(str14);
                }
            }
            throw new RuntimeException(String.valueOf(i15));
        }
        int i2014 = ((int[]) objArr20[0])[0];
        int i2015 = ((int[]) objArr20[2])[0];
        int i2016 = ((int[]) objArr20[1])[0];
        String[] strArr115 = (String[]) objArr20[3];
        int[] iArr15 = {i2016};
        int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
        int i2017 = ~elapsedCpuTime2;
        int i2018 = i2014 + (-664361213) + (((~((-1081159036) | i2017)) | 1078994008) * 98) + (((~(i2017 | (-623872424))) | (-1081159036) | (~(623872423 | elapsedCpuTime2))) * (-49)) + (((~(elapsedCpuTime2 | (-1081159036))) | (-1702866432)) * 49);
        int i2019 = (i2018 << 13) ^ i2018;
        int i2110 = i2019 ^ (i2019 >>> 17);
        Object obj2 = new Object[]{new int[1], iArr15, new int[]{i2015}, strArr115}[0];
        ((int[]) obj2)[0] = i2110 ^ (i2110 << 5);
        int i2111 = ((int[]) objArr35[2])[0];
        int i2112 = i2111 * i2111;
        int i2113 = -(1928156341 * i2111);
        int i2114 = ((((i2112 | i2113) << 1) - (i2112 ^ i2113)) - (~(-(i2111 * 365048559)))) - (-1048942659);
        int i2115 = i2114 >> 20;
        int i2116 = (((i2115 | (-8191)) << 1) - (i2115 ^ (-8191))) / 4096;
        int i2117 = ((i2116 | 1) << 1) - (i2116 ^ 1);
        int i2118 = ((i2114 | i2117) << 1) - (i2117 ^ i2114);
        int i2119 = i2114 >> 26;
        int i2210 = ((i2119 & ComposerKt.defaultsKey) + (i2119 | ComposerKt.defaultsKey)) / 64;
        int i2211 = (-(((i2210 ^ 1) + ((i2210 & 1) << 1)) ^ i2118)) + 9;
        int i2212 = i2211 >> 17;
        int i2213 = ((((-65535) | i2212) << 1) - (i2212 ^ (-65535))) / 32768;
        int i2214 = (i2213 ^ 1) + ((i2213 & 1) << 1);
        int i2215 = 1926927 / ((i2211 & (-((i2214 & 1) + (i2214 | 1)))) * 251);
        int i2216 = ((int[]) objArr3[0])[0];
        int i2217 = i2216 * i2216;
        int i2218 = -(911206431 * i2216);
        int i2219 = (i2217 & i2218) + (i2217 | i2218);
        int i2310 = -(i2216 * (-765087217));
        int i2311 = (i2219 & i2310) + (i2310 | i2219);
        int i2312 = (i2311 ^ (-1871063023)) + (((-1871063023) & i2311) << 1);
        int i2313 = ((i2312 >> 28) - 31) / 16;
        int i2314 = (i2312 - (~((i2313 & 1) + (i2313 | 1)))) - 1;
        int i2315 = ((i2312 >> 29) - 15) / 8;
        int i2316 = (-(i2314 ^ (((i2315 | 1) << 1) - (i2315 ^ 1)))) + 9;
        int i2317 = i2316 >> 19;
        int i2318 = (((i2317 | (-16383)) << 1) - (i2317 ^ (-16383))) / 8192;
        int i2319 = ((i2318 | 1) << 1) - (i2318 ^ 1);
        int i2410 = i2215 + (9260973 / ((i2316 & (-((i2319 ^ 1) + ((i2319 & 1) << 1)))) * 1657));
        int i2411 = ((int[]) objArr5[1])[0];
        int i2412 = i2411 * i2411;
        int i2413 = -(966460819 * i2411);
        int i2414 = ((i2412 | i2413) << 1) - (i2412 ^ i2413);
        int i2415 = -(i2411 * (-427759687));
        int i2416 = ((i2414 ^ i2415) + ((i2415 & i2414) << 1)) - 1166052444;
        int i2417 = i2416 >> 19;
        int i2418 = ((i2417 & (-16383)) + (i2417 | (-16383))) / 8192;
        int i2419 = ((i2418 | 1) << 1) - (i2418 ^ 1);
        int i2510 = (i2416 & i2419) + (i2419 | i2416);
        int i2511 = i2416 >> 22;
        int i2512 = -(i2510 ^ (((((i2511 | (-2047)) << 1) - (i2511 ^ (-2047))) / 1024) + 1));
        int i2513 = (i2512 & 1) + (i2512 | 1);
        int i2514 = i2513 >> 22;
        int i2515 = ((i2514 ^ (-2047)) + ((i2514 & (-2047)) << 1)) / 1024;
        int i2516 = (i2515 & 1) + (i2515 | 1);
        int i2517 = i2410 + (769738 / (((-(((i2516 | 1) << 1) - (i2516 ^ 1))) & i2513) * 941));
        int i2518 = ((int[]) objArr63[3])[0];
        int i2519 = i2518 * i2518;
        int i2610 = -(87831947 * i2518);
        int i2611 = ((i2519 | i2610) << 1) - (i2519 ^ i2610);
        int i2612 = -(i2518 * 1323977829);
        int i2613 = ((i2611 | i2612) << 1) - (i2612 ^ i2611);
        int i2614 = (i2613 ^ 357363776) + ((357363776 & i2613) << 1);
        int i2615 = i2614 >> 18;
        int i2616 = ((i2615 & (-32767)) + (i2615 | (-32767))) / 16384;
        int i2617 = ((i2616 | 1) << 1) - (i2616 ^ 1);
        int i2618 = (i2614 ^ i2617) + ((i2617 & i2614) << 1);
        int i2619 = i2614 >> 26;
        int i2710 = (-(i2618 ^ ((((i2619 & ComposerKt.defaultsKey) + (i2619 | ComposerKt.defaultsKey)) / 64) + 1))) + 2;
        int i2711 = ((i2710 >> 23) - 1023) / 512;
        int i2712 = ((i2711 | 1) << 1) - (i2711 ^ 1);
        int i2713 = i2517 + (130652 / ((i2710 & (-((i2712 ^ 1) + ((i2712 & 1) << 1)))) * 367));
        int i2714 = ((int[]) objArr8[1])[0];
        int i2715 = ((i2714 * i2714) - (~(-(919886127 * i2714)))) - 1;
        int i2716 = -(i2714 * (-389447829));
        int i2717 = (i2715 & i2716) + (i2716 | i2715);
        int i2718 = (i2717 & 738856745) + (738856745 | i2717);
        int i2719 = i2718 >> 18;
        int i2810 = ((i2719 & (-32767)) + (i2719 | (-32767))) / 16384;
        int i2811 = (i2810 & 1) + (i2810 | 1);
        int i2812 = (i2718 ^ i2811) + ((i2811 & i2718) << 1);
        int i2813 = i2718 >> 29;
        int i2814 = (((i2813 | (-15)) << 1) - (i2813 ^ (-15))) / 8;
        int i2815 = (-(((i2814 ^ 1) + ((i2814 & 1) << 1)) ^ i2812)) + 7;
        int i2816 = ((i2815 >> 21) - 4095) / 2048;
        int i2817 = (i2816 & 1) + (i2816 | 1);
        int i2818 = i2713 + (8496201 / ((i2815 & (-((i2817 & 1) + (i2817 | 1)))) * 1263));
        int i2819 = ((int[]) objArr85[1])[0];
        int i2910 = i2819 * i2819;
        int i2911 = -(711177583 * i2819);
        int i2912 = (i2910 ^ i2911) + ((i2910 & i2911) << 1);
        int i2913 = -(i2819 * (-2064485973));
        int i2914 = (i2912 ^ i2913) + ((i2913 & i2912) << 1);
        int i2915 = (i2914 ^ (-170116183)) + (((-170116183) & i2914) << 1);
        int i2916 = ((i2915 >> 29) - 15) / 8;
        int i2917 = i2915 >> 23;
        int i2918 = -(((i2915 - (~(((i2916 | 1) << 1) - (i2916 ^ 1)))) - 1) ^ ((((i2917 & (-1023)) + (i2917 | (-1023))) / 512) + 1));
        int i2919 = (i2918 ^ 1) + ((i2918 & 1) << 1);
        int i3010 = ((i2919 >> 22) - 2047) / 1024;
        int i3011 = (i3010 ^ 1) + ((i3010 & 1) << 1);
        int i3012 = i2818 + (347448 / (((-((i3011 ^ 1) + ((i3011 & 1) << 1))) & i2919) * 934));
        int i3013 = ((int[]) objArr11[1])[0];
        int i3014 = i3013 * i3013;
        int i3015 = -(1233581814 * i3013);
        int i3016 = ((i3014 | i3015) << 1) - (i3014 ^ i3015);
        int i3017 = -(i3013 * 1635993072);
        int i3018 = ((i3016 ^ i3017) + ((i3017 & i3016) << 1)) - (-85796777);
        int i3019 = i3018 >> 29;
        int i3110 = (((i3019 | (-15)) << 1) - (i3019 ^ (-15))) / 8;
        int i3111 = (i3110 & 1) + (i3110 | 1);
        int i3112 = (i3018 ^ i3111) + ((i3111 & i3018) << 1);
        int i3113 = i3018 >> 26;
        int i3114 = ((i3113 & ComposerKt.defaultsKey) + (i3113 | ComposerKt.defaultsKey)) / 64;
        int i3115 = -((((i3114 | 1) << 1) - (i3114 ^ 1)) ^ i3112);
        int i3116 = (i3115 & 5) + (i3115 | 5);
        int i3117 = i3116 >> 22;
        int i3118 = (((i3117 | (-2047)) << 1) - (i3117 ^ (-2047))) / 1024;
        int i3119 = i3012 + (2237900 / (((-(((i3118 ^ 1) + ((i3118 & 1) << 1)) + 1)) & i3116) * 805));
        int i3210 = ((int[]) objArr13[3])[0];
        int i3211 = i3210 * i3210;
        int i3212 = -(1687173211 * i3210);
        int i3213 = ((((i3211 | i3212) << 1) - (i3211 ^ i3212)) - (~(-(i3210 * 1870469329)))) - 1;
        int i3214 = ((i3213 | (-1911736348)) << 1) - ((-1911736348) ^ i3213);
        int i3215 = i3214 >> 29;
        int i3216 = (i3215 - 15) / 8;
        int i3217 = (i3216 & 1) + (i3216 | 1);
        int i3218 = (i3214 & i3217) + (i3214 | i3217);
        int i3219 = ((i3215 & (-15)) + (i3215 | (-15))) / 8;
        int i3310 = -(((i3219 & 1) + (i3219 | 1)) ^ i3218);
        int i3311 = ((i3310 | 4) << 1) - (i3310 ^ 4);
        int i3312 = i3311 >> 17;
        int i3313 = (((-65535) & i3312) + (i3312 | (-65535))) / 32768;
        int i3314 = i3119 + (957816 / (((-(((i3313 & 1) + (i3313 | 1)) + 1)) & i3311) * 477));
        int i3315 = ((int[]) objArr16[1])[0];
        int i3316 = i3315 * i3315;
        int i3317 = -(2127605181 * i3315);
        int i3318 = ((i3316 | i3317) << 1) - (i3316 ^ i3317);
        int i3319 = -(i3315 * 1359142933);
        int i3410 = ((i3318 | i3319) << 1) - (i3319 ^ i3318);
        int i3411 = (i3410 ^ 749682705) + ((749682705 & i3410) << 1);
        int i3412 = i3411 >> 27;
        int i3413 = ((i3412 ^ (-63)) + ((i3412 & (-63)) << 1)) / 32;
        int i3414 = (i3411 - (~((i3413 & 1) + (i3413 | 1)))) - 1;
        int i3415 = ((i3411 >> 19) - 16383) / 8192;
        int i3416 = -(i3414 ^ ((i3415 ^ 1) + ((i3415 & 1) << 1)));
        int i3417 = ((i3416 | 3) << 1) - (i3416 ^ 3);
        int i3418 = i3417 >> 29;
        int i3419 = ((i3418 ^ (-15)) + ((i3418 & (-15)) << 1)) / 8;
        int i3510 = (i3419 & 1) + (i3419 | 1);
        int i3511 = i3314 + (297000 / (((-((i3510 ^ 1) + ((i3510 & 1) << 1))) & i3417) * 1980));
        int i3512 = ((int[]) objArr19[2])[0];
        int i3513 = i3512 * i3512;
        int i3514 = -(772612053 * i3512);
        int i3515 = (i3513 ^ i3514) + ((i3513 & i3514) << 1);
        int i3516 = -(i3512 * (-1318826903));
        int i3517 = (i3515 ^ i3516) + ((i3516 & i3515) << 1);
        int i3518 = (i3517 & 807409601) + (807409601 | i3517);
        int i3519 = i3518 >> 24;
        int i3610 = ((i3519 ^ (-511)) + ((i3519 & (-511)) << 1)) / 256;
        int i3611 = (i3610 ^ 1) + ((i3610 & 1) << 1);
        int i3612 = -(((((i3518 >> 15) - 262143) / 131072) + 1) ^ (((i3518 | i3611) << 1) - (i3611 ^ i3518)));
        int i3613 = (i3612 ^ 8) + ((i3612 & 8) << 1);
        int i3614 = i3511 + (11279040 / (((-((((i3613 >> 20) - 8191) / 4096) + 2)) & i3613) * 1895));
        int i3615 = ((int[]) obj2)[0];
        int i3616 = i3615 * i3615;
        int i3617 = -(2061282962 * i3615);
        int i3618 = ((i3616 | i3617) << 1) - (i3616 ^ i3617);
        int i3619 = -(i3615 * (-1410874474));
        int i3710 = (i3618 ^ i3619) + ((i3619 & i3618) << 1);
        int i3711 = ((i3710 | (-1207309936)) << 1) - ((-1207309936) ^ i3710);
        int i3712 = ((i3711 >> 17) - 65535) / 32768;
        int i3713 = (i3711 - (~((i3712 & 1) + (i3712 | 1)))) - 1;
        int i3714 = i3711 >> 24;
        int i3715 = ((i3714 ^ (-511)) + ((i3714 & (-511)) << 1)) / 256;
        int i3716 = -(i3713 ^ ((i3715 & 1) + (i3715 | 1)));
        int i3717 = (i3716 ^ 4) + ((i3716 & 4) << 1);
        int i3718 = i3717 >> 16;
        int i3719 = ((((-131071) | i3718) << 1) - (i3718 ^ (-131071))) / 65536;
        Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "2/18/31/8/File Downloaded".substring(i3614 + ((-33170020) / (((-(((i3719 ^ 1) + ((i3719 & 1) << 1)) + 1)) & i3717) * 1469))), 0).show();
    }

    private static String $$g(short s, int i, byte b2) {
        byte[] bArr = $$c;
        int i2 = i * 2;
        int i3 = (s * 4) + 4;
        int i4 = 104 - b2;
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3++;
            i4 = i2 + i3;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i4;
            if (i5 == i2) {
                return new String(bArr2, 0);
            }
            int i6 = bArr[i3];
            i3++;
            i4 += i6;
        }
    }
}

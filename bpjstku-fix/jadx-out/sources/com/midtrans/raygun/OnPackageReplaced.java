package com.midtrans.raygun;

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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.DualSurfaceProcessorNodeExternalSyntheticLambda0;
import defpackage.abortCapture;
import defpackage.initSession;
import defpackage.onScroll;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.io.encoding.Base64;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes6.dex */
public class OnPackageReplaced extends BroadcastReceiver {
    private static final byte[] $$c = {108, -26, -110, 50};
    private static final int $$f = 252;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {41, 2, 45, -60, -14, 0, Base64.padSymbol, -59, -10, -2, 6, -7, 5, 53, -53, -15, 8, -16, 1, 4, 3, 52, -59, -8, -8, 67, -65, 10, -17, -5, 67, -65, -4, 9, -3, -9, 60, -36, -33, 1, -15, 16, -10, -1, -35, 10, -13, 9, -8, -1, 28, -19, -26, 10, 6, -11, -8, 44, -46, 15, -8, -8, 6, -11, -8, 16, -9, -7, 8, -7, -7, 5, 28, -39, 6, -8, 9, -21, 13, -15, 63, -14, 0, Base64.padSymbol, -59, -10, -2, 6, -7, 5, 53, -53, -15, 8, -16, 1, 4, 3, 52, -59, -8, -8, 67, -65, 6, 2, -20, -4, 1, 11, -10, 6, -11, -8, 68, -61, -7, -8, 13, -15, 2, 11, -13, 60, -78, -2, 22, -6, -14, 0, Base64.padSymbol, -59, -10, -2, 6, -7, 5, 53, -53, -15, 8, -16, 1, 4, 3, 52, -59, -8, -8, 67, -64, -5, 10, 0, -21, 9, -8, -1, 62, -78, -2, 0, -14, 0, Base64.padSymbol, -59, -10, -2, 6, -7, 5, 53, -53, -15, 8, -16, 1, 4, 3, 52, -64, 1, 5, -18, 15, -19, 7, 2, -16, 67, -68, 2, 9, -4, -4, -16, 67, -61, -7, -8, 13, -15, 2, 11, -13, 60, -78, -2, 22, -14, 0, 0, -17, 49, -36, -19, 9, -8, -1, 42, -33, -19, 40, -35, 3, -3, 20, -25, -2, -15, 12, -17, 78, -50, -35, 10, -13, 9, -8, -1, 28, -19, -26, 10, 6, -11, -8, 44, -46, 15, -8, -8, 6, -11, -8, -1, 1, 9, 0, -8, 6, -13, 1, -7, 0, 1, -7, 7, -1, -20, 11, 2, -20, 40, -36, 9, -3, -9, 6, -3, -3, 3, -22, 7, -10, 63, -14, 0, Base64.padSymbol, -59, -10, -2, 6, -7, 5, 53, -53, -15, 8, -16, 1, 4, 3, 52, -59, -8, -8, 67, -61, -7, -8, 13, -15, 2, 11, -13, 60, -65, -1, -1, 0, -13, 19, -6, -14, 0, -2, -4, -1, 62, -78, -2, 22, -5, -14, 0, Base64.padSymbol, -71, 0, -6, 18, -19, 11, -18, 3, 64, -67, 2, 1, -14, -2, 2, 64, -61, -7, -8, 13, -15, 2, 11, -13, 60, -60, -14, -2, 2, 64, -28, -46, -2, 2, 41, -43, 5, -4, -7, 7, 63, -16, -35, 10, -13, 9, -8, -1, 28, -19, -26, 10, 6, -11, -8, 44, -46, 15, -8, -8, 6, -11, -8, -1, 1, 9, 0, -8, 6, -13, 1, -7, 0, 1, -7, 7, -1, -20, 11, 2, -20, 40, -36, 9, -3, -9, 6, -3, -3, 3, -22, 7, -10, 65};
    private static final int $$e = 130;
    private static final byte[] $$a = {17, 104, 102, -28, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -29, 31, -48, -17, 4, -24, 1, -6, -13, -13, -29, 38, -50, -16, -1, -12, -24};
    private static final int $$b = 59;
    private static int b = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -8878861964276144244L;

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = 214 - r7
            int r6 = r6 + 1
            int r8 = 103 - r8
            byte[] r0 = com.midtrans.raygun.OnPackageReplaced.$$a
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L11
            r4 = r6
            r8 = r7
            r3 = r2
            goto L26
        L11:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r4 = r0[r8]
        L26:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            int r8 = r8 + 1
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.raygun.OnPackageReplaced.c(int, int, byte, java.lang.Object[]):void");
    }

    private static void d(byte b2, short s, int i, Object[] objArr) {
        int i2 = i + 84;
        byte[] bArr = $$d;
        int i3 = s + 4;
        byte[] bArr2 = new byte[b2 + 1];
        int i4 = -1;
        if (bArr == null) {
            i2 = (b2 + (-i2)) - 2;
            i4 = -1;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i2;
            if (i5 == b2) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i3++;
            i2 = (i2 + (-bArr[i3])) - 2;
            i4 = i5;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault1 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $11 + 55;
        while (true) {
            $10 = i3 % 128;
            int i4 = i3 % 2;
            if (abortcapture.b >= cArrB.length) {
                objArr[0] = new String(cArrB, 4, cArrB.length - 4);
                return;
            }
            int i5 = $11 + 79;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i7 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Gravity.getAbsoluteGravity(0, 0) + 64838), (ViewConfiguration.getLongPressTimeout() >> 16) + 1356, 38 - (Process.myTid() >> 22), 894276454, false, $$g(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - TextUtils.indexOf("", "", 0)), 469 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 12, 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                i3 = $11 + 29;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0190  */
    /* JADX WARN: Code duplicated, block: B:267:0x1988  */
    /* JADX WARN: Code duplicated, block: B:268:0x19fd  */
    /* JADX WARN: Code duplicated, block: B:270:0x1a09  */
    /* JADX WARN: Code duplicated, block: B:273:0x1a0d A[LOOP:3: B:271:0x1a0a->B:273:0x1a0d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:277:0x1a99  */
    /* JADX WARN: Code duplicated, block: B:280:0x1b00  */
    /* JADX WARN: Code duplicated, block: B:283:0x1b4f  */
    /* JADX WARN: Code duplicated, block: B:285:0x1b58  */
    /* JADX WARN: Code duplicated, block: B:288:0x1c17 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:289:0x1c19  */
    /* JADX WARN: Code duplicated, block: B:295:0x1c29  */
    /* JADX WARN: Code duplicated, block: B:296:0x1c2e  */
    /* JADX WARN: Code duplicated, block: B:300:0x1cc3  */
    /* JADX WARN: Code duplicated, block: B:302:0x1ccc  */
    /* JADX WARN: Code duplicated, block: B:307:0x1d33  */
    /* JADX WARN: Code duplicated, block: B:308:0x1d73  */
    /* JADX WARN: Code duplicated, block: B:311:0x1d8b  */
    /* JADX WARN: Code duplicated, block: B:315:0x1dd8  */
    /* JADX WARN: Code duplicated, block: B:319:0x1def  */
    /* JADX WARN: Code duplicated, block: B:321:0x1e6d  */
    /* JADX WARN: Code duplicated, block: B:324:0x1ed3  */
    /* JADX WARN: Code duplicated, block: B:327:0x1f28  */
    /* JADX WARN: Code duplicated, block: B:329:0x1f31  */
    /* JADX WARN: Code duplicated, block: B:332:0x1fea  */
    /* JADX WARN: Code duplicated, block: B:336:0x2072  */
    /* JADX WARN: Code duplicated, block: B:341:0x20dd  */
    /* JADX WARN: Code duplicated, block: B:344:0x2132  */
    /* JADX WARN: Code duplicated, block: B:348:0x218f  */
    /* JADX WARN: Code duplicated, block: B:350:0x21fd  */
    /* JADX WARN: Code duplicated, block: B:353:0x2263  */
    /* JADX WARN: Code duplicated, block: B:356:0x22b1  */
    /* JADX WARN: Code duplicated, block: B:358:0x22ba  */
    /* JADX WARN: Code duplicated, block: B:361:0x2373  */
    /* JADX WARN: Code duplicated, block: B:363:0x2378  */
    /* JADX WARN: Code duplicated, block: B:369:0x2389  */
    /* JADX WARN: Code duplicated, block: B:370:0x238e  */
    /* JADX WARN: Code duplicated, block: B:374:0x2416  */
    /* JADX WARN: Code duplicated, block: B:376:0x241f  */
    /* JADX WARN: Code duplicated, block: B:381:0x2482  */
    /* JADX WARN: Code duplicated, block: B:382:0x24c5  */
    /* JADX WARN: Code duplicated, block: B:385:0x24de  */
    /* JADX WARN: Code duplicated, block: B:389:0x252e  */
    /* JADX WARN: Code duplicated, block: B:393:0x2543  */
    /* JADX WARN: Code duplicated, block: B:394:0x25a9  */
    /* JADX WARN: Code duplicated, block: B:397:0x262d  */
    /* JADX WARN: Code duplicated, block: B:400:0x2692  */
    /* JADX WARN: Code duplicated, block: B:401:0x26d7  */
    /* JADX WARN: Code duplicated, block: B:404:0x26ec  */
    /* JADX WARN: Code duplicated, block: B:406:0x26f5  */
    /* JADX WARN: Code duplicated, block: B:408:0x27b9  */
    /* JADX WARN: Code duplicated, block: B:411:0x27c3 A[Catch: all -> 0x2e69, TryCatch #9 {all -> 0x2e69, blocks: (B:409:0x27bd, B:411:0x27c3, B:412:0x27ef, B:414:0x281a, B:415:0x28b1, B:186:0x1230, B:188:0x1245, B:189:0x1279, B:191:0x12ad, B:192:0x1323, B:110:0x0a26, B:112:0x0a3b, B:113:0x0a71, B:26:0x01b4, B:28:0x01c8, B:29:0x01fa, B:31:0x0233, B:32:0x02b3), top: B:548:0x01b4 }] */
    /* JADX WARN: Code duplicated, block: B:414:0x281a A[Catch: all -> 0x2e69, TryCatch #9 {all -> 0x2e69, blocks: (B:409:0x27bd, B:411:0x27c3, B:412:0x27ef, B:414:0x281a, B:415:0x28b1, B:186:0x1230, B:188:0x1245, B:189:0x1279, B:191:0x12ad, B:192:0x1323, B:110:0x0a26, B:112:0x0a3b, B:113:0x0a71, B:26:0x01b4, B:28:0x01c8, B:29:0x01fa, B:31:0x0233, B:32:0x02b3), top: B:548:0x01b4 }] */
    /* JADX WARN: Code duplicated, block: B:418:0x28c4  */
    /* JADX WARN: Code duplicated, block: B:423:0x2932  */
    /* JADX WARN: Code duplicated, block: B:426:0x2989  */
    /* JADX WARN: Code duplicated, block: B:430:0x29db  */
    /* JADX WARN: Code duplicated, block: B:432:0x2a5c  */
    /* JADX WARN: Code duplicated, block: B:435:0x2aa3  */
    /* JADX WARN: Code duplicated, block: B:437:0x2aac  */
    /* JADX WARN: Code duplicated, block: B:440:0x2b5b  */
    /* JADX WARN: Code duplicated, block: B:441:0x2b5d  */
    /* JADX WARN: Code duplicated, block: B:447:0x2b6d  */
    /* JADX WARN: Code duplicated, block: B:451:0x2c05  */
    /* JADX WARN: Code duplicated, block: B:453:0x2c0e  */
    /* JADX WARN: Code duplicated, block: B:458:0x2c78  */
    /* JADX WARN: Code duplicated, block: B:461:0x2ccb  */
    /* JADX WARN: Code duplicated, block: B:467:0x2d1e  */
    /* JADX WARN: Code duplicated, block: B:469:0x2d99  */
    /* JADX WARN: Code duplicated, block: B:471:0x2da5  */
    /* JADX WARN: Code duplicated, block: B:472:0x2dae  */
    /* JADX WARN: Code duplicated, block: B:474:0x2dba A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:475:0x2dbb  */
    /* JADX WARN: Code duplicated, block: B:477:0x2dc7  */
    /* JADX WARN: Code duplicated, block: B:480:0x2dcb A[LOOP:0: B:478:0x2dc8->B:480:0x2dcb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:483:0x2ddd  */
    /* JADX WARN: Code duplicated, block: B:485:0x2de9  */
    /* JADX WARN: Code duplicated, block: B:488:0x2ded A[LOOP:1: B:486:0x2dea->B:488:0x2ded, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:493:0x2dfd  */
    /* JADX WARN: Code duplicated, block: B:495:0x2e09  */
    /* JADX WARN: Code duplicated, block: B:498:0x2e0d A[LOOP:2: B:496:0x2e0a->B:498:0x2e0d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:503:0x2e25  */
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) throws Throwable {
        Context applicationContext;
        Object[] objArr;
        int i;
        Object[] objArr2;
        int i2;
        Object[] objArr3;
        Object[] objArr4;
        Object[] objArr5;
        Context context2;
        Object[] objArr6;
        int i3;
        int i4;
        ArrayList arrayList;
        String[] strArr;
        int i5;
        int i6;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        long j;
        long jLongValue;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Context applicationContext2;
        Object[] objArr7;
        String str;
        Object[] objArr8;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8;
        long j2;
        long jLongValue2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9;
        Object[] objArr9;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12;
        int i7;
        int i8;
        ArrayList arrayList2;
        String[] strArr2;
        int i9;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13;
        long j3;
        long jLongValue3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14;
        Context applicationContext3;
        Context applicationContext4;
        Object[] objArr10;
        Object[] objArr11;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17;
        int i10;
        int i11;
        int i12;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18;
        long j4;
        long jLongValue4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21;
        Object[] objArr12;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24;
        int i13;
        ArrayList arrayList3;
        String[] strArr3;
        int i14;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25;
        Object[] objArr13;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28;
        int i15;
        int i16;
        ArrayList arrayList4;
        String[] strArr4;
        int i17;
        Intent intent2;
        int i18;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33;
        int i19 = 2 % 2;
        String str2 = "";
        Object[] objArr14 = new Object[1];
        a(new char[]{60373, 60340, 59236, 60128, 26468, 31956, 39709, 56338, 41631, 45777, 13436, 54169, 34026, 39469, 60526, 11148, 19796, 21493, 42460, 25090, 13592, 2989, 40316, 47840, 65022, 49981}, TextUtils.getTrimmedLength(""), objArr14);
        String str3 = (String) objArr14[0];
        Object[] objArr15 = new Object[1];
        a(new char[]{5599, 5562, 27294, 26392, 14304, 11349, 52719, 8708, 12137, 58401, 25848, 34069, 31466, 6085, 48296, 32091, 45902, 56849, 62793}, View.getDefaultSize(0, 0), objArr15);
        String str4 = (String) objArr15[0];
        Object[] objArr16 = new Object[1];
        a(new char[]{57357, 57447, 26691, 26056, 9944, 15738, 60964, 55179, 11709, 51195, 30149, 42739, 36666, 5463, 44463, 24204, 18054, 56533, 58481, 5920}, TextUtils.getOffsetAfter("", 0), objArr16);
        String str5 = (String) objArr16[0];
        Object[] objArr17 = new Object[1];
        a(new char[]{49908, 49821, 23808, 20622, 24422, 17623, 28368, 62760, 6395, 18176, 3182, 9759, 44524, 8283, 54321, 56934, 25679, 59789, 40398, 38867}, TextUtils.indexOf("", ""), objArr17);
        String str6 = (String) objArr17[0];
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 53894);
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 1321;
            int i20 = 37 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            byte[] bArr = $$a;
            byte b2 = bArr[7];
            Object[] objArr18 = new Object[1];
            c(b2, (short) (b2 | 210), (byte) (bArr[19] - 1), objArr18);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(cLastIndexOf, iLastIndexOf, i20, -1433084963, false, (String) objArr18[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                char offsetAfter = (char) (53893 - TextUtils.getOffsetAfter("", 0));
                int keyRepeatDelay = 1320 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                int iIndexOf = 35 - TextUtils.indexOf((CharSequence) "", '0');
                Object[] objArr19 = new Object[1];
                c((byte) 52, (short) 210, $$a[10], objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(offsetAfter, keyRepeatDelay, iIndexOf, -1920778747, false, (String) objArr19[0], null);
            }
            Object[] objArr20 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).get(null);
            objArr = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i21 = ((int[]) objArr20[0])[0];
            int i22 = ((int[]) objArr20[3])[0];
            String[] strArr5 = (String[]) objArr20[2];
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i23 = (-2131983632) + (((~((-986814871) | elapsedCpuTime)) | 314605842) * 576) + (((~((~elapsedCpuTime) | (-672209029))) | 69207112) * 576) + 651676454;
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr[1])[0] = i25 ^ (i25 << 5);
        } else {
            if (context != null) {
                int i26 = TuitionPaymentFragmentbindingInflater1;
                int i27 = i26 + 99;
                b = i27 % 128;
                int i28 = i27 % 2;
                if (context instanceof ContextWrapper) {
                    int i29 = i26 + 97;
                    b = i29 % 128;
                    if (i29 % 2 != 0) {
                        ((ContextWrapper) context).getBaseContext();
                        throw null;
                    }
                    if (((ContextWrapper) context).getBaseContext() != null) {
                        applicationContext = context.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = context.getApplicationContext();
                }
            } else {
                applicationContext = context;
            }
            int iIntValue = ((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr21 = {1637278774};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b((char) (47978 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 1300 - KeyEvent.getDeadChar(0, 0), 20 - (ViewConfiguration.getTouchSlop() >> 8), -420973425, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr22 = {applicationContext, "com.bpjstku", -172662106, Integer.valueOf(iIntValue), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).newInstance(objArr21), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                    char mode = (char) (View.MeasureSpec.getMode(0) + 53893);
                    int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1321;
                    int capsMode = TextUtils.getCapsMode("", 0, 0) + 36;
                    Object[] objArr23 = new Object[1];
                    c((byte) 52, (short) 210, $$a[10], objArr23);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(mode, iIndexOf2, capsMode, 819724799, false, (String) objArr23[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 57878), 1394 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 75 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), Boolean.TYPE});
                }
                Object[] objArr24 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).invoke(null, objArr22);
                if (applicationContext != null) {
                    int i30 = TuitionPaymentFragmentbindingInflater1 + 29;
                    b = i30 % 128;
                    int i31 = i30 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                        char jumpTapTimeout = (char) (53893 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                        int iKeyCodeFromString = 1320 - KeyEvent.keyCodeFromString("");
                        int i32 = 37 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        Object[] objArr25 = new Object[1];
                        c((byte) 52, (short) 210, $$a[10], objArr25);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(jumpTapTimeout, iKeyCodeFromString, i32, -1920778747, false, (String) objArr25[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).set(null, objArr24);
                    try {
                        long jLongValue5 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue5);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                            char scrollDefaultDelay = (char) (53893 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                            int i33 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1320;
                            int iAlpha = 36 - Color.alpha(0);
                            byte[] bArr2 = $$a;
                            Object[] objArr26 = new Object[1];
                            c((byte) (bArr2[208] - 1), (short) 158, bArr2[10], objArr26);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(scrollDefaultDelay, i33, iAlpha, -1273706634, false, (String) objArr26[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue5 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
                            char scrollBarSize = (char) (53893 - (ViewConfiguration.getScrollBarSize() >> 8));
                            int i34 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1320;
                            int trimmedLength = TextUtils.getTrimmedLength("") + 36;
                            byte[] bArr3 = $$a;
                            byte b3 = bArr3[7];
                            Object[] objArr27 = new Object[1];
                            c(b3, (short) (b3 | 210), (byte) (bArr3[19] - 1), objArr27);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(scrollBarSize, i34, trimmedLength, -1433084963, false, (String) objArr27[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr24 = objArr24;
                }
                objArr = objArr24;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i35 = ((int[]) objArr[3])[0];
        int i36 = ((int[]) objArr[0])[0];
        if (i36 == i35) {
            Object[] objArr28 = {new int[]{i}, new int[1], strArr, new int[]{i}};
            int i37 = ((int[]) objArr[1])[0];
            int i38 = ((int[]) objArr[0])[0];
            int i39 = ((int[]) objArr[3])[0];
            String[] strArr6 = (String[]) objArr[2];
            int iIdentityHashCode = System.identityHashCode(this);
            int i40 = i37 + 950431104 + (((~((-202230045) | iIdentityHashCode)) | 67387668) * 345) + (((~((-202230045) | (~iIdentityHashCode))) | 1101010112) * 345) + ((~(iIdentityHashCode | (-67387669))) * 345);
            int i41 = (i40 << 13) ^ i40;
            int i42 = i41 ^ (i41 >>> 17);
            i = 0;
            ((int[]) objArr28[1])[0] = i42 ^ (i42 << 5);
        } else {
            Toast.makeText((Context) null, i36 / (((i36 - 1) * i36) % 2), 0).show();
            Object[] objArr29 = {new int[]{i}, new int[1], strArr, new int[]{i}};
            int i43 = ((int[]) objArr[1])[0];
            int i44 = ((int[]) objArr[0])[0];
            int i45 = ((int[]) objArr[3])[0];
            String[] strArr7 = (String[]) objArr[2];
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i46 = i43 + (((17580292 + (((-671370277) | startElapsedRealtime) * (-381))) + (((~((~startElapsedRealtime) | 396079818)) | (-764272365)) * 381)) - 1905962604);
            int i47 = i46 ^ (i46 << 13);
            int i48 = i47 ^ (i47 >>> 17);
            i = 0;
            ((int[]) objArr29[1])[0] = i48 ^ (i48 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
            char cGreen = (char) (Color.green(i) + 31533);
            int size = View.MeasureSpec.getSize(i) + 921;
            int size2 = 28 - View.MeasureSpec.getSize(i);
            byte[] bArr4 = $$a;
            byte b4 = bArr4[7];
            Object[] objArr30 = new Object[1];
            c(b4, (short) (b4 | 210), (byte) (bArr4[19] - 1), objArr30);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(cGreen, size, size2, -1048449946, false, (String) objArr30[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).getLong(null) != -1) {
            int i49 = b + 31;
            TuitionPaymentFragmentbindingInflater1 = i49 % 128;
            int i50 = i49 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 31534);
                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 921;
                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 28;
                byte[] bArr5 = $$a;
                Object[] objArr31 = new Object[1];
                c((byte) (bArr5[208] - 1), (short) 158, bArr5[10], objArr31);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(cIndexOf, iResolveOpacity, scrollBarFadeDuration, -1142834547, false, (String) objArr31[0], null);
            }
            Object[] objArr32 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).get(null);
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr32[1])[0]}, (Object[]) objArr32[2], new int[]{((int[]) objArr32[3])[0]}, (String[]) objArr32[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i51 = ~iIdentityHashCode2;
            int i52 = (-1995238697) + ((iIdentityHashCode2 | 352387074) * 988) + (((~(520179366 | i51)) | 1086107985) * (-1976)) + (((~(iIdentityHashCode2 | (-1253900278))) | 352387074 | (~(1253900277 | i51))) * 988) + 1666310059;
            int i53 = (i52 << 13) ^ i52;
            int i54 = i53 ^ (i53 >>> 17);
            ((int[]) objArr2[0])[0] = i54 ^ (i54 << 5);
        } else {
            try {
                Object[] objArr33 = {context != null ? ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext() : context, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), 0, 1666310059};
                byte[] bArr6 = $$d;
                Object[] objArr34 = new Object[1];
                d(bArr6[222], bArr6[43], bArr6[59], objArr34);
                Class<?> cls = Class.forName((String) objArr34[0]);
                Object[] objArr35 = new Object[1];
                d((byte) 37, (short) (-bArr6[73]), bArr6[5], objArr35);
                Object[] objArr36 = (Object[]) cls.getMethod((String) objArr35[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr33);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                    char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 31534);
                    int capsMode2 = 921 - TextUtils.getCapsMode("", 0, 0);
                    int jumpTapTimeout2 = 28 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    byte[] bArr7 = $$a;
                    Object[] objArr37 = new Object[1];
                    c((byte) (bArr7[208] - 1), (short) 158, bArr7[10], objArr37);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(cIndexOf2, capsMode2, jumpTapTimeout2, -1142834547, false, (String) objArr37[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).set(null, objArr36);
                try {
                    long jLongValue6 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf3 = Long.valueOf(jLongValue6);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                        char cLastIndexOf2 = (char) (31532 - TextUtils.lastIndexOf("", '0', 0, 0));
                        int iMyPid = (Process.myPid() >> 22) + 921;
                        int i55 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 27;
                        Object[] objArr38 = new Object[1];
                        c((byte) 52, (short) 210, $$a[10], objArr38);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(cLastIndexOf2, iMyPid, i55, -778300370, false, (String) objArr38[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).set(null, lValueOf3);
                    Long lValueOf4 = Long.valueOf(jLongValue6 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                        char c = (char) (31533 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                        int iLastIndexOf2 = 920 - TextUtils.lastIndexOf("", '0');
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 29;
                        byte[] bArr8 = $$a;
                        byte b5 = bArr8[7];
                        Object[] objArr39 = new Object[1];
                        c(b5, (short) (b5 | 210), (byte) (bArr8[19] - 1), objArr39);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(c, iLastIndexOf2, bitsPerPixel, -1048449946, false, (String) objArr39[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).set(null, lValueOf4);
                    objArr2 = objArr36;
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
        int i56 = ((int[]) objArr2[1])[0];
        int i57 = ((int[]) objArr2[3])[0];
        if (i57 == i56) {
            int i58 = ((int[]) objArr2[0])[0];
            Object[] objArr40 = {new int[1], new int[]{((int[]) objArr2[1])[0]}, (Object[]) objArr2[2], new int[]{((int[]) objArr2[3])[0]}, (String[]) objArr2[4]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i59 = i58 + (((~(startUptimeMillis | 848442344)) | 925637299) * 56) + 2042248147 + (((~((~startUptimeMillis) | 925637299)) | 848442344) * 56);
            int i60 = (i59 << 13) ^ i59;
            int i61 = i60 ^ (i60 >>> 17);
            i2 = 0;
            ((int[]) objArr40[0])[0] = i61 ^ (i61 << 5);
        } else {
            ArrayList arrayList5 = new ArrayList();
            String[] strArr8 = (String[]) objArr2[4];
            if (strArr8 != null) {
                for (String str7 : strArr8) {
                    arrayList5.add(str7);
                }
            }
            Toast.makeText((Context) null, i57 / (((i57 - 1) * i57) % 2), 0).show();
            int i62 = ((int[]) objArr2[0])[0];
            Object[] objArr41 = {new int[1], new int[]{((int[]) objArr2[1])[0]}, (Object[]) objArr2[2], new int[]{((int[]) objArr2[3])[0]}, (String[]) objArr2[4]};
            int i63 = (int) Runtime.getRuntime().totalMemory();
            int i64 = ~i63;
            int i65 = (~((-252431940) | i64)) | 84495875;
            int i66 = ~(i63 | (-1353711641));
            int i67 = i62 + (-1233628642) + ((i65 | i66) * (-713)) + (i66 * 1426) + ((~((-1521647705) | i64)) * 713);
            int i68 = (i67 << 13) ^ i67;
            int i69 = i68 ^ (i68 >>> 17);
            i2 = 0;
            ((int[]) objArr41[0])[0] = i69 ^ (i69 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
            char size3 = (char) (29944 - View.MeasureSpec.getSize(i2));
            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1755;
            int i70 = (CdmaCellLocation.convertQuartSecToDecDegrees(i2) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i2) == 0.0d ? 0 : -1)) + 23;
            byte[] bArr9 = $$a;
            Object[] objArr42 = new Object[1];
            c((byte) (bArr9[208] - 1), (short) 158, bArr9[10], objArr42);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(size3, windowTouchSlop, i70, 986134021, false, (String) objArr42[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 29944);
                int modifierMetaStateMask = 1754 - ((byte) KeyEvent.getModifierMetaStateMask());
                int i71 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 22;
                Object[] objArr43 = new Object[1];
                c((byte) 52, (short) 210, $$a[10], objArr43);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(doubleTapTimeout, modifierMetaStateMask, i71, 1599039318, false, (String) objArr43[0], null);
            }
            Object[] objArr44 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).get(null);
            objArr3 = new Object[]{new int[]{((int[]) objArr44[0])[0]}, new int[]{((int[]) objArr44[1])[0]}, (Object[]) objArr44[2], new int[1], (String[]) objArr44[4]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i72 = ~iElapsedRealtime;
            int i73 = (((1409385585 + (((~(144566661 | i72)) | 67241008) * 184)) + ((iElapsedRealtime | 143771905) * (-184))) + ((~((-68035765) | i72)) * 184)) - 466256576;
            int i74 = (i73 << 13) ^ i73;
            int i75 = i74 ^ (i74 >>> 17);
            ((int[]) objArr3[3])[0] = i75 ^ (i75 << 5);
        } else {
            int iIntValue2 = ((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue();
            Object[] objArr45 = {1637278774};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b((char) (42049 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 1726 - (ViewConfiguration.getLongPressTimeout() >> 16), 29 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArrB$7879113 = onScroll.b$7879113(iIntValue2, 0, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).newInstance(objArr45), -466256576, false, true);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                char cMyPid = (char) ((Process.myPid() >> 22) + 29944);
                int longPressTimeout = 1755 - (ViewConfiguration.getLongPressTimeout() >> 16);
                int trimmedLength2 = 23 - TextUtils.getTrimmedLength("");
                Object[] objArr46 = new Object[1];
                c((byte) 52, (short) 210, $$a[10], objArr46);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(cMyPid, longPressTimeout, trimmedLength2, 1599039318, false, (String) objArr46[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).set(null, objArrB$7879113);
            try {
                long jLongValue7 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf5 = Long.valueOf(jLongValue7);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                    char cIndexOf3 = (char) (29944 - TextUtils.indexOf("", "", 0));
                    int iArgb = 1755 - Color.argb(0, 0, 0, 0);
                    int iKeyCodeFromString2 = KeyEvent.keyCodeFromString("") + 23;
                    Object[] objArr47 = new Object[1];
                    c((byte) 52, (short) 121, $$a[10], objArr47);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(cIndexOf3, iArgb, iKeyCodeFromString2, 1596667560, false, (String) objArr47[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).set(null, lValueOf5);
                Long lValueOf6 = Long.valueOf(jLongValue7 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
                    char cIndexOf4 = (char) (29943 - TextUtils.indexOf((CharSequence) "", '0'));
                    int iRed = 1755 - Color.red(0);
                    int keyRepeatDelay2 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 23;
                    byte[] bArr10 = $$a;
                    Object[] objArr48 = new Object[1];
                    c((byte) (bArr10[208] - 1), (short) 158, bArr10[10], objArr48);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(cIndexOf4, iRed, keyRepeatDelay2, 986134021, false, (String) objArr48[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).set(null, lValueOf6);
                objArr3 = objArrB$7879113;
            } catch (Exception unused3) {
                throw new RuntimeException();
            }
        }
        int i76 = ((int[]) objArr3[1])[0];
        int i77 = ((int[]) objArr3[0])[0];
        if (i77 == i76) {
            int i78 = b + 21;
            TuitionPaymentFragmentbindingInflater1 = i78 % 128;
            int i79 = i78 % 2;
            int i80 = ((int[]) objArr3[3])[0];
            Object[] objArr49 = {new int[]{((int[]) objArr3[0])[0]}, new int[]{((int[]) objArr3[1])[0]}, (Object[]) objArr3[2], new int[1], (String[]) objArr3[4]};
            int i81 = ~((int) Runtime.getRuntime().maxMemory());
            int i82 = i80 + (-1510570661) + (((-136842242) | i81) * 494) + (((~(i81 | 54657526)) | (-170397110)) * 494);
            int i83 = (i82 << 13) ^ i82;
            int i84 = i83 ^ (i83 >>> 17);
            ((int[]) objArr49[3])[0] = i84 ^ (i84 << 5);
        } else {
            ArrayList arrayList6 = new ArrayList();
            String[] strArr9 = (String[]) objArr3[4];
            if (strArr9 != null) {
                for (String str8 : strArr9) {
                    arrayList6.add(str8);
                }
            }
            Toast.makeText((Context) null, i77 / (((i77 - 1) * i77) % 2), 0).show();
            int i85 = ((int[]) objArr3[3])[0];
            Object[] objArr50 = {new int[]{((int[]) objArr3[0])[0]}, new int[]{((int[]) objArr3[1])[0]}, (Object[]) objArr3[2], new int[1], (String[]) objArr3[4]};
            int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
            int i86 = i85 + 2034781880 + (((-136315270) | startUptimeMillis2) * (-381)) + (((~((~startUptimeMillis2) | (-460587918))) | 861147722) * 381) + 396509937;
            int i87 = (i86 << 13) ^ i86;
            int i88 = i87 ^ (i87 >>> 17);
            ((int[]) objArr50[3])[0] = i88 ^ (i88 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
            char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 43042);
            int keyRepeatDelay3 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 3111;
            int i89 = 23 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            Object[] objArr51 = new Object[1];
            c((byte) 52, (short) 69, $$a[10], objArr51);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(maximumDrawingCacheSize, keyRepeatDelay3, i89, -1272852037, false, (String) objArr51[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
                char cResolveSize = (char) (View.resolveSize(0, 0) + 43042);
                int pressedStateDuration = 3111 - (ViewConfiguration.getPressedStateDuration() >> 16);
                int iBlue = 22 - Color.blue(0);
                byte[] bArr11 = $$a;
                Object[] objArr52 = new Object[1];
                c((byte) (bArr11[208] - 1), (short) 158, bArr11[10], objArr52);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(cResolveSize, pressedStateDuration, iBlue, 154975793, false, (String) objArr52[0], null);
            }
            Object[] objArr53 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).get(null);
            int i90 = ((int[]) objArr53[2])[0];
            int i91 = ((int[]) objArr53[1])[0];
            String[] strArr10 = (String[]) objArr53[3];
            int[] iArr = {i91};
            int iMyPid2 = Process.myPid();
            int i92 = (-1355061470) + ((1482639360 | iMyPid2) * 614);
            int i93 = ~iMyPid2;
            int i94 = i92 + (((~((-514260882) | i93)) | 403064832 | (~(1190770577 | i93))) * (-1228)) + (((~(i93 | 1593835409)) | (~((-111196050) | i93))) * 614) + 394503965;
            int i95 = (i94 << 13) ^ i94;
            int i96 = i95 ^ (i95 >>> 17);
            ((int[]) objArr4[0])[0] = i96 ^ (i96 << 5);
            objArr4 = new Object[]{new int[1], iArr, new int[]{i90}, strArr10};
        } else {
            Object[] objArr54 = {null, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), 0, 394503965};
            byte[] bArr12 = $$d;
            Object[] objArr55 = new Object[1];
            d((byte) 47, (short) 76, bArr12[59], objArr55);
            Class<?> cls2 = Class.forName((String) objArr55[0]);
            byte b6 = bArr12[5];
            Object[] objArr56 = new Object[1];
            d(b6, (short) (b6 | 123), (byte) (-bArr12[4]), objArr56);
            Object[] objArr57 = (Object[]) cls2.getMethod((String) objArr56[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr54);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                char c2 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 43042);
                int iKeyCodeFromString3 = 3111 - KeyEvent.keyCodeFromString("");
                int iKeyCodeFromString4 = 22 - KeyEvent.keyCodeFromString("");
                byte[] bArr13 = $$a;
                Object[] objArr58 = new Object[1];
                c((byte) (bArr13[208] - 1), (short) 158, bArr13[10], objArr58);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(c2, iKeyCodeFromString3, iKeyCodeFromString4, 154975793, false, (String) objArr58[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).set(null, objArr57);
            try {
                long jLongValue8 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf7 = Long.valueOf(jLongValue8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                    char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 43042);
                    int i97 = 3111 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 22;
                    Object[] objArr59 = new Object[1];
                    c((byte) 52, (short) 210, $$a[10], objArr59);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(deadChar, i97, iNormalizeMetaState, -1269618118, false, (String) objArr59[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).set(null, lValueOf7);
                Long lValueOf8 = Long.valueOf(jLongValue8 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                    char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 43042);
                    int i98 = 3110 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 22;
                    Object[] objArr60 = new Object[1];
                    c((byte) 52, (short) 69, $$a[10], objArr60);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(cKeyCodeFromString, i98, pressedStateDuration2, -1272852037, false, (String) objArr60[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).set(null, lValueOf8);
                objArr4 = objArr57;
            } catch (Exception unused4) {
                throw new RuntimeException();
            }
        }
        int i99 = ((int[]) objArr4[1])[0];
        int i100 = ((int[]) objArr4[2])[0];
        if (i100 == i99) {
            int i101 = ((int[]) objArr4[0])[0];
            int i102 = ((int[]) objArr4[2])[0];
            int i103 = ((int[]) objArr4[1])[0];
            String[] strArr11 = (String[]) objArr4[3];
            int[] iArr2 = {i103};
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i104 = ~iMaxMemory;
            int i105 = i101 + 1206478406 + (((~((-1026486419) | i104)) | (~((-678545041) | iMaxMemory))) * (-370)) + (((~(iMaxMemory | (-1026486419))) | (~(i104 | (-678545041))) | (-1031796371)) * (-370)) + 487432074;
            int i106 = (i105 << 13) ^ i105;
            int i107 = i106 ^ (i106 >>> 17);
            ((int[]) objArr[0])[0] = i107 ^ (i107 << 5);
            Object[] objArr61 = {new int[1], iArr2, new int[]{i102}, strArr11};
        } else {
            ArrayList arrayList7 = new ArrayList();
            String[] strArr12 = (String[]) objArr4[3];
            if (strArr12 != null) {
                int i108 = TuitionPaymentFragmentbindingInflater1 + 49;
                b = i108 % 128;
                int i109 = i108 % 2;
                for (String str9 : strArr12) {
                    arrayList7.add(str9);
                }
            }
            int[] iArr3 = new int[i100];
            int i110 = i100 - 1;
            iArr3[i110] = 1;
            Toast.makeText((Context) null, iArr3[((i100 * i110) % 2) - 1], 1).show();
            int i111 = ((int[]) objArr4[0])[0];
            int i112 = ((int[]) objArr4[2])[0];
            int i113 = ((int[]) objArr4[1])[0];
            String[] strArr13 = (String[]) objArr4[3];
            int[] iArr4 = {i112};
            int iMyPid3 = Process.myPid();
            int i114 = ~iMyPid3;
            int i115 = i111 + (-273001861) + (((~((-958668148) | i114)) | (~(iMyPid3 | 746363311))) * 333) + (((~(iMyPid3 | (-958668148))) | (~(i114 | 746363311))) * 333);
            int i116 = (i115 << 13) ^ i115;
            int i117 = i116 ^ (i116 >>> 17);
            ((int[]) objArr[0])[0] = i117 ^ (i117 << 5);
            Object[] objArr62 = {new int[1], new int[]{i113}, iArr4, strArr13};
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
            char cIndexOf5 = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
            int i118 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1031;
            int iResolveOpacity2 = 15 - Drawable.resolveOpacity(0, 0);
            Object[] objArr63 = new Object[1];
            c((byte) 52, (short) 69, $$a[10], objArr63);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(cIndexOf5, i118, iResolveOpacity2, 1357589585, false, (String) objArr63[0], null);
        }
        long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).getLong(null);
        long jLongValue9 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
            char c3 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1031;
            int maximumFlingVelocity = 15 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            Object[] objArr64 = new Object[1];
            c((byte) 52, (short) 210, $$a[10], objArr64);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(c3, minimumFlingVelocity, maximumFlingVelocity, 1344079056, false, (String) objArr64[0], null);
        }
        if (j5 == ((jLongValue9 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
                char cGreen2 = (char) Color.green(0);
                int bitsPerPixel2 = 1030 - ImageFormat.getBitsPerPixel(0);
                int i119 = 16 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                byte[] bArr14 = $$a;
                byte b7 = bArr14[7];
                Object[] objArr65 = new Object[1];
                c(b7, (short) (b7 | 210), (byte) (bArr14[19] - 1), objArr65);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(cGreen2, bitsPerPixel2, i119, 632103528, false, (String) objArr65[0], null);
            }
            Object[] objArr66 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).get(null);
            objArr5 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i120 = ((int[]) objArr66[3])[0];
            int i121 = ((int[]) objArr66[1])[0];
            String[] strArr14 = (String[]) objArr66[0];
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i122 = ((~(iIdentityHashCode3 | (-506480397))) * TypedValues.CycleType.TYPE_EASING) + 463298737 + (((~((~iIdentityHashCode3) | (-506480397))) | 546287730) * TypedValues.CycleType.TYPE_EASING) + 1624309679;
            int i123 = (i122 << 13) ^ i122;
            int i124 = i123 ^ (i123 >>> 17);
            ((int[]) objArr5[2])[0] = i124 ^ (i124 << 5);
        } else {
            int iIntValue3 = ((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue();
            Object[] objArr67 = {1637278774};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b((char) (46038 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 1182 - AndroidCharacter.getMirror('0'), (ViewConfiguration.getEdgeSlop() >> 16) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr68 = {Integer.valueOf(iIntValue3), 0, 1624309679, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).newInstance(objArr67), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                char cAlpha = (char) Color.alpha(0);
                int iIndexOf3 = 1031 - TextUtils.indexOf("", "", 0);
                int i125 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 15;
                Object[] objArr69 = new Object[1];
                c((byte) 52, (short) 69, $$a[10], objArr69);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(cAlpha, iIndexOf3, i125, 1298546779, false, (String) objArr69[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45992 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), TextUtils.getCapsMode("", 0, 0) + 1117, 17 - ((Process.getThreadPriority(0) + 20) >> 6)), Boolean.TYPE});
            }
            Object[] objArr70 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).invoke(null, objArr68);
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                int modifierMetaStateMask2 = ((byte) KeyEvent.getModifierMetaStateMask()) + 1032;
                int maxKeyCode2 = 15 - (KeyEvent.getMaxKeyCode() >> 16);
                byte[] bArr15 = $$a;
                byte b8 = bArr15[7];
                Object[] objArr71 = new Object[1];
                c(b8, (short) (b8 | 210), (byte) (bArr15[19] - 1), objArr71);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(maxKeyCode, modifierMetaStateMask2, maxKeyCode2, 632103528, false, (String) objArr71[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).set(null, objArr70);
            try {
                long jLongValue10 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf9 = Long.valueOf(jLongValue10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                    char cArgb = (char) Color.argb(0, 0, 0, 0);
                    int iAlpha2 = Color.alpha(0) + 1031;
                    int iResolveOpacity3 = Drawable.resolveOpacity(0, 0) + 15;
                    Object[] objArr72 = new Object[1];
                    c((byte) 52, (short) 210, $$a[10], objArr72);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(cArgb, iAlpha2, iResolveOpacity3, 1344079056, false, (String) objArr72[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).set(null, lValueOf9);
                Long lValueOf10 = Long.valueOf(jLongValue10 >> 12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                    char cIndexOf6 = (char) TextUtils.indexOf("", "", 0);
                    int size4 = View.MeasureSpec.getSize(0) + 1031;
                    int mode2 = 15 - View.MeasureSpec.getMode(0);
                    Object[] objArr73 = new Object[1];
                    c((byte) 52, (short) 69, $$a[10], objArr73);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(cIndexOf6, size4, mode2, 1357589585, false, (String) objArr73[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).set(null, lValueOf10);
                objArr5 = objArr70;
            } catch (Exception unused5) {
                throw new RuntimeException();
            }
        }
        int i126 = ((int[]) objArr5[1])[0];
        int i127 = ((int[]) objArr5[3])[0];
        if (i127 != i126) {
            ArrayList arrayList8 = new ArrayList();
            String[] strArr15 = (String[]) objArr5[0];
            if (strArr15 != null) {
                for (String str10 : strArr15) {
                    arrayList8.add(str10);
                }
            }
            throw new RuntimeException(String.valueOf(i127));
        }
        Object[] objArr74 = {strArr, new int[]{i}, new int[1], new int[]{i}};
        int i128 = ((int[]) objArr5[2])[0];
        int i129 = ((int[]) objArr5[3])[0];
        int i130 = ((int[]) objArr5[1])[0];
        String[] strArr16 = (String[]) objArr5[0];
        int startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
        int i131 = i128 + ((((-2028553510) + (((~((-269585427) | startElapsedRealtime2)) | (~((-25305257) | startElapsedRealtime2))) * 69)) + (((~(startElapsedRealtime2 | (-732832746))) | ((~((-977112916) | startElapsedRealtime2)) | 707527489)) * (-69))) - 447377132);
        int i132 = (i131 << 13) ^ i131;
        int i133 = i132 ^ (i132 >>> 17);
        ((int[]) objArr74[2])[0] = i133 ^ (i133 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
            char cGreen3 = (char) (Color.green(0) + 37567);
            int i134 = 626 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 14;
            byte[] bArr16 = $$a;
            byte b9 = bArr16[7];
            Object[] objArr75 = new Object[1];
            c(b9, (short) (b9 | 210), (byte) (bArr16[19] - 1), objArr75);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(cGreen3, i134, iMakeMeasureSpec, -477065106, false, (String) objArr75[0], null);
        }
        long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).getLong(null);
        long jLongValue11 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
            char jumpTapTimeout3 = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 37567);
            int maximumFlingVelocity2 = 625 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int defaultSize = View.getDefaultSize(0, 0) + 14;
            Object[] objArr76 = new Object[1];
            c((byte) 52, (short) 69, $$a[10], objArr76);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(jumpTapTimeout3, maximumFlingVelocity2, defaultSize, -976899241, false, (String) objArr76[0], null);
        }
        if (j6 != ((jLongValue11 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).getLong(null) << 52) >>> 52)) >> 12)) {
            context2 = context;
            Context applicationContext5 = context2 != null ? ((context2 instanceof ContextWrapper) && ((ContextWrapper) context2).getBaseContext() == null) ? null : context.getApplicationContext() : context2;
            int iIntValue4 = ((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue();
            Object[] objArr77 = new Object[1];
            a(new char[]{19006, 18956, 11075, 9932, 16589, 23423, 16845, 32247, 28339, 26642, 5079, 2370, 9559, 22047, 52111, 61737, 60579, 40900, 33376, 47249, 38057, 51192, 47759, 24617, 23619, 3910, 29414, 10358, 1963, 28846, 10603, 8077, 53141, 47269, 57749, 51069, 63303, 57352, 39403, 36565, 48871, 10656, 20553, 30421, 26312, 4364, 2205, 15972, 11872, 22788, 49394, 58833, 53695, 33465, 63297, 44525, 39298, 51721, 44963, 38198, 16695, 12897, 26621, 23710, 2180, 31719, 7763, 1254}, KeyEvent.getMaxKeyCode() >> 16, objArr77);
            String str11 = (String) objArr77[0];
            Object[] objArr78 = new Object[1];
            a(new char[]{48077, 48046, 18138, 19281, 50546, 57026, 34413, 35925, 893, 45029, 38508, 52916, 54520, 15238, 20070, 13961, 7504, 61962, 2008, 32615, 25951, 43619, 16176, 42888, 44464, 25311, 63240, 61397, 63071, 7476, 44244, 55410, 15974, 54625, 25639, 139, 1716, 36242, 7251, 18730, 20241, 17517, 54703, 45425, 38767, 31941, 36208, 63901, 57282, 13516, 17741, 8736, Typography.mdash, 61299, 29439, 27202, 26663, 42908, 10781, 21137, 45214, 24486, 57924, 39743, 63860, 5672, 39912, 49941}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr78);
            Object[] objArr79 = {applicationContext5, new String[]{str11, (String) objArr78[0]}, Integer.valueOf(iIntValue4), 17, -1201748201};
            byte b10 = (byte) 34;
            byte[] bArr17 = $$d;
            Object[] objArr80 = new Object[1];
            d(b10, (short) (b10 | 89), bArr17[59], objArr80);
            Class<?> cls3 = Class.forName((String) objArr80[0]);
            byte b11 = bArr17[5];
            Object[] objArr81 = new Object[1];
            d(b11, (short) (b11 | 123), (byte) (-bArr17[4]), objArr81);
            objArr6 = (Object[]) cls3.getMethod((String) objArr81[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr79);
            int i135 = ((int[]) objArr6[0])[0];
            int i136 = ((int[]) objArr6[2])[0];
            if (applicationContext5 != null) {
                int i137 = TuitionPaymentFragmentbindingInflater1 + 83;
                b = i137 % 128;
                try {
                    if (i137 % 2 != 0) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                            char cRed = (char) (37567 - Color.red(0));
                            int iAxisFromString = 624 - MotionEvent.axisFromString("");
                            int doubleTapTimeout2 = 14 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            Object[] objArr82 = new Object[1];
                            c((byte) 52, (short) 210, $$a[10], objArr82);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(cRed, iAxisFromString, doubleTapTimeout2, -973632554, false, (String) objArr82[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).set(null, objArr6);
                        long jLongValue12 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[1]).invoke(null, new Object[0])).longValue();
                        Long lValueOf11 = Long.valueOf(jLongValue12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
                            char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 37567);
                            int fadingEdgeLength = 625 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 14;
                            Object[] objArr83 = new Object[1];
                            c((byte) 52, (short) 69, $$a[10], objArr83);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(tapTimeout, fadingEdgeLength, iCombineMeasuredStates, -976899241, false, (String) objArr83[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).set(null, lValueOf11);
                        Long lValueOf12 = Long.valueOf(jLongValue12 << 61);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
                            char mirror = (char) (AndroidCharacter.getMirror('0') + 37519);
                            int tapTimeout2 = 625 - (ViewConfiguration.getTapTimeout() >> 16);
                            int iCombineMeasuredStates2 = 14 - View.combineMeasuredStates(0, 0);
                            byte[] bArr18 = $$a;
                            byte b12 = bArr18[7];
                            Object[] objArr84 = new Object[1];
                            c(b12, (short) (b12 | 210), (byte) (bArr18[19] - 1), objArr84);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(mirror, tapTimeout2, iCombineMeasuredStates2, -477065106, false, (String) objArr84[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).set(null, lValueOf12);
                    } else {
                        str2 = "";
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                            char packedPositionType = (char) (37567 - ExpandableListView.getPackedPositionType(0L));
                            int maximumFlingVelocity3 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 625;
                            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 14;
                            Object[] objArr85 = new Object[1];
                            c((byte) 52, (short) 210, $$a[10], objArr85);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(packedPositionType, maximumFlingVelocity3, absoluteGravity, -973632554, false, (String) objArr85[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).set(null, objArr6);
                        long jLongValue13 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf13 = Long.valueOf(jLongValue13);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault71 == null) {
                            char cResolveSize2 = (char) (37567 - View.resolveSize(0, 0));
                            int modifierMetaStateMask3 = 624 - ((byte) KeyEvent.getModifierMetaStateMask());
                            int iMyTid = (Process.myTid() >> 22) + 14;
                            Object[] objArr86 = new Object[1];
                            c((byte) 52, (short) 69, $$a[10], objArr86);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.b(cResolveSize2, modifierMetaStateMask3, iMyTid, -976899241, false, (String) objArr86[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault71).set(null, lValueOf13);
                        Long lValueOf14 = Long.valueOf(jLongValue13 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault72 == null) {
                            char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 37567);
                            int iGreen = Color.green(0) + 625;
                            int iRgb = Color.rgb(0, 0, 0) + 16777230;
                            byte[] bArr19 = $$a;
                            byte b13 = bArr19[7];
                            Object[] objArr87 = new Object[1];
                            c(b13, (short) (b13 | 210), (byte) (bArr19[19] - 1), objArr87);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.b(cResolveSizeAndState, iGreen, iRgb, -477065106, false, (String) objArr87[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault72).set(null, lValueOf14);
                    }
                } catch (Exception unused6) {
                    throw new RuntimeException();
                }
            }
            i3 = ((int[]) objArr6[0])[0];
            i4 = ((int[]) objArr6[2])[0];
            if (i4 == i3) {
                int i138 = ((int[]) objArr6[1])[0];
                int i139 = ((int[]) objArr6[2])[0];
                int i140 = ((int[]) objArr6[0])[0];
                String[] strArr17 = (String[]) objArr6[3];
                int iIdentityHashCode4 = System.identityHashCode(this);
                int i141 = i138 + 1932114272 + (((~((-289411595) | iIdentityHashCode4)) | (~((~iIdentityHashCode4) | 1534326526))) * (-318)) + (((~(324179546 | iIdentityHashCode4)) | 1210146980) * (-318)) + (((~(iIdentityHashCode4 | (-324179547))) | (-1499558575)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
                int i142 = (i141 << 13) ^ i141;
                int i143 = i142 ^ (i142 >>> 17);
                ((int[]) objArr[1])[0] = i143 ^ (i143 << 5);
                Object[] objArr88 = {new int[]{i140}, new int[1], new int[]{i139}, strArr17};
                i5 = 0;
            } else {
                arrayList = new ArrayList();
                strArr = (String[]) objArr6[3];
                if (strArr != null) {
                    for (String str12 : strArr) {
                        arrayList.add(str12);
                    }
                }
                Toast.makeText((Context) null, i4 / (((i4 - 1) * i4) % 2), 0).show();
                int i144 = ((int[]) objArr6[1])[0];
                int i145 = ((int[]) objArr6[2])[0];
                int i146 = ((int[]) objArr6[0])[0];
                String[] strArr18 = (String[]) objArr6[3];
                int[] iArr5 = {i145};
                int i147 = (int) Runtime.getRuntime().totalMemory();
                int i148 = ~i147;
                int i149 = (~((-625417951) | i148)) | 88345098;
                int i150 = ~(i147 | 1735393022);
                int i151 = i144 + (-1071662940) + ((i149 | i150) * (-502)) + ((i150 | (~(i148 | (-537072853)))) * TypedValues.PositionType.TYPE_DRAWPATH);
                int i152 = i151 ^ (i151 << 13);
                int i153 = i152 ^ (i152 >>> 17);
                i5 = 0;
                ((int[]) objArr[1])[0] = i153 ^ (i153 << 5);
                Object[] objArr89 = {new int[]{i146}, new int[1], iArr5, strArr18};
            }
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char maximumFlingVelocity4 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int iAlpha3 = 876 - Color.alpha(i5);
                int i154 = (TypedValue.complexToFloat(i5) > 0.0f ? 1 : (TypedValue.complexToFloat(i5) == 0.0f ? 0 : -1)) + 10;
                byte[] bArr20 = $$a;
                Object[] objArr90 = new Object[1];
                c((byte) (bArr20[208] - 1), (short) 158, bArr20[10], objArr90);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumFlingVelocity4, iAlpha3, i154, -1650998592, false, (String) objArr90[0], null);
            }
            j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            jLongValue = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cResolveSize3 = (char) View.resolveSize(0, 0);
                int fadingEdgeLength2 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 876;
                int edgeSlop = 10 - (ViewConfiguration.getEdgeSlop() >> 16);
                Object[] objArr91 = new Object[1];
                c((byte) 52, (short) 210, $$a[10], objArr91);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSize3, fadingEdgeLength2, edgeSlop, 2012020043, false, (String) objArr91[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                    char c4 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    int maxKeyCode3 = 876 - (KeyEvent.getMaxKeyCode() >> 16);
                    int i155 = 10 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    Object[] objArr92 = new Object[1];
                    c((byte) 52, (short) 69, $$a[10], objArr92);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(c4, maxKeyCode3, i155, 2012931276, false, (String) objArr92[0], null);
                }
                Object[] objArr93 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).get(null);
                objArr8 = new Object[]{new int[]{((int[]) objArr93[0])[0]}, new int[1], new int[]{((int[]) objArr93[2])[0]}, (String[]) objArr93[3]};
                int iIdentityHashCode5 = System.identityHashCode(this);
                int i156 = ~iIdentityHashCode5;
                int i157 = (-217857860) + (((~((-409163928) | i156)) | 406996996) * (-108)) + (((~(i156 | 449474156)) | (~((-449474157) | iIdentityHashCode5)) | (-451641088)) * 54) + ((iIdentityHashCode5 | (-451641088)) * 54) + 1901927626;
                int i158 = (i157 << 13) ^ i157;
                int i159 = i158 ^ (i158 >>> 17);
                ((int[]) objArr8[1])[0] = i159 ^ (i159 << 5);
                str = str2;
            } else {
                if (context2 != null) {
                    applicationContext2 = context2;
                } else if ((context2 instanceof ContextWrapper) || ((ContextWrapper) context2).getBaseContext() != null) {
                    applicationContext2 = context.getApplicationContext();
                } else {
                    applicationContext2 = null;
                }
                Object[] objArr94 = {applicationContext2, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), 0, 1901927626};
                byte[] bArr21 = $$d;
                Object[] objArr95 = new Object[1];
                d(bArr21[213], (short) 157, bArr21[59], objArr95);
                Class<?> cls4 = Class.forName((String) objArr95[0]);
                byte b14 = bArr21[5];
                Object[] objArr96 = new Object[1];
                d(b14, (short) (b14 | 123), (byte) (-bArr21[4]), objArr96);
                objArr7 = (Object[]) cls4.getMethod((String) objArr96[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr94);
                if (applicationContext2 != null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int iResolveSize = View.resolveSize(0, 0) + 876;
                        int iRed2 = Color.red(0) + 10;
                        Object[] objArr97 = new Object[1];
                        c((byte) 52, (short) 69, $$a[10], objArr97);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(keyRepeatTimeout, iResolveSize, iRed2, 2012931276, false, (String) objArr97[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArr7);
                    try {
                        long jLongValue14 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf15 = Long.valueOf(jLongValue14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                        str = str2;
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cLastIndexOf3 = (char) (TextUtils.lastIndexOf(str, '0', 0) + 1);
                            int mode3 = 876 - View.MeasureSpec.getMode(0);
                            int iIndexOf4 = TextUtils.indexOf((CharSequence) str, '0') + 11;
                            Object[] objArr98 = new Object[1];
                            c((byte) 52, (short) 210, $$a[10], objArr98);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf3, mode3, iIndexOf4, 2012020043, false, (String) objArr98[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf15);
                        Long lValueOf16 = Long.valueOf(jLongValue14 >> 12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                            int jumpTapTimeout4 = 876 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                            int edgeSlop2 = 10 - (ViewConfiguration.getEdgeSlop() >> 16);
                            byte[] bArr22 = $$a;
                            Object[] objArr99 = new Object[1];
                            c((byte) (bArr22[208] - 1), (short) 158, bArr22[10], objArr99);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cCombineMeasuredStates, jumpTapTimeout4, edgeSlop2, -1650998592, false, (String) objArr99[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf16);
                    } catch (Exception unused7) {
                        throw new RuntimeException();
                    }
                } else {
                    str = str2;
                    objArr7 = objArr7;
                }
                objArr8 = objArr7;
            }
            if (((int[]) objArr8[0])[0] == ((int[]) objArr8[2])[0]) {
                throw null;
            }
            int i160 = ((int[]) objArr8[1])[0];
            Object[] objArr100 = {new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int iIdentityHashCode6 = System.identityHashCode(this);
            int i161 = i160 + (-643226233) + (((~((~iIdentityHashCode6) | (-248017232))) | (-207707003)) * (-235)) + (((~((-248017232) | iIdentityHashCode6)) | (-207707003)) * (-470)) + (((~(iIdentityHashCode6 | (-205541707))) | (-250182528)) * 235);
            int i162 = (i161 << 13) ^ i161;
            int i163 = i162 ^ (i162 >>> 17);
            ((int[]) objArr100[1])[0] = i163 ^ (i163 << 5);
            int i164 = b + 25;
            TuitionPaymentFragmentbindingInflater1 = i164 % 128;
            int i165 = i164 % 2;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char defaultSize2 = (char) View.getDefaultSize(0, 0);
                int edgeSlop3 = (ViewConfiguration.getEdgeSlop() >> 16) + 876;
                int iGreen2 = Color.green(0) + 10;
                byte[] bArr23 = $$a;
                Object[] objArr101 = new Object[1];
                c((byte) (-bArr23[9]), bArr23[0], bArr23[19], objArr101);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(defaultSize2, edgeSlop3, iGreen2, -1199417970, false, (String) objArr101[0], null);
            }
            j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).getLong(null);
            jLongValue2 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char bitsPerPixel3 = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                int windowTouchSlop2 = 876 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0) + 10;
                byte[] bArr24 = $$a;
                Object[] objArr102 = new Object[1];
                c(bArr24[7], bArr24[77], (byte) (-bArr24[14]), objArr102);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(bitsPerPixel3, windowTouchSlop2, iMakeMeasureSpec2, 254769921, false, (String) objArr102[0], null);
            }
            if (j2 == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null) << 52) >>> 52)) >> 12)) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                    char cMyTid = (char) (Process.myTid() >> 22);
                    int deadChar2 = KeyEvent.getDeadChar(0, 0) + 876;
                    int i166 = 10 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte[] bArr25 = $$a;
                    byte b15 = bArr25[77];
                    Object[] objArr103 = new Object[1];
                    c(b15, b15, bArr25[19], objArr103);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(cMyTid, deadChar2, i166, 1324201839, false, (String) objArr103[0], null);
                }
                Object[] objArr104 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).get(null);
                objArr9 = new Object[]{new int[]{((int[]) objArr104[0])[0]}, new int[1], new int[]{((int[]) objArr104[2])[0]}, (String[]) objArr104[3]};
                int startUptimeMillis3 = (int) Process.getStartUptimeMillis();
                int i167 = ~startUptimeMillis3;
                int i168 = ((((((~(44676811 | i167)) | (~((-84987041) | startUptimeMillis3))) | (~(i167 | 84987040))) * 959) + 174647731) + (((~(startUptimeMillis3 | 84987040)) | ((~(i167 | (-84987041))) | (~(44676811 | startUptimeMillis3)))) * 959)) - 1285991749;
                int i169 = (i168 << 13) ^ i168;
                int i170 = i169 ^ (i169 >>> 17);
                ((int[]) objArr9[1])[0] = i170 ^ (i170 << 5);
            } else {
                Object[] objArr105 = {Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), -1285991749};
                short s = (short) ($$e | 76);
                byte[] bArr26 = $$d;
                Object[] objArr106 = new Object[1];
                d((byte) 75, s, bArr26[322], objArr106);
                Class<?> cls5 = Class.forName((String) objArr106[0]);
                Object[] objArr107 = new Object[1];
                d((byte) 37, (short) (-bArr26[73]), bArr26[5], objArr107);
                objArr9 = (Object[]) cls5.getMethod((String) objArr107[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr105);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                    char cIndexOf7 = (char) TextUtils.indexOf(str, str, 0, 0);
                    int i171 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 875;
                    int jumpTapTimeout5 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 10;
                    byte[] bArr27 = $$a;
                    byte b16 = bArr27[77];
                    Object[] objArr108 = new Object[1];
                    c(b16, b16, bArr27[19], objArr108);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cIndexOf7, i171, jumpTapTimeout5, 1324201839, false, (String) objArr108[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, objArr9);
                try {
                    long jLongValue15 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf17 = Long.valueOf(jLongValue15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                        char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                        int mode4 = View.MeasureSpec.getMode(0) + 876;
                        int trimmedLength3 = TextUtils.getTrimmedLength(str) + 10;
                        byte[] bArr28 = $$a;
                        Object[] objArr109 = new Object[1];
                        c(bArr28[7], bArr28[77], (byte) (-bArr28[14]), objArr109);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cNormalizeMetaState, mode4, trimmedLength3, 254769921, false, (String) objArr109[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).set(null, lValueOf17);
                    Long lValueOf18 = Long.valueOf(jLongValue15 >> 12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                        char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                        int i172 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 877;
                        int fadingEdgeLength3 = 10 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        byte[] bArr29 = $$a;
                        Object[] objArr110 = new Object[1];
                        c((byte) (-bArr29[9]), bArr29[0], bArr29[19], objArr110);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(touchSlop, i172, fadingEdgeLength3, -1199417970, false, (String) objArr110[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, lValueOf18);
                } catch (Exception unused8) {
                    throw new RuntimeException();
                }
            }
            i7 = ((int[]) objArr9[2])[0];
            i8 = ((int[]) objArr9[0])[0];
            if (i8 == i7) {
                arrayList2 = new ArrayList();
                strArr2 = (String[]) objArr9[3];
                if (strArr2 != null) {
                    for (String str13 : strArr2) {
                        arrayList2.add(str13);
                    }
                }
                throw new RuntimeException(String.valueOf(i8));
            }
            int i173 = ((int[]) objArr9[1])[0];
            Object[] objArr111 = {new int[]{((int[]) objArr9[0])[0]}, new int[1], new int[]{((int[]) objArr9[2])[0]}, (String[]) objArr9[3]};
            int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
            int i174 = (-1047908414) + (((~((~elapsedCpuTime2) | 227492442)) | (-268393088)) * (-245));
            int i175 = ~(elapsedCpuTime2 | 227492442);
            int i176 = i173 + i174 + (i175 * (-245)) + ((i175 | 267802671) * 245);
            int i177 = (i176 << 13) ^ i176;
            int i178 = i177 ^ (i177 >>> 17);
            ((int[]) objArr111[1])[0] = i178 ^ (i178 << 5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char cIndexOf8 = (char) (TextUtils.indexOf((CharSequence) str, '0', 0, 0) + 1);
                int bitsPerPixel4 = ImageFormat.getBitsPerPixel(0) + 877;
                int size5 = 10 - View.MeasureSpec.getSize(0);
                byte[] bArr30 = $$a;
                byte b17 = bArr30[7];
                Object[] objArr112 = new Object[1];
                c(b17, (short) (b17 | 210), (byte) (bArr30[19] - 1), objArr112);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cIndexOf8, bitsPerPixel4, size5, 252381699, false, (String) objArr112[0], null);
            }
            j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).getLong(null);
            jLongValue3 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char packedPositionType2 = (char) ExpandableListView.getPackedPositionType(0L);
                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 877;
                int absoluteGravity2 = 10 - Gravity.getAbsoluteGravity(0, 0);
                Object[] objArr113 = new Object[1];
                c((byte) 52, (short) 121, $$a[10], objArr113);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(packedPositionType2, packedPositionChild, absoluteGravity2, 2009631821, false, (String) objArr113[0], null);
            }
            if (j3 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).getLong(null) << 52) >>> 52)) >> 12)) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                    char scrollBarSize2 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                    int scrollDefaultDelay2 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 876;
                    int iIndexOf5 = 9 - TextUtils.indexOf((CharSequence) str, '0', 0, 0);
                    byte b18 = $$a[7];
                    short s2 = b18;
                    Object[] objArr114 = new Object[1];
                    c(b18, s2, (byte) s2, objArr114);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(scrollBarSize2, scrollDefaultDelay2, iIndexOf5, 256017550, false, (String) objArr114[0], null);
                }
                Object[] objArr115 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).get(null);
                objArr11 = new Object[]{new int[]{((int[]) objArr115[0])[0]}, new int[1], new int[]{((int[]) objArr115[2])[0]}, (String[]) objArr115[3]};
                int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                int i179 = 1153572500 + (((~((-650962554) | iElapsedRealtime2)) | 42477145 | (~(610652324 | iElapsedRealtime2))) * (-880));
                int i180 = (~((-650962554) | (~iElapsedRealtime2))) | (-610652325);
                int i181 = ~(iElapsedRealtime2 | 650962553);
                int i182 = ((i179 + ((i180 | i181) * (-880))) + (i181 * 880)) - 1559132946;
                int i183 = (i182 << 13) ^ i182;
                int i184 = i183 ^ (i183 >>> 17);
                ((int[]) objArr11[1])[0] = i184 ^ (i184 << 5);
                applicationContext3 = context;
            } else {
                applicationContext3 = context;
                if (applicationContext3 != null) {
                    applicationContext4 = applicationContext3;
                } else if ((!(applicationContext3 instanceof ContextWrapper)) && ((ContextWrapper) applicationContext3).getBaseContext() == null) {
                    applicationContext4 = null;
                } else {
                    applicationContext4 = context.getApplicationContext();
                }
                Object[] objArr116 = {applicationContext4, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), -1559132946};
                byte[] bArr31 = $$d;
                Object[] objArr117 = new Object[1];
                d((byte) (bArr31[213] - 1), (short) 281, bArr31[59], objArr117);
                Class<?> cls6 = Class.forName((String) objArr117[0]);
                byte b19 = bArr31[5];
                Object[] objArr118 = new Object[1];
                d(b19, (short) (b19 | 123), (byte) (-bArr31[4]), objArr118);
                objArr10 = (Object[]) cls6.getMethod((String) objArr118[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr116);
                if (applicationContext4 != null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                        char cIndexOf9 = (char) ((-1) - TextUtils.indexOf((CharSequence) str, '0', 0, 0));
                        int iCombineMeasuredStates3 = View.combineMeasuredStates(0, 0) + 876;
                        int iIndexOf6 = 9 - TextUtils.indexOf((CharSequence) str, '0', 0, 0);
                        byte b20 = $$a[7];
                        short s3 = b20;
                        Object[] objArr119 = new Object[1];
                        c(b20, s3, (byte) s3, objArr119);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cIndexOf9, iCombineMeasuredStates3, iIndexOf6, 256017550, false, (String) objArr119[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArr10);
                    try {
                        long jLongValue16 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf19 = Long.valueOf(jLongValue16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                            char c5 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0) + 876;
                            int deadChar3 = 10 - KeyEvent.getDeadChar(0, 0);
                            Object[] objArr120 = new Object[1];
                            c((byte) 52, (short) 121, $$a[10], objArr120);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c5, iMakeMeasureSpec3, deadChar3, 2009631821, false, (String) objArr120[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf19);
                        Long lValueOf20 = Long.valueOf(jLongValue16 >> 12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                            char cIndexOf10 = (char) (TextUtils.indexOf((CharSequence) str, '0', 0) + 1);
                            int mirror2 = AndroidCharacter.getMirror('0') + 828;
                            int jumpTapTimeout6 = 10 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                            byte[] bArr32 = $$a;
                            byte b21 = bArr32[7];
                            Object[] objArr121 = new Object[1];
                            c(b21, (short) (b21 | 210), (byte) (bArr32[19] - 1), objArr121);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(cIndexOf10, mirror2, jumpTapTimeout6, 252381699, false, (String) objArr121[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf20);
                    } catch (Exception unused9) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr10 = objArr10;
                }
                objArr11 = objArr10;
            }
            i10 = ((int[]) objArr11[2])[0];
            i11 = ((int[]) objArr11[0])[0];
            if (i11 == i10) {
                int i185 = ((int[]) objArr11[1])[0];
                Object[] objArr122 = {new int[]{((int[]) objArr11[0])[0]}, new int[1], new int[]{((int[]) objArr11[2])[0]}, (String[]) objArr11[3]};
                int iIdentityHashCode7 = System.identityHashCode(this);
                int i186 = ~iIdentityHashCode7;
                int i187 = i185 + ((((~(176194269 | i186)) | (~(iIdentityHashCode7 | 216504498))) * 959) - 1318692349) + (((~(iIdentityHashCode7 | 176194269)) | (~(i186 | 216504498))) * 959);
                int i188 = (i187 << 13) ^ i187;
                int i189 = i188 ^ (i188 >>> 17);
                ((int[]) objArr122[1])[0] = i189 ^ (i189 << 5);
                i12 = 0;
            } else {
                int[] iArr6 = new int[i11];
                int i190 = i11 - 1;
                iArr6[i190] = 1;
                Toast.makeText((Context) null, iArr6[((i11 * i190) % 2) - 1], 1).show();
                int i191 = ((int[]) objArr11[1])[0];
                Object[] objArr123 = {new int[]{((int[]) objArr11[0])[0]}, new int[1], new int[]{((int[]) objArr11[2])[0]}, (String[]) objArr11[3]};
                int iMyUid = Process.myUid();
                int i192 = i191 + (-340708924) + ((~((~iMyUid) | (-1649236))) * (-116)) + ((782286888 | iMyUid) * 116) + (((~(iMyUid | 741976659)) | 41959464) * 116);
                int i193 = (i192 << 13) ^ i192;
                int i194 = i193 ^ (i193 >>> 17);
                i12 = 0;
                ((int[]) objArr123[1])[0] = i194 ^ (i194 << 5);
            }
            objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                char cIndexOf11 = (char) ((-1) - TextUtils.indexOf((CharSequence) str, '0', i12));
                int size6 = 651 - View.MeasureSpec.getSize(i12);
                int longPressTimeout2 = 44 - (ViewConfiguration.getLongPressTimeout() >> 16);
                Object[] objArr124 = new Object[1];
                c((byte) 52, (short) 121, $$a[10], objArr124);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(cIndexOf11, size6, longPressTimeout2, -459846511, false, (String) objArr124[0], null);
            }
            j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).getLong(null);
            jLongValue4 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
            objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                char packedPositionType3 = (char) ExpandableListView.getPackedPositionType(0L);
                int capsMode3 = TextUtils.getCapsMode(str, 0, 0) + 651;
                int threadPriority = 44 - ((Process.getThreadPriority(0) + 20) >> 6);
                byte[] bArr33 = $$a;
                byte b22 = bArr33[7];
                Object[] objArr125 = new Object[1];
                c(b22, (short) (b22 | 210), (byte) (bArr33[19] - 1), objArr125);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(packedPositionType3, capsMode3, threadPriority, -873460649, false, (String) objArr125[0], null);
            }
            if (j4 == ((jLongValue4 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).getLong(null) << 52) >>> 52)) >> 12)) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                    char c6 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                    int packedPositionType4 = 651 - ExpandableListView.getPackedPositionType(0L);
                    int size7 = View.MeasureSpec.getSize(0) + 44;
                    byte[] bArr34 = $$a;
                    Object[] objArr126 = new Object[1];
                    c((byte) (bArr34[208] - 1), (short) 158, bArr34[10], objArr126);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(c6, packedPositionType4, size7, -1595579076, false, (String) objArr126[0], null);
                }
                Object[] objArr127 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).get(null);
                objArr12 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i195 = ((int[]) objArr127[2])[0];
                int i196 = ((int[]) objArr127[0])[0];
                int elapsedCpuTime3 = (int) Process.getElapsedCpuTime();
                int i197 = ~elapsedCpuTime3;
                int i198 = (((222111998 + ((((~((-8954267) | i197)) | (~((-402789957) | elapsedCpuTime3))) | (~(417267678 | elapsedCpuTime3))) * 765)) + (((~((-411744223) | i197)) | 8954266) * 1530)) + (((~(elapsedCpuTime3 | (-411744223))) | (~(i197 | 417267678))) * 765)) - 2043744500;
                int i199 = (i198 << 13) ^ i198;
                int i200 = i199 ^ (i199 >>> 17);
                ((int[]) objArr12[3])[0] = i200 ^ (i200 << 5);
                i13 = 0;
            } else {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b((char) (TextUtils.lastIndexOf(str, '0', 0) + 1), 1610 - View.MeasureSpec.getMode(0), 26 - ((Process.getThreadPriority(0) + 20) >> 6), 2145681644, false, null, new Class[0]);
                }
                Object[] objArr128 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).newInstance(null), -2043744500, 0};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                    char edgeSlop4 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                    int maxKeyCode4 = (KeyEvent.getMaxKeyCode() >> 16) + 651;
                    int scrollDefaultDelay3 = 44 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    byte[] bArr35 = $$a;
                    byte b23 = bArr35[7];
                    Object[] objArr129 = new Object[1];
                    c(b23, (short) (b23 | 210), (byte) (bArr35[19] - 1), objArr129);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(edgeSlop4, maxKeyCode4, scrollDefaultDelay3, 2075921419, false, (String) objArr129[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 695, 98 - (ViewConfiguration.getEdgeSlop() >> 16)), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 63406), 793 - (KeyEvent.getMaxKeyCode() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 82), Integer.TYPE, Integer.TYPE});
                }
                objArr12 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).invoke(null, objArr128);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                    char c7 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                    int iIndexOf7 = 651 - TextUtils.indexOf(str, str);
                    int i201 = 45 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    byte[] bArr36 = $$a;
                    Object[] objArr130 = new Object[1];
                    c((byte) (bArr36[208] - 1), (short) 158, bArr36[10], objArr130);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(c7, iIndexOf7, i201, -1595579076, false, (String) objArr130[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).set(null, objArr12);
                try {
                    long jLongValue17 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf21 = Long.valueOf(jLongValue17);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                        char trimmedLength4 = (char) TextUtils.getTrimmedLength(str);
                        int i202 = 651 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int scrollBarSize3 = 44 - (ViewConfiguration.getScrollBarSize() >> 8);
                        byte[] bArr37 = $$a;
                        byte b24 = bArr37[7];
                        Object[] objArr131 = new Object[1];
                        c(b24, (short) (b24 | 210), (byte) (bArr37[19] - 1), objArr131);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(trimmedLength4, i202, scrollBarSize3, -873460649, false, (String) objArr131[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).set(null, lValueOf21);
                    Long lValueOf22 = Long.valueOf(jLongValue17 >> 12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                        char keyRepeatDelay4 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int iAxisFromString2 = MotionEvent.axisFromString(str) + 652;
                        int iIndexOf8 = TextUtils.indexOf((CharSequence) str, '0') + 45;
                        Object[] objArr132 = new Object[1];
                        c((byte) 52, (short) 121, $$a[10], objArr132);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(keyRepeatDelay4, iAxisFromString2, iIndexOf8, -459846511, false, (String) objArr132[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).set(null, lValueOf22);
                    i13 = 0;
                } catch (Exception unused10) {
                    throw new RuntimeException();
                }
            }
            if (((int[]) objArr12[2])[i13] == ((int[]) objArr12[i13])[i13]) {
                arrayList3 = new ArrayList();
                strArr3 = (String[]) objArr12[1];
                if (strArr3 != null) {
                    for (String str14 : strArr3) {
                        arrayList3.add(str14);
                    }
                }
                throw null;
            }
            Object[] objArr133 = new Object[4];
            int[] iArr7 = new int[1];
            objArr133[i13] = iArr7;
            int[] iArr8 = new int[1];
            objArr133[2] = iArr8;
            objArr133[3] = new int[1];
            int i203 = ((int[]) objArr12[3])[i13];
            int i204 = ((int[]) objArr12[2])[i13];
            int i205 = ((int[]) objArr12[i13])[i13];
            iArr8[i13] = i204;
            iArr7[i13] = i205;
            objArr133[1] = new String[i13];
            int iIdentityHashCode8 = System.identityHashCode(this);
            int i206 = (~(500794053 | iIdentityHashCode8)) | 33840154;
            int i207 = ~iIdentityHashCode8;
            int i208 = i203 + 1458590833 + ((i206 | (~((-30409345) | i207))) * 886) + (((~(i207 | (-500794054))) | 504224863) * (-1772)) + ((~(i207 | 504224863)) * 886);
            int i209 = (i208 << 13) ^ i208;
            int i210 = i209 ^ (i209 >>> 17);
            ((int[]) objArr133[3])[0] = i210 ^ (i210 << 5);
            int i211 = b + 111;
            TuitionPaymentFragmentbindingInflater1 = i211 % 128;
            int i212 = i211 % 2;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                char cKeyCodeFromString2 = (char) KeyEvent.keyCodeFromString(str);
                int iBlue2 = 2267 - Color.blue(0);
                int iLastIndexOf3 = TextUtils.lastIndexOf(str, '0', 0, 0) + 34;
                Object[] objArr134 = new Object[1];
                c((byte) 52, (short) 210, $$a[10], objArr134);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(cKeyCodeFromString2, iBlue2, iLastIndexOf3, -887667012, false, (String) objArr134[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).getLong(null) != -1) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                    char c8 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                    int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 2267;
                    int i213 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 32;
                    byte[] bArr38 = $$a;
                    Object[] objArr135 = new Object[1];
                    c((byte) (bArr38[208] - 1), (short) 158, bArr38[10], objArr135);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(c8, threadPriority2, i213, -654680577, false, (String) objArr135[0], null);
                }
                Object[] objArr136 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).get(null);
                objArr13 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                int i214 = ((int[]) objArr136[0])[0];
                int i215 = ((int[]) objArr136[3])[0];
                String[] strArr19 = (String[]) objArr136[1];
                int startUptimeMillis4 = (int) Process.getStartUptimeMillis();
                int i216 = ((1755515993 + (((~(startUptimeMillis4 | 215697910)) | 593015405) * 191)) + (((~((~startUptimeMillis4) | 215697910)) | 587248137) * 191)) - 2139478060;
                int i217 = (i216 << 13) ^ i216;
                int i218 = i217 ^ (i217 >>> 17);
                ((int[]) objArr13[2])[0] = i218 ^ (i218 << 5);
            } else {
                if (applicationContext3 != null) {
                    if ((applicationContext3 instanceof ContextWrapper) || ((ContextWrapper) applicationContext3).getBaseContext() != null) {
                        applicationContext3 = context.getApplicationContext();
                    } else {
                        applicationContext3 = null;
                    }
                }
                Object[] objArr137 = {applicationContext3, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), 0, -2139478060};
                byte[] bArr39 = $$d;
                Object[] objArr138 = new Object[1];
                d(bArr39[2], (short) 329, bArr39[59], objArr138);
                Class<?> cls7 = Class.forName((String) objArr138[0]);
                byte b25 = bArr39[21];
                Object[] objArr139 = new Object[1];
                d(b25, (short) (b25 | 322), bArr39[5], objArr139);
                objArr13 = (Object[]) cls7.getMethod((String) objArr139[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr137);
                if (applicationContext3 != null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                        char c9 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int capsMode4 = TextUtils.getCapsMode(str, 0, 0) + 2267;
                        int offsetAfter2 = TextUtils.getOffsetAfter(str, 0) + 33;
                        byte[] bArr40 = $$a;
                        Object[] objArr140 = new Object[1];
                        c((byte) (bArr40[208] - 1), (short) 158, bArr40[10], objArr140);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(c9, capsMode4, offsetAfter2, -654680577, false, (String) objArr140[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).set(null, objArr13);
                    try {
                        long jLongValue18 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf23 = Long.valueOf(jLongValue18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                            char c10 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                            int iResolveSize2 = 2267 - View.resolveSize(0, 0);
                            int i219 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 33;
                            Object[] objArr141 = new Object[1];
                            c((byte) 52, (short) 69, $$a[10], objArr141);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(c10, iResolveSize2, i219, -874156483, false, (String) objArr141[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).set(null, lValueOf23);
                        Long lValueOf24 = Long.valueOf(jLongValue18 >> 12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                            char deadChar4 = (char) KeyEvent.getDeadChar(0, 0);
                            int tapTimeout3 = (ViewConfiguration.getTapTimeout() >> 16) + 2267;
                            int longPressTimeout3 = (ViewConfiguration.getLongPressTimeout() >> 16) + 33;
                            Object[] objArr142 = new Object[1];
                            c((byte) 52, (short) 210, $$a[10], objArr142);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(deadChar4, tapTimeout3, longPressTimeout3, -887667012, false, (String) objArr142[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).set(null, lValueOf24);
                    } catch (Exception unused11) {
                        throw new RuntimeException();
                    }
                }
            }
            i15 = ((int[]) objArr13[3])[0];
            i16 = ((int[]) objArr13[0])[0];
            if (i16 == i15) {
                arrayList4 = new ArrayList();
                strArr4 = (String[]) objArr13[1];
                if (strArr4 != null) {
                    for (String str15 : strArr4) {
                        arrayList4.add(str15);
                    }
                }
                throw new RuntimeException(String.valueOf(i16));
            }
            Object[] objArr143 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i220 = ((int[]) objArr13[2])[0];
            int i221 = ((int[]) objArr13[0])[0];
            int i222 = ((int[]) objArr13[3])[0];
            String[] strArr20 = (String[]) objArr13[1];
            int iNextInt = new Random().nextInt();
            int i223 = ~iNextInt;
            int i224 = i220 + 940038215 + (((~(iNextInt | (-70318595))) | (~((-809763941) | i223)) | 1050624) * (-68)) + ((~((-69267971) | i223)) * (-68)) + (((~(70318594 | i223)) | (-879031911)) * 68);
            int i225 = (i224 << 13) ^ i224;
            int i226 = i225 ^ (i225 >>> 17);
            ((int[]) objArr143[2])[0] = i226 ^ (i226 << 5);
            intent2 = DualSurfaceProcessorNodeExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (intent2 != null) {
                i18 = TuitionPaymentFragmentbindingInflater1 + 15;
                b = i18 % 128;
                if (i18 % 2 == 0) {
                    Object obj = null;
                    DualSurfaceProcessorNodeExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2.stopService(intent2);
                    DualSurfaceProcessorNodeExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                    obj.hashCode();
                    throw null;
                }
                DualSurfaceProcessorNodeExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2.stopService(intent2);
                DualSurfaceProcessorNodeExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
            }
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault73 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault73 == null) {
            char cIndexOf12 = (char) (TextUtils.indexOf((CharSequence) "", '0') + 37568);
            int mode5 = 625 - View.MeasureSpec.getMode(0);
            int i227 = 14 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            Object[] objArr144 = new Object[1];
            c((byte) 52, (short) 210, $$a[10], objArr144);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault73 = initSession.b(cIndexOf12, mode5, i227, -973632554, false, (String) objArr144[0], null);
        }
        Object[] objArr145 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault73).get(null);
        int i228 = ((int[]) objArr145[2])[0];
        int i229 = ((int[]) objArr145[0])[0];
        String[] strArr21 = (String[]) objArr145[3];
        int[] iArr9 = {i228};
        int[] iArr10 = {i229};
        int iIdentityHashCode9 = System.identityHashCode(this);
        int i230 = ~iIdentityHashCode9;
        int i231 = ((((-1361445298) + ((~((-823560340) | i230)) * 979)) + ((iIdentityHashCode9 | 1000177781) * (-979))) + (((~(iIdentityHashCode9 | (-823560340))) | (~(i230 | 1000177781))) * 979)) - 1201748201;
        int i232 = (i231 << 13) ^ i231;
        int i233 = i232 ^ (i232 >>> 17);
        ((int[]) objArr6[1])[0] = i233 ^ (i233 << 5);
        objArr6 = new Object[]{iArr10, new int[1], iArr9, strArr21};
        context2 = context;
        str2 = "";
        i3 = ((int[]) objArr6[0])[0];
        i4 = ((int[]) objArr6[2])[0];
        if (i4 == i3) {
            int i1310 = ((int[]) objArr6[1])[0];
            int i1311 = ((int[]) objArr6[2])[0];
            int i1410 = ((int[]) objArr6[0])[0];
            String[] strArr110 = (String[]) objArr6[3];
            int iIdentityHashCode10 = System.identityHashCode(this);
            int i1411 = i1310 + 1932114272 + (((~((-289411595) | iIdentityHashCode10)) | (~((~iIdentityHashCode10) | 1534326526))) * (-318)) + (((~(324179546 | iIdentityHashCode10)) | 1210146980) * (-318)) + (((~(iIdentityHashCode10 | (-324179547))) | (-1499558575)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
            int i1412 = (i1411 << 13) ^ i1411;
            int i1413 = i1412 ^ (i1412 >>> 17);
            ((int[]) objArr88[1])[0] = i1413 ^ (i1413 << 5);
            Object[] objArr810 = {new int[]{i1410}, new int[1], new int[]{i1311}, strArr110};
            i5 = 0;
        } else {
            arrayList = new ArrayList();
            strArr = (String[]) objArr6[3];
            if (strArr != null) {
                while (i6 < strArr.length) {
                    arrayList.add(str12);
                }
            }
            Toast.makeText((Context) null, i4 / (((i4 - 1) * i4) % 2), 0).show();
            int i1414 = ((int[]) objArr6[1])[0];
            int i1415 = ((int[]) objArr6[2])[0];
            int i1416 = ((int[]) objArr6[0])[0];
            String[] strArr111 = (String[]) objArr6[3];
            int[] iArr11 = {i1415};
            int i1417 = (int) Runtime.getRuntime().totalMemory();
            int i1418 = ~i1417;
            int i1419 = (~((-625417951) | i1418)) | 88345098;
            int i1510 = ~(i1417 | 1735393022);
            int i1511 = i1414 + (-1071662940) + ((i1419 | i1510) * (-502)) + ((i1510 | (~(i1418 | (-537072853)))) * TypedValues.PositionType.TYPE_DRAWPATH);
            int i1512 = i1511 ^ (i1511 << 13);
            int i1513 = i1512 ^ (i1512 >>> 17);
            i5 = 0;
            ((int[]) objArr89[1])[0] = i1513 ^ (i1513 << 5);
            Object[] objArr811 = {new int[]{i1416}, new int[1], iArr11, strArr111};
        }
        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char maximumFlingVelocity5 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int iAlpha4 = 876 - Color.alpha(i5);
            int i1514 = (TypedValue.complexToFloat(i5) > 0.0f ? 1 : (TypedValue.complexToFloat(i5) == 0.0f ? 0 : -1)) + 10;
            byte[] bArr210 = $$a;
            Object[] objArr910 = new Object[1];
            c((byte) (bArr210[208] - 1), (short) 158, bArr210[10], objArr910);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumFlingVelocity5, iAlpha4, i1514, -1650998592, false, (String) objArr910[0], null);
        }
        j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        jLongValue = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cResolveSize4 = (char) View.resolveSize(0, 0);
            int fadingEdgeLength4 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 876;
            int edgeSlop5 = 10 - (ViewConfiguration.getEdgeSlop() >> 16);
            Object[] objArr911 = new Object[1];
            c((byte) 52, (short) 210, $$a[10], objArr911);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSize4, fadingEdgeLength4, edgeSlop5, 2012020043, false, (String) objArr911[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                char c11 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                int maxKeyCode5 = 876 - (KeyEvent.getMaxKeyCode() >> 16);
                int i1515 = 10 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                Object[] objArr912 = new Object[1];
                c((byte) 52, (short) 69, $$a[10], objArr912);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(c11, maxKeyCode5, i1515, 2012931276, false, (String) objArr912[0], null);
            }
            Object[] objArr913 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).get(null);
            objArr8 = new Object[]{new int[]{((int[]) objArr913[0])[0]}, new int[1], new int[]{((int[]) objArr913[2])[0]}, (String[]) objArr913[3]};
            int iIdentityHashCode11 = System.identityHashCode(this);
            int i1516 = ~iIdentityHashCode11;
            int i1517 = (-217857860) + (((~((-409163928) | i1516)) | 406996996) * (-108)) + (((~(i1516 | 449474156)) | (~((-449474157) | iIdentityHashCode11)) | (-451641088)) * 54) + ((iIdentityHashCode11 | (-451641088)) * 54) + 1901927626;
            int i1518 = (i1517 << 13) ^ i1517;
            int i1519 = i1518 ^ (i1518 >>> 17);
            ((int[]) objArr8[1])[0] = i1519 ^ (i1519 << 5);
            str = str2;
        } else {
            if (context2 != null) {
                applicationContext2 = context2;
            } else if (context2 instanceof ContextWrapper) {
                applicationContext2 = context.getApplicationContext();
            } else {
                applicationContext2 = context.getApplicationContext();
            }
            Object[] objArr914 = {applicationContext2, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), 0, 1901927626};
            byte[] bArr211 = $$d;
            Object[] objArr915 = new Object[1];
            d(bArr211[213], (short) 157, bArr211[59], objArr915);
            Class<?> cls8 = Class.forName((String) objArr915[0]);
            byte b110 = bArr211[5];
            Object[] objArr916 = new Object[1];
            d(b110, (short) (b110 | 123), (byte) (-bArr211[4]), objArr916);
            objArr7 = (Object[]) cls8.getMethod((String) objArr916[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr914);
            if (applicationContext2 != null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char keyRepeatTimeout2 = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int iResolveSize3 = View.resolveSize(0, 0) + 876;
                    int iRed3 = Color.red(0) + 10;
                    Object[] objArr917 = new Object[1];
                    c((byte) 52, (short) 69, $$a[10], objArr917);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(keyRepeatTimeout2, iResolveSize3, iRed3, 2012931276, false, (String) objArr917[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArr7);
                long jLongValue19 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf110 = Long.valueOf(jLongValue19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                str = str2;
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cLastIndexOf4 = (char) (TextUtils.lastIndexOf(str, '0', 0) + 1);
                    int mode6 = 876 - View.MeasureSpec.getMode(0);
                    int iIndexOf9 = TextUtils.indexOf((CharSequence) str, '0') + 11;
                    Object[] objArr918 = new Object[1];
                    c((byte) 52, (short) 210, $$a[10], objArr918);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cLastIndexOf4, mode6, iIndexOf9, 2012020043, false, (String) objArr918[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf110);
                Long lValueOf111 = Long.valueOf(jLongValue19 >> 12);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cCombineMeasuredStates2 = (char) View.combineMeasuredStates(0, 0);
                    int jumpTapTimeout7 = 876 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int edgeSlop6 = 10 - (ViewConfiguration.getEdgeSlop() >> 16);
                    byte[] bArr212 = $$a;
                    Object[] objArr919 = new Object[1];
                    c((byte) (bArr212[208] - 1), (short) 158, bArr212[10], objArr919);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cCombineMeasuredStates2, jumpTapTimeout7, edgeSlop6, -1650998592, false, (String) objArr919[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf111);
            } else {
                str = str2;
                objArr7 = objArr7;
            }
            objArr8 = objArr7;
        }
        if (((int[]) objArr8[0])[0] == ((int[]) objArr8[2])[0]) {
            throw null;
        }
        int i1610 = ((int[]) objArr8[1])[0];
        Object[] objArr1010 = {new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
        int iIdentityHashCode12 = System.identityHashCode(this);
        int i1611 = i1610 + (-643226233) + (((~((~iIdentityHashCode12) | (-248017232))) | (-207707003)) * (-235)) + (((~((-248017232) | iIdentityHashCode12)) | (-207707003)) * (-470)) + (((~(iIdentityHashCode12 | (-205541707))) | (-250182528)) * 235);
        int i1612 = (i1611 << 13) ^ i1611;
        int i1613 = i1612 ^ (i1612 >>> 17);
        ((int[]) objArr1010[1])[0] = i1613 ^ (i1613 << 5);
        int i1614 = b + 25;
        TuitionPaymentFragmentbindingInflater1 = i1614 % 128;
        int i1615 = i1614 % 2;
        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char defaultSize3 = (char) View.getDefaultSize(0, 0);
            int edgeSlop7 = (ViewConfiguration.getEdgeSlop() >> 16) + 876;
            int iGreen3 = Color.green(0) + 10;
            byte[] bArr213 = $$a;
            Object[] objArr1011 = new Object[1];
            c((byte) (-bArr213[9]), bArr213[0], bArr213[19], objArr1011);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(defaultSize3, edgeSlop7, iGreen3, -1199417970, false, (String) objArr1011[0], null);
        }
        j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).getLong(null);
        jLongValue2 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char bitsPerPixel5 = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
            int windowTouchSlop3 = 876 - (ViewConfiguration.getWindowTouchSlop() >> 8);
            int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 0) + 10;
            byte[] bArr214 = $$a;
            Object[] objArr1012 = new Object[1];
            c(bArr214[7], bArr214[77], (byte) (-bArr214[14]), objArr1012);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(bitsPerPixel5, windowTouchSlop3, iMakeMeasureSpec4, 254769921, false, (String) objArr1012[0], null);
        }
        if (j2 == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null) << 52) >>> 52)) >> 12)) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                char cMyTid2 = (char) (Process.myTid() >> 22);
                int deadChar5 = KeyEvent.getDeadChar(0, 0) + 876;
                int i1616 = 10 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte[] bArr215 = $$a;
                byte b111 = bArr215[77];
                Object[] objArr1013 = new Object[1];
                c(b111, b111, bArr215[19], objArr1013);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(cMyTid2, deadChar5, i1616, 1324201839, false, (String) objArr1013[0], null);
            }
            Object[] objArr1014 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).get(null);
            objArr9 = new Object[]{new int[]{((int[]) objArr1014[0])[0]}, new int[1], new int[]{((int[]) objArr1014[2])[0]}, (String[]) objArr1014[3]};
            int startUptimeMillis5 = (int) Process.getStartUptimeMillis();
            int i1617 = ~startUptimeMillis5;
            int i1618 = ((((((~(44676811 | i1617)) | (~((-84987041) | startUptimeMillis5))) | (~(i1617 | 84987040))) * 959) + 174647731) + (((~(startUptimeMillis5 | 84987040)) | ((~(i1617 | (-84987041))) | (~(44676811 | startUptimeMillis5)))) * 959)) - 1285991749;
            int i1619 = (i1618 << 13) ^ i1618;
            int i1710 = i1619 ^ (i1619 >>> 17);
            ((int[]) objArr9[1])[0] = i1710 ^ (i1710 << 5);
        } else {
            Object[] objArr1015 = {Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), -1285991749};
            short s4 = (short) ($$e | 76);
            byte[] bArr216 = $$d;
            Object[] objArr1016 = new Object[1];
            d((byte) 75, s4, bArr216[322], objArr1016);
            Class<?> cls9 = Class.forName((String) objArr1016[0]);
            Object[] objArr1017 = new Object[1];
            d((byte) 37, (short) (-bArr216[73]), bArr216[5], objArr1017);
            objArr9 = (Object[]) cls9.getMethod((String) objArr1017[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr1015);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char cIndexOf13 = (char) TextUtils.indexOf(str, str, 0, 0);
                int i1711 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 875;
                int jumpTapTimeout8 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 10;
                byte[] bArr217 = $$a;
                byte b112 = bArr217[77];
                Object[] objArr1018 = new Object[1];
                c(b112, b112, bArr217[19], objArr1018);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cIndexOf13, i1711, jumpTapTimeout8, 1324201839, false, (String) objArr1018[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, objArr9);
            long jLongValue110 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
            Long lValueOf112 = Long.valueOf(jLongValue110);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char cNormalizeMetaState2 = (char) KeyEvent.normalizeMetaState(0);
                int mode7 = View.MeasureSpec.getMode(0) + 876;
                int trimmedLength5 = TextUtils.getTrimmedLength(str) + 10;
                byte[] bArr218 = $$a;
                Object[] objArr1019 = new Object[1];
                c(bArr218[7], bArr218[77], (byte) (-bArr218[14]), objArr1019);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cNormalizeMetaState2, mode7, trimmedLength5, 254769921, false, (String) objArr1019[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).set(null, lValueOf112);
            Long lValueOf113 = Long.valueOf(jLongValue110 >> 12);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char touchSlop2 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                int i1712 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 877;
                int fadingEdgeLength5 = 10 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                byte[] bArr219 = $$a;
                Object[] objArr1110 = new Object[1];
                c((byte) (-bArr219[9]), bArr219[0], bArr219[19], objArr1110);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(touchSlop2, i1712, fadingEdgeLength5, -1199417970, false, (String) objArr1110[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, lValueOf113);
        }
        i7 = ((int[]) objArr9[2])[0];
        i8 = ((int[]) objArr9[0])[0];
        if (i8 == i7) {
            arrayList2 = new ArrayList();
            strArr2 = (String[]) objArr9[3];
            if (strArr2 != null) {
                while (i9 < strArr2.length) {
                    arrayList2.add(str13);
                }
            }
            throw new RuntimeException(String.valueOf(i8));
        }
        int i1713 = ((int[]) objArr9[1])[0];
        Object[] objArr1111 = {new int[]{((int[]) objArr9[0])[0]}, new int[1], new int[]{((int[]) objArr9[2])[0]}, (String[]) objArr9[3]};
        int elapsedCpuTime4 = (int) Process.getElapsedCpuTime();
        int i1714 = (-1047908414) + (((~((~elapsedCpuTime4) | 227492442)) | (-268393088)) * (-245));
        int i1715 = ~(elapsedCpuTime4 | 227492442);
        int i1716 = i1713 + i1714 + (i1715 * (-245)) + ((i1715 | 267802671) * 245);
        int i1717 = (i1716 << 13) ^ i1716;
        int i1718 = i1717 ^ (i1717 >>> 17);
        ((int[]) objArr1111[1])[0] = i1718 ^ (i1718 << 5);
        objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
            char cIndexOf14 = (char) (TextUtils.indexOf((CharSequence) str, '0', 0, 0) + 1);
            int bitsPerPixel6 = ImageFormat.getBitsPerPixel(0) + 877;
            int size8 = 10 - View.MeasureSpec.getSize(0);
            byte[] bArr310 = $$a;
            byte b113 = bArr310[7];
            Object[] objArr1112 = new Object[1];
            c(b113, (short) (b113 | 210), (byte) (bArr310[19] - 1), objArr1112);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cIndexOf14, bitsPerPixel6, size8, 252381699, false, (String) objArr1112[0], null);
        }
        j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).getLong(null);
        jLongValue3 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
            char packedPositionType5 = (char) ExpandableListView.getPackedPositionType(0L);
            int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L) + 877;
            int absoluteGravity3 = 10 - Gravity.getAbsoluteGravity(0, 0);
            Object[] objArr1113 = new Object[1];
            c((byte) 52, (short) 121, $$a[10], objArr1113);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(packedPositionType5, packedPositionChild2, absoluteGravity3, 2009631821, false, (String) objArr1113[0], null);
        }
        if (j3 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).getLong(null) << 52) >>> 52)) >> 12)) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                char scrollBarSize4 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                int scrollDefaultDelay4 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 876;
                int iIndexOf10 = 9 - TextUtils.indexOf((CharSequence) str, '0', 0, 0);
                byte b114 = $$a[7];
                short s5 = b114;
                Object[] objArr1114 = new Object[1];
                c(b114, s5, (byte) s5, objArr1114);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(scrollBarSize4, scrollDefaultDelay4, iIndexOf10, 256017550, false, (String) objArr1114[0], null);
            }
            Object[] objArr1115 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).get(null);
            objArr11 = new Object[]{new int[]{((int[]) objArr1115[0])[0]}, new int[1], new int[]{((int[]) objArr1115[2])[0]}, (String[]) objArr1115[3]};
            int iElapsedRealtime3 = (int) SystemClock.elapsedRealtime();
            int i1719 = 1153572500 + (((~((-650962554) | iElapsedRealtime3)) | 42477145 | (~(610652324 | iElapsedRealtime3))) * (-880));
            int i1810 = (~((-650962554) | (~iElapsedRealtime3))) | (-610652325);
            int i1811 = ~(iElapsedRealtime3 | 650962553);
            int i1812 = ((i1719 + ((i1810 | i1811) * (-880))) + (i1811 * 880)) - 1559132946;
            int i1813 = (i1812 << 13) ^ i1812;
            int i1814 = i1813 ^ (i1813 >>> 17);
            ((int[]) objArr11[1])[0] = i1814 ^ (i1814 << 5);
            applicationContext3 = context;
        } else {
            applicationContext3 = context;
            if (applicationContext3 != null) {
                applicationContext4 = applicationContext3;
            } else if (!(applicationContext3 instanceof ContextWrapper)) {
                applicationContext4 = context.getApplicationContext();
            } else {
                applicationContext4 = context.getApplicationContext();
            }
            Object[] objArr1116 = {applicationContext4, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), -1559132946};
            byte[] bArr311 = $$d;
            Object[] objArr1117 = new Object[1];
            d((byte) (bArr311[213] - 1), (short) 281, bArr311[59], objArr1117);
            Class<?> cls10 = Class.forName((String) objArr1117[0]);
            byte b115 = bArr311[5];
            Object[] objArr1118 = new Object[1];
            d(b115, (short) (b115 | 123), (byte) (-bArr311[4]), objArr1118);
            objArr10 = (Object[]) cls10.getMethod((String) objArr1118[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr1116);
            if (applicationContext4 != null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cIndexOf15 = (char) ((-1) - TextUtils.indexOf((CharSequence) str, '0', 0, 0));
                    int iCombineMeasuredStates4 = View.combineMeasuredStates(0, 0) + 876;
                    int iIndexOf11 = 9 - TextUtils.indexOf((CharSequence) str, '0', 0, 0);
                    byte b26 = $$a[7];
                    short s6 = b26;
                    Object[] objArr1119 = new Object[1];
                    c(b26, s6, (byte) s6, objArr1119);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cIndexOf15, iCombineMeasuredStates4, iIndexOf11, 256017550, false, (String) objArr1119[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).set(null, objArr10);
                long jLongValue111 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf114 = Long.valueOf(jLongValue111);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char c12 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                    int iMakeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(0, 0) + 876;
                    int deadChar6 = 10 - KeyEvent.getDeadChar(0, 0);
                    Object[] objArr1210 = new Object[1];
                    c((byte) 52, (short) 121, $$a[10], objArr1210);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c12, iMakeMeasureSpec5, deadChar6, 2009631821, false, (String) objArr1210[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).set(null, lValueOf114);
                Long lValueOf25 = Long.valueOf(jLongValue111 >> 12);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char cIndexOf16 = (char) (TextUtils.indexOf((CharSequence) str, '0', 0) + 1);
                    int mirror3 = AndroidCharacter.getMirror('0') + 828;
                    int jumpTapTimeout9 = 10 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    byte[] bArr312 = $$a;
                    byte b27 = bArr312[7];
                    Object[] objArr1211 = new Object[1];
                    c(b27, (short) (b27 | 210), (byte) (bArr312[19] - 1), objArr1211);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(cIndexOf16, mirror3, jumpTapTimeout9, 252381699, false, (String) objArr1211[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, lValueOf25);
            } else {
                objArr10 = objArr10;
            }
            objArr11 = objArr10;
        }
        i10 = ((int[]) objArr11[2])[0];
        i11 = ((int[]) objArr11[0])[0];
        if (i11 == i10) {
            int i1815 = ((int[]) objArr11[1])[0];
            Object[] objArr1212 = {new int[]{((int[]) objArr11[0])[0]}, new int[1], new int[]{((int[]) objArr11[2])[0]}, (String[]) objArr11[3]};
            int iIdentityHashCode13 = System.identityHashCode(this);
            int i1816 = ~iIdentityHashCode13;
            int i1817 = i1815 + ((((~(176194269 | i1816)) | (~(iIdentityHashCode13 | 216504498))) * 959) - 1318692349) + (((~(iIdentityHashCode13 | 176194269)) | (~(i1816 | 216504498))) * 959);
            int i1818 = (i1817 << 13) ^ i1817;
            int i1819 = i1818 ^ (i1818 >>> 17);
            ((int[]) objArr1212[1])[0] = i1819 ^ (i1819 << 5);
            i12 = 0;
        } else {
            int[] iArr12 = new int[i11];
            int i1910 = i11 - 1;
            iArr12[i1910] = 1;
            Toast.makeText((Context) null, iArr12[((i11 * i1910) % 2) - 1], 1).show();
            int i1911 = ((int[]) objArr11[1])[0];
            Object[] objArr1213 = {new int[]{((int[]) objArr11[0])[0]}, new int[1], new int[]{((int[]) objArr11[2])[0]}, (String[]) objArr11[3]};
            int iMyUid2 = Process.myUid();
            int i1912 = i1911 + (-340708924) + ((~((~iMyUid2) | (-1649236))) * (-116)) + ((782286888 | iMyUid2) * 116) + (((~(iMyUid2 | 741976659)) | 41959464) * 116);
            int i1913 = (i1912 << 13) ^ i1912;
            int i1914 = i1913 ^ (i1913 >>> 17);
            i12 = 0;
            ((int[]) objArr1213[1])[0] = i1914 ^ (i1914 << 5);
        }
        objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
            char cIndexOf17 = (char) ((-1) - TextUtils.indexOf((CharSequence) str, '0', i12));
            int size9 = 651 - View.MeasureSpec.getSize(i12);
            int longPressTimeout4 = 44 - (ViewConfiguration.getLongPressTimeout() >> 16);
            Object[] objArr1214 = new Object[1];
            c((byte) 52, (short) 121, $$a[10], objArr1214);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(cIndexOf17, size9, longPressTimeout4, -459846511, false, (String) objArr1214[0], null);
        }
        j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).getLong(null);
        jLongValue4 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
            char packedPositionType6 = (char) ExpandableListView.getPackedPositionType(0L);
            int capsMode5 = TextUtils.getCapsMode(str, 0, 0) + 651;
            int threadPriority3 = 44 - ((Process.getThreadPriority(0) + 20) >> 6);
            byte[] bArr313 = $$a;
            byte b28 = bArr313[7];
            Object[] objArr1215 = new Object[1];
            c(b28, (short) (b28 | 210), (byte) (bArr313[19] - 1), objArr1215);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(packedPositionType6, capsMode5, threadPriority3, -873460649, false, (String) objArr1215[0], null);
        }
        if (j4 == ((jLongValue4 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).getLong(null) << 52) >>> 52)) >> 12)) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                char c13 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1);
                int packedPositionType7 = 651 - ExpandableListView.getPackedPositionType(0L);
                int size10 = View.MeasureSpec.getSize(0) + 44;
                byte[] bArr314 = $$a;
                Object[] objArr1216 = new Object[1];
                c((byte) (bArr314[208] - 1), (short) 158, bArr314[10], objArr1216);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(c13, packedPositionType7, size10, -1595579076, false, (String) objArr1216[0], null);
            }
            Object[] objArr1217 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).get(null);
            objArr12 = new Object[]{new int[]{i196}, new String[0], new int[]{i195}, new int[1]};
            int i1915 = ((int[]) objArr1217[2])[0];
            int i1916 = ((int[]) objArr1217[0])[0];
            int elapsedCpuTime5 = (int) Process.getElapsedCpuTime();
            int i1917 = ~elapsedCpuTime5;
            int i1918 = (((222111998 + ((((~((-8954267) | i1917)) | (~((-402789957) | elapsedCpuTime5))) | (~(417267678 | elapsedCpuTime5))) * 765)) + (((~((-411744223) | i1917)) | 8954266) * 1530)) + (((~(elapsedCpuTime5 | (-411744223))) | (~(i1917 | 417267678))) * 765)) - 2043744500;
            int i1919 = (i1918 << 13) ^ i1918;
            int i2010 = i1919 ^ (i1919 >>> 17);
            ((int[]) objArr12[3])[0] = i2010 ^ (i2010 << 5);
            i13 = 0;
        } else {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b((char) (TextUtils.lastIndexOf(str, '0', 0) + 1), 1610 - View.MeasureSpec.getMode(0), 26 - ((Process.getThreadPriority(0) + 20) >> 6), 2145681644, false, null, new Class[0]);
            }
            Object[] objArr1218 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).newInstance(null), -2043744500, 0};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                char edgeSlop8 = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                int maxKeyCode6 = (KeyEvent.getMaxKeyCode() >> 16) + 651;
                int scrollDefaultDelay5 = 44 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                byte[] bArr315 = $$a;
                byte b29 = bArr315[7];
                Object[] objArr1219 = new Object[1];
                c(b29, (short) (b29 | 210), (byte) (bArr315[19] - 1), objArr1219);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(edgeSlop8, maxKeyCode6, scrollDefaultDelay5, 2075921419, false, (String) objArr1219[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 695, 98 - (ViewConfiguration.getEdgeSlop() >> 16)), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 63406), 793 - (KeyEvent.getMaxKeyCode() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 82), Integer.TYPE, Integer.TYPE});
            }
            objArr12 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).invoke(null, objArr1218);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                char c14 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                int iIndexOf12 = 651 - TextUtils.indexOf(str, str);
                int i2011 = 45 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                byte[] bArr316 = $$a;
                Object[] objArr1310 = new Object[1];
                c((byte) (bArr316[208] - 1), (short) 158, bArr316[10], objArr1310);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(c14, iIndexOf12, i2011, -1595579076, false, (String) objArr1310[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).set(null, objArr12);
            long jLongValue112 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
            Long lValueOf26 = Long.valueOf(jLongValue112);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                char trimmedLength6 = (char) TextUtils.getTrimmedLength(str);
                int i2012 = 651 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int scrollBarSize5 = 44 - (ViewConfiguration.getScrollBarSize() >> 8);
                byte[] bArr317 = $$a;
                byte b210 = bArr317[7];
                Object[] objArr1311 = new Object[1];
                c(b210, (short) (b210 | 210), (byte) (bArr317[19] - 1), objArr1311);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(trimmedLength6, i2012, scrollBarSize5, -873460649, false, (String) objArr1311[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).set(null, lValueOf26);
            Long lValueOf27 = Long.valueOf(jLongValue112 >> 12);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                char keyRepeatDelay5 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                int iAxisFromString3 = MotionEvent.axisFromString(str) + 652;
                int iIndexOf13 = TextUtils.indexOf((CharSequence) str, '0') + 45;
                Object[] objArr1312 = new Object[1];
                c((byte) 52, (short) 121, $$a[10], objArr1312);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(keyRepeatDelay5, iAxisFromString3, iIndexOf13, -459846511, false, (String) objArr1312[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).set(null, lValueOf27);
            i13 = 0;
        }
        if (((int[]) objArr12[2])[i13] == ((int[]) objArr12[i13])[i13]) {
            arrayList3 = new ArrayList();
            strArr3 = (String[]) objArr12[1];
            if (strArr3 != null) {
                while (i14 < strArr3.length) {
                    arrayList3.add(str14);
                }
            }
            throw null;
        }
        Object[] objArr1313 = new Object[4];
        int[] iArr13 = new int[1];
        objArr1313[i13] = iArr13;
        int[] iArr14 = new int[1];
        objArr1313[2] = iArr14;
        objArr1313[3] = new int[1];
        int i2013 = ((int[]) objArr12[3])[i13];
        int i2014 = ((int[]) objArr12[2])[i13];
        int i2015 = ((int[]) objArr12[i13])[i13];
        iArr14[i13] = i2014;
        iArr13[i13] = i2015;
        objArr1313[1] = new String[i13];
        int iIdentityHashCode14 = System.identityHashCode(this);
        int i2016 = (~(500794053 | iIdentityHashCode14)) | 33840154;
        int i2017 = ~iIdentityHashCode14;
        int i2018 = i2013 + 1458590833 + ((i2016 | (~((-30409345) | i2017))) * 886) + (((~(i2017 | (-500794054))) | 504224863) * (-1772)) + ((~(i2017 | 504224863)) * 886);
        int i2019 = (i2018 << 13) ^ i2018;
        int i2110 = i2019 ^ (i2019 >>> 17);
        ((int[]) objArr1313[3])[0] = i2110 ^ (i2110 << 5);
        int i2111 = b + 111;
        TuitionPaymentFragmentbindingInflater1 = i2111 % 128;
        int i2112 = i2111 % 2;
        objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
            char cKeyCodeFromString3 = (char) KeyEvent.keyCodeFromString(str);
            int iBlue3 = 2267 - Color.blue(0);
            int iLastIndexOf4 = TextUtils.lastIndexOf(str, '0', 0, 0) + 34;
            Object[] objArr1314 = new Object[1];
            c((byte) 52, (short) 210, $$a[10], objArr1314);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(cKeyCodeFromString3, iBlue3, iLastIndexOf4, -887667012, false, (String) objArr1314[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).getLong(null) != -1) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                char c15 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                int threadPriority4 = ((Process.getThreadPriority(0) + 20) >> 6) + 2267;
                int i2113 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 32;
                byte[] bArr318 = $$a;
                Object[] objArr1315 = new Object[1];
                c((byte) (bArr318[208] - 1), (short) 158, bArr318[10], objArr1315);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(c15, threadPriority4, i2113, -654680577, false, (String) objArr1315[0], null);
            }
            Object[] objArr1316 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).get(null);
            objArr13 = new Object[]{new int[]{i214}, strArr19, new int[1], new int[]{i215}};
            int i2114 = ((int[]) objArr1316[0])[0];
            int i2115 = ((int[]) objArr1316[3])[0];
            String[] strArr112 = (String[]) objArr1316[1];
            int startUptimeMillis6 = (int) Process.getStartUptimeMillis();
            int i2116 = ((1755515993 + (((~(startUptimeMillis6 | 215697910)) | 593015405) * 191)) + (((~((~startUptimeMillis6) | 215697910)) | 587248137) * 191)) - 2139478060;
            int i2117 = (i2116 << 13) ^ i2116;
            int i2118 = i2117 ^ (i2117 >>> 17);
            ((int[]) objArr13[2])[0] = i2118 ^ (i2118 << 5);
        } else {
            if (applicationContext3 != null) {
                if (applicationContext3 instanceof ContextWrapper) {
                    applicationContext3 = context.getApplicationContext();
                } else {
                    applicationContext3 = context.getApplicationContext();
                }
            }
            Object[] objArr1317 = {applicationContext3, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), 0, -2139478060};
            byte[] bArr319 = $$d;
            Object[] objArr1318 = new Object[1];
            d(bArr319[2], (short) 329, bArr319[59], objArr1318);
            Class<?> cls11 = Class.forName((String) objArr1318[0]);
            byte b211 = bArr319[21];
            Object[] objArr1319 = new Object[1];
            d(b211, (short) (b211 | 322), bArr319[5], objArr1319);
            objArr13 = (Object[]) cls11.getMethod((String) objArr1319[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr1317);
            if (applicationContext3 != null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                    char c16 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int capsMode6 = TextUtils.getCapsMode(str, 0, 0) + 2267;
                    int offsetAfter3 = TextUtils.getOffsetAfter(str, 0) + 33;
                    byte[] bArr41 = $$a;
                    Object[] objArr146 = new Object[1];
                    c((byte) (bArr41[208] - 1), (short) 158, bArr41[10], objArr146);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(c16, capsMode6, offsetAfter3, -654680577, false, (String) objArr146[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).set(null, objArr13);
                long jLongValue113 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf28 = Long.valueOf(jLongValue113);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                    char c17 = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                    int iResolveSize4 = 2267 - View.resolveSize(0, 0);
                    int i2119 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 33;
                    Object[] objArr147 = new Object[1];
                    c((byte) 52, (short) 69, $$a[10], objArr147);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(c17, iResolveSize4, i2119, -874156483, false, (String) objArr147[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).set(null, lValueOf28);
                Long lValueOf29 = Long.valueOf(jLongValue113 >> 12);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                    char deadChar7 = (char) KeyEvent.getDeadChar(0, 0);
                    int tapTimeout4 = (ViewConfiguration.getTapTimeout() >> 16) + 2267;
                    int longPressTimeout5 = (ViewConfiguration.getLongPressTimeout() >> 16) + 33;
                    Object[] objArr148 = new Object[1];
                    c((byte) 52, (short) 210, $$a[10], objArr148);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(deadChar7, tapTimeout4, longPressTimeout5, -887667012, false, (String) objArr148[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).set(null, lValueOf29);
            }
        }
        i15 = ((int[]) objArr13[3])[0];
        i16 = ((int[]) objArr13[0])[0];
        if (i16 == i15) {
            arrayList4 = new ArrayList();
            strArr4 = (String[]) objArr13[1];
            if (strArr4 != null) {
                while (i17 < strArr4.length) {
                    arrayList4.add(str15);
                }
            }
            throw new RuntimeException(String.valueOf(i16));
        }
        Object[] objArr149 = {new int[]{i221}, strArr20, new int[1], new int[]{i222}};
        int i2210 = ((int[]) objArr13[2])[0];
        int i2211 = ((int[]) objArr13[0])[0];
        int i2212 = ((int[]) objArr13[3])[0];
        String[] strArr22 = (String[]) objArr13[1];
        int iNextInt2 = new Random().nextInt();
        int i2213 = ~iNextInt2;
        int i2214 = i2210 + 940038215 + (((~(iNextInt2 | (-70318595))) | (~((-809763941) | i2213)) | 1050624) * (-68)) + ((~((-69267971) | i2213)) * (-68)) + (((~(70318594 | i2213)) | (-879031911)) * 68);
        int i2215 = (i2214 << 13) ^ i2214;
        int i2216 = i2215 ^ (i2215 >>> 17);
        ((int[]) objArr149[2])[0] = i2216 ^ (i2216 << 5);
        intent2 = DualSurfaceProcessorNodeExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (intent2 != null) {
            i18 = TuitionPaymentFragmentbindingInflater1 + 15;
            b = i18 % 128;
            if (i18 % 2 == 0) {
                Object obj2 = null;
                DualSurfaceProcessorNodeExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2.stopService(intent2);
                DualSurfaceProcessorNodeExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                obj2.hashCode();
                throw null;
            }
            DualSurfaceProcessorNodeExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2.stopService(intent2);
            DualSurfaceProcessorNodeExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r7, byte r8, short r9) {
        /*
            byte[] r0 = com.midtrans.raygun.OnPackageReplaced.$$c
            int r8 = r8 * 4
            int r8 = 1 - r8
            int r9 = r9 * 3
            int r9 = r9 + 107
            int r7 = r7 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r9 = r7
            r3 = r8
            r4 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            int r7 = r7 + 1
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = r7 + r3
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.midtrans.raygun.OnPackageReplaced.$$g(int, byte, short):java.lang.String");
    }
}

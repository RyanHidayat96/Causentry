package defpackage;

import android.R;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
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
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes6.dex */
public final class getOrCreateCameraXInstancelambda18lambda17 extends BroadcastReceiver {
    private static final byte[] $$a;
    private static final int $$b;
    private static final byte[] $$d;
    private static final int $$e;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static int asBinder;
    private static long b;
    private final Function0<Unit> TuitionPaymentFragmentbindingInflater1;
    private final Function0<Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final byte[] $$c = {25, 5, -88, -44};
    private static final int $$f = 239;
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = 103 - r6
            byte[] r0 = defpackage.getOrCreateCameraXInstancelambda18lambda17.$$a
            int r1 = 53 - r8
            int r7 = 213 - r7
            byte[] r1 = new byte[r1]
            int r8 = 52 - r8
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            int r7 = r7 + 1
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2b:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + (-11)
            r7 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getOrCreateCameraXInstancelambda18lambda17.c(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 84
            int r0 = r8 + 1
            int r7 = 450 - r7
            byte[] r1 = defpackage.getOrCreateCameraXInstancelambda18lambda17.$$d
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L11
            r3 = r7
            r7 = r8
            r4 = r2
            goto L2a
        L11:
            r3 = r2
        L12:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L21:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getOrCreateCameraXInstancelambda18lambda17.d(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:47:0x021b  */
    /* JADX WARN: Code duplicated, block: B:48:0x021c  */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        long j;
        Throwable cause;
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (true) {
            j = 0;
            if (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= i2) {
                break;
            }
            int i4 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2[i + i4])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 + 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) TextUtils.getOffsetAfter("", 0), TextUtils.indexOf("", "", 0, 0) + 2187, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 40, 841711447, false, $$g(b2, b3, (byte) (b3 - 2)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(b), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33017 - TextUtils.indexOf("", "", 0)), Color.alpha(0) + 3011, View.MeasureSpec.makeMeasureSpec(0, 0) + 26, 321985076, false, $$g(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - Color.alpha(0)), TextUtils.lastIndexOf("", '0') + 3377, 17 - View.resolveSizeAndState(0, 0, 0), -968507904, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        int i5 = $10 + 45;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i7 = $11 + 31;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                try {
                    Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = (byte) (b8 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (36506 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (ViewConfiguration.getLongPressTimeout() >> 16) + 3376, 17 - KeyEvent.getDeadChar(0, 0), -968507904, false, $$g(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    int i8 = 10 / 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } else {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr6 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = (byte) (b10 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (36504 - Process.getGidForName("")), KeyEvent.keyCodeFromString("") + 3376, ExpandableListView.getPackedPositionChild(j) + 18, -968507904, false, $$g(b10, b11, (byte) (b11 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                j = 0;
            }
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Code duplicated, block: B:227:0x1503  */
    /* JADX WARN: Code duplicated, block: B:229:0x157a  */
    /* JADX WARN: Code duplicated, block: B:232:0x15e2  */
    /* JADX WARN: Code duplicated, block: B:235:0x1639  */
    /* JADX WARN: Code duplicated, block: B:237:0x1642  */
    /* JADX WARN: Code duplicated, block: B:240:0x1701  */
    /* JADX WARN: Code duplicated, block: B:244:0x178b  */
    /* JADX WARN: Code duplicated, block: B:249:0x17f6  */
    /* JADX WARN: Code duplicated, block: B:252:0x184f  */
    /* JADX WARN: Code duplicated, block: B:256:0x18a9  */
    /* JADX WARN: Code duplicated, block: B:258:0x191b  */
    /* JADX WARN: Code duplicated, block: B:261:0x197f  */
    /* JADX WARN: Code duplicated, block: B:264:0x19d4  */
    /* JADX WARN: Code duplicated, block: B:266:0x19dd  */
    /* JADX WARN: Code duplicated, block: B:269:0x1a85  */
    /* JADX WARN: Code duplicated, block: B:271:0x1a89  */
    /* JADX WARN: Code duplicated, block: B:277:0x1a99  */
    /* JADX WARN: Code duplicated, block: B:278:0x1a9e  */
    /* JADX WARN: Code duplicated, block: B:282:0x1b24  */
    /* JADX WARN: Code duplicated, block: B:284:0x1b2d  */
    /* JADX WARN: Code duplicated, block: B:289:0x1b99  */
    /* JADX WARN: Code duplicated, block: B:290:0x1be0  */
    /* JADX WARN: Code duplicated, block: B:293:0x1bf9  */
    /* JADX WARN: Code duplicated, block: B:297:0x1c42  */
    /* JADX WARN: Code duplicated, block: B:301:0x1c57  */
    /* JADX WARN: Code duplicated, block: B:302:0x1cc5  */
    /* JADX WARN: Code duplicated, block: B:305:0x1d40  */
    /* JADX WARN: Code duplicated, block: B:308:0x1da5  */
    /* JADX WARN: Code duplicated, block: B:309:0x1de5  */
    /* JADX WARN: Code duplicated, block: B:312:0x1dfc  */
    /* JADX WARN: Code duplicated, block: B:314:0x1e05  */
    /* JADX WARN: Code duplicated, block: B:316:0x1ebd  */
    /* JADX WARN: Code duplicated, block: B:319:0x1ec7 A[Catch: all -> 0x2f54, TryCatch #9 {all -> 0x2f54, blocks: (B:392:0x26a9, B:394:0x26be, B:395:0x26eb, B:317:0x1ec1, B:319:0x1ec7, B:320:0x1ef0, B:322:0x1f1b, B:323:0x1fa5, B:154:0x0e58, B:156:0x0e6d, B:157:0x0ea1, B:159:0x0ede, B:160:0x0f6a, B:104:0x09d5, B:106:0x09ea, B:107:0x0a20, B:109:0x0a53, B:110:0x0aca), top: B:554:0x09d5 }] */
    /* JADX WARN: Code duplicated, block: B:322:0x1f1b A[Catch: all -> 0x2f54, TryCatch #9 {all -> 0x2f54, blocks: (B:392:0x26a9, B:394:0x26be, B:395:0x26eb, B:317:0x1ec1, B:319:0x1ec7, B:320:0x1ef0, B:322:0x1f1b, B:323:0x1fa5, B:154:0x0e58, B:156:0x0e6d, B:157:0x0ea1, B:159:0x0ede, B:160:0x0f6a, B:104:0x09d5, B:106:0x09ea, B:107:0x0a20, B:109:0x0a53, B:110:0x0aca), top: B:554:0x09d5 }] */
    /* JADX WARN: Code duplicated, block: B:326:0x1fb8  */
    /* JADX WARN: Code duplicated, block: B:331:0x2025  */
    /* JADX WARN: Code duplicated, block: B:334:0x2078  */
    /* JADX WARN: Code duplicated, block: B:338:0x20d5  */
    /* JADX WARN: Code duplicated, block: B:340:0x214b  */
    /* JADX WARN: Code duplicated, block: B:343:0x2199  */
    /* JADX WARN: Code duplicated, block: B:345:0x21ac  */
    /* JADX WARN: Code duplicated, block: B:348:0x2270 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:349:0x2272  */
    /* JADX WARN: Code duplicated, block: B:351:0x2276  */
    /* JADX WARN: Code duplicated, block: B:354:0x228a  */
    /* JADX WARN: Code duplicated, block: B:355:0x228c  */
    /* JADX WARN: Code duplicated, block: B:356:0x2291  */
    /* JADX WARN: Code duplicated, block: B:361:0x232d  */
    /* JADX WARN: Code duplicated, block: B:366:0x239a  */
    /* JADX WARN: Code duplicated, block: B:369:0x23f4  */
    /* JADX WARN: Code duplicated, block: B:373:0x244b  */
    /* JADX WARN: Code duplicated, block: B:374:0x24c4  */
    /* JADX WARN: Code duplicated, block: B:376:0x24d0  */
    /* JADX WARN: Code duplicated, block: B:379:0x24d4 A[LOOP:2: B:377:0x24d1->B:379:0x24d4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:383:0x2565  */
    /* JADX WARN: Code duplicated, block: B:386:0x25b2  */
    /* JADX WARN: Code duplicated, block: B:388:0x25bb  */
    /* JADX WARN: Code duplicated, block: B:391:0x268b  */
    /* JADX WARN: Code duplicated, block: B:394:0x26be A[Catch: all -> 0x2f54, TryCatch #9 {all -> 0x2f54, blocks: (B:392:0x26a9, B:394:0x26be, B:395:0x26eb, B:317:0x1ec1, B:319:0x1ec7, B:320:0x1ef0, B:322:0x1f1b, B:323:0x1fa5, B:154:0x0e58, B:156:0x0e6d, B:157:0x0ea1, B:159:0x0ede, B:160:0x0f6a, B:104:0x09d5, B:106:0x09ea, B:107:0x0a20, B:109:0x0a53, B:110:0x0aca), top: B:554:0x09d5 }] */
    /* JADX WARN: Code duplicated, block: B:398:0x2701  */
    /* JADX WARN: Code duplicated, block: B:403:0x276f  */
    /* JADX WARN: Code duplicated, block: B:404:0x27b7  */
    /* JADX WARN: Code duplicated, block: B:407:0x27d0  */
    /* JADX WARN: Code duplicated, block: B:411:0x282c  */
    /* JADX WARN: Code duplicated, block: B:412:0x28b0  */
    /* JADX WARN: Code duplicated, block: B:414:0x28bc  */
    /* JADX WARN: Code duplicated, block: B:417:0x28c0 A[LOOP:1: B:415:0x28bd->B:417:0x28c0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:421:0x2962  */
    /* JADX WARN: Code duplicated, block: B:424:0x29c8  */
    /* JADX WARN: Code duplicated, block: B:427:0x2a1f  */
    /* JADX WARN: Code duplicated, block: B:429:0x2a28  */
    /* JADX WARN: Code duplicated, block: B:432:0x2ae4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:433:0x2ae6  */
    /* JADX WARN: Code duplicated, block: B:439:0x2af6  */
    /* JADX WARN: Code duplicated, block: B:440:0x2afb  */
    /* JADX WARN: Code duplicated, block: B:445:0x2bf0  */
    /* JADX WARN: Code duplicated, block: B:447:0x2bfb  */
    /* JADX WARN: Code duplicated, block: B:449:0x2c04  */
    /* JADX WARN: Code duplicated, block: B:454:0x2c6c  */
    /* JADX WARN: Code duplicated, block: B:457:0x2cc1  */
    /* JADX WARN: Code duplicated, block: B:459:0x2d05  */
    /* JADX WARN: Code duplicated, block: B:461:0x2d0e  */
    /* JADX WARN: Code duplicated, block: B:466:0x2d7b  */
    /* JADX WARN: Code duplicated, block: B:469:0x2dce  */
    /* JADX WARN: Code duplicated, block: B:475:0x2e2b  */
    /* JADX WARN: Code duplicated, block: B:477:0x2ea7  */
    /* JADX WARN: Code duplicated, block: B:488:0x2ecb  */
    /* JADX WARN: Code duplicated, block: B:490:0x2ed7  */
    /* JADX WARN: Code duplicated, block: B:493:0x2ee5 A[LOOP:0: B:491:0x2ee2->B:493:0x2ee5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:500:0x2efb  */
    /* JADX WARN: Code duplicated, block: B:502:0x2f07  */
    /* JADX WARN: Code duplicated, block: B:505:0x2f0b A[LOOP:3: B:503:0x2f08->B:505:0x2f0b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:510:0x2f23  */
    /* JADX WARN: Code duplicated, block: B:512:0x2f30  */
    /* JADX WARN: Code duplicated, block: B:515:0x2f34 A[LOOP:4: B:513:0x2f31->B:515:0x2f34, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:520:0x2f44  */
    /* JADX WARN: Code duplicated, block: B:57:0x056c  */
    /* JADX WARN: Code duplicated, block: B:58:0x056e  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws Throwable {
        Object[] objArr;
        int i;
        int i2;
        Context applicationContext;
        Object[] objArr2;
        int i3;
        Object[] objArr3;
        int i4;
        Context context2;
        Object[] objArr4;
        Object[] objArr5;
        String str;
        int i5;
        int i6;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        long j;
        long jLongValue;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object[] objArr6;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        ArrayList arrayList;
        String[] strArr;
        int i7;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8;
        long j2;
        long jLongValue2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9;
        Context context3;
        Context applicationContext2;
        Object[] objArr7;
        Object[] objArr8;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12;
        int i8;
        int i9;
        int i10;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13;
        long j3;
        long jLongValue3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16;
        Object[] objArr9;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList2;
        String[] strArr2;
        int i14;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20;
        Context applicationContext3;
        String str2;
        Object[] objArr10;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23;
        int i15;
        int i16;
        ArrayList arrayList3;
        String[] strArr3;
        int i17;
        int i18;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28;
        Object[] objArr11;
        int i19;
        int i20;
        ArrayList arrayList4;
        String[] strArr4;
        int i21;
        int i22;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29;
        long j4;
        long jLongValue4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30;
        Context applicationContext4;
        Object[] objArr12;
        int i23;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36;
        ArrayList arrayList5;
        String[] strArr5;
        int i24;
        NetworkCapabilities networkCapabilities;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42;
        int i25 = 2 % 2;
        Object[] objArr13 = new Object[1];
        a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 32, TextUtils.getOffsetAfter("", 0) + 22, (char) View.getDefaultSize(0, 0), objArr13);
        String str3 = (String) objArr13[0];
        Object[] objArr14 = new Object[1];
        a((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 54, 15 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) View.resolveSize(0, 0), objArr14);
        String str4 = (String) objArr14[0];
        Object[] objArr15 = new Object[1];
        a(TextUtils.lastIndexOf("", '0') + 1, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 16, (char) KeyEvent.getDeadChar(0, 0), objArr15);
        String str5 = (String) objArr15[0];
        Object[] objArr16 = new Object[1];
        a(Gravity.getAbsoluteGravity(0, 0) + 16, 16 - Color.argb(0, 0, 0, 0), (char) (47691 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), objArr16);
        String str6 = (String) objArr16[0];
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(intent, "");
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
            char touchSlop = (char) (43042 - (ViewConfiguration.getTouchSlop() >> 8));
            int iBlue = Color.blue(0) + 3111;
            int iResolveSize = View.resolveSize(0, 0) + 22;
            byte[] bArr = $$a;
            Object[] objArr17 = new Object[1];
            c(bArr[10], (short) 210, bArr[7], objArr17);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(touchSlop, iBlue, iResolveSize, -1272852037, false, (String) objArr17[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                char cResolveOpacity = (char) (43042 - Drawable.resolveOpacity(0, 0));
                int iGreen = 3111 - Color.green(0);
                int i26 = 23 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                Object[] objArr18 = new Object[1];
                c($$a[10], (short) 158, (byte) 15, objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b(cResolveOpacity, iGreen, i26, 154975793, false, (String) objArr18[0], null);
            }
            Object[] objArr19 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).get(null);
            int i27 = ((int[]) objArr19[2])[0];
            int i28 = ((int[]) objArr19[1])[0];
            String[] strArr6 = (String[]) objArr19[3];
            int[] iArr = {i27};
            int i29 = ~System.identityHashCode(this);
            int i30 = 1495832012 + ((~((-22423185) | i29)) * (-783)) + (((~(i29 | 1546225773)) | (-158805686)) * 783) + 1791667287;
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr[0])[0] = i32 ^ (i32 << 5);
            objArr = new Object[]{new int[1], new int[]{i28}, iArr, strArr6};
            i = 1;
        } else {
            try {
                Object[] objArr20 = {null, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), 0, 1791667287};
                byte[] bArr2 = $$d;
                byte b2 = bArr2[204];
                Object[] objArr21 = new Object[1];
                d(b2, (short) (b2 | 416), (byte) (-bArr2[470]), objArr21);
                Class<?> cls = Class.forName((String) objArr21[0]);
                byte b3 = bArr2[99];
                Object[] objArr22 = new Object[1];
                d(b3, (short) (b3 | 394), bArr2[6], objArr22);
                Object[] objArr23 = (Object[]) cls.getMethod((String) objArr22[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr20);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                    char longPressTimeout = (char) (43042 - (ViewConfiguration.getLongPressTimeout() >> 16));
                    int i33 = 3111 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int keyRepeatTimeout = 22 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    Object[] objArr24 = new Object[1];
                    c($$a[10], (short) 158, (byte) 15, objArr24);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(longPressTimeout, i33, keyRepeatTimeout, 154975793, false, (String) objArr24[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).set(null, objArr23);
                try {
                    long jLongValue5 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue5);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
                        char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 43042);
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 3112;
                        int i34 = 23 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        byte[] bArr3 = $$a;
                        Object[] objArr25 = new Object[1];
                        c(bArr3[10], (short) 121, bArr3[7], objArr25);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(minimumFlingVelocity, packedPositionChild, i34, -1269618118, false, (String) objArr25[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue5 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                        char c = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 43042);
                        int maximumFlingVelocity = 3111 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int iLastIndexOf = 21 - TextUtils.lastIndexOf("", '0', 0);
                        byte[] bArr4 = $$a;
                        Object[] objArr26 = new Object[1];
                        c(bArr4[10], (short) 210, bArr4[7], objArr26);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(c, maximumFlingVelocity, iLastIndexOf, -1272852037, false, (String) objArr26[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).set(null, lValueOf2);
                    objArr = objArr23;
                    i = 1;
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
        int i35 = ((int[]) objArr[i])[0];
        int i36 = ((int[]) objArr[2])[0];
        if (i36 == i35) {
            Object[] objArr27 = new Object[4];
            objArr27[0] = new int[i];
            int[] iArr2 = new int[i];
            objArr27[i] = iArr2;
            int[] iArr3 = new int[i];
            objArr27[2] = iArr3;
            int i37 = ((int[]) objArr[0])[0];
            int i38 = ((int[]) objArr[2])[0];
            int i39 = ((int[]) objArr[i])[0];
            String[] strArr7 = (String[]) objArr[3];
            iArr3[0] = i38;
            iArr2[0] = i39;
            int i40 = (~((int) Runtime.getRuntime().maxMemory())) | 723683126;
            int i41 = i37 + (-304813451) + (i40 * 495) + (((~i40) | 706873124) * 495);
            int i42 = (i41 << 13) ^ i41;
            int i43 = i42 ^ (i42 >>> 17);
            ((int[]) objArr27[0])[0] = i43 ^ (i43 << 5);
            objArr27[3] = strArr7;
            i2 = 0;
        } else {
            ArrayList arrayList6 = new ArrayList();
            String[] strArr8 = (String[]) objArr[3];
            if (strArr8 != null) {
                for (String str7 : strArr8) {
                    arrayList6.add(str7);
                }
            }
            Toast.makeText((Context) null, i36 / (((i36 - 1) * i36) % 2), 0).show();
            int i44 = ((int[]) objArr[0])[0];
            int i45 = ((int[]) objArr[2])[0];
            int i46 = ((int[]) objArr[1])[0];
            String[] strArr9 = (String[]) objArr[3];
            int[] iArr4 = {i45};
            int[] iArr5 = {i46};
            int iIdentityHashCode = System.identityHashCode(this);
            int i47 = i44 + ((((~((-1661780158) | iIdentityHashCode)) | 1637824216) * 262) - 2030579932) + (((~((~iIdentityHashCode) | (-1661780158))) | 1637824216) * 262);
            int i48 = (i47 << 13) ^ i47;
            int i49 = i48 ^ (i48 >>> 17);
            i2 = 0;
            ((int[]) objArr[0])[0] = i49 ^ (i49 << 5);
            Object[] objArr28 = {new int[1], iArr5, iArr4, strArr9};
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
            char cIndexOf = (char) TextUtils.indexOf("", "");
            int iIndexOf = TextUtils.indexOf("", "", i2, i2) + 2267;
            int iIndexOf2 = 32 - TextUtils.indexOf((CharSequence) "", '0');
            byte[] bArr5 = $$a;
            Object[] objArr29 = new Object[1];
            c(bArr5[10], (short) 121, bArr5[7], objArr29);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(cIndexOf, iIndexOf, iIndexOf2, -887667012, false, (String) objArr29[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                char c2 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 2267;
                int keyRepeatDelay = 33 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                Object[] objArr30 = new Object[1];
                c($$a[10], (short) 158, (byte) 15, objArr30);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(c2, iMakeMeasureSpec, keyRepeatDelay, -654680577, false, (String) objArr30[0], null);
            }
            Object[] objArr31 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).get(null);
            objArr2 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i50 = ((int[]) objArr31[0])[0];
            int i51 = ((int[]) objArr31[3])[0];
            String[] strArr10 = (String[]) objArr31[1];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i52 = ~((-118166097) | iIdentityHashCode2);
            int i53 = 2035236887 + ((671148299 | i52) * (-476)) + (i52 * 952) + ((~((~iIdentityHashCode2) | (-118166097))) * 476) + 1441104788;
            int i54 = (i53 << 13) ^ i53;
            int i55 = i54 ^ (i54 >>> 17);
            ((int[]) objArr2[2])[0] = i55 ^ (i55 << 5);
        } else {
            if (context == null) {
                applicationContext = context;
            } else if (context instanceof ContextWrapper) {
                int i56 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
                asBinder = i56 % 128;
                if (i56 % 2 == 0) {
                    int i57 = 84 / 0;
                    if (((ContextWrapper) context).getBaseContext() != null) {
                        applicationContext = context.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else if (((ContextWrapper) context).getBaseContext() != null) {
                    applicationContext = context.getApplicationContext();
                } else {
                    applicationContext = null;
                }
            } else {
                applicationContext = context.getApplicationContext();
            }
            Object[] objArr32 = {applicationContext, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), 0, 1441104788};
            byte[] bArr6 = $$d;
            Object[] objArr33 = new Object[1];
            d(bArr6[54], (short) 357, bArr6[380], objArr33);
            Class<?> cls2 = Class.forName((String) objArr33[0]);
            byte b4 = bArr6[99];
            Object[] objArr34 = new Object[1];
            d(b4, (short) (b4 | 313), (byte) (-bArr6[316]), objArr34);
            Object[] objArr35 = (Object[]) cls2.getMethod((String) objArr34[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr32);
            if (applicationContext != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                    char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                    int keyRepeatTimeout2 = 2267 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int windowTouchSlop = 33 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    Object[] objArr36 = new Object[1];
                    c($$a[10], (short) 158, (byte) 15, objArr36);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(modifierMetaStateMask, keyRepeatTimeout2, windowTouchSlop, -654680577, false, (String) objArr36[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).set(null, objArr35);
                try {
                    long jLongValue6 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf3 = Long.valueOf(jLongValue6);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
                        char c3 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                        int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0') + 2268;
                        int i58 = 33 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        byte[] bArr7 = $$a;
                        Object[] objArr37 = new Object[1];
                        c(bArr7[10], (short) 210, bArr7[7], objArr37);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(c3, iIndexOf3, i58, -874156483, false, (String) objArr37[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).set(null, lValueOf3);
                    Long lValueOf4 = Long.valueOf(jLongValue6 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
                        char keyRepeatDelay2 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int bitsPerPixel = 2266 - ImageFormat.getBitsPerPixel(0);
                        int minimumFlingVelocity2 = 33 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        byte[] bArr8 = $$a;
                        Object[] objArr38 = new Object[1];
                        c(bArr8[10], (short) 121, bArr8[7], objArr38);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(keyRepeatDelay2, bitsPerPixel, minimumFlingVelocity2, -887667012, false, (String) objArr38[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).set(null, lValueOf4);
                } catch (Exception unused2) {
                    throw new RuntimeException();
                }
            } else {
                objArr35 = objArr35;
            }
            objArr2 = objArr35;
        }
        int i59 = ((int[]) objArr2[3])[0];
        int i60 = ((int[]) objArr2[0])[0];
        if (i60 == i59) {
            Object[] objArr39 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i61 = ((int[]) objArr2[2])[0];
            int i62 = ((int[]) objArr2[0])[0];
            int i63 = ((int[]) objArr2[3])[0];
            String[] strArr11 = (String[]) objArr2[1];
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i64 = i61 + (-302969273) + (((~(791411707 | startUptimeMillis)) | R.drawable.presence_busy) * (-756)) + (((~startUptimeMillis) | 791411707) * 756);
            int i65 = (i64 << 13) ^ i64;
            int i66 = i65 ^ (i65 >>> 17);
            i3 = 0;
            ((int[]) objArr39[2])[0] = i66 ^ (i66 << 5);
        } else {
            ArrayList arrayList7 = new ArrayList();
            String[] strArr12 = (String[]) objArr2[1];
            if (strArr12 != null) {
                for (String str8 : strArr12) {
                    int i67 = asBinder + 117;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i67 % 128;
                    int i68 = i67 % 2;
                    arrayList7.add(str8);
                }
            }
            int[] iArr6 = new int[i60];
            int i69 = i60 - 1;
            iArr6[i69] = 1;
            Toast.makeText((Context) null, iArr6[((i60 * i69) % 2) - 1], 1).show();
            Object[] objArr40 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i70 = ((int[]) objArr2[2])[0];
            int i71 = ((int[]) objArr2[0])[0];
            int i72 = ((int[]) objArr2[3])[0];
            String[] strArr13 = (String[]) objArr2[1];
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i73 = i70 + ((((~(9466980 | iIdentityHashCode3)) | (-810812589)) * 262) - 1231748273) + (((~((~iIdentityHashCode3) | 9466980)) | (-810812589)) * 262);
            int i74 = (i73 << 13) ^ i73;
            int i75 = i74 ^ (i74 >>> 17);
            i3 = 0;
            ((int[]) objArr40[2])[0] = i75 ^ (i75 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
            char windowTouchSlop2 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
            int iArgb = 1031 - Color.argb(i3, i3, i3, i3);
            int i76 = 16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            byte[] bArr9 = $$a;
            Object[] objArr41 = new Object[1];
            c(bArr9[10], (short) 210, bArr9[7], objArr41);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(windowTouchSlop2, iArgb, i76, 1357589585, false, (String) objArr41[0], null);
        }
        long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).getLong(null);
        long jLongValue7 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
            char bitsPerPixel2 = (char) (ImageFormat.getBitsPerPixel(0) + 1);
            int longPressTimeout2 = 1031 - (ViewConfiguration.getLongPressTimeout() >> 16);
            int capsMode = 15 - TextUtils.getCapsMode("", 0, 0);
            byte[] bArr10 = $$a;
            Object[] objArr42 = new Object[1];
            c(bArr10[10], (short) 121, bArr10[7], objArr42);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(bitsPerPixel2, longPressTimeout2, capsMode, 1344079056, false, (String) objArr42[0], null);
        }
        if (j5 == ((jLongValue7 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                int bitsPerPixel3 = ImageFormat.getBitsPerPixel(0) + 1032;
                int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 16;
                byte b5 = (byte) ($$b & 23);
                Object[] objArr43 = new Object[1];
                c(b5, (short) (b5 | 64), (byte) 52, objArr43);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(cNormalizeMetaState, bitsPerPixel3, iIndexOf4, 632103528, false, (String) objArr43[0], null);
            }
            Object[] objArr44 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).get(null);
            objArr3 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
            int i77 = ((int[]) objArr44[3])[0];
            int i78 = ((int[]) objArr44[1])[0];
            String[] strArr14 = (String[]) objArr44[0];
            int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
            int i79 = ~startUptimeMillis2;
            int i80 = (-308506133) + (((~(345322296 | i79)) | (~((-589602467) | startUptimeMillis2))) * 210) + (((~(startUptimeMillis2 | 934657978)) | (~(i79 | (-266785)))) * 210) + 2107009992;
            int i81 = (i80 << 13) ^ i80;
            int i82 = i81 ^ (i81 >>> 17);
            ((int[]) objArr3[2])[0] = i82 ^ (i82 << 5);
        } else {
            int iIntValue = ((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr45 = {727417497};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b((char) (46038 - (ViewConfiguration.getPressedStateDuration() >> 16)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1133, 19 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr46 = {Integer.valueOf(iIntValue), 0, 2107009992, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).newInstance(objArr45), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
                    char cIndexOf2 = (char) TextUtils.indexOf("", "");
                    int iIndexOf5 = 1030 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    int iRed = Color.red(0) + 15;
                    byte[] bArr11 = $$a;
                    Object[] objArr47 = new Object[1];
                    c(bArr11[10], (short) 210, bArr11[7], objArr47);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(cIndexOf2, iIndexOf5, iRed, 1298546779, false, (String) objArr47[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), Gravity.getAbsoluteGravity(0, 0) + 1117, 16 - TextUtils.lastIndexOf("", '0', 0, 0)), Boolean.TYPE});
                }
                objArr3 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).invoke(null, objArr46);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
                    char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                    int i83 = 1032 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    int i84 = 15 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    byte b6 = (byte) ($$b & 23);
                    Object[] objArr48 = new Object[1];
                    c(b6, (short) (b6 | 64), (byte) 52, objArr48);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(offsetBefore, i83, i84, 632103528, false, (String) objArr48[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).set(null, objArr3);
                try {
                    long jLongValue8 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf5 = Long.valueOf(jLongValue8);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
                        char offsetBefore2 = (char) TextUtils.getOffsetBefore("", 0);
                        int doubleTapTimeout = 1031 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int scrollDefaultDelay = 15 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        byte[] bArr12 = $$a;
                        Object[] objArr49 = new Object[1];
                        c(bArr12[10], (short) 121, bArr12[7], objArr49);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(offsetBefore2, doubleTapTimeout, scrollDefaultDelay, 1344079056, false, (String) objArr49[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).set(null, lValueOf5);
                    Long lValueOf6 = Long.valueOf(jLongValue8 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
                        char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                        int deadChar = KeyEvent.getDeadChar(0, 0) + 1031;
                        int iRgb = Color.rgb(0, 0, 0) + 16777231;
                        byte[] bArr13 = $$a;
                        Object[] objArr50 = new Object[1];
                        c(bArr13[10], (short) 210, bArr13[7], objArr50);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(edgeSlop, deadChar, iRgb, 1357589585, false, (String) objArr50[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).set(null, lValueOf6);
                } catch (Exception unused3) {
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
        int i85 = ((int[]) objArr3[1])[0];
        int i86 = ((int[]) objArr3[3])[0];
        if (i86 == i85) {
            int i87 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 47;
            asBinder = i87 % 128;
            int i88 = i87 % 2;
            Object[] objArr51 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i89 = ((int[]) objArr3[2])[0];
            int i90 = ((int[]) objArr3[3])[0];
            int i91 = ((int[]) objArr3[1])[0];
            String[] strArr15 = (String[]) objArr3[0];
            int iIdentityHashCode4 = System.identityHashCode(this);
            int i92 = i89 + (-264229433) + (((-244354091) | (~iIdentityHashCode4)) * (-490)) + (((~(iIdentityHashCode4 | 543499220)) | (-787853311)) * 490) + 535155050;
            int i93 = (i92 << 13) ^ i92;
            int i94 = i93 ^ (i93 >>> 17);
            i4 = 0;
            ((int[]) objArr51[2])[0] = i94 ^ (i94 << 5);
        } else {
            ArrayList arrayList8 = new ArrayList();
            String[] strArr16 = (String[]) objArr3[0];
            if (strArr16 != null) {
                for (String str9 : strArr16) {
                    arrayList8.add(str9);
                }
            }
            Toast.makeText((Context) null, i86 / (((i86 - 1) * i86) % 2), 0).show();
            Object[] objArr52 = {strArr, new int[]{i}, new int[1], new int[]{i}};
            int i95 = ((int[]) objArr3[2])[0];
            int i96 = ((int[]) objArr3[3])[0];
            int i97 = ((int[]) objArr3[1])[0];
            String[] strArr17 = (String[]) objArr3[0];
            int iIdentityHashCode5 = System.identityHashCode(this);
            int i98 = ~((-101284302) | iIdentityHashCode5);
            int i99 = ~iIdentityHashCode5;
            int i100 = i98 | (~(142995868 | i99));
            int i101 = ~(101284301 | i99);
            int i102 = i95 + 195948077 + ((i100 | i101) * (-516)) + (((~(iIdentityHashCode5 | (-94605))) | (~((-142901265) | i99))) * 516) + ((142901264 | i101) * 516);
            int i103 = (i102 << 13) ^ i102;
            int i104 = i103 ^ (i103 >>> 17);
            i4 = 0;
            ((int[]) objArr52[2])[0] = i104 ^ (i104 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
            char c4 = (char) (53893 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
            int offsetBefore3 = TextUtils.getOffsetBefore("", i4) + 1320;
            int iAxisFromString = MotionEvent.axisFromString("") + 37;
            byte b7 = (byte) ($$b & 23);
            Object[] objArr53 = new Object[1];
            c(b7, (short) (b7 | 64), (byte) 52, objArr53);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(c4, offsetBefore3, iAxisFromString, -1433084963, false, (String) objArr53[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
                char cAxisFromString = (char) (53892 - MotionEvent.axisFromString(""));
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1320;
                int iAxisFromString2 = MotionEvent.axisFromString("") + 37;
                byte[] bArr14 = $$a;
                Object[] objArr54 = new Object[1];
                c(bArr14[10], (short) 121, bArr14[7], objArr54);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(cAxisFromString, jumpTapTimeout, iAxisFromString2, -1920778747, false, (String) objArr54[0], null);
            }
            Object[] objArr55 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).get(null);
            objArr4 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
            int i105 = ((int[]) objArr55[0])[0];
            int i106 = ((int[]) objArr55[3])[0];
            String[] strArr18 = (String[]) objArr55[2];
            int iMyTid = Process.myTid();
            int i107 = ~iMyTid;
            int i108 = ((((-830617956) + (((~(i107 | 304094418)) | 1066533406) * (-1042))) + ((304094418 | iMyTid) * 521)) + ((((~(iMyTid | (-1066533407))) | 301989906) | (~(i107 | 1068637918))) * 521)) - 1537552396;
            int i109 = (i108 << 13) ^ i108;
            int i110 = i109 ^ (i109 >>> 17);
            ((int[]) objArr4[1])[0] = i110 ^ (i110 << 5);
            context2 = context;
        } else {
            context2 = context;
            Context applicationContext5 = context2 != null ? ((context2 instanceof ContextWrapper) && ((ContextWrapper) context2).getBaseContext() == null) ? null : context.getApplicationContext() : context2;
            int iIntValue2 = ((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue();
            Object[] objArr56 = {727417497};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b((char) (47977 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 1301 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), Color.argb(0, 0, 0, 0) + 20, -420973425, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr57 = {applicationContext5, "com.bpjstku", -1537552396, Integer.valueOf(iIntValue2), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).newInstance(objArr56), false};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                char maximumFlingVelocity2 = (char) (53893 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                int iIndexOf6 = TextUtils.indexOf("", "", 0) + 1320;
                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 36;
                byte[] bArr15 = $$a;
                Object[] objArr58 = new Object[1];
                c(bArr15[10], (short) 121, bArr15[7], objArr58);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(maximumFlingVelocity2, iIndexOf6, tapTimeout, 819724799, false, (String) objArr58[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 57879), 1394 - ((Process.getThreadPriority(0) + 20) >> 6), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 75), Boolean.TYPE});
            }
            Object[] objArr59 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).invoke(null, objArr57);
            if (applicationContext5 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
                    char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 53893);
                    int scrollBarSize = 1320 - (ViewConfiguration.getScrollBarSize() >> 8);
                    int iAxisFromString3 = MotionEvent.axisFromString("") + 37;
                    byte[] bArr16 = $$a;
                    Object[] objArr60 = new Object[1];
                    c(bArr16[10], (short) 121, bArr16[7], objArr60);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(maximumDrawingCacheSize, scrollBarSize, iAxisFromString3, -1920778747, false, (String) objArr60[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).set(null, objArr59);
                try {
                    long jLongValue9 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf7 = Long.valueOf(jLongValue9);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
                        char maximumFlingVelocity3 = (char) (53893 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                        int deadChar2 = 1320 - KeyEvent.getDeadChar(0, 0);
                        int iIndexOf7 = TextUtils.indexOf("", "") + 36;
                        Object[] objArr61 = new Object[1];
                        c($$a[10], (short) 158, (byte) 15, objArr61);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(maximumFlingVelocity3, deadChar2, iIndexOf7, -1273706634, false, (String) objArr61[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).set(null, lValueOf7);
                    Long lValueOf8 = Long.valueOf(jLongValue9 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                        char c5 = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 53893);
                        int iAxisFromString4 = MotionEvent.axisFromString("") + 1321;
                        int fadingEdgeLength = 36 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        byte b8 = (byte) ($$b & 23);
                        Object[] objArr62 = new Object[1];
                        c(b8, (short) (b8 | 64), (byte) 52, objArr62);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(c5, iAxisFromString4, fadingEdgeLength, -1433084963, false, (String) objArr62[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).set(null, lValueOf8);
                } catch (Exception unused4) {
                    throw new RuntimeException();
                }
            } else {
                objArr59 = objArr59;
            }
            objArr4 = objArr59;
        }
        int i111 = ((int[]) objArr4[3])[0];
        int i112 = ((int[]) objArr4[0])[0];
        if (i112 == i111) {
            Object[] objArr63 = {new int[]{i}, new int[1], strArr, new int[]{i}};
            int i113 = ((int[]) objArr4[1])[0];
            int i114 = ((int[]) objArr4[0])[0];
            int i115 = ((int[]) objArr4[3])[0];
            String[] strArr19 = (String[]) objArr4[2];
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            int i116 = ~iMaxMemory;
            int i117 = 539248048 + (((~((-617458069) | i116)) | 616833300 | (~((-753169757) | i116)) | (~(753794524 | iMaxMemory))) * (-84));
            int i118 = (~(iMaxMemory | (-753169757))) | 617458068;
            int i119 = ~(i116 | 753169756);
            int i120 = i113 + i117 + ((i118 | i119) * (-84)) + (((-753794525) | i119) * 84);
            int i121 = (i120 << 13) ^ i120;
            int i122 = i121 ^ (i121 >>> 17);
            ((int[]) objArr63[1])[0] = i122 ^ (i122 << 5);
        } else {
            Toast.makeText((Context) null, i112 / (((i112 - 1) * i112) % 2), 0).show();
            Object[] objArr64 = {new int[]{i}, new int[1], strArr, new int[]{i}};
            int i123 = ((int[]) objArr4[1])[0];
            int i124 = ((int[]) objArr4[0])[0];
            int i125 = ((int[]) objArr4[3])[0];
            String[] strArr20 = (String[]) objArr4[2];
            int iIdentityHashCode6 = System.identityHashCode(this);
            int i126 = i123 + 931756946 + (((~((~iIdentityHashCode6) | (-38207611))) | 1332420214) * (-235)) + (((~((-38207611) | iIdentityHashCode6)) | 1332420214) * (-470)) + (((~(iIdentityHashCode6 | (-262153))) | 1294474756) * 235);
            int i127 = i126 ^ (i126 << 13);
            int i128 = i127 ^ (i127 >>> 17);
            ((int[]) objArr64[1])[0] = i128 ^ (i128 << 5);
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
            char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
            int i129 = 876 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int gidForName = Process.getGidForName("") + 11;
            Object[] objArr65 = new Object[1];
            c($$a[10], (short) 158, (byte) 15, objArr65);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(pressedStateDuration, i129, gidForName, -1650998592, false, (String) objArr65[0], null);
        }
        long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).getLong(null);
        long jLongValue10 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
            char c6 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
            int offsetBefore4 = TextUtils.getOffsetBefore("", 0) + 876;
            int iBlue2 = Color.blue(0) + 10;
            byte[] bArr17 = $$a;
            Object[] objArr66 = new Object[1];
            c(bArr17[10], (short) 121, bArr17[7], objArr66);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(c6, offsetBefore4, iBlue2, 2012020043, false, (String) objArr66[0], null);
        }
        if (j6 != ((jLongValue10 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).getLong(null) << 52) >>> 52)) >> 12)) {
            Context applicationContext6 = context2 != null ? ((context2 instanceof ContextWrapper) && ((ContextWrapper) context2).getBaseContext() == null) ? null : context.getApplicationContext() : context2;
            Object[] objArr67 = {applicationContext6, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), 0, -1100025489};
            byte[] bArr18 = $$d;
            Object[] objArr68 = new Object[1];
            d(bArr18[204], (short) 261, (byte) 23, objArr68);
            Class<?> cls3 = Class.forName((String) objArr68[0]);
            byte b9 = bArr18[99];
            Object[] objArr69 = new Object[1];
            d(b9, (short) (b9 | 238), (byte) (-bArr18[316]), objArr69);
            objArr5 = (Object[]) cls3.getMethod((String) objArr69[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr67);
            if (applicationContext6 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                    char doubleTapTimeout2 = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int modifierMetaStateMask2 = 875 - ((byte) KeyEvent.getModifierMetaStateMask());
                    int windowTouchSlop3 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 10;
                    byte[] bArr19 = $$a;
                    Object[] objArr70 = new Object[1];
                    c(bArr19[10], (short) 210, bArr19[7], objArr70);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(doubleTapTimeout2, modifierMetaStateMask2, windowTouchSlop3, 2012931276, false, (String) objArr70[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).set(null, objArr5);
                try {
                    long jLongValue11 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf9 = Long.valueOf(jLongValue11);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault71 == null) {
                        char keyRepeatTimeout3 = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int windowTouchSlop4 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 876;
                        int modifierMetaStateMask3 = 9 - ((byte) KeyEvent.getModifierMetaStateMask());
                        byte[] bArr20 = $$a;
                        Object[] objArr71 = new Object[1];
                        c(bArr20[10], (short) 121, bArr20[7], objArr71);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.b(keyRepeatTimeout3, windowTouchSlop4, modifierMetaStateMask3, 2012020043, false, (String) objArr71[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault71).set(null, lValueOf9);
                    Long lValueOf10 = Long.valueOf(jLongValue11 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault72 == null) {
                        char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                        int pressedStateDuration2 = 876 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        str = r3;
                        int iIndexOf8 = 9 - TextUtils.indexOf((CharSequence) str, '0', 0, 0);
                        Object[] objArr72 = new Object[1];
                        c($$a[10], (short) 158, (byte) 15, objArr72);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.b(packedPositionGroup, pressedStateDuration2, iIndexOf8, -1650998592, false, (String) objArr72[0], null);
                    } else {
                        str = r3;
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault72).set(null, lValueOf10);
                } catch (Exception unused5) {
                    throw new RuntimeException();
                }
            }
            i5 = ((int[]) objArr5[2])[0];
            i6 = ((int[]) objArr5[0])[0];
            if (i6 == i5) {
                throw new RuntimeException(String.valueOf(i6));
            }
            int i130 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
            asBinder = i130 % 128;
            int i131 = i130 % 2;
            int i132 = ((int[]) objArr5[1])[0];
            Object[] objArr73 = {new int[]{((int[]) objArr5[0])[0]}, new int[1], new int[]{((int[]) objArr5[2])[0]}, (String[]) objArr5[3]};
            int iIdentityHashCode7 = System.identityHashCode(this);
            int i133 = 1517666874 + (((~((~iIdentityHashCode7) | 336204686)) | (-377175024)) * (-245));
            int i134 = ~(iIdentityHashCode7 | 336204686);
            int i135 = i132 + i133 + (i134 * (-245)) + ((i134 | 376514915) * 245);
            int i136 = i135 ^ (i135 << 13);
            int i137 = i136 ^ (i136 >>> 17);
            ((int[]) objArr73[1])[0] = i137 ^ (i137 << 5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cAxisFromString2 = (char) ((-1) - MotionEvent.axisFromString(str));
                int packedPositionType = 876 - ExpandableListView.getPackedPositionType(0L);
                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 10;
                Object[] objArr74 = new Object[1];
                c($$a[1], (short) ($$b & TypedValues.PositionType.TYPE_PERCENT_WIDTH), (byte) 42, objArr74);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAxisFromString2, packedPositionType, iResolveSizeAndState, -1199417970, false, (String) objArr74[0], null);
            }
            j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            jLongValue = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char bitsPerPixel4 = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                int packedPositionGroup2 = 876 - ExpandableListView.getPackedPositionGroup(0L);
                int i138 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 10;
                byte b10 = (byte) (-$$a[14]);
                Object[] objArr75 = new Object[1];
                c(b10, (short) (b10 | 56), (byte) 52, objArr75);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(bitsPerPixel4, packedPositionGroup2, i138, 254769921, false, (String) objArr75[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                    char c7 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                    int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 876;
                    int mode = 10 - View.MeasureSpec.getMode(0);
                    byte[] bArr21 = $$a;
                    Object[] objArr76 = new Object[1];
                    c(bArr21[1], (short) 59, (byte) (-bArr21[44]), objArr76);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(c7, packedPositionType2, mode, 1324201839, false, (String) objArr76[0], null);
                }
                Object[] objArr77 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).get(null);
                objArr6 = new Object[]{new int[]{((int[]) objArr77[0])[0]}, new int[1], new int[]{((int[]) objArr77[2])[0]}, (String[]) objArr77[3]};
                int iIdentityHashCode8 = System.identityHashCode(this);
                int i139 = ~iIdentityHashCode8;
                int i140 = 1854270488 + (((~(656522005 | i139)) | 696832234) * (-90)) + (((~(656522005 | iIdentityHashCode8)) | 102837013) * (-45)) + (((~(iIdentityHashCode8 | (-696832235))) | 656522005 | (~(i139 | 696832234))) * 45) + 1981834097;
                int i141 = (i140 << 13) ^ i140;
                int i142 = i141 ^ (i141 >>> 17);
                ((int[]) objArr6[1])[0] = i142 ^ (i142 << 5);
            } else {
                Object[] objArr78 = {Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), 1981834097};
                byte[] bArr22 = $$d;
                Object[] objArr79 = new Object[1];
                d(bArr22[54], (short) 186, (byte) (-bArr22[19]), objArr79);
                Class<?> cls4 = Class.forName((String) objArr79[0]);
                byte b11 = bArr22[99];
                Object[] objArr80 = new Object[1];
                d(b11, (short) (b11 | 313), (byte) (-bArr22[316]), objArr80);
                objArr6 = (Object[]) cls4.getMethod((String) objArr80[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr78);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char packedPositionGroup3 = (char) ExpandableListView.getPackedPositionGroup(0L);
                    int iKeyCodeFromString = 876 - KeyEvent.keyCodeFromString(str);
                    int tapTimeout2 = 10 - (ViewConfiguration.getTapTimeout() >> 16);
                    byte[] bArr23 = $$a;
                    Object[] objArr81 = new Object[1];
                    c(bArr23[1], (short) 59, (byte) (-bArr23[44]), objArr81);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionGroup3, iKeyCodeFromString, tapTimeout2, 1324201839, false, (String) objArr81[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArr6);
                try {
                    long jLongValue12 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf11 = Long.valueOf(jLongValue12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char bitsPerPixel5 = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                        int iRed2 = Color.red(0) + 876;
                        int i143 = 10 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        byte b12 = (byte) (-$$a[14]);
                        Object[] objArr82 = new Object[1];
                        c(b12, (short) (b12 | 56), (byte) 52, objArr82);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(bitsPerPixel5, iRed2, i143, 254769921, false, (String) objArr82[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf11);
                    Long lValueOf12 = Long.valueOf(jLongValue12 >> 12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf(str, '0', 0, 0));
                        int iKeyCodeFromString2 = 876 - KeyEvent.keyCodeFromString(str);
                        int scrollDefaultDelay2 = 10 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        Object[] objArr83 = new Object[1];
                        c($$a[1], (short) ($$b & TypedValues.PositionType.TYPE_PERCENT_WIDTH), (byte) 42, objArr83);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf, iKeyCodeFromString2, scrollDefaultDelay2, -1199417970, false, (String) objArr83[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf12);
                } catch (Exception unused6) {
                    throw new RuntimeException();
                }
            }
            if (((int[]) objArr6[0])[0] == ((int[]) objArr6[2])[0]) {
                arrayList = new ArrayList();
                strArr = (String[]) objArr6[3];
                if (strArr != null) {
                    for (String str10 : strArr) {
                        arrayList.add(str10);
                    }
                }
                throw null;
            }
            int i144 = ((int[]) objArr6[1])[0];
            Object[] objArr84 = {new int[]{((int[]) objArr6[0])[0]}, new int[1], new int[]{((int[]) objArr6[2])[0]}, (String[]) objArr6[3]};
            int iIdentityHashCode9 = System.identityHashCode(this);
            int i145 = ~iIdentityHashCode9;
            int i146 = i144 + 779228146 + (((~(i145 | (-671228736))) | 131627 | (~((-40441857) | iIdentityHashCode9))) * 717) + (((~(iIdentityHashCode9 | (-671228736))) | (~(i145 | (-40441857))) | 131627) * 717);
            int i147 = (i146 << 13) ^ i146;
            int i148 = i147 ^ (i147 >>> 17);
            ((int[]) objArr84[1])[0] = i148 ^ (i148 << 5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                int windowTouchSlop5 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 876;
                int iMakeMeasureSpec2 = 10 - View.MeasureSpec.makeMeasureSpec(0, 0);
                byte b13 = (byte) ($$b & 23);
                Object[] objArr85 = new Object[1];
                c(b13, (short) (b13 | 64), (byte) 52, objArr85);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cCombineMeasuredStates, windowTouchSlop5, iMakeMeasureSpec2, 252381699, false, (String) objArr85[0], null);
            }
            j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).getLong(null);
            jLongValue2 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char packedPositionGroup4 = (char) ExpandableListView.getPackedPositionGroup(0L);
                int i149 = 877 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                int iIndexOf9 = 9 - TextUtils.indexOf((CharSequence) str, '0');
                byte[] bArr24 = $$a;
                Object[] objArr86 = new Object[1];
                c(bArr24[10], (short) 52, bArr24[7], objArr86);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(packedPositionGroup4, i149, iIndexOf9, 2009631821, false, (String) objArr86[0], null);
            }
            if (j2 == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null) << 52) >>> 52)) >> 12)) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                    char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                    int i150 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 876;
                    int absoluteGravity = 10 - Gravity.getAbsoluteGravity(0, 0);
                    byte b14 = $$a[7];
                    short s = b14;
                    Object[] objArr87 = new Object[1];
                    c(b14, s, (byte) (s | 52), objArr87);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(cResolveSizeAndState, i150, absoluteGravity, 256017550, false, (String) objArr87[0], null);
                }
                Object[] objArr88 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).get(null);
                objArr8 = new Object[]{new int[]{((int[]) objArr88[0])[0]}, new int[1], new int[]{((int[]) objArr88[2])[0]}, (String[]) objArr88[3]};
                int i151 = ~((~System.identityHashCode(this)) | 419170880);
                int i152 = ((((278134848 | i151) * (-374)) - 224340140) + ((i151 | 141036032) * 374)) - 1630363814;
                int i153 = (i152 << 13) ^ i152;
                int i154 = i153 ^ (i153 >>> 17);
                ((int[]) objArr8[1])[0] = i154 ^ (i154 << 5);
                context3 = context;
            } else {
                context3 = context;
                if (context3 != null) {
                    applicationContext2 = context3;
                } else if ((context3 instanceof ContextWrapper) || ((ContextWrapper) context3).getBaseContext() != null) {
                    applicationContext2 = context.getApplicationContext();
                } else {
                    applicationContext2 = null;
                }
                Object[] objArr89 = {applicationContext2, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), -1630363814};
                byte[] bArr25 = $$d;
                Object[] objArr90 = new Object[1];
                d(bArr25[54], (short) 138, (byte) 113, objArr90);
                Class<?> cls5 = Class.forName((String) objArr90[0]);
                Object[] objArr91 = new Object[1];
                d(bArr25[4], (short) 25, bArr25[99], objArr91);
                objArr7 = (Object[]) cls5.getMethod((String) objArr91[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr89);
                if (applicationContext2 != null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char c8 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int iLastIndexOf2 = TextUtils.lastIndexOf(str, '0', 0) + 877;
                        int pressedStateDuration3 = (ViewConfiguration.getPressedStateDuration() >> 16) + 10;
                        byte b15 = $$a[7];
                        short s2 = b15;
                        Object[] objArr92 = new Object[1];
                        c(b15, s2, (byte) (s2 | 52), objArr92);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c8, iLastIndexOf2, pressedStateDuration3, 256017550, false, (String) objArr92[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, objArr7);
                    try {
                        long jLongValue13 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf13 = Long.valueOf(jLongValue13);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                            char packedPositionType3 = (char) ExpandableListView.getPackedPositionType(0L);
                            int i155 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 875;
                            int i156 = 10 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            byte[] bArr26 = $$a;
                            Object[] objArr93 = new Object[1];
                            c(bArr26[10], (short) 52, bArr26[7], objArr93);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(packedPositionType3, i155, i156, 2009631821, false, (String) objArr93[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).set(null, lValueOf13);
                        Long lValueOf14 = Long.valueOf(jLongValue13 >> 12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                            char cResolveSize = (char) View.resolveSize(0, 0);
                            int bitsPerPixel6 = 875 - ImageFormat.getBitsPerPixel(0);
                            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0) + 10;
                            byte b16 = (byte) ($$b & 23);
                            Object[] objArr94 = new Object[1];
                            c(b16, (short) (b16 | 64), (byte) 52, objArr94);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cResolveSize, bitsPerPixel6, iMakeMeasureSpec3, 252381699, false, (String) objArr94[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, lValueOf14);
                    } catch (Exception unused7) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr7 = objArr7;
                }
                objArr8 = objArr7;
            }
            i8 = ((int[]) objArr8[2])[0];
            i9 = ((int[]) objArr8[0])[0];
            if (i9 == i8) {
                int i157 = ((int[]) objArr8[1])[0];
                Object[] objArr95 = {new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
                int iMyPid = Process.myPid();
                int i158 = ~iMyPid;
                int i159 = i157 + 2070192700 + (((~(464928284 | i158)) | (~((-505238514) | iMyPid))) * (-370)) + (((~(iMyPid | 464928284)) | (~(i158 | (-505238514))) | 27405324) * (-370)) + 1550035288;
                int i160 = (i159 << 13) ^ i159;
                int i161 = i160 ^ (i160 >>> 17);
                ((int[]) objArr95[1])[0] = i161 ^ (i161 << 5);
                i10 = 0;
            } else {
                Toast.makeText((Context) null, i9 / (((i9 - 1) * i9) % 2), 0).show();
                int i162 = ((int[]) objArr8[1])[0];
                Object[] objArr96 = {new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
                int i163 = ~((int) Process.getStartElapsedRealtime());
                int i164 = i162 + (-942559356) + (((~((-100929589) | i163)) | 141239817) * (-828)) + ((i163 | (-100929589)) * (-828)) + 1965320240;
                int i165 = i164 ^ (i164 << 13);
                int i166 = i165 ^ (i165 >>> 17);
                i10 = 0;
                ((int[]) objArr96[1])[0] = i166 ^ (i166 << 5);
            }
            objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char c9 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int mode2 = View.MeasureSpec.getMode(i10) + 651;
                int iGreen2 = 44 - Color.green(i10);
                byte[] bArr27 = $$a;
                Object[] objArr97 = new Object[1];
                c(bArr27[10], (short) 52, bArr27[7], objArr97);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(c9, mode2, iGreen2, -459846511, false, (String) objArr97[0], null);
            }
            j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).getLong(null);
            jLongValue3 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char tapTimeout3 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                int deadChar3 = KeyEvent.getDeadChar(0, 0) + 651;
                int windowTouchSlop6 = 44 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                byte b17 = (byte) ($$b & 23);
                Object[] objArr98 = new Object[1];
                c(b17, (short) (b17 | 64), (byte) 52, objArr98);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(tapTimeout3, deadChar3, windowTouchSlop6, -873460649, false, (String) objArr98[0], null);
            }
            if (j3 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).getLong(null) << 52) >>> 52)) >> 12)) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
                    char cMyPid = (char) (Process.myPid() >> 22);
                    int defaultSize = View.getDefaultSize(0, 0) + 651;
                    int iLastIndexOf3 = TextUtils.lastIndexOf(str, '0', 0, 0) + 45;
                    Object[] objArr99 = new Object[1];
                    c($$a[10], (short) 158, (byte) 15, objArr99);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(cMyPid, defaultSize, iLastIndexOf3, -1595579076, false, (String) objArr99[0], null);
                }
                Object[] objArr100 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).get(null);
                objArr9 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i167 = ((int[]) objArr100[2])[0];
                int i168 = ((int[]) objArr100[0])[0];
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i169 = ~iUptimeMillis;
                int i170 = ~((-676254551) | i169);
                int i171 = ~(672823740 | iUptimeMillis);
                int i172 = ((((-1969284366) + ((i170 | i171) * 1150)) + (((~((-672823741) | i169)) | i171) * (-575))) + (((~(iUptimeMillis | (-676254551))) | (~(i169 | 676254550))) * 575)) - 592086991;
                int i173 = (i172 << 13) ^ i172;
                int i174 = i173 ^ (i173 >>> 17);
                ((int[]) objArr9[3])[0] = i174 ^ (i174 << 5);
                i11 = 0;
            } else {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b((char) View.MeasureSpec.makeMeasureSpec(0, 0), (Process.myPid() >> 22) + 1610, (ViewConfiguration.getScrollBarSize() >> 8) + 26, 2145681644, false, null, new Class[0]);
                }
                Object[] objArr101 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).newInstance(null), -592086991, 0};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char offsetBefore5 = (char) TextUtils.getOffsetBefore(str, 0);
                    int minimumFlingVelocity3 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 651;
                    int iAxisFromString5 = MotionEvent.axisFromString(str) + 45;
                    byte b18 = (byte) ($$b & 23);
                    Object[] objArr102 = new Object[1];
                    c(b18, (short) (b18 | 64), (byte) 52, objArr102);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(offsetBefore5, minimumFlingVelocity3, iAxisFromString5, 2075921419, false, (String) objArr102[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 695 - (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.lastIndexOf(str, '0') + 99), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - (ViewConfiguration.getLongPressTimeout() >> 16)), AndroidCharacter.getMirror('0') + 745, 83 - TextUtils.getTrimmedLength(str)), Integer.TYPE, Integer.TYPE});
                }
                objArr9 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).invoke(null, objArr101);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char c10 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                    int bitsPerPixel7 = ImageFormat.getBitsPerPixel(0) + 652;
                    int keyRepeatDelay3 = 44 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    Object[] objArr103 = new Object[1];
                    c($$a[10], (short) 158, (byte) 15, objArr103);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(c10, bitsPerPixel7, keyRepeatDelay3, -1595579076, false, (String) objArr103[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, objArr9);
                try {
                    long jLongValue14 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf15 = Long.valueOf(jLongValue14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                        char cGreen = (char) Color.green(0);
                        int i175 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 650;
                        int iGreen3 = Color.green(0) + 44;
                        byte b19 = (byte) ($$b & 23);
                        Object[] objArr104 = new Object[1];
                        c(b19, (short) (b19 | 64), (byte) 52, objArr104);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(cGreen, i175, iGreen3, -873460649, false, (String) objArr104[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).set(null, lValueOf15);
                    Long lValueOf16 = Long.valueOf(jLongValue14 >> 12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                        char c11 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                        int fadingEdgeLength2 = 651 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int i176 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 44;
                        byte[] bArr28 = $$a;
                        Object[] objArr105 = new Object[1];
                        c(bArr28[10], (short) 52, bArr28[7], objArr105);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(c11, fadingEdgeLength2, i176, -459846511, false, (String) objArr105[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).set(null, lValueOf16);
                    i11 = 0;
                } catch (Exception unused8) {
                    throw new RuntimeException();
                }
            }
            i12 = ((int[]) objArr9[i11])[i11];
            i13 = ((int[]) objArr9[2])[i11];
            if (i13 == i12) {
                arrayList2 = new ArrayList();
                strArr2 = (String[]) objArr9[1];
                if (strArr2 != null) {
                    for (i14 = i11; i14 < strArr2.length; i14++) {
                        arrayList2.add(strArr2[i14]);
                    }
                }
                throw new RuntimeException(String.valueOf(i13));
            }
            Object[] objArr106 = new Object[4];
            int[] iArr7 = new int[1];
            objArr106[i11] = iArr7;
            int[] iArr8 = new int[1];
            objArr106[2] = iArr8;
            objArr106[3] = new int[1];
            int i177 = ((int[]) objArr9[3])[i11];
            int i178 = ((int[]) objArr9[2])[i11];
            int i179 = ((int[]) objArr9[i11])[i11];
            iArr8[i11] = i178;
            iArr7[i11] = i179;
            objArr106[1] = new String[i11];
            int iIdentityHashCode10 = System.identityHashCode(this);
            int i180 = ~iIdentityHashCode10;
            int i181 = i177 + 157817214 + (((~(152048986 | i180)) | 155479796) * (-90)) + (((~(152048986 | iIdentityHashCode10)) | 1052938) * (-45)) + (((~(iIdentityHashCode10 | (-155479797))) | 152048986 | (~(i180 | 155479796))) * 45);
            int i182 = (i181 << 13) ^ i181;
            int i183 = i182 ^ (i182 >>> 17);
            ((int[]) objArr106[3])[0] = i183 ^ (i183 << 5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                char bitsPerPixel8 = (char) (ImageFormat.getBitsPerPixel(0) + 31534);
                int i184 = 922 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                int scrollBarSize2 = 28 - (ViewConfiguration.getScrollBarSize() >> 8);
                byte b20 = (byte) ($$b & 23);
                Object[] objArr107 = new Object[1];
                c(b20, (short) (b20 | 64), (byte) 52, objArr107);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(bitsPerPixel8, i184, scrollBarSize2, -1048449946, false, (String) objArr107[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).getLong(null) != -1) {
                int i185 = asBinder + 73;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i185 % 128;
                int i186 = i185 % 2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                    char touchSlop2 = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 31533);
                    int packedPositionType4 = ExpandableListView.getPackedPositionType(0L) + 921;
                    int iLastIndexOf4 = 27 - TextUtils.lastIndexOf(str, '0', 0);
                    Object[] objArr108 = new Object[1];
                    c($$a[10], (short) 158, (byte) 15, objArr108);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(touchSlop2, packedPositionType4, iLastIndexOf4, -1142834547, false, (String) objArr108[0], null);
                }
                Object[] objArr109 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).get(null);
                objArr10 = new Object[]{new int[1], new int[]{((int[]) objArr109[1])[0]}, (Object[]) objArr109[2], new int[]{((int[]) objArr109[3])[0]}, (String[]) objArr109[4]};
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i187 = ~elapsedCpuTime;
                int i188 = ((((((~((-1078745259) | i187)) | (~((-695334386) | elapsedCpuTime))) | (~(i187 | 695334385))) * 959) + 2026916602) + (((~(elapsedCpuTime | 695334385)) | ((~(i187 | (-695334386))) | (~((-1078745259) | elapsedCpuTime)))) * 959)) - 112732250;
                int i189 = (i188 << 13) ^ i188;
                int i190 = i189 ^ (i189 >>> 17);
                ((int[]) objArr10[0])[0] = i190 ^ (i190 << 5);
                str2 = str6;
            } else {
                if (context3 != null) {
                    applicationContext3 = context3;
                } else if (context3 instanceof ContextWrapper) {
                    int i191 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
                    asBinder = i191 % 128;
                    int i192 = i191 % 2;
                    if (((ContextWrapper) context3).getBaseContext() != null) {
                        applicationContext3 = context.getApplicationContext();
                    } else {
                        applicationContext3 = null;
                    }
                } else {
                    applicationContext3 = context.getApplicationContext();
                }
                str2 = str6;
                Object[] objArr110 = {applicationContext3, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str2, Object.class).invoke(null, this)).intValue()), 0, -112732250};
                byte[] bArr29 = $$d;
                byte b21 = bArr29[204];
                short s3 = (short) (b21 & 121);
                Object[] objArr111 = new Object[1];
                d(b21, s3, (byte) s3, objArr111);
                Class<?> cls6 = Class.forName((String) objArr111[0]);
                byte b22 = bArr29[99];
                Object[] objArr112 = new Object[1];
                d(b22, (short) (b22 | 238), (byte) (-bArr29[316]), objArr112);
                objArr10 = (Object[]) cls6.getMethod((String) objArr112[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr110);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                    char jumpTapTimeout2 = (char) (31533 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                    int iLastIndexOf5 = TextUtils.lastIndexOf(str, '0', 0) + 922;
                    int touchSlop3 = (ViewConfiguration.getTouchSlop() >> 8) + 28;
                    Object[] objArr113 = new Object[1];
                    c($$a[10], (short) 158, (byte) 15, objArr113);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(jumpTapTimeout2, iLastIndexOf5, touchSlop3, -1142834547, false, (String) objArr113[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).set(null, objArr10);
                try {
                    long jLongValue15 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf17 = Long.valueOf(jLongValue15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                        char edgeSlop2 = (char) (31533 - (ViewConfiguration.getEdgeSlop() >> 16));
                        int iRgb2 = (-16776295) - Color.rgb(0, 0, 0);
                        int i193 = 28 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        byte[] bArr30 = $$a;
                        Object[] objArr114 = new Object[1];
                        c(bArr30[10], (short) 121, bArr30[7], objArr114);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(edgeSlop2, iRgb2, i193, -778300370, false, (String) objArr114[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).set(null, lValueOf17);
                    Long lValueOf18 = Long.valueOf(jLongValue15 >> 12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                        char absoluteGravity2 = (char) (Gravity.getAbsoluteGravity(0, 0) + 31533);
                        int bitsPerPixel9 = ImageFormat.getBitsPerPixel(0) + 922;
                        int i194 = 29 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        byte b23 = (byte) ($$b & 23);
                        Object[] objArr115 = new Object[1];
                        c(b23, (short) (b23 | 64), (byte) 52, objArr115);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(absoluteGravity2, bitsPerPixel9, i194, -1048449946, false, (String) objArr115[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).set(null, lValueOf18);
                } catch (Exception unused9) {
                    throw new RuntimeException();
                }
            }
            i15 = ((int[]) objArr10[1])[0];
            i16 = ((int[]) objArr10[3])[0];
            if (i16 == i15) {
                int i195 = ((int[]) objArr10[0])[0];
                Object[] objArr116 = {new int[1], new int[]{((int[]) objArr10[1])[0]}, (Object[]) objArr10[2], new int[]{((int[]) objArr10[3])[0]}, (String[]) objArr10[4]};
                int iIdentityHashCode11 = System.identityHashCode(this);
                int i196 = (-365174791) + (((~((-161095239) | iIdentityHashCode11)) | (-1612984406)) * (-318));
                int i197 = ~((-1612984406) | iIdentityHashCode11);
                int i198 = ~iIdentityHashCode11;
                int i199 = i195 + i196 + ((i197 | (~(1774075479 | i198))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iIdentityHashCode11 | 1774075479)) | (~((-1612980242) | i198))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
                int i200 = (i199 << 13) ^ i199;
                int i201 = i200 ^ (i200 >>> 17);
                i17 = 0;
                ((int[]) objArr116[0])[0] = i201 ^ (i201 << 5);
            } else {
                arrayList3 = new ArrayList();
                strArr3 = (String[]) objArr10[4];
                if (strArr3 != null) {
                    for (String str11 : strArr3) {
                        arrayList3.add(str11);
                    }
                }
                Toast.makeText((Context) null, i16 / (((i16 - 1) * i16) % 2), 0).show();
                int i202 = ((int[]) objArr10[0])[0];
                Object[] objArr117 = {new int[1], new int[]{((int[]) objArr10[1])[0]}, (Object[]) objArr10[2], new int[]{((int[]) objArr10[3])[0]}, (String[]) objArr10[4]};
                int iIdentityHashCode12 = System.identityHashCode(this);
                int i203 = i202 + 1438094877 + (((~((-1434270728) | iIdentityHashCode12)) | (-1434271384)) * (-502)) + ((~((~iIdentityHashCode12) | (-1094462468))) * (-502)) + (((~(iIdentityHashCode12 | (-339808917))) | (-1434270728)) * TypedValues.PositionType.TYPE_DRAWPATH);
                int i204 = (i203 << 13) ^ i203;
                int i205 = i204 ^ (i204 >>> 17);
                i17 = 0;
                ((int[]) objArr117[0])[0] = i205 ^ (i205 << 5);
            }
            objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                char cIndexOf3 = (char) (29944 - TextUtils.indexOf(str, str, i17));
                int mode3 = 1755 - View.MeasureSpec.getMode(i17);
                int i206 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 22;
                Object[] objArr118 = new Object[1];
                c($$a[10], (short) 158, (byte) 15, objArr118);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(cIndexOf3, mode3, i206, 986134021, false, (String) objArr118[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).getLong(null) != -1) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                    char c12 = (char) (29944 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    int jumpTapTimeout3 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1755;
                    int iKeyCodeFromString3 = 23 - KeyEvent.keyCodeFromString(str);
                    byte[] bArr31 = $$a;
                    Object[] objArr119 = new Object[1];
                    c(bArr31[10], (short) 121, bArr31[7], objArr119);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(c12, jumpTapTimeout3, iKeyCodeFromString3, 1599039318, false, (String) objArr119[0], null);
                }
                Object[] objArr120 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).get(null);
                objArr11 = new Object[]{new int[]{((int[]) objArr120[0])[0]}, new int[]{((int[]) objArr120[1])[0]}, (Object[]) objArr120[2], new int[1], (String[]) objArr120[4]};
                int iMaxMemory2 = (int) Runtime.getRuntime().maxMemory();
                int i207 = ~iMaxMemory2;
                int i208 = (((586385936 + (((~(449080366 | i207)) | (~((-411304967) | iMaxMemory2))) * (-831))) + ((~(1072987758 | iMaxMemory2)) * (-1662))) + (((~(iMaxMemory2 | (-449080367))) | ((~(i207 | (-661682793))) | (~(661682792 | iMaxMemory2)))) * 831)) - 231237712;
                int i209 = (i208 << 13) ^ i208;
                int i210 = i209 ^ (i209 >>> 17);
                ((int[]) objArr11[3])[0] = i210 ^ (i210 << 5);
            } else {
                int iIntValue3 = ((Integer) Class.forName(str5).getMethod(str2, Object.class).invoke(null, this)).intValue();
                Object[] objArr121 = {727417497};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b((char) (42049 - TextUtils.getTrimmedLength(str)), 1726 - Color.alpha(0), 29 - Color.red(0), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da = com.google.firebase.abt.R.layout.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue3, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).newInstance(objArr121), -231237712);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                    char cBlue = (char) (Color.blue(0) + 29944);
                    int iLastIndexOf6 = 1754 - TextUtils.lastIndexOf(str, '0', 0, 0);
                    int scrollBarFadeDuration = 23 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    byte[] bArr32 = $$a;
                    Object[] objArr122 = new Object[1];
                    c(bArr32[10], (short) 121, bArr32[7], objArr122);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(cBlue, iLastIndexOf6, scrollBarFadeDuration, 1599039318, false, (String) objArr122[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
                try {
                    long jLongValue16 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf19 = Long.valueOf(jLongValue16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                        char cIndexOf4 = (char) (TextUtils.indexOf((CharSequence) str, '0') + 29945);
                        int scrollDefaultDelay3 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1755;
                        int i211 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22;
                        byte[] bArr33 = $$a;
                        Object[] objArr123 = new Object[1];
                        c(bArr33[10], (short) 52, bArr33[7], objArr123);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(cIndexOf4, scrollDefaultDelay3, i211, 1596667560, false, (String) objArr123[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).set(null, lValueOf19);
                    Long lValueOf20 = Long.valueOf(jLongValue16 >> 12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                        char jumpTapTimeout4 = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 29944);
                        int keyRepeatDelay4 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1755;
                        int defaultSize2 = View.getDefaultSize(0, 0) + 23;
                        Object[] objArr124 = new Object[1];
                        c($$a[10], (short) 158, (byte) 15, objArr124);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(jumpTapTimeout4, keyRepeatDelay4, defaultSize2, 986134021, false, (String) objArr124[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).set(null, lValueOf20);
                    objArr11 = objArrTuitionPaymentFragmentbindingInflater1$5f1425da;
                } catch (Exception unused10) {
                    throw new RuntimeException();
                }
            }
            i19 = ((int[]) objArr11[1])[0];
            i20 = ((int[]) objArr11[0])[0];
            if (i20 == i19) {
                int i212 = asBinder + 125;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i212 % 128;
                int i213 = i212 % 2;
                int i214 = ((int[]) objArr11[3])[0];
                Object[] objArr125 = {new int[]{((int[]) objArr11[0])[0]}, new int[]{((int[]) objArr11[1])[0]}, (Object[]) objArr11[2], new int[1], (String[]) objArr11[4]};
                int iIdentityHashCode13 = System.identityHashCode(this);
                int i215 = 261698201 + (((~(342020675 | iIdentityHashCode13)) | (-129418250)) * 672);
                int i216 = ~iIdentityHashCode13;
                int i217 = i214 + i215 + (((~(iIdentityHashCode13 | (-129418250))) | (~((-342020676) | i216))) * (-672)) + (((~(129418249 | i216)) | (-402052684)) * 672);
                int i218 = (i217 << 13) ^ i217;
                int i219 = i218 ^ (i218 >>> 17);
                i21 = 0;
                ((int[]) objArr125[3])[0] = i219 ^ (i219 << 5);
            } else {
                arrayList4 = new ArrayList();
                strArr4 = (String[]) objArr11[4];
                if (strArr4 != null) {
                    for (String str12 : strArr4) {
                        arrayList4.add(str12);
                    }
                }
                int[] iArr9 = new int[i20];
                int i220 = i20 - 1;
                iArr9[i220] = 1;
                Toast.makeText((Context) null, iArr9[((i20 * i220) % 2) - 1], 1).show();
                int i221 = ((int[]) objArr11[3])[0];
                Object[] objArr126 = {new int[]{((int[]) objArr11[0])[0]}, new int[]{((int[]) objArr11[1])[0]}, (Object[]) objArr11[2], new int[1], (String[]) objArr11[4]};
                int iNextInt = new Random().nextInt();
                int i222 = ~iNextInt;
                int i223 = i221 + 1863492881 + ((iNextInt | 33719313) * 988) + (((~(590517397 | i222)) | (-934713056)) * (-1976)) + (((~(iNextInt | 377914971)) | 33719313 | (~((-377914972) | i222))) * 988);
                int i224 = (i223 << 13) ^ i223;
                int i225 = i224 ^ (i224 >>> 17);
                i21 = 0;
                ((int[]) objArr126[3])[0] = i225 ^ (i225 << 5);
            }
            objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                char absoluteGravity3 = (char) (37567 - Gravity.getAbsoluteGravity(i21, i21));
                int iAlpha = Color.alpha(i21) + 625;
                int longPressTimeout3 = (ViewConfiguration.getLongPressTimeout() >> 16) + 14;
                byte b24 = (byte) ($$b & 23);
                Object[] objArr127 = new Object[1];
                c(b24, (short) (b24 | 64), (byte) 52, objArr127);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(absoluteGravity3, iAlpha, longPressTimeout3, -477065106, false, (String) objArr127[0], null);
            }
            j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).getLong(null);
            jLongValue4 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
            objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                char cRgb = (char) ((-16739649) - Color.rgb(0, 0, 0));
                int iRgb3 = Color.rgb(0, 0, 0) + 16777841;
                int minimumFlingVelocity4 = 14 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                byte[] bArr34 = $$a;
                Object[] objArr128 = new Object[1];
                c(bArr34[10], (short) 210, bArr34[7], objArr128);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(cRgb, iRgb3, minimumFlingVelocity4, -976899241, false, (String) objArr128[0], null);
            }
            if (j4 == ((jLongValue4 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).getLong(null) << 52) >>> 52)) >> 12)) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                    char c13 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 37568);
                    int bitsPerPixel10 = 624 - ImageFormat.getBitsPerPixel(0);
                    int iKeyCodeFromString4 = KeyEvent.keyCodeFromString(str) + 14;
                    byte[] bArr35 = $$a;
                    Object[] objArr129 = new Object[1];
                    c(bArr35[10], (short) 121, bArr35[7], objArr129);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(c13, bitsPerPixel10, iKeyCodeFromString4, -973632554, false, (String) objArr129[0], null);
                }
                Object[] objArr130 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).get(null);
                int i226 = ((int[]) objArr130[2])[0];
                int i227 = ((int[]) objArr130[0])[0];
                String[] strArr21 = (String[]) objArr130[3];
                int[] iArr10 = {i226};
                int iIdentityHashCode14 = System.identityHashCode(this);
                int i228 = ~(243421884 | iIdentityHashCode14);
                int i229 = 190433812 + ((1345430592 | i228) * (-814)) + ((i228 | (~((~iIdentityHashCode14) | (-1580316237))) | 8536240) * 407) + (((~(iIdentityHashCode14 | 1580316236)) | (~((-243421885) | iIdentityHashCode14)) | 8536240) * 407) + 818887358;
                int i230 = (i229 << 13) ^ i229;
                int i231 = i230 ^ (i230 >>> 17);
                ((int[]) objArr12[1])[0] = i231 ^ (i231 << 5);
                objArr12 = new Object[]{new int[]{i227}, new int[1], iArr10, strArr21};
            } else {
                if (context3 != null) {
                    applicationContext4 = context3;
                } else if ((context3 instanceof ContextWrapper) || ((ContextWrapper) context3).getBaseContext() != null) {
                    applicationContext4 = context.getApplicationContext();
                } else {
                    applicationContext4 = null;
                }
                int iIntValue4 = ((Integer) Class.forName(str5).getMethod(str2, Object.class).invoke(null, this)).intValue();
                Object[] objArr131 = new Object[1];
                a((Process.myTid() >> 22) + 69, Process.getGidForName(str) + 65, (char) (Color.alpha(0) + 35933), objArr131);
                String str13 = (String) objArr131[0];
                Object[] objArr132 = new Object[1];
                a(133 - Drawable.resolveOpacity(0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 63, (char) (16911 - Color.argb(0, 0, 0, 0)), objArr132);
                Object[] objArr133 = {applicationContext4, new String[]{str13, (String) objArr132[0]}, Integer.valueOf(iIntValue4), 17, 818887358};
                byte[] bArr36 = $$d;
                Object[] objArr134 = new Object[1];
                d(bArr36[54], bArr36[99], bArr36[400], objArr134);
                Class<?> cls7 = Class.forName((String) objArr134[0]);
                Object[] objArr135 = new Object[1];
                d(bArr36[4], (short) 25, bArr36[99], objArr135);
                objArr12 = (Object[]) cls7.getMethod((String) objArr135[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr133);
                int i232 = ((int[]) objArr12[0])[0];
                int i233 = ((int[]) objArr12[2])[0];
                if (applicationContext4 != null) {
                    i23 = asBinder + 71;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i23 % 128;
                    try {
                        if (i23 % 2 != 0) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
                                char minimumFlingVelocity5 = (char) (37567 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                int mode4 = 625 - View.MeasureSpec.getMode(0);
                                int i234 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 13;
                                byte[] bArr37 = $$a;
                                Object[] objArr136 = new Object[1];
                                c(bArr37[10], (short) 121, bArr37[7], objArr136);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(minimumFlingVelocity5, mode4, i234, -973632554, false, (String) objArr136[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).set(null, objArr12);
                            long jLongValue17 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf21 = Long.valueOf(jLongValue17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                                char c14 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 37566);
                                int iIndexOf10 = 624 - TextUtils.indexOf((CharSequence) str, '0', 0);
                                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 14;
                                byte[] bArr38 = $$a;
                                Object[] objArr137 = new Object[1];
                                c(bArr38[10], (short) 210, bArr38[7], objArr137);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(c14, iIndexOf10, iNormalizeMetaState, -976899241, false, (String) objArr137[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).set(null, lValueOf21);
                            Long lValueOf22 = Long.valueOf(jLongValue17 >> 116);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                                char c15 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 37567);
                                int packedPositionGroup5 = 625 - ExpandableListView.getPackedPositionGroup(0L);
                                int iGreen4 = 14 - Color.green(0);
                                byte b25 = (byte) ($$b & 23);
                                Object[] objArr138 = new Object[1];
                                c(b25, (short) (b25 | 64), (byte) 52, objArr138);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(c15, packedPositionGroup5, iGreen4, -477065106, false, (String) objArr138[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).set(null, lValueOf22);
                        } else {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                                char scrollBarFadeDuration2 = (char) (37567 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 625;
                                int i235 = 14 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                byte[] bArr39 = $$a;
                                Object[] objArr139 = new Object[1];
                                c(bArr39[10], (short) 121, bArr39[7], objArr139);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(scrollBarFadeDuration2, threadPriority, i235, -973632554, false, (String) objArr139[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).set(null, objArr12);
                            long jLongValue18 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf23 = Long.valueOf(jLongValue18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                                char touchSlop4 = (char) (37567 - (ViewConfiguration.getTouchSlop() >> 8));
                                int modifierMetaStateMask4 = ((byte) KeyEvent.getModifierMetaStateMask()) + 626;
                                int keyRepeatDelay5 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 14;
                                byte[] bArr40 = $$a;
                                Object[] objArr140 = new Object[1];
                                c(bArr40[10], (short) 210, bArr40[7], objArr140);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(touchSlop4, modifierMetaStateMask4, keyRepeatDelay5, -976899241, false, (String) objArr140[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).set(null, lValueOf23);
                            Long lValueOf24 = Long.valueOf(jLongValue18 >> 12);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                                char c16 = (char) (37567 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                int i236 = 626 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                int scrollBarFadeDuration3 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 14;
                                byte b26 = (byte) ($$b & 23);
                                Object[] objArr141 = new Object[1];
                                c(b26, (short) (b26 | 64), (byte) 52, objArr141);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(c16, i236, scrollBarFadeDuration3, -477065106, false, (String) objArr141[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).set(null, lValueOf24);
                        }
                    } catch (Exception unused11) {
                        throw new RuntimeException();
                    }
                }
            }
            if (((int[]) objArr12[2])[0] == ((int[]) objArr12[0])[0]) {
                arrayList5 = new ArrayList();
                strArr5 = (String[]) objArr12[3];
                if (strArr5 != null) {
                    int i237 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
                    asBinder = i237 % 128;
                    int i238 = i237 % 2;
                    for (String str14 : strArr5) {
                        arrayList5.add(str14);
                    }
                }
                throw null;
            }
            int i239 = ((int[]) objArr12[1])[0];
            int i240 = ((int[]) objArr12[2])[0];
            int i241 = ((int[]) objArr12[0])[0];
            String[] strArr22 = (String[]) objArr12[3];
            int[] iArr11 = {i240};
            int iIdentityHashCode15 = System.identityHashCode(this);
            int i242 = ~iIdentityHashCode15;
            int i243 = (~((-1248911374) | i242)) | 37756937;
            int i244 = ~(iIdentityHashCode15 | 1785981183);
            int i245 = i239 + (((i243 | i244) * (-252)) - 1546415644) + ((i244 | (~(i242 | (-1211154437)))) * 252);
            int i246 = (i245 << 13) ^ i245;
            int i247 = i246 ^ (i246 >>> 17);
            ((int[]) objArr[1])[0] = i247 ^ (i247 << 5);
            Object[] objArr142 = {new int[]{i241}, new int[1], iArr11, strArr22};
            Object systemService = context3.getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, str);
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null) {
                if (!networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3)) {
                    throw null;
                }
                int i248 = asBinder + 79;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i248 % 128;
                int i249 = i248 % 2;
            }
            throw null;
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault73 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault73 == null) {
            char c17 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
            int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 876;
            int absoluteGravity4 = Gravity.getAbsoluteGravity(0, 0) + 10;
            byte[] bArr41 = $$a;
            Object[] objArr143 = new Object[1];
            c(bArr41[10], (short) 210, bArr41[7], objArr143);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault73 = initSession.b(c17, maximumDrawingCacheSize2, absoluteGravity4, 2012931276, false, (String) objArr143[0], null);
        }
        Object[] objArr144 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault73).get(null);
        objArr5 = new Object[]{new int[]{((int[]) objArr144[0])[0]}, new int[1], new int[]{((int[]) objArr144[2])[0]}, (String[]) objArr144[3]};
        int iIdentityHashCode16 = System.identityHashCode(this);
        int i250 = (((((~(iIdentityHashCode16 | 368609234)) | (-328299006)) * 56) + 193578396) + (((~((~iIdentityHashCode16) | (-328299006))) | 368609234) * 56)) - 1100025489;
        int i251 = (i250 << 13) ^ i250;
        int i252 = i251 ^ (i251 >>> 17);
        ((int[]) objArr5[1])[0] = i252 ^ (i252 << 5);
        str = "";
        i5 = ((int[]) objArr5[2])[0];
        i6 = ((int[]) objArr5[0])[0];
        if (i6 == i5) {
            throw new RuntimeException(String.valueOf(i6));
        }
        int i1310 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
        asBinder = i1310 % 128;
        int i1311 = i1310 % 2;
        int i1312 = ((int[]) objArr5[1])[0];
        Object[] objArr710 = {new int[]{((int[]) objArr5[0])[0]}, new int[1], new int[]{((int[]) objArr5[2])[0]}, (String[]) objArr5[3]};
        int iIdentityHashCode17 = System.identityHashCode(this);
        int i1313 = 1517666874 + (((~((~iIdentityHashCode17) | 336204686)) | (-377175024)) * (-245));
        int i1314 = ~(iIdentityHashCode17 | 336204686);
        int i1315 = i1312 + i1313 + (i1314 * (-245)) + ((i1314 | 376514915) * 245);
        int i1316 = i1315 ^ (i1315 << 13);
        int i1317 = i1316 ^ (i1316 >>> 17);
        ((int[]) objArr710[1])[0] = i1317 ^ (i1317 << 5);
        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cAxisFromString3 = (char) ((-1) - MotionEvent.axisFromString(str));
            int packedPositionType5 = 876 - ExpandableListView.getPackedPositionType(0L);
            int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 10;
            Object[] objArr711 = new Object[1];
            c($$a[1], (short) ($$b & TypedValues.PositionType.TYPE_PERCENT_WIDTH), (byte) 42, objArr711);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAxisFromString3, packedPositionType5, iResolveSizeAndState2, -1199417970, false, (String) objArr711[0], null);
        }
        j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        jLongValue = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char bitsPerPixel11 = (char) (ImageFormat.getBitsPerPixel(0) + 1);
            int packedPositionGroup6 = 876 - ExpandableListView.getPackedPositionGroup(0L);
            int i1318 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 10;
            byte b110 = (byte) (-$$a[14]);
            Object[] objArr712 = new Object[1];
            c(b110, (short) (b110 | 56), (byte) 52, objArr712);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(bitsPerPixel11, packedPositionGroup6, i1318, 254769921, false, (String) objArr712[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                char c18 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1);
                int packedPositionType6 = ExpandableListView.getPackedPositionType(0L) + 876;
                int mode5 = 10 - View.MeasureSpec.getMode(0);
                byte[] bArr210 = $$a;
                Object[] objArr713 = new Object[1];
                c(bArr210[1], (short) 59, (byte) (-bArr210[44]), objArr713);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(c18, packedPositionType6, mode5, 1324201839, false, (String) objArr713[0], null);
            }
            Object[] objArr714 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).get(null);
            objArr6 = new Object[]{new int[]{((int[]) objArr714[0])[0]}, new int[1], new int[]{((int[]) objArr714[2])[0]}, (String[]) objArr714[3]};
            int iIdentityHashCode18 = System.identityHashCode(this);
            int i1319 = ~iIdentityHashCode18;
            int i1410 = 1854270488 + (((~(656522005 | i1319)) | 696832234) * (-90)) + (((~(656522005 | iIdentityHashCode18)) | 102837013) * (-45)) + (((~(iIdentityHashCode18 | (-696832235))) | 656522005 | (~(i1319 | 696832234))) * 45) + 1981834097;
            int i1411 = (i1410 << 13) ^ i1410;
            int i1412 = i1411 ^ (i1411 >>> 17);
            ((int[]) objArr6[1])[0] = i1412 ^ (i1412 << 5);
        } else {
            Object[] objArr715 = {Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), 1981834097};
            byte[] bArr211 = $$d;
            Object[] objArr716 = new Object[1];
            d(bArr211[54], (short) 186, (byte) (-bArr211[19]), objArr716);
            Class<?> cls8 = Class.forName((String) objArr716[0]);
            byte b111 = bArr211[99];
            Object[] objArr810 = new Object[1];
            d(b111, (short) (b111 | 313), (byte) (-bArr211[316]), objArr810);
            objArr6 = (Object[]) cls8.getMethod((String) objArr810[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr715);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char packedPositionGroup7 = (char) ExpandableListView.getPackedPositionGroup(0L);
                int iKeyCodeFromString5 = 876 - KeyEvent.keyCodeFromString(str);
                int tapTimeout4 = 10 - (ViewConfiguration.getTapTimeout() >> 16);
                byte[] bArr212 = $$a;
                Object[] objArr811 = new Object[1];
                c(bArr212[1], (short) 59, (byte) (-bArr212[44]), objArr811);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionGroup7, iKeyCodeFromString5, tapTimeout4, 1324201839, false, (String) objArr811[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArr6);
            long jLongValue19 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
            Long lValueOf110 = Long.valueOf(jLongValue19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char bitsPerPixel12 = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                int iRed3 = Color.red(0) + 876;
                int i1413 = 10 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte b112 = (byte) (-$$a[14]);
                Object[] objArr812 = new Object[1];
                c(b112, (short) (b112 | 56), (byte) 52, objArr812);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(bitsPerPixel12, iRed3, i1413, 254769921, false, (String) objArr812[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf110);
            Long lValueOf111 = Long.valueOf(jLongValue19 >> 12);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                char cLastIndexOf2 = (char) ((-1) - TextUtils.lastIndexOf(str, '0', 0, 0));
                int iKeyCodeFromString6 = 876 - KeyEvent.keyCodeFromString(str);
                int scrollDefaultDelay4 = 10 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                Object[] objArr813 = new Object[1];
                c($$a[1], (short) ($$b & TypedValues.PositionType.TYPE_PERCENT_WIDTH), (byte) 42, objArr813);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf2, iKeyCodeFromString6, scrollDefaultDelay4, -1199417970, false, (String) objArr813[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf111);
        }
        if (((int[]) objArr6[0])[0] == ((int[]) objArr6[2])[0]) {
            arrayList = new ArrayList();
            strArr = (String[]) objArr6[3];
            if (strArr != null) {
                while (i7 < strArr.length) {
                    arrayList.add(str10);
                }
            }
            throw null;
        }
        int i1414 = ((int[]) objArr6[1])[0];
        Object[] objArr814 = {new int[]{((int[]) objArr6[0])[0]}, new int[1], new int[]{((int[]) objArr6[2])[0]}, (String[]) objArr6[3]};
        int iIdentityHashCode19 = System.identityHashCode(this);
        int i1415 = ~iIdentityHashCode19;
        int i1416 = i1414 + 779228146 + (((~(i1415 | (-671228736))) | 131627 | (~((-40441857) | iIdentityHashCode19))) * 717) + (((~(iIdentityHashCode19 | (-671228736))) | (~(i1415 | (-40441857))) | 131627) * 717);
        int i1417 = (i1416 << 13) ^ i1416;
        int i1418 = i1417 ^ (i1417 >>> 17);
        ((int[]) objArr814[1])[0] = i1418 ^ (i1418 << 5);
        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char cCombineMeasuredStates2 = (char) View.combineMeasuredStates(0, 0);
            int windowTouchSlop7 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 876;
            int iMakeMeasureSpec4 = 10 - View.MeasureSpec.makeMeasureSpec(0, 0);
            byte b113 = (byte) ($$b & 23);
            Object[] objArr815 = new Object[1];
            c(b113, (short) (b113 | 64), (byte) 52, objArr815);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cCombineMeasuredStates2, windowTouchSlop7, iMakeMeasureSpec4, 252381699, false, (String) objArr815[0], null);
        }
        j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).getLong(null);
        jLongValue2 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char packedPositionGroup8 = (char) ExpandableListView.getPackedPositionGroup(0L);
            int i1419 = 877 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            int iIndexOf11 = 9 - TextUtils.indexOf((CharSequence) str, '0');
            byte[] bArr213 = $$a;
            Object[] objArr816 = new Object[1];
            c(bArr213[10], (short) 52, bArr213[7], objArr816);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(packedPositionGroup8, i1419, iIndexOf11, 2009631821, false, (String) objArr816[0], null);
        }
        if (j2 == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null) << 52) >>> 52)) >> 12)) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                char cResolveSizeAndState2 = (char) View.resolveSizeAndState(0, 0, 0);
                int i1510 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 876;
                int absoluteGravity5 = 10 - Gravity.getAbsoluteGravity(0, 0);
                byte b114 = $$a[7];
                short s4 = b114;
                Object[] objArr817 = new Object[1];
                c(b114, s4, (byte) (s4 | 52), objArr817);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(cResolveSizeAndState2, i1510, absoluteGravity5, 256017550, false, (String) objArr817[0], null);
            }
            Object[] objArr818 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).get(null);
            objArr8 = new Object[]{new int[]{((int[]) objArr818[0])[0]}, new int[1], new int[]{((int[]) objArr818[2])[0]}, (String[]) objArr818[3]};
            int i1511 = ~((~System.identityHashCode(this)) | 419170880);
            int i1512 = ((((278134848 | i1511) * (-374)) - 224340140) + ((i1511 | 141036032) * 374)) - 1630363814;
            int i1513 = (i1512 << 13) ^ i1512;
            int i1514 = i1513 ^ (i1513 >>> 17);
            ((int[]) objArr8[1])[0] = i1514 ^ (i1514 << 5);
            context3 = context;
        } else {
            context3 = context;
            if (context3 != null) {
                applicationContext2 = context3;
            } else if (context3 instanceof ContextWrapper) {
                applicationContext2 = context.getApplicationContext();
            } else {
                applicationContext2 = context.getApplicationContext();
            }
            Object[] objArr819 = {applicationContext2, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str6, Object.class).invoke(null, this)).intValue()), -1630363814};
            byte[] bArr214 = $$d;
            Object[] objArr910 = new Object[1];
            d(bArr214[54], (short) 138, (byte) 113, objArr910);
            Class<?> cls9 = Class.forName((String) objArr910[0]);
            Object[] objArr911 = new Object[1];
            d(bArr214[4], (short) 25, bArr214[99], objArr911);
            objArr7 = (Object[]) cls9.getMethod((String) objArr911[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr819);
            if (applicationContext2 != null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                    char c19 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int iLastIndexOf7 = TextUtils.lastIndexOf(str, '0', 0) + 877;
                    int pressedStateDuration4 = (ViewConfiguration.getPressedStateDuration() >> 16) + 10;
                    byte b115 = $$a[7];
                    short s5 = b115;
                    Object[] objArr912 = new Object[1];
                    c(b115, s5, (byte) (s5 | 52), objArr912);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c19, iLastIndexOf7, pressedStateDuration4, 256017550, false, (String) objArr912[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, objArr7);
                long jLongValue110 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf112 = Long.valueOf(jLongValue110);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                    char packedPositionType7 = (char) ExpandableListView.getPackedPositionType(0L);
                    int i1515 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 875;
                    int i1516 = 10 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    byte[] bArr215 = $$a;
                    Object[] objArr913 = new Object[1];
                    c(bArr215[10], (short) 52, bArr215[7], objArr913);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(packedPositionType7, i1515, i1516, 2009631821, false, (String) objArr913[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).set(null, lValueOf112);
                Long lValueOf113 = Long.valueOf(jLongValue110 >> 12);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                    char cResolveSize2 = (char) View.resolveSize(0, 0);
                    int bitsPerPixel13 = 875 - ImageFormat.getBitsPerPixel(0);
                    int iMakeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(0, 0) + 10;
                    byte b116 = (byte) ($$b & 23);
                    Object[] objArr914 = new Object[1];
                    c(b116, (short) (b116 | 64), (byte) 52, objArr914);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cResolveSize2, bitsPerPixel13, iMakeMeasureSpec5, 252381699, false, (String) objArr914[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, lValueOf113);
            } else {
                objArr7 = objArr7;
            }
            objArr8 = objArr7;
        }
        i8 = ((int[]) objArr8[2])[0];
        i9 = ((int[]) objArr8[0])[0];
        if (i9 == i8) {
            int i1517 = ((int[]) objArr8[1])[0];
            Object[] objArr915 = {new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int iMyPid2 = Process.myPid();
            int i1518 = ~iMyPid2;
            int i1519 = i1517 + 2070192700 + (((~(464928284 | i1518)) | (~((-505238514) | iMyPid2))) * (-370)) + (((~(iMyPid2 | 464928284)) | (~(i1518 | (-505238514))) | 27405324) * (-370)) + 1550035288;
            int i1610 = (i1519 << 13) ^ i1519;
            int i1611 = i1610 ^ (i1610 >>> 17);
            ((int[]) objArr915[1])[0] = i1611 ^ (i1611 << 5);
            i10 = 0;
        } else {
            Toast.makeText((Context) null, i9 / (((i9 - 1) * i9) % 2), 0).show();
            int i1612 = ((int[]) objArr8[1])[0];
            Object[] objArr916 = {new int[]{((int[]) objArr8[0])[0]}, new int[1], new int[]{((int[]) objArr8[2])[0]}, (String[]) objArr8[3]};
            int i1613 = ~((int) Process.getStartElapsedRealtime());
            int i1614 = i1612 + (-942559356) + (((~((-100929589) | i1613)) | 141239817) * (-828)) + ((i1613 | (-100929589)) * (-828)) + 1965320240;
            int i1615 = i1614 ^ (i1614 << 13);
            int i1616 = i1615 ^ (i1615 >>> 17);
            i10 = 0;
            ((int[]) objArr916[1])[0] = i1616 ^ (i1616 << 5);
        }
        objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
            char c20 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int mode6 = View.MeasureSpec.getMode(i10) + 651;
            int iGreen5 = 44 - Color.green(i10);
            byte[] bArr216 = $$a;
            Object[] objArr917 = new Object[1];
            c(bArr216[10], (short) 52, bArr216[7], objArr917);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(c20, mode6, iGreen5, -459846511, false, (String) objArr917[0], null);
        }
        j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).getLong(null);
        jLongValue3 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
            char tapTimeout5 = (char) (ViewConfiguration.getTapTimeout() >> 16);
            int deadChar4 = KeyEvent.getDeadChar(0, 0) + 651;
            int windowTouchSlop8 = 44 - (ViewConfiguration.getWindowTouchSlop() >> 8);
            byte b117 = (byte) ($$b & 23);
            Object[] objArr918 = new Object[1];
            c(b117, (short) (b117 | 64), (byte) 52, objArr918);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(tapTimeout5, deadChar4, windowTouchSlop8, -873460649, false, (String) objArr918[0], null);
        }
        if (j3 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).getLong(null) << 52) >>> 52)) >> 12)) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
                char cMyPid2 = (char) (Process.myPid() >> 22);
                int defaultSize3 = View.getDefaultSize(0, 0) + 651;
                int iLastIndexOf8 = TextUtils.lastIndexOf(str, '0', 0, 0) + 45;
                Object[] objArr919 = new Object[1];
                c($$a[10], (short) 158, (byte) 15, objArr919);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(cMyPid2, defaultSize3, iLastIndexOf8, -1595579076, false, (String) objArr919[0], null);
            }
            Object[] objArr1010 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).get(null);
            objArr9 = new Object[]{new int[]{i168}, new String[0], new int[]{i167}, new int[1]};
            int i1617 = ((int[]) objArr1010[2])[0];
            int i1618 = ((int[]) objArr1010[0])[0];
            int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
            int i1619 = ~iUptimeMillis2;
            int i1710 = ~((-676254551) | i1619);
            int i1711 = ~(672823740 | iUptimeMillis2);
            int i1712 = ((((-1969284366) + ((i1710 | i1711) * 1150)) + (((~((-672823741) | i1619)) | i1711) * (-575))) + (((~(iUptimeMillis2 | (-676254551))) | (~(i1619 | 676254550))) * 575)) - 592086991;
            int i1713 = (i1712 << 13) ^ i1712;
            int i1714 = i1713 ^ (i1713 >>> 17);
            ((int[]) objArr9[3])[0] = i1714 ^ (i1714 << 5);
            i11 = 0;
        } else {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b((char) View.MeasureSpec.makeMeasureSpec(0, 0), (Process.myPid() >> 22) + 1610, (ViewConfiguration.getScrollBarSize() >> 8) + 26, 2145681644, false, null, new Class[0]);
            }
            Object[] objArr1011 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).newInstance(null), -592086991, 0};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                char offsetBefore6 = (char) TextUtils.getOffsetBefore(str, 0);
                int minimumFlingVelocity6 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 651;
                int iAxisFromString6 = MotionEvent.axisFromString(str) + 45;
                byte b118 = (byte) ($$b & 23);
                Object[] objArr1012 = new Object[1];
                c(b118, (short) (b118 | 64), (byte) 52, objArr1012);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(offsetBefore6, minimumFlingVelocity6, iAxisFromString6, 2075921419, false, (String) objArr1012[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 695 - (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.lastIndexOf(str, '0') + 99), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - (ViewConfiguration.getLongPressTimeout() >> 16)), AndroidCharacter.getMirror('0') + 745, 83 - TextUtils.getTrimmedLength(str)), Integer.TYPE, Integer.TYPE});
            }
            objArr9 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).invoke(null, objArr1011);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                char c110 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1);
                int bitsPerPixel14 = ImageFormat.getBitsPerPixel(0) + 652;
                int keyRepeatDelay6 = 44 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                Object[] objArr1013 = new Object[1];
                c($$a[10], (short) 158, (byte) 15, objArr1013);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(c110, bitsPerPixel14, keyRepeatDelay6, -1595579076, false, (String) objArr1013[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, objArr9);
            long jLongValue111 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
            Long lValueOf114 = Long.valueOf(jLongValue111);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                char cGreen2 = (char) Color.green(0);
                int i1715 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 650;
                int iGreen6 = Color.green(0) + 44;
                byte b119 = (byte) ($$b & 23);
                Object[] objArr1014 = new Object[1];
                c(b119, (short) (b119 | 64), (byte) 52, objArr1014);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(cGreen2, i1715, iGreen6, -873460649, false, (String) objArr1014[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).set(null, lValueOf114);
            Long lValueOf115 = Long.valueOf(jLongValue111 >> 12);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                char c111 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                int fadingEdgeLength3 = 651 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                int i1716 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 44;
                byte[] bArr217 = $$a;
                Object[] objArr1015 = new Object[1];
                c(bArr217[10], (short) 52, bArr217[7], objArr1015);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(c111, fadingEdgeLength3, i1716, -459846511, false, (String) objArr1015[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).set(null, lValueOf115);
            i11 = 0;
        }
        i12 = ((int[]) objArr9[i11])[i11];
        i13 = ((int[]) objArr9[2])[i11];
        if (i13 == i12) {
            arrayList2 = new ArrayList();
            strArr2 = (String[]) objArr9[1];
            if (strArr2 != null) {
                while (i14 < strArr2.length) {
                    arrayList2.add(strArr2[i14]);
                }
            }
            throw new RuntimeException(String.valueOf(i13));
        }
        Object[] objArr1016 = new Object[4];
        int[] iArr12 = new int[1];
        objArr1016[i11] = iArr12;
        int[] iArr13 = new int[1];
        objArr1016[2] = iArr13;
        objArr1016[3] = new int[1];
        int i1717 = ((int[]) objArr9[3])[i11];
        int i1718 = ((int[]) objArr9[2])[i11];
        int i1719 = ((int[]) objArr9[i11])[i11];
        iArr13[i11] = i1718;
        iArr12[i11] = i1719;
        objArr1016[1] = new String[i11];
        int iIdentityHashCode110 = System.identityHashCode(this);
        int i1810 = ~iIdentityHashCode110;
        int i1811 = i1717 + 157817214 + (((~(152048986 | i1810)) | 155479796) * (-90)) + (((~(152048986 | iIdentityHashCode110)) | 1052938) * (-45)) + (((~(iIdentityHashCode110 | (-155479797))) | 152048986 | (~(i1810 | 155479796))) * 45);
        int i1812 = (i1811 << 13) ^ i1811;
        int i1813 = i1812 ^ (i1812 >>> 17);
        ((int[]) objArr1016[3])[0] = i1813 ^ (i1813 << 5);
        objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
            char bitsPerPixel15 = (char) (ImageFormat.getBitsPerPixel(0) + 31534);
            int i1814 = 922 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            int scrollBarSize3 = 28 - (ViewConfiguration.getScrollBarSize() >> 8);
            byte b27 = (byte) ($$b & 23);
            Object[] objArr1017 = new Object[1];
            c(b27, (short) (b27 | 64), (byte) 52, objArr1017);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(bitsPerPixel15, i1814, scrollBarSize3, -1048449946, false, (String) objArr1017[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).getLong(null) != -1) {
            int i1815 = asBinder + 73;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i1815 % 128;
            int i1816 = i1815 % 2;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                char touchSlop5 = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 31533);
                int packedPositionType8 = ExpandableListView.getPackedPositionType(0L) + 921;
                int iLastIndexOf9 = 27 - TextUtils.lastIndexOf(str, '0', 0);
                Object[] objArr1018 = new Object[1];
                c($$a[10], (short) 158, (byte) 15, objArr1018);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(touchSlop5, packedPositionType8, iLastIndexOf9, -1142834547, false, (String) objArr1018[0], null);
            }
            Object[] objArr1019 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).get(null);
            objArr10 = new Object[]{new int[1], new int[]{((int[]) objArr1019[1])[0]}, (Object[]) objArr1019[2], new int[]{((int[]) objArr1019[3])[0]}, (String[]) objArr1019[4]};
            int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
            int i1817 = ~elapsedCpuTime2;
            int i1818 = ((((((~((-1078745259) | i1817)) | (~((-695334386) | elapsedCpuTime2))) | (~(i1817 | 695334385))) * 959) + 2026916602) + (((~(elapsedCpuTime2 | 695334385)) | ((~(i1817 | (-695334386))) | (~((-1078745259) | elapsedCpuTime2)))) * 959)) - 112732250;
            int i1819 = (i1818 << 13) ^ i1818;
            int i1910 = i1819 ^ (i1819 >>> 17);
            ((int[]) objArr10[0])[0] = i1910 ^ (i1910 << 5);
            str2 = str6;
        } else {
            if (context3 != null) {
                applicationContext3 = context3;
            } else if (context3 instanceof ContextWrapper) {
                int i1911 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 67;
                asBinder = i1911 % 128;
                int i1912 = i1911 % 2;
                if (((ContextWrapper) context3).getBaseContext() != null) {
                    applicationContext3 = context.getApplicationContext();
                } else {
                    applicationContext3 = null;
                }
            } else {
                applicationContext3 = context.getApplicationContext();
            }
            str2 = str6;
            Object[] objArr1110 = {applicationContext3, Integer.valueOf(((Integer) Class.forName(str5).getMethod(str2, Object.class).invoke(null, this)).intValue()), 0, -112732250};
            byte[] bArr218 = $$d;
            byte b28 = bArr218[204];
            short s6 = (short) (b28 & 121);
            Object[] objArr1111 = new Object[1];
            d(b28, s6, (byte) s6, objArr1111);
            Class<?> cls10 = Class.forName((String) objArr1111[0]);
            byte b29 = bArr218[99];
            Object[] objArr1112 = new Object[1];
            d(b29, (short) (b29 | 238), (byte) (-bArr218[316]), objArr1112);
            objArr10 = (Object[]) cls10.getMethod((String) objArr1112[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr1110);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                char jumpTapTimeout5 = (char) (31533 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                int iLastIndexOf10 = TextUtils.lastIndexOf(str, '0', 0) + 922;
                int touchSlop6 = (ViewConfiguration.getTouchSlop() >> 8) + 28;
                Object[] objArr1113 = new Object[1];
                c($$a[10], (short) 158, (byte) 15, objArr1113);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(jumpTapTimeout5, iLastIndexOf10, touchSlop6, -1142834547, false, (String) objArr1113[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).set(null, objArr10);
            long jLongValue112 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
            Long lValueOf116 = Long.valueOf(jLongValue112);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                char edgeSlop3 = (char) (31533 - (ViewConfiguration.getEdgeSlop() >> 16));
                int iRgb4 = (-16776295) - Color.rgb(0, 0, 0);
                int i1913 = 28 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                byte[] bArr310 = $$a;
                Object[] objArr1114 = new Object[1];
                c(bArr310[10], (short) 121, bArr310[7], objArr1114);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(edgeSlop3, iRgb4, i1913, -778300370, false, (String) objArr1114[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).set(null, lValueOf116);
            Long lValueOf117 = Long.valueOf(jLongValue112 >> 12);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                char absoluteGravity6 = (char) (Gravity.getAbsoluteGravity(0, 0) + 31533);
                int bitsPerPixel16 = ImageFormat.getBitsPerPixel(0) + 922;
                int i1914 = 29 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                byte b210 = (byte) ($$b & 23);
                Object[] objArr1115 = new Object[1];
                c(b210, (short) (b210 | 64), (byte) 52, objArr1115);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(absoluteGravity6, bitsPerPixel16, i1914, -1048449946, false, (String) objArr1115[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).set(null, lValueOf117);
        }
        i15 = ((int[]) objArr10[1])[0];
        i16 = ((int[]) objArr10[3])[0];
        if (i16 == i15) {
            int i1915 = ((int[]) objArr10[0])[0];
            Object[] objArr1116 = {new int[1], new int[]{((int[]) objArr10[1])[0]}, (Object[]) objArr10[2], new int[]{((int[]) objArr10[3])[0]}, (String[]) objArr10[4]};
            int iIdentityHashCode111 = System.identityHashCode(this);
            int i1916 = (-365174791) + (((~((-161095239) | iIdentityHashCode111)) | (-1612984406)) * (-318));
            int i1917 = ~((-1612984406) | iIdentityHashCode111);
            int i1918 = ~iIdentityHashCode111;
            int i1919 = i1915 + i1916 + ((i1917 | (~(1774075479 | i1918))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iIdentityHashCode111 | 1774075479)) | (~((-1612980242) | i1918))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
            int i2010 = (i1919 << 13) ^ i1919;
            int i2011 = i2010 ^ (i2010 >>> 17);
            i17 = 0;
            ((int[]) objArr1116[0])[0] = i2011 ^ (i2011 << 5);
        } else {
            arrayList3 = new ArrayList();
            strArr3 = (String[]) objArr10[4];
            if (strArr3 != null) {
                while (i18 < strArr3.length) {
                    arrayList3.add(str11);
                }
            }
            Toast.makeText((Context) null, i16 / (((i16 - 1) * i16) % 2), 0).show();
            int i2012 = ((int[]) objArr10[0])[0];
            Object[] objArr1117 = {new int[1], new int[]{((int[]) objArr10[1])[0]}, (Object[]) objArr10[2], new int[]{((int[]) objArr10[3])[0]}, (String[]) objArr10[4]};
            int iIdentityHashCode112 = System.identityHashCode(this);
            int i2013 = i2012 + 1438094877 + (((~((-1434270728) | iIdentityHashCode112)) | (-1434271384)) * (-502)) + ((~((~iIdentityHashCode112) | (-1094462468))) * (-502)) + (((~(iIdentityHashCode112 | (-339808917))) | (-1434270728)) * TypedValues.PositionType.TYPE_DRAWPATH);
            int i2014 = (i2013 << 13) ^ i2013;
            int i2015 = i2014 ^ (i2014 >>> 17);
            i17 = 0;
            ((int[]) objArr1117[0])[0] = i2015 ^ (i2015 << 5);
        }
        objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
            char cIndexOf5 = (char) (29944 - TextUtils.indexOf(str, str, i17));
            int mode7 = 1755 - View.MeasureSpec.getMode(i17);
            int i2016 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 22;
            Object[] objArr1118 = new Object[1];
            c($$a[10], (short) 158, (byte) 15, objArr1118);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(cIndexOf5, mode7, i2016, 986134021, false, (String) objArr1118[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).getLong(null) != -1) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                char c112 = (char) (29944 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                int jumpTapTimeout6 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1755;
                int iKeyCodeFromString7 = 23 - KeyEvent.keyCodeFromString(str);
                byte[] bArr311 = $$a;
                Object[] objArr1119 = new Object[1];
                c(bArr311[10], (short) 121, bArr311[7], objArr1119);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(c112, jumpTapTimeout6, iKeyCodeFromString7, 1599039318, false, (String) objArr1119[0], null);
            }
            Object[] objArr1210 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).get(null);
            objArr11 = new Object[]{new int[]{((int[]) objArr1210[0])[0]}, new int[]{((int[]) objArr1210[1])[0]}, (Object[]) objArr1210[2], new int[1], (String[]) objArr1210[4]};
            int iMaxMemory3 = (int) Runtime.getRuntime().maxMemory();
            int i2017 = ~iMaxMemory3;
            int i2018 = (((586385936 + (((~(449080366 | i2017)) | (~((-411304967) | iMaxMemory3))) * (-831))) + ((~(1072987758 | iMaxMemory3)) * (-1662))) + (((~(iMaxMemory3 | (-449080367))) | ((~(i2017 | (-661682793))) | (~(661682792 | iMaxMemory3)))) * 831)) - 231237712;
            int i2019 = (i2018 << 13) ^ i2018;
            int i2110 = i2019 ^ (i2019 >>> 17);
            ((int[]) objArr11[3])[0] = i2110 ^ (i2110 << 5);
        } else {
            int iIntValue5 = ((Integer) Class.forName(str5).getMethod(str2, Object.class).invoke(null, this)).intValue();
            Object[] objArr1211 = {727417497};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b((char) (42049 - TextUtils.getTrimmedLength(str)), 1726 - Color.alpha(0), 29 - Color.red(0), -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da2 = com.google.firebase.abt.R.layout.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue5, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).newInstance(objArr1211), -231237712);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                char cBlue2 = (char) (Color.blue(0) + 29944);
                int iLastIndexOf11 = 1754 - TextUtils.lastIndexOf(str, '0', 0, 0);
                int scrollBarFadeDuration4 = 23 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                byte[] bArr312 = $$a;
                Object[] objArr1212 = new Object[1];
                c(bArr312[10], (short) 121, bArr312[7], objArr1212);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(cBlue2, iLastIndexOf11, scrollBarFadeDuration4, 1599039318, false, (String) objArr1212[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da2);
            long jLongValue113 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
            Long lValueOf118 = Long.valueOf(jLongValue113);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                char cIndexOf6 = (char) (TextUtils.indexOf((CharSequence) str, '0') + 29945);
                int scrollDefaultDelay5 = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1755;
                int i2111 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22;
                byte[] bArr313 = $$a;
                Object[] objArr1213 = new Object[1];
                c(bArr313[10], (short) 52, bArr313[7], objArr1213);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(cIndexOf6, scrollDefaultDelay5, i2111, 1596667560, false, (String) objArr1213[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).set(null, lValueOf118);
            Long lValueOf25 = Long.valueOf(jLongValue113 >> 12);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                char jumpTapTimeout7 = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 29944);
                int keyRepeatDelay7 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1755;
                int defaultSize4 = View.getDefaultSize(0, 0) + 23;
                Object[] objArr1214 = new Object[1];
                c($$a[10], (short) 158, (byte) 15, objArr1214);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(jumpTapTimeout7, keyRepeatDelay7, defaultSize4, 986134021, false, (String) objArr1214[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).set(null, lValueOf25);
            objArr11 = objArrTuitionPaymentFragmentbindingInflater1$5f1425da2;
        }
        i19 = ((int[]) objArr11[1])[0];
        i20 = ((int[]) objArr11[0])[0];
        if (i20 == i19) {
            int i2112 = asBinder + 125;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2112 % 128;
            int i2113 = i2112 % 2;
            int i2114 = ((int[]) objArr11[3])[0];
            Object[] objArr1215 = {new int[]{((int[]) objArr11[0])[0]}, new int[]{((int[]) objArr11[1])[0]}, (Object[]) objArr11[2], new int[1], (String[]) objArr11[4]};
            int iIdentityHashCode113 = System.identityHashCode(this);
            int i2115 = 261698201 + (((~(342020675 | iIdentityHashCode113)) | (-129418250)) * 672);
            int i2116 = ~iIdentityHashCode113;
            int i2117 = i2114 + i2115 + (((~(iIdentityHashCode113 | (-129418250))) | (~((-342020676) | i2116))) * (-672)) + (((~(129418249 | i2116)) | (-402052684)) * 672);
            int i2118 = (i2117 << 13) ^ i2117;
            int i2119 = i2118 ^ (i2118 >>> 17);
            i21 = 0;
            ((int[]) objArr1215[3])[0] = i2119 ^ (i2119 << 5);
        } else {
            arrayList4 = new ArrayList();
            strArr4 = (String[]) objArr11[4];
            if (strArr4 != null) {
                while (i22 < strArr4.length) {
                    arrayList4.add(str12);
                }
            }
            int[] iArr14 = new int[i20];
            int i2210 = i20 - 1;
            iArr14[i2210] = 1;
            Toast.makeText((Context) null, iArr14[((i20 * i2210) % 2) - 1], 1).show();
            int i2211 = ((int[]) objArr11[3])[0];
            Object[] objArr1216 = {new int[]{((int[]) objArr11[0])[0]}, new int[]{((int[]) objArr11[1])[0]}, (Object[]) objArr11[2], new int[1], (String[]) objArr11[4]};
            int iNextInt2 = new Random().nextInt();
            int i2212 = ~iNextInt2;
            int i2213 = i2211 + 1863492881 + ((iNextInt2 | 33719313) * 988) + (((~(590517397 | i2212)) | (-934713056)) * (-1976)) + (((~(iNextInt2 | 377914971)) | 33719313 | (~((-377914972) | i2212))) * 988);
            int i2214 = (i2213 << 13) ^ i2213;
            int i2215 = i2214 ^ (i2214 >>> 17);
            i21 = 0;
            ((int[]) objArr1216[3])[0] = i2215 ^ (i2215 << 5);
        }
        objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
            char absoluteGravity7 = (char) (37567 - Gravity.getAbsoluteGravity(i21, i21));
            int iAlpha2 = Color.alpha(i21) + 625;
            int longPressTimeout4 = (ViewConfiguration.getLongPressTimeout() >> 16) + 14;
            byte b211 = (byte) ($$b & 23);
            Object[] objArr1217 = new Object[1];
            c(b211, (short) (b211 | 64), (byte) 52, objArr1217);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(absoluteGravity7, iAlpha2, longPressTimeout4, -477065106, false, (String) objArr1217[0], null);
        }
        j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).getLong(null);
        jLongValue4 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
        objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
            char cRgb2 = (char) ((-16739649) - Color.rgb(0, 0, 0));
            int iRgb5 = Color.rgb(0, 0, 0) + 16777841;
            int minimumFlingVelocity7 = 14 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            byte[] bArr314 = $$a;
            Object[] objArr1218 = new Object[1];
            c(bArr314[10], (short) 210, bArr314[7], objArr1218);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(cRgb2, iRgb5, minimumFlingVelocity7, -976899241, false, (String) objArr1218[0], null);
        }
        if (j4 == ((jLongValue4 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).getLong(null) << 52) >>> 52)) >> 12)) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                char c113 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 37568);
                int bitsPerPixel17 = 624 - ImageFormat.getBitsPerPixel(0);
                int iKeyCodeFromString8 = KeyEvent.keyCodeFromString(str) + 14;
                byte[] bArr315 = $$a;
                Object[] objArr1219 = new Object[1];
                c(bArr315[10], (short) 121, bArr315[7], objArr1219);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b(c113, bitsPerPixel17, iKeyCodeFromString8, -973632554, false, (String) objArr1219[0], null);
            }
            Object[] objArr1310 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).get(null);
            int i2216 = ((int[]) objArr1310[2])[0];
            int i2217 = ((int[]) objArr1310[0])[0];
            String[] strArr23 = (String[]) objArr1310[3];
            int[] iArr15 = {i2216};
            int iIdentityHashCode114 = System.identityHashCode(this);
            int i2218 = ~(243421884 | iIdentityHashCode114);
            int i2219 = 190433812 + ((1345430592 | i2218) * (-814)) + ((i2218 | (~((~iIdentityHashCode114) | (-1580316237))) | 8536240) * 407) + (((~(iIdentityHashCode114 | 1580316236)) | (~((-243421885) | iIdentityHashCode114)) | 8536240) * 407) + 818887358;
            int i2310 = (i2219 << 13) ^ i2219;
            int i2311 = i2310 ^ (i2310 >>> 17);
            ((int[]) objArr12[1])[0] = i2311 ^ (i2311 << 5);
            objArr12 = new Object[]{new int[]{i2217}, new int[1], iArr15, strArr23};
        } else {
            if (context3 != null) {
                applicationContext4 = context3;
            } else if (context3 instanceof ContextWrapper) {
                applicationContext4 = context.getApplicationContext();
            } else {
                applicationContext4 = context.getApplicationContext();
            }
            int iIntValue6 = ((Integer) Class.forName(str5).getMethod(str2, Object.class).invoke(null, this)).intValue();
            Object[] objArr1311 = new Object[1];
            a((Process.myTid() >> 22) + 69, Process.getGidForName(str) + 65, (char) (Color.alpha(0) + 35933), objArr1311);
            String str15 = (String) objArr1311[0];
            Object[] objArr1312 = new Object[1];
            a(133 - Drawable.resolveOpacity(0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 63, (char) (16911 - Color.argb(0, 0, 0, 0)), objArr1312);
            Object[] objArr1313 = {applicationContext4, new String[]{str15, (String) objArr1312[0]}, Integer.valueOf(iIntValue6), 17, 818887358};
            byte[] bArr316 = $$d;
            Object[] objArr1314 = new Object[1];
            d(bArr316[54], bArr316[99], bArr316[400], objArr1314);
            Class<?> cls11 = Class.forName((String) objArr1314[0]);
            Object[] objArr1315 = new Object[1];
            d(bArr316[4], (short) 25, bArr316[99], objArr1315);
            objArr12 = (Object[]) cls11.getMethod((String) objArr1315[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr1313);
            int i2312 = ((int[]) objArr12[0])[0];
            int i2313 = ((int[]) objArr12[2])[0];
            if (applicationContext4 != null) {
                i23 = asBinder + 71;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i23 % 128;
                if (i23 % 2 != 0) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
                        char minimumFlingVelocity8 = (char) (37567 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        int mode8 = 625 - View.MeasureSpec.getMode(0);
                        int i2314 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 13;
                        byte[] bArr317 = $$a;
                        Object[] objArr1316 = new Object[1];
                        c(bArr317[10], (short) 121, bArr317[7], objArr1316);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(minimumFlingVelocity8, mode8, i2314, -973632554, false, (String) objArr1316[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).set(null, objArr12);
                    long jLongValue114 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf26 = Long.valueOf(jLongValue114);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                        char c114 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 37566);
                        int iIndexOf12 = 624 - TextUtils.indexOf((CharSequence) str, '0', 0);
                        int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 14;
                        byte[] bArr318 = $$a;
                        Object[] objArr1317 = new Object[1];
                        c(bArr318[10], (short) 210, bArr318[7], objArr1317);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(c114, iIndexOf12, iNormalizeMetaState2, -976899241, false, (String) objArr1317[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).set(null, lValueOf26);
                    Long lValueOf27 = Long.valueOf(jLongValue114 >> 116);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                        char c115 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 37567);
                        int packedPositionGroup9 = 625 - ExpandableListView.getPackedPositionGroup(0L);
                        int iGreen7 = 14 - Color.green(0);
                        byte b212 = (byte) ($$b & 23);
                        Object[] objArr1318 = new Object[1];
                        c(b212, (short) (b212 | 64), (byte) 52, objArr1318);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(c115, packedPositionGroup9, iGreen7, -477065106, false, (String) objArr1318[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).set(null, lValueOf27);
                } else {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                        char scrollBarFadeDuration5 = (char) (37567 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                        int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 625;
                        int i2315 = 14 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        byte[] bArr319 = $$a;
                        Object[] objArr1319 = new Object[1];
                        c(bArr319[10], (short) 121, bArr319[7], objArr1319);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(scrollBarFadeDuration5, threadPriority2, i2315, -973632554, false, (String) objArr1319[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).set(null, objArr12);
                    long jLongValue115 = ((Long) Class.forName(str3).getDeclaredMethod(str4, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf28 = Long.valueOf(jLongValue115);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                        char touchSlop7 = (char) (37567 - (ViewConfiguration.getTouchSlop() >> 8));
                        int modifierMetaStateMask5 = ((byte) KeyEvent.getModifierMetaStateMask()) + 626;
                        int keyRepeatDelay8 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 14;
                        byte[] bArr42 = $$a;
                        Object[] objArr145 = new Object[1];
                        c(bArr42[10], (short) 210, bArr42[7], objArr145);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(touchSlop7, modifierMetaStateMask5, keyRepeatDelay8, -976899241, false, (String) objArr145[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).set(null, lValueOf28);
                    Long lValueOf29 = Long.valueOf(jLongValue115 >> 12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                        char c116 = (char) (37567 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        int i2316 = 626 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        int scrollBarFadeDuration6 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 14;
                        byte b213 = (byte) ($$b & 23);
                        Object[] objArr146 = new Object[1];
                        c(b213, (short) (b213 | 64), (byte) 52, objArr146);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(c116, i2316, scrollBarFadeDuration6, -477065106, false, (String) objArr146[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).set(null, lValueOf29);
                }
            }
        }
        if (((int[]) objArr12[2])[0] == ((int[]) objArr12[0])[0]) {
            arrayList5 = new ArrayList();
            strArr5 = (String[]) objArr12[3];
            if (strArr5 != null) {
                int i2317 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
                asBinder = i2317 % 128;
                int i2318 = i2317 % 2;
                while (i24 < strArr5.length) {
                    arrayList5.add(str14);
                }
            }
            throw null;
        }
        int i2319 = ((int[]) objArr12[1])[0];
        int i2410 = ((int[]) objArr12[2])[0];
        int i2411 = ((int[]) objArr12[0])[0];
        String[] strArr24 = (String[]) objArr12[3];
        int[] iArr16 = {i2410};
        int iIdentityHashCode115 = System.identityHashCode(this);
        int i2412 = ~iIdentityHashCode115;
        int i2413 = (~((-1248911374) | i2412)) | 37756937;
        int i2414 = ~(iIdentityHashCode115 | 1785981183);
        int i2415 = i2319 + (((i2413 | i2414) * (-252)) - 1546415644) + ((i2414 | (~(i2412 | (-1211154437)))) * 252);
        int i2416 = (i2415 << 13) ^ i2415;
        int i2417 = i2416 ^ (i2416 >>> 17);
        ((int[]) objArr142[1])[0] = i2417 ^ (i2417 << 5);
        Object[] objArr147 = {new int[]{i2411}, new int[1], iArr16, strArr24};
        Object systemService2 = context3.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService2, str);
        ConnectivityManager connectivityManager2 = (ConnectivityManager) systemService2;
        networkCapabilities = connectivityManager2.getNetworkCapabilities(connectivityManager2.getActiveNetwork());
        if (networkCapabilities != null) {
            if (networkCapabilities.hasTransport(1)) {
            }
            throw null;
        }
        throw null;
    }

    static {
        byte[] bArr = new byte[523];
        System.arraycopy("$¶±ë\u000eñ%Ú\u0001\u0004û\u0001.×ý\u0005\fíPÐß\fõ\u000bú\u0001\u001eïè\f\b÷ú.Ô\u0011úú\b÷ú\u0012ùû\nûû\u0007\u001eÛ\bú\u000bí\u000fóAß\fõ\u000bú\u0001\u001eïè\f\b÷ú.Ô\u0011úú\b÷ú\u0012ùû\nûû\u0007\u001eÛ\bú\u000bí\u000fóAô\u0002?Çø\u0000\bû\u00077Íó\nò\u0003\u0006\u00056ÇúúEÅûú\u000fó\u0004\rõ>Âý\f\u0002í\u000bú\u0001@´\u0000\u0015\u0001ß\fõ\u000bú\u0001\u001eïè\f\b÷ú.Ô\u0011úú\b÷ú\u0001\u0003\u000b\u0002ú\bõ\u0003û\u0002\u0003û\t\u0001î\r\u0004î*Þ\u000bÿù\bÿÿ\u0005ì\tøC\u000eñ+Ü\fú\u0002\"âñüÿ\u0003\r\u001fÚ\u000bî\u000b\u001bÞ\u000bÿß\fõ\u000bú\u0001\u001eïè\f\b÷ú.Ô\u0011úú\b÷ú\u0001\u0003\u000b\u0002ú\bõ\u0003û\u0002\u0003û\t\u0001î\r\u0004î*Þ\u000bÿù\bÿÿ\u0005ì\tøAô\u0002?Çø\u0000\bû\u00077Íó\nò\u0003\u0006\u00056ÇúúEÅûú\u000fó\u0004\rõ>Á\u0001\u0001\u0002õ\u0015üô\u0002\u0000þ\u0001@´\u0000\r\u0006ô\u0002?Ìò\u0006÷ÿ\töG¾þ\rò\u000e÷ú\u0013í\u000bú\u0001@Íî\nþ=Íþï\u000bó\u00117íÎ\nþ*Þï\u000bó\u0011\u0015ïïþ\u000b\u0006úù\u000fóú'èø\u000býóÿ\u000bÿù,ãí\u0013\u001bÔ\u0011úú\b÷úP±\u0003\u000b\u0002ú\bõH\u0000»û\u0002\u0003û\t\u0001@»û\u0004\u0005\u0002ïPÀÿÿ\u0005ì\tøPò\u000eñ1âô\bó\u0011\u001båþï\u0005ýù)Þ\u0003ù\r\u0005ÿóNÂô\u0002?Çø\u0000\bû\u00077Èý÷\r\u0003\u0001î\u000e7Ëñ\u0011î\u000büó\u0005\u000b\u0006ðEèÝ÷\r\u0003\u0001î\u000e\"Ñ\u0011î\u000büó\u0005\u000b\u0006ð(×ü&íþþöÿ\u0002\u0011ïNáÔ\u0002ý\u000fó\u0005ú\u0001".getBytes("ISO-8859-1"), 0, bArr, 0, 523);
        $$d = bArr;
        $$e = 232;
        $$a = new byte[]{94, 6, -99, -107, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -29, 31, -48, -17, 4, -24, 1, -6, -13, -13, -29, 38, -50, -16, -1, -12, -24, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
        $$b = 77;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        asBinder = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new char[]{45558, 1712, 57200, 37914, 27782, 9585, 64051, 45801, 2963, 49159, 39117, 20906, 9843, 65281, 47055, 3186, 3006, 48382, 25896, 11870, 54935, 40767, 16493, 2229, 45559, 31235, 8870, 60400, 39944, 17745, 3461, 46641, 45565, 1727, 57186, 37897, 27847, 9588, 64054, 45737, 2971, 49242, 39088, 20864, 9849, 65286, 47070, 3194, 50465, 40386, 21146, 11076, 58363, 47270, 45561, 1725, 57191, 37899, 27867, 9592, 64054, 45781, 2961, 49224, 39154, 20903, 9833, 65304, 47055, 15859, 35561, 21309, 6215, 57492, 43298, 30313, 16108, 34704, 19474, 5285, 56763, 43576, 29517, 15254, 32887, 18726, 4589, 56989, 42771, 28656, 13479, 64872, 19016, 4764, 56179, 41073, 26863, 12702, 65052, 18163, 4011, 54360, 40269, 26057, 12927, 64292, 17361, 2199, 53531, 39343, 26273, 12119, 62486, 48283, 1325, 53796, 39639, 25552, 10316, 61683, 47607, 1617, 53000, 38861, 23592, 9504, 60892, 47751, 796, 52143, 37118, 22869, 9808, 62448, 17599, 40301, 54850, 11927, 26407, 47167, 61631, 18846, 33344, 55969, 5054, 25706, 48456, 62915, 20004, 34673, 57277, 4303, 26903, 41378, 64245, 13163, 33870, 56521, 5410, 28195, 42677, 65484, 12307, 34988, 49656, 6666, 21276, 43932, 64549, 13683, 36311, 50844, 7962, 22441, 43171, 57687, 14922, 29336, 52014, 7286, 21635, 44506, 58957, 16032, 30717, 51285, 342, 22942, 37418, 60200, 9168, 29907, 52504, 1534, 24314, 38659, 59398};
        b = -8331714474520148271L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(int r6, byte r7, short r8) {
        /*
            int r7 = r7 * 3
            int r7 = 115 - r7
            int r6 = r6 * 2
            int r6 = 1 - r6
            byte[] r0 = defpackage.getOrCreateCameraXInstancelambda18lambda17.$$c
            int r8 = r8 * 4
            int r8 = 3 - r8
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r4 = r2
            r7 = r6
            goto L29
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            int r8 = r8 + 1
            r1[r3] = r5
            if (r4 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r3 = r0[r8]
        L29:
            int r7 = r7 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getOrCreateCameraXInstancelambda18lambda17.$$g(int, byte, short):java.lang.String");
    }
}

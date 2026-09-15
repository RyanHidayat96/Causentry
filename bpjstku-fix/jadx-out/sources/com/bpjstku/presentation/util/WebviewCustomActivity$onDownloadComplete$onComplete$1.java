package com.bpjstku.presentation.util;

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
import defpackage.CaptureSession1;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.abortCapture;
import defpackage.initSession;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/bpjstku/presentation/util/WebviewCustomActivity$onDownloadComplete$onComplete$1;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "p0", "Landroid/content/Intent;", "p1", "", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WebviewCustomActivity$onDownloadComplete$onComplete$1 extends BroadcastReceiver {
    private static final byte[] $$c = {94, 6, -99, -107};
    private static final int $$f = 232;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {104, 27, -72, 120, 15, 1, -60, 60, 11, 3, -5, 8, -4, -52, 59, 6, 12, -10, 0, 2, 21, -11, -52, 56, 18, -14, 21, -8, 7, 16, -2, -8, -3, 19, -66, 62, 8, 9, -12, 16, -1, -10, 14, -59, 67, -6, 18, 6, -5, 6, -4, -58, 29, 47, 3, -1, -38, 33, 18, -31, 22, 15, 7, -13, 17, 4, 15, 1, -60, 60, 11, 3, -5, 8, -4, -52, 54, 16, -7, 17, 0, -3, -2, -51, 65, 0, -4, 19, -14, 20, -6, -1, 17, -66, 69, -1, -8, 5, 5, 17, -66, 62, 8, 9, -12, 16, -1, -10, 14, -59, 79, 3, -21, 11, 0, 36, -9, 14, -8, 9, 2, -27, 20, 27, -9, -5, 12, 9, -43, 47, -14, 9, 9, -5, 12, 9, 2, 0, -8, 1, 9, -5, 14, 0, 8, 1, 0, 8, -6, 2, 21, -10, -1, 21, -39, 37, -8, 4, 10, -5, 4, 4, -2, 23, -6, 11, -64, 2, -40, 44, 6, 7, -11, 2, 36, -9, 14, -8, 9, 2, -27, 20, 27, -9, -5, 12, 9, -43, 47, -14, 9, 9, -5, 12, 9, -15, 10, 8, -7, 8, 8, -4, -27, 40, -5, 9, -8, 22, -12, 16, -62, 15, 1, -60, 54, 18, 3, 6, -10, 9, 16, -17, 16, -65, 62, 8, 9, -12, 16, -1, -10, 14, -59, 22, 8, 36, -51, 73, -33, -12, 10, 15, 1, -60, 60, 11, 3, -5, 8, -4, -52, 54, 16, -7, 17, 0, -3, -2, -51, 60, 9, 9, -66, 56, 12, 6, 9, -14, 12, -5, 17, 3, -15, 9, 5, 8, -4, -54, 79, 3, -22, 6, -8, 15, -8, 5, 0, 7, 22, -16, 1, 21, 2, -12, -18, 37, -10, -31, 33, 18, 7, 4, 0, -10, -49, 51, 16, -7, 17, 0, -3, -2, 23, -18, 1, 15, -5, 16, -14, 5, 1, 15, -5, 16, -14, -44, 58, 8, 9, -12, 16, -1, -10, 14, -38, 33, 15, -5, 16, -14, -44, 20, 33, 18, 7, 4, 0, -10, -18, 28, 10, -8, 10, 0, 8, -6, -18, 28, 10, -8, 10, 0, 8, -6, -62, 51, 36, -9, 14, -8, 9, 2, -27, 20, 27, -9, -5, 12, 9, -43, 47, -14, 9, 9, -5, 12, 9, -15, 10, 8, -7, 8, 8, -4, -27, 40, -5, 9, -8, 22, -12, 16, -62, 33, 20, -11, -11, 22, -1, 21, -80, 64, 36, -9, 14, -8, 9, 2, -27, 20, 27, -9, -5, 12, 9, -43, 47, -14, 9, 9, -5, 12, 9, 2, 0, -8, 1, 9, -5, 14, 0, 8, 1, 0, 8, -6, 2, 21, -10, -1, 21, -39, 37, -8, 4, 10, -5, 4, 4, -2, 23, -6, 11, -62};
    private static final int $$e = 112;
    private static final byte[] $$a = {ByteCompanionObject.MAX_VALUE, 43, -39, -37, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 29, -31, 48, 17, -4, 24, -1, 6, 13, 13, 29, -38, 50, 16, 1, 12, 24, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$b = 9;
    private static int b = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -9214128976102870053L;

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.bpjstku.presentation.util.WebviewCustomActivity$onDownloadComplete$onComplete$1.$$a
            int r6 = r6 + 4
            int r7 = 103 - r7
            int r1 = 53 - r8
            byte[] r1 = new byte[r1]
            int r8 = 52 - r8
            r2 = 0
            if (r0 != 0) goto L13
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2a
        L13:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r7 = r7 + 1
            int r4 = r3 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r0[r7]
        L2a:
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.util.WebviewCustomActivity$onDownloadComplete$onComplete$1.c(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 4
            int r8 = r8 + 1
            byte[] r0 = com.bpjstku.presentation.util.WebviewCustomActivity$onDownloadComplete$onComplete$1.$$d
            int r9 = r9 + 67
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L11
            r9 = r7
            r3 = r8
            r5 = r2
            goto L29
        L11:
            r3 = r2
        L12:
            int r7 = r7 + 1
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L29:
            int r3 = r3 + r7
            int r7 = r3 + (-3)
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.util.WebviewCustomActivity$onDownloadComplete$onComplete$1.d(short, int, short, java.lang.Object[]):void");
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $11 + 29;
        $10 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 5 % 2;
        }
        while (abortcapture.b < cArrB.length) {
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i5 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 64839), 1356 - TextUtils.getOffsetAfter("", 0), 37 - Process.getGidForName(""), 894276454, false, $$g(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 47773), 468 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 13 - (ViewConfiguration.getEdgeSlop() >> 16), 896083767, false, "n", new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
        int i6 = $11 + 95;
        $10 = i6 % 128;
        int i7 = i6 % 2;
    }

    WebviewCustomActivity$onDownloadComplete$onComplete$1() {
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0a5a  */
    /* JADX WARN: Code duplicated, block: B:138:0x0c26  */
    /* JADX WARN: Code duplicated, block: B:139:0x0c95  */
    /* JADX WARN: Code duplicated, block: B:142:0x0d21  */
    /* JADX WARN: Code duplicated, block: B:145:0x0d85  */
    /* JADX WARN: Code duplicated, block: B:146:0x0dc8  */
    /* JADX WARN: Code duplicated, block: B:149:0x0dde  */
    /* JADX WARN: Code duplicated, block: B:151:0x0de7  */
    /* JADX WARN: Code duplicated, block: B:154:0x0ea4  */
    /* JADX WARN: Code duplicated, block: B:158:0x0f2b  */
    /* JADX WARN: Code duplicated, block: B:163:0x0f97  */
    /* JADX WARN: Code duplicated, block: B:166:0x0fec  */
    /* JADX WARN: Code duplicated, block: B:170:0x1049  */
    /* JADX WARN: Code duplicated, block: B:171:0x10ae  */
    /* JADX WARN: Code duplicated, block: B:173:0x10ba  */
    /* JADX WARN: Code duplicated, block: B:176:0x10be A[LOOP:5: B:174:0x10bb->B:176:0x10be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:180:0x1141  */
    /* JADX WARN: Code duplicated, block: B:183:0x11a6  */
    /* JADX WARN: Code duplicated, block: B:184:0x11ef  */
    /* JADX WARN: Code duplicated, block: B:187:0x1204  */
    /* JADX WARN: Code duplicated, block: B:189:0x1217  */
    /* JADX WARN: Code duplicated, block: B:18:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:192:0x12ce  */
    /* JADX WARN: Code duplicated, block: B:194:0x12d2  */
    /* JADX WARN: Code duplicated, block: B:200:0x12e2  */
    /* JADX WARN: Code duplicated, block: B:201:0x12e7  */
    /* JADX WARN: Code duplicated, block: B:205:0x136e  */
    /* JADX WARN: Code duplicated, block: B:207:0x1377  */
    /* JADX WARN: Code duplicated, block: B:212:0x13e0  */
    /* JADX WARN: Code duplicated, block: B:213:0x1423  */
    /* JADX WARN: Code duplicated, block: B:216:0x143c  */
    /* JADX WARN: Code duplicated, block: B:220:0x148e  */
    /* JADX WARN: Code duplicated, block: B:224:0x14a3  */
    /* JADX WARN: Code duplicated, block: B:225:0x1523  */
    /* JADX WARN: Code duplicated, block: B:228:0x15a5  */
    /* JADX WARN: Code duplicated, block: B:231:0x160f  */
    /* JADX WARN: Code duplicated, block: B:232:0x1651  */
    /* JADX WARN: Code duplicated, block: B:235:0x1666  */
    /* JADX WARN: Code duplicated, block: B:237:0x166f  */
    /* JADX WARN: Code duplicated, block: B:239:0x172a  */
    /* JADX WARN: Code duplicated, block: B:242:0x1734 A[Catch: all -> 0x331a, TryCatch #8 {all -> 0x331a, blocks: (B:436:0x2ade, B:438:0x2af3, B:439:0x2b24, B:441:0x2b58, B:442:0x2bd2, B:392:0x25fd, B:394:0x2612, B:395:0x2646, B:397:0x2683, B:398:0x270d, B:299:0x1e21, B:301:0x1e36, B:302:0x1e65, B:240:0x172e, B:242:0x1734, B:243:0x175e, B:245:0x1789, B:246:0x181b), top: B:549:0x172e }] */
    /* JADX WARN: Code duplicated, block: B:245:0x1789 A[Catch: all -> 0x331a, TryCatch #8 {all -> 0x331a, blocks: (B:436:0x2ade, B:438:0x2af3, B:439:0x2b24, B:441:0x2b58, B:442:0x2bd2, B:392:0x25fd, B:394:0x2612, B:395:0x2646, B:397:0x2683, B:398:0x270d, B:299:0x1e21, B:301:0x1e36, B:302:0x1e65, B:240:0x172e, B:242:0x1734, B:243:0x175e, B:245:0x1789, B:246:0x181b), top: B:549:0x172e }] */
    /* JADX WARN: Code duplicated, block: B:249:0x182e  */
    /* JADX WARN: Code duplicated, block: B:254:0x1896  */
    /* JADX WARN: Code duplicated, block: B:257:0x18e8  */
    /* JADX WARN: Code duplicated, block: B:261:0x193c  */
    /* JADX WARN: Code duplicated, block: B:263:0x19ad  */
    /* JADX WARN: Code duplicated, block: B:266:0x19fe  */
    /* JADX WARN: Code duplicated, block: B:268:0x1a07  */
    /* JADX WARN: Code duplicated, block: B:271:0x1ac0  */
    /* JADX WARN: Code duplicated, block: B:275:0x1b5c  */
    /* JADX WARN: Code duplicated, block: B:280:0x1bca  */
    /* JADX WARN: Code duplicated, block: B:281:0x1c11  */
    /* JADX WARN: Code duplicated, block: B:284:0x1c29  */
    /* JADX WARN: Code duplicated, block: B:288:0x1c83  */
    /* JADX WARN: Code duplicated, block: B:290:0x1cf4  */
    /* JADX WARN: Code duplicated, block: B:293:0x1d44  */
    /* JADX WARN: Code duplicated, block: B:295:0x1d4d  */
    /* JADX WARN: Code duplicated, block: B:298:0x1e03  */
    /* JADX WARN: Code duplicated, block: B:301:0x1e36 A[Catch: all -> 0x331a, TryCatch #8 {all -> 0x331a, blocks: (B:436:0x2ade, B:438:0x2af3, B:439:0x2b24, B:441:0x2b58, B:442:0x2bd2, B:392:0x25fd, B:394:0x2612, B:395:0x2646, B:397:0x2683, B:398:0x270d, B:299:0x1e21, B:301:0x1e36, B:302:0x1e65, B:240:0x172e, B:242:0x1734, B:243:0x175e, B:245:0x1789, B:246:0x181b), top: B:549:0x172e }] */
    /* JADX WARN: Code duplicated, block: B:305:0x1e7b  */
    /* JADX WARN: Code duplicated, block: B:310:0x1ee9  */
    /* JADX WARN: Code duplicated, block: B:311:0x1f33  */
    /* JADX WARN: Code duplicated, block: B:314:0x1f4d  */
    /* JADX WARN: Code duplicated, block: B:318:0x1fa9  */
    /* JADX WARN: Code duplicated, block: B:320:0x2021  */
    /* JADX WARN: Code duplicated, block: B:323:0x2070  */
    /* JADX WARN: Code duplicated, block: B:325:0x2079  */
    /* JADX WARN: Code duplicated, block: B:329:0x212e  */
    /* JADX WARN: Code duplicated, block: B:331:0x2132  */
    /* JADX WARN: Code duplicated, block: B:337:0x2142  */
    /* JADX WARN: Code duplicated, block: B:338:0x2147  */
    /* JADX WARN: Code duplicated, block: B:342:0x21dd  */
    /* JADX WARN: Code duplicated, block: B:344:0x21e9  */
    /* JADX WARN: Code duplicated, block: B:346:0x21f2  */
    /* JADX WARN: Code duplicated, block: B:351:0x225a  */
    /* JADX WARN: Code duplicated, block: B:352:0x22a3  */
    /* JADX WARN: Code duplicated, block: B:355:0x22c0  */
    /* JADX WARN: Code duplicated, block: B:357:0x230e  */
    /* JADX WARN: Code duplicated, block: B:359:0x231d  */
    /* JADX WARN: Code duplicated, block: B:364:0x2383  */
    /* JADX WARN: Code duplicated, block: B:367:0x23dc  */
    /* JADX WARN: Code duplicated, block: B:373:0x243c  */
    /* JADX WARN: Code duplicated, block: B:375:0x24b2  */
    /* JADX WARN: Code duplicated, block: B:378:0x2500  */
    /* JADX WARN: Code duplicated, block: B:380:0x2509  */
    /* JADX WARN: Code duplicated, block: B:383:0x25bb  */
    /* JADX WARN: Code duplicated, block: B:384:0x25bd  */
    /* JADX WARN: Code duplicated, block: B:386:0x25c1  */
    /* JADX WARN: Code duplicated, block: B:390:0x25cd  */
    /* JADX WARN: Code duplicated, block: B:394:0x2612 A[Catch: all -> 0x331a, TryCatch #8 {all -> 0x331a, blocks: (B:436:0x2ade, B:438:0x2af3, B:439:0x2b24, B:441:0x2b58, B:442:0x2bd2, B:392:0x25fd, B:394:0x2612, B:395:0x2646, B:397:0x2683, B:398:0x270d, B:299:0x1e21, B:301:0x1e36, B:302:0x1e65, B:240:0x172e, B:242:0x1734, B:243:0x175e, B:245:0x1789, B:246:0x181b), top: B:549:0x172e }] */
    /* JADX WARN: Code duplicated, block: B:397:0x2683 A[Catch: all -> 0x331a, TryCatch #8 {all -> 0x331a, blocks: (B:436:0x2ade, B:438:0x2af3, B:439:0x2b24, B:441:0x2b58, B:442:0x2bd2, B:392:0x25fd, B:394:0x2612, B:395:0x2646, B:397:0x2683, B:398:0x270d, B:299:0x1e21, B:301:0x1e36, B:302:0x1e65, B:240:0x172e, B:242:0x1734, B:243:0x175e, B:245:0x1789, B:246:0x181b), top: B:549:0x172e }] */
    /* JADX WARN: Code duplicated, block: B:400:0x2719  */
    /* JADX WARN: Code duplicated, block: B:402:0x2722  */
    /* JADX WARN: Code duplicated, block: B:407:0x2792  */
    /* JADX WARN: Code duplicated, block: B:408:0x27d9  */
    /* JADX WARN: Code duplicated, block: B:411:0x27f1  */
    /* JADX WARN: Code duplicated, block: B:415:0x283f  */
    /* JADX WARN: Code duplicated, block: B:419:0x2854  */
    /* JADX WARN: Code duplicated, block: B:420:0x28bc  */
    /* JADX WARN: Code duplicated, block: B:423:0x293d  */
    /* JADX WARN: Code duplicated, block: B:426:0x29a7  */
    /* JADX WARN: Code duplicated, block: B:427:0x29ef  */
    /* JADX WARN: Code duplicated, block: B:430:0x2a07  */
    /* JADX WARN: Code duplicated, block: B:432:0x2a10  */
    /* JADX WARN: Code duplicated, block: B:435:0x2ac0  */
    /* JADX WARN: Code duplicated, block: B:438:0x2af3 A[Catch: all -> 0x331a, TryCatch #8 {all -> 0x331a, blocks: (B:436:0x2ade, B:438:0x2af3, B:439:0x2b24, B:441:0x2b58, B:442:0x2bd2, B:392:0x25fd, B:394:0x2612, B:395:0x2646, B:397:0x2683, B:398:0x270d, B:299:0x1e21, B:301:0x1e36, B:302:0x1e65, B:240:0x172e, B:242:0x1734, B:243:0x175e, B:245:0x1789, B:246:0x181b), top: B:549:0x172e }] */
    /* JADX WARN: Code duplicated, block: B:441:0x2b58 A[Catch: all -> 0x331a, TryCatch #8 {all -> 0x331a, blocks: (B:436:0x2ade, B:438:0x2af3, B:439:0x2b24, B:441:0x2b58, B:442:0x2bd2, B:392:0x25fd, B:394:0x2612, B:395:0x2646, B:397:0x2683, B:398:0x270d, B:299:0x1e21, B:301:0x1e36, B:302:0x1e65, B:240:0x172e, B:242:0x1734, B:243:0x175e, B:245:0x1789, B:246:0x181b), top: B:549:0x172e }] */
    /* JADX WARN: Code duplicated, block: B:445:0x2be4  */
    /* JADX WARN: Code duplicated, block: B:450:0x2c4c  */
    /* JADX WARN: Code duplicated, block: B:453:0x2ca7  */
    /* JADX WARN: Code duplicated, block: B:457:0x2cfd  */
    /* JADX WARN: Code duplicated, block: B:458:0x2d6c  */
    /* JADX WARN: Code duplicated, block: B:460:0x2d78  */
    /* JADX WARN: Code duplicated, block: B:463:0x2d7c A[LOOP:0: B:461:0x2d79->B:463:0x2d7c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:469:0x3277  */
    /* JADX WARN: Code duplicated, block: B:471:0x3284  */
    /* JADX WARN: Code duplicated, block: B:474:0x3288 A[LOOP:1: B:472:0x3285->B:474:0x3288, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:477:0x3292  */
    /* JADX WARN: Code duplicated, block: B:479:0x329f  */
    /* JADX WARN: Code duplicated, block: B:482:0x32a3 A[LOOP:2: B:480:0x32a0->B:482:0x32a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:487:0x32bb  */
    /* JADX WARN: Code duplicated, block: B:489:0x32c8  */
    /* JADX WARN: Code duplicated, block: B:492:0x32cc A[LOOP:3: B:490:0x32c9->B:492:0x32cc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:497:0x32e4  */
    /* JADX WARN: Code duplicated, block: B:499:0x32f1  */
    /* JADX WARN: Code duplicated, block: B:502:0x32fe  */
    /* JADX WARN: Code duplicated, block: B:505:0x3302 A[LOOP:4: B:503:0x32ff->B:505:0x3302, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:497:0x32e4, please report this as an issue */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context p0, Intent p1) throws Throwable {
        Context applicationContext;
        Object[] objArr;
        String str;
        Object[] objArr2;
        Object[] objArr3;
        int i;
        Object obj;
        Context applicationContext2;
        Object[] objArr4;
        String str2;
        int i2;
        int i3;
        Object[] objArr5;
        int i4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        long j;
        long jLongValue;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object[] objArr6;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        int i5;
        int i6;
        ArrayList arrayList;
        String[] strArr;
        Object[] objArr7;
        int i7;
        int i8;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8;
        long j2;
        long jLongValue2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9;
        Context applicationContext3;
        Object[] objArr8;
        Object[] objArr9;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12;
        int i9;
        int i10;
        Object[] objArr10;
        int i11;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13;
        long j3;
        long jLongValue3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16;
        Object[] objArr11;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19;
        int i12;
        int i13;
        int i14;
        int i15;
        ArrayList arrayList2;
        String[] strArr2;
        int i16;
        Object[] objArr12;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23;
        Object[] objArr13;
        int i17;
        int i18;
        ArrayList arrayList3;
        String[] strArr3;
        int i19;
        Object[] objArr14;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28;
        Object[] objArr15;
        int i20;
        int i21;
        ArrayList arrayList4;
        String[] strArr4;
        int i22;
        Object[] objArr16;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29;
        Context applicationContext4;
        Context applicationContext5;
        Object[] objArr17;
        int i23;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault32;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault33;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault34;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault35;
        ArrayList arrayList5;
        String[] strArr5;
        int i24;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault36;
        String str3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault37;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault38;
        Object[] objArr18;
        Object[] objArr19;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault39;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault40;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault41;
        int i25;
        int i26;
        Object[] objArr20;
        int i27;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault42;
        long j4;
        long jLongValue4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault43;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault44;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault45;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault46;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault47;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault48;
        Object[] objArr21;
        int i28;
        int i29;
        ArrayList arrayList6;
        String[] strArr6;
        Object[] objArr22;
        char c;
        int i30;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault49;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault50;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault51;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault52;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault53;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault54;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault55;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault56;
        int i31 = 2 % 2;
        Object[] objArr23 = new Object[1];
        a(new char[]{57257, 57288, 38886, 19560, 63822, 20021, 65398, 29707, 47410, 55102, 22114, 3403, 4654, 12336, 52516, 41474, 60172, 39180, 42058, 15160, 17428, 57896, 846, 53286, 56590, 19212}, View.combineMeasuredStates(0, 0) + 1, objArr23);
        String str4 = (String) objArr23[0];
        Object[] objArr24 = new Object[1];
        a(new char[]{16634, 16543, 47370, 53546, 1088, 24795, 25137, 35079, 9853, 63966, 52000, 61497, 36215, 7886, 20516, 24363, 29775, 47102, 14617}, 1 - (ViewConfiguration.getTapTimeout() >> 16), objArr24);
        String str5 = (String) objArr24[0];
        Object[] objArr25 = new Object[1];
        a(new char[]{21866, 21760, 63702, 27508, 23715, 8458, 55416, 53749, 13232, 47115, 29051, 43238, 39141, 24413, 59973, 1989, 25029, 63035, 33607, 40669}, 1 - View.resolveSizeAndState(0, 0, 0), objArr25);
        String str6 = (String) objArr25[0];
        Object[] objArr26 = new Object[1];
        a(new char[]{50287, 50182, 36734, 4362, 56035, 22183, 41493, 22458, 41711, 53158, 2832, 11953, 2511, 10426, 36891, 33172, 61680, 33160, 63800, 6293}, -TextUtils.lastIndexOf("", '0', 0), objArr26);
        String str7 = (String) objArr26[0];
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault57 == null) {
            char c2 = (char) (31533 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
            int i32 = 922 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 28;
            short s = $$a[5];
            Object[] objArr27 = new Object[1];
            c(s, (byte) (s & 5), (byte) 52, objArr27);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault57 = initSession.b(c2, i32, windowTouchSlop, -1048449946, false, (String) objArr27[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault57).getLong(null) != -1) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault58 == null) {
                char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 31533);
                int maximumFlingVelocity = 921 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 28;
                byte[] bArr = $$a;
                short s2 = bArr[5];
                byte b2 = bArr[91];
                Object[] objArr28 = new Object[1];
                c(s2, b2, (byte) (b2 - 4), objArr28);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault58 = initSession.b(touchSlop, maximumFlingVelocity, keyRepeatDelay, -1142834547, false, (String) objArr28[0], null);
            }
            Object[] objArr29 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault58).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr29[1])[0]}, (Object[]) objArr29[2], new int[]{((int[]) objArr29[3])[0]}, (String[]) objArr29[4]};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i33 = ~startUptimeMillis;
            int i34 = (((149746270 + (((~((-119115394) | i33)) | 1654964250) * 519)) + (((~(i33 | (-85528194))) | (~(1740492443 | startUptimeMillis))) * (-519))) + (((~(startUptimeMillis | 1654964250)) | 119115393) * 519)) - 713826101;
            int i35 = (i34 << 13) ^ i34;
            int i36 = i35 ^ (i35 >>> 17);
            ((int[]) objArr[0])[0] = i36 ^ (i36 << 5);
        } else {
            if (p0 == null) {
                applicationContext = p0;
            } else if (p0 instanceof ContextWrapper) {
                int i37 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 53;
                b = i37 % 128;
                int i38 = i37 % 2;
                if (((ContextWrapper) p0).getBaseContext() != null) {
                    applicationContext = p0.getApplicationContext();
                } else {
                    applicationContext = null;
                }
            } else {
                applicationContext = p0.getApplicationContext();
            }
            try {
                Object[] objArr30 = {applicationContext, Integer.valueOf(((Integer) Class.forName(str6).getMethod(str7, Object.class).invoke(null, this)).intValue()), 0, -713826101};
                byte[] bArr2 = $$d;
                short s3 = bArr2[40];
                byte b3 = bArr2[35];
                Object[] objArr31 = new Object[1];
                d(s3, b3, (byte) (b3 & 224), objArr31);
                Class<?> cls = Class.forName((String) objArr31[0]);
                Object[] objArr32 = new Object[1];
                d((short) (bArr2[35] - 1), bArr2[18], (byte) (-bArr2[59]), objArr32);
                Object[] objArr33 = (Object[]) cls.getMethod((String) objArr32[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr30);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault59 == null) {
                    char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 31533);
                    int defaultSize = View.getDefaultSize(0, 0) + 921;
                    int i39 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 28;
                    byte[] bArr3 = $$a;
                    short s4 = bArr3[5];
                    byte b4 = bArr3[91];
                    Object[] objArr34 = new Object[1];
                    c(s4, b4, (byte) (b4 - 4), objArr34);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault59 = initSession.b(cResolveSizeAndState, defaultSize, i39, -1142834547, false, (String) objArr34[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault59).set(null, objArr33);
                try {
                    long jLongValue5 = ((Long) Class.forName(str4).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue5);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault60 == null) {
                        char cResolveSizeAndState2 = (char) (31533 - View.resolveSizeAndState(0, 0, 0));
                        int trimmedLength = 921 - TextUtils.getTrimmedLength("");
                        int i40 = 29 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        short s5 = (short) ($$b << 2);
                        byte[] bArr4 = $$a;
                        Object[] objArr35 = new Object[1];
                        c(s5, bArr4[91], bArr4[7], objArr35);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault60 = initSession.b(cResolveSizeAndState2, trimmedLength, i40, -778300370, false, (String) objArr35[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault60).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue5 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault61 == null) {
                        char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 31533);
                        int i41 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 920;
                        int maximumDrawingCacheSize = 28 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        short s6 = $$a[5];
                        Object[] objArr36 = new Object[1];
                        c(s6, (byte) (s6 & 5), (byte) 52, objArr36);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault61 = initSession.b(cNormalizeMetaState, i41, maximumDrawingCacheSize, -1048449946, false, (String) objArr36[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault61).set(null, lValueOf2);
                    objArr = objArr33;
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
        int i42 = ((int[]) objArr[1])[0];
        int i43 = ((int[]) objArr[3])[0];
        if (i43 != i42) {
            ArrayList arrayList7 = new ArrayList();
            String[] strArr7 = (String[]) objArr[4];
            if (strArr7 != null) {
                for (String str8 : strArr7) {
                    int i44 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 73;
                    b = i44 % 128;
                    int i45 = i44 % 2;
                    arrayList7.add(str8);
                }
            }
            throw new RuntimeException(String.valueOf(i43));
        }
        int i46 = ((int[]) objArr[0])[0];
        Object[] objArr37 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
        int iIdentityHashCode = System.identityHashCode(this);
        int i47 = ~iIdentityHashCode;
        int i48 = i46 + ((((~((-77668635) | i47)) | (~(934789083 | iIdentityHashCode))) * 988) - 2084825517) + (((~(iIdentityHashCode | (-916959195))) | 839290560 | (~(i47 | 934789083))) * 988);
        int i49 = (i48 << 13) ^ i48;
        int i50 = i49 ^ (i49 >>> 17);
        ((int[]) objArr37[0])[0] = i50 ^ (i50 << 5);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault62 == null) {
            char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 37567);
            int iIndexOf = 624 - TextUtils.indexOf((CharSequence) "", '0', 0);
            int iRgb = Color.rgb(0, 0, 0) + 16777230;
            short s7 = $$a[5];
            Object[] objArr38 = new Object[1];
            c(s7, (byte) (s7 & 5), (byte) 52, objArr38);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault62 = initSession.b(packedPositionType, iIndexOf, iRgb, -477065106, false, (String) objArr38[0], null);
        }
        long j5 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault62).getLong(null);
        long jLongValue6 = ((Long) Class.forName(str4).getDeclaredMethod(str5, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault63 == null) {
            char packedPositionType2 = (char) (37567 - ExpandableListView.getPackedPositionType(0L));
            int i51 = 626 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            int iRed = 14 - Color.red(0);
            byte[] bArr5 = $$a;
            Object[] objArr39 = new Object[1];
            c((short) 88, bArr5[91], bArr5[7], objArr39);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault63 = initSession.b(packedPositionType2, i51, iRed, -976899241, false, (String) objArr39[0], null);
        }
        if (j5 == ((jLongValue6 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault63).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault64 == null) {
                char trimmedLength2 = (char) (TextUtils.getTrimmedLength("") + 37567);
                int i52 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 624;
                int mode = 14 - View.MeasureSpec.getMode(0);
                short s8 = (short) ($$b << 2);
                byte[] bArr6 = $$a;
                Object[] objArr40 = new Object[1];
                c(s8, bArr6[91], bArr6[7], objArr40);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault64 = initSession.b(trimmedLength2, i52, mode, -973632554, false, (String) objArr40[0], null);
            }
            Object[] objArr41 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault64).get(null);
            int i53 = ((int[]) objArr41[2])[0];
            int i54 = ((int[]) objArr41[0])[0];
            String[] strArr8 = (String[]) objArr41[3];
            int[] iArr = {i53};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i55 = ~iIdentityHashCode2;
            int i56 = (((144344408 + (((~((-762673996) | i55)) | (~((-1061064126) | iIdentityHashCode2))) * 1900)) + (((~(iIdentityHashCode2 | 762673995)) | (~(i55 | 1061064125))) * (-950))) + (((~(i55 | 762673995)) | (~(iIdentityHashCode2 | 1061064125))) * 950)) - 661270607;
            int i57 = (i56 << 13) ^ i56;
            int i58 = i57 ^ (i57 >>> 17);
            ((int[]) objArr2[1])[0] = i58 ^ (i58 << 5);
            objArr2 = new Object[]{new int[]{i54}, new int[1], iArr, strArr8};
            str = str5;
        } else {
            Context applicationContext6 = p0 != null ? ((p0 instanceof ContextWrapper) && ((ContextWrapper) p0).getBaseContext() == null) ? null : p0.getApplicationContext() : p0;
            int iIntValue = ((Integer) Class.forName(str6).getMethod(str7, Object.class).invoke(null, this)).intValue();
            Object[] objArr42 = new Object[1];
            a(new char[]{48669, 48687, 40459, 57700, 62577, 18387, 21112, 31015, 55432, 57048, 64364, 'l', 29644, 14792, 24672, 44891, 35492, 37111, 2387, 13911, 9722, 60343, 44568, 56595, 48364, 17085, 22381, 31720, 55232, 56649, 64564, 687, 28290, 13318, 25974, 43435, 35204, 36663, 2636, 12447, 8376, 58987, 45906, 57307, 48115, 16763, 22610, 26358, 53767, 55383, 65185, 3575, 27916, 13078, 26550, 38071, 33869, 35346, 3208, 13192, 8060, 58662, 46466, 55964, 46643, 31844, 23184, 24976}, -MotionEvent.axisFromString(""), objArr42);
            String str9 = (String) objArr42[0];
            Object[] objArr43 = new Object[1];
            a(new char[]{57821, 57790, 3003, 46819, 61135, 53863, 1533, 25550, 34585, 19263, 44271, 6867, 11344, 44152, 14257, 46514, 54628, 1296, 24275, 11496, 31295, 32261, 63903, 51195, 58156, 55053, 187, 24834, 34823, 18682, 43955, 6169, 12610, 41451, 13052, 45844, 54852, 6788, 24012, 10793, 32637, 29583, 58508, 50486, 58471, 54427, 3975, 31814, 36246, 19894, 43302, 5967, 12948, 42741, 12336, 36433, 56283, 8110, 23310, 10598, 16614, 28872, 57859, 49268, 59888, 59778, 3347, 31530}, View.MeasureSpec.makeMeasureSpec(0, 0) + 1, objArr43);
            Object[] objArr44 = {applicationContext6, new String[]{str9, (String) objArr43[0]}, Integer.valueOf(iIntValue), 17, -661270607};
            byte[] bArr7 = $$d;
            short s9 = (short) (bArr7[35] - 1);
            byte b5 = (byte) (-bArr7[304]);
            Object[] objArr45 = new Object[1];
            d(s9, b5, (byte) (b5 & 232), objArr45);
            Class<?> cls2 = Class.forName((String) objArr45[0]);
            Object[] objArr46 = new Object[1];
            d((short) ($$e - 2), (byte) (-bArr7[13]), bArr7[64], objArr46);
            Object[] objArr47 = (Object[]) cls2.getMethod((String) objArr46[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr44);
            int i59 = ((int[]) objArr47[0])[0];
            int i60 = ((int[]) objArr47[2])[0];
            if (applicationContext6 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault65 == null) {
                    char trimmedLength3 = (char) (TextUtils.getTrimmedLength("") + 37567);
                    int mirror = 673 - AndroidCharacter.getMirror('0');
                    int i61 = 15 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    short s10 = (short) ($$b << 2);
                    byte[] bArr8 = $$a;
                    Object[] objArr48 = new Object[1];
                    c(s10, bArr8[91], bArr8[7], objArr48);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault65 = initSession.b(trimmedLength3, mirror, i61, -973632554, false, (String) objArr48[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault65).set(null, objArr47);
                try {
                    str = str5;
                    long jLongValue7 = ((Long) Class.forName(str4).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf3 = Long.valueOf(jLongValue7);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault66 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf("", "") + 37567);
                        int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 625;
                        int fadingEdgeLength = 14 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        byte[] bArr9 = $$a;
                        Object[] objArr49 = new Object[1];
                        c((short) 88, bArr9[91], bArr9[7], objArr49);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault66 = initSession.b(cIndexOf, touchSlop2, fadingEdgeLength, -976899241, false, (String) objArr49[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault66).set(null, lValueOf3);
                    Long lValueOf4 = Long.valueOf(jLongValue7 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault67 == null) {
                        char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 37567);
                        int mirror2 = AndroidCharacter.getMirror('0') + 577;
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 14;
                        short s11 = $$a[5];
                        Object[] objArr50 = new Object[1];
                        c(s11, (byte) (s11 & 5), (byte) 52, objArr50);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault67 = initSession.b(edgeSlop, mirror2, packedPositionGroup, -477065106, false, (String) objArr50[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault67).set(null, lValueOf4);
                } catch (Exception unused2) {
                    throw new RuntimeException();
                }
            } else {
                objArr47 = objArr47;
                str = str5;
            }
            objArr2 = objArr47;
        }
        int i62 = ((int[]) objArr2[0])[0];
        int i63 = ((int[]) objArr2[2])[0];
        if (i63 == i62) {
            int i64 = ((int[]) objArr2[1])[0];
            int i65 = ((int[]) objArr2[2])[0];
            int i66 = ((int[]) objArr2[0])[0];
            String[] strArr9 = (String[]) objArr2[3];
            int iMyPid = Process.myPid();
            int i67 = i64 + (-2122724920) + (((~(202755290 | iMyPid)) | (-1822424319) | (~(1620982830 | iMyPid))) * (-744)) + (((~iMyPid) | 1313802) * 744) + ((iMyPid | 1822424318) * 744);
            int i68 = (i67 << 13) ^ i67;
            int i69 = i68 ^ (i68 >>> 17);
            ((int[]) objArr3[1])[0] = i69 ^ (i69 << 5);
            objArr3 = new Object[]{new int[]{i66}, new int[1], new int[]{i65}, strArr9};
            i = 0;
        } else {
            ArrayList arrayList8 = new ArrayList();
            String[] strArr10 = (String[]) objArr2[3];
            if (strArr10 != null) {
                for (String str10 : strArr10) {
                    arrayList8.add(str10);
                }
            }
            Toast.makeText((Context) null, i63 / (((i63 - 1) * i63) % 2), 0).show();
            int i70 = ((int[]) objArr2[1])[0];
            int i71 = ((int[]) objArr2[2])[0];
            int i72 = ((int[]) objArr2[0])[0];
            String[] strArr11 = (String[]) objArr2[3];
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i73 = i70 + (-281883150) + (((~(iIdentityHashCode3 | 613110903)) | (-1823208696)) * 305) + (((~((~iIdentityHashCode3) | 613110903)) | (-1210627218)) * 305);
            int i74 = (i73 << 13) ^ i73;
            int i75 = i74 ^ (i74 >>> 17);
            i = 0;
            ((int[]) objArr3[1])[0] = i75 ^ (i75 << 5);
            objArr3 = new Object[]{new int[]{i72}, new int[1], new int[]{i71}, strArr11};
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault68 == null) {
            char trimmedLength4 = (char) TextUtils.getTrimmedLength("");
            int iResolveSizeAndState = 876 - View.resolveSizeAndState(i, i, i);
            int i76 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10;
            byte[] bArr10 = $$a;
            short s12 = bArr10[5];
            byte b6 = bArr10[91];
            Object[] objArr51 = new Object[1];
            c(s12, b6, (byte) (b6 - 4), objArr51);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault68 = initSession.b(trimmedLength4, iResolveSizeAndState, i76, -1650998592, false, (String) objArr51[0], null);
        }
        long j6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault68).getLong(null);
        long jLongValue8 = ((Long) Class.forName(str4).getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault69 == null) {
            char mirror3 = (char) (AndroidCharacter.getMirror('0') - '0');
            int i77 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 876;
            int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 11;
            short s13 = (short) ($$b << 2);
            byte[] bArr11 = $$a;
            Object[] objArr52 = new Object[1];
            c(s13, bArr11[91], bArr11[7], objArr52);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault69 = initSession.b(mirror3, i77, iIndexOf2, 2012020043, false, (String) objArr52[0], null);
        }
        if (j6 != ((jLongValue8 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault69).getLong(null) << 52) >>> 52)) >> 12)) {
            if (p0 == null) {
                obj = null;
                applicationContext2 = p0;
            } else if (p0 instanceof ContextWrapper) {
                int i78 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
                b = i78 % 128;
                if (i78 % 2 != 0) {
                    ((ContextWrapper) p0).getBaseContext();
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (((ContextWrapper) p0).getBaseContext() != null) {
                    obj = null;
                    applicationContext2 = p0.getApplicationContext();
                } else {
                    obj = null;
                    applicationContext2 = null;
                }
            } else {
                obj = null;
                applicationContext2 = p0.getApplicationContext();
            }
            Object[] objArr53 = {applicationContext2, Integer.valueOf(((Integer) Class.forName(str6).getMethod(str7, Object.class).invoke(obj, this)).intValue()), 0, -522713019};
            byte[] bArr12 = $$d;
            Object[] objArr54 = new Object[1];
            d((short) 162, bArr12[28], bArr12[169], objArr54);
            Class<?> cls3 = Class.forName((String) objArr54[0]);
            Object[] objArr55 = new Object[1];
            d((short) 169, bArr12[155], bArr12[64], objArr55);
            objArr4 = (Object[]) cls3.getMethod((String) objArr55[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr53);
            if (applicationContext2 != null) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault70 == null) {
                    char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
                    int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 877;
                    int offsetBefore = 10 - TextUtils.getOffsetBefore("", 0);
                    byte[] bArr13 = $$a;
                    Object[] objArr56 = new Object[1];
                    c((short) 88, bArr13[91], bArr13[7], objArr56);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault70 = initSession.b(cLastIndexOf, modifierMetaStateMask, offsetBefore, 2012931276, false, (String) objArr56[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault70).set(null, objArr4);
                try {
                    str2 = str;
                    long jLongValue9 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf5 = Long.valueOf(jLongValue9);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault71 == null) {
                        char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                        int iRgb2 = Color.rgb(0, 0, 0) + 16778092;
                        int packedPositionType3 = ExpandableListView.getPackedPositionType(0L) + 10;
                        short s14 = (short) ($$b << 2);
                        byte[] bArr14 = $$a;
                        Object[] objArr57 = new Object[1];
                        c(s14, bArr14[91], bArr14[7], objArr57);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault71 = initSession.b(cLastIndexOf2, iRgb2, packedPositionType3, 2012020043, false, (String) objArr57[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault71).set(null, lValueOf5);
                    Long lValueOf6 = Long.valueOf(jLongValue9 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault72 == null) {
                        char touchSlop3 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                        int iMyPid2 = (Process.myPid() >> 22) + 876;
                        int iArgb = Color.argb(0, 0, 0, 0) + 10;
                        byte[] bArr15 = $$a;
                        short s15 = bArr15[5];
                        byte b7 = bArr15[91];
                        Object[] objArr58 = new Object[1];
                        c(s15, b7, (byte) (b7 - 4), objArr58);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault72 = initSession.b(touchSlop3, iMyPid2, iArgb, -1650998592, false, (String) objArr58[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault72).set(null, lValueOf6);
                } catch (Exception unused3) {
                    throw new RuntimeException();
                }
            }
            i2 = ((int[]) objArr4[2])[0];
            i3 = ((int[]) objArr4[0])[0];
            if (i3 == i2) {
                int i79 = ((int[]) objArr4[1])[0];
                objArr5 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[1], new int[]{((int[]) objArr4[2])[0]}, (String[]) objArr4[3]};
                int iIdentityHashCode4 = System.identityHashCode(this);
                int i80 = ~((-537077249) | iIdentityHashCode4);
                int i81 = ~iIdentityHashCode4;
                int i82 = i79 + 2120383296 + ((i80 | (~(1073706687 | i81))) * 497) + (((~(iIdentityHashCode4 | 1073706687)) | (~((-576939669) | i81)) | 39862420) * 497);
                int i83 = (i82 << 13) ^ i82;
                int i84 = i83 ^ (i83 >>> 17);
                ((int[]) objArr5[1])[0] = i84 ^ (i84 << 5);
                i4 = 0;
            } else {
                int[] iArr2 = new int[i3];
                int i85 = i3 - 1;
                iArr2[i85] = 1;
                Toast.makeText((Context) null, iArr2[((i3 * i85) % 2) - 1], 1).show();
                int i86 = ((int[]) objArr4[1])[0];
                objArr5 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[1], new int[]{((int[]) objArr4[2])[0]}, (String[]) objArr4[3]};
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i87 = i86 + 167148736 + (((~((~iUptimeMillis) | (-474374403))) | (~((-10552465) | iUptimeMillis))) * (-302)) + ((~((-474374403) | iUptimeMillis)) * (-604)) + (((~(iUptimeMillis | (-484926867))) | (-535789560)) * 302);
                int i88 = (i87 << 13) ^ i87;
                int i89 = i88 ^ (i88 >>> 17);
                i4 = 0;
                ((int[]) objArr5[1])[0] = i89 ^ (i89 << 5);
            }
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cResolveSizeAndState3 = (char) View.resolveSizeAndState(i4, i4, i4);
                int bitsPerPixel = 875 - ImageFormat.getBitsPerPixel(i4);
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', i4, i4) + 11;
                byte[] bArr16 = $$a;
                Object[] objArr59 = new Object[1];
                c((short) 140, bArr16[88], (byte) (bArr16[1] - 1), objArr59);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSizeAndState3, bitsPerPixel, iLastIndexOf, -1199417970, false, (String) objArr59[0], null);
            }
            j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            jLongValue = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char mode2 = (char) View.MeasureSpec.getMode(0);
                int edgeSlop2 = 876 - (ViewConfiguration.getEdgeSlop() >> 16);
                int i90 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 9;
                Object[] objArr60 = new Object[1];
                c((short) 150, $$a[14], (byte) 52, objArr60);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(mode2, edgeSlop2, i90, 254769921, false, (String) objArr60[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                    char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int iLastIndexOf2 = 875 - TextUtils.lastIndexOf("", '0', 0, 0);
                    int maximumDrawingCacheSize2 = 10 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    byte[] bArr17 = $$a;
                    Object[] objArr61 = new Object[1];
                    c((short) 150, bArr17[88], bArr17[81], objArr61);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(scrollBarFadeDuration, iLastIndexOf2, maximumDrawingCacheSize2, 1324201839, false, (String) objArr61[0], null);
                }
                Object[] objArr62 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).get(null);
                objArr6 = new Object[]{new int[]{((int[]) objArr62[0])[0]}, new int[1], new int[]{((int[]) objArr62[2])[0]}, (String[]) objArr62[3]};
                int i91 = (int) Runtime.getRuntime().totalMemory();
                int i92 = ((190876722 + (((~((-75505670) | i91)) | (~((-35195441) | i91))) * 69)) + (((~(i91 | (-976870393))) | ((~((-1017180622) | i91)) | 941674952)) * (-69))) - 1673041787;
                int i93 = (i92 << 13) ^ i92;
                int i94 = i93 ^ (i93 >>> 17);
                ((int[]) objArr6[1])[0] = i94 ^ (i94 << 5);
            } else {
                Object[] objArr63 = {Integer.valueOf(((Integer) Class.forName(str6).getMethod(str7, Object.class).invoke(null, this)).intValue()), -2073537541};
                byte[] bArr18 = $$d;
                byte b8 = (byte) (bArr18[52] + 1);
                Object[] objArr64 = new Object[1];
                d((short) 206, b8, (byte) (b8 + 2), objArr64);
                Class<?> cls4 = Class.forName((String) objArr64[0]);
                Object[] objArr65 = new Object[1];
                d((short) 169, bArr18[155], bArr18[64], objArr65);
                objArr6 = (Object[]) cls4.getMethod((String) objArr65[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr63);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cLastIndexOf3 = (char) (TextUtils.lastIndexOf("", '0') + 1);
                    int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0') + 877;
                    int packedPositionGroup2 = 10 - ExpandableListView.getPackedPositionGroup(0L);
                    byte[] bArr19 = $$a;
                    Object[] objArr66 = new Object[1];
                    c((short) 150, bArr19[88], bArr19[81], objArr66);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf3, iIndexOf3, packedPositionGroup2, 1324201839, false, (String) objArr66[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArr6);
                try {
                    long jLongValue10 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf7 = Long.valueOf(jLongValue10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cMyPid = (char) (Process.myPid() >> 22);
                        int iLastIndexOf3 = 875 - TextUtils.lastIndexOf("", '0');
                        int deadChar = 10 - KeyEvent.getDeadChar(0, 0);
                        Object[] objArr67 = new Object[1];
                        c((short) 150, $$a[14], (byte) 52, objArr67);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMyPid, iLastIndexOf3, deadChar, 254769921, false, (String) objArr67[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf7);
                    Long lValueOf8 = Long.valueOf(jLongValue10 >> 12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c3 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                        int scrollDefaultDelay = 876 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int maxKeyCode = 10 - (KeyEvent.getMaxKeyCode() >> 16);
                        byte[] bArr20 = $$a;
                        Object[] objArr68 = new Object[1];
                        c((short) 140, bArr20[88], (byte) (bArr20[1] - 1), objArr68);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c3, scrollDefaultDelay, maxKeyCode, -1199417970, false, (String) objArr68[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf8);
                } catch (Exception unused4) {
                    throw new RuntimeException();
                }
            }
            i5 = ((int[]) objArr6[2])[0];
            i6 = ((int[]) objArr6[0])[0];
            if (i6 == i5) {
                int i95 = ((int[]) objArr6[1])[0];
                objArr7 = new Object[]{new int[]{((int[]) objArr6[0])[0]}, new int[1], new int[]{((int[]) objArr6[2])[0]}, (String[]) objArr6[3]};
                int iIdentityHashCode5 = System.identityHashCode(this);
                int i96 = i95 + (-27710124) + (((-42485771) | (~iIdentityHashCode5)) * (-490)) + (((~(iIdentityHashCode5 | 141932405)) | (-184418176)) * 490) + 895422066;
                int i97 = (i96 << 13) ^ i96;
                int i98 = i97 ^ (i97 >>> 17);
                i7 = 0;
                ((int[]) objArr7[1])[0] = i98 ^ (i98 << 5);
            } else {
                arrayList = new ArrayList();
                strArr = (String[]) objArr6[3];
                if (strArr != null) {
                    for (String str11 : strArr) {
                        arrayList.add(str11);
                    }
                }
                int[] iArr3 = new int[i6];
                int i99 = i6 - 1;
                iArr3[i99] = 1;
                Toast.makeText((Context) null, iArr3[((i6 * i99) % 2) - 1], 1).show();
                int i100 = ((int[]) objArr6[1])[0];
                objArr7 = new Object[]{new int[]{((int[]) objArr6[0])[0]}, new int[1], new int[]{((int[]) objArr6[2])[0]}, (String[]) objArr6[3]};
                int i101 = ~(System.identityHashCode(this) | 589278406);
                int i102 = i100 + ((((-61291064) | i101) * (-658)) - 2123609260) + ((i101 | (-599768824)) * 658);
                int i103 = (i102 << 13) ^ i102;
                int i104 = i103 ^ (i103 >>> 17);
                i7 = 0;
                ((int[]) objArr7[1])[0] = i104 ^ (i104 << 5);
            }
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                char c4 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int iNormalizeMetaState = KeyEvent.normalizeMetaState(i7) + 876;
                int minimumFlingVelocity = 10 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                short s16 = $$a[5];
                Object[] objArr69 = new Object[1];
                c(s16, (byte) (s16 & 5), (byte) 52, objArr69);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c4, iNormalizeMetaState, minimumFlingVelocity, 252381699, false, (String) objArr69[0], null);
            }
            j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).getLong(null);
            jLongValue2 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char c5 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int longPressTimeout = 876 - (ViewConfiguration.getLongPressTimeout() >> 16);
                int i105 = 9 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                short s17 = (short) ($$b | 148);
                byte[] bArr21 = $$a;
                Object[] objArr70 = new Object[1];
                c(s17, bArr21[91], bArr21[7], objArr70);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c5, longPressTimeout, i105, 2009631821, false, (String) objArr70[0], null);
            }
            if (j2 == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null) << 52) >>> 52)) >> 12)) {
                int i106 = b + 23;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i106 % 128;
                int i107 = i106 % 2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                    char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                    int i108 = 875 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    int i109 = 9 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    byte b9 = $$a[7];
                    Object[] objArr71 = new Object[1];
                    c((short) 209, b9, (byte) (b9 | 52), objArr71);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(cIndexOf2, i108, i109, 256017550, false, (String) objArr71[0], null);
                }
                Object[] objArr72 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).get(null);
                objArr9 = new Object[]{new int[]{((int[]) objArr72[0])[0]}, new int[1], new int[]{((int[]) objArr72[2])[0]}, (String[]) objArr72[3]};
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                int i110 = (((~(123971228 | iFreeMemory)) | (-245963502)) * 398) + 1419832078 + (((~((~iFreeMemory) | 123971228)) | (-245963502)) * 398) + 1379959994;
                int i111 = (i110 << 13) ^ i110;
                int i112 = i111 ^ (i111 >>> 17);
                ((int[]) objArr9[1])[0] = i112 ^ (i112 << 5);
            } else {
                if (p0 != null) {
                    applicationContext3 = p0;
                } else if ((p0 instanceof ContextWrapper) || ((ContextWrapper) p0).getBaseContext() != null) {
                    applicationContext3 = p0.getApplicationContext();
                } else {
                    applicationContext3 = null;
                }
                Object[] objArr73 = {applicationContext3, Integer.valueOf(((Integer) Class.forName(str6).getMethod(str7, Object.class).invoke(null, this)).intValue()), 1379959994};
                byte[] bArr22 = $$d;
                byte b10 = (byte) (bArr22[203] + 1);
                Object[] objArr74 = new Object[1];
                d((short) 236, b10, (byte) (b10 & 240), objArr74);
                Class<?> cls5 = Class.forName((String) objArr74[0]);
                Object[] objArr75 = new Object[1];
                d((short) 169, bArr22[155], bArr22[64], objArr75);
                objArr8 = (Object[]) cls5.getMethod((String) objArr75[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr73);
                if (applicationContext3 != null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                        int packedPositionGroup3 = ExpandableListView.getPackedPositionGroup(0L) + 876;
                        int iMyTid = (Process.myTid() >> 22) + 10;
                        byte b11 = $$a[7];
                        Object[] objArr76 = new Object[1];
                        c((short) 209, b11, (byte) (b11 | 52), objArr76);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(tapTimeout, packedPositionGroup3, iMyTid, 256017550, false, (String) objArr76[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, objArr8);
                    try {
                        long jLongValue11 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf9 = Long.valueOf(jLongValue11);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                            char cNormalizeMetaState2 = (char) KeyEvent.normalizeMetaState(0);
                            int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 877;
                            int iAxisFromString = MotionEvent.axisFromString("") + 11;
                            short s18 = (short) ($$b | 148);
                            byte[] bArr23 = $$a;
                            Object[] objArr77 = new Object[1];
                            c(s18, bArr23[91], bArr23[7], objArr77);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cNormalizeMetaState2, iIndexOf4, iAxisFromString, 2009631821, false, (String) objArr77[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).set(null, lValueOf9);
                        Long lValueOf10 = Long.valueOf(jLongValue11 >> 12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                            char c6 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                            int offsetAfter = 876 - TextUtils.getOffsetAfter("", 0);
                            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 10;
                            short s19 = $$a[5];
                            Object[] objArr78 = new Object[1];
                            c(s19, (byte) (s19 & 5), (byte) 52, objArr78);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c6, offsetAfter, threadPriority, 252381699, false, (String) objArr78[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, lValueOf10);
                    } catch (Exception unused5) {
                        throw new RuntimeException();
                    }
                } else {
                    objArr8 = objArr8;
                }
                objArr9 = objArr8;
            }
            i9 = ((int[]) objArr9[2])[0];
            i10 = ((int[]) objArr9[0])[0];
            if (i10 == i9) {
                int i113 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
                b = i113 % 128;
                int i114 = i113 % 2;
                int i115 = ((int[]) objArr9[1])[0];
                objArr10 = new Object[]{new int[]{((int[]) objArr9[0])[0]}, new int[1], new int[]{((int[]) objArr9[2])[0]}, (String[]) objArr9[3]};
                int iIdentityHashCode6 = System.identityHashCode(this);
                int i116 = ~(552676834 | iIdentityHashCode6);
                int i117 = i115 + (-1241845002) + (((-1056652784) | i116) * (-814)) + ((i116 | (~((~iIdentityHashCode6) | 512366605)) | 8390656) * 407) + (((~(iIdentityHashCode6 | (-512366606))) | (~((-552676835) | iIdentityHashCode6)) | 8390656) * 407);
                int i118 = i117 ^ (i117 << 13);
                int i119 = i118 ^ (i118 >>> 17);
                ((int[]) objArr10[1])[0] = i119 ^ (i119 << 5);
                i11 = 0;
            } else {
                int[] iArr4 = new int[i10];
                int i120 = i10 - 1;
                iArr4[i120] = 1;
                Toast.makeText((Context) null, iArr4[((i10 * i120) % 2) - 1], 1).show();
                int i121 = ((int[]) objArr9[1])[0];
                objArr10 = new Object[]{new int[]{((int[]) objArr9[0])[0]}, new int[1], new int[]{((int[]) objArr9[2])[0]}, (String[]) objArr9[3]};
                int i122 = ~System.identityHashCode(this);
                int i123 = i121 + (-449024284) + (((~((-565395155) | i122)) | 525084925) * (-933)) + (((~(i122 | 525084925)) | (-1073692416)) * 933) + 1794941953;
                int i124 = (i123 << 13) ^ i123;
                int i125 = i124 ^ (i124 >>> 17);
                i11 = 0;
                ((int[]) objArr10[1])[0] = i125 ^ (i125 << 5);
            }
            objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                char maximumFlingVelocity2 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int iAlpha = Color.alpha(i11) + 651;
                int i126 = 45 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                short s20 = (short) ($$b | 148);
                byte[] bArr24 = $$a;
                Object[] objArr79 = new Object[1];
                c(s20, bArr24[91], bArr24[7], objArr79);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(maximumFlingVelocity2, iAlpha, i126, -459846511, false, (String) objArr79[0], null);
            }
            j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).getLong(null);
            jLongValue3 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                char windowTouchSlop2 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                int tapTimeout2 = 651 - (ViewConfiguration.getTapTimeout() >> 16);
                int iIndexOf5 = 43 - TextUtils.indexOf((CharSequence) "", '0');
                short s21 = $$a[5];
                Object[] objArr80 = new Object[1];
                c(s21, (byte) (s21 & 5), (byte) 52, objArr80);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(windowTouchSlop2, tapTimeout2, iIndexOf5, -873460649, false, (String) objArr80[0], null);
            }
            if (j3 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).getLong(null) << 52) >>> 52)) >> 12)) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                    char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                    int iResolveOpacity = 651 - Drawable.resolveOpacity(0, 0);
                    int threadPriority2 = ((Process.getThreadPriority(0) + 20) >> 6) + 44;
                    byte[] bArr25 = $$a;
                    short s22 = bArr25[5];
                    byte b12 = bArr25[91];
                    Object[] objArr81 = new Object[1];
                    c(s22, b12, (byte) (b12 - 4), objArr81);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(cMakeMeasureSpec, iResolveOpacity, threadPriority2, -1595579076, false, (String) objArr81[0], null);
                }
                Object[] objArr82 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).get(null);
                objArr11 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i127 = ((int[]) objArr82[2])[0];
                int i128 = ((int[]) objArr82[0])[0];
                int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
                int i129 = ~startUptimeMillis2;
                int i130 = 1852704781 + (((~(937121162 | i129)) | (-940551973) | (~((-937121163) | startUptimeMillis2))) * (-564)) + ((~(startUptimeMillis2 | (-806028545))) * 1128) + (((~((-940551973) | i129)) | 131092618) * 564) + 574201108;
                int i131 = (i130 << 13) ^ i130;
                int i132 = i131 ^ (i131 >>> 17);
                ((int[]) objArr11[3])[0] = i132 ^ (i132 << 5);
                i12 = 0;
            } else {
                try {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b((char) Color.red(0), TextUtils.indexOf((CharSequence) "", '0') + 1611, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 26, 2145681644, false, null, new Class[0]);
                    }
                    Object[] objArr83 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).newInstance(null), 574201108, 0};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                        char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                        int packedPositionType4 = ExpandableListView.getPackedPositionType(0L) + 651;
                        int i133 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44;
                        short s23 = $$a[5];
                        Object[] objArr84 = new Object[1];
                        c(s23, (byte) (s23 & 5), (byte) 52, objArr84);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cKeyCodeFromString, packedPositionType4, i133, 2075921419, false, (String) objArr84[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getTapTimeout() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 695, View.getDefaultSize(0, 0) + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Gravity.getAbsoluteGravity(0, 0) + 63406), 794 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 83), Integer.TYPE, Integer.TYPE});
                    }
                    objArr11 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).invoke(null, objArr83);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                        char packedPositionGroup4 = (char) ExpandableListView.getPackedPositionGroup(0L);
                        int iResolveOpacity2 = Drawable.resolveOpacity(0, 0) + 651;
                        int defaultSize2 = View.getDefaultSize(0, 0) + 44;
                        byte[] bArr26 = $$a;
                        short s24 = bArr26[5];
                        byte b13 = bArr26[91];
                        Object[] objArr85 = new Object[1];
                        c(s24, b13, (byte) (b13 - 4), objArr85);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(packedPositionGroup4, iResolveOpacity2, defaultSize2, -1595579076, false, (String) objArr85[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, objArr11);
                    try {
                        long jLongValue12 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf11 = Long.valueOf(jLongValue12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                            char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                            int edgeSlop3 = 651 - (ViewConfiguration.getEdgeSlop() >> 16);
                            int iGreen = Color.green(0) + 44;
                            short s25 = $$a[5];
                            Object[] objArr86 = new Object[1];
                            c(s25, (byte) (s25 & 5), (byte) 52, objArr86);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(cResolveOpacity, edgeSlop3, iGreen, -873460649, false, (String) objArr86[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).set(null, lValueOf11);
                        Long lValueOf12 = Long.valueOf(jLongValue12 >> 12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                            char cMakeMeasureSpec2 = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                            int iResolveSizeAndState2 = 651 - View.resolveSizeAndState(0, 0, 0);
                            int iResolveOpacity3 = Drawable.resolveOpacity(0, 0) + 44;
                            short s26 = (short) ($$b | 148);
                            byte[] bArr27 = $$a;
                            Object[] objArr87 = new Object[1];
                            c(s26, bArr27[91], bArr27[7], objArr87);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(cMakeMeasureSpec2, iResolveSizeAndState2, iResolveOpacity3, -459846511, false, (String) objArr87[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).set(null, lValueOf12);
                        i12 = 0;
                    } catch (Exception unused6) {
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
            i13 = ((int[]) objArr11[i12])[i12];
            i14 = ((int[]) objArr11[2])[i12];
            if (i14 == i13) {
                i15 = i12;
                arrayList2 = new ArrayList();
                strArr2 = (String[]) objArr11[1];
                if (strArr2 != null) {
                    int i134 = b + 121;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i134 % 128;
                    for (i16 = i134 % 2 != 0 ? i15 : 1; i16 < strArr2.length; i16++) {
                        arrayList2.add(strArr2[i16]);
                    }
                }
                throw new RuntimeException(String.valueOf(i14));
            }
            objArr12 = new Object[4];
            int[] iArr5 = new int[1];
            objArr12[i12] = iArr5;
            int[] iArr6 = new int[1];
            objArr12[2] = iArr6;
            objArr12[3] = new int[1];
            int i135 = ((int[]) objArr11[3])[i12];
            int i136 = ((int[]) objArr11[2])[i12];
            int i137 = ((int[]) objArr11[i12])[i12];
            iArr6[i12] = i136;
            iArr5[i12] = i137;
            objArr12[1] = new String[i12];
            int iIdentityHashCode7 = System.identityHashCode(this);
            int i138 = ~iIdentityHashCode7;
            int i139 = i135 + 1272830139 + (((~(185178769 | i138)) | (~((-188609580) | iIdentityHashCode7))) * (-370)) + (((~(iIdentityHashCode7 | 185178769)) | (~(i138 | (-188609580))) | 2704) * (-370)) + 1000480;
            int i140 = (i139 << 13) ^ i139;
            int i141 = i140 ^ (i140 >>> 17);
            ((int[]) objArr12[3])[0] = i141 ^ (i141 << 5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                char doubleTapTimeout = (char) (43042 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 3111;
                int size = View.MeasureSpec.getSize(0) + 22;
                byte[] bArr28 = $$a;
                Object[] objArr88 = new Object[1];
                c((short) 88, bArr28[91], bArr28[7], objArr88);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(doubleTapTimeout, doubleTapTimeout2, size, -1272852037, false, (String) objArr88[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).getLong(null) != -1) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
                    char edgeSlop4 = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 43042);
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 3111;
                    int pressedStateDuration = 22 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    byte[] bArr29 = $$a;
                    short s27 = bArr29[5];
                    byte b14 = bArr29[91];
                    Object[] objArr89 = new Object[1];
                    c(s27, b14, (byte) (b14 - 4), objArr89);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(edgeSlop4, iMakeMeasureSpec, pressedStateDuration, 154975793, false, (String) objArr89[0], null);
                }
                Object[] objArr90 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).get(null);
                int i142 = ((int[]) objArr90[2])[0];
                int i143 = ((int[]) objArr90[1])[0];
                String[] strArr12 = (String[]) objArr90[3];
                int[] iArr7 = {i143};
                int iIdentityHashCode8 = System.identityHashCode(this);
                int i144 = (((755369894 + (((~(1196760742 | iIdentityHashCode8)) | 403341400) * (-140))) + ((~(1600102142 | iIdentityHashCode8)) * 70)) + (((~(iIdentityHashCode8 | 508270716)) | 1495172826) * 70)) - 1442388011;
                int i145 = (i144 << 13) ^ i144;
                int i146 = i145 ^ (i145 >>> 17);
                ((int[]) objArr13[0])[0] = i146 ^ (i146 << 5);
                objArr13 = new Object[]{new int[1], iArr7, new int[]{i142}, strArr12};
            } else {
                Object[] objArr91 = {null, Integer.valueOf(((Integer) Class.forName(str6).getMethod(str7, Object.class).invoke(null, this)).intValue()), 0, -1442388011};
                int i147 = $$e;
                byte b15 = (byte) (i147 | 9);
                Object[] objArr92 = new Object[1];
                d((short) 277, b15, (byte) (b15 & 175), objArr92);
                Class<?> cls6 = Class.forName((String) objArr92[0]);
                byte[] bArr30 = $$d;
                Object[] objArr93 = new Object[1];
                d((short) (i147 - 2), (byte) (-bArr30[13]), bArr30[64], objArr93);
                Object[] objArr94 = (Object[]) cls6.getMethod((String) objArr93[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr91);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                    char bitsPerPixel2 = (char) (ImageFormat.getBitsPerPixel(0) + 43043);
                    int i148 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3110;
                    int iResolveSizeAndState3 = View.resolveSizeAndState(0, 0, 0) + 22;
                    byte[] bArr31 = $$a;
                    short s28 = bArr31[5];
                    byte b16 = bArr31[91];
                    Object[] objArr95 = new Object[1];
                    c(s28, b16, (byte) (b16 - 4), objArr95);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(bitsPerPixel2, i148, iResolveSizeAndState3, 154975793, false, (String) objArr95[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).set(null, objArr94);
                try {
                    long jLongValue13 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf13 = Long.valueOf(jLongValue13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                        char cAxisFromString = (char) (43041 - MotionEvent.axisFromString(""));
                        int iArgb2 = 3111 - Color.argb(0, 0, 0, 0);
                        int iIndexOf6 = 21 - TextUtils.indexOf((CharSequence) "", '0');
                        short s29 = (short) ($$b << 2);
                        byte[] bArr32 = $$a;
                        Object[] objArr96 = new Object[1];
                        c(s29, bArr32[91], bArr32[7], objArr96);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(cAxisFromString, iArgb2, iIndexOf6, -1269618118, false, (String) objArr96[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).set(null, lValueOf13);
                    Long lValueOf14 = Long.valueOf(jLongValue13 >> 12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                        char cNormalizeMetaState3 = (char) (43042 - KeyEvent.normalizeMetaState(0));
                        int iAxisFromString2 = MotionEvent.axisFromString("") + 3112;
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 22;
                        byte[] bArr33 = $$a;
                        Object[] objArr97 = new Object[1];
                        c((short) 88, bArr33[91], bArr33[7], objArr97);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(cNormalizeMetaState3, iAxisFromString2, absoluteGravity, -1272852037, false, (String) objArr97[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).set(null, lValueOf14);
                    objArr13 = objArr94;
                } catch (Exception unused7) {
                    throw new RuntimeException();
                }
            }
            i17 = ((int[]) objArr13[1])[0];
            i18 = ((int[]) objArr13[2])[0];
            if (i18 == i17) {
                arrayList3 = new ArrayList();
                strArr3 = (String[]) objArr13[3];
                if (strArr3 != null) {
                    for (String str12 : strArr3) {
                        arrayList3.add(str12);
                    }
                }
                throw new RuntimeException(String.valueOf(i18));
            }
            int i149 = ((int[]) objArr13[0])[0];
            int i150 = ((int[]) objArr13[2])[0];
            int i151 = ((int[]) objArr13[1])[0];
            String[] strArr13 = (String[]) objArr13[3];
            int[] iArr8 = {i151};
            int i152 = ~((int) Process.getStartUptimeMillis());
            int i153 = ~(939703838 | i152);
            int i154 = i149 + 1189726410 + ((i153 | 765327620) * 764) + (((~(i152 | 765327620)) | 268568090) * (-1528)) + ((362759962 | i153) * 764);
            int i155 = (i154 << 13) ^ i154;
            int i156 = i155 ^ (i155 >>> 17);
            ((int[]) objArr14[0])[0] = i156 ^ (i156 << 5);
            objArr14 = new Object[]{new int[1], iArr8, new int[]{i150}, strArr13};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                char cGreen = (char) (Color.green(0) + 29944);
                int touchSlop4 = (ViewConfiguration.getTouchSlop() >> 8) + 1755;
                int i157 = 23 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                byte[] bArr34 = $$a;
                short s30 = bArr34[5];
                byte b17 = bArr34[91];
                Object[] objArr98 = new Object[1];
                c(s30, b17, (byte) (b17 - 4), objArr98);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(cGreen, touchSlop4, i157, 986134021, false, (String) objArr98[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).getLong(null) != -1) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
                    char keyRepeatDelay2 = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 29944);
                    int iAxisFromString3 = MotionEvent.axisFromString("") + 1756;
                    int iLastIndexOf4 = TextUtils.lastIndexOf("", '0', 0, 0) + 24;
                    short s31 = (short) ($$b << 2);
                    byte[] bArr35 = $$a;
                    Object[] objArr99 = new Object[1];
                    c(s31, bArr35[91], bArr35[7], objArr99);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(keyRepeatDelay2, iAxisFromString3, iLastIndexOf4, 1599039318, false, (String) objArr99[0], null);
                }
                Object[] objArr100 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).get(null);
                objArr15 = new Object[]{new int[]{((int[]) objArr100[0])[0]}, new int[]{((int[]) objArr100[1])[0]}, (Object[]) objArr100[2], new int[1], (String[]) objArr100[4]};
                int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
                int i158 = (((-1533320075) + (((~((-409530881) | iUptimeMillis2)) | 622133306) * (-756))) + (((~iUptimeMillis2) | (-409530881)) * 756)) - 151240364;
                int i159 = (i158 << 13) ^ i158;
                int i160 = i159 ^ (i159 >>> 17);
                ((int[]) objArr15[3])[0] = i160 ^ (i160 << 5);
                objArr14 = objArr14;
            } else {
                int iIntValue2 = ((Integer) Class.forName(str6).getMethod(str7, Object.class).invoke(null, this)).intValue();
                Object[] objArr101 = {-206576362};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b((char) (KeyEvent.getDeadChar(0, 0) + 42049), (Process.myPid() >> 22) + 1726, View.getDefaultSize(0, 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da = CaptureSession1.Companion.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue2, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).newInstance(objArr101), -151240364);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                    char c7 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 29943);
                    int iBlue = Color.blue(0) + 1755;
                    int iGreen2 = 23 - Color.green(0);
                    short s32 = (short) ($$b << 2);
                    byte[] bArr36 = $$a;
                    Object[] objArr102 = new Object[1];
                    c(s32, bArr36[91], bArr36[7], objArr102);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(c7, iBlue, iGreen2, 1599039318, false, (String) objArr102[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
                try {
                    long jLongValue14 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf15 = Long.valueOf(jLongValue14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                        char bitsPerPixel3 = (char) (ImageFormat.getBitsPerPixel(0) + 29945);
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 1755;
                        int i161 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23;
                        short s33 = (short) ($$b | 148);
                        byte[] bArr37 = $$a;
                        Object[] objArr103 = new Object[1];
                        c(s33, bArr37[91], bArr37[7], objArr103);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(bitsPerPixel3, scrollBarSize, i161, 1596667560, false, (String) objArr103[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).set(null, lValueOf15);
                    Long lValueOf16 = Long.valueOf(jLongValue14 >> 12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                        char scrollDefaultDelay2 = (char) (29944 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                        int i162 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1754;
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 23;
                        byte[] bArr38 = $$a;
                        short s34 = bArr38[5];
                        byte b18 = bArr38[91];
                        Object[] objArr104 = new Object[1];
                        c(s34, b18, (byte) (b18 - 4), objArr104);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(scrollDefaultDelay2, i162, iKeyCodeFromString, 986134021, false, (String) objArr104[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).set(null, lValueOf16);
                    objArr15 = objArrTuitionPaymentFragmentbindingInflater1$5f1425da;
                } catch (Exception unused8) {
                    throw new RuntimeException();
                }
            }
            i20 = ((int[]) objArr15[1])[0];
            i21 = ((int[]) objArr15[0])[0];
            if (i21 == i20) {
                arrayList4 = new ArrayList();
                strArr4 = (String[]) objArr15[4];
                if (strArr4 != null) {
                    for (String str13 : strArr4) {
                        arrayList4.add(str13);
                    }
                }
                throw new RuntimeException(String.valueOf(i21));
            }
            int i163 = ((int[]) objArr15[3])[0];
            objArr16 = new Object[]{new int[]{((int[]) objArr15[0])[0]}, new int[]{((int[]) objArr15[1])[0]}, (Object[]) objArr15[2], new int[1], (String[]) objArr15[4]};
            int iNextInt = new Random().nextInt(2003103873);
            int i164 = i163 + ((~((~iNextInt) | 903813063)) * 130) + 559781703 + (((~(iNextInt | 903813063)) | 9110785) * 130);
            int i165 = (i164 << 13) ^ i164;
            int i166 = i165 ^ (i165 >>> 17);
            ((int[]) objArr16[3])[0] = i166 ^ (i166 << 5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                char c8 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int scrollBarSize2 = (ViewConfiguration.getScrollBarSize() >> 8) + 2267;
                int iKeyCodeFromString2 = KeyEvent.keyCodeFromString("") + 33;
                short s35 = (short) ($$b << 2);
                byte[] bArr39 = $$a;
                Object[] objArr105 = new Object[1];
                c(s35, bArr39[91], bArr39[7], objArr105);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(c8, scrollBarSize2, iKeyCodeFromString2, -887667012, false, (String) objArr105[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).getLong(null) != -1) {
                applicationContext4 = p0;
                if (applicationContext4 != null) {
                    applicationContext5 = applicationContext4;
                } else if ((applicationContext4 instanceof ContextWrapper) || ((ContextWrapper) applicationContext4).getBaseContext() != null) {
                    applicationContext5 = p0.getApplicationContext();
                } else {
                    applicationContext5 = null;
                }
                Object[] objArr106 = {applicationContext5, Integer.valueOf(((Integer) Class.forName(str6).getMethod(str7, Object.class).invoke(null, this)).intValue()), 0, -1814298819};
                byte[] bArr40 = $$d;
                Object[] objArr107 = new Object[1];
                d((short) 398, bArr40[37], bArr40[18], objArr107);
                Class<?> cls7 = Class.forName((String) objArr107[0]);
                Object[] objArr108 = new Object[1];
                d((short) 407, (byte) (-bArr40[13]), bArr40[64], objArr108);
                objArr17 = (Object[]) cls7.getMethod((String) objArr108[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr106);
                if (applicationContext5 != null) {
                    i23 = b + 93;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i23 % 128;
                    try {
                        if (i23 % 2 == 0) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                                char deadChar2 = (char) KeyEvent.getDeadChar(0, 0);
                                int maximumFlingVelocity3 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2267;
                                int bitsPerPixel4 = ImageFormat.getBitsPerPixel(0) + 34;
                                byte[] bArr41 = $$a;
                                short s36 = bArr41[5];
                                byte b19 = bArr41[91];
                                Object[] objArr109 = new Object[1];
                                c(s36, b19, (byte) (b19 - 4), objArr109);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(deadChar2, maximumFlingVelocity3, bitsPerPixel4, -654680577, false, (String) objArr109[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).set(null, objArr17);
                            long jLongValue15 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[1]).invoke(null, new Object[1])).longValue();
                            Long lValueOf17 = Long.valueOf(jLongValue15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
                                char cAxisFromString2 = (char) (MotionEvent.axisFromString("") + 1);
                                int jumpTapTimeout = 2267 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                                int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 33;
                                byte[] bArr42 = $$a;
                                Object[] objArr110 = new Object[1];
                                c((short) 88, bArr42[91], bArr42[7], objArr110);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(cAxisFromString2, jumpTapTimeout, pressedStateDuration2, -874156483, false, (String) objArr110[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).set(null, lValueOf17);
                            Long lValueOf18 = Long.valueOf(jLongValue15 << 56);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                                char c9 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                int iIndexOf7 = 2267 - TextUtils.indexOf("", "");
                                int i167 = 34 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                short s37 = (short) ($$b << 2);
                                byte[] bArr43 = $$a;
                                Object[] objArr111 = new Object[1];
                                c(s37, bArr43[91], bArr43[7], objArr111);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(c9, iIndexOf7, i167, -887667012, false, (String) objArr111[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).set(null, lValueOf18);
                        } else {
                            objArr12 = objArr12;
                            objArr16 = objArr16;
                            str7 = str7;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                                char size2 = (char) View.MeasureSpec.getSize(0);
                                int mode3 = 2267 - View.MeasureSpec.getMode(0);
                                int deadChar3 = KeyEvent.getDeadChar(0, 0) + 33;
                                byte[] bArr44 = $$a;
                                short s38 = bArr44[5];
                                byte b20 = bArr44[91];
                                Object[] objArr112 = new Object[1];
                                c(s38, b20, (byte) (b20 - 4), objArr112);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(size2, mode3, deadChar3, -654680577, false, (String) objArr112[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).set(null, objArr17);
                            long jLongValue16 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf19 = Long.valueOf(jLongValue16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                                char c10 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                                int trimmedLength5 = 2267 - TextUtils.getTrimmedLength("");
                                int maximumDrawingCacheSize3 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 33;
                                byte[] bArr45 = $$a;
                                Object[] objArr113 = new Object[1];
                                c((short) 88, bArr45[91], bArr45[7], objArr113);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(c10, trimmedLength5, maximumDrawingCacheSize3, -874156483, false, (String) objArr113[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).set(null, lValueOf19);
                            Long lValueOf20 = Long.valueOf(jLongValue16 >> 12);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                                char cResolveSize = (char) View.resolveSize(0, 0);
                                int i168 = 2267 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 33;
                                short s39 = (short) ($$b << 2);
                                byte[] bArr46 = $$a;
                                Object[] objArr114 = new Object[1];
                                c(s39, bArr46[91], bArr46[7], objArr114);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(cResolveSize, i168, scrollBarFadeDuration2, -887667012, false, (String) objArr114[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).set(null, lValueOf20);
                        }
                    } catch (Exception unused9) {
                        throw new RuntimeException();
                    }
                }
                if (((int[]) objArr17[0])[0] == ((int[]) objArr17[3])[0]) {
                    arrayList5 = new ArrayList();
                    strArr5 = (String[]) objArr17[1];
                    if (strArr5 != null) {
                        for (String str14 : strArr5) {
                            arrayList5.add(str14);
                        }
                    }
                    throw null;
                }
                Object[] objArr115 = {new int[]{i}, strArr, new int[1], new int[]{i}};
                int i169 = ((int[]) objArr17[2])[0];
                int i170 = ((int[]) objArr17[0])[0];
                int i171 = ((int[]) objArr17[3])[0];
                String[] strArr14 = (String[]) objArr17[1];
                int iIdentityHashCode9 = System.identityHashCode(this);
                int i172 = i169 + 1304985706 + ((~(847021030 | iIdentityHashCode9)) * 623) + (((~iIdentityHashCode9) | 36208642) * (-623)) + (((~(iIdentityHashCode9 | 845971494)) | (~(37258178 | iIdentityHashCode9)) | (-847021031)) * 623);
                int i173 = (i172 << 13) ^ i172;
                int i174 = i173 ^ (i173 >>> 17);
                ((int[]) objArr115[2])[0] = i174 ^ (i174 << 5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                    char scrollBarSize3 = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 53893);
                    int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0) + 1320;
                    int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 36;
                    short s40 = $$a[5];
                    Object[] objArr116 = new Object[1];
                    c(s40, (byte) (s40 & 5), (byte) 52, objArr116);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(scrollBarSize3, iMakeMeasureSpec2, jumpTapTimeout2, -1433084963, false, (String) objArr116[0], null);
                }
                if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).getLong(null) != -1) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                        char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 53893);
                        int iRgb3 = (-16775896) - Color.rgb(0, 0, 0);
                        int i175 = 37 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        short s41 = (short) ($$b << 2);
                        byte[] bArr47 = $$a;
                        Object[] objArr117 = new Object[1];
                        c(s41, bArr47[91], bArr47[7], objArr117);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(capsMode, iRgb3, i175, -1920778747, false, (String) objArr117[0], null);
                    }
                    Object[] objArr118 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).get(null);
                    objArr19 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
                    int i176 = ((int[]) objArr118[0])[0];
                    int i177 = ((int[]) objArr118[3])[0];
                    String[] strArr15 = (String[]) objArr118[2];
                    int iIdentityHashCode10 = System.identityHashCode(this);
                    int i178 = (-1089658024) + (((~((-298066181) | (~iIdentityHashCode10))) | (-1072561645)) * (-591)) + ((iIdentityHashCode10 | (-298066181)) * 591) + 1934582907;
                    int i179 = (i178 << 13) ^ i178;
                    int i180 = i179 ^ (i179 >>> 17);
                    ((int[]) objArr19[1])[0] = i180 ^ (i180 << 5);
                    str3 = str7;
                } else {
                    if (applicationContext4 != null) {
                        if ((applicationContext4 instanceof ContextWrapper) || ((ContextWrapper) applicationContext4).getBaseContext() != null) {
                            applicationContext4 = p0.getApplicationContext();
                            int i181 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
                            b = i181 % 128;
                            int i182 = i181 % 2;
                        } else {
                            applicationContext4 = null;
                        }
                    }
                    str3 = str7;
                    int iIntValue3 = ((Integer) Class.forName(str6).getMethod(str3, Object.class).invoke(null, this)).intValue();
                    Object[] objArr119 = {-206576362};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b((char) (47976 - ExpandableListView.getPackedPositionChild(0L)), 1300 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 20 - TextUtils.getTrimmedLength(""), -420973425, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr120 = {applicationContext4, "com.bpjstku", 1934582907, Integer.valueOf(iIntValue3), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).newInstance(objArr119), false};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                        char c11 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 53892);
                        int maximumDrawingCacheSize4 = 1320 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int mode4 = 36 - View.MeasureSpec.getMode(0);
                        short s42 = (short) ($$b << 2);
                        byte[] bArr48 = $$a;
                        Object[] objArr121 = new Object[1];
                        c(s42, bArr48[91], bArr48[7], objArr121);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(c11, maximumDrawingCacheSize4, mode4, 819724799, false, (String) objArr121[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (57878 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), TextUtils.getOffsetAfter("", 0) + 1394, AndroidCharacter.getMirror('0') + 27), Boolean.TYPE});
                    }
                    objArr18 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).invoke(null, objArr120);
                    if (applicationContext4 != null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                            char cIndexOf3 = (char) (53893 - TextUtils.indexOf("", "", 0));
                            int iIndexOf8 = 1319 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                            int pressedStateDuration3 = (ViewConfiguration.getPressedStateDuration() >> 16) + 36;
                            short s43 = (short) ($$b << 2);
                            byte[] bArr49 = $$a;
                            Object[] objArr122 = new Object[1];
                            c(s43, bArr49[91], bArr49[7], objArr122);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(cIndexOf3, iIndexOf8, pressedStateDuration3, -1920778747, false, (String) objArr122[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).set(null, objArr18);
                        try {
                            long jLongValue17 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf21 = Long.valueOf(jLongValue17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
                                char minimumFlingVelocity2 = (char) (53893 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                int mode5 = View.MeasureSpec.getMode(0) + 1320;
                                int edgeSlop5 = 36 - (ViewConfiguration.getEdgeSlop() >> 16);
                                byte[] bArr50 = $$a;
                                short s44 = bArr50[5];
                                byte b21 = bArr50[91];
                                Object[] objArr123 = new Object[1];
                                c(s44, b21, (byte) (b21 - 4), objArr123);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(minimumFlingVelocity2, mode5, edgeSlop5, -1273706634, false, (String) objArr123[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).set(null, lValueOf21);
                            Long lValueOf22 = Long.valueOf(jLongValue17 >> 12);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                                char cIndexOf4 = (char) (TextUtils.indexOf("", "") + 53893);
                                int maximumDrawingCacheSize5 = 1320 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                int iIndexOf9 = TextUtils.indexOf((CharSequence) "", '0') + 37;
                                short s45 = $$a[5];
                                Object[] objArr124 = new Object[1];
                                c(s45, (byte) (s45 & 5), (byte) 52, objArr124);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(cIndexOf4, maximumDrawingCacheSize5, iIndexOf9, -1433084963, false, (String) objArr124[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).set(null, lValueOf22);
                        } catch (Exception unused10) {
                            throw new RuntimeException();
                        }
                    } else {
                        objArr18 = objArr18;
                    }
                    objArr19 = objArr18;
                }
                i25 = ((int[]) objArr19[3])[0];
                i26 = ((int[]) objArr19[0])[0];
                if (i26 == i25) {
                    objArr20 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
                    int i183 = ((int[]) objArr19[1])[0];
                    int i184 = ((int[]) objArr19[0])[0];
                    int i185 = ((int[]) objArr19[3])[0];
                    String[] strArr16 = (String[]) objArr19[2];
                    int iIdentityHashCode11 = System.identityHashCode(this);
                    int i186 = (~((-1082347160) | iIdentityHashCode11)) | 147473;
                    int i187 = ~((~iIdentityHashCode11) | 1370480351);
                    int i188 = i183 + 1439940134 + ((i186 | i187) * (-470)) + (((~(iIdentityHashCode11 | (-1082199687))) | i187) * 470);
                    int i189 = (i188 << 13) ^ i188;
                    int i190 = i189 ^ (i189 >>> 17);
                    i27 = 0;
                    ((int[]) objArr20[1])[0] = i190 ^ (i190 << 5);
                } else {
                    Toast.makeText((Context) null, i26 / (((i26 - 1) * i26) % 2), 0).show();
                    objArr20 = new Object[]{new int[]{i}, new int[1], strArr, new int[]{i}};
                    int i191 = ((int[]) objArr19[1])[0];
                    int i192 = ((int[]) objArr19[0])[0];
                    int i193 = ((int[]) objArr19[3])[0];
                    String[] strArr17 = (String[]) objArr19[2];
                    int iIdentityHashCode12 = System.identityHashCode(this);
                    int i194 = ~iIdentityHashCode12;
                    int i195 = i191 + (-378948964) + (((~((-418660111) | i194)) | (-951967715)) * (-865)) + ((~(iIdentityHashCode12 | 418660110)) * 865) + (((~((-951967715) | i194)) | (~(i194 | 418660110))) * 865);
                    int i196 = i195 ^ (i195 << 13);
                    int i197 = i196 ^ (i196 >>> 17);
                    i27 = 0;
                    ((int[]) objArr20[1])[0] = i197 ^ (i197 << 5);
                }
                objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                    char c12 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                    int iResolveSizeAndState4 = View.resolveSizeAndState(i27, i27, i27) + 1031;
                    int i198 = (ExpandableListView.getPackedPositionForChild(i27, i27) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i27, i27) == 0L ? 0 : -1)) + 16;
                    byte[] bArr51 = $$a;
                    Object[] objArr125 = new Object[1];
                    c((short) 88, bArr51[91], bArr51[7], objArr125);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(c12, iResolveSizeAndState4, i198, 1357589585, false, (String) objArr125[0], null);
                }
                j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).getLong(null);
                jLongValue4 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                    char touchSlop5 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                    int jumpTapTimeout3 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1031;
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 15;
                    short s46 = (short) ($$b << 2);
                    byte[] bArr52 = $$a;
                    Object[] objArr126 = new Object[1];
                    c(s46, bArr52[91], bArr52[7], objArr126);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(touchSlop5, jumpTapTimeout3, keyRepeatTimeout, 1344079056, false, (String) objArr126[0], null);
                }
                if (j4 == ((jLongValue4 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).getLong(null) << 52) >>> 52)) >> 12)) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                        char cResolveOpacity2 = (char) Drawable.resolveOpacity(0, 0);
                        int i199 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1031;
                        int iAlpha2 = Color.alpha(0) + 15;
                        short s47 = $$a[5];
                        Object[] objArr127 = new Object[1];
                        c(s47, (byte) (s47 & 5), (byte) 52, objArr127);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(cResolveOpacity2, i199, iAlpha2, 632103528, false, (String) objArr127[0], null);
                    }
                    Object[] objArr128 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).get(null);
                    objArr21 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
                    int i200 = ((int[]) objArr128[3])[0];
                    int i201 = ((int[]) objArr128[1])[0];
                    String[] strArr18 = (String[]) objArr128[0];
                    int iMyTid2 = Process.myTid();
                    int i202 = ~iMyTid2;
                    int i203 = (-1589575152) + (((~(300695208 | i202)) | 544975378) * 226) + (((~(i202 | 838844090)) | (~((-544975379) | iMyTid2)) | 6826496) * (-113)) + ((~(iMyTid2 | 300695208)) * 113) + 497424490;
                    int i204 = (i203 << 13) ^ i203;
                    int i205 = i204 ^ (i204 >>> 17);
                    ((int[]) objArr21[2])[0] = i205 ^ (i205 << 5);
                } else {
                    int iIntValue4 = ((Integer) Class.forName(str6).getMethod(str3, Object.class).invoke(null, this)).intValue();
                    Object[] objArr129 = {-206576362};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b((char) (46038 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 1134 - Color.alpha(0), View.MeasureSpec.makeMeasureSpec(0, 0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr130 = {Integer.valueOf(iIntValue4), 0, 497424490, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).newInstance(objArr129), false};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                        char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                        int iKeyCodeFromString3 = KeyEvent.keyCodeFromString("") + 1031;
                        int i206 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14;
                        byte[] bArr53 = $$a;
                        Object[] objArr131 = new Object[1];
                        c((short) 88, bArr53[91], bArr53[7], objArr131);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(cCombineMeasuredStates, iKeyCodeFromString3, i206, 1298546779, false, (String) objArr131[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), TextUtils.lastIndexOf("", '0') + 1118, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 17), Boolean.TYPE});
                    }
                    Object[] objArr132 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).invoke(null, objArr130);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
                        char packedPositionType5 = (char) ExpandableListView.getPackedPositionType(0L);
                        int scrollBarFadeDuration3 = 1031 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0) + 15;
                        short s48 = $$a[5];
                        Object[] objArr133 = new Object[1];
                        c(s48, (byte) (s48 & 5), (byte) 52, objArr133);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(packedPositionType5, scrollBarFadeDuration3, iMakeMeasureSpec3, 632103528, false, (String) objArr133[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).set(null, objArr132);
                    try {
                        long jLongValue18 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf23 = Long.valueOf(jLongValue18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                            char offsetBefore2 = (char) TextUtils.getOffsetBefore("", 0);
                            int threadPriority3 = ((Process.getThreadPriority(0) + 20) >> 6) + 1031;
                            int minimumFlingVelocity3 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15;
                            short s49 = (short) ($$b << 2);
                            byte[] bArr54 = $$a;
                            Object[] objArr134 = new Object[1];
                            c(s49, bArr54[91], bArr54[7], objArr134);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(offsetBefore2, threadPriority3, minimumFlingVelocity3, 1344079056, false, (String) objArr134[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).set(null, lValueOf23);
                        Long lValueOf24 = Long.valueOf(jLongValue18 >> 12);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                            char scrollBarSize4 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                            int iLastIndexOf5 = TextUtils.lastIndexOf("", '0', 0) + 1032;
                            int i207 = 15 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                            byte[] bArr55 = $$a;
                            Object[] objArr135 = new Object[1];
                            c((short) 88, bArr55[91], bArr55[7], objArr135);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(scrollBarSize4, iLastIndexOf5, i207, 1357589585, false, (String) objArr135[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).set(null, lValueOf24);
                        objArr21 = objArr132;
                    } catch (Exception unused11) {
                        throw new RuntimeException();
                    }
                }
                i28 = ((int[]) objArr21[1])[0];
                i29 = ((int[]) objArr21[3])[0];
                if (i29 == i28) {
                    int i208 = b + 107;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i208 % 128;
                    int i209 = i208 % 2;
                    objArr22 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
                    int i210 = ((int[]) objArr21[2])[0];
                    int i211 = ((int[]) objArr21[3])[0];
                    int i212 = ((int[]) objArr21[1])[0];
                    String[] strArr19 = (String[]) objArr21[0];
                    int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                    int i213 = i210 + (((~(iMaxMemory | 130131592)) * TypedValues.CycleType.TYPE_EASING) - 1295564243) + (((~((~iMaxMemory) | 130131592)) | 113345664) * TypedValues.CycleType.TYPE_EASING);
                    int i214 = (i213 << 13) ^ i213;
                    int i215 = i214 ^ (i214 >>> 17);
                    c = 0;
                    ((int[]) objArr22[2])[0] = i215 ^ (i215 << 5);
                } else {
                    arrayList6 = new ArrayList();
                    strArr6 = (String[]) objArr21[0];
                    if (strArr6 != null) {
                        for (String str15 : strArr6) {
                            int i216 = b + 9;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i216 % 128;
                            int i217 = i216 % 2;
                            arrayList6.add(str15);
                        }
                    }
                    Toast.makeText((Context) null, i29 / (((i29 - 1) * i29) % 2), 0).show();
                    objArr22 = new Object[]{strArr, new int[]{i}, new int[1], new int[]{i}};
                    int i218 = ((int[]) objArr21[2])[0];
                    int i219 = ((int[]) objArr21[3])[0];
                    int i220 = ((int[]) objArr21[1])[0];
                    String[] strArr20 = (String[]) objArr21[0];
                    int i221 = ~Process.myTid();
                    int i222 = i218 + 644797189 + (((~((-303110657) | i221)) | 547390826) * (-828)) + ((i221 | (-303110657)) * (-828)) + 1867520000;
                    int i223 = (i222 << 13) ^ i222;
                    int i224 = i223 ^ (i223 >>> 17);
                    c = 0;
                    ((int[]) objArr22[2])[0] = i224 ^ (i224 << 5);
                }
                int i225 = ((int[]) objArr37[c])[c];
                int i226 = i225 * i225;
                int i227 = -(1782957044 * i225);
                int i228 = ((i226 | i227) << 1) - (i226 ^ i227);
                int i229 = -(i225 * (-1456408770));
                int i230 = ((i228 & i229) + (i229 | i228)) - 1581349519;
                int i231 = i230 >> 29;
                int i232 = ((i231 & (-15)) + (i231 | (-15))) / 8;
                int i233 = (i230 - (~(((i232 | 1) << 1) - (i232 ^ 1)))) - 1;
                int i234 = ((i230 >> 25) - 255) / 128;
                int i235 = (-(i233 ^ (((i234 | 1) << 1) - (i234 ^ 1)))) + 7;
                int i236 = i235 >> 22;
                int i237 = ((((i236 | (-2047)) << 1) - (i236 ^ (-2047))) / 1024) + 1;
                int i238 = 4801020 / ((i235 & (-(((i237 | 1) << 1) - (i237 ^ 1)))) * 1932);
                int i239 = ((int[]) objArr3[1])[0];
                int i240 = i239 * i239;
                int i241 = -(1045046327 * i239);
                int i242 = (i240 & i241) + (i240 | i241);
                int i243 = -(i239 * 2034666645);
                int i244 = (i242 & i243) + (i243 | i242);
                int i245 = (i244 ^ (-1041872732)) + (((-1041872732) & i244) << 1);
                int i246 = i245 >> 24;
                int i247 = ((i246 & (-511)) + (i246 | (-511))) / 256;
                int i248 = (i245 - (~(((i247 | 1) << 1) - (i247 ^ 1)))) - 1;
                int i249 = i245 >> 16;
                int i250 = (((-131071) ^ i249) + ((i249 & (-131071)) << 1)) / 65536;
                int i251 = -(i248 ^ ((i250 ^ 1) + ((i250 & 1) << 1)));
                int i252 = (i251 & 1) + (i251 | 1);
                int i253 = ((i252 >> 28) - 31) / 16;
                int i254 = ((i253 | 1) << 1) - (i253 ^ 1);
                int i255 = i238 + (443716 / (((-((i254 ^ 1) + ((i254 & 1) << 1))) & i252) * 742));
                int i256 = ((int[]) objArr5[1])[0];
                int i257 = i256 * i256;
                int i258 = -(1308279787 * i256);
                int i259 = (i257 & i258) + (i257 | i258);
                int i260 = -(i256 * 1841813427);
                int i261 = ((i259 | i260) << 1) - (i260 ^ i259);
                int i262 = (i261 & 1132735841) + (1132735841 | i261);
                int i263 = (((i262 >> 18) - 32767) / 16384) + 1;
                int i264 = ((i262 | i263) << 1) - (i263 ^ i262);
                int i265 = i262 >> 17;
                int i266 = (((-65535) & i265) + (i265 | (-65535))) / 32768;
                int i267 = -(((i266 ^ 1) + ((i266 & 1) << 1)) ^ i264);
                int i268 = ((i267 | 7) << 1) - (i267 ^ 7);
                int i269 = ((i268 >> 21) - 4095) / 2048;
                int i270 = ((i269 | 1) << 1) - (i269 ^ 1);
                int i271 = i255 + (5022990 / (((-((i270 ^ 1) + ((i270 & 1) << 1))) & i268) * 1407));
                int i272 = ((int[]) objArr7[1])[0];
                int i273 = ((i272 * i272) - (~(-(1212862219 * i272)))) - 1;
                int i274 = -(i272 * 354049661);
                int i275 = ((i273 | i274) << 1) - (i274 ^ i273);
                int i276 = (i275 & 1901741584) + (1901741584 | i275);
                int i277 = i276 >> 17;
                int i278 = (((-65535) & i277) + (i277 | (-65535))) / 32768;
                int i279 = ((i278 | 1) << 1) - (i278 ^ 1);
                int i280 = (i276 ^ i279) + ((i279 & i276) << 1);
                int i281 = ((i276 >> 29) - 15) / 8;
                int i282 = (-(i280 ^ (((i281 | 1) << 1) - (i281 ^ 1)))) + 6;
                int i283 = i282 >> 20;
                int i284 = i271 + (5708394 / ((i282 & (-((((i283 & (-8191)) + (i283 | (-8191))) / 4096) + 2))) * 1503));
                int i285 = ((int[]) objArr10[1])[0];
                int i286 = i285 * i285;
                int i287 = -(1258874226 * i285);
                int i288 = (i286 ^ i287) + ((i286 & i287) << 1);
                int i289 = -(i285 * (-411475194));
                int i290 = ((i288 & i289) + (i289 | i288)) - (-597224976);
                int i291 = i290 >> 20;
                int i292 = ((i291 & (-8191)) + (i291 | (-8191))) / 4096;
                int i293 = (i290 - (~((i292 ^ 1) + ((i292 & 1) << 1)))) - 1;
                int i294 = i290 >> 16;
                int i295 = -(i293 ^ (((((-131071) & i294) + (i294 | (-131071))) / 65536) + 1));
                int i296 = (i295 ^ 4) + ((i295 & 4) << 1);
                int i297 = (((i296 >> 15) - 262143) / 131072) + 1;
                int i298 = i284 + (3995136 / (((-((i297 ^ 1) + ((i297 & 1) << 1))) & i296) * 1224));
                int i299 = ((int[]) objArr12[3])[0];
                int i300 = i299 * i299;
                int i301 = -(697697465 * i299);
                int i302 = (i300 ^ i301) + ((i300 & i301) << 1);
                int i303 = -(i299 * 230309181);
                int i304 = ((i302 | i303) << 1) - (i303 ^ i302);
                int i305 = ((i304 | 1068480025) << 1) - (1068480025 ^ i304);
                int i306 = i305 >> 16;
                int i307 = (((-131071) ^ i306) + ((i306 & (-131071)) << 1)) / 65536;
                int i308 = (i305 - (~((i307 ^ 1) + ((i307 & 1) << 1)))) - 1;
                int i309 = ((i305 >> 23) - 1023) / 512;
                int i310 = -(i308 ^ ((i309 ^ 1) + ((i309 & 1) << 1)));
                int i311 = ((i310 | 5) << 1) - (i310 ^ 5);
                int i312 = i311 >> 27;
                int i313 = (((i312 | (-63)) << 1) - (i312 ^ (-63))) / 32;
                int i314 = (i313 ^ 1) + ((i313 & 1) << 1);
                int i315 = i298 + (9771120 / (((-((i314 & 1) + (i314 | 1))) & i311) * 1968));
                int i316 = ((int[]) objArr14[0])[0];
                int i317 = ((i316 * i316) - (~(-(1487085662 * i316)))) - 1;
                int i318 = -(i316 * 622676956);
                int i319 = ((i317 | i318) << 1) - (i317 ^ i318);
                int i320 = ((i319 | (-902807735)) << 1) - ((-902807735) ^ i319);
                int i321 = i320 >> 20;
                int i322 = ((i321 ^ (-8191)) + ((i321 & (-8191)) << 1)) / 4096;
                int i323 = (i320 - (~((i322 ^ 1) + ((i322 & 1) << 1)))) - 1;
                int i324 = i320 >> 24;
                int i325 = (((i324 | (-511)) << 1) - (i324 ^ (-511))) / 256;
                int i326 = -(i323 ^ (((i325 | 1) << 1) - (i325 ^ 1)));
                int i327 = ((i326 | 5) << 1) - (i326 ^ 5);
                int i328 = i327 >> 23;
                int i329 = ((i328 & (-1023)) + (i328 | (-1023))) / 512;
                int i330 = i315 + (5749890 / (((-(((i329 & 1) + (i329 | 1)) + 1)) & i327) * 1399));
                int i331 = ((int[]) objArr16[3])[0];
                int i332 = ((((i331 * i331) - (~(-(1705076136 * i331)))) - 1) - (~(-(i331 * (-381342966))))) - 1;
                int i333 = (i332 ^ 845688561) + ((i332 & 845688561) << 1);
                int i334 = i333 >> 19;
                int i335 = ((i334 & (-16383)) + (i334 | (-16383))) / 8192;
                int i336 = (i333 - (~((i335 ^ 1) + ((i335 & 1) << 1)))) - 1;
                int i337 = ((i333 >> 16) - 131071) / 65536;
                int i338 = -(i336 ^ (((i337 | 1) << 1) - (i337 ^ 1)));
                int i339 = (i338 & 3) + (i338 | 3);
                int i340 = i339 >> 22;
                int i341 = (((i340 | (-2047)) << 1) - (i340 ^ (-2047))) / 1024;
                int i342 = (i341 & 1) + (i341 | 1);
                int i343 = i330 + (1488960 / (((-(((i342 | 1) << 1) - (i342 ^ 1))) & i339) * 517));
                int i344 = ((int[]) objArr115[2])[0];
                int i345 = ((i344 * i344) - (~(-(770155949 * i344)))) - 1;
                int i346 = -(i344 * (-1321042351));
                int i347 = (i345 ^ i346) + ((i345 & i346) << 1);
                int i348 = (i347 ^ 370793473) + ((370793473 & i347) << 1);
                int i349 = i348 >> 24;
                int i350 = (((i349 & (-511)) + (i349 | (-511))) / 256) + 1;
                int i351 = ((i348 | i350) << 1) - (i350 ^ i348);
                int i352 = i348 >> 19;
                int i353 = ((i352 & (-16383)) + (i352 | (-16383))) / 8192;
                int i354 = (-(i351 ^ ((i353 ^ 1) + ((i353 & 1) << 1)))) + 1;
                int i355 = ((i354 >> 24) - 511) / 256;
                int i356 = ((i355 | 1) << 1) - (i355 ^ 1);
                int i357 = i343 + (1823088 / ((i354 & (-((i356 ^ 1) + ((i356 & 1) << 1)))) * 1999));
                int i358 = ((int[]) objArr20[1])[0];
                int i359 = i358 * i358;
                int i360 = -(679631359 * i358);
                int i361 = (((i359 & i360) + (i359 | i360)) - (~(-(i358 * 1504706183)))) - 1296230008;
                int i362 = i361 >> 18;
                int i363 = ((i361 >> 15) - 262143) / 131072;
                int i364 = (-(((i361 - (~(((((i362 | (-32767)) << 1) - (i362 ^ (-32767))) / 16384) + 1))) - 1) ^ ((i363 & 1) + (i363 | 1)))) + 8;
                int i365 = i364 >> 20;
                int i366 = i357 + (617760 / ((i364 & (-(((((i365 | (-8191)) << 1) - (i365 ^ (-8191))) / 4096) + 2))) * 396));
                int i367 = ((int[]) objArr22[2])[0];
                int i368 = i367 * i367;
                int i369 = -(481707229 * i367);
                int i370 = (i368 ^ i369) + ((i368 & i369) << 1);
                int i371 = -(i367 * (-690147765));
                int i372 = (i370 ^ i371) + ((i371 & i370) << 1);
                int i373 = ((i372 | (-655409776)) << 1) - ((-655409776) ^ i372);
                int i374 = i373 >> 26;
                int i375 = (((i374 | ComposerKt.defaultsKey) << 1) - (i374 ^ ComposerKt.defaultsKey)) / 64;
                int i376 = (i375 & 1) + (i375 | 1);
                int i377 = ((i373 | i376) << 1) - (i376 ^ i373);
                int i378 = i373 >> 15;
                int i379 = (((-262143) & i378) + (i378 | (-262143))) / 131072;
                int i380 = -(((i379 ^ 1) + ((i379 & 1) << 1)) ^ i377);
                int i381 = ((i380 | 5) << 1) - (i380 ^ 5);
                int i382 = i381 >> 15;
                int i383 = ((((-262143) ^ i382) + ((i382 & (-262143)) << 1)) / 131072) + 1;
                Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "1,9,20,26,File Downloaded".substring(i366 + ((-30629760) / (((-((i383 & 1) + (i383 | 1))) & i381) * TypedValues.Custom.TYPE_STRING))), 0).show();
            }
            objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
                char cAxisFromString3 = (char) (MotionEvent.axisFromString("") + 1);
                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 2267;
                int i384 = 34 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                byte[] bArr56 = $$a;
                short s50 = bArr56[5];
                byte b22 = bArr56[91];
                Object[] objArr136 = new Object[1];
                c(s50, b22, (byte) (b22 - 4), objArr136);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(cAxisFromString3, iCombineMeasuredStates, i384, -654680577, false, (String) objArr136[0], null);
            }
            Object[] objArr137 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).get(null);
            objArr17 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i385 = ((int[]) objArr137[0])[0];
            int i386 = ((int[]) objArr137[3])[0];
            String[] strArr21 = (String[]) objArr137[1];
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i387 = (((-1968123745) + (((~((-31386472) | iElapsedRealtime)) | (-777326845)) * (-948))) + ((~((~iElapsedRealtime) | (-5505125))) * (-948))) - 580012947;
            int i388 = (i387 << 13) ^ i387;
            int i389 = i388 ^ (i388 >>> 17);
            ((int[]) objArr17[2])[0] = i389 ^ (i389 << 5);
            applicationContext4 = p0;
            objArr12 = objArr12;
            objArr16 = objArr16;
            str7 = str7;
            if (((int[]) objArr17[0])[0] == ((int[]) objArr17[3])[0]) {
                arrayList5 = new ArrayList();
                strArr5 = (String[]) objArr17[1];
                if (strArr5 != null) {
                    while (i24 < strArr5.length) {
                        arrayList5.add(str14);
                    }
                }
                throw null;
            }
            Object[] objArr1110 = {new int[]{i170}, strArr14, new int[1], new int[]{i171}};
            int i1610 = ((int[]) objArr17[2])[0];
            int i1710 = ((int[]) objArr17[0])[0];
            int i1711 = ((int[]) objArr17[3])[0];
            String[] strArr110 = (String[]) objArr17[1];
            int iIdentityHashCode13 = System.identityHashCode(this);
            int i1712 = i1610 + 1304985706 + ((~(847021030 | iIdentityHashCode13)) * 623) + (((~iIdentityHashCode13) | 36208642) * (-623)) + (((~(iIdentityHashCode13 | 845971494)) | (~(37258178 | iIdentityHashCode13)) | (-847021031)) * 623);
            int i1713 = (i1712 << 13) ^ i1712;
            int i1714 = i1713 ^ (i1713 >>> 17);
            ((int[]) objArr1110[2])[0] = i1714 ^ (i1714 << 5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                char scrollBarSize5 = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 53893);
                int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 0) + 1320;
                int jumpTapTimeout4 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 36;
                short s410 = $$a[5];
                Object[] objArr1111 = new Object[1];
                c(s410, (byte) (s410 & 5), (byte) 52, objArr1111);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(scrollBarSize5, iMakeMeasureSpec4, jumpTapTimeout4, -1433084963, false, (String) objArr1111[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).getLong(null) != -1) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                    char capsMode2 = (char) (TextUtils.getCapsMode("", 0, 0) + 53893);
                    int iRgb4 = (-16775896) - Color.rgb(0, 0, 0);
                    int i1715 = 37 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    short s411 = (short) ($$b << 2);
                    byte[] bArr410 = $$a;
                    Object[] objArr1112 = new Object[1];
                    c(s411, bArr410[91], bArr410[7], objArr1112);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(capsMode2, iRgb4, i1715, -1920778747, false, (String) objArr1112[0], null);
                }
                Object[] objArr1113 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).get(null);
                objArr19 = new Object[]{new int[]{i176}, new int[1], strArr15, new int[]{i177}};
                int i1716 = ((int[]) objArr1113[0])[0];
                int i1717 = ((int[]) objArr1113[3])[0];
                String[] strArr111 = (String[]) objArr1113[2];
                int iIdentityHashCode14 = System.identityHashCode(this);
                int i1718 = (-1089658024) + (((~((-298066181) | (~iIdentityHashCode14))) | (-1072561645)) * (-591)) + ((iIdentityHashCode14 | (-298066181)) * 591) + 1934582907;
                int i1719 = (i1718 << 13) ^ i1718;
                int i1810 = i1719 ^ (i1719 >>> 17);
                ((int[]) objArr19[1])[0] = i1810 ^ (i1810 << 5);
                str3 = str7;
            } else {
                if (applicationContext4 != null) {
                    if (applicationContext4 instanceof ContextWrapper) {
                        applicationContext4 = p0.getApplicationContext();
                        int i1811 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
                        b = i1811 % 128;
                        int i1812 = i1811 % 2;
                    } else {
                        applicationContext4 = p0.getApplicationContext();
                        int i1813 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
                        b = i1813 % 128;
                        int i1814 = i1813 % 2;
                    }
                }
                str3 = str7;
                int iIntValue5 = ((Integer) Class.forName(str6).getMethod(str3, Object.class).invoke(null, this)).intValue();
                Object[] objArr1114 = {-206576362};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b((char) (47976 - ExpandableListView.getPackedPositionChild(0L)), 1300 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 20 - TextUtils.getTrimmedLength(""), -420973425, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr1210 = {applicationContext4, "com.bpjstku", 1934582907, Integer.valueOf(iIntValue5), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).newInstance(objArr1114), false};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                    char c13 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 53892);
                    int maximumDrawingCacheSize6 = 1320 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int mode6 = 36 - View.MeasureSpec.getMode(0);
                    short s412 = (short) ($$b << 2);
                    byte[] bArr411 = $$a;
                    Object[] objArr1211 = new Object[1];
                    c(s412, bArr411[91], bArr411[7], objArr1211);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(c13, maximumDrawingCacheSize6, mode6, 819724799, false, (String) objArr1211[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (57878 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), TextUtils.getOffsetAfter("", 0) + 1394, AndroidCharacter.getMirror('0') + 27), Boolean.TYPE});
                }
                objArr18 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).invoke(null, objArr1210);
                if (applicationContext4 != null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                        char cIndexOf5 = (char) (53893 - TextUtils.indexOf("", "", 0));
                        int iIndexOf10 = 1319 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        int pressedStateDuration4 = (ViewConfiguration.getPressedStateDuration() >> 16) + 36;
                        short s413 = (short) ($$b << 2);
                        byte[] bArr412 = $$a;
                        Object[] objArr1212 = new Object[1];
                        c(s413, bArr412[91], bArr412[7], objArr1212);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(cIndexOf5, iIndexOf10, pressedStateDuration4, -1920778747, false, (String) objArr1212[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).set(null, objArr18);
                    long jLongValue19 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf25 = Long.valueOf(jLongValue19);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
                        char minimumFlingVelocity4 = (char) (53893 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        int mode7 = View.MeasureSpec.getMode(0) + 1320;
                        int edgeSlop6 = 36 - (ViewConfiguration.getEdgeSlop() >> 16);
                        byte[] bArr57 = $$a;
                        short s414 = bArr57[5];
                        byte b23 = bArr57[91];
                        Object[] objArr1213 = new Object[1];
                        c(s414, b23, (byte) (b23 - 4), objArr1213);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(minimumFlingVelocity4, mode7, edgeSlop6, -1273706634, false, (String) objArr1213[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).set(null, lValueOf25);
                    Long lValueOf26 = Long.valueOf(jLongValue19 >> 12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                        char cIndexOf6 = (char) (TextUtils.indexOf("", "") + 53893);
                        int maximumDrawingCacheSize7 = 1320 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int iIndexOf11 = TextUtils.indexOf((CharSequence) "", '0') + 37;
                        short s415 = $$a[5];
                        Object[] objArr1214 = new Object[1];
                        c(s415, (byte) (s415 & 5), (byte) 52, objArr1214);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(cIndexOf6, maximumDrawingCacheSize7, iIndexOf11, -1433084963, false, (String) objArr1214[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).set(null, lValueOf26);
                } else {
                    objArr18 = objArr18;
                }
                objArr19 = objArr18;
            }
            i25 = ((int[]) objArr19[3])[0];
            i26 = ((int[]) objArr19[0])[0];
            if (i26 == i25) {
                objArr20 = new Object[]{new int[]{i184}, new int[1], strArr16, new int[]{i185}};
                int i1815 = ((int[]) objArr19[1])[0];
                int i1816 = ((int[]) objArr19[0])[0];
                int i1817 = ((int[]) objArr19[3])[0];
                String[] strArr112 = (String[]) objArr19[2];
                int iIdentityHashCode15 = System.identityHashCode(this);
                int i1818 = (~((-1082347160) | iIdentityHashCode15)) | 147473;
                int i1819 = ~((~iIdentityHashCode15) | 1370480351);
                int i1820 = i1815 + 1439940134 + ((i1818 | i1819) * (-470)) + (((~(iIdentityHashCode15 | (-1082199687))) | i1819) * 470);
                int i1821 = (i1820 << 13) ^ i1820;
                int i1910 = i1821 ^ (i1821 >>> 17);
                i27 = 0;
                ((int[]) objArr20[1])[0] = i1910 ^ (i1910 << 5);
            } else {
                Toast.makeText((Context) null, i26 / (((i26 - 1) * i26) % 2), 0).show();
                objArr20 = new Object[]{new int[]{i192}, new int[1], strArr17, new int[]{i193}};
                int i1911 = ((int[]) objArr19[1])[0];
                int i1912 = ((int[]) objArr19[0])[0];
                int i1913 = ((int[]) objArr19[3])[0];
                String[] strArr113 = (String[]) objArr19[2];
                int iIdentityHashCode16 = System.identityHashCode(this);
                int i1914 = ~iIdentityHashCode16;
                int i1915 = i1911 + (-378948964) + (((~((-418660111) | i1914)) | (-951967715)) * (-865)) + ((~(iIdentityHashCode16 | 418660110)) * 865) + (((~((-951967715) | i1914)) | (~(i1914 | 418660110))) * 865);
                int i1916 = i1915 ^ (i1915 << 13);
                int i1917 = i1916 ^ (i1916 >>> 17);
                i27 = 0;
                ((int[]) objArr20[1])[0] = i1917 ^ (i1917 << 5);
            }
            objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                char c14 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                int iResolveSizeAndState5 = View.resolveSizeAndState(i27, i27, i27) + 1031;
                int i1918 = (ExpandableListView.getPackedPositionForChild(i27, i27) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i27, i27) == 0L ? 0 : -1)) + 16;
                byte[] bArr58 = $$a;
                Object[] objArr1215 = new Object[1];
                c((short) 88, bArr58[91], bArr58[7], objArr1215);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(c14, iResolveSizeAndState5, i1918, 1357589585, false, (String) objArr1215[0], null);
            }
            j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).getLong(null);
            jLongValue4 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
            objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                char touchSlop6 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                int jumpTapTimeout5 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1031;
                int keyRepeatTimeout2 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 15;
                short s416 = (short) ($$b << 2);
                byte[] bArr59 = $$a;
                Object[] objArr1216 = new Object[1];
                c(s416, bArr59[91], bArr59[7], objArr1216);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(touchSlop6, jumpTapTimeout5, keyRepeatTimeout2, 1344079056, false, (String) objArr1216[0], null);
            }
            if (j4 == ((jLongValue4 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).getLong(null) << 52) >>> 52)) >> 12)) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                    char cResolveOpacity3 = (char) Drawable.resolveOpacity(0, 0);
                    int i1919 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1031;
                    int iAlpha3 = Color.alpha(0) + 15;
                    short s417 = $$a[5];
                    Object[] objArr1217 = new Object[1];
                    c(s417, (byte) (s417 & 5), (byte) 52, objArr1217);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(cResolveOpacity3, i1919, iAlpha3, 632103528, false, (String) objArr1217[0], null);
                }
                Object[] objArr1218 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).get(null);
                objArr21 = new Object[]{strArr18, new int[]{i201}, new int[1], new int[]{i200}};
                int i2010 = ((int[]) objArr1218[3])[0];
                int i2011 = ((int[]) objArr1218[1])[0];
                String[] strArr114 = (String[]) objArr1218[0];
                int iMyTid3 = Process.myTid();
                int i2012 = ~iMyTid3;
                int i2013 = (-1589575152) + (((~(300695208 | i2012)) | 544975378) * 226) + (((~(i2012 | 838844090)) | (~((-544975379) | iMyTid3)) | 6826496) * (-113)) + ((~(iMyTid3 | 300695208)) * 113) + 497424490;
                int i2014 = (i2013 << 13) ^ i2013;
                int i2015 = i2014 ^ (i2014 >>> 17);
                ((int[]) objArr21[2])[0] = i2015 ^ (i2015 << 5);
            } else {
                int iIntValue6 = ((Integer) Class.forName(str6).getMethod(str3, Object.class).invoke(null, this)).intValue();
                Object[] objArr1219 = {-206576362};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b((char) (46038 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 1134 - Color.alpha(0), View.MeasureSpec.makeMeasureSpec(0, 0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr138 = {Integer.valueOf(iIntValue6), 0, 497424490, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).newInstance(objArr1219), false};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                    char cCombineMeasuredStates2 = (char) View.combineMeasuredStates(0, 0);
                    int iKeyCodeFromString4 = KeyEvent.keyCodeFromString("") + 1031;
                    int i2016 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14;
                    byte[] bArr510 = $$a;
                    Object[] objArr139 = new Object[1];
                    c((short) 88, bArr510[91], bArr510[7], objArr139);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(cCombineMeasuredStates2, iKeyCodeFromString4, i2016, 1298546779, false, (String) objArr139[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), TextUtils.lastIndexOf("", '0') + 1118, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 17), Boolean.TYPE});
                }
                Object[] objArr1310 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).invoke(null, objArr138);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
                    char packedPositionType6 = (char) ExpandableListView.getPackedPositionType(0L);
                    int scrollBarFadeDuration4 = 1031 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int iMakeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(0, 0) + 15;
                    short s418 = $$a[5];
                    Object[] objArr1311 = new Object[1];
                    c(s418, (byte) (s418 & 5), (byte) 52, objArr1311);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(packedPositionType6, scrollBarFadeDuration4, iMakeMeasureSpec5, 632103528, false, (String) objArr1311[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).set(null, objArr1310);
                long jLongValue110 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf27 = Long.valueOf(jLongValue110);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                    char offsetBefore3 = (char) TextUtils.getOffsetBefore("", 0);
                    int threadPriority4 = ((Process.getThreadPriority(0) + 20) >> 6) + 1031;
                    int minimumFlingVelocity5 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15;
                    short s419 = (short) ($$b << 2);
                    byte[] bArr511 = $$a;
                    Object[] objArr1312 = new Object[1];
                    c(s419, bArr511[91], bArr511[7], objArr1312);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(offsetBefore3, threadPriority4, minimumFlingVelocity5, 1344079056, false, (String) objArr1312[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).set(null, lValueOf27);
                Long lValueOf28 = Long.valueOf(jLongValue110 >> 12);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                    char scrollBarSize6 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                    int iLastIndexOf6 = TextUtils.lastIndexOf("", '0', 0) + 1032;
                    int i2017 = 15 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    byte[] bArr512 = $$a;
                    Object[] objArr1313 = new Object[1];
                    c((short) 88, bArr512[91], bArr512[7], objArr1313);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(scrollBarSize6, iLastIndexOf6, i2017, 1357589585, false, (String) objArr1313[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).set(null, lValueOf28);
                objArr21 = objArr1310;
            }
            i28 = ((int[]) objArr21[1])[0];
            i29 = ((int[]) objArr21[3])[0];
            if (i29 == i28) {
                int i2018 = b + 107;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2018 % 128;
                int i2019 = i2018 % 2;
                objArr22 = new Object[]{strArr19, new int[]{i212}, new int[1], new int[]{i211}};
                int i2110 = ((int[]) objArr21[2])[0];
                int i2111 = ((int[]) objArr21[3])[0];
                int i2112 = ((int[]) objArr21[1])[0];
                String[] strArr115 = (String[]) objArr21[0];
                int iMaxMemory2 = (int) Runtime.getRuntime().maxMemory();
                int i2113 = i2110 + (((~(iMaxMemory2 | 130131592)) * TypedValues.CycleType.TYPE_EASING) - 1295564243) + (((~((~iMaxMemory2) | 130131592)) | 113345664) * TypedValues.CycleType.TYPE_EASING);
                int i2114 = (i2113 << 13) ^ i2113;
                int i2115 = i2114 ^ (i2114 >>> 17);
                c = 0;
                ((int[]) objArr22[2])[0] = i2115 ^ (i2115 << 5);
            } else {
                arrayList6 = new ArrayList();
                strArr6 = (String[]) objArr21[0];
                if (strArr6 != null) {
                    while (i30 < strArr6.length) {
                        int i2116 = b + 9;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2116 % 128;
                        int i2117 = i2116 % 2;
                        arrayList6.add(str15);
                    }
                }
                Toast.makeText((Context) null, i29 / (((i29 - 1) * i29) % 2), 0).show();
                objArr22 = new Object[]{strArr20, new int[]{i220}, new int[1], new int[]{i219}};
                int i2118 = ((int[]) objArr21[2])[0];
                int i2119 = ((int[]) objArr21[3])[0];
                int i2210 = ((int[]) objArr21[1])[0];
                String[] strArr22 = (String[]) objArr21[0];
                int i2211 = ~Process.myTid();
                int i2212 = i2118 + 644797189 + (((~((-303110657) | i2211)) | 547390826) * (-828)) + ((i2211 | (-303110657)) * (-828)) + 1867520000;
                int i2213 = (i2212 << 13) ^ i2212;
                int i2214 = i2213 ^ (i2213 >>> 17);
                c = 0;
                ((int[]) objArr22[2])[0] = i2214 ^ (i2214 << 5);
            }
            int i2215 = ((int[]) objArr37[c])[c];
            int i2216 = i2215 * i2215;
            int i2217 = -(1782957044 * i2215);
            int i2218 = ((i2216 | i2217) << 1) - (i2216 ^ i2217);
            int i2219 = -(i2215 * (-1456408770));
            int i2310 = ((i2218 & i2219) + (i2219 | i2218)) - 1581349519;
            int i2311 = i2310 >> 29;
            int i2312 = ((i2311 & (-15)) + (i2311 | (-15))) / 8;
            int i2313 = (i2310 - (~(((i2312 | 1) << 1) - (i2312 ^ 1)))) - 1;
            int i2314 = ((i2310 >> 25) - 255) / 128;
            int i2315 = (-(i2313 ^ (((i2314 | 1) << 1) - (i2314 ^ 1)))) + 7;
            int i2316 = i2315 >> 22;
            int i2317 = ((((i2316 | (-2047)) << 1) - (i2316 ^ (-2047))) / 1024) + 1;
            int i2318 = 4801020 / ((i2315 & (-(((i2317 | 1) << 1) - (i2317 ^ 1)))) * 1932);
            int i2319 = ((int[]) objArr3[1])[0];
            int i2410 = i2319 * i2319;
            int i2411 = -(1045046327 * i2319);
            int i2412 = (i2410 & i2411) + (i2410 | i2411);
            int i2413 = -(i2319 * 2034666645);
            int i2414 = (i2412 & i2413) + (i2413 | i2412);
            int i2415 = (i2414 ^ (-1041872732)) + (((-1041872732) & i2414) << 1);
            int i2416 = i2415 >> 24;
            int i2417 = ((i2416 & (-511)) + (i2416 | (-511))) / 256;
            int i2418 = (i2415 - (~(((i2417 | 1) << 1) - (i2417 ^ 1)))) - 1;
            int i2419 = i2415 >> 16;
            int i2510 = (((-131071) ^ i2419) + ((i2419 & (-131071)) << 1)) / 65536;
            int i2511 = -(i2418 ^ ((i2510 ^ 1) + ((i2510 & 1) << 1)));
            int i2512 = (i2511 & 1) + (i2511 | 1);
            int i2513 = ((i2512 >> 28) - 31) / 16;
            int i2514 = ((i2513 | 1) << 1) - (i2513 ^ 1);
            int i2515 = i2318 + (443716 / (((-((i2514 ^ 1) + ((i2514 & 1) << 1))) & i2512) * 742));
            int i2516 = ((int[]) objArr5[1])[0];
            int i2517 = i2516 * i2516;
            int i2518 = -(1308279787 * i2516);
            int i2519 = (i2517 & i2518) + (i2517 | i2518);
            int i2610 = -(i2516 * 1841813427);
            int i2611 = ((i2519 | i2610) << 1) - (i2610 ^ i2519);
            int i2612 = (i2611 & 1132735841) + (1132735841 | i2611);
            int i2613 = (((i2612 >> 18) - 32767) / 16384) + 1;
            int i2614 = ((i2612 | i2613) << 1) - (i2613 ^ i2612);
            int i2615 = i2612 >> 17;
            int i2616 = (((-65535) & i2615) + (i2615 | (-65535))) / 32768;
            int i2617 = -(((i2616 ^ 1) + ((i2616 & 1) << 1)) ^ i2614);
            int i2618 = ((i2617 | 7) << 1) - (i2617 ^ 7);
            int i2619 = ((i2618 >> 21) - 4095) / 2048;
            int i2710 = ((i2619 | 1) << 1) - (i2619 ^ 1);
            int i2711 = i2515 + (5022990 / (((-((i2710 ^ 1) + ((i2710 & 1) << 1))) & i2618) * 1407));
            int i2712 = ((int[]) objArr7[1])[0];
            int i2713 = ((i2712 * i2712) - (~(-(1212862219 * i2712)))) - 1;
            int i2714 = -(i2712 * 354049661);
            int i2715 = ((i2713 | i2714) << 1) - (i2714 ^ i2713);
            int i2716 = (i2715 & 1901741584) + (1901741584 | i2715);
            int i2717 = i2716 >> 17;
            int i2718 = (((-65535) & i2717) + (i2717 | (-65535))) / 32768;
            int i2719 = ((i2718 | 1) << 1) - (i2718 ^ 1);
            int i2810 = (i2716 ^ i2719) + ((i2719 & i2716) << 1);
            int i2811 = ((i2716 >> 29) - 15) / 8;
            int i2812 = (-(i2810 ^ (((i2811 | 1) << 1) - (i2811 ^ 1)))) + 6;
            int i2813 = i2812 >> 20;
            int i2814 = i2711 + (5708394 / ((i2812 & (-((((i2813 & (-8191)) + (i2813 | (-8191))) / 4096) + 2))) * 1503));
            int i2815 = ((int[]) objArr10[1])[0];
            int i2816 = i2815 * i2815;
            int i2817 = -(1258874226 * i2815);
            int i2818 = (i2816 ^ i2817) + ((i2816 & i2817) << 1);
            int i2819 = -(i2815 * (-411475194));
            int i2910 = ((i2818 & i2819) + (i2819 | i2818)) - (-597224976);
            int i2911 = i2910 >> 20;
            int i2912 = ((i2911 & (-8191)) + (i2911 | (-8191))) / 4096;
            int i2913 = (i2910 - (~((i2912 ^ 1) + ((i2912 & 1) << 1)))) - 1;
            int i2914 = i2910 >> 16;
            int i2915 = -(i2913 ^ (((((-131071) & i2914) + (i2914 | (-131071))) / 65536) + 1));
            int i2916 = (i2915 ^ 4) + ((i2915 & 4) << 1);
            int i2917 = (((i2916 >> 15) - 262143) / 131072) + 1;
            int i2918 = i2814 + (3995136 / (((-((i2917 ^ 1) + ((i2917 & 1) << 1))) & i2916) * 1224));
            int i2919 = ((int[]) objArr12[3])[0];
            int i3010 = i2919 * i2919;
            int i3011 = -(697697465 * i2919);
            int i3012 = (i3010 ^ i3011) + ((i3010 & i3011) << 1);
            int i3013 = -(i2919 * 230309181);
            int i3014 = ((i3012 | i3013) << 1) - (i3013 ^ i3012);
            int i3015 = ((i3014 | 1068480025) << 1) - (1068480025 ^ i3014);
            int i3016 = i3015 >> 16;
            int i3017 = (((-131071) ^ i3016) + ((i3016 & (-131071)) << 1)) / 65536;
            int i3018 = (i3015 - (~((i3017 ^ 1) + ((i3017 & 1) << 1)))) - 1;
            int i3019 = ((i3015 >> 23) - 1023) / 512;
            int i3110 = -(i3018 ^ ((i3019 ^ 1) + ((i3019 & 1) << 1)));
            int i3111 = ((i3110 | 5) << 1) - (i3110 ^ 5);
            int i3112 = i3111 >> 27;
            int i3113 = (((i3112 | (-63)) << 1) - (i3112 ^ (-63))) / 32;
            int i3114 = (i3113 ^ 1) + ((i3113 & 1) << 1);
            int i3115 = i2918 + (9771120 / (((-((i3114 & 1) + (i3114 | 1))) & i3111) * 1968));
            int i3116 = ((int[]) objArr14[0])[0];
            int i3117 = ((i3116 * i3116) - (~(-(1487085662 * i3116)))) - 1;
            int i3118 = -(i3116 * 622676956);
            int i3119 = ((i3117 | i3118) << 1) - (i3117 ^ i3118);
            int i3210 = ((i3119 | (-902807735)) << 1) - ((-902807735) ^ i3119);
            int i3211 = i3210 >> 20;
            int i3212 = ((i3211 ^ (-8191)) + ((i3211 & (-8191)) << 1)) / 4096;
            int i3213 = (i3210 - (~((i3212 ^ 1) + ((i3212 & 1) << 1)))) - 1;
            int i3214 = i3210 >> 24;
            int i3215 = (((i3214 | (-511)) << 1) - (i3214 ^ (-511))) / 256;
            int i3216 = -(i3213 ^ (((i3215 | 1) << 1) - (i3215 ^ 1)));
            int i3217 = ((i3216 | 5) << 1) - (i3216 ^ 5);
            int i3218 = i3217 >> 23;
            int i3219 = ((i3218 & (-1023)) + (i3218 | (-1023))) / 512;
            int i3310 = i3115 + (5749890 / (((-(((i3219 & 1) + (i3219 | 1)) + 1)) & i3217) * 1399));
            int i3311 = ((int[]) objArr16[3])[0];
            int i3312 = ((((i3311 * i3311) - (~(-(1705076136 * i3311)))) - 1) - (~(-(i3311 * (-381342966))))) - 1;
            int i3313 = (i3312 ^ 845688561) + ((i3312 & 845688561) << 1);
            int i3314 = i3313 >> 19;
            int i3315 = ((i3314 & (-16383)) + (i3314 | (-16383))) / 8192;
            int i3316 = (i3313 - (~((i3315 ^ 1) + ((i3315 & 1) << 1)))) - 1;
            int i3317 = ((i3313 >> 16) - 131071) / 65536;
            int i3318 = -(i3316 ^ (((i3317 | 1) << 1) - (i3317 ^ 1)));
            int i3319 = (i3318 & 3) + (i3318 | 3);
            int i3410 = i3319 >> 22;
            int i3411 = (((i3410 | (-2047)) << 1) - (i3410 ^ (-2047))) / 1024;
            int i3412 = (i3411 & 1) + (i3411 | 1);
            int i3413 = i3310 + (1488960 / (((-(((i3412 | 1) << 1) - (i3412 ^ 1))) & i3319) * 517));
            int i3414 = ((int[]) objArr1110[2])[0];
            int i3415 = ((i3414 * i3414) - (~(-(770155949 * i3414)))) - 1;
            int i3416 = -(i3414 * (-1321042351));
            int i3417 = (i3415 ^ i3416) + ((i3415 & i3416) << 1);
            int i3418 = (i3417 ^ 370793473) + ((370793473 & i3417) << 1);
            int i3419 = i3418 >> 24;
            int i3510 = (((i3419 & (-511)) + (i3419 | (-511))) / 256) + 1;
            int i3511 = ((i3418 | i3510) << 1) - (i3510 ^ i3418);
            int i3512 = i3418 >> 19;
            int i3513 = ((i3512 & (-16383)) + (i3512 | (-16383))) / 8192;
            int i3514 = (-(i3511 ^ ((i3513 ^ 1) + ((i3513 & 1) << 1)))) + 1;
            int i3515 = ((i3514 >> 24) - 511) / 256;
            int i3516 = ((i3515 | 1) << 1) - (i3515 ^ 1);
            int i3517 = i3413 + (1823088 / ((i3514 & (-((i3516 ^ 1) + ((i3516 & 1) << 1)))) * 1999));
            int i3518 = ((int[]) objArr20[1])[0];
            int i3519 = i3518 * i3518;
            int i3610 = -(679631359 * i3518);
            int i3611 = (((i3519 & i3610) + (i3519 | i3610)) - (~(-(i3518 * 1504706183)))) - 1296230008;
            int i3612 = i3611 >> 18;
            int i3613 = ((i3611 >> 15) - 262143) / 131072;
            int i3614 = (-(((i3611 - (~(((((i3612 | (-32767)) << 1) - (i3612 ^ (-32767))) / 16384) + 1))) - 1) ^ ((i3613 & 1) + (i3613 | 1)))) + 8;
            int i3615 = i3614 >> 20;
            int i3616 = i3517 + (617760 / ((i3614 & (-(((((i3615 | (-8191)) << 1) - (i3615 ^ (-8191))) / 4096) + 2))) * 396));
            int i3617 = ((int[]) objArr22[2])[0];
            int i3618 = i3617 * i3617;
            int i3619 = -(481707229 * i3617);
            int i3710 = (i3618 ^ i3619) + ((i3618 & i3619) << 1);
            int i3711 = -(i3617 * (-690147765));
            int i3712 = (i3710 ^ i3711) + ((i3711 & i3710) << 1);
            int i3713 = ((i3712 | (-655409776)) << 1) - ((-655409776) ^ i3712);
            int i3714 = i3713 >> 26;
            int i3715 = (((i3714 | ComposerKt.defaultsKey) << 1) - (i3714 ^ ComposerKt.defaultsKey)) / 64;
            int i3716 = (i3715 & 1) + (i3715 | 1);
            int i3717 = ((i3713 | i3716) << 1) - (i3716 ^ i3713);
            int i3718 = i3713 >> 15;
            int i3719 = (((-262143) & i3718) + (i3718 | (-262143))) / 131072;
            int i3810 = -(((i3719 ^ 1) + ((i3719 & 1) << 1)) ^ i3717);
            int i3811 = ((i3810 | 5) << 1) - (i3810 ^ 5);
            int i3812 = i3811 >> 15;
            int i3813 = ((((-262143) ^ i3812) + ((i3812 & (-262143)) << 1)) / 131072) + 1;
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "1,9,20,26,File Downloaded".substring(i3616 + ((-30629760) / (((-((i3813 & 1) + (i3813 | 1))) & i3811) * TypedValues.Custom.TYPE_STRING))), 0).show();
        }
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault73 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault73 == null) {
            char cAlpha = (char) Color.alpha(0);
            int iIndexOf12 = 875 - TextUtils.indexOf((CharSequence) "", '0');
            int touchSlop7 = (ViewConfiguration.getTouchSlop() >> 8) + 10;
            byte[] bArr60 = $$a;
            Object[] objArr140 = new Object[1];
            c((short) 88, bArr60[91], bArr60[7], objArr140);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault73 = initSession.b(cAlpha, iIndexOf12, touchSlop7, 2012931276, false, (String) objArr140[0], null);
        }
        Object[] objArr141 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault73).get(null);
        objArr4 = new Object[]{new int[]{((int[]) objArr141[0])[0]}, new int[1], new int[]{((int[]) objArr141[2])[0]}, (String[]) objArr141[3]};
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i390 = ~startElapsedRealtime;
        int i391 = ((((-1811397564) + ((((~(236595343 | i390)) | (-276905573)) | (~((-236595344) | startElapsedRealtime))) * (-564))) + ((~(startElapsedRealtime | (-10245))) * 1128)) + (((~((-276905573) | i390)) | 236585099) * 564)) - 522713019;
        int i392 = (i391 << 13) ^ i391;
        int i393 = i392 ^ (i392 >>> 17);
        ((int[]) objArr4[1])[0] = i393 ^ (i393 << 5);
        str2 = str;
        i2 = ((int[]) objArr4[2])[0];
        i3 = ((int[]) objArr4[0])[0];
        if (i3 == i2) {
            int i710 = ((int[]) objArr4[1])[0];
            objArr5 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[1], new int[]{((int[]) objArr4[2])[0]}, (String[]) objArr4[3]};
            int iIdentityHashCode17 = System.identityHashCode(this);
            int i810 = ~((-537077249) | iIdentityHashCode17);
            int i811 = ~iIdentityHashCode17;
            int i812 = i710 + 2120383296 + ((i810 | (~(1073706687 | i811))) * 497) + (((~(iIdentityHashCode17 | 1073706687)) | (~((-576939669) | i811)) | 39862420) * 497);
            int i813 = (i812 << 13) ^ i812;
            int i814 = i813 ^ (i813 >>> 17);
            ((int[]) objArr5[1])[0] = i814 ^ (i814 << 5);
            i4 = 0;
        } else {
            int[] iArr9 = new int[i3];
            int i815 = i3 - 1;
            iArr9[i815] = 1;
            Toast.makeText((Context) null, iArr9[((i3 * i815) % 2) - 1], 1).show();
            int i816 = ((int[]) objArr4[1])[0];
            objArr5 = new Object[]{new int[]{((int[]) objArr4[0])[0]}, new int[1], new int[]{((int[]) objArr4[2])[0]}, (String[]) objArr4[3]};
            int iUptimeMillis3 = (int) SystemClock.uptimeMillis();
            int i817 = i816 + 167148736 + (((~((~iUptimeMillis3) | (-474374403))) | (~((-10552465) | iUptimeMillis3))) * (-302)) + ((~((-474374403) | iUptimeMillis3)) * (-604)) + (((~(iUptimeMillis3 | (-484926867))) | (-535789560)) * 302);
            int i818 = (i817 << 13) ^ i817;
            int i819 = i818 ^ (i818 >>> 17);
            i4 = 0;
            ((int[]) objArr5[1])[0] = i819 ^ (i819 << 5);
        }
        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cResolveSizeAndState4 = (char) View.resolveSizeAndState(i4, i4, i4);
            int bitsPerPixel5 = 875 - ImageFormat.getBitsPerPixel(i4);
            int iLastIndexOf7 = TextUtils.lastIndexOf("", '0', i4, i4) + 11;
            byte[] bArr110 = $$a;
            Object[] objArr510 = new Object[1];
            c((short) 140, bArr110[88], (byte) (bArr110[1] - 1), objArr510);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSizeAndState4, bitsPerPixel5, iLastIndexOf7, -1199417970, false, (String) objArr510[0], null);
        }
        j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        jLongValue = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char mode8 = (char) View.MeasureSpec.getMode(0);
            int edgeSlop7 = 876 - (ViewConfiguration.getEdgeSlop() >> 16);
            int i910 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 9;
            Object[] objArr610 = new Object[1];
            c((short) 150, $$a[14], (byte) 52, objArr610);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(mode8, edgeSlop7, i910, 254769921, false, (String) objArr610[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault56 == null) {
                char scrollBarFadeDuration5 = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int iLastIndexOf8 = 875 - TextUtils.lastIndexOf("", '0', 0, 0);
                int maximumDrawingCacheSize8 = 10 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                byte[] bArr111 = $$a;
                Object[] objArr611 = new Object[1];
                c((short) 150, bArr111[88], bArr111[81], objArr611);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault56 = initSession.b(scrollBarFadeDuration5, iLastIndexOf8, maximumDrawingCacheSize8, 1324201839, false, (String) objArr611[0], null);
            }
            Object[] objArr612 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault56).get(null);
            objArr6 = new Object[]{new int[]{((int[]) objArr612[0])[0]}, new int[1], new int[]{((int[]) objArr612[2])[0]}, (String[]) objArr612[3]};
            int i911 = (int) Runtime.getRuntime().totalMemory();
            int i912 = ((190876722 + (((~((-75505670) | i911)) | (~((-35195441) | i911))) * 69)) + (((~(i911 | (-976870393))) | ((~((-1017180622) | i911)) | 941674952)) * (-69))) - 1673041787;
            int i913 = (i912 << 13) ^ i912;
            int i914 = i913 ^ (i913 >>> 17);
            ((int[]) objArr6[1])[0] = i914 ^ (i914 << 5);
        } else {
            Object[] objArr613 = {Integer.valueOf(((Integer) Class.forName(str6).getMethod(str7, Object.class).invoke(null, this)).intValue()), -2073537541};
            byte[] bArr112 = $$d;
            byte b24 = (byte) (bArr112[52] + 1);
            Object[] objArr614 = new Object[1];
            d((short) 206, b24, (byte) (b24 + 2), objArr614);
            Class<?> cls8 = Class.forName((String) objArr614[0]);
            Object[] objArr615 = new Object[1];
            d((short) 169, bArr112[155], bArr112[64], objArr615);
            objArr6 = (Object[]) cls8.getMethod((String) objArr615[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr613);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cLastIndexOf4 = (char) (TextUtils.lastIndexOf("", '0') + 1);
                int iIndexOf13 = TextUtils.indexOf((CharSequence) "", '0') + 877;
                int packedPositionGroup5 = 10 - ExpandableListView.getPackedPositionGroup(0L);
                byte[] bArr113 = $$a;
                Object[] objArr616 = new Object[1];
                c((short) 150, bArr113[88], bArr113[81], objArr616);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cLastIndexOf4, iIndexOf13, packedPositionGroup5, 1324201839, false, (String) objArr616[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArr6);
            long jLongValue111 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
            Long lValueOf29 = Long.valueOf(jLongValue111);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char cMyPid2 = (char) (Process.myPid() >> 22);
                int iLastIndexOf9 = 875 - TextUtils.lastIndexOf("", '0');
                int deadChar4 = 10 - KeyEvent.getDeadChar(0, 0);
                Object[] objArr617 = new Object[1];
                c((short) 150, $$a[14], (byte) 52, objArr617);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMyPid2, iLastIndexOf9, deadChar4, 254769921, false, (String) objArr617[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf29);
            Long lValueOf30 = Long.valueOf(jLongValue111 >> 12);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                char c15 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                int scrollDefaultDelay3 = 876 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int maxKeyCode2 = 10 - (KeyEvent.getMaxKeyCode() >> 16);
                byte[] bArr210 = $$a;
                Object[] objArr618 = new Object[1];
                c((short) 140, bArr210[88], (byte) (bArr210[1] - 1), objArr618);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c15, scrollDefaultDelay3, maxKeyCode2, -1199417970, false, (String) objArr618[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf30);
        }
        i5 = ((int[]) objArr6[2])[0];
        i6 = ((int[]) objArr6[0])[0];
        if (i6 == i5) {
            int i915 = ((int[]) objArr6[1])[0];
            objArr7 = new Object[]{new int[]{((int[]) objArr6[0])[0]}, new int[1], new int[]{((int[]) objArr6[2])[0]}, (String[]) objArr6[3]};
            int iIdentityHashCode18 = System.identityHashCode(this);
            int i916 = i915 + (-27710124) + (((-42485771) | (~iIdentityHashCode18)) * (-490)) + (((~(iIdentityHashCode18 | 141932405)) | (-184418176)) * 490) + 895422066;
            int i917 = (i916 << 13) ^ i916;
            int i918 = i917 ^ (i917 >>> 17);
            i7 = 0;
            ((int[]) objArr7[1])[0] = i918 ^ (i918 << 5);
        } else {
            arrayList = new ArrayList();
            strArr = (String[]) objArr6[3];
            if (strArr != null) {
                while (i8 < strArr.length) {
                    arrayList.add(str11);
                }
            }
            int[] iArr10 = new int[i6];
            int i919 = i6 - 1;
            iArr10[i919] = 1;
            Toast.makeText((Context) null, iArr10[((i6 * i919) % 2) - 1], 1).show();
            int i1010 = ((int[]) objArr6[1])[0];
            objArr7 = new Object[]{new int[]{((int[]) objArr6[0])[0]}, new int[1], new int[]{((int[]) objArr6[2])[0]}, (String[]) objArr6[3]};
            int i1011 = ~(System.identityHashCode(this) | 589278406);
            int i1012 = i1010 + ((((-61291064) | i1011) * (-658)) - 2123609260) + ((i1011 | (-599768824)) * 658);
            int i1013 = (i1012 << 13) ^ i1012;
            int i1014 = i1013 ^ (i1013 >>> 17);
            i7 = 0;
            ((int[]) objArr7[1])[0] = i1014 ^ (i1014 << 5);
        }
        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char c16 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(i7) + 876;
            int minimumFlingVelocity6 = 10 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            short s110 = $$a[5];
            Object[] objArr619 = new Object[1];
            c(s110, (byte) (s110 & 5), (byte) 52, objArr619);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c16, iNormalizeMetaState2, minimumFlingVelocity6, 252381699, false, (String) objArr619[0], null);
        }
        j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).getLong(null);
        jLongValue2 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
            char c17 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int longPressTimeout2 = 876 - (ViewConfiguration.getLongPressTimeout() >> 16);
            int i1015 = 9 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            short s111 = (short) ($$b | 148);
            byte[] bArr211 = $$a;
            Object[] objArr710 = new Object[1];
            c(s111, bArr211[91], bArr211[7], objArr710);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c17, longPressTimeout2, i1015, 2009631821, false, (String) objArr710[0], null);
        }
        if (j2 == ((jLongValue2 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null) << 52) >>> 52)) >> 12)) {
            int i1016 = b + 23;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1016 % 128;
            int i1017 = i1016 % 2;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault55 == null) {
                char cIndexOf7 = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                int i1018 = 875 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                int i1019 = 9 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                byte b25 = $$a[7];
                Object[] objArr711 = new Object[1];
                c((short) 209, b25, (byte) (b25 | 52), objArr711);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault55 = initSession.b(cIndexOf7, i1018, i1019, 256017550, false, (String) objArr711[0], null);
            }
            Object[] objArr712 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault55).get(null);
            objArr9 = new Object[]{new int[]{((int[]) objArr712[0])[0]}, new int[1], new int[]{((int[]) objArr712[2])[0]}, (String[]) objArr712[3]};
            int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
            int i1110 = (((~(123971228 | iFreeMemory2)) | (-245963502)) * 398) + 1419832078 + (((~((~iFreeMemory2) | 123971228)) | (-245963502)) * 398) + 1379959994;
            int i1111 = (i1110 << 13) ^ i1110;
            int i1112 = i1111 ^ (i1111 >>> 17);
            ((int[]) objArr9[1])[0] = i1112 ^ (i1112 << 5);
        } else {
            if (p0 != null) {
                applicationContext3 = p0;
            } else if (p0 instanceof ContextWrapper) {
                applicationContext3 = p0.getApplicationContext();
            } else {
                applicationContext3 = p0.getApplicationContext();
            }
            Object[] objArr713 = {applicationContext3, Integer.valueOf(((Integer) Class.forName(str6).getMethod(str7, Object.class).invoke(null, this)).intValue()), 1379959994};
            byte[] bArr212 = $$d;
            byte b110 = (byte) (bArr212[203] + 1);
            Object[] objArr714 = new Object[1];
            d((short) 236, b110, (byte) (b110 & 240), objArr714);
            Class<?> cls9 = Class.forName((String) objArr714[0]);
            Object[] objArr715 = new Object[1];
            d((short) 169, bArr212[155], bArr212[64], objArr715);
            objArr8 = (Object[]) cls9.getMethod((String) objArr715[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr713);
            if (applicationContext3 != null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                    char tapTimeout3 = (char) (ViewConfiguration.getTapTimeout() >> 16);
                    int packedPositionGroup6 = ExpandableListView.getPackedPositionGroup(0L) + 876;
                    int iMyTid4 = (Process.myTid() >> 22) + 10;
                    byte b111 = $$a[7];
                    Object[] objArr716 = new Object[1];
                    c((short) 209, b111, (byte) (b111 | 52), objArr716);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(tapTimeout3, packedPositionGroup6, iMyTid4, 256017550, false, (String) objArr716[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, objArr8);
                long jLongValue112 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf31 = Long.valueOf(jLongValue112);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                    char cNormalizeMetaState4 = (char) KeyEvent.normalizeMetaState(0);
                    int iIndexOf14 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 877;
                    int iAxisFromString4 = MotionEvent.axisFromString("") + 11;
                    short s112 = (short) ($$b | 148);
                    byte[] bArr213 = $$a;
                    Object[] objArr717 = new Object[1];
                    c(s112, bArr213[91], bArr213[7], objArr717);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cNormalizeMetaState4, iIndexOf14, iAxisFromString4, 2009631821, false, (String) objArr717[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).set(null, lValueOf31);
                Long lValueOf110 = Long.valueOf(jLongValue112 >> 12);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                    char c18 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                    int offsetAfter2 = 876 - TextUtils.getOffsetAfter("", 0);
                    int threadPriority5 = ((Process.getThreadPriority(0) + 20) >> 6) + 10;
                    short s113 = $$a[5];
                    Object[] objArr718 = new Object[1];
                    c(s113, (byte) (s113 & 5), (byte) 52, objArr718);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c18, offsetAfter2, threadPriority5, 252381699, false, (String) objArr718[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, lValueOf110);
            } else {
                objArr8 = objArr8;
            }
            objArr9 = objArr8;
        }
        i9 = ((int[]) objArr9[2])[0];
        i10 = ((int[]) objArr9[0])[0];
        if (i10 == i9) {
            int i1113 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
            b = i1113 % 128;
            int i1114 = i1113 % 2;
            int i1115 = ((int[]) objArr9[1])[0];
            objArr10 = new Object[]{new int[]{((int[]) objArr9[0])[0]}, new int[1], new int[]{((int[]) objArr9[2])[0]}, (String[]) objArr9[3]};
            int iIdentityHashCode19 = System.identityHashCode(this);
            int i1116 = ~(552676834 | iIdentityHashCode19);
            int i1117 = i1115 + (-1241845002) + (((-1056652784) | i1116) * (-814)) + ((i1116 | (~((~iIdentityHashCode19) | 512366605)) | 8390656) * 407) + (((~(iIdentityHashCode19 | (-512366606))) | (~((-552676835) | iIdentityHashCode19)) | 8390656) * 407);
            int i1118 = i1117 ^ (i1117 << 13);
            int i1119 = i1118 ^ (i1118 >>> 17);
            ((int[]) objArr10[1])[0] = i1119 ^ (i1119 << 5);
            i11 = 0;
        } else {
            int[] iArr11 = new int[i10];
            int i1210 = i10 - 1;
            iArr11[i1210] = 1;
            Toast.makeText((Context) null, iArr11[((i10 * i1210) % 2) - 1], 1).show();
            int i1211 = ((int[]) objArr9[1])[0];
            objArr10 = new Object[]{new int[]{((int[]) objArr9[0])[0]}, new int[1], new int[]{((int[]) objArr9[2])[0]}, (String[]) objArr9[3]};
            int i1212 = ~System.identityHashCode(this);
            int i1213 = i1211 + (-449024284) + (((~((-565395155) | i1212)) | 525084925) * (-933)) + (((~(i1212 | 525084925)) | (-1073692416)) * 933) + 1794941953;
            int i1214 = (i1213 << 13) ^ i1213;
            int i1215 = i1214 ^ (i1214 >>> 17);
            i11 = 0;
            ((int[]) objArr10[1])[0] = i1215 ^ (i1215 << 5);
        }
        objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
            char maximumFlingVelocity4 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int iAlpha4 = Color.alpha(i11) + 651;
            int i1216 = 45 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            short s210 = (short) ($$b | 148);
            byte[] bArr214 = $$a;
            Object[] objArr719 = new Object[1];
            c(s210, bArr214[91], bArr214[7], objArr719);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(maximumFlingVelocity4, iAlpha4, i1216, -459846511, false, (String) objArr719[0], null);
        }
        j3 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).getLong(null);
        jLongValue3 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
            char windowTouchSlop3 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
            int tapTimeout4 = 651 - (ViewConfiguration.getTapTimeout() >> 16);
            int iIndexOf15 = 43 - TextUtils.indexOf((CharSequence) "", '0');
            short s211 = $$a[5];
            Object[] objArr810 = new Object[1];
            c(s211, (byte) (s211 & 5), (byte) 52, objArr810);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(windowTouchSlop3, tapTimeout4, iIndexOf15, -873460649, false, (String) objArr810[0], null);
        }
        if (j3 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).getLong(null) << 52) >>> 52)) >> 12)) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault54 == null) {
                char cMakeMeasureSpec3 = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                int iResolveOpacity4 = 651 - Drawable.resolveOpacity(0, 0);
                int threadPriority6 = ((Process.getThreadPriority(0) + 20) >> 6) + 44;
                byte[] bArr215 = $$a;
                short s212 = bArr215[5];
                byte b112 = bArr215[91];
                Object[] objArr811 = new Object[1];
                c(s212, b112, (byte) (b112 - 4), objArr811);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault54 = initSession.b(cMakeMeasureSpec3, iResolveOpacity4, threadPriority6, -1595579076, false, (String) objArr811[0], null);
            }
            Object[] objArr812 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault54).get(null);
            objArr11 = new Object[]{new int[]{i128}, new String[0], new int[]{i127}, new int[1]};
            int i1217 = ((int[]) objArr812[2])[0];
            int i1218 = ((int[]) objArr812[0])[0];
            int startUptimeMillis3 = (int) Process.getStartUptimeMillis();
            int i1219 = ~startUptimeMillis3;
            int i1310 = 1852704781 + (((~(937121162 | i1219)) | (-940551973) | (~((-937121163) | startUptimeMillis3))) * (-564)) + ((~(startUptimeMillis3 | (-806028545))) * 1128) + (((~((-940551973) | i1219)) | 131092618) * 564) + 574201108;
            int i1311 = (i1310 << 13) ^ i1310;
            int i1312 = i1311 ^ (i1311 >>> 17);
            ((int[]) objArr11[3])[0] = i1312 ^ (i1312 << 5);
            i12 = 0;
        } else {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b((char) Color.red(0), TextUtils.indexOf((CharSequence) "", '0') + 1611, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 26, 2145681644, false, null, new Class[0]);
            }
            Object[] objArr813 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).newInstance(null), 574201108, 0};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                char cKeyCodeFromString2 = (char) KeyEvent.keyCodeFromString("");
                int packedPositionType7 = ExpandableListView.getPackedPositionType(0L) + 651;
                int i1313 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44;
                short s213 = $$a[5];
                Object[] objArr814 = new Object[1];
                c(s213, (byte) (s213 & 5), (byte) 52, objArr814);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cKeyCodeFromString2, packedPositionType7, i1313, 2075921419, false, (String) objArr814[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getTapTimeout() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 695, View.getDefaultSize(0, 0) + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (Gravity.getAbsoluteGravity(0, 0) + 63406), 794 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 83), Integer.TYPE, Integer.TYPE});
            }
            objArr11 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).invoke(null, objArr813);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                char packedPositionGroup7 = (char) ExpandableListView.getPackedPositionGroup(0L);
                int iResolveOpacity5 = Drawable.resolveOpacity(0, 0) + 651;
                int defaultSize3 = View.getDefaultSize(0, 0) + 44;
                byte[] bArr216 = $$a;
                short s214 = bArr216[5];
                byte b113 = bArr216[91];
                Object[] objArr815 = new Object[1];
                c(s214, b113, (byte) (b113 - 4), objArr815);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(packedPositionGroup7, iResolveOpacity5, defaultSize3, -1595579076, false, (String) objArr815[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).set(null, objArr11);
            long jLongValue113 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
            Long lValueOf111 = Long.valueOf(jLongValue113);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                char cResolveOpacity4 = (char) Drawable.resolveOpacity(0, 0);
                int edgeSlop8 = 651 - (ViewConfiguration.getEdgeSlop() >> 16);
                int iGreen3 = Color.green(0) + 44;
                short s215 = $$a[5];
                Object[] objArr816 = new Object[1];
                c(s215, (byte) (s215 & 5), (byte) 52, objArr816);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(cResolveOpacity4, edgeSlop8, iGreen3, -873460649, false, (String) objArr816[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).set(null, lValueOf111);
            Long lValueOf112 = Long.valueOf(jLongValue113 >> 12);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                char cMakeMeasureSpec4 = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                int iResolveSizeAndState6 = 651 - View.resolveSizeAndState(0, 0, 0);
                int iResolveOpacity6 = Drawable.resolveOpacity(0, 0) + 44;
                short s216 = (short) ($$b | 148);
                byte[] bArr217 = $$a;
                Object[] objArr817 = new Object[1];
                c(s216, bArr217[91], bArr217[7], objArr817);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(cMakeMeasureSpec4, iResolveSizeAndState6, iResolveOpacity6, -459846511, false, (String) objArr817[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).set(null, lValueOf112);
            i12 = 0;
        }
        i13 = ((int[]) objArr11[i12])[i12];
        i14 = ((int[]) objArr11[2])[i12];
        if (i14 == i13) {
            i15 = i12;
            arrayList2 = new ArrayList();
            strArr2 = (String[]) objArr11[1];
            if (strArr2 != null) {
                int i1314 = b + 121;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i1314 % 128;
                if (i1314 % 2 != 0) {
                }
                while (i16 < strArr2.length) {
                    arrayList2.add(strArr2[i16]);
                }
            }
            throw new RuntimeException(String.valueOf(i14));
        }
        objArr12 = new Object[4];
        int[] iArr12 = new int[1];
        objArr12[i12] = iArr12;
        int[] iArr13 = new int[1];
        objArr12[2] = iArr13;
        objArr12[3] = new int[1];
        int i1315 = ((int[]) objArr11[3])[i12];
        int i1316 = ((int[]) objArr11[2])[i12];
        int i1317 = ((int[]) objArr11[i12])[i12];
        iArr13[i12] = i1316;
        iArr12[i12] = i1317;
        objArr12[1] = new String[i12];
        int iIdentityHashCode20 = System.identityHashCode(this);
        int i1318 = ~iIdentityHashCode20;
        int i1319 = i1315 + 1272830139 + (((~(185178769 | i1318)) | (~((-188609580) | iIdentityHashCode20))) * (-370)) + (((~(iIdentityHashCode20 | 185178769)) | (~(i1318 | (-188609580))) | 2704) * (-370)) + 1000480;
        int i1410 = (i1319 << 13) ^ i1319;
        int i1411 = i1410 ^ (i1410 >>> 17);
        ((int[]) objArr12[3])[0] = i1411 ^ (i1411 << 5);
        objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
            char doubleTapTimeout3 = (char) (43042 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
            int doubleTapTimeout4 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 3111;
            int size3 = View.MeasureSpec.getSize(0) + 22;
            byte[] bArr218 = $$a;
            Object[] objArr818 = new Object[1];
            c((short) 88, bArr218[91], bArr218[7], objArr818);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(doubleTapTimeout3, doubleTapTimeout4, size3, -1272852037, false, (String) objArr818[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).getLong(null) != -1) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault53 == null) {
                char edgeSlop9 = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 43042);
                int iMakeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(0, 0) + 3111;
                int pressedStateDuration5 = 22 - (ViewConfiguration.getPressedStateDuration() >> 16);
                byte[] bArr219 = $$a;
                short s217 = bArr219[5];
                byte b114 = bArr219[91];
                Object[] objArr819 = new Object[1];
                c(s217, b114, (byte) (b114 - 4), objArr819);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault53 = initSession.b(edgeSlop9, iMakeMeasureSpec6, pressedStateDuration5, 154975793, false, (String) objArr819[0], null);
            }
            Object[] objArr910 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault53).get(null);
            int i1412 = ((int[]) objArr910[2])[0];
            int i1413 = ((int[]) objArr910[1])[0];
            String[] strArr116 = (String[]) objArr910[3];
            int[] iArr14 = {i1413};
            int iIdentityHashCode21 = System.identityHashCode(this);
            int i1414 = (((755369894 + (((~(1196760742 | iIdentityHashCode21)) | 403341400) * (-140))) + ((~(1600102142 | iIdentityHashCode21)) * 70)) + (((~(iIdentityHashCode21 | 508270716)) | 1495172826) * 70)) - 1442388011;
            int i1415 = (i1414 << 13) ^ i1414;
            int i1416 = i1415 ^ (i1415 >>> 17);
            ((int[]) objArr13[0])[0] = i1416 ^ (i1416 << 5);
            objArr13 = new Object[]{new int[1], iArr14, new int[]{i1412}, strArr116};
        } else {
            Object[] objArr911 = {null, Integer.valueOf(((Integer) Class.forName(str6).getMethod(str7, Object.class).invoke(null, this)).intValue()), 0, -1442388011};
            int i1417 = $$e;
            byte b115 = (byte) (i1417 | 9);
            Object[] objArr912 = new Object[1];
            d((short) 277, b115, (byte) (b115 & 175), objArr912);
            Class<?> cls10 = Class.forName((String) objArr912[0]);
            byte[] bArr310 = $$d;
            Object[] objArr913 = new Object[1];
            d((short) (i1417 - 2), (byte) (-bArr310[13]), bArr310[64], objArr913);
            Object[] objArr914 = (Object[]) cls10.getMethod((String) objArr913[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr911);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                char bitsPerPixel6 = (char) (ImageFormat.getBitsPerPixel(0) + 43043);
                int i1418 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3110;
                int iResolveSizeAndState7 = View.resolveSizeAndState(0, 0, 0) + 22;
                byte[] bArr311 = $$a;
                short s218 = bArr311[5];
                byte b116 = bArr311[91];
                Object[] objArr915 = new Object[1];
                c(s218, b116, (byte) (b116 - 4), objArr915);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(bitsPerPixel6, i1418, iResolveSizeAndState7, 154975793, false, (String) objArr915[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).set(null, objArr914);
            long jLongValue114 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
            Long lValueOf113 = Long.valueOf(jLongValue114);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                char cAxisFromString4 = (char) (43041 - MotionEvent.axisFromString(""));
                int iArgb3 = 3111 - Color.argb(0, 0, 0, 0);
                int iIndexOf16 = 21 - TextUtils.indexOf((CharSequence) "", '0');
                short s219 = (short) ($$b << 2);
                byte[] bArr312 = $$a;
                Object[] objArr916 = new Object[1];
                c(s219, bArr312[91], bArr312[7], objArr916);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(cAxisFromString4, iArgb3, iIndexOf16, -1269618118, false, (String) objArr916[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).set(null, lValueOf113);
            Long lValueOf114 = Long.valueOf(jLongValue114 >> 12);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                char cNormalizeMetaState5 = (char) (43042 - KeyEvent.normalizeMetaState(0));
                int iAxisFromString5 = MotionEvent.axisFromString("") + 3112;
                int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 22;
                byte[] bArr313 = $$a;
                Object[] objArr917 = new Object[1];
                c((short) 88, bArr313[91], bArr313[7], objArr917);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(cNormalizeMetaState5, iAxisFromString5, absoluteGravity2, -1272852037, false, (String) objArr917[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).set(null, lValueOf114);
            objArr13 = objArr914;
        }
        i17 = ((int[]) objArr13[1])[0];
        i18 = ((int[]) objArr13[2])[0];
        if (i18 == i17) {
            arrayList3 = new ArrayList();
            strArr3 = (String[]) objArr13[3];
            if (strArr3 != null) {
                while (i19 < strArr3.length) {
                    arrayList3.add(str12);
                }
            }
            throw new RuntimeException(String.valueOf(i18));
        }
        int i1419 = ((int[]) objArr13[0])[0];
        int i1510 = ((int[]) objArr13[2])[0];
        int i1511 = ((int[]) objArr13[1])[0];
        String[] strArr117 = (String[]) objArr13[3];
        int[] iArr15 = {i1511};
        int i1512 = ~((int) Process.getStartUptimeMillis());
        int i1513 = ~(939703838 | i1512);
        int i1514 = i1419 + 1189726410 + ((i1513 | 765327620) * 764) + (((~(i1512 | 765327620)) | 268568090) * (-1528)) + ((362759962 | i1513) * 764);
        int i1515 = (i1514 << 13) ^ i1514;
        int i1516 = i1515 ^ (i1515 >>> 17);
        ((int[]) objArr14[0])[0] = i1516 ^ (i1516 << 5);
        objArr14 = new Object[]{new int[1], iArr15, new int[]{i1510}, strArr117};
        objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
            char cGreen2 = (char) (Color.green(0) + 29944);
            int touchSlop8 = (ViewConfiguration.getTouchSlop() >> 8) + 1755;
            int i1517 = 23 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            byte[] bArr314 = $$a;
            short s310 = bArr314[5];
            byte b117 = bArr314[91];
            Object[] objArr918 = new Object[1];
            c(s310, b117, (byte) (b117 - 4), objArr918);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(cGreen2, touchSlop8, i1517, 986134021, false, (String) objArr918[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).getLong(null) != -1) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault52 == null) {
                char keyRepeatDelay3 = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 29944);
                int iAxisFromString6 = MotionEvent.axisFromString("") + 1756;
                int iLastIndexOf10 = TextUtils.lastIndexOf("", '0', 0, 0) + 24;
                short s311 = (short) ($$b << 2);
                byte[] bArr315 = $$a;
                Object[] objArr919 = new Object[1];
                c(s311, bArr315[91], bArr315[7], objArr919);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault52 = initSession.b(keyRepeatDelay3, iAxisFromString6, iLastIndexOf10, 1599039318, false, (String) objArr919[0], null);
            }
            Object[] objArr1010 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault52).get(null);
            objArr15 = new Object[]{new int[]{((int[]) objArr1010[0])[0]}, new int[]{((int[]) objArr1010[1])[0]}, (Object[]) objArr1010[2], new int[1], (String[]) objArr1010[4]};
            int iUptimeMillis4 = (int) SystemClock.uptimeMillis();
            int i1518 = (((-1533320075) + (((~((-409530881) | iUptimeMillis4)) | 622133306) * (-756))) + (((~iUptimeMillis4) | (-409530881)) * 756)) - 151240364;
            int i1519 = (i1518 << 13) ^ i1518;
            int i1611 = i1519 ^ (i1519 >>> 17);
            ((int[]) objArr15[3])[0] = i1611 ^ (i1611 << 5);
            objArr14 = objArr14;
        } else {
            int iIntValue7 = ((Integer) Class.forName(str6).getMethod(str7, Object.class).invoke(null, this)).intValue();
            Object[] objArr1011 = {-206576362};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b((char) (KeyEvent.getDeadChar(0, 0) + 42049), (Process.myPid() >> 22) + 1726, View.getDefaultSize(0, 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da2 = CaptureSession1.Companion.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue7, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).newInstance(objArr1011), -151240364);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                char c19 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 29943);
                int iBlue2 = Color.blue(0) + 1755;
                int iGreen4 = 23 - Color.green(0);
                short s312 = (short) ($$b << 2);
                byte[] bArr316 = $$a;
                Object[] objArr1012 = new Object[1];
                c(s312, bArr316[91], bArr316[7], objArr1012);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(c19, iBlue2, iGreen4, 1599039318, false, (String) objArr1012[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da2);
            long jLongValue115 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
            Long lValueOf115 = Long.valueOf(jLongValue115);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                char bitsPerPixel7 = (char) (ImageFormat.getBitsPerPixel(0) + 29945);
                int scrollBarSize7 = (ViewConfiguration.getScrollBarSize() >> 8) + 1755;
                int i1612 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23;
                short s313 = (short) ($$b | 148);
                byte[] bArr317 = $$a;
                Object[] objArr1013 = new Object[1];
                c(s313, bArr317[91], bArr317[7], objArr1013);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(bitsPerPixel7, scrollBarSize7, i1612, 1596667560, false, (String) objArr1013[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).set(null, lValueOf115);
            Long lValueOf116 = Long.valueOf(jLongValue115 >> 12);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                char scrollDefaultDelay4 = (char) (29944 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                int i1613 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1754;
                int iKeyCodeFromString5 = KeyEvent.keyCodeFromString("") + 23;
                byte[] bArr318 = $$a;
                short s314 = bArr318[5];
                byte b118 = bArr318[91];
                Object[] objArr1014 = new Object[1];
                c(s314, b118, (byte) (b118 - 4), objArr1014);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(scrollDefaultDelay4, i1613, iKeyCodeFromString5, 986134021, false, (String) objArr1014[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).set(null, lValueOf116);
            objArr15 = objArrTuitionPaymentFragmentbindingInflater1$5f1425da2;
        }
        i20 = ((int[]) objArr15[1])[0];
        i21 = ((int[]) objArr15[0])[0];
        if (i21 == i20) {
            arrayList4 = new ArrayList();
            strArr4 = (String[]) objArr15[4];
            if (strArr4 != null) {
                while (i22 < strArr4.length) {
                    arrayList4.add(str13);
                }
            }
            throw new RuntimeException(String.valueOf(i21));
        }
        int i1614 = ((int[]) objArr15[3])[0];
        objArr16 = new Object[]{new int[]{((int[]) objArr15[0])[0]}, new int[]{((int[]) objArr15[1])[0]}, (Object[]) objArr15[2], new int[1], (String[]) objArr15[4]};
        int iNextInt2 = new Random().nextInt(2003103873);
        int i1615 = i1614 + ((~((~iNextInt2) | 903813063)) * 130) + 559781703 + (((~(iNextInt2 | 903813063)) | 9110785) * 130);
        int i1616 = (i1615 << 13) ^ i1615;
        int i1617 = i1616 ^ (i1616 >>> 17);
        ((int[]) objArr16[3])[0] = i1617 ^ (i1617 << 5);
        objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
            char c20 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            int scrollBarSize8 = (ViewConfiguration.getScrollBarSize() >> 8) + 2267;
            int iKeyCodeFromString6 = KeyEvent.keyCodeFromString("") + 33;
            short s315 = (short) ($$b << 2);
            byte[] bArr319 = $$a;
            Object[] objArr1015 = new Object[1];
            c(s315, bArr319[91], bArr319[7], objArr1015);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(c20, scrollBarSize8, iKeyCodeFromString6, -887667012, false, (String) objArr1015[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).getLong(null) != -1) {
            applicationContext4 = p0;
            if (applicationContext4 != null) {
                applicationContext5 = applicationContext4;
            } else if (applicationContext4 instanceof ContextWrapper) {
                applicationContext5 = p0.getApplicationContext();
            } else {
                applicationContext5 = p0.getApplicationContext();
            }
            Object[] objArr1016 = {applicationContext5, Integer.valueOf(((Integer) Class.forName(str6).getMethod(str7, Object.class).invoke(null, this)).intValue()), 0, -1814298819};
            byte[] bArr413 = $$d;
            Object[] objArr1017 = new Object[1];
            d((short) 398, bArr413[37], bArr413[18], objArr1017);
            Class<?> cls11 = Class.forName((String) objArr1017[0]);
            Object[] objArr1018 = new Object[1];
            d((short) 407, (byte) (-bArr413[13]), bArr413[64], objArr1018);
            objArr17 = (Object[]) cls11.getMethod((String) objArr1018[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr1016);
            if (applicationContext5 != null) {
                i23 = b + 93;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i23 % 128;
                if (i23 % 2 == 0) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault33 == null) {
                        char deadChar5 = (char) KeyEvent.getDeadChar(0, 0);
                        int maximumFlingVelocity5 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2267;
                        int bitsPerPixel8 = ImageFormat.getBitsPerPixel(0) + 34;
                        byte[] bArr414 = $$a;
                        short s316 = bArr414[5];
                        byte b119 = bArr414[91];
                        Object[] objArr1019 = new Object[1];
                        c(s316, b119, (byte) (b119 - 4), objArr1019);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault33 = initSession.b(deadChar5, maximumFlingVelocity5, bitsPerPixel8, -654680577, false, (String) objArr1019[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault33).set(null, objArr17);
                    long jLongValue116 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[1]).invoke(null, new Object[1])).longValue();
                    Long lValueOf117 = Long.valueOf(jLongValue116);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault34 == null) {
                        char cAxisFromString5 = (char) (MotionEvent.axisFromString("") + 1);
                        int jumpTapTimeout6 = 2267 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int pressedStateDuration6 = (ViewConfiguration.getPressedStateDuration() >> 16) + 33;
                        byte[] bArr415 = $$a;
                        Object[] objArr1115 = new Object[1];
                        c((short) 88, bArr415[91], bArr415[7], objArr1115);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault34 = initSession.b(cAxisFromString5, jumpTapTimeout6, pressedStateDuration6, -874156483, false, (String) objArr1115[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault34).set(null, lValueOf117);
                    Long lValueOf118 = Long.valueOf(jLongValue116 << 56);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault35 == null) {
                        char c21 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                        int iIndexOf17 = 2267 - TextUtils.indexOf("", "");
                        int i1618 = 34 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        short s317 = (short) ($$b << 2);
                        byte[] bArr416 = $$a;
                        Object[] objArr1116 = new Object[1];
                        c(s317, bArr416[91], bArr416[7], objArr1116);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault35 = initSession.b(c21, iIndexOf17, i1618, -887667012, false, (String) objArr1116[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault35).set(null, lValueOf118);
                } else {
                    objArr12 = objArr12;
                    objArr16 = objArr16;
                    str7 = str7;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                        char size4 = (char) View.MeasureSpec.getSize(0);
                        int mode9 = 2267 - View.MeasureSpec.getMode(0);
                        int deadChar6 = KeyEvent.getDeadChar(0, 0) + 33;
                        byte[] bArr417 = $$a;
                        short s318 = bArr417[5];
                        byte b26 = bArr417[91];
                        Object[] objArr1117 = new Object[1];
                        c(s318, b26, (byte) (b26 - 4), objArr1117);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(size4, mode9, deadChar6, -654680577, false, (String) objArr1117[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).set(null, objArr17);
                    long jLongValue117 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf119 = Long.valueOf(jLongValue117);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                        char c110 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1);
                        int trimmedLength6 = 2267 - TextUtils.getTrimmedLength("");
                        int maximumDrawingCacheSize9 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 33;
                        byte[] bArr418 = $$a;
                        Object[] objArr1118 = new Object[1];
                        c((short) 88, bArr418[91], bArr418[7], objArr1118);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(c110, trimmedLength6, maximumDrawingCacheSize9, -874156483, false, (String) objArr1118[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).set(null, lValueOf119);
                    Long lValueOf210 = Long.valueOf(jLongValue117 >> 12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault32 == null) {
                        char cResolveSize2 = (char) View.resolveSize(0, 0);
                        int i1619 = 2267 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int scrollBarFadeDuration6 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 33;
                        short s319 = (short) ($$b << 2);
                        byte[] bArr419 = $$a;
                        Object[] objArr1119 = new Object[1];
                        c(s319, bArr419[91], bArr419[7], objArr1119);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault32 = initSession.b(cResolveSize2, i1619, scrollBarFadeDuration6, -887667012, false, (String) objArr1119[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault32).set(null, lValueOf210);
                }
            }
            if (((int[]) objArr17[0])[0] == ((int[]) objArr17[3])[0]) {
                arrayList5 = new ArrayList();
                strArr5 = (String[]) objArr17[1];
                if (strArr5 != null) {
                    while (i24 < strArr5.length) {
                        arrayList5.add(str14);
                    }
                }
                throw null;
            }
            Object[] objArr11110 = {new int[]{i1710}, strArr110, new int[1], new int[]{i1711}};
            int i16110 = ((int[]) objArr17[2])[0];
            int i17110 = ((int[]) objArr17[0])[0];
            int i17111 = ((int[]) objArr17[3])[0];
            String[] strArr118 = (String[]) objArr17[1];
            int iIdentityHashCode110 = System.identityHashCode(this);
            int i17112 = i16110 + 1304985706 + ((~(847021030 | iIdentityHashCode110)) * 623) + (((~iIdentityHashCode110) | 36208642) * (-623)) + (((~(iIdentityHashCode110 | 845971494)) | (~(37258178 | iIdentityHashCode110)) | (-847021031)) * 623);
            int i17113 = (i17112 << 13) ^ i17112;
            int i17114 = i17113 ^ (i17113 >>> 17);
            ((int[]) objArr11110[2])[0] = i17114 ^ (i17114 << 5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
                char scrollBarSize9 = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 53893);
                int iMakeMeasureSpec7 = View.MeasureSpec.makeMeasureSpec(0, 0) + 1320;
                int jumpTapTimeout7 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 36;
                short s4110 = $$a[5];
                Object[] objArr11111 = new Object[1];
                c(s4110, (byte) (s4110 & 5), (byte) 52, objArr11111);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(scrollBarSize9, iMakeMeasureSpec7, jumpTapTimeout7, -1433084963, false, (String) objArr11111[0], null);
            }
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).getLong(null) != -1) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                    char capsMode3 = (char) (TextUtils.getCapsMode("", 0, 0) + 53893);
                    int iRgb5 = (-16775896) - Color.rgb(0, 0, 0);
                    int i17115 = 37 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    short s4111 = (short) ($$b << 2);
                    byte[] bArr4110 = $$a;
                    Object[] objArr11112 = new Object[1];
                    c(s4111, bArr4110[91], bArr4110[7], objArr11112);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(capsMode3, iRgb5, i17115, -1920778747, false, (String) objArr11112[0], null);
                }
                Object[] objArr11113 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).get(null);
                objArr19 = new Object[]{new int[]{i1716}, new int[1], strArr111, new int[]{i1717}};
                int i17116 = ((int[]) objArr11113[0])[0];
                int i17117 = ((int[]) objArr11113[3])[0];
                String[] strArr119 = (String[]) objArr11113[2];
                int iIdentityHashCode111 = System.identityHashCode(this);
                int i17118 = (-1089658024) + (((~((-298066181) | (~iIdentityHashCode111))) | (-1072561645)) * (-591)) + ((iIdentityHashCode111 | (-298066181)) * 591) + 1934582907;
                int i17119 = (i17118 << 13) ^ i17118;
                int i18110 = i17119 ^ (i17119 >>> 17);
                ((int[]) objArr19[1])[0] = i18110 ^ (i18110 << 5);
                str3 = str7;
            } else {
                if (applicationContext4 != null) {
                    if (applicationContext4 instanceof ContextWrapper) {
                        applicationContext4 = p0.getApplicationContext();
                        int i18111 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
                        b = i18111 % 128;
                        int i18112 = i18111 % 2;
                    } else {
                        applicationContext4 = p0.getApplicationContext();
                        int i18113 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
                        b = i18113 % 128;
                        int i18114 = i18113 % 2;
                    }
                }
                str3 = str7;
                int iIntValue8 = ((Integer) Class.forName(str6).getMethod(str3, Object.class).invoke(null, this)).intValue();
                Object[] objArr11114 = {-206576362};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b((char) (47976 - ExpandableListView.getPackedPositionChild(0L)), 1300 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 20 - TextUtils.getTrimmedLength(""), -420973425, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr12110 = {applicationContext4, "com.bpjstku", 1934582907, Integer.valueOf(iIntValue8), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).newInstance(objArr11114), false};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                    char c111 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 53892);
                    int maximumDrawingCacheSize10 = 1320 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int mode10 = 36 - View.MeasureSpec.getMode(0);
                    short s4112 = (short) ($$b << 2);
                    byte[] bArr4111 = $$a;
                    Object[] objArr12111 = new Object[1];
                    c(s4112, bArr4111[91], bArr4111[7], objArr12111);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(c111, maximumDrawingCacheSize10, mode10, 819724799, false, (String) objArr12111[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (57878 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), TextUtils.getOffsetAfter("", 0) + 1394, AndroidCharacter.getMirror('0') + 27), Boolean.TYPE});
                }
                objArr18 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).invoke(null, objArr12110);
                if (applicationContext4 != null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                        char cIndexOf8 = (char) (53893 - TextUtils.indexOf("", "", 0));
                        int iIndexOf18 = 1319 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        int pressedStateDuration7 = (ViewConfiguration.getPressedStateDuration() >> 16) + 36;
                        short s4113 = (short) ($$b << 2);
                        byte[] bArr4112 = $$a;
                        Object[] objArr12112 = new Object[1];
                        c(s4113, bArr4112[91], bArr4112[7], objArr12112);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(cIndexOf8, iIndexOf18, pressedStateDuration7, -1920778747, false, (String) objArr12112[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).set(null, objArr18);
                    long jLongValue118 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf211 = Long.valueOf(jLongValue118);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
                        char minimumFlingVelocity7 = (char) (53893 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        int mode11 = View.MeasureSpec.getMode(0) + 1320;
                        int edgeSlop10 = 36 - (ViewConfiguration.getEdgeSlop() >> 16);
                        byte[] bArr513 = $$a;
                        short s4114 = bArr513[5];
                        byte b27 = bArr513[91];
                        Object[] objArr12113 = new Object[1];
                        c(s4114, b27, (byte) (b27 - 4), objArr12113);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(minimumFlingVelocity7, mode11, edgeSlop10, -1273706634, false, (String) objArr12113[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).set(null, lValueOf211);
                    Long lValueOf212 = Long.valueOf(jLongValue118 >> 12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                        char cIndexOf9 = (char) (TextUtils.indexOf("", "") + 53893);
                        int maximumDrawingCacheSize11 = 1320 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int iIndexOf19 = TextUtils.indexOf((CharSequence) "", '0') + 37;
                        short s4115 = $$a[5];
                        Object[] objArr12114 = new Object[1];
                        c(s4115, (byte) (s4115 & 5), (byte) 52, objArr12114);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(cIndexOf9, maximumDrawingCacheSize11, iIndexOf19, -1433084963, false, (String) objArr12114[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).set(null, lValueOf212);
                } else {
                    objArr18 = objArr18;
                }
                objArr19 = objArr18;
            }
            i25 = ((int[]) objArr19[3])[0];
            i26 = ((int[]) objArr19[0])[0];
            if (i26 == i25) {
                objArr20 = new Object[]{new int[]{i1816}, new int[1], strArr112, new int[]{i1817}};
                int i18115 = ((int[]) objArr19[1])[0];
                int i18116 = ((int[]) objArr19[0])[0];
                int i18117 = ((int[]) objArr19[3])[0];
                String[] strArr1110 = (String[]) objArr19[2];
                int iIdentityHashCode112 = System.identityHashCode(this);
                int i18118 = (~((-1082347160) | iIdentityHashCode112)) | 147473;
                int i18119 = ~((~iIdentityHashCode112) | 1370480351);
                int i1822 = i18115 + 1439940134 + ((i18118 | i18119) * (-470)) + (((~(iIdentityHashCode112 | (-1082199687))) | i18119) * 470);
                int i1823 = (i1822 << 13) ^ i1822;
                int i19110 = i1823 ^ (i1823 >>> 17);
                i27 = 0;
                ((int[]) objArr20[1])[0] = i19110 ^ (i19110 << 5);
            } else {
                Toast.makeText((Context) null, i26 / (((i26 - 1) * i26) % 2), 0).show();
                objArr20 = new Object[]{new int[]{i1912}, new int[1], strArr113, new int[]{i1913}};
                int i19111 = ((int[]) objArr19[1])[0];
                int i19112 = ((int[]) objArr19[0])[0];
                int i19113 = ((int[]) objArr19[3])[0];
                String[] strArr1111 = (String[]) objArr19[2];
                int iIdentityHashCode113 = System.identityHashCode(this);
                int i19114 = ~iIdentityHashCode113;
                int i19115 = i19111 + (-378948964) + (((~((-418660111) | i19114)) | (-951967715)) * (-865)) + ((~(iIdentityHashCode113 | 418660110)) * 865) + (((~((-951967715) | i19114)) | (~(i19114 | 418660110))) * 865);
                int i19116 = i19115 ^ (i19115 << 13);
                int i19117 = i19116 ^ (i19116 >>> 17);
                i27 = 0;
                ((int[]) objArr20[1])[0] = i19117 ^ (i19117 << 5);
            }
            objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
                char c112 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                int iResolveSizeAndState8 = View.resolveSizeAndState(i27, i27, i27) + 1031;
                int i19118 = (ExpandableListView.getPackedPositionForChild(i27, i27) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i27, i27) == 0L ? 0 : -1)) + 16;
                byte[] bArr514 = $$a;
                Object[] objArr12115 = new Object[1];
                c((short) 88, bArr514[91], bArr514[7], objArr12115);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(c112, iResolveSizeAndState8, i19118, 1357589585, false, (String) objArr12115[0], null);
            }
            j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).getLong(null);
            jLongValue4 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
            objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
                char touchSlop9 = (char) (ViewConfiguration.getTouchSlop() >> 8);
                int jumpTapTimeout8 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1031;
                int keyRepeatTimeout3 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 15;
                short s4116 = (short) ($$b << 2);
                byte[] bArr515 = $$a;
                Object[] objArr12116 = new Object[1];
                c(s4116, bArr515[91], bArr515[7], objArr12116);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(touchSlop9, jumpTapTimeout8, keyRepeatTimeout3, 1344079056, false, (String) objArr12116[0], null);
            }
            if (j4 == ((jLongValue4 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).getLong(null) << 52) >>> 52)) >> 12)) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                    char cResolveOpacity5 = (char) Drawable.resolveOpacity(0, 0);
                    int i19119 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1031;
                    int iAlpha5 = Color.alpha(0) + 15;
                    short s4117 = $$a[5];
                    Object[] objArr12117 = new Object[1];
                    c(s4117, (byte) (s4117 & 5), (byte) 52, objArr12117);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(cResolveOpacity5, i19119, iAlpha5, 632103528, false, (String) objArr12117[0], null);
                }
                Object[] objArr12118 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).get(null);
                objArr21 = new Object[]{strArr114, new int[]{i2011}, new int[1], new int[]{i2010}};
                int i20110 = ((int[]) objArr12118[3])[0];
                int i20111 = ((int[]) objArr12118[1])[0];
                String[] strArr1112 = (String[]) objArr12118[0];
                int iMyTid5 = Process.myTid();
                int i20112 = ~iMyTid5;
                int i20113 = (-1589575152) + (((~(300695208 | i20112)) | 544975378) * 226) + (((~(i20112 | 838844090)) | (~((-544975379) | iMyTid5)) | 6826496) * (-113)) + ((~(iMyTid5 | 300695208)) * 113) + 497424490;
                int i20114 = (i20113 << 13) ^ i20113;
                int i20115 = i20114 ^ (i20114 >>> 17);
                ((int[]) objArr21[2])[0] = i20115 ^ (i20115 << 5);
            } else {
                int iIntValue9 = ((Integer) Class.forName(str6).getMethod(str3, Object.class).invoke(null, this)).intValue();
                Object[] objArr12119 = {-206576362};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b((char) (46038 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 1134 - Color.alpha(0), View.MeasureSpec.makeMeasureSpec(0, 0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr1314 = {Integer.valueOf(iIntValue9), 0, 497424490, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).newInstance(objArr12119), false};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                    char cCombineMeasuredStates3 = (char) View.combineMeasuredStates(0, 0);
                    int iKeyCodeFromString7 = KeyEvent.keyCodeFromString("") + 1031;
                    int i20116 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14;
                    byte[] bArr516 = $$a;
                    Object[] objArr1315 = new Object[1];
                    c((short) 88, bArr516[91], bArr516[7], objArr1315);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(cCombineMeasuredStates3, iKeyCodeFromString7, i20116, 1298546779, false, (String) objArr1315[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), TextUtils.lastIndexOf("", '0') + 1118, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 17), Boolean.TYPE});
                }
                Object[] objArr1316 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).invoke(null, objArr1314);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
                    char packedPositionType8 = (char) ExpandableListView.getPackedPositionType(0L);
                    int scrollBarFadeDuration7 = 1031 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int iMakeMeasureSpec8 = View.MeasureSpec.makeMeasureSpec(0, 0) + 15;
                    short s4118 = $$a[5];
                    Object[] objArr1317 = new Object[1];
                    c(s4118, (byte) (s4118 & 5), (byte) 52, objArr1317);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(packedPositionType8, scrollBarFadeDuration7, iMakeMeasureSpec8, 632103528, false, (String) objArr1317[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).set(null, objArr1316);
                long jLongValue119 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf213 = Long.valueOf(jLongValue119);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                    char offsetBefore4 = (char) TextUtils.getOffsetBefore("", 0);
                    int threadPriority7 = ((Process.getThreadPriority(0) + 20) >> 6) + 1031;
                    int minimumFlingVelocity8 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15;
                    short s4119 = (short) ($$b << 2);
                    byte[] bArr517 = $$a;
                    Object[] objArr1318 = new Object[1];
                    c(s4119, bArr517[91], bArr517[7], objArr1318);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(offsetBefore4, threadPriority7, minimumFlingVelocity8, 1344079056, false, (String) objArr1318[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).set(null, lValueOf213);
                Long lValueOf214 = Long.valueOf(jLongValue119 >> 12);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                    char scrollBarSize10 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                    int iLastIndexOf11 = TextUtils.lastIndexOf("", '0', 0) + 1032;
                    int i20117 = 15 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    byte[] bArr518 = $$a;
                    Object[] objArr1319 = new Object[1];
                    c((short) 88, bArr518[91], bArr518[7], objArr1319);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(scrollBarSize10, iLastIndexOf11, i20117, 1357589585, false, (String) objArr1319[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).set(null, lValueOf214);
                objArr21 = objArr1316;
            }
            i28 = ((int[]) objArr21[1])[0];
            i29 = ((int[]) objArr21[3])[0];
            if (i29 == i28) {
                int i20118 = b + 107;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i20118 % 128;
                int i20119 = i20118 % 2;
                objArr22 = new Object[]{strArr115, new int[]{i2112}, new int[1], new int[]{i2111}};
                int i21110 = ((int[]) objArr21[2])[0];
                int i21111 = ((int[]) objArr21[3])[0];
                int i21112 = ((int[]) objArr21[1])[0];
                String[] strArr1113 = (String[]) objArr21[0];
                int iMaxMemory3 = (int) Runtime.getRuntime().maxMemory();
                int i21113 = i21110 + (((~(iMaxMemory3 | 130131592)) * TypedValues.CycleType.TYPE_EASING) - 1295564243) + (((~((~iMaxMemory3) | 130131592)) | 113345664) * TypedValues.CycleType.TYPE_EASING);
                int i21114 = (i21113 << 13) ^ i21113;
                int i21115 = i21114 ^ (i21114 >>> 17);
                c = 0;
                ((int[]) objArr22[2])[0] = i21115 ^ (i21115 << 5);
            } else {
                arrayList6 = new ArrayList();
                strArr6 = (String[]) objArr21[0];
                if (strArr6 != null) {
                    while (i30 < strArr6.length) {
                        int i21116 = b + 9;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i21116 % 128;
                        int i21117 = i21116 % 2;
                        arrayList6.add(str15);
                    }
                }
                Toast.makeText((Context) null, i29 / (((i29 - 1) * i29) % 2), 0).show();
                objArr22 = new Object[]{strArr22, new int[]{i2210}, new int[1], new int[]{i2119}};
                int i21118 = ((int[]) objArr21[2])[0];
                int i21119 = ((int[]) objArr21[3])[0];
                int i22110 = ((int[]) objArr21[1])[0];
                String[] strArr23 = (String[]) objArr21[0];
                int i22111 = ~Process.myTid();
                int i22112 = i21118 + 644797189 + (((~((-303110657) | i22111)) | 547390826) * (-828)) + ((i22111 | (-303110657)) * (-828)) + 1867520000;
                int i22113 = (i22112 << 13) ^ i22112;
                int i22114 = i22113 ^ (i22113 >>> 17);
                c = 0;
                ((int[]) objArr22[2])[0] = i22114 ^ (i22114 << 5);
            }
            int i22115 = ((int[]) objArr37[c])[c];
            int i22116 = i22115 * i22115;
            int i22117 = -(1782957044 * i22115);
            int i22118 = ((i22116 | i22117) << 1) - (i22116 ^ i22117);
            int i22119 = -(i22115 * (-1456408770));
            int i23110 = ((i22118 & i22119) + (i22119 | i22118)) - 1581349519;
            int i23111 = i23110 >> 29;
            int i23112 = ((i23111 & (-15)) + (i23111 | (-15))) / 8;
            int i23113 = (i23110 - (~(((i23112 | 1) << 1) - (i23112 ^ 1)))) - 1;
            int i23114 = ((i23110 >> 25) - 255) / 128;
            int i23115 = (-(i23113 ^ (((i23114 | 1) << 1) - (i23114 ^ 1)))) + 7;
            int i23116 = i23115 >> 22;
            int i23117 = ((((i23116 | (-2047)) << 1) - (i23116 ^ (-2047))) / 1024) + 1;
            int i23118 = 4801020 / ((i23115 & (-(((i23117 | 1) << 1) - (i23117 ^ 1)))) * 1932);
            int i23119 = ((int[]) objArr3[1])[0];
            int i24110 = i23119 * i23119;
            int i24111 = -(1045046327 * i23119);
            int i24112 = (i24110 & i24111) + (i24110 | i24111);
            int i24113 = -(i23119 * 2034666645);
            int i24114 = (i24112 & i24113) + (i24113 | i24112);
            int i24115 = (i24114 ^ (-1041872732)) + (((-1041872732) & i24114) << 1);
            int i24116 = i24115 >> 24;
            int i24117 = ((i24116 & (-511)) + (i24116 | (-511))) / 256;
            int i24118 = (i24115 - (~(((i24117 | 1) << 1) - (i24117 ^ 1)))) - 1;
            int i24119 = i24115 >> 16;
            int i25110 = (((-131071) ^ i24119) + ((i24119 & (-131071)) << 1)) / 65536;
            int i25111 = -(i24118 ^ ((i25110 ^ 1) + ((i25110 & 1) << 1)));
            int i25112 = (i25111 & 1) + (i25111 | 1);
            int i25113 = ((i25112 >> 28) - 31) / 16;
            int i25114 = ((i25113 | 1) << 1) - (i25113 ^ 1);
            int i25115 = i23118 + (443716 / (((-((i25114 ^ 1) + ((i25114 & 1) << 1))) & i25112) * 742));
            int i25116 = ((int[]) objArr5[1])[0];
            int i25117 = i25116 * i25116;
            int i25118 = -(1308279787 * i25116);
            int i25119 = (i25117 & i25118) + (i25117 | i25118);
            int i26110 = -(i25116 * 1841813427);
            int i26111 = ((i25119 | i26110) << 1) - (i26110 ^ i25119);
            int i26112 = (i26111 & 1132735841) + (1132735841 | i26111);
            int i26113 = (((i26112 >> 18) - 32767) / 16384) + 1;
            int i26114 = ((i26112 | i26113) << 1) - (i26113 ^ i26112);
            int i26115 = i26112 >> 17;
            int i26116 = (((-65535) & i26115) + (i26115 | (-65535))) / 32768;
            int i26117 = -(((i26116 ^ 1) + ((i26116 & 1) << 1)) ^ i26114);
            int i26118 = ((i26117 | 7) << 1) - (i26117 ^ 7);
            int i26119 = ((i26118 >> 21) - 4095) / 2048;
            int i27110 = ((i26119 | 1) << 1) - (i26119 ^ 1);
            int i27111 = i25115 + (5022990 / (((-((i27110 ^ 1) + ((i27110 & 1) << 1))) & i26118) * 1407));
            int i27112 = ((int[]) objArr7[1])[0];
            int i27113 = ((i27112 * i27112) - (~(-(1212862219 * i27112)))) - 1;
            int i27114 = -(i27112 * 354049661);
            int i27115 = ((i27113 | i27114) << 1) - (i27114 ^ i27113);
            int i27116 = (i27115 & 1901741584) + (1901741584 | i27115);
            int i27117 = i27116 >> 17;
            int i27118 = (((-65535) & i27117) + (i27117 | (-65535))) / 32768;
            int i27119 = ((i27118 | 1) << 1) - (i27118 ^ 1);
            int i28110 = (i27116 ^ i27119) + ((i27119 & i27116) << 1);
            int i28111 = ((i27116 >> 29) - 15) / 8;
            int i28112 = (-(i28110 ^ (((i28111 | 1) << 1) - (i28111 ^ 1)))) + 6;
            int i28113 = i28112 >> 20;
            int i28114 = i27111 + (5708394 / ((i28112 & (-((((i28113 & (-8191)) + (i28113 | (-8191))) / 4096) + 2))) * 1503));
            int i28115 = ((int[]) objArr10[1])[0];
            int i28116 = i28115 * i28115;
            int i28117 = -(1258874226 * i28115);
            int i28118 = (i28116 ^ i28117) + ((i28116 & i28117) << 1);
            int i28119 = -(i28115 * (-411475194));
            int i29110 = ((i28118 & i28119) + (i28119 | i28118)) - (-597224976);
            int i29111 = i29110 >> 20;
            int i29112 = ((i29111 & (-8191)) + (i29111 | (-8191))) / 4096;
            int i29113 = (i29110 - (~((i29112 ^ 1) + ((i29112 & 1) << 1)))) - 1;
            int i29114 = i29110 >> 16;
            int i29115 = -(i29113 ^ (((((-131071) & i29114) + (i29114 | (-131071))) / 65536) + 1));
            int i29116 = (i29115 ^ 4) + ((i29115 & 4) << 1);
            int i29117 = (((i29116 >> 15) - 262143) / 131072) + 1;
            int i29118 = i28114 + (3995136 / (((-((i29117 ^ 1) + ((i29117 & 1) << 1))) & i29116) * 1224));
            int i29119 = ((int[]) objArr12[3])[0];
            int i30110 = i29119 * i29119;
            int i30111 = -(697697465 * i29119);
            int i30112 = (i30110 ^ i30111) + ((i30110 & i30111) << 1);
            int i30113 = -(i29119 * 230309181);
            int i30114 = ((i30112 | i30113) << 1) - (i30113 ^ i30112);
            int i30115 = ((i30114 | 1068480025) << 1) - (1068480025 ^ i30114);
            int i30116 = i30115 >> 16;
            int i30117 = (((-131071) ^ i30116) + ((i30116 & (-131071)) << 1)) / 65536;
            int i30118 = (i30115 - (~((i30117 ^ 1) + ((i30117 & 1) << 1)))) - 1;
            int i30119 = ((i30115 >> 23) - 1023) / 512;
            int i31110 = -(i30118 ^ ((i30119 ^ 1) + ((i30119 & 1) << 1)));
            int i31111 = ((i31110 | 5) << 1) - (i31110 ^ 5);
            int i31112 = i31111 >> 27;
            int i31113 = (((i31112 | (-63)) << 1) - (i31112 ^ (-63))) / 32;
            int i31114 = (i31113 ^ 1) + ((i31113 & 1) << 1);
            int i31115 = i29118 + (9771120 / (((-((i31114 & 1) + (i31114 | 1))) & i31111) * 1968));
            int i31116 = ((int[]) objArr14[0])[0];
            int i31117 = ((i31116 * i31116) - (~(-(1487085662 * i31116)))) - 1;
            int i31118 = -(i31116 * 622676956);
            int i31119 = ((i31117 | i31118) << 1) - (i31117 ^ i31118);
            int i32110 = ((i31119 | (-902807735)) << 1) - ((-902807735) ^ i31119);
            int i32111 = i32110 >> 20;
            int i32112 = ((i32111 ^ (-8191)) + ((i32111 & (-8191)) << 1)) / 4096;
            int i32113 = (i32110 - (~((i32112 ^ 1) + ((i32112 & 1) << 1)))) - 1;
            int i32114 = i32110 >> 24;
            int i32115 = (((i32114 | (-511)) << 1) - (i32114 ^ (-511))) / 256;
            int i32116 = -(i32113 ^ (((i32115 | 1) << 1) - (i32115 ^ 1)));
            int i32117 = ((i32116 | 5) << 1) - (i32116 ^ 5);
            int i32118 = i32117 >> 23;
            int i32119 = ((i32118 & (-1023)) + (i32118 | (-1023))) / 512;
            int i33110 = i31115 + (5749890 / (((-(((i32119 & 1) + (i32119 | 1)) + 1)) & i32117) * 1399));
            int i33111 = ((int[]) objArr16[3])[0];
            int i33112 = ((((i33111 * i33111) - (~(-(1705076136 * i33111)))) - 1) - (~(-(i33111 * (-381342966))))) - 1;
            int i33113 = (i33112 ^ 845688561) + ((i33112 & 845688561) << 1);
            int i33114 = i33113 >> 19;
            int i33115 = ((i33114 & (-16383)) + (i33114 | (-16383))) / 8192;
            int i33116 = (i33113 - (~((i33115 ^ 1) + ((i33115 & 1) << 1)))) - 1;
            int i33117 = ((i33113 >> 16) - 131071) / 65536;
            int i33118 = -(i33116 ^ (((i33117 | 1) << 1) - (i33117 ^ 1)));
            int i33119 = (i33118 & 3) + (i33118 | 3);
            int i34110 = i33119 >> 22;
            int i34111 = (((i34110 | (-2047)) << 1) - (i34110 ^ (-2047))) / 1024;
            int i34112 = (i34111 & 1) + (i34111 | 1);
            int i34113 = i33110 + (1488960 / (((-(((i34112 | 1) << 1) - (i34112 ^ 1))) & i33119) * 517));
            int i34114 = ((int[]) objArr11110[2])[0];
            int i34115 = ((i34114 * i34114) - (~(-(770155949 * i34114)))) - 1;
            int i34116 = -(i34114 * (-1321042351));
            int i34117 = (i34115 ^ i34116) + ((i34115 & i34116) << 1);
            int i34118 = (i34117 ^ 370793473) + ((370793473 & i34117) << 1);
            int i34119 = i34118 >> 24;
            int i35110 = (((i34119 & (-511)) + (i34119 | (-511))) / 256) + 1;
            int i35111 = ((i34118 | i35110) << 1) - (i35110 ^ i34118);
            int i35112 = i34118 >> 19;
            int i35113 = ((i35112 & (-16383)) + (i35112 | (-16383))) / 8192;
            int i35114 = (-(i35111 ^ ((i35113 ^ 1) + ((i35113 & 1) << 1)))) + 1;
            int i35115 = ((i35114 >> 24) - 511) / 256;
            int i35116 = ((i35115 | 1) << 1) - (i35115 ^ 1);
            int i35117 = i34113 + (1823088 / ((i35114 & (-((i35116 ^ 1) + ((i35116 & 1) << 1)))) * 1999));
            int i35118 = ((int[]) objArr20[1])[0];
            int i35119 = i35118 * i35118;
            int i36110 = -(679631359 * i35118);
            int i36111 = (((i35119 & i36110) + (i35119 | i36110)) - (~(-(i35118 * 1504706183)))) - 1296230008;
            int i36112 = i36111 >> 18;
            int i36113 = ((i36111 >> 15) - 262143) / 131072;
            int i36114 = (-(((i36111 - (~(((((i36112 | (-32767)) << 1) - (i36112 ^ (-32767))) / 16384) + 1))) - 1) ^ ((i36113 & 1) + (i36113 | 1)))) + 8;
            int i36115 = i36114 >> 20;
            int i36116 = i35117 + (617760 / ((i36114 & (-(((((i36115 | (-8191)) << 1) - (i36115 ^ (-8191))) / 4096) + 2))) * 396));
            int i36117 = ((int[]) objArr22[2])[0];
            int i36118 = i36117 * i36117;
            int i36119 = -(481707229 * i36117);
            int i37110 = (i36118 ^ i36119) + ((i36118 & i36119) << 1);
            int i37111 = -(i36117 * (-690147765));
            int i37112 = (i37110 ^ i37111) + ((i37111 & i37110) << 1);
            int i37113 = ((i37112 | (-655409776)) << 1) - ((-655409776) ^ i37112);
            int i37114 = i37113 >> 26;
            int i37115 = (((i37114 | ComposerKt.defaultsKey) << 1) - (i37114 ^ ComposerKt.defaultsKey)) / 64;
            int i37116 = (i37115 & 1) + (i37115 | 1);
            int i37117 = ((i37113 | i37116) << 1) - (i37116 ^ i37113);
            int i37118 = i37113 >> 15;
            int i37119 = (((-262143) & i37118) + (i37118 | (-262143))) / 131072;
            int i3814 = -(((i37119 ^ 1) + ((i37119 & 1) << 1)) ^ i37117);
            int i3815 = ((i3814 | 5) << 1) - (i3814 ^ 5);
            int i3816 = i3815 >> 15;
            int i3817 = ((((-262143) ^ i3816) + ((i3816 & (-262143)) << 1)) / 131072) + 1;
            Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "1,9,20,26,File Downloaded".substring(i36116 + ((-30629760) / (((-((i3817 & 1) + (i3817 | 1))) & i3815) * TypedValues.Custom.TYPE_STRING))), 0).show();
        }
        objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault51 == null) {
            char cAxisFromString6 = (char) (MotionEvent.axisFromString("") + 1);
            int iCombineMeasuredStates2 = View.combineMeasuredStates(0, 0) + 2267;
            int i3818 = 34 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            byte[] bArr519 = $$a;
            short s51 = bArr519[5];
            byte b28 = bArr519[91];
            Object[] objArr1320 = new Object[1];
            c(s51, b28, (byte) (b28 - 4), objArr1320);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault51 = initSession.b(cAxisFromString6, iCombineMeasuredStates2, i3818, -654680577, false, (String) objArr1320[0], null);
        }
        Object[] objArr1321 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault51).get(null);
        objArr17 = new Object[]{new int[]{i385}, strArr21, new int[1], new int[]{i386}};
        int i3819 = ((int[]) objArr1321[0])[0];
        int i3820 = ((int[]) objArr1321[3])[0];
        String[] strArr24 = (String[]) objArr1321[1];
        int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
        int i3821 = (((-1968123745) + (((~((-31386472) | iElapsedRealtime2)) | (-777326845)) * (-948))) + ((~((~iElapsedRealtime2) | (-5505125))) * (-948))) - 580012947;
        int i3822 = (i3821 << 13) ^ i3821;
        int i3823 = i3822 ^ (i3822 >>> 17);
        ((int[]) objArr17[2])[0] = i3823 ^ (i3823 << 5);
        applicationContext4 = p0;
        objArr12 = objArr12;
        objArr16 = objArr16;
        str7 = str7;
        if (((int[]) objArr17[0])[0] == ((int[]) objArr17[3])[0]) {
            arrayList5 = new ArrayList();
            strArr5 = (String[]) objArr17[1];
            if (strArr5 != null) {
                while (i24 < strArr5.length) {
                    arrayList5.add(str14);
                }
            }
            throw null;
        }
        Object[] objArr11115 = {new int[]{i17110}, strArr118, new int[1], new int[]{i17111}};
        int i16111 = ((int[]) objArr17[2])[0];
        int i171110 = ((int[]) objArr17[0])[0];
        int i171111 = ((int[]) objArr17[3])[0];
        String[] strArr1114 = (String[]) objArr17[1];
        int iIdentityHashCode114 = System.identityHashCode(this);
        int i171112 = i16111 + 1304985706 + ((~(847021030 | iIdentityHashCode114)) * 623) + (((~iIdentityHashCode114) | 36208642) * (-623)) + (((~(iIdentityHashCode114 | 845971494)) | (~(37258178 | iIdentityHashCode114)) | (-847021031)) * 623);
        int i171113 = (i171112 << 13) ^ i171112;
        int i171114 = i171113 ^ (i171113 >>> 17);
        ((int[]) objArr11115[2])[0] = i171114 ^ (i171114 << 5);
        objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault36 == null) {
            char scrollBarSize11 = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 53893);
            int iMakeMeasureSpec9 = View.MeasureSpec.makeMeasureSpec(0, 0) + 1320;
            int jumpTapTimeout9 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 36;
            short s41110 = $$a[5];
            Object[] objArr11116 = new Object[1];
            c(s41110, (byte) (s41110 & 5), (byte) 52, objArr11116);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault36 = initSession.b(scrollBarSize11, iMakeMeasureSpec9, jumpTapTimeout9, -1433084963, false, (String) objArr11116[0], null);
        }
        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault36).getLong(null) != -1) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault50 == null) {
                char capsMode4 = (char) (TextUtils.getCapsMode("", 0, 0) + 53893);
                int iRgb6 = (-16775896) - Color.rgb(0, 0, 0);
                int i171115 = 37 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                short s41111 = (short) ($$b << 2);
                byte[] bArr4113 = $$a;
                Object[] objArr11117 = new Object[1];
                c(s41111, bArr4113[91], bArr4113[7], objArr11117);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault50 = initSession.b(capsMode4, iRgb6, i171115, -1920778747, false, (String) objArr11117[0], null);
            }
            Object[] objArr11118 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault50).get(null);
            objArr19 = new Object[]{new int[]{i17116}, new int[1], strArr119, new int[]{i17117}};
            int i171116 = ((int[]) objArr11118[0])[0];
            int i171117 = ((int[]) objArr11118[3])[0];
            String[] strArr1115 = (String[]) objArr11118[2];
            int iIdentityHashCode115 = System.identityHashCode(this);
            int i171118 = (-1089658024) + (((~((-298066181) | (~iIdentityHashCode115))) | (-1072561645)) * (-591)) + ((iIdentityHashCode115 | (-298066181)) * 591) + 1934582907;
            int i171119 = (i171118 << 13) ^ i171118;
            int i181110 = i171119 ^ (i171119 >>> 17);
            ((int[]) objArr19[1])[0] = i181110 ^ (i181110 << 5);
            str3 = str7;
        } else {
            if (applicationContext4 != null) {
                if (applicationContext4 instanceof ContextWrapper) {
                    applicationContext4 = p0.getApplicationContext();
                    int i181111 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
                    b = i181111 % 128;
                    int i181112 = i181111 % 2;
                } else {
                    applicationContext4 = p0.getApplicationContext();
                    int i181113 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 85;
                    b = i181113 % 128;
                    int i181114 = i181113 % 2;
                }
            }
            str3 = str7;
            int iIntValue10 = ((Integer) Class.forName(str6).getMethod(str3, Object.class).invoke(null, this)).intValue();
            Object[] objArr11119 = {-206576362};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(41341784);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault37 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault37 = initSession.b((char) (47976 - ExpandableListView.getPackedPositionChild(0L)), 1300 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 20 - TextUtils.getTrimmedLength(""), -420973425, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr121110 = {applicationContext4, "com.bpjstku", 1934582907, Integer.valueOf(iIntValue10), 643, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault37).newInstance(objArr11119), false};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-733829592);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault38 == null) {
                char c113 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 53892);
                int maximumDrawingCacheSize12 = 1320 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int mode12 = 36 - View.MeasureSpec.getMode(0);
                short s41112 = (short) ($$b << 2);
                byte[] bArr4114 = $$a;
                Object[] objArr121111 = new Object[1];
                c(s41112, bArr4114[91], bArr4114[7], objArr121111);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault38 = initSession.b(c113, maximumDrawingCacheSize12, mode12, 819724799, false, (String) objArr121111[0], new Class[]{Context.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (57878 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), TextUtils.getOffsetAfter("", 0) + 1394, AndroidCharacter.getMirror('0') + 27), Boolean.TYPE});
            }
            objArr18 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault38).invoke(null, objArr121110);
            if (applicationContext4 != null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1763547602);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault39 == null) {
                    char cIndexOf10 = (char) (53893 - TextUtils.indexOf("", "", 0));
                    int iIndexOf110 = 1319 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    int pressedStateDuration8 = (ViewConfiguration.getPressedStateDuration() >> 16) + 36;
                    short s41113 = (short) ($$b << 2);
                    byte[] bArr4115 = $$a;
                    Object[] objArr121112 = new Object[1];
                    c(s41113, bArr4115[91], bArr4115[7], objArr121112);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault39 = initSession.b(cIndexOf10, iIndexOf110, pressedStateDuration8, -1920778747, false, (String) objArr121112[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault39).set(null, objArr18);
                long jLongValue1110 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf215 = Long.valueOf(jLongValue1110);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1351245985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault40 == null) {
                    char minimumFlingVelocity9 = (char) (53893 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                    int mode13 = View.MeasureSpec.getMode(0) + 1320;
                    int edgeSlop11 = 36 - (ViewConfiguration.getEdgeSlop() >> 16);
                    byte[] bArr5110 = $$a;
                    short s41114 = bArr5110[5];
                    byte b29 = bArr5110[91];
                    Object[] objArr121113 = new Object[1];
                    c(s41114, b29, (byte) (b29 - 4), objArr121113);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault40 = initSession.b(minimumFlingVelocity9, mode13, edgeSlop11, -1273706634, false, (String) objArr121113[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault40).set(null, lValueOf215);
                Long lValueOf216 = Long.valueOf(jLongValue1110 >> 12);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1309309962);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault41 == null) {
                    char cIndexOf11 = (char) (TextUtils.indexOf("", "") + 53893);
                    int maximumDrawingCacheSize13 = 1320 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int iIndexOf111 = TextUtils.indexOf((CharSequence) "", '0') + 37;
                    short s41115 = $$a[5];
                    Object[] objArr121114 = new Object[1];
                    c(s41115, (byte) (s41115 & 5), (byte) 52, objArr121114);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault41 = initSession.b(cIndexOf11, maximumDrawingCacheSize13, iIndexOf111, -1433084963, false, (String) objArr121114[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault41).set(null, lValueOf216);
            } else {
                objArr18 = objArr18;
            }
            objArr19 = objArr18;
        }
        i25 = ((int[]) objArr19[3])[0];
        i26 = ((int[]) objArr19[0])[0];
        if (i26 == i25) {
            objArr20 = new Object[]{new int[]{i18116}, new int[1], strArr1110, new int[]{i18117}};
            int i181115 = ((int[]) objArr19[1])[0];
            int i181116 = ((int[]) objArr19[0])[0];
            int i181117 = ((int[]) objArr19[3])[0];
            String[] strArr1116 = (String[]) objArr19[2];
            int iIdentityHashCode116 = System.identityHashCode(this);
            int i181118 = (~((-1082347160) | iIdentityHashCode116)) | 147473;
            int i181119 = ~((~iIdentityHashCode116) | 1370480351);
            int i1824 = i181115 + 1439940134 + ((i181118 | i181119) * (-470)) + (((~(iIdentityHashCode116 | (-1082199687))) | i181119) * 470);
            int i1825 = (i1824 << 13) ^ i1824;
            int i191110 = i1825 ^ (i1825 >>> 17);
            i27 = 0;
            ((int[]) objArr20[1])[0] = i191110 ^ (i191110 << 5);
        } else {
            Toast.makeText((Context) null, i26 / (((i26 - 1) * i26) % 2), 0).show();
            objArr20 = new Object[]{new int[]{i19112}, new int[1], strArr1111, new int[]{i19113}};
            int i191111 = ((int[]) objArr19[1])[0];
            int i191112 = ((int[]) objArr19[0])[0];
            int i191113 = ((int[]) objArr19[3])[0];
            String[] strArr1117 = (String[]) objArr19[2];
            int iIdentityHashCode117 = System.identityHashCode(this);
            int i191114 = ~iIdentityHashCode117;
            int i191115 = i191111 + (-378948964) + (((~((-418660111) | i191114)) | (-951967715)) * (-865)) + ((~(iIdentityHashCode117 | 418660110)) * 865) + (((~((-951967715) | i191114)) | (~(i191114 | 418660110))) * 865);
            int i191116 = i191115 ^ (i191115 << 13);
            int i191117 = i191116 ^ (i191116 >>> 17);
            i27 = 0;
            ((int[]) objArr20[1])[0] = i191117 ^ (i191117 << 5);
        }
        objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault42 == null) {
            char c114 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
            int iResolveSizeAndState9 = View.resolveSizeAndState(i27, i27, i27) + 1031;
            int i191118 = (ExpandableListView.getPackedPositionForChild(i27, i27) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i27, i27) == 0L ? 0 : -1)) + 16;
            byte[] bArr5111 = $$a;
            Object[] objArr121115 = new Object[1];
            c((short) 88, bArr5111[91], bArr5111[7], objArr121115);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault42 = initSession.b(c114, iResolveSizeAndState9, i191118, 1357589585, false, (String) objArr121115[0], null);
        }
        j4 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault42).getLong(null);
        jLongValue4 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
        objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault43 == null) {
            char touchSlop10 = (char) (ViewConfiguration.getTouchSlop() >> 8);
            int jumpTapTimeout10 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1031;
            int keyRepeatTimeout4 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 15;
            short s41116 = (short) ($$b << 2);
            byte[] bArr5112 = $$a;
            Object[] objArr121116 = new Object[1];
            c(s41116, bArr5112[91], bArr5112[7], objArr121116);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault43 = initSession.b(touchSlop10, jumpTapTimeout10, keyRepeatTimeout4, 1344079056, false, (String) objArr121116[0], null);
        }
        if (j4 == ((jLongValue4 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault43).getLong(null) << 52) >>> 52)) >> 12)) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault49 == null) {
                char cResolveOpacity6 = (char) Drawable.resolveOpacity(0, 0);
                int i191119 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1031;
                int iAlpha6 = Color.alpha(0) + 15;
                short s41117 = $$a[5];
                Object[] objArr121117 = new Object[1];
                c(s41117, (byte) (s41117 & 5), (byte) 52, objArr121117);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault49 = initSession.b(cResolveOpacity6, i191119, iAlpha6, 632103528, false, (String) objArr121117[0], null);
            }
            Object[] objArr121118 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault49).get(null);
            objArr21 = new Object[]{strArr1112, new int[]{i20111}, new int[1], new int[]{i20110}};
            int i201110 = ((int[]) objArr121118[3])[0];
            int i201111 = ((int[]) objArr121118[1])[0];
            String[] strArr1118 = (String[]) objArr121118[0];
            int iMyTid6 = Process.myTid();
            int i201112 = ~iMyTid6;
            int i201113 = (-1589575152) + (((~(300695208 | i201112)) | 544975378) * 226) + (((~(i201112 | 838844090)) | (~((-544975379) | iMyTid6)) | 6826496) * (-113)) + ((~(iMyTid6 | 300695208)) * 113) + 497424490;
            int i201114 = (i201113 << 13) ^ i201113;
            int i201115 = i201114 ^ (i201114 >>> 17);
            ((int[]) objArr21[2])[0] = i201115 ^ (i201115 << 5);
        } else {
            int iIntValue11 = ((Integer) Class.forName(str6).getMethod(str3, Object.class).invoke(null, this)).intValue();
            Object[] objArr121119 = {-206576362};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault44 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault44 = initSession.b((char) (46038 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 1134 - Color.alpha(0), View.MeasureSpec.makeMeasureSpec(0, 0) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
            }
            Object[] objArr13110 = {Integer.valueOf(iIntValue11), 0, 497424490, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault44).newInstance(objArr121119), false};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault45 == null) {
                char cCombineMeasuredStates4 = (char) View.combineMeasuredStates(0, 0);
                int iKeyCodeFromString8 = KeyEvent.keyCodeFromString("") + 1031;
                int i201116 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14;
                byte[] bArr5113 = $$a;
                Object[] objArr13111 = new Object[1];
                c((short) 88, bArr5113[91], bArr5113[7], objArr13111);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault45 = initSession.b(cCombineMeasuredStates4, iKeyCodeFromString8, i201116, 1298546779, false, (String) objArr13111[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (45993 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), TextUtils.lastIndexOf("", '0') + 1118, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 17), Boolean.TYPE});
            }
            Object[] objArr13112 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault45).invoke(null, objArr13110);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1053588033);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault46 == null) {
                char packedPositionType9 = (char) ExpandableListView.getPackedPositionType(0L);
                int scrollBarFadeDuration8 = 1031 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int iMakeMeasureSpec10 = View.MeasureSpec.makeMeasureSpec(0, 0) + 15;
                short s41118 = $$a[5];
                Object[] objArr13113 = new Object[1];
                c(s41118, (byte) (s41118 & 5), (byte) 52, objArr13113);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault46 = initSession.b(packedPositionType9, scrollBarFadeDuration8, iMakeMeasureSpec10, 632103528, false, (String) objArr13113[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault46).set(null, objArr13112);
            long jLongValue1111 = ((Long) Class.forName(str4).getDeclaredMethod(str2, new Class[0]).invoke(null, new Object[0])).longValue();
            Long lValueOf217 = Long.valueOf(jLongValue1111);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1266441465);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault47 == null) {
                char offsetBefore5 = (char) TextUtils.getOffsetBefore("", 0);
                int threadPriority8 = ((Process.getThreadPriority(0) + 20) >> 6) + 1031;
                int minimumFlingVelocity10 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 15;
                short s41119 = (short) ($$b << 2);
                byte[] bArr5114 = $$a;
                Object[] objArr13114 = new Object[1];
                c(s41119, bArr5114[91], bArr5114[7], objArr13114);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault47 = initSession.b(offsetBefore5, threadPriority8, minimumFlingVelocity10, 1344079056, false, (String) objArr13114[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault47).set(null, lValueOf217);
            Long lValueOf218 = Long.valueOf(jLongValue1111 >> 12);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1267364986);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault48 == null) {
                char scrollBarSize12 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                int iLastIndexOf12 = TextUtils.lastIndexOf("", '0', 0) + 1032;
                int i201117 = 15 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                byte[] bArr5115 = $$a;
                Object[] objArr13115 = new Object[1];
                c((short) 88, bArr5115[91], bArr5115[7], objArr13115);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault48 = initSession.b(scrollBarSize12, iLastIndexOf12, i201117, 1357589585, false, (String) objArr13115[0], null);
            }
            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault48).set(null, lValueOf218);
            objArr21 = objArr13112;
        }
        i28 = ((int[]) objArr21[1])[0];
        i29 = ((int[]) objArr21[3])[0];
        if (i29 == i28) {
            int i201118 = b + 107;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i201118 % 128;
            int i201119 = i201118 % 2;
            objArr22 = new Object[]{strArr1113, new int[]{i21112}, new int[1], new int[]{i21111}};
            int i211110 = ((int[]) objArr21[2])[0];
            int i211111 = ((int[]) objArr21[3])[0];
            int i211112 = ((int[]) objArr21[1])[0];
            String[] strArr1119 = (String[]) objArr21[0];
            int iMaxMemory4 = (int) Runtime.getRuntime().maxMemory();
            int i211113 = i211110 + (((~(iMaxMemory4 | 130131592)) * TypedValues.CycleType.TYPE_EASING) - 1295564243) + (((~((~iMaxMemory4) | 130131592)) | 113345664) * TypedValues.CycleType.TYPE_EASING);
            int i211114 = (i211113 << 13) ^ i211113;
            int i211115 = i211114 ^ (i211114 >>> 17);
            c = 0;
            ((int[]) objArr22[2])[0] = i211115 ^ (i211115 << 5);
        } else {
            arrayList6 = new ArrayList();
            strArr6 = (String[]) objArr21[0];
            if (strArr6 != null) {
                while (i30 < strArr6.length) {
                    int i211116 = b + 9;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i211116 % 128;
                    int i211117 = i211116 % 2;
                    arrayList6.add(str15);
                }
            }
            Toast.makeText((Context) null, i29 / (((i29 - 1) * i29) % 2), 0).show();
            objArr22 = new Object[]{strArr23, new int[]{i22110}, new int[1], new int[]{i21119}};
            int i211118 = ((int[]) objArr21[2])[0];
            int i211119 = ((int[]) objArr21[3])[0];
            int i221110 = ((int[]) objArr21[1])[0];
            String[] strArr25 = (String[]) objArr21[0];
            int i221111 = ~Process.myTid();
            int i221112 = i211118 + 644797189 + (((~((-303110657) | i221111)) | 547390826) * (-828)) + ((i221111 | (-303110657)) * (-828)) + 1867520000;
            int i221113 = (i221112 << 13) ^ i221112;
            int i221114 = i221113 ^ (i221113 >>> 17);
            c = 0;
            ((int[]) objArr22[2])[0] = i221114 ^ (i221114 << 5);
        }
        int i221115 = ((int[]) objArr37[c])[c];
        int i221116 = i221115 * i221115;
        int i221117 = -(1782957044 * i221115);
        int i221118 = ((i221116 | i221117) << 1) - (i221116 ^ i221117);
        int i221119 = -(i221115 * (-1456408770));
        int i231110 = ((i221118 & i221119) + (i221119 | i221118)) - 1581349519;
        int i231111 = i231110 >> 29;
        int i231112 = ((i231111 & (-15)) + (i231111 | (-15))) / 8;
        int i231113 = (i231110 - (~(((i231112 | 1) << 1) - (i231112 ^ 1)))) - 1;
        int i231114 = ((i231110 >> 25) - 255) / 128;
        int i231115 = (-(i231113 ^ (((i231114 | 1) << 1) - (i231114 ^ 1)))) + 7;
        int i231116 = i231115 >> 22;
        int i231117 = ((((i231116 | (-2047)) << 1) - (i231116 ^ (-2047))) / 1024) + 1;
        int i231118 = 4801020 / ((i231115 & (-(((i231117 | 1) << 1) - (i231117 ^ 1)))) * 1932);
        int i231119 = ((int[]) objArr3[1])[0];
        int i241110 = i231119 * i231119;
        int i241111 = -(1045046327 * i231119);
        int i241112 = (i241110 & i241111) + (i241110 | i241111);
        int i241113 = -(i231119 * 2034666645);
        int i241114 = (i241112 & i241113) + (i241113 | i241112);
        int i241115 = (i241114 ^ (-1041872732)) + (((-1041872732) & i241114) << 1);
        int i241116 = i241115 >> 24;
        int i241117 = ((i241116 & (-511)) + (i241116 | (-511))) / 256;
        int i241118 = (i241115 - (~(((i241117 | 1) << 1) - (i241117 ^ 1)))) - 1;
        int i241119 = i241115 >> 16;
        int i251110 = (((-131071) ^ i241119) + ((i241119 & (-131071)) << 1)) / 65536;
        int i251111 = -(i241118 ^ ((i251110 ^ 1) + ((i251110 & 1) << 1)));
        int i251112 = (i251111 & 1) + (i251111 | 1);
        int i251113 = ((i251112 >> 28) - 31) / 16;
        int i251114 = ((i251113 | 1) << 1) - (i251113 ^ 1);
        int i251115 = i231118 + (443716 / (((-((i251114 ^ 1) + ((i251114 & 1) << 1))) & i251112) * 742));
        int i251116 = ((int[]) objArr5[1])[0];
        int i251117 = i251116 * i251116;
        int i251118 = -(1308279787 * i251116);
        int i251119 = (i251117 & i251118) + (i251117 | i251118);
        int i261110 = -(i251116 * 1841813427);
        int i261111 = ((i251119 | i261110) << 1) - (i261110 ^ i251119);
        int i261112 = (i261111 & 1132735841) + (1132735841 | i261111);
        int i261113 = (((i261112 >> 18) - 32767) / 16384) + 1;
        int i261114 = ((i261112 | i261113) << 1) - (i261113 ^ i261112);
        int i261115 = i261112 >> 17;
        int i261116 = (((-65535) & i261115) + (i261115 | (-65535))) / 32768;
        int i261117 = -(((i261116 ^ 1) + ((i261116 & 1) << 1)) ^ i261114);
        int i261118 = ((i261117 | 7) << 1) - (i261117 ^ 7);
        int i261119 = ((i261118 >> 21) - 4095) / 2048;
        int i271110 = ((i261119 | 1) << 1) - (i261119 ^ 1);
        int i271111 = i251115 + (5022990 / (((-((i271110 ^ 1) + ((i271110 & 1) << 1))) & i261118) * 1407));
        int i271112 = ((int[]) objArr7[1])[0];
        int i271113 = ((i271112 * i271112) - (~(-(1212862219 * i271112)))) - 1;
        int i271114 = -(i271112 * 354049661);
        int i271115 = ((i271113 | i271114) << 1) - (i271114 ^ i271113);
        int i271116 = (i271115 & 1901741584) + (1901741584 | i271115);
        int i271117 = i271116 >> 17;
        int i271118 = (((-65535) & i271117) + (i271117 | (-65535))) / 32768;
        int i271119 = ((i271118 | 1) << 1) - (i271118 ^ 1);
        int i281110 = (i271116 ^ i271119) + ((i271119 & i271116) << 1);
        int i281111 = ((i271116 >> 29) - 15) / 8;
        int i281112 = (-(i281110 ^ (((i281111 | 1) << 1) - (i281111 ^ 1)))) + 6;
        int i281113 = i281112 >> 20;
        int i281114 = i271111 + (5708394 / ((i281112 & (-((((i281113 & (-8191)) + (i281113 | (-8191))) / 4096) + 2))) * 1503));
        int i281115 = ((int[]) objArr10[1])[0];
        int i281116 = i281115 * i281115;
        int i281117 = -(1258874226 * i281115);
        int i281118 = (i281116 ^ i281117) + ((i281116 & i281117) << 1);
        int i281119 = -(i281115 * (-411475194));
        int i291110 = ((i281118 & i281119) + (i281119 | i281118)) - (-597224976);
        int i291111 = i291110 >> 20;
        int i291112 = ((i291111 & (-8191)) + (i291111 | (-8191))) / 4096;
        int i291113 = (i291110 - (~((i291112 ^ 1) + ((i291112 & 1) << 1)))) - 1;
        int i291114 = i291110 >> 16;
        int i291115 = -(i291113 ^ (((((-131071) & i291114) + (i291114 | (-131071))) / 65536) + 1));
        int i291116 = (i291115 ^ 4) + ((i291115 & 4) << 1);
        int i291117 = (((i291116 >> 15) - 262143) / 131072) + 1;
        int i291118 = i281114 + (3995136 / (((-((i291117 ^ 1) + ((i291117 & 1) << 1))) & i291116) * 1224));
        int i291119 = ((int[]) objArr12[3])[0];
        int i301110 = i291119 * i291119;
        int i301111 = -(697697465 * i291119);
        int i301112 = (i301110 ^ i301111) + ((i301110 & i301111) << 1);
        int i301113 = -(i291119 * 230309181);
        int i301114 = ((i301112 | i301113) << 1) - (i301113 ^ i301112);
        int i301115 = ((i301114 | 1068480025) << 1) - (1068480025 ^ i301114);
        int i301116 = i301115 >> 16;
        int i301117 = (((-131071) ^ i301116) + ((i301116 & (-131071)) << 1)) / 65536;
        int i301118 = (i301115 - (~((i301117 ^ 1) + ((i301117 & 1) << 1)))) - 1;
        int i301119 = ((i301115 >> 23) - 1023) / 512;
        int i311110 = -(i301118 ^ ((i301119 ^ 1) + ((i301119 & 1) << 1)));
        int i311111 = ((i311110 | 5) << 1) - (i311110 ^ 5);
        int i311112 = i311111 >> 27;
        int i311113 = (((i311112 | (-63)) << 1) - (i311112 ^ (-63))) / 32;
        int i311114 = (i311113 ^ 1) + ((i311113 & 1) << 1);
        int i311115 = i291118 + (9771120 / (((-((i311114 & 1) + (i311114 | 1))) & i311111) * 1968));
        int i311116 = ((int[]) objArr14[0])[0];
        int i311117 = ((i311116 * i311116) - (~(-(1487085662 * i311116)))) - 1;
        int i311118 = -(i311116 * 622676956);
        int i311119 = ((i311117 | i311118) << 1) - (i311117 ^ i311118);
        int i321110 = ((i311119 | (-902807735)) << 1) - ((-902807735) ^ i311119);
        int i321111 = i321110 >> 20;
        int i321112 = ((i321111 ^ (-8191)) + ((i321111 & (-8191)) << 1)) / 4096;
        int i321113 = (i321110 - (~((i321112 ^ 1) + ((i321112 & 1) << 1)))) - 1;
        int i321114 = i321110 >> 24;
        int i321115 = (((i321114 | (-511)) << 1) - (i321114 ^ (-511))) / 256;
        int i321116 = -(i321113 ^ (((i321115 | 1) << 1) - (i321115 ^ 1)));
        int i321117 = ((i321116 | 5) << 1) - (i321116 ^ 5);
        int i321118 = i321117 >> 23;
        int i321119 = ((i321118 & (-1023)) + (i321118 | (-1023))) / 512;
        int i331110 = i311115 + (5749890 / (((-(((i321119 & 1) + (i321119 | 1)) + 1)) & i321117) * 1399));
        int i331111 = ((int[]) objArr16[3])[0];
        int i331112 = ((((i331111 * i331111) - (~(-(1705076136 * i331111)))) - 1) - (~(-(i331111 * (-381342966))))) - 1;
        int i331113 = (i331112 ^ 845688561) + ((i331112 & 845688561) << 1);
        int i331114 = i331113 >> 19;
        int i331115 = ((i331114 & (-16383)) + (i331114 | (-16383))) / 8192;
        int i331116 = (i331113 - (~((i331115 ^ 1) + ((i331115 & 1) << 1)))) - 1;
        int i331117 = ((i331113 >> 16) - 131071) / 65536;
        int i331118 = -(i331116 ^ (((i331117 | 1) << 1) - (i331117 ^ 1)));
        int i331119 = (i331118 & 3) + (i331118 | 3);
        int i341110 = i331119 >> 22;
        int i341111 = (((i341110 | (-2047)) << 1) - (i341110 ^ (-2047))) / 1024;
        int i341112 = (i341111 & 1) + (i341111 | 1);
        int i341113 = i331110 + (1488960 / (((-(((i341112 | 1) << 1) - (i341112 ^ 1))) & i331119) * 517));
        int i341114 = ((int[]) objArr11115[2])[0];
        int i341115 = ((i341114 * i341114) - (~(-(770155949 * i341114)))) - 1;
        int i341116 = -(i341114 * (-1321042351));
        int i341117 = (i341115 ^ i341116) + ((i341115 & i341116) << 1);
        int i341118 = (i341117 ^ 370793473) + ((370793473 & i341117) << 1);
        int i341119 = i341118 >> 24;
        int i351110 = (((i341119 & (-511)) + (i341119 | (-511))) / 256) + 1;
        int i351111 = ((i341118 | i351110) << 1) - (i351110 ^ i341118);
        int i351112 = i341118 >> 19;
        int i351113 = ((i351112 & (-16383)) + (i351112 | (-16383))) / 8192;
        int i351114 = (-(i351111 ^ ((i351113 ^ 1) + ((i351113 & 1) << 1)))) + 1;
        int i351115 = ((i351114 >> 24) - 511) / 256;
        int i351116 = ((i351115 | 1) << 1) - (i351115 ^ 1);
        int i351117 = i341113 + (1823088 / ((i351114 & (-((i351116 ^ 1) + ((i351116 & 1) << 1)))) * 1999));
        int i351118 = ((int[]) objArr20[1])[0];
        int i351119 = i351118 * i351118;
        int i361110 = -(679631359 * i351118);
        int i361111 = (((i351119 & i361110) + (i351119 | i361110)) - (~(-(i351118 * 1504706183)))) - 1296230008;
        int i361112 = i361111 >> 18;
        int i361113 = ((i361111 >> 15) - 262143) / 131072;
        int i361114 = (-(((i361111 - (~(((((i361112 | (-32767)) << 1) - (i361112 ^ (-32767))) / 16384) + 1))) - 1) ^ ((i361113 & 1) + (i361113 | 1)))) + 8;
        int i361115 = i361114 >> 20;
        int i361116 = i351117 + (617760 / ((i361114 & (-(((((i361115 | (-8191)) << 1) - (i361115 ^ (-8191))) / 4096) + 2))) * 396));
        int i361117 = ((int[]) objArr22[2])[0];
        int i361118 = i361117 * i361117;
        int i361119 = -(481707229 * i361117);
        int i371110 = (i361118 ^ i361119) + ((i361118 & i361119) << 1);
        int i371111 = -(i361117 * (-690147765));
        int i371112 = (i371110 ^ i371111) + ((i371111 & i371110) << 1);
        int i371113 = ((i371112 | (-655409776)) << 1) - ((-655409776) ^ i371112);
        int i371114 = i371113 >> 26;
        int i371115 = (((i371114 | ComposerKt.defaultsKey) << 1) - (i371114 ^ ComposerKt.defaultsKey)) / 64;
        int i371116 = (i371115 & 1) + (i371115 | 1);
        int i371117 = ((i371113 | i371116) << 1) - (i371116 ^ i371113);
        int i371118 = i371113 >> 15;
        int i371119 = (((-262143) & i371118) + (i371118 | (-262143))) / 131072;
        int i38110 = -(((i371119 ^ 1) + ((i371119 & 1) << 1)) ^ i371117);
        int i38111 = ((i38110 | 5) << 1) - (i38110 ^ 5);
        int i38112 = i38111 >> 15;
        int i38113 = ((((-262143) ^ i38112) + ((i38112 & (-262143)) << 1)) / 131072) + 1;
        Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "1,9,20,26,File Downloaded".substring(i361116 + ((-30629760) / (((-((i38113 & 1) + (i38113 | 1))) & i38111) * TypedValues.Custom.TYPE_STRING))), 0).show();
    }

    private static String $$g(short s, byte b2, int i) {
        byte[] bArr = $$c;
        int i2 = 107 - (b2 * 3);
        int i3 = (i * 2) + 4;
        int i4 = s * 3;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        int i6 = -1;
        if (bArr == null) {
            i3++;
            i2 = i3 + i5;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i2;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            int i7 = bArr[i3];
            i3++;
            i2 += i7;
        }
    }
}

package com.google.firebase.remoteconfig;

import android.content.Context;
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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.DeviceQuirksExternalSyntheticLambda0;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ConfigUpdate {
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static char[] b;
    private static final byte[] $$c = {59, -124, -78, 46};
    private static final int $$d = 244;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {1, 115, -83, 116};
    private static final int $$b = 123;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.firebase.remoteconfig.ConfigUpdate.$$a
            int r8 = r8 * 3
            int r1 = 1 - r8
            int r6 = r6 + 97
            int r7 = r7 * 2
            int r7 = 3 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2f
        L16:
            r3 = r2
        L17:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2f:
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.ConfigUpdate.c(byte, int, byte, java.lang.Object[]):void");
    }

    public abstract Set<String> getUpdatedKeys();

    public static ConfigUpdate create(Set<String> set) {
        int i = 2 % 2;
        AutoValue_ConfigUpdate autoValue_ConfigUpdate = new AutoValue_ConfigUpdate(set);
        int i2 = TuitionPaymentFragmentbindingInflater1 + 25;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        return autoValue_ConfigUpdate;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x020b  */
    /* JADX WARN: Code duplicated, block: B:43:0x020c  */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        long j;
        float f;
        Throwable cause;
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (true) {
            j = 0;
            f = 0.0f;
            if (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= i2) {
                break;
            }
            int i4 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(b[i + i4])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 2188 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 41 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 841711447, false, $$e(b2, b3, (byte) (b3 + 2)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33016 - ((byte) KeyEvent.getModifierMetaStateMask())), Drawable.resolveOpacity(0, 0) + 3011, Color.red(0) + 26, 321985076, false, $$e(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Color.green(0) + 36505), 3376 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 16 - MotionEvent.axisFromString(""), -968507904, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
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
        int i5 = $11 + 87;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i7 = $11 + 105;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)) + 36505), 3376 - TextUtils.indexOf("", ""), 16 - ExpandableListView.getPackedPositionChild(j), -968507904, false, $$e(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                throw null;
            }
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr6 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                byte b10 = (byte) 0;
                byte b11 = b10;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (36506 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1))), (ViewConfiguration.getEdgeSlop() >> 16) + 3376, 16 - TextUtils.lastIndexOf("", '0', 0), -968507904, false, $$e(b10, b11, (byte) (b11 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            j = 0;
            f = 0.0f;
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0bf6  */
    /* JADX WARN: Code duplicated, block: B:213:0x11ec  */
    /* JADX WARN: Code duplicated, block: B:332:0x27dd  */
    /* JADX WARN: Code duplicated, block: B:333:0x281c  */
    /* JADX WARN: Code duplicated, block: B:346:0x2971 A[Catch: all -> 0x0264, TryCatch #2 {all -> 0x0264, blocks: (B:6:0x014a, B:8:0x0157, B:9:0x0197, B:21:0x02fa, B:23:0x0307, B:24:0x034a, B:31:0x0472, B:33:0x047f, B:34:0x04b9, B:58:0x06b0, B:60:0x06b6, B:61:0x06f0, B:119:0x09f5, B:121:0x0a02, B:123:0x0a46, B:130:0x0b5f, B:132:0x0b6c, B:133:0x0ba8, B:144:0x0cbc, B:146:0x0cc9, B:147:0x0d0c, B:153:0x0e1e, B:155:0x0e2b, B:157:0x0e7b, B:166:0x1020, B:168:0x102d, B:170:0x107c, B:227:0x1258, B:229:0x1265, B:230:0x12ae, B:241:0x147d, B:243:0x148a, B:244:0x14d0, B:260:0x1653, B:262:0x1660, B:263:0x16a1, B:270:0x177f, B:272:0x1785, B:273:0x17b8, B:275:0x185e, B:277:0x1870, B:279:0x18b6, B:293:0x19d4, B:295:0x19e1, B:297:0x1a2e, B:299:0x1a37, B:301:0x1a4f, B:302:0x1a91, B:344:0x2964, B:346:0x2971, B:347:0x29b3, B:363:0x2ebc, B:365:0x2ec9, B:366:0x2f0c, B:372:0x3002, B:374:0x300f, B:375:0x3051, B:520:0x388b, B:522:0x3898, B:523:0x38d4, B:350:0x29c6, B:352:0x29de, B:353:0x2a22, B:311:0x26eb, B:313:0x26f8, B:315:0x2745, B:39:0x05a3, B:41:0x05b0, B:42:0x05ed, B:48:0x0633, B:50:0x0640, B:51:0x067f), top: B:551:0x014a }] */
    /* JADX WARN: Code duplicated, block: B:349:0x29bc  */
    /* JADX WARN: Code duplicated, block: B:350:0x29c6 A[Catch: all -> 0x0264, TryCatch #2 {all -> 0x0264, blocks: (B:6:0x014a, B:8:0x0157, B:9:0x0197, B:21:0x02fa, B:23:0x0307, B:24:0x034a, B:31:0x0472, B:33:0x047f, B:34:0x04b9, B:58:0x06b0, B:60:0x06b6, B:61:0x06f0, B:119:0x09f5, B:121:0x0a02, B:123:0x0a46, B:130:0x0b5f, B:132:0x0b6c, B:133:0x0ba8, B:144:0x0cbc, B:146:0x0cc9, B:147:0x0d0c, B:153:0x0e1e, B:155:0x0e2b, B:157:0x0e7b, B:166:0x1020, B:168:0x102d, B:170:0x107c, B:227:0x1258, B:229:0x1265, B:230:0x12ae, B:241:0x147d, B:243:0x148a, B:244:0x14d0, B:260:0x1653, B:262:0x1660, B:263:0x16a1, B:270:0x177f, B:272:0x1785, B:273:0x17b8, B:275:0x185e, B:277:0x1870, B:279:0x18b6, B:293:0x19d4, B:295:0x19e1, B:297:0x1a2e, B:299:0x1a37, B:301:0x1a4f, B:302:0x1a91, B:344:0x2964, B:346:0x2971, B:347:0x29b3, B:363:0x2ebc, B:365:0x2ec9, B:366:0x2f0c, B:372:0x3002, B:374:0x300f, B:375:0x3051, B:520:0x388b, B:522:0x3898, B:523:0x38d4, B:350:0x29c6, B:352:0x29de, B:353:0x2a22, B:311:0x26eb, B:313:0x26f8, B:315:0x2745, B:39:0x05a3, B:41:0x05b0, B:42:0x05ed, B:48:0x0633, B:50:0x0640, B:51:0x067f), top: B:551:0x014a }] */
    /* JADX WARN: Code duplicated, block: B:352:0x29de A[Catch: all -> 0x0264, TryCatch #2 {all -> 0x0264, blocks: (B:6:0x014a, B:8:0x0157, B:9:0x0197, B:21:0x02fa, B:23:0x0307, B:24:0x034a, B:31:0x0472, B:33:0x047f, B:34:0x04b9, B:58:0x06b0, B:60:0x06b6, B:61:0x06f0, B:119:0x09f5, B:121:0x0a02, B:123:0x0a46, B:130:0x0b5f, B:132:0x0b6c, B:133:0x0ba8, B:144:0x0cbc, B:146:0x0cc9, B:147:0x0d0c, B:153:0x0e1e, B:155:0x0e2b, B:157:0x0e7b, B:166:0x1020, B:168:0x102d, B:170:0x107c, B:227:0x1258, B:229:0x1265, B:230:0x12ae, B:241:0x147d, B:243:0x148a, B:244:0x14d0, B:260:0x1653, B:262:0x1660, B:263:0x16a1, B:270:0x177f, B:272:0x1785, B:273:0x17b8, B:275:0x185e, B:277:0x1870, B:279:0x18b6, B:293:0x19d4, B:295:0x19e1, B:297:0x1a2e, B:299:0x1a37, B:301:0x1a4f, B:302:0x1a91, B:344:0x2964, B:346:0x2971, B:347:0x29b3, B:363:0x2ebc, B:365:0x2ec9, B:366:0x2f0c, B:372:0x3002, B:374:0x300f, B:375:0x3051, B:520:0x388b, B:522:0x3898, B:523:0x38d4, B:350:0x29c6, B:352:0x29de, B:353:0x2a22, B:311:0x26eb, B:313:0x26f8, B:315:0x2745, B:39:0x05a3, B:41:0x05b0, B:42:0x05ed, B:48:0x0633, B:50:0x0640, B:51:0x067f), top: B:551:0x014a }] */
    /* JADX WARN: Code duplicated, block: B:382:0x3129  */
    /* JADX WARN: Code duplicated, block: B:386:0x334f  */
    /* JADX WARN: Code duplicated, block: B:388:0x335f  */
    /* JADX WARN: Code duplicated, block: B:397:0x33a2  */
    /* JADX WARN: Code duplicated, block: B:402:0x33c1  */
    /* JADX WARN: Code duplicated, block: B:404:0x33d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:405:0x33d6  */
    /* JADX WARN: Code duplicated, block: B:407:0x33da  */
    /* JADX WARN: Code duplicated, block: B:409:0x33dd  */
    /* JADX WARN: Code duplicated, block: B:417:0x3466 A[LOOP:12: B:408:0x33db->B:417:0x3466, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:427:0x34ff  */
    /* JADX WARN: Code duplicated, block: B:428:0x3501  */
    /* JADX WARN: Code duplicated, block: B:453:0x363b A[Catch: Exception -> 0x384b, TRY_LEAVE, TryCatch #28 {Exception -> 0x384b, blocks: (B:451:0x359a, B:453:0x363b), top: B:581:0x359a }] */
    /* JADX WARN: Code duplicated, block: B:456:0x3662 A[Catch: Exception -> 0x384d, TRY_LEAVE, TryCatch #29 {Exception -> 0x384d, blocks: (B:455:0x3657, B:460:0x3725, B:462:0x374e, B:503:0x3831, B:511:0x383f, B:512:0x3842, B:515:0x3846, B:461:0x373a, B:456:0x3662), top: B:583:0x3639 }] */
    /* JADX WARN: Code duplicated, block: B:460:0x3725 A[Catch: Exception -> 0x384d, TRY_ENTER, TryCatch #29 {Exception -> 0x384d, blocks: (B:455:0x3657, B:460:0x3725, B:462:0x374e, B:503:0x3831, B:511:0x383f, B:512:0x3842, B:515:0x3846, B:461:0x373a, B:456:0x3662), top: B:583:0x3639 }] */
    /* JADX WARN: Code duplicated, block: B:461:0x373a A[Catch: Exception -> 0x384d, TryCatch #29 {Exception -> 0x384d, blocks: (B:455:0x3657, B:460:0x3725, B:462:0x374e, B:503:0x3831, B:511:0x383f, B:512:0x3842, B:515:0x3846, B:461:0x373a, B:456:0x3662), top: B:583:0x3639 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:470:0x3795  */
    /* JADX WARN: Code duplicated, block: B:475:0x37af  */
    /* JADX WARN: Code duplicated, block: B:476:0x37ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:477:0x37bc  */
    /* JADX WARN: Code duplicated, block: B:479:0x37c0  */
    /* JADX WARN: Code duplicated, block: B:481:0x37d1  */
    /* JADX WARN: Code duplicated, block: B:482:0x37d3  */
    /* JADX WARN: Code duplicated, block: B:484:0x37d6 A[Catch: all -> 0x3839, IOException -> 0x3844, TRY_ENTER, TRY_LEAVE, TryCatch #32 {IOException -> 0x3844, all -> 0x3839, blocks: (B:467:0x378b, B:468:0x378e, B:473:0x37a9, B:484:0x37d6, B:488:0x37fc, B:491:0x3801), top: B:594:0x378b }] */
    /* JADX WARN: Code duplicated, block: B:487:0x37f7  */
    /* JADX WARN: Code duplicated, block: B:491:0x3801 A[Catch: all -> 0x3839, IOException -> 0x3844, TRY_LEAVE, TryCatch #32 {IOException -> 0x3844, all -> 0x3839, blocks: (B:467:0x378b, B:468:0x378e, B:473:0x37a9, B:484:0x37d6, B:488:0x37fc, B:491:0x3801), top: B:594:0x378b }] */
    /* JADX WARN: Code duplicated, block: B:501:0x382e  */
    /* JADX WARN: Code duplicated, block: B:502:0x3830  */
    /* JADX WARN: Code duplicated, block: B:505:0x3836  */
    /* JADX WARN: Code duplicated, block: B:516:0x3849  */
    /* JADX WARN: Code duplicated, block: B:522:0x3898 A[Catch: all -> 0x0264, TryCatch #2 {all -> 0x0264, blocks: (B:6:0x014a, B:8:0x0157, B:9:0x0197, B:21:0x02fa, B:23:0x0307, B:24:0x034a, B:31:0x0472, B:33:0x047f, B:34:0x04b9, B:58:0x06b0, B:60:0x06b6, B:61:0x06f0, B:119:0x09f5, B:121:0x0a02, B:123:0x0a46, B:130:0x0b5f, B:132:0x0b6c, B:133:0x0ba8, B:144:0x0cbc, B:146:0x0cc9, B:147:0x0d0c, B:153:0x0e1e, B:155:0x0e2b, B:157:0x0e7b, B:166:0x1020, B:168:0x102d, B:170:0x107c, B:227:0x1258, B:229:0x1265, B:230:0x12ae, B:241:0x147d, B:243:0x148a, B:244:0x14d0, B:260:0x1653, B:262:0x1660, B:263:0x16a1, B:270:0x177f, B:272:0x1785, B:273:0x17b8, B:275:0x185e, B:277:0x1870, B:279:0x18b6, B:293:0x19d4, B:295:0x19e1, B:297:0x1a2e, B:299:0x1a37, B:301:0x1a4f, B:302:0x1a91, B:344:0x2964, B:346:0x2971, B:347:0x29b3, B:363:0x2ebc, B:365:0x2ec9, B:366:0x2f0c, B:372:0x3002, B:374:0x300f, B:375:0x3051, B:520:0x388b, B:522:0x3898, B:523:0x38d4, B:350:0x29c6, B:352:0x29de, B:353:0x2a22, B:311:0x26eb, B:313:0x26f8, B:315:0x2745, B:39:0x05a3, B:41:0x05b0, B:42:0x05ed, B:48:0x0633, B:50:0x0640, B:51:0x067f), top: B:551:0x014a }] */
    /* JADX WARN: Code duplicated, block: B:588:0x3386 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:590:0x377f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:621:0x357d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:622:0x3370 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:623:0x3507 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:624:0x3569 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:626:0x354e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:628:0x34f0 A[EDGE_INSN: B:628:0x34f0->B:425:0x34f0 BREAK  A[LOOP:9: B:575:0x339c->B:424:0x34ce], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:634:0x34a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:635:0x3495 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:637:0x382c A[EDGE_INSN: B:637:0x382c->B:500:0x382c BREAK  A[LOOP:13: B:468:0x378e->B:499:0x3828], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:643:0x3819 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:644:0x381b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:646:0x380a A[EDGE_INSN: B:646:0x380a->B:493:0x380a BREAK  A[LOOP:16: B:483:0x37d4->B:494:0x380f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:647:0x3800 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:648:0x380f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:649:0x380f A[SYNTHETIC] */
    /* JADX WARN: Multi-variable search skipped. Vars limit reached: 6753 (expected less than 5000) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v323 */
    /* JADX WARN: Type inference failed for: r3v324 */
    /* JADX WARN: Type inference failed for: r3v325, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v362, types: [int] */
    /* JADX WARN: Type inference failed for: r3v559 */
    /* JADX WARN: Type inference failed for: r3v560 */
    /* JADX WARN: Type inference failed for: r3v561 */
    public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, int i, int i2, int i3) throws Throwable {
        int i4;
        String str;
        int i5;
        int i6;
        String str2;
        int i7;
        long j;
        int i8;
        String str3;
        int i9;
        String str4;
        int capsMode;
        int i10;
        int trimmedLength;
        double dConvertQuartSecToDecDegrees;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2;
        int i11;
        byte[] bArr;
        int i12;
        boolean z;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int iRed;
        int capsMode2;
        int i18;
        int i19;
        BufferedInputStream bufferedInputStream3;
        BufferedInputStream bufferedInputStream4;
        String str5;
        int i20;
        byte[] bArr2;
        int i21;
        int i22;
        String str6;
        int size;
        int tapTimeout;
        int i23;
        int i24;
        int i25;
        int i26;
        String[] strArr;
        String str7;
        int i27;
        int i28;
        long j2;
        String str8;
        String str9;
        char c;
        Object[] objArr;
        int i29;
        String[] strArr2;
        int i30;
        char c2;
        int i31;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Object objInvoke;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int i32;
        int i33;
        char c3;
        String[][] strArr3;
        int i34;
        int i35;
        int i36;
        String str10;
        int i37;
        int i38;
        ?? r3;
        int i39;
        ?? r4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        int i40;
        int i41;
        int i42;
        int i43;
        String str11;
        int iIndexOf;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i44;
        String str12;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        int i50;
        int i51;
        byte[] bytes;
        int length;
        BufferedInputStream bufferedInputStream5;
        int i52;
        byte[] bArr3;
        int i53;
        int i54;
        boolean z2;
        int i55;
        int i56;
        int i57;
        int i58;
        byte b2;
        int i59;
        int i60;
        int i61;
        String str13;
        int i62;
        String[] strArr4;
        int length2;
        int i63;
        byte[] bytes2;
        int length3;
        BufferedInputStream bufferedInputStream6;
        String[][] strArr5;
        int i64;
        String[] strArr6;
        String str14;
        int i65;
        int i66;
        BufferedInputStream bufferedInputStream7;
        int i67;
        byte[] bArr4;
        int i68;
        int i69;
        int i70;
        boolean z3;
        int i71;
        int i72;
        int i73;
        int i74;
        int i75;
        String str15;
        int i76;
        byte[] bArr5;
        int i77;
        int i78;
        byte b3;
        byte[] bArr6;
        int i79;
        int i80;
        int i81;
        int i82;
        int i83;
        int i84;
        int i85 = 2 % 2;
        int i86 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
        int i87 = (i86 & 908) + (i86 | 908);
        int iBlue = Color.blue(0);
        int i88 = (iBlue & 8) + (iBlue | 8);
        int i89 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
        int i90 = 1;
        Object[] objArr2 = new Object[1];
        a(i87, i88, (char) ((i89 & 65057) + (i89 | 65057)), objArr2);
        String str16 = (String) objArr2[0];
        new ArrayList();
        int i91 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
        int i92 = ((i91 | 1) << 1) - (i91 ^ 1);
        int i93 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
        int i94 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
        Object[] objArr3 = new Object[1];
        a(i92, ((i93 | 27) << 1) - (i93 ^ 27), (char) (((i94 | 11861) << 1) - (i94 ^ 11861)), objArr3);
        String str17 = (String) objArr3[0];
        String str18 = "";
        int offsetBefore = 27 - TextUtils.getOffsetBefore("", 0);
        int i95 = -(ViewConfiguration.getScrollBarSize() >> 8);
        Object[] objArr4 = new Object[1];
        a(offsetBefore, ((i95 | 25) << 1) - (i95 ^ 25), (char) (20952 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), objArr4);
        String str19 = (String) objArr4[0];
        int i96 = -KeyEvent.getDeadChar(0, 0);
        Object[] objArr5 = new Object[1];
        a((i96 & 52) + (i96 | 52), 17 - (~(-(-TextUtils.indexOf("", "", 0, 0)))), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr5);
        String str20 = (String) objArr5[0];
        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0);
        int i97 = ((iLastIndexOf | 71) << 1) - (iLastIndexOf ^ 71);
        int i98 = -(ViewConfiguration.getEdgeSlop() >> 16);
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i99 = ~i98;
        int i100 = ~((i99 ^ (-29)) | (i99 & (-29)));
        int i101 = ~((~i98) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
        int i102 = (i100 & i101) | (i100 ^ i101);
        int i103 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        int i104 = (i98 * 569) + 15932 + ((i102 | (~(((-29) ^ i103) | ((-29) & i103)))) * (-1136));
        int i105 = -(-(((~((i99 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i99 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4))) | (~(((-29) & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | ((-29) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4))) | (~((i103 ^ i98) | (i103 & i98) | 28))) * (-568)));
        int i106 = ((i104 | i105) << 1) - (i104 ^ i105);
        int i107 = ~(i103 | i98);
        int i108 = ~(i103 | 28);
        int i109 = (i107 & i108) | (i107 ^ i108);
        int i110 = ~((i99 ^ (-29)) | (i99 & (-29)) | iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
        int i111 = -(-(((i109 & i110) | (i109 ^ i110)) * 568));
        Object[] objArr6 = new Object[1];
        a(i97, (i106 & i111) + (i111 | i106), (char) (AndroidCharacter.getMirror('0') - '0'), objArr6);
        String[] strArr7 = {str17, str19, str20, (String) objArr6[0]};
        int i112 = 0;
        while (true) {
            i4 = -1;
            if (i112 >= 4) {
                str = str18;
                i5 = i;
                break;
            }
            try {
                Object[] objArr7 = {strArr7[i112]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                    int i113 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 992;
                    int gidForName = 7 - Process.getGidForName(str18);
                    byte b4 = (byte) ($$a[0] - i90);
                    Object[] objArr8 = new Object[i90];
                    c((byte) 6, b4, b4, objArr8);
                    String str21 = (String) objArr8[0];
                    Class[] clsArr = new Class[i90];
                    clsArr[0] = String.class;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(bitsPerPixel, i113, gidForName, -545305915, false, str21, clsArr);
                }
                long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr7)).longValue();
                long j3 = -1394327481;
                long j4 = -103;
                long j5 = (j4 * j3) + (j4 * jLongValue);
                long j6 = 104;
                long j7 = -1;
                long j8 = jLongValue ^ j7;
                long j9 = i;
                str = str18;
                long j10 = j5 + (((((j3 ^ j7) | j8) ^ j7) | ((j8 | j9) ^ j7)) * j6) + (((long) (-104)) * ((((j9 ^ j7) | j3) | jLongValue) ^ j7)) + (j6 * (j3 | j9)) + ((long) 2014786765);
                int i114 = ((int) (j10 >> 32)) & ((-613420746) + ((~((-272699665) | i)) * 623) + (((~i) | 541764) * (-623)) + (((~(1292791492 | i)) | 272699664 | (~((-1564949393) | i))) * 623));
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int i115 = ~iMaxMemory;
                if (((((int) j10) & ((-69570160) + (((~((-1212619182) | i115)) | (~(1783601581 | iMaxMemory))) * (-831)) + ((~((-138479878) | iMaxMemory)) * (-1662)) + (((~(iMaxMemory | 1212619181)) | (~(i115 | (-1645121705))) | (~(1645121704 | iMaxMemory))) * 831))) | i114) != 0) {
                    i5 = ((i112 ^ 190) + ((i112 & 190) << 1)) ^ i;
                    break;
                }
                int i116 = (i112 ^ 25) + ((i112 & 25) << 1);
                i112 = (i116 ^ (-24)) + ((i116 & (-24)) << 1);
                str18 = str;
                i90 = 1;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i117 = -(-ExpandableListView.getPackedPositionChild(0L));
        int i118 = -(-Drawable.resolveOpacity(0, 0));
        int i119 = (i118 ^ 12) + ((i118 & 12) << 1);
        String str22 = str;
        Object[] objArr9 = new Object[1];
        a(((i117 | 99) << 1) - (i117 ^ 99), i119, (char) TextUtils.indexOf(str22, str22, 0, 0), objArr9);
        String str23 = (String) objArr9[0];
        int i120 = -Process.getGidForName(str22);
        int i121 = (i120 & 109) + (i120 | 109);
        int i122 = -(ViewConfiguration.getPressedStateDuration() >> 16);
        int i123 = (i122 & 13) + (i122 | 13);
        int i124 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
        Object[] objArr10 = new Object[1];
        a(i121, i123, (char) ((i124 & 1) + (i124 | 1)), objArr10);
        String str24 = (String) objArr10[0];
        int i125 = 122 - (~(-(-(ViewConfiguration.getDoubleTapTimeout() >> 16))));
        int i126 = -TextUtils.indexOf(str22, str22, 0, 0);
        Object[] objArr11 = new Object[1];
        a(i125, (i126 & 18) + (i126 | 18), (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 51952), objArr11);
        String[] strArr8 = {str23, str24, (String) objArr11[0]};
        int i127 = 0;
        while (true) {
            if (i127 >= 3) {
                i6 = i5;
                str2 = str22;
                i7 = i;
                break;
            }
            Object[] objArr12 = {strArr8[i127]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                int windowTouchSlop = 993 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                int i128 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 8;
                byte b5 = $$a[0];
                byte b6 = (byte) (b5 - 1);
                Object[] objArr13 = new Object[1];
                c(b5, b6, b6, objArr13);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(absoluteGravity, windowTouchSlop, i128, 410748506, false, (String) objArr13[0], new Class[]{String.class});
            }
            long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr12)).longValue();
            long j11 = 105613138;
            long j12 = (((long) (-433)) * j11) + (((long) (-216)) * jLongValue2);
            long j13 = 217;
            i6 = i5;
            String[] strArr9 = strArr8;
            long j14 = i4;
            long j15 = j11 ^ j14;
            str2 = str22;
            long j16 = i;
            long j17 = j16 ^ j14;
            long j18 = jLongValue2 ^ j14;
            long j19 = j12 + ((((j15 | j17) ^ j14) | ((j18 | j16) ^ j14)) * j13) + ((((j15 | j18) ^ j14) | ((j15 | j16) ^ j14)) * j13) + (j13 * ((j14 ^ (j18 | j17)) | j11)) + ((long) (-306531375));
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i129 = ~startUptimeMillis;
            int i130 = 1817243850 + (((~((-36702212) | i129)) | (~(1400391687 | startUptimeMillis))) * 520);
            int i131 = ~((-1400391688) | i129);
            int i132 = ~(startUptimeMillis | 36834723);
            int i133 = ((int) (j19 >> 32)) & (i130 + ((i131 | i132) * (-1040)) + ((i132 | (~(i129 | (-36834724))) | 1363689476) * 520));
            int i134 = ~((int) Runtime.getRuntime().maxMemory());
            int i135 = ((int) j19) & ((-737851271) + ((~((-147103755) | i134)) * 52) + (((~((-147169292) | i134)) | (~(1290057118 | i134)) | 65537) * (-52)) + (((~(i134 | 147169291)) | 1142953364) * 52));
            if (((i133 & i135) | (i133 ^ i135)) != 0) {
                int i136 = i127 + 270;
                i7 = (~(i & i136)) & (i | i136);
                break;
            }
            int i137 = (i127 ^ (-36)) + ((i127 & (-36)) << 1);
            i127 = (i137 ^ 37) + ((i137 & 37) << 1);
            i5 = i6;
            strArr8 = strArr9;
            str22 = str2;
            i4 = -1;
        }
        int i138 = (~(i & i6)) & (i | i6);
        int i139 = -i138;
        int i140 = ((i138 & i139) | (i138 ^ i139)) >> 31;
        int i141 = i7 & (~i140);
        int i142 = i140 & i6;
        int i143 = (i141 & i142) | (i141 ^ i142);
        int i144 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
        Object[] objArr14 = new Object[1];
        a((i144 ^ 141) + ((i144 & 141) << 1), 14 - (~Process.getGidForName(str2)), (char) ((-2) - ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) ^ (-1))), objArr14);
        Object[] objArr15 = {(String) objArr14[0]};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
            char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString(str2);
            int scrollBarSize = 993 - (ViewConfiguration.getScrollBarSize() >> 8);
            int i145 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 7;
            byte b7 = (byte) ($$a[0] - 1);
            Object[] objArr16 = new Object[1];
            c((byte) 6, b7, b7, objArr16);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cKeyCodeFromString, scrollBarSize, i145, -545305915, false, (String) objArr16[0], new Class[]{String.class});
        }
        long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr15)).longValue();
        long j20 = 271485289;
        long j21 = -115;
        long jFreeMemory = (int) Runtime.getRuntime().freeMemory();
        long j22 = -1;
        long j23 = 116;
        long j24 = (j21 * j20) + (j21 * jLongValue3) + (((long) (-116)) * ((((jFreeMemory ^ j22) | j20) | jLongValue3) ^ j22)) + ((j20 | jFreeMemory) * j23);
        long j25 = jLongValue3 ^ j22;
        long j26 = j24 + (j23 * (((j25 | jFreeMemory) ^ j22) | (((j20 ^ j22) | j25) ^ j22))) + ((long) 348973995);
        int i146 = ~Process.myTid();
        int i147 = ((int) (j26 >> 32)) & (852811170 + ((~((-18991718) | i146)) * 52) + (((~((-555998054) | i146)) | (~((-1993224465) | i146)) | 537006336) * (-52)) + (((~(i146 | 555998053)) | (-2012216182)) * 52));
        int iMyUid = Process.myUid();
        if ((i147 | (((int) j26) & ((-1587633331) + (((~((-4333732) | iMyUid)) | 4202498 | (~((-1432892679) | iMyUid))) * (-744)) + (((~iMyUid) | (-1433023912)) * 744) + ((iMyUid | (-4202499)) * 744)))) != 0) {
            j = j22;
            i8 = i;
            i9 = i8 ^ 266;
            str3 = str2;
        } else {
            j = j22;
            i8 = i;
            int jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() >> 16;
            int i148 = (jumpTapTimeout ^ ModuleDescriptor.MODULE_VERSION) + ((jumpTapTimeout & ModuleDescriptor.MODULE_VERSION) << 1);
            str3 = str2;
            int i149 = -TextUtils.indexOf((CharSequence) str3, '0', 0);
            int i150 = (i149 & 23) + (i149 | 23);
            int i151 = -(-Color.red(0));
            Object[] objArr17 = new Object[1];
            a(i148, i150, (char) ((i151 & 8429) + (i151 | 8429)), objArr17);
            Object[] objArr18 = {(String) objArr17[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char capsMode3 = (char) (TextUtils.getCapsMode(str3, 0, 0) + 33602);
                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3085;
                int iKeyCodeFromString = KeyEvent.keyCodeFromString(str3) + 26;
                byte b8 = $$a[0];
                byte b9 = (byte) (b8 - 1);
                Object[] objArr19 = new Object[1];
                c(b8, b9, b9, objArr19);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(capsMode3, minimumFlingVelocity, iKeyCodeFromString, 1411172903, false, (String) objArr19[0], new Class[]{String.class});
            }
            String str25 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr18);
            if (str25 == null || str25.isEmpty()) {
                int i152 = -(-View.MeasureSpec.makeMeasureSpec(0, 0));
                int i153 = (i152 ^ 179) + ((i152 & 179) << 1);
                int i154 = 23 - (~(Process.myPid() >> 22));
                int iLastIndexOf2 = TextUtils.lastIndexOf(str3, '0', 0);
                char c4 = (char) (((iLastIndexOf2 | 1) << 1) - (iLastIndexOf2 ^ 1));
                Object[] objArr20 = new Object[1];
                a(i153, i154, c4, objArr20);
                Object[] objArr21 = {(String) objArr20[0]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                    char bitsPerPixel2 = (char) (33601 - ImageFormat.getBitsPerPixel(0));
                    int i155 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3084;
                    int i156 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 25;
                    byte b10 = $$a[0];
                    byte b11 = (byte) (b10 - 1);
                    Object[] objArr22 = new Object[1];
                    c(b10, b11, b11, objArr22);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(bitsPerPixel2, i155, i156, 1411172903, false, (String) objArr22[0], new Class[]{String.class});
                }
                String str26 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr21);
                if (str26 != null) {
                    int i157 = TuitionPaymentFragmentbindingInflater1 + 61;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i157 % 128;
                    int i158 = i157 % 2;
                    if (!str26.isEmpty()) {
                        i9 = (i8 & (-268)) | ((~i8) & 267);
                    }
                }
                i9 = i8;
            } else {
                i9 = (i8 & (-268)) | ((~i8) & 267);
            }
        }
        int i159 = i8 ^ i143;
        int i160 = -i159;
        int i161 = ((i159 & i160) | (i159 ^ i160)) >> 31;
        int i162 = i9 & (~i161);
        int i163 = i161 & i143;
        int i164 = (i162 & i163) | (i162 ^ i163);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2061288340);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char cResolveSize = (char) (56827 - View.resolveSize(0, 0));
            int iIndexOf2 = 2813 - TextUtils.indexOf((CharSequence) str3, '0', 0, 0);
            int iRgb = Color.rgb(0, 0, 0) + 16777225;
            byte b12 = $$a[0];
            byte b13 = (byte) (b12 - 1);
            Object[] objArr23 = new Object[1];
            c(b12, b13, b13, objArr23);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cResolveSize, iIndexOf2, iRgb, -1639816125, false, (String) objArr23[0], new Class[0]);
        }
        long jLongValue4 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, null)).longValue();
        long j27 = 987529061;
        long j28 = -375;
        long j29 = (j28 * j27) + (j28 * jLongValue4);
        long j30 = 376;
        String str27 = str3;
        long jMaxMemory = (int) Runtime.getRuntime().maxMemory();
        long j31 = j27 ^ j;
        long j32 = (j27 | jLongValue4) ^ j;
        long j33 = j29 + ((jMaxMemory | ((j31 | (jLongValue4 ^ j)) ^ j) | j32) * j30) + (((long) (-376)) * ((((jMaxMemory ^ j) | j27) ^ j) | j32)) + (j30 * (((j31 | jMaxMemory) ^ j) | jLongValue4)) + ((long) 1125827445);
        int i165 = i;
        int i166 = ~i165;
        int i167 = ~((-225369613) | i166);
        int i168 = ((int) (j33 >> 32)) & ((-1067517290) + ((1662596023 | i167) * 764) + (((~(1662596023 | i166)) | (-1870659520)) * (-1528)) + ((i167 | (-1853353404)) * 764));
        int i169 = ((int) j33) & (717051037 + (((~((-722152536) | i165)) | (~(2135588350 | i166))) * (-1808)) + (((~((-722086999) | i165)) | (~(2135653887 | i166))) * TypedValues.Custom.TYPE_BOOLEAN) + (((~((-2135588351) | i165)) | 65537 | (~(722152535 | i166))) * TypedValues.Custom.TYPE_BOOLEAN));
        int i170 = (i168 & i169) | (i168 ^ i169);
        int i171 = 199 - (~(-(-(i170 - 1))));
        int i172 = (i171 | i165) & (~(i165 & i171));
        int i173 = (i170 | (-i170)) >> 31;
        int i174 = (~i173) & i165;
        int i175 = i173 & i172;
        int i176 = (i175 & i174) | (i174 ^ i175);
        int i177 = (~(i165 & i164)) & (i165 | i164);
        int i178 = -i177;
        int i179 = ((i177 & i178) | (i177 ^ i178)) >> 31;
        int i180 = i176 & (~i179);
        int i181 = i164 & i179;
        int i182 = (i180 & i181) | (i180 ^ i181);
        int i183 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
        TuitionPaymentFragmentbindingInflater1 = i183 % 128;
        if (i183 % 2 != 0) {
            str4 = str27;
            capsMode = TextUtils.getCapsMode(str4, 1, 0) * 23430;
            trimmedLength = 60 / TextUtils.getTrimmedLength(str4);
            dConvertQuartSecToDecDegrees = CdmaCellLocation.convertQuartSecToDecDegrees(0);
            i10 = 1;
        } else {
            str4 = str27;
            capsMode = 202 - (~TextUtils.getCapsMode(str4, 0, 0));
            int i184 = -TextUtils.getTrimmedLength(str4);
            i10 = 1;
            trimmedLength = ((i184 & 20) << 1) + (i184 ^ 20);
            dConvertQuartSecToDecDegrees = CdmaCellLocation.convertQuartSecToDecDegrees(0);
        }
        int i185 = -(dConvertQuartSecToDecDegrees > 0.0d ? 1 : (dConvertQuartSecToDecDegrees == 0.0d ? 0 : -1));
        Object[] objArr24 = new Object[i10];
        a(capsMode, trimmedLength, (char) (((50572 | i185) << i10) - (i185 ^ 50572)), objArr24);
        String str28 = (String) objArr24[0];
        int i186 = 222 - (~(-(ViewConfiguration.getJumpTapTimeout() >> 16)));
        int i187 = -(ViewConfiguration.getScrollBarSize() >> 8);
        Object[] objArr25 = new Object[1];
        a(i186, (i187 & 6) + (i187 | 6), (char) View.MeasureSpec.makeMeasureSpec(0, 0), objArr25);
        byte[] bytes3 = ((String) objArr25[0]).getBytes();
        int length4 = bytes3.length;
        if (length4 == 0) {
            i11 = 1;
        } else {
            try {
                bufferedInputStream2 = new BufferedInputStream(new FileInputStream(str28));
                int i188 = 4096;
                try {
                    byte[] bArr7 = new byte[4096];
                    int i189 = 0;
                    while (true) {
                        int i190 = bufferedInputStream2.read(bArr7, 0, i188);
                        if (i190 <= 0) {
                            break;
                        }
                        int i191 = 0;
                        while (i189 < length4 && i191 < i190) {
                            if (bArr7[i191] == bytes3[i189]) {
                                i189 = ((i189 | 1) << 1) - (i189 ^ 1);
                            } else {
                                if (i189 != 0) {
                                    int i192 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 55;
                                    TuitionPaymentFragmentbindingInflater1 = i192 % 128;
                                    int i193 = i192 % 2;
                                    int i194 = (i189 ^ (-1)) + (i189 << 1);
                                    while (true) {
                                        if (i194 <= 0) {
                                            bArr = bArr7;
                                            i189 = 0;
                                            break;
                                        }
                                        int i195 = 0;
                                        while (true) {
                                            if (i195 >= i194) {
                                                bArr = bArr7;
                                                i12 = 1;
                                                z = true;
                                                break;
                                            }
                                            bArr = bArr7;
                                            int i196 = -i194;
                                            int i197 = (i189 ^ i196) + ((i196 & i189) << 1);
                                            int i198 = -(-i195);
                                            if (bytes3[i195] != bytes3[((i197 | i198) << 1) - (i197 ^ i198)]) {
                                                i12 = 1;
                                                z = false;
                                                break;
                                            }
                                            i195++;
                                            bArr7 = bArr;
                                        }
                                        if (!(!z)) {
                                            i189 = i194;
                                            break;
                                        }
                                        int i199 = i194 + 8;
                                        i194 = ((i199 & (-9)) << i12) + (i199 ^ (-9));
                                        bArr7 = bArr;
                                    }
                                }
                                bArr7 = bArr;
                            }
                            bArr = bArr7;
                            int i200 = (i191 & (-111)) + (i191 | (-111));
                            i191 = ((i200 | 112) << 1) - (i200 ^ 112);
                            bArr7 = bArr;
                        }
                        bArr7 = bArr7;
                        i188 = 4096;
                    }
                    i11 = i189 == length4 ? 1 : 0;
                    try {
                        bufferedInputStream2.close();
                    } catch (IOException unused) {
                    }
                } catch (IOException unused2) {
                    if (bufferedInputStream2 != null) {
                        try {
                            bufferedInputStream2.close();
                        } catch (IOException unused3) {
                        }
                    }
                    i11 = 0;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream = bufferedInputStream2;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused5) {
                bufferedInputStream2 = null;
            } catch (Throwable th3) {
                th = th3;
                bufferedInputStream = null;
            }
        }
        int i201 = -i11;
        int i202 = ((i11 & i201) | (i11 ^ i201)) >> 31;
        int i203 = i165 ^ i182;
        int i204 = (i203 | (-i203)) >> 31;
        int i205 = (i182 & i204) | (((i202 & (i165 ^ 262)) | ((~i202) & i165)) & (~i204));
        int threadPriority = Process.getThreadPriority(0);
        int i206 = ((threadPriority & 20) + (threadPriority | 20)) >> 6;
        int i207 = (i206 & 229) + (i206 | 229);
        int i208 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
        int i209 = -(-Color.alpha(0));
        Object[] objArr26 = new Object[1];
        a(i207, ((i208 | 31) << 1) - (i208 ^ 31), (char) (((i209 | 49705) << 1) - (i209 ^ 49705)), objArr26);
        String str29 = (String) objArr26[0];
        int i210 = -(-TextUtils.indexOf((CharSequence) str4, '0', 0));
        int i211 = (i210 & 261) + (i210 | 261);
        int i212 = -(-TextUtils.indexOf((CharSequence) str4, '0'));
        Object[] objArr27 = new Object[1];
        a(i211, (i212 & 24) + (i212 | 24), (char) ((-2) - (~(-ImageFormat.getBitsPerPixel(0)))), objArr27);
        String str30 = (String) objArr27[0];
        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 283;
        int i213 = -(-(Process.myPid() >> 22));
        int i214 = ((i213 | 28) << 1) - (i213 ^ 28);
        int i215 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
        Object[] objArr28 = new Object[1];
        a(iNormalizeMetaState, i214, (char) (((i215 | 41230) << 1) - (i215 ^ 41230)), objArr28);
        String str31 = (String) objArr28[0];
        int i216 = 310 - (~(-(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)))));
        int i217 = -TextUtils.getTrimmedLength(str4);
        Object[] objArr29 = new Object[1];
        a(i216, ((i217 | 14) << 1) - (i217 ^ 14), (char) ((Process.getThreadPriority(0) + 20) >> 6), objArr29);
        String[] strArr10 = {str29, str30, str31, (String) objArr29[0]};
        int i218 = 0;
        while (true) {
            if (i218 >= 4) {
                i13 = i166;
                i14 = i165;
                break;
            }
            Object[] objArr30 = {strArr10[i218]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char cKeyCodeFromString2 = (char) KeyEvent.keyCodeFromString(str4);
                int i219 = 994 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                int iIndexOf3 = 8 - TextUtils.indexOf(str4, str4);
                byte b14 = (byte) ($$a[0] - 1);
                byte b15 = b14;
                Object[] objArr31 = new Object[1];
                c(b14, b15, b15, objArr31);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cKeyCodeFromString2, i219, iIndexOf3, 349342683, false, (String) objArr31[0], new Class[]{String.class});
            }
            long jLongValue5 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr30)).longValue();
            long j34 = 49002790;
            long j35 = jLongValue5 ^ j;
            i13 = i166;
            long j36 = i165;
            long j37 = j36 ^ j;
            long j38 = (((long) (-830)) * j34) + (((long) 832) * jLongValue5) + (((long) (-831)) * (((j35 | j37) ^ j) | (((j34 | jLongValue5) | j36) ^ j))) + (((long) (-1662)) * (((j35 | j34) | j36) ^ j)) + (((long) 831) * (((j36 | jLongValue5) ^ j) | (((j34 ^ j) | j37) ^ j) | ((j34 | j36) ^ j))) + ((long) (-896081395));
            int i220 = (int) Runtime.getRuntime().totalMemory();
            int i221 = ((int) (j38 >> 32)) & ((-406318735) + (((~(39184977 | i220)) | 1398041433) * 191) + (((~((~i220) | 39184977)) | 1358954760) * 191));
            int iNextInt = new Random().nextInt(817079909);
            int i222 = ~iNextInt;
            int i223 = ((int) j38) & ((-1871736089) + (((~(1736726764 | i222)) | (~((-299500355) | iNextInt))) * 1900) + (((~(i222 | 299500354)) | (~((-1736726765) | iNextInt))) * (-950)) + (((~(iNextInt | 299500354)) | (~(i222 | (-1736726765)))) * 950));
            if (((i221 & i223) | (i221 ^ i223)) != 0) {
                int i224 = ((i218 | 252) << 1) - (i218 ^ 252);
                i14 = (i224 | i165) & (~(i165 & i224));
                break;
            }
            i218 = (i218 ^ 1) + ((i218 & 1) << 1);
            i166 = i13;
            strArr10 = strArr10;
        }
        int i225 = (~(i165 & i205)) & (i165 | i205);
        int i226 = (i225 | (-i225)) >> 31;
        int i227 = (i205 & i226) | (i14 & (~i226));
        int maximumFlingVelocity = ViewConfiguration.getMaximumFlingVelocity() >> 16;
        Object[] objArr32 = new Object[1];
        a((maximumFlingVelocity & 325) + (maximumFlingVelocity | 325), 12 - (~(-(ViewConfiguration.getTouchSlop() >> 8))), (char) (61770 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr32);
        Object[] objArr33 = {(String) objArr32[0]};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
            char cResolveSize2 = (char) (33602 - View.resolveSize(0, 0));
            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 3085;
            int i228 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 26;
            byte b16 = $$a[0];
            byte b17 = (byte) (b16 - 1);
            Object[] objArr34 = new Object[1];
            c(b16, b17, b17, objArr34);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cResolveSize2, packedPositionType, i228, 1411172903, false, (String) objArr34[0], new Class[]{String.class});
        }
        String str32 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr33);
        if (str32 != null) {
            int i229 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i230 = ((i229 | 338) << 1) - (i229 ^ 338);
            int i231 = -(-TextUtils.indexOf(str4, str4, 0));
            Object[] objArr35 = new Object[1];
            a(i230, (i231 ^ 9) + ((i231 & 9) << 1), (char) (39596 - (~(-(-(ViewConfiguration.getDoubleTapTimeout() >> 16))))), objArr35);
            if (str32.contains((String) objArr35[0])) {
                i15 = i13;
                i16 = (i165 & (-251)) | (i15 & ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
            } else {
                i15 = i13;
                i16 = i165;
            }
        } else {
            i15 = i13;
            i16 = i165;
        }
        int i232 = (~(i165 & i227)) & (i165 | i227);
        int i233 = (i232 | (-i232)) >> 31;
        int i234 = i16 & (~i233);
        int i235 = TuitionPaymentFragmentbindingInflater1 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i235 % 128;
        if (i235 % 2 == 0) {
            int i236 = i227 & i233;
            i17 = (i236 & i234) | (i234 ^ i236);
            iRed = Color.red(1) * 7174;
            capsMode2 = TextUtils.getCapsMode(str4, 0, 0);
            i18 = 109;
        } else {
            int i237 = i227 & i233;
            i17 = (i237 & i234) | (i234 ^ i237);
            int i238 = -Color.red(0);
            iRed = (i238 & 347) + (i238 | 347);
            capsMode2 = TextUtils.getCapsMode(str4, 0, 0);
            i18 = 17;
        }
        int i239 = -capsMode2;
        int i240 = (i18 ^ i239) + ((i239 & i18) << 1);
        int i241 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
        int i242 = i241 * 273;
        int i243 = (i242 ^ 271) + ((i242 & 271) << 1);
        int i244 = ~i241;
        int i245 = ~((i244 ^ i15) | (i244 & i15));
        int i246 = ~i241;
        int i247 = i246 | i241;
        int i248 = ~((i247 & i165) | (i247 ^ i165));
        int i249 = i243 + (((i245 & i248) | (i245 ^ i248)) * (-272));
        int i250 = -(-(((~((i244 & i165) | (i244 ^ i165))) | (~((~i246) | i246))) * (-272)));
        int i251 = ~((i241 & i165) | (i241 ^ i165));
        Object[] objArr36 = new Object[1];
        a(iRed, i240, (char) ((((i249 & i250) + (i250 | i249)) - (~((i251 | (i251 ^ (-1))) * 272))) - 1), objArr36);
        String str33 = (String) objArr36[0];
        int i252 = TuitionPaymentFragmentbindingInflater1 + 123;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i252 % 128;
        int i253 = i252 % 2;
        Object[] objArr37 = new Object[1];
        a(364 - View.MeasureSpec.getSize(0), 5 - (~(-(ViewConfiguration.getMaximumFlingVelocity() >> 16))), (char) (ViewConfiguration.getPressedStateDuration() >> 16), objArr37);
        Object[] objArr38 = {str33, (String) objArr37[0]};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
            char scrollBarSize2 = (char) (ViewConfiguration.getScrollBarSize() >> 8);
            int iIndexOf4 = 2384 - TextUtils.indexOf((CharSequence) str4, '0', 0);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 32;
            byte b18 = $$a[0];
            byte b19 = (byte) (b18 - 1);
            Object[] objArr39 = new Object[1];
            c(b18, b19, b19, objArr39);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(scrollBarSize2, iIndexOf4, iMakeMeasureSpec, -1207062455, false, (String) objArr39[0], new Class[]{String.class, String.class});
        }
        long jLongValue6 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr38)).longValue();
        long j39 = 181307121;
        long j40 = 881;
        long j41 = (j40 * j39) + (j40 * jLongValue6);
        long j42 = -880;
        long j43 = j39 ^ j;
        long j44 = jLongValue6 ^ j;
        String str34 = str4;
        long jFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
        long j45 = j41 + ((((j43 | j44) ^ j) | ((j43 | jFreeMemory2) ^ j) | ((j44 | jFreeMemory2) ^ j)) * j42);
        long j46 = jLongValue6 | ((j43 | (jFreeMemory2 ^ j)) ^ j);
        long j47 = (jFreeMemory2 | j39) ^ j;
        long j48 = j45 + ((j46 | j47) * j42);
        long j49 = 880;
        long j50 = j48 + (j47 * j49) + ((long) 1795736207);
        int i254 = (int) Runtime.getRuntime().totalMemory();
        int i255 = ~i254;
        int i256 = 810991962 + (((~(1706269999 | i255)) | (~((-1706167600) | i254))) * 520);
        int i257 = ~(1706167599 | i255);
        int i258 = ~((-1151573286) | i254);
        int i259 = ((int) (j50 >> 32)) & (i256 + ((i257 | i258) * (-1040)) + ((i258 | (~(i255 | 1151573285)) | 102400) * 520));
        int iMyUid2 = Process.myUid();
        int i260 = ((int) j50) & ((-184576990) + ((~((-673874501) | iMyUid2)) * (-301)) + (((~(695128900 | iMyUid2)) | (~((~iMyUid2) | (-742097510)))) * (-301)) + (((~(iMyUid2 | 742097509)) | 695128900) * 301));
        int i261 = ((i259 & i260) | (i259 ^ i260)) != 0 ? (~(i165 & 251)) & (i165 | 251) : i165;
        int i262 = (~(i165 & i17)) & (i165 | i17);
        int i263 = -i262;
        int i264 = ((i262 & i263) | (i262 ^ i263)) >> 31;
        int i265 = i261 & (~i264);
        int i266 = i17 & i264;
        int i267 = (i266 & i265) | (i265 ^ i266);
        int i268 = 369 - (~(ViewConfiguration.getFadingEdgeLength() >> 16));
        int i269 = -(-AndroidCharacter.getMirror('0'));
        int i270 = -KeyEvent.getDeadChar(0, 0);
        Object[] objArr40 = new Object[1];
        a(i268, (i269 ^ (-25)) + ((i269 & (-25)) << 1), (char) (((i270 | 41110) << 1) - (i270 ^ 41110)), objArr40);
        Object[] objArr41 = {(String) objArr40[0]};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
            char jumpTapTimeout2 = (char) (33602 - (ViewConfiguration.getJumpTapTimeout() >> 16));
            int threadPriority2 = 3085 - ((Process.getThreadPriority(0) + 20) >> 6);
            int i271 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 25;
            byte b20 = $$a[0];
            byte b21 = (byte) (b20 - 1);
            Object[] objArr42 = new Object[1];
            c(b20, b21, b21, objArr42);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(jumpTapTimeout2, threadPriority2, i271, 1411172903, false, (String) objArr42[0], new Class[]{String.class});
        }
        String lowerCase = ((String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).invoke(null, objArr41)).toLowerCase();
        int i272 = -Color.red(0);
        int i273 = (i272 & 393) + (i272 | 393);
        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L);
        Object[] objArr43 = new Object[1];
        a(i273, (packedPositionGroup ^ 4) + ((packedPositionGroup & 4) << 1), (char) (18305 - (~(-(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))))), objArr43);
        int i274 = lowerCase.contains((String) objArr43[0]) ? (i165 & (-265)) | (i15 & 264) : i165;
        int i275 = ((~i267) & i165) | (i267 & i15);
        int i276 = -i275;
        int i277 = ((i275 & i276) | (i275 ^ i276)) >> 31;
        int i278 = i274 & (~i277);
        int i279 = i267 & i277;
        int i280 = (i279 & i278) | (i278 ^ i279);
        Object[] objArr44 = new Object[1];
        a(395 - (~(-Process.getGidForName(str34))), (ViewConfiguration.getScrollBarSize() >> 8) + 42, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr44);
        String str35 = (String) objArr44[0];
        int iLastIndexOf3 = TextUtils.lastIndexOf(str34, '0', 0, 0);
        int i281 = ((iLastIndexOf3 | 440) << 1) - (iLastIndexOf3 ^ 440);
        char mirror = AndroidCharacter.getMirror('0');
        Object[] objArr45 = new Object[1];
        a(i281, (mirror ^ 65528) + ((mirror & 65528) << 1), (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 61393), objArr45);
        String str36 = (String) objArr45[0];
        int i282 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
        int i283 = ((i282 | 480) << 1) - (i282 ^ 480);
        int i284 = 25 - (~(-((byte) KeyEvent.getModifierMetaStateMask())));
        int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0);
        int i285 = absoluteGravity2 * 477;
        int i286 = (i285 ^ (-9326625)) + ((i285 & (-9326625)) << 1);
        int i287 = ~absoluteGravity2;
        int i288 = ~((i287 & 19635) | (i287 ^ 19635));
        int i289 = ((-19636) ^ absoluteGravity2) | ((-19636) & absoluteGravity2);
        int i290 = ~((i289 & i165) | (i289 ^ i165));
        int i291 = (i286 - (~(((i288 & i290) | (i288 ^ i290)) * (-476)))) - 1;
        int i292 = -(-(i290 * 952));
        int i293 = (-19636) | i15;
        char c5 = (char) ((i291 ^ i292) + ((i291 & i292) << 1) + ((~((absoluteGravity2 & i293) | (i293 ^ absoluteGravity2))) * 476));
        Object[] objArr46 = new Object[1];
        a(i283, i284, c5, objArr46);
        String str37 = (String) objArr46[0];
        int i294 = -Gravity.getAbsoluteGravity(0, 0);
        int i295 = (i294 ^ TypedValues.PositionType.TYPE_PERCENT_X) + ((i294 & TypedValues.PositionType.TYPE_PERCENT_X) << 1);
        int i296 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
        Object[] objArr47 = new Object[1];
        a(i295, ((i296 | 27) << 1) - (i296 ^ 27), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr47);
        String str38 = (String) objArr47[0];
        int i297 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 532;
        int i298 = -MotionEvent.axisFromString(str34);
        int i299 = (i298 & 26) + (i298 | 26);
        int i300 = -(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
        Object[] objArr48 = new Object[1];
        a(i297, i299, (char) (((i300 | 31455) << 1) - (i300 ^ 31455)), objArr48);
        String str39 = (String) objArr48[0];
        int i301 = -(-KeyEvent.normalizeMetaState(0));
        int i302 = -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
        Object[] objArr49 = new Object[1];
        a(((i301 | 560) << 1) - (i301 ^ 560), (i302 & 26) + (i302 | 26), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr49);
        String[] strArr11 = {str35, str36, str37, str38, str39, (String) objArr49[0]};
        int i303 = 0;
        while (true) {
            if (i303 >= 6) {
                j42 = j42;
                i19 = i165;
                break;
            }
            Object[] objArr50 = {strArr11[i303]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 33602);
                int iAlpha = 3085 - Color.alpha(0);
                int iIndexOf5 = 25 - TextUtils.indexOf((CharSequence) str34, '0', 0, 0);
                byte b22 = $$a[0];
                byte b23 = (byte) (b22 - 1);
                Object[] objArr51 = new Object[1];
                c(b22, b23, b23, objArr51);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(scrollDefaultDelay, iAlpha, iIndexOf5, 1411172903, false, (String) objArr51[0], new Class[]{String.class});
            }
            String str40 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).invoke(null, objArr50);
            if (str40 != null && !str40.isEmpty()) {
                i19 = i165 ^ 265;
                break;
            }
            int i304 = ((i303 | (-81)) << 1) - (i303 ^ (-81));
            i303 = (i304 & 82) + (i304 | 82);
            strArr11 = strArr11;
            j42 = j42;
        }
        int i305 = i165 ^ i280;
        int i306 = -i305;
        int i307 = ((i305 & i306) | (i305 ^ i306)) >> 31;
        int i308 = i19 & (~i307);
        int i309 = i280 & i307;
        int i310 = (i309 & i308) | (i308 ^ i309);
        int i311 = 346 - (~(-(ViewConfiguration.getTouchSlop() >> 8)));
        int i312 = -KeyEvent.normalizeMetaState(0);
        Object[] objArr52 = new Object[1];
        a(i311, (i312 & 17) + (i312 | 17), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), objArr52);
        String str41 = (String) objArr52[0];
        int i313 = -(-View.resolveSizeAndState(0, 0, 0));
        Object[] objArr53 = new Object[1];
        a(((i313 | 587) << 1) - (i313 ^ 587), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 5, (char) (Color.alpha(0) + 52751), objArr53);
        byte[] bytes4 = ((String) objArr53[0]).getBytes();
        int length5 = bytes4.length;
        if (length5 == 0) {
            i20 = (i165 & (-261)) | (i15 & 260);
            str5 = str34;
        } else {
            try {
                bufferedInputStream4 = new BufferedInputStream(new FileInputStream(str41));
                int i314 = 4096;
                try {
                    byte[] bArr8 = new byte[4096];
                    int i315 = 0;
                    while (true) {
                        int i316 = bufferedInputStream4.read(bArr8, 0, i314);
                        if (i316 <= 0) {
                            break;
                        }
                        int i317 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 83;
                        TuitionPaymentFragmentbindingInflater1 = i317 % 128;
                        int i318 = i317 % 2;
                        int i319 = 0;
                        while (i315 < length5 && i319 < i316) {
                            if (bArr8[i319] == bytes4[i315]) {
                                int i320 = (i315 ^ (-67)) + ((i315 & (-67)) << 1);
                                i315 = ((i320 | 68) << 1) - (i320 ^ 68);
                            } else {
                                if (i315 != 0) {
                                    int i321 = -(-(i315 * (-103)));
                                    int i322 = ((103 | i321) << 1) - (i321 ^ 103);
                                    int i323 = ~i315;
                                    int i324 = ~i323;
                                    int i325 = ~(i323 | i165);
                                    int i326 = ((i324 ^ i325) | (i325 & i324)) * 104;
                                    int i327 = (i322 ^ i326) + ((i322 & i326) << 1);
                                    int i328 = (i15 ^ (-1)) | i15;
                                    int i329 = (i327 - (~((~((i328 ^ i315) | (i328 & i315))) * (-104)))) - 1;
                                    int i330 = (i329 & (-104)) + (i329 | (-104));
                                    while (true) {
                                        if (i330 <= 0) {
                                            bArr8 = bArr8;
                                            i315 = 0;
                                            break;
                                        }
                                        int i331 = 0;
                                        while (true) {
                                            if (i331 >= i330) {
                                                bArr8 = bArr8;
                                                int i332 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
                                                TuitionPaymentFragmentbindingInflater1 = i332 % 128;
                                                int i333 = i332 % 2;
                                                i315 = i330;
                                                break;
                                            }
                                            bArr2 = bArr8;
                                            i21 = i315;
                                            if (bytes4[i331] != bytes4[(((i315 - (~(-i330))) - 1) - (~i331)) - 1]) {
                                                break;
                                            }
                                            i331++;
                                            bArr8 = bArr2;
                                            i315 = i21;
                                        }
                                        i330 = (-2) - (~i330);
                                        bArr8 = bArr2;
                                        i315 = i21;
                                    }
                                }
                                bArr8 = bArr8;
                            }
                            i319++;
                            bArr8 = bArr8;
                        }
                        bArr8 = bArr8;
                        i315 = i315;
                        i314 = 4096;
                    }
                    boolean z4 = !(i315 != length5);
                    try {
                        bufferedInputStream4.close();
                    } catch (IOException unused6) {
                    }
                    if (z4) {
                        i20 = (i165 & (-261)) | (i15 & 260);
                        str5 = str34;
                    } else {
                        int i334 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        Object[] objArr54 = new Object[1];
                        a(((i334 | 593) << 1) - (i334 ^ 593), TextUtils.getTrimmedLength(str34) + 13, (char) (ViewConfiguration.getTapTimeout() >> 16), objArr54);
                        String str42 = (String) objArr54[0];
                        Object[] objArr55 = new Object[1];
                        a(606 - (~(-(-TextUtils.indexOf((CharSequence) str34, '0', 0, 0)))), 9 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (32209 - (~(-(-(ViewConfiguration.getMaximumFlingVelocity() >> 16))))), objArr55);
                        Object[] objArr56 = {str42, (String) objArr55[0]};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                            char c6 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                            int i335 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2384;
                            int i336 = 33 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            byte b24 = $$a[0];
                            byte b25 = (byte) (b24 - 1);
                            Object[] objArr57 = new Object[1];
                            c(b24, b25, b25, objArr57);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(c6, i335, i336, -1207062455, false, (String) objArr57[0], new Class[]{String.class, String.class});
                        }
                        long jLongValue7 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).invoke(null, objArr56)).longValue();
                        long j51 = 266278818;
                        long j52 = j51 ^ j;
                        long j53 = jLongValue7 ^ j;
                        str5 = str34;
                        long j54 = i165;
                        long j55 = (j40 * j51) + (j40 * jLongValue7) + ((((j52 | j53) ^ j) | ((j52 | j54) ^ j) | ((j53 | j54) ^ j)) * j42);
                        long j56 = jLongValue7 | ((j52 | (j54 ^ j)) ^ j);
                        long j57 = (j54 | j51) ^ j;
                        long j58 = j55 + ((j56 | j57) * j42) + (j49 * j57) + ((long) 1710764510);
                        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                        int i337 = ~startElapsedRealtime;
                        int i338 = ((int) (j58 >> 32)) & (1738041050 + (((~(1602589374 | i337)) | (-1607833535) | (~(1255151510 | i337))) * (-1136)) + (((~(1602589374 | startElapsedRealtime)) | (~(1255151510 | startElapsedRealtime)) | (~((-1249907351) | i337))) * (-568)) + (((~(startElapsedRealtime | 1607833534)) | (~(i337 | (-1255151511))) | (~((-1602589375) | i337))) * 568));
                        int iMaxMemory2 = (int) Runtime.getRuntime().maxMemory();
                        int i339 = ~((-1025745253) | (~iMaxMemory2));
                        i20 = (i338 | (((int) j58) & (((((1074792593 | i339) | (~(1025745252 | iMaxMemory2))) * (-338)) + 1065417159) + (((~(iMaxMemory2 | 2100537845)) | i339) * 338)))) != 0 ? (i165 & (-262)) | (i15 & 261) : i165;
                    }
                } catch (IOException unused7) {
                    if (bufferedInputStream4 != null) {
                        try {
                            bufferedInputStream4.close();
                        } catch (IOException unused8) {
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    bufferedInputStream3 = bufferedInputStream4;
                    if (bufferedInputStream3 != null) {
                        try {
                            bufferedInputStream3.close();
                        } catch (IOException unused9) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused10) {
                bufferedInputStream4 = null;
            } catch (Throwable th5) {
                th = th5;
                bufferedInputStream3 = null;
            }
        }
        int i340 = ((~i310) & i165) | (i310 & i15);
        int i341 = -i340;
        int i342 = ((i340 & i341) | (i340 ^ i341)) >> 31;
        int i343 = (i310 & i342) | (i20 & (~i342));
        if ((i2 & 8) == 0) {
            String str43 = str5;
            int offsetAfter = TextUtils.getOffsetAfter(str43, 0) + 615;
            int i344 = 41 - (~(-ImageFormat.getBitsPerPixel(0)));
            int i345 = -(ViewConfiguration.getTouchSlop() >> 8);
            int i346 = (i345 * TypedValues.PositionType.TYPE_PERCENT_WIDTH) - (-15281140);
            int i347 = (i345 ^ 30380) | (i345 & 30380);
            int i348 = -(-(i347 * (-502)));
            int i349 = (i346 & i348) + (i346 | i348);
            int i350 = ~((~i345) | (-30381));
            int i351 = ~i345;
            int i352 = ~((i351 ^ i15) | (i351 & i15));
            int i353 = ~(i347 | i165);
            int i354 = -(-(((i350 & i352) | (i350 ^ i352) | i353) * (-502)));
            int i355 = (i349 & i354) + (i354 | i349);
            int i356 = i351 | i15;
            int i357 = ~((i356 & 30380) | (i356 ^ 30380));
            int i358 = -(-(((i357 & i353) | (i357 ^ i353)) * TypedValues.PositionType.TYPE_DRAWPATH));
            Object[] objArr58 = new Object[1];
            a(offsetAfter, i344, (char) ((i355 & i358) + (i358 | i355)), objArr58);
            String str44 = (String) objArr58[0];
            int i359 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            int i360 = (i359 ^ 659) + ((i359 & 659) << 1);
            int i361 = -ExpandableListView.getPackedPositionChild(0L);
            int i362 = ~i361;
            int i363 = (i361 * (-380)) + 15280 + (((i165 ^ 40) | (i165 & 40) | i362) * (-381));
            int i364 = ~((i362 ^ (-41)) | (i362 & (-41)));
            int i365 = ~((i15 ^ 40) | (i15 & 40));
            int i366 = (i364 & i365) | (i364 ^ i365);
            int i367 = ~((i361 ^ 40) | (i361 & 40));
            int i368 = -(-(((i366 & i367) | (i366 ^ i367)) * 381));
            Object[] objArr59 = new Object[1];
            a(i360, (((i363 | i368) << 1) - (i363 ^ i368)) + ((~((~i361) | 40)) * 381), (char) (16819056 - (~Color.rgb(0, 0, 0))), objArr59);
            String str45 = (String) objArr59[0];
            int i369 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i370 = ((i369 | 699) << 1) - (i369 ^ 699);
            int i371 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
            Object[] objArr60 = new Object[1];
            a(i370, (i371 ^ 38) + ((i371 & 38) << 1), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr60);
            String[] strArr12 = {str44, str45, (String) objArr60[0]};
            int i372 = 0;
            while (true) {
                if (i372 >= 3) {
                    i83 = i343;
                    str6 = str43;
                    i22 = i165;
                    i84 = i22;
                    break;
                }
                Object[] objArr61 = {strArr12[i372]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                    char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) str43, '0'));
                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 993;
                    int iKeyCodeFromString2 = KeyEvent.keyCodeFromString(str43) + 8;
                    byte b26 = (byte) ($$a[0] - 1);
                    byte b27 = b26;
                    Object[] objArr62 = new Object[1];
                    c(b26, b27, b27, objArr62);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(cIndexOf, edgeSlop, iKeyCodeFromString2, 349342683, false, (String) objArr62[0], new Class[]{String.class});
                }
                long jLongValue8 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).invoke(null, objArr61)).longValue();
                long j59 = 829924273;
                String[] strArr13 = strArr12;
                str6 = str43;
                long j60 = 765;
                long j61 = j59 ^ j;
                long j62 = jLongValue8 ^ j;
                long j63 = j61 | j62;
                i83 = i343;
                long jNextInt = new Random().nextInt(459784447);
                long j64 = jNextInt ^ j;
                long j65 = (((long) (-1529)) * j59) + (((long) (-764)) * jLongValue8) + ((((j63 | j64) ^ j) | (((j61 | jLongValue8) | jNextInt) ^ j) | (((j62 | j59) | jNextInt) ^ j)) * j60) + (((long) 1530) * ((j63 ^ j) | ((j61 | j64) ^ j))) + (j60 * (((j61 | jNextInt) ^ j) | (((j62 | j64) | j59) ^ j))) + ((long) (-1677002878));
                i22 = i;
                int i373 = ((int) (j65 >> 32)) & (7412710 + (((~(1593180013 | i15)) | (~((-40227426) | i22))) * (-302)) + ((~(1593180013 | i22)) * (-604)) + (((~(1552952588 | i22)) | 75498752) * 302));
                int i374 = ((int) j65) & ((-635053948) + (((-1346895877) | i22) * (-627)) + (((~(1350117958 | i22)) | (-87108452)) * (-627)) + (((~((-1350117959) | i15)) | (~((-87108452) | i22))) * 627));
                if (((i373 & i374) | (i373 ^ i374)) != 0) {
                    i84 = i22 ^ (i372 + 280);
                    break;
                }
                int i375 = (i372 & 61) + (i372 | 61);
                i372 = ((i375 | (-60)) << 1) - (i375 ^ (-60));
                strArr12 = strArr13;
                i165 = i22;
                i343 = i83;
                str43 = str6;
            }
            int i376 = (~(i22 & i83)) & (i22 | i83);
            int i377 = -i376;
            int i378 = ((i376 & i377) | (i376 ^ i377)) >> 31;
            i343 = (i84 & (~i378)) | (i378 & i83);
        } else {
            i22 = i165;
            str6 = str5;
        }
        String[] strArr14 = new String[2];
        int i379 = -(-Color.argb(0, 0, 0, 0));
        int i380 = (i379 & 737) + (i379 | 737);
        int i381 = -ExpandableListView.getPackedPositionChild(0L);
        int i382 = (i381 ^ 40) + ((i381 & 40) << 1);
        int i383 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
        Object[] objArr63 = new Object[1];
        a(i380, i382, (char) (((i383 | 15152) << 1) - (i383 ^ 15152)), objArr63);
        strArr14[0] = (String) objArr63[0];
        int i384 = TuitionPaymentFragmentbindingInflater1;
        int i385 = ((i384 | 89) << 1) - (i384 ^ 89);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i385 % 128;
        if (i385 % 2 == 0) {
            size = 778 << View.MeasureSpec.getSize(0);
            tapTimeout = ViewConfiguration.getTapTimeout();
            i23 = 101;
            i24 = 121;
        } else {
            int i386 = -(-View.MeasureSpec.getSize(0));
            size = ((778 & i386) << 1) + (i386 ^ 778);
            tapTimeout = ViewConfiguration.getTapTimeout();
            i23 = 30;
            i24 = 16;
        }
        int i387 = -(Process.myPid() >> 22);
        Object[] objArr64 = new Object[1];
        a(size, i23 - (tapTimeout >> i24), (char) ((i387 & 52382) + (i387 | 52382)), objArr64);
        strArr14[1] = (String) objArr64[0];
        int i388 = 0;
        while (true) {
            if (i388 >= 2) {
                i25 = i343;
                i26 = i22;
                break;
            }
            Object[] objArr65 = {strArr14[i388]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                char bitsPerPixel3 = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                int defaultSize = View.getDefaultSize(0, 0) + 993;
                int mirror2 = AndroidCharacter.getMirror('0') - '(';
                byte b28 = (byte) ($$a[0] - 1);
                Object[] objArr66 = new Object[1];
                c((byte) 6, b28, b28, objArr66);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(bitsPerPixel3, defaultSize, mirror2, -545305915, false, (String) objArr66[0], new Class[]{String.class});
            }
            long jLongValue9 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).invoke(null, objArr65)).longValue();
            long j66 = -580518016;
            i25 = i343;
            int i389 = i388;
            long jUptimeMillis = (int) SystemClock.uptimeMillis();
            long j67 = (((long) 860) * j66) + (((long) (-858)) * jLongValue9) + (((long) (-859)) * (j66 | jUptimeMillis));
            long j68 = 859;
            long j69 = jUptimeMillis ^ j;
            long j70 = jLongValue9 ^ j;
            long j71 = j67 + ((((j69 | j66) ^ j) | ((((j66 ^ j) | j70) | jUptimeMillis) ^ j)) * j68) + (j68 * (((j70 | j69) ^ j) | ((j70 | j66) ^ j))) + ((long) 1200977300);
            int iMyPid = Process.myPid();
            int i390 = ((int) (j71 >> 32)) & ((-818751463) + (((~((~iMyPid) | 1374361656)) | (-1483379229)) * (-235)) + (((~(1374361656 | iMyPid)) | (-1483379229)) * (-470)) + (((~(iMyPid | (-134251013))) | 25233440) * 235));
            int i391 = ((int) j71) & (1153123995 + (((-357828950) | i15) * 1444) + (((~(1254152340 | i22)) | (-1607784918) | (~(1603588545 | i22))) * (-1444)) + 654463418);
            if (((i390 & i391) | (i390 ^ i391)) != 0) {
                int i392 = ((i389 | 288) << 1) - (i389 ^ 288);
                i26 = ((~i392) & i22) | (i392 & i15);
                break;
            }
            int i393 = (i389 ^ (-87)) + ((i389 & (-87)) << 1);
            i388 = (i393 | 88) + (i393 & 88);
            i343 = i25;
        }
        int i394 = (~(i22 & i25)) & (i22 | i25);
        int i395 = -i394;
        int i396 = ((i394 & i395) | (i394 ^ i395)) >> 31;
        int i397 = i26 & (~i396);
        int i398 = i25 & i396;
        int i399 = (i397 & i398) | (i397 ^ i398);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-555308653);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
            char packedPositionType2 = (char) ExpandableListView.getPackedPositionType(0L);
            int iBlue2 = Color.blue(0) + 3526;
            int i400 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 22;
            byte b29 = $$a[0];
            byte b30 = (byte) (b29 - 1);
            Object[] objArr67 = new Object[1];
            c(b29, b30, b30, objArr67);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(packedPositionType2, iBlue2, i400, 980946500, false, (String) objArr67[0], new Class[0]);
        }
        long jLongValue10 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).invoke(null, null)).longValue();
        long j72 = 1185612249;
        long j73 = jLongValue10 ^ j;
        int i401 = i15;
        long j74 = i22;
        long j75 = (j72 | j74) ^ j;
        long j76 = 407;
        long j77 = j74 ^ j;
        long j78 = j72 ^ j;
        long j79 = (j78 | jLongValue10) ^ j;
        long j80 = (((long) (-813)) * j72) + (((long) 408) * jLongValue10) + (((long) (-814)) * (((j73 | j72) ^ j) | j75)) + ((((j73 | j77) ^ j) | j79 | j75) * j76) + (j76 * (j79 | ((j78 | j74) ^ j) | ((jLongValue10 | j74) ^ j))) + ((long) (-1365934887));
        int i402 = ((int) (j80 >> 32)) & (291902504 + (((~((-1857592238) | i401)) | 420365826) * (-983)) + (((~(420365826 | i401)) | (-2143215536)) * 983));
        int i403 = ((int) j80) & (676651009 + (((~((-973851791) | i401)) | (-463374620)) * (-328)) + (((-463374620) | i22) * 164) + (((~(973851790 | i22)) | (-1000328608) | (~((-436897803) | i401))) * 164));
        if (((i402 & i403) | (i402 ^ i403)) != 1) {
            Object[] objArr68 = {1};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1331892133);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                str7 = str6;
                char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) str7, '0', 0) + 1);
                int i404 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2672;
                int iIndexOf6 = 15 - TextUtils.indexOf((CharSequence) str7, '0', 0);
                byte b31 = $$a[0];
                byte b32 = (byte) (b31 - 1);
                Object[] objArr69 = new Object[1];
                c(b31, b32, b32, objArr69);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(cIndexOf2, i404, iIndexOf6, -1409439630, false, (String) objArr69[0], new Class[]{Integer.TYPE});
            } else {
                str7 = str6;
            }
            long jLongValue11 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).invoke(null, objArr68)).longValue();
            long j81 = 1481962041;
            long j82 = 755;
            long j83 = j82 * j81;
            long j84 = j82;
            long j85 = -753;
            long j86 = j83 + (j85 * jLongValue11);
            long j87 = -754;
            long j88 = j81 ^ j;
            long j89 = j88 | jLongValue11;
            long j90 = j86 + (((j89 ^ j) | ((j88 | j74) ^ j) | ((jLongValue11 | j74) ^ j)) * j87) + ((((j89 | j74) ^ j) | ((jLongValue11 | (j77 | j81)) ^ j)) * j87);
            long j91 = 754;
            long j92 = j90 + ((j88 | j77) * j91) + ((long) 385736639);
            int i405 = ((int) (j92 >> 32)) & (((((~((-354571265) | i22)) | 1082655106) * 449) - 413157466) + ((1082655106 | (~((-354571265) | i401))) * 449));
            int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
            int i406 = (~((-505741362) | startUptimeMillis2)) | 203423776;
            int i407 = ~startUptimeMillis2;
            int i408 = ((int) j92) & ((-1222594065) + ((i406 | (~(i407 | (-1640650187)))) * 886) + (((~(i407 | 505741361)) | (-1942967772)) * (-1772)) + ((~(i407 | (-1942967772))) * 886));
            if (((i405 & i408) | (i405 ^ i408)) != 0) {
                int i409 = TuitionPaymentFragmentbindingInflater1;
                int i410 = (i409 & 3) + (i409 | 3);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i410 % 128;
                if (i410 % 2 == 0) {
                    i81 = ~(i22 & 19107);
                    i82 = i22 | 19107;
                } else {
                    i81 = ~(i22 & 220);
                    i82 = i22 | 220;
                }
                i27 = i81 & i82;
            } else {
                i27 = i22;
            }
            int i411 = ((~i399) & i22) | (i399 & i401);
            int i412 = TuitionPaymentFragmentbindingInflater1 + 37;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i412 % 128;
            if (i412 % 2 == 0) {
                int i413 = -i411;
                i28 = ((i411 & i413) | (i411 ^ i413)) >> 78;
            } else {
                int i414 = -i411;
                i28 = ((i411 & i414) | (i411 ^ i414)) >> 31;
            }
            int i415 = i27 & (~i28);
            int i416 = i399 & i28;
            int i417 = (i416 & i415) | (i415 ^ i416);
            int i418 = 369 - (~(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
            int maximumFlingVelocity2 = 23 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int fadingEdgeLength = ViewConfiguration.getFadingEdgeLength() >> 16;
            Object[] objArr70 = new Object[1];
            a(i418, maximumFlingVelocity2, (char) ((fadingEdgeLength ^ 41110) + ((41110 & fadingEdgeLength) << 1)), objArr70);
            Object[] objArr71 = {(String) objArr70[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                char c7 = (char) (33603 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                int fadingEdgeLength2 = 3085 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                int i419 = 27 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                byte b33 = $$a[0];
                byte b34 = (byte) (b33 - 1);
                Object[] objArr72 = new Object[1];
                c(b33, b34, b34, objArr72);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(c7, fadingEdgeLength2, i419, 1411172903, false, (String) objArr72[0], new Class[]{String.class});
            }
            Object objInvoke2 = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).invoke(null, objArr71);
            try {
                try {
                    if (objInvoke2 != null) {
                        Object[] objArr73 = {objInvoke2, 42};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                            char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                            int iKeyCodeFromString3 = KeyEvent.keyCodeFromString(str7) + 3393;
                            int absoluteGravity3 = 9 - Gravity.getAbsoluteGravity(0, 0);
                            byte b35 = $$a[0];
                            byte b36 = (byte) (b35 - 1);
                            Object[] objArr74 = new Object[1];
                            c(b35, b36, b36, objArr74);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(cMakeMeasureSpec, iKeyCodeFromString3, absoluteGravity3, 1203525406, false, (String) objArr74[0], new Class[]{String.class, Integer.TYPE});
                        }
                        long jLongValue12 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).invoke(null, objArr73)).longValue();
                        long j93 = 1691797639;
                        j2 = j74;
                        long j94 = (((long) (-464)) * j93) + (((long) (-929)) * jLongValue12);
                        long j95 = j93 ^ j;
                        str8 = str7;
                        long jMyPid = Process.myPid();
                        long j96 = jLongValue12 | jMyPid;
                        long j97 = j94 + (((long) (-465)) * (j95 | (j96 ^ j))) + (((long) 930) * (jLongValue12 | ((jMyPid | j95) ^ j))) + (((long) 465) * (j96 | j95)) + ((long) (-1693867516));
                        int i420 = (~((-456167463) | i22)) | 439386116;
                        int i421 = ((int) (j97 >> 32)) & (1537498186 + (i420 * 992) + ((i420 | (~(997840294 | i401))) * (-496)) + ((981058948 | i22) * 496));
                        int startUptimeMillis3 = (int) Process.getStartUptimeMillis();
                        int i422 = ((int) j97) & ((((~((~startUptimeMillis3) | (-297474))) * 130) - 9090133) + (((~(startUptimeMillis3 | (-297474))) | 1409359892) * 130));
                        if (((i421 & i422) | (i421 ^ i422)) == 1986687685) {
                            str9 = str8;
                            strArr2 = null;
                            i29 = 1;
                        }
                        int i423 = -(-ExpandableListView.getPackedPositionChild(0L));
                        int i424 = (i423 ^ 890) + ((i423 & 890) << i29);
                        int i425 = -(Process.myTid() >> 22);
                        int i426 = i425 * 755;
                        int i427 = (i426 ^ (-12048)) + ((i426 & (-12048)) << 1);
                        int i428 = (~i425) | 16;
                        int i429 = ~i428;
                        int i430 = ~i425;
                        int i431 = ~((i430 ^ i22) | (i430 & i22));
                        int i432 = (i429 & i431) | (i429 ^ i431);
                        int i433 = ~((i22 ^ 16) | (i22 & 16));
                        int i434 = (i427 - (~(((i432 & i433) | (i432 ^ i433)) * (-754)))) - 1;
                        int i435 = ~((i428 & i22) | (i428 ^ i22));
                        i31 = ~i22;
                        int i436 = (i425 & i31) | (i31 ^ i425);
                        int i437 = ~((i436 & 16) | (i436 ^ 16));
                        int i438 = ((i437 & i435) | (i435 ^ i437)) * (-754);
                        int i439 = (i434 & i438) + (i438 | i434);
                        int i440 = ((i430 ^ i401) | (i430 & i401)) * 754;
                        Object[] objArr75 = new Object[1];
                        a(i424, (i439 ^ i440) + ((i440 & i439) << 1), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), objArr75);
                        Object[] objArr76 = {(String) objArr75[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char c8 = (char) (33602 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                            int iIndexOf7 = 3085 - TextUtils.indexOf(str9, str9, 0);
                            int iMyPid2 = 26 - (Process.myPid() >> 22);
                            byte b37 = $$a[0];
                            byte b38 = (byte) (b37 - 1);
                            Object[] objArr77 = new Object[1];
                            c(b37, b38, b38, objArr77);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c8, iIndexOf7, iMyPid2, 1411172903, false, (String) objArr77[0], new Class[]{String.class});
                        }
                        objInvoke = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr76);
                        if (objInvoke == null) {
                            i32 = 0;
                        } else {
                            Object[] objArr78 = {objInvoke, 42};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char absoluteGravity4 = (char) Gravity.getAbsoluteGravity(0, 0);
                                int doubleTapTimeout = 3393 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                int threadPriority3 = ((Process.getThreadPriority(0) + 20) >> 6) + 9;
                                byte b39 = $$a[0];
                                byte b40 = (byte) (b39 - 1);
                                Object[] objArr79 = new Object[1];
                                c(b39, b40, b40, objArr79);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(absoluteGravity4, doubleTapTimeout, threadPriority3, 1203525406, false, (String) objArr79[0], new Class[]{String.class, Integer.TYPE});
                            }
                            long jLongValue13 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr78)).longValue();
                            long j98 = 318295938;
                            long j99 = 216;
                            long jFreeMemory3 = (int) Runtime.getRuntime().freeMemory();
                            long j100 = (((long) 217) * j98) + (((long) (-215)) * jLongValue13) + (((j98 | jFreeMemory3) ^ j) * j99);
                            long j101 = jFreeMemory3 ^ j;
                            long j102 = j100 + (((long) (-216)) * (j98 | (jLongValue13 ^ j) | j101)) + (j99 * (((j101 | j98) ^ j) | jLongValue13)) + ((long) (-320365815));
                            int iUptimeMillis = (int) SystemClock.uptimeMillis();
                            int i441 = ((int) (j102 >> 32)) & (896659338 + (((~((-1685449098) | iUptimeMillis)) | 1172291787) * (-465)) + (((-1685449098) | (~(1172291787 | iUptimeMillis))) * 930) + ((iUptimeMillis | (-538978561)) * 465));
                            int startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
                            int i442 = ((int) j102) & (822761596 + (((-16843026) | startElapsedRealtime2) * (-381)) + (((~((~startElapsedRealtime2) | (-185821980))) | (-1099268502)) * 381) + 2122225229);
                            i32 = (i441 & i442) | (i441 ^ i442);
                        }
                        if (i32 != 1986687685 || i32 == -1514516938) {
                            i33 = i417;
                        } else {
                            int i443 = 19;
                            int i444 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            int i445 = ((i444 | 1607) << 1) - (i444 ^ 1607);
                            int i446 = -(ViewConfiguration.getScrollBarSize() >> 8);
                            int i447 = (i446 & 14) + (i446 | 14);
                            int i448 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                            Object[] objArr80 = new Object[1];
                            a(i445, i447, (char) (((i448 | 41072) << 1) - (i448 ^ 41072)), objArr80);
                            int i449 = -(KeyEvent.getMaxKeyCode() >> 16);
                            int i450 = ((i449 | 1622) << 1) - (i449 ^ 1622);
                            int i451 = -(-ImageFormat.getBitsPerPixel(0));
                            int i452 = ((i451 | 27) << 1) - (i451 ^ 27);
                            int i453 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                            Object[] objArr81 = new Object[1];
                            a(i450, i452, (char) ((i453 & 13401) + (i453 | 13401)), objArr81);
                            int iRgb2 = Color.rgb(0, 0, 0) + 16778864;
                            int i454 = -TextUtils.getOffsetAfter(str9, 0);
                            Object[] objArr82 = new Object[1];
                            a(iRgb2, ((i454 | 17) << 1) - (i454 ^ 17), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), objArr82);
                            int iRed2 = Color.red(0) + 1665;
                            int i455 = 16 - (~(-(Process.myPid() >> 22)));
                            int i456 = -(-(Process.myPid() >> 22));
                            Object[] objArr83 = new Object[1];
                            a(iRed2, i455, (char) ((i456 ^ 43801) + ((i456 & 43801) << 1)), objArr83);
                            int deadChar = 1682 - KeyEvent.getDeadChar(0, 0);
                            int edgeSlop2 = (ViewConfiguration.getEdgeSlop() >> 16) + 15;
                            int i457 = -(-(Process.myPid() >> 22));
                            Object[] objArr84 = new Object[1];
                            a(deadChar, edgeSlop2, (char) ((i457 & 34400) + (i457 | 34400)), objArr84);
                            int i458 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            int i459 = i458 * 221;
                            int i460 = (i459 ^ (-371424)) + ((i459 & (-371424)) << 1);
                            int i461 = ~((~i458) | (-1697));
                            int i462 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                            int i463 = (i462 ^ i458) | (i462 & i458);
                            int i464 = ~((i463 & 1696) | (i463 ^ 1696));
                            int i465 = (i460 - (~(-(-(((i461 & i464) | (i461 ^ i464)) * 220))))) - 1;
                            int i466 = ~((i462 ^ 1696) | (i462 & 1696));
                            int i467 = i465 + (((i466 & i458) | (i458 ^ i466)) * (-440));
                            int i468 = (i458 & 1696) | (i458 ^ 1696);
                            Object[] objArr85 = new Object[1];
                            a(i467 + (((i468 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i468 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5)) * 220), 36 - (~(-(-(ViewConfiguration.getScrollBarSize() >> 8)))), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr85);
                            Object[] objArr86 = new Object[1];
                            a(1734 - ExpandableListView.getPackedPositionType(0L), 11 - (~(-TextUtils.indexOf(str9, str9, 0))), (char) Drawable.resolveOpacity(0, 0), objArr86);
                            int i469 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            Object[] objArr87 = new Object[1];
                            a((i469 ^ 1745) + ((i469 & 1745) << 1), 12 - (~(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), objArr87);
                            int i470 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            int i471 = ((i470 | 1759) << 1) - (i470 ^ 1759);
                            int scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                            int i472 = ~scrollBarFadeDuration;
                            int i473 = (i472 & (-23)) | (i472 ^ (-23));
                            int i474 = (-23) | i401;
                            int i475 = ((((scrollBarFadeDuration * 51) - 1078) + (((scrollBarFadeDuration ^ i22) | (scrollBarFadeDuration & i22)) * (-50))) - (~(-(-(((~((i473 & i22) | (i473 ^ i22))) | (~((i474 ^ scrollBarFadeDuration) | (i474 & scrollBarFadeDuration)))) * 50))))) - 1;
                            int i476 = ~i474;
                            int i477 = ~(((-23) & scrollBarFadeDuration) | ((-23) ^ scrollBarFadeDuration));
                            int i478 = (i476 & i477) | (i476 ^ i477);
                            int i479 = ~(i401 | scrollBarFadeDuration);
                            int i480 = i475 + (((i479 & i478) | (i478 ^ i479)) * 50);
                            int i481 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                            Object[] objArr88 = new Object[1];
                            a(i471, i480, (char) ((i481 & 56643) + (i481 | 56643)), objArr88);
                            int i482 = -(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                            Object[] objArr89 = new Object[1];
                            a(((i482 | 1781) << 1) - (i482 ^ 1781), 31 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) ((-1) - TextUtils.lastIndexOf(str9, '0', 0)), objArr89);
                            Object[] objArr90 = new Object[1];
                            a(Color.blue(0) + 1812, 11 - (~(-(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))))), (char) TextUtils.getTrimmedLength(str9), objArr90);
                            int i483 = -TextUtils.lastIndexOf(str9, '0', 0, 0);
                            int i484 = ((i483 | 1823) << 1) - (i483 ^ 1823);
                            int i485 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                            Object[] objArr91 = new Object[1];
                            a(i484, (i485 ^ 12) + ((i485 & 12) << 1), (char) (Color.alpha(0) + 5127), objArr91);
                            Object[] objArr92 = new Object[1];
                            a(1835 - (~(-(ViewConfiguration.getLongPressTimeout() >> 16))), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12, (char) TextUtils.indexOf(str9, str9, 0), objArr92);
                            int i486 = -(-(ViewConfiguration.getJumpTapTimeout() >> 16));
                            int i487 = (i486 & 1848) + (i486 | 1848);
                            long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
                            int i488 = TuitionPaymentFragmentbindingInflater1 + 123;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i488 % 128;
                            int i489 = i488 % 2;
                            int i490 = -(-(jCurrentThreadTimeMillis > (-1L) ? 1 : (jCurrentThreadTimeMillis == (-1L) ? 0 : -1)));
                            int i491 = (11 ^ i490) + ((i490 & 11) << 1);
                            int i492 = -(-(ViewConfiguration.getKeyRepeatTimeout() >> 16));
                            Object[] objArr93 = new Object[1];
                            a(i487, i491, (char) ((i492 & 55282) + (i492 | 55282)), objArr93);
                            int iIndexOf8 = TextUtils.indexOf(str9, str9, 0) + 1860;
                            int i493 = -TextUtils.indexOf(str9, str9, 0, 0);
                            Object[] objArr94 = new Object[1];
                            a(iIndexOf8, (i493 ^ 12) + ((i493 & 12) << 1), (char) (16715 - (~TextUtils.lastIndexOf(str9, '0', 0))), objArr94);
                            Object[] objArr95 = new Object[1];
                            a(1872 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 14 - (~(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (char) Drawable.resolveOpacity(0, 0), objArr95);
                            Object[] objArr96 = new Object[1];
                            a(1886 - (~MotionEvent.axisFromString(str9)), View.resolveSizeAndState(0, 0, 0) + 12, (char) ((-(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))) - 1), objArr96);
                            int i494 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
                            int i495 = (i494 ^ 1898) + ((i494 & 1898) << 1);
                            int doubleTapTimeout2 = 24 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            int i496 = -TextUtils.indexOf((CharSequence) str9, '0', 0, 0);
                            Object[] objArr97 = new Object[1];
                            a(i495, doubleTapTimeout2, (char) ((i496 & 19726) + (i496 | 19726)), objArr97);
                            int i497 = 1921 - (~(-View.resolveSize(0, 0)));
                            int i498 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 27;
                            int i499 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                            Object[] objArr98 = new Object[1];
                            a(i497, i498, (char) (((i499 | 38669) << 1) - (i499 ^ 38669)), objArr98);
                            String[] strArr15 = {(String) objArr80[0], (String) objArr81[0], (String) objArr82[0], (String) objArr83[0], (String) objArr84[0], (String) objArr85[0], (String) objArr86[0], (String) objArr87[0], (String) objArr88[0], (String) objArr89[0], (String) objArr90[0], (String) objArr91[0], (String) objArr92[0], (String) objArr93[0], (String) objArr94[0], (String) objArr95[0], (String) objArr96[0], (String) objArr97[0], (String) objArr98[0]};
                            int i500 = 0;
                            while (true) {
                                if (i500 >= i443) {
                                    i80 = -1;
                                    break;
                                }
                                String str46 = strArr15[i500];
                                Object[] objArr99 = {str46};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                                    char scrollDefaultDelay2 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                                    int i501 = 993 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                    int iLastIndexOf4 = TextUtils.lastIndexOf(str9, '0', 0) + 9;
                                    byte b41 = (byte) ($$a[0] - 1);
                                    Object[] objArr100 = new Object[1];
                                    c((byte) 6, b41, b41, objArr100);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(scrollDefaultDelay2, i501, iLastIndexOf4, -545305915, false, (String) objArr100[0], new Class[]{String.class});
                                }
                                long jLongValue14 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).invoke(null, objArr99)).longValue();
                                long j103 = -472536375;
                                long j104 = -301;
                                String[] strArr16 = strArr15;
                                long jNextInt2 = new Random().nextInt();
                                long j105 = (((long) (-300)) * j103) + (((long) 302) * jLongValue14) + ((((j103 | jLongValue14) | jNextInt2) ^ j) * j104);
                                long j106 = jLongValue14 ^ j;
                                long j107 = j105 + (j104 * (((j106 | jNextInt2) ^ j) | (((jNextInt2 ^ j) | j103) ^ j))) + (((long) 301) * (((jNextInt2 | (j103 ^ j)) ^ j) | j106)) + ((long) 1092995659);
                                int i502 = ((int) (j107 >> 32)) & (1972008040 + (((~((-1082488188) | i401)) | (~((-354738224) | i401))) * (-867)) + (((~((-1082488188) | i22)) | 286763 | (~((-354738224) | i22))) * (-1734)) + (((~((-286764) | i401)) | (~((-1082201425) | i22)) | (~((-354451461) | i22))) * 867));
                                int i503 = ((int) j107) & ((-2004238869) + (((~(1331672447 | i22)) | (~(i401 | (-105553963)))) * (-318)) + (((~((-1197191296) | i22)) | 1091637333) * (-318)) + (((~(1197191295 | i22)) | 240035114) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
                                if (((i502 & i503) | (i502 ^ i503)) == 0) {
                                    int windowTouchSlop2 = ViewConfiguration.getWindowTouchSlop() >> 8;
                                    int i504 = (windowTouchSlop2 & 1872) + (windowTouchSlop2 | 1872);
                                    int i505 = -TextUtils.getOffsetAfter(str9, 0);
                                    Object[] objArr101 = new Object[1];
                                    a(i504, ((i505 | 14) << 1) - (i505 ^ 14), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr101);
                                    if (str46.equals((String) objArr101[0])) {
                                        Object[] objArr102 = {str46};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                                            char maximumFlingVelocity3 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                            int i506 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 992;
                                            int iCombineMeasuredStates = 8 - View.combineMeasuredStates(0, 0);
                                            byte b42 = (byte) ($$a[0] - 1);
                                            byte b43 = b42;
                                            Object[] objArr103 = new Object[1];
                                            c(b42, b43, b43, objArr103);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(maximumFlingVelocity3, i506, iCombineMeasuredStates, 349342683, false, (String) objArr103[0], new Class[]{String.class});
                                        }
                                        long jLongValue15 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).invoke(null, objArr102)).longValue();
                                        long j108 = 248097020;
                                        long j109 = j108 ^ j;
                                        long j110 = j109 | jLongValue15;
                                        long j111 = (j84 * j108) + (j85 * jLongValue15) + (((j110 ^ j) | ((j109 | j2) ^ j) | ((jLongValue15 | j2) ^ j)) * j87) + ((((jLongValue15 | (j77 | j108)) ^ j) | ((j110 | j2) ^ j)) * j87) + ((j109 | j77) * j91) + ((long) (-1095175625));
                                        int i507 = ((int) (j111 >> 32)) & (484747429 + (((~((-309198222) | i401)) | 1128028189) * (-602)) + (((~((-309198222) | i22)) | 36460557 | (~(i401 | 1400765853))) * (-301)) + ((~(i401 | 1128028189)) * 301));
                                        int i508 = ((int) j111) & (2088992125 + (((-94716326) | i22) * 376) + (((~(i401 | 1383937529)) | (-1476228606)) * (-376)) + (((~((-1383937530) | i22)) | 1473803356) * 376));
                                        if (((i507 & i508) | (i507 ^ i508)) != 0) {
                                        }
                                    }
                                    i500 = (i500 & 1) + (i500 | 1);
                                    strArr15 = strArr16;
                                    i443 = 19;
                                }
                                i80 = i500;
                                break;
                            }
                            int i509 = (i80 & 130) + (i80 | 130);
                            int i510 = (i509 & i401) | ((~i509) & i22);
                            int i511 = ~i80;
                            int i512 = -i511;
                            int i513 = ((i511 & i512) | (i511 ^ i512)) >> 31;
                            int i514 = (~i513) & i22;
                            int i515 = i510 & i513;
                            int i516 = (i515 & i514) | (i514 ^ i515);
                            int i517 = (~(i22 & i417)) & (i22 | i417);
                            int i518 = -i517;
                            int i519 = ((i517 & i518) | (i517 ^ i518)) >> 31;
                            int i520 = i516 & (~i519);
                            int i521 = i417 & i519;
                            i33 = (i520 & i521) | (i520 ^ i521);
                        }
                        int i522 = -(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        int i523 = ((i522 | 1950) << 1) - (i522 ^ 1950);
                        int i524 = -TextUtils.getOffsetAfter(str9, 0);
                        Object[] objArr104 = new Object[1];
                        a(i523, (i524 & 13) + (i524 | 13), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), objArr104);
                        String str47 = (String) objArr104[0];
                        int i525 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        Object[] objArr105 = new Object[1];
                        a(((i525 | 1963) << 1) - (i525 ^ 1963), 3 - (~(-TextUtils.indexOf((CharSequence) str9, '0'))), (char) (MotionEvent.axisFromString(str9) + 3193), objArr105);
                        String[] strArr17 = {str47, (String) objArr105[0]};
                        int i526 = 1967 - (~(-(-(ViewConfiguration.getScrollBarSize() >> 8))));
                        int i527 = -(ViewConfiguration.getEdgeSlop() >> 16);
                        Object[] objArr106 = new Object[1];
                        a(i526, (i527 & 15) + (i527 | 15), (char) ((-16743304) - Color.rgb(0, 0, 0)), objArr106);
                        String str48 = (String) objArr106[0];
                        int i528 = -ExpandableListView.getPackedPositionType(0L);
                        int i529 = ((i528 | 1983) << 1) - (i528 ^ 1983);
                        int i530 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 20;
                        int gidForName2 = Process.getGidForName(str9);
                        Object[] objArr107 = new Object[1];
                        a(i529, i530, (char) (((gidForName2 | 1) << 1) - (gidForName2 ^ 1)), objArr107);
                        String str49 = (String) objArr107[0];
                        int i531 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        int i532 = ((i531 | 2001) << 1) - (i531 ^ 2001);
                        int windowTouchSlop3 = ViewConfiguration.getWindowTouchSlop() >> 8;
                        int i533 = windowTouchSlop3 * (-391);
                        int i534 = ((i533 | (-2730)) << 1) - (i533 ^ (-2730));
                        int i535 = ~((-15) | windowTouchSlop3);
                        int i536 = (i22 ^ 14) | (i22 & 14);
                        int i537 = ~i536;
                        int i538 = ((i535 & i537) | (i535 ^ i537)) * (-196);
                        int i539 = (((i534 | i538) << 1) - (i538 ^ i534)) + (((windowTouchSlop3 ^ 14) | (windowTouchSlop3 & 14)) * 392);
                        int i540 = ~windowTouchSlop3;
                        int i541 = ~((i540 & (-15)) | (i540 ^ (-15)));
                        int i542 = ~i536;
                        Object[] objArr108 = new Object[1];
                        a(i532, (i539 - (~(((i541 & i542) | (i541 ^ i542)) * 196))) - 1, (char) View.MeasureSpec.getMode(0), objArr108);
                        String[] strArr18 = {str48, str49, (String) objArr108[0]};
                        int i543 = -Process.getGidForName(str9);
                        int i544 = (i543 ^ 2015) + ((i543 & 2015) << 1);
                        int i545 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        Object[] objArr109 = new Object[1];
                        a(i544, (i545 ^ 20) + ((i545 & 20) << 1), (char) (34860 - TextUtils.indexOf((CharSequence) str9, '0')), objArr109);
                        String str50 = (String) objArr109[0];
                        int i546 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
                        Object[] objArr110 = new Object[1];
                        a(((i546 | 2037) << 1) - (i546 ^ 2037), 10 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr110);
                        String[] strArr19 = {str50, (String) objArr110[0]};
                        int i547 = -TextUtils.lastIndexOf(str9, '0');
                        Object[] objArr111 = new Object[1];
                        a((i547 ^ 2046) + ((i547 & 2046) << 1), 58 - (~(-AndroidCharacter.getMirror('0'))), (char) (2012 - (~(-TextUtils.getOffsetBefore(str9, 0)))), objArr111);
                        String str51 = (String) objArr111[0];
                        Object[] objArr112 = new Object[1];
                        a(585 - (~(-(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))))), (ViewConfiguration.getEdgeSlop() >> 16) + 6, (char) (52750 - (~(-(ViewConfiguration.getScrollBarSize() >> 8)))), objArr112);
                        String[] strArr20 = {str51, (String) objArr112[0]};
                        int i548 = -Drawable.resolveOpacity(0, 0);
                        int i549 = ((i548 | 2058) << 1) - (i548 ^ 2058);
                        int scrollBarSize3 = ViewConfiguration.getScrollBarSize() >> 8;
                        Object[] objArr113 = new Object[1];
                        a(i549, (scrollBarSize3 ^ 28) + ((scrollBarSize3 & 28) << 1), (char) (13899 - (~(-(-KeyEvent.normalizeMetaState(0))))), objArr113);
                        String str52 = (String) objArr113[0];
                        int i550 = -AndroidCharacter.getMirror('0');
                        int i551 = (i550 ^ 2085) + ((i550 & 2085) << 1);
                        int i552 = -TextUtils.getTrimmedLength(str9);
                        Object[] objArr114 = new Object[1];
                        a(i551, ((i552 | 10) << 1) - (i552 ^ 10), (char) ExpandableListView.getPackedPositionType(0L), objArr114);
                        c3 = 0;
                        strArr3 = new String[][]{strArr17, strArr18, strArr19, strArr20, new String[]{str52, (String) objArr114[0]}};
                        i34 = 0;
                        i35 = -1;
                        loop7: while (true) {
                            if (i34 < 5) {
                                i36 = i33;
                                str10 = str9;
                                i37 = i31;
                                i38 = i22;
                                break;
                            }
                            String[] strArr21 = strArr3[i34];
                            str13 = strArr21[c3];
                            i62 = 1;
                            strArr4 = (String[]) Arrays.copyOfRange(strArr21, 1, strArr21.length);
                            length2 = strArr4.length;
                            i63 = 0;
                            while (true) {
                                if (i63 < length2) {
                                    i35 = ((i35 ^ 117) + ((i35 & 117) << i62)) - 116;
                                    bytes2 = strArr4[i63].getBytes();
                                    length3 = bytes2.length;
                                    if (length3 == 0) {
                                        int i553 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        int i554 = ((i553 | 5) << i62) - (i553 ^ 5);
                                        TuitionPaymentFragmentbindingInflater1 = i554 % 128;
                                        int i555 = i554 % 2;
                                        i36 = i33;
                                        str10 = str9;
                                        i37 = i31;
                                    } else {
                                        try {
                                            bufferedInputStream7 = new BufferedInputStream(new FileInputStream(str13));
                                            i67 = 4096;
                                            try {
                                                try {
                                                    bArr4 = new byte[4096];
                                                    strArr5 = strArr3;
                                                    strArr6 = strArr4;
                                                    str14 = str13;
                                                    i68 = 0;
                                                    i69 = 0;
                                                    while (true) {
                                                        try {
                                                            i70 = bufferedInputStream7.read(bArr4, i69, i67);
                                                            if (i70 > 0) {
                                                                break;
                                                            }
                                                            int i556 = TuitionPaymentFragmentbindingInflater1;
                                                            int i557 = (i556 ^ 109) + ((i556 & 109) << 1);
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i557 % 128;
                                                            int i558 = i557 % 2;
                                                            i71 = 0;
                                                            while (i68 < length3 && i71 < i70) {
                                                                int i559 = i70;
                                                                if (bArr4[i71] == bytes2[i68]) {
                                                                    i68++;
                                                                } else {
                                                                    if (i68 != 0) {
                                                                        i72 = i68 - 1;
                                                                        while (true) {
                                                                            if (i72 > 0) {
                                                                                i73 = i33;
                                                                                i74 = i34;
                                                                                i75 = length2;
                                                                                str15 = str9;
                                                                                i76 = i63;
                                                                                bArr5 = bArr4;
                                                                                i77 = i31;
                                                                                i68 = 0;
                                                                                break;
                                                                            }
                                                                            i78 = 0;
                                                                            while (true) {
                                                                                if (i78 < i72) {
                                                                                    i73 = i33;
                                                                                    i74 = i34;
                                                                                    i75 = length2;
                                                                                    str15 = str9;
                                                                                    i76 = i63;
                                                                                    bArr5 = bArr4;
                                                                                    i77 = i31;
                                                                                    i68 = i72;
                                                                                    break;
                                                                                }
                                                                                i65 = length2;
                                                                                try {
                                                                                    b3 = bytes2[i78];
                                                                                    bArr6 = bArr4;
                                                                                    int i560 = -i72;
                                                                                    i37 = i31;
                                                                                    try {
                                                                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                                                                        str10 = str9;
                                                                                        int i561 = i560 * (-496);
                                                                                        i36 = i33;
                                                                                        int i562 = -(-(i68 * (-496)));
                                                                                        int i563 = (i561 ^ i562) + ((i562 & i561) << 1);
                                                                                        int i564 = ~i560;
                                                                                        int i565 = ~i68;
                                                                                        i64 = i34;
                                                                                        int i566 = (i563 - (~(-(-((~(i564 | i565)) * 497))))) - 1;
                                                                                        int i567 = ~((i564 ^ i565) | (i564 & i565) | iTuitionPaymentFragmentspecialinlinedviewModeldefault6);
                                                                                        i66 = i63;
                                                                                        int i568 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                                                                        int i569 = (i565 ^ i568) | (i565 & i568);
                                                                                        int i570 = (i566 - (~(-(-((i567 | (~((i569 & i560) | (i569 ^ i560)))) * 497))))) - 1;
                                                                                        int i571 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                                                                        int i572 = ~((i571 & i564) | (i564 ^ i571));
                                                                                        int i573 = ~(i564 | i68);
                                                                                        int i574 = (i573 & i572) | (i572 ^ i573);
                                                                                        int i575 = ~i68;
                                                                                        int i576 = ~((i575 & i560) | (i575 ^ i560) | iTuitionPaymentFragmentspecialinlinedviewModeldefault6);
                                                                                        i79 = i570 + (((i574 & i576) | (i574 ^ i576)) * 497);
                                                                                        try {
                                                                                            if (b3 != bytes2[((i79 | i78) << 1) - (i79 ^ i78)]) {
                                                                                                break;
                                                                                            }
                                                                                            int i577 = (i78 ^ 127) + ((i78 & 127) << 1);
                                                                                            i78 = ((i577 | (-126)) << 1) - (i577 ^ (-126));
                                                                                            length2 = i65;
                                                                                            bArr4 = bArr6;
                                                                                            i31 = i37;
                                                                                            i33 = i36;
                                                                                            str9 = str10;
                                                                                            i34 = i64;
                                                                                            i63 = i66;
                                                                                        } catch (IOException unused11) {
                                                                                        }
                                                                                    } catch (IOException unused12) {
                                                                                        i36 = i33;
                                                                                        i64 = i34;
                                                                                        str10 = str9;
                                                                                        i66 = i63;
                                                                                    }
                                                                                } catch (IOException unused13) {
                                                                                    i36 = i33;
                                                                                    i64 = i34;
                                                                                    str10 = str9;
                                                                                    i66 = i63;
                                                                                    i37 = i31;
                                                                                }
                                                                            }
                                                                            i72 = (-2) - (~i72);
                                                                            length2 = i65;
                                                                            bArr4 = bArr6;
                                                                            i31 = i37;
                                                                            i33 = i36;
                                                                            str9 = str10;
                                                                            i34 = i64;
                                                                            i63 = i66;
                                                                        }
                                                                    }
                                                                    i70 = i559;
                                                                    length2 = i75;
                                                                    bArr4 = bArr5;
                                                                    i31 = i77;
                                                                    i33 = i73;
                                                                    str9 = str15;
                                                                    i34 = i74;
                                                                    i63 = i76;
                                                                }
                                                                i73 = i33;
                                                                i74 = i34;
                                                                i75 = length2;
                                                                str15 = str9;
                                                                i76 = i63;
                                                                bArr5 = bArr4;
                                                                i77 = i31;
                                                                i71 = (i71 | 1) + (i71 & 1);
                                                                i70 = i559;
                                                                length2 = i75;
                                                                bArr4 = bArr5;
                                                                i31 = i77;
                                                                i33 = i73;
                                                                str9 = str15;
                                                                i34 = i74;
                                                                i63 = i76;
                                                            }
                                                            length2 = length2;
                                                            bArr4 = bArr4;
                                                            i31 = i31;
                                                            i33 = i33;
                                                            str9 = str9;
                                                            i34 = i34;
                                                            i63 = i63;
                                                            i69 = 0;
                                                            i67 = 4096;
                                                        } catch (IOException unused14) {
                                                            i36 = i33;
                                                            i64 = i34;
                                                            i65 = length2;
                                                        }
                                                    }
                                                    i36 = i33;
                                                    i64 = i34;
                                                    i65 = length2;
                                                    str10 = str9;
                                                    i66 = i63;
                                                    i37 = i31;
                                                    if (i68 == length3) {
                                                        z3 = true;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                    try {
                                                        bufferedInputStream7.close();
                                                    } catch (IOException unused15) {
                                                    }
                                                    if (z3) {
                                                        i63 = (i66 ^ 1) + ((i66 & 1) << 1);
                                                        strArr3 = strArr5;
                                                        strArr4 = strArr6;
                                                        str13 = str14;
                                                        length2 = i65;
                                                        i31 = i37;
                                                        i33 = i36;
                                                        str9 = str10;
                                                        i34 = i64;
                                                        i62 = 1;
                                                    }
                                                } catch (IOException unused16) {
                                                    i36 = i33;
                                                    strArr5 = strArr3;
                                                    i64 = i34;
                                                    strArr6 = strArr4;
                                                    str14 = str13;
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                bufferedInputStream6 = bufferedInputStream7;
                                                if (bufferedInputStream6 != null) {
                                                    try {
                                                        bufferedInputStream6.close();
                                                    } catch (IOException unused17) {
                                                    }
                                                }
                                                throw th;
                                            }
                                        } catch (IOException unused18) {
                                            i36 = i33;
                                            strArr5 = strArr3;
                                            i64 = i34;
                                            strArr6 = strArr4;
                                            str14 = str13;
                                            i65 = length2;
                                            str10 = str9;
                                            i66 = i63;
                                            i37 = i31;
                                            bufferedInputStream7 = null;
                                        } catch (Throwable th7) {
                                            th = th7;
                                            bufferedInputStream6 = null;
                                        }
                                    }
                                    i38 = ((i35 ^ 170) + ((i35 & 170) << 1)) ^ i22;
                                    break loop7;
                                }
                                i34++;
                                i33 = i33;
                                c3 = 0;
                            }
                        }
                        int i578 = (~(i22 & i36)) & (i22 | i36);
                        int i579 = -i578;
                        int i580 = ((i578 & i579) | (i578 ^ i579)) >> 31;
                        int i581 = i38 & (~i580);
                        int i582 = i36 & i580;
                        int i583 = (i581 ^ i582) | (i581 & i582);
                        int i584 = -ExpandableListView.getPackedPositionChild(0L);
                        i40 = ((i584 | 2085) << 1) - (i584 ^ 2085);
                        i41 = 12 - (~(-(ViewConfiguration.getKeyRepeatTimeout() >> 16)));
                        int i585 = -(-(((~((i401 ^ (-511885324)) | (i401 & (-511885324)))) | 335675400) * (-712)));
                        int i586 = (((-1549043396) | i585) << 1) - (i585 ^ (-1549043396));
                        int i587 = ~(((-336733353) ^ i401) | ((-336733353) & i401) | (-511885324));
                        int i588 = ~(((-176209924) & i22) | ((-176209924) ^ i22));
                        int i589 = -(-(((i587 & i588) | (i587 ^ i588)) * (-712)));
                        int i590 = (i586 ^ i589) + ((i589 & i586) << 1);
                        int i591 = ((~(i401 | (-511885324))) | (-336733353)) * 712;
                        r3 = (i590 ^ i591) + ((i591 & i590) << 1);
                        int i592 = (-1769769773) + (((~(((-388310271) & i22) | ((-388310271) ^ i22))) | 1620580608) * (-502));
                        int i593 = (~(((-388310271) & i401) | ((-388310271) ^ i401) | (-1689794845))) * (-502);
                        i42 = ((i592 | i593) << 1) - (i593 ^ i592);
                        int i594 = ~((1689794844 & i22) | (1689794844 ^ i22));
                        i43 = -(-(((i594 & (-388310271)) | ((-388310271) ^ i594)) * TypedValues.PositionType.TYPE_DRAWPATH));
                        if (r3 <= (i42 & i43) + (i43 | i42)) {
                            int i595 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 1L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 1L ? 0 : -1));
                            Object[] objArr115 = new Object[1];
                            a(i40, i41, (char) ((i595 ^ 42388) + ((42388 & i595) << 1)), objArr115);
                            str11 = (String) objArr115[0];
                            String str53 = str10;
                            iIndexOf = TextUtils.indexOf(str53, str53);
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            i44 = 27027;
                            str12 = str53;
                        } else {
                            String str54 = str10;
                            int i596 = -(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                            Object[] objArr116 = new Object[1];
                            a(i40, i41, (char) ((i596 & 42388) + (42388 | i596)), objArr116);
                            str11 = (String) objArr116[0];
                            iIndexOf = TextUtils.indexOf(str54, str54);
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            i44 = 2099;
                            str12 = str54;
                        }
                        int i597 = iIndexOf * 1773;
                        int i598 = -(-(i44 * (-885)));
                        i45 = (i597 ^ i598) + ((i597 & i598) << 1);
                        int i599 = ~iIndexOf;
                        int i600 = ~i44;
                        int i601 = ~((i599 & i600) | (i599 ^ i600));
                        int i602 = ~i44;
                        int i603 = i601 | (~((i602 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i602 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3)));
                        int i604 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i605 = (i604 & iIndexOf) | (i604 ^ iIndexOf);
                        int i606 = ~((i605 & i44) | (i605 ^ i44));
                        i46 = (i603 & i606) | (i603 ^ i606);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        int i607 = ~(1114992360 | iTuitionPaymentFragmentspecialinlinedviewModeldefault7);
                        int i608 = -(-(((i607 & (-1610448636)) | ((-1610448636) ^ i607)) * (-283)));
                        int i609 = (1628340566 & i608) + (i608 | 1628340566);
                        i47 = (((i609 | 1592640864) << 1) - (1592640864 ^ i609)) + ((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault7 & (-495456276)) | ((-495456276) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7))) * 283);
                        int i610 = ~((i401 ^ 1182398779) | (i401 & 1182398779));
                        int i611 = ((i610 & (-1325136384)) | ((-1325136384) ^ i610)) * (-712);
                        int i612 = ~((209959414 ^ i37) | (209959414 & i37) | 1182398779);
                        int i613 = ~(((-142737605) & i22) | ((-142737605) ^ i22));
                        i48 = ((((1750850612 | i611) << 1) - (i611 ^ 1750850612)) - (~(((i612 & i613) | (i612 ^ i613)) * (-712)))) - 1;
                        i49 = ~((i401 & 1182398779) | (i401 ^ 1182398779));
                        if (i47 > i48 + (((i49 & 209959414) | (209959414 ^ i49)) * 712)) {
                            int i614 = 886 / i46;
                            i50 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i615 = ~((i44 & i50) | (i50 ^ i44));
                            i51 = ((i45 & i614) + (i614 | i45)) % ((-1772) << ((i615 & iIndexOf) | (iIndexOf ^ i615)));
                        } else {
                            int i616 = -(-(i46 * 886));
                            i50 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            i51 = (i45 ^ i616) + ((i616 & i45) << 1) + (((~((i44 & i50) | (i50 ^ i44))) | iIndexOf) * (-1772));
                        }
                        int i617 = (i51 - (~(886 * (~((iIndexOf & i50) | (i50 ^ iIndexOf)))))) - 1;
                        int i618 = -(-TextUtils.getTrimmedLength(str12));
                        Object[] objArr117 = new Object[1];
                        a(i617, (i618 & 8) + (i618 | 8), (char) TextUtils.indexOf(str12, str12, 0), objArr117);
                        bytes = ((String) objArr117[0]).getBytes();
                        length = bytes.length;
                        if (length == 0) {
                            i39 = i22 ^ 150;
                            r4 = str12;
                        } else {
                            try {
                                bufferedInputStream5 = new BufferedInputStream(new FileInputStream(str11));
                                i52 = 4096;
                                try {
                                    bArr3 = new byte[4096];
                                    i53 = 0;
                                    while (true) {
                                        i54 = bufferedInputStream5.read(bArr3, 0, i52);
                                        if (i54 > 0) {
                                            break;
                                        }
                                        int i619 = TuitionPaymentFragmentbindingInflater1;
                                        int i620 = (i619 ^ 75) + ((i619 & 75) << 1);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i620 % 128;
                                        int i621 = i620 % 2;
                                        i55 = 0;
                                        while (i53 < length && i55 < i54) {
                                            if (bArr3[i55] == bytes[i53]) {
                                                if (i53 != 0) {
                                                    i56 = i53 - 1;
                                                    while (true) {
                                                        if (i56 > 0) {
                                                            i53 = 0;
                                                            break;
                                                        }
                                                        int i622 = TuitionPaymentFragmentbindingInflater1;
                                                        i57 = ((i622 | 25) << 1) - (i622 ^ 25);
                                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i57 % 128;
                                                        if (i57 % 2 == 0) {
                                                            i58 = 1;
                                                        } else {
                                                            i58 = 0;
                                                        }
                                                        while (true) {
                                                            if (i58 < i56) {
                                                                i53 = i56;
                                                                break;
                                                            }
                                                            b2 = bytes[i58];
                                                            int i623 = -i56;
                                                            i59 = (i53 ^ i623) + ((i623 & i53) << 1);
                                                            int i624 = TuitionPaymentFragmentbindingInflater1;
                                                            i60 = (i624 ^ 41) + ((i624 & 41) << 1);
                                                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i60 % 128;
                                                            i61 = i59 | i58;
                                                            if (i60 % 2 == 0) {
                                                                if (b2 != bytes[(i61 << 1) - (i59 ^ i58)]) {
                                                                    break;
                                                                }
                                                                i58 = ((i58 & 1) << 1) + (i58 ^ 1);
                                                            } else {
                                                                if (b2 != bytes[(i61 << 1) - (i59 ^ i58)]) {
                                                                    break;
                                                                }
                                                                i58 = ((i58 & 1) << 1) + (i58 ^ 1);
                                                            }
                                                        }
                                                        i56--;
                                                    }
                                                }
                                            } else {
                                                int i625 = i53 - 53;
                                                i53 = ((i625 | 54) << 1) - (i625 ^ 54);
                                            }
                                            i55 = ((i55 & 1) << 1) + (i55 ^ 1);
                                        }
                                        i52 = 4096;
                                    }
                                    if (i53 == length) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    try {
                                        bufferedInputStream5.close();
                                    } catch (IOException unused19) {
                                    }
                                    if (z2) {
                                        i39 = i22 ^ 150;
                                        r4 = str12;
                                    } else {
                                        i39 = i22;
                                        r4 = str12;
                                    }
                                } catch (IOException unused20) {
                                    if (bufferedInputStream5 != null) {
                                        try {
                                            bufferedInputStream5.close();
                                        } catch (IOException unused21) {
                                        }
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    if (bufferedInputStream5 != null) {
                                        try {
                                            bufferedInputStream5.close();
                                        } catch (IOException unused22) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (IOException unused23) {
                                bufferedInputStream5 = null;
                            } catch (Throwable th9) {
                                th = th9;
                                bufferedInputStream5 = null;
                            }
                        }
                        int i626 = (~(i22 & i583)) & (i22 | i583);
                        int i627 = -i626;
                        int i628 = ((i626 & i627) | (i626 ^ i627)) >> 31;
                        int i629 = i39 & (~i628);
                        int i630 = i583 & i628;
                        int i631 = (i629 & i630) | (i629 ^ i630);
                        int i632 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
                        Object[] objArr118 = new Object[1];
                        a((i632 ^ 2107) + ((i632 & 2107) << 1), 47 - TextUtils.indexOf((CharSequence) r4, (CharSequence) r4), (char) (TextUtils.indexOf((CharSequence) r4, '0', 0, 0) + 18698), objArr118);
                        Object[] objArr119 = {(String) objArr118[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char c9 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                            int i633 = 994 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            int offsetBefore2 = TextUtils.getOffsetBefore(r4, 0) + 8;
                            byte b44 = (byte) ($$a[0] - 1);
                            Object[] objArr120 = new Object[1];
                            c((byte) 6, b44, b44, objArr120);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c9, i633, offsetBefore2, -545305915, false, (String) objArr120[0], new Class[]{String.class});
                        }
                        long jLongValue16 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr119)).longValue();
                        long j112 = -846486524;
                        long j113 = -721;
                        long j114 = j112 ^ j;
                        long j115 = jLongValue16 ^ j;
                        long j116 = (j112 | jLongValue16) ^ j;
                        long j117 = (j113 * j112) + (j113 * jLongValue16) + (((long) 1444) * (j77 | ((j114 | j115) ^ j) | j116)) + (((long) (-1444)) * (j116 | ((j112 | j2) ^ j) | ((jLongValue16 | j2) ^ j))) + (((long) 722) * (((jLongValue16 | j114) ^ j) | ((j112 | j115) ^ j))) + ((long) 1466945808);
                        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                        int i634 = ~iElapsedRealtime;
                        int i635 = ((int) (j117 >> 32)) & ((((((~((-995307997) | i634)) | (~((-441918415) | iElapsedRealtime))) | (~(i634 | 441918414))) * 959) - 1203847627) + (((~(iElapsedRealtime | 441918414)) | (~(i634 | (-441918415))) | (~((-995307997) | iElapsedRealtime))) * 959));
                        int i636 = ((int) j117) & (2097955119 + (((~((-1449357963) | i401)) | (~(1408382923 | i22))) * 333) + (((~((-1449357963) | i22)) | (~(i401 | 1408382923))) * 333));
                        int i637 = ((i635 & i636) | (i635 ^ i636)) * 263;
                        int i638 = (i637 | i22) & (~(i22 & i637));
                        int i639 = (~(i22 & i631)) & (i22 | i631);
                        int i640 = (i639 | (-i639)) >> 31;
                        int i641 = ~i640;
                        int i642 = TuitionPaymentFragmentbindingInflater1 + 119;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i642 % 128;
                        int i643 = i642 % 2;
                        int i644 = i638 & i641;
                        int i645 = i631 & i640;
                        i399 = (i645 & i644) | (i644 ^ i645);
                        strArr = strArr2;
                    } else {
                        j2 = j74;
                        str8 = str7;
                    }
                    if (r3 <= (i42 & i43) + (i43 | i42)) {
                        int i5910 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 1L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 1L ? 0 : -1));
                        Object[] objArr1110 = new Object[1];
                        a(i40, i41, (char) ((i5910 ^ 42388) + ((42388 & i5910) << 1)), objArr1110);
                        str11 = (String) objArr1110[0];
                        String str55 = str10;
                        iIndexOf = TextUtils.indexOf(str55, str55);
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        i44 = 27027;
                        str12 = str55;
                    } else {
                        String str56 = str10;
                        int i5911 = -(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                        Object[] objArr1111 = new Object[1];
                        a(i40, i41, (char) ((i5911 & 42388) + (42388 | i5911)), objArr1111);
                        str11 = (String) objArr1111[0];
                        iIndexOf = TextUtils.indexOf(str56, str56);
                        iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        i44 = 2099;
                        str12 = str56;
                    }
                    int i5912 = iIndexOf * 1773;
                    int i5913 = -(-(i44 * (-885)));
                    i45 = (i5912 ^ i5913) + ((i5912 & i5913) << 1);
                    int i5914 = ~iIndexOf;
                    int i6010 = ~i44;
                    int i6011 = ~((i5914 & i6010) | (i5914 ^ i6010));
                    int i6012 = ~i44;
                    int i6013 = i6011 | (~((i6012 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (i6012 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3)));
                    int i6014 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i6015 = (i6014 & iIndexOf) | (i6014 ^ iIndexOf);
                    int i6016 = ~((i6015 & i44) | (i6015 ^ i44));
                    i46 = (i6013 & i6016) | (i6013 ^ i6016);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    int i6017 = ~(1114992360 | iTuitionPaymentFragmentspecialinlinedviewModeldefault8);
                    int i6018 = -(-(((i6017 & (-1610448636)) | ((-1610448636) ^ i6017)) * (-283)));
                    int i6019 = (1628340566 & i6018) + (i6018 | 1628340566);
                    i47 = (((i6019 | 1592640864) << 1) - (1592640864 ^ i6019)) + ((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault8 & (-495456276)) | ((-495456276) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8))) * 283);
                    int i6110 = ~((i401 ^ 1182398779) | (i401 & 1182398779));
                    int i6111 = ((i6110 & (-1325136384)) | ((-1325136384) ^ i6110)) * (-712);
                    int i6112 = ~((209959414 ^ i37) | (209959414 & i37) | 1182398779);
                    int i6113 = ~(((-142737605) & i22) | ((-142737605) ^ i22));
                    i48 = ((((1750850612 | i6111) << 1) - (i6111 ^ 1750850612)) - (~(((i6112 & i6113) | (i6112 ^ i6113)) * (-712)))) - 1;
                    i49 = ~((i401 & 1182398779) | (i401 ^ 1182398779));
                    if (i47 > i48 + (((i49 & 209959414) | (209959414 ^ i49)) * 712)) {
                        int i6114 = 886 / i46;
                        i50 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i6115 = ~((i44 & i50) | (i50 ^ i44));
                        i51 = ((i45 & i6114) + (i6114 | i45)) % ((-1772) << ((i6115 & iIndexOf) | (iIndexOf ^ i6115)));
                    } else {
                        int i6116 = -(-(i46 * 886));
                        i50 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        i51 = (i45 ^ i6116) + ((i6116 & i45) << 1) + (((~((i44 & i50) | (i50 ^ i44))) | iIndexOf) * (-1772));
                    }
                    int i6117 = (i51 - (~(886 * (~((iIndexOf & i50) | (i50 ^ iIndexOf)))))) - 1;
                    int i6118 = -(-TextUtils.getTrimmedLength(str12));
                    Object[] objArr1112 = new Object[1];
                    a(i6117, (i6118 & 8) + (i6118 | 8), (char) TextUtils.indexOf(str12, str12, 0), objArr1112);
                    bytes = ((String) objArr1112[0]).getBytes();
                    length = bytes.length;
                    if (length == 0) {
                        i39 = i22 ^ 150;
                        r4 = str12;
                    } else {
                        bufferedInputStream5 = new BufferedInputStream(new FileInputStream(str11));
                        i52 = 4096;
                        bArr3 = new byte[4096];
                        i53 = 0;
                        while (true) {
                            i54 = bufferedInputStream5.read(bArr3, 0, i52);
                            if (i54 > 0) {
                                break;
                                break;
                            }
                            int i6119 = TuitionPaymentFragmentbindingInflater1;
                            int i6210 = (i6119 ^ 75) + ((i6119 & 75) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6210 % 128;
                            int i6211 = i6210 % 2;
                            i55 = 0;
                            while (i53 < length) {
                                if (bArr3[i55] == bytes[i53]) {
                                    if (i53 != 0) {
                                        i56 = i53 - 1;
                                        while (true) {
                                            if (i56 > 0) {
                                                i53 = 0;
                                                break;
                                                break;
                                            }
                                            int i6212 = TuitionPaymentFragmentbindingInflater1;
                                            i57 = ((i6212 | 25) << 1) - (i6212 ^ 25);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i57 % 128;
                                            if (i57 % 2 == 0) {
                                                i58 = 1;
                                            } else {
                                                i58 = 0;
                                            }
                                            while (true) {
                                                if (i58 < i56) {
                                                    i53 = i56;
                                                    break;
                                                    break;
                                                }
                                                b2 = bytes[i58];
                                                int i6213 = -i56;
                                                i59 = (i53 ^ i6213) + ((i6213 & i53) << 1);
                                                int i6214 = TuitionPaymentFragmentbindingInflater1;
                                                i60 = (i6214 ^ 41) + ((i6214 & 41) << 1);
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i60 % 128;
                                                i61 = i59 | i58;
                                                if (i60 % 2 == 0) {
                                                    if (b2 != bytes[(i61 << 1) - (i59 ^ i58)]) {
                                                        break;
                                                        break;
                                                    }
                                                    i58 = ((i58 & 1) << 1) + (i58 ^ 1);
                                                } else {
                                                    if (b2 != bytes[(i61 << 1) - (i59 ^ i58)]) {
                                                        break;
                                                        break;
                                                    }
                                                    i58 = ((i58 & 1) << 1) + (i58 ^ 1);
                                                }
                                            }
                                            i56--;
                                        }
                                    }
                                } else {
                                    int i6215 = i53 - 53;
                                    i53 = ((i6215 | 54) << 1) - (i6215 ^ 54);
                                }
                                i55 = ((i55 & 1) << 1) + (i55 ^ 1);
                            }
                            i52 = 4096;
                        }
                        if (i53 == length) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        bufferedInputStream5.close();
                        if (z2) {
                            i39 = i22 ^ 150;
                            r4 = str12;
                        } else {
                            i39 = i22;
                            r4 = str12;
                        }
                    }
                } catch (Exception unused24) {
                    i39 = i22 ^ 151;
                    r4 = r3;
                }
                int i5810 = -ExpandableListView.getPackedPositionChild(0L);
                i40 = ((i5810 | 2085) << 1) - (i5810 ^ 2085);
                i41 = 12 - (~(-(ViewConfiguration.getKeyRepeatTimeout() >> 16)));
                int i5811 = -(-(((~((i401 ^ (-511885324)) | (i401 & (-511885324)))) | 335675400) * (-712)));
                int i5812 = (((-1549043396) | i5811) << 1) - (i5811 ^ (-1549043396));
                int i5813 = ~(((-336733353) ^ i401) | ((-336733353) & i401) | (-511885324));
                int i5814 = ~(((-176209924) & i22) | ((-176209924) ^ i22));
                int i5815 = -(-(((i5813 & i5814) | (i5813 ^ i5814)) * (-712)));
                int i5915 = (i5812 ^ i5815) + ((i5815 & i5812) << 1);
                int i5916 = ((~(i401 | (-511885324))) | (-336733353)) * 712;
                r3 = (i5915 ^ i5916) + ((i5916 & i5915) << 1);
                int i5917 = (-1769769773) + (((~(((-388310271) & i22) | ((-388310271) ^ i22))) | 1620580608) * (-502));
                int i5918 = (~(((-388310271) & i401) | ((-388310271) ^ i401) | (-1689794845))) * (-502);
                i42 = ((i5917 | i5918) << 1) - (i5918 ^ i5917);
                int i5919 = ~((1689794844 & i22) | (1689794844 ^ i22));
                i43 = -(-(((i5919 & (-388310271)) | ((-388310271) ^ i5919)) * TypedValues.PositionType.TYPE_DRAWPATH));
            } catch (Exception unused25) {
                r3 = str10;
            }
            int i646 = TuitionPaymentFragmentbindingInflater1 + 59;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i646 % 128;
            int i647 = i646 % 2;
            int i648 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int i649 = (i648 & 370) + (i648 | 370);
            int i650 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int i651 = -View.MeasureSpec.makeMeasureSpec(0, 0);
            Object[] objArr121 = new Object[1];
            a(i649, (i650 ^ 23) + ((i650 & 23) << 1), (char) ((i651 ^ 41110) + ((i651 & 41110) << 1)), objArr121);
            String str57 = (String) objArr121[0];
            int i652 = -(ViewConfiguration.getEdgeSlop() >> 16);
            int i653 = ((i652 | 808) << 1) - (i652 ^ 808);
            int tapTimeout2 = 10 - (ViewConfiguration.getTapTimeout() >> 16);
            String str58 = str8;
            int iIndexOf9 = TextUtils.indexOf((CharSequence) str58, '0');
            int i654 = (iIndexOf9 * (-574)) - 37492532;
            int i655 = ~iIndexOf9;
            int i656 = ~((i655 ^ i401) | (i655 & i401));
            int i657 = ~(((-65319) & i22) | ((-65319) ^ i22));
            int i658 = ((i656 & i657) | (i656 ^ i657)) * 1150;
            int i659 = (i654 ^ i658) + ((i654 & i658) << 1);
            int i660 = ~(((-65319) & i22) | ((-65319) ^ i22));
            int i661 = ~(65318 | i401);
            int i662 = -(-(((i660 & i661) | (i660 ^ i661)) * (-575)));
            int i663 = ((i659 | i662) << 1) - (i662 ^ i659);
            int i664 = ~((i655 ^ i22) | (i655 & i22));
            int i665 = ~(iIndexOf9 | i401);
            int i666 = -(-(((i664 & i665) | (i664 ^ i665)) * 575));
            Object[] objArr122 = new Object[1];
            a(i653, tapTimeout2, (char) (((i663 | i666) << 1) - (i666 ^ i663)), objArr122);
            String str59 = (String) objArr122[0];
            int edgeSlop3 = 818 - (ViewConfiguration.getEdgeSlop() >> 16);
            int i667 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            Object[] objArr123 = new Object[1];
            a(edgeSlop3, (i667 ^ 6) + ((i667 & 6) << 1), (char) ((-2) - (~(-((byte) KeyEvent.getModifierMetaStateMask())))), objArr123);
            String str60 = (String) objArr123[0];
            int i668 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int i669 = ((i668 | 825) << 1) - (i668 ^ 825);
            int i670 = -(-Color.alpha(0));
            int i671 = ((i670 | 8) << 1) - (i670 ^ 8);
            int i672 = -(-(ViewConfiguration.getKeyRepeatTimeout() >> 16));
            Object[] objArr124 = new Object[1];
            a(i669, i671, (char) (((i672 | 27928) << 1) - (i672 ^ 27928)), objArr124);
            String[] strArr22 = {str57, str59, str60, (String) objArr124[0]};
            int deadChar2 = KeyEvent.getDeadChar(0, 0);
            Object[] objArr125 = new Object[1];
            a(((deadChar2 | 833) << 1) - (deadChar2 ^ 833), 17 - View.MeasureSpec.getMode(0), (char) KeyEvent.normalizeMetaState(0), objArr125);
            String str61 = (String) objArr125[0];
            int i673 = 848 - (~(-TextUtils.lastIndexOf(str58, '0', 0, 0)));
            int i674 = -(-ImageFormat.getBitsPerPixel(0));
            int i675 = (i674 & 8) + (i674 | 8);
            int threadPriority4 = Process.getThreadPriority(0);
            Object[] objArr126 = new Object[1];
            a(i673, i675, (char) (((threadPriority4 & 20) + (threadPriority4 | 20)) >> 6), objArr126);
            String str62 = (String) objArr126[0];
            int i676 = -TextUtils.indexOf(str58, str58, 0);
            int i677 = (i676 & 857) + (i676 | 857);
            int i678 = -Color.rgb(0, 0, 0);
            Object[] objArr127 = new Object[1];
            a(i677, (i678 & (-16777209)) + (i678 | (-16777209)), (char) (22286 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), objArr127);
            String str63 = (String) objArr127[0];
            int i679 = 864 - (~(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))));
            int i680 = -AndroidCharacter.getMirror('0');
            Object[] objArr128 = new Object[1];
            a(i679, (i680 & 59) + (i680 | 59), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr128);
            String str64 = (String) objArr128[0];
            int i681 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 874;
            int i682 = -AndroidCharacter.getMirror('0');
            int i683 = (i682 & 62) + (i682 | 62);
            int i684 = -(-View.resolveSizeAndState(0, 0, 0));
            Object[] objArr129 = new Object[1];
            a(i681, i683, (char) ((i684 ^ 16700) + ((i684 & 16700) << 1)), objArr129);
            String[] strArr23 = {str61, str62, str63, str64, (String) objArr129[0]};
            int iIndexOf10 = TextUtils.indexOf((CharSequence) str58, '0', 0);
            Object[] objArr130 = new Object[1];
            a((iIndexOf10 ^ 890) + ((iIndexOf10 & 890) << 1), 16 - TextUtils.indexOf(str58, str58, 0), (char) Color.argb(0, 0, 0, 0), objArr130);
            String str65 = (String) objArr130[0];
            int trimmedLength2 = TextUtils.getTrimmedLength(str58) + TypedValues.Custom.TYPE_DIMENSION;
            int defaultSize2 = 3 - View.getDefaultSize(0, 0);
            int i685 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
            Object[] objArr131 = new Object[1];
            a(trimmedLength2, defaultSize2, (char) ((i685 & 20322) + (i685 | 20322)), objArr131);
            String str66 = (String) objArr131[0];
            int i686 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int i687 = i686 * 217;
            int i688 = (((i687 | (-196940)) << 1) - (i687 ^ (-196940))) + ((~((i686 ^ i22) | (i686 & i22))) * 216);
            int i689 = (i686 ^ (-917)) | (i686 & (-917));
            int i690 = (i688 - (~(((i689 & i401) | (i689 ^ i401)) * (-216)))) - 1;
            int i691 = ~(i686 | i401);
            int i692 = -(-(((i691 & 916) | (i691 ^ 916)) * 216));
            int i693 = 21 - (~Color.blue(0));
            int i694 = -TextUtils.lastIndexOf(str58, '0', 0, 0);
            Object[] objArr132 = new Object[1];
            a((i690 & i692) + (i692 | i690), i693, (char) ((i694 ^ (-1)) + (i694 << 1)), objArr132);
            String str67 = (String) objArr132[0];
            int size2 = View.MeasureSpec.getSize(0);
            int i695 = ~size2;
            int i696 = ~((i695 ^ 938) | (i695 & 938));
            int i697 = ~i22;
            int i698 = ~(i697 | 938);
            int i699 = (((size2 * 55) - 100366) - (~(((i696 & i698) | (i696 ^ i698)) * (-108)))) - 1;
            int i700 = ~(i695 | i22);
            int i701 = ~((-939) | size2);
            int i702 = (i700 & i701) | (i700 ^ i701);
            int i703 = ~((i401 ^ size2) | (i401 & size2));
            int i704 = -(-(((i702 & i703) | (i702 ^ i703)) * 54));
            int i705 = (i699 ^ i704) + ((i699 & i704) << 1);
            int i706 = ~((-939) | size2);
            int i707 = ((i706 & i22) | (i22 ^ i706)) * 54;
            int i708 = (i705 ^ i707) + ((i707 & i705) << 1);
            int i709 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i710 = i709 * (-721);
            int i711 = (i710 & (-17304)) + (i710 | (-17304));
            int i712 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
            int i713 = ~i709;
            int i714 = (~((i713 ^ (-25)) | (i713 & (-25)))) | i712;
            int i715 = ~((i709 ^ 24) | (i709 & 24));
            int i716 = -(-(((i714 ^ i715) | (i714 & i715)) * 1444));
            int i717 = (i711 & i716) + (i716 | i711);
            int i718 = ~((i709 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | (i709 & iTuitionPaymentFragmentspecialinlinedviewModeldefault9));
            int i719 = (i718 & i715) | (i715 ^ i718);
            int i720 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault9 & 24) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault9 ^ 24));
            int i721 = -(-(((i720 & i719) | (i719 ^ i720)) * (-1444)));
            Object[] objArr133 = new Object[1];
            a(i708, (((i717 & i721) + (i717 | i721)) - (~(((~((i709 & (-25)) | ((-25) ^ i709))) | (~((i713 ^ 24) | (i713 & 24)))) * 722))) - 1, (char) ((-49) - (~AndroidCharacter.getMirror('0'))), objArr133);
            String str68 = (String) objArr133[0];
            int scrollBarFadeDuration2 = ViewConfiguration.getScrollBarFadeDuration() >> 16;
            Object[] objArr134 = new Object[1];
            a((scrollBarFadeDuration2 & 963) + (scrollBarFadeDuration2 | 963), (-16777189) - (~(-Color.rgb(0, 0, 0))), (char) Color.blue(0), objArr134);
            str9 = str58;
            String[] strArr24 = {str65, str66, str16, str67, str68, (String) objArr134[0]};
            int i722 = 992 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int iRgb3 = Color.rgb(0, 0, 0);
            int i723 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            Object[] objArr135 = new Object[1];
            a(i722, (iRgb3 ^ 16777227) + ((16777227 & iRgb3) << 1), (char) (((i723 | 9663) << 1) - (i723 ^ 9663)), objArr135);
            String str69 = (String) objArr135[0];
            int i724 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            int defaultSize3 = View.getDefaultSize(0, 0);
            Object[] objArr136 = new Object[1];
            a(((i724 | 1003) << 1) - (i724 ^ 1003), (defaultSize3 & 8) + (defaultSize3 | 8), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr136);
            String str70 = (String) objArr136[0];
            int maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
            int i725 = ((maximumDrawingCacheSize | PointerIconCompat.TYPE_ALIAS) << 1) - (maximumDrawingCacheSize ^ PointerIconCompat.TYPE_ALIAS);
            int i726 = -(ViewConfiguration.getEdgeSlop() >> 16);
            int i727 = ((i726 | 6) << 1) - (i726 ^ 6);
            int i728 = -(Process.myTid() >> 22);
            Object[] objArr137 = new Object[1];
            a(i725, i727, (char) ((i728 & 62360) + (i728 | 62360)), objArr137);
            String str71 = (String) objArr137[0];
            int i729 = -(ViewConfiguration.getPressedStateDuration() >> 16);
            int i730 = (i729 & PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW) + (i729 | PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW);
            int i731 = -(-TextUtils.indexOf(str9, str9));
            int i732 = (i731 ^ 6) + ((i731 & 6) << 1);
            int i733 = -(-Color.blue(0));
            j84 = j84;
            Object[] objArr138 = new Object[1];
            a(i730, i732, (char) ((i733 ^ 42047) + ((i733 & 42047) << 1)), objArr138);
            String[] strArr25 = {str69, str70, str71, (String) objArr138[0]};
            int i734 = -(Process.myTid() >> 22);
            int i735 = (i734 & 1022) + (i734 | 1022);
            int i736 = -Color.green(0);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i737 = (((i736 * (-1965)) + 15744) - (~(-(-(((i736 ^ (-17)) | (i736 & (-17))) * 983))))) - 1;
            int i738 = ~i736;
            int i739 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
            int i740 = ~(((-17) & i739) | ((-17) ^ i739));
            int i741 = ((i740 & i738) | (i738 ^ i740)) * (-983);
            int i742 = ((i737 | i741) << 1) - (i737 ^ i741);
            int i743 = ~i736;
            int i744 = ~((i743 & i739) | (i743 ^ i739));
            int i745 = ~((i738 ^ 16) | (i738 & 16));
            int i746 = ((i744 & i745) | (i744 ^ i745)) * 983;
            int i747 = (i742 & i746) + (i746 | i742);
            int i748 = -(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
            Object[] objArr139 = new Object[1];
            a(i735, i747, (char) ((i748 & 25283) + (i748 | 25283)), objArr139);
            String str72 = (String) objArr139[0];
            int i749 = 857 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int i750 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int i751 = (i750 ^ 7) + ((i750 & 7) << 1);
            int i752 = -(-TextUtils.getTrimmedLength(str9));
            Object[] objArr140 = new Object[1];
            a(i749, i751, (char) ((i752 ^ 22286) + ((i752 & 22286) << 1)), objArr140);
            String str73 = (String) objArr140[0];
            int i753 = -(ViewConfiguration.getPressedStateDuration() >> 16);
            int i754 = (i753 ^ 825) + ((i753 & 825) << 1);
            int iLastIndexOf5 = TextUtils.lastIndexOf(str9, '0', 0, 0) + 9;
            int i755 = -ExpandableListView.getPackedPositionChild(0L);
            Object[] objArr141 = new Object[1];
            a(i754, iLastIndexOf5, (char) ((i755 ^ 27927) + ((i755 & 27927) << 1)), objArr141);
            String[] strArr26 = {str72, str73, (String) objArr141[0]};
            int i756 = -(-ExpandableListView.getPackedPositionChild(0L));
            int i757 = (i756 ^ 1039) + ((i756 & 1039) << 1);
            int i758 = -(-((byte) KeyEvent.getModifierMetaStateMask()));
            int i759 = ((i758 | 15) << 1) - (i758 ^ 15);
            int i760 = -(ViewConfiguration.getEdgeSlop() >> 16);
            Object[] objArr142 = new Object[1];
            a(i757, i759, (char) (((i760 | 53256) << 1) - (i760 ^ 53256)), objArr142);
            String str74 = (String) objArr142[0];
            int i761 = 1051 - (~(-(Process.myTid() >> 22)));
            int windowTouchSlop4 = ViewConfiguration.getWindowTouchSlop() >> 8;
            Object[] objArr143 = new Object[1];
            a(i761, (windowTouchSlop4 & 1) + (windowTouchSlop4 | 1), (char) (0 - (~(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))))), objArr143);
            String[] strArr27 = {str74, (String) objArr143[0]};
            int i762 = -(-TextUtils.indexOf(str9, str9, 0, 0));
            int i763 = ((i762 | 1053) << 1) - (i762 ^ 1053);
            int i764 = -(-Process.getGidForName(str9));
            Object[] objArr144 = new Object[1];
            a(i763, (i764 ^ 10) + ((i764 & 10) << 1), (char) View.resolveSize(0, 0), objArr144);
            String str75 = (String) objArr144[0];
            int i765 = -(-Color.argb(0, 0, 0, 0));
            int i766 = (i765 ^ 1062) + ((i765 & 1062) << 1);
            int tapTimeout3 = 1 - (ViewConfiguration.getTapTimeout() >> 16);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            Object[] objArr145 = new Object[1];
            a(i766, tapTimeout3, (char) ((iMakeMeasureSpec2 & 56210) + (iMakeMeasureSpec2 | 56210)), objArr145);
            String[] strArr28 = {str75, (String) objArr145[0]};
            int threadPriority5 = (Process.getThreadPriority(0) + 20) >> 6;
            int i767 = (threadPriority5 & 1063) + (threadPriority5 | 1063);
            int i768 = -TextUtils.indexOf(str9, str9);
            int i769 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            Object[] objArr146 = new Object[1];
            a(i767, (i768 ^ 16) + ((i768 & 16) << 1), (char) ((i769 & 7518) + (i769 | 7518)), objArr146);
            String str76 = (String) objArr146[0];
            int i770 = -(-TextUtils.indexOf(str9, str9, 0));
            int i771 = (i770 & TypedValues.Custom.TYPE_DIMENSION) + (i770 | TypedValues.Custom.TYPE_DIMENSION);
            int i772 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int i773 = ((i772 | 3) << 1) - (i772 ^ 3);
            int i774 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            Object[] objArr147 = new Object[1];
            a(i771, i773, (char) ((i774 ^ 20323) + ((i774 & 20323) << 1)), objArr147);
            String str77 = (String) objArr147[0];
            int i775 = -(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
            Object[] objArr148 = new Object[1];
            a(((i775 | 849) << 1) - (i775 ^ 849), 5 - (~(-ExpandableListView.getPackedPositionChild(0L))), (char) ((-1) - TextUtils.lastIndexOf(str9, '0')), objArr148);
            String str78 = (String) objArr148[0];
            int i776 = 1078 - (~(-KeyEvent.keyCodeFromString(str9)));
            int i777 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int i778 = -(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
            Object[] objArr149 = new Object[1];
            a(i776, (i777 & 8) + (i777 | 8), (char) ((i778 & 42249) + (i778 | 42249)), objArr149);
            String str79 = (String) objArr149[0];
            int i779 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            Object[] objArr150 = new Object[1];
            a((i779 & 864) + (i779 | 864), 11 - (Process.myTid() >> 22), (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), objArr150);
            String str80 = (String) objArr150[0];
            int i780 = -(ViewConfiguration.getPressedStateDuration() >> 16);
            int i781 = ((i780 | 875) << 1) - (i780 ^ 875);
            int i782 = -TextUtils.indexOf(str9, str9);
            int i783 = (i782 ^ 14) + ((i782 & 14) << 1);
            int i784 = -TextUtils.indexOf((CharSequence) str9, '0');
            char c10 = (char) (((i784 | 16699) << 1) - (i784 ^ 16699));
            Object[] objArr151 = new Object[1];
            a(i781, i783, c10, objArr151);
            String[] strArr29 = {str76, str77, str78, str79, str80, (String) objArr151[0]};
            int i785 = -Process.getGidForName(str9);
            int i786 = ((i785 | 1086) << 1) - (i785 ^ 1086);
            int i787 = -(ViewConfiguration.getTapTimeout() >> 16);
            Object[] objArr152 = new Object[1];
            a(i786, (i787 ^ 20) + ((i787 & 20) << 1), (char) View.getDefaultSize(0, 0), objArr152);
            String str81 = (String) objArr152[0];
            int offsetBefore3 = TextUtils.getOffsetBefore(str9, 0) + 1107;
            int i788 = 18 - (~(-View.getDefaultSize(0, 0)));
            int i789 = -MotionEvent.axisFromString(str9);
            Object[] objArr153 = new Object[1];
            a(offsetBefore3, i788, (char) (((i789 | 20233) << 1) - (i789 ^ 20233)), objArr153);
            String str82 = (String) objArr153[0];
            int i790 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            int i791 = (i790 & 1125) + (i790 | 1125);
            int i792 = 30 - (~(-(ViewConfiguration.getMaximumFlingVelocity() >> 16)));
            int i793 = -View.resolveSize(0, 0);
            Object[] objArr154 = new Object[1];
            a(i791, i792, (char) ((i793 & 40004) + (i793 | 40004)), objArr154);
            String str83 = (String) objArr154[0];
            int iBlue3 = Color.blue(0);
            int i794 = ((iBlue3 | 1157) << 1) - (iBlue3 ^ 1157);
            int iMyTid = 26 - (Process.myTid() >> 22);
            int i795 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            Object[] objArr155 = new Object[1];
            a(i794, iMyTid, (char) ((i795 ^ (-1)) + (i795 << 1)), objArr155);
            String str84 = (String) objArr155[0];
            int i796 = -(-(ViewConfiguration.getScrollBarSize() >> 8));
            int i797 = (i796 & 1183) + (i796 | 1183);
            int i798 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
            Object[] objArr156 = new Object[1];
            a(i797, (i798 ^ 23) + ((i798 & 23) << 1), (char) (31455 - (~(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))), objArr156);
            String str85 = (String) objArr156[0];
            int i799 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1205;
            int maximumDrawingCacheSize2 = 33 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int i800 = -(-(ViewConfiguration.getScrollBarSize() >> 8));
            Object[] objArr157 = new Object[1];
            a(i799, maximumDrawingCacheSize2, (char) ((i800 & 63362) + (i800 | 63362)), objArr157);
            String[] strArr30 = {str81, str82, str83, str84, str85, (String) objArr157[0], str16};
            int absoluteGravity5 = Gravity.getAbsoluteGravity(0, 0);
            int i801 = (absoluteGravity5 ^ 1239) + ((absoluteGravity5 & 1239) << 1);
            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 13;
            int i802 = -(-(Process.myTid() >> 22));
            Object[] objArr158 = new Object[1];
            a(i801, iResolveSizeAndState, (char) (((i802 | 47504) << 1) - (i802 ^ 47504)), objArr158);
            String str86 = (String) objArr158[0];
            int i803 = -(-TextUtils.indexOf(str9, str9, 0, 0));
            int i804 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            Object[] objArr159 = new Object[1];
            a((i803 ^ 818) + ((i803 & 818) << 1), ((i804 | 7) << 1) - (i804 ^ 7), (char) ((-1) - TextUtils.indexOf((CharSequence) str9, '0')), objArr159);
            String[] strArr31 = {str86, (String) objArr159[0]};
            Object[] objArr160 = new Object[1];
            a(1252 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 30 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) str9, '0') + 52517), objArr160);
            String str87 = (String) objArr160[0];
            int i805 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            int i806 = (i805 ^ 1283) + ((i805 & 1283) << 1);
            int i807 = 10 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            int i808 = -(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
            Object[] objArr161 = new Object[1];
            a(i806, i807, (char) ((i808 ^ 6928) + ((i808 & 6928) << 1)), objArr161);
            String[] strArr32 = {str87, (String) objArr161[0]};
            int i809 = -TextUtils.indexOf(str9, str9, 0);
            int i810 = -TextUtils.indexOf((CharSequence) str9, '0');
            int i811 = -TextUtils.lastIndexOf(str9, '0', 0, 0);
            Object[] objArr162 = new Object[1];
            a((i809 ^ 1293) + ((i809 & 1293) << 1), (i810 & 18) + (i810 | 18), (char) ((i811 ^ (-1)) + (i811 << 1)), objArr162);
            String str88 = (String) objArr162[0];
            Object[] objArr163 = new Object[1];
            a(1313 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 4, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1146), objArr163);
            String[] strArr33 = {str88, (String) objArr163[0]};
            int i812 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int i813 = (i812 ^ 1317) + ((i812 & 1317) << 1);
            int i814 = -(ViewConfiguration.getEdgeSlop() >> 16);
            int i815 = (i814 & 19) + (i814 | 19);
            int minimumFlingVelocity2 = ViewConfiguration.getMinimumFlingVelocity() >> 16;
            Object[] objArr164 = new Object[1];
            a(i813, i815, (char) (((minimumFlingVelocity2 | 1159) << 1) - (minimumFlingVelocity2 ^ 1159)), objArr164);
            String[] strArr34 = {(String) objArr164[0]};
            int i816 = -(-View.resolveSize(0, 0));
            Object[] objArr165 = new Object[1];
            a((i816 & 1336) + (i816 | 1336), 16 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr165);
            String[] strArr35 = {(String) objArr165[0]};
            int i817 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int i818 = (i817 ^ 1352) + ((i817 & 1352) << 1);
            int i819 = -(-TextUtils.getCapsMode(str9, 0, 0));
            Object[] objArr166 = new Object[1];
            a(i818, (i819 ^ 19) + ((i819 & 19) << 1), (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr166);
            String[] strArr36 = {(String) objArr166[0]};
            int offsetAfter2 = TextUtils.getOffsetAfter(str9, 0);
            int iLastIndexOf6 = TextUtils.lastIndexOf(str9, '0');
            Object[] objArr167 = new Object[1];
            a((offsetAfter2 & 1371) + (offsetAfter2 | 1371), (iLastIndexOf6 ^ 20) + ((iLastIndexOf6 & 20) << 1), (char) TextUtils.getCapsMode(str9, 0, 0), objArr167);
            String[] strArr37 = {(String) objArr167[0]};
            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 1391;
            int iRed3 = Color.red(0);
            int i820 = (iRed3 & 23) + (iRed3 | 23);
            int i821 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            Object[] objArr168 = new Object[1];
            a(packedPositionChild, i820, (char) ((i821 & 1) + (i821 | 1)), objArr168);
            String[] strArr38 = {(String) objArr168[0]};
            int i822 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            Object[] objArr169 = new Object[1];
            a((i822 & 1413) + (i822 | 1413), (ViewConfiguration.getPressedStateDuration() >> 16) + 21, (char) ((-2) - ((-(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))) ^ (-1))), objArr169);
            String[] strArr39 = {(String) objArr169[0]};
            int i823 = 1433 - (~(-TextUtils.getOffsetAfter(str9, 0)));
            int i824 = -TextUtils.getOffsetAfter(str9, 0);
            Object[] objArr170 = new Object[1];
            a(i823, (i824 ^ 24) + ((i824 & 24) << 1), (char) (ViewConfiguration.getEdgeSlop() >> 16), objArr170);
            String[] strArr40 = {(String) objArr170[0], str16};
            int i825 = -(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
            int iResolveSize = View.resolveSize(0, 0);
            int i826 = -(-View.MeasureSpec.makeMeasureSpec(0, 0));
            Object[] objArr171 = new Object[1];
            a(((i825 | 1457) << 1) - (i825 ^ 1457), (iResolveSize & 28) + (iResolveSize | 28), (char) ((i826 ^ 29455) + ((i826 & 29455) << 1)), objArr171);
            String[] strArr41 = {(String) objArr171[0], str16};
            int i827 = 1485 - (~(-(-(ViewConfiguration.getDoubleTapTimeout() >> 16))));
            int i828 = -MotionEvent.axisFromString(str9);
            int threadPriority6 = Process.getThreadPriority(0);
            Object[] objArr172 = new Object[1];
            a(i827, ((i828 | 26) << 1) - (i828 ^ 26), (char) (((threadPriority6 ^ 20) + ((threadPriority6 & 20) << 1)) >> 6), objArr172);
            String[] strArr42 = {(String) objArr172[0], str16};
            int i829 = 1513 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int i830 = -(-TextUtils.lastIndexOf(str9, '0'));
            Object[] objArr173 = new Object[1];
            a(i829, ((i830 | 32) << 1) - (i830 ^ 32), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), objArr173);
            String[] strArr43 = {(String) objArr173[0], str16};
            int i831 = 1543 - (~(-View.resolveSizeAndState(0, 0, 0)));
            int scrollBarSize4 = ViewConfiguration.getScrollBarSize() >> 8;
            Object[] objArr174 = new Object[1];
            a(i831, (scrollBarSize4 ^ 27) + ((scrollBarSize4 & 27) << 1), (char) (0 - (~TextUtils.lastIndexOf(str9, '0', 0, 0))), objArr174);
            String[] strArr44 = {(String) objArr174[0], str16};
            int i832 = -(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
            Object[] objArr175 = new Object[1];
            a((i832 ^ 1571) + ((i832 & 1571) << 1), 32 - (~(-(-TextUtils.lastIndexOf(str9, '0', 0)))), (char) TextUtils.getOffsetBefore(str9, 0), objArr175);
            String[][] strArr45 = {strArr22, strArr23, strArr24, strArr25, strArr26, strArr27, strArr28, strArr29, strArr30, strArr31, strArr32, strArr33, strArr34, strArr35, strArr36, strArr37, strArr38, strArr39, strArr40, strArr41, strArr42, strArr43, strArr44, new String[]{(String) objArr175[0], str16}};
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 1603;
            int i833 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            int i834 = i833 * 934;
            int i835 = (i834 & (-932)) + (i834 | (-932));
            int i836 = -(-(((~((~i833) | i697)) | (-2)) * (-933)));
            int i837 = (i835 & i836) + (i836 | i835);
            int i838 = ~(((-2) ^ i697) | (i697 & (-2)));
            int i839 = ~(((-2) ^ i833) | ((-2) & i833));
            int i840 = ((i837 + (((i838 & i839) | (i838 ^ i839)) * 933)) - (~(-(-((~((i833 & 1) | (i833 ^ 1))) * 933))))) - 1;
            char c11 = 0;
            Object[] objArr176 = new Object[1];
            a(touchSlop, i840, (char) TextUtils.getOffsetBefore(str9, 0), objArr176);
            StringBuilder sb = new StringBuilder((String) objArr176[0]);
            int i841 = i22;
            int i842 = 0;
            int i843 = 0;
            while (i842 < 24) {
                String[] strArr46 = strArr45[i842];
                Object[] objArr177 = {strArr46[c11]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                    char edgeSlop4 = (char) (33602 - (ViewConfiguration.getEdgeSlop() >> 16));
                    int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 3085;
                    int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0) + 26;
                    byte b45 = $$a[0];
                    byte b46 = (byte) (b45 - 1);
                    Object[] objArr178 = new Object[1];
                    c(b45, b46, b46, objArr178);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(edgeSlop4, iNormalizeMetaState2, iMakeMeasureSpec3, 1411172903, false, (String) objArr178[0], new Class[]{String.class});
                }
                String str89 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).invoke(null, objArr177);
                String[] strArr47 = (String[]) Arrays.copyOfRange(strArr46, 1, strArr46.length);
                if (str89 != null) {
                    int i844 = TuitionPaymentFragmentbindingInflater1;
                    int i845 = (i844 & 125) + (i844 | 125);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i845 % 128;
                    if (i845 % 2 == 0) {
                        str89.isEmpty();
                        throw null;
                    }
                    if (!str89.isEmpty()) {
                        if (strArr46.length != 1) {
                            int length6 = strArr47.length;
                            int i846 = 0;
                            while (true) {
                                if (i846 < length6) {
                                    if (str89.contains(strArr47[i846])) {
                                        int i847 = (-7431) - (~(i842 * (-743)));
                                        int i848 = i842 | 10;
                                        int i849 = ~i848;
                                        int i850 = ~((i22 ^ 10) | (i22 & 10));
                                        int i851 = (i849 & i850) | (i849 ^ i850);
                                        int i852 = ~((i842 ^ i22) | (i842 & i22));
                                        int i853 = ((i851 & i852) | (i851 ^ i852)) * (-744);
                                        int i854 = ((i847 | i853) << 1) - (i847 ^ i853);
                                        int i855 = ~i842;
                                        int i856 = ~((i855 & (-11)) | ((-11) ^ i855));
                                        int i857 = -(-(((i856 & i401) | (i401 ^ i856)) * 744));
                                        int i858 = (((i854 & i857) + (i857 | i854)) - (~(-(-(((i848 ^ i22) | (i848 & i22)) * 744))))) - 1;
                                        i841 = ((~i858) & i22) | (i858 & i401);
                                        i30 = (i843 & (-26)) + (i843 | (-26)) + 27;
                                        if (i30 > 1) {
                                            int defaultSize4 = 1604 - View.getDefaultSize(0, 0);
                                            int i859 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                            int i860 = (i859 ^ 107) + ((i859 & 107) << 1);
                                            TuitionPaymentFragmentbindingInflater1 = i860 % 128;
                                            int i861 = i860 % 2;
                                            int i862 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                                            int i863 = (i862 ^ 2) + ((i862 & 2) << 1);
                                            int i864 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                            Object[] objArr179 = new Object[1];
                                            a(defaultSize4, i863, (char) (((i864 | 20137) << 1) - (i864 ^ 20137)), objArr179);
                                            c2 = 0;
                                            sb.append((String) objArr179[0]);
                                        } else {
                                            c2 = 0;
                                        }
                                        sb.append(strArr46[c2]);
                                        int trimmedLength3 = TextUtils.getTrimmedLength(str9) + 1606;
                                        int i865 = -(-(ViewConfiguration.getPressedStateDuration() >> 16));
                                        Object[] objArr180 = new Object[1];
                                        a(trimmedLength3, ((i865 | 1) << 1) - (i865 ^ 1), (char) (KeyEvent.getMaxKeyCode() >> 16), objArr180);
                                        sb.append((String) objArr180[0]);
                                        sb.append(str89);
                                        i843 = i30;
                                    } else {
                                        int i866 = i846 - 56;
                                        i846 = ((i866 | 57) << 1) - (i866 ^ 57);
                                    }
                                }
                            }
                        } else {
                            int i8410 = (-7431) - (~(i842 * (-743)));
                            int i8411 = i842 | 10;
                            int i8412 = ~i8411;
                            int i8510 = ~((i22 ^ 10) | (i22 & 10));
                            int i8511 = (i8412 & i8510) | (i8412 ^ i8510);
                            int i8512 = ~((i842 ^ i22) | (i842 & i22));
                            int i8513 = ((i8511 & i8512) | (i8511 ^ i8512)) * (-744);
                            int i8514 = ((i8410 | i8513) << 1) - (i8410 ^ i8513);
                            int i8515 = ~i842;
                            int i8516 = ~((i8515 & (-11)) | ((-11) ^ i8515));
                            int i8517 = -(-(((i8516 & i401) | (i401 ^ i8516)) * 744));
                            int i8518 = (((i8514 & i8517) + (i8517 | i8514)) - (~(-(-(((i8411 ^ i22) | (i8411 & i22)) * 744))))) - 1;
                            i841 = ((~i8518) & i22) | (i8518 & i401);
                            i30 = (i843 & (-26)) + (i843 | (-26)) + 27;
                            if (i30 > 1) {
                                int defaultSize5 = 1604 - View.getDefaultSize(0, 0);
                                int i8519 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i867 = (i8519 ^ 107) + ((i8519 & 107) << 1);
                                TuitionPaymentFragmentbindingInflater1 = i867 % 128;
                                int i868 = i867 % 2;
                                int i869 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                                int i8610 = (i869 ^ 2) + ((i869 & 2) << 1);
                                int i8611 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                Object[] objArr1710 = new Object[1];
                                a(defaultSize5, i8610, (char) (((i8611 | 20137) << 1) - (i8611 ^ 20137)), objArr1710);
                                c2 = 0;
                                sb.append((String) objArr1710[0]);
                            } else {
                                c2 = 0;
                            }
                            sb.append(strArr46[c2]);
                            int trimmedLength4 = TextUtils.getTrimmedLength(str9) + 1606;
                            int i8612 = -(-(ViewConfiguration.getPressedStateDuration() >> 16));
                            Object[] objArr181 = new Object[1];
                            a(trimmedLength4, ((i8612 | 1) << 1) - (i8612 ^ 1), (char) (KeyEvent.getMaxKeyCode() >> 16), objArr181);
                            sb.append((String) objArr181[0]);
                            sb.append(str89);
                            i843 = i30;
                        }
                    }
                }
                i842++;
                strArr45 = strArr45;
                i417 = i417;
                c11 = 0;
            }
            int i870 = i417;
            int i871 = -TextUtils.indexOf(str9, str9);
            int i872 = ((i871 | 1607) << 1) - (i871 ^ 1607);
            int scrollBarSize5 = ViewConfiguration.getScrollBarSize() >> 8;
            int i873 = (scrollBarSize5 ^ 1) + ((scrollBarSize5 & 1) << 1);
            int i874 = -(-View.resolveSize(0, 0));
            Object[] objArr182 = new Object[1];
            a(i872, i873, (char) (((i874 | 24106) << 1) - (i874 ^ 24106)), objArr182);
            sb.append((String) objArr182[0]);
            if (i843 > 2) {
                int i875 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i876 = ((i875 | 35) << 1) - (i875 ^ 35);
                TuitionPaymentFragmentbindingInflater1 = i876 % 128;
                int i877 = i876 % 2;
                c = 0;
                String[] strArr48 = {sb.toString()};
                ((int[]) objArr[0])[0] = i841;
                objArr = new Object[]{new int[1], strArr48};
            } else {
                c = 0;
                objArr = new Object[]{new int[]{i22}, new String[0]};
            }
            int i878 = ((int[]) objArr[c])[c];
            int i879 = ((~i870) & i22) | (i870 & i401);
            int i880 = -i879;
            int i881 = ((i879 & i880) | (i879 ^ i880)) >> 31;
            int i882 = i878 & (~i881);
            int i883 = i870 & i881;
            int i884 = (i882 & i883) | (i882 ^ i883);
            i29 = 1;
            strArr2 = (String[]) objArr[1];
            i417 = i884;
            int i4210 = -(-ExpandableListView.getPackedPositionChild(0L));
            int i4211 = (i4210 ^ 890) + ((i4210 & 890) << i29);
            int i4212 = -(Process.myTid() >> 22);
            int i4213 = i4212 * 755;
            int i4214 = (i4213 ^ (-12048)) + ((i4213 & (-12048)) << 1);
            int i4215 = (~i4212) | 16;
            int i4216 = ~i4215;
            int i4310 = ~i4212;
            int i4311 = ~((i4310 ^ i22) | (i4310 & i22));
            int i4312 = (i4216 & i4311) | (i4216 ^ i4311);
            int i4313 = ~((i22 ^ 16) | (i22 & 16));
            int i4314 = (i4214 - (~(((i4312 & i4313) | (i4312 ^ i4313)) * (-754)))) - 1;
            int i4315 = ~((i4215 & i22) | (i4215 ^ i22));
            i31 = ~i22;
            int i4316 = (i4212 & i31) | (i31 ^ i4212);
            int i4317 = ~((i4316 & 16) | (i4316 ^ 16));
            int i4318 = ((i4317 & i4315) | (i4315 ^ i4317)) * (-754);
            int i4319 = (i4314 & i4318) + (i4318 | i4314);
            int i4410 = ((i4310 ^ i401) | (i4310 & i401)) * 754;
            Object[] objArr710 = new Object[1];
            a(i4211, (i4319 ^ i4410) + ((i4410 & i4319) << 1), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), objArr710);
            Object[] objArr711 = {(String) objArr710[0]};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char c12 = (char) (33602 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                int iIndexOf11 = 3085 - TextUtils.indexOf(str9, str9, 0);
                int iMyPid3 = 26 - (Process.myPid() >> 22);
                byte b310 = $$a[0];
                byte b311 = (byte) (b310 - 1);
                Object[] objArr712 = new Object[1];
                c(b310, b311, b311, objArr712);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c12, iIndexOf11, iMyPid3, 1411172903, false, (String) objArr712[0], new Class[]{String.class});
            }
            objInvoke = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr711);
            if (objInvoke == null) {
                i32 = 0;
            } else {
                Object[] objArr713 = {objInvoke, 42};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char absoluteGravity6 = (char) Gravity.getAbsoluteGravity(0, 0);
                    int doubleTapTimeout3 = 3393 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int threadPriority7 = ((Process.getThreadPriority(0) + 20) >> 6) + 9;
                    byte b312 = $$a[0];
                    byte b47 = (byte) (b312 - 1);
                    Object[] objArr714 = new Object[1];
                    c(b312, b47, b47, objArr714);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(absoluteGravity6, doubleTapTimeout3, threadPriority7, 1203525406, false, (String) objArr714[0], new Class[]{String.class, Integer.TYPE});
                }
                long jLongValue17 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr713)).longValue();
                long j910 = 318295938;
                long j911 = 216;
                long jFreeMemory4 = (int) Runtime.getRuntime().freeMemory();
                long j1010 = (((long) 217) * j910) + (((long) (-215)) * jLongValue17) + (((j910 | jFreeMemory4) ^ j) * j911);
                long j1011 = jFreeMemory4 ^ j;
                long j1012 = j1010 + (((long) (-216)) * (j910 | (jLongValue17 ^ j) | j1011)) + (j911 * (((j1011 | j910) ^ j) | jLongValue17)) + ((long) (-320365815));
                int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
                int i4411 = ((int) (j1012 >> 32)) & (896659338 + (((~((-1685449098) | iUptimeMillis2)) | 1172291787) * (-465)) + (((-1685449098) | (~(1172291787 | iUptimeMillis2))) * 930) + ((iUptimeMillis2 | (-538978561)) * 465));
                int startElapsedRealtime3 = (int) Process.getStartElapsedRealtime();
                int i4412 = ((int) j1012) & (822761596 + (((-16843026) | startElapsedRealtime3) * (-381)) + (((~((~startElapsedRealtime3) | (-185821980))) | (-1099268502)) * 381) + 2122225229);
                i32 = (i4411 & i4412) | (i4411 ^ i4412);
            }
            if (i32 != 1986687685) {
                i33 = i417;
            } else {
                i33 = i417;
            }
            int i5210 = -(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
            int i5211 = ((i5210 | 1950) << 1) - (i5210 ^ 1950);
            int i5212 = -TextUtils.getOffsetAfter(str9, 0);
            Object[] objArr1010 = new Object[1];
            a(i5211, (i5212 & 13) + (i5212 | 13), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), objArr1010);
            String str410 = (String) objArr1010[0];
            int i5213 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            Object[] objArr1011 = new Object[1];
            a(((i5213 | 1963) << 1) - (i5213 ^ 1963), 3 - (~(-TextUtils.indexOf((CharSequence) str9, '0'))), (char) (MotionEvent.axisFromString(str9) + 3193), objArr1011);
            String[] strArr110 = {str410, (String) objArr1011[0]};
            int i5214 = 1967 - (~(-(-(ViewConfiguration.getScrollBarSize() >> 8))));
            int i5215 = -(ViewConfiguration.getEdgeSlop() >> 16);
            Object[] objArr1012 = new Object[1];
            a(i5214, (i5215 & 15) + (i5215 | 15), (char) ((-16743304) - Color.rgb(0, 0, 0)), objArr1012);
            String str411 = (String) objArr1012[0];
            int i5216 = -ExpandableListView.getPackedPositionType(0L);
            int i5217 = ((i5216 | 1983) << 1) - (i5216 ^ 1983);
            int i5310 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 20;
            int gidForName3 = Process.getGidForName(str9);
            Object[] objArr1013 = new Object[1];
            a(i5217, i5310, (char) (((gidForName3 | 1) << 1) - (gidForName3 ^ 1)), objArr1013);
            String str412 = (String) objArr1013[0];
            int i5311 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            int i5312 = ((i5311 | 2001) << 1) - (i5311 ^ 2001);
            int windowTouchSlop5 = ViewConfiguration.getWindowTouchSlop() >> 8;
            int i5313 = windowTouchSlop5 * (-391);
            int i5314 = ((i5313 | (-2730)) << 1) - (i5313 ^ (-2730));
            int i5315 = ~((-15) | windowTouchSlop5);
            int i5316 = (i22 ^ 14) | (i22 & 14);
            int i5317 = ~i5316;
            int i5318 = ((i5315 & i5317) | (i5315 ^ i5317)) * (-196);
            int i5319 = (((i5314 | i5318) << 1) - (i5318 ^ i5314)) + (((windowTouchSlop5 ^ 14) | (windowTouchSlop5 & 14)) * 392);
            int i5410 = ~windowTouchSlop5;
            int i5411 = ~((i5410 & (-15)) | (i5410 ^ (-15)));
            int i5412 = ~i5316;
            Object[] objArr1014 = new Object[1];
            a(i5312, (i5319 - (~(((i5411 & i5412) | (i5411 ^ i5412)) * 196))) - 1, (char) View.MeasureSpec.getMode(0), objArr1014);
            String[] strArr111 = {str411, str412, (String) objArr1014[0]};
            int i5413 = -Process.getGidForName(str9);
            int i5414 = (i5413 ^ 2015) + ((i5413 & 2015) << 1);
            int i5415 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            Object[] objArr1015 = new Object[1];
            a(i5414, (i5415 ^ 20) + ((i5415 & 20) << 1), (char) (34860 - TextUtils.indexOf((CharSequence) str9, '0')), objArr1015);
            String str510 = (String) objArr1015[0];
            int i5416 = -(-(ViewConfiguration.getKeyRepeatDelay() >> 16));
            Object[] objArr1113 = new Object[1];
            a(((i5416 | 2037) << 1) - (i5416 ^ 2037), 10 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr1113);
            String[] strArr112 = {str510, (String) objArr1113[0]};
            int i5417 = -TextUtils.lastIndexOf(str9, '0');
            Object[] objArr1114 = new Object[1];
            a((i5417 ^ 2046) + ((i5417 & 2046) << 1), 58 - (~(-AndroidCharacter.getMirror('0'))), (char) (2012 - (~(-TextUtils.getOffsetBefore(str9, 0)))), objArr1114);
            String str511 = (String) objArr1114[0];
            Object[] objArr1115 = new Object[1];
            a(585 - (~(-(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))))), (ViewConfiguration.getEdgeSlop() >> 16) + 6, (char) (52750 - (~(-(ViewConfiguration.getScrollBarSize() >> 8)))), objArr1115);
            String[] strArr210 = {str511, (String) objArr1115[0]};
            int i5418 = -Drawable.resolveOpacity(0, 0);
            int i5419 = ((i5418 | 2058) << 1) - (i5418 ^ 2058);
            int scrollBarSize6 = ViewConfiguration.getScrollBarSize() >> 8;
            Object[] objArr1116 = new Object[1];
            a(i5419, (scrollBarSize6 ^ 28) + ((scrollBarSize6 & 28) << 1), (char) (13899 - (~(-(-KeyEvent.normalizeMetaState(0))))), objArr1116);
            String str512 = (String) objArr1116[0];
            int i5510 = -AndroidCharacter.getMirror('0');
            int i5511 = (i5510 ^ 2085) + ((i5510 & 2085) << 1);
            int i5512 = -TextUtils.getTrimmedLength(str9);
            Object[] objArr1117 = new Object[1];
            a(i5511, ((i5512 | 10) << 1) - (i5512 ^ 10), (char) ExpandableListView.getPackedPositionType(0L), objArr1117);
            c3 = 0;
            strArr3 = new String[][]{strArr110, strArr111, strArr112, strArr210, new String[]{str512, (String) objArr1117[0]}};
            i34 = 0;
            i35 = -1;
            loop7: while (true) {
                if (i34 < 5) {
                    i36 = i33;
                    str10 = str9;
                    i37 = i31;
                    i38 = i22;
                    break;
                }
                String[] strArr211 = strArr3[i34];
                str13 = strArr211[c3];
                i62 = 1;
                strArr4 = (String[]) Arrays.copyOfRange(strArr211, 1, strArr211.length);
                length2 = strArr4.length;
                i63 = 0;
                while (true) {
                    if (i63 < length2) {
                        i35 = ((i35 ^ 117) + ((i35 & 117) << i62)) - 116;
                        bytes2 = strArr4[i63].getBytes();
                        length3 = bytes2.length;
                        if (length3 == 0) {
                            int i5513 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i5514 = ((i5513 | 5) << i62) - (i5513 ^ 5);
                            TuitionPaymentFragmentbindingInflater1 = i5514 % 128;
                            int i5515 = i5514 % 2;
                            i36 = i33;
                            str10 = str9;
                            i37 = i31;
                        } else {
                            bufferedInputStream7 = new BufferedInputStream(new FileInputStream(str13));
                            i67 = 4096;
                            bArr4 = new byte[4096];
                            strArr5 = strArr3;
                            strArr6 = strArr4;
                            str14 = str13;
                            i68 = 0;
                            i69 = 0;
                            while (true) {
                                i70 = bufferedInputStream7.read(bArr4, i69, i67);
                                if (i70 > 0) {
                                    break;
                                    break;
                                }
                                int i5516 = TuitionPaymentFragmentbindingInflater1;
                                int i5517 = (i5516 ^ 109) + ((i5516 & 109) << 1);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5517 % 128;
                                int i5518 = i5517 % 2;
                                i71 = 0;
                                while (i68 < length3) {
                                    int i5519 = i70;
                                    if (bArr4[i71] == bytes2[i68]) {
                                        i68++;
                                    } else {
                                        if (i68 != 0) {
                                            i72 = i68 - 1;
                                            while (true) {
                                                if (i72 > 0) {
                                                    i73 = i33;
                                                    i74 = i34;
                                                    i75 = length2;
                                                    str15 = str9;
                                                    i76 = i63;
                                                    bArr5 = bArr4;
                                                    i77 = i31;
                                                    i68 = 0;
                                                    break;
                                                    break;
                                                }
                                                i78 = 0;
                                                while (true) {
                                                    if (i78 < i72) {
                                                        i73 = i33;
                                                        i74 = i34;
                                                        i75 = length2;
                                                        str15 = str9;
                                                        i76 = i63;
                                                        bArr5 = bArr4;
                                                        i77 = i31;
                                                        i68 = i72;
                                                        break;
                                                        break;
                                                    }
                                                    i65 = length2;
                                                    b3 = bytes2[i78];
                                                    bArr6 = bArr4;
                                                    int i5610 = -i72;
                                                    i37 = i31;
                                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault11 = DeviceQuirksExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                                    str10 = str9;
                                                    int i5611 = i5610 * (-496);
                                                    i36 = i33;
                                                    int i5612 = -(-(i68 * (-496)));
                                                    int i5613 = (i5611 ^ i5612) + ((i5612 & i5611) << 1);
                                                    int i5614 = ~i5610;
                                                    int i5615 = ~i68;
                                                    i64 = i34;
                                                    int i5616 = (i5613 - (~(-(-((~(i5614 | i5615)) * 497))))) - 1;
                                                    int i5617 = ~((i5614 ^ i5615) | (i5614 & i5615) | iTuitionPaymentFragmentspecialinlinedviewModeldefault11);
                                                    i66 = i63;
                                                    int i5618 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                                                    int i5619 = (i5615 ^ i5618) | (i5615 & i5618);
                                                    int i5710 = (i5616 - (~(-(-((i5617 | (~((i5619 & i5610) | (i5619 ^ i5610)))) * 497))))) - 1;
                                                    int i5711 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                                                    int i5712 = ~((i5711 & i5614) | (i5614 ^ i5711));
                                                    int i5713 = ~(i5614 | i68);
                                                    int i5714 = (i5713 & i5712) | (i5712 ^ i5713);
                                                    int i5715 = ~i68;
                                                    int i5716 = ~((i5715 & i5610) | (i5715 ^ i5610) | iTuitionPaymentFragmentspecialinlinedviewModeldefault11);
                                                    i79 = i5710 + (((i5714 & i5716) | (i5714 ^ i5716)) * 497);
                                                    if (b3 != bytes2[((i79 | i78) << 1) - (i79 ^ i78)]) {
                                                        break;
                                                    }
                                                    int i5717 = (i78 ^ 127) + ((i78 & 127) << 1);
                                                    i78 = ((i5717 | (-126)) << 1) - (i5717 ^ (-126));
                                                    length2 = i65;
                                                    bArr4 = bArr6;
                                                    i31 = i37;
                                                    i33 = i36;
                                                    str9 = str10;
                                                    i34 = i64;
                                                    i63 = i66;
                                                }
                                                i72 = (-2) - (~i72);
                                                length2 = i65;
                                                bArr4 = bArr6;
                                                i31 = i37;
                                                i33 = i36;
                                                str9 = str10;
                                                i34 = i64;
                                                i63 = i66;
                                            }
                                        }
                                        i70 = i5519;
                                        length2 = i75;
                                        bArr4 = bArr5;
                                        i31 = i77;
                                        i33 = i73;
                                        str9 = str15;
                                        i34 = i74;
                                        i63 = i76;
                                    }
                                    i73 = i33;
                                    i74 = i34;
                                    i75 = length2;
                                    str15 = str9;
                                    i76 = i63;
                                    bArr5 = bArr4;
                                    i77 = i31;
                                    i71 = (i71 | 1) + (i71 & 1);
                                    i70 = i5519;
                                    length2 = i75;
                                    bArr4 = bArr5;
                                    i31 = i77;
                                    i33 = i73;
                                    str9 = str15;
                                    i34 = i74;
                                    i63 = i76;
                                }
                                length2 = length2;
                                bArr4 = bArr4;
                                i31 = i31;
                                i33 = i33;
                                str9 = str9;
                                i34 = i34;
                                i63 = i63;
                                i69 = 0;
                                i67 = 4096;
                                str10 = str9;
                                i66 = i63;
                                i37 = i31;
                                if (bufferedInputStream7 != null) {
                                    try {
                                        bufferedInputStream7.close();
                                    } catch (IOException unused26) {
                                    }
                                }
                                i63 = (i66 ^ 1) + ((i66 & 1) << 1);
                                strArr3 = strArr5;
                                strArr4 = strArr6;
                                str13 = str14;
                                length2 = i65;
                                i31 = i37;
                                i33 = i36;
                                str9 = str10;
                                i34 = i64;
                                i62 = 1;
                            }
                            i36 = i33;
                            i64 = i34;
                            i65 = length2;
                            str10 = str9;
                            i66 = i63;
                            i37 = i31;
                            if (i68 == length3) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            bufferedInputStream7.close();
                            if (z3) {
                                i63 = (i66 ^ 1) + ((i66 & 1) << 1);
                                strArr3 = strArr5;
                                strArr4 = strArr6;
                                str13 = str14;
                                length2 = i65;
                                i31 = i37;
                                i33 = i36;
                                str9 = str10;
                                i34 = i64;
                                i62 = 1;
                            }
                        }
                        i38 = ((i35 ^ 170) + ((i35 & 170) << 1)) ^ i22;
                        break loop7;
                    }
                    i34++;
                    i33 = i33;
                    c3 = 0;
                }
            }
            int i5718 = (~(i22 & i36)) & (i22 | i36);
            int i5719 = -i5718;
            int i5816 = ((i5718 & i5719) | (i5718 ^ i5719)) >> 31;
            int i5817 = i38 & (~i5816);
            int i5818 = i36 & i5816;
            int i5819 = (i5817 ^ i5818) | (i5817 & i5818);
            int i6216 = (~(i22 & i5819)) & (i22 | i5819);
            int i6217 = -i6216;
            int i6218 = ((i6216 & i6217) | (i6216 ^ i6217)) >> 31;
            int i6219 = i39 & (~i6218);
            int i6310 = i5819 & i6218;
            int i6311 = (i6219 & i6310) | (i6219 ^ i6310);
            int i6312 = -(ViewConfiguration.getDoubleTapTimeout() >> 16);
            Object[] objArr1118 = new Object[1];
            a((i6312 ^ 2107) + ((i6312 & 2107) << 1), 47 - TextUtils.indexOf((CharSequence) r4, (CharSequence) r4), (char) (TextUtils.indexOf((CharSequence) r4, '0', 0, 0) + 18698), objArr1118);
            Object[] objArr1119 = {(String) objArr1118[0]};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c13 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                int i6313 = 994 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int offsetBefore4 = TextUtils.getOffsetBefore(r4, 0) + 8;
                byte b48 = (byte) ($$a[0] - 1);
                Object[] objArr1210 = new Object[1];
                c((byte) 6, b48, b48, objArr1210);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c13, i6313, offsetBefore4, -545305915, false, (String) objArr1210[0], new Class[]{String.class});
            }
            long jLongValue18 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr1119)).longValue();
            long j118 = -846486524;
            long j119 = -721;
            long j1110 = j118 ^ j;
            long j1111 = jLongValue18 ^ j;
            long j1112 = (j118 | jLongValue18) ^ j;
            long j1113 = (j119 * j118) + (j119 * jLongValue18) + (((long) 1444) * (j77 | ((j1110 | j1111) ^ j) | j1112)) + (((long) (-1444)) * (j1112 | ((j118 | j2) ^ j) | ((jLongValue18 | j2) ^ j))) + (((long) 722) * (((jLongValue18 | j1110) ^ j) | ((j118 | j1111) ^ j))) + ((long) 1466945808);
            int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
            int i6314 = ~iElapsedRealtime2;
            int i6315 = ((int) (j1113 >> 32)) & ((((((~((-995307997) | i6314)) | (~((-441918415) | iElapsedRealtime2))) | (~(i6314 | 441918414))) * 959) - 1203847627) + (((~(iElapsedRealtime2 | 441918414)) | (~(i6314 | (-441918415))) | (~((-995307997) | iElapsedRealtime2))) * 959));
            int i6316 = ((int) j1113) & (2097955119 + (((~((-1449357963) | i401)) | (~(1408382923 | i22))) * 333) + (((~((-1449357963) | i22)) | (~(i401 | 1408382923))) * 333));
            int i6317 = ((i6315 & i6316) | (i6315 ^ i6316)) * 263;
            int i6318 = (i6317 | i22) & (~(i22 & i6317));
            int i6319 = (~(i22 & i6311)) & (i22 | i6311);
            int i6410 = (i6319 | (-i6319)) >> 31;
            int i6411 = ~i6410;
            int i6412 = TuitionPaymentFragmentbindingInflater1 + 119;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6412 % 128;
            int i6413 = i6412 % 2;
            int i6414 = i6318 & i6411;
            int i6415 = i6311 & i6410;
            i399 = (i6415 & i6414) | (i6414 ^ i6415);
            strArr = strArr2;
        } else {
            i401 = i401;
            strArr = null;
        }
        int[] iArr = new int[1];
        int i885 = i22 ^ i399;
        int i886 = -i885;
        int i887 = (i885 & i886) | (i885 ^ i886);
        int i888 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i889 = i888 + 121;
        TuitionPaymentFragmentbindingInflater1 = i889 % 128;
        int i890 = i889 % 2;
        int i891 = (i887 >> 31) & 16;
        int[] iArr2 = {i399};
        int i892 = ((i888 | 67) << 1) - (i888 ^ 67);
        TuitionPaymentFragmentbindingInflater1 = i892 % 128;
        int i893 = i892 % 2;
        Object[] objArr183 = {iArr, iArr2, null, new int[]{i22}, strArr};
        int i894 = (-1277991106) + (((~((-37818629) | i401)) | (-1736261016)) * (-591)) + (((-37818629) | i22) * 591);
        int i895 = -(-((i894 ^ i891) + ((i894 & i891) << 1)));
        int i896 = ((i3 | i895) << 1) - (i3 ^ i895);
        int i897 = i896 << 13;
        int i898 = (i897 & (~i896)) | ((~i897) & i896);
        int i899 = i898 >>> 17;
        int i900 = (i898 | i899) & (~(i898 & i899));
        int i901 = i900 << 5;
        iArr[0] = (i900 | i901) & (~(i900 & i901));
        return objArr183;
    }

    static {
        char[] cArr = new char[2154];
        ByteBuffer.wrap("\u009fæëów\u0010Â¥N\u009eÚx%\u0092±7=]\u0088á\u0014\f\u009f°ëÉwPÂ\u008cN/ÚM%\u0085±0=@\u0088â\u0014 \u009f®ëËwxÂ\u0084N àj\u0094\u007f\b\u009c½)1\u0012¥ôZ\u001eÎ»BÑ÷mk\u0080à<\u0094E\bÜ½\u00111®¥ÕZ\u001eÎ\u0086BÛ÷mk\u0081à2\u0094C\bñ±³Å¦YEìð`Ëô-\u000bÇ\u009fb\u0013\b¦´:Y±åÅ\u009cY\u0005ìË`gô\u0012\u000bÁ±³Å±YYìõ`Ëô'\u000bÇ\u009fj\u0013\u0019¦¾:U±¹Å\u0093Y5ìÔ`zô\u001a\u000bË\u009fs\u0013\u000e¦\u009b:H±éÅ\u009aY8ì×`bô\u000f±³Å§YTìå`Ëô.\u000bÏ\u009f \u0013\u001c¦ :_±æ±³Å§YTìå`Ëô9\u000bÁ\u009fc\u0013B¦¢:B±ùÅ\u0084{C\u000fA\u0093´&\u0015ªu>ÈÁ<UÑÙÎldð\u008d{\t\u000fr\u0093Ï&\fª\u008f>øÁ3±³Å¦YAìò`\u0085ôe\u000b\u0086\u009fm\u0013\u001c¦§:Y±øÅ\u0092Y5\u0091\u0003å@yãÌ\t@fÔÈ+1¿Í3ó\u0086Z\u001a¹\u0091\tåvyÞÌ1@¬Ôÿ+*¿\u00993Ô\u0086M\u001a©\u0091\u0016å2±îÅ\u00adY\u000eìä`\u008bô%\u000bÜ\u009f \u0013\u001e¦·:T±äÅ\u009bY3ìÜ`Aô\u0012\u000bÇ\u009ft\u00139¦ :D±ûÅÜt?\u0000=\u009cÕ)y¥\u001c1£ÎIZ\u00adÖ\u008cc7ÿÞt5\u0000\u0014\u009c¿)V¥ü1\u0092Î\u0000ZÿÖ\u0085±þÅ«YGìè`\u008bô2s\u009a\u0007\u0098\u009bp.Ü¢¹6\u0006Éì]\bÑ'd\u0092øws\u0090\u0007³\u009b\u0016.ü¢B6\u0003ÉÆ]\u0004Ñ!d\u0088ønsÔ\u0007ê\u009b\u0006.ô¢W6+É\u008f]|ÐÝ±³Å±YYìõ`\u0090ô/\u000bÅ\u009f!\u0013\u000e¦»:^±¹Å\u009aY?ìÕ`kô*\u000bï\u009f-\u0013\u0016¦¶:E±ø\u0010¼d¾øVMúÁ\u009fU ªÊ>.²\u000f\u0007´\u009b]\u0010¶d\u0097ø<MÕÁ\u007fU\u0016ªÀ>z²?\u0007\u0086\u009bU\u0010õd\u008eø3M\u0093ÁlU\u0016±³Å¦YEìð`Ëô$\u000bÍ\u009fc\u0013\u0019¦µ:E±óÅ\u0087Y.@¤4ç¨D\u001d®\u0091Û\u0005iú\u008en â\bWðË\u0015@¯4Ê+__\nÃìvXú,nÉ\u0091k\u0005Æ\u0089µ±³Å²YRìé`\u0087ôe\u000bÎ\u009fg\u0013\u0000¦·:C±ïÅ\u0087Y.ìÝ`sô\u000f±òÅ§YMìó`\u0097ô,\u0011xe;ù\u0098L`À\u0000T³«Z?í³\u0099\u00060\u009a\u0088\u0011me\u0003ù¢L[ÀîT\u008b«W?â³\u0085\u0006 \u009aÙ\u0011löz\u0082&\u001eÏ«~±ìÅ§YRìõ`\u008dô9\u000bÜ\u009f \u0013\u001f¦«:C±¸Å\u0096Y>ì\u0096`zô\u0019\u000bÀ\u009fu\u0013\u0001¦ê:M±øÅ\u009bYbìÔ`qô\u001d\u000b±\u009fe\u0012ÿ¦\u008e:)±ÝÅ\u0092Y#ìÊ`nô\r\u000b¼\u009fI\u0012à^=*v¶\u0083\u0003$\u008f\\\u001bèä\rpñüÎIzÕ\u0092^i*G¶ï\u0003G\u008f«\u001bÈä\u0011p¤üÐI;Õ\u009c^)*J¶³\u0003\u0005\u008f \u001bÌä`p´ý.I_Õø^\f*G¶ò\u0003\u001b\u008f¿\u001bÖämý_\u0089\u0014\u0015á F,>¸\u008aGoÓ\u0093_¬ê\u0018vðý\u000b\u0089%\u0015\u008d %,É¸ªGsÓÆ_²êYvëýT\u0089s\u0015\u009c p,Ê±ìÅ§YRìõ`\u008dô9\u000bÜ\u009f \u0013\u001f¦«:C±¸Å\u0096Y>ì\u0096`zô\u0019\u000bÀ\u009fu\u0013\u0001¦ê:X±çÅÀY ìÓ`sË\f¿G#²\u0096\u0015\u001am\u008eÙq<åÀiÿÜK@£ËX¿v#Þ\u0096v\u001a\u009a\u008eùq å\u0095iáÜ\n@¸Ë\u0007¿ #Á\u00961\u001a\u0093±ìÅ§YRìõ`\u008dô9\u000bÜ\u009f \u0013\u001f¦«:C±¸Å\u0096Y>ì\u0096`zô\u0019\u000bÀ\u009fu\u0013\u0001¦ê:X±çÅÀY!ìÜ`s\u007få\u000b¯\u0097@\"ñ®\u0098:#±³Å²YRìé`\u0087ôe\u000bÅ\u009fa\u0013\b¦§:\\±óÅ\u0087Ì8¸r$\u009d\u0091,\u001dQ\u0089ív\u001fâ¯nÊÇ\u001f³\u001d/õ\u009aY\u0016<\u0082\u0083}ié\u008de¦Ð\fLýÇW³=/\u0081\u009a{\u0016À\u0082»}!éÛe£Ð\u0006LâÇK³5/\u0093\u009a3\u0016Ï\u0082£}\u000béâdQÐ?L¯Ç]³)/\u0098\u009a~\u0016Ã\u0082¶}Léêd_Ð.\u0012ÂfÅú4O\u0099ÃñWT¨«<P°q\u0005Ê\u0099#\u0012Ñf±ú\u0004O¡Ã\u0018W\"¨²<\u0004°s\u0005Ü\u00994\u0012×fïúOOªÃ\fWf¨×<2±Ç\u0005ø\u0099D\u0012\u009dfõúXO¢Ã\bW7¨Ì<2±³Å´YEìè`\u0080ô%\u000bÚ\u009f!\u0013\u0000¦»:R± ÅÀYuìÐ`iôS\u000bÊ\u009fw\u0013\u0005¦«:G±øÅ\u0081Y?ì×`bôX\u000b£\u009fS\u0012ö¦\u009a:3±õÅ\u0093Yhì×`e\u008a\u009cþ\u009ebv×Ú[¿Ï\u00000ê¤\u000e(/\u009d\u0094\u0001}\u008a\u008fþïbZ×ô[]Ï<0ø¤K(\u0016\u009d\u008a\u0001l\u008aÃþ\u00adb<×ô[QÏ-0\u009e¤g)Ñ\u009d°\u0001\u0010\u008aÈþâb\n×û[UÏi0\u0092¤l}-\t9\u0095Ê {¬U8½ÇXSùß\u0086jcöÇ}f\t\u0003\u0095° \b¬ã8\u008eÇSSëß\u009cj)öÑ}d\t\u0006\u0095» O¬ë8ÆÇ8SÇNþ:\u0082¦k\u0013Ú\u009f¬\u000b\u0000ôù`Bì&Y\u0099±éÅ¬YKìè`\u008bô=\u000bÆÜç¨²4J\u0081ñ\r\u0091\u0099;fÅò{±îÅ\u00adY\u000eìö`\u0096ô%\u000bÌ\u009f{\u0013\u000f¦¦:\u001e±òÅ\u0091Y,ìÑ`}ô\u0019±êÅ YOìþ`Üô|\u000bØæõ\u0092©\u000e@»í7\u0098£-\\Å±ûÅ§YNìã`\u0096ô#\u000bË\u009fQ\u0013\u0014¦ê:\u0006ðÇ\u0084\u009b\u0018r\u00adß!ªµ\u001fJ÷ÞmR(çÖ{:ðõ\u0084þ\u0018R±îÅ\u00adY\u000eìö`\u0096ô%\u000bÌ\u009f{\u0013\u000f¦¦:\u001e±ûÅ\u009bY>ìÝ`rþ\u008d\u008aÄ\u0016)OØ;\u008e§t\u0012Ë\u009e¤\n\u001fõæa]±ÝÅ²YPì¦`¶ô?\u000bÆ\u009fz\u0013\u0005¦¿:U±¶Å\u0092Y5ìÊ`>ô?\u000bÊ\u009fr\u0013\t¦©:O±ÝÅ¬YDìô`\u008bô#\u000bÌ\u009f.\u0013?¦\u0096:{±¶Å\u0096Y/ìÑ`rô\b\u000b\u0082\u009ff\u0013\t¦¶:\n±ðÅÖYz±ÝÅ¬YDìô`\u008bô#\u000bÌ\u009f.\u0013?¦\u0096:{±¶Å\u0096Y/ìÑ`rô\b\u000b\u0082\u009ff\u0013\t¦¶:\n±ðÅÖYzìí`&ôB\u0094.àm|ÎÉ.EEÑø.\fº¹6Í\u0083`\u001f\u0095±ûÅ\u00adYLìâ`\u0082ô#\u000bÛ\u009ffBr68ª×\u001ff\u0093D\u0007ä\u0015Ña\u009cýqHÚÄ³P\u0000Ó*§i;Ê\u008e2\u0002R\u0096ái\bý¿qËÄbXÚÓ0§B;ÿ\u008e\u0012\u0002¾aæ\u0015¥\u0089\u0006<å°\u0089$0ÛÎOcÃ\bvôêIaû\u0015\u0091\u0089'±\u00ad±îÅ\u00adY\u000eìõ`\u0081ô)\u000bÝ\u009f|\u0013\tj>¬°ØóDPñº}Ïé}\u0016\u009a\u00824\u000e\u001c»ü'\u001c¬§ØÎDqñ\u0085}4\u0014ó`¾üEIãÅ²Q;®\u0099:1±îÅ\u00adY\u000eìä`\u0091ô#\u000bÄ\u009fj\u0013B¦´:Y±øÅ\u0093Y?ìÊ`nô\u000e\u000bË\u009fn\u0013\u0012þñ\u008a\u00ad\u0016D£é/\u009c»)DÁÐ+\\\u0015é¼uQþ³\u008a\u0099\u00165£Ü/q»\u0004DÁÐi-¿YãÅ\np§üÒhg\u0097\u008f\u0003\u0015\u008fP:®¦B-ýYÃÅzp\u0097ü\u0005h@\u0097Þ\u0003r\u008f\r:ç¦\u000b-¢YÏÅzp\u009fü7hm\u0097è\u0003F\u008eê±ûÅ§YNìã`\u0096ô#\u000bË\u009f!\u0013\u000b¦½:_±ñÅ\u0098Y?ìç`mô\u0018\u000bÉ\u009f/\u0013\u0001¦¡:D±íÅ\u009cY%ìÑË\u001a¿F#¯\u0096\u0002\u001aw\u008eÂq*åÀiûÜQ@¾Ë\u000f¿-#\u008d\u0096)\u001aÐ\u008eëq!å\u008eiÿÜ\u001d@ýË\u0019Fy2/®Í\u001bc\u0097\n\u0003\u00adü\u0005hÿä\u008aQ;ÍíFs2\u0006®°\u001bU\u0097ò\u0003\u009bü\u007fhúäÜQpÍ\u0087Fm2\t® \u001bU\u0097à\u0003\u009dü5hçåbQDÍè\b~|=à\u009eUtÙ\u001bMµ²L&òª\u0093\u001f#\u0083Ä\bc|\u0016|Ê\b\u0089\u0094*!À\u00ad¯9\u0001ÆøRCÞ%k\u0097÷s|×\bþ\u0094\u001c!é\u00adS94ÆâR\nÞ$k\u0089÷`|Ë\b¯\u0094\u001a!æ\u00adF9;Æ\u009eRjªÍÞ¼BT÷ä{\u009bï3\u0010Ü\u00843\b\u0004½ú!\u0016±îÅ\u00adY\u000eìä`\u0091ô#\u000bÄ\u009fj\u0013B¦¶:Y±åÅ\u0084Y6ìÙ`gôR\u000bË\u009fdµ\u0093ÁÜ](è\u0089d²µrÁ+]ÎèudMð¾\u000fY\u009bê\u0017Å¢$>Òµ|Á\u0006]ðèOdëð\u0094\u000fU\u009bô±íÅ§YMìó`Êô\"\u000bß\u009f \u0013\u0001¦³:Y±øÅ\u009fY?ìÁ`m±íÅ§YMìó`Êô9\u000bÎ\u009f \u0013\n¦³:[±óÅ«Y9ìÙ`sô\u0019\u000bÐ\u009fa±íÅ§YMìó`Êô9\u000bÎ\u009f \u0013\u0000¦±:T±ÉÅ\u0090Y?ìÖ`mô\u0015\u000bÖ\u009fy±îÅ\u00adY\u000eìí`\u0081ô8\u000bÆ\u009fk\u0013\u0000¦ü:Q±øÅ\u0090Y(ì×`wô\u0018\u000b\u008c\u009fq\u0013\u0003¦©:_±ì±îÅ\u00adY\u000eìä`\u008bô%\u000bÜ\u009f \u0013\u001d¦·:]±ãÅÚY;ìÎ`zô#\u000bÌ\u009fa\u0013\u000b¦¡±îÅ\u00adY\u000eìé`\u0080ô'\u000b\u0086\u009fl\u0013\u0019¦»:\\±òÅÚY<ìÑ`pô\u001b\u000bÇ\u009fr\u0013\u0016¦¶:C±æÅ\u009aÂá¶¢*\u0001\u009fù\u0013\u0099\u0087*xÃìt`\u0000Õ©I\u0011Âû¶\u008e*<\u009fÛ\u0013u\u0087]xËìf`\u0007Õ¬I@Âõ¶\u0091*1\u009fÔ\u0013q\u0087\r±îÅ\u00adY\u000eìõ`\u009dô9\u000bÜ\u009fk\u0013\u0001¦ü:R±ãÅ\u009dY6ìÜ`0ô\u001a\u000bË\u009fn\u0013\u0001¦¡:X±øÅ\u009cY%ìÜ`d±îÅ\u00adY\u000eìõ`\u009dô9\u000bÜ\u009fk\u0013\u0001¦\u008d:U±îÅ\u0080YtìÚ`kô\u0015\u000bÎ\u009fd\u0013H¦¢:C±æÅ\u0089Y)ìÀ``ô\u0004\u000b½\u009fT\u0012ì±îÅ\u00adY\u000eìð`\u0081ô$\u000bÌ\u009fa\u0013\u001e¦ü:R±ãÅ\u009dY6ìÜ`0ô\u001a\u000bË\u009fn\u0013\u0001¦¡:X±øÅ\u009cY%ìÜ`d±îÅ\u00adY\u000eìð`\u0081ô$\u000bÌ\u009fa\u0013\u001e¦\u008d:T±úÅ\u009fY7ì\u0096`|ô\t\u000bË\u009fl\u0013\u0002¦ê:L±áÅ\u0080Y+ì×`bô\u0006\u000b¦\u009fS\u0012ö¦\u008a±´ÿ\u0019\u008bK±¦ï\u009f\u0011Âe×ù4L\u0081ÀºTJ«¼?\u0012³h\u0006ü\u009a1\u0011\u008eeõùN\u0085ëñþm\u001dØ¨T\u0093Àa?\u009f«5'_\u0092ï\u000e\u001c\u0085áñÎmcØ\u0093T#ÀF?\u009b«6'Z\u0092Ã\u000e\u0015\u0085µñØmmØ\u008e±³Å¦YEìð`Ëô9\u000bÇ\u009fm\u0013\u0007¦·:D±¹Å\u0093Y?ìÖ`gô\u0018\u001aªn¿ò\\GéËÒ_  Þ4t¸\u001e\r®\u0091]\u001a n\u009cò&GÌËr_\u00017ÓCÑß9j\u0095æ«r[\u008d\u00ad\u0019\u0003\u0095y í¼$7\u0084CõßYj½±³Å±YYìõ`\u0090ô/\u000bÅ\u009f!\u0013\u0000¦»:R±¹Å\u0098Y3ìÚ`}ô#\u000bÏ\u009fa\u0013\n¦¨:E±ëÅ±Y(ì×`rô\u0003\u000b³\u009fe\u0012é¦\u009b:1±÷ÅÎY5ìË±³Å¦YEìð`Ëô(\u000bÛ\u009fz\u00133¦µ:@±å±³Å¦YEìð`Ëô(\u000bÛ\u009fz\u00133¦¦:Y±ûÅ\u0091lð\u0018å\u0084\u00061³½\u0088)zÖ\u0084B.ÎD{ôç\u0007lú\u0018Õ\u0084j1\u008f½;)PÖ\u008dB'Î@{õç\r±³Å±YYìõ`\u0090ô/\u000bÅ\u009f!\u0013\u0000¦»:R±¹Å\u0098Y3ìÚ`|ô\u000f\u000bÖ\u009ff\u0013\t¦¨:N±íÅ\u009cY\u0013ìØ`~ô\u001f\u000bú\u009fI\u0012÷±³Å¦YEìð`Ëô(\u000bÛ\u009fz\u0013\r¦±:S±ó¥´Ñ¡MBø÷tÌà/\u001fÜ\u008b}\u0007\f²¬.E¥þ±³Å¦YEìð`Ëô(\u000bÛ\u009fz\u0013\u0001¦·:W±øfA\u0012T\u008e·;\u0002·9#ÚÜ)H\u0088ÄñqRí«f\u0001ðø\u0084í\u0018\u000e\u00ad»!\u0080µcJ\u0090Þ1RQçô{\bðº±³Å¦YEìð`Ëô(\u000bÛ\u009fz\u0013\u001c¦µ:Q±ÿÅ\u0084Y9±³Å¦YEìð`Ëô(\u000bÛ\u009fz\u00133¦»:]±óü¼\u0088©\u0014N¡ý-\u008a¹jFÃÒn^\u0014ë³wSüö\u0088\u009a\u00141¡Ä->¹]FÕÒm^Fë©wVüó\u0088\u008a&½R¡Î@{ü÷Åc3\u009cÏ\bn\u0084\u00061³\u00adI&ëRÕÎ\u0016{Å÷dc!\u009cÄ\bo\u0084\u001a1¯\u00ad@&ÀR\u008fÎ.{Ø÷{c\n±³Å²YRìé`\u0087ôe\u000bÁ\u009fa\u0013\u001c¦½:B±âÅ\u0087½ÔÉÜU>àÞl¦5ËAÊÝ*h\u0091äÿp\u001d\u008f£\u001b\u0013\u0097x\"Ì¾g5\u0083AíÝRh³±ûÅ°YAìê`\u0088ô%\u000bË\u009f \u0013\u000b¦½:\\±òÅ\u0092Y3ìË`vôR\u000bÑ\u009fo±ðÅ«YBìÁ`¨ô\u000f\u000bû\u009fQ\u0013\u000e¦¡:D±¸Å\u0087Y59\u009eM\u008aÑydÈèæ|\n\u0083à\u0017G\u009b(.\u009e²B9ØM¶Ñ\u0013dðèP|\"\u0083¡\u0017U\u009b&.\u0085±þÅ®YUìã`\u0097ô>\u000bÉ\u009fm\u0013\u0007¦¡¶nÂz^\u0089ë8g\u0016óú\f\u001a\u0098¦\u0014ß¡{=\u009e\u0087ÿóêo\rÚ¾VÉÂ)=\u0080©-%W\u0090ð\f\u0010\u0087µóÙorÚ\u0087V}Â\u001e=\u008a©<%\u0005\u0090é\f\u0016\u0087´óÑo.Ú\u0086V1ÂV\u0014&`'üÇI|Å\u0012Qð®^:ë¶\u008c\u0003.\u009fË\u0014e`\u000e±ÛÅ\u00adYLìâ`\u0082ô#\u000bÛ\u009fføº\u008c¯\u0010H¥û)\u008c½lBÌÖnZ\u0016ï¸s\u0016øï\u008c\u008f\u0010<¥×)~½\u0019BÎÖzZ@ï®sVøó\u008cÈ\u0010u¥\u0094)z½\u0010B°Ö\u001d[üï\u009es6øù\u008c\u0086\u00109¥Ä)q½\u0015BéÖH[þï\u0094s*øÔ\u008c~\u0010\u0014".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2154);
        b = cArr;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1169929973462284862L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(int r6, int r7, byte r8) {
        /*
            int r7 = r7 * 3
            int r7 = 3 - r7
            byte[] r0 = com.google.firebase.remoteconfig.ConfigUpdate.$$c
            int r6 = r6 * 4
            int r1 = 1 - r6
            int r8 = r8 * 3
            int r8 = 115 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            r3 = -1
            if (r0 != 0) goto L19
            r4 = r3
            r3 = r7
            goto L31
        L19:
            r5 = r8
            r8 = r7
            r7 = r5
        L1c:
            int r3 = r3 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r6) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L2b:
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L31:
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.ConfigUpdate.$$e(int, int, byte):java.lang.String");
    }
}

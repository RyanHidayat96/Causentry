package com.google.android.gms.internal.measurement;

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
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.material.internal.MultiViewUpdateListener;
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
import kotlin.UByte;

/* JADX INFO: loaded from: classes5.dex */
public final class zzmq extends zzmr {
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static final byte[] $$c = {94, -56, 58, -24};
    private static final int $$d = 254;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {27, -8, 5, 78};
    private static final int $$b = 252;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int b = 1;

    public zzmq(String str) {
        super("Protocol message tag had invalid wire type.");
    }

    private static void c(byte b2, byte b3, byte b4, Object[] objArr) {
        int i = b3 * 2;
        byte[] bArr = $$a;
        int i2 = 103 - b4;
        int i3 = b2 + 4;
        byte[] bArr2 = new byte[i + 1];
        int i4 = -1;
        if (bArr == null) {
            i2 = (-i2) + i;
            i4 = -1;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i2;
            if (i5 == i) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i3++;
            i2 = (-bArr[i3]) + i2;
            i4 = i5;
        }
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
        long[] jArr = new long[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            int i4 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            try {
                Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3[i + i4])};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 + 2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 2187 - View.combineMeasuredStates(0, 0), AndroidCharacter.getMirror('0') - '\b', 841711447, false, $$e(b2, b3, (byte) (b3 - 2)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), Integer.valueOf(c)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (33016 - TextUtils.lastIndexOf("", '0')), 3010 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 25 - TextUtils.lastIndexOf("", '0'), 321985076, false, $$e(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 36504), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3375, 17 - ExpandableListView.getPackedPositionType(0L), -968507904, false, $$e(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                int i5 = $11 + 99;
                $10 = i5 % 128;
                int i6 = i5 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
            cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
            Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                byte b8 = (byte) 0;
                byte b9 = (byte) (b8 + 1);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 36505), 3375 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 17 - Color.alpha(0), -968507904, false, $$e(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
        int i7 = $10 + 5;
        $11 = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 59 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0990  */
    /* JADX WARN: Code duplicated, block: B:104:0x099d  */
    /* JADX WARN: Code duplicated, block: B:105:0x099f  */
    /* JADX WARN: Code duplicated, block: B:121:0x0aee  */
    /* JADX WARN: Code duplicated, block: B:124:0x0afd A[Catch: all -> 0x02fe, TryCatch #21 {all -> 0x02fe, blocks: (B:10:0x01c5, B:12:0x01d2, B:13:0x020d, B:25:0x03d2, B:27:0x03df, B:28:0x0420, B:39:0x0536, B:41:0x0543, B:42:0x0580, B:68:0x07b2, B:70:0x07b8, B:71:0x07f1, B:122:0x0af0, B:124:0x0afd, B:125:0x0b3c, B:132:0x0c2d, B:134:0x0c3a, B:135:0x0c7a, B:191:0x0e2b, B:193:0x0e38, B:194:0x0e7c, B:209:0x1019, B:211:0x1026, B:212:0x106d, B:337:0x14c7, B:339:0x14d4, B:340:0x1514, B:352:0x1648, B:354:0x1655, B:355:0x1697, B:362:0x1765, B:364:0x176b, B:365:0x179f, B:371:0x183c, B:373:0x184e, B:374:0x188a, B:385:0x1a0b, B:387:0x1a18, B:389:0x1a63, B:391:0x1a6c, B:393:0x1a84, B:394:0x1acb, B:448:0x299a, B:450:0x29a7, B:451:0x29f1, B:468:0x2fdc, B:470:0x2fe9, B:471:0x302c, B:477:0x30ec, B:479:0x30f9, B:480:0x3133, B:494:0x343f, B:496:0x344c, B:498:0x34a8, B:537:0x376c, B:539:0x3779, B:540:0x37af, B:454:0x29ff, B:456:0x2a17, B:457:0x2a61, B:402:0x2741, B:404:0x274e, B:406:0x27a6, B:375:0x18cc, B:377:0x18df, B:378:0x191b, B:217:0x107f, B:219:0x108c, B:220:0x10d1, B:49:0x0690, B:51:0x069d, B:52:0x06e7, B:58:0x072b, B:60:0x0738, B:61:0x0780), top: B:590:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x0bcf A[LOOP:2: B:120:0x0aec->B:129:0x0bcf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:134:0x0c3a A[Catch: all -> 0x02fe, TryCatch #21 {all -> 0x02fe, blocks: (B:10:0x01c5, B:12:0x01d2, B:13:0x020d, B:25:0x03d2, B:27:0x03df, B:28:0x0420, B:39:0x0536, B:41:0x0543, B:42:0x0580, B:68:0x07b2, B:70:0x07b8, B:71:0x07f1, B:122:0x0af0, B:124:0x0afd, B:125:0x0b3c, B:132:0x0c2d, B:134:0x0c3a, B:135:0x0c7a, B:191:0x0e2b, B:193:0x0e38, B:194:0x0e7c, B:209:0x1019, B:211:0x1026, B:212:0x106d, B:337:0x14c7, B:339:0x14d4, B:340:0x1514, B:352:0x1648, B:354:0x1655, B:355:0x1697, B:362:0x1765, B:364:0x176b, B:365:0x179f, B:371:0x183c, B:373:0x184e, B:374:0x188a, B:385:0x1a0b, B:387:0x1a18, B:389:0x1a63, B:391:0x1a6c, B:393:0x1a84, B:394:0x1acb, B:448:0x299a, B:450:0x29a7, B:451:0x29f1, B:468:0x2fdc, B:470:0x2fe9, B:471:0x302c, B:477:0x30ec, B:479:0x30f9, B:480:0x3133, B:494:0x343f, B:496:0x344c, B:498:0x34a8, B:537:0x376c, B:539:0x3779, B:540:0x37af, B:454:0x29ff, B:456:0x2a17, B:457:0x2a61, B:402:0x2741, B:404:0x274e, B:406:0x27a6, B:375:0x18cc, B:377:0x18df, B:378:0x191b, B:217:0x107f, B:219:0x108c, B:220:0x10d1, B:49:0x0690, B:51:0x069d, B:52:0x06e7, B:58:0x072b, B:60:0x0738, B:61:0x0780), top: B:590:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x0c85  */
    /* JADX WARN: Code duplicated, block: B:139:0x0cb9  */
    /* JADX WARN: Code duplicated, block: B:140:0x0cbf  */
    /* JADX WARN: Code duplicated, block: B:149:0x0d46  */
    /* JADX WARN: Code duplicated, block: B:154:0x0d51  */
    /* JADX WARN: Code duplicated, block: B:156:0x0d5d  */
    /* JADX WARN: Code duplicated, block: B:157:0x0d6b  */
    /* JADX WARN: Code duplicated, block: B:158:0x0d73 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:159:0x0d75  */
    /* JADX WARN: Code duplicated, block: B:161:0x0d79  */
    /* JADX WARN: Code duplicated, block: B:163:0x0d86 A[Catch: all -> 0x0de0, IOException -> 0x0dee, TRY_ENTER, TRY_LEAVE, TryCatch #35 {IOException -> 0x0dee, all -> 0x0de0, blocks: (B:146:0x0d3c, B:147:0x0d40, B:152:0x0d4b, B:163:0x0d86), top: B:602:0x0d3c }] */
    /* JADX WARN: Code duplicated, block: B:166:0x0da4 A[LOOP:22: B:162:0x0d84->B:166:0x0da4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:173:0x0dc2  */
    /* JADX WARN: Code duplicated, block: B:174:0x0dc4  */
    /* JADX WARN: Code duplicated, block: B:178:0x0dd9  */
    /* JADX WARN: Code duplicated, block: B:189:0x0df3  */
    /* JADX WARN: Code duplicated, block: B:193:0x0e38 A[Catch: all -> 0x02fe, TryCatch #21 {all -> 0x02fe, blocks: (B:10:0x01c5, B:12:0x01d2, B:13:0x020d, B:25:0x03d2, B:27:0x03df, B:28:0x0420, B:39:0x0536, B:41:0x0543, B:42:0x0580, B:68:0x07b2, B:70:0x07b8, B:71:0x07f1, B:122:0x0af0, B:124:0x0afd, B:125:0x0b3c, B:132:0x0c2d, B:134:0x0c3a, B:135:0x0c7a, B:191:0x0e2b, B:193:0x0e38, B:194:0x0e7c, B:209:0x1019, B:211:0x1026, B:212:0x106d, B:337:0x14c7, B:339:0x14d4, B:340:0x1514, B:352:0x1648, B:354:0x1655, B:355:0x1697, B:362:0x1765, B:364:0x176b, B:365:0x179f, B:371:0x183c, B:373:0x184e, B:374:0x188a, B:385:0x1a0b, B:387:0x1a18, B:389:0x1a63, B:391:0x1a6c, B:393:0x1a84, B:394:0x1acb, B:448:0x299a, B:450:0x29a7, B:451:0x29f1, B:468:0x2fdc, B:470:0x2fe9, B:471:0x302c, B:477:0x30ec, B:479:0x30f9, B:480:0x3133, B:494:0x343f, B:496:0x344c, B:498:0x34a8, B:537:0x376c, B:539:0x3779, B:540:0x37af, B:454:0x29ff, B:456:0x2a17, B:457:0x2a61, B:402:0x2741, B:404:0x274e, B:406:0x27a6, B:375:0x18cc, B:377:0x18df, B:378:0x191b, B:217:0x107f, B:219:0x108c, B:220:0x10d1, B:49:0x0690, B:51:0x069d, B:52:0x06e7, B:58:0x072b, B:60:0x0738, B:61:0x0780), top: B:590:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:197:0x0ebb  */
    /* JADX WARN: Code duplicated, block: B:198:0x0ec2  */
    /* JADX WARN: Code duplicated, block: B:201:0x0f05  */
    /* JADX WARN: Code duplicated, block: B:202:0x0f29  */
    /* JADX WARN: Code duplicated, block: B:206:0x1008  */
    /* JADX WARN: Code duplicated, block: B:208:0x1017  */
    /* JADX WARN: Code duplicated, block: B:211:0x1026 A[Catch: all -> 0x02fe, TryCatch #21 {all -> 0x02fe, blocks: (B:10:0x01c5, B:12:0x01d2, B:13:0x020d, B:25:0x03d2, B:27:0x03df, B:28:0x0420, B:39:0x0536, B:41:0x0543, B:42:0x0580, B:68:0x07b2, B:70:0x07b8, B:71:0x07f1, B:122:0x0af0, B:124:0x0afd, B:125:0x0b3c, B:132:0x0c2d, B:134:0x0c3a, B:135:0x0c7a, B:191:0x0e2b, B:193:0x0e38, B:194:0x0e7c, B:209:0x1019, B:211:0x1026, B:212:0x106d, B:337:0x14c7, B:339:0x14d4, B:340:0x1514, B:352:0x1648, B:354:0x1655, B:355:0x1697, B:362:0x1765, B:364:0x176b, B:365:0x179f, B:371:0x183c, B:373:0x184e, B:374:0x188a, B:385:0x1a0b, B:387:0x1a18, B:389:0x1a63, B:391:0x1a6c, B:393:0x1a84, B:394:0x1acb, B:448:0x299a, B:450:0x29a7, B:451:0x29f1, B:468:0x2fdc, B:470:0x2fe9, B:471:0x302c, B:477:0x30ec, B:479:0x30f9, B:480:0x3133, B:494:0x343f, B:496:0x344c, B:498:0x34a8, B:537:0x376c, B:539:0x3779, B:540:0x37af, B:454:0x29ff, B:456:0x2a17, B:457:0x2a61, B:402:0x2741, B:404:0x274e, B:406:0x27a6, B:375:0x18cc, B:377:0x18df, B:378:0x191b, B:217:0x107f, B:219:0x108c, B:220:0x10d1, B:49:0x0690, B:51:0x069d, B:52:0x06e7, B:58:0x072b, B:60:0x0738, B:61:0x0780), top: B:590:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:216:0x107d  */
    /* JADX WARN: Code duplicated, block: B:219:0x108c A[Catch: all -> 0x02fe, TryCatch #21 {all -> 0x02fe, blocks: (B:10:0x01c5, B:12:0x01d2, B:13:0x020d, B:25:0x03d2, B:27:0x03df, B:28:0x0420, B:39:0x0536, B:41:0x0543, B:42:0x0580, B:68:0x07b2, B:70:0x07b8, B:71:0x07f1, B:122:0x0af0, B:124:0x0afd, B:125:0x0b3c, B:132:0x0c2d, B:134:0x0c3a, B:135:0x0c7a, B:191:0x0e2b, B:193:0x0e38, B:194:0x0e7c, B:209:0x1019, B:211:0x1026, B:212:0x106d, B:337:0x14c7, B:339:0x14d4, B:340:0x1514, B:352:0x1648, B:354:0x1655, B:355:0x1697, B:362:0x1765, B:364:0x176b, B:365:0x179f, B:371:0x183c, B:373:0x184e, B:374:0x188a, B:385:0x1a0b, B:387:0x1a18, B:389:0x1a63, B:391:0x1a6c, B:393:0x1a84, B:394:0x1acb, B:448:0x299a, B:450:0x29a7, B:451:0x29f1, B:468:0x2fdc, B:470:0x2fe9, B:471:0x302c, B:477:0x30ec, B:479:0x30f9, B:480:0x3133, B:494:0x343f, B:496:0x344c, B:498:0x34a8, B:537:0x376c, B:539:0x3779, B:540:0x37af, B:454:0x29ff, B:456:0x2a17, B:457:0x2a61, B:402:0x2741, B:404:0x274e, B:406:0x27a6, B:375:0x18cc, B:377:0x18df, B:378:0x191b, B:217:0x107f, B:219:0x108c, B:220:0x10d1, B:49:0x0690, B:51:0x069d, B:52:0x06e7, B:58:0x072b, B:60:0x0738, B:61:0x0780), top: B:590:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:222:0x10dc A[PHI: r6
  0x10dc: PHI (r6v1136 java.lang.String) = (r6v1132 java.lang.String), (r6v1141 java.lang.String) binds: [B:221:0x10da, B:214:0x107a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:229:0x1169  */
    /* JADX WARN: Code duplicated, block: B:237:0x121f  */
    /* JADX WARN: Code duplicated, block: B:242:0x122a A[Catch: all -> 0x128d, IOException -> 0x129b, TryCatch #30 {IOException -> 0x129b, all -> 0x128d, blocks: (B:234:0x1215, B:235:0x1218, B:240:0x1224, B:242:0x122a, B:245:0x1239, B:249:0x1240), top: B:612:0x1215 }] */
    /* JADX WARN: Code duplicated, block: B:244:0x1237 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:245:0x1239 A[Catch: all -> 0x128d, IOException -> 0x129b, TryCatch #30 {IOException -> 0x129b, all -> 0x128d, blocks: (B:234:0x1215, B:235:0x1218, B:240:0x1224, B:242:0x122a, B:245:0x1239, B:249:0x1240), top: B:612:0x1215 }] */
    /* JADX WARN: Code duplicated, block: B:247:0x123d  */
    /* JADX WARN: Code duplicated, block: B:249:0x1240 A[Catch: all -> 0x128d, IOException -> 0x129b, TRY_LEAVE, TryCatch #30 {IOException -> 0x129b, all -> 0x128d, blocks: (B:234:0x1215, B:235:0x1218, B:240:0x1224, B:242:0x122a, B:245:0x1239, B:249:0x1240), top: B:612:0x1215 }] */
    /* JADX WARN: Code duplicated, block: B:252:0x125e A[LOOP:18: B:248:0x123e->B:252:0x125e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:259:0x1281  */
    /* JADX WARN: Code duplicated, block: B:260:0x1283  */
    /* JADX WARN: Code duplicated, block: B:263:0x1289  */
    /* JADX WARN: Code duplicated, block: B:275:0x12ae  */
    /* JADX WARN: Code duplicated, block: B:277:0x12f1  */
    /* JADX WARN: Code duplicated, block: B:278:0x1301  */
    /* JADX WARN: Code duplicated, block: B:281:0x132e  */
    /* JADX WARN: Code duplicated, block: B:287:0x1353  */
    /* JADX WARN: Code duplicated, block: B:289:0x1356 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:292:0x135e A[Catch: all -> 0x13d5, IOException -> 0x13e3, TryCatch #29 {IOException -> 0x13e3, all -> 0x13d5, blocks: (B:284:0x1349, B:285:0x134c, B:290:0x1358, B:292:0x135e, B:295:0x136c, B:299:0x1373), top: B:614:0x1349 }] */
    /* JADX WARN: Code duplicated, block: B:294:0x136a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:295:0x136c A[Catch: all -> 0x13d5, IOException -> 0x13e3, TryCatch #29 {IOException -> 0x13e3, all -> 0x13d5, blocks: (B:284:0x1349, B:285:0x134c, B:290:0x1358, B:292:0x135e, B:295:0x136c, B:299:0x1373), top: B:614:0x1349 }] */
    /* JADX WARN: Code duplicated, block: B:297:0x1370  */
    /* JADX WARN: Code duplicated, block: B:299:0x1373 A[Catch: all -> 0x13d5, IOException -> 0x13e3, TRY_LEAVE, TryCatch #29 {IOException -> 0x13e3, all -> 0x13d5, blocks: (B:284:0x1349, B:285:0x134c, B:290:0x1358, B:292:0x135e, B:295:0x136c, B:299:0x1373), top: B:614:0x1349 }] */
    /* JADX WARN: Code duplicated, block: B:302:0x1391 A[LOOP:14: B:298:0x1371->B:302:0x1391, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:309:0x13b4  */
    /* JADX WARN: Code duplicated, block: B:312:0x13c6  */
    /* JADX WARN: Code duplicated, block: B:313:0x13c8  */
    /* JADX WARN: Code duplicated, block: B:327:0x13e8  */
    /* JADX WARN: Code duplicated, block: B:330:0x1400  */
    /* JADX WARN: Code duplicated, block: B:332:0x14bb  */
    /* JADX WARN: Code duplicated, block: B:333:0x14bf  */
    /* JADX WARN: Code duplicated, block: B:336:0x14c5  */
    /* JADX WARN: Code duplicated, block: B:339:0x14d4 A[Catch: all -> 0x02fe, TryCatch #21 {all -> 0x02fe, blocks: (B:10:0x01c5, B:12:0x01d2, B:13:0x020d, B:25:0x03d2, B:27:0x03df, B:28:0x0420, B:39:0x0536, B:41:0x0543, B:42:0x0580, B:68:0x07b2, B:70:0x07b8, B:71:0x07f1, B:122:0x0af0, B:124:0x0afd, B:125:0x0b3c, B:132:0x0c2d, B:134:0x0c3a, B:135:0x0c7a, B:191:0x0e2b, B:193:0x0e38, B:194:0x0e7c, B:209:0x1019, B:211:0x1026, B:212:0x106d, B:337:0x14c7, B:339:0x14d4, B:340:0x1514, B:352:0x1648, B:354:0x1655, B:355:0x1697, B:362:0x1765, B:364:0x176b, B:365:0x179f, B:371:0x183c, B:373:0x184e, B:374:0x188a, B:385:0x1a0b, B:387:0x1a18, B:389:0x1a63, B:391:0x1a6c, B:393:0x1a84, B:394:0x1acb, B:448:0x299a, B:450:0x29a7, B:451:0x29f1, B:468:0x2fdc, B:470:0x2fe9, B:471:0x302c, B:477:0x30ec, B:479:0x30f9, B:480:0x3133, B:494:0x343f, B:496:0x344c, B:498:0x34a8, B:537:0x376c, B:539:0x3779, B:540:0x37af, B:454:0x29ff, B:456:0x2a17, B:457:0x2a61, B:402:0x2741, B:404:0x274e, B:406:0x27a6, B:375:0x18cc, B:377:0x18df, B:378:0x191b, B:217:0x107f, B:219:0x108c, B:220:0x10d1, B:49:0x0690, B:51:0x069d, B:52:0x06e7, B:58:0x072b, B:60:0x0738, B:61:0x0780), top: B:590:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:344:0x15c3 A[LOOP:4: B:334:0x14c2->B:344:0x15c3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:347:0x15e1  */
    /* JADX WARN: Code duplicated, block: B:351:0x1646  */
    /* JADX WARN: Code duplicated, block: B:354:0x1655 A[Catch: all -> 0x02fe, TryCatch #21 {all -> 0x02fe, blocks: (B:10:0x01c5, B:12:0x01d2, B:13:0x020d, B:25:0x03d2, B:27:0x03df, B:28:0x0420, B:39:0x0536, B:41:0x0543, B:42:0x0580, B:68:0x07b2, B:70:0x07b8, B:71:0x07f1, B:122:0x0af0, B:124:0x0afd, B:125:0x0b3c, B:132:0x0c2d, B:134:0x0c3a, B:135:0x0c7a, B:191:0x0e2b, B:193:0x0e38, B:194:0x0e7c, B:209:0x1019, B:211:0x1026, B:212:0x106d, B:337:0x14c7, B:339:0x14d4, B:340:0x1514, B:352:0x1648, B:354:0x1655, B:355:0x1697, B:362:0x1765, B:364:0x176b, B:365:0x179f, B:371:0x183c, B:373:0x184e, B:374:0x188a, B:385:0x1a0b, B:387:0x1a18, B:389:0x1a63, B:391:0x1a6c, B:393:0x1a84, B:394:0x1acb, B:448:0x299a, B:450:0x29a7, B:451:0x29f1, B:468:0x2fdc, B:470:0x2fe9, B:471:0x302c, B:477:0x30ec, B:479:0x30f9, B:480:0x3133, B:494:0x343f, B:496:0x344c, B:498:0x34a8, B:537:0x376c, B:539:0x3779, B:540:0x37af, B:454:0x29ff, B:456:0x2a17, B:457:0x2a61, B:402:0x2741, B:404:0x274e, B:406:0x27a6, B:375:0x18cc, B:377:0x18df, B:378:0x191b, B:217:0x107f, B:219:0x108c, B:220:0x10d1, B:49:0x0690, B:51:0x069d, B:52:0x06e7, B:58:0x072b, B:60:0x0738, B:61:0x0780), top: B:590:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:359:0x173d A[LOOP:5: B:349:0x1643->B:359:0x173d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:364:0x176b A[Catch: all -> 0x02fe, TryCatch #21 {all -> 0x02fe, blocks: (B:10:0x01c5, B:12:0x01d2, B:13:0x020d, B:25:0x03d2, B:27:0x03df, B:28:0x0420, B:39:0x0536, B:41:0x0543, B:42:0x0580, B:68:0x07b2, B:70:0x07b8, B:71:0x07f1, B:122:0x0af0, B:124:0x0afd, B:125:0x0b3c, B:132:0x0c2d, B:134:0x0c3a, B:135:0x0c7a, B:191:0x0e2b, B:193:0x0e38, B:194:0x0e7c, B:209:0x1019, B:211:0x1026, B:212:0x106d, B:337:0x14c7, B:339:0x14d4, B:340:0x1514, B:352:0x1648, B:354:0x1655, B:355:0x1697, B:362:0x1765, B:364:0x176b, B:365:0x179f, B:371:0x183c, B:373:0x184e, B:374:0x188a, B:385:0x1a0b, B:387:0x1a18, B:389:0x1a63, B:391:0x1a6c, B:393:0x1a84, B:394:0x1acb, B:448:0x299a, B:450:0x29a7, B:451:0x29f1, B:468:0x2fdc, B:470:0x2fe9, B:471:0x302c, B:477:0x30ec, B:479:0x30f9, B:480:0x3133, B:494:0x343f, B:496:0x344c, B:498:0x34a8, B:537:0x376c, B:539:0x3779, B:540:0x37af, B:454:0x29ff, B:456:0x2a17, B:457:0x2a61, B:402:0x2741, B:404:0x274e, B:406:0x27a6, B:375:0x18cc, B:377:0x18df, B:378:0x191b, B:217:0x107f, B:219:0x108c, B:220:0x10d1, B:49:0x0690, B:51:0x069d, B:52:0x06e7, B:58:0x072b, B:60:0x0738, B:61:0x0780), top: B:590:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:368:0x182c  */
    /* JADX WARN: Code duplicated, block: B:370:0x183b  */
    /* JADX WARN: Code duplicated, block: B:373:0x184e A[Catch: all -> 0x02fe, TryCatch #21 {all -> 0x02fe, blocks: (B:10:0x01c5, B:12:0x01d2, B:13:0x020d, B:25:0x03d2, B:27:0x03df, B:28:0x0420, B:39:0x0536, B:41:0x0543, B:42:0x0580, B:68:0x07b2, B:70:0x07b8, B:71:0x07f1, B:122:0x0af0, B:124:0x0afd, B:125:0x0b3c, B:132:0x0c2d, B:134:0x0c3a, B:135:0x0c7a, B:191:0x0e2b, B:193:0x0e38, B:194:0x0e7c, B:209:0x1019, B:211:0x1026, B:212:0x106d, B:337:0x14c7, B:339:0x14d4, B:340:0x1514, B:352:0x1648, B:354:0x1655, B:355:0x1697, B:362:0x1765, B:364:0x176b, B:365:0x179f, B:371:0x183c, B:373:0x184e, B:374:0x188a, B:385:0x1a0b, B:387:0x1a18, B:389:0x1a63, B:391:0x1a6c, B:393:0x1a84, B:394:0x1acb, B:448:0x299a, B:450:0x29a7, B:451:0x29f1, B:468:0x2fdc, B:470:0x2fe9, B:471:0x302c, B:477:0x30ec, B:479:0x30f9, B:480:0x3133, B:494:0x343f, B:496:0x344c, B:498:0x34a8, B:537:0x376c, B:539:0x3779, B:540:0x37af, B:454:0x29ff, B:456:0x2a17, B:457:0x2a61, B:402:0x2741, B:404:0x274e, B:406:0x27a6, B:375:0x18cc, B:377:0x18df, B:378:0x191b, B:217:0x107f, B:219:0x108c, B:220:0x10d1, B:49:0x0690, B:51:0x069d, B:52:0x06e7, B:58:0x072b, B:60:0x0738, B:61:0x0780), top: B:590:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:375:0x18cc A[Catch: all -> 0x02fe, TryCatch #21 {all -> 0x02fe, blocks: (B:10:0x01c5, B:12:0x01d2, B:13:0x020d, B:25:0x03d2, B:27:0x03df, B:28:0x0420, B:39:0x0536, B:41:0x0543, B:42:0x0580, B:68:0x07b2, B:70:0x07b8, B:71:0x07f1, B:122:0x0af0, B:124:0x0afd, B:125:0x0b3c, B:132:0x0c2d, B:134:0x0c3a, B:135:0x0c7a, B:191:0x0e2b, B:193:0x0e38, B:194:0x0e7c, B:209:0x1019, B:211:0x1026, B:212:0x106d, B:337:0x14c7, B:339:0x14d4, B:340:0x1514, B:352:0x1648, B:354:0x1655, B:355:0x1697, B:362:0x1765, B:364:0x176b, B:365:0x179f, B:371:0x183c, B:373:0x184e, B:374:0x188a, B:385:0x1a0b, B:387:0x1a18, B:389:0x1a63, B:391:0x1a6c, B:393:0x1a84, B:394:0x1acb, B:448:0x299a, B:450:0x29a7, B:451:0x29f1, B:468:0x2fdc, B:470:0x2fe9, B:471:0x302c, B:477:0x30ec, B:479:0x30f9, B:480:0x3133, B:494:0x343f, B:496:0x344c, B:498:0x34a8, B:537:0x376c, B:539:0x3779, B:540:0x37af, B:454:0x29ff, B:456:0x2a17, B:457:0x2a61, B:402:0x2741, B:404:0x274e, B:406:0x27a6, B:375:0x18cc, B:377:0x18df, B:378:0x191b, B:217:0x107f, B:219:0x108c, B:220:0x10d1, B:49:0x0690, B:51:0x069d, B:52:0x06e7, B:58:0x072b, B:60:0x0738, B:61:0x0780), top: B:590:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:377:0x18df A[Catch: all -> 0x02fe, TryCatch #21 {all -> 0x02fe, blocks: (B:10:0x01c5, B:12:0x01d2, B:13:0x020d, B:25:0x03d2, B:27:0x03df, B:28:0x0420, B:39:0x0536, B:41:0x0543, B:42:0x0580, B:68:0x07b2, B:70:0x07b8, B:71:0x07f1, B:122:0x0af0, B:124:0x0afd, B:125:0x0b3c, B:132:0x0c2d, B:134:0x0c3a, B:135:0x0c7a, B:191:0x0e2b, B:193:0x0e38, B:194:0x0e7c, B:209:0x1019, B:211:0x1026, B:212:0x106d, B:337:0x14c7, B:339:0x14d4, B:340:0x1514, B:352:0x1648, B:354:0x1655, B:355:0x1697, B:362:0x1765, B:364:0x176b, B:365:0x179f, B:371:0x183c, B:373:0x184e, B:374:0x188a, B:385:0x1a0b, B:387:0x1a18, B:389:0x1a63, B:391:0x1a6c, B:393:0x1a84, B:394:0x1acb, B:448:0x299a, B:450:0x29a7, B:451:0x29f1, B:468:0x2fdc, B:470:0x2fe9, B:471:0x302c, B:477:0x30ec, B:479:0x30f9, B:480:0x3133, B:494:0x343f, B:496:0x344c, B:498:0x34a8, B:537:0x376c, B:539:0x3779, B:540:0x37af, B:454:0x29ff, B:456:0x2a17, B:457:0x2a61, B:402:0x2741, B:404:0x274e, B:406:0x27a6, B:375:0x18cc, B:377:0x18df, B:378:0x191b, B:217:0x107f, B:219:0x108c, B:220:0x10d1, B:49:0x0690, B:51:0x069d, B:52:0x06e7, B:58:0x072b, B:60:0x0738, B:61:0x0780), top: B:590:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:382:0x19c5  */
    /* JADX WARN: Code duplicated, block: B:383:0x19c8  */
    /* JADX WARN: Code duplicated, block: B:387:0x1a18 A[Catch: all -> 0x02fe, TryCatch #21 {all -> 0x02fe, blocks: (B:10:0x01c5, B:12:0x01d2, B:13:0x020d, B:25:0x03d2, B:27:0x03df, B:28:0x0420, B:39:0x0536, B:41:0x0543, B:42:0x0580, B:68:0x07b2, B:70:0x07b8, B:71:0x07f1, B:122:0x0af0, B:124:0x0afd, B:125:0x0b3c, B:132:0x0c2d, B:134:0x0c3a, B:135:0x0c7a, B:191:0x0e2b, B:193:0x0e38, B:194:0x0e7c, B:209:0x1019, B:211:0x1026, B:212:0x106d, B:337:0x14c7, B:339:0x14d4, B:340:0x1514, B:352:0x1648, B:354:0x1655, B:355:0x1697, B:362:0x1765, B:364:0x176b, B:365:0x179f, B:371:0x183c, B:373:0x184e, B:374:0x188a, B:385:0x1a0b, B:387:0x1a18, B:389:0x1a63, B:391:0x1a6c, B:393:0x1a84, B:394:0x1acb, B:448:0x299a, B:450:0x29a7, B:451:0x29f1, B:468:0x2fdc, B:470:0x2fe9, B:471:0x302c, B:477:0x30ec, B:479:0x30f9, B:480:0x3133, B:494:0x343f, B:496:0x344c, B:498:0x34a8, B:537:0x376c, B:539:0x3779, B:540:0x37af, B:454:0x29ff, B:456:0x2a17, B:457:0x2a61, B:402:0x2741, B:404:0x274e, B:406:0x27a6, B:375:0x18cc, B:377:0x18df, B:378:0x191b, B:217:0x107f, B:219:0x108c, B:220:0x10d1, B:49:0x0690, B:51:0x069d, B:52:0x06e7, B:58:0x072b, B:60:0x0738, B:61:0x0780), top: B:590:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:388:0x1a61  */
    /* JADX WARN: Code duplicated, block: B:391:0x1a6c A[Catch: all -> 0x02fe, TryCatch #21 {all -> 0x02fe, blocks: (B:10:0x01c5, B:12:0x01d2, B:13:0x020d, B:25:0x03d2, B:27:0x03df, B:28:0x0420, B:39:0x0536, B:41:0x0543, B:42:0x0580, B:68:0x07b2, B:70:0x07b8, B:71:0x07f1, B:122:0x0af0, B:124:0x0afd, B:125:0x0b3c, B:132:0x0c2d, B:134:0x0c3a, B:135:0x0c7a, B:191:0x0e2b, B:193:0x0e38, B:194:0x0e7c, B:209:0x1019, B:211:0x1026, B:212:0x106d, B:337:0x14c7, B:339:0x14d4, B:340:0x1514, B:352:0x1648, B:354:0x1655, B:355:0x1697, B:362:0x1765, B:364:0x176b, B:365:0x179f, B:371:0x183c, B:373:0x184e, B:374:0x188a, B:385:0x1a0b, B:387:0x1a18, B:389:0x1a63, B:391:0x1a6c, B:393:0x1a84, B:394:0x1acb, B:448:0x299a, B:450:0x29a7, B:451:0x29f1, B:468:0x2fdc, B:470:0x2fe9, B:471:0x302c, B:477:0x30ec, B:479:0x30f9, B:480:0x3133, B:494:0x343f, B:496:0x344c, B:498:0x34a8, B:537:0x376c, B:539:0x3779, B:540:0x37af, B:454:0x29ff, B:456:0x2a17, B:457:0x2a61, B:402:0x2741, B:404:0x274e, B:406:0x27a6, B:375:0x18cc, B:377:0x18df, B:378:0x191b, B:217:0x107f, B:219:0x108c, B:220:0x10d1, B:49:0x0690, B:51:0x069d, B:52:0x06e7, B:58:0x072b, B:60:0x0738, B:61:0x0780), top: B:590:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:393:0x1a84 A[Catch: all -> 0x02fe, TryCatch #21 {all -> 0x02fe, blocks: (B:10:0x01c5, B:12:0x01d2, B:13:0x020d, B:25:0x03d2, B:27:0x03df, B:28:0x0420, B:39:0x0536, B:41:0x0543, B:42:0x0580, B:68:0x07b2, B:70:0x07b8, B:71:0x07f1, B:122:0x0af0, B:124:0x0afd, B:125:0x0b3c, B:132:0x0c2d, B:134:0x0c3a, B:135:0x0c7a, B:191:0x0e2b, B:193:0x0e38, B:194:0x0e7c, B:209:0x1019, B:211:0x1026, B:212:0x106d, B:337:0x14c7, B:339:0x14d4, B:340:0x1514, B:352:0x1648, B:354:0x1655, B:355:0x1697, B:362:0x1765, B:364:0x176b, B:365:0x179f, B:371:0x183c, B:373:0x184e, B:374:0x188a, B:385:0x1a0b, B:387:0x1a18, B:389:0x1a63, B:391:0x1a6c, B:393:0x1a84, B:394:0x1acb, B:448:0x299a, B:450:0x29a7, B:451:0x29f1, B:468:0x2fdc, B:470:0x2fe9, B:471:0x302c, B:477:0x30ec, B:479:0x30f9, B:480:0x3133, B:494:0x343f, B:496:0x344c, B:498:0x34a8, B:537:0x376c, B:539:0x3779, B:540:0x37af, B:454:0x29ff, B:456:0x2a17, B:457:0x2a61, B:402:0x2741, B:404:0x274e, B:406:0x27a6, B:375:0x18cc, B:377:0x18df, B:378:0x191b, B:217:0x107f, B:219:0x108c, B:220:0x10d1, B:49:0x0690, B:51:0x069d, B:52:0x06e7, B:58:0x072b, B:60:0x0738, B:61:0x0780), top: B:590:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:397:0x1b86  */
    /* JADX WARN: Code duplicated, block: B:398:0x1b8e  */
    /* JADX WARN: Code duplicated, block: B:401:0x273d  */
    /* JADX WARN: Code duplicated, block: B:404:0x274e A[Catch: all -> 0x02fe, TryCatch #21 {all -> 0x02fe, blocks: (B:10:0x01c5, B:12:0x01d2, B:13:0x020d, B:25:0x03d2, B:27:0x03df, B:28:0x0420, B:39:0x0536, B:41:0x0543, B:42:0x0580, B:68:0x07b2, B:70:0x07b8, B:71:0x07f1, B:122:0x0af0, B:124:0x0afd, B:125:0x0b3c, B:132:0x0c2d, B:134:0x0c3a, B:135:0x0c7a, B:191:0x0e2b, B:193:0x0e38, B:194:0x0e7c, B:209:0x1019, B:211:0x1026, B:212:0x106d, B:337:0x14c7, B:339:0x14d4, B:340:0x1514, B:352:0x1648, B:354:0x1655, B:355:0x1697, B:362:0x1765, B:364:0x176b, B:365:0x179f, B:371:0x183c, B:373:0x184e, B:374:0x188a, B:385:0x1a0b, B:387:0x1a18, B:389:0x1a63, B:391:0x1a6c, B:393:0x1a84, B:394:0x1acb, B:448:0x299a, B:450:0x29a7, B:451:0x29f1, B:468:0x2fdc, B:470:0x2fe9, B:471:0x302c, B:477:0x30ec, B:479:0x30f9, B:480:0x3133, B:494:0x343f, B:496:0x344c, B:498:0x34a8, B:537:0x376c, B:539:0x3779, B:540:0x37af, B:454:0x29ff, B:456:0x2a17, B:457:0x2a61, B:402:0x2741, B:404:0x274e, B:406:0x27a6, B:375:0x18cc, B:377:0x18df, B:378:0x191b, B:217:0x107f, B:219:0x108c, B:220:0x10d1, B:49:0x0690, B:51:0x069d, B:52:0x06e7, B:58:0x072b, B:60:0x0738, B:61:0x0780), top: B:590:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:405:0x27a0  */
    /* JADX WARN: Code duplicated, block: B:440:0x28e3  */
    /* JADX WARN: Code duplicated, block: B:444:0x2930  */
    /* JADX WARN: Code duplicated, block: B:445:0x2945  */
    /* JADX WARN: Code duplicated, block: B:450:0x29a7 A[Catch: all -> 0x02fe, TryCatch #21 {all -> 0x02fe, blocks: (B:10:0x01c5, B:12:0x01d2, B:13:0x020d, B:25:0x03d2, B:27:0x03df, B:28:0x0420, B:39:0x0536, B:41:0x0543, B:42:0x0580, B:68:0x07b2, B:70:0x07b8, B:71:0x07f1, B:122:0x0af0, B:124:0x0afd, B:125:0x0b3c, B:132:0x0c2d, B:134:0x0c3a, B:135:0x0c7a, B:191:0x0e2b, B:193:0x0e38, B:194:0x0e7c, B:209:0x1019, B:211:0x1026, B:212:0x106d, B:337:0x14c7, B:339:0x14d4, B:340:0x1514, B:352:0x1648, B:354:0x1655, B:355:0x1697, B:362:0x1765, B:364:0x176b, B:365:0x179f, B:371:0x183c, B:373:0x184e, B:374:0x188a, B:385:0x1a0b, B:387:0x1a18, B:389:0x1a63, B:391:0x1a6c, B:393:0x1a84, B:394:0x1acb, B:448:0x299a, B:450:0x29a7, B:451:0x29f1, B:468:0x2fdc, B:470:0x2fe9, B:471:0x302c, B:477:0x30ec, B:479:0x30f9, B:480:0x3133, B:494:0x343f, B:496:0x344c, B:498:0x34a8, B:537:0x376c, B:539:0x3779, B:540:0x37af, B:454:0x29ff, B:456:0x2a17, B:457:0x2a61, B:402:0x2741, B:404:0x274e, B:406:0x27a6, B:375:0x18cc, B:377:0x18df, B:378:0x191b, B:217:0x107f, B:219:0x108c, B:220:0x10d1, B:49:0x0690, B:51:0x069d, B:52:0x06e7, B:58:0x072b, B:60:0x0738, B:61:0x0780), top: B:590:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:453:0x29fa  */
    /* JADX WARN: Code duplicated, block: B:454:0x29ff A[Catch: all -> 0x02fe, TryCatch #21 {all -> 0x02fe, blocks: (B:10:0x01c5, B:12:0x01d2, B:13:0x020d, B:25:0x03d2, B:27:0x03df, B:28:0x0420, B:39:0x0536, B:41:0x0543, B:42:0x0580, B:68:0x07b2, B:70:0x07b8, B:71:0x07f1, B:122:0x0af0, B:124:0x0afd, B:125:0x0b3c, B:132:0x0c2d, B:134:0x0c3a, B:135:0x0c7a, B:191:0x0e2b, B:193:0x0e38, B:194:0x0e7c, B:209:0x1019, B:211:0x1026, B:212:0x106d, B:337:0x14c7, B:339:0x14d4, B:340:0x1514, B:352:0x1648, B:354:0x1655, B:355:0x1697, B:362:0x1765, B:364:0x176b, B:365:0x179f, B:371:0x183c, B:373:0x184e, B:374:0x188a, B:385:0x1a0b, B:387:0x1a18, B:389:0x1a63, B:391:0x1a6c, B:393:0x1a84, B:394:0x1acb, B:448:0x299a, B:450:0x29a7, B:451:0x29f1, B:468:0x2fdc, B:470:0x2fe9, B:471:0x302c, B:477:0x30ec, B:479:0x30f9, B:480:0x3133, B:494:0x343f, B:496:0x344c, B:498:0x34a8, B:537:0x376c, B:539:0x3779, B:540:0x37af, B:454:0x29ff, B:456:0x2a17, B:457:0x2a61, B:402:0x2741, B:404:0x274e, B:406:0x27a6, B:375:0x18cc, B:377:0x18df, B:378:0x191b, B:217:0x107f, B:219:0x108c, B:220:0x10d1, B:49:0x0690, B:51:0x069d, B:52:0x06e7, B:58:0x072b, B:60:0x0738, B:61:0x0780), top: B:590:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:456:0x2a17 A[Catch: all -> 0x02fe, TryCatch #21 {all -> 0x02fe, blocks: (B:10:0x01c5, B:12:0x01d2, B:13:0x020d, B:25:0x03d2, B:27:0x03df, B:28:0x0420, B:39:0x0536, B:41:0x0543, B:42:0x0580, B:68:0x07b2, B:70:0x07b8, B:71:0x07f1, B:122:0x0af0, B:124:0x0afd, B:125:0x0b3c, B:132:0x0c2d, B:134:0x0c3a, B:135:0x0c7a, B:191:0x0e2b, B:193:0x0e38, B:194:0x0e7c, B:209:0x1019, B:211:0x1026, B:212:0x106d, B:337:0x14c7, B:339:0x14d4, B:340:0x1514, B:352:0x1648, B:354:0x1655, B:355:0x1697, B:362:0x1765, B:364:0x176b, B:365:0x179f, B:371:0x183c, B:373:0x184e, B:374:0x188a, B:385:0x1a0b, B:387:0x1a18, B:389:0x1a63, B:391:0x1a6c, B:393:0x1a84, B:394:0x1acb, B:448:0x299a, B:450:0x29a7, B:451:0x29f1, B:468:0x2fdc, B:470:0x2fe9, B:471:0x302c, B:477:0x30ec, B:479:0x30f9, B:480:0x3133, B:494:0x343f, B:496:0x344c, B:498:0x34a8, B:537:0x376c, B:539:0x3779, B:540:0x37af, B:454:0x29ff, B:456:0x2a17, B:457:0x2a61, B:402:0x2741, B:404:0x274e, B:406:0x27a6, B:375:0x18cc, B:377:0x18df, B:378:0x191b, B:217:0x107f, B:219:0x108c, B:220:0x10d1, B:49:0x0690, B:51:0x069d, B:52:0x06e7, B:58:0x072b, B:60:0x0738, B:61:0x0780), top: B:590:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:461:0x2af8  */
    /* JADX WARN: Code duplicated, block: B:487:0x3205  */
    /* JADX WARN: Code duplicated, block: B:491:0x3421  */
    /* JADX WARN: Code duplicated, block: B:493:0x3431  */
    /* JADX WARN: Code duplicated, block: B:496:0x344c A[Catch: all -> 0x02fe, TryCatch #21 {all -> 0x02fe, blocks: (B:10:0x01c5, B:12:0x01d2, B:13:0x020d, B:25:0x03d2, B:27:0x03df, B:28:0x0420, B:39:0x0536, B:41:0x0543, B:42:0x0580, B:68:0x07b2, B:70:0x07b8, B:71:0x07f1, B:122:0x0af0, B:124:0x0afd, B:125:0x0b3c, B:132:0x0c2d, B:134:0x0c3a, B:135:0x0c7a, B:191:0x0e2b, B:193:0x0e38, B:194:0x0e7c, B:209:0x1019, B:211:0x1026, B:212:0x106d, B:337:0x14c7, B:339:0x14d4, B:340:0x1514, B:352:0x1648, B:354:0x1655, B:355:0x1697, B:362:0x1765, B:364:0x176b, B:365:0x179f, B:371:0x183c, B:373:0x184e, B:374:0x188a, B:385:0x1a0b, B:387:0x1a18, B:389:0x1a63, B:391:0x1a6c, B:393:0x1a84, B:394:0x1acb, B:448:0x299a, B:450:0x29a7, B:451:0x29f1, B:468:0x2fdc, B:470:0x2fe9, B:471:0x302c, B:477:0x30ec, B:479:0x30f9, B:480:0x3133, B:494:0x343f, B:496:0x344c, B:498:0x34a8, B:537:0x376c, B:539:0x3779, B:540:0x37af, B:454:0x29ff, B:456:0x2a17, B:457:0x2a61, B:402:0x2741, B:404:0x274e, B:406:0x27a6, B:375:0x18cc, B:377:0x18df, B:378:0x191b, B:217:0x107f, B:219:0x108c, B:220:0x10d1, B:49:0x0690, B:51:0x069d, B:52:0x06e7, B:58:0x072b, B:60:0x0738, B:61:0x0780), top: B:590:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:497:0x34a0  */
    /* JADX WARN: Code duplicated, block: B:502:0x3548 A[LOOP:8: B:492:0x342f->B:502:0x3548, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:509:0x35e7  */
    /* JADX WARN: Code duplicated, block: B:514:0x3633  */
    /* JADX WARN: Code duplicated, block: B:521:0x36da A[Catch: Exception -> 0x36f7, TryCatch #8 {Exception -> 0x36f7, blocks: (B:519:0x368e, B:521:0x36da, B:529:0x36ed, B:531:0x36f3, B:532:0x36f4), top: B:570:0x358a }] */
    /* JADX WARN: Code duplicated, block: B:522:0x36e0  */
    /* JADX WARN: Code duplicated, block: B:531:0x36f3 A[Catch: Exception -> 0x36f7, TryCatch #8 {Exception -> 0x36f7, blocks: (B:519:0x368e, B:521:0x36da, B:529:0x36ed, B:531:0x36f3, B:532:0x36f4), top: B:570:0x358a }] */
    /* JADX WARN: Code duplicated, block: B:532:0x36f4 A[Catch: Exception -> 0x36f7, TRY_LEAVE, TryCatch #8 {Exception -> 0x36f7, blocks: (B:519:0x368e, B:521:0x36da, B:529:0x36ed, B:531:0x36f3, B:532:0x36f4), top: B:570:0x358a }] */
    /* JADX WARN: Code duplicated, block: B:539:0x3779 A[Catch: all -> 0x02fe, TryCatch #21 {all -> 0x02fe, blocks: (B:10:0x01c5, B:12:0x01d2, B:13:0x020d, B:25:0x03d2, B:27:0x03df, B:28:0x0420, B:39:0x0536, B:41:0x0543, B:42:0x0580, B:68:0x07b2, B:70:0x07b8, B:71:0x07f1, B:122:0x0af0, B:124:0x0afd, B:125:0x0b3c, B:132:0x0c2d, B:134:0x0c3a, B:135:0x0c7a, B:191:0x0e2b, B:193:0x0e38, B:194:0x0e7c, B:209:0x1019, B:211:0x1026, B:212:0x106d, B:337:0x14c7, B:339:0x14d4, B:340:0x1514, B:352:0x1648, B:354:0x1655, B:355:0x1697, B:362:0x1765, B:364:0x176b, B:365:0x179f, B:371:0x183c, B:373:0x184e, B:374:0x188a, B:385:0x1a0b, B:387:0x1a18, B:389:0x1a63, B:391:0x1a6c, B:393:0x1a84, B:394:0x1acb, B:448:0x299a, B:450:0x29a7, B:451:0x29f1, B:468:0x2fdc, B:470:0x2fe9, B:471:0x302c, B:477:0x30ec, B:479:0x30f9, B:480:0x3133, B:494:0x343f, B:496:0x344c, B:498:0x34a8, B:537:0x376c, B:539:0x3779, B:540:0x37af, B:454:0x29ff, B:456:0x2a17, B:457:0x2a61, B:402:0x2741, B:404:0x274e, B:406:0x27a6, B:375:0x18cc, B:377:0x18df, B:378:0x191b, B:217:0x107f, B:219:0x108c, B:220:0x10d1, B:49:0x0690, B:51:0x069d, B:52:0x06e7, B:58:0x072b, B:60:0x0738, B:61:0x0780), top: B:590:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:542:0x3866  */
    /* JADX WARN: Code duplicated, block: B:606:0x0d26 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:608:0x0926 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:610:0x1209 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:616:0x133d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:622:0x0bdc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:623:0x0bc5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:624:0x10f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:625:0x10e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:626:0x10e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:627:0x10e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:628:0x10e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:629:0x15b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:630:0x15cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:632:0x1732 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:633:0x174e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:639:0x3572 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:640:0x353e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:647:0x13b2 A[EDGE_INSN: B:647:0x13b2->B:308:0x13b2 BREAK  A[LOOP:11: B:285:0x134c->B:307:0x13ab], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:653:0x139c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:654:0x1398 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:656:0x127f A[EDGE_INSN: B:656:0x127f->B:258:0x127f BREAK  A[LOOP:15: B:235:0x1218->B:257:0x1278], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:662:0x1269 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:663:0x1265 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:665:0x0dc0 A[EDGE_INSN: B:665:0x0dc0->B:172:0x0dc0 BREAK  A[LOOP:19: B:147:0x0d40->B:171:0x0dbb], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:671:0x0db0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:672:0x0dae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:674:0x098e A[EDGE_INSN: B:674:0x098e->B:100:0x098e BREAK  A[LOOP:23: B:78:0x0935->B:99:0x098b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:680:0x0984 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:681:0x0982 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x07b8 A[Catch: all -> 0x02fe, TryCatch #21 {all -> 0x02fe, blocks: (B:10:0x01c5, B:12:0x01d2, B:13:0x020d, B:25:0x03d2, B:27:0x03df, B:28:0x0420, B:39:0x0536, B:41:0x0543, B:42:0x0580, B:68:0x07b2, B:70:0x07b8, B:71:0x07f1, B:122:0x0af0, B:124:0x0afd, B:125:0x0b3c, B:132:0x0c2d, B:134:0x0c3a, B:135:0x0c7a, B:191:0x0e2b, B:193:0x0e38, B:194:0x0e7c, B:209:0x1019, B:211:0x1026, B:212:0x106d, B:337:0x14c7, B:339:0x14d4, B:340:0x1514, B:352:0x1648, B:354:0x1655, B:355:0x1697, B:362:0x1765, B:364:0x176b, B:365:0x179f, B:371:0x183c, B:373:0x184e, B:374:0x188a, B:385:0x1a0b, B:387:0x1a18, B:389:0x1a63, B:391:0x1a6c, B:393:0x1a84, B:394:0x1acb, B:448:0x299a, B:450:0x29a7, B:451:0x29f1, B:468:0x2fdc, B:470:0x2fe9, B:471:0x302c, B:477:0x30ec, B:479:0x30f9, B:480:0x3133, B:494:0x343f, B:496:0x344c, B:498:0x34a8, B:537:0x376c, B:539:0x3779, B:540:0x37af, B:454:0x29ff, B:456:0x2a17, B:457:0x2a61, B:402:0x2741, B:404:0x274e, B:406:0x27a6, B:375:0x18cc, B:377:0x18df, B:378:0x191b, B:217:0x107f, B:219:0x108c, B:220:0x10d1, B:49:0x0690, B:51:0x069d, B:52:0x06e7, B:58:0x072b, B:60:0x0738, B:61:0x0780), top: B:590:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0923  */
    /* JADX WARN: Code duplicated, block: B:80:0x093c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0947  */
    /* JADX WARN: Code duplicated, block: B:86:0x094d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x094f  */
    /* JADX WARN: Code duplicated, block: B:89:0x095d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0960 A[Catch: all -> 0x09a4, IOException -> 0x09b2, TRY_ENTER, TRY_LEAVE, TryCatch #34 {IOException -> 0x09b2, all -> 0x09a4, blocks: (B:77:0x0932, B:78:0x0935, B:83:0x0941, B:91:0x0960), top: B:604:0x0932 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x097c A[LOOP:26: B:90:0x095e->B:94:0x097c, LOOP_END] */
    public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context, int i, int i2, int i3) throws Throwable {
        int i4;
        int offsetBefore;
        int i5;
        int i6;
        String str;
        String str2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str3;
        byte[] bytes;
        int length;
        Throwable th;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2;
        int i14;
        int i15;
        byte[] bArr;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        String[] strArr;
        int i24;
        int i25;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        String str4;
        int i26;
        String str5;
        byte[] bytes2;
        int length2;
        Throwable th2;
        BufferedInputStream bufferedInputStream3;
        BufferedInputStream bufferedInputStream4;
        int i27;
        int i28;
        byte[] bArr2;
        int i29;
        int i30;
        int i31;
        boolean z;
        int i32;
        int i33;
        int i34;
        int i35;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        String lowerCase;
        Object[] objArr;
        int i36;
        String[] strArr2;
        int iGreen;
        int i37;
        int i38;
        int gidForName;
        int i39;
        int i40;
        long jCurrentThreadTimeMillis;
        int i41;
        char c;
        int i42;
        int i43;
        String str6;
        byte[] bytes3;
        int length3;
        Throwable th3;
        BufferedInputStream bufferedInputStream5;
        BufferedInputStream bufferedInputStream6;
        int i44;
        byte[] bArr3;
        int i45;
        int i46;
        boolean z2;
        int i47;
        int i48;
        byte[] bArr4;
        int i49;
        byte b2;
        int i50;
        byte[] bArr5;
        int i51;
        String str7;
        int i52;
        int i53;
        int i54;
        int modifierMetaStateMask;
        byte[] bytes4;
        int length4;
        Throwable th4;
        BufferedInputStream bufferedInputStream7;
        BufferedInputStream bufferedInputStream8;
        int i55;
        int i56;
        byte[] bArr6;
        int i57;
        int i58;
        boolean z3;
        int i59;
        int i60;
        int i61;
        byte[] bArr7;
        int i62;
        byte[] bArr8;
        int i63;
        String[] strArr3;
        int i64;
        int i65;
        String str8;
        int i66;
        int i67;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        long j;
        long j2;
        int i68;
        int i69;
        String[] strArr4;
        int i70;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        long j3;
        int i71;
        int i72;
        int i73;
        int i74;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8;
        String str9;
        Object objInvoke;
        String str10;
        String str11;
        String[][] strArr5;
        StringBuilder sb;
        int i75;
        int i76;
        int i77;
        int i78;
        int i79;
        int i80;
        Object[] objArr2;
        String[] strArr6;
        int i81;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9;
        String str12;
        int i82;
        int i83;
        int iIndexOf;
        int i84;
        int i85;
        long jElapsedRealtimeNanos;
        int i86;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10;
        Object objInvoke2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11;
        int i87;
        String str13;
        String str14;
        char c2;
        String[][] strArr7;
        int i88;
        int i89;
        String str15;
        int i90;
        int i91;
        int i92;
        int i93;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12;
        Throwable th5;
        Throwable cause;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13;
        String str16;
        int i94;
        int i95;
        String[] strArr8;
        int length5;
        int i96;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14;
        int i97;
        int i98;
        int i99;
        int i100;
        int i101;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15;
        long j4;
        int i102;
        int i103;
        int i104;
        int i105;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17;
        String[] strArr9;
        int i106;
        int i107;
        String[] strArr10;
        String str17;
        int i108;
        int i109;
        int i110;
        int i111;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18;
        int i112;
        int i113;
        int i114;
        int i115;
        int i116;
        int i117;
        int i118;
        int i119;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19;
        String str18;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20;
        Object[] objArr3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21;
        String[] strArr11;
        int i120;
        int i121;
        int i122 = 2 % 2;
        char c3 = 0;
        int i123 = -View.resolveSizeAndState(0, 0, 0);
        int i124 = 1;
        int i125 = (i123 ^ 908) + ((i123 & 908) << 1);
        int i126 = -(-(ViewConfiguration.getTapTimeout() >> 16));
        Object[] objArr4 = new Object[1];
        a(i125, (i126 ^ 8) + ((i126 & 8) << 1), (char) View.combineMeasuredStates(0, 0), objArr4);
        String str19 = (String) objArr4[0];
        new ArrayList();
        String[] strArr12 = new String[4];
        int iMyTid = Process.myTid() >> 22;
        int iMyTid2 = (Process.myTid() >> 22) + 27;
        int i127 = ~i;
        int i128 = 276906218 + (((~((-773824496) | i127)) | 772672975) * 446);
        int i129 = ~(((-1151521) & i) | ((-1151521) ^ i));
        int i130 = i128 + (((i129 & (-1855971312)) | ((-1855971312) ^ i129)) * 446) + 1014763170;
        int i131 = ~MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i132 = ~(((-629429713) ^ i131) | ((-629429713) & i131));
        int i133 = -(-(((545521744 ^ i132) | (i132 & 545521744)) * (-241)));
        int i134 = (825345994 & i133) + (i133 | 825345994);
        int i135 = (i134 & (-1447865098)) + (i134 | (-1447865098));
        int i136 = i131 | (-629429713);
        int i137 = ~((i136 & (-223475627)) | (i136 ^ (-223475627)));
        int i138 = -(-(((i137 & (-768997371)) | ((-768997371) ^ i137)) * 241));
        String str20 = "";
        if (i130 > ((i135 | i138) << 1) - (i138 ^ i135)) {
            Object[] objArr5 = new Object[1];
            a(iMyTid, iMyTid2, (char) ((-1) % (Process.getElapsedCpuTime() > 1L ? 1 : (Process.getElapsedCpuTime() == 1L ? 0 : -1))), objArr5);
            strArr12[0] = (String) objArr5[0];
            i4 = 16 - (~(-(ViewConfiguration.getLongPressTimeout() >>> 36)));
            offsetBefore = 93 % TextUtils.getOffsetBefore("", 0);
            i5 = 32583;
            i6 = 1;
        } else {
            Object[] objArr6 = new Object[1];
            a(iMyTid, iMyTid2, (char) ((-2) - (~(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))), objArr6);
            strArr12[0] = (String) objArr6[0];
            int longPressTimeout = ViewConfiguration.getLongPressTimeout() >> 16;
            i4 = ((longPressTimeout & 27) << 1) + (longPressTimeout ^ 27);
            int i139 = -TextUtils.getOffsetBefore("", 0);
            offsetBefore = ((i139 & 25) << 1) + (i139 ^ 25);
            i5 = 29091;
            i6 = 0;
        }
        int iNormalizeMetaState = KeyEvent.normalizeMetaState(i6);
        int i140 = iNormalizeMetaState * (-711);
        int i141 = -(-(i5 * 713));
        int i142 = ((i140 | i141) << 1) - (i140 ^ i141);
        int i143 = ~i5;
        int i144 = ~((i143 & iNormalizeMetaState) | (i143 ^ iNormalizeMetaState));
        int i145 = (i127 ^ iNormalizeMetaState) | (i127 & iNormalizeMetaState);
        int i146 = ~i145;
        int i147 = ((i144 ^ i146) | (i146 & i144)) * (-712);
        int i148 = (i142 & i147) + (i142 | i147);
        int i149 = ~i5;
        int i150 = (i149 ^ i127) | (i149 & i127);
        int i151 = i5 | iNormalizeMetaState;
        int i152 = -(-(((~((i150 ^ iNormalizeMetaState) | (i150 & iNormalizeMetaState))) | (~((i151 & i) | (i151 ^ i)))) * (-712)));
        int i153 = ((i148 | i152) << 1) - (i152 ^ i148);
        int i154 = ~i145;
        char c4 = (char) (i153 + (((i154 & i149) | (i149 ^ i154)) * 712));
        Object[] objArr7 = new Object[1];
        a(i4, offsetBefore, c4, objArr7);
        strArr12[1] = (String) objArr7[0];
        int gidForName2 = Process.getGidForName("") + 53;
        int i155 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
        int i156 = (i155 & 17) + (i155 | 17);
        int i157 = -Color.argb(0, 0, 0, 0);
        Object[] objArr8 = new Object[1];
        a(gidForName2, i156, (char) ((i157 & 16613) + (i157 | 16613)), objArr8);
        strArr12[2] = (String) objArr8[0];
        int i158 = 69 - (~(-(-View.MeasureSpec.getSize(0))));
        int i159 = 27 - (~(-Color.green(0)));
        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0);
        Object[] objArr9 = new Object[1];
        a(i158, i159, (char) ((iLastIndexOf ^ 30903) + ((iLastIndexOf & 30903) << 1)), objArr9);
        strArr12[3] = (String) objArr9[0];
        int i160 = 0;
        while (true) {
            if (i160 >= 4) {
                str = str19;
                str2 = str20;
                i7 = i127;
                i8 = i;
                break;
            }
            try {
                Object[] objArr10 = {strArr12[i160]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                    char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString(str20);
                    int i161 = 993 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int i162 = 8 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    byte b3 = (byte) (-1);
                    byte b4 = (byte) (b3 + 1);
                    Object[] objArr11 = new Object[i124];
                    c(b3, b4, b4, objArr11);
                    String str21 = (String) objArr11[c3];
                    Class[] clsArr = new Class[i124];
                    clsArr[c3] = String.class;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(cKeyCodeFromString, i161, i162, -545305915, false, str21, clsArr);
                }
                long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).invoke(null, objArr10)).longValue();
                long j5 = -667257390;
                str = str19;
                String[] strArr13 = strArr12;
                long j6 = -272;
                i7 = i127;
                long j7 = -1;
                long j8 = j5 ^ j7;
                str2 = str20;
                long jMaxMemory = (int) Runtime.getRuntime().maxMemory();
                long j9 = (((long) 273) * j5) + (((long) (-271)) * jLongValue) + (((((j8 | (jLongValue ^ j7)) | (jMaxMemory ^ j7)) ^ j7) | (((j5 | jLongValue) | jMaxMemory) ^ j7)) * j6) + (j6 * (((j8 | jLongValue) ^ j7) | ((j8 | jMaxMemory) ^ j7))) + (((long) 272) * (jLongValue | ((j5 | jMaxMemory) ^ j7))) + ((long) 1287716674);
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int i163 = (-818885110) + (((~(1463358256 | iMaxMemory)) | (-1463654197) | (~(1394382628 | iMaxMemory))) * (-880));
                int i164 = (~(1463358256 | (~iMaxMemory))) | (-1394382629);
                int i165 = ~(iMaxMemory | (-1463358257));
                int i166 = ((int) (j9 >> 32)) & (i163 + ((i164 | i165) * (-880)) + (i165 * 880));
                int i167 = (int) Runtime.getRuntime().totalMemory();
                int i168 = ~i167;
                int i169 = ((int) j9) & ((-1843547707) + ((1965932875 | i167) * 140) + (((~(1965932875 | i168)) | 141312) * (-280)) + (((~(i167 | (-141313))) | (~(891808010 | i168)) | 1074266177) * 140));
                if (((i166 & i169) | (i166 ^ i169)) != 0) {
                    i8 = i ^ (((i160 | 190) << 1) - (i160 ^ 190));
                    break;
                }
                i160 = ((i160 & 1) << 1) + (i160 ^ 1);
                str19 = str;
                strArr12 = strArr13;
                i127 = i7;
                str20 = str2;
                c3 = 0;
                i124 = 1;
            } catch (Throwable th6) {
                Throwable cause2 = th6.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th6;
            }
        }
        int i170 = -(-(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
        int i171 = (i170 ^ 97) + ((i170 & 97) << 1);
        int i172 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
        Object[] objArr12 = new Object[1];
        a(i171, ((i172 | 12) << 1) - (i172 ^ 12), (char) (ViewConfiguration.getTapTimeout() >> 16), objArr12);
        String str22 = (String) objArr12[0];
        int iArgb = Color.argb(0, 0, 0, 0) + 110;
        String str23 = str2;
        int i173 = -TextUtils.lastIndexOf(str23, '0');
        Object[] objArr13 = new Object[1];
        a(iArgb, (i173 ^ 12) + ((i173 & 12) << 1), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr13);
        String str24 = (String) objArr13[0];
        int i174 = -View.MeasureSpec.makeMeasureSpec(0, 0);
        int i175 = ((i174 | 123) << 1) - (i174 ^ 123);
        int i176 = -View.getDefaultSize(0, 0);
        int i177 = i176 * 450;
        int i178 = (i177 ^ (-8064)) + ((i177 & (-8064)) << 1);
        int i179 = ~i176;
        int i180 = ~(i179 | 18);
        int i181 = ((-19) & i176) | ((-19) ^ i176);
        int i182 = ~((i181 & i) | (i181 ^ i));
        int i183 = i178 + (((i180 & i182) | (i180 ^ i182)) * 449);
        int i184 = ~i176;
        int i185 = i183 + ((~((i184 & 18) | (i184 ^ 18))) * (-1347));
        int i186 = ~((i179 & 18) | (i179 ^ 18));
        int i187 = ((-19) & i7) | ((-19) ^ i7);
        int i188 = ~((i176 & i187) | (i187 ^ i176));
        int i189 = ((i188 & i186) | (i186 ^ i188)) * 449;
        Object[] objArr14 = new Object[1];
        a(i175, ((i185 | i189) << 1) - (i189 ^ i185), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), objArr14);
        String[] strArr14 = {str22, str24, (String) objArr14[0]};
        int i190 = 0;
        while (true) {
            if (i190 >= 3) {
                i9 = i8;
                i10 = i;
                break;
            }
            Object[] objArr15 = {strArr14[i190]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                char c5 = (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                int iIndexOf2 = 993 - TextUtils.indexOf(str23, str23, 0);
                int i191 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 7;
                byte b5 = (byte) (-1);
                byte b6 = (byte) (b5 + 1);
                Object[] objArr16 = new Object[1];
                c(b5, b6, b6, objArr16);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(c5, iIndexOf2, i191, -545305915, false, (String) objArr16[0], new Class[]{String.class});
            }
            long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).invoke(null, objArr15)).longValue();
            long j10 = -144885658;
            int i192 = i8;
            String[] strArr15 = strArr14;
            long j11 = -1;
            long j12 = ((j10 ^ j11) | jLongValue2) ^ j11;
            long j13 = i;
            long j14 = 70;
            long j15 = (((long) 71) * j10) + (((long) (-69)) * jLongValue2) + (((long) (-140)) * (j12 | ((jLongValue2 | j13) ^ j11))) + ((((j10 | jLongValue2) | j13) ^ j11) * j14) + (j14 * ((j11 ^ (j10 | j13)) | j12 | (((jLongValue2 ^ j11) | j10) ^ j11))) + ((long) 765344942);
            int i193 = ~i;
            int i194 = ((int) (j15 >> 32)) & (1972008040 + (((~(325597025 | i193)) | (~((-1762823437) | i193))) * (-867)) + (((~(325597025 | i)) | 1746044940 | (~((-1762823437) | i))) * (-1734)) + (((~((-1746044941) | i193)) | (~(2071641965 | i)) | (~((-16778497) | i))) * 867));
            int i195 = (~((-941021504) | i)) | 806801686;
            int i196 = ((int) j15) & ((-1537497691) + (i195 * 992) + ((i195 | (~(2050939199 | i193))) * (-496)) + ((1916719382 | i) * 496));
            if (((i194 & i196) | (i194 ^ i196)) != 0) {
                int i197 = i190 + 270;
                i10 = ((~i197) & i) | (i193 & i197);
                i9 = i192;
                break;
            }
            int i198 = ((i190 | 49) << 1) - (i190 ^ 49);
            i190 = (i198 & (-48)) + (i198 | (-48));
            i8 = i192;
            strArr14 = strArr15;
        }
        int i199 = (~i9) & i;
        int i200 = ~i;
        int i201 = i199 | (i9 & i200);
        int i202 = TuitionPaymentFragmentbindingInflater1;
        int i203 = (i202 & 109) + (i202 | 109);
        b = i203 % 128;
        int i204 = -i201;
        int i205 = i203 % 2 == 0 ? ((i201 & i204) | (i201 ^ i204)) >>> 20 : (i201 | i204) >> 31;
        int i206 = (i10 & (~i205)) | (i9 & i205);
        int iLastIndexOf2 = TextUtils.lastIndexOf(str23, '0', 0);
        Object[] objArr17 = new Object[1];
        a((iLastIndexOf2 & 142) + (iLastIndexOf2 | 142), ((byte) KeyEvent.getModifierMetaStateMask()) + 15, (char) (ViewConfiguration.getPressedStateDuration() >> 16), objArr17);
        Object[] objArr18 = {(String) objArr17[0]};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
            char defaultSize = (char) View.getDefaultSize(0, 0);
            int i207 = 994 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int maximumFlingVelocity = 8 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            byte b7 = (byte) (-1);
            byte b8 = (byte) (b7 + 1);
            Object[] objArr19 = new Object[1];
            c(b7, b8, b8, objArr19);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(defaultSize, i207, maximumFlingVelocity, -545305915, false, (String) objArr19[0], new Class[]{String.class});
        }
        long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).invoke(null, objArr18)).longValue();
        long j16 = -897574041;
        long j17 = (((long) (-520)) * j16) + (((long) 522) * jLongValue3);
        long j18 = 521;
        long j19 = -1;
        long j20 = j16 ^ j19;
        long jElapsedRealtime = (int) SystemClock.elapsedRealtime();
        long j21 = ((jLongValue3 ^ j19) | j16) ^ j19;
        long j22 = j17 + ((((j20 | jLongValue3) | jElapsedRealtime) ^ j19) * j18) + (((long) (-1042)) * j21) + (j18 * (((jLongValue3 | (j20 | (jElapsedRealtime ^ j19))) ^ j19) | j21)) + ((long) 1518033325);
        int i208 = ((int) (j22 >> 32)) & ((-774821986) + (((~((-365232177) | i)) | (~(1071994234 | i200))) * (-318)) + (((~(533004658 | i)) | 538989576) * (-318)) + (((~((-533004659) | i)) | (-904221753)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i209 = ~elapsedCpuTime;
        int i210 = ((int) j22) & ((-224864359) + (((-1074792865) | elapsedCpuTime) * (-676)) + (((~((-1178345377) | i209)) | 1074792864) * 676) + (((~(elapsedCpuTime | (-103552513))) | (~(i209 | 258881033)) | (-1333673898)) * 676));
        if (((i208 & i210) | (i208 ^ i210)) == 0) {
            int iBlue = Color.blue(0);
            int i211 = (iBlue ^ ModuleDescriptor.MODULE_VERSION) + ((iBlue & ModuleDescriptor.MODULE_VERSION) << 1);
            int i212 = 23 - (~(-(-View.MeasureSpec.getSize(0))));
            int i213 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            int i214 = (i213 * 367) - 367;
            int i215 = (i214 & 366) + (i214 | 366);
            int i216 = ~i;
            int i217 = ((i216 & i213) | (i213 ^ i216)) * (-366);
            int i218 = (i215 ^ i217) + ((i217 & i215) << 1);
            int i219 = ~i213;
            int i220 = ~(i219 | (~i219));
            int i221 = ~(i213 | i);
            int i222 = ((i221 & i220) | (i220 ^ i221)) * 366;
            Object[] objArr20 = new Object[1];
            a(i211, i212, (char) ((i218 ^ i222) + ((i222 & i218) << 1)), objArr20);
            Object[] objArr21 = {(String) objArr20[0]};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                char c6 = (char) (33602 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                int i223 = 3085 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 26;
                byte b9 = (byte) (-1);
                Object[] objArr22 = new Object[1];
                c(b9, (byte) (b9 + 1), $$a[2], objArr22);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(c6, i223, maximumDrawingCacheSize, 1411172903, false, (String) objArr22[0], new Class[]{String.class});
            }
            String str25 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).invoke(null, objArr21);
            if (str25 == null || str25.isEmpty()) {
                int i224 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                int i225 = -(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                Object[] objArr23 = new Object[1];
                a((i224 & 180) + (i224 | 180), (i225 ^ 24) + ((i225 & 24) << 1), (char) (64762 - (~(-View.MeasureSpec.getMode(0)))), objArr23);
                Object[] objArr24 = {(String) objArr23[0]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                    char cGreen = (char) (Color.green(0) + 33602);
                    int i226 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3084;
                    int i227 = 26 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    byte b10 = (byte) (-1);
                    Object[] objArr25 = new Object[1];
                    c(b10, (byte) (b10 + 1), $$a[2], objArr25);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(cGreen, i226, i227, 1411172903, false, (String) objArr25[0], new Class[]{String.class});
                }
                String str26 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).invoke(null, objArr24);
                if (str26 == null || !(!str26.isEmpty())) {
                    i11 = i;
                } else {
                    i12 = i & (-268);
                    i13 = i200 & 267;
                }
            } else {
                i11 = i ^ 267;
            }
            int i228 = ((~i206) & i) | (i206 & i200);
            int i229 = -i228;
            int i230 = ((i228 & i229) | (i228 ^ i229)) >> 31;
            int i231 = i11 & (~i230);
            int i232 = i206 & i230;
            int i233 = (i231 & i232) | (i231 ^ i232);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2061288340);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 56827);
                int modifierMetaStateMask2 = ((byte) KeyEvent.getModifierMetaStateMask()) + UByte.MAX_VALUE;
                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 9;
                byte b11 = (byte) (-1);
                Object[] objArr26 = new Object[1];
                c(b11, (byte) (b11 + 1), $$a[2], objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cCombineMeasuredStates, modifierMetaStateMask2, keyRepeatDelay, -1639816125, false, (String) objArr26[0], new Class[0]);
            }
            long jLongValue4 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
            long j23 = 2058045682;
            long j24 = (((long) 477) * j23) + (((long) (-475)) * jLongValue4);
            long j25 = ((j23 ^ j19) | jLongValue4) ^ j19;
            long j26 = jLongValue4 ^ j19;
            long jFreeMemory = (int) Runtime.getRuntime().freeMemory();
            long j27 = ((j26 | j23) | jFreeMemory) ^ j19;
            long j28 = j24 + (((long) (-476)) * (j25 | j27)) + (((long) 952) * j27) + (((long) 476) * (((j26 | (jFreeMemory ^ j19)) | j23) ^ j19)) + ((long) 55310824);
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i234 = (((int) (j28 >> 32)) & (635053320 + (((-16793617) | startElapsedRealtime) * (-627)) + (((~(61237873 | startElapsedRealtime)) | 1498464284) * (-627)) + (((~(startElapsedRealtime | 1498464284)) | (~((~startElapsedRealtime) | (-61237874)))) * 627))) | (((int) j28) & (2072280017 + ((~((-146998869) | i200)) * (-116)) + (((-1220759125) | i) * 116) + (((~(216467285 | i)) | (-1290227542)) * 116)));
            int i235 = 199 - (~(i234 - 1));
            int i236 = (i235 | i) & (~(i & i235));
            int i237 = -i234;
            int i238 = ((i234 & i237) | (i234 ^ i237)) >> 31;
            int i239 = (~i238) & i;
            int i240 = i238 & i236;
            int i241 = (i240 & i239) | (i239 ^ i240);
            int i242 = ((~i233) & i) | (i233 & i200);
            int i243 = -i242;
            int i244 = ((i242 & i243) | (i242 ^ i243)) >> 31;
            int i245 = i241 & (~i244);
            int i246 = i233 & i244;
            int i247 = (i246 & i245) | (i245 ^ i246);
            int i248 = 202 - (~(-(ViewConfiguration.getJumpTapTimeout() >> 16)));
            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 20;
            int i249 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
            Object[] objArr27 = new Object[1];
            a(i248, iResolveOpacity, (char) ((i249 & 1) + (i249 | 1)), objArr27);
            str3 = (String) objArr27[0];
            int i250 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
            int i251 = (i250 ^ 223) + ((i250 & 223) << 1);
            int i252 = -TextUtils.lastIndexOf(str23, '0', 0);
            int i253 = (i252 & 5) + (i252 | 5);
            int i254 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            Object[] objArr28 = new Object[1];
            a(i251, i253, (char) (((i254 | 46596) << 1) - (i254 ^ 46596)), objArr28);
            bytes = ((String) objArr28[0]).getBytes();
            length = bytes.length;
            if (length == 0) {
                i14 = 1;
            } else {
                try {
                    bufferedInputStream2 = new BufferedInputStream(new FileInputStream(str3));
                    i15 = 4096;
                    try {
                        bArr = new byte[4096];
                        i16 = 0;
                        while (true) {
                            i17 = bufferedInputStream2.read(bArr, 0, i15);
                            if (i17 > 0) {
                                break;
                            }
                            i19 = 0;
                            while (i16 < length && i19 < i17) {
                                if (bArr[i19] == bytes[i16]) {
                                    i16 = (i16 | 1) + (i16 & 1);
                                } else if (i16 != 0) {
                                    i20 = i16 - 1;
                                    int i255 = b + 43;
                                    TuitionPaymentFragmentbindingInflater1 = i255 % 128;
                                    int i256 = i255 % 2;
                                    while (true) {
                                        if (i20 > 0) {
                                            i16 = 0;
                                            break;
                                        }
                                        i21 = 0;
                                        while (true) {
                                            if (i21 < i20) {
                                                i16 = i20;
                                                break;
                                            }
                                            i22 = i16 - i20;
                                            if (bytes[i21] != bytes[(i22 ^ i21) + ((i22 & i21) << 1)]) {
                                                break;
                                            }
                                            i21 = (i21 | 1) + (i21 & 1);
                                        }
                                        int i257 = i20 + 73;
                                        i20 = ((i257 & (-74)) << 1) + (i257 ^ (-74));
                                    }
                                }
                                i19++;
                            }
                            i15 = 4096;
                        }
                        if (i16 == length) {
                            i18 = b + 49;
                            TuitionPaymentFragmentbindingInflater1 = i18 % 128;
                            if (i18 % 2 != 0) {
                                i14 = 0;
                            } else {
                                i14 = 1;
                            }
                        } else {
                            i14 = 0;
                        }
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
                        i14 = 0;
                    } catch (Throwable th7) {
                        th = th7;
                        bufferedInputStream = bufferedInputStream2;
                        if (bufferedInputStream == null) {
                            throw th;
                        }
                        try {
                            bufferedInputStream.close();
                            throw th;
                        } catch (IOException unused4) {
                            throw th;
                        }
                    }
                } catch (IOException unused5) {
                    bufferedInputStream2 = null;
                } catch (Throwable th8) {
                    th = th8;
                    bufferedInputStream = null;
                }
            }
            int i258 = ((-i14) | i14) >> 31;
            int i259 = (~i258) & i;
            int i260 = ((i & (-263)) | (i200 & 262)) & i258;
            int i261 = (i260 & i259) | (i259 ^ i260);
            int i262 = (~(i & i247)) & (i | i247);
            int i263 = -i262;
            int i264 = ((i262 & i263) | (i262 ^ i263)) >> 31;
            int i265 = (i247 & i264) | (i261 & (~i264));
            i23 = 4;
            int deadChar = KeyEvent.getDeadChar(0, 0);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i266 = deadChar * 399;
            int i267 = ((i266 | 91371) << 1) - (i266 ^ 91371);
            int i268 = ~deadChar;
            int i269 = (~((i268 & 229) | (i268 ^ 229))) | (~(((-230) & deadChar) | ((-230) ^ deadChar)));
            int i270 = ~(((-230) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | ((-230) & iTuitionPaymentFragmentspecialinlinedviewModeldefault1));
            int i271 = (i267 - (~(((i269 & i270) | (i269 ^ i270)) * 398))) - 1;
            int i272 = ((deadChar ^ 229) | (deadChar & 229)) * (-1194);
            int i273 = ((i271 | i272) << 1) - (i271 ^ i272);
            int i274 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault1) | (-230));
            int i275 = ~((~deadChar) | 229);
            int i276 = -(-(((i274 & i275) | (i274 ^ i275) | (~((deadChar & (-230)) | ((-230) ^ deadChar)))) * 398));
            Object[] objArr29 = new Object[1];
            a((i273 ^ i276) + ((i276 & i273) << 1), 30 - TextUtils.indexOf((CharSequence) str23, '0'), (char) KeyEvent.keyCodeFromString(str23), objArr29);
            int packedPositionGroup = 260 - ExpandableListView.getPackedPositionGroup(0L);
            int i277 = -(-(ViewConfiguration.getLongPressTimeout() >> 16));
            Object[] objArr30 = new Object[1];
            a(packedPositionGroup, (i277 ^ 23) + ((i277 & 23) << 1), (char) TextUtils.getOffsetAfter(str23, 0), objArr30);
            int i278 = TuitionPaymentFragmentbindingInflater1 + 81;
            b = i278 % 128;
            int i279 = i278 % 2;
            int i280 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int i281 = (i280 ^ 283) + ((i280 & 283) << 1);
            int i282 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int i283 = -(-ImageFormat.getBitsPerPixel(0));
            Object[] objArr31 = new Object[1];
            a(i281, (i282 & 28) + (i282 | 28), (char) ((i283 & 29500) + (i283 | 29500)), objArr31);
            int iLastIndexOf3 = 310 - TextUtils.lastIndexOf(str23, '0');
            int i284 = 13 - (~(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24)));
            int i285 = -(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
            Object[] objArr32 = new Object[1];
            a(iLastIndexOf3, i284, (char) ((i285 ^ 16338) + ((i285 & 16338) << 1)), objArr32);
            strArr = new String[]{(String) objArr29[0], (String) objArr30[0], (String) objArr31[0], (String) objArr32[0]};
            i24 = 0;
            while (true) {
                if (i24 < i23) {
                    i25 = i;
                    break;
                }
                Object[] objArr33 = {strArr[i24]};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                    char modifierMetaStateMask3 = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                    int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 993;
                    int iCombineMeasuredStates = 8 - View.combineMeasuredStates(0, 0);
                    byte b12 = (byte) (-1);
                    byte b13 = (byte) (b12 + 1);
                    Object[] objArr34 = new Object[1];
                    c(b12, b13, (byte) (b13 | 6), objArr34);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(modifierMetaStateMask3, iNormalizeMetaState2, iCombineMeasuredStates, 349342683, false, (String) objArr34[0], new Class[]{String.class});
                }
                long jLongValue5 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).invoke(null, objArr33)).longValue();
                long j29 = -51023838;
                long j30 = 530;
                long j31 = ((long) 1058) + (j30 * j29) + (j30 * jLongValue5);
                long j32 = 529;
                strArr11 = strArr;
                long jNextInt = new Random().nextInt(840354537);
                long j33 = j31 + (((((jNextInt ^ j19) | j29) ^ j19) | ((j29 | jLongValue5) ^ j19)) * j32) + (j32 * (((jNextInt | j29) ^ j19) | (jLongValue5 ^ j19))) + ((long) (-796054767));
                int i286 = ~(1870331895 | i);
                i120 = ((int) (j33 >> 32)) & ((-1737788286) + ((17836418 | i286) * (-476)) + (i286 * 952) + ((~(1870331895 | i200)) * 476));
                i121 = ((int) j33) & ((((~((-1048581) | i)) | 1099239713) * TypedValues.PositionType.TYPE_TRANSITION_EASING) + 1369119980 + ((~((-1048581) | i200)) * TypedValues.PositionType.TYPE_TRANSITION_EASING));
                if (((i120 & i121) | (i120 ^ i121)) != 0) {
                    int i287 = (i24 & 252) + (i24 | 252);
                    i25 = (i287 & i200) | ((~i287) & i);
                    break;
                }
                int i288 = i24 - 35;
                i24 = (i288 & 36) + (i288 | 36);
                strArr = strArr11;
                i23 = 4;
            }
            int i289 = (~(i & i265)) & (i | i265);
            int i290 = -i289;
            int i291 = ((i289 & i290) | (i289 ^ i290)) >> 31;
            int i292 = i25 & (~i291);
            int i293 = i265 & i291;
            int i294 = (i293 & i292) | (i292 ^ i293);
            int i295 = -Process.getGidForName(str23);
            int i296 = ((i295 | 324) << 1) - (i295 ^ 324);
            int i297 = 12 - (~(-(-(ViewConfiguration.getPressedStateDuration() >> 16))));
            int i298 = b + 21;
            TuitionPaymentFragmentbindingInflater1 = i298 % 128;
            int i299 = i298 % 2;
            int i300 = -TextUtils.indexOf((CharSequence) str23, '0', 0);
            Object[] objArr35 = new Object[1];
            a(i296, i297, (char) ((47496 ^ i300) + ((i300 & 47496) << 1)), objArr35);
            Object[] objArr36 = {(String) objArr35[0]};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 33602);
                int iLastIndexOf4 = 3084 - TextUtils.lastIndexOf(str23, '0', 0, 0);
                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 26;
                byte b14 = (byte) (-1);
                Object[] objArr37 = new Object[1];
                c(b14, (byte) (b14 + 1), $$a[2], objArr37);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(touchSlop, iLastIndexOf4, tapTimeout, 1411172903, false, (String) objArr37[0], new Class[]{String.class});
            }
            str4 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr36);
            if (str4 != null) {
                int iMyTid3 = Process.myTid() >> 22;
                int i301 = (iMyTid3 & 338) + (iMyTid3 | 338);
                int i302 = 8 - (~(ViewConfiguration.getTouchSlop() >> 8));
                int i303 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                objArr3 = new Object[1];
                a(i301, i302, (char) (((i303 | 29275) << 1) - (i303 ^ 29275)), objArr3);
                if (str4.contains((String) objArr3[0])) {
                    i26 = (i & (-251)) | (i200 & ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
                } else {
                    i26 = i;
                }
            } else {
                i26 = i;
            }
            int i304 = ((~i294) & i) | (i294 & i200);
            int i305 = -i304;
            int i306 = ((i304 & i305) | (i304 ^ i305)) >> 31;
            int i307 = i26 & (~i306);
            int i308 = i294 & i306;
            int i309 = (i308 & i307) | (i307 ^ i308);
            int i310 = 346 - (~(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))));
            int i311 = -Color.alpha(0);
            Object[] objArr38 = new Object[1];
            a(i310, (i311 ^ 17) + ((i311 & 17) << 1), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr38);
            str5 = (String) objArr38[0];
            Object[] objArr39 = new Object[1];
            a(363 - (~(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24))), 6 - TextUtils.getCapsMode(str23, 0, 0), (char) Gravity.getAbsoluteGravity(0, 0), objArr39);
            bytes2 = ((String) objArr39[0]).getBytes();
            length2 = bytes2.length;
            if (length2 == 0) {
                i27 = (~(i & 251)) & (i | 251);
            } else {
                try {
                    bufferedInputStream4 = new BufferedInputStream(new FileInputStream(str5));
                    int i312 = b + 19;
                    TuitionPaymentFragmentbindingInflater1 = i312 % 128;
                    int i313 = i312 % 2;
                    i28 = 4096;
                    try {
                        bArr2 = new byte[4096];
                        i29 = 0;
                        i30 = 0;
                        while (true) {
                            i31 = bufferedInputStream4.read(bArr2, i30, i28);
                            if (i31 > 0) {
                                break;
                            }
                            i32 = 0;
                            while (i29 < length2 && i32 < i31) {
                                if (bArr2[i32] == bytes2[i29]) {
                                    i35 = b + 25;
                                    TuitionPaymentFragmentbindingInflater1 = i35 % 128;
                                    if (i35 % 2 != 0) {
                                        int i314 = ((i29 | 140) << 1) - (i29 ^ 140);
                                        i29 = ((i314 | (-41)) << 1) - (i314 ^ (-41));
                                    } else {
                                        i29 = ((i29 & 1) << 1) + (i29 ^ 1);
                                    }
                                } else if (i29 != 0) {
                                    i33 = i29 - 1;
                                    while (true) {
                                        if (i33 > 0) {
                                            i29 = 0;
                                            break;
                                        }
                                        int i315 = b + 35;
                                        TuitionPaymentFragmentbindingInflater1 = i315 % 128;
                                        int i316 = i315 % 2;
                                        i34 = 0;
                                        while (true) {
                                            if (i34 < i33) {
                                                i29 = i33;
                                                break;
                                            }
                                            if (bytes2[i34] != bytes2[((i29 - i33) - (~(-(-i34)))) - 1]) {
                                                break;
                                            }
                                            i34 = (i34 ^ 1) + ((i34 & 1) << 1);
                                        }
                                        int i317 = (i33 ^ 13) + ((i33 & 13) << 1);
                                        i33 = (i317 & (-14)) + (i317 | (-14));
                                    }
                                }
                                i32 = (i32 | 1) + (i32 & 1);
                            }
                            i28 = 4096;
                            i30 = 0;
                        }
                        if (i29 == length2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        try {
                            bufferedInputStream4.close();
                            int i318 = TuitionPaymentFragmentbindingInflater1;
                            int i319 = ((i318 | 25) << 1) - (i318 ^ 25);
                            b = i319 % 128;
                            int i320 = i319 % 2;
                        } catch (IOException unused6) {
                        }
                        if (z) {
                            i27 = (~(i & 251)) & (i | 251);
                        } else {
                            i27 = i;
                        }
                    } catch (IOException unused7) {
                        if (bufferedInputStream4 != null) {
                            try {
                                bufferedInputStream4.close();
                            } catch (IOException unused8) {
                            }
                        }
                    } catch (Throwable th9) {
                        th2 = th9;
                        bufferedInputStream3 = bufferedInputStream4;
                        if (bufferedInputStream3 == null) {
                            throw th2;
                        }
                        try {
                            bufferedInputStream3.close();
                            throw th2;
                        } catch (IOException unused9) {
                            throw th2;
                        }
                    }
                } catch (IOException unused10) {
                    bufferedInputStream4 = null;
                } catch (Throwable th10) {
                    th2 = th10;
                    bufferedInputStream3 = null;
                }
            }
            int i321 = ((~i309) & i) | (i309 & i200);
            int i322 = (i321 | (-i321)) >> 31;
            int i323 = i27 & (~i322);
            int i324 = i309 & i322;
            int i325 = (i324 & i323) | (i323 ^ i324);
            int i326 = -(-TextUtils.getTrimmedLength(str23));
            int bitsPerPixel = ImageFormat.getBitsPerPixel(0);
            Object[] objArr40 = new Object[1];
            a((i326 & 370) + (i326 | 370), (bitsPerPixel & 24) + (bitsPerPixel | 24), (char) (KeyEvent.getDeadChar(0, 0) + 27637), objArr40);
            Object[] objArr41 = {(String) objArr40[0]};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 33602);
                int doubleTapTimeout = 3085 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0) + 27;
                byte b15 = (byte) (-1);
                Object[] objArr42 = new Object[1];
                c(b15, (byte) (b15 + 1), $$a[2], objArr42);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveOpacity, doubleTapTimeout, bitsPerPixel2, 1411172903, false, (String) objArr42[0], new Class[]{String.class});
            }
            lowerCase = ((String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr41)).toLowerCase();
            int i327 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            int i328 = ((i327 | 394) << 1) - (i327 ^ 394);
            int i329 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            objArr = new Object[1];
            a(i328, (i329 & 5) + (i329 | 5), (char) (ViewConfiguration.getEdgeSlop() >> 16), objArr);
            if (lowerCase.contains((String) objArr[0])) {
                i36 = (~(i & 264)) & (i | 264);
            } else {
                i36 = i;
            }
            int i330 = ((~i325) & i) | (i325 & i200);
            int i331 = -i330;
            int i332 = ((i330 & i331) | (i330 ^ i331)) >> 31;
            int i333 = i36 & (~i332);
            int i334 = i325 & i332;
            int i335 = (i334 & i333) | (i333 ^ i334);
            strArr2 = new String[6];
            iGreen = Color.green(0) + 397;
            int i336 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            i37 = (i336 ^ 43) + ((i336 & 43) << 1);
            int i337 = TuitionPaymentFragmentbindingInflater1;
            int i338 = ((i337 | 119) << 1) - (i337 ^ 119);
            b = i338 % 128;
            i38 = i338 % 2;
            gidForName = Process.getGidForName(str23);
            if (i38 == 0) {
                Object[] objArr43 = new Object[1];
                a(iGreen, i37, (char) (28388 % gidForName), objArr43);
                strArr2[0] = (String) objArr43[0];
                int iIndexOf3 = 15024 % TextUtils.indexOf((CharSequence) str23, 'X', 0);
                i41 = 82;
                c = 0;
                jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
                i40 = iIndexOf3;
                i39 = 0;
            } else {
                int i339 = -gidForName;
                char c7 = (char) (((i339 | 28388) << 1) - (28388 ^ i339));
                Object[] objArr44 = new Object[1];
                a(iGreen, i37, c7, objArr44);
                i39 = 0;
                strArr2[0] = (String) objArr44[0];
                i40 = 437 - (~(-TextUtils.indexOf((CharSequence) str23, '0', 0)));
                jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
                i41 = 41;
                c = 1;
            }
            Object[] objArr45 = new Object[1];
            a(i40, i41 - (jCurrentThreadTimeMillis > (-1L) ? 1 : (jCurrentThreadTimeMillis == (-1L) ? 0 : -1)), (char) TextUtils.indexOf(str23, str23, i39, i39), objArr45);
            strArr2[c] = (String) objArr45[i39];
            Object[] objArr46 = new Object[1];
            a(TextUtils.getOffsetAfter(str23, i39) + 479, 26 - (~(ViewConfiguration.getMaximumFlingVelocity() >> 16)), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr46);
            strArr2[2] = (String) objArr46[0];
            int packedPositionType = ExpandableListView.getPackedPositionType(0L);
            Object[] objArr47 = new Object[1];
            a((packedPositionType ^ TypedValues.PositionType.TYPE_PERCENT_X) + ((packedPositionType & TypedValues.PositionType.TYPE_PERCENT_X) << 1), 26 - (~Gravity.getAbsoluteGravity(0, 0)), (char) ((-2) - (~(-(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))))), objArr47);
            strArr2[3] = (String) objArr47[0];
            int fadingEdgeLength = ViewConfiguration.getFadingEdgeLength() >> 16;
            int i340 = ((fadingEdgeLength | 533) << 1) - (fadingEdgeLength ^ 533);
            int i341 = -(-View.resolveSizeAndState(0, 0, 0));
            Object[] objArr48 = new Object[1];
            a(i340, ((i341 | 27) << 1) - (i341 ^ 27), (char) (12660 - (~KeyEvent.getDeadChar(0, 0))), objArr48);
            strArr2[4] = (String) objArr48[0];
            Object[] objArr49 = new Object[1];
            a(559 - (~(-(-Color.alpha(0)))), View.MeasureSpec.getSize(0) + 27, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr49);
            strArr2[5] = (String) objArr49[0];
            i42 = 0;
            while (true) {
                if (i42 < 6) {
                    i43 = i;
                    break;
                }
                int i342 = TuitionPaymentFragmentbindingInflater1;
                i119 = (i342 & 51) + (i342 | 51);
                b = i119 % 128;
                if (i119 % 2 == 0) {
                    Object[] objArr50 = {strArr2[i42]};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                        char maximumFlingVelocity2 = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 33602);
                        int iAxisFromString = MotionEvent.axisFromString(str23) + 3086;
                        int iCombineMeasuredStates2 = View.combineMeasuredStates(0, 0) + 26;
                        byte b16 = (byte) (-1);
                        Object[] objArr51 = new Object[1];
                        c(b16, (byte) (b16 + 1), $$a[2], objArr51);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(maximumFlingVelocity2, iAxisFromString, iCombineMeasuredStates2, 1411172903, false, (String) objArr51[0], new Class[]{String.class});
                    }
                    str18 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).invoke(null, objArr50);
                    if (str18 != null) {
                        if (!str18.isEmpty()) {
                            i43 = (~(i & 265)) & (i | 265);
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Object[] objArr52 = {strArr2[i42]};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) str23, '0', 0) + 33603);
                        int i343 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3084;
                        int iLastIndexOf5 = 25 - TextUtils.lastIndexOf(str23, '0', 0);
                        byte b17 = (byte) (-1);
                        Object[] objArr53 = new Object[1];
                        c(b17, (byte) (b17 + 1), $$a[2], objArr53);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(cIndexOf, i343, iLastIndexOf5, 1411172903, false, (String) objArr53[0], new Class[]{String.class});
                    }
                    str18 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).invoke(null, objArr52);
                    int i344 = 37 / 0;
                    if (str18 != null) {
                        if (!str18.isEmpty()) {
                            i43 = (~(i & 265)) & (i | 265);
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                i42 = (((i42 | 9) << 1) - (i42 ^ 9)) - 8;
            }
            int i345 = ((~i335) & i) | (i335 & i200);
            int i346 = (i345 | (-i345)) >> 31;
            int i347 = i43 & (~i346);
            int i348 = i335 & i346;
            int i349 = (i348 & i347) | (i347 ^ i348);
            int i350 = (-16776870) - (~(-Color.rgb(0, 0, 0)));
            int i351 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
            int i352 = (i351 & 17) + (i351 | 17);
            int i353 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            Object[] objArr54 = new Object[1];
            a(i350, i352, (char) (((i353 | 1) << 1) - (i353 ^ 1)), objArr54);
            str6 = (String) objArr54[0];
            int i354 = 588 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            int i355 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
            int i356 = (i355 & 6) + (i355 | 6);
            int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L);
            Object[] objArr55 = new Object[1];
            a(i354, i356, (char) ((packedPositionGroup2 ^ 37337) + ((packedPositionGroup2 & 37337) << 1)), objArr55);
            bytes3 = ((String) objArr55[0]).getBytes();
            length3 = bytes3.length;
            if (length3 == 0) {
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i357 = ~(((-622340707) & iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | ((-622340707) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                int i358 = (i357 & 622332448) | (622332448 ^ i357);
                int i359 = ~((-1868074942) | iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                int i360 = -(-(((i358 & i359) | (i358 ^ i359)) * (-880)));
                int i361 = ((-672103249) ^ i360) + ((i360 & (-672103249)) << 1);
                int i362 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i363 = (~((i362 & (-622340707)) | ((-622340707) ^ i362))) | 1868074941;
                int i364 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault2 & 622340706) | (622340706 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault2));
                int i365 = -(-(((i363 & i364) | (i363 ^ i364)) * (-880)));
                int i366 = (i361 & i365) + (i365 | i361);
                int i367 = i364 * 880;
                i116 = (i366 & i367) + (i367 | i366);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i368 = (589731792 & iTuitionPaymentFragmentspecialinlinedviewModeldefault3) | (589731792 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                int i369 = (-1100614503) - (~(-(-(((~((-1676614847) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault3))) | (~i368)) * 1150))));
                int i370 = ~i368;
                int i371 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i372 = ~(((-589731793) & i371) | (i371 ^ (-589731793)));
                i117 = (i369 - (~(((i370 & i372) | (i370 ^ i372)) * (-575)))) - 1;
                int i373 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & (-1676614847)) | ((-1676614847) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                int i374 = ~((1676614846 & i371) | (i371 ^ 1676614846));
                i118 = ((i373 & i374) | (i373 ^ i374)) * 575;
                if (i116 > (i117 ^ i118) + ((i118 & i117) << 1)) {
                    int maximumFlingVelocity3 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 593;
                    int i375 = -(-TextUtils.indexOf(str23, str23, 0));
                    int i376 = -View.combineMeasuredStates(0, 0);
                    Object[] objArr56 = new Object[1];
                    a(maximumFlingVelocity3, (i375 ^ 13) + ((i375 & 13) << 1), (char) ((i376 ^ 5682) + ((i376 & 5682) << 1)), objArr56);
                    str7 = (String) objArr56[0];
                    int i377 = -(-View.combineMeasuredStates(0, 0));
                    int i378 = (i377 & TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO) + (i377 | TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO);
                    i52 = b + 65;
                    TuitionPaymentFragmentbindingInflater1 = i52 % 128;
                    if (i52 % 2 != 0) {
                        i54 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) * 17;
                        modifierMetaStateMask = KeyEvent.getModifierMetaStateMask();
                        i53 = 1;
                    } else {
                        int i379 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        i53 = 1;
                        i54 = ((i379 & 9) << 1) + (i379 ^ 9);
                        modifierMetaStateMask = KeyEvent.getModifierMetaStateMask();
                    }
                    Object[] objArr57 = new Object[i53];
                    a(i378, i54, (char) (34900 - (~(-(-((byte) modifierMetaStateMask))))), objArr57);
                    bytes4 = ((String) objArr57[0]).getBytes();
                    length4 = bytes4.length;
                    if (length4 == 0) {
                        int i380 = TuitionPaymentFragmentbindingInflater1;
                        int i381 = (i380 & 117) + (i380 | 117);
                        b = i381 % 128;
                        int i382 = i381 % 2;
                    } else {
                        try {
                            bufferedInputStream8 = new BufferedInputStream(new FileInputStream(str7));
                            i56 = 4096;
                            try {
                                bArr6 = new byte[4096];
                                i57 = 0;
                                while (true) {
                                    i58 = bufferedInputStream8.read(bArr6, 0, i56);
                                    if (i58 > 0) {
                                        break;
                                    }
                                    i60 = 0;
                                    while (i57 < length4 && i60 < i58) {
                                        if (bArr6[i60] == bytes4[i57]) {
                                            int i383 = i57 + 72;
                                            i57 = ((i383 & (-71)) << 1) + (i383 ^ (-71));
                                        } else {
                                            if (i57 != 0) {
                                                i61 = i57 - 1;
                                                while (true) {
                                                    if (i61 > 0) {
                                                        bArr7 = bArr6;
                                                        i57 = 0;
                                                        break;
                                                    }
                                                    i62 = 0;
                                                    while (true) {
                                                        if (i62 < i61) {
                                                            bArr7 = bArr6;
                                                            i57 = i61;
                                                            break;
                                                        }
                                                        bArr8 = bArr6;
                                                        if (bytes4[i62] != bytes4[(((i57 - (~(-i61))) - 1) - (~(-(-i62)))) - 1]) {
                                                            break;
                                                        }
                                                        i62++;
                                                        bArr6 = bArr8;
                                                    }
                                                    i61 = (-2) - (~i61);
                                                    bArr6 = bArr8;
                                                }
                                            }
                                            bArr6 = bArr7;
                                        }
                                        bArr7 = bArr6;
                                        i60 = (i60 & 1) + (i60 | 1);
                                        bArr6 = bArr7;
                                    }
                                    bArr6 = bArr6;
                                    i56 = 4096;
                                }
                                if (i57 == length4) {
                                    int i384 = b;
                                    i59 = ((i384 | 81) << 1) - (i384 ^ 81);
                                    TuitionPaymentFragmentbindingInflater1 = i59 % 128;
                                    if (i59 % 2 != 0) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                } else {
                                    z3 = false;
                                }
                                try {
                                    bufferedInputStream8.close();
                                } catch (IOException unused11) {
                                }
                                if (z3) {
                                    i55 = i;
                                }
                            } catch (IOException unused12) {
                                if (bufferedInputStream8 != null) {
                                    try {
                                        bufferedInputStream8.close();
                                    } catch (IOException unused13) {
                                    }
                                }
                            } catch (Throwable th11) {
                                th4 = th11;
                                bufferedInputStream7 = bufferedInputStream8;
                                if (bufferedInputStream7 == null) {
                                    throw th4;
                                }
                                try {
                                    bufferedInputStream7.close();
                                    throw th4;
                                } catch (IOException unused14) {
                                    throw th4;
                                }
                            }
                        } catch (IOException unused15) {
                            bufferedInputStream8 = null;
                        } catch (Throwable th12) {
                            th4 = th12;
                            bufferedInputStream7 = null;
                        }
                    }
                    i55 = (~(i & 261)) & (i | 261);
                } else {
                    i55 = i ^ 260;
                }
            } else {
                try {
                    bufferedInputStream6 = new BufferedInputStream(new FileInputStream(str6));
                    i44 = 4096;
                    try {
                        bArr3 = new byte[4096];
                        i45 = 0;
                        while (true) {
                            i46 = bufferedInputStream6.read(bArr3, 0, i44);
                            if (i46 > 0) {
                                break;
                            }
                            i47 = 0;
                            while (i45 < length3 && i47 < i46) {
                                if (bArr3[i47] == bytes3[i45]) {
                                    int i385 = (i45 & 88) + (i45 | 88);
                                    i45 = (i385 & (-87)) + (i385 | (-87));
                                } else {
                                    if (i45 != 0) {
                                        i48 = i45 - 1;
                                        while (true) {
                                            if (i48 > 0) {
                                                bArr4 = bArr3;
                                                i45 = 0;
                                                break;
                                            }
                                            i49 = 0;
                                            while (true) {
                                                if (i49 < i48) {
                                                    bArr4 = bArr3;
                                                    i45 = i48;
                                                    break;
                                                }
                                                b2 = bytes3[i49];
                                                i50 = (i45 - (~(-i48))) - 1;
                                                bArr5 = bArr3;
                                                i51 = -(-i49);
                                                if (b2 != bytes3[(i50 & i51) + (i51 | i50)]) {
                                                    break;
                                                }
                                                i49++;
                                                bArr3 = bArr5;
                                            }
                                            i48--;
                                            bArr3 = bArr5;
                                        }
                                    }
                                    bArr3 = bArr4;
                                }
                                bArr4 = bArr3;
                                i47 = (i47 & 1) + (i47 | 1);
                                bArr3 = bArr4;
                            }
                            bArr3 = bArr3;
                            i44 = 4096;
                        }
                        if (i45 == length3) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        try {
                            bufferedInputStream6.close();
                        } catch (IOException unused16) {
                        }
                        if (z2) {
                            i55 = i ^ 260;
                        } else {
                            int maximumFlingVelocity4 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 593;
                            int i3710 = -(-TextUtils.indexOf(str23, str23, 0));
                            int i3711 = -View.combineMeasuredStates(0, 0);
                            Object[] objArr58 = new Object[1];
                            a(maximumFlingVelocity4, (i3710 ^ 13) + ((i3710 & 13) << 1), (char) ((i3711 ^ 5682) + ((i3711 & 5682) << 1)), objArr58);
                            str7 = (String) objArr58[0];
                            int i3712 = -(-View.combineMeasuredStates(0, 0));
                            int i3713 = (i3712 & TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO) + (i3712 | TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO);
                            i52 = b + 65;
                            TuitionPaymentFragmentbindingInflater1 = i52 % 128;
                            if (i52 % 2 != 0) {
                                i54 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) * 17;
                                modifierMetaStateMask = KeyEvent.getModifierMetaStateMask();
                                i53 = 1;
                            } else {
                                int i3714 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                i53 = 1;
                                i54 = ((i3714 & 9) << 1) + (i3714 ^ 9);
                                modifierMetaStateMask = KeyEvent.getModifierMetaStateMask();
                            }
                            Object[] objArr59 = new Object[i53];
                            a(i3713, i54, (char) (34900 - (~(-(-((byte) modifierMetaStateMask))))), objArr59);
                            bytes4 = ((String) objArr59[0]).getBytes();
                            length4 = bytes4.length;
                            if (length4 == 0) {
                                int i386 = TuitionPaymentFragmentbindingInflater1;
                                int i387 = (i386 & 117) + (i386 | 117);
                                b = i387 % 128;
                                int i388 = i387 % 2;
                            } else {
                                bufferedInputStream8 = new BufferedInputStream(new FileInputStream(str7));
                                i56 = 4096;
                                bArr6 = new byte[4096];
                                i57 = 0;
                                while (true) {
                                    i58 = bufferedInputStream8.read(bArr6, 0, i56);
                                    if (i58 > 0) {
                                        break;
                                        break;
                                    }
                                    i60 = 0;
                                    while (i57 < length4) {
                                        if (bArr6[i60] == bytes4[i57]) {
                                            int i389 = i57 + 72;
                                            i57 = ((i389 & (-71)) << 1) + (i389 ^ (-71));
                                        } else {
                                            if (i57 != 0) {
                                                i61 = i57 - 1;
                                                while (true) {
                                                    if (i61 > 0) {
                                                        bArr7 = bArr6;
                                                        i57 = 0;
                                                        break;
                                                        break;
                                                    }
                                                    i62 = 0;
                                                    while (true) {
                                                        if (i62 < i61) {
                                                            bArr7 = bArr6;
                                                            i57 = i61;
                                                            break;
                                                            break;
                                                        }
                                                        bArr8 = bArr6;
                                                        if (bytes4[i62] != bytes4[(((i57 - (~(-i61))) - 1) - (~(-(-i62)))) - 1]) {
                                                            break;
                                                        }
                                                        i62++;
                                                        bArr6 = bArr8;
                                                    }
                                                    i61 = (-2) - (~i61);
                                                    bArr6 = bArr8;
                                                }
                                            }
                                            bArr6 = bArr7;
                                        }
                                        bArr7 = bArr6;
                                        i60 = (i60 & 1) + (i60 | 1);
                                        bArr6 = bArr7;
                                    }
                                    bArr6 = bArr6;
                                    i56 = 4096;
                                }
                                if (i57 == length4) {
                                    int i3810 = b;
                                    i59 = ((i3810 | 81) << 1) - (i3810 ^ 81);
                                    TuitionPaymentFragmentbindingInflater1 = i59 % 128;
                                    if (i59 % 2 != 0) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                } else {
                                    z3 = false;
                                }
                                bufferedInputStream8.close();
                                if (z3) {
                                    i55 = i;
                                }
                            }
                            i55 = (~(i & 261)) & (i | 261);
                        }
                    } catch (IOException unused17) {
                        if (bufferedInputStream6 != null) {
                            try {
                                bufferedInputStream6.close();
                                int i390 = TuitionPaymentFragmentbindingInflater1;
                                int i391 = ((i390 | 1) << 1) - (i390 ^ 1);
                                b = i391 % 128;
                                int i392 = i391 % 2;
                            } catch (IOException unused18) {
                            }
                        }
                    } catch (Throwable th13) {
                        th3 = th13;
                        bufferedInputStream5 = bufferedInputStream6;
                        if (bufferedInputStream5 == null) {
                            throw th3;
                        }
                        try {
                            bufferedInputStream5.close();
                            throw th3;
                        } catch (IOException unused19) {
                            throw th3;
                        }
                    }
                } catch (IOException unused20) {
                    bufferedInputStream6 = null;
                } catch (Throwable th14) {
                    th3 = th14;
                    bufferedInputStream5 = null;
                }
            }
            int i393 = ((~i349) & i) | (i349 & i200);
            int i394 = -i393;
            int i395 = ((i393 & i394) | (i393 ^ i394)) >> 31;
            int i396 = i55 & (~i395);
            int i397 = i349 & i395;
            i63 = (i397 & i396) | (i396 ^ i397);
            if ((i2 & 8) == 0) {
                strArr10 = new String[3];
                int mode = View.MeasureSpec.getMode(0);
                int i398 = b + 51;
                TuitionPaymentFragmentbindingInflater1 = i398 % 128;
                int i399 = i398 % 2;
                int i400 = -(-mode);
                int i401 = (615 ^ i400) + ((i400 & 615) << 1);
                int i402 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                Object[] objArr60 = new Object[1];
                a(i401, (i402 ^ 44) + ((i402 & 44) << 1), (char) (22102 - (~(-TextUtils.indexOf((CharSequence) str23, '0', 0, 0)))), objArr60);
                strArr10[0] = (String) objArr60[0];
                int i403 = -(-View.combineMeasuredStates(0, 0));
                int i404 = (i403 ^ 658) + ((i403 & 658) << 1);
                int i405 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                int i406 = (i405 ^ 42) + ((i405 & 42) << 1);
                int i407 = -(-TextUtils.lastIndexOf(str23, '0'));
                Object[] objArr61 = new Object[1];
                a(i404, i406, (char) ((i407 ^ 1) + ((i407 & 1) << 1)), objArr61);
                strArr10[1] = (String) objArr61[0];
                int i408 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int i409 = ((i408 | 699) << 1) - (i408 ^ 699);
                int i410 = TuitionPaymentFragmentbindingInflater1;
                int i411 = ((i410 | 7) << 1) - (i410 ^ 7);
                b = i411 % 128;
                int i412 = i411 % 2;
                int i413 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                Object[] objArr62 = new Object[1];
                a(i409, (38 & i413) + (i413 | 38), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr62);
                str17 = (String) objArr62[0];
                i108 = TuitionPaymentFragmentbindingInflater1 + 115;
                b = i108 % 128;
                if (i108 % 2 == 0) {
                    strArr10[2] = str17;
                    i109 = 1;
                } else {
                    strArr10[2] = str17;
                    i109 = 0;
                }
                while (true) {
                    if (i109 < 3) {
                        i110 = i63;
                        i111 = i;
                        break;
                    }
                    Object[] objArr63 = {strArr10[i109]};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                        char cBlue = (char) Color.blue(0);
                        int iIndexOf4 = TextUtils.indexOf(str23, str23, 0, 0) + 993;
                        int threadPriority = 8 - ((Process.getThreadPriority(0) + 20) >> 6);
                        byte b18 = (byte) (-1);
                        byte b19 = (byte) (b18 + 1);
                        Object[] objArr64 = new Object[1];
                        c(b18, b19, (byte) (b19 | 6), objArr64);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(cBlue, iIndexOf4, threadPriority, 349342683, false, (String) objArr64[0], new Class[]{String.class});
                    }
                    long jLongValue6 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).invoke(null, objArr63)).longValue();
                    long j34 = -121855221;
                    long j35 = jLongValue6 ^ j19;
                    i112 = i63;
                    i113 = i109;
                    long j36 = (((long) ((int) Runtime.getRuntime().totalMemory())) | jLongValue6) ^ j19;
                    long j37 = (((long) (-391)) * j34) + (((long) (-195)) * jLongValue6) + (((long) (-196)) * (((j35 | j34) ^ j19) | j36)) + (((long) 392) * (jLongValue6 | j34)) + (((long) 196) * (j36 | (((j34 ^ j19) | j35) ^ j19))) + ((long) (-725223384));
                    i114 = ((int) (j37 >> 32)) & (1704617878 + (((~(1008179970 | i)) | (-1033354155)) * 305) + (((~(1008179970 | i200)) | (-429046441)) * 305));
                    int iMaxMemory2 = (int) Runtime.getRuntime().maxMemory();
                    i115 = ((int) j37) & ((-1587633331) + (((~((-1159113009) | iMaxMemory2)) | 1222704 | (~((-278113402) | iMaxMemory2))) * (-744)) + (((~iMaxMemory2) | (-1436003706)) * 744) + ((iMaxMemory2 | (-1222705)) * 744));
                    if (((i114 & i115) | (i114 ^ i115)) != 0) {
                        i111 = ((i113 ^ 280) + ((i113 & 280) << 1)) ^ i;
                        i110 = i112;
                        break;
                    }
                    i109 = i113 + 1;
                    i63 = i112;
                }
                int i414 = ((~i110) & i) | (i110 & i200);
                int i415 = -i414;
                int i416 = ((i414 & i415) | (i414 ^ i415)) >> 31;
                int i417 = i111 & (~i416);
                int i418 = i110 & i416;
                i63 = (i417 & i418) | (i417 ^ i418);
            }
            int i419 = 735 - (~(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
            int maximumDrawingCacheSize2 = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
            Object[] objArr65 = new Object[1];
            a(i419, (maximumDrawingCacheSize2 ^ 41) + ((maximumDrawingCacheSize2 & 41) << 1), (char) (11307 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr65);
            String str27 = (String) objArr65[0];
            int i420 = 777 - (~(-(-Color.alpha(0))));
            int i421 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
            int i422 = ((i421 | 30) << 1) - (i421 ^ 30);
            int i423 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
            Object[] objArr66 = new Object[1];
            a(i420, i422, (char) (((i423 | 49249) << 1) - (i423 ^ 49249)), objArr66);
            strArr3 = new String[]{str27, (String) objArr66[0]};
            i64 = 0;
            while (true) {
                if (i64 < 2) {
                    i65 = i63;
                    str8 = str23;
                    i66 = i;
                    break;
                }
                Object[] objArr67 = {strArr3[i64]};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char c8 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                    int i424 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 992;
                    int modifierMetaStateMask4 = ((byte) KeyEvent.getModifierMetaStateMask()) + 9;
                    byte b20 = (byte) (-1);
                    byte b21 = (byte) (b20 + 1);
                    Object[] objArr68 = new Object[1];
                    c(b20, b21, (byte) (b21 | 6), objArr68);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(c8, i424, modifierMetaStateMask4, 349342683, false, (String) objArr68[0], new Class[]{String.class});
                }
                long jLongValue7 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).invoke(null, objArr67)).longValue();
                long j38 = -203362343;
                long j39 = -964;
                str8 = str23;
                long j40 = jLongValue7 ^ j19;
                i65 = i63;
                strArr9 = strArr3;
                long jMaxMemory2 = (int) Runtime.getRuntime().maxMemory();
                long j41 = (((long) (-963)) * j38) + j39 + (((long) 965) * jLongValue7) + (((j38 ^ j19) | ((j40 | jMaxMemory2) ^ j19)) * j39) + (j39 * (((j40 | (jMaxMemory2 ^ j19)) ^ j19) | ((j40 | j38) ^ j19))) + ((long) (-643716262));
                int i425 = ~((int) Process.getElapsedCpuTime());
                i106 = ((int) (j41 >> 32)) & (766110868 + ((~((-285511745) | i425)) * (-783)) + (((~(i425 | 1147364149)) | (-289862262)) * 783));
                int startUptimeMillis = (int) Process.getStartUptimeMillis();
                int i426 = ~startUptimeMillis;
                i107 = ((int) j41) & (710580765 + (((~((-817816734) | i426)) | 269780113) * 184) + ((startUptimeMillis | 71373056) * (-184)) + ((~(619409676 | i426)) * 184));
                if (((i106 & i107) | (i106 ^ i107)) != 0) {
                    int i427 = (i64 & 288) + (i64 | 288);
                    i66 = (i427 | i) & (~(i & i427));
                    break;
                }
                int i428 = i64 + 38;
                i64 = ((i428 | (-37)) << 1) - (i428 ^ (-37));
                i63 = i65;
                strArr3 = strArr9;
                str23 = str8;
            }
            int i429 = i ^ i65;
            int i430 = -i429;
            int i431 = ((i429 & i430) | (i429 ^ i430)) >> 31;
            int i432 = i66 & (~i431);
            int i433 = i431 & i65;
            i67 = (i432 & i433) | (i432 ^ i433);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-555308653);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char trimmedLength = (char) TextUtils.getTrimmedLength(str8);
                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 3527;
                int touchSlop2 = 23 - (ViewConfiguration.getTouchSlop() >> 8);
                byte b22 = (byte) (-1);
                Object[] objArr69 = new Object[1];
                c(b22, (byte) (b22 + 1), $$a[2], objArr69);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(trimmedLength, packedPositionChild, touchSlop2, 980946500, false, (String) objArr69[0], new Class[0]);
            }
            long jLongValue8 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, null)).longValue();
            long j42 = 787348420;
            long j43 = 371;
            long j44 = (j43 * j42) + (j43 * jLongValue8);
            long j45 = -370;
            long j46 = jLongValue8 ^ j19;
            j = i;
            j2 = j ^ j19;
            long j47 = j42 ^ j19;
            long j48 = (jLongValue8 | j42) ^ j19;
            long j49 = j44 + ((((j46 | j2) ^ j19) | ((j47 | j) ^ j19)) * j45) + (j45 * (((j47 | j2) ^ j19) | ((j46 | j) ^ j19) | j48)) + (((long) 370) * j48) + ((long) (-967671058));
            i68 = ((int) (j49 >> 32)) & ((((~((-604578817) | i)) | 21004672) * TypedValues.PositionType.TYPE_TRANSITION_EASING) + 1552511530 + ((~((-604578817) | i200)) * TypedValues.PositionType.TYPE_TRANSITION_EASING));
            int startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
            i69 = ((int) j49) & ((((~(1515215122 | startElapsedRealtime2)) | (-1593203323)) * 262) + 1219520425 + (((~((~startElapsedRealtime2) | 1515215122)) | (-1593203323)) * 262));
            if (((i68 & i69) | (i68 ^ i69)) != 1) {
                int i434 = b;
                i70 = (i434 & 107) + (i434 | 107);
                TuitionPaymentFragmentbindingInflater1 = i70 % 128;
                if (i70 % 2 != 0) {
                    Object[] objArr70 = {1};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1331892133);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                        char cMyPid = (char) (Process.myPid() >> 22);
                        int packedPositionType2 = 2673 - ExpandableListView.getPackedPositionType(0L);
                        int doubleTapTimeout2 = 16 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        byte b23 = (byte) (-1);
                        Object[] objArr71 = new Object[1];
                        c(b23, (byte) (b23 + 1), $$a[2], objArr71);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cMyPid, packedPositionType2, doubleTapTimeout2, -1409439630, false, (String) objArr71[0], new Class[]{Integer.TYPE});
                    }
                    long jLongValue9 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).invoke(null, objArr70)).longValue();
                    long j50 = 1184357934;
                    long j51 = -755;
                    long j52 = ((j50 ^ j19) | (jLongValue9 ^ j19)) ^ j19;
                    long j53 = (j51 * j50) + (j51 * jLongValue9) + (((long) 1512) * j52);
                    long j54 = jLongValue9 | j50;
                    j3 = j53 + (((long) (-756)) * (j52 | ((j54 | j) ^ j19))) + (((long) 756) * (j54 | j2)) + ((long) 683340746);
                } else {
                    Object[] objArr72 = {1};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1331892133);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c9 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int packedPositionType3 = 2673 - ExpandableListView.getPackedPositionType(0L);
                        int iResolveOpacity2 = Drawable.resolveOpacity(0, 0) + 16;
                        byte b24 = (byte) (-1);
                        Object[] objArr73 = new Object[1];
                        c(b24, (byte) (b24 + 1), $$a[2], objArr73);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c9, packedPositionType3, iResolveOpacity2, -1409439630, false, (String) objArr73[0], new Class[]{Integer.TYPE});
                    }
                    long jLongValue10 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr72)).longValue();
                    long j55 = 1048616627;
                    long j56 = 983;
                    long j57 = jLongValue10 ^ j19;
                    long j58 = (((long) (-1965)) * j55) + (((long) 984) * jLongValue10) + ((j55 | j57) * j56);
                    long j59 = j55 ^ j19;
                    long jMaxMemory3 = ((long) ((int) Runtime.getRuntime().maxMemory())) ^ j19;
                    j3 = j58 + (((long) (-983)) * (j59 | ((j57 | jMaxMemory3) ^ j19))) + (j56 * (((jMaxMemory3 | j59) ^ j19) | ((jLongValue10 | j59) ^ j19))) + ((long) 819082053);
                }
                i71 = ((int) (j3 >> 32)) & (635053320 + (((-67700737) | i) * (-627)) + (((~(241125505 | i)) | 1678351916) * (-627)) + (((~((-241125506) | i200)) | (~(1678351916 | i))) * 627));
                int i435 = ~Process.myUid();
                i72 = ((int) j3) & (((1019428157 + (((~(i435 | (-1052938))) | (~(1845231615 | i435))) * (-184))) + (((203476134 | (~(1641755481 | i435))) | (~((-204529072) | i435))) * 184)) - 1241557560);
                if (((i71 & i72) | (i71 ^ i72)) != 0) {
                    i73 = i ^ 220;
                } else {
                    i73 = i;
                }
                int i436 = (~(i & i67)) & (i | i67);
                int i437 = -i436;
                int i438 = ((i436 & i437) | (i436 ^ i437)) >> 31;
                int i439 = i73 & (~i438);
                int i440 = i67 & i438;
                i74 = (i440 & i439) | (i439 ^ i440);
                float f = 0.0f;
                int i441 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int i442 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23;
                int i443 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                Object[] objArr74 = new Object[1];
                a((i441 & 370) + (i441 | 370), i442, (char) ((i443 & 27637) + (i443 | 27637)), objArr74);
                Object[] objArr75 = {(String) objArr74[0]};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    str9 = str8;
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf(str9, '0', 0) + 33603);
                    int iIndexOf5 = 3084 - TextUtils.indexOf((CharSequence) str9, '0', 0, 0);
                    int i444 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 25;
                    byte b25 = (byte) (-1);
                    Object[] objArr76 = new Object[1];
                    c(b25, (byte) (b25 + 1), $$a[2], objArr76);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cLastIndexOf, iIndexOf5, i444, 1411172903, false, (String) objArr76[0], new Class[]{String.class});
                } else {
                    str9 = str8;
                }
                objInvoke = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr75);
                try {
                    try {
                        try {
                            try {
                                try {
                                    if (objInvoke != null) {
                                        Object[] objArr77 = {objInvoke, 42};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                                            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                                            int threadPriority2 = 3393 - ((Process.getThreadPriority(0) + 20) >> 6);
                                            int iIndexOf6 = 9 - TextUtils.indexOf(str9, str9, 0, 0);
                                            byte b26 = (byte) (-1);
                                            Object[] objArr78 = new Object[1];
                                            c(b26, (byte) (b26 + 1), $$a[2], objArr78);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cNormalizeMetaState, threadPriority2, iIndexOf6, 1203525406, false, (String) objArr78[0], new Class[]{String.class, Integer.TYPE});
                                        }
                                        long jLongValue11 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).invoke(null, objArr77)).longValue();
                                        long j60 = 1450996639;
                                        long j61 = 614;
                                        long j62 = j60 ^ j19;
                                        long j63 = (j62 | jLongValue11) ^ j19;
                                        long j64 = jLongValue11 ^ j19;
                                        str10 = str9;
                                        j4 = (((long) 615) * j60) + (((long) (-613)) * jLongValue11) + ((j | j63 | ((j64 | j60) ^ j19)) * j61) + (((long) (-1228)) * (((j62 | j2) ^ j19) | j63 | ((j2 | jLongValue11) ^ j19))) + (j61 * (((jLongValue11 | (j2 | j60)) ^ j19) | (((j62 | j64) | j2) ^ j19))) + ((long) (-1453066516));
                                        i102 = ((int) (j4 >> 32)) & (2038856378 + (((~((-1511261644) | i)) | (~((-25315845) | i200))) * 920) + (((~(99351076 | i200)) | 1511261643) * 920) + (((~((-1511261644) | i200)) | (~(1610612719 | i)) | (~((-25315845) | i))) * 920));
                                        i103 = 818884229 + (((~(126646586 | i)) | (-1335754112) | (~(1310579823 | i))) * (-880));
                                        i104 = (~(126646586 | i200)) | (-1310579824);
                                        i105 = ~((-126646587) | i);
                                        if ((i102 | (((int) j4) & (i103 + ((i104 | i105) * (-880)) + (i105 * 880)))) == 1986687685) {
                                            str11 = str10;
                                            i81 = 0;
                                            strArr6 = null;
                                        }
                                        int i445 = -(TypedValue.complexToFraction(i81, f, f) > f ? 1 : (TypedValue.complexToFraction(i81, f, f) == f ? 0 : -1));
                                        int i446 = (i445 & 889) + (i445 | 889);
                                        int deadChar2 = KeyEvent.getDeadChar(i81, i81);
                                        Object[] objArr79 = new Object[1];
                                        a(i446, (deadChar2 ^ 16) + ((deadChar2 & 16) << 1), (char) View.resolveSize(i81, i81), objArr79);
                                        Object[] objArr80 = {(String) objArr79[i81]};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                            char keyRepeatTimeout = (char) (33602 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                            int i447 = 3086 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                            int i448 = 27 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                            byte b27 = (byte) (-1);
                                            Object[] objArr81 = new Object[1];
                                            c(b27, (byte) (b27 + 1), $$a[2], objArr81);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(keyRepeatTimeout, i447, i448, 1411172903, false, (String) objArr81[0], new Class[]{String.class});
                                        }
                                        objInvoke2 = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr80);
                                        if (objInvoke2 == null) {
                                            i87 = 0;
                                        } else {
                                            Object[] objArr82 = {objInvoke2, 42};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                                                char c10 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                int iLastIndexOf6 = 3392 - TextUtils.lastIndexOf(str11, '0', 0);
                                                int iMyTid4 = 9 - (Process.myTid() >> 22);
                                                byte b28 = (byte) (-1);
                                                Object[] objArr83 = new Object[1];
                                                c(b28, (byte) (b28 + 1), $$a[2], objArr83);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c10, iLastIndexOf6, iMyTid4, 1203525406, false, (String) objArr83[0], new Class[]{String.class, Integer.TYPE});
                                            }
                                            long jLongValue12 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr82)).longValue();
                                            long j65 = 554314274;
                                            long j66 = -103;
                                            long j67 = (j66 * j65) + (j66 * jLongValue12);
                                            long j68 = 104;
                                            long j69 = jLongValue12 ^ j19;
                                            long j70 = j67 + (((((j65 ^ j19) | j69) ^ j19) | ((j69 | j) ^ j19)) * j68) + (((long) (-104)) * (((j2 | j65) | jLongValue12) ^ j19)) + (j68 * (j65 | j)) + ((long) (-556384151));
                                            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                                            int i449 = ~iFreeMemory;
                                            int i450 = (~((-2013913212) | i449)) | 1476419627;
                                            int i451 = ~(iFreeMemory | (-39193217));
                                            int i452 = ((int) (j70 >> 32)) & ((((i450 | i451) * (-252)) - 167182338) + ((i451 | (~(i449 | (-537493585)))) * 252));
                                            int i453 = ~Process.myPid();
                                            i87 = i452 | (((int) j70) & (248622077 + (((-1212154114) | i453) * 184) + (((~(i453 | (-1307617550))) | (-1246299538)) * 184)));
                                        }
                                        if (i87 != 1986687685 || i87 == -1514516938) {
                                            str13 = str11;
                                        } else {
                                            Object[] objArr84 = new Object[1];
                                            a(1608 - Color.argb(0, 0, 0, 0), 13 - (~TextUtils.getOffsetBefore(str11, 0)), (char) (18243 - (ViewConfiguration.getTouchSlop() >> 8)), objArr84);
                                            String str28 = (String) objArr84[0];
                                            Object[] objArr85 = new Object[1];
                                            a(1622 - (~(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))), 25 - (~(-(-(ViewConfiguration.getEdgeSlop() >> 16)))), (char) Color.argb(0, 0, 0, 0), objArr85);
                                            String str29 = (String) objArr85[0];
                                            int threadPriority3 = Process.getThreadPriority(0);
                                            int i454 = -(-(((threadPriority3 & 20) + (threadPriority3 | 20)) >> 6));
                                            int i455 = ((i454 | 1648) << 1) - (i454 ^ 1648);
                                            int i456 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                            int i457 = ((i456 | 18) << 1) - (i456 ^ 18);
                                            int threadPriority4 = Process.getThreadPriority(0);
                                            Object[] objArr86 = new Object[1];
                                            a(i455, i457, (char) (((threadPriority4 ^ 20) + ((threadPriority4 & 20) << 1)) >> 6), objArr86);
                                            String str30 = (String) objArr86[0];
                                            int i458 = 1664 - (~(-KeyEvent.normalizeMetaState(0)));
                                            int threadPriority5 = Process.getThreadPriority(0);
                                            int i459 = ~threadPriority5;
                                            int i460 = ~((i459 ^ i7) | (i459 & i7));
                                            int i461 = ~((threadPriority5 ^ 20) | (threadPriority5 & 20) | i);
                                            int i462 = (((-16600) + (threadPriority5 * 832)) - (~(-(-(((i460 & i461) | (i460 ^ i461)) * (-831)))))) - 1;
                                            int i463 = (i459 & 20) | (i459 ^ 20);
                                            int i464 = -(-((~((i463 & i) | (i463 ^ i))) * (-1662)));
                                            int i465 = (i462 & i464) + (i464 | i462);
                                            int i466 = (~(((-21) ^ i200) | ((-21) & i200))) | (~((i ^ 20) | (i & 20)));
                                            int i467 = ~((threadPriority5 & i) | (threadPriority5 ^ i));
                                            Object[] objArr87 = new Object[1];
                                            a(i458, 17 - (((i465 - (~(-(-(((i467 & i466) | (i466 ^ i467)) * 831))))) - 1) >> 6), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), objArr87);
                                            String str31 = (String) objArr87[0];
                                            int i468 = -Color.rgb(0, 0, 0);
                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                            int i469 = i468 * 70;
                                            int i470 = (1140736312 ^ i469) + ((i469 & 1140736312) << 1);
                                            int i471 = ~i468;
                                            int i472 = 16775533 | i471;
                                            int i473 = ~((i472 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i472 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                            int i474 = (-16775534) | i468;
                                            int i475 = ~((i474 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i474 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                            int i476 = ((i473 & i475) | (i473 ^ i475)) * 69;
                                            int i477 = ((i470 | i476) << 1) - (i470 ^ i476);
                                            int i478 = ~((i471 & (-16775534)) | ((-16775534) ^ i471));
                                            int i479 = ~i468;
                                            int i480 = i478 | (~((i479 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i479 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4)));
                                            int i481 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault4 & (-16775534)) | ((-16775534) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                                            int i482 = -(-(((i481 & i480) | (i480 ^ i481)) * (-69)));
                                            int i483 = (((i477 | i482) << 1) - (i482 ^ i477)) + ((~(i468 | 16775533)) * 69);
                                            int i484 = -(-(ViewConfiguration.getJumpTapTimeout() >> 16));
                                            int i485 = ((i484 | 15) << 1) - (i484 ^ 15);
                                            int i486 = -(-TextUtils.getTrimmedLength(str11));
                                            Object[] objArr88 = new Object[1];
                                            a(i483, i485, (char) (((34899 | i486) << 1) - (i486 ^ 34899)), objArr88);
                                            String str32 = (String) objArr88[0];
                                            int modifierMetaStateMask5 = ((byte) KeyEvent.getModifierMetaStateMask()) + 1698;
                                            int packedPositionType4 = ExpandableListView.getPackedPositionType(0L) + 37;
                                            int i487 = -Process.getGidForName(str11);
                                            Object[] objArr89 = new Object[1];
                                            a(modifierMetaStateMask5, packedPositionType4, (char) (((37829 | i487) << 1) - (i487 ^ 37829)), objArr89);
                                            String str33 = (String) objArr89[0];
                                            int i488 = -TextUtils.getOffsetBefore(str11, 0);
                                            int i489 = (i488 & 1734) + (i488 | 1734);
                                            int i490 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                            int i491 = (i490 * 141) - 1668;
                                            int i492 = ~i490;
                                            int i493 = ~((i492 ^ 12) | (i492 & 12));
                                            int i494 = ~((i492 ^ i) | (i492 & i));
                                            int i495 = ((i493 & i494) | (i493 ^ i494)) * (-280);
                                            int i496 = (i491 ^ i495) + ((i491 & i495) << 1);
                                            int i497 = ~(i492 | i);
                                            int i498 = ~((-13) | i);
                                            int i499 = -(-(((i497 & i498) | (i497 ^ i498)) * 140));
                                            int i500 = ((i496 | i499) << 1) - (i499 ^ i496);
                                            int i501 = ~i490;
                                            int i502 = ~((i501 ^ (-13)) | (i501 & (-13)) | i);
                                            int i503 = (i501 & i200) | (i501 ^ i200);
                                            int i504 = (~((i503 & 12) | (i503 ^ 12))) | i502;
                                            int i505 = (-13) | i200;
                                            int i506 = ~((i490 & i505) | (i505 ^ i490));
                                            int i507 = -(-(((i506 & i504) | (i504 ^ i506)) * 140));
                                            Object[] objArr90 = new Object[1];
                                            a(i489, (i500 ^ i507) + ((i507 & i500) << 1), (char) KeyEvent.keyCodeFromString(str11), objArr90);
                                            String str34 = (String) objArr90[0];
                                            int trimmedLength2 = TextUtils.getTrimmedLength(str11) + 1746;
                                            int i508 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                                            Object[] objArr91 = new Object[1];
                                            a(trimmedLength2, (i508 & 13) + (i508 | 13), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), objArr91);
                                            String str35 = (String) objArr91[0];
                                            int i509 = -View.getDefaultSize(0, 0);
                                            int i510 = (i509 & 1759) + (i509 | 1759);
                                            int i511 = 22 - (~(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                                            int i512 = -(-KeyEvent.normalizeMetaState(0));
                                            Object[] objArr92 = new Object[1];
                                            a(i510, i511, (char) ((i512 ^ 5310) + ((i512 & 5310) << 1)), objArr92);
                                            String str36 = (String) objArr92[0];
                                            int i513 = 1780 - (~(-(-(ViewConfiguration.getScrollBarFadeDuration() >> 16))));
                                            int i514 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                            Object[] objArr93 = new Object[1];
                                            a(i513, ((i514 | 31) << 1) - (i514 ^ 31), (char) ((-1) - ImageFormat.getBitsPerPixel(0)), objArr93);
                                            String str37 = (String) objArr93[0];
                                            int i515 = 1811 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                            int maximumFlingVelocity5 = 12 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                            int i516 = -TextUtils.getOffsetAfter(str11, 0);
                                            Object[] objArr94 = new Object[1];
                                            a(i515, maximumFlingVelocity5, (char) ((59818 & i516) + (i516 | 59818)), objArr94);
                                            String str38 = (String) objArr94[0];
                                            int i517 = -(-Color.rgb(0, 0, 0));
                                            int i518 = (16779040 & i517) + (i517 | 16779040);
                                            int i519 = -(-((byte) KeyEvent.getModifierMetaStateMask()));
                                            int iIndexOf7 = TextUtils.indexOf((CharSequence) str11, '0', 0);
                                            char c11 = (char) (((iIndexOf7 | 1) << 1) - (iIndexOf7 ^ 1));
                                            Object[] objArr95 = new Object[1];
                                            a(i518, ((i519 | 13) << 1) - (i519 ^ 13), c11, objArr95);
                                            String str39 = (String) objArr95[0];
                                            int i520 = 1835 - (~(ViewConfiguration.getKeyRepeatTimeout() >> 16));
                                            int i521 = -(ViewConfiguration.getTapTimeout() >> 16);
                                            Object[] objArr96 = new Object[1];
                                            a(i520, ((i521 | 12) << 1) - (i521 ^ 12), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), objArr96);
                                            String str40 = (String) objArr96[0];
                                            int i522 = -(-Process.getGidForName(str11));
                                            int i523 = (i522 & 1849) + (i522 | 1849);
                                            int i524 = -KeyEvent.normalizeMetaState(0);
                                            int i525 = ((i524 | 12) << 1) - (i524 ^ 12);
                                            int i526 = -(Process.myPid() >> 22);
                                            Object[] objArr97 = new Object[1];
                                            a(i523, i525, (char) ((62151 ^ i526) + ((i526 & 62151) << 1)), objArr97);
                                            String str41 = (String) objArr97[0];
                                            int i527 = -(-KeyEvent.normalizeMetaState(0));
                                            int i528 = (i527 & 1860) + (i527 | 1860);
                                            int i529 = -ImageFormat.getBitsPerPixel(0);
                                            Object[] objArr98 = new Object[1];
                                            a(i528, (i529 ^ 11) + ((i529 & 11) << 1), (char) Color.alpha(0), objArr98);
                                            String str42 = (String) objArr98[0];
                                            int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L);
                                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                            int i530 = packedPositionChild2 * (-183);
                                            int i531 = (346505 & i530) + (i530 | 346505);
                                            int i532 = ~packedPositionChild2;
                                            int i533 = -(-(((i532 & 1873) | (i532 ^ 1873)) * (-368)));
                                            int i534 = (i531 & i533) + (i533 | i531);
                                            int i535 = (packedPositionChild2 ^ (-1874)) | (packedPositionChild2 & (-1874));
                                            int i536 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                            int i537 = (i534 - (~(-(-(((i535 & i536) | (i535 ^ i536)) * 184))))) - 1;
                                            int i538 = ~packedPositionChild2;
                                            int i539 = ~((i538 & (-1874)) | (i538 ^ (-1874)));
                                            int i540 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                                            int i541 = ~((i540 & packedPositionChild2) | (i540 ^ packedPositionChild2));
                                            int i542 = (i541 & i539) | (i539 ^ i541);
                                            int i543 = ~((packedPositionChild2 & 1873) | (packedPositionChild2 ^ 1873));
                                            Object[] objArr99 = new Object[1];
                                            a(i537 + (((i543 & i542) | (i542 ^ i543)) * 184), 13 - (~(-(ViewConfiguration.getWindowTouchSlop() >> 8))), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr99);
                                            String str43 = (String) objArr99[0];
                                            int i544 = -(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                                            int i545 = (i544 ^ 1885) + ((i544 & 1885) << 1);
                                            int i546 = 11 - (~(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                            int packedPositionGroup3 = ExpandableListView.getPackedPositionGroup(0L);
                                            Object[] objArr100 = new Object[1];
                                            a(i545, i546, (char) (((packedPositionGroup3 | 7774) << 1) - (packedPositionGroup3 ^ 7774)), objArr100);
                                            String str44 = (String) objArr100[0];
                                            int i547 = -(ViewConfiguration.getTapTimeout() >> 16);
                                            int i548 = (i547 ^ 1898) + ((i547 & 1898) << 1);
                                            int minimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity() >> 16;
                                            int i549 = (minimumFlingVelocity * 375) - 17928;
                                            int i550 = ~minimumFlingVelocity;
                                            int i551 = ~((i550 ^ 24) | (i550 & 24));
                                            int i552 = ~((i7 ^ minimumFlingVelocity) | (i7 & minimumFlingVelocity));
                                            int i553 = -(-(((i551 & i552) | (i551 ^ i552)) * (-374)));
                                            int i554 = (i549 & i553) + (i549 | i553) + ((~(((-25) ^ minimumFlingVelocity) | ((-25) & minimumFlingVelocity))) * 748);
                                            int i555 = ~((i550 ^ (-25)) | (i550 & (-25)));
                                            int i556 = ~(minimumFlingVelocity | i200);
                                            Object[] objArr101 = new Object[1];
                                            a(i548, i554 + (((i556 & i555) | (i555 ^ i556)) * 374), (char) (36594 - TextUtils.lastIndexOf(str11, '0', 0)), objArr101);
                                            String str45 = (String) objArr101[0];
                                            int iMyPid = Process.myPid() >> 22;
                                            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 28;
                                            int i557 = -TextUtils.lastIndexOf(str11, '0', 0);
                                            Object[] objArr102 = new Object[1];
                                            a(((iMyPid | 1922) << 1) - (iMyPid ^ 1922), iResolveSizeAndState, (char) ((61567 ^ i557) + ((i557 & 61567) << 1)), objArr102);
                                            String[] strArr16 = {str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, str45, (String) objArr102[0]};
                                            int i558 = 0;
                                            while (true) {
                                                if (i558 >= 19) {
                                                    str13 = str11;
                                                    i101 = -1;
                                                    break;
                                                }
                                                String str46 = strArr16[i558];
                                                Object[] objArr103 = {str46};
                                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                                                    char cLastIndexOf2 = (char) (TextUtils.lastIndexOf(str11, '0', 0) + 1);
                                                    int iIndexOf8 = 993 - TextUtils.indexOf(str11, str11, 0);
                                                    int iKeyCodeFromString = 8 - KeyEvent.keyCodeFromString(str11);
                                                    byte b29 = (byte) (-1);
                                                    Object[] objArr104 = new Object[1];
                                                    c(b29, (byte) (b29 + 1), $$a[2], objArr104);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(cLastIndexOf2, iIndexOf8, iKeyCodeFromString, 410748506, false, (String) objArr104[0], new Class[]{String.class});
                                                }
                                                long jLongValue13 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).invoke(null, objArr103)).longValue();
                                                long j71 = 1925347968;
                                                str13 = str11;
                                                long j72 = -988;
                                                long j73 = jLongValue13 ^ j19;
                                                String[] strArr17 = strArr16;
                                                int i559 = i558;
                                                long j74 = 494;
                                                long j75 = j71 ^ j19;
                                                long j76 = (((long) 495) * j71) + (((long) (-493)) * jLongValue13) + ((j71 | j73) * j72) + ((jLongValue13 | j75 | j2) * j74) + (j74 * (((j75 | j73) ^ j19) | ((j2 | jLongValue13) ^ j19) | ((jLongValue13 | j71) ^ j19))) + ((long) (-2126266205));
                                                int i560 = ((int) (j76 >> 32)) & (1403930874 + (((~((-283662248) | i)) | (-1153564164)) * (-948)) + ((~((-12604932) | i200)) * (-948)) + 735701244);
                                                int i561 = ((int) j76) & ((-635053948) + (((-67716353) | i) * (-627)) + (((~(1824116052 | i)) | 386889642) * (-627)) + (((~((-1824116053) | i200)) | (~(386889642 | i))) * 627));
                                                if (((i560 & i561) | (i560 ^ i561)) == 0) {
                                                    int i562 = -(-Color.alpha(0));
                                                    Object[] objArr105 = new Object[1];
                                                    a(((i562 | 1872) << 1) - (i562 ^ 1872), 14 - Color.argb(0, 0, 0, 0), (char) Drawable.resolveOpacity(0, 0), objArr105);
                                                    if (str46.equals((String) objArr105[0])) {
                                                        Object[] objArr106 = {str46};
                                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                                                            char cResolveOpacity2 = (char) Drawable.resolveOpacity(0, 0);
                                                            int threadPriority6 = ((Process.getThreadPriority(0) + 20) >> 6) + 993;
                                                            int i563 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 7;
                                                            byte b30 = (byte) (-1);
                                                            byte b31 = (byte) (b30 + 1);
                                                            Object[] objArr107 = new Object[1];
                                                            c(b30, b31, (byte) (b31 | 6), objArr107);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(cResolveOpacity2, threadPriority6, i563, 349342683, false, (String) objArr107[0], new Class[]{String.class});
                                                        }
                                                        long jLongValue14 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).invoke(null, objArr106)).longValue();
                                                        long j77 = -707708000;
                                                        long j78 = 988;
                                                        long j79 = jLongValue14 ^ j19;
                                                        long j80 = (((long) 989) * j77) + (((long) (-987)) * jLongValue14) + (((((j79 | j2) | j77) ^ j19) | (((j77 | jLongValue14) | j) ^ j19)) * j78) + (j72 * (j77 | j79)) + (j78 * ((((j77 ^ j19) | j79) ^ j19) | ((j79 | j) ^ j19) | ((jLongValue14 | (j2 | j77)) ^ j19))) + ((long) (-139370605));
                                                        int iMyTid5 = Process.myTid();
                                                        int i564 = ((int) (j80 >> 32)) & ((-434263776) + ((~((-75541666) | iMyTid5)) * (-301)) + (((~((-2049655389) | iMyTid5)) | (~((~iMyTid5) | (-612428978)))) * (-301)) + (((~(iMyTid5 | 612428977)) | (-2049655389)) * 301));
                                                        int i565 = ((int) j80) & ((-1590109718) + (((~((-276875929) | i200)) | 1714102338) * (-591)) + (((-276875929) | i) * 591));
                                                        if (((i564 & i565) | (i564 ^ i565)) != 0) {
                                                        }
                                                    }
                                                    i558 = i559 + 1;
                                                    strArr16 = strArr17;
                                                    str11 = str13;
                                                }
                                                i101 = i559;
                                                break;
                                            }
                                            int i566 = ((i101 | 130) << 1) - (i101 ^ 130);
                                            int i567 = (i566 & i200) | ((~i566) & i);
                                            int i568 = ~i101;
                                            int i569 = (i568 | (-i568)) >> 31;
                                            int i570 = (~i569) & i;
                                            int i571 = i569 & i567;
                                            int i572 = (i571 & i570) | (i570 ^ i571);
                                            int i573 = ((~i74) & i) | (i74 & i200);
                                            int i574 = -i573;
                                            int i575 = ((i573 & i574) | (i573 ^ i574)) >> 31;
                                            int i576 = i572 & (~i575);
                                            int i577 = i74 & i575;
                                            i74 = (i577 & i576) | (i576 ^ i577);
                                        }
                                        str14 = str13;
                                        int i578 = -TextUtils.lastIndexOf(str14, '0', 0, 0);
                                        int i579 = (i578 & 1949) + (i578 | 1949);
                                        int i580 = -(-Color.red(0));
                                        Object[] objArr108 = new Object[1];
                                        a(i579, (i580 & 13) + (i580 | 13), (char) KeyEvent.getDeadChar(0, 0), objArr108);
                                        String str47 = (String) objArr108[0];
                                        int iResolveOpacity3 = Drawable.resolveOpacity(0, 0) + 1963;
                                        int i581 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                        int i582 = (i581 * 866) - 5184;
                                        int i583 = ~i581;
                                        int i584 = ~((i583 & i200) | (i583 ^ i200));
                                        int i585 = -(-(((i584 & (-7)) | ((-7) ^ i584)) * (-865)));
                                        int i586 = (i582 & i585) + (i582 | i585);
                                        int i587 = (~((i581 ^ i) | (i581 & i))) * 865;
                                        int i588 = (i586 ^ i587) + ((i587 & i586) << 1);
                                        int i589 = ((~(i581 | i200)) | (~(((-7) ^ i200) | ((-7) & i200)))) * 865;
                                        int i590 = -(-TextUtils.lastIndexOf(str14, '0', 0, 0));
                                        Object[] objArr109 = new Object[1];
                                        a(iResolveOpacity3, (i588 ^ i589) + ((i589 & i588) << 1), (char) ((i590 ^ 1) + ((i590 & 1) << 1)), objArr109);
                                        String[] strArr18 = {str47, (String) objArr109[0]};
                                        int i591 = -(-(ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                        int i592 = (i591 & 1968) + (i591 | 1968);
                                        int i593 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                        Object[] objArr110 = new Object[1];
                                        a(i592, ((i593 | 15) << 1) - (i593 ^ 15), (char) KeyEvent.getDeadChar(0, 0), objArr110);
                                        String str48 = (String) objArr110[0];
                                        int i594 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                        int i595 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        Object[] objArr111 = new Object[1];
                                        a((i594 ^ 1983) + ((i594 & 1983) << 1), (i595 & 19) + (i595 | 19), (char) TextUtils.getOffsetBefore(str14, 0), objArr111);
                                        String str49 = (String) objArr111[0];
                                        Object[] objArr112 = new Object[1];
                                        a(2001 - (~View.MeasureSpec.getSize(0)), ((Process.getThreadPriority(0) + 20) >> 6) + 14, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr112);
                                        String[] strArr19 = {str48, str49, (String) objArr112[0]};
                                        int i596 = -Color.argb(0, 0, 0, 0);
                                        int i597 = (i596 ^ 2016) + ((i596 & 2016) << 1);
                                        int i598 = 20 - (~(-(ViewConfiguration.getScrollBarFadeDuration() >> 16)));
                                        int i599 = -(-Color.alpha(0));
                                        Object[] objArr113 = new Object[1];
                                        a(i597, i598, (char) ((i599 ^ 16942) + ((i599 & 16942) << 1)), objArr113);
                                        String str50 = (String) objArr113[0];
                                        int iIndexOf9 = 2037 - TextUtils.indexOf(str14, str14);
                                        int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 10;
                                        int i600 = -TextUtils.indexOf((CharSequence) str14, '0');
                                        Object[] objArr114 = new Object[1];
                                        a(iIndexOf9, tapTimeout2, (char) ((i600 ^ 50805) + ((i600 & 50805) << 1)), objArr114);
                                        String[] strArr20 = {str50, (String) objArr114[0]};
                                        int i601 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2046;
                                        int i602 = -View.getDefaultSize(0, 0);
                                        Object[] objArr115 = new Object[1];
                                        a(i601, ((i602 | 11) << 1) - (i602 ^ 11), (char) ((-2) - (~(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))), objArr115);
                                        String str51 = (String) objArr115[0];
                                        int jumpTapTimeout = 587 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                                        int i603 = -(-Color.blue(0));
                                        int i604 = (i603 ^ 6) + ((i603 & 6) << 1);
                                        int i605 = -TextUtils.getCapsMode(str14, 0, 0);
                                        Object[] objArr116 = new Object[1];
                                        a(jumpTapTimeout, i604, (char) (((i605 | 37337) << 1) - (i605 ^ 37337)), objArr116);
                                        String[] strArr21 = {str51, (String) objArr116[0]};
                                        int iIndexOf10 = 2057 - TextUtils.indexOf((CharSequence) str14, '0');
                                        int i606 = -Gravity.getAbsoluteGravity(0, 0);
                                        Object[] objArr117 = new Object[1];
                                        a(iIndexOf10, (i606 ^ 28) + ((i606 & 28) << 1), (char) (34785 - (~View.combineMeasuredStates(0, 0))), objArr117);
                                        String str52 = (String) objArr117[0];
                                        int i607 = -(-ExpandableListView.getPackedPositionType(0L));
                                        int i608 = ((i607 | 2037) << 1) - (i607 ^ 2037);
                                        int i609 = -(-KeyEvent.normalizeMetaState(0));
                                        int i610 = (i609 & 10) + (i609 | 10);
                                        int i611 = -((byte) KeyEvent.getModifierMetaStateMask());
                                        Object[] objArr118 = new Object[1];
                                        a(i608, i610, (char) ((i611 ^ 50805) + ((i611 & 50805) << 1)), objArr118);
                                        c2 = 0;
                                        strArr7 = new String[][]{strArr18, strArr19, strArr20, strArr21, new String[]{str52, (String) objArr118[0]}};
                                        i88 = 0;
                                        i89 = -1;
                                        loop7: while (true) {
                                            if (i88 < 5) {
                                                str15 = str14;
                                                i90 = i;
                                                break;
                                            }
                                            String[] strArr22 = strArr7[i88];
                                            str13 = strArr22[c2];
                                            strArr8 = (String[]) Arrays.copyOfRange(strArr22, 1, strArr22.length);
                                            length5 = strArr8.length;
                                            i96 = 0;
                                            while (i96 < length5) {
                                                int i612 = (i89 & 53) + (i89 | 53);
                                                i89 = ((i612 | (-52)) << 1) - (i612 ^ (-52));
                                                Object[] objArr119 = {str13, strArr8[i96]};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                                                    char keyRepeatDelay2 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                    int i613 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2386;
                                                    int i614 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 31;
                                                    byte b32 = (byte) (-1);
                                                    Object[] objArr120 = new Object[1];
                                                    c(b32, (byte) (b32 + 1), $$a[2], objArr120);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(keyRepeatDelay2, i613, i614, -1207062455, false, (String) objArr120[0], new Class[]{String.class, String.class});
                                                }
                                                long jLongValue15 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr119)).longValue();
                                                long j81 = 1505969514;
                                                i97 = i88;
                                                long j82 = 184;
                                                long j83 = j81 ^ j19;
                                                str15 = str14;
                                                i98 = i96;
                                                long j84 = (((long) (-183)) * j81) + (((long) 185) * jLongValue15) + ((((j83 | jLongValue15) ^ j19) | ((j2 | jLongValue15) ^ j19)) * j82) + (((long) (-184)) * (j | (((jLongValue15 ^ j19) | j81) ^ j19))) + (j82 * ((j83 | j2) ^ j19)) + ((long) 471073814);
                                                i99 = ((int) (j84 >> 32)) & ((-802173004) + (((-9810593) | i200) * (-369)) + (((~(546681504 | i200)) | 1983907915) * (-369)) + (((~((-546681505) | i)) | 536870912 | (~(1993718507 | i200))) * 369));
                                                int i615 = (~((int) SystemClock.uptimeMillis())) | (-953170359);
                                                i100 = ((int) j84) & (1414504652 + (i615 * 495) + (((~i615) | (-1020935160)) * 495));
                                                if (((i100 & i99) | (i99 ^ i100)) != 0) {
                                                    int i616 = (i89 & 170) + (i89 | 170);
                                                    i90 = (i616 & i200) | ((~i616) & i);
                                                    break loop7;
                                                }
                                                i96 = (((i98 | 90) << 1) - (i98 ^ 90)) - 89;
                                                strArr7 = strArr7;
                                                length5 = length5;
                                                strArr8 = strArr8;
                                                str13 = str13;
                                                i88 = i97;
                                                str14 = str15;
                                            }
                                            int i617 = i88;
                                            i88 = (i617 & 1) + (i617 | 1);
                                            strArr7 = strArr7;
                                            str14 = str14;
                                            c2 = 0;
                                        }
                                        int i618 = (~(i & i74)) & (i | i74);
                                        int i619 = -i618;
                                        int i620 = ((i618 & i619) | (i618 ^ i619)) >> 31;
                                        int i621 = i90 & (~i620);
                                        int i622 = i74 & i620;
                                        int i623 = (i622 & i621) | (i621 ^ i622);
                                        int i624 = 2085 - (~(-View.MeasureSpec.makeMeasureSpec(0, 0)));
                                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 13;
                                        int i625 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                        Object[] objArr121 = new Object[1];
                                        a(i624, scrollBarFadeDuration, (char) (((i625 | 1) << 1) - (i625 ^ 1)), objArr121);
                                        String str53 = (String) objArr121[0];
                                        int i626 = -View.resolveSize(0, 0);
                                        int i627 = ((i626 | 2099) << 1) - (i626 ^ 2099);
                                        int i628 = -(Process.myTid() >> 22);
                                        Object[] objArr122 = new Object[1];
                                        a(i627, (i628 & 8) + (i628 | 8), (char) TextUtils.getTrimmedLength(str15), objArr122);
                                        Object[] objArr123 = {str53, (String) objArr122[0]};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                                            str16 = str15;
                                            try {
                                                char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) str16, '0'));
                                                int iMyPid2 = (Process.myPid() >> 22) + 2385;
                                                int iLastIndexOf7 = TextUtils.lastIndexOf(str16, '0', 0) + 33;
                                                byte b33 = (byte) (-1);
                                                Object[] objArr124 = new Object[1];
                                                c(b33, (byte) (b33 + 1), $$a[2], objArr124);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cIndexOf2, iMyPid2, iLastIndexOf7, -1207062455, false, (String) objArr124[0], new Class[]{String.class, String.class});
                                            } catch (Throwable th15) {
                                                th5 = th15;
                                                cause = th5.getCause();
                                                if (cause != null) {
                                                    throw cause;
                                                }
                                                throw th5;
                                            }
                                        } else {
                                            str16 = str15;
                                        }
                                        long jLongValue16 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr123)).longValue();
                                        long j85 = 720416162;
                                        long j86 = (((long) (-519)) * j85) + (j18 * jLongValue16);
                                        long j87 = 520;
                                        long j88 = j85 ^ j19;
                                        long j89 = jLongValue16 ^ j19;
                                        str13 = str16;
                                        long elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                                        long j90 = elapsedCpuTime2 ^ j19;
                                        long j91 = j86 + (((((j88 | j89) | j90) ^ j19) | ((jLongValue16 | elapsedCpuTime2) ^ j19)) * j87);
                                        long j92 = (elapsedCpuTime2 | j85) ^ j19;
                                        long j93 = j91 + (((long) (-1040)) * (((j89 | j90) ^ j19) | j92)) + (j87 * (((j88 | j90) ^ j19) | ((j89 | j85) ^ j19) | j92)) + ((long) 1256627166);
                                        int i629 = (int) (j93 >> 32);
                                        int elapsedCpuTime3 = (int) Process.getElapsedCpuTime();
                                        i94 = i629 & ((-1599174398) + (((~(2028791971 | elapsedCpuTime3)) | (-2079259388)) * (-140)) + ((~((-50467417) | elapsedCpuTime3)) * 70) + (((~(elapsedCpuTime3 | (-591565561))) | (-1538161244)) * 70));
                                        int i630 = ~(((int) SystemClock.uptimeMillis()) | (-1940593011));
                                        i95 = ((int) j93) & (((((-1839979195) | i630) * (-658)) - 2103820497) + ((i630 | 301990208) * 658));
                                        if (((i94 & i95) | (i94 ^ i95)) != 0) {
                                            i91 = ~(i & 150);
                                            i92 = i | 150;
                                            i93 = i91 & i92;
                                        } else {
                                            i93 = i;
                                        }
                                        int i631 = i ^ i623;
                                        int i632 = (i631 | (-i631)) >> 31;
                                        int i633 = i93 & (~i632);
                                        int i634 = i623 & i632;
                                        int i635 = (i634 & i633) | (i633 ^ i634);
                                        int i636 = -Color.red(0);
                                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                        int i637 = i636 * (-432);
                                        int i638 = ((i637 | 914438) << 1) - (i637 ^ 914438);
                                        int i639 = ~i636;
                                        int i640 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                                        int i641 = (i640 & i639) | (i639 ^ i640);
                                        int i642 = -(-((~((i641 & 2107) | (i641 ^ 2107))) * 433));
                                        int i643 = ((i638 | i642) << 1) - (i642 ^ i638);
                                        int i644 = ~((-2108) | iTuitionPaymentFragmentspecialinlinedviewModeldefault6);
                                        int i645 = ((i639 & i644) | (i639 ^ i644)) * (-433);
                                        int i646 = (i643 & i645) + (i645 | i643);
                                        int i647 = ~i636;
                                        int i648 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault6 & i647) | (i647 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                                        int i649 = ~(i636 | 2107);
                                        Object[] objArr125 = new Object[1];
                                        a(i646 + (((i649 & i648) | (i648 ^ i649)) * 433), 47 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ExpandableListView.getPackedPositionType(0L), objArr125);
                                        Object[] objArr126 = {(String) objArr125[0]};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                                            char offsetBefore2 = (char) TextUtils.getOffsetBefore(str13, 0);
                                            int defaultSize2 = View.getDefaultSize(0, 0) + 993;
                                            int maxKeyCode = 8 - (KeyEvent.getMaxKeyCode() >> 16);
                                            byte b34 = (byte) (-1);
                                            byte b35 = (byte) (b34 + 1);
                                            Object[] objArr127 = new Object[1];
                                            c(b34, b35, b35, objArr127);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(offsetBefore2, defaultSize2, maxKeyCode, -545305915, false, (String) objArr127[0], new Class[]{String.class});
                                        }
                                        long jLongValue17 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr126)).longValue();
                                        long j94 = 580643516;
                                        long j95 = 829;
                                        long j96 = (j95 * j94) + (j95 * jLongValue17);
                                        long j97 = -828;
                                        long j98 = j96 + (((((j94 ^ j19) | (jLongValue17 ^ j19)) ^ j19) | (((j2 | j94) | jLongValue17) ^ j19)) * j97);
                                        long j99 = jLongValue17 | j94;
                                        long j100 = j98 + (j97 * (j99 | j2)) + (((long) 828) * (j99 ^ j19)) + ((long) 39815768);
                                        int iMyUid = Process.myUid();
                                        int i650 = (-818885110) + (((~((-1764619800) | iMyUid)) | 1747736083 | (~(327393388 | iMyUid))) * (-880));
                                        int i651 = (~((-1764619800) | (~iMyUid))) | (-327393389);
                                        int i652 = ~(iMyUid | 1764619799);
                                        int i653 = ((int) (j100 >> 32)) & (i650 + ((i651 | i652) * (-880)) + (i652 * 880));
                                        int iMyUid2 = Process.myUid();
                                        int i654 = ((int) j100) & (((1953427236 + (((~((-713034537) | iMyUid2)) | (~(2144706349 | iMyUid2))) * 69)) + (((~(iMyUid2 | 1808898857)) | ((~((-1048842029) | iMyUid2)) | 335807492)) * (-69))) - 1694773179);
                                        int i655 = (((i653 & i654) | (i653 ^ i654)) * 263) ^ i;
                                        int i656 = (~(i & i635)) & (i | i635);
                                        int i657 = -i656;
                                        int i658 = ((i656 & i657) | (i656 ^ i657)) >> 31;
                                        int i659 = i655 & (~i658);
                                        int i660 = i635 & i658;
                                        i67 = (i660 & i659) | (i659 ^ i660);
                                        strArr4 = strArr6;
                                    } else {
                                        str10 = str9;
                                    }
                                    long j810 = (((long) (-519)) * j85) + (j18 * jLongValue16);
                                    long j811 = 520;
                                    long j812 = j85 ^ j19;
                                    long j813 = jLongValue16 ^ j19;
                                    str13 = str16;
                                    long elapsedCpuTime4 = (int) Process.getElapsedCpuTime();
                                    long j910 = elapsedCpuTime4 ^ j19;
                                    long j911 = j810 + (((((j812 | j813) | j910) ^ j19) | ((jLongValue16 | elapsedCpuTime4) ^ j19)) * j811);
                                    long j912 = (elapsedCpuTime4 | j85) ^ j19;
                                    long j913 = j911 + (((long) (-1040)) * (((j813 | j910) ^ j19) | j912)) + (j811 * (((j812 | j910) ^ j19) | ((j813 | j85) ^ j19) | j912)) + ((long) 1256627166);
                                    int i6210 = (int) (j913 >> 32);
                                    int elapsedCpuTime5 = (int) Process.getElapsedCpuTime();
                                    i94 = i6210 & ((-1599174398) + (((~(2028791971 | elapsedCpuTime5)) | (-2079259388)) * (-140)) + ((~((-50467417) | elapsedCpuTime5)) * 70) + (((~(elapsedCpuTime5 | (-591565561))) | (-1538161244)) * 70));
                                    int i6310 = ~(((int) SystemClock.uptimeMillis()) | (-1940593011));
                                    i95 = ((int) j913) & (((((-1839979195) | i6310) * (-658)) - 2103820497) + ((i6310 | 301990208) * 658));
                                    if (((i94 & i95) | (i94 ^ i95)) != 0) {
                                        i91 = ~(i & 150);
                                        i92 = i | 150;
                                        i93 = i91 & i92;
                                    } else {
                                        i93 = i;
                                    }
                                } catch (Exception unused21) {
                                    str13 = str16;
                                    i91 = ~(i & 151);
                                    i92 = i | 151;
                                }
                                long jLongValue18 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr123)).longValue();
                                long j814 = 720416162;
                                int i6311 = i ^ i623;
                                int i6312 = (i6311 | (-i6311)) >> 31;
                                int i6313 = i93 & (~i6312);
                                int i6314 = i623 & i6312;
                                int i6315 = (i6314 & i6313) | (i6313 ^ i6314);
                                int i6316 = -Color.red(0);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i6317 = i6316 * (-432);
                                int i6318 = ((i6317 | 914438) << 1) - (i6317 ^ 914438);
                                int i6319 = ~i6316;
                                int i6410 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                                int i6411 = (i6410 & i6319) | (i6319 ^ i6410);
                                int i6412 = -(-((~((i6411 & 2107) | (i6411 ^ 2107))) * 433));
                                int i6413 = ((i6318 | i6412) << 1) - (i6412 ^ i6318);
                                int i6414 = ~((-2108) | iTuitionPaymentFragmentspecialinlinedviewModeldefault7);
                                int i6415 = ((i6319 & i6414) | (i6319 ^ i6414)) * (-433);
                                int i6416 = (i6413 & i6415) + (i6415 | i6413);
                                int i6417 = ~i6316;
                                int i6418 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault7 & i6417) | (i6417 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                                int i6419 = ~(i6316 | 2107);
                                Object[] objArr128 = new Object[1];
                                a(i6416 + (((i6419 & i6418) | (i6418 ^ i6419)) * 433), 47 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ExpandableListView.getPackedPositionType(0L), objArr128);
                                Object[] objArr129 = {(String) objArr128[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                                    char offsetBefore3 = (char) TextUtils.getOffsetBefore(str13, 0);
                                    int defaultSize3 = View.getDefaultSize(0, 0) + 993;
                                    int maxKeyCode2 = 8 - (KeyEvent.getMaxKeyCode() >> 16);
                                    byte b36 = (byte) (-1);
                                    byte b37 = (byte) (b36 + 1);
                                    Object[] objArr1210 = new Object[1];
                                    c(b36, b37, b37, objArr1210);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(offsetBefore3, defaultSize3, maxKeyCode2, -545305915, false, (String) objArr1210[0], new Class[]{String.class});
                                }
                                long jLongValue19 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr129)).longValue();
                                long j914 = 580643516;
                                long j915 = 829;
                                long j916 = (j915 * j914) + (j915 * jLongValue19);
                                long j917 = -828;
                                long j918 = j916 + (((((j914 ^ j19) | (jLongValue19 ^ j19)) ^ j19) | (((j2 | j914) | jLongValue19) ^ j19)) * j917);
                                long j919 = jLongValue19 | j914;
                                long j101 = j918 + (j917 * (j919 | j2)) + (((long) 828) * (j919 ^ j19)) + ((long) 39815768);
                                int iMyUid3 = Process.myUid();
                                int i6510 = (-818885110) + (((~((-1764619800) | iMyUid3)) | 1747736083 | (~(327393388 | iMyUid3))) * (-880));
                                int i6511 = (~((-1764619800) | (~iMyUid3))) | (-327393389);
                                int i6512 = ~(iMyUid3 | 1764619799);
                                int i6513 = ((int) (j101 >> 32)) & (i6510 + ((i6511 | i6512) * (-880)) + (i6512 * 880));
                                int iMyUid4 = Process.myUid();
                                int i6514 = ((int) j101) & (((1953427236 + (((~((-713034537) | iMyUid4)) | (~(2144706349 | iMyUid4))) * 69)) + (((~(iMyUid4 | 1808898857)) | ((~((-1048842029) | iMyUid4)) | 335807492)) * (-69))) - 1694773179);
                                int i6515 = (((i6513 & i6514) | (i6513 ^ i6514)) * 263) ^ i;
                                int i6516 = (~(i & i6315)) & (i | i6315);
                                int i6517 = -i6516;
                                int i6518 = ((i6516 & i6517) | (i6516 ^ i6517)) >> 31;
                                int i6519 = i6515 & (~i6518);
                                int i661 = i6315 & i6518;
                                i67 = (i661 & i6519) | (i6519 ^ i661);
                                strArr4 = strArr6;
                            } catch (Throwable th16) {
                                th = th16;
                                th5 = th;
                                cause = th5.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th5;
                            }
                            Object[] objArr1211 = {str53, (String) objArr122[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                                str16 = str15;
                                char cIndexOf3 = (char) ((-1) - TextUtils.indexOf((CharSequence) str16, '0'));
                                int iMyPid3 = (Process.myPid() >> 22) + 2385;
                                int iLastIndexOf8 = TextUtils.lastIndexOf(str16, '0', 0) + 33;
                                byte b38 = (byte) (-1);
                                Object[] objArr1212 = new Object[1];
                                c(b38, (byte) (b38 + 1), $$a[2], objArr1212);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cIndexOf3, iMyPid3, iLastIndexOf8, -1207062455, false, (String) objArr1212[0], new Class[]{String.class, String.class});
                            } else {
                                str16 = str15;
                            }
                        } catch (Throwable th17) {
                            th = th17;
                        }
                        int i6211 = 2085 - (~(-View.MeasureSpec.makeMeasureSpec(0, 0)));
                        int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 13;
                        int i6212 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        Object[] objArr1213 = new Object[1];
                        a(i6211, scrollBarFadeDuration2, (char) (((i6212 | 1) << 1) - (i6212 ^ 1)), objArr1213);
                        String str54 = (String) objArr1213[0];
                        int i6213 = -View.resolveSize(0, 0);
                        int i6214 = ((i6213 | 2099) << 1) - (i6213 ^ 2099);
                        int i6215 = -(Process.myTid() >> 22);
                        Object[] objArr1214 = new Object[1];
                        a(i6214, (i6215 & 8) + (i6215 | 8), (char) TextUtils.getTrimmedLength(str15), objArr1214);
                    } catch (Exception unused22) {
                        str13 = str15;
                    }
                } catch (Exception unused23) {
                }
                int i662 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                int i663 = ((i662 | 370) << 1) - (i662 ^ 370);
                int iMyTid6 = (Process.myTid() >> 22) + 23;
                int i664 = -Color.alpha(0);
                Object[] objArr130 = new Object[1];
                a(i663, iMyTid6, (char) ((i664 & 27637) + (i664 | 27637)), objArr130);
                String str55 = (String) objArr130[0];
                int i665 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                Object[] objArr131 = new Object[1];
                a((i665 & 809) + (i665 | 809), 10 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) ((-2) - ((-ExpandableListView.getPackedPositionChild(0L)) ^ (-1))), objArr131);
                String str56 = (String) objArr131[0];
                int iAlpha = Color.alpha(0);
                int i666 = iAlpha * (-1939);
                int i667 = (i666 ^ 794278) + ((i666 & 794278) << 1) + (((~(((-819) ^ iAlpha) | ((-819) & iAlpha))) | (~((i200 ^ 818) | (i200 & 818)))) * (-970));
                int i668 = ~iAlpha;
                int i669 = (i667 - (~((~((i668 & 818) | (i668 ^ 818))) * 1940))) - 1;
                int i670 = ~iAlpha;
                int i671 = ~((i670 & (-819)) | (i670 ^ (-819)));
                int i672 = ~((i200 ^ 818) | (i200 & 818));
                int i673 = ((i671 & i672) | (i671 ^ i672)) * 970;
                int i674 = (i669 ^ i673) + ((i673 & i669) << 1);
                String str57 = str10;
                int i675 = -TextUtils.indexOf(str57, str57);
                Object[] objArr132 = new Object[1];
                a(i674, ((i675 | 7) << 1) - (i675 ^ 7), (char) KeyEvent.normalizeMetaState(0), objArr132);
                String str58 = (String) objArr132[0];
                int iMyTid7 = Process.myTid() >> 22;
                int i676 = (iMyTid7 & 825) + (iMyTid7 | 825);
                int i677 = 8 - (~(-(-ExpandableListView.getPackedPositionChild(0L))));
                int i678 = -(-TextUtils.getCapsMode(str57, 0, 0));
                Object[] objArr133 = new Object[1];
                a(i676, i677, (char) ((i678 ^ 15942) + ((i678 & 15942) << 1)), objArr133);
                String[] strArr23 = {str55, str56, str58, (String) objArr133[0]};
                int i679 = -TextUtils.indexOf((CharSequence) str57, '0', 0, 0);
                int i680 = (i679 ^ 832) + ((i679 & 832) << 1);
                int i681 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                Object[] objArr134 = new Object[1];
                a(i680, (i681 ^ 18) + ((i681 & 18) << 1), (char) (ViewConfiguration.getEdgeSlop() >> 16), objArr134);
                String str59 = (String) objArr134[0];
                int mode2 = View.MeasureSpec.getMode(0);
                int i682 = (mode2 & 850) + (mode2 | 850);
                int i683 = 6 - (~(-(-View.combineMeasuredStates(0, 0))));
                int i684 = -(-(ViewConfiguration.getMaximumFlingVelocity() >> 16));
                Object[] objArr135 = new Object[1];
                a(i682, i683, (char) ((i684 & 36510) + (i684 | 36510)), objArr135);
                String str60 = (String) objArr135[0];
                int maxKeyCode3 = (KeyEvent.getMaxKeyCode() >> 16) + 857;
                int i685 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                int i686 = ((i685 | 8) << 1) - (i685 ^ 8);
                int i687 = -Process.getGidForName(str57);
                Object[] objArr136 = new Object[1];
                a(maxKeyCode3, i686, (char) (((i687 | 55109) << 1) - (i687 ^ 55109)), objArr136);
                String str61 = (String) objArr136[0];
                int i688 = -Color.blue(0);
                Object[] objArr137 = new Object[1];
                a((i688 & 864) + (i688 | 864), 9 - (~(-TextUtils.lastIndexOf(str57, '0', 0, 0))), (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 30326), objArr137);
                String str62 = (String) objArr137[0];
                int gidForName3 = Process.getGidForName(str57);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i689 = gidForName3 * (-813);
                int i690 = (i689 & 357408) + (i689 | 357408);
                int i691 = ~(((-877) ^ gidForName3) | ((-877) & gidForName3));
                int i692 = ~(gidForName3 | iTuitionPaymentFragmentspecialinlinedviewModeldefault8);
                int i693 = ((i691 ^ i692) | (i692 & i691)) * (-814);
                int i694 = (i690 & i693) + (i690 | i693);
                int i695 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (-877));
                int i696 = ~gidForName3;
                int i697 = i695 | (~((i696 ^ 876) | (i696 & 876)));
                int i698 = ~((gidForName3 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (gidForName3 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                int i699 = ((i697 & i698) | (i697 ^ i698)) * 407;
                int i700 = (i694 & i699) + (i699 | i694);
                int i701 = ~gidForName3;
                int i702 = ~((i701 ^ 876) | (i701 & 876));
                int i703 = ~((i701 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (i701 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                int i704 = (i703 & i702) | (i702 ^ i703);
                int i705 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault8 ^ 876) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault8 & 876));
                Object[] objArr138 = new Object[1];
                a((i700 - (~(-(-(((i704 & i705) | (i704 ^ i705)) * 407))))) - 1, 13 - (~(-(ViewConfiguration.getTouchSlop() >> 8))), (char) TextUtils.indexOf(str57, str57), objArr138);
                String[] strArr24 = {str59, str60, str61, str62, (String) objArr138[0]};
                int i706 = -TextUtils.indexOf(str57, str57, 0, 0);
                int i707 = (i706 & 889) + (i706 | 889);
                int i708 = -KeyEvent.getDeadChar(0, 0);
                Object[] objArr139 = new Object[1];
                a(i707, (i708 & 16) + (i708 | 16), (char) ExpandableListView.getPackedPositionType(0L), objArr139);
                String str63 = (String) objArr139[0];
                int i709 = -(-MotionEvent.axisFromString(str57));
                int i710 = (i709 ^ TypedValues.Custom.TYPE_REFERENCE) + ((i709 & TypedValues.Custom.TYPE_REFERENCE) << 1);
                int iBlue2 = Color.blue(0);
                Object[] objArr140 = new Object[1];
                a(i710, (iBlue2 & 3) + (iBlue2 | 3), (char) (46347 - (~(-TextUtils.getOffsetAfter(str57, 0)))), objArr140);
                String str64 = (String) objArr140[0];
                int minimumFlingVelocity2 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 916;
                int i711 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                Object[] objArr141 = new Object[1];
                a(minimumFlingVelocity2, (i711 ^ 23) + ((i711 & 23) << 1), (char) View.resolveSize(0, 0), objArr141);
                String str65 = (String) objArr141[0];
                int i712 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int i713 = (i712 ^ 939) + ((i712 & 939) << 1);
                int i714 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 24;
                int tapTimeout3 = ViewConfiguration.getTapTimeout() >> 16;
                Object[] objArr142 = new Object[1];
                a(i713, i714, (char) (((tapTimeout3 | 64621) << 1) - (tapTimeout3 ^ 64621)), objArr142);
                String str66 = (String) objArr142[0];
                Object[] objArr143 = new Object[1];
                a(1010 - (~(-AndroidCharacter.getMirror('0'))), TextUtils.indexOf((CharSequence) str57, '0', 0, 0) + 29, (char) (ImageFormat.getBitsPerPixel(0) + 1), objArr143);
                String[] strArr25 = {str63, str64, str, str65, str66, (String) objArr143[0]};
                int i715 = -(-View.MeasureSpec.makeMeasureSpec(0, 0));
                int i716 = (i715 & 991) + (i715 | 991);
                int minimumFlingVelocity3 = ViewConfiguration.getMinimumFlingVelocity() >> 16;
                int i717 = ((minimumFlingVelocity3 | 11) << 1) - (minimumFlingVelocity3 ^ 11);
                int i718 = -View.getDefaultSize(0, 0);
                Object[] objArr144 = new Object[1];
                a(i716, i717, (char) (((i718 | 4847) << 1) - (i718 ^ 4847)), objArr144);
                String str67 = (String) objArr144[0];
                Object[] objArr145 = new Object[1];
                a(1001 - (~(-(-View.MeasureSpec.makeMeasureSpec(0, 0)))), View.MeasureSpec.getSize(0) + 8, (char) (55172 - (~(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))))), objArr145);
                String str68 = (String) objArr145[0];
                int scrollBarSize = 1010 - (ViewConfiguration.getScrollBarSize() >> 8);
                int i719 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                Object[] objArr146 = new Object[1];
                a(scrollBarSize, (i719 ^ 6) + ((i719 & 6) << 1), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 21361), objArr146);
                String str69 = (String) objArr146[0];
                int keyRepeatTimeout2 = 1016 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int i720 = -(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                Object[] objArr147 = new Object[1];
                a(keyRepeatTimeout2, (i720 ^ 5) + ((i720 & 5) << 1), (char) (64317 - TextUtils.getOffsetBefore(str57, 0)), objArr147);
                String[] strArr26 = {str67, str68, str69, (String) objArr147[0]};
                int i721 = -TextUtils.lastIndexOf(str57, '0', 0);
                int i722 = (i721 ^ PointerIconCompat.TYPE_GRABBING) + ((i721 & PointerIconCompat.TYPE_GRABBING) << 1);
                int iGreen2 = Color.green(0);
                Object[] objArr148 = new Object[1];
                a(i722, ((iGreen2 | 16) << 1) - (iGreen2 ^ 16), (char) (ViewConfiguration.getPressedStateDuration() >> 16), objArr148);
                String str70 = (String) objArr148[0];
                int defaultSize4 = 857 - View.getDefaultSize(0, 0);
                int i723 = -(-TextUtils.indexOf((CharSequence) str57, '0', 0, 0));
                int i724 = (i723 & 8) + (i723 | 8);
                int i725 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                Object[] objArr149 = new Object[1];
                a(defaultSize4, i724, (char) ((i725 & 55111) + (i725 | 55111)), objArr149);
                String str71 = (String) objArr149[0];
                Object[] objArr150 = new Object[1];
                a(825 - TextUtils.indexOf(str57, str57, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 7, (char) (15941 - (~(-View.MeasureSpec.getSize(0)))), objArr150);
                String[] strArr27 = {str70, str71, (String) objArr150[0]};
                int i726 = -TextUtils.lastIndexOf(str57, '0', 0, 0);
                Object[] objArr151 = new Object[1];
                a(((i726 | 1037) << 1) - (i726 ^ 1037), 13 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (64419 - (~(-(-TextUtils.getOffsetBefore(str57, 0))))), objArr151);
                String str72 = (String) objArr151[0];
                int i727 = -ExpandableListView.getPackedPositionGroup(0L);
                Object[] objArr152 = new Object[1];
                a((i727 ^ 1052) + ((i727 & 1052) << 1), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (Process.myPid() >> 22), objArr152);
                String[] strArr28 = {str72, (String) objArr152[0]};
                int scrollBarSize2 = ViewConfiguration.getScrollBarSize() >> 8;
                int i728 = ((scrollBarSize2 | 1053) << 1) - (scrollBarSize2 ^ 1053);
                int i729 = -Color.argb(0, 0, 0, 0);
                Object[] objArr153 = new Object[1];
                a(i728, ((i729 | 9) << 1) - (i729 ^ 9), (char) (45839 - (~(-(-TextUtils.indexOf(str57, str57, 0, 0))))), objArr153);
                String str73 = (String) objArr153[0];
                int i730 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i731 = i730 * (-183);
                int i732 = ((i731 | 196655) << 1) - (i731 ^ 196655);
                int i733 = -(-(((~i730) | 1063) * (-368)));
                int i734 = (i732 ^ i733) + ((i733 & i732) << 1);
                int i735 = (i730 ^ (-1064)) | (i730 & (-1064));
                int i736 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                int i737 = i734 + (((i735 & i736) | (i735 ^ i736)) * 184);
                int i738 = ~((~i730) | (-1064));
                int i739 = ~((i736 & i730) | (i736 ^ i730));
                int i740 = (i739 & i738) | (i738 ^ i739);
                int i741 = ~((i730 & 1063) | (i730 ^ 1063));
                int i742 = ((i741 & i740) | (i740 ^ i741)) * 184;
                Object[] objArr154 = new Object[1];
                a((i737 ^ i742) + ((i742 & i737) << 1), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1, (char) KeyEvent.normalizeMetaState(0), objArr154);
                String[] strArr29 = {str73, (String) objArr154[0]};
                int iIndexOf11 = TextUtils.indexOf((CharSequence) str57, '0', 0);
                int i743 = ((iIndexOf11 | 1064) << 1) - (iIndexOf11 ^ 1064);
                int i744 = -(-View.getDefaultSize(0, 0));
                Object[] objArr155 = new Object[1];
                a(i743, ((i744 | 16) << 1) - (i744 ^ 16), (char) (50083 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr155);
                String str74 = (String) objArr155[0];
                int i745 = -(-((Process.getThreadPriority(0) + 20) >> 6));
                int i746 = (i745 ^ TypedValues.Custom.TYPE_DIMENSION) + ((i745 & TypedValues.Custom.TYPE_DIMENSION) << 1);
                int i747 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i748 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                int i749 = (((((i747 * 980) - 2934) - (~((~((i748 & (-4)) | ((-4) ^ i748))) * 979))) - 1) - (~(-(-(((i747 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | (i747 & iTuitionPaymentFragmentspecialinlinedviewModeldefault10)) * (-979)))))) - 1;
                int i750 = ~((-4) | iTuitionPaymentFragmentspecialinlinedviewModeldefault10);
                int i751 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                int i752 = ~((i747 & i751) | (i751 ^ i747));
                int i753 = (i749 - (~(((i752 & i750) | (i750 ^ i752)) * 979))) - 1;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                Object[] objArr156 = new Object[1];
                a(i746, i753, (char) (((iMakeMeasureSpec | 46348) << 1) - (iMakeMeasureSpec ^ 46348)), objArr156);
                String str75 = (String) objArr156[0];
                int i754 = 850 - (~(-(-TextUtils.indexOf((CharSequence) str57, '0', 0))));
                int i755 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                int i756 = (i755 ^ 8) + ((i755 & 8) << 1);
                int i757 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
                Object[] objArr157 = new Object[1];
                a(i754, i756, (char) ((i757 ^ 36510) + ((i757 & 36510) << 1)), objArr157);
                String str76 = (String) objArr157[0];
                int i758 = -(-(ViewConfiguration.getKeyRepeatTimeout() >> 16));
                Object[] objArr158 = new Object[1];
                a((i758 ^ 1079) + ((i758 & 1079) << 1), (ViewConfiguration.getTouchSlop() >> 8) + 8, (char) (1859 - View.combineMeasuredStates(0, 0)), objArr158);
                String str77 = (String) objArr158[0];
                int iMyPid4 = Process.myPid() >> 22;
                int i759 = (iMyPid4 & 864) + (iMyPid4 | 864);
                int i760 = -(-KeyEvent.getDeadChar(0, 0));
                int i761 = (i760 & 11) + (i760 | 11);
                int i762 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                Object[] objArr159 = new Object[1];
                a(i759, i761, (char) ((i762 & 30327) + (i762 | 30327)), objArr159);
                String str78 = (String) objArr159[0];
                int i763 = 875 - (~(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                int iAxisFromString2 = MotionEvent.axisFromString(str57);
                Object[] objArr160 = new Object[1];
                a(i763, (iAxisFromString2 ^ 15) + ((iAxisFromString2 & 15) << 1), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr160);
                String[] strArr30 = {str74, str75, str76, str77, str78, (String) objArr160[0]};
                int i764 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                int i765 = (i764 & 1088) + (i764 | 1088);
                int i766 = -(-View.getDefaultSize(0, 0));
                Object[] objArr161 = new Object[1];
                a(i765, ((i766 | 20) << 1) - (i766 ^ 20), (char) (21641 - (~(-(-TextUtils.indexOf((CharSequence) str57, '0'))))), objArr161);
                String str79 = (String) objArr161[0];
                int i767 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int i768 = (i767 ^ 1107) + ((i767 & 1107) << 1);
                int i769 = 18 - (~(-(ViewConfiguration.getScrollBarFadeDuration() >> 16)));
                int i770 = -TextUtils.indexOf(str57, str57);
                Object[] objArr162 = new Object[1];
                a(i768, i769, (char) ((i770 & 55972) + (i770 | 55972)), objArr162);
                String str80 = (String) objArr162[0];
                int i771 = 1124 - (~(-ExpandableListView.getPackedPositionChild(0L)));
                int i772 = -(Process.myPid() >> 22);
                Object[] objArr163 = new Object[1];
                a(i771, (i772 & 31) + (i772 | 31), (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), objArr163);
                String str81 = (String) objArr163[0];
                int defaultSize5 = View.getDefaultSize(0, 0);
                int i773 = (defaultSize5 ^ 1157) + ((defaultSize5 & 1157) << 1);
                int iIndexOf12 = TextUtils.indexOf(str57, str57, 0) + 26;
                int i774 = -(-View.MeasureSpec.makeMeasureSpec(0, 0));
                Object[] objArr164 = new Object[1];
                a(i773, iIndexOf12, (char) (((i774 | 53100) << 1) - (i774 ^ 53100)), objArr164);
                String str82 = (String) objArr164[0];
                int i775 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                int i776 = (i775 & 1183) + (i775 | 1183);
                int threadPriority7 = Process.getThreadPriority(0);
                int i777 = -((((threadPriority7 | 20) << 1) - (threadPriority7 ^ 20)) >> 6);
                Object[] objArr165 = new Object[1];
                a(i776, ((i777 | 23) << 1) - (i777 ^ 23), (char) (View.resolveSizeAndState(0, 0, 0) + 43004), objArr165);
                String str83 = (String) objArr165[0];
                int i778 = -(Process.myPid() >> 22);
                int i779 = ((i778 | 1206) << 1) - (i778 ^ 1206);
                int i780 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                Object[] objArr166 = new Object[1];
                a(i779, (i780 & 34) + (i780 | 34), (char) (TextUtils.indexOf(str57, str57) + 56680), objArr166);
                String str84 = (String) objArr166[0];
                str11 = str57;
                String[] strArr31 = {str79, str80, str81, str82, str83, str84, str};
                int i781 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int i782 = i781 * 595;
                int i783 = (i782 ^ (-1471880)) + ((i782 & (-1471880)) << 1);
                int i784 = ~i781;
                int i785 = ~(i784 | 1240);
                int i786 = ~((i200 ^ 1240) | (i200 & 1240));
                int i787 = ((i785 & i786) | (i785 ^ i786)) * (-1188);
                int i788 = ((i783 | i787) << 1) - (i787 ^ i783);
                int i789 = ~((i784 & 1240) | (i784 ^ 1240));
                int i790 = ~(((-1241) ^ i) | ((-1241) & i));
                int i791 = (i789 & i790) | (i789 ^ i790);
                int i792 = ~((i200 ^ i781) | (i200 & i781));
                int i793 = (i788 - (~(((i791 & i792) | (i791 ^ i792)) * 594))) - 1;
                int i794 = ~((-1241) | i200);
                int i795 = ~(((-1241) & i781) | ((-1241) ^ i781));
                int i796 = (i794 & i795) | (i794 ^ i795);
                int i797 = ~((i781 & i200) | (i200 ^ i781));
                int i798 = ((i797 & i796) | (i796 ^ i797)) * 594;
                int i799 = ((i793 | i798) << 1) - (i798 ^ i793);
                int iLastIndexOf9 = TextUtils.lastIndexOf(str11, '0', 0);
                int i800 = (iLastIndexOf9 & 14) + (iLastIndexOf9 | 14);
                int i801 = -ExpandableListView.getPackedPositionChild(0L);
                Object[] objArr167 = new Object[1];
                a(i799, i800, (char) (((i801 | 43762) << 1) - (i801 ^ 43762)), objArr167);
                String str85 = (String) objArr167[0];
                int iNormalizeMetaState3 = 818 - KeyEvent.normalizeMetaState(0);
                int iResolveOpacity4 = Drawable.resolveOpacity(0, 0);
                Object[] objArr168 = new Object[1];
                a(iNormalizeMetaState3, ((iResolveOpacity4 | 7) << 1) - (iResolveOpacity4 ^ 7), (char) ((-Process.getGidForName(str11)) - 1), objArr168);
                String[] strArr32 = {str85, (String) objArr168[0]};
                int deadChar3 = KeyEvent.getDeadChar(0, 0);
                int i802 = ((deadChar3 | 1252) << 1) - (deadChar3 ^ 1252);
                int i803 = -TextUtils.getOffsetAfter(str11, 0);
                Object[] objArr169 = new Object[1];
                a(i802, ((i803 | 30) << 1) - (i803 ^ 30), (char) (8551 - (~(-ExpandableListView.getPackedPositionGroup(0L)))), objArr169);
                String str86 = (String) objArr169[0];
                Object[] objArr170 = new Object[1];
                a(1283 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) str11, '0') + 12, (char) (ViewConfiguration.getScrollBarSize() >> 8), objArr170);
                String[] strArr33 = {str86, (String) objArr170[0]};
                Object[] objArr171 = new Object[1];
                a(1293 - View.MeasureSpec.makeMeasureSpec(0, 0), 18 - (~(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr171);
                String str87 = (String) objArr171[0];
                int i804 = -TextUtils.lastIndexOf(str11, '0', 0, 0);
                int i805 = (i804 & 1311) + (i804 | 1311);
                int iArgb2 = 5 - Color.argb(0, 0, 0, 0);
                int i806 = -((byte) KeyEvent.getModifierMetaStateMask());
                Object[] objArr172 = new Object[1];
                a(i805, iArgb2, (char) ((i806 & 37152) + (i806 | 37152)), objArr172);
                String[] strArr34 = {str87, (String) objArr172[0]};
                int i807 = -AndroidCharacter.getMirror('0');
                Object[] objArr173 = new Object[1];
                a(((i807 | 1365) << 1) - (i807 ^ 1365), 18 - (~(-(ViewConfiguration.getMinimumFlingVelocity() >> 16))), (char) (Color.rgb(0, 0, 0) + 16788442), objArr173);
                String[] strArr35 = {(String) objArr173[0]};
                int i808 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                int i809 = ((i808 | 1337) << 1) - (i808 ^ 1337);
                int iKeyCodeFromString2 = KeyEvent.keyCodeFromString(str11);
                int i810 = iKeyCodeFromString2 * 491;
                int i811 = (i810 & (-7824)) + (i810 | (-7824));
                int i812 = ~iKeyCodeFromString2;
                int i813 = i812 | (-17);
                int i814 = -(-(((i813 & i200) | (i813 ^ i200)) * (-490)));
                int i815 = ((i811 | i814) << 1) - (i811 ^ i814);
                int i816 = ~(iKeyCodeFromString2 | (-17));
                int i817 = ~((-17) | i);
                int i818 = i815 + (((i816 & i817) | (i816 ^ i817)) * 490);
                int i819 = i812 * 490;
                int i820 = (i818 & i819) + (i819 | i818);
                int pressedStateDuration = ViewConfiguration.getPressedStateDuration() >> 16;
                Object[] objArr174 = new Object[1];
                a(i809, i820, (char) ((pressedStateDuration ^ 44008) + ((pressedStateDuration & 44008) << 1)), objArr174);
                String[] strArr36 = {(String) objArr174[0]};
                int i821 = -(-Gravity.getAbsoluteGravity(0, 0));
                int i822 = ((i821 | 1352) << 1) - (i821 ^ 1352);
                int i823 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                int i824 = ((i823 | 19) << 1) - (i823 ^ 19);
                int i825 = -ExpandableListView.getPackedPositionChild(0L);
                Object[] objArr175 = new Object[1];
                a(i822, i824, (char) ((i825 ^ (-1)) + (i825 << 1)), objArr175);
                String[] strArr37 = {(String) objArr175[0]};
                int i826 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                int i827 = ((i826 | 1371) << 1) - (i826 ^ 1371);
                int i828 = -View.getDefaultSize(0, 0);
                int i829 = ((i828 | 19) << 1) - (i828 ^ 19);
                int i830 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                Object[] objArr176 = new Object[1];
                a(i827, i829, (char) (((i830 | 58950) << 1) - (i830 ^ 58950)), objArr176);
                String[] strArr38 = {(String) objArr176[0]};
                int i831 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                int i832 = (i831 ^ 1390) + ((i831 & 1390) << 1);
                int i833 = 22 - (~(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))));
                int i834 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                char c12 = (char) (((i834 | 14268) << 1) - (i834 ^ 14268));
                Object[] objArr177 = new Object[1];
                a(i832, i833, c12, objArr177);
                String[] strArr39 = {(String) objArr177[0]};
                int mode3 = View.MeasureSpec.getMode(0);
                int i835 = mode3 * 303;
                int i836 = (i835 & (-425313)) + (i835 | (-425313));
                int i837 = ~mode3;
                int i838 = i837 | i200;
                int i839 = (i837 & 1413) | (i837 ^ 1413);
                int i840 = ((i836 + (((~((i838 & 1413) | (i838 ^ 1413))) | (~((mode3 | 1413) | i))) * (-302))) - (~((~((i839 & i) | (i839 ^ i))) * (-604)))) - 1;
                int i841 = ~((mode3 & (-1414)) | ((-1414) ^ mode3));
                int i842 = ~((i ^ 1413) | (i & 1413));
                int i843 = (i840 - (~(-(-(((i841 & i842) | (i841 ^ i842)) * 302))))) - 1;
                int i844 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                Object[] objArr178 = new Object[1];
                a(i843, ((i844 | 22) << 1) - (i844 ^ 22), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr178);
                String[] strArr40 = {(String) objArr178[0]};
                int iIndexOf13 = TextUtils.indexOf(str11, str11, 0, 0);
                int i845 = (iIndexOf13 ^ 1434) + ((iIndexOf13 & 1434) << 1);
                int i846 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                Object[] objArr179 = new Object[1];
                a(i845, ((i846 | 25) << 1) - (i846 ^ 25), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr179);
                String str88 = str;
                String[] strArr41 = {(String) objArr179[0], str88};
                int i847 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                int i848 = (i847 ^ 1459) + ((i847 & 1459) << 1);
                int i849 = -TextUtils.indexOf((CharSequence) str11, '0');
                int i850 = ((i849 | 27) << 1) - (i849 ^ 27);
                int i851 = -ExpandableListView.getPackedPositionType(0L);
                Object[] objArr180 = new Object[1];
                a(i848, i850, (char) ((i851 & 37655) + (i851 | 37655)), objArr180);
                String[] strArr42 = {(String) objArr180[0], str88};
                int i852 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                int i853 = ((i852 | 1486) << 1) - (i852 ^ 1486);
                int i854 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                Object[] objArr181 = new Object[1];
                a(i853, ((i854 | 27) << 1) - (i854 ^ 27), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr181);
                String[] strArr43 = {(String) objArr181[0], str88};
                int i855 = 1512 - (~(-(ViewConfiguration.getDoubleTapTimeout() >> 16)));
                int i856 = -((Process.getThreadPriority(0) + 20) >> 6);
                Object[] objArr182 = new Object[1];
                a(i855, (i856 ^ 31) + ((i856 & 31) << 1), (char) ((-2) - ((-(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))) ^ (-1))), objArr182);
                String[] strArr44 = {(String) objArr182[0], str88};
                int i857 = 1543 - (~(ViewConfiguration.getTouchSlop() >> 8));
                int i858 = 26 - (~(ViewConfiguration.getMinimumFlingVelocity() >> 16));
                int i859 = -KeyEvent.normalizeMetaState(0);
                Object[] objArr183 = new Object[1];
                a(i857, i858, (char) (((i859 | 35931) << 1) - (i859 ^ 35931)), objArr183);
                String[] strArr45 = {(String) objArr183[0], str88};
                int i860 = 1571 - (~TextUtils.lastIndexOf(str11, '0', 0, 0));
                int windowTouchSlop = 32 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                int keyRepeatDelay3 = ViewConfiguration.getKeyRepeatDelay() >> 16;
                Object[] objArr184 = new Object[1];
                a(i860, windowTouchSlop, (char) ((keyRepeatDelay3 ^ 8205) + ((keyRepeatDelay3 & 8205) << 1)), objArr184);
                strArr5 = new String[][]{strArr23, strArr24, strArr25, strArr26, strArr27, strArr28, strArr29, strArr30, strArr31, strArr32, strArr33, strArr34, strArr35, strArr36, strArr37, strArr38, strArr39, strArr40, strArr41, strArr42, strArr43, strArr44, strArr45, new String[]{(String) objArr184[0], str88}};
                int i861 = -(ViewConfiguration.getTapTimeout() >> 16);
                i75 = 0;
                Object[] objArr185 = new Object[1];
                a(((i861 | 1603) << 1) - (i861 ^ 1603), 0 - (~(-(ViewConfiguration.getJumpTapTimeout() >> 16))), (char) (TextUtils.getTrimmedLength(str11) + 41173), objArr185);
                sb = new StringBuilder((String) objArr185[0]);
                i76 = i;
                i77 = 0;
                i78 = 0;
                for (i79 = 24; i77 < i79; i79 = 24) {
                    String[] strArr46 = strArr5[i77];
                    Object[] objArr186 = {strArr46[i75]};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cLastIndexOf3 = (char) (TextUtils.lastIndexOf(str11, '0') + 33603);
                        int i862 = 3086 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        int bitsPerPixel3 = 25 - ImageFormat.getBitsPerPixel(0);
                        byte b39 = (byte) (-1);
                        Object[] objArr187 = new Object[1];
                        c(b39, (byte) (b39 + 1), $$a[2], objArr187);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cLastIndexOf3, i862, bitsPerPixel3, 1411172903, false, (String) objArr187[0], new Class[]{String.class});
                    }
                    str12 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr186);
                    boolean z4 = true;
                    String[] strArr47 = (String[]) Arrays.copyOfRange(strArr46, 1, strArr46.length);
                    if (str12 == null && (!str12.isEmpty())) {
                        if (strArr46.length != 1) {
                            int length6 = strArr47.length;
                            int i863 = 0;
                            while (true) {
                                if (i863 >= length6) {
                                    i76 = i76;
                                } else if (str12.contains(strArr47[i863]) != z4) {
                                    i863++;
                                    z4 = true;
                                }
                            }
                        }
                        int i864 = TuitionPaymentFragmentbindingInflater1;
                        int i865 = i864 + 3;
                        b = i865 % 128;
                        int i866 = i865 % 2 == 0 ? 56 : 460;
                        int i867 = 46 * i77;
                        int i868 = (i866 & i867) + (i866 | i867);
                        int i869 = ~i77;
                        int i870 = -(-(((~(i869 | i200)) | 10) * (-90)));
                        int i871 = (i868 & i870) + (i870 | i868);
                        int i872 = ~((i869 ^ i) | (i869 & i));
                        int i873 = ~((i77 ^ 10) | (i77 & 10));
                        int i874 = ((i872 & i873) | (i872 ^ i873)) * (-45);
                        int i875 = i864 + 15;
                        int i876 = i875 % 128;
                        b = i876;
                        if (i875 % 2 == 0) {
                            i82 = i871 / i874;
                        } else {
                            i82 = (i871 ^ i874) + ((i871 & i874) << 1);
                            i869 = ~i77;
                        }
                        int i877 = ~((-11) | i);
                        int i878 = i82 + (45 * ((i877 & i869) | (i869 ^ i877) | (~((i200 ^ 10) | (i200 & 10)))));
                        i76 = (i | i878) & (~(i & i878));
                        int i879 = (((i78 | (-108)) << 1) - (i78 ^ (-108))) + 109;
                        if (i879 > 1) {
                            int i880 = (i876 & 95) + (i876 | 95);
                            TuitionPaymentFragmentbindingInflater1 = i880 % 128;
                            if (i880 % 2 != 0) {
                                i85 = 31714 % (ExpandableListView.getPackedPositionForChild(1, 0) > 1L ? 1 : (ExpandableListView.getPackedPositionForChild(1, 0) == 1L ? 0 : -1));
                                jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                                i86 = 4;
                            } else {
                                i85 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1605;
                                jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                                i86 = 3;
                            }
                            int i881 = -(jElapsedRealtimeNanos > 0L ? 1 : (jElapsedRealtimeNanos == 0L ? 0 : -1));
                            Object[] objArr188 = new Object[1];
                            a(i85, (i86 ^ i881) + ((i86 & i881) << 1), (char) (Process.myPid() >> 22), objArr188);
                            i83 = 0;
                            sb.append((String) objArr188[0]);
                        } else {
                            i83 = 0;
                        }
                        sb.append(strArr46[i83]);
                        int i882 = b + 21;
                        TuitionPaymentFragmentbindingInflater1 = i882 % 128;
                        if (i882 % 2 != 0) {
                            iIndexOf = 1605 >> TextUtils.indexOf((CharSequence) str11, '0', i83);
                            i84 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        } else {
                            iIndexOf = 1604 - (~(-TextUtils.indexOf((CharSequence) str11, '0', i83)));
                            i84 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        }
                        int iGreen3 = Color.green(i83);
                        char c13 = (char) ((59213 & iGreen3) + (59213 | iGreen3));
                        Object[] objArr189 = new Object[1];
                        a(iIndexOf, i84, c13, objArr189);
                        sb.append((String) objArr189[i83]);
                        sb.append(str12);
                        i78 = i879;
                    } else {
                        i76 = i76;
                    }
                    int i883 = (i77 & (-71)) + (i77 | (-71));
                    i77 = ((i883 | 72) << 1) - (i883 ^ 72);
                    i74 = i74;
                    strArr5 = strArr5;
                    i75 = 0;
                }
                int i884 = i74;
                i80 = i76;
                int iLastIndexOf10 = 1606 - TextUtils.lastIndexOf(str11, '0', i75, i75);
                int i885 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                Object[] objArr190 = new Object[1];
                a(iLastIndexOf10, (i885 ^ 1) + ((i885 & 1) << 1), (char) (9737 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr190);
                sb.append((String) objArr190[0]);
                objArr2 = new Object[2];
                if (i78 > 2) {
                    objArr2[0] = new int[1];
                    String[] strArr48 = {sb.toString()};
                    ((int[]) objArr2[0])[0] = i80;
                    objArr2[1] = strArr48;
                } else {
                    objArr2[0] = new int[]{i};
                    objArr2[1] = new String[0];
                }
                int i886 = ((int[]) objArr2[0])[0];
                int i887 = (~(i & i884)) & (i | i884);
                int i888 = -i887;
                int i889 = ((i887 & i888) | (i887 ^ i888)) >> 31;
                int i890 = i886 & (~i889);
                int i891 = i884 & i889;
                i74 = (i890 & i891) | (i890 ^ i891);
                strArr6 = (String[]) objArr2[1];
                f = 0.0f;
                i81 = 0;
                int i4410 = -(TypedValue.complexToFraction(i81, f, f) > f ? 1 : (TypedValue.complexToFraction(i81, f, f) == f ? 0 : -1));
                int i4411 = (i4410 & 889) + (i4410 | 889);
                int deadChar4 = KeyEvent.getDeadChar(i81, i81);
                Object[] objArr710 = new Object[1];
                a(i4411, (deadChar4 ^ 16) + ((deadChar4 & 16) << 1), (char) View.resolveSize(i81, i81), objArr710);
                Object[] objArr810 = {(String) objArr710[i81]};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                    char keyRepeatTimeout3 = (char) (33602 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    int i4412 = 3086 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int i4413 = 27 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    byte b210 = (byte) (-1);
                    Object[] objArr811 = new Object[1];
                    c(b210, (byte) (b210 + 1), $$a[2], objArr811);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(keyRepeatTimeout3, i4412, i4413, 1411172903, false, (String) objArr811[0], new Class[]{String.class});
                }
                objInvoke2 = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr810);
                if (objInvoke2 == null) {
                    i87 = 0;
                } else {
                    Object[] objArr812 = {objInvoke2, 42};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                        char c14 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iLastIndexOf11 = 3392 - TextUtils.lastIndexOf(str11, '0', 0);
                        int iMyTid8 = 9 - (Process.myTid() >> 22);
                        byte b211 = (byte) (-1);
                        Object[] objArr813 = new Object[1];
                        c(b211, (byte) (b211 + 1), $$a[2], objArr813);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c14, iLastIndexOf11, iMyTid8, 1203525406, false, (String) objArr813[0], new Class[]{String.class, Integer.TYPE});
                    }
                    long jLongValue110 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr812)).longValue();
                    long j610 = 554314274;
                    long j611 = -103;
                    long j612 = (j611 * j610) + (j611 * jLongValue110);
                    long j613 = 104;
                    long j614 = jLongValue110 ^ j19;
                    long j710 = j612 + (((((j610 ^ j19) | j614) ^ j19) | ((j614 | j) ^ j19)) * j613) + (((long) (-104)) * (((j2 | j610) | jLongValue110) ^ j19)) + (j613 * (j610 | j)) + ((long) (-556384151));
                    int iFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
                    int i4414 = ~iFreeMemory2;
                    int i4510 = (~((-2013913212) | i4414)) | 1476419627;
                    int i4511 = ~(iFreeMemory2 | (-39193217));
                    int i4512 = ((int) (j710 >> 32)) & ((((i4510 | i4511) * (-252)) - 167182338) + ((i4511 | (~(i4414 | (-537493585)))) * 252));
                    int i4513 = ~Process.myPid();
                    i87 = i4512 | (((int) j710) & (248622077 + (((-1212154114) | i4513) * 184) + (((~(i4513 | (-1307617550))) | (-1246299538)) * 184)));
                }
                if (i87 != 1986687685) {
                    str13 = str11;
                } else {
                    str13 = str11;
                }
                str14 = str13;
                int i5710 = -TextUtils.lastIndexOf(str14, '0', 0, 0);
                int i5711 = (i5710 & 1949) + (i5710 | 1949);
                int i5810 = -(-Color.red(0));
                Object[] objArr1010 = new Object[1];
                a(i5711, (i5810 & 13) + (i5810 | 13), (char) KeyEvent.getDeadChar(0, 0), objArr1010);
                String str410 = (String) objArr1010[0];
                int iResolveOpacity5 = Drawable.resolveOpacity(0, 0) + 1963;
                int i5811 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int i5812 = (i5811 * 866) - 5184;
                int i5813 = ~i5811;
                int i5814 = ~((i5813 & i200) | (i5813 ^ i200));
                int i5815 = -(-(((i5814 & (-7)) | ((-7) ^ i5814)) * (-865)));
                int i5816 = (i5812 & i5815) + (i5812 | i5815);
                int i5817 = (~((i5811 ^ i) | (i5811 & i))) * 865;
                int i5818 = (i5816 ^ i5817) + ((i5817 & i5816) << 1);
                int i5819 = ((~(i5811 | i200)) | (~(((-7) ^ i200) | ((-7) & i200)))) * 865;
                int i5910 = -(-TextUtils.lastIndexOf(str14, '0', 0, 0));
                Object[] objArr1011 = new Object[1];
                a(iResolveOpacity5, (i5818 ^ i5819) + ((i5819 & i5818) << 1), (char) ((i5910 ^ 1) + ((i5910 & 1) << 1)), objArr1011);
                String[] strArr110 = {str410, (String) objArr1011[0]};
                int i5911 = -(-(ViewConfiguration.getMaximumFlingVelocity() >> 16));
                int i5912 = (i5911 & 1968) + (i5911 | 1968);
                int i5913 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                Object[] objArr1110 = new Object[1];
                a(i5912, ((i5913 | 15) << 1) - (i5913 ^ 15), (char) KeyEvent.getDeadChar(0, 0), objArr1110);
                String str411 = (String) objArr1110[0];
                int i5914 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                int i5915 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                Object[] objArr1111 = new Object[1];
                a((i5914 ^ 1983) + ((i5914 & 1983) << 1), (i5915 & 19) + (i5915 | 19), (char) TextUtils.getOffsetBefore(str14, 0), objArr1111);
                String str412 = (String) objArr1111[0];
                Object[] objArr1112 = new Object[1];
                a(2001 - (~View.MeasureSpec.getSize(0)), ((Process.getThreadPriority(0) + 20) >> 6) + 14, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr1112);
                String[] strArr111 = {str411, str412, (String) objArr1112[0]};
                int i5916 = -Color.argb(0, 0, 0, 0);
                int i5917 = (i5916 ^ 2016) + ((i5916 & 2016) << 1);
                int i5918 = 20 - (~(-(ViewConfiguration.getScrollBarFadeDuration() >> 16)));
                int i5919 = -(-Color.alpha(0));
                Object[] objArr1113 = new Object[1];
                a(i5917, i5918, (char) ((i5919 ^ 16942) + ((i5919 & 16942) << 1)), objArr1113);
                String str510 = (String) objArr1113[0];
                int iIndexOf14 = 2037 - TextUtils.indexOf(str14, str14);
                int tapTimeout4 = (ViewConfiguration.getTapTimeout() >> 16) + 10;
                int i6010 = -TextUtils.indexOf((CharSequence) str14, '0');
                Object[] objArr1114 = new Object[1];
                a(iIndexOf14, tapTimeout4, (char) ((i6010 ^ 50805) + ((i6010 & 50805) << 1)), objArr1114);
                String[] strArr210 = {str510, (String) objArr1114[0]};
                int i6011 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2046;
                int i6012 = -View.getDefaultSize(0, 0);
                Object[] objArr1115 = new Object[1];
                a(i6011, ((i6012 | 11) << 1) - (i6012 ^ 11), (char) ((-2) - (~(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))), objArr1115);
                String str511 = (String) objArr1115[0];
                int jumpTapTimeout2 = 587 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                int i6013 = -(-Color.blue(0));
                int i6014 = (i6013 ^ 6) + ((i6013 & 6) << 1);
                int i6015 = -TextUtils.getCapsMode(str14, 0, 0);
                Object[] objArr1116 = new Object[1];
                a(jumpTapTimeout2, i6014, (char) (((i6015 | 37337) << 1) - (i6015 ^ 37337)), objArr1116);
                String[] strArr211 = {str511, (String) objArr1116[0]};
                int iIndexOf15 = 2057 - TextUtils.indexOf((CharSequence) str14, '0');
                int i6016 = -Gravity.getAbsoluteGravity(0, 0);
                Object[] objArr1117 = new Object[1];
                a(iIndexOf15, (i6016 ^ 28) + ((i6016 & 28) << 1), (char) (34785 - (~View.combineMeasuredStates(0, 0))), objArr1117);
                String str512 = (String) objArr1117[0];
                int i6017 = -(-ExpandableListView.getPackedPositionType(0L));
                int i6018 = ((i6017 | 2037) << 1) - (i6017 ^ 2037);
                int i6019 = -(-KeyEvent.normalizeMetaState(0));
                int i6110 = (i6019 & 10) + (i6019 | 10);
                int i6111 = -((byte) KeyEvent.getModifierMetaStateMask());
                Object[] objArr1118 = new Object[1];
                a(i6018, i6110, (char) ((i6111 ^ 50805) + ((i6111 & 50805) << 1)), objArr1118);
                c2 = 0;
                strArr7 = new String[][]{strArr110, strArr111, strArr210, strArr211, new String[]{str512, (String) objArr1118[0]}};
                i88 = 0;
                i89 = -1;
                loop7: while (true) {
                    if (i88 < 5) {
                        str15 = str14;
                        i90 = i;
                        break;
                    }
                    String[] strArr212 = strArr7[i88];
                    str13 = strArr212[c2];
                    strArr8 = (String[]) Arrays.copyOfRange(strArr212, 1, strArr212.length);
                    length5 = strArr8.length;
                    i96 = 0;
                    while (i96 < length5) {
                        int i6112 = (i89 & 53) + (i89 | 53);
                        i89 = ((i6112 | (-52)) << 1) - (i6112 ^ (-52));
                        Object[] objArr1119 = {str13, strArr8[i96]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                            char keyRepeatDelay4 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                            int i6113 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2386;
                            int i6114 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 31;
                            byte b310 = (byte) (-1);
                            Object[] objArr1215 = new Object[1];
                            c(b310, (byte) (b310 + 1), $$a[2], objArr1215);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(keyRepeatDelay4, i6113, i6114, -1207062455, false, (String) objArr1215[0], new Class[]{String.class, String.class});
                        }
                        long jLongValue111 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr1119)).longValue();
                        long j815 = 1505969514;
                        i97 = i88;
                        long j816 = 184;
                        long j817 = j815 ^ j19;
                        str15 = str14;
                        i98 = i96;
                        long j818 = (((long) (-183)) * j815) + (((long) 185) * jLongValue111) + ((((j817 | jLongValue111) ^ j19) | ((j2 | jLongValue111) ^ j19)) * j816) + (((long) (-184)) * (j | (((jLongValue111 ^ j19) | j815) ^ j19))) + (j816 * ((j817 | j2) ^ j19)) + ((long) 471073814);
                        i99 = ((int) (j818 >> 32)) & ((-802173004) + (((-9810593) | i200) * (-369)) + (((~(546681504 | i200)) | 1983907915) * (-369)) + (((~((-546681505) | i)) | 536870912 | (~(1993718507 | i200))) * 369));
                        int i6115 = (~((int) SystemClock.uptimeMillis())) | (-953170359);
                        i100 = ((int) j818) & (1414504652 + (i6115 * 495) + (((~i6115) | (-1020935160)) * 495));
                        if (((i100 & i99) | (i99 ^ i100)) != 0) {
                            int i6116 = (i89 & 170) + (i89 | 170);
                            i90 = (i6116 & i200) | ((~i6116) & i);
                            break loop7;
                        }
                        i96 = (((i98 | 90) << 1) - (i98 ^ 90)) - 89;
                        strArr7 = strArr7;
                        length5 = length5;
                        strArr8 = strArr8;
                        str13 = str13;
                        i88 = i97;
                        str14 = str15;
                    }
                    int i6117 = i88;
                    i88 = (i6117 & 1) + (i6117 | 1);
                    strArr7 = strArr7;
                    str14 = str14;
                    c2 = 0;
                }
                int i6118 = (~(i & i74)) & (i | i74);
                int i6119 = -i6118;
                int i6216 = ((i6118 & i6119) | (i6118 ^ i6119)) >> 31;
                int i6217 = i90 & (~i6216);
                int i6218 = i74 & i6216;
                int i6219 = (i6218 & i6217) | (i6217 ^ i6218);
            } else {
                strArr4 = null;
            }
            int i892 = i ^ i67;
            Object[] objArr191 = {new int[1], new int[]{i67}, null, new int[]{i}, strArr4};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i893 = ~iElapsedRealtime;
            int i894 = i3 + (((((1498642675 + (((~(804593604 | i893)) | 268967955) * 184)) + ((iElapsedRealtime | 104075520) * (-184))) + ((~((-969486040) | i893)) * 184)) - (~(((i892 | (-i892)) >> 31) & 16))) - 1);
            int i895 = i894 ^ (i894 << 13);
            int i896 = i895 >>> 17;
            int i897 = ((~i895) & i896) | ((~i896) & i895);
            ((int[]) objArr191[0])[0] = i897 ^ (i897 << 5);
            return objArr191;
        }
        i12 = i & (-267);
        i13 = i200 & 266;
        i11 = i12 | i13;
        int i2210 = ((~i206) & i) | (i206 & i200);
        int i2211 = -i2210;
        int i2310 = ((i2210 & i2211) | (i2210 ^ i2211)) >> 31;
        int i2311 = i11 & (~i2310);
        int i2312 = i206 & i2310;
        int i2313 = (i2311 & i2312) | (i2311 ^ i2312);
        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2061288340);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cCombineMeasuredStates2 = (char) (View.combineMeasuredStates(0, 0) + 56827);
            int modifierMetaStateMask6 = ((byte) KeyEvent.getModifierMetaStateMask()) + UByte.MAX_VALUE;
            int keyRepeatDelay5 = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 9;
            byte b110 = (byte) (-1);
            Object[] objArr210 = new Object[1];
            c(b110, (byte) (b110 + 1), $$a[2], objArr210);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cCombineMeasuredStates2, modifierMetaStateMask6, keyRepeatDelay5, -1639816125, false, (String) objArr210[0], new Class[0]);
        }
        long jLongValue20 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
        long j210 = 2058045682;
        long j211 = (((long) 477) * j210) + (((long) (-475)) * jLongValue20);
        long j212 = ((j210 ^ j19) | jLongValue20) ^ j19;
        long j213 = jLongValue20 ^ j19;
        long jFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
        long j214 = ((j213 | j210) | jFreeMemory2) ^ j19;
        long j215 = j211 + (((long) (-476)) * (j212 | j214)) + (((long) 952) * j214) + (((long) 476) * (((j213 | (jFreeMemory2 ^ j19)) | j210) ^ j19)) + ((long) 55310824);
        int startElapsedRealtime3 = (int) Process.getStartElapsedRealtime();
        int i2314 = (((int) (j215 >> 32)) & (635053320 + (((-16793617) | startElapsedRealtime3) * (-627)) + (((~(61237873 | startElapsedRealtime3)) | 1498464284) * (-627)) + (((~(startElapsedRealtime3 | 1498464284)) | (~((~startElapsedRealtime3) | (-61237874)))) * 627))) | (((int) j215) & (2072280017 + ((~((-146998869) | i200)) * (-116)) + (((-1220759125) | i) * 116) + (((~(216467285 | i)) | (-1290227542)) * 116)));
        int i2315 = 199 - (~(i2314 - 1));
        int i2316 = (i2315 | i) & (~(i & i2315));
        int i2317 = -i2314;
        int i2318 = ((i2314 & i2317) | (i2314 ^ i2317)) >> 31;
        int i2319 = (~i2318) & i;
        int i2410 = i2318 & i2316;
        int i2411 = (i2410 & i2319) | (i2319 ^ i2410);
        int i2412 = ((~i2313) & i) | (i2313 & i200);
        int i2413 = -i2412;
        int i2414 = ((i2412 & i2413) | (i2412 ^ i2413)) >> 31;
        int i2415 = i2411 & (~i2414);
        int i2416 = i2313 & i2414;
        int i2417 = (i2416 & i2415) | (i2415 ^ i2416);
        int i2418 = 202 - (~(-(ViewConfiguration.getJumpTapTimeout() >> 16)));
        int iResolveOpacity6 = Drawable.resolveOpacity(0, 0) + 20;
        int i2419 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
        Object[] objArr211 = new Object[1];
        a(i2418, iResolveOpacity6, (char) ((i2419 & 1) + (i2419 | 1)), objArr211);
        str3 = (String) objArr211[0];
        int i2510 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
        int i2511 = (i2510 ^ 223) + ((i2510 & 223) << 1);
        int i2512 = -TextUtils.lastIndexOf(str23, '0', 0);
        int i2513 = (i2512 & 5) + (i2512 | 5);
        int i2514 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
        Object[] objArr212 = new Object[1];
        a(i2511, i2513, (char) (((i2514 | 46596) << 1) - (i2514 ^ 46596)), objArr212);
        bytes = ((String) objArr212[0]).getBytes();
        length = bytes.length;
        if (length == 0) {
            i14 = 1;
        } else {
            bufferedInputStream2 = new BufferedInputStream(new FileInputStream(str3));
            i15 = 4096;
            bArr = new byte[4096];
            i16 = 0;
            while (true) {
                i17 = bufferedInputStream2.read(bArr, 0, i15);
                if (i17 > 0) {
                    break;
                    break;
                }
                i19 = 0;
                while (i16 < length) {
                    if (bArr[i19] == bytes[i16]) {
                        i16 = (i16 | 1) + (i16 & 1);
                    } else if (i16 != 0) {
                        i20 = i16 - 1;
                        int i2515 = b + 43;
                        TuitionPaymentFragmentbindingInflater1 = i2515 % 128;
                        int i2516 = i2515 % 2;
                        while (true) {
                            if (i20 > 0) {
                                i16 = 0;
                                break;
                                break;
                            }
                            i21 = 0;
                            while (true) {
                                if (i21 < i20) {
                                    i16 = i20;
                                    break;
                                    break;
                                }
                                i22 = i16 - i20;
                                if (bytes[i21] != bytes[(i22 ^ i21) + ((i22 & i21) << 1)]) {
                                    break;
                                }
                                i21 = (i21 | 1) + (i21 & 1);
                            }
                            int i2517 = i20 + 73;
                            i20 = ((i2517 & (-74)) << 1) + (i2517 ^ (-74));
                        }
                    }
                    i19++;
                }
                i15 = 4096;
            }
            if (i16 == length) {
                i18 = b + 49;
                TuitionPaymentFragmentbindingInflater1 = i18 % 128;
                if (i18 % 2 != 0) {
                    i14 = 0;
                } else {
                    i14 = 1;
                }
            } else {
                i14 = 0;
            }
            bufferedInputStream2.close();
        }
        int i2518 = ((-i14) | i14) >> 31;
        int i2519 = (~i2518) & i;
        int i2610 = ((i & (-263)) | (i200 & 262)) & i2518;
        int i2611 = (i2610 & i2519) | (i2519 ^ i2610);
        int i2612 = (~(i & i2417)) & (i | i2417);
        int i2613 = -i2612;
        int i2614 = ((i2612 & i2613) | (i2612 ^ i2613)) >> 31;
        int i2615 = (i2417 & i2614) | (i2611 & (~i2614));
        i23 = 4;
        int deadChar5 = KeyEvent.getDeadChar(0, 0);
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault11 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i2616 = deadChar5 * 399;
        int i2617 = ((i2616 | 91371) << 1) - (i2616 ^ 91371);
        int i2618 = ~deadChar5;
        int i2619 = (~((i2618 & 229) | (i2618 ^ 229))) | (~(((-230) & deadChar5) | ((-230) ^ deadChar5)));
        int i2710 = ~(((-230) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault11) | ((-230) & iTuitionPaymentFragmentspecialinlinedviewModeldefault11));
        int i2711 = (i2617 - (~(((i2619 & i2710) | (i2619 ^ i2710)) * 398))) - 1;
        int i2712 = ((deadChar5 ^ 229) | (deadChar5 & 229)) * (-1194);
        int i2713 = ((i2711 | i2712) << 1) - (i2711 ^ i2712);
        int i2714 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault11) | (-230));
        int i2715 = ~((~deadChar5) | 229);
        int i2716 = -(-(((i2714 & i2715) | (i2714 ^ i2715) | (~((deadChar5 & (-230)) | ((-230) ^ deadChar5)))) * 398));
        Object[] objArr213 = new Object[1];
        a((i2713 ^ i2716) + ((i2716 & i2713) << 1), 30 - TextUtils.indexOf((CharSequence) str23, '0'), (char) KeyEvent.keyCodeFromString(str23), objArr213);
        int packedPositionGroup4 = 260 - ExpandableListView.getPackedPositionGroup(0L);
        int i2717 = -(-(ViewConfiguration.getLongPressTimeout() >> 16));
        Object[] objArr310 = new Object[1];
        a(packedPositionGroup4, (i2717 ^ 23) + ((i2717 & 23) << 1), (char) TextUtils.getOffsetAfter(str23, 0), objArr310);
        int i2718 = TuitionPaymentFragmentbindingInflater1 + 81;
        b = i2718 % 128;
        int i2719 = i2718 % 2;
        int i2810 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
        int i2811 = (i2810 ^ 283) + ((i2810 & 283) << 1);
        int i2812 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
        int i2813 = -(-ImageFormat.getBitsPerPixel(0));
        Object[] objArr311 = new Object[1];
        a(i2811, (i2812 & 28) + (i2812 | 28), (char) ((i2813 & 29500) + (i2813 | 29500)), objArr311);
        int iLastIndexOf12 = 310 - TextUtils.lastIndexOf(str23, '0');
        int i2814 = 13 - (~(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24)));
        int i2815 = -(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
        Object[] objArr312 = new Object[1];
        a(iLastIndexOf12, i2814, (char) ((i2815 ^ 16338) + ((i2815 & 16338) << 1)), objArr312);
        strArr = new String[]{(String) objArr213[0], (String) objArr310[0], (String) objArr311[0], (String) objArr312[0]};
        i24 = 0;
        while (true) {
            if (i24 < i23) {
                i25 = i;
                break;
            }
            Object[] objArr313 = {strArr[i24]};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                char modifierMetaStateMask7 = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                int iNormalizeMetaState4 = KeyEvent.normalizeMetaState(0) + 993;
                int iCombineMeasuredStates3 = 8 - View.combineMeasuredStates(0, 0);
                byte b111 = (byte) (-1);
                byte b112 = (byte) (b111 + 1);
                Object[] objArr314 = new Object[1];
                c(b111, b112, (byte) (b112 | 6), objArr314);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(modifierMetaStateMask7, iNormalizeMetaState4, iCombineMeasuredStates3, 349342683, false, (String) objArr314[0], new Class[]{String.class});
            }
            long jLongValue21 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).invoke(null, objArr313)).longValue();
            long j216 = -51023838;
            long j310 = 530;
            long j311 = ((long) 1058) + (j310 * j216) + (j310 * jLongValue21);
            long j312 = 529;
            strArr11 = strArr;
            long jNextInt2 = new Random().nextInt(840354537);
            long j313 = j311 + (((((jNextInt2 ^ j19) | j216) ^ j19) | ((j216 | jLongValue21) ^ j19)) * j312) + (j312 * (((jNextInt2 | j216) ^ j19) | (jLongValue21 ^ j19))) + ((long) (-796054767));
            int i2816 = ~(1870331895 | i);
            i120 = ((int) (j313 >> 32)) & ((-1737788286) + ((17836418 | i2816) * (-476)) + (i2816 * 952) + ((~(1870331895 | i200)) * 476));
            i121 = ((int) j313) & ((((~((-1048581) | i)) | 1099239713) * TypedValues.PositionType.TYPE_TRANSITION_EASING) + 1369119980 + ((~((-1048581) | i200)) * TypedValues.PositionType.TYPE_TRANSITION_EASING));
            if (((i120 & i121) | (i120 ^ i121)) != 0) {
                int i2817 = (i24 & 252) + (i24 | 252);
                i25 = (i2817 & i200) | ((~i2817) & i);
                break;
            }
            int i2818 = i24 - 35;
            i24 = (i2818 & 36) + (i2818 | 36);
            strArr = strArr11;
            i23 = 4;
        }
        int i2819 = (~(i & i2615)) & (i | i2615);
        int i2910 = -i2819;
        int i2911 = ((i2819 & i2910) | (i2819 ^ i2910)) >> 31;
        int i2912 = i25 & (~i2911);
        int i2913 = i2615 & i2911;
        int i2914 = (i2913 & i2912) | (i2912 ^ i2913);
        int i2915 = -Process.getGidForName(str23);
        int i2916 = ((i2915 | 324) << 1) - (i2915 ^ 324);
        int i2917 = 12 - (~(-(-(ViewConfiguration.getPressedStateDuration() >> 16))));
        int i2918 = b + 21;
        TuitionPaymentFragmentbindingInflater1 = i2918 % 128;
        int i2919 = i2918 % 2;
        int i3010 = -TextUtils.indexOf((CharSequence) str23, '0', 0);
        Object[] objArr315 = new Object[1];
        a(i2916, i2917, (char) ((47496 ^ i3010) + ((i3010 & 47496) << 1)), objArr315);
        Object[] objArr316 = {(String) objArr315[0]};
        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char touchSlop3 = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 33602);
            int iLastIndexOf13 = 3084 - TextUtils.lastIndexOf(str23, '0', 0, 0);
            int tapTimeout5 = (ViewConfiguration.getTapTimeout() >> 16) + 26;
            byte b113 = (byte) (-1);
            Object[] objArr317 = new Object[1];
            c(b113, (byte) (b113 + 1), $$a[2], objArr317);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(touchSlop3, iLastIndexOf13, tapTimeout5, 1411172903, false, (String) objArr317[0], new Class[]{String.class});
        }
        str4 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr316);
        if (str4 != null) {
            int iMyTid9 = Process.myTid() >> 22;
            int i3011 = (iMyTid9 & 338) + (iMyTid9 | 338);
            int i3012 = 8 - (~(ViewConfiguration.getTouchSlop() >> 8));
            int i3013 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            objArr3 = new Object[1];
            a(i3011, i3012, (char) (((i3013 | 29275) << 1) - (i3013 ^ 29275)), objArr3);
            if (str4.contains((String) objArr3[0])) {
                i26 = (i & (-251)) | (i200 & ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
            } else {
                i26 = i;
            }
        } else {
            i26 = i;
        }
        int i3014 = ((~i2914) & i) | (i2914 & i200);
        int i3015 = -i3014;
        int i3016 = ((i3014 & i3015) | (i3014 ^ i3015)) >> 31;
        int i3017 = i26 & (~i3016);
        int i3018 = i2914 & i3016;
        int i3019 = (i3018 & i3017) | (i3017 ^ i3018);
        int i3110 = 346 - (~(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))));
        int i3111 = -Color.alpha(0);
        Object[] objArr318 = new Object[1];
        a(i3110, (i3111 ^ 17) + ((i3111 & 17) << 1), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr318);
        str5 = (String) objArr318[0];
        Object[] objArr319 = new Object[1];
        a(363 - (~(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24))), 6 - TextUtils.getCapsMode(str23, 0, 0), (char) Gravity.getAbsoluteGravity(0, 0), objArr319);
        bytes2 = ((String) objArr319[0]).getBytes();
        length2 = bytes2.length;
        if (length2 == 0) {
            i27 = (~(i & 251)) & (i | 251);
        } else {
            bufferedInputStream4 = new BufferedInputStream(new FileInputStream(str5));
            int i3112 = b + 19;
            TuitionPaymentFragmentbindingInflater1 = i3112 % 128;
            int i3113 = i3112 % 2;
            i28 = 4096;
            bArr2 = new byte[4096];
            i29 = 0;
            i30 = 0;
            while (true) {
                i31 = bufferedInputStream4.read(bArr2, i30, i28);
                if (i31 > 0) {
                    break;
                    break;
                }
                i32 = 0;
                while (i29 < length2) {
                    if (bArr2[i32] == bytes2[i29]) {
                        i35 = b + 25;
                        TuitionPaymentFragmentbindingInflater1 = i35 % 128;
                        if (i35 % 2 != 0) {
                            int i3114 = ((i29 | 140) << 1) - (i29 ^ 140);
                            i29 = ((i3114 | (-41)) << 1) - (i3114 ^ (-41));
                        } else {
                            i29 = ((i29 & 1) << 1) + (i29 ^ 1);
                        }
                    } else if (i29 != 0) {
                        i33 = i29 - 1;
                        while (true) {
                            if (i33 > 0) {
                                i29 = 0;
                                break;
                                break;
                            }
                            int i3115 = b + 35;
                            TuitionPaymentFragmentbindingInflater1 = i3115 % 128;
                            int i3116 = i3115 % 2;
                            i34 = 0;
                            while (true) {
                                if (i34 < i33) {
                                    i29 = i33;
                                    break;
                                    break;
                                }
                                if (bytes2[i34] != bytes2[((i29 - i33) - (~(-(-i34)))) - 1]) {
                                    break;
                                }
                                i34 = (i34 ^ 1) + ((i34 & 1) << 1);
                            }
                            int i3117 = (i33 ^ 13) + ((i33 & 13) << 1);
                            i33 = (i3117 & (-14)) + (i3117 | (-14));
                        }
                    }
                    i32 = (i32 | 1) + (i32 & 1);
                }
                i28 = 4096;
                i30 = 0;
            }
            if (i29 == length2) {
                z = true;
            } else {
                z = false;
            }
            bufferedInputStream4.close();
            int i3118 = TuitionPaymentFragmentbindingInflater1;
            int i3119 = ((i3118 | 25) << 1) - (i3118 ^ 25);
            b = i3119 % 128;
            int i3210 = i3119 % 2;
            if (z) {
                i27 = (~(i & 251)) & (i | 251);
            } else {
                i27 = i;
            }
        }
        int i3211 = ((~i3019) & i) | (i3019 & i200);
        int i3212 = (i3211 | (-i3211)) >> 31;
        int i3213 = i27 & (~i3212);
        int i3214 = i3019 & i3212;
        int i3215 = (i3214 & i3213) | (i3213 ^ i3214);
        int i3216 = -(-TextUtils.getTrimmedLength(str23));
        int bitsPerPixel4 = ImageFormat.getBitsPerPixel(0);
        Object[] objArr410 = new Object[1];
        a((i3216 & 370) + (i3216 | 370), (bitsPerPixel4 & 24) + (bitsPerPixel4 | 24), (char) (KeyEvent.getDeadChar(0, 0) + 27637), objArr410);
        Object[] objArr411 = {(String) objArr410[0]};
        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            char cResolveOpacity3 = (char) (Drawable.resolveOpacity(0, 0) + 33602);
            int doubleTapTimeout3 = 3085 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int bitsPerPixel5 = ImageFormat.getBitsPerPixel(0) + 27;
            byte b114 = (byte) (-1);
            Object[] objArr412 = new Object[1];
            c(b114, (byte) (b114 + 1), $$a[2], objArr412);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveOpacity3, doubleTapTimeout3, bitsPerPixel5, 1411172903, false, (String) objArr412[0], new Class[]{String.class});
        }
        lowerCase = ((String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr411)).toLowerCase();
        int i3217 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
        int i3218 = ((i3217 | 394) << 1) - (i3217 ^ 394);
        int i3219 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
        objArr = new Object[1];
        a(i3218, (i3219 & 5) + (i3219 | 5), (char) (ViewConfiguration.getEdgeSlop() >> 16), objArr);
        if (lowerCase.contains((String) objArr[0])) {
            i36 = (~(i & 264)) & (i | 264);
        } else {
            i36 = i;
        }
        int i3310 = ((~i3215) & i) | (i3215 & i200);
        int i3311 = -i3310;
        int i3312 = ((i3310 & i3311) | (i3310 ^ i3311)) >> 31;
        int i3313 = i36 & (~i3312);
        int i3314 = i3215 & i3312;
        int i3315 = (i3314 & i3313) | (i3313 ^ i3314);
        strArr2 = new String[6];
        iGreen = Color.green(0) + 397;
        int i3316 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
        i37 = (i3316 ^ 43) + ((i3316 & 43) << 1);
        int i3317 = TuitionPaymentFragmentbindingInflater1;
        int i3318 = ((i3317 | 119) << 1) - (i3317 ^ 119);
        b = i3318 % 128;
        i38 = i3318 % 2;
        gidForName = Process.getGidForName(str23);
        if (i38 == 0) {
            Object[] objArr413 = new Object[1];
            a(iGreen, i37, (char) (28388 % gidForName), objArr413);
            strArr2[0] = (String) objArr413[0];
            int iIndexOf16 = 15024 % TextUtils.indexOf((CharSequence) str23, 'X', 0);
            i41 = 82;
            c = 0;
            jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            i40 = iIndexOf16;
            i39 = 0;
        } else {
            int i3319 = -gidForName;
            char c15 = (char) (((i3319 | 28388) << 1) - (28388 ^ i3319));
            Object[] objArr414 = new Object[1];
            a(iGreen, i37, c15, objArr414);
            i39 = 0;
            strArr2[0] = (String) objArr414[0];
            i40 = 437 - (~(-TextUtils.indexOf((CharSequence) str23, '0', 0)));
            jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            i41 = 41;
            c = 1;
        }
        Object[] objArr415 = new Object[1];
        a(i40, i41 - (jCurrentThreadTimeMillis > (-1L) ? 1 : (jCurrentThreadTimeMillis == (-1L) ? 0 : -1)), (char) TextUtils.indexOf(str23, str23, i39, i39), objArr415);
        strArr2[c] = (String) objArr415[i39];
        Object[] objArr416 = new Object[1];
        a(TextUtils.getOffsetAfter(str23, i39) + 479, 26 - (~(ViewConfiguration.getMaximumFlingVelocity() >> 16)), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr416);
        strArr2[2] = (String) objArr416[0];
        int packedPositionType5 = ExpandableListView.getPackedPositionType(0L);
        Object[] objArr417 = new Object[1];
        a((packedPositionType5 ^ TypedValues.PositionType.TYPE_PERCENT_X) + ((packedPositionType5 & TypedValues.PositionType.TYPE_PERCENT_X) << 1), 26 - (~Gravity.getAbsoluteGravity(0, 0)), (char) ((-2) - (~(-(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))))), objArr417);
        strArr2[3] = (String) objArr417[0];
        int fadingEdgeLength2 = ViewConfiguration.getFadingEdgeLength() >> 16;
        int i3410 = ((fadingEdgeLength2 | 533) << 1) - (fadingEdgeLength2 ^ 533);
        int i3411 = -(-View.resolveSizeAndState(0, 0, 0));
        Object[] objArr418 = new Object[1];
        a(i3410, ((i3411 | 27) << 1) - (i3411 ^ 27), (char) (12660 - (~KeyEvent.getDeadChar(0, 0))), objArr418);
        strArr2[4] = (String) objArr418[0];
        Object[] objArr419 = new Object[1];
        a(559 - (~(-(-Color.alpha(0)))), View.MeasureSpec.getSize(0) + 27, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr419);
        strArr2[5] = (String) objArr419[0];
        i42 = 0;
        while (true) {
            if (i42 < 6) {
                i43 = i;
                break;
            }
            int i3412 = TuitionPaymentFragmentbindingInflater1;
            i119 = (i3412 & 51) + (i3412 | 51);
            b = i119 % 128;
            if (i119 % 2 == 0) {
                Object[] objArr510 = {strArr2[i42]};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                    char maximumFlingVelocity6 = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 33602);
                    int iAxisFromString3 = MotionEvent.axisFromString(str23) + 3086;
                    int iCombineMeasuredStates4 = View.combineMeasuredStates(0, 0) + 26;
                    byte b115 = (byte) (-1);
                    Object[] objArr511 = new Object[1];
                    c(b115, (byte) (b115 + 1), $$a[2], objArr511);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(maximumFlingVelocity6, iAxisFromString3, iCombineMeasuredStates4, 1411172903, false, (String) objArr511[0], new Class[]{String.class});
                }
                str18 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).invoke(null, objArr510);
                if (str18 != null) {
                    if (!str18.isEmpty()) {
                        i43 = (~(i & 265)) & (i | 265);
                        break;
                    }
                } else {
                    continue;
                }
            } else {
                Object[] objArr512 = {strArr2[i42]};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                    char cIndexOf4 = (char) (TextUtils.indexOf((CharSequence) str23, '0', 0) + 33603);
                    int i3413 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3084;
                    int iLastIndexOf14 = 25 - TextUtils.lastIndexOf(str23, '0', 0);
                    byte b116 = (byte) (-1);
                    Object[] objArr513 = new Object[1];
                    c(b116, (byte) (b116 + 1), $$a[2], objArr513);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(cIndexOf4, i3413, iLastIndexOf14, 1411172903, false, (String) objArr513[0], new Class[]{String.class});
                }
                str18 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).invoke(null, objArr512);
                int i3414 = 37 / 0;
                if (str18 != null) {
                    if (!str18.isEmpty()) {
                        i43 = (~(i & 265)) & (i | 265);
                        break;
                    }
                } else {
                    continue;
                }
            }
            i42 = (((i42 | 9) << 1) - (i42 ^ 9)) - 8;
        }
        int i3415 = ((~i3315) & i) | (i3315 & i200);
        int i3416 = (i3415 | (-i3415)) >> 31;
        int i3417 = i43 & (~i3416);
        int i3418 = i3315 & i3416;
        int i3419 = (i3418 & i3417) | (i3417 ^ i3418);
        int i3510 = (-16776870) - (~(-Color.rgb(0, 0, 0)));
        int i3511 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
        int i3512 = (i3511 & 17) + (i3511 | 17);
        int i3513 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
        Object[] objArr514 = new Object[1];
        a(i3510, i3512, (char) (((i3513 | 1) << 1) - (i3513 ^ 1)), objArr514);
        str6 = (String) objArr514[0];
        int i3514 = 588 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
        int i3515 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
        int i3516 = (i3515 & 6) + (i3515 | 6);
        int packedPositionGroup5 = ExpandableListView.getPackedPositionGroup(0L);
        Object[] objArr515 = new Object[1];
        a(i3514, i3516, (char) ((packedPositionGroup5 ^ 37337) + ((packedPositionGroup5 & 37337) << 1)), objArr515);
        bytes3 = ((String) objArr515[0]).getBytes();
        length3 = bytes3.length;
        if (length3 == 0) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault12 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i3517 = ~(((-622340707) & iTuitionPaymentFragmentspecialinlinedviewModeldefault12) | ((-622340707) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault12));
            int i3518 = (i3517 & 622332448) | (622332448 ^ i3517);
            int i3519 = ~((-1868074942) | iTuitionPaymentFragmentspecialinlinedviewModeldefault12);
            int i3610 = -(-(((i3518 & i3519) | (i3518 ^ i3519)) * (-880)));
            int i3611 = ((-672103249) ^ i3610) + ((i3610 & (-672103249)) << 1);
            int i3612 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault12;
            int i3613 = (~((i3612 & (-622340707)) | ((-622340707) ^ i3612))) | 1868074941;
            int i3614 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault12 & 622340706) | (622340706 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault12));
            int i3615 = -(-(((i3613 & i3614) | (i3613 ^ i3614)) * (-880)));
            int i3616 = (i3611 & i3615) + (i3615 | i3611);
            int i3617 = i3614 * 880;
            i116 = (i3616 & i3617) + (i3617 | i3616);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault13 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i3618 = (589731792 & iTuitionPaymentFragmentspecialinlinedviewModeldefault13) | (589731792 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault13);
            int i3619 = (-1100614503) - (~(-(-(((~((-1676614847) | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault13))) | (~i3618)) * 1150))));
            int i3715 = ~i3618;
            int i3716 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault13;
            int i3717 = ~(((-589731793) & i3716) | (i3716 ^ (-589731793)));
            i117 = (i3619 - (~(((i3715 & i3717) | (i3715 ^ i3717)) * (-575)))) - 1;
            int i3718 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault13 & (-1676614847)) | ((-1676614847) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault13));
            int i3719 = ~((1676614846 & i3716) | (i3716 ^ 1676614846));
            i118 = ((i3718 & i3719) | (i3718 ^ i3719)) * 575;
            if (i116 > (i117 ^ i118) + ((i118 & i117) << 1)) {
                int maximumFlingVelocity7 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 593;
                int i37110 = -(-TextUtils.indexOf(str23, str23, 0));
                int i37111 = -View.combineMeasuredStates(0, 0);
                Object[] objArr516 = new Object[1];
                a(maximumFlingVelocity7, (i37110 ^ 13) + ((i37110 & 13) << 1), (char) ((i37111 ^ 5682) + ((i37111 & 5682) << 1)), objArr516);
                str7 = (String) objArr516[0];
                int i37112 = -(-View.combineMeasuredStates(0, 0));
                int i37113 = (i37112 & TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO) + (i37112 | TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO);
                i52 = b + 65;
                TuitionPaymentFragmentbindingInflater1 = i52 % 128;
                if (i52 % 2 != 0) {
                    i54 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) * 17;
                    modifierMetaStateMask = KeyEvent.getModifierMetaStateMask();
                    i53 = 1;
                } else {
                    int i37114 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    i53 = 1;
                    i54 = ((i37114 & 9) << 1) + (i37114 ^ 9);
                    modifierMetaStateMask = KeyEvent.getModifierMetaStateMask();
                }
                Object[] objArr517 = new Object[i53];
                a(i37113, i54, (char) (34900 - (~(-(-((byte) modifierMetaStateMask))))), objArr517);
                bytes4 = ((String) objArr517[0]).getBytes();
                length4 = bytes4.length;
                if (length4 == 0) {
                    int i3811 = TuitionPaymentFragmentbindingInflater1;
                    int i3812 = (i3811 & 117) + (i3811 | 117);
                    b = i3812 % 128;
                    int i3813 = i3812 % 2;
                } else {
                    bufferedInputStream8 = new BufferedInputStream(new FileInputStream(str7));
                    i56 = 4096;
                    bArr6 = new byte[4096];
                    i57 = 0;
                    while (true) {
                        i58 = bufferedInputStream8.read(bArr6, 0, i56);
                        if (i58 > 0) {
                            break;
                            break;
                        }
                        i60 = 0;
                        while (i57 < length4) {
                            if (bArr6[i60] == bytes4[i57]) {
                                int i3814 = i57 + 72;
                                i57 = ((i3814 & (-71)) << 1) + (i3814 ^ (-71));
                            } else {
                                if (i57 != 0) {
                                    i61 = i57 - 1;
                                    while (true) {
                                        if (i61 > 0) {
                                            bArr7 = bArr6;
                                            i57 = 0;
                                            break;
                                            break;
                                        }
                                        i62 = 0;
                                        while (true) {
                                            if (i62 < i61) {
                                                bArr7 = bArr6;
                                                i57 = i61;
                                                break;
                                                break;
                                            }
                                            bArr8 = bArr6;
                                            if (bytes4[i62] != bytes4[(((i57 - (~(-i61))) - 1) - (~(-(-i62)))) - 1]) {
                                                break;
                                            }
                                            i62++;
                                            bArr6 = bArr8;
                                        }
                                        i61 = (-2) - (~i61);
                                        bArr6 = bArr8;
                                    }
                                }
                                bArr6 = bArr7;
                            }
                            bArr7 = bArr6;
                            i60 = (i60 & 1) + (i60 | 1);
                            bArr6 = bArr7;
                        }
                        bArr6 = bArr6;
                        i56 = 4096;
                    }
                    if (i57 == length4) {
                        int i3815 = b;
                        i59 = ((i3815 | 81) << 1) - (i3815 ^ 81);
                        TuitionPaymentFragmentbindingInflater1 = i59 % 128;
                        if (i59 % 2 != 0) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                    } else {
                        z3 = false;
                    }
                    bufferedInputStream8.close();
                    if (z3) {
                        i55 = i;
                    }
                }
                i55 = (~(i & 261)) & (i | 261);
            } else {
                i55 = i ^ 260;
            }
        } else {
            bufferedInputStream6 = new BufferedInputStream(new FileInputStream(str6));
            i44 = 4096;
            bArr3 = new byte[4096];
            i45 = 0;
            while (true) {
                i46 = bufferedInputStream6.read(bArr3, 0, i44);
                if (i46 > 0) {
                    break;
                    break;
                }
                i47 = 0;
                while (i45 < length3) {
                    if (bArr3[i47] == bytes3[i45]) {
                        int i3816 = (i45 & 88) + (i45 | 88);
                        i45 = (i3816 & (-87)) + (i3816 | (-87));
                    } else {
                        if (i45 != 0) {
                            i48 = i45 - 1;
                            while (true) {
                                if (i48 > 0) {
                                    bArr4 = bArr3;
                                    i45 = 0;
                                    break;
                                    break;
                                }
                                i49 = 0;
                                while (true) {
                                    if (i49 < i48) {
                                        bArr4 = bArr3;
                                        i45 = i48;
                                        break;
                                        break;
                                    }
                                    b2 = bytes3[i49];
                                    i50 = (i45 - (~(-i48))) - 1;
                                    bArr5 = bArr3;
                                    i51 = -(-i49);
                                    if (b2 != bytes3[(i50 & i51) + (i51 | i50)]) {
                                        break;
                                    }
                                    i49++;
                                    bArr3 = bArr5;
                                }
                                i48--;
                                bArr3 = bArr5;
                            }
                        }
                        bArr3 = bArr4;
                    }
                    bArr4 = bArr3;
                    i47 = (i47 & 1) + (i47 | 1);
                    bArr3 = bArr4;
                }
                bArr3 = bArr3;
                i44 = 4096;
            }
            if (i45 == length3) {
                z2 = true;
            } else {
                z2 = false;
            }
            bufferedInputStream6.close();
            if (z2) {
                i55 = i ^ 260;
            } else {
                int maximumFlingVelocity8 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 593;
                int i37115 = -(-TextUtils.indexOf(str23, str23, 0));
                int i37116 = -View.combineMeasuredStates(0, 0);
                Object[] objArr518 = new Object[1];
                a(maximumFlingVelocity8, (i37115 ^ 13) + ((i37115 & 13) << 1), (char) ((i37116 ^ 5682) + ((i37116 & 5682) << 1)), objArr518);
                str7 = (String) objArr518[0];
                int i37117 = -(-View.combineMeasuredStates(0, 0));
                int i37118 = (i37117 & TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO) + (i37117 | TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO);
                i52 = b + 65;
                TuitionPaymentFragmentbindingInflater1 = i52 % 128;
                if (i52 % 2 != 0) {
                    i54 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) * 17;
                    modifierMetaStateMask = KeyEvent.getModifierMetaStateMask();
                    i53 = 1;
                } else {
                    int i37119 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    i53 = 1;
                    i54 = ((i37119 & 9) << 1) + (i37119 ^ 9);
                    modifierMetaStateMask = KeyEvent.getModifierMetaStateMask();
                }
                Object[] objArr519 = new Object[i53];
                a(i37118, i54, (char) (34900 - (~(-(-((byte) modifierMetaStateMask))))), objArr519);
                bytes4 = ((String) objArr519[0]).getBytes();
                length4 = bytes4.length;
                if (length4 == 0) {
                    int i3817 = TuitionPaymentFragmentbindingInflater1;
                    int i3818 = (i3817 & 117) + (i3817 | 117);
                    b = i3818 % 128;
                    int i3819 = i3818 % 2;
                } else {
                    bufferedInputStream8 = new BufferedInputStream(new FileInputStream(str7));
                    i56 = 4096;
                    bArr6 = new byte[4096];
                    i57 = 0;
                    while (true) {
                        i58 = bufferedInputStream8.read(bArr6, 0, i56);
                        if (i58 > 0) {
                            break;
                            break;
                        }
                        i60 = 0;
                        while (i57 < length4) {
                            if (bArr6[i60] == bytes4[i57]) {
                                int i38110 = i57 + 72;
                                i57 = ((i38110 & (-71)) << 1) + (i38110 ^ (-71));
                            } else {
                                if (i57 != 0) {
                                    i61 = i57 - 1;
                                    while (true) {
                                        if (i61 > 0) {
                                            bArr7 = bArr6;
                                            i57 = 0;
                                            break;
                                            break;
                                        }
                                        i62 = 0;
                                        while (true) {
                                            if (i62 < i61) {
                                                bArr7 = bArr6;
                                                i57 = i61;
                                                break;
                                                break;
                                            }
                                            bArr8 = bArr6;
                                            if (bytes4[i62] != bytes4[(((i57 - (~(-i61))) - 1) - (~(-(-i62)))) - 1]) {
                                                break;
                                            }
                                            i62++;
                                            bArr6 = bArr8;
                                        }
                                        i61 = (-2) - (~i61);
                                        bArr6 = bArr8;
                                    }
                                }
                                bArr6 = bArr7;
                            }
                            bArr7 = bArr6;
                            i60 = (i60 & 1) + (i60 | 1);
                            bArr6 = bArr7;
                        }
                        bArr6 = bArr6;
                        i56 = 4096;
                    }
                    if (i57 == length4) {
                        int i38111 = b;
                        i59 = ((i38111 | 81) << 1) - (i38111 ^ 81);
                        TuitionPaymentFragmentbindingInflater1 = i59 % 128;
                        if (i59 % 2 != 0) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                    } else {
                        z3 = false;
                    }
                    bufferedInputStream8.close();
                    if (z3) {
                        i55 = i;
                    }
                }
                i55 = (~(i & 261)) & (i | 261);
            }
        }
        int i3910 = ((~i3419) & i) | (i3419 & i200);
        int i3911 = -i3910;
        int i3912 = ((i3910 & i3911) | (i3910 ^ i3911)) >> 31;
        int i3913 = i55 & (~i3912);
        int i3914 = i3419 & i3912;
        i63 = (i3914 & i3913) | (i3913 ^ i3914);
        if ((i2 & 8) == 0) {
            strArr10 = new String[3];
            int mode4 = View.MeasureSpec.getMode(0);
            int i3915 = b + 51;
            TuitionPaymentFragmentbindingInflater1 = i3915 % 128;
            int i3916 = i3915 % 2;
            int i4010 = -(-mode4);
            int i4011 = (615 ^ i4010) + ((i4010 & 615) << 1);
            int i4012 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            Object[] objArr610 = new Object[1];
            a(i4011, (i4012 ^ 44) + ((i4012 & 44) << 1), (char) (22102 - (~(-TextUtils.indexOf((CharSequence) str23, '0', 0, 0)))), objArr610);
            strArr10[0] = (String) objArr610[0];
            int i4013 = -(-View.combineMeasuredStates(0, 0));
            int i4014 = (i4013 ^ 658) + ((i4013 & 658) << 1);
            int i4015 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
            int i4016 = (i4015 ^ 42) + ((i4015 & 42) << 1);
            int i4017 = -(-TextUtils.lastIndexOf(str23, '0'));
            Object[] objArr611 = new Object[1];
            a(i4014, i4016, (char) ((i4017 ^ 1) + ((i4017 & 1) << 1)), objArr611);
            strArr10[1] = (String) objArr611[0];
            int i4018 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int i4019 = ((i4018 | 699) << 1) - (i4018 ^ 699);
            int i4110 = TuitionPaymentFragmentbindingInflater1;
            int i4111 = ((i4110 | 7) << 1) - (i4110 ^ 7);
            b = i4111 % 128;
            int i4112 = i4111 % 2;
            int i4113 = -View.MeasureSpec.makeMeasureSpec(0, 0);
            Object[] objArr612 = new Object[1];
            a(i4019, (38 & i4113) + (i4113 | 38), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr612);
            str17 = (String) objArr612[0];
            i108 = TuitionPaymentFragmentbindingInflater1 + 115;
            b = i108 % 128;
            if (i108 % 2 == 0) {
                strArr10[2] = str17;
                i109 = 1;
            } else {
                strArr10[2] = str17;
                i109 = 0;
            }
            while (true) {
                if (i109 < 3) {
                    i110 = i63;
                    i111 = i;
                    break;
                }
                Object[] objArr613 = {strArr10[i109]};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                    char cBlue2 = (char) Color.blue(0);
                    int iIndexOf17 = TextUtils.indexOf(str23, str23, 0, 0) + 993;
                    int threadPriority8 = 8 - ((Process.getThreadPriority(0) + 20) >> 6);
                    byte b117 = (byte) (-1);
                    byte b118 = (byte) (b117 + 1);
                    Object[] objArr614 = new Object[1];
                    c(b117, b118, (byte) (b118 | 6), objArr614);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(cBlue2, iIndexOf17, threadPriority8, 349342683, false, (String) objArr614[0], new Class[]{String.class});
                }
                long jLongValue22 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).invoke(null, objArr613)).longValue();
                long j314 = -121855221;
                long j315 = jLongValue22 ^ j19;
                i112 = i63;
                i113 = i109;
                long j316 = (((long) ((int) Runtime.getRuntime().totalMemory())) | jLongValue22) ^ j19;
                long j317 = (((long) (-391)) * j314) + (((long) (-195)) * jLongValue22) + (((long) (-196)) * (((j315 | j314) ^ j19) | j316)) + (((long) 392) * (jLongValue22 | j314)) + (((long) 196) * (j316 | (((j314 ^ j19) | j315) ^ j19))) + ((long) (-725223384));
                i114 = ((int) (j317 >> 32)) & (1704617878 + (((~(1008179970 | i)) | (-1033354155)) * 305) + (((~(1008179970 | i200)) | (-429046441)) * 305));
                int iMaxMemory3 = (int) Runtime.getRuntime().maxMemory();
                i115 = ((int) j317) & ((-1587633331) + (((~((-1159113009) | iMaxMemory3)) | 1222704 | (~((-278113402) | iMaxMemory3))) * (-744)) + (((~iMaxMemory3) | (-1436003706)) * 744) + ((iMaxMemory3 | (-1222705)) * 744));
                if (((i114 & i115) | (i114 ^ i115)) != 0) {
                    i111 = ((i113 ^ 280) + ((i113 & 280) << 1)) ^ i;
                    i110 = i112;
                    break;
                }
                i109 = i113 + 1;
                i63 = i112;
            }
            int i4114 = ((~i110) & i) | (i110 & i200);
            int i4115 = -i4114;
            int i4116 = ((i4114 & i4115) | (i4114 ^ i4115)) >> 31;
            int i4117 = i111 & (~i4116);
            int i4118 = i110 & i4116;
            i63 = (i4117 & i4118) | (i4117 ^ i4118);
        }
        int i4119 = 735 - (~(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
        int maximumDrawingCacheSize3 = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
        Object[] objArr615 = new Object[1];
        a(i4119, (maximumDrawingCacheSize3 ^ 41) + ((maximumDrawingCacheSize3 & 41) << 1), (char) (11307 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr615);
        String str210 = (String) objArr615[0];
        int i4210 = 777 - (~(-(-Color.alpha(0))));
        int i4211 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
        int i4212 = ((i4211 | 30) << 1) - (i4211 ^ 30);
        int i4213 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
        Object[] objArr616 = new Object[1];
        a(i4210, i4212, (char) (((i4213 | 49249) << 1) - (i4213 ^ 49249)), objArr616);
        strArr3 = new String[]{str210, (String) objArr616[0]};
        i64 = 0;
        while (true) {
            if (i64 < 2) {
                i65 = i63;
                str8 = str23;
                i66 = i;
                break;
            }
            Object[] objArr617 = {strArr3[i64]};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                char c16 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                int i4214 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 992;
                int modifierMetaStateMask8 = ((byte) KeyEvent.getModifierMetaStateMask()) + 9;
                byte b212 = (byte) (-1);
                byte b213 = (byte) (b212 + 1);
                Object[] objArr618 = new Object[1];
                c(b212, b213, (byte) (b213 | 6), objArr618);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(c16, i4214, modifierMetaStateMask8, 349342683, false, (String) objArr618[0], new Class[]{String.class});
            }
            long jLongValue23 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).invoke(null, objArr617)).longValue();
            long j318 = -203362343;
            long j319 = -964;
            str8 = str23;
            long j410 = jLongValue23 ^ j19;
            i65 = i63;
            strArr9 = strArr3;
            long jMaxMemory4 = (int) Runtime.getRuntime().maxMemory();
            long j411 = (((long) (-963)) * j318) + j319 + (((long) 965) * jLongValue23) + (((j318 ^ j19) | ((j410 | jMaxMemory4) ^ j19)) * j319) + (j319 * (((j410 | (jMaxMemory4 ^ j19)) ^ j19) | ((j410 | j318) ^ j19))) + ((long) (-643716262));
            int i4215 = ~((int) Process.getElapsedCpuTime());
            i106 = ((int) (j411 >> 32)) & (766110868 + ((~((-285511745) | i4215)) * (-783)) + (((~(i4215 | 1147364149)) | (-289862262)) * 783));
            int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
            int i4216 = ~startUptimeMillis2;
            i107 = ((int) j411) & (710580765 + (((~((-817816734) | i4216)) | 269780113) * 184) + ((startUptimeMillis2 | 71373056) * (-184)) + ((~(619409676 | i4216)) * 184));
            if (((i106 & i107) | (i106 ^ i107)) != 0) {
                int i4217 = (i64 & 288) + (i64 | 288);
                i66 = (i4217 | i) & (~(i & i4217));
                break;
            }
            int i4218 = i64 + 38;
            i64 = ((i4218 | (-37)) << 1) - (i4218 ^ (-37));
            i63 = i65;
            strArr3 = strArr9;
            str23 = str8;
        }
        int i4219 = i ^ i65;
        int i4310 = -i4219;
        int i4311 = ((i4219 & i4310) | (i4219 ^ i4310)) >> 31;
        int i4312 = i66 & (~i4311);
        int i4313 = i4311 & i65;
        i67 = (i4312 & i4313) | (i4312 ^ i4313);
        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-555308653);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            char trimmedLength3 = (char) TextUtils.getTrimmedLength(str8);
            int packedPositionChild3 = ExpandableListView.getPackedPositionChild(0L) + 3527;
            int touchSlop4 = 23 - (ViewConfiguration.getTouchSlop() >> 8);
            byte b214 = (byte) (-1);
            Object[] objArr619 = new Object[1];
            c(b214, (byte) (b214 + 1), $$a[2], objArr619);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(trimmedLength3, packedPositionChild3, touchSlop4, 980946500, false, (String) objArr619[0], new Class[0]);
        }
        long jLongValue24 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, null)).longValue();
        long j412 = 787348420;
        long j413 = 371;
        long j414 = (j413 * j412) + (j413 * jLongValue24);
        long j415 = -370;
        long j416 = jLongValue24 ^ j19;
        j = i;
        j2 = j ^ j19;
        long j417 = j412 ^ j19;
        long j418 = (jLongValue24 | j412) ^ j19;
        long j419 = j414 + ((((j416 | j2) ^ j19) | ((j417 | j) ^ j19)) * j415) + (j415 * (((j417 | j2) ^ j19) | ((j416 | j) ^ j19) | j418)) + (((long) 370) * j418) + ((long) (-967671058));
        i68 = ((int) (j419 >> 32)) & ((((~((-604578817) | i)) | 21004672) * TypedValues.PositionType.TYPE_TRANSITION_EASING) + 1552511530 + ((~((-604578817) | i200)) * TypedValues.PositionType.TYPE_TRANSITION_EASING));
        int startElapsedRealtime4 = (int) Process.getStartElapsedRealtime();
        i69 = ((int) j419) & ((((~(1515215122 | startElapsedRealtime4)) | (-1593203323)) * 262) + 1219520425 + (((~((~startElapsedRealtime4) | 1515215122)) | (-1593203323)) * 262));
        if (((i68 & i69) | (i68 ^ i69)) != 1) {
            int i4314 = b;
            i70 = (i4314 & 107) + (i4314 | 107);
            TuitionPaymentFragmentbindingInflater1 = i70 % 128;
            if (i70 % 2 != 0) {
                Object[] objArr711 = {1};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1331892133);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char cMyPid2 = (char) (Process.myPid() >> 22);
                    int packedPositionType6 = 2673 - ExpandableListView.getPackedPositionType(0L);
                    int doubleTapTimeout4 = 16 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    byte b215 = (byte) (-1);
                    Object[] objArr712 = new Object[1];
                    c(b215, (byte) (b215 + 1), $$a[2], objArr712);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(cMyPid2, packedPositionType6, doubleTapTimeout4, -1409439630, false, (String) objArr712[0], new Class[]{Integer.TYPE});
                }
                long jLongValue25 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).invoke(null, objArr711)).longValue();
                long j510 = 1184357934;
                long j511 = -755;
                long j512 = ((j510 ^ j19) | (jLongValue25 ^ j19)) ^ j19;
                long j513 = (j511 * j510) + (j511 * jLongValue25) + (((long) 1512) * j512);
                long j514 = jLongValue25 | j510;
                j3 = j513 + (((long) (-756)) * (j512 | ((j514 | j) ^ j19))) + (((long) 756) * (j514 | j2)) + ((long) 683340746);
            } else {
                Object[] objArr713 = {1};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1331892133);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c17 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int packedPositionType7 = 2673 - ExpandableListView.getPackedPositionType(0L);
                    int iResolveOpacity7 = Drawable.resolveOpacity(0, 0) + 16;
                    byte b216 = (byte) (-1);
                    Object[] objArr714 = new Object[1];
                    c(b216, (byte) (b216 + 1), $$a[2], objArr714);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c17, packedPositionType7, iResolveOpacity7, -1409439630, false, (String) objArr714[0], new Class[]{Integer.TYPE});
                }
                long jLongValue112 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr713)).longValue();
                long j515 = 1048616627;
                long j516 = 983;
                long j517 = jLongValue112 ^ j19;
                long j518 = (((long) (-1965)) * j515) + (((long) 984) * jLongValue112) + ((j515 | j517) * j516);
                long j519 = j515 ^ j19;
                long jMaxMemory5 = ((long) ((int) Runtime.getRuntime().maxMemory())) ^ j19;
                j3 = j518 + (((long) (-983)) * (j519 | ((j517 | jMaxMemory5) ^ j19))) + (j516 * (((jMaxMemory5 | j519) ^ j19) | ((jLongValue112 | j519) ^ j19))) + ((long) 819082053);
            }
            i71 = ((int) (j3 >> 32)) & (635053320 + (((-67700737) | i) * (-627)) + (((~(241125505 | i)) | 1678351916) * (-627)) + (((~((-241125506) | i200)) | (~(1678351916 | i))) * 627));
            int i4315 = ~Process.myUid();
            i72 = ((int) j3) & (((1019428157 + (((~(i4315 | (-1052938))) | (~(1845231615 | i4315))) * (-184))) + (((203476134 | (~(1641755481 | i4315))) | (~((-204529072) | i4315))) * 184)) - 1241557560);
            if (((i71 & i72) | (i71 ^ i72)) != 0) {
                i73 = i ^ 220;
            } else {
                i73 = i;
            }
            int i4316 = (~(i & i67)) & (i | i67);
            int i4317 = -i4316;
            int i4318 = ((i4316 & i4317) | (i4316 ^ i4317)) >> 31;
            int i4319 = i73 & (~i4318);
            int i4415 = i67 & i4318;
            i74 = (i4415 & i4319) | (i4319 ^ i4415);
            float f2 = 0.0f;
            int i4416 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int i4417 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23;
            int i4418 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
            Object[] objArr715 = new Object[1];
            a((i4416 & 370) + (i4416 | 370), i4417, (char) ((i4418 & 27637) + (i4418 | 27637)), objArr715);
            Object[] objArr716 = {(String) objArr715[0]};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                str9 = str8;
                char cLastIndexOf4 = (char) (TextUtils.lastIndexOf(str9, '0', 0) + 33603);
                int iIndexOf18 = 3084 - TextUtils.indexOf((CharSequence) str9, '0', 0, 0);
                int i4419 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 25;
                byte b217 = (byte) (-1);
                Object[] objArr717 = new Object[1];
                c(b217, (byte) (b217 + 1), $$a[2], objArr717);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cLastIndexOf4, iIndexOf18, i4419, 1411172903, false, (String) objArr717[0], new Class[]{String.class});
            } else {
                str9 = str8;
            }
            objInvoke = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr716);
            if (objInvoke != null) {
                Object[] objArr718 = {objInvoke, 42};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                    char cNormalizeMetaState2 = (char) KeyEvent.normalizeMetaState(0);
                    int threadPriority9 = 3393 - ((Process.getThreadPriority(0) + 20) >> 6);
                    int iIndexOf19 = 9 - TextUtils.indexOf(str9, str9, 0, 0);
                    byte b218 = (byte) (-1);
                    Object[] objArr719 = new Object[1];
                    c(b218, (byte) (b218 + 1), $$a[2], objArr719);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cNormalizeMetaState2, threadPriority9, iIndexOf19, 1203525406, false, (String) objArr719[0], new Class[]{String.class, Integer.TYPE});
                }
                long jLongValue113 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).invoke(null, objArr718)).longValue();
                long j615 = 1450996639;
                long j616 = 614;
                long j617 = j615 ^ j19;
                long j618 = (j617 | jLongValue113) ^ j19;
                long j619 = jLongValue113 ^ j19;
                str10 = str9;
                j4 = (((long) 615) * j615) + (((long) (-613)) * jLongValue113) + ((j | j618 | ((j619 | j615) ^ j19)) * j616) + (((long) (-1228)) * (((j617 | j2) ^ j19) | j618 | ((j2 | jLongValue113) ^ j19))) + (j616 * (((jLongValue113 | (j2 | j615)) ^ j19) | (((j617 | j619) | j2) ^ j19))) + ((long) (-1453066516));
                i102 = ((int) (j4 >> 32)) & (2038856378 + (((~((-1511261644) | i)) | (~((-25315845) | i200))) * 920) + (((~(99351076 | i200)) | 1511261643) * 920) + (((~((-1511261644) | i200)) | (~(1610612719 | i)) | (~((-25315845) | i))) * 920));
                i103 = 818884229 + (((~(126646586 | i)) | (-1335754112) | (~(1310579823 | i))) * (-880));
                i104 = (~(126646586 | i200)) | (-1310579824);
                i105 = ~((-126646587) | i);
                if ((i102 | (((int) j4) & (i103 + ((i104 | i105) * (-880)) + (i105 * 880)))) == 1986687685) {
                    str11 = str10;
                    i81 = 0;
                    strArr6 = null;
                }
                int i44110 = -(TypedValue.complexToFraction(i81, f2, f2) > f2 ? 1 : (TypedValue.complexToFraction(i81, f2, f2) == f2 ? 0 : -1));
                int i44111 = (i44110 & 889) + (i44110 | 889);
                int deadChar6 = KeyEvent.getDeadChar(i81, i81);
                Object[] objArr7110 = new Object[1];
                a(i44111, (deadChar6 ^ 16) + ((deadChar6 & 16) << 1), (char) View.resolveSize(i81, i81), objArr7110);
                Object[] objArr814 = {(String) objArr7110[i81]};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                    char keyRepeatTimeout4 = (char) (33602 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    int i44112 = 3086 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int i44113 = 27 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    byte b219 = (byte) (-1);
                    Object[] objArr815 = new Object[1];
                    c(b219, (byte) (b219 + 1), $$a[2], objArr815);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(keyRepeatTimeout4, i44112, i44113, 1411172903, false, (String) objArr815[0], new Class[]{String.class});
                }
                objInvoke2 = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr814);
                if (objInvoke2 == null) {
                    i87 = 0;
                } else {
                    Object[] objArr816 = {objInvoke2, 42};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                        char c18 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iLastIndexOf15 = 3392 - TextUtils.lastIndexOf(str11, '0', 0);
                        int iMyTid10 = 9 - (Process.myTid() >> 22);
                        byte b2110 = (byte) (-1);
                        Object[] objArr817 = new Object[1];
                        c(b2110, (byte) (b2110 + 1), $$a[2], objArr817);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c18, iLastIndexOf15, iMyTid10, 1203525406, false, (String) objArr817[0], new Class[]{String.class, Integer.TYPE});
                    }
                    long jLongValue114 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr816)).longValue();
                    long j6110 = 554314274;
                    long j6111 = -103;
                    long j6112 = (j6111 * j6110) + (j6111 * jLongValue114);
                    long j6113 = 104;
                    long j6114 = jLongValue114 ^ j19;
                    long j711 = j6112 + (((((j6110 ^ j19) | j6114) ^ j19) | ((j6114 | j) ^ j19)) * j6113) + (((long) (-104)) * (((j2 | j6110) | jLongValue114) ^ j19)) + (j6113 * (j6110 | j)) + ((long) (-556384151));
                    int iFreeMemory3 = (int) Runtime.getRuntime().freeMemory();
                    int i44114 = ~iFreeMemory3;
                    int i4514 = (~((-2013913212) | i44114)) | 1476419627;
                    int i4515 = ~(iFreeMemory3 | (-39193217));
                    int i4516 = ((int) (j711 >> 32)) & ((((i4514 | i4515) * (-252)) - 167182338) + ((i4515 | (~(i44114 | (-537493585)))) * 252));
                    int i4517 = ~Process.myPid();
                    i87 = i4516 | (((int) j711) & (248622077 + (((-1212154114) | i4517) * 184) + (((~(i4517 | (-1307617550))) | (-1246299538)) * 184)));
                }
                if (i87 != 1986687685) {
                    str13 = str11;
                } else {
                    str13 = str11;
                }
                str14 = str13;
                int i5712 = -TextUtils.lastIndexOf(str14, '0', 0, 0);
                int i5713 = (i5712 & 1949) + (i5712 | 1949);
                int i58110 = -(-Color.red(0));
                Object[] objArr1012 = new Object[1];
                a(i5713, (i58110 & 13) + (i58110 | 13), (char) KeyEvent.getDeadChar(0, 0), objArr1012);
                String str413 = (String) objArr1012[0];
                int iResolveOpacity8 = Drawable.resolveOpacity(0, 0) + 1963;
                int i58111 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int i58112 = (i58111 * 866) - 5184;
                int i58113 = ~i58111;
                int i58114 = ~((i58113 & i200) | (i58113 ^ i200));
                int i58115 = -(-(((i58114 & (-7)) | ((-7) ^ i58114)) * (-865)));
                int i58116 = (i58112 & i58115) + (i58112 | i58115);
                int i58117 = (~((i58111 ^ i) | (i58111 & i))) * 865;
                int i58118 = (i58116 ^ i58117) + ((i58117 & i58116) << 1);
                int i58119 = ((~(i58111 | i200)) | (~(((-7) ^ i200) | ((-7) & i200)))) * 865;
                int i59110 = -(-TextUtils.lastIndexOf(str14, '0', 0, 0));
                Object[] objArr1013 = new Object[1];
                a(iResolveOpacity8, (i58118 ^ i58119) + ((i58119 & i58118) << 1), (char) ((i59110 ^ 1) + ((i59110 & 1) << 1)), objArr1013);
                String[] strArr112 = {str413, (String) objArr1013[0]};
                int i59111 = -(-(ViewConfiguration.getMaximumFlingVelocity() >> 16));
                int i59112 = (i59111 & 1968) + (i59111 | 1968);
                int i59113 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                Object[] objArr11110 = new Object[1];
                a(i59112, ((i59113 | 15) << 1) - (i59113 ^ 15), (char) KeyEvent.getDeadChar(0, 0), objArr11110);
                String str414 = (String) objArr11110[0];
                int i59114 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                int i59115 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                Object[] objArr11111 = new Object[1];
                a((i59114 ^ 1983) + ((i59114 & 1983) << 1), (i59115 & 19) + (i59115 | 19), (char) TextUtils.getOffsetBefore(str14, 0), objArr11111);
                String str415 = (String) objArr11111[0];
                Object[] objArr11112 = new Object[1];
                a(2001 - (~View.MeasureSpec.getSize(0)), ((Process.getThreadPriority(0) + 20) >> 6) + 14, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr11112);
                String[] strArr113 = {str414, str415, (String) objArr11112[0]};
                int i59116 = -Color.argb(0, 0, 0, 0);
                int i59117 = (i59116 ^ 2016) + ((i59116 & 2016) << 1);
                int i59118 = 20 - (~(-(ViewConfiguration.getScrollBarFadeDuration() >> 16)));
                int i59119 = -(-Color.alpha(0));
                Object[] objArr11113 = new Object[1];
                a(i59117, i59118, (char) ((i59119 ^ 16942) + ((i59119 & 16942) << 1)), objArr11113);
                String str513 = (String) objArr11113[0];
                int iIndexOf110 = 2037 - TextUtils.indexOf(str14, str14);
                int tapTimeout6 = (ViewConfiguration.getTapTimeout() >> 16) + 10;
                int i60110 = -TextUtils.indexOf((CharSequence) str14, '0');
                Object[] objArr11114 = new Object[1];
                a(iIndexOf110, tapTimeout6, (char) ((i60110 ^ 50805) + ((i60110 & 50805) << 1)), objArr11114);
                String[] strArr213 = {str513, (String) objArr11114[0]};
                int i60111 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2046;
                int i60112 = -View.getDefaultSize(0, 0);
                Object[] objArr11115 = new Object[1];
                a(i60111, ((i60112 | 11) << 1) - (i60112 ^ 11), (char) ((-2) - (~(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))), objArr11115);
                String str514 = (String) objArr11115[0];
                int jumpTapTimeout3 = 587 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                int i60113 = -(-Color.blue(0));
                int i60114 = (i60113 ^ 6) + ((i60113 & 6) << 1);
                int i60115 = -TextUtils.getCapsMode(str14, 0, 0);
                Object[] objArr11116 = new Object[1];
                a(jumpTapTimeout3, i60114, (char) (((i60115 | 37337) << 1) - (i60115 ^ 37337)), objArr11116);
                String[] strArr214 = {str514, (String) objArr11116[0]};
                int iIndexOf111 = 2057 - TextUtils.indexOf((CharSequence) str14, '0');
                int i60116 = -Gravity.getAbsoluteGravity(0, 0);
                Object[] objArr11117 = new Object[1];
                a(iIndexOf111, (i60116 ^ 28) + ((i60116 & 28) << 1), (char) (34785 - (~View.combineMeasuredStates(0, 0))), objArr11117);
                String str515 = (String) objArr11117[0];
                int i60117 = -(-ExpandableListView.getPackedPositionType(0L));
                int i60118 = ((i60117 | 2037) << 1) - (i60117 ^ 2037);
                int i60119 = -(-KeyEvent.normalizeMetaState(0));
                int i61110 = (i60119 & 10) + (i60119 | 10);
                int i61111 = -((byte) KeyEvent.getModifierMetaStateMask());
                Object[] objArr11118 = new Object[1];
                a(i60118, i61110, (char) ((i61111 ^ 50805) + ((i61111 & 50805) << 1)), objArr11118);
                c2 = 0;
                strArr7 = new String[][]{strArr112, strArr113, strArr213, strArr214, new String[]{str515, (String) objArr11118[0]}};
                i88 = 0;
                i89 = -1;
                loop7: while (true) {
                    if (i88 < 5) {
                        str15 = str14;
                        i90 = i;
                        break;
                    }
                    String[] strArr215 = strArr7[i88];
                    str13 = strArr215[c2];
                    strArr8 = (String[]) Arrays.copyOfRange(strArr215, 1, strArr215.length);
                    length5 = strArr8.length;
                    i96 = 0;
                    while (i96 < length5) {
                        int i61112 = (i89 & 53) + (i89 | 53);
                        i89 = ((i61112 | (-52)) << 1) - (i61112 ^ (-52));
                        Object[] objArr11119 = {str13, strArr8[i96]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                            char keyRepeatDelay6 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                            int i61113 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2386;
                            int i61114 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 31;
                            byte b311 = (byte) (-1);
                            Object[] objArr1216 = new Object[1];
                            c(b311, (byte) (b311 + 1), $$a[2], objArr1216);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(keyRepeatDelay6, i61113, i61114, -1207062455, false, (String) objArr1216[0], new Class[]{String.class, String.class});
                        }
                        long jLongValue115 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr11119)).longValue();
                        long j819 = 1505969514;
                        i97 = i88;
                        long j8110 = 184;
                        long j8111 = j819 ^ j19;
                        str15 = str14;
                        i98 = i96;
                        long j8112 = (((long) (-183)) * j819) + (((long) 185) * jLongValue115) + ((((j8111 | jLongValue115) ^ j19) | ((j2 | jLongValue115) ^ j19)) * j8110) + (((long) (-184)) * (j | (((jLongValue115 ^ j19) | j819) ^ j19))) + (j8110 * ((j8111 | j2) ^ j19)) + ((long) 471073814);
                        i99 = ((int) (j8112 >> 32)) & ((-802173004) + (((-9810593) | i200) * (-369)) + (((~(546681504 | i200)) | 1983907915) * (-369)) + (((~((-546681505) | i)) | 536870912 | (~(1993718507 | i200))) * 369));
                        int i61115 = (~((int) SystemClock.uptimeMillis())) | (-953170359);
                        i100 = ((int) j8112) & (1414504652 + (i61115 * 495) + (((~i61115) | (-1020935160)) * 495));
                        if (((i100 & i99) | (i99 ^ i100)) != 0) {
                            int i61116 = (i89 & 170) + (i89 | 170);
                            i90 = (i61116 & i200) | ((~i61116) & i);
                            break loop7;
                        }
                        i96 = (((i98 | 90) << 1) - (i98 ^ 90)) - 89;
                        strArr7 = strArr7;
                        length5 = length5;
                        strArr8 = strArr8;
                        str13 = str13;
                        i88 = i97;
                        str14 = str15;
                    }
                    int i61117 = i88;
                    i88 = (i61117 & 1) + (i61117 | 1);
                    strArr7 = strArr7;
                    str14 = str14;
                    c2 = 0;
                }
                int i61118 = (~(i & i74)) & (i | i74);
                int i61119 = -i61118;
                int i62110 = ((i61118 & i61119) | (i61118 ^ i61119)) >> 31;
                int i62111 = i90 & (~i62110);
                int i62112 = i74 & i62110;
                int i62113 = (i62112 & i62111) | (i62111 ^ i62112);
                int i62114 = 2085 - (~(-View.MeasureSpec.makeMeasureSpec(0, 0)));
                int scrollBarFadeDuration3 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 13;
                int i62115 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                Object[] objArr1217 = new Object[1];
                a(i62114, scrollBarFadeDuration3, (char) (((i62115 | 1) << 1) - (i62115 ^ 1)), objArr1217);
                String str516 = (String) objArr1217[0];
                int i62116 = -View.resolveSize(0, 0);
                int i62117 = ((i62116 | 2099) << 1) - (i62116 ^ 2099);
                int i62118 = -(Process.myTid() >> 22);
                Object[] objArr1218 = new Object[1];
                a(i62117, (i62118 & 8) + (i62118 | 8), (char) TextUtils.getTrimmedLength(str15), objArr1218);
                Object[] objArr1219 = {str516, (String) objArr1218[0]};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                    str16 = str15;
                    char cIndexOf5 = (char) ((-1) - TextUtils.indexOf((CharSequence) str16, '0'));
                    int iMyPid5 = (Process.myPid() >> 22) + 2385;
                    int iLastIndexOf16 = TextUtils.lastIndexOf(str16, '0', 0) + 33;
                    byte b312 = (byte) (-1);
                    Object[] objArr12110 = new Object[1];
                    c(b312, (byte) (b312 + 1), $$a[2], objArr12110);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cIndexOf5, iMyPid5, iLastIndexOf16, -1207062455, false, (String) objArr12110[0], new Class[]{String.class, String.class});
                } else {
                    str16 = str15;
                }
                long jLongValue116 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr1219)).longValue();
                long j8113 = 720416162;
                long j8114 = (((long) (-519)) * j8113) + (j18 * jLongValue116);
                long j8115 = 520;
                long j8116 = j8113 ^ j19;
                long j8117 = jLongValue116 ^ j19;
                str13 = str16;
                long elapsedCpuTime6 = (int) Process.getElapsedCpuTime();
                long j9110 = elapsedCpuTime6 ^ j19;
                long j9111 = j8114 + (((((j8116 | j8117) | j9110) ^ j19) | ((jLongValue116 | elapsedCpuTime6) ^ j19)) * j8115);
                long j9112 = (elapsedCpuTime6 | j8113) ^ j19;
                long j9113 = j9111 + (((long) (-1040)) * (((j8117 | j9110) ^ j19) | j9112)) + (j8115 * (((j8116 | j9110) ^ j19) | ((j8117 | j8113) ^ j19) | j9112)) + ((long) 1256627166);
                int i62119 = (int) (j9113 >> 32);
                int elapsedCpuTime7 = (int) Process.getElapsedCpuTime();
                i94 = i62119 & ((-1599174398) + (((~(2028791971 | elapsedCpuTime7)) | (-2079259388)) * (-140)) + ((~((-50467417) | elapsedCpuTime7)) * 70) + (((~(elapsedCpuTime7 | (-591565561))) | (-1538161244)) * 70));
                int i63110 = ~(((int) SystemClock.uptimeMillis()) | (-1940593011));
                i95 = ((int) j9113) & (((((-1839979195) | i63110) * (-658)) - 2103820497) + ((i63110 | 301990208) * 658));
                if (((i94 & i95) | (i94 ^ i95)) != 0) {
                    i91 = ~(i & 150);
                    i92 = i | 150;
                    i93 = i91 & i92;
                } else {
                    i93 = i;
                }
                int i63111 = i ^ i62113;
                int i63112 = (i63111 | (-i63111)) >> 31;
                int i63113 = i93 & (~i63112);
                int i63114 = i62113 & i63112;
                int i63115 = (i63114 & i63113) | (i63113 ^ i63114);
                int i63116 = -Color.red(0);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault14 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                int i63117 = i63116 * (-432);
                int i63118 = ((i63117 | 914438) << 1) - (i63117 ^ 914438);
                int i63119 = ~i63116;
                int i64110 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault14;
                int i64111 = (i64110 & i63119) | (i63119 ^ i64110);
                int i64112 = -(-((~((i64111 & 2107) | (i64111 ^ 2107))) * 433));
                int i64113 = ((i63118 | i64112) << 1) - (i64112 ^ i63118);
                int i64114 = ~((-2108) | iTuitionPaymentFragmentspecialinlinedviewModeldefault14);
                int i64115 = ((i63119 & i64114) | (i63119 ^ i64114)) * (-433);
                int i64116 = (i64113 & i64115) + (i64115 | i64113);
                int i64117 = ~i63116;
                int i64118 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault14 & i64117) | (i64117 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault14));
                int i64119 = ~(i63116 | 2107);
                Object[] objArr1220 = new Object[1];
                a(i64116 + (((i64119 & i64118) | (i64118 ^ i64119)) * 433), 47 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ExpandableListView.getPackedPositionType(0L), objArr1220);
                Object[] objArr1221 = {(String) objArr1220[0]};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                    char offsetBefore4 = (char) TextUtils.getOffsetBefore(str13, 0);
                    int defaultSize6 = View.getDefaultSize(0, 0) + 993;
                    int maxKeyCode4 = 8 - (KeyEvent.getMaxKeyCode() >> 16);
                    byte b313 = (byte) (-1);
                    byte b314 = (byte) (b313 + 1);
                    Object[] objArr12111 = new Object[1];
                    c(b313, b314, b314, objArr12111);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(offsetBefore4, defaultSize6, maxKeyCode4, -545305915, false, (String) objArr12111[0], new Class[]{String.class});
                }
                long jLongValue117 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr1221)).longValue();
                long j9114 = 580643516;
                long j9115 = 829;
                long j9116 = (j9115 * j9114) + (j9115 * jLongValue117);
                long j9117 = -828;
                long j9118 = j9116 + (((((j9114 ^ j19) | (jLongValue117 ^ j19)) ^ j19) | (((j2 | j9114) | jLongValue117) ^ j19)) * j9117);
                long j9119 = jLongValue117 | j9114;
                long j102 = j9118 + (j9117 * (j9119 | j2)) + (((long) 828) * (j9119 ^ j19)) + ((long) 39815768);
                int iMyUid5 = Process.myUid();
                int i65110 = (-818885110) + (((~((-1764619800) | iMyUid5)) | 1747736083 | (~(327393388 | iMyUid5))) * (-880));
                int i65111 = (~((-1764619800) | (~iMyUid5))) | (-327393389);
                int i65112 = ~(iMyUid5 | 1764619799);
                int i65113 = ((int) (j102 >> 32)) & (i65110 + ((i65111 | i65112) * (-880)) + (i65112 * 880));
                int iMyUid6 = Process.myUid();
                int i65114 = ((int) j102) & (((1953427236 + (((~((-713034537) | iMyUid6)) | (~(2144706349 | iMyUid6))) * 69)) + (((~(iMyUid6 | 1808898857)) | ((~((-1048842029) | iMyUid6)) | 335807492)) * (-69))) - 1694773179);
                int i65115 = (((i65113 & i65114) | (i65113 ^ i65114)) * 263) ^ i;
                int i65116 = (~(i & i63115)) & (i | i63115);
                int i65117 = -i65116;
                int i65118 = ((i65116 & i65117) | (i65116 ^ i65117)) >> 31;
                int i65119 = i65115 & (~i65118);
                int i6610 = i63115 & i65118;
                i67 = (i6610 & i65119) | (i65119 ^ i6610);
                strArr4 = strArr6;
            } else {
                str10 = str9;
            }
            int i6611 = -(ViewConfiguration.getLongPressTimeout() >> 16);
            int i6612 = ((i6611 | 370) << 1) - (i6611 ^ 370);
            int iMyTid11 = (Process.myTid() >> 22) + 23;
            int i6613 = -Color.alpha(0);
            Object[] objArr1310 = new Object[1];
            a(i6612, iMyTid11, (char) ((i6613 & 27637) + (i6613 | 27637)), objArr1310);
            String str517 = (String) objArr1310[0];
            int i6614 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            Object[] objArr1311 = new Object[1];
            a((i6614 & 809) + (i6614 | 809), 10 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) ((-2) - ((-ExpandableListView.getPackedPositionChild(0L)) ^ (-1))), objArr1311);
            String str518 = (String) objArr1311[0];
            int iAlpha2 = Color.alpha(0);
            int i6615 = iAlpha2 * (-1939);
            int i6616 = (i6615 ^ 794278) + ((i6615 & 794278) << 1) + (((~(((-819) ^ iAlpha2) | ((-819) & iAlpha2))) | (~((i200 ^ 818) | (i200 & 818)))) * (-970));
            int i6617 = ~iAlpha2;
            int i6618 = (i6616 - (~((~((i6617 & 818) | (i6617 ^ 818))) * 1940))) - 1;
            int i6710 = ~iAlpha2;
            int i6711 = ~((i6710 & (-819)) | (i6710 ^ (-819)));
            int i6712 = ~((i200 ^ 818) | (i200 & 818));
            int i6713 = ((i6711 & i6712) | (i6711 ^ i6712)) * 970;
            int i6714 = (i6618 ^ i6713) + ((i6713 & i6618) << 1);
            String str519 = str10;
            int i6715 = -TextUtils.indexOf(str519, str519);
            Object[] objArr1312 = new Object[1];
            a(i6714, ((i6715 | 7) << 1) - (i6715 ^ 7), (char) KeyEvent.normalizeMetaState(0), objArr1312);
            String str520 = (String) objArr1312[0];
            int iMyTid12 = Process.myTid() >> 22;
            int i6716 = (iMyTid12 & 825) + (iMyTid12 | 825);
            int i6717 = 8 - (~(-(-ExpandableListView.getPackedPositionChild(0L))));
            int i6718 = -(-TextUtils.getCapsMode(str519, 0, 0));
            Object[] objArr1313 = new Object[1];
            a(i6716, i6717, (char) ((i6718 ^ 15942) + ((i6718 & 15942) << 1)), objArr1313);
            String[] strArr216 = {str517, str518, str520, (String) objArr1313[0]};
            int i6719 = -TextUtils.indexOf((CharSequence) str519, '0', 0, 0);
            int i6810 = (i6719 ^ 832) + ((i6719 & 832) << 1);
            int i6811 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            Object[] objArr1314 = new Object[1];
            a(i6810, (i6811 ^ 18) + ((i6811 & 18) << 1), (char) (ViewConfiguration.getEdgeSlop() >> 16), objArr1314);
            String str521 = (String) objArr1314[0];
            int mode5 = View.MeasureSpec.getMode(0);
            int i6812 = (mode5 & 850) + (mode5 | 850);
            int i6813 = 6 - (~(-(-View.combineMeasuredStates(0, 0))));
            int i6814 = -(-(ViewConfiguration.getMaximumFlingVelocity() >> 16));
            Object[] objArr1315 = new Object[1];
            a(i6812, i6813, (char) ((i6814 & 36510) + (i6814 | 36510)), objArr1315);
            String str610 = (String) objArr1315[0];
            int maxKeyCode5 = (KeyEvent.getMaxKeyCode() >> 16) + 857;
            int i6815 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
            int i6816 = ((i6815 | 8) << 1) - (i6815 ^ 8);
            int i6817 = -Process.getGidForName(str519);
            Object[] objArr1316 = new Object[1];
            a(maxKeyCode5, i6816, (char) (((i6817 | 55109) << 1) - (i6817 ^ 55109)), objArr1316);
            String str611 = (String) objArr1316[0];
            int i6818 = -Color.blue(0);
            Object[] objArr1317 = new Object[1];
            a((i6818 & 864) + (i6818 | 864), 9 - (~(-TextUtils.lastIndexOf(str519, '0', 0, 0))), (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 30326), objArr1317);
            String str612 = (String) objArr1317[0];
            int gidForName4 = Process.getGidForName(str519);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault15 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i6819 = gidForName4 * (-813);
            int i6910 = (i6819 & 357408) + (i6819 | 357408);
            int i6911 = ~(((-877) ^ gidForName4) | ((-877) & gidForName4));
            int i6912 = ~(gidForName4 | iTuitionPaymentFragmentspecialinlinedviewModeldefault15);
            int i6913 = ((i6911 ^ i6912) | (i6912 & i6911)) * (-814);
            int i6914 = (i6910 & i6913) + (i6910 | i6913);
            int i6915 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault15) | (-877));
            int i6916 = ~gidForName4;
            int i6917 = i6915 | (~((i6916 ^ 876) | (i6916 & 876)));
            int i6918 = ~((gidForName4 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault15) | (gidForName4 & iTuitionPaymentFragmentspecialinlinedviewModeldefault15));
            int i6919 = ((i6917 & i6918) | (i6917 ^ i6918)) * 407;
            int i7010 = (i6914 & i6919) + (i6919 | i6914);
            int i7011 = ~gidForName4;
            int i7012 = ~((i7011 ^ 876) | (i7011 & 876));
            int i7013 = ~((i7011 & iTuitionPaymentFragmentspecialinlinedviewModeldefault15) | (i7011 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault15));
            int i7014 = (i7013 & i7012) | (i7012 ^ i7013);
            int i7015 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault15 ^ 876) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault15 & 876));
            Object[] objArr1318 = new Object[1];
            a((i7010 - (~(-(-(((i7014 & i7015) | (i7014 ^ i7015)) * 407))))) - 1, 13 - (~(-(ViewConfiguration.getTouchSlop() >> 8))), (char) TextUtils.indexOf(str519, str519), objArr1318);
            String[] strArr217 = {str521, str610, str611, str612, (String) objArr1318[0]};
            int i7016 = -TextUtils.indexOf(str519, str519, 0, 0);
            int i7017 = (i7016 & 889) + (i7016 | 889);
            int i7018 = -KeyEvent.getDeadChar(0, 0);
            Object[] objArr1319 = new Object[1];
            a(i7017, (i7018 & 16) + (i7018 | 16), (char) ExpandableListView.getPackedPositionType(0L), objArr1319);
            String str613 = (String) objArr1319[0];
            int i7019 = -(-MotionEvent.axisFromString(str519));
            int i7110 = (i7019 ^ TypedValues.Custom.TYPE_REFERENCE) + ((i7019 & TypedValues.Custom.TYPE_REFERENCE) << 1);
            int iBlue3 = Color.blue(0);
            Object[] objArr1410 = new Object[1];
            a(i7110, (iBlue3 & 3) + (iBlue3 | 3), (char) (46347 - (~(-TextUtils.getOffsetAfter(str519, 0)))), objArr1410);
            String str614 = (String) objArr1410[0];
            int minimumFlingVelocity4 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 916;
            int i7111 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            Object[] objArr1411 = new Object[1];
            a(minimumFlingVelocity4, (i7111 ^ 23) + ((i7111 & 23) << 1), (char) View.resolveSize(0, 0), objArr1411);
            String str615 = (String) objArr1411[0];
            int i7112 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            int i7113 = (i7112 ^ 939) + ((i7112 & 939) << 1);
            int i7114 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 24;
            int tapTimeout7 = ViewConfiguration.getTapTimeout() >> 16;
            Object[] objArr1412 = new Object[1];
            a(i7113, i7114, (char) (((tapTimeout7 | 64621) << 1) - (tapTimeout7 ^ 64621)), objArr1412);
            String str616 = (String) objArr1412[0];
            Object[] objArr1413 = new Object[1];
            a(1010 - (~(-AndroidCharacter.getMirror('0'))), TextUtils.indexOf((CharSequence) str519, '0', 0, 0) + 29, (char) (ImageFormat.getBitsPerPixel(0) + 1), objArr1413);
            String[] strArr218 = {str613, str614, str, str615, str616, (String) objArr1413[0]};
            int i7115 = -(-View.MeasureSpec.makeMeasureSpec(0, 0));
            int i7116 = (i7115 & 991) + (i7115 | 991);
            int minimumFlingVelocity5 = ViewConfiguration.getMinimumFlingVelocity() >> 16;
            int i7117 = ((minimumFlingVelocity5 | 11) << 1) - (minimumFlingVelocity5 ^ 11);
            int i7118 = -View.getDefaultSize(0, 0);
            Object[] objArr1414 = new Object[1];
            a(i7116, i7117, (char) (((i7118 | 4847) << 1) - (i7118 ^ 4847)), objArr1414);
            String str617 = (String) objArr1414[0];
            Object[] objArr1415 = new Object[1];
            a(1001 - (~(-(-View.MeasureSpec.makeMeasureSpec(0, 0)))), View.MeasureSpec.getSize(0) + 8, (char) (55172 - (~(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))))), objArr1415);
            String str618 = (String) objArr1415[0];
            int scrollBarSize3 = 1010 - (ViewConfiguration.getScrollBarSize() >> 8);
            int i7119 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            Object[] objArr1416 = new Object[1];
            a(scrollBarSize3, (i7119 ^ 6) + ((i7119 & 6) << 1), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 21361), objArr1416);
            String str619 = (String) objArr1416[0];
            int keyRepeatTimeout5 = 1016 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int i7210 = -(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
            Object[] objArr1417 = new Object[1];
            a(keyRepeatTimeout5, (i7210 ^ 5) + ((i7210 & 5) << 1), (char) (64317 - TextUtils.getOffsetBefore(str519, 0)), objArr1417);
            String[] strArr219 = {str617, str618, str619, (String) objArr1417[0]};
            int i7211 = -TextUtils.lastIndexOf(str519, '0', 0);
            int i7212 = (i7211 ^ PointerIconCompat.TYPE_GRABBING) + ((i7211 & PointerIconCompat.TYPE_GRABBING) << 1);
            int iGreen4 = Color.green(0);
            Object[] objArr1418 = new Object[1];
            a(i7212, ((iGreen4 | 16) << 1) - (iGreen4 ^ 16), (char) (ViewConfiguration.getPressedStateDuration() >> 16), objArr1418);
            String str710 = (String) objArr1418[0];
            int defaultSize7 = 857 - View.getDefaultSize(0, 0);
            int i7213 = -(-TextUtils.indexOf((CharSequence) str519, '0', 0, 0));
            int i7214 = (i7213 & 8) + (i7213 | 8);
            int i7215 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            Object[] objArr1419 = new Object[1];
            a(defaultSize7, i7214, (char) ((i7215 & 55111) + (i7215 | 55111)), objArr1419);
            String str711 = (String) objArr1419[0];
            Object[] objArr1510 = new Object[1];
            a(825 - TextUtils.indexOf(str519, str519, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 7, (char) (15941 - (~(-View.MeasureSpec.getSize(0)))), objArr1510);
            String[] strArr220 = {str710, str711, (String) objArr1510[0]};
            int i7216 = -TextUtils.lastIndexOf(str519, '0', 0, 0);
            Object[] objArr1511 = new Object[1];
            a(((i7216 | 1037) << 1) - (i7216 ^ 1037), 13 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (64419 - (~(-(-TextUtils.getOffsetBefore(str519, 0))))), objArr1511);
            String str712 = (String) objArr1511[0];
            int i7217 = -ExpandableListView.getPackedPositionGroup(0L);
            Object[] objArr1512 = new Object[1];
            a((i7217 ^ 1052) + ((i7217 & 1052) << 1), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (Process.myPid() >> 22), objArr1512);
            String[] strArr221 = {str712, (String) objArr1512[0]};
            int scrollBarSize4 = ViewConfiguration.getScrollBarSize() >> 8;
            int i7218 = ((scrollBarSize4 | 1053) << 1) - (scrollBarSize4 ^ 1053);
            int i7219 = -Color.argb(0, 0, 0, 0);
            Object[] objArr1513 = new Object[1];
            a(i7218, ((i7219 | 9) << 1) - (i7219 ^ 9), (char) (45839 - (~(-(-TextUtils.indexOf(str519, str519, 0, 0))))), objArr1513);
            String str713 = (String) objArr1513[0];
            int i7310 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault16 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i7311 = i7310 * (-183);
            int i7312 = ((i7311 | 196655) << 1) - (i7311 ^ 196655);
            int i7313 = -(-(((~i7310) | 1063) * (-368)));
            int i7314 = (i7312 ^ i7313) + ((i7313 & i7312) << 1);
            int i7315 = (i7310 ^ (-1064)) | (i7310 & (-1064));
            int i7316 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault16;
            int i7317 = i7314 + (((i7315 & i7316) | (i7315 ^ i7316)) * 184);
            int i7318 = ~((~i7310) | (-1064));
            int i7319 = ~((i7316 & i7310) | (i7316 ^ i7310));
            int i7410 = (i7319 & i7318) | (i7318 ^ i7319);
            int i7411 = ~((i7310 & 1063) | (i7310 ^ 1063));
            int i7412 = ((i7411 & i7410) | (i7410 ^ i7411)) * 184;
            Object[] objArr1514 = new Object[1];
            a((i7317 ^ i7412) + ((i7412 & i7317) << 1), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1, (char) KeyEvent.normalizeMetaState(0), objArr1514);
            String[] strArr222 = {str713, (String) objArr1514[0]};
            int iIndexOf112 = TextUtils.indexOf((CharSequence) str519, '0', 0);
            int i7413 = ((iIndexOf112 | 1064) << 1) - (iIndexOf112 ^ 1064);
            int i7414 = -(-View.getDefaultSize(0, 0));
            Object[] objArr1515 = new Object[1];
            a(i7413, ((i7414 | 16) << 1) - (i7414 ^ 16), (char) (50083 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr1515);
            String str714 = (String) objArr1515[0];
            int i7415 = -(-((Process.getThreadPriority(0) + 20) >> 6));
            int i7416 = (i7415 ^ TypedValues.Custom.TYPE_DIMENSION) + ((i7415 & TypedValues.Custom.TYPE_DIMENSION) << 1);
            int i7417 = -(ViewConfiguration.getLongPressTimeout() >> 16);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault17 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i7418 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault17;
            int i7419 = (((((i7417 * 980) - 2934) - (~((~((i7418 & (-4)) | ((-4) ^ i7418))) * 979))) - 1) - (~(-(-(((i7417 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault17) | (i7417 & iTuitionPaymentFragmentspecialinlinedviewModeldefault17)) * (-979)))))) - 1;
            int i7510 = ~((-4) | iTuitionPaymentFragmentspecialinlinedviewModeldefault17);
            int i7511 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault17;
            int i7512 = ~((i7417 & i7511) | (i7511 ^ i7417));
            int i7513 = (i7419 - (~(((i7512 & i7510) | (i7510 ^ i7512)) * 979))) - 1;
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            Object[] objArr1516 = new Object[1];
            a(i7416, i7513, (char) (((iMakeMeasureSpec2 | 46348) << 1) - (iMakeMeasureSpec2 ^ 46348)), objArr1516);
            String str715 = (String) objArr1516[0];
            int i7514 = 850 - (~(-(-TextUtils.indexOf((CharSequence) str519, '0', 0))));
            int i7515 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            int i7516 = (i7515 ^ 8) + ((i7515 & 8) << 1);
            int i7517 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
            Object[] objArr1517 = new Object[1];
            a(i7514, i7516, (char) ((i7517 ^ 36510) + ((i7517 & 36510) << 1)), objArr1517);
            String str716 = (String) objArr1517[0];
            int i7518 = -(-(ViewConfiguration.getKeyRepeatTimeout() >> 16));
            Object[] objArr1518 = new Object[1];
            a((i7518 ^ 1079) + ((i7518 & 1079) << 1), (ViewConfiguration.getTouchSlop() >> 8) + 8, (char) (1859 - View.combineMeasuredStates(0, 0)), objArr1518);
            String str717 = (String) objArr1518[0];
            int iMyPid6 = Process.myPid() >> 22;
            int i7519 = (iMyPid6 & 864) + (iMyPid6 | 864);
            int i7610 = -(-KeyEvent.getDeadChar(0, 0));
            int i7611 = (i7610 & 11) + (i7610 | 11);
            int i7612 = -(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            Object[] objArr1519 = new Object[1];
            a(i7519, i7611, (char) ((i7612 & 30327) + (i7612 | 30327)), objArr1519);
            String str718 = (String) objArr1519[0];
            int i7613 = 875 - (~(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))));
            int iAxisFromString4 = MotionEvent.axisFromString(str519);
            Object[] objArr1610 = new Object[1];
            a(i7613, (iAxisFromString4 ^ 15) + ((iAxisFromString4 & 15) << 1), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr1610);
            String[] strArr310 = {str714, str715, str716, str717, str718, (String) objArr1610[0]};
            int i7614 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            int i7615 = (i7614 & 1088) + (i7614 | 1088);
            int i7616 = -(-View.getDefaultSize(0, 0));
            Object[] objArr1611 = new Object[1];
            a(i7615, ((i7616 | 20) << 1) - (i7616 ^ 20), (char) (21641 - (~(-(-TextUtils.indexOf((CharSequence) str519, '0'))))), objArr1611);
            String str719 = (String) objArr1611[0];
            int i7617 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int i7618 = (i7617 ^ 1107) + ((i7617 & 1107) << 1);
            int i7619 = 18 - (~(-(ViewConfiguration.getScrollBarFadeDuration() >> 16)));
            int i7710 = -TextUtils.indexOf(str519, str519);
            Object[] objArr1612 = new Object[1];
            a(i7618, i7619, (char) ((i7710 & 55972) + (i7710 | 55972)), objArr1612);
            String str89 = (String) objArr1612[0];
            int i7711 = 1124 - (~(-ExpandableListView.getPackedPositionChild(0L)));
            int i7712 = -(Process.myPid() >> 22);
            Object[] objArr1613 = new Object[1];
            a(i7711, (i7712 & 31) + (i7712 | 31), (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), objArr1613);
            String str810 = (String) objArr1613[0];
            int defaultSize8 = View.getDefaultSize(0, 0);
            int i7713 = (defaultSize8 ^ 1157) + ((defaultSize8 & 1157) << 1);
            int iIndexOf113 = TextUtils.indexOf(str519, str519, 0) + 26;
            int i7714 = -(-View.MeasureSpec.makeMeasureSpec(0, 0));
            Object[] objArr1614 = new Object[1];
            a(i7713, iIndexOf113, (char) (((i7714 | 53100) << 1) - (i7714 ^ 53100)), objArr1614);
            String str811 = (String) objArr1614[0];
            int i7715 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int i7716 = (i7715 & 1183) + (i7715 | 1183);
            int threadPriority10 = Process.getThreadPriority(0);
            int i7717 = -((((threadPriority10 | 20) << 1) - (threadPriority10 ^ 20)) >> 6);
            Object[] objArr1615 = new Object[1];
            a(i7716, ((i7717 | 23) << 1) - (i7717 ^ 23), (char) (View.resolveSizeAndState(0, 0, 0) + 43004), objArr1615);
            String str812 = (String) objArr1615[0];
            int i7718 = -(Process.myPid() >> 22);
            int i7719 = ((i7718 | 1206) << 1) - (i7718 ^ 1206);
            int i7810 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            Object[] objArr1616 = new Object[1];
            a(i7719, (i7810 & 34) + (i7810 | 34), (char) (TextUtils.indexOf(str519, str519) + 56680), objArr1616);
            String str813 = (String) objArr1616[0];
            str11 = str519;
            String[] strArr311 = {str719, str89, str810, str811, str812, str813, str};
            int i7811 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            int i7812 = i7811 * 595;
            int i7813 = (i7812 ^ (-1471880)) + ((i7812 & (-1471880)) << 1);
            int i7814 = ~i7811;
            int i7815 = ~(i7814 | 1240);
            int i7816 = ~((i200 ^ 1240) | (i200 & 1240));
            int i7817 = ((i7815 & i7816) | (i7815 ^ i7816)) * (-1188);
            int i7818 = ((i7813 | i7817) << 1) - (i7817 ^ i7813);
            int i7819 = ~((i7814 & 1240) | (i7814 ^ 1240));
            int i7910 = ~(((-1241) ^ i) | ((-1241) & i));
            int i7911 = (i7819 & i7910) | (i7819 ^ i7910);
            int i7912 = ~((i200 ^ i7811) | (i200 & i7811));
            int i7913 = (i7818 - (~(((i7911 & i7912) | (i7911 ^ i7912)) * 594))) - 1;
            int i7914 = ~((-1241) | i200);
            int i7915 = ~(((-1241) & i7811) | ((-1241) ^ i7811));
            int i7916 = (i7914 & i7915) | (i7914 ^ i7915);
            int i7917 = ~((i7811 & i200) | (i200 ^ i7811));
            int i7918 = ((i7917 & i7916) | (i7916 ^ i7917)) * 594;
            int i7919 = ((i7913 | i7918) << 1) - (i7918 ^ i7913);
            int iLastIndexOf17 = TextUtils.lastIndexOf(str11, '0', 0);
            int i8010 = (iLastIndexOf17 & 14) + (iLastIndexOf17 | 14);
            int i8011 = -ExpandableListView.getPackedPositionChild(0L);
            Object[] objArr1617 = new Object[1];
            a(i7919, i8010, (char) (((i8011 | 43762) << 1) - (i8011 ^ 43762)), objArr1617);
            String str814 = (String) objArr1617[0];
            int iNormalizeMetaState5 = 818 - KeyEvent.normalizeMetaState(0);
            int iResolveOpacity9 = Drawable.resolveOpacity(0, 0);
            Object[] objArr1618 = new Object[1];
            a(iNormalizeMetaState5, ((iResolveOpacity9 | 7) << 1) - (iResolveOpacity9 ^ 7), (char) ((-Process.getGidForName(str11)) - 1), objArr1618);
            String[] strArr312 = {str814, (String) objArr1618[0]};
            int deadChar7 = KeyEvent.getDeadChar(0, 0);
            int i8012 = ((deadChar7 | 1252) << 1) - (deadChar7 ^ 1252);
            int i8013 = -TextUtils.getOffsetAfter(str11, 0);
            Object[] objArr1619 = new Object[1];
            a(i8012, ((i8013 | 30) << 1) - (i8013 ^ 30), (char) (8551 - (~(-ExpandableListView.getPackedPositionGroup(0L)))), objArr1619);
            String str815 = (String) objArr1619[0];
            Object[] objArr1710 = new Object[1];
            a(1283 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) str11, '0') + 12, (char) (ViewConfiguration.getScrollBarSize() >> 8), objArr1710);
            String[] strArr313 = {str815, (String) objArr1710[0]};
            Object[] objArr1711 = new Object[1];
            a(1293 - View.MeasureSpec.makeMeasureSpec(0, 0), 18 - (~(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr1711);
            String str816 = (String) objArr1711[0];
            int i8014 = -TextUtils.lastIndexOf(str11, '0', 0, 0);
            int i8015 = (i8014 & 1311) + (i8014 | 1311);
            int iArgb3 = 5 - Color.argb(0, 0, 0, 0);
            int i8016 = -((byte) KeyEvent.getModifierMetaStateMask());
            Object[] objArr1712 = new Object[1];
            a(i8015, iArgb3, (char) ((i8016 & 37152) + (i8016 | 37152)), objArr1712);
            String[] strArr314 = {str816, (String) objArr1712[0]};
            int i8017 = -AndroidCharacter.getMirror('0');
            Object[] objArr1713 = new Object[1];
            a(((i8017 | 1365) << 1) - (i8017 ^ 1365), 18 - (~(-(ViewConfiguration.getMinimumFlingVelocity() >> 16))), (char) (Color.rgb(0, 0, 0) + 16788442), objArr1713);
            String[] strArr315 = {(String) objArr1713[0]};
            int i8018 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
            int i8019 = ((i8018 | 1337) << 1) - (i8018 ^ 1337);
            int iKeyCodeFromString3 = KeyEvent.keyCodeFromString(str11);
            int i8110 = iKeyCodeFromString3 * 491;
            int i8111 = (i8110 & (-7824)) + (i8110 | (-7824));
            int i8112 = ~iKeyCodeFromString3;
            int i8113 = i8112 | (-17);
            int i8114 = -(-(((i8113 & i200) | (i8113 ^ i200)) * (-490)));
            int i8115 = ((i8111 | i8114) << 1) - (i8111 ^ i8114);
            int i8116 = ~(iKeyCodeFromString3 | (-17));
            int i8117 = ~((-17) | i);
            int i8118 = i8115 + (((i8116 & i8117) | (i8116 ^ i8117)) * 490);
            int i8119 = i8112 * 490;
            int i8210 = (i8118 & i8119) + (i8119 | i8118);
            int pressedStateDuration2 = ViewConfiguration.getPressedStateDuration() >> 16;
            Object[] objArr1714 = new Object[1];
            a(i8019, i8210, (char) ((pressedStateDuration2 ^ 44008) + ((pressedStateDuration2 & 44008) << 1)), objArr1714);
            String[] strArr316 = {(String) objArr1714[0]};
            int i8211 = -(-Gravity.getAbsoluteGravity(0, 0));
            int i8212 = ((i8211 | 1352) << 1) - (i8211 ^ 1352);
            int i8213 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
            int i8214 = ((i8213 | 19) << 1) - (i8213 ^ 19);
            int i8215 = -ExpandableListView.getPackedPositionChild(0L);
            Object[] objArr1715 = new Object[1];
            a(i8212, i8214, (char) ((i8215 ^ (-1)) + (i8215 << 1)), objArr1715);
            String[] strArr317 = {(String) objArr1715[0]};
            int i8216 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
            int i8217 = ((i8216 | 1371) << 1) - (i8216 ^ 1371);
            int i8218 = -View.getDefaultSize(0, 0);
            int i8219 = ((i8218 | 19) << 1) - (i8218 ^ 19);
            int i8310 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            Object[] objArr1716 = new Object[1];
            a(i8217, i8219, (char) (((i8310 | 58950) << 1) - (i8310 ^ 58950)), objArr1716);
            String[] strArr318 = {(String) objArr1716[0]};
            int i8311 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
            int i8312 = (i8311 ^ 1390) + ((i8311 & 1390) << 1);
            int i8313 = 22 - (~(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))));
            int i8314 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            char c19 = (char) (((i8314 | 14268) << 1) - (i8314 ^ 14268));
            Object[] objArr1717 = new Object[1];
            a(i8312, i8313, c19, objArr1717);
            String[] strArr319 = {(String) objArr1717[0]};
            int mode6 = View.MeasureSpec.getMode(0);
            int i8315 = mode6 * 303;
            int i8316 = (i8315 & (-425313)) + (i8315 | (-425313));
            int i8317 = ~mode6;
            int i8318 = i8317 | i200;
            int i8319 = (i8317 & 1413) | (i8317 ^ 1413);
            int i8410 = ((i8316 + (((~((i8318 & 1413) | (i8318 ^ 1413))) | (~((mode6 | 1413) | i))) * (-302))) - (~((~((i8319 & i) | (i8319 ^ i))) * (-604)))) - 1;
            int i8411 = ~((mode6 & (-1414)) | ((-1414) ^ mode6));
            int i8412 = ~((i ^ 1413) | (i & 1413));
            int i8413 = (i8410 - (~(-(-(((i8411 & i8412) | (i8411 ^ i8412)) * 302))))) - 1;
            int i8414 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            Object[] objArr1718 = new Object[1];
            a(i8413, ((i8414 | 22) << 1) - (i8414 ^ 22), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr1718);
            String[] strArr49 = {(String) objArr1718[0]};
            int iIndexOf114 = TextUtils.indexOf(str11, str11, 0, 0);
            int i8415 = (iIndexOf114 ^ 1434) + ((iIndexOf114 & 1434) << 1);
            int i8416 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            Object[] objArr1719 = new Object[1];
            a(i8415, ((i8416 | 25) << 1) - (i8416 ^ 25), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr1719);
            String str817 = str;
            String[] strArr410 = {(String) objArr1719[0], str817};
            int i8417 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            int i8418 = (i8417 ^ 1459) + ((i8417 & 1459) << 1);
            int i8419 = -TextUtils.indexOf((CharSequence) str11, '0');
            int i8510 = ((i8419 | 27) << 1) - (i8419 ^ 27);
            int i8511 = -ExpandableListView.getPackedPositionType(0L);
            Object[] objArr1810 = new Object[1];
            a(i8418, i8510, (char) ((i8511 & 37655) + (i8511 | 37655)), objArr1810);
            String[] strArr411 = {(String) objArr1810[0], str817};
            int i8512 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
            int i8513 = ((i8512 | 1486) << 1) - (i8512 ^ 1486);
            int i8514 = -View.MeasureSpec.makeMeasureSpec(0, 0);
            Object[] objArr1811 = new Object[1];
            a(i8513, ((i8514 | 27) << 1) - (i8514 ^ 27), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr1811);
            String[] strArr412 = {(String) objArr1811[0], str817};
            int i8515 = 1512 - (~(-(ViewConfiguration.getDoubleTapTimeout() >> 16)));
            int i8516 = -((Process.getThreadPriority(0) + 20) >> 6);
            Object[] objArr1812 = new Object[1];
            a(i8515, (i8516 ^ 31) + ((i8516 & 31) << 1), (char) ((-2) - ((-(-(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))) ^ (-1))), objArr1812);
            String[] strArr413 = {(String) objArr1812[0], str817};
            int i8517 = 1543 - (~(ViewConfiguration.getTouchSlop() >> 8));
            int i8518 = 26 - (~(ViewConfiguration.getMinimumFlingVelocity() >> 16));
            int i8519 = -KeyEvent.normalizeMetaState(0);
            Object[] objArr1813 = new Object[1];
            a(i8517, i8518, (char) (((i8519 | 35931) << 1) - (i8519 ^ 35931)), objArr1813);
            String[] strArr414 = {(String) objArr1813[0], str817};
            int i8610 = 1571 - (~TextUtils.lastIndexOf(str11, '0', 0, 0));
            int windowTouchSlop2 = 32 - (ViewConfiguration.getWindowTouchSlop() >> 8);
            int keyRepeatDelay7 = ViewConfiguration.getKeyRepeatDelay() >> 16;
            Object[] objArr1814 = new Object[1];
            a(i8610, windowTouchSlop2, (char) ((keyRepeatDelay7 ^ 8205) + ((keyRepeatDelay7 & 8205) << 1)), objArr1814);
            strArr5 = new String[][]{strArr216, strArr217, strArr218, strArr219, strArr220, strArr221, strArr222, strArr310, strArr311, strArr312, strArr313, strArr314, strArr315, strArr316, strArr317, strArr318, strArr319, strArr49, strArr410, strArr411, strArr412, strArr413, strArr414, new String[]{(String) objArr1814[0], str817}};
            int i8611 = -(ViewConfiguration.getTapTimeout() >> 16);
            i75 = 0;
            Object[] objArr1815 = new Object[1];
            a(((i8611 | 1603) << 1) - (i8611 ^ 1603), 0 - (~(-(ViewConfiguration.getJumpTapTimeout() >> 16))), (char) (TextUtils.getTrimmedLength(str11) + 41173), objArr1815);
            sb = new StringBuilder((String) objArr1815[0]);
            i76 = i;
            i77 = 0;
            i78 = 0;
            while (i77 < i79) {
                String[] strArr415 = strArr5[i77];
                Object[] objArr1816 = {strArr415[i75]};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                    char cLastIndexOf5 = (char) (TextUtils.lastIndexOf(str11, '0') + 33603);
                    int i8612 = 3086 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    int bitsPerPixel6 = 25 - ImageFormat.getBitsPerPixel(0);
                    byte b315 = (byte) (-1);
                    Object[] objArr1817 = new Object[1];
                    c(b315, (byte) (b315 + 1), $$a[2], objArr1817);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cLastIndexOf5, i8612, bitsPerPixel6, 1411172903, false, (String) objArr1817[0], new Class[]{String.class});
                }
                str12 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr1816);
                boolean z5 = true;
                String[] strArr416 = (String[]) Arrays.copyOfRange(strArr415, 1, strArr415.length);
                if (str12 == null) {
                    i76 = i76;
                } else {
                    i76 = i76;
                }
                int i8810 = (i77 & (-71)) + (i77 | (-71));
                i77 = ((i8810 | 72) << 1) - (i8810 ^ 72);
                i74 = i74;
                strArr5 = strArr5;
                i75 = 0;
            }
            int i8811 = i74;
            i80 = i76;
            int iLastIndexOf18 = 1606 - TextUtils.lastIndexOf(str11, '0', i75, i75);
            int i8812 = -(ViewConfiguration.getPressedStateDuration() >> 16);
            Object[] objArr192 = new Object[1];
            a(iLastIndexOf18, (i8812 ^ 1) + ((i8812 & 1) << 1), (char) (9737 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr192);
            sb.append((String) objArr192[0]);
            objArr2 = new Object[2];
            if (i78 > 2) {
                objArr2[0] = new int[1];
                String[] strArr417 = {sb.toString()};
                ((int[]) objArr2[0])[0] = i80;
                objArr2[1] = strArr417;
            } else {
                objArr2[0] = new int[]{i};
                objArr2[1] = new String[0];
            }
            int i8813 = ((int[]) objArr2[0])[0];
            int i8814 = (~(i & i8811)) & (i | i8811);
            int i8815 = -i8814;
            int i8816 = ((i8814 & i8815) | (i8814 ^ i8815)) >> 31;
            int i898 = i8813 & (~i8816);
            int i899 = i8811 & i8816;
            i74 = (i898 & i899) | (i898 ^ i899);
            strArr6 = (String[]) objArr2[1];
            f2 = 0.0f;
            i81 = 0;
            int i44115 = -(TypedValue.complexToFraction(i81, f2, f2) > f2 ? 1 : (TypedValue.complexToFraction(i81, f2, f2) == f2 ? 0 : -1));
            int i44116 = (i44115 & 889) + (i44115 | 889);
            int deadChar8 = KeyEvent.getDeadChar(i81, i81);
            Object[] objArr7111 = new Object[1];
            a(i44116, (deadChar8 ^ 16) + ((deadChar8 & 16) << 1), (char) View.resolveSize(i81, i81), objArr7111);
            Object[] objArr818 = {(String) objArr7111[i81]};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char keyRepeatTimeout6 = (char) (33602 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                int i44117 = 3086 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                int i44118 = 27 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                byte b2111 = (byte) (-1);
                Object[] objArr819 = new Object[1];
                c(b2111, (byte) (b2111 + 1), $$a[2], objArr819);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(keyRepeatTimeout6, i44117, i44118, 1411172903, false, (String) objArr819[0], new Class[]{String.class});
            }
            objInvoke2 = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr818);
            if (objInvoke2 == null) {
                i87 = 0;
            } else {
                Object[] objArr8110 = {objInvoke2, 42};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                    char c110 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int iLastIndexOf19 = 3392 - TextUtils.lastIndexOf(str11, '0', 0);
                    int iMyTid13 = 9 - (Process.myTid() >> 22);
                    byte b2112 = (byte) (-1);
                    Object[] objArr8111 = new Object[1];
                    c(b2112, (byte) (b2112 + 1), $$a[2], objArr8111);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c110, iLastIndexOf19, iMyTid13, 1203525406, false, (String) objArr8111[0], new Class[]{String.class, Integer.TYPE});
                }
                long jLongValue118 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr8110)).longValue();
                long j6115 = 554314274;
                long j6116 = -103;
                long j6117 = (j6116 * j6115) + (j6116 * jLongValue118);
                long j6118 = 104;
                long j6119 = jLongValue118 ^ j19;
                long j712 = j6117 + (((((j6115 ^ j19) | j6119) ^ j19) | ((j6119 | j) ^ j19)) * j6118) + (((long) (-104)) * (((j2 | j6115) | jLongValue118) ^ j19)) + (j6118 * (j6115 | j)) + ((long) (-556384151));
                int iFreeMemory4 = (int) Runtime.getRuntime().freeMemory();
                int i44119 = ~iFreeMemory4;
                int i4518 = (~((-2013913212) | i44119)) | 1476419627;
                int i4519 = ~(iFreeMemory4 | (-39193217));
                int i45110 = ((int) (j712 >> 32)) & ((((i4518 | i4519) * (-252)) - 167182338) + ((i4519 | (~(i44119 | (-537493585)))) * 252));
                int i45111 = ~Process.myPid();
                i87 = i45110 | (((int) j712) & (248622077 + (((-1212154114) | i45111) * 184) + (((~(i45111 | (-1307617550))) | (-1246299538)) * 184)));
            }
            if (i87 != 1986687685) {
                str13 = str11;
            } else {
                str13 = str11;
            }
            str14 = str13;
            int i5714 = -TextUtils.lastIndexOf(str14, '0', 0, 0);
            int i5715 = (i5714 & 1949) + (i5714 | 1949);
            int i581110 = -(-Color.red(0));
            Object[] objArr1014 = new Object[1];
            a(i5715, (i581110 & 13) + (i581110 | 13), (char) KeyEvent.getDeadChar(0, 0), objArr1014);
            String str416 = (String) objArr1014[0];
            int iResolveOpacity10 = Drawable.resolveOpacity(0, 0) + 1963;
            int i581111 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            int i581112 = (i581111 * 866) - 5184;
            int i581113 = ~i581111;
            int i581114 = ~((i581113 & i200) | (i581113 ^ i200));
            int i581115 = -(-(((i581114 & (-7)) | ((-7) ^ i581114)) * (-865)));
            int i581116 = (i581112 & i581115) + (i581112 | i581115);
            int i581117 = (~((i581111 ^ i) | (i581111 & i))) * 865;
            int i581118 = (i581116 ^ i581117) + ((i581117 & i581116) << 1);
            int i581119 = ((~(i581111 | i200)) | (~(((-7) ^ i200) | ((-7) & i200)))) * 865;
            int i591110 = -(-TextUtils.lastIndexOf(str14, '0', 0, 0));
            Object[] objArr1015 = new Object[1];
            a(iResolveOpacity10, (i581118 ^ i581119) + ((i581119 & i581118) << 1), (char) ((i591110 ^ 1) + ((i591110 & 1) << 1)), objArr1015);
            String[] strArr114 = {str416, (String) objArr1015[0]};
            int i591111 = -(-(ViewConfiguration.getMaximumFlingVelocity() >> 16));
            int i591112 = (i591111 & 1968) + (i591111 | 1968);
            int i591113 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
            Object[] objArr111110 = new Object[1];
            a(i591112, ((i591113 | 15) << 1) - (i591113 ^ 15), (char) KeyEvent.getDeadChar(0, 0), objArr111110);
            String str417 = (String) objArr111110[0];
            int i591114 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
            int i591115 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            Object[] objArr111111 = new Object[1];
            a((i591114 ^ 1983) + ((i591114 & 1983) << 1), (i591115 & 19) + (i591115 | 19), (char) TextUtils.getOffsetBefore(str14, 0), objArr111111);
            String str418 = (String) objArr111111[0];
            Object[] objArr111112 = new Object[1];
            a(2001 - (~View.MeasureSpec.getSize(0)), ((Process.getThreadPriority(0) + 20) >> 6) + 14, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr111112);
            String[] strArr115 = {str417, str418, (String) objArr111112[0]};
            int i591116 = -Color.argb(0, 0, 0, 0);
            int i591117 = (i591116 ^ 2016) + ((i591116 & 2016) << 1);
            int i591118 = 20 - (~(-(ViewConfiguration.getScrollBarFadeDuration() >> 16)));
            int i591119 = -(-Color.alpha(0));
            Object[] objArr111113 = new Object[1];
            a(i591117, i591118, (char) ((i591119 ^ 16942) + ((i591119 & 16942) << 1)), objArr111113);
            String str5110 = (String) objArr111113[0];
            int iIndexOf115 = 2037 - TextUtils.indexOf(str14, str14);
            int tapTimeout8 = (ViewConfiguration.getTapTimeout() >> 16) + 10;
            int i601110 = -TextUtils.indexOf((CharSequence) str14, '0');
            Object[] objArr111114 = new Object[1];
            a(iIndexOf115, tapTimeout8, (char) ((i601110 ^ 50805) + ((i601110 & 50805) << 1)), objArr111114);
            String[] strArr2110 = {str5110, (String) objArr111114[0]};
            int i601111 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2046;
            int i601112 = -View.getDefaultSize(0, 0);
            Object[] objArr111115 = new Object[1];
            a(i601111, ((i601112 | 11) << 1) - (i601112 ^ 11), (char) ((-2) - (~(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))), objArr111115);
            String str5111 = (String) objArr111115[0];
            int jumpTapTimeout4 = 587 - (ViewConfiguration.getJumpTapTimeout() >> 16);
            int i601113 = -(-Color.blue(0));
            int i601114 = (i601113 ^ 6) + ((i601113 & 6) << 1);
            int i601115 = -TextUtils.getCapsMode(str14, 0, 0);
            Object[] objArr111116 = new Object[1];
            a(jumpTapTimeout4, i601114, (char) (((i601115 | 37337) << 1) - (i601115 ^ 37337)), objArr111116);
            String[] strArr2111 = {str5111, (String) objArr111116[0]};
            int iIndexOf116 = 2057 - TextUtils.indexOf((CharSequence) str14, '0');
            int i601116 = -Gravity.getAbsoluteGravity(0, 0);
            Object[] objArr111117 = new Object[1];
            a(iIndexOf116, (i601116 ^ 28) + ((i601116 & 28) << 1), (char) (34785 - (~View.combineMeasuredStates(0, 0))), objArr111117);
            String str5112 = (String) objArr111117[0];
            int i601117 = -(-ExpandableListView.getPackedPositionType(0L));
            int i601118 = ((i601117 | 2037) << 1) - (i601117 ^ 2037);
            int i601119 = -(-KeyEvent.normalizeMetaState(0));
            int i611110 = (i601119 & 10) + (i601119 | 10);
            int i611111 = -((byte) KeyEvent.getModifierMetaStateMask());
            Object[] objArr111118 = new Object[1];
            a(i601118, i611110, (char) ((i611111 ^ 50805) + ((i611111 & 50805) << 1)), objArr111118);
            c2 = 0;
            strArr7 = new String[][]{strArr114, strArr115, strArr2110, strArr2111, new String[]{str5112, (String) objArr111118[0]}};
            i88 = 0;
            i89 = -1;
            loop7: while (true) {
                if (i88 < 5) {
                    str15 = str14;
                    i90 = i;
                    break;
                }
                String[] strArr2112 = strArr7[i88];
                str13 = strArr2112[c2];
                strArr8 = (String[]) Arrays.copyOfRange(strArr2112, 1, strArr2112.length);
                length5 = strArr8.length;
                i96 = 0;
                while (i96 < length5) {
                    int i611112 = (i89 & 53) + (i89 | 53);
                    i89 = ((i611112 | (-52)) << 1) - (i611112 ^ (-52));
                    Object[] objArr111119 = {str13, strArr8[i96]};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                        char keyRepeatDelay8 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int i611113 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2386;
                        int i611114 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 31;
                        byte b316 = (byte) (-1);
                        Object[] objArr12112 = new Object[1];
                        c(b316, (byte) (b316 + 1), $$a[2], objArr12112);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(keyRepeatDelay8, i611113, i611114, -1207062455, false, (String) objArr12112[0], new Class[]{String.class, String.class});
                    }
                    long jLongValue119 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr111119)).longValue();
                    long j8118 = 1505969514;
                    i97 = i88;
                    long j8119 = 184;
                    long j81110 = j8118 ^ j19;
                    str15 = str14;
                    i98 = i96;
                    long j81111 = (((long) (-183)) * j8118) + (((long) 185) * jLongValue119) + ((((j81110 | jLongValue119) ^ j19) | ((j2 | jLongValue119) ^ j19)) * j8119) + (((long) (-184)) * (j | (((jLongValue119 ^ j19) | j8118) ^ j19))) + (j8119 * ((j81110 | j2) ^ j19)) + ((long) 471073814);
                    i99 = ((int) (j81111 >> 32)) & ((-802173004) + (((-9810593) | i200) * (-369)) + (((~(546681504 | i200)) | 1983907915) * (-369)) + (((~((-546681505) | i)) | 536870912 | (~(1993718507 | i200))) * 369));
                    int i611115 = (~((int) SystemClock.uptimeMillis())) | (-953170359);
                    i100 = ((int) j81111) & (1414504652 + (i611115 * 495) + (((~i611115) | (-1020935160)) * 495));
                    if (((i100 & i99) | (i99 ^ i100)) != 0) {
                        int i611116 = (i89 & 170) + (i89 | 170);
                        i90 = (i611116 & i200) | ((~i611116) & i);
                        break loop7;
                    }
                    i96 = (((i98 | 90) << 1) - (i98 ^ 90)) - 89;
                    strArr7 = strArr7;
                    length5 = length5;
                    strArr8 = strArr8;
                    str13 = str13;
                    i88 = i97;
                    str14 = str15;
                }
                int i611117 = i88;
                i88 = (i611117 & 1) + (i611117 | 1);
                strArr7 = strArr7;
                str14 = str14;
                c2 = 0;
            }
            int i611118 = (~(i & i74)) & (i | i74);
            int i611119 = -i611118;
            int i621110 = ((i611118 & i611119) | (i611118 ^ i611119)) >> 31;
            int i621111 = i90 & (~i621110);
            int i621112 = i74 & i621110;
            int i621113 = (i621112 & i621111) | (i621111 ^ i621112);
            int i621114 = 2085 - (~(-View.MeasureSpec.makeMeasureSpec(0, 0)));
            int scrollBarFadeDuration4 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 13;
            int i621115 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            Object[] objArr12113 = new Object[1];
            a(i621114, scrollBarFadeDuration4, (char) (((i621115 | 1) << 1) - (i621115 ^ 1)), objArr12113);
            String str5113 = (String) objArr12113[0];
            int i621116 = -View.resolveSize(0, 0);
            int i621117 = ((i621116 | 2099) << 1) - (i621116 ^ 2099);
            int i621118 = -(Process.myTid() >> 22);
            Object[] objArr12114 = new Object[1];
            a(i621117, (i621118 & 8) + (i621118 | 8), (char) TextUtils.getTrimmedLength(str15), objArr12114);
            Object[] objArr12115 = {str5113, (String) objArr12114[0]};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                str16 = str15;
                char cIndexOf6 = (char) ((-1) - TextUtils.indexOf((CharSequence) str16, '0'));
                int iMyPid7 = (Process.myPid() >> 22) + 2385;
                int iLastIndexOf110 = TextUtils.lastIndexOf(str16, '0', 0) + 33;
                byte b317 = (byte) (-1);
                Object[] objArr12116 = new Object[1];
                c(b317, (byte) (b317 + 1), $$a[2], objArr12116);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cIndexOf6, iMyPid7, iLastIndexOf110, -1207062455, false, (String) objArr12116[0], new Class[]{String.class, String.class});
            } else {
                str16 = str15;
            }
            long jLongValue1110 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr12115)).longValue();
            long j81112 = 720416162;
            long j81113 = (((long) (-519)) * j81112) + (j18 * jLongValue1110);
            long j81114 = 520;
            long j81115 = j81112 ^ j19;
            long j81116 = jLongValue1110 ^ j19;
            str13 = str16;
            long elapsedCpuTime8 = (int) Process.getElapsedCpuTime();
            long j91110 = elapsedCpuTime8 ^ j19;
            long j91111 = j81113 + (((((j81115 | j81116) | j91110) ^ j19) | ((jLongValue1110 | elapsedCpuTime8) ^ j19)) * j81114);
            long j91112 = (elapsedCpuTime8 | j81112) ^ j19;
            long j91113 = j91111 + (((long) (-1040)) * (((j81116 | j91110) ^ j19) | j91112)) + (j81114 * (((j81115 | j91110) ^ j19) | ((j81116 | j81112) ^ j19) | j91112)) + ((long) 1256627166);
            int i621119 = (int) (j91113 >> 32);
            int elapsedCpuTime9 = (int) Process.getElapsedCpuTime();
            i94 = i621119 & ((-1599174398) + (((~(2028791971 | elapsedCpuTime9)) | (-2079259388)) * (-140)) + ((~((-50467417) | elapsedCpuTime9)) * 70) + (((~(elapsedCpuTime9 | (-591565561))) | (-1538161244)) * 70));
            int i631110 = ~(((int) SystemClock.uptimeMillis()) | (-1940593011));
            i95 = ((int) j91113) & (((((-1839979195) | i631110) * (-658)) - 2103820497) + ((i631110 | 301990208) * 658));
            if (((i94 & i95) | (i94 ^ i95)) != 0) {
                i91 = ~(i & 150);
                i92 = i | 150;
                i93 = i91 & i92;
            } else {
                i93 = i;
            }
            int i631111 = i ^ i621113;
            int i631112 = (i631111 | (-i631111)) >> 31;
            int i631113 = i93 & (~i631112);
            int i631114 = i621113 & i631112;
            int i631115 = (i631114 & i631113) | (i631113 ^ i631114);
            int i631116 = -Color.red(0);
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault18 = MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int i631117 = i631116 * (-432);
            int i631118 = ((i631117 | 914438) << 1) - (i631117 ^ 914438);
            int i631119 = ~i631116;
            int i641110 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault18;
            int i641111 = (i641110 & i631119) | (i631119 ^ i641110);
            int i641112 = -(-((~((i641111 & 2107) | (i641111 ^ 2107))) * 433));
            int i641113 = ((i631118 | i641112) << 1) - (i641112 ^ i631118);
            int i641114 = ~((-2108) | iTuitionPaymentFragmentspecialinlinedviewModeldefault18);
            int i641115 = ((i631119 & i641114) | (i631119 ^ i641114)) * (-433);
            int i641116 = (i641113 & i641115) + (i641115 | i641113);
            int i641117 = ~i631116;
            int i641118 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault18 & i641117) | (i641117 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault18));
            int i641119 = ~(i631116 | 2107);
            Object[] objArr1222 = new Object[1];
            a(i641116 + (((i641119 & i641118) | (i641118 ^ i641119)) * 433), 47 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ExpandableListView.getPackedPositionType(0L), objArr1222);
            Object[] objArr1223 = {(String) objArr1222[0]};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char offsetBefore5 = (char) TextUtils.getOffsetBefore(str13, 0);
                int defaultSize9 = View.getDefaultSize(0, 0) + 993;
                int maxKeyCode6 = 8 - (KeyEvent.getMaxKeyCode() >> 16);
                byte b318 = (byte) (-1);
                byte b319 = (byte) (b318 + 1);
                Object[] objArr12117 = new Object[1];
                c(b318, b319, b319, objArr12117);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(offsetBefore5, defaultSize9, maxKeyCode6, -545305915, false, (String) objArr12117[0], new Class[]{String.class});
            }
            long jLongValue1111 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr1223)).longValue();
            long j91114 = 580643516;
            long j91115 = 829;
            long j91116 = (j91115 * j91114) + (j91115 * jLongValue1111);
            long j91117 = -828;
            long j91118 = j91116 + (((((j91114 ^ j19) | (jLongValue1111 ^ j19)) ^ j19) | (((j2 | j91114) | jLongValue1111) ^ j19)) * j91117);
            long j91119 = jLongValue1111 | j91114;
            long j103 = j91118 + (j91117 * (j91119 | j2)) + (((long) 828) * (j91119 ^ j19)) + ((long) 39815768);
            int iMyUid7 = Process.myUid();
            int i651110 = (-818885110) + (((~((-1764619800) | iMyUid7)) | 1747736083 | (~(327393388 | iMyUid7))) * (-880));
            int i651111 = (~((-1764619800) | (~iMyUid7))) | (-327393389);
            int i651112 = ~(iMyUid7 | 1764619799);
            int i651113 = ((int) (j103 >> 32)) & (i651110 + ((i651111 | i651112) * (-880)) + (i651112 * 880));
            int iMyUid8 = Process.myUid();
            int i651114 = ((int) j103) & (((1953427236 + (((~((-713034537) | iMyUid8)) | (~(2144706349 | iMyUid8))) * 69)) + (((~(iMyUid8 | 1808898857)) | ((~((-1048842029) | iMyUid8)) | 335807492)) * (-69))) - 1694773179);
            int i651115 = (((i651113 & i651114) | (i651113 ^ i651114)) * 263) ^ i;
            int i651116 = (~(i & i631115)) & (i | i631115);
            int i651117 = -i651116;
            int i651118 = ((i651116 & i651117) | (i651116 ^ i651117)) >> 31;
            int i651119 = i651115 & (~i651118);
            int i6619 = i631115 & i651118;
            i67 = (i6619 & i651119) | (i651119 ^ i6619);
            strArr4 = strArr6;
        } else {
            strArr4 = null;
        }
        int i8910 = i ^ i67;
        Object[] objArr193 = {new int[1], new int[]{i67}, null, new int[]{i}, strArr4};
        int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
        int i8911 = ~iElapsedRealtime2;
        int i8912 = i3 + (((((1498642675 + (((~(804593604 | i8911)) | 268967955) * 184)) + ((iElapsedRealtime2 | 104075520) * (-184))) + ((~((-969486040) | i8911)) * 184)) - (~(((i8910 | (-i8910)) >> 31) & 16))) - 1);
        int i8913 = i8912 ^ (i8912 << 13);
        int i8914 = i8913 >>> 17;
        int i8915 = ((~i8913) & i8914) | ((~i8914) & i8913);
        ((int[]) objArr193[0])[0] = i8915 ^ (i8915 << 5);
        return objArr193;
    }

    static {
        char[] cArr = new char[2154];
        ByteBuffer.wrap("±³\u0098\u0092ã-ÍÔ\u0014\u001b~éI\u008f\u0090\u0016ú¨Å@/ÑvaA\f«¡ò1ÜÎ'XqäX\u008d£1\u008d§Ôq>ó\tjP\rº¥\u0085=À\u0010é1\u0092\u008e¼we¸\u000fJ8,áµ\u008b\u000b´ã^r\u0007Â0¯Ú\u0002\u0083\u0083\u00ad`Vï\u0000P)\u0014Ò\u0085ü\u0007¥ÿO@xÍ!«ñVØw£È\u008d1Tþ>\f\tjÐóºM\u0085¥o46\u0084\u0001éëD²Æ\u009c6g·1\u0010É\u0005à3\u009b\u0087µgl\u00ad\u0006U19è¨\u0082\u000f½üWk\u000e\u008b9µÓ'\u008a\u008a¤x_ì\tI -Û\u009cõ=¬úFWqØ(®Â\u0015ý\u009c\u0097}±³\u0098\u0093ã<ÍÁ\u0014\u001b~êI\u0087\u0090Tú¼ÅT/×vb±³\u0098\u0093ã<ÍÁ\u0014\u001b~ýI\u0089\u0090\u0017úâÅV/Êv}A\u0014±³\u0098\u0085ã,ÍÁ\u0014U~üI\u0084\u0090Uú\u009eÅ`/õv}A\u0012«\u009bò\u0014ÜË'Hq÷±³\u0098\u0092ã)ÍÖ\u0014U~¡IÎ\u0090\u0019ú¼ÅS/Ñv|A\u0002«\u0091±î\u0098\u0099ãfÍÀ\u0014[~áI\u0094\u0090Tú¾ÅC/Üv`A\u000b«\u0097ò4Üõ'RqóX\u009c£\u001d\u008d°Ô@>ó\t+M\u0015db\u001f\u009d1;è \u0082\u001aµol¯\u0006E9¸Ó'\u008a\u009b½ðWl\u000eÏ \u000eÛ©\u008d\b¤g_æqK(»Â\bõÓ±³\u0098\u0085ã1ÍÑ\u0014@~ëI\u008d\u0090Uú ÅO/Úv=A\b«\u0097ò2ÜÄ'^q¸X\u009b£-\u0007ú.\u009bU+{È¢_Èò±³\u0098\u0085ã1ÍÑ\u0014@~ëI\u008d\u0090Uú®ÅO/Öv=A\n«\u009bò=Üß'jqÛXÅ£,\u008d±ÔC>õ\t7P\u000fº©\u00856ïÆ6v\u0000ñk\u009c±³\u0098\u0085ã1ÍÑ\u0014@~ëI\u008d\u0090Uú®ÅO/Öv=A\n«\u009bò=Üß'jqÛXÅ£2\u008d¦ÔA>ðÂ\u0088ë¾\u0090\n¾êg{\rÐ:¶ãn\u0089\u009b¶t\\á\u0005\u000623Ø¬\u0081\t¯ÿTb\u0002À+¦Ð/þ¢§eMÉzN#'ÉÓö\u0010\u009cæ\u008e`§AÜþò\u0007+ÈA3vV¯ÄÅjú\u0092\u0010\u001eI¤~Ä\u0094Y\bg!\u0010ZïtI\u00adÈÇnð\u0005)\u0097Ck|Ç\u0096^Ïèø\u0099Ã¨êÉ\u0091s¿\u008bf\u000b\fú;ÔâE\u0088â±³\u0098\u0086ã:ÍÍ\u0014W~¡I\u0086\u0090\u0013ú ÅC/ËvkA\u0017«\u008aò5ÜÇ'O±ò\u0098\u0093ã%Í×\u0014G~èÚ\u001ból\u0088\u0093¦'\u007f³\u0015\u0014\"qûú\u0091Z®§Dc\u001d\u008a*ðÀe\u0099Ð·9L¨\u001a\u00003iÈÂæS¿¾U\u0007±û\u0098\u0093ã&ÍÛß\töv\u008dß£4z¸\u0010\u0018'qþ±\u0094Z«ºA.\u0018Ù/ãÅ\u007f\u009c\u009b²+I¼\u001f\u00116xÍÀã\u001fº¬P\u0015g\u008a>§ÔEëÜ\u0081<X\u0084n$\u0005rÜßòL\u0089\u008c_\u001fvb\rÿ#Oú \u0090-§\u008c~ñ±ì\u0098\u0093ã:ÍÑ\u0014]~ýI\u0094\u0090Tú¿Å_/Ëv<A\u0006«\u009aò~ÜÎ'YqôX\u009d£%\u008dúÔI>ð\toPBº \u00859ïÙ6a\u0000Ák\u0097²:\u009c©çi1þ\u0018\u0087c\u001aMª\u0094OþÈ±ì\u0098\u0093ã:ÍÑ\u0014]~ýI\u0094\u0090Tú¿Å_/Ëv<A\u0006«\u009aò~ÜÎ'YqôX\u009d£%\u008dúÔ\\>ï\t4P\u000fº·\u00851±ì\u0098\u0093ã:ÍÑ\u0014]~ýI\u0094\u0090Tú¿Å_/Ëv<A\u0006«\u009aò~ÜÎ'YqôX\u009d£%\u008dúÔ\\>ï\t4P\u0000º§\u0085;\u0080\u0099©æÒOü¤%(O\u0088xá¡!ËÊô*\u001e¾GIps\u009aïÃ\u000bí»\u0016,@\u0081iè\u0092P¼\u008få)\u000f\u009a8Aat\u008bÐ´N±ì\u0098\u0093ã:ÍÑ\u0014]~ýI\u0094\u0090Tú¿Å_/Ëv<A\u0006«\u009aò~ÜÎ'YqôX\u009d£%\u008dúÔ\\>ï\t4P\u0001º¨\u0085; 3\tMrþ\\\u0003\u0085\u009eï1§\u0081\u008e´õ\bÛÿ\u0002eh\u0093_¿\u0086'ì\u009aÓa9æ`EW%9¾\u0010ÀksE\u008e\u009c\u0007ö¯ÁÑ\u0018]rìçëÎÝµi\u009b\u0089B\u0018(³\u001fÕÆ\r¬ò\u0093\fy\u0081 '\u0017YýÑ¤g\u008a\u0080q\u000f'á\u000eÇõsÛâ\u0082\u0012h·_5\u0006Gì³Ós¹\u0093`/V²=Íä\u007fÊÛ±\u001dgµNÈ5Z\u001bóÂ\n¨Ì\u009f>F_,Ò±³\u0098\u0080ã-ÍÌ\u0014P~áI\u0092\u0090Uú ÅO/Úv$AP«Ñò8ÜÝ'\u0013q÷X\u009d£&\u008d½ÔA>®\tjP\u001eº¯\u00855ïÓ6v\u0000çkÞ²=\u009cµçX1ì\u0018\u008dc\u0003M½\u0094\u000eþÉÉc±³\u0098\u0080ã-ÍÌ\u0014P~áI\u0092\u0090Uú ÅO/Úv$AP«Ñò8ÜÝ'\u0013qþX\u009f£!\u008d»ÔC>ð\tuP\u001fº£\u0085*ï\u009c6s\u0000÷k\u009e².\u009c³çA1û\u0018Ìc\u0007M¡\u009d\u0099´¯Ï\u001báû8jRÁe§¼\u007fÖ\u008aée\u0003ðZ\u000emz\u0087ûÞ\u0019ðì\u000by]Ét¦\u008f7¡\u009føm\u0012Î%\\|\u0019\u0096\u0085©\u001cÃì\u001aK,ÆG¼\u009e\u0001°\u0095Ëy\u001d\u008f4«O.a\u0094¸$ÒãåIqÒXò#]\r Ôz¾\u0086\u0089ïPr:Ù\u0005hï°¶\u001d\u0081lkë2\u001f\u001c¨ç1±\u0098\u0098ücGMÆ\u0014*þ\u0093É\r\u0090dzÄE\\/ýö\u0017À\u009c±Û\u0098\u0093ã&ÍÛ\u0014Y~áI\u0094\u0090\u0013ú£ÅH±é\u0098\u0098ã#ÍÌ\u0014[~ùI\u008e\u008f¹¦ØÝ|ó\u008b*\u001f@¡wÓ®Q±î\u0098\u0099ãfÍÒ\u0014F~áI\u0084\u0090\u000fú¯ÅR/\u0096vvA\u0001«\u0088ò9ÜÉ'Y?t\u0016\nm¹CD\u009a\u0092ð&Ç\u000ef½OÕ4`\u001a\u0081Ã\u0000©¡\u009eÅÇ\u008dîå\u0095P»±b0\b\u0091?õæS\u008cÂ³hYø±û\u0098\u0093ã&ÍÇ\u0014F~çI\u0083\u0090%ú´Å\u001e/\u008evMAR«Ê±î\u0098\u0099ãfÍÒ\u0014F~áI\u0084\u0090\u000fú¯ÅR/\u0096v\u007fA\u000b«\u009aò5ÜÆ\u0004ã-\u009eV/±ù\u0098\u009bã=ÍÎ\u0014U~úI\u008f\u0090\b±Ý\u0098\u0086ã8Í\u0082\u0014f~ûI\u008e\u0090\u000eú¥ÅK/Ýv2A\u0002«\u0091ò\"Ü\u008a'\u007fqþX\u009a£-\u008d¹ÔKM°dõ\u001fA1½è6\u0082\u008aµél7\u0006ò9\u000fÓ\u009e\u008a_½kWæ\u000eT «Û%\u008dÛ¤ã_@qË(cÂ\u0095õO¬7±Ý\u0098\u0098ã,ÍÐ\u0014[~çI\u0084\u0090Zú\u009fÅb/óv2A\u0006«\u008bò9ÜÆ'Hq¶X\u008e£-\u008d¦Ô\u000e>ø\t\"PZº\u0099\u0085nï\u0086£\u0001\u008avñ\u0089ß%\u0006ºl\u0013[k\u0082âèB×»=2f~O\u001c4¡\u001aCÃ×©b\u009e\u0016G\u0097â\u009aËä°W\u009eªG|-ÈJÓcª\u0018\u001b6üïa\u0085Æ±î\u0098\u0099ãfÍÒ\u0014F~áI\u0084\u0090\u000fú¯ÅR/\u0096vpA\u0016«\u009fò>ÜÎJJc=\u0018Â6mïõ\u0085X²*k»\u0001\u0004>¬Ôm\u008dÓº\u00adP/±\u00ad\u0002þ+\u0089Pv~Á§AÍýú\u0085#\u0018I¹±¬rL[; Ä\u000eb×ã½E\u008a.S¼9@\u0006ôìhµß\u0082¢h)1\u0091\u001f|¶¹\u009fÀägÊ\u008d\u0013(yµN\u009b\u0097\u000fågÌ\u0010·ï\u0099I@È*n\u001d\u0005Ä\u0097®k\u0091É{X\"õ\u0015\u008aÿ\u0012¦«\u0088SsÇ%v\f\u000f÷¿k_B79\u0082\u0017cÎâ¤C\u0093'Jñ \u001b\u001fæõw¬\u0099\u009b§q?(\u009a\u0006kýê«[\u0082/±û\u0098\u0093ã&ÍÇ\u0014F~çI\u0083\u0090%ú´Å\u001e/\u008ev=A\u0017«\u009aò;Üõ'Dq®XÞ£m\u008d³ÔK>î\t\u007fP\u001eº¯\u0085;ïí6|\u0000¦kÆ~\u0097Wÿ,J\u0002«Û*±\u008b\u0086ï_95Ç\n%à»¹\u0019\u008edd÷=c\u0013µè4¾\u0091\u0097«lIBÝ\u001b,ñ\u0089Æ\u0004\u009fiuÉ\u0016\u0007?oDÚj;³ºÙ\u001bî\u007f7©]Fb¸\u0088+Ñ\u0096æ \f4UÜ{y\u0080¶Ö\bÿ{\u0004Æ*\u0010sä\u0099\fl\u0093Eñ>O\u0010\u00adÉ0£\u0083\u0094§Ma'À\u0018%ò\u008f«\u001d\u009c|vþ/W\u0001¬ú1¬¡\u0085ø~\u0012P\u008a\tiã\u008fÔ\u0017\u008djgËXB2³ë\u000fÝ©¶ào\u001aA\u0082\u001b\u001d2jI\u0095g3¾¨Ô\u0012ãg:åPPo´\u0085/Ü\u0084ëå\u0090\u0086¹ñÂ\u000eì¨53_\u0089hü±{ÛÉä/\u000e·W\u001f`\"\u008aôÓMý«\u00068P\u009ay®\u0082L¬Õõ(\u001f\u008f(\u0017qv\u009bÞ¤BÎ³\u0017\u0002!\u0082±Ý\u0098\u0098ã,ÍÐ\u0014[~çI\u0084\u0090Wú´Å\u001e/\u008e±î\u0098\u0099ãfÍÀ\u0014A~çI\u008c\u0090\u001eúâÅB/ÑvaA\u0014«\u0092ò1ÜÓ'\u0012qÿX\u008c É\t²r\u001a\\÷\u00858\u009a/³BÈûæ\f?ÀU'bL»ÃÑ8î\u008d\u0004\u0007]¥jË\u0080\tÙú÷\u0002\f\u0089Z<sA\u001a\u00053{HÍf?¿òÕ\u000eâ\u007f;¼QIn¯\u00849Ý\u0094êç\u0000sYÁw1±í\u0098\u0093ã%Í×\u0014\u001a~ýI\u0086\u0090TúªÅG/ÓvwA;«\u009dò1ÜÇ'YqäX\u0089W¨~Ö\u0005`+\u0092ò_\u0098¸¯Ãv\u0011\u001cå#\u0000É\u0099\u0090\b§EMÞ\u0014{:\u009cÁ\u0010\u0097§¾Ô\u0086R¯%ÔÚúu#íI@~2§£Í\u001cò´\u0018eAÀv¼\u009c0Å\u0083ë\u007f\u0010äF\u0004o%\u0094\u009bº\u0005ãç\tX±î\u0098\u0099ãfÍÀ\u0014[~áI\u0094\u0090Tú½ÅC/ÕvgAJ«\u009fò&ÜÎ'cqøX\u0089£/\u008d±±î\u0098\u0099ãfÍÍ\u0014P~ãIÎ\u0090\u0018ú¹ÅO/ÔvvAJ«\u0098ò9ÜÄ'[qóX\u009a£2\u008d¦ÔG>î\tn\"ù\u000b\u008epq^Å\u0087QíöÚ\u0093\u0003\u0018i¸VE¼\u0081ågÒ\u00068\u0080a+OÙ´\u0005âçË\u00960;\u001e¤G\\\u00adå\u009a}Ã\t)¸\u0016!|Ñ±î\u0098\u0099ãfÍÑ\u0014M~ýI\u0094\u0090\u001fú¡Å\b/ÚvgA\r«\u0092ò4Ü\u0084'ZqÿX\u0086£%\u008d±Ô\\>ð\thP\u0005º¨\u0085,±î\u0098\u0099ãfÍÑ\u0014M~ýI\u0094\u0090\u001fú¡Åy/ÝvjA\u0010«Ðò2Üß'UqúX\u008c£l\u008d²ÔG>î\t}P\tº´\u0085(ïÀ6m\u0000ðk\u0084=µ\u0014Âo=A\u008f\u0098\nò»Åß\u001cNvåIS£\u0081ú<ÍV'É~oPß«\u0001ý¤ÔÝ/~\u0001êX\u0007²«\u00853Ü^6ó\tw\u0091ã¸\u0094ÃkíÙ4\\^íi\u0089°\u0018Ú³åt\u000fÑVsa\u0002\u008b\u009eÒsüÅ\u0007DQòx\u0089\u0083+\u00ad÷ôE\u001eä)yp\u0006\u009a®¥'ÏÏ\u0016{ úK\u0093\u00923\u0011a±°\u0098ÖVë\u0097½öðßÑ¤n\u008a\u0097SX9¼\u000eÆ×T½ú\u0082:h\u008b18\u0006WìØ±³\u0098\u0092ã-ÍÔ\u0014\u001b~ýI\u008f\u0090\u0019ú§ÅC/Ìv=A\u0006«\u009fò#ÜÏ'^q÷X\u0086£&\u008d\u008bÔI>å\ttP\u0015º¢±³\u0098\u0092ã-ÍÔ\u0014\u001b~ýI\u008f\u0090\u0019ú§ÅC/Ìv=A\u0003«\u009bò>ÜÓ'X±³\u0098\u0092ã-ÍÔ\u0014\u001b~ýI\u008f\u0090\u0019ú§ÅC/Ìv=A\u0015«\u009bò=Üß'X9à\u0010ÖkbE\u0082\u009cHö¬ÁÖ\u0018DrêM*§\u009fþ3ÉV#Îzf\"u\u000bCp÷^\u0017\u0087\u0086í-ÚK\u0003\u0093ifV\u0089¼\u001cåûÒÎ8QaôO\u000f´¥â=ËO0è\u001e~G\u0087\u00ad%\u009a\u0083ÃÎ)e\u0016ü|\u0001¥¥\u0093\u0007øG!é\u000fwt\u0085¢`\u008bWðÝ±³\u0098\u0092ã-ÍÔ\u0014\u001b~ìI\u0093\u0090\u000eú\u0093ÅA/Èva±³\u0098\u0092ã-ÍÔ\u0014\u001b~ìI\u0093\u0090\u000eú\u0093ÅR/Ñv\u007fA\u0001¥\r\u008c,÷\u0093Ùj\u0000¥jC]1\u0084§î\u0019Ñý;rb\u0083U¸¿3æ\u009aÈr3íeDL2·\u0099\u0099\u0018Àô±³\u0098\u0085ã1ÍÑ\u0014@~ëI\u008d\u0090Uú ÅO/Úv=A\b«\u0097ò2ÜÈ'OqâX\u008e£-\u008d¸ÔJ>å\thP3º¬\u00856ïÛ6*\u0000ík\u009fX\u0019q8\n\u0087$~ý±\u0097F 9y¤\u0013\u0007,ïÆq\u009fÝ±³\u0098\u0092ã-ÍÔ\u0014\u001b~ìI\u0093\u0090\u000eú«Å_/Êv}±³\u0098\u0092ã-ÍÔ\u0014\u001b~ìI\u0093\u0090\u000eú¡ÅC/ßv|CtjU\u0011ê?\u0013æÜ\u008c+»TbÉ\bd7\u0093Ý\u0016\u0084°±³\u0098\u0092ã-ÍÔ\u0014\u001b~ìI\u0093\u0090\u000eúºÅK/Ëvu±³\u0098\u0092ã-ÍÔ\u0014\u001b~ìI\u0093\u0090\u000eú¼ÅA/Ùv{A\u0014«\u009d¯í\u0086ÌýsÓ\u008a\nE`²WÍ\u008ePäÍÛ\u00111\u008bh)?@\u0016amÚC%\u009a¦ðRÇw\u001eætHK»¡'ø\u008eÏö%i|ÐRv©áÿ\u001dÖy-\u009e\u0003EZ®°\u0007\u0087\u0082A3h\u001b\u0013¦=Vä\u009b\u008ey¹\t`\u0094\n(5ÉßO\u0086á±Ë[<\u0002£,^×ï\u0081~¨\tS°}1$ÊÎFùõ \u0080J\"u½\u001f@±³\u0098\u0086ã:ÍÍ\u0014W~¡I\u0089\u0090\u0015ú¼ÅI/ÊvfA\u0017±¬\u0098\u0090ã.Í\u0082\u0014\u000e±³\u0098\u0086ã:ÍÍ\u0014W~¡I\u0093\u0090\u001fú Å@/\u0097v\u007fA\u0005«\u008eò#±û\u0098\u0084ã)ÍÎ\u0014X~áI\u0083\u0090Tú«ÅI/ÔvvA\u0002«\u0097ò#ÜÂ'\u0012qåX\u0087±ð\u0098\u009fã*Íå\u0014x~ËI³\u0090%ú®ÅU/Ìv<A\u0017«\u0091ó\u009dÚ½¡\u0012\u008fïV5<Í\u000b«Ò0¸\u008b\u0087imÉ4_\u0003%é´°\u001b\u009eçea3\u0096\u001a¾á\u0001Ï\u0096w\u0088^ì%K\u000b±Ò1¸\u008c\u008f÷Vo<Ñ\u0003#±³\u0098\u0093ã<ÍÁ\u0014\u001b~ãI\u008f\u0090\u000fú¢ÅR/Ë6Q\u001fpdËJ4\u0093·ùCÎf\u0017÷}YBª¨6ñ\u009fÆç,xuÁ[g ðö\u0010ßz$\u008f\nWS¼¹\u0012\u008e\u008b× =\\\u0002×h<±³\u0098\u0086ã:ÍÍ\u0014W~¡I\u0083\u0090\nú¹ÅO/ÖvtA\u000b±Û\u0098\u0099ã$ÍÆ\u0014R~çI\u0093\u0090\u0012±³\u0098\u0092ã)ÍÖ\u0014U~¡I\u008d\u0090\u0013ú¿ÅE/\u0097vbA\u0016«\u0091ò6ÜÃ'PqóX\u009b£m\u008d·Ô[>ò\t5P\\ºé\u0085;ïÝ6i\u0000°k\u009d²#\u009c¿çD1ç\u0018\u0094c\u001dM¼\u0094Tþ\u0094Éa\u0010\u0003z\u0095E'¯ÍöSÀõ".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2154);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cArr;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 42694012263176438L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(short r7, byte r8, short r9) {
        /*
            byte[] r0 = com.google.android.gms.internal.measurement.zzmq.$$c
            int r9 = r9 * 4
            int r9 = 4 - r9
            int r7 = r7 * 3
            int r7 = 1 - r7
            int r8 = r8 * 3
            int r8 = 115 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r8 = r9
            r4 = r2
            goto L2a
        L17:
            r3 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L1b:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L28:
            r3 = r0[r8]
        L2a:
            int r3 = -r3
            int r9 = r9 + r3
            int r8 = r8 + 1
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzmq.$$e(short, byte, short):java.lang.String");
    }
}

package com.google.android.material.color.utilities;

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
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.libraries.places.api.net.kotlin.zzo;
import defpackage.initSession;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes6.dex */
public final class QuantizerWu implements Quantizer {
    private static final int INDEX_BITS = 5;
    private static final int INDEX_COUNT = 33;
    private static final int TOTAL_SIZE = 35937;
    Box[] cubes;
    double[] moments;
    int[] momentsB;
    int[] momentsG;
    int[] momentsR;
    int[] weights;

    enum Direction {
        RED,
        GREEN,
        BLUE
    }

    static int getIndex(int i, int i2, int i3) {
        return (i << 10) + (i << 6) + i + (i2 << 5) + i2 + i3;
    }

    @Override // com.google.android.material.color.utilities.Quantizer
    public final QuantizerResult quantize(int[] iArr, int i) {
        constructHistogram(new QuantizerMap().quantize(iArr, i).colorToCount);
        createMoments();
        List<Integer> listCreateResult = createResult(createBoxes(i).resultCount);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Integer> it = listCreateResult.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(Integer.valueOf(it.next().intValue()), 0);
        }
        return new QuantizerResult(linkedHashMap);
    }

    final void constructHistogram(Map<Integer, Integer> map) {
        this.weights = new int[TOTAL_SIZE];
        this.momentsR = new int[TOTAL_SIZE];
        this.momentsG = new int[TOTAL_SIZE];
        this.momentsB = new int[TOTAL_SIZE];
        this.moments = new double[TOTAL_SIZE];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            int iRedFromArgb = ColorUtils.redFromArgb(iIntValue);
            int iGreenFromArgb = ColorUtils.greenFromArgb(iIntValue);
            int iBlueFromArgb = ColorUtils.blueFromArgb(iIntValue);
            int index = getIndex((iRedFromArgb >> 3) + 1, (iGreenFromArgb >> 3) + 1, (iBlueFromArgb >> 3) + 1);
            int[] iArr = this.weights;
            iArr[index] = iArr[index] + iIntValue2;
            int[] iArr2 = this.momentsR;
            iArr2[index] = iArr2[index] + (iRedFromArgb * iIntValue2);
            int[] iArr3 = this.momentsG;
            iArr3[index] = iArr3[index] + (iGreenFromArgb * iIntValue2);
            int[] iArr4 = this.momentsB;
            iArr4[index] = iArr4[index] + (iBlueFromArgb * iIntValue2);
            double[] dArr = this.moments;
            dArr[index] = dArr[index] + ((double) (iIntValue2 * ((iRedFromArgb * iRedFromArgb) + (iGreenFromArgb * iGreenFromArgb) + (iBlueFromArgb * iBlueFromArgb))));
        }
    }

    public static final class CreateBoxesResult {
        private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private static long b;
        int resultCount;
        private static final byte[] $$c = {123, -2, -101, -104};
        private static final int $$d = 154;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {80, -8, 43, 65};
        private static final int $$b = 182;
        private static int TuitionPaymentFragmentbindingInflater1 = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(int r7, int r8, int r9, java.lang.Object[] r10) {
            /*
                byte[] r0 = com.google.android.material.color.utilities.QuantizerWu.CreateBoxesResult.$$a
                int r7 = r7 * 3
                int r7 = r7 + 1
                int r8 = 103 - r8
                int r9 = r9 * 2
                int r9 = r9 + 4
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r7
                r8 = r9
                r4 = r2
                goto L2a
            L15:
                r3 = r2
            L16:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r7) goto L25
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L25:
                r3 = r0[r9]
                r6 = r9
                r9 = r8
                r8 = r6
            L2a:
                int r3 = -r3
                int r9 = r9 + r3
                int r8 = r8 + 1
                r3 = r4
                r6 = r9
                r9 = r8
                r8 = r6
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.color.utilities.QuantizerWu.CreateBoxesResult.c(int, int, int, java.lang.Object[]):void");
        }

        private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
            long[] jArr = new long[i2];
            lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            int i4 = $10 + 77;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                try {
                    Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2[i + i6])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (Process.myPid() >> 22) + 2187, 40 - View.MeasureSpec.getSize(0), 841711447, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(b), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char doubleTapTimeout = (char) (33017 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                        int packedPositionChild = 3010 - ExpandableListView.getPackedPositionChild(0L);
                        int mirror = AndroidCharacter.getMirror('0') - 22;
                        byte b4 = (byte) (-$$c[1]);
                        byte b5 = (byte) (b4 - 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(doubleTapTimeout, packedPositionChild, mirror, 321985076, false, $$e(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 1;
                        byte b7 = (byte) (b6 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 36505), 3375 - TextUtils.indexOf((CharSequence) "", '0', 0), 17 - Color.argb(0, 0, 0, 0), -968507904, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
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
            int i7 = $11 + 123;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr5 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b8 = (byte) 1;
                    byte b9 = (byte) (b8 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (View.resolveSizeAndState(0, 0, 0) + 36505), 3376 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 17 - ExpandableListView.getPackedPositionGroup(0L), -968507904, false, $$e(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr);
        }

        CreateBoxesResult(int i, int i2) {
            this.resultCount = i2;
        }

        /* JADX WARN: Code duplicated, block: B:100:0x0a5d A[Catch: all -> 0x0ab3, IOException -> 0x0ab7, TRY_LEAVE, TryCatch #22 {IOException -> 0x0ab7, all -> 0x0ab3, blocks: (B:86:0x0a3a, B:87:0x0a3d, B:92:0x0a49, B:94:0x0a4f, B:96:0x0a56, B:100:0x0a5d), top: B:516:0x0a3a }] */
        /* JADX WARN: Code duplicated, block: B:103:0x0a7a A[LOOP:17: B:99:0x0a5b->B:103:0x0a7a, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:106:0x0a89  */
        /* JADX WARN: Code duplicated, block: B:111:0x0aac  */
        /* JADX WARN: Code duplicated, block: B:112:0x0aae  */
        /* JADX WARN: Code duplicated, block: B:130:0x0b9b  */
        /* JADX WARN: Code duplicated, block: B:133:0x0baa A[Catch: all -> 0x0275, TryCatch #14 {all -> 0x0275, blocks: (B:10:0x0178, B:12:0x0185, B:13:0x01bc, B:25:0x0354, B:27:0x0361, B:28:0x039d, B:37:0x04fb, B:39:0x0508, B:41:0x0541, B:77:0x0830, B:79:0x0836, B:80:0x086d, B:131:0x0b9d, B:133:0x0baa, B:134:0x0bea, B:146:0x0d63, B:148:0x0d70, B:149:0x0db0, B:157:0x0e77, B:159:0x0e84, B:160:0x0ec9, B:166:0x0fb5, B:168:0x0fc2, B:169:0x1001, B:177:0x11a6, B:179:0x11b3, B:180:0x11f4, B:188:0x1288, B:190:0x1295, B:191:0x12d6, B:210:0x1551, B:212:0x155e, B:213:0x159a, B:232:0x1777, B:234:0x1784, B:235:0x17be, B:242:0x1884, B:244:0x188a, B:245:0x18bc, B:248:0x195c, B:250:0x196e, B:251:0x19a3, B:257:0x1a8d, B:259:0x1a9a, B:260:0x1ad9, B:263:0x1af1, B:265:0x1b08, B:266:0x1b46, B:321:0x2b6c, B:323:0x2b79, B:324:0x2bba, B:345:0x309e, B:347:0x30ab, B:349:0x30f5, B:360:0x3245, B:362:0x3252, B:364:0x3290, B:460:0x3888, B:462:0x3895, B:463:0x38cd, B:327:0x2bc6, B:329:0x2bde, B:330:0x2c21, B:278:0x2814, B:280:0x2821, B:282:0x2870, B:297:0x28f9, B:299:0x2906, B:301:0x2959, B:285:0x2887, B:287:0x2894, B:289:0x28da, B:196:0x13c0, B:198:0x13cd, B:199:0x140e, B:54:0x06be, B:56:0x06cb, B:57:0x0704, B:67:0x07b1, B:69:0x07be, B:70:0x0800, B:44:0x05ba, B:46:0x05c7, B:47:0x05f7), top: B:505:0x0178 }] */
        /* JADX WARN: Code duplicated, block: B:138:0x0cae A[LOOP:2: B:128:0x0b98->B:138:0x0cae, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:142:0x0d19  */
        /* JADX WARN: Code duplicated, block: B:144:0x0d27  */
        /* JADX WARN: Code duplicated, block: B:148:0x0d70 A[Catch: all -> 0x0275, TryCatch #14 {all -> 0x0275, blocks: (B:10:0x0178, B:12:0x0185, B:13:0x01bc, B:25:0x0354, B:27:0x0361, B:28:0x039d, B:37:0x04fb, B:39:0x0508, B:41:0x0541, B:77:0x0830, B:79:0x0836, B:80:0x086d, B:131:0x0b9d, B:133:0x0baa, B:134:0x0bea, B:146:0x0d63, B:148:0x0d70, B:149:0x0db0, B:157:0x0e77, B:159:0x0e84, B:160:0x0ec9, B:166:0x0fb5, B:168:0x0fc2, B:169:0x1001, B:177:0x11a6, B:179:0x11b3, B:180:0x11f4, B:188:0x1288, B:190:0x1295, B:191:0x12d6, B:210:0x1551, B:212:0x155e, B:213:0x159a, B:232:0x1777, B:234:0x1784, B:235:0x17be, B:242:0x1884, B:244:0x188a, B:245:0x18bc, B:248:0x195c, B:250:0x196e, B:251:0x19a3, B:257:0x1a8d, B:259:0x1a9a, B:260:0x1ad9, B:263:0x1af1, B:265:0x1b08, B:266:0x1b46, B:321:0x2b6c, B:323:0x2b79, B:324:0x2bba, B:345:0x309e, B:347:0x30ab, B:349:0x30f5, B:360:0x3245, B:362:0x3252, B:364:0x3290, B:460:0x3888, B:462:0x3895, B:463:0x38cd, B:327:0x2bc6, B:329:0x2bde, B:330:0x2c21, B:278:0x2814, B:280:0x2821, B:282:0x2870, B:297:0x28f9, B:299:0x2906, B:301:0x2959, B:285:0x2887, B:287:0x2894, B:289:0x28da, B:196:0x13c0, B:198:0x13cd, B:199:0x140e, B:54:0x06be, B:56:0x06cb, B:57:0x0704, B:67:0x07b1, B:69:0x07be, B:70:0x0800, B:44:0x05ba, B:46:0x05c7, B:47:0x05f7), top: B:505:0x0178 }] */
        /* JADX WARN: Code duplicated, block: B:152:0x0dbd  */
        /* JADX WARN: Code duplicated, block: B:154:0x0deb  */
        /* JADX WARN: Code duplicated, block: B:155:0x0df2  */
        /* JADX WARN: Code duplicated, block: B:159:0x0e84 A[Catch: all -> 0x0275, TryCatch #14 {all -> 0x0275, blocks: (B:10:0x0178, B:12:0x0185, B:13:0x01bc, B:25:0x0354, B:27:0x0361, B:28:0x039d, B:37:0x04fb, B:39:0x0508, B:41:0x0541, B:77:0x0830, B:79:0x0836, B:80:0x086d, B:131:0x0b9d, B:133:0x0baa, B:134:0x0bea, B:146:0x0d63, B:148:0x0d70, B:149:0x0db0, B:157:0x0e77, B:159:0x0e84, B:160:0x0ec9, B:166:0x0fb5, B:168:0x0fc2, B:169:0x1001, B:177:0x11a6, B:179:0x11b3, B:180:0x11f4, B:188:0x1288, B:190:0x1295, B:191:0x12d6, B:210:0x1551, B:212:0x155e, B:213:0x159a, B:232:0x1777, B:234:0x1784, B:235:0x17be, B:242:0x1884, B:244:0x188a, B:245:0x18bc, B:248:0x195c, B:250:0x196e, B:251:0x19a3, B:257:0x1a8d, B:259:0x1a9a, B:260:0x1ad9, B:263:0x1af1, B:265:0x1b08, B:266:0x1b46, B:321:0x2b6c, B:323:0x2b79, B:324:0x2bba, B:345:0x309e, B:347:0x30ab, B:349:0x30f5, B:360:0x3245, B:362:0x3252, B:364:0x3290, B:460:0x3888, B:462:0x3895, B:463:0x38cd, B:327:0x2bc6, B:329:0x2bde, B:330:0x2c21, B:278:0x2814, B:280:0x2821, B:282:0x2870, B:297:0x28f9, B:299:0x2906, B:301:0x2959, B:285:0x2887, B:287:0x2894, B:289:0x28da, B:196:0x13c0, B:198:0x13cd, B:199:0x140e, B:54:0x06be, B:56:0x06cb, B:57:0x0704, B:67:0x07b1, B:69:0x07be, B:70:0x0800, B:44:0x05ba, B:46:0x05c7, B:47:0x05f7), top: B:505:0x0178 }] */
        /* JADX WARN: Code duplicated, block: B:163:0x0f60  */
        /* JADX WARN: Code duplicated, block: B:164:0x0f74  */
        /* JADX WARN: Code duplicated, block: B:168:0x0fc2 A[Catch: all -> 0x0275, TryCatch #14 {all -> 0x0275, blocks: (B:10:0x0178, B:12:0x0185, B:13:0x01bc, B:25:0x0354, B:27:0x0361, B:28:0x039d, B:37:0x04fb, B:39:0x0508, B:41:0x0541, B:77:0x0830, B:79:0x0836, B:80:0x086d, B:131:0x0b9d, B:133:0x0baa, B:134:0x0bea, B:146:0x0d63, B:148:0x0d70, B:149:0x0db0, B:157:0x0e77, B:159:0x0e84, B:160:0x0ec9, B:166:0x0fb5, B:168:0x0fc2, B:169:0x1001, B:177:0x11a6, B:179:0x11b3, B:180:0x11f4, B:188:0x1288, B:190:0x1295, B:191:0x12d6, B:210:0x1551, B:212:0x155e, B:213:0x159a, B:232:0x1777, B:234:0x1784, B:235:0x17be, B:242:0x1884, B:244:0x188a, B:245:0x18bc, B:248:0x195c, B:250:0x196e, B:251:0x19a3, B:257:0x1a8d, B:259:0x1a9a, B:260:0x1ad9, B:263:0x1af1, B:265:0x1b08, B:266:0x1b46, B:321:0x2b6c, B:323:0x2b79, B:324:0x2bba, B:345:0x309e, B:347:0x30ab, B:349:0x30f5, B:360:0x3245, B:362:0x3252, B:364:0x3290, B:460:0x3888, B:462:0x3895, B:463:0x38cd, B:327:0x2bc6, B:329:0x2bde, B:330:0x2c21, B:278:0x2814, B:280:0x2821, B:282:0x2870, B:297:0x28f9, B:299:0x2906, B:301:0x2959, B:285:0x2887, B:287:0x2894, B:289:0x28da, B:196:0x13c0, B:198:0x13cd, B:199:0x140e, B:54:0x06be, B:56:0x06cb, B:57:0x0704, B:67:0x07b1, B:69:0x07be, B:70:0x0800, B:44:0x05ba, B:46:0x05c7, B:47:0x05f7), top: B:505:0x0178 }] */
        /* JADX WARN: Code duplicated, block: B:172:0x1048  */
        /* JADX WARN: Code duplicated, block: B:173:0x104b  */
        /* JADX WARN: Code duplicated, block: B:176:0x11a4  */
        /* JADX WARN: Code duplicated, block: B:179:0x11b3 A[Catch: all -> 0x0275, TryCatch #14 {all -> 0x0275, blocks: (B:10:0x0178, B:12:0x0185, B:13:0x01bc, B:25:0x0354, B:27:0x0361, B:28:0x039d, B:37:0x04fb, B:39:0x0508, B:41:0x0541, B:77:0x0830, B:79:0x0836, B:80:0x086d, B:131:0x0b9d, B:133:0x0baa, B:134:0x0bea, B:146:0x0d63, B:148:0x0d70, B:149:0x0db0, B:157:0x0e77, B:159:0x0e84, B:160:0x0ec9, B:166:0x0fb5, B:168:0x0fc2, B:169:0x1001, B:177:0x11a6, B:179:0x11b3, B:180:0x11f4, B:188:0x1288, B:190:0x1295, B:191:0x12d6, B:210:0x1551, B:212:0x155e, B:213:0x159a, B:232:0x1777, B:234:0x1784, B:235:0x17be, B:242:0x1884, B:244:0x188a, B:245:0x18bc, B:248:0x195c, B:250:0x196e, B:251:0x19a3, B:257:0x1a8d, B:259:0x1a9a, B:260:0x1ad9, B:263:0x1af1, B:265:0x1b08, B:266:0x1b46, B:321:0x2b6c, B:323:0x2b79, B:324:0x2bba, B:345:0x309e, B:347:0x30ab, B:349:0x30f5, B:360:0x3245, B:362:0x3252, B:364:0x3290, B:460:0x3888, B:462:0x3895, B:463:0x38cd, B:327:0x2bc6, B:329:0x2bde, B:330:0x2c21, B:278:0x2814, B:280:0x2821, B:282:0x2870, B:297:0x28f9, B:299:0x2906, B:301:0x2959, B:285:0x2887, B:287:0x2894, B:289:0x28da, B:196:0x13c0, B:198:0x13cd, B:199:0x140e, B:54:0x06be, B:56:0x06cb, B:57:0x0704, B:67:0x07b1, B:69:0x07be, B:70:0x0800, B:44:0x05ba, B:46:0x05c7, B:47:0x05f7), top: B:505:0x0178 }] */
        /* JADX WARN: Code duplicated, block: B:190:0x1295 A[Catch: all -> 0x0275, TryCatch #14 {all -> 0x0275, blocks: (B:10:0x0178, B:12:0x0185, B:13:0x01bc, B:25:0x0354, B:27:0x0361, B:28:0x039d, B:37:0x04fb, B:39:0x0508, B:41:0x0541, B:77:0x0830, B:79:0x0836, B:80:0x086d, B:131:0x0b9d, B:133:0x0baa, B:134:0x0bea, B:146:0x0d63, B:148:0x0d70, B:149:0x0db0, B:157:0x0e77, B:159:0x0e84, B:160:0x0ec9, B:166:0x0fb5, B:168:0x0fc2, B:169:0x1001, B:177:0x11a6, B:179:0x11b3, B:180:0x11f4, B:188:0x1288, B:190:0x1295, B:191:0x12d6, B:210:0x1551, B:212:0x155e, B:213:0x159a, B:232:0x1777, B:234:0x1784, B:235:0x17be, B:242:0x1884, B:244:0x188a, B:245:0x18bc, B:248:0x195c, B:250:0x196e, B:251:0x19a3, B:257:0x1a8d, B:259:0x1a9a, B:260:0x1ad9, B:263:0x1af1, B:265:0x1b08, B:266:0x1b46, B:321:0x2b6c, B:323:0x2b79, B:324:0x2bba, B:345:0x309e, B:347:0x30ab, B:349:0x30f5, B:360:0x3245, B:362:0x3252, B:364:0x3290, B:460:0x3888, B:462:0x3895, B:463:0x38cd, B:327:0x2bc6, B:329:0x2bde, B:330:0x2c21, B:278:0x2814, B:280:0x2821, B:282:0x2870, B:297:0x28f9, B:299:0x2906, B:301:0x2959, B:285:0x2887, B:287:0x2894, B:289:0x28da, B:196:0x13c0, B:198:0x13cd, B:199:0x140e, B:54:0x06be, B:56:0x06cb, B:57:0x0704, B:67:0x07b1, B:69:0x07be, B:70:0x0800, B:44:0x05ba, B:46:0x05c7, B:47:0x05f7), top: B:505:0x0178 }] */
        /* JADX WARN: Code duplicated, block: B:194:0x1361  */
        /* JADX WARN: Code duplicated, block: B:195:0x136e  */
        /* JADX WARN: Code duplicated, block: B:198:0x13cd A[Catch: all -> 0x0275, TryCatch #14 {all -> 0x0275, blocks: (B:10:0x0178, B:12:0x0185, B:13:0x01bc, B:25:0x0354, B:27:0x0361, B:28:0x039d, B:37:0x04fb, B:39:0x0508, B:41:0x0541, B:77:0x0830, B:79:0x0836, B:80:0x086d, B:131:0x0b9d, B:133:0x0baa, B:134:0x0bea, B:146:0x0d63, B:148:0x0d70, B:149:0x0db0, B:157:0x0e77, B:159:0x0e84, B:160:0x0ec9, B:166:0x0fb5, B:168:0x0fc2, B:169:0x1001, B:177:0x11a6, B:179:0x11b3, B:180:0x11f4, B:188:0x1288, B:190:0x1295, B:191:0x12d6, B:210:0x1551, B:212:0x155e, B:213:0x159a, B:232:0x1777, B:234:0x1784, B:235:0x17be, B:242:0x1884, B:244:0x188a, B:245:0x18bc, B:248:0x195c, B:250:0x196e, B:251:0x19a3, B:257:0x1a8d, B:259:0x1a9a, B:260:0x1ad9, B:263:0x1af1, B:265:0x1b08, B:266:0x1b46, B:321:0x2b6c, B:323:0x2b79, B:324:0x2bba, B:345:0x309e, B:347:0x30ab, B:349:0x30f5, B:360:0x3245, B:362:0x3252, B:364:0x3290, B:460:0x3888, B:462:0x3895, B:463:0x38cd, B:327:0x2bc6, B:329:0x2bde, B:330:0x2c21, B:278:0x2814, B:280:0x2821, B:282:0x2870, B:297:0x28f9, B:299:0x2906, B:301:0x2959, B:285:0x2887, B:287:0x2894, B:289:0x28da, B:196:0x13c0, B:198:0x13cd, B:199:0x140e, B:54:0x06be, B:56:0x06cb, B:57:0x0704, B:67:0x07b1, B:69:0x07be, B:70:0x0800, B:44:0x05ba, B:46:0x05c7, B:47:0x05f7), top: B:505:0x0178 }] */
        /* JADX WARN: Code duplicated, block: B:202:0x14b0  */
        /* JADX WARN: Code duplicated, block: B:203:0x14b7  */
        /* JADX WARN: Code duplicated, block: B:206:0x14cf  */
        /* JADX WARN: Code duplicated, block: B:209:0x154f  */
        /* JADX WARN: Code duplicated, block: B:212:0x155e A[Catch: all -> 0x0275, TryCatch #14 {all -> 0x0275, blocks: (B:10:0x0178, B:12:0x0185, B:13:0x01bc, B:25:0x0354, B:27:0x0361, B:28:0x039d, B:37:0x04fb, B:39:0x0508, B:41:0x0541, B:77:0x0830, B:79:0x0836, B:80:0x086d, B:131:0x0b9d, B:133:0x0baa, B:134:0x0bea, B:146:0x0d63, B:148:0x0d70, B:149:0x0db0, B:157:0x0e77, B:159:0x0e84, B:160:0x0ec9, B:166:0x0fb5, B:168:0x0fc2, B:169:0x1001, B:177:0x11a6, B:179:0x11b3, B:180:0x11f4, B:188:0x1288, B:190:0x1295, B:191:0x12d6, B:210:0x1551, B:212:0x155e, B:213:0x159a, B:232:0x1777, B:234:0x1784, B:235:0x17be, B:242:0x1884, B:244:0x188a, B:245:0x18bc, B:248:0x195c, B:250:0x196e, B:251:0x19a3, B:257:0x1a8d, B:259:0x1a9a, B:260:0x1ad9, B:263:0x1af1, B:265:0x1b08, B:266:0x1b46, B:321:0x2b6c, B:323:0x2b79, B:324:0x2bba, B:345:0x309e, B:347:0x30ab, B:349:0x30f5, B:360:0x3245, B:362:0x3252, B:364:0x3290, B:460:0x3888, B:462:0x3895, B:463:0x38cd, B:327:0x2bc6, B:329:0x2bde, B:330:0x2c21, B:278:0x2814, B:280:0x2821, B:282:0x2870, B:297:0x28f9, B:299:0x2906, B:301:0x2959, B:285:0x2887, B:287:0x2894, B:289:0x28da, B:196:0x13c0, B:198:0x13cd, B:199:0x140e, B:54:0x06be, B:56:0x06cb, B:57:0x0704, B:67:0x07b1, B:69:0x07be, B:70:0x0800, B:44:0x05ba, B:46:0x05c7, B:47:0x05f7), top: B:505:0x0178 }] */
        /* JADX WARN: Code duplicated, block: B:216:0x15fb  */
        /* JADX WARN: Code duplicated, block: B:219:0x1640  */
        /* JADX WARN: Code duplicated, block: B:223:0x16be  */
        /* JADX WARN: Code duplicated, block: B:224:0x16c9  */
        /* JADX WARN: Code duplicated, block: B:231:0x1775  */
        /* JADX WARN: Code duplicated, block: B:234:0x1784 A[Catch: all -> 0x0275, TryCatch #14 {all -> 0x0275, blocks: (B:10:0x0178, B:12:0x0185, B:13:0x01bc, B:25:0x0354, B:27:0x0361, B:28:0x039d, B:37:0x04fb, B:39:0x0508, B:41:0x0541, B:77:0x0830, B:79:0x0836, B:80:0x086d, B:131:0x0b9d, B:133:0x0baa, B:134:0x0bea, B:146:0x0d63, B:148:0x0d70, B:149:0x0db0, B:157:0x0e77, B:159:0x0e84, B:160:0x0ec9, B:166:0x0fb5, B:168:0x0fc2, B:169:0x1001, B:177:0x11a6, B:179:0x11b3, B:180:0x11f4, B:188:0x1288, B:190:0x1295, B:191:0x12d6, B:210:0x1551, B:212:0x155e, B:213:0x159a, B:232:0x1777, B:234:0x1784, B:235:0x17be, B:242:0x1884, B:244:0x188a, B:245:0x18bc, B:248:0x195c, B:250:0x196e, B:251:0x19a3, B:257:0x1a8d, B:259:0x1a9a, B:260:0x1ad9, B:263:0x1af1, B:265:0x1b08, B:266:0x1b46, B:321:0x2b6c, B:323:0x2b79, B:324:0x2bba, B:345:0x309e, B:347:0x30ab, B:349:0x30f5, B:360:0x3245, B:362:0x3252, B:364:0x3290, B:460:0x3888, B:462:0x3895, B:463:0x38cd, B:327:0x2bc6, B:329:0x2bde, B:330:0x2c21, B:278:0x2814, B:280:0x2821, B:282:0x2870, B:297:0x28f9, B:299:0x2906, B:301:0x2959, B:285:0x2887, B:287:0x2894, B:289:0x28da, B:196:0x13c0, B:198:0x13cd, B:199:0x140e, B:54:0x06be, B:56:0x06cb, B:57:0x0704, B:67:0x07b1, B:69:0x07be, B:70:0x0800, B:44:0x05ba, B:46:0x05c7, B:47:0x05f7), top: B:505:0x0178 }] */
        /* JADX WARN: Code duplicated, block: B:239:0x185e A[LOOP:5: B:230:0x1773->B:239:0x185e, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:244:0x188a A[Catch: all -> 0x0275, TryCatch #14 {all -> 0x0275, blocks: (B:10:0x0178, B:12:0x0185, B:13:0x01bc, B:25:0x0354, B:27:0x0361, B:28:0x039d, B:37:0x04fb, B:39:0x0508, B:41:0x0541, B:77:0x0830, B:79:0x0836, B:80:0x086d, B:131:0x0b9d, B:133:0x0baa, B:134:0x0bea, B:146:0x0d63, B:148:0x0d70, B:149:0x0db0, B:157:0x0e77, B:159:0x0e84, B:160:0x0ec9, B:166:0x0fb5, B:168:0x0fc2, B:169:0x1001, B:177:0x11a6, B:179:0x11b3, B:180:0x11f4, B:188:0x1288, B:190:0x1295, B:191:0x12d6, B:210:0x1551, B:212:0x155e, B:213:0x159a, B:232:0x1777, B:234:0x1784, B:235:0x17be, B:242:0x1884, B:244:0x188a, B:245:0x18bc, B:248:0x195c, B:250:0x196e, B:251:0x19a3, B:257:0x1a8d, B:259:0x1a9a, B:260:0x1ad9, B:263:0x1af1, B:265:0x1b08, B:266:0x1b46, B:321:0x2b6c, B:323:0x2b79, B:324:0x2bba, B:345:0x309e, B:347:0x30ab, B:349:0x30f5, B:360:0x3245, B:362:0x3252, B:364:0x3290, B:460:0x3888, B:462:0x3895, B:463:0x38cd, B:327:0x2bc6, B:329:0x2bde, B:330:0x2c21, B:278:0x2814, B:280:0x2821, B:282:0x2870, B:297:0x28f9, B:299:0x2906, B:301:0x2959, B:285:0x2887, B:287:0x2894, B:289:0x28da, B:196:0x13c0, B:198:0x13cd, B:199:0x140e, B:54:0x06be, B:56:0x06cb, B:57:0x0704, B:67:0x07b1, B:69:0x07be, B:70:0x0800, B:44:0x05ba, B:46:0x05c7, B:47:0x05f7), top: B:505:0x0178 }] */
        /* JADX WARN: Code duplicated, block: B:248:0x195c A[Catch: all -> 0x0275, TRY_ENTER, TryCatch #14 {all -> 0x0275, blocks: (B:10:0x0178, B:12:0x0185, B:13:0x01bc, B:25:0x0354, B:27:0x0361, B:28:0x039d, B:37:0x04fb, B:39:0x0508, B:41:0x0541, B:77:0x0830, B:79:0x0836, B:80:0x086d, B:131:0x0b9d, B:133:0x0baa, B:134:0x0bea, B:146:0x0d63, B:148:0x0d70, B:149:0x0db0, B:157:0x0e77, B:159:0x0e84, B:160:0x0ec9, B:166:0x0fb5, B:168:0x0fc2, B:169:0x1001, B:177:0x11a6, B:179:0x11b3, B:180:0x11f4, B:188:0x1288, B:190:0x1295, B:191:0x12d6, B:210:0x1551, B:212:0x155e, B:213:0x159a, B:232:0x1777, B:234:0x1784, B:235:0x17be, B:242:0x1884, B:244:0x188a, B:245:0x18bc, B:248:0x195c, B:250:0x196e, B:251:0x19a3, B:257:0x1a8d, B:259:0x1a9a, B:260:0x1ad9, B:263:0x1af1, B:265:0x1b08, B:266:0x1b46, B:321:0x2b6c, B:323:0x2b79, B:324:0x2bba, B:345:0x309e, B:347:0x30ab, B:349:0x30f5, B:360:0x3245, B:362:0x3252, B:364:0x3290, B:460:0x3888, B:462:0x3895, B:463:0x38cd, B:327:0x2bc6, B:329:0x2bde, B:330:0x2c21, B:278:0x2814, B:280:0x2821, B:282:0x2870, B:297:0x28f9, B:299:0x2906, B:301:0x2959, B:285:0x2887, B:287:0x2894, B:289:0x28da, B:196:0x13c0, B:198:0x13cd, B:199:0x140e, B:54:0x06be, B:56:0x06cb, B:57:0x0704, B:67:0x07b1, B:69:0x07be, B:70:0x0800, B:44:0x05ba, B:46:0x05c7, B:47:0x05f7), top: B:505:0x0178 }] */
        /* JADX WARN: Code duplicated, block: B:250:0x196e A[Catch: all -> 0x0275, TryCatch #14 {all -> 0x0275, blocks: (B:10:0x0178, B:12:0x0185, B:13:0x01bc, B:25:0x0354, B:27:0x0361, B:28:0x039d, B:37:0x04fb, B:39:0x0508, B:41:0x0541, B:77:0x0830, B:79:0x0836, B:80:0x086d, B:131:0x0b9d, B:133:0x0baa, B:134:0x0bea, B:146:0x0d63, B:148:0x0d70, B:149:0x0db0, B:157:0x0e77, B:159:0x0e84, B:160:0x0ec9, B:166:0x0fb5, B:168:0x0fc2, B:169:0x1001, B:177:0x11a6, B:179:0x11b3, B:180:0x11f4, B:188:0x1288, B:190:0x1295, B:191:0x12d6, B:210:0x1551, B:212:0x155e, B:213:0x159a, B:232:0x1777, B:234:0x1784, B:235:0x17be, B:242:0x1884, B:244:0x188a, B:245:0x18bc, B:248:0x195c, B:250:0x196e, B:251:0x19a3, B:257:0x1a8d, B:259:0x1a9a, B:260:0x1ad9, B:263:0x1af1, B:265:0x1b08, B:266:0x1b46, B:321:0x2b6c, B:323:0x2b79, B:324:0x2bba, B:345:0x309e, B:347:0x30ab, B:349:0x30f5, B:360:0x3245, B:362:0x3252, B:364:0x3290, B:460:0x3888, B:462:0x3895, B:463:0x38cd, B:327:0x2bc6, B:329:0x2bde, B:330:0x2c21, B:278:0x2814, B:280:0x2821, B:282:0x2870, B:297:0x28f9, B:299:0x2906, B:301:0x2959, B:285:0x2887, B:287:0x2894, B:289:0x28da, B:196:0x13c0, B:198:0x13cd, B:199:0x140e, B:54:0x06be, B:56:0x06cb, B:57:0x0704, B:67:0x07b1, B:69:0x07be, B:70:0x0800, B:44:0x05ba, B:46:0x05c7, B:47:0x05f7), top: B:505:0x0178 }] */
        /* JADX WARN: Code duplicated, block: B:254:0x1a3c  */
        /* JADX WARN: Code duplicated, block: B:255:0x1a4e  */
        /* JADX WARN: Code duplicated, block: B:259:0x1a9a A[Catch: all -> 0x0275, TryCatch #14 {all -> 0x0275, blocks: (B:10:0x0178, B:12:0x0185, B:13:0x01bc, B:25:0x0354, B:27:0x0361, B:28:0x039d, B:37:0x04fb, B:39:0x0508, B:41:0x0541, B:77:0x0830, B:79:0x0836, B:80:0x086d, B:131:0x0b9d, B:133:0x0baa, B:134:0x0bea, B:146:0x0d63, B:148:0x0d70, B:149:0x0db0, B:157:0x0e77, B:159:0x0e84, B:160:0x0ec9, B:166:0x0fb5, B:168:0x0fc2, B:169:0x1001, B:177:0x11a6, B:179:0x11b3, B:180:0x11f4, B:188:0x1288, B:190:0x1295, B:191:0x12d6, B:210:0x1551, B:212:0x155e, B:213:0x159a, B:232:0x1777, B:234:0x1784, B:235:0x17be, B:242:0x1884, B:244:0x188a, B:245:0x18bc, B:248:0x195c, B:250:0x196e, B:251:0x19a3, B:257:0x1a8d, B:259:0x1a9a, B:260:0x1ad9, B:263:0x1af1, B:265:0x1b08, B:266:0x1b46, B:321:0x2b6c, B:323:0x2b79, B:324:0x2bba, B:345:0x309e, B:347:0x30ab, B:349:0x30f5, B:360:0x3245, B:362:0x3252, B:364:0x3290, B:460:0x3888, B:462:0x3895, B:463:0x38cd, B:327:0x2bc6, B:329:0x2bde, B:330:0x2c21, B:278:0x2814, B:280:0x2821, B:282:0x2870, B:297:0x28f9, B:299:0x2906, B:301:0x2959, B:285:0x2887, B:287:0x2894, B:289:0x28da, B:196:0x13c0, B:198:0x13cd, B:199:0x140e, B:54:0x06be, B:56:0x06cb, B:57:0x0704, B:67:0x07b1, B:69:0x07be, B:70:0x0800, B:44:0x05ba, B:46:0x05c7, B:47:0x05f7), top: B:505:0x0178 }] */
        /* JADX WARN: Code duplicated, block: B:262:0x1ae2  */
        /* JADX WARN: Code duplicated, block: B:265:0x1b08 A[Catch: all -> 0x0275, TryCatch #14 {all -> 0x0275, blocks: (B:10:0x0178, B:12:0x0185, B:13:0x01bc, B:25:0x0354, B:27:0x0361, B:28:0x039d, B:37:0x04fb, B:39:0x0508, B:41:0x0541, B:77:0x0830, B:79:0x0836, B:80:0x086d, B:131:0x0b9d, B:133:0x0baa, B:134:0x0bea, B:146:0x0d63, B:148:0x0d70, B:149:0x0db0, B:157:0x0e77, B:159:0x0e84, B:160:0x0ec9, B:166:0x0fb5, B:168:0x0fc2, B:169:0x1001, B:177:0x11a6, B:179:0x11b3, B:180:0x11f4, B:188:0x1288, B:190:0x1295, B:191:0x12d6, B:210:0x1551, B:212:0x155e, B:213:0x159a, B:232:0x1777, B:234:0x1784, B:235:0x17be, B:242:0x1884, B:244:0x188a, B:245:0x18bc, B:248:0x195c, B:250:0x196e, B:251:0x19a3, B:257:0x1a8d, B:259:0x1a9a, B:260:0x1ad9, B:263:0x1af1, B:265:0x1b08, B:266:0x1b46, B:321:0x2b6c, B:323:0x2b79, B:324:0x2bba, B:345:0x309e, B:347:0x30ab, B:349:0x30f5, B:360:0x3245, B:362:0x3252, B:364:0x3290, B:460:0x3888, B:462:0x3895, B:463:0x38cd, B:327:0x2bc6, B:329:0x2bde, B:330:0x2c21, B:278:0x2814, B:280:0x2821, B:282:0x2870, B:297:0x28f9, B:299:0x2906, B:301:0x2959, B:285:0x2887, B:287:0x2894, B:289:0x28da, B:196:0x13c0, B:198:0x13cd, B:199:0x140e, B:54:0x06be, B:56:0x06cb, B:57:0x0704, B:67:0x07b1, B:69:0x07be, B:70:0x0800, B:44:0x05ba, B:46:0x05c7, B:47:0x05f7), top: B:505:0x0178 }] */
        /* JADX WARN: Code duplicated, block: B:269:0x1bda  */
        /* JADX WARN: Code duplicated, block: B:271:0x1be0  */
        /* JADX WARN: Code duplicated, block: B:275:0x2800  */
        /* JADX WARN: Code duplicated, block: B:277:0x280f  */
        /* JADX WARN: Code duplicated, block: B:280:0x2821 A[Catch: all -> 0x0275, TryCatch #14 {all -> 0x0275, blocks: (B:10:0x0178, B:12:0x0185, B:13:0x01bc, B:25:0x0354, B:27:0x0361, B:28:0x039d, B:37:0x04fb, B:39:0x0508, B:41:0x0541, B:77:0x0830, B:79:0x0836, B:80:0x086d, B:131:0x0b9d, B:133:0x0baa, B:134:0x0bea, B:146:0x0d63, B:148:0x0d70, B:149:0x0db0, B:157:0x0e77, B:159:0x0e84, B:160:0x0ec9, B:166:0x0fb5, B:168:0x0fc2, B:169:0x1001, B:177:0x11a6, B:179:0x11b3, B:180:0x11f4, B:188:0x1288, B:190:0x1295, B:191:0x12d6, B:210:0x1551, B:212:0x155e, B:213:0x159a, B:232:0x1777, B:234:0x1784, B:235:0x17be, B:242:0x1884, B:244:0x188a, B:245:0x18bc, B:248:0x195c, B:250:0x196e, B:251:0x19a3, B:257:0x1a8d, B:259:0x1a9a, B:260:0x1ad9, B:263:0x1af1, B:265:0x1b08, B:266:0x1b46, B:321:0x2b6c, B:323:0x2b79, B:324:0x2bba, B:345:0x309e, B:347:0x30ab, B:349:0x30f5, B:360:0x3245, B:362:0x3252, B:364:0x3290, B:460:0x3888, B:462:0x3895, B:463:0x38cd, B:327:0x2bc6, B:329:0x2bde, B:330:0x2c21, B:278:0x2814, B:280:0x2821, B:282:0x2870, B:297:0x28f9, B:299:0x2906, B:301:0x2959, B:285:0x2887, B:287:0x2894, B:289:0x28da, B:196:0x13c0, B:198:0x13cd, B:199:0x140e, B:54:0x06be, B:56:0x06cb, B:57:0x0704, B:67:0x07b1, B:69:0x07be, B:70:0x0800, B:44:0x05ba, B:46:0x05c7, B:47:0x05f7), top: B:505:0x0178 }] */
        /* JADX WARN: Code duplicated, block: B:281:0x286a  */
        /* JADX WARN: Code duplicated, block: B:284:0x287e  */
        /* JADX WARN: Code duplicated, block: B:287:0x2894 A[Catch: all -> 0x0275, TryCatch #14 {all -> 0x0275, blocks: (B:10:0x0178, B:12:0x0185, B:13:0x01bc, B:25:0x0354, B:27:0x0361, B:28:0x039d, B:37:0x04fb, B:39:0x0508, B:41:0x0541, B:77:0x0830, B:79:0x0836, B:80:0x086d, B:131:0x0b9d, B:133:0x0baa, B:134:0x0bea, B:146:0x0d63, B:148:0x0d70, B:149:0x0db0, B:157:0x0e77, B:159:0x0e84, B:160:0x0ec9, B:166:0x0fb5, B:168:0x0fc2, B:169:0x1001, B:177:0x11a6, B:179:0x11b3, B:180:0x11f4, B:188:0x1288, B:190:0x1295, B:191:0x12d6, B:210:0x1551, B:212:0x155e, B:213:0x159a, B:232:0x1777, B:234:0x1784, B:235:0x17be, B:242:0x1884, B:244:0x188a, B:245:0x18bc, B:248:0x195c, B:250:0x196e, B:251:0x19a3, B:257:0x1a8d, B:259:0x1a9a, B:260:0x1ad9, B:263:0x1af1, B:265:0x1b08, B:266:0x1b46, B:321:0x2b6c, B:323:0x2b79, B:324:0x2bba, B:345:0x309e, B:347:0x30ab, B:349:0x30f5, B:360:0x3245, B:362:0x3252, B:364:0x3290, B:460:0x3888, B:462:0x3895, B:463:0x38cd, B:327:0x2bc6, B:329:0x2bde, B:330:0x2c21, B:278:0x2814, B:280:0x2821, B:282:0x2870, B:297:0x28f9, B:299:0x2906, B:301:0x2959, B:285:0x2887, B:287:0x2894, B:289:0x28da, B:196:0x13c0, B:198:0x13cd, B:199:0x140e, B:54:0x06be, B:56:0x06cb, B:57:0x0704, B:67:0x07b1, B:69:0x07be, B:70:0x0800, B:44:0x05ba, B:46:0x05c7, B:47:0x05f7), top: B:505:0x0178 }] */
        /* JADX WARN: Code duplicated, block: B:288:0x28d8  */
        /* JADX WARN: Code duplicated, block: B:312:0x2a7d  */
        /* JADX WARN: Code duplicated, block: B:317:0x2afb  */
        /* JADX WARN: Code duplicated, block: B:318:0x2b10  */
        /* JADX WARN: Code duplicated, block: B:323:0x2b79 A[Catch: all -> 0x0275, TryCatch #14 {all -> 0x0275, blocks: (B:10:0x0178, B:12:0x0185, B:13:0x01bc, B:25:0x0354, B:27:0x0361, B:28:0x039d, B:37:0x04fb, B:39:0x0508, B:41:0x0541, B:77:0x0830, B:79:0x0836, B:80:0x086d, B:131:0x0b9d, B:133:0x0baa, B:134:0x0bea, B:146:0x0d63, B:148:0x0d70, B:149:0x0db0, B:157:0x0e77, B:159:0x0e84, B:160:0x0ec9, B:166:0x0fb5, B:168:0x0fc2, B:169:0x1001, B:177:0x11a6, B:179:0x11b3, B:180:0x11f4, B:188:0x1288, B:190:0x1295, B:191:0x12d6, B:210:0x1551, B:212:0x155e, B:213:0x159a, B:232:0x1777, B:234:0x1784, B:235:0x17be, B:242:0x1884, B:244:0x188a, B:245:0x18bc, B:248:0x195c, B:250:0x196e, B:251:0x19a3, B:257:0x1a8d, B:259:0x1a9a, B:260:0x1ad9, B:263:0x1af1, B:265:0x1b08, B:266:0x1b46, B:321:0x2b6c, B:323:0x2b79, B:324:0x2bba, B:345:0x309e, B:347:0x30ab, B:349:0x30f5, B:360:0x3245, B:362:0x3252, B:364:0x3290, B:460:0x3888, B:462:0x3895, B:463:0x38cd, B:327:0x2bc6, B:329:0x2bde, B:330:0x2c21, B:278:0x2814, B:280:0x2821, B:282:0x2870, B:297:0x28f9, B:299:0x2906, B:301:0x2959, B:285:0x2887, B:287:0x2894, B:289:0x28da, B:196:0x13c0, B:198:0x13cd, B:199:0x140e, B:54:0x06be, B:56:0x06cb, B:57:0x0704, B:67:0x07b1, B:69:0x07be, B:70:0x0800, B:44:0x05ba, B:46:0x05c7, B:47:0x05f7), top: B:505:0x0178 }] */
        /* JADX WARN: Code duplicated, block: B:326:0x2bc3  */
        /* JADX WARN: Code duplicated, block: B:327:0x2bc6 A[Catch: all -> 0x0275, TryCatch #14 {all -> 0x0275, blocks: (B:10:0x0178, B:12:0x0185, B:13:0x01bc, B:25:0x0354, B:27:0x0361, B:28:0x039d, B:37:0x04fb, B:39:0x0508, B:41:0x0541, B:77:0x0830, B:79:0x0836, B:80:0x086d, B:131:0x0b9d, B:133:0x0baa, B:134:0x0bea, B:146:0x0d63, B:148:0x0d70, B:149:0x0db0, B:157:0x0e77, B:159:0x0e84, B:160:0x0ec9, B:166:0x0fb5, B:168:0x0fc2, B:169:0x1001, B:177:0x11a6, B:179:0x11b3, B:180:0x11f4, B:188:0x1288, B:190:0x1295, B:191:0x12d6, B:210:0x1551, B:212:0x155e, B:213:0x159a, B:232:0x1777, B:234:0x1784, B:235:0x17be, B:242:0x1884, B:244:0x188a, B:245:0x18bc, B:248:0x195c, B:250:0x196e, B:251:0x19a3, B:257:0x1a8d, B:259:0x1a9a, B:260:0x1ad9, B:263:0x1af1, B:265:0x1b08, B:266:0x1b46, B:321:0x2b6c, B:323:0x2b79, B:324:0x2bba, B:345:0x309e, B:347:0x30ab, B:349:0x30f5, B:360:0x3245, B:362:0x3252, B:364:0x3290, B:460:0x3888, B:462:0x3895, B:463:0x38cd, B:327:0x2bc6, B:329:0x2bde, B:330:0x2c21, B:278:0x2814, B:280:0x2821, B:282:0x2870, B:297:0x28f9, B:299:0x2906, B:301:0x2959, B:285:0x2887, B:287:0x2894, B:289:0x28da, B:196:0x13c0, B:198:0x13cd, B:199:0x140e, B:54:0x06be, B:56:0x06cb, B:57:0x0704, B:67:0x07b1, B:69:0x07be, B:70:0x0800, B:44:0x05ba, B:46:0x05c7, B:47:0x05f7), top: B:505:0x0178 }] */
        /* JADX WARN: Code duplicated, block: B:329:0x2bde A[Catch: all -> 0x0275, TryCatch #14 {all -> 0x0275, blocks: (B:10:0x0178, B:12:0x0185, B:13:0x01bc, B:25:0x0354, B:27:0x0361, B:28:0x039d, B:37:0x04fb, B:39:0x0508, B:41:0x0541, B:77:0x0830, B:79:0x0836, B:80:0x086d, B:131:0x0b9d, B:133:0x0baa, B:134:0x0bea, B:146:0x0d63, B:148:0x0d70, B:149:0x0db0, B:157:0x0e77, B:159:0x0e84, B:160:0x0ec9, B:166:0x0fb5, B:168:0x0fc2, B:169:0x1001, B:177:0x11a6, B:179:0x11b3, B:180:0x11f4, B:188:0x1288, B:190:0x1295, B:191:0x12d6, B:210:0x1551, B:212:0x155e, B:213:0x159a, B:232:0x1777, B:234:0x1784, B:235:0x17be, B:242:0x1884, B:244:0x188a, B:245:0x18bc, B:248:0x195c, B:250:0x196e, B:251:0x19a3, B:257:0x1a8d, B:259:0x1a9a, B:260:0x1ad9, B:263:0x1af1, B:265:0x1b08, B:266:0x1b46, B:321:0x2b6c, B:323:0x2b79, B:324:0x2bba, B:345:0x309e, B:347:0x30ab, B:349:0x30f5, B:360:0x3245, B:362:0x3252, B:364:0x3290, B:460:0x3888, B:462:0x3895, B:463:0x38cd, B:327:0x2bc6, B:329:0x2bde, B:330:0x2c21, B:278:0x2814, B:280:0x2821, B:282:0x2870, B:297:0x28f9, B:299:0x2906, B:301:0x2959, B:285:0x2887, B:287:0x2894, B:289:0x28da, B:196:0x13c0, B:198:0x13cd, B:199:0x140e, B:54:0x06be, B:56:0x06cb, B:57:0x0704, B:67:0x07b1, B:69:0x07be, B:70:0x0800, B:44:0x05ba, B:46:0x05c7, B:47:0x05f7), top: B:505:0x0178 }] */
        /* JADX WARN: Code duplicated, block: B:334:0x2cc6  */
        /* JADX WARN: Code duplicated, block: B:336:0x2cd2  */
        /* JADX WARN: Code duplicated, block: B:339:0x2cdd  */
        /* JADX WARN: Code duplicated, block: B:342:0x2ce4  */
        /* JADX WARN: Code duplicated, block: B:344:0x309c  */
        /* JADX WARN: Code duplicated, block: B:347:0x30ab A[Catch: all -> 0x0275, TryCatch #14 {all -> 0x0275, blocks: (B:10:0x0178, B:12:0x0185, B:13:0x01bc, B:25:0x0354, B:27:0x0361, B:28:0x039d, B:37:0x04fb, B:39:0x0508, B:41:0x0541, B:77:0x0830, B:79:0x0836, B:80:0x086d, B:131:0x0b9d, B:133:0x0baa, B:134:0x0bea, B:146:0x0d63, B:148:0x0d70, B:149:0x0db0, B:157:0x0e77, B:159:0x0e84, B:160:0x0ec9, B:166:0x0fb5, B:168:0x0fc2, B:169:0x1001, B:177:0x11a6, B:179:0x11b3, B:180:0x11f4, B:188:0x1288, B:190:0x1295, B:191:0x12d6, B:210:0x1551, B:212:0x155e, B:213:0x159a, B:232:0x1777, B:234:0x1784, B:235:0x17be, B:242:0x1884, B:244:0x188a, B:245:0x18bc, B:248:0x195c, B:250:0x196e, B:251:0x19a3, B:257:0x1a8d, B:259:0x1a9a, B:260:0x1ad9, B:263:0x1af1, B:265:0x1b08, B:266:0x1b46, B:321:0x2b6c, B:323:0x2b79, B:324:0x2bba, B:345:0x309e, B:347:0x30ab, B:349:0x30f5, B:360:0x3245, B:362:0x3252, B:364:0x3290, B:460:0x3888, B:462:0x3895, B:463:0x38cd, B:327:0x2bc6, B:329:0x2bde, B:330:0x2c21, B:278:0x2814, B:280:0x2821, B:282:0x2870, B:297:0x28f9, B:299:0x2906, B:301:0x2959, B:285:0x2887, B:287:0x2894, B:289:0x28da, B:196:0x13c0, B:198:0x13cd, B:199:0x140e, B:54:0x06be, B:56:0x06cb, B:57:0x0704, B:67:0x07b1, B:69:0x07be, B:70:0x0800, B:44:0x05ba, B:46:0x05c7, B:47:0x05f7), top: B:505:0x0178 }] */
        /* JADX WARN: Code duplicated, block: B:348:0x30f3  */
        /* JADX WARN: Code duplicated, block: B:352:0x3169  */
        /* JADX WARN: Code duplicated, block: B:355:0x31c9  */
        /* JADX WARN: Code duplicated, block: B:358:0x3212  */
        /* JADX WARN: Code duplicated, block: B:360:0x3245 A[Catch: all -> 0x0275, TRY_ENTER, TryCatch #14 {all -> 0x0275, blocks: (B:10:0x0178, B:12:0x0185, B:13:0x01bc, B:25:0x0354, B:27:0x0361, B:28:0x039d, B:37:0x04fb, B:39:0x0508, B:41:0x0541, B:77:0x0830, B:79:0x0836, B:80:0x086d, B:131:0x0b9d, B:133:0x0baa, B:134:0x0bea, B:146:0x0d63, B:148:0x0d70, B:149:0x0db0, B:157:0x0e77, B:159:0x0e84, B:160:0x0ec9, B:166:0x0fb5, B:168:0x0fc2, B:169:0x1001, B:177:0x11a6, B:179:0x11b3, B:180:0x11f4, B:188:0x1288, B:190:0x1295, B:191:0x12d6, B:210:0x1551, B:212:0x155e, B:213:0x159a, B:232:0x1777, B:234:0x1784, B:235:0x17be, B:242:0x1884, B:244:0x188a, B:245:0x18bc, B:248:0x195c, B:250:0x196e, B:251:0x19a3, B:257:0x1a8d, B:259:0x1a9a, B:260:0x1ad9, B:263:0x1af1, B:265:0x1b08, B:266:0x1b46, B:321:0x2b6c, B:323:0x2b79, B:324:0x2bba, B:345:0x309e, B:347:0x30ab, B:349:0x30f5, B:360:0x3245, B:362:0x3252, B:364:0x3290, B:460:0x3888, B:462:0x3895, B:463:0x38cd, B:327:0x2bc6, B:329:0x2bde, B:330:0x2c21, B:278:0x2814, B:280:0x2821, B:282:0x2870, B:297:0x28f9, B:299:0x2906, B:301:0x2959, B:285:0x2887, B:287:0x2894, B:289:0x28da, B:196:0x13c0, B:198:0x13cd, B:199:0x140e, B:54:0x06be, B:56:0x06cb, B:57:0x0704, B:67:0x07b1, B:69:0x07be, B:70:0x0800, B:44:0x05ba, B:46:0x05c7, B:47:0x05f7), top: B:505:0x0178 }] */
        /* JADX WARN: Code duplicated, block: B:362:0x3252 A[Catch: all -> 0x0275, TryCatch #14 {all -> 0x0275, blocks: (B:10:0x0178, B:12:0x0185, B:13:0x01bc, B:25:0x0354, B:27:0x0361, B:28:0x039d, B:37:0x04fb, B:39:0x0508, B:41:0x0541, B:77:0x0830, B:79:0x0836, B:80:0x086d, B:131:0x0b9d, B:133:0x0baa, B:134:0x0bea, B:146:0x0d63, B:148:0x0d70, B:149:0x0db0, B:157:0x0e77, B:159:0x0e84, B:160:0x0ec9, B:166:0x0fb5, B:168:0x0fc2, B:169:0x1001, B:177:0x11a6, B:179:0x11b3, B:180:0x11f4, B:188:0x1288, B:190:0x1295, B:191:0x12d6, B:210:0x1551, B:212:0x155e, B:213:0x159a, B:232:0x1777, B:234:0x1784, B:235:0x17be, B:242:0x1884, B:244:0x188a, B:245:0x18bc, B:248:0x195c, B:250:0x196e, B:251:0x19a3, B:257:0x1a8d, B:259:0x1a9a, B:260:0x1ad9, B:263:0x1af1, B:265:0x1b08, B:266:0x1b46, B:321:0x2b6c, B:323:0x2b79, B:324:0x2bba, B:345:0x309e, B:347:0x30ab, B:349:0x30f5, B:360:0x3245, B:362:0x3252, B:364:0x3290, B:460:0x3888, B:462:0x3895, B:463:0x38cd, B:327:0x2bc6, B:329:0x2bde, B:330:0x2c21, B:278:0x2814, B:280:0x2821, B:282:0x2870, B:297:0x28f9, B:299:0x2906, B:301:0x2959, B:285:0x2887, B:287:0x2894, B:289:0x28da, B:196:0x13c0, B:198:0x13cd, B:199:0x140e, B:54:0x06be, B:56:0x06cb, B:57:0x0704, B:67:0x07b1, B:69:0x07be, B:70:0x0800, B:44:0x05ba, B:46:0x05c7, B:47:0x05f7), top: B:505:0x0178 }] */
        /* JADX WARN: Code duplicated, block: B:363:0x328e  */
        /* JADX WARN: Code duplicated, block: B:368:0x332f  */
        /* JADX WARN: Code duplicated, block: B:372:0x337e  */
        /* JADX WARN: Code duplicated, block: B:375:0x35b0  */
        /* JADX WARN: Code duplicated, block: B:377:0x35c0  */
        /* JADX WARN: Code duplicated, block: B:389:0x35ef  */
        /* JADX WARN: Code duplicated, block: B:391:0x35f2 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:394:0x35fc A[Catch: IOException -> 0x3680, all -> 0x3683, TryCatch #4 {all -> 0x3683, blocks: (B:384:0x35df, B:387:0x35e9, B:392:0x35f4, B:394:0x35fc, B:396:0x3609, B:400:0x3610, B:402:0x3627), top: B:491:0x35df }] */
        /* JADX WARN: Code duplicated, block: B:395:0x3607 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:396:0x3609 A[Catch: IOException -> 0x3680, all -> 0x3683, TryCatch #4 {all -> 0x3683, blocks: (B:384:0x35df, B:387:0x35e9, B:392:0x35f4, B:394:0x35fc, B:396:0x3609, B:400:0x3610, B:402:0x3627), top: B:491:0x35df }] */
        /* JADX WARN: Code duplicated, block: B:398:0x360d  */
        /* JADX WARN: Code duplicated, block: B:400:0x3610 A[Catch: IOException -> 0x3680, all -> 0x3683, TRY_LEAVE, TryCatch #4 {all -> 0x3683, blocks: (B:384:0x35df, B:387:0x35e9, B:392:0x35f4, B:394:0x35fc, B:396:0x3609, B:400:0x3610, B:402:0x3627), top: B:491:0x35df }] */
        /* JADX WARN: Code duplicated, block: B:405:0x3634 A[LOOP:12: B:399:0x360e->B:405:0x3634, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:408:0x364e  */
        /* JADX WARN: Code duplicated, block: B:414:0x3673  */
        /* JADX WARN: Code duplicated, block: B:415:0x3675  */
        /* JADX WARN: Code duplicated, block: B:448:0x3834  */
        /* JADX WARN: Code duplicated, block: B:449:0x383b  */
        /* JADX WARN: Code duplicated, block: B:462:0x3895 A[Catch: all -> 0x0275, TryCatch #14 {all -> 0x0275, blocks: (B:10:0x0178, B:12:0x0185, B:13:0x01bc, B:25:0x0354, B:27:0x0361, B:28:0x039d, B:37:0x04fb, B:39:0x0508, B:41:0x0541, B:77:0x0830, B:79:0x0836, B:80:0x086d, B:131:0x0b9d, B:133:0x0baa, B:134:0x0bea, B:146:0x0d63, B:148:0x0d70, B:149:0x0db0, B:157:0x0e77, B:159:0x0e84, B:160:0x0ec9, B:166:0x0fb5, B:168:0x0fc2, B:169:0x1001, B:177:0x11a6, B:179:0x11b3, B:180:0x11f4, B:188:0x1288, B:190:0x1295, B:191:0x12d6, B:210:0x1551, B:212:0x155e, B:213:0x159a, B:232:0x1777, B:234:0x1784, B:235:0x17be, B:242:0x1884, B:244:0x188a, B:245:0x18bc, B:248:0x195c, B:250:0x196e, B:251:0x19a3, B:257:0x1a8d, B:259:0x1a9a, B:260:0x1ad9, B:263:0x1af1, B:265:0x1b08, B:266:0x1b46, B:321:0x2b6c, B:323:0x2b79, B:324:0x2bba, B:345:0x309e, B:347:0x30ab, B:349:0x30f5, B:360:0x3245, B:362:0x3252, B:364:0x3290, B:460:0x3888, B:462:0x3895, B:463:0x38cd, B:327:0x2bc6, B:329:0x2bde, B:330:0x2c21, B:278:0x2814, B:280:0x2821, B:282:0x2870, B:297:0x28f9, B:299:0x2906, B:301:0x2959, B:285:0x2887, B:287:0x2894, B:289:0x28da, B:196:0x13c0, B:198:0x13cd, B:199:0x140e, B:54:0x06be, B:56:0x06cb, B:57:0x0704, B:67:0x07b1, B:69:0x07be, B:70:0x0800, B:44:0x05ba, B:46:0x05c7, B:47:0x05f7), top: B:505:0x0178 }] */
        /* JADX WARN: Code duplicated, block: B:465:0x3991  */
        /* JADX WARN: Code duplicated, block: B:468:0x3a18  */
        /* JADX WARN: Code duplicated, block: B:470:0x3a27  */
        /* JADX WARN: Code duplicated, block: B:487:0x35cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:496:0x36a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:511:0x373e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:518:0x0a2e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:524:0x0cbf A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:525:0x0ca2 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:527:0x120f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:530:0x170c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:531:0x1695 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:532:0x1695 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:533:0x16fc A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:534:0x16fc A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:535:0x186c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:536:0x1856 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:537:0x332c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:538:0x332c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:539:0x332c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:540:0x333e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:542:0x3331 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:543:0x367b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:544:0x36c6 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:545:0x35cb A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:546:0x36bb A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:548:0x36ab A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:549:0x36ab A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:550:0x366f A[EDGE_INSN: B:550:0x366f->B:412:0x366f BREAK  A[LOOP:9: B:386:0x35e8->B:411:0x365f], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:556:0x3648 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:557:0x3642 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:562:0x0aaa A[EDGE_INSN: B:562:0x0aaa->B:110:0x0aaa BREAK  A[LOOP:14: B:87:0x0a3d->B:109:0x0a9f], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:568:0x0a85 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:569:0x0a81 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:79:0x0836 A[Catch: all -> 0x0275, TryCatch #14 {all -> 0x0275, blocks: (B:10:0x0178, B:12:0x0185, B:13:0x01bc, B:25:0x0354, B:27:0x0361, B:28:0x039d, B:37:0x04fb, B:39:0x0508, B:41:0x0541, B:77:0x0830, B:79:0x0836, B:80:0x086d, B:131:0x0b9d, B:133:0x0baa, B:134:0x0bea, B:146:0x0d63, B:148:0x0d70, B:149:0x0db0, B:157:0x0e77, B:159:0x0e84, B:160:0x0ec9, B:166:0x0fb5, B:168:0x0fc2, B:169:0x1001, B:177:0x11a6, B:179:0x11b3, B:180:0x11f4, B:188:0x1288, B:190:0x1295, B:191:0x12d6, B:210:0x1551, B:212:0x155e, B:213:0x159a, B:232:0x1777, B:234:0x1784, B:235:0x17be, B:242:0x1884, B:244:0x188a, B:245:0x18bc, B:248:0x195c, B:250:0x196e, B:251:0x19a3, B:257:0x1a8d, B:259:0x1a9a, B:260:0x1ad9, B:263:0x1af1, B:265:0x1b08, B:266:0x1b46, B:321:0x2b6c, B:323:0x2b79, B:324:0x2bba, B:345:0x309e, B:347:0x30ab, B:349:0x30f5, B:360:0x3245, B:362:0x3252, B:364:0x3290, B:460:0x3888, B:462:0x3895, B:463:0x38cd, B:327:0x2bc6, B:329:0x2bde, B:330:0x2c21, B:278:0x2814, B:280:0x2821, B:282:0x2870, B:297:0x28f9, B:299:0x2906, B:301:0x2959, B:285:0x2887, B:287:0x2894, B:289:0x28da, B:196:0x13c0, B:198:0x13cd, B:199:0x140e, B:54:0x06be, B:56:0x06cb, B:57:0x0704, B:67:0x07b1, B:69:0x07be, B:70:0x0800, B:44:0x05ba, B:46:0x05c7, B:47:0x05f7), top: B:505:0x0178 }] */
        /* JADX WARN: Code duplicated, block: B:83:0x0a2b  */
        /* JADX WARN: Code duplicated, block: B:89:0x0a44  */
        /* JADX WARN: Code duplicated, block: B:94:0x0a4f A[Catch: all -> 0x0ab3, IOException -> 0x0ab7, TryCatch #22 {IOException -> 0x0ab7, all -> 0x0ab3, blocks: (B:86:0x0a3a, B:87:0x0a3d, B:92:0x0a49, B:94:0x0a4f, B:96:0x0a56, B:100:0x0a5d), top: B:516:0x0a3a }] */
        /* JADX WARN: Code duplicated, block: B:95:0x0a54 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:96:0x0a56 A[Catch: all -> 0x0ab3, IOException -> 0x0ab7, TryCatch #22 {IOException -> 0x0ab7, all -> 0x0ab3, blocks: (B:86:0x0a3a, B:87:0x0a3d, B:92:0x0a49, B:94:0x0a4f, B:96:0x0a56, B:100:0x0a5d), top: B:516:0x0a3a }] */
        /* JADX WARN: Code duplicated, block: B:98:0x0a5a  */
        public static Object[] b(Context context, int i, int i2, int i3) throws Throwable {
            int windowTouchSlop;
            int i4;
            int i5;
            char c;
            String str;
            int i6;
            String str2;
            String str3;
            int i7;
            int i8;
            long j;
            char c2;
            int i9;
            int i10;
            String str4;
            int i11;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            long j2;
            long j3;
            String str5;
            String str6;
            byte[] bytes;
            int length;
            Throwable th;
            BufferedInputStream bufferedInputStream;
            BufferedInputStream bufferedInputStream2;
            int i12;
            BufferedInputStream bufferedInputStream3;
            int i13;
            byte[] bArr;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            byte[] bArr2;
            int i19;
            int i20;
            int i21;
            String[] strArr;
            int i22;
            String str7;
            int i23;
            int i24;
            int i25;
            int i26;
            int i27;
            int i28;
            int i29;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            String str8;
            int i30;
            String str9;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
            long j4;
            int i31;
            int i32;
            int i33;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
            String lowerCase;
            Object[] objArr;
            int i34;
            int i35;
            String[] strArr2;
            int i36;
            int i37;
            int i38;
            int i39;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
            int i40;
            int i41;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8;
            int i42;
            int i43;
            String str10;
            int i44;
            int i45;
            int i46;
            int i47;
            String str11;
            String[] strArr3;
            int i48;
            int i49;
            int i50;
            int i51;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9;
            int i52;
            int i53;
            int i54;
            int i55;
            int i56;
            String[] strArr4;
            Object[] objArr2;
            int i57;
            int i58;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10;
            int i59;
            int i60;
            int i61;
            int i62;
            int i63;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11;
            Object objInvoke;
            String[][] strArr5;
            String str12;
            StringBuilder sb;
            int i64;
            int i65;
            int i66;
            int i67;
            int i68;
            Object[] objArr3;
            String[] strArr6;
            int i69;
            String[] strArr7;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12;
            String str13;
            int i70;
            int i71;
            int i72;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14;
            Object objInvoke2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15;
            int i73;
            int i74;
            String str14;
            String[] strArr8;
            String str15;
            char c3;
            String[][] strArr9;
            int i75;
            int i76;
            int i77;
            int i78;
            int i79;
            int i80;
            int i81;
            int i82;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16;
            Throwable th2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault17;
            int i83;
            int i84;
            String str16;
            String[] strArr10;
            int length2;
            int i85;
            int i86;
            byte[] bytes2;
            int length3;
            Throwable th3;
            BufferedInputStream bufferedInputStream4;
            String[][] strArr11;
            String[] strArr12;
            String str17;
            int i87;
            int i88;
            BufferedInputStream bufferedInputStream5;
            int i89;
            byte[] bArr3;
            int i90;
            int i91;
            boolean z;
            int i92;
            int i93;
            int i94;
            int i95;
            int i96;
            byte b2;
            int i97;
            int i98;
            int i99;
            int i100;
            int i101;
            String[] strArr13;
            int i102;
            int i103;
            String str18;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault18;
            int i104;
            long j5;
            int i105;
            int i106;
            int i107;
            Object[] objArr4;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault19;
            long j6;
            int i108;
            int iElapsedRealtime;
            int i109;
            int i110;
            int i111;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault20;
            int i112;
            int i113;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault21;
            String[] strArr14;
            int i114;
            int i115;
            String str19;
            String[] strArr15;
            int i116;
            int i117;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault22;
            String[] strArr16;
            long j7;
            int i118;
            int i119;
            int i120;
            int iTuitionPaymentFragmentbindingInflater1;
            int i121;
            int i122;
            int i123;
            int i124;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault23;
            String str20;
            Object[] objArr5;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault24;
            int i125;
            int i126;
            String[] strArr17;
            int i127;
            int i128;
            int elapsedCpuTime;
            int i129;
            String str21;
            int i130 = 2 % 2;
            String str22 = "";
            int i131 = 906 - (~(-TextUtils.lastIndexOf("", '0')));
            int i132 = 0;
            int i133 = -TextUtils.getOffsetBefore("", 0);
            int i134 = 1;
            Object[] objArr6 = new Object[1];
            a(i131, ((i133 | 8) << 1) - (i133 ^ 8), (char) (KeyEvent.getMaxKeyCode() >> 16), objArr6);
            String str23 = (String) objArr6[0];
            new ArrayList();
            int i135 = 4;
            String[] strArr18 = new String[4];
            int windowTouchSlop2 = ViewConfiguration.getWindowTouchSlop() >> 8;
            int iAlpha = Color.alpha(0) + 27;
            int i136 = -Gravity.getAbsoluteGravity(0, 0);
            Object[] objArr7 = new Object[1];
            a(windowTouchSlop2, iAlpha, (char) ((i136 & 21989) + (i136 | 21989)), objArr7);
            strArr18[0] = (String) objArr7[0];
            int i137 = -MotionEvent.axisFromString("");
            int i138 = (i137 & 26) + (i137 | 26);
            int modifierMetaStateMask = KeyEvent.getModifierMetaStateMask();
            int i139 = ~i;
            int i140 = ~((i139 ^ (-1511207405)) | (i139 & (-1511207405)));
            int i141 = -(-(((552094226 ^ i140) | (552094226 & i140)) * (-970)));
            int i142 = (((-1613009282) ^ i141) + (((-1613009282) & i141) << 1)) - (-1110605824);
            int i143 = ~((i139 ^ (-1511207405)) | ((-1511207405) & i139));
            int i144 = -(-((((-2063301631) ^ i143) | (i143 & (-2063301631))) * 970));
            int i145 = ((i142 | i144) << 1) - (i142 ^ i144);
            int iTuitionPaymentFragmentbindingInflater2 = zzo.TuitionPaymentFragmentbindingInflater1();
            int i146 = ~((1087545890 ^ iTuitionPaymentFragmentbindingInflater2) | (1087545890 & iTuitionPaymentFragmentbindingInflater2));
            int i147 = 362851364 - (~(((57249811 ^ i146) | (57249811 & i146)) * 191));
            int i148 = ~iTuitionPaymentFragmentbindingInflater2;
            int i149 = ~((i148 & 1087545890) | (i148 ^ 1087545890));
            if (i145 > i147 + (((53022737 ^ i149) | (i149 & 53022737)) * 191)) {
                Object[] objArr8 = new Object[1];
                a(i138, 26 >> ((byte) modifierMetaStateMask), (char) (20386 - Color.green(0)), objArr8);
                strArr18[1] = (String) objArr8[0];
                windowTouchSlop = ViewConfiguration.getWindowTouchSlop();
                c = 4;
                i4 = 12;
                i5 = 40;
            } else {
                byte b3 = (byte) modifierMetaStateMask;
                int i150 = (b3 & 26) + (b3 | 26);
                int i151 = -Color.green(0);
                Object[] objArr9 = new Object[1];
                a(i138, i150, (char) (((i151 | 30789) << 1) - (i151 ^ 30789)), objArr9);
                strArr18[1] = (String) objArr9[0];
                windowTouchSlop = ViewConfiguration.getWindowTouchSlop();
                i4 = 52;
                i5 = 8;
                c = 2;
            }
            int i152 = i4 + (windowTouchSlop >> i5);
            int i153 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
            Object[] objArr10 = new Object[1];
            a(i152, ((i153 | 17) << 1) - (i153 ^ 17), (char) (View.resolveSizeAndState(0, 0, 0) + 49765), objArr10);
            strArr18[c] = (String) objArr10[0];
            int i154 = -View.getDefaultSize(0, 0);
            int i155 = (i154 ^ 70) + ((i154 & 70) << 1);
            int i156 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            Object[] objArr11 = new Object[1];
            a(i155, ((i156 | 28) << 1) - (i156 ^ 28), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr11);
            strArr18[3] = (String) objArr11[0];
            int i157 = 0;
            while (true) {
                if (i157 >= i135) {
                    str = str22;
                    i6 = i;
                    break;
                }
                try {
                    Object[] objArr12 = {strArr18[i157]};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault25 == null) {
                        char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                        int i158 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 992;
                        int capsMode = 8 - TextUtils.getCapsMode(str22, i132, i132);
                        byte b4 = (byte) i132;
                        Object[] objArr13 = new Object[i134];
                        c(b4, (byte) (b4 | 6), b4, objArr13);
                        String str24 = (String) objArr13[i132];
                        Class[] clsArr = new Class[i134];
                        clsArr[i132] = String.class;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault25 = initSession.b(packedPositionType, i158, capsMode, 349342683, false, str24, clsArr);
                    }
                    long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault25).invoke(null, objArr12)).longValue();
                    long j8 = 250285931;
                    String[] strArr19 = strArr18;
                    long j9 = -751;
                    long j10 = -1;
                    long j11 = j8 ^ j10;
                    long j12 = jLongValue ^ j10;
                    long j13 = i;
                    str = str22;
                    long j14 = j11 | jLongValue;
                    long j15 = (j9 * j8) + (j9 * jLongValue) + (((long) 1504) * (((j11 | j12) ^ j10) | ((j11 | j13) ^ j10))) + (((long) (-1504)) * ((j14 | j13) ^ j10)) + (((long) 752) * ((j10 ^ (j12 | j8)) | (j14 ^ j10))) + ((long) (-1097364536));
                    int i159 = ((int) (j15 >> 32)) & ((-244724542) + (((~((-378246149) | i139)) | (-1058980263) | (~(378246148 | i))) * (-564)) + ((~((-689193379) | i)) * 1128) + (((~((-1058980263) | i139)) | (-1067439527)) * 564));
                    int i160 = ((int) j15) & (((((~(982161874 | i)) | 563421701) * 398) - 252318567) + (((~(982161874 | i139)) | 563421701) * 398));
                    if (((i160 & i159) | (i159 ^ i160)) != 0) {
                        int i161 = i157 + 190;
                        i6 = (~(i & i161)) & (i | i161);
                        break;
                    }
                    i157++;
                    str22 = str;
                    strArr18 = strArr19;
                    i132 = 0;
                    i135 = 4;
                    i134 = 1;
                } catch (Throwable th4) {
                    Throwable cause = th4.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th4;
                }
            }
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L);
            int iTuitionPaymentFragmentbindingInflater3 = zzo.TuitionPaymentFragmentbindingInflater1();
            int i162 = ~packedPositionGroup;
            int i163 = ~((i162 ^ 98) | (i162 & 98));
            int i164 = ~(((-99) ^ packedPositionGroup) | ((-99) & packedPositionGroup));
            int i165 = (i163 & i164) | (i163 ^ i164);
            int i166 = ~(((-99) ^ iTuitionPaymentFragmentbindingInflater3) | ((-99) & iTuitionPaymentFragmentbindingInflater3));
            int i167 = ((((packedPositionGroup * (-523)) + 25774) + (((i165 & i166) | (i165 ^ i166)) * 262)) - (~((~((-99) | packedPositionGroup)) * (-786)))) - 1;
            int i168 = ~((~iTuitionPaymentFragmentbindingInflater3) | (-99));
            int i169 = ~(i162 | 98);
            int i170 = (i168 & i169) | (i168 ^ i169);
            int i171 = ~(packedPositionGroup | (-99));
            int i172 = ((i171 & i170) | (i170 ^ i171)) * 262;
            Object[] objArr14 = new Object[1];
            a((i167 ^ i172) + ((i172 & i167) << 1), 12 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (0 - (~Process.getGidForName(str))), objArr14);
            String str25 = (String) objArr14[0];
            int i173 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int i174 = ((i173 | 110) << 1) - (i173 ^ 110);
            int i175 = -(-(ViewConfiguration.getMaximumFlingVelocity() >> 16));
            int threadPriority = Process.getThreadPriority(0);
            Object[] objArr15 = new Object[1];
            a(i174, ((i175 | 13) << 1) - (i175 ^ 13), (char) (((threadPriority & 20) + (threadPriority | 20)) >> 6), objArr15);
            String str26 = (String) objArr15[0];
            int i176 = -(-(ViewConfiguration.getScrollDefaultDelay() >> 16));
            int i177 = (i176 & 123) + (i176 | 123);
            int i178 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
            Object[] objArr16 = new Object[1];
            a(i177, (i178 ^ 18) + ((i178 & 18) << 1), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr16);
            String[] strArr20 = {str25, str26, (String) objArr16[0]};
            int i179 = 0;
            while (true) {
                if (i179 >= 3) {
                    str2 = str23;
                    str3 = str;
                    i7 = i6;
                    i8 = i;
                    break;
                }
                Object[] objArr17 = {strArr20[i179]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault26 == null) {
                    char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                    int scrollDefaultDelay = 993 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int iRed = 8 - Color.red(0);
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    Object[] objArr18 = new Object[1];
                    c(b5, b6, b6, objArr18);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault26 = initSession.b(cMakeMeasureSpec, scrollDefaultDelay, iRed, -545305915, false, (String) objArr18[0], new Class[]{String.class});
                }
                long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault26).invoke(null, objArr17)).longValue();
                long j16 = 450923644;
                int i180 = i6;
                String[] strArr21 = strArr20;
                str2 = str23;
                long j17 = -712;
                int i181 = i179;
                long j18 = -1;
                long j19 = jLongValue2 ^ j18;
                str3 = str;
                long j20 = i;
                long j21 = j20 ^ j18;
                long j22 = (j21 | j16) ^ j18;
                long j23 = (((long) (-711)) * j16) + (((long) 713) * jLongValue2) + ((((j19 | j16) ^ j18) | j22) * j17) + (j17 * ((((j19 | j21) | j16) ^ j18) | (j18 ^ ((jLongValue2 | j16) | j20)))) + (((long) 712) * (j19 | j22)) + ((long) 169535640);
                int i182 = ((int) (j23 >> 32)) & ((-90359670) + (((-1049601) | i139) * 184) + (((~(1296967894 | i139)) | (-1158808579)) * 184));
                int i183 = ~((-1619683583) | i139);
                if (((((int) j23) & (1786736941 + ((8388692 | i183) * (-712)) + (((~((-8388693) | i139)) | (~((-1611294891) | i))) * (-712)) + ((i183 | (-182457173)) * 712))) | i182) != 0) {
                    int i184 = ((i181 | 270) << 1) - (i181 ^ 270);
                    i8 = ((~i184) & i) | (i184 & i139);
                    i7 = i180;
                    break;
                }
                int i185 = (i181 & 116) + (i181 | 116);
                i179 = ((i185 | (-115)) << 1) - (i185 ^ (-115));
                i6 = i180;
                strArr20 = strArr21;
                str23 = str2;
                str = str3;
            }
            int i186 = ((~i7) & i) | (i7 & i139);
            int i187 = -i186;
            int i188 = ((i186 & i187) | (i186 ^ i187)) >> 31;
            int i189 = i8 & (~i188);
            int i190 = i7 & i188;
            int i191 = (i189 & i190) | (i189 ^ i190);
            int i192 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int i193 = (i192 & 140) + (i192 | 140);
            int i194 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
            int i195 = ((i194 | 14) << 1) - (i194 ^ 14);
            int iAlpha2 = Color.alpha(0);
            int iTuitionPaymentFragmentbindingInflater4 = zzo.TuitionPaymentFragmentbindingInflater1();
            int i196 = ~((~iTuitionPaymentFragmentbindingInflater4) | 36350);
            int i197 = (((iAlpha2 * 522) - 18902000) - (~(-(-(((i196 & iAlpha2) | (iAlpha2 ^ i196)) * (-1042)))))) - 1;
            int i198 = ((iTuitionPaymentFragmentbindingInflater4 ^ 36350) | (iTuitionPaymentFragmentbindingInflater4 & 36350)) * 521;
            int i199 = (i197 & i198) + (i197 | i198);
            int i200 = ~iAlpha2;
            int i201 = ~(((-36351) & i200) | (i200 ^ (-36351)));
            int i202 = ~((i200 & iTuitionPaymentFragmentbindingInflater4) | (i200 ^ iTuitionPaymentFragmentbindingInflater4));
            int i203 = (i201 ^ i202) | (i202 & i201);
            int i204 = ~iTuitionPaymentFragmentbindingInflater4;
            int i205 = TuitionPaymentFragmentbindingInflater1 + 91;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i205 % 128;
            if (i205 % 2 == 0) {
                int i206 = (i204 & iAlpha2) | (i204 ^ iAlpha2);
                int i207 = ~((i206 & 36350) | (i206 ^ 36350));
                Object[] objArr19 = new Object[1];
                a(i193, i195, (char) (i199 * ((i207 & i203) | (i203 ^ i207)) * 521), objArr19);
                Object[] objArr20 = {(String) objArr19[0]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault27 == null) {
                    char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int iCombineMeasuredStates = 993 - View.combineMeasuredStates(0, 0);
                    str21 = str3;
                    int iIndexOf = TextUtils.indexOf(str21, str21) + 8;
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    Object[] objArr21 = new Object[1];
                    c(b7, b8, b8, objArr21);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault27 = initSession.b(maximumFlingVelocity, iCombineMeasuredStates, iIndexOf, -545305915, false, (String) objArr21[0], new Class[]{String.class});
                } else {
                    str21 = str3;
                }
                long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault27).invoke(null, objArr20)).longValue();
                long j24 = -197381064;
                long j25 = 628;
                long j26 = (j25 * j24) + (j25 * jLongValue3);
                long j27 = -627;
                long jNextInt = new Random().nextInt(908190407);
                str3 = str21;
                long j28 = -1;
                j = j26 + ((jLongValue3 | jNextInt | (j24 ^ j28)) * j27) + (j27 * (j24 | (((jLongValue3 ^ j28) | jNextInt) ^ j28))) + (((long) 627) * (((jNextInt | j24) ^ j28) | (((jNextInt ^ j28) | jLongValue3) ^ j28))) + ((long) 817840348);
                c2 = 'q';
            } else {
                int i208 = i204 | iAlpha2;
                int i209 = ~((i208 & 36350) | (i208 ^ 36350));
                Object[] objArr22 = new Object[1];
                a(i193, i195, (char) (i199 + (((i209 & i203) | (i203 ^ i209)) * 521)), objArr22);
                Object[] objArr23 = {(String) objArr22[0]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault28 == null) {
                    char packedPositionType2 = (char) ExpandableListView.getPackedPositionType(0L);
                    int size = 993 - View.MeasureSpec.getSize(0);
                    int iRed2 = 8 - Color.red(0);
                    byte b9 = (byte) 0;
                    byte b10 = b9;
                    Object[] objArr24 = new Object[1];
                    c(b9, b10, b10, objArr24);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault28 = initSession.b(packedPositionType2, size, iRed2, -545305915, false, (String) objArr24[0], new Class[]{String.class});
                }
                long jLongValue4 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault28).invoke(null, objArr23)).longValue();
                long j29 = -424494796;
                long j30 = -1;
                long j31 = j29 ^ j30;
                long j32 = i;
                long j33 = 283;
                long j34 = jLongValue4 ^ j30;
                j = (((long) 284) * j29) + (((long) (-282)) * jLongValue4) + (((long) (-283)) * (((j31 | jLongValue4) ^ j30) | ((j31 | j32) ^ j30))) + (((j34 | j29) ^ j30) * j33) + (j33 * ((j32 | (j31 | j34)) ^ j30)) + ((long) 1044954080);
                c2 = ' ';
            }
            int i210 = ~(i139 | 419824548);
            if (((((int) (j >> c2)) & (1710511674 + ((614486018 | i210) * (-712)) + (((~(i139 | (-614486019))) | (~(1034310566 | i))) * (-712)) + ((i210 | (-1017401863)) * 712))) | (((int) j) & ((-213240777) + (((-806932577) | i139) * (-490)) + (((~((-941150693) | i)) | 134218116) * 490) + 1468642764))) == 0) {
                int scrollBarFadeDuration = ViewConfiguration.getScrollBarFadeDuration() >> 16;
                int i211 = ((scrollBarFadeDuration | ModuleDescriptor.MODULE_VERSION) << 1) - (scrollBarFadeDuration ^ ModuleDescriptor.MODULE_VERSION);
                int i212 = -Color.alpha(0);
                Object[] objArr25 = new Object[1];
                a(i211, (i212 & 24) + (i212 | 24), (char) Color.red(0), objArr25);
                Object[] objArr26 = {(String) objArr25[0]};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault29 == null) {
                    char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 33602);
                    int doubleTapTimeout = 3085 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int iKeyCodeFromString = 26 - KeyEvent.keyCodeFromString(str3);
                    byte b11 = (byte) 0;
                    byte b12 = (byte) (b11 + 5);
                    Object[] objArr27 = new Object[1];
                    c(b11, b12, (byte) (b12 - 5), objArr27);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault29 = initSession.b(cNormalizeMetaState, doubleTapTimeout, iKeyCodeFromString, 1411172903, false, (String) objArr27[0], new Class[]{String.class});
                }
                String str27 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault29).invoke(null, objArr26);
                if (str27 == null || str27.isEmpty()) {
                    int i213 = -ExpandableListView.getPackedPositionChild(0L);
                    int i214 = (i213 * 765) - 271806;
                    int i215 = ((~((i139 ^ i213) | (i139 & i213))) | 178) * 764;
                    int i216 = (i214 & i215) + (i214 | i215);
                    int i217 = ~i213;
                    int i218 = ~((i217 & 178) | (i217 ^ 178));
                    i9 = i139;
                    int i219 = ((~(i9 | 178)) | i218) * (-1528);
                    int i220 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i221 = (i220 & 59) + (i220 | 59);
                    TuitionPaymentFragmentbindingInflater1 = i221 % 128;
                    if (i221 % 2 != 0) {
                        int i222 = -(-i219);
                        i10 = (i216 & i222) + (i216 | i222);
                    } else {
                        int i223 = -(-i219);
                        i10 = (i216 & i223) + (i223 | i216);
                        i218 = ~((~i213) | 178);
                    }
                    int i224 = ~(((-179) & i213) | ((-179) ^ i213));
                    int i225 = (i218 & i224) | (i218 ^ i224);
                    int i226 = ~(i213 | i9);
                    int i227 = (i10 - (~(-(-(764 * ((i226 & i225) | (i225 ^ i226))))))) - 1;
                    int i228 = (i220 ^ 29) + ((i220 & 29) << 1);
                    TuitionPaymentFragmentbindingInflater1 = i228 % 128;
                    int i229 = i228 % 2;
                    str4 = str3;
                    int i230 = -TextUtils.indexOf(str4, str4, 0);
                    int i231 = -(-ImageFormat.getBitsPerPixel(0));
                    Object[] objArr28 = new Object[1];
                    a(i227, ((24 | i230) << 1) - (i230 ^ 24), (char) ((i231 ^ 17407) + ((i231 & 17407) << 1)), objArr28);
                    Object[] objArr29 = {(String) objArr28[0]};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault30 == null) {
                        char modifierMetaStateMask2 = (char) (33601 - ((byte) KeyEvent.getModifierMetaStateMask()));
                        int modifierMetaStateMask3 = ((byte) KeyEvent.getModifierMetaStateMask()) + 3086;
                        int iIndexOf2 = 25 - TextUtils.indexOf((CharSequence) str4, '0');
                        byte b13 = (byte) 0;
                        byte b14 = (byte) (b13 + 5);
                        Object[] objArr30 = new Object[1];
                        c(b13, b14, (byte) (b14 - 5), objArr30);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault30 = initSession.b(modifierMetaStateMask2, modifierMetaStateMask3, iIndexOf2, 1411172903, false, (String) objArr30[0], new Class[]{String.class});
                    }
                    String str28 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault30).invoke(null, objArr29);
                    i11 = (str28 == null || str28.isEmpty()) ? i : (i & (-268)) | (i9 & 267);
                } else {
                    i11 = (~(i & 267)) & (i | 267);
                }
                int i232 = (~(i & i191)) & (i | i191);
                int i233 = -i232;
                int i234 = ((i232 & i233) | (i232 ^ i233)) >> 31;
                int i235 = i11 & (~i234);
                int i236 = i191 & i234;
                int i237 = (i235 & i236) | (i235 ^ i236);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2061288340);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cLastIndexOf = (char) (56826 - TextUtils.lastIndexOf(str4, '0'));
                    int offsetBefore = 2814 - TextUtils.getOffsetBefore(str4, 0);
                    int mode = 9 - View.MeasureSpec.getMode(0);
                    byte b15 = (byte) 0;
                    byte b16 = (byte) (b15 + 5);
                    Object[] objArr31 = new Object[1];
                    c(b15, b16, (byte) (b16 - 5), objArr31);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, offsetBefore, mode, -1639816125, false, (String) objArr31[0], new Class[0]);
                }
                long jLongValue5 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
                long j35 = 1573975069;
                long j36 = (((long) 659) * j35) + (((long) (-657)) * jLongValue5);
                String str29 = str4;
                j2 = -1;
                long j37 = ((j35 ^ j2) | jLongValue5) ^ j2;
                long j38 = ((jLongValue5 ^ j2) | j35) ^ j2;
                j3 = i;
                long j39 = (j35 | j3) ^ j2;
                long j40 = 658;
                long j41 = j36 + (((long) (-658)) * (j37 | j38 | j39)) + (j40 * j38) + (j40 * (j38 | j39)) + ((long) 539381437);
                int i238 = ((int) (j41 >> 32)) & ((-896491846) + (((~(i9 | (-1438996339))) | (-1418744547)) * (-1042)) + (((-1438996339) | i) * 521) + (((~(1418744546 | i)) | (-1440045043) | (~((-1417695843) | i9))) * 521));
                int i239 = ((int) j41) & (((((~(2147416055 | i)) | 19439617) * TypedValues.PositionType.TYPE_TRANSITION_EASING) - 472919880) + ((~(2147416055 | i9)) * TypedValues.PositionType.TYPE_TRANSITION_EASING));
                int i240 = (i238 & i239) | (i238 ^ i239);
                int i241 = i240 - 1;
                int i242 = -i240;
                int i243 = ((i240 & i242) | (i240 ^ i242)) >> 31;
                int i244 = (~i243) & i;
                int i245 = i243 & (i ^ ((i241 & 200) + (i241 | 200)));
                int i246 = (i245 & i244) | (i244 ^ i245);
                int i247 = ((~i237) & i) | (i237 & i9);
                int i248 = -i247;
                int i249 = ((i247 & i248) | (i247 ^ i248)) >> 31;
                int i250 = (i246 & (~i249)) | (i237 & i249);
                str5 = str29;
                int i251 = 201 - (~(-TextUtils.lastIndexOf(str5, '0', 0, 0)));
                int offsetAfter = TextUtils.getOffsetAfter(str5, 0);
                int i252 = (offsetAfter & 20) + (offsetAfter | 20);
                int i253 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                Object[] objArr32 = new Object[1];
                a(i251, i252, (char) ((i253 & 61859) + (i253 | 61859)), objArr32);
                str6 = (String) objArr32[0];
                int iAxisFromString = MotionEvent.axisFromString(str5);
                int iTuitionPaymentFragmentbindingInflater5 = zzo.TuitionPaymentFragmentbindingInflater1();
                int i254 = (iAxisFromString * 371) + 83104;
                int i255 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
                TuitionPaymentFragmentbindingInflater1 = i255 % 128;
                int i256 = i255 % 2;
                int i257 = ~iTuitionPaymentFragmentbindingInflater5;
                int i258 = ~(((-225) ^ i257) | ((-225) & i257));
                int i259 = ~iAxisFromString;
                int i260 = ~((i259 ^ iTuitionPaymentFragmentbindingInflater5) | (i259 & iTuitionPaymentFragmentbindingInflater5));
                int i261 = -(-((-370) * ((i260 & i258) | (i258 ^ i260))));
                int i262 = ((i254 | i261) << 1) - (i261 ^ i254);
                int i263 = (~(i259 | i257)) | (~(((-225) & iTuitionPaymentFragmentbindingInflater5) | ((-225) ^ iTuitionPaymentFragmentbindingInflater5)));
                int i264 = (iAxisFromString ^ 224) | (iAxisFromString & 224);
                int i265 = ~i264;
                int i266 = i262 + (((i263 & i265) | (i263 ^ i265)) * (-370));
                int i267 = -(-((~i264) * 370));
                int i268 = (i266 ^ i267) + ((i267 & i266) << 1);
                int scrollDefaultDelay2 = ViewConfiguration.getScrollDefaultDelay() >> 16;
                int iTuitionPaymentFragmentbindingInflater6 = zzo.TuitionPaymentFragmentbindingInflater1();
                int i269 = ~scrollDefaultDelay2;
                int i270 = (((scrollDefaultDelay2 * (-344)) - 2064) - (~(((~((i269 ^ (-7)) | (i269 & (-7)))) | (~(i269 | iTuitionPaymentFragmentbindingInflater6))) * 345))) - 1;
                int i271 = ~scrollDefaultDelay2;
                int i272 = ~iTuitionPaymentFragmentbindingInflater6;
                int i273 = ~((i271 ^ i272) | (i271 & i272));
                int i274 = ~(((-7) ^ scrollDefaultDelay2) | (scrollDefaultDelay2 & (-7)));
                int i275 = ((i274 & i273) | (i273 ^ i274)) * 345;
                int i276 = ((i270 | i275) << 1) - (i275 ^ i270);
                int i277 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i278 = (i277 & 115) + (i277 | 115);
                TuitionPaymentFragmentbindingInflater1 = i278 % 128;
                int i279 = i278 % 2;
                int i280 = (i269 ^ (-7)) | (i269 & (-7));
                int i281 = 345 * (~((i280 & iTuitionPaymentFragmentbindingInflater6) | (i280 ^ iTuitionPaymentFragmentbindingInflater6)));
                int i282 = -(-Color.rgb(0, 0, 0));
                Object[] objArr33 = new Object[1];
                a(i268, (i276 ^ i281) + ((i281 & i276) << 1), (char) ((i282 & 16833729) + (i282 | 16833729)), objArr33);
                bytes = ((String) objArr33[0]).getBytes();
                length = bytes.length;
                if (length == 0) {
                    i12 = 1;
                } else {
                    try {
                        bufferedInputStream3 = new BufferedInputStream(new FileInputStream(str6));
                        i13 = 4096;
                        try {
                            bArr = new byte[4096];
                            i14 = 0;
                            while (true) {
                                i15 = bufferedInputStream3.read(bArr, 0, i13);
                                if (i15 > 0) {
                                    break;
                                }
                                i16 = 0;
                                while (i14 < length && i16 < i15) {
                                    if (bArr[i16] == bytes[i14]) {
                                        i14++;
                                    } else {
                                        if (i14 != 0) {
                                            i17 = i14 - 1;
                                            while (true) {
                                                if (i17 > 0) {
                                                    bArr = bArr;
                                                    i14 = 0;
                                                    break;
                                                }
                                                i18 = 0;
                                                while (true) {
                                                    if (i18 < i17) {
                                                        bArr = bArr;
                                                        i14 = i17;
                                                        break;
                                                    }
                                                    bArr2 = bArr;
                                                    int i283 = i14 - i17;
                                                    i19 = (i283 ^ i18) + ((i283 & i18) << 1);
                                                    i20 = i14;
                                                    if (bytes[i18] != bytes[i19]) {
                                                        break;
                                                    }
                                                    i18++;
                                                    bArr = bArr2;
                                                    i14 = i20;
                                                }
                                                i17--;
                                                bArr = bArr2;
                                                i14 = i20;
                                            }
                                        }
                                        bArr = bArr;
                                    }
                                    int i284 = (i16 ^ (-85)) + ((i16 & (-85)) << 1);
                                    i16 = (i284 & 86) + (i284 | 86);
                                    bArr = bArr;
                                }
                                bArr = bArr;
                                i14 = i14;
                                i13 = 4096;
                            }
                            if (i14 == length) {
                                i12 = 1;
                            } else {
                                i12 = 0;
                            }
                            try {
                                bufferedInputStream3.close();
                            } catch (IOException unused) {
                            }
                        } catch (IOException unused2) {
                            bufferedInputStream2 = bufferedInputStream3;
                            if (bufferedInputStream2 != null) {
                                try {
                                    bufferedInputStream2.close();
                                } catch (IOException unused3) {
                                }
                            }
                            i12 = 0;
                        } catch (Throwable th5) {
                            th = th5;
                            bufferedInputStream = bufferedInputStream3;
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
                    } catch (Throwable th6) {
                        th = th6;
                        bufferedInputStream = null;
                    }
                }
                int i285 = (i12 | (-i12)) >> 31;
                int i286 = (~i285) & i;
                int i287 = i285 & ((i & (-263)) | (i9 & 262));
                int i288 = (i287 & i286) | (i286 ^ i287);
                int i289 = ((~i250) & i) | (i250 & i9);
                int i290 = -i289;
                int i291 = ((i289 & i290) | (i289 ^ i290)) >> 31;
                int i292 = i288 & (~i291);
                int i293 = i291 & i250;
                i21 = (i292 & i293) | (i292 ^ i293);
                int i294 = -(-ImageFormat.getBitsPerPixel(0));
                Object[] objArr34 = new Object[1];
                a((i294 & 230) + (i294 | 230), 30 - (~(-(-ExpandableListView.getPackedPositionType(0L)))), (char) (45628 - (~(-(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))))), objArr34);
                String str30 = (String) objArr34[0];
                byte modifierMetaStateMask4 = (byte) KeyEvent.getModifierMetaStateMask();
                Object[] objArr35 = new Object[1];
                a((modifierMetaStateMask4 ^ 261) + ((modifierMetaStateMask4 & 261) << 1), View.resolveSize(0, 0) + 23, (char) (KeyEvent.getMaxKeyCode() >> 16), objArr35);
                String str31 = (String) objArr35[0];
                int i295 = 282 - (~(-(ViewConfiguration.getMaximumFlingVelocity() >> 16)));
                int i296 = 28 - (~(-(-TextUtils.lastIndexOf(str5, '0'))));
                int i297 = -Process.getGidForName(str5);
                Object[] objArr36 = new Object[1];
                a(i295, i296, (char) (((i297 | 43455) << 1) - (i297 ^ 43455)), objArr36);
                String str32 = (String) objArr36[0];
                int minimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity() >> 16;
                Object[] objArr37 = new Object[1];
                a((minimumFlingVelocity ^ 311) + ((minimumFlingVelocity & 311) << 1), 13 - (~(-Color.alpha(0))), (char) (37420 - ((byte) KeyEvent.getModifierMetaStateMask())), objArr37);
                strArr = new String[]{str30, str31, str32, (String) objArr37[0]};
                i22 = 0;
                while (true) {
                    if (i22 < 4) {
                        str7 = str5;
                        i23 = i21;
                        i24 = i;
                        break;
                    }
                    Object[] objArr38 = {strArr[i22]};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                        char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 993;
                        int iResolveSizeAndState = 8 - View.resolveSizeAndState(0, 0, 0);
                        byte b17 = (byte) 0;
                        Object[] objArr39 = new Object[1];
                        c(b17, (byte) (b17 | 6), b17, objArr39);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(cRgb, pressedStateDuration, iResolveSizeAndState, 349342683, false, (String) objArr39[0], new Class[]{String.class});
                    }
                    long jLongValue6 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).invoke(null, objArr38)).longValue();
                    long j42 = -674364253;
                    str7 = str5;
                    i125 = i22;
                    i126 = i21;
                    strArr17 = strArr;
                    long j43 = -406;
                    long j44 = jLongValue6 ^ j2;
                    long jUptimeMillis = (int) SystemClock.uptimeMillis();
                    long j45 = jUptimeMillis ^ j2;
                    long j46 = (((long) (-405)) * j42) + (((long) 407) * jLongValue6) + ((((j44 | jUptimeMillis) ^ j2) | (((j45 | j42) | jLongValue6) ^ j2)) * j43) + (j43 * (((j44 | j45) | j42) ^ j2)) + (((long) 406) * (((jUptimeMillis | (j42 ^ j2)) ^ j2) | ((j45 | jLongValue6) ^ j2))) + ((long) (-172714352));
                    int i298 = ~Process.myTid();
                    i127 = ((int) (j46 >> 32)) & (823262610 + ((~((-1247817818) | i298)) * 52) + (((~((-1340371420) | i298)) | (~(1517369465 | i298)) | 92553602) * (-52)) + (((~(i298 | 1340371419)) | 269551648) * 52));
                    i128 = (int) j46;
                    elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    i129 = ~elapsedCpuTime;
                    if ((i127 | (i128 & ((-635053777) + (((~(1804590766 | i129)) | (~((-367364357) | elapsedCpuTime))) * (-370)) + (((~(elapsedCpuTime | 1804590766)) | (~(i129 | (-367364357))) | 1779062442) * (-370)) + 1123107252))) != 0) {
                        int i299 = i125 + 252;
                        i24 = (~(i & i299)) & (i | i299);
                        i23 = i126;
                        break;
                    }
                    i22 = ((i125 | 1) << 1) - (i125 ^ 1);
                    i21 = i126;
                    strArr = strArr17;
                    str5 = str7;
                }
                int i300 = ((~i23) & i) | (i23 & i9);
                int i301 = -i300;
                int i302 = ((i300 & i301) | (i300 ^ i301)) >> 31;
                int i303 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
                TuitionPaymentFragmentbindingInflater1 = i303 % 128;
                int i304 = i303 % 2;
                int i305 = i24 & (~i302);
                int i306 = i23 & i302;
                int i307 = (i305 & i306) | (i305 ^ i306);
                int i308 = -MotionEvent.axisFromString(str7);
                int i309 = (i ^ 324) | (i & 324);
                int i310 = ~i308;
                i25 = (((i308 * 628) + 203472) - (~(((i309 & i310) | (i309 ^ i310)) * (-627)))) - 1;
                int i311 = ~(((-325) & i) | ((-325) ^ i));
                i26 = (i311 & i308) | (i308 ^ i311);
                int i312 = TuitionPaymentFragmentbindingInflater1;
                i27 = ((i312 | 39) << 1) - (i312 ^ 39);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i27 % 128;
                if (i27 % 2 == 0) {
                    i28 = i25 / ((-627) >> i26);
                    i29 = (i9 ^ 324) | (i9 & 324);
                } else {
                    int i313 = -(-(i26 * (-627)));
                    i28 = ((i25 | i313) << 1) - (i25 ^ i313);
                    int i314 = ~i;
                    i29 = (i314 & 324) | (i314 ^ 324);
                }
                int i315 = 627 * ((~((i308 & i) | (i308 ^ i))) | (~i29));
                Object[] objArr40 = new Object[1];
                a((i28 ^ i315) + ((i28 & i315) << 1), 12 - (~(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))), (char) (TextUtils.getTrimmedLength(str7) + 38683), objArr40);
                Object[] objArr41 = {(String) objArr40[0]};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cResolveSize = (char) (33602 - View.resolveSize(0, 0));
                    int iBlue = 3085 - Color.blue(0);
                    int scrollBarFadeDuration2 = 26 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    byte b18 = (byte) 0;
                    byte b19 = (byte) (b18 + 5);
                    Object[] objArr42 = new Object[1];
                    c(b18, b19, (byte) (b19 - 5), objArr42);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSize, iBlue, scrollBarFadeDuration2, 1411172903, false, (String) objArr42[0], new Class[]{String.class});
                }
                str8 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr41);
                if (str8 != null) {
                    int i316 = 337 - (~(-(-View.MeasureSpec.getMode(0))));
                    int iKeyCodeFromString2 = KeyEvent.keyCodeFromString(str7) + 9;
                    int i317 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    objArr5 = new Object[1];
                    a(i316, iKeyCodeFromString2, (char) (((i317 | 15258) << 1) - (i317 ^ 15258)), objArr5);
                    if (str8.contains((String) objArr5[0])) {
                        i30 = (~(i & ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION)) & (i | ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
                    } else {
                        i30 = i;
                    }
                } else {
                    i30 = i;
                }
                int i318 = ((~i307) & i) | (i307 & i9);
                int i319 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i320 = (i319 & 37) + (i319 | 37);
                TuitionPaymentFragmentbindingInflater1 = i320 % 128;
                int i321 = i320 % 2;
                int i322 = (i318 | (-i318)) >> 31;
                int i323 = i30 & (~i322);
                int i324 = i307 & i322;
                int i325 = (i324 & i323) | (i323 ^ i324);
                int i326 = -(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                int i327 = (i326 ^ 347) + ((i326 & 347) << 1);
                int i328 = -(-(ViewConfiguration.getLongPressTimeout() >> 16));
                Object[] objArr43 = new Object[1];
                a(i327, ((i328 | 17) << 1) - (i328 ^ 17), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr43);
                String str33 = (String) objArr43[0];
                int i329 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                int i330 = (i329 ^ 365) + ((i329 & 365) << 1);
                str9 = str7;
                int i331 = -(-TextUtils.indexOf(str9, str9, 0));
                int i332 = (i331 ^ 6) + ((i331 & 6) << 1);
                int threadPriority2 = Process.getThreadPriority(0);
                Object[] objArr44 = new Object[1];
                a(i330, i332, (char) (((threadPriority2 ^ 20) + ((threadPriority2 & 20) << 1)) >> 6), objArr44);
                Object[] objArr45 = {str33, (String) objArr44[0]};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char trimmedLength = (char) TextUtils.getTrimmedLength(str9);
                    int iMyTid = 2385 - (Process.myTid() >> 22);
                    int windowTouchSlop3 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 32;
                    byte b20 = (byte) 0;
                    byte b21 = (byte) (b20 + 5);
                    Object[] objArr46 = new Object[1];
                    c(b20, b21, (byte) (b21 - 5), objArr46);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(trimmedLength, iMyTid, windowTouchSlop3, -1207062455, false, (String) objArr46[0], new Class[]{String.class, String.class});
                }
                long jLongValue7 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr45)).longValue();
                long j47 = -159394014;
                long j48 = -445;
                long j49 = (j48 * j47) + (j48 * jLongValue7);
                long j50 = 446;
                long j51 = j47 ^ j2;
                long j52 = jLongValue7 ^ j2;
                long j53 = (j51 | j52) ^ j2;
                j4 = j3 ^ j2;
                long j54 = j49 + ((j53 | ((j52 | j4) ^ j2)) * j50) + ((((j51 | jLongValue7) ^ j2) | (((j52 | j47) | j3) ^ j2)) * j50) + (j50 * j53) + ((long) 2136437342);
                int iMyPid = Process.myPid();
                i31 = ((int) (j54 >> 32)) & ((-509451412) + ((~((-270627) | iMyPid)) * 623) + (((~iMyPid) | 17827968) * (-623)) + (((~(iMyPid | 727391876)) | (~((-709834535) | iMyPid)) | 270626) * 623));
                int i333 = (-1025827548) + (((~((-921326149) | i9)) | 75498052) * (-245));
                int i334 = ~((-921326149) | i);
                i32 = ((int) j54) & (i333 + (i334 * (-245)) + ((i334 | 1936414737) * 245));
                if (((i31 & i32) | (i31 ^ i32)) != 0) {
                    int i335 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i336 = (i335 & 7) + (i335 | 7);
                    TuitionPaymentFragmentbindingInflater1 = i336 % 128;
                    int i337 = i336 % 2;
                    i33 = (~(i & 251)) & (i | 251);
                } else {
                    i33 = i;
                }
                int i338 = (~(i & i325)) & (i | i325);
                int i339 = -i338;
                int i340 = ((i338 & i339) | (i338 ^ i339)) >> 31;
                int i341 = i33 & (~i340);
                int i342 = i325 & i340;
                int i343 = (i342 & i341) | (i341 ^ i342);
                int i344 = 369 - (~(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))));
                int i345 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                Object[] objArr47 = new Object[1];
                a(i344, (i345 & 23) + (i345 | 23), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr47);
                Object[] objArr48 = {(String) objArr47[0]};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 33602);
                    int iCombineMeasuredStates2 = View.combineMeasuredStates(0, 0) + 3085;
                    int iRed3 = Color.red(0) + 26;
                    byte b22 = (byte) 0;
                    byte b23 = (byte) (b22 + 5);
                    Object[] objArr49 = new Object[1];
                    c(b22, b23, (byte) (b23 - 5), objArr49);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(fadingEdgeLength, iCombineMeasuredStates2, iRed3, 1411172903, false, (String) objArr49[0], new Class[]{String.class});
                }
                lowerCase = ((String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr48)).toLowerCase();
                int i346 = -(-ExpandableListView.getPackedPositionChild(0L));
                int i347 = ((i346 | 394) << 1) - (i346 ^ 394);
                int i348 = -(KeyEvent.getMaxKeyCode() >> 16);
                int i349 = (i348 ^ 4) + ((i348 & 4) << 1);
                int i350 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                objArr = new Object[1];
                a(i347, i349, (char) ((i350 ^ 36662) + ((i350 & 36662) << 1)), objArr);
                if (lowerCase.contains((String) objArr[0])) {
                    i34 = i ^ 264;
                } else {
                    i34 = i;
                }
                int i351 = (~(i & i343)) & (i | i343);
                int i352 = (i351 | (-i351)) >> 31;
                int i353 = i34 & (~i352);
                int i354 = i343 & i352;
                int i355 = (i354 & i353) | (i353 ^ i354);
                int i356 = -(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                int i357 = (i356 ^ 396) + ((i356 & 396) << 1);
                int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L);
                int i358 = (packedPositionGroup2 & 42) + (packedPositionGroup2 | 42);
                int i359 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                Object[] objArr50 = new Object[1];
                a(i357, i358, (char) ((i359 ^ 36473) + ((i359 & 36473) << 1)), objArr50);
                String str34 = (String) objArr50[0];
                Object[] objArr51 = new Object[1];
                a(439 - ExpandableListView.getPackedPositionType(0L), (-16777177) - (~(-Color.rgb(0, 0, 0))), (char) (29836 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr51);
                String str35 = (String) objArr51[0];
                int i360 = -TextUtils.indexOf((CharSequence) str9, '0', 0, 0);
                int i361 = (i360 ^ 478) + ((i360 & 478) << 1);
                int i362 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
                Object[] objArr52 = new Object[1];
                a(i361, ((i362 | 27) << 1) - (i362 ^ 27), (char) View.resolveSizeAndState(0, 0, 0), objArr52);
                String str36 = (String) objArr52[0];
                int i363 = 505 - (~(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))));
                int i364 = -View.combineMeasuredStates(0, 0);
                Object[] objArr53 = new Object[1];
                a(i363, (i364 & 27) + (i364 | 27), (char) Color.blue(0), objArr53);
                String str37 = (String) objArr53[0];
                int iIndexOf3 = TextUtils.indexOf(str9, str9, 0, 0);
                int i365 = ((iIndexOf3 | 533) << 1) - (iIndexOf3 ^ 533);
                int i366 = -Color.argb(0, 0, 0, 0);
                int i367 = i366 * 465;
                int i368 = ~((-28) | i9);
                int i369 = ~((-28) | i366);
                i35 = ~i;
                int i370 = (i367 & (-12501)) + (i367 | (-12501)) + (((i369 & i368) | (i368 ^ i369) | (~((i35 ^ i366) | (i35 & i366)))) * 464);
                int i371 = ((~i366) | i | (-28)) * (-464);
                Object[] objArr54 = new Object[1];
                a(i365, (i370 & i371) + (i371 | i370) + (((~(((-28) ^ i366) | ((-28) & i366))) | (~((i366 & i) | (i366 ^ i)))) * 464), (char) ((-2) - (~(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))))), objArr54);
                String str38 = (String) objArr54[0];
                int i372 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                int i373 = (i372 & 560) + (i372 | 560);
                int i374 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int i375 = ((i374 | 27) << 1) - (i374 ^ 27);
                int i376 = -TextUtils.indexOf((CharSequence) str9, '0');
                Object[] objArr55 = new Object[1];
                a(i373, i375, (char) ((i376 & 61826) + (i376 | 61826)), objArr55);
                strArr2 = new String[]{str34, str35, str36, str37, str38, (String) objArr55[0]};
                i36 = 6;
                i37 = 0;
                while (true) {
                    if (i37 < i36) {
                        i38 = i;
                        break;
                    }
                    Object[] objArr56 = {strArr2[i37]};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                        char cArgb = (char) (33602 - Color.argb(0, 0, 0, 0));
                        int i377 = 3084 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 26;
                        byte b24 = (byte) 0;
                        byte b25 = (byte) (b24 + 5);
                        Object[] objArr57 = new Object[1];
                        c(b24, b25, (byte) (b25 - 5), objArr57);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(cArgb, i377, iNormalizeMetaState, 1411172903, false, (String) objArr57[0], new Class[]{String.class});
                    }
                    str20 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).invoke(null, objArr56);
                    if (str20 == null && !str20.isEmpty()) {
                        i38 = (i & (-266)) | (i9 & 265);
                        break;
                    }
                    i37++;
                    i36 = 6;
                }
                int i378 = (~(i & i355)) & (i | i355);
                int i379 = -i378;
                int i380 = (i378 & i379) | (i378 ^ i379);
                int i381 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i382 = (i381 & 35) + (i381 | 35);
                TuitionPaymentFragmentbindingInflater1 = i382 % 128;
                int i383 = i382 % 2;
                int i384 = i380 >> 31;
                int i385 = i38 & (~i384);
                int i386 = i355 & i384;
                i39 = (i386 & i385) | (i385 ^ i386);
                int i387 = -(-View.MeasureSpec.getSize(0));
                int i388 = (i387 ^ 347) + ((i387 & 347) << 1);
                int i389 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
                Object[] objArr58 = new Object[1];
                a(i388, (i389 ^ 17) + ((i389 & 17) << 1), (char) Color.argb(0, 0, 0, 0), objArr58);
                String str39 = (String) objArr58[0];
                int i390 = 586 - (~(-(ViewConfiguration.getJumpTapTimeout() >> 16)));
                int i391 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                Object[] objArr59 = new Object[1];
                a(i390, (i391 ^ 7) + ((i391 & 7) << 1), (char) Color.green(0), objArr59);
                String str40 = (String) objArr59[0];
                zzo.TuitionPaymentFragmentbindingInflater1();
                Object[] objArr60 = {str39, str40};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                    int modifierMetaStateMask5 = ((byte) KeyEvent.getModifierMetaStateMask()) + 2386;
                    int i392 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 32;
                    byte b26 = (byte) 0;
                    byte b27 = (byte) (b26 + 5);
                    Object[] objArr61 = new Object[1];
                    c(b26, b27, (byte) (b27 - 5), objArr61);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveOpacity, modifierMetaStateMask5, i392, -1207062455, false, (String) objArr61[0], new Class[]{String.class, String.class});
                }
                long jLongValue8 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr60)).longValue();
                long j55 = 1641424896;
                long j56 = (((long) 866) * j55) + (((long) (-864)) * jLongValue8);
                long j57 = jLongValue8 ^ j2;
                long j58 = 865;
                long j59 = j56 + (((long) (-865)) * (j57 | (((j55 ^ j2) | j4) ^ j2))) + (((j55 | j3) ^ j2) * j58) + (j58 * (((j57 | j4) ^ j2) | ((j4 | j55) ^ j2))) + ((long) 335618432);
                i40 = ((int) (j59 >> 32)) & ((-933184463) + (((~(393487291 | i9)) | (~(1830713702 | i))) * 333) + (((~(393487291 | i)) | (~(i9 | 1830713702))) * 333));
                i41 = ((int) j59) & (2072280017 + ((~((-1454413323) | i9)) * (-116)) + (((-2125575819) | i) * 116) + (((~((-688349409) | i)) | 17186912) * 116));
                if (((i40 & i41) | (i40 ^ i41)) != 0) {
                    i46 = (i & (-261)) | (i9 & 260);
                    i43 = i39;
                    str10 = str9;
                    i42 = i35;
                } else {
                    int keyRepeatDelay = ViewConfiguration.getKeyRepeatDelay() >> 16;
                    int i393 = (keyRepeatDelay ^ 593) + ((keyRepeatDelay & 593) << 1);
                    int i394 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
                    Object[] objArr62 = new Object[1];
                    a(i393, (i394 ^ 13) + ((i394 & 13) << 1), (char) ((-TextUtils.indexOf((CharSequence) str9, '0')) - 1), objArr62);
                    String str41 = (String) objArr62[0];
                    Object[] objArr63 = new Object[1];
                    a(606 - (~Process.getGidForName(str9)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 9, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr63);
                    Object[] objArr64 = {str41, (String) objArr63[0]};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                        int deadChar = 2385 - KeyEvent.getDeadChar(0, 0);
                        int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 32;
                        byte b28 = (byte) 0;
                        byte b29 = (byte) (b28 + 5);
                        Object[] objArr65 = new Object[1];
                        c(b28, b29, (byte) (b29 - 5), objArr65);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(bitsPerPixel, deadChar, iResolveSizeAndState2, -1207062455, false, (String) objArr65[0], new Class[]{String.class, String.class});
                    }
                    long jLongValue9 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr64)).longValue();
                    long j60 = 1686936585;
                    i42 = i35;
                    long j61 = ((j60 ^ j2) | jLongValue9) ^ j2;
                    i43 = i39;
                    str10 = str9;
                    long jFreeMemory = (int) Runtime.getRuntime().freeMemory();
                    long j62 = jFreeMemory ^ j2;
                    long j63 = (((long) 595) * j60) + (((long) (-1187)) * jLongValue9) + (((long) (-1188)) * (j61 | ((j62 | jLongValue9) ^ j2)));
                    long j64 = 594;
                    long j65 = jLongValue9 ^ j2;
                    long j66 = ((jFreeMemory | j65) ^ j2) | j61;
                    long j67 = (j62 | j60) ^ j2;
                    long j68 = j63 + ((j66 | j67) * j64) + (j64 * (((j65 | j62) ^ j2) | ((j65 | j60) ^ j2) | j67)) + ((long) 290106743);
                    int iMyTid2 = Process.myTid();
                    int i395 = ~iMyTid2;
                    i44 = ((int) (j68 >> 32)) & ((-2061077455) + (((~((-311136325) | i395)) | (~(1126090086 | iMyTid2))) * 333) + (((~(iMyTid2 | (-311136325))) | (~(i395 | 1126090086))) * 333));
                    i45 = ((int) j68) & ((-183007387) + (((~(1767200018 | i)) | (-329973609)) * (-964)) + (((~(1767200018 | i9)) | (-2080374651)) * (-964)));
                    if (((i44 & i45) | (i44 ^ i45)) != 0) {
                        i46 = (i & (-262)) | (i9 & 261);
                    } else {
                        i46 = i;
                    }
                }
                int i396 = i ^ i43;
                int i397 = -i396;
                int i398 = ((i396 & i397) | (i396 ^ i397)) >> 31;
                int i399 = (~i398) & i46;
                int i400 = i43 & i398;
                i47 = (i400 & i399) | (i399 ^ i400);
                if ((i2 & 8) == 0) {
                    str19 = str10;
                    int i401 = 614 - (~(-(-TextUtils.indexOf(str19, str19, 0))));
                    int modifierMetaStateMask6 = ((byte) KeyEvent.getModifierMetaStateMask()) + 44;
                    int i402 = -ExpandableListView.getPackedPositionType(0L);
                    Object[] objArr66 = new Object[1];
                    a(i401, modifierMetaStateMask6, (char) ((i402 ^ 57761) + ((i402 & 57761) << 1)), objArr66);
                    String str42 = (String) objArr66[0];
                    int i403 = 657 - (~(-(-(KeyEvent.getMaxKeyCode() >> 16))));
                    int i404 = -(-TextUtils.indexOf(str19, str19));
                    Object[] objArr67 = new Object[1];
                    a(i403, (i404 & 41) + (i404 | 41), (char) ExpandableListView.getPackedPositionType(0L), objArr67);
                    String str43 = (String) objArr67[0];
                    int i405 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                    Object[] objArr68 = new Object[1];
                    a((i405 & TypedValues.TransitionType.TYPE_DURATION) + (i405 | TypedValues.TransitionType.TYPE_DURATION), Drawable.resolveOpacity(0, 0) + 38, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr68);
                    strArr15 = new String[]{str42, str43, (String) objArr68[0]};
                    i116 = 0;
                    while (true) {
                        if (i116 < 3) {
                            Object[] objArr69 = {strArr15[i116]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                                char defaultSize = (char) View.getDefaultSize(0, 0);
                                int mirror = 1041 - AndroidCharacter.getMirror('0');
                                int i406 = 9 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                byte b30 = (byte) 0;
                                Object[] objArr70 = new Object[1];
                                c(b30, (byte) (b30 | 6), b30, objArr70);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(defaultSize, mirror, i406, 349342683, false, (String) objArr70[0], new Class[]{String.class});
                            }
                            long jLongValue10 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).invoke(null, objArr69)).longValue();
                            long j69 = 127158929;
                            str10 = str19;
                            strArr16 = strArr15;
                            long j70 = (((long) 477) * j69) + (((long) (-475)) * jLongValue10);
                            long j71 = ((j69 ^ j2) | jLongValue10) ^ j2;
                            long j72 = jLongValue10 ^ j2;
                            long startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                            long j73 = ((j72 | j69) | startElapsedRealtime) ^ j2;
                            j7 = j70 + (((long) (-476)) * (j71 | j73)) + (((long) 952) * j73) + (((long) 476) * ((((startElapsedRealtime ^ j2) | j72) | j69) ^ j2)) + ((long) (-974237534));
                            int i407 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            i118 = (i407 ^ 29) + ((i407 & 29) << 1);
                            TuitionPaymentFragmentbindingInflater1 = i118 % 128;
                            if (i118 % 2 != 0) {
                                i123 = ((int) (j7 << 32)) & (1704617878 + (((~((-136667433) | i)) | 2113832) * 305) + (((~((-136667433) | i9)) | (-1573893844)) * 305));
                                int iMyPid2 = Process.myPid();
                                i124 = ((int) j7) & (1320243365 + (((~(1523092770 | iMyPid2)) | 85340760) * 1504) + ((~(iMyPid2 | 1608433530)) * (-1504)) + 2034013360);
                                if (((i123 & i124) | (i123 ^ i124)) != 0) {
                                    iTuitionPaymentFragmentbindingInflater1 = zzo.TuitionPaymentFragmentbindingInflater1();
                                    int i408 = -(-(i116 * 46));
                                    int i409 = (12880 ^ i408) + ((i408 & 12880) << 1);
                                    int i410 = ~i116;
                                    int i411 = ~iTuitionPaymentFragmentbindingInflater1;
                                    int i412 = i409 + (((~((i411 & i410) | (i410 ^ i411))) | 280) * (-90));
                                    i121 = TuitionPaymentFragmentbindingInflater1 + 125;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i121 % 128;
                                    if (i121 % 2 == 0) {
                                        int i413 = ~i116;
                                        i122 = ~((i413 & iTuitionPaymentFragmentbindingInflater1) | (i413 ^ iTuitionPaymentFragmentbindingInflater1));
                                        int i414 = 28 / 0;
                                    } else {
                                        int i415 = ~i116;
                                        i122 = ~((i415 & iTuitionPaymentFragmentbindingInflater1) | (i415 ^ iTuitionPaymentFragmentbindingInflater1));
                                    }
                                    int i416 = -(-((-45) * ((~((i116 & 280) | (280 ^ i116))) | i122)));
                                    int i417 = (i412 & i416) + (i416 | i412);
                                    int i418 = ~((-281) | iTuitionPaymentFragmentbindingInflater1);
                                    int i419 = (i410 & i418) | (i410 ^ i418);
                                    int i420 = ~((~iTuitionPaymentFragmentbindingInflater1) | 280);
                                    int i421 = -(-(((i420 & i419) | (i419 ^ i420)) * 45));
                                    int i422 = ((i417 | i421) << 1) - (i421 ^ i417);
                                    i117 = ((~i422) & i) | (i422 & i9);
                                } else {
                                    int i423 = i116 - 50;
                                    i116 = ((i423 | 51) << 1) - (i423 ^ 51);
                                    strArr15 = strArr16;
                                    str19 = str10;
                                }
                            } else {
                                int i424 = ~(1441412207 | i);
                                i119 = ((int) (j7 >> 32)) & (1539216898 + ((4185796 | i424) * (-220)) + ((i424 | 1428096) * 220) + 504703512);
                                i120 = ((int) j7) & ((-2038855459) + (((~((-1361431191) | i)) | (~((-134746154) | i9))) * 920) + (((~((-1361563543) | i9)) | 1361431190) * 920) + (((~((-1361431191) | i9)) | (~((-132353) | i)) | (~((-134746154) | i))) * 920));
                                if (((i119 & i120) | (i119 ^ i120)) != 0) {
                                    iTuitionPaymentFragmentbindingInflater1 = zzo.TuitionPaymentFragmentbindingInflater1();
                                    int i4010 = -(-(i116 * 46));
                                    int i4011 = (12880 ^ i4010) + ((i4010 & 12880) << 1);
                                    int i4110 = ~i116;
                                    int i4111 = ~iTuitionPaymentFragmentbindingInflater1;
                                    int i4112 = i4011 + (((~((i4111 & i4110) | (i4110 ^ i4111))) | 280) * (-90));
                                    i121 = TuitionPaymentFragmentbindingInflater1 + 125;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i121 % 128;
                                    if (i121 % 2 == 0) {
                                        int i4113 = ~i116;
                                        i122 = ~((i4113 & iTuitionPaymentFragmentbindingInflater1) | (i4113 ^ iTuitionPaymentFragmentbindingInflater1));
                                        int i4114 = 28 / 0;
                                    } else {
                                        int i4115 = ~i116;
                                        i122 = ~((i4115 & iTuitionPaymentFragmentbindingInflater1) | (i4115 ^ iTuitionPaymentFragmentbindingInflater1));
                                    }
                                    int i4116 = -(-((-45) * ((~((i116 & 280) | (280 ^ i116))) | i122)));
                                    int i4117 = (i4112 & i4116) + (i4116 | i4112);
                                    int i4118 = ~((-281) | iTuitionPaymentFragmentbindingInflater1);
                                    int i4119 = (i4110 & i4118) | (i4110 ^ i4118);
                                    int i425 = ~((~iTuitionPaymentFragmentbindingInflater1) | 280);
                                    int i426 = -(-(((i425 & i4119) | (i4119 ^ i425)) * 45));
                                    int i427 = ((i4117 | i426) << 1) - (i426 ^ i4117);
                                    i117 = ((~i427) & i) | (i427 & i9);
                                } else {
                                    int i428 = i116 - 50;
                                    i116 = ((i428 | 51) << 1) - (i428 ^ 51);
                                    strArr15 = strArr16;
                                    str19 = str10;
                                }
                            }
                        } else {
                            str10 = str19;
                            i117 = i;
                        }
                        int i429 = i ^ i47;
                        int i430 = -i429;
                        int i431 = ((i429 & i430) | (i429 ^ i430)) >> 31;
                        i47 = (i47 & i431) | (i117 & (~i431));
                    }
                }
                int packedPositionType3 = ExpandableListView.getPackedPositionType(0L);
                int i432 = ((packedPositionType3 | 737) << 1) - (packedPositionType3 ^ 737);
                int i433 = -(-ExpandableListView.getPackedPositionGroup(0L));
                int i434 = (i433 & 41) + (i433 | 41);
                str11 = str10;
                int i435 = -TextUtils.getOffsetBefore(str11, 0);
                Object[] objArr71 = new Object[1];
                a(i432, i434, (char) ((i435 ^ 13176) + ((i435 & 13176) << 1)), objArr71);
                String str44 = (String) objArr71[0];
                int i436 = 779 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                int i437 = -View.resolveSize(0, 0);
                Object[] objArr72 = new Object[1];
                a(i436, ((i437 | 30) << 1) - (i437 ^ 30), (char) View.getDefaultSize(0, 0), objArr72);
                strArr3 = new String[]{str44, (String) objArr72[0]};
                i48 = 2;
                i49 = 0;
                while (true) {
                    if (i49 < i48) {
                        i50 = i;
                        break;
                    }
                    Object[] objArr73 = {strArr3[i49]};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                        char cGreen = (char) Color.green(0);
                        int i438 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 992;
                        int offsetAfter2 = TextUtils.getOffsetAfter(str11, 0) + 8;
                        byte b31 = (byte) 0;
                        byte b32 = b31;
                        Object[] objArr74 = new Object[1];
                        c(b31, b32, b32, objArr74);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(cGreen, i438, offsetAfter2, -545305915, false, (String) objArr74[0], new Class[]{String.class});
                    }
                    long jLongValue11 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).invoke(null, objArr73)).longValue();
                    long j74 = -1037210479;
                    strArr14 = strArr3;
                    long j75 = j74 ^ j2;
                    long j76 = (((long) 284) * j74) + (((long) (-282)) * jLongValue11) + (((long) (-283)) * (((j75 | jLongValue11) ^ j2) | ((j75 | j3) ^ j2)));
                    long j77 = 283;
                    long j78 = jLongValue11 ^ j2;
                    long j79 = j76 + (((j74 | j78) ^ j2) * j77) + (j77 * (((j78 | j75) | j3) ^ j2)) + ((long) 1657669763);
                    int iMyTid3 = Process.myTid();
                    i114 = ((int) (j79 >> 32)) & ((((~((~iMyTid3) | (-1207997697))) * 130) - 1195612778) + (((~(iMyTid3 | (-1207997697))) | 34668682) * 130));
                    int iMyUid = Process.myUid();
                    int i439 = ~iMyUid;
                    i115 = ((int) j79) & (1265906305 + (((~(2003183961 | i439)) | (-565957552) | (~((-2003183962) | iMyUid))) * (-564)) + ((~(iMyUid | (-555876618))) * 1128) + (((~((-565957552) | i439)) | 1447307344) * 564));
                    if (((i114 & i115) | (i114 ^ i115)) != 0) {
                        int i440 = i49 + 288;
                        i50 = ((~i440) & i) | (i440 & i9);
                        break;
                    }
                    i49 = (((i49 | 11) << 1) - (i49 ^ 11)) - 10;
                    strArr3 = strArr14;
                    i48 = 2;
                }
                int i441 = (~(i & i47)) & (i | i47);
                int i442 = -i441;
                int i443 = ((i441 & i442) | (i441 ^ i442)) >> 31;
                int i444 = i50 & (~i443);
                int i445 = i47 & i443;
                i51 = (i445 & i444) | (i444 ^ i445);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-555308653);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                    char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                    int i446 = 3526 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int trimmedLength2 = TextUtils.getTrimmedLength(str11) + 23;
                    byte b33 = (byte) 0;
                    byte b34 = (byte) (b33 + 5);
                    Object[] objArr75 = new Object[1];
                    c(b33, b34, (byte) (b34 - 5), objArr75);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cResolveSizeAndState, i446, trimmedLength2, 980946500, false, (String) objArr75[0], new Class[0]);
                }
                long jLongValue12 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, null)).longValue();
                long j80 = 794252091;
                long j81 = (((long) (-665)) * j80) + (((long) 334) * jLongValue12);
                long j82 = j80 ^ j2;
                long j83 = 333;
                i52 = i9;
                long jNextInt2 = new Random().nextInt();
                long j84 = jNextInt2 ^ j2;
                long j85 = j81 + (((long) (-333)) * j82) + ((((j82 | j84) ^ j2) | ((jLongValue12 | jNextInt2) ^ j2)) * j83) + (j83 * (((j82 | jNextInt2) ^ j2) | ((j84 | jLongValue12) ^ j2))) + ((long) (-974574729));
                i53 = ((int) (j85 >> 32)) & ((-802173004) + (((-738591361) | i52) * (-369)) + (((~(1007125120 | i52)) | (-1850615765)) * (-369)) + (((~((-1007125121) | i)) | 268533760 | (~(i52 | (-1112024405)))) * 369));
                int i447 = (~((int) SystemClock.elapsedRealtime())) | (-1829572725);
                i54 = ((int) j85) & (495840110 + (i447 * 495) + (((~i447) | 308456074) * 495));
                if (((i53 & i54) | (i53 ^ i54)) != 1) {
                    Object[] objArr76 = {1};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1331892133);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char cGreen2 = (char) Color.green(0);
                        int size2 = 2673 - View.MeasureSpec.getSize(0);
                        int trimmedLength3 = TextUtils.getTrimmedLength(str11) + 16;
                        byte b35 = (byte) 0;
                        byte b36 = (byte) (b35 + 5);
                        Object[] objArr77 = new Object[1];
                        c(b35, b36, (byte) (b36 - 5), objArr77);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cGreen2, size2, trimmedLength3, -1409439630, false, (String) objArr77[0], new Class[]{Integer.TYPE});
                    }
                    long jLongValue13 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr76)).longValue();
                    long j86 = 415030697;
                    long j87 = -375;
                    long j88 = (j87 * j86) + (j87 * jLongValue13);
                    long j89 = 376;
                    long j90 = j86 ^ j2;
                    long j91 = (j86 | jLongValue13) ^ j2;
                    long j92 = j88 + ((j3 | ((j90 | (jLongValue13 ^ j2)) ^ j2) | j91) * j89) + (((long) (-376)) * (((j4 | j86) ^ j2) | j91)) + (j89 * (jLongValue13 | ((j90 | j3) ^ j2))) + ((long) 1452667983);
                    i59 = ((int) (j92 >> 32)) & (1507456424 + (((~(1601423398 | i52)) | (~(1256317486 | i))) * 210) + (((~(i52 | (-353503233))) | (~((-8397321) | i))) * 210));
                    int iNextInt = new Random().nextInt();
                    int i448 = ~iNextInt;
                    i60 = ((int) j92) & (((((~(i448 | (-501989874))) | ((~(935236536 | i448)) | 138494017)) * (-397)) - 785009683) + ((iNextInt | 710234697) * 397));
                    if (((i59 & i60) | (i59 ^ i60)) != 0) {
                        int i449 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
                        TuitionPaymentFragmentbindingInflater1 = i449 % 128;
                        int i450 = i449 % 2;
                        i61 = i52;
                        i62 = (i & (-221)) | (i61 & 220);
                    } else {
                        i61 = i52;
                        i62 = i;
                    }
                    int i451 = ((~i51) & i) | (i51 & i61);
                    int i452 = -i451;
                    int i453 = ((i451 & i452) | (i451 ^ i452)) >> 31;
                    int i454 = i62 & (~i453);
                    int i455 = i51 & i453;
                    i63 = (i455 & i454) | (i454 ^ i455);
                    int i456 = 369 - (~(-Color.alpha(0)));
                    int i457 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    Object[] objArr78 = new Object[1];
                    a(i456, ((i457 | 24) << 1) - (i457 ^ 24), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr78);
                    Object[] objArr79 = {(String) objArr78[0]};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                        char c4 = (char) (33603 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        int threadPriority3 = ((Process.getThreadPriority(0) + 20) >> 6) + 3085;
                        int offsetBefore2 = TextUtils.getOffsetBefore(str11, 0) + 26;
                        byte b37 = (byte) 0;
                        byte b38 = (byte) (b37 + 5);
                        Object[] objArr80 = new Object[1];
                        c(b37, b38, (byte) (b38 - 5), objArr80);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c4, threadPriority3, offsetBefore2, 1411172903, false, (String) objArr80[0], new Class[]{String.class});
                    }
                    objInvoke = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr79);
                    try {
                        try {
                            if (objInvoke != null) {
                                int i458 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i459 = (i458 ^ 17) + ((i458 & 17) << 1);
                                TuitionPaymentFragmentbindingInflater1 = i459 % 128;
                                int i460 = i459 % 2;
                                Object[] objArr81 = {objInvoke, 42};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                                    char c5 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                    int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 3393;
                                    int iRed4 = Color.red(0) + 9;
                                    byte b39 = (byte) 0;
                                    byte b40 = (byte) (b39 + 5);
                                    Object[] objArr82 = new Object[1];
                                    c(b39, b40, (byte) (b40 - 5), objArr82);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(c5, iNormalizeMetaState2, iRed4, 1203525406, false, (String) objArr82[0], new Class[]{String.class, Integer.TYPE});
                                }
                                long jLongValue14 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).invoke(null, objArr81)).longValue();
                                long j93 = 121148702;
                                long j94 = j93 ^ j2;
                                long j95 = 191;
                                long j96 = (((long) (-381)) * j93) + (((long) DerHeader.TAG_CLASS_PRIVATE) * jLongValue14) + (((long) (-191)) * j94) + ((j93 | ((jLongValue14 | j3) ^ j2)) * j95) + (j95 * (((j4 | jLongValue14) ^ j2) | ((j94 | jLongValue14) ^ j2))) + ((long) (-123218579));
                                int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                                i112 = ((int) (j96 >> 32)) & ((-2072279902) + ((~((~elapsedCpuTime2) | (-52046630))) * (-116)) + ((2026229976 | elapsedCpuTime2) * 116) + (((~(elapsedCpuTime2 | 589003565)) | 1489273040) * 116));
                                i113 = ((int) j96) & ((((-635053777) + (((~(1122662390 | i61)) | (~(314564019 | i))) * (-370))) + ((((~(1122662390 | i)) | (~(314564019 | i61))) | 44717490) * (-370))) - 634397884);
                                if (((i112 & i113) | (i112 ^ i113)) == 1986687685) {
                                    str12 = str11;
                                    i67 = i61;
                                    strArr6 = null;
                                }
                                int i461 = 888 - (~(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))));
                                int i462 = -(-TextUtils.indexOf((CharSequence) str12, '0', 0, 0));
                                Object[] objArr83 = new Object[1];
                                a(i461, ((i462 | 17) << 1) - (i462 ^ 17), (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 53014), objArr83);
                                Object[] objArr84 = {(String) objArr83[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                                    char deadChar2 = (char) (33602 - KeyEvent.getDeadChar(0, 0));
                                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 3085;
                                    int packedPositionType4 = ExpandableListView.getPackedPositionType(0L) + 26;
                                    byte b41 = (byte) 0;
                                    byte b42 = (byte) (b41 + 5);
                                    Object[] objArr85 = new Object[1];
                                    c(b41, b42, (byte) (b42 - 5), objArr85);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(deadChar2, jumpTapTimeout, packedPositionType4, 1411172903, false, (String) objArr85[0], new Class[]{String.class});
                                }
                                objInvoke2 = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr84);
                                if (objInvoke2 == null) {
                                    i73 = 0;
                                } else {
                                    Object[] objArr86 = {objInvoke2, 42};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                                        char cAlpha = (char) Color.alpha(0);
                                        int i463 = 3394 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                        int iIndexOf4 = TextUtils.indexOf((CharSequence) str12, '0', 0) + 10;
                                        byte b43 = (byte) 0;
                                        byte b44 = (byte) (b43 + 5);
                                        Object[] objArr87 = new Object[1];
                                        c(b43, b44, (byte) (b44 - 5), objArr87);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cAlpha, i463, iIndexOf4, 1203525406, false, (String) objArr87[0], new Class[]{String.class, Integer.TYPE});
                                    }
                                    long jLongValue15 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).invoke(null, objArr86)).longValue();
                                    long j97 = 31585084;
                                    long j98 = (((long) (-523)) * j97) + (((long) 263) * jLongValue15);
                                    long j99 = 262;
                                    long j100 = ((j97 ^ j2) | jLongValue15) ^ j2;
                                    long j101 = jLongValue15 ^ j2;
                                    long j102 = (j97 | j101) ^ j2;
                                    long j103 = j98 + ((j100 | j102 | ((j101 | j3) ^ j2)) * j99) + (((long) (-786)) * j102) + (j99 * (((j101 | j4) ^ j2) | j100 | j102)) + ((long) (-33654961));
                                    int i464 = ((int) (j103 >> 32)) & (((635053406 + (((~(1766687994 | i67)) | (~(1091052890 | i))) * (-370))) + ((((~(1766687994 | i)) | (~(1091052890 | i67))) | 1091044442) * (-370))) - 40482284);
                                    int i465 = ((int) j103) & (2131573617 + (((~(1064955753 | i67)) | 372270656 | (~((-523789889) | i))) * (-68)) + ((~((-151519233) | i67)) * (-68)) + (((~(523789888 | i67)) | 913436521) * 68));
                                    i73 = (i464 & i465) | (i464 ^ i465);
                                }
                                if (i73 != 1986687685) {
                                    i100 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
                                    TuitionPaymentFragmentbindingInflater1 = i100 % 128;
                                    if (i100 % 2 != 0) {
                                        int i466 = 28 / 0;
                                        if (i73 == -1514516938) {
                                            i74 = i67;
                                            str14 = str12;
                                            strArr8 = strArr6;
                                        } else {
                                            i101 = 19;
                                            int offsetBefore3 = TextUtils.getOffsetBefore(str12, 0);
                                            Object[] objArr88 = new Object[1];
                                            a((offsetBefore3 & 1608) + (offsetBefore3 | 1608), ImageFormat.getBitsPerPixel(0) + 15, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), objArr88);
                                            int i467 = -(-Gravity.getAbsoluteGravity(0, 0));
                                            int i468 = (i467 & 1622) + (i467 | 1622);
                                            int i469 = -TextUtils.getOffsetAfter(str12, 0);
                                            Object[] objArr89 = new Object[1];
                                            a(i468, ((i469 | 26) << 1) - (i469 ^ 26), (char) Color.red(0), objArr89);
                                            int i470 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                            int i471 = (i470 ^ 1649) + ((i470 & 1649) << 1);
                                            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L);
                                            int i472 = (packedPositionChild ^ 18) + ((packedPositionChild & 18) << 1);
                                            int i473 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                            Object[] objArr90 = new Object[1];
                                            a(i471, i472, (char) ((i473 ^ 18429) + ((i473 & 18429) << 1)), objArr90);
                                            int i474 = -AndroidCharacter.getMirror('0');
                                            int i475 = (i474 & 1713) + (i474 | 1713);
                                            int iAlpha3 = Color.alpha(0);
                                            Object[] objArr91 = new Object[1];
                                            a(i475, ((iAlpha3 | 17) << 1) - (iAlpha3 ^ 17), (char) TextUtils.indexOf(str12, str12, 0), objArr91);
                                            int i476 = 1681 - (~(-(ViewConfiguration.getWindowTouchSlop() >> 8)));
                                            int iIndexOf5 = TextUtils.indexOf((CharSequence) str12, '0', 0, 0);
                                            int i477 = (iIndexOf5 ^ 16) + ((iIndexOf5 & 16) << 1);
                                            int i478 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                            Object[] objArr92 = new Object[1];
                                            a(i476, i477, (char) ((i478 ^ 42519) + ((i478 & 42519) << 1)), objArr92);
                                            int i479 = -TextUtils.getTrimmedLength(str12);
                                            int i480 = (i479 ^ 1697) + ((i479 & 1697) << 1);
                                            int iKeyCodeFromString3 = KeyEvent.keyCodeFromString(str12);
                                            int i481 = -View.resolveSizeAndState(0, 0, 0);
                                            Object[] objArr93 = new Object[1];
                                            a(i480, ((iKeyCodeFromString3 | 37) << 1) - (iKeyCodeFromString3 ^ 37), (char) (((i481 | 24132) << 1) - (i481 ^ 24132)), objArr93);
                                            Object[] objArr94 = new Object[1];
                                            a(1733 - (~(-TextUtils.indexOf(str12, str12, 0, 0))), 10 - (~(-(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))))), (char) ExpandableListView.getPackedPositionGroup(0L), objArr94);
                                            int scrollBarSize = 1746 - (ViewConfiguration.getScrollBarSize() >> 8);
                                            int i482 = -(-(ViewConfiguration.getScrollBarSize() >> 8));
                                            Object[] objArr95 = new Object[1];
                                            a(scrollBarSize, (i482 & 13) + (i482 | 13), (char) Color.blue(0), objArr95);
                                            int i483 = -TextUtils.indexOf((CharSequence) str12, '0');
                                            Object[] objArr96 = new Object[1];
                                            a((i483 ^ 1758) + ((i483 & 1758) << 1), 20 - (~(-TextUtils.lastIndexOf(str12, '0', 0))), (char) KeyEvent.normalizeMetaState(0), objArr96);
                                            int i484 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                            int i485 = (i484 & 1781) + (i484 | 1781);
                                            int i486 = -View.resolveSize(0, 0);
                                            int i487 = ((i486 | 31) << 1) - (i486 ^ 31);
                                            int i488 = -(-TextUtils.lastIndexOf(str12, '0', 0, 0));
                                            Object[] objArr97 = new Object[1];
                                            a(i485, i487, (char) ((i488 ^ 1) + ((i488 & 1) << 1)), objArr97);
                                            int iRgb = Color.rgb(0, 0, 0) + 16779028;
                                            int iMyTid4 = Process.myTid() >> 22;
                                            Object[] objArr98 = new Object[1];
                                            a(iRgb, (iMyTid4 & 12) + (iMyTid4 | 12), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr98);
                                            String str45 = (String) objArr98[0];
                                            zzo.TuitionPaymentFragmentbindingInflater1();
                                            int i489 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                                            Object[] objArr99 = new Object[1];
                                            a(((i489 | 1824) << 1) - (i489 ^ 1824), 12 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (11535 - (~(ViewConfiguration.getTapTimeout() >> 16))), objArr99);
                                            int offsetBefore4 = TextUtils.getOffsetBefore(str12, 0);
                                            Object[] objArr100 = new Object[1];
                                            a((offsetBefore4 ^ 1836) + ((offsetBefore4 & 1836) << 1), 10 - (~(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (char) (0 - (~(-(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))))), objArr100);
                                            int iGreen = Color.green(0);
                                            int i490 = ((iGreen | 1848) << 1) - (iGreen ^ 1848);
                                            int i491 = -View.MeasureSpec.getMode(0);
                                            Object[] objArr101 = new Object[1];
                                            a(i490, (i491 ^ 12) + ((i491 & 12) << 1), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr101);
                                            int i492 = -KeyEvent.normalizeMetaState(0);
                                            int i493 = (i492 ^ 1860) + ((i492 & 1860) << 1);
                                            int i494 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                            int i495 = -(-TextUtils.getOffsetAfter(str12, 0));
                                            Object[] objArr102 = new Object[1];
                                            a(i493, (i494 & 11) + (i494 | 11), (char) ((i495 ^ 58504) + ((i495 & 58504) << 1)), objArr102);
                                            int i496 = 1871 - (~(ViewConfiguration.getDoubleTapTimeout() >> 16));
                                            int i497 = -(-View.resolveSizeAndState(0, 0, 0));
                                            int i498 = (i497 ^ 14) + ((i497 & 14) << 1);
                                            int i499 = -TextUtils.indexOf(str12, str12, 0);
                                            Object[] objArr103 = new Object[1];
                                            a(i496, i498, (char) ((i499 ^ 45017) + ((i499 & 45017) << 1)), objArr103);
                                            int touchSlop = ViewConfiguration.getTouchSlop();
                                            int i500 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
                                            TuitionPaymentFragmentbindingInflater1 = i500 % 128;
                                            int i501 = i500 % 2;
                                            int i502 = -(touchSlop >> 8);
                                            int i503 = ((1886 | i502) << 1) - (i502 ^ 1886);
                                            int i504 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                            int i505 = ((i504 | 13) << 1) - (i504 ^ 13);
                                            int i506 = -(-TextUtils.lastIndexOf(str12, '0', 0, 0));
                                            Object[] objArr104 = new Object[1];
                                            a(i503, i505, (char) ((i506 ^ 15060) + ((i506 & 15060) << 1)), objArr104);
                                            int i507 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                            int i508 = (i507 ^ 1898) + ((i507 & 1898) << 1);
                                            int maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                                            int iTuitionPaymentFragmentbindingInflater7 = zzo.TuitionPaymentFragmentbindingInflater1();
                                            int i509 = maximumDrawingCacheSize * (-244);
                                            int i510 = (i509 ^ 5904) + ((i509 & 5904) << 1);
                                            int i511 = ~iTuitionPaymentFragmentbindingInflater7;
                                            int i512 = (((i510 - (~(((~(((-25) ^ maximumDrawingCacheSize) | ((-25) & maximumDrawingCacheSize))) | (~((i511 & (-25)) | ((-25) ^ i511)))) * (-245)))) - 1) - (~(-(-((~(((-25) ^ iTuitionPaymentFragmentbindingInflater7) | ((-25) & iTuitionPaymentFragmentbindingInflater7))) * (-245)))))) - 1;
                                            int i513 = ~((iTuitionPaymentFragmentbindingInflater7 & (-25)) | ((-25) ^ iTuitionPaymentFragmentbindingInflater7));
                                            int i514 = ((maximumDrawingCacheSize & i513) | (maximumDrawingCacheSize ^ i513)) * 245;
                                            int i515 = ((i512 | i514) << 1) - (i514 ^ i512);
                                            int i516 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                            Object[] objArr105 = new Object[1];
                                            a(i508, i515, (char) ((i516 ^ 1) + ((i516 & 1) << 1)), objArr105);
                                            int i517 = -(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                                            int i518 = -View.resolveSize(0, 0);
                                            Object[] objArr106 = new Object[1];
                                            a((i517 & 1921) + (i517 | 1921), (i518 & 28) + (i518 | 28), (char) KeyEvent.keyCodeFromString(str12), objArr106);
                                            strArr13 = new String[]{(String) objArr88[0], (String) objArr89[0], (String) objArr90[0], (String) objArr91[0], (String) objArr92[0], (String) objArr93[0], (String) objArr94[0], (String) objArr95[0], (String) objArr96[0], (String) objArr97[0], str45, (String) objArr99[0], (String) objArr100[0], (String) objArr101[0], (String) objArr102[0], (String) objArr103[0], (String) objArr104[0], (String) objArr105[0], (String) objArr106[0]};
                                            i102 = 0;
                                            while (true) {
                                                if (i102 < i101) {
                                                    i74 = i67;
                                                    str14 = str12;
                                                    strArr8 = strArr6;
                                                    i103 = -1;
                                                    break;
                                                }
                                                str18 = strArr13[i102];
                                                Object[] objArr107 = {str18};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                                                    char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) str12, '0'));
                                                    int edgeSlop = 993 - (ViewConfiguration.getEdgeSlop() >> 16);
                                                    int capsMode2 = 8 - TextUtils.getCapsMode(str12, 0, 0);
                                                    byte b45 = (byte) 0;
                                                    byte b46 = (byte) (b45 + 5);
                                                    Object[] objArr108 = new Object[1];
                                                    c(b45, b46, (byte) (b46 - 5), objArr108);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(cIndexOf, edgeSlop, capsMode2, 410748506, false, (String) objArr108[0], new Class[]{String.class});
                                                }
                                                long jLongValue16 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).invoke(null, objArr107)).longValue();
                                                long j104 = 1443778717;
                                                i74 = i67;
                                                str14 = str12;
                                                long j105 = jLongValue16 ^ j2;
                                                i104 = i102;
                                                strArr8 = strArr6;
                                                long startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
                                                long j106 = startElapsedRealtime2 ^ j2;
                                                long j107 = (j106 | jLongValue16) ^ j2;
                                                long j108 = 516;
                                                long j109 = j104 ^ j2;
                                                j5 = (((long) (-515)) * j104) + (((long) 517) * jLongValue16) + (((long) (-516)) * (((j105 | startElapsedRealtime2) ^ j2) | ((j106 | j104) ^ j2) | j107)) + (((((j109 | j105) | startElapsedRealtime2) ^ j2) | (((j109 | j106) | jLongValue16) ^ j2)) * j108) + (j108 * (((jLongValue16 | j109) ^ j2) | j107)) + ((long) (-1644696954));
                                                int i519 = TuitionPaymentFragmentbindingInflater1;
                                                i105 = (i519 ^ 97) + ((i519 & 97) << 1);
                                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i105 % 128;
                                                if (i105 % 2 == 0) {
                                                    i109 = 1905160562 + (((~(1335175691 | i74)) | (-1607838284) | (~(1522565193 | i74)) | (~((-1249902602) | i))) * (-84));
                                                    i110 = (~(1522565193 | i)) | (-1335175692);
                                                    i111 = ~((-1522565194) | i74);
                                                    if (((((int) (j5 << 95)) & (i109 + ((i110 | i111) * (-84)) + ((1249902601 | i111) * 84))) | (((int) j5) & (((1153123995 + ((1839902458 | i74) * 1444)) + ((((~((-1643106899) | i)) | 1638564434) | (~(205880488 | i))) * (-1444))) - 1264680934))) != 0) {
                                                        int i520 = 1871 - (~(-Gravity.getAbsoluteGravity(0, 0)));
                                                        int i521 = -ExpandableListView.getPackedPositionChild(0L);
                                                        int i522 = -ImageFormat.getBitsPerPixel(0);
                                                        objArr4 = new Object[1];
                                                        a(i520, (i521 ^ 13) + ((i521 & 13) << 1), (char) ((i522 & 45016) + (i522 | 45016)), objArr4);
                                                        if (str18.equals((String) objArr4[0])) {
                                                            Object[] objArr109 = {str18};
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                                                                char maximumDrawingCacheSize2 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                                int i523 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 992;
                                                                int edgeSlop2 = 8 - (ViewConfiguration.getEdgeSlop() >> 16);
                                                                byte b47 = (byte) 0;
                                                                Object[] objArr110 = new Object[1];
                                                                c(b47, (byte) (b47 | 6), b47, objArr110);
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(maximumDrawingCacheSize2, i523, edgeSlop2, 349342683, false, (String) objArr110[0], new Class[]{String.class});
                                                            }
                                                            long jLongValue17 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).invoke(null, objArr109)).longValue();
                                                            long j110 = -809468661;
                                                            long j111 = -159;
                                                            long j112 = (j111 * j110) + (j111 * jLongValue17);
                                                            long j113 = 160;
                                                            j6 = j112 + (((j110 ^ j2) | jLongValue17) * j113) + (((long) (-160)) * (((j4 | j110) ^ j2) | ((j110 | jLongValue17) ^ j2))) + (j113 * ((((jLongValue17 ^ j2) | j4) ^ j2) | j110)) + ((long) (-37609944));
                                                            int iMyUid2 = Process.myUid();
                                                            int i524 = ~iMyUid2;
                                                            i108 = ((int) (j6 >> 32)) & (1871737038 + (((~((-363188387) | i524)) | (~((-1074038025) | iMyUid2))) * 1900) + (((~(i524 | 1074038024)) | (~(363188386 | iMyUid2))) * (-950)) + (((~(iMyUid2 | 1074038024)) | (~(i524 | 363188386))) * 950));
                                                            iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                                                            if ((i108 | (((int) j6) & ((-635053948) + (((-141317) | iElapsedRealtime) * (-627)) + (((~(1756774086 | iElapsedRealtime)) | 319547676) * (-627)) + (((~(iElapsedRealtime | 319547676)) | (~((~iElapsedRealtime) | (-1756774087)))) * 627)))) != 0) {
                                                            }
                                                        }
                                                        i102 = i104 + 1;
                                                        i67 = i74;
                                                        strArr13 = strArr13;
                                                        str12 = str14;
                                                        strArr6 = strArr8;
                                                        i101 = 19;
                                                    }
                                                } else {
                                                    int i525 = ~(((int) Process.getElapsedCpuTime()) | 1471042851);
                                                    i106 = ((int) (j5 >> 32)) & ((((-1437444700) | i525) * (-658)) + 2141790698 + ((i525 | (-1471151996)) * 658));
                                                    int startElapsedRealtime3 = (int) Process.getStartElapsedRealtime();
                                                    int i526 = ~((-5329922) | startElapsedRealtime3);
                                                    i107 = ((int) j5) & (1864339449 + ((553648416 | i526) * (-476)) + (i526 * 952) + ((~((~startElapsedRealtime3) | (-5329922))) * 476));
                                                    if (((i106 & i107) | (i106 ^ i107)) != 0) {
                                                        int i527 = 1871 - (~(-Gravity.getAbsoluteGravity(0, 0)));
                                                        int i528 = -ExpandableListView.getPackedPositionChild(0L);
                                                        int i529 = -ImageFormat.getBitsPerPixel(0);
                                                        objArr4 = new Object[1];
                                                        a(i527, (i528 ^ 13) + ((i528 & 13) << 1), (char) ((i529 & 45016) + (i529 | 45016)), objArr4);
                                                        if (str18.equals((String) objArr4[0])) {
                                                            Object[] objArr1010 = {str18};
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                                                                char maximumDrawingCacheSize3 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                                int i5210 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 992;
                                                                int edgeSlop3 = 8 - (ViewConfiguration.getEdgeSlop() >> 16);
                                                                byte b48 = (byte) 0;
                                                                Object[] objArr111 = new Object[1];
                                                                c(b48, (byte) (b48 | 6), b48, objArr111);
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(maximumDrawingCacheSize3, i5210, edgeSlop3, 349342683, false, (String) objArr111[0], new Class[]{String.class});
                                                            }
                                                            long jLongValue18 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).invoke(null, objArr1010)).longValue();
                                                            long j114 = -809468661;
                                                            long j115 = -159;
                                                            long j116 = (j115 * j114) + (j115 * jLongValue18);
                                                            long j117 = 160;
                                                            j6 = j116 + (((j114 ^ j2) | jLongValue18) * j117) + (((long) (-160)) * (((j4 | j114) ^ j2) | ((j114 | jLongValue18) ^ j2))) + (j117 * ((((jLongValue18 ^ j2) | j4) ^ j2) | j114)) + ((long) (-37609944));
                                                            int iMyUid3 = Process.myUid();
                                                            int i5211 = ~iMyUid3;
                                                            i108 = ((int) (j6 >> 32)) & (1871737038 + (((~((-363188387) | i5211)) | (~((-1074038025) | iMyUid3))) * 1900) + (((~(i5211 | 1074038024)) | (~(363188386 | iMyUid3))) * (-950)) + (((~(iMyUid3 | 1074038024)) | (~(i5211 | 363188386))) * 950));
                                                            iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                                                            if ((i108 | (((int) j6) & ((-635053948) + (((-141317) | iElapsedRealtime) * (-627)) + (((~(1756774086 | iElapsedRealtime)) | 319547676) * (-627)) + (((~(iElapsedRealtime | 319547676)) | (~((~iElapsedRealtime) | (-1756774087)))) * 627)))) != 0) {
                                                            }
                                                        }
                                                        i102 = i104 + 1;
                                                        i67 = i74;
                                                        strArr13 = strArr13;
                                                        str12 = str14;
                                                        strArr6 = strArr8;
                                                        i101 = 19;
                                                    }
                                                }
                                                i103 = i104;
                                                break;
                                            }
                                            int i530 = ((i103 | 130) << 1) - (i103 ^ 130);
                                            int i531 = (i530 & i74) | ((~i530) & i);
                                            int i532 = ~i103;
                                            int i533 = -i532;
                                            int i534 = ((i532 & i533) | (i532 ^ i533)) >> 31;
                                            int i535 = TuitionPaymentFragmentbindingInflater1;
                                            int i536 = (i535 ^ 103) + ((i535 & 103) << 1);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i536 % 128;
                                            int i537 = i536 % 2;
                                            int i538 = (~i534) & i;
                                            int i539 = i531 & i534;
                                            int i540 = (i539 & i538) | (i538 ^ i539);
                                            int i541 = i ^ i63;
                                            int i542 = -i541;
                                            int i543 = ((i541 & i542) | (i541 ^ i542)) >> 31;
                                            int i544 = i540 & (~i543);
                                            int i545 = i63 & i543;
                                            i63 = (i545 & i544) | (i544 ^ i545);
                                        }
                                    } else if (i73 == -1514516938) {
                                        i74 = i67;
                                        str14 = str12;
                                        strArr8 = strArr6;
                                    } else {
                                        i101 = 19;
                                        int offsetBefore5 = TextUtils.getOffsetBefore(str12, 0);
                                        Object[] objArr810 = new Object[1];
                                        a((offsetBefore5 & 1608) + (offsetBefore5 | 1608), ImageFormat.getBitsPerPixel(0) + 15, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), objArr810);
                                        int i4610 = -(-Gravity.getAbsoluteGravity(0, 0));
                                        int i4611 = (i4610 & 1622) + (i4610 | 1622);
                                        int i4612 = -TextUtils.getOffsetAfter(str12, 0);
                                        Object[] objArr811 = new Object[1];
                                        a(i4611, ((i4612 | 26) << 1) - (i4612 ^ 26), (char) Color.red(0), objArr811);
                                        int i4710 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                        int i4711 = (i4710 ^ 1649) + ((i4710 & 1649) << 1);
                                        int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L);
                                        int i4712 = (packedPositionChild2 ^ 18) + ((packedPositionChild2 & 18) << 1);
                                        int i4713 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                        Object[] objArr910 = new Object[1];
                                        a(i4711, i4712, (char) ((i4713 ^ 18429) + ((i4713 & 18429) << 1)), objArr910);
                                        int i4714 = -AndroidCharacter.getMirror('0');
                                        int i4715 = (i4714 & 1713) + (i4714 | 1713);
                                        int iAlpha4 = Color.alpha(0);
                                        Object[] objArr911 = new Object[1];
                                        a(i4715, ((iAlpha4 | 17) << 1) - (iAlpha4 ^ 17), (char) TextUtils.indexOf(str12, str12, 0), objArr911);
                                        int i4716 = 1681 - (~(-(ViewConfiguration.getWindowTouchSlop() >> 8)));
                                        int iIndexOf6 = TextUtils.indexOf((CharSequence) str12, '0', 0, 0);
                                        int i4717 = (iIndexOf6 ^ 16) + ((iIndexOf6 & 16) << 1);
                                        int i4718 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                        Object[] objArr912 = new Object[1];
                                        a(i4716, i4717, (char) ((i4718 ^ 42519) + ((i4718 & 42519) << 1)), objArr912);
                                        int i4719 = -TextUtils.getTrimmedLength(str12);
                                        int i4810 = (i4719 ^ 1697) + ((i4719 & 1697) << 1);
                                        int iKeyCodeFromString4 = KeyEvent.keyCodeFromString(str12);
                                        int i4811 = -View.resolveSizeAndState(0, 0, 0);
                                        Object[] objArr913 = new Object[1];
                                        a(i4810, ((iKeyCodeFromString4 | 37) << 1) - (iKeyCodeFromString4 ^ 37), (char) (((i4811 | 24132) << 1) - (i4811 ^ 24132)), objArr913);
                                        Object[] objArr914 = new Object[1];
                                        a(1733 - (~(-TextUtils.indexOf(str12, str12, 0, 0))), 10 - (~(-(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))))), (char) ExpandableListView.getPackedPositionGroup(0L), objArr914);
                                        int scrollBarSize2 = 1746 - (ViewConfiguration.getScrollBarSize() >> 8);
                                        int i4812 = -(-(ViewConfiguration.getScrollBarSize() >> 8));
                                        Object[] objArr915 = new Object[1];
                                        a(scrollBarSize2, (i4812 & 13) + (i4812 | 13), (char) Color.blue(0), objArr915);
                                        int i4813 = -TextUtils.indexOf((CharSequence) str12, '0');
                                        Object[] objArr916 = new Object[1];
                                        a((i4813 ^ 1758) + ((i4813 & 1758) << 1), 20 - (~(-TextUtils.lastIndexOf(str12, '0', 0))), (char) KeyEvent.normalizeMetaState(0), objArr916);
                                        int i4814 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                        int i4815 = (i4814 & 1781) + (i4814 | 1781);
                                        int i4816 = -View.resolveSize(0, 0);
                                        int i4817 = ((i4816 | 31) << 1) - (i4816 ^ 31);
                                        int i4818 = -(-TextUtils.lastIndexOf(str12, '0', 0, 0));
                                        Object[] objArr917 = new Object[1];
                                        a(i4815, i4817, (char) ((i4818 ^ 1) + ((i4818 & 1) << 1)), objArr917);
                                        int iRgb2 = Color.rgb(0, 0, 0) + 16779028;
                                        int iMyTid5 = Process.myTid() >> 22;
                                        Object[] objArr918 = new Object[1];
                                        a(iRgb2, (iMyTid5 & 12) + (iMyTid5 | 12), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr918);
                                        String str46 = (String) objArr918[0];
                                        zzo.TuitionPaymentFragmentbindingInflater1();
                                        int i4819 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                                        Object[] objArr919 = new Object[1];
                                        a(((i4819 | 1824) << 1) - (i4819 ^ 1824), 12 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (11535 - (~(ViewConfiguration.getTapTimeout() >> 16))), objArr919);
                                        int offsetBefore6 = TextUtils.getOffsetBefore(str12, 0);
                                        Object[] objArr1011 = new Object[1];
                                        a((offsetBefore6 ^ 1836) + ((offsetBefore6 & 1836) << 1), 10 - (~(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (char) (0 - (~(-(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))))), objArr1011);
                                        int iGreen2 = Color.green(0);
                                        int i4910 = ((iGreen2 | 1848) << 1) - (iGreen2 ^ 1848);
                                        int i4911 = -View.MeasureSpec.getMode(0);
                                        Object[] objArr1012 = new Object[1];
                                        a(i4910, (i4911 ^ 12) + ((i4911 & 12) << 1), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr1012);
                                        int i4912 = -KeyEvent.normalizeMetaState(0);
                                        int i4913 = (i4912 ^ 1860) + ((i4912 & 1860) << 1);
                                        int i4914 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                        int i4915 = -(-TextUtils.getOffsetAfter(str12, 0));
                                        Object[] objArr1013 = new Object[1];
                                        a(i4913, (i4914 & 11) + (i4914 | 11), (char) ((i4915 ^ 58504) + ((i4915 & 58504) << 1)), objArr1013);
                                        int i4916 = 1871 - (~(ViewConfiguration.getDoubleTapTimeout() >> 16));
                                        int i4917 = -(-View.resolveSizeAndState(0, 0, 0));
                                        int i4918 = (i4917 ^ 14) + ((i4917 & 14) << 1);
                                        int i4919 = -TextUtils.indexOf(str12, str12, 0);
                                        Object[] objArr1014 = new Object[1];
                                        a(i4916, i4918, (char) ((i4919 ^ 45017) + ((i4919 & 45017) << 1)), objArr1014);
                                        int touchSlop2 = ViewConfiguration.getTouchSlop();
                                        int i5010 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
                                        TuitionPaymentFragmentbindingInflater1 = i5010 % 128;
                                        int i5011 = i5010 % 2;
                                        int i5012 = -(touchSlop2 >> 8);
                                        int i5013 = ((1886 | i5012) << 1) - (i5012 ^ 1886);
                                        int i5014 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                        int i5015 = ((i5014 | 13) << 1) - (i5014 ^ 13);
                                        int i5016 = -(-TextUtils.lastIndexOf(str12, '0', 0, 0));
                                        Object[] objArr1015 = new Object[1];
                                        a(i5013, i5015, (char) ((i5016 ^ 15060) + ((i5016 & 15060) << 1)), objArr1015);
                                        int i5017 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                        int i5018 = (i5017 ^ 1898) + ((i5017 & 1898) << 1);
                                        int maximumDrawingCacheSize4 = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                                        int iTuitionPaymentFragmentbindingInflater8 = zzo.TuitionPaymentFragmentbindingInflater1();
                                        int i5019 = maximumDrawingCacheSize4 * (-244);
                                        int i5110 = (i5019 ^ 5904) + ((i5019 & 5904) << 1);
                                        int i5111 = ~iTuitionPaymentFragmentbindingInflater8;
                                        int i5112 = (((i5110 - (~(((~(((-25) ^ maximumDrawingCacheSize4) | ((-25) & maximumDrawingCacheSize4))) | (~((i5111 & (-25)) | ((-25) ^ i5111)))) * (-245)))) - 1) - (~(-(-((~(((-25) ^ iTuitionPaymentFragmentbindingInflater8) | ((-25) & iTuitionPaymentFragmentbindingInflater8))) * (-245)))))) - 1;
                                        int i5113 = ~((iTuitionPaymentFragmentbindingInflater8 & (-25)) | ((-25) ^ iTuitionPaymentFragmentbindingInflater8));
                                        int i5114 = ((maximumDrawingCacheSize4 & i5113) | (maximumDrawingCacheSize4 ^ i5113)) * 245;
                                        int i5115 = ((i5112 | i5114) << 1) - (i5114 ^ i5112);
                                        int i5116 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                        Object[] objArr1016 = new Object[1];
                                        a(i5018, i5115, (char) ((i5116 ^ 1) + ((i5116 & 1) << 1)), objArr1016);
                                        int i5117 = -(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                                        int i5118 = -View.resolveSize(0, 0);
                                        Object[] objArr1017 = new Object[1];
                                        a((i5117 & 1921) + (i5117 | 1921), (i5118 & 28) + (i5118 | 28), (char) KeyEvent.keyCodeFromString(str12), objArr1017);
                                        strArr13 = new String[]{(String) objArr810[0], (String) objArr811[0], (String) objArr910[0], (String) objArr911[0], (String) objArr912[0], (String) objArr913[0], (String) objArr914[0], (String) objArr915[0], (String) objArr916[0], (String) objArr917[0], str46, (String) objArr919[0], (String) objArr1011[0], (String) objArr1012[0], (String) objArr1013[0], (String) objArr1014[0], (String) objArr1015[0], (String) objArr1016[0], (String) objArr1017[0]};
                                        i102 = 0;
                                        while (true) {
                                            if (i102 < i101) {
                                                i74 = i67;
                                                str14 = str12;
                                                strArr8 = strArr6;
                                                i103 = -1;
                                                break;
                                            }
                                            str18 = strArr13[i102];
                                            Object[] objArr1018 = {str18};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                                                char cIndexOf2 = (char) ((-1) - TextUtils.indexOf((CharSequence) str12, '0'));
                                                int edgeSlop4 = 993 - (ViewConfiguration.getEdgeSlop() >> 16);
                                                int capsMode3 = 8 - TextUtils.getCapsMode(str12, 0, 0);
                                                byte b49 = (byte) 0;
                                                byte b410 = (byte) (b49 + 5);
                                                Object[] objArr1019 = new Object[1];
                                                c(b49, b410, (byte) (b410 - 5), objArr1019);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(cIndexOf2, edgeSlop4, capsMode3, 410748506, false, (String) objArr1019[0], new Class[]{String.class});
                                            }
                                            long jLongValue19 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).invoke(null, objArr1018)).longValue();
                                            long j1010 = 1443778717;
                                            i74 = i67;
                                            str14 = str12;
                                            long j1011 = jLongValue19 ^ j2;
                                            i104 = i102;
                                            strArr8 = strArr6;
                                            long startElapsedRealtime4 = (int) Process.getStartElapsedRealtime();
                                            long j1012 = startElapsedRealtime4 ^ j2;
                                            long j1013 = (j1012 | jLongValue19) ^ j2;
                                            long j1014 = 516;
                                            long j1015 = j1010 ^ j2;
                                            j5 = (((long) (-515)) * j1010) + (((long) 517) * jLongValue19) + (((long) (-516)) * (((j1011 | startElapsedRealtime4) ^ j2) | ((j1012 | j1010) ^ j2) | j1013)) + (((((j1015 | j1011) | startElapsedRealtime4) ^ j2) | (((j1015 | j1012) | jLongValue19) ^ j2)) * j1014) + (j1014 * (((jLongValue19 | j1015) ^ j2) | j1013)) + ((long) (-1644696954));
                                            int i5119 = TuitionPaymentFragmentbindingInflater1;
                                            i105 = (i5119 ^ 97) + ((i5119 & 97) << 1);
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i105 % 128;
                                            if (i105 % 2 == 0) {
                                                i109 = 1905160562 + (((~(1335175691 | i74)) | (-1607838284) | (~(1522565193 | i74)) | (~((-1249902602) | i))) * (-84));
                                                i110 = (~(1522565193 | i)) | (-1335175692);
                                                i111 = ~((-1522565194) | i74);
                                                if (((((int) (j5 << 95)) & (i109 + ((i110 | i111) * (-84)) + ((1249902601 | i111) * 84))) | (((int) j5) & (((1153123995 + ((1839902458 | i74) * 1444)) + ((((~((-1643106899) | i)) | 1638564434) | (~(205880488 | i))) * (-1444))) - 1264680934))) != 0) {
                                                    int i5212 = 1871 - (~(-Gravity.getAbsoluteGravity(0, 0)));
                                                    int i5213 = -ExpandableListView.getPackedPositionChild(0L);
                                                    int i5214 = -ImageFormat.getBitsPerPixel(0);
                                                    objArr4 = new Object[1];
                                                    a(i5212, (i5213 ^ 13) + ((i5213 & 13) << 1), (char) ((i5214 & 45016) + (i5214 | 45016)), objArr4);
                                                    if (str18.equals((String) objArr4[0])) {
                                                        Object[] objArr10110 = {str18};
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                                                            char maximumDrawingCacheSize5 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                            int i5215 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 992;
                                                            int edgeSlop5 = 8 - (ViewConfiguration.getEdgeSlop() >> 16);
                                                            byte b411 = (byte) 0;
                                                            Object[] objArr112 = new Object[1];
                                                            c(b411, (byte) (b411 | 6), b411, objArr112);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(maximumDrawingCacheSize5, i5215, edgeSlop5, 349342683, false, (String) objArr112[0], new Class[]{String.class});
                                                        }
                                                        long jLongValue110 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).invoke(null, objArr10110)).longValue();
                                                        long j118 = -809468661;
                                                        long j119 = -159;
                                                        long j1110 = (j119 * j118) + (j119 * jLongValue110);
                                                        long j1111 = 160;
                                                        j6 = j1110 + (((j118 ^ j2) | jLongValue110) * j1111) + (((long) (-160)) * (((j4 | j118) ^ j2) | ((j118 | jLongValue110) ^ j2))) + (j1111 * ((((jLongValue110 ^ j2) | j4) ^ j2) | j118)) + ((long) (-37609944));
                                                        int iMyUid4 = Process.myUid();
                                                        int i5216 = ~iMyUid4;
                                                        i108 = ((int) (j6 >> 32)) & (1871737038 + (((~((-363188387) | i5216)) | (~((-1074038025) | iMyUid4))) * 1900) + (((~(i5216 | 1074038024)) | (~(363188386 | iMyUid4))) * (-950)) + (((~(iMyUid4 | 1074038024)) | (~(i5216 | 363188386))) * 950));
                                                        iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                                                        if ((i108 | (((int) j6) & ((-635053948) + (((-141317) | iElapsedRealtime) * (-627)) + (((~(1756774086 | iElapsedRealtime)) | 319547676) * (-627)) + (((~(iElapsedRealtime | 319547676)) | (~((~iElapsedRealtime) | (-1756774087)))) * 627)))) != 0) {
                                                        }
                                                    }
                                                    i102 = i104 + 1;
                                                    i67 = i74;
                                                    strArr13 = strArr13;
                                                    str12 = str14;
                                                    strArr6 = strArr8;
                                                    i101 = 19;
                                                }
                                            } else {
                                                int i5217 = ~(((int) Process.getElapsedCpuTime()) | 1471042851);
                                                i106 = ((int) (j5 >> 32)) & ((((-1437444700) | i5217) * (-658)) + 2141790698 + ((i5217 | (-1471151996)) * 658));
                                                int startElapsedRealtime5 = (int) Process.getStartElapsedRealtime();
                                                int i5218 = ~((-5329922) | startElapsedRealtime5);
                                                i107 = ((int) j5) & (1864339449 + ((553648416 | i5218) * (-476)) + (i5218 * 952) + ((~((~startElapsedRealtime5) | (-5329922))) * 476));
                                                if (((i106 & i107) | (i106 ^ i107)) != 0) {
                                                    int i5219 = 1871 - (~(-Gravity.getAbsoluteGravity(0, 0)));
                                                    int i52110 = -ExpandableListView.getPackedPositionChild(0L);
                                                    int i52111 = -ImageFormat.getBitsPerPixel(0);
                                                    objArr4 = new Object[1];
                                                    a(i5219, (i52110 ^ 13) + ((i52110 & 13) << 1), (char) ((i52111 & 45016) + (i52111 | 45016)), objArr4);
                                                    if (str18.equals((String) objArr4[0])) {
                                                        Object[] objArr10111 = {str18};
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                                                            char maximumDrawingCacheSize6 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                            int i52112 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 992;
                                                            int edgeSlop6 = 8 - (ViewConfiguration.getEdgeSlop() >> 16);
                                                            byte b412 = (byte) 0;
                                                            Object[] objArr113 = new Object[1];
                                                            c(b412, (byte) (b412 | 6), b412, objArr113);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(maximumDrawingCacheSize6, i52112, edgeSlop6, 349342683, false, (String) objArr113[0], new Class[]{String.class});
                                                        }
                                                        long jLongValue111 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).invoke(null, objArr10111)).longValue();
                                                        long j1112 = -809468661;
                                                        long j1113 = -159;
                                                        long j1114 = (j1113 * j1112) + (j1113 * jLongValue111);
                                                        long j1115 = 160;
                                                        j6 = j1114 + (((j1112 ^ j2) | jLongValue111) * j1115) + (((long) (-160)) * (((j4 | j1112) ^ j2) | ((j1112 | jLongValue111) ^ j2))) + (j1115 * ((((jLongValue111 ^ j2) | j4) ^ j2) | j1112)) + ((long) (-37609944));
                                                        int iMyUid5 = Process.myUid();
                                                        int i52113 = ~iMyUid5;
                                                        i108 = ((int) (j6 >> 32)) & (1871737038 + (((~((-363188387) | i52113)) | (~((-1074038025) | iMyUid5))) * 1900) + (((~(i52113 | 1074038024)) | (~(363188386 | iMyUid5))) * (-950)) + (((~(iMyUid5 | 1074038024)) | (~(i52113 | 363188386))) * 950));
                                                        iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                                                        if ((i108 | (((int) j6) & ((-635053948) + (((-141317) | iElapsedRealtime) * (-627)) + (((~(1756774086 | iElapsedRealtime)) | 319547676) * (-627)) + (((~(iElapsedRealtime | 319547676)) | (~((~iElapsedRealtime) | (-1756774087)))) * 627)))) != 0) {
                                                        }
                                                    }
                                                    i102 = i104 + 1;
                                                    i67 = i74;
                                                    strArr13 = strArr13;
                                                    str12 = str14;
                                                    strArr6 = strArr8;
                                                    i101 = 19;
                                                }
                                            }
                                            i103 = i104;
                                            break;
                                        }
                                        int i5310 = ((i103 | 130) << 1) - (i103 ^ 130);
                                        int i5311 = (i5310 & i74) | ((~i5310) & i);
                                        int i5312 = ~i103;
                                        int i5313 = -i5312;
                                        int i5314 = ((i5312 & i5313) | (i5312 ^ i5313)) >> 31;
                                        int i5315 = TuitionPaymentFragmentbindingInflater1;
                                        int i5316 = (i5315 ^ 103) + ((i5315 & 103) << 1);
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5316 % 128;
                                        int i5317 = i5316 % 2;
                                        int i5318 = (~i5314) & i;
                                        int i5319 = i5311 & i5314;
                                        int i546 = (i5319 & i5318) | (i5318 ^ i5319);
                                        int i547 = i ^ i63;
                                        int i548 = -i547;
                                        int i549 = ((i547 & i548) | (i547 ^ i548)) >> 31;
                                        int i5410 = i546 & (~i549);
                                        int i5411 = i63 & i549;
                                        i63 = (i5411 & i5410) | (i5410 ^ i5411);
                                    }
                                } else {
                                    i74 = i67;
                                    str14 = str12;
                                    strArr8 = strArr6;
                                }
                                int i550 = 1949 - (~(-(ViewConfiguration.getKeyRepeatTimeout() >> 16)));
                                int i551 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                                Object[] objArr114 = new Object[1];
                                a(i550, (i551 ^ 13) + ((i551 & 13) << 1), (char) Color.blue(0), objArr114);
                                String str47 = (String) objArr114[0];
                                str15 = str14;
                                int iIndexOf7 = TextUtils.indexOf(str15, str15, 0);
                                int iLastIndexOf = TextUtils.lastIndexOf(str15, '0');
                                Object[] objArr115 = new Object[1];
                                a(((iIndexOf7 | 1963) << 1) - (iIndexOf7 ^ 1963), (iLastIndexOf & 6) + (iLastIndexOf | 6), (char) (Color.rgb(0, 0, 0) + 16839861), objArr115);
                                String[] strArr22 = {str47, (String) objArr115[0]};
                                int i552 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                                int i553 = -(-TextUtils.getOffsetAfter(str15, 0));
                                Object[] objArr116 = new Object[1];
                                a((i552 ^ 1968) + ((i552 & 1968) << 1), (i553 & 15) + (i553 | 15), (char) (48411 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr116);
                                String str48 = (String) objArr116[0];
                                int i554 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1982;
                                int i555 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                Object[] objArr117 = new Object[1];
                                a(i554, (i555 ^ 19) + ((i555 & 19) << 1), (char) (59624 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), objArr117);
                                String str49 = (String) objArr117[0];
                                int iIndexOf8 = TextUtils.indexOf(str15, str15, 0, 0);
                                int iTuitionPaymentFragmentbindingInflater9 = zzo.TuitionPaymentFragmentbindingInflater1();
                                int i556 = iIndexOf8 * (-244);
                                int i557 = (i556 & 492492) + (i556 | 492492);
                                int i558 = ~iTuitionPaymentFragmentbindingInflater9;
                                int i559 = -(-(((~((i558 & (-2003)) | ((-2003) ^ i558))) | (~(((-2003) & iIndexOf8) | ((-2003) ^ iIndexOf8)))) * (-245)));
                                int i560 = (i557 ^ i559) + ((i559 & i557) << 1);
                                int i561 = (~(((-2003) ^ iTuitionPaymentFragmentbindingInflater9) | ((-2003) & iTuitionPaymentFragmentbindingInflater9))) * (-245);
                                int i562 = ((i560 | i561) << 1) - (i560 ^ i561);
                                int i563 = ((~(iTuitionPaymentFragmentbindingInflater9 | (-2003))) | iIndexOf8) * 245;
                                int i564 = (i562 ^ i563) + ((i563 & i562) << 1);
                                int scrollBarSize3 = ViewConfiguration.getScrollBarSize() >> 8;
                                int i565 = (scrollBarSize3 ^ 14) + ((scrollBarSize3 & 14) << 1);
                                int i566 = -(-TextUtils.lastIndexOf(str15, '0', 0));
                                Object[] objArr118 = new Object[1];
                                a(i564, i565, (char) ((i566 ^ 17841) + ((i566 & 17841) << 1)), objArr118);
                                String[] strArr23 = {str48, str49, (String) objArr118[0]};
                                int modifierMetaStateMask7 = 2015 - ((byte) KeyEvent.getModifierMetaStateMask());
                                int i567 = -(-View.getDefaultSize(0, 0));
                                Object[] objArr119 = new Object[1];
                                a(modifierMetaStateMask7, (i567 ^ 21) + ((i567 & 21) << 1), (char) (14714 - (~(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))))), objArr119);
                                String str50 = (String) objArr119[0];
                                int modifierMetaStateMask8 = 2036 - ((byte) KeyEvent.getModifierMetaStateMask());
                                int i568 = 10 - (~(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
                                int i569 = -Color.alpha(0);
                                Object[] objArr120 = new Object[1];
                                a(modifierMetaStateMask8, i568, (char) ((i569 & 36799) + (i569 | 36799)), objArr120);
                                String[] strArr24 = {str50, (String) objArr120[0]};
                                int i570 = -TextUtils.lastIndexOf(str15, '0', 0);
                                int i571 = (i570 & 2046) + (i570 | 2046);
                                int i572 = 11 - (~(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
                                int i573 = -TextUtils.getOffsetAfter(str15, 0);
                                Object[] objArr121 = new Object[1];
                                a(i571, i572, (char) ((i573 & 44789) + (i573 | 44789)), objArr121);
                                String str51 = (String) objArr121[0];
                                int maxKeyCode = 587 - (KeyEvent.getMaxKeyCode() >> 16);
                                int i574 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                Object[] objArr122 = new Object[1];
                                a(maxKeyCode, (i574 & 7) + (i574 | 7), (char) KeyEvent.keyCodeFromString(str15), objArr122);
                                String[] strArr25 = {str51, (String) objArr122[0]};
                                int i575 = 2058 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                int defaultSize2 = View.getDefaultSize(0, 0);
                                Object[] objArr123 = new Object[1];
                                a(i575, ((defaultSize2 | 28) << 1) - (defaultSize2 ^ 28), (char) View.resolveSize(0, 0), objArr123);
                                String str52 = (String) objArr123[0];
                                int pressedStateDuration2 = 2037 - (ViewConfiguration.getPressedStateDuration() >> 16);
                                int iLastIndexOf2 = TextUtils.lastIndexOf(str15, '0') + 11;
                                int i576 = -ExpandableListView.getPackedPositionGroup(0L);
                                Object[] objArr124 = new Object[1];
                                a(pressedStateDuration2, iLastIndexOf2, (char) (((i576 | 36799) << 1) - (i576 ^ 36799)), objArr124);
                                c3 = 0;
                                strArr9 = new String[][]{strArr22, strArr23, strArr24, strArr25, new String[]{str52, (String) objArr124[0]}};
                                i75 = 0;
                                i76 = 5;
                                i77 = -1;
                                loop7: while (true) {
                                    if (i75 < i76) {
                                        i78 = i74;
                                        i79 = i;
                                        break;
                                    }
                                    String[] strArr26 = strArr9[i75];
                                    str16 = strArr26[c3];
                                    strArr10 = (String[]) Arrays.copyOfRange(strArr26, 1, strArr26.length);
                                    length2 = strArr10.length;
                                    i85 = 0;
                                    while (true) {
                                        if (i85 < length2) {
                                            i86 = i77 + 1;
                                            bytes2 = strArr10[i85].getBytes();
                                            length3 = bytes2.length;
                                            if (length3 == 0) {
                                                i78 = i74;
                                            } else {
                                                try {
                                                    try {
                                                        strArr11 = strArr9;
                                                        try {
                                                            bufferedInputStream5 = new BufferedInputStream(new FileInputStream(str16));
                                                            i89 = 4096;
                                                            strArr12 = strArr10;
                                                            try {
                                                                try {
                                                                    bArr3 = new byte[4096];
                                                                    str17 = str16;
                                                                    i87 = length2;
                                                                    i88 = i86;
                                                                    i90 = 0;
                                                                    while (true) {
                                                                        try {
                                                                            i91 = bufferedInputStream5.read(bArr3, 0, i89);
                                                                            if (i91 > 0) {
                                                                                break;
                                                                            }
                                                                            i92 = 0;
                                                                            while (i90 < length3 && i92 < i91) {
                                                                                byte[] bArr4 = bArr3;
                                                                                if (bArr3[i92] == bytes2[i90]) {
                                                                                    i90 = ((i90 | 1) << 1) - (i90 ^ 1);
                                                                                } else {
                                                                                    if (i90 != 0) {
                                                                                        i93 = i90 - 1;
                                                                                        while (true) {
                                                                                            if (i93 > 0) {
                                                                                                i74 = i74;
                                                                                                i94 = i91;
                                                                                                i90 = 0;
                                                                                                break;
                                                                                            }
                                                                                            i95 = 0;
                                                                                            while (true) {
                                                                                                if (i95 < i93) {
                                                                                                    i74 = i74;
                                                                                                    i94 = i91;
                                                                                                    i90 = i93;
                                                                                                    break;
                                                                                                }
                                                                                                i96 = i91;
                                                                                                b2 = bytes2[i95];
                                                                                                i78 = i74;
                                                                                                i97 = (i90 - (~(-i93))) - 1;
                                                                                                i98 = i90;
                                                                                                i99 = -(-i95);
                                                                                                try {
                                                                                                    if (b2 != bytes2[(i97 & i99) + (i97 | i99)]) {
                                                                                                        break;
                                                                                                    }
                                                                                                    i95 = ((i95 & 1) << 1) + (i95 ^ 1);
                                                                                                    i91 = i96;
                                                                                                    i74 = i78;
                                                                                                    i90 = i98;
                                                                                                } catch (IOException unused6) {
                                                                                                    if (bufferedInputStream5 != null) {
                                                                                                        try {
                                                                                                            bufferedInputStream5.close();
                                                                                                        } catch (IOException unused7) {
                                                                                                        }
                                                                                                    }
                                                                                                    i85++;
                                                                                                    strArr9 = strArr11;
                                                                                                    strArr10 = strArr12;
                                                                                                    str16 = str17;
                                                                                                    length2 = i87;
                                                                                                    i77 = i88;
                                                                                                    i74 = i78;
                                                                                                }
                                                                                            }
                                                                                            i93--;
                                                                                            i91 = i96;
                                                                                            i74 = i78;
                                                                                            i90 = i98;
                                                                                        }
                                                                                    }
                                                                                    bArr3 = bArr4;
                                                                                    i91 = i94;
                                                                                    i74 = i74;
                                                                                }
                                                                                i94 = i91;
                                                                                i92++;
                                                                                bArr3 = bArr4;
                                                                                i91 = i94;
                                                                                i74 = i74;
                                                                            }
                                                                            bArr3 = bArr3;
                                                                            i74 = i74;
                                                                            i90 = i90;
                                                                            i89 = 4096;
                                                                        } catch (IOException unused8) {
                                                                            i78 = i74;
                                                                        }
                                                                    }
                                                                    i78 = i74;
                                                                    if (i90 == length3) {
                                                                        z = true;
                                                                    } else {
                                                                        z = false;
                                                                    }
                                                                    try {
                                                                        bufferedInputStream5.close();
                                                                    } catch (IOException unused9) {
                                                                    }
                                                                    if (z) {
                                                                        i85++;
                                                                        strArr9 = strArr11;
                                                                        strArr10 = strArr12;
                                                                        str16 = str17;
                                                                        length2 = i87;
                                                                        i77 = i88;
                                                                        i74 = i78;
                                                                    }
                                                                } catch (Throwable th7) {
                                                                    th3 = th7;
                                                                    bufferedInputStream4 = bufferedInputStream5;
                                                                    if (bufferedInputStream4 == null) {
                                                                        throw th3;
                                                                    }
                                                                    try {
                                                                        bufferedInputStream4.close();
                                                                        throw th3;
                                                                    } catch (IOException unused10) {
                                                                        throw th3;
                                                                    }
                                                                }
                                                            } catch (IOException unused11) {
                                                                i78 = i74;
                                                                str17 = str16;
                                                                i87 = length2;
                                                                i88 = i86;
                                                            }
                                                        } catch (IOException unused12) {
                                                            i78 = i74;
                                                            strArr12 = strArr10;
                                                            str17 = str16;
                                                            i87 = length2;
                                                            i88 = i86;
                                                            bufferedInputStream5 = null;
                                                            if (bufferedInputStream5 != null) {
                                                                bufferedInputStream5.close();
                                                            }
                                                            i85++;
                                                            strArr9 = strArr11;
                                                            strArr10 = strArr12;
                                                            str16 = str17;
                                                            length2 = i87;
                                                            i77 = i88;
                                                            i74 = i78;
                                                        }
                                                    } catch (IOException unused13) {
                                                        strArr11 = strArr9;
                                                    }
                                                } catch (Throwable th8) {
                                                    th3 = th8;
                                                    bufferedInputStream4 = null;
                                                }
                                            }
                                            i79 = i ^ (i77 + 171);
                                            break loop7;
                                        }
                                        i75++;
                                        i76 = 5;
                                        c3 = 0;
                                    }
                                }
                                int i577 = i ^ i63;
                                int i578 = -i577;
                                int i579 = ((i577 & i578) | (i577 ^ i578)) >> 31;
                                int i580 = i79 & (~i579);
                                int i581 = i63 & i579;
                                int i582 = (i581 & i580) | (i580 ^ i581);
                                int i583 = 2085 - (~(-(ViewConfiguration.getScrollBarSize() >> 8)));
                                int i584 = 11 - (~(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                                int i585 = -TextUtils.indexOf(str15, str15, 0, 0);
                                Object[] objArr125 = new Object[1];
                                a(i583, i584, (char) ((i585 & 21955) + (i585 | 21955)), objArr125);
                                String str53 = (String) objArr125[0];
                                int i586 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2098;
                                int i587 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                Object[] objArr126 = new Object[1];
                                a(i586, (i587 & 8) + (i587 | 8), (char) (((Process.getThreadPriority(0) + 20) >> 6) + 20215), objArr126);
                                Object[] objArr127 = {str53, (String) objArr126[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                                    try {
                                        char windowTouchSlop4 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                                        int iIndexOf9 = TextUtils.indexOf(str15, str15, 0) + 2385;
                                        int minimumFlingVelocity2 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 32;
                                        byte b50 = (byte) 0;
                                        byte b51 = (byte) (b50 + 5);
                                        Object[] objArr128 = new Object[1];
                                        c(b50, b51, (byte) (b51 - 5), objArr128);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(windowTouchSlop4, iIndexOf9, minimumFlingVelocity2, -1207062455, false, (String) objArr128[0], new Class[]{String.class, String.class});
                                    } catch (Throwable th9) {
                                        th2 = th9;
                                        try {
                                            Throwable cause2 = th2.getCause();
                                            if (cause2 != null) {
                                                throw cause2;
                                            }
                                            throw th2;
                                        } catch (Exception unused14) {
                                            i80 = i & (-152);
                                            i81 = i78 & 151;
                                            i82 = i80 | i81;
                                            int i588 = i ^ i582;
                                            int i589 = (i588 | (-i588)) >> 31;
                                            int i590 = i82 & (~i589);
                                            int i591 = i582 & i589;
                                            int i592 = (i591 & i590) | (i590 ^ i591);
                                            int i593 = -Color.green(0);
                                            int i594 = (i593 & 2107) + (i593 | 2107);
                                            int iArgb = Color.argb(0, 0, 0, 0) + 47;
                                            int i595 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                            Object[] objArr129 = new Object[1];
                                            a(i594, iArgb, (char) ((i595 ^ 1) + ((i595 & 1) << 1)), objArr129);
                                            Object[] objArr130 = {(String) objArr129[0]};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                                                char windowTouchSlop5 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                                                int i596 = 994 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                int edgeSlop7 = (ViewConfiguration.getEdgeSlop() >> 16) + 8;
                                                byte b52 = (byte) 0;
                                                byte b53 = b52;
                                                Object[] objArr131 = new Object[1];
                                                c(b52, b53, b53, objArr131);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(windowTouchSlop5, i596, edgeSlop7, -545305915, false, (String) objArr131[0], new Class[]{String.class});
                                            }
                                            long jLongValue20 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).invoke(null, objArr130)).longValue();
                                            long j120 = -1288437473;
                                            long j121 = -496;
                                            long j122 = (j121 * j120) + (j121 * jLongValue20);
                                            long j123 = 497;
                                            long j124 = j120 ^ j2;
                                            long j125 = jLongValue20 ^ j2;
                                            long j126 = j124 | j125;
                                            long j127 = j122 + ((j126 ^ j2) * j123) + ((((j126 | j3) ^ j2) | (((j125 | j4) | j120) ^ j2)) * j123) + (j123 * (((j124 | j4) ^ j2) | ((jLongValue20 | j124) ^ j2) | (((j125 | j120) | j3) ^ j2))) + ((long) 1908896757);
                                            int elapsedCpuTime3 = (int) Process.getElapsedCpuTime();
                                            int i597 = ~elapsedCpuTime3;
                                            int i598 = ((int) (j127 >> 32)) & (314194654 + (((~(i597 | (-1843456072))) | 744538117 | (~(2113202767 | elapsedCpuTime3))) * 717) + (((~(elapsedCpuTime3 | (-1843456072))) | (~(i597 | 2113202767)) | 744538117) * 717));
                                            int i599 = ((int) j127) & (1094593649 + (((~(1400492905 | i78)) | 36733504 | (~((-1400423009) | i))) * (-68)) + ((~((-1363689505) | i78)) * (-68)) + (((~(i78 | 1400423008)) | 36803401) * 68));
                                            int i600 = ((i598 & i599) | (i598 ^ i599)) * 263;
                                            int i601 = i ^ i592;
                                            int i602 = -i601;
                                            int i603 = ((i601 & i602) | (i601 ^ i602)) >> 31;
                                            int i604 = (i600 | i) & (~(i & i600)) & (~i603);
                                            int i605 = i592 & i603;
                                            i55 = (i605 & i604) | (i604 ^ i605);
                                            strArr4 = strArr8;
                                            i56 = 5;
                                            objArr2 = new Object[i56];
                                            objArr2[0] = new int[1];
                                            objArr2[1] = new int[]{i55};
                                            objArr2[3] = new int[]{i};
                                            int i606 = (~(i & i55)) & (i | i55);
                                            int i607 = -i606;
                                            int i608 = (((i606 & i607) | (i606 ^ i607)) >> 31) & 16;
                                            objArr2[4] = strArr4;
                                            objArr2[2] = null;
                                            int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                                            int i609 = (-403930261) + (((~((-429747619) | iElapsedRealtime2)) | 268460192 | (~((-1344332026) | iElapsedRealtime2))) * (-880));
                                            int i610 = (~((-429747619) | (~iElapsedRealtime2))) | 1344332025;
                                            int i611 = ~(iElapsedRealtime2 | 429747618);
                                            int i612 = i609 + ((i610 | i611) * (-880)) + (i611 * 880);
                                            int i613 = -(-((i612 ^ i608) + ((i612 & i608) << 1)));
                                            int i614 = (i3 & i613) + (i3 | i613);
                                            int i615 = i614 << 13;
                                            int i616 = (i615 | i614) & (~(i614 & i615));
                                            i57 = i616 ^ (i616 >>> 17);
                                            i58 = TuitionPaymentFragmentbindingInflater1 + 101;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i58 % 128;
                                            if (i58 % 2 != 0) {
                                                ((int[]) objArr2[0])[0] = i57 ^ (i57 << 5);
                                                return objArr2;
                                            }
                                            int i617 = i57 % 2;
                                            ((int[]) objArr2[0])[0] = (i57 | i617) & (~(i57 & i617));
                                            return objArr2;
                                        }
                                    }
                                }
                                long jLongValue21 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).invoke(null, objArr127)).longValue();
                                long j128 = -102072316;
                                long j129 = 399;
                                long j130 = (j129 * j128) + (j129 * jLongValue21);
                                long j131 = 398;
                                long j132 = ((j128 ^ j2) | jLongValue21) ^ j2;
                                long j133 = jLongValue21 ^ j2;
                                long j134 = (j133 | j128) ^ j2;
                                long jMyTid = Process.myTid();
                                long j135 = j130 + ((j132 | j134 | ((j133 | jMyTid) ^ j2)) * j131) + (((long) (-1194)) * (j128 | jLongValue21)) + (j131 * ((((jMyTid ^ j2) | j133) ^ j2) | j132 | j134)) + ((long) 2079115644);
                                int iElapsedRealtime3 = (int) SystemClock.elapsedRealtime();
                                int i618 = ~iElapsedRealtime3;
                                i83 = ((int) (j135 >> 32)) & ((-969119006) + (((~(201150503 | i618)) | (-1638376915) | (~((-201150504) | iElapsedRealtime3))) * (-564)) + ((~(iElapsedRealtime3 | (-27590659))) * 1128) + (((~((-1638376915) | i618)) | 173559845) * 564));
                                int i619 = (int) j135;
                                int iMyPid3 = Process.myPid();
                                int i620 = ~iMyPid3;
                                i84 = i619 & (94082845 + ((iMyPid3 | 4474149) * 988) + (((~(181172093 | i620)) | (-1795096448)) * (-1976)) + (((~(iMyPid3 | 1618398503)) | 4474149 | (~((-1618398504) | i620))) * 988));
                                if (((i83 & i84) | (i83 ^ i84)) != 0) {
                                    i80 = i & (-151);
                                    i78 = i78;
                                    i81 = i78 & 150;
                                    i82 = i80 | i81;
                                } else {
                                    i78 = i78;
                                    i82 = i;
                                }
                                int i5810 = i ^ i582;
                                int i5811 = (i5810 | (-i5810)) >> 31;
                                int i5910 = i82 & (~i5811);
                                int i5911 = i582 & i5811;
                                int i5912 = (i5911 & i5910) | (i5910 ^ i5911);
                                int i5913 = -Color.green(0);
                                int i5914 = (i5913 & 2107) + (i5913 | 2107);
                                int iArgb2 = Color.argb(0, 0, 0, 0) + 47;
                                int i5915 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                Object[] objArr1210 = new Object[1];
                                a(i5914, iArgb2, (char) ((i5915 ^ 1) + ((i5915 & 1) << 1)), objArr1210);
                                Object[] objArr132 = {(String) objArr1210[0]};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                                    char windowTouchSlop6 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                                    int i5916 = 994 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                    int edgeSlop8 = (ViewConfiguration.getEdgeSlop() >> 16) + 8;
                                    byte b54 = (byte) 0;
                                    byte b55 = b54;
                                    Object[] objArr133 = new Object[1];
                                    c(b54, b55, b55, objArr133);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(windowTouchSlop6, i5916, edgeSlop8, -545305915, false, (String) objArr133[0], new Class[]{String.class});
                                }
                                long jLongValue22 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).invoke(null, objArr132)).longValue();
                                long j1210 = -1288437473;
                                long j1211 = -496;
                                long j1212 = (j1211 * j1210) + (j1211 * jLongValue22);
                                long j1213 = 497;
                                long j1214 = j1210 ^ j2;
                                long j1215 = jLongValue22 ^ j2;
                                long j1216 = j1214 | j1215;
                                long j1217 = j1212 + ((j1216 ^ j2) * j1213) + ((((j1216 | j3) ^ j2) | (((j1215 | j4) | j1210) ^ j2)) * j1213) + (j1213 * (((j1214 | j4) ^ j2) | ((jLongValue22 | j1214) ^ j2) | (((j1215 | j1210) | j3) ^ j2))) + ((long) 1908896757);
                                int elapsedCpuTime4 = (int) Process.getElapsedCpuTime();
                                int i5917 = ~elapsedCpuTime4;
                                int i5918 = ((int) (j1217 >> 32)) & (314194654 + (((~(i5917 | (-1843456072))) | 744538117 | (~(2113202767 | elapsedCpuTime4))) * 717) + (((~(elapsedCpuTime4 | (-1843456072))) | (~(i5917 | 2113202767)) | 744538117) * 717));
                                int i5919 = ((int) j1217) & (1094593649 + (((~(1400492905 | i78)) | 36733504 | (~((-1400423009) | i))) * (-68)) + ((~((-1363689505) | i78)) * (-68)) + (((~(i78 | 1400423008)) | 36803401) * 68));
                                int i6010 = ((i5918 & i5919) | (i5918 ^ i5919)) * 263;
                                int i6011 = i ^ i5912;
                                int i6012 = -i6011;
                                int i6013 = ((i6011 & i6012) | (i6011 ^ i6012)) >> 31;
                                int i6014 = (i6010 | i) & (~(i & i6010)) & (~i6013);
                                int i6015 = i5912 & i6013;
                                i55 = (i6015 & i6014) | (i6014 ^ i6015);
                                strArr4 = strArr8;
                                i56 = 5;
                            }
                            Object[] objArr1211 = {str53, (String) objArr126[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                                char windowTouchSlop7 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                                int iIndexOf10 = TextUtils.indexOf(str15, str15, 0) + 2385;
                                int minimumFlingVelocity3 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 32;
                                byte b56 = (byte) 0;
                                byte b57 = (byte) (b56 + 5);
                                Object[] objArr1212 = new Object[1];
                                c(b56, b57, (byte) (b57 - 5), objArr1212);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(windowTouchSlop7, iIndexOf10, minimumFlingVelocity3, -1207062455, false, (String) objArr1212[0], new Class[]{String.class, String.class});
                            }
                            long jLongValue23 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).invoke(null, objArr1211)).longValue();
                            long j1218 = -102072316;
                            long j1219 = 399;
                            long j136 = (j1219 * j1218) + (j1219 * jLongValue23);
                            long j137 = 398;
                            long j138 = ((j1218 ^ j2) | jLongValue23) ^ j2;
                            long j139 = jLongValue23 ^ j2;
                            long j1310 = (j139 | j1218) ^ j2;
                            long jMyTid2 = Process.myTid();
                            long j1311 = j136 + ((j138 | j1310 | ((j139 | jMyTid2) ^ j2)) * j137) + (((long) (-1194)) * (j1218 | jLongValue23)) + (j137 * ((((jMyTid2 ^ j2) | j139) ^ j2) | j138 | j1310)) + ((long) 2079115644);
                            int iElapsedRealtime4 = (int) SystemClock.elapsedRealtime();
                            int i6110 = ~iElapsedRealtime4;
                            i83 = ((int) (j1311 >> 32)) & ((-969119006) + (((~(201150503 | i6110)) | (-1638376915) | (~((-201150504) | iElapsedRealtime4))) * (-564)) + ((~(iElapsedRealtime4 | (-27590659))) * 1128) + (((~((-1638376915) | i6110)) | 173559845) * 564));
                            int i6111 = (int) j1311;
                            int iMyPid4 = Process.myPid();
                            int i621 = ~iMyPid4;
                            i84 = i6111 & (94082845 + ((iMyPid4 | 4474149) * 988) + (((~(181172093 | i621)) | (-1795096448)) * (-1976)) + (((~(iMyPid4 | 1618398503)) | 4474149 | (~((-1618398504) | i621))) * 988));
                            if (((i83 & i84) | (i83 ^ i84)) != 0) {
                                i80 = i & (-151);
                                i78 = i78;
                                i81 = i78 & 150;
                                i82 = i80 | i81;
                            } else {
                                i78 = i78;
                                i82 = i;
                            }
                            int i5812 = i ^ i582;
                            int i5813 = (i5812 | (-i5812)) >> 31;
                            int i59110 = i82 & (~i5813);
                            int i59111 = i582 & i5813;
                            int i59112 = (i59111 & i59110) | (i59110 ^ i59111);
                            int i59113 = -Color.green(0);
                            int i59114 = (i59113 & 2107) + (i59113 | 2107);
                            int iArgb3 = Color.argb(0, 0, 0, 0) + 47;
                            int i59115 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            Object[] objArr1213 = new Object[1];
                            a(i59114, iArgb3, (char) ((i59115 ^ 1) + ((i59115 & 1) << 1)), objArr1213);
                            Object[] objArr134 = {(String) objArr1213[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                                char windowTouchSlop8 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                                int i59116 = 994 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                int edgeSlop9 = (ViewConfiguration.getEdgeSlop() >> 16) + 8;
                                byte b58 = (byte) 0;
                                byte b59 = b58;
                                Object[] objArr135 = new Object[1];
                                c(b58, b59, b59, objArr135);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(windowTouchSlop8, i59116, edgeSlop9, -545305915, false, (String) objArr135[0], new Class[]{String.class});
                            }
                            long jLongValue24 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).invoke(null, objArr134)).longValue();
                            long j12110 = -1288437473;
                            long j12111 = -496;
                            long j12112 = (j12111 * j12110) + (j12111 * jLongValue24);
                            long j12113 = 497;
                            long j12114 = j12110 ^ j2;
                            long j12115 = jLongValue24 ^ j2;
                            long j12116 = j12114 | j12115;
                            long j12117 = j12112 + ((j12116 ^ j2) * j12113) + ((((j12116 | j3) ^ j2) | (((j12115 | j4) | j12110) ^ j2)) * j12113) + (j12113 * (((j12114 | j4) ^ j2) | ((jLongValue24 | j12114) ^ j2) | (((j12115 | j12110) | j3) ^ j2))) + ((long) 1908896757);
                            int elapsedCpuTime5 = (int) Process.getElapsedCpuTime();
                            int i59117 = ~elapsedCpuTime5;
                            int i59118 = ((int) (j12117 >> 32)) & (314194654 + (((~(i59117 | (-1843456072))) | 744538117 | (~(2113202767 | elapsedCpuTime5))) * 717) + (((~(elapsedCpuTime5 | (-1843456072))) | (~(i59117 | 2113202767)) | 744538117) * 717));
                            int i59119 = ((int) j12117) & (1094593649 + (((~(1400492905 | i78)) | 36733504 | (~((-1400423009) | i))) * (-68)) + ((~((-1363689505) | i78)) * (-68)) + (((~(i78 | 1400423008)) | 36803401) * 68));
                            int i6016 = ((i59118 & i59119) | (i59118 ^ i59119)) * 263;
                            int i6017 = i ^ i59112;
                            int i6018 = -i6017;
                            int i6019 = ((i6017 & i6018) | (i6017 ^ i6018)) >> 31;
                            int i60110 = (i6016 | i) & (~(i & i6016)) & (~i6019);
                            int i60111 = i59112 & i6019;
                            i55 = (i60111 & i60110) | (i60110 ^ i60111);
                            strArr4 = strArr8;
                            i56 = 5;
                        } catch (Throwable th10) {
                            th2 = th10;
                        }
                        int i5814 = 2085 - (~(-(ViewConfiguration.getScrollBarSize() >> 8)));
                        int i5815 = 11 - (~(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                        int i5816 = -TextUtils.indexOf(str15, str15, 0, 0);
                        Object[] objArr1214 = new Object[1];
                        a(i5814, i5815, (char) ((i5816 & 21955) + (i5816 | 21955)), objArr1214);
                        String str54 = (String) objArr1214[0];
                        int i5817 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2098;
                        int i5818 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        Object[] objArr1215 = new Object[1];
                        a(i5817, (i5818 & 8) + (i5818 | 8), (char) (((Process.getThreadPriority(0) + 20) >> 6) + 20215), objArr1215);
                    } catch (Exception unused15) {
                        i78 = i78;
                    }
                    int i622 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i623 = (i622 ^ 41) + ((i622 & 41) << 1);
                    TuitionPaymentFragmentbindingInflater1 = i623 % 128;
                    int i624 = i623 % 2;
                    int iLastIndexOf3 = TextUtils.lastIndexOf(str11, '0');
                    Object[] objArr136 = new Object[1];
                    a(((iLastIndexOf3 | 371) << 1) - (iLastIndexOf3 ^ 371), 23 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) ((-1) - TextUtils.indexOf((CharSequence) str11, '0')), objArr136);
                    String str55 = (String) objArr136[0];
                    int i625 = -ImageFormat.getBitsPerPixel(0);
                    int i626 = (i625 ^ 807) + ((i625 & 807) << 1);
                    int i627 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                    Object[] objArr137 = new Object[1];
                    a(i626, ((i627 | 10) << 1) - (i627 ^ 10), (char) ((-2) - ((-(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))) ^ (-1))), objArr137);
                    String str56 = (String) objArr137[0];
                    Object[] objArr138 = new Object[1];
                    a(817 - (~(-(ViewConfiguration.getEdgeSlop() >> 16))), 7 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) View.getDefaultSize(0, 0), objArr138);
                    String str57 = (String) objArr138[0];
                    int i628 = -TextUtils.indexOf(str11, str11);
                    int i629 = (i628 ^ 825) + ((i628 & 825) << 1);
                    int i630 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    Object[] objArr139 = new Object[1];
                    a(i629, ((i630 | 9) << 1) - (i630 ^ 9), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr139);
                    int i631 = -TextUtils.indexOf(str11, str11, 0);
                    int i632 = ((i631 | 833) << 1) - (i631 ^ 833);
                    int i633 = -View.resolveSizeAndState(0, 0, 0);
                    Object[] objArr140 = new Object[1];
                    a(i632, ((i633 | 17) << 1) - (i633 ^ 17), (char) (61182 - (~(-ExpandableListView.getPackedPositionType(0L)))), objArr140);
                    String str58 = (String) objArr140[0];
                    int i634 = 848 - (~(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                    int i635 = -KeyEvent.keyCodeFromString(str11);
                    int i636 = ((i635 | 7) << 1) - (i635 ^ 7);
                    int i637 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    Object[] objArr141 = new Object[1];
                    a(i634, i636, (char) (((i637 | 61129) << 1) - (i637 ^ 61129)), objArr141);
                    String str59 = (String) objArr141[0];
                    int i638 = -(-View.MeasureSpec.getSize(0));
                    int i639 = (i638 ^ 857) + ((i638 & 857) << 1);
                    int i640 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    Object[] objArr142 = new Object[1];
                    a(i639, ((i640 | 8) << 1) - (i640 ^ 8), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr142);
                    String str60 = (String) objArr142[0];
                    Object[] objArr143 = new Object[1];
                    a(863 - (~(-(-(ViewConfiguration.getMinimumFlingVelocity() >> 16)))), AndroidCharacter.getMirror('0') - '%', (char) (KeyEvent.getMaxKeyCode() >> 16), objArr143);
                    String str61 = (String) objArr143[0];
                    int i641 = -(-(ViewConfiguration.getWindowTouchSlop() >> 8));
                    Object[] objArr144 = new Object[1];
                    a((i641 ^ 875) + ((i641 & 875) << 1), (Process.myTid() >> 22) + 14, (char) TextUtils.getOffsetAfter(str11, 0), objArr144);
                    int i642 = 888 - (~(-(ViewConfiguration.getLongPressTimeout() >> 16)));
                    int i643 = -AndroidCharacter.getMirror('0');
                    int i644 = (i643 & 64) + (i643 | 64);
                    int iLastIndexOf4 = TextUtils.lastIndexOf(str11, '0', 0, 0);
                    int i645 = (iLastIndexOf4 * (-183)) + 9807775;
                    int i646 = ~iLastIndexOf4;
                    int i647 = ((i646 ^ 53015) | (i646 & 53015)) * (-368);
                    int i648 = (i645 & i647) + (i645 | i647);
                    int i649 = ((-53016) & iLastIndexOf4) | (iLastIndexOf4 ^ (-53016));
                    int i650 = (i648 - (~(-(-(((i649 & i61) | (i649 ^ i61)) * 184))))) - 1;
                    int i651 = ~(((-53016) & i646) | (i646 ^ (-53016)));
                    int i652 = ~((i61 ^ iLastIndexOf4) | (i61 & iLastIndexOf4));
                    char c6 = (char) (i650 + (((i651 & i652) | (i651 ^ i652) | (~((iLastIndexOf4 ^ 53015) | (iLastIndexOf4 & 53015)))) * 184));
                    Object[] objArr145 = new Object[1];
                    a(i642, i644, c6, objArr145);
                    String str62 = (String) objArr145[0];
                    int i653 = 904 - (~(-View.MeasureSpec.getSize(0)));
                    int touchSlop3 = ViewConfiguration.getTouchSlop() >> 8;
                    Object[] objArr146 = new Object[1];
                    a(i653, (touchSlop3 ^ 3) + ((touchSlop3 & 3) << 1), (char) (ViewConfiguration.getPressedStateDuration() >> 16), objArr146);
                    String str63 = (String) objArr146[0];
                    int i654 = -(-(ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    int i655 = 21 - (~(-(-Color.green(0))));
                    int i656 = -(-TextUtils.getOffsetBefore(str11, 0));
                    Object[] objArr147 = new Object[1];
                    a((i654 ^ 916) + ((i654 & 916) << 1), i655, (char) ((i656 & 49618) + (i656 | 49618)), objArr147);
                    String str64 = (String) objArr147[0];
                    int i657 = -TextUtils.getCapsMode(str11, 0, 0);
                    int iTuitionPaymentFragmentbindingInflater10 = zzo.TuitionPaymentFragmentbindingInflater1();
                    int i658 = (i657 * (-963)) + 904206;
                    int i659 = ~i657;
                    int i660 = ~((-939) | iTuitionPaymentFragmentbindingInflater10);
                    int i661 = -(-(((i659 & i660) | (i659 ^ i660)) * (-964)));
                    int i662 = (i658 ^ i661) + ((i658 & i661) << 1);
                    int i663 = ~((~iTuitionPaymentFragmentbindingInflater10) | (-939));
                    int i664 = ~((i657 & (-939)) | ((-939) ^ i657));
                    Object[] objArr148 = new Object[1];
                    a((i662 - (~(-(-(((i664 & i663) | (i663 ^ i664)) * (-964)))))) - 1, 24 - MotionEvent.axisFromString(str11), (char) (52831 - (~(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))), objArr148);
                    String str65 = (String) objArr148[0];
                    int i665 = -MotionEvent.axisFromString(str11);
                    int i666 = (i665 & 962) + (i665 | 962);
                    int scrollBarSize4 = (ViewConfiguration.getScrollBarSize() >> 8) + 28;
                    int i667 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    Object[] objArr149 = new Object[1];
                    a(i666, scrollBarSize4, (char) (((i667 | 48696) << 1) - (i667 ^ 48696)), objArr149);
                    String str66 = (String) objArr149[0];
                    str12 = str11;
                    int i668 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int i669 = (i668 ^ 991) + ((i668 & 991) << 1);
                    int i670 = -(-(ViewConfiguration.getLongPressTimeout() >> 16));
                    Object[] objArr150 = new Object[1];
                    a(i669, (i670 ^ 11) + ((i670 & 11) << 1), (char) (22582 - (~(-(-View.resolveSizeAndState(0, 0, 0))))), objArr150);
                    String str67 = (String) objArr150[0];
                    int i671 = 1001 - (~(-(-Color.blue(0))));
                    int i672 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    Object[] objArr151 = new Object[1];
                    a(i671, (i672 & 9) + (i672 | 9), (char) ((-ExpandableListView.getPackedPositionChild(0L)) - 1), objArr151);
                    String str68 = (String) objArr151[0];
                    Object[] objArr152 = new Object[1];
                    a(1010 - (~(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))), 5 - (~(-(-(ViewConfiguration.getScrollDefaultDelay() >> 16)))), (char) (0 - (~TextUtils.lastIndexOf(str12, '0', 0))), objArr152);
                    String str69 = (String) objArr152[0];
                    Object[] objArr153 = new Object[1];
                    a(1015 - (~(-(Process.myTid() >> 22))), Color.alpha(0) + 6, (char) TextUtils.getOffsetBefore(str12, 0), objArr153);
                    int i673 = -TextUtils.getTrimmedLength(str12);
                    Object[] objArr154 = new Object[1];
                    a(((i673 | 1022) << 1) - (i673 ^ 1022), 15 - (~(-(ViewConfiguration.getScrollBarSize() >> 8))), (char) View.resolveSize(0, 0), objArr154);
                    String str70 = (String) objArr154[0];
                    int i674 = 856 - (~(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))));
                    int i675 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    Object[] objArr155 = new Object[1];
                    a(i674, ((i675 | 6) << 1) - (i675 ^ 6), (char) View.getDefaultSize(0, 0), objArr155);
                    String str71 = (String) objArr155[0];
                    int maximumDrawingCacheSize7 = 825 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int i676 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                    Object[] objArr156 = new Object[1];
                    a(maximumDrawingCacheSize7, (i676 & 8) + (i676 | 8), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr156);
                    int i677 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int i678 = (i677 & 1038) + (i677 | 1038);
                    int i679 = -(-ExpandableListView.getPackedPositionType(0L));
                    Object[] objArr157 = new Object[1];
                    a(i678, (i679 ^ 14) + ((i679 & 14) << 1), (char) ((-2) - ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) ^ (-1))), objArr157);
                    String str72 = (String) objArr157[0];
                    Object[] objArr158 = new Object[1];
                    a(1052 - View.MeasureSpec.makeMeasureSpec(0, 0), View.combineMeasuredStates(0, 0) + 1, (char) Gravity.getAbsoluteGravity(0, 0), objArr158);
                    int i680 = 1052 - (~(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))));
                    int threadPriority4 = Process.getThreadPriority(0);
                    int i681 = 8 - (~((((threadPriority4 | 20) << 1) - (threadPriority4 ^ 20)) >> 6));
                    int i682 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    Object[] objArr159 = new Object[1];
                    a(i680, i681, (char) (((i682 | 33325) << 1) - (i682 ^ 33325)), objArr159);
                    int offsetAfter3 = 1062 - TextUtils.getOffsetAfter(str12, 0);
                    int i683 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int edgeSlop10 = ViewConfiguration.getEdgeSlop();
                    int i684 = TuitionPaymentFragmentbindingInflater1;
                    int i685 = (i684 & 93) + (i684 | 93);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i685 % 128;
                    int i686 = i685 % 2;
                    int i687 = -(-(edgeSlop10 >> 16));
                    Object[] objArr160 = new Object[1];
                    a(offsetAfter3, i683, (char) ((15029 & i687) + (i687 | 15029)), objArr160);
                    String[] strArr27 = {(String) objArr159[0], (String) objArr160[0]};
                    int threadPriority5 = Process.getThreadPriority(0);
                    int i688 = (-10021) - (~(threadPriority5 * TypedValues.PositionType.TYPE_PERCENT_WIDTH));
                    int i689 = ~threadPriority5;
                    int i690 = ~((i689 & i) | (i689 ^ i));
                    int i691 = ~((threadPriority5 ^ 20) | (threadPriority5 & 20));
                    int i692 = i688 + (((i690 & i691) | (i690 ^ i691)) * (-502));
                    int i693 = ~threadPriority5;
                    int i694 = (i693 ^ i42) | (i693 & i42);
                    int i695 = (~((i694 & 20) | (i694 ^ 20))) * (-502);
                    int i696 = (i692 ^ i695) + ((i692 & i695) << 1);
                    int i697 = ~(((-21) & i) | ((-21) ^ i));
                    int i698 = -(-(((i693 & i697) | (i693 ^ i697)) * TypedValues.PositionType.TYPE_DRAWPATH));
                    int i699 = 1062 - (~(-(((i696 & i698) + (i698 | i696)) >> 6)));
                    int i700 = 15 - (~(-(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))));
                    int gidForName = Process.getGidForName(str12);
                    Object[] objArr161 = new Object[1];
                    a(i699, i700, (char) (((gidForName | 1) << 1) - (gidForName ^ 1)), objArr161);
                    String str73 = (String) objArr161[0];
                    int i701 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int i702 = (i701 & TypedValues.Custom.TYPE_DIMENSION) + (i701 | TypedValues.Custom.TYPE_DIMENSION);
                    int i703 = -(-MotionEvent.axisFromString(str12));
                    Object[] objArr162 = new Object[1];
                    a(i702, (i703 ^ 4) + ((i703 & 4) << 1), (char) ExpandableListView.getPackedPositionType(0L), objArr162);
                    String str74 = (String) objArr162[0];
                    int i704 = -(-(ViewConfiguration.getWindowTouchSlop() >> 8));
                    int i705 = (i704 & 850) + (i704 | 850);
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 7;
                    int i706 = -(-(ViewConfiguration.getTouchSlop() >> 8));
                    Object[] objArr163 = new Object[1];
                    a(i705, longPressTimeout, (char) ((i706 & 61130) + (i706 | 61130)), objArr163);
                    String str75 = (String) objArr163[0];
                    int mirror2 = 1127 - AndroidCharacter.getMirror('0');
                    int i707 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    Object[] objArr164 = new Object[1];
                    a(mirror2, ((i707 | 8) << 1) - (i707 ^ 8), (char) (0 - (~(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))))), objArr164);
                    String str76 = (String) objArr164[0];
                    int i708 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int iTuitionPaymentFragmentbindingInflater11 = zzo.TuitionPaymentFragmentbindingInflater1();
                    int i709 = (((i708 * (-159)) - 137376) - (~(-(-(((~i708) | 864) * 160))))) - 1;
                    int i710 = ~((~iTuitionPaymentFragmentbindingInflater11) | i708);
                    int i711 = ~(i708 | 864);
                    int i712 = ((i710 ^ i711) | (i710 & i711)) * (-160);
                    int i713 = ~iTuitionPaymentFragmentbindingInflater11;
                    int i714 = ~((i713 & (-865)) | ((-865) ^ i713));
                    int i715 = ((((i709 | i712) << 1) - (i709 ^ i712)) - (~(((i708 & i714) | (i708 ^ i714)) * 160))) - 1;
                    int threadPriority6 = Process.getThreadPriority(0);
                    Object[] objArr165 = new Object[1];
                    a(i715, 10 - (~(-((((threadPriority6 | 20) << 1) - (threadPriority6 ^ 20)) >> 6))), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr165);
                    String str77 = (String) objArr165[0];
                    int iIndexOf11 = TextUtils.indexOf((CharSequence) str12, '0', 0, 0);
                    int i716 = ((iIndexOf11 | 876) << 1) - (iIndexOf11 ^ 876);
                    int i717 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                    int i718 = ((i717 | 14) << 1) - (i717 ^ 14);
                    int i719 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    Object[] objArr166 = new Object[1];
                    a(i716, i718, (char) ((i719 & 1) + (i719 | 1)), objArr166);
                    int i720 = -View.resolveSize(0, 0);
                    Object[] objArr167 = new Object[1];
                    a(((i720 | 1087) << 1) - (i720 ^ 1087), 20 - (~(-(-((byte) KeyEvent.getModifierMetaStateMask())))), (char) ((Process.myPid() >> 22) + 63256), objArr167);
                    String str78 = (String) objArr167[0];
                    int i721 = 1106 - (~ExpandableListView.getPackedPositionType(0L));
                    int packedPositionType5 = 19 - ExpandableListView.getPackedPositionType(0L);
                    int i722 = -TextUtils.indexOf((CharSequence) str12, '0', 0, 0);
                    Object[] objArr168 = new Object[1];
                    a(i721, packedPositionType5, (char) (((i722 | 32548) << 1) - (i722 ^ 32548)), objArr168);
                    String str79 = (String) objArr168[0];
                    int i723 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int iTuitionPaymentFragmentbindingInflater12 = zzo.TuitionPaymentFragmentbindingInflater1();
                    int i724 = i723 * 319;
                    int i725 = ((i724 | (-356942)) << 1) - (i724 ^ (-356942));
                    int i726 = ~i723;
                    int i727 = ~((i726 & iTuitionPaymentFragmentbindingInflater12) | (i726 ^ iTuitionPaymentFragmentbindingInflater12));
                    int i728 = ((i727 & (-1127)) | ((-1127) ^ i727)) * (-318);
                    int i729 = ((i725 | i728) << 1) - (i728 ^ i725);
                    int i730 = ~(((-1127) ^ iTuitionPaymentFragmentbindingInflater12) | ((-1127) & iTuitionPaymentFragmentbindingInflater12));
                    int i731 = ~iTuitionPaymentFragmentbindingInflater12;
                    int i732 = ~((i731 & i723) | (i731 ^ i723) | 1126);
                    int i733 = ((i730 & i732) | (i730 ^ i732)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                    int i734 = (i729 ^ i733) + ((i733 & i729) << 1);
                    int i735 = ~iTuitionPaymentFragmentbindingInflater12;
                    int i736 = (i735 & (-1127)) | ((-1127) ^ i735);
                    int i737 = ~((i736 & i723) | (i736 ^ i723));
                    int i738 = (i723 & 1126) | (i723 ^ 1126);
                    int i739 = ~((i738 & iTuitionPaymentFragmentbindingInflater12) | (i738 ^ iTuitionPaymentFragmentbindingInflater12));
                    int i740 = ((i739 & i737) | (i737 ^ i739)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                    int i741 = (i734 ^ i740) + ((i740 & i734) << 1);
                    int windowTouchSlop9 = ViewConfiguration.getWindowTouchSlop() >> 8;
                    int i742 = ((windowTouchSlop9 | 31) << 1) - (windowTouchSlop9 ^ 31);
                    int i743 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    Object[] objArr169 = new Object[1];
                    a(i741, i742, (char) (((i743 | 57796) << 1) - (i743 ^ 57796)), objArr169);
                    String str80 = (String) objArr169[0];
                    int i744 = 1156 - (~(-(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))));
                    int trimmedLength4 = TextUtils.getTrimmedLength(str12);
                    int i745 = (trimmedLength4 ^ 26) + ((trimmedLength4 & 26) << 1);
                    int i746 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    char c7 = (char) (((i746 | 63007) << 1) - (63007 ^ i746));
                    Object[] objArr170 = new Object[1];
                    a(i744, i745, c7, objArr170);
                    String str81 = (String) objArr170[0];
                    int i747 = -(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                    int iLastIndexOf5 = TextUtils.lastIndexOf(str12, '0');
                    Object[] objArr171 = new Object[1];
                    a((i747 & 1183) + (i747 | 1183), (iLastIndexOf5 ^ 24) + ((iLastIndexOf5 & 24) << 1), (char) ((-2) - (~(-TextUtils.lastIndexOf(str12, '0')))), objArr171);
                    String str82 = (String) objArr171[0];
                    int i748 = -(ViewConfiguration.getScrollBarSize() >> 8);
                    int i749 = (i748 & 1206) + (i748 | 1206);
                    int i750 = -TextUtils.getTrimmedLength(str12);
                    int i751 = (i750 & 33) + (i750 | 33);
                    int i752 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    Object[] objArr172 = new Object[1];
                    a(i749, i751, (char) ((i752 ^ 44774) + ((i752 & 44774) << 1)), objArr172);
                    Object[] objArr173 = new Object[1];
                    a(1238 - (~(-Color.green(0))), 13 - (~TextUtils.indexOf((CharSequence) str12, '0')), (char) (58304 - (~(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24)))), objArr173);
                    String str83 = (String) objArr173[0];
                    int iIndexOf12 = TextUtils.indexOf((CharSequence) str12, '0');
                    int i753 = (iIndexOf12 & 819) + (iIndexOf12 | 819);
                    int i754 = -(-ExpandableListView.getPackedPositionChild(0L));
                    Object[] objArr174 = new Object[1];
                    a(i753, (i754 ^ 8) + ((i754 & 8) << 1), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr174);
                    int i755 = -TextUtils.lastIndexOf(str12, '0');
                    Object[] objArr175 = new Object[1];
                    a(((i755 | 1251) << 1) - (i755 ^ 1251), (ViewConfiguration.getTapTimeout() >> 16) + 30, (char) (34014 - (~(-(-(ViewConfiguration.getTapTimeout() >> 16))))), objArr175);
                    String str84 = (String) objArr175[0];
                    int i756 = -(-(ViewConfiguration.getScrollBarFadeDuration() >> 16));
                    int i757 = ((i756 | 1282) << 1) - (i756 ^ 1282);
                    int iIndexOf13 = 11 - TextUtils.indexOf(str12, str12, 0);
                    int i758 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                    Object[] objArr176 = new Object[1];
                    a(i757, iIndexOf13, (char) ((i758 ^ 30530) + ((i758 & 30530) << 1)), objArr176);
                    int i759 = -Color.rgb(0, 0, 0);
                    int i760 = (i759 * 141) - 1963113999;
                    int i761 = ~i759;
                    int i762 = ~((i761 ^ (-16775923)) | (i761 & (-16775923)));
                    int i763 = ~(i761 | i);
                    int i764 = -(-(((i762 & i763) | (i762 ^ i763)) * (-280)));
                    int i765 = ((i760 | i764) << 1) - (i760 ^ i764);
                    int i766 = ~((i761 ^ i) | (i761 & i));
                    int i767 = ~((16775922 ^ i) | (16775922 & i));
                    int i768 = i765 + (((i766 & i767) | (i766 ^ i767)) * 140);
                    int i769 = (i761 ^ 16775922) | (16775922 & i761);
                    int i770 = i761 | i42;
                    int i771 = (~((i769 & i) | (i769 ^ i))) | (~((i770 & (-16775923)) | (i770 ^ (-16775923))));
                    int i772 = (16775922 & i61) | (16775922 ^ i61);
                    Object[] objArr177 = new Object[1];
                    a(i768 + (((~((i759 & i772) | (i772 ^ i759))) | i771) * 140), 19 - (Process.myTid() >> 22), (char) (3737 - View.MeasureSpec.makeMeasureSpec(0, 0)), objArr177);
                    String str85 = (String) objArr177[0];
                    Object[] objArr178 = new Object[1];
                    a((ViewConfiguration.getKeyRepeatDelay() >> 16) + 1312, 4 - (~(-ExpandableListView.getPackedPositionGroup(0L))), (char) (ViewConfiguration.getTouchSlop() >> 8), objArr178);
                    int i773 = 1318 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int i774 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    Object[] objArr179 = new Object[1];
                    a(i773, (i774 & 18) + (i774 | 18), (char) (View.resolveSize(0, 0) + 36199), objArr179);
                    int mirror3 = AndroidCharacter.getMirror('0') + 1288;
                    int fadingEdgeLength2 = ViewConfiguration.getFadingEdgeLength() >> 16;
                    Object[] objArr180 = new Object[1];
                    a(mirror3, (fadingEdgeLength2 ^ 16) + ((fadingEdgeLength2 & 16) << 1), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr180);
                    int touchSlop4 = (ViewConfiguration.getTouchSlop() >> 8) + 1352;
                    int offsetAfter4 = TextUtils.getOffsetAfter(str12, 0);
                    int iTuitionPaymentFragmentbindingInflater13 = zzo.TuitionPaymentFragmentbindingInflater1();
                    int i775 = (offsetAfter4 * (-500)) - 9500;
                    int i776 = ~((-20) | offsetAfter4);
                    int i777 = ~offsetAfter4;
                    int i778 = i777 | 19;
                    int i779 = i775 + ((i776 | (~((i778 & iTuitionPaymentFragmentbindingInflater13) | (i778 ^ iTuitionPaymentFragmentbindingInflater13)))) * TypedValues.PositionType.TYPE_TRANSITION_EASING);
                    int i780 = -(-((~((i777 ^ (-20)) | (i777 & (-20)))) * 1002));
                    int i781 = ((i779 | i780) << 1) - (i779 ^ i780);
                    int i782 = ~iTuitionPaymentFragmentbindingInflater13;
                    int i783 = (i782 & i777) | (i777 ^ i782);
                    int i784 = (~((i783 & 19) | (i783 ^ 19))) * TypedValues.PositionType.TYPE_TRANSITION_EASING;
                    Object[] objArr181 = new Object[1];
                    a(touchSlop4, ((i781 | i784) << 1) - (i784 ^ i781), (char) KeyEvent.normalizeMetaState(0), objArr181);
                    int i785 = -(Process.myTid() >> 22);
                    Object[] objArr182 = new Object[1];
                    a((i785 ^ 1371) + ((i785 & 1371) << 1), (KeyEvent.getMaxKeyCode() >> 16) + 19, (char) (41785 - (~(-(-View.getDefaultSize(0, 0))))), objArr182);
                    int i786 = -(KeyEvent.getMaxKeyCode() >> 16);
                    int i787 = (i786 ^ 1390) + ((i786 & 1390) << 1);
                    int i788 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    int iIndexOf14 = TextUtils.indexOf(str12, str12, 0);
                    Object[] objArr183 = new Object[1];
                    a(i787, ((i788 | 24) << 1) - (i788 ^ 24), (char) ((iIndexOf14 ^ 24866) + ((iIndexOf14 & 24866) << 1)), objArr183);
                    int i789 = -(-(ViewConfiguration.getJumpTapTimeout() >> 16));
                    int i790 = (i789 ^ 1413) + ((i789 & 1413) << 1);
                    int i791 = -(Process.myPid() >> 22);
                    Object[] objArr184 = new Object[1];
                    a(i790, (i791 & 21) + (i791 | 21), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr184);
                    int i792 = -(Process.myTid() >> 22);
                    int i793 = (i792 ^ 1434) + ((i792 & 1434) << 1);
                    int mirror4 = 'H' - AndroidCharacter.getMirror('0');
                    int i794 = -TextUtils.getCapsMode(str12, 0, 0);
                    Object[] objArr185 = new Object[1];
                    a(i793, mirror4, (char) (((i794 | 41114) << 1) - (i794 ^ 41114)), objArr185);
                    String str86 = str2;
                    int i795 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                    int i796 = (i795 ^ 1458) + ((i795 & 1458) << 1);
                    int i797 = -TextUtils.getOffsetAfter(str12, 0);
                    Object[] objArr186 = new Object[1];
                    a(i796, ((i797 | 28) << 1) - (i797 ^ 28), (char) ((-2) - (~(-(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))))), objArr186);
                    int i798 = 1486 - (~(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))));
                    int i799 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                    Object[] objArr187 = new Object[1];
                    a(i798, ((i799 | 27) << 1) - (i799 ^ 27), (char) KeyEvent.normalizeMetaState(0), objArr187);
                    int i800 = -TextUtils.indexOf((CharSequence) str12, '0', 0, 0);
                    int i801 = ((i800 | 1512) << 1) - (i800 ^ 1512);
                    int i802 = -(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    int i803 = ((i802 | 31) << 1) - (i802 ^ 31);
                    int i804 = -(-TextUtils.lastIndexOf(str12, '0'));
                    Object[] objArr188 = new Object[1];
                    a(i801, i803, (char) ((i804 & 1) + (i804 | 1)), objArr188);
                    int i805 = 1544 - (~(-(-Process.getGidForName(str12))));
                    char mirror5 = AndroidCharacter.getMirror('0');
                    Object[] objArr189 = new Object[1];
                    a(i805, (mirror5 ^ (-21)) + ((mirror5 & (-21)) << 1), (char) (ViewConfiguration.getTapTimeout() >> 16), objArr189);
                    int i806 = 1571 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int i807 = -(-TextUtils.getOffsetAfter(str12, 0));
                    Object[] objArr190 = new Object[1];
                    a(i806, ((i807 | 32) << 1) - (i807 ^ 32), (char) View.getDefaultSize(0, 0), objArr190);
                    strArr5 = new String[][]{new String[]{str55, str56, str57, (String) objArr139[0]}, new String[]{str58, str59, str60, str61, (String) objArr144[0]}, new String[]{str62, str63, str2, str64, str65, str66}, new String[]{str67, str68, str69, (String) objArr153[0]}, new String[]{str70, str71, (String) objArr156[0]}, new String[]{str72, (String) objArr158[0]}, strArr27, new String[]{str73, str74, str75, str76, str77, (String) objArr166[0]}, new String[]{str78, str79, str80, str81, str82, (String) objArr172[0], str2}, new String[]{str83, (String) objArr174[0]}, new String[]{str84, (String) objArr176[0]}, new String[]{str85, (String) objArr178[0]}, new String[]{(String) objArr179[0]}, new String[]{(String) objArr180[0]}, new String[]{(String) objArr181[0]}, new String[]{(String) objArr182[0]}, new String[]{(String) objArr183[0]}, new String[]{(String) objArr184[0]}, new String[]{(String) objArr185[0], str86}, new String[]{(String) objArr186[0], str86}, new String[]{(String) objArr187[0], str86}, new String[]{(String) objArr188[0], str86}, new String[]{(String) objArr189[0], str86}, new String[]{(String) objArr190[0], str86}};
                    int i808 = -(-((Process.getThreadPriority(0) + 20) >> 6));
                    Object[] objArr191 = new Object[1];
                    a((i808 ^ 1603) + ((i808 & 1603) << 1), 1 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (KeyEvent.normalizeMetaState(0) + 63692), objArr191);
                    sb = new StringBuilder((String) objArr191[0]);
                    i64 = i;
                    i65 = 0;
                    i66 = 0;
                    while (i65 < 24) {
                        int i809 = TuitionPaymentFragmentbindingInflater1;
                        i69 = (i809 & 113) + (i809 | 113);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i69 % 128;
                        if (i69 % 2 == 0) {
                            String[] strArr28 = strArr5[i65];
                            Object[] objArr192 = {strArr28[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                                char modifierMetaStateMask9 = (char) (33601 - ((byte) KeyEvent.getModifierMetaStateMask()));
                                int iLastIndexOf6 = TextUtils.lastIndexOf(str12, '0', 0) + 3086;
                                int iKeyCodeFromString5 = KeyEvent.keyCodeFromString(str12) + 26;
                                byte b60 = (byte) 0;
                                byte b61 = (byte) (b60 + 5);
                                Object[] objArr193 = new Object[1];
                                c(b60, b61, (byte) (b61 - 5), objArr193);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(modifierMetaStateMask9, iLastIndexOf6, iKeyCodeFromString5, 1411172903, false, (String) objArr193[0], new Class[]{String.class});
                            }
                            str13 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr192);
                            strArr7 = strArr28;
                            strArr5 = strArr5;
                        } else {
                            i63 = i63;
                            i64 = i64;
                            strArr7 = strArr5[i65];
                            Object[] objArr194 = {strArr7[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                                char cIndexOf3 = (char) (33602 - TextUtils.indexOf(str12, str12));
                                int iCombineMeasuredStates3 = View.combineMeasuredStates(0, 0) + 3085;
                                int iLastIndexOf7 = TextUtils.lastIndexOf(str12, '0') + 27;
                                byte b62 = (byte) 0;
                                byte b63 = (byte) (b62 + 5);
                                Object[] objArr195 = new Object[1];
                                c(b62, b63, (byte) (b63 - 5), objArr195);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cIndexOf3, iCombineMeasuredStates3, iLastIndexOf7, 1411172903, false, (String) objArr195[0], new Class[]{String.class});
                            }
                            str13 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr194);
                        }
                        String[] strArr29 = (String[]) Arrays.copyOfRange(strArr7, 1, strArr7.length);
                        if (str13 != null || str13.isEmpty()) {
                            i70 = i61;
                            i71 = 1;
                        } else {
                            if (strArr7.length != 1) {
                                Object[] objArr196 = {str13, strArr29};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1514294371);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault31 == null) {
                                    char c8 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                    int i810 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3357;
                                    int threadPriority7 = ((Process.getThreadPriority(0) + 20) >> 6) + 18;
                                    byte b64 = (byte) 0;
                                    byte b65 = (byte) (b64 + 5);
                                    Object[] objArr197 = new Object[1];
                                    c(b64, b65, (byte) (b65 - 5), objArr197);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault31 = initSession.b(c8, i810, threadPriority7, -1092817996, false, (String) objArr197[0], new Class[]{String.class, String[].class});
                                }
                                long jLongValue25 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault31).invoke(null, objArr196)).longValue();
                                long j140 = 1251246320;
                                i70 = i61;
                                long j141 = -574;
                                long j142 = j140 ^ j2;
                                long jMaxMemory = (int) Runtime.getRuntime().maxMemory();
                                long j143 = jMaxMemory ^ j2;
                                long j144 = ((jLongValue25 ^ j2) | jMaxMemory) ^ j2;
                                long j145 = (j141 * j140) + (j141 * jLongValue25) + (((long) 1150) * (((j142 | j143) ^ j2) | j144)) + (((long) (-575)) * (j144 | ((j143 | jLongValue25) ^ j2))) + (((long) 575) * (((j142 | jMaxMemory) ^ j2) | ((j143 | j140) ^ j2))) + ((long) 891736018);
                                int i811 = ~(2126370815 | i);
                                int i812 = ((int) (j145 >> 32)) & (208391018 + ((605028880 | i811) * (-476)) + (i811 * 952) + ((~(2126370815 | i70)) * 476));
                                int iMyUid6 = Process.myUid();
                                int i813 = ~iMyUid6;
                                int i814 = ((int) j145) & ((-1729170751) + (((-1210056962) | iMyUid6) * (-676)) + (((~((-1306528068) | i813)) | 1210056961) * 676) + (((~(iMyUid6 | (-96471107))) | (~(i813 | 130698342)) | (-1340755304)) * 676));
                                if (((i812 & i814) | (i812 ^ i814)) == 0) {
                                    i71 = 1;
                                }
                                i65 = ((i65 | 1) << i71) - (i65 ^ 1);
                                i61 = i70;
                                strArr5 = strArr5;
                                i63 = i63;
                            } else {
                                i70 = i61;
                                str13 = str13;
                            }
                            i64 = i ^ ((i65 ^ 10) + ((i65 & 10) << 1));
                            i66++;
                            if (i66 > 1) {
                                int iIndexOf15 = TextUtils.indexOf(str12, str12, 0) + 1604;
                                int i815 = -TextUtils.indexOf((CharSequence) str12, '0', 0);
                                Object[] objArr198 = new Object[1];
                                a(iIndexOf15, (i815 & 1) + (i815 | 1), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), objArr198);
                                i72 = 0;
                                sb.append((String) objArr198[0]);
                            } else {
                                i72 = 0;
                            }
                            sb.append(strArr7[i72]);
                            int i816 = -Color.red(i72);
                            i71 = 1;
                            int i817 = (i816 ^ 1606) + ((i816 & 1606) << 1);
                            int offsetAfter5 = TextUtils.getOffsetAfter(str12, i72);
                            Object[] objArr199 = new Object[1];
                            a(i817, (offsetAfter5 ^ 1) + ((offsetAfter5 & 1) << 1), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr199);
                            sb.append((String) objArr199[i72]);
                            sb.append(str13);
                            i65 = ((i65 | 1) << i71) - (i65 ^ 1);
                            i61 = i70;
                            strArr5 = strArr5;
                            i63 = i63;
                        }
                        i64 = i64;
                        i65 = ((i65 | 1) << i71) - (i65 ^ 1);
                        i61 = i70;
                        strArr5 = strArr5;
                        i63 = i63;
                    }
                    int i818 = i63;
                    i67 = i61;
                    i68 = i64;
                    int i819 = -TextUtils.getCapsMode(str12, 0, 0);
                    int i820 = (i819 ^ 1607) + ((i819 & 1607) << 1);
                    int doubleTapTimeout2 = 1 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int i821 = -Color.blue(0);
                    int iTuitionPaymentFragmentbindingInflater14 = zzo.TuitionPaymentFragmentbindingInflater1();
                    int i822 = (i821 * (-380)) + 5451522;
                    int i823 = (iTuitionPaymentFragmentbindingInflater14 ^ 14271) | (iTuitionPaymentFragmentbindingInflater14 & 14271);
                    int i824 = ~i821;
                    int i825 = ((i823 & i824) | (i823 ^ i824)) * (-381);
                    int i826 = (i822 & i825) + (i822 | i825);
                    int i827 = ~(i824 | (-14272));
                    int i828 = ~((~iTuitionPaymentFragmentbindingInflater14) | 14271);
                    char c9 = (char) (i826 + (((~((i821 & 14271) | (i821 ^ 14271))) | (i828 & i827) | (i827 ^ i828)) * 381) + ((~((i824 ^ 14271) | (i824 & 14271))) * 381));
                    Object[] objArr200 = new Object[1];
                    a(i820, doubleTapTimeout2, c9, objArr200);
                    sb.append((String) objArr200[0]);
                    objArr3 = new Object[2];
                    if (i66 > 2) {
                        objArr3[0] = new int[1];
                        String[] strArr30 = {sb.toString()};
                        ((int[]) objArr3[0])[0] = i68;
                        objArr3[1] = strArr30;
                    } else {
                        objArr3[0] = new int[]{i};
                        objArr3[1] = new String[0];
                    }
                    int i829 = ((int[]) objArr3[0])[0];
                    int i830 = ((~i818) & i) | (i818 & i67);
                    int i831 = (i830 | (-i830)) >> 31;
                    int i832 = i829 & (~i831);
                    int i833 = i818 & i831;
                    i63 = (i833 & i832) | (i832 ^ i833);
                    strArr6 = (String[]) objArr3[1];
                    int i4613 = 888 - (~(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))));
                    int i4614 = -(-TextUtils.indexOf((CharSequence) str12, '0', 0, 0));
                    Object[] objArr812 = new Object[1];
                    a(i4613, ((i4614 | 17) << 1) - (i4614 ^ 17), (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 53014), objArr812);
                    Object[] objArr813 = {(String) objArr812[0]};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                        char deadChar3 = (char) (33602 - KeyEvent.getDeadChar(0, 0));
                        int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 3085;
                        int packedPositionType6 = ExpandableListView.getPackedPositionType(0L) + 26;
                        byte b413 = (byte) 0;
                        byte b414 = (byte) (b413 + 5);
                        Object[] objArr814 = new Object[1];
                        c(b413, b414, (byte) (b414 - 5), objArr814);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(deadChar3, jumpTapTimeout2, packedPositionType6, 1411172903, false, (String) objArr814[0], new Class[]{String.class});
                    }
                    objInvoke2 = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr813);
                    if (objInvoke2 == null) {
                        i73 = 0;
                    } else {
                        Object[] objArr815 = {objInvoke2, 42};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                            char cAlpha2 = (char) Color.alpha(0);
                            int i4615 = 3394 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                            int iIndexOf16 = TextUtils.indexOf((CharSequence) str12, '0', 0) + 10;
                            byte b415 = (byte) 0;
                            byte b416 = (byte) (b415 + 5);
                            Object[] objArr816 = new Object[1];
                            c(b415, b416, (byte) (b416 - 5), objArr816);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cAlpha2, i4615, iIndexOf16, 1203525406, false, (String) objArr816[0], new Class[]{String.class, Integer.TYPE});
                        }
                        long jLongValue112 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).invoke(null, objArr815)).longValue();
                        long j910 = 31585084;
                        long j911 = (((long) (-523)) * j910) + (((long) 263) * jLongValue112);
                        long j912 = 262;
                        long j1016 = ((j910 ^ j2) | jLongValue112) ^ j2;
                        long j1017 = jLongValue112 ^ j2;
                        long j1018 = (j910 | j1017) ^ j2;
                        long j1019 = j911 + ((j1016 | j1018 | ((j1017 | j3) ^ j2)) * j912) + (((long) (-786)) * j1018) + (j912 * (((j1017 | j4) ^ j2) | j1016 | j1018)) + ((long) (-33654961));
                        int i4616 = ((int) (j1019 >> 32)) & (((635053406 + (((~(1766687994 | i67)) | (~(1091052890 | i))) * (-370))) + ((((~(1766687994 | i)) | (~(1091052890 | i67))) | 1091044442) * (-370))) - 40482284);
                        int i4617 = ((int) j1019) & (2131573617 + (((~(1064955753 | i67)) | 372270656 | (~((-523789889) | i))) * (-68)) + ((~((-151519233) | i67)) * (-68)) + (((~(523789888 | i67)) | 913436521) * 68));
                        i73 = (i4616 & i4617) | (i4616 ^ i4617);
                    }
                    if (i73 != 1986687685) {
                        i100 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
                        TuitionPaymentFragmentbindingInflater1 = i100 % 128;
                        if (i100 % 2 != 0) {
                            int i4618 = 28 / 0;
                            if (i73 == -1514516938) {
                                i74 = i67;
                                str14 = str12;
                                strArr8 = strArr6;
                            } else {
                                i101 = 19;
                                int offsetBefore7 = TextUtils.getOffsetBefore(str12, 0);
                                Object[] objArr817 = new Object[1];
                                a((offsetBefore7 & 1608) + (offsetBefore7 | 1608), ImageFormat.getBitsPerPixel(0) + 15, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), objArr817);
                                int i4619 = -(-Gravity.getAbsoluteGravity(0, 0));
                                int i46110 = (i4619 & 1622) + (i4619 | 1622);
                                int i46111 = -TextUtils.getOffsetAfter(str12, 0);
                                Object[] objArr818 = new Object[1];
                                a(i46110, ((i46111 | 26) << 1) - (i46111 ^ 26), (char) Color.red(0), objArr818);
                                int i47110 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                int i47111 = (i47110 ^ 1649) + ((i47110 & 1649) << 1);
                                int packedPositionChild3 = ExpandableListView.getPackedPositionChild(0L);
                                int i47112 = (packedPositionChild3 ^ 18) + ((packedPositionChild3 & 18) << 1);
                                int i47113 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                Object[] objArr9110 = new Object[1];
                                a(i47111, i47112, (char) ((i47113 ^ 18429) + ((i47113 & 18429) << 1)), objArr9110);
                                int i47114 = -AndroidCharacter.getMirror('0');
                                int i47115 = (i47114 & 1713) + (i47114 | 1713);
                                int iAlpha5 = Color.alpha(0);
                                Object[] objArr9111 = new Object[1];
                                a(i47115, ((iAlpha5 | 17) << 1) - (iAlpha5 ^ 17), (char) TextUtils.indexOf(str12, str12, 0), objArr9111);
                                int i47116 = 1681 - (~(-(ViewConfiguration.getWindowTouchSlop() >> 8)));
                                int iIndexOf17 = TextUtils.indexOf((CharSequence) str12, '0', 0, 0);
                                int i47117 = (iIndexOf17 ^ 16) + ((iIndexOf17 & 16) << 1);
                                int i47118 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                Object[] objArr9112 = new Object[1];
                                a(i47116, i47117, (char) ((i47118 ^ 42519) + ((i47118 & 42519) << 1)), objArr9112);
                                int i47119 = -TextUtils.getTrimmedLength(str12);
                                int i48110 = (i47119 ^ 1697) + ((i47119 & 1697) << 1);
                                int iKeyCodeFromString6 = KeyEvent.keyCodeFromString(str12);
                                int i48111 = -View.resolveSizeAndState(0, 0, 0);
                                Object[] objArr9113 = new Object[1];
                                a(i48110, ((iKeyCodeFromString6 | 37) << 1) - (iKeyCodeFromString6 ^ 37), (char) (((i48111 | 24132) << 1) - (i48111 ^ 24132)), objArr9113);
                                Object[] objArr9114 = new Object[1];
                                a(1733 - (~(-TextUtils.indexOf(str12, str12, 0, 0))), 10 - (~(-(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))))), (char) ExpandableListView.getPackedPositionGroup(0L), objArr9114);
                                int scrollBarSize5 = 1746 - (ViewConfiguration.getScrollBarSize() >> 8);
                                int i48112 = -(-(ViewConfiguration.getScrollBarSize() >> 8));
                                Object[] objArr9115 = new Object[1];
                                a(scrollBarSize5, (i48112 & 13) + (i48112 | 13), (char) Color.blue(0), objArr9115);
                                int i48113 = -TextUtils.indexOf((CharSequence) str12, '0');
                                Object[] objArr9116 = new Object[1];
                                a((i48113 ^ 1758) + ((i48113 & 1758) << 1), 20 - (~(-TextUtils.lastIndexOf(str12, '0', 0))), (char) KeyEvent.normalizeMetaState(0), objArr9116);
                                int i48114 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                int i48115 = (i48114 & 1781) + (i48114 | 1781);
                                int i48116 = -View.resolveSize(0, 0);
                                int i48117 = ((i48116 | 31) << 1) - (i48116 ^ 31);
                                int i48118 = -(-TextUtils.lastIndexOf(str12, '0', 0, 0));
                                Object[] objArr9117 = new Object[1];
                                a(i48115, i48117, (char) ((i48118 ^ 1) + ((i48118 & 1) << 1)), objArr9117);
                                int iRgb3 = Color.rgb(0, 0, 0) + 16779028;
                                int iMyTid6 = Process.myTid() >> 22;
                                Object[] objArr9118 = new Object[1];
                                a(iRgb3, (iMyTid6 & 12) + (iMyTid6 | 12), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr9118);
                                String str410 = (String) objArr9118[0];
                                zzo.TuitionPaymentFragmentbindingInflater1();
                                int i48119 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                                Object[] objArr9119 = new Object[1];
                                a(((i48119 | 1824) << 1) - (i48119 ^ 1824), 12 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (11535 - (~(ViewConfiguration.getTapTimeout() >> 16))), objArr9119);
                                int offsetBefore8 = TextUtils.getOffsetBefore(str12, 0);
                                Object[] objArr10112 = new Object[1];
                                a((offsetBefore8 ^ 1836) + ((offsetBefore8 & 1836) << 1), 10 - (~(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (char) (0 - (~(-(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))))), objArr10112);
                                int iGreen3 = Color.green(0);
                                int i49110 = ((iGreen3 | 1848) << 1) - (iGreen3 ^ 1848);
                                int i49111 = -View.MeasureSpec.getMode(0);
                                Object[] objArr10113 = new Object[1];
                                a(i49110, (i49111 ^ 12) + ((i49111 & 12) << 1), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr10113);
                                int i49112 = -KeyEvent.normalizeMetaState(0);
                                int i49113 = (i49112 ^ 1860) + ((i49112 & 1860) << 1);
                                int i49114 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                int i49115 = -(-TextUtils.getOffsetAfter(str12, 0));
                                Object[] objArr10114 = new Object[1];
                                a(i49113, (i49114 & 11) + (i49114 | 11), (char) ((i49115 ^ 58504) + ((i49115 & 58504) << 1)), objArr10114);
                                int i49116 = 1871 - (~(ViewConfiguration.getDoubleTapTimeout() >> 16));
                                int i49117 = -(-View.resolveSizeAndState(0, 0, 0));
                                int i49118 = (i49117 ^ 14) + ((i49117 & 14) << 1);
                                int i49119 = -TextUtils.indexOf(str12, str12, 0);
                                Object[] objArr10115 = new Object[1];
                                a(i49116, i49118, (char) ((i49119 ^ 45017) + ((i49119 & 45017) << 1)), objArr10115);
                                int touchSlop5 = ViewConfiguration.getTouchSlop();
                                int i50110 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
                                TuitionPaymentFragmentbindingInflater1 = i50110 % 128;
                                int i50111 = i50110 % 2;
                                int i50112 = -(touchSlop5 >> 8);
                                int i50113 = ((1886 | i50112) << 1) - (i50112 ^ 1886);
                                int i50114 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                int i50115 = ((i50114 | 13) << 1) - (i50114 ^ 13);
                                int i50116 = -(-TextUtils.lastIndexOf(str12, '0', 0, 0));
                                Object[] objArr10116 = new Object[1];
                                a(i50113, i50115, (char) ((i50116 ^ 15060) + ((i50116 & 15060) << 1)), objArr10116);
                                int i50117 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                int i50118 = (i50117 ^ 1898) + ((i50117 & 1898) << 1);
                                int maximumDrawingCacheSize8 = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                                int iTuitionPaymentFragmentbindingInflater15 = zzo.TuitionPaymentFragmentbindingInflater1();
                                int i50119 = maximumDrawingCacheSize8 * (-244);
                                int i51110 = (i50119 ^ 5904) + ((i50119 & 5904) << 1);
                                int i51111 = ~iTuitionPaymentFragmentbindingInflater15;
                                int i51112 = (((i51110 - (~(((~(((-25) ^ maximumDrawingCacheSize8) | ((-25) & maximumDrawingCacheSize8))) | (~((i51111 & (-25)) | ((-25) ^ i51111)))) * (-245)))) - 1) - (~(-(-((~(((-25) ^ iTuitionPaymentFragmentbindingInflater15) | ((-25) & iTuitionPaymentFragmentbindingInflater15))) * (-245)))))) - 1;
                                int i51113 = ~((iTuitionPaymentFragmentbindingInflater15 & (-25)) | ((-25) ^ iTuitionPaymentFragmentbindingInflater15));
                                int i51114 = ((maximumDrawingCacheSize8 & i51113) | (maximumDrawingCacheSize8 ^ i51113)) * 245;
                                int i51115 = ((i51112 | i51114) << 1) - (i51114 ^ i51112);
                                int i51116 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                Object[] objArr10117 = new Object[1];
                                a(i50118, i51115, (char) ((i51116 ^ 1) + ((i51116 & 1) << 1)), objArr10117);
                                int i51117 = -(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                                int i51118 = -View.resolveSize(0, 0);
                                Object[] objArr10118 = new Object[1];
                                a((i51117 & 1921) + (i51117 | 1921), (i51118 & 28) + (i51118 | 28), (char) KeyEvent.keyCodeFromString(str12), objArr10118);
                                strArr13 = new String[]{(String) objArr817[0], (String) objArr818[0], (String) objArr9110[0], (String) objArr9111[0], (String) objArr9112[0], (String) objArr9113[0], (String) objArr9114[0], (String) objArr9115[0], (String) objArr9116[0], (String) objArr9117[0], str410, (String) objArr9119[0], (String) objArr10112[0], (String) objArr10113[0], (String) objArr10114[0], (String) objArr10115[0], (String) objArr10116[0], (String) objArr10117[0], (String) objArr10118[0]};
                                i102 = 0;
                                while (true) {
                                    if (i102 < i101) {
                                        i74 = i67;
                                        str14 = str12;
                                        strArr8 = strArr6;
                                        i103 = -1;
                                        break;
                                    }
                                    str18 = strArr13[i102];
                                    Object[] objArr10119 = {str18};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                                        char cIndexOf4 = (char) ((-1) - TextUtils.indexOf((CharSequence) str12, '0'));
                                        int edgeSlop11 = 993 - (ViewConfiguration.getEdgeSlop() >> 16);
                                        int capsMode4 = 8 - TextUtils.getCapsMode(str12, 0, 0);
                                        byte b417 = (byte) 0;
                                        byte b418 = (byte) (b417 + 5);
                                        Object[] objArr10120 = new Object[1];
                                        c(b417, b418, (byte) (b418 - 5), objArr10120);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(cIndexOf4, edgeSlop11, capsMode4, 410748506, false, (String) objArr10120[0], new Class[]{String.class});
                                    }
                                    long jLongValue113 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).invoke(null, objArr10119)).longValue();
                                    long j10110 = 1443778717;
                                    i74 = i67;
                                    str14 = str12;
                                    long j10111 = jLongValue113 ^ j2;
                                    i104 = i102;
                                    strArr8 = strArr6;
                                    long startElapsedRealtime6 = (int) Process.getStartElapsedRealtime();
                                    long j10112 = startElapsedRealtime6 ^ j2;
                                    long j10113 = (j10112 | jLongValue113) ^ j2;
                                    long j10114 = 516;
                                    long j10115 = j10110 ^ j2;
                                    j5 = (((long) (-515)) * j10110) + (((long) 517) * jLongValue113) + (((long) (-516)) * (((j10111 | startElapsedRealtime6) ^ j2) | ((j10112 | j10110) ^ j2) | j10113)) + (((((j10115 | j10111) | startElapsedRealtime6) ^ j2) | (((j10115 | j10112) | jLongValue113) ^ j2)) * j10114) + (j10114 * (((jLongValue113 | j10115) ^ j2) | j10113)) + ((long) (-1644696954));
                                    int i51119 = TuitionPaymentFragmentbindingInflater1;
                                    i105 = (i51119 ^ 97) + ((i51119 & 97) << 1);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i105 % 128;
                                    if (i105 % 2 == 0) {
                                        i109 = 1905160562 + (((~(1335175691 | i74)) | (-1607838284) | (~(1522565193 | i74)) | (~((-1249902602) | i))) * (-84));
                                        i110 = (~(1522565193 | i)) | (-1335175692);
                                        i111 = ~((-1522565194) | i74);
                                        if (((((int) (j5 << 95)) & (i109 + ((i110 | i111) * (-84)) + ((1249902601 | i111) * 84))) | (((int) j5) & (((1153123995 + ((1839902458 | i74) * 1444)) + ((((~((-1643106899) | i)) | 1638564434) | (~(205880488 | i))) * (-1444))) - 1264680934))) != 0) {
                                            int i52114 = 1871 - (~(-Gravity.getAbsoluteGravity(0, 0)));
                                            int i52115 = -ExpandableListView.getPackedPositionChild(0L);
                                            int i52116 = -ImageFormat.getBitsPerPixel(0);
                                            objArr4 = new Object[1];
                                            a(i52114, (i52115 ^ 13) + ((i52115 & 13) << 1), (char) ((i52116 & 45016) + (i52116 | 45016)), objArr4);
                                            if (str18.equals((String) objArr4[0])) {
                                                Object[] objArr101110 = {str18};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                                                    char maximumDrawingCacheSize9 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                    int i52117 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 992;
                                                    int edgeSlop12 = 8 - (ViewConfiguration.getEdgeSlop() >> 16);
                                                    byte b419 = (byte) 0;
                                                    Object[] objArr1110 = new Object[1];
                                                    c(b419, (byte) (b419 | 6), b419, objArr1110);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(maximumDrawingCacheSize9, i52117, edgeSlop12, 349342683, false, (String) objArr1110[0], new Class[]{String.class});
                                                }
                                                long jLongValue114 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).invoke(null, objArr101110)).longValue();
                                                long j1116 = -809468661;
                                                long j1117 = -159;
                                                long j1118 = (j1117 * j1116) + (j1117 * jLongValue114);
                                                long j1119 = 160;
                                                j6 = j1118 + (((j1116 ^ j2) | jLongValue114) * j1119) + (((long) (-160)) * (((j4 | j1116) ^ j2) | ((j1116 | jLongValue114) ^ j2))) + (j1119 * ((((jLongValue114 ^ j2) | j4) ^ j2) | j1116)) + ((long) (-37609944));
                                                int iMyUid7 = Process.myUid();
                                                int i52118 = ~iMyUid7;
                                                i108 = ((int) (j6 >> 32)) & (1871737038 + (((~((-363188387) | i52118)) | (~((-1074038025) | iMyUid7))) * 1900) + (((~(i52118 | 1074038024)) | (~(363188386 | iMyUid7))) * (-950)) + (((~(iMyUid7 | 1074038024)) | (~(i52118 | 363188386))) * 950));
                                                iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                                                if ((i108 | (((int) j6) & ((-635053948) + (((-141317) | iElapsedRealtime) * (-627)) + (((~(1756774086 | iElapsedRealtime)) | 319547676) * (-627)) + (((~(iElapsedRealtime | 319547676)) | (~((~iElapsedRealtime) | (-1756774087)))) * 627)))) != 0) {
                                                }
                                            }
                                            i102 = i104 + 1;
                                            i67 = i74;
                                            strArr13 = strArr13;
                                            str12 = str14;
                                            strArr6 = strArr8;
                                            i101 = 19;
                                        }
                                    } else {
                                        int i52119 = ~(((int) Process.getElapsedCpuTime()) | 1471042851);
                                        i106 = ((int) (j5 >> 32)) & ((((-1437444700) | i52119) * (-658)) + 2141790698 + ((i52119 | (-1471151996)) * 658));
                                        int startElapsedRealtime7 = (int) Process.getStartElapsedRealtime();
                                        int i52120 = ~((-5329922) | startElapsedRealtime7);
                                        i107 = ((int) j5) & (1864339449 + ((553648416 | i52120) * (-476)) + (i52120 * 952) + ((~((~startElapsedRealtime7) | (-5329922))) * 476));
                                        if (((i106 & i107) | (i106 ^ i107)) != 0) {
                                            int i521110 = 1871 - (~(-Gravity.getAbsoluteGravity(0, 0)));
                                            int i521111 = -ExpandableListView.getPackedPositionChild(0L);
                                            int i521112 = -ImageFormat.getBitsPerPixel(0);
                                            objArr4 = new Object[1];
                                            a(i521110, (i521111 ^ 13) + ((i521111 & 13) << 1), (char) ((i521112 & 45016) + (i521112 | 45016)), objArr4);
                                            if (str18.equals((String) objArr4[0])) {
                                                Object[] objArr101111 = {str18};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                                                    char maximumDrawingCacheSize10 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                    int i521113 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 992;
                                                    int edgeSlop13 = 8 - (ViewConfiguration.getEdgeSlop() >> 16);
                                                    byte b4110 = (byte) 0;
                                                    Object[] objArr1111 = new Object[1];
                                                    c(b4110, (byte) (b4110 | 6), b4110, objArr1111);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(maximumDrawingCacheSize10, i521113, edgeSlop13, 349342683, false, (String) objArr1111[0], new Class[]{String.class});
                                                }
                                                long jLongValue115 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).invoke(null, objArr101111)).longValue();
                                                long j11110 = -809468661;
                                                long j11111 = -159;
                                                long j11112 = (j11111 * j11110) + (j11111 * jLongValue115);
                                                long j11113 = 160;
                                                j6 = j11112 + (((j11110 ^ j2) | jLongValue115) * j11113) + (((long) (-160)) * (((j4 | j11110) ^ j2) | ((j11110 | jLongValue115) ^ j2))) + (j11113 * ((((jLongValue115 ^ j2) | j4) ^ j2) | j11110)) + ((long) (-37609944));
                                                int iMyUid8 = Process.myUid();
                                                int i521114 = ~iMyUid8;
                                                i108 = ((int) (j6 >> 32)) & (1871737038 + (((~((-363188387) | i521114)) | (~((-1074038025) | iMyUid8))) * 1900) + (((~(i521114 | 1074038024)) | (~(363188386 | iMyUid8))) * (-950)) + (((~(iMyUid8 | 1074038024)) | (~(i521114 | 363188386))) * 950));
                                                iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                                                if ((i108 | (((int) j6) & ((-635053948) + (((-141317) | iElapsedRealtime) * (-627)) + (((~(1756774086 | iElapsedRealtime)) | 319547676) * (-627)) + (((~(iElapsedRealtime | 319547676)) | (~((~iElapsedRealtime) | (-1756774087)))) * 627)))) != 0) {
                                                }
                                            }
                                            i102 = i104 + 1;
                                            i67 = i74;
                                            strArr13 = strArr13;
                                            str12 = str14;
                                            strArr6 = strArr8;
                                            i101 = 19;
                                        }
                                    }
                                    i103 = i104;
                                    break;
                                }
                                int i53110 = ((i103 | 130) << 1) - (i103 ^ 130);
                                int i53111 = (i53110 & i74) | ((~i53110) & i);
                                int i53112 = ~i103;
                                int i53113 = -i53112;
                                int i53114 = ((i53112 & i53113) | (i53112 ^ i53113)) >> 31;
                                int i53115 = TuitionPaymentFragmentbindingInflater1;
                                int i53116 = (i53115 ^ 103) + ((i53115 & 103) << 1);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i53116 % 128;
                                int i53117 = i53116 % 2;
                                int i53118 = (~i53114) & i;
                                int i53119 = i53111 & i53114;
                                int i5412 = (i53119 & i53118) | (i53118 ^ i53119);
                                int i5413 = i ^ i63;
                                int i5414 = -i5413;
                                int i5415 = ((i5413 & i5414) | (i5413 ^ i5414)) >> 31;
                                int i5416 = i5412 & (~i5415);
                                int i5417 = i63 & i5415;
                                i63 = (i5417 & i5416) | (i5416 ^ i5417);
                            }
                        } else if (i73 == -1514516938) {
                            i74 = i67;
                            str14 = str12;
                            strArr8 = strArr6;
                        } else {
                            i101 = 19;
                            int offsetBefore9 = TextUtils.getOffsetBefore(str12, 0);
                            Object[] objArr819 = new Object[1];
                            a((offsetBefore9 & 1608) + (offsetBefore9 | 1608), ImageFormat.getBitsPerPixel(0) + 15, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), objArr819);
                            int i46112 = -(-Gravity.getAbsoluteGravity(0, 0));
                            int i46113 = (i46112 & 1622) + (i46112 | 1622);
                            int i46114 = -TextUtils.getOffsetAfter(str12, 0);
                            Object[] objArr8110 = new Object[1];
                            a(i46113, ((i46114 | 26) << 1) - (i46114 ^ 26), (char) Color.red(0), objArr8110);
                            int i471110 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                            int i471111 = (i471110 ^ 1649) + ((i471110 & 1649) << 1);
                            int packedPositionChild4 = ExpandableListView.getPackedPositionChild(0L);
                            int i471112 = (packedPositionChild4 ^ 18) + ((packedPositionChild4 & 18) << 1);
                            int i471113 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            Object[] objArr91110 = new Object[1];
                            a(i471111, i471112, (char) ((i471113 ^ 18429) + ((i471113 & 18429) << 1)), objArr91110);
                            int i471114 = -AndroidCharacter.getMirror('0');
                            int i471115 = (i471114 & 1713) + (i471114 | 1713);
                            int iAlpha6 = Color.alpha(0);
                            Object[] objArr91111 = new Object[1];
                            a(i471115, ((iAlpha6 | 17) << 1) - (iAlpha6 ^ 17), (char) TextUtils.indexOf(str12, str12, 0), objArr91111);
                            int i471116 = 1681 - (~(-(ViewConfiguration.getWindowTouchSlop() >> 8)));
                            int iIndexOf18 = TextUtils.indexOf((CharSequence) str12, '0', 0, 0);
                            int i471117 = (iIndexOf18 ^ 16) + ((iIndexOf18 & 16) << 1);
                            int i471118 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                            Object[] objArr91112 = new Object[1];
                            a(i471116, i471117, (char) ((i471118 ^ 42519) + ((i471118 & 42519) << 1)), objArr91112);
                            int i471119 = -TextUtils.getTrimmedLength(str12);
                            int i481110 = (i471119 ^ 1697) + ((i471119 & 1697) << 1);
                            int iKeyCodeFromString7 = KeyEvent.keyCodeFromString(str12);
                            int i481111 = -View.resolveSizeAndState(0, 0, 0);
                            Object[] objArr91113 = new Object[1];
                            a(i481110, ((iKeyCodeFromString7 | 37) << 1) - (iKeyCodeFromString7 ^ 37), (char) (((i481111 | 24132) << 1) - (i481111 ^ 24132)), objArr91113);
                            Object[] objArr91114 = new Object[1];
                            a(1733 - (~(-TextUtils.indexOf(str12, str12, 0, 0))), 10 - (~(-(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))))), (char) ExpandableListView.getPackedPositionGroup(0L), objArr91114);
                            int scrollBarSize6 = 1746 - (ViewConfiguration.getScrollBarSize() >> 8);
                            int i481112 = -(-(ViewConfiguration.getScrollBarSize() >> 8));
                            Object[] objArr91115 = new Object[1];
                            a(scrollBarSize6, (i481112 & 13) + (i481112 | 13), (char) Color.blue(0), objArr91115);
                            int i481113 = -TextUtils.indexOf((CharSequence) str12, '0');
                            Object[] objArr91116 = new Object[1];
                            a((i481113 ^ 1758) + ((i481113 & 1758) << 1), 20 - (~(-TextUtils.lastIndexOf(str12, '0', 0))), (char) KeyEvent.normalizeMetaState(0), objArr91116);
                            int i481114 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int i481115 = (i481114 & 1781) + (i481114 | 1781);
                            int i481116 = -View.resolveSize(0, 0);
                            int i481117 = ((i481116 | 31) << 1) - (i481116 ^ 31);
                            int i481118 = -(-TextUtils.lastIndexOf(str12, '0', 0, 0));
                            Object[] objArr91117 = new Object[1];
                            a(i481115, i481117, (char) ((i481118 ^ 1) + ((i481118 & 1) << 1)), objArr91117);
                            int iRgb4 = Color.rgb(0, 0, 0) + 16779028;
                            int iMyTid7 = Process.myTid() >> 22;
                            Object[] objArr91118 = new Object[1];
                            a(iRgb4, (iMyTid7 & 12) + (iMyTid7 | 12), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr91118);
                            String str411 = (String) objArr91118[0];
                            zzo.TuitionPaymentFragmentbindingInflater1();
                            int i481119 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                            Object[] objArr91119 = new Object[1];
                            a(((i481119 | 1824) << 1) - (i481119 ^ 1824), 12 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (11535 - (~(ViewConfiguration.getTapTimeout() >> 16))), objArr91119);
                            int offsetBefore10 = TextUtils.getOffsetBefore(str12, 0);
                            Object[] objArr101112 = new Object[1];
                            a((offsetBefore10 ^ 1836) + ((offsetBefore10 & 1836) << 1), 10 - (~(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (char) (0 - (~(-(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))))), objArr101112);
                            int iGreen4 = Color.green(0);
                            int i491110 = ((iGreen4 | 1848) << 1) - (iGreen4 ^ 1848);
                            int i491111 = -View.MeasureSpec.getMode(0);
                            Object[] objArr101113 = new Object[1];
                            a(i491110, (i491111 ^ 12) + ((i491111 & 12) << 1), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr101113);
                            int i491112 = -KeyEvent.normalizeMetaState(0);
                            int i491113 = (i491112 ^ 1860) + ((i491112 & 1860) << 1);
                            int i491114 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            int i491115 = -(-TextUtils.getOffsetAfter(str12, 0));
                            Object[] objArr101114 = new Object[1];
                            a(i491113, (i491114 & 11) + (i491114 | 11), (char) ((i491115 ^ 58504) + ((i491115 & 58504) << 1)), objArr101114);
                            int i491116 = 1871 - (~(ViewConfiguration.getDoubleTapTimeout() >> 16));
                            int i491117 = -(-View.resolveSizeAndState(0, 0, 0));
                            int i491118 = (i491117 ^ 14) + ((i491117 & 14) << 1);
                            int i491119 = -TextUtils.indexOf(str12, str12, 0);
                            Object[] objArr101115 = new Object[1];
                            a(i491116, i491118, (char) ((i491119 ^ 45017) + ((i491119 & 45017) << 1)), objArr101115);
                            int touchSlop6 = ViewConfiguration.getTouchSlop();
                            int i501110 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
                            TuitionPaymentFragmentbindingInflater1 = i501110 % 128;
                            int i501111 = i501110 % 2;
                            int i501112 = -(touchSlop6 >> 8);
                            int i501113 = ((1886 | i501112) << 1) - (i501112 ^ 1886);
                            int i501114 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            int i501115 = ((i501114 | 13) << 1) - (i501114 ^ 13);
                            int i501116 = -(-TextUtils.lastIndexOf(str12, '0', 0, 0));
                            Object[] objArr101116 = new Object[1];
                            a(i501113, i501115, (char) ((i501116 ^ 15060) + ((i501116 & 15060) << 1)), objArr101116);
                            int i501117 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                            int i501118 = (i501117 ^ 1898) + ((i501117 & 1898) << 1);
                            int maximumDrawingCacheSize11 = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                            int iTuitionPaymentFragmentbindingInflater16 = zzo.TuitionPaymentFragmentbindingInflater1();
                            int i501119 = maximumDrawingCacheSize11 * (-244);
                            int i511110 = (i501119 ^ 5904) + ((i501119 & 5904) << 1);
                            int i511111 = ~iTuitionPaymentFragmentbindingInflater16;
                            int i511112 = (((i511110 - (~(((~(((-25) ^ maximumDrawingCacheSize11) | ((-25) & maximumDrawingCacheSize11))) | (~((i511111 & (-25)) | ((-25) ^ i511111)))) * (-245)))) - 1) - (~(-(-((~(((-25) ^ iTuitionPaymentFragmentbindingInflater16) | ((-25) & iTuitionPaymentFragmentbindingInflater16))) * (-245)))))) - 1;
                            int i511113 = ~((iTuitionPaymentFragmentbindingInflater16 & (-25)) | ((-25) ^ iTuitionPaymentFragmentbindingInflater16));
                            int i511114 = ((maximumDrawingCacheSize11 & i511113) | (maximumDrawingCacheSize11 ^ i511113)) * 245;
                            int i511115 = ((i511112 | i511114) << 1) - (i511114 ^ i511112);
                            int i511116 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            Object[] objArr101117 = new Object[1];
                            a(i501118, i511115, (char) ((i511116 ^ 1) + ((i511116 & 1) << 1)), objArr101117);
                            int i511117 = -(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                            int i511118 = -View.resolveSize(0, 0);
                            Object[] objArr101118 = new Object[1];
                            a((i511117 & 1921) + (i511117 | 1921), (i511118 & 28) + (i511118 | 28), (char) KeyEvent.keyCodeFromString(str12), objArr101118);
                            strArr13 = new String[]{(String) objArr819[0], (String) objArr8110[0], (String) objArr91110[0], (String) objArr91111[0], (String) objArr91112[0], (String) objArr91113[0], (String) objArr91114[0], (String) objArr91115[0], (String) objArr91116[0], (String) objArr91117[0], str411, (String) objArr91119[0], (String) objArr101112[0], (String) objArr101113[0], (String) objArr101114[0], (String) objArr101115[0], (String) objArr101116[0], (String) objArr101117[0], (String) objArr101118[0]};
                            i102 = 0;
                            while (true) {
                                if (i102 < i101) {
                                    i74 = i67;
                                    str14 = str12;
                                    strArr8 = strArr6;
                                    i103 = -1;
                                    break;
                                }
                                str18 = strArr13[i102];
                                Object[] objArr101119 = {str18};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                                    char cIndexOf5 = (char) ((-1) - TextUtils.indexOf((CharSequence) str12, '0'));
                                    int edgeSlop14 = 993 - (ViewConfiguration.getEdgeSlop() >> 16);
                                    int capsMode5 = 8 - TextUtils.getCapsMode(str12, 0, 0);
                                    byte b4111 = (byte) 0;
                                    byte b4112 = (byte) (b4111 + 5);
                                    Object[] objArr10121 = new Object[1];
                                    c(b4111, b4112, (byte) (b4112 - 5), objArr10121);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(cIndexOf5, edgeSlop14, capsMode5, 410748506, false, (String) objArr10121[0], new Class[]{String.class});
                                }
                                long jLongValue116 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).invoke(null, objArr101119)).longValue();
                                long j10116 = 1443778717;
                                i74 = i67;
                                str14 = str12;
                                long j10117 = jLongValue116 ^ j2;
                                i104 = i102;
                                strArr8 = strArr6;
                                long startElapsedRealtime8 = (int) Process.getStartElapsedRealtime();
                                long j10118 = startElapsedRealtime8 ^ j2;
                                long j10119 = (j10118 | jLongValue116) ^ j2;
                                long j101110 = 516;
                                long j101111 = j10116 ^ j2;
                                j5 = (((long) (-515)) * j10116) + (((long) 517) * jLongValue116) + (((long) (-516)) * (((j10117 | startElapsedRealtime8) ^ j2) | ((j10118 | j10116) ^ j2) | j10119)) + (((((j101111 | j10117) | startElapsedRealtime8) ^ j2) | (((j101111 | j10118) | jLongValue116) ^ j2)) * j101110) + (j101110 * (((jLongValue116 | j101111) ^ j2) | j10119)) + ((long) (-1644696954));
                                int i511119 = TuitionPaymentFragmentbindingInflater1;
                                i105 = (i511119 ^ 97) + ((i511119 & 97) << 1);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i105 % 128;
                                if (i105 % 2 == 0) {
                                    i109 = 1905160562 + (((~(1335175691 | i74)) | (-1607838284) | (~(1522565193 | i74)) | (~((-1249902602) | i))) * (-84));
                                    i110 = (~(1522565193 | i)) | (-1335175692);
                                    i111 = ~((-1522565194) | i74);
                                    if (((((int) (j5 << 95)) & (i109 + ((i110 | i111) * (-84)) + ((1249902601 | i111) * 84))) | (((int) j5) & (((1153123995 + ((1839902458 | i74) * 1444)) + ((((~((-1643106899) | i)) | 1638564434) | (~(205880488 | i))) * (-1444))) - 1264680934))) != 0) {
                                        int i521115 = 1871 - (~(-Gravity.getAbsoluteGravity(0, 0)));
                                        int i521116 = -ExpandableListView.getPackedPositionChild(0L);
                                        int i521117 = -ImageFormat.getBitsPerPixel(0);
                                        objArr4 = new Object[1];
                                        a(i521115, (i521116 ^ 13) + ((i521116 & 13) << 1), (char) ((i521117 & 45016) + (i521117 | 45016)), objArr4);
                                        if (str18.equals((String) objArr4[0])) {
                                            Object[] objArr1011110 = {str18};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                                                char maximumDrawingCacheSize12 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                int i521118 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 992;
                                                int edgeSlop15 = 8 - (ViewConfiguration.getEdgeSlop() >> 16);
                                                byte b4113 = (byte) 0;
                                                Object[] objArr1112 = new Object[1];
                                                c(b4113, (byte) (b4113 | 6), b4113, objArr1112);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(maximumDrawingCacheSize12, i521118, edgeSlop15, 349342683, false, (String) objArr1112[0], new Class[]{String.class});
                                            }
                                            long jLongValue117 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).invoke(null, objArr1011110)).longValue();
                                            long j11114 = -809468661;
                                            long j11115 = -159;
                                            long j11116 = (j11115 * j11114) + (j11115 * jLongValue117);
                                            long j11117 = 160;
                                            j6 = j11116 + (((j11114 ^ j2) | jLongValue117) * j11117) + (((long) (-160)) * (((j4 | j11114) ^ j2) | ((j11114 | jLongValue117) ^ j2))) + (j11117 * ((((jLongValue117 ^ j2) | j4) ^ j2) | j11114)) + ((long) (-37609944));
                                            int iMyUid9 = Process.myUid();
                                            int i521119 = ~iMyUid9;
                                            i108 = ((int) (j6 >> 32)) & (1871737038 + (((~((-363188387) | i521119)) | (~((-1074038025) | iMyUid9))) * 1900) + (((~(i521119 | 1074038024)) | (~(363188386 | iMyUid9))) * (-950)) + (((~(iMyUid9 | 1074038024)) | (~(i521119 | 363188386))) * 950));
                                            iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                                            if ((i108 | (((int) j6) & ((-635053948) + (((-141317) | iElapsedRealtime) * (-627)) + (((~(1756774086 | iElapsedRealtime)) | 319547676) * (-627)) + (((~(iElapsedRealtime | 319547676)) | (~((~iElapsedRealtime) | (-1756774087)))) * 627)))) != 0) {
                                            }
                                        }
                                        i102 = i104 + 1;
                                        i67 = i74;
                                        strArr13 = strArr13;
                                        str12 = str14;
                                        strArr6 = strArr8;
                                        i101 = 19;
                                    }
                                } else {
                                    int i521120 = ~(((int) Process.getElapsedCpuTime()) | 1471042851);
                                    i106 = ((int) (j5 >> 32)) & ((((-1437444700) | i521120) * (-658)) + 2141790698 + ((i521120 | (-1471151996)) * 658));
                                    int startElapsedRealtime9 = (int) Process.getStartElapsedRealtime();
                                    int i52121 = ~((-5329922) | startElapsedRealtime9);
                                    i107 = ((int) j5) & (1864339449 + ((553648416 | i52121) * (-476)) + (i52121 * 952) + ((~((~startElapsedRealtime9) | (-5329922))) * 476));
                                    if (((i106 & i107) | (i106 ^ i107)) != 0) {
                                        int i5211110 = 1871 - (~(-Gravity.getAbsoluteGravity(0, 0)));
                                        int i5211111 = -ExpandableListView.getPackedPositionChild(0L);
                                        int i5211112 = -ImageFormat.getBitsPerPixel(0);
                                        objArr4 = new Object[1];
                                        a(i5211110, (i5211111 ^ 13) + ((i5211111 & 13) << 1), (char) ((i5211112 & 45016) + (i5211112 | 45016)), objArr4);
                                        if (str18.equals((String) objArr4[0])) {
                                            Object[] objArr1011111 = {str18};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                                                char maximumDrawingCacheSize13 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                int i5211113 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 992;
                                                int edgeSlop16 = 8 - (ViewConfiguration.getEdgeSlop() >> 16);
                                                byte b4114 = (byte) 0;
                                                Object[] objArr1113 = new Object[1];
                                                c(b4114, (byte) (b4114 | 6), b4114, objArr1113);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(maximumDrawingCacheSize13, i5211113, edgeSlop16, 349342683, false, (String) objArr1113[0], new Class[]{String.class});
                                            }
                                            long jLongValue118 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).invoke(null, objArr1011111)).longValue();
                                            long j11118 = -809468661;
                                            long j11119 = -159;
                                            long j111110 = (j11119 * j11118) + (j11119 * jLongValue118);
                                            long j111111 = 160;
                                            j6 = j111110 + (((j11118 ^ j2) | jLongValue118) * j111111) + (((long) (-160)) * (((j4 | j11118) ^ j2) | ((j11118 | jLongValue118) ^ j2))) + (j111111 * ((((jLongValue118 ^ j2) | j4) ^ j2) | j11118)) + ((long) (-37609944));
                                            int iMyUid10 = Process.myUid();
                                            int i5211114 = ~iMyUid10;
                                            i108 = ((int) (j6 >> 32)) & (1871737038 + (((~((-363188387) | i5211114)) | (~((-1074038025) | iMyUid10))) * 1900) + (((~(i5211114 | 1074038024)) | (~(363188386 | iMyUid10))) * (-950)) + (((~(iMyUid10 | 1074038024)) | (~(i5211114 | 363188386))) * 950));
                                            iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                                            if ((i108 | (((int) j6) & ((-635053948) + (((-141317) | iElapsedRealtime) * (-627)) + (((~(1756774086 | iElapsedRealtime)) | 319547676) * (-627)) + (((~(iElapsedRealtime | 319547676)) | (~((~iElapsedRealtime) | (-1756774087)))) * 627)))) != 0) {
                                            }
                                        }
                                        i102 = i104 + 1;
                                        i67 = i74;
                                        strArr13 = strArr13;
                                        str12 = str14;
                                        strArr6 = strArr8;
                                        i101 = 19;
                                    }
                                }
                                i103 = i104;
                                break;
                            }
                            int i531110 = ((i103 | 130) << 1) - (i103 ^ 130);
                            int i531111 = (i531110 & i74) | ((~i531110) & i);
                            int i531112 = ~i103;
                            int i531113 = -i531112;
                            int i531114 = ((i531112 & i531113) | (i531112 ^ i531113)) >> 31;
                            int i531115 = TuitionPaymentFragmentbindingInflater1;
                            int i531116 = (i531115 ^ 103) + ((i531115 & 103) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i531116 % 128;
                            int i531117 = i531116 % 2;
                            int i531118 = (~i531114) & i;
                            int i531119 = i531111 & i531114;
                            int i5418 = (i531119 & i531118) | (i531118 ^ i531119);
                            int i5419 = i ^ i63;
                            int i54110 = -i5419;
                            int i54111 = ((i5419 & i54110) | (i5419 ^ i54110)) >> 31;
                            int i54112 = i5418 & (~i54111);
                            int i54113 = i63 & i54111;
                            i63 = (i54113 & i54112) | (i54112 ^ i54113);
                        }
                    } else {
                        i74 = i67;
                        str14 = str12;
                        strArr8 = strArr6;
                    }
                    int i5510 = 1949 - (~(-(ViewConfiguration.getKeyRepeatTimeout() >> 16)));
                    int i5511 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                    Object[] objArr1114 = new Object[1];
                    a(i5510, (i5511 ^ 13) + ((i5511 & 13) << 1), (char) Color.blue(0), objArr1114);
                    String str412 = (String) objArr1114[0];
                    str15 = str14;
                    int iIndexOf19 = TextUtils.indexOf(str15, str15, 0);
                    int iLastIndexOf8 = TextUtils.lastIndexOf(str15, '0');
                    Object[] objArr1115 = new Object[1];
                    a(((iIndexOf19 | 1963) << 1) - (iIndexOf19 ^ 1963), (iLastIndexOf8 & 6) + (iLastIndexOf8 | 6), (char) (Color.rgb(0, 0, 0) + 16839861), objArr1115);
                    String[] strArr210 = {str412, (String) objArr1115[0]};
                    int i5512 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                    int i5513 = -(-TextUtils.getOffsetAfter(str15, 0));
                    Object[] objArr1116 = new Object[1];
                    a((i5512 ^ 1968) + ((i5512 & 1968) << 1), (i5513 & 15) + (i5513 | 15), (char) (48411 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr1116);
                    String str413 = (String) objArr1116[0];
                    int i5514 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1982;
                    int i5515 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    Object[] objArr1117 = new Object[1];
                    a(i5514, (i5515 ^ 19) + ((i5515 & 19) << 1), (char) (59624 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), objArr1117);
                    String str414 = (String) objArr1117[0];
                    int iIndexOf20 = TextUtils.indexOf(str15, str15, 0, 0);
                    int iTuitionPaymentFragmentbindingInflater17 = zzo.TuitionPaymentFragmentbindingInflater1();
                    int i5516 = iIndexOf20 * (-244);
                    int i5517 = (i5516 & 492492) + (i5516 | 492492);
                    int i5518 = ~iTuitionPaymentFragmentbindingInflater17;
                    int i5519 = -(-(((~((i5518 & (-2003)) | ((-2003) ^ i5518))) | (~(((-2003) & iIndexOf20) | ((-2003) ^ iIndexOf20)))) * (-245)));
                    int i5610 = (i5517 ^ i5519) + ((i5519 & i5517) << 1);
                    int i5611 = (~(((-2003) ^ iTuitionPaymentFragmentbindingInflater17) | ((-2003) & iTuitionPaymentFragmentbindingInflater17))) * (-245);
                    int i5612 = ((i5610 | i5611) << 1) - (i5610 ^ i5611);
                    int i5613 = ((~(iTuitionPaymentFragmentbindingInflater17 | (-2003))) | iIndexOf20) * 245;
                    int i5614 = (i5612 ^ i5613) + ((i5613 & i5612) << 1);
                    int scrollBarSize7 = ViewConfiguration.getScrollBarSize() >> 8;
                    int i5615 = (scrollBarSize7 ^ 14) + ((scrollBarSize7 & 14) << 1);
                    int i5616 = -(-TextUtils.lastIndexOf(str15, '0', 0));
                    Object[] objArr1118 = new Object[1];
                    a(i5614, i5615, (char) ((i5616 ^ 17841) + ((i5616 & 17841) << 1)), objArr1118);
                    String[] strArr211 = {str413, str414, (String) objArr1118[0]};
                    int modifierMetaStateMask10 = 2015 - ((byte) KeyEvent.getModifierMetaStateMask());
                    int i5617 = -(-View.getDefaultSize(0, 0));
                    Object[] objArr1119 = new Object[1];
                    a(modifierMetaStateMask10, (i5617 ^ 21) + ((i5617 & 21) << 1), (char) (14714 - (~(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))))), objArr1119);
                    String str510 = (String) objArr1119[0];
                    int modifierMetaStateMask11 = 2036 - ((byte) KeyEvent.getModifierMetaStateMask());
                    int i5618 = 10 - (~(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
                    int i5619 = -Color.alpha(0);
                    Object[] objArr1216 = new Object[1];
                    a(modifierMetaStateMask11, i5618, (char) ((i5619 & 36799) + (i5619 | 36799)), objArr1216);
                    String[] strArr212 = {str510, (String) objArr1216[0]};
                    int i5710 = -TextUtils.lastIndexOf(str15, '0', 0);
                    int i5711 = (i5710 & 2046) + (i5710 | 2046);
                    int i5712 = 11 - (~(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
                    int i5713 = -TextUtils.getOffsetAfter(str15, 0);
                    Object[] objArr1217 = new Object[1];
                    a(i5711, i5712, (char) ((i5713 & 44789) + (i5713 | 44789)), objArr1217);
                    String str511 = (String) objArr1217[0];
                    int maxKeyCode2 = 587 - (KeyEvent.getMaxKeyCode() >> 16);
                    int i5714 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    Object[] objArr1218 = new Object[1];
                    a(maxKeyCode2, (i5714 & 7) + (i5714 | 7), (char) KeyEvent.keyCodeFromString(str15), objArr1218);
                    String[] strArr213 = {str511, (String) objArr1218[0]};
                    int i5715 = 2058 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int defaultSize3 = View.getDefaultSize(0, 0);
                    Object[] objArr1219 = new Object[1];
                    a(i5715, ((defaultSize3 | 28) << 1) - (defaultSize3 ^ 28), (char) View.resolveSize(0, 0), objArr1219);
                    String str512 = (String) objArr1219[0];
                    int pressedStateDuration3 = 2037 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    int iLastIndexOf9 = TextUtils.lastIndexOf(str15, '0') + 11;
                    int i5716 = -ExpandableListView.getPackedPositionGroup(0L);
                    Object[] objArr1220 = new Object[1];
                    a(pressedStateDuration3, iLastIndexOf9, (char) (((i5716 | 36799) << 1) - (i5716 ^ 36799)), objArr1220);
                    c3 = 0;
                    strArr9 = new String[][]{strArr210, strArr211, strArr212, strArr213, new String[]{str512, (String) objArr1220[0]}};
                    i75 = 0;
                    i76 = 5;
                    i77 = -1;
                    loop7: while (true) {
                        if (i75 < i76) {
                            i78 = i74;
                            i79 = i;
                            break;
                        }
                        String[] strArr214 = strArr9[i75];
                        str16 = strArr214[c3];
                        strArr10 = (String[]) Arrays.copyOfRange(strArr214, 1, strArr214.length);
                        length2 = strArr10.length;
                        i85 = 0;
                        while (true) {
                            if (i85 < length2) {
                                i86 = i77 + 1;
                                bytes2 = strArr10[i85].getBytes();
                                length3 = bytes2.length;
                                if (length3 == 0) {
                                    i78 = i74;
                                } else {
                                    strArr11 = strArr9;
                                    bufferedInputStream5 = new BufferedInputStream(new FileInputStream(str16));
                                    i89 = 4096;
                                    strArr12 = strArr10;
                                    bArr3 = new byte[4096];
                                    str17 = str16;
                                    i87 = length2;
                                    i88 = i86;
                                    i90 = 0;
                                    while (true) {
                                        i91 = bufferedInputStream5.read(bArr3, 0, i89);
                                        if (i91 > 0) {
                                            break;
                                            break;
                                        }
                                        i92 = 0;
                                        while (i90 < length3) {
                                            byte[] bArr5 = bArr3;
                                            if (bArr3[i92] == bytes2[i90]) {
                                                i90 = ((i90 | 1) << 1) - (i90 ^ 1);
                                            } else {
                                                if (i90 != 0) {
                                                    i93 = i90 - 1;
                                                    while (true) {
                                                        if (i93 > 0) {
                                                            i74 = i74;
                                                            i94 = i91;
                                                            i90 = 0;
                                                            break;
                                                            break;
                                                        }
                                                        i95 = 0;
                                                        while (true) {
                                                            if (i95 < i93) {
                                                                i74 = i74;
                                                                i94 = i91;
                                                                i90 = i93;
                                                                break;
                                                                break;
                                                            }
                                                            i96 = i91;
                                                            b2 = bytes2[i95];
                                                            i78 = i74;
                                                            i97 = (i90 - (~(-i93))) - 1;
                                                            i98 = i90;
                                                            i99 = -(-i95);
                                                            if (b2 != bytes2[(i97 & i99) + (i97 | i99)]) {
                                                                break;
                                                            }
                                                            i95 = ((i95 & 1) << 1) + (i95 ^ 1);
                                                            i91 = i96;
                                                            i74 = i78;
                                                            i90 = i98;
                                                        }
                                                        i93--;
                                                        i91 = i96;
                                                        i74 = i78;
                                                        i90 = i98;
                                                    }
                                                }
                                                bArr3 = bArr5;
                                                i91 = i94;
                                                i74 = i74;
                                            }
                                            i94 = i91;
                                            i92++;
                                            bArr3 = bArr5;
                                            i91 = i94;
                                            i74 = i74;
                                        }
                                        bArr3 = bArr3;
                                        i74 = i74;
                                        i90 = i90;
                                        i89 = 4096;
                                    }
                                    i78 = i74;
                                    if (i90 == length3) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    bufferedInputStream5.close();
                                    if (z) {
                                        i85++;
                                        strArr9 = strArr11;
                                        strArr10 = strArr12;
                                        str16 = str17;
                                        length2 = i87;
                                        i77 = i88;
                                        i74 = i78;
                                    }
                                }
                                i79 = i ^ (i77 + 171);
                                break loop7;
                            }
                            i75++;
                            i76 = 5;
                            c3 = 0;
                        }
                    }
                    int i5717 = i ^ i63;
                    int i5718 = -i5717;
                    int i5719 = ((i5717 & i5718) | (i5717 ^ i5718)) >> 31;
                    int i5819 = i79 & (~i5719);
                    int i5820 = i63 & i5719;
                    int i5821 = (i5820 & i5819) | (i5819 ^ i5820);
                } else {
                    i55 = i51;
                    i56 = 5;
                    strArr4 = null;
                }
                objArr2 = new Object[i56];
                objArr2[0] = new int[1];
                objArr2[1] = new int[]{i55};
                objArr2[3] = new int[]{i};
                int i6020 = (~(i & i55)) & (i | i55);
                int i6021 = -i6020;
                int i6022 = (((i6020 & i6021) | (i6020 ^ i6021)) >> 31) & 16;
                objArr2[4] = strArr4;
                objArr2[2] = null;
                int iElapsedRealtime5 = (int) SystemClock.elapsedRealtime();
                int i6023 = (-403930261) + (((~((-429747619) | iElapsedRealtime5)) | 268460192 | (~((-1344332026) | iElapsedRealtime5))) * (-880));
                int i6112 = (~((-429747619) | (~iElapsedRealtime5))) | 1344332025;
                int i6113 = ~(iElapsedRealtime5 | 429747618);
                int i6114 = i6023 + ((i6112 | i6113) * (-880)) + (i6113 * 880);
                int i6115 = -(-((i6114 ^ i6022) + ((i6114 & i6022) << 1)));
                int i6116 = (i3 & i6115) + (i3 | i6115);
                int i6117 = i6116 << 13;
                int i6118 = (i6117 | i6116) & (~(i6116 & i6117));
                i57 = i6118 ^ (i6118 >>> 17);
                i58 = TuitionPaymentFragmentbindingInflater1 + 101;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i58 % 128;
                if (i58 % 2 != 0) {
                    ((int[]) objArr2[0])[0] = i57 ^ (i57 << 5);
                    return objArr2;
                }
                int i6119 = i57 % 2;
                ((int[]) objArr2[0])[0] = (i57 | i6119) & (~(i57 & i6119));
                return objArr2;
            }
            i11 = i ^ 266;
            i9 = i139;
            str4 = str3;
            int i2310 = (~(i & i191)) & (i | i191);
            int i2311 = -i2310;
            int i2312 = ((i2310 & i2311) | (i2310 ^ i2311)) >> 31;
            int i2313 = i11 & (~i2312);
            int i2314 = i191 & i2312;
            int i2315 = (i2313 & i2314) | (i2313 ^ i2314);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2061288340);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cLastIndexOf2 = (char) (56826 - TextUtils.lastIndexOf(str4, '0'));
                int offsetBefore11 = 2814 - TextUtils.getOffsetBefore(str4, 0);
                int mode2 = 9 - View.MeasureSpec.getMode(0);
                byte b110 = (byte) 0;
                byte b111 = (byte) (b110 + 5);
                Object[] objArr310 = new Object[1];
                c(b110, b111, (byte) (b111 - 5), objArr310);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf2, offsetBefore11, mode2, -1639816125, false, (String) objArr310[0], new Class[0]);
            }
            long jLongValue26 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, null)).longValue();
            long j310 = 1573975069;
            long j311 = (((long) 659) * j310) + (((long) (-657)) * jLongValue26);
            String str210 = str4;
            j2 = -1;
            long j312 = ((j310 ^ j2) | jLongValue26) ^ j2;
            long j313 = ((jLongValue26 ^ j2) | j310) ^ j2;
            j3 = i;
            long j314 = (j310 | j3) ^ j2;
            long j410 = 658;
            long j411 = j311 + (((long) (-658)) * (j312 | j313 | j314)) + (j410 * j313) + (j410 * (j313 | j314)) + ((long) 539381437);
            int i2316 = ((int) (j411 >> 32)) & ((-896491846) + (((~(i9 | (-1438996339))) | (-1418744547)) * (-1042)) + (((-1438996339) | i) * 521) + (((~(1418744546 | i)) | (-1440045043) | (~((-1417695843) | i9))) * 521));
            int i2317 = ((int) j411) & (((((~(2147416055 | i)) | 19439617) * TypedValues.PositionType.TYPE_TRANSITION_EASING) - 472919880) + ((~(2147416055 | i9)) * TypedValues.PositionType.TYPE_TRANSITION_EASING));
            int i2410 = (i2316 & i2317) | (i2316 ^ i2317);
            int i2411 = i2410 - 1;
            int i2412 = -i2410;
            int i2413 = ((i2410 & i2412) | (i2410 ^ i2412)) >> 31;
            int i2414 = (~i2413) & i;
            int i2415 = i2413 & (i ^ ((i2411 & 200) + (i2411 | 200)));
            int i2416 = (i2415 & i2414) | (i2414 ^ i2415);
            int i2417 = ((~i2315) & i) | (i2315 & i9);
            int i2418 = -i2417;
            int i2419 = ((i2417 & i2418) | (i2417 ^ i2418)) >> 31;
            int i2510 = (i2416 & (~i2419)) | (i2315 & i2419);
            str5 = str210;
            int i2511 = 201 - (~(-TextUtils.lastIndexOf(str5, '0', 0, 0)));
            int offsetAfter6 = TextUtils.getOffsetAfter(str5, 0);
            int i2512 = (offsetAfter6 & 20) + (offsetAfter6 | 20);
            int i2513 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
            Object[] objArr311 = new Object[1];
            a(i2511, i2512, (char) ((i2513 & 61859) + (i2513 | 61859)), objArr311);
            str6 = (String) objArr311[0];
            int iAxisFromString2 = MotionEvent.axisFromString(str5);
            int iTuitionPaymentFragmentbindingInflater18 = zzo.TuitionPaymentFragmentbindingInflater1();
            int i2514 = (iAxisFromString2 * 371) + 83104;
            int i2515 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 49;
            TuitionPaymentFragmentbindingInflater1 = i2515 % 128;
            int i2516 = i2515 % 2;
            int i2517 = ~iTuitionPaymentFragmentbindingInflater18;
            int i2518 = ~(((-225) ^ i2517) | ((-225) & i2517));
            int i2519 = ~iAxisFromString2;
            int i2610 = ~((i2519 ^ iTuitionPaymentFragmentbindingInflater18) | (i2519 & iTuitionPaymentFragmentbindingInflater18));
            int i2611 = -(-((-370) * ((i2610 & i2518) | (i2518 ^ i2610))));
            int i2612 = ((i2514 | i2611) << 1) - (i2611 ^ i2514);
            int i2613 = (~(i2519 | i2517)) | (~(((-225) & iTuitionPaymentFragmentbindingInflater18) | ((-225) ^ iTuitionPaymentFragmentbindingInflater18)));
            int i2614 = (iAxisFromString2 ^ 224) | (iAxisFromString2 & 224);
            int i2615 = ~i2614;
            int i2616 = i2612 + (((i2613 & i2615) | (i2613 ^ i2615)) * (-370));
            int i2617 = -(-((~i2614) * 370));
            int i2618 = (i2616 ^ i2617) + ((i2617 & i2616) << 1);
            int scrollDefaultDelay3 = ViewConfiguration.getScrollDefaultDelay() >> 16;
            int iTuitionPaymentFragmentbindingInflater19 = zzo.TuitionPaymentFragmentbindingInflater1();
            int i2619 = ~scrollDefaultDelay3;
            int i2710 = (((scrollDefaultDelay3 * (-344)) - 2064) - (~(((~((i2619 ^ (-7)) | (i2619 & (-7)))) | (~(i2619 | iTuitionPaymentFragmentbindingInflater19))) * 345))) - 1;
            int i2711 = ~scrollDefaultDelay3;
            int i2712 = ~iTuitionPaymentFragmentbindingInflater19;
            int i2713 = ~((i2711 ^ i2712) | (i2711 & i2712));
            int i2714 = ~(((-7) ^ scrollDefaultDelay3) | (scrollDefaultDelay3 & (-7)));
            int i2715 = ((i2714 & i2713) | (i2713 ^ i2714)) * 345;
            int i2716 = ((i2710 | i2715) << 1) - (i2715 ^ i2710);
            int i2717 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i2718 = (i2717 & 115) + (i2717 | 115);
            TuitionPaymentFragmentbindingInflater1 = i2718 % 128;
            int i2719 = i2718 % 2;
            int i2810 = (i2619 ^ (-7)) | (i2619 & (-7));
            int i2811 = 345 * (~((i2810 & iTuitionPaymentFragmentbindingInflater19) | (i2810 ^ iTuitionPaymentFragmentbindingInflater19)));
            int i2812 = -(-Color.rgb(0, 0, 0));
            Object[] objArr312 = new Object[1];
            a(i2618, (i2716 ^ i2811) + ((i2811 & i2716) << 1), (char) ((i2812 & 16833729) + (i2812 | 16833729)), objArr312);
            bytes = ((String) objArr312[0]).getBytes();
            length = bytes.length;
            if (length == 0) {
                i12 = 1;
            } else {
                bufferedInputStream3 = new BufferedInputStream(new FileInputStream(str6));
                i13 = 4096;
                bArr = new byte[4096];
                i14 = 0;
                while (true) {
                    i15 = bufferedInputStream3.read(bArr, 0, i13);
                    if (i15 > 0) {
                        break;
                        break;
                    }
                    i16 = 0;
                    while (i14 < length) {
                        if (bArr[i16] == bytes[i14]) {
                            i14++;
                        } else {
                            if (i14 != 0) {
                                i17 = i14 - 1;
                                while (true) {
                                    if (i17 > 0) {
                                        bArr = bArr;
                                        i14 = 0;
                                        break;
                                        break;
                                    }
                                    i18 = 0;
                                    while (true) {
                                        if (i18 < i17) {
                                            bArr = bArr;
                                            i14 = i17;
                                            break;
                                            break;
                                        }
                                        bArr2 = bArr;
                                        int i2813 = i14 - i17;
                                        i19 = (i2813 ^ i18) + ((i2813 & i18) << 1);
                                        i20 = i14;
                                        if (bytes[i18] != bytes[i19]) {
                                            break;
                                        }
                                        i18++;
                                        bArr = bArr2;
                                        i14 = i20;
                                    }
                                    i17--;
                                    bArr = bArr2;
                                    i14 = i20;
                                }
                            }
                            bArr = bArr;
                        }
                        int i2814 = (i16 ^ (-85)) + ((i16 & (-85)) << 1);
                        i16 = (i2814 & 86) + (i2814 | 86);
                        bArr = bArr;
                    }
                    bArr = bArr;
                    i14 = i14;
                    i13 = 4096;
                }
                if (i14 == length) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                bufferedInputStream3.close();
            }
            int i2815 = (i12 | (-i12)) >> 31;
            int i2816 = (~i2815) & i;
            int i2817 = i2815 & ((i & (-263)) | (i9 & 262));
            int i2818 = (i2817 & i2816) | (i2816 ^ i2817);
            int i2819 = ((~i2510) & i) | (i2510 & i9);
            int i2910 = -i2819;
            int i2911 = ((i2819 & i2910) | (i2819 ^ i2910)) >> 31;
            int i2912 = i2818 & (~i2911);
            int i2913 = i2911 & i2510;
            i21 = (i2912 & i2913) | (i2912 ^ i2913);
            int i2914 = -(-ImageFormat.getBitsPerPixel(0));
            Object[] objArr313 = new Object[1];
            a((i2914 & 230) + (i2914 | 230), 30 - (~(-(-ExpandableListView.getPackedPositionType(0L)))), (char) (45628 - (~(-(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))))), objArr313);
            String str310 = (String) objArr313[0];
            byte modifierMetaStateMask12 = (byte) KeyEvent.getModifierMetaStateMask();
            Object[] objArr314 = new Object[1];
            a((modifierMetaStateMask12 ^ 261) + ((modifierMetaStateMask12 & 261) << 1), View.resolveSize(0, 0) + 23, (char) (KeyEvent.getMaxKeyCode() >> 16), objArr314);
            String str311 = (String) objArr314[0];
            int i2915 = 282 - (~(-(ViewConfiguration.getMaximumFlingVelocity() >> 16)));
            int i2916 = 28 - (~(-(-TextUtils.lastIndexOf(str5, '0'))));
            int i2917 = -Process.getGidForName(str5);
            Object[] objArr315 = new Object[1];
            a(i2915, i2916, (char) (((i2917 | 43455) << 1) - (i2917 ^ 43455)), objArr315);
            String str312 = (String) objArr315[0];
            int minimumFlingVelocity4 = ViewConfiguration.getMinimumFlingVelocity() >> 16;
            Object[] objArr316 = new Object[1];
            a((minimumFlingVelocity4 ^ 311) + ((minimumFlingVelocity4 & 311) << 1), 13 - (~(-Color.alpha(0))), (char) (37420 - ((byte) KeyEvent.getModifierMetaStateMask())), objArr316);
            strArr = new String[]{str310, str311, str312, (String) objArr316[0]};
            i22 = 0;
            while (true) {
                if (i22 < 4) {
                    str7 = str5;
                    i23 = i21;
                    i24 = i;
                    break;
                }
                Object[] objArr317 = {strArr[i22]};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault24 == null) {
                    char cRgb2 = (char) (Color.rgb(0, 0, 0) + 16777216);
                    int pressedStateDuration4 = (ViewConfiguration.getPressedStateDuration() >> 16) + 993;
                    int iResolveSizeAndState3 = 8 - View.resolveSizeAndState(0, 0, 0);
                    byte b112 = (byte) 0;
                    Object[] objArr318 = new Object[1];
                    c(b112, (byte) (b112 | 6), b112, objArr318);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault24 = initSession.b(cRgb2, pressedStateDuration4, iResolveSizeAndState3, 349342683, false, (String) objArr318[0], new Class[]{String.class});
                }
                long jLongValue27 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault24).invoke(null, objArr317)).longValue();
                long j412 = -674364253;
                str7 = str5;
                i125 = i22;
                i126 = i21;
                strArr17 = strArr;
                long j413 = -406;
                long j414 = jLongValue27 ^ j2;
                long jUptimeMillis2 = (int) SystemClock.uptimeMillis();
                long j415 = jUptimeMillis2 ^ j2;
                long j416 = (((long) (-405)) * j412) + (((long) 407) * jLongValue27) + ((((j414 | jUptimeMillis2) ^ j2) | (((j415 | j412) | jLongValue27) ^ j2)) * j413) + (j413 * (((j414 | j415) | j412) ^ j2)) + (((long) 406) * (((jUptimeMillis2 | (j412 ^ j2)) ^ j2) | ((j415 | jLongValue27) ^ j2))) + ((long) (-172714352));
                int i2918 = ~Process.myTid();
                i127 = ((int) (j416 >> 32)) & (823262610 + ((~((-1247817818) | i2918)) * 52) + (((~((-1340371420) | i2918)) | (~(1517369465 | i2918)) | 92553602) * (-52)) + (((~(i2918 | 1340371419)) | 269551648) * 52));
                i128 = (int) j416;
                elapsedCpuTime = (int) Process.getElapsedCpuTime();
                i129 = ~elapsedCpuTime;
                if ((i127 | (i128 & ((-635053777) + (((~(1804590766 | i129)) | (~((-367364357) | elapsedCpuTime))) * (-370)) + (((~(elapsedCpuTime | 1804590766)) | (~(i129 | (-367364357))) | 1779062442) * (-370)) + 1123107252))) != 0) {
                    int i2919 = i125 + 252;
                    i24 = (~(i & i2919)) & (i | i2919);
                    i23 = i126;
                    break;
                }
                i22 = ((i125 | 1) << 1) - (i125 ^ 1);
                i21 = i126;
                strArr = strArr17;
                str5 = str7;
            }
            int i3010 = ((~i23) & i) | (i23 & i9);
            int i3011 = -i3010;
            int i3012 = ((i3010 & i3011) | (i3010 ^ i3011)) >> 31;
            int i3013 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 61;
            TuitionPaymentFragmentbindingInflater1 = i3013 % 128;
            int i3014 = i3013 % 2;
            int i3015 = i24 & (~i3012);
            int i3016 = i23 & i3012;
            int i3017 = (i3015 & i3016) | (i3015 ^ i3016);
            int i3018 = -MotionEvent.axisFromString(str7);
            int i3019 = (i ^ 324) | (i & 324);
            int i3110 = ~i3018;
            i25 = (((i3018 * 628) + 203472) - (~(((i3019 & i3110) | (i3019 ^ i3110)) * (-627)))) - 1;
            int i3111 = ~(((-325) & i) | ((-325) ^ i));
            i26 = (i3111 & i3018) | (i3018 ^ i3111);
            int i3112 = TuitionPaymentFragmentbindingInflater1;
            i27 = ((i3112 | 39) << 1) - (i3112 ^ 39);
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i27 % 128;
            if (i27 % 2 == 0) {
                i28 = i25 / ((-627) >> i26);
                i29 = (i9 ^ 324) | (i9 & 324);
            } else {
                int i3113 = -(-(i26 * (-627)));
                i28 = ((i25 | i3113) << 1) - (i25 ^ i3113);
                int i3114 = ~i;
                i29 = (i3114 & 324) | (i3114 ^ 324);
            }
            int i3115 = 627 * ((~((i3018 & i) | (i3018 ^ i))) | (~i29));
            Object[] objArr410 = new Object[1];
            a((i28 ^ i3115) + ((i28 & i3115) << 1), 12 - (~(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))), (char) (TextUtils.getTrimmedLength(str7) + 38683), objArr410);
            Object[] objArr411 = {(String) objArr410[0]};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cResolveSize2 = (char) (33602 - View.resolveSize(0, 0));
                int iBlue2 = 3085 - Color.blue(0);
                int scrollBarFadeDuration3 = 26 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                byte b113 = (byte) 0;
                byte b114 = (byte) (b113 + 5);
                Object[] objArr412 = new Object[1];
                c(b113, b114, (byte) (b114 - 5), objArr412);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveSize2, iBlue2, scrollBarFadeDuration3, 1411172903, false, (String) objArr412[0], new Class[]{String.class});
            }
            str8 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr411);
            if (str8 != null) {
                int i3116 = 337 - (~(-(-View.MeasureSpec.getMode(0))));
                int iKeyCodeFromString8 = KeyEvent.keyCodeFromString(str7) + 9;
                int i3117 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                objArr5 = new Object[1];
                a(i3116, iKeyCodeFromString8, (char) (((i3117 | 15258) << 1) - (i3117 ^ 15258)), objArr5);
                if (str8.contains((String) objArr5[0])) {
                    i30 = (~(i & ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION)) & (i | ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
                } else {
                    i30 = i;
                }
            } else {
                i30 = i;
            }
            int i3118 = ((~i3017) & i) | (i3017 & i9);
            int i3119 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i3210 = (i3119 & 37) + (i3119 | 37);
            TuitionPaymentFragmentbindingInflater1 = i3210 % 128;
            int i3211 = i3210 % 2;
            int i3212 = (i3118 | (-i3118)) >> 31;
            int i3213 = i30 & (~i3212);
            int i3214 = i3017 & i3212;
            int i3215 = (i3214 & i3213) | (i3213 ^ i3214);
            int i3216 = -(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
            int i3217 = (i3216 ^ 347) + ((i3216 & 347) << 1);
            int i3218 = -(-(ViewConfiguration.getLongPressTimeout() >> 16));
            Object[] objArr413 = new Object[1];
            a(i3217, ((i3218 | 17) << 1) - (i3218 ^ 17), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr413);
            String str313 = (String) objArr413[0];
            int i3219 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            int i3310 = (i3219 ^ 365) + ((i3219 & 365) << 1);
            str9 = str7;
            int i3311 = -(-TextUtils.indexOf(str9, str9, 0));
            int i3312 = (i3311 ^ 6) + ((i3311 & 6) << 1);
            int threadPriority8 = Process.getThreadPriority(0);
            Object[] objArr414 = new Object[1];
            a(i3310, i3312, (char) (((threadPriority8 ^ 20) + ((threadPriority8 & 20) << 1)) >> 6), objArr414);
            Object[] objArr415 = {str313, (String) objArr414[0]};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char trimmedLength5 = (char) TextUtils.getTrimmedLength(str9);
                int iMyTid8 = 2385 - (Process.myTid() >> 22);
                int windowTouchSlop10 = (ViewConfiguration.getWindowTouchSlop() >> 8) + 32;
                byte b210 = (byte) 0;
                byte b211 = (byte) (b210 + 5);
                Object[] objArr416 = new Object[1];
                c(b210, b211, (byte) (b211 - 5), objArr416);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(trimmedLength5, iMyTid8, windowTouchSlop10, -1207062455, false, (String) objArr416[0], new Class[]{String.class, String.class});
            }
            long jLongValue28 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr415)).longValue();
            long j417 = -159394014;
            long j418 = -445;
            long j419 = (j418 * j417) + (j418 * jLongValue28);
            long j510 = 446;
            long j511 = j417 ^ j2;
            long j512 = jLongValue28 ^ j2;
            long j513 = (j511 | j512) ^ j2;
            j4 = j3 ^ j2;
            long j514 = j419 + ((j513 | ((j512 | j4) ^ j2)) * j510) + ((((j511 | jLongValue28) ^ j2) | (((j512 | j417) | j3) ^ j2)) * j510) + (j510 * j513) + ((long) 2136437342);
            int iMyPid5 = Process.myPid();
            i31 = ((int) (j514 >> 32)) & ((-509451412) + ((~((-270627) | iMyPid5)) * 623) + (((~iMyPid5) | 17827968) * (-623)) + (((~(iMyPid5 | 727391876)) | (~((-709834535) | iMyPid5)) | 270626) * 623));
            int i3313 = (-1025827548) + (((~((-921326149) | i9)) | 75498052) * (-245));
            int i3314 = ~((-921326149) | i);
            i32 = ((int) j514) & (i3313 + (i3314 * (-245)) + ((i3314 | 1936414737) * 245));
            if (((i31 & i32) | (i31 ^ i32)) != 0) {
                int i3315 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i3316 = (i3315 & 7) + (i3315 | 7);
                TuitionPaymentFragmentbindingInflater1 = i3316 % 128;
                int i3317 = i3316 % 2;
                i33 = (~(i & 251)) & (i | 251);
            } else {
                i33 = i;
            }
            int i3318 = (~(i & i3215)) & (i | i3215);
            int i3319 = -i3318;
            int i3410 = ((i3318 & i3319) | (i3318 ^ i3319)) >> 31;
            int i3411 = i33 & (~i3410);
            int i3412 = i3215 & i3410;
            int i3413 = (i3412 & i3411) | (i3411 ^ i3412);
            int i3414 = 369 - (~(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))));
            int i3415 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            Object[] objArr417 = new Object[1];
            a(i3414, (i3415 & 23) + (i3415 | 23), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr417);
            Object[] objArr418 = {(String) objArr417[0]};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char fadingEdgeLength3 = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 33602);
                int iCombineMeasuredStates4 = View.combineMeasuredStates(0, 0) + 3085;
                int iRed5 = Color.red(0) + 26;
                byte b212 = (byte) 0;
                byte b213 = (byte) (b212 + 5);
                Object[] objArr419 = new Object[1];
                c(b212, b213, (byte) (b213 - 5), objArr419);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(fadingEdgeLength3, iCombineMeasuredStates4, iRed5, 1411172903, false, (String) objArr419[0], new Class[]{String.class});
            }
            lowerCase = ((String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr418)).toLowerCase();
            int i3416 = -(-ExpandableListView.getPackedPositionChild(0L));
            int i3417 = ((i3416 | 394) << 1) - (i3416 ^ 394);
            int i3418 = -(KeyEvent.getMaxKeyCode() >> 16);
            int i3419 = (i3418 ^ 4) + ((i3418 & 4) << 1);
            int i3510 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
            objArr = new Object[1];
            a(i3417, i3419, (char) ((i3510 ^ 36662) + ((i3510 & 36662) << 1)), objArr);
            if (lowerCase.contains((String) objArr[0])) {
                i34 = i ^ 264;
            } else {
                i34 = i;
            }
            int i3511 = (~(i & i3413)) & (i | i3413);
            int i3512 = (i3511 | (-i3511)) >> 31;
            int i3513 = i34 & (~i3512);
            int i3514 = i3413 & i3512;
            int i3515 = (i3514 & i3513) | (i3513 ^ i3514);
            int i3516 = -(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
            int i3517 = (i3516 ^ 396) + ((i3516 & 396) << 1);
            int packedPositionGroup3 = ExpandableListView.getPackedPositionGroup(0L);
            int i3518 = (packedPositionGroup3 & 42) + (packedPositionGroup3 | 42);
            int i3519 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
            Object[] objArr510 = new Object[1];
            a(i3517, i3518, (char) ((i3519 ^ 36473) + ((i3519 & 36473) << 1)), objArr510);
            String str314 = (String) objArr510[0];
            Object[] objArr511 = new Object[1];
            a(439 - ExpandableListView.getPackedPositionType(0L), (-16777177) - (~(-Color.rgb(0, 0, 0))), (char) (29836 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr511);
            String str315 = (String) objArr511[0];
            int i3610 = -TextUtils.indexOf((CharSequence) str9, '0', 0, 0);
            int i3611 = (i3610 ^ 478) + ((i3610 & 478) << 1);
            int i3612 = -(ViewConfiguration.getKeyRepeatDelay() >> 16);
            Object[] objArr512 = new Object[1];
            a(i3611, ((i3612 | 27) << 1) - (i3612 ^ 27), (char) View.resolveSizeAndState(0, 0, 0), objArr512);
            String str316 = (String) objArr512[0];
            int i3613 = 505 - (~(-(TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))));
            int i3614 = -View.combineMeasuredStates(0, 0);
            Object[] objArr513 = new Object[1];
            a(i3613, (i3614 & 27) + (i3614 | 27), (char) Color.blue(0), objArr513);
            String str317 = (String) objArr513[0];
            int iIndexOf21 = TextUtils.indexOf(str9, str9, 0, 0);
            int i3615 = ((iIndexOf21 | 533) << 1) - (iIndexOf21 ^ 533);
            int i3616 = -Color.argb(0, 0, 0, 0);
            int i3617 = i3616 * 465;
            int i3618 = ~((-28) | i9);
            int i3619 = ~((-28) | i3616);
            i35 = ~i;
            int i3710 = (i3617 & (-12501)) + (i3617 | (-12501)) + (((i3619 & i3618) | (i3618 ^ i3619) | (~((i35 ^ i3616) | (i35 & i3616)))) * 464);
            int i3711 = ((~i3616) | i | (-28)) * (-464);
            Object[] objArr514 = new Object[1];
            a(i3615, (i3710 & i3711) + (i3711 | i3710) + (((~(((-28) ^ i3616) | ((-28) & i3616))) | (~((i3616 & i) | (i3616 ^ i)))) * 464), (char) ((-2) - (~(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))))), objArr514);
            String str318 = (String) objArr514[0];
            int i3712 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
            int i3713 = (i3712 & 560) + (i3712 | 560);
            int i3714 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int i3715 = ((i3714 | 27) << 1) - (i3714 ^ 27);
            int i3716 = -TextUtils.indexOf((CharSequence) str9, '0');
            Object[] objArr515 = new Object[1];
            a(i3713, i3715, (char) ((i3716 & 61826) + (i3716 | 61826)), objArr515);
            strArr2 = new String[]{str314, str315, str316, str317, str318, (String) objArr515[0]};
            i36 = 6;
            i37 = 0;
            while (true) {
                if (i37 < i36) {
                    i38 = i;
                    break;
                }
                Object[] objArr516 = {strArr2[i37]};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault23 == null) {
                    char cArgb2 = (char) (33602 - Color.argb(0, 0, 0, 0));
                    int i3717 = 3084 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    int iNormalizeMetaState3 = KeyEvent.normalizeMetaState(0) + 26;
                    byte b214 = (byte) 0;
                    byte b215 = (byte) (b214 + 5);
                    Object[] objArr517 = new Object[1];
                    c(b214, b215, (byte) (b215 - 5), objArr517);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault23 = initSession.b(cArgb2, i3717, iNormalizeMetaState3, 1411172903, false, (String) objArr517[0], new Class[]{String.class});
                }
                str20 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault23).invoke(null, objArr516);
                if (str20 == null) {
                }
                i37++;
                i36 = 6;
            }
            int i3718 = (~(i & i3515)) & (i | i3515);
            int i3719 = -i3718;
            int i3810 = (i3718 & i3719) | (i3718 ^ i3719);
            int i3811 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i3812 = (i3811 & 35) + (i3811 | 35);
            TuitionPaymentFragmentbindingInflater1 = i3812 % 128;
            int i3813 = i3812 % 2;
            int i3814 = i3810 >> 31;
            int i3815 = i38 & (~i3814);
            int i3816 = i3515 & i3814;
            i39 = (i3816 & i3815) | (i3815 ^ i3816);
            int i3817 = -(-View.MeasureSpec.getSize(0));
            int i3818 = (i3817 ^ 347) + ((i3817 & 347) << 1);
            int i3819 = -(-(ViewConfiguration.getMinimumFlingVelocity() >> 16));
            Object[] objArr518 = new Object[1];
            a(i3818, (i3819 ^ 17) + ((i3819 & 17) << 1), (char) Color.argb(0, 0, 0, 0), objArr518);
            String str319 = (String) objArr518[0];
            int i3910 = 586 - (~(-(ViewConfiguration.getJumpTapTimeout() >> 16)));
            int i3911 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
            Object[] objArr519 = new Object[1];
            a(i3910, (i3911 ^ 7) + ((i3911 & 7) << 1), (char) Color.green(0), objArr519);
            String str415 = (String) objArr519[0];
            zzo.TuitionPaymentFragmentbindingInflater1();
            Object[] objArr610 = {str319, str415};
            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                char cResolveOpacity2 = (char) Drawable.resolveOpacity(0, 0);
                int modifierMetaStateMask13 = ((byte) KeyEvent.getModifierMetaStateMask()) + 2386;
                int i3912 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 32;
                byte b216 = (byte) 0;
                byte b217 = (byte) (b216 + 5);
                Object[] objArr611 = new Object[1];
                c(b216, b217, (byte) (b217 - 5), objArr611);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveOpacity2, modifierMetaStateMask13, i3912, -1207062455, false, (String) objArr611[0], new Class[]{String.class, String.class});
            }
            long jLongValue29 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr610)).longValue();
            long j515 = 1641424896;
            long j516 = (((long) 866) * j515) + (((long) (-864)) * jLongValue29);
            long j517 = jLongValue29 ^ j2;
            long j518 = 865;
            long j519 = j516 + (((long) (-865)) * (j517 | (((j515 ^ j2) | j4) ^ j2))) + (((j515 | j3) ^ j2) * j518) + (j518 * (((j517 | j4) ^ j2) | ((j4 | j515) ^ j2))) + ((long) 335618432);
            i40 = ((int) (j519 >> 32)) & ((-933184463) + (((~(393487291 | i9)) | (~(1830713702 | i))) * 333) + (((~(393487291 | i)) | (~(i9 | 1830713702))) * 333));
            i41 = ((int) j519) & (2072280017 + ((~((-1454413323) | i9)) * (-116)) + (((-2125575819) | i) * 116) + (((~((-688349409) | i)) | 17186912) * 116));
            if (((i40 & i41) | (i40 ^ i41)) != 0) {
                i46 = (i & (-261)) | (i9 & 260);
                i43 = i39;
                str10 = str9;
                i42 = i35;
            } else {
                int keyRepeatDelay2 = ViewConfiguration.getKeyRepeatDelay() >> 16;
                int i3913 = (keyRepeatDelay2 ^ 593) + ((keyRepeatDelay2 & 593) << 1);
                int i3914 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
                Object[] objArr612 = new Object[1];
                a(i3913, (i3914 ^ 13) + ((i3914 & 13) << 1), (char) ((-TextUtils.indexOf((CharSequence) str9, '0')) - 1), objArr612);
                String str416 = (String) objArr612[0];
                Object[] objArr613 = new Object[1];
                a(606 - (~Process.getGidForName(str9)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 9, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr613);
                Object[] objArr614 = {str416, (String) objArr613[0]};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char bitsPerPixel2 = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                    int deadChar4 = 2385 - KeyEvent.getDeadChar(0, 0);
                    int iResolveSizeAndState4 = View.resolveSizeAndState(0, 0, 0) + 32;
                    byte b218 = (byte) 0;
                    byte b219 = (byte) (b218 + 5);
                    Object[] objArr615 = new Object[1];
                    c(b218, b219, (byte) (b219 - 5), objArr615);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(bitsPerPixel2, deadChar4, iResolveSizeAndState4, -1207062455, false, (String) objArr615[0], new Class[]{String.class, String.class});
                }
                long jLongValue30 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr614)).longValue();
                long j610 = 1686936585;
                i42 = i35;
                long j611 = ((j610 ^ j2) | jLongValue30) ^ j2;
                i43 = i39;
                str10 = str9;
                long jFreeMemory2 = (int) Runtime.getRuntime().freeMemory();
                long j612 = jFreeMemory2 ^ j2;
                long j613 = (((long) 595) * j610) + (((long) (-1187)) * jLongValue30) + (((long) (-1188)) * (j611 | ((j612 | jLongValue30) ^ j2)));
                long j614 = 594;
                long j615 = jLongValue30 ^ j2;
                long j616 = ((jFreeMemory2 | j615) ^ j2) | j611;
                long j617 = (j612 | j610) ^ j2;
                long j618 = j613 + ((j616 | j617) * j614) + (j614 * (((j615 | j612) ^ j2) | ((j615 | j610) ^ j2) | j617)) + ((long) 290106743);
                int iMyTid9 = Process.myTid();
                int i3915 = ~iMyTid9;
                i44 = ((int) (j618 >> 32)) & ((-2061077455) + (((~((-311136325) | i3915)) | (~(1126090086 | iMyTid9))) * 333) + (((~(iMyTid9 | (-311136325))) | (~(i3915 | 1126090086))) * 333));
                i45 = ((int) j618) & ((-183007387) + (((~(1767200018 | i)) | (-329973609)) * (-964)) + (((~(1767200018 | i9)) | (-2080374651)) * (-964)));
                if (((i44 & i45) | (i44 ^ i45)) != 0) {
                    i46 = (i & (-262)) | (i9 & 261);
                } else {
                    i46 = i;
                }
            }
            int i3916 = i ^ i43;
            int i3917 = -i3916;
            int i3918 = ((i3916 & i3917) | (i3916 ^ i3917)) >> 31;
            int i3919 = (~i3918) & i46;
            int i4012 = i43 & i3918;
            i47 = (i4012 & i3919) | (i3919 ^ i4012);
            if ((i2 & 8) == 0) {
                str19 = str10;
                int i4013 = 614 - (~(-(-TextUtils.indexOf(str19, str19, 0))));
                int modifierMetaStateMask14 = ((byte) KeyEvent.getModifierMetaStateMask()) + 44;
                int i4014 = -ExpandableListView.getPackedPositionType(0L);
                Object[] objArr616 = new Object[1];
                a(i4013, modifierMetaStateMask14, (char) ((i4014 ^ 57761) + ((i4014 & 57761) << 1)), objArr616);
                String str417 = (String) objArr616[0];
                int i4015 = 657 - (~(-(-(KeyEvent.getMaxKeyCode() >> 16))));
                int i4016 = -(-TextUtils.indexOf(str19, str19));
                Object[] objArr617 = new Object[1];
                a(i4015, (i4016 & 41) + (i4016 | 41), (char) ExpandableListView.getPackedPositionType(0L), objArr617);
                String str418 = (String) objArr617[0];
                int i4017 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                Object[] objArr618 = new Object[1];
                a((i4017 & TypedValues.TransitionType.TYPE_DURATION) + (i4017 | TypedValues.TransitionType.TYPE_DURATION), Drawable.resolveOpacity(0, 0) + 38, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr618);
                strArr15 = new String[]{str417, str418, (String) objArr618[0]};
                i116 = 0;
                while (true) {
                    if (i116 < 3) {
                        Object[] objArr619 = {strArr15[i116]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault22 == null) {
                            char defaultSize4 = (char) View.getDefaultSize(0, 0);
                            int mirror6 = 1041 - AndroidCharacter.getMirror('0');
                            int i4018 = 9 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            byte b310 = (byte) 0;
                            Object[] objArr710 = new Object[1];
                            c(b310, (byte) (b310 | 6), b310, objArr710);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault22 = initSession.b(defaultSize4, mirror6, i4018, 349342683, false, (String) objArr710[0], new Class[]{String.class});
                        }
                        long jLongValue119 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault22).invoke(null, objArr619)).longValue();
                        long j619 = 127158929;
                        str10 = str19;
                        strArr16 = strArr15;
                        long j710 = (((long) 477) * j619) + (((long) (-475)) * jLongValue119);
                        long j711 = ((j619 ^ j2) | jLongValue119) ^ j2;
                        long j712 = jLongValue119 ^ j2;
                        long startElapsedRealtime10 = (int) Process.getStartElapsedRealtime();
                        long j713 = ((j712 | j619) | startElapsedRealtime10) ^ j2;
                        j7 = j710 + (((long) (-476)) * (j711 | j713)) + (((long) 952) * j713) + (((long) 476) * ((((startElapsedRealtime10 ^ j2) | j712) | j619) ^ j2)) + ((long) (-974237534));
                        int i4019 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        i118 = (i4019 ^ 29) + ((i4019 & 29) << 1);
                        TuitionPaymentFragmentbindingInflater1 = i118 % 128;
                        if (i118 % 2 != 0) {
                            i123 = ((int) (j7 << 32)) & (1704617878 + (((~((-136667433) | i)) | 2113832) * 305) + (((~((-136667433) | i9)) | (-1573893844)) * 305));
                            int iMyPid6 = Process.myPid();
                            i124 = ((int) j7) & (1320243365 + (((~(1523092770 | iMyPid6)) | 85340760) * 1504) + ((~(iMyPid6 | 1608433530)) * (-1504)) + 2034013360);
                            if (((i123 & i124) | (i123 ^ i124)) != 0) {
                                iTuitionPaymentFragmentbindingInflater1 = zzo.TuitionPaymentFragmentbindingInflater1();
                                int i40110 = -(-(i116 * 46));
                                int i40111 = (12880 ^ i40110) + ((i40110 & 12880) << 1);
                                int i41110 = ~i116;
                                int i41111 = ~iTuitionPaymentFragmentbindingInflater1;
                                int i41112 = i40111 + (((~((i41111 & i41110) | (i41110 ^ i41111))) | 280) * (-90));
                                i121 = TuitionPaymentFragmentbindingInflater1 + 125;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i121 % 128;
                                if (i121 % 2 == 0) {
                                    int i41113 = ~i116;
                                    i122 = ~((i41113 & iTuitionPaymentFragmentbindingInflater1) | (i41113 ^ iTuitionPaymentFragmentbindingInflater1));
                                    int i41114 = 28 / 0;
                                } else {
                                    int i41115 = ~i116;
                                    i122 = ~((i41115 & iTuitionPaymentFragmentbindingInflater1) | (i41115 ^ iTuitionPaymentFragmentbindingInflater1));
                                }
                                int i41116 = -(-((-45) * ((~((i116 & 280) | (280 ^ i116))) | i122)));
                                int i41117 = (i41112 & i41116) + (i41116 | i41112);
                                int i41118 = ~((-281) | iTuitionPaymentFragmentbindingInflater1);
                                int i41119 = (i41110 & i41118) | (i41110 ^ i41118);
                                int i4210 = ~((~iTuitionPaymentFragmentbindingInflater1) | 280);
                                int i4211 = -(-(((i4210 & i41119) | (i41119 ^ i4210)) * 45));
                                int i4212 = ((i41117 | i4211) << 1) - (i4211 ^ i41117);
                                i117 = ((~i4212) & i) | (i4212 & i9);
                            } else {
                                int i4213 = i116 - 50;
                                i116 = ((i4213 | 51) << 1) - (i4213 ^ 51);
                                strArr15 = strArr16;
                                str19 = str10;
                            }
                        } else {
                            int i4214 = ~(1441412207 | i);
                            i119 = ((int) (j7 >> 32)) & (1539216898 + ((4185796 | i4214) * (-220)) + ((i4214 | 1428096) * 220) + 504703512);
                            i120 = ((int) j7) & ((-2038855459) + (((~((-1361431191) | i)) | (~((-134746154) | i9))) * 920) + (((~((-1361563543) | i9)) | 1361431190) * 920) + (((~((-1361431191) | i9)) | (~((-132353) | i)) | (~((-134746154) | i))) * 920));
                            if (((i119 & i120) | (i119 ^ i120)) != 0) {
                                iTuitionPaymentFragmentbindingInflater1 = zzo.TuitionPaymentFragmentbindingInflater1();
                                int i40112 = -(-(i116 * 46));
                                int i40113 = (12880 ^ i40112) + ((i40112 & 12880) << 1);
                                int i411110 = ~i116;
                                int i411111 = ~iTuitionPaymentFragmentbindingInflater1;
                                int i411112 = i40113 + (((~((i411111 & i411110) | (i411110 ^ i411111))) | 280) * (-90));
                                i121 = TuitionPaymentFragmentbindingInflater1 + 125;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i121 % 128;
                                if (i121 % 2 == 0) {
                                    int i411113 = ~i116;
                                    i122 = ~((i411113 & iTuitionPaymentFragmentbindingInflater1) | (i411113 ^ iTuitionPaymentFragmentbindingInflater1));
                                    int i411114 = 28 / 0;
                                } else {
                                    int i411115 = ~i116;
                                    i122 = ~((i411115 & iTuitionPaymentFragmentbindingInflater1) | (i411115 ^ iTuitionPaymentFragmentbindingInflater1));
                                }
                                int i411116 = -(-((-45) * ((~((i116 & 280) | (280 ^ i116))) | i122)));
                                int i411117 = (i411112 & i411116) + (i411116 | i411112);
                                int i411118 = ~((-281) | iTuitionPaymentFragmentbindingInflater1);
                                int i411119 = (i411110 & i411118) | (i411110 ^ i411118);
                                int i4215 = ~((~iTuitionPaymentFragmentbindingInflater1) | 280);
                                int i4216 = -(-(((i4215 & i411119) | (i411119 ^ i4215)) * 45));
                                int i4217 = ((i411117 | i4216) << 1) - (i4216 ^ i411117);
                                i117 = ((~i4217) & i) | (i4217 & i9);
                            } else {
                                int i4218 = i116 - 50;
                                i116 = ((i4218 | 51) << 1) - (i4218 ^ 51);
                                strArr15 = strArr16;
                                str19 = str10;
                            }
                        }
                    } else {
                        str10 = str19;
                        i117 = i;
                    }
                    int i4219 = i ^ i47;
                    int i4310 = -i4219;
                    int i4311 = ((i4219 & i4310) | (i4219 ^ i4310)) >> 31;
                    i47 = (i47 & i4311) | (i117 & (~i4311));
                }
            }
            int packedPositionType7 = ExpandableListView.getPackedPositionType(0L);
            int i4312 = ((packedPositionType7 | 737) << 1) - (packedPositionType7 ^ 737);
            int i4313 = -(-ExpandableListView.getPackedPositionGroup(0L));
            int i4314 = (i4313 & 41) + (i4313 | 41);
            str11 = str10;
            int i4315 = -TextUtils.getOffsetBefore(str11, 0);
            Object[] objArr711 = new Object[1];
            a(i4312, i4314, (char) ((i4315 ^ 13176) + ((i4315 & 13176) << 1)), objArr711);
            String str419 = (String) objArr711[0];
            int i4316 = 779 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
            int i4317 = -View.resolveSize(0, 0);
            Object[] objArr712 = new Object[1];
            a(i4316, ((i4317 | 30) << 1) - (i4317 ^ 30), (char) View.getDefaultSize(0, 0), objArr712);
            strArr3 = new String[]{str419, (String) objArr712[0]};
            i48 = 2;
            i49 = 0;
            while (true) {
                if (i49 < i48) {
                    i50 = i;
                    break;
                }
                Object[] objArr713 = {strArr3[i49]};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault21 == null) {
                    char cGreen3 = (char) Color.green(0);
                    int i4318 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 992;
                    int offsetAfter7 = TextUtils.getOffsetAfter(str11, 0) + 8;
                    byte b311 = (byte) 0;
                    byte b312 = b311;
                    Object[] objArr714 = new Object[1];
                    c(b311, b312, b312, objArr714);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault21 = initSession.b(cGreen3, i4318, offsetAfter7, -545305915, false, (String) objArr714[0], new Class[]{String.class});
                }
                long jLongValue120 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault21).invoke(null, objArr713)).longValue();
                long j714 = -1037210479;
                strArr14 = strArr3;
                long j715 = j714 ^ j2;
                long j716 = (((long) 284) * j714) + (((long) (-282)) * jLongValue120) + (((long) (-283)) * (((j715 | jLongValue120) ^ j2) | ((j715 | j3) ^ j2)));
                long j717 = 283;
                long j718 = jLongValue120 ^ j2;
                long j719 = j716 + (((j714 | j718) ^ j2) * j717) + (j717 * (((j718 | j715) | j3) ^ j2)) + ((long) 1657669763);
                int iMyTid10 = Process.myTid();
                i114 = ((int) (j719 >> 32)) & ((((~((~iMyTid10) | (-1207997697))) * 130) - 1195612778) + (((~(iMyTid10 | (-1207997697))) | 34668682) * 130));
                int iMyUid11 = Process.myUid();
                int i4319 = ~iMyUid11;
                i115 = ((int) j719) & (1265906305 + (((~(2003183961 | i4319)) | (-565957552) | (~((-2003183962) | iMyUid11))) * (-564)) + ((~(iMyUid11 | (-555876618))) * 1128) + (((~((-565957552) | i4319)) | 1447307344) * 564));
                if (((i114 & i115) | (i114 ^ i115)) != 0) {
                    int i4410 = i49 + 288;
                    i50 = ((~i4410) & i) | (i4410 & i9);
                    break;
                }
                i49 = (((i49 | 11) << 1) - (i49 ^ 11)) - 10;
                strArr3 = strArr14;
                i48 = 2;
            }
            int i4411 = (~(i & i47)) & (i | i47);
            int i4412 = -i4411;
            int i4413 = ((i4411 & i4412) | (i4411 ^ i4412)) >> 31;
            int i4414 = i50 & (~i4413);
            int i4415 = i47 & i4413;
            i51 = (i4415 & i4414) | (i4414 ^ i4415);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-555308653);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                char cResolveSizeAndState2 = (char) View.resolveSizeAndState(0, 0, 0);
                int i4416 = 3526 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int trimmedLength6 = TextUtils.getTrimmedLength(str11) + 23;
                byte b313 = (byte) 0;
                byte b314 = (byte) (b313 + 5);
                Object[] objArr715 = new Object[1];
                c(b313, b314, (byte) (b314 - 5), objArr715);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cResolveSizeAndState2, i4416, trimmedLength6, 980946500, false, (String) objArr715[0], new Class[0]);
            }
            long jLongValue121 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, null)).longValue();
            long j810 = 794252091;
            long j811 = (((long) (-665)) * j810) + (((long) 334) * jLongValue121);
            long j812 = j810 ^ j2;
            long j813 = 333;
            i52 = i9;
            long jNextInt3 = new Random().nextInt();
            long j814 = jNextInt3 ^ j2;
            long j815 = j811 + (((long) (-333)) * j812) + ((((j812 | j814) ^ j2) | ((jLongValue121 | jNextInt3) ^ j2)) * j813) + (j813 * (((j812 | jNextInt3) ^ j2) | ((j814 | jLongValue121) ^ j2))) + ((long) (-974574729));
            i53 = ((int) (j815 >> 32)) & ((-802173004) + (((-738591361) | i52) * (-369)) + (((~(1007125120 | i52)) | (-1850615765)) * (-369)) + (((~((-1007125121) | i)) | 268533760 | (~(i52 | (-1112024405)))) * 369));
            int i4417 = (~((int) SystemClock.elapsedRealtime())) | (-1829572725);
            i54 = ((int) j815) & (495840110 + (i4417 * 495) + (((~i4417) | 308456074) * 495));
            if (((i53 & i54) | (i53 ^ i54)) != 1) {
                Object[] objArr716 = {1};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1331892133);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                    char cGreen4 = (char) Color.green(0);
                    int size3 = 2673 - View.MeasureSpec.getSize(0);
                    int trimmedLength7 = TextUtils.getTrimmedLength(str11) + 16;
                    byte b315 = (byte) 0;
                    byte b316 = (byte) (b315 + 5);
                    Object[] objArr717 = new Object[1];
                    c(b315, b316, (byte) (b316 - 5), objArr717);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cGreen4, size3, trimmedLength7, -1409439630, false, (String) objArr717[0], new Class[]{Integer.TYPE});
                }
                long jLongValue122 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr716)).longValue();
                long j816 = 415030697;
                long j817 = -375;
                long j818 = (j817 * j816) + (j817 * jLongValue122);
                long j819 = 376;
                long j913 = j816 ^ j2;
                long j914 = (j816 | jLongValue122) ^ j2;
                long j915 = j818 + ((j3 | ((j913 | (jLongValue122 ^ j2)) ^ j2) | j914) * j819) + (((long) (-376)) * (((j4 | j816) ^ j2) | j914)) + (j819 * (jLongValue122 | ((j913 | j3) ^ j2))) + ((long) 1452667983);
                i59 = ((int) (j915 >> 32)) & (1507456424 + (((~(1601423398 | i52)) | (~(1256317486 | i))) * 210) + (((~(i52 | (-353503233))) | (~((-8397321) | i))) * 210));
                int iNextInt2 = new Random().nextInt();
                int i4418 = ~iNextInt2;
                i60 = ((int) j915) & (((((~(i4418 | (-501989874))) | ((~(935236536 | i4418)) | 138494017)) * (-397)) - 785009683) + ((iNextInt2 | 710234697) * 397));
                if (((i59 & i60) | (i59 ^ i60)) != 0) {
                    int i4419 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 117;
                    TuitionPaymentFragmentbindingInflater1 = i4419 % 128;
                    int i4510 = i4419 % 2;
                    i61 = i52;
                    i62 = (i & (-221)) | (i61 & 220);
                } else {
                    i61 = i52;
                    i62 = i;
                }
                int i4511 = ((~i51) & i) | (i51 & i61);
                int i4512 = -i4511;
                int i4513 = ((i4511 & i4512) | (i4511 ^ i4512)) >> 31;
                int i4514 = i62 & (~i4513);
                int i4515 = i51 & i4513;
                i63 = (i4515 & i4514) | (i4514 ^ i4515);
                int i4516 = 369 - (~(-Color.alpha(0)));
                int i4517 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                Object[] objArr718 = new Object[1];
                a(i4516, ((i4517 | 24) << 1) - (i4517 ^ 24), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr718);
                Object[] objArr719 = {(String) objArr718[0]};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                    char c10 = (char) (33603 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                    int threadPriority9 = ((Process.getThreadPriority(0) + 20) >> 6) + 3085;
                    int offsetBefore12 = TextUtils.getOffsetBefore(str11, 0) + 26;
                    byte b317 = (byte) 0;
                    byte b318 = (byte) (b317 + 5);
                    Object[] objArr820 = new Object[1];
                    c(b317, b318, (byte) (b318 - 5), objArr820);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c10, threadPriority9, offsetBefore12, 1411172903, false, (String) objArr820[0], new Class[]{String.class});
                }
                objInvoke = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr719);
                if (objInvoke != null) {
                    int i4518 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i4519 = (i4518 ^ 17) + ((i4518 & 17) << 1);
                    TuitionPaymentFragmentbindingInflater1 = i4519 % 128;
                    int i4620 = i4519 % 2;
                    Object[] objArr821 = {objInvoke, 42};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault20 == null) {
                        char c11 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int iNormalizeMetaState4 = KeyEvent.normalizeMetaState(0) + 3393;
                        int iRed6 = Color.red(0) + 9;
                        byte b319 = (byte) 0;
                        byte b420 = (byte) (b319 + 5);
                        Object[] objArr822 = new Object[1];
                        c(b319, b420, (byte) (b420 - 5), objArr822);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault20 = initSession.b(c11, iNormalizeMetaState4, iRed6, 1203525406, false, (String) objArr822[0], new Class[]{String.class, Integer.TYPE});
                    }
                    long jLongValue123 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault20).invoke(null, objArr821)).longValue();
                    long j916 = 121148702;
                    long j917 = j916 ^ j2;
                    long j918 = 191;
                    long j919 = (((long) (-381)) * j916) + (((long) DerHeader.TAG_CLASS_PRIVATE) * jLongValue123) + (((long) (-191)) * j917) + ((j916 | ((jLongValue123 | j3) ^ j2)) * j918) + (j918 * (((j4 | jLongValue123) ^ j2) | ((j917 | jLongValue123) ^ j2))) + ((long) (-123218579));
                    int elapsedCpuTime6 = (int) Process.getElapsedCpuTime();
                    i112 = ((int) (j919 >> 32)) & ((-2072279902) + ((~((~elapsedCpuTime6) | (-52046630))) * (-116)) + ((2026229976 | elapsedCpuTime6) * 116) + (((~(elapsedCpuTime6 | 589003565)) | 1489273040) * 116));
                    i113 = ((int) j919) & ((((-635053777) + (((~(1122662390 | i61)) | (~(314564019 | i))) * (-370))) + ((((~(1122662390 | i)) | (~(314564019 | i61))) | 44717490) * (-370))) - 634397884);
                    if (((i112 & i113) | (i112 ^ i113)) == 1986687685) {
                        str12 = str11;
                        i67 = i61;
                        strArr6 = null;
                    }
                    int i46115 = 888 - (~(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))));
                    int i46116 = -(-TextUtils.indexOf((CharSequence) str12, '0', 0, 0));
                    Object[] objArr8111 = new Object[1];
                    a(i46115, ((i46116 | 17) << 1) - (i46116 ^ 17), (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 53014), objArr8111);
                    Object[] objArr8112 = {(String) objArr8111[0]};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                        char deadChar5 = (char) (33602 - KeyEvent.getDeadChar(0, 0));
                        int jumpTapTimeout3 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 3085;
                        int packedPositionType8 = ExpandableListView.getPackedPositionType(0L) + 26;
                        byte b4115 = (byte) 0;
                        byte b4116 = (byte) (b4115 + 5);
                        Object[] objArr8113 = new Object[1];
                        c(b4115, b4116, (byte) (b4116 - 5), objArr8113);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(deadChar5, jumpTapTimeout3, packedPositionType8, 1411172903, false, (String) objArr8113[0], new Class[]{String.class});
                    }
                    objInvoke2 = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr8112);
                    if (objInvoke2 == null) {
                        i73 = 0;
                    } else {
                        Object[] objArr8114 = {objInvoke2, 42};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                            char cAlpha3 = (char) Color.alpha(0);
                            int i46117 = 3394 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                            int iIndexOf110 = TextUtils.indexOf((CharSequence) str12, '0', 0) + 10;
                            byte b4117 = (byte) 0;
                            byte b4118 = (byte) (b4117 + 5);
                            Object[] objArr8115 = new Object[1];
                            c(b4117, b4118, (byte) (b4118 - 5), objArr8115);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cAlpha3, i46117, iIndexOf110, 1203525406, false, (String) objArr8115[0], new Class[]{String.class, Integer.TYPE});
                        }
                        long jLongValue1110 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).invoke(null, objArr8114)).longValue();
                        long j9110 = 31585084;
                        long j9111 = (((long) (-523)) * j9110) + (((long) 263) * jLongValue1110);
                        long j9112 = 262;
                        long j10120 = ((j9110 ^ j2) | jLongValue1110) ^ j2;
                        long j10121 = jLongValue1110 ^ j2;
                        long j10122 = (j9110 | j10121) ^ j2;
                        long j10123 = j9111 + ((j10120 | j10122 | ((j10121 | j3) ^ j2)) * j9112) + (((long) (-786)) * j10122) + (j9112 * (((j10121 | j4) ^ j2) | j10120 | j10122)) + ((long) (-33654961));
                        int i46118 = ((int) (j10123 >> 32)) & (((635053406 + (((~(1766687994 | i67)) | (~(1091052890 | i))) * (-370))) + ((((~(1766687994 | i)) | (~(1091052890 | i67))) | 1091044442) * (-370))) - 40482284);
                        int i46119 = ((int) j10123) & (2131573617 + (((~(1064955753 | i67)) | 372270656 | (~((-523789889) | i))) * (-68)) + ((~((-151519233) | i67)) * (-68)) + (((~(523789888 | i67)) | 913436521) * 68));
                        i73 = (i46118 & i46119) | (i46118 ^ i46119);
                    }
                    if (i73 != 1986687685) {
                        i100 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
                        TuitionPaymentFragmentbindingInflater1 = i100 % 128;
                        if (i100 % 2 != 0) {
                            int i46120 = 28 / 0;
                            if (i73 == -1514516938) {
                                i74 = i67;
                                str14 = str12;
                                strArr8 = strArr6;
                            } else {
                                i101 = 19;
                                int offsetBefore13 = TextUtils.getOffsetBefore(str12, 0);
                                Object[] objArr8116 = new Object[1];
                                a((offsetBefore13 & 1608) + (offsetBefore13 | 1608), ImageFormat.getBitsPerPixel(0) + 15, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), objArr8116);
                                int i461110 = -(-Gravity.getAbsoluteGravity(0, 0));
                                int i461111 = (i461110 & 1622) + (i461110 | 1622);
                                int i461112 = -TextUtils.getOffsetAfter(str12, 0);
                                Object[] objArr8117 = new Object[1];
                                a(i461111, ((i461112 | 26) << 1) - (i461112 ^ 26), (char) Color.red(0), objArr8117);
                                int i4711110 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                int i4711111 = (i4711110 ^ 1649) + ((i4711110 & 1649) << 1);
                                int packedPositionChild5 = ExpandableListView.getPackedPositionChild(0L);
                                int i4711112 = (packedPositionChild5 ^ 18) + ((packedPositionChild5 & 18) << 1);
                                int i4711113 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                Object[] objArr911110 = new Object[1];
                                a(i4711111, i4711112, (char) ((i4711113 ^ 18429) + ((i4711113 & 18429) << 1)), objArr911110);
                                int i4711114 = -AndroidCharacter.getMirror('0');
                                int i4711115 = (i4711114 & 1713) + (i4711114 | 1713);
                                int iAlpha7 = Color.alpha(0);
                                Object[] objArr911111 = new Object[1];
                                a(i4711115, ((iAlpha7 | 17) << 1) - (iAlpha7 ^ 17), (char) TextUtils.indexOf(str12, str12, 0), objArr911111);
                                int i4711116 = 1681 - (~(-(ViewConfiguration.getWindowTouchSlop() >> 8)));
                                int iIndexOf111 = TextUtils.indexOf((CharSequence) str12, '0', 0, 0);
                                int i4711117 = (iIndexOf111 ^ 16) + ((iIndexOf111 & 16) << 1);
                                int i4711118 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                Object[] objArr911112 = new Object[1];
                                a(i4711116, i4711117, (char) ((i4711118 ^ 42519) + ((i4711118 & 42519) << 1)), objArr911112);
                                int i4711119 = -TextUtils.getTrimmedLength(str12);
                                int i4811110 = (i4711119 ^ 1697) + ((i4711119 & 1697) << 1);
                                int iKeyCodeFromString9 = KeyEvent.keyCodeFromString(str12);
                                int i4811111 = -View.resolveSizeAndState(0, 0, 0);
                                Object[] objArr911113 = new Object[1];
                                a(i4811110, ((iKeyCodeFromString9 | 37) << 1) - (iKeyCodeFromString9 ^ 37), (char) (((i4811111 | 24132) << 1) - (i4811111 ^ 24132)), objArr911113);
                                Object[] objArr911114 = new Object[1];
                                a(1733 - (~(-TextUtils.indexOf(str12, str12, 0, 0))), 10 - (~(-(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))))), (char) ExpandableListView.getPackedPositionGroup(0L), objArr911114);
                                int scrollBarSize8 = 1746 - (ViewConfiguration.getScrollBarSize() >> 8);
                                int i4811112 = -(-(ViewConfiguration.getScrollBarSize() >> 8));
                                Object[] objArr911115 = new Object[1];
                                a(scrollBarSize8, (i4811112 & 13) + (i4811112 | 13), (char) Color.blue(0), objArr911115);
                                int i4811113 = -TextUtils.indexOf((CharSequence) str12, '0');
                                Object[] objArr911116 = new Object[1];
                                a((i4811113 ^ 1758) + ((i4811113 & 1758) << 1), 20 - (~(-TextUtils.lastIndexOf(str12, '0', 0))), (char) KeyEvent.normalizeMetaState(0), objArr911116);
                                int i4811114 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                int i4811115 = (i4811114 & 1781) + (i4811114 | 1781);
                                int i4811116 = -View.resolveSize(0, 0);
                                int i4811117 = ((i4811116 | 31) << 1) - (i4811116 ^ 31);
                                int i4811118 = -(-TextUtils.lastIndexOf(str12, '0', 0, 0));
                                Object[] objArr911117 = new Object[1];
                                a(i4811115, i4811117, (char) ((i4811118 ^ 1) + ((i4811118 & 1) << 1)), objArr911117);
                                int iRgb5 = Color.rgb(0, 0, 0) + 16779028;
                                int iMyTid11 = Process.myTid() >> 22;
                                Object[] objArr911118 = new Object[1];
                                a(iRgb5, (iMyTid11 & 12) + (iMyTid11 | 12), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr911118);
                                String str4110 = (String) objArr911118[0];
                                zzo.TuitionPaymentFragmentbindingInflater1();
                                int i4811119 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                                Object[] objArr911119 = new Object[1];
                                a(((i4811119 | 1824) << 1) - (i4811119 ^ 1824), 12 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (11535 - (~(ViewConfiguration.getTapTimeout() >> 16))), objArr911119);
                                int offsetBefore14 = TextUtils.getOffsetBefore(str12, 0);
                                Object[] objArr1011112 = new Object[1];
                                a((offsetBefore14 ^ 1836) + ((offsetBefore14 & 1836) << 1), 10 - (~(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (char) (0 - (~(-(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))))), objArr1011112);
                                int iGreen5 = Color.green(0);
                                int i4911110 = ((iGreen5 | 1848) << 1) - (iGreen5 ^ 1848);
                                int i4911111 = -View.MeasureSpec.getMode(0);
                                Object[] objArr1011113 = new Object[1];
                                a(i4911110, (i4911111 ^ 12) + ((i4911111 & 12) << 1), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr1011113);
                                int i4911112 = -KeyEvent.normalizeMetaState(0);
                                int i4911113 = (i4911112 ^ 1860) + ((i4911112 & 1860) << 1);
                                int i4911114 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                int i4911115 = -(-TextUtils.getOffsetAfter(str12, 0));
                                Object[] objArr1011114 = new Object[1];
                                a(i4911113, (i4911114 & 11) + (i4911114 | 11), (char) ((i4911115 ^ 58504) + ((i4911115 & 58504) << 1)), objArr1011114);
                                int i4911116 = 1871 - (~(ViewConfiguration.getDoubleTapTimeout() >> 16));
                                int i4911117 = -(-View.resolveSizeAndState(0, 0, 0));
                                int i4911118 = (i4911117 ^ 14) + ((i4911117 & 14) << 1);
                                int i4911119 = -TextUtils.indexOf(str12, str12, 0);
                                Object[] objArr1011115 = new Object[1];
                                a(i4911116, i4911118, (char) ((i4911119 ^ 45017) + ((i4911119 & 45017) << 1)), objArr1011115);
                                int touchSlop7 = ViewConfiguration.getTouchSlop();
                                int i5011110 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
                                TuitionPaymentFragmentbindingInflater1 = i5011110 % 128;
                                int i5011111 = i5011110 % 2;
                                int i5011112 = -(touchSlop7 >> 8);
                                int i5011113 = ((1886 | i5011112) << 1) - (i5011112 ^ 1886);
                                int i5011114 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                int i5011115 = ((i5011114 | 13) << 1) - (i5011114 ^ 13);
                                int i5011116 = -(-TextUtils.lastIndexOf(str12, '0', 0, 0));
                                Object[] objArr1011116 = new Object[1];
                                a(i5011113, i5011115, (char) ((i5011116 ^ 15060) + ((i5011116 & 15060) << 1)), objArr1011116);
                                int i5011117 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                int i5011118 = (i5011117 ^ 1898) + ((i5011117 & 1898) << 1);
                                int maximumDrawingCacheSize14 = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                                int iTuitionPaymentFragmentbindingInflater110 = zzo.TuitionPaymentFragmentbindingInflater1();
                                int i5011119 = maximumDrawingCacheSize14 * (-244);
                                int i5111110 = (i5011119 ^ 5904) + ((i5011119 & 5904) << 1);
                                int i5111111 = ~iTuitionPaymentFragmentbindingInflater110;
                                int i5111112 = (((i5111110 - (~(((~(((-25) ^ maximumDrawingCacheSize14) | ((-25) & maximumDrawingCacheSize14))) | (~((i5111111 & (-25)) | ((-25) ^ i5111111)))) * (-245)))) - 1) - (~(-(-((~(((-25) ^ iTuitionPaymentFragmentbindingInflater110) | ((-25) & iTuitionPaymentFragmentbindingInflater110))) * (-245)))))) - 1;
                                int i5111113 = ~((iTuitionPaymentFragmentbindingInflater110 & (-25)) | ((-25) ^ iTuitionPaymentFragmentbindingInflater110));
                                int i5111114 = ((maximumDrawingCacheSize14 & i5111113) | (maximumDrawingCacheSize14 ^ i5111113)) * 245;
                                int i5111115 = ((i5111112 | i5111114) << 1) - (i5111114 ^ i5111112);
                                int i5111116 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                Object[] objArr1011117 = new Object[1];
                                a(i5011118, i5111115, (char) ((i5111116 ^ 1) + ((i5111116 & 1) << 1)), objArr1011117);
                                int i5111117 = -(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                                int i5111118 = -View.resolveSize(0, 0);
                                Object[] objArr1011118 = new Object[1];
                                a((i5111117 & 1921) + (i5111117 | 1921), (i5111118 & 28) + (i5111118 | 28), (char) KeyEvent.keyCodeFromString(str12), objArr1011118);
                                strArr13 = new String[]{(String) objArr8116[0], (String) objArr8117[0], (String) objArr911110[0], (String) objArr911111[0], (String) objArr911112[0], (String) objArr911113[0], (String) objArr911114[0], (String) objArr911115[0], (String) objArr911116[0], (String) objArr911117[0], str4110, (String) objArr911119[0], (String) objArr1011112[0], (String) objArr1011113[0], (String) objArr1011114[0], (String) objArr1011115[0], (String) objArr1011116[0], (String) objArr1011117[0], (String) objArr1011118[0]};
                                i102 = 0;
                                while (true) {
                                    if (i102 < i101) {
                                        i74 = i67;
                                        str14 = str12;
                                        strArr8 = strArr6;
                                        i103 = -1;
                                        break;
                                    }
                                    str18 = strArr13[i102];
                                    Object[] objArr1011119 = {str18};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                                        char cIndexOf6 = (char) ((-1) - TextUtils.indexOf((CharSequence) str12, '0'));
                                        int edgeSlop17 = 993 - (ViewConfiguration.getEdgeSlop() >> 16);
                                        int capsMode6 = 8 - TextUtils.getCapsMode(str12, 0, 0);
                                        byte b4119 = (byte) 0;
                                        byte b41110 = (byte) (b4119 + 5);
                                        Object[] objArr10122 = new Object[1];
                                        c(b4119, b41110, (byte) (b41110 - 5), objArr10122);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(cIndexOf6, edgeSlop17, capsMode6, 410748506, false, (String) objArr10122[0], new Class[]{String.class});
                                    }
                                    long jLongValue1111 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).invoke(null, objArr1011119)).longValue();
                                    long j101112 = 1443778717;
                                    i74 = i67;
                                    str14 = str12;
                                    long j101113 = jLongValue1111 ^ j2;
                                    i104 = i102;
                                    strArr8 = strArr6;
                                    long startElapsedRealtime11 = (int) Process.getStartElapsedRealtime();
                                    long j101114 = startElapsedRealtime11 ^ j2;
                                    long j101115 = (j101114 | jLongValue1111) ^ j2;
                                    long j101116 = 516;
                                    long j101117 = j101112 ^ j2;
                                    j5 = (((long) (-515)) * j101112) + (((long) 517) * jLongValue1111) + (((long) (-516)) * (((j101113 | startElapsedRealtime11) ^ j2) | ((j101114 | j101112) ^ j2) | j101115)) + (((((j101117 | j101113) | startElapsedRealtime11) ^ j2) | (((j101117 | j101114) | jLongValue1111) ^ j2)) * j101116) + (j101116 * (((jLongValue1111 | j101117) ^ j2) | j101115)) + ((long) (-1644696954));
                                    int i5111119 = TuitionPaymentFragmentbindingInflater1;
                                    i105 = (i5111119 ^ 97) + ((i5111119 & 97) << 1);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i105 % 128;
                                    if (i105 % 2 == 0) {
                                        i109 = 1905160562 + (((~(1335175691 | i74)) | (-1607838284) | (~(1522565193 | i74)) | (~((-1249902602) | i))) * (-84));
                                        i110 = (~(1522565193 | i)) | (-1335175692);
                                        i111 = ~((-1522565194) | i74);
                                        if (((((int) (j5 << 95)) & (i109 + ((i110 | i111) * (-84)) + ((1249902601 | i111) * 84))) | (((int) j5) & (((1153123995 + ((1839902458 | i74) * 1444)) + ((((~((-1643106899) | i)) | 1638564434) | (~(205880488 | i))) * (-1444))) - 1264680934))) != 0) {
                                            int i5211115 = 1871 - (~(-Gravity.getAbsoluteGravity(0, 0)));
                                            int i5211116 = -ExpandableListView.getPackedPositionChild(0L);
                                            int i5211117 = -ImageFormat.getBitsPerPixel(0);
                                            objArr4 = new Object[1];
                                            a(i5211115, (i5211116 ^ 13) + ((i5211116 & 13) << 1), (char) ((i5211117 & 45016) + (i5211117 | 45016)), objArr4);
                                            if (str18.equals((String) objArr4[0])) {
                                                Object[] objArr10111110 = {str18};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                                                    char maximumDrawingCacheSize15 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                    int i5211118 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 992;
                                                    int edgeSlop18 = 8 - (ViewConfiguration.getEdgeSlop() >> 16);
                                                    byte b41111 = (byte) 0;
                                                    Object[] objArr11110 = new Object[1];
                                                    c(b41111, (byte) (b41111 | 6), b41111, objArr11110);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(maximumDrawingCacheSize15, i5211118, edgeSlop18, 349342683, false, (String) objArr11110[0], new Class[]{String.class});
                                                }
                                                long jLongValue1112 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).invoke(null, objArr10111110)).longValue();
                                                long j111112 = -809468661;
                                                long j111113 = -159;
                                                long j111114 = (j111113 * j111112) + (j111113 * jLongValue1112);
                                                long j111115 = 160;
                                                j6 = j111114 + (((j111112 ^ j2) | jLongValue1112) * j111115) + (((long) (-160)) * (((j4 | j111112) ^ j2) | ((j111112 | jLongValue1112) ^ j2))) + (j111115 * ((((jLongValue1112 ^ j2) | j4) ^ j2) | j111112)) + ((long) (-37609944));
                                                int iMyUid12 = Process.myUid();
                                                int i5211119 = ~iMyUid12;
                                                i108 = ((int) (j6 >> 32)) & (1871737038 + (((~((-363188387) | i5211119)) | (~((-1074038025) | iMyUid12))) * 1900) + (((~(i5211119 | 1074038024)) | (~(363188386 | iMyUid12))) * (-950)) + (((~(iMyUid12 | 1074038024)) | (~(i5211119 | 363188386))) * 950));
                                                iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                                                if ((i108 | (((int) j6) & ((-635053948) + (((-141317) | iElapsedRealtime) * (-627)) + (((~(1756774086 | iElapsedRealtime)) | 319547676) * (-627)) + (((~(iElapsedRealtime | 319547676)) | (~((~iElapsedRealtime) | (-1756774087)))) * 627)))) != 0) {
                                                }
                                            }
                                            i102 = i104 + 1;
                                            i67 = i74;
                                            strArr13 = strArr13;
                                            str12 = str14;
                                            strArr6 = strArr8;
                                            i101 = 19;
                                        }
                                    } else {
                                        int i521121 = ~(((int) Process.getElapsedCpuTime()) | 1471042851);
                                        i106 = ((int) (j5 >> 32)) & ((((-1437444700) | i521121) * (-658)) + 2141790698 + ((i521121 | (-1471151996)) * 658));
                                        int startElapsedRealtime12 = (int) Process.getStartElapsedRealtime();
                                        int i52122 = ~((-5329922) | startElapsedRealtime12);
                                        i107 = ((int) j5) & (1864339449 + ((553648416 | i52122) * (-476)) + (i52122 * 952) + ((~((~startElapsedRealtime12) | (-5329922))) * 476));
                                        if (((i106 & i107) | (i106 ^ i107)) != 0) {
                                            int i52111110 = 1871 - (~(-Gravity.getAbsoluteGravity(0, 0)));
                                            int i52111111 = -ExpandableListView.getPackedPositionChild(0L);
                                            int i52111112 = -ImageFormat.getBitsPerPixel(0);
                                            objArr4 = new Object[1];
                                            a(i52111110, (i52111111 ^ 13) + ((i52111111 & 13) << 1), (char) ((i52111112 & 45016) + (i52111112 | 45016)), objArr4);
                                            if (str18.equals((String) objArr4[0])) {
                                                Object[] objArr10111111 = {str18};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                                                    char maximumDrawingCacheSize16 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                    int i52111113 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 992;
                                                    int edgeSlop19 = 8 - (ViewConfiguration.getEdgeSlop() >> 16);
                                                    byte b41112 = (byte) 0;
                                                    Object[] objArr11111 = new Object[1];
                                                    c(b41112, (byte) (b41112 | 6), b41112, objArr11111);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(maximumDrawingCacheSize16, i52111113, edgeSlop19, 349342683, false, (String) objArr11111[0], new Class[]{String.class});
                                                }
                                                long jLongValue1113 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).invoke(null, objArr10111111)).longValue();
                                                long j111116 = -809468661;
                                                long j111117 = -159;
                                                long j111118 = (j111117 * j111116) + (j111117 * jLongValue1113);
                                                long j111119 = 160;
                                                j6 = j111118 + (((j111116 ^ j2) | jLongValue1113) * j111119) + (((long) (-160)) * (((j4 | j111116) ^ j2) | ((j111116 | jLongValue1113) ^ j2))) + (j111119 * ((((jLongValue1113 ^ j2) | j4) ^ j2) | j111116)) + ((long) (-37609944));
                                                int iMyUid13 = Process.myUid();
                                                int i52111114 = ~iMyUid13;
                                                i108 = ((int) (j6 >> 32)) & (1871737038 + (((~((-363188387) | i52111114)) | (~((-1074038025) | iMyUid13))) * 1900) + (((~(i52111114 | 1074038024)) | (~(363188386 | iMyUid13))) * (-950)) + (((~(iMyUid13 | 1074038024)) | (~(i52111114 | 363188386))) * 950));
                                                iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                                                if ((i108 | (((int) j6) & ((-635053948) + (((-141317) | iElapsedRealtime) * (-627)) + (((~(1756774086 | iElapsedRealtime)) | 319547676) * (-627)) + (((~(iElapsedRealtime | 319547676)) | (~((~iElapsedRealtime) | (-1756774087)))) * 627)))) != 0) {
                                                }
                                            }
                                            i102 = i104 + 1;
                                            i67 = i74;
                                            strArr13 = strArr13;
                                            str12 = str14;
                                            strArr6 = strArr8;
                                            i101 = 19;
                                        }
                                    }
                                    i103 = i104;
                                    break;
                                }
                                int i5311110 = ((i103 | 130) << 1) - (i103 ^ 130);
                                int i5311111 = (i5311110 & i74) | ((~i5311110) & i);
                                int i5311112 = ~i103;
                                int i5311113 = -i5311112;
                                int i5311114 = ((i5311112 & i5311113) | (i5311112 ^ i5311113)) >> 31;
                                int i5311115 = TuitionPaymentFragmentbindingInflater1;
                                int i5311116 = (i5311115 ^ 103) + ((i5311115 & 103) << 1);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5311116 % 128;
                                int i5311117 = i5311116 % 2;
                                int i5311118 = (~i5311114) & i;
                                int i5311119 = i5311111 & i5311114;
                                int i54114 = (i5311119 & i5311118) | (i5311118 ^ i5311119);
                                int i54115 = i ^ i63;
                                int i54116 = -i54115;
                                int i54117 = ((i54115 & i54116) | (i54115 ^ i54116)) >> 31;
                                int i54118 = i54114 & (~i54117);
                                int i54119 = i63 & i54117;
                                i63 = (i54119 & i54118) | (i54118 ^ i54119);
                            }
                        } else if (i73 == -1514516938) {
                            i74 = i67;
                            str14 = str12;
                            strArr8 = strArr6;
                        } else {
                            i101 = 19;
                            int offsetBefore15 = TextUtils.getOffsetBefore(str12, 0);
                            Object[] objArr8118 = new Object[1];
                            a((offsetBefore15 & 1608) + (offsetBefore15 | 1608), ImageFormat.getBitsPerPixel(0) + 15, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), objArr8118);
                            int i461113 = -(-Gravity.getAbsoluteGravity(0, 0));
                            int i461114 = (i461113 & 1622) + (i461113 | 1622);
                            int i461115 = -TextUtils.getOffsetAfter(str12, 0);
                            Object[] objArr8119 = new Object[1];
                            a(i461114, ((i461115 | 26) << 1) - (i461115 ^ 26), (char) Color.red(0), objArr8119);
                            int i47111110 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                            int i47111111 = (i47111110 ^ 1649) + ((i47111110 & 1649) << 1);
                            int packedPositionChild6 = ExpandableListView.getPackedPositionChild(0L);
                            int i47111112 = (packedPositionChild6 ^ 18) + ((packedPositionChild6 & 18) << 1);
                            int i47111113 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            Object[] objArr9111110 = new Object[1];
                            a(i47111111, i47111112, (char) ((i47111113 ^ 18429) + ((i47111113 & 18429) << 1)), objArr9111110);
                            int i47111114 = -AndroidCharacter.getMirror('0');
                            int i47111115 = (i47111114 & 1713) + (i47111114 | 1713);
                            int iAlpha8 = Color.alpha(0);
                            Object[] objArr9111111 = new Object[1];
                            a(i47111115, ((iAlpha8 | 17) << 1) - (iAlpha8 ^ 17), (char) TextUtils.indexOf(str12, str12, 0), objArr9111111);
                            int i47111116 = 1681 - (~(-(ViewConfiguration.getWindowTouchSlop() >> 8)));
                            int iIndexOf112 = TextUtils.indexOf((CharSequence) str12, '0', 0, 0);
                            int i47111117 = (iIndexOf112 ^ 16) + ((iIndexOf112 & 16) << 1);
                            int i47111118 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                            Object[] objArr9111112 = new Object[1];
                            a(i47111116, i47111117, (char) ((i47111118 ^ 42519) + ((i47111118 & 42519) << 1)), objArr9111112);
                            int i47111119 = -TextUtils.getTrimmedLength(str12);
                            int i48111110 = (i47111119 ^ 1697) + ((i47111119 & 1697) << 1);
                            int iKeyCodeFromString10 = KeyEvent.keyCodeFromString(str12);
                            int i48111111 = -View.resolveSizeAndState(0, 0, 0);
                            Object[] objArr9111113 = new Object[1];
                            a(i48111110, ((iKeyCodeFromString10 | 37) << 1) - (iKeyCodeFromString10 ^ 37), (char) (((i48111111 | 24132) << 1) - (i48111111 ^ 24132)), objArr9111113);
                            Object[] objArr9111114 = new Object[1];
                            a(1733 - (~(-TextUtils.indexOf(str12, str12, 0, 0))), 10 - (~(-(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))))), (char) ExpandableListView.getPackedPositionGroup(0L), objArr9111114);
                            int scrollBarSize9 = 1746 - (ViewConfiguration.getScrollBarSize() >> 8);
                            int i48111112 = -(-(ViewConfiguration.getScrollBarSize() >> 8));
                            Object[] objArr9111115 = new Object[1];
                            a(scrollBarSize9, (i48111112 & 13) + (i48111112 | 13), (char) Color.blue(0), objArr9111115);
                            int i48111113 = -TextUtils.indexOf((CharSequence) str12, '0');
                            Object[] objArr9111116 = new Object[1];
                            a((i48111113 ^ 1758) + ((i48111113 & 1758) << 1), 20 - (~(-TextUtils.lastIndexOf(str12, '0', 0))), (char) KeyEvent.normalizeMetaState(0), objArr9111116);
                            int i48111114 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int i48111115 = (i48111114 & 1781) + (i48111114 | 1781);
                            int i48111116 = -View.resolveSize(0, 0);
                            int i48111117 = ((i48111116 | 31) << 1) - (i48111116 ^ 31);
                            int i48111118 = -(-TextUtils.lastIndexOf(str12, '0', 0, 0));
                            Object[] objArr9111117 = new Object[1];
                            a(i48111115, i48111117, (char) ((i48111118 ^ 1) + ((i48111118 & 1) << 1)), objArr9111117);
                            int iRgb6 = Color.rgb(0, 0, 0) + 16779028;
                            int iMyTid12 = Process.myTid() >> 22;
                            Object[] objArr9111118 = new Object[1];
                            a(iRgb6, (iMyTid12 & 12) + (iMyTid12 | 12), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr9111118);
                            String str4111 = (String) objArr9111118[0];
                            zzo.TuitionPaymentFragmentbindingInflater1();
                            int i48111119 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                            Object[] objArr9111119 = new Object[1];
                            a(((i48111119 | 1824) << 1) - (i48111119 ^ 1824), 12 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (11535 - (~(ViewConfiguration.getTapTimeout() >> 16))), objArr9111119);
                            int offsetBefore16 = TextUtils.getOffsetBefore(str12, 0);
                            Object[] objArr10111112 = new Object[1];
                            a((offsetBefore16 ^ 1836) + ((offsetBefore16 & 1836) << 1), 10 - (~(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (char) (0 - (~(-(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))))), objArr10111112);
                            int iGreen6 = Color.green(0);
                            int i49111110 = ((iGreen6 | 1848) << 1) - (iGreen6 ^ 1848);
                            int i49111111 = -View.MeasureSpec.getMode(0);
                            Object[] objArr10111113 = new Object[1];
                            a(i49111110, (i49111111 ^ 12) + ((i49111111 & 12) << 1), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr10111113);
                            int i49111112 = -KeyEvent.normalizeMetaState(0);
                            int i49111113 = (i49111112 ^ 1860) + ((i49111112 & 1860) << 1);
                            int i49111114 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            int i49111115 = -(-TextUtils.getOffsetAfter(str12, 0));
                            Object[] objArr10111114 = new Object[1];
                            a(i49111113, (i49111114 & 11) + (i49111114 | 11), (char) ((i49111115 ^ 58504) + ((i49111115 & 58504) << 1)), objArr10111114);
                            int i49111116 = 1871 - (~(ViewConfiguration.getDoubleTapTimeout() >> 16));
                            int i49111117 = -(-View.resolveSizeAndState(0, 0, 0));
                            int i49111118 = (i49111117 ^ 14) + ((i49111117 & 14) << 1);
                            int i49111119 = -TextUtils.indexOf(str12, str12, 0);
                            Object[] objArr10111115 = new Object[1];
                            a(i49111116, i49111118, (char) ((i49111119 ^ 45017) + ((i49111119 & 45017) << 1)), objArr10111115);
                            int touchSlop8 = ViewConfiguration.getTouchSlop();
                            int i50111110 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
                            TuitionPaymentFragmentbindingInflater1 = i50111110 % 128;
                            int i50111111 = i50111110 % 2;
                            int i50111112 = -(touchSlop8 >> 8);
                            int i50111113 = ((1886 | i50111112) << 1) - (i50111112 ^ 1886);
                            int i50111114 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            int i50111115 = ((i50111114 | 13) << 1) - (i50111114 ^ 13);
                            int i50111116 = -(-TextUtils.lastIndexOf(str12, '0', 0, 0));
                            Object[] objArr10111116 = new Object[1];
                            a(i50111113, i50111115, (char) ((i50111116 ^ 15060) + ((i50111116 & 15060) << 1)), objArr10111116);
                            int i50111117 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                            int i50111118 = (i50111117 ^ 1898) + ((i50111117 & 1898) << 1);
                            int maximumDrawingCacheSize17 = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                            int iTuitionPaymentFragmentbindingInflater111 = zzo.TuitionPaymentFragmentbindingInflater1();
                            int i50111119 = maximumDrawingCacheSize17 * (-244);
                            int i51111110 = (i50111119 ^ 5904) + ((i50111119 & 5904) << 1);
                            int i51111111 = ~iTuitionPaymentFragmentbindingInflater111;
                            int i51111112 = (((i51111110 - (~(((~(((-25) ^ maximumDrawingCacheSize17) | ((-25) & maximumDrawingCacheSize17))) | (~((i51111111 & (-25)) | ((-25) ^ i51111111)))) * (-245)))) - 1) - (~(-(-((~(((-25) ^ iTuitionPaymentFragmentbindingInflater111) | ((-25) & iTuitionPaymentFragmentbindingInflater111))) * (-245)))))) - 1;
                            int i51111113 = ~((iTuitionPaymentFragmentbindingInflater111 & (-25)) | ((-25) ^ iTuitionPaymentFragmentbindingInflater111));
                            int i51111114 = ((maximumDrawingCacheSize17 & i51111113) | (maximumDrawingCacheSize17 ^ i51111113)) * 245;
                            int i51111115 = ((i51111112 | i51111114) << 1) - (i51111114 ^ i51111112);
                            int i51111116 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            Object[] objArr10111117 = new Object[1];
                            a(i50111118, i51111115, (char) ((i51111116 ^ 1) + ((i51111116 & 1) << 1)), objArr10111117);
                            int i51111117 = -(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                            int i51111118 = -View.resolveSize(0, 0);
                            Object[] objArr10111118 = new Object[1];
                            a((i51111117 & 1921) + (i51111117 | 1921), (i51111118 & 28) + (i51111118 | 28), (char) KeyEvent.keyCodeFromString(str12), objArr10111118);
                            strArr13 = new String[]{(String) objArr8118[0], (String) objArr8119[0], (String) objArr9111110[0], (String) objArr9111111[0], (String) objArr9111112[0], (String) objArr9111113[0], (String) objArr9111114[0], (String) objArr9111115[0], (String) objArr9111116[0], (String) objArr9111117[0], str4111, (String) objArr9111119[0], (String) objArr10111112[0], (String) objArr10111113[0], (String) objArr10111114[0], (String) objArr10111115[0], (String) objArr10111116[0], (String) objArr10111117[0], (String) objArr10111118[0]};
                            i102 = 0;
                            while (true) {
                                if (i102 < i101) {
                                    i74 = i67;
                                    str14 = str12;
                                    strArr8 = strArr6;
                                    i103 = -1;
                                    break;
                                }
                                str18 = strArr13[i102];
                                Object[] objArr10111119 = {str18};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                                    char cIndexOf7 = (char) ((-1) - TextUtils.indexOf((CharSequence) str12, '0'));
                                    int edgeSlop110 = 993 - (ViewConfiguration.getEdgeSlop() >> 16);
                                    int capsMode7 = 8 - TextUtils.getCapsMode(str12, 0, 0);
                                    byte b41113 = (byte) 0;
                                    byte b41114 = (byte) (b41113 + 5);
                                    Object[] objArr10123 = new Object[1];
                                    c(b41113, b41114, (byte) (b41114 - 5), objArr10123);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(cIndexOf7, edgeSlop110, capsMode7, 410748506, false, (String) objArr10123[0], new Class[]{String.class});
                                }
                                long jLongValue1114 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).invoke(null, objArr10111119)).longValue();
                                long j101118 = 1443778717;
                                i74 = i67;
                                str14 = str12;
                                long j101119 = jLongValue1114 ^ j2;
                                i104 = i102;
                                strArr8 = strArr6;
                                long startElapsedRealtime13 = (int) Process.getStartElapsedRealtime();
                                long j1011110 = startElapsedRealtime13 ^ j2;
                                long j1011111 = (j1011110 | jLongValue1114) ^ j2;
                                long j1011112 = 516;
                                long j1011113 = j101118 ^ j2;
                                j5 = (((long) (-515)) * j101118) + (((long) 517) * jLongValue1114) + (((long) (-516)) * (((j101119 | startElapsedRealtime13) ^ j2) | ((j1011110 | j101118) ^ j2) | j1011111)) + (((((j1011113 | j101119) | startElapsedRealtime13) ^ j2) | (((j1011113 | j1011110) | jLongValue1114) ^ j2)) * j1011112) + (j1011112 * (((jLongValue1114 | j1011113) ^ j2) | j1011111)) + ((long) (-1644696954));
                                int i51111119 = TuitionPaymentFragmentbindingInflater1;
                                i105 = (i51111119 ^ 97) + ((i51111119 & 97) << 1);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i105 % 128;
                                if (i105 % 2 == 0) {
                                    i109 = 1905160562 + (((~(1335175691 | i74)) | (-1607838284) | (~(1522565193 | i74)) | (~((-1249902602) | i))) * (-84));
                                    i110 = (~(1522565193 | i)) | (-1335175692);
                                    i111 = ~((-1522565194) | i74);
                                    if (((((int) (j5 << 95)) & (i109 + ((i110 | i111) * (-84)) + ((1249902601 | i111) * 84))) | (((int) j5) & (((1153123995 + ((1839902458 | i74) * 1444)) + ((((~((-1643106899) | i)) | 1638564434) | (~(205880488 | i))) * (-1444))) - 1264680934))) != 0) {
                                        int i52111115 = 1871 - (~(-Gravity.getAbsoluteGravity(0, 0)));
                                        int i52111116 = -ExpandableListView.getPackedPositionChild(0L);
                                        int i52111117 = -ImageFormat.getBitsPerPixel(0);
                                        objArr4 = new Object[1];
                                        a(i52111115, (i52111116 ^ 13) + ((i52111116 & 13) << 1), (char) ((i52111117 & 45016) + (i52111117 | 45016)), objArr4);
                                        if (str18.equals((String) objArr4[0])) {
                                            Object[] objArr101111110 = {str18};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                                                char maximumDrawingCacheSize18 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                int i52111118 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 992;
                                                int edgeSlop111 = 8 - (ViewConfiguration.getEdgeSlop() >> 16);
                                                byte b41115 = (byte) 0;
                                                Object[] objArr11112 = new Object[1];
                                                c(b41115, (byte) (b41115 | 6), b41115, objArr11112);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(maximumDrawingCacheSize18, i52111118, edgeSlop111, 349342683, false, (String) objArr11112[0], new Class[]{String.class});
                                            }
                                            long jLongValue1115 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).invoke(null, objArr101111110)).longValue();
                                            long j1111110 = -809468661;
                                            long j1111111 = -159;
                                            long j1111112 = (j1111111 * j1111110) + (j1111111 * jLongValue1115);
                                            long j1111113 = 160;
                                            j6 = j1111112 + (((j1111110 ^ j2) | jLongValue1115) * j1111113) + (((long) (-160)) * (((j4 | j1111110) ^ j2) | ((j1111110 | jLongValue1115) ^ j2))) + (j1111113 * ((((jLongValue1115 ^ j2) | j4) ^ j2) | j1111110)) + ((long) (-37609944));
                                            int iMyUid14 = Process.myUid();
                                            int i52111119 = ~iMyUid14;
                                            i108 = ((int) (j6 >> 32)) & (1871737038 + (((~((-363188387) | i52111119)) | (~((-1074038025) | iMyUid14))) * 1900) + (((~(i52111119 | 1074038024)) | (~(363188386 | iMyUid14))) * (-950)) + (((~(iMyUid14 | 1074038024)) | (~(i52111119 | 363188386))) * 950));
                                            iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                                            if ((i108 | (((int) j6) & ((-635053948) + (((-141317) | iElapsedRealtime) * (-627)) + (((~(1756774086 | iElapsedRealtime)) | 319547676) * (-627)) + (((~(iElapsedRealtime | 319547676)) | (~((~iElapsedRealtime) | (-1756774087)))) * 627)))) != 0) {
                                            }
                                        }
                                        i102 = i104 + 1;
                                        i67 = i74;
                                        strArr13 = strArr13;
                                        str12 = str14;
                                        strArr6 = strArr8;
                                        i101 = 19;
                                    }
                                } else {
                                    int i521122 = ~(((int) Process.getElapsedCpuTime()) | 1471042851);
                                    i106 = ((int) (j5 >> 32)) & ((((-1437444700) | i521122) * (-658)) + 2141790698 + ((i521122 | (-1471151996)) * 658));
                                    int startElapsedRealtime14 = (int) Process.getStartElapsedRealtime();
                                    int i52123 = ~((-5329922) | startElapsedRealtime14);
                                    i107 = ((int) j5) & (1864339449 + ((553648416 | i52123) * (-476)) + (i52123 * 952) + ((~((~startElapsedRealtime14) | (-5329922))) * 476));
                                    if (((i106 & i107) | (i106 ^ i107)) != 0) {
                                        int i521111110 = 1871 - (~(-Gravity.getAbsoluteGravity(0, 0)));
                                        int i521111111 = -ExpandableListView.getPackedPositionChild(0L);
                                        int i521111112 = -ImageFormat.getBitsPerPixel(0);
                                        objArr4 = new Object[1];
                                        a(i521111110, (i521111111 ^ 13) + ((i521111111 & 13) << 1), (char) ((i521111112 & 45016) + (i521111112 | 45016)), objArr4);
                                        if (str18.equals((String) objArr4[0])) {
                                            Object[] objArr101111111 = {str18};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                                                char maximumDrawingCacheSize19 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                int i521111113 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 992;
                                                int edgeSlop112 = 8 - (ViewConfiguration.getEdgeSlop() >> 16);
                                                byte b41116 = (byte) 0;
                                                Object[] objArr11113 = new Object[1];
                                                c(b41116, (byte) (b41116 | 6), b41116, objArr11113);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(maximumDrawingCacheSize19, i521111113, edgeSlop112, 349342683, false, (String) objArr11113[0], new Class[]{String.class});
                                            }
                                            long jLongValue1116 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).invoke(null, objArr101111111)).longValue();
                                            long j1111114 = -809468661;
                                            long j1111115 = -159;
                                            long j1111116 = (j1111115 * j1111114) + (j1111115 * jLongValue1116);
                                            long j1111117 = 160;
                                            j6 = j1111116 + (((j1111114 ^ j2) | jLongValue1116) * j1111117) + (((long) (-160)) * (((j4 | j1111114) ^ j2) | ((j1111114 | jLongValue1116) ^ j2))) + (j1111117 * ((((jLongValue1116 ^ j2) | j4) ^ j2) | j1111114)) + ((long) (-37609944));
                                            int iMyUid15 = Process.myUid();
                                            int i521111114 = ~iMyUid15;
                                            i108 = ((int) (j6 >> 32)) & (1871737038 + (((~((-363188387) | i521111114)) | (~((-1074038025) | iMyUid15))) * 1900) + (((~(i521111114 | 1074038024)) | (~(363188386 | iMyUid15))) * (-950)) + (((~(iMyUid15 | 1074038024)) | (~(i521111114 | 363188386))) * 950));
                                            iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                                            if ((i108 | (((int) j6) & ((-635053948) + (((-141317) | iElapsedRealtime) * (-627)) + (((~(1756774086 | iElapsedRealtime)) | 319547676) * (-627)) + (((~(iElapsedRealtime | 319547676)) | (~((~iElapsedRealtime) | (-1756774087)))) * 627)))) != 0) {
                                            }
                                        }
                                        i102 = i104 + 1;
                                        i67 = i74;
                                        strArr13 = strArr13;
                                        str12 = str14;
                                        strArr6 = strArr8;
                                        i101 = 19;
                                    }
                                }
                                i103 = i104;
                                break;
                            }
                            int i53111110 = ((i103 | 130) << 1) - (i103 ^ 130);
                            int i53111111 = (i53111110 & i74) | ((~i53111110) & i);
                            int i53111112 = ~i103;
                            int i53111113 = -i53111112;
                            int i53111114 = ((i53111112 & i53111113) | (i53111112 ^ i53111113)) >> 31;
                            int i53111115 = TuitionPaymentFragmentbindingInflater1;
                            int i53111116 = (i53111115 ^ 103) + ((i53111115 & 103) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i53111116 % 128;
                            int i53111117 = i53111116 % 2;
                            int i53111118 = (~i53111114) & i;
                            int i53111119 = i53111111 & i53111114;
                            int i541110 = (i53111119 & i53111118) | (i53111118 ^ i53111119);
                            int i541111 = i ^ i63;
                            int i541112 = -i541111;
                            int i541113 = ((i541111 & i541112) | (i541111 ^ i541112)) >> 31;
                            int i541114 = i541110 & (~i541113);
                            int i541115 = i63 & i541113;
                            i63 = (i541115 & i541114) | (i541114 ^ i541115);
                        }
                    } else {
                        i74 = i67;
                        str14 = str12;
                        strArr8 = strArr6;
                    }
                    int i55110 = 1949 - (~(-(ViewConfiguration.getKeyRepeatTimeout() >> 16)));
                    int i55111 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                    Object[] objArr11114 = new Object[1];
                    a(i55110, (i55111 ^ 13) + ((i55111 & 13) << 1), (char) Color.blue(0), objArr11114);
                    String str4112 = (String) objArr11114[0];
                    str15 = str14;
                    int iIndexOf113 = TextUtils.indexOf(str15, str15, 0);
                    int iLastIndexOf10 = TextUtils.lastIndexOf(str15, '0');
                    Object[] objArr11115 = new Object[1];
                    a(((iIndexOf113 | 1963) << 1) - (iIndexOf113 ^ 1963), (iLastIndexOf10 & 6) + (iLastIndexOf10 | 6), (char) (Color.rgb(0, 0, 0) + 16839861), objArr11115);
                    String[] strArr215 = {str4112, (String) objArr11115[0]};
                    int i55112 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                    int i55113 = -(-TextUtils.getOffsetAfter(str15, 0));
                    Object[] objArr11116 = new Object[1];
                    a((i55112 ^ 1968) + ((i55112 & 1968) << 1), (i55113 & 15) + (i55113 | 15), (char) (48411 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr11116);
                    String str4113 = (String) objArr11116[0];
                    int i55114 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1982;
                    int i55115 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    Object[] objArr11117 = new Object[1];
                    a(i55114, (i55115 ^ 19) + ((i55115 & 19) << 1), (char) (59624 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), objArr11117);
                    String str4114 = (String) objArr11117[0];
                    int iIndexOf22 = TextUtils.indexOf(str15, str15, 0, 0);
                    int iTuitionPaymentFragmentbindingInflater112 = zzo.TuitionPaymentFragmentbindingInflater1();
                    int i55116 = iIndexOf22 * (-244);
                    int i55117 = (i55116 & 492492) + (i55116 | 492492);
                    int i55118 = ~iTuitionPaymentFragmentbindingInflater112;
                    int i55119 = -(-(((~((i55118 & (-2003)) | ((-2003) ^ i55118))) | (~(((-2003) & iIndexOf22) | ((-2003) ^ iIndexOf22)))) * (-245)));
                    int i56110 = (i55117 ^ i55119) + ((i55119 & i55117) << 1);
                    int i56111 = (~(((-2003) ^ iTuitionPaymentFragmentbindingInflater112) | ((-2003) & iTuitionPaymentFragmentbindingInflater112))) * (-245);
                    int i56112 = ((i56110 | i56111) << 1) - (i56110 ^ i56111);
                    int i56113 = ((~(iTuitionPaymentFragmentbindingInflater112 | (-2003))) | iIndexOf22) * 245;
                    int i56114 = (i56112 ^ i56113) + ((i56113 & i56112) << 1);
                    int scrollBarSize10 = ViewConfiguration.getScrollBarSize() >> 8;
                    int i56115 = (scrollBarSize10 ^ 14) + ((scrollBarSize10 & 14) << 1);
                    int i56116 = -(-TextUtils.lastIndexOf(str15, '0', 0));
                    Object[] objArr11118 = new Object[1];
                    a(i56114, i56115, (char) ((i56116 ^ 17841) + ((i56116 & 17841) << 1)), objArr11118);
                    String[] strArr216 = {str4113, str4114, (String) objArr11118[0]};
                    int modifierMetaStateMask15 = 2015 - ((byte) KeyEvent.getModifierMetaStateMask());
                    int i56117 = -(-View.getDefaultSize(0, 0));
                    Object[] objArr11119 = new Object[1];
                    a(modifierMetaStateMask15, (i56117 ^ 21) + ((i56117 & 21) << 1), (char) (14714 - (~(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))))), objArr11119);
                    String str513 = (String) objArr11119[0];
                    int modifierMetaStateMask16 = 2036 - ((byte) KeyEvent.getModifierMetaStateMask());
                    int i56118 = 10 - (~(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
                    int i56119 = -Color.alpha(0);
                    Object[] objArr12110 = new Object[1];
                    a(modifierMetaStateMask16, i56118, (char) ((i56119 & 36799) + (i56119 | 36799)), objArr12110);
                    String[] strArr217 = {str513, (String) objArr12110[0]};
                    int i57110 = -TextUtils.lastIndexOf(str15, '0', 0);
                    int i57111 = (i57110 & 2046) + (i57110 | 2046);
                    int i57112 = 11 - (~(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
                    int i57113 = -TextUtils.getOffsetAfter(str15, 0);
                    Object[] objArr12111 = new Object[1];
                    a(i57111, i57112, (char) ((i57113 & 44789) + (i57113 | 44789)), objArr12111);
                    String str514 = (String) objArr12111[0];
                    int maxKeyCode3 = 587 - (KeyEvent.getMaxKeyCode() >> 16);
                    int i57114 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    Object[] objArr12112 = new Object[1];
                    a(maxKeyCode3, (i57114 & 7) + (i57114 | 7), (char) KeyEvent.keyCodeFromString(str15), objArr12112);
                    String[] strArr218 = {str514, (String) objArr12112[0]};
                    int i57115 = 2058 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int defaultSize5 = View.getDefaultSize(0, 0);
                    Object[] objArr12113 = new Object[1];
                    a(i57115, ((defaultSize5 | 28) << 1) - (defaultSize5 ^ 28), (char) View.resolveSize(0, 0), objArr12113);
                    String str515 = (String) objArr12113[0];
                    int pressedStateDuration5 = 2037 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    int iLastIndexOf11 = TextUtils.lastIndexOf(str15, '0') + 11;
                    int i57116 = -ExpandableListView.getPackedPositionGroup(0L);
                    Object[] objArr1221 = new Object[1];
                    a(pressedStateDuration5, iLastIndexOf11, (char) (((i57116 | 36799) << 1) - (i57116 ^ 36799)), objArr1221);
                    c3 = 0;
                    strArr9 = new String[][]{strArr215, strArr216, strArr217, strArr218, new String[]{str515, (String) objArr1221[0]}};
                    i75 = 0;
                    i76 = 5;
                    i77 = -1;
                    loop7: while (true) {
                        if (i75 < i76) {
                            i78 = i74;
                            i79 = i;
                            break;
                        }
                        String[] strArr219 = strArr9[i75];
                        str16 = strArr219[c3];
                        strArr10 = (String[]) Arrays.copyOfRange(strArr219, 1, strArr219.length);
                        length2 = strArr10.length;
                        i85 = 0;
                        while (true) {
                            if (i85 < length2) {
                                i86 = i77 + 1;
                                bytes2 = strArr10[i85].getBytes();
                                length3 = bytes2.length;
                                if (length3 == 0) {
                                    i78 = i74;
                                } else {
                                    strArr11 = strArr9;
                                    bufferedInputStream5 = new BufferedInputStream(new FileInputStream(str16));
                                    i89 = 4096;
                                    strArr12 = strArr10;
                                    bArr3 = new byte[4096];
                                    str17 = str16;
                                    i87 = length2;
                                    i88 = i86;
                                    i90 = 0;
                                    while (true) {
                                        i91 = bufferedInputStream5.read(bArr3, 0, i89);
                                        if (i91 > 0) {
                                            break;
                                            break;
                                        }
                                        i92 = 0;
                                        while (i90 < length3) {
                                            byte[] bArr6 = bArr3;
                                            if (bArr3[i92] == bytes2[i90]) {
                                                i90 = ((i90 | 1) << 1) - (i90 ^ 1);
                                            } else {
                                                if (i90 != 0) {
                                                    i93 = i90 - 1;
                                                    while (true) {
                                                        if (i93 > 0) {
                                                            i74 = i74;
                                                            i94 = i91;
                                                            i90 = 0;
                                                            break;
                                                            break;
                                                        }
                                                        i95 = 0;
                                                        while (true) {
                                                            if (i95 < i93) {
                                                                i74 = i74;
                                                                i94 = i91;
                                                                i90 = i93;
                                                                break;
                                                                break;
                                                            }
                                                            i96 = i91;
                                                            b2 = bytes2[i95];
                                                            i78 = i74;
                                                            i97 = (i90 - (~(-i93))) - 1;
                                                            i98 = i90;
                                                            i99 = -(-i95);
                                                            if (b2 != bytes2[(i97 & i99) + (i97 | i99)]) {
                                                                break;
                                                            }
                                                            i95 = ((i95 & 1) << 1) + (i95 ^ 1);
                                                            i91 = i96;
                                                            i74 = i78;
                                                            i90 = i98;
                                                        }
                                                        i93--;
                                                        i91 = i96;
                                                        i74 = i78;
                                                        i90 = i98;
                                                    }
                                                }
                                                bArr3 = bArr6;
                                                i91 = i94;
                                                i74 = i74;
                                            }
                                            i94 = i91;
                                            i92++;
                                            bArr3 = bArr6;
                                            i91 = i94;
                                            i74 = i74;
                                        }
                                        bArr3 = bArr3;
                                        i74 = i74;
                                        i90 = i90;
                                        i89 = 4096;
                                    }
                                    i78 = i74;
                                    if (i90 == length3) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    bufferedInputStream5.close();
                                    if (z) {
                                        i85++;
                                        strArr9 = strArr11;
                                        strArr10 = strArr12;
                                        str16 = str17;
                                        length2 = i87;
                                        i77 = i88;
                                        i74 = i78;
                                    }
                                }
                                i79 = i ^ (i77 + 171);
                                break loop7;
                            }
                            i75++;
                            i76 = 5;
                            c3 = 0;
                        }
                    }
                    int i57117 = i ^ i63;
                    int i57118 = -i57117;
                    int i57119 = ((i57117 & i57118) | (i57117 ^ i57118)) >> 31;
                    int i58110 = i79 & (~i57119);
                    int i5822 = i63 & i57119;
                    int i5823 = (i5822 & i58110) | (i58110 ^ i5822);
                    int i58111 = 2085 - (~(-(ViewConfiguration.getScrollBarSize() >> 8)));
                    int i58112 = 11 - (~(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                    int i58113 = -TextUtils.indexOf(str15, str15, 0, 0);
                    Object[] objArr12114 = new Object[1];
                    a(i58111, i58112, (char) ((i58113 & 21955) + (i58113 | 21955)), objArr12114);
                    String str516 = (String) objArr12114[0];
                    int i58114 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2098;
                    int i58115 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                    Object[] objArr12115 = new Object[1];
                    a(i58114, (i58115 & 8) + (i58115 | 8), (char) (((Process.getThreadPriority(0) + 20) >> 6) + 20215), objArr12115);
                    Object[] objArr12116 = {str516, (String) objArr12115[0]};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                        char windowTouchSlop11 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int iIndexOf114 = TextUtils.indexOf(str15, str15, 0) + 2385;
                        int minimumFlingVelocity5 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 32;
                        byte b510 = (byte) 0;
                        byte b511 = (byte) (b510 + 5);
                        Object[] objArr12117 = new Object[1];
                        c(b510, b511, (byte) (b511 - 5), objArr12117);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(windowTouchSlop11, iIndexOf114, minimumFlingVelocity5, -1207062455, false, (String) objArr12117[0], new Class[]{String.class, String.class});
                    }
                    long jLongValue210 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).invoke(null, objArr12116)).longValue();
                    long j12118 = -102072316;
                    long j12119 = 399;
                    long j1312 = (j12119 * j12118) + (j12119 * jLongValue210);
                    long j1313 = 398;
                    long j1314 = ((j12118 ^ j2) | jLongValue210) ^ j2;
                    long j1315 = jLongValue210 ^ j2;
                    long j1316 = (j1315 | j12118) ^ j2;
                    long jMyTid3 = Process.myTid();
                    long j1317 = j1312 + ((j1314 | j1316 | ((j1315 | jMyTid3) ^ j2)) * j1313) + (((long) (-1194)) * (j12118 | jLongValue210)) + (j1313 * ((((jMyTid3 ^ j2) | j1315) ^ j2) | j1314 | j1316)) + ((long) 2079115644);
                    int iElapsedRealtime6 = (int) SystemClock.elapsedRealtime();
                    int i61110 = ~iElapsedRealtime6;
                    i83 = ((int) (j1317 >> 32)) & ((-969119006) + (((~(201150503 | i61110)) | (-1638376915) | (~((-201150504) | iElapsedRealtime6))) * (-564)) + ((~(iElapsedRealtime6 | (-27590659))) * 1128) + (((~((-1638376915) | i61110)) | 173559845) * 564));
                    int i61111 = (int) j1317;
                    int iMyPid7 = Process.myPid();
                    int i6210 = ~iMyPid7;
                    i84 = i61111 & (94082845 + ((iMyPid7 | 4474149) * 988) + (((~(181172093 | i6210)) | (-1795096448)) * (-1976)) + (((~(iMyPid7 | 1618398503)) | 4474149 | (~((-1618398504) | i6210))) * 988));
                    if (((i83 & i84) | (i83 ^ i84)) != 0) {
                        i80 = i & (-151);
                        i78 = i78;
                        i81 = i78 & 150;
                        i82 = i80 | i81;
                    } else {
                        i78 = i78;
                        i82 = i;
                    }
                    int i58116 = i ^ i5823;
                    int i58117 = (i58116 | (-i58116)) >> 31;
                    int i591110 = i82 & (~i58117);
                    int i591111 = i5823 & i58117;
                    int i591112 = (i591111 & i591110) | (i591110 ^ i591111);
                    int i591113 = -Color.green(0);
                    int i591114 = (i591113 & 2107) + (i591113 | 2107);
                    int iArgb4 = Color.argb(0, 0, 0, 0) + 47;
                    int i591115 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    Object[] objArr12118 = new Object[1];
                    a(i591114, iArgb4, (char) ((i591115 ^ 1) + ((i591115 & 1) << 1)), objArr12118);
                    Object[] objArr1310 = {(String) objArr12118[0]};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                        char windowTouchSlop12 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                        int i591116 = 994 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        int edgeSlop20 = (ViewConfiguration.getEdgeSlop() >> 16) + 8;
                        byte b512 = (byte) 0;
                        byte b513 = b512;
                        Object[] objArr1311 = new Object[1];
                        c(b512, b513, b513, objArr1311);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(windowTouchSlop12, i591116, edgeSlop20, -545305915, false, (String) objArr1311[0], new Class[]{String.class});
                    }
                    long jLongValue211 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).invoke(null, objArr1310)).longValue();
                    long j121110 = -1288437473;
                    long j121111 = -496;
                    long j121112 = (j121111 * j121110) + (j121111 * jLongValue211);
                    long j121113 = 497;
                    long j121114 = j121110 ^ j2;
                    long j121115 = jLongValue211 ^ j2;
                    long j121116 = j121114 | j121115;
                    long j121117 = j121112 + ((j121116 ^ j2) * j121113) + ((((j121116 | j3) ^ j2) | (((j121115 | j4) | j121110) ^ j2)) * j121113) + (j121113 * (((j121114 | j4) ^ j2) | ((jLongValue211 | j121114) ^ j2) | (((j121115 | j121110) | j3) ^ j2))) + ((long) 1908896757);
                    int elapsedCpuTime7 = (int) Process.getElapsedCpuTime();
                    int i591117 = ~elapsedCpuTime7;
                    int i591118 = ((int) (j121117 >> 32)) & (314194654 + (((~(i591117 | (-1843456072))) | 744538117 | (~(2113202767 | elapsedCpuTime7))) * 717) + (((~(elapsedCpuTime7 | (-1843456072))) | (~(i591117 | 2113202767)) | 744538117) * 717));
                    int i591119 = ((int) j121117) & (1094593649 + (((~(1400492905 | i78)) | 36733504 | (~((-1400423009) | i))) * (-68)) + ((~((-1363689505) | i78)) * (-68)) + (((~(i78 | 1400423008)) | 36803401) * 68));
                    int i60112 = ((i591118 & i591119) | (i591118 ^ i591119)) * 263;
                    int i60113 = i ^ i591112;
                    int i60114 = -i60113;
                    int i60115 = ((i60113 & i60114) | (i60113 ^ i60114)) >> 31;
                    int i60116 = (i60112 | i) & (~(i & i60112)) & (~i60115);
                    int i60117 = i591112 & i60115;
                    i55 = (i60117 & i60116) | (i60116 ^ i60117);
                    strArr4 = strArr8;
                    i56 = 5;
                }
                int i6211 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i6212 = (i6211 ^ 41) + ((i6211 & 41) << 1);
                TuitionPaymentFragmentbindingInflater1 = i6212 % 128;
                int i6213 = i6212 % 2;
                int iLastIndexOf12 = TextUtils.lastIndexOf(str11, '0');
                Object[] objArr1312 = new Object[1];
                a(((iLastIndexOf12 | 371) << 1) - (iLastIndexOf12 ^ 371), 23 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) ((-1) - TextUtils.indexOf((CharSequence) str11, '0')), objArr1312);
                String str517 = (String) objArr1312[0];
                int i6214 = -ImageFormat.getBitsPerPixel(0);
                int i6215 = (i6214 ^ 807) + ((i6214 & 807) << 1);
                int i6216 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                Object[] objArr1313 = new Object[1];
                a(i6215, ((i6216 | 10) << 1) - (i6216 ^ 10), (char) ((-2) - ((-(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))) ^ (-1))), objArr1313);
                String str518 = (String) objArr1313[0];
                Object[] objArr1314 = new Object[1];
                a(817 - (~(-(ViewConfiguration.getEdgeSlop() >> 16))), 7 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) View.getDefaultSize(0, 0), objArr1314);
                String str519 = (String) objArr1314[0];
                int i6217 = -TextUtils.indexOf(str11, str11);
                int i6218 = (i6217 ^ 825) + ((i6217 & 825) << 1);
                int i6310 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                Object[] objArr1315 = new Object[1];
                a(i6218, ((i6310 | 9) << 1) - (i6310 ^ 9), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr1315);
                int i6311 = -TextUtils.indexOf(str11, str11, 0);
                int i6312 = ((i6311 | 833) << 1) - (i6311 ^ 833);
                int i6313 = -View.resolveSizeAndState(0, 0, 0);
                Object[] objArr1410 = new Object[1];
                a(i6312, ((i6313 | 17) << 1) - (i6313 ^ 17), (char) (61182 - (~(-ExpandableListView.getPackedPositionType(0L)))), objArr1410);
                String str520 = (String) objArr1410[0];
                int i6314 = 848 - (~(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                int i6315 = -KeyEvent.keyCodeFromString(str11);
                int i6316 = ((i6315 | 7) << 1) - (i6315 ^ 7);
                int i6317 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                Object[] objArr1411 = new Object[1];
                a(i6314, i6316, (char) (((i6317 | 61129) << 1) - (i6317 ^ 61129)), objArr1411);
                String str521 = (String) objArr1411[0];
                int i6318 = -(-View.MeasureSpec.getSize(0));
                int i6319 = (i6318 ^ 857) + ((i6318 & 857) << 1);
                int i6410 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                Object[] objArr1412 = new Object[1];
                a(i6319, ((i6410 | 8) << 1) - (i6410 ^ 8), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr1412);
                String str610 = (String) objArr1412[0];
                Object[] objArr1413 = new Object[1];
                a(863 - (~(-(-(ViewConfiguration.getMinimumFlingVelocity() >> 16)))), AndroidCharacter.getMirror('0') - '%', (char) (KeyEvent.getMaxKeyCode() >> 16), objArr1413);
                String str611 = (String) objArr1413[0];
                int i6411 = -(-(ViewConfiguration.getWindowTouchSlop() >> 8));
                Object[] objArr1414 = new Object[1];
                a((i6411 ^ 875) + ((i6411 & 875) << 1), (Process.myTid() >> 22) + 14, (char) TextUtils.getOffsetAfter(str11, 0), objArr1414);
                int i6412 = 888 - (~(-(ViewConfiguration.getLongPressTimeout() >> 16)));
                int i6413 = -AndroidCharacter.getMirror('0');
                int i6414 = (i6413 & 64) + (i6413 | 64);
                int iLastIndexOf13 = TextUtils.lastIndexOf(str11, '0', 0, 0);
                int i6415 = (iLastIndexOf13 * (-183)) + 9807775;
                int i6416 = ~iLastIndexOf13;
                int i6417 = ((i6416 ^ 53015) | (i6416 & 53015)) * (-368);
                int i6418 = (i6415 & i6417) + (i6415 | i6417);
                int i6419 = ((-53016) & iLastIndexOf13) | (iLastIndexOf13 ^ (-53016));
                int i6510 = (i6418 - (~(-(-(((i6419 & i61) | (i6419 ^ i61)) * 184))))) - 1;
                int i6511 = ~(((-53016) & i6416) | (i6416 ^ (-53016)));
                int i6512 = ~((i61 ^ iLastIndexOf13) | (i61 & iLastIndexOf13));
                char c12 = (char) (i6510 + (((i6511 & i6512) | (i6511 ^ i6512) | (~((iLastIndexOf13 ^ 53015) | (iLastIndexOf13 & 53015)))) * 184));
                Object[] objArr1415 = new Object[1];
                a(i6412, i6414, c12, objArr1415);
                String str612 = (String) objArr1415[0];
                int i6513 = 904 - (~(-View.MeasureSpec.getSize(0)));
                int touchSlop9 = ViewConfiguration.getTouchSlop() >> 8;
                Object[] objArr1416 = new Object[1];
                a(i6513, (touchSlop9 ^ 3) + ((touchSlop9 & 3) << 1), (char) (ViewConfiguration.getPressedStateDuration() >> 16), objArr1416);
                String str613 = (String) objArr1416[0];
                int i6514 = -(-(ViewConfiguration.getKeyRepeatTimeout() >> 16));
                int i6515 = 21 - (~(-(-Color.green(0))));
                int i6516 = -(-TextUtils.getOffsetBefore(str11, 0));
                Object[] objArr1417 = new Object[1];
                a((i6514 ^ 916) + ((i6514 & 916) << 1), i6515, (char) ((i6516 & 49618) + (i6516 | 49618)), objArr1417);
                String str614 = (String) objArr1417[0];
                int i6517 = -TextUtils.getCapsMode(str11, 0, 0);
                int iTuitionPaymentFragmentbindingInflater113 = zzo.TuitionPaymentFragmentbindingInflater1();
                int i6518 = (i6517 * (-963)) + 904206;
                int i6519 = ~i6517;
                int i6610 = ~((-939) | iTuitionPaymentFragmentbindingInflater113);
                int i6611 = -(-(((i6519 & i6610) | (i6519 ^ i6610)) * (-964)));
                int i6612 = (i6518 ^ i6611) + ((i6518 & i6611) << 1);
                int i6613 = ~((~iTuitionPaymentFragmentbindingInflater113) | (-939));
                int i6614 = ~((i6517 & (-939)) | ((-939) ^ i6517));
                Object[] objArr1418 = new Object[1];
                a((i6612 - (~(-(-(((i6614 & i6613) | (i6613 ^ i6614)) * (-964)))))) - 1, 24 - MotionEvent.axisFromString(str11), (char) (52831 - (~(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))), objArr1418);
                String str615 = (String) objArr1418[0];
                int i6615 = -MotionEvent.axisFromString(str11);
                int i6616 = (i6615 & 962) + (i6615 | 962);
                int scrollBarSize11 = (ViewConfiguration.getScrollBarSize() >> 8) + 28;
                int i6617 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                Object[] objArr1419 = new Object[1];
                a(i6616, scrollBarSize11, (char) (((i6617 | 48696) << 1) - (i6617 ^ 48696)), objArr1419);
                String str616 = (String) objArr1419[0];
                str12 = str11;
                int i6618 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int i6619 = (i6618 ^ 991) + ((i6618 & 991) << 1);
                int i6710 = -(-(ViewConfiguration.getLongPressTimeout() >> 16));
                Object[] objArr1510 = new Object[1];
                a(i6619, (i6710 ^ 11) + ((i6710 & 11) << 1), (char) (22582 - (~(-(-View.resolveSizeAndState(0, 0, 0))))), objArr1510);
                String str617 = (String) objArr1510[0];
                int i6711 = 1001 - (~(-(-Color.blue(0))));
                int i6712 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                Object[] objArr1511 = new Object[1];
                a(i6711, (i6712 & 9) + (i6712 | 9), (char) ((-ExpandableListView.getPackedPositionChild(0L)) - 1), objArr1511);
                String str618 = (String) objArr1511[0];
                Object[] objArr1512 = new Object[1];
                a(1010 - (~(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))), 5 - (~(-(-(ViewConfiguration.getScrollDefaultDelay() >> 16)))), (char) (0 - (~TextUtils.lastIndexOf(str12, '0', 0))), objArr1512);
                String str619 = (String) objArr1512[0];
                Object[] objArr1513 = new Object[1];
                a(1015 - (~(-(Process.myTid() >> 22))), Color.alpha(0) + 6, (char) TextUtils.getOffsetBefore(str12, 0), objArr1513);
                int i6713 = -TextUtils.getTrimmedLength(str12);
                Object[] objArr1514 = new Object[1];
                a(((i6713 | 1022) << 1) - (i6713 ^ 1022), 15 - (~(-(ViewConfiguration.getScrollBarSize() >> 8))), (char) View.resolveSize(0, 0), objArr1514);
                String str710 = (String) objArr1514[0];
                int i6714 = 856 - (~(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))));
                int i6715 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                Object[] objArr1515 = new Object[1];
                a(i6714, ((i6715 | 6) << 1) - (i6715 ^ 6), (char) View.getDefaultSize(0, 0), objArr1515);
                String str711 = (String) objArr1515[0];
                int maximumDrawingCacheSize20 = 825 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int i6716 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                Object[] objArr1516 = new Object[1];
                a(maximumDrawingCacheSize20, (i6716 & 8) + (i6716 | 8), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr1516);
                int i6717 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int i6718 = (i6717 & 1038) + (i6717 | 1038);
                int i6719 = -(-ExpandableListView.getPackedPositionType(0L));
                Object[] objArr1517 = new Object[1];
                a(i6718, (i6719 ^ 14) + ((i6719 & 14) << 1), (char) ((-2) - ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) ^ (-1))), objArr1517);
                String str712 = (String) objArr1517[0];
                Object[] objArr1518 = new Object[1];
                a(1052 - View.MeasureSpec.makeMeasureSpec(0, 0), View.combineMeasuredStates(0, 0) + 1, (char) Gravity.getAbsoluteGravity(0, 0), objArr1518);
                int i6810 = 1052 - (~(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))));
                int threadPriority10 = Process.getThreadPriority(0);
                int i6811 = 8 - (~((((threadPriority10 | 20) << 1) - (threadPriority10 ^ 20)) >> 6));
                int i6812 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                Object[] objArr1519 = new Object[1];
                a(i6810, i6811, (char) (((i6812 | 33325) << 1) - (i6812 ^ 33325)), objArr1519);
                int offsetAfter8 = 1062 - TextUtils.getOffsetAfter(str12, 0);
                int i6813 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                int edgeSlop113 = ViewConfiguration.getEdgeSlop();
                int i6814 = TuitionPaymentFragmentbindingInflater1;
                int i6815 = (i6814 & 93) + (i6814 | 93);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6815 % 128;
                int i6816 = i6815 % 2;
                int i6817 = -(-(edgeSlop113 >> 16));
                Object[] objArr1610 = new Object[1];
                a(offsetAfter8, i6813, (char) ((15029 & i6817) + (i6817 | 15029)), objArr1610);
                String[] strArr220 = {(String) objArr1519[0], (String) objArr1610[0]};
                int threadPriority11 = Process.getThreadPriority(0);
                int i6818 = (-10021) - (~(threadPriority11 * TypedValues.PositionType.TYPE_PERCENT_WIDTH));
                int i6819 = ~threadPriority11;
                int i6910 = ~((i6819 & i) | (i6819 ^ i));
                int i6911 = ~((threadPriority11 ^ 20) | (threadPriority11 & 20));
                int i6912 = i6818 + (((i6910 & i6911) | (i6910 ^ i6911)) * (-502));
                int i6913 = ~threadPriority11;
                int i6914 = (i6913 ^ i42) | (i6913 & i42);
                int i6915 = (~((i6914 & 20) | (i6914 ^ 20))) * (-502);
                int i6916 = (i6912 ^ i6915) + ((i6912 & i6915) << 1);
                int i6917 = ~(((-21) & i) | ((-21) ^ i));
                int i6918 = -(-(((i6913 & i6917) | (i6913 ^ i6917)) * TypedValues.PositionType.TYPE_DRAWPATH));
                int i6919 = 1062 - (~(-(((i6916 & i6918) + (i6918 | i6916)) >> 6)));
                int i7010 = 15 - (~(-(-(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))));
                int gidForName2 = Process.getGidForName(str12);
                Object[] objArr1611 = new Object[1];
                a(i6919, i7010, (char) (((gidForName2 | 1) << 1) - (gidForName2 ^ 1)), objArr1611);
                String str713 = (String) objArr1611[0];
                int i7011 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int i7012 = (i7011 & TypedValues.Custom.TYPE_DIMENSION) + (i7011 | TypedValues.Custom.TYPE_DIMENSION);
                int i7013 = -(-MotionEvent.axisFromString(str12));
                Object[] objArr1612 = new Object[1];
                a(i7012, (i7013 ^ 4) + ((i7013 & 4) << 1), (char) ExpandableListView.getPackedPositionType(0L), objArr1612);
                String str714 = (String) objArr1612[0];
                int i7014 = -(-(ViewConfiguration.getWindowTouchSlop() >> 8));
                int i7015 = (i7014 & 850) + (i7014 | 850);
                int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 7;
                int i7016 = -(-(ViewConfiguration.getTouchSlop() >> 8));
                Object[] objArr1613 = new Object[1];
                a(i7015, longPressTimeout2, (char) ((i7016 & 61130) + (i7016 | 61130)), objArr1613);
                String str715 = (String) objArr1613[0];
                int mirror7 = 1127 - AndroidCharacter.getMirror('0');
                int i7017 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                Object[] objArr1614 = new Object[1];
                a(mirror7, ((i7017 | 8) << 1) - (i7017 ^ 8), (char) (0 - (~(-(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))))), objArr1614);
                String str716 = (String) objArr1614[0];
                int i7018 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                int iTuitionPaymentFragmentbindingInflater114 = zzo.TuitionPaymentFragmentbindingInflater1();
                int i7019 = (((i7018 * (-159)) - 137376) - (~(-(-(((~i7018) | 864) * 160))))) - 1;
                int i7110 = ~((~iTuitionPaymentFragmentbindingInflater114) | i7018);
                int i7111 = ~(i7018 | 864);
                int i7112 = ((i7110 ^ i7111) | (i7110 & i7111)) * (-160);
                int i7113 = ~iTuitionPaymentFragmentbindingInflater114;
                int i7114 = ~((i7113 & (-865)) | ((-865) ^ i7113));
                int i7115 = ((((i7019 | i7112) << 1) - (i7019 ^ i7112)) - (~(((i7018 & i7114) | (i7018 ^ i7114)) * 160))) - 1;
                int threadPriority12 = Process.getThreadPriority(0);
                Object[] objArr1615 = new Object[1];
                a(i7115, 10 - (~(-((((threadPriority12 | 20) << 1) - (threadPriority12 ^ 20)) >> 6))), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr1615);
                String str717 = (String) objArr1615[0];
                int iIndexOf115 = TextUtils.indexOf((CharSequence) str12, '0', 0, 0);
                int i7116 = ((iIndexOf115 | 876) << 1) - (iIndexOf115 ^ 876);
                int i7117 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                int i7118 = ((i7117 | 14) << 1) - (i7117 ^ 14);
                int i7119 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                Object[] objArr1616 = new Object[1];
                a(i7116, i7118, (char) ((i7119 & 1) + (i7119 | 1)), objArr1616);
                int i7210 = -View.resolveSize(0, 0);
                Object[] objArr1617 = new Object[1];
                a(((i7210 | 1087) << 1) - (i7210 ^ 1087), 20 - (~(-(-((byte) KeyEvent.getModifierMetaStateMask())))), (char) ((Process.myPid() >> 22) + 63256), objArr1617);
                String str718 = (String) objArr1617[0];
                int i7211 = 1106 - (~ExpandableListView.getPackedPositionType(0L));
                int packedPositionType9 = 19 - ExpandableListView.getPackedPositionType(0L);
                int i7212 = -TextUtils.indexOf((CharSequence) str12, '0', 0, 0);
                Object[] objArr1618 = new Object[1];
                a(i7211, packedPositionType9, (char) (((i7212 | 32548) << 1) - (i7212 ^ 32548)), objArr1618);
                String str719 = (String) objArr1618[0];
                int i7213 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                int iTuitionPaymentFragmentbindingInflater115 = zzo.TuitionPaymentFragmentbindingInflater1();
                int i7214 = i7213 * 319;
                int i7215 = ((i7214 | (-356942)) << 1) - (i7214 ^ (-356942));
                int i7216 = ~i7213;
                int i7217 = ~((i7216 & iTuitionPaymentFragmentbindingInflater115) | (i7216 ^ iTuitionPaymentFragmentbindingInflater115));
                int i7218 = ((i7217 & (-1127)) | ((-1127) ^ i7217)) * (-318);
                int i7219 = ((i7215 | i7218) << 1) - (i7218 ^ i7215);
                int i7310 = ~(((-1127) ^ iTuitionPaymentFragmentbindingInflater115) | ((-1127) & iTuitionPaymentFragmentbindingInflater115));
                int i7311 = ~iTuitionPaymentFragmentbindingInflater115;
                int i7312 = ~((i7311 & i7213) | (i7311 ^ i7213) | 1126);
                int i7313 = ((i7310 & i7312) | (i7310 ^ i7312)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                int i7314 = (i7219 ^ i7313) + ((i7313 & i7219) << 1);
                int i7315 = ~iTuitionPaymentFragmentbindingInflater115;
                int i7316 = (i7315 & (-1127)) | ((-1127) ^ i7315);
                int i7317 = ~((i7316 & i7213) | (i7316 ^ i7213));
                int i7318 = (i7213 & 1126) | (i7213 ^ 1126);
                int i7319 = ~((i7318 & iTuitionPaymentFragmentbindingInflater115) | (i7318 ^ iTuitionPaymentFragmentbindingInflater115));
                int i7410 = ((i7319 & i7317) | (i7317 ^ i7319)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                int i7411 = (i7314 ^ i7410) + ((i7410 & i7314) << 1);
                int windowTouchSlop13 = ViewConfiguration.getWindowTouchSlop() >> 8;
                int i7412 = ((windowTouchSlop13 | 31) << 1) - (windowTouchSlop13 ^ 31);
                int i7413 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                Object[] objArr1619 = new Object[1];
                a(i7411, i7412, (char) (((i7413 | 57796) << 1) - (i7413 ^ 57796)), objArr1619);
                String str87 = (String) objArr1619[0];
                int i7414 = 1156 - (~(-(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))));
                int trimmedLength8 = TextUtils.getTrimmedLength(str12);
                int i7415 = (trimmedLength8 ^ 26) + ((trimmedLength8 & 26) << 1);
                int i7416 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                char c13 = (char) (((i7416 | 63007) << 1) - (63007 ^ i7416));
                Object[] objArr1710 = new Object[1];
                a(i7414, i7415, c13, objArr1710);
                String str88 = (String) objArr1710[0];
                int i7417 = -(-(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                int iLastIndexOf14 = TextUtils.lastIndexOf(str12, '0');
                Object[] objArr1711 = new Object[1];
                a((i7417 & 1183) + (i7417 | 1183), (iLastIndexOf14 ^ 24) + ((iLastIndexOf14 & 24) << 1), (char) ((-2) - (~(-TextUtils.lastIndexOf(str12, '0')))), objArr1711);
                String str89 = (String) objArr1711[0];
                int i7418 = -(ViewConfiguration.getScrollBarSize() >> 8);
                int i7419 = (i7418 & 1206) + (i7418 | 1206);
                int i7510 = -TextUtils.getTrimmedLength(str12);
                int i7511 = (i7510 & 33) + (i7510 | 33);
                int i7512 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                Object[] objArr1712 = new Object[1];
                a(i7419, i7511, (char) ((i7512 ^ 44774) + ((i7512 & 44774) << 1)), objArr1712);
                Object[] objArr1713 = new Object[1];
                a(1238 - (~(-Color.green(0))), 13 - (~TextUtils.indexOf((CharSequence) str12, '0')), (char) (58304 - (~(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24)))), objArr1713);
                String str810 = (String) objArr1713[0];
                int iIndexOf116 = TextUtils.indexOf((CharSequence) str12, '0');
                int i7513 = (iIndexOf116 & 819) + (iIndexOf116 | 819);
                int i7514 = -(-ExpandableListView.getPackedPositionChild(0L));
                Object[] objArr1714 = new Object[1];
                a(i7513, (i7514 ^ 8) + ((i7514 & 8) << 1), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr1714);
                int i7515 = -TextUtils.lastIndexOf(str12, '0');
                Object[] objArr1715 = new Object[1];
                a(((i7515 | 1251) << 1) - (i7515 ^ 1251), (ViewConfiguration.getTapTimeout() >> 16) + 30, (char) (34014 - (~(-(-(ViewConfiguration.getTapTimeout() >> 16))))), objArr1715);
                String str811 = (String) objArr1715[0];
                int i7516 = -(-(ViewConfiguration.getScrollBarFadeDuration() >> 16));
                int i7517 = ((i7516 | 1282) << 1) - (i7516 ^ 1282);
                int iIndexOf117 = 11 - TextUtils.indexOf(str12, str12, 0);
                int i7518 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                Object[] objArr1716 = new Object[1];
                a(i7517, iIndexOf117, (char) ((i7518 ^ 30530) + ((i7518 & 30530) << 1)), objArr1716);
                int i7519 = -Color.rgb(0, 0, 0);
                int i7610 = (i7519 * 141) - 1963113999;
                int i7611 = ~i7519;
                int i7612 = ~((i7611 ^ (-16775923)) | (i7611 & (-16775923)));
                int i7613 = ~(i7611 | i);
                int i7614 = -(-(((i7612 & i7613) | (i7612 ^ i7613)) * (-280)));
                int i7615 = ((i7610 | i7614) << 1) - (i7610 ^ i7614);
                int i7616 = ~((i7611 ^ i) | (i7611 & i));
                int i7617 = ~((16775922 ^ i) | (16775922 & i));
                int i7618 = i7615 + (((i7616 & i7617) | (i7616 ^ i7617)) * 140);
                int i7619 = (i7611 ^ 16775922) | (16775922 & i7611);
                int i7710 = i7611 | i42;
                int i7711 = (~((i7619 & i) | (i7619 ^ i))) | (~((i7710 & (-16775923)) | (i7710 ^ (-16775923))));
                int i7712 = (16775922 & i61) | (16775922 ^ i61);
                Object[] objArr1717 = new Object[1];
                a(i7618 + (((~((i7519 & i7712) | (i7712 ^ i7519))) | i7711) * 140), 19 - (Process.myTid() >> 22), (char) (3737 - View.MeasureSpec.makeMeasureSpec(0, 0)), objArr1717);
                String str812 = (String) objArr1717[0];
                Object[] objArr1718 = new Object[1];
                a((ViewConfiguration.getKeyRepeatDelay() >> 16) + 1312, 4 - (~(-ExpandableListView.getPackedPositionGroup(0L))), (char) (ViewConfiguration.getTouchSlop() >> 8), objArr1718);
                int i7713 = 1318 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int i7714 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                Object[] objArr1719 = new Object[1];
                a(i7713, (i7714 & 18) + (i7714 | 18), (char) (View.resolveSize(0, 0) + 36199), objArr1719);
                int mirror8 = AndroidCharacter.getMirror('0') + 1288;
                int fadingEdgeLength4 = ViewConfiguration.getFadingEdgeLength() >> 16;
                Object[] objArr1810 = new Object[1];
                a(mirror8, (fadingEdgeLength4 ^ 16) + ((fadingEdgeLength4 & 16) << 1), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr1810);
                int touchSlop10 = (ViewConfiguration.getTouchSlop() >> 8) + 1352;
                int offsetAfter9 = TextUtils.getOffsetAfter(str12, 0);
                int iTuitionPaymentFragmentbindingInflater116 = zzo.TuitionPaymentFragmentbindingInflater1();
                int i7715 = (offsetAfter9 * (-500)) - 9500;
                int i7716 = ~((-20) | offsetAfter9);
                int i7717 = ~offsetAfter9;
                int i7718 = i7717 | 19;
                int i7719 = i7715 + ((i7716 | (~((i7718 & iTuitionPaymentFragmentbindingInflater116) | (i7718 ^ iTuitionPaymentFragmentbindingInflater116)))) * TypedValues.PositionType.TYPE_TRANSITION_EASING);
                int i7810 = -(-((~((i7717 ^ (-20)) | (i7717 & (-20)))) * 1002));
                int i7811 = ((i7719 | i7810) << 1) - (i7719 ^ i7810);
                int i7812 = ~iTuitionPaymentFragmentbindingInflater116;
                int i7813 = (i7812 & i7717) | (i7717 ^ i7812);
                int i7814 = (~((i7813 & 19) | (i7813 ^ 19))) * TypedValues.PositionType.TYPE_TRANSITION_EASING;
                Object[] objArr1811 = new Object[1];
                a(touchSlop10, ((i7811 | i7814) << 1) - (i7814 ^ i7811), (char) KeyEvent.normalizeMetaState(0), objArr1811);
                int i7815 = -(Process.myTid() >> 22);
                Object[] objArr1812 = new Object[1];
                a((i7815 ^ 1371) + ((i7815 & 1371) << 1), (KeyEvent.getMaxKeyCode() >> 16) + 19, (char) (41785 - (~(-(-View.getDefaultSize(0, 0))))), objArr1812);
                int i7816 = -(KeyEvent.getMaxKeyCode() >> 16);
                int i7817 = (i7816 ^ 1390) + ((i7816 & 1390) << 1);
                int i7818 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                int iIndexOf118 = TextUtils.indexOf(str12, str12, 0);
                Object[] objArr1813 = new Object[1];
                a(i7817, ((i7818 | 24) << 1) - (i7818 ^ 24), (char) ((iIndexOf118 ^ 24866) + ((iIndexOf118 & 24866) << 1)), objArr1813);
                int i7819 = -(-(ViewConfiguration.getJumpTapTimeout() >> 16));
                int i7910 = (i7819 ^ 1413) + ((i7819 & 1413) << 1);
                int i7911 = -(Process.myPid() >> 22);
                Object[] objArr1814 = new Object[1];
                a(i7910, (i7911 & 21) + (i7911 | 21), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr1814);
                int i7912 = -(Process.myTid() >> 22);
                int i7913 = (i7912 ^ 1434) + ((i7912 & 1434) << 1);
                int mirror9 = 'H' - AndroidCharacter.getMirror('0');
                int i7914 = -TextUtils.getCapsMode(str12, 0, 0);
                Object[] objArr1815 = new Object[1];
                a(i7913, mirror9, (char) (((i7914 | 41114) << 1) - (i7914 ^ 41114)), objArr1815);
                String str813 = str2;
                int i7915 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                int i7916 = (i7915 ^ 1458) + ((i7915 & 1458) << 1);
                int i7917 = -TextUtils.getOffsetAfter(str12, 0);
                Object[] objArr1816 = new Object[1];
                a(i7916, ((i7917 | 28) << 1) - (i7917 ^ 28), (char) ((-2) - (~(-(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))))), objArr1816);
                int i7918 = 1486 - (~(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))));
                int i7919 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                Object[] objArr1817 = new Object[1];
                a(i7918, ((i7919 | 27) << 1) - (i7919 ^ 27), (char) KeyEvent.normalizeMetaState(0), objArr1817);
                int i8010 = -TextUtils.indexOf((CharSequence) str12, '0', 0, 0);
                int i8011 = ((i8010 | 1512) << 1) - (i8010 ^ 1512);
                int i8012 = -(-(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                int i8013 = ((i8012 | 31) << 1) - (i8012 ^ 31);
                int i8014 = -(-TextUtils.lastIndexOf(str12, '0'));
                Object[] objArr1818 = new Object[1];
                a(i8011, i8013, (char) ((i8014 & 1) + (i8014 | 1)), objArr1818);
                int i8015 = 1544 - (~(-(-Process.getGidForName(str12))));
                char mirror10 = AndroidCharacter.getMirror('0');
                Object[] objArr1819 = new Object[1];
                a(i8015, (mirror10 ^ (-21)) + ((mirror10 & (-21)) << 1), (char) (ViewConfiguration.getTapTimeout() >> 16), objArr1819);
                int i8016 = 1571 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int i8017 = -(-TextUtils.getOffsetAfter(str12, 0));
                Object[] objArr1910 = new Object[1];
                a(i8016, ((i8017 | 32) << 1) - (i8017 ^ 32), (char) View.getDefaultSize(0, 0), objArr1910);
                strArr5 = new String[][]{new String[]{str517, str518, str519, (String) objArr1315[0]}, new String[]{str520, str521, str610, str611, (String) objArr1414[0]}, new String[]{str612, str613, str2, str614, str615, str616}, new String[]{str617, str618, str619, (String) objArr1513[0]}, new String[]{str710, str711, (String) objArr1516[0]}, new String[]{str712, (String) objArr1518[0]}, strArr220, new String[]{str713, str714, str715, str716, str717, (String) objArr1616[0]}, new String[]{str718, str719, str87, str88, str89, (String) objArr1712[0], str2}, new String[]{str810, (String) objArr1714[0]}, new String[]{str811, (String) objArr1716[0]}, new String[]{str812, (String) objArr1718[0]}, new String[]{(String) objArr1719[0]}, new String[]{(String) objArr1810[0]}, new String[]{(String) objArr1811[0]}, new String[]{(String) objArr1812[0]}, new String[]{(String) objArr1813[0]}, new String[]{(String) objArr1814[0]}, new String[]{(String) objArr1815[0], str813}, new String[]{(String) objArr1816[0], str813}, new String[]{(String) objArr1817[0], str813}, new String[]{(String) objArr1818[0], str813}, new String[]{(String) objArr1819[0], str813}, new String[]{(String) objArr1910[0], str813}};
                int i8018 = -(-((Process.getThreadPriority(0) + 20) >> 6));
                Object[] objArr1911 = new Object[1];
                a((i8018 ^ 1603) + ((i8018 & 1603) << 1), 1 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (KeyEvent.normalizeMetaState(0) + 63692), objArr1911);
                sb = new StringBuilder((String) objArr1911[0]);
                i64 = i;
                i65 = 0;
                i66 = 0;
                while (i65 < 24) {
                    int i8019 = TuitionPaymentFragmentbindingInflater1;
                    i69 = (i8019 & 113) + (i8019 | 113);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i69 % 128;
                    if (i69 % 2 == 0) {
                        String[] strArr221 = strArr5[i65];
                        Object[] objArr1912 = {strArr221[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                            char modifierMetaStateMask17 = (char) (33601 - ((byte) KeyEvent.getModifierMetaStateMask()));
                            int iLastIndexOf15 = TextUtils.lastIndexOf(str12, '0', 0) + 3086;
                            int iKeyCodeFromString11 = KeyEvent.keyCodeFromString(str12) + 26;
                            byte b66 = (byte) 0;
                            byte b67 = (byte) (b66 + 5);
                            Object[] objArr1913 = new Object[1];
                            c(b66, b67, (byte) (b67 - 5), objArr1913);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(modifierMetaStateMask17, iLastIndexOf15, iKeyCodeFromString11, 1411172903, false, (String) objArr1913[0], new Class[]{String.class});
                        }
                        str13 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr1912);
                        strArr7 = strArr221;
                        strArr5 = strArr5;
                    } else {
                        i63 = i63;
                        i64 = i64;
                        strArr7 = strArr5[i65];
                        Object[] objArr1914 = {strArr7[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                            char cIndexOf8 = (char) (33602 - TextUtils.indexOf(str12, str12));
                            int iCombineMeasuredStates5 = View.combineMeasuredStates(0, 0) + 3085;
                            int iLastIndexOf16 = TextUtils.lastIndexOf(str12, '0') + 27;
                            byte b68 = (byte) 0;
                            byte b69 = (byte) (b68 + 5);
                            Object[] objArr1915 = new Object[1];
                            c(b68, b69, (byte) (b69 - 5), objArr1915);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(cIndexOf8, iCombineMeasuredStates5, iLastIndexOf16, 1411172903, false, (String) objArr1915[0], new Class[]{String.class});
                        }
                        str13 = (String) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr1914);
                    }
                    String[] strArr222 = (String[]) Arrays.copyOfRange(strArr7, 1, strArr7.length);
                    if (str13 != null) {
                        i70 = i61;
                        i71 = 1;
                        i64 = i64;
                    } else {
                        i70 = i61;
                        i71 = 1;
                        i64 = i64;
                    }
                    i65 = ((i65 | 1) << i71) - (i65 ^ 1);
                    i61 = i70;
                    strArr5 = strArr5;
                    i63 = i63;
                }
                int i8110 = i63;
                i67 = i61;
                i68 = i64;
                int i8111 = -TextUtils.getCapsMode(str12, 0, 0);
                int i8210 = (i8111 ^ 1607) + ((i8111 & 1607) << 1);
                int doubleTapTimeout3 = 1 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int i8211 = -Color.blue(0);
                int iTuitionPaymentFragmentbindingInflater117 = zzo.TuitionPaymentFragmentbindingInflater1();
                int i8212 = (i8211 * (-380)) + 5451522;
                int i8213 = (iTuitionPaymentFragmentbindingInflater117 ^ 14271) | (iTuitionPaymentFragmentbindingInflater117 & 14271);
                int i8214 = ~i8211;
                int i8215 = ((i8213 & i8214) | (i8213 ^ i8214)) * (-381);
                int i8216 = (i8212 & i8215) + (i8212 | i8215);
                int i8217 = ~(i8214 | (-14272));
                int i8218 = ~((~iTuitionPaymentFragmentbindingInflater117) | 14271);
                char c14 = (char) (i8216 + (((~((i8211 & 14271) | (i8211 ^ 14271))) | (i8218 & i8217) | (i8217 ^ i8218)) * 381) + ((~((i8214 ^ 14271) | (i8214 & 14271))) * 381));
                Object[] objArr201 = new Object[1];
                a(i8210, doubleTapTimeout3, c14, objArr201);
                sb.append((String) objArr201[0]);
                objArr3 = new Object[2];
                if (i66 > 2) {
                    objArr3[0] = new int[1];
                    String[] strArr31 = {sb.toString()};
                    ((int[]) objArr3[0])[0] = i68;
                    objArr3[1] = strArr31;
                } else {
                    objArr3[0] = new int[]{i};
                    objArr3[1] = new String[0];
                }
                int i8219 = ((int[]) objArr3[0])[0];
                int i834 = ((~i8110) & i) | (i8110 & i67);
                int i835 = (i834 | (-i834)) >> 31;
                int i836 = i8219 & (~i835);
                int i837 = i8110 & i835;
                i63 = (i837 & i836) | (i836 ^ i837);
                strArr6 = (String[]) objArr3[1];
                int i461116 = 888 - (~(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))));
                int i461117 = -(-TextUtils.indexOf((CharSequence) str12, '0', 0, 0));
                Object[] objArr81110 = new Object[1];
                a(i461116, ((i461117 | 17) << 1) - (i461117 ^ 17), (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 53014), objArr81110);
                Object[] objArr81111 = {(String) objArr81110[0]};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                    char deadChar6 = (char) (33602 - KeyEvent.getDeadChar(0, 0));
                    int jumpTapTimeout4 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 3085;
                    int packedPositionType10 = ExpandableListView.getPackedPositionType(0L) + 26;
                    byte b41117 = (byte) 0;
                    byte b41118 = (byte) (b41117 + 5);
                    Object[] objArr81112 = new Object[1];
                    c(b41117, b41118, (byte) (b41118 - 5), objArr81112);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(deadChar6, jumpTapTimeout4, packedPositionType10, 1411172903, false, (String) objArr81112[0], new Class[]{String.class});
                }
                objInvoke2 = ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr81111);
                if (objInvoke2 == null) {
                    i73 = 0;
                } else {
                    Object[] objArr81113 = {objInvoke2, 42};
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                        char cAlpha4 = (char) Color.alpha(0);
                        int i461118 = 3394 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        int iIndexOf119 = TextUtils.indexOf((CharSequence) str12, '0', 0) + 10;
                        byte b41119 = (byte) 0;
                        byte b41120 = (byte) (b41119 + 5);
                        Object[] objArr81114 = new Object[1];
                        c(b41119, b41120, (byte) (b41120 - 5), objArr81114);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(cAlpha4, i461118, iIndexOf119, 1203525406, false, (String) objArr81114[0], new Class[]{String.class, Integer.TYPE});
                    }
                    long jLongValue1117 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).invoke(null, objArr81113)).longValue();
                    long j9113 = 31585084;
                    long j9114 = (((long) (-523)) * j9113) + (((long) 263) * jLongValue1117);
                    long j9115 = 262;
                    long j10124 = ((j9113 ^ j2) | jLongValue1117) ^ j2;
                    long j10125 = jLongValue1117 ^ j2;
                    long j10126 = (j9113 | j10125) ^ j2;
                    long j10127 = j9114 + ((j10124 | j10126 | ((j10125 | j3) ^ j2)) * j9115) + (((long) (-786)) * j10126) + (j9115 * (((j10125 | j4) ^ j2) | j10124 | j10126)) + ((long) (-33654961));
                    int i461119 = ((int) (j10127 >> 32)) & (((635053406 + (((~(1766687994 | i67)) | (~(1091052890 | i))) * (-370))) + ((((~(1766687994 | i)) | (~(1091052890 | i67))) | 1091044442) * (-370))) - 40482284);
                    int i461120 = ((int) j10127) & (2131573617 + (((~(1064955753 | i67)) | 372270656 | (~((-523789889) | i))) * (-68)) + ((~((-151519233) | i67)) * (-68)) + (((~(523789888 | i67)) | 913436521) * 68));
                    i73 = (i461119 & i461120) | (i461119 ^ i461120);
                }
                if (i73 != 1986687685) {
                    i100 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 63;
                    TuitionPaymentFragmentbindingInflater1 = i100 % 128;
                    if (i100 % 2 != 0) {
                        int i46121 = 28 / 0;
                        if (i73 == -1514516938) {
                            i74 = i67;
                            str14 = str12;
                            strArr8 = strArr6;
                        } else {
                            i101 = 19;
                            int offsetBefore17 = TextUtils.getOffsetBefore(str12, 0);
                            Object[] objArr81115 = new Object[1];
                            a((offsetBefore17 & 1608) + (offsetBefore17 | 1608), ImageFormat.getBitsPerPixel(0) + 15, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), objArr81115);
                            int i4611110 = -(-Gravity.getAbsoluteGravity(0, 0));
                            int i4611111 = (i4611110 & 1622) + (i4611110 | 1622);
                            int i4611112 = -TextUtils.getOffsetAfter(str12, 0);
                            Object[] objArr81116 = new Object[1];
                            a(i4611111, ((i4611112 | 26) << 1) - (i4611112 ^ 26), (char) Color.red(0), objArr81116);
                            int i471111110 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                            int i471111111 = (i471111110 ^ 1649) + ((i471111110 & 1649) << 1);
                            int packedPositionChild7 = ExpandableListView.getPackedPositionChild(0L);
                            int i471111112 = (packedPositionChild7 ^ 18) + ((packedPositionChild7 & 18) << 1);
                            int i471111113 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            Object[] objArr91111110 = new Object[1];
                            a(i471111111, i471111112, (char) ((i471111113 ^ 18429) + ((i471111113 & 18429) << 1)), objArr91111110);
                            int i471111114 = -AndroidCharacter.getMirror('0');
                            int i471111115 = (i471111114 & 1713) + (i471111114 | 1713);
                            int iAlpha9 = Color.alpha(0);
                            Object[] objArr91111111 = new Object[1];
                            a(i471111115, ((iAlpha9 | 17) << 1) - (iAlpha9 ^ 17), (char) TextUtils.indexOf(str12, str12, 0), objArr91111111);
                            int i471111116 = 1681 - (~(-(ViewConfiguration.getWindowTouchSlop() >> 8)));
                            int iIndexOf1110 = TextUtils.indexOf((CharSequence) str12, '0', 0, 0);
                            int i471111117 = (iIndexOf1110 ^ 16) + ((iIndexOf1110 & 16) << 1);
                            int i471111118 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                            Object[] objArr91111112 = new Object[1];
                            a(i471111116, i471111117, (char) ((i471111118 ^ 42519) + ((i471111118 & 42519) << 1)), objArr91111112);
                            int i471111119 = -TextUtils.getTrimmedLength(str12);
                            int i481111110 = (i471111119 ^ 1697) + ((i471111119 & 1697) << 1);
                            int iKeyCodeFromString12 = KeyEvent.keyCodeFromString(str12);
                            int i481111111 = -View.resolveSizeAndState(0, 0, 0);
                            Object[] objArr91111113 = new Object[1];
                            a(i481111110, ((iKeyCodeFromString12 | 37) << 1) - (iKeyCodeFromString12 ^ 37), (char) (((i481111111 | 24132) << 1) - (i481111111 ^ 24132)), objArr91111113);
                            Object[] objArr91111114 = new Object[1];
                            a(1733 - (~(-TextUtils.indexOf(str12, str12, 0, 0))), 10 - (~(-(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))))), (char) ExpandableListView.getPackedPositionGroup(0L), objArr91111114);
                            int scrollBarSize12 = 1746 - (ViewConfiguration.getScrollBarSize() >> 8);
                            int i481111112 = -(-(ViewConfiguration.getScrollBarSize() >> 8));
                            Object[] objArr91111115 = new Object[1];
                            a(scrollBarSize12, (i481111112 & 13) + (i481111112 | 13), (char) Color.blue(0), objArr91111115);
                            int i481111113 = -TextUtils.indexOf((CharSequence) str12, '0');
                            Object[] objArr91111116 = new Object[1];
                            a((i481111113 ^ 1758) + ((i481111113 & 1758) << 1), 20 - (~(-TextUtils.lastIndexOf(str12, '0', 0))), (char) KeyEvent.normalizeMetaState(0), objArr91111116);
                            int i481111114 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int i481111115 = (i481111114 & 1781) + (i481111114 | 1781);
                            int i481111116 = -View.resolveSize(0, 0);
                            int i481111117 = ((i481111116 | 31) << 1) - (i481111116 ^ 31);
                            int i481111118 = -(-TextUtils.lastIndexOf(str12, '0', 0, 0));
                            Object[] objArr91111117 = new Object[1];
                            a(i481111115, i481111117, (char) ((i481111118 ^ 1) + ((i481111118 & 1) << 1)), objArr91111117);
                            int iRgb7 = Color.rgb(0, 0, 0) + 16779028;
                            int iMyTid13 = Process.myTid() >> 22;
                            Object[] objArr91111118 = new Object[1];
                            a(iRgb7, (iMyTid13 & 12) + (iMyTid13 | 12), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr91111118);
                            String str4115 = (String) objArr91111118[0];
                            zzo.TuitionPaymentFragmentbindingInflater1();
                            int i481111119 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                            Object[] objArr91111119 = new Object[1];
                            a(((i481111119 | 1824) << 1) - (i481111119 ^ 1824), 12 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (11535 - (~(ViewConfiguration.getTapTimeout() >> 16))), objArr91111119);
                            int offsetBefore18 = TextUtils.getOffsetBefore(str12, 0);
                            Object[] objArr101111112 = new Object[1];
                            a((offsetBefore18 ^ 1836) + ((offsetBefore18 & 1836) << 1), 10 - (~(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (char) (0 - (~(-(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))))), objArr101111112);
                            int iGreen7 = Color.green(0);
                            int i491111110 = ((iGreen7 | 1848) << 1) - (iGreen7 ^ 1848);
                            int i491111111 = -View.MeasureSpec.getMode(0);
                            Object[] objArr101111113 = new Object[1];
                            a(i491111110, (i491111111 ^ 12) + ((i491111111 & 12) << 1), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr101111113);
                            int i491111112 = -KeyEvent.normalizeMetaState(0);
                            int i491111113 = (i491111112 ^ 1860) + ((i491111112 & 1860) << 1);
                            int i491111114 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            int i491111115 = -(-TextUtils.getOffsetAfter(str12, 0));
                            Object[] objArr101111114 = new Object[1];
                            a(i491111113, (i491111114 & 11) + (i491111114 | 11), (char) ((i491111115 ^ 58504) + ((i491111115 & 58504) << 1)), objArr101111114);
                            int i491111116 = 1871 - (~(ViewConfiguration.getDoubleTapTimeout() >> 16));
                            int i491111117 = -(-View.resolveSizeAndState(0, 0, 0));
                            int i491111118 = (i491111117 ^ 14) + ((i491111117 & 14) << 1);
                            int i491111119 = -TextUtils.indexOf(str12, str12, 0);
                            Object[] objArr101111115 = new Object[1];
                            a(i491111116, i491111118, (char) ((i491111119 ^ 45017) + ((i491111119 & 45017) << 1)), objArr101111115);
                            int touchSlop11 = ViewConfiguration.getTouchSlop();
                            int i501111110 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
                            TuitionPaymentFragmentbindingInflater1 = i501111110 % 128;
                            int i501111111 = i501111110 % 2;
                            int i501111112 = -(touchSlop11 >> 8);
                            int i501111113 = ((1886 | i501111112) << 1) - (i501111112 ^ 1886);
                            int i501111114 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            int i501111115 = ((i501111114 | 13) << 1) - (i501111114 ^ 13);
                            int i501111116 = -(-TextUtils.lastIndexOf(str12, '0', 0, 0));
                            Object[] objArr101111116 = new Object[1];
                            a(i501111113, i501111115, (char) ((i501111116 ^ 15060) + ((i501111116 & 15060) << 1)), objArr101111116);
                            int i501111117 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                            int i501111118 = (i501111117 ^ 1898) + ((i501111117 & 1898) << 1);
                            int maximumDrawingCacheSize110 = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                            int iTuitionPaymentFragmentbindingInflater118 = zzo.TuitionPaymentFragmentbindingInflater1();
                            int i501111119 = maximumDrawingCacheSize110 * (-244);
                            int i511111110 = (i501111119 ^ 5904) + ((i501111119 & 5904) << 1);
                            int i511111111 = ~iTuitionPaymentFragmentbindingInflater118;
                            int i511111112 = (((i511111110 - (~(((~(((-25) ^ maximumDrawingCacheSize110) | ((-25) & maximumDrawingCacheSize110))) | (~((i511111111 & (-25)) | ((-25) ^ i511111111)))) * (-245)))) - 1) - (~(-(-((~(((-25) ^ iTuitionPaymentFragmentbindingInflater118) | ((-25) & iTuitionPaymentFragmentbindingInflater118))) * (-245)))))) - 1;
                            int i511111113 = ~((iTuitionPaymentFragmentbindingInflater118 & (-25)) | ((-25) ^ iTuitionPaymentFragmentbindingInflater118));
                            int i511111114 = ((maximumDrawingCacheSize110 & i511111113) | (maximumDrawingCacheSize110 ^ i511111113)) * 245;
                            int i511111115 = ((i511111112 | i511111114) << 1) - (i511111114 ^ i511111112);
                            int i511111116 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                            Object[] objArr101111117 = new Object[1];
                            a(i501111118, i511111115, (char) ((i511111116 ^ 1) + ((i511111116 & 1) << 1)), objArr101111117);
                            int i511111117 = -(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                            int i511111118 = -View.resolveSize(0, 0);
                            Object[] objArr101111118 = new Object[1];
                            a((i511111117 & 1921) + (i511111117 | 1921), (i511111118 & 28) + (i511111118 | 28), (char) KeyEvent.keyCodeFromString(str12), objArr101111118);
                            strArr13 = new String[]{(String) objArr81115[0], (String) objArr81116[0], (String) objArr91111110[0], (String) objArr91111111[0], (String) objArr91111112[0], (String) objArr91111113[0], (String) objArr91111114[0], (String) objArr91111115[0], (String) objArr91111116[0], (String) objArr91111117[0], str4115, (String) objArr91111119[0], (String) objArr101111112[0], (String) objArr101111113[0], (String) objArr101111114[0], (String) objArr101111115[0], (String) objArr101111116[0], (String) objArr101111117[0], (String) objArr101111118[0]};
                            i102 = 0;
                            while (true) {
                                if (i102 < i101) {
                                    i74 = i67;
                                    str14 = str12;
                                    strArr8 = strArr6;
                                    i103 = -1;
                                    break;
                                }
                                str18 = strArr13[i102];
                                Object[] objArr101111119 = {str18};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                                    char cIndexOf9 = (char) ((-1) - TextUtils.indexOf((CharSequence) str12, '0'));
                                    int edgeSlop114 = 993 - (ViewConfiguration.getEdgeSlop() >> 16);
                                    int capsMode8 = 8 - TextUtils.getCapsMode(str12, 0, 0);
                                    byte b411110 = (byte) 0;
                                    byte b411111 = (byte) (b411110 + 5);
                                    Object[] objArr10124 = new Object[1];
                                    c(b411110, b411111, (byte) (b411111 - 5), objArr10124);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(cIndexOf9, edgeSlop114, capsMode8, 410748506, false, (String) objArr10124[0], new Class[]{String.class});
                                }
                                long jLongValue1118 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).invoke(null, objArr101111119)).longValue();
                                long j1011114 = 1443778717;
                                i74 = i67;
                                str14 = str12;
                                long j1011115 = jLongValue1118 ^ j2;
                                i104 = i102;
                                strArr8 = strArr6;
                                long startElapsedRealtime15 = (int) Process.getStartElapsedRealtime();
                                long j1011116 = startElapsedRealtime15 ^ j2;
                                long j1011117 = (j1011116 | jLongValue1118) ^ j2;
                                long j1011118 = 516;
                                long j1011119 = j1011114 ^ j2;
                                j5 = (((long) (-515)) * j1011114) + (((long) 517) * jLongValue1118) + (((long) (-516)) * (((j1011115 | startElapsedRealtime15) ^ j2) | ((j1011116 | j1011114) ^ j2) | j1011117)) + (((((j1011119 | j1011115) | startElapsedRealtime15) ^ j2) | (((j1011119 | j1011116) | jLongValue1118) ^ j2)) * j1011118) + (j1011118 * (((jLongValue1118 | j1011119) ^ j2) | j1011117)) + ((long) (-1644696954));
                                int i511111119 = TuitionPaymentFragmentbindingInflater1;
                                i105 = (i511111119 ^ 97) + ((i511111119 & 97) << 1);
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i105 % 128;
                                if (i105 % 2 == 0) {
                                    i109 = 1905160562 + (((~(1335175691 | i74)) | (-1607838284) | (~(1522565193 | i74)) | (~((-1249902602) | i))) * (-84));
                                    i110 = (~(1522565193 | i)) | (-1335175692);
                                    i111 = ~((-1522565194) | i74);
                                    if (((((int) (j5 << 95)) & (i109 + ((i110 | i111) * (-84)) + ((1249902601 | i111) * 84))) | (((int) j5) & (((1153123995 + ((1839902458 | i74) * 1444)) + ((((~((-1643106899) | i)) | 1638564434) | (~(205880488 | i))) * (-1444))) - 1264680934))) != 0) {
                                        int i521111115 = 1871 - (~(-Gravity.getAbsoluteGravity(0, 0)));
                                        int i521111116 = -ExpandableListView.getPackedPositionChild(0L);
                                        int i521111117 = -ImageFormat.getBitsPerPixel(0);
                                        objArr4 = new Object[1];
                                        a(i521111115, (i521111116 ^ 13) + ((i521111116 & 13) << 1), (char) ((i521111117 & 45016) + (i521111117 | 45016)), objArr4);
                                        if (str18.equals((String) objArr4[0])) {
                                            Object[] objArr1011111110 = {str18};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                                                char maximumDrawingCacheSize111 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                int i521111118 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 992;
                                                int edgeSlop115 = 8 - (ViewConfiguration.getEdgeSlop() >> 16);
                                                byte b411112 = (byte) 0;
                                                Object[] objArr111110 = new Object[1];
                                                c(b411112, (byte) (b411112 | 6), b411112, objArr111110);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(maximumDrawingCacheSize111, i521111118, edgeSlop115, 349342683, false, (String) objArr111110[0], new Class[]{String.class});
                                            }
                                            long jLongValue1119 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).invoke(null, objArr1011111110)).longValue();
                                            long j1111118 = -809468661;
                                            long j1111119 = -159;
                                            long j11111110 = (j1111119 * j1111118) + (j1111119 * jLongValue1119);
                                            long j11111111 = 160;
                                            j6 = j11111110 + (((j1111118 ^ j2) | jLongValue1119) * j11111111) + (((long) (-160)) * (((j4 | j1111118) ^ j2) | ((j1111118 | jLongValue1119) ^ j2))) + (j11111111 * ((((jLongValue1119 ^ j2) | j4) ^ j2) | j1111118)) + ((long) (-37609944));
                                            int iMyUid16 = Process.myUid();
                                            int i521111119 = ~iMyUid16;
                                            i108 = ((int) (j6 >> 32)) & (1871737038 + (((~((-363188387) | i521111119)) | (~((-1074038025) | iMyUid16))) * 1900) + (((~(i521111119 | 1074038024)) | (~(363188386 | iMyUid16))) * (-950)) + (((~(iMyUid16 | 1074038024)) | (~(i521111119 | 363188386))) * 950));
                                            iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                                            if ((i108 | (((int) j6) & ((-635053948) + (((-141317) | iElapsedRealtime) * (-627)) + (((~(1756774086 | iElapsedRealtime)) | 319547676) * (-627)) + (((~(iElapsedRealtime | 319547676)) | (~((~iElapsedRealtime) | (-1756774087)))) * 627)))) != 0) {
                                            }
                                        }
                                        i102 = i104 + 1;
                                        i67 = i74;
                                        strArr13 = strArr13;
                                        str12 = str14;
                                        strArr6 = strArr8;
                                        i101 = 19;
                                    }
                                } else {
                                    int i521123 = ~(((int) Process.getElapsedCpuTime()) | 1471042851);
                                    i106 = ((int) (j5 >> 32)) & ((((-1437444700) | i521123) * (-658)) + 2141790698 + ((i521123 | (-1471151996)) * 658));
                                    int startElapsedRealtime16 = (int) Process.getStartElapsedRealtime();
                                    int i52124 = ~((-5329922) | startElapsedRealtime16);
                                    i107 = ((int) j5) & (1864339449 + ((553648416 | i52124) * (-476)) + (i52124 * 952) + ((~((~startElapsedRealtime16) | (-5329922))) * 476));
                                    if (((i106 & i107) | (i106 ^ i107)) != 0) {
                                        int i5211111110 = 1871 - (~(-Gravity.getAbsoluteGravity(0, 0)));
                                        int i5211111111 = -ExpandableListView.getPackedPositionChild(0L);
                                        int i5211111112 = -ImageFormat.getBitsPerPixel(0);
                                        objArr4 = new Object[1];
                                        a(i5211111110, (i5211111111 ^ 13) + ((i5211111111 & 13) << 1), (char) ((i5211111112 & 45016) + (i5211111112 | 45016)), objArr4);
                                        if (str18.equals((String) objArr4[0])) {
                                            Object[] objArr1011111111 = {str18};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                                                char maximumDrawingCacheSize112 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                int i5211111113 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 992;
                                                int edgeSlop116 = 8 - (ViewConfiguration.getEdgeSlop() >> 16);
                                                byte b411113 = (byte) 0;
                                                Object[] objArr111111 = new Object[1];
                                                c(b411113, (byte) (b411113 | 6), b411113, objArr111111);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(maximumDrawingCacheSize112, i5211111113, edgeSlop116, 349342683, false, (String) objArr111111[0], new Class[]{String.class});
                                            }
                                            long jLongValue11110 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).invoke(null, objArr1011111111)).longValue();
                                            long j11111112 = -809468661;
                                            long j11111113 = -159;
                                            long j11111114 = (j11111113 * j11111112) + (j11111113 * jLongValue11110);
                                            long j11111115 = 160;
                                            j6 = j11111114 + (((j11111112 ^ j2) | jLongValue11110) * j11111115) + (((long) (-160)) * (((j4 | j11111112) ^ j2) | ((j11111112 | jLongValue11110) ^ j2))) + (j11111115 * ((((jLongValue11110 ^ j2) | j4) ^ j2) | j11111112)) + ((long) (-37609944));
                                            int iMyUid17 = Process.myUid();
                                            int i5211111114 = ~iMyUid17;
                                            i108 = ((int) (j6 >> 32)) & (1871737038 + (((~((-363188387) | i5211111114)) | (~((-1074038025) | iMyUid17))) * 1900) + (((~(i5211111114 | 1074038024)) | (~(363188386 | iMyUid17))) * (-950)) + (((~(iMyUid17 | 1074038024)) | (~(i5211111114 | 363188386))) * 950));
                                            iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                                            if ((i108 | (((int) j6) & ((-635053948) + (((-141317) | iElapsedRealtime) * (-627)) + (((~(1756774086 | iElapsedRealtime)) | 319547676) * (-627)) + (((~(iElapsedRealtime | 319547676)) | (~((~iElapsedRealtime) | (-1756774087)))) * 627)))) != 0) {
                                            }
                                        }
                                        i102 = i104 + 1;
                                        i67 = i74;
                                        strArr13 = strArr13;
                                        str12 = str14;
                                        strArr6 = strArr8;
                                        i101 = 19;
                                    }
                                }
                                i103 = i104;
                                break;
                            }
                            int i531111110 = ((i103 | 130) << 1) - (i103 ^ 130);
                            int i531111111 = (i531111110 & i74) | ((~i531111110) & i);
                            int i531111112 = ~i103;
                            int i531111113 = -i531111112;
                            int i531111114 = ((i531111112 & i531111113) | (i531111112 ^ i531111113)) >> 31;
                            int i531111115 = TuitionPaymentFragmentbindingInflater1;
                            int i531111116 = (i531111115 ^ 103) + ((i531111115 & 103) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i531111116 % 128;
                            int i531111117 = i531111116 % 2;
                            int i531111118 = (~i531111114) & i;
                            int i531111119 = i531111111 & i531111114;
                            int i541116 = (i531111119 & i531111118) | (i531111118 ^ i531111119);
                            int i541117 = i ^ i63;
                            int i541118 = -i541117;
                            int i541119 = ((i541117 & i541118) | (i541117 ^ i541118)) >> 31;
                            int i5411110 = i541116 & (~i541119);
                            int i5411111 = i63 & i541119;
                            i63 = (i5411111 & i5411110) | (i5411110 ^ i5411111);
                        }
                    } else if (i73 == -1514516938) {
                        i74 = i67;
                        str14 = str12;
                        strArr8 = strArr6;
                    } else {
                        i101 = 19;
                        int offsetBefore19 = TextUtils.getOffsetBefore(str12, 0);
                        Object[] objArr81117 = new Object[1];
                        a((offsetBefore19 & 1608) + (offsetBefore19 | 1608), ImageFormat.getBitsPerPixel(0) + 15, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), objArr81117);
                        int i4611113 = -(-Gravity.getAbsoluteGravity(0, 0));
                        int i4611114 = (i4611113 & 1622) + (i4611113 | 1622);
                        int i4611115 = -TextUtils.getOffsetAfter(str12, 0);
                        Object[] objArr81118 = new Object[1];
                        a(i4611114, ((i4611115 | 26) << 1) - (i4611115 ^ 26), (char) Color.red(0), objArr81118);
                        int i4711111110 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        int i4711111111 = (i4711111110 ^ 1649) + ((i4711111110 & 1649) << 1);
                        int packedPositionChild8 = ExpandableListView.getPackedPositionChild(0L);
                        int i4711111112 = (packedPositionChild8 ^ 18) + ((packedPositionChild8 & 18) << 1);
                        int i4711111113 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        Object[] objArr911111110 = new Object[1];
                        a(i4711111111, i4711111112, (char) ((i4711111113 ^ 18429) + ((i4711111113 & 18429) << 1)), objArr911111110);
                        int i4711111114 = -AndroidCharacter.getMirror('0');
                        int i4711111115 = (i4711111114 & 1713) + (i4711111114 | 1713);
                        int iAlpha10 = Color.alpha(0);
                        Object[] objArr911111111 = new Object[1];
                        a(i4711111115, ((iAlpha10 | 17) << 1) - (iAlpha10 ^ 17), (char) TextUtils.indexOf(str12, str12, 0), objArr911111111);
                        int i4711111116 = 1681 - (~(-(ViewConfiguration.getWindowTouchSlop() >> 8)));
                        int iIndexOf1111 = TextUtils.indexOf((CharSequence) str12, '0', 0, 0);
                        int i4711111117 = (iIndexOf1111 ^ 16) + ((iIndexOf1111 & 16) << 1);
                        int i4711111118 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        Object[] objArr911111112 = new Object[1];
                        a(i4711111116, i4711111117, (char) ((i4711111118 ^ 42519) + ((i4711111118 & 42519) << 1)), objArr911111112);
                        int i4711111119 = -TextUtils.getTrimmedLength(str12);
                        int i4811111110 = (i4711111119 ^ 1697) + ((i4711111119 & 1697) << 1);
                        int iKeyCodeFromString13 = KeyEvent.keyCodeFromString(str12);
                        int i4811111111 = -View.resolveSizeAndState(0, 0, 0);
                        Object[] objArr911111113 = new Object[1];
                        a(i4811111110, ((iKeyCodeFromString13 | 37) << 1) - (iKeyCodeFromString13 ^ 37), (char) (((i4811111111 | 24132) << 1) - (i4811111111 ^ 24132)), objArr911111113);
                        Object[] objArr911111114 = new Object[1];
                        a(1733 - (~(-TextUtils.indexOf(str12, str12, 0, 0))), 10 - (~(-(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))))), (char) ExpandableListView.getPackedPositionGroup(0L), objArr911111114);
                        int scrollBarSize13 = 1746 - (ViewConfiguration.getScrollBarSize() >> 8);
                        int i4811111112 = -(-(ViewConfiguration.getScrollBarSize() >> 8));
                        Object[] objArr911111115 = new Object[1];
                        a(scrollBarSize13, (i4811111112 & 13) + (i4811111112 | 13), (char) Color.blue(0), objArr911111115);
                        int i4811111113 = -TextUtils.indexOf((CharSequence) str12, '0');
                        Object[] objArr911111116 = new Object[1];
                        a((i4811111113 ^ 1758) + ((i4811111113 & 1758) << 1), 20 - (~(-TextUtils.lastIndexOf(str12, '0', 0))), (char) KeyEvent.normalizeMetaState(0), objArr911111116);
                        int i4811111114 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int i4811111115 = (i4811111114 & 1781) + (i4811111114 | 1781);
                        int i4811111116 = -View.resolveSize(0, 0);
                        int i4811111117 = ((i4811111116 | 31) << 1) - (i4811111116 ^ 31);
                        int i4811111118 = -(-TextUtils.lastIndexOf(str12, '0', 0, 0));
                        Object[] objArr911111117 = new Object[1];
                        a(i4811111115, i4811111117, (char) ((i4811111118 ^ 1) + ((i4811111118 & 1) << 1)), objArr911111117);
                        int iRgb8 = Color.rgb(0, 0, 0) + 16779028;
                        int iMyTid14 = Process.myTid() >> 22;
                        Object[] objArr911111118 = new Object[1];
                        a(iRgb8, (iMyTid14 & 12) + (iMyTid14 | 12), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr911111118);
                        String str4116 = (String) objArr911111118[0];
                        zzo.TuitionPaymentFragmentbindingInflater1();
                        int i4811111119 = -(ViewConfiguration.getWindowTouchSlop() >> 8);
                        Object[] objArr911111119 = new Object[1];
                        a(((i4811111119 | 1824) << 1) - (i4811111119 ^ 1824), 12 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (11535 - (~(ViewConfiguration.getTapTimeout() >> 16))), objArr911111119);
                        int offsetBefore110 = TextUtils.getOffsetBefore(str12, 0);
                        Object[] objArr1011111112 = new Object[1];
                        a((offsetBefore110 ^ 1836) + ((offsetBefore110 & 1836) << 1), 10 - (~(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (char) (0 - (~(-(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))))), objArr1011111112);
                        int iGreen8 = Color.green(0);
                        int i4911111110 = ((iGreen8 | 1848) << 1) - (iGreen8 ^ 1848);
                        int i4911111111 = -View.MeasureSpec.getMode(0);
                        Object[] objArr1011111113 = new Object[1];
                        a(i4911111110, (i4911111111 ^ 12) + ((i4911111111 & 12) << 1), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr1011111113);
                        int i4911111112 = -KeyEvent.normalizeMetaState(0);
                        int i4911111113 = (i4911111112 ^ 1860) + ((i4911111112 & 1860) << 1);
                        int i4911111114 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int i4911111115 = -(-TextUtils.getOffsetAfter(str12, 0));
                        Object[] objArr1011111114 = new Object[1];
                        a(i4911111113, (i4911111114 & 11) + (i4911111114 | 11), (char) ((i4911111115 ^ 58504) + ((i4911111115 & 58504) << 1)), objArr1011111114);
                        int i4911111116 = 1871 - (~(ViewConfiguration.getDoubleTapTimeout() >> 16));
                        int i4911111117 = -(-View.resolveSizeAndState(0, 0, 0));
                        int i4911111118 = (i4911111117 ^ 14) + ((i4911111117 & 14) << 1);
                        int i4911111119 = -TextUtils.indexOf(str12, str12, 0);
                        Object[] objArr1011111115 = new Object[1];
                        a(i4911111116, i4911111118, (char) ((i4911111119 ^ 45017) + ((i4911111119 & 45017) << 1)), objArr1011111115);
                        int touchSlop12 = ViewConfiguration.getTouchSlop();
                        int i5011111110 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 103;
                        TuitionPaymentFragmentbindingInflater1 = i5011111110 % 128;
                        int i5011111111 = i5011111110 % 2;
                        int i5011111112 = -(touchSlop12 >> 8);
                        int i5011111113 = ((1886 | i5011111112) << 1) - (i5011111112 ^ 1886);
                        int i5011111114 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        int i5011111115 = ((i5011111114 | 13) << 1) - (i5011111114 ^ 13);
                        int i5011111116 = -(-TextUtils.lastIndexOf(str12, '0', 0, 0));
                        Object[] objArr1011111116 = new Object[1];
                        a(i5011111113, i5011111115, (char) ((i5011111116 ^ 15060) + ((i5011111116 & 15060) << 1)), objArr1011111116);
                        int i5011111117 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                        int i5011111118 = (i5011111117 ^ 1898) + ((i5011111117 & 1898) << 1);
                        int maximumDrawingCacheSize113 = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                        int iTuitionPaymentFragmentbindingInflater119 = zzo.TuitionPaymentFragmentbindingInflater1();
                        int i5011111119 = maximumDrawingCacheSize113 * (-244);
                        int i5111111110 = (i5011111119 ^ 5904) + ((i5011111119 & 5904) << 1);
                        int i5111111111 = ~iTuitionPaymentFragmentbindingInflater119;
                        int i5111111112 = (((i5111111110 - (~(((~(((-25) ^ maximumDrawingCacheSize113) | ((-25) & maximumDrawingCacheSize113))) | (~((i5111111111 & (-25)) | ((-25) ^ i5111111111)))) * (-245)))) - 1) - (~(-(-((~(((-25) ^ iTuitionPaymentFragmentbindingInflater119) | ((-25) & iTuitionPaymentFragmentbindingInflater119))) * (-245)))))) - 1;
                        int i5111111113 = ~((iTuitionPaymentFragmentbindingInflater119 & (-25)) | ((-25) ^ iTuitionPaymentFragmentbindingInflater119));
                        int i5111111114 = ((maximumDrawingCacheSize113 & i5111111113) | (maximumDrawingCacheSize113 ^ i5111111113)) * 245;
                        int i5111111115 = ((i5111111112 | i5111111114) << 1) - (i5111111114 ^ i5111111112);
                        int i5111111116 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        Object[] objArr1011111117 = new Object[1];
                        a(i5011111118, i5111111115, (char) ((i5111111116 ^ 1) + ((i5111111116 & 1) << 1)), objArr1011111117);
                        int i5111111117 = -(-(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        int i5111111118 = -View.resolveSize(0, 0);
                        Object[] objArr1011111118 = new Object[1];
                        a((i5111111117 & 1921) + (i5111111117 | 1921), (i5111111118 & 28) + (i5111111118 | 28), (char) KeyEvent.keyCodeFromString(str12), objArr1011111118);
                        strArr13 = new String[]{(String) objArr81117[0], (String) objArr81118[0], (String) objArr911111110[0], (String) objArr911111111[0], (String) objArr911111112[0], (String) objArr911111113[0], (String) objArr911111114[0], (String) objArr911111115[0], (String) objArr911111116[0], (String) objArr911111117[0], str4116, (String) objArr911111119[0], (String) objArr1011111112[0], (String) objArr1011111113[0], (String) objArr1011111114[0], (String) objArr1011111115[0], (String) objArr1011111116[0], (String) objArr1011111117[0], (String) objArr1011111118[0]};
                        i102 = 0;
                        while (true) {
                            if (i102 < i101) {
                                i74 = i67;
                                str14 = str12;
                                strArr8 = strArr6;
                                i103 = -1;
                                break;
                            }
                            str18 = strArr13[i102];
                            Object[] objArr1011111119 = {str18};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault18 == null) {
                                char cIndexOf10 = (char) ((-1) - TextUtils.indexOf((CharSequence) str12, '0'));
                                int edgeSlop117 = 993 - (ViewConfiguration.getEdgeSlop() >> 16);
                                int capsMode9 = 8 - TextUtils.getCapsMode(str12, 0, 0);
                                byte b411114 = (byte) 0;
                                byte b411115 = (byte) (b411114 + 5);
                                Object[] objArr10125 = new Object[1];
                                c(b411114, b411115, (byte) (b411115 - 5), objArr10125);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault18 = initSession.b(cIndexOf10, edgeSlop117, capsMode9, 410748506, false, (String) objArr10125[0], new Class[]{String.class});
                            }
                            long jLongValue11111 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault18).invoke(null, objArr1011111119)).longValue();
                            long j10111110 = 1443778717;
                            i74 = i67;
                            str14 = str12;
                            long j10111111 = jLongValue11111 ^ j2;
                            i104 = i102;
                            strArr8 = strArr6;
                            long startElapsedRealtime17 = (int) Process.getStartElapsedRealtime();
                            long j10111112 = startElapsedRealtime17 ^ j2;
                            long j10111113 = (j10111112 | jLongValue11111) ^ j2;
                            long j10111114 = 516;
                            long j10111115 = j10111110 ^ j2;
                            j5 = (((long) (-515)) * j10111110) + (((long) 517) * jLongValue11111) + (((long) (-516)) * (((j10111111 | startElapsedRealtime17) ^ j2) | ((j10111112 | j10111110) ^ j2) | j10111113)) + (((((j10111115 | j10111111) | startElapsedRealtime17) ^ j2) | (((j10111115 | j10111112) | jLongValue11111) ^ j2)) * j10111114) + (j10111114 * (((jLongValue11111 | j10111115) ^ j2) | j10111113)) + ((long) (-1644696954));
                            int i5111111119 = TuitionPaymentFragmentbindingInflater1;
                            i105 = (i5111111119 ^ 97) + ((i5111111119 & 97) << 1);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i105 % 128;
                            if (i105 % 2 == 0) {
                                i109 = 1905160562 + (((~(1335175691 | i74)) | (-1607838284) | (~(1522565193 | i74)) | (~((-1249902602) | i))) * (-84));
                                i110 = (~(1522565193 | i)) | (-1335175692);
                                i111 = ~((-1522565194) | i74);
                                if (((((int) (j5 << 95)) & (i109 + ((i110 | i111) * (-84)) + ((1249902601 | i111) * 84))) | (((int) j5) & (((1153123995 + ((1839902458 | i74) * 1444)) + ((((~((-1643106899) | i)) | 1638564434) | (~(205880488 | i))) * (-1444))) - 1264680934))) != 0) {
                                    int i5211111115 = 1871 - (~(-Gravity.getAbsoluteGravity(0, 0)));
                                    int i5211111116 = -ExpandableListView.getPackedPositionChild(0L);
                                    int i5211111117 = -ImageFormat.getBitsPerPixel(0);
                                    objArr4 = new Object[1];
                                    a(i5211111115, (i5211111116 ^ 13) + ((i5211111116 & 13) << 1), (char) ((i5211111117 & 45016) + (i5211111117 | 45016)), objArr4);
                                    if (str18.equals((String) objArr4[0])) {
                                        Object[] objArr10111111110 = {str18};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                                            char maximumDrawingCacheSize114 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                            int i5211111118 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 992;
                                            int edgeSlop118 = 8 - (ViewConfiguration.getEdgeSlop() >> 16);
                                            byte b411116 = (byte) 0;
                                            Object[] objArr111112 = new Object[1];
                                            c(b411116, (byte) (b411116 | 6), b411116, objArr111112);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(maximumDrawingCacheSize114, i5211111118, edgeSlop118, 349342683, false, (String) objArr111112[0], new Class[]{String.class});
                                        }
                                        long jLongValue11112 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).invoke(null, objArr10111111110)).longValue();
                                        long j11111116 = -809468661;
                                        long j11111117 = -159;
                                        long j11111118 = (j11111117 * j11111116) + (j11111117 * jLongValue11112);
                                        long j11111119 = 160;
                                        j6 = j11111118 + (((j11111116 ^ j2) | jLongValue11112) * j11111119) + (((long) (-160)) * (((j4 | j11111116) ^ j2) | ((j11111116 | jLongValue11112) ^ j2))) + (j11111119 * ((((jLongValue11112 ^ j2) | j4) ^ j2) | j11111116)) + ((long) (-37609944));
                                        int iMyUid18 = Process.myUid();
                                        int i5211111119 = ~iMyUid18;
                                        i108 = ((int) (j6 >> 32)) & (1871737038 + (((~((-363188387) | i5211111119)) | (~((-1074038025) | iMyUid18))) * 1900) + (((~(i5211111119 | 1074038024)) | (~(363188386 | iMyUid18))) * (-950)) + (((~(iMyUid18 | 1074038024)) | (~(i5211111119 | 363188386))) * 950));
                                        iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                                        if ((i108 | (((int) j6) & ((-635053948) + (((-141317) | iElapsedRealtime) * (-627)) + (((~(1756774086 | iElapsedRealtime)) | 319547676) * (-627)) + (((~(iElapsedRealtime | 319547676)) | (~((~iElapsedRealtime) | (-1756774087)))) * 627)))) != 0) {
                                        }
                                    }
                                    i102 = i104 + 1;
                                    i67 = i74;
                                    strArr13 = strArr13;
                                    str12 = str14;
                                    strArr6 = strArr8;
                                    i101 = 19;
                                }
                            } else {
                                int i521124 = ~(((int) Process.getElapsedCpuTime()) | 1471042851);
                                i106 = ((int) (j5 >> 32)) & ((((-1437444700) | i521124) * (-658)) + 2141790698 + ((i521124 | (-1471151996)) * 658));
                                int startElapsedRealtime18 = (int) Process.getStartElapsedRealtime();
                                int i52125 = ~((-5329922) | startElapsedRealtime18);
                                i107 = ((int) j5) & (1864339449 + ((553648416 | i52125) * (-476)) + (i52125 * 952) + ((~((~startElapsedRealtime18) | (-5329922))) * 476));
                                if (((i106 & i107) | (i106 ^ i107)) != 0) {
                                    int i52111111110 = 1871 - (~(-Gravity.getAbsoluteGravity(0, 0)));
                                    int i52111111111 = -ExpandableListView.getPackedPositionChild(0L);
                                    int i52111111112 = -ImageFormat.getBitsPerPixel(0);
                                    objArr4 = new Object[1];
                                    a(i52111111110, (i52111111111 ^ 13) + ((i52111111111 & 13) << 1), (char) ((i52111111112 & 45016) + (i52111111112 | 45016)), objArr4);
                                    if (str18.equals((String) objArr4[0])) {
                                        Object[] objArr10111111111 = {str18};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault19 == null) {
                                            char maximumDrawingCacheSize115 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                            int i52111111113 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 992;
                                            int edgeSlop119 = 8 - (ViewConfiguration.getEdgeSlop() >> 16);
                                            byte b411117 = (byte) 0;
                                            Object[] objArr111113 = new Object[1];
                                            c(b411117, (byte) (b411117 | 6), b411117, objArr111113);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault19 = initSession.b(maximumDrawingCacheSize115, i52111111113, edgeSlop119, 349342683, false, (String) objArr111113[0], new Class[]{String.class});
                                        }
                                        long jLongValue11113 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault19).invoke(null, objArr10111111111)).longValue();
                                        long j111111110 = -809468661;
                                        long j111111111 = -159;
                                        long j111111112 = (j111111111 * j111111110) + (j111111111 * jLongValue11113);
                                        long j111111113 = 160;
                                        j6 = j111111112 + (((j111111110 ^ j2) | jLongValue11113) * j111111113) + (((long) (-160)) * (((j4 | j111111110) ^ j2) | ((j111111110 | jLongValue11113) ^ j2))) + (j111111113 * ((((jLongValue11113 ^ j2) | j4) ^ j2) | j111111110)) + ((long) (-37609944));
                                        int iMyUid19 = Process.myUid();
                                        int i52111111114 = ~iMyUid19;
                                        i108 = ((int) (j6 >> 32)) & (1871737038 + (((~((-363188387) | i52111111114)) | (~((-1074038025) | iMyUid19))) * 1900) + (((~(i52111111114 | 1074038024)) | (~(363188386 | iMyUid19))) * (-950)) + (((~(iMyUid19 | 1074038024)) | (~(i52111111114 | 363188386))) * 950));
                                        iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                                        if ((i108 | (((int) j6) & ((-635053948) + (((-141317) | iElapsedRealtime) * (-627)) + (((~(1756774086 | iElapsedRealtime)) | 319547676) * (-627)) + (((~(iElapsedRealtime | 319547676)) | (~((~iElapsedRealtime) | (-1756774087)))) * 627)))) != 0) {
                                        }
                                    }
                                    i102 = i104 + 1;
                                    i67 = i74;
                                    strArr13 = strArr13;
                                    str12 = str14;
                                    strArr6 = strArr8;
                                    i101 = 19;
                                }
                            }
                            i103 = i104;
                            break;
                        }
                        int i5311111110 = ((i103 | 130) << 1) - (i103 ^ 130);
                        int i5311111111 = (i5311111110 & i74) | ((~i5311111110) & i);
                        int i5311111112 = ~i103;
                        int i5311111113 = -i5311111112;
                        int i5311111114 = ((i5311111112 & i5311111113) | (i5311111112 ^ i5311111113)) >> 31;
                        int i5311111115 = TuitionPaymentFragmentbindingInflater1;
                        int i5311111116 = (i5311111115 ^ 103) + ((i5311111115 & 103) << 1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5311111116 % 128;
                        int i5311111117 = i5311111116 % 2;
                        int i5311111118 = (~i5311111114) & i;
                        int i5311111119 = i5311111111 & i5311111114;
                        int i5411112 = (i5311111119 & i5311111118) | (i5311111118 ^ i5311111119);
                        int i5411113 = i ^ i63;
                        int i5411114 = -i5411113;
                        int i5411115 = ((i5411113 & i5411114) | (i5411113 ^ i5411114)) >> 31;
                        int i5411116 = i5411112 & (~i5411115);
                        int i5411117 = i63 & i5411115;
                        i63 = (i5411117 & i5411116) | (i5411116 ^ i5411117);
                    }
                } else {
                    i74 = i67;
                    str14 = str12;
                    strArr8 = strArr6;
                }
                int i551110 = 1949 - (~(-(ViewConfiguration.getKeyRepeatTimeout() >> 16)));
                int i551111 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                Object[] objArr111114 = new Object[1];
                a(i551110, (i551111 ^ 13) + ((i551111 & 13) << 1), (char) Color.blue(0), objArr111114);
                String str4117 = (String) objArr111114[0];
                str15 = str14;
                int iIndexOf1112 = TextUtils.indexOf(str15, str15, 0);
                int iLastIndexOf17 = TextUtils.lastIndexOf(str15, '0');
                Object[] objArr111115 = new Object[1];
                a(((iIndexOf1112 | 1963) << 1) - (iIndexOf1112 ^ 1963), (iLastIndexOf17 & 6) + (iLastIndexOf17 | 6), (char) (Color.rgb(0, 0, 0) + 16839861), objArr111115);
                String[] strArr2110 = {str4117, (String) objArr111115[0]};
                int i551112 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                int i551113 = -(-TextUtils.getOffsetAfter(str15, 0));
                Object[] objArr111116 = new Object[1];
                a((i551112 ^ 1968) + ((i551112 & 1968) << 1), (i551113 & 15) + (i551113 | 15), (char) (48411 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr111116);
                String str4118 = (String) objArr111116[0];
                int i551114 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1982;
                int i551115 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                Object[] objArr111117 = new Object[1];
                a(i551114, (i551115 ^ 19) + ((i551115 & 19) << 1), (char) (59624 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), objArr111117);
                String str4119 = (String) objArr111117[0];
                int iIndexOf23 = TextUtils.indexOf(str15, str15, 0, 0);
                int iTuitionPaymentFragmentbindingInflater1110 = zzo.TuitionPaymentFragmentbindingInflater1();
                int i551116 = iIndexOf23 * (-244);
                int i551117 = (i551116 & 492492) + (i551116 | 492492);
                int i551118 = ~iTuitionPaymentFragmentbindingInflater1110;
                int i551119 = -(-(((~((i551118 & (-2003)) | ((-2003) ^ i551118))) | (~(((-2003) & iIndexOf23) | ((-2003) ^ iIndexOf23)))) * (-245)));
                int i561110 = (i551117 ^ i551119) + ((i551119 & i551117) << 1);
                int i561111 = (~(((-2003) ^ iTuitionPaymentFragmentbindingInflater1110) | ((-2003) & iTuitionPaymentFragmentbindingInflater1110))) * (-245);
                int i561112 = ((i561110 | i561111) << 1) - (i561110 ^ i561111);
                int i561113 = ((~(iTuitionPaymentFragmentbindingInflater1110 | (-2003))) | iIndexOf23) * 245;
                int i561114 = (i561112 ^ i561113) + ((i561113 & i561112) << 1);
                int scrollBarSize14 = ViewConfiguration.getScrollBarSize() >> 8;
                int i561115 = (scrollBarSize14 ^ 14) + ((scrollBarSize14 & 14) << 1);
                int i561116 = -(-TextUtils.lastIndexOf(str15, '0', 0));
                Object[] objArr111118 = new Object[1];
                a(i561114, i561115, (char) ((i561116 ^ 17841) + ((i561116 & 17841) << 1)), objArr111118);
                String[] strArr2111 = {str4118, str4119, (String) objArr111118[0]};
                int modifierMetaStateMask18 = 2015 - ((byte) KeyEvent.getModifierMetaStateMask());
                int i561117 = -(-View.getDefaultSize(0, 0));
                Object[] objArr111119 = new Object[1];
                a(modifierMetaStateMask18, (i561117 ^ 21) + ((i561117 & 21) << 1), (char) (14714 - (~(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))))), objArr111119);
                String str5110 = (String) objArr111119[0];
                int modifierMetaStateMask19 = 2036 - ((byte) KeyEvent.getModifierMetaStateMask());
                int i561118 = 10 - (~(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
                int i561119 = -Color.alpha(0);
                Object[] objArr12119 = new Object[1];
                a(modifierMetaStateMask19, i561118, (char) ((i561119 & 36799) + (i561119 | 36799)), objArr12119);
                String[] strArr2112 = {str5110, (String) objArr12119[0]};
                int i571110 = -TextUtils.lastIndexOf(str15, '0', 0);
                int i571111 = (i571110 & 2046) + (i571110 | 2046);
                int i571112 = 11 - (~(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
                int i571113 = -TextUtils.getOffsetAfter(str15, 0);
                Object[] objArr121110 = new Object[1];
                a(i571111, i571112, (char) ((i571113 & 44789) + (i571113 | 44789)), objArr121110);
                String str5111 = (String) objArr121110[0];
                int maxKeyCode4 = 587 - (KeyEvent.getMaxKeyCode() >> 16);
                int i571114 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                Object[] objArr121111 = new Object[1];
                a(maxKeyCode4, (i571114 & 7) + (i571114 | 7), (char) KeyEvent.keyCodeFromString(str15), objArr121111);
                String[] strArr2113 = {str5111, (String) objArr121111[0]};
                int i571115 = 2058 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int defaultSize6 = View.getDefaultSize(0, 0);
                Object[] objArr121112 = new Object[1];
                a(i571115, ((defaultSize6 | 28) << 1) - (defaultSize6 ^ 28), (char) View.resolveSize(0, 0), objArr121112);
                String str5112 = (String) objArr121112[0];
                int pressedStateDuration6 = 2037 - (ViewConfiguration.getPressedStateDuration() >> 16);
                int iLastIndexOf18 = TextUtils.lastIndexOf(str15, '0') + 11;
                int i571116 = -ExpandableListView.getPackedPositionGroup(0L);
                Object[] objArr1222 = new Object[1];
                a(pressedStateDuration6, iLastIndexOf18, (char) (((i571116 | 36799) << 1) - (i571116 ^ 36799)), objArr1222);
                c3 = 0;
                strArr9 = new String[][]{strArr2110, strArr2111, strArr2112, strArr2113, new String[]{str5112, (String) objArr1222[0]}};
                i75 = 0;
                i76 = 5;
                i77 = -1;
                loop7: while (true) {
                    if (i75 < i76) {
                        i78 = i74;
                        i79 = i;
                        break;
                    }
                    String[] strArr2114 = strArr9[i75];
                    str16 = strArr2114[c3];
                    strArr10 = (String[]) Arrays.copyOfRange(strArr2114, 1, strArr2114.length);
                    length2 = strArr10.length;
                    i85 = 0;
                    while (true) {
                        if (i85 < length2) {
                            i86 = i77 + 1;
                            bytes2 = strArr10[i85].getBytes();
                            length3 = bytes2.length;
                            if (length3 == 0) {
                                i78 = i74;
                            } else {
                                strArr11 = strArr9;
                                bufferedInputStream5 = new BufferedInputStream(new FileInputStream(str16));
                                i89 = 4096;
                                strArr12 = strArr10;
                                bArr3 = new byte[4096];
                                str17 = str16;
                                i87 = length2;
                                i88 = i86;
                                i90 = 0;
                                while (true) {
                                    i91 = bufferedInputStream5.read(bArr3, 0, i89);
                                    if (i91 > 0) {
                                        break;
                                        break;
                                    }
                                    i92 = 0;
                                    while (i90 < length3) {
                                        byte[] bArr7 = bArr3;
                                        if (bArr3[i92] == bytes2[i90]) {
                                            i90 = ((i90 | 1) << 1) - (i90 ^ 1);
                                        } else {
                                            if (i90 != 0) {
                                                i93 = i90 - 1;
                                                while (true) {
                                                    if (i93 > 0) {
                                                        i74 = i74;
                                                        i94 = i91;
                                                        i90 = 0;
                                                        break;
                                                        break;
                                                    }
                                                    i95 = 0;
                                                    while (true) {
                                                        if (i95 < i93) {
                                                            i74 = i74;
                                                            i94 = i91;
                                                            i90 = i93;
                                                            break;
                                                            break;
                                                        }
                                                        i96 = i91;
                                                        b2 = bytes2[i95];
                                                        i78 = i74;
                                                        i97 = (i90 - (~(-i93))) - 1;
                                                        i98 = i90;
                                                        i99 = -(-i95);
                                                        if (b2 != bytes2[(i97 & i99) + (i97 | i99)]) {
                                                            break;
                                                        }
                                                        i95 = ((i95 & 1) << 1) + (i95 ^ 1);
                                                        i91 = i96;
                                                        i74 = i78;
                                                        i90 = i98;
                                                    }
                                                    i93--;
                                                    i91 = i96;
                                                    i74 = i78;
                                                    i90 = i98;
                                                }
                                            }
                                            bArr3 = bArr7;
                                            i91 = i94;
                                            i74 = i74;
                                        }
                                        i94 = i91;
                                        i92++;
                                        bArr3 = bArr7;
                                        i91 = i94;
                                        i74 = i74;
                                    }
                                    bArr3 = bArr3;
                                    i74 = i74;
                                    i90 = i90;
                                    i89 = 4096;
                                }
                                i78 = i74;
                                if (i90 == length3) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                bufferedInputStream5.close();
                                if (z) {
                                    i85++;
                                    strArr9 = strArr11;
                                    strArr10 = strArr12;
                                    str16 = str17;
                                    length2 = i87;
                                    i77 = i88;
                                    i74 = i78;
                                }
                            }
                            i79 = i ^ (i77 + 171);
                            break loop7;
                        }
                        i75++;
                        i76 = 5;
                        c3 = 0;
                    }
                }
                int i571117 = i ^ i63;
                int i571118 = -i571117;
                int i571119 = ((i571117 & i571118) | (i571117 ^ i571118)) >> 31;
                int i58118 = i79 & (~i571119);
                int i5824 = i63 & i571119;
                int i5825 = (i5824 & i58118) | (i58118 ^ i5824);
                int i58119 = 2085 - (~(-(ViewConfiguration.getScrollBarSize() >> 8)));
                int i581110 = 11 - (~(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                int i581111 = -TextUtils.indexOf(str15, str15, 0, 0);
                Object[] objArr121113 = new Object[1];
                a(i58119, i581110, (char) ((i581111 & 21955) + (i581111 | 21955)), objArr121113);
                String str5113 = (String) objArr121113[0];
                int i581112 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2098;
                int i581113 = -(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                Object[] objArr121114 = new Object[1];
                a(i581112, (i581113 & 8) + (i581113 | 8), (char) (((Process.getThreadPriority(0) + 20) >> 6) + 20215), objArr121114);
                Object[] objArr121115 = {str5113, (String) objArr121114[0]};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1553143710);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault17 == null) {
                    char windowTouchSlop14 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int iIndexOf1113 = TextUtils.indexOf(str15, str15, 0) + 2385;
                    int minimumFlingVelocity6 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 32;
                    byte b514 = (byte) 0;
                    byte b515 = (byte) (b514 + 5);
                    Object[] objArr121116 = new Object[1];
                    c(b514, b515, (byte) (b515 - 5), objArr121116);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault17 = initSession.b(windowTouchSlop14, iIndexOf1113, minimumFlingVelocity6, -1207062455, false, (String) objArr121116[0], new Class[]{String.class, String.class});
                }
                long jLongValue212 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault17).invoke(null, objArr121115)).longValue();
                long j121118 = -102072316;
                long j121119 = 399;
                long j1318 = (j121119 * j121118) + (j121119 * jLongValue212);
                long j1319 = 398;
                long j13110 = ((j121118 ^ j2) | jLongValue212) ^ j2;
                long j13111 = jLongValue212 ^ j2;
                long j13112 = (j13111 | j121118) ^ j2;
                long jMyTid4 = Process.myTid();
                long j13113 = j1318 + ((j13110 | j13112 | ((j13111 | jMyTid4) ^ j2)) * j1319) + (((long) (-1194)) * (j121118 | jLongValue212)) + (j1319 * ((((jMyTid4 ^ j2) | j13111) ^ j2) | j13110 | j13112)) + ((long) 2079115644);
                int iElapsedRealtime7 = (int) SystemClock.elapsedRealtime();
                int i61112 = ~iElapsedRealtime7;
                i83 = ((int) (j13113 >> 32)) & ((-969119006) + (((~(201150503 | i61112)) | (-1638376915) | (~((-201150504) | iElapsedRealtime7))) * (-564)) + ((~(iElapsedRealtime7 | (-27590659))) * 1128) + (((~((-1638376915) | i61112)) | 173559845) * 564));
                int i61113 = (int) j13113;
                int iMyPid8 = Process.myPid();
                int i6219 = ~iMyPid8;
                i84 = i61113 & (94082845 + ((iMyPid8 | 4474149) * 988) + (((~(181172093 | i6219)) | (-1795096448)) * (-1976)) + (((~(iMyPid8 | 1618398503)) | 4474149 | (~((-1618398504) | i6219))) * 988));
                if (((i83 & i84) | (i83 ^ i84)) != 0) {
                    i80 = i & (-151);
                    i78 = i78;
                    i81 = i78 & 150;
                    i82 = i80 | i81;
                } else {
                    i78 = i78;
                    i82 = i;
                }
                int i581114 = i ^ i5825;
                int i581115 = (i581114 | (-i581114)) >> 31;
                int i5911110 = i82 & (~i581115);
                int i5911111 = i5825 & i581115;
                int i5911112 = (i5911111 & i5911110) | (i5911110 ^ i5911111);
                int i5911113 = -Color.green(0);
                int i5911114 = (i5911113 & 2107) + (i5911113 | 2107);
                int iArgb5 = Color.argb(0, 0, 0, 0) + 47;
                int i5911115 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                Object[] objArr121117 = new Object[1];
                a(i5911114, iArgb5, (char) ((i5911115 ^ 1) + ((i5911115 & 1) << 1)), objArr121117);
                Object[] objArr1316 = {(String) objArr121117[0]};
                objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                    char windowTouchSlop15 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int i5911116 = 994 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int edgeSlop21 = (ViewConfiguration.getEdgeSlop() >> 16) + 8;
                    byte b516 = (byte) 0;
                    byte b517 = b516;
                    Object[] objArr1317 = new Object[1];
                    c(b516, b517, b517, objArr1317);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(windowTouchSlop15, i5911116, edgeSlop21, -545305915, false, (String) objArr1317[0], new Class[]{String.class});
                }
                long jLongValue213 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).invoke(null, objArr1316)).longValue();
                long j1211110 = -1288437473;
                long j1211111 = -496;
                long j1211112 = (j1211111 * j1211110) + (j1211111 * jLongValue213);
                long j1211113 = 497;
                long j1211114 = j1211110 ^ j2;
                long j1211115 = jLongValue213 ^ j2;
                long j1211116 = j1211114 | j1211115;
                long j1211117 = j1211112 + ((j1211116 ^ j2) * j1211113) + ((((j1211116 | j3) ^ j2) | (((j1211115 | j4) | j1211110) ^ j2)) * j1211113) + (j1211113 * (((j1211114 | j4) ^ j2) | ((jLongValue213 | j1211114) ^ j2) | (((j1211115 | j1211110) | j3) ^ j2))) + ((long) 1908896757);
                int elapsedCpuTime8 = (int) Process.getElapsedCpuTime();
                int i5911117 = ~elapsedCpuTime8;
                int i5911118 = ((int) (j1211117 >> 32)) & (314194654 + (((~(i5911117 | (-1843456072))) | 744538117 | (~(2113202767 | elapsedCpuTime8))) * 717) + (((~(elapsedCpuTime8 | (-1843456072))) | (~(i5911117 | 2113202767)) | 744538117) * 717));
                int i5911119 = ((int) j1211117) & (1094593649 + (((~(1400492905 | i78)) | 36733504 | (~((-1400423009) | i))) * (-68)) + ((~((-1363689505) | i78)) * (-68)) + (((~(i78 | 1400423008)) | 36803401) * 68));
                int i60118 = ((i5911118 & i5911119) | (i5911118 ^ i5911119)) * 263;
                int i60119 = i ^ i5911112;
                int i601110 = -i60119;
                int i601111 = ((i60119 & i601110) | (i60119 ^ i601110)) >> 31;
                int i601112 = (i60118 | i) & (~(i & i60118)) & (~i601111);
                int i601113 = i5911112 & i601111;
                i55 = (i601113 & i601112) | (i601112 ^ i601113);
                strArr4 = strArr8;
                i56 = 5;
            } else {
                i55 = i51;
                i56 = 5;
                strArr4 = null;
            }
            objArr2 = new Object[i56];
            objArr2[0] = new int[1];
            objArr2[1] = new int[]{i55};
            objArr2[3] = new int[]{i};
            int i6024 = (~(i & i55)) & (i | i55);
            int i6025 = -i6024;
            int i6026 = (((i6024 & i6025) | (i6024 ^ i6025)) >> 31) & 16;
            objArr2[4] = strArr4;
            objArr2[2] = null;
            int iElapsedRealtime8 = (int) SystemClock.elapsedRealtime();
            int i6027 = (-403930261) + (((~((-429747619) | iElapsedRealtime8)) | 268460192 | (~((-1344332026) | iElapsedRealtime8))) * (-880));
            int i61114 = (~((-429747619) | (~iElapsedRealtime8))) | 1344332025;
            int i61115 = ~(iElapsedRealtime8 | 429747618);
            int i61116 = i6027 + ((i61114 | i61115) * (-880)) + (i61115 * 880);
            int i61117 = -(-((i61116 ^ i6026) + ((i61116 & i6026) << 1)));
            int i61118 = (i3 & i61117) + (i3 | i61117);
            int i61119 = i61118 << 13;
            int i61120 = (i61119 | i61118) & (~(i61118 & i61119));
            i57 = i61120 ^ (i61120 >>> 17);
            i58 = TuitionPaymentFragmentbindingInflater1 + 101;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i58 % 128;
            if (i58 % 2 != 0) {
                ((int[]) objArr2[0])[0] = i57 ^ (i57 << 5);
                return objArr2;
            }
            int i61121 = i57 % 2;
            ((int[]) objArr2[0])[0] = (i57 | i61121) & (~(i57 & i61121));
            return objArr2;
        }

        static {
            char[] cArr = new char[2154];
            ByteBuffer.wrap("äVïFòªÆ\u001eÉ:ÜÙ 4«h¾Å\u0082,\u0095\u009e\u0098ãlUw¹zâNHQ\u00ad%\u0000(z3Ë\u0007\u0016\nQ\u001dØá$ô\u0090ÿùÃ\"ÉöÂæß\në¾ä\u009añy\u008d\u0094\u0086È\u0093e¯\u008c¸>µCAõZ\u0019WScå|\u0019\b·\u0005à\u001e|*µ'Ü0hÌ\u0080Ù5sÖxÆe*Q\u009e^ºKY7´<è)E\u0015¬\u0002\u001e\u000fcûÕà9ípÙÕÆ'²\u0091±³º´§S\u0093þ\u009cß\u00896õÑþ\u0085ë1×ÃÀwÍZ9¿\"l/\n\u001b\u00ad\u0004Jpþ}\u0089f5Rß_\u0089H/´Å¡`ª\u001a\u0096Ð\u0083|±³º¢§^\u0093î\u009cß\u0089?õÙþÏë4×ÝÀ}Í\u0005±³º¢§^\u0093î\u009cß\u0089(õ×þ\u008cëj×ßÀ`Í\u001a9¨±³º´§N\u0093î\u009c\u0091\u0089)õÚþÎë\u0016×éÀ_Í\u001a9®\"f/\"\u001b¨\u0004Xpö<M7]*µ\u001e\u0007\u0011o\u0004\u008axns|fÊZ$M\u0085@å´@¯\u0092±îº¨§\u0004\u0093ï\u009c\u009f\u00894õÊþÏë6×ÊÀvÍ\u00079·\"j/\u0002\u001b\u0096\u0004Bpò}\u008ef\u0002Rä_\u0085H=´\u0080ò\u0010ùVäúÐ\u0011ßaÊÊ¶4½1¨È\u00944\u0083\u0088\u008eùzIa\u0094lüXhG¼3\f>p%ü\u0011\u001a\u001c{\u000bÃ÷}@\u0010K\u0017Vðb]m'x\u009d\u0004p\u000fm\u001a\u008b&e1Ó<ùÈ\u0017ÓÉÞ§ê\u0004õí\u0081\u001a\u008c*\u0097\u0091m?fo{\u008cO\"@^Uâ\u0003\u008d\b\u008a\u0015m!À.º;\u0000GíLðY\u0018eørB\u007fd\u008b\u0088\u0090X\u009d5©\u0082¶DÂäÏéÔ\ràÛí¸ú\u0005\u0006¢\u0013I\u0018.$ò1O>$J\u0082Wd±³º´§S\u0093þ\u009c\u0084\u0089>õÓþÎë&×ÆÀ|ÍZ9¶\"f/\u000b\u001b¼\u0004zpÚ}×f-Rò_\u0084H>\u0018s\u0013t\u000e\u0093:>5D þ\\\u0013W\u000eBè~\u0006i°d\u009a\u0090t\u008bª\u0086Ä²g\u00ad\u0089Ù:ÔOÏËû\rö[áü\u001d\u001e\b¤\u0003\u0091?\u0011*ª#\u009e(\u008e5b\u0001Ö\u000eò\u001b\u0018göl¡y\u001cEåRJ_=«\u0086°Z&õ-³0\u001f\u0004ô\u000b\u009e\u001e)bÉi\u009e|q@ÜWfZ\u001d®·\u008ai\u00819\u009cÐ¨e§\u000e²îÎKÅ\u001fÐ«±³º·§X\u0093â\u009c\u0093\u0089tõØþ\u0088ë(×ÊÀaÍ\f9«\"w/\u0003\u001b¤\u0004_±òº¢§G\u0093ø\u009c\u0083\u0089=±îº¨§\u0004\u0093ý\u009c\u0082\u00894õÚþ\u0094ë'×ÛÀ<Í\u00189¹\"m/\u0013\u001b¯\u0004Mpô}\u008ef(Rò_\u008eH<>Í5\u0094(r\u001cÂ?\u00944Ú) \u001d\u0086\u0012á\u0007P{²p·eOY®N\u0019C#·Â¬\u001f¡0\u0095Õ\u008a1þ\u008dó÷èBÜÖÑôÆF:¼/B$a\u0018»\r\u0016\u0002uvôk)_\u0091TñI\u0000½\u0080²ð§F\u009b§\u0090\u0003\u0085Kù¹î\u0005ÅgÎ)ÓÓçuè\u0012ý£\u0081A\u008aD\u009f¼£]´ê¹ÐM1Vì[Ão&pÂ\u0004~\t\u0004\u0012±&%+\u0007<µÀOÕ±Þ\u0092âH÷åø\u0086\u008c\u0007\u0091Ú¥b®\u0002³óGwH\u0003]µaTjú\u007f¸±ìº¢§X\u0093þ\u009c\u0099\u0089(õÊþÏë7×ÖÀaÍ[9º\"g/H\u001b\u00ad\u0004Ipõ}\u008ff:R®_\u0099H!´\u009f¡wª\u000e\u0096Ë±ìº¢§X\u0093þ\u009c\u0099\u0089(õÊþÏë7×ÖÀaÍ[9º\"g/H\u001b\u00ad\u0004Ipõ}\u008ff:R®_\u0099H!´\u009f¡xª\u001e\u0096Á±ìº¢§X\u0093þ\u009c\u0099\u0089(õÊþÏë7×ÖÀaÍ[9º\"g/H\u001b\u00ad\u0004Ipõ}\u008ff:R®_\u0099H!´\u009f¡yª\u001c\u0096Á@oK!VÛb}m\u001ax«\u0004I\u000fL\u001a´&U1â<ØÈ9ÓäÞËê.õÊ\u0081v\u008c\f\u0097¹£-®\u001a¹¢E\u001cPú[\u0092gB±êº¥§E\u0093õ\u009c\u0083\u0089=±³º·§X\u0093â\u009c\u0093\u0089tõÓþ\u008eë ×ÚÀ~Í\u00109«±êº¥§E\u0093õ\u009c\u0097\u0089.õÛþ\u0092ë0P\u0012[\u0015Fòr_}%h\u009f\u0014r\u001fo\n\u00836|!Ò,¹Ø\u001cÃÕÎ¨ú\u001aåæ\u0091\u0019\u009c,\u0087\u0095³O¾.©\u0080Ug@ÆKówpbÝmº\u0019\u0006\u0004ò0U;\u0002&õÒNÝ>È\u0087ô\u007fÿÍêÎ\u0096o\u0081Ï\u008c¡±³º±§O\u0093ã\u009c\u0094\u00894õÌþÎë(×ÆÀpÍC9ì\",/\u000e\u001b¾\u0004\u0003pö}\u008ff9Ré_\u0084H`´Á¡fª\u0016\u0096Ï\u0083d\u008c\u001aøªå\u0018ÑîÚ\u0095ÇI3î<\u0082)'\u0015È\u001e0\u000b2wË±³º±§O\u0093ã\u009c\u0094\u00894õÌþÎë(×ÆÀpÍC9ì\",/\u000e\u001b¾\u0004\u0003pÿ}\u008df>Rï_\u0086H>´Þ¡gª\u001a\u0096Ð\u0083+\u008c\u001føºåXÑýÚ\u0093ÇP3ù<Ã)#\u0015Ô\u0082Ë\u0089Ì\u0094+ \u0086¯üºFÆ«Í¶ØPä¾ó\bþ;\n\u0094\u0011T\u001c}(Ý7;C\u009aNæUza\u0099lú{R\u0087¥\u00923\u0099n¥´°\t¿uËÙÖ(â\u0080éçô:\u0000ß\u000fö\u001aX&³-H8JD³±³º¢§^\u0093î\u009cß\u00892õÐþ\u0088ë0×\u0080À{Í\u001b9±\"w/H\u001bª\u0004@pø}\u008ff9Ró_\u008eH<´Ç¡}ª\u001c\u0096Ç\u0083+\u008c\u001aø°±Ûº¢§D\u0093ô\u009c\u009d\u00894õÊþ\u0088ë+×Á±éº©§A\u0093ã\u009c\u009f\u0089,õÐ±ÿº¯§X\u0093â\u009c\u009d\u00892õËþ\u008c_\u0011TWIû}\u0002r}gË\u001b%\u0010k\u0005Ø9$.Ã#î×BÌ\u008aÁðõUê¶_ ToI\u008f}?r\u0002g§\u001b\u0004±ûº¢§D\u0093è\u009c\u0082\u00892õÝ±ûº¢§D\u0093è\u009c\u0082\u00892õÝþ¾ë<×\u0097À$±ûº¢§D\u0093è\u009c\u0082\u00892õÝþ¾ë<×\u0097À$Í*9î\"7~øu¾h\u0012\\ëS\u0094F\":Ì1\u0082$1\u0018Í\u000f*\u0002\u000eö¡íqà\u0015Ô³±ïº£§A±ùºª§_\u0093á\u009c\u0091\u0089/õÑþ\u0093p\u000f{ef\u0088R\u007f]pHü4\u0002?G*ÿ\u0016\u0010\u0001¥\f\u0087ølã¾îÆÚ;Å½±-¼Z§à\u0093?\u009e\\\u007f\u0082töi\u0011] RÀGm;\u00850\u009e%H\u0019´\u000e\u0006\u0003\n÷åì)áPÕúÊ\u0007¾è³Ã¨m\u009c\u00ad\u0091\u0094\u0086izÖo}\u000få\u0004\u0091\u0019v-Ç\"§7\nKâ@ùU/iÓ~asm\u0087\u0082\u009cN\u00917¥\u009dº`Î\u008fÃ¤Ø\nìÊáóö\u000e\n±\u001f\u001a\u0014\u0018(¬=\téÙâ\u009fÿ3ËÒÄ¦Ñ\u001e\u00adí¦¡³\u0012\u008fê\u0098@±ûº¨§F\u0093é\u009c\u0096\u00892õÍþ\u0089±êº¥§E\u0093õ\u009cÈ\u0089m±îº¦§D\u0093î\u009c\u0098\u0089.±îº¨§\u0004\u0093ý\u009c\u0082\u00894õÚþ\u0094ë'×ÛÀ<Í\u00179ª\"b/\b\u001b\u00ad±îº¨§\u0004\u0093æ\u009c\u0095\u0089)õÐþ\u0084ë(×\u0081ÀcÍ\u00109µ\"v±\u00ad3Ã8\u0085%)\u0011Ó\u001e¸\u000b\u0015wæ|¾i\f\u008b\u0019±îº¨§\u0004\u0093ï\u009c\u0085\u00892õÒþ\u0085ëj×ßÀ`Í\u001a9¼\"v/\u0005\u001b½±úº²§F\u0093á\u009c¯\u0089#õ\u0086þ×FöM°P\u001cd÷k\u009d~*\u0002Ê\t\u009d\u001cr Ñ7c:\u0003Î§Õ~Ø\fì¡óF\u0087æ\u008a\u008c\u00911ÎÞÅ\u0087ØaìÍã§ö\u0017\u008aø\u0081ë\u0094\u0012¨î¿\\²\u007fF\u009a]CP-d\u0089{{\u000fÛ\u0002¼P?[fF\u0080r,}Fhö\u0014\u0019\u001fz\nø6S!à,\u009eØoÃ£ÎÉúRå\u0090\u0091k\u009c\b\u0087¶³#¾J©äU\u0010@¢KÒw\u0005b\u009emÔ\u0019/\u0004ÄGäL½Q[e÷j\u009d\u007f-\u0003Â\bÑ\u001d<!ß6b;\rÏ«ÔyÙ&í¥òW\u0086ã\u008bÊ\u0090%¤ú©\u009a¾4BÜWb\\\u0003±ûº¢§D\u0093è\u009c\u0082\u00892õÝþÎë2×ÍÀ}Í\r9à\"5/\u0016\u001bæ\u0004Zpõ}\u0095f%R¸_ÝH>\u001f\u001e\u0014M\t =\u000f2y'Û[tPwEÅy!n¨c÷\u0097M\u008c\u008e\u0081ìµBª¬Þ-ÓgÈ\u0080üSñ!æÌ\u001a1\u000f\u009f\u0004ÿ85-\u0089\"îViK«\u007fDt/R/YiDÅp.\u007f^jõ\u0016\u000b\u001dL\bê4\u000f#·.ÑÚk51>w#Û\u00170\u0018@\rëq\u0015zWoöS\u0011DªIÏ½)¦¾«Ì\u009f\u007f\u0080\u009fô,ù\u000bâäÖ6ÛZÌö0\u000b%¹.Ð\u0012\u000f\u0007³\bÙ|xÆ\u009fÍëÐ\fä½ëÝþp\u0082\u0098\u0089\u008e\u009c~ Õ·f¿w´1©\u009d\u009dv\u0092\u001c\u0087«ûKð\u001cåóÙRÎâÃ\u009f71,ö!\u009e\u0015)\n\u009b~gs\u0007±èº¢§Y\u0093ù\u009cÝ<\u00927Î*$\u001e\u009e\u0011¹\u0004Ox¯såf\rZ¹M\u0010@\u007f´Ê¯I¢q\u0096Ü\u0089$ý\u0080ðî±íº¢§G\u0093ø\u009cÞ\u00893õÉþÏë)×ÎÀ{Í\u001b9³\"f/\u001f\u001bº±íº¢§G\u0093ø\u009cÞ\u0089(õØþÏë\"×ÎÀyÍ\u00109\u0087\"`/\u0007\u001b¤\u0004Ipå}\u009b\u0012×\u0019\u0098\u0004}0Â?ä*\u0012Vâ]õH\u0012töcLn\u0010\u009a\u0086\u0081\\\u008c2¸\u0080§\u007fÓÙÞ¹ÐÌÛ\u008aÆ&òÄý·è\u000b\u0094ò\u009f¦\u008a\n¶£¡Q¬9X\u009eCSN+z\u0082ej\u0011\u009b\u001c©\u0007\u001a3Ï>¼)\b±îº¨§\u0004\u0093ï\u009c\u009f\u00894õÊþÏë5×ÊÀ\u007fÍ\u00009ö\"b/\u0010\u001b\u00ad\u0004spù}\u009bf0Rå\u0011t\u001a2\u0007\u009e3x<\u000e)¬U\n^\u0019K«w\\`äm\u008b\u0099l\u0082ÿ\u008f\u0095»=¤ÑÐhÝ\u0012Æ·òhÿ\u0018èº\u0014_±îº¨§\u0004\u0093ý\u009c\u0082\u00894õÚþ\u0094ë'×ÛÀ<Í\u00179\u00ad\"j/\n\u001b\u00ad\u0004\u0002pñ}\u0093f3Rç_\u008eH<´Á¡fª\u0016\u0096Ì\u0083q±îº¨§\u0004\u0093þ\u009c\u0089\u0089(õÊþ\u0084ë)×\u0081ÀpÍ\u00009±\"o/\u0002\u001bç\u0004Jpþ}\u0094f:Rå_\u0099H>´Ã¡}ª\u0011\u0096Ö±îº¨§\u0004\u0093þ\u009c\u0089\u0089(õÊþ\u0084ë)×ðÀwÍ\r9¬\"-/\u0004\u001b¼\u0004Epû}\u009efsRæ_\u0082H ´Ö¡qª\r\u0096Ò\u0083w\u008c\u0001ø½åB±îº¨§\u0004\u0093û\u009c\u0095\u00895õÚþ\u008eë6×\u0081ÀpÍ\u00009±\"o/\u0002\u001bç\u0004Jpþ}\u0094f:Rå_\u0099H>´Ã¡}ª\u0011\u0096Ö±îº¨§\u0004\u0093û\u009c\u0095\u00895õÚþ\u008eë6×ðÀvÍ\u00199³\"n/H\u001b«\u0004Ypþ}\u0096f9R®_\u008dH'´ß¡sª\u001a\u0096Ð\u0083u\u008c\u001aøºåXÑíIx±°ºç±¦\u0086\n±³º£§O\u0093û\u009cß\u0089*õÛþ\u008cë1×ðÀbÍ\u001c9¨\"f±³º£§O\u0093û\u009cß\u0089(õÑþ\u0082ë/×ÊÀfÍZ9º\"b/\u0015\u001b¬\u0004Npö}\u0094f9Rß_\u008cH+´ß¡mª\u001böOý_à³Ô\u0007Û#ÎÔ²-¹~¬Ó\u00906\u0087\u009a\u008a¦~Ce\u009ahô\\LC´±³º£§O\u0093û\u009cß\u0089(õÑþ\u0082ë/×ÊÀfÍZ9©\"f/\u000b\u001b¼\u0004H\u0017¥\u001c¢\u0001E5è:É/<SÍX\u009aM'qæfpk\u0011\u009f¯\u0084v\u0089\u0015ï÷äðù\u0017ÍºÂÀ×z«\u0097 \u008aµl\u0089\u0082\u009e4\u0093\u001egð|.q@EîZ7.¾#ß8u\f¨\u0001À\u0016iêªÿ4ô^È\u0084Ý4ÒK¦È»\u0003\u008f¸\u0084Õ\u0099\u0016màbÚw{±³º£§O\u0093û\u009cß\u00899õÍþ\u0095ë\u001b×ÈÀbÍ\u0006±³º£§O\u0093û\u009cß\u00899õÍþ\u0095ë\u001b×ÛÀ{Í\u00189½±³º£§O\u0093û\u009cß\u0089(õÑþ\u0082ë/×ÊÀfÍZ9º\"p/\u0012\u001b¯\u0004Cpû}\u009ef8Rò_\u008f±³º´§S\u0093þ\u009c\u0084\u0089>õÓþÎë(×ÆÀpÍZ9´\"j/\u0004\u001b«\u0004_pã}\u009cf2Rì_\u008fH+´Ã¡Kª\u0015\u0096Ì\u0083l\u008cFø åY±³º£§O\u0093û\u009cß\u00899õÍþ\u0095ë%×ÌÀqÍ\u0010\u009c£\u0097³\u008a_¾ë±Ï¤)ØÝÓ\u0085Æ3úÆípà\n±³º£§O\u0093û\u009cß\u00899õÍþ\u0095ë)×ÊÀuÍ\u001b±³º£§O\u0093û\u009cß\u00899õÍþ\u0095ë+×ÝÀ{Í\u0010U;^+CÇwsxWm±\u0011E\u001a\u001d\u000fº3J$é)\u009a\u001ej\u0015z\b\u0096<\"3\u0006&àZ\u0014QLDíx\u0011oªbÅ\u0096q\u008d¹\u008b`\u0080p\u009d\u009c©(¦\f³êÏ\u001eÄFÑÈí\u0015ú¬÷Ã±³º£§K\u0093ù\u009c\u0091\u0089tõÚþ\u008eë3×ÁÀ~Í\u001a9¹\"g/\u0015\u001bæ\u0004\u0002pï}\u0098frRâ_\u0098H:´Ú±³ºª§D\u0093ù\u009cß\u0089,õ×þ\u008fë ×ÀÀeÍ\u00069÷\"A/\u0015\u001b½\u0004\u007fpÿ}\u009bf/Rå_\u008fH\b´Þ¡xª\u001b\u0096Ç\u0083w±³º·§X\u0093â\u009c\u0093\u0089tõ×þ\u008eë4×ÀÀ`Í\u00019«E\u0019N\u0014Sùg\u0018h\u007f\f¯\u0007«\u001aD.þ!\u008f4hHÑC\u0098V4jÕ}!p\u0004\u0084¥\u009fo\u0092\tY\u0013R]O£{\tttaÜ\u001d5\u0016'\u0003Ë?((\u0096%ùÑVÊ\u0082ÇýóIìê\u0098\f\u0095}ô@ÿ\u001eâøÖzÙ\fÌ®°]»\u000e®\u0096\u0092l\u0085Ö\u0088ë|\u001bgÜ\u0088É\u0083Ø\u009e$ª\u0094¥¥°LÌ¡ÇÿÒWî´ù7ôl\u0000Í\u001b\u001d\u0016y\"Ð=%IÃDø_Jk\u0096>A5\u0014(à\u001cW\u0013<\u0006\u0090z`q=d\u0090Xc\u001fF\u0014W\t«=\u001b2*'Ã[$PaEßy.n\u0094±³º£§K\u0093ù\u009c\u0091\u0089tõÚþ\u008eë3×ÁÀ~Í\u001a9¹\"g/\u0015\u001bæ\u0004\u0002pó}\u008afrRá_\u009bH>´Â¡:ª\u0007\u0096Ï\u0083iäpïtò\u009bÆ!ÉPÜ· \u001e«R¾ò\u0082\u0005\u0095¿\u0098Ðltÿ,ô_é±Ý\u001eÒaÇÅ»:°~±³º£§K\u0093ù\u009c\u0091\u0089tõÓþ\u0088ë7×ÌÀ=Í\u00059ª\"l/\u0000\u001b \u0004@pò}\u0089frRã_\u009eH<´\u009e¡$ªP\u0096Á\u0083j\u008c\u0005øýå[ÑðÚ\u009fÇU3å<\u009b)9\u0015É\u001ej\u000bowÉ`jm\u001fY BQO\u000e»£".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2154);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr;
            b = -2381431871724143929L;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(byte r6, short r7, int r8) {
            /*
                byte[] r0 = com.google.android.material.color.utilities.QuantizerWu.CreateBoxesResult.$$c
                int r6 = r6 * 3
                int r6 = r6 + 109
                int r7 = r7 * 3
                int r7 = r7 + 4
                int r8 = r8 * 2
                int r8 = 1 - r8
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r7
                r4 = r2
                goto L2a
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r8) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L24:
                r4 = r0[r7]
                r5 = r3
                r3 = r7
                r7 = r4
                r4 = r5
            L2a:
                int r7 = -r7
                int r6 = r6 + r7
                int r7 = r3 + 1
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.color.utilities.QuantizerWu.CreateBoxesResult.$$e(byte, short, int):java.lang.String");
        }
    }

    final void createMoments() {
        int i = 1;
        while (true) {
            int i2 = 33;
            if (i >= 33) {
                return;
            }
            int[] iArr = new int[33];
            int[] iArr2 = new int[33];
            int[] iArr3 = new int[33];
            int[] iArr4 = new int[33];
            double[] dArr = new double[33];
            int i3 = 1;
            while (i3 < i2) {
                int i4 = 0;
                int i5 = 0;
                double d = 0.0d;
                int i6 = 1;
                int i7 = 0;
                int i8 = 0;
                while (i6 < i2) {
                    int index = getIndex(i, i3, i6);
                    int i9 = i4 + this.weights[index];
                    i7 += this.momentsR[index];
                    i8 += this.momentsG[index];
                    i5 += this.momentsB[index];
                    d += this.moments[index];
                    iArr[i6] = iArr[i6] + i9;
                    iArr2[i6] = iArr2[i6] + i7;
                    iArr3[i6] = iArr3[i6] + i8;
                    iArr4[i6] = iArr4[i6] + i5;
                    dArr[i6] = dArr[i6] + d;
                    int index2 = getIndex(i - 1, i3, i6);
                    int[] iArr5 = this.weights;
                    iArr5[index] = iArr5[index2] + iArr[i6];
                    int[] iArr6 = this.momentsR;
                    iArr6[index] = iArr6[index2] + iArr2[i6];
                    int[] iArr7 = this.momentsG;
                    iArr7[index] = iArr7[index2] + iArr3[i6];
                    int[] iArr8 = this.momentsB;
                    iArr8[index] = iArr8[index2] + iArr4[i6];
                    double[] dArr2 = this.moments;
                    dArr2[index] = dArr2[index2] + dArr[i6];
                    i6++;
                    i4 = i9;
                    i2 = 33;
                }
                i3++;
                i2 = 33;
            }
            i++;
        }
    }

    final CreateBoxesResult createBoxes(int i) {
        int i2;
        this.cubes = new Box[i];
        for (int i3 = 0; i3 < i; i3++) {
            this.cubes[i3] = new Box(null);
        }
        double[] dArr = new double[i];
        Box box = this.cubes[0];
        box.r1 = 32;
        box.g1 = 32;
        box.b1 = 32;
        int i4 = 0;
        int i5 = 1;
        while (i5 < i) {
            Box[] boxArr = this.cubes;
            if (cut(boxArr[i4], boxArr[i5]).booleanValue()) {
                dArr[i4] = this.cubes[i4].vol > 1 ? variance(this.cubes[i4]) : 0.0d;
                dArr[i5] = this.cubes[i5].vol > 1 ? variance(this.cubes[i5]) : 0.0d;
            } else {
                dArr[i4] = 0.0d;
                i5--;
            }
            double d = dArr[0];
            int i6 = 0;
            for (int i7 = 1; i7 <= i5; i7++) {
                double d2 = dArr[i7];
                if (d2 > d) {
                    i6 = i7;
                    d = d2;
                }
            }
            if (d <= 0.0d) {
                i2 = i5 + 1;
                return new CreateBoxesResult(i, i2);
            }
            i5++;
            i4 = i6;
        }
        i2 = i;
        return new CreateBoxesResult(i, i2);
    }

    final List<Integer> createResult(int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            Box box = this.cubes[i2];
            int iVolume = volume(box, this.weights);
            if (iVolume > 0) {
                arrayList.add(Integer.valueOf(((volume(box, this.momentsB) / iVolume) & 255) | (((volume(box, this.momentsR) / iVolume) & 255) << 16) | ViewCompat.MEASURED_STATE_MASK | (((volume(box, this.momentsG) / iVolume) & 255) << 8)));
            }
        }
        return arrayList;
    }

    final double variance(Box box) {
        int iVolume = volume(box, this.momentsR);
        int iVolume2 = volume(box, this.momentsG);
        int iVolume3 = volume(box, this.momentsB);
        double d = this.moments[getIndex(box.r1, box.g1, box.b1)];
        double d2 = this.moments[getIndex(box.r1, box.g1, box.b0)];
        double d3 = this.moments[getIndex(box.r1, box.g0, box.b1)];
        double d4 = this.moments[getIndex(box.r1, box.g0, box.b0)];
        double d5 = this.moments[getIndex(box.r0, box.g1, box.b1)];
        double d6 = this.moments[getIndex(box.r0, box.g1, box.b0)];
        double d7 = this.moments[getIndex(box.r0, box.g0, box.b1)];
        return (((((((d - d2) - d3) + d4) - d5) + d6) + d7) - this.moments[getIndex(box.r0, box.g0, box.b0)]) - (((double) (((iVolume * iVolume) + (iVolume2 * iVolume2)) + (iVolume3 * iVolume3))) / ((double) volume(box, this.weights)));
    }

    final Boolean cut(Box box, Box box2) {
        Direction direction;
        int iVolume = volume(box, this.momentsR);
        int iVolume2 = volume(box, this.momentsG);
        int iVolume3 = volume(box, this.momentsB);
        int iVolume4 = volume(box, this.weights);
        MaximizeResult maximizeResultMaximize = maximize(box, Direction.RED, box.r0 + 1, box.r1, iVolume, iVolume2, iVolume3, iVolume4);
        MaximizeResult maximizeResultMaximize2 = maximize(box, Direction.GREEN, box.g0 + 1, box.g1, iVolume, iVolume2, iVolume3, iVolume4);
        MaximizeResult maximizeResultMaximize3 = maximize(box, Direction.BLUE, box.b0 + 1, box.b1, iVolume, iVolume2, iVolume3, iVolume4);
        double d = maximizeResultMaximize.maximum;
        double d2 = maximizeResultMaximize2.maximum;
        double d3 = maximizeResultMaximize3.maximum;
        if (d < d2 || d < d3) {
            if (d2 >= d && d2 >= d3) {
                direction = Direction.GREEN;
            } else {
                direction = Direction.BLUE;
            }
        } else {
            if (maximizeResultMaximize.cutLocation < 0) {
                return Boolean.FALSE;
            }
            direction = Direction.RED;
        }
        box2.r1 = box.r1;
        box2.g1 = box.g1;
        box2.b1 = box.b1;
        int i = AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction[direction.ordinal()];
        if (i == 1) {
            box.r1 = maximizeResultMaximize.cutLocation;
            box2.r0 = box.r1;
            box2.g0 = box.g0;
            box2.b0 = box.b0;
        } else if (i == 2) {
            box.g1 = maximizeResultMaximize2.cutLocation;
            box2.r0 = box.r0;
            box2.g0 = box.g1;
            box2.b0 = box.b0;
        } else if (i == 3) {
            box.b1 = maximizeResultMaximize3.cutLocation;
            box2.r0 = box.r0;
            box2.g0 = box.g0;
            box2.b0 = box.b1;
        }
        box.vol = (box.r1 - box.r0) * (box.g1 - box.g0) * (box.b1 - box.b0);
        box2.vol = (box2.r1 - box2.r0) * (box2.g1 - box2.g0) * (box2.b1 - box2.b0);
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: com.google.android.material.color.utilities.QuantizerWu$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction;

        static {
            int[] iArr = new int[Direction.values().length];
            $SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction = iArr;
            try {
                iArr[Direction.RED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction[Direction.GREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction[Direction.BLUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    final MaximizeResult maximize(Box box, Direction direction, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        QuantizerWu quantizerWu = this;
        Box box2 = box;
        Direction direction2 = direction;
        int iBottom = bottom(box2, direction2, quantizerWu.momentsR);
        int iBottom2 = bottom(box2, direction2, quantizerWu.momentsG);
        int iBottom3 = bottom(box2, direction2, quantizerWu.momentsB);
        int iBottom4 = bottom(box2, direction2, quantizerWu.weights);
        double d = 0.0d;
        int i8 = -1;
        int i9 = i;
        while (i9 < i2) {
            int pVar = top(box2, direction2, i9, quantizerWu.momentsR) + iBottom;
            int pVar2 = top(box2, direction2, i9, quantizerWu.momentsG) + iBottom2;
            int pVar3 = top(box2, direction2, i9, quantizerWu.momentsB) + iBottom3;
            int pVar4 = top(box2, direction2, i9, quantizerWu.weights) + iBottom4;
            if (pVar4 == 0) {
                i7 = iBottom;
            } else {
                i7 = iBottom;
                double d2 = ((double) (((pVar * pVar) + (pVar2 * pVar2)) + (pVar3 * pVar3))) / ((double) pVar4);
                int i10 = i3 - pVar;
                int i11 = i4 - pVar2;
                int i12 = i5 - pVar3;
                int i13 = i6 - pVar4;
                if (i13 != 0) {
                    double d3 = d2 + (((double) (((i10 * i10) + (i11 * i11)) + (i12 * i12))) / ((double) i13));
                    if (d3 > d) {
                        d = d3;
                        i8 = i9;
                    }
                }
            }
            i9++;
            quantizerWu = this;
            box2 = box;
            direction2 = direction;
            iBottom = i7;
        }
        return new MaximizeResult(i8, d);
    }

    static int volume(Box box, int[] iArr) {
        int i = iArr[getIndex(box.r1, box.g1, box.b1)];
        int i2 = iArr[getIndex(box.r1, box.g1, box.b0)];
        int i3 = iArr[getIndex(box.r1, box.g0, box.b1)];
        int i4 = iArr[getIndex(box.r1, box.g0, box.b0)];
        int i5 = iArr[getIndex(box.r0, box.g1, box.b1)];
        int i6 = iArr[getIndex(box.r0, box.g1, box.b0)];
        return ((((((i - i2) - i3) + i4) - i5) + i6) + iArr[getIndex(box.r0, box.g0, box.b1)]) - iArr[getIndex(box.r0, box.g0, box.b0)];
    }

    static int bottom(Box box, Direction direction, int[] iArr) {
        int i;
        int i2;
        int i3 = AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction[direction.ordinal()];
        if (i3 == 1) {
            i = (-iArr[getIndex(box.r0, box.g1, box.b1)]) + iArr[getIndex(box.r0, box.g1, box.b0)] + iArr[getIndex(box.r0, box.g0, box.b1)];
            i2 = iArr[getIndex(box.r0, box.g0, box.b0)];
        } else if (i3 == 2) {
            i = (-iArr[getIndex(box.r1, box.g0, box.b1)]) + iArr[getIndex(box.r1, box.g0, box.b0)] + iArr[getIndex(box.r0, box.g0, box.b1)];
            i2 = iArr[getIndex(box.r0, box.g0, box.b0)];
        } else if (i3 == 3) {
            i = (-iArr[getIndex(box.r1, box.g1, box.b0)]) + iArr[getIndex(box.r1, box.g0, box.b0)] + iArr[getIndex(box.r0, box.g1, box.b0)];
            i2 = iArr[getIndex(box.r0, box.g0, box.b0)];
        } else {
            throw new IllegalArgumentException("unexpected direction ".concat(String.valueOf(direction)));
        }
        return i - i2;
    }

    static int top(Box box, Direction direction, int i, int[] iArr) {
        int i2;
        int i3;
        int i4 = AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$QuantizerWu$Direction[direction.ordinal()];
        if (i4 == 1) {
            i2 = (iArr[getIndex(i, box.g1, box.b1)] - iArr[getIndex(i, box.g1, box.b0)]) - iArr[getIndex(i, box.g0, box.b1)];
            i3 = iArr[getIndex(i, box.g0, box.b0)];
        } else if (i4 == 2) {
            i2 = (iArr[getIndex(box.r1, i, box.b1)] - iArr[getIndex(box.r1, i, box.b0)]) - iArr[getIndex(box.r0, i, box.b1)];
            i3 = iArr[getIndex(box.r0, i, box.b0)];
        } else if (i4 == 3) {
            i2 = (iArr[getIndex(box.r1, box.g1, i)] - iArr[getIndex(box.r1, box.g0, i)]) - iArr[getIndex(box.r0, box.g1, i)];
            i3 = iArr[getIndex(box.r0, box.g0, i)];
        } else {
            throw new IllegalArgumentException("unexpected direction ".concat(String.valueOf(direction)));
        }
        return i2 + i3;
    }

    static final class MaximizeResult {
        int cutLocation;
        double maximum;

        MaximizeResult(int i, double d) {
            this.cutLocation = i;
            this.maximum = d;
        }
    }

    static final class Box {
        int b0;
        int b1;
        int g0;
        int g1;
        int r0;
        int r1;
        int vol;

        private Box() {
            this.r0 = 0;
            this.r1 = 0;
            this.g0 = 0;
            this.g1 = 0;
            this.b0 = 0;
            this.b1 = 0;
            this.vol = 0;
        }

        /* synthetic */ Box(AnonymousClass1 anonymousClass1) {
            this();
        }
    }
}

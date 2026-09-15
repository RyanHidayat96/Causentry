package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bpjstku.domain.general.model.BaseModel;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class PreviewOrientationIncorrectQuirk implements Function1 {
    private /* synthetic */ PreviewDelayWhenVideoCaptureIsBoundQuirk b;
    private static final byte[] $$c = {83, -4, -55, -17};
    private static final int $$f = 200;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {108, -26, -110, 50, 27, 9, -11, 10, -20, -27, 24, -18, 28, -14, 0};
    private static final int $$e = 11;
    private static final byte[] $$a = {59, -124, -78, 46, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 168;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f197a = 0;
    private static int asBinder = 1;
    private static char TuitionPaymentFragmentbindingInflater1 = 43240;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 52077;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 35866;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 65233;

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 52
            int r8 = r8 + 1
            byte[] r0 = defpackage.PreviewOrientationIncorrectQuirk.$$a
            int r7 = r7 * 14
            int r7 = r7 + 84
            int r9 = r9 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r9
            r4 = r2
            goto L2c
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r9 = r9 + 1
            if (r4 != r8) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2c:
            int r7 = -r7
            int r9 = r9 + r7
            int r7 = r9 + (-11)
            r9 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.PreviewOrientationIncorrectQuirk.c(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 31
            int r6 = r6 + 67
            int r7 = r7 * 11
            int r7 = r7 + 1
            int r8 = r8 + 4
            byte[] r0 = defpackage.PreviewOrientationIncorrectQuirk.$$d
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r8]
        L28:
            int r6 = r6 + r3
            int r6 = r6 + 3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.PreviewOrientationIncorrectQuirk.e(int, byte, short, java.lang.Object[]):void");
    }

    private static void d(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i3 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < cArr.length) {
                cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                int i4 = $11 + 95;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 58224;
                int i7 = 0;
                while (i7 < 16) {
                    int i8 = $10 + 69;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    char c = cArr3[1];
                    char c2 = cArr3[i3];
                    int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault3) ^ 8611973335120459638L)));
                    int i11 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        objArr2[2] = Integer.valueOf(i11);
                        objArr2[1] = Integer.valueOf(i10);
                        objArr2[i3] = Integer.valueOf(c);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', i3, i3) + 47774);
                            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 468;
                            int iBlue = Color.blue(i3) + 13;
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, maxKeyCode, iBlue, -2007001706, false, "o", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        int i12 = i7;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf("", "", 0, 0) + 47773), (Process.myPid() >> 22) + 468, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 12, -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        i6 -= 40503;
                        i7 = i12 + 1;
                        i3 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
                cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
                Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), Color.red(0) + 2323, 45 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -1312321721, false, $$g(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            } else {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0221  */
    /* JADX WARN: Code duplicated, block: B:27:0x022f  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 37567);
            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 625;
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 15;
            byte[] bArr = $$a;
            byte b = bArr[5];
            Object[] objArr2 = new Object[1];
            c(b, bArr[7], (byte) (-b), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, offsetAfter, iIndexOf, -477065106, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        d(new char[]{33545, 28553, 30424, 30391, 23489, 10880, 42047, 27106, 56597, 6384, 18927, 19044, 34537, 52312, 22449, 36674, 37319, 47011, 22989, 36728, 18210, 55021, 1209, 44471}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 22, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        d(new char[]{4313, 9459, 56704, 56575, 32966, 19918, 52445, 52520, 46893, 54652, 57299, 18706, 56945, 8071, 20733, 61520, 32068, 45253}, (Process.myPid() >> 22) + 15, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char offsetBefore = (char) (37567 - TextUtils.getOffsetBefore("", 0));
            int maximumFlingVelocity = 625 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int iBlue = 14 - Color.blue(0);
            byte[] bArr2 = $$a;
            byte b2 = bArr2[7];
            byte b3 = bArr2[5];
            Object[] objArr5 = new Object[1];
            c(b2, b3, (byte) (-b3), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(offsetBefore, maximumFlingVelocity, iBlue, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = asBinder + 89;
            f197a = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char threadPriority = (char) (37567 - ((Process.getThreadPriority(0) + 20) >> 6));
                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 625;
                int i4 = 14 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                byte[] bArr3 = $$a;
                byte b4 = bArr3[7];
                byte b5 = bArr3[5];
                Object[] objArr6 = new Object[1];
                c(b4, b5, (byte) (b5 | 50), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(threadPriority, iNormalizeMetaState, i4, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i5 = ((int[]) objArr7[2])[0];
            int i6 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i6};
            int iNextInt = new Random().nextInt(844970667);
            int i7 = ((((-300688064) + (((~((-944916549) | iNextInt)) | 809517124) * 345)) + (((~((-944916549) | (~iNextInt))) | 69304448) * 345)) + ((~(iNextInt | (-809517125))) * 345)) - 1987936875;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
            objArr = new Object[]{iArr, new int[1], new int[]{i5}, strArr};
            int i10 = asBinder + 105;
            f197a = i10 % 128;
            int i11 = i10 % 2;
        } else {
            Object[] objArr8 = new Object[1];
            d(new char[]{810, 16339, 65310, 30154, 12824, 14179, 32073, 20389, 63090, 39721, 22491, 19961, 13806, 45685, 27739, 21443, 28036, 20253, 40360, 41194, 19107, 17489, 40223, 38080, 33306, 5859, 42104, 24088}, 26 - (ViewConfiguration.getScrollBarSize() >> 8), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            d(new char[]{18833, 20017, 28197, 11830, 19660, 61024, 43797, 22947, 51698, 13698, 26080, 49151, 2624, 29040, 30417, 17642, 34579, 32442, 22531, 45119}, TextUtils.lastIndexOf("", '0', 0, 0) + 19, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i12 = asBinder + 55;
                f197a = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = 4 / 0;
                    if (applicationContext instanceof ContextWrapper) {
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = null;
                        }
                    }
                } else if (applicationContext instanceof ContextWrapper) {
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = null;
                    }
                }
                applicationContext = applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            d(new char[]{59205, 53612, 10326, 14872, 41738, 53700, 65147, 11850, 16170, 58990, 3868, 43000, 54556, 1882, 31134, 51390, 15512, 56769}, 16 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            d(new char[]{27589, 10954, 27925, 50205, 14568, 11876, 36440, 13171, 60932, 27997, 5133, 50576, 52350, 30873, 44954, 46754, 48429, 12154}, (Process.myPid() >> 22) + 16, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            d(new char[]{40811, 40753, 24045, 53536, 59267, 10060, 16929, 49330, 59402, 34358, 47448, 46869, 1318, 15439, 34950, 35007, 45937, 29408, 45578, 16363, 59181, 56699, 38886, 8032, 4080, 64155, 625, 60167, 36786, 2601, 47272, 59245, 23463, 22082, 48824, 1151, 60800, 58710, 30306, 18842, 34418, 18501, 17508, 10252, 63009, 42703, 60885, 36310, 58180, 20572, 41785, 62429, 3487, 49179, 58456, 32234, 47072, 18774, 39651, 17329, 49597, 57928, 6923, 41370, 22833, 30371}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 64, objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            d(new char[]{46157, 51624, 61935, 55753, 31117, 36711, 13536, 43547, 14807, 63219, 25630, 59396, 11780, 9823, 48079, 56832, 61725, 19788, 37001, 3566, 42408, 47620, 56797, 39384, 19239, 35611, 22348, 41658, 30950, 54469, 29298, 21201, 33724, 21696, 52800, 59419, 3944, 55761, 50905, 64277, 52218, 4109, 15071, 15307, 38533, 57516, 36201, 34798, 1671, 6399, 22847, 17254, 42924, 5425, 47893, 1345, 36267, 16226, 22587, 44830, 58134, 59845, 48056, 28527, 55442, 43223}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 65, objArr13);
            try {
                Object[] objArr14 = {applicationContext, new String[]{str, (String) objArr13[0]}, Integer.valueOf(iIntValue), 17, -1987936875};
                byte[] bArr4 = $$d;
                byte b6 = bArr4[14];
                byte b7 = (byte) (b6 + 1);
                Object[] objArr15 = new Object[1];
                e(b6, b7, (byte) (-b7), objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                Object[] objArr16 = new Object[1];
                e((byte) ($$e & 5), bArr4[14], bArr4[7], objArr16);
                objArr = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                int i14 = ((int[]) objArr[0])[0];
                int i15 = ((int[]) objArr[2])[0];
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 37568);
                        int iIndexOf2 = 625 - TextUtils.indexOf("", "", 0, 0);
                        int iMakeMeasureSpec = 14 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        byte[] bArr5 = $$a;
                        byte b8 = bArr5[7];
                        byte b9 = bArr5[5];
                        Object[] objArr17 = new Object[1];
                        c(b8, b9, (byte) (b9 | 50), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionChild, iIndexOf2, iMakeMeasureSpec, -973632554, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr18 = new Object[1];
                        d(new char[]{33545, 28553, 30424, 30391, 23489, 10880, 42047, 27106, 56597, 6384, 18927, 19044, 34537, 52312, 22449, 36674, 37319, 47011, 22989, 36728, 18210, 55021, 1209, 44471}, (Process.myTid() >> 22) + 22, objArr18);
                        Class<?> cls5 = Class.forName((String) objArr18[0]);
                        Object[] objArr19 = new Object[1];
                        d(new char[]{4313, 9459, 56704, 56575, 32966, 19918, 52445, 52520, 46893, 54652, 57299, 18706, 56945, 8071, 20733, 61520, 32068, 45253}, Color.argb(0, 0, 0, 0) + 15, objArr19);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cAlpha = (char) (37567 - Color.alpha(0));
                            int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L) + 626;
                            int iMyTid = (Process.myTid() >> 22) + 14;
                            byte[] bArr6 = $$a;
                            byte b10 = bArr6[7];
                            byte b11 = bArr6[5];
                            Object[] objArr20 = new Object[1];
                            c(b10, b11, (byte) (-b11), objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cAlpha, packedPositionChild2, iMyTid, -976899241, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 37567);
                            int defaultSize = View.getDefaultSize(0, 0) + 625;
                            int fadingEdgeLength = 14 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                            byte[] bArr7 = $$a;
                            byte b12 = bArr7[5];
                            Object[] objArr21 = new Object[1];
                            c(b12, bArr7[7], (byte) (-b12), objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(trimmedLength, defaultSize, fadingEdgeLength, -477065106, false, (String) objArr21[0], null);
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
        if (((int[]) objArr[2])[0] != ((int[]) objArr[0])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 == null) {
                throw null;
            }
            for (String str2 : strArr2) {
                arrayList.add(str2);
            }
            throw null;
        }
        int i16 = ((int[]) objArr[1])[0];
        int i17 = ((int[]) objArr[2])[0];
        int i18 = ((int[]) objArr[0])[0];
        String[] strArr3 = (String[]) objArr[3];
        int iMyPid = Process.myPid();
        int i19 = i16 + (((~(iMyPid | 695023484)) | 1128714636) * 56) + 634408608 + (((~((~iMyPid) | 1128714636)) | 695023484) * 56);
        int i20 = (i19 << 13) ^ i19;
        int i21 = i20 ^ (i20 >>> 17);
        ((int[]) objArr[1])[0] = i21 ^ (i21 << 5);
        Object[] objArr22 = {new int[]{i18}, new int[1], new int[]{i17}, strArr3};
        int i22 = f197a + 87;
        asBinder = i22 % 128;
        if (i22 % 2 != 0) {
            return PreviewDelayWhenVideoCaptureIsBoundQuirk.b(this.b, (BaseModel) obj);
        }
        int i23 = 94 / 0;
        return PreviewDelayWhenVideoCaptureIsBoundQuirk.b(this.b, (BaseModel) obj);
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = asBinder + 15;
        f197a = i2 % 128;
        int i3 = i2 % 2;
        Member[] memberArr = FutureChain.TuitionPaymentFragmentbindingInflater1;
        if (i3 != 0) {
            memberArr[1] = setException.TuitionPaymentFragmentspecialinlinedviewModeldefault3[1];
        } else {
            memberArr[0] = setException.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0];
        }
    }

    private static String $$g(byte b, byte b2, short s) {
        byte[] bArr = $$c;
        int i = b * 2;
        int i2 = 108 - (b2 * 2);
        int i3 = (s * 3) + 4;
        byte[] bArr2 = new byte[i + 1];
        int i4 = -1;
        if (bArr == null) {
            i3++;
            i2 += i3;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i2;
            if (i4 == i) {
                return new String(bArr2, 0);
            }
            byte b3 = bArr[i3];
            i3++;
            i2 += b3;
        }
    }
}

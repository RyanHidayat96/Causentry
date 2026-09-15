package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.datadog.android.rum.RumActionType;
import com.datadog.android.rum.RumErrorSource;
import com.google.android.material.internal.MultiViewUpdateListener;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class PreviewDefaults implements PreviewBuilder {
    private static final byte[] $$c = {6, -86, -9, -124};
    private static final int $$f = 162;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {1, 115, -83, 116, 14, 0, -61, 56, -1, 21, -17, 5, 13, -6, -55, 53, 15, -8, 16, -1, -4, -3, -52, 70, 5, -6, -61, 65, 4, -9, 3, 9, -60, 32, 37, 1, -5, -17, 15, 20, -6, -36, 51, -15, 11, 8, -78, 77, 1, -24, 32, -15, 15, 7, -16, 4, 19, -78, 64};
    private static final int $$e = 39;
    private static final byte[] $$a = {31, 115, -100, -11, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$b = 219;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int g = 1;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 46861;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 8001;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 13577;
    private static char b = 21971;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~(i7 | i4);
        int i9 = (~(i7 | i)) | i8 | (~(i4 | i));
        int i10 = (~((~i4) | i2)) | (~(i2 | i));
        int i11 = (~((~i) | i7)) | i8;
        int i12 = i2 + i4 + i5 + (1821889583 * i3) + ((-349070011) * i6);
        int i13 = i12 * i12;
        int i14 = (575745661 * i2) + 325058560 + (1920428227 * i4) + (i9 * 448227522) + ((-448227522) * i10) + (448227522 * i11) + (1472200704 * i5) + (473956352 * i3) + (1723858944 * i6) + ((-1436549120) * i13);
        int i15 = (i2 * 921699331) + 387174459 + (i4 * 921699517) + (i9 * 62) + (i10 * (-62)) + (i11 * 62) + (i5 * 921699455) + (i3 * 347275089) + (i6 * 1925323067) + (i13 * 94371840);
        int i16 = i14 + (i15 * i15 * (-174063616));
        if (i16 != 1) {
            return i16 != 2 ? TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        LayoutSettings layoutSettings = (LayoutSettings) objArr[1];
        int i17 = 2 % 2;
        int i18 = TuitionPaymentFragmentbindingInflater1 + 31;
        g = i18 % 128;
        int i19 = i18 % 2;
        Intrinsics.checkNotNullParameter(layoutSettings, "");
        int i20 = g + 81;
        TuitionPaymentFragmentbindingInflater1 = i20 % 128;
        int i21 = i20 % 2;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 52
            int r6 = 56 - r6
            int r0 = 53 - r7
            int r8 = r8 * 14
            int r8 = r8 + 84
            byte[] r1 = defpackage.PreviewDefaults.$$a
            byte[] r0 = new byte[r0]
            int r7 = 52 - r7
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2c
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2c:
            int r6 = r6 + 1
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-10)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.PreviewDefaults.a(int, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 + 98
            int r8 = r8 * 55
            int r8 = 56 - r8
            byte[] r0 = defpackage.PreviewDefaults.$$d
            int r7 = r7 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r9
            r5 = r2
            r9 = r7
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            int r7 = r7 + 1
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r6
        L2a:
            int r7 = r7 + r3
            int r7 = r7 + (-2)
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.PreviewDefaults.d(int, int, byte, java.lang.Object[]):void");
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i3 = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i4 = 58224;
            int i5 = 0;
            while (i5 < 16) {
                int i6 = $10 + 105;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i4) ^ ((c2 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(b);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cCombineMeasuredStates = (char) (View.combineMeasuredStates(i3, i3) + 47773);
                        int i10 = (TypedValue.complexToFraction(i3, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i3, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 468;
                        int i11 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cCombineMeasuredStates, i10, i11, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    int i12 = i5;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - ExpandableListView.getPackedPositionType(0L)), View.resolveSizeAndState(0, 0, 0) + 468, 13 - View.MeasureSpec.getSize(0), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5 = i12 + 1;
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
                byte b2 = (byte) 0;
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ImageFormat.getBitsPerPixel(0) + 1), MotionEvent.axisFromString("") + 2324, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 43, -1312321721, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            int i13 = $10 + 35;
            $11 = i13 % 128;
            int i14 = i13 % 2;
        }
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final Map<String, Object> b() {
        int i = 2 % 2;
        int i2 = g + 79;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            MapsKt.emptyMap();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Map<String, Object> mapEmptyMap = MapsKt.emptyMap();
        int i3 = TuitionPaymentFragmentbindingInflater1 + 57;
        g = i3 % 128;
        int i4 = i3 % 2;
        return mapEmptyMap;
    }

    @Override // defpackage.PreviewBuilder
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, RumErrorSource rumErrorSource, Throwable throwable, List<isImageFormatSupported> list) throws Throwable {
        int length;
        Object[] objArr;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = g + 21;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(rumErrorSource, "");
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) (TextUtils.indexOf("", "") + 31533);
            int doubleTapTimeout = 921 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 29;
            byte b2 = $$a[7];
            Object[] objArr3 = new Object[1];
            a(b2, (byte) 52, b2, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, doubleTapTimeout, iIndexOf, -1048449946, false, (String) objArr3[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        c(new char[]{7753, 1692, 5096, 34097, 9153, 63086, 27986, 34406, 47200, 64544, 57871, 20013, 59435, 50131, 54266, 20272, 4865, 31031, 42274, 28793, 62441, 7389, 48122, 43279}, (-16777194) - Color.rgb(0, 0, 0), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        c(new char[]{54907, 22610, 57908, 8257, 19689, 39728, 41154, 38502, 56954, 12582, 55837, 61075, 32593, 27246, 25799, 5579, 27840, 27531}, KeyEvent.keyCodeFromString("") + 15, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 31533);
            int iAlpha = Color.alpha(0) + 921;
            int iIndexOf2 = 28 - TextUtils.indexOf("", "", 0, 0);
            byte[] bArr = $$a;
            byte b3 = bArr[7];
            byte b4 = bArr[80];
            Object[] objArr6 = new Object[1];
            a(b3, b4, b4, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iAlpha, iIndexOf2, -778300370, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31533);
                int i4 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 921;
                int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 28;
                byte[] bArr2 = $$a;
                byte b5 = bArr2[80];
                Object[] objArr7 = new Object[1];
                a(b5, (byte) (-bArr2[33]), b5, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, i4, doubleTapTimeout2, -1142834547, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{((int[]) objArr8[3])[0]}, (String[]) objArr8[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = ~iIdentityHashCode;
            int i6 = (~((-1025087356) | i5)) | 738236192;
            int i7 = ~(iIdentityHashCode | 1035843451);
            int i8 = (((-1293506725) + ((i6 | i7) * (-502))) + ((i7 | (~(i5 | (-286851164)))) * TypedValues.PositionType.TYPE_DRAWPATH)) - 1441408038;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr9 = new Object[1];
            c(new char[]{32091, 52443, 5909, 61022, 15815, 27992, 21958, 21627, 25472, 26760, 42450, 16655, 61460, 6305, 30815, 40118, 2799, 46109, 60062, 59226, 1988, 46218, 13688, 20575, 19515, 42700, 27489, 23270}, (ViewConfiguration.getScrollBarSize() >> 8) + 26, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            c(new char[]{5965, 12916, 47807, 32692, 48714, 29385, 2857, 59866, 26564, 54055, 58048, 27876, 44848, 54532, 44715, 29652, 17597, 41201, 39341, 1663}, 18 - (Process.myPid() >> 22), objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i11 = g + 19;
                TuitionPaymentFragmentbindingInflater1 = i11 % 128;
                if (i11 % 2 != 0) {
                    boolean z = applicationContext instanceof ContextWrapper;
                    obj.hashCode();
                    throw null;
                }
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            if (str != null) {
                int i12 = TuitionPaymentFragmentbindingInflater1 + 117;
                g = i12 % 128;
                if (i12 % 2 == 0) {
                    str.length();
                    obj.hashCode();
                    throw null;
                }
                length = str.length();
            } else {
                length = 0;
            }
            try {
                Object[] objArr11 = {applicationContext, Integer.valueOf(length), 0, -1441408038};
                byte[] bArr3 = $$d;
                Object[] objArr12 = new Object[1];
                d(bArr3[8], bArr3[5], bArr3[0], objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                Object[] objArr13 = new Object[1];
                d((byte) (bArr3[15] + 1), bArr3[0], bArr3[5], objArr13);
                objArr = (Object[]) cls3.getMethod((String) objArr13[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cRgb = (char) (Color.rgb(0, 0, 0) + 16808749);
                    int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 921;
                    int iIndexOf3 = TextUtils.indexOf("", "", 0, 0) + 28;
                    byte[] bArr4 = $$a;
                    byte b6 = bArr4[80];
                    Object[] objArr14 = new Object[1];
                    a(b6, (byte) (-bArr4[33]), b6, objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cRgb, iCombineMeasuredStates, iIndexOf3, -1142834547, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr15 = new Object[1];
                    c(new char[]{7753, 1692, 5096, 34097, 9153, 63086, 27986, 34406, 47200, 64544, 57871, 20013, 59435, 50131, 54266, 20272, 4865, 31031, 42274, 28793, 62441, 7389, 48122, 43279}, 23 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    c(new char[]{54907, 22610, 57908, 8257, 19689, 39728, 41154, 38502, 56954, 12582, 55837, 61075, 32593, 27246, 25799, 5579, 27840, 27531}, 15 - Color.argb(0, 0, 0, 0), objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cCombineMeasuredStates = (char) (31533 - View.combineMeasuredStates(0, 0));
                        int iIndexOf4 = 920 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        int i13 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 28;
                        byte[] bArr5 = $$a;
                        byte b7 = bArr5[7];
                        byte b8 = bArr5[80];
                        Object[] objArr17 = new Object[1];
                        a(b7, b8, b8, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cCombineMeasuredStates, iIndexOf4, i13, -778300370, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 31533);
                        int iMyTid = 921 - (Process.myTid() >> 22);
                        int i14 = 28 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        byte b9 = $$a[7];
                        Object[] objArr18 = new Object[1];
                        a(b9, (byte) 52, b9, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollBarSize, iMyTid, i14, -1048449946, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        int i15 = ((int[]) objArr[1])[0];
        int i16 = ((int[]) objArr[3])[0];
        if (i16 == i15) {
            int i17 = g + 59;
            TuitionPaymentFragmentbindingInflater1 = i17 % 128;
            int i18 = i17 % 2;
            int i19 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i20 = ~iIdentityHashCode2;
            int i21 = (~((-701596620) | i20)) | 700482240;
            int i22 = ~(iIdentityHashCode2 | 1073597403);
            int i23 = i19 + 1228845851 + ((i21 | i22) * (-502)) + ((i22 | (~(i20 | (-1114380)))) * TypedValues.PositionType.TYPE_DRAWPATH);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr2[0])[0] = i25 ^ (i25 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                int i26 = TuitionPaymentFragmentbindingInflater1 + 105;
                g = i26 % 128;
                int i27 = i26 % 2;
                for (String str2 : strArr) {
                    arrayList.add(str2);
                }
            }
            Toast.makeText((Context) null, i16 / (((i16 - 1) * i16) % 2), 0).show();
            int i28 = ((int[]) objArr[0])[0];
            objArr2 = new Object[]{new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iNextInt = new Random().nextInt(182352906);
            int i29 = ~iNextInt;
            int i30 = (~((-1742094646) | i29)) | 29360420;
            int i31 = ~(iNextInt | 1744719223);
            int i32 = i28 + ((i30 | i31) * (-252)) + 582970891 + ((i31 | (~(i29 | (-1712734226)))) * 252);
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr2[0])[0] = i34 ^ (i34 << 5);
        }
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        int i35 = ((int[]) objArr2[0])[0];
        int i36 = i35 * i35;
        int i37 = -(2116245251 * i35);
        int i38 = (((i36 & i37) + (i36 | i37)) - (~(-(i35 * (-691085255))))) - 162089597;
        int i39 = i38 >> 16;
        int i40 = i38 >> 27;
        int i41 = (((i40 | (-63)) << 1) - (i40 ^ (-63))) / 32;
        int i42 = -(((i38 - (~(((((-131071) ^ i39) + ((i39 & (-131071)) << 1)) / 65536) + 1))) - 1) ^ (((i41 | 1) << 1) - (i41 ^ 1)));
        int i43 = ((i42 | 6) << 1) - (i42 ^ 6);
        int i44 = i43 >> 22;
        int i45 = ((i44 ^ (-2047)) + ((i44 & (-2047)) << 1)) / 1024;
        Intrinsics.checkNotNullParameter(list, "6,16,13,7,threads".substring(110160 / (((-(((i45 ^ 1) + ((i45 & 1) << 1)) + 1)) & i43) * 1836)));
        int i46 = g + 49;
        TuitionPaymentFragmentbindingInflater1 = i46 % 128;
        int i47 = i46 % 2;
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final dequeImageProxy TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 101;
        TuitionPaymentFragmentbindingInflater1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 117;
        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void addAction(RumActionType rumActionType, String str, Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 115;
        g = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(rumActionType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        int i4 = TuitionPaymentFragmentbindingInflater1 + 55;
        g = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, RumErrorSource rumErrorSource, Throwable th, Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = g + 87;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(rumErrorSource, "");
        Intrinsics.checkNotNullParameter(map, "");
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, RumErrorSource rumErrorSource, String str2, Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 105;
        g = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(rumErrorSource, "");
        if (i3 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            int i4 = 57 / 0;
        }
    }

    @Override // defpackage.PreviewBuilder
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(long j, String str) {
        int i = 2 % 2;
        int i2 = g + 119;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        int i4 = g + 93;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // defpackage.PreviewBuilder
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, onSurfaceRequested onsurfacerequested) {
        int i = 2 % 2;
        int i2 = g + 95;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(onsurfacerequested, "");
        int i4 = TuitionPaymentFragmentbindingInflater1 + 67;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 5 / 0;
        }
    }

    @Override // defpackage.PreviewBuilder
    public final void TuitionPaymentFragmentbindingInflater1(String str, onSurfaceRequested onsurfacerequested) {
        int i = 2 % 2;
        int i2 = g + 35;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(onsurfacerequested, "");
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.PreviewBuilder
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(LayoutSettings layoutSettings) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this, layoutSettings}, -1127962053, MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1127962054, MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // defpackage.PreviewBuilder
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, -1278228506, MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1278228508, MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // defpackage.PreviewBuilder
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, String str2) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 77;
        g = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(RumActionType rumActionType, String str, Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentbindingInflater1 + 115;
        g = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(rumActionType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = g + 89;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void b(Object obj, String str, Map<String, ? extends Object> map) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this, obj, str, map}, -540561395, MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 540561395, MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), MultiViewUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void TuitionPaymentFragmentbindingInflater1(RumActionType rumActionType, String str, Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = g + 71;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(rumActionType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        int i4 = g + 15;
        TuitionPaymentFragmentbindingInflater1 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object obj, Map<String, ? extends Object> map) {
        int i = 2 % 2;
        int i2 = g + 125;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(map, "");
        int i4 = TuitionPaymentFragmentbindingInflater1 + 107;
        g = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        Object obj = objArr[1];
        String str = (String) objArr[2];
        Map map = (Map) objArr[3];
        int i = 2 % 2;
        int i2 = g + 5;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (i3 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            return null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        int i = 2 % 2;
        int i2 = g + 79;
        TuitionPaymentFragmentbindingInflater1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 24 / 0;
        }
        return null;
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
    private static java.lang.String $$g(short r5, byte r6, int r7) {
        /*
            byte[] r0 = defpackage.PreviewDefaults.$$c
            int r6 = r6 * 3
            int r1 = r6 + 1
            int r7 = r7 * 2
            int r7 = 4 - r7
            int r5 = r5 * 4
            int r5 = r5 + 108
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r6
            r3 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L22:
            int r3 = r3 + 1
            r4 = r0[r7]
        L26:
            int r4 = -r4
            int r5 = r5 + r4
            int r7 = r7 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.PreviewDefaults.$$g(short, byte, int):java.lang.String");
    }
}

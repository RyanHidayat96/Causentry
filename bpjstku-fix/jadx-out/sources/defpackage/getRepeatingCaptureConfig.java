package defpackage;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.qrcode.decoder.DataMask;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;
import kotlin.UByte;

/* JADX INFO: loaded from: classes6.dex */
public final class getRepeatingCaptureConfig {
    private final getDefaultResolution TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new getDefaultResolution(ImageInputConfigBuilder.f156a);
    private static final byte[] $$d = {25, 31, 20, 1, 10, -4, -65, 52, -5, 17, -21, 1, 9, -10, -59, 49, 11, -12, 12, -5, -8, -7, -56, 66, 1, -10, -65, 57, 3, 4, -17, 11, -6, -15, 9, -64, 52, 9, -4, -14, 6, 3, -66, 67, -18, 10, -1, -13, -57, 34, 33, -10, -46, 32, 15, -13, 4, -3, -29, 14, 10, -1, -13, -67, 77, -16, 7, -12, -37, 32, 15, -13, 4, -3, -76, 12, -16, 12, 31, -14, 9, -13, 4, -3, -32, 15, 22, -14, -10, 7, 4, -48, 42, -19, 4, 4, -10, 7, 4, -20, 5, 3, -12, 3, 3, -9, -32, 35, -10, 4, -13, 17, -17, 11, -67};
    private static final int $$e = 93;
    private static final byte[] $$a = {56, 94, 119, -19, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 210;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.getRepeatingCaptureConfig.$$a
            int r6 = r6 * 52
            int r6 = r6 + 4
            int r8 = r8 * 15
            int r8 = r8 + 38
            int r7 = r7 * 2
            int r7 = 84 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r7 = r8
            r4 = r2
            goto L29
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r0[r6]
        L29:
            int r6 = r6 + 1
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getRepeatingCaptureConfig.a(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r7 = r7 * 15
            int r7 = 99 - r7
            byte[] r0 = defpackage.getRepeatingCaptureConfig.$$d
            int r8 = r8 * 37
            int r8 = r8 + 38
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r6
            r4 = r8
            r3 = r2
            goto L2c
        L15:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L19:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r7 = r7 + 1
            int r3 = r3 + 1
            if (r3 != r8) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            r4 = r0[r7]
        L2c:
            int r6 = r6 + r4
            int r6 = r6 + 2
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getRepeatingCaptureConfig.b(short, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002e A[Catch: ChecksumException -> 0x0427, ChecksumException | FormatException -> 0x042b, TRY_ENTER, TryCatch #8 {ChecksumException | FormatException -> 0x042b, blocks: (B:10:0x001e, B:13:0x002e, B:14:0x0068, B:16:0x0090), top: B:80:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0090 A[Catch: ChecksumException -> 0x0427, ChecksumException | FormatException -> 0x042b, TRY_LEAVE, TryCatch #8 {ChecksumException | FormatException -> 0x042b, blocks: (B:10:0x001e, B:13:0x002e, B:14:0x0068, B:16:0x0090), top: B:80:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:19:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:22:0x00ee A[Catch: ChecksumException -> 0x0423, FormatException -> 0x0425, TryCatch #7 {ChecksumException -> 0x0423, FormatException -> 0x0425, blocks: (B:18:0x00bb, B:20:0x00d4, B:22:0x00ee, B:24:0x00f7, B:25:0x013a, B:41:0x0350, B:43:0x0360, B:45:0x03c6, B:46:0x03d9, B:48:0x03f5, B:51:0x0403, B:53:0x0406, B:54:0x040e, B:55:0x0413, B:26:0x01ab, B:29:0x023a, B:31:0x0240, B:32:0x0280, B:33:0x0286, B:34:0x029d, B:36:0x02aa, B:37:0x02ef, B:39:0x0305, B:40:0x0349, B:56:0x0414, B:57:0x0419, B:59:0x041b, B:61:0x0421, B:62:0x0422, B:27:0x01ce), top: B:82:0x00bb, inners: #1, #4 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x00f7 A[Catch: ChecksumException -> 0x0423, FormatException -> 0x0425, TryCatch #7 {ChecksumException -> 0x0423, FormatException -> 0x0425, blocks: (B:18:0x00bb, B:20:0x00d4, B:22:0x00ee, B:24:0x00f7, B:25:0x013a, B:41:0x0350, B:43:0x0360, B:45:0x03c6, B:46:0x03d9, B:48:0x03f5, B:51:0x0403, B:53:0x0406, B:54:0x040e, B:55:0x0413, B:26:0x01ab, B:29:0x023a, B:31:0x0240, B:32:0x0280, B:33:0x0286, B:34:0x029d, B:36:0x02aa, B:37:0x02ef, B:39:0x0305, B:40:0x0349, B:56:0x0414, B:57:0x0419, B:59:0x041b, B:61:0x0421, B:62:0x0422, B:27:0x01ce), top: B:82:0x00bb, inners: #1, #4 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x01ab A[Catch: ChecksumException -> 0x0423, FormatException -> 0x0425, TRY_LEAVE, TryCatch #7 {ChecksumException -> 0x0423, FormatException -> 0x0425, blocks: (B:18:0x00bb, B:20:0x00d4, B:22:0x00ee, B:24:0x00f7, B:25:0x013a, B:41:0x0350, B:43:0x0360, B:45:0x03c6, B:46:0x03d9, B:48:0x03f5, B:51:0x0403, B:53:0x0406, B:54:0x040e, B:55:0x0413, B:26:0x01ab, B:29:0x023a, B:31:0x0240, B:32:0x0280, B:33:0x0286, B:34:0x029d, B:36:0x02aa, B:37:0x02ef, B:39:0x0305, B:40:0x0349, B:56:0x0414, B:57:0x0419, B:59:0x041b, B:61:0x0421, B:62:0x0422, B:27:0x01ce), top: B:82:0x00bb, inners: #1, #4 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0240 A[Catch: ChecksumException -> 0x0423, FormatException -> 0x0425, TryCatch #7 {ChecksumException -> 0x0423, FormatException -> 0x0425, blocks: (B:18:0x00bb, B:20:0x00d4, B:22:0x00ee, B:24:0x00f7, B:25:0x013a, B:41:0x0350, B:43:0x0360, B:45:0x03c6, B:46:0x03d9, B:48:0x03f5, B:51:0x0403, B:53:0x0406, B:54:0x040e, B:55:0x0413, B:26:0x01ab, B:29:0x023a, B:31:0x0240, B:32:0x0280, B:33:0x0286, B:34:0x029d, B:36:0x02aa, B:37:0x02ef, B:39:0x0305, B:40:0x0349, B:56:0x0414, B:57:0x0419, B:59:0x041b, B:61:0x0421, B:62:0x0422, B:27:0x01ce), top: B:82:0x00bb, inners: #1, #4 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x02aa A[Catch: ChecksumException -> 0x0423, FormatException -> 0x0425, TryCatch #7 {ChecksumException -> 0x0423, FormatException -> 0x0425, blocks: (B:18:0x00bb, B:20:0x00d4, B:22:0x00ee, B:24:0x00f7, B:25:0x013a, B:41:0x0350, B:43:0x0360, B:45:0x03c6, B:46:0x03d9, B:48:0x03f5, B:51:0x0403, B:53:0x0406, B:54:0x040e, B:55:0x0413, B:26:0x01ab, B:29:0x023a, B:31:0x0240, B:32:0x0280, B:33:0x0286, B:34:0x029d, B:36:0x02aa, B:37:0x02ef, B:39:0x0305, B:40:0x0349, B:56:0x0414, B:57:0x0419, B:59:0x041b, B:61:0x0421, B:62:0x0422, B:27:0x01ce), top: B:82:0x00bb, inners: #1, #4 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0305 A[Catch: ChecksumException -> 0x0423, FormatException -> 0x0425, TryCatch #7 {ChecksumException -> 0x0423, FormatException -> 0x0425, blocks: (B:18:0x00bb, B:20:0x00d4, B:22:0x00ee, B:24:0x00f7, B:25:0x013a, B:41:0x0350, B:43:0x0360, B:45:0x03c6, B:46:0x03d9, B:48:0x03f5, B:51:0x0403, B:53:0x0406, B:54:0x040e, B:55:0x0413, B:26:0x01ab, B:29:0x023a, B:31:0x0240, B:32:0x0280, B:33:0x0286, B:34:0x029d, B:36:0x02aa, B:37:0x02ef, B:39:0x0305, B:40:0x0349, B:56:0x0414, B:57:0x0419, B:59:0x041b, B:61:0x0421, B:62:0x0422, B:27:0x01ce), top: B:82:0x00bb, inners: #1, #4 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0360 A[Catch: ChecksumException -> 0x0423, FormatException -> 0x0425, TryCatch #7 {ChecksumException -> 0x0423, FormatException -> 0x0425, blocks: (B:18:0x00bb, B:20:0x00d4, B:22:0x00ee, B:24:0x00f7, B:25:0x013a, B:41:0x0350, B:43:0x0360, B:45:0x03c6, B:46:0x03d9, B:48:0x03f5, B:51:0x0403, B:53:0x0406, B:54:0x040e, B:55:0x0413, B:26:0x01ab, B:29:0x023a, B:31:0x0240, B:32:0x0280, B:33:0x0286, B:34:0x029d, B:36:0x02aa, B:37:0x02ef, B:39:0x0305, B:40:0x0349, B:56:0x0414, B:57:0x0419, B:59:0x041b, B:61:0x0421, B:62:0x0422, B:27:0x01ce), top: B:82:0x00bb, inners: #1, #4 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x03c6 A[Catch: ChecksumException -> 0x0423, FormatException -> 0x0425, TryCatch #7 {ChecksumException -> 0x0423, FormatException -> 0x0425, blocks: (B:18:0x00bb, B:20:0x00d4, B:22:0x00ee, B:24:0x00f7, B:25:0x013a, B:41:0x0350, B:43:0x0360, B:45:0x03c6, B:46:0x03d9, B:48:0x03f5, B:51:0x0403, B:53:0x0406, B:54:0x040e, B:55:0x0413, B:26:0x01ab, B:29:0x023a, B:31:0x0240, B:32:0x0280, B:33:0x0286, B:34:0x029d, B:36:0x02aa, B:37:0x02ef, B:39:0x0305, B:40:0x0349, B:56:0x0414, B:57:0x0419, B:59:0x041b, B:61:0x0421, B:62:0x0422, B:27:0x01ce), top: B:82:0x00bb, inners: #1, #4 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x03f5 A[Catch: ChecksumException -> 0x0423, FormatException -> 0x0425, TryCatch #7 {ChecksumException -> 0x0423, FormatException -> 0x0425, blocks: (B:18:0x00bb, B:20:0x00d4, B:22:0x00ee, B:24:0x00f7, B:25:0x013a, B:41:0x0350, B:43:0x0360, B:45:0x03c6, B:46:0x03d9, B:48:0x03f5, B:51:0x0403, B:53:0x0406, B:54:0x040e, B:55:0x0413, B:26:0x01ab, B:29:0x023a, B:31:0x0240, B:32:0x0280, B:33:0x0286, B:34:0x029d, B:36:0x02aa, B:37:0x02ef, B:39:0x0305, B:40:0x0349, B:56:0x0414, B:57:0x0419, B:59:0x041b, B:61:0x0421, B:62:0x0422, B:27:0x01ce), top: B:82:0x00bb, inners: #1, #4 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0402  */
    /* JADX WARN: Code duplicated, block: B:53:0x0406 A[Catch: ChecksumException -> 0x0423, FormatException -> 0x0425, LOOP:0: B:51:0x0403->B:53:0x0406, LOOP_END, TryCatch #7 {ChecksumException -> 0x0423, FormatException -> 0x0425, blocks: (B:18:0x00bb, B:20:0x00d4, B:22:0x00ee, B:24:0x00f7, B:25:0x013a, B:41:0x0350, B:43:0x0360, B:45:0x03c6, B:46:0x03d9, B:48:0x03f5, B:51:0x0403, B:53:0x0406, B:54:0x040e, B:55:0x0413, B:26:0x01ab, B:29:0x023a, B:31:0x0240, B:32:0x0280, B:33:0x0286, B:34:0x029d, B:36:0x02aa, B:37:0x02ef, B:39:0x0305, B:40:0x0349, B:56:0x0414, B:57:0x0419, B:59:0x041b, B:61:0x0421, B:62:0x0422, B:27:0x01ce), top: B:82:0x00bb, inners: #1, #4 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x042f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x0431  */
    /* JADX WARN: Code duplicated, block: B:74:0x0432  */
    /* JADX WARN: Code duplicated, block: B:75:0x0433  */
    public final getCaptureBundle TuitionPaymentFragmentbindingInflater1(getBufferFormat getbufferformat, Map<DecodeHintType, ?> map) throws ChecksumException, FormatException {
        FormatException formatException;
        ChecksumException checksumException;
        ChecksumException checksumException2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        long j;
        long jLongValue;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        Object[] objArr;
        ArrayList arrayList;
        String[] strArr;
        int i;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8;
        getRepeatingCameraCaptureCallbacks getrepeatingcameracapturecallbacks = new getRepeatingCameraCaptureCallbacks(getbufferformat);
        try {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(getrepeatingcameracapturecallbacks, map);
        } catch (ChecksumException e2) {
            checksumException = e2;
            formatException = null;
            try {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cIndexOf = (char) (43042 - TextUtils.indexOf("", "", 0, 0));
                    int scrollBarSize = 3111 - (ViewConfiguration.getScrollBarSize() >> 8);
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 23;
                    byte[] bArr = $$a;
                    byte b = bArr[7];
                    Object[] objArr2 = new Object[1];
                    a(b, b, bArr[132], objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, scrollBarSize, iIndexOf, -1272852037, false, (String) objArr2[0], null);
                }
                j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                jLongValue = ((Long) Class.forName("android.os.SystemClock").getDeclaredMethod("elapsedRealtime", new Class[0]).invoke(null, new Object[0])).longValue();
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 43042);
                    int gidForName = 3110 - Process.getGidForName("");
                    int packedPositionGroup = 22 - ExpandableListView.getPackedPositionGroup(0L);
                    byte[] bArr2 = $$a;
                    byte b2 = bArr2[132];
                    checksumException2 = checksumException;
                    try {
                        Object[] objArr3 = new Object[1];
                        a(b2, bArr2[7], b2, objArr3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maximumDrawingCacheSize, gidForName, packedPositionGroup, -1269618118, false, (String) objArr3[0], null);
                    } catch (ChecksumException e3) {
                        e = e3;
                        if (formatException == null) {
                            throw formatException;
                        }
                        if (checksumException2 != null) {
                            throw checksumException2;
                        }
                        throw e;
                    } catch (FormatException e4) {
                        e = e4;
                        if (formatException == null) {
                            throw formatException;
                        }
                        if (checksumException2 != null) {
                            throw checksumException2;
                        }
                        throw e;
                    }
                } else {
                    checksumException2 = checksumException;
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43041);
                        int i2 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3110;
                        int i3 = 22 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        byte[] bArr3 = $$a;
                        byte b3 = bArr3[37];
                        byte b4 = bArr3[7];
                        Object[] objArr4 = new Object[1];
                        a(b3, b4, b4, objArr4);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, i2, i3, 154975793, false, (String) objArr4[0], null);
                    }
                    Object[] objArr5 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null);
                    int i4 = ((int[]) objArr5[2])[0];
                    int i5 = ((int[]) objArr5[1])[0];
                    String[] strArr2 = (String[]) objArr5[3];
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i6 = ((((-1272411950) + (((~((-1473956313) | iIdentityHashCode)) | 96520520) * 336)) + (((~(iIdentityHashCode | 231075146)) | (-1608510939)) * (-168))) + (((~((~iIdentityHashCode) | 231075146)) | (-1473956313)) * 168)) - 456316199;
                    int i7 = (i6 << 13) ^ i6;
                    int i8 = i7 ^ (i7 >>> 17);
                    ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
                    objArr = new Object[]{new int[1], new int[]{i5}, new int[]{i4}, strArr2};
                } else {
                    try {
                        Object[] objArr6 = {null, Integer.valueOf(((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, getrepeatingcameracapturecallbacks)).intValue()), 0, -456316199};
                        byte[] bArr4 = $$d;
                        byte b5 = bArr4[46];
                        Object[] objArr7 = new Object[1];
                        b(b5, (byte) (b5 + 1), bArr4[3], objArr7);
                        Class<?> cls = Class.forName((String) objArr7[0]);
                        byte b6 = (byte) ($$e & 491);
                        byte b7 = bArr4[3];
                        Object[] objArr8 = new Object[1];
                        b(b6, b7, (byte) (b7 - 1), objArr8);
                        Object[] objArr9 = (Object[]) cls.getMethod((String) objArr8[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 43042);
                            int longPressTimeout = 3111 - (ViewConfiguration.getLongPressTimeout() >> 16);
                            int i9 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 21;
                            byte[] bArr5 = $$a;
                            byte b8 = bArr5[37];
                            byte b9 = bArr5[7];
                            Object[] objArr10 = new Object[1];
                            a(b8, b9, b9, objArr10);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cKeyCodeFromString, longPressTimeout, i9, 154975793, false, (String) objArr10[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArr9);
                        try {
                            long jLongValue2 = ((Long) Class.forName("android.os.SystemClock").getDeclaredMethod("elapsedRealtime", new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char c2 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43041);
                                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 3111;
                                int i10 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22;
                                byte[] bArr6 = $$a;
                                byte b10 = bArr6[132];
                                Object[] objArr11 = new Object[1];
                                a(b10, bArr6[7], b10, objArr11);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, tapTimeout, i10, -1269618118, false, (String) objArr11[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 43042);
                                int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 3111;
                                int i11 = 22 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                byte[] bArr7 = $$a;
                                byte b11 = bArr7[7];
                                Object[] objArr12 = new Object[1];
                                a(b11, b11, bArr7[132], objArr12);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maxKeyCode, touchSlop, i11, -1272852037, false, (String) objArr12[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf2);
                            objArr = objArr9;
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                if (((int[]) objArr[2])[0] == ((int[]) objArr[1])[0]) {
                    int i12 = ((int[]) objArr[0])[0];
                    int i13 = ((int[]) objArr[2])[0];
                    int i14 = ((int[]) objArr[1])[0];
                    String[] strArr3 = (String[]) objArr[3];
                    int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                    int i15 = i12 + (((1377091058 + (((-17573377) | startElapsedRealtime) * (-381))) + (((~((~startElapsedRealtime) | 846448921)) | (-23013137)) * 381)) - 1894478336);
                    int i16 = (i15 << 13) ^ i15;
                    int i17 = i16 ^ (i16 >>> 17);
                    ((int[]) objArr[0])[0] = i17 ^ (i17 << 5);
                    Object[] objArr13 = {new int[1], new int[]{i14}, new int[]{i13}, strArr3};
                    if (getrepeatingcameracapturecallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                        DataMask.values()[getrepeatingcameracapturecallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3].b(getrepeatingcameracapturecallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault1, getrepeatingcameracapturecallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b);
                    }
                    getrepeatingcameracapturecallbacks.b = null;
                    getrepeatingcameracapturecallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                    getrepeatingcameracapturecallbacks.TuitionPaymentFragmentbindingInflater1 = true;
                    getrepeatingcameracapturecallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    getrepeatingcameracapturecallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    getrepeatingcameracapturecallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    getCaptureBundle getcapturebundleTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(getrepeatingcameracapturecallbacks, map);
                    getcapturebundleTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1 = new addAllRepeatingCameraCaptureCallbacks();
                    return getcapturebundleTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                }
                arrayList = new ArrayList();
                strArr = (String[]) objArr[3];
                if (strArr != null) {
                    for (String str : strArr) {
                        arrayList.add(str);
                    }
                }
                throw new NullPointerException();
            } catch (ChecksumException | FormatException e5) {
                e = e5;
                checksumException2 = checksumException;
            }
        } catch (FormatException e6) {
            formatException = e6;
            checksumException = null;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cIndexOf2 = (char) (43042 - TextUtils.indexOf("", "", 0, 0));
                int scrollBarSize2 = 3111 - (ViewConfiguration.getScrollBarSize() >> 8);
                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 23;
                byte[] bArr8 = $$a;
                byte b12 = bArr8[7];
                Object[] objArr14 = new Object[1];
                a(b12, b12, bArr8[132], objArr14);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf2, scrollBarSize2, iIndexOf2, -1272852037, false, (String) objArr14[0], null);
            }
            j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            jLongValue = ((Long) Class.forName("android.os.SystemClock").getDeclaredMethod("elapsedRealtime", new Class[0]).invoke(null, new Object[0])).longValue();
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char maximumDrawingCacheSize2 = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 43042);
                int gidForName2 = 3110 - Process.getGidForName("");
                int packedPositionGroup2 = 22 - ExpandableListView.getPackedPositionGroup(0L);
                byte[] bArr9 = $$a;
                byte b13 = bArr9[132];
                checksumException2 = checksumException;
                Object[] objArr15 = new Object[1];
                a(b13, bArr9[7], b13, objArr15);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maximumDrawingCacheSize2, gidForName2, packedPositionGroup2, -1269618118, false, (String) objArr15[0], null);
            } else {
                checksumException2 = checksumException;
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char c3 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43041);
                    int i18 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3110;
                    int i19 = 22 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    byte[] bArr10 = $$a;
                    byte b14 = bArr10[37];
                    byte b15 = bArr10[7];
                    Object[] objArr16 = new Object[1];
                    a(b14, b15, b15, objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c3, i18, i19, 154975793, false, (String) objArr16[0], null);
                }
                Object[] objArr17 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null);
                int i20 = ((int[]) objArr17[2])[0];
                int i21 = ((int[]) objArr17[1])[0];
                String[] strArr4 = (String[]) objArr17[3];
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i22 = ((((-1272411950) + (((~((-1473956313) | iIdentityHashCode2)) | 96520520) * 336)) + (((~(iIdentityHashCode2 | 231075146)) | (-1608510939)) * (-168))) + (((~((~iIdentityHashCode2) | 231075146)) | (-1473956313)) * 168)) - 456316199;
                int i23 = (i22 << 13) ^ i22;
                int i24 = i23 ^ (i23 >>> 17);
                ((int[]) objArr[0])[0] = i24 ^ (i24 << 5);
                objArr = new Object[]{new int[1], new int[]{i21}, new int[]{i20}, strArr4};
            } else {
                Object[] objArr18 = {null, Integer.valueOf(((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, getrepeatingcameracapturecallbacks)).intValue()), 0, -456316199};
                byte[] bArr11 = $$d;
                byte b16 = bArr11[46];
                Object[] objArr19 = new Object[1];
                b(b16, (byte) (b16 + 1), bArr11[3], objArr19);
                Class<?> cls2 = Class.forName((String) objArr19[0]);
                byte b17 = (byte) ($$e & 491);
                byte b18 = bArr11[3];
                Object[] objArr20 = new Object[1];
                b(b17, b18, (byte) (b18 - 1), objArr20);
                Object[] objArr21 = (Object[]) cls2.getMethod((String) objArr20[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr18);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cKeyCodeFromString2 = (char) (KeyEvent.keyCodeFromString("") + 43042);
                    int longPressTimeout2 = 3111 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    int i25 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 21;
                    byte[] bArr12 = $$a;
                    byte b19 = bArr12[37];
                    byte b20 = bArr12[7];
                    Object[] objArr110 = new Object[1];
                    a(b19, b20, b20, objArr110);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cKeyCodeFromString2, longPressTimeout2, i25, 154975793, false, (String) objArr110[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).set(null, objArr21);
                long jLongValue3 = ((Long) Class.forName("android.os.SystemClock").getDeclaredMethod("elapsedRealtime", new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf3 = Long.valueOf(jLongValue3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c4 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43041);
                    int tapTimeout2 = (ViewConfiguration.getTapTimeout() >> 16) + 3111;
                    int i110 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22;
                    byte[] bArr13 = $$a;
                    byte b110 = bArr13[132];
                    Object[] objArr111 = new Object[1];
                    a(b110, bArr13[7], b110, objArr111);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c4, tapTimeout2, i110, -1269618118, false, (String) objArr111[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, lValueOf3);
                Long lValueOf4 = Long.valueOf(jLongValue3 >> 12);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char maxKeyCode2 = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 43042);
                    int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 3111;
                    int i111 = 22 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    byte[] bArr14 = $$a;
                    byte b111 = bArr14[7];
                    Object[] objArr112 = new Object[1];
                    a(b111, b111, bArr14[132], objArr112);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maxKeyCode2, touchSlop2, i111, -1272852037, false, (String) objArr112[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf4);
                objArr = objArr21;
            }
            if (((int[]) objArr[2])[0] == ((int[]) objArr[1])[0]) {
                int i112 = ((int[]) objArr[0])[0];
                int i113 = ((int[]) objArr[2])[0];
                int i114 = ((int[]) objArr[1])[0];
                String[] strArr5 = (String[]) objArr[3];
                int startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
                int i115 = i112 + (((1377091058 + (((-17573377) | startElapsedRealtime2) * (-381))) + (((~((~startElapsedRealtime2) | 846448921)) | (-23013137)) * 381)) - 1894478336);
                int i116 = (i115 << 13) ^ i115;
                int i117 = i116 ^ (i116 >>> 17);
                ((int[]) objArr13[0])[0] = i117 ^ (i117 << 5);
                Object[] objArr113 = {new int[1], new int[]{i114}, new int[]{i113}, strArr5};
                if (getrepeatingcameracapturecallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                    DataMask.values()[getrepeatingcameracapturecallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3].b(getrepeatingcameracapturecallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault1, getrepeatingcameracapturecallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b);
                }
                getrepeatingcameracapturecallbacks.b = null;
                getrepeatingcameracapturecallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                getrepeatingcameracapturecallbacks.TuitionPaymentFragmentbindingInflater1 = true;
                getrepeatingcameracapturecallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                getrepeatingcameracapturecallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                getrepeatingcameracapturecallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                getCaptureBundle getcapturebundleTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(getrepeatingcameracapturecallbacks, map);
                getcapturebundleTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1 = new addAllRepeatingCameraCaptureCallbacks();
                return getcapturebundleTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
            arrayList = new ArrayList();
            strArr = (String[]) objArr[3];
            if (strArr != null) {
                while (i < strArr.length) {
                    arrayList.add(str);
                }
            }
            throw new NullPointerException();
        }
    }

    private getCaptureBundle TuitionPaymentFragmentspecialinlinedviewModeldefault2(getRepeatingCameraCaptureCallbacks getrepeatingcameracapturecallbacks, Map<DecodeHintType, ?> map) throws ChecksumException, FormatException {
        getBufferFormat getbufferformat;
        SessionConfigBuilder sessionConfigBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getrepeatingcameracapturecallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        ErrorCorrectionLevel errorCorrectionLevel = getrepeatingcameracapturecallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentbindingInflater1;
        addAllDeviceStateCallbacks addalldevicestatecallbacksTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getrepeatingcameracapturecallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        SessionConfigBuilder sessionConfigBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getrepeatingcameracapturecallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        DataMask dataMask = DataMask.values()[addalldevicestatecallbacksTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
        int i = getrepeatingcameracapturecallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b;
        dataMask.b(getrepeatingcameracapturecallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault1, i);
        int i2 = sessionConfigBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 * 4;
        getBufferFormat getbufferformat2 = new getBufferFormat(i2 + 17);
        int i3 = 0;
        getbufferformat2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0, 0, 9, 9);
        int i4 = i2 + 9;
        getbufferformat2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4, 0, 8, 9);
        getbufferformat2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0, i4, 9, 8);
        int length = sessionConfigBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.length;
        int i5 = 0;
        while (true) {
            int i6 = 2;
            if (i5 >= length) {
                break;
            }
            int i7 = sessionConfigBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2[i5];
            int i8 = 0;
            while (i8 < length) {
                if ((i5 != 0 || (i8 != 0 && i8 != length - 1)) && (i5 != length - 1 || i8 != 0)) {
                    getbufferformat2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2[i8] - i6, i7 - 2, 5, 5);
                }
                i8++;
                i6 = 2;
            }
            i5++;
        }
        int i9 = 6;
        getbufferformat2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(6, 9, 1, i2);
        getbufferformat2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(9, 6, i2, 1);
        if (sessionConfigBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 > 6) {
            int i10 = i2 + 6;
            getbufferformat2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i10, 0, 3, 6);
            getbufferformat2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0, i10, 6, 3);
        }
        int i11 = sessionConfigBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        byte[] bArr = new byte[i11];
        int i12 = i - 1;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        boolean z = true;
        int i16 = i12;
        while (i16 > 0) {
            if (i16 == i9) {
                i16--;
            }
            int i17 = i3;
            while (i17 < i) {
                int i18 = z ? i12 - i17 : i17;
                int i19 = i;
                while (i3 < 2) {
                    int i20 = i16 - i3;
                    if (getbufferformat2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i20, i18)) {
                        getbufferformat = getbufferformat2;
                    } else {
                        i14++;
                        int i21 = i15 << 1;
                        getbufferformat = getbufferformat2;
                        int i22 = getrepeatingcameracapturecallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i20, i18) ? i21 | 1 : i21;
                        if (i14 == 8) {
                            bArr[i13] = (byte) i22;
                            i13++;
                            i14 = 0;
                            i15 = 0;
                        } else {
                            i15 = i22;
                        }
                    }
                    i3++;
                    getbufferformat2 = getbufferformat;
                }
                i17++;
                i = i19;
                getbufferformat2 = getbufferformat2;
                i3 = 0;
            }
            z = !z;
            i16 -= 2;
            getbufferformat2 = getbufferformat2;
            i3 = 0;
            i9 = 6;
        }
        if (i13 != sessionConfigBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
        if (i11 != sessionConfigBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            throw new IllegalArgumentException();
        }
        SessionConfigBuilder.b bVar = sessionConfigBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault2.b[errorCorrectionLevel.ordinal()];
        SessionConfigBuilder.TuitionPaymentFragmentbindingInflater1[] tuitionPaymentFragmentbindingInflater1Arr = bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i23 = 0;
        for (SessionConfigBuilder.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 : tuitionPaymentFragmentbindingInflater1Arr) {
            i23 += tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        getOutputConfigs[] getoutputconfigsArr = new getOutputConfigs[i23];
        int i24 = 0;
        for (SessionConfigBuilder.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater2 : tuitionPaymentFragmentbindingInflater1Arr) {
            int i25 = 0;
            while (i25 < tuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                int i26 = tuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                getoutputconfigsArr[i24] = new getOutputConfigs(i26, new byte[bVar.b + i26]);
                i25++;
                i24++;
            }
        }
        int length2 = getoutputconfigsArr[0].TuitionPaymentFragmentspecialinlinedviewModeldefault1.length;
        int i27 = i23 - 1;
        while (i27 >= 0 && getoutputconfigsArr[i27].TuitionPaymentFragmentspecialinlinedviewModeldefault1.length != length2) {
            i27--;
        }
        int i28 = i27 + 1;
        int i29 = length2 - bVar.b;
        int i30 = 0;
        for (int i31 = 0; i31 < i29; i31++) {
            int i32 = 0;
            while (i32 < i24) {
                getoutputconfigsArr[i32].TuitionPaymentFragmentspecialinlinedviewModeldefault1[i31] = bArr[i30];
                i32++;
                i30++;
            }
        }
        int i33 = i28;
        while (i33 < i24) {
            getoutputconfigsArr[i33].TuitionPaymentFragmentspecialinlinedviewModeldefault1[i29] = bArr[i30];
            i33++;
            i30++;
        }
        int length3 = getoutputconfigsArr[0].TuitionPaymentFragmentspecialinlinedviewModeldefault1.length;
        while (i29 < length3) {
            int i34 = 0;
            while (i34 < i24) {
                getoutputconfigsArr[i34].TuitionPaymentFragmentspecialinlinedviewModeldefault1[i34 < i28 ? i29 : i29 + 1] = bArr[i30];
                i34++;
                i30++;
            }
            i29++;
        }
        int i35 = 0;
        for (int i36 = 0; i36 < i23; i36++) {
            i35 += getoutputconfigsArr[i36].TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        byte[] bArr2 = new byte[i35];
        int i37 = 0;
        for (int i38 = 0; i38 < i23; i38++) {
            getOutputConfigs getoutputconfigs = getoutputconfigsArr[i38];
            byte[] bArr3 = getoutputconfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i39 = getoutputconfigs.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int length4 = bArr3.length;
            int[] iArr = new int[length4];
            for (int i40 = 0; i40 < length4; i40++) {
                iArr[i40] = bArr3[i40] & UByte.MAX_VALUE;
            }
            try {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(iArr, bArr3.length - i39);
                for (int i41 = 0; i41 < i39; i41++) {
                    bArr3[i41] = (byte) iArr[i41];
                }
                int i42 = 0;
                while (i42 < i39) {
                    bArr2[i37] = bArr3[i42];
                    i42++;
                    i37++;
                }
            } catch (ReedSolomonException unused) {
                throw ChecksumException.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
        }
        return getPostviewOutputConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArr2, sessionConfigBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault2, errorCorrectionLevel, map);
    }
}

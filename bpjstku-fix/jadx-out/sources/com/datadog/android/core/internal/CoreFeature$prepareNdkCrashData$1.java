package com.datadog.android.core.internal;

import android.graphics.ImageFormat;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.exifinterface.media.ExifInterface;
import com.google.gson.JsonObject;
import defpackage.ImmediateFutureImmediateFailedFuture;
import defpackage.ListFuture2;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import defpackage.lambdasubmitStillCaptureRequest4;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/google/gson/JsonObject;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()Lcom/google/gson/JsonObject;"}, k = 3, mv = {1, 7, 0}, xi = 48)
public final class CoreFeature$prepareNdkCrashData$1 extends Lambda implements Function0<JsonObject> {
    final /* synthetic */ lambdasubmitStillCaptureRequest4 this$0;
    private static final byte[] $$c = {97, 58, 103, -72};
    private static final int $$d = 197;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {17, 104, 102, -28, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 235;
    private static int $TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int $asInterface = 1;
    private static char[] TuitionPaymentFragmentbindingInflater1 = {47454, 47441, 47451, 47437, 47440, 47446, 47377, 47452, 47435, 47450, 47420, 47431, 47448, 47422, 47439, 47443, 47414, 47449, 47442, 47436, 47376, 47444, 47378, 47453, 47434, 47374};
    private static int b = 2047719679;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 14
            int r6 = 98 - r6
            int r7 = r7 + 4
            int r0 = r5 + 1
            byte[] r1 = com.datadog.android.core.internal.CoreFeature$prepareNdkCrashData$1.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L12
            r4 = r5
            r3 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L20:
            int r3 = r3 + 1
            r4 = r1[r7]
        L24:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            int r7 = r7 + 1
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.core.internal.CoreFeature$prepareNdkCrashData$1.c(int, int, short, java.lang.Object[]):void");
    }

    private static void a(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr2 = TuitionPaymentFragmentbindingInflater1;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (31339 - (Process.myPid() >> 22)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2994, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 17, 1182129903, false, $$e(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(b)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        char c = '0';
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43325 - TextUtils.indexOf("", "", 0, 0)), TextUtils.lastIndexOf("", '0', 0) + 254, 22 - (ViewConfiguration.getTapTimeout() >> 16), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
        int i4 = 33601;
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (33601 - ImageFormat.getBitsPerPixel(0)), 3085 - (ViewConfiguration.getFadingEdgeLength() >> 16), 26 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -2146875848, false, $$e(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i5 = $11 + 9;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i7 = $10 + 105;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
            cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
            Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (i4 - TextUtils.lastIndexOf("", c, 0)), 3085 - View.MeasureSpec.getSize(0), View.MeasureSpec.getSize(0) + 26, -2146875848, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            c = '0';
            i4 = 33601;
        }
        objArr[0] = new String(cArr6);
        int i9 = $11 + 89;
        $10 = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 12 / 0;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ JsonObject invoke() {
        int i = 2 % 2;
        int i2 = $asInterface + 125;
        $TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        if (i2 % 2 != 0) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            throw null;
        }
        JsonObject jsonObjectTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i3 = $asInterface + 71;
        $TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        return jsonObjectTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public final JsonObject TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = $TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 89;
        $asInterface = i2 % 128;
        int i3 = i2 % 2;
        JsonObject jsonObject = (JsonObject) this.this$0.getInterfaceDescriptor.getValue();
        int i4 = $asInterface + 101;
        $TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return jsonObject;
        }
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreFeature$prepareNdkCrashData$1(lambdasubmitStillCaptureRequest4 lambdasubmitstillcapturerequest4) {
        super(0);
        this.this$0 = lambdasubmitstillcapturerequest4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v10 */
    /* JADX WARN: Type inference failed for: r23v11 */
    /* JADX WARN: Type inference failed for: r23v18 */
    /* JADX WARN: Type inference failed for: r23v19 */
    /* JADX WARN: Type inference failed for: r23v20 */
    /* JADX WARN: Type inference failed for: r23v21 */
    /* JADX WARN: Type inference failed for: r23v22 */
    /* JADX WARN: Type inference failed for: r23v23 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX WARN: Type inference failed for: r23v7 */
    /* JADX WARN: Type inference failed for: r23v8 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(android.content.Context r27, int r28, int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 1831
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.core.internal.CoreFeature$prepareNdkCrashData$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(android.content.Context, int, int, int):java.lang.Object[]");
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = $TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 11;
        $asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            ListFuture2.b[1] = ImmediateFutureImmediateFailedFuture.TuitionPaymentFragmentspecialinlinedviewModeldefault1[1];
        } else {
            ListFuture2.b[0] = ImmediateFutureImmediateFailedFuture.TuitionPaymentFragmentspecialinlinedviewModeldefault1[0];
        }
        int i3 = $asInterface + 33;
        $TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(short r6, int r7, byte r8) {
        /*
            int r8 = r8 * 4
            int r0 = r8 + 1
            byte[] r1 = com.datadog.android.core.internal.CoreFeature$prepareNdkCrashData$1.$$c
            int r7 = r7 + 67
            int r6 = r6 * 4
            int r6 = 3 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r7
            r3 = r2
            r7 = r6
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L21:
            int r6 = r6 + 1
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2a:
            int r4 = -r4
            int r6 = r6 + r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.core.internal.CoreFeature$prepareNdkCrashData$1.$$e(short, int, byte):java.lang.String");
    }
}

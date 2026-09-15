package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bpjstku.data.tuition.TuitionPaymentRepository;
import com.bpjstku.data.tuition.model.request.BpuOneMonthTuitionRequest;
import com.bpjstku.data.tuition.model.request.PaymentHistoryRequest;
import com.bpjstku.data.tuition.model.request.TuitionPaymentRequest;
import com.bpjstku.data.tuition.model.response.BpuOneMonthTuitionResponse;
import com.bpjstku.data.tuition.model.response.BpuPaymentStatusItem;
import com.bpjstku.data.tuition.model.response.PaymentHistoryResponse;
import com.bpjstku.domain.tuition.model.BpuCheckPaymentItem;
import com.bpjstku.domain.tuition.model.BpuTuitionOneMonth;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ContextAwareHelper implements ActivityResult {
    private final TuitionPaymentRepository TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public ContextAwareHelper(TuitionPaymentRepository tuitionPaymentRepository) {
        Intrinsics.checkNotNullParameter(tuitionPaymentRepository, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentRepository;
    }

    @Override // defpackage.ActivityResult
    public final deriveCodec<BpuCheckPaymentItem> TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentRequest tuitionPaymentRequest) {
        Intrinsics.checkNotNullParameter(tuitionPaymentRequest, "");
        deriveCodec<BpuPaymentStatusItem> tuitionPayment = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getTuitionPayment(tuitionPaymentRequest);
        final Function1 function1 = new Function1() { // from class: clearAvailableContext
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContextAwareHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3((BpuPaymentStatusItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: ContextAwareKt
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return ContextAwareHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(tuitionPayment, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.ActivityResult
    public final deriveCodec<BpuCheckPaymentItem> TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentRequest tuitionPaymentRequest) {
        Intrinsics.checkNotNullParameter(tuitionPaymentRequest, "");
        deriveCodec<BpuPaymentStatusItem> tuitionPayment = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getTuitionPayment(tuitionPaymentRequest);
        final Function1 function1 = new Function1() { // from class: OnContextAvailableListener
            private static final byte[] $$c = {104, 27, -72, 120};
            private static final int $$f = 67;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {80, -8, 43, 65, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 59, -6, -10, 13, -20, 14, -12, -7, 11, -72, 63, -7, -14, -1, -1, 11, -72, 56, 2, 3, -18, 10, -7, -16, 8, -65, 73, -3, -28, 13, -14, 30, -15, 8, -14, 3, -4, -33, 14, 21, -15, -11, 6, 3, -49, 41, -20, 3, 3, -11, 6, 3, -4, -6, -14, -5, 3, -11, 8, -6, 2, -5, -6, 2, -12, -4, 15, -16, -7, 15, -45, 31, -14, -2, 4, -11, -2, -2, -8, 17, -12, 5, -69};
            private static final int $$e = 170;
            private static final byte[] $$a = {5, -91, 77, 46, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
            private static final int $$b = 91;
            private static int b = 0;
            private static int TuitionPaymentFragmentbindingInflater1 = 1;
            private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {-1195014452, 1229808367, 25632782, 394733616, 1929738383, 1922591208, -914670639, 1302803185, 9799335, 1994258880, 1517361688, -366250527, -1211847642, 1280459937, 297430764, 706476211, -1615802378, -186233027};

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(byte r6, int r7, int r8, java.lang.Object[] r9) {
                /*
                    int r6 = r6 + 4
                    int r8 = r8 * 14
                    int r8 = 98 - r8
                    int r7 = r7 + 1
                    byte[] r0 = defpackage.OnContextAvailableListener.$$a
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L13
                    r3 = r8
                    r4 = r2
                    r8 = r6
                    goto L2c
                L13:
                    r3 = r2
                L14:
                    byte r4 = (byte) r8
                    r1[r3] = r4
                    int r3 = r3 + 1
                    int r6 = r6 + 1
                    if (r3 != r7) goto L25
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L25:
                    r4 = r0[r6]
                    r5 = r8
                    r8 = r6
                    r6 = r4
                    r4 = r3
                    r3 = r5
                L2c:
                    int r6 = -r6
                    int r3 = r3 + r6
                    int r6 = r3 + (-10)
                    r3 = r4
                    r5 = r8
                    r8 = r6
                    r6 = r5
                    goto L14
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.OnContextAvailableListener.a(byte, int, int, java.lang.Object[]):void");
            }

            private static void d(short s, short s2, short s3, Object[] objArr) {
                byte[] bArr = $$d;
                int i = 99 - (s2 * 15);
                int i2 = s * 3;
                int i3 = s3 + 4;
                byte[] bArr2 = new byte[i2 + 50];
                int i4 = i2 + 49;
                int i5 = -1;
                if (bArr == null) {
                    int i6 = i3 + i4 + 3;
                    i3 = i3;
                    i = i6;
                }
                while (true) {
                    i5++;
                    bArr2[i5] = (byte) i;
                    int i7 = i3 + 1;
                    if (i5 == i4) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    }
                    i3 = i7;
                    i = i + bArr[i7] + 3;
                }
            }

            private static void c(int[] iArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2;
                int i3 = 2 % 2;
                SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i4 = -1870535734;
                int i5 = 1;
                int i6 = 0;
                if (iArr2 != null) {
                    int length = iArr2.length;
                    int[] iArr3 = new int[length];
                    int i7 = 0;
                    while (i7 < length) {
                        int i8 = $10 + 115;
                        $11 = i8 % 128;
                        if (i8 % i2 == 0) {
                            try {
                                Object[] objArr2 = new Object[1];
                                objArr2[i6] = Integer.valueOf(iArr2[i7]);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char c = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                                    int capsMode = 3291 - TextUtils.getCapsMode("", i6, i6);
                                    int i9 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 30;
                                    byte b2 = (byte) ($$f & 5);
                                    byte b3 = (byte) (b2 - 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, capsMode, i9, 1948206109, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                                }
                                iArr3[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                                i7 %= 1;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            Object[] objArr3 = {Integer.valueOf(iArr2[i7])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char cArgb = (char) Color.argb(0, 0, 0, 0);
                                int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 3291;
                                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 31;
                                byte b4 = (byte) ($$f & 5);
                                byte b5 = (byte) (b4 - 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cArgb, fadingEdgeLength, keyRepeatTimeout, 1948206109, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                            }
                            iArr3[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                            i7++;
                        }
                        i2 = 2;
                        i4 = -1870535734;
                        i6 = 0;
                    }
                    iArr2 = iArr3;
                }
                int length2 = iArr2.length;
                int[] iArr4 = new int[length2];
                int[] iArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (iArr5 != null) {
                    int length3 = iArr5.length;
                    int[] iArr6 = new int[length3];
                    int i10 = 0;
                    while (i10 < length3) {
                        Object[] objArr4 = new Object[i5];
                        objArr4[0] = Integer.valueOf(iArr5[i10]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                            int capsMode2 = TextUtils.getCapsMode("", 0, 0) + 3291;
                            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 32;
                            byte b6 = (byte) ($$f & 5);
                            byte b7 = (byte) (b6 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollBarSize, capsMode2, iIndexOf, 1948206109, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE});
                        }
                        iArr6[i10] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                        i10++;
                        iArr5 = iArr5;
                        i5 = 1;
                    }
                    iArr5 = iArr6;
                }
                System.arraycopy(iArr5, 0, iArr4, 0, length2);
                int i11 = 2;
                sessionConfigValidatingBuilder.b = 2;
                while (sessionConfigValidatingBuilder.b < iArr.length) {
                    int i12 = $10 + 105;
                    $11 = i12 % 128;
                    int i13 = i12 % i11;
                    cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                    cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                    cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                    cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                    int i14 = 17;
                    for (int i15 = 1; i14 > i15; i15 = 1) {
                        int i16 = $11 + 41;
                        $10 = i16 % 128;
                        if (i16 % 2 != 0) {
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i14];
                            Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b8 = (byte) 0;
                                byte b9 = b8;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 2559 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 29 - Drawable.resolveOpacity(0, 0), 683220507, false, $$g(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                            i14 += 3;
                        } else {
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i14];
                            Object[] objArr6 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                byte b10 = (byte) 0;
                                byte b11 = b10;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) TextUtils.indexOf("", ""), 2559 - Drawable.resolveOpacity(0, 0), 29 - TextUtils.indexOf("", "", 0, 0), 683220507, false, $$g(b10, b11, b11), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                            }
                            int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue();
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue2;
                            i14--;
                        }
                    }
                    int i17 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                    int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    Object[] objArr7 = {sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) ((ViewConfiguration.getTapTimeout() >> 16) + 28879), (ViewConfiguration.getLongPressTimeout() >> 16) + 348, 24 - ImageFormat.getBitsPerPixel(0), -30507727, false, "G", new Class[]{Object.class});
                    }
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7)).intValue()];
                    cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
                    cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                    cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
                    cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
                    sessionConfigValidatingBuilder.b += 2;
                    i11 = 2;
                }
                objArr[0] = new String(cArr2, 0, i);
                int i19 = $10 + 65;
                $11 = i19 % 128;
                int i20 = i19 % 2;
            }

            /* JADX WARN: Code duplicated, block: B:26:0x021c  */
            /* JADX WARN: Code duplicated, block: B:27:0x021e  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                Object[] objArr;
                int i = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                int i2 = 0;
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char packedPositionType = (char) (31533 - ExpandableListView.getPackedPositionType(0L));
                    int minimumFlingVelocity = 921 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int i3 = 28 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    byte[] bArr = $$a;
                    byte b2 = bArr[37];
                    byte b3 = bArr[80];
                    Object[] objArr2 = new Object[1];
                    a(b2, b3, b3, objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(packedPositionType, minimumFlingVelocity, i3, -1048449946, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new int[]{-1628028287, 73826329, 1585086669, -900580548, -1719295072, -1324685681, 2016596594, -538604931, -333058097, 783391871, 1087713733, 1957199279, -400360641, 374649460}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 22, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new int[]{633797013, 1825505363, 910273999, -314586052, 374702549, 1085668082, -1092665021, -1804469997, 948802256, -1016913171}, 14 - Process.getGidForName(""), objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char c = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 31532);
                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 921;
                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 28;
                    byte[] bArr2 = $$a;
                    byte b4 = bArr2[37];
                    Object[] objArr5 = new Object[1];
                    a(b4, (byte) (b4 & 52), bArr2[7], objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, doubleTapTimeout, maxKeyCode, -778300370, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    int i4 = TuitionPaymentFragmentbindingInflater1 + 99;
                    b = i4 % 128;
                    int i5 = i4 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 31533);
                        int iAlpha = 921 - Color.alpha(0);
                        int iLastIndexOf = 27 - TextUtils.lastIndexOf("", '0');
                        byte[] bArr3 = $$a;
                        Object[] objArr6 = new Object[1];
                        a((byte) 51, (byte) (bArr3[17] + 1), bArr3[7], objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cMakeMeasureSpec, iAlpha, iLastIndexOf, -1142834547, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    int i6 = ((int[]) objArr7[3])[0];
                    objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{i6}, (String[]) objArr7[4]};
                    int iMyTid = Process.myTid();
                    int i7 = ((((-398041160) + (((~((-480777512) | iMyTid)) | 201330980) * 345)) + (((~((-480777512) | (~iMyTid))) | 1091971152) * 345)) + ((~(iMyTid | (-201330981))) * 345)) - 197279182;
                    int i8 = (i7 << 13) ^ i7;
                    int i9 = i8 ^ (i8 >>> 17);
                    ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    c(new int[]{-1784318782, 1563000666, -185196452, 1493225019, 1461062542, -1689627276, 1900356326, 818967667, -235548273, 1899896856, -1660585817, 228079274, -1668724966, -1198677864, 2030015575, -1256806698}, 26 - (ViewConfiguration.getTapTimeout() >> 16), objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(new int[]{-340987623, 1631542063, -1093891998, 1949130540, 1664938159, 1478462084, -1511978149, 504667306, -1237329630, 1654181466, 2138765127, -224316084}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 18, objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        int i10 = TuitionPaymentFragmentbindingInflater1 + 71;
                        int i11 = i10 % 128;
                        b = i11;
                        int i12 = i10 % 2;
                        if (applicationContext instanceof ContextWrapper) {
                            int i13 = i11 + 17;
                            TuitionPaymentFragmentbindingInflater1 = i13 % 128;
                            if (i13 % 2 == 0) {
                                int i14 = 35 / 0;
                                if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                    applicationContext = applicationContext.getApplicationContext();
                                } else {
                                    applicationContext = null;
                                }
                            } else if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                applicationContext = applicationContext.getApplicationContext();
                            } else {
                                applicationContext = null;
                            }
                        } else {
                            applicationContext = applicationContext.getApplicationContext();
                        }
                    }
                    Object[] objArr10 = new Object[1];
                    c(new int[]{310257191, -594357933, 1545251397, 225102418, 1710938886, 69857226, -807718484, 1632705632, -981751187, 1021474998}, TextUtils.lastIndexOf("", '0', 0, 0) + 17, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    c(new int[]{-586828014, 2107861701, -1730280656, 1556948238, -504542104, -1402361819, 1036902631, -328644047, -1342478829, -1894463654}, TextUtils.indexOf("", "", 0, 0) + 16, objArr11);
                    try {
                        Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -197279182};
                        byte[] bArr4 = $$d;
                        byte b5 = bArr4[35];
                        byte b6 = (byte) (b5 + 1);
                        Object[] objArr13 = new Object[1];
                        d(b6, b6, b5, objArr13);
                        Class<?> cls4 = Class.forName((String) objArr13[0]);
                        byte b7 = (byte) (-bArr4[35]);
                        Object[] objArr14 = new Object[1];
                        d(b7, b7, bArr4[14], objArr14);
                        objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char maxKeyCode2 = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 31533);
                            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 921;
                            int iResolveSize = View.resolveSize(0, 0) + 28;
                            byte[] bArr5 = $$a;
                            Object[] objArr15 = new Object[1];
                            a((byte) 51, (byte) (bArr5[17] + 1), bArr5[7], objArr15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maxKeyCode2, offsetBefore, iResolveSize, -1142834547, false, (String) objArr15[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                        try {
                            Object[] objArr16 = new Object[1];
                            c(new int[]{-1628028287, 73826329, 1585086669, -900580548, -1719295072, -1324685681, 2016596594, -538604931, -333058097, 783391871, 1087713733, 1957199279, -400360641, 374649460}, 22 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr16);
                            Class<?> cls5 = Class.forName((String) objArr16[0]);
                            Object[] objArr17 = new Object[1];
                            c(new int[]{633797013, 1825505363, 910273999, -314586052, 374702549, 1085668082, -1092665021, -1804469997, 948802256, -1016913171}, Drawable.resolveOpacity(0, 0) + 15, objArr17);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char tapTimeout = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 31533);
                                int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 921;
                                int iIndexOf = TextUtils.indexOf("", "", 0) + 28;
                                byte[] bArr6 = $$a;
                                byte b8 = bArr6[37];
                                byte b9 = bArr6[7];
                                Object[] objArr18 = new Object[1];
                                a(b8, (byte) (b8 & 52), b9, objArr18);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(tapTimeout, maximumFlingVelocity, iIndexOf, -778300370, false, (String) objArr18[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char fadingEdgeLength = (char) (31533 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                                int iMyTid2 = (Process.myTid() >> 22) + 921;
                                int iIndexOf2 = 27 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                byte[] bArr7 = $$a;
                                byte b10 = bArr7[37];
                                byte b11 = bArr7[80];
                                Object[] objArr19 = new Object[1];
                                a(b10, b11, b11, objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(fadingEdgeLength, iMyTid2, iIndexOf2, -1048449946, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
                if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[4];
                    if (strArr == null) {
                        throw null;
                    }
                    int i15 = TuitionPaymentFragmentbindingInflater1 + 37;
                    b = i15 % 128;
                    int i16 = i15 % 2;
                    while (i2 < strArr.length) {
                        int i17 = b + 33;
                        TuitionPaymentFragmentbindingInflater1 = i17 % 128;
                        if (i17 % 2 == 0) {
                            arrayList.add(strArr[i2]);
                            i2 += 63;
                        } else {
                            arrayList.add(strArr[i2]);
                            i2++;
                        }
                    }
                    throw null;
                }
                int i18 = ((int[]) objArr[0])[0];
                int i19 = ((int[]) objArr[3])[0];
                Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i19}, (String[]) objArr[4]};
                int i20 = ~((~((int) Process.getStartUptimeMillis())) | 1028892536);
                int i21 = i18 + (((286326872 | i20) * (-374)) - 1355504021) + ((i20 | 742565664) * 374);
                int i22 = (i21 << 13) ^ i21;
                int i23 = i22 ^ (i22 >>> 17);
                ((int[]) objArr20[0])[0] = i23 ^ (i23 << 5);
                int i24 = TuitionPaymentFragmentbindingInflater1 + 97;
                b = i24 % 128;
                int i25 = i24 % 2;
                BpuCheckPaymentItem bpuCheckPaymentItemTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ContextAwareHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2((BpuPaymentStatusItem) obj);
                int i26 = b + 101;
                TuitionPaymentFragmentbindingInflater1 = i26 % 128;
                int i27 = i26 % 2;
                return bpuCheckPaymentItemTuitionPaymentFragmentspecialinlinedviewModeldefault2;
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
            private static java.lang.String $$g(byte r7, byte r8, byte r9) {
                /*
                    int r9 = r9 * 3
                    int r9 = r9 + 1
                    int r8 = r8 * 2
                    int r8 = 4 - r8
                    int r7 = r7 * 56
                    int r7 = 122 - r7
                    byte[] r0 = defpackage.OnContextAvailableListener.$$c
                    byte[] r1 = new byte[r9]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r7 = r8
                    r3 = r9
                    r4 = r2
                    goto L2a
                L17:
                    r3 = r2
                    r6 = r8
                    r8 = r7
                    r7 = r6
                L1b:
                    int r4 = r3 + 1
                    byte r5 = (byte) r8
                    r1[r3] = r5
                    if (r4 != r9) goto L28
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    return r7
                L28:
                    r3 = r0[r7]
                L2a:
                    int r3 = -r3
                    int r8 = r8 + r3
                    int r7 = r7 + 1
                    r3 = r4
                    goto L1b
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.OnContextAvailableListener.$$g(byte, byte, byte):java.lang.String");
            }
        };
        readableMs readablems = new readableMs() { // from class: resultCodeToString
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return ContextAwareHelper.TuitionPaymentFragmentbindingInflater1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(tuitionPayment, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.ActivityResult
    public final deriveCodec<BpuCheckPaymentItem> TuitionPaymentFragmentspecialinlinedviewModeldefault2(TuitionPaymentRequest tuitionPaymentRequest) {
        Intrinsics.checkNotNullParameter(tuitionPaymentRequest, "");
        deriveCodec<BpuPaymentStatusItem> derivecodecCheckBpuPaymentStatus = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.checkBpuPaymentStatus(tuitionPaymentRequest);
        final Function1 function1 = new Function1() { // from class: withContextAvailable
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContextAwareHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault1((BpuPaymentStatusItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: ContextAwareKtwithContextAvailable2listener1
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return ContextAwareHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecCheckBpuPaymentStatus, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.ActivityResult
    public final deriveCodec<PaymentHistoryResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault1(PaymentHistoryRequest paymentHistoryRequest) {
        Intrinsics.checkNotNullParameter(paymentHistoryRequest, "");
        deriveCodec<PaymentHistoryResponse> paymentHistory = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getPaymentHistory(paymentHistoryRequest);
        final Function1 function1 = new Function1() { // from class: dispatchOnContextAvailable
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContextAwareHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2((PaymentHistoryResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: removeHandler
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return ContextAwareHelper.b(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(paymentHistory, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.ActivityResult
    public final deriveCodec<BpuTuitionOneMonth> TuitionPaymentFragmentbindingInflater1(BpuOneMonthTuitionRequest bpuOneMonthTuitionRequest) {
        Intrinsics.checkNotNullParameter(bpuOneMonthTuitionRequest, "");
        deriveCodec<BpuOneMonthTuitionResponse> derivecodecCheckBpuOneMonth = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.checkBpuOneMonth(bpuOneMonthTuitionRequest);
        final Function1 function1 = new Function1() { // from class: ContextAwareKtwithContextAvailable21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContextAwareHelper.b((BpuOneMonthTuitionResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: withContextAvailableforInline
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return ContextAwareHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecCheckBpuOneMonth, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    public static /* synthetic */ BpuCheckPaymentItem TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BpuCheckPaymentItem) function1.invoke(obj);
    }

    public static /* synthetic */ BpuCheckPaymentItem TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BpuCheckPaymentItem) function1.invoke(obj);
    }

    public static /* synthetic */ BpuCheckPaymentItem TuitionPaymentFragmentspecialinlinedviewModeldefault1(BpuPaymentStatusItem bpuPaymentStatusItem) {
        Intrinsics.checkNotNullParameter(bpuPaymentStatusItem, "");
        return getResultCode.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bpuPaymentStatusItem);
    }

    public static /* synthetic */ PaymentHistoryResponse b(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (PaymentHistoryResponse) function1.invoke(obj);
    }

    public static /* synthetic */ BpuCheckPaymentItem TuitionPaymentFragmentspecialinlinedviewModeldefault2(BpuPaymentStatusItem bpuPaymentStatusItem) {
        Intrinsics.checkNotNullParameter(bpuPaymentStatusItem, "");
        return getResultCode.b(bpuPaymentStatusItem);
    }

    public static /* synthetic */ BpuTuitionOneMonth b(BpuOneMonthTuitionResponse bpuOneMonthTuitionResponse) {
        Intrinsics.checkNotNullParameter(bpuOneMonthTuitionResponse, "");
        return getResultCode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bpuOneMonthTuitionResponse);
    }

    public static /* synthetic */ BpuTuitionOneMonth TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BpuTuitionOneMonth) function1.invoke(obj);
    }

    public static /* synthetic */ PaymentHistoryResponse TuitionPaymentFragmentspecialinlinedviewModeldefault2(PaymentHistoryResponse paymentHistoryResponse) {
        Intrinsics.checkNotNullParameter(paymentHistoryResponse, "");
        return paymentHistoryResponse;
    }

    public static /* synthetic */ BpuCheckPaymentItem TuitionPaymentFragmentspecialinlinedviewModeldefault3(BpuPaymentStatusItem bpuPaymentStatusItem) {
        Intrinsics.checkNotNullParameter(bpuPaymentStatusItem, "");
        return getResultCode.b(bpuPaymentStatusItem);
    }

    public static /* synthetic */ BpuCheckPaymentItem TuitionPaymentFragmentbindingInflater1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BpuCheckPaymentItem) function1.invoke(obj);
    }
}

package defpackage;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.mnc.MncRepository;
import com.bpjstku.data.mnc.model.request.VisionProvisioningRequest;
import com.bpjstku.domain.general.model.BaseModel;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaGga0ztmPNYcZ2Poj0VEtDPu4ouA implements r8lambdaXxpmZzi8FNPM2sJJA30VCt2mBcQ {
    private final MncRepository TuitionPaymentFragmentbindingInflater1;
    private final PreferenceManager TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public r8lambdaGga0ztmPNYcZ2Poj0VEtDPu4ouA(MncRepository mncRepository, PreferenceManager preferenceManager) {
        Intrinsics.checkNotNullParameter(mncRepository, "");
        Intrinsics.checkNotNullParameter(preferenceManager, "");
        this.TuitionPaymentFragmentbindingInflater1 = mncRepository;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = preferenceManager;
    }

    @Override // defpackage.r8lambdaXxpmZzi8FNPM2sJJA30VCt2mBcQ
    public final deriveCodec<BaseModel> TuitionPaymentFragmentspecialinlinedviewModeldefault2(VisionProvisioningRequest visionProvisioningRequest) {
        Intrinsics.checkNotNullParameter(visionProvisioningRequest, "");
        deriveCodec<BaseModel> derivecodecProvisioningVisionPlus = this.TuitionPaymentFragmentbindingInflater1.provisioningVisionPlus(visionProvisioningRequest);
        final Function1 function1 = new Function1() { // from class: onLaunchlambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r8lambdaGga0ztmPNYcZ2Poj0VEtDPu4ouA.TuitionPaymentFragmentspecialinlinedviewModeldefault3((BaseModel) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: r8lambdaGPRYQhThGKvRdyPr7xfDY1xENA
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return r8lambdaGga0ztmPNYcZ2Poj0VEtDPu4ouA.TuitionPaymentFragmentspecialinlinedviewModeldefault3(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecProvisioningVisionPlus, readablems);
        final Function1 function2 = new Function1() { // from class: r8lambda50PeDeOZ7xBZFvhmt63acaX0YUk
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {82, Base64.padSymbol, -66, -42, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
            private static final int $$b = 82;
            private static int TuitionPaymentFragmentbindingInflater1 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            private static long b = 7962147407268713575L;

            /* JADX WARN: Code duplicated, block: B:10:0x0026  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(byte r7, int r8, byte r9, java.lang.Object[] r10) {
                /*
                    byte[] r0 = defpackage.r8lambda50PeDeOZ7xBZFvhmt63acaX0YUk.$$a
                    int r8 = r8 * 14
                    int r8 = r8 + 84
                    int r7 = r7 * 52
                    int r7 = 55 - r7
                    int r9 = 53 - r9
                    byte[] r1 = new byte[r9]
                    r2 = 0
                    if (r0 != 0) goto L14
                    r3 = r9
                    r5 = r2
                    goto L2b
                L14:
                    r3 = r2
                L15:
                    int r7 = r7 + 1
                    byte r4 = (byte) r8
                    int r5 = r3 + 1
                    r1[r3] = r4
                    if (r5 != r9) goto L26
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L26:
                    r3 = r0[r7]
                    r6 = r3
                    r3 = r8
                    r8 = r6
                L2b:
                    int r8 = -r8
                    int r3 = r3 + r8
                    int r8 = r3 + (-11)
                    r3 = r5
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.r8lambda50PeDeOZ7xBZFvhmt63acaX0YUk.a(byte, int, byte, java.lang.Object[]):void");
            }

            private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
                getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
                int length = cArr.length;
                long[] jArr = new long[length];
                getrealtimecapturelatency.b = 0;
                while (getrealtimecapturelatency.b < cArr.length) {
                    int i3 = $11 + 83;
                    $10 = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = getrealtimecapturelatency.b;
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19473 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 2624 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 13 - TextUtils.getTrimmedLength(""), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                            }
                            jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() | (b + 9053247990562531611L);
                            Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 480 - MotionEvent.axisFromString(""), 38 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        int i5 = getrealtimecapturelatency.b;
                        Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (View.resolveSize(0, 0) + 19472), 2623 - TextUtils.lastIndexOf("", '0', 0, 0), '=' - AndroidCharacter.getMirror('0'), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (b ^ 9053247990562531611L);
                        Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 39422), ImageFormat.getBitsPerPixel(0) + 482, Gravity.getAbsoluteGravity(0, 0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    }
                }
                char[] cArr2 = new char[length];
                getrealtimecapturelatency.b = 0;
                while (getrealtimecapturelatency.b < cArr.length) {
                    cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                    Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (39422 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 481 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                }
                objArr[0] = new String(cArr2);
                int i6 = $11 + 121;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                Object[] objArr;
                int i = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                int i2 = 0;
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 652;
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 45;
                    byte[] bArr = $$a;
                    byte b2 = bArr[5];
                    byte b3 = bArr[7];
                    Object[] objArr2 = new Object[1];
                    a(b2, b3, b3, objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cCombineMeasuredStates, packedPositionChild, iLastIndexOf, -459846511, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new char[]{15645, 1495, 19602, 38721, 56839, 9932, 27014, 45105, 64315, 50146, 2784, 19800, 37945, 57102, 10190, 28306, 45377, 63530, 49354, 2956, 21115, 38206}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14532, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new char[]{15641, 3665, 23455, 42191, 61451, 15708, 3742, 23529, 42769, 61524, 15770, 3779, 23065, 42844, 61591}, 13121 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                    int iIndexOf = 650 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    int edgeSlop = 44 - (ViewConfiguration.getEdgeSlop() >> 16);
                    byte[] bArr2 = $$a;
                    Object[] objArr5 = new Object[1];
                    a(bArr2[7], bArr2[5], (byte) 52, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(longPressTimeout, iIndexOf, edgeSlop, -873460649, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 651;
                        int pressedStateDuration = 44 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        byte b4 = $$a[7];
                        byte b5 = b4;
                        Object[] objArr6 = new Object[1];
                        a(b4, b5, (byte) (b5 | 15), objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(offsetBefore, jumpTapTimeout, pressedStateDuration, -1595579076, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                    int i3 = ((int[]) objArr7[2])[0];
                    int i4 = ((int[]) objArr7[0])[0];
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i5 = (~(942049610 | iIdentityHashCode)) | 5792420;
                    int i6 = ~((~iIdentityHashCode) | (-2361611));
                    int i7 = (-1569099087) + ((i5 | i6) * (-470)) + (((~(iIdentityHashCode | 947842030)) | i6) * 470) + 967880689;
                    int i8 = (i7 << 13) ^ i7;
                    int i9 = i8 ^ (i8 >>> 17);
                    ((int[]) objArr[3])[0] = i9 ^ (i9 << 5);
                } else {
                    try {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) View.MeasureSpec.getSize(0), TextUtils.getOffsetBefore("", 0) + 1610, ExpandableListView.getPackedPositionType(0L) + 26, 2145681644, false, null, new Class[0]);
                        }
                        Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), 967880689, 0};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 651;
                            int packedPositionGroup = 44 - ExpandableListView.getPackedPositionGroup(0L);
                            byte[] bArr3 = $$a;
                            Object[] objArr9 = new Object[1];
                            a(bArr3[7], bArr3[5], (byte) 52, objArr9);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, iNormalizeMetaState, packedPositionGroup, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.alpha(0) + 695, 98 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 63406), 792 - MotionEvent.axisFromString(""), 83 - KeyEvent.keyCodeFromString("")), Integer.TYPE, Integer.TYPE});
                        }
                        objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                            int tapTimeout = 651 - (ViewConfiguration.getTapTimeout() >> 16);
                            int iArgb = Color.argb(0, 0, 0, 0) + 44;
                            byte b6 = $$a[7];
                            byte b7 = b6;
                            Object[] objArr10 = new Object[1];
                            a(b6, b7, (byte) (b7 | 15), objArr10);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(fadingEdgeLength, tapTimeout, iArgb, -1595579076, false, (String) objArr10[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                        try {
                            Object[] objArr11 = new Object[1];
                            c(new char[]{15645, 1495, 19602, 38721, 56839, 9932, 27014, 45105, 64315, 50146, 2784, 19800, 37945, 57102, 10190, 28306, 45377, 63530, 49354, 2956, 21115, 38206}, (ViewConfiguration.getPressedStateDuration() >> 16) + 14533, objArr11);
                            Class<?> cls2 = Class.forName((String) objArr11[0]);
                            Object[] objArr12 = new Object[1];
                            c(new char[]{15641, 3665, 23455, 42191, 61451, 15708, 3742, 23529, 42769, 61524, 15770, 3779, 23065, 42844, 61591}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 13121, objArr12);
                            long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                char c = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 652;
                                int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 44;
                                byte[] bArr4 = $$a;
                                Object[] objArr13 = new Object[1];
                                a(bArr4[7], bArr4[5], (byte) 52, objArr13);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c, iLastIndexOf2, maximumFlingVelocity, -873460649, false, (String) objArr13[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                                int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 651;
                                int maxKeyCode = 44 - (KeyEvent.getMaxKeyCode() >> 16);
                                byte[] bArr5 = $$a;
                                byte b8 = bArr5[5];
                                byte b9 = bArr5[7];
                                Object[] objArr14 = new Object[1];
                                a(b8, b9, b9, objArr14);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cNormalizeMetaState, pressedStateDuration2, maxKeyCode, -459846511, false, (String) objArr14[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
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
                if (((int[]) objArr[2])[0] != ((int[]) objArr[0])[0]) {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[1];
                    if (strArr == null) {
                        throw null;
                    }
                    int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
                    TuitionPaymentFragmentbindingInflater1 = i10 % 128;
                    int i11 = i10 % 2;
                    while (i2 < strArr.length) {
                        int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
                        TuitionPaymentFragmentbindingInflater1 = i12 % 128;
                        if (i12 % 2 != 0) {
                            arrayList.add(strArr[i2]);
                            i2 += 25;
                        } else {
                            arrayList.add(strArr[i2]);
                            i2++;
                        }
                    }
                    throw null;
                }
                Object[] objArr15 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i13 = ((int[]) objArr[3])[0];
                int i14 = ((int[]) objArr[2])[0];
                int i15 = ((int[]) objArr[0])[0];
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i16 = ~iUptimeMillis;
                int i17 = i13 + (-1187922696) + (((~((-134775197) | i16)) | (~((-537071681) | iUptimeMillis)) | (~(803191262 | iUptimeMillis))) * 765) + (((~((-671846877) | i16)) | 134775196) * 1530) + (((~(iUptimeMillis | (-671846877))) | (~(i16 | 803191262))) * 765);
                int i18 = (i17 << 13) ^ i17;
                int i19 = i18 ^ (i18 >>> 17);
                ((int[]) objArr15[3])[0] = i19 ^ (i19 << 5);
                int i20 = TuitionPaymentFragmentbindingInflater1 + 49;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 % 128;
                if (i20 % 2 != 0) {
                    return r8lambdaGga0ztmPNYcZ2Poj0VEtDPu4ouA.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                }
                r8lambdaGga0ztmPNYcZ2Poj0VEtDPu4ouA.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                throw null;
            }
        };
        logToString logtostring = new logToString() { // from class: ComponentDialog
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        };
        share.b(logtostring, "onSuccess is null");
        currentSystemTimeNs currentsystemtimens = new currentSystemTimeNs(api23Impl, logtostring);
        Intrinsics.checkNotNullExpressionValue(currentsystemtimens, "");
        return currentsystemtimens;
    }

    @Override // defpackage.r8lambdaXxpmZzi8FNPM2sJJA30VCt2mBcQ
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentbindingInflater1.isProvisioned();
    }

    @Override // defpackage.r8lambdaXxpmZzi8FNPM2sJJA30VCt2mBcQ
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return PreferenceManager.getString$default(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, "AGREEMENT_RCTI_PLUS", null, 2, null).length() > 0;
    }

    @Override // defpackage.r8lambdaXxpmZzi8FNPM2sJJA30VCt2mBcQ
    public final void b() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.saveString("AGREEMENT_RCTI_PLUS", "true");
    }

    public static /* synthetic */ BaseModel TuitionPaymentFragmentspecialinlinedviewModeldefault3(BaseModel baseModel) {
        Intrinsics.checkNotNullParameter(baseModel, "");
        return baseModel;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(r8lambdaGga0ztmPNYcZ2Poj0VEtDPu4ouA r8lambdagga0ztmpnycz2poj0vetdpu4oua) {
        r8lambdagga0ztmpnycz2poj0vetdpu4oua.TuitionPaymentFragmentspecialinlinedviewModeldefault3.saveString("USER_PROVISIONING_VISION", "true");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ BaseModel TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseModel) function1.invoke(obj);
    }
}

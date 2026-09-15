package defpackage;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.bpjstku.data.registration.general.model.response.ActivationItem;
import com.bpjstku.presentation.membership.accountactivation.newactivation.NewActivationPasswordActivity$special$$inlined$inject$default$2;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.mlkit.common.MlKitException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.KeyManager;
import javax.net.ssl.TrustManager;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class measureChildConstrained implements Function1 {
    private /* synthetic */ setSplitTrack TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$c = {60, 80, 13, 34};
    private static final int $$f = 150;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {119, -102, -34, -3, 5, -18, 5, -8, -3, -10, -25, 13, -4, -24, -5, 9, 15, -40, 7, 28, -36, -21, -10, -7, -3, 7, 46, -54, -19, 4, -20, -3, 0, -1, -26, 15, -4, -18, 2, -19, 11, -8, -4, -18, 2, -19, 11, 41, -61, -11, -12, 9, -19, -2, 7, -17, 35, -36, -18, 2, -19, 11, 41, -23, -36, -21, -10, -7, -3, 7, 15, -31, -13, 5, -13, -3, -11, 3, 15, -31, -13, 5, -13, -3, -11, 3, 59, -54, -39, 6, -17, 5, -12, -5, 24, -23, -30, 6, 2, -15, -12, 40, -50, 11, -12, -12, 2, -15, -12, 12, -13, -11, 4, -11, -11, 1, 24, -43, 2, -12, 5, -25, 9, -19, 59, -39, 6, -17, 5, -12, -5, 24, -23, -30, 6, 2, -15, -12, 40, -50, 11, -12, -12, 2, -15, -12, -5, -3, 5, -4, -12, 2, -17, -3, -11, -4, -3, -11, 3, -5, -24, 7, -2, -24, 36, -40, 5, -7, -13, 2, -7, -7, -1, -26, 3, -14, Base64.padSymbol};
    private static final int $$h = MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR;
    private static final byte[] $$d = {70, -114, 113, 8, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
    private static final int $$e = 33;
    private static final byte[] $$a = {81, -102, -70, -91, -6, 24, -18, 26, -71, 67, -6, 18, -67, 72, 3, -4, -59, 40, 3, -4, -6, 47, 2, 9, -12, 22, -1, 8, -2, 14, -6, 24, -18, -48, 72, -11, 1, 21, 0, -6, 14, 8, -72, 40, 21, 1, 21, 0, -10, -16, 18, 16, -7, 14, 1};
    private static final int $$b = 158;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -83722465;
    private static long b = 8088118073880182618L;

    private static void a(int i, int i2, short s, Object[] objArr) {
        byte[] bArr = $$d;
        int i3 = 196 - i;
        int i4 = s + 84;
        byte[] bArr2 = new byte[53 - i2];
        int i5 = 52 - i2;
        int i6 = -1;
        if (bArr == null) {
            i4 = (i5 + i4) - 11;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            i3++;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i4 = (i4 + bArr[i3]) - 11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 24
            int r8 = r8 + 84
            byte[] r0 = defpackage.measureChildConstrained.$$g
            int r6 = r6 * 69
            int r1 = 122 - r6
            int r7 = r7 * 121
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            int r6 = 121 - r6
            r2 = 0
            if (r0 != 0) goto L19
            r4 = r8
            r3 = r2
            r8 = r7
            goto L2e
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2e:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-6)
            int r8 = r8 + 1
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.measureChildConstrained.e(short, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            int r7 = r7 * 2
            int r7 = 26 - r7
            byte[] r0 = defpackage.measureChildConstrained.$$a
            int r6 = 106 - r6
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r6
            r6 = r7
            r4 = r2
            goto L25
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r3 = r0[r8]
        L25:
            int r8 = r8 + 1
            int r6 = r6 + r3
            int r6 = r6 + (-3)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.measureChildConstrained.f(byte, short, short, java.lang.Object[]):void");
    }

    private static void d(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 19472), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2624, 13 - TextUtils.indexOf("", ""), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (b ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39421 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), TextUtils.getOffsetBefore("", 0) + 481, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i4 = $10 + 5;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 39422), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 480, 37 - TextUtils.getTrimmedLength(""), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            int i6 = $10 + 123;
            $11 = i6 % 128;
            int i7 = i6 % 2;
        }
        objArr[0] = new String(cArr2);
    }

    private static void c(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr3 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
            int i5 = $11 + 93;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr3[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i7 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i7]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) 1;
                    byte b3 = (byte) (b2 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3291, 31 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1199271174, false, $$i(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), 651 - View.MeasureSpec.getMode(0), 44 - Color.blue(0), -450685997, false, $$i(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
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
        if (i3 > 0) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
            char[] cArr4 = new char[i2];
            System.arraycopy(cArr3, 0, cArr4, 0, i2);
            System.arraycopy(cArr4, 0, cArr3, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr4, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr3, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            int i8 = $10 + 9;
            $11 = i8 % 128;
            int i9 = i8 % 2;
        }
        if (z) {
            int i10 = $11 + 71;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            } else {
                cArr2 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getTouchSlop() >> 8), View.MeasureSpec.getMode(0) + 651, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 44, -450685997, false, $$i(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 43042);
            int iLastIndexOf = 3110 - TextUtils.lastIndexOf("", '0', 0);
            int jumpTapTimeout = 22 - (ViewConfiguration.getJumpTapTimeout() >> 16);
            byte b2 = $$d[7];
            Object[] objArr2 = new Object[1];
            a((short) 193, b2, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(longPressTimeout, iLastIndexOf, jumpTapTimeout, -1272852037, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(false, ((byte) KeyEvent.getModifierMetaStateMask()) + 225, TextUtils.indexOf((CharSequence) "", '0', 0) + 23, KeyEvent.getDeadChar(0, 0) + 1, new char[]{'\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        d(new char[]{54820, 26500, 46450, 49866, 4246, 44649, 65491, 3468, 23404, 59601, 9911, 29814, 34244, 54201, 24858}, 45481 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 43042);
            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 3111;
            int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 22;
            byte b3 = $$d[7];
            Object[] objArr5 = new Object[1];
            a((short) 141, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(scrollDefaultDelay, iNormalizeMetaState, longPressTimeout2, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            int i4 = i3 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char minimumFlingVelocity = (char) (43042 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                int scrollDefaultDelay2 = 3111 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                int iIndexOf = TextUtils.indexOf("", "") + 22;
                byte[] bArr = $$d;
                Object[] objArr6 = new Object[1];
                a((short) 89, (byte) (bArr[33] - 1), bArr[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(minimumFlingVelocity, scrollDefaultDelay2, iIndexOf, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i5 = ((int[]) objArr7[2])[0];
            int i6 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i5};
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = (-1886259630) + (((~((~iIdentityHashCode) | (-358219905))) | (~(1031798781 | iIdentityHashCode))) * (-302)) + ((~((-358219905) | iIdentityHashCode)) * (-604)) + (((~(iIdentityHashCode | 673578877)) | 346200) * 302) + 141770623;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
            objArr = new Object[]{new int[1], new int[]{i6}, iArr, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            d(new char[]{54827, 45225, 6949, 58811, 19531, 54912, 45334, 7056, 57966, 19646, 55112, 45531, 6238, 58048, 19802, 54315}, KeyEvent.normalizeMetaState(0) + 26249, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            d(new char[]{54824, 826, 31770, 43378, 33353, 65459, 10383, 1505, 32497, 43063, 34052, 65148, 11126, 1213, 29079, 43765}, TextUtils.indexOf("", "", 0, 0) + 54559, objArr9);
            try {
                Object[] objArr10 = {null, Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 0, 141770623};
                byte[] bArr2 = $$g;
                byte b4 = bArr2[32];
                Object[] objArr11 = new Object[1];
                e(b4, b4, bArr2[115], objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b5 = bArr2[115];
                Object[] objArr12 = new Object[1];
                e(b5, b5, bArr2[32], objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 43041);
                    int iLastIndexOf2 = 3110 - TextUtils.lastIndexOf("", '0', 0);
                    int i10 = 22 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    byte[] bArr3 = $$d;
                    Object[] objArr13 = new Object[1];
                    a((short) 89, (byte) (bArr3[33] - 1), bArr3[7], objArr13);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, iLastIndexOf2, i10, 154975793, false, (String) objArr13[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    c(false, 223 - ExpandableListView.getPackedPositionChild(0L), 22 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 1, new char[]{'\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0}, objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    d(new char[]{54820, 26500, 46450, 49866, 4246, 44649, 65491, 3468, 23404, 59601, 9911, 29814, 34244, 54201, 24858}, (KeyEvent.getMaxKeyCode() >> 16) + 45481, objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char absoluteGravity = (char) (43042 - Gravity.getAbsoluteGravity(0, 0));
                        int capsMode = 3111 - TextUtils.getCapsMode("", 0, 0);
                        int iBlue = Color.blue(0) + 22;
                        byte b6 = $$d[7];
                        Object[] objArr16 = new Object[1];
                        a((short) 141, b6, b6, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(absoluteGravity, capsMode, iBlue, -1269618118, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char offsetAfter = (char) (43042 - TextUtils.getOffsetAfter("", 0));
                        int i11 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3110;
                        int iIndexOf2 = TextUtils.indexOf("", "", 0) + 22;
                        byte b7 = $$d[7];
                        Object[] objArr17 = new Object[1];
                        a((short) 193, b7, b7, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(offsetAfter, i11, iIndexOf2, -1272852037, false, (String) objArr17[0], null);
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
        int i12 = ((int[]) objArr[1])[0];
        int i13 = ((int[]) objArr[2])[0];
        if (i13 != i12) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 != null) {
                int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 101;
                TuitionPaymentFragmentbindingInflater1 = i14 % 128;
                int i15 = i14 % 2;
                while (i2 < strArr2.length) {
                    int i16 = TuitionPaymentFragmentbindingInflater1 + 107;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i16 % 128;
                    if (i16 % 2 == 0) {
                        arrayList.add(strArr2[i2]);
                        i2 += 108;
                    } else {
                        arrayList.add(strArr2[i2]);
                        i2++;
                    }
                }
            }
            throw new RuntimeException(String.valueOf(i13));
        }
        int i17 = ((int[]) objArr[0])[0];
        int i18 = ((int[]) objArr[2])[0];
        int i19 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[3];
        int[] iArr2 = {i18};
        int i20 = (int) Runtime.getRuntime().totalMemory();
        int i21 = i17 + (-878532958) + (((~(1436544737 | i20)) | 268486721) * (-756)) + (((~i20) | 1436544737) * 756);
        int i22 = (i21 << 13) ^ i21;
        int i23 = i22 ^ (i22 >>> 17);
        ((int[]) objArr[0])[0] = i23 ^ (i23 << 5);
        Object[] objArr18 = {new int[1], new int[]{i19}, iArr2, strArr3};
        int i24 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
        TuitionPaymentFragmentbindingInflater1 = i24 % 128;
        if (i24 % 2 == 0) {
            return setSplitTrack.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (ActivationItem) obj);
        }
        int i25 = 75 / 0;
        return setSplitTrack.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (ActivationItem) obj);
    }

    public static int TuitionPaymentFragmentbindingInflater1(List list) throws Throwable {
        Class<?> cls;
        char c;
        int i;
        int i2;
        Method method;
        Class cls2;
        int iIndexOf;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 2;
        int i10 = 2 % 2;
        int i11 = 1;
        Method[] methodArr = new Method[1];
        byte[] bArr = $$a;
        byte b2 = bArr[38];
        Object[] objArr = new Object[1];
        f(b2, bArr[36], b2, objArr);
        int i12 = 0;
        Class<?> cls3 = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        f(bArr[36], (byte) (-bArr[35]), (byte) (bArr[5] - 1), objArr2);
        String str = (String) objArr2[0];
        Class<?>[] clsArr = new Class[3];
        int i13 = TuitionPaymentFragmentbindingInflater1 + 53;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i13 % 128;
        if (i13 % 2 == 0) {
            clsArr[0] = KeyManager[].class;
            clsArr[0] = TrustManager[].class;
            byte b3 = bArr[38];
            Object[] objArr3 = new Object[1];
            f(b3, b3, bArr[7], objArr3);
            cls = Class.forName((String) objArr3[0]);
            c = 4;
        } else {
            clsArr[0] = KeyManager[].class;
            clsArr[1] = TrustManager[].class;
            byte b4 = bArr[38];
            Object[] objArr4 = new Object[1];
            f(b4, b4, bArr[7], objArr4);
            cls = Class.forName((String) objArr4[0]);
            c = 2;
        }
        clsArr[c] = cls;
        methodArr[0] = cls3.getMethod(str, clsArr);
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c2 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 2823;
            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 22;
            byte b5 = $$d[7];
            Object[] objArr5 = new Object[1];
            a((short) 52, b5, b5, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, threadPriority, windowTouchSlop, 1814927978, false, (String) objArr5[0], null);
        }
        try {
            if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null) == null) {
                Method[] declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 2823 - Color.blue(0), (ViewConfiguration.getTouchSlop() >> 8) + 22)).getDeclaredMethods();
                int length = declaredMethods.length;
                int i14 = 0;
                while (i14 < length) {
                    int i15 = TuitionPaymentFragmentbindingInflater1;
                    int i16 = i15 + 67;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i16 % 128;
                    int i17 = i16 % i9;
                    Method method2 = declaredMethods[i14];
                    int i18 = i15 + 69;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i18 % 128;
                    int i19 = i18 % i9;
                    try {
                        int i20 = -TextUtils.indexOf((CharSequence) "", '0', i12, i12);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i21 = i20 * (-716);
                        int i22 = ((i21 | 315700) << 1) - (i21 ^ 315700);
                        int i23 = ~i20;
                        int i24 = -(-(((i23 ^ 220) | (i23 & 220)) * (-1434)));
                        int i25 = (i22 ^ i24) + ((i22 & i24) << i11);
                        int i26 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i27 = ~((i26 ^ 220) | (i26 & 220));
                        int i28 = ~((i20 ^ 220) | (i20 & 220));
                        int i29 = (i27 & i28) | (i27 ^ i28);
                        int i30 = ~(i23 | (-221) | iTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        int i31 = -(-(((i29 & i30) | (i29 ^ i30)) * 717));
                        int i32 = ((i25 | i31) << i11) - (i31 ^ i25);
                        int i33 = ~i20;
                        int i34 = (i33 & (-221)) | (i33 ^ (-221));
                        int i35 = -(-(((~((i34 & i26) | (i34 ^ i26))) | i28 | (~(iTuitionPaymentFragmentspecialinlinedviewModeldefault1 | 220))) * 717));
                        int i36 = ((i32 | i35) << i11) - (i35 ^ i32);
                        int i37 = -(-Color.red(i12));
                        int i38 = (i37 ^ 24) + ((i37 & 24) << i11);
                        int i39 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i40 = i39 * (-665);
                        int i41 = (i40 ^ AuthApiStatusCodes.AUTH_APP_CERT_ERROR) + ((i40 & AuthApiStatusCodes.AUTH_APP_CERT_ERROR) << i11);
                        int i42 = -(-((~i39) * (-333)));
                        int i43 = (i41 & i42) + (i42 | i41);
                        int i44 = ~i39;
                        int i45 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | i44);
                        int i46 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ 9) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 & 9));
                        int i47 = -(-(((i45 & i46) | (i45 ^ i46)) * 333));
                        int i48 = (i43 ^ i47) + ((i47 & i43) << i11);
                        int i49 = TuitionPaymentFragmentbindingInflater1;
                        int i50 = (i49 & 93) + (i49 | 93);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i50 % 128;
                        int i51 = i50 % 2;
                        int i52 = ~(i44 | iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        int i53 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault2) | 9);
                        int i54 = (i48 - (~(-(-(333 * ((i52 & i53) | (i52 ^ i53))))))) - 1;
                        Object[] objArr6 = new Object[i11];
                        c(true, i36, i38, i54, new char[]{65486, 7, 14, 1, '\f', 65486, 1, 22, 1, '\n', 4, 15, '\b', 20, 5, 65517, 65486, 20, 3, 5, '\f', 6, 5, 18}, objArr6);
                        Class<?> cls4 = Class.forName((String) objArr6[i12]);
                        char[] cArr = {54822, 47127, 2643, 40085, 28386, 61658, 17178, 54594, 42928, 2543, 39885, 27139};
                        int i55 = -ExpandableListView.getPackedPositionChild(0L);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i56 = i55 * (-391);
                        int i57 = (i56 & (-5500950)) + (i56 | (-5500950));
                        int i58 = ~((-28211) | i55);
                        int i59 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & 28210) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 ^ 28210);
                        int i60 = ~i59;
                        int i61 = ((i57 - (~(((i58 ^ i60) | (i58 & i60)) * (-196)))) - i11) + (((i55 ^ 28210) | (i55 & 28210)) * 392);
                        NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i62 = ~((~i55) | (-28211));
                        int i63 = ~i59;
                        int i64 = i61 + (196 * ((i62 & i63) | (i62 ^ i63)));
                        Object[] objArr7 = new Object[i11];
                        d(cArr, i64, objArr7);
                        Object[] objArr8 = new Object[i11];
                        objArr8[i12] = Integer.valueOf(((Integer) cls4.getMethod((String) objArr7[i12], null).invoke(method2, null)).intValue());
                        int trimmedLength = TextUtils.getTrimmedLength("");
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i65 = trimmedLength * (-500);
                        int i66 = (i65 ^ (-9251500)) + ((i65 & (-9251500)) << i11);
                        int i67 = ~((-18504) | trimmedLength);
                        int i68 = ~trimmedLength;
                        int i69 = (i68 & 18503) | (i68 ^ 18503);
                        int i70 = ~((i69 & iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (i69 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4));
                        int i71 = ((i70 & i67) | (i67 ^ i70)) * TypedValues.PositionType.TYPE_TRANSITION_EASING;
                        int i72 = (((i66 & i71) + (i71 | i66)) - (~((~(i68 | (-18504))) * 1002))) - 1;
                        int i73 = ~trimmedLength;
                        int i74 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                        int i75 = (i73 & i74) | (i73 ^ i74);
                        int i76 = (~((i75 & 18503) | (i75 ^ 18503))) * TypedValues.PositionType.TYPE_TRANSITION_EASING;
                        int i77 = (i72 & i76) + (i76 | i72);
                        Object[] objArr9 = new Object[1];
                        d(new char[]{54827, 40551, 18105, 3829, 63347, 48974, 26506, 12254, 37918, 23568, 1269, 52521, 46451, 32182, 9670, 59915, 21061, 6872, 49906, 35691, 29609, 15355, 57405, 43081, 4236, 55516}, i77, objArr9);
                        Class<?> cls5 = Class.forName((String) objArr9[0]);
                        int iArgb = Color.argb(0, 0, 0, 0);
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i78 = iArgb * 303;
                        int i79 = ((i78 | (-68929)) << 1) - (i78 ^ (-68929));
                        int i80 = ~iArgb;
                        int i81 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 115;
                        TuitionPaymentFragmentbindingInflater1 = i81 % 128;
                        int i82 = i81 % 2;
                        int i83 = iTuitionPaymentFragmentspecialinlinedviewModeldefault5 ^ (-1);
                        int i84 = (i83 & i80) | (i80 ^ i83);
                        int i85 = (iArgb ^ 229) | (iArgb & 229);
                        int i86 = -(-((-302) * ((~((i84 & 229) | (i84 ^ 229))) | (~((i85 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i85 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5))))));
                        int i87 = (i79 & i86) + (i86 | i79);
                        int i88 = (i80 & 229) | (i80 ^ 229);
                        int i89 = -(-((~((i88 & iTuitionPaymentFragmentspecialinlinedviewModeldefault5) | (i88 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5))) * (-604)));
                        int i90 = ~((iArgb & (-230)) | ((-230) ^ iArgb));
                        int i91 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault5 & 229) | (229 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault5));
                        int i92 = (i87 & i89) + (i89 | i87) + (((i91 & i90) | (i90 ^ i91)) * 302);
                        int maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i93 = maximumDrawingCacheSize * 465;
                        int i94 = (i93 & (-3704)) + (i93 | (-3704));
                        int i95 = TuitionPaymentFragmentbindingInflater1;
                        int i96 = ((i95 | 21) << 1) - (i95 ^ 21);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i96 % 128;
                        int i97 = i96 % 2;
                        int i98 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                        int i99 = ~((i98 & (-9)) | ((-9) ^ i98));
                        int i100 = ~(((-9) & maximumDrawingCacheSize) | ((-9) ^ maximumDrawingCacheSize));
                        int i101 = (i99 & i100) | (i99 ^ i100);
                        int i102 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                        int i103 = ~((i102 & maximumDrawingCacheSize) | (i102 ^ maximumDrawingCacheSize));
                        int i104 = -(-(464 * ((i101 & i103) | (i101 ^ i103))));
                        int i105 = (i94 ^ i104) + ((i104 & i94) << 1);
                        int i106 = ~maximumDrawingCacheSize;
                        int i107 = (i106 & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault6 ^ i106);
                        int i108 = (i105 - (~(((i107 & (-9)) | (i107 ^ (-9))) * (-464)))) - 1;
                        int i109 = ~((-9) | maximumDrawingCacheSize);
                        int i110 = ~((maximumDrawingCacheSize & iTuitionPaymentFragmentspecialinlinedviewModeldefault6) | (maximumDrawingCacheSize ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault6));
                        int i111 = i108 + (((i110 & i109) | (i109 ^ i110)) * 464);
                        int keyRepeatDelay = ViewConfiguration.getKeyRepeatDelay() >> 16;
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        int i112 = keyRepeatDelay * 236;
                        int i113 = ((i112 | 942) << 1) - (i112 ^ 942);
                        int i114 = ~keyRepeatDelay;
                        int i115 = ~((~iTuitionPaymentFragmentspecialinlinedviewModeldefault7) | i114);
                        int i116 = -(-(((i115 & 2) | (i115 ^ 2)) * (-235)));
                        int i117 = ((i113 | i116) << 1) - (i113 ^ i116);
                        int i118 = ~(i114 | iTuitionPaymentFragmentspecialinlinedviewModeldefault7);
                        int i119 = i117 + (((i118 & 2) | (i118 ^ 2)) * (-470));
                        int i120 = ~(keyRepeatDelay | (-3));
                        int i121 = (i114 & 2) | (i114 ^ 2);
                        int i122 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault7 & i121) | (i121 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault7));
                        int i123 = -(-(((i120 & i122) | (i120 ^ i122)) * 235));
                        Object[] objArr10 = new Object[1];
                        c(true, i92, i111, (i119 ^ i123) + ((i123 & i119) << 1), new char[]{11, 1, 65533, 14, 1, '\f', 65529, 65510}, objArr10);
                        if (!(!((Boolean) cls5.getMethod((String) objArr10[0], Integer.TYPE).invoke(null, objArr8)).booleanValue())) {
                            int i124 = TuitionPaymentFragmentbindingInflater1;
                            int i125 = (i124 & 27) + (i124 | 27);
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i125 % 128;
                            if (i125 % 2 == 0) {
                                cls2 = Long.TYPE;
                                iIndexOf = TextUtils.indexOf("", "", 0, 1);
                                i3 = 28856;
                                z = false;
                            } else {
                                cls2 = Long.TYPE;
                                iIndexOf = TextUtils.indexOf("", "", 0, 0);
                                i3 = 221;
                                z = true;
                            }
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            int i126 = -(-(iIndexOf * (-963)));
                            int i127 = ((-964) ^ i126) + ((i126 & (-964)) << 1);
                            int i128 = -(-(i3 * 965));
                            int i129 = (i127 ^ i128) + ((i128 & i127) << 1);
                            int i130 = ~iIndexOf;
                            int i131 = TuitionPaymentFragmentbindingInflater1;
                            int i132 = (i131 ^ 125) + ((i131 & 125) << 1);
                            int i133 = i132 % 128;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i133;
                            if (i132 % 2 == 0) {
                                i4 = ~i3;
                                int i134 = ~((i4 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (i4 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                                i5 = i129 % (((i130 ^ i134) | (i130 & i134)) * (-964));
                            } else {
                                i4 = ~i3;
                                int i135 = ~((i4 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault8) | (i4 & iTuitionPaymentFragmentspecialinlinedviewModeldefault8));
                                i5 = i129 + (((i130 ^ i135) | (i130 & i135)) * (-964));
                            }
                            int i136 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                            int i137 = ~((i136 & i4) | (i4 ^ i136));
                            int i138 = ~i3;
                            int i139 = ~((i138 & iIndexOf) | (i138 ^ iIndexOf));
                            int i140 = -(-((-964) * ((i137 & i139) | (i137 ^ i139))));
                            int i141 = ((i5 | i140) << 1) - (i140 ^ i5);
                            int i142 = (i133 & 87) + (i133 | 87);
                            TuitionPaymentFragmentbindingInflater1 = i142 % 128;
                            int i143 = i142 % 2;
                            int i144 = -(KeyEvent.getMaxKeyCode() >> 16);
                            int i145 = ((i144 | 24) << 1) - (i144 ^ 24);
                            int i146 = -(-(ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                            int i147 = (i146 ^ 10) + ((i146 & 10) << 1);
                            char[] cArr2 = {65486, 7, 14, 1, '\f', 65486, 1, 22, 1, '\n', 4, 15, '\b', 20, 5, 65517, 65486, 20, 3, 5, '\f', 6, 5, 18};
                            int i148 = TuitionPaymentFragmentbindingInflater1 + 117;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i148 % 128;
                            int i149 = i148 % 2;
                            Object[] objArr11 = new Object[1];
                            c(z, i141, i145, i147, cArr2, objArr11);
                            Class<?> cls6 = Class.forName((String) objArr11[0]);
                            char[] cArr3 = {54822, 38033, 21343, 7692, 56560, 39868, 17930, 1216, 50055, 36424, 19754, 3062, 63064};
                            int i150 = -(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            int i151 = (i150 ^ 17077) + ((i150 & 17077) << 1);
                            int i152 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            int i153 = (i152 ^ 101) + ((i152 & 101) << 1);
                            TuitionPaymentFragmentbindingInflater1 = i153 % 128;
                            if (i153 % 2 != 0) {
                                Object[] objArr12 = new Object[1];
                                d(cArr3, i151, objArr12);
                                cls2.equals(cls6.getMethod((String) objArr12[0], null).invoke(method2, null));
                                throw null;
                            }
                            Object[] objArr13 = new Object[1];
                            d(cArr3, i151, objArr13);
                            if (cls2.equals(cls6.getMethod((String) objArr13[0], null).invoke(method2, null))) {
                                int iRed = Color.red(0) + 221;
                                int i154 = -View.getDefaultSize(0, 0);
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i155 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                int i156 = ((i155 | 119) << 1) - (i155 ^ 119);
                                TuitionPaymentFragmentbindingInflater1 = i156 % 128;
                                if (i156 % 2 != 0) {
                                    i7 = ((((i154 | 217) << 1) - (i154 ^ 217)) >> (-5160)) >>> (216 >>> (~((i154 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault9) | (i154 & iTuitionPaymentFragmentspecialinlinedviewModeldefault9))));
                                    i6 = (i154 ^ (-25)) | (i154 & (-25));
                                } else {
                                    int i157 = i154 * 217;
                                    i6 = i154 | (-25);
                                    i7 = (((i157 & (-5160)) + (i157 | (-5160))) - (~(-(-((~(i154 | iTuitionPaymentFragmentspecialinlinedviewModeldefault9)) * 216))))) - 1;
                                }
                                int i158 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                                int i159 = (-216) * ((i6 & i158) | (i6 ^ i158));
                                int i160 = (i7 & i159) + (i7 | i159);
                                int i161 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                                int i162 = ~((i154 & i161) | (i161 ^ i154));
                                int i163 = -(-(((i162 & 24) | (i162 ^ 24)) * 216));
                                int i164 = (i160 ^ i163) + ((i163 & i160) << 1);
                                int iIndexOf2 = TextUtils.indexOf("", "");
                                int i165 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 73;
                                TuitionPaymentFragmentbindingInflater1 = i165 % 128;
                                int i166 = i165 % 2;
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                int i167 = iIndexOf2 * 399;
                                int i168 = ((i167 | 3990) << 1) - (i167 ^ 3990);
                                int i169 = ~iIndexOf2;
                                int i170 = ~((i169 ^ 10) | (i169 & 10));
                                int i171 = TuitionPaymentFragmentbindingInflater1;
                                int i172 = (i171 ^ 37) + ((i171 & 37) << 1);
                                int i173 = i172 % 128;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i173;
                                if (i172 % 2 == 0) {
                                    int i174 = ~(((-11) ^ iIndexOf2) | ((-11) & iIndexOf2));
                                    int i175 = (i170 ^ i174) | (i170 & i174);
                                    int i176 = ~((-11) | iTuitionPaymentFragmentspecialinlinedviewModeldefault10);
                                    int i177 = -(((i175 & i176) | (i175 ^ i176)) + 398);
                                    i8 = (((i168 | i177) << 1) - (i168 ^ i177)) >>> ((-1194) >>> (iIndexOf2 | 10));
                                } else {
                                    int i178 = ~(((-11) ^ iIndexOf2) | ((-11) & iIndexOf2));
                                    int i179 = (i170 ^ i178) | (i170 & i178);
                                    int i180 = ~(((-11) & iTuitionPaymentFragmentspecialinlinedviewModeldefault10) | ((-11) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault10));
                                    int i181 = i168 + (((i179 & i180) | (i179 ^ i180)) * 398);
                                    int i182 = ((iIndexOf2 ^ 10) | (iIndexOf2 & 10)) * (-1194);
                                    i8 = ((i181 | i182) << 1) - (i181 ^ i182);
                                }
                                int i183 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                                int i184 = ~((i183 & (-11)) | ((-11) ^ i183));
                                int i185 = ~((i169 & 10) | (i169 ^ 10));
                                int i186 = (i184 & i185) | (i184 ^ i185);
                                int i187 = ~((iIndexOf2 & (-11)) | ((-11) ^ iIndexOf2));
                                int i188 = -(-(398 * ((i187 & i186) | (i186 ^ i187))));
                                int i189 = ((i8 | i188) << 1) - (i188 ^ i8);
                                char[] cArr4 = {65486, 7, 14, 1, '\f', 65486, 1, 22, 1, '\n', 4, 15, '\b', 20, 5, 65517, 65486, 20, 3, 5, '\f', 6, 5, 18};
                                int i190 = i173 + 123;
                                TuitionPaymentFragmentbindingInflater1 = i190 % 128;
                                int i191 = i190 % 2;
                                Object[] objArr14 = new Object[1];
                                c(true, iRed, i164, i189, cArr4, objArr14);
                                Class<?> cls7 = Class.forName((String) objArr14[0]);
                                int i192 = 228 - (~(-(-View.resolveSizeAndState(0, 0, 0))));
                                int i193 = -(-(Process.myPid() >> 22));
                                Object[] objArr15 = new Object[1];
                                c(false, i192, (i193 ^ 17) + ((i193 & 17) << 1), 9 - (ViewConfiguration.getPressedStateDuration() >> 16), new char[]{65533, '\f', 65533, '\n', 65516, 17, '\b', 65533, 11, 65535, 65533, '\f', 65512, 65529, '\n', 65529, 5}, objArr15);
                                Object[] objArr16 = (Object[]) cls7.getMethod((String) objArr15[0], null).invoke(method2, null);
                                if (objArr16.length == 2 && Long.TYPE.equals(objArr16[0])) {
                                    int i194 = TuitionPaymentFragmentbindingInflater1;
                                    int i195 = (i194 ^ 97) + ((i194 & 97) << 1);
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i195 % 128;
                                    int i196 = i195 % 2;
                                    int i197 = -View.resolveSizeAndState(0, 0, 0);
                                    int i198 = (i197 & 221) + (i197 | 221);
                                    int iRgb = Color.rgb(0, 0, 0);
                                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault11 = NewActivationPasswordActivity$special$$inlined$inject$default$2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                    int i199 = iRgb * 714;
                                    int i200 = (i199 & 939507008) + (i199 | 939507008);
                                    int i201 = ~iRgb;
                                    int i202 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault11;
                                    int i203 = ~((i201 ^ i202) | (i201 & i202));
                                    int i204 = ~((i201 & 16777240) | (i201 ^ 16777240));
                                    int i205 = (i204 & i203) | (i203 ^ i204);
                                    int i206 = (iRgb & (-16777241)) | ((-16777241) ^ iRgb);
                                    int i207 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault11 & i206) | (i206 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault11));
                                    int i208 = ((i205 ^ i207) | (i205 & i207)) * (-713);
                                    int i209 = (i200 ^ i208) + ((i208 & i200) << 1) + (i207 * 1426);
                                    int i210 = -(-((~((-16777241) | i202)) * 713));
                                    int i211 = ((i209 | i210) << 1) - (i210 ^ i209);
                                    int i212 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                    Object[] objArr17 = new Object[1];
                                    c(true, i198, i211, ((i212 | 11) << 1) - (i212 ^ 11), new char[]{65486, 7, 14, 1, '\f', 65486, 1, 22, 1, '\n', 4, 15, '\b', 20, 5, 65517, 65486, 20, 3, 5, '\f', 6, 5, 18}, objArr17);
                                    if (Class.forName((String) objArr17[0]).equals(objArr16[1])) {
                                        int i213 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 125;
                                        TuitionPaymentFragmentbindingInflater1 = i213 % 128;
                                        if (i213 % 2 == 0) {
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                char trimmedLength2 = (char) TextUtils.getTrimmedLength("");
                                                int i214 = 2824 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                int i215 = 22 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                byte b6 = $$d[7];
                                                Object[] objArr18 = new Object[1];
                                                a((short) 52, b6, b6, objArr18);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(trimmedLength2, i214, i215, 1814927978, false, (String) objArr18[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).set(null, method2);
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                char c3 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                int offsetAfter = 2823 - TextUtils.getOffsetAfter("", 0);
                                                int trimmedLength3 = 22 - TextUtils.getTrimmedLength("");
                                                byte b7 = $$d[7];
                                                Object[] objArr19 = new Object[1];
                                                a((short) 52, b7, b7, objArr19);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c3, offsetAfter, trimmedLength3, 1814927978, false, (String) objArr19[0], null);
                                            }
                                            Object[] objArr20 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null)};
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                char c4 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                                int i216 = 2824 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                int i217 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21;
                                                byte[] bArr2 = $$d;
                                                short s = bArr2[7];
                                                Object[] objArr21 = new Object[1];
                                                a(s, (byte) (s | 52), bArr2[54], objArr21);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c4, i216, i217, -2137287382, false, (String) objArr21[0], new Class[]{Long.TYPE, Method.class});
                                            }
                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr20)).longValue();
                                            break;
                                        }
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                            char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                                            int scrollBarFadeDuration = 2823 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                            int i218 = 22 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                            byte b8 = $$d[7];
                                            Object[] objArr22 = new Object[1];
                                            a((short) 52, b8, b8, objArr22);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionGroup, scrollBarFadeDuration, i218, 1814927978, false, (String) objArr22[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, method2);
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                            char c5 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                            int i219 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2822;
                                            int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L) + 22;
                                            byte b9 = $$d[7];
                                            Object[] objArr23 = new Object[1];
                                            a((short) 52, b9, b9, objArr23);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c5, i219, packedPositionGroup2, 1814927978, false, (String) objArr23[0], null);
                                        }
                                        Object[] objArr24 = {1L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null)};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                            char cRgb = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
                                            int maxKeyCode = 2823 - (KeyEvent.getMaxKeyCode() >> 16);
                                            int deadChar = KeyEvent.getDeadChar(0, 0) + 22;
                                            byte[] bArr3 = $$d;
                                            short s2 = bArr3[7];
                                            Object[] objArr25 = new Object[1];
                                            a(s2, (byte) (s2 | 52), bArr3[54], objArr25);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cRgb, maxKeyCode, deadChar, -2137287382, false, (String) objArr25[0], new Class[]{Long.TYPE, Method.class});
                                        }
                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr24)).longValue();
                                        break;
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                        i14 = (i14 & 1) + (i14 | 1);
                        i9 = 2;
                        i11 = 1;
                        i12 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
            }
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 2823;
                int iBlue = 22 - Color.blue(0);
                byte b10 = $$d[7];
                Object[] objArr26 = new Object[1];
                a((short) 52, b10, b10, objArr26);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(minimumFlingVelocity, edgeSlop, iBlue, 1814927978, false, (String) objArr26[0], null);
            }
            Object[] objArr27 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 1);
                int iMyTid = 2823 - (Process.myTid() >> 22);
                int i220 = 23 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                short s3 = $$d[7];
                Object[] objArr28 = new Object[1];
                a(s3, (byte) (s3 | 52), (byte) 14, objArr28);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(bitsPerPixel, iMyTid, i220, 1025296417, false, (String) objArr28[0], new Class[]{Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr27);
            Object[] objArr29 = {0, methodArr, null};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                char c6 = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 37657);
                int edgeSlop2 = (ViewConfiguration.getEdgeSlop() >> 16) + 2720;
                int i221 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 19;
                short s4 = $$d[7];
                Object[] objArr30 = new Object[1];
                a(s4, (byte) (s4 | 52), (byte) 14, objArr30);
                i = 0;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c6, edgeSlop2, i221, -1568796068, false, (String) objArr30[0], new Class[]{Integer.TYPE, Method[].class, List.class});
            } else {
                i = 0;
            }
            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr29)).longValue();
            long j = 49144015;
            long j2 = -495;
            long j3 = -1;
            long j4 = j ^ j3;
            long jFreeMemory = (int) Runtime.getRuntime().freeMemory();
            long j5 = ((j4 | (jLongValue ^ j3)) ^ j3) | ((j4 | jFreeMemory) ^ j3);
            long j6 = (j2 * j) + (j2 * jLongValue) + (((long) 992) * j5) + (((long) (-496)) * (((((jFreeMemory ^ j3) | j) | jLongValue) ^ j3) | j5)) + (((long) 496) * (jFreeMemory | jLongValue)) + ((long) (-1859549860));
            int iMyUid = Process.myUid();
            int i222 = ~iMyUid;
            int i223 = ((int) (j6 >> 32)) & ((-1682228016) + (((~(1862571418 | i222)) | (~(995169466 | iMyUid))) * 210) + (((~(iMyUid | (-273743905))) | (~(i222 | (-1141145857)))) * 210));
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i224 = ((int) j6) & (((((~((-409106816) | startElapsedRealtime)) | 134236457) * (-283)) - 2103014744) + ((~(startElapsedRealtime | (-274870359))) * 283));
            int i225 = (i223 & i224) | (i223 ^ i224);
            int i226 = i225 >>> 24;
            int i227 = i225 & ViewCompat.MEASURED_SIZE_MASK;
            int i228 = i226 != 0 ? 1 : i;
            if (i228 != 0) {
                int i229 = TuitionPaymentFragmentbindingInflater1;
                int i230 = (i229 & 41) + (i229 | 41);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i230 % 128;
                int i231 = i230 % 2;
                i2 = 1;
            } else {
                i2 = i;
            }
            list.add((i228 == 0 || i227 >= 1 || (method = methodArr[i227]) == null) ? null : method.toString());
            return ((i226 & 6) + (i226 | 6)) * i2;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r5, short r6, short r7) {
        /*
            int r5 = r5 + 119
            int r6 = r6 * 3
            int r0 = 1 - r6
            byte[] r1 = defpackage.measureChildConstrained.$$c
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L14
            r4 = r6
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r6) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L20:
            int r3 = r3 + 1
            int r7 = r7 + 1
            r4 = r1[r7]
        L26:
            int r5 = r5 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.measureChildConstrained.$$i(int, short, short):java.lang.String");
    }
}

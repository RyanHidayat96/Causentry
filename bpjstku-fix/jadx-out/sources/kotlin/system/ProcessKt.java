package kotlin.system;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.deInitSession;
import defpackage.initSession;
import defpackage.onCaptureSessionEnd;
import java.lang.reflect.Method;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u001a\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "exitProcess", "(I)Ljava/lang/Void;"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ProcessKt {
    private static final byte[] $$c = {60, 80, 13, 34};
    private static final int $$f = 5;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {68, 83, 49, -116, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$e = 146;
    private static final byte[] $$a = {55, -47, -47, 67, -6, 24, -18, -48, 72, -11, 1, 21, 0, -6, 14, 8, -72, 56, 5, 16, 5, -67, 45, -32, -2, 12, 13, 37, 16, 5, -8, 0, 6, -3, 1, 22, -12, 1, 18, -44, 54, -1, -12, 12, 8, -7, 9, 2, -21, 14, 14, 12, -13};
    private static final int $$b = 213;
    private static int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f1240a = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {60110, 60124, 60081, 60060, 60062, 60106, 60089, 60067, 60123, 60120, 60093, 60116, 60048, 60043, 60079, 60109, 60073, 60058, 60056, 60118, 60051, 60117, 60075, 60114, 60054, 60090, 60088, 60122, 60078, 60046, 60053, 60119, 60127, 60063, 60052, 60040, 60065, 60050, 60105, 60092, 60080, 60097, 60115, 60055, 60061, 60045, 60086, 60126, 60049, 60094, 60044, 60095, 60121, 60041, 60113, 60082, 60112, 60087, 60034, 60099, 60145, 60125, 60047, 60072};
    private static char TuitionPaymentFragmentbindingInflater1 = 57193;
    private static char b = 7350;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 41887;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 2441;
    private static char asInterface = 61257;

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 84
            int r0 = r6 + 1
            int r7 = 93 - r7
            byte[] r1 = kotlin.system.ProcessKt.$$d
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L11
            r3 = r6
            r8 = r7
            r4 = r2
            goto L27
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L21:
            r3 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L27:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.system.ProcessKt.f(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void g(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.system.ProcessKt.$$a
            int r6 = r6 * 3
            int r6 = r6 + 103
            int r8 = r8 * 17
            int r1 = 34 - r8
            int r7 = r7 * 33
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            int r8 = 33 - r8
            r2 = 0
            if (r0 != 0) goto L19
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2e
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L2e:
            int r7 = r7 + r3
            int r6 = r6 + 1
            int r7 = r7 + (-3)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.system.ProcessKt.g(byte, byte, byte, java.lang.Object[]):void");
    }

    private static final Void exitProcess(int i) {
        int i2 = 2 % 2;
        System.exit(i);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        int i3 = $10 + 33;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (true) {
            char c = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                break;
            }
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            char c2 = 1;
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i5 = 58224;
            int i6 = 0;
            while (i6 < 16) {
                char c3 = cArr3[c2];
                char c4 = cArr3[c];
                int i7 = (c4 + i5) ^ ((c4 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 8611973335120459638L)));
                int i8 = c4 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(asInterface);
                    objArr2[2] = Integer.valueOf(i8);
                    objArr2[c2] = Integer.valueOf(i7);
                    objArr2[0] = Integer.valueOf(c3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char scrollBarFadeDuration = (char) (47773 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 468;
                        int iBlue = 13 - Color.blue(0);
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c2] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollBarFadeDuration, doubleTapTimeout, iBlue, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[c2] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) b) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((Process.myPid() >> 22) + 47773), 468 - View.getDefaultSize(0, 0), 13 - View.combineMeasuredStates(0, 0), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6++;
                    int i9 = $10 + 15;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    c2 = 1;
                    c = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
            cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] ^ cArr3[1]);
            Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c5 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 2323;
                int pressedStateDuration = 44 - (ViewConfiguration.getPressedStateDuration() >> 16);
                byte b2 = (byte) ($$f - 5);
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c5, windowTouchSlop, pressedStateDuration, -1312321721, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i);
        int i11 = $10 + 95;
        $11 = i11 % 128;
        if (i11 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void e(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        char c;
        int i3;
        int length;
        char[] cArr2;
        int i4;
        int i5 = 2;
        int i6 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i7 = 1770390596;
        char c2 = '0';
        int i8 = 1;
        if (cArr3 != null) {
            int i9 = $11 + 59;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i4 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i4 = 0;
            }
            while (i4 < length) {
                int i10 = $10 + 93;
                $11 = i10 % 128;
                if (i10 % i5 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i4])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i7);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cIndexOf = (char) (TextUtils.indexOf("", c2, 0) + 1);
                            int packedPositionChild = 2266 - ExpandableListView.getPackedPositionChild(0L);
                            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 33;
                            int i11 = $$f;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, packedPositionChild, iNormalizeMetaState, -1927765101, false, $$g((byte) (i11 - 5), (byte) i11, (byte) (-1)), new Class[]{Integer.TYPE});
                        }
                        cArr2[i4] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 2268;
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 34;
                        int i12 = $$f;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maxKeyCode, iLastIndexOf, iIndexOf, -1927765101, false, $$g((byte) (i12 - 5), (byte) i12, (byte) (-1)), new Class[]{Integer.TYPE});
                    }
                    cArr2[i4] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i4++;
                }
                i5 = 2;
                i7 = 1770390596;
                c2 = '0';
            }
            int i13 = $10 + 11;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            cArr3 = cArr2;
        }
        Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            char c3 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int offsetBefore = 2267 - TextUtils.getOffsetBefore("", 0);
            int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0) + 34;
            int i15 = $$f;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c3, offsetBefore, iLastIndexOf2, -1927765101, false, $$g((byte) (i15 - 5), (byte) i15, (byte) (-1)), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            char c4 = '\t';
            int i16 = $10 + 9;
            $11 = i16 % 128;
            if (i16 % 2 == 0) {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            } else {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + i8];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + i8] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    c = c4;
                    i3 = i8;
                } else {
                    Object[] objArr5 = new Object[13];
                    objArr5[12] = deinitsession;
                    objArr5[11] = Integer.valueOf(cCharValue);
                    objArr5[10] = deinitsession;
                    objArr5[c4] = deinitsession;
                    objArr5[8] = Integer.valueOf(cCharValue);
                    objArr5[7] = deinitsession;
                    objArr5[6] = deinitsession;
                    objArr5[5] = Integer.valueOf(cCharValue);
                    objArr5[4] = deinitsession;
                    objArr5[3] = deinitsession;
                    objArr5[2] = Integer.valueOf(cCharValue);
                    objArr5[i8] = deinitsession;
                    objArr5[0] = deinitsession;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char bitsPerPixel = (char) (49266 - ImageFormat.getBitsPerPixel(0));
                        int maxKeyCode2 = 3261 - (KeyEvent.getMaxKeyCode() >> 16);
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 30;
                        byte b3 = (byte) ($$f - 5);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(bitsPerPixel, maxKeyCode2, scrollBarFadeDuration, -127612708, false, $$g(b3, (byte) (b3 | 6), (byte) (-1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue() == deinitsession.asBinder) {
                        Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char scrollBarFadeDuration2 = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 22878);
                            int iResolveSize = View.resolveSize(0, 0) + 594;
                            int iIndexOf2 = 16 - TextUtils.indexOf((CharSequence) "", '0', 0);
                            byte b4 = (byte) ($$f - 5);
                            c = '\t';
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollBarFadeDuration2, iResolveSize, iIndexOf2, 1570859318, false, $$g(b4, (byte) (b4 | 8), (byte) (-1)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c = '\t';
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue();
                        int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i17];
                    } else {
                        c = '\t';
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i18 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i19 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i18];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i19];
                        } else {
                            int i20 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i21 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr3[i20];
                            i3 = 1;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr3[i21];
                        }
                    }
                    i3 = 1;
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                i8 = i3;
                c4 = c;
            }
        }
        int i22 = 0;
        while (i22 < i) {
            int i23 = $11 + 55;
            $10 = i23 % 128;
            if (i23 % 2 != 0) {
                cArr4[i22] = (char) (cArr4[i22] ^ 23795);
                i22 += 119;
            } else {
                cArr4[i22] = (char) (cArr4[i22] ^ 13722);
                i22++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 277561. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:99)
        */
    public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(android.content.Context r64, java.lang.String[] r65, int r66, int r67, int r68) {
        /*
            Method dump skipped, instruction units count: 27756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.system.ProcessKt.TuitionPaymentFragmentspecialinlinedviewModeldefault2(android.content.Context, java.lang.String[], int, int, int):java.lang.Object[]");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, byte r7, short r8) {
        /*
            int r7 = r7 + 108
            int r6 = r6 * 3
            int r6 = r6 + 1
            int r8 = r8 + 4
            byte[] r0 = kotlin.system.ProcessKt.$$c
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r4 = r2
            r7 = r6
            goto L25
        L13:
            r3 = r2
        L14:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r3 = r0[r8]
        L25:
            int r7 = r7 + r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.system.ProcessKt.$$g(byte, byte, short):java.lang.String");
    }
}

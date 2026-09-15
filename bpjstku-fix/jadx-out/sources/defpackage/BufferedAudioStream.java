package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.io.encoding.Base64;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes5.dex */
public final class BufferedAudioStream<T, R> extends deriveCodec<R> {
    private AutoValue_VideoValidatedEncoderProfilesProxy<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private Callable<R> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private dumpCodecCapabilities<R, ? super T, R> b;
    private static final byte[] $$c = {53, -70, 9, -72};
    private static final int $$f = 206;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {68, 104, -93, -37, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55};
    private static final int $$e = 244;
    private static final byte[] $$a = {58, 66, -14, -31, -15, 8, -16, 1, 4, 3, 52, -55, -14, -1, -8, 13, -11, -8, 68, -68, 1, Base64.padSymbol, -21, -49, -2, 2, 1, 4, 0, -21, 9, -8, -1, 35, -39, 6, -11, 1, -21, 17, 27, -39, -11, 7, -23, 19, 49, -64, 9, -15, 5, 55, -40, -22, -12, 11, 2, -5, -3, 17, -19, -4, 5, 5, -2, -13, -7, 4, -7};
    private static final int $$b = 107;
    private static int asInterface = 0;
    private static int g = 1;
    private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {59707, 59756, 59746, 59744, 59771, 59751, 59757, 59714, 59715, 59746, 59749, 59770, 59751, 59746, 59770, 59738, 59699, 59730, 59749, 59770, 59751, 59749, 59773, 59743, 59811, 59813, 59799, 59793, 59833, 59835, 59815, 59811, 59823, 59815, 59835, 59813, 59835, 59798, 59798, 59815, 59815, 59747, 59844, 59870, 59857, 59868, 59812, 59812, 59864, 59868, 59863, 59832, 59834, 59866, 59840, 59867, 59844, 59895, 59436, 59426, 59432, 59430, 59438, 59432, 59449, 59899, 59436, 59429, 59426, 59450, 59450, 59426, 59899, 59428, 59450, 59438, 59860, 59845, 59846, 59881, 59847, 59865, 59870, 59859, 59858, 59843, 59845, 59847, 59865, 59706, 59757, 59748, 59775, 59744, 59735, 59755, 59746, 59751, 59768, 59773, 59757, 59752, 59751, 59757, 59757, 59701, 59791, 59788, 59779, 59789, 59751, 59744, 59786, 59791, 59791, 59778, 59789, 59764, 59790, 59768, 59708, 59746, 59746, 59770, 59754, 59740, 59756, 59746, 59752, 59756, 59746, 59744, 59771, 59751, 59757, 59714, 59715, 59746, 59749, 59770, 59751, 59746, 59770, 59738, 59699, 59730, 59749, 59749, 59748, 59775, 59878, 59883, 59883, 59876, 59874, 59885, 59874, 59884, 59858, 59881, 59898, 59875, 59873, 59859, 59868, 59876, 59718, 59805, 59805, 59788, 59761, 59766, 59782, 59796, 59795, 59794, 59793, 59772, 59795, 59450, 59425, 59436, 59399, 59419, 59450, 59425, 59426, 59431, 59436, 59435, 59436, 59428, 59437, 59435, 59433, 59395, 59396, 59455};
    private static long TuitionPaymentFragmentbindingInflater1 = 8225483985058245768L;

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            byte[] r0 = defpackage.BufferedAudioStream.$$a
            int r8 = 34 - r8
            int r6 = r6 * 3
            int r6 = r6 + 97
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L28
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L28:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + (-2)
            int r7 = r3 + 1
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.BufferedAudioStream.d(byte, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(int r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 52
            int r7 = 53 - r7
            int r8 = r8 + 84
            int r9 = r9 * 52
            int r9 = r9 + 4
            byte[] r0 = defpackage.BufferedAudioStream.$$d
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r5 = r2
            r9 = r7
            goto L2b
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2b:
            int r8 = -r8
            int r9 = r9 + r8
            int r8 = r9 + (-10)
            int r9 = r3 + 1
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.BufferedAudioStream.e(int, byte, short, java.lang.Object[]):void");
    }

    public BufferedAudioStream(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, Callable<R> callable, dumpCodecCapabilities<R, ? super T, R> dumpcodeccapabilities) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = autoValue_VideoValidatedEncoderProfilesProxy;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = callable;
        this.b = dumpcodeccapabilities;
    }

    @Override // defpackage.deriveCodec
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(getDefaultVideoProfile<? super R> getdefaultvideoprofile) {
        int i = 2 % 2;
        try {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.subscribe(new AutoValue_AudioStream_PacketInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getdefaultvideoprofile, this.b, share.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.call(), "The seedSupplier returned a null value")));
            int i2 = asInterface + 119;
            g = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            dumpMediaCodecListForFormat.b(th);
            EmptyDisposable.b(th, getdefaultvideoprofile);
        }
    }

    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $11 + 57;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19471 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2625, 12 - TextUtils.lastIndexOf("", '0', 0, 0), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentbindingInflater1 ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ExpandableListView.getPackedPositionGroup(0L) + 39422), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 480, View.combineMeasuredStates(0, 0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
        int i6 = $10 + 65;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (getrealtimecapturelatency.b < cArr.length) {
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 39422), 481 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 37 - Gravity.getAbsoluteGravity(0, 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
        int i8 = $10 + 17;
        $11 = i8 % 128;
        int i9 = i8 % 2;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        byte b;
        char[] cArr;
        char c;
        int i = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i2 = 0;
        int i3 = iArr[0];
        int i4 = 1;
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        char c2 = '0';
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = new Object[i4];
                    objArr2[i2] = Integer.valueOf(cArr2[i8]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) i2;
                        byte b3 = b2;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.lastIndexOf("", c2) + 1), 1270 - TextUtils.getOffsetBefore("", i2), KeyEvent.keyCodeFromString("") + 18, 407021364, false, $$g(b2, b3, (byte) (b3 + 5)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i8++;
                    i2 = 0;
                    i4 = 1;
                    c2 = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i9 = $10 + 59;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 3 / 4;
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i5];
        System.arraycopy(cArr2, i3, cArr4, 0, i5);
        if (bArr != null) {
            int i11 = $11 + 45;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                cArr = new char[i5];
                b = 1;
                setvideostabilizationmode.b = 1;
                c = 1;
            } else {
                b = 1;
                cArr = new char[i5];
                setvideostabilizationmode.b = 0;
                c = 0;
            }
            while (setvideostabilizationmode.b < i5) {
                if (bArr[setvideostabilizationmode.b] == b) {
                    int i12 = setvideostabilizationmode.b;
                    char c3 = cArr4[setvideostabilizationmode.b];
                    Object[] objArr3 = new Object[2];
                    objArr3[b] = Integer.valueOf(c);
                    objArr3[0] = Integer.valueOf(c3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.resolveSizeAndState(0, 0, 0), Color.red(0) + 3225, 12 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 2133916302, false, $$g(b4, b5, (byte) (b5 | 6)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                } else {
                    int i13 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (KeyEvent.keyCodeFromString("") + 29944), 1755 - TextUtils.indexOf("", "", 0, 0), 23 - (Process.myPid() >> 22), 387247676, false, $$g(b6, b6, (byte) $$c.length), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i13] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                }
                c = cArr[setvideostabilizationmode.b];
                try {
                    Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 41241), 1704 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), ExpandableListView.getPackedPositionChild(0L) + 22, -1434471773, false, $$g(b7, b8, b8), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    b = 1;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr4 = cArr;
        }
        if (i7 > 0) {
            int i14 = $11 + 59;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr4, 0, cArr5, 0, i5);
            int i16 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr4, i16, i7);
            System.arraycopy(cArr5, i7, cArr4, 0, i16);
        }
        if (z) {
            int i17 = $11 + 87;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            char[] cArr6 = new char[i5];
            int i19 = 0;
            while (true) {
                setvideostabilizationmode.b = i19;
                if (setvideostabilizationmode.b >= i5) {
                    break;
                }
                cArr6[setvideostabilizationmode.b] = cArr4[(i5 - setvideostabilizationmode.b) - 1];
                i19 = setvideostabilizationmode.b + 1;
            }
            cArr4 = cArr6;
        }
        if (i6 > 0) {
            int i20 = 0;
            while (true) {
                setvideostabilizationmode.b = i20;
                if (setvideostabilizationmode.b >= i5) {
                    break;
                }
                cArr4[setvideostabilizationmode.b] = (char) (cArr4[setvideostabilizationmode.b] - iArr[2]);
                i20 = setvideostabilizationmode.b + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0a58 A[Catch: Exception -> 0x0cb3, all -> 0x0cd8, IOException -> 0x0cdf, TryCatch #5 {Exception -> 0x0cb3, blocks: (B:171:0x0c78, B:173:0x0c7e, B:174:0x0c7f, B:106:0x0a4a, B:108:0x0a58, B:109:0x0a9a, B:111:0x0ab0, B:112:0x0af0, B:152:0x0c45, B:155:0x0c4a, B:157:0x0c52, B:158:0x0c53, B:165:0x0c63, B:167:0x0c6b, B:168:0x0c6c, B:177:0x0c8b, B:179:0x0c91, B:180:0x0c92), top: B:295:0x0a4a }] */
    /* JADX WARN: Code duplicated, block: B:111:0x0ab0 A[Catch: Exception -> 0x0cb3, all -> 0x0cd8, IOException -> 0x0cdf, TryCatch #5 {Exception -> 0x0cb3, blocks: (B:171:0x0c78, B:173:0x0c7e, B:174:0x0c7f, B:106:0x0a4a, B:108:0x0a58, B:109:0x0a9a, B:111:0x0ab0, B:112:0x0af0, B:152:0x0c45, B:155:0x0c4a, B:157:0x0c52, B:158:0x0c53, B:165:0x0c63, B:167:0x0c6b, B:168:0x0c6c, B:177:0x0c8b, B:179:0x0c91, B:180:0x0c92), top: B:295:0x0a4a }] */
    /* JADX WARN: Code duplicated, block: B:116:0x0b2a A[Catch: all -> 0x0cd8, IOException -> 0x0cdf, TryCatch #25 {all -> 0x0cd8, blocks: (B:171:0x0c78, B:173:0x0c7e, B:174:0x0c7f, B:105:0x0a47, B:106:0x0a4a, B:108:0x0a58, B:109:0x0a9a, B:111:0x0ab0, B:112:0x0af0, B:114:0x0b02, B:116:0x0b2a, B:118:0x0b4a, B:120:0x0b72, B:122:0x0bd2, B:124:0x0bf6, B:126:0x0c00, B:188:0x0cb3, B:189:0x0cd7, B:151:0x0c42, B:152:0x0c45, B:155:0x0c4a, B:157:0x0c52, B:158:0x0c53, B:165:0x0c63, B:167:0x0c6b, B:168:0x0c6c, B:177:0x0c8b, B:179:0x0c91, B:180:0x0c92), top: B:307:0x0a47 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x0b4a A[Catch: all -> 0x0cd8, IOException -> 0x0cdf, TryCatch #25 {all -> 0x0cd8, blocks: (B:171:0x0c78, B:173:0x0c7e, B:174:0x0c7f, B:105:0x0a47, B:106:0x0a4a, B:108:0x0a58, B:109:0x0a9a, B:111:0x0ab0, B:112:0x0af0, B:114:0x0b02, B:116:0x0b2a, B:118:0x0b4a, B:120:0x0b72, B:122:0x0bd2, B:124:0x0bf6, B:126:0x0c00, B:188:0x0cb3, B:189:0x0cd7, B:151:0x0c42, B:152:0x0c45, B:155:0x0c4a, B:157:0x0c52, B:158:0x0c53, B:165:0x0c63, B:167:0x0c6b, B:168:0x0c6c, B:177:0x0c8b, B:179:0x0c91, B:180:0x0c92), top: B:307:0x0a47 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x0b72 A[Catch: all -> 0x0cd8, IOException -> 0x0cdf, TryCatch #25 {all -> 0x0cd8, blocks: (B:171:0x0c78, B:173:0x0c7e, B:174:0x0c7f, B:105:0x0a47, B:106:0x0a4a, B:108:0x0a58, B:109:0x0a9a, B:111:0x0ab0, B:112:0x0af0, B:114:0x0b02, B:116:0x0b2a, B:118:0x0b4a, B:120:0x0b72, B:122:0x0bd2, B:124:0x0bf6, B:126:0x0c00, B:188:0x0cb3, B:189:0x0cd7, B:151:0x0c42, B:152:0x0c45, B:155:0x0c4a, B:157:0x0c52, B:158:0x0c53, B:165:0x0c63, B:167:0x0c6b, B:168:0x0c6c, B:177:0x0c8b, B:179:0x0c91, B:180:0x0c92), top: B:307:0x0a47 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x0bd2 A[Catch: all -> 0x0cd8, IOException -> 0x0cdf, TryCatch #25 {all -> 0x0cd8, blocks: (B:171:0x0c78, B:173:0x0c7e, B:174:0x0c7f, B:105:0x0a47, B:106:0x0a4a, B:108:0x0a58, B:109:0x0a9a, B:111:0x0ab0, B:112:0x0af0, B:114:0x0b02, B:116:0x0b2a, B:118:0x0b4a, B:120:0x0b72, B:122:0x0bd2, B:124:0x0bf6, B:126:0x0c00, B:188:0x0cb3, B:189:0x0cd7, B:151:0x0c42, B:152:0x0c45, B:155:0x0c4a, B:157:0x0c52, B:158:0x0c53, B:165:0x0c63, B:167:0x0c6b, B:168:0x0c6c, B:177:0x0c8b, B:179:0x0c91, B:180:0x0c92), top: B:307:0x0a47 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0bf6 A[Catch: all -> 0x0cd8, IOException -> 0x0cdf, TRY_LEAVE, TryCatch #25 {all -> 0x0cd8, blocks: (B:171:0x0c78, B:173:0x0c7e, B:174:0x0c7f, B:105:0x0a47, B:106:0x0a4a, B:108:0x0a58, B:109:0x0a9a, B:111:0x0ab0, B:112:0x0af0, B:114:0x0b02, B:116:0x0b2a, B:118:0x0b4a, B:120:0x0b72, B:122:0x0bd2, B:124:0x0bf6, B:126:0x0c00, B:188:0x0cb3, B:189:0x0cd7, B:151:0x0c42, B:152:0x0c45, B:155:0x0c4a, B:157:0x0c52, B:158:0x0c53, B:165:0x0c63, B:167:0x0c6b, B:168:0x0c6c, B:177:0x0c8b, B:179:0x0c91, B:180:0x0c92), top: B:307:0x0a47 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x0c17  */
    /* JADX WARN: Code duplicated, block: B:199:0x0ce1  */
    /* JADX WARN: Code duplicated, block: B:232:0x107c A[EDGE_INSN: B:232:0x107c->B:233:0x1082 BREAK  A[LOOP:5: B:212:0x0e16->B:231:0x1068], PHI: r1 r2 r3
  0x107c: PHI (r1v59 java.lang.String[]) = (r1v55 java.lang.String[]), (r1v55 java.lang.String[]), (r1v62 java.lang.String[]) binds: [B:208:0x0dc2, B:210:0x0e10, B:346:0x107c] A[DONT_GENERATE, DONT_INLINE]
  0x107c: PHI (r2v93 int) = (r2v0 int), (r2v0 int), (r2v97 int) binds: [B:208:0x0dc2, B:210:0x0e10, B:346:0x107c] A[DONT_GENERATE, DONT_INLINE]
  0x107c: PHI (r3v58 int) = (r3v56 int), (r3v56 int), (r3v67 int) binds: [B:208:0x0dc2, B:210:0x0e10, B:346:0x107c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0305  */
    /* JADX WARN: Code duplicated, block: B:27:0x0308  */
    /* JADX WARN: Code duplicated, block: B:287:0x0669 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0377 A[Catch: all -> 0x1861, TryCatch #1 {all -> 0x1861, blocks: (B:13:0x017e, B:15:0x0194, B:17:0x01ed, B:28:0x035f, B:30:0x0377, B:32:0x03c8, B:222:0x0f37, B:224:0x0f4f, B:226:0x0fa6, B:248:0x10ce, B:250:0x10db, B:251:0x111e, B:253:0x1211, B:255:0x121e, B:256:0x1264, B:258:0x139f, B:260:0x13ac, B:262:0x13f6, B:264:0x1536, B:266:0x1543, B:267:0x157f, B:269:0x1693, B:271:0x16a0, B:272:0x16e6), top: B:289:0x017e }] */
    /* JADX WARN: Code duplicated, block: B:31:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:335:0x0481 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:0x0495 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:341:0x0cdf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:342:0x0c00 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:344:0x0c19 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0483 A[LOOP:1: B:26:0x0306->B:36:0x0483, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x0495 A[EDGE_INSN: B:37:0x0495->B:38:0x049a BREAK  A[LOOP:1: B:26:0x0306->B:36:0x0483], PHI: r5 r13
  0x0495: PHI (r5v209 int) = (r5v208 int), (r5v278 int) binds: [B:24:0x0303, B:336:0x0495] A[DONT_GENERATE, DONT_INLINE]
  0x0495: PHI (r13v47 int) = (r13v46 int), (r13v105 int) binds: [B:24:0x0303, B:336:0x0495] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x0525  */
    /* JADX WARN: Code duplicated, block: B:42:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:44:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:59:0x06c5  */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object[] TuitionPaymentFragmentbindingInflater1(Context context, int i, int i2, int i3) throws Throwable {
        int i4;
        int i5;
        String[] strArr;
        Object obj;
        int i6;
        int i7;
        int i8;
        int i9;
        int length;
        int i10;
        int i11;
        int i12;
        String str;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        String[] strArrSplit;
        int length2;
        int i19;
        String str2;
        Object[] objArr;
        int i20;
        Object obj2;
        int i21;
        Class cls;
        Process processExec;
        Throwable th;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Throwable th2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Throwable th3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        String[] strArrSplit2;
        int length3;
        int i22;
        String str3;
        Object[] objArr2;
        String str4;
        Object[] objArr3;
        Object[] objArr4;
        String[] strArrSplit3;
        int i23;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        int i24;
        int i25;
        int i26 = i;
        int i27 = 1;
        int i28 = 0;
        if (context != null) {
            try {
                Object[] objArr5 = new Object[1];
                a(new int[]{0, 23, 0, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0}, objArr5);
                Class<?> cls2 = Class.forName((String) objArr5[0]);
                int i29 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int i30 = (i29 ^ 3138) + ((i29 & 3138) << 1);
                Object[] objArr6 = new Object[1];
                c(new char[]{1524, 2487, 7525, 8448, 13558, 14517, 19582, 20533, 26620, 27583, 32599, 33593, 38642, 39611}, i30, objArr6);
                String str5 = (String) cls2.getMethod((String) objArr6[0], null).invoke(context, null);
                Object[] objArr7 = new Object[1];
                a(new int[]{0, 23, 0, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0}, objArr7);
                Class<?> cls3 = Class.forName((String) objArr7[0]);
                Object[] objArr8 = new Object[1];
                a(new int[]{23, 18, 66, 0}, false, new byte[]{1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1}, objArr8);
                Object objInvoke = cls3.getMethod((String) objArr8[0], null).invoke(context, null);
                byte[] bArr = $$a;
                byte b = bArr[28];
                byte b2 = b;
                Object[] objArr9 = new Object[1];
                d(b, b2, b2, objArr9);
                Class<?> cls4 = Class.forName((String) objArr9[0]);
                byte b3 = bArr[7];
                Object[] objArr10 = new Object[1];
                d(b3, (byte) (b3 | 32), bArr[40], objArr10);
                int iIndexOf = ((String) cls4.getField((String) objArr10[0]).get(objInvoke)).indexOf(str5);
                if (iIndexOf > 0) {
                    byte b4 = bArr[28];
                    byte b5 = b4;
                    Object[] objArr11 = new Object[1];
                    d(b4, b5, b5, objArr11);
                    Class<?> cls5 = Class.forName((String) objArr11[0]);
                    byte b6 = bArr[7];
                    Object[] objArr12 = new Object[1];
                    d(b6, (byte) (b6 | 32), bArr[40], objArr12);
                    String str6 = (String) cls5.getField((String) objArr12[0]).get(objInvoke);
                    int length4 = str6.length();
                    int i31 = -(-(length4 * 965));
                    int i32 = (14444 & i31) + (i31 | 14444);
                    int i33 = ~length4;
                    int i34 = ~((i33 ^ i26) | (i33 & i26));
                    int i35 = ((i34 & 15) | (15 ^ i34)) * (-964);
                    int i36 = (i32 & i35) + (i35 | i32);
                    int i37 = ~i26;
                    int i38 = ~((i33 ^ i37) | (i33 & i37));
                    int i39 = ~(i33 | (-16));
                    int i40 = i36 + (((i38 ^ i39) | (i39 & i38)) * (-964));
                    if (i40 >= 0) {
                        int i41 = 0;
                        while (true) {
                            if (i41 > i40) {
                                i10 = iIndexOf;
                                i11 = 0;
                                break;
                            }
                            int i42 = 5935 - (~(-(-(i41 * 371))));
                            int i43 = ~i41;
                            int i44 = ~i26;
                            int i45 = ~((i43 ^ i44) | (i43 & i44));
                            int i46 = ~(((-17) ^ i26) | ((-17) & i26));
                            int i47 = -(-(((i45 ^ i46) | (i45 & i46)) * (-370)));
                            int i48 = ((i42 | i47) << i27) - (i47 ^ i42);
                            int i49 = ~(((-17) & i44) | ((-17) ^ i44));
                            int i50 = ~i41;
                            int i51 = ~((i50 & i26) | (i50 ^ i26));
                            int i52 = (i49 & i51) | (i49 ^ i51);
                            int i53 = (i41 ^ 16) | (i41 & 16);
                            int i54 = ~i53;
                            int i55 = -(-(((i52 ^ i54) | (i52 & i54)) * (-370)));
                            int i56 = (i48 & i55) + (i55 | i48);
                            int i57 = (~i53) * 370;
                            String strSubstring = str6.substring(i41, ((i56 | i57) << i27) - (i57 ^ i56));
                            try {
                                Object[] objArr13 = new Object[2];
                                objArr13[i27] = 931995;
                                objArr13[i28] = strSubstring;
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                    int maxKeyCode = 3393 - (KeyEvent.getMaxKeyCode() >> 16);
                                    int threadPriority = ((Process.getThreadPriority(i28) + 20) >> 6) + 9;
                                    byte b7 = $$d[7];
                                    Object[] objArr14 = new Object[1];
                                    e(b7, (byte) 14, (byte) (b7 - 1), objArr14);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maximumFlingVelocity, maxKeyCode, threadPriority, 1203525406, false, (String) objArr14[0], new Class[]{String.class, Integer.TYPE});
                                }
                                long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr13)).longValue();
                                long j = 223247948;
                                long j2 = 371;
                                long j3 = (j2 * j) + (j2 * jLongValue);
                                long j4 = -370;
                                i10 = iIndexOf;
                                long j5 = -1;
                                long j6 = jLongValue ^ j5;
                                long jMyPid = Process.myPid();
                                long j7 = jMyPid ^ j5;
                                long j8 = j ^ j5;
                                long j9 = j3 + ((((j6 | j7) ^ j5) | ((j8 | jMyPid) ^ j5)) * j4);
                                long j10 = ((j8 | j7) ^ j5) | ((j6 | jMyPid) ^ j5);
                                long j11 = j5 ^ (jLongValue | j);
                                long j12 = j9 + (j4 * (j10 | j11)) + (((long) 370) * j11) + ((long) (-225317825));
                                int iMyTid = Process.myTid();
                                int i58 = ((int) (j12 >> 32)) & (1520786966 + (((~((~iMyTid) | 773612995)) | (-798879720)) * 529) + (((~(iMyTid | 773612995)) | (-663613416)) * 529));
                                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                                int i59 = ((int) j12) & ((-1555280422) + ((~((-672170033) | startElapsedRealtime)) * (-301)) + (((~(697405816 | startElapsedRealtime)) | (~((~startElapsedRealtime) | (-739820594)))) * (-301)) + (((~(startElapsedRealtime | 739820593)) | 697405816) * 301));
                                if (((i59 & i58) | (i58 ^ i59)) == -725904754) {
                                    i11 = 1;
                                    break;
                                }
                                i41++;
                                iIndexOf = i10;
                                str6 = str6;
                                i40 = i40;
                                i28 = 0;
                                i27 = 1;
                            } catch (Throwable th4) {
                                Throwable cause = th4.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th4;
                            }
                        }
                        i12 = ~i26;
                        int i60 = (i11 | (-i11)) >> 31;
                        int i61 = (~i60) & i26;
                        int i62 = i60 & ((i26 & (-21)) | (i12 & 20));
                        int i63 = (i62 & i61) | (i61 ^ i62);
                        byte[] bArr2 = $$a;
                        byte b8 = bArr2[28];
                        byte b9 = b8;
                        Object[] objArr15 = new Object[1];
                        d(b8, b9, b9, objArr15);
                        Class<?> cls6 = Class.forName((String) objArr15[0]);
                        byte b10 = bArr2[7];
                        Object[] objArr16 = new Object[1];
                        d(b10, (byte) (b10 | 32), bArr2[40], objArr16);
                        str = (String) cls6.getField((String) objArr16[0]).get(objInvoke);
                        int length5 = str.length();
                        i13 = ((length5 | (-6)) << 1) - (length5 ^ (-6));
                        if (i13 >= 0) {
                            i14 = i12;
                            i15 = i37;
                            i16 = 0;
                            break;
                        }
                        i23 = 0;
                        while (true) {
                            if (i23 <= i13) {
                                i14 = i12;
                                i15 = i37;
                                i16 = 0;
                                break;
                            }
                            int iTuitionPaymentFragmentbindingInflater1 = addTask.TuitionPaymentFragmentbindingInflater1();
                            int i64 = -(-(i23 * (-301)));
                            int i65 = (1818 ^ i64) + ((i64 & 1818) << 1);
                            int i66 = ~iTuitionPaymentFragmentbindingInflater1;
                            int i67 = (i66 & (-7)) | ((-7) ^ i66);
                            int i68 = ~((i67 & i23) | (i67 ^ i23));
                            int i69 = i23 | 6;
                            int i70 = ~((i69 & iTuitionPaymentFragmentbindingInflater1) | (i69 ^ iTuitionPaymentFragmentbindingInflater1));
                            int i71 = i65 + (((i68 & i70) | (i68 ^ i70)) * (-302));
                            int i72 = -(-((~(((-7) & i23) | ((-7) ^ i23) | iTuitionPaymentFragmentbindingInflater1)) * (-604)));
                            int i73 = ((i71 | i72) << 1) - (i72 ^ i71);
                            int i74 = ~i23;
                            int i75 = ~((i74 & 6) | (i74 ^ 6));
                            int i76 = ~((iTuitionPaymentFragmentbindingInflater1 & i23) | (i23 ^ iTuitionPaymentFragmentbindingInflater1));
                            int i77 = -(-(((i76 & i75) | (i75 ^ i76)) * 302));
                            Object[] objArr17 = {str.substring(i23, (i73 & i77) + (i77 | i73)), 931995};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                                int iAxisFromString = MotionEvent.axisFromString("") + 3394;
                                int iGreen = 9 - Color.green(0);
                                byte b11 = $$d[7];
                                Object[] objArr18 = new Object[1];
                                e(b11, (byte) 14, (byte) (b11 - 1), objArr18);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveSizeAndState, iAxisFromString, iGreen, 1203525406, false, (String) objArr18[0], new Class[]{String.class, Integer.TYPE});
                            }
                            long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr17)).longValue();
                            long j13 = 1125593139;
                            long j14 = 371;
                            long j15 = (j14 * j13) + (j14 * jLongValue2);
                            long j16 = -370;
                            i15 = i37;
                            long j17 = -1;
                            long j18 = jLongValue2 ^ j17;
                            i14 = i12;
                            long j19 = i26;
                            long j20 = j19 ^ j17;
                            long j21 = j13 ^ j17;
                            long j22 = (jLongValue2 | j13) ^ j17;
                            long j23 = j15 + ((((j18 | j20) ^ j17) | ((j21 | j19) ^ j17)) * j16) + (j16 * (((j21 | j20) ^ j17) | ((j18 | j19) ^ j17) | j22)) + (((long) 370) * j22) + ((long) (-1127663016));
                            int iUptimeMillis = (int) SystemClock.uptimeMillis();
                            int i78 = ~iUptimeMillis;
                            i24 = ((int) (j23 >> 32)) & ((-802173004) + ((897207642 | i78) * (-369)) + (((~((-812666203) | i78)) | 624560208) * (-369)) + (((~(iUptimeMillis | 812666202)) | 84541440 | (~(i78 | (-272647435)))) * 369));
                            int iMyTid2 = Process.myTid();
                            int i79 = ~iMyTid2;
                            i25 = ((int) j23) & (1180397306 + ((1325636515 | i79) * (-757)) + ((~((-273679377) | iMyTid2)) * 1514) + (((~(iMyTid2 | 1599315891)) | (~(i79 | (-1532104371))) | 1258424994) * 757));
                            if (((i25 & i24) | (i24 ^ i25)) == -2096167706) {
                                i16 = 1;
                                break;
                            }
                            i23 = (i23 ^ 1) + ((i23 & 1) << 1);
                            str = str;
                            i13 = i13;
                            i37 = i15;
                            i12 = i14;
                        }
                        i17 = (~(i26 & 20)) & (i26 | 20);
                        int i80 = (i16 | (-i16)) >> 31;
                        int i81 = (~i80) & i26;
                        int i82 = i80 & i17;
                        int i83 = (i82 & i81) | (i81 ^ i82);
                        int i84 = ((~i63) & i26) | (i63 & i14);
                        int i85 = (i84 | (-i84)) >> 31;
                        int i86 = i83 & (~i85);
                        int i87 = i63 & i85;
                        i7 = (i87 & i86) | (i86 ^ i87);
                        byte[] bArr3 = $$a;
                        byte b12 = bArr3[28];
                        byte b13 = b12;
                        Object[] objArr19 = new Object[1];
                        d(b12, b13, b13, objArr19);
                        Class<?> cls7 = Class.forName((String) objArr19[0]);
                        byte b14 = bArr3[7];
                        Object[] objArr20 = new Object[1];
                        d(b14, (byte) (b14 | 32), bArr3[40], objArr20);
                        String str7 = (String) cls7.getField((String) objArr20[0]).get(objInvoke);
                        int i88 = i10;
                        int i89 = ~i88;
                        int i90 = -i89;
                        int i91 = i88 & (((i89 & i90) | (i89 ^ i90)) >> 31);
                        i18 = 0;
                        String strSubstring2 = str7.substring(0, i91);
                        Object[] objArr21 = new Object[1];
                        c(new char[]{1468}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 9546, objArr21);
                        strArrSplit = strSubstring2.split((String) objArr21[0]);
                        length2 = strArrSplit.length;
                        i19 = 0;
                        while (i19 < length2) {
                            str2 = strArrSplit[i19];
                            int i92 = -(ExpandableListView.getPackedPositionForChild(i18, i18) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i18, i18) == 0L ? 0 : -1));
                            int iTuitionPaymentFragmentbindingInflater2 = addTask.TuitionPaymentFragmentbindingInflater1();
                            int i93 = i92 * (-1975);
                            int i94 = (i93 ^ 57114750) + ((i93 & 57114750) << 1);
                            int i95 = ~((~i92) | 57750);
                            int i96 = (i94 - (~(((iTuitionPaymentFragmentbindingInflater2 ^ i95) | (i95 & iTuitionPaymentFragmentbindingInflater2)) * 988))) - 1;
                            int i97 = ~(((-57751) ^ i92) | ((-57751) & i92));
                            int i98 = ~iTuitionPaymentFragmentbindingInflater2;
                            String[] strArr2 = strArrSplit;
                            int i99 = ~(i98 | i92);
                            int i100 = -(-(((i97 ^ i99) | (i99 & i97)) * (-1976)));
                            int i101 = ((i96 | i100) << 1) - (i100 ^ i96);
                            int i102 = ~i92;
                            int i103 = ~((i102 & 57750) | (i102 ^ 57750));
                            int i104 = ~(((-57751) ^ iTuitionPaymentFragmentbindingInflater2) | (iTuitionPaymentFragmentbindingInflater2 & (-57751)));
                            int i105 = -(-(((i103 & i104) | (i103 ^ i104) | (~(57750 | i98))) * 988));
                            objArr = new Object[1];
                            c(new char[]{1480, 58410, 50912}, (i101 & i105) + (i105 | i101), objArr);
                            if (str2.split((String) objArr[0]).length > 1) {
                                cls = (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2267, TextUtils.getCapsMode("", 0, 0) + 33);
                                synchronized (cls) {
                                    try {
                                        try {
                                            Object[] objArr22 = new Object[1];
                                            a(new int[]{41, 16, 105, 3}, false, new byte[]{0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0}, objArr22);
                                            String str8 = (String) objArr22[0];
                                            try {
                                                Runtime runtime = Runtime.getRuntime();
                                                char[] cArr = {1504, 51304};
                                                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0);
                                                int i106 = ~iLastIndexOf;
                                                i20 = length2;
                                                int i107 = ~((-52629) | i14);
                                                int i108 = (i106 ^ i107) | (i107 & i106);
                                                int i109 = ~(i26 | 52628);
                                                int i110 = (((iLastIndexOf * (-563)) + 29734820) - (~(((i108 ^ i109) | (i109 & i108)) * (-564)))) - 1;
                                                int i111 = ~iLastIndexOf;
                                                int i112 = (i110 - (~((~(((i111 ^ 52628) | (i111 & 52628)) | i26)) * 1128))) - 1;
                                                int i113 = ~((i111 ^ i14) | (i111 & i14));
                                                int i114 = ~((52628 & iLastIndexOf) | (iLastIndexOf ^ 52628));
                                                int i115 = -(-(((i113 & i114) | (i113 ^ i114)) * 564));
                                                try {
                                                    Object[] objArr23 = new Object[1];
                                                    c(cArr, (i112 & i115) + (i115 | i112), objArr23);
                                                    processExec = runtime.exec((String) objArr23[0], (String[]) null, (File) null);
                                                    try {
                                                        Object[] objArr24 = {processExec.getInputStream()};
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                            try {
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 2141 - TextUtils.lastIndexOf("", '0', 0, 0), (ViewConfiguration.getTapTimeout() >> 16) + 45, -1020714777, false, null, new Class[]{InputStream.class});
                                                            } catch (Throwable th5) {
                                                                th = th5;
                                                                Throwable cause2 = th.getCause();
                                                                if (cause2 != null) {
                                                                    throw cause2;
                                                                }
                                                                throw th;
                                                            }
                                                        }
                                                        Object objNewInstance = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr24);
                                                        try {
                                                            Object[] objArr25 = {processExec.getErrorStream()};
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                                try {
                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - ImageFormat.getBitsPerPixel(0)), 2142 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getTapTimeout() >> 16) + 45, -1020714777, false, null, new Class[]{InputStream.class});
                                                                } catch (Throwable th6) {
                                                                    th2 = th6;
                                                                    Throwable cause3 = th2.getCause();
                                                                    if (cause3 != null) {
                                                                        throw cause3;
                                                                    }
                                                                    throw th2;
                                                                }
                                                            }
                                                            Object objNewInstance2 = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr25);
                                                            DataOutputStream dataOutputStream = new DataOutputStream(processExec.getOutputStream());
                                                            try {
                                                                byte[] bArr4 = $$a;
                                                                obj2 = objInvoke;
                                                                i21 = i19;
                                                                i17 = i17;
                                                                try {
                                                                    Object[] objArr26 = new Object[1];
                                                                    d(bArr4[9], (byte) (-bArr4[34]), (byte) (bArr4[45] - 1), objArr26);
                                                                    Class<?> cls8 = Class.forName((String) objArr26[0]);
                                                                    byte b15 = bArr4[35];
                                                                    byte b16 = (byte) 29;
                                                                    i7 = i7;
                                                                    try {
                                                                        Object[] objArr27 = new Object[1];
                                                                        d(b15, (byte) (b15 | 48), b16, objArr27);
                                                                        cls8.getMethod((String) objArr27[0], null).invoke(objNewInstance, null);
                                                                        try {
                                                                            Object[] objArr28 = new Object[1];
                                                                            d(bArr4[9], (byte) (-bArr4[34]), (byte) (bArr4[45] - 1), objArr28);
                                                                            Class<?> cls9 = Class.forName((String) objArr28[0]);
                                                                            byte b17 = bArr4[35];
                                                                            Object[] objArr29 = new Object[1];
                                                                            d(b17, (byte) (b17 | 48), b16, objArr29);
                                                                            cls9.getMethod((String) objArr29[0], null).invoke(objNewInstance2, null);
                                                                            try {
                                                                                StringBuilder sb = new StringBuilder();
                                                                                sb.append(str8);
                                                                                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0);
                                                                                int i116 = iLastIndexOf2 * (-919);
                                                                                int i117 = (i116 & (-18323022)) + (i116 | (-18323022));
                                                                                int i118 = ~iLastIndexOf2;
                                                                                int i119 = (i118 ^ (-19939)) | (i118 & (-19939));
                                                                                int i120 = ~((i119 ^ i26) | (i119 & i26));
                                                                                int i121 = ((-19939) ^ i14) | ((-19939) & i14);
                                                                                int i122 = ~((i121 ^ iLastIndexOf2) | (i121 & iLastIndexOf2));
                                                                                int i123 = (i117 - (~(-(-(((i120 ^ i122) | (i120 & i122)) * 920))))) - 1;
                                                                                int i124 = ~i119;
                                                                                int i125 = ~((i118 ^ i15) | (i118 & i15));
                                                                                int i126 = ((i124 & i125) | (i124 ^ i125)) * 920;
                                                                                int i127 = (i123 ^ i126) + ((i126 & i123) << 1);
                                                                                int i128 = i118 | (-19939);
                                                                                int i129 = ~((i128 & i15) | (i128 ^ i15));
                                                                                int i130 = ~iLastIndexOf2;
                                                                                int i131 = (i130 & 19938) | (i130 ^ 19938);
                                                                                int i132 = ~((i131 & i26) | (i131 ^ i26));
                                                                                int i133 = (i129 & i132) | (i129 ^ i132);
                                                                                int i134 = iLastIndexOf2 | (-19939);
                                                                                int i135 = ~((i134 & i26) | (i134 ^ i26));
                                                                                int i136 = ((i135 & i133) | (i133 ^ i135)) * 920;
                                                                                int i137 = (i127 ^ i136) + ((i136 & i127) << 1);
                                                                                Object[] objArr30 = new Object[1];
                                                                                c(new char[]{1433}, i137, objArr30);
                                                                                sb.append((String) objArr30[0]);
                                                                                String string = sb.toString();
                                                                                int iIndexOf2 = TextUtils.indexOf("", "", 0);
                                                                                int iTuitionPaymentFragmentbindingInflater3 = addTask.TuitionPaymentFragmentbindingInflater1();
                                                                                int i138 = iIndexOf2 * 765;
                                                                                int i139 = (i138 & (-67430793)) + (i138 | (-67430793));
                                                                                int i140 = ~((~iTuitionPaymentFragmentbindingInflater3) | iIndexOf2);
                                                                                int i141 = i139 + (((i140 & 44159) | (i140 ^ 44159)) * 764);
                                                                                int i142 = ~iIndexOf2;
                                                                                int i143 = ~((i142 & 44159) | (i142 ^ 44159));
                                                                                int i144 = ~iTuitionPaymentFragmentbindingInflater3;
                                                                                int i145 = ~((i144 ^ 44159) | (i144 & 44159));
                                                                                int i146 = -(-(((i143 ^ i145) | (i143 & i145)) * (-1528)));
                                                                                int i147 = (i141 & i146) + (i146 | i141);
                                                                                int i148 = ~((~iIndexOf2) | 44159);
                                                                                int i149 = ~(((-44160) & iIndexOf2) | ((-44160) ^ iIndexOf2));
                                                                                int i150 = (i148 & i149) | (i148 ^ i149);
                                                                                int i151 = ~((iIndexOf2 & i144) | (i144 ^ iIndexOf2));
                                                                                int i152 = -(-(((i151 & i150) | (i150 ^ i151)) * 764));
                                                                                Object[] objArr31 = new Object[1];
                                                                                c(new char[]{1478, 43448, 23851, 195, 46167}, (i147 & i152) + (i152 | i147), objArr31);
                                                                                dataOutputStream.write(string.getBytes((String) objArr31[0]));
                                                                                dataOutputStream.flush();
                                                                                Object[] objArr32 = new Object[1];
                                                                                c(new char[]{1526, 60212, 55364, 51578, 48869}, 61151 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr32);
                                                                                String str9 = (String) objArr32[0];
                                                                                Object[] objArr33 = new Object[1];
                                                                                c(new char[]{1478, 43448, 23851, 195, 46167}, 44158 - (~(-(Process.myTid() >> 22))), objArr33);
                                                                                dataOutputStream.write(str9.getBytes((String) objArr33[0]));
                                                                                dataOutputStream.flush();
                                                                                try {
                                                                                    long jNanoTime = System.nanoTime();
                                                                                    long nanos = TimeUnit.MILLISECONDS.toNanos(2000L);
                                                                                    while (true) {
                                                                                        try {
                                                                                            processExec.exitValue();
                                                                                            cls = cls;
                                                                                            str2 = str2;
                                                                                            break;
                                                                                        } catch (IllegalThreadStateException unused) {
                                                                                            if (nanos > 0) {
                                                                                                try {
                                                                                                    Object[] objArr34 = {Long.valueOf(Math.min(TimeUnit.NANOSECONDS.toMillis(nanos) + 1, 3L))};
                                                                                                    byte[] bArr5 = $$a;
                                                                                                    Object[] objArr35 = new Object[1];
                                                                                                    d(bArr5[9], (byte) (-bArr5[34]), (byte) (bArr5[45] - 1), objArr35);
                                                                                                    Class<?> cls10 = Class.forName((String) objArr35[0]);
                                                                                                    byte b18 = bArr5[35];
                                                                                                    byte b19 = bArr5[0];
                                                                                                    Object[] objArr36 = new Object[1];
                                                                                                    d(b18, b19, (byte) (b19 >>> 1), objArr36);
                                                                                                    cls10.getMethod((String) objArr36[0], Long.TYPE).invoke(null, objArr34);
                                                                                                } catch (Throwable th7) {
                                                                                                    Throwable cause4 = th7.getCause();
                                                                                                    if (cause4 != null) {
                                                                                                        throw cause4;
                                                                                                    }
                                                                                                    throw th7;
                                                                                                }
                                                                                            }
                                                                                            nanos = TimeUnit.MILLISECONDS.toNanos(2000L) - (System.nanoTime() - jNanoTime);
                                                                                            if (nanos <= 0) {
                                                                                                break;
                                                                                            }
                                                                                            cls = cls;
                                                                                            str2 = str2;
                                                                                        } catch (InterruptedException e2) {
                                                                                            throw e2;
                                                                                        } catch (Throwable th8) {
                                                                                            th3 = th8;
                                                                                            try {
                                                                                                processExec.destroy();
                                                                                                throw th3;
                                                                                            } catch (Exception unused2) {
                                                                                                throw th3;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                dataOutputStream.close();
                                                                                            } catch (Throwable th9) {
                                                                                                th = th9;
                                                                                                th3 = th;
                                                                                                processExec.destroy();
                                                                                                throw th3;
                                                                                            }
                                                                                        } catch (InterruptedException e3) {
                                                                                            e = e3;
                                                                                            throw e;
                                                                                        }
                                                                                    } catch (IOException unused3) {
                                                                                    }
                                                                                    try {
                                                                                        byte[] bArr6 = $$a;
                                                                                        Object[] objArr37 = new Object[1];
                                                                                        d(bArr6[9], (byte) (-bArr6[34]), (byte) (bArr6[45] - 1), objArr37);
                                                                                        Class<?> cls11 = Class.forName((String) objArr37[0]);
                                                                                        byte b20 = bArr6[9];
                                                                                        byte b21 = (byte) (bArr6[21] + 1);
                                                                                        Object[] objArr38 = new Object[1];
                                                                                        d(b20, b21, (byte) (b21 & 95), objArr38);
                                                                                        cls11.getMethod((String) objArr38[0], Long.TYPE).invoke(objNewInstance, 100L);
                                                                                        try {
                                                                                            Object[] objArr39 = new Object[1];
                                                                                            d(bArr6[9], (byte) (-bArr6[34]), (byte) (bArr6[45] - 1), objArr39);
                                                                                            Class<?> cls12 = Class.forName((String) objArr39[0]);
                                                                                            byte b22 = bArr6[9];
                                                                                            byte b23 = (byte) (bArr6[21] + 1);
                                                                                            Object[] objArr40 = new Object[1];
                                                                                            d(b22, b23, (byte) (b23 & 95), objArr40);
                                                                                            cls12.getMethod((String) objArr40[0], Long.TYPE).invoke(objNewInstance2, 10L);
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            processExec.destroy();
                                                                                                            while (true) {
                                                                                                                if (i22 < length3) {
                                                                                                                    str3 = strArrSplit2[i22];
                                                                                                                    objArr2 = new Object[1];
                                                                                                                    a(new int[]{57, 19, 194, 8}, true, null, objArr2);
                                                                                                                    if (str3.startsWith((String) objArr2[0])) {
                                                                                                                        str4 = str2;
                                                                                                                    } else {
                                                                                                                        int i153 = -(-(ViewConfiguration.getJumpTapTimeout() >> 16));
                                                                                                                        objArr3 = new Object[1];
                                                                                                                        c(new char[]{1507, 44209, 22390, 65073, 41214, 19387, 62052, 42364, 20456, 63143, 39264, 16476, 60118, 40346, 17501, 61196, 37324, 14473, 58177, 35396}, (i153 & 43331) + (i153 | 43331), objArr3);
                                                                                                                        if (str3.startsWith((String) objArr3[0])) {
                                                                                                                            str4 = str2;
                                                                                                                        } else {
                                                                                                                            int iAxisFromString2 = MotionEvent.axisFromString("");
                                                                                                                            int i154 = ~iAxisFromString2;
                                                                                                                            int i155 = ~((i154 ^ 5078) | (i154 & 5078));
                                                                                                                            int i156 = ~((i154 & i26) | (i154 ^ i26));
                                                                                                                            int i157 = (i156 & i155) | (i155 ^ i156);
                                                                                                                            int i158 = ~((i26 ^ 5078) | (i26 & 5078));
                                                                                                                            int i159 = ((iAxisFromString2 * 755) - 3823734) + (((i157 & i158) | (i157 ^ i158)) * (-754));
                                                                                                                            int i160 = ~iAxisFromString2;
                                                                                                                            int i161 = i14 | iAxisFromString2;
                                                                                                                            int i162 = i159 + (((~((i161 & 5078) | (i161 ^ 5078))) | (~((i160 ^ 5078) | (i160 & 5078) | i26))) * (-754));
                                                                                                                            int i163 = -(-((i160 | i15) * 754));
                                                                                                                            int i164 = (i162 ^ i163) + ((i163 & i162) << 1);
                                                                                                                            objArr4 = new Object[1];
                                                                                                                            c(new char[]{1507, 5671, 8794, 16007, 19110, 26333, 29448, 36730}, i164, objArr4);
                                                                                                                            if (str3.startsWith((String) objArr4[0])) {
                                                                                                                                Object[] objArr41 = new Object[1];
                                                                                                                                c(new char[]{1449}, 29122 - (~(-(ViewConfiguration.getEdgeSlop() >> 16))), objArr41);
                                                                                                                                strArrSplit3 = str3.split((String) objArr41[0]);
                                                                                                                                if (strArrSplit3.length > 1) {
                                                                                                                                    str4 = str2;
                                                                                                                                    if (strArrSplit3[1].equalsIgnoreCase(str4)) {
                                                                                                                                        int i165 = (~(i26 & i7)) & (i26 | i7);
                                                                                                                                        int i166 = -i165;
                                                                                                                                        int i167 = ((i165 & i166) | (i165 ^ i166)) >> 31;
                                                                                                                                        i7 = (i7 & i167) | (i17 & (~i167));
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    str4 = str2;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                str4 = str2;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    i22++;
                                                                                                                    str2 = str4;
                                                                                                                }
                                                                                                                int i168 = ((i21 | (-84)) << 1) - (i21 ^ (-84));
                                                                                                                i19 = (i168 ^ 85) + ((i168 & 85) << 1);
                                                                                                                i17 = i17;
                                                                                                                strArrSplit = strArr2;
                                                                                                                length2 = i20;
                                                                                                                objInvoke = obj2;
                                                                                                                i18 = 0;
                                                                                                            }
                                                                                                        } catch (Exception unused4) {
                                                                                                        }
                                                                                                        StringBuilder sb2 = new StringBuilder();
                                                                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                                                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                                                                            char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                                                                                                            int touchSlop = 2142 - (ViewConfiguration.getTouchSlop() >> 8);
                                                                                                            int minimumFlingVelocity = 45 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                                                                            byte b24 = (byte) ($$d[7] - 1);
                                                                                                            byte b25 = b24;
                                                                                                            Object[] objArr42 = new Object[1];
                                                                                                            e(b24, b25, b25, objArr42);
                                                                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, touchSlop, minimumFlingVelocity, 399405187, false, (String) objArr42[0], null);
                                                                                                        }
                                                                                                        sb2.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(objNewInstance).toString());
                                                                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                                                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                                                                            char c = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                                                                                                            int windowTouchSlop = 2142 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                                                                                            int iResolveOpacity = 45 - Drawable.resolveOpacity(0, 0);
                                                                                                            byte b26 = (byte) ($$d[7] - 1);
                                                                                                            byte b27 = b26;
                                                                                                            Object[] objArr43 = new Object[1];
                                                                                                            e(b26, b27, b27, objArr43);
                                                                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, windowTouchSlop, iResolveOpacity, 399405187, false, (String) objArr43[0], null);
                                                                                                        }
                                                                                                        sb2.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(objNewInstance2).toString());
                                                                                                        String string2 = sb2.toString();
                                                                                                        int i169 = -(ViewConfiguration.getTapTimeout() >> 16);
                                                                                                        int i170 = (i169 ^ 19937) + ((i169 & 19937) << 1);
                                                                                                        Object[] objArr44 = new Object[1];
                                                                                                        c(new char[]{1433}, i170, objArr44);
                                                                                                        strArrSplit2 = string2.split((String) objArr44[0]);
                                                                                                        length3 = strArrSplit2.length;
                                                                                                        i22 = 0;
                                                                                                    } catch (Exception unused5) {
                                                                                                        int i171 = -(-View.MeasureSpec.makeMeasureSpec(0, 0));
                                                                                                        int i172 = ((i171 | 13537) << 1) - (i171 ^ 13537);
                                                                                                        Object[] objArr45 = new Object[1];
                                                                                                        c(new char[]{1493, 12563, 27704, 39772, 54898, 3474, 14581, 30656, 41716, 56922, 5434, 16458, 32634, 43679, 57769, 7385, 19363, 34563, 45665, 59728, 9333, 21385, 36518, 50625, 61688, 11289, 23399}, i172, objArr45);
                                                                                                        throw new IOException((String) objArr45[0]);
                                                                                                    }
                                                                                                } catch (Throwable th10) {
                                                                                                    th = th10;
                                                                                                    Throwable th11 = th;
                                                                                                    throw th11;
                                                                                                }
                                                                                            } catch (IOException unused6) {
                                                                                            }
                                                                                        } catch (Throwable th12) {
                                                                                            Throwable cause5 = th12.getCause();
                                                                                            if (cause5 != null) {
                                                                                                throw cause5;
                                                                                            }
                                                                                            throw th12;
                                                                                        }
                                                                                    } catch (Throwable th13) {
                                                                                        Throwable cause6 = th13.getCause();
                                                                                        if (cause6 != null) {
                                                                                            throw cause6;
                                                                                        }
                                                                                        throw th13;
                                                                                    }
                                                                                } catch (InterruptedException e4) {
                                                                                    e = e4;
                                                                                } catch (Throwable th14) {
                                                                                    th = th14;
                                                                                }
                                                                            } catch (IOException unused7) {
                                                                                cls = cls;
                                                                            } catch (Exception unused8) {
                                                                                int i173 = -(-View.MeasureSpec.makeMeasureSpec(0, 0));
                                                                                int i174 = ((i173 | 13537) << 1) - (i173 ^ 13537);
                                                                                Object[] objArr46 = new Object[1];
                                                                                c(new char[]{1493, 12563, 27704, 39772, 54898, 3474, 14581, 30656, 41716, 56922, 5434, 16458, 32634, 43679, 57769, 7385, 19363, 34563, 45665, 59728, 9333, 21385, 36518, 50625, 61688, 11289, 23399}, i174, objArr46);
                                                                                throw new IOException((String) objArr46[0]);
                                                                            }
                                                                        } catch (Throwable th15) {
                                                                            Throwable cause7 = th15.getCause();
                                                                            if (cause7 != null) {
                                                                                throw cause7;
                                                                            }
                                                                            throw th15;
                                                                        }
                                                                    } catch (Throwable th16) {
                                                                        th = th16;
                                                                        Throwable th17 = th;
                                                                        Throwable cause8 = th17.getCause();
                                                                        if (cause8 != null) {
                                                                            throw cause8;
                                                                        }
                                                                        throw th17;
                                                                    }
                                                                } catch (Throwable th18) {
                                                                    th = th18;
                                                                }
                                                            } catch (Throwable th19) {
                                                                th = th19;
                                                            }
                                                        } catch (Throwable th20) {
                                                            th2 = th20;
                                                        }
                                                    } catch (Throwable th21) {
                                                        th = th21;
                                                    }
                                                } catch (IOException unused9) {
                                                    obj2 = objInvoke;
                                                    i21 = i19;
                                                    cls = cls;
                                                    i7 = i7;
                                                    int i1610 = ((i21 | (-84)) << 1) - (i21 ^ (-84));
                                                    i19 = (i1610 ^ 85) + ((i1610 & 85) << 1);
                                                    i17 = i17;
                                                    strArrSplit = strArr2;
                                                    length2 = i20;
                                                    objInvoke = obj2;
                                                    i18 = 0;
                                                } catch (Exception unused10) {
                                                    int i175 = -(-View.MeasureSpec.makeMeasureSpec(0, 0));
                                                    int i176 = ((i175 | 13537) << 1) - (i175 ^ 13537);
                                                    Object[] objArr47 = new Object[1];
                                                    c(new char[]{1493, 12563, 27704, 39772, 54898, 3474, 14581, 30656, 41716, 56922, 5434, 16458, 32634, 43679, 57769, 7385, 19363, 34563, 45665, 59728, 9333, 21385, 36518, 50625, 61688, 11289, 23399}, i176, objArr47);
                                                    throw new IOException((String) objArr47[0]);
                                                }
                                            } catch (Exception unused11) {
                                            }
                                        } catch (Throwable th22) {
                                            th = th22;
                                            cls = cls;
                                        }
                                    } catch (IOException unused12) {
                                        i20 = length2;
                                    }
                                }
                            } else {
                                i7 = i7;
                                i17 = i17;
                                i20 = length2;
                                obj2 = objInvoke;
                                i21 = i19;
                            }
                            i7 = i7;
                            int i1611 = ((i21 | (-84)) << 1) - (i21 ^ (-84));
                            i19 = (i1611 ^ 85) + ((i1611 & 85) << 1);
                            i17 = i17;
                            strArrSplit = strArr2;
                            length2 = i20;
                            objInvoke = obj2;
                            i18 = 0;
                        }
                        obj = objInvoke;
                        i6 = 1;
                    } else {
                        i10 = iIndexOf;
                        i11 = 0;
                        i12 = ~i26;
                        int i610 = (i11 | (-i11)) >> 31;
                        int i611 = (~i610) & i26;
                        int i612 = i610 & ((i26 & (-21)) | (i12 & 20));
                        int i613 = (i612 & i611) | (i611 ^ i612);
                        byte[] bArr7 = $$a;
                        byte b28 = bArr7[28];
                        byte b29 = b28;
                        Object[] objArr110 = new Object[1];
                        d(b28, b29, b29, objArr110);
                        Class<?> cls13 = Class.forName((String) objArr110[0]);
                        byte b110 = bArr7[7];
                        Object[] objArr111 = new Object[1];
                        d(b110, (byte) (b110 | 32), bArr7[40], objArr111);
                        str = (String) cls13.getField((String) objArr111[0]).get(objInvoke);
                        int length6 = str.length();
                        i13 = ((length6 | (-6)) << 1) - (length6 ^ (-6));
                        if (i13 >= 0) {
                            i14 = i12;
                            i15 = i37;
                            i16 = 0;
                            break;
                        }
                        i23 = 0;
                        while (true) {
                            if (i23 <= i13) {
                                i14 = i12;
                                i15 = i37;
                                i16 = 0;
                                break;
                            }
                            int iTuitionPaymentFragmentbindingInflater4 = addTask.TuitionPaymentFragmentbindingInflater1();
                            int i614 = -(-(i23 * (-301)));
                            int i615 = (1818 ^ i614) + ((i614 & 1818) << 1);
                            int i616 = ~iTuitionPaymentFragmentbindingInflater4;
                            int i617 = (i616 & (-7)) | ((-7) ^ i616);
                            int i618 = ~((i617 & i23) | (i617 ^ i23));
                            int i619 = i23 | 6;
                            int i710 = ~((i619 & iTuitionPaymentFragmentbindingInflater4) | (i619 ^ iTuitionPaymentFragmentbindingInflater4));
                            int i711 = i615 + (((i618 & i710) | (i618 ^ i710)) * (-302));
                            int i712 = -(-((~(((-7) & i23) | ((-7) ^ i23) | iTuitionPaymentFragmentbindingInflater4)) * (-604)));
                            int i713 = ((i711 | i712) << 1) - (i712 ^ i711);
                            int i714 = ~i23;
                            int i715 = ~((i714 & 6) | (i714 ^ 6));
                            int i716 = ~((iTuitionPaymentFragmentbindingInflater4 & i23) | (i23 ^ iTuitionPaymentFragmentbindingInflater4));
                            int i717 = -(-(((i716 & i715) | (i715 ^ i716)) * 302));
                            Object[] objArr112 = {str.substring(i23, (i713 & i717) + (i717 | i713)), 931995};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char cResolveSizeAndState2 = (char) View.resolveSizeAndState(0, 0, 0);
                                int iAxisFromString3 = MotionEvent.axisFromString("") + 3394;
                                int iGreen2 = 9 - Color.green(0);
                                byte b111 = $$d[7];
                                Object[] objArr113 = new Object[1];
                                e(b111, (byte) 14, (byte) (b111 - 1), objArr113);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cResolveSizeAndState2, iAxisFromString3, iGreen2, 1203525406, false, (String) objArr113[0], new Class[]{String.class, Integer.TYPE});
                            }
                            long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr112)).longValue();
                            long j110 = 1125593139;
                            long j111 = 371;
                            long j112 = (j111 * j110) + (j111 * jLongValue3);
                            long j113 = -370;
                            i15 = i37;
                            long j114 = -1;
                            long j115 = jLongValue3 ^ j114;
                            i14 = i12;
                            long j116 = i26;
                            long j24 = j116 ^ j114;
                            long j25 = j110 ^ j114;
                            long j26 = (jLongValue3 | j110) ^ j114;
                            long j27 = j112 + ((((j115 | j24) ^ j114) | ((j25 | j116) ^ j114)) * j113) + (j113 * (((j25 | j24) ^ j114) | ((j115 | j116) ^ j114) | j26)) + (((long) 370) * j26) + ((long) (-1127663016));
                            int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
                            int i718 = ~iUptimeMillis2;
                            i24 = ((int) (j27 >> 32)) & ((-802173004) + ((897207642 | i718) * (-369)) + (((~((-812666203) | i718)) | 624560208) * (-369)) + (((~(iUptimeMillis2 | 812666202)) | 84541440 | (~(i718 | (-272647435)))) * 369));
                            int iMyTid3 = Process.myTid();
                            int i719 = ~iMyTid3;
                            i25 = ((int) j27) & (1180397306 + ((1325636515 | i719) * (-757)) + ((~((-273679377) | iMyTid3)) * 1514) + (((~(iMyTid3 | 1599315891)) | (~(i719 | (-1532104371))) | 1258424994) * 757));
                            if (((i25 & i24) | (i24 ^ i25)) == -2096167706) {
                                i16 = 1;
                                break;
                            }
                            i23 = (i23 ^ 1) + ((i23 & 1) << 1);
                            str = str;
                            i13 = i13;
                            i37 = i15;
                            i12 = i14;
                        }
                        i17 = (~(i26 & 20)) & (i26 | 20);
                        int i810 = (i16 | (-i16)) >> 31;
                        int i811 = (~i810) & i26;
                        int i812 = i810 & i17;
                        int i813 = (i812 & i811) | (i811 ^ i812);
                        int i814 = ((~i613) & i26) | (i613 & i14);
                        int i815 = (i814 | (-i814)) >> 31;
                        int i816 = i813 & (~i815);
                        int i817 = i613 & i815;
                        i7 = (i817 & i816) | (i816 ^ i817);
                        byte[] bArr8 = $$a;
                        byte b112 = bArr8[28];
                        byte b113 = b112;
                        Object[] objArr114 = new Object[1];
                        d(b112, b113, b113, objArr114);
                        Class<?> cls14 = Class.forName((String) objArr114[0]);
                        byte b114 = bArr8[7];
                        Object[] objArr210 = new Object[1];
                        d(b114, (byte) (b114 | 32), bArr8[40], objArr210);
                        String str10 = (String) cls14.getField((String) objArr210[0]).get(objInvoke);
                        int i818 = i10;
                        int i819 = ~i818;
                        int i910 = -i819;
                        int i911 = i818 & (((i819 & i910) | (i819 ^ i910)) >> 31);
                        i18 = 0;
                        String strSubstring3 = str10.substring(0, i911);
                        Object[] objArr211 = new Object[1];
                        c(new char[]{1468}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 9546, objArr211);
                        strArrSplit = strSubstring3.split((String) objArr211[0]);
                        length2 = strArrSplit.length;
                        i19 = 0;
                        while (i19 < length2) {
                            str2 = strArrSplit[i19];
                            int i912 = -(ExpandableListView.getPackedPositionForChild(i18, i18) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i18, i18) == 0L ? 0 : -1));
                            int iTuitionPaymentFragmentbindingInflater5 = addTask.TuitionPaymentFragmentbindingInflater1();
                            int i913 = i912 * (-1975);
                            int i914 = (i913 ^ 57114750) + ((i913 & 57114750) << 1);
                            int i915 = ~((~i912) | 57750);
                            int i916 = (i914 - (~(((iTuitionPaymentFragmentbindingInflater5 ^ i915) | (i915 & iTuitionPaymentFragmentbindingInflater5)) * 988))) - 1;
                            int i917 = ~(((-57751) ^ i912) | ((-57751) & i912));
                            int i918 = ~iTuitionPaymentFragmentbindingInflater5;
                            String[] strArr3 = strArrSplit;
                            int i919 = ~(i918 | i912);
                            int i1010 = -(-(((i917 ^ i919) | (i919 & i917)) * (-1976)));
                            int i1011 = ((i916 | i1010) << 1) - (i1010 ^ i916);
                            int i1012 = ~i912;
                            int i1013 = ~((i1012 & 57750) | (i1012 ^ 57750));
                            int i1014 = ~(((-57751) ^ iTuitionPaymentFragmentbindingInflater5) | (iTuitionPaymentFragmentbindingInflater5 & (-57751)));
                            int i1015 = -(-(((i1013 & i1014) | (i1013 ^ i1014) | (~(57750 | i918))) * 988));
                            objArr = new Object[1];
                            c(new char[]{1480, 58410, 50912}, (i1011 & i1015) + (i1015 | i1011), objArr);
                            if (str2.split((String) objArr[0]).length > 1) {
                                cls = (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2267, TextUtils.getCapsMode("", 0, 0) + 33);
                                synchronized (cls) {
                                    Object[] objArr212 = new Object[1];
                                    a(new int[]{41, 16, 105, 3}, false, new byte[]{0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0}, objArr212);
                                    String str11 = (String) objArr212[0];
                                    Runtime runtime2 = Runtime.getRuntime();
                                    char[] cArr2 = {1504, 51304};
                                    int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0);
                                    int i1016 = ~iLastIndexOf3;
                                    i20 = length2;
                                    int i1017 = ~((-52629) | i14);
                                    int i1018 = (i1016 ^ i1017) | (i1017 & i1016);
                                    int i1019 = ~(i26 | 52628);
                                    int i1110 = (((iLastIndexOf3 * (-563)) + 29734820) - (~(((i1018 ^ i1019) | (i1019 & i1018)) * (-564)))) - 1;
                                    int i1111 = ~iLastIndexOf3;
                                    int i1112 = (i1110 - (~((~(((i1111 ^ 52628) | (i1111 & 52628)) | i26)) * 1128))) - 1;
                                    int i1113 = ~((i1111 ^ i14) | (i1111 & i14));
                                    int i1114 = ~((52628 & iLastIndexOf3) | (iLastIndexOf3 ^ 52628));
                                    int i1115 = -(-(((i1113 & i1114) | (i1113 ^ i1114)) * 564));
                                    Object[] objArr213 = new Object[1];
                                    c(cArr2, (i1112 & i1115) + (i1115 | i1112), objArr213);
                                    processExec = runtime2.exec((String) objArr213[0], (String[]) null, (File) null);
                                    Object[] objArr214 = {processExec.getInputStream()};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 2141 - TextUtils.lastIndexOf("", '0', 0, 0), (ViewConfiguration.getTapTimeout() >> 16) + 45, -1020714777, false, null, new Class[]{InputStream.class});
                                    }
                                    Object objNewInstance3 = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr214);
                                    Object[] objArr215 = {processExec.getErrorStream()};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - ImageFormat.getBitsPerPixel(0)), 2142 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getTapTimeout() >> 16) + 45, -1020714777, false, null, new Class[]{InputStream.class});
                                    }
                                    Object objNewInstance4 = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr215);
                                    DataOutputStream dataOutputStream2 = new DataOutputStream(processExec.getOutputStream());
                                    byte[] bArr9 = $$a;
                                    obj2 = objInvoke;
                                    i21 = i19;
                                    i17 = i17;
                                    Object[] objArr216 = new Object[1];
                                    d(bArr9[9], (byte) (-bArr9[34]), (byte) (bArr9[45] - 1), objArr216);
                                    Class<?> cls15 = Class.forName((String) objArr216[0]);
                                    byte b115 = bArr9[35];
                                    byte b116 = (byte) 29;
                                    i7 = i7;
                                    Object[] objArr217 = new Object[1];
                                    d(b115, (byte) (b115 | 48), b116, objArr217);
                                    cls15.getMethod((String) objArr217[0], null).invoke(objNewInstance3, null);
                                    Object[] objArr218 = new Object[1];
                                    d(bArr9[9], (byte) (-bArr9[34]), (byte) (bArr9[45] - 1), objArr218);
                                    Class<?> cls16 = Class.forName((String) objArr218[0]);
                                    byte b117 = bArr9[35];
                                    Object[] objArr219 = new Object[1];
                                    d(b117, (byte) (b117 | 48), b116, objArr219);
                                    cls16.getMethod((String) objArr219[0], null).invoke(objNewInstance4, null);
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(str11);
                                    int iLastIndexOf4 = TextUtils.lastIndexOf("", '0', 0);
                                    int i1116 = iLastIndexOf4 * (-919);
                                    int i1117 = (i1116 & (-18323022)) + (i1116 | (-18323022));
                                    int i1118 = ~iLastIndexOf4;
                                    int i1119 = (i1118 ^ (-19939)) | (i1118 & (-19939));
                                    int i1210 = ~((i1119 ^ i26) | (i1119 & i26));
                                    int i1211 = ((-19939) ^ i14) | ((-19939) & i14);
                                    int i1212 = ~((i1211 ^ iLastIndexOf4) | (i1211 & iLastIndexOf4));
                                    int i1213 = (i1117 - (~(-(-(((i1210 ^ i1212) | (i1210 & i1212)) * 920))))) - 1;
                                    int i1214 = ~i1119;
                                    int i1215 = ~((i1118 ^ i15) | (i1118 & i15));
                                    int i1216 = ((i1214 & i1215) | (i1214 ^ i1215)) * 920;
                                    int i1217 = (i1213 ^ i1216) + ((i1216 & i1213) << 1);
                                    int i1218 = i1118 | (-19939);
                                    int i1219 = ~((i1218 & i15) | (i1218 ^ i15));
                                    int i1310 = ~iLastIndexOf4;
                                    int i1311 = (i1310 & 19938) | (i1310 ^ 19938);
                                    int i1312 = ~((i1311 & i26) | (i1311 ^ i26));
                                    int i1313 = (i1219 & i1312) | (i1219 ^ i1312);
                                    int i1314 = iLastIndexOf4 | (-19939);
                                    int i1315 = ~((i1314 & i26) | (i1314 ^ i26));
                                    int i1316 = ((i1315 & i1313) | (i1313 ^ i1315)) * 920;
                                    int i1317 = (i1217 ^ i1316) + ((i1316 & i1217) << 1);
                                    Object[] objArr310 = new Object[1];
                                    c(new char[]{1433}, i1317, objArr310);
                                    sb3.append((String) objArr310[0]);
                                    String string3 = sb3.toString();
                                    int iIndexOf3 = TextUtils.indexOf("", "", 0);
                                    int iTuitionPaymentFragmentbindingInflater6 = addTask.TuitionPaymentFragmentbindingInflater1();
                                    int i1318 = iIndexOf3 * 765;
                                    int i1319 = (i1318 & (-67430793)) + (i1318 | (-67430793));
                                    int i1410 = ~((~iTuitionPaymentFragmentbindingInflater6) | iIndexOf3);
                                    int i1411 = i1319 + (((i1410 & 44159) | (i1410 ^ 44159)) * 764);
                                    int i1412 = ~iIndexOf3;
                                    int i1413 = ~((i1412 & 44159) | (i1412 ^ 44159));
                                    int i1414 = ~iTuitionPaymentFragmentbindingInflater6;
                                    int i1415 = ~((i1414 ^ 44159) | (i1414 & 44159));
                                    int i1416 = -(-(((i1413 ^ i1415) | (i1413 & i1415)) * (-1528)));
                                    int i1417 = (i1411 & i1416) + (i1416 | i1411);
                                    int i1418 = ~((~iIndexOf3) | 44159);
                                    int i1419 = ~(((-44160) & iIndexOf3) | ((-44160) ^ iIndexOf3));
                                    int i1510 = (i1418 & i1419) | (i1418 ^ i1419);
                                    int i1511 = ~((iIndexOf3 & i1414) | (i1414 ^ iIndexOf3));
                                    int i1512 = -(-(((i1511 & i1510) | (i1510 ^ i1511)) * 764));
                                    Object[] objArr311 = new Object[1];
                                    c(new char[]{1478, 43448, 23851, 195, 46167}, (i1417 & i1512) + (i1512 | i1417), objArr311);
                                    dataOutputStream2.write(string3.getBytes((String) objArr311[0]));
                                    dataOutputStream2.flush();
                                    Object[] objArr312 = new Object[1];
                                    c(new char[]{1526, 60212, 55364, 51578, 48869}, 61151 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr312);
                                    String str12 = (String) objArr312[0];
                                    Object[] objArr313 = new Object[1];
                                    c(new char[]{1478, 43448, 23851, 195, 46167}, 44158 - (~(-(Process.myTid() >> 22))), objArr313);
                                    dataOutputStream2.write(str12.getBytes((String) objArr313[0]));
                                    dataOutputStream2.flush();
                                    long jNanoTime2 = System.nanoTime();
                                    long nanos2 = TimeUnit.MILLISECONDS.toNanos(2000L);
                                    while (true) {
                                        processExec.exitValue();
                                        cls = cls;
                                        str2 = str2;
                                        break;
                                    }
                                    dataOutputStream2.close();
                                    byte[] bArr10 = $$a;
                                    Object[] objArr314 = new Object[1];
                                    d(bArr10[9], (byte) (-bArr10[34]), (byte) (bArr10[45] - 1), objArr314);
                                    Class<?> cls17 = Class.forName((String) objArr314[0]);
                                    byte b210 = bArr10[9];
                                    byte b211 = (byte) (bArr10[21] + 1);
                                    Object[] objArr315 = new Object[1];
                                    d(b210, b211, (byte) (b211 & 95), objArr315);
                                    cls17.getMethod((String) objArr315[0], Long.TYPE).invoke(objNewInstance3, 100L);
                                    Object[] objArr316 = new Object[1];
                                    d(bArr10[9], (byte) (-bArr10[34]), (byte) (bArr10[45] - 1), objArr316);
                                    Class<?> cls18 = Class.forName((String) objArr316[0]);
                                    byte b212 = bArr10[9];
                                    byte b213 = (byte) (bArr10[21] + 1);
                                    Object[] objArr48 = new Object[1];
                                    d(b212, b213, (byte) (b213 & 95), objArr48);
                                    cls18.getMethod((String) objArr48[0], Long.TYPE).invoke(objNewInstance4, 10L);
                                    processExec.destroy();
                                    StringBuilder sb4 = new StringBuilder();
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char cIndexOf2 = (char) TextUtils.indexOf("", "", 0, 0);
                                        int touchSlop2 = 2142 - (ViewConfiguration.getTouchSlop() >> 8);
                                        int minimumFlingVelocity2 = 45 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                        byte b214 = (byte) ($$d[7] - 1);
                                        byte b215 = b214;
                                        Object[] objArr49 = new Object[1];
                                        e(b214, b215, b215, objArr49);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf2, touchSlop2, minimumFlingVelocity2, 399405187, false, (String) objArr49[0], null);
                                    }
                                    sb4.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(objNewInstance3).toString());
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                        char c2 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1);
                                        int windowTouchSlop2 = 2142 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                        int iResolveOpacity2 = 45 - Drawable.resolveOpacity(0, 0);
                                        byte b216 = (byte) ($$d[7] - 1);
                                        byte b217 = b216;
                                        Object[] objArr410 = new Object[1];
                                        e(b216, b217, b217, objArr410);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c2, windowTouchSlop2, iResolveOpacity2, 399405187, false, (String) objArr410[0], null);
                                    }
                                    sb4.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(objNewInstance4).toString());
                                    String string4 = sb4.toString();
                                    int i1612 = -(ViewConfiguration.getTapTimeout() >> 16);
                                    int i177 = (i1612 ^ 19937) + ((i1612 & 19937) << 1);
                                    Object[] objArr411 = new Object[1];
                                    c(new char[]{1433}, i177, objArr411);
                                    strArrSplit2 = string4.split((String) objArr411[0]);
                                    length3 = strArrSplit2.length;
                                    i22 = 0;
                                    while (true) {
                                        if (i22 < length3) {
                                            str3 = strArrSplit2[i22];
                                            objArr2 = new Object[1];
                                            a(new int[]{57, 19, 194, 8}, true, null, objArr2);
                                            if (str3.startsWith((String) objArr2[0])) {
                                                int i1513 = -(-(ViewConfiguration.getJumpTapTimeout() >> 16));
                                                objArr3 = new Object[1];
                                                c(new char[]{1507, 44209, 22390, 65073, 41214, 19387, 62052, 42364, 20456, 63143, 39264, 16476, 60118, 40346, 17501, 61196, 37324, 14473, 58177, 35396}, (i1513 & 43331) + (i1513 | 43331), objArr3);
                                                if (str3.startsWith((String) objArr3[0])) {
                                                    int iAxisFromString4 = MotionEvent.axisFromString("");
                                                    int i1514 = ~iAxisFromString4;
                                                    int i1515 = ~((i1514 ^ 5078) | (i1514 & 5078));
                                                    int i1516 = ~((i1514 & i26) | (i1514 ^ i26));
                                                    int i1517 = (i1516 & i1515) | (i1515 ^ i1516);
                                                    int i1518 = ~((i26 ^ 5078) | (i26 & 5078));
                                                    int i1519 = ((iAxisFromString4 * 755) - 3823734) + (((i1517 & i1518) | (i1517 ^ i1518)) * (-754));
                                                    int i1613 = ~iAxisFromString4;
                                                    int i1614 = i14 | iAxisFromString4;
                                                    int i1615 = i1519 + (((~((i1614 & 5078) | (i1614 ^ 5078))) | (~((i1613 ^ 5078) | (i1613 & 5078) | i26))) * (-754));
                                                    int i1616 = -(-((i1613 | i15) * 754));
                                                    int i1617 = (i1615 ^ i1616) + ((i1616 & i1615) << 1);
                                                    objArr4 = new Object[1];
                                                    c(new char[]{1507, 5671, 8794, 16007, 19110, 26333, 29448, 36730}, i1617, objArr4);
                                                    if (str3.startsWith((String) objArr4[0])) {
                                                        Object[] objArr412 = new Object[1];
                                                        c(new char[]{1449}, 29122 - (~(-(ViewConfiguration.getEdgeSlop() >> 16))), objArr412);
                                                        strArrSplit3 = str3.split((String) objArr412[0]);
                                                        if (strArrSplit3.length > 1) {
                                                            str4 = str2;
                                                            if (strArrSplit3[1].equalsIgnoreCase(str4)) {
                                                                int i1618 = (~(i26 & i7)) & (i26 | i7);
                                                                int i1619 = -i1618;
                                                                int i1620 = ((i1618 & i1619) | (i1618 ^ i1619)) >> 31;
                                                                i7 = (i7 & i1620) | (i17 & (~i1620));
                                                            }
                                                        } else {
                                                            str4 = str2;
                                                        }
                                                    } else {
                                                        str4 = str2;
                                                    }
                                                } else {
                                                    str4 = str2;
                                                }
                                            } else {
                                                str4 = str2;
                                            }
                                            i22++;
                                            str2 = str4;
                                        }
                                        int i16110 = ((i21 | (-84)) << 1) - (i21 ^ (-84));
                                        i19 = (i16110 ^ 85) + ((i16110 & 85) << 1);
                                        i17 = i17;
                                        strArrSplit = strArr3;
                                        length2 = i20;
                                        objInvoke = obj2;
                                        i18 = 0;
                                    }
                                }
                            } else {
                                i7 = i7;
                                i17 = i17;
                                i20 = length2;
                                obj2 = objInvoke;
                                i21 = i19;
                            }
                            i7 = i7;
                            int i16111 = ((i21 | (-84)) << 1) - (i21 ^ (-84));
                            i19 = (i16111 ^ 85) + ((i16111 & 85) << 1);
                            i17 = i17;
                            strArrSplit = strArr3;
                            length2 = i20;
                            objInvoke = obj2;
                            i18 = 0;
                        }
                        obj = objInvoke;
                        i6 = 1;
                    }
                } else {
                    obj = objInvoke;
                    i6 = 1;
                    i7 = i26;
                }
                String[] strArr4 = new String[i6];
                byte[] bArr11 = $$a;
                byte b30 = bArr11[28];
                byte b31 = b30;
                Object[] objArr50 = new Object[i6];
                d(b30, b31, b31, objArr50);
                Class<?> cls19 = Class.forName((String) objArr50[0]);
                byte b32 = bArr11[7];
                Object[] objArr51 = new Object[1];
                d(b32, (byte) (b32 | 32), bArr11[40], objArr51);
                strArr4[0] = cls19.getField((String) objArr51[0]).get(obj);
                Object obj3 = new Object[]{new int[i6], strArr4}[0];
                ((int[]) obj3)[0] = i7;
                i5 = ((int[]) obj3)[0];
                String[] strArr5 = strArr4;
                if ((i2 & 1) == 0) {
                    Object[] objArr52 = new Object[1];
                    a(new int[]{76, 13, 105, 3}, true, null, objArr52);
                    try {
                        Object[] objArr53 = {(String) objArr52[0]};
                        Object[] objArr54 = new Object[1];
                        a(new int[]{0, 23, 0, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0}, objArr54);
                        Class<?> cls20 = Class.forName((String) objArr54[0]);
                        Object[] objArr55 = new Object[1];
                        a(new int[]{89, 16, 0, 15}, true, new byte[]{1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr55);
                        Object objInvoke2 = cls20.getMethod((String) objArr55[0], String.class).invoke(context, objArr53);
                        if (objInvoke2 == null) {
                            strArr5 = strArr5;
                            i4 = i26;
                            i8 = i5;
                            i9 = i4;
                            break;
                        }
                        char[] cArr3 = {1522, 13322, 26137, 36868, 49696, 64553, 11837, 22652, 35402, 50252, 63045, Typography.dagger, 21094, 35964, 48764, 59523, 6797, 21722, 34441, 45219, 58025, 7353, 20170, 30919, 43755, 58595, 5865, 16631, 29428, 44305, 57132, 2331, 15133, 29989, 42810, 53555, 861};
                        int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        int i178 = (iIndexOf4 ^ 12792) + ((iIndexOf4 & 12792) << 1);
                        Object[] objArr56 = new Object[1];
                        c(cArr3, i178, objArr56);
                        Class<?> cls21 = Class.forName((String) objArr56[0]);
                        Object[] objArr57 = new Object[1];
                        a(new int[]{105, 15, 25, 11}, false, new byte[]{0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1}, objArr57);
                        List list = (List) cls21.getMethod((String) objArr57[0], null).invoke(objInvoke2, null);
                        if (list == null) {
                            strArr5 = strArr5;
                            i4 = i26;
                            i8 = i5;
                            i9 = i4;
                            break;
                        }
                        Iterator it = list.iterator();
                        loop5: while (true) {
                            if (!it.hasNext()) {
                                strArr5 = strArr5;
                                i4 = i26;
                                i8 = i5;
                                i9 = i4;
                                break;
                            }
                            Object next = it.next();
                            Object[] objArr58 = new Object[1];
                            a(new int[]{120, 29, 0, 8}, false, new byte[]{0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1}, objArr58);
                            Class<?> cls22 = Class.forName((String) objArr58[0]);
                            int threadPriority2 = Process.getThreadPriority(0);
                            int i179 = 15680 + (threadPriority2 * (-782));
                            int i180 = -(-((~threadPriority2) * (-783)));
                            int i181 = (i179 & i180) + (i180 | i179);
                            int i182 = ~i26;
                            int i183 = (i181 - (~((~(((i182 & (-21)) | ((-21) ^ i182)) | threadPriority2)) * (-783)))) - 1;
                            int i184 = ~i26;
                            int i185 = ~(threadPriority2 | i184);
                            int i186 = 3137 - ((i183 + (((i185 & (-21)) | ((-21) ^ i185)) * 783)) >> 6);
                            Object[] objArr59 = new Object[1];
                            c(new char[]{1524, 2487, 7525, 8448, 13558, 14517, 19582, 20533, 26620, 27583, 32599, 33593, 38642, 39611}, i186, objArr59);
                            String str13 = (String) cls22.getMethod((String) objArr59[0], null).invoke(next, null);
                            char[] cArr4 = {1522, 13322, 26137, 36868, 49696, 64553, 11837, 22652, 35402, 50252, 63045, Typography.dagger, 21094, 35964, 48764, 59523, 6797, 21722, 34441, 45219, 58025, 7353, 20170, 30919, 43755, 58595, 5865, 16631, 29428, 44305, 57132, 2331, 15133, 29989, 42810, 53555, 861};
                            int iResolveOpacity3 = Drawable.resolveOpacity(0, 0);
                            int i187 = iResolveOpacity3 * 628;
                            int i188 = (i187 & 8032748) + (i187 | 8032748);
                            int i189 = (i26 ^ 12791) | (i26 & 12791);
                            int i190 = ~iResolveOpacity3;
                            int i191 = -(-(((i189 & i190) | (i189 ^ i190)) * (-627)));
                            int i192 = ((i188 | i191) << 1) - (i191 ^ i188);
                            int i193 = ~(((-12792) & i26) | ((-12792) ^ i26));
                            int i194 = -(-(((i193 & iResolveOpacity3) | (iResolveOpacity3 ^ i193)) * (-627)));
                            int i195 = (i192 ^ i194) + ((i194 & i192) << 1);
                            int i196 = ~((i184 ^ 12791) | (i184 & 12791));
                            int i197 = ~(iResolveOpacity3 | i26);
                            int i198 = -(-(((i196 & i197) | (i196 ^ i197)) * 627));
                            int i199 = (i195 ^ i198) + ((i198 & i195) << 1);
                            Object[] objArr60 = new Object[1];
                            c(cArr4, i199, objArr60);
                            Class<?> cls23 = Class.forName((String) objArr60[0]);
                            Object[] objArr61 = new Object[1];
                            a(new int[]{149, 17, 127, 0}, false, new byte[]{0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0}, objArr61);
                            if (((Boolean) cls23.getMethod((String) objArr61[0], String.class).invoke(objInvoke2, str13)).booleanValue() && (length = str13.length() - 20) >= 0) {
                                int i200 = 0;
                                while (i200 <= length) {
                                    Object[] objArr62 = {str13.substring(i200, i200 + 20), 931995};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                        char c3 = (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                        int i201 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3393;
                                        int touchSlop3 = (ViewConfiguration.getTouchSlop() >> 8) + 9;
                                        byte b33 = $$d[7];
                                        Object[] objArr63 = new Object[1];
                                        e(b33, (byte) 14, (byte) (b33 - 1), objArr63);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(c3, i201, touchSlop3, 1203525406, false, (String) objArr63[0], new Class[]{String.class, Integer.TYPE});
                                    }
                                    long jLongValue4 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr62)).longValue();
                                    long j28 = 22698450;
                                    Object obj4 = objInvoke2;
                                    Iterator it2 = it;
                                    long j29 = 530;
                                    long j30 = ((long) 1058) + (j29 * j28) + (j29 * jLongValue4);
                                    long j31 = 529;
                                    String str14 = str13;
                                    int i202 = length;
                                    long j32 = i26;
                                    i8 = i5;
                                    long j33 = -1;
                                    long j34 = j30 + (((((j32 ^ j33) | j28) ^ j33) | ((j28 | jLongValue4) ^ j33)) * j31) + (j31 * (((j32 | j28) ^ j33) | (jLongValue4 ^ j33))) + ((long) (-24768327));
                                    int startElapsedRealtime2 = (int) Process.getStartElapsedRealtime();
                                    int i203 = ((int) (j34 >> 32)) & ((((~((-828032325) | startElapsedRealtime2)) | 286278912) * (-566)) + 262333354 + ((~(startElapsedRealtime2 | (-541753413))) * 566));
                                    int iMyPid = Process.myPid();
                                    int i204 = ~iMyPid;
                                    int i205 = ((int) j34) & (404556913 + (((-1209514664) | iMyPid) * 140) + (((~((-1209514664) | i204)) | 1074077861) * (-280)) + (((~(iMyPid | (-1074077862))) | (~((-227711747) | i204)) | 92274944) * 140));
                                    if (((i203 & i205) | (i203 ^ i205)) == 1245577864) {
                                        i4 = i;
                                        i9 = (~(i4 & 70)) & (i4 | 70);
                                        break loop5;
                                    }
                                    i200 = (i200 ^ 1) + ((i200 & 1) << 1);
                                    objInvoke2 = obj4;
                                    it = it2;
                                    i26 = i;
                                    length = i202;
                                    strArr5 = strArr5;
                                    str13 = str14;
                                    i5 = i8;
                                }
                            }
                            objInvoke2 = objInvoke2;
                            it = it;
                            i26 = i26;
                            strArr5 = strArr5;
                            i5 = i5;
                        }
                        int i206 = (~(i4 & i8)) & (i4 | i8);
                        int i207 = -i206;
                        int i208 = ((i206 & i207) | (i206 ^ i207)) >> 31;
                        i5 = (i8 & i208) | (i9 & (~i208));
                    } catch (Throwable th23) {
                        Throwable cause9 = th23.getCause();
                        if (cause9 != null) {
                            throw cause9;
                        }
                        throw th23;
                    }
                } else {
                    strArr5 = strArr5;
                    i4 = i26;
                }
                strArr = strArr5;
            } catch (Throwable th24) {
                Throwable cause10 = th24.getCause();
                if (cause10 != null) {
                    throw cause10;
                }
                throw th24;
            }
        } else {
            i4 = i26;
            i5 = i4;
            strArr = null;
        }
        Object[] objArr64 = new Object[1];
        a(new int[]{166, 12, 44, 0}, true, new byte[]{1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0}, objArr64);
        Object[] objArr65 = {(String) objArr64[0]};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
            int iIndexOf5 = TextUtils.indexOf("", "", 0) + 993;
            int iAxisFromString5 = 7 - MotionEvent.axisFromString("");
            byte[] bArr12 = $$d;
            byte b34 = bArr12[7];
            Object[] objArr66 = new Object[1];
            e(b34, (byte) (-bArr12[15]), b34, objArr66);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cAxisFromString, iIndexOf5, iAxisFromString5, -545305915, false, (String) objArr66[0], new Class[]{String.class});
        }
        long jLongValue5 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr65)).longValue();
        long j35 = -530950075;
        long j36 = 130;
        long j37 = -1;
        long j38 = jLongValue5 ^ j37;
        int i209 = i5;
        long jFreeMemory = (int) Runtime.getRuntime().freeMemory();
        long j39 = (((long) (-129)) * j35) + (((long) 131) * jLongValue5) + ((((j38 | (jFreeMemory ^ j37)) | j35) ^ j37) * j36);
        long j40 = j38 | j35;
        long j41 = j39 + (((long) (-260)) * (j40 ^ j37)) + (j36 * (((j40 | jFreeMemory) ^ j37) | ((jLongValue5 | (j35 ^ j37)) ^ j37))) + ((long) 1151409359);
        int i210 = ~i4;
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i211 = ~iFreeMemory;
        int i212 = (~((-1771167604) | i211)) | 688919825 | (~(1086573282 | i211));
        int i213 = (((int) (j41 >> 32)) & (1520786966 + (((~(i210 | 1723713995)) | 285357088) * 529) + (((~(1723713995 | i4)) | 286487584) * 529))) | (((int) j41) & ((-1253502845) + (((~(iFreeMemory | (-4325505))) | i212) * 590) + (i212 * (-1180)) + (((~((-1086573283) | i211)) | (~(i211 | 1771167603))) * 590)));
        int i214 = (~(i4 & 50)) & (i4 | 50);
        int i215 = -i213;
        int i216 = ((i213 & i215) | (i213 ^ i215)) >> 31;
        int i217 = (~i216) & i4;
        int i218 = i216 & i214;
        int i219 = (i218 & i217) | (i217 ^ i218);
        int i220 = ((~i209) & i4) | (i209 & i210);
        int i221 = -i220;
        int i222 = ((i220 & i221) | (i220 ^ i221)) >> 31;
        int i223 = i219 & (~i222);
        int i224 = i209 & i222;
        int i225 = (i223 & i224) | (i223 ^ i224);
        Object[] objArr67 = new Object[1];
        a(new int[]{178, 20, 190, 17}, false, new byte[]{1, 1, 1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0}, objArr67);
        Object[] objArr68 = {(String) objArr67[0]};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char maximumFlingVelocity2 = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            int keyRepeatDelay = 993 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 8;
            byte[] bArr13 = $$d;
            byte b35 = bArr13[7];
            Object[] objArr69 = new Object[1];
            e(b35, (byte) (-bArr13[15]), b35, objArr69);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(maximumFlingVelocity2, keyRepeatDelay, edgeSlop, -545305915, false, (String) objArr69[0], new Class[]{String.class});
        }
        long jLongValue6 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr68)).longValue();
        long j42 = -687904754;
        long j43 = -167;
        long j44 = (j43 * j42) + (j43 * jLongValue6);
        long j45 = 168;
        long j46 = j42 ^ j37;
        long j47 = jLongValue6 ^ j37;
        long j48 = j46 | j47;
        long j49 = i4;
        long j50 = j49 ^ j37;
        long j51 = j44 + (((j48 ^ j37) | ((j47 | j50) ^ j37)) * j45) + (((j48 | j49) ^ j37) * j45) + (j45 * (((j46 | j50) ^ j37) | ((j46 | jLongValue6) ^ j37) | (((j47 | j42) | j49) ^ j37))) + ((long) 1308364038);
        int i226 = ((int) (j51 >> 32)) & ((-2055567968) + (((~(1482618477 | i210)) | (-1375122408)) * 226) + (((~(1375122407 | i4)) | 134759432 | (~((-27263363) | i210))) * (-113)) + ((~(1482618477 | i4)) * 113));
        int i227 = (int) Runtime.getRuntime().totalMemory();
        int i228 = ~i227;
        int i229 = i226 | (((int) j51) & ((-1687905466) + (((~((-633837132) | i228)) | (-2071063542)) * (-90)) + (((~((-633837132) | i227)) | 1513122228) * (-45)) + (((~(i227 | 2071063541)) | (-633837132) | (~(i228 | (-2071063542)))) * 45)));
        int i230 = (~(i4 & 60)) & (i4 | 60);
        int i231 = -i229;
        int i232 = ((i229 & i231) | (i229 ^ i231)) >> 31;
        int i233 = (~i232) & i4;
        int i234 = i232 & i230;
        int i235 = (i234 & i233) | (i233 ^ i234);
        int i236 = i4 ^ i225;
        int i237 = -i236;
        int i238 = ((i236 & i237) | (i236 ^ i237)) >> 31;
        int i239 = i235 & (~i238);
        int i240 = i225 & i238;
        int i241 = (i239 & i240) | (i239 ^ i240);
        int i242 = -Color.blue(0);
        int iTuitionPaymentFragmentbindingInflater7 = addTask.TuitionPaymentFragmentbindingInflater1();
        int i243 = i242 * (-375);
        int i244 = (i243 ^ (-8122875)) + ((i243 & (-8122875)) << 1);
        int i245 = ~((~i242) | (-21662));
        int i246 = (i245 & iTuitionPaymentFragmentbindingInflater7) | (iTuitionPaymentFragmentbindingInflater7 ^ i245);
        int i247 = ~(i242 | 21661);
        int i248 = ((i246 & i247) | (i246 ^ i247)) * 376;
        int i249 = (i244 & i248) + (i248 | i244);
        int i250 = ~iTuitionPaymentFragmentbindingInflater7;
        int i251 = ~((i250 & i242) | (i250 ^ i242));
        int i252 = ~((i242 ^ 21661) | (i242 & 21661));
        int i253 = -(-(((i251 & i252) | (i251 ^ i252)) * (-376)));
        int i254 = ~i242;
        int i255 = ~((i254 & iTuitionPaymentFragmentbindingInflater7) | (i254 ^ iTuitionPaymentFragmentbindingInflater7));
        Object[] objArr70 = new Object[1];
        c(new char[]{1468, 20842, 44232, 63536, 22406, 41645, 65113, 21945, 41231, 64631, 19358, 42831, 62112, 19975, 42283, 61639, 19489, 39825, 63201, 16922, 39350, 62748, 16521, 40954, 60228, 18095, 37381, 59699, 17609, 36924, 61318, 15055, 38487, 60879, 14653, 38021}, (i249 ^ i253) + ((i253 & i249) << 1) + (((i255 & 21661) | (i255 ^ 21661)) * 376), objArr70);
        Object[] objArr71 = {(String) objArr70[0]};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
            char windowTouchSlop3 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
            int i256 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 992;
            int trimmedLength = 8 - TextUtils.getTrimmedLength("");
            byte b36 = $$d[7];
            byte b37 = b36;
            Object[] objArr72 = new Object[1];
            e(b37, (byte) (b37 | 12), b36, objArr72);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(windowTouchSlop3, i256, trimmedLength, 349342683, false, (String) objArr72[0], new Class[]{String.class});
        }
        long jLongValue7 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr71)).longValue();
        long j52 = 1255944199;
        long j53 = (((long) (-464)) * j52) + (((long) (-929)) * jLongValue7);
        long j54 = j52 ^ j37;
        long jElapsedRealtime = (int) SystemClock.elapsedRealtime();
        long j55 = jLongValue7 | jElapsedRealtime;
        long j56 = j53 + (((long) (-465)) * (j54 | (j55 ^ j37))) + (((long) 930) * (jLongValue7 | ((jElapsedRealtime | j54) ^ j37))) + (((long) 465) * (j55 | j54)) + ((long) (-2103022804));
        int i257 = ((int) (j56 >> 32)) & ((-1529975046) + (((~((-1728711160) | i210)) | 603982242) * 184) + ((4300808 | i4) * (-184)) + ((~(1129029725 | i210)) * 184));
        int iMyUid = Process.myUid();
        int i258 = ~iMyUid;
        int i259 = ((int) j56) & (((((~((-134480938) | i258)) | (~((-113924289) | iMyUid))) * 988) - 296014287) + (((~(iMyUid | 1188821184)) | (-1323302122) | (~(i258 | (-113924289)))) * 988));
        int i260 = (i259 & i257) | (i257 ^ i259);
        int i261 = -i260;
        int i262 = ((i260 & i261) | (i260 ^ i261)) >> 31;
        int i263 = (~i262) & i4;
        int i264 = i262 & ((i4 & (-81)) | (i210 & 80));
        int i265 = (i264 & i263) | (i263 ^ i264);
        int i266 = ((~i241) & i4) | (i241 & i210);
        int i267 = -i266;
        int i268 = ((i266 & i267) | (i266 ^ i267)) >> 31;
        int i269 = i265 & (~i268);
        int i270 = i241 & i268;
        int i271 = (i269 & i270) | (i269 ^ i270);
        int i272 = -MotionEvent.axisFromString("");
        int iTuitionPaymentFragmentbindingInflater8 = addTask.TuitionPaymentFragmentbindingInflater1();
        int i273 = i272 * (-496);
        int i274 = (i273 ^ (-9999360)) + ((i273 & (-9999360)) << 1);
        int i275 = ~i272;
        int i276 = (~((i275 ^ (-20161)) | (i275 & (-20161)))) * 497;
        int i277 = (i274 ^ i276) + ((i276 & i274) << 1);
        int i278 = ~i272;
        int i279 = (i278 ^ (-20161)) | (i278 & (-20161));
        int i280 = ~((i279 & iTuitionPaymentFragmentbindingInflater8) | (i279 ^ iTuitionPaymentFragmentbindingInflater8));
        int i281 = ~iTuitionPaymentFragmentbindingInflater8;
        int i282 = ~(((-20161) & i281) | ((-20161) ^ i281) | i272);
        int i283 = -(-(((i280 & i282) | (i280 ^ i282)) * 497));
        int i284 = (i277 & i283) + (i283 | i277);
        int i285 = ~((i275 & i281) | (i275 ^ i281));
        int i286 = ~((i278 & 20160) | (i278 ^ 20160));
        int i287 = (i285 & i286) | (i285 ^ i286);
        int i288 = (i272 & (-20161)) | ((-20161) ^ i272);
        int i289 = ~((i288 & iTuitionPaymentFragmentbindingInflater8) | (i288 ^ iTuitionPaymentFragmentbindingInflater8));
        int i290 = ((i289 & i287) | (i287 ^ i289)) * 497;
        Object[] objArr73 = new Object[1];
        c(new char[]{1468, 19254, 39024, 59812, 16118, 35961, 56689, 8885, 29679, 49467, 5686, 26555, 46320, 64051, 19251, 39103, 59887, 16173, 35951, 56741, 8873, 28711, 49515, 5792, 26617, 46373, 64096, 19372, 39073, 60970, 16248, 36013, 56799, 9052, 28738, 49536, 5846, 25621, 46416, 64219, 19405, 39191}, (i284 & i290) + (i290 | i284), objArr73);
        Object[] objArr74 = {(String) objArr73[0]};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
            char size = (char) View.MeasureSpec.getSize(0);
            int touchSlop4 = 993 - (ViewConfiguration.getTouchSlop() >> 8);
            int i291 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 8;
            byte b38 = $$d[7];
            byte b39 = b38;
            Object[] objArr75 = new Object[1];
            e(b39, (byte) (b39 | 12), b38, objArr75);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(size, touchSlop4, i291, 349342683, false, (String) objArr75[0], new Class[]{String.class});
        }
        long jLongValue8 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr74)).longValue();
        long j57 = 346941475;
        long j58 = jLongValue8 ^ j37;
        long jMaxMemory = (((long) ((int) Runtime.getRuntime().maxMemory())) | jLongValue8) ^ j37;
        long j59 = (((long) (-391)) * j57) + (((long) (-195)) * jLongValue8) + (((long) (-196)) * (((j58 | j57) ^ j37) | jMaxMemory)) + (((long) 392) * (jLongValue8 | j57)) + (((long) 196) * (jMaxMemory | (((j57 ^ j37) | j58) ^ j37))) + ((long) (-1194020080));
        int i292 = ((int) (j59 >> 32)) & (1068904689 + (((~((-13170031) | i)) | 1450396441) * 191) + (((~((-13170031) | i210)) | 4210952) * 191));
        int i293 = (~((int) Runtime.getRuntime().freeMemory())) | (-1750855163);
        int i294 = ((int) j59) & ((-1495876540) + (i293 * 495) + (((~i293) | 312479744) * 495));
        int i295 = (i292 & i294) | (i292 ^ i294);
        int i296 = -i295;
        int i297 = ((i295 & i296) | (i295 ^ i296)) >> 31;
        int i298 = (~i297) & i;
        int i299 = i297 & ((i & (-91)) | (i210 & 90));
        int i300 = (i299 & i298) | (i298 ^ i299);
        int i301 = ((~i271) & i) | (i271 & i210);
        int i302 = -i301;
        int i303 = ((i301 & i302) | (i301 ^ i302)) >> 31;
        int i304 = (i300 & (~i303)) | (i271 & i303);
        int i305 = -Process.getGidForName("");
        int i306 = i305 * (-112);
        int i307 = (i306 & (-5448352)) + (i306 | (-5448352));
        int i308 = ~i;
        int i309 = ~((i308 & (-48647)) | ((-48647) ^ i308));
        int i310 = -(-(((i309 & i305) | (i305 ^ i309)) * 226));
        int i311 = ((i307 | i310) << 1) - (i310 ^ i307);
        int i312 = ~i305;
        int i313 = ~((i312 & 48646) | (i312 ^ 48646));
        int i314 = ~i305;
        int i315 = ~((i314 & i) | (i314 ^ i));
        int i316 = (i313 & i315) | (i313 ^ i315);
        int i317 = ~(i305 | (-48647) | i210);
        int i318 = i311 + (((i317 & i316) | (i316 ^ i317)) * (-113)) + ((~(((-48647) & i) | ((-48647) ^ i))) * 113);
        Object[] objArr76 = new Object[1];
        c(new char[]{1468, 48113, 31209, 16357, 64928, 46041, 29143, 14283, 62943, 43906, 27041, 12215, 60851, 41897, 24991, 10196, 58768, 39820}, i318, objArr76);
        Object[] objArr77 = {(String) objArr76[0]};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
            char cIndexOf3 = (char) TextUtils.indexOf("", "", 0);
            int modifierMetaStateMask = 992 - ((byte) KeyEvent.getModifierMetaStateMask());
            int i319 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 7;
            byte b40 = $$d[7];
            byte b41 = b40;
            Object[] objArr78 = new Object[1];
            e(b41, (byte) (b41 | 12), b40, objArr78);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cIndexOf3, modifierMetaStateMask, i319, 349342683, false, (String) objArr78[0], new Class[]{String.class});
        }
        long jLongValue9 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr77)).longValue();
        long j60 = -596926026;
        long j61 = 370;
        long j62 = (j61 * j60) + (j61 * jLongValue9);
        long j63 = -369;
        long j64 = (j60 ^ j37) | j50;
        long j65 = j62 + ((j60 | jLongValue9 | j50) * j63) + (j63 * (jLongValue9 | (j64 ^ j37))) + (((long) 369) * (((j64 | jLongValue9) ^ j37) | (((jLongValue9 ^ j37) | j60) ^ j37) | ((j60 | j49) ^ j37))) + ((long) (-250152579));
        int i320 = ((int) (j65 >> 32)) & ((-2055567968) + (((~(1417728923 | i210)) | (-1440011962)) * 226) + (((~(1440011961 | i)) | 258 | (~((-22283297) | i210))) * (-113)) + ((~(1417728923 | i)) * 113));
        int i321 = ((int) j65) & (270987803 + (((~(1590596548 | i)) | 18885658 | (~((-1456112069) | i210))) * 886) + (((~((-1590596549) | i210)) | 153370138) * (-1772)) + ((~(i210 | 153370138)) * 886));
        int i322 = (i320 & i321) | (i320 ^ i321);
        int i323 = -i322;
        int i324 = ((i322 & i323) | (i322 ^ i323)) >> 31;
        int i325 = (i324 & (~(i & 100)) & (i | 100)) | ((~i324) & i);
        int i326 = ((~i304) & i) | (i304 & i210);
        int i327 = -i326;
        int i328 = ((i326 & i327) | (i326 ^ i327)) >> 31;
        int i329 = i325 & (~i328);
        int i330 = i304 & i328;
        int i331 = (i330 & i329) | (i329 ^ i330);
        Object[] objArr79 = {new int[]{i}, strArr, new int[1], new int[]{i331}};
        int i332 = (~(i & i331)) & (i | i331);
        int i333 = -i332;
        int i334 = (((i332 & i333) | (i332 ^ i333)) >> 31) & 16;
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i335 = ~iMaxMemory;
        int i336 = (((~((-346058431) | i335)) | (~(iMaxMemory | 462654885))) * 959) + 955564923 + (((~(iMaxMemory | (-346058431))) | (~(i335 | 462654885))) * 959);
        int i337 = (i336 & i334) + (i336 | i334);
        int iTuitionPaymentFragmentbindingInflater9 = addTask.TuitionPaymentFragmentbindingInflater1();
        int i338 = i337 * (-520);
        int i339 = -(-(i3 * 522));
        int i340 = (i338 ^ i339) + ((i338 & i339) << 1);
        int i341 = ~i337;
        int i342 = (i341 ^ i3) | (i341 & i3);
        int i343 = i340 + ((~((i342 & iTuitionPaymentFragmentbindingInflater9) | (i342 ^ iTuitionPaymentFragmentbindingInflater9))) * 521);
        int i344 = ~i3;
        int i345 = i343 + ((~((i344 & i337) | (i344 ^ i337))) * (-1042));
        int i346 = ~i3;
        int i347 = ~((i337 & i346) | (i346 ^ i337));
        int i348 = ~iTuitionPaymentFragmentbindingInflater9;
        int i349 = (i348 & i341) | (i341 ^ i348);
        int i350 = (i345 - (~((i347 | (~((i349 & i3) | (i349 ^ i3)))) * 521))) - 1;
        int i351 = i350 << 13;
        int i352 = (i351 & (~i350)) | ((~i351) & i350);
        int i353 = i352 >>> 17;
        int i354 = ((~i352) & i353) | ((~i353) & i352);
        int i355 = i354 << 5;
        ((int[]) objArr79[2])[0] = ((~i354) & i355) | ((~i355) & i354);
        return objArr79;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, byte r7, short r8) {
        /*
            int r6 = r6 * 3
            int r6 = r6 + 4
            byte[] r0 = defpackage.BufferedAudioStream.$$c
            int r8 = 105 - r8
            int r7 = r7 * 4
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L27
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r6]
            r5 = r3
            r3 = r8
            r8 = r5
        L27:
            int r8 = -r8
            int r8 = r8 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.BufferedAudioStream.$$g(byte, byte, short):java.lang.String");
    }
}

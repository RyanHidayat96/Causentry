package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u0012\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u000f\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0002\b\u0014R\t\u0010\t\u001a\u00020\nX\u0082\u0004¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/DispatchedCoroutine;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/internal/ScopeCoroutine;", "context", "Lkotlin/coroutines/CoroutineContext;", "uCont", "Lkotlin/coroutines/Continuation;", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "_decision", "Lkotlinx/atomicfu/AtomicInt;", "trySuspend", "", "tryResume", "afterCompletion", "", RemoteConfigConstants.ResponseFieldKey.STATE, "", "afterResume", "getResult", "getResult$kotlinx_coroutines_core", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AudioEncoderConfigDefaultResolver<T> extends onOutputBufferAvailable<T> {
    private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static final /* synthetic */ AtomicIntegerFieldUpdater TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int asBinder;
    private volatile /* synthetic */ int _decision$volatile;
    private static final byte[] $$c = {19, 78, 114, 113};
    private static final int $$f = 151;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {38, 31, -70, -1, -8, -25, 26, -41, -14, -11, -12, 3, -6, -28, 36, -46, 2, -16, -8, 21, -51, -13, -5, 2, -29, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55};
    private static final int $$e = 3;
    private static final byte[] $$a = {49, 89, 41, 48, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$b = 72;
    private static int g = 0;
    private static int d = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 4
            int r6 = 84 - r6
            byte[] r0 = defpackage.AudioEncoderConfigDefaultResolver.$$a
            int r8 = r8 * 15
            int r1 = r8 + 38
            int r7 = r7 * 52
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            int r8 = r8 + 37
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L2e
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2e:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + (-11)
            int r7 = r3 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AudioEncoderConfigDefaultResolver.c(byte, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 19
            int r5 = 103 - r5
            int r7 = r7 + 4
            int r6 = r6 * 31
            int r0 = r6 + 22
            byte[] r1 = defpackage.AudioEncoderConfigDefaultResolver.$$d
            byte[] r0 = new byte[r0]
            int r6 = r6 + 21
            r2 = 0
            if (r1 != 0) goto L16
            r4 = r6
            r3 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r6) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L26:
            r4 = r1[r7]
            int r3 = r3 + 1
        L2a:
            int r4 = -r4
            int r5 = r5 + r4
            int r5 = r5 + (-10)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AudioEncoderConfigDefaultResolver.f(short, byte, short, java.lang.Object[]):void");
    }

    private static void e(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = -1870535734;
        char c = '0';
        int i5 = 1;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = $10 + 91;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i6] = Integer.valueOf(iArr2[i9]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) i6;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Color.blue(i6), TextUtils.lastIndexOf("", c, i6) + 3292, Color.red(i6) + 31, 1948206109, false, $$g(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i9++;
                    i4 = -1870535734;
                    c = '0';
                    i6 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        long j = 0;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                try {
                    Object[] objArr3 = new Object[i5];
                    objArr3[0] = Integer.valueOf(iArr5[i10]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - ImageFormat.getBitsPerPixel(0)), 3290 - ExpandableListView.getPackedPositionChild(j), TextUtils.lastIndexOf("", '0') + 32, 1948206109, false, $$g(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr6[i10] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    i10++;
                    iArr5 = iArr5;
                    j = 0;
                    i5 = 1;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            int i11 = $10 + 53;
            $11 = i11 % 128;
            i2 = 2;
            int i12 = i11 % 2;
            iArr5 = iArr6;
        } else {
            i2 = 2;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        sessionConfigValidatingBuilder.b = i2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i13 = 17;
            for (int i14 = 1; i13 > i14; i14 = 1) {
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i13];
                Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), TextUtils.indexOf("", "", 0, 0) + 2559, View.MeasureSpec.getMode(0) + 29, 683220507, false, $$g(b5, b6, b6), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                i13--;
            }
            int i15 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i15;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i16 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr5 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0') + 28880), KeyEvent.normalizeMetaState(0) + 348, 25 - (Process.myPid() >> 22), -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public AudioEncoderConfigDefaultResolver(CoroutineContext coroutineContext, Continuation<? super T> continuation) {
        super(coroutineContext, continuation);
    }

    private final boolean RemoteActionCompatParcelizer() throws Throwable {
        Object[] objArr;
        Object[] objArr2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = d + 69;
        g = i4 % 128;
        int i5 = i4 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char scrollDefaultDelay = (char) (43042 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 3111;
            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 22;
            byte[] bArr = $$a;
            byte b = bArr[7];
            Object[] objArr3 = new Object[1];
            c(b, b, bArr[5], objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollDefaultDelay, keyRepeatDelay, absoluteGravity, -1272852037, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        e(new int[]{1218973797, -985533559, -1535866553, 2006405761, 90287986, -385663015, -504354704, 948026655, 1078320451, -1494083546, -890292157, -786827687, -1850311244, -1905837679}, TextUtils.indexOf("", "") + 22, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        e(new int[]{1509578723, -1193868176, 1623269007, 1658956352, -2030687814, -943558433, 546669274, -430857936, -2001214866, 959917386}, TextUtils.indexOf("", "") + 15, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char doubleTapTimeout = (char) (43042 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
            int capsMode = 3111 - TextUtils.getCapsMode("", 0, 0);
            int threadPriority = 22 - ((Process.getThreadPriority(0) + 20) >> 6);
            byte[] bArr2 = $$a;
            byte b2 = bArr2[7];
            byte b3 = bArr2[5];
            Object[] objArr6 = new Object[1];
            c(b2, b3, b3, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(doubleTapTimeout, capsMode, threadPriority, -1269618118, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 43042);
                int i6 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3111;
                int iIndexOf = TextUtils.indexOf("", "") + 22;
                byte[] bArr3 = $$a;
                byte b4 = bArr3[7];
                Object[] objArr7 = new Object[1];
                c(b4, bArr3[40], b4, objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(windowTouchSlop, i6, iIndexOf, 154975793, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i7 = ((int[]) objArr8[2])[0];
            int i8 = ((int[]) objArr8[1])[0];
            String[] strArr = (String[]) objArr8[3];
            int[] iArr = {i8};
            int i9 = (int) Runtime.getRuntime().totalMemory();
            int i10 = ~i9;
            int i11 = ((((-1942347774) + ((~(292057860 | i10)) * (-560))) + ((~(i9 | (-1141900315))) * (-560))) + (((~(1412973598 | i10)) | 20984576) * 560)) - 968749108;
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr[0])[0] = i13 ^ (i13 << 5);
            objArr = new Object[]{new int[1], iArr, new int[]{i7}, strArr};
        } else {
            Object[] objArr9 = new Object[1];
            e(new int[]{-651294251, 1451855291, -219945177, 1197795275, 1369358345, -752239559, -895674547, 1575960653, -1361097115, -610242038}, Process.getGidForName("") + 17, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            e(new int[]{1385862025, 554196979, -1936152577, 1698131293, -1930129766, 1614072044, 385043456, -1685913324, -113748467, 1429156}, 17 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr10);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr10[0], Object.class).invoke(null, this)).intValue();
            int i14 = g + 65;
            d = i14 % 128;
            int i15 = i14 % 2;
            try {
                Object[] objArr11 = {null, Integer.valueOf(iIntValue), 0, -968749108};
                byte b5 = (byte) ($$e - 3);
                byte[] bArr4 = $$d;
                Object[] objArr12 = new Object[1];
                f(b5, b5, bArr4[3], objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                byte b6 = bArr4[28];
                Object[] objArr13 = new Object[1];
                f(b6, b6, bArr4[31], objArr13);
                Object[] objArr14 = (Object[]) cls3.getMethod((String) objArr13[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char scrollDefaultDelay2 = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 43042);
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3111;
                    int iResolveSize = View.resolveSize(0, 0) + 22;
                    byte[] bArr5 = $$a;
                    byte b7 = bArr5[7];
                    Object[] objArr15 = new Object[1];
                    c(b7, bArr5[40], b7, objArr15);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(scrollDefaultDelay2, scrollBarFadeDuration, iResolveSize, 154975793, false, (String) objArr15[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr14);
                try {
                    Object[] objArr16 = new Object[1];
                    e(new int[]{1218973797, -985533559, -1535866553, 2006405761, 90287986, -385663015, -504354704, 948026655, 1078320451, -1494083546, -890292157, -786827687, -1850311244, -1905837679}, TextUtils.indexOf((CharSequence) "", '0') + 23, objArr16);
                    Class<?> cls4 = Class.forName((String) objArr16[0]);
                    Object[] objArr17 = new Object[1];
                    e(new int[]{1509578723, -1193868176, 1623269007, 1658956352, -2030687814, -943558433, 546669274, -430857936, -2001214866, 959917386}, 15 - View.resolveSizeAndState(0, 0, 0), objArr17);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 43042);
                        int mirror = 3159 - AndroidCharacter.getMirror('0');
                        int iMyPid = (Process.myPid() >> 22) + 22;
                        byte[] bArr6 = $$a;
                        byte b8 = bArr6[7];
                        byte b9 = bArr6[5];
                        Object[] objArr18 = new Object[1];
                        c(b8, b9, b9, objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cIndexOf, mirror, iMyPid, -1269618118, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cLastIndexOf = (char) (43041 - TextUtils.lastIndexOf("", '0'));
                        int i16 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3110;
                        int iKeyCodeFromString = 22 - KeyEvent.keyCodeFromString("");
                        byte[] bArr7 = $$a;
                        byte b10 = bArr7[7];
                        Object[] objArr19 = new Object[1];
                        c(b10, b10, bArr7[5], objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cLastIndexOf, i16, iKeyCodeFromString, -1272852037, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr14;
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
        int i17 = ((int[]) objArr[1])[0];
        int i18 = ((int[]) objArr[2])[0];
        if (i18 == i17) {
            int i19 = ((int[]) objArr[0])[0];
            int i20 = ((int[]) objArr[2])[0];
            int i21 = ((int[]) objArr[1])[0];
            String[] strArr2 = (String[]) objArr[3];
            int iNextInt = new Random().nextInt();
            int i22 = i19 + 450193029 + (((~(iNextInt | 1253992127)) | 451039331) * 191) + (((~((~iNextInt) | 1253992127)) | 272633920) * 191);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr2[0])[0] = i24 ^ (i24 << 5);
            objArr2 = new Object[]{new int[1], new int[]{i21}, new int[]{i20}, strArr2};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[3];
            if (strArr3 != null) {
                int i25 = 0;
                while (i25 < strArr3.length) {
                    int i26 = g + 29;
                    d = i26 % 128;
                    if (i26 % 2 == 0) {
                        arrayList.add(strArr3[i25]);
                        i25 += 98;
                    } else {
                        arrayList.add(strArr3[i25]);
                        i25++;
                    }
                }
            }
            Toast.makeText((Context) null, i18 / (((i18 - 1) * i18) % 2), 0).show();
            int i27 = ((int[]) objArr[0])[0];
            int i28 = ((int[]) objArr[2])[0];
            int i29 = ((int[]) objArr[1])[0];
            String[] strArr4 = (String[]) objArr[3];
            int[] iArr2 = {i29};
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i30 = 1798413894 + (((~((-522195555) | startUptimeMillis)) | 421532194 | (~(1182835904 | startUptimeMillis))) * (-754));
            int i31 = ~((-421532195) | startUptimeMillis);
            int i32 = ~startUptimeMillis;
            int i33 = i27 + i30 + ((i31 | (~(1604368098 | i32))) * (-754)) + ((i32 | (-522195555)) * 754);
            int i34 = (i33 << 13) ^ i33;
            int i35 = i34 ^ (i34 >>> 17);
            ((int[]) objArr2[0])[0] = i35 ^ (i35 << 5);
            objArr2 = new Object[]{new int[1], iArr2, new int[]{i28}, strArr4};
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        do {
            int i36 = atomicIntegerFieldUpdater2.get(this);
            if (i36 != 0) {
                if (i36 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
            atomicIntegerFieldUpdater = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i37 = ((int[]) objArr2[0])[0];
            int i38 = i37 * i37;
            int i39 = -(444320194 * i37);
            int i40 = ((((i38 | i39) << 1) - (i38 ^ i39)) - (~(-(i37 * 815865806)))) - 1826235329;
            int i41 = i40 >> 23;
            int i42 = (((i41 | (-1023)) << 1) - (i41 ^ (-1023))) / 512;
            int i43 = (i42 ^ 1) + ((i42 & 1) << 1);
            int i44 = (i40 & i43) + (i43 | i40);
            int i45 = i40 >> 15;
            int i46 = -(i44 ^ ((((((-262143) | i45) << 1) - (i45 ^ (-262143))) / 131072) + 1));
            i = (i46 & 1) + (i46 | 1);
            int i47 = ((i >> 20) - 8191) / 4096;
            i2 = (i47 ^ 1) + ((i47 & 1) << 1);
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2282 / (((-((i2 & 1) + (i2 | 1))) & i) * 1141)));
        return true;
    }

    @Override // defpackage.onOutputBufferAvailable, defpackage.AudioEncoderConfigBuilder
    public final void a_(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = g + 113;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            RemoteActionCompatParcelizer();
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (RemoteActionCompatParcelizer()) {
            return;
        }
        EncoderImplByteBufferInputExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1(IntrinsicsKt.intercepted(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3), SignalEosOutputBufferNotComeQuirk.TuitionPaymentFragmentbindingInflater1(obj, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
        int i3 = d + 105;
        g = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 4 / 4;
        }
    }

    @Override // defpackage.onOutputBufferAvailable, defpackage.isFHDProblematicDevice
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object obj) {
        int i = 2 % 2;
        int i2 = d + 119;
        g = i2 % 128;
        int i3 = i2 % 2;
        if (!RemoteActionCompatParcelizer()) {
            EncoderImplByteBufferInputExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1(IntrinsicsKt.intercepted(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3), SignalEosOutputBufferNotComeQuirk.TuitionPaymentFragmentbindingInflater1(obj, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
            return;
        }
        int i4 = g + 51;
        d = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    static {
        asBinder = 1;
        g();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = AtomicIntegerFieldUpdater.newUpdater(AudioEncoderConfigDefaultResolver.class, "_decision$volatile");
        int i = TuitionPaymentFragmentbindingInflater1 + 43;
        asBinder = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ AtomicIntegerFieldUpdater b() {
        int i = 2 % 2;
        int i2 = g + 79;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void g() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new int[]{-1111576021, -502437144, 114789700, 508784271, 1701976386, 195261306, 1019047331, -377730754, 1507662427, -1525313573, -382577464, 1044551866, -1531499599, 336279717, -1761729398, -827147516, 959354224, -488538810};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r6, int r7, byte r8) {
        /*
            int r6 = r6 * 3
            int r6 = r6 + 4
            int r7 = r7 * 3
            int r0 = r7 + 1
            int r8 = r8 * 56
            int r8 = 122 - r8
            byte[] r1 = defpackage.AudioEncoderConfigDefaultResolver.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = r6 + r3
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AudioEncoderConfigDefaultResolver.$$g(short, int, byte):java.lang.String");
    }
}

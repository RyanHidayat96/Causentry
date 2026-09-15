package defpackage;

import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\t"}, d2 = {"LRotationProviderListenerWrapperExternalSyntheticLambda0;", "LtryToComplete;", "p0", "<init>", "(LtryToComplete;)V", "", "close", "()V", "-deprecated_delegate", "()LtryToComplete;", "LRotationProviderListenerWrapper;", "", "p1", "read", "(LRotationProviderListenerWrapper;J)J", "LcancelPreviousRequest;", "timeout", "()LcancelPreviousRequest;", "", "toString", "()Ljava/lang/String;", "delegate", "LtryToComplete;"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class RotationProviderListenerWrapperExternalSyntheticLambda0 implements tryToComplete {
    private final tryToComplete delegate;
    private static final byte[] $$j = {49, 89, 41, 48};
    private static final int $$k = 67;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {91, -17, 90, 37, -8, -25, 26, -41, -14, -11, -12, 3, -6, -28, 36, -46, 2, -16, -8, 21, -51, -13, -5, 2, -29, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55};
    private static final int $$h = 218;
    private static final byte[] $$d = {Base64.padSymbol, -108, 49, -100, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$e = 180;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
    private static int asBinder = 1;
    private static char TuitionPaymentFragmentbindingInflater1 = 22832;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 7512;
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 36716;
    private static char b = 32546;

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = defpackage.RotationProviderListenerWrapperExternalSyntheticLambda0.$$d
            int r9 = r9 * 4
            int r9 = r9 + 84
            int r8 = r8 * 15
            int r8 = r8 + 38
            int r7 = r7 * 52
            int r7 = 107 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r4 = r2
            r9 = r7
            goto L2f
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            int r7 = r7 + 1
            r1[r3] = r5
            if (r4 != r8) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L29:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2f:
            int r3 = r3 + r7
            int r7 = r3 + (-11)
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RotationProviderListenerWrapperExternalSyntheticLambda0.d(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 31
            int r0 = r6 + 22
            int r7 = r7 * 19
            int r7 = r7 + 84
            int r8 = r8 + 4
            byte[] r1 = defpackage.RotationProviderListenerWrapperExternalSyntheticLambda0.$$g
            byte[] r0 = new byte[r0]
            int r6 = r6 + 21
            r2 = 0
            if (r1 != 0) goto L17
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2f
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r8 = r8 + 1
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2f:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + (-10)
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RotationProviderListenerWrapperExternalSyntheticLambda0.f(int, byte, byte, java.lang.Object[]):void");
    }

    public RotationProviderListenerWrapperExternalSyntheticLambda0(tryToComplete trytocomplete) {
        Intrinsics.checkNotNullParameter(trytocomplete, "");
        this.delegate = trytocomplete;
    }

    public final tryToComplete delegate() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 107;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3 % 128;
        int i4 = i3 % 2;
        tryToComplete trytocomplete = this.delegate;
        int i5 = i2 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 12 / 0;
        }
        return trytocomplete;
    }

    @Override // defpackage.tryToComplete
    public long read(RotationProviderListenerWrapper p0, long p1) throws IOException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 101;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        long j = this.delegate.read(p0, p1);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 21;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    @Override // defpackage.tryToComplete
    public cancelPreviousRequest timeout() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 13;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        cancelPreviousRequest cancelpreviousrequestTimeout = this.delegate.timeout();
        int i4 = asBinder + 117;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return cancelpreviousrequestTimeout;
    }

    @Override // defpackage.tryToComplete, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        int i = 2 % 2;
        int i2 = asBinder + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
        int i3 = i2 % 2;
        this.delegate.close();
        int i4 = asBinder + 37;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
        char[] cArr2 = new char[cArr.length - 2];
        oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            char c = 0;
            if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            char c2 = 1;
            cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
            int i3 = 58224;
            int i4 = 0;
            while (i4 < 16) {
                char c3 = cArr3[c2];
                char c4 = cArr3[c];
                int i5 = i4;
                int i6 = (c4 + i3) ^ ((c4 << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1) ^ 8611973335120459638L)));
                int i7 = c4 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(b);
                    objArr2[2] = Integer.valueOf(i7);
                    objArr2[c2] = Integer.valueOf(i6);
                    objArr2[0] = Integer.valueOf(c3);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char c5 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 47772);
                        int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 468;
                        int i8 = 14 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c2] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c5, keyRepeatDelay, i8, -2007001706, false, "o", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    cArr3[c2] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i3) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentbindingInflater1) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - Gravity.getAbsoluteGravity(0, 0)), 468 - Drawable.resolveOpacity(0, 0), 13 - (Process.myTid() >> 22), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i3 -= 40503;
                    i4 = i5 + 1;
                    int i9 = $10 + 11;
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
                byte b2 = (byte) 0;
                byte b3 = b2;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2323, 43 - Process.getGidForName(""), -1312321721, false, $$l(b2, b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            int i11 = $11 + 41;
            $10 = i11 % 128;
            int i12 = i11 % 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v60, types: [char, int] */
    public String toString() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
        int i2 = 0;
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char modifierMetaStateMask = (char) (43041 - ((byte) KeyEvent.getModifierMetaStateMask()));
            int deadChar = KeyEvent.getDeadChar(0, 0) + 3111;
            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 22;
            byte[] bArr = $$d;
            Object[] objArr2 = new Object[1];
            d(bArr[37], bArr[132], bArr[7], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(modifierMetaStateMask, deadChar, pressedStateDuration, -1272852037, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{50629, 29616, 25869, 5267, 39360, 7668, 21772, 55700, 35820, 27703, 44253, 6858, 52619, 6869, 63179, 39350, 61117, 35406, 49734, 21024, 16997, 31985, 23698, 22549}, 22 - View.MeasureSpec.getMode(0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{33461, 25113, 52974, 60956, 4645, 38020, 25874, 55320, 31859, 49735, 10162, 6541, 57764, 5707, 36810, 17480, 26406, 44324}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 15, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char edgeSlop = (char) (43042 - (ViewConfiguration.getEdgeSlop() >> 16));
            int i3 = 3112 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            int iResolveOpacity = 22 - Drawable.resolveOpacity(0, 0);
            byte[] bArr2 = $$d;
            byte b2 = bArr2[132];
            Object[] objArr5 = new Object[1];
            d(b2, b2, bArr2[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(edgeSlop, i3, iResolveOpacity, -1269618118, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 43042);
                int iIndexOf = 3110 - TextUtils.indexOf((CharSequence) "", '0', 0);
                int longPressTimeout2 = 22 - (ViewConfiguration.getLongPressTimeout() >> 16);
                byte b3 = $$d[7];
                byte b4 = b3;
                Object[] objArr6 = new Object[1];
                d(b3, b4, b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(longPressTimeout, iIndexOf, longPressTimeout2, 154975793, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i4 = ((int[]) objArr7[2])[0];
            int i5 = ((int[]) objArr7[1])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i5};
            int iIdentityHashCode = System.identityHashCode(this);
            int i6 = (-1955395550) + (((~(1570764529 | iIdentityHashCode)) | 134266929) * (-756)) + (((~iIdentityHashCode) | 1570764529) * 756) + 1011999624;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[0])[0] = i8 ^ (i8 << 5);
            objArr = new Object[]{new int[1], iArr, new int[]{i4}, strArr};
            int i9 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 17;
            asBinder = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 2 / 4;
            }
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{10104, 14026, 36326, 51466, 40636, 38375, 14006, 50658, 30876, 7199, 29013, 52321, 7845, 41507, 40514, 25606, 31941, 55197}, 16 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{30515, 51838, 19050, 13918, 39619, 58872, 42872, 48054, 52469, 15102, 38700, 64902, 18842, 47114, 61754, 10304, 17346, 28507}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 15, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 45;
            asBinder = i11 % 128;
            int i12 = i11 % 2;
            try {
                Object[] objArr10 = {null, Integer.valueOf(iIntValue), 0, 1011999624};
                byte[] bArr3 = $$g;
                byte b5 = bArr3[28];
                Object[] objArr11 = new Object[1];
                f((byte) (b5 - 1), b5, bArr3[58], objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b6 = bArr3[28];
                Object[] objArr12 = new Object[1];
                f(b6, (byte) (b6 - 1), bArr3[31], objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 43042);
                    int bitsPerPixel = 3110 - ImageFormat.getBitsPerPixel(0);
                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 22;
                    byte b7 = $$d[7];
                    byte b8 = b7;
                    Object[] objArr14 = new Object[1];
                    d(b7, b8, b8, objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, bitsPerPixel, tapTimeout, 154975793, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    e(new char[]{50629, 29616, 25869, 5267, 39360, 7668, 21772, 55700, 35820, 27703, 44253, 6858, 52619, 6869, 63179, 39350, 61117, 35406, 49734, 21024, 16997, 31985, 23698, 22549}, 22 - Gravity.getAbsoluteGravity(0, 0), objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    e(new char[]{33461, 25113, 52974, 60956, 4645, 38020, 25874, 55320, 31859, 49735, 10162, 6541, 57764, 5707, 36810, 17480, 26406, 44324}, 15 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char tapTimeout2 = (char) ((ViewConfiguration.getTapTimeout() >> 16) + 43042);
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 3111;
                        int scrollDefaultDelay = 22 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        byte[] bArr4 = $$d;
                        byte b9 = bArr4[132];
                        Object[] objArr17 = new Object[1];
                        d(b9, b9, bArr4[7], objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(tapTimeout2, packedPositionGroup, scrollDefaultDelay, -1269618118, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 43042);
                        int iResolveSize = 3111 - View.resolveSize(0, 0);
                        int iResolveSize2 = View.resolveSize(0, 0) + 22;
                        byte[] bArr5 = $$d;
                        Object[] objArr18 = new Object[1];
                        d(bArr5[37], bArr5[132], bArr5[7], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cKeyCodeFromString, iResolveSize, iResolveSize2, -1272852037, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr13;
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
        int i13 = ((int[]) objArr[1])[0];
        int i14 = ((int[]) objArr[2])[0];
        if (i14 != i13) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[3];
            if (strArr2 != null) {
                while (i2 < strArr2.length) {
                    arrayList.add(strArr2[i2]);
                    i2++;
                    int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 95;
                    asBinder = i15 % 128;
                    int i16 = i15 % 2;
                }
            }
            throw new RuntimeException(String.valueOf(i14));
        }
        int i17 = ((int[]) objArr[0])[0];
        int i18 = ((int[]) objArr[2])[0];
        int i19 = ((int[]) objArr[1])[0];
        String[] strArr3 = (String[]) objArr[3];
        int[] iArr2 = {i18};
        int i20 = ~((~System.identityHashCode(this)) | 1051443245);
        int i21 = i17 + ((403374088 | i20) * (-374)) + 383388868 + ((i20 | 648069157) * 374);
        int i22 = (i21 << 13) ^ i21;
        int i23 = i22 ^ (i22 >>> 17);
        ((int[]) objArr[0])[0] = i23 ^ (i23 << 5);
        Object[] objArr19 = {new int[1], new int[]{i19}, iArr2, strArr3};
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('(');
        sb.append(this.delegate);
        int i24 = ((int[]) objArr19[0])[0];
        int i25 = i24 * i24;
        int i26 = -(930754162 * i24);
        int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
        int i28 = -(i24 * 444498826);
        int i29 = (i27 & i28) + (i28 | i27);
        int i30 = ((i29 | (-1291871228)) << 1) - ((-1291871228) ^ i29);
        int i31 = i30 >> 27;
        int i32 = ((i31 & (-63)) + (i31 | (-63))) / 32;
        int i33 = (i32 & 1) + (i32 | 1);
        int i34 = (i30 ^ i33) + ((i33 & i30) << 1);
        int i35 = i30 >> 24;
        int i36 = (((i35 | (-511)) << 1) - (i35 ^ (-511))) / 256;
        int i37 = (-(((i36 ^ 1) + ((i36 & 1) << 1)) ^ i34)) + 2;
        int i38 = i37 >> 25;
        int i39 = ((i38 ^ (-255)) + ((i38 & (-255)) << 1)) / 128;
        int i40 = (i39 ^ 1) + ((i39 & 1) << 1);
        sb.append((char) (128740 / ((i37 & (-(((i40 | 1) << 1) - (i40 ^ 1)))) * 1570)));
        return sb.toString();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "delegate", imports = {}))
    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name */
    public final tryToComplete m1deprecated_delegate() {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 55;
        int i3 = i2 % 128;
        asBinder = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        tryToComplete trytocomplete = this.delegate;
        int i4 = i3 + 81;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4 % 128;
        int i5 = i4 % 2;
        return trytocomplete;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$l(int r6, short r7, short r8) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 108
            int r7 = r7 * 3
            int r7 = 3 - r7
            int r8 = r8 * 2
            int r0 = 1 - r8
            byte[] r1 = defpackage.RotationProviderListenerWrapperExternalSyntheticLambda0.$$j
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L2e
        L18:
            r3 = r2
        L19:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L26:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2e:
            int r7 = -r7
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RotationProviderListenerWrapperExternalSyntheticLambda0.$$l(int, short, short):java.lang.String");
    }
}

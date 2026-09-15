package io.reactivex.internal.operators.observable;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
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
import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.deriveMediaType;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import defpackage.logToString;
import defpackage.mergeEncoderProfiles;
import defpackage.usesAffectedSoc;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservablePublishAlt<T> extends usesAffectedSoc<T> implements mergeEncoderProfiles {
    private AutoValue_VideoValidatedEncoderProfilesProxy<T> TuitionPaymentFragmentbindingInflater1;
    private AtomicReference<PublishConnection<T>> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new AtomicReference<>();

    public ObservablePublishAlt(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy) {
        this.TuitionPaymentFragmentbindingInflater1 = autoValue_VideoValidatedEncoderProfilesProxy;
    }

    @Override // defpackage.usesAffectedSoc
    public final void TuitionPaymentFragmentbindingInflater1(logToString<? super BufferProviderState> logtostring) {
        PublishConnection<T> publishConnection;
        while (true) {
            publishConnection = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get();
            if (publishConnection != null && !publishConnection.isDisposed()) {
                break;
            }
            PublishConnection<T> publishConnection2 = new PublishConnection<>(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, publishConnection, publishConnection2)) {
                publishConnection = publishConnection2;
                break;
            }
        }
        boolean z = false;
        if (!publishConnection.connect.get() && publishConnection.connect.compareAndSet(false, true)) {
            z = true;
        }
        try {
            logtostring.accept(publishConnection);
            if (z) {
                this.TuitionPaymentFragmentbindingInflater1.subscribe(publishConnection);
            }
        } catch (Throwable th) {
            dumpMediaCodecListForFormat.b(th);
            throw ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class PublishConnection<T> extends AtomicReference<InnerDisposable<T>[]> implements deriveMediaType<T>, BufferProviderState {
        private static int $10 = 0;
        private static int $11 = 1;
        private static long TuitionPaymentFragmentbindingInflater1 = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        private static InnerDisposable[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        static final InnerDisposable[] b;
        private static final long serialVersionUID = -3251430252873581268L;
        final AtomicReference<PublishConnection<T>> current;
        Throwable error;
        private static final byte[] $$d = {93, -77, 2, Base64.padSymbol, -12, 2, 63, -52, -14, 6, -9, -1, 9, -10, 71, -54, 3, -19, 19, 51, -71, 2, 14, -13, 68, -63, -2, 11, -1, -7, 62, -68, 13, -14, 3, 1, 1, -5, 14, 55, -23, -39, 3, 2, -2, 7, -10, 7, 19, -15, -24, 24, -33, 12, -11, 11, -6, 1, 30, -17, -24, 12, 8, -9, -6, 46, -44, 17, -6, -6, 8, -9, -6, 18, -7, -5, 10, -5, -5, 7, 30, -37, 8, -6, 11, -19, 15, -13, 65};
        private static final int $$e = 25;
        private static final byte[] $$a = {8, -36, 87, -65, 23, -37, 42, 11, -10, 18, -7, 0, 7, 7, 23, -44, 44, 10, -5, 6, 18};
        private static final int $$b = 39;
        private static int asInterface = 0;
        private static int asBinder = 1;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;
        final AtomicBoolean connect = new AtomicBoolean();
        final AtomicReference<BufferProviderState> upstream = new AtomicReference<>();

        private static void a(int i, int i2, short s, Object[] objArr) {
            byte[] bArr = $$a;
            int i3 = (i * 3) + 97;
            int i4 = 14 - (s * 10);
            byte[] bArr2 = new byte[11 - i2];
            int i5 = 10 - i2;
            int i6 = -1;
            if (bArr == null) {
                int i7 = i3 + i4;
                i4++;
                i3 = i7 - 5;
                i6 = -1;
            }
            while (true) {
                int i8 = i6 + 1;
                bArr2[i8] = (byte) i3;
                if (i8 == i5) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i4++;
                i3 = (i3 + bArr[i4]) - 5;
                i6 = i8;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(int r6, int r7, byte r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = io.reactivex.internal.operators.observable.ObservablePublishAlt.PublishConnection.$$d
                int r8 = r8 * 11
                int r1 = r8 + 38
                int r6 = r6 * 15
                int r6 = 99 - r6
                int r7 = r7 + 4
                byte[] r1 = new byte[r1]
                int r8 = r8 + 37
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r7
                r4 = r2
                goto L2e
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r8) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L26:
                int r7 = r7 + 1
                r3 = r0[r7]
                r5 = r7
                r7 = r6
                r6 = r3
                r3 = r5
            L2e:
                int r6 = -r6
                int r6 = r6 + r7
                r7 = r3
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservablePublishAlt.PublishConnection.d(int, int, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:50:0x023e  */
        /* JADX WARN: Code duplicated, block: B:51:0x023f  */
        private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
            Throwable cause;
            int i2 = 2 % 2;
            getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
            getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            getrealtimecapturelatency.b = 0;
            int i3 = $10 + 87;
            $11 = i3 % 128;
            while (true) {
                int i4 = i3 % 2;
                if (getrealtimecapturelatency.b >= cArr.length) {
                    break;
                }
                int i5 = $10 + 9;
                $11 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = getrealtimecapturelatency.b;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (MotionEvent.axisFromString("") + 19473), TextUtils.indexOf("", "", 0) + 2624, 13 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() % (TuitionPaymentFragmentbindingInflater1 * 9053247990562531611L);
                        Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39421 - ImageFormat.getBitsPerPixel(0)), ExpandableListView.getPackedPositionChild(0L) + 482, 37 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    } catch (Throwable th) {
                        cause = th.getCause();
                        if (cause != null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    int i7 = getrealtimecapturelatency.b;
                    Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (Process.getGidForName("") + 19473), TextUtils.indexOf((CharSequence) "", '0', 0) + 2625, ImageFormat.getBitsPerPixel(0) + 14, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (TuitionPaymentFragmentbindingInflater1 ^ 9053247990562531611L);
                    Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 39421), 481 - (ViewConfiguration.getJumpTapTimeout() >> 16), 37 - ((Process.getThreadPriority(0) + 20) >> 6), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
                i3 = $11 + 85;
                $10 = i3 % 128;
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            char[] cArr2 = new char[length];
            getrealtimecapturelatency.b = 0;
            while (getrealtimecapturelatency.b < cArr.length) {
                int i8 = $11 + 49;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                    Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (Color.green(0) + 39422), 481 - (ViewConfiguration.getScrollBarSize() >> 8), 36 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
                    throw null;
                }
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr7 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (39422 - TextUtils.getCapsMode("", 0, 0)), TextUtils.getTrimmedLength("") + 481, Drawable.resolveOpacity(0, 0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
            }
            objArr[0] = new String(cArr2);
        }

        static {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            TuitionPaymentFragmentbindingInflater1();
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new InnerDisposable[0];
            b = new InnerDisposable[0];
            int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 111;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i % 128;
            int i2 = i % 2;
        }

        PublishConnection(AtomicReference<PublishConnection<T>> atomicReference) {
            this.current = atomicReference;
            lazySet(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            int i = 2 % 2;
            int i2 = asBinder + 9;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                getAndSet(b);
                PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.current, this, null);
                DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.upstream);
                int i3 = 90 / 0;
            } else {
                getAndSet(b);
                PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.current, this, null);
                DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.upstream);
            }
            int i4 = asInterface + 77;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 83 / 0;
            }
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            int i = 2 % 2;
            if (get() != b) {
                return false;
            }
            int i2 = asBinder + 89;
            int i3 = i2 % 128;
            asInterface = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 113;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            int i = 2 % 2;
            int i2 = asInterface + 87;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                DisposableHelper.TuitionPaymentFragmentbindingInflater1(this.upstream, bufferProviderState);
                throw null;
            }
            DisposableHelper.TuitionPaymentFragmentbindingInflater1(this.upstream, bufferProviderState);
            int i3 = asBinder + 123;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 68 / 0;
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            int i2 = asBinder + 125;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 877;
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 10;
                byte b2 = $$a[11];
                byte b3 = b2;
                Object[] objArr2 = new Object[1];
                a(b2, b3, (byte) (b3 + 1), objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iLastIndexOf, jumpTapTimeout, -1199417970, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(new char[]{64009, 57637, 52298, 43891, 38539, 32174, 22750, 18355, 8991, 3616, 62744, 53434, 49077, 39644, 33270, 27904, 18485, 14200, 4722, 63902, 58551, 50140}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 6946, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new char[]{64013, 56427, 46807, 35157, 25511, 14886, 7318, 63283, 51573, 41966, 31314, 23769, 14133, 2470, 57375}, 9839 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                int iKeyCodeFromString = 876 - KeyEvent.keyCodeFromString("");
                int capsMode = TextUtils.getCapsMode("", 0, 0) + 10;
                byte b4 = (byte) ($$b & 1);
                byte[] bArr = $$a;
                Object[] objArr5 = new Object[1];
                a(b4, bArr[17], bArr[11], objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maxKeyCode, iKeyCodeFromString, capsMode, 254769921, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                int i4 = asInterface + 117;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char c = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 877;
                    int i6 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 10;
                    byte b5 = $$a[11];
                    byte b6 = b5;
                    Object[] objArr6 = new Object[1];
                    a(b6, (byte) (b6 + 3), b5, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, packedPositionChild, i6, 1324201839, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i7 = (((1159442112 + ((~((-26804484) | iIdentityHashCode)) * (-301))) + (((~(570149127 | iIdentityHashCode)) | (~((~iIdentityHashCode) | 610459356))) * (-301))) + (((~(iIdentityHashCode | (-610459357))) | 570149127) * 301)) - 1800450788;
                int i8 = (i7 << 13) ^ i7;
                int i9 = i8 ^ (i8 >>> 17);
                ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                c(new char[]{64002, 25120, 51788, 12914, 39650, 713, 27391, 54041, 15175, 41783, 2977, 29650, 56311, 16393, 43059, 4194}, 38953 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(new char[]{64001, 54335, 42603, 28831, 17104, 7422, 61230, 47476, 35768, 26050, 14309, 1585, 53327, 41616, 31942, 20208}, TextUtils.indexOf("", "", 0) + 11827, objArr9);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
                int i10 = asBinder + 23;
                asInterface = i10 % 128;
                int i11 = i10 % 2;
                try {
                    Object[] objArr10 = {Integer.valueOf(iIntValue), -1800450788};
                    byte[] bArr2 = $$d;
                    byte b7 = bArr2[35];
                    Object[] objArr11 = new Object[1];
                    d((byte) (b7 - 1), bArr2[11], b7, objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    byte b8 = bArr2[35];
                    byte b9 = b8;
                    Object[] objArr12 = new Object[1];
                    d(b9, (byte) (b9 | 46), (byte) (b8 - 1), objArr12);
                    Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                        int iMyPid = (Process.myPid() >> 22) + 876;
                        int maxKeyCode2 = (KeyEvent.getMaxKeyCode() >> 16) + 10;
                        byte b10 = $$a[11];
                        byte b11 = b10;
                        Object[] objArr14 = new Object[1];
                        a(b11, (byte) (b11 + 3), b10, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveOpacity, iMyPid, maxKeyCode2, 1324201839, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                    try {
                        Object[] objArr15 = new Object[1];
                        c(new char[]{64009, 57637, 52298, 43891, 38539, 32174, 22750, 18355, 8991, 3616, 62744, 53434, 49077, 39644, 33270, 27904, 18485, 14200, 4722, 63902, 58551, 50140}, 6947 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr15);
                        Class<?> cls4 = Class.forName((String) objArr15[0]);
                        Object[] objArr16 = new Object[1];
                        c(new char[]{64013, 56427, 46807, 35157, 25511, 14886, 7318, 63283, 51573, 41966, 31314, 23769, 14133, 2470, 57375}, (Process.myTid() >> 22) + 9839, objArr16);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                            int i12 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 875;
                            int size = View.MeasureSpec.getSize(0) + 10;
                            byte b12 = (byte) ($$b & 1);
                            byte[] bArr3 = $$a;
                            Object[] objArr17 = new Object[1];
                            a(b12, bArr3[17], bArr3[11], objArr17);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionGroup, i12, size, 254769921, false, (String) objArr17[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cIndexOf2 = (char) TextUtils.indexOf("", "");
                            int absoluteGravity = 876 - Gravity.getAbsoluteGravity(0, 0);
                            int iAxisFromString = 9 - MotionEvent.axisFromString("");
                            byte b13 = $$a[11];
                            byte b14 = b13;
                            Object[] objArr18 = new Object[1];
                            a(b13, b14, (byte) (b14 + 1), objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf2, absoluteGravity, iAxisFromString, -1199417970, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        objArr = objArr13;
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
            int i13 = ((int[]) objArr[2])[0];
            int i14 = ((int[]) objArr[0])[0];
            if (i14 != i13) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[3];
                if (strArr != null) {
                    for (String str : strArr) {
                        arrayList.add(str);
                    }
                }
                throw new RuntimeException(String.valueOf(i14));
            }
            int i15 = ((int[]) objArr[1])[0];
            Object[] objArr19 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int i16 = (int) Runtime.getRuntime().totalMemory();
            int i17 = i15 + (-1703544620) + (((~(383331096 | i16)) | 151011557) * 576) + (((~((~i16) | 534342653)) | 272629768) * 576) + 1083310912;
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr19[1])[0] = i19 ^ (i19 << 5);
            int i20 = asInterface + 35;
            asBinder = i20 % 128;
            int i21 = i20 % 2;
            InnerDisposable<T>[] innerDisposableArr = get();
            int length = innerDisposableArr.length;
            int i22 = ((int[]) objArr19[1])[0];
            int i23 = i22 * i22;
            int i24 = -(333764317 * i22);
            int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
            int i26 = -(i22 * (-1662194129));
            int i27 = (((i25 | i26) << 1) - (i26 ^ i25)) - 179249628;
            int i28 = i27 >> 19;
            int i29 = (((i28 ^ (-16383)) + ((i28 & (-16383)) << 1)) / 8192) + 1;
            int i30 = (i27 & i29) + (i29 | i27);
            int i31 = i27 >> 23;
            int i32 = -(i30 ^ (((((i31 | (-1023)) << 1) - (i31 ^ (-1023))) / 512) + 1));
            int i33 = (i32 ^ 7) + ((i32 & 7) << 1);
            int i34 = i33 >> 24;
            int i35 = ((i34 ^ (-511)) + ((i34 & (-511)) << 1)) / 256;
            int i36 = (i35 ^ 1) + ((i35 & 1) << 1);
            for (int i37 = 0 / (((-(((i36 | 1) << 1) - (i36 ^ 1))) & i33) * 330); i37 < length; i37++) {
                innerDisposableArr[i37].downstream.onNext(t);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            InnerDisposable<T>[] andSet;
            int length;
            int i;
            int i2 = 2 % 2;
            int i3 = asInterface + 89;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                this.error = th;
                this.upstream.lazySet(DisposableHelper.DISPOSED);
                andSet = getAndSet(b);
                length = andSet.length;
                i = 1;
            } else {
                this.error = th;
                this.upstream.lazySet(DisposableHelper.DISPOSED);
                andSet = getAndSet(b);
                length = andSet.length;
                i = 0;
            }
            int i4 = asBinder + 15;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            while (i < length) {
                int i6 = asBinder + 39;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                andSet[i].downstream.onError(th);
                i++;
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            int i = 2 % 2;
            int i2 = asInterface + 105;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            this.upstream.lazySet(DisposableHelper.DISPOSED);
            for (InnerDisposable<T> innerDisposable : getAndSet(b)) {
                int i4 = asInterface + 73;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                innerDisposable.downstream.onComplete();
            }
        }

        public final void b(InnerDisposable<T> innerDisposable) {
            InnerDisposable<T>[] innerDisposableArr;
            InnerDisposable[] innerDisposableArr2;
            int i = 2 % 2;
            do {
                innerDisposableArr = get();
                int length = innerDisposableArr.length;
                if (length == 0) {
                    return;
                }
                int i2 = asInterface + 81;
                asBinder = i2 % 128;
                int i3 = i2 % 2 == 0 ? 1 : 0;
                while (true) {
                    if (i3 >= length) {
                        i3 = -1;
                        break;
                    }
                    int i4 = asInterface;
                    int i5 = i4 + 105;
                    asBinder = i5 % 128;
                    int i6 = i5 % 2;
                    if (innerDisposableArr[i3] == innerDisposable) {
                        break;
                    }
                    i3++;
                    int i7 = i4 + 119;
                    asBinder = i7 % 128;
                    int i8 = i7 % 2;
                }
                if (i3 < 0) {
                    return;
                }
                innerDisposableArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (length != 1) {
                    innerDisposableArr2 = new InnerDisposable[length - 1];
                    System.arraycopy(innerDisposableArr, 0, innerDisposableArr2, 0, i3);
                    System.arraycopy(innerDisposableArr, i3 + 1, innerDisposableArr2, i3, (length - i3) - 1);
                }
            } while (!compareAndSet(innerDisposableArr, innerDisposableArr2));
        }

        static void TuitionPaymentFragmentbindingInflater1() {
            TuitionPaymentFragmentbindingInflater1 = -8140139327282523277L;
        }
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        PublishConnection<T> publishConnection;
        InnerDisposable<T>[] innerDisposableArr;
        InnerDisposable[] innerDisposableArr2;
        while (true) {
            publishConnection = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get();
            if (publishConnection != null) {
                break;
            }
            PublishConnection<T> publishConnection2 = new PublishConnection<>(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, publishConnection, publishConnection2)) {
                publishConnection = publishConnection2;
                break;
            }
        }
        InnerDisposable<T> innerDisposable = new InnerDisposable<>(derivemediatype, publishConnection);
        derivemediatype.onSubscribe(innerDisposable);
        do {
            innerDisposableArr = publishConnection.get();
            if (innerDisposableArr == PublishConnection.b) {
                Throwable th = publishConnection.error;
                if (th != null) {
                    derivemediatype.onError(th);
                    return;
                } else {
                    derivemediatype.onComplete();
                    return;
                }
            }
            int length = innerDisposableArr.length;
            innerDisposableArr2 = new InnerDisposable[length + 1];
            System.arraycopy(innerDisposableArr, 0, innerDisposableArr2, 0, length);
            innerDisposableArr2[length] = innerDisposable;
        } while (!publishConnection.compareAndSet(innerDisposableArr, innerDisposableArr2));
        if (innerDisposable.isDisposed()) {
            publishConnection.b(innerDisposable);
        }
    }

    @Override // defpackage.mergeEncoderProfiles
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(BufferProviderState bufferProviderState) {
        PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (PublishConnection) bufferProviderState, null);
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class InnerDisposable<T> extends AtomicReference<PublishConnection<T>> implements BufferProviderState {
        private static final long serialVersionUID = 7463222674719692880L;
        final deriveMediaType<? super T> downstream;

        InnerDisposable(deriveMediaType<? super T> derivemediatype, PublishConnection<T> publishConnection) {
            this.downstream = derivemediatype;
            lazySet(publishConnection);
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            PublishConnection<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.b(this);
            }
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return get() == null;
        }
    }
}

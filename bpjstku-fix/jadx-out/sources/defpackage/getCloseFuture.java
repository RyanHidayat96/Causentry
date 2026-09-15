package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.io.encoding.Base64;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes4.dex */
public final class getCloseFuture extends getTerminationFuture {
    private static final byte[] $$c = {25, -93, -120, -48};
    private static final int $$f = 25;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {82, Base64.padSymbol, -66, -42, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55};
    private static final int $$e = 232;
    private static final byte[] $$a = {91, -9, 99, 11, 15, -8, 16, -1, -4, -3, -52, 55, 14, 1, 8, -13, 11, 8, -68, 68, -1, -61, 21, 49, 2, -2, -1, -4, 0, 21, -9, 8, 1, -35, 39, -6, 11, -1, 21, -17, -27, 39, 11, -7, 23, -19, -49, 64, -9, 15, -5, -55, 40, 22, 12, -11, -2, 5, 3, -17, 19, 4, -5, -5, 2, 13, 7, -4, 7};
    private static final int $$b = 35;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
    private static int TuitionPaymentFragmentbindingInflater1 = -83722476;
    private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1387854029038996068L;

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r0 = r5 + 4
            int r6 = r6 * 3
            int r6 = r6 + 97
            byte[] r1 = defpackage.getCloseFuture.$$a
            int r7 = 66 - r7
            byte[] r0 = new byte[r0]
            int r5 = r5 + 3
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r5
            r6 = r7
            r3 = r2
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L23:
            r4 = r1[r7]
            int r3 = r3 + 1
        L27:
            int r7 = r7 + 1
            int r6 = r6 + r4
            int r6 = r6 + (-2)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getCloseFuture.c(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 84
            int r8 = r8 * 52
            int r8 = 55 - r8
            byte[] r0 = defpackage.getCloseFuture.$$d
            int r9 = r9 * 52
            int r9 = 53 - r9
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r8 = r9
            r4 = r2
            goto L2d
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2d:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r8 + (-10)
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getCloseFuture.d(int, short, byte, java.lang.Object[]):void");
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
        getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        getrealtimecapturelatency.b = 0;
        while (getrealtimecapturelatency.b < cArr.length) {
            int i3 = $11 + 25;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = getrealtimecapturelatency.b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19471 - ExpandableListView.getPackedPositionChild(0L)), ExpandableListView.getPackedPositionGroup(0L) + 2624, TextUtils.indexOf((CharSequence) "", '0') + 14, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ 9053247990562531611L);
                Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (39422 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (ViewConfiguration.getWindowTouchSlop() >> 8) + 481, 37 - TextUtils.getOffsetAfter("", 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
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
            int i6 = $10 + 21;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
            Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 39422), 481 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 37 - KeyEvent.normalizeMetaState(0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    private static void a(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i2];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        int i5 = $11 + 93;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i7 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
                    int bitsPerPixel = 3290 - ImageFormat.getBitsPerPixel(0);
                    int mode = 31 - View.MeasureSpec.getMode(0);
                    byte b2 = (byte) ($$f & 7);
                    byte b3 = (byte) (b2 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(mirror, bitsPerPixel, mode, 1199271174, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) TextUtils.indexOf("", "", 0, 0), 651 - View.getDefaultSize(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 45, -450685997, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i8 = $10 + 23;
                $11 = i8 % 128;
                int i9 = i8 % 2;
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
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            int i10 = $11 + 39;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            char[] cArr4 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 651 - View.resolveSizeAndState(0, 0, 0), 43 - TextUtils.lastIndexOf("", '0'), -450685997, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
        int i12 = $10 + 27;
        $11 = i12 % 128;
        int i13 = i12 % 2;
    }

    public static <V> ListenableFuture<V> TuitionPaymentFragmentspecialinlinedviewModeldefault3(V v) {
        int i = 2 % 2;
        if (v != null) {
            return new lambdanew0androidxcameracoreimplDeferrableSurface(v);
        }
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 69;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        ListenableFuture<V> listenableFuture = (ListenableFuture<V>) lambdanew0androidxcameracoreimplDeferrableSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 85;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 8 / 0;
        }
        return listenableFuture;
    }

    public static <I, O> ListenableFuture<O> b(ListenableFuture<I> listenableFuture, ConstantObservableExternalSyntheticLambda0<? super I, ? extends O> constantObservableExternalSyntheticLambda0, Executor executor) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 39;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        ListenableFuture<O> listenableFutureTuitionPaymentFragmentspecialinlinedviewModeldefault3 = lambdaaddObserver0androidxcameracoreimplConstantObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(listenableFuture, constantObservableExternalSyntheticLambda0, executor);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return listenableFutureTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public static <I, O> ListenableFuture<O> TuitionPaymentFragmentbindingInflater1(ListenableFuture<I> listenableFuture, getCameraRegistration<? super I, ? extends O> getcameraregistration, Executor executor) {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 109;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        ListenableFuture<O> listenableFutureTuitionPaymentFragmentspecialinlinedviewModeldefault2 = lambdaaddObserver0androidxcameracoreimplConstantObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault2(listenableFuture, getcameraregistration, executor);
        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 31;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
        int i5 = i4 % 2;
        return listenableFutureTuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public static <V> void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ListenableFuture<V> listenableFuture, getContainerClass<? super V> getcontainerclass, Executor executor) {
        int i = 2 % 2;
        listenableFuture.addListener(new b(listenableFuture, getcontainerclass), executor);
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class b<V> implements Runnable {
        private getContainerClass<? super V> TuitionPaymentFragmentbindingInflater1;
        private Future<V> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        b(Future<V> future, getContainerClass<? super V> getcontainerclass) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = future;
            this.TuitionPaymentFragmentbindingInflater1 = getcontainerclass;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable thTuitionPaymentFragmentbindingInflater1;
            Future<V> future = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if ((future instanceof incrementAll) && (thTuitionPaymentFragmentbindingInflater1 = DeferrableSurfaceSurfaceClosedException.TuitionPaymentFragmentbindingInflater1((incrementAll) future)) != null) {
                this.TuitionPaymentFragmentbindingInflater1.onFailure(thTuitionPaymentFragmentbindingInflater1);
                return;
            }
            try {
                this.TuitionPaymentFragmentbindingInflater1.onSuccess(getCloseFuture.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
            } catch (ExecutionException e2) {
                this.TuitionPaymentFragmentbindingInflater1.onFailure(e2.getCause());
            } catch (Throwable th) {
                this.TuitionPaymentFragmentbindingInflater1.onFailure(th);
            }
        }

        public final String toString() {
            return new registerCamera.TuitionPaymentFragmentbindingInflater1(getClass().getSimpleName(), (byte) 0).TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1).toString();
        }
    }

    public static <V> V b(Future<V> future) throws ExecutionException {
        int i = 2 % 2;
        int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
        if (future.isDone()) {
            V v = (V) decrementAll.TuitionPaymentFragmentspecialinlinedviewModeldefault2(future);
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 65;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            return v;
        }
        throw new IllegalStateException(CameraStateRegistryCameraRegistration.b("Future was expected to be done: %s", future));
    }

    /* JADX WARN: Code duplicated, block: B:132:0x0c29 A[Catch: IOException -> 0x0e25, Exception -> 0x0e29, all -> 0x0f91, TryCatch #23 {IOException -> 0x0e25, blocks: (B:129:0x0c18, B:130:0x0c1b, B:132:0x0c29, B:133:0x0c6d, B:135:0x0c83, B:136:0x0cc3, B:138:0x0cd5, B:140:0x0cfb, B:142:0x0d24, B:144:0x0d6c, B:146:0x0dd7, B:148:0x0df4), top: B:354:0x0c18 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x0c83 A[Catch: IOException -> 0x0e25, Exception -> 0x0e29, all -> 0x0f91, TryCatch #23 {IOException -> 0x0e25, blocks: (B:129:0x0c18, B:130:0x0c1b, B:132:0x0c29, B:133:0x0c6d, B:135:0x0c83, B:136:0x0cc3, B:138:0x0cd5, B:140:0x0cfb, B:142:0x0d24, B:144:0x0d6c, B:146:0x0dd7, B:148:0x0df4), top: B:354:0x0c18 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x0cfb A[Catch: IOException -> 0x0e25, all -> 0x0f91, TryCatch #23 {IOException -> 0x0e25, blocks: (B:129:0x0c18, B:130:0x0c1b, B:132:0x0c29, B:133:0x0c6d, B:135:0x0c83, B:136:0x0cc3, B:138:0x0cd5, B:140:0x0cfb, B:142:0x0d24, B:144:0x0d6c, B:146:0x0dd7, B:148:0x0df4), top: B:354:0x0c18 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x0d24 A[Catch: IOException -> 0x0e25, all -> 0x0f91, TryCatch #23 {IOException -> 0x0e25, blocks: (B:129:0x0c18, B:130:0x0c1b, B:132:0x0c29, B:133:0x0c6d, B:135:0x0c83, B:136:0x0cc3, B:138:0x0cd5, B:140:0x0cfb, B:142:0x0d24, B:144:0x0d6c, B:146:0x0dd7, B:148:0x0df4), top: B:354:0x0c18 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x0d6c A[Catch: IOException -> 0x0e25, all -> 0x0f91, TryCatch #23 {IOException -> 0x0e25, blocks: (B:129:0x0c18, B:130:0x0c1b, B:132:0x0c29, B:133:0x0c6d, B:135:0x0c83, B:136:0x0cc3, B:138:0x0cd5, B:140:0x0cfb, B:142:0x0d24, B:144:0x0d6c, B:146:0x0dd7, B:148:0x0df4), top: B:354:0x0c18 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x0dd7 A[Catch: IOException -> 0x0e25, all -> 0x0f91, TryCatch #23 {IOException -> 0x0e25, blocks: (B:129:0x0c18, B:130:0x0c1b, B:132:0x0c29, B:133:0x0c6d, B:135:0x0c83, B:136:0x0cc3, B:138:0x0cd5, B:140:0x0cfb, B:142:0x0d24, B:144:0x0d6c, B:146:0x0dd7, B:148:0x0df4), top: B:354:0x0c18 }] */
    /* JADX WARN: Code duplicated, block: B:209:0x0ec5 A[Catch: Exception -> 0x0f06, all -> 0x0f91, IOException -> 0x0fa4, TryCatch #25 {IOException -> 0x0fa4, blocks: (B:227:0x0f06, B:228:0x0f90, B:178:0x0e5e, B:179:0x0e61, B:183:0x0e6f, B:185:0x0e7a, B:186:0x0e7b, B:196:0x0e94, B:198:0x0e9b, B:199:0x0e9c, B:207:0x0ebf, B:209:0x0ec5, B:210:0x0ec6, B:213:0x0ed2, B:215:0x0ed8, B:216:0x0ed9), top: B:353:0x06ad }] */
    /* JADX WARN: Code duplicated, block: B:210:0x0ec6 A[Catch: Exception -> 0x0f06, all -> 0x0f91, IOException -> 0x0fa4, TryCatch #25 {IOException -> 0x0fa4, blocks: (B:227:0x0f06, B:228:0x0f90, B:178:0x0e5e, B:179:0x0e61, B:183:0x0e6f, B:185:0x0e7a, B:186:0x0e7b, B:196:0x0e94, B:198:0x0e9b, B:199:0x0e9c, B:207:0x0ebf, B:209:0x0ec5, B:210:0x0ec6, B:213:0x0ed2, B:215:0x0ed8, B:216:0x0ed9), top: B:353:0x06ad }] */
    /* JADX WARN: Code duplicated, block: B:237:0x0fa6  */
    /* JADX WARN: Code duplicated, block: B:25:0x0412  */
    /* JADX WARN: Code duplicated, block: B:270:0x1594 A[EDGE_INSN: B:270:0x1594->B:271:0x1599 BREAK  A[LOOP:5: B:250:0x1215->B:269:0x1582], PHI: r1 r2
  0x1594: PHI (r1v47 int) = (r1v44 int), (r1v44 int), (r1v53 int) binds: [B:246:0x1130, B:248:0x120f, B:403:0x1594] A[DONT_GENERATE, DONT_INLINE]
  0x1594: PHI (r2v163 java.lang.String[]) = (r2v160 java.lang.String[]), (r2v160 java.lang.String[]), (r2v166 java.lang.String[]) binds: [B:246:0x1130, B:248:0x120f, B:403:0x1594] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0415  */
    /* JADX WARN: Code duplicated, block: B:30:0x0476 A[Catch: all -> 0x1cdc, TryCatch #30 {all -> 0x1cdc, blocks: (B:13:0x022b, B:15:0x0241, B:17:0x0299, B:28:0x045e, B:30:0x0476, B:32:0x04c6, B:260:0x1442, B:262:0x145a, B:264:0x14ab, B:286:0x1603, B:288:0x1610, B:289:0x164e, B:291:0x17a6, B:293:0x17b3, B:294:0x17fb, B:296:0x18e4, B:298:0x18f1, B:299:0x1939, B:301:0x1a11, B:303:0x1a1e, B:304:0x1a5e, B:306:0x1b4e, B:308:0x1b5b, B:309:0x1b96), top: B:358:0x022b }] */
    /* JADX WARN: Code duplicated, block: B:31:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:349:0x0795 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:353:0x06ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0558 A[LOOP:1: B:26:0x0413->B:36:0x0558, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x056e A[EDGE_INSN: B:37:0x056e->B:38:0x0571 BREAK  A[LOOP:1: B:26:0x0413->B:36:0x0558], PHI: r6 r38 r39
  0x056e: PHI (r6v118 java.lang.Object) = (r6v117 java.lang.Object), (r6v197 java.lang.Object) binds: [B:24:0x0410, B:390:0x056e] A[DONT_GENERATE, DONT_INLINE]
  0x056e: PHI (r38v3 ??) = (r5v231 java.lang.String), (r38v16 ??) binds: [B:24:0x0410, B:390:0x056e] A[DONT_GENERATE, DONT_INLINE]
  0x056e: PHI (r39v6 ??) = (r8v267 int), (r39v18 ??) binds: [B:24:0x0410, B:390:0x056e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:389:0x0556 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:390:0x056e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:396:0x0e25 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:397:0x0e15 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:398:0x0e15 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:399:0x0e15 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0604  */
    /* JADX WARN: Code duplicated, block: B:42:0x068c  */
    /* JADX WARN: Code duplicated, block: B:60:0x07e8  */
    /* JADX WARN: Code duplicated, block: B:70:0x082f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v193, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r2v158, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r38v10 */
    /* JADX WARN: Type inference failed for: r38v11 */
    /* JADX WARN: Type inference failed for: r38v12 */
    /* JADX WARN: Type inference failed for: r38v13 */
    /* JADX WARN: Type inference failed for: r38v14 */
    /* JADX WARN: Type inference failed for: r38v15 */
    /* JADX WARN: Type inference failed for: r38v16 */
    /* JADX WARN: Type inference failed for: r38v17 */
    /* JADX WARN: Type inference failed for: r38v19 */
    /* JADX WARN: Type inference failed for: r38v20 */
    /* JADX WARN: Type inference failed for: r38v21 */
    /* JADX WARN: Type inference failed for: r38v22 */
    /* JADX WARN: Type inference failed for: r38v23 */
    /* JADX WARN: Type inference failed for: r38v24 */
    /* JADX WARN: Type inference failed for: r38v25 */
    /* JADX WARN: Type inference failed for: r38v26 */
    /* JADX WARN: Type inference failed for: r38v27 */
    /* JADX WARN: Type inference failed for: r38v28 */
    /* JADX WARN: Type inference failed for: r38v29 */
    /* JADX WARN: Type inference failed for: r38v3 */
    /* JADX WARN: Type inference failed for: r38v30 */
    /* JADX WARN: Type inference failed for: r38v4 */
    /* JADX WARN: Type inference failed for: r38v5 */
    /* JADX WARN: Type inference failed for: r38v6 */
    /* JADX WARN: Type inference failed for: r38v7 */
    /* JADX WARN: Type inference failed for: r38v8 */
    /* JADX WARN: Type inference failed for: r38v9 */
    /* JADX WARN: Type inference failed for: r39v10 */
    /* JADX WARN: Type inference failed for: r39v11 */
    /* JADX WARN: Type inference failed for: r39v12 */
    /* JADX WARN: Type inference failed for: r39v13 */
    /* JADX WARN: Type inference failed for: r39v14 */
    /* JADX WARN: Type inference failed for: r39v15 */
    /* JADX WARN: Type inference failed for: r39v17 */
    /* JADX WARN: Type inference failed for: r39v18 */
    /* JADX WARN: Type inference failed for: r39v21 */
    /* JADX WARN: Type inference failed for: r39v22 */
    /* JADX WARN: Type inference failed for: r39v23 */
    /* JADX WARN: Type inference failed for: r39v24 */
    /* JADX WARN: Type inference failed for: r39v25 */
    /* JADX WARN: Type inference failed for: r39v26 */
    /* JADX WARN: Type inference failed for: r39v27 */
    /* JADX WARN: Type inference failed for: r39v28 */
    /* JADX WARN: Type inference failed for: r39v6 */
    /* JADX WARN: Type inference failed for: r39v7 */
    /* JADX WARN: Type inference failed for: r39v8 */
    /* JADX WARN: Type inference failed for: r39v9 */
    /* JADX WARN: Type inference failed for: r4v261, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r4v262, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v92, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v141 */
    /* JADX WARN: Type inference failed for: r5v142 */
    /* JADX WARN: Type inference failed for: r5v262 */
    /* JADX WARN: Type inference failed for: r5v263 */
    /* JADX WARN: Type inference failed for: r8v288 */
    public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context, int i, int i2, int i3) throws Throwable {
        int i4;
        int i5;
        String[] strArr;
        Object obj;
        int i6;
        int i7;
        int iLastIndexOf;
        int i8;
        int i9;
        int i10;
        Object obj2;
        int i11;
        int i12;
        Object obj3;
        String str;
        int i13;
        Object obj4;
        int i14;
        ?? r39;
        ?? r38;
        Object obj5;
        int i15;
        int length;
        int i16;
        ?? r310;
        ?? r311;
        ?? r5;
        ?? r12;
        Object[] objArr;
        ?? r312;
        ?? r313;
        ?? r314;
        Process processExec;
        Throwable th;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Throwable th2;
        Throwable cause;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Throwable th3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        String[] strArrSplit;
        int length2;
        int i17;
        String str2;
        Object[] objArr2;
        Object[] objArr3;
        Object[] objArr4;
        ?? Split;
        int i18;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        ?? r315;
        int i19;
        long j;
        int i20;
        int i21;
        int i22 = i;
        int i23 = 1;
        char c = 0;
        if (context != null) {
            try {
                int i24 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int i25 = ((i24 | 219) << 1) - (i24 ^ 219);
                int i26 = -(ViewConfiguration.getKeyRepeatTimeout() >> 16);
                int i27 = (i26 & 23) + (i26 | 23);
                int i28 = -TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                Object[] objArr5 = new Object[1];
                a(false, i25, i27, (i28 ^ 19) + ((i28 & 19) << 1), new char[]{'\r', '\n', 4, 65535, 65481, 65534, '\n', '\t', 15, 0, '\t', 15, 65481, 65502, '\n', '\t', 15, 0, 19, 15, 65532, '\t', 65535}, objArr5);
                Class<?> cls = Class.forName((String) objArr5[0]);
                int i29 = -(SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int i30 = i29 * (-711);
                int i31 = (i30 & 155434) + (i30 | 155434);
                int i32 = ~(((-219) ^ i29) | ((-219) & i29));
                int i33 = ~i22;
                int i34 = ~((i33 ^ i29) | (i33 & i29));
                int i35 = ((i32 ^ i34) | (i34 & i32)) * (-712);
                int i36 = (i31 ^ i35) + ((i31 & i35) << 1);
                int i37 = ~i22;
                int i38 = (-219) | i37;
                int i39 = ~((i38 ^ i29) | (i38 & i29));
                int i40 = ~((i29 & 218) | (i29 ^ 218) | i22);
                int i41 = -(-(((i40 & i39) | (i39 ^ i40)) * (-712)));
                int i42 = (i36 & i41) + (i41 | i36);
                int i43 = ~((i33 ^ i29) | (i33 & i29));
                int i44 = -(-((((-219) & i43) | ((-219) ^ i43)) * 712));
                int i45 = (i42 & i44) + (i44 | i42);
                int i46 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                int i47 = i46 * 960;
                int i48 = ((i47 | (-26838)) << 1) - (i47 ^ (-26838));
                int i49 = ~((-15) | i37);
                int i50 = ~((i46 ^ i22) | (i46 & i22));
                int i51 = i48 + (((i49 & i50) | (i49 ^ i50)) * 959);
                int i52 = (i51 ^ 14385) + ((i51 & 14385) << 1) + (((~(i46 | i33)) | (~(((-15) & i22) | ((-15) ^ i22)))) * 959);
                int i53 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                Object[] objArr6 = new Object[1];
                a(false, i45, i52, (i53 ^ 5) + ((i53 & 5) << 1), new char[]{2, 65515, 65534, '\n', 2, 4, 2, 17, 65517, 65534, 0, '\b', 65534, 4}, objArr6);
                String str3 = (String) cls.getMethod((String) objArr6[0], null).invoke(context, null);
                int i54 = -((Process.getThreadPriority(0) + 20) >> 6);
                int i55 = (i54 & 219) + (i54 | 219);
                int doubleTapTimeout = 23 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int i56 = -(-KeyEvent.keyCodeFromString(""));
                Object[] objArr7 = new Object[1];
                a(false, i55, doubleTapTimeout, (i56 ^ 20) + ((i56 & 20) << 1), new char[]{'\r', '\n', 4, 65535, 65481, 65534, '\n', '\t', 15, 0, '\t', 15, 65481, 65502, '\n', '\t', 15, 0, 19, 15, 65532, '\t', 65535}, objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                int i57 = 221 - (~TextUtils.lastIndexOf("", '0'));
                int threadPriority = Process.getThreadPriority(0);
                int i58 = -(-(((threadPriority & 20) + (threadPriority | 20)) >> 6));
                int i59 = (i58 & 18) + (i58 | 18);
                int i60 = -TextUtils.indexOf((CharSequence) "", '0', 0);
                Object[] objArr8 = new Object[1];
                a(false, i57, i59, (i60 & 17) + (i60 | 17), new char[]{0, 65534, '\r', 65498, '\t', '\t', 5, 2, 65532, 65530, '\r', 2, '\b', 7, 65506, 7, 65535, '\b'}, objArr8);
                Object objInvoke = cls2.getMethod((String) objArr8[0], null).invoke(context, null);
                int i61 = $$b;
                byte[] bArr = $$a;
                byte b2 = bArr[28];
                Object[] objArr9 = new Object[1];
                c((byte) (i61 - 5), b2, (byte) (b2 | 62), objArr9);
                Class<?> cls3 = Class.forName((String) objArr9[0]);
                byte b3 = bArr[58];
                byte b4 = bArr[13];
                Object[] objArr10 = new Object[1];
                c(b3, b4, (byte) (b4 | 28), objArr10);
                int iIndexOf = ((String) cls3.getField((String) objArr10[0]).get(objInvoke)).indexOf(str3);
                if (iIndexOf > 0) {
                    byte b5 = (byte) (i61 - 5);
                    byte b6 = bArr[28];
                    Object[] objArr11 = new Object[1];
                    c(b5, b6, (byte) (b6 | 62), objArr11);
                    Class<?> cls4 = Class.forName((String) objArr11[0]);
                    byte b7 = bArr[58];
                    byte b8 = bArr[13];
                    Object[] objArr12 = new Object[1];
                    c(b7, b8, (byte) (b8 | 28), objArr12);
                    String str4 = (String) cls4.getField((String) objArr12[0]).get(objInvoke);
                    int length3 = str4.length() - 16;
                    if (length3 >= 0) {
                        int i62 = 0;
                        while (true) {
                            if (i62 > length3) {
                                i10 = iIndexOf;
                                obj2 = objInvoke;
                                i6 = i33;
                                i11 = 0;
                                break;
                            }
                            String strSubstring = str4.substring(i62, i62 + 16);
                            try {
                                Object[] objArr13 = new Object[2];
                                objArr13[i23] = 931995;
                                objArr13[c] = strSubstring;
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char c2 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1);
                                    int jumpTapTimeout = 3393 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                                    int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 9;
                                    byte b9 = $$d[7];
                                    Object[] objArr14 = new Object[i23];
                                    d((byte) 14, b9, b9, objArr14);
                                    String str5 = (String) objArr14[0];
                                    Class[] clsArr = new Class[2];
                                    clsArr[0] = String.class;
                                    clsArr[i23] = Integer.TYPE;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, jumpTapTimeout, touchSlop, 1203525406, false, str5, clsArr);
                                }
                                long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr13)).longValue();
                                long j2 = 1110245180;
                                int i63 = i62;
                                i10 = iIndexOf;
                                obj2 = objInvoke;
                                long j3 = -1;
                                long j4 = ((j2 ^ j3) | jLongValue) ^ j3;
                                i6 = i33;
                                long j5 = i22;
                                long j6 = j5 ^ j3;
                                long j7 = (((long) 595) * j2) + (((long) (-1187)) * jLongValue) + (((long) (-1188)) * (j4 | ((j6 | jLongValue) ^ j3)));
                                long j8 = 594;
                                long j9 = jLongValue ^ j3;
                                long j10 = j4 | ((j5 | j9) ^ j3);
                                long j11 = (j6 | j2) ^ j3;
                                long j12 = j7 + ((j10 | j11) * j8) + (j8 * ((j3 ^ (j9 | j2)) | ((j9 | j6) ^ j3) | j11)) + ((long) (-1112315057));
                                int i64 = ~(i6 | 748789010);
                                int i65 = ((int) (j12 >> 32)) & (((77661442 | i64) * (-970)) + 1300701854 + ((i64 | 671127568) * 970));
                                int iNextInt = new Random().nextInt(879216613);
                                int i66 = ~iNextInt;
                                int i67 = (~((-1801244391) | i66)) | 710462054;
                                int i68 = ~(iNextInt | 2147278831);
                                int i69 = ((int) j12) & (((i67 | i68) * (-252)) + 1505552061 + ((i68 | (~(i66 | (-1090782337)))) * 252));
                                if (((i65 & i69) | (i65 ^ i69)) == -725904754) {
                                    i11 = 1;
                                    break;
                                }
                                i62 = i63 + 1;
                                objInvoke = obj2;
                                iIndexOf = i10;
                                i33 = i6;
                                str4 = str4;
                                length3 = length3;
                                i23 = 1;
                                c = 0;
                            } catch (Throwable th4) {
                                Throwable cause2 = th4.getCause();
                                if (cause2 != null) {
                                    throw cause2;
                                }
                                throw th4;
                            }
                        }
                        i12 = (i22 & (-21)) | (i6 & 20);
                        int i70 = -i11;
                        int i71 = ((i11 & i70) | (i11 ^ i70)) >> 31;
                        int i72 = (~i71) & i22;
                        int i73 = i71 & i12;
                        int i74 = (i73 & i72) | (i72 ^ i73);
                        byte b10 = (byte) ($$b - 5);
                        byte[] bArr2 = $$a;
                        byte b11 = bArr2[28];
                        Object[] objArr15 = new Object[1];
                        c(b10, b11, (byte) (b11 | 62), objArr15);
                        Class<?> cls5 = Class.forName((String) objArr15[0]);
                        byte b12 = bArr2[58];
                        byte b13 = bArr2[13];
                        Object[] objArr16 = new Object[1];
                        c(b12, b13, (byte) (b13 | 28), objArr16);
                        obj3 = obj2;
                        str = (String) cls5.getField((String) objArr16[0]).get(obj3);
                        int length4 = str.length();
                        int iB = SearchView9.b();
                        int i75 = -(-(length4 * (-67)));
                        int i76 = ((-414) & i75) + (i75 | (-414));
                        int i77 = ~length4;
                        int i78 = (5 ^ i77) | (5 & i77);
                        int i79 = ~iB;
                        int i80 = -(-(((~((i78 & i79) | (i78 ^ i79))) | (~(((-6) ^ length4) | ((-6) & length4))) | (~((length4 ^ iB) | (length4 & iB)))) * (-68)));
                        int i81 = ((i76 | i80) << 1) - (i80 ^ i76);
                        int i82 = (5 ^ i79) | (i79 & 5);
                        int i83 = (~((length4 & i82) | (i82 ^ length4))) * (-68);
                        int i84 = (i81 ^ i83) + ((i83 & i81) << 1);
                        int i85 = ~iB;
                        int i86 = ~((i85 & i77) | (i77 ^ i85));
                        i13 = (i84 - (~(-(-(((i86 & 5) | (5 ^ i86)) * 68))))) - 1;
                        if (i13 >= 0) {
                            obj4 = obj3;
                            i14 = 0;
                            r38 = str4;
                            r39 = length3;
                            break;
                        }
                        i18 = 0;
                        while (true) {
                            if (i18 <= i13) {
                                str4 = str4;
                                length3 = length3;
                                obj4 = obj3;
                                i14 = 0;
                                r38 = str4;
                                r39 = length3;
                                break;
                            }
                            str4 = str4;
                            length3 = length3;
                            int i87 = i18 * (-375);
                            int i88 = ((-2250) & i87) + (i87 | (-2250));
                            int i89 = ~i18;
                            int i90 = (~((i89 & (-7)) | ((-7) ^ i89))) | i22;
                            int i91 = (i18 ^ 6) | (i18 & 6);
                            int i92 = ~i91;
                            int i93 = -(-(((i90 & i92) | (i90 ^ i92)) * 376));
                            int i94 = (i88 ^ i93) + ((i93 & i88) << 1);
                            int i95 = ~((i6 ^ 6) | (i6 & 6));
                            int i96 = ~i91;
                            int i97 = ((i95 & i96) | (i95 ^ i96)) * (-376);
                            int i98 = ((i94 | i97) << 1) - (i97 ^ i94);
                            int i99 = ~(((-7) & i22) | ((-7) ^ i22));
                            Object[] objArr17 = {str.substring(i18, i98 + (((i99 & i18) | (i18 ^ i99)) * 376)), 931995};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char cRed = (char) Color.red(0);
                                int iArgb = Color.argb(0, 0, 0, 0) + 3393;
                                int pressedStateDuration = 9 - (ViewConfiguration.getPressedStateDuration() >> 16);
                                byte b14 = $$d[7];
                                Object[] objArr18 = new Object[1];
                                d((byte) 14, b14, b14, objArr18);
                                char c3 = cRed;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c3, iArgb, pressedStateDuration, 1203525406, false, (String) objArr18[0], new Class[]{String.class, Integer.TYPE});
                                r315 = c3;
                            } else {
                                r315 = str4;
                            }
                            long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr17)).longValue();
                            long j13 = 1098133126;
                            long j14 = -751;
                            i19 = i18;
                            long j15 = -1;
                            j = j13 ^ j15;
                            long j16 = jLongValue2 ^ j15;
                            obj4 = obj3;
                            long j17 = i22;
                            long j18 = (j14 * j13) + (j14 * jLongValue2) + (((long) 1504) * (((j | j16) ^ j15) | ((j | j17) ^ j15)));
                            long j19 = j | jLongValue2;
                            long j20 = j18 + (((long) (-1504)) * ((j17 | j19) ^ j15)) + (((long) 752) * ((j15 ^ (j16 | j13)) | (j19 ^ j15))) + ((long) (-1100203003));
                            i20 = ((int) (j20 >> 32)) & (164088274 + (((-1074372865) | i6) * 494) + (((~(i6 | (-1922016102))) | (-1162454411)) * 494));
                            i21 = ((int) j20) & ((((~((-1746722580) | i22)) | 671355921) * (-566)) + 593102827 + ((~((-1075366659) | i22)) * 566));
                            if (((i21 & i20) | (i20 ^ i21)) == -2096167706) {
                                i14 = 1;
                                r38 = r315;
                                r39 = j;
                                break;
                            }
                            int i100 = (i19 ^ (-94)) + ((i19 & (-94)) << 1);
                            i18 = ((i100 | 95) << 1) - (i100 ^ 95);
                            str = str;
                            i13 = i13;
                            obj3 = obj4;
                            str4 = r315;
                            length3 = j;
                        }
                        int i101 = (i14 | (-i14)) >> 31;
                        int i102 = (~i101) & i22;
                        int i103 = i101 & i12;
                        int i104 = (i103 & i102) | (i102 ^ i103);
                        int i105 = (~(i22 & i74)) & (i22 | i74);
                        int i106 = -i105;
                        int i107 = ((i105 & i106) | (i105 ^ i106)) >> 31;
                        int i108 = i104 & (~i107);
                        int i109 = i74 & i107;
                        iLastIndexOf = (i109 & i108) | (i108 ^ i109);
                        byte b15 = (byte) ($$b - 5);
                        byte[] bArr3 = $$a;
                        byte b16 = bArr3[28];
                        Object[] objArr19 = new Object[1];
                        c(b15, b16, (byte) (b16 | 62), objArr19);
                        Class<?> cls6 = Class.forName((String) objArr19[0]);
                        byte b17 = bArr3[58];
                        byte b18 = bArr3[13];
                        Object[] objArr20 = new Object[1];
                        c(b17, b18, (byte) (b18 | 28), objArr20);
                        obj5 = obj4;
                        String str6 = (String) cls6.getField((String) objArr20[0]).get(obj5);
                        int i110 = i10;
                        int i111 = ~i110;
                        int i112 = -i111;
                        int i113 = i110 & (((i111 & i112) | (i111 ^ i112)) >> 31);
                        i15 = 0;
                        String strSubstring2 = str6.substring(0, i113);
                        int i114 = -(-ImageFormat.getBitsPerPixel(0));
                        int i115 = (i114 ^ 28220) + ((i114 & 28220) << 1);
                        Object[] objArr21 = new Object[1];
                        e(new char[]{25424}, i115, objArr21);
                        String[] strArrSplit2 = strSubstring2.split((String) objArr21[0]);
                        length = strArrSplit2.length;
                        i16 = 0;
                        r5 = strArrSplit2;
                        r311 = r38;
                        r310 = r39;
                        while (i16 < length) {
                            r12 = r5[i16];
                            i16 = 1;
                            int i116 = -(ExpandableListView.getPackedPositionForGroup(i15) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i15) == 0L ? 0 : -1));
                            int i117 = i116 * (-183);
                            int i118 = ((i117 | 35890) << 1) - (i117 ^ 35890);
                            int i119 = ~i116;
                            int i120 = (i116 & (-195)) | (i116 ^ (-195));
                            int i121 = (((i118 - (~(-(-(((i119 & 194) | (i119 ^ 194)) * (-368)))))) - 1) - (~(-(-(((i120 & i6) | (i120 ^ i6)) * 184))))) - 1;
                            int i122 = ~((i119 & (-195)) | (i119 ^ (-195)));
                            int i123 = ~((i6 ^ i116) | (i6 & i116));
                            int i124 = (i122 ^ i123) | (i122 & i123);
                            int i125 = ~(i116 | 194);
                            i37 = i121 + (((i125 & i124) | (i124 ^ i125)) * 184);
                            i12 = 3 - (~(-(-Process.getGidForName(""))));
                            iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 3;
                            objArr = new Object[1];
                            a(true, i37, i12, iLastIndexOf, new char[]{65506, 15, 17}, objArr);
                            if (r12.split((String) objArr[0]).length > 1) {
                                synchronized (((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.getOffsetBefore("", 0), 2267 - (ViewConfiguration.getTapTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 34))) {
                                    try {
                                        try {
                                            Object[] objArr22 = new Object[1];
                                            e(new char[]{25359, 44955, 64077, 1672, 20786, 40353, 43069, 62688, 1863, 21455, 40518, 43767, 62834, 493, 19556, 40715}, AndroidCharacter.getMirror('0') + 52313, objArr22);
                                            String str7 = (String) objArr22[0];
                                            try {
                                                Runtime runtime = Runtime.getRuntime();
                                                int jumpTapTimeout2 = ViewConfiguration.getJumpTapTimeout() >> 16;
                                                int i126 = (jumpTapTimeout2 | 227) + (jumpTapTimeout2 & 227);
                                                int i127 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                int i128 = ((i127 | 3) << 1) - (i127 ^ 3);
                                                r311 = r5;
                                                try {
                                                    int iArgb2 = Color.argb(0, 0, 0, 0);
                                                    r310 = length;
                                                    int i129 = ~iArgb2;
                                                    obj4 = obj5;
                                                    int i130 = (((~((i129 ^ i6) | (i129 & i6))) | (~((-3) | i37))) * (-867)) + (iArgb2 * 868) + 1736;
                                                    int i131 = ~iArgb2;
                                                    int i132 = ~((i131 ^ (-3)) | (i131 & (-3)));
                                                    int i133 = ~(i129 | i22);
                                                    int i134 = (i132 ^ i133) | (i132 & i133);
                                                    int i135 = ~(((-3) ^ i22) | ((-3) & i22));
                                                    int i136 = -(-(((i134 ^ i135) | (i134 & i135)) * (-1734)));
                                                    i37 = 1;
                                                    int i137 = ((i130 | i136) << 1) - (i130 ^ i136);
                                                    int i138 = (i131 ^ (-3)) | (i131 & (-3));
                                                    int i139 = ~((i138 & i6) | (i138 ^ i6));
                                                    int i140 = (i131 & 2) | (i131 ^ 2);
                                                    int i141 = ~((i140 & i22) | (i140 ^ i22));
                                                    int i142 = (i139 & i141) | (i139 ^ i141);
                                                    int i143 = (iArgb2 & (-3)) | ((-3) ^ iArgb2);
                                                    int i144 = ~((i143 & i22) | (i143 ^ i22));
                                                    int i145 = ((i142 & i144) | (i142 ^ i144)) * 867;
                                                    try {
                                                        try {
                                                            Object[] objArr23 = new Object[1];
                                                            a(false, i126, i128, (i137 & i145) + (i137 | i145), new char[]{6, 65531}, objArr23);
                                                            processExec = runtime.exec((String) objArr23[0], (String[]) null, (File) null);
                                                            try {
                                                                Object[] objArr24 = {processExec.getInputStream()};
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                                    try {
                                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 2142 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 45 - View.MeasureSpec.getSize(0), -1020714777, false, null, new Class[]{InputStream.class});
                                                                    } catch (Throwable th5) {
                                                                        th = th5;
                                                                        Throwable cause3 = th.getCause();
                                                                        if (cause3 != null) {
                                                                            throw cause3;
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
                                                                            try {
                                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Drawable.resolveOpacity(0, 0), 2142 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 45 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1020714777, false, null, new Class[]{InputStream.class});
                                                                            } catch (Throwable th6) {
                                                                                th = th6;
                                                                                th2 = th;
                                                                                cause = th2.getCause();
                                                                                if (cause != null) {
                                                                                    throw cause;
                                                                                }
                                                                                throw th2;
                                                                            }
                                                                        } catch (Throwable th7) {
                                                                            th = th7;
                                                                        }
                                                                    }
                                                                    try {
                                                                        Object objNewInstance2 = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr25);
                                                                        try {
                                                                            DataOutputStream dataOutputStream = new DataOutputStream(processExec.getOutputStream());
                                                                            try {
                                                                                byte[] bArr4 = $$a;
                                                                                i37 = i37;
                                                                                try {
                                                                                    Object[] objArr26 = new Object[1];
                                                                                    c(bArr4[54], bArr4[58], bArr4[44], objArr26);
                                                                                    Class<?> cls7 = Class.forName((String) objArr26[0]);
                                                                                    i12 = i12;
                                                                                    try {
                                                                                        try {
                                                                                            Object[] objArr27 = new Object[1];
                                                                                            c(bArr4[13], (byte) (-bArr4[35]), bArr4[14], objArr27);
                                                                                            cls7.getMethod((String) objArr27[0], null).invoke(objNewInstance, null);
                                                                                            try {
                                                                                                Object[] objArr28 = new Object[1];
                                                                                                c(bArr4[54], bArr4[58], bArr4[44], objArr28);
                                                                                                Class<?> cls8 = Class.forName((String) objArr28[0]);
                                                                                                Object[] objArr29 = new Object[1];
                                                                                                c(bArr4[13], (byte) (-bArr4[35]), bArr4[14], objArr29);
                                                                                                cls8.getMethod((String) objArr29[0], null).invoke(objNewInstance2, null);
                                                                                                try {
                                                                                                    try {
                                                                                                        StringBuilder sb = new StringBuilder();
                                                                                                        sb.append(str7);
                                                                                                        int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0);
                                                                                                        int iB2 = SearchView9.b();
                                                                                                        int i146 = (iLastIndexOf2 * (-711)) - (-25548216);
                                                                                                        int i147 = ~(((-35833) ^ iLastIndexOf2) | ((-35833) & iLastIndexOf2));
                                                                                                        int i148 = ~((~iB2) | iLastIndexOf2);
                                                                                                        int i149 = ((i147 ^ i148) | (i148 & i147)) * (-712);
                                                                                                        int i150 = (i146 ^ i149) + ((i149 & i146) << 1);
                                                                                                        int i151 = ~iB2;
                                                                                                        int i152 = ((-35833) ^ i151) | ((-35833) & i151);
                                                                                                        int i153 = ~((i152 ^ iLastIndexOf2) | (i152 & iLastIndexOf2));
                                                                                                        int i154 = iLastIndexOf2 | 35832;
                                                                                                        int i155 = (i153 | (~((i154 ^ iB2) | (i154 & iB2)))) * (-712);
                                                                                                        int i156 = ((i150 | i155) << 1) - (i155 ^ i150);
                                                                                                        int i157 = ~((iLastIndexOf2 & i151) | (i151 ^ iLastIndexOf2));
                                                                                                        int i158 = -(-(((i157 & (-35833)) | ((-35833) ^ i157)) * 712));
                                                                                                        int i159 = ((i156 | i158) << 1) - (i156 ^ i158);
                                                                                                        Object[] objArr30 = new Object[1];
                                                                                                        e(new char[]{25461}, i159, objArr30);
                                                                                                        sb.append((String) objArr30[0]);
                                                                                                        String string = sb.toString();
                                                                                                        int i160 = -(-TextUtils.indexOf("", "", 0, 0));
                                                                                                        Object[] objArr31 = new Object[1];
                                                                                                        e(new char[]{25386, 38932, 38215, 37615, 36795}, (i160 & 64319) + (i160 | 64319), objArr31);
                                                                                                        dataOutputStream.write(string.getBytes((String) objArr31[0]));
                                                                                                        dataOutputStream.flush();
                                                                                                        int i161 = 208 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                                                                        int i162 = -(KeyEvent.getMaxKeyCode() >> 16);
                                                                                                        int iB3 = SearchView9.b();
                                                                                                        int i163 = i162 * 522;
                                                                                                        int i164 = (i163 & (-2600)) + (i163 | (-2600));
                                                                                                        int i165 = ~iB3;
                                                                                                        int i166 = ~(i165 | 5);
                                                                                                        int i167 = -(-(((i166 & i162) | (i162 ^ i166)) * (-1042)));
                                                                                                        int i168 = (i164 ^ i167) + ((i164 & i167) << 1);
                                                                                                        int i169 = -(-((iB3 | 5) * 521));
                                                                                                        int i170 = ((i168 | i169) << 1) - (i169 ^ i168);
                                                                                                        int i171 = ~i162;
                                                                                                        int i172 = ~(i171 | (-6));
                                                                                                        int i173 = ~((i171 ^ iB3) | (iB3 & i171));
                                                                                                        int i174 = (i173 & i172) | (i172 ^ i173);
                                                                                                        int i175 = i162 | i165;
                                                                                                        int i176 = ~((i175 & 5) | (i175 ^ 5));
                                                                                                        int i177 = i170 + (((i176 & i174) | (i174 ^ i176)) * 521);
                                                                                                        int i178 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                                                                        int iB4 = SearchView9.b();
                                                                                                        int i179 = i178 * 50;
                                                                                                        int i180 = (i179 ^ (-97)) + ((i179 & (-97)) << 1);
                                                                                                        int i181 = ~iB4;
                                                                                                        int i182 = (i180 - (~(-(-(((~((i181 & (-2)) | ((-2) ^ i181))) | (~(((-2) ^ i178) | ((-2) & i178)))) * 98))))) - 1;
                                                                                                        int i183 = ~((~i178) | (~iB4));
                                                                                                        int i184 = (i183 & (-2)) | ((-2) ^ i183);
                                                                                                        int i185 = ~(i178 | iB4);
                                                                                                        int i186 = (i182 - (~(-(-(((i184 ^ i185) | (i184 & i185)) * (-49)))))) - 1;
                                                                                                        int i187 = ~((iB4 & (-2)) | ((-2) ^ iB4));
                                                                                                        int i188 = ~((i178 & 1) | (i178 ^ 1));
                                                                                                        int i189 = -(-(((i188 & i187) | (i187 ^ i188)) * 49));
                                                                                                        Object[] objArr32 = new Object[1];
                                                                                                        a(true, i161, i177, ((i186 | i189) << 1) - (i189 ^ i186), new char[]{11, 65456, 26, 15, 30}, objArr32);
                                                                                                        String str8 = (String) objArr32[0];
                                                                                                        int iResolveOpacity = Drawable.resolveOpacity(0, 0);
                                                                                                        int iB5 = SearchView9.b();
                                                                                                        int i190 = iResolveOpacity * 934;
                                                                                                        int i191 = (i190 & (-59945308)) + (i190 | (-59945308));
                                                                                                        int i192 = ~iResolveOpacity;
                                                                                                        int i193 = ~iB5;
                                                                                                        int i194 = ~((i192 ^ i193) | (i192 & i193));
                                                                                                        int i195 = i191 + ((((-64320) ^ i194) | (i194 & (-64320))) * (-933));
                                                                                                        int i196 = ~((~iB5) | (-64320));
                                                                                                        int i197 = ~((-64320) | iResolveOpacity);
                                                                                                        int i198 = -(-(((i196 & i197) | (i196 ^ i197)) * 933));
                                                                                                        int i199 = (i195 & i198) + (i198 | i195);
                                                                                                        int i200 = -(-((~((64319 & iResolveOpacity) | (iResolveOpacity ^ 64319))) * 933));
                                                                                                        int i201 = (i199 & i200) + (i200 | i199);
                                                                                                        Object[] objArr33 = new Object[1];
                                                                                                        e(new char[]{25386, 38932, 38215, 37615, 36795}, i201, objArr33);
                                                                                                        dataOutputStream.write(str8.getBytes((String) objArr33[0]));
                                                                                                        dataOutputStream.flush();
                                                                                                        try {
                                                                                                            long jNanoTime = System.nanoTime();
                                                                                                            long nanos = TimeUnit.MILLISECONDS.toNanos(2000L);
                                                                                                            while (true) {
                                                                                                                try {
                                                                                                                    processExec.exitValue();
                                                                                                                    iLastIndexOf = iLastIndexOf;
                                                                                                                    break;
                                                                                                                } catch (IllegalThreadStateException unused) {
                                                                                                                    if (nanos > 0) {
                                                                                                                        try {
                                                                                                                            int i202 = iLastIndexOf;
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    Object[] objArr34 = {Long.valueOf(Math.min(TimeUnit.NANOSECONDS.toMillis(nanos) + 1, 3L))};
                                                                                                                                    byte[] bArr5 = $$a;
                                                                                                                                    iLastIndexOf = i202;
                                                                                                                                    try {
                                                                                                                                        Object[] objArr35 = new Object[1];
                                                                                                                                        c(bArr5[54], bArr5[58], bArr5[44], objArr35);
                                                                                                                                        Class<?> cls9 = Class.forName((String) objArr35[0]);
                                                                                                                                        Object[] objArr36 = new Object[1];
                                                                                                                                        c(bArr5[13], (byte) (-bArr5[35]), bArr5[61], objArr36);
                                                                                                                                        cls9.getMethod((String) objArr36[0], Long.TYPE).invoke(null, objArr34);
                                                                                                                                    } catch (Throwable th8) {
                                                                                                                                        th = th8;
                                                                                                                                        Throwable th9 = th;
                                                                                                                                        Throwable cause4 = th9.getCause();
                                                                                                                                        if (cause4 != null) {
                                                                                                                                            throw cause4;
                                                                                                                                        }
                                                                                                                                        throw th9;
                                                                                                                                    }
                                                                                                                                } catch (Throwable th10) {
                                                                                                                                    th = th10;
                                                                                                                                }
                                                                                                                            } catch (InterruptedException e2) {
                                                                                                                                e = e2;
                                                                                                                                throw e;
                                                                                                                            } catch (Throwable th11) {
                                                                                                                                th = th11;
                                                                                                                                th3 = th;
                                                                                                                                try {
                                                                                                                                    processExec.destroy();
                                                                                                                                    throw th3;
                                                                                                                                } catch (Exception unused2) {
                                                                                                                                    throw th3;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } catch (InterruptedException e3) {
                                                                                                                            e = e3;
                                                                                                                        } catch (Throwable th12) {
                                                                                                                            th = th12;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        iLastIndexOf = iLastIndexOf;
                                                                                                                    }
                                                                                                                    long nanos2 = TimeUnit.MILLISECONDS.toNanos(2000L) - (System.nanoTime() - jNanoTime);
                                                                                                                    if (nanos2 <= 0) {
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    nanos = nanos2;
                                                                                                                    iLastIndexOf = iLastIndexOf;
                                                                                                                } catch (InterruptedException e4) {
                                                                                                                    throw e4;
                                                                                                                } catch (Throwable th13) {
                                                                                                                    th3 = th13;
                                                                                                                    processExec.destroy();
                                                                                                                    throw th3;
                                                                                                                }
                                                                                                            }
                                                                                                            try {
                                                                                                                try {
                                                                                                                    dataOutputStream.close();
                                                                                                                } catch (IOException unused3) {
                                                                                                                }
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        byte[] bArr6 = $$a;
                                                                                                                        Object[] objArr37 = new Object[1];
                                                                                                                        c(bArr6[54], bArr6[58], bArr6[44], objArr37);
                                                                                                                        Class<?> cls10 = Class.forName((String) objArr37[0]);
                                                                                                                        byte b19 = bArr6[28];
                                                                                                                        Object[] objArr38 = new Object[1];
                                                                                                                        c(b19, bArr6[58], b19, objArr38);
                                                                                                                        cls10.getMethod((String) objArr38[0], Long.TYPE).invoke(objNewInstance, 100L);
                                                                                                                        try {
                                                                                                                            Object[] objArr39 = new Object[1];
                                                                                                                            c(bArr6[54], bArr6[58], bArr6[44], objArr39);
                                                                                                                            Class<?> cls11 = Class.forName((String) objArr39[0]);
                                                                                                                            byte b20 = bArr6[28];
                                                                                                                            Object[] objArr40 = new Object[1];
                                                                                                                            c(b20, bArr6[58], b20, objArr40);
                                                                                                                            cls11.getMethod((String) objArr40[0], Long.TYPE).invoke(objNewInstance2, 10L);
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        processExec.destroy();
                                                                                                                                        while (true) {
                                                                                                                                            if (i17 < length2) {
                                                                                                                                                str2 = strArrSplit[i17];
                                                                                                                                                int i203 = -(-Color.rgb(0, 0, 0));
                                                                                                                                                int i204 = (i203 ^ 16818003) + ((i203 & 16818003) << 1);
                                                                                                                                                objArr2 = new Object[1];
                                                                                                                                                e(new char[]{25359, 64589, 23994, 48877, 7762, 32647, 55528, 14336, 39300, 64251, 23084, 48064, 5372, 29735, 54682, 14021, 38435, 63385, 20615}, i204, objArr2);
                                                                                                                                                if (!str2.startsWith((String) objArr2[0])) {
                                                                                                                                                    int i205 = 213 - (~(-View.resolveSize(0, 0)));
                                                                                                                                                    int i206 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                                                                                                                    int i207 = (i206 & 20) + (i206 | 20);
                                                                                                                                                    int i208 = -TextUtils.lastIndexOf("", '0');
                                                                                                                                                    objArr3 = new Object[1];
                                                                                                                                                    a(true, i205, i207, (i208 ^ 9) + ((i208 & 9) << 1), new char[]{15, 3, 65498, 5, 7, 1, 11, 3, 1, 16, 65486, 4, '\t', 15, 18, 4, 14, 1, 65486, '\r'}, objArr3);
                                                                                                                                                    if (str2.startsWith((String) objArr3[0])) {
                                                                                                                                                        continue;
                                                                                                                                                    } else {
                                                                                                                                                        int iRed = Color.red(0);
                                                                                                                                                        int iB6 = SearchView9.b();
                                                                                                                                                        int i209 = (iRed * 303) - 6690929;
                                                                                                                                                        int i210 = (~iRed) | (~iB6);
                                                                                                                                                        int i211 = ~((i210 & 22229) | (i210 ^ 22229));
                                                                                                                                                        int i212 = iRed | 22229;
                                                                                                                                                        int i213 = ~((i212 & iB6) | (i212 ^ iB6));
                                                                                                                                                        int i214 = ((i211 & i213) | (i211 ^ i213)) * (-302);
                                                                                                                                                        int i215 = (i209 ^ i214) + ((i209 & i214) << 1);
                                                                                                                                                        int i216 = ~iRed;
                                                                                                                                                        int i217 = (i216 & 22229) | (i216 ^ 22229);
                                                                                                                                                        int i218 = -(-((~((i217 & iB6) | (i217 ^ iB6))) * (-604)));
                                                                                                                                                        int i219 = ~((iRed & (-22230)) | ((-22230) ^ iRed));
                                                                                                                                                        int i220 = ~((iB6 & 22229) | (iB6 ^ 22229));
                                                                                                                                                        int i221 = (((i215 | i218) << 1) - (i218 ^ i215)) + (((i219 & i220) | (i219 ^ i220)) * 302);
                                                                                                                                                        objArr4 = new Object[1];
                                                                                                                                                        e(new char[]{25359, 13771, 52918, 26475, 14410, 53553, 27620, 15510}, i221, objArr4);
                                                                                                                                                        if (str2.startsWith((String) objArr4[0])) {
                                                                                                                                                            Object[] objArr41 = new Object[1];
                                                                                                                                                            e(new char[]{25413}, 18839 - KeyEvent.getDeadChar(0, 0), objArr41);
                                                                                                                                                            Split = str2.split((String) objArr41[0]);
                                                                                                                                                            if (Split.length > 1 && Split[1].equalsIgnoreCase(r12)) {
                                                                                                                                                                i37 = i;
                                                                                                                                                                int i222 = (~(i37 & iLastIndexOf)) & (i37 | iLastIndexOf);
                                                                                                                                                                int i223 = (i222 | (-i222)) >> 31;
                                                                                                                                                                int i224 = i12 & (~i223);
                                                                                                                                                                int i225 = iLastIndexOf & i223;
                                                                                                                                                                iLastIndexOf = (i225 & i224) | (i224 ^ i225);
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            continue;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                int i226 = (i17 ^ (-69)) + ((i17 & (-69)) << 1);
                                                                                                                                                i17 = (i226 & 70) + (i226 | 70);
                                                                                                                                            } else {
                                                                                                                                                i37 = i;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } catch (IOException unused4) {
                                                                                                                                    }
                                                                                                                                } catch (Exception unused5) {
                                                                                                                                }
                                                                                                                                StringBuilder sb2 = new StringBuilder();
                                                                                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                                                                                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                                                                                                    char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                                                                                                                                    int iMyTid = (Process.myTid() >> 22) + 2142;
                                                                                                                                    int i227 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 44;
                                                                                                                                    byte b21 = $$d[7];
                                                                                                                                    byte b22 = (byte) (b21 - 1);
                                                                                                                                    byte b23 = b21;
                                                                                                                                    Object[] objArr42 = new Object[1];
                                                                                                                                    d(b22, b23, (byte) (b23 - 1), objArr42);
                                                                                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, iMyTid, i227, 399405187, false, (String) objArr42[0], null);
                                                                                                                                }
                                                                                                                                sb2.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(objNewInstance).toString());
                                                                                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                                                                                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                                                                                                    char cMyPid = (char) (Process.myPid() >> 22);
                                                                                                                                    int iNormalizeMetaState = 2142 - KeyEvent.normalizeMetaState(0);
                                                                                                                                    int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0, 0) + 46;
                                                                                                                                    byte b24 = $$d[7];
                                                                                                                                    byte b25 = (byte) (b24 - 1);
                                                                                                                                    byte b26 = b24;
                                                                                                                                    Object[] objArr43 = new Object[1];
                                                                                                                                    d(b25, b26, (byte) (b26 - 1), objArr43);
                                                                                                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMyPid, iNormalizeMetaState, iLastIndexOf3, 399405187, false, (String) objArr43[0], null);
                                                                                                                                }
                                                                                                                                sb2.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(objNewInstance2).toString());
                                                                                                                                String string2 = sb2.toString();
                                                                                                                                Object[] objArr44 = new Object[1];
                                                                                                                                e(new char[]{25461}, 35830 - (~(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), objArr44);
                                                                                                                                strArrSplit = string2.split((String) objArr44[0]);
                                                                                                                                length2 = strArrSplit.length;
                                                                                                                                i17 = 0;
                                                                                                                            } catch (Exception unused6) {
                                                                                                                                i37 = i;
                                                                                                                                int absoluteGravity = 209 - Gravity.getAbsoluteGravity(0, 0);
                                                                                                                                int i228 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                                                                                                                int i229 = (i228 * 989) - 26649;
                                                                                                                                int i230 = (-28) | i6;
                                                                                                                                int i231 = ~((i230 & i228) | (i230 ^ i228));
                                                                                                                                int i232 = (i228 ^ 27) | (i228 & 27);
                                                                                                                                int i233 = ~((i232 & i37) | (i232 ^ i37));
                                                                                                                                int i234 = -(-(((i231 & i233) | (i231 ^ i233)) * 988));
                                                                                                                                int i235 = (i229 ^ i234) + ((i229 & i234) << 1);
                                                                                                                                int i236 = (i228 | (-28)) * (-988);
                                                                                                                                int i237 = (i235 ^ i236) + ((i236 & i235) << 1);
                                                                                                                                int i238 = ~i228;
                                                                                                                                int i239 = ~((i238 & (-28)) | (i238 ^ (-28)));
                                                                                                                                int i240 = ~((-28) | i37);
                                                                                                                                int i241 = (i239 & i240) | (i239 ^ i240);
                                                                                                                                int i242 = (i37 & i228) | (i37 ^ i228);
                                                                                                                                int i243 = ~((i242 & 27) | (i242 ^ 27));
                                                                                                                                int i244 = i237 + (((i243 & i241) | (i241 ^ i243)) * 988);
                                                                                                                                int i245 = -(ViewConfiguration.getScrollBarSize() >> 8);
                                                                                                                                Object[] objArr45 = new Object[1];
                                                                                                                                a(true, absoluteGravity, i244, (i245 & 21) + (i245 | 21), new char[]{23, 21, 65477, 6, 65477, '\n', 25, 6, '\n', 23, '\b', 65477, 20, 25, 65477, '\t', '\n', 17, 14, 6, 65515, 65491, 24, 24, '\n', '\b', 20}, objArr45);
                                                                                                                                throw new IOException((String) objArr45[0]);
                                                                                                                            }
                                                                                                                        } catch (Throwable th14) {
                                                                                                                            Throwable cause5 = th14.getCause();
                                                                                                                            if (cause5 != null) {
                                                                                                                                throw cause5;
                                                                                                                            }
                                                                                                                            throw th14;
                                                                                                                        }
                                                                                                                    } catch (Throwable th15) {
                                                                                                                        Throwable cause6 = th15.getCause();
                                                                                                                        if (cause6 != null) {
                                                                                                                            throw cause6;
                                                                                                                        }
                                                                                                                        throw th15;
                                                                                                                    }
                                                                                                                } catch (InterruptedException e5) {
                                                                                                                    e = e5;
                                                                                                                    throw e;
                                                                                                                }
                                                                                                            } catch (InterruptedException e6) {
                                                                                                                e = e6;
                                                                                                                throw e;
                                                                                                            } catch (Throwable th16) {
                                                                                                                th = th16;
                                                                                                                th3 = th;
                                                                                                                processExec.destroy();
                                                                                                                throw th3;
                                                                                                            }
                                                                                                        } catch (InterruptedException e7) {
                                                                                                            e = e7;
                                                                                                        } catch (Throwable th17) {
                                                                                                            th = th17;
                                                                                                        }
                                                                                                    } catch (Throwable th18) {
                                                                                                        th = th18;
                                                                                                    }
                                                                                                } catch (IOException unused7) {
                                                                                                    i37 = i;
                                                                                                    iLastIndexOf = iLastIndexOf;
                                                                                                } catch (Exception unused8) {
                                                                                                    i37 = i;
                                                                                                }
                                                                                            } catch (Throwable th19) {
                                                                                                Throwable cause7 = th19.getCause();
                                                                                                if (cause7 != null) {
                                                                                                    throw cause7;
                                                                                                }
                                                                                                throw th19;
                                                                                            }
                                                                                        } catch (Throwable th20) {
                                                                                            th = th20;
                                                                                            Throwable th21 = th;
                                                                                            Throwable cause8 = th21.getCause();
                                                                                            if (cause8 != null) {
                                                                                                throw cause8;
                                                                                            }
                                                                                            throw th21;
                                                                                        }
                                                                                    } catch (Throwable th22) {
                                                                                        th = th22;
                                                                                    }
                                                                                } catch (Throwable th23) {
                                                                                    th = th23;
                                                                                }
                                                                            } catch (Throwable th24) {
                                                                                th = th24;
                                                                            }
                                                                        } catch (IOException unused9) {
                                                                            iLastIndexOf = iLastIndexOf;
                                                                            i12 = i12;
                                                                            i37 = i37;
                                                                            r311 = r311;
                                                                            r310 = r310;
                                                                            i37 = i22;
                                                                        } catch (Exception unused10) {
                                                                            i37 = i37;
                                                                            i37 = i22;
                                                                            int absoluteGravity2 = 209 - Gravity.getAbsoluteGravity(0, 0);
                                                                            int i2210 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                                                            int i2211 = (i2210 * 989) - 26649;
                                                                            int i2310 = (-28) | i6;
                                                                            int i2311 = ~((i2310 & i2210) | (i2310 ^ i2210));
                                                                            int i2312 = (i2210 ^ 27) | (i2210 & 27);
                                                                            int i2313 = ~((i2312 & i37) | (i2312 ^ i37));
                                                                            int i2314 = -(-(((i2311 & i2313) | (i2311 ^ i2313)) * 988));
                                                                            int i2315 = (i2211 ^ i2314) + ((i2211 & i2314) << 1);
                                                                            int i2316 = (i2210 | (-28)) * (-988);
                                                                            int i2317 = (i2315 ^ i2316) + ((i2316 & i2315) << 1);
                                                                            int i2318 = ~i2210;
                                                                            int i2319 = ~((i2318 & (-28)) | (i2318 ^ (-28)));
                                                                            int i246 = ~((-28) | i37);
                                                                            int i247 = (i2319 & i246) | (i2319 ^ i246);
                                                                            int i248 = (i37 & i2210) | (i37 ^ i2210);
                                                                            int i249 = ~((i248 & 27) | (i248 ^ 27));
                                                                            int i2410 = i2317 + (((i249 & i247) | (i247 ^ i249)) * 988);
                                                                            int i2411 = -(ViewConfiguration.getScrollBarSize() >> 8);
                                                                            Object[] objArr46 = new Object[1];
                                                                            a(true, absoluteGravity2, i2410, (i2411 & 21) + (i2411 | 21), new char[]{23, 21, 65477, 6, 65477, '\n', 25, 6, '\n', 23, '\b', 65477, 20, 25, 65477, '\t', '\n', 17, 14, 6, 65515, 65491, 24, 24, '\n', '\b', 20}, objArr46);
                                                                            throw new IOException((String) objArr46[0]);
                                                                        }
                                                                    } catch (Throwable th25) {
                                                                        th = th25;
                                                                        th2 = th;
                                                                        cause = th2.getCause();
                                                                        if (cause != null) {
                                                                            throw cause;
                                                                        }
                                                                        throw th2;
                                                                    }
                                                                } catch (Throwable th26) {
                                                                    th = th26;
                                                                }
                                                            } catch (Throwable th27) {
                                                                th = th27;
                                                            }
                                                        } catch (Exception unused11) {
                                                        }
                                                    } catch (IOException unused12) {
                                                        iLastIndexOf = iLastIndexOf;
                                                        i12 = i12;
                                                        r314 = r311;
                                                        r313 = r310;
                                                        i16 = i16;
                                                        r311 = r314;
                                                        r310 = r313;
                                                        i37 = i22;
                                                        iLastIndexOf = iLastIndexOf;
                                                        int i250 = ((i16 | (-81)) << 1) - (i16 ^ (-81));
                                                        i16 = (i250 & 82) + (i250 | 82);
                                                        i22 = i37;
                                                        i37 = i37;
                                                        i12 = i12;
                                                        r5 = r311;
                                                        length = r310 == true ? 1 : 0;
                                                        obj5 = obj4;
                                                        i15 = 0;
                                                        r311 = r311;
                                                        r310 = r310;
                                                    } catch (Exception unused13) {
                                                        i37 = i22;
                                                        int absoluteGravity3 = 209 - Gravity.getAbsoluteGravity(0, 0);
                                                        int i2212 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                                        int i2213 = (i2212 * 989) - 26649;
                                                        int i23110 = (-28) | i6;
                                                        int i23111 = ~((i23110 & i2212) | (i23110 ^ i2212));
                                                        int i23112 = (i2212 ^ 27) | (i2212 & 27);
                                                        int i23113 = ~((i23112 & i37) | (i23112 ^ i37));
                                                        int i23114 = -(-(((i23111 & i23113) | (i23111 ^ i23113)) * 988));
                                                        int i23115 = (i2213 ^ i23114) + ((i2213 & i23114) << 1);
                                                        int i23116 = (i2212 | (-28)) * (-988);
                                                        int i23117 = (i23115 ^ i23116) + ((i23116 & i23115) << 1);
                                                        int i23118 = ~i2212;
                                                        int i23119 = ~((i23118 & (-28)) | (i23118 ^ (-28)));
                                                        int i2412 = ~((-28) | i37);
                                                        int i2413 = (i23119 & i2412) | (i23119 ^ i2412);
                                                        int i2414 = (i37 & i2212) | (i37 ^ i2212);
                                                        int i2415 = ~((i2414 & 27) | (i2414 ^ 27));
                                                        int i2416 = i23117 + (((i2415 & i2413) | (i2413 ^ i2415)) * 988);
                                                        int i2417 = -(ViewConfiguration.getScrollBarSize() >> 8);
                                                        Object[] objArr47 = new Object[1];
                                                        a(true, absoluteGravity3, i2416, (i2417 & 21) + (i2417 | 21), new char[]{23, 21, 65477, 6, 65477, '\n', 25, 6, '\n', 23, '\b', 65477, 20, 25, 65477, '\t', '\n', 17, 14, 6, 65515, 65491, 24, 24, '\n', '\b', 20}, objArr47);
                                                        throw new IOException((String) objArr47[0]);
                                                    }
                                                } catch (IOException unused14) {
                                                    r312 = r311;
                                                    obj4 = obj5;
                                                    r313 = length;
                                                    r314 = r312;
                                                    i16 = i16;
                                                    r311 = r314;
                                                    r310 = r313;
                                                    i37 = i22;
                                                    iLastIndexOf = iLastIndexOf;
                                                    int i251 = ((i16 | (-81)) << 1) - (i16 ^ (-81));
                                                    i16 = (i251 & 82) + (i251 | 82);
                                                    i22 = i37;
                                                    i37 = i37;
                                                    i12 = i12;
                                                    r5 = r311;
                                                    length = r310 == true ? 1 : 0;
                                                    obj5 = obj4;
                                                    i15 = 0;
                                                    r311 = r311;
                                                    r310 = r310;
                                                } catch (Exception unused15) {
                                                    i37 = i22;
                                                    int absoluteGravity4 = 209 - Gravity.getAbsoluteGravity(0, 0);
                                                    int i2214 = -(ViewConfiguration.getJumpTapTimeout() >> 16);
                                                    int i2215 = (i2214 * 989) - 26649;
                                                    int i231110 = (-28) | i6;
                                                    int i231111 = ~((i231110 & i2214) | (i231110 ^ i2214));
                                                    int i231112 = (i2214 ^ 27) | (i2214 & 27);
                                                    int i231113 = ~((i231112 & i37) | (i231112 ^ i37));
                                                    int i231114 = -(-(((i231111 & i231113) | (i231111 ^ i231113)) * 988));
                                                    int i231115 = (i2215 ^ i231114) + ((i2215 & i231114) << 1);
                                                    int i231116 = (i2214 | (-28)) * (-988);
                                                    int i231117 = (i231115 ^ i231116) + ((i231116 & i231115) << 1);
                                                    int i231118 = ~i2214;
                                                    int i231119 = ~((i231118 & (-28)) | (i231118 ^ (-28)));
                                                    int i2418 = ~((-28) | i37);
                                                    int i2419 = (i231119 & i2418) | (i231119 ^ i2418);
                                                    int i24110 = (i37 & i2214) | (i37 ^ i2214);
                                                    int i24111 = ~((i24110 & 27) | (i24110 ^ 27));
                                                    int i24112 = i231117 + (((i24111 & i2419) | (i2419 ^ i24111)) * 988);
                                                    int i24113 = -(ViewConfiguration.getScrollBarSize() >> 8);
                                                    Object[] objArr48 = new Object[1];
                                                    a(true, absoluteGravity4, i24112, (i24113 & 21) + (i24113 | 21), new char[]{23, 21, 65477, 6, 65477, '\n', 25, 6, '\n', 23, '\b', 65477, 20, 25, 65477, '\t', '\n', 17, 14, 6, 65515, 65491, 24, 24, '\n', '\b', 20}, objArr48);
                                                    throw new IOException((String) objArr48[0]);
                                                }
                                            } catch (Exception unused16) {
                                            }
                                        } catch (IOException unused17) {
                                            r312 = r5;
                                        }
                                    } catch (IOException unused18) {
                                    }
                                }
                                int i252 = ((i16 | (-81)) << 1) - (i16 ^ (-81));
                                i16 = (i252 & 82) + (i252 | 82);
                                i22 = i37;
                                i37 = i37;
                                i12 = i12;
                                r5 = r311;
                                length = r310 == true ? 1 : 0;
                                obj5 = obj4;
                                i15 = 0;
                                r311 = r311;
                                r310 = r310;
                            } else {
                                iLastIndexOf = iLastIndexOf;
                                i12 = i12;
                                r311 = r5;
                                obj4 = obj5;
                                i37 = i37;
                                r310 = length;
                                i16 = i16;
                                i37 = i22;
                            }
                            iLastIndexOf = iLastIndexOf;
                            int i253 = ((i16 | (-81)) << 1) - (i16 ^ (-81));
                            i16 = (i253 & 82) + (i253 | 82);
                            i22 = i37;
                            i37 = i37;
                            i12 = i12;
                            r5 = r311;
                            length = r310 == true ? 1 : 0;
                            obj5 = obj4;
                            i15 = 0;
                            r311 = r311;
                            r310 = r310;
                        }
                        obj = obj5;
                        i7 = i37;
                        i4 = i22;
                    } else {
                        i10 = iIndexOf;
                        obj2 = objInvoke;
                        i6 = i33;
                        i11 = 0;
                        i12 = (i22 & (-21)) | (i6 & 20);
                        int i710 = -i11;
                        int i711 = ((i11 & i710) | (i11 ^ i710)) >> 31;
                        int i712 = (~i711) & i22;
                        int i713 = i711 & i12;
                        int i714 = (i713 & i712) | (i712 ^ i713);
                        byte b110 = (byte) ($$b - 5);
                        byte[] bArr7 = $$a;
                        byte b111 = bArr7[28];
                        Object[] objArr110 = new Object[1];
                        c(b110, b111, (byte) (b111 | 62), objArr110);
                        Class<?> cls12 = Class.forName((String) objArr110[0]);
                        byte b112 = bArr7[58];
                        byte b113 = bArr7[13];
                        Object[] objArr111 = new Object[1];
                        c(b112, b113, (byte) (b113 | 28), objArr111);
                        obj3 = obj2;
                        str = (String) cls12.getField((String) objArr111[0]).get(obj3);
                        int length5 = str.length();
                        int iB7 = SearchView9.b();
                        int i715 = -(-(length5 * (-67)));
                        int i716 = ((-414) & i715) + (i715 | (-414));
                        int i717 = ~length5;
                        int i718 = (5 ^ i717) | (5 & i717);
                        int i719 = ~iB7;
                        int i810 = -(-(((~((i718 & i719) | (i718 ^ i719))) | (~(((-6) ^ length5) | ((-6) & length5))) | (~((length5 ^ iB7) | (length5 & iB7)))) * (-68)));
                        int i811 = ((i716 | i810) << 1) - (i810 ^ i716);
                        int i812 = (5 ^ i719) | (i719 & 5);
                        int i813 = (~((length5 & i812) | (i812 ^ length5))) * (-68);
                        int i814 = (i811 ^ i813) + ((i813 & i811) << 1);
                        int i815 = ~iB7;
                        int i816 = ~((i815 & i717) | (i717 ^ i815));
                        i13 = (i814 - (~(-(-(((i816 & 5) | (5 ^ i816)) * 68))))) - 1;
                        if (i13 >= 0) {
                            obj4 = obj3;
                            i14 = 0;
                            r38 = str4;
                            r39 = length3;
                            break;
                        }
                        i18 = 0;
                        while (true) {
                            if (i18 <= i13) {
                                str4 = str4;
                                length3 = length3;
                                obj4 = obj3;
                                i14 = 0;
                                r38 = str4;
                                r39 = length3;
                                break;
                            }
                            str4 = str4;
                            length3 = length3;
                            int i817 = i18 * (-375);
                            int i818 = ((-2250) & i817) + (i817 | (-2250));
                            int i819 = ~i18;
                            int i910 = (~((i819 & (-7)) | ((-7) ^ i819))) | i22;
                            int i911 = (i18 ^ 6) | (i18 & 6);
                            int i912 = ~i911;
                            int i913 = -(-(((i910 & i912) | (i910 ^ i912)) * 376));
                            int i914 = (i818 ^ i913) + ((i913 & i818) << 1);
                            int i915 = ~((i6 ^ 6) | (i6 & 6));
                            int i916 = ~i911;
                            int i917 = ((i915 & i916) | (i915 ^ i916)) * (-376);
                            int i918 = ((i914 | i917) << 1) - (i917 ^ i914);
                            int i919 = ~(((-7) & i22) | ((-7) ^ i22));
                            Object[] objArr112 = {str.substring(i18, i918 + (((i919 & i18) | (i18 ^ i919)) * 376)), 931995};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char cRed2 = (char) Color.red(0);
                                int iArgb3 = Color.argb(0, 0, 0, 0) + 3393;
                                int pressedStateDuration2 = 9 - (ViewConfiguration.getPressedStateDuration() >> 16);
                                byte b114 = $$d[7];
                                Object[] objArr113 = new Object[1];
                                d((byte) 14, b114, b114, objArr113);
                                char c4 = cRed2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c4, iArgb3, pressedStateDuration2, 1203525406, false, (String) objArr113[0], new Class[]{String.class, Integer.TYPE});
                                r315 = c4;
                            } else {
                                r315 = str4;
                            }
                            long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr112)).longValue();
                            long j110 = 1098133126;
                            long j111 = -751;
                            i19 = i18;
                            long j112 = -1;
                            j = j110 ^ j112;
                            long j113 = jLongValue3 ^ j112;
                            obj4 = obj3;
                            long j114 = i22;
                            long j115 = (j111 * j110) + (j111 * jLongValue3) + (((long) 1504) * (((j | j113) ^ j112) | ((j | j114) ^ j112)));
                            long j116 = j | jLongValue3;
                            long j21 = j115 + (((long) (-1504)) * ((j114 | j116) ^ j112)) + (((long) 752) * ((j112 ^ (j113 | j110)) | (j116 ^ j112))) + ((long) (-1100203003));
                            i20 = ((int) (j21 >> 32)) & (164088274 + (((-1074372865) | i6) * 494) + (((~(i6 | (-1922016102))) | (-1162454411)) * 494));
                            i21 = ((int) j21) & ((((~((-1746722580) | i22)) | 671355921) * (-566)) + 593102827 + ((~((-1075366659) | i22)) * 566));
                            if (((i21 & i20) | (i20 ^ i21)) == -2096167706) {
                                i14 = 1;
                                r38 = r315;
                                r39 = j;
                                break;
                            }
                            int i1010 = (i19 ^ (-94)) + ((i19 & (-94)) << 1);
                            i18 = ((i1010 | 95) << 1) - (i1010 ^ 95);
                            str = str;
                            i13 = i13;
                            obj3 = obj4;
                            str4 = r315;
                            length3 = j;
                        }
                        int i1011 = (i14 | (-i14)) >> 31;
                        int i1012 = (~i1011) & i22;
                        int i1013 = i1011 & i12;
                        int i1014 = (i1013 & i1012) | (i1012 ^ i1013);
                        int i1015 = (~(i22 & i714)) & (i22 | i714);
                        int i1016 = -i1015;
                        int i1017 = ((i1015 & i1016) | (i1015 ^ i1016)) >> 31;
                        int i1018 = i1014 & (~i1017);
                        int i1019 = i714 & i1017;
                        iLastIndexOf = (i1019 & i1018) | (i1018 ^ i1019);
                        byte b115 = (byte) ($$b - 5);
                        byte[] bArr8 = $$a;
                        byte b116 = bArr8[28];
                        Object[] objArr114 = new Object[1];
                        c(b115, b116, (byte) (b116 | 62), objArr114);
                        Class<?> cls13 = Class.forName((String) objArr114[0]);
                        byte b117 = bArr8[58];
                        byte b118 = bArr8[13];
                        Object[] objArr210 = new Object[1];
                        c(b117, b118, (byte) (b118 | 28), objArr210);
                        obj5 = obj4;
                        String str9 = (String) cls13.getField((String) objArr210[0]).get(obj5);
                        int i1110 = i10;
                        int i1111 = ~i1110;
                        int i1112 = -i1111;
                        int i1113 = i1110 & (((i1111 & i1112) | (i1111 ^ i1112)) >> 31);
                        i15 = 0;
                        String strSubstring3 = str9.substring(0, i1113);
                        int i1114 = -(-ImageFormat.getBitsPerPixel(0));
                        int i1115 = (i1114 ^ 28220) + ((i1114 & 28220) << 1);
                        Object[] objArr211 = new Object[1];
                        e(new char[]{25424}, i1115, objArr211);
                        String[] strArrSplit3 = strSubstring3.split((String) objArr211[0]);
                        length = strArrSplit3.length;
                        i16 = 0;
                        r5 = strArrSplit3;
                        r311 = r38;
                        r310 = r39;
                        while (i16 < length) {
                            r12 = r5[i16];
                            i16 = 1;
                            int i1116 = -(ExpandableListView.getPackedPositionForGroup(i15) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i15) == 0L ? 0 : -1));
                            int i1117 = i1116 * (-183);
                            int i1118 = ((i1117 | 35890) << 1) - (i1117 ^ 35890);
                            int i1119 = ~i1116;
                            int i1210 = (i1116 & (-195)) | (i1116 ^ (-195));
                            int i1211 = (((i1118 - (~(-(-(((i1119 & 194) | (i1119 ^ 194)) * (-368)))))) - 1) - (~(-(-(((i1210 & i6) | (i1210 ^ i6)) * 184))))) - 1;
                            int i1212 = ~((i1119 & (-195)) | (i1119 ^ (-195)));
                            int i1213 = ~((i6 ^ i1116) | (i6 & i1116));
                            int i1214 = (i1212 ^ i1213) | (i1212 & i1213);
                            int i1215 = ~(i1116 | 194);
                            i37 = i1211 + (((i1215 & i1214) | (i1214 ^ i1215)) * 184);
                            i12 = 3 - (~(-(-Process.getGidForName(""))));
                            iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 3;
                            objArr = new Object[1];
                            a(true, i37, i12, iLastIndexOf, new char[]{65506, 15, 17}, objArr);
                            if (r12.split((String) objArr[0]).length > 1) {
                                synchronized (((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) TextUtils.getOffsetBefore("", 0), 2267 - (ViewConfiguration.getTapTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 34))) {
                                    Object[] objArr212 = new Object[1];
                                    e(new char[]{25359, 44955, 64077, 1672, 20786, 40353, 43069, 62688, 1863, 21455, 40518, 43767, 62834, 493, 19556, 40715}, AndroidCharacter.getMirror('0') + 52313, objArr212);
                                    String str10 = (String) objArr212[0];
                                    Runtime runtime2 = Runtime.getRuntime();
                                    int jumpTapTimeout3 = ViewConfiguration.getJumpTapTimeout() >> 16;
                                    int i1216 = (jumpTapTimeout3 | 227) + (jumpTapTimeout3 & 227);
                                    int i1217 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                    int i1218 = ((i1217 | 3) << 1) - (i1217 ^ 3);
                                    r311 = r5;
                                    int iArgb4 = Color.argb(0, 0, 0, 0);
                                    r310 = length;
                                    int i1219 = ~iArgb4;
                                    obj4 = obj5;
                                    int i1310 = (((~((i1219 ^ i6) | (i1219 & i6))) | (~((-3) | i37))) * (-867)) + (iArgb4 * 868) + 1736;
                                    int i1311 = ~iArgb4;
                                    int i1312 = ~((i1311 ^ (-3)) | (i1311 & (-3)));
                                    int i1313 = ~(i1219 | i22);
                                    int i1314 = (i1312 ^ i1313) | (i1312 & i1313);
                                    int i1315 = ~(((-3) ^ i22) | ((-3) & i22));
                                    int i1316 = -(-(((i1314 ^ i1315) | (i1314 & i1315)) * (-1734)));
                                    i37 = 1;
                                    int i1317 = ((i1310 | i1316) << 1) - (i1310 ^ i1316);
                                    int i1318 = (i1311 ^ (-3)) | (i1311 & (-3));
                                    int i1319 = ~((i1318 & i6) | (i1318 ^ i6));
                                    int i1410 = (i1311 & 2) | (i1311 ^ 2);
                                    int i1411 = ~((i1410 & i22) | (i1410 ^ i22));
                                    int i1412 = (i1319 & i1411) | (i1319 ^ i1411);
                                    int i1413 = (iArgb4 & (-3)) | ((-3) ^ iArgb4);
                                    int i1414 = ~((i1413 & i22) | (i1413 ^ i22));
                                    int i1415 = ((i1412 & i1414) | (i1412 ^ i1414)) * 867;
                                    Object[] objArr213 = new Object[1];
                                    a(false, i1216, i1218, (i1317 & i1415) + (i1317 | i1415), new char[]{6, 65531}, objArr213);
                                    processExec = runtime2.exec((String) objArr213[0], (String[]) null, (File) null);
                                    Object[] objArr214 = {processExec.getInputStream()};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 2142 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 45 - View.MeasureSpec.getSize(0), -1020714777, false, null, new Class[]{InputStream.class});
                                    }
                                    Object objNewInstance3 = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).newInstance(objArr214);
                                    Object[] objArr215 = {processExec.getErrorStream()};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(666339120);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Drawable.resolveOpacity(0, 0), 2142 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 45 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1020714777, false, null, new Class[]{InputStream.class});
                                    }
                                    Object objNewInstance4 = ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).newInstance(objArr215);
                                    DataOutputStream dataOutputStream2 = new DataOutputStream(processExec.getOutputStream());
                                    byte[] bArr9 = $$a;
                                    i37 = i37;
                                    Object[] objArr216 = new Object[1];
                                    c(bArr9[54], bArr9[58], bArr9[44], objArr216);
                                    Class<?> cls14 = Class.forName((String) objArr216[0]);
                                    i12 = i12;
                                    Object[] objArr217 = new Object[1];
                                    c(bArr9[13], (byte) (-bArr9[35]), bArr9[14], objArr217);
                                    cls14.getMethod((String) objArr217[0], null).invoke(objNewInstance3, null);
                                    Object[] objArr218 = new Object[1];
                                    c(bArr9[54], bArr9[58], bArr9[44], objArr218);
                                    Class<?> cls15 = Class.forName((String) objArr218[0]);
                                    Object[] objArr219 = new Object[1];
                                    c(bArr9[13], (byte) (-bArr9[35]), bArr9[14], objArr219);
                                    cls15.getMethod((String) objArr219[0], null).invoke(objNewInstance4, null);
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(str10);
                                    int iLastIndexOf4 = TextUtils.lastIndexOf("", '0', 0);
                                    int iB8 = SearchView9.b();
                                    int i1416 = (iLastIndexOf4 * (-711)) - (-25548216);
                                    int i1417 = ~(((-35833) ^ iLastIndexOf4) | ((-35833) & iLastIndexOf4));
                                    int i1418 = ~((~iB8) | iLastIndexOf4);
                                    int i1419 = ((i1417 ^ i1418) | (i1418 & i1417)) * (-712);
                                    int i1510 = (i1416 ^ i1419) + ((i1419 & i1416) << 1);
                                    int i1511 = ~iB8;
                                    int i1512 = ((-35833) ^ i1511) | ((-35833) & i1511);
                                    int i1513 = ~((i1512 ^ iLastIndexOf4) | (i1512 & iLastIndexOf4));
                                    int i1514 = iLastIndexOf4 | 35832;
                                    int i1515 = (i1513 | (~((i1514 ^ iB8) | (i1514 & iB8)))) * (-712);
                                    int i1516 = ((i1510 | i1515) << 1) - (i1515 ^ i1510);
                                    int i1517 = ~((iLastIndexOf4 & i1511) | (i1511 ^ iLastIndexOf4));
                                    int i1518 = -(-(((i1517 & (-35833)) | ((-35833) ^ i1517)) * 712));
                                    int i1519 = ((i1516 | i1518) << 1) - (i1516 ^ i1518);
                                    Object[] objArr310 = new Object[1];
                                    e(new char[]{25461}, i1519, objArr310);
                                    sb3.append((String) objArr310[0]);
                                    String string3 = sb3.toString();
                                    int i1610 = -(-TextUtils.indexOf("", "", 0, 0));
                                    Object[] objArr311 = new Object[1];
                                    e(new char[]{25386, 38932, 38215, 37615, 36795}, (i1610 & 64319) + (i1610 | 64319), objArr311);
                                    dataOutputStream2.write(string3.getBytes((String) objArr311[0]));
                                    dataOutputStream2.flush();
                                    int i1611 = 208 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                    int i1612 = -(KeyEvent.getMaxKeyCode() >> 16);
                                    int iB9 = SearchView9.b();
                                    int i1613 = i1612 * 522;
                                    int i1614 = (i1613 & (-2600)) + (i1613 | (-2600));
                                    int i1615 = ~iB9;
                                    int i1616 = ~(i1615 | 5);
                                    int i1617 = -(-(((i1616 & i1612) | (i1612 ^ i1616)) * (-1042)));
                                    int i1618 = (i1614 ^ i1617) + ((i1614 & i1617) << 1);
                                    int i1619 = -(-((iB9 | 5) * 521));
                                    int i1710 = ((i1618 | i1619) << 1) - (i1619 ^ i1618);
                                    int i1711 = ~i1612;
                                    int i1712 = ~(i1711 | (-6));
                                    int i1713 = ~((i1711 ^ iB9) | (iB9 & i1711));
                                    int i1714 = (i1713 & i1712) | (i1712 ^ i1713);
                                    int i1715 = i1612 | i1615;
                                    int i1716 = ~((i1715 & 5) | (i1715 ^ 5));
                                    int i1717 = i1710 + (((i1716 & i1714) | (i1714 ^ i1716)) * 521);
                                    int i1718 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                    int iB10 = SearchView9.b();
                                    int i1719 = i1718 * 50;
                                    int i1810 = (i1719 ^ (-97)) + ((i1719 & (-97)) << 1);
                                    int i1811 = ~iB10;
                                    int i1812 = (i1810 - (~(-(-(((~((i1811 & (-2)) | ((-2) ^ i1811))) | (~(((-2) ^ i1718) | ((-2) & i1718)))) * 98))))) - 1;
                                    int i1813 = ~((~i1718) | (~iB10));
                                    int i1814 = (i1813 & (-2)) | ((-2) ^ i1813);
                                    int i1815 = ~(i1718 | iB10);
                                    int i1816 = (i1812 - (~(-(-(((i1814 ^ i1815) | (i1814 & i1815)) * (-49)))))) - 1;
                                    int i1817 = ~((iB10 & (-2)) | ((-2) ^ iB10));
                                    int i1818 = ~((i1718 & 1) | (i1718 ^ 1));
                                    int i1819 = -(-(((i1818 & i1817) | (i1817 ^ i1818)) * 49));
                                    Object[] objArr312 = new Object[1];
                                    a(true, i1611, i1717, ((i1816 | i1819) << 1) - (i1819 ^ i1816), new char[]{11, 65456, 26, 15, 30}, objArr312);
                                    String str11 = (String) objArr312[0];
                                    int iResolveOpacity2 = Drawable.resolveOpacity(0, 0);
                                    int iB11 = SearchView9.b();
                                    int i1910 = iResolveOpacity2 * 934;
                                    int i1911 = (i1910 & (-59945308)) + (i1910 | (-59945308));
                                    int i1912 = ~iResolveOpacity2;
                                    int i1913 = ~iB11;
                                    int i1914 = ~((i1912 ^ i1913) | (i1912 & i1913));
                                    int i1915 = i1911 + ((((-64320) ^ i1914) | (i1914 & (-64320))) * (-933));
                                    int i1916 = ~((~iB11) | (-64320));
                                    int i1917 = ~((-64320) | iResolveOpacity2);
                                    int i1918 = -(-(((i1916 & i1917) | (i1916 ^ i1917)) * 933));
                                    int i1919 = (i1915 & i1918) + (i1918 | i1915);
                                    int i2010 = -(-((~((64319 & iResolveOpacity2) | (iResolveOpacity2 ^ 64319))) * 933));
                                    int i2011 = (i1919 & i2010) + (i2010 | i1919);
                                    Object[] objArr313 = new Object[1];
                                    e(new char[]{25386, 38932, 38215, 37615, 36795}, i2011, objArr313);
                                    dataOutputStream2.write(str11.getBytes((String) objArr313[0]));
                                    dataOutputStream2.flush();
                                    long jNanoTime2 = System.nanoTime();
                                    long nanos3 = TimeUnit.MILLISECONDS.toNanos(2000L);
                                    while (true) {
                                        processExec.exitValue();
                                        iLastIndexOf = iLastIndexOf;
                                        break;
                                    }
                                    dataOutputStream2.close();
                                    byte[] bArr10 = $$a;
                                    Object[] objArr314 = new Object[1];
                                    c(bArr10[54], bArr10[58], bArr10[44], objArr314);
                                    Class<?> cls16 = Class.forName((String) objArr314[0]);
                                    byte b119 = bArr10[28];
                                    Object[] objArr315 = new Object[1];
                                    c(b119, bArr10[58], b119, objArr315);
                                    cls16.getMethod((String) objArr315[0], Long.TYPE).invoke(objNewInstance3, 100L);
                                    Object[] objArr316 = new Object[1];
                                    c(bArr10[54], bArr10[58], bArr10[44], objArr316);
                                    Class<?> cls17 = Class.forName((String) objArr316[0]);
                                    byte b27 = bArr10[28];
                                    Object[] objArr49 = new Object[1];
                                    c(b27, bArr10[58], b27, objArr49);
                                    cls17.getMethod((String) objArr49[0], Long.TYPE).invoke(objNewInstance4, 10L);
                                    processExec.destroy();
                                    StringBuilder sb4 = new StringBuilder();
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char cIndexOf2 = (char) TextUtils.indexOf("", "", 0, 0);
                                        int iMyTid2 = (Process.myTid() >> 22) + 2142;
                                        int i2216 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 44;
                                        byte b28 = $$d[7];
                                        byte b29 = (byte) (b28 - 1);
                                        byte b210 = b28;
                                        Object[] objArr410 = new Object[1];
                                        d(b29, b210, (byte) (b210 - 1), objArr410);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf2, iMyTid2, i2216, 399405187, false, (String) objArr410[0], null);
                                    }
                                    sb4.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(objNewInstance3).toString());
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-212805804);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                        char cMyPid2 = (char) (Process.myPid() >> 22);
                                        int iNormalizeMetaState2 = 2142 - KeyEvent.normalizeMetaState(0);
                                        int iLastIndexOf5 = TextUtils.lastIndexOf("", '0', 0, 0) + 46;
                                        byte b211 = $$d[7];
                                        byte b212 = (byte) (b211 - 1);
                                        byte b213 = b211;
                                        Object[] objArr411 = new Object[1];
                                        d(b212, b213, (byte) (b213 - 1), objArr411);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMyPid2, iNormalizeMetaState2, iLastIndexOf5, 399405187, false, (String) objArr411[0], null);
                                    }
                                    sb4.append(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(objNewInstance4).toString());
                                    String string4 = sb4.toString();
                                    Object[] objArr412 = new Object[1];
                                    e(new char[]{25461}, 35830 - (~(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), objArr412);
                                    strArrSplit = string4.split((String) objArr412[0]);
                                    length2 = strArrSplit.length;
                                    i17 = 0;
                                    while (true) {
                                        if (i17 < length2) {
                                            str2 = strArrSplit[i17];
                                            int i2012 = -(-Color.rgb(0, 0, 0));
                                            int i2013 = (i2012 ^ 16818003) + ((i2012 & 16818003) << 1);
                                            objArr2 = new Object[1];
                                            e(new char[]{25359, 64589, 23994, 48877, 7762, 32647, 55528, 14336, 39300, 64251, 23084, 48064, 5372, 29735, 54682, 14021, 38435, 63385, 20615}, i2013, objArr2);
                                            if (!str2.startsWith((String) objArr2[0])) {
                                                int i2014 = 213 - (~(-View.resolveSize(0, 0)));
                                                int i2015 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                int i2016 = (i2015 & 20) + (i2015 | 20);
                                                int i2017 = -TextUtils.lastIndexOf("", '0');
                                                objArr3 = new Object[1];
                                                a(true, i2014, i2016, (i2017 ^ 9) + ((i2017 & 9) << 1), new char[]{15, 3, 65498, 5, 7, 1, 11, 3, 1, 16, 65486, 4, '\t', 15, 18, 4, 14, 1, 65486, '\r'}, objArr3);
                                                if (str2.startsWith((String) objArr3[0])) {
                                                    int iRed2 = Color.red(0);
                                                    int iB12 = SearchView9.b();
                                                    int i2018 = (iRed2 * 303) - 6690929;
                                                    int i2110 = (~iRed2) | (~iB12);
                                                    int i2111 = ~((i2110 & 22229) | (i2110 ^ 22229));
                                                    int i2112 = iRed2 | 22229;
                                                    int i2113 = ~((i2112 & iB12) | (i2112 ^ iB12));
                                                    int i2114 = ((i2111 & i2113) | (i2111 ^ i2113)) * (-302);
                                                    int i2115 = (i2018 ^ i2114) + ((i2018 & i2114) << 1);
                                                    int i2116 = ~iRed2;
                                                    int i2117 = (i2116 & 22229) | (i2116 ^ 22229);
                                                    int i2118 = -(-((~((i2117 & iB12) | (i2117 ^ iB12))) * (-604)));
                                                    int i2119 = ~((iRed2 & (-22230)) | ((-22230) ^ iRed2));
                                                    int i2217 = ~((iB12 & 22229) | (iB12 ^ 22229));
                                                    int i2218 = (((i2115 | i2118) << 1) - (i2118 ^ i2115)) + (((i2119 & i2217) | (i2119 ^ i2217)) * 302);
                                                    objArr4 = new Object[1];
                                                    e(new char[]{25359, 13771, 52918, 26475, 14410, 53553, 27620, 15510}, i2218, objArr4);
                                                    if (str2.startsWith((String) objArr4[0])) {
                                                        Object[] objArr413 = new Object[1];
                                                        e(new char[]{25413}, 18839 - KeyEvent.getDeadChar(0, 0), objArr413);
                                                        Split = str2.split((String) objArr413[0]);
                                                        if (Split.length > 1) {
                                                            continue;
                                                        }
                                                    } else {
                                                        continue;
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                            int i2219 = (i17 ^ (-69)) + ((i17 & (-69)) << 1);
                                            i17 = (i2219 & 70) + (i2219 | 70);
                                        } else {
                                            i37 = i;
                                        }
                                        int i254 = ((i16 | (-81)) << 1) - (i16 ^ (-81));
                                        i16 = (i254 & 82) + (i254 | 82);
                                        i22 = i37;
                                        i37 = i37;
                                        i12 = i12;
                                        r5 = r311;
                                        length = r310 == true ? 1 : 0;
                                        obj5 = obj4;
                                        i15 = 0;
                                        r311 = r311;
                                        r310 = r310;
                                    }
                                }
                            } else {
                                iLastIndexOf = iLastIndexOf;
                                i12 = i12;
                                r311 = r5;
                                obj4 = obj5;
                                i37 = i37;
                                r310 = length;
                                i16 = i16;
                                i37 = i22;
                            }
                            iLastIndexOf = iLastIndexOf;
                            int i255 = ((i16 | (-81)) << 1) - (i16 ^ (-81));
                            i16 = (i255 & 82) + (i255 | 82);
                            i22 = i37;
                            i37 = i37;
                            i12 = i12;
                            r5 = r311;
                            length = r310 == true ? 1 : 0;
                            obj5 = obj4;
                            i15 = 0;
                            r311 = r311;
                            r310 = r310;
                        }
                        obj = obj5;
                        i7 = i37;
                        i4 = i22;
                    }
                } else {
                    obj = objInvoke;
                    i6 = i33;
                    i7 = i37;
                    i4 = i22;
                    iLastIndexOf = i4;
                }
                byte b30 = (byte) ($$b - 5);
                byte[] bArr11 = $$a;
                byte b31 = bArr11[28];
                Object[] objArr50 = new Object[1];
                c(b30, b31, (byte) (b31 | 62), objArr50);
                Class<?> cls18 = Class.forName((String) objArr50[0]);
                byte b32 = bArr11[58];
                byte b33 = bArr11[13];
                Object[] objArr51 = new Object[1];
                c(b32, b33, (byte) (b33 | 28), objArr51);
                ?? r4 = {cls18.getField((String) objArr51[0]).get(obj)};
                ?? r1 = new Object[]{new int[1], r4}[0];
                ((int[]) r1)[0] = iLastIndexOf;
                i5 = ((int[]) r1)[0];
                String[] strArr2 = (String[]) r4;
                if ((i2 & 1) == 0) {
                    int i256 = -(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                    int i257 = ((i256 | 224) << 1) - (i256 ^ 224);
                    int i258 = -Color.alpha(0);
                    int i259 = ((i258 | 13) << 1) - (i258 ^ 13);
                    int i260 = -(-(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                    Object[] objArr52 = new Object[1];
                    a(false, i257, i259, (i260 ^ 10) + ((i260 & 10) << 1), new char[]{'\r', 0, 65530, 65532, 65526, 7, 6, 3, 0, 65530, 16, 65531, 65532}, objArr52);
                    try {
                        Object[] objArr53 = {(String) objArr52[0]};
                        int i261 = -View.combineMeasuredStates(0, 0);
                        int i262 = (i261 & 219) + (i261 | 219);
                        int i263 = -ImageFormat.getBitsPerPixel(0);
                        int i264 = ~(i263 | 22);
                        int i265 = ~(i263 | i4);
                        int i266 = (i264 & i265) | (i264 ^ i265);
                        int i267 = ~((i4 ^ 22) | (i4 & 22));
                        int i268 = ((i263 * (-743)) - 16346) + (((i266 & i267) | (i266 ^ i267)) * (-744));
                        int i269 = ~i263;
                        int i270 = ~((i269 & (-23)) | (i269 ^ (-23)));
                        int i271 = ((i6 & i270) | (i6 ^ i270)) * 744;
                        int i272 = (i268 & i271) + (i268 | i271);
                        int i273 = (i263 & 22) | (i263 ^ 22);
                        int i274 = -(-(((i273 & i4) | (i273 ^ i4)) * 744));
                        int i275 = (i272 ^ i274) + ((i274 & i272) << 1);
                        int i276 = -(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                        Object[] objArr54 = new Object[1];
                        a(false, i262, i275, (i276 ^ 20) + ((i276 & 20) << 1), new char[]{'\r', '\n', 4, 65535, 65481, 65534, '\n', '\t', 15, 0, '\t', 15, 65481, 65502, '\n', '\t', 15, 0, 19, 15, 65532, '\t', 65535}, objArr54);
                        Class<?> cls19 = Class.forName((String) objArr54[0]);
                        int i277 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int i278 = (i277 ^ 26713) + ((i277 & 26713) << 1);
                        Object[] objArr55 = new Object[1];
                        e(new char[]{25368, 2883, 46009, 23079, 49762, 27313, 4381, 47477, 8666, 51213, 28768, 6366, 34597, 12179, 55234, 32301}, i278, objArr55);
                        Object objInvoke2 = cls19.getMethod((String) objArr55[0], String.class).invoke(context, objArr53);
                        if (objInvoke2 == null) {
                            i8 = i5;
                            strArr2 = strArr2;
                            i9 = i4;
                            break;
                        }
                        int i279 = 215 - (~(-(ViewConfiguration.getScrollBarSize() >> 8)));
                        int keyRepeatTimeout = 37 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        int i280 = -Color.green(0);
                        int iB13 = SearchView9.b();
                        int i281 = (i280 * 193) + 4825;
                        int i282 = ~iB13;
                        int i283 = ~i280;
                        int i284 = ~((i283 ^ 25) | (i283 & 25));
                        int i285 = ((i282 & i284) | (i282 ^ i284)) * (-192);
                        int i286 = (i281 & i285) + (i281 | i285);
                        int i287 = ~((i283 ^ (-26)) | (i283 & (-26)));
                        int i288 = ~iB13;
                        int i289 = ~(((-26) ^ i288) | ((-26) & i288));
                        int i290 = i286 + (((i287 ^ i289) | (i287 & i289)) * (-384));
                        int i291 = (i283 ^ (-26)) | (i283 & (-26));
                        int i292 = ~((i291 & iB13) | (i291 ^ iB13));
                        int i293 = (i288 & (-26)) | ((-26) ^ i288);
                        int i294 = ~((i293 & i280) | (i293 ^ i280));
                        int i295 = (i292 & i294) | (i292 ^ i294);
                        int i296 = ~((i280 & 25) | (i280 ^ 25) | iB13);
                        Object[] objArr56 = new Object[1];
                        a(false, i279, keyRepeatTimeout, i290 + (((i296 & i295) | (i295 ^ i296)) * DerHeader.TAG_CLASS_PRIVATE), new char[]{65535, 2, 11, 7, '\f', 65484, 65506, 3, 20, 7, 1, 3, 65518, '\r', '\n', 7, 1, 23, 65515, 65535, '\f', 65535, 5, 3, 16, 65535, '\f', 2, 16, '\r', 7, 2, 65484, 65535, 14, 14, 65484}, objArr56);
                        Class<?> cls20 = Class.forName((String) objArr56[0]);
                        int i297 = -(-(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                        int i298 = (i297 & 219) + (i297 | 219);
                        int i299 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int i300 = ((i299 | 15) << 1) - (i299 ^ 15);
                        int i301 = -(-TextUtils.indexOf("", "", 0));
                        Object[] objArr57 = new Object[1];
                        a(true, i298, i300, (i301 & 13) + (i301 | 13), new char[]{4, '\b', 65535, 65500, 0, 17, 4, 15, 65534, 65500, 15, 0, 2, 14, '\t'}, objArr57);
                        List list = (List) cls20.getMethod((String) objArr57[0], null).invoke(objInvoke2, null);
                        if (list == null) {
                            i8 = i5;
                            strArr2 = strArr2;
                            i9 = i4;
                            break;
                        }
                        Iterator it = list.iterator();
                        loop5: while (true) {
                            if (!it.hasNext()) {
                                i8 = i5;
                                strArr2 = strArr2;
                                i9 = i4;
                                break;
                            }
                            Object next = it.next();
                            int i302 = -(-Color.rgb(0, 0, 0));
                            int i303 = ((i302 | 16841495) << 1) - (i302 ^ 16841495);
                            Object[] objArr58 = new Object[1];
                            e(new char[]{25374, 38918, 38197, 37448, 36684, 33893, 33169, 48880, 48036, 45279, 44535, 43766, 42510, 41786, 55369, 54536, 53836, 53143, 50316, 49594, 65244, 64498, 61664, 60416, 59683, 58894, 58184, 6271, 5534}, i303, objArr58);
                            Class<?> cls21 = Class.forName((String) objArr58[0]);
                            int i304 = 216 - (~(-(-(ViewConfiguration.getMinimumFlingVelocity() >> 16))));
                            int i305 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            int i306 = i305 * 471;
                            int i307 = (i306 & 6123) + (i306 | 6123);
                            int i308 = -(-(((i305 ^ 13) | (i305 & 13)) * (-470)));
                            int i309 = (i307 ^ i308) + ((i308 & i307) << 1);
                            int i310 = ~i305;
                            int i311 = ~((i310 & (-14)) | (i310 ^ (-14)));
                            int i312 = ~(((-14) ^ i4) | ((-14) & i4));
                            int i313 = (i311 ^ i312) | (i311 & i312);
                            int i314 = (i7 ^ i305) | (i7 & i305);
                            int i315 = ~((i314 ^ 13) | (i314 & 13));
                            int i316 = ((i313 ^ i315) | (i313 & i315)) * (-470);
                            int i317 = (i309 & i316) + (i316 | i309);
                            int i318 = ((-14) ^ i305) | ((-14) & i305);
                            int i319 = ~((i318 & i4) | (i318 ^ i4));
                            int i320 = i6 | i305;
                            int i321 = ~((i320 & 13) | (i320 ^ 13));
                            int i322 = -(-(((i321 & i319) | (i319 ^ i321)) * 470));
                            int i323 = (i322 | i317) + (i317 & i322);
                            int i324 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            int i325 = ~i324;
                            int i326 = (((i324 * 934) - 5592) - (~(-(-(((~((i325 & i6) | (i325 ^ i6))) | (-7)) * (-933)))))) - 1;
                            int i327 = ~(((-7) ^ i7) | ((-7) & i7));
                            int i328 = ~((-7) | i324);
                            Object[] objArr59 = new Object[1];
                            a(false, i304, i323, ((~((i324 & 6) | (i324 ^ 6))) * 933) + i326 + (((i327 ^ i328) | (i327 & i328)) * 933), new char[]{2, 65515, 65534, '\n', 2, 4, 2, 17, 65517, 65534, 0, '\b', 65534, 4}, objArr59);
                            String str12 = (String) cls21.getMethod((String) objArr59[0], null).invoke(next, null);
                            int i329 = -TextUtils.lastIndexOf("", '0', 0, 0);
                            int i330 = -ImageFormat.getBitsPerPixel(0);
                            int i331 = i330 * 477;
                            int i332 = (i331 ^ (-17100)) + ((i331 & (-17100)) << 1);
                            int i333 = ~i330;
                            int i334 = ((-37) & i330) | ((-37) ^ i330);
                            int i335 = (i332 - (~(-(-(((~((i333 & 36) | (i333 ^ 36))) | (~((i334 & i4) | (i334 ^ i4)))) * (-476)))))) - 1;
                            int i336 = ((-37) & i330) | ((-37) ^ i330);
                            int i337 = (i335 - (~(-(-((~((i336 & i4) | (i336 ^ i4))) * 952))))) - 1;
                            int i338 = ((-37) & i6) | ((-37) ^ i6);
                            Object[] objArr60 = new Object[1];
                            a(false, (i329 | 215) + (i329 & 215), (i337 - (~(-(-((~((i330 & i338) | (i338 ^ i330))) * 476))))) - 1, TextUtils.lastIndexOf("", '0', 0, 0) + 26, new char[]{65535, 2, 11, 7, '\f', 65484, 65506, 3, 20, 7, 1, 3, 65518, '\r', '\n', 7, 1, 23, 65515, 65535, '\f', 65535, 5, 3, 16, 65535, '\f', 2, 16, '\r', 7, 2, 65484, 65535, 14, 14, 65484}, objArr60);
                            Class<?> cls22 = Class.forName((String) objArr60[0]);
                            int i339 = -(-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                            int i340 = ((i339 | 49810) << 1) - (i339 ^ 49810);
                            Object[] objArr61 = new Object[1];
                            e(new char[]{25366, 41375, 58889, 9396, 26972, 44998, 60516, 12566, 30594, 46107, 64182, 16192, 32254, 33402, 50996, 1426, 19007}, i340, objArr61);
                            if (((Boolean) cls22.getMethod((String) objArr61[0], String.class).invoke(objInvoke2, str12)).booleanValue()) {
                                int length6 = str12.length();
                                int i341 = -(-(length6 * (-496)));
                                int i342 = (9920 & i341) + (i341 | 9920);
                                int i343 = ~length6;
                                int i344 = -(-((~((19 ^ i343) | (19 & i343))) * 497));
                                int i345 = ((i342 | i344) << 1) - (i342 ^ i344);
                                int i346 = (19 ^ i343) | (19 & i343);
                                int i347 = ~((i346 & i4) | (i346 ^ i4));
                                int i348 = ~length6;
                                int i349 = ~((i348 & i6) | (i348 ^ i6) | (-20));
                                int i350 = (i345 - (~(((i347 & i349) | (i347 ^ i349)) * 497))) - 1;
                                int i351 = (~((length6 & 19) | (19 ^ length6))) | (~((19 & i7) | (19 ^ i7)));
                                int i352 = ~((i343 & (-20)) | (i343 ^ (-20)) | i4);
                                int i353 = -(-(((i351 & i352) | (i351 ^ i352)) * 497));
                                int i354 = (i350 ^ i353) + ((i353 & i350) << 1);
                                if (i354 >= 0) {
                                    int i355 = 0;
                                    while (i355 <= i354) {
                                        Object[] objArr62 = {str12.substring(i355, i355 + 20), 931995};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1557991223);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                            char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                                            int iMyTid3 = 3393 - (Process.myTid() >> 22);
                                            int i356 = 10 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                            byte b34 = $$d[7];
                                            Object[] objArr63 = new Object[1];
                                            d((byte) 14, b34, b34, objArr63);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(packedPositionGroup, iMyTid3, i356, 1203525406, false, (String) objArr63[0], new Class[]{String.class, Integer.TYPE});
                                        }
                                        long jLongValue4 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr62)).longValue();
                                        long j22 = 958169633;
                                        Object obj6 = objInvoke2;
                                        Iterator it2 = it;
                                        int i357 = i354;
                                        long jFreeMemory = (int) Runtime.getRuntime().freeMemory();
                                        i8 = i5;
                                        long j23 = -1;
                                        long j24 = jFreeMemory ^ j23;
                                        long j25 = 521;
                                        long j26 = j22 ^ j23;
                                        long j27 = (((long) 522) * j22) + (((long) (-520)) * jLongValue4) + (((long) (-1042)) * (j22 | ((j24 | jLongValue4) ^ j23))) + ((jLongValue4 | jFreeMemory) * j25) + (j25 * ((j23 ^ (jLongValue4 | (j24 | j22))) | ((j26 | (jLongValue4 ^ j23)) ^ j23) | ((j26 | jFreeMemory) ^ j23))) + ((long) (-960239510));
                                        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                                        int i358 = 1420871114 + (((~(2027623771 | iMaxMemory)) | (-590397361)) * 672);
                                        int i359 = ~iMaxMemory;
                                        if (((((int) (j27 >> 32)) & (i358 + (((~(iMaxMemory | (-590397361))) | (~((-2027623772) | i359))) * (-672)) + (((~(590397360 | i359)) | (-2080096252)) * 672))) | (((int) j27) & ((-373695878) + ((~(i6 | (-1208000849))) * 433) + (((~(1322449786 | i4)) | 114776623) * (-433)) + (((~(114776623 | i4)) | 114448938) * 433)))) == 1245577864) {
                                            i9 = (~(i4 & 70)) & (i4 | 70);
                                            break loop5;
                                        }
                                        i355 = (i355 & 1) + (i355 | 1);
                                        objInvoke2 = obj6;
                                        it = it2;
                                        strArr2 = strArr2;
                                        i354 = i357;
                                        i5 = i8;
                                    }
                                } else {
                                    continue;
                                }
                            }
                            objInvoke2 = objInvoke2;
                            it = it;
                            strArr2 = strArr2;
                            i5 = i5;
                        }
                        int i360 = i8;
                        int i361 = ((~i360) & i4) | (i360 & i6);
                        int i362 = (i361 | (-i361)) >> 31;
                        int i363 = i9 & (~i362);
                        int i364 = i360 & i362;
                        i5 = (i363 & i364) | (i363 ^ i364);
                    } catch (Throwable th28) {
                        Throwable cause9 = th28.getCause();
                        if (cause9 != null) {
                            throw cause9;
                        }
                        throw th28;
                    }
                } else {
                    strArr2 = strArr2;
                }
                strArr = strArr2;
            } catch (Throwable th29) {
                Throwable cause10 = th29.getCause();
                if (cause10 != null) {
                    throw cause10;
                }
                throw th29;
            }
        } else {
            i4 = i22;
            i5 = i4;
            strArr = null;
        }
        int i365 = -(Process.myTid() >> 22);
        int i366 = (i365 ^ 214) + ((i365 & 214) << 1);
        int i367 = -MotionEvent.axisFromString("");
        Object[] objArr64 = new Object[1];
        a(false, i366, ((i367 | 11) << 1) - (i367 ^ 11), (ViewConfiguration.getTouchSlop() >> 8) + 4, new char[]{65513, 14, 6, 15, 65487, 7, 21, 5, 19, 20, 65519, 65523}, objArr64);
        Object[] objArr65 = {(String) objArr64[0]};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
            char absoluteGravity5 = (char) Gravity.getAbsoluteGravity(0, 0);
            int i368 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 993;
            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 9;
            byte[] bArr12 = $$d;
            byte b35 = (byte) (-bArr12[15]);
            byte b36 = bArr12[7];
            Object[] objArr66 = new Object[1];
            d(b35, (byte) (b36 - 1), b36, objArr66);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(absoluteGravity5, i368, modifierMetaStateMask, -545305915, false, (String) objArr66[0], new Class[]{String.class});
        }
        long jLongValue5 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).invoke(null, objArr65)).longValue();
        long j28 = 117851886;
        long j29 = -272;
        String[] strArr3 = strArr;
        long j30 = -1;
        long j31 = j28 ^ j30;
        long jMaxMemory = (int) Runtime.getRuntime().maxMemory();
        long j32 = (((long) 273) * j28) + (((long) (-271)) * jLongValue5) + (((((j31 | (jLongValue5 ^ j30)) | (jMaxMemory ^ j30)) ^ j30) | (((j28 | jLongValue5) | jMaxMemory) ^ j30)) * j29) + (j29 * (((j31 | jLongValue5) ^ j30) | ((j31 | jMaxMemory) ^ j30))) + (((long) 272) * (jLongValue5 | ((jMaxMemory | j28) ^ j30))) + ((long) 502607398);
        int i369 = ~(2132617119 | i4);
        int i370 = ~i4;
        int i371 = ((int) (j32 >> 32)) & (1097502101 + (((-2139092992) | i369) * (-814)) + ((i369 | (~(695390708 | i370)) | 688914836) * 407) + (((~((-2132617120) | i4)) | 688914836 | (~((-695390709) | i4))) * 407));
        int i372 = (int) Runtime.getRuntime().totalMemory();
        int i373 = ~((-568113051) | i372);
        int i374 = ~i372;
        int i375 = ((int) j32) & ((-292559873) + ((i373 | (~((-1443039301) | i374))) * (-406)) + ((~((-562300161) | i374)) * (-406)) + (((~(i372 | 2005339460)) | (~(568113050 | i374))) * 406));
        int i376 = (i371 & i375) | (i371 ^ i375);
        int i377 = -i376;
        int i378 = ((i376 & i377) | (i376 ^ i377)) >> 31;
        int i379 = (~i378) & i4;
        int i380 = i378 & (i4 ^ 50);
        int i381 = (i380 & i379) | (i379 ^ i380);
        int i382 = (~(i4 & i5)) & (i4 | i5);
        int i383 = -i382;
        int i384 = ((i382 & i383) | (i382 ^ i383)) >> 31;
        int i385 = (i5 & i384) | (i381 & (~i384));
        int i386 = -TextUtils.indexOf((CharSequence) "", '0');
        int iB14 = SearchView9.b();
        int i387 = i386 * 758;
        int i388 = ~iB14;
        int i389 = (i387 ^ (-48819456)) + ((i387 & (-48819456)) << 1) + (((i386 ^ i388) | (i386 & i388)) * (-757));
        int i390 = ((-64577) ^ i386) | ((-64577) & i386);
        int i391 = -(-((~((i390 & iB14) | (i390 ^ iB14))) * 1514));
        int i392 = (i389 ^ i391) + ((i389 & i391) << 1);
        int i393 = ~i386;
        int i394 = ~((i393 & (-64577)) | (i393 ^ (-64577)));
        int i395 = ~(i388 | (-64577));
        int i396 = (i386 & 64576) | (i386 ^ 64576);
        int i397 = ((~((i396 & iB14) | (i396 ^ iB14))) | (i395 & i394) | (i394 ^ i395)) * 757;
        int i398 = (i392 ^ i397) + ((i397 & i392) << 1);
        Object[] objArr67 = new Object[1];
        e(new char[]{25424, 40781, 39812, 38863, 37391, 36447, 35476, 34455, 33025, 48454, 47517, 46555, 45085, 44119, 43182, 42179, 42783, 41807, 57230, 56265}, i398, objArr67);
        Object[] objArr68 = {(String) objArr67[0]};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1004662034);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
            char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
            int touchSlop2 = 993 - (ViewConfiguration.getTouchSlop() >> 8);
            int touchSlop3 = 8 - (ViewConfiguration.getTouchSlop() >> 8);
            byte[] bArr13 = $$d;
            byte b37 = (byte) (-bArr13[15]);
            byte b38 = bArr13[7];
            Object[] objArr69 = new Object[1];
            d(b37, (byte) (b38 - 1), b38, objArr69);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(offsetAfter, touchSlop2, touchSlop3, -545305915, false, (String) objArr69[0], new Class[]{String.class});
        }
        long jLongValue6 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).invoke(null, objArr68)).longValue();
        long j33 = -1386702171;
        long j34 = -751;
        long j35 = j33 ^ j30;
        long j36 = jLongValue6 ^ j30;
        long j37 = i4;
        long j38 = (j34 * j33) + (j34 * jLongValue6) + (((long) 1504) * (((j35 | j36) ^ j30) | ((j35 | j37) ^ j30)));
        long j39 = jLongValue6 | j35;
        long j40 = j38 + (((long) (-1504)) * ((j39 | j37) ^ j30)) + (((long) 752) * ((j39 ^ j30) | ((j36 | j33) ^ j30))) + ((long) 2007161455);
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i399 = ~elapsedCpuTime;
        int i400 = ((int) (j40 >> 32)) & (1814561741 + (((~(2012570956 | i399)) | (~((-1141899269) | elapsedCpuTime)) | (~((-25501761) | elapsedCpuTime))) * 765) + (((-2012570957) | (~(870671688 | i399))) * 1530) + (((~(elapsedCpuTime | 870671688)) | (~(i399 | (-25501761)))) * 765));
        int i401 = ((int) j40) & (1771465493 + (((~(254715150 | i4)) | (-1333769632)) * 576) + (((~((-1079054482) | i370)) | 151258372) * 576) + 547837952);
        int i402 = (i400 & i401) | (i400 ^ i401);
        int i403 = -i402;
        int i404 = ((i402 & i403) | (i402 ^ i403)) >> 31;
        int i405 = (~i404) & i4;
        int i406 = i404 & ((i4 & (-61)) | (i370 & 60));
        int i407 = (i406 & i405) | (i405 ^ i406);
        int i408 = (~(i4 & i385)) & (i4 | i385);
        int i409 = -i408;
        int i410 = ((i408 & i409) | (i408 ^ i409)) >> 31;
        int i411 = i407 & (~i410);
        int i412 = i385 & i410;
        int i413 = (i412 & i411) | (i411 ^ i412);
        Object[] objArr70 = new Object[1];
        e(new char[]{25424, 4904, 33656, 13202, 41938, 21423, 49705, 29307, 58003, 37589, 686, 45357, 8564, 53637, 16795, 61925, 24621, 4211, 32913, 12440, 41186, 22334, 51065, 30616, 59352, 38893, 1589, 46641, 9885, 55006, 18166, 62733, 25979, 5517, 34253, 13799}, 28722 - (~(-KeyEvent.normalizeMetaState(0))), objArr70);
        Object[] objArr71 = {(String) objArr70[0]};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
            char deadChar = (char) KeyEvent.getDeadChar(0, 0);
            int i414 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 993;
            int pressedStateDuration3 = 8 - (ViewConfiguration.getPressedStateDuration() >> 16);
            byte b39 = $$d[7];
            Object[] objArr72 = new Object[1];
            d((byte) 13, (byte) (b39 - 1), b39, objArr72);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(deadChar, i414, pressedStateDuration3, 349342683, false, (String) objArr72[0], new Class[]{String.class});
        }
        long jLongValue7 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).invoke(null, objArr71)).longValue();
        long j41 = 140858378;
        long j42 = -301;
        long j43 = (((long) (-300)) * j41) + (((long) 302) * jLongValue7) + ((((j41 | jLongValue7) | j37) ^ j30) * j42);
        long j44 = jLongValue7 ^ j30;
        long j45 = j43 + (j42 * (((j44 | j37) ^ j30) | (((j37 ^ j30) | j41) ^ j30))) + (((long) 301) * (j44 | ((j37 | (j41 ^ j30)) ^ j30))) + ((long) (-987936983));
        int i415 = ~(1197583202 | i370);
        int i416 = ((int) (j45 >> 32)) & ((-2011216550) + ((134742024 | i415) * (-712)) + (((~((-134742025) | i370)) | (~(1332325226 | i4))) * (-712)) + ((i415 | (-239643209)) * 712));
        int i417 = ((int) j45) & (1649195747 + (((~(1502648053 | i4)) | (-1542903808) | (~(65421643 | i4))) * (-754)) + (((~(1542903807 | i4)) | (~((-1477482165) | i370))) * (-754)) + ((1502648053 | i370) * 754));
        int i418 = (i416 & i417) | (i416 ^ i417);
        int i419 = (~(i4 & 80)) & (i4 | 80);
        int i420 = -i418;
        int i421 = ((i418 & i420) | (i418 ^ i420)) >> 31;
        int i422 = (~i421) & i4;
        int i423 = i421 & i419;
        int i424 = (i423 & i422) | (i422 ^ i423);
        int i425 = i4 ^ i413;
        int i426 = -i425;
        int i427 = ((i425 & i426) | (i425 ^ i426)) >> 31;
        int i428 = i424 & (~i427);
        int i429 = i413 & i427;
        int i430 = (i429 & i428) | (i428 ^ i429);
        Object[] objArr73 = new Object[1];
        e(new char[]{25424, 14302, 51860, 40260, 12298, 50313, 40837, 12925, 50467, 39411, 11490, 51051, 39468, 11539, 49559, 38039, 12099, 49669, 38603, 10629, 64565, 38711, 11263, 65192, 37237, 9261, 65300, 37852, 9949, 63818, 35868, 8389, 64435, 36404, 8486, 62944, 34986, 9061, 63012, 35155, 24001, 61599}, 21701 - (Process.myPid() >> 22), objArr73);
        Object[] objArr74 = {(String) objArr73[0]};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
            char defaultSize = (char) View.getDefaultSize(0, 0);
            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 993;
            int maximumFlingVelocity = 8 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            byte b40 = $$d[7];
            Object[] objArr75 = new Object[1];
            d((byte) 13, (byte) (b40 - 1), b40, objArr75);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(defaultSize, minimumFlingVelocity, maximumFlingVelocity, 349342683, false, (String) objArr75[0], new Class[]{String.class});
        }
        long jLongValue8 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr74)).longValue();
        long j46 = -572372972;
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        long j47 = TypedValues.PositionType.TYPE_PERCENT_WIDTH;
        long j48 = (j47 * j46) + (j47 * jLongValue8);
        long j49 = -502;
        long j50 = j46 | jLongValue8;
        long j51 = j46 ^ j30;
        long j52 = (j51 | (jLongValue8 ^ j30)) ^ j30;
        long j53 = iUptimeMillis;
        long j54 = j51 | (j53 ^ j30);
        long j55 = (j50 | j53) ^ j30;
        long j56 = j48 + (j49 * j50) + (j49 * (j52 | (j54 ^ j30) | j55)) + (((long) TypedValues.PositionType.TYPE_DRAWPATH) * (((jLongValue8 | j54) ^ j30) | j55)) + ((long) (-274705633));
        int i431 = ((int) (j56 >> 32)) & (219458176 + (((~((-202723181) | i370)) | 1377540) * (-108)) + (((~((-1639949592) | i)) | (-1841295232) | (~(1639949591 | i370))) * 54) + ((i | (-1841295232)) * 54));
        int i432 = ((int) j56) & ((-335929985) + (((~((-550166467) | i370)) | (~((-1987392877) | i))) * 333) + (((~(i370 | (-1987392877))) | (~((-550166467) | i))) * 333));
        int i433 = (i431 & i432) | (i431 ^ i432);
        int i434 = -i433;
        int i435 = ((i433 & i434) | (i433 ^ i434)) >> 31;
        int i436 = (i435 & (~(i & 90)) & (i | 90)) | (i & (~i435));
        int i437 = (~(i & i430)) & (i | i430);
        int i438 = (i437 | (-i437)) >> 31;
        int i439 = i436 & (~i438);
        int i440 = i430 & i438;
        int i441 = (i440 & i439) | (i439 ^ i440);
        int mode = 212 - View.MeasureSpec.getMode(0);
        int packedPositionGroup2 = 18 - ExpandableListView.getPackedPositionGroup(0L);
        int i442 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
        Object[] objArr76 = new Object[1];
        a(true, mode, packedPositionGroup2, ((i442 | 8) << 1) - (i442 ^ 8), new char[]{11, 16, 11, 65489, 5, 22, 7, 65489, '\n', 21, 65488, 16, 3, 22, 11, 22, 65488, 22}, objArr76);
        Object[] objArr77 = {(String) objArr76[0]};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-263443444);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
            char size = (char) View.MeasureSpec.getSize(0);
            int packedPositionGroup3 = 993 - ExpandableListView.getPackedPositionGroup(0L);
            int deadChar2 = 8 - KeyEvent.getDeadChar(0, 0);
            byte b41 = $$d[7];
            Object[] objArr78 = new Object[1];
            d((byte) 13, (byte) (b41 - 1), b41, objArr78);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(size, packedPositionGroup3, deadChar2, 349342683, false, (String) objArr78[0], new Class[]{String.class});
        }
        long jLongValue9 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).invoke(null, objArr77)).longValue();
        long j57 = 774526438;
        long j58 = (int) Runtime.getRuntime().totalMemory();
        long j59 = j58 ^ j30;
        long j60 = jLongValue9 ^ j30;
        long j61 = (((long) 758) * j57) + (((long) (-756)) * jLongValue9) + (((long) (-757)) * (j57 | j59)) + (((long) 1514) * (((j60 | j57) | j58) ^ j30)) + (((long) 757) * ((((jLongValue9 | j57) | j58) ^ j30) | (((j57 ^ j30) | j60) ^ j30) | ((j60 | j59) ^ j30))) + ((long) (-1621605043));
        int i443 = ((int) (j61 >> 32)) & (((((~((-1289576707) | i)) | 1141965058) * (-283)) - 1804176672) + ((~((-147611649) | i)) * 283));
        int iMyUid = Process.myUid();
        int i444 = ~iMyUid;
        int i445 = ((int) j61) & (1378558644 + (((~(i444 | (-1586903913))) | 149677502) * (-1042)) + (((-1586903913) | iMyUid) * 521) + (((~(iMyUid | (-149677503))) | 6931606 | (~(i444 | (-1444158017)))) * 521));
        int i446 = (i443 & i445) | (i443 ^ i445);
        int i447 = (~(i & 100)) & (i | 100);
        int i448 = -i446;
        int i449 = ((i446 & i448) | (i446 ^ i448)) >> 31;
        int i450 = i & (~i449);
        int i451 = i449 & i447;
        int i452 = (~(i & i441)) & (i | i441);
        int i453 = (i452 | (-i452)) >> 31;
        int i454 = (i441 & i453) | (((i451 & i450) | (i450 ^ i451)) & (~i453));
        Object[] objArr79 = {new int[]{i}, strArr3, new int[1], new int[]{i454}};
        int i455 = (~(i & i454)) & (i | i454);
        int i456 = -i455;
        int i457 = (((i455 & i456) | (i455 ^ i456)) >> 31) & 16;
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        int i458 = ~startUptimeMillis;
        int i459 = ((((~(1073154023 | i458)) | (~((-63964577) | startUptimeMillis))) * 988) - 1756822829) + (((~(startUptimeMillis | 200476131)) | 872677892 | (~(i458 | (-63964577)))) * 988);
        int i460 = ((i459 | i457) << 1) - (i457 ^ i459);
        int i461 = (i3 ^ i460) + ((i3 & i460) << 1);
        int i462 = i461 << 13;
        int i463 = (i462 | i461) & (~(i461 & i462));
        int i464 = i463 >>> 17;
        int i465 = (i463 | i464) & (~(i463 & i464));
        ((int[]) objArr79[2])[0] = i465 ^ (i465 << 5);
        return objArr79;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r6, short r7, short r8) {
        /*
            byte[] r0 = defpackage.getCloseFuture.$$c
            int r7 = r7 * 2
            int r1 = r7 + 1
            int r8 = r8 + 4
            int r6 = r6 + 119
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r7
            r6 = r8
            r3 = r2
            goto L28
        L13:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L17:
            byte r4 = (byte) r8
            int r6 = r6 + 1
            r1[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r4 = r0[r6]
            int r3 = r3 + 1
        L28:
            int r4 = -r4
            int r8 = r8 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getCloseFuture.$$g(byte, short, short):java.lang.String");
    }
}

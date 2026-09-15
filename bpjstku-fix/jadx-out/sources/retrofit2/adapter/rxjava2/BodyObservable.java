package retrofit2.adapter.rxjava2;

import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.VideoRecordEventStart;
import defpackage.deriveMediaType;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.initSession;
import defpackage.setOrVerifyExpectFrameRateRange;
import defpackage.setVideoStabilizationMode;
import io.reactivex.exceptions.CompositeException;
import java.lang.reflect.Method;
import retrofit2.Response;

/* JADX INFO: loaded from: classes5.dex */
public final class BodyObservable<T> extends VideoRecordEventStart<T> {
    private final VideoRecordEventStart<Response<T>> upstream;
    private static final byte[] $$c = {93, -122, -23, -24};
    private static final int $$f = 128;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {5, -91, 77, 46, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55};
    private static final int $$h = 147;
    private static final byte[] $$a = {33, -59, 107, -108, 15, -8, 16, -1, -4, -3, -52, 55, 14, 1, 8, -13, 11, 8, -68, 68, -1, -61, 21, 49, 2, -2, -1, -4, 0, 21, -9, 8, 1, -35, 39, -6, 11, -1, 21, -17, -27, 39, 11, -7, 23, -19, -49, 64, -9, 15, -5, -55, 40, 22, 12, -11, -2, 5, 3, -17, 19, 4, -5, -5, 2, 13, 7, -4, 7};
    private static final int $$b = 12;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    private static int TuitionPaymentFragmentbindingInflater1 = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -83722288;
    private static char[] b = {59765, 59890, 59902, 59894, 59402, 59892, 59402, 59877, 59877, 59894, 59894, 59893, 59890, 59892, 59878, 59872, 59400, 59402, 59727, 59685, 59735, 59727, 59699, 59747, 59753, 59756, 59757, 59759, 59757, 59751, 59770, 59749, 59725, 59725, 59745, 59749, 59768, 59713, 59662, 59774, 59903, 59901, 59903, 59854, 59734, 59870, 59897, 59891, 59895, 59900, 59902, 59896, 59864, 59858, 59889, 59902, 59857, 59856, 59897, 59899, 59897, 59896, 59877, 59903, 59734, 59829, 59830, 59824, 59830, 59821, 59815, 59828, 59670, 59705, 59735, 59755, 59746, 59751, 59768, 59773, 59757, 59752, 59751, 59757, 59757, 59759, 59757, 59748, 59775, 59676, 59724, 59747, 59771, 59716, 59724, 59753, 59747, 59744, 59744, 59717, 59698, 59743, 59750, 59748, 59757, 59759, 59729, 59732, 59750, 59745, 59757, 59749, 59752, 59740, 59756, 59756, 59759, 59757, 59744, 59746, 59756, 59746, 59744, 59771, 59751, 59757, 59852, 59829, 59792, 59828, 59867, 59848, 59845, 59830, 59792, 59845, 59828, 59850, 59846, 59843, 59848, 59745, 59858, 59847, 59847, 59856, 59870, 59865, 59870, 59864, 59854, 59845, 59862, 59871, 59869, 59855, 59848, 59856, 59676, 59714, 59757, 59751, 59771, 59744, 59746, 59756, 59724, 59736, 59768, 59747, 59759, 59713, 59718, 59749, 59746, 59714, 59715, 59745, 59745, 59753, 59714, 59715, 59745, 59745, 59753, 59714, 59715, 59745, 59745, 59753, 59754, 59746, 59751, 59749, 59761, 59897, 59889, 59889, 59859, 59858, 59890, 59893, 59862, 59859, 59900, 59894, 59893, 59890, 59858, 59868, 59900, 59890, 59888, 59403, 59895, 59901, 59858, 59858, 59895, 59888, 59901, 59862, 59883, 59402, 59891, 59897, 59903, 59857, 59881, 59402, 59861, 59858, 59897, 59889, 59889, 59859};

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void g(byte r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 3
            int r6 = 115 - r6
            int r7 = r7 + 4
            byte[] r0 = retrofit2.adapter.rxjava2.BodyObservable.$$a
            int r1 = 34 - r5
            byte[] r1 = new byte[r1]
            int r5 = 33 - r5
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r5
            r3 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r7 = r7 + 1
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            int r3 = r3 + 1
            r4 = r0[r7]
        L28:
            int r6 = r6 + r4
            int r6 = r6 + (-2)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.adapter.rxjava2.BodyObservable.g(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void h(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 52
            int r7 = 56 - r7
            byte[] r0 = retrofit2.adapter.rxjava2.BodyObservable.$$g
            int r6 = r6 * 52
            int r6 = r6 + 1
            int r8 = r8 + 84
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2a
        L15:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L19:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r4 = r0[r8]
        L2a:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-10)
            int r8 = r8 + 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.adapter.rxjava2.BodyObservable.h(int, short, int, java.lang.Object[]):void");
    }

    BodyObservable(VideoRecordEventStart<Response<T>> videoRecordEventStart) {
        this.upstream = videoRecordEventStart;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        int i = 2 % 2;
        this.upstream.subscribe(new BodyObserver(derivemediatype));
        int i2 = TuitionPaymentFragmentbindingInflater1 + 63;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
        int i3 = i2 % 2;
    }

    static class BodyObserver<R> implements deriveMediaType<Response<R>> {
        private final deriveMediaType<? super R> observer;
        private boolean terminated;

        BodyObserver(deriveMediaType<? super R> derivemediatype) {
            this.observer = derivemediatype;
        }

        @Override // defpackage.deriveMediaType
        public void onSubscribe(BufferProviderState bufferProviderState) {
            this.observer.onSubscribe(bufferProviderState);
        }

        @Override // defpackage.deriveMediaType
        public void onNext(Response<R> response) {
            if (response.isSuccessful()) {
                this.observer.onNext(response.body());
                return;
            }
            this.terminated = true;
            HttpException httpException = new HttpException(response);
            try {
                this.observer.onError(httpException);
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new CompositeException(httpException, th));
            }
        }

        @Override // defpackage.deriveMediaType
        public void onComplete() {
            if (this.terminated) {
                return;
            }
            this.observer.onComplete();
        }

        @Override // defpackage.deriveMediaType
        public void onError(Throwable th) {
            if (!this.terminated) {
                this.observer.onError(th);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th);
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(assertionError);
        }
    }

    private static void a(char[] cArr, boolean z, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5 = 2 % 2;
        setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
        char[] cArr2 = new char[i];
        setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        while (true) {
            i4 = 29209604;
            if (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= i) {
                break;
            }
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
            cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i2 + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i6 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), ExpandableListView.getPackedPositionGroup(0L) + 3291, 31 - TextUtils.getOffsetBefore("", 0), 1199271174, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    byte b4 = (byte) (-1);
                    byte b5 = (byte) (-b4);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 651 - ((Process.getThreadPriority(0) + 20) >> 6), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 44, -450685997, false, $$i(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i7 = $10 + 121;
                $11 = i7 % 128;
                int i8 = i7 % 2;
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
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
        }
        if (z) {
            int i9 = $10 + 31;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i) {
                cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                try {
                    Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b6 = (byte) (-1);
                        byte b7 = (byte) (-b6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) View.resolveSize(0, 0), 651 - TextUtils.indexOf("", "", 0), 44 - KeyEvent.normalizeMetaState(0), -450685997, false, $$i(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    i4 = 29209604;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void d(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
        int i3 = iArr[0];
        int i4 = 1;
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = b;
        int i8 = -1;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $11 + 101;
                $10 = i10 % 128;
                int i11 = i10 % i;
                try {
                    Object[] objArr2 = new Object[i4];
                    objArr2[0] = Integer.valueOf(cArr[i9]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) i8;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) KeyEvent.getDeadChar(0, 0), 1269 - MotionEvent.axisFromString(""), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 18, 407021364, false, $$i(b2, (byte) (b2 & 20), (byte) 0), new Class[]{Integer.TYPE});
                    }
                    cArr2[i9] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i9++;
                    cArr = cArr;
                    i = 2;
                    i4 = 1;
                    i8 = -1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i3, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            setvideostabilizationmode.b = 0;
            char c = 0;
            while (setvideostabilizationmode.b < i5) {
                if (bArr[setvideostabilizationmode.b] == 1) {
                    int i12 = $11 + 51;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    int i14 = setvideostabilizationmode.b;
                    Object[] objArr3 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) (-1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 3225 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 13, 2133916302, false, $$i(b3, (byte) (b3 & 21), (byte) 0), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                } else {
                    int i15 = setvideostabilizationmode.b;
                    Object[] objArr4 = {Integer.valueOf(cArr3[setvideostabilizationmode.b]), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        byte b4 = (byte) (-1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (29943 - Process.getGidForName("")), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1755, 'G' - AndroidCharacter.getMirror('0'), 387247676, false, $$i(b4, (byte) (b4 & 19), (byte) 0), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i15] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                }
                c = cArr4[setvideostabilizationmode.b];
                try {
                    Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b5 = (byte) (-1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getTapTimeout() >> 16) + 41241), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1704, 21 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -1434471773, false, $$i(b5, (byte) (b5 & 15), (byte) 0), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i16 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i16, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i16);
        }
        if (z) {
            char[] cArr6 = new char[i5];
            setvideostabilizationmode.b = 0;
            while (setvideostabilizationmode.b < i5) {
                int i17 = $10 + 85;
                $11 = i17 % 128;
                int i18 = i17 % 2;
                cArr6[setvideostabilizationmode.b] = cArr3[(i5 - setvideostabilizationmode.b) - 1];
                setvideostabilizationmode.b++;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            setvideostabilizationmode.b = 0;
            while (setvideostabilizationmode.b < i5) {
                cArr3[setvideostabilizationmode.b] = (char) (cArr3[setvideostabilizationmode.b] - iArr[2]);
                setvideostabilizationmode.b++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 76261. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static java.lang.Object[] TuitionPaymentFragmentbindingInflater1(android.content.Context r43, int r44, int r45, int r46) {
        /*
            Method dump skipped, instruction units count: 7626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.adapter.rxjava2.BodyObservable.TuitionPaymentFragmentbindingInflater1(android.content.Context, int, int, int):java.lang.Object[]");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001f -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x001f
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(int r6, byte r7, short r8) {
        /*
            int r7 = 120 - r7
            byte[] r0 = retrofit2.adapter.rxjava2.BodyObservable.$$c
            int r6 = r6 + 4
            int r8 = r8 * 3
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L1f
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L1f:
            int r6 = r6 + 1
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r6 = r6 + r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.adapter.rxjava2.BodyObservable.$$i(int, byte, short):java.lang.String");
    }
}

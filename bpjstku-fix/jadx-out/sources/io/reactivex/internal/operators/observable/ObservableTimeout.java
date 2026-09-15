package io.reactivex.internal.operators.observable;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.VideoRecordEventStart;
import defpackage.deriveMediaType;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.initSession;
import defpackage.notifySuspended;
import defpackage.onCaptureSessionEnd;
import defpackage.readableMs;
import defpackage.share;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableTimeout<T, U, V> extends notifySuspended<T, T> {
    private AutoValue_VideoValidatedEncoderProfilesProxy<U> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<V>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> b;

    /* JADX INFO: loaded from: classes7.dex */
    interface TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends ObservableTimeoutTimed.TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        void TuitionPaymentFragmentspecialinlinedviewModeldefault3(long j, Throwable th);
    }

    public ObservableTimeout(VideoRecordEventStart<T> videoRecordEventStart, AutoValue_VideoValidatedEncoderProfilesProxy<U> autoValue_VideoValidatedEncoderProfilesProxy, readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<V>> readablems, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy2) {
        super(videoRecordEventStart);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = autoValue_VideoValidatedEncoderProfilesProxy;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = readablems;
        this.b = autoValue_VideoValidatedEncoderProfilesProxy2;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        if (this.b == null) {
            TimeoutObserver timeoutObserver = new TimeoutObserver(derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            derivemediatype.onSubscribe(timeoutObserver);
            AutoValue_VideoValidatedEncoderProfilesProxy<U> autoValue_VideoValidatedEncoderProfilesProxy = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (autoValue_VideoValidatedEncoderProfilesProxy != null) {
                TimeoutConsumer timeoutConsumer = new TimeoutConsumer(0L, timeoutObserver);
                if (DisposableHelper.b((AtomicReference<BufferProviderState>) timeoutObserver.task, timeoutConsumer)) {
                    autoValue_VideoValidatedEncoderProfilesProxy.subscribe(timeoutConsumer);
                }
            }
            this.TuitionPaymentFragmentbindingInflater1.subscribe(timeoutObserver);
            return;
        }
        TimeoutFallbackObserver timeoutFallbackObserver = new TimeoutFallbackObserver(derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.b);
        derivemediatype.onSubscribe(timeoutFallbackObserver);
        AutoValue_VideoValidatedEncoderProfilesProxy<U> autoValue_VideoValidatedEncoderProfilesProxy2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (autoValue_VideoValidatedEncoderProfilesProxy2 != null) {
            TimeoutConsumer timeoutConsumer2 = new TimeoutConsumer(0L, timeoutFallbackObserver);
            if (DisposableHelper.b((AtomicReference<BufferProviderState>) timeoutFallbackObserver.task, timeoutConsumer2)) {
                autoValue_VideoValidatedEncoderProfilesProxy2.subscribe(timeoutConsumer2);
            }
        }
        this.TuitionPaymentFragmentbindingInflater1.subscribe(timeoutFallbackObserver);
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TimeoutObserver<T> extends AtomicLong implements deriveMediaType<T>, BufferProviderState, TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        private static final long serialVersionUID = 3764492702657003550L;
        final deriveMediaType<? super T> downstream;
        final readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<?>> itemTimeoutIndicator;
        final SequentialDisposable task = new SequentialDisposable();
        final AtomicReference<BufferProviderState> upstream = new AtomicReference<>();

        TimeoutObserver(deriveMediaType<? super T> derivemediatype, readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<?>> readablems) {
            this.downstream = derivemediatype;
            this.itemTimeoutIndicator = readablems;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            DisposableHelper.TuitionPaymentFragmentbindingInflater1(this.upstream, bufferProviderState);
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    BufferProviderState bufferProviderState = this.task.get();
                    if (bufferProviderState != null) {
                        bufferProviderState.dispose();
                    }
                    this.downstream.onNext(t);
                    try {
                        AutoValue_VideoValidatedEncoderProfilesProxy autoValue_VideoValidatedEncoderProfilesProxy = (AutoValue_VideoValidatedEncoderProfilesProxy) share.b(this.itemTimeoutIndicator.apply(t), "The itemTimeoutIndicator returned a null ObservableSource.");
                        TimeoutConsumer timeoutConsumer = new TimeoutConsumer(j2, this);
                        if (DisposableHelper.b((AtomicReference<BufferProviderState>) this.task, timeoutConsumer)) {
                            autoValue_VideoValidatedEncoderProfilesProxy.subscribe(timeoutConsumer);
                        }
                    } catch (Throwable th) {
                        dumpMediaCodecListForFormat.b(th);
                        this.upstream.get().dispose();
                        getAndSet(Long.MAX_VALUE);
                        this.downstream.onError(th);
                    }
                }
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onError(th);
            } else {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final void b(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.upstream);
                this.downstream.onError(new TimeoutException());
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeout.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(long j, Throwable th) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.upstream);
                this.downstream.onError(th);
            } else {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            }
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.upstream);
            this.task.dispose();
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return DisposableHelper.TuitionPaymentFragmentbindingInflater1(this.upstream.get());
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TimeoutFallbackObserver<T> extends AtomicReference<BufferProviderState> implements deriveMediaType<T>, BufferProviderState, TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        private static final long serialVersionUID = -7508389464265974549L;
        final deriveMediaType<? super T> downstream;
        AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> fallback;
        final readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<?>> itemTimeoutIndicator;
        private static final byte[] $$c = {6, -86, -9, -124};
        private static final int $$f = 24;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {89, 92, -72, 43, -9, 62, -71, 10, 1, -5, -20, 8, -16, 14, -22, 71, -62, -8, -9, 12, -16, 1, 10, -14, 59, -68, -4, 8, -16, 14, -22, 2, -6, -4, 66, -68, 10, -20, 11, -16, -7, 18, -4, -13, 4, 52, -36, -22, -20, 11, -16, -7, 18, -4, -13, 4, 31, -33, -5, -8, 0, 62, -34, -33, -5, -8, 0, 30, -40, -13, 0, -2, -7, 15, -4, -13, 4, -36, 9, -14, 8, -9, -2, 27, -20, -27, 9, 5, -12, -9, 43, -47, 14, -9, -9, 5, -12, -9, 15, -10, -8, 7, -8, -8, 4, 27, -40, 5, -9, 8, -22, 12, -16, 62};
        private static final int $$e = 70;
        private static final byte[] $$a = {73, 55, 58, 33, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
        private static final int $$b = 223;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        private static int g = 1;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 31093;
        private static char TuitionPaymentFragmentbindingInflater1 = 803;
        private static char b = 17269;
        private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 45179;
        final SequentialDisposable task = new SequentialDisposable();
        final AtomicLong index = new AtomicLong();
        final AtomicReference<BufferProviderState> upstream = new AtomicReference<>();

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(short r6, int r7, short r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 4
                int r8 = r8 + 84
                int r7 = r7 + 4
                byte[] r0 = io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutFallbackObserver.$$a
                int r6 = r6 * 15
                int r1 = 53 - r6
                byte[] r1 = new byte[r1]
                int r6 = 52 - r6
                r2 = 0
                if (r0 != 0) goto L17
                r4 = r6
                r8 = r7
                r3 = r2
                goto L2c
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r8
                r1[r3] = r4
                if (r3 != r6) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L25:
                int r3 = r3 + 1
                r4 = r0[r7]
                r5 = r8
                r8 = r7
                r7 = r5
            L2c:
                int r4 = -r4
                int r7 = r7 + r4
                int r7 = r7 + (-11)
                int r8 = r8 + 1
                r5 = r8
                r8 = r7
                r7 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutFallbackObserver.a(short, int, short, java.lang.Object[]):void");
        }

        private static void d(int i, byte b2, byte b3, Object[] objArr) {
            int i2 = i * 36;
            int i3 = (b2 * 21) + 84;
            byte[] bArr = $$d;
            int i4 = 77 - (b3 * 73);
            byte[] bArr2 = new byte[i2 + 38];
            int i5 = i2 + 37;
            int i6 = -1;
            if (bArr == null) {
                int i7 = i5 + (-i3);
                int i8 = i4 + 1;
                int i9 = i7 - 3;
                i6 = -1;
                i4 = i8;
                i3 = i9;
            }
            while (true) {
                int i10 = i6 + 1;
                bArr2[i10] = (byte) i3;
                if (i10 == i5) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                int i11 = i4;
                i6 = i10;
                i4 = i11 + 1;
                i3 = (i3 + (-bArr[i4])) - 3;
            }
        }

        private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            onCaptureSessionEnd oncapturesessionend = new onCaptureSessionEnd();
            char[] cArr2 = new char[cArr.length - 2];
            oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 2;
            char[] cArr3 = new char[2];
            while (true) {
                int i3 = 0;
                if (oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= cArr.length) {
                    objArr[0] = new String(cArr2, 0, i);
                    int i4 = $10 + 93;
                    $11 = i4 % 128;
                    int i5 = i4 % 2;
                    return;
                }
                int i6 = $10 + 13;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 / 0];
                } else {
                    cArr3[0] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                    cArr3[1] = cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                }
                int i7 = $10 + 7;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 58224;
                int i10 = 0;
                while (i10 < 16) {
                    int i11 = $11 + 117;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    char c = cArr3[1];
                    char c2 = cArr3[i3];
                    int i13 = (c2 + i9) ^ ((c2 << 4) + ((char) (((long) b) ^ 8611973335120459638L)));
                    int i14 = c2 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        objArr2[2] = Integer.valueOf(i14);
                        objArr2[1] = Integer.valueOf(i13);
                        objArr2[i3] = Integer.valueOf(c);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char cBlue = (char) (47773 - Color.blue(i3));
                            int iMyTid = (Process.myTid() >> 22) + 468;
                            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 13;
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cBlue, iMyTid, scrollBarSize, -2007001706, false, "o", clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        int i15 = i10;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i9) ^ ((cCharValue << 4) + ((char) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 8611973335120459638L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1824600641);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - View.getDefaultSize(0, 0)), 468 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 13 - ExpandableListView.getPackedPositionType(0L), -2007001706, false, "o", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                        i9 -= 40503;
                        i10 = i15 + 1;
                        i3 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] = (char) (cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 2] ^ cArr3[0]);
                cArr2[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1] = (char) (cArr3[1] ^ cArr[oncapturesessionend.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1]);
                Object[] objArr4 = {oncapturesessionend, oncapturesessionend};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1431906448);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getScrollBarSize() >> 8), 2323 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), View.MeasureSpec.getSize(0) + 44, -1312321721, false, $$g(b2, b3, b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
            }
        }

        TimeoutFallbackObserver(deriveMediaType<? super T> derivemediatype, readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<?>> readablems, AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy) {
            this.downstream = derivemediatype;
            this.itemTimeoutIndicator = readablems;
            this.fallback = autoValue_VideoValidatedEncoderProfilesProxy;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            int i = 2 % 2;
            int i2 = g + 45;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            if (i2 % 2 != 0) {
                DisposableHelper.TuitionPaymentFragmentbindingInflater1(this.upstream, bufferProviderState);
                int i3 = 75 / 0;
            } else {
                DisposableHelper.TuitionPaymentFragmentbindingInflater1(this.upstream, bufferProviderState);
            }
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
            g = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 15;
            g = i2 % 128;
            int i3 = i2 % 2;
            long j = this.index.get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (!(!this.index.compareAndSet(j, j2))) {
                    BufferProviderState bufferProviderState = this.task.get();
                    if (bufferProviderState != null) {
                        bufferProviderState.dispose();
                        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 23;
                        g = i4 % 128;
                        int i5 = i4 % 2;
                    }
                    this.downstream.onNext(t);
                    try {
                        AutoValue_VideoValidatedEncoderProfilesProxy autoValue_VideoValidatedEncoderProfilesProxy = (AutoValue_VideoValidatedEncoderProfilesProxy) share.b(this.itemTimeoutIndicator.apply(t), "The itemTimeoutIndicator returned a null ObservableSource.");
                        TimeoutConsumer timeoutConsumer = new TimeoutConsumer(j2, this);
                        if (DisposableHelper.b((AtomicReference<BufferProviderState>) this.task, timeoutConsumer)) {
                            int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 21;
                            g = i6 % 128;
                            int i7 = i6 % 2;
                            autoValue_VideoValidatedEncoderProfilesProxy.subscribe(timeoutConsumer);
                        }
                    } catch (Throwable th) {
                        dumpMediaCodecListForFormat.b(th);
                        this.upstream.get().dispose();
                        this.index.getAndSet(Long.MAX_VALUE);
                        this.downstream.onError(th);
                    }
                }
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 69;
            g = i2 % 128;
            if (i2 % 2 == 0) {
                this.index.getAndSet(Long.MAX_VALUE);
                throw null;
            }
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
                g = i3 % 128;
                int i4 = i3 % 2;
                this.task.dispose();
                this.downstream.onError(th);
                this.task.dispose();
                return;
            }
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            int i = 2 % 2;
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.task.dispose();
                int i2 = g + 15;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                int i3 = i2 % 2;
            }
            int i4 = g + 121;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeoutTimed.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final void b(long j) {
            int i = 2 % 2;
            int i2 = g + 105;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                this.index.compareAndSet(j, Long.MAX_VALUE);
                obj.hashCode();
                throw null;
            }
            if (this.index.compareAndSet(j, Long.MAX_VALUE)) {
                DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.upstream);
                AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy = this.fallback;
                this.fallback = null;
                autoValue_VideoValidatedEncoderProfilesProxy.subscribe(new ObservableTimeoutTimed.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.downstream, this));
                int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
                g = i3 % 128;
                int i4 = i3 % 2;
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableTimeout.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(long j, Throwable th) throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 99;
            g = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                int doubleTapTimeout = 876 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int bitsPerPixel = 9 - ImageFormat.getBitsPerPixel(0);
                byte[] bArr = $$a;
                byte b2 = bArr[5];
                byte b3 = bArr[7];
                Object[] objArr2 = new Object[1];
                a(b2, b3, b3, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(threadPriority, doubleTapTimeout, bitsPerPixel, -1650998592, false, (String) objArr2[0], null);
            }
            long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(new char[]{12040, 44157, 39364, 25874, 64990, 27431, 4881, 37748, 869, 17817, 22471, 58936, 15412, 44772, 8271, 18292, 54203, 45918, 6423, 6596, 52323, 15894, 30650, 16235}, 22 - TextUtils.indexOf("", "", 0), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new char[]{51221, 44691, 56703, 53024, 19278, 63100, 30717, 39128, 37211, 39515, 11972, 42907, 55197, 34177, 11243, 22299, 9489, 20300}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 15, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
                int pressedStateDuration = 876 - (ViewConfiguration.getPressedStateDuration() >> 16);
                int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 10;
                byte b4 = $$a[7];
                byte b5 = b4;
                Object[] objArr5 = new Object[1];
                a(b5, (byte) (b5 | 37), b4, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAxisFromString, pressedStateDuration, iIndexOf, 2012020043, false, (String) objArr5[0], null);
            }
            if (j2 == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char trimmedLength = (char) TextUtils.getTrimmedLength("");
                    int iArgb = 876 - Color.argb(0, 0, 0, 0);
                    int iResolveSizeAndState = 10 - View.resolveSizeAndState(0, 0, 0);
                    byte b6 = $$a[7];
                    byte b7 = b6;
                    Object[] objArr6 = new Object[1];
                    a(b7, (byte) (b7 | 89), b6, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(trimmedLength, iArgb, iResolveSizeAndState, 2012931276, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i4 = ~elapsedCpuTime;
                int i5 = (((2142499818 + (((~(i4 | (-847450761))) | 887760989) * (-1042))) + (((-847450761) | elapsedCpuTime) * 521)) + ((((~(elapsedCpuTime | (-887760990))) | 73934933) | (~(i4 | (-33624705)))) * 521)) - 640938012;
                int i6 = (i5 << 13) ^ i5;
                int i7 = i6 ^ (i6 >>> 17);
                ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                c(new char[]{17648, 17209, 36135, 7246, 42367, 6233, 64326, 16128, 2267, 22772, 55952, 3313, 57735, 59622, 18188, 61815, 34243, 50729, 9891, 11936, 7897, 51312, 32161, 25901, 40909, 25668, 13621, 56277}, 26 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(new char[]{37839, 26598, 64571, 36082, 1318, 55189, 36234, 21186, 62706, 2254, 7403, 10546, 19086, 3354, 12658, 24882, 23270, 40436, 63901, 45474}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 17, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                        int i8 = g + 69;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i8 % 128;
                        int i9 = i8 % 2;
                        applicationContext = null;
                    } else {
                        applicationContext = applicationContext.getApplicationContext();
                    }
                }
                Object[] objArr10 = new Object[1];
                c(new char[]{56941, 43175, 61413, 56449, 25671, 38139, 907, 11357, 20792, 59228, 35871, 52438, 13482, 8985, 18700, 4077, 58149, 10604}, 16 - (ViewConfiguration.getEdgeSlop() >> 16), objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                c(new char[]{36881, 15470, 37056, 43223, 40803, 22454, 24873, 62218, 62261, 17553, 3791, 61515, 14146, 59435, 44184, 49611, 29080, 32782}, 16 - TextUtils.indexOf("", "", 0), objArr11);
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -640938012};
                    byte[] bArr2 = $$d;
                    byte b8 = bArr2[8];
                    byte b9 = b8;
                    Object[] objArr13 = new Object[1];
                    d(b8, b9, b9, objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b10 = bArr2[60];
                    byte b11 = b10;
                    Object[] objArr14 = new Object[1];
                    d(b10, b11, b11, objArr14);
                    objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    if (applicationContext != null) {
                        int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 39;
                        g = i10 % 128;
                        int i11 = i10 % 2;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1822145765);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char threadPriority2 = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                            int threadPriority3 = 876 - ((Process.getThreadPriority(0) + 20) >> 6);
                            int iIndexOf2 = TextUtils.indexOf("", "") + 10;
                            byte b12 = $$a[7];
                            byte b13 = b12;
                            Object[] objArr15 = new Object[1];
                            a(b13, (byte) (b13 | 89), b12, objArr15);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(threadPriority2, threadPriority3, iIndexOf2, 2012931276, false, (String) objArr15[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                        try {
                            Object[] objArr16 = new Object[1];
                            c(new char[]{12040, 44157, 39364, 25874, 64990, 27431, 4881, 37748, 869, 17817, 22471, 58936, 15412, 44772, 8271, 18292, 54203, 45918, 6423, 6596, 52323, 15894, 30650, 16235}, TextUtils.lastIndexOf("", '0', 0, 0) + 23, objArr16);
                            Class<?> cls5 = Class.forName((String) objArr16[0]);
                            Object[] objArr17 = new Object[1];
                            c(new char[]{51221, 44691, 56703, 53024, 19278, 63100, 30717, 39128, 37211, 39515, 11972, 42907, 55197, 34177, 11243, 22299, 9489, 20300}, (Process.myTid() >> 22) + 15, objArr17);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1821222244);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                                int iBlue = 876 - Color.blue(0);
                                int trimmedLength2 = 10 - TextUtils.getTrimmedLength("");
                                byte b14 = $$a[7];
                                byte b15 = b14;
                                Object[] objArr18 = new Object[1];
                                a(b15, (byte) (b15 | 37), b14, objArr18);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cLastIndexOf, iBlue, trimmedLength2, 2012020043, false, (String) objArr18[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2030658839);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                                int iMyTid = (Process.myTid() >> 22) + 876;
                                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 11;
                                byte[] bArr3 = $$a;
                                byte b16 = bArr3[5];
                                byte b17 = bArr3[7];
                                Object[] objArr19 = new Object[1];
                                a(b16, b17, b17, objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(windowTouchSlop, iMyTid, iLastIndexOf, -1650998592, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            int i12 = g + 117;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i12 % 128;
                            int i13 = i12 % 2;
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            if (((int[]) objArr[0])[0] != ((int[]) objArr[2])[0]) {
                throw null;
            }
            int i14 = ((int[]) objArr[1])[0];
            Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i15 = i14 + (((~(167688166 | iElapsedRealtime)) | (-94075486)) * 262) + 1666565286 + (((~((~iElapsedRealtime) | 167688166)) | (-94075486)) * 262);
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            Object obj = objArr20[1];
            ((int[]) obj)[0] = i17 ^ (i17 << 5);
            AtomicLong atomicLong = this.index;
            int i18 = ((int[]) obj)[0];
            int i19 = ((i18 * i18) - (~(-(1056803385 * i18)))) - 1;
            int i20 = -(i18 * 2084519173);
            int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
            int i22 = (i21 & (-1526178623)) + ((-1526178623) | i21);
            int i23 = i22 >> 15;
            int i24 = (((-262143) ^ i23) + ((i23 & (-262143)) << 1)) / 131072;
            int i25 = (i22 - (~(((i24 | 1) << 1) - (i24 ^ 1)))) - 1;
            int i26 = i22 >> 17;
            int i27 = (((-65535) ^ i26) + ((i26 & (-65535)) << 1)) / 32768;
            int i28 = (-(i25 ^ (((i27 | 1) << 1) - (i27 ^ 1)))) + 6;
            int i29 = ((i28 >> 16) - 131071) / 65536;
            int i30 = (i29 & 1) + (i29 | 1);
            if (!atomicLong.compareAndSet(j, ((long) (2352330 / ((i28 & (-(((i30 | 1) << 1) - (i30 ^ 1)))) * 1329))) + 9223372036854775512L)) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
                return;
            }
            int i31 = g + 41;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i31 % 128;
            if (i31 % 2 == 0) {
                DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
                this.downstream.onError(th);
            } else {
                DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
                this.downstream.onError(th);
                throw null;
            }
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
            g = i2 % 128;
            int i3 = i2 % 2;
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.upstream);
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
            this.task.dispose();
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
            g = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            int i = 2 % 2;
            int i2 = g + 123;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            boolean zTuitionPaymentFragmentbindingInflater1 = DisposableHelper.TuitionPaymentFragmentbindingInflater1(get());
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
            g = i4 % 128;
            int i5 = i4 % 2;
            return zTuitionPaymentFragmentbindingInflater1;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(byte r6, int r7, int r8) {
            /*
                byte[] r0 = io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutFallbackObserver.$$c
                int r7 = r7 * 3
                int r7 = r7 + 4
                int r6 = r6 * 3
                int r6 = 108 - r6
                int r8 = r8 * 3
                int r8 = r8 + 1
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r8
                r4 = r2
                goto L26
            L16:
                r3 = r2
            L17:
                int r4 = r3 + 1
                byte r5 = (byte) r6
                r1[r3] = r5
                if (r4 != r8) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L24:
                r3 = r0[r7]
            L26:
                int r3 = -r3
                int r6 = r6 + r3
                int r7 = r7 + 1
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableTimeout.TimeoutFallbackObserver.$$g(byte, int, int):java.lang.String");
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TimeoutConsumer extends AtomicReference<BufferProviderState> implements deriveMediaType<Object>, BufferProviderState {
        private static final long serialVersionUID = 8708641127342403073L;
        final long idx;
        final TuitionPaymentFragmentspecialinlinedviewModeldefault2 parent;

        TimeoutConsumer(long j, TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            this.idx = j;
            this.parent = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            DisposableHelper.TuitionPaymentFragmentbindingInflater1(this, bufferProviderState);
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(Object obj) {
            BufferProviderState bufferProviderState = (BufferProviderState) get();
            if (bufferProviderState != DisposableHelper.DISPOSED) {
                bufferProviderState.dispose();
                lazySet(DisposableHelper.DISPOSED);
                this.parent.b(this.idx);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (get() != DisposableHelper.DISPOSED) {
                lazySet(DisposableHelper.DISPOSED);
                this.parent.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.idx, th);
            } else {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            if (get() != DisposableHelper.DISPOSED) {
                lazySet(DisposableHelper.DISPOSED);
                this.parent.b(this.idx);
            }
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return DisposableHelper.TuitionPaymentFragmentbindingInflater1(get());
        }
    }
}

package io.reactivex.internal.operators.observable;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.AbsActionBarViewVisibilityAnimListener;
import defpackage.AudioSettingsBuilder;
import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.ExcludeStretchedVideoQualityQuirk;
import defpackage.SharedByteBuffer;
import defpackage.createMediaMuxer;
import defpackage.deriveMediaType;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import defpackage.notifySuspended;
import defpackage.readableMs;
import defpackage.share;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class ObservableConcatMap<T, U> extends notifySuspended<T, U> {
    private readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends U>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private ErrorMode TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public ObservableConcatMap(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends U>> readablems, int i, ErrorMode errorMode) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = readablems;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = errorMode;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = Math.max(8, i);
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super U> derivemediatype) {
        if (ObservableScalarXMap.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            return;
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == ErrorMode.IMMEDIATE) {
            this.TuitionPaymentFragmentbindingInflater1.subscribe(new SourceObserver(new ExcludeStretchedVideoQualityQuirk(derivemediatype), this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
        } else {
            this.TuitionPaymentFragmentbindingInflater1.subscribe(new ConcatMapDelayErrorObserver(derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == ErrorMode.END));
        }
    }

    public static final class SourceObserver<T, U> extends AtomicInteger implements deriveMediaType<T>, BufferProviderState {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final long serialVersionUID = 8828587559905699186L;
        volatile boolean active;
        final int bufferSize;
        volatile boolean disposed;
        volatile boolean done;
        final deriveMediaType<? super U> downstream;
        int fusionMode;
        final InnerObserver<U> inner;
        final readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends U>> mapper;
        AudioSettingsBuilder<T> queue;
        BufferProviderState upstream;
        private static final byte[] $$a = {81, 125, 2, 46};
        private static final int $$b = 195;
        private static int b = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        private static long TuitionPaymentFragmentbindingInflater1 = 8595064265254973006L;

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(short r7, short r8, short r9, java.lang.Object[] r10) {
            /*
                byte[] r0 = io.reactivex.internal.operators.observable.ObservableConcatMap.SourceObserver.$$a
                int r8 = r8 * 4
                int r8 = r8 + 1
                int r9 = r9 * 2
                int r9 = r9 + 4
                int r7 = r7 * 4
                int r7 = 98 - r7
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r9
                r5 = r2
                r9 = r8
                goto L2d
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r7
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r8) goto L27
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L27:
                r3 = r0[r9]
                r6 = r9
                r9 = r7
                r7 = r3
                r3 = r6
            L2d:
                int r7 = -r7
                int r7 = r7 + r9
                int r9 = r3 + 1
                r3 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableConcatMap.SourceObserver.c(short, short, short, java.lang.Object[]):void");
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
            getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            getrealtimecapturelatency.b = 0;
            while (getrealtimecapturelatency.b < cArr.length) {
                int i3 = $10 + 67;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                int i5 = getrealtimecapturelatency.b;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 19472), Gravity.getAbsoluteGravity(0, 0) + 2624, (-16777203) - Color.rgb(0, 0, 0), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() ^ (TuitionPaymentFragmentbindingInflater1 ^ 9053247990562531611L);
                    try {
                        Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ExpandableListView.getPackedPositionChild(0L) + 39423), 481 - Drawable.resolveOpacity(0, 0), KeyEvent.normalizeMetaState(0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            char[] cArr2 = new char[length];
            getrealtimecapturelatency.b = 0;
            int i6 = $10 + 71;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            while (getrealtimecapturelatency.b < cArr.length) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr4 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 39422), 482 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 37 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                int i8 = $10 + 35;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 4 % 3;
                }
            }
            objArr[0] = new String(cArr2);
        }

        SourceObserver(deriveMediaType<? super U> derivemediatype, readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends U>> readablems, int i) {
            this.downstream = derivemediatype;
            this.mapper = readablems;
            this.bufferSize = i;
            this.inner = new InnerObserver<>(derivemediatype, this);
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            int i = 2 % 2;
            int i2 = b + 33;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            if (DisposableHelper.b(this.upstream, bufferProviderState)) {
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
                b = i4 % 128;
                int i5 = i4 % 2;
                this.upstream = bufferProviderState;
                if (!(!(bufferProviderState instanceof SharedByteBuffer))) {
                    SharedByteBuffer sharedByteBuffer = (SharedByteBuffer) bufferProviderState;
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = sharedByteBuffer.TuitionPaymentFragmentspecialinlinedviewModeldefault1(3);
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 1) {
                        this.fusionMode = iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        this.queue = sharedByteBuffer;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        TuitionPaymentFragmentbindingInflater1();
                        return;
                    }
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 2) {
                        int i6 = b + 93;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i6 % 128;
                        if (i6 % 2 != 0) {
                            this.fusionMode = iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            this.queue = sharedByteBuffer;
                            this.downstream.onSubscribe(this);
                            return;
                        } else {
                            this.fusionMode = iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            this.queue = sharedByteBuffer;
                            this.downstream.onSubscribe(this);
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                    }
                }
                this.queue = new createMediaMuxer(this.bufferSize);
                this.downstream.onSubscribe(this);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
            b = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 77 / 0;
                if (this.done) {
                    return;
                }
            } else if (this.done) {
                return;
            }
            if (this.fusionMode == 0) {
                this.queue.TuitionPaymentFragmentbindingInflater1(t);
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 77;
                b = i4 % 128;
                int i5 = i4 % 2;
            }
            TuitionPaymentFragmentbindingInflater1();
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            int i = 2 % 2;
            if (!this.done) {
                this.done = true;
                dispose();
                this.downstream.onError(th);
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 19;
                b = i2 % 128;
                int i3 = i2 % 2;
                return;
            }
            int i4 = b + 115;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            int i5 = i4 % 2;
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 45;
            b = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 52 / 0;
                if (this.done) {
                    return;
                }
            } else if (this.done) {
                return;
            }
            this.done = true;
            TuitionPaymentFragmentbindingInflater1();
            int i4 = b + 41;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
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
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 43;
            b = i2 % 128;
            int i3 = i2 % 2;
            boolean z = this.disposed;
            if (i3 != 0) {
                int i4 = 42 / 0;
            }
            return z;
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            int i = 2 % 2;
            this.disposed = true;
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.inner);
            this.upstream.dispose();
            if (getAndIncrement() == 0) {
                int i2 = b + 103;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                int i3 = i2 % 2;
                this.queue.TuitionPaymentFragmentbindingInflater1();
                int i4 = b + 17;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        final void TuitionPaymentFragmentbindingInflater1() {
            boolean z;
            int i = 2 % 2;
            if (getAndIncrement() == 0) {
                while (!this.disposed) {
                    if (!this.active) {
                        boolean z2 = this.done;
                        try {
                            T tTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.queue.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            if (tTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 73;
                                b = i2 % 128;
                                int i3 = i2 % 2;
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z2 && !(!z)) {
                                this.disposed = true;
                                this.downstream.onComplete();
                                return;
                            } else if (!z) {
                                try {
                                    AutoValue_VideoValidatedEncoderProfilesProxy autoValue_VideoValidatedEncoderProfilesProxy = (AutoValue_VideoValidatedEncoderProfilesProxy) share.b(this.mapper.apply(tTuitionPaymentFragmentspecialinlinedviewModeldefault2), "The mapper returned a null ObservableSource");
                                    this.active = true;
                                    autoValue_VideoValidatedEncoderProfilesProxy.subscribe(this.inner);
                                } catch (Throwable th) {
                                    dumpMediaCodecListForFormat.b(th);
                                    dispose();
                                    this.queue.TuitionPaymentFragmentbindingInflater1();
                                    this.downstream.onError(th);
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            dumpMediaCodecListForFormat.b(th2);
                            dispose();
                            this.queue.TuitionPaymentFragmentbindingInflater1();
                            this.downstream.onError(th2);
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
                b = i4 % 128;
                if (i4 % 2 == 0) {
                    this.queue.TuitionPaymentFragmentbindingInflater1();
                } else {
                    this.queue.TuitionPaymentFragmentbindingInflater1();
                    throw null;
                }
            }
        }

        static final class InnerObserver<U> extends AtomicReference<BufferProviderState> implements deriveMediaType<U> {
            private static final long serialVersionUID = -7449079488798789337L;
            final deriveMediaType<? super U> downstream;
            final SourceObserver<?, ?> parent;

            InnerObserver(deriveMediaType<? super U> derivemediatype, SourceObserver<?, ?> sourceObserver) {
                this.downstream = derivemediatype;
                this.parent = sourceObserver;
            }

            @Override // defpackage.deriveMediaType
            public final void onSubscribe(BufferProviderState bufferProviderState) {
                DisposableHelper.b(this, bufferProviderState);
            }

            @Override // defpackage.deriveMediaType
            public final void onNext(U u) {
                this.downstream.onNext(u);
            }

            @Override // defpackage.deriveMediaType
            public final void onError(Throwable th) {
                this.parent.dispose();
                this.downstream.onError(th);
            }

            @Override // defpackage.deriveMediaType
            public final void onComplete() {
                SourceObserver<?, ?> sourceObserver = this.parent;
                sourceObserver.active = false;
                sourceObserver.TuitionPaymentFragmentbindingInflater1();
            }
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] b(int r31, int r32) {
            /*
                Method dump skipped, instruction units count: 2076
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableConcatMap.SourceObserver.b(int, int):java.lang.Object[]");
        }
    }

    static final class ConcatMapDelayErrorObserver<T, R> extends AtomicInteger implements deriveMediaType<T>, BufferProviderState {
        private static final long serialVersionUID = -6951100001833242599L;
        volatile boolean active;
        final int bufferSize;
        volatile boolean cancelled;
        volatile boolean done;
        final deriveMediaType<? super R> downstream;
        final AtomicThrowable error = new AtomicThrowable();
        final readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> mapper;
        final DelayErrorInnerObserver<R> observer;
        AudioSettingsBuilder<T> queue;
        int sourceMode;
        final boolean tillTheEnd;
        BufferProviderState upstream;

        ConcatMapDelayErrorObserver(deriveMediaType<? super R> derivemediatype, readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends R>> readablems, int i, boolean z) {
            this.downstream = derivemediatype;
            this.mapper = readablems;
            this.bufferSize = i;
            this.tillTheEnd = z;
            this.observer = new DelayErrorInnerObserver<>(derivemediatype, this);
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.upstream, bufferProviderState)) {
                this.upstream = bufferProviderState;
                if (bufferProviderState instanceof SharedByteBuffer) {
                    SharedByteBuffer sharedByteBuffer = (SharedByteBuffer) bufferProviderState;
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = sharedByteBuffer.TuitionPaymentFragmentspecialinlinedviewModeldefault1(3);
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 1) {
                        this.sourceMode = iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        this.queue = sharedByteBuffer;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        b();
                        return;
                    }
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 2) {
                        this.sourceMode = iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        this.queue = sharedByteBuffer;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new createMediaMuxer(this.bufferSize);
                this.downstream.onSubscribe(this);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            if (this.sourceMode == 0) {
                this.queue.TuitionPaymentFragmentbindingInflater1(t);
            }
            b();
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (ExceptionHelper.TuitionPaymentFragmentbindingInflater1(this.error, th)) {
                this.done = true;
                b();
            } else {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.done = true;
            b();
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.cancelled;
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.observer);
        }

        final void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            deriveMediaType<? super R> derivemediatype = this.downstream;
            AudioSettingsBuilder<T> audioSettingsBuilder = this.queue;
            AtomicThrowable atomicThrowable = this.error;
            while (true) {
                if (!this.active) {
                    if (this.cancelled) {
                        audioSettingsBuilder.TuitionPaymentFragmentbindingInflater1();
                        return;
                    }
                    if (!this.tillTheEnd && atomicThrowable.get() != null) {
                        audioSettingsBuilder.TuitionPaymentFragmentbindingInflater1();
                        this.cancelled = true;
                        derivemediatype.onError(ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(atomicThrowable));
                        return;
                    }
                    boolean z = this.done;
                    try {
                        T tTuitionPaymentFragmentspecialinlinedviewModeldefault2 = audioSettingsBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        boolean z2 = tTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null;
                        if (z && z2) {
                            this.cancelled = true;
                            Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(atomicThrowable);
                            if (thTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                                derivemediatype.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                return;
                            } else {
                                derivemediatype.onComplete();
                                return;
                            }
                        }
                        if (!z2) {
                            try {
                                AutoValue_VideoValidatedEncoderProfilesProxy autoValue_VideoValidatedEncoderProfilesProxy = (AutoValue_VideoValidatedEncoderProfilesProxy) share.b(this.mapper.apply(tTuitionPaymentFragmentspecialinlinedviewModeldefault2), "The mapper returned a null ObservableSource");
                                if (autoValue_VideoValidatedEncoderProfilesProxy instanceof Callable) {
                                    try {
                                        AbsActionBarViewVisibilityAnimListener absActionBarViewVisibilityAnimListener = (Object) ((Callable) autoValue_VideoValidatedEncoderProfilesProxy).call();
                                        if (absActionBarViewVisibilityAnimListener != null && !this.cancelled) {
                                            derivemediatype.onNext(absActionBarViewVisibilityAnimListener);
                                        }
                                    } catch (Throwable th) {
                                        dumpMediaCodecListForFormat.b(th);
                                        ExceptionHelper.TuitionPaymentFragmentbindingInflater1(atomicThrowable, th);
                                    }
                                } else {
                                    this.active = true;
                                    autoValue_VideoValidatedEncoderProfilesProxy.subscribe(this.observer);
                                }
                            } catch (Throwable th2) {
                                dumpMediaCodecListForFormat.b(th2);
                                this.cancelled = true;
                                this.upstream.dispose();
                                audioSettingsBuilder.TuitionPaymentFragmentbindingInflater1();
                                ExceptionHelper.TuitionPaymentFragmentbindingInflater1(atomicThrowable, th2);
                                derivemediatype.onError(ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(atomicThrowable));
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        dumpMediaCodecListForFormat.b(th3);
                        this.cancelled = true;
                        this.upstream.dispose();
                        ExceptionHelper.TuitionPaymentFragmentbindingInflater1(atomicThrowable, th3);
                        derivemediatype.onError(ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(atomicThrowable));
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        static final class DelayErrorInnerObserver<R> extends AtomicReference<BufferProviderState> implements deriveMediaType<R> {
            private static final long serialVersionUID = 2620149119579502636L;
            final deriveMediaType<? super R> downstream;
            final ConcatMapDelayErrorObserver<?, R> parent;

            DelayErrorInnerObserver(deriveMediaType<? super R> derivemediatype, ConcatMapDelayErrorObserver<?, R> concatMapDelayErrorObserver) {
                this.downstream = derivemediatype;
                this.parent = concatMapDelayErrorObserver;
            }

            @Override // defpackage.deriveMediaType
            public final void onSubscribe(BufferProviderState bufferProviderState) {
                DisposableHelper.b(this, bufferProviderState);
            }

            @Override // defpackage.deriveMediaType
            public final void onNext(R r) {
                this.downstream.onNext(r);
            }

            @Override // defpackage.deriveMediaType
            public final void onError(Throwable th) {
                ConcatMapDelayErrorObserver<?, R> concatMapDelayErrorObserver = this.parent;
                if (ExceptionHelper.TuitionPaymentFragmentbindingInflater1(concatMapDelayErrorObserver.error, th)) {
                    if (!concatMapDelayErrorObserver.tillTheEnd) {
                        concatMapDelayErrorObserver.upstream.dispose();
                    }
                    concatMapDelayErrorObserver.active = false;
                    concatMapDelayErrorObserver.b();
                    return;
                }
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            }

            @Override // defpackage.deriveMediaType
            public final void onComplete() {
                ConcatMapDelayErrorObserver<?, R> concatMapDelayErrorObserver = this.parent;
                concatMapDelayErrorObserver.active = false;
                concatMapDelayErrorObserver.b();
            }
        }
    }
}

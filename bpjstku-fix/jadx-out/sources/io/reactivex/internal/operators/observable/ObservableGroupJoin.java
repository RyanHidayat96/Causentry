package io.reactivex.internal.operators.observable;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.VideoRecordEventStart;
import defpackage.abortCapture;
import defpackage.acquireBuffer;
import defpackage.createMediaMuxer;
import defpackage.deriveMediaType;
import defpackage.dumpCodecCapabilities;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.initSession;
import defpackage.notifySuspended;
import defpackage.readableMs;
import defpackage.share;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.subjects.UnicastSubject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableGroupJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends notifySuspended<TLeft, R> {
    private readableMs<? super TLeft, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<TLeftEnd>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private AutoValue_VideoValidatedEncoderProfilesProxy<? extends TRight> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private dumpCodecCapabilities<? super TLeft, ? super VideoRecordEventStart<TRight>, ? extends R> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private readableMs<? super TRight, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<TRightEnd>> b;

    /* JADX INFO: loaded from: classes7.dex */
    interface TuitionPaymentFragmentbindingInflater1 {
        void TuitionPaymentFragmentbindingInflater1(Throwable th);

        void TuitionPaymentFragmentspecialinlinedviewModeldefault1(LeftRightObserver leftRightObserver);

        void TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean z, Object obj);

        void b(Throwable th);

        void b(boolean z, LeftRightEndObserver leftRightEndObserver);
    }

    public ObservableGroupJoin(AutoValue_VideoValidatedEncoderProfilesProxy<TLeft> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<? extends TRight> autoValue_VideoValidatedEncoderProfilesProxy2, readableMs<? super TLeft, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<TLeftEnd>> readablems, readableMs<? super TRight, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<TRightEnd>> readablems2, dumpCodecCapabilities<? super TLeft, ? super VideoRecordEventStart<TRight>, ? extends R> dumpcodeccapabilities) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = autoValue_VideoValidatedEncoderProfilesProxy2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = readablems;
        this.b = readablems2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = dumpcodeccapabilities;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super R> derivemediatype) {
        GroupJoinDisposable groupJoinDisposable = new GroupJoinDisposable(derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        derivemediatype.onSubscribe(groupJoinDisposable);
        LeftRightObserver leftRightObserver = new LeftRightObserver(groupJoinDisposable, true);
        groupJoinDisposable.disposables.TuitionPaymentFragmentspecialinlinedviewModeldefault3(leftRightObserver);
        LeftRightObserver leftRightObserver2 = new LeftRightObserver(groupJoinDisposable, false);
        groupJoinDisposable.disposables.TuitionPaymentFragmentspecialinlinedviewModeldefault3(leftRightObserver2);
        this.TuitionPaymentFragmentbindingInflater1.subscribe(leftRightObserver);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.subscribe(leftRightObserver2);
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class GroupJoinDisposable<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements BufferProviderState, TuitionPaymentFragmentbindingInflater1 {
        private static Integer TuitionPaymentFragmentbindingInflater1 = null;
        private static Integer TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
        private static Integer TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        private static Integer b = null;
        private static int d = 0;
        private static final long serialVersionUID = -6071216598687999801L;
        volatile boolean cancelled;
        final deriveMediaType<? super R> downstream;
        final readableMs<? super TLeft, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<TLeftEnd>> leftEnd;
        int leftIndex;
        final dumpCodecCapabilities<? super TLeft, ? super VideoRecordEventStart<TRight>, ? extends R> resultSelector;
        final readableMs<? super TRight, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<TRightEnd>> rightEnd;
        int rightIndex;
        private static final byte[] $$c = {27, -8, 5, 78};
        private static final int $$f = 218;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {63, 56, -36, -117, -20, -6, 55, -69, -12, -14, -6, 3, -9, -10, -1, -25, -7, -8, 11, 43, -59, -26, -14, 3, 3, 45, -27, -58, -14, 3, 3, 8, -26, -21, -12, 9, -21, 70, -25, 9, -25, -41, 4, -19, 3, -14, -7, 22, -25, -32, 4, 0, -17, -14, 38, -52, 9, -14, -14, 0, -17, -14, -7, -5, 3, -6, -14, 0, -19, -5, -13, -6, -5, -13, 1, -7, -26, 5, -4, -26, 34, -42, 3, -9, -15, 0, -9, -9, -3, -28, 1, -16, 58};
        private static final int $$e = 221;
        private static final byte[] $$a = {99, -43, -44, -62, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
        private static final int $$b = 173;
        private static int g = 0;
        private static int asInterface = 1;
        private static int asBinder = 0;
        final acquireBuffer disposables = new acquireBuffer();
        final createMediaMuxer<Object> queue = new createMediaMuxer<>(VideoRecordEventStart.bufferSize());
        final Map<Integer, UnicastSubject<TRight>> lefts = new LinkedHashMap();
        final Map<Integer, TRight> rights = new LinkedHashMap();
        final AtomicReference<Throwable> error = new AtomicReference<>();
        final AtomicInteger active = new AtomicInteger(2);

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:8:0x001a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(byte r5, int r6, short r7, java.lang.Object[] r8) {
            /*
                byte[] r0 = io.reactivex.internal.operators.observable.ObservableGroupJoin.GroupJoinDisposable.$$a
                int r6 = r6 * 14
                int r6 = 98 - r6
                int r7 = r7 * 52
                int r7 = 56 - r7
                int r1 = r5 + 1
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L14
                r4 = r7
                r3 = r2
                goto L26
            L14:
                r3 = r2
            L15:
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r5) goto L22
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L22:
                int r3 = r3 + 1
                r4 = r0[r7]
            L26:
                int r7 = r7 + 1
                int r6 = r6 + r4
                int r6 = r6 + (-10)
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableGroupJoin.GroupJoinDisposable.a(byte, int, short, java.lang.Object[]):void");
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
        private static void e(short r6, byte r7, int r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 * 37
                int r7 = 41 - r7
                int r8 = r8 * 15
                int r0 = 53 - r8
                int r6 = r6 * 15
                int r6 = 99 - r6
                byte[] r1 = io.reactivex.internal.operators.observable.ObservableGroupJoin.GroupJoinDisposable.$$d
                byte[] r0 = new byte[r0]
                int r8 = 52 - r8
                r2 = 0
                if (r1 != 0) goto L19
                r3 = r7
                r6 = r8
                r4 = r2
                goto L2e
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r6
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r8) goto L29
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L29:
                r3 = r1[r7]
                r5 = r3
                r3 = r7
                r7 = r5
            L2e:
                int r7 = -r7
                int r3 = r3 + 1
                int r6 = r6 + r7
                int r6 = r6 + (-8)
                r7 = r3
                r3 = r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableGroupJoin.GroupJoinDisposable.e(short, byte, int, java.lang.Object[]):void");
        }

        private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            abortCapture abortcapture = new abortCapture();
            char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-2687588926731523482L), cArr, i);
            int i3 = 4;
            abortcapture.b = 4;
            while (abortcapture.b < cArrB.length) {
                int i4 = $11 + 7;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - i3;
                int i6 = abortcapture.b;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % i3]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 64837), AndroidCharacter.getMirror('0') + 1308, 38 - (ViewConfiguration.getTapTimeout() >> 16), 894276454, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrB[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {abortcapture, abortcapture};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (View.resolveSize(0, 0) + 47773), MotionEvent.axisFromString("") + 469, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 12, 896083767, false, "n", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    i3 = 4;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArrB, 4, cArrB.length - 4);
            int i7 = $10 + 51;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
        }

        static {
            d = 1;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
            b = 2;
            TuitionPaymentFragmentbindingInflater1 = 3;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 4;
            int i = asBinder + 33;
            d = i % 128;
            int i2 = i % 2;
        }

        GroupJoinDisposable(deriveMediaType<? super R> derivemediatype, readableMs<? super TLeft, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<TLeftEnd>> readablems, readableMs<? super TRight, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<TRightEnd>> readablems2, dumpCodecCapabilities<? super TLeft, ? super VideoRecordEventStart<TRight>, ? extends R> dumpcodeccapabilities) {
            this.downstream = derivemediatype;
            this.leftEnd = readablems;
            this.rightEnd = readablems2;
            this.resultSelector = dumpcodeccapabilities;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0039  */
        @Override // defpackage.BufferProviderState
        public final void dispose() {
            int i = 2 % 2;
            int i2 = asInterface + 119;
            g = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (!this.cancelled) {
                int i3 = g + 125;
                asInterface = i3 % 128;
                if (i3 % 2 == 0) {
                    this.cancelled = true;
                    this.disposables.dispose();
                    if (getAndIncrement() == 0) {
                        this.queue.TuitionPaymentFragmentbindingInflater1();
                    }
                } else {
                    this.cancelled = true;
                    this.disposables.dispose();
                    if (getAndIncrement() == 0) {
                        this.queue.TuitionPaymentFragmentbindingInflater1();
                    }
                }
            }
            int i4 = g + 115;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            int i = 2 % 2;
            int i2 = asInterface + 41;
            g = i2 % 128;
            int i3 = i2 % 2;
            boolean z = this.cancelled;
            int i4 = asInterface + 5;
            g = i4 % 128;
            if (i4 % 2 == 0) {
                return z;
            }
            throw null;
        }

        private void TuitionPaymentFragmentbindingInflater1(deriveMediaType<?> derivemediatype) {
            int i = 2 % 2;
            int i2 = asInterface + 65;
            g = i2 % 128;
            int i3 = i2 % 2;
            Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.error);
            Iterator<UnicastSubject<TRight>> it = this.lefts.values().iterator();
            while (!(!it.hasNext())) {
                it.next().onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
            this.lefts.clear();
            this.rights.clear();
            derivemediatype.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            int i4 = g + 47;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }

        private void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            boolean z;
            int i = 2 % 2;
            if (getAndIncrement() == 0) {
                createMediaMuxer<Object> createmediamuxer = this.queue;
                deriveMediaType<? super R> derivemediatype = this.downstream;
                int iAddAndGet = 1;
                while (!this.cancelled) {
                    Object obj = null;
                    if (this.error.get() != null) {
                        int i2 = g + 69;
                        asInterface = i2 % 128;
                        if (i2 % 2 != 0) {
                            createmediamuxer.TuitionPaymentFragmentbindingInflater1();
                            this.disposables.dispose();
                            TuitionPaymentFragmentbindingInflater1(derivemediatype);
                            return;
                        } else {
                            createmediamuxer.TuitionPaymentFragmentbindingInflater1();
                            this.disposables.dispose();
                            TuitionPaymentFragmentbindingInflater1(derivemediatype);
                            obj.hashCode();
                            throw null;
                        }
                    }
                    boolean z2 = this.active.get() == 0;
                    Integer num = (Integer) createmediamuxer.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    if (num == null) {
                        int i3 = asInterface + 5;
                        g = i3 % 128;
                        int i4 = i3 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z2 && z) {
                        Iterator<UnicastSubject<TRight>> it = this.lefts.values().iterator();
                        while (it.hasNext()) {
                            it.next().onComplete();
                        }
                        this.lefts.clear();
                        this.rights.clear();
                        this.disposables.dispose();
                        derivemediatype.onComplete();
                        return;
                    }
                    if (z) {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createmediamuxer.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        if (num == TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                            UnicastSubject unicastSubjectTuitionPaymentFragmentspecialinlinedviewModeldefault3 = UnicastSubject.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            int i5 = this.leftIndex;
                            this.leftIndex = i5 + 1;
                            this.lefts.put(Integer.valueOf(i5), (UnicastSubject<TRight>) unicastSubjectTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                            try {
                                AutoValue_VideoValidatedEncoderProfilesProxy autoValue_VideoValidatedEncoderProfilesProxy = (AutoValue_VideoValidatedEncoderProfilesProxy) share.b(this.leftEnd.apply(objTuitionPaymentFragmentspecialinlinedviewModeldefault2), "The leftEnd returned a null ObservableSource");
                                LeftRightEndObserver leftRightEndObserver = new LeftRightEndObserver(this, true, i5);
                                this.disposables.TuitionPaymentFragmentspecialinlinedviewModeldefault3(leftRightEndObserver);
                                autoValue_VideoValidatedEncoderProfilesProxy.subscribe(leftRightEndObserver);
                                if (this.error.get() != null) {
                                    createmediamuxer.TuitionPaymentFragmentbindingInflater1();
                                    this.disposables.dispose();
                                    TuitionPaymentFragmentbindingInflater1(derivemediatype);
                                    return;
                                }
                                try {
                                    derivemediatype.onNext((Object) share.b(this.resultSelector.b(objTuitionPaymentFragmentspecialinlinedviewModeldefault2, unicastSubjectTuitionPaymentFragmentspecialinlinedviewModeldefault3), "The resultSelector returned a null value"));
                                    Iterator<TRight> it2 = this.rights.values().iterator();
                                    while (it2.hasNext()) {
                                        unicastSubjectTuitionPaymentFragmentspecialinlinedviewModeldefault3.onNext(it2.next());
                                    }
                                } catch (Throwable th) {
                                    dumpMediaCodecListForFormat.b(th);
                                    ExceptionHelper.TuitionPaymentFragmentbindingInflater1(this.error, th);
                                    createmediamuxer.TuitionPaymentFragmentbindingInflater1();
                                    this.disposables.dispose();
                                    TuitionPaymentFragmentbindingInflater1(derivemediatype);
                                    return;
                                }
                            } catch (Throwable th2) {
                                dumpMediaCodecListForFormat.b(th2);
                                ExceptionHelper.TuitionPaymentFragmentbindingInflater1(this.error, th2);
                                createmediamuxer.TuitionPaymentFragmentbindingInflater1();
                                this.disposables.dispose();
                                TuitionPaymentFragmentbindingInflater1(derivemediatype);
                                return;
                            }
                        } else if (num == b) {
                            int i6 = this.rightIndex;
                            this.rightIndex = i6 + 1;
                            this.rights.put(Integer.valueOf(i6), (TRight) objTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            try {
                                AutoValue_VideoValidatedEncoderProfilesProxy autoValue_VideoValidatedEncoderProfilesProxy2 = (AutoValue_VideoValidatedEncoderProfilesProxy) share.b(this.rightEnd.apply(objTuitionPaymentFragmentspecialinlinedviewModeldefault2), "The rightEnd returned a null ObservableSource");
                                LeftRightEndObserver leftRightEndObserver2 = new LeftRightEndObserver(this, false, i6);
                                this.disposables.TuitionPaymentFragmentspecialinlinedviewModeldefault3(leftRightEndObserver2);
                                autoValue_VideoValidatedEncoderProfilesProxy2.subscribe(leftRightEndObserver2);
                                if (this.error.get() != null) {
                                    createmediamuxer.TuitionPaymentFragmentbindingInflater1();
                                    this.disposables.dispose();
                                    TuitionPaymentFragmentbindingInflater1(derivemediatype);
                                    return;
                                } else {
                                    Iterator<UnicastSubject<TRight>> it3 = this.lefts.values().iterator();
                                    while (it3.hasNext()) {
                                        int i7 = g + 45;
                                        asInterface = i7 % 128;
                                        int i8 = i7 % 2;
                                        it3.next().onNext(objTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                    }
                                }
                            } catch (Throwable th3) {
                                dumpMediaCodecListForFormat.b(th3);
                                ExceptionHelper.TuitionPaymentFragmentbindingInflater1(this.error, th3);
                                createmediamuxer.TuitionPaymentFragmentbindingInflater1();
                                this.disposables.dispose();
                                TuitionPaymentFragmentbindingInflater1(derivemediatype);
                                return;
                            }
                        } else if (num == TuitionPaymentFragmentbindingInflater1) {
                            LeftRightEndObserver leftRightEndObserver3 = (LeftRightEndObserver) objTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            UnicastSubject<TRight> unicastSubjectRemove = this.lefts.remove(Integer.valueOf(leftRightEndObserver3.index));
                            if (this.disposables.TuitionPaymentFragmentspecialinlinedviewModeldefault2(leftRightEndObserver3)) {
                                int i9 = asInterface + 37;
                                g = i9 % 128;
                                if (i9 % 2 != 0) {
                                    leftRightEndObserver3.dispose();
                                    obj.hashCode();
                                    throw null;
                                }
                                leftRightEndObserver3.dispose();
                            }
                            if (unicastSubjectRemove != null) {
                                unicastSubjectRemove.onComplete();
                            }
                        } else if (num == TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                            LeftRightEndObserver leftRightEndObserver4 = (LeftRightEndObserver) objTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            this.rights.remove(Integer.valueOf(leftRightEndObserver4.index));
                            if (this.disposables.TuitionPaymentFragmentspecialinlinedviewModeldefault2(leftRightEndObserver4)) {
                                int i10 = asInterface + 97;
                                g = i10 % 128;
                                if (i10 % 2 != 0) {
                                    leftRightEndObserver4.dispose();
                                    obj.hashCode();
                                    throw null;
                                }
                                leftRightEndObserver4.dispose();
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                createmediamuxer.TuitionPaymentFragmentbindingInflater1();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.TuitionPaymentFragmentbindingInflater1
        public final void b(Throwable th) {
            int i = 2 % 2;
            int i2 = g + 67;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            if (ExceptionHelper.TuitionPaymentFragmentbindingInflater1(this.error, th)) {
                this.active.decrementAndGet();
                TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                return;
            }
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            int i4 = asInterface + 97;
            g = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.TuitionPaymentFragmentbindingInflater1
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(LeftRightObserver leftRightObserver) {
            int i = 2 % 2;
            int i2 = asInterface + 15;
            g = i2 % 128;
            if (i2 % 2 != 0) {
                this.disposables.TuitionPaymentFragmentspecialinlinedviewModeldefault2(leftRightObserver);
                this.active.decrementAndGet();
                TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.disposables.TuitionPaymentFragmentspecialinlinedviewModeldefault2(leftRightObserver);
            this.active.decrementAndGet();
            TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i3 = g + 47;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.TuitionPaymentFragmentbindingInflater1
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean z, Object obj) {
            synchronized (this) {
                this.queue.TuitionPaymentFragmentspecialinlinedviewModeldefault3(z ? TuitionPaymentFragmentspecialinlinedviewModeldefault1 : b, obj);
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.TuitionPaymentFragmentbindingInflater1
        public final void b(boolean z, LeftRightEndObserver leftRightEndObserver) {
            synchronized (this) {
                this.queue.TuitionPaymentFragmentspecialinlinedviewModeldefault3(z ? TuitionPaymentFragmentbindingInflater1 : TuitionPaymentFragmentspecialinlinedviewModeldefault3, leftRightEndObserver);
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }

        /* JADX WARN: Code duplicated, block: B:23:0x01f3  */
        /* JADX WARN: Code duplicated, block: B:26:0x01fd  */
        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.TuitionPaymentFragmentbindingInflater1
        public final void TuitionPaymentFragmentbindingInflater1(Throwable th) throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cAlpha = (char) (31533 - Color.alpha(0));
                int gidForName = Process.getGidForName("") + 922;
                int i2 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 28;
                byte[] bArr = $$a;
                byte b2 = bArr[80];
                Object[] objArr2 = new Object[1];
                a(b2, b2, bArr[37], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAlpha, gidForName, i2, -1048449946, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(new char[]{43700, 43733, 52592, 35687, 40718, 18003, 5016, 38218, 45887, 60243, 14780, 43826, 39187, 61781, 24474, 16691, 59233, 7985, 17892, 26401, 52553, 9517, 27616, 31943, 11171, 19681}, KeyEvent.normalizeMetaState(0) + 1, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new char[]{32449, 32420, 51781, 35920, 23233, 19153, 54866, 39370, 26454, 60520, 64627, 42956, 19820, 63088, 39447, 19862, 13060, 6168, 32826}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 1, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 31533);
                int iRed = Color.red(0) + 921;
                int trimmedLength = TextUtils.getTrimmedLength("") + 28;
                byte b3 = $$a[37];
                Object[] objArr5 = new Object[1];
                a((byte) 52, b3, b3, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cNormalizeMetaState, iRed, trimmedLength, -778300370, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cAlpha2 = (char) (Color.alpha(0) + 31533);
                    int i3 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 920;
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 29;
                    byte b4 = (byte) ($$b & 119);
                    byte[] bArr2 = $$a;
                    Object[] objArr6 = new Object[1];
                    a(b4, bArr2[37], bArr2[80], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cAlpha2, i3, iLastIndexOf, -1142834547, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i4 = ((627490379 + (((~(iIdentityHashCode | 827821429)) | 946258214) * 191)) + (((~((~iIdentityHashCode) | 827821429)) | 136331266) * 191)) - 2014078153;
                int i5 = (i4 << 13) ^ i4;
                int i6 = i5 ^ (i5 >>> 17);
                ((int[]) objArr[0])[0] = i6 ^ (i6 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                c(new char[]{52275, 52306, 49094, 63953, 39511, 28904, 5825, 41969, 54712, 39397, 15589, 40329, 65434, 33760, 23197, 30709, 33246, 28055, 16573, 20886, 43989, 22449, 28321, 19050, 19731, 15956, 37955, 9298, 22282, 6244}, -TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(new char[]{49192, 49227, 58675, 41791, 49380, 3848, 19556, 56337, 55721, 49932, 26182, 57862, 62352, 55566, '2', 2130, 36327, 14203, 6670, 11894, 42967, 3416}, (KeyEvent.getMaxKeyCode() >> 16) + 1, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    int i7 = g + 101;
                    asInterface = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 45 / 0;
                        if (applicationContext instanceof ContextWrapper) {
                            if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                int i9 = g + 101;
                                asInterface = i9 % 128;
                                int i10 = i9 % 2;
                                applicationContext = null;
                            }
                        }
                    } else if (applicationContext instanceof ContextWrapper) {
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            int i11 = g + 101;
                            asInterface = i11 % 128;
                            int i12 = i11 % 2;
                            applicationContext = null;
                        }
                    }
                    applicationContext = applicationContext.getApplicationContext();
                }
                Object[] objArr10 = new Object[1];
                c(new char[]{23787, 23681, 41756, 58628, 62920, 51250, 31052, 6968, 17697, 34101, 21375, 9491, 28484, 40811, 13601, 53112, 4404, 29013, 12083, 59720}, TextUtils.getTrimmedLength("") + 1, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                c(new char[]{37010, 37115, 59672, 44805, 2891, 24069, 34780, 36096, 35074, 53041, 44521, 45875, 41746, 54565, 52098, 22878, 56701, 15183, 53681, 32631}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, objArr11);
                int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                int i13 = asInterface + 105;
                g = i13 % 128;
                int i14 = i13 % 2;
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -2014078153};
                    byte[] bArr3 = $$d;
                    byte b5 = bArr3[51];
                    byte b6 = bArr3[74];
                    Object[] objArr13 = new Object[1];
                    e(b5, b6, b6, objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b7 = bArr3[74];
                    byte b8 = bArr3[51];
                    Object[] objArr14 = new Object[1];
                    e(b7, b8, b8, objArr14);
                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 31533);
                        int i15 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 921;
                        int iRed2 = 28 - Color.red(0);
                        byte b9 = (byte) ($$b & 119);
                        byte[] bArr4 = $$a;
                        Object[] objArr16 = new Object[1];
                        a(b9, bArr4[37], bArr4[80], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(keyRepeatDelay, i15, iRed2, -1142834547, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        c(new char[]{43700, 43733, 52592, 35687, 40718, 18003, 5016, 38218, 45887, 60243, 14780, 43826, 39187, 61781, 24474, 16691, 59233, 7985, 17892, 26401, 52553, 9517, 27616, 31943, 11171, 19681}, -ImageFormat.getBitsPerPixel(0), objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        c(new char[]{32449, 32420, 51781, 35920, 23233, 19153, 54866, 39370, 26454, 60520, 64627, 42956, 19820, 63088, 39447, 19862, 13060, 6168, 32826}, 1 - ((Process.getThreadPriority(0) + 20) >> 6), objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cAxisFromString = (char) (31532 - MotionEvent.axisFromString(""));
                            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 921;
                            int longPressTimeout = 28 - (ViewConfiguration.getLongPressTimeout() >> 16);
                            byte b10 = $$a[37];
                            Object[] objArr19 = new Object[1];
                            a((byte) 52, b10, b10, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cAxisFromString, iKeyCodeFromString, longPressTimeout, -778300370, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cNormalizeMetaState2 = (char) (KeyEvent.normalizeMetaState(0) + 31533);
                            int tapTimeout = 921 - (ViewConfiguration.getTapTimeout() >> 16);
                            int i16 = 29 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            byte[] bArr5 = $$a;
                            byte b11 = bArr5[80];
                            Object[] objArr20 = new Object[1];
                            a(b11, b11, bArr5[37], objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cNormalizeMetaState2, tapTimeout, i16, -1048449946, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        objArr = objArr15;
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            if (((int[]) objArr[3])[0] != ((int[]) objArr[1])[0]) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[4];
                if (strArr == null) {
                    throw null;
                }
                for (String str : strArr) {
                    arrayList.add(str);
                }
                throw null;
            }
            int i17 = g + 39;
            asInterface = i17 % 128;
            int i18 = i17 % 2;
            int i19 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i20 = i19 + 413785123 + (((~(524605130 | iIdentityHashCode2)) | (-1602090972) | (~(1249474513 | iIdentityHashCode2))) * (-744)) + (((~iIdentityHashCode2) | 171988672) * 744) + ((iIdentityHashCode2 | 1602090971) * 744);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr21[0])[0] = i22 ^ (i22 << 5);
            if (ExceptionHelper.TuitionPaymentFragmentbindingInflater1(this.error, th)) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            } else {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            }
        }

        static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 7036660872843602975L;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(short r6, short r7, int r8) {
            /*
                byte[] r0 = io.reactivex.internal.operators.observable.ObservableGroupJoin.GroupJoinDisposable.$$c
                int r7 = r7 + 4
                int r6 = r6 * 4
                int r1 = 1 - r6
                int r8 = r8 * 2
                int r8 = r8 + 107
                byte[] r1 = new byte[r1]
                r2 = 0
                int r6 = 0 - r6
                if (r0 != 0) goto L17
                r3 = r6
                r8 = r7
                r4 = r2
                goto L2d
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r8
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r6) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L25:
                int r7 = r7 + 1
                r3 = r0[r7]
                r5 = r8
                r8 = r7
                r7 = r3
                r3 = r5
            L2d:
                int r7 = -r7
                int r7 = r7 + r3
                r3 = r4
                r5 = r8
                r8 = r7
                r7 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableGroupJoin.GroupJoinDisposable.$$g(short, short, int):java.lang.String");
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class LeftRightObserver extends AtomicReference<BufferProviderState> implements deriveMediaType<Object>, BufferProviderState {
        private static final long serialVersionUID = 1883890389173668373L;
        final boolean isLeft;
        final TuitionPaymentFragmentbindingInflater1 parent;

        LeftRightObserver(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, boolean z) {
            this.parent = tuitionPaymentFragmentbindingInflater1;
            this.isLeft = z;
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return DisposableHelper.TuitionPaymentFragmentbindingInflater1(get());
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            DisposableHelper.TuitionPaymentFragmentbindingInflater1(this, bufferProviderState);
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(Object obj) {
            this.parent.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.isLeft, obj);
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            this.parent.b(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.parent.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class LeftRightEndObserver extends AtomicReference<BufferProviderState> implements deriveMediaType<Object>, BufferProviderState {
        private static final long serialVersionUID = 1883890389173668373L;
        final int index;
        final boolean isLeft;
        final TuitionPaymentFragmentbindingInflater1 parent;

        LeftRightEndObserver(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, boolean z, int i) {
            this.parent = tuitionPaymentFragmentbindingInflater1;
            this.isLeft = z;
            this.index = i;
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return DisposableHelper.TuitionPaymentFragmentbindingInflater1(get());
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            DisposableHelper.TuitionPaymentFragmentbindingInflater1(this, bufferProviderState);
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(Object obj) {
            if (DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this)) {
                this.parent.b(this.isLeft, this);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            this.parent.TuitionPaymentFragmentbindingInflater1(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.parent.b(this.isLeft, this);
        }
    }
}

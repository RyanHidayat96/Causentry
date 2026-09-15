package io.reactivex.internal.operators.mixed;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.AudioSettingsBuilder;
import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.SharedByteBuffer;
import defpackage.VideoEncoderSession1;
import defpackage.VideoEncoderSessionExternalSyntheticLambda6;
import defpackage.VideoOutputSourceState;
import defpackage.VideoRecordEventStart;
import defpackage.createMediaMuxer;
import defpackage.deriveMediaType;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import defpackage.notifyError;
import defpackage.readableMs;
import defpackage.share;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableConcatMapCompletable<T> extends VideoEncoderSession1 {
    private VideoRecordEventStart<T> TuitionPaymentFragmentbindingInflater1;
    private readableMs<? super T, ? extends VideoEncoderSessionExternalSyntheticLambda6> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private ErrorMode TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public ObservableConcatMapCompletable(VideoRecordEventStart<T> videoRecordEventStart, readableMs<? super T, ? extends VideoEncoderSessionExternalSyntheticLambda6> readablems, ErrorMode errorMode, int i) {
        this.TuitionPaymentFragmentbindingInflater1 = videoRecordEventStart;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = readablems;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = errorMode;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i;
    }

    @Override // defpackage.VideoEncoderSession1
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(VideoOutputSourceState videoOutputSourceState) {
        if (notifyError.b(this.TuitionPaymentFragmentbindingInflater1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, videoOutputSourceState)) {
            return;
        }
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new ConcatMapCompletableObserver(videoOutputSourceState, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class ConcatMapCompletableObserver<T> extends AtomicInteger implements deriveMediaType<T>, BufferProviderState {
        private static int $10 = 0;
        private static int $11 = 1;
        private static final long serialVersionUID = 3610901111000061034L;
        volatile boolean active;
        volatile boolean disposed;
        volatile boolean done;
        final VideoOutputSourceState downstream;
        final ErrorMode errorMode;
        final AtomicThrowable errors = new AtomicThrowable();
        final ConcatMapInnerObserver inner = new ConcatMapInnerObserver(this);
        final readableMs<? super T, ? extends VideoEncoderSessionExternalSyntheticLambda6> mapper;
        final int prefetch;
        AudioSettingsBuilder<T> queue;
        BufferProviderState upstream;
        private static final byte[] $$d = {8, -36, 87, -65, -62, -9, -5, 15, -21, -21, -19, 6, -4, 8, -34, -9, -15, -2, 4, -43, -5, -13, 3, 12, -48, -9, -6, -15, -9, 27, -43, -14, 1, -16, -9, -15, 10, 8, -34, -9, -15, -2, 4, -43, -5, -13, 3, 12, -48, -9, -6, -15, -9, 27, -43, -14, 1, -16, -9, -15, 32, -47, -16, 5, -23, -6, 3, -21, 62, -23, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
        private static final int $$e = 14;
        private static final byte[] $$a = {106, -22, 107, 95, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
        private static final int $$b = 226;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        private static int TuitionPaymentFragmentbindingInflater1 = 1;
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -197679928623565331L;

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(short r6, short r7, byte r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 * 14
                int r7 = r7 + 84
                int r6 = r6 + 4
                byte[] r0 = io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable.ConcatMapCompletableObserver.$$a
                int r8 = r8 + 1
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L12
                r3 = r8
                r5 = r2
                goto L26
            L12:
                r3 = r2
            L13:
                int r6 = r6 + 1
                byte r4 = (byte) r7
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r8) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L24:
                r3 = r0[r6]
            L26:
                int r3 = -r3
                int r7 = r7 + r3
                int r7 = r7 + (-10)
                r3 = r5
                goto L13
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable.ConcatMapCompletableObserver.a(short, short, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002c  */
        /* JADX WARN: Code duplicated, block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(byte r7, short r8, int r9, java.lang.Object[] r10) {
            /*
                int r8 = r8 * 66
                int r8 = 69 - r8
                int r7 = r7 * 19
                int r7 = r7 + 65
                int r9 = r9 * 29
                int r9 = r9 + 38
                byte[] r0 = io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable.ConcatMapCompletableObserver.$$d
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L17
                r7 = r8
                r3 = r9
                r4 = r2
                goto L2e
            L17:
                r3 = r2
                r6 = r8
                r8 = r7
                r7 = r6
            L1b:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                int r7 = r7 + 1
                if (r4 != r9) goto L2c
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L2c:
                r3 = r0[r7]
            L2e:
                int r3 = -r3
                int r8 = r8 + r3
                int r8 = r8 + (-10)
                r3 = r4
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable.ConcatMapCompletableObserver.c(byte, short, int, java.lang.Object[]):void");
        }

        private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
            getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            getrealtimecapturelatency.b = 0;
            int i3 = $10 + 29;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            while (getrealtimecapturelatency.b < cArr.length) {
                int i5 = $10 + 97;
                $11 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = getrealtimecapturelatency.b;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (TextUtils.lastIndexOf("", '0') + 19473), Color.red(0) + 2624, View.combineMeasuredStates(0, 0) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() | (TuitionPaymentFragmentspecialinlinedviewModeldefault1 - 9053247990562531611L);
                        Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((KeyEvent.getMaxKeyCode() >> 16) + 39422), View.MeasureSpec.makeMeasureSpec(0, 0) + 481, View.getDefaultSize(0, 0) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    int i7 = getrealtimecapturelatency.b;
                    Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 19472), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2624, TextUtils.getOffsetAfter("", 0) + 13, -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (9053247990562531611L ^ TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((Process.myTid() >> 22) + 39422), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 480, 36 - ExpandableListView.getPackedPositionChild(0L), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
            }
            char[] cArr2 = new char[length];
            getrealtimecapturelatency.b = 0;
            while (getrealtimecapturelatency.b < cArr.length) {
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (Drawable.resolveOpacity(0, 0) + 39422), 481 - View.MeasureSpec.getSize(0), 37 - (ViewConfiguration.getTapTimeout() >> 16), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr2);
        }

        ConcatMapCompletableObserver(VideoOutputSourceState videoOutputSourceState, readableMs<? super T, ? extends VideoEncoderSessionExternalSyntheticLambda6> readablems, ErrorMode errorMode, int i) {
            this.downstream = videoOutputSourceState;
            this.mapper = readablems;
            this.errorMode = errorMode;
            this.prefetch = i;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 75;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            if (!DisposableHelper.b(this.upstream, bufferProviderState)) {
                return;
            }
            int i4 = TuitionPaymentFragmentbindingInflater1 + 53;
            int i5 = i4 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5;
            if (i4 % 2 != 0) {
                this.upstream = bufferProviderState;
                boolean z = bufferProviderState instanceof SharedByteBuffer;
                throw null;
            }
            this.upstream = bufferProviderState;
            if (bufferProviderState instanceof SharedByteBuffer) {
                int i6 = i5 + 51;
                TuitionPaymentFragmentbindingInflater1 = i6 % 128;
                int i7 = i6 % 2;
                SharedByteBuffer sharedByteBuffer = (SharedByteBuffer) bufferProviderState;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = sharedByteBuffer.TuitionPaymentFragmentspecialinlinedviewModeldefault1(3);
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 1) {
                    this.queue = sharedByteBuffer;
                    this.done = true;
                    this.downstream.onSubscribe(this);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    return;
                }
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 2) {
                    int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
                    TuitionPaymentFragmentbindingInflater1 = i8 % 128;
                    int i9 = i8 % 2;
                    this.queue = sharedByteBuffer;
                    this.downstream.onSubscribe(this);
                    return;
                }
            }
            this.queue = new createMediaMuxer(this.prefetch);
            this.downstream.onSubscribe(this);
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 91;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
            int i3 = i2 % 2;
            if (t != null) {
                this.queue.TuitionPaymentFragmentbindingInflater1(t);
                int i4 = TuitionPaymentFragmentbindingInflater1 + 115;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                int i5 = i4 % 2;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }

        static final class ConcatMapInnerObserver extends AtomicReference<BufferProviderState> implements VideoOutputSourceState {
            private static final long serialVersionUID = 5638352172918776687L;
            final ConcatMapCompletableObserver<?> parent;

            ConcatMapInnerObserver(ConcatMapCompletableObserver<?> concatMapCompletableObserver) {
                this.parent = concatMapCompletableObserver;
            }

            @Override // defpackage.VideoOutputSourceState
            public final void onSubscribe(BufferProviderState bufferProviderState) {
                DisposableHelper.b(this, bufferProviderState);
            }

            @Override // defpackage.VideoOutputSourceState
            public final void onError(Throwable th) {
                ConcatMapCompletableObserver<?> concatMapCompletableObserver = this.parent;
                if (ExceptionHelper.TuitionPaymentFragmentbindingInflater1(concatMapCompletableObserver.errors, th)) {
                    if (concatMapCompletableObserver.errorMode == ErrorMode.IMMEDIATE) {
                        concatMapCompletableObserver.disposed = true;
                        concatMapCompletableObserver.upstream.dispose();
                        Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(concatMapCompletableObserver.errors);
                        if (thTuitionPaymentFragmentspecialinlinedviewModeldefault2 != ExceptionHelper.TuitionPaymentFragmentbindingInflater1) {
                            concatMapCompletableObserver.downstream.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        }
                        if (concatMapCompletableObserver.getAndIncrement() == 0) {
                            concatMapCompletableObserver.queue.TuitionPaymentFragmentbindingInflater1();
                            return;
                        }
                        return;
                    }
                    concatMapCompletableObserver.active = false;
                    concatMapCompletableObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    return;
                }
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            }

            @Override // defpackage.VideoOutputSourceState, defpackage.errorToString
            public final void onComplete() {
                ConcatMapCompletableObserver<?> concatMapCompletableObserver = this.parent;
                concatMapCompletableObserver.active = false;
                concatMapCompletableObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            }
        }

        /* JADX WARN: Type inference failed for: r2v21, types: [boolean, int] */
        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) throws Throwable {
            Object[] objArr;
            char c;
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 91;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 31533);
                int iMyPid = (Process.myPid() >> 22) + 921;
                int scrollBarSize = 28 - (ViewConfiguration.getScrollBarSize() >> 8);
                byte[] bArr = $$a;
                Object[] objArr2 = new Object[1];
                a(bArr[37], bArr[7], bArr[80], objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iMyPid, scrollBarSize, -1048449946, false, (String) objArr2[0], null);
            }
            Object obj = null;
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            b(new char[]{23703, 46045, 33304, 37195, 57741, 61638, 50956, 54843, 9905, 13800, 1130, 6994, 27571, 31236, 18756, 22936, 43211, 48928, 36416, 40582, 60913, 64564}, 61253 - ExpandableListView.getPackedPositionGroup(0L), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b(new char[]{23699, 38985, 54577, 4863, 20425, 33932, 49248, 15713, 31243, 47100, 60580, 10643, 25979, 41516, 40729}, 50435 - AndroidCharacter.getMirror('0'), objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char c2 = (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 31532);
                int absoluteGravity = 921 - Gravity.getAbsoluteGravity(0, 0);
                int windowTouchSlop = 28 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                byte[] bArr2 = $$a;
                byte b = bArr2[37];
                byte b2 = bArr2[80];
                Object[] objArr5 = new Object[1];
                a(b, b2, (byte) (b2 | 52), objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c2, absoluteGravity, windowTouchSlop, -778300370, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cRgb = (char) ((-16745683) - Color.rgb(0, 0, 0));
                    int i4 = 921 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int i5 = 29 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    byte b3 = $$a[80];
                    Object[] objArr6 = new Object[1];
                    a((byte) 51, b3, (byte) (b3 | 37), objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cRgb, i4, i5, -1142834547, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i6 = ~iIdentityHashCode;
                int i7 = (((25598825 + (((~((-1133790231) | i6)) | (~((-640289414) | iIdentityHashCode))) * 1900)) + (((~(i6 | 640289413)) | (~(iIdentityHashCode | 1133790230))) * (-950))) + (((~(iIdentityHashCode | 640289413)) | (~(i6 | 1133790230))) * 950)) - 821274475;
                int i8 = (i7 << 13) ^ i7;
                int i9 = i8 ^ (i8 >>> 17);
                ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
                c = 3;
            } else {
                Object[] objArr8 = new Object[1];
                b(new char[]{23703, 22657, 21664, 20687, 19709, 18658, 17412, 16503, 31839, 30823, 29820, 29131, 28059, 27088, 26076, 25064, 7440, 6454, 5440, 4436, 3414, 2707, 1698, 684, 16079, 15075}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1049, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                b(new char[]{23701, 23154, 20838, 18519, 18263, 32301, 29988, 27680, 27406, 25343, 6640, 4292, 4057, 1706, 15788, 13440, 13193, 10905}, KeyEvent.keyCodeFromString("") + 1777, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    int i10 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
                    TuitionPaymentFragmentbindingInflater1 = i10 % 128;
                    int i11 = i10 % 2;
                    if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                        applicationContext = null;
                    } else {
                        applicationContext = applicationContext.getApplicationContext();
                        int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 81;
                        TuitionPaymentFragmentbindingInflater1 = i12 % 128;
                        int i13 = i12 % 2;
                    }
                }
                Object[] objArr10 = new Object[1];
                b(new char[]{23708, 35638, 62402, 55924, 604, 27327, 20817, 47615, 57753, 51313, 12527, 8036, 18185, 44975, 38493, 65268}, 55201 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                b(new char[]{23711, 29621, 733, 53741, 57374, 46940, 18024, 5790, 9606, 62664, 35587, 23091, 26977, 14434, 51376, 40922}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12071, objArr11);
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, -821274475};
                    byte[] bArr3 = $$d;
                    byte b4 = bArr3[94];
                    byte b5 = bArr3[32];
                    Object[] objArr13 = new Object[1];
                    c(b4, b5, b5, objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b6 = bArr3[32];
                    byte b7 = bArr3[94];
                    Object[] objArr14 = new Object[1];
                    c(b6, b7, b7, objArr14);
                    objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char c3 = (char) (31533 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                        int iAxisFromString = 920 - MotionEvent.axisFromString("");
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 29;
                        byte b8 = $$a[80];
                        Object[] objArr15 = new Object[1];
                        a((byte) 51, b8, (byte) (b8 | 37), objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c3, iAxisFromString, iIndexOf, -1142834547, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        b(new char[]{23703, 46045, 33304, 37195, 57741, 61638, 50956, 54843, 9905, 13800, 1130, 6994, 27571, 31236, 18756, 22936, 43211, 48928, 36416, 40582, 60913, 64564}, 61254 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        b(new char[]{23699, 38985, 54577, 4863, 20425, 33932, 49248, 15713, 31243, 47100, 60580, 10643, 25979, 41516, 40729}, Color.blue(0) + 50387, objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cMyTid = (char) ((Process.myTid() >> 22) + 31533);
                            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 921;
                            int mode = 28 - View.MeasureSpec.getMode(0);
                            byte[] bArr4 = $$a;
                            byte b9 = bArr4[37];
                            byte b10 = bArr4[80];
                            Object[] objArr18 = new Object[1];
                            a(b9, b10, (byte) (b10 | 52), objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cMyTid, touchSlop, mode, -778300370, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 31533);
                            int iRgb = (-16776295) - Color.rgb(0, 0, 0);
                            int gidForName = Process.getGidForName("") + 29;
                            byte[] bArr5 = $$a;
                            Object[] objArr19 = new Object[1];
                            a(bArr5[37], bArr5[7], bArr5[80], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maximumDrawingCacheSize, iRgb, gidForName, -1048449946, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        int i14 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 97;
                        TuitionPaymentFragmentbindingInflater1 = i14 % 128;
                        if (i14 % 2 == 0) {
                            c = 3;
                            int i15 = 4 / 3;
                        } else {
                            c = 3;
                        }
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
            if (((int[]) objArr[c])[0] != ((int[]) objArr[1])[0]) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[4];
                if (strArr == null) {
                    throw null;
                }
                for (String str : strArr) {
                    int i16 = TuitionPaymentFragmentbindingInflater1 + 125;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16 % 128;
                    int i17 = i16 % 2;
                    arrayList.add(str);
                }
                throw null;
            }
            int i18 = TuitionPaymentFragmentbindingInflater1 + 105;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 % 128;
            int i19 = i18 % 2;
            int i20 = ((int[]) objArr[0])[0];
            Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i21 = i20 + ((~((-344981642) | iIdentityHashCode2)) * 521) + 1147905832 + (((~((~iIdentityHashCode2) | (-344981642))) | 18942994) * 521);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr20[0])[0] = i23 ^ (i23 << 5);
            int i24 = TuitionPaymentFragmentbindingInflater1 + 85;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i24 % 128;
            if (i24 % 2 != 0) {
                ExceptionHelper.TuitionPaymentFragmentbindingInflater1(this.errors, th);
                obj.hashCode();
                throw null;
            }
            if (!ExceptionHelper.TuitionPaymentFragmentbindingInflater1(this.errors, th)) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
                return;
            }
            if (this.errorMode != ErrorMode.IMMEDIATE) {
                this.done = true;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                return;
            }
            int i25 = ((int[]) objArr20[0])[0];
            int i26 = i25 * i25;
            int i27 = -(876689716 * i25);
            int i28 = (i26 & i27) + (i26 | i27);
            int i29 = -(i25 * (-397627910));
            int i30 = ((i28 & i29) + (i29 | i28)) - 1571028207;
            int i31 = ((i30 >> 17) - 65535) / 32768;
            int i32 = ((i31 | 1) << 1) - (i31 ^ 1);
            int i33 = (i30 & i32) + (i32 | i30);
            int i34 = i30 >> 20;
            int i35 = (((i34 | (-8191)) << 1) - (i34 ^ (-8191))) / 4096;
            int i36 = (-(i33 ^ (((i35 | 1) << 1) - (i35 ^ 1)))) + 8;
            int i37 = i36 >> 29;
            this.disposed = 12792 / ((i36 & (-((((i37 & (-15)) + (i37 | (-15))) / 8) + 2))) * 1599);
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.inner);
            Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.errors);
            if (thTuitionPaymentFragmentspecialinlinedviewModeldefault2 != ExceptionHelper.TuitionPaymentFragmentbindingInflater1) {
                this.downstream.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
            if (getAndIncrement() == 0) {
                int i38 = TuitionPaymentFragmentbindingInflater1 + 49;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i38 % 128;
                int i39 = i38 % 2;
                this.queue.TuitionPaymentFragmentbindingInflater1();
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 111;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            this.done = true;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int i4 = TuitionPaymentFragmentbindingInflater1 + 57;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            int i = 2 % 2;
            this.disposed = true;
            this.upstream.dispose();
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.inner);
            if (getAndIncrement() == 0) {
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 87;
                TuitionPaymentFragmentbindingInflater1 = i2 % 128;
                int i3 = i2 % 2;
                this.queue.TuitionPaymentFragmentbindingInflater1();
                int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 23;
                TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 15;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            boolean z = this.disposed;
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            return z;
        }

        final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            AtomicThrowable atomicThrowable;
            ErrorMode errorMode;
            boolean z;
            int i = 2 % 2;
            if (getAndIncrement() == 0) {
                int i2 = TuitionPaymentFragmentbindingInflater1 + 93;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                if (i2 % 2 != 0) {
                    atomicThrowable = this.errors;
                    errorMode = this.errorMode;
                    int i3 = 61 / 0;
                } else {
                    atomicThrowable = this.errors;
                    errorMode = this.errorMode;
                }
                do {
                    VideoEncoderSessionExternalSyntheticLambda6 videoEncoderSessionExternalSyntheticLambda6 = null;
                    if (this.disposed) {
                        int i4 = TuitionPaymentFragmentbindingInflater1 + 27;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i4 % 128;
                        if (i4 % 2 == 0) {
                            this.queue.TuitionPaymentFragmentbindingInflater1();
                            return;
                        } else {
                            this.queue.TuitionPaymentFragmentbindingInflater1();
                            videoEncoderSessionExternalSyntheticLambda6.hashCode();
                            throw null;
                        }
                    }
                    if (!this.active) {
                        if (errorMode == ErrorMode.BOUNDARY && atomicThrowable.get() != null) {
                            int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 29;
                            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
                            if (i5 % 2 == 0) {
                                this.disposed = false;
                                this.queue.TuitionPaymentFragmentbindingInflater1();
                                this.downstream.onError(ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(atomicThrowable));
                                return;
                            } else {
                                this.disposed = true;
                                this.queue.TuitionPaymentFragmentbindingInflater1();
                                this.downstream.onError(ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(atomicThrowable));
                                return;
                            }
                        }
                        boolean z2 = this.done;
                        try {
                            T tTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.queue.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            if (tTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                                int i6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 3;
                                TuitionPaymentFragmentbindingInflater1 = i6 % 128;
                                videoEncoderSessionExternalSyntheticLambda6 = i6 % 2 == 0 ? (VideoEncoderSessionExternalSyntheticLambda6) share.b(this.mapper.apply(tTuitionPaymentFragmentspecialinlinedviewModeldefault2), "The mapper returned a null CompletableSource") : (VideoEncoderSessionExternalSyntheticLambda6) share.b(this.mapper.apply(tTuitionPaymentFragmentspecialinlinedviewModeldefault2), "The mapper returned a null CompletableSource");
                                z = false;
                            } else {
                                z = true;
                            }
                            if (z2 && z) {
                                this.disposed = true;
                                Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(atomicThrowable);
                                if (thTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                                    this.downstream.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                    return;
                                } else {
                                    this.downstream.onComplete();
                                    return;
                                }
                            }
                            if (!z) {
                                this.active = true;
                                videoEncoderSessionExternalSyntheticLambda6.b(this.inner);
                            }
                        } catch (Throwable th) {
                            dumpMediaCodecListForFormat.b(th);
                            this.disposed = true;
                            this.queue.TuitionPaymentFragmentbindingInflater1();
                            this.upstream.dispose();
                            ExceptionHelper.TuitionPaymentFragmentbindingInflater1(atomicThrowable, th);
                            this.downstream.onError(ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(atomicThrowable));
                            return;
                        }
                    }
                } while (decrementAndGet() != 0);
            }
        }
    }
}

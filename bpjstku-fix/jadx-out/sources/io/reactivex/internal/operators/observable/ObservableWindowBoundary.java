package io.reactivex.internal.operators.observable;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.internal.bind.TypeAdapters;
import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.VideoRecordEventStart;
import defpackage.deriveMediaType;
import defpackage.initSession;
import defpackage.isProblematicMimeType;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import defpackage.notifySuspended;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.subjects.UnicastSubject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.CharCompanionObject;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableWindowBoundary<T, B> extends notifySuspended<T, VideoRecordEventStart<T>> {
    private AutoValue_VideoValidatedEncoderProfilesProxy<B> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public ObservableWindowBoundary(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<B> autoValue_VideoValidatedEncoderProfilesProxy2, int i) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = autoValue_VideoValidatedEncoderProfilesProxy2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super VideoRecordEventStart<T>> derivemediatype) {
        WindowBoundaryMainObserver windowBoundaryMainObserver = new WindowBoundaryMainObserver(derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        derivemediatype.onSubscribe(windowBoundaryMainObserver);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.subscribe(windowBoundaryMainObserver.boundaryObserver);
        this.TuitionPaymentFragmentbindingInflater1.subscribe(windowBoundaryMainObserver);
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class WindowBoundaryMainObserver<T, B> extends AtomicInteger implements deriveMediaType<T>, BufferProviderState, Runnable {
        static final Object b = new Object();
        private static final long serialVersionUID = 2233020065421370272L;
        final int capacityHint;
        volatile boolean done;
        final deriveMediaType<? super VideoRecordEventStart<T>> downstream;
        UnicastSubject<T> window;
        final TuitionPaymentFragmentbindingInflater1<T, B> boundaryObserver = new TuitionPaymentFragmentbindingInflater1<>(this);
        final AtomicReference<BufferProviderState> upstream = new AtomicReference<>();
        final AtomicInteger windows = new AtomicInteger(1);
        final MpscLinkedQueue<Object> queue = new MpscLinkedQueue<>();
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicBoolean stopWindows = new AtomicBoolean();

        WindowBoundaryMainObserver(deriveMediaType<? super VideoRecordEventStart<T>> derivemediatype, int i) {
            this.downstream = derivemediatype;
            this.capacityHint = i;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.TuitionPaymentFragmentbindingInflater1(this.upstream, bufferProviderState)) {
                this.queue.TuitionPaymentFragmentbindingInflater1(b);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            this.queue.TuitionPaymentFragmentbindingInflater1(t);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            this.boundaryObserver.dispose();
            if (ExceptionHelper.TuitionPaymentFragmentbindingInflater1(this.errors, th)) {
                this.done = true;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            } else {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.boundaryObserver.dispose();
            this.done = true;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            if (this.stopWindows.compareAndSet(false, true)) {
                this.boundaryObserver.dispose();
                if (this.windows.decrementAndGet() == 0) {
                    DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.upstream);
                }
            }
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.stopWindows.get();
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.windows.decrementAndGet() == 0) {
                DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.upstream);
            }
        }

        final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            if (getAndIncrement() == 0) {
                deriveMediaType<? super VideoRecordEventStart<T>> derivemediatype = this.downstream;
                MpscLinkedQueue<Object> mpscLinkedQueue = this.queue;
                AtomicThrowable atomicThrowable = this.errors;
                int iAddAndGet = 1;
                while (this.windows.get() != 0) {
                    UnicastSubject<T> unicastSubject = this.window;
                    boolean z = this.done;
                    if (z && atomicThrowable.get() != null) {
                        mpscLinkedQueue.TuitionPaymentFragmentbindingInflater1();
                        Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(atomicThrowable);
                        if (unicastSubject != null) {
                            this.window = null;
                            unicastSubject.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        }
                        derivemediatype.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        return;
                    }
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = mpscLinkedQueue.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    boolean z2 = objTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null;
                    if (z && z2) {
                        Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(atomicThrowable);
                        if (thTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            if (unicastSubject != null) {
                                this.window = null;
                                unicastSubject.onComplete();
                            }
                            derivemediatype.onComplete();
                            return;
                        }
                        if (unicastSubject != null) {
                            this.window = null;
                            unicastSubject.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        }
                        derivemediatype.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        return;
                    }
                    if (!z2) {
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault2 != b) {
                            unicastSubject.onNext((T) objTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        } else {
                            if (unicastSubject != null) {
                                this.window = null;
                                unicastSubject.onComplete();
                            }
                            if (!this.stopWindows.get()) {
                                UnicastSubject<T> unicastSubjectTuitionPaymentFragmentspecialinlinedviewModeldefault2 = UnicastSubject.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.capacityHint, this);
                                this.window = unicastSubjectTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                this.windows.getAndIncrement();
                                derivemediatype.onNext(unicastSubjectTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            }
                        }
                    } else {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                }
                mpscLinkedQueue.TuitionPaymentFragmentbindingInflater1();
                this.window = null;
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class TuitionPaymentFragmentbindingInflater1<T, B> extends isProblematicMimeType<B> {
        private WindowBoundaryMainObserver<T, B> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private boolean b;
        private static final byte[] $$c = {87, 51, -85, 78};
        private static final int $$f = 146;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {39, 27, 2, 54, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -54, -3, -3, 72, -56, -2, -3, 18, -10, 7, 16, -8, 65, -60, 4, 4, 5, -8, 24, -1, -9, 5, 3, 1, 4, 67, -73, 3, 17, 3, -30, 15, -8, 14, -3, 4, 33, -14, -21, 15, 11, -6, -3, 49, -41, 20, -3, -3, 11, -6, -3, 4, 6, 14, 5, -3, 11, -8, 6, -2, 5, 6, -2, 12, 4, -15, 16, 7, -15, 45, -31, 14, 2, -4, 11, 2, 2, 8, -17, 12, -5, 70};
        private static final int $$e = 99;
        private static final byte[] $$a = {117, 57, 101, -72, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
        private static final int $$b = 187;
        private static int TuitionPaymentFragmentbindingInflater1 = 0;
        private static int d = 1;
        private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {49585, 52888, 57336, 60624, 64807, 35335, 39760, 44020, 47235, 18921, 22210, 26374, 29821, 1360, 5552, 8900, 13299, 49209, 53522, 56950, 61261, 65462, 36064, 45563, 48863, 44964, 40111, 36212, 64082, 60180, CharCompanionObject.MAX_HIGH_SURROGATE, 51407, 14763, 9876, 5975, 1083, 29980, 26049, 21192, 17306, 45173, 45565, 48852, 44980, 40092, 36203, 64075, 60188, 56248, 51407, 14757, 9870, 5962, 1073, 29980, 26108, 21128, 17292, 45175, 41246, 44559, 40724, 36850, 64692, 60831, 55919, 52043, 14388, 10487, 6619, 1724, 30625, 25704, 21818, 16917, 40837, 37033, 33230, 45814, 41736, 35156, 34360, 38723, 42090, 46540, 49836, 54257, 58136, 61503, 258, 7787, 12213, 15576, 19953, 23874, 27173, 31614, 34975, 39330, 38606, 42980, 46852, 50269, 54653, 57998, 62435, 213, 4122, 45485, 31455, 30180, 25807, 22459, 18000, 12657, 8252, 4288, 1018, 62106, 60851, 56419, 52992};
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 8928576767223316154L;

        private static void a(byte b, int i, short s, Object[] objArr) {
            byte[] bArr = $$a;
            int i2 = 103 - b;
            int i3 = 108 - (i * 52);
            byte[] bArr2 = new byte[s + 1];
            int i4 = -1;
            if (bArr == null) {
                i3++;
                i2 = (i2 + (-i3)) - 11;
            }
            while (true) {
                i4++;
                bArr2[i4] = (byte) i2;
                if (i4 == s) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    byte b2 = bArr[i3];
                    i3++;
                    i2 = (i2 + (-b2)) - 11;
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(short r6, byte r7, short r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = io.reactivex.internal.operators.observable.ObservableWindowBoundary.TuitionPaymentFragmentbindingInflater1.$$d
                int r7 = r7 * 4
                int r1 = r7 + 49
                int r8 = r8 * 15
                int r8 = 99 - r8
                int r6 = r6 + 4
                byte[] r1 = new byte[r1]
                int r7 = r7 + 48
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r8
                r4 = r2
                r8 = r6
                goto L30
            L17:
                r3 = r2
            L18:
                int r6 = r6 + 1
                byte r4 = (byte) r8
                r1[r3] = r4
                if (r3 != r7) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L27:
                int r3 = r3 + 1
                r4 = r0[r6]
                r5 = r8
                r8 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L30:
                int r6 = -r6
                int r3 = r3 + r6
                int r6 = r3 + 3
                r3 = r4
                r5 = r8
                r8 = r6
                r6 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableWindowBoundary.TuitionPaymentFragmentbindingInflater1.c(short, byte, short, java.lang.Object[]):void");
        }

        private static void e(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
            long[] jArr = new long[i2];
            lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                int i4 = $11 + 69;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    try {
                        Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1[i % i5])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - MotionEvent.axisFromString("")), 2187 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 40 - View.MeasureSpec.getSize(0), 841711447, false, $$g(b, b2, b2), new Class[]{Integer.TYPE});
                        }
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char cIndexOf = (char) (33017 - TextUtils.indexOf("", "", 0));
                            int iLastIndexOf = 3010 - TextUtils.lastIndexOf("", '0', 0, 0);
                            int i6 = 27 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                            byte b3 = (byte) ($$f & 15);
                            byte b4 = (byte) (b3 - 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, iLastIndexOf, i6, 321985076, false, $$g(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                        Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b5 = (byte) 1;
                            byte b6 = (byte) (b5 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 36504), 3376 - (ViewConfiguration.getTapTimeout() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 17, -968507904, false, $$g(b5, b6, b6), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    int i7 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    Object[] objArr5 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1[i + i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getTouchSlop() >> 8), ImageFormat.getBitsPerPixel(0) + 2188, 41 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 841711447, false, $$g(b7, b8, b8), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i7), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), Integer.valueOf(c)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char scrollDefaultDelay = (char) (33017 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 3012;
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 26;
                        byte b9 = (byte) ($$f & 15);
                        byte b10 = (byte) (b9 - 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(scrollDefaultDelay, iIndexOf, keyRepeatTimeout, 321985076, false, $$g(b9, b10, b10), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                    Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        byte b11 = (byte) 1;
                        byte b12 = (byte) (b11 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (36505 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), MotionEvent.axisFromString("") + 3377, 17 - Color.blue(0), -968507904, false, $$g(b11, b12, b12), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
                }
            }
            char[] cArr = new char[i2];
            lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                    byte b13 = (byte) 1;
                    byte b14 = (byte) (b13 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) (36505 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), Color.green(0) + 3376, 17 - Color.green(0), -968507904, false, $$g(b13, b14, b14), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
                int i8 = $10 + 67;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 5 % 3;
                }
            }
            objArr[0] = new String(cArr);
        }

        TuitionPaymentFragmentbindingInflater1(WindowBoundaryMainObserver<T, B> windowBoundaryMainObserver) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = windowBoundaryMainObserver;
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(B b) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1;
            int i3 = i2 + 95;
            d = i3 % 128;
            int i4 = i3 % 2;
            if (this.b) {
                int i5 = i2 + 49;
                d = i5 % 128;
                int i6 = i5 % 2;
            } else {
                WindowBoundaryMainObserver<T, B> windowBoundaryMainObserver = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                windowBoundaryMainObserver.queue.TuitionPaymentFragmentbindingInflater1(WindowBoundaryMainObserver.b);
                windowBoundaryMainObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            int i = 2 % 2;
            if (this.b) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
                int i2 = TuitionPaymentFragmentbindingInflater1 + 13;
                d = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 70 / 0;
                    return;
                }
                return;
            }
            this.b = true;
            WindowBoundaryMainObserver<T, B> windowBoundaryMainObserver = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(windowBoundaryMainObserver.upstream);
            if (!ExceptionHelper.TuitionPaymentFragmentbindingInflater1(windowBoundaryMainObserver.errors, th)) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
                return;
            }
            int i4 = d + 63;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            if (i4 % 2 != 0) {
                windowBoundaryMainObserver.done = true;
                windowBoundaryMainObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            } else {
                windowBoundaryMainObserver.done = true;
                windowBoundaryMainObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
        }

        /* JADX WARN: Code duplicated, block: B:28:0x01d5  */
        /* JADX WARN: Type inference failed for: r1v58, types: [boolean, int] */
        @Override // defpackage.deriveMediaType
        public final void onComplete() throws Throwable {
            Object[] objArr;
            Object[] objArr2;
            int i;
            int i2 = 2 % 2;
            int i3 = d + 77;
            TuitionPaymentFragmentbindingInflater1 = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (this.b) {
                return;
            }
            this.b = true;
            WindowBoundaryMainObserver<T, B> windowBoundaryMainObserver = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char modifierMetaStateMask = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 876;
                int i4 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 10;
                byte[] bArr = $$a;
                Object[] objArr3 = new Object[1];
                a((byte) (bArr[19] - 1), bArr[40], bArr[7], objArr3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(modifierMetaStateMask, absoluteGravity, i4, 252381699, false, (String) objArr3[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            long jLongValue = ((Long) Class.forName("android.os.SystemClock").getDeclaredMethod("elapsedRealtime", new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                int packedPositionGroup = 876 - ExpandableListView.getPackedPositionGroup(0L);
                int defaultSize = 10 - View.getDefaultSize(0, 0);
                byte[] bArr2 = $$a;
                Object[] objArr4 = new Object[1];
                a(bArr2[10], bArr2[40], (byte) 52, objArr4);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, packedPositionGroup, defaultSize, 2009631821, false, (String) objArr4[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                int i5 = d + 25;
                TuitionPaymentFragmentbindingInflater1 = i5 % 128;
                int i6 = i5 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 876;
                    int iIndexOf = 10 - TextUtils.indexOf("", "", 0, 0);
                    byte[] bArr3 = $$a;
                    byte b = bArr3[7];
                    Object[] objArr5 = new Object[1];
                    a(b, bArr3[5], b, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(pressedStateDuration, scrollBarFadeDuration, iIndexOf, 256017550, false, (String) objArr5[0], null);
                }
                Object[] objArr6 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{((int[]) objArr6[0])[0]}, new int[1], new int[]{((int[]) objArr6[2])[0]}, (String[]) objArr6[3]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i7 = ~((-990058759) | (~iIdentityHashCode));
                int i8 = (((-1000282936) | i7 | (~(990058758 | iIdentityHashCode))) * (-338)) + 1247094244 + (((~(iIdentityHashCode | (-10224178))) | i7) * 338) + 904012679;
                int i9 = (i8 << 13) ^ i8;
                int i10 = i9 ^ (i9 >>> 17);
                ((int[]) objArr[1])[0] = i10 ^ (i10 << 5);
            } else {
                Context applicationContext = (Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    int i11 = d + 73;
                    int i12 = i11 % 128;
                    TuitionPaymentFragmentbindingInflater1 = i12;
                    int i13 = i11 % 2;
                    if (applicationContext instanceof ContextWrapper) {
                        int i14 = i12 + 125;
                        d = i14 % 128;
                        int i15 = i14 % 2;
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                        } else {
                            applicationContext = null;
                        }
                    } else {
                        applicationContext = applicationContext.getApplicationContext();
                    }
                }
                int iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, windowBoundaryMainObserver)).intValue();
                int i16 = TuitionPaymentFragmentbindingInflater1 + 65;
                d = i16 % 128;
                if (i16 % 2 == 0) {
                    int i17 = 3 / 5;
                }
                try {
                    Object[] objArr7 = {applicationContext, Integer.valueOf(iIntValue), 904012679};
                    byte[] bArr4 = $$d;
                    byte b2 = bArr4[41];
                    byte b3 = (byte) (b2 + 1);
                    Object[] objArr8 = new Object[1];
                    c(b2, b3, b3, objArr8);
                    Class<?> cls = Class.forName((String) objArr8[0]);
                    byte b4 = bArr4[45];
                    Object[] objArr9 = new Object[1];
                    c((byte) 47, b4, b4, objArr9);
                    Object[] objArr10 = (Object[]) cls.getMethod((String) objArr9[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr7);
                    if (applicationContext != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char cIndexOf2 = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                            int i18 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 875;
                            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 10;
                            byte[] bArr5 = $$a;
                            byte b5 = bArr5[7];
                            Object[] objArr11 = new Object[1];
                            a(b5, bArr5[5], b5, objArr11);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf2, i18, maximumDrawingCacheSize, 256017550, false, (String) objArr11[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr10);
                        try {
                            long jLongValue2 = ((Long) Class.forName("android.os.SystemClock").getDeclaredMethod("elapsedRealtime", new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char c = (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                                int iResolveOpacity = 876 - Drawable.resolveOpacity(0, 0);
                                int iIndexOf2 = TextUtils.indexOf("", "") + 10;
                                byte[] bArr6 = $$a;
                                Object[] objArr12 = new Object[1];
                                a(bArr6[10], bArr6[40], (byte) 52, objArr12);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, iResolveOpacity, iIndexOf2, 2009631821, false, (String) objArr12[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char absoluteGravity2 = (char) Gravity.getAbsoluteGravity(0, 0);
                                int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 877;
                                int mode = 10 - View.MeasureSpec.getMode(0);
                                byte[] bArr7 = $$a;
                                Object[] objArr13 = new Object[1];
                                a((byte) (bArr7[19] - 1), bArr7[40], bArr7[7], objArr13);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(absoluteGravity2, bitsPerPixel, mode, 252381699, false, (String) objArr13[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            int i19 = d + 55;
                            TuitionPaymentFragmentbindingInflater1 = i19 % 128;
                            int i20 = i19 % 2;
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                    objArr = objArr10;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i21 = ((int[]) objArr[2])[0];
            int i22 = ((int[]) objArr[0])[0];
            if (i22 == i21) {
                int i23 = TuitionPaymentFragmentbindingInflater1 + 47;
                d = i23 % 128;
                int i24 = i23 % 2;
                int i25 = ((int[]) objArr[1])[0];
                objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i26 = (-992041384) + (((~((-464236074) | iIdentityHashCode2)) | 423925844) * (-318));
                int i27 = ~(423925844 | iIdentityHashCode2);
                int i28 = ~iIdentityHashCode2;
                int i29 = i25 + i26 + ((i27 | (~((-4460629) | i28))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(iIdentityHashCode2 | (-4460629))) | (~(468696701 | i28))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
                int i30 = (i29 << 13) ^ i29;
                int i31 = i30 ^ (i30 >>> 17);
                ((int[]) objArr2[1])[0] = i31 ^ (i31 << 5);
                i = 1;
            } else {
                Toast.makeText((Context) null, i22 / (((i22 - 1) * i22) % 2), 0).show();
                int i32 = ((int[]) objArr[1])[0];
                objArr2 = new Object[]{new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int iMyTid = Process.myTid();
                int i33 = i32 + 826504615 + (((~(iMyTid | (-23527991))) | (-63838220)) * (-465)) + (((-23527991) | (~((-63838220) | iMyTid))) * 930) + ((iMyTid | (-21364739)) * 465);
                int i34 = (i33 << 13) ^ i33;
                int i35 = i34 ^ (i34 >>> 17);
                i = 1;
                ((int[]) objArr2[1])[0] = i35 ^ (i35 << 5);
            }
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(windowBoundaryMainObserver.upstream);
            int i36 = ((int[]) objArr2[i])[0];
            int i37 = i36 * i36;
            int i38 = -(237143677 * i36);
            int i39 = ((i37 | i38) << i) - (i37 ^ i38);
            int i40 = -(i36 * 1563828831);
            int i41 = ((i39 & i40) + (i40 | i39)) - (-464019268);
            int i42 = i41 >> 15;
            int i43 = (((-262143) ^ i42) + ((i42 & (-262143)) << 1)) / 131072;
            int i44 = (i41 - (~((i43 ^ 1) + ((i43 & 1) << 1)))) - 1;
            int i45 = i41 >> 23;
            int i46 = -(i44 ^ (((((i45 | (-1023)) << 1) - (i45 ^ (-1023))) / 512) + 1));
            int i47 = (i46 ^ 2) + ((i46 & 2) << 1);
            int i48 = i47 >> 28;
            int i49 = (((i48 | (-31)) << 1) - (i48 ^ (-31))) / 16;
            int i50 = (i49 ^ 1) + ((i49 & 1) << 1);
            windowBoundaryMainObserver.done = 2358 / (((-((i50 ^ 1) + ((i50 & 1) << 1))) & i47) * 1179);
            windowBoundaryMainObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }

        /* JADX WARN: Code duplicated, block: B:116:0x0340 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:37:0x0324  */
        /* JADX WARN: Code duplicated, block: B:39:0x032a  */
        /* JADX WARN: Code duplicated, block: B:41:0x0339  */
        /* JADX WARN: Code duplicated, block: B:42:0x033c  */
        /* JADX WARN: Code duplicated, block: B:46:0x0346 A[Catch: Exception -> 0x06a2, TRY_LEAVE, TryCatch #4 {Exception -> 0x06a2, blocks: (B:44:0x0340, B:46:0x0346, B:50:0x03f3, B:52:0x041f, B:58:0x04fb, B:60:0x0549, B:62:0x054f, B:63:0x0550, B:51:0x0404, B:64:0x0551, B:67:0x0577, B:69:0x05aa, B:71:0x0601, B:76:0x0682, B:80:0x069a, B:82:0x06a0, B:83:0x06a1, B:68:0x0591, B:53:0x045b, B:55:0x0468, B:56:0x04ac, B:72:0x0627, B:74:0x0634, B:75:0x067b), top: B:116:0x0340, inners: #2, #3 }] */
        /* JADX WARN: Code duplicated, block: B:49:0x03ec  */
        /* JADX WARN: Code duplicated, block: B:51:0x0404 A[Catch: Exception -> 0x06a2, TryCatch #4 {Exception -> 0x06a2, blocks: (B:44:0x0340, B:46:0x0346, B:50:0x03f3, B:52:0x041f, B:58:0x04fb, B:60:0x0549, B:62:0x054f, B:63:0x0550, B:51:0x0404, B:64:0x0551, B:67:0x0577, B:69:0x05aa, B:71:0x0601, B:76:0x0682, B:80:0x069a, B:82:0x06a0, B:83:0x06a1, B:68:0x0591, B:53:0x045b, B:55:0x0468, B:56:0x04ac, B:72:0x0627, B:74:0x0634, B:75:0x067b), top: B:116:0x0340, inners: #2, #3 }] */
        /* JADX WARN: Code duplicated, block: B:55:0x0468 A[Catch: all -> 0x0548, TryCatch #2 {all -> 0x0548, blocks: (B:53:0x045b, B:55:0x0468, B:56:0x04ac), top: B:112:0x045b, outer: #4 }] */
        /* JADX WARN: Code duplicated, block: B:64:0x0551 A[Catch: Exception -> 0x06a2, TRY_LEAVE, TryCatch #4 {Exception -> 0x06a2, blocks: (B:44:0x0340, B:46:0x0346, B:50:0x03f3, B:52:0x041f, B:58:0x04fb, B:60:0x0549, B:62:0x054f, B:63:0x0550, B:51:0x0404, B:64:0x0551, B:67:0x0577, B:69:0x05aa, B:71:0x0601, B:76:0x0682, B:80:0x069a, B:82:0x06a0, B:83:0x06a1, B:68:0x0591, B:53:0x045b, B:55:0x0468, B:56:0x04ac, B:72:0x0627, B:74:0x0634, B:75:0x067b), top: B:116:0x0340, inners: #2, #3 }] */
        /* JADX WARN: Code duplicated, block: B:67:0x0577 A[Catch: Exception -> 0x06a2, TRY_ENTER, TryCatch #4 {Exception -> 0x06a2, blocks: (B:44:0x0340, B:46:0x0346, B:50:0x03f3, B:52:0x041f, B:58:0x04fb, B:60:0x0549, B:62:0x054f, B:63:0x0550, B:51:0x0404, B:64:0x0551, B:67:0x0577, B:69:0x05aa, B:71:0x0601, B:76:0x0682, B:80:0x069a, B:82:0x06a0, B:83:0x06a1, B:68:0x0591, B:53:0x045b, B:55:0x0468, B:56:0x04ac, B:72:0x0627, B:74:0x0634, B:75:0x067b), top: B:116:0x0340, inners: #2, #3 }] */
        /* JADX WARN: Code duplicated, block: B:68:0x0591 A[Catch: Exception -> 0x06a2, TryCatch #4 {Exception -> 0x06a2, blocks: (B:44:0x0340, B:46:0x0346, B:50:0x03f3, B:52:0x041f, B:58:0x04fb, B:60:0x0549, B:62:0x054f, B:63:0x0550, B:51:0x0404, B:64:0x0551, B:67:0x0577, B:69:0x05aa, B:71:0x0601, B:76:0x0682, B:80:0x069a, B:82:0x06a0, B:83:0x06a1, B:68:0x0591, B:53:0x045b, B:55:0x0468, B:56:0x04ac, B:72:0x0627, B:74:0x0634, B:75:0x067b), top: B:116:0x0340, inners: #2, #3 }] */
        /* JADX WARN: Code duplicated, block: B:74:0x0634 A[Catch: all -> 0x0699, TryCatch #3 {all -> 0x0699, blocks: (B:72:0x0627, B:74:0x0634, B:75:0x067b), top: B:114:0x0627, outer: #4 }] */
        /* JADX WARN: Code duplicated, block: B:78:0x0688  */
        /* JADX WARN: Code duplicated, block: B:84:0x06a2  */
        /* JADX WARN: Code duplicated, block: B:87:0x06d7  */
        /* JADX WARN: Code duplicated, block: B:88:0x06e4  */
        public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, int i, int i2, int i3) throws Throwable {
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            String str;
            int i15;
            int i16;
            Object[] objArr;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i17;
            int i18;
            int i19;
            int i20;
            int i21;
            int i22;
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i23;
            int i24;
            int i25;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            int i26 = 2 % 2;
            int i27 = d + 103;
            int i28 = i27 % 128;
            TuitionPaymentFragmentbindingInflater1 = i28;
            int i29 = i27 % 2;
            int i30 = (i28 & 39) + (i28 | 39);
            d = i30 % 128;
            int i31 = i30 % 2;
            Object obj = null;
            if (context != null) {
                int i32 = (i28 ^ 109) + ((i28 & 109) << 1);
                d = i32 % 128;
                if (i32 % 2 == 0) {
                    int i33 = 37 / 0;
                }
                try {
                    int windowTouchSlop = ViewConfiguration.getWindowTouchSlop() >> 8;
                    int i34 = -TextUtils.getOffsetAfter("", 0);
                    int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    int i35 = (i34 * 989) - 22701;
                    int i36 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                    int i37 = (-24) | i36;
                    int i38 = ((~((i37 ^ i34) | (i37 & i34))) | (~(i34 | 23 | iTuitionPaymentFragmentspecialinlinedviewModeldefault4))) * 988;
                    int i39 = ((i35 | i38) << 1) - (i38 ^ i35);
                    int i40 = (i34 | (-24)) * (-988);
                    int i41 = (i39 & i40) + (i40 | i39);
                    int i42 = ~i34;
                    int i43 = ~((i42 & (-24)) | (i42 ^ (-24)));
                    int i44 = ~(((-24) ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault4) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault4 & (-24)));
                    int i45 = i41 + (((i43 & i44) | (i43 ^ i44) | (~(i36 | i34 | 23))) * 988);
                    int offsetAfter = TextUtils.getOffsetAfter("", 0);
                    int i46 = offsetAfter * 221;
                    int i47 = (i46 ^ (-6295812)) + ((i46 & (-6295812)) << 1);
                    int i48 = ~((~offsetAfter) | (-28749));
                    int i49 = ~i;
                    int i50 = (i49 ^ offsetAfter) | (i49 & offsetAfter);
                    int i51 = ~((i50 & 28748) | (i50 ^ 28748));
                    int i52 = ((i48 & i51) | (i48 ^ i51)) * 220;
                    int i53 = (i47 & i52) + (i52 | i47);
                    int i54 = ~(i49 | 28748);
                    int i55 = -(-(((i54 & offsetAfter) | (offsetAfter ^ i54)) * (-440)));
                    int i56 = (i53 ^ i55) + ((i55 & i53) << 1);
                    int i57 = (offsetAfter & 28748) | (offsetAfter ^ 28748);
                    int i58 = ((i57 & i) | (i57 ^ i)) * 220;
                    Object[] objArr2 = new Object[1];
                    e(windowTouchSlop, i45, (char) ((i56 ^ i58) + ((i58 & i56) << 1)), objArr2);
                    Class<?> cls = Class.forName((String) objArr2[0]);
                    int i59 = -TextUtils.lastIndexOf("", '0', 0);
                    int i60 = (i59 ^ 22) + ((i59 & 22) << 1);
                    int i61 = -AndroidCharacter.getMirror('0');
                    Object[] objArr3 = new Object[1];
                    e(i60, (i61 & 66) + (i61 | 66), (char) View.MeasureSpec.makeMeasureSpec(0, 0), objArr3);
                    Object objInvoke = cls.getMethod((String) objArr3[0], null).invoke(context, null);
                    int i62 = 42 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                    int i63 = -Color.argb(0, 0, 0, 0);
                    Object[] objArr4 = new Object[1];
                    e(i62, ((i63 | 34) << 1) - (i63 ^ 34), (char) TextUtils.getTrimmedLength(""), objArr4);
                    Class<?> cls2 = Class.forName((String) objArr4[0]);
                    int i64 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    int i65 = (i64 * 934) - 68968;
                    int i66 = ~i64;
                    int i67 = ~((i66 & i49) | (i66 ^ i49));
                    int i68 = ((i67 & (-75)) | ((-75) ^ i67)) * (-933);
                    int i69 = (i65 & i68) + (i65 | i68);
                    int i70 = ~((-75) | i49);
                    int i71 = ~(((-75) & i64) | ((-75) ^ i64));
                    int i72 = -(-(((i70 & i71) | (i70 ^ i71)) * 933));
                    int i73 = (i69 ^ i72) + ((i72 & i69) << 1) + ((~(i64 | 74)) * 933);
                    int i74 = -Process.getGidForName("");
                    int i75 = ((i74 | 4) << 1) - (i74 ^ 4);
                    int scrollBarSize = ViewConfiguration.getScrollBarSize() >> 8;
                    int i76 = scrollBarSize * 866;
                    int i77 = (i76 ^ (-10284192)) + ((i76 & (-10284192)) << 1);
                    int i78 = ~scrollBarSize;
                    int i79 = ~((i78 & i49) | (i78 ^ i49));
                    int i80 = i77 + (((i79 & (-11904)) | ((-11904) ^ i79)) * (-865)) + ((~((scrollBarSize ^ i) | (scrollBarSize & i))) * 865);
                    int i81 = ~(((-11904) ^ i49) | ((-11904) & i49));
                    int i82 = ~(scrollBarSize | (~i));
                    char c = (char) ((i80 - (~(((i82 & i81) | (i81 ^ i82)) * 865))) - 1);
                    Object[] objArr5 = new Object[1];
                    e(i73, i75, c, objArr5);
                    int i83 = cls2.getField((String) objArr5[0]).getInt(objInvoke) & 2;
                    int i84 = -i83;
                    int i85 = ((i83 & i84) | (i83 ^ i84)) >> 31;
                    int i86 = (~i85) & i;
                    int i87 = i85 & ((i & (-2)) | (i49 & 1));
                    i4 = (i87 & i86) | (i86 ^ i87);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                i4 = i;
            }
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1122237249);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char size = (char) (View.MeasureSpec.getSize(0) + 16949);
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2739;
                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 13;
                    byte[] bArr = $$a;
                    Object[] objArr6 = new Object[1];
                    a(bArr[10], bArr[40], (byte) 52, objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(size, keyRepeatTimeout, absoluteGravity, 1501733736, false, (String) objArr6[0], new Class[0]);
                }
                Set set = (Set) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, null);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-431688923);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char maxKeyCode = (char) (16949 - (KeyEvent.getMaxKeyCode() >> 16));
                    int iResolveSizeAndState = 2739 - View.resolveSizeAndState(0, 0, 0);
                    int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 13;
                    byte[] bArr2 = $$a;
                    Object[] objArr7 = new Object[1];
                    a(bArr2[10], bArr2[5], (byte) 52, objArr7);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maxKeyCode, iResolveSizeAndState, offsetAfter2, 47863026, false, (String) objArr7[0], null);
                }
                if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null))) {
                    int i88 = TuitionPaymentFragmentbindingInflater1 + 59;
                    d = i88 % 128;
                    if (i88 % 2 == 0) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 16949);
                            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2739;
                            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 13;
                            byte[] bArr3 = $$a;
                            byte b = bArr3[10];
                            byte b2 = bArr3[7];
                            Object[] objArr8 = new Object[1];
                            a(b, b2, (byte) (b2 | 37), objArr8);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cNormalizeMetaState, maximumFlingVelocity, maximumDrawingCacheSize, 631063962, false, (String) objArr8[0], null);
                        }
                        set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null));
                        obj.hashCode();
                        throw null;
                    }
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1056710067);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char c2 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 16948);
                        int i89 = 2740 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        int iBlue = 13 - Color.blue(0);
                        byte[] bArr4 = $$a;
                        byte b3 = bArr4[10];
                        byte b4 = bArr4[7];
                        Object[] objArr9 = new Object[1];
                        a(b3, b4, (byte) (b4 | 37), objArr9);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, i89, iBlue, 631063962, false, (String) objArr9[0], null);
                    }
                    if (!set.contains(((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).get(null))) {
                        if (Build.VERSION.SDK_INT > 33) {
                            int i90 = -TextUtils.indexOf("", "", 0, 0);
                            int i91 = i90 * 371;
                            int i92 = ((i91 | 29680) << 1) - (i91 ^ 29680);
                            int i93 = ~((-81) | (~i));
                            int i94 = ~i90;
                            int i95 = -(-((i93 | (~((i94 & i) | (i94 ^ i)))) * (-370)));
                            int i96 = (i92 ^ i95) + ((i95 & i92) << 1);
                            int i97 = ~i90;
                            int i98 = ~i;
                            int i99 = ~((i97 & i98) | (i97 ^ i98));
                            int i100 = ~(((-81) & i) | ((-81) ^ i));
                            int i101 = (i99 & i100) | (i99 ^ i100);
                            int i102 = ~(i90 | 80);
                            int i103 = ((i101 & i102) | (i101 ^ i102)) * (-370);
                            int i104 = ((i96 | i103) << 1) - (i103 ^ i96);
                            int i105 = (~((i90 & 80) | (i90 ^ 80))) * 370;
                            int i106 = ((i104 | i105) << 1) - (i105 ^ i104);
                            int i107 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            int i108 = i107 * 483;
                            int i109 = (i108 & 6776) + (i108 | 6776);
                            int i110 = ~i107;
                            int i111 = ~((i110 & (-29)) | (i110 ^ (-29)));
                            int i112 = ~i107;
                            int i113 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault5;
                            int i114 = ~((i112 ^ i113) | (i112 & i113));
                            int i115 = ((i111 & i114) | (i111 ^ i114)) * (-241);
                            i17 = (i109 ^ i115) + ((i115 & i109) << 1) + (((i107 ^ 28) | (i107 & 28)) * (-482));
                            i18 = ~((i107 & (-29)) | ((-29) ^ i107));
                            int i116 = (i113 & i112) | (i112 ^ i113);
                            i19 = ~((i116 & 28) | (i116 ^ 28));
                            int i117 = d;
                            i20 = ((i117 | 17) << 1) - (i117 ^ 17);
                            TuitionPaymentFragmentbindingInflater1 = i20 % 128;
                            if (i20 % 2 != 0) {
                                i21 = i17 * (241 << ((i18 & i19) | (i18 ^ i19)));
                                i22 = -ImageFormat.getBitsPerPixel(1);
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                i23 = (-129) >> i22;
                                i24 = 15904;
                                i25 = -15905;
                            } else {
                                i21 = (i17 - (~(((i18 & i19) | (i18 ^ i19)) * 241))) - 1;
                                i22 = -ImageFormat.getBitsPerPixel(0);
                                iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                i23 = (i22 * (-129)) + 1908146;
                                i24 = 14566;
                                i25 = -14567;
                            }
                            int i118 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            int i119 = -(-(130 * (~((i25 & i118) | (i25 ^ i118) | i22))));
                            int i120 = ((i23 | i119) << 1) - (i23 ^ i119);
                            int i121 = ~i24;
                            int i122 = (i121 & i22) | (i121 ^ i22);
                            int i123 = i120 + ((~i122) * (-260));
                            int i124 = ~i22;
                            int i125 = ~((i124 & i24) | (i124 ^ i24));
                            int i126 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & i122) | (i122 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                            int i127 = -(-(((i125 & i126) | (i125 ^ i126)) * 130));
                            Object[] objArr10 = new Object[1];
                            e(i106, i21, (char) (((i123 | i127) << 1) - (i127 ^ i123)), objArr10);
                            Object[] objArr11 = {(String) objArr10[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                char c3 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                                int iRed = Color.red(0) + 993;
                                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 9;
                                byte[] bArr5 = $$a;
                                Object[] objArr12 = new Object[1];
                                a((byte) (bArr5[19] - 1), bArr5[40], bArr5[7], objArr12);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c3, iRed, iIndexOf, 410748506, false, (String) objArr12[0], new Class[]{String.class});
                            }
                            long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr11)).longValue();
                            long j = -59206452;
                            long j2 = -1;
                            long j3 = jLongValue ^ j2;
                            long j4 = 494;
                            long j5 = j ^ j2;
                            long j6 = ((long) i) ^ j2;
                            long j7 = (((long) 495) * j) + (((long) (-493)) * jLongValue) + (((long) (-988)) * (j | j3)) + ((jLongValue | j5 | j6) * j4) + (j4 * (((jLongValue | j) ^ j2) | ((j5 | j3) ^ j2) | ((j6 | jLongValue) ^ j2))) + ((long) (-141711785));
                            int i128 = (int) (j7 >> 32);
                            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                            int i129 = i128 & ((((~(974716653 | iElapsedRealtime)) * TypedValues.CycleType.TYPE_EASING) - 471965618) + (((~((~iElapsedRealtime) | 974716653)) | 437278381) * TypedValues.CycleType.TYPE_EASING));
                            int startUptimeMillis = (int) Process.getStartUptimeMillis();
                            int i130 = ~startUptimeMillis;
                            int i131 = ((int) j7) & ((-635053777) + (((~(1486236296 | i130)) | (~((-49009887) | startUptimeMillis))) * (-370)) + (((~(startUptimeMillis | 1486236296)) | (~(i130 | (-49009887))) | 1477716480) * (-370)) + 1294251008);
                            i8 = (i129 & i131) | (i129 ^ i131);
                        } else {
                            int keyRepeatDelay = ViewConfiguration.getKeyRepeatDelay() >> 16;
                            i12 = ((keyRepeatDelay | 108) << 1) - (keyRepeatDelay ^ 108);
                            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0);
                            int i132 = TuitionPaymentFragmentbindingInflater1;
                            i13 = ((i132 | 87) << 1) - (i132 ^ 87);
                            d = i13 % 128;
                            i14 = -iLastIndexOf;
                            if (i13 % 2 == 0) {
                                Object[] objArr13 = new Object[1];
                                e(i12, i14, (char) View.MeasureSpec.getSize(0), objArr13);
                                str = (String) objArr13[0];
                                i15 = (ViewConfiguration.getZoomControlsTimeout() > 1L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 1L ? 0 : -1));
                                i16 = 96;
                            } else {
                                Object[] objArr14 = new Object[1];
                                e(i12, i14, (char) View.MeasureSpec.getSize(0), objArr14);
                                str = (String) objArr14[0];
                                i15 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                i16 = 108;
                            }
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault6 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            int i133 = (i15 * 592) + (i16 * (-590));
                            int i134 = d;
                            int i135 = (i134 ^ 85) + ((i134 & 85) << 1);
                            TuitionPaymentFragmentbindingInflater1 = i135 % 128;
                            int i136 = i135 % 2;
                            int i137 = ~i15;
                            int i138 = (-1182) * (~(i137 | i16));
                            int i139 = (i133 ^ i138) + ((i133 & i138) << 1);
                            int i140 = ~i16;
                            int i141 = (i137 ^ i140) | (i137 & i140);
                            int i142 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault6;
                            int i143 = ~((i141 & i142) | (i141 ^ i142));
                            int i144 = ~(i15 | i16);
                            int i145 = i134 + 41;
                            TuitionPaymentFragmentbindingInflater1 = i145 % 128;
                            int i146 = i145 % 2;
                            int i147 = -(-(((i144 & i143) | (i143 ^ i144)) * (-591)));
                            int i148 = (i139 & i147) + (i147 | i139);
                            int i149 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault6 ^ i137) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault6 & i137);
                            int i150 = ((i149 & i140) | (i149 ^ i140)) * 591;
                            int i151 = ((i148 | i150) << 1) - (i150 ^ i148);
                            int i152 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int i153 = (i152 & 13) + (i152 | 13);
                            int i154 = -TextUtils.getOffsetBefore("", 0);
                            Object[] objArr15 = new Object[1];
                            e(i151, i153, (char) (((i154 | 52017) << 1) - (i154 ^ 52017)), objArr15);
                            objArr = new Object[]{(String) objArr15[0]};
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 33602);
                                int keyRepeatTimeout2 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3085;
                                int iRgb = Color.rgb(0, 0, 0) + 16777242;
                                byte[] bArr6 = $$a;
                                byte b5 = (byte) (bArr6[19] - 1);
                                byte b6 = bArr6[40];
                                byte b7 = bArr6[7];
                                Object[] objArr16 = new Object[1];
                                a(b5, b6, b7, objArr16);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(touchSlop, keyRepeatTimeout2, iRgb, 1411172903, false, (String) objArr16[0], new Class[]{String.class});
                            }
                            if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                int i155 = TuitionPaymentFragmentbindingInflater1;
                                int i156 = ((i155 | 125) << 1) - (i155 ^ 125);
                                d = i156 % 128;
                                int i157 = i156 % 2;
                                i8 = 1;
                            } else {
                                i8 = 0;
                            }
                        }
                        int i158 = (i & (-11)) | ((~i) & 10);
                        int i159 = -i8;
                        int i160 = ((i8 & i159) | (i8 ^ i159)) >> 31;
                        int i161 = (~i160) & i;
                        int i162 = i160 & i158;
                        i9 = (i162 & i161) | (i161 ^ i162);
                        int i163 = TuitionPaymentFragmentbindingInflater1;
                        int i164 = (i163 ^ 91) + ((i163 & 91) << 1);
                        d = i164 % 128;
                        int i165 = i164 % 2;
                        int i166 = i2 & 32;
                        i10 = (i166 | (-i166)) >> 31;
                        i11 = i163 + 61;
                        d = i11 % 128;
                        if (i11 % 2 == 0) {
                            int i167 = i9 & (~i10);
                            int i168 = i & i10;
                            i6 = (i167 & i168) | (i167 ^ i168);
                            int i169 = 92 / 0;
                        } else {
                            i6 = (i9 & (~i10)) | (i & i10);
                        }
                    } else if (Build.VERSION.SDK_INT == 30) {
                        int i170 = d;
                        i5 = (i170 & 15) + (i170 | 15);
                        TuitionPaymentFragmentbindingInflater1 = i5 % 128;
                        if (i5 % 2 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                        i6 = i;
                    } else {
                        try {
                            if (Build.VERSION.SDK_INT > 33) {
                                int i910 = -TextUtils.indexOf("", "", 0, 0);
                                int i911 = i910 * 371;
                                int i912 = ((i911 | 29680) << 1) - (i911 ^ 29680);
                                int i913 = ~((-81) | (~i));
                                int i914 = ~i910;
                                int i915 = -(-((i913 | (~((i914 & i) | (i914 ^ i)))) * (-370)));
                                int i916 = (i912 ^ i915) + ((i915 & i912) << 1);
                                int i917 = ~i910;
                                int i918 = ~i;
                                int i919 = ~((i917 & i918) | (i917 ^ i918));
                                int i1010 = ~(((-81) & i) | ((-81) ^ i));
                                int i1011 = (i919 & i1010) | (i919 ^ i1010);
                                int i1012 = ~(i910 | 80);
                                int i1013 = ((i1011 & i1012) | (i1011 ^ i1012)) * (-370);
                                int i1014 = ((i916 | i1013) << 1) - (i1013 ^ i916);
                                int i1015 = (~((i910 & 80) | (i910 ^ 80))) * 370;
                                int i1016 = ((i1014 | i1015) << 1) - (i1015 ^ i1014);
                                int i1017 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault7 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                int i1018 = i1017 * 483;
                                int i1019 = (i1018 & 6776) + (i1018 | 6776);
                                int i1110 = ~i1017;
                                int i1111 = ~((i1110 & (-29)) | (i1110 ^ (-29)));
                                int i1112 = ~i1017;
                                int i1113 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault7;
                                int i1114 = ~((i1112 ^ i1113) | (i1112 & i1113));
                                int i1115 = ((i1111 & i1114) | (i1111 ^ i1114)) * (-241);
                                i17 = (i1019 ^ i1115) + ((i1115 & i1019) << 1) + (((i1017 ^ 28) | (i1017 & 28)) * (-482));
                                i18 = ~((i1017 & (-29)) | ((-29) ^ i1017));
                                int i1116 = (i1113 & i1112) | (i1112 ^ i1113);
                                i19 = ~((i1116 & 28) | (i1116 ^ 28));
                                int i1117 = d;
                                i20 = ((i1117 | 17) << 1) - (i1117 ^ 17);
                                TuitionPaymentFragmentbindingInflater1 = i20 % 128;
                                if (i20 % 2 != 0) {
                                    i21 = i17 * (241 << ((i18 & i19) | (i18 ^ i19)));
                                    i22 = -ImageFormat.getBitsPerPixel(1);
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                    i23 = (-129) >> i22;
                                    i24 = 15904;
                                    i25 = -15905;
                                } else {
                                    i21 = (i17 - (~(((i18 & i19) | (i18 ^ i19)) * 241))) - 1;
                                    i22 = -ImageFormat.getBitsPerPixel(0);
                                    iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                    i23 = (i22 * (-129)) + 1908146;
                                    i24 = 14566;
                                    i25 = -14567;
                                }
                                int i1118 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                int i1119 = -(-(130 * (~((i25 & i1118) | (i25 ^ i1118) | i22))));
                                int i1210 = ((i23 | i1119) << 1) - (i23 ^ i1119);
                                int i1211 = ~i24;
                                int i1212 = (i1211 & i22) | (i1211 ^ i22);
                                int i1213 = i1210 + ((~i1212) * (-260));
                                int i1214 = ~i22;
                                int i1215 = ~((i1214 & i24) | (i1214 ^ i24));
                                int i1216 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & i1212) | (i1212 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                                int i1217 = -(-(((i1215 & i1216) | (i1215 ^ i1216)) * 130));
                                Object[] objArr17 = new Object[1];
                                e(i1016, i21, (char) (((i1213 | i1217) << 1) - (i1217 ^ i1213)), objArr17);
                                try {
                                    Object[] objArr18 = {(String) objArr17[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                        char c4 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                                        int iRed2 = Color.red(0) + 993;
                                        int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 9;
                                        byte[] bArr7 = $$a;
                                        Object[] objArr19 = new Object[1];
                                        a((byte) (bArr7[19] - 1), bArr7[40], bArr7[7], objArr19);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c4, iRed2, iIndexOf2, 410748506, false, (String) objArr19[0], new Class[]{String.class});
                                    }
                                    long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr18)).longValue();
                                    long j8 = -59206452;
                                    long j9 = -1;
                                    long j10 = jLongValue2 ^ j9;
                                    long j11 = 494;
                                    long j12 = j8 ^ j9;
                                    long j13 = ((long) i) ^ j9;
                                    long j14 = (((long) 495) * j8) + (((long) (-493)) * jLongValue2) + (((long) (-988)) * (j8 | j10)) + ((jLongValue2 | j12 | j13) * j11) + (j11 * (((jLongValue2 | j8) ^ j9) | ((j12 | j10) ^ j9) | ((j13 | jLongValue2) ^ j9))) + ((long) (-141711785));
                                    int i1218 = (int) (j14 >> 32);
                                    int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                                    int i1219 = i1218 & ((((~(974716653 | iElapsedRealtime2)) * TypedValues.CycleType.TYPE_EASING) - 471965618) + (((~((~iElapsedRealtime2) | 974716653)) | 437278381) * TypedValues.CycleType.TYPE_EASING));
                                    int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
                                    int i1310 = ~startUptimeMillis2;
                                    int i1311 = ((int) j14) & ((-635053777) + (((~(1486236296 | i1310)) | (~((-49009887) | startUptimeMillis2))) * (-370)) + (((~(startUptimeMillis2 | 1486236296)) | (~(i1310 | (-49009887))) | 1477716480) * (-370)) + 1294251008);
                                    i8 = (i1219 & i1311) | (i1219 ^ i1311);
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 != null) {
                                        throw cause2;
                                    }
                                    throw th2;
                                }
                            } else {
                                int keyRepeatDelay2 = ViewConfiguration.getKeyRepeatDelay() >> 16;
                                i12 = ((keyRepeatDelay2 | 108) << 1) - (keyRepeatDelay2 ^ 108);
                                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0);
                                int i1312 = TuitionPaymentFragmentbindingInflater1;
                                i13 = ((i1312 | 87) << 1) - (i1312 ^ 87);
                                d = i13 % 128;
                                i14 = -iLastIndexOf2;
                                if (i13 % 2 == 0) {
                                    Object[] objArr110 = new Object[1];
                                    e(i12, i14, (char) View.MeasureSpec.getSize(0), objArr110);
                                    str = (String) objArr110[0];
                                    i15 = (ViewConfiguration.getZoomControlsTimeout() > 1L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 1L ? 0 : -1));
                                    i16 = 96;
                                } else {
                                    Object[] objArr111 = new Object[1];
                                    e(i12, i14, (char) View.MeasureSpec.getSize(0), objArr111);
                                    str = (String) objArr111[0];
                                    i15 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                    i16 = 108;
                                }
                                int iTuitionPaymentFragmentspecialinlinedviewModeldefault8 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                                int i1313 = (i15 * 592) + (i16 * (-590));
                                int i1314 = d;
                                int i1315 = (i1314 ^ 85) + ((i1314 & 85) << 1);
                                TuitionPaymentFragmentbindingInflater1 = i1315 % 128;
                                int i1316 = i1315 % 2;
                                int i1317 = ~i15;
                                int i1318 = (-1182) * (~(i1317 | i16));
                                int i1319 = (i1313 ^ i1318) + ((i1313 & i1318) << 1);
                                int i1410 = ~i16;
                                int i1411 = (i1317 ^ i1410) | (i1317 & i1410);
                                int i1412 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault8;
                                int i1413 = ~((i1411 & i1412) | (i1411 ^ i1412));
                                int i1414 = ~(i15 | i16);
                                int i1415 = i1314 + 41;
                                TuitionPaymentFragmentbindingInflater1 = i1415 % 128;
                                int i1416 = i1415 % 2;
                                int i1417 = -(-(((i1414 & i1413) | (i1413 ^ i1414)) * (-591)));
                                int i1418 = (i1319 & i1417) + (i1417 | i1319);
                                int i1419 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault8 ^ i1317) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault8 & i1317);
                                int i1510 = ((i1419 & i1410) | (i1419 ^ i1410)) * 591;
                                int i1511 = ((i1418 | i1510) << 1) - (i1510 ^ i1418);
                                int i1512 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                                int i1513 = (i1512 & 13) + (i1512 | 13);
                                int i1514 = -TextUtils.getOffsetBefore("", 0);
                                Object[] objArr112 = new Object[1];
                                e(i1511, i1513, (char) (((i1514 | 52017) << 1) - (i1514 ^ 52017)), objArr112);
                                try {
                                    objArr = new Object[]{(String) objArr112[0]};
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                        char touchSlop2 = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 33602);
                                        int keyRepeatTimeout3 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3085;
                                        int iRgb2 = Color.rgb(0, 0, 0) + 16777242;
                                        byte[] bArr8 = $$a;
                                        byte b8 = (byte) (bArr8[19] - 1);
                                        byte b9 = bArr8[40];
                                        byte b10 = bArr8[7];
                                        Object[] objArr113 = new Object[1];
                                        a(b8, b9, b10, objArr113);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(touchSlop2, keyRepeatTimeout3, iRgb2, 1411172903, false, (String) objArr113[0], new Class[]{String.class});
                                    }
                                    if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                                        int i1515 = TuitionPaymentFragmentbindingInflater1;
                                        int i1516 = ((i1515 | 125) << 1) - (i1515 ^ 125);
                                        d = i1516 % 128;
                                        int i1517 = i1516 % 2;
                                        i8 = 1;
                                    } else {
                                        i8 = 0;
                                    }
                                } catch (Throwable th3) {
                                    Throwable cause3 = th3.getCause();
                                    if (cause3 != null) {
                                        throw cause3;
                                    }
                                    throw th3;
                                }
                            }
                        } catch (Exception unused) {
                            i8 = 0;
                        }
                        int i1518 = (i & (-11)) | ((~i) & 10);
                        int i1519 = -i8;
                        int i1610 = ((i8 & i1519) | (i8 ^ i1519)) >> 31;
                        int i1611 = (~i1610) & i;
                        int i1612 = i1610 & i1518;
                        i9 = (i1612 & i1611) | (i1611 ^ i1612);
                        int i1613 = TuitionPaymentFragmentbindingInflater1;
                        int i1614 = (i1613 ^ 91) + ((i1613 & 91) << 1);
                        d = i1614 % 128;
                        int i1615 = i1614 % 2;
                        int i1616 = i2 & 32;
                        i10 = (i1616 | (-i1616)) >> 31;
                        i11 = i1613 + 61;
                        d = i11 % 128;
                        if (i11 % 2 == 0) {
                            int i1617 = i9 & (~i10);
                            int i1618 = i & i10;
                            i6 = (i1617 & i1618) | (i1617 ^ i1618);
                            int i1619 = 92 / 0;
                        } else {
                            i6 = (i9 & (~i10)) | (i & i10);
                        }
                    }
                } else if (Build.VERSION.SDK_INT == 30) {
                    int i171 = d;
                    i5 = (i171 & 15) + (i171 | 15);
                    TuitionPaymentFragmentbindingInflater1 = i5 % 128;
                    if (i5 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    i6 = i;
                } else {
                    if (Build.VERSION.SDK_INT > 33) {
                        int i9110 = -TextUtils.indexOf("", "", 0, 0);
                        int i9111 = i9110 * 371;
                        int i9112 = ((i9111 | 29680) << 1) - (i9111 ^ 29680);
                        int i9113 = ~((-81) | (~i));
                        int i9114 = ~i9110;
                        int i9115 = -(-((i9113 | (~((i9114 & i) | (i9114 ^ i)))) * (-370)));
                        int i9116 = (i9112 ^ i9115) + ((i9115 & i9112) << 1);
                        int i9117 = ~i9110;
                        int i9118 = ~i;
                        int i9119 = ~((i9117 & i9118) | (i9117 ^ i9118));
                        int i10110 = ~(((-81) & i) | ((-81) ^ i));
                        int i10111 = (i9119 & i10110) | (i9119 ^ i10110);
                        int i10112 = ~(i9110 | 80);
                        int i10113 = ((i10111 & i10112) | (i10111 ^ i10112)) * (-370);
                        int i10114 = ((i9116 | i10113) << 1) - (i10113 ^ i9116);
                        int i10115 = (~((i9110 & 80) | (i9110 ^ 80))) * 370;
                        int i10116 = ((i10114 | i10115) << 1) - (i10115 ^ i10114);
                        int i10117 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault9 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        int i10118 = i10117 * 483;
                        int i10119 = (i10118 & 6776) + (i10118 | 6776);
                        int i11110 = ~i10117;
                        int i11111 = ~((i11110 & (-29)) | (i11110 ^ (-29)));
                        int i11112 = ~i10117;
                        int i11113 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault9;
                        int i11114 = ~((i11112 ^ i11113) | (i11112 & i11113));
                        int i11115 = ((i11111 & i11114) | (i11111 ^ i11114)) * (-241);
                        i17 = (i10119 ^ i11115) + ((i11115 & i10119) << 1) + (((i10117 ^ 28) | (i10117 & 28)) * (-482));
                        i18 = ~((i10117 & (-29)) | ((-29) ^ i10117));
                        int i11116 = (i11113 & i11112) | (i11112 ^ i11113);
                        i19 = ~((i11116 & 28) | (i11116 ^ 28));
                        int i11117 = d;
                        i20 = ((i11117 | 17) << 1) - (i11117 ^ 17);
                        TuitionPaymentFragmentbindingInflater1 = i20 % 128;
                        if (i20 % 2 != 0) {
                            i21 = i17 * (241 << ((i18 & i19) | (i18 ^ i19)));
                            i22 = -ImageFormat.getBitsPerPixel(1);
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            i23 = (-129) >> i22;
                            i24 = 15904;
                            i25 = -15905;
                        } else {
                            i21 = (i17 - (~(((i18 & i19) | (i18 ^ i19)) * 241))) - 1;
                            i22 = -ImageFormat.getBitsPerPixel(0);
                            iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            i23 = (i22 * (-129)) + 1908146;
                            i24 = 14566;
                            i25 = -14567;
                        }
                        int i11118 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i11119 = -(-(130 * (~((i25 & i11118) | (i25 ^ i11118) | i22))));
                        int i12110 = ((i23 | i11119) << 1) - (i23 ^ i11119);
                        int i12111 = ~i24;
                        int i12112 = (i12111 & i22) | (i12111 ^ i22);
                        int i12113 = i12110 + ((~i12112) * (-260));
                        int i12114 = ~i22;
                        int i12115 = ~((i12114 & i24) | (i12114 ^ i24));
                        int i12116 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault3 & i12112) | (i12112 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                        int i12117 = -(-(((i12115 & i12116) | (i12115 ^ i12116)) * 130));
                        Object[] objArr114 = new Object[1];
                        e(i10116, i21, (char) (((i12113 | i12117) << 1) - (i12117 ^ i12113)), objArr114);
                        Object[] objArr115 = {(String) objArr114[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52092531);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char c5 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1);
                            int iRed3 = Color.red(0) + 993;
                            int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0') + 9;
                            byte[] bArr9 = $$a;
                            Object[] objArr116 = new Object[1];
                            a((byte) (bArr9[19] - 1), bArr9[40], bArr9[7], objArr116);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c5, iRed3, iIndexOf3, 410748506, false, (String) objArr116[0], new Class[]{String.class});
                        }
                        long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr115)).longValue();
                        long j15 = -59206452;
                        long j16 = -1;
                        long j17 = jLongValue3 ^ j16;
                        long j18 = 494;
                        long j19 = j15 ^ j16;
                        long j110 = ((long) i) ^ j16;
                        long j111 = (((long) 495) * j15) + (((long) (-493)) * jLongValue3) + (((long) (-988)) * (j15 | j17)) + ((jLongValue3 | j19 | j110) * j18) + (j18 * (((jLongValue3 | j15) ^ j16) | ((j19 | j17) ^ j16) | ((j110 | jLongValue3) ^ j16))) + ((long) (-141711785));
                        int i12118 = (int) (j111 >> 32);
                        int iElapsedRealtime3 = (int) SystemClock.elapsedRealtime();
                        int i12119 = i12118 & ((((~(974716653 | iElapsedRealtime3)) * TypedValues.CycleType.TYPE_EASING) - 471965618) + (((~((~iElapsedRealtime3) | 974716653)) | 437278381) * TypedValues.CycleType.TYPE_EASING));
                        int startUptimeMillis3 = (int) Process.getStartUptimeMillis();
                        int i13110 = ~startUptimeMillis3;
                        int i13111 = ((int) j111) & ((-635053777) + (((~(1486236296 | i13110)) | (~((-49009887) | startUptimeMillis3))) * (-370)) + (((~(startUptimeMillis3 | 1486236296)) | (~(i13110 | (-49009887))) | 1477716480) * (-370)) + 1294251008);
                        i8 = (i12119 & i13111) | (i12119 ^ i13111);
                    } else {
                        int keyRepeatDelay3 = ViewConfiguration.getKeyRepeatDelay() >> 16;
                        i12 = ((keyRepeatDelay3 | 108) << 1) - (keyRepeatDelay3 ^ 108);
                        int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0, 0);
                        int i13112 = TuitionPaymentFragmentbindingInflater1;
                        i13 = ((i13112 | 87) << 1) - (i13112 ^ 87);
                        d = i13 % 128;
                        i14 = -iLastIndexOf3;
                        if (i13 % 2 == 0) {
                            Object[] objArr117 = new Object[1];
                            e(i12, i14, (char) View.MeasureSpec.getSize(0), objArr117);
                            str = (String) objArr117[0];
                            i15 = (ViewConfiguration.getZoomControlsTimeout() > 1L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 1L ? 0 : -1));
                            i16 = 96;
                        } else {
                            Object[] objArr118 = new Object[1];
                            e(i12, i14, (char) View.MeasureSpec.getSize(0), objArr118);
                            str = (String) objArr118[0];
                            i15 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            i16 = 108;
                        }
                        int iTuitionPaymentFragmentspecialinlinedviewModeldefault10 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        int i13113 = (i15 * 592) + (i16 * (-590));
                        int i13114 = d;
                        int i13115 = (i13114 ^ 85) + ((i13114 & 85) << 1);
                        TuitionPaymentFragmentbindingInflater1 = i13115 % 128;
                        int i13116 = i13115 % 2;
                        int i13117 = ~i15;
                        int i13118 = (-1182) * (~(i13117 | i16));
                        int i13119 = (i13113 ^ i13118) + ((i13113 & i13118) << 1);
                        int i14110 = ~i16;
                        int i14111 = (i13117 ^ i14110) | (i13117 & i14110);
                        int i14112 = ~iTuitionPaymentFragmentspecialinlinedviewModeldefault10;
                        int i14113 = ~((i14111 & i14112) | (i14111 ^ i14112));
                        int i14114 = ~(i15 | i16);
                        int i14115 = i13114 + 41;
                        TuitionPaymentFragmentbindingInflater1 = i14115 % 128;
                        int i14116 = i14115 % 2;
                        int i14117 = -(-(((i14114 & i14113) | (i14113 ^ i14114)) * (-591)));
                        int i14118 = (i13119 & i14117) + (i14117 | i13119);
                        int i14119 = (iTuitionPaymentFragmentspecialinlinedviewModeldefault10 ^ i13117) | (iTuitionPaymentFragmentspecialinlinedviewModeldefault10 & i13117);
                        int i15110 = ((i14119 & i14110) | (i14119 ^ i14110)) * 591;
                        int i15111 = ((i14118 | i15110) << 1) - (i15110 ^ i14118);
                        int i15112 = -(ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int i15113 = (i15112 & 13) + (i15112 | 13);
                        int i15114 = -TextUtils.getOffsetBefore("", 0);
                        Object[] objArr119 = new Object[1];
                        e(i15111, i15113, (char) (((i15114 | 52017) << 1) - (i15114 ^ 52017)), objArr119);
                        objArr = new Object[]{(String) objArr119[0]};
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1333629456);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char touchSlop3 = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 33602);
                            int keyRepeatTimeout4 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3085;
                            int iRgb3 = Color.rgb(0, 0, 0) + 16777242;
                            byte[] bArr10 = $$a;
                            byte b11 = (byte) (bArr10[19] - 1);
                            byte b12 = bArr10[40];
                            byte b13 = bArr10[7];
                            Object[] objArr1110 = new Object[1];
                            a(b11, b12, b13, objArr1110);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(touchSlop3, keyRepeatTimeout4, iRgb3, 1411172903, false, (String) objArr1110[0], new Class[]{String.class});
                        }
                        if (str.equals(((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr))) {
                            int i15115 = TuitionPaymentFragmentbindingInflater1;
                            int i15116 = ((i15115 | 125) << 1) - (i15115 ^ 125);
                            d = i15116 % 128;
                            int i15117 = i15116 % 2;
                            i8 = 1;
                        } else {
                            i8 = 0;
                        }
                    }
                    int i15118 = (i & (-11)) | ((~i) & 10);
                    int i15119 = -i8;
                    int i16110 = ((i8 & i15119) | (i8 ^ i15119)) >> 31;
                    int i16111 = (~i16110) & i;
                    int i16112 = i16110 & i15118;
                    i9 = (i16112 & i16111) | (i16111 ^ i16112);
                    int i16113 = TuitionPaymentFragmentbindingInflater1;
                    int i16114 = (i16113 ^ 91) + ((i16113 & 91) << 1);
                    d = i16114 % 128;
                    int i16115 = i16114 % 2;
                    int i16116 = i2 & 32;
                    i10 = (i16116 | (-i16116)) >> 31;
                    i11 = i16113 + 61;
                    d = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i16117 = i9 & (~i10);
                        int i16118 = i & i10;
                        i6 = (i16117 & i16118) | (i16117 ^ i16118);
                        int i16119 = 92 / 0;
                    } else {
                        i6 = (i9 & (~i10)) | (i & i10);
                    }
                }
                int i172 = (~(i & i4)) & (i | i4);
                int i173 = -i172;
                int i174 = ((i172 & i173) | (i172 ^ i173)) >> 31;
                int i175 = i6 & (~i174);
                int i176 = i4 & i174;
                int i177 = (i175 & i176) | (i175 ^ i176);
                Object[] objArr20 = new Object[4];
                int[] iArr = new int[1];
                objArr20[0] = iArr;
                int[] iArr2 = new int[1];
                objArr20[1] = iArr2;
                int[] iArr3 = new int[1];
                objArr20[2] = iArr3;
                int i178 = (~(i & i177)) & (i | i177);
                int i179 = -i178;
                int i180 = (((i178 & i179) | (i178 ^ i179)) >> 31) & 16;
                int i181 = d;
                int i182 = i181 + 51;
                TuitionPaymentFragmentbindingInflater1 = i182 % 128;
                if (i182 % 2 != 0) {
                    iArr2[1] = i;
                    iArr3[0] = i177;
                    objArr20[5] = null;
                } else {
                    iArr[0] = i;
                    iArr3[0] = i177;
                    objArr20[3] = null;
                }
                int i183 = (i181 & 49) + (i181 | 49);
                TuitionPaymentFragmentbindingInflater1 = i183 % 128;
                int i184 = i183 % 2;
                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                int i185 = (((~((-461867272) | startElapsedRealtime)) | 419430658) * (-566)) + 1214861376 + ((~(startElapsedRealtime | (-42436614))) * 566);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault11 = TypeAdapters.AnonymousClass18.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                int i186 = i180 * 273;
                int i187 = -(-(i185 * (-271)));
                int i188 = ((i186 | i187) << 1) - (i186 ^ i187);
                int i189 = ~i180;
                int i190 = ~((~i185) | i189 | (~iTuitionPaymentFragmentspecialinlinedviewModeldefault11));
                int i191 = (i180 ^ i185) | (i180 & i185);
                int i192 = ~((i191 & iTuitionPaymentFragmentspecialinlinedviewModeldefault11) | (i191 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault11));
                int i193 = i188 + (((i190 & i192) | (i190 ^ i192)) * (-272));
                int i194 = d + 5;
                int i195 = i194 % 128;
                TuitionPaymentFragmentbindingInflater1 = i195;
                if (i194 % 2 != 0) {
                    int i196 = ~i180;
                    int i197 = ~(i196 | i185);
                    int i198 = ~(i196 | iTuitionPaymentFragmentspecialinlinedviewModeldefault11);
                    i7 = (i193 * (((i198 & i197) | (i197 ^ i198)) * (-272))) / (((~((iTuitionPaymentFragmentspecialinlinedviewModeldefault11 & i180) | (i180 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault11))) | i185) * 272);
                } else {
                    int i199 = ((~(i189 | iTuitionPaymentFragmentspecialinlinedviewModeldefault11)) | (~(i189 | i185))) * (-272);
                    int i200 = (i193 & i199) + (i199 | i193);
                    int i201 = ~((iTuitionPaymentFragmentspecialinlinedviewModeldefault11 & i180) | (i180 ^ iTuitionPaymentFragmentspecialinlinedviewModeldefault11));
                    int i202 = -(-(((i201 & i185) | (i185 ^ i201)) * 272));
                    i7 = (i200 ^ i202) + ((i202 & i200) << 1);
                }
                int i203 = i3 + i7;
                int i204 = i203 << 13;
                int i205 = ((~i203) & i204) | ((~i204) & i203);
                int i206 = i205 >>> 17;
                int i207 = (i205 | i206) & (~(i205 & i206));
                int i208 = i207 << 5;
                ((int[]) objArr20[1])[0] = (i207 | i208) & (~(i207 & i208));
                int i209 = i195 + 101;
                d = i209 % 128;
                if (i209 % 2 != 0) {
                    return objArr20;
                }
                throw null;
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 != null) {
                    throw cause4;
                }
                throw th4;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0028  */
        /* JADX WARN: Code duplicated, block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(byte r7, short r8, int r9) {
            /*
                int r9 = r9 * 3
                int r9 = 4 - r9
                int r7 = r7 * 3
                int r7 = r7 + 109
                byte[] r0 = io.reactivex.internal.operators.observable.ObservableWindowBoundary.TuitionPaymentFragmentbindingInflater1.$$c
                int r8 = r8 * 2
                int r8 = 1 - r8
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r8
                r7 = r9
                r4 = r2
                goto L2d
            L17:
                r3 = r2
            L18:
                r6 = r9
                r9 = r7
                r7 = r6
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                if (r4 != r8) goto L28
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L28:
                r3 = r0[r7]
                r6 = r9
                r9 = r7
                r7 = r6
            L2d:
                int r3 = -r3
                int r9 = r9 + 1
                int r7 = r7 + r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableWindowBoundary.TuitionPaymentFragmentbindingInflater1.$$g(byte, short, int):java.lang.String");
        }
    }
}

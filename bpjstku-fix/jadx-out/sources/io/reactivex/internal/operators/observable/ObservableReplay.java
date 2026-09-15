package io.reactivex.internal.operators.observable;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.VideoRecordEventStart;
import defpackage.appendBackupVideoProfile;
import defpackage.deriveMediaType;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.initSession;
import defpackage.isSamsungJ4;
import defpackage.logToString;
import defpackage.mergeEncoderProfiles;
import defpackage.readableMs;
import defpackage.setVideoStabilizationMode;
import defpackage.share;
import defpackage.usesAffectedSoc;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableReplay<T> extends usesAffectedSoc<T> implements mergeEncoderProfiles {
    private static TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new d();
    private TuitionPaymentFragmentspecialinlinedviewModeldefault3<T> TuitionPaymentFragmentbindingInflater1;
    private AtomicReference<ReplayObserver<T>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private AutoValue_VideoValidatedEncoderProfilesProxy<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private AutoValue_VideoValidatedEncoderProfilesProxy<T> b;

    /* JADX INFO: loaded from: classes7.dex */
    interface TuitionPaymentFragmentbindingInflater1<T> {
        void TuitionPaymentFragmentspecialinlinedviewModeldefault1(T t);

        void TuitionPaymentFragmentspecialinlinedviewModeldefault3();

        void TuitionPaymentFragmentspecialinlinedviewModeldefault3(InnerDisposable<T> innerDisposable);

        void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Throwable th);
    }

    /* JADX INFO: loaded from: classes7.dex */
    interface TuitionPaymentFragmentspecialinlinedviewModeldefault3<T> {
        TuitionPaymentFragmentbindingInflater1<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    public static <U, R> VideoRecordEventStart<R> TuitionPaymentFragmentspecialinlinedviewModeldefault2(Callable<? extends usesAffectedSoc<U>> callable, readableMs<? super VideoRecordEventStart<U>, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<R>> readablems) {
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault1(callable, readablems);
    }

    public static <T> usesAffectedSoc<T> TuitionPaymentFragmentbindingInflater1(usesAffectedSoc<T> usesaffectedsoc, appendBackupVideoProfile appendbackupvideoprofile) {
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault2(usesaffectedsoc, usesaffectedsoc.observeOn(appendbackupvideoprofile));
    }

    public static <T> usesAffectedSoc<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        AtomicReference atomicReference = new AtomicReference();
        return new ObservableReplay(new a(atomicReference, tuitionPaymentFragmentspecialinlinedviewModeldefault3), autoValue_VideoValidatedEncoderProfilesProxy, atomicReference, tuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public static <T> usesAffectedSoc<T> TuitionPaymentFragmentbindingInflater1(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile, int i) {
        asBinder asbinder = new asBinder(i, j, timeUnit, appendbackupvideoprofile);
        AtomicReference atomicReference = new AtomicReference();
        return new ObservableReplay(new a(atomicReference, asbinder), autoValue_VideoValidatedEncoderProfilesProxy, atomicReference, asbinder);
    }

    private ObservableReplay(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy2, AtomicReference<ReplayObserver<T>> atomicReference, TuitionPaymentFragmentspecialinlinedviewModeldefault3<T> tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
        this.b = autoValue_VideoValidatedEncoderProfilesProxy;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = autoValue_VideoValidatedEncoderProfilesProxy2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = atomicReference;
        this.TuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.mergeEncoderProfiles
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(BufferProviderState bufferProviderState) {
        PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (ReplayObserver) bufferProviderState, null);
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        this.b.subscribe(derivemediatype);
    }

    @Override // defpackage.usesAffectedSoc
    public final void TuitionPaymentFragmentbindingInflater1(logToString<? super BufferProviderState> logtostring) {
        ReplayObserver<T> replayObserver;
        while (true) {
            replayObserver = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get();
            if (replayObserver != null && !replayObserver.isDisposed()) {
                break;
            }
            ReplayObserver<T> replayObserver2 = new ReplayObserver<>(this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, replayObserver, replayObserver2)) {
                replayObserver = replayObserver2;
                break;
            }
        }
        boolean z = !replayObserver.shouldConnect.get() && replayObserver.shouldConnect.compareAndSet(false, true);
        try {
            logtostring.accept(replayObserver);
            if (z) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.subscribe(replayObserver);
            }
        } catch (Throwable th) {
            if (z) {
                replayObserver.shouldConnect.compareAndSet(true, false);
            }
            dumpMediaCodecListForFormat.b(th);
            throw ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class UnboundedReplayBuffer<T> extends ArrayList<Object> implements TuitionPaymentFragmentbindingInflater1<T> {
        private static final long serialVersionUID = 7063189396499112664L;
        volatile int size;
        private static final byte[] $$c = {53, -70, 9, -72};
        private static final int $$d = 86;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {25, -93, -120, -48, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
        private static final int $$b = 216;
        private static int b = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
        private static char[] TuitionPaymentFragmentbindingInflater1 = {59705, 59757, 59751, 59771, 59744, 59746, 59756, 59757, 59756, 59746, 59750, 59740, 59731, 59746, 59751, 59768, 59773, 59757, 59723, 59739, 59770, 59717, 59705, 59747, 59757, 59747, 59770, 59751, 59759, 59728, 59728, 59752, 59757, 59771, 59749, 59744, 59746, 59760, 59898, 59900, 59900, 59864, 59858, 59897, 59896, 59901, 59869, 59847, 59897, 59401, 59892, 59891, 59902, 59695, 59755, 59773, 59749, 59749, 59770, 59746, 59759, 59757, 59756, 59759, 59746, 59730, 59742, 59750, 59745};

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(short r5, short r6, int r7, java.lang.Object[] r8) {
            /*
                byte[] r0 = io.reactivex.internal.operators.observable.ObservableReplay.UnboundedReplayBuffer.$$a
                int r7 = r7 * 4
                int r7 = 84 - r7
                int r5 = r5 * 2
                int r5 = r5 + 4
                int r6 = r6 * 2
                int r6 = r6 + 53
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L17
                r7 = r5
                r4 = r6
                r3 = r2
                goto L29
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r7
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r6) goto L27
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L27:
                r4 = r0[r5]
            L29:
                int r4 = -r4
                int r5 = r5 + 1
                int r7 = r7 + r4
                int r7 = r7 + (-11)
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableReplay.UnboundedReplayBuffer.c(short, short, int, java.lang.Object[]):void");
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            int i;
            char[] cArr;
            char c;
            int length;
            char[] cArr2;
            int i2;
            int i3 = 2 % 2;
            setVideoStabilizationMode setvideostabilizationmode = new setVideoStabilizationMode();
            int i4 = 0;
            int i5 = iArr[0];
            byte b2 = 1;
            int i6 = iArr[1];
            int i7 = iArr[2];
            int i8 = iArr[3];
            char[] cArr3 = TuitionPaymentFragmentbindingInflater1;
            if (cArr3 != null) {
                int i9 = $10 + 7;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    length = cArr3.length;
                    cArr2 = new char[length];
                    i2 = 1;
                } else {
                    length = cArr3.length;
                    cArr2 = new char[length];
                    i2 = 0;
                }
                while (i2 < length) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i4] = Integer.valueOf(cArr3[i2]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-52690717);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b3 = (byte) 1;
                            byte b4 = (byte) (b3 - 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Color.argb(i4, i4, i4, i4), 1270 - (ViewConfiguration.getJumpTapTimeout() >> 16), Gravity.getAbsoluteGravity(i4, i4) + 18, 407021364, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE});
                        }
                        cArr2[i2] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i2++;
                        i4 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr3 = cArr2;
            }
            char[] cArr4 = new char[i6];
            System.arraycopy(cArr3, i5, cArr4, 0, i6);
            if (bArr != null) {
                int i10 = $10 + 15;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    cArr = new char[i6];
                    setvideostabilizationmode.b = 1;
                    c = 1;
                } else {
                    cArr = new char[i6];
                    setvideostabilizationmode.b = 0;
                    c = 0;
                }
                while (setvideostabilizationmode.b < i6) {
                    if (bArr[setvideostabilizationmode.b] == b2) {
                        int i11 = setvideostabilizationmode.b;
                        char c2 = cArr4[setvideostabilizationmode.b];
                        Object[] objArr3 = new Object[2];
                        objArr3[b2] = Integer.valueOf(c);
                        objArr3[0] = Integer.valueOf(c2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1683071655);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 3225 - (ViewConfiguration.getEdgeSlop() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 13, 2133916302, false, $$e(b5, b6, b6), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i11] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    } else {
                        int i12 = setvideostabilizationmode.b;
                        Object[] objArr4 = {Integer.valueOf(cArr4[setvideostabilizationmode.b]), Integer.valueOf(c)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-209040917);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 29944);
                            int i13 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1754;
                            int iIndexOf = TextUtils.indexOf("", "", 0) + 23;
                            byte b7 = (byte) ($$d & 11);
                            byte b8 = (byte) (b7 - 2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionGroup, i13, iIndexOf, 387247676, false, $$e(b7, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i12] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
                    }
                    c = cArr[setvideostabilizationmode.b];
                    Object[] objArr5 = {setvideostabilizationmode, setvideostabilizationmode};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1323373940);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        byte b9 = (byte) 0;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.getTrimmedLength("") + 41241), 1705 - Color.alpha(0), 21 - TextUtils.getTrimmedLength(""), -1434471773, false, $$e((byte) ($$d & 15), b9, b9), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    b2 = 1;
                }
                cArr4 = cArr;
            }
            if (i8 > 0) {
                char[] cArr5 = new char[i6];
                i = 0;
                System.arraycopy(cArr4, 0, cArr5, 0, i6);
                int i14 = i6 - i8;
                System.arraycopy(cArr5, 0, cArr4, i14, i8);
                System.arraycopy(cArr5, i8, cArr4, 0, i14);
            } else {
                i = 0;
            }
            if (z) {
                char[] cArr6 = new char[i6];
                while (true) {
                    setvideostabilizationmode.b = i;
                    if (setvideostabilizationmode.b >= i6) {
                        break;
                    }
                    cArr6[setvideostabilizationmode.b] = cArr4[(i6 - setvideostabilizationmode.b) - 1];
                    i = setvideostabilizationmode.b + 1;
                }
                cArr4 = cArr6;
            }
            if (i7 > 0) {
                int i15 = $10 + 63;
                $11 = i15 % 128;
                int i16 = i15 % 2;
                int i17 = 0;
                loop3: while (true) {
                    setvideostabilizationmode.b = i17;
                    while (true) {
                        if (setvideostabilizationmode.b >= i6) {
                            break loop3;
                        }
                        int i18 = $11 + 71;
                        $10 = i18 % 128;
                        if (i18 % 2 != 0) {
                            cArr4[setvideostabilizationmode.b] = (char) (cArr4[setvideostabilizationmode.b] - iArr[4]);
                            setvideostabilizationmode.b >>= 1;
                        }
                    }
                    cArr4[setvideostabilizationmode.b] = (char) (cArr4[setvideostabilizationmode.b] - iArr[2]);
                    i17 = setvideostabilizationmode.b + 1;
                }
            }
            objArr[0] = new String(cArr4);
        }

        public UnboundedReplayBuffer() {
            super(16);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.TuitionPaymentFragmentbindingInflater1
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(T t) {
            int i = 2 % 2;
            int i2 = b + 47;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            add(NotificationLite.TuitionPaymentFragmentbindingInflater1(t));
            this.size++;
            int i4 = b + 51;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.TuitionPaymentFragmentbindingInflater1
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Throwable th) throws Throwable {
            int iIntValue;
            int i = 2 % 2;
            int i2 = b + 119;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1552861273);
            int i4 = 16;
            int i5 = 0;
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (KeyEvent.getDeadChar(0, 0) + 46400), 40 - (Process.myTid() >> 22), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 19, -1206882418, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
            }
            int i6 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getInt(null);
            Object[] objArr = new Object[1];
            a(new int[]{0, 22, 0, 7}, true, new byte[]{0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(new int[]{22, 15, 0, 0}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr2);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
            long j = -1;
            long j2 = j ^ (-814531896703001012L);
            long elapsedCpuTime = ((((long) ((int) Process.getElapsedCpuTime())) ^ j) | (-814531896703001012L)) ^ j;
            long j3 = 2911789071444959999L ^ j;
            long j4 = (((long) (-1939)) * 2911789071444959999L) + (((long) 971) * (-814531896703001012L)) + (((long) (-970)) * (((j2 | 2911789071444959999L) ^ j) | elapsedCpuTime)) + (((long) 1940) * ((j3 | (-814531896703001012L)) ^ j)) + (((long) 970) * (elapsedCpuTime | (j ^ (j3 | j2))));
            int i7 = 0;
            long j5 = jLongValue;
            try {
                while (i7 != 10) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-638037654);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getMinimumFlingVelocity() >> i4) + 37836), (ViewConfiguration.getKeyRepeatTimeout() >> i4) + 59, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 18, 1030158013, false, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", null);
                    }
                    int i8 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getInt(null);
                    int i9 = i5;
                    long j6 = j5;
                    while (true) {
                        int i10 = i5;
                        while (i10 != 8) {
                            int i11 = b + 61;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                            if (i11 % 2 == 0) {
                                i8 *= ((((int) (j6 << i10)) & 25674) >> (i8 >>> 121)) % (i8 << 85);
                                i10 += 103;
                            } else {
                                i8 = (((((int) (j6 >> i10)) & 255) + (i8 << 6)) + (i8 << 16)) - i8;
                                i10++;
                            }
                        }
                        if (i9 != 0) {
                            break;
                        }
                        i9++;
                        j6 = j4;
                        i5 = 0;
                    }
                    if (i8 == i6) {
                        add(NotificationLite.TuitionPaymentFragmentbindingInflater1(th));
                        this.size++;
                        return;
                    }
                    int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i13 = i12 + 21;
                    b = i13 % 128;
                    if (i13 % 2 != 0) {
                        j5 += 1024;
                        i7 += 29;
                    } else {
                        j5 -= 1024;
                        i7++;
                    }
                    int i14 = i12 + 111;
                    b = i14 % 128;
                    int i15 = i14 % 2;
                    i4 = 16;
                    i5 = 0;
                }
                Object[] objArr3 = {687983067};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-725886332);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (46037 - ExpandableListView.getPackedPositionChild(0L)), 1134 - TextUtils.getOffsetBefore("", 0), ExpandableListView.getPackedPositionType(0L) + 18, 807763283, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArr4 = {Integer.valueOf(iIntValue), 0, 665475659, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).newInstance(objArr3), false};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1443305588);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cArgb = (char) Color.argb(0, 0, 0, 0);
                    int i16 = 1032 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    int iIndexOf = 15 - TextUtils.indexOf("", "", 0);
                    byte b2 = $$a[7];
                    byte b3 = b2;
                    Object[] objArr5 = new Object[1];
                    c(b2, b3, b3, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cArgb, i16, iIndexOf, 1298546779, false, (String) objArr5[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (KeyEvent.normalizeMetaState(0) + 45993), Color.green(0) + 1117, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 17), Boolean.TYPE});
                }
                Object[] objArr6 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4);
                int i17 = ((int[]) objArr6[1])[0];
                int i18 = ((int[]) objArr6[3])[0];
                if (i18 != i17) {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr6[0];
                    if (strArr != null) {
                        int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 119;
                        b = i19 % 128;
                        int i20 = i19 % 2;
                        for (String str : strArr) {
                            arrayList.add(str);
                        }
                    }
                    Toast.makeText((Context) null, i18 / (((i18 - 1) * i18) % 2), 0).show();
                }
                add(NotificationLite.TuitionPaymentFragmentbindingInflater1(th));
                this.size++;
                return;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
            Object[] objArr7 = new Object[1];
            a(new int[]{37, 16, 140, 0}, false, new byte[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0}, objArr7);
            Class<?> cls2 = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            a(new int[]{53, 16, 0, 9}, true, new byte[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0}, objArr8);
            iIntValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.TuitionPaymentFragmentbindingInflater1
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            int i;
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 73;
            b = i3 % 128;
            if (i3 % 2 != 0) {
                add(NotificationLite.b());
                i = this.size << 1;
            } else {
                add(NotificationLite.b());
                i = this.size + 1;
            }
            this.size = i;
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 33;
            b = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.TuitionPaymentFragmentbindingInflater1
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(InnerDisposable<T> innerDisposable) {
            int i = 2 % 2;
            if (innerDisposable.getAndIncrement() == 0) {
                deriveMediaType<? super T> derivemediatype = innerDisposable.child;
                int iAddAndGet = 1;
                loop0: while (!innerDisposable.isDisposed()) {
                    int i2 = this.size;
                    Integer num = (Integer) innerDisposable.index;
                    int iIntValue = num != null ? num.intValue() : 0;
                    while (iIntValue < i2) {
                        if (!NotificationLite.TuitionPaymentFragmentspecialinlinedviewModeldefault1(get(iIntValue), derivemediatype)) {
                            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 121;
                            b = i3 % 128;
                            int i4 = i3 % 2;
                            if (innerDisposable.isDisposed()) {
                                break loop0;
                            } else {
                                iIntValue++;
                            }
                        } else {
                            break loop0;
                        }
                    }
                    innerDisposable.index = Integer.valueOf(iIntValue);
                    iAddAndGet = innerDisposable.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        break;
                    }
                }
            }
            int i5 = b + 11;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 21 / 0;
            }
        }

        private static String $$e(short s, short s2, int i) {
            byte[] bArr = $$c;
            int i2 = s + 99;
            int i3 = (i * 3) + 4;
            int i4 = s2 * 3;
            byte[] bArr2 = new byte[i4 + 1];
            int i5 = -1;
            if (bArr == null) {
                i2 += i3;
                i3++;
                i5 = -1;
            }
            while (true) {
                int i6 = i5 + 1;
                bArr2[i6] = (byte) i2;
                if (i6 == i4) {
                    return new String(bArr2, 0);
                }
                int i7 = i3;
                i2 = bArr[i3] + i2;
                i3 = i7 + 1;
                i5 = i6;
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class ReplayObserver<T> extends AtomicReference<BufferProviderState> implements deriveMediaType<T>, BufferProviderState {
        private static final long serialVersionUID = -533785617179540163L;
        final TuitionPaymentFragmentbindingInflater1<T> buffer;
        boolean done;
        final AtomicReference<InnerDisposable[]> observers = new AtomicReference<>(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        final AtomicBoolean shouldConnect = new AtomicBoolean();
        private static InnerDisposable[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new InnerDisposable[0];
        static final InnerDisposable[] TuitionPaymentFragmentbindingInflater1 = new InnerDisposable[0];

        ReplayObserver(TuitionPaymentFragmentbindingInflater1<T> tuitionPaymentFragmentbindingInflater1) {
            this.buffer = tuitionPaymentFragmentbindingInflater1;
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.observers.get() == TuitionPaymentFragmentbindingInflater1;
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.observers.set(TuitionPaymentFragmentbindingInflater1);
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
        }

        final void b(InnerDisposable<T> innerDisposable) {
            InnerDisposable[] innerDisposableArr;
            InnerDisposable[] innerDisposableArr2;
            do {
                innerDisposableArr = this.observers.get();
                int length = innerDisposableArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (innerDisposableArr[i].equals(innerDisposable)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    innerDisposableArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                } else {
                    InnerDisposable[] innerDisposableArr3 = new InnerDisposable[length - 1];
                    System.arraycopy(innerDisposableArr, 0, innerDisposableArr3, 0, i);
                    System.arraycopy(innerDisposableArr, i + 1, innerDisposableArr3, i, (length - i) - 1);
                    innerDisposableArr2 = innerDisposableArr3;
                }
            } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.observers, innerDisposableArr, innerDisposableArr2));
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.TuitionPaymentFragmentbindingInflater1(this, bufferProviderState)) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            if (this.done) {
                return;
            }
            this.buffer.TuitionPaymentFragmentspecialinlinedviewModeldefault1(t);
            TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (!this.done) {
                this.done = true;
                this.buffer.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th);
                TuitionPaymentFragmentbindingInflater1();
                return;
            }
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.buffer.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            TuitionPaymentFragmentbindingInflater1();
        }

        private void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            for (InnerDisposable<T> innerDisposable : this.observers.get()) {
                this.buffer.TuitionPaymentFragmentspecialinlinedviewModeldefault3(innerDisposable);
            }
        }

        private void TuitionPaymentFragmentbindingInflater1() {
            for (InnerDisposable<T> innerDisposable : this.observers.getAndSet(TuitionPaymentFragmentbindingInflater1)) {
                this.buffer.TuitionPaymentFragmentspecialinlinedviewModeldefault3(innerDisposable);
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class InnerDisposable<T> extends AtomicInteger implements BufferProviderState {
        private static final long serialVersionUID = 2728361546769921047L;
        volatile boolean cancelled;
        final deriveMediaType<? super T> child;
        Object index;
        final ReplayObserver<T> parent;

        InnerDisposable(ReplayObserver<T> replayObserver, deriveMediaType<? super T> derivemediatype) {
            this.parent = replayObserver;
            this.child = derivemediatype;
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.cancelled;
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.parent.b(this);
            this.index = null;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class Node extends AtomicReference<Node> {
        private static final long serialVersionUID = 245354315435971818L;
        final Object value;

        Node(Object obj) {
            this.value = obj;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static abstract class BoundedReplayBuffer<T> extends AtomicReference<Node> implements TuitionPaymentFragmentbindingInflater1<T> {
        private static final long serialVersionUID = 2346567790059478686L;
        int size;
        Node tail;

        abstract void TuitionPaymentFragmentspecialinlinedviewModeldefault1();

        Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object obj) {
            return obj;
        }

        Object b(Object obj) {
            return obj;
        }

        BoundedReplayBuffer() {
            Node node = new Node(null);
            this.tail = node;
            set(node);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.TuitionPaymentFragmentbindingInflater1
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(T t) {
            Node node = new Node(b(NotificationLite.TuitionPaymentFragmentbindingInflater1(t)));
            this.tail.set(node);
            this.tail = node;
            this.size++;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.TuitionPaymentFragmentbindingInflater1
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Throwable th) {
            Node node = new Node(b(NotificationLite.TuitionPaymentFragmentbindingInflater1(th)));
            this.tail.set(node);
            this.tail = node;
            this.size++;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.TuitionPaymentFragmentbindingInflater1
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            Node node = new Node(b(NotificationLite.b()));
            this.tail.set(node);
            this.tail = node;
            this.size++;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.TuitionPaymentFragmentbindingInflater1
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(InnerDisposable<T> innerDisposable) {
            if (innerDisposable.getAndIncrement() == 0) {
                int iAddAndGet = 1;
                do {
                    Node nodeB = (Node) innerDisposable.index;
                    if (nodeB == null) {
                        nodeB = b();
                        innerDisposable.index = nodeB;
                    }
                    while (true) {
                        if (innerDisposable.isDisposed()) {
                            innerDisposable.index = null;
                            return;
                        }
                        Node node = nodeB.get();
                        if (node != null) {
                            if (NotificationLite.TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault3(node.value), innerDisposable.child)) {
                                innerDisposable.index = null;
                                return;
                            }
                            nodeB = node;
                        }
                    }
                    innerDisposable.index = nodeB;
                    iAddAndGet = innerDisposable.addAndGet(-iAddAndGet);
                } while (iAddAndGet != 0);
            }
        }

        Node b() {
            return get();
        }

        void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            Node node = get();
            if (node.value != null) {
                Node node2 = new Node(null);
                node2.lazySet(node.get());
                set(node2);
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class SizeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        private static final long serialVersionUID = -5898283885385201806L;
        final int limit;

        SizeBoundReplayBuffer(int i) {
            this.limit = i;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            if (this.size > this.limit) {
                Node node = get().get();
                this.size--;
                set(node);
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class SizeAndTimeBoundReplayBuffer<T> extends BoundedReplayBuffer<T> {
        private static final long serialVersionUID = 3457957419649567404L;
        final int limit;
        final long maxAge;
        final appendBackupVideoProfile scheduler;
        final TimeUnit unit;

        SizeAndTimeBoundReplayBuffer(int i, long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
            this.scheduler = appendbackupvideoprofile;
            this.limit = i;
            this.maxAge = j;
            this.unit = timeUnit;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        final Object b(Object obj) {
            return new isSamsungJ4(obj, appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.unit), this.unit);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        final Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object obj) {
            return ((isSamsungJ4) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            Node node;
            long jTuitionPaymentFragmentspecialinlinedviewModeldefault2 = appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.unit);
            long j = this.maxAge;
            Node node2 = get();
            Node node3 = node2.get();
            int i = 0;
            while (true) {
                Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 == null) {
                    break;
                }
                if (this.size > this.limit && this.size > 1) {
                    i++;
                    this.size--;
                    node3 = node2.get();
                } else {
                    if (((isSamsungJ4) node2.value).TuitionPaymentFragmentbindingInflater1 > jTuitionPaymentFragmentspecialinlinedviewModeldefault2 - j) {
                        break;
                    }
                    i++;
                    this.size--;
                    node3 = node2.get();
                }
            }
            if (i != 0) {
                set(node);
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            Node node;
            long jTuitionPaymentFragmentspecialinlinedviewModeldefault2 = appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.unit);
            long j = this.maxAge;
            Node node2 = get();
            Node node3 = node2.get();
            int i = 0;
            while (true) {
                Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 == null || this.size <= 1 || ((isSamsungJ4) node2.value).TuitionPaymentFragmentbindingInflater1 > jTuitionPaymentFragmentspecialinlinedviewModeldefault2 - j) {
                    break;
                }
                i++;
                this.size--;
                node3 = node2.get();
            }
            if (i != 0) {
                set(node);
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.BoundedReplayBuffer
        final Node b() {
            Node node;
            long jTuitionPaymentFragmentspecialinlinedviewModeldefault2 = appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.unit);
            long j = this.maxAge;
            Node node2 = get();
            Node node3 = node2.get();
            while (true) {
                Node node4 = node3;
                node = node2;
                node2 = node4;
                if (node2 == null) {
                    break;
                }
                isSamsungJ4 issamsungj4 = (isSamsungJ4) node2.value;
                if (NotificationLite.TuitionPaymentFragmentspecialinlinedviewModeldefault1(issamsungj4.TuitionPaymentFragmentspecialinlinedviewModeldefault3) || NotificationLite.TuitionPaymentFragmentspecialinlinedviewModeldefault2(issamsungj4.TuitionPaymentFragmentspecialinlinedviewModeldefault3) || issamsungj4.TuitionPaymentFragmentbindingInflater1 > jTuitionPaymentFragmentspecialinlinedviewModeldefault2 - j) {
                    break;
                }
                node3 = node2.get();
            }
            return node;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class d implements TuitionPaymentFragmentspecialinlinedviewModeldefault3<Object> {
        d() {
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final TuitionPaymentFragmentbindingInflater1<Object> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return new UnboundedReplayBuffer();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class b<R> implements logToString<BufferProviderState> {
        private final ObserverResourceWrapper<R> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        @Override // defpackage.logToString
        public final /* synthetic */ void accept(BufferProviderState bufferProviderState) throws Exception {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, bufferProviderState);
        }

        b(ObserverResourceWrapper<R> observerResourceWrapper) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = observerResourceWrapper;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class g<T> implements TuitionPaymentFragmentspecialinlinedviewModeldefault3<T> {
        private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        g(int i) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final TuitionPaymentFragmentbindingInflater1<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return new SizeBoundReplayBuffer(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class asBinder<T> implements TuitionPaymentFragmentspecialinlinedviewModeldefault3<T> {
        private final long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final TimeUnit TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private final appendBackupVideoProfile b;

        asBinder(int i, long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = j;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = timeUnit;
            this.b = appendbackupvideoprofile;
        }

        @Override // io.reactivex.internal.operators.observable.ObservableReplay.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final TuitionPaymentFragmentbindingInflater1<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return new SizeAndTimeBoundReplayBuffer(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.b);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class a<T> implements AutoValue_VideoValidatedEncoderProfilesProxy<T> {
        private final TuitionPaymentFragmentspecialinlinedviewModeldefault3<T> TuitionPaymentFragmentbindingInflater1;
        private final AtomicReference<ReplayObserver<T>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        a(AtomicReference<ReplayObserver<T>> atomicReference, TuitionPaymentFragmentspecialinlinedviewModeldefault3<T> tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = atomicReference;
            this.TuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        @Override // defpackage.AutoValue_VideoValidatedEncoderProfilesProxy
        public final void subscribe(deriveMediaType<? super T> derivemediatype) {
            ReplayObserver<T> replayObserver;
            InnerDisposable[] innerDisposableArr;
            InnerDisposable[] innerDisposableArr2;
            while (true) {
                replayObserver = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get();
                if (replayObserver != null) {
                    break;
                }
                ReplayObserver<T> replayObserver2 = new ReplayObserver<>(this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, null, replayObserver2)) {
                    replayObserver = replayObserver2;
                    break;
                }
            }
            InnerDisposable<T> innerDisposable = new InnerDisposable<>(replayObserver, derivemediatype);
            derivemediatype.onSubscribe(innerDisposable);
            do {
                innerDisposableArr = replayObserver.observers.get();
                if (innerDisposableArr == ReplayObserver.TuitionPaymentFragmentbindingInflater1) {
                    break;
                }
                int length = innerDisposableArr.length;
                innerDisposableArr2 = new InnerDisposable[length + 1];
                System.arraycopy(innerDisposableArr, 0, innerDisposableArr2, 0, length);
                innerDisposableArr2[length] = innerDisposable;
            } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(replayObserver.observers, innerDisposableArr, innerDisposableArr2));
            if (innerDisposable.isDisposed()) {
                replayObserver.b(innerDisposable);
            } else {
                replayObserver.buffer.TuitionPaymentFragmentspecialinlinedviewModeldefault3(innerDisposable);
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1<R, U> extends VideoRecordEventStart<R> {
        private final Callable<? extends usesAffectedSoc<U>> TuitionPaymentFragmentbindingInflater1;
        private final readableMs<? super VideoRecordEventStart<U>, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<R>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(Callable<? extends usesAffectedSoc<U>> callable, readableMs<? super VideoRecordEventStart<U>, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<R>> readablems) {
            this.TuitionPaymentFragmentbindingInflater1 = callable;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = readablems;
        }

        @Override // defpackage.VideoRecordEventStart
        public final void subscribeActual(deriveMediaType<? super R> derivemediatype) {
            try {
                usesAffectedSoc usesaffectedsoc = (usesAffectedSoc) share.b(this.TuitionPaymentFragmentbindingInflater1.call(), "The connectableFactory returned a null ConnectableObservable");
                AutoValue_VideoValidatedEncoderProfilesProxy autoValue_VideoValidatedEncoderProfilesProxy = (AutoValue_VideoValidatedEncoderProfilesProxy) share.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.apply(usesaffectedsoc), "The selector returned a null ObservableSource");
                ObserverResourceWrapper observerResourceWrapper = new ObserverResourceWrapper(derivemediatype);
                autoValue_VideoValidatedEncoderProfilesProxy.subscribe(observerResourceWrapper);
                usesaffectedsoc.TuitionPaymentFragmentbindingInflater1(new b(observerResourceWrapper));
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                EmptyDisposable.b(th, derivemediatype);
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2<T> extends usesAffectedSoc<T> {
        private final VideoRecordEventStart<T> TuitionPaymentFragmentbindingInflater1;
        private final usesAffectedSoc<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(usesAffectedSoc<T> usesaffectedsoc, VideoRecordEventStart<T> videoRecordEventStart) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = usesaffectedsoc;
            this.TuitionPaymentFragmentbindingInflater1 = videoRecordEventStart;
        }

        @Override // defpackage.usesAffectedSoc
        public final void TuitionPaymentFragmentbindingInflater1(logToString<? super BufferProviderState> logtostring) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(logtostring);
        }

        @Override // defpackage.VideoRecordEventStart
        public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
            this.TuitionPaymentFragmentbindingInflater1.subscribe(derivemediatype);
        }
    }

    public static <T> usesAffectedSoc<T> TuitionPaymentFragmentbindingInflater1(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, int i) {
        if (i != Integer.MAX_VALUE) {
            g gVar = new g(i);
            AtomicReference atomicReference = new AtomicReference();
            return new ObservableReplay(new a(atomicReference, gVar), autoValue_VideoValidatedEncoderProfilesProxy, atomicReference, gVar);
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        AtomicReference atomicReference2 = new AtomicReference();
        return new ObservableReplay(new a(atomicReference2, tuitionPaymentFragmentspecialinlinedviewModeldefault3), autoValue_VideoValidatedEncoderProfilesProxy, atomicReference2, tuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public static <T> usesAffectedSoc<T> TuitionPaymentFragmentbindingInflater1(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
        asBinder asbinder = new asBinder(Integer.MAX_VALUE, j, timeUnit, appendbackupvideoprofile);
        AtomicReference atomicReference = new AtomicReference();
        return new ObservableReplay(new a(atomicReference, asbinder), autoValue_VideoValidatedEncoderProfilesProxy, atomicReference, asbinder);
    }
}

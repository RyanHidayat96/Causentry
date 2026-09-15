package io.reactivex.internal.operators.observable;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController$$ExternalSyntheticLambda1;
import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.VideoEncoderSessionExternalSyntheticLambda6;
import defpackage.VideoOutputSourceState;
import defpackage.abortCapture;
import defpackage.acquireBuffer;
import defpackage.deriveMediaType;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.initSession;
import defpackage.notifySuspended;
import defpackage.readableMs;
import defpackage.share;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableFlatMapCompletable<T> extends notifySuspended<T, T> {
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private readableMs<? super T, ? extends VideoEncoderSessionExternalSyntheticLambda6> b;

    public ObservableFlatMapCompletable(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, readableMs<? super T, ? extends VideoEncoderSessionExternalSyntheticLambda6> readablems, boolean z) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.b = readablems;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = z;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new FlatMapCompletableMainObserver(derivemediatype, this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
    }

    static final class FlatMapCompletableMainObserver<T> extends BasicIntQueueDisposable<T> implements deriveMediaType<T> {
        private static final long serialVersionUID = 8443155186132538303L;
        final boolean delayErrors;
        volatile boolean disposed;
        final deriveMediaType<? super T> downstream;
        final readableMs<? super T, ? extends VideoEncoderSessionExternalSyntheticLambda6> mapper;
        BufferProviderState upstream;
        private static final byte[] $$c = {49, 89, 41, 48};
        private static final int $$f = 87;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {48, -119, -71, 110, 17, -6, 18, 1, -2, -1, -50, 73, 6, -1, 4, 3, 7, 6, -66, 76, -62, -2, 67, -4, 3, 9, -4, -47, 73, -10, 18, 4, -6, 10, 3, -60, 35, 28, 3, 9, -4, -26, 48, 3, 10, 2, 1, 1, 4, -3, 17, -43, 48, 2, 7, -11, 23, -76, 52, 34, -13, 17, 9, 1, 3, 7, 6, -45, 48, 3, 10, 2, 1, 1, 11, -46, 51, -3, -51, 3, 37, -8, 15, -7, 10, 3, -26, 21, 28, -8, -4, 13, 10, -42, 48, -13, 10, 10, -4, 13, 10, 3, 1, -7, 2, 10, -4, 15, 1, 9, 2, 1, 9, -5, 3, 22, -9, 0, 22, -38, 38, -7, 5, 11, -4, 5, 5, -1, 24, -5, 12, -63};
        private static final int $$e = 230;
        private static final byte[] $$a = {33, -59, 107, -108, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, -9, -7, 1, -8, -16, -2, -21, -7, -15, -8, -7, -15, -1, -9, -28, 3, -6, -28, 32, -44, 1, -11, -17, -2, -11, -11, -5, -30, -1, -18, 55, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
        private static final int $$b = 65;
        private static int TuitionPaymentFragmentbindingInflater1 = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -3774992689601524129L;
        final AtomicThrowable errors = new AtomicThrowable();
        final acquireBuffer set = new acquireBuffer();

        public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
            int i7 = ~i3;
            int i8 = ~i2;
            int i9 = (~(i7 | i8)) | i6;
            int i10 = ~(i3 | i2);
            int i11 = i9 | i10;
            int i12 = ~i6;
            int i13 = (~(i12 | i2)) | (~(i12 | i3)) | i10;
            int i14 = (~(i7 | i2)) | (~(i8 | i3));
            int i15 = i3 + i2 + i5 + (1040777104 * i) + ((-1861505373) * i4);
            int i16 = i15 * i15;
            int i17 = (i3 * (-1036928585)) + 527892480 + ((-1036928585) * i2) + ((-562525036) * i11) + (562525036 * i13) + ((-281262518) * i14) + ((-1318191104) * i5) + (1608515584 * i) + ((-1123418112) * i4) + ((-2114519040) * i16);
            int i18 = (i3 * 1703033811) + 1712528133 + (i2 * 1703033811) + (i11 * 1508) + (i13 * (-1508)) + (i14 * 754) + (i5 * 1703034565) + (i * (-2114876976)) + (i4 * 1880022383) + (i16 * (-720175104));
            return i17 + ((i18 * i18) * (-739180544)) != 1 ? TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr) : TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:8:0x001a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(byte r6, int r7, byte r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 14
                int r6 = 98 - r6
                int r0 = r8 + 1
                int r7 = r7 * 52
                int r7 = r7 + 4
                byte[] r1 = io.reactivex.internal.operators.observable.ObservableFlatMapCompletable.FlatMapCompletableMainObserver.$$a
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L14
                r3 = r7
                r4 = r2
                goto L2a
            L14:
                r3 = r2
            L15:
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r8) goto L22
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L22:
                int r3 = r3 + 1
                r4 = r1[r7]
                r5 = r3
                r3 = r6
                r6 = r4
                r4 = r5
            L2a:
                int r6 = -r6
                int r7 = r7 + 1
                int r3 = r3 + r6
                int r6 = r3 + (-10)
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableFlatMapCompletable.FlatMapCompletableMainObserver.a(byte, int, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(int r5, int r6, byte r7, java.lang.Object[] r8) {
            /*
                byte[] r0 = io.reactivex.internal.operators.observable.ObservableFlatMapCompletable.FlatMapCompletableMainObserver.$$d
                int r5 = r5 * 76
                int r5 = r5 + 4
                int r7 = r7 * 24
                int r1 = r7 + 53
                int r6 = r6 * 13
                int r6 = r6 + 84
                byte[] r1 = new byte[r1]
                int r7 = r7 + 52
                r2 = 0
                if (r0 != 0) goto L19
                r4 = r6
                r6 = r7
                r3 = r2
                goto L2b
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r7) goto L27
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L27:
                r4 = r0[r5]
                int r3 = r3 + 1
            L2b:
                int r5 = r5 + 1
                int r6 = r6 + r4
                int r6 = r6 + (-4)
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableFlatMapCompletable.FlatMapCompletableMainObserver.d(int, int, byte, java.lang.Object[]):void");
        }

        private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            abortCapture abortcapture = new abortCapture();
            char[] cArrB = abortCapture.b(TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ (-2687588926731523482L), cArr, i);
            abortcapture.b = 4;
            int i3 = $10 + 97;
            $11 = i3 % 128;
            while (true) {
                int i4 = i3 % 2;
                if (abortcapture.b >= cArrB.length) {
                    objArr[0] = new String(cArrB, 4, cArrB.length - 4);
                    return;
                }
                int i5 = $10 + 25;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
                int i7 = abortcapture.b;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 64837), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1355, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 38, 894276454, false, $$g(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {abortcapture, abortcapture};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ExpandableListView.getPackedPositionGroup(0L) + 47773), 467 - Process.getGidForName(""), 12 - ((byte) KeyEvent.getModifierMetaStateMask()), 896083767, false, "n", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    i3 = $11 + 125;
                    $10 = i3 % 128;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }

        FlatMapCompletableMainObserver(deriveMediaType<? super T> derivemediatype, readableMs<? super T, ? extends VideoEncoderSessionExternalSyntheticLambda6> readablems, boolean z) {
            this.downstream = derivemediatype;
            this.mapper = readablems;
            this.delayErrors = z;
            lazySet(1);
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            if (!DisposableHelper.b(this.upstream, bufferProviderState)) {
                return;
            }
            this.upstream = bufferProviderState;
            this.downstream.onSubscribe(this);
            int i4 = TuitionPaymentFragmentbindingInflater1 + 51;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
        }

        final class InnerObserver extends AtomicReference<BufferProviderState> implements VideoOutputSourceState, BufferProviderState {
            private static final long serialVersionUID = 8606673141535671828L;

            InnerObserver() {
            }

            @Override // defpackage.VideoOutputSourceState
            public final void onSubscribe(BufferProviderState bufferProviderState) {
                DisposableHelper.TuitionPaymentFragmentbindingInflater1(this, bufferProviderState);
            }

            @Override // defpackage.VideoOutputSourceState, defpackage.errorToString
            public final void onComplete() {
                FlatMapCompletableMainObserver flatMapCompletableMainObserver = FlatMapCompletableMainObserver.this;
                flatMapCompletableMainObserver.set.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
                flatMapCompletableMainObserver.onComplete();
            }

            @Override // defpackage.VideoOutputSourceState
            public final void onError(Throwable th) {
                FlatMapCompletableMainObserver flatMapCompletableMainObserver = FlatMapCompletableMainObserver.this;
                flatMapCompletableMainObserver.set.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
                flatMapCompletableMainObserver.onError(th);
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

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char cRgb = (char) (Color.rgb(0, 0, 0) + 16808749);
                int iMyPid = 921 - (Process.myPid() >> 22);
                int iRed = 28 - Color.red(0);
                byte b = $$a[80];
                byte b2 = b;
                Object[] objArr2 = new Object[1];
                a(b, b2, b2, objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cRgb, iMyPid, iRed, -1048449946, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(new char[]{22902, 22807, 57232, 64455, 56923, 15125, 38477, 22476, 51709, 20147, 1897, 50868, 30929, 48565, 46159, 46389, 60323, 11601, 9521, 9255, 6795, 40013, 21045, 35649, 36193, 769}, 1 - Color.argb(0, 0, 0, 0), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(new char[]{58232, 58141, 45390, 38171, 41830, 43030, 60277, 50381, 29679, 8291, 31316, 21963, 49877, 54139, 51504, 9745, 20925, 17299, 22557}, View.MeasureSpec.getMode(0) + 1, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 31534);
                int iIndexOf = 921 - TextUtils.indexOf("", "");
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 29;
                byte[] bArr = $$a;
                byte b3 = bArr[7];
                byte b4 = bArr[80];
                Object[] objArr5 = new Object[1];
                a(b3, b4, (byte) (b4 | 52), objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, iIndexOf, iLastIndexOf, -778300370, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                int i2 = TuitionPaymentFragmentbindingInflater1 + 29;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                int i3 = i2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cResolveSizeAndState = (char) (31533 - View.resolveSizeAndState(0, 0, 0));
                    int iResolveSizeAndState = 921 - View.resolveSizeAndState(0, 0, 0);
                    int iIndexOf2 = 27 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    byte b5 = $$a[7];
                    byte b6 = b5;
                    Object[] objArr6 = new Object[1];
                    a(b5, b6, (byte) (b6 | 36), objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSizeAndState, iResolveSizeAndState, iIndexOf2, -1142834547, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
                int iMyUid = Process.myUid();
                int i4 = ~iMyUid;
                int i5 = ~((-716758216) | i4);
                int i6 = ~((-1057321429) | iMyUid);
                int i7 = (-414465930) + ((i5 | i6) * 1150) + (((~(1057321428 | i4)) | i6) * (-575)) + (((~(iMyUid | (-716758216))) | (~(i4 | 716758215))) * 575) + 1336874669;
                int i8 = (i7 << 13) ^ i7;
                int i9 = i8 ^ (i8 >>> 17);
                ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                c(new char[]{43669, 43764, 17723, 24940, 33132, 56123, 51578, 47074, 14878, 54296, 22622, 9882, 35644, 10013, 60198, 21862, 6264, 47082, 31238, 50181, 59763, 1740, 3354, 27513, 32437, 39337, 40440, 39489, 53164, 59545}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(new char[]{19353, 19450, 41502, 34386, 17564, 63678, 3228, 37991, 56088, 13089, 40382, 1392, 27169, 49187, 11978, 30372, 63830, 20694, 49142, 59264, 2150, 57845}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    int i10 = TuitionPaymentFragmentbindingInflater1 + 15;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
                    if (i10 % 2 == 0) {
                        boolean z = applicationContext instanceof ContextWrapper;
                        throw null;
                    }
                    if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                        applicationContext = null;
                    } else {
                        applicationContext = applicationContext.getApplicationContext();
                        int i11 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 13;
                        TuitionPaymentFragmentbindingInflater1 = i11 % 128;
                        int i12 = i11 % 2;
                    }
                }
                Object[] objArr10 = new Object[1];
                c(new char[]{16233, 16131, 19375, 28663, 9193, 200, 27629, 27650, 44963, 55942, 64222, 64809, 7878, 10712, 18816, 36546, 36278, 47462, 55442, 8178}, -TextUtils.lastIndexOf("", '0'), objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                c(new char[]{14065, 13976, 54345, 61460, 60962, 12014, 42549, 16939, 42593, 17760, 14080, 54040, 6001, 46708, 33899, 41205, 33822, 9886, 5464, 12764}, TextUtils.getCapsMode("", 0, 0) + 1, objArr11);
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue()), 0, 1336874669};
                    byte[] bArr2 = $$d;
                    byte b7 = bArr2[117];
                    byte b8 = bArr2[7];
                    Object[] objArr13 = new Object[1];
                    d(b7, b8, b8, objArr13);
                    Class<?> cls4 = Class.forName((String) objArr13[0]);
                    byte b9 = bArr2[7];
                    byte b10 = bArr2[117];
                    Object[] objArr14 = new Object[1];
                    d(b9, b10, b10, objArr14);
                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char deadChar = (char) (31533 - KeyEvent.getDeadChar(0, 0));
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 921;
                        int iLastIndexOf2 = 27 - TextUtils.lastIndexOf("", '0', 0, 0);
                        byte b11 = $$a[7];
                        byte b12 = b11;
                        Object[] objArr16 = new Object[1];
                        a(b11, b12, (byte) (b12 | 36), objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(deadChar, keyRepeatTimeout, iLastIndexOf2, -1142834547, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        c(new char[]{22902, 22807, 57232, 64455, 56923, 15125, 38477, 22476, 51709, 20147, 1897, 50868, 30929, 48565, 46159, 46389, 60323, 11601, 9521, 9255, 6795, 40013, 21045, 35649, 36193, 769}, Color.alpha(0) + 1, objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        c(new char[]{58232, 58141, 45390, 38171, 41830, 43030, 60277, 50381, 29679, 8291, 31316, 21963, 49877, 54139, 51504, 9745, 20925, 17299, 22557}, 1 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c = (char) (31533 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                            int maximumFlingVelocity = 921 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int iCombineMeasuredStates = 28 - View.combineMeasuredStates(0, 0);
                            byte[] bArr3 = $$a;
                            byte b13 = bArr3[7];
                            byte b14 = bArr3[80];
                            Object[] objArr19 = new Object[1];
                            a(b13, b14, (byte) (b14 | 52), objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, maximumFlingVelocity, iCombineMeasuredStates, -778300370, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cLastIndexOf = (char) (31532 - TextUtils.lastIndexOf("", '0', 0));
                            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 922;
                            int i13 = 28 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            byte b15 = $$a[80];
                            byte b16 = b15;
                            Object[] objArr20 = new Object[1];
                            a(b15, b16, b16, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cLastIndexOf, packedPositionChild, i13, -1048449946, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        objArr = objArr15;
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
            int i14 = ((int[]) objArr[1])[0];
            int i15 = ((int[]) objArr[3])[0];
            if (i15 != i14) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[4];
                if (strArr != null) {
                    int i16 = TuitionPaymentFragmentbindingInflater1 + 59;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i16 % 128;
                    int i17 = i16 % 2;
                    for (String str : strArr) {
                        arrayList.add(str);
                    }
                }
                throw new RuntimeException(String.valueOf(i15));
            }
            int i18 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iNextInt = new Random().nextInt();
            int i19 = i18 + ((((~((-1764593337) | iNextInt)) | 1774006619) * 262) - 102018921) + (((~((~iNextInt) | (-1764593337))) | 1774006619) * 262);
            int i20 = (i19 << 13) ^ i19;
            int i21 = i20 ^ (i20 >>> 17);
            ((int[]) objArr21[0])[0] = i21 ^ (i21 << 5);
            try {
                VideoEncoderSessionExternalSyntheticLambda6 videoEncoderSessionExternalSyntheticLambda6Apply = this.mapper.apply(t);
                int i22 = ((int[]) objArr21[0])[0];
                int i23 = i22 * i22;
                int i24 = -(1363298811 * i22);
                int i25 = ((i23 | i24) << 1) - (i23 ^ i24);
                int i26 = -(i22 * 140448961);
                int i27 = (((i25 | i26) << 1) - (i26 ^ i25)) - 1058953596;
                int i28 = i27 >> 16;
                int i29 = (((-131071) & i28) + (i28 | (-131071))) / 65536;
                int i30 = (i29 & 1) + (i29 | 1);
                int i31 = ((i27 | i30) << 1) - (i30 ^ i27);
                int i32 = i27 >> 17;
                int i33 = -(i31 ^ (((((-65535) ^ i32) + ((i32 & (-65535)) << 1)) / 32768) + 1));
                int i34 = (i33 & 3) + (i33 | 3);
                int i35 = i34 >> 29;
                int i36 = ((i35 & (-15)) + (i35 | (-15))) / 8;
                int i37 = (i36 ^ 1) + ((i36 & 1) << 1);
                VideoEncoderSessionExternalSyntheticLambda6 videoEncoderSessionExternalSyntheticLambda6 = (VideoEncoderSessionExternalSyntheticLambda6) share.b(videoEncoderSessionExternalSyntheticLambda6Apply, "29|28|27|The mapper returned a null CompletableSource".substring(8100 / (((-((i37 ^ 1) + ((i37 & 1) << 1))) & i34) * 300)));
                getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if ((!this.disposed) && this.set.TuitionPaymentFragmentspecialinlinedviewModeldefault3(innerObserver)) {
                    videoEncoderSessionExternalSyntheticLambda6.b(innerObserver);
                }
            } catch (Throwable th2) {
                dumpMediaCodecListForFormat.b(th2);
                this.upstream.dispose();
                onError(th2);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            int i = 2 % 2;
            if (!ExceptionHelper.TuitionPaymentFragmentbindingInflater1(this.errors, th)) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
                return;
            }
            int i2 = TuitionPaymentFragmentbindingInflater1 + 121;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            if (!this.delayErrors) {
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                TuitionPaymentFragmentspecialinlinedviewModeldefault2(DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1797071206, -1797071206, DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[]{this});
                if (getAndSet(0) > 0) {
                    this.downstream.onError(ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.errors));
                    return;
                }
                return;
            }
            if (decrementAndGet() == 0) {
                int i4 = TuitionPaymentFragmentbindingInflater1 + 19;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                if (i4 % 2 != 0) {
                    this.downstream.onError(ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.errors));
                } else {
                    this.downstream.onError(ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.errors));
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 113;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            if (i2 % 2 == 0) {
                decrementAndGet();
                throw null;
            }
            if (decrementAndGet() == 0) {
                Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.errors);
                if (thTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                    this.downstream.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    return;
                }
                this.downstream.onComplete();
                int i3 = TuitionPaymentFragmentbindingInflater1 + 13;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                int i4 = i3 % 2;
            }
        }

        private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
            FlatMapCompletableMainObserver flatMapCompletableMainObserver = (FlatMapCompletableMainObserver) objArr[0];
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 95;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            flatMapCompletableMainObserver.disposed = true;
            flatMapCompletableMainObserver.upstream.dispose();
            flatMapCompletableMainObserver.set.dispose();
            int i4 = TuitionPaymentFragmentbindingInflater1 + 11;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 25;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            boolean zIsDisposed = this.upstream.isDisposed();
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 123;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
            return zIsDisposed;
        }

        @Override // defpackage.AudioSettingsBuilder
        public final void TuitionPaymentFragmentbindingInflater1() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 61;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1797071206, -1797071206, DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[]{this});
        }

        @Override // defpackage.AudioSettingsBuilder
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 57;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 65;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            if (i5 % 2 == 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // defpackage.AudioSettingsBuilder
        public final T TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Exception {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            return (T) TuitionPaymentFragmentspecialinlinedviewModeldefault2(DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1489335311, -1489335310, DefaultHeartBeatController$$ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new Object[]{this});
        }

        @Override // defpackage.VideoValidatedEncoderProfilesProxy
        public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
            int i2 = 2 % 2;
            int i3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 71;
            int i4 = i3 % 128;
            TuitionPaymentFragmentbindingInflater1 = i4;
            int i5 = i3 % 2;
            int i6 = i & 2;
            int i7 = i4 + 101;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i7 % 128;
            if (i7 % 2 != 0) {
                return i6;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 35;
            int i3 = i2 % 128;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 21;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            if (i5 % 2 == 0) {
                return null;
            }
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(int r6, short r7, int r8) {
            /*
                int r6 = r6 * 3
                int r6 = 107 - r6
                int r8 = r8 * 2
                int r8 = 4 - r8
                int r7 = r7 * 3
                int r0 = r7 + 1
                byte[] r1 = io.reactivex.internal.operators.observable.ObservableFlatMapCompletable.FlatMapCompletableMainObserver.$$c
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L16
                r3 = r8
                r4 = r2
                goto L2a
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r6
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r7) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L24:
                r3 = r1[r8]
                r5 = r8
                r8 = r6
                r6 = r3
                r3 = r5
            L2a:
                int r6 = -r6
                int r6 = r6 + r8
                int r8 = r3 + 1
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableFlatMapCompletable.FlatMapCompletableMainObserver.$$g(int, short, int):java.lang.String");
        }
    }
}

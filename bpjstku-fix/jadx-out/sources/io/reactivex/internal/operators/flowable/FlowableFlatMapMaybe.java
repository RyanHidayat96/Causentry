package io.reactivex.internal.operators.flowable;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
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
import android.widget.Toast;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import defpackage.Absent;
import defpackage.AudioConfig;
import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.OutputTransform;
import defpackage.VideoRecordEvent;
import defpackage.VideoRecordEventPause;
import defpackage.VideoSpecBuilder;
import defpackage.acquireBuffer;
import defpackage.createMediaMuxer;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.errorToString;
import defpackage.initSession;
import defpackage.isSonyG3125;
import defpackage.lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder;
import defpackage.lambdasetAudioSourceCallback6androidxcameravideointernalaudioAudioSource;
import defpackage.readableMs;
import defpackage.setOrVerifyExpectFrameRateRange;
import defpackage.share;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class FlowableFlatMapMaybe<T, R> extends lambdasetAudioSourceCallback6androidxcameravideointernalaudioAudioSource<T, R> {
    private readableMs<? super T, ? extends VideoSpecBuilder<? extends R>> TuitionPaymentFragmentbindingInflater1;
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public FlowableFlatMapMaybe(VideoRecordEvent<T> videoRecordEvent, readableMs<? super T, ? extends VideoSpecBuilder<? extends R>> readablems, boolean z, int i) {
        super(videoRecordEvent);
        this.TuitionPaymentFragmentbindingInflater1 = readablems;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = false;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Integer.MAX_VALUE;
    }

    @Override // defpackage.VideoRecordEvent
    public final void TuitionPaymentFragmentbindingInflater1(AudioConfig<? super R> audioConfig) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(new FlatMapMaybeSubscriber(audioConfig, this.TuitionPaymentFragmentbindingInflater1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class FlatMapMaybeSubscriber<T, R> extends AtomicInteger implements VideoRecordEventPause<T>, OutputTransform {
        private static final long serialVersionUID = 8600231336733376951L;
        volatile boolean cancelled;
        final boolean delayErrors;
        final AudioConfig<? super R> downstream;
        final readableMs<? super T, ? extends VideoSpecBuilder<? extends R>> mapper;
        final int maxConcurrency;
        OutputTransform upstream;
        private static final byte[] $$c = {57, -56, 23, -36};
        private static final int $$d = 171;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {33, -59, 107, -108, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
        private static final int $$b = 191;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        private static int TuitionPaymentFragmentbindingInflater1 = 1;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -83722444;
        final AtomicLong requested = new AtomicLong();
        final acquireBuffer set = new acquireBuffer();
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicInteger active = new AtomicInteger(1);
        final AtomicReference<createMediaMuxer<R>> queue = new AtomicReference<>();

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(byte r6, byte r7, short r8, java.lang.Object[] r9) {
            /*
                int r0 = r8 + 1
                int r6 = r6 * 52
                int r6 = 56 - r6
                byte[] r1 = io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber.$$a
                int r7 = r7 * 14
                int r7 = r7 + 84
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L15
                r7 = r6
                r3 = r8
                r4 = r2
                goto L2c
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r7
                r0[r3] = r4
                if (r3 != r8) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L23:
                r4 = r1[r6]
                int r3 = r3 + 1
                r5 = r7
                r7 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L2c:
                int r3 = r3 + r6
                int r6 = r3 + (-11)
                int r7 = r7 + 1
                r3 = r4
                r5 = r7
                r7 = r6
                r6 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber.a(byte, byte, short, java.lang.Object[]):void");
        }

        FlatMapMaybeSubscriber(AudioConfig<? super R> audioConfig, readableMs<? super T, ? extends VideoSpecBuilder<? extends R>> readablems, boolean z, int i) {
            this.downstream = audioConfig;
            this.mapper = readablems;
            this.delayErrors = z;
            this.maxConcurrency = i;
        }

        final class InnerObserver extends AtomicReference<BufferProviderState> implements errorToString<R>, BufferProviderState {
            private static final long serialVersionUID = -502562646270949838L;
            private static final byte[] $$c = {89, 107, -36, -112};
            private static final int $$f = 75;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {29, -5, -24, -13, -13, 1, 62, -52, -14, 9, -15, 2, 5, 4, 53, -73, 6, 2, -1, 6, -21, 74, -20, -51, -7, 10, 10, 16, -20, -13, -5, 15, -15, -2, 34, -37, 15, -17, 15, -34, 11, -12, 10, -7, 0, 29, -18, -25, 11, 7, -10, -7, 45, -45, 16, -7, -7, 7, -10, -7, 0, 2, 10, 1, -7, 7, -12, 2, -6, 1, 2, -6, 8, 0, -19, 12, 3, -19, 41, -35, 10, -2, -8, 7, -2, -2, 4, -21, 8, -9, 65, 13, -16, 47, -38, -11, 2, 3, 10, -25, 43, -35, 10, -2};
            private static final int $$e = 160;
            private static final byte[] $$a = {117, 57, 101, -72, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55};
            private static final int $$b = 254;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            private static int b = 1;
            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {6172, 53908, 36119, 18330, 12814, 60599, 42803, 37346, 19498, 1713, 61717, 44003, 26192, 20693, 2923, 50673, 45152, 27337, 9583, 4119, 51858, 34053, 37427, 22717, 1849, 52659, 47161, 26256, 11544, 7093, 50699, 35976, 31612, 8687, 60523, 56032, 33105, 51271, 719, 23884, 38849, 57941, 15596, 30568, 16825, 40063, 55017, 8464, 31685, 46643, 32926, 56112, 5542, 24608, 47800, 62764, 49242, 6910, 21853, 45006, 64098, 13551, 3949, 45567, 31598, 9440, 61051, 39909, 17745, 3778, 14444, 58836, 44883, 22710, 568, 53163, 63782, 41610, 27676, 6531, 49925, 45558, 31610, 9444, 61032, 39854, 17747, 3799, 14403, 58819, 44813, 22665, 552, 53179, 63795, 41627, 27672, 38557, 23575, 927, 51471, 48284, 25150, 10666, 7996, 49796, 34858, 32705, 9553, 59619, 56896, 34290, 19320};
            private static long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = -8412880482928919781L;

            /* JADX WARN: Code duplicated, block: B:10:0x0026  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(short r6, byte r7, int r8, java.lang.Object[] r9) {
                /*
                    int r6 = 93 - r6
                    int r8 = r8 * 14
                    int r8 = 98 - r8
                    int r0 = 53 - r7
                    byte[] r1 = io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber.InnerObserver.$$a
                    byte[] r0 = new byte[r0]
                    int r7 = 52 - r7
                    r2 = 0
                    if (r1 != 0) goto L15
                    r4 = r8
                    r3 = r2
                    r8 = r6
                    goto L2a
                L15:
                    r3 = r2
                    r5 = r8
                    r8 = r6
                    r6 = r5
                L19:
                    byte r4 = (byte) r6
                    r0[r3] = r4
                    if (r3 != r7) goto L26
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L26:
                    int r3 = r3 + 1
                    r4 = r1[r8]
                L2a:
                    int r4 = -r4
                    int r6 = r6 + r4
                    int r8 = r8 + 1
                    int r6 = r6 + (-11)
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber.InnerObserver.a(short, byte, int, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0024  */
            /* JADX WARN: Code duplicated, block: B:8:0x001b  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(short r6, int r7, byte r8, java.lang.Object[] r9) {
                /*
                    int r8 = 115 - r8
                    int r6 = 91 - r6
                    int r0 = r7 + 14
                    byte[] r1 = io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber.InnerObserver.$$d
                    byte[] r0 = new byte[r0]
                    int r7 = r7 + 13
                    r2 = -1
                    if (r1 != 0) goto L13
                    r3 = r8
                    r4 = r2
                    r8 = r6
                    goto L2b
                L13:
                    r3 = r2
                L14:
                    int r3 = r3 + 1
                    byte r4 = (byte) r8
                    r0[r3] = r4
                    if (r3 != r7) goto L24
                    java.lang.String r6 = new java.lang.String
                    r7 = 0
                    r6.<init>(r0, r7)
                    r9[r7] = r6
                    return
                L24:
                    r4 = r1[r6]
                    r5 = r8
                    r8 = r6
                    r6 = r4
                    r4 = r3
                    r3 = r5
                L2b:
                    int r6 = -r6
                    int r8 = r8 + 1
                    int r3 = r3 + r6
                    int r6 = r3 + (-1)
                    r3 = r4
                    r5 = r8
                    r8 = r6
                    r6 = r5
                    goto L14
                */
                throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber.InnerObserver.d(short, int, byte, java.lang.Object[]):void");
            }

            private static void c(int i, int i2, char c, Object[] objArr) throws Throwable {
                int i3 = 2;
                int i4 = 2 % 2;
                lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder = new lambdabuild0androidxcameracoreimplSessionConfigValidatingBuilder();
                long[] jArr = new long[i2];
                lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                    int i5 = $11 + 1;
                    $10 = i5 % 128;
                    if (i5 % i3 != 0) {
                        int i6 = lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        try {
                            Object[] objArr2 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2[i / i6])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Gravity.getAbsoluteGravity(0, 0), 2186 - TextUtils.lastIndexOf("", '0', 0), 40 - (ViewConfiguration.getJumpTapTimeout() >> 16), 841711447, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            Object[] objArr3 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), Integer.valueOf(c)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (KeyEvent.getDeadChar(0, 0) + 33017), 3010 - ((byte) KeyEvent.getModifierMetaStateMask()), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 26, 321985076, false, $$g(b4, b5, (byte) (b5 + 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                            }
                            jArr[i6] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).longValue();
                            Object[] objArr4 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (36505 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), TextUtils.getTrimmedLength("") + 3376, View.resolveSize(0, 0) + 17, -968507904, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
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
                        try {
                            Object[] objArr5 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2[i + i7])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-692725632);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b8 = (byte) 0;
                                byte b9 = b8;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.lastIndexOf("", '0') + 2188, 40 - View.resolveSizeAndState(0, 0, 0), 841711447, false, $$g(b8, b9, b9), new Class[]{Integer.TYPE});
                            }
                            try {
                                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).longValue()), Long.valueOf(i7), Long.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), Integer.valueOf(c)};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-139477533);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    byte b10 = (byte) 0;
                                    byte b11 = b10;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 33018), ExpandableListView.getPackedPositionChild(0L) + 3012, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 27, 321985076, false, $$g(b10, b11, (byte) (b11 + 2)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                                }
                                jArr[i7] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).longValue();
                                Object[] objArr7 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    byte b12 = (byte) 0;
                                    byte b13 = b12;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 36505), View.MeasureSpec.getMode(0) + 3376, TextUtils.lastIndexOf("", '0', 0, 0) + 18, -968507904, false, $$g(b12, b13, (byte) (b13 + 1)), new Class[]{Object.class, Object.class});
                                }
                                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7);
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        } catch (Throwable th3) {
                            Throwable cause3 = th3.getCause();
                            if (cause3 == null) {
                                throw th3;
                            }
                            throw cause3;
                        }
                    }
                    i3 = 2;
                }
                char[] cArr = new char[i2];
                lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                while (lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < i2) {
                    int i8 = $11 + 53;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    cArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) jArr[lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1];
                    Object[] objArr8 = {lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder, lambdabuild0androidxcameracoreimplsessionconfigvalidatingbuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(584784343);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        byte b14 = (byte) 0;
                        byte b15 = b14;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b((char) (36505 - View.getDefaultSize(0, 0)), 3377 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), TextUtils.indexOf("", "", 0, 0) + 17, -968507904, false, $$g(b14, b15, (byte) (b15 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr8);
                    int i10 = $11 + 93;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                }
                objArr[0] = new String(cArr);
                int i12 = $11 + 125;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = 20 / 0;
                }
            }

            InnerObserver() {
            }

            @Override // defpackage.errorToString
            public final void onSubscribe(BufferProviderState bufferProviderState) {
                int i = 2 % 2;
                int i2 = b + 57;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                int i3 = i2 % 2;
                DisposableHelper.TuitionPaymentFragmentbindingInflater1(this, bufferProviderState);
                int i4 = b + 67;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Code duplicated, block: B:35:0x007c  */
            /* JADX WARN: Code duplicated, block: B:41:0x0090 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:47:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // defpackage.errorToString
            public final void b(R r) {
                createMediaMuxer<R> createmediamuxerTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                FlatMapMaybeSubscriber flatMapMaybeSubscriber = FlatMapMaybeSubscriber.this;
                flatMapMaybeSubscriber.set.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
                if (flatMapMaybeSubscriber.get() == 0) {
                    if (flatMapMaybeSubscriber.compareAndSet(0, 1)) {
                        boolean z = flatMapMaybeSubscriber.active.decrementAndGet() == 0;
                        if (flatMapMaybeSubscriber.requested.get() != 0) {
                            flatMapMaybeSubscriber.downstream.onNext(r);
                            createMediaMuxer<R> createmediamuxer = flatMapMaybeSubscriber.queue.get();
                            if (!z || (createmediamuxer != null && !createmediamuxer.TuitionPaymentFragmentspecialinlinedviewModeldefault1())) {
                                isSonyG3125.b(flatMapMaybeSubscriber.requested, 1L);
                                if (flatMapMaybeSubscriber.maxConcurrency != Integer.MAX_VALUE) {
                                    flatMapMaybeSubscriber.upstream.b(1L);
                                }
                            } else {
                                Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(flatMapMaybeSubscriber.errors);
                                if (thTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                                    flatMapMaybeSubscriber.downstream.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                    return;
                                } else {
                                    flatMapMaybeSubscriber.downstream.onComplete();
                                    return;
                                }
                            }
                        } else {
                            createMediaMuxer<R> createmediamuxerTuitionPaymentFragmentspecialinlinedviewModeldefault2 = flatMapMaybeSubscriber.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            synchronized (createmediamuxerTuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                createmediamuxerTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(r);
                            }
                        }
                        if (flatMapMaybeSubscriber.decrementAndGet() == 0) {
                            return;
                        }
                    } else {
                        createmediamuxerTuitionPaymentFragmentspecialinlinedviewModeldefault1 = flatMapMaybeSubscriber.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        synchronized (createmediamuxerTuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                            createmediamuxerTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(r);
                        }
                        flatMapMaybeSubscriber.active.decrementAndGet();
                        if (flatMapMaybeSubscriber.getAndIncrement() != 0) {
                            return;
                        }
                    }
                } else {
                    createmediamuxerTuitionPaymentFragmentspecialinlinedviewModeldefault1 = flatMapMaybeSubscriber.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    synchronized (createmediamuxerTuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                        createmediamuxerTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(r);
                        flatMapMaybeSubscriber.active.decrementAndGet();
                        if (flatMapMaybeSubscriber.getAndIncrement() != 0) {
                            return;
                        }
                    }
                }
                flatMapMaybeSubscriber.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            }

            @Override // defpackage.errorToString
            public final void onError(Throwable th) {
                int i = 2 % 2;
                int i2 = b + 47;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                int i3 = i2 % 2;
                FlatMapMaybeSubscriber flatMapMaybeSubscriber = FlatMapMaybeSubscriber.this;
                flatMapMaybeSubscriber.set.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
                if (ExceptionHelper.TuitionPaymentFragmentbindingInflater1(flatMapMaybeSubscriber.errors, th)) {
                    if (!flatMapMaybeSubscriber.delayErrors) {
                        int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 63;
                        b = i4 % 128;
                        if (i4 % 2 == 0) {
                            flatMapMaybeSubscriber.upstream.b();
                            flatMapMaybeSubscriber.set.dispose();
                            int i5 = 8 / 0;
                        } else {
                            flatMapMaybeSubscriber.upstream.b();
                            flatMapMaybeSubscriber.set.dispose();
                        }
                    } else if (flatMapMaybeSubscriber.maxConcurrency != Integer.MAX_VALUE) {
                        flatMapMaybeSubscriber.upstream.b(1L);
                    }
                    flatMapMaybeSubscriber.active.decrementAndGet();
                    if (flatMapMaybeSubscriber.getAndIncrement() == 0) {
                        int i6 = b + 27;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
                        int i7 = i6 % 2;
                        flatMapMaybeSubscriber.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        return;
                    }
                    return;
                }
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
            
                if (r6 != false) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
            
                if (r7.TuitionPaymentFragmentspecialinlinedviewModeldefault1() != false) goto L22;
             */
            @Override // defpackage.errorToString
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onComplete() {
                /*
                    r9 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe$FlatMapMaybeSubscriber r1 = io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber.this
                    acquireBuffer r2 = r1.set
                    r2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r9)
                    int r2 = r1.get()
                    r3 = 1
                    r5 = 2147483647(0x7fffffff, float:NaN)
                    if (r2 != 0) goto L99
                    int r2 = io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber.InnerObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault1
                    int r2 = r2 + 51
                    int r6 = r2 % 128
                    io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber.InnerObserver.b = r6
                    int r2 = r2 % r0
                    r2 = 0
                    r6 = 1
                    boolean r7 = r1.compareAndSet(r2, r6)
                    if (r7 == 0) goto L99
                    int r7 = io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber.InnerObserver.b
                    int r7 = r7 + 63
                    int r8 = r7 % 128
                    io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber.InnerObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r8
                    int r7 = r7 % r0
                    if (r7 != 0) goto L92
                    java.util.concurrent.atomic.AtomicInteger r7 = r1.active
                    int r7 = r7.decrementAndGet()
                    if (r7 != 0) goto L3a
                    goto L3b
                L3a:
                    r6 = r2
                L3b:
                    java.util.concurrent.atomic.AtomicReference<createMediaMuxer<R>> r7 = r1.queue
                    java.lang.Object r7 = r7.get()
                    createMediaMuxer r7 = (defpackage.createMediaMuxer) r7
                    if (r6 == 0) goto L76
                    if (r7 == 0) goto L62
                    int r6 = io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber.InnerObserver.b
                    int r6 = r6 + 121
                    int r8 = r6 % 128
                    io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber.InnerObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r8
                    int r6 = r6 % r0
                    if (r6 == 0) goto L5c
                    boolean r6 = r7.TuitionPaymentFragmentspecialinlinedviewModeldefault1()
                    r7 = 23
                    int r7 = r7 / r2
                    if (r6 == 0) goto L76
                    goto L62
                L5c:
                    boolean r2 = r7.TuitionPaymentFragmentspecialinlinedviewModeldefault1()
                    if (r2 == 0) goto L76
                L62:
                    io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                    java.lang.Throwable r0 = io.reactivex.internal.util.ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r0)
                    if (r0 == 0) goto L70
                    AudioConfig<? super R> r1 = r1.downstream
                    r1.onError(r0)
                    return
                L70:
                    AudioConfig<? super R> r0 = r1.downstream
                    r0.onComplete()
                    return
                L76:
                    int r2 = r1.maxConcurrency
                    if (r2 == r5) goto L7f
                    OutputTransform r2 = r1.upstream
                    r2.b(r3)
                L7f:
                    int r2 = r1.decrementAndGet()
                    if (r2 == 0) goto Lb0
                    int r2 = io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber.InnerObserver.b
                    int r2 = r2 + 19
                    int r3 = r2 % 128
                    io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber.InnerObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = r3
                    int r2 = r2 % r0
                    r1.TuitionPaymentFragmentspecialinlinedviewModeldefault3()
                    return
                L92:
                    java.util.concurrent.atomic.AtomicInteger r0 = r1.active
                    r0.decrementAndGet()
                    r0 = 0
                    throw r0
                L99:
                    java.util.concurrent.atomic.AtomicInteger r0 = r1.active
                    r0.decrementAndGet()
                    int r0 = r1.maxConcurrency
                    if (r0 == r5) goto La7
                    OutputTransform r0 = r1.upstream
                    r0.b(r3)
                La7:
                    int r0 = r1.getAndIncrement()
                    if (r0 != 0) goto Lb0
                    r1.TuitionPaymentFragmentspecialinlinedviewModeldefault3()
                Lb0:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber.InnerObserver.onComplete():void");
            }

            /* JADX WARN: Code duplicated, block: B:22:0x021d  */
            /* JADX WARN: Code duplicated, block: B:71:0x0767  */
            /* JADX WARN: Code duplicated, block: B:72:0x0769  */
            @Override // defpackage.BufferProviderState
            public final boolean isDisposed() throws Throwable {
                Object[] objArr;
                Object[] objArr2;
                int i = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 31533);
                    int deadChar = KeyEvent.getDeadChar(0, 0) + 921;
                    int iMyTid = (Process.myTid() >> 22) + 28;
                    Object[] objArr3 = new Object[1];
                    a((byte) 89, (byte) ($$b & 53), $$a[7], objArr3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(touchSlop, deadChar, iMyTid, -1048449946, false, (String) objArr3[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr4 = new Object[1];
                c(TextUtils.getTrimmedLength(""), (ViewConfiguration.getEdgeSlop() >> 16) + 22, (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 43489), objArr4);
                Class<?> cls = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                c((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21, TextUtils.lastIndexOf("", '0') + 16, (char) (Drawable.resolveOpacity(0, 0) + 9162), objArr5);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cNormalizeMetaState = (char) (31533 - KeyEvent.normalizeMetaState(0));
                    int mode = 921 - View.MeasureSpec.getMode(0);
                    int iArgb = Color.argb(0, 0, 0, 0) + 28;
                    byte[] bArr = $$a;
                    Object[] objArr6 = new Object[1];
                    a((byte) 89, bArr[7], bArr[5], objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cNormalizeMetaState, mode, iArgb, -778300370, false, (String) objArr6[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char gidForName = (char) (31532 - Process.getGidForName(""));
                        int i2 = 921 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int tapTimeout = 28 - (ViewConfiguration.getTapTimeout() >> 16);
                        Object[] objArr7 = new Object[1];
                        a((byte) 37, (byte) 15, $$a[5], objArr7);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(gidForName, i2, tapTimeout, -1142834547, false, (String) objArr7[0], null);
                    }
                    Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    int i3 = ((int[]) objArr8[3])[0];
                    objArr = new Object[]{new int[1], new int[]{((int[]) objArr8[1])[0]}, (Object[]) objArr8[2], new int[]{i3}, (String[]) objArr8[4]};
                    int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                    int i4 = ~iElapsedRealtime;
                    int i5 = ((1371272893 + (((~((-1176222853) | i4)) | (~((-597856792) | iElapsedRealtime))) * 210)) + (((~(iElapsedRealtime | (-1142500481))) | (~(i4 | (-564134420)))) * 210)) - 417592576;
                    int i6 = (i5 << 13) ^ i5;
                    int i7 = i6 ^ (i6 >>> 17);
                    ((int[]) objArr[0])[0] = i7 ^ (i7 << 5);
                } else {
                    Object[] objArr9 = new Object[1];
                    c(View.combineMeasuredStates(0, 0) + 37, ExpandableListView.getPackedPositionGroup(0L) + 26, (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 31162), objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    c(62 - ExpandableListView.getPackedPositionChild(0L), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 18, (char) Color.red(0), objArr10);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        if (applicationContext instanceof ContextWrapper) {
                            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
                            b = i8 % 128;
                            int i9 = i8 % 2;
                            if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                                applicationContext = applicationContext.getApplicationContext();
                            } else {
                                applicationContext = null;
                            }
                        } else {
                            applicationContext = applicationContext.getApplicationContext();
                        }
                    }
                    Object[] objArr11 = new Object[1];
                    c((-16777135) - Color.rgb(0, 0, 0), Color.green(0) + 16, (char) (ViewConfiguration.getEdgeSlop() >> 16), objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    c(97 - View.combineMeasuredStates(0, 0), Color.alpha(0) + 16, (char) (10088 - Color.alpha(0)), objArr12);
                    int iIntValue = ((Integer) cls3.getMethod((String) objArr12[0], Object.class).invoke(null, this)).intValue();
                    int i10 = b + 39;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
                    int i11 = i10 % 2;
                    try {
                        Object[] objArr13 = {applicationContext, Integer.valueOf(iIntValue), 0, -417592576};
                        byte b2 = (byte) 87;
                        byte[] bArr2 = $$d;
                        Object[] objArr14 = new Object[1];
                        d(b2, (byte) (b2 & 62), bArr2[27], objArr14);
                        Class<?> cls4 = Class.forName((String) objArr14[0]);
                        Object[] objArr15 = new Object[1];
                        d((byte) (-bArr2[7]), (byte) 39, (byte) 31, objArr15);
                        objArr = (Object[]) cls4.getMethod((String) objArr15[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char offsetBefore = (char) (31533 - TextUtils.getOffsetBefore("", 0));
                            int i12 = 922 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                            int i13 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28;
                            Object[] objArr16 = new Object[1];
                            a((byte) 37, (byte) 15, $$a[5], objArr16);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(offsetBefore, i12, i13, -1142834547, false, (String) objArr16[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                        try {
                            Object[] objArr17 = new Object[1];
                            c((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.green(0) + 22, (char) (ImageFormat.getBitsPerPixel(0) + 43490), objArr17);
                            Class<?> cls5 = Class.forName((String) objArr17[0]);
                            Object[] objArr18 = new Object[1];
                            c(22 - (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.indexOf("", "") + 15, (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 9162), objArr18);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 31533);
                                int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 921;
                                int iLastIndexOf = 27 - TextUtils.lastIndexOf("", '0', 0, 0);
                                byte[] bArr3 = $$a;
                                Object[] objArr19 = new Object[1];
                                a((byte) 89, bArr3[7], bArr3[5], objArr19);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(keyRepeatTimeout, keyRepeatDelay, iLastIndexOf, -778300370, false, (String) objArr19[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char mode2 = (char) (31533 - View.MeasureSpec.getMode(0));
                                int keyRepeatTimeout2 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 921;
                                int iBlue = 28 - Color.blue(0);
                                Object[] objArr20 = new Object[1];
                                a((byte) 89, (byte) ($$b & 53), $$a[7], objArr20);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(mode2, keyRepeatTimeout2, iBlue, -1048449946, false, (String) objArr20[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                int i14 = ((int[]) objArr[1])[0];
                int i15 = ((int[]) objArr[3])[0];
                if (i15 == i14) {
                    int i16 = b + 95;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i16 % 128;
                    int i17 = i16 % 2;
                    int i18 = ((int[]) objArr[0])[0];
                    int i19 = ((int[]) objArr[3])[0];
                    Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i19}, (String[]) objArr[4]};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i20 = (-403930261) + (((~((-91866939) | iIdentityHashCode)) | 71337760 | (~((-1682212706) | iIdentityHashCode))) * (-880));
                    int i21 = (~((-91866939) | (~iIdentityHashCode))) | 1682212705;
                    int i22 = ~(iIdentityHashCode | 91866938);
                    int i23 = i18 + i20 + ((i21 | i22) * (-880)) + (i22 * 880);
                    int i24 = (i23 << 13) ^ i23;
                    int i25 = i24 ^ (i24 >>> 17);
                    ((int[]) objArr21[0])[0] = i25 ^ (i25 << 5);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[4];
                    if (strArr != null) {
                        int i26 = b + 117;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i26 % 128;
                        int i27 = i26 % 2;
                        int i28 = 0;
                        while (i28 < strArr.length) {
                            arrayList.add(strArr[i28]);
                            i28++;
                            int i29 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 69;
                            b = i29 % 128;
                            int i30 = i29 % 2;
                        }
                    }
                    Toast.makeText((Context) null, i15 / (((i15 - 1) * i15) % 2), 0).show();
                    int i31 = ((int[]) objArr[0])[0];
                    int i32 = ((int[]) objArr[3])[0];
                    Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{i32}, (String[]) objArr[4]};
                    int iIdentityHashCode2 = System.identityHashCode(this);
                    int i33 = ~iIdentityHashCode2;
                    int i34 = i31 + 891401771 + (((~(i33 | 617653204)) | (~((-1156426440) | i33)) | 1076692995) * 464) + (((-79733445) | iIdentityHashCode2) * (-464)) + (((~(iIdentityHashCode2 | 617653204)) | 1076692995) * 464);
                    int i35 = (i34 << 13) ^ i34;
                    int i36 = i35 ^ (i35 >>> 17);
                    ((int[]) objArr22[0])[0] = i36 ^ (i36 << 5);
                }
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                    char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int iIndexOf = TextUtils.indexOf("", "", 0) + 2267;
                    int mode3 = 33 - View.MeasureSpec.getMode(0);
                    byte[] bArr4 = $$a;
                    Object[] objArr23 = new Object[1];
                    a((byte) 89, bArr4[7], bArr4[5], objArr23);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(maximumFlingVelocity, iIndexOf, mode3, -887667012, false, (String) objArr23[0], null);
                }
                long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).getLong(null);
                Object[] objArr24 = new Object[1];
                c(KeyEvent.keyCodeFromString(""), View.MeasureSpec.getSize(0) + 22, (char) (43489 - ExpandableListView.getPackedPositionType(0L)), objArr24);
                Class<?> cls6 = Class.forName((String) objArr24[0]);
                Object[] objArr25 = new Object[1];
                c(TextUtils.getOffsetAfter("", 0) + 22, 15 - Color.green(0), (char) (9162 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), objArr25);
                long jLongValue3 = ((Long) cls6.getDeclaredMethod((String) objArr25[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                    char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                    int keyRepeatDelay2 = 2267 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                    int iArgb2 = Color.argb(0, 0, 0, 0) + 33;
                    byte[] bArr5 = $$a;
                    byte b3 = bArr5[7];
                    Object[] objArr26 = new Object[1];
                    a(b3, b3, bArr5[5], objArr26);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(longPressTimeout, keyRepeatDelay2, iArgb2, -874156483, false, (String) objArr26[0], null);
                }
                if (j2 == ((jLongValue3 - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                        char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                        int iGreen = Color.green(0) + 2267;
                        int mirror = 'Q' - AndroidCharacter.getMirror('0');
                        Object[] objArr27 = new Object[1];
                        a((byte) 37, (byte) 15, $$a[5], objArr27);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(cResolveOpacity, iGreen, mirror, -654680577, false, (String) objArr27[0], null);
                    }
                    Object[] objArr28 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).get(null);
                    objArr2 = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
                    int i37 = ((int[]) objArr28[0])[0];
                    int i38 = ((int[]) objArr28[3])[0];
                    String[] strArr2 = (String[]) objArr28[1];
                    int iIdentityHashCode3 = System.identityHashCode(this);
                    int i39 = ~iIdentityHashCode3;
                    int i40 = 1185085132 + ((~((-529196681) | i39)) * 979) + ((iIdentityHashCode3 | 279516635) * (-979)) + (((~(iIdentityHashCode3 | (-529196681))) | (~(i39 | 279516635))) * 979) + 1308968028;
                    int i41 = (i40 << 13) ^ i40;
                    int i42 = i41 ^ (i41 >>> 17);
                    ((int[]) objArr2[2])[0] = i42 ^ (i42 << 5);
                } else {
                    Object[] objArr29 = new Object[1];
                    c(KeyEvent.normalizeMetaState(0) + 37, 26 - View.resolveSizeAndState(0, 0, 0), (char) (ExpandableListView.getPackedPositionChild(0L) + 31163), objArr29);
                    Class<?> cls7 = Class.forName((String) objArr29[0]);
                    Object[] objArr30 = new Object[1];
                    c(63 - (ViewConfiguration.getPressedStateDuration() >> 16), 18 - View.resolveSize(0, 0), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr30);
                    Context applicationContext2 = (Context) cls7.getMethod((String) objArr30[0], new Class[0]).invoke(null, null);
                    if (applicationContext2 != null) {
                        if (applicationContext2 instanceof ContextWrapper) {
                            int i43 = b + 67;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i43 % 128;
                            if (i43 % 2 != 0) {
                                int i44 = 46 / 0;
                                if (((ContextWrapper) applicationContext2).getBaseContext() != null) {
                                    applicationContext2 = applicationContext2.getApplicationContext();
                                } else {
                                    applicationContext2 = null;
                                }
                            } else if (((ContextWrapper) applicationContext2).getBaseContext() != null) {
                                applicationContext2 = applicationContext2.getApplicationContext();
                            } else {
                                applicationContext2 = null;
                            }
                        } else {
                            applicationContext2 = applicationContext2.getApplicationContext();
                        }
                    }
                    Object[] objArr31 = new Object[1];
                    c(82 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 16 - Color.blue(0), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr31);
                    Class<?> cls8 = Class.forName((String) objArr31[0]);
                    Object[] objArr32 = new Object[1];
                    c((Process.myPid() >> 22) + 97, ExpandableListView.getPackedPositionGroup(0L) + 16, (char) (10087 - TextUtils.indexOf((CharSequence) "", '0')), objArr32);
                    Object[] objArr33 = {applicationContext2, Integer.valueOf(((Integer) cls8.getMethod((String) objArr32[0], Object.class).invoke(null, this)).intValue()), 0, 1308968028};
                    byte[] bArr6 = $$d;
                    byte b4 = bArr6[44];
                    byte b5 = b4;
                    Object[] objArr34 = new Object[1];
                    d(b4, b5, b5, objArr34);
                    Class<?> cls9 = Class.forName((String) objArr34[0]);
                    Object[] objArr35 = new Object[1];
                    d((byte) (-bArr6[7]), (byte) 39, (byte) 31, objArr35);
                    objArr2 = (Object[]) cls9.getMethod((String) objArr35[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr33);
                    if (applicationContext2 != null) {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                            char c = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 2267;
                            int threadPriority = 33 - ((Process.getThreadPriority(0) + 20) >> 6);
                            Object[] objArr36 = new Object[1];
                            a((byte) 37, (byte) 15, $$a[5], objArr36);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(c, maxKeyCode, threadPriority, -654680577, false, (String) objArr36[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).set(null, objArr2);
                        try {
                            Object[] objArr37 = new Object[1];
                            c(View.combineMeasuredStates(0, 0), TextUtils.getOffsetAfter("", 0) + 22, (char) (43488 - TextUtils.lastIndexOf("", '0', 0)), objArr37);
                            Class<?> cls10 = Class.forName((String) objArr37[0]);
                            Object[] objArr38 = new Object[1];
                            c((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 22, 15 - (KeyEvent.getMaxKeyCode() >> 16), (char) (TextUtils.lastIndexOf("", '0') + 9163), objArr38);
                            long jLongValue4 = ((Long) cls10.getDeclaredMethod((String) objArr38[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf3 = Long.valueOf(jLongValue4);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                                char c2 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
                                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2267;
                                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 34;
                                byte[] bArr7 = $$a;
                                byte b6 = bArr7[7];
                                Object[] objArr39 = new Object[1];
                                a(b6, b6, bArr7[5], objArr39);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(c2, minimumFlingVelocity, iIndexOf2, -874156483, false, (String) objArr39[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).set(null, lValueOf3);
                            Long lValueOf4 = Long.valueOf(jLongValue4 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                                char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                                int pressedStateDuration = 2267 - (ViewConfiguration.getPressedStateDuration() >> 16);
                                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 33;
                                byte[] bArr8 = $$a;
                                Object[] objArr40 = new Object[1];
                                a((byte) 89, bArr8[7], bArr8[5], objArr40);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cKeyCodeFromString, pressedStateDuration, scrollBarFadeDuration, -887667012, false, (String) objArr40[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, lValueOf4);
                        } catch (Exception unused2) {
                            throw new RuntimeException();
                        }
                    }
                }
                int i45 = ((int[]) objArr2[3])[0];
                int i46 = ((int[]) objArr2[0])[0];
                if (i46 == i45) {
                    int i47 = b + 23;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i47 % 128;
                    int i48 = i47 % 2;
                    Object[] objArr41 = {new int[]{i}, strArr, new int[1], new int[]{i}};
                    int i49 = ((int[]) objArr2[2])[0];
                    int i50 = ((int[]) objArr2[0])[0];
                    int i51 = ((int[]) objArr2[3])[0];
                    String[] strArr3 = (String[]) objArr2[1];
                    int iIdentityHashCode4 = System.identityHashCode(this);
                    int i52 = i49 + (((~((-120117850) | iIdentityHashCode4)) | 671293442) * 449) + 1184284486 + (((~((~iIdentityHashCode4) | (-120117850))) | 671293442) * 449);
                    int i53 = (i52 << 13) ^ i52;
                    int i54 = i53 ^ (i53 >>> 17);
                    ((int[]) objArr41[2])[0] = i54 ^ (i54 << 5);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    String[] strArr4 = (String[]) objArr2[1];
                    if (strArr4 != null) {
                        int i55 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 79;
                        b = i55 % 128;
                        int i56 = i55 % 2;
                        int i57 = 0;
                        while (i57 < strArr4.length) {
                            int i58 = b + 117;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i58 % 128;
                            if (i58 % 2 != 0) {
                                arrayList2.add(strArr4[i57]);
                                i57 += 126;
                            } else {
                                arrayList2.add(strArr4[i57]);
                                i57++;
                            }
                        }
                    }
                    int[] iArr = new int[i46];
                    int i59 = i46 - 1;
                    iArr[i59] = 1;
                    Toast.makeText((Context) null, iArr[((i46 * i59) % 2) - 1], 1).show();
                    Object[] objArr42 = {new int[]{i}, strArr, new int[1], new int[]{i}};
                    int i60 = ((int[]) objArr2[2])[0];
                    int i61 = ((int[]) objArr2[0])[0];
                    int i62 = ((int[]) objArr2[3])[0];
                    String[] strArr5 = (String[]) objArr2[1];
                    int iUptimeMillis = (int) SystemClock.uptimeMillis();
                    int i63 = ~iUptimeMillis;
                    int i64 = i60 + 1350330226 + (((~((-645713677) | i63)) | 642302472) * 98) + (((~(i63 | (-162999640))) | (-645713677) | (~(162999639 | iUptimeMillis))) * (-49)) + (((~(iUptimeMillis | (-645713677))) | (-805302112)) * 49);
                    int i65 = (i64 << 13) ^ i64;
                    int i66 = i65 ^ (i65 >>> 17);
                    ((int[]) objArr42[2])[0] = i66 ^ (i66 << 5);
                }
                return DisposableHelper.TuitionPaymentFragmentbindingInflater1(get());
            }

            @Override // defpackage.BufferProviderState
            public final void dispose() {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 17;
                b = i2 % 128;
                int i3 = i2 % 2;
                DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
                int i4 = b + 67;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                int i5 = i4 % 2;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(byte r7, int r8, byte r9) {
                /*
                    int r7 = r7 * 2
                    int r7 = r7 + 1
                    byte[] r0 = io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber.InnerObserver.$$c
                    int r9 = r9 * 3
                    int r9 = r9 + 109
                    int r8 = r8 * 3
                    int r8 = 3 - r8
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r3 = r7
                    r9 = r8
                    r4 = r2
                    goto L2c
                L17:
                    r3 = r2
                L18:
                    int r4 = r3 + 1
                    byte r5 = (byte) r9
                    r1[r3] = r5
                    int r8 = r8 + 1
                    if (r4 != r7) goto L27
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    return r7
                L27:
                    r3 = r0[r8]
                    r6 = r9
                    r9 = r8
                    r8 = r6
                L2c:
                    int r8 = r8 + r3
                    r3 = r4
                    r6 = r9
                    r9 = r8
                    r8 = r6
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber.InnerObserver.$$g(byte, int, byte):java.lang.String");
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
        
            if (r1 == Integer.MAX_VALUE) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
        
            r4.b(Long.MAX_VALUE);
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        
            r4.b(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
        
            if (r1 == Integer.MAX_VALUE) goto L12;
         */
        @Override // defpackage.VideoRecordEventPause, defpackage.AudioConfig
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(defpackage.OutputTransform r4) {
            /*
                r3 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber.TuitionPaymentFragmentspecialinlinedviewModeldefault1
                int r1 = r1 + 101
                int r2 = r1 % 128
                io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber.TuitionPaymentFragmentbindingInflater1 = r2
                int r1 = r1 % r0
                OutputTransform r1 = r3.upstream
                boolean r1 = io.reactivex.internal.subscriptions.SubscriptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r1, r4)
                r1 = r1 ^ 1
                if (r1 == 0) goto L17
                goto L4d
            L17:
                int r1 = io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber.TuitionPaymentFragmentspecialinlinedviewModeldefault1
                int r1 = r1 + 113
                int r2 = r1 % 128
                io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber.TuitionPaymentFragmentbindingInflater1 = r2
                int r1 = r1 % r0
                r0 = 2147483647(0x7fffffff, float:NaN)
                if (r1 != 0) goto L35
                r3.upstream = r4
                AudioConfig<? super R> r1 = r3.downstream
                r1.b(r3)
                int r1 = r3.maxConcurrency
                r2 = 30
                int r2 = r2 / 0
                if (r1 != r0) goto L49
                goto L40
            L35:
                r3.upstream = r4
                AudioConfig<? super R> r1 = r3.downstream
                r1.b(r3)
                int r1 = r3.maxConcurrency
                if (r1 != r0) goto L49
            L40:
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r4.b(r0)
                return
            L49:
                long r0 = (long) r1
                r4.b(r0)
            L4d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber.b(OutputTransform):void");
        }

        @Override // defpackage.AudioConfig
        public final void onNext(T t) {
            int i = 2 % 2;
            try {
                VideoSpecBuilder videoSpecBuilder = (VideoSpecBuilder) share.b(this.mapper.apply(t), "The mapper returned a null MaybeSource");
                this.active.getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (!(!this.cancelled)) {
                    return;
                }
                int i2 = TuitionPaymentFragmentbindingInflater1 + 125;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 27 / 0;
                    if (!this.set.TuitionPaymentFragmentspecialinlinedviewModeldefault3(innerObserver)) {
                        return;
                    }
                } else if (!this.set.TuitionPaymentFragmentspecialinlinedviewModeldefault3(innerObserver)) {
                    return;
                }
                videoSpecBuilder.TuitionPaymentFragmentbindingInflater1(innerObserver);
                int i4 = TuitionPaymentFragmentbindingInflater1 + 67;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 4 / 4;
                }
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                this.upstream.b();
                onError(th);
            }
        }

        private static void c(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
            long j;
            int i4 = 2 % 2;
            setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
            char[] cArr2 = new char[i2];
            setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                int i5 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3290, 31 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1199271174, false, $$e(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((-1) - MotionEvent.axisFromString("")), 651 - (ViewConfiguration.getFadingEdgeLength() >> 16), 44 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -450685997, false, $$e(b3, b4, b4), new Class[]{Object.class, Object.class});
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
            if (i3 > 0) {
                int i6 = $11 + 39;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i3;
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr2, 0, cArr3, 0, i2);
                System.arraycopy(cArr3, 0, cArr2, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
            }
            if (!(!z)) {
                int i8 = $11 + 35;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char[] cArr4 = new char[i2];
                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    int i10 = $10 + 21;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 * i2];
                        Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) KeyEvent.keyCodeFromString(""), (-16776565) - Color.rgb(0, 0, 0), 43 - ((byte) KeyEvent.getModifierMetaStateMask()), -450685997, false, $$e(b5, b6, b6), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                    } else {
                        cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i2 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                        Object[] objArr5 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            j = 0;
                            byte b7 = (byte) 0;
                            byte b8 = b7;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.indexOf("", "") + 651, 45 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -450685997, false, $$e(b7, b8, b8), new Class[]{Object.class, Object.class});
                        } else {
                            j = 0;
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                    }
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0037  */
        @Override // defpackage.AudioConfig
        public final void onError(Throwable th) {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            this.active.decrementAndGet();
            if (!ExceptionHelper.TuitionPaymentFragmentbindingInflater1(this.errors, th)) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
                return;
            }
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 49;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 52 / 0;
                if (!this.delayErrors) {
                    this.set.dispose();
                }
            } else if (!this.delayErrors) {
                this.set.dispose();
            }
            if (getAndIncrement() == 0) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                int i6 = TuitionPaymentFragmentbindingInflater1 + 41;
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
                int i7 = i6 % 2;
            }
        }

        @Override // defpackage.AudioConfig
        public final void onComplete() {
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 31;
            TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            if (i2 % 2 == 0) {
                this.active.decrementAndGet();
                int i3 = 79 / 0;
                if (getAndIncrement() != 0) {
                    return;
                }
            } else {
                this.active.decrementAndGet();
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 91;
            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // defpackage.OutputTransform
        public final void b() throws Throwable {
            float f;
            Object[] objArr;
            int i = 2 % 2;
            int i2 = TuitionPaymentFragmentbindingInflater1 + 123;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            int i3 = i2 % 2;
            this.cancelled = true;
            this.upstream.b();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                char c = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                int modifierMetaStateMask = 650 - ((byte) KeyEvent.getModifierMetaStateMask());
                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 44;
                byte[] bArr = $$a;
                byte b = bArr[80];
                byte b2 = bArr[7];
                Object[] objArr2 = new Object[1];
                a(b, b2, (byte) (b2 | 52), objArr2);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, modifierMetaStateMask, iResolveOpacity, -459846511, false, (String) objArr2[0], null);
            }
            long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
            Object[] objArr3 = new Object[1];
            c(true, 185 - View.getDefaultSize(0, 0), 21 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 15 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), new char[]{17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2}, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(true, ExpandableListView.getPackedPositionChild(0L) + 190, ExpandableListView.getPackedPositionChild(0L) + 16, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2, new char[]{65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534, 65515, 65533, 65534, '\f', '\t'}, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                int i4 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 651;
                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 44;
                byte[] bArr2 = $$a;
                byte b3 = bArr2[7];
                Object[] objArr5 = new Object[1];
                a(b3, bArr2[80], b3, objArr5);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(threadPriority, i4, iResolveSizeAndState, -873460649, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                    int i5 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 650;
                    int capsMode = TextUtils.getCapsMode("", 0, 0) + 44;
                    byte b4 = $$a[7];
                    byte b5 = b4;
                    Object[] objArr6 = new Object[1];
                    a(b4, b5, (byte) (b5 | 37), objArr6);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveOpacity, i5, capsMode, -1595579076, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i6 = ((int[]) objArr7[2])[0];
                int i7 = ((int[]) objArr7[0])[0];
                int iIdentityHashCode = System.identityHashCode(this);
                int i8 = ~iIdentityHashCode;
                int i9 = (~(182888343 | i8)) | (-201303992) | (~(186319153 | i8));
                int i10 = 1214339675 + (((~(iIdentityHashCode | (-167903506))) | i9) * 590) + (i9 * (-1180)) + (((~((-186319154) | i8)) | (~(i8 | (-182888344)))) * 590) + 674910044;
                int i11 = (i10 << 13) ^ i10;
                int i12 = i11 ^ (i11 >>> 17);
                ((int[]) objArr[3])[0] = i12 ^ (i12 << 5);
            } else {
                try {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), AndroidCharacter.getMirror('0') + 1562, 26 - TextUtils.getTrimmedLength(""), 2145681644, false, null, new Class[0]);
                    }
                    Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), 674910044, 0};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
                        int iIndexOf = TextUtils.indexOf("", "") + 651;
                        int capsMode2 = 44 - TextUtils.getCapsMode("", 0, 0);
                        byte[] bArr3 = $$a;
                        byte b6 = bArr3[7];
                        Object[] objArr9 = new Object[1];
                        a(b6, bArr3[80], b6, objArr9);
                        f = 0.0f;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cAxisFromString, iIndexOf, capsMode2, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getEdgeSlop() >> 16), 694 - ImageFormat.getBitsPerPixel(0), (ViewConfiguration.getTapTimeout() >> 16) + 98), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 792 - TextUtils.lastIndexOf("", '0', 0, 0), 83 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), Integer.TYPE, Integer.TYPE});
                    } else {
                        f = 0.0f;
                    }
                    objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                        int defaultSize = View.getDefaultSize(0, 0) + 651;
                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 44;
                        byte b7 = $$a[7];
                        byte b8 = b7;
                        Object[] objArr10 = new Object[1];
                        a(b7, b8, (byte) (b8 | 37), objArr10);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollBarSize, defaultSize, edgeSlop, -1595579076, false, (String) objArr10[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                    try {
                        Object[] objArr11 = new Object[1];
                        c(true, (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)) + 184, 22 - (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)), (Process.myTid() >> 22) + 15, new char[]{17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2}, objArr11);
                        Class<?> cls2 = Class.forName((String) objArr11[0]);
                        Object[] objArr12 = new Object[1];
                        c(true, (ViewConfiguration.getScrollBarSize() >> 8) + 189, TextUtils.indexOf((CharSequence) "", '0', 0) + 16, View.getDefaultSize(0, 0) + 3, new char[]{65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534, 65515, 65533, 65534, '\f', '\t'}, objArr12);
                        long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                            char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                            int i13 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 650;
                            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 44;
                            byte[] bArr4 = $$a;
                            byte b9 = bArr4[7];
                            Object[] objArr13 = new Object[1];
                            a(b9, bArr4[80], b9, objArr13);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(windowTouchSlop, i13, maximumDrawingCacheSize, -873460649, false, (String) objArr13[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                            char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            int fadingEdgeLength = 651 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                            int i14 = 45 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            byte[] bArr5 = $$a;
                            byte b10 = bArr5[80];
                            byte b11 = bArr5[7];
                            Object[] objArr14 = new Object[1];
                            a(b10, b11, (byte) (b11 | 52), objArr14);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(keyRepeatTimeout, fadingEdgeLength, i14, -459846511, false, (String) objArr14[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                        int i15 = TuitionPaymentFragmentbindingInflater1 + 73;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i15 % 128;
                        if (i15 % 2 != 0) {
                            int i16 = 4 % 5;
                        }
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
            int i17 = ((int[]) objArr[0])[0];
            int i18 = ((int[]) objArr[2])[0];
            if (i18 == i17) {
                int i19 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 111;
                TuitionPaymentFragmentbindingInflater1 = i19 % 128;
                int i20 = i19 % 2;
                Object[] objArr15 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i21 = ((int[]) objArr[3])[0];
                int i22 = ((int[]) objArr[2])[0];
                int i23 = ((int[]) objArr[0])[0];
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i24 = ~((-724893943) | elapsedCpuTime);
                int i25 = 629958397 + ((721420372 | i24) * (-280)) + ((i24 | (~(721463132 | elapsedCpuTime))) * 140);
                int i26 = ~((-3473571) | elapsedCpuTime);
                int i27 = ~elapsedCpuTime;
                int i28 = i21 + i25 + (((~(i27 | 724936702)) | i26 | (~((-721420373) | i27))) * 140);
                int i29 = (i28 << 13) ^ i28;
                int i30 = i29 ^ (i29 >>> 17);
                ((int[]) objArr15[3])[0] = i30 ^ (i30 << 5);
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[1];
                if (strArr != null) {
                    int i31 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
                    TuitionPaymentFragmentbindingInflater1 = i31 % 128;
                    int i32 = i31 % 2;
                    for (String str : strArr) {
                        arrayList.add(str);
                    }
                }
                int[] iArr = new int[i18];
                int i33 = i18 - 1;
                iArr[i33] = 1;
                Toast.makeText((Context) null, iArr[((i18 * i33) % 2) - 1], 1).show();
                Object[] objArr16 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i34 = ((int[]) objArr[3])[0];
                int i35 = ((int[]) objArr[2])[0];
                int i36 = ((int[]) objArr[0])[0];
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i37 = i34 + (-572945103) + (((~(217644913 | iIdentityHashCode2)) | R.dimen.config_viewConfigurationHandwritingGestureLineMargin) * 336) + (((~(iIdentityHashCode2 | 221075723)) | 13674096) * (-168)) + (((~((~iIdentityHashCode2) | 221075723)) | 217644913) * 168);
                int i38 = (i37 << 13) ^ i37;
                int i39 = i38 ^ (i38 >>> 17);
                ((int[]) objArr16[3])[0] = i39 ^ (i39 << 5);
                int i40 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 123;
                TuitionPaymentFragmentbindingInflater1 = i40 % 128;
                int i41 = i40 % 2;
            }
            this.set.dispose();
        }

        @Override // defpackage.OutputTransform
        public final void b(long j) {
            int i = 2 % 2;
            Object obj = null;
            if (SubscriptionHelper.TuitionPaymentFragmentbindingInflater1(j)) {
                isSonyG3125.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.requested, j);
                if (getAndIncrement() == 0) {
                    int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 77;
                    TuitionPaymentFragmentbindingInflater1 = i2 % 128;
                    if (i2 % 2 == 0) {
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                        throw null;
                    }
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                }
            }
            int i3 = TuitionPaymentFragmentbindingInflater1 + 97;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        final createMediaMuxer<R> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            createMediaMuxer<R> createmediamuxer;
            Object obj;
            int i = 2 % 2;
            do {
                createMediaMuxer<R> createmediamuxer2 = this.queue.get();
                if (createmediamuxer2 == null) {
                    createmediamuxer = new createMediaMuxer<>(VideoRecordEvent.b());
                    obj = null;
                } else {
                    int i2 = TuitionPaymentFragmentbindingInflater1 + 87;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                    int i3 = i2 % 2;
                    return createmediamuxer2;
                }
            } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.queue, null, createmediamuxer));
            int i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i5 = i4 + 87;
            TuitionPaymentFragmentbindingInflater1 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 71;
            TuitionPaymentFragmentbindingInflater1 = i7 % 128;
            if (i7 % 2 != 0) {
                return createmediamuxer;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:101:0x0177  */
        /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:27:0x006d  */
        /* JADX WARN: Code duplicated, block: B:59:0x00dc  */
        /* JADX WARN: Code duplicated, block: B:72:0x0114  */
        /* JADX WARN: Code duplicated, block: B:75:0x0120  */
        /* JADX WARN: Code duplicated, block: B:76:0x0122  */
        /* JADX WARN: Code duplicated, block: B:79:0x012b  */
        /* JADX WARN: Code duplicated, block: B:81:0x0136  */
        /* JADX WARN: Code duplicated, block: B:82:0x013b  */
        /* JADX WARN: Code duplicated, block: B:85:0x0142  */
        /* JADX WARN: Code duplicated, block: B:86:0x0144  */
        /* JADX WARN: Code duplicated, block: B:91:0x0154  */
        /* JADX WARN: Code duplicated, block: B:93:0x015c  */
        /* JADX WARN: Code duplicated, block: B:95:0x0167  */
        /* JADX WARN: Code duplicated, block: B:97:0x016f  */
        /* JADX WARN: Code duplicated, block: B:99:0x0173  */
        final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            createMediaMuxer<R> createmediamuxer;
            boolean z;
            createMediaMuxer<R> createmediamuxer2;
            boolean z2;
            int i;
            Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i2;
            int i3;
            int i4;
            boolean z3;
            int i5 = 2 % 2;
            AudioConfig<? super R> audioConfig = this.downstream;
            AtomicInteger atomicInteger = this.active;
            AtomicReference<createMediaMuxer<R>> atomicReference = this.queue;
            int iAddAndGet = 1;
            do {
                long j = this.requested.get();
                long j2 = 0;
                while (j2 != j) {
                    if (!this.cancelled) {
                        if (!this.delayErrors) {
                            int i6 = TuitionPaymentFragmentbindingInflater1 + 35;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i6 % 128;
                            int i7 = i6 % 2;
                            if (this.errors.get() != null) {
                                Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.errors);
                                createMediaMuxer<R> createmediamuxer3 = this.queue.get();
                                if (createmediamuxer3 != null) {
                                    createmediamuxer3.TuitionPaymentFragmentbindingInflater1();
                                }
                                audioConfig.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                return;
                            }
                        }
                        if (atomicInteger.get() == 0) {
                            int i8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 107;
                            TuitionPaymentFragmentbindingInflater1 = i8 % 128;
                            if (i8 % 2 == 0) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                        } else {
                            z3 = false;
                        }
                        createMediaMuxer<R> createmediamuxer4 = atomicReference.get();
                        Absent absentTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createmediamuxer4 != null ? createmediamuxer4.TuitionPaymentFragmentspecialinlinedviewModeldefault2() : null;
                        boolean z4 = absentTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null;
                        if (z3) {
                            int i9 = TuitionPaymentFragmentbindingInflater1 + 45;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 % 128;
                            int i10 = i9 % 2;
                            if (z4) {
                                Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault4 = ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.errors);
                                if (thTuitionPaymentFragmentspecialinlinedviewModeldefault4 != null) {
                                    audioConfig.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault4);
                                    return;
                                } else {
                                    audioConfig.onComplete();
                                    return;
                                }
                            }
                        }
                        if (z4) {
                            break;
                        }
                        int i11 = TuitionPaymentFragmentbindingInflater1 + 119;
                        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i11 % 128;
                        if (i11 % 2 != 0) {
                            audioConfig.onNext(absentTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        } else {
                            audioConfig.onNext(absentTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            j2++;
                        }
                    } else {
                        createMediaMuxer<R> createmediamuxer5 = this.queue.get();
                        if (createmediamuxer5 != null) {
                            createmediamuxer5.TuitionPaymentFragmentbindingInflater1();
                            return;
                        }
                        return;
                    }
                }
                if (j2 == j) {
                    int i12 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 35;
                    TuitionPaymentFragmentbindingInflater1 = i12 % 128;
                    if (i12 % 2 == 0) {
                        int i13 = 58 / 0;
                        if (this.cancelled) {
                            createmediamuxer = this.queue.get();
                            if (createmediamuxer != null) {
                                createmediamuxer.TuitionPaymentFragmentbindingInflater1();
                                return;
                            }
                            return;
                        }
                        if (this.delayErrors && this.errors.get() != null) {
                            Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault5 = ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.errors);
                            createMediaMuxer<R> createmediamuxer6 = this.queue.get();
                            if (createmediamuxer6 != null) {
                                int i14 = TuitionPaymentFragmentbindingInflater1 + 91;
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i14 % 128;
                                int i15 = i14 % 2;
                                createmediamuxer6.TuitionPaymentFragmentbindingInflater1();
                            }
                            audioConfig.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault5);
                            return;
                        }
                        if (atomicInteger.get() == 0) {
                            i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
                            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                            if (i4 % 2 == 0) {
                                z = false;
                            } else {
                                z = true;
                            }
                        } else {
                            z = false;
                        }
                        createmediamuxer2 = atomicReference.get();
                        if (createmediamuxer2 != null) {
                            i3 = TuitionPaymentFragmentbindingInflater1 + 3;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                            if (i3 % 2 != 0) {
                                createmediamuxer2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            } else if (createmediamuxer2.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                                z2 = false;
                            }
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        if (z && z2) {
                            i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
                            TuitionPaymentFragmentbindingInflater1 = i % 128;
                            if (i % 2 != 0) {
                                ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.errors);
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.errors);
                            if (thTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                                audioConfig.onComplete();
                                return;
                            }
                            i2 = TuitionPaymentFragmentbindingInflater1 + 43;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                            if (i2 % 2 != 0) {
                                audioConfig.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                return;
                            } else {
                                audioConfig.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                int i16 = 37 / 0;
                                return;
                            }
                        }
                    } else {
                        if (this.cancelled) {
                            createmediamuxer = this.queue.get();
                            if (createmediamuxer != null) {
                                createmediamuxer.TuitionPaymentFragmentbindingInflater1();
                                return;
                            }
                            return;
                        }
                        if (this.delayErrors) {
                        }
                        if (atomicInteger.get() == 0) {
                            i4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 5;
                            TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                            if (i4 % 2 == 0) {
                                z = false;
                            } else {
                                z = true;
                            }
                        } else {
                            z = false;
                        }
                        createmediamuxer2 = atomicReference.get();
                        if (createmediamuxer2 != null) {
                            i3 = TuitionPaymentFragmentbindingInflater1 + 3;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                            if (i3 % 2 != 0) {
                                createmediamuxer2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                            } else if (createmediamuxer2.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                                z2 = false;
                            }
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        if (z) {
                            i = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 67;
                            TuitionPaymentFragmentbindingInflater1 = i % 128;
                            if (i % 2 != 0) {
                                ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.errors);
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.errors);
                            if (thTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                                audioConfig.onComplete();
                                return;
                            }
                            i2 = TuitionPaymentFragmentbindingInflater1 + 43;
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                            if (i2 % 2 != 0) {
                                audioConfig.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                return;
                            } else {
                                audioConfig.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                int i17 = 37 / 0;
                                return;
                            }
                        }
                    }
                }
                if (j2 != 0) {
                    isSonyG3125.b(this.requested, j2);
                    if (this.maxConcurrency != Integer.MAX_VALUE) {
                        this.upstream.b(j2);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(int r5, short r6, int r7) {
            /*
                int r7 = r7 + 119
                int r6 = r6 * 2
                int r6 = r6 + 4
                byte[] r0 = io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber.$$c
                int r5 = r5 * 3
                int r5 = 1 - r5
                byte[] r1 = new byte[r5]
                r2 = 0
                if (r0 != 0) goto L14
                r4 = r5
                r3 = r2
                goto L24
            L14:
                r3 = r2
            L15:
                byte r4 = (byte) r7
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r5) goto L22
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                return r5
            L22:
                r4 = r0[r6]
            L24:
                int r4 = -r4
                int r7 = r7 + r4
                int r6 = r6 + 1
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe.FlatMapMaybeSubscriber.$$e(int, short, int):java.lang.String");
        }
    }
}
